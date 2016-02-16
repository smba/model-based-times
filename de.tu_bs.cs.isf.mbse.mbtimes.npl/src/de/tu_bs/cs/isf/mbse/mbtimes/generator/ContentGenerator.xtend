package de.tu_bs.cs.isf.mbse.mbtimes.generator

import UnifiedModel.Article
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
import java.util.LinkedHashMap

class ContentGenerator {

	// Special Characters in LaTeX and the changed version
	//static val String[] specialChars = #['\\', '{', '}', '%', '^', '_', '&', '#', '~', '°', '$', " . ", " , ",
	//	"\""]
	//static val String[] changedChars = #["\\textbackslash", "\\{", "\\}", "\\%", "\\textasciicircum", "\\_", "\\&",
	//	"\\#", "\\textasciitilde", "$^\\circ$", "\\$", ". ", ", ", "\"{}"]

	static LinkedHashMap<String,String> specialChars

	def ContentGenerator() {
	}

	static var vsm = new VectorSpaceModel();

	def static void initSpecialCharHashMap() {
		specialChars = new LinkedHashMap <String, String>()
		specialChars.put("\\","\\textbackslash")
		specialChars.put("{","\\{")
		specialChars.put("}","\\}")
		specialChars.put("%","\\%")
		specialChars.put("^","\\textasciicircum")
		specialChars.put("_","\\_")
		specialChars.put("&","\\&")
		specialChars.put("#","\\#")
		specialChars.put("$","\\$")
		specialChars.put("~","\\textasciitilde")
		specialChars.put("°","$^\\circ$")
		specialChars.put(" .",".")
		specialChars.put(" ,",",")
		specialChars.put(" :",":")
		specialChars.put(" ;",";")
		specialChars.put(" !","!")
		specialChars.put(" ?","?")
		specialChars.put("[","{}[")
		specialChars.put("\"","\"{}")
		specialChars.put((0x0a as char).toString(), " \\\\" + (0x0a as char).toString())
		//specialChars.put((0x0d as char).toString(), "\\\\" + (0x0d as char).toString())
	}

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

		val topicTex = new StringBuffer()

		System.err.println("VSM computing similarities");

		val ranking = vsm.computeSimilarities(vsm.getQueryVector(topic));

		System.err.println("VSM computed similarities");

		var tags = topic.get(0)
		for (var i = 1; i < topic.size(); i++) {
			tags += ", " + topic.get(i)
		}

		val headline = 
			'''
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
		
		System.err.println("Compiled tex for topic " + topicName)
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
		
		content = removeHTMLTags(content).trim()
		subtitle = removeHTMLTags(subtitle).trim()
		title = removeHTMLTags(title).trim()
		
		var articleLink = it.link

		// content = new String(content.getBytes("UTF-8"),"UTF-8")
		for(key: specialChars.keySet) {
			content = content.replace(key, specialChars.get(key))
			subtitle = subtitle.replace(key, specialChars.get(key))
			if (it.title != null) {
				title = title.replace(key, specialChars.get(key))
			}
			authors = authors.replace(key, specialChars.get(key))
			newschannel = newschannel.replace(key, specialChars.get(key))
			articleLink = articleLink.replace(key, specialChars.get(key))
		}
		
		while (content.indexOf("(Bild") >= 0) {
			var index = content.indexOf("(Bild");
			content = content.substring(0, index).trim() + " " +
				content.substring(content.indexOf(")", index) + 1).trim()
		}

		for (t : topic) {
			var tHasSubstring = false
			for(t2: topic) {
				// Smaller tags is part of larger, color larger part
				if(!t.equals(t2) && t.contains(t2)) {
					var expr = ""
					expr = t.substring(0,t.indexOf(t2))
					expr += "\\textcolor{red}{" + t2 + "}"
					expr += t.substring(t.indexOf(t2)+t2.length)
					tHasSubstring = true
					content = content.replace(expr, t)
				}
			}
			content = content.replace(t, "\\textcolor{red}{" + t + "}")
		}

		// retrieve images
		val LinkedList<String> images = new LinkedList<String>()

		println("About to print file image names ")
		if (it.image != null) {

			for (img : it.image) {
				var String md5 = ImageDownloader.md5(img.url)
				var String mimeType = img.type;
				var String fileType = ImageDownloader.truncateMIMEType(mimeType)
				var String completeFileName = md5 + "." + fileType // this file is located in your home folder
				System.err.println("retreived image file name: " + completeFileName)
				images.add(completeFileName)
			}
		}

		title = title.trim()
		newschannel = newschannel.trim()
		authors = authors.trim()

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
				\begin{tabular}{p{\widthof{Source}}p{0.7\columnwidth-\widthof{Source}}}
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
	
	def static String removeHTMLTags(String str) {
		var html = str
		html = html.replaceAll("\\<.*?>","")
   		html = html.replace("&nbsp;","~");
   		html = html.replace("&amp;","&");
   		html = html.replace("&#38;","&")
   		return html;
	}

	def static String contentWithFigures(String str, LinkedList<String> images, int imagesCnt) {
		var content = str
		var split = (content.length / (images.size() + 1))

		for (var i = 0; i < imagesCnt && i < images.size(); i++) {
			val splitIndex = content.indexOf(" \\\\", ((i + 1) * split) - 1) + 1
			val contentFirst = content.substring(0, splitIndex).trim()
			val contentSec = "\n" + 
				'''
				\begin{Figure}
					\includegraphics[width=\columnwidth]{../../images/«images.get(i)»}
				\end{Figure}
				'''
			val contentThird = content.substring(splitIndex+3).trim()
			content = contentFirst + contentSec + contentThird
		}
		return content.trim()
	}

	def doEMFSetup() {
		EPackage.Registry.INSTANCE.put(UnifiedModelPackage.eINSTANCE.nsURI, UnifiedModelPackage.eINSTANCE)
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl);
	}
}
