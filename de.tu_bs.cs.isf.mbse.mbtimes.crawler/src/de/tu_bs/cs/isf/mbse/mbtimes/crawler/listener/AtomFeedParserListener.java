package de.tu_bs.cs.isf.mbse.mbtimes.crawler.listener;

/*
 * TODO refactor arguments
 */

/**
 * @author Stefan Mühlbauer <s.muehlbauer@tu-bs.de>
 * 
 */
public interface AtomFeedParserListener {
	
	public void receiveAtomAuthor(/*Author author */);
	
	public void receiveAtomEntry(/* Entry entry*/);
	
	public void receiveAtomCategory(/*Category category*/);
	
	public void receiveAtomFeed(/* Feed feed*/);
	
}
