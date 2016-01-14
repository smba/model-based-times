package contentgenerator

import UnifiedModel.Article
import UnifiedModel.UnifiedModelPackage
import java.util.ArrayList
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import utilities.UnifiedFileParser

class MyCodeGenerator {

	def MyCodeGenerator() {
		
	}
  def static void main(String[] args) {
    println(compileTopic)
  }

  def  static String compileTopic() {
  	val articles = new ArrayList<Article>(UnifiedFileParser.load());
  	val topicTex = new StringBuffer()
  	
  	//TODO VSM
  	articles.forEach[article|
  		topicTex.append(compileArticle(article))	
  	]
  	
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