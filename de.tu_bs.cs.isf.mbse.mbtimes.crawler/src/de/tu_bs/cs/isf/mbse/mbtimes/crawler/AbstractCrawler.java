package de.tu_bs.cs.isf.mbse.mbtimes.crawler;

import java.io.File;

import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

public abstract class AbstractCrawler {
	
	protected final static String crawlerBundlePathPrefix = getBundlePath();
	
	protected final static String getBundlePath() {
		
		final String crawlerBundlePathPrefix;
		Bundle bundle = Platform.getBundle("de.tu_bs.cs.isf.mbse.mbtimes.crawler");
		
		int begin = bundle.getLocation().indexOf("/");
		crawlerBundlePathPrefix = bundle.getLocation().substring(begin);
		String prefix = (new File("dummy")).getAbsolutePath(); 
		if(Platform.getOS().compareTo(Platform.OS_WIN32) == 0) {
			prefix = prefix.substring(0,  prefix.lastIndexOf('\\') + 2);
		} else {
			prefix = prefix.substring(0,  prefix.lastIndexOf('/') + 1); 
		}
		return crawlerBundlePathPrefix.substring(prefix.length(), crawlerBundlePathPrefix.length());
	}
}
