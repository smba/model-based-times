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
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import java.util.LinkedHashMap
import org.apache.commons.lang3.StringEscapeUtils
import java.io.IOException
import java.nio.file.Paths
import java.util.regex.Pattern

class ContentGenerator {

	static val LinkedHashMap<String,String> specialChars = new LinkedHashMap <String, String>()
	static var VectorSpaceModel vsm = null
	static val articles = new LinkedList<Article>()
	static var String projectPath = null
	static var String outputFolder = null
	

	def ContentGenerator() {
	}

	def static setProjectPath(String path) {
		projectPath = path
	}
	
	def static setOutputFolder(String folder) {
		outputFolder = folder
	}

	/**
 	 * Creates a Map with characters and substrings, which have to be 
 	 * changed for the LaTeX files.
	 */
	def static void initSpecialCharHashMap() {
		specialChars.clear
		specialChars.put("\\","\\textbackslash{}")
		specialChars.put("{","\\{")
		specialChars.put("}","\\}")
		specialChars.put("%","\\%")
		specialChars.put("^","\\textasciicircum{}")
		specialChars.put("_","\\_")
		specialChars.put("&","\\&")
		specialChars.put("#","\\#")
		specialChars.put("$","\\$")
		specialChars.put("~","\\textasciitilde{}")
		specialChars.put("°","$^\\circ$")
		specialChars.put(" .",".")
		specialChars.put(" ,",",")
		specialChars.put(" :",":")
		specialChars.put(" ;",";")
		specialChars.put(" !","!")
		specialChars.put(" ?","?")
		specialChars.put("[","{}[")
		specialChars.put("\"","\"{}")
		specialChars.put("€", "\\euro{}")
		specialChars.put((0x97 as char).toString, "--")
		specialChars.put((0x3000 as char).toString, " ") // Freaky space
	}

	/**
 	 * Initializes the Vector Space Machine for Content Selection,, 
 	 * use only articles with the wanted number of words
	 */
	def static void initVSM(String language,int min, int max) {
		articles.clear
		val articleList = new ArrayList<Article>(UnifiedFileParser.loadArticles());
		val fulltexts = new ArrayList<String>();
		println("Articles in VSM:")
		for (Article a : articleList) {
			val text = StringEscapeUtils.unescapeHtml4(a.content).replaceAll("\\<(.|\\s)*?>","")
			val st = new StringTokenizer(text)
			if (st.countTokens() >= min && st.countTokens() <= max) {
				fulltexts.add(text);
				articles.add(a)
				
				println(a.title)
			}
		}
		println("Articles in VSM: " + articles.size + " of " + articleList.size)

		vsm = new VectorSpaceModel( /*language*/ );
		vsm.buildDocumentVectors(fulltexts);
	}

	/**
	 * Compiles a topic in LaTeX, with all articles
	 */
	def static String compileTopic(List<String> topic, String topicName, Declaration d) {
		val ranking = vsm.computeSimilarities(vsm.getQueryVector(topic));

		var tags = topic.get(0)
		for (var i = 1; i < topic.size(); i++) {
			tags += ", " + topic.get(i)
		}

		// calculate median of similarities for article selection
		var median = medianOfSimilarities(ranking, d.articleCnt)
		println("Median: " + median)

		// Get informations from the Declaration
		var language = ""
		if (d.language != null) {
			language = d.language.value
		}
		var imagesCount = 0
		if (d.imagesCnt != null) {
			imagesCount = d.imagesCnt.value
		}

		//Article Selection
		val articleList = new LinkedList<Article>()
		for (var i = 0; i < d.articleCnt && i < ranking.size(); i++) {
			val article = articles.get(ranking.get(i))
			if (vsm.getSimilarity(ranking.get(i)) >= median) {
				val st = new StringTokenizer(article.content)
				articleList.add(article)

				println("Title:\t\t" + article.title)
				println("numberWords:\t" + st.countTokens())
				println("Similarity:\t" + vsm.getSimilarity(ranking.get(i)))
				println()
				
			}
		}
		
		System.err.println("Compiled tex for topic \"" + topicName + "\"")
		
		//The template for the topic
		'''
		\headline{{\bfseries\Huge «topicName»}\\
		\medskip
		{\footnotesize{\bfseries Tags: }{\it «tags»}}}
		«IF d.columnsCnt>1»
			\begin{multicols}{\numberColumns}
		«ENDIF»
		
		«FOR a:articleList»
			«compileArticle(a, topic, language, imagesCount)»
			«IF articleList.last != a»
				\bigskip
«««\vfill\columnbreak
				
			«ENDIF»
		«ENDFOR»
		«IF d.columnsCnt>1»
			\end{multicols}
		«ENDIF»
		
		«IF articleList.size < d.articleCnt»
			\begin{center}
				«IF language.equals("German")»
					{\it\huge Keine «IF !articleList.empty»weiteren «ENDIF»passenden Artikel gefunden!}
				«ELSE»
					{\it\huge No «IF !articleList.empty»other «ENDIF»suitable articles found!}
				«ENDIF»
			\end{center}
		«ENDIF»
		'''
	}

	/**
	 * Calculates the median of all similarities > 0.0, but the value should be at least 0.05, otherwise
	 * non-suitable articles gets selected.
	 * It is not the real median, because in the even case we use get(middle - 1) as median
	 * instead of (get(middle - 1) + get(middle)) / 2.0.
	 * @return If the number of positive similarities is larger 
	 * than the number of wanted articles then max(median,0.05) is returned; otherwise a fix constant 0.05.
	 */
	def static double medianOfSimilarities(Map<Integer, Integer> ranking, int articleCnt) {
		//Get the positive similarities and sort them
		val simArray = new LinkedList<Double>()
		for (var i = 0; i < ranking.size(); i++) {
			if (vsm.getSimilarity(ranking.get(i)) > 0.0) {
				simArray.add(vsm.getSimilarity(ranking.get(i)))
			}
		}
		Collections.sort(simArray)
		
		// Calculate median
		var median = 0.0
		if (simArray.size > 1) {
			var middle = simArray.size / 2;
			if (simArray.size % 2 == 1) {
				median = simArray.get(middle);
			} else {
				median = simArray.get(middle - 1);
			}
		} else if (!simArray.empty) {
			median = 0.00
		}

		if (simArray.size > articleCnt) {
			return Math.max(median,0.05)
		} else {
			return 0.05
		}

	}

	/**
	 * Compile an article for LaTeX.
	 */
	def static compileArticle(Article it, List<String> topic, String language, int imagesCnt) {
		
		//Get information from article and encode them in UTF-8.
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
		var articleLink = new String(it.link.getBytes("UTF-8"), "UTF-8")
		
		var date = ""
		if (it.published != null) {
			val dt = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
			date = dt.format(it.published)
		}
	
		//Convert from HTML to LaTeX.
		content = convertHTMLToLatex(content)
		subtitle = convertHTMLToLatex(subtitle)
		title = convertHTMLToLatex(title)
		authors = convertHTMLToLatex(authors)
		newschannel = convertHTMLToLatex(newschannel)
		articleLink = convertHTMLToLatex(articleLink)		

		//Color the tags in the fulltext with red color
		for (t : topic) {
			var tHasSubstring = false
			for(t2: topic) {
				// Smaller tags is part of larger, color larger part
				// If the smaller tag was colored before the larger one
				// the last part of the larger gets no color, so convert them back
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
		
		content = convertForeignLanguages(content, language)
		subtitle = convertForeignLanguages(subtitle, language)
		title = convertForeignLanguages(title, language)

		// retrieve images
		val LinkedList<String> images = new LinkedList<String>()
		println("About to print file image names ")
		if (it.image != null) {
			for (img : it.image) {
				var fileName = downloadImage(img)
				
				if(fileName != null) {
					images.add(fileName)
				}
				
			}
		}
		
		var sourceStr = ""
		var dateStr = ""
		if(language.equals("German")) {
			sourceStr = "Quelle"
			dateStr = "Datum"
		} else {
			sourceStr = "Source"
			dateStr = "Date"
		}

		//Template for an article
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
		
		\begin{minipage}{\columnwidth}
		«IF !newschannel.empty || !date.empty»
			\begin{center}
				\fbox{\parbox{0.8\columnwidth}{\footnotesize 
				\begin{tabular}{p{\widthof{Source}}p{0.7\columnwidth-\widthof{Source}}}
				«IF !newschannel.empty»
					\textbf{«sourceStr»:} & \href{«articleLink»}{«newschannel»}
				«ENDIF»
				«IF !newschannel.empty && !date.empty»
					\\
				«ENDIF»
				«IF !date.empty»
					\textbf{«dateStr»:} & «date»
				«ENDIF»
			\end{tabular} }}
			\end{center}
		«ENDIF»
		\closearticle
		\end{minipage}
		'''
	}
	
	/**
	 * Converts a HTML String to a LaTeX compactible String.
	 * This method changes first all HTML special characters (e.g. &nbsp;) to ordinary charaters and
	 * then LaTeX special characters (e.g. %) to LaTeX plain text characters (e.g. \%) 
	 * Then the HTML-Tags are removed or changed to LaTeX Code
	 */
	def static String convertHTMLToLatex(String str) {
		var html = str
		val latexNewLine = "\\\\" + (0x0a as char).toString()
		
		//remove tabs (\t)
		html = html.replace("&#x9;","")
		html = html.replace((0x09 as char).toString,"")

		//Change HTML special characters (e.g. &nbsp;) to ordinary charaters
   		html = StringEscapeUtils.unescapeHtml4(html)
		
		//Change all LaTeX special characters
		for(key: specialChars.keySet) {
			html = html.replace(key, specialChars.get(key))
		}
		html = html.replace((0x0a as char).toString, latexNewLine)
		
		//Change some HTML Tags to LaTeX Code
		html = html.replaceAll("/(<br\\s*\\/?>)+/",latexNewLine)
		html = html.replace("<b>", "\\textbf{").replace("</b>","}")
		html = html.replace("<strong>", "\\textbf{").replace("</strong>","}")
		html = html.replace("<i>", "\\textit{").replace("</i>","}")
		html = html.replace("<em>", "\\textit{").replace("</em>","}")
		
		//Remove remaining HTML Tags (e.g. <p></p>)
		html = html.replaceAll("\\<(.|\\s)*?>","")
		
		html = html.replaceAll((0xA0 as char).toString, "~");
		
		//Some texts start and/or ends with new line commands, LaTeX doesn't like it.
		while(html.lastIndexOf(latexNewLine)==html.length-latexNewLine.length) {
			html = html.substring(0,html.lastIndexOf(latexNewLine))
		}
		
		html = html.trim
		while(html.indexOf(latexNewLine)==0) {
			html = html.substring(latexNewLine.length).trim
		}
				
   		return html
	}
	
	
	def static String convertForeignLanguages(String str, String language) {
		var text = str
		
		// Filter japanese symbols
		val japanese = "(/[\\u3000-\\u303F]|[\\u3040-\\u309F]|[\\u30A0-\\u30FF]|
						[\\uFF00-\\uFFEF]|[\\u4E00-\\u9FAF]|[\\u2605-\\u2606]|
						[\\u2190-\\u2195]|\\u203B/g)+"
		
		val pattern = Pattern.compile(japanese);
	    var matcher = pattern.matcher(text);
	    
	    var start = 0
	    while(matcher.find(start)) {
//	    	var textFirst = text.substring(0,matcher.start) + "\\begin{CJK}{UTF8}{min}"
//	    	textFirst += matcher.group + "\\end{CJK}"
//	    	start = textFirst.length
//	    	text = textFirst + text.substring(matcher.end)
	    	var textFirst = text.substring(0,matcher.start) + "\\textit{***";
	    	if(language.equals("German")) {
	    		textFirst += "Japanische Zeichen"
	    	} else {
	    		textFirst += "japanese symbols"
	    	}
	    	text = textFirst + "***}" + text.substring(matcher.end)
	    	start = textFirst.length + 3
	    	matcher = pattern.matcher(text);
	    }
	    var t = '　'
	    println(t.charAt(0) as int + "   " + ' '.charAt(0) as int)
	    return text
	}

	/**
	 * Add images to fulltext. Having x images, splits the fulltext in x+1 almost 
	 * equal parts, seperated by LaTeX's new line command ("\\") and inserted an image after each part, expect the last one.
	 */
	def static String contentWithFigures(String str, LinkedList<String> images, int imagesCnt) {
		var content = str
		var split = (content.length / (images.size() + 1))
		
		val relativePath = Paths.get(projectPath + outputFolder)
				.relativize(Paths.get(projectPath + outputFolder + "/images")).toString.replace("\\","/")

		for (var i = 0; i < imagesCnt && i < images.size(); i++) {
			var splitIndex = 0
			if(content.indexOf("\\\\", ((i + 1) * split) - 1) > 0) {
				splitIndex = content.indexOf("\\\\", ((i + 1) * split) - 1)
			}
			val contentFirst = content.substring(0, splitIndex).trim()
			val contentSec = "\n" + 
				'''
				\settowidth\imagewidth{\includegraphics{«relativePath»/«images.get(i)»}}
				\begin{Figure}
					\includegraphics[width=\minof{\columnwidth}{\imagewidth}]{«relativePath»/«images.get(i)»}
				\end{Figure}
				'''
			var contentThird = ""
			if (splitIndex == 0) {
				contentThird = content
			} else if (content.length > splitIndex+2) {
				contentThird = content.substring(splitIndex+2).trim
			}
			content = contentFirst + contentSec + contentThird
		}
		return content.trim()
	}
	
	def static String downloadImage(UnifiedModel.Image img) {
		val url = img.url
		val type = img.type
		val md5hash = ImageDownloader.md5(url)
		val suffix = type.substring(type.indexOf('/') + 1);
		
		var String filename = null
		try {
			ImageDownloader.downloadFile(projectPath + outputFolder + "/images/" + md5hash + "." + suffix, url);
			filename = md5hash + "." + suffix
		} catch(IOException e) {
			System.err.println("Could not receive image " + url)
		}			
		println(projectPath + "images/" + md5hash + "." + suffix)
		println(filename)		
		return filename
	}

	def doEMFSetup() {
		EPackage.Registry.INSTANCE.put(UnifiedModelPackage.eINSTANCE.nsURI, UnifiedModelPackage.eINSTANCE)
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl);
	}
}
