package de.tu_bs.cs.isf.mbse.mbtimes.crawler.feedparser;

import java.net.URL;

import RSS.RSSFactory;
import de.tu_bs.cs.isf.mbse.mbtimes.crawler.listener.AtomFeedParserListener;
import de.tu_bs.cs.isf.mbse.mbtimes.crawler.listener.RSSFeedParserListener;

public class AtomFeedParser extends AbstractFeedParser {
	
	private AtomFeedParserListener listener;
	private URL url;
	private RSSFactory factory;

	public AtomFeedParser(AtomFeedParserListener listener, URL link) {
		this.listener = listener;
		this.url = link;
		initialize();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub
		
	}

}
