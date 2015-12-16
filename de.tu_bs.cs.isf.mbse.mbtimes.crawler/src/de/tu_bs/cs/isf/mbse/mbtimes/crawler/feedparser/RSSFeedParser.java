package de.tu_bs.cs.isf.mbse.mbtimes.crawler.feedparser;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
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
import RSS.Image;
import RSS.Item;
import RSS.Language;
import RSS.RSSFactory;
import RSS.RSSPackage;
import de.l3s.boilerpipe.BoilerpipeProcessingException;
import de.l3s.boilerpipe.extractors.ArticleExtractor;
import de.tu_bs.cs.isf.mbse.mbtimes.crawler.listener.RSSFeedParserListener;

public class RSSFeedParser extends AbstractFeedParser {

	private RSSFeedParserListener listener;
	private URL url;
	private RSSFactory factory;
	
	public RSSFeedParser(RSSFeedParserListener listener, String link) {
		this.listener = listener;
		try {
			this.url = new URL(link);
		} catch (MalformedURLException e) {
			throw new RuntimeException(e);
		}
		
		/*
		 * Register factory
		 */
		RSSPackage.eINSTANCE.eClass();
	    this.factory = RSSFactory.eINSTANCE;
	}
	
	@Override
	public void run() {
		
		System.err.println("scraping " + this.url.toString());
		
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
		channel.setLanguage(Language.ENGLISH); //TODO
		channel.setCopyright(feed.getCopyright());
		channel.setManagingEditor(feed.getAuthor());
		channel.setPubDate(feed.getPublishedDate());
		channel.setLastBuild(feed.getPublishedDate()); //TODO same
		
		
		SyndImage feedImage = feed.getImage();
		Image image = this.factory.createImage();
		image.setTitle(feedImage.getTitle());
		image.setUrl(feed.getLink()); //oder URI?
		
		
		/*
		 * Dispose image and channel to listener
		 */
		this.listener.receiveRSSImage(image);
		this.listener.receiveRSSChannel(channel);
		
		List<SyndEntry> entries = feed.getEntries();
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
				item.setDescription(entry.getDescription().toString()); //Test
				item.setGuid(entry.getUri()); //Is this the proper attribute?
				item.setPubDate(entry.getPublishedDate());
				
				/*
				 * Try to retrieve the full text
				 */
				try {
					String content = super.getText(new URL(entry.getLink()));
					//TODO link content to item
				} catch (IOException e) {
					throw new RuntimeException(e);
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
}
