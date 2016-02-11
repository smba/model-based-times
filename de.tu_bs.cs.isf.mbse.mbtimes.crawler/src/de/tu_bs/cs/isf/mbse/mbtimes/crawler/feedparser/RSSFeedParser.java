package de.tu_bs.cs.isf.mbse.mbtimes.crawler.feedparser;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import com.sun.syndication.feed.synd.SyndCategory;
import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.feed.synd.SyndImage;
import com.sun.syndication.io.FeedException;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;

import RSS.Category;
import RSS.Channel;
import RSS.Enclosure;
import RSS.Image;
import RSS.Item;
import RSS.Language;
import RSS.RSSFactory;
import RSS.RSSPackage;
import de.tu_bs.cs.isf.mbse.mbtimes.crawler.listener.RSSFeedParserListener;

/**
 * Parser dedicated to a single RSS feeds.
 * 
 * @version 14.01.2016
 */
public class RSSFeedParser extends AbstractFeedParser {

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
		HttpURLConnection httpcon;
		try {
			httpcon = (HttpURLConnection) this.url.openConnection();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		SyndFeedInput input = new SyndFeedInput();
		SyndFeed feed;

		try {
			feed = input.build(new XmlReader(httpcon));
		} catch (IllegalArgumentException | FeedException | IOException e) {
			throw new RuntimeException(e);
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
					System.err.println("Found enclosure for article");
					
					Object element = entry.getEnclosures().get(0);
					
					/*
					Enclosure enclosure = this.factory.createEnclosure();
					enclosure.setType
					item.setEnclosure()
					*/
				} else {
					System.err.println("No enclosure found for article");
				}
				

				/*
				 * Try to retrieve the full text
				 */
				try {
					String content = super.getText(new URL(entry.getLink()));
					item.setFulltext(content);
					
				
				} catch (IOException e) {
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