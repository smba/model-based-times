package de.tu_bs.cs.isf.mbse.topic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

import edu.ucla.sspace.common.Similarity;
import edu.ucla.sspace.common.Similarity.SimType;
import edu.ucla.sspace.matrix.AtomicGrowingSparseMatrix;
import edu.ucla.sspace.matrix.Matrix;
import edu.ucla.sspace.text.Stemmer;
import edu.ucla.sspace.vector.CompactSparseVector;
import edu.ucla.sspace.vector.DoubleVector;
import edu.ucla.sspace.vector.ScaledDoubleVector;

/**
 * 
 * @author Stefan Mühlbauer <s.muehlbauer@tu-bs.de>
 *
 */
public class VectorSpaceModel {

	private static final SimType SIMILARITY_TYPE = SimType.COSINE;

	final private ArrayList<String> documents;
	final private Matrix documentMatrix;
	final private List<String> bagOfWords;

	protected Stemmer stemmer;

	public VectorSpaceModel() {
		documents = new ArrayList<String>();
		bagOfWords = new LinkedList<String>();
		documentMatrix = new AtomicGrowingSparseMatrix();
	}

	public void buildDocumentVectors(List<String> docs) {

		this.documents.addAll(docs);

		final Matrix tfMatrix = new AtomicGrowingSparseMatrix();
		/**
		 * Construct the bag of words for the given set of documents
		 */
		final Set<String> temporarySetOfWords = new HashSet<String>();
		for (String document : documents) {
			for (String term : document.split(" ")) {
				temporarySetOfWords.add(term.toLowerCase());
			}
		}

		bagOfWords.addAll(temporarySetOfWords);
		// assert (bagOfWords.size() > 0);

		/**
		 * Get the TF values
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
		// assert (
		// (documents.size() == tfMatrix.rows()) &&
		// (bagOfWords.size() == tfMatrix.columns()));

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

	public void testMethod() {
		
	}


	public Map<Integer, Integer> computeSimilarities(DoubleVector queryV) {
		Map<Integer, Double> map = new HashMap<Integer, Double>();
		for (int i = 0; i < documentMatrix.rows(); i++) {
			DoubleVector dv = documentMatrix.getRowVector(i);
			map.put(i, Similarity.getSimilarity(SIMILARITY_TYPE, queryV, dv));
		}

		// backup map
		Map<Integer, Double> mapBackup = new HashMap<Integer, Double>();
		for (Integer key : map.keySet()) {
			mapBackup.put(key,map.get(key));
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

		// misc
		for (Integer key: sortedMap.keySet()) {
			System.out.println(key + 1 + ".: Text #" + sortedMap.get(key) + " with similarity of " + mapBackup.get(sortedMap.get(key)));
		}
		map = mapBackup;
		return sortedMap;

	}

	public static void main(String[] args) {
		List<String> docs = new ArrayList<String>();
		docs.add(
				"Birmingham New Street ist der Hauptbahnhof der britischen Stadt Birmingham. Er befindet sich im Stadtzentrum an der West Coast Main Line und ist einer der wichtigsten Knotenpunkte des britischen Schienennetzes. Aufgrund seiner zentralen Lage fahren Züge aus verschiedenen Teilen des Landes diesen Bahnhof an. Ziele sind unter anderem London, Liverpool, Manchester, Schottland, Cardiff, Nordwales, Bristol, Penzance, Nottingham, Leicester, Shrewsbury und Newcastle upon Tyne. Der Bahnhof ist auch Endstation mehrerer Vorortslinien in der Region West Midlands, die beispielsweise nach Lichfield und Redditch führen.");
		docs.add(
				"Die Spur des Windes – Das letzte große Abenteuer ist der Titel eines Abenteuerfilms, der 1993 von Amblin Entertainment und Walt Disney Pictures produziert wurde. Für die heute international bekannte Schauspielerin Reese Witherspoon bedeutete dieser Film den Durchbruch.");
		docs.add(
				"Wegen der guten Luft ist Marcelo Mendez vor ein paar Jahren mit seiner Familie aufs Land gezogen – doch die Landluft, da sind sich Mendez und die Ärzte inzwischen sicher, macht seine Frau und die beiden Töchter krank. Das Haus der Familie liegt zwischen riesigen Sojafeldern, die aus Lastwagen und Flugzeugen großflächig mit Pestiziden besprüht werden. Darunter ist Glyphosat.");

		VectorSpaceModel vsm = new VectorSpaceModel();
		vsm.buildDocumentVectors(docs);

		List<String> query = new LinkedList<String>();
		query.add("Marcelo");
		query.add("Luft");
		query.add("Titel");

		DoubleVector queryV = vsm.getQueryVector(query);
		vsm.computeSimilarities(queryV);
	}

	// TODO remove
	public Matrix getDocumentMatrix() {
		return documentMatrix;
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