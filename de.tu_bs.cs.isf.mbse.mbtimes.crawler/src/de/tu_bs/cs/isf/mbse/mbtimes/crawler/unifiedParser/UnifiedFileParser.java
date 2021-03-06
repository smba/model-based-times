package de.tu_bs.cs.isf.mbse.mbtimes.crawler.unifiedParser;

import java.io.File;
import java.util.LinkedList;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
//import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import UnifiedModel.UnifiedModelPackage;
import de.tu_bs.cs.isf.mbse.mbtimes.crawler.Utilities;

public class UnifiedFileParser {
	
	static String crawlerBundlePathPrefix = Utilities.getBundlePath();
	
	/*
	public static void main(String[] args) {
		LinkedList<UnifiedModel.Article> unifiedArticles= loadArticles();
		System.out.println();
		System.out.println(unifiedArticles.get(0).getContent());
	}
	*/
	
	public static LinkedList<UnifiedModel.Article> loadArticles() {
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
	    
	    // Get the resource
	    Resource resource2 = resSet.getResource(URI
	        .createURI(crawlerBundlePathPrefix + "tmp/unifiedAtom.unified"), true);
	    
	    
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
	    for(int i = 0; i < resource2.getContents().size(); i++) {
	    	if(resource2.getContents().get(i) instanceof UnifiedModel.Article) {
	    		UnifiedModel.Article current = (UnifiedModel.Article) resource2.getContents().get(i);
	    		unifiedArticles.add(current);
		    	System.out.println(current.getTitle());
	    	}
	    }
	   return unifiedArticles;
	  }
	
	public static LinkedList<UnifiedModel.NewsChannel> loadNewsChannels() {
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
	    
	    // Get the resource
	    Resource resource2 = resSet.getResource(URI
	        .createURI(crawlerBundlePathPrefix + "tmp/unifiedAtom.unified"), true);
	    
	    
	    // Get the first model element and cast it to the right type, in my
	    // example everything is hierarchical included in this first node
	    LinkedList<UnifiedModel.NewsChannel> unifiedArticles = new LinkedList<UnifiedModel.NewsChannel>();
	    for(int i = 0; i < resource.getContents().size(); i++) {
	    	if(resource.getContents().get(i) instanceof UnifiedModel.NewsChannel) {
	    		UnifiedModel.NewsChannel current = (UnifiedModel.NewsChannel) resource.getContents().get(i);
	    		unifiedArticles.add(current);
		    	System.out.println(current.getIcon());
	    	}
	    }
	    for(int i = 0; i < resource2.getContents().size(); i++) {
	    	if(resource.getContents().get(i) instanceof UnifiedModel.NewsChannel) {
	    		UnifiedModel.NewsChannel current = (UnifiedModel.NewsChannel) resource2.getContents().get(i);
	    		unifiedArticles.add(current);
		    	System.out.println(current.getTitle());
	    	}
	    }
	   return unifiedArticles;
	  }

	
	
}