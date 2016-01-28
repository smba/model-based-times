package de.tu_bs.cs.isf.mbse.mbtimes.crawler;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.osgi.framework.Bundle;

import RSS.Category;
import RSS.Channel;
import RSS.Enclosure;
import RSS.Image;
import RSS.Item;
import RSS.RSSFactory;
import RSS.RSSPackage;
import de.tu_bs.cs.isf.mbse.mbtimes.crawler.feedparser.RSSFeedParser;
import de.tu_bs.cs.isf.mbse.mbtimes.crawler.listener.RSSFeedParserListener;

/**
 * Crawler für alle RSS-Feeds.
 * 
 * @version 14.01.2016
 */
public class RSSCrawler implements Crawler, RSSFeedParserListener {

	private static String crawlerBundlePathPrefix;
	static {
		Bundle bundle = Platform.getBundle("de.tu_bs.cs.isf.mbse.mbtimes.crawler");
		int begin = bundle.getLocation().indexOf("/");
		crawlerBundlePathPrefix = bundle.getLocation().substring(begin);
		String prefix = (new File("dummy")).getAbsolutePath(); 
		prefix = prefix.substring(0,  prefix.lastIndexOf('/') + 1); 
		crawlerBundlePathPrefix = crawlerBundlePathPrefix.substring(prefix.length(), crawlerBundlePathPrefix.length());
	}
	
	/** Ausgabepfad für die .rss-Datei (XMI) */
	private static final String RSS_TARGET_PATH = crawlerBundlePathPrefix + "tmp/RssOutput.rss";

	/** Maximale Anzahl an Feeds, welche gleichzeitig gecrawlt wird */
	private static final int THREADPOOL_SIZE = 5;

	/**
	 * Factory, mittels welcher Elemente gemäß der RSS.ecore erstellt werden.
	 */
	private RSSFactory rssFactory;

	/** Resource, welche in RSS_TARGET_PATH ge. bzw. überscrieben wird */
	private Resource rssResource;

	public void crawl(List<String> feeds) {

		/**
		 * Thread-Pool, in welchem die Threads für die Feed-Parser operieren.
		 */
		ExecutorService executor = Executors.newFixedThreadPool(THREADPOOL_SIZE);

		/** Für jeden Feed wird ein eigener FeedParser gestartet. */
		for (String feed : feeds) {
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

	public RSSCrawler() {
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
			System.err.println("File created!");
		} else {
			System.err.println("File already exists!");
		}
		this.rssResource = resSet.createResource(URI.createURI(RSS_TARGET_PATH));
	}

	@Override
	public RSSFactory getRSSFactory() {
		return this.rssFactory;
	}

	@Override
	public void receiveRSSItem(Item item) {
		System.out.println(item.getTitle());
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

	@Override
	public void dispose() {
		try {
			System.err.println("Writing RSS file");
			this.rssResource.save(Collections.EMPTY_MAP);
			System.err.println("Written RSS file");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
