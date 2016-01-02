package de.tu_bs.cs.isf.mbse.mbtimes.crawler;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import Atom.AtomFactory;
import Atom.AtomPackage;
import Atom.Author;
import Atom.Entry;
import Atom.Feed;
import RSS.Category;
import RSS.Channel;
import RSS.Enclosure;
import RSS.Image;
import RSS.Item;
import RSS.RSSFactory;
import RSS.RSSPackage;
import de.tu_bs.cs.isf.mbse.mbtimes.crawler.feedparser.AtomFeedParser;
import de.tu_bs.cs.isf.mbse.mbtimes.crawler.feedparser.RSSFeedParser;
import de.tu_bs.cs.isf.mbse.mbtimes.crawler.listener.AtomFeedParserListener;
import de.tu_bs.cs.isf.mbse.mbtimes.crawler.listener.RSSFeedParserListener;

/**
 * 
 * @author Stefan Mühlbauer
 *
 */
public class Crawler implements RSSFeedParserListener, AtomFeedParserListener {

	/**
	 * Output path for the RSS entities.
	 */
	private static final String RSS_TARGET_PATH = "tmp/RssOutput.xml";
	private static final String ATOM_TARGET_PATH = "tmp/AtomOutput.xml";

	/**
	 * Pool size of the thread pool, i.e. maximum number of feeds parsed
	 * simultanuously.
	 */
	private static final int THREADPOOL_SIZE = 5;

	/**
	 * Factory for RSS entities
	 */
	private RSSFactory rssFactory;
	private AtomFactory atomFactory;

	/*
	 * TODO Add the adom factory
	 */
	// private AtomFactory atomFactory;

	/**
	 * Resource for RSS entities
	 */
	private Resource rssResource;
	private Resource atomResource;

	// TODO add Resource for Atom entities

	/**
	 * Starts crawling by scraping the specified RSS/Atom feeds.
	 */
	public void crawl(List<String> feeds) {
		// String[] feeds = { "http://newsfeed.zeit.de/index",
		// "http://www.heise.de/tp/rss/news-xl.rdf" };

		ExecutorService executor = Executors.newFixedThreadPool(THREADPOOL_SIZE);
		for (String feed : feeds) {

			Runnable worker = null;

			/*
			 * Determine which feed is an Atom or a RSS feed and start the
			 * corresponding feed parser.
			 */
			try {
				if (isAtom(feed)) {
					/*
					 * Feed appears to be an Atom feed.
					 */
					worker = new AtomFeedParser(this, new URL(feed));
				} else {
					/*
					 * Feed appears to be a RSS feed.
					 */
					worker = new RSSFeedParser(this, new URL(feed));
				}
			} catch (ParserConfigurationException e) {
				throw new RuntimeException(e);
			} catch (SAXException e) {
				throw new RuntimeException(e);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}

			executor.execute(worker);

			executor.shutdown();
			while (!executor.isTerminated()) {
				/* wait */
			}

		}
	}

	public Crawler() {

		/*
		 * Initialize models etc
		 */
		RSSPackage.eINSTANCE.eClass();
		AtomPackage.eINSTANCE.eClass();
		rssFactory = RSSFactory.eINSTANCE;
		atomFactory = AtomFactory.eINSTANCE;

		// RSS
		Resource.Factory.Registry regRSS = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> mapRSS = regRSS.getExtensionToFactoryMap();

		// Atom
		Resource.Factory.Registry regAtom = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> mapAtom = regAtom.getExtensionToFactoryMap();

		mapRSS.put("rss", new XMIResourceFactoryImpl());
		mapAtom.put("atom", new XMIResourceFactoryImpl());

		ResourceSet resSetRSS = new ResourceSetImpl();
		ResourceSet resSetAtom = new ResourceSetImpl();

		if (!(new File(RSS_TARGET_PATH)).exists()) {
			File f = new File(RSS_TARGET_PATH);
			f.getParentFile().mkdirs();
			try {
				f.createNewFile();
			} catch (IOException e) {
				throw new RuntimeException("Crawler could not create output file " + f.getName() + ".");
			}
		}
		if (!(new File(ATOM_TARGET_PATH)).exists()) {
			File f = new File(ATOM_TARGET_PATH);
			f.getParentFile().mkdirs();
			try {
				f.createNewFile();
			} catch (IOException e) {
				throw new RuntimeException("Crawler could not create output file " + f.getName() + ".");
			}
		}

		this.rssResource = resSetRSS.createResource(URI.createURI(RSS_TARGET_PATH));
		this.atomResource = resSetAtom.createResource(URI.createURI(ATOM_TARGET_PATH));
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
		try {
			this.atomResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Stub! Referring to
	 * http://stackoverflow.com/questions/7591097/determining-whether-a-feed-is-
	 * atom-or-rss
	 * 
	 * TODO Replace with clean and proper implementation
	 * 
	 * @param URL
	 * @return
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 * @throws IOException
	 */
	public static boolean isAtom(String URL) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
		f.setNamespaceAware(true);
		DocumentBuilder builder = f.newInstance().newDocumentBuilder();
		Document doc = builder.parse(URL);
		Element e = doc.getDocumentElement();
		return e.getLocalName().equals("feed") && e.getNamespaceURI().equals("http://www.w3.org/2005/Atom");
	}
	
	@Override
	public void receiveAtomAuthor(Author author) {
		atomResource.getContents().add(author);
	}

	@Override
	public void receiveAtomEntry(Entry entry) {
		atomResource.getContents().add(entry);
	}

	@Override
	public void receiveAtomCategory(Atom.Category category) {
		atomResource.getContents().add(category);
	}

	@Override
	public void receiveAtomFeed(Feed feed) {
		atomResource.getContents().add(feed);
	}

}
