package de.tu_bs.cs.isf.mbse.mbtimes.crawler;

import java.util.List;

/**
 * Interface, welches die Funktionen eines Crawlers beschreibt.
 * 
 * @version 14.01.2016
 */
public interface Crawler {
	
	/**
	 * Speichert alle Feed-Informationen nach Ende des Crawlens in einer 
	 * externen Datei ab.
	 */
	public void dispose();
	
	/**
	 * Startet und orchestriert den Crawlprozess für alle Feeds gleicher Art.
	 * @param feeds List an Feed-URLs, welche gecrawlt werden sollen.
	 */
	public void crawl(List<String> feeds);
	
}
