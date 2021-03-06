import java.io.File;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler; 
import org.eclipse.core.commands.ExecutionEvent; 
import org.eclipse.core.commands.ExecutionException; 
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.common.NotDefinedException;

import org.eclipse.core.resources.IFile; 
import org.eclipse.core.resources.IFolder; 
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource; 
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xml.type.SimpleAnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;

import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.builder.EclipseOutputConfigurationProvider;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.generator.OutputConfigurationProvider;
import org.eclipse.xtext.resource.IResourceDescriptions; 
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.ui.part.FileEditorInput;

import com.google.inject.Inject; 
import com.google.inject.Provider;

import de.tu_bs.cs.isf.mbse.mbtimes.generator.NplGenerator;

public class GenerationHandler extends AbstractHandler implements IHandler {
	
	@Inject
	private EclipseOutputConfigurationProvider outputConfigurationProvider;
	
    @Inject
    private NplGenerator generator;
 
    @Inject
    private Provider<EclipseResourceFileSystemAccess2> fileAccessProvider;
     
    @Inject
    IResourceDescriptions resourceDescriptions;
     
    @Inject
    IResourceSetProvider resourceSetProvider;
     
    @Override 
    public Object execute(ExecutionEvent event) throws ExecutionException {
    	 
    	  //used to save the command name (defined in extensions)
    	  String mode = "";
    	 
    	  try {
    	     mode = event.getCommand().getName();
    	  } catch (NotDefinedException e1) {
    	    e1.printStackTrace();
    	  }
    	 
    	  // stuff to get the workbench and current file
    	  IWorkbench wb = PlatformUI.getWorkbench();
    	  IWorkbenchWindow window = wb.getActiveWorkbenchWindow();
    	  IWorkbenchPage page = window.getActivePage();
    	  IEditorPart editor = page.getActiveEditor();
    	  IEditorInput input = editor.getEditorInput();
    	  IPath path = ((FileEditorInput) input).getPath();
    	 
    	  String name = path.toString();
    	  File myfile = new File(name);
    	 
    	  IWorkspace workspace= ResourcesPlugin.getWorkspace();
    	  IPath location= Path.fromOSString(myfile.getAbsolutePath());
    	  IFile file= workspace.getRoot().getFileForLocation(location);
    	 
    	  IProject project = file.getProject();
    	  
    	  Set<OutputConfiguration> teste2 = outputConfigurationProvider.getOutputConfigurations(project);
    	  Iterator<OutputConfiguration> it2 = teste2.iterator();
     	 
    	  //Find specified output folder or use src.gen as default
    	  IFolder srcGenFolder = project.getFolder("src-gen");
    	  while(it2.hasNext()){
    	    OutputConfiguration out = it2.next();
    	    System.out.println(out.getOutputDirectory());
    	    srcGenFolder = project.getFolder(out.getOutputDirectory());
    	  }
    	  
    	  if (!srcGenFolder.exists()) {
    	    try {
    	      srcGenFolder.create(true, true, new NullProgressMonitor());
    	    } catch (CoreException e) {
    	    return null;
    	    }
    	  }
    	 
    	  final EclipseResourceFileSystemAccess2 fsa = fileAccessProvider.get();
    	 
    	  fsa.setProject(project);
    	 
    	  //same stuff
    	  //fsa.setOutputPath("src-gen");
    	  fsa.setOutputPath(srcGenFolder.getName().toString());
    	 
    	  fsa.setMonitor(new NullProgressMonitor());
    	  Map<String, OutputConfiguration> teste = fsa.getOutputConfigurations();
    	 
    	  Iterator<Entry<String, OutputConfiguration>> it = teste.entrySet().iterator();
    	 
    	  //make a new Outputconfiguration <- needed
    	  while(it.hasNext()){
    	 
    	    Entry<String, OutputConfiguration> next = it.next();
    	    OutputConfiguration out = next.getValue();
    	    out.isOverrideExistingResources();
    	    out.setCreateOutputDirectory(true); // <--- do not touch this
    	 
    	  }
    	  // ----->
    	 
    	  URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
    	  ResourceSet rs = resourceSetProvider.get(project);
    	  Resource r = rs.getResource(uri, true);
    	 
    	  // to pass a String inside a resource i have to wrap it in a EOBject
    	  SimpleAnyType wrapper = XMLTypeFactory.eINSTANCE.createSimpleAnyType();
    	  wrapper.setInstanceType(EcorePackage.eINSTANCE.getEString());
    	  wrapper.setValue(mode);
    	  //
    	 
    	  // add string to resource
    	  r.getContents().add(wrapper);
    	  
    	  SimpleAnyType wrapper2 = XMLTypeFactory.eINSTANCE.createSimpleAnyType();
    	  wrapper2.setInstanceType(EcorePackage.eINSTANCE.getEString());
    	  wrapper2.setValue(Platform.getOS());
    	  r.getContents().add(wrapper2);
    	 
    	  
    	  generator.setProjectPath(project.getLocation().toOSString());
    	  generator.setOutputFolder(srcGenFolder.getName().toString());
    	  generator.doGenerate(r, fsa);
    	 
    	  return null;
    	 
    	}
    
    @Override
    public boolean isEnabled() {
        return true;
    }
}