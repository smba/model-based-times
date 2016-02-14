package de.tu_bs.cs.isf.mbse.mbtimes.crawler;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

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
import de.tu_bs.cs.isf.mbse.mbtimes.crawler.feedparser.FeedParser;
import de.tu_bs.cs.isf.mbse.mbtimes.crawler.feedparser.RSSFeedParser;
import de.tu_bs.cs.isf.mbse.mbtimes.crawler.listener.RSSFeedParserListener;

/**
 * Crawler für alle RSS-Feeds.
 * 
 * @version 14.01.2016
 */
public class RSSCrawler extends AbstractCrawler implements RSSFeedParserListener {

	/** Ausgabepfad für die .rss-Datei (XMI) */
	private static final String RSS_TARGET_PATH = crawlerBundlePathPrefix + "tmp/RssOutput.rss";

	/**
	 * Factory, mittels welcher Elemente gemäß der RSS.ecore erstellt werden.
	 */
	private RSSFactory rssFactory;

	/** Resource, welche in RSS_TARGET_PATH ge. bzw. überscrieben wird */
	private Resource rssResource;

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
				log.log(Level.SEVERE, "Crawler could not create output file " + f.getName() + ".");
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
		System.err.println("Received image!");
		rssResource.getContents().add(image);
	}

	@Override
	public void dispose() {
		try {
			this.rssResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			log.log(Level.WARNING, "RSS resource file may be empty!");
		}
	}

	@Override
	protected FeedParser createParser(URL feed) {
		return new RSSFeedParser(this, feed);
	}
}
