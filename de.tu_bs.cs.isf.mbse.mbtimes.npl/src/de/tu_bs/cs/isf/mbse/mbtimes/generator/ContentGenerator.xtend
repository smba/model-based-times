package de.tu_bs.cs.isf.mbse.mbtimes.generator

import UnifiedModel.NewsChannel
import UnifiedModel.Article
import UnifiedModel.UnifiedModelPackage
import de.tu_bs.cs.isf.mbse.mbtimes.crawler.unifiedParser.UnifiedFileParser
import de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration
import de.tu_bs.cs.isf.mbse.mbtimes.npl.vsm.VectorSpaceModel
import java.util.ArrayList
import java.util.LinkedList
import java.util.List
import java.util.Locale
import java.util.StringTokenizer
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

class ContentGenerator {

	//Special Characters in LaTeX and the changed version
  	static val String[] specialChars = #['\\','{','}','%','^','_','&','#','~','�','�','�'," . ", " , "]
  	static val String[] changedChars = #["\\textbackslash","\\{","\\}","\\%","\\textasciicircum","\\_","\\&","\\#","\\textasciitilde","$^\\circ$","\\pounds","", ". ", ", "]
 
	def ContentGenerator() {
		
	}
  def static void main(String[] args) {
  	val x = new LinkedList<String>()
  	x.add("berlin")
  	x.add("london")
  	
  	var topicTex = new StringBuffer()
  	//topicTex.append(compileTopic(x, "Berliner News"))
  	println(topicTex.toString)
  }

  def static String compileTopic(List<String> topic, String topicName, Declaration d) {
  	val articles = new ArrayList<Article>(UnifiedFileParser.loadArticles());
  	val newschannels = new ArrayList<NewsChannel>(UnifiedFileParser.loadNewsChannels());
  	
  	// index out of bound fix
  	if (newschannels.size > 0) {
  		println("crawled newschannel icon url: " + newschannels.get(1).icon);
  	}
  	
  	val topicTex = new StringBuffer()

	//retreive List from articles
	val fulltexts = new ArrayList<String>();
	for(Article a : articles) {
		fulltexts.add(a.content);
	}
	
	var String language = null
	if (d.language.value.equals("English")) {
		language = "EN"
	} else if (d.language.value.equals("German")) {
		language = "DE"
	}
		
	
  	val vsm = new VectorSpaceModel( /*language*/ );
  	vsm.buildDocumentVectors(fulltexts);
  	
  	System.err.println("VSM computing similarities");
  	
  	val ranking = vsm.computeSimilarities(vsm.getQueryVector(topic));
  	
  	System.err.println("VSM computed similarities");
  	
  	topicTex.append("\\headline{{\\bfseries\\Huge " + topicName + "}\\linebreak\\medskip")
  	var str = topic.get(0)
  	for(var i = 1; i < topic.size(); i++) {
  		str += ", " + topic.get(i)
  	}
  	topicTex.append("{\\footnotesize{\\bfseries Tags: }{\\it " + str + "}}}")
  	topicTex.append("\\begin{multicols}{\\numberColumns}")
  	
  	var k = d.articleCnt
  	var cntArticles = 0
  	for(var i = 0; i < k && i < ranking.size(); i++) {
  		if(vsm.getSimilarity(ranking.get(i)) > 0.01) {
	  		val article = articles.get(ranking.get(i))
  			val st = new StringTokenizer(article.content)
  			println("numberWords: " + st.countTokens())
 	 		if(st.countTokens() >= d.articleWordsMin && st.countTokens() <= d.articleWordsMax) {
  				topicTex.append(compileArticle(article, topic))
  				cntArticles++
  			} else {
  				k++
 	 		}
  		} else {
  			k=0
  		}
  	}  	
  	topicTex.append("\\end{multicols}\n")
  	if(k==0) {
  		topicTex.append("\\begin{center}")
  		if(d.language != null && d.language.value.equals("German")) {
  			if(cntArticles == 0) {
  				topicTex.append("{\\it\\huge Keine passenden Artikel gefunden!}")
  			} else {
  				topicTex.append("{\\it\\huge Keine weiteren passenden Artikel gefunden!}")
  			}
  		} else {
  			if(cntArticles == 0) {
  				topicTex.append("{\\it\\huge No suitable articles found!}")
  			} else {
  				topicTex.append("{\\it\\huge No other suitable articles found!}")
  			}
  		}
  		topicTex.append("\\end{center}")
  	}
  	return topicTex.toString
  }
//  	    \headline{\it\huge �it.title�}
  def  static compileArticle(Article it, List<String> topic) {
  	var content = new String(it.content.getBytes("UTF-8"),"UTF-8")
  	var subtitle = new String(it.subtitle.getBytes("UTF-8"),"UTF-8")
  	if(subtitle.indexOf("<") >= 0) {
		subtitle = subtitle.substring(0,subtitle.indexOf("<"));
	}

  	var title = new String(it.title.getBytes("UTF-8"),"UTF-8")
  	var authors = ""
  	if(it.author != null && it.author.size() > 0 ) {
	  	authors = new String(it.author.get(0).name.getBytes("UTF-8"),"UTF-8")
	  	for(var i=1; i < it.author.size; i++) {
	  		authors += ", " + new String(it.author.get(i).name.getBytes("UTF-8"),"UTF-8")
	  	}
  	}
  	
  	var newschannel = ""
  	if(it.newschannel != null) {
  	newschannel = new String(it.newschannel.title.getBytes("UTF-8"),"UTF-8")
  	}
  	
  	//content = new String(content.getBytes("UTF-8"),"UTF-8")
  	
  	for(var i=0;i < specialChars.length;i++) {
  		content = content.replace(specialChars.get(i),changedChars.get(i))
  		subtitle = subtitle.replace(specialChars.get(i),changedChars.get(i))
  		if(it.title != null) {
  			title = title.replace(specialChars.get(i),changedChars.get(i))
  		}
  		authors = authors.replace(specialChars.get(i),changedChars.get(i))
		newschannel = newschannel.replace(specialChars.get(i),changedChars.get(i))
  	}
  	
  	for(t: topic) {
  		content = content.replace(t,"\\textcolor{red}{" + t + "}")
  	}
  	
  	
  	'''
  		
  		«IF authors.length() > 0 && it.title != null && newschannel.length() > 0»
       	\byline{\it\Large «title»}{«authors», «newschannel»}
        «ELSEIF it.title != null && newschannel.length() > 0»
        \byline{\it\Large «title»}{«newschannel»}
        «ELSEIF authors.length() > 0 && it.title != null»
        \byline{\it\Large «title»}{«authors»}
        «ELSEIF it.title != null»
        \headline{\it\Large «title»}
        «ELSE»
        \headline{\it\Large N.N.}
        «ENDIF»
		{\bfseries
		\noindent «subtitle»
		} \medskip\newline
		«content»
		
        \closearticle 
  	'''
  	}

  def doEMFSetup() {
    EPackage.Registry.INSTANCE.put(UnifiedModelPackage.eINSTANCE.nsURI, UnifiedModelPackage.eINSTANCE)
    Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl);
  }
}
	