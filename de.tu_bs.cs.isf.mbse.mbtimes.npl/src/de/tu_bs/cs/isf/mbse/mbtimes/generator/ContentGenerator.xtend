package de.tu_bs.cs.isf.mbse.mbtimes.generator

import UnifiedModel.Article
import UnifiedModel.NewsChannel
import UnifiedModel.UnifiedModelPackage
import de.tu_bs.cs.isf.mbse.mbtimes.crawler.feedparser.ImageDownloader
import de.tu_bs.cs.isf.mbse.mbtimes.crawler.unifiedParser.UnifiedFileParser
import de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration
import de.tu_bs.cs.isf.mbse.mbtimes.npl.vsm.VectorSpaceModel
import java.text.SimpleDateFormat
import java.util.ArrayList
import java.util.Collections
import java.util.LinkedList
import java.util.List
import java.util.Map
import java.util.StringTokenizer
import org.apache.commons.lang3.StringUtils
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

class ContentGenerator {

	// Special Characters in LaTeX and the changed version
	static val String[] specialChars = #['\\', '{', '}', '%', '^', '_', '&', '#', '~', '�', '�', '�', " . ", " , ",
		"\""]
	static val String[] changedChars = #["\\textbackslash", "\\{", "\\}", "\\%", "\\textasciicircum", "\\_", "\\&",
		"\\#", "\\textasciitilde", "$^\\circ$", "\\pounds", "", ". ", ", ", "\"{}"]

	def ContentGenerator() {
	}

	def static void main(String[] args) {
		val x = new LinkedList<String>()
		x.add("berlin")
		x.add("london")

		var topicTex = new StringBuffer()
		// topicTex.append(compileTopic(x, "Berliner News"))
		println(topicTex.toString)
	}

	static var vsm = new VectorSpaceModel();

	def static void initVSM(String language) {
		val articles = new ArrayList<Article>(UnifiedFileParser.loadArticles());
		val fulltexts = new ArrayList<String>();
		for (Article a : articles) {
			fulltexts.add(a.content);
		}

		vsm = new VectorSpaceModel( /*language*/ );
		vsm.buildDocumentVectors(fulltexts);
	}

	def static String compileTopic(List<String> topic, String topicName, Declaration d) {
		val articles = new ArrayList<Article>(UnifiedFileParser.loadArticles());
		val newschannels = new ArrayList<NewsChannel>(UnifiedFileParser.loadNewsChannels());

		// index out of bound fix
		if (newschannels.size > 0) {
			println("crawled newschannel icon url: " + newschannels.get(0).icon);
			println("Newschannel-Title: " + newschannels.get(0).title)
		}

		val topicTex = new StringBuffer()

		// retreive List from articles
//	val fulltexts = new ArrayList<String>();
//	for(Article a : articles) {
//		fulltexts.add(a.content);
//	}
//	var String language = null
//	if (d.language != null && d.language.value.equals("English")) {
//		language = "EN"
//	} else if (d.language != null && d.language.value.equals("German")) {
//		language = "DE"
//	}
//		
//	
//  	val vsm = new VectorSpaceModel( /*language*/ );
//  	vsm.buildDocumentVectors(fulltexts);
//  	
		System.err.println("VSM computing similarities");

		val ranking = vsm.computeSimilarities(vsm.getQueryVector(topic));

		System.err.println("VSM computed similarities");

		// topicTex.append("\\headline{{\\bfseries\\Huge " + topicName + "}\\linebreak\\medskip")
		var tags = topic.get(0)
		for (var i = 1; i < topic.size(); i++) {
			tags += ", " + topic.get(i)
		}
		// topicTex.append("{\\footnotesize{\\bfseries Tags: }{\\it " + str + "}}}")
		// topicTex.append("\\begin{multicols}{\\numberColumns}")
		val headline = '''
			\headline{{\bfseries\Huge «topicName»}\\
			\medskip
			{\footnotesize{\bfseries Tags: }{\it «tags»}}}
			\begin{multicols}{\numberColumns}
			
		'''
		topicTex.append(headline)

		// calculate median of similarities for article selection
		var median = medianOfSimilarities(ranking, d.articleCnt)

		println("Median: " + median)

		var language = ""
		if (d.language != null) {
			language = d.language.value
		}

		var k = d.articleCnt
		var cntArticles = 0
		for (var i = 0; i < k && i < ranking.size(); i++) {
			val article = articles.get(ranking.get(i))
			var countTags = 0;
			for (var t = 0; t < topic.size(); t++) {
				countTags += StringUtils.countMatches(article.content, topic.get(t))
			}
			if (vsm.getSimilarity(ranking.get(i)) >= median) {
				val st = new StringTokenizer(article.content)

				var imagesCount = 0
				if (d.imagesCnt != null) {
					imagesCount = d.imagesCnt.value
				}

				if (st.countTokens() >= d.articleWordsMin && st.countTokens() <= d.articleWordsMax) {

					topicTex.append(compileArticle(article, topic, language, imagesCount))
					cntArticles++

					println("Title:\t\t" + article.title)
					println("numberWords:\t" + st.countTokens())
					println("countTags:\t" + countTags)
					println("Similarity:\t" + vsm.getSimilarity(ranking.get(i)))
					println()
				} else {
					k++
				}
			} else {
				k = 0
			}
		}
		val str = "\\bigskip\\bigskip"
		if(topicTex.lastIndexOf(str) >= 0) {
			topicTex.delete(topicTex.lastIndexOf(str), topicTex.lastIndexOf(str) + str.length)
		}
		topicTex.append("\\end{multicols}\n")
		if (k == 0) {
			topicTex.append("\\begin{center}")
			if (d.language != null && d.language.value.equals("German")) {
				if (cntArticles == 0) {
					topicTex.append("{\\it\\huge Keine passenden Artikel gefunden!}")
				} else {
					topicTex.append("{\\it\\huge Keine weiteren passenden Artikel gefunden!}")
				}
			} else {
				if (cntArticles == 0) {
					topicTex.append("{\\it\\huge No suitable articles found!}")
				} else {
					topicTex.append("{\\it\\huge No other suitable articles found!}")
				}
			}
			topicTex.append("\\end{center}")
		}
		return topicTex.toString
	}

	def static double medianOfSimilarities(Map<Integer, Integer> ranking, int articleCnt) {
		val simArray = new LinkedList<Double>()
		for (var i = 0; i < ranking.size(); i++) {
			if (vsm.getSimilarity(ranking.get(i)) > 0.0) {
				simArray.add(vsm.getSimilarity(ranking.get(i)))
			}
		}
		Collections.sort(simArray)
		var median = 0.0
		if (simArray.size > 1) {
			var middle = simArray.size / 2;
			if (simArray.size % 2 == 1) {
				median = simArray.get(middle);
			} else {
				median = (simArray.get(middle - 1) + simArray.get(middle)) / 2.0;
			}
		} else if (!simArray.empty) {
			median = 0.01
		}

		if (simArray.size > articleCnt) {
			return median
		} else {
			return 0.01
		}

	}

	def static compileArticle(Article it, List<String> topic, String language, int imagesCnt) {
		var content = new String(it.content.getBytes("UTF-8"), "UTF-8")
		var subtitle = new String(it.subtitle.getBytes("UTF-8"), "UTF-8")
		if (subtitle.indexOf("<") >= 0) {
			subtitle = subtitle.substring(0, subtitle.indexOf("<"));
		}
		if (subtitle.lastIndexOf(" ") >= 0) {
			subtitle = subtitle.substring(0, subtitle.lastIndexOf(" "));
		}

		var title = new String(it.title.getBytes("UTF-8"), "UTF-8")
		var authors = ""
		if (it.author != null && it.author.size() > 0) {
			authors = new String(it.author.get(0).name.getBytes("UTF-8"), "UTF-8")
			for (var i = 1; i < it.author.size; i++) {
				authors += ", " + new String(it.author.get(i).name.getBytes("UTF-8"), "UTF-8")
			}
		}

		var newschannel = ""
		if (it.newschannel != null) {
			newschannel = new String(it.newschannel.title.getBytes("UTF-8"), "UTF-8")
		}
		
		var articleLink = it.link

		// content = new String(content.getBytes("UTF-8"),"UTF-8")
		for (var i = 0; i < specialChars.length; i++) {
			content = content.replace(specialChars.get(i), changedChars.get(i))
			subtitle = subtitle.replace(specialChars.get(i), changedChars.get(i))
			if (it.title != null) {
				title = title.replace(specialChars.get(i), changedChars.get(i))
			}
			authors = authors.replace(specialChars.get(i), changedChars.get(i))
			newschannel = newschannel.replace(specialChars.get(i), changedChars.get(i))
			articleLink = articleLink.replace(specialChars.get(i), changedChars.get(i))
		}

		while (content.indexOf("(Bild") >= 0) {
			var index = content.indexOf("(Bild");
			content = content.substring(0, index).trim() + " " +
				content.substring(content.indexOf(")", index) + 1).trim()
		}

		for (t : topic) {
			content = content.replace(t, "\\textcolor{red}{" + t + "}")
		}

		val LinkedList<String> images = new LinkedList<String>()
		// TODO Fill LinkedList images with filenames or relative paths 
		// to the pictures of the corresponding article
		val articles = new ArrayList<Article>(UnifiedFileParser.loadArticles());

		// retrieve images
		println("About to print file image names ")
			if (it.image != null) {

				var currentImages = it.image;

				for (img : it.image) {
					var String md5 = ImageDownloader.md5(img.url)
					var String mimeType = img.type;
					var String fileType = ImageDownloader.truncateMIMEType(mimeType)
					var String completeFileName = md5 + "." + fileType // this file is located in your home folder
					// TODO implement LaTeX stuff from here
					System.err.println("retreived image file name: " + completeFileName)
					images.add(completeFileName)
				}
			}

		// images.add("Carolo-Cup_03.jpg")
		// images.add("Masterbild-6969c7796e984254.jpeg")
		title = title.trim()
		newschannel = newschannel.trim()
		authors = authors.trim()

		println("Authors: " + authors)

		var date = ""
		if (it.published != null) {
			val dt = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
			date = dt.format(it.published)
		}

		'''
			\begin{minipage}{\columnwidth}
			 	«IF !authors.empty && !title.empty»
				\byline{\it\Large «title»}{«authors»}
				«ELSEIF !title.empty»
					\headline{\it\Large «title»}
					«ELSE»
						\headline{\it\Large N.N.}
						«ENDIF»
						\medskip\par
						{\bfseries «subtitle.trim()»} 
						\end{minipage}
						\medskip\par
						
						«contentWithFigures(content,images,imagesCnt)»
						
						\medskip
						\begin{minipage}{\columnwidth}
						«IF !newschannel.empty || !date.empty»
							\begin{center}
								\fbox{\parbox{0.8\columnwidth}{\footnotesize 
								\begin{tabular}{p{0.15\columnwidth}p{0.5\columnwidth}}
								«IF language.equals("German")»
									«IF !newschannel.empty»
										\textbf{Quelle:} & \href{«articleLink»}{«newschannel»}
									«ENDIF»
									«IF !newschannel.empty && !date.empty»
										\\
									«ENDIF»
									«IF !date.empty»
										\textbf{Datum:} & «date»
									«ENDIF»
								«ELSE»
									«IF !newschannel.empty»
										\textbf{Source:} & \href{«it.link.replace("#","\\#")»}{«newschannel»}
									«ENDIF»
									«IF !newschannel.empty && !date.empty»
										\\
									«ENDIF»
									«IF !date.empty»
										\textbf{Date:} & «date»
									«ENDIF»
								«ENDIF»
								\end{tabular} }}
							\end{center}
						«ENDIF»
						\closearticle
						\end{minipage}
						\bigskip\bigskip
						
					 	'''
	}

	def static String contentWithFigures(String str, LinkedList<String> images, int imagesCnt) {
		var content = str
		var split = (content.length / (images.size() + 1))

		println("Path: " + System.getProperty("user.dir"))
		for (var i = 0; i < imagesCnt && i < images.size(); i++) {
			val splitIndex = content.indexOf(".", ((i + 1) * split) - 1) + 1
			val contentFirst = content.substring(0, splitIndex).trim()
			val contentSec = "\n" + '''
				\begin{Figure}
					\includegraphics[width=\columnwidth]{../../images/«images.get(i)»}
				\end{Figure}
			'''
			val contentThird = content.substring(splitIndex).trim()
			content = contentFirst + contentSec + contentThird
		}
		return content.trim()
	}

	def doEMFSetup() {
		EPackage.Registry.INSTANCE.put(UnifiedModelPackage.eINSTANCE.nsURI, UnifiedModelPackage.eINSTANCE)
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl);
	}
}
