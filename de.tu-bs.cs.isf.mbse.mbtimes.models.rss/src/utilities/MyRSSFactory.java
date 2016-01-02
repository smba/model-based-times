package utilities;


import java.util.LinkedList;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import RSS.Item;
import RSS.RSSPackage;
import RSS.impl.RSSPackageImpl;

public class MyRSSFactory {
	public static void main(String[] args) {
		load();
	}
	
	public static void load() {
	    // Initialize the model
	    RSSPackage.eINSTANCE.eClass();
	    
	    // Register the XMI resource factory for the .website extension

	    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("rss", new XMIResourceFactoryImpl());

	    // Obtain a new resource set
	    ResourceSet resSet = new ResourceSetImpl();

	    // Get the resource
	    Resource resource = resSet.getResource(URI
	        .createURI("./data/crawled.rss"), true);
	    // Get the first model element and cast it to the right type, in my
	    // example everything is hierarchical included in this first node
	    LinkedList<RSS.Item> rssItems = new LinkedList<RSS.Item>();
	    for(int i = 0; i < resource.getContents().size(); i++) {
	    	if(resource.getContents().get(i) instanceof RSS.Item) {
		    	RSS.Item current = (RSS.Item) resource.getContents().get(i);
		    	rssItems.add(current);
		    	 System.out.println(current.getTitle());
	    	}

	    }
	    
	   
	  }

}