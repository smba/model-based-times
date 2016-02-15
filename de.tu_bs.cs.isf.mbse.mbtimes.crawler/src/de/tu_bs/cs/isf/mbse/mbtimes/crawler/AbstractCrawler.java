package de.tu_bs.cs.isf.mbse.mbtimes.crawler;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

import de.tu_bs.cs.isf.mbse.mbtimes.crawler.feedparser.FeedParser;

public abstract class AbstractCrawler implements Crawler {

	/**
	 * This is the path to the crawler bundle.
	 */
	protected final static String crawlerBundlePathPrefix = Utilities.getBundlePath();
	
	private final static int THREADPOOL_SIZE = 4;

	protected final static Logger log = Logger.getLogger(AbstractCrawler.class.getName());
	
	public final void crawl(List<String> feeds) {
		
		/**
		 * Thread-Pool, in welchem die Threads für die Feed-Parser operieren.
		 */
		ExecutorService executor = Executors.newFixedThreadPool(THREADPOOL_SIZE);

		/** Für jeden Feed wird ein eigener FeedParser gestartet. */
		for (String feed : feeds) {
			Runnable task = null;
			try {
				task = createParser(new URL(feed));
				
				Future<?> future = executor.submit(task);
				
				try {
					future.get();
				} catch (ExecutionException e) {
					log.log(Level.WARNING, "Thread could not be executed!");
				} catch (InterruptedException e) {
					log.log(Level.WARNING, "Connection and(/or execution were interrupted!");
				} catch (NullPointerException e) {
					log.log(Level.SEVERE, "Could not resolve thread address!");
				} catch (StringIndexOutOfBoundsException e) {
					log.log(Level.SEVERE, "Übrlaufsfehler");
				}
				
			} catch (MalformedURLException e) {
				throw new RuntimeException("The URL " + feed + " is malformed. Please check the link.");
			}
		}
		
		executor.shutdown();
		while (!executor.isTerminated()) {
			// wait
		}
	}
	
	abstract protected FeedParser createParser(URL feed);

}
