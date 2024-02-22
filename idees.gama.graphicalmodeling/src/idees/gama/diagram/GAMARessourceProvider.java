/*******************************************************************************************************
 *
 * GAMARessourceProvider.java, in idees.gama.graphicalmodeling, is part of the source code of the GAMA modeling and
 * simulation platform (v.1.9.3).
 *
 * (c) 2007-2024 UMI 209 UMMISCO IRD/SU & Partners (IRIT, MIAT, TLU, CTU)
 *
 * Visit https://github.com/gama-platform/gama for license information and contacts.
 *
 ********************************************************************************************************/
package idees.gama.diagram;

import java.util.ArrayList;
import java.util.List;

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

import com.google.inject.Inject;

import gaml.compiler.gaml.resource.GamlResource;
import idees.gama.features.modelgeneration.ModelGenerator;

/**
 * The Class GAMARessourceProvider.
 */
public class GAMARessourceProvider implements IEditedResourceProvider {

	/** The resource set provider. */
	@Inject private IResourceSetProvider resourceSetProvider;

	/** The ext. */
	@Inject private FileExtensionProvider ext;

	/** The editor. */
	DiagramEditor editor;

	/** The fp. */
	IFeatureProvider fp;

	/** The diagram. */
	Diagram diagram;

	/** The resources. */
	List<GamlResource> resources;

	/**
	 * Sets the name.
	 *
	 * @param editor
	 *            the editor
	 * @param fp
	 *            the fp
	 * @param diagram
	 *            the diagram
	 */
	public void setName(final DiagramEditor editor, final IFeatureProvider fp, final Diagram diagram) {
		this.editor = editor;
		this.diagram = diagram;
		this.fp = fp;
		resources = new ArrayList<>();
	}

	@Override
	public XtextResource createResource() {
		final XtextResourceSet rs = new SynchronizedXtextResourceSet();

		rs.setClasspathURIContext(ModelGenerator.class);
		URI du = editor.getDiagramEditorInput().getUri();
		final URI uri = URI.createURI(du.trimFragment().toString().replace(".gadl", ".gaml"), true);

		final GamlResource resource = (GamlResource) rs.createResource(uri);
		resources.add(resource);
		return resource;

	}

	/**
	 * Gets the resources.
	 *
	 * @return the resources
	 */
	public List<GamlResource> getResources() { return resources; }

}
