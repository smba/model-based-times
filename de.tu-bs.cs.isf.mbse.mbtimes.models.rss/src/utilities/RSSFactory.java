package utilities;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.*;

public class RSSFactory {
	public static void main(String[] args) {
		ResourceSet resourceSet = new ResourceSetImpl(); 
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("rss", new  XMIResourceFactoryImpl());
		
		Resource rssResource = resourceSet.getResource(URI.createURI("./data/crawled.rss"), true); //input rss instance
		EList<EObject> rssObjects = rssResource.getContents();
		
	}
}
