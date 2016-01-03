package de.tu_bs.cs.isf.mbse.mbtimes.crawler.listener;

import Atom.AtomFactory;
import Atom.Author;
import Atom.Category;
import Atom.Entry;
import Atom.Feed;

/*
 * TODO refactor arguments
 */

/**
 * @author Stefan Mühlbauer <s.muehlbauer@tu-bs.de>
 * 
 */
public interface AtomFeedParserListener {
	
	public AtomFactory getAtomFactory();
	
	public void receiveAtomAuthor(Author author);
	
	public void receiveAtomEntry(Entry entry);
	
	public void receiveAtomCategory(Category category);
	
	public void receiveAtomFeed(Feed feed);
	
}