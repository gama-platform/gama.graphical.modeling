package idees.gama.diagram;




import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.inject.Inject;

import org.eclipse.emf.common.util.URI;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.xtext.resource.FileExtensionProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;

import idees.gama.features.modelgeneration.ModelGenerator;
import msi.gama.lang.gaml.resource.GamlResource;
import msi.gama.lang.utils.EGaml;

public class GAMARessourceProvider implements IEditedResourceProvider{

	@Inject private IResourceSetProvider resourceSetProvider;
	@Inject private FileExtensionProvider ext;
	
	String name;
	IFeatureProvider fp;
	Diagram diagram;
	
	public void setName(String name, final IFeatureProvider fp,Diagram diagram) {
		this.name = name;
		this.diagram = diagram;
		this.fp = fp;
	}

	@Override
	public XtextResource createResource() {
		XtextResourceSet rs = EGaml.getInstance(XtextResourceSet.class);
		
		rs.setClasspathURIContext(ModelGenerator.class);
		URI uri = URI.createPlatformResourceURI("totolala/" + name + ".gaml", true);
		GamlResource resource = (GamlResource) rs.createResource(uri);
		
		return resource;
		
	}

}
