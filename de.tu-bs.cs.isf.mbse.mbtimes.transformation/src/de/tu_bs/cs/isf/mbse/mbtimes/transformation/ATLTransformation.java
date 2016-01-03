package de.tu_bs.cs.isf.mbse.mbtimes.transformation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;

import org.eclipse.core.runtime.NullProgressMonitor;
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

/**
 * This class encapsulates performs M2M transformation using ATL (Atlas
 * Transformation Language).
 * 
 * This class requires the following plug-ins: - org.eclipse.m2m.atl.core -
 * org.eclipse.m2m.atl.core.emf - org.eclipse.m2m.atl.engine.emfvm.launch
 * 
 * @author Stefan Mühlbauer <s.muehlbauer@tu-bs.de>
 * 
 * 
 * @see https://github.com/101companies/101repo/blob/master/contributions/atl/
 *      src/atl/RunTransfoJava.java for reference
 *
 */
class ATLTransformation {

	protected ILauncher transformationLauncher;
	protected ModelFactory modelFactory;
	protected IInjector injector;
	protected IExtractor extractor;
	protected String sourceMetamodelodelName;
	protected String targetMetamodelodelName;
	
	IReferenceModel sourceMetamodel;
	IReferenceModel targetMetamodel;

	/**
	 * 
	 */
	public ATLTransformation() {
		initialize();
	}

	/**
	 * Initialize the injector / extractor.
	 */
	protected final void initialize() {

		this.transformationLauncher = new EMFVMLauncher();
		this.modelFactory = new EMFModelFactory();
		this.injector = new EMFInjector();
		this.extractor = new EMFExtractor();

	}

	/**
	 * Load the metamodels to the ATLTransformation class.
	 * 
	 * @param sourceMetamodelPath
	 *            Path to the source metamodel, like "/anywhere/source.ecore"
	 * @param targetMetamodelPath
	 *            Path to the target metamodel, like "/anywhere/target.ecore"
	 * @throws ATLCoreException
	 */
	public void loadMetamodels(String sourceMetamodelPath, String targetMetamodelPath) throws ATLCoreException {

		this.sourceMetamodel = modelFactory.newReferenceModel();
		injector.inject(sourceMetamodel, sourceMetamodelPath);

		this.targetMetamodel = modelFactory.newReferenceModel();
		injector.inject(targetMetamodel, targetMetamodelPath);

	}

	/**
	 * Performs a given ATL transformation on a source model.
	 * 
	 * @param sourceModelPath
	 *            Path to the source model to transform, like
	 *            "/anywhere/source.xmi"
	 * @param transformationASMPath
	 *            Path to the (compiled, hence .asm) ATL M2M transformation
	 *            file, like "/anywhere/transformation.asm"
	 * @param targetModelPath
	 *            Path to the target model to transform, like
	 *            "/anywhere/target.xmi"
	 * 
	 * @throws ATLCoreException
	 * @throws FileNotFoundException
	 */
	public void runTransformation(String sourceModelPath, String transformationASMPath, String targetModelPath)
			throws ATLCoreException, FileNotFoundException {

		IModel sourceModel = modelFactory.newModel(sourceMetamodel);
		injector.inject(sourceModel, sourceModelPath);

		transformationLauncher.initialize(new HashMap<String, Object>());
		transformationLauncher.addInOutModel(sourceModel, "IN", sourceMetamodelodelName);

		// Not sure what this is actually doing
		IReferenceModel refiningTraceMetamodel = modelFactory.getBuiltInResource("RefiningTrace.ecore");

		IModel refiningTraceModel = modelFactory.newModel(refiningTraceMetamodel);

		transformationLauncher.addOutModel(refiningTraceModel, "refiningTrace", "RefiningTrace");
		transformationLauncher.launch(ILauncher.RUN_MODE, new NullProgressMonitor(), new HashMap<String, Object>(),
				new FileInputStream(transformationASMPath));

		IModel sourceModelTransformed = sourceModel;

		extractor.extract(sourceModelTransformed, targetModelPath);

		EMFModelFactory emfModelFactory = (EMFModelFactory) modelFactory;
		emfModelFactory.unload((EMFModel) sourceModelTransformed);
		emfModelFactory.unload((EMFReferenceModel) sourceMetamodel);
	}
	
	public static void main(String[] args) {
		ATLTransformation t = new ATLTransformation();
		try {
			t.loadMetamodels("/Users/florian/git/model-based-times/de.tu-bs.cs.isf.mbse.mbtimes.models.rss/model/RSS.ecore", "/Users/florian/git/model-based-times/de.tu-bs.cs.isf.mbse.mbtimes.models.unified/model/unified.ecore");
		} catch (ATLCoreException e) {
			// TODO Auto-generated catch block
			System.out.println("model paths invalid");
			e.printStackTrace();
		}
		try {
			t.runTransformation("/Users/florian/git/model-based-times/de.tu-bs.cs.isf.mbse.mbtimes.models.rss/data/crawled.rss", "/Users/florian/git/model-based-times/RSS2Unified/RSS2Unified.asm", "/Users/florian/git/model-based-times/de.tu-bs.cs.isf.mbse.mbtimes.models.rss/data/transformedUnified.unified");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ATLCoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
