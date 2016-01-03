package de.tu_bs.cs.isf.mbse.mbtimes.crawler;

import java.util.List;

public interface Crawler {
	
	public void dispose();
	
	public void crawl(List<String> feeds);
	
}
