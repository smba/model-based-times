package de.tu_bs.cs.isf.mbse.mbtimes.crawler.feedparser;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.sun.syndication.feed.synd.SyndCategory;
import com.sun.syndication.feed.synd.SyndEnclosure;
import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.feed.synd.SyndImage;
import com.sun.syndication.io.FeedException;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;

import RSS.Category;
import RSS.Channel;
import RSS.Image;
import RSS.Item;
import RSS.Language;
import RSS.RSSFactory;
import RSS.RSSPackage;
import de.l3s.boilerpipe.BoilerpipeProcessingException;
import de.tu_bs.cs.isf.mbse.mbtimes.crawler.AtomCrawler;
import de.tu_bs.cs.isf.mbse.mbtimes.crawler.listener.RSSFeedParserListener;

import de.tu_bs.cs.isf.mbse.mbtimes.crawler.feedparser.ImageDownloader;
/**
 * Parser dedicated to a single RSS feeds.
 * 
 * @version 14.01.2016
 */
public class RSSFeedParser extends AbstractFeedParser {

	/** Logger for this class */
	private static final Logger log = Logger.getLogger(AtomCrawler.class.getName());
	
	private RSSFeedParserListener listener;
	private URL url;
	private RSSFactory factory;

	public RSSFeedParser(RSSFeedParserListener listener, URL link) {
		this.listener = listener;
		this.url = link;
		this.factory = listener.getRSSFactory();
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
		Channel channel = this.factory.createChannel();

		channel.setTitle(feed.getTitle());
		channel.setDescription(feed.getDescription());
		channel.setLink(feed.getLink());

		channel.setLanguage(Language.ENGLISH); // TODO

		channel.setCopyright(feed.getCopyright());
		channel.setManagingEditor(feed.getAuthor());
		channel.setPubDate(feed.getPublishedDate());
		channel.setLastBuild(feed.getPublishedDate()); // TODO same

		if (feed.getImage() != null) {

			System.out.println(feed.getImage());

			SyndImage feedImage = feed.getImage();
			Image image = this.factory.createImage();
			image.setTitle(feedImage.getTitle());
			image.setUrl(feedImage.getLink());

			// dispose image to listener
			this.listener.receiveRSSImage(image);
		}

		/*
		 * Dispose channel to listener
		 */
		this.listener.receiveRSSChannel(channel);
		List<SyndEntry> entries = (feed.getEntries() instanceof List<?>) ? (List<SyndEntry>)feed.getEntries() : null;
		
		
		Iterator<SyndEntry> itEntries = entries.iterator();

		while (itEntries.hasNext()) {
			Object next = itEntries.next();
			if (next instanceof SyndEntry) {

				SyndEntry entry = (SyndEntry) next;

				/*
				 * Item [RSS]
				 */
				Item item = this.factory.createItem();
				item.setAuthor(entry.getAuthor());
				item.setTitle(entry.getTitle());
				item.setLink(entry.getLink());
				item.setDescription(entry.getDescription().getValue()); 
				item.setGuid(entry.getUri());
				item.setPubDate(entry.getPublishedDate());
				
				
				if (entry.getEnclosures().size() > 0) {
					System.err.println("Found enclosure for article...");
					
					Object element = entry.getEnclosures().get(0);
					
					SyndEnclosure enclosure = null;
					if (element instanceof SyndEnclosure) {
						enclosure = (SyndEnclosure) element;
						System.out.println(enclosure.getUrl());
					} else {
						System.out.println("enclosure wasn't a SyndEnclosure");
					}
					
					try {
						// TODO @Flo please code enclosure here
						
						System.err.println("Found enclosure " + enclosure.getUrl() + " " + enclosure.getType());
						MessageDigest md = MessageDigest.getInstance("MD5");
						md.digest(enclosure.getUrl().getBytes());
						ImageDownloader.downloadFile(md.toString() + ".jpg", enclosure.getUrl());
						System.err.println("saved enclosure as " + md.toString() + ".jpg");
						/*
						Enclosure enclosure = this.factory.createEnclosure();
						enclosure.setType
						item.setEnclosure()
						*/
					} catch (NullPointerException e) {
						log.log(Level.INFO, "Enclosure for article " + entry.getLink() + " is malformed.");
					} catch (NoSuchAlgorithmException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
				} else {
					log.log(Level.WARNING, "No enclosure found for article " + entry.getLink() + ".");
				}
				

				/*
				 * Try to retrieve the full text
				 */
				try {
					String content = super.getText(new URL(entry.getLink()));
					item.setFulltext(content);
					
				
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
					System.err.println("Could not retrieve fulltext for article " + entry.getLink() + ". Discarding article...");
					continue;
				} catch (MalformedURLException e) {
					System.err.println("Malformed URL, discarding article.");
					continue;
				}

				/*
				 * Connect channel and item
				 */
				item.setChannel(channel);

				for (Object o : entry.getCategories()) {

					SyndCategory syndCategory = null;
					if (o instanceof List<?>) {
						syndCategory = (SyndCategory) o;

						Category category = factory.createCategory();
						category.setCategory(syndCategory.getName());
						category.setDomain(syndCategory.getTaxonomyUri());

						/*
						 * Dispose category
						 */
						this.listener.receiveRSSCategory(category);

						/*
						 * Link item to category
						 */
						item.getCategories().add(category);

					}
				}

				/*
				 * Dispose item to listener
				 */
				listener.receiveRSSItem(item);
			}
		}
	}

	@Override
	public void initialize() {
		/*
		 * Register factory
		 */
		RSSPackage.eINSTANCE.eClass();
		this.factory = RSSFactory.eINSTANCE;
	}
}