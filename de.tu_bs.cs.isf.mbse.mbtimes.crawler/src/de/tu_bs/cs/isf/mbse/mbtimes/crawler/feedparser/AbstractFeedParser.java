package de.tu_bs.cs.isf.mbse.mbtimes.crawler.feedparser;

import java.io.IOException;
import java.net.URL;

import de.l3s.boilerpipe.BoilerpipeProcessingException;
import de.l3s.boilerpipe.extractors.ArticleExtractor;

public abstract class AbstractFeedParser implements FeedParser, Runnable {
		
	@Override
	abstract public void run();

	/**
	 * Retrieves the full text of an article specified by the given URL url.
	 * 
	 * @param url
	 * @return
	 * @throws IOException
	 */
	protected String getText(URL url) throws IOException {
		String text = "";
		try {
			text = ArticleExtractor.getInstance().getText(url);
		} catch (BoilerpipeProcessingException e) {
			throw new IOException(e);
		}
		return text;
	}
	
	abstract public void initialize();

}
