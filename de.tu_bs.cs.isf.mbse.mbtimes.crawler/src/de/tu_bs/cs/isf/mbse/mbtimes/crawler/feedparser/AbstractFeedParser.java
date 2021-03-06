package de.tu_bs.cs.isf.mbse.mbtimes.crawler.feedparser;

import java.io.IOException;
import java.net.URL;


import de.l3s.boilerpipe.BoilerpipeProcessingException;
import de.l3s.boilerpipe.extractors.ArticleExtractor;

/**
 * Diese Klasse kapselt die Funktionen, die allen Feedparser gemein sind, sprich das Parsen von Volltext (sofern notwendig)
 * als auch die Auf- und Nachbereitung der geparsten Informationen. Dazu gehören:
 * 
 * - Das Erfassen von Volltext auf der Zielseite mittels der Boilerpipe-Bibliothek (de.l3s.boilerpipe)
 * - TODO Entfernen von (X)HTML-Tags
 * 
 * @version 14.01.2016
 *
 */
public abstract class AbstractFeedParser implements FeedParser {
		
	//protected static String imagePath;

	
	@Override
	abstract public void run();

	/**
	 * Retrieves the full text of an article specified by the given URL url.
	 * 
	 * @param url
	 * @return
	 * @throws IOException
	 * @throws BoilerpipeProcessingException 
	 */
	protected final String getText(URL url) throws BoilerpipeProcessingException {
		String text = "";
		text = ArticleExtractor.getInstance().getText(url);
		return text;
	}
	
//	public static final void setImagePath(String path) {
//		imagePath = path;
//	}
	
	abstract public void initialize();

}