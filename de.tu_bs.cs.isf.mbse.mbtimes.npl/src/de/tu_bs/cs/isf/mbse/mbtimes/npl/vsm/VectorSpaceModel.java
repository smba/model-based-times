package de.tu_bs.cs.isf.mbse.mbtimes.npl.vsm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringJoiner;

import org.apache.commons.lang3.StringUtils;

import edu.ucla.sspace.common.Similarity;
import edu.ucla.sspace.common.Similarity.SimType;
import edu.ucla.sspace.matrix.AtomicGrowingSparseMatrix;
import edu.ucla.sspace.matrix.Matrix;
import edu.ucla.sspace.text.EnglishStemmer;
import edu.ucla.sspace.text.GermanStemmer;
import edu.ucla.sspace.text.Stemmer;
import edu.ucla.sspace.vector.CompactSparseVector;
import edu.ucla.sspace.vector.DoubleVector;
import edu.ucla.sspace.vector.ScaledDoubleVector;

/**
 * Das Vector Space Model ist ein Werkzeug, um Artikel nach Ähnlichkeit 
 * zu durchsuchen.
 */
public class VectorSpaceModel {
	
	/** Similarity type, default should be COSINE */
	private static final SimType SIMILARITY_TYPE = SimType.COSINE;
	
	/**	(stemmed) list of documents; the document corpus */
	final private ArrayList<String> documents;
	
	/** Matrix for the tf-idf values */
	final private Matrix documentMatrix;
	
	/** Bag of words; set of all words */
	final private List<String> bagOfWords;
	
	private final Stemmer stemmer;
	private Map<Integer, Double> mapSimilarities;
	
	/**
	 * The constructor requires a language code in order to 
	 * instantiate an appropriate Stemmer. 
	 * 
	 * @param languageCode DE or EN for German or English respectively.
	 */
	public VectorSpaceModel(String languageCode) {

		documents = new ArrayList<String>();
		bagOfWords = new LinkedList<String>();
		documentMatrix = new AtomicGrowingSparseMatrix();
		mapSimilarities = new HashMap<Integer, Double>();
		
		// Create the Stemmer instance
		stemmer = (languageCode.equals("DE")) ? new GermanStemmer() : new EnglishStemmer();
	}

	/**
	 * Loads the document corpus which is to be searched.
	 *  
	 * @param docs List of documents, the corpus to search.
	 */
	public void buildDocumentVectors(List<String> docs) {

		/**
		 * For each document, stem the words
		 */
		/*
		for (String document : docs) {
			StringJoiner joiner = new StringJoiner(" ");
			for (String term : document.split(" ")) {
				joiner.add(stemmer.stem(term));
			}
			this.documents.add(joiner.toString());
		}
		*/
		this.documents.addAll(docs);

		/** Matrix for the TF values */
		final Matrix tfMatrix = new AtomicGrowingSparseMatrix();

		/**
		 * Construct the bag of words for the given set of documents
		 */
		final Set<String> temporarySetOfWords = new HashSet<String>();
		for (String document : documents) {
			for (String term : document.split(" ")) {

				// word needs to be stemmed
				temporarySetOfWords.add( term.toLowerCase() );
			}
		}
		bagOfWords.addAll(temporarySetOfWords);

		/**
		 * Get the TF [term frequency] values
		 */
		for (int j = 0; j < documents.size(); j++) {
			final DoubleVector tfVector;
			final double[] tempTfVector = new double[bagOfWords.size()];

			for (int i = 0; i < bagOfWords.size(); i++) {
				final int o;
				o = StringUtils.countMatches(documents.get(j).toLowerCase(), bagOfWords.get(i));
				tempTfVector[i] = (double) o;
			}
			tfVector = new CompactSparseVector(tempTfVector);
			tfMatrix.setRow(j, tempTfVector);
		}

		/**
		 * Get IDF vector
		 */
		final DoubleVector idfVector;
		final double[] tempIdfVector = new double[bagOfWords.size()];
		for (int k = 0; k < bagOfWords.size(); k++) {
			int count = 0;
			for (String document : documents) {
				if (document.toLowerCase().contains(bagOfWords.get(k))) {
					count += 1;
				}
			}
			tempIdfVector[k] = Math.log10(documents.size() / (double) count);
		}
		idfVector = new CompactSparseVector(tempIdfVector);

		/**
		 * Construct TF-IDF Vectors / Matrix
		 */
		for (int l = 0; l < tfMatrix.rows(); l++) {

			DoubleVector tfIdfVector = new CompactSparseVector();
			double[] tempTfIdfVector = new double[bagOfWords.size()];

			// l läuft für Documents
			for (int m = 0; m < tfMatrix.columns(); m++) {
				double w = tfMatrix.getRowVector(l).get(m) * idfVector.get(m);
				tempTfIdfVector[m] = w;
			}

			tfIdfVector = new CompactSparseVector(tempTfIdfVector);

			// Normalize the vector
			tfIdfVector = new ScaledDoubleVector(tfIdfVector, 1.0 / tfIdfVector.magnitude());

			// Add vector to matrix
			documentMatrix.setRow(l, tfIdfVector);
		}
	}

	public Map<Integer, Integer> computeSimilarities(DoubleVector queryV) {
		
		Map<Integer, Double> map = new HashMap<Integer, Double>();
		for (int i = 0; i < documentMatrix.rows(); i++) {
			
			DoubleVector dv = documentMatrix.getRowVector(i);

			/*
			 * Calculate the similarity; if the similarity, however, 
			 * yields a NaN (not a number) result, we continue with 
			 * a similarity of 0.0 since NaN causes trouble.
			 */
			Double similarity = Similarity.getSimilarity(SIMILARITY_TYPE, queryV, dv);
			similarity = (similarity.toString().equals("NaN")) ? 0.0 : similarity;

			map.put(i, similarity);
		}

		// backup map
		Map<Integer, Double> mapBackup = new HashMap<Integer, Double>();
		for (Integer key : map.keySet()) {
			mapBackup.put(key, map.get(key));
		}

		// sort map
		Map<Integer, Integer> sortedMap = new HashMap<Integer, Integer>();
		int counter = 0;

		while (!map.isEmpty()) {

			int maxPosition = 0;
			double maxValue = -1;

			for (Integer key : map.keySet()) {

				if (map.get(key) > maxValue) {

					maxValue = map.get(key);
					maxPosition = key;
				}
			}

			map.remove(maxPosition);

			sortedMap.put(counter, maxPosition);

			counter++;
		}

		// TODO remove
		for (Integer key : sortedMap.keySet()) {
			System.out.println(key + 1 + ".: Text #" + sortedMap.get(key) + " with similarity of "
					+ mapBackup.get(sortedMap.get(key)));
		}
		map = mapBackup;
		mapSimilarities = map;
		return sortedMap;

	}

	public double getSimilarity(int key) {
		return mapSimilarities.get(key);
	}

	public DoubleVector getQueryVector(List<String> queryStrings) {

		List<String> queryLowercase = new LinkedList<String>();
		for (String s : queryStrings) {
			queryLowercase.add(s.toLowerCase());
		}
		queryStrings = queryLowercase;

		final DoubleVector tfVector;
		final double[] tempTfVector = new double[bagOfWords.size()];

		for (int i = 0; i < bagOfWords.size(); i++) {
			final double o;
			o = (queryStrings.contains(bagOfWords.get(i)) ? 1.0 : 0.0);
			tempTfVector[i] = o;
		}
		tfVector = new CompactSparseVector(tempTfVector);
		return new ScaledDoubleVector(tfVector, 1.0 / tfVector.magnitude());
	}
}