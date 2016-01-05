package de.tu_bs.cs.isf.mbse.mbtimes.crawler.listener;

import RSS.Category;
import RSS.Channel;
import RSS.Enclosure;
import RSS.Image;
import RSS.Item;
import RSS.RSSFactory;

public interface RSSFeedParserListener extends FeedParserListener {
	
	public void receiveRSSItem(Item item);
	
	public void receiveRSSChannel(Channel channel);
	
	public void receiveRSSEnclosure(Enclosure enclosure);
	
	public void receiveRSSCategory(Category category);
	
	public void receiveRSSImage(Image image);
	
	public RSSFactory getRSSFactory();
	
}