package de.tu_bs.cs.isf.mbse.mbtimes.crawler;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

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

	@Override
	public void run() {
		
		System.err.println("Started Crawling");
		
		dispatchAndCrawl();
		
		
		// create a dialog with ok and cancel buttons and a question icon
		//Shell shell = Display.getCurrent().getActiveShell()
		MessageBox dialog = 
		  new MessageBox(new Shell(new Display()), SWT.ICON_INFORMATION | SWT.OK);
		dialog.setText("Done");
		dialog.setMessage("Your newspaper is generated!");

		// open dialog and await user selection
		dialog.open(); 

	}
}
