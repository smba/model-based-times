package contentgenerator

import UnifiedModel.Article
import UnifiedModel.UnifiedModelPackage
import java.util.ArrayList
import java.util.LinkedList
import java.util.List
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import utilities.UnifiedFileParser
import de.tu_bs.cs.isf.mbse.topic.VectorSpaceModel
import java.util.StringTokenizer

class MyCodeGenerator {

	//Special Characters in LaTeX and the changed version
  	static val String[] specialChars = #['\\','{','}','%','^','_','&','#','~','°','£','Â'," . ", " , "]
  	static val String[] changedChars = #["\\textbackslash","\\{","\\}","\\%","\\textasciicircum","\\_","\\&","\\#","\\textasciitilde","$^\\circ$","\\pounds","", ". ", ", "]
 
	def MyCodeGenerator() {
		
	}
  def static void main(String[] args) {
  	val x = new LinkedList<String>()
  	x.add("berlin")
  	x.add("london")
  	
  	var topicTex = new StringBuffer()
  	topicTex.append(compileTopic(x, "Berliner News"))
  	println(topicTex.toString)
  }

  def static String compileTopic(List<String> topic, String topicName) {
  	val articles = new ArrayList<Article>(UnifiedFileParser.load());
  	val topicTex = new StringBuffer()

	//retreive List from articles
	val fulltexts = new ArrayList<String>();
	for(Article a : articles) {
		fulltexts.add(a.content);
	}
	
  	val vsm = new VectorSpaceModel();
  	vsm.buildDocumentVectors(fulltexts);
  	val ranking = vsm.computeSimilarities(vsm.getQueryVector(topic));
  	
  	topicTex.append("\\headline{{\\bfseries\\Huge " + topicName + "}\\linebreak\\medskip")
  	var str = topic.get(0)
  	for(var i = 1; i < topic.size(); i++) {
  		str += ", " + topic.get(i)
  	}
  	topicTex.append("{\\footnotesize{\\bfseries Tags: }{\\it " + str + "}}}")
  	topicTex.append("\\begin{multicols}{\\numberColumns}")
  	
  	var k = 5
  	for(var i = 0; i < k && i < ranking.size(); i++) {
  		val article = articles.get(ranking.get(i))
  		val st = new StringTokenizer(article.content)
  		println("numberWords: " + st.countTokens())
  		if(st.countTokens() >= 20 && st.countTokens() <= 1000) {
  			topicTex.append(compileArticle(article))
  		} else {
  			k++
  		}
  	}  	
  	topicTex.append("\\end{multicols}")
  	return topicTex.toString
  }
//  	    \headline{\it\huge «it.title»}
  def  static compileArticle(Article it) {
  	var content = it.content
  	var subtitle = it.subtitle
  	subtitle = subtitle.substring(subtitle.lastIndexOf(".value=")+7)
  	if(subtitle.lastIndexOf("</a>") >= 0) {
  		subtitle = subtitle.substring(subtitle.lastIndexOf("</a>")+5)
  	}
  	var title = it.title
  	var authors = ""
  	if(it.author != null && it.author.size() > 0 ) {
	  	it.author.get(0).name
	  	for(var i=1; i < it.author.size; i++) {
	  		authors += ", " + it.author.get(0).name
	  	}
  	}
  	
  	var newschannel = ""
  	if(it.newschannel != null) {
  	newschannel = it.newschannel.title
  	}
  	
  	for(var i=0;i < specialChars.length;i++) {
  		content = content.replace(specialChars.get(i),changedChars.get(i))
  		subtitle = subtitle.replace(specialChars.get(i),changedChars.get(i))
  		if(it.title != null) {
  			title = title.replace(specialChars.get(i),changedChars.get(i))
  		}
  		authors = authors.replace(specialChars.get(i),changedChars.get(i))
		newschannel = newschannel.replace(specialChars.get(i),changedChars.get(i))
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