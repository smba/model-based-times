package de.tu_bs.cs.isf.mbse.mbtimes.crawler.feedparser;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
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
import RSS.Enclosure;
import RSS.Image;
import RSS.Item;
import RSS.Language;
import RSS.RSSFactory;
import RSS.RSSPackage;
import de.l3s.boilerpipe.BoilerpipeProcessingException;
import de.tu_bs.cs.isf.mbse.mbtimes.crawler.AtomCrawler;
import de.tu_bs.cs.isf.mbse.mbtimes.crawler.listener.RSSFeedParserListener;

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

	@SuppressWarnings("unchecked")
	@Override
	public void run() {

		log.log(Level.INFO, "Parsing " + url);

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
		List<?> entries = (feed.getEntries() instanceof List<?>) ? (List<?>) feed.getEntries() : null;

		Iterator<?> itEntries = entries.iterator();

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
	
				// (Object element = entry.getEnclosures().get(0);
				List<?> enclosures = entry.getEnclosures();

				if (enclosures.size() == 0) {
					log.log(Level.INFO, "No enclosures found for article");
				} else {
					log.log(Level.INFO, "Found enclosure for article...");
				}

				Enclosure itemEnclosure = this.factory.createEnclosure();
				itemEnclosure.setUrls(new HashMap<String, String>());

				for (Object enclosure : enclosures) {
					if (enclosure instanceof SyndEnclosure) {
						SyndEnclosure enclosureRome = (SyndEnclosure) enclosure;

						if (enclosureRome.getType().startsWith("image")) {

							try {

								/*
								 * Map: Enclosure (image/x) url to concrete MIME
								 * type (e.g., image/jpeg)
								 */

								final String md5hash = ImageDownloader.md5(enclosureRome.getUrl());

								final String type = enclosureRome.getType();
								final String suffix = type.substring(type.indexOf('/') + 1);

								ImageDownloader.downloadFile(md5hash + "." + suffix, enclosureRome.getUrl());

								assert (enclosureRome.getUrl() != null) && (enclosureRome.getType() != null);
								itemEnclosure.getUrls().put((String) enclosureRome.getUrl(), (String) enclosureRome.getType());

							} catch (IOException e) {
								log.log(Level.WARNING, "Could not retrieve image file " + enclosureRome.getUrl());
							}
						}
					}
				}

				item.setEnclosure(itemEnclosure);

				/*
				 * Try to retrieve the full text
				 */
				try {
					String content = super.getText(new URL(entry.getLink()));
					item.setFulltext(content);

				} catch (BoilerpipeProcessingException e) {
					/**
					 * Exception handling: If the getText() method returns an
					 * IOException, we could not retrieve the fulltext.
					 * Therefore, the crawling job for the corresponding article
					 * is discarded.
					 */

					/*
					 * Could not retrieve fulltext, continue with next article
					 * in feed.
					 */
					System.err.println(
							"Could not retrieve fulltext for article " + entry.getLink() + ". Discarding article...");
					continue;
				} catch (MalformedURLException e) {
					log.log(Level.SEVERE, "Malformed URL, discarding article.");
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