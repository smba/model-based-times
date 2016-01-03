package de.tu_bs.cs.isf.mbse.mbtimes.crawler;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import Atom.AtomFactory;
import Atom.Author;
import Atom.Entry;
import Atom.Feed;
import RSS.RSSPackage;
import de.tu_bs.cs.isf.mbse.mbtimes.crawler.feedparser.AtomFeedParser;
import de.tu_bs.cs.isf.mbse.mbtimes.crawler.listener.AtomFeedParserListener;

public class AtomCrawler implements AtomFeedParserListener {

	//CONSTANTS
	private static final String ATOM_TARGET_PATH = "tmp/AtomOutput.atom";
	
	private static final int THREADPOOL_SIZE = 5;	
	
	private AtomFactory atomFactory;
	//private AtomFactory atomFactory;
	
	private Resource atomResource;
	//TODO atom
	
	public void crawl() {
		
		//atom feed
		String[] feeds = {"http://www.heise.de/newsticker/heise-top-atom.xml"};

		ExecutorService executor = Executors.newFixedThreadPool(THREADPOOL_SIZE);

		for (String feed : feeds) {
			
			//TODO ergaenze Atom
			
			Runnable worker = null;
			try {
				worker = new AtomFeedParser(this, new URL(feed));
			} catch (MalformedURLException e) {
				throw new RuntimeException("The URL " + feed + " is malformed. Please check the link.");
			}
			executor.execute(worker);
		}
		executor.shutdown();
		while (!executor.isTerminated()) {
			// wait
		}
		
	}
	
	public AtomCrawler() {
		/*
		 * Initialize model etc
		 */
		RSSPackage.eINSTANCE.eClass();
	    this.atomFactory = AtomFactory.eINSTANCE;
	    System.out.println("crawler"  + atomFactory);
	    
	    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("atom", new XMIResourceFactoryImpl());
	    
	    System.err.println("before ResourceSet");
	    ResourceSet resSet = new ResourceSetImpl();
	    System.err.println("after ResourceSet");
	    
	    System.out.println(URI.createURI(ATOM_TARGET_PATH));
	    this.atomResource = resSet.createResource(URI.createURI(ATOM_TARGET_PATH));
	    if (resSet == null) {
	    	throw new RuntimeException("atomResource null");
	    }
	    /*
	    if (!(new File(ATOM_TARGET_PATH)).exists()) {
	    	File f = new File(ATOM_TARGET_PATH);
	    	f.getParentFile().mkdirs(); 
	    	try {
				f.createNewFile();
			} catch (IOException e) {
				throw new RuntimeException("Crawler could not create output file " + f.getName() + ".");
			}
	    }
	    */
	    System.err.println("before atomResource");
	    this.atomResource = resSet.createResource(URI.createURI(ATOM_TARGET_PATH));
	    System.err.println("after atomResource");
	    if (atomResource == null) {
	    	throw new RuntimeException("atomResource null");
	    }
	}
	
	public AtomFactory getRSSFactory() {
		return this.atomFactory;
	}
	
	public void dispose() {
		try {
			this.atomResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void receiveAtomAuthor(Author author) {
		atomResource.getContents().add(author);
		
	}

	@Override
	public void receiveAtomEntry(Entry entry) {
		System.out.println("receiving entry");
		atomResource.getContents().add(entry);
	}

	@Override
	public void receiveAtomCategory(Atom.Category category) {
		atomResource.getContents().add(category);
	}

	@Override
	public void receiveAtomFeed(Feed feed) {
		System.out.println(atomResource);
		atomResource.getContents().add(feed);
	}
	
	public AtomFactory getAtomFactory() {
		return atomFactory;
		
	}
	
	public static void main(String[] args) {
		AtomCrawler c = new AtomCrawler();
		c.crawl();
		c.dispose();
	}

}
 