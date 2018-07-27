package idees.gama.features.modelgeneration;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

import msi.gama.lang.gaml.ui.editor.GamlEditor;

public class ModelGenerationFeature extends AbstractCustomFeature {
 
    //private boolean hasDoneChanges = false;
    private Display display;
 //   private static String EL = System.getProperty("line.separator" ); 
     
    public ModelGenerationFeature(IFeatureProvider fp) {
        super(fp);
        this.display = Display.getDefault();
       
 
    }
 
    @Override
    public String getName() {
        return "Generate Gaml model";
    }
 
    @Override
    public String getDescription() {
        return "Generate Gaml model from diagram";
    }
 
    @Override
    public boolean canExecute(ICustomContext context) {
      return true;
    }
 
    @Override
    public void execute(ICustomContext context) {
    	String gamlModel = ModelGenerator.generateModel(this.getFeatureProvider(), getDiagram(),null);
    		List<Shape> contents = getDiagram().getChildren();
    		URI uri = null;
    		if (contents != null) {
            	uri = EcoreUtil.getURI( (EObject) getBusinessObjectForPictogramElement(contents.get(0)) );
    		} else {
    			return;
    		}
    		 uri = uri.trimFragment();
            if (uri.isPlatform()) {
                uri = URI.createURI( uri.toPlatformString( true ) );
            }
            String containerStr = "/"+ uri.segment(0);
            String path = ResourcesPlugin.getWorkspace().getRoot().getLocation() + uri.path();
            path = path.replace("diagrams/", "models/");
            File folder = new File(ResourcesPlugin.getWorkspace().getRoot().getLocation() + containerStr + "/models");
            if (!folder.exists()) folder.mkdir();
            path = path.replace(".gadl", ".gaml");
            File file = new File(path);
            if (file.exists()) file.delete();
            
            FileWriter fw;
			try {
				fw = new FileWriter(file, false);
				fw.write(gamlModel);
		        fw.close();
		       
			} catch (IOException e) {
				e.printStackTrace();
			}
			 IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		        IResource resource = root.findMember(new Path(containerStr));
		        
		        IContainer container = resource.getProject();				
				
				final IFile fileP = container.getFile(new Path("models/" + uri.lastSegment().replace(".gadl", ".gaml")));
				
		        doFinish(fileP);
			
        
    }
    
    private void doFinish(final IFile file) {
    	display.asyncExec(new Runnable() {

    			@Override
    			public void run() {
    				IWorkbenchPage page =
    					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
    				try {
    					IEditorPart ed = IDE.openEditor(page, file, true);
    					if (ed instanceof GamlEditor) {
    						((GamlEditor)ed).getAction("Format").run();
    						ed.doSave(null);
    					}
    					
    				} catch (PartInitException e) {
    					e.printStackTrace();
    				}
    			}
    		});
    	}

    
   
}
 