package de.tu_bs.cs.isf.mbse.mbtimes.crawler;

import java.io.File;
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

import RSS.Category;
import RSS.Channel;
import RSS.Enclosure;
import RSS.Image;
import RSS.Item;
import RSS.RSSFactory;
import RSS.RSSPackage;
import de.tu_bs.cs.isf.mbse.mbtimes.crawler.feedparser.RSSFeedParser;
import de.tu_bs.cs.isf.mbse.mbtimes.crawler.listener.AtomFeedParserListener;
import de.tu_bs.cs.isf.mbse.mbtimes.crawler.listener.RSSFeedParserListener;

public class Crawler implements RSSFeedParserListener, AtomFeedParserListener {

	//CONSTANTS
	private static final String RSS_TARGET_PATH = "tmp/RssOutput.rss";
	private static final String ATOM_TARGET_PATH = "tmp/AtomOutput.xmi"; 
	
	private static final int THREADPOOL_SIZE = 5;	
	
	private RSSFactory rssFactory;
	//private AtomFactory atomFactory;
	
	private Resource rssResource;
	//TODO atom
	
	public void crawl() {
		String[] feeds = {"https://www.freitag.de/politik/@@RSS"};

		ExecutorService executor = Executors.newFixedThreadPool(THREADPOOL_SIZE);

		for (String feed : feeds) {
			
			//TODO ergaenze Atom
			
			Runnable worker = null;
			try {
				worker = new RSSFeedParser(this, new URL(feed));
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
	
	public Crawler() {
		/*
		 * Initialize model etc
		 */
		RSSPackage.eINSTANCE.eClass();
	    this.rssFactory = RSSFactory.eINSTANCE;
	    
	    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("rss", new XMIResourceFactoryImpl());
	    
	    ResourceSet resSet = new ResourceSetImpl();
	    
	    if (!(new File(RSS_TARGET_PATH)).exists()) {
	    	File f = new File(RSS_TARGET_PATH);
	    	f.getParentFile().mkdirs(); 
	    	try {
				f.createNewFile();
			} catch (IOException e) {
				throw new RuntimeException("Crawler could not create output file " + f.getName() + ".");
			}
	    }
	    this.rssResource = resSet.createResource(URI.createURI(RSS_TARGET_PATH));
	    
	    
	}
	
	@Override
	public void receiveRSSItem(Item item) {
		rssResource.getContents().add(item);
	}

	@Override
	public void receiveRSSChannel(Channel channel) {
		rssResource.getContents().add(channel);
	}

	@Override
	public void receiveRSSEnclosure(Enclosure enclosure) {
		rssResource.getContents().add(enclosure);
	}

	@Override
	public void receiveRSSCategory(Category category) {
		rssResource.getContents().add(category);
	}

	@Override
	public void receiveRSSImage(Image image) {
		rssResource.getContents().add(image);
	}

	public void dispose() {
		disposeRSS();
		disposeAtom();
	}
	
	private void disposeRSS() {
		try {
			this.rssResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	private void disposeAtom() {
		//TODO to implement
	}
	
	public static void main(String[] args) {
		Crawler c = new Crawler();
		c.crawl();
		c.disposeRSS();
	}

	@Override
	public void receiveAtomAuthor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receiveAtomEntry() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receiveAtomCategory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receiveAtomFeed() {
		// TODO Auto-generated method stub
		
	}

}
 