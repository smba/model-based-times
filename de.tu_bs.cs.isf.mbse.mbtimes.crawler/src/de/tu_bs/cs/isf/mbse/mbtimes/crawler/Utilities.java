package de.tu_bs.cs.isf.mbse.mbtimes.crawler;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

abstract public class Utilities {
	
	/** Berechnen des obigen Pfads:
	 *  Die Idee ist,  dass wir zunächst den absoluten Pfad 
	 *  zum Plugin von der Wurzel des Dateisystems aus suchen.
	 *  Dann suchen wir den Ausführungspunkt des Programms, indem 
	 *  wir eine Dummy-Datei anlegen. Nun schneiden wir den 
	 *  Pfad zum Ausführungspunkt vom absoluten Pfad zum Plugin ab.
	 *  */
	public final static String getBundlePath() {
		final String crawlerBundlePathPrefix;
		Bundle bundle = Platform.getBundle("de.tu_bs.cs.isf.mbse.mbtimes.crawler");
		
		int begin = bundle.getLocation().indexOf("/");
		if(Platform.getOS().compareTo(Platform.OS_WIN32) == 0) {
			crawlerBundlePathPrefix = bundle.getLocation().substring(begin+1);
		} else {
			crawlerBundlePathPrefix = bundle.getLocation().substring(begin);
		}
		String prefix = (new File("dummy")).getAbsolutePath(); 
		if(Platform.getOS().compareTo(Platform.OS_WIN32) == 0) {
			prefix = prefix.substring(0,  prefix.lastIndexOf('\\') + 1);
		} else {
			prefix = prefix.substring(0,  prefix.lastIndexOf('/') + 1); 
		}
		
		Path p1 = Paths.get(crawlerBundlePathPrefix);
		Path p2 = Paths.get(prefix);
		return p2.relativize(p1).toString() + "/";
		//return crawlerBundlePathPrefix.substring(prefix.length(), crawlerBundlePathPrefix.length());
	}
}
