package de.tu_bs.cs.isf.mbse.mbtimes.crawler;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*
 * Verteilt Aufträge auf verschiedene Crawler
 */
public class CrawlerDispatcher {

	private Crawler atomCrawler;
	private Crawler rssCrawler;

	public CrawlerDispatcher() {
		atomCrawler = new AtomCrawler();
		rssCrawler = new RSSCrawler();
	}

	public void dispatchAndCrawl(Map<String, String> feeds) {
		List<String> rssFeeds = new LinkedList<String>();
		List<String> atomFeeds = new LinkedList<String>();

		for (String feed : feeds.keySet()) {
			switch (feeds.get(feed)) {
			case "RSS":
				rssFeeds.add(feed);
				break;
			case "Atom":
				atomFeeds.add(feed);
				break;
			default:
				break;
			}
		}

		// Feed crawlers
		this.atomCrawler.crawl(atomFeeds);
		this.rssCrawler.crawl(rssFeeds);

		// Write stuff
		this.atomCrawler.dispose();
		this.rssCrawler.dispose();

	}

	public static void main(String[] args) {
		Map<String, String> feeds = new HashMap<String, String>();
		feeds.put("http://heise.de.feedsportal.com/c/35207/f/653902/index.rss", "RSS");
		feeds.put("http://www.heise.de/developer/rss/news-atom.xml", "Atom");

		CrawlerDispatcher cd = new CrawlerDispatcher();
		cd.dispatchAndCrawl(feeds);
	}

}
