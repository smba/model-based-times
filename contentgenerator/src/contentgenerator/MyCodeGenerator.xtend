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
import de.tu_bs.cs.isf.mbse.topic.*

class MyCodeGenerator {

	def MyCodeGenerator() {
		
	}
  def static void main(String[] args) {
  	val x = new LinkedList<String>()
  	x.add("berlin")
  	x.add("london")
  	println("before computing vsm...")
    println(compileTopic(x))
    println("after computing vsm...")
  }

  def static String compileTopic(List<String> topic) {
  	val articles = new ArrayList<Article>(UnifiedFileParser.load());
  	val topicTex = new StringBuffer()

	//retreive List from articles
	val fulltexts = new ArrayList<String>();
	for(Article a : articles) {
		fulltexts.add(a.content);
	}
	
	//TODO VSM
  	val vsm = new VectorSpaceModel();
  	vsm.buildDocumentVectors(fulltexts);
  	val ranking = vsm.computeSimilarities(vsm.getQueryVector(topic));
  	println("ranking: ")
  	println(ranking.get(1))
  	
  	val k = 5
  	for(var i = 0; i < k; i++) {
  		topicTex.append(compileArticle(articles.get(ranking.get(i))))
  	}  	
  	return topicTex.toString
  }
//  	    \headline{\it\huge «it.title»}
  def  static compileArticle(Article it) {
  	'''
  		
  		«IF it.author != null && it.title != null && it.newschannel != null && it.newschannel.title != null»
       	\byline{\it\huge «it.title»}{«it.author», «it.newschannel.title»}
        «ELSEIF it.title != null && it.newschannel != null && it.newschannel.title != null»
        \byline{\it\huge «it.title»}{«it.newschannel.title»}
        «ELSEIF it.author != null && it.title != null»
        \byline{\it\huge «it.title»}{«it.author»}
        «ELSE»
        \byline{\it\huge N.N.}
        «ENDIF»
		{\bfseries
		«it.subtitle»
		} \newline
		«it.content» 
		
        \closearticle 
  	'''
  	}

  def doEMFSetup() {
    EPackage.Registry.INSTANCE.put(UnifiedModelPackage.eINSTANCE.nsURI, UnifiedModelPackage.eINSTANCE)
    Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl);
  }

}