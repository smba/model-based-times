package de.tu_bs.cs.isf.mbse.mbtimes.crawler.unifiedParser;

import java.io.File;
import java.util.LinkedList;
import java.util.Map;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
//import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.osgi.framework.Bundle;

import UnifiedModel.UnifiedModelPackage;

public class UnifiedFileParser {
	
	public static String crawlerBundlePathPrefix;
	static {
		Bundle bundle = Platform.getBundle("de.tu_bs.cs.isf.mbse.mbtimes.crawler");
		int begin = bundle.getLocation().indexOf("/");
		crawlerBundlePathPrefix = bundle.getLocation().substring(begin);
		String prefix = (new File("dummy")).getAbsolutePath(); 
		prefix = prefix.substring(0,  prefix.lastIndexOf('/') + 1); 
		crawlerBundlePathPrefix = crawlerBundlePathPrefix.substring(prefix.length(), crawlerBundlePathPrefix.length());
	} 
	
	public static void main(String[] args) {
		LinkedList<UnifiedModel.Article> unifiedArticles= load();
		System.out.println();
		System.out.println(unifiedArticles.get(0).getContent());
	}
	
	public static LinkedList<UnifiedModel.Article> load() {
	    // Initialize the model
	    UnifiedModelPackage.eINSTANCE.eClass();
	    
	    // Register the XMI resource factory for the .website extension

	    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("unified", new XMIResourceFactoryImpl());

	    // Obtain a new resource set
	    ResourceSet resSet = new ResourceSetImpl();

	    System.err.println((new File(".")).getAbsolutePath());
	    
	    // Get the resource
	    Resource resource = resSet.getResource(URI
	        .createURI(crawlerBundlePathPrefix + "tmp/unifiedRSS.unified"), true);
	    
	    
	    
	    // Get the first model element and cast it to the right type, in my
	    // example everything is hierarchical included in this first node
	    LinkedList<UnifiedModel.Article> unifiedArticles = new LinkedList<UnifiedModel.Article>();
	    for(int i = 0; i < resource.getContents().size(); i++) {
	    	if(resource.getContents().get(i) instanceof UnifiedModel.Article) {
	    		UnifiedModel.Article current = (UnifiedModel.Article) resource.getContents().get(i);
	    		unifiedArticles.add(current);
		    	System.out.println(current.getTitle());
	    	}
	    }
	    
	   return unifiedArticles;
	  }

}