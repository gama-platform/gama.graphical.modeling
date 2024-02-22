
/*******************************************************************************************************
 *
 * GenerateDiagramHandler.java, in idees.gama.graphicalmodeling, is part of the source code of the GAMA modeling and
 * simulation platform (v.1.9.3).
 *
 * (c) 2007-2024 UMI 209 UMMISCO IRD/SU & Partners (IRIT, MIAT, TLU, CTU)
 *
 * Visit https://github.com/gama-platform/gama for license information and contacts.
 *
 ********************************************************************************************************/
package idees.gama.ui.commands;

import java.io.File;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.editor.DiagramEditorInput;
import org.eclipse.graphiti.ui.internal.services.GraphitiUiInternal;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import gama.core.kernel.model.IModel;
import gaml.compiler.gaml.validation.GamlModelBuilder;
import gaml.compiler.ui.editor.GamlEditor;
import idees.gama.FileService;
import idees.gama.diagram.GamaDiagramEditor;
import idees.gama.diagram.GamaFeatureProvider;

/**
 * The Class GenerateDiagramHandler.
 */
public class GenerateDiagramHandler extends AbstractHandler {

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final GamlEditor editor =
				(GamlEditor) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		final IModel model = editor.getDocument()
				.readOnly(state -> GamlModelBuilder.getDefaultInstance().compile(state.getURI(), null));
		if (model == null) return null;
		final File file = new File(model.getProjectPath() + "/diagrams/" + model.getName() + ".gadl");
		if (file.exists()) { file.delete(); }

		final IResource resource = editor.getResource();
		final IContainer container = resource.getProject();
		final IFolder modelFolder = container.getFolder(new Path("diagrams"));
		if (!modelFolder.exists()) {
			try {
				modelFolder.create(true, true, null);
			} catch (final CoreException e) {
				e.printStackTrace();
			}
		}
		final IFile fileP = container.getFile(new Path("diagrams/" + model.getName() + ".gadl"));
		createDiagramEditor(fileP, model.getName(), model);
		return null;
	}

	/**
	 * Creates the diagram editor.
	 *
	 * @param file
	 *            the file
	 * @param diagramName
	 *            the diagram name
	 * @param gamaModel
	 *            the gama model
	 */
	private void createDiagramEditor(final IFile file, final String diagramName, final IModel gamaModel) {
		// Create the diagram
		final Diagram diagram = Graphiti.getPeCreateService().createDiagram("gamaDiagram", diagramName, true);

		final URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);

		FileService.createEmfFileForDiagram(uri, diagram);
		final DiagramEditorInput editorInput =
				new DiagramEditorInput(EcoreUtil.getURI(diagram), "idees.gama.diagram.MyGamaDiagramTypeProvider");
		Display.getCurrent().asyncExec(() -> {
			final IWorkbenchPage pag = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			try {
				final IEditorPart ep =
						pag.openEditor(editorInput, "idees.gama.graphicalmodeling.diagram.gamadiagrameditor");
				final IDiagramTypeProvider dtp = ((GamaDiagramEditor) ep).getDiagramTypeProvider();
				final GamaFeatureProvider gfp = (GamaFeatureProvider) dtp.getFeatureProvider();
				gfp.setTypeOfModel("custom");
				gfp.setGamaModel(gamaModel);
				gfp.init();
				ep.doSave(null);

			} catch (final PartInitException e) {
				e.printStackTrace();
			}
		});
	}

	/**
	 * Creates the emf file for diagram.
	 *
	 * @param uri
	 *            the uri
	 * @param diagram
	 *            the diagram
	 * @return the transactional editing domain
	 */
	public static TransactionalEditingDomain createEmfFileForDiagram(final URI uri, final Diagram diagram) {
		// Create a resource set and EditingDomain
		final TransactionalEditingDomain editingDomain =
				GraphitiUiInternal.getEmfService().createResourceSetAndEditingDomain();
		// TransactionalEditingDomain editingDomain =
		// DiagramEditorFactory.createResourceSetAndEditingDomain();
		final ResourceSet resourceSet = editingDomain.getResourceSet();

		// Create a resource for this file.
		final Resource resource = resourceSet.createResource(uri);

		editingDomain.getCommandStack().execute(new RecordingCommand(editingDomain) {

			@Override
			protected void doExecute() {
				resource.setTrackingModification(true);
				resource.getContents().add(diagram);
			}
		});

		return editingDomain;
	}

}
