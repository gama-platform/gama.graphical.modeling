/*******************************************************************************************************
 *
 * EditDisplayFrame.java, in gama.ui.diagram, is part of the source code of the GAMA modeling and
 * simulation platform (v.1.9.3).
 *
 * (c) 2007-2024 UMI 209 UMMISCO IRD/SU & Partners (IRIT, MIAT, TLU, CTU)
 *
 * Visit https://github.com/gama-platform/gama for license information and contacts.
 *
 ********************************************************************************************************/
package gama.ui.diagram.swt.editFrame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.Shape;
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
import gama.ui.diagram.metamodel.EDisplay;
import gama.ui.diagram.metamodel.EGamaObject;
import gama.ui.diagram.metamodel.EGrid;
import gama.ui.diagram.metamodel.ELayer;
import gama.ui.diagram.metamodel.ESpecies;

/**
 * The Class EditDisplayFrame.
 */
public class EditDisplayFrame extends EditFrame {

	/** The layer viewer. */
	Table layerViewer;

	/** The frame. */
	EditDisplayFrame frame;

	/** The species. */
	List<ESpecies> species;

	/** The grids. */
	List<ESpecies> grids;

	/** The gp lay. */
	Group gpLay;

	/** The gp C. */
	Group gpC;

	/** The diagram. */
	Diagram diagram;

	/** The layer frames. */
	final Map<ELayer, EditLayerFrame> layerFrames;

	/** The Constant DOUBLE_PATTERN. */
	private static final Pattern DOUBLE_PATTERN =
			Pattern.compile("[\\x00-\\x20]*[+-]?(NaN|Infinity|((((\\p{Digit}+)(\\.)?((\\p{Digit}+)?)"
					+ "([eE][+-]?(\\p{Digit}+))?)|(\\.((\\p{Digit}+))([eE][+-]?(\\p{Digit}+))?)|"
					+ "(((0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+)))"
					+ "[pP][+-]?(\\p{Digit}+)))[fFdD]?))[\\x00-\\x20]*");

	/**
	 * Create the application window.
	 */
	public EditDisplayFrame(final Diagram diagram, final IFeatureProvider fp, final EditFeature eaf,
			final EGamaObject display, final String name) {
		super(diagram, fp, eaf, display, name == null ? "Display definition" : name);
		comboValues = new Hashtable<>();
		comboValues.put("type", Arrays.asList("java2D", "opengl"));

		layerFrames = GamaMapFactory.create();
		species = new ArrayList<>();
		grids = new ArrayList<>();
		this.diagram = diagram;
		final List<Shape> contents = diagram.getChildren();
		for (final Shape sh : contents) {
			final Object obj = fp.getBusinessObjectForPictogramElement(sh);
			if (obj instanceof EGrid) { grids.add((ESpecies) obj); }
			if (obj instanceof ESpecies) { species.add((ESpecies) obj); }
		}
		frame = this;

		updateLayerId();
		ModelGenerator.modelValidation(fp, diagram);

	}

	/**
	 * Load data.
	 */
	private void loadData() {
		final EDisplay display = (EDisplay) eobject;
		for (final ELayer la : display.getLayers()) {
			// layerViewer.add(la.getName());
			final TableItem ti = new TableItem(layerViewer, SWT.NONE);
			ti.setText(la.getName());
			// ti.setBackground(new Color(frame.getShell().getDisplay(),
			// 100,255,100));
			ti.setBackground(hasError(la) ? new Color(frame.getShell().getDisplay(), 255, 100, 100)
					: new Color(frame.getShell().getDisplay(), 100, 255, 100));

		}

	}

	/**
	 * Create contents of the application window.
	 *
	 * @param parent
	 */
	@Override
	protected Control createContents(final Composite parent) {

		final Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new GridLayout(1, false));
		// ****** CANVAS NAME *********
		groupName(container);

		groupFacets(container, "display", 4);

		// ****** CANVAS LAYERS *********

		groupRadioGamlCode(container, "aspect");
		// ****** CANVAS LAYERS *********
		gpLay = groupLayers(container);
		gpC = groupGamlCode(container, "GAML code");

		final EDisplay asp = (EDisplay) eobject;
		if (asp.isDefineGamlCode()) {
			radioGaml.setSelection(true);
			removeOther();
		} else {
			radioEdit.setSelection(true);
			removeGaml();
		}

		loadData();

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

		// ****** CANVAS LAYERS *********
		// ****** CANVAS LAYERS *********
		final Group group = new Group(container, SWT.NONE);
		final GamaDiagramEditor diagramEditor = (GamaDiagramEditor) ExampleUtil.getDiagramEditor(fp);

		group.setLayout(new FillLayout(SWT.VERTICAL));
		group.setText("Display layers");

		final GridData gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.verticalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;
		group.setLayoutData(gridData);
		group.setLayout(new GridLayout(1, false));

		final GridData gridData2 = new GridData();
		gridData2.horizontalAlignment = SWT.FILL;
		gridData2.verticalAlignment = SWT.FILL;
		gridData2.grabExcessHorizontalSpace = true;
		gridData2.grabExcessVerticalSpace = true;

		// layerViewer = new org.eclipse.swt.widgets.List(group, SWT.BORDER |
		// SWT.V_SCROLL);
		layerViewer = new Table(group, SWT.BORDER | SWT.V_SCROLL | SWT.SINGLE | SWT.FULL_SELECTION
		/* | SWT.HIDE_SELECTION */);
		layerViewer.setHeaderVisible(false);
		layerViewer.setLinesVisible(false);

		layerViewer.setLayoutData(gridData2);

		final Composite containerButtons = new Composite(group, SWT.NONE);
		containerButtons.setLayout(new FillLayout(SWT.HORIZONTAL));
		final GridData gridData3 = new GridData();
		gridData3.horizontalAlignment = SWT.FILL;
		gridData3.grabExcessHorizontalSpace = true;
		containerButtons.setLayoutData(gridData3);

		final Button addLayerBtn = new Button(containerButtons, SWT.BUTTON1);
		addLayerBtn.setText("Add");
		addLayerBtn.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(final SelectionEvent e) {
				final ELayer elayer = gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createELayer();
				final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(eobject);
				if (domain != null) {
					domain.getCommandStack().execute(new RecordingCommand(domain) {

						@Override
						public void doExecute() {
							elayer.setName("Layer");
							elayer.setDisplay((EDisplay) eobject);
							diagram.eResource().getContents().add(elayer);
							final TableItem ti = new TableItem(layerViewer, SWT.NONE);
							ti.setText(elayer.getName());
							ti.setBackground(hasError(elayer) ? new Color(frame.getShell().getDisplay(), 255, 100, 100)
									: new Color(frame.getShell().getDisplay(), 100, 255, 100));

							((EDisplay) eobject).getLayers().add(elayer);

						}
					});
				}

				ef.hasDoneChanges = true;

				final EditLayerFrame eaf = new EditLayerFrame(elayer, frame, species, grids, false, diagram, fp, ef);
				layerFrames.put(elayer, eaf);
				eaf.open();
				frame.updateLayerId();
			}
		});

		final Button editLayerBtn = new Button(containerButtons, SWT.BUTTON1);
		editLayerBtn.setText("Edit");
		editLayerBtn.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(final SelectionEvent e) {
				if (layerViewer.getSelectionCount() == 1) {
					updateLayerId();

					final int index = layerViewer.getSelectionIndex();
					final ELayer layer = ((EDisplay) eobject).getLayers().get(index);
					EditLayerFrame eaf = layerFrames.get(layer);
					if (eaf == null || eaf.getShell() == null || eaf.getShell().isDisposed()) {
						eaf = new EditLayerFrame(layer, frame, species, grids, true, diagram, fp, ef);
						eaf.open();
						layerFrames.put(layer, eaf);

					} else {
						eaf.getShell().setFocus();
					}

				}
			}
		});

		final Button removeLayerBtn = new Button(containerButtons, SWT.BUTTON1);
		removeLayerBtn.setText("Remove");
		removeLayerBtn.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(final SelectionEvent e) {
				if (layerViewer.getSelectionCount() == 1) {
					final int index = layerViewer.getSelectionIndex();
					layerViewer.remove(index);
					final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(eobject);
					if (domain != null) {
						domain.getCommandStack().execute(new RecordingCommand(domain) {

							@Override
							public void doExecute() {
								final ELayer lay = ((EDisplay) eobject).getLayers().remove(index);
								layerFrames.remove(lay);
								diagram.eResource().getContents().remove(lay);
								EcoreUtil.delete(lay);
							}
						});
					}
					frame.updateLayerId();

					save("");
					ModelGenerator.modelValidation(fp, diagram);
					diagramEditor.updateEObjectErrors();
					ef.hasDoneChanges = true;

				}
			}
		});
		final Button btnUp = new Button(containerButtons, SWT.ARROW | SWT.UP);
		btnUp.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(final SelectionEvent e) {
				if (layerViewer.getSelectionCount() == 1) {
					final int index = layerViewer.getSelectionIndex();
					if (index > 0) {
						((EDisplay) eobject).getLayers().move(index - 1, index);
						layerViewer.removeAll();
						for (final ELayer la : ((EDisplay) eobject).getLayers()) {
							final TableItem ti = new TableItem(layerViewer, SWT.NONE);
							ti.setText(la.getName());
							ti.setBackground(hasError(la) ? new Color(frame.getShell().getDisplay(), 255, 100, 100)
									: new Color(frame.getShell().getDisplay(), 100, 255, 100));
						}
					}
				}
			}
		});
		final Button btnDown = new Button(containerButtons, SWT.ARROW | SWT.DOWN);
		btnDown.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(final SelectionEvent e) {
				if (layerViewer.getSelectionCount() == 1) {
					final int index = layerViewer.getSelectionIndex();
					if (index < layerViewer.getItemCount() - 1) {
						((EDisplay) eobject).getLayers().move(index + 1, index);
						layerViewer.removeAll();
						for (final ELayer la : ((EDisplay) eobject).getLayers()) {
							final TableItem ti = new TableItem(layerViewer, SWT.NONE);
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
	 * Update layer id.
	 */
	public void updateLayerId() {
		final GamaDiagramEditor diagramEditor = (GamaDiagramEditor) ExampleUtil.getDiagramEditor(fp);
		final List<String> loc = new ArrayList<>();
		diagramEditor.buildLocation(eobject, loc);
		final int size = loc.size();
		final List<List<String>> ids = new ArrayList<>(diagramEditor.getIdsEObjects().keySet());
		for (final List<String> lid : ids) {
			if (lid.size() > size && lid.get(lid.size() - 2).equals(eobject.getName())) {
				diagramEditor.getIdsEObjects().remove(lid);
			}
		}
		for (final ELayer layer : ((EDisplay) eobject).getLayers()) {
			if (layer.getType() == null) { continue; }
			final List<String> key = new ArrayList<>(loc);
			key.add(layer.getType());
			diagramEditor.getIdsEObjects().put(key, eobject);
		}
	}

	/**
	 * Return the initial size of the window.
	 */
	@Override
	protected Point getInitialSize() { return new Point(1300, 750); }

	/**
	 * Gets the layer viewer.
	 *
	 * @return the layer viewer
	 */
	public Table getLayerViewer() { return layerViewer; }

	/**
	 * Modify other properties.
	 */
	private void modifyOtherProperties() {
		final EDisplay display = (EDisplay) eobject;
		display.setName(textName.getText());
		saveFacets();
	}

	@Override
	protected void save(final String name) {
		final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(eobject);
		if (domain != null) {
			domain.getCommandStack().execute(new RecordingCommand(domain) {

				@Override
				public void doExecute() {
					if (name == null) {
						eobject.setName(textName.getText());
						modifyOtherProperties();
						final EDisplay asp = (EDisplay) eobject;
						asp.setGamlCode(modelXText.getEditablePart());
						asp.setDefineGamlCode(radioGaml.getSelection());
					} else if ("name".equals(name)) {
						eobject.setName(textName.getText());
					} else {
						final EDisplay asp = (EDisplay) eobject;
						asp.setGamlCode(modelXText.getEditablePart());
						asp.setDefineGamlCode(radioGaml.getSelection());
						modifyOtherProperties();
					}
				}
			});
		}
		ef.hasDoneChanges = true;

	}

	/**
	 * Update layer.
	 */
	public void updateLayer() {
		layerViewer.removeAll();
		for (final ELayer elayer : ((EDisplay) eobject).getLayers()) {
			final TableItem ti = new TableItem(layerViewer, SWT.NONE);
			ti.setText(elayer.getName());
			ti.setBackground(hasError(elayer) ? new Color(frame.getShell().getDisplay(), 255, 100, 100)
					: new Color(frame.getShell().getDisplay(), 100, 255, 100));

		}
	}

	/**
	 * Test basic ok.
	 *
	 * @param lay
	 *            the lay
	 * @param speciesStr
	 *            the species str
	 * @return true, if successful
	 */
	public boolean testBasicOk(final ELayer lay, final List<String> speciesStr) {
		return lay.getType() == null || "species".equals(lay.getType()) && speciesStr.contains(lay.getSpecies());// &&

		// !ModelGenerator.hasSyntaxError(fp, lay.getName(), true);
	}

	/**
	 * Checks for error.
	 *
	 * @param elayer
	 *            the elayer
	 * @return true, if successful
	 */
	public boolean hasError(final ELayer elayer) {
		final GamaDiagramEditor diagramEditor = (GamaDiagramEditor) ExampleUtil.getDiagramEditor(fp);
		final List<String> speciesStr = new ArrayList<>();
		for (final ESpecies sp : species) { speciesStr.add(sp.getName()); }
		final List<String> ids = new ArrayList<>();
		final boolean basicOk = testBasicOk(elayer, speciesStr);
		if (basicOk) return false;
		diagramEditor.buildLocation(elayer, ids);

		if (diagramEditor.getErrorsLoc().isEmpty() && diagramEditor.getSyntaxErrorsLoc().isEmpty()) return false;

		return diagramEditor.getErrorsLoc().containsKey(ids) || diagramEditor.getSyntaxErrorsLoc().containsKey(ids);
	}

	/**
	 * Gets the grids.
	 *
	 * @return the grids
	 */
	public List<ESpecies> getGrids() { return grids; }

	/**
	 * Checks if is number.
	 *
	 * @param s
	 *            the s
	 * @return true, if is number
	 */
	public static boolean isNumber(final String s) {
		return s == null || s.isEmpty() || DOUBLE_PATTERN.matcher(s).matches();
	}
}
