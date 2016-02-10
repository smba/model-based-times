package de.tu_bs.cs.isf.mbse.mbtimes.crawler;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Observable;

import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;

/**
 * Diese Klasse nimmt Aufträge zum Crawlen entgegen und verteilt diese
 * entsprechend der Art des Feeds (RSS, Atom) auf einen speziellen Crawler.
 * Anschließend werden die gesammelten Feedinformationen gebündelt und als
 * Instanzen gemäß der Metamodelle (RSS, Atom) als XMI-Datei abgespeichert.
 * 
 * evtl. TODO Zusammenführung der
 * beiden ausgegebenen Unified-Intanzen zu einer einzigen Instanz
 * 
 * @version 21.01.2016
 */
public class CrawlerDispatcher extends Observable implements Runnable {

	/** Crawler für Atom-Feeds */
	private Crawler atomCrawler;

	/** Crawler für RSS-Feeds */
	private Crawler rssCrawler;
	
	private Map<String, String> feeds;

	public CrawlerDispatcher() {
		atomCrawler = new AtomCrawler();
		rssCrawler = new RSSCrawler();
	}

	
	public void initialize(Map<String, String> feeds) {
		this.feeds = feeds;
	}
	/**
	 * Diese Methode initialisiert und startet den Crawlvorgang. Übergeben wird
	 * eine Map von Strings auf Strings, wobei die Feed-URL auf den Typ des
	 * Feeds (als String), also entweder "RSS" oder "Atom" abgebildet wird. <br
	 * \><br \>
	 * 
	 * Beispiel:<br \> <tt>CrawlerDispatcher cd = new CrawlerDispatcher();<br \>
	 * Map<String, String> feeds = new HashMap<String, String>();<br \>
	 * feeds.put("http://www.tseit.de/index/rss", "RSS");
	 * 
	 * cd.dispatchAndCrawl(feeds);
	 * </tt>
	 * 
	 * @param feeds
	 */
	public void dispatchAndCrawl() {
		List<String> rssFeeds = new LinkedList<String>();
		List<String> atomFeeds = new LinkedList<String>();

		/*
		 * Aufteilen der Feeds auf die einzelnen speziellen Crawler
		 */
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
		/*
		/*
		 * Starten der einzelnen Crawler
		 */
		this.atomCrawler.crawl(atomFeeds);
		this.rssCrawler.crawl(rssFeeds);

		/*
		 * Schreiben der Ausgabe in Dateien
		 */
		this.atomCrawler.dispose();
		this.rssCrawler.dispose();

		/*
		 * Triggern des Ausführens der automatisierten M2M-Transformationen 
		 * (RSS -> Unified, Atom -> Unified)
		 */
		setChanged();
		notifyObservers();
		
	}
	
	private int pressedbtn = 0;

	@Override
	public void run() {
		
		Display display = Display.getCurrent();
	    //may be null if outside the UI thread
	    if (display == null) {
	    	System.out.println("test1");
	       display = Display.getDefault();
	    }
	    if (display == null) {
	    	System.out.println("test2");
	    	display = new Display();
	    }
	    
	    display.syncExec(new Runnable() {

			@Override
			public void run() {
				MessageBox startDialog = new MessageBox(new Shell(), SWT.ICON_QUESTION | SWT.YES | SWT.NO);
				
				if(Platform.getNL().contains("de")) {
					startDialog.setText("Zeitungserstellung");
					startDialog.setMessage("Soll jetzt deine Zeitung erstellt werden?");		
				} else {
					startDialog.setText("Start Generation");
					startDialog.setMessage("Should your newspaper be generated, now?");
				}
				// open dialog and await user selection
				pressedbtn = startDialog.open(); 
			}
	    	
	    });	    
	    
		if(pressedbtn == SWT.NO) {
			return;
		}
		
		System.err.println("Started Crawling");
		dispatchAndCrawl();
		
		display.asyncExec(new Runnable() {

			@Override
			public void run() {
				MessageBox endDialog = new MessageBox(new Shell(), SWT.ICON_INFORMATION | SWT.OK);
				if(Platform.getNL().contains("de")) {
					endDialog.setText("Fertig");
					endDialog.setMessage("Deine Zeitung wurde erstellt!");		
				} else {
					endDialog.setText("Done");
					endDialog.setMessage("Your newspaper is generated!");
				}
				endDialog.open(); 
			}
	    	
	    });
		
		

	}
}
