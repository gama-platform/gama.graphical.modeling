/*******************************************************************************************************
 *
 * EditAspectFrame.java, in gama.ui.diagram, is part of the source code of the GAMA modeling and simulation
 * platform (v.1.9.3).
 *
 * (c) 2007-2024 UMI 209 UMMISCO IRD/SU & Partners (IRIT, MIAT, TLU, CTU)
 *
 * Visit https://github.com/gama-platform/gama for license information and contacts.
 *
 ********************************************************************************************************/
package gama.ui.diagram.swt.editFrame;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;

import gama.core.util.GamaMapFactory;
import gama.ui.diagram.editor.GamaDiagramEditor;
import gama.ui.diagram.features.ExampleUtil;
import gama.ui.diagram.features.edit.EditFeature;
import gama.ui.diagram.features.modelgeneration.ModelGenerator;
import gama.ui.diagram.metamodel.EAspect;
import gama.ui.diagram.metamodel.EDisplay;
import gama.ui.diagram.metamodel.ELayerAspect;

/**
 * The Class EditAspectFrame.
 */
public class EditAspectFrame extends EditFrame {

	/** The layer viewer. */
	Table layerViewer;

	/** The frame. */
	EditAspectFrame frame;

	/** The layers. */
	List<ELayerAspect> layers;

	/** The diagram. */
	Diagram diagram;

	/** The layer frames. */
	final Map<ELayerAspect, EditLayerAspectFrame> layerFrames;

	/** The gp lay. */
	Group gpLay;

	/** The gp C. */
	Group gpC;

	/**
	 * Create the application window.
	 */
	public EditAspectFrame(final Diagram diagram, final IFeatureProvider fp, final EditFeature eaf,
			final EAspect aspect, final String name) {
		super(diagram, fp, eaf, aspect, name == null ? "Aspect definition" : name);
		layerFrames = GamaMapFactory.create();
		frame = this;
		layers = new ArrayList<>();
		layers.addAll(aspect.getLayers());
		this.diagram = diagram;

	}

	/**
	 * Create contents of the application window.
	 *
	 * @param parent
	 */
	@Override
	protected Control createContents(final Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new GridLayout(1, false));
		// ****** CANVAS NAME *********
		groupName(container);

		groupRadioGamlCode(container, "aspect");
		// ****** CANVAS LAYERS *********
		gpLay = groupLayers(container);
		gpC = groupGamlCode(container, "GAML code");

		EAspect asp = (EAspect) eobject;
		if (asp.isDefineGamlCode()) {
			radioGaml.setSelection(true);
			removeOther();
		} else {
			radioEdit.setSelection(true);
			removeGaml();
		}

		return container;
	}

	@Override
	public void removeGaml() {
		recursiveSetEnabled(gpLay, true);
		recursiveSetEnabled(gpC, false);
		this.layerViewer.setVisible(true);
		this.editor.getViewer().getControl().setVisible(false);

	}

	@Override
	public void removeOther() {
		recursiveSetEnabled(gpLay, false);
		recursiveSetEnabled(gpC, true);
		this.layerViewer.setVisible(false);
		this.editor.getViewer().getControl().setVisible(true);
	}

	/**
	 * Group layers.
	 *
	 * @param container
	 *            the container
	 * @return the group
	 */
	protected Group groupLayers(final Composite container) {
		final GamaDiagramEditor diagramEditor = (GamaDiagramEditor) ExampleUtil.getDiagramEditor(fp);
		List<String> vals = new ArrayList<>();
		diagramEditor.buildLocation(eobject, vals);
		vals.add("draw");
		diagramEditor.getIdsEObjects().put(vals, eobject);
		// ****** CANVAS LAYERS *********
		Group group = new Group(container, SWT.NONE);

		group.setLayout(new FillLayout(SWT.VERTICAL));
		group.setText("Aspect layers");

		GridData gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.verticalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;
		group.setLayoutData(gridData);
		group.setLayout(new GridLayout(1, false));

		GridData gridData2 = new GridData();
		gridData2.horizontalAlignment = SWT.FILL;
		gridData2.verticalAlignment = SWT.FILL;
		gridData2.grabExcessHorizontalSpace = true;
		gridData2.grabExcessVerticalSpace = true;

		// layerViewer = new org.eclipse.swt.widgets.List(group, SWT.BORDER | SWT.V_SCROLL);
		layerViewer = new Table(group, SWT.BORDER | SWT.V_SCROLL | SWT.SINGLE | SWT.FULL_SELECTION
		/* | SWT.HIDE_SELECTION */);
		layerViewer.setHeaderVisible(false);
		layerViewer.setLinesVisible(false);

		layerViewer.setLayoutData(gridData2);

		final EAspect aspect = (EAspect) eobject;
		for (ELayerAspect la : aspect.getLayers()) {
			// layerViewer.add(la.getName());
			TableItem ti = new TableItem(layerViewer, SWT.NONE);
			ti.setText(la.getName());
			// ti.setBackground(new Color(frame.getShell().getDisplay(), 100,255,100));
			ti.setBackground(hasError(la) ? new Color(frame.getShell().getDisplay(), 255, 100, 100)
					: new Color(frame.getShell().getDisplay(), 100, 255, 100));

		}
		/*
		 * for (ELayerAspect lay : layers) { layerViewer.add(lay.getName()); }
		 */

		Composite containerButtons = new Composite(group, SWT.NONE);
		containerButtons.setLayout(new FillLayout(SWT.HORIZONTAL));
		GridData gridData3 = new GridData();
		gridData3.horizontalAlignment = SWT.FILL;
		gridData3.grabExcessHorizontalSpace = true;
		containerButtons.setLayoutData(gridData3);

		Button addLayerBtn = new Button(containerButtons, SWT.BUTTON1);
		addLayerBtn.setText("Add");
		addLayerBtn.setSelection(false);
		addLayerBtn.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(final SelectionEvent e) {
				final ELayerAspect elayer = gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createELayerAspect();
				TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(eobject);
				if (domain != null) {
					domain.getCommandStack().execute(new RecordingCommand(domain) {

						@Override
						public void doExecute() {
							elayer.setName("Layer");
							elayer.setAspect((EAspect) eobject);
							diagram.eResource().getContents().add(elayer);
							TableItem ti = new TableItem(layerViewer, SWT.NONE);
							ti.setText(elayer.getName());
							ti.setBackground(hasError(elayer) ? new Color(frame.getShell().getDisplay(), 255, 100, 100)
									: new Color(frame.getShell().getDisplay(), 100, 255, 100));
							((EAspect) eobject).getLayers().add(elayer);

						}
					});
				}
				EditLayerAspectFrame eaf = new EditLayerAspectFrame(elayer, frame, false, diagram, fp, ef);
				layerFrames.put(elayer, eaf);
				eaf.open();
			}
		});

		Button editLayerBtn = new Button(containerButtons, SWT.BUTTON1);
		editLayerBtn.setText("Edit");
		editLayerBtn.setSelection(false);
		editLayerBtn.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(final SelectionEvent e) {
				if (layerViewer.getSelectionCount() == 1) {
					final int index = layerViewer.getSelectionIndex();
					ELayerAspect layer = ((EAspect) eobject).getLayers().get(index);
					EditLayerAspectFrame eaf = layerFrames.get(layer);
					if (eaf == null || eaf.getShell() == null || eaf.getShell().isDisposed()) {
						eaf = new EditLayerAspectFrame(layer, frame, true, diagram, fp, ef);
						eaf.open();
						layerFrames.put(layer, eaf);

					} else {
						eaf.getShell().setFocus();
					}
					eaf.open();
				}
			}
		});

		Button removeLayerBtn = new Button(containerButtons, SWT.BUTTON1);
		removeLayerBtn.setText("Remove");
		removeLayerBtn.setSelection(false);
		removeLayerBtn.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(final SelectionEvent e) {
				if (layerViewer.getSelectionCount() == 1) {
					final int index = layerViewer.getSelectionIndex();
					layerViewer.remove(index);
					final ELayerAspect lay = layers.remove(index);
					TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(eobject);
					if (domain != null) {
						domain.getCommandStack().execute(new RecordingCommand(domain) {

							@Override
							public void doExecute() {
								aspect.getLayers().remove(index);
								layerFrames.remove(lay);
								diagram.eResource().getContents().remove(lay);
								EcoreUtil.delete(lay);

							}
						});
					}

					save("");
					ModelGenerator.modelValidation(fp, diagram);
					diagramEditor.updateEObjectErrors();
					ef.hasDoneChanges = true;
				}
			}
		});
		Button btnUp = new Button(containerButtons, SWT.ARROW | SWT.UP);
		// btnUp.setText("Up");
		btnUp.setSelection(false);
		btnUp.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(final SelectionEvent e) {
				if (layerViewer.getSelectionCount() == 1) {
					int index = layerViewer.getSelectionIndex();
					if (index > 0) {
						((EDisplay) eobject).getLayers().move(index - 1, index);
						layerViewer.removeAll();
						for (ELayerAspect la : ((EAspect) eobject).getLayers()) {
							TableItem ti = new TableItem(layerViewer, SWT.NONE);
							ti.setText(la.getName());
							ti.setBackground(hasError(la) ? new Color(frame.getShell().getDisplay(), 255, 100, 100)
									: new Color(frame.getShell().getDisplay(), 100, 255, 100));
						}
					}
				}
			}
		});
		Button btnDown = new Button(containerButtons, SWT.ARROW | SWT.DOWN);
		// btnDown.setText("Down");
		btnDown.setSelection(false);
		btnDown.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(final SelectionEvent e) {
				if (layerViewer.getSelectionCount() == 1) {
					int index = layerViewer.getSelectionIndex();
					if (index < layerViewer.getItemCount() - 1) {
						((EDisplay) eobject).getLayers().move(index + 1, index);
						layerViewer.removeAll();
						for (ELayerAspect la : ((EAspect) eobject).getLayers()) {
							TableItem ti = new TableItem(layerViewer, SWT.NONE);
							ti.setText(la.getName());
							ti.setBackground(hasError(la) ? new Color(frame.getShell().getDisplay(), 255, 100, 100)
									: new Color(frame.getShell().getDisplay(), 100, 255, 100));
						}
					}
				}
			}
		});
		return group;
	}

	/**
	 * Return the initial size of the window.
	 */
	@Override
	protected Point getInitialSize() { return new Point(743, 430); }

	/**
	 * Gets the layers.
	 *
	 * @return the layers
	 */
	public List<ELayerAspect> getLayers() { return layers; }

	/**
	 * Sets the layers.
	 *
	 * @param layers
	 *            the new layers
	 */
	public void setLayers(final List<ELayerAspect> layers) { this.layers = layers; }

	/**
	 * Gets the layer viewer.
	 *
	 * @return the layer viewer
	 */
	public Table getLayerViewer() { return layerViewer; }

	@Override
	protected void clean() {
		EAspect aspect = (EAspect) eobject;
		for (ELayerAspect lay : layers) { if (!aspect.getLayers().contains(lay)) { EcoreUtil.delete(lay, true); } }
		layers.clear();
	}

	@Override
	protected void save(final String name) {
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(eobject);
		if (domain != null) {
			domain.getCommandStack().execute(new RecordingCommand(domain) {

				@Override
				public void doExecute() {
					eobject.setName(textName.getText());
					EAspect asp = (EAspect) eobject;
					asp.setGamlCode(modelXText.getEditablePart());
					asp.setDefineGamlCode(radioGaml.getSelection());
				}
			});
		}
		ef.hasDoneChanges = true;
		ModelGenerator.modelValidation(fp, diagram);
	}

	/**
	 * Checks for error.
	 *
	 * @param elayer
	 *            the elayer
	 * @return true, if successful
	 */
	public boolean hasError(final ELayerAspect elayer) {
		final GamaDiagramEditor diagramEditor = (GamaDiagramEditor) ExampleUtil.getDiagramEditor(fp);
		List<String> ids = new ArrayList<>();
		diagramEditor.buildLocation(elayer, ids);

		if (diagramEditor.getErrorsLoc().isEmpty() && diagramEditor.getSyntaxErrorsLoc().isEmpty()) return false;

		return diagramEditor.getErrorsLoc().containsKey(ids) || diagramEditor.getSyntaxErrorsLoc().containsKey(ids);
	}

	/**
	 * Update layer.
	 */
	public void updateLayer() {
		layerViewer.removeAll();
		for (ELayerAspect elayer : ((EAspect) eobject).getLayers()) {
			TableItem ti = new TableItem(layerViewer, SWT.NONE);
			ti.setText(elayer.getName());
			ti.setBackground(hasError(elayer) ? new Color(frame.getShell().getDisplay(), 255, 100, 100)
					: new Color(frame.getShell().getDisplay(), 100, 255, 100));

		}
	}

}
