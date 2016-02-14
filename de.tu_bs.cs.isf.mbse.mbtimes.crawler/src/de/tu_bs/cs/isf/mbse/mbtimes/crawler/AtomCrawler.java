package de.tu_bs.cs.isf.mbse.mbtimes.crawler;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

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
import de.tu_bs.cs.isf.mbse.mbtimes.crawler.feedparser.FeedParser;
import de.tu_bs.cs.isf.mbse.mbtimes.crawler.feedparser.RSSFeedParser;
import de.tu_bs.cs.isf.mbse.mbtimes.crawler.listener.AtomFeedParserListener;

/**
 * Crawler für alle Atom-Feeds.
 * 
 * @version 14.01.2016
 */
public class AtomCrawler extends AbstractCrawler implements AtomFeedParserListener {
	
	/** Factory, mittels welcher Elemente gemäß der Atom.ecore erstellt werden. */
	private AtomFactory atomFactory;
	
	/** Ausgabepfad für die .atom-Datei (XMI) */
	private static final String ATOM_TARGET_PATH = crawlerBundlePathPrefix + "tmp/AtomOutput.atom";

	/** Resource, welche in ATOM_TARGET_PATH ge. bzw. überscrieben wird */
	private Resource atomResource;

	public AtomCrawler() {

		RSSPackage.eINSTANCE.eClass();
		this.atomFactory = AtomFactory.eINSTANCE;

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;

		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("atom", new XMIResourceFactoryImpl());

		ResourceSet resSet = new ResourceSetImpl();

		this.atomResource = resSet.createResource(URI.createURI(ATOM_TARGET_PATH));
	}

	@Override
	public void dispose() {
		try {
			this.atomResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			log.log(Level.WARNING, "Atom resource file may be empty!");
		}
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

	@Override
	public AtomFactory getAtomFactory() {
		return atomFactory;
	}

	@Override
	protected FeedParser createParser(URL feed) {
		return new AtomFeedParser(this, feed);
	}
}
