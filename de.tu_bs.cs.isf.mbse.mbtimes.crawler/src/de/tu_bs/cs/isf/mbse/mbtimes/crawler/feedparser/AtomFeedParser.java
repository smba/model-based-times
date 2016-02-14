package de.tu_bs.cs.isf.mbse.mbtimes.crawler.feedparser;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.sun.syndication.feed.synd.SyndCategory;
import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.FeedException;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;

import Atom.AtomFactory;
import Atom.AtomPackage;
import Atom.Category;
import Atom.Entry;
import Atom.Feed;
import de.l3s.boilerpipe.BoilerpipeProcessingException;
import de.tu_bs.cs.isf.mbse.mbtimes.crawler.AtomCrawler;
import de.tu_bs.cs.isf.mbse.mbtimes.crawler.listener.AtomFeedParserListener;

/**
 * Parser dedicated to a single Atom feeds.
 * 
 * @version 14.01.2016
 */
public class AtomFeedParser extends AbstractFeedParser {

	/** Logger for this class */
	private static final Logger log = Logger.getLogger(AtomCrawler.class.getName());
	
	private AtomFeedParserListener listener;
	private URL url;
	private AtomFactory factory;

	public AtomFeedParser(AtomFeedParserListener atomCrawler, URL url) {
		this.listener = atomCrawler;
		this.url = url;
		this.factory = listener.getAtomFactory();
	}

	@Override
	public void run() {
		System.out.println("Parsing " + url);
		HttpURLConnection httpcon = null;
		try {
			httpcon = (HttpURLConnection) this.url.openConnection();
		} catch (IOException e) {
			log.log(Level.SEVERE, "Could not establish connection to feed " + url + ".");
		}

		SyndFeedInput input = new SyndFeedInput();
		SyndFeed feed = null;

		try {
			feed = input.build(new XmlReader(httpcon));
		} catch (IllegalArgumentException | FeedException | IOException | NullPointerException e) {
			log.log(Level.SEVERE, "Could not read feed " + url + ".");
		}

		/*
		 * Channel [RSS]
		 */
		Feed atomFeed = this.factory.createFeed();

		atomFeed.setTitle(feed.getTitle());
		// atomFeed.setIcon(feed.getImage().getLink()); //TODO observe
		atomFeed.setId(feed.getUri());
		atomFeed.setLink(feed.getLink());
		atomFeed.setSubtitle(feed.getDescription());
		atomFeed.setTitle(feed.getTitle());
		atomFeed.setUpdated(feed.getPublishedDate());

		/*
		 * if (feed.getImage() != null) {
		 * 
		 * System.out.println(feed.getImage());
		 * 
		 * SyndImage feedImage = feed.getImage(); Image image =
		 * this.factory.createImage(); image.setTitle(feedImage.getTitle());
		 * image.setUrl(feed.getLink()); //oder URI?
		 * 
		 * //dispose image to listener this.listener.receiveRSSImage(image); }
		 */

		/*
		 * Dispose feed to listener
		 */
		this.listener.receiveAtomFeed(atomFeed);

		List<?> entries = feed.getEntries();
		Iterator<?> itEntries = entries.iterator();

		while (itEntries.hasNext()) {
			Object next = itEntries.next();
			if (next instanceof SyndEntry) {

				SyndEntry syndEntry = (SyndEntry) next;

				/*
				 * Item [RSS]
				 */
				Entry entry = this.factory.createEntry();
				entry.setId(syndEntry.getUri());
				entry.setLink(syndEntry.getLink());
				entry.setPublished(syndEntry.getPublishedDate());
				// entry.setRights(syndEntry.);
				entry.setSummary(syndEntry.getDescription().getValue());
				entry.setTitle(syndEntry.getTitle());
				entry.setUpdated(syndEntry.getUpdatedDate());
				

				/*
				 * Try to retrieve the full text
				 */
				try {
					String content = super.getText(new URL(entry.getLink()));
					entry.setContent(content);
				} catch (BoilerpipeProcessingException e) {
					/**
					 * Exception handling:
					 * If the getText() method returns an IOException, 
					 * we could not retrieve the fulltext. Therefore, the crawling job 
					 * for the corresponding article is discarded.
					 */
					
					/*
					 * Could not retrieve fulltext, continue with next article in feed.
					 */
					log.log(Level.WARNING, "Could not retrieve fulltext for article " + entry.getLink() + ". Discarding article...");
					continue;
					
				} catch (MalformedURLException e) {
					log.log(Level.WARNING, "Malformed URL, discarding article.");
					continue;
				}

				/*
				 * Connect feed and entry
				 */
				entry.setFeed(atomFeed);

				for (Object o : entry.getCategories()) {

					SyndCategory syndCategory = null;
					if (o instanceof List<?>) {
						syndCategory = (SyndCategory) o;

						Category category = factory.createCategory();
						category.setLabel(syndCategory.getName());
						category.setScheme(syndCategory.getTaxonomyUri());
						// category.setTerm();

						/*
						 * Dispose category
						 */
						this.listener.receiveAtomCategory(category);

						/*
						 * Link item to category
						 */
						entry.getCategories().add(category);

					}
				}

				/*
				 * Dispose entry to listener
				 */
				listener.receiveAtomEntry(entry);
			}
		}
	}

	@Override
	public void initialize() {
		/*
		 * Register factory
		 */
		AtomPackage.eINSTANCE.eClass();
		this.factory = AtomFactory.eINSTANCE;
	}

}