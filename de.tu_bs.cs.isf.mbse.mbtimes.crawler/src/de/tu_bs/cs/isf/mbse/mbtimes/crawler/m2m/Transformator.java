package de.tu_bs.cs.isf.mbse.mbtimes.crawler.m2m;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFExtractor;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFReferenceModel;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;
import org.osgi.framework.Bundle;

/**
 * Diese Klasse automatisiert die Model-to-Model-Transformationen 
 * mit ATL. 
 * 
 * @version 21.01.2016
 *
 */
public class Transformator implements Observer {

	private static Transformator instance;
	
	private Transformator() {}
	
	public static Transformator getInstance() {
		if (instance == null) {
			instance = new Transformator();
		}
		return instance;
	}
	
	/*
	 * Pfad zum Crawler-Bundle
	 */
	private static String crawlerBundlePathPrefix;
	static {
		Bundle bundle = Platform.getBundle("de.tu_bs.cs.isf.mbse.mbtimes.crawler");
		int begin = bundle.getLocation().indexOf("/");
		crawlerBundlePathPrefix = bundle.getLocation().substring(begin);
		System.out.println("dingens" + crawlerBundlePathPrefix);
		
		//EventActivator.getInstance().getInjector("de.tu_bs.cs.isf.mbse.mbtimes.crawler").injectMembers(this);
	
		String snippet;
		try {
			snippet = Transformator.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
			System.err.println(snippet + " +++");
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} 
	
	/*
	 * Pfade zu den Metamodellen
	 */
	private static final String 
		rssMetaModelPath = "platform:/plugin/de.tu-bs.cs.isf.mbse.mbtimes.models.rss/model/RSS.ecore", 
		atomMetaModelPath = "platform:/plugin/de.tu-bs.cs.isf.mbse.mbtimes.models.atom/model/Atom.ecore", 
		targetMetaModelPath = "platform:/plugin/de.tu-bs.cs.isf.mbse.mbtimes.models.unified/model/unified.ecore";

	/*
	 * Pfade zu den Ausgangsdaten (Ausgabedaten der Crawler) [.rss/.atom]
	 */
	private static final String 
		rssModelPath = "platform:/plugin/de.tu_bs.cs.isf.mbse.mbtimes.crawler/tmp/RssOutput.rss", 
		atomModelPath = "platform:/plugin/de.tu_bs.cs.isf.mbse.mbtimes.crawler/tmp/AtomOutput.atom";

	/*
	 * Pfade zu den Ausgabedaten (Unified), je einer fuer Atom und RSS
	 */
	private static final String 
		rssTargetPath = "git/model-based-times/de.tu_bs.cs.isf.mbse.mbtimes.crawler/tmp/unifiedRSS.unified", 
		atomTargetPath = "git/model-based-times/de.tu_bs.cs.isf.mbse.mbtimes.crawler/tmp/unifiedAtom.unified";
	
	/*
	 * Pfad zu den ATL-Transformationen (kompiliert, also .asm)
	 */
	private static final String 
		rss2unifiedPath = crawlerBundlePathPrefix + "/transformation/RSS2Unified.asm",
		atom2unifiedPath = crawlerBundlePathPrefix + "/transformation/Atom2Unified.asm";

	/**
	 * Template fuer ATL-Transformationen.
	 * 
	 * @param sourceMetaModelPath
	 * @param targetMetaModelPath
	 * @param sourceModelPath
	 * @param targetModelPath
	 * @param trafoPath
	 * @param inName either "Atom" or "RSS"
	 */
	private void transform(String sourceMetaModelPath, String targetMetaModelPath,
			String sourceModelPath, String targetModelPath, String trafoPath, String inName) {

		try {
			ILauncher transformationLauncher = new EMFVMLauncher();
			ModelFactory modelFactory = new EMFModelFactory();
			IInjector injector = new EMFInjector();
			IExtractor extractor = new EMFExtractor();

			/*
			 * Load metamodels
			 */
			IReferenceModel sourceMetaModel = modelFactory.newReferenceModel();
			injector.inject(sourceMetaModel, sourceMetaModelPath);
			IReferenceModel targetMetaModel = modelFactory.newReferenceModel();
			injector.inject(targetMetaModel, targetMetaModelPath);

			/*
			 * Run "Cut" transformation
			 */
			IModel sourceModel = modelFactory.newModel(sourceMetaModel);
			IModel targetModel = modelFactory.newModel(targetMetaModel);
			injector.inject(sourceModel, sourceModelPath);

			transformationLauncher.initialize(new HashMap<String, Object>());
			transformationLauncher.addInModel(sourceModel, "IN", inName);
			transformationLauncher.addOutModel(targetModel, "OUT", "Unified");
			transformationLauncher.launch(ILauncher.RUN_MODE, new NullProgressMonitor(), new HashMap<String, Object>(),
					new FileInputStream(trafoPath));

			IModel companyModel_Cut = sourceModel;
			System.out.println(targetModelPath);
			extractor.extract(targetModel, targetModelPath);

			/*
			 * Unload all models and metamodels (EMF-specific)
			 */
			EMFModelFactory emfModelFactory = (EMFModelFactory) modelFactory;
			emfModelFactory.unload((EMFModel) companyModel_Cut);
			emfModelFactory.unload((EMFReferenceModel) sourceMetaModel);
			emfModelFactory.unload((EMFReferenceModel) targetMetaModel);

		} catch (ATLCoreException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Fuehrt die RSS-To-Unified-Transformation aus
	 */
	public void transformRSStoUnified() {
		System.out.println("### " + (new File("test")).getAbsolutePath());
		transform(rssMetaModelPath, targetMetaModelPath, rssModelPath, rssTargetPath, rss2unifiedPath, "RSS");
	}
	
	/**
	 * Fuehrt die Ato-To-Unified-Transformation aus
	 */
	public void transformAtomToUnified() {
		transform(atomMetaModelPath, targetMetaModelPath, atomModelPath, atomTargetPath, atom2unifiedPath, "Atom");
	}

	@Override
	public void update(Observable o, Object arg) {
		transformAtomToUnified();
		transformRSStoUnified();
	}
}
