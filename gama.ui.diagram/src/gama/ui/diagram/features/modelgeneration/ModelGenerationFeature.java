/*******************************************************************************************************
 *
 * ModelGenerationFeature.java, in gama.ui.diagram.graphicalmodeling, is part of the source code of the GAMA modeling and
 * simulation platform (v.1.9.3).
 *
 * (c) 2007-2024 UMI 209 UMMISCO IRD/SU & Partners (IRIT, MIAT, TLU, CTU)
 *
 * Visit https://github.com/gama-platform/gama for license information and contacts.
 *
 ********************************************************************************************************/
package gama.ui.diagram.features.modelgeneration;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;
import org.eclipse.xtext.util.StringInputStream;

import gama.core.runtime.GAMA;
import gama.ui.shared.utils.WorkbenchHelper;
import gaml.compiler.ui.editor.GamlEditor;

/**
 * The Class ModelGenerationFeature.
 */
public class ModelGenerationFeature extends AbstractCustomFeature {

	/** The display. */

	/**
	 * Instantiates a new model generation feature.
	 *
	 * @param fp
	 *            the fp
	 */
	public ModelGenerationFeature(final IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public String getName() { return "Generate Gaml model"; }

	@Override
	public String getDescription() { return "Generate Gaml model from diagram"; }

	@Override
	public boolean canExecute(final ICustomContext context) {
		return true;
	}

	@Override
	public void execute(final ICustomContext context) {
		String gamlModel = ModelGenerator.generateModel(this.getFeatureProvider(), getDiagram(), null);
		List<Shape> contents = getDiagram().getChildren();
		URI uri = null;
		if (contents == null) return;
		uri = EcoreUtil.getURI((EObject) getBusinessObjectForPictogramElement(contents.get(0)));
		uri = uri.trimFragment();
		if (uri.isPlatform()) { uri = URI.createURI(uri.toPlatformString(true)); }
		String containerStr = "/" + uri.segment(0);
		String path = ResourcesPlugin.getWorkspace().getRoot().getLocation() + uri.path();
		path = path.replace("diagrams/", "models/");
		File folder = new File(ResourcesPlugin.getWorkspace().getRoot().getLocation() + containerStr + "/models");
		if (!folder.exists()) { folder.mkdir(); }
		path = path.replace(".gadl", ".gaml");
		File file = new File(path);
		if (file.exists()) { file.delete(); }

		FileWriter fw;
		try {
			FileUtils.forceMkdirParent(file);
			fw = new FileWriter(file, false);
			fw.write(gamlModel);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource resource = root.findMember(new Path(containerStr));

		IProject project = resource.getProject();
		IFolder container = project.getFolder(new Path("models/"));
		IFile fileP = container.getFile(new Path(uri.lastSegment().replace(".gadl", ".gaml")));

		try (StringInputStream source = new StringInputStream(gamlModel)) {
			container.create(true, true, null);
			fileP.create(source, true, null);
			fileP.refreshLocal(1, null);
		} catch (IOException | CoreException e) {
			e.printStackTrace();
		}
		GAMA.getGui().editModel(GAMA.getRuntimeScope(), fileP);
		doFinish(fileP);

	}

	/**
	 * Do finish.
	 *
	 * @param file
	 *            the file
	 */
	private void doFinish(final IFile file) {
		WorkbenchHelper.asyncRun(() -> {
			IWorkbenchPage page = WorkbenchHelper.getPage();
			try {
				IEditorPart ed = IDE.openEditor(page, file, true);
				if (ed instanceof GamlEditor) {
					((GamlEditor) ed).getAction("Format").run();
					ed.doSave(null);
				}

			} catch (PartInitException e) {
				e.printStackTrace();
			}
		});
	}

}
