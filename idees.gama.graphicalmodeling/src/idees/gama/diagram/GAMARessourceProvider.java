package idees.gama.diagram;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.eclipse.emf.common.util.URI;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.ui.editor.DiagramEditor;
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

	DiagramEditor editor;
	IFeatureProvider fp;
	Diagram diagram;
	List<GamlResource> resources;

	public void setName(final DiagramEditor editor, final IFeatureProvider fp, final Diagram diagram) {
		this.editor = editor;
		this.diagram = diagram;
		this.fp = fp;
		resources = new ArrayList<GamlResource>();
	}

	@Override
	public XtextResource createResource() {
		final XtextResourceSet rs = new SynchronizedXtextResourceSet();

		rs.setClasspathURIContext(ModelGenerator.class);
		URI du = editor.getDiagramEditorInput().getUri();
		final URI uri = URI.createURI((du.trimFragment()).toString().replace(".gadl",".gaml"), true);
	
		final GamlResource resource = (GamlResource) rs.createResource(uri);
		resources.add(resource);
		return resource;

	}

	public List<GamlResource> getResources() {
		return resources;
	}

}
