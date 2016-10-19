package idees.gama.diagram;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.eclipse.emf.common.util.URI;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.xtext.resource.FileExtensionProvider;
import org.eclipse.xtext.resource.SynchronizedXtextResourceSet;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;

import idees.gama.features.modelgeneration.ModelGenerator;
import msi.gama.lang.gaml.resource.GamlResource;

public class GAMARessourceProvider implements IEditedResourceProvider {

	@Inject private IResourceSetProvider resourceSetProvider;
	@Inject private FileExtensionProvider ext;

	String name;
	IFeatureProvider fp;
	Diagram diagram;
	List<GamlResource> resources;

	public void setName(final String name, final IFeatureProvider fp, final Diagram diagram) {
		this.name = name;
		this.diagram = diagram;
		this.fp = fp;
		resources = new ArrayList<GamlResource>();
	}

	@Override
	public XtextResource createResource() {
		final XtextResourceSet rs = new SynchronizedXtextResourceSet();

		rs.setClasspathURIContext(ModelGenerator.class);
		final URI uri = URI.createPlatformResourceURI("totolala/" + name + ".gaml", true);
		final GamlResource resource = (GamlResource) rs.createResource(uri);
		resources.add(resource);
		return resource;

	}

	public List<GamlResource> getResources() {
		return resources;
	}

}
