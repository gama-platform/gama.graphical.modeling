package idees.gama.ui.editFrame;

import gama.*;
import idees.gama.diagram.GamaDiagramEditor;
import idees.gama.features.ExampleUtil;
import idees.gama.features.edit.EditFeature;
import idees.gama.features.modelgeneration.ModelGenerator;
import java.util.*;
import java.util.List;
import java.util.regex.Pattern;
import msi.gama.util.TOrderedHashMap;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.*;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.pictograms.*;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.*;
import org.eclipse.swt.graphics.*;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;

public class EditDisplayFrame extends EditFrame {

	Table layerViewer;
	EditDisplayFrame frame;

	List<ESpecies> species;
	List<ESpecies> grids;
	
	Diagram diagram;
	final Map<ELayer, EditLayerFrame> layerFrames;


	private static final Pattern DOUBLE_PATTERN = Pattern
		.compile("[\\x00-\\x20]*[+-]?(NaN|Infinity|((((\\p{Digit}+)(\\.)?((\\p{Digit}+)?)"
			+ "([eE][+-]?(\\p{Digit}+))?)|(\\.((\\p{Digit}+))([eE][+-]?(\\p{Digit}+))?)|"
			+ "(((0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+)))"
			+ "[pP][+-]?(\\p{Digit}+)))[fFdD]?))[\\x00-\\x20]*");


	/**
	 * Create the application window.
	 */
	public EditDisplayFrame(final Diagram diagram, final IFeatureProvider fp, final EditFeature eaf,
		final EGamaObject display, final String name) {
		super(diagram, fp, eaf, display, name == null ? "Display definition" : name);
		layerFrames = new TOrderedHashMap<ELayer, EditLayerFrame>();
		species = new ArrayList<ESpecies>();
		grids = new ArrayList<ESpecies>();
		this.diagram = diagram;
		List<Shape> contents = diagram.getChildren();
		for ( Shape sh : contents ) {
			Object obj = fp.getBusinessObjectForPictogramElement(sh);
			if ( obj instanceof EGrid ) {
				grids.add((ESpecies) obj);
			} 
			if ( obj instanceof ESpecies ) {
				species.add((ESpecies) obj);
			}
		}
		frame = this;

		updateLayerId();
		ModelGenerator.modelValidation(fp, diagram);

	}

	private void loadData() {
		EDisplay display = (EDisplay) eobject;
		for ( ELayer la : display.getLayers() ) {
			// layerViewer.add(la.getName());
			TableItem ti = new TableItem(layerViewer, SWT.NONE);
			ti.setText(la.getName());
			// ti.setBackground(new Color(frame.getShell().getDisplay(), 100,255,100));
			ti.setBackground(hasError(la) ? new Color(frame.getShell().getDisplay(), 255, 100, 100) : new Color(frame
				.getShell().getDisplay(), 100, 255, 100));

		}

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

	
		groupFacets(container, "display",2);
				
		// ****** CANVAS LAYERS *********
		groupLayers(container);

		loadData();

		return container;
	}

	protected void groupLayers(final Composite container) {

		// ****** CANVAS LAYERS *********
		// ****** CANVAS LAYERS *********
		Group group = new Group(container, SWT.NONE);
		final GamaDiagramEditor diagramEditor = ((GamaDiagramEditor)ExampleUtil.getDiagramEditor(fp));

		group.setLayout(new FillLayout(SWT.VERTICAL));
		group.setText("Display layers");

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

		Composite containerButtons = new Composite(group, SWT.NONE);
		containerButtons.setLayout(new FillLayout(SWT.HORIZONTAL));
		GridData gridData3 = new GridData();
		gridData3.horizontalAlignment = SWT.FILL;
		gridData3.grabExcessHorizontalSpace = true;
		containerButtons.setLayoutData(gridData3);

		Button addLayerBtn = new Button(containerButtons, SWT.BUTTON1);
		addLayerBtn.setText("Add");
		addLayerBtn.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(final SelectionEvent e) {
				final ELayer elayer = gama.GamaFactory.eINSTANCE.createELayer();
				TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(eobject);
				if ( domain != null ) {
					domain.getCommandStack().execute(new RecordingCommand(domain) {

						@Override
						public void doExecute() {
							elayer.setName("Layer");
							elayer.setDisplay((EDisplay) eobject);
							diagram.eResource().getContents().add(elayer);
							TableItem ti = new TableItem(layerViewer, SWT.NONE);
							ti.setText(elayer.getName());
							ti.setBackground(hasError(elayer) ? new Color(frame.getShell().getDisplay(), 255, 100, 100)
								: new Color(frame.getShell().getDisplay(), 100, 255, 100));

							((EDisplay) eobject).getLayers().add(elayer);

						}
					});
				}

				ef.hasDoneChanges = true;

				EditLayerFrame eaf = new EditLayerFrame(elayer, frame, species, grids, false, diagram, fp, ef);
				layerFrames.put(elayer, eaf);
				eaf.open();
				frame.updateLayerId();
			}
		});

		Button editLayerBtn = new Button(containerButtons, SWT.BUTTON1);
		editLayerBtn.setText("Edit");
		editLayerBtn.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(final SelectionEvent e) {
				if ( layerViewer.getSelectionCount() == 1 ) {
					updateLayerId();

					final int index = layerViewer.getSelectionIndex();
					ELayer layer = ((EDisplay) eobject).getLayers().get(index);
					EditLayerFrame eaf = layerFrames.get(layer);
					if ( eaf == null || eaf.getShell() == null || eaf.getShell().isDisposed() ) {
						eaf = new EditLayerFrame(layer, frame, species, grids, true, diagram, fp, ef);
						eaf.open();
						layerFrames.put(layer, eaf);

					} else {
						eaf.getShell().setFocus();
					}

				}
			}
		});

		Button removeLayerBtn = new Button(containerButtons, SWT.BUTTON1);
		removeLayerBtn.setText("Remove");
		removeLayerBtn.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(final SelectionEvent e) {
				if ( layerViewer.getSelectionCount() == 1 ) {
					final int index = layerViewer.getSelectionIndex();
					layerViewer.remove(index);
					TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(eobject);
					if ( domain != null ) {
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
		Button btnUp = new Button(containerButtons, SWT.ARROW | SWT.UP);
		btnUp.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(final SelectionEvent e) {
				if ( layerViewer.getSelectionCount() == 1 ) {
					int index = layerViewer.getSelectionIndex();
					if ( index > 0 ) {
						((EDisplay) eobject).getLayers().move(index - 1, index);
						layerViewer.removeAll();
						for ( ELayer la : ((EDisplay) eobject).getLayers() ) {
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
		btnDown.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(final SelectionEvent e) {
				if ( layerViewer.getSelectionCount() == 1 ) {
					int index = layerViewer.getSelectionIndex();
					if ( index < layerViewer.getItemCount() - 1 ) {
						((EDisplay) eobject).getLayers().move(index + 1, index);
						layerViewer.removeAll();
						for ( ELayer la : ((EDisplay) eobject).getLayers() ) {
							TableItem ti = new TableItem(layerViewer, SWT.NONE);
							ti.setText(la.getName());
							ti.setBackground(hasError(la) ? new Color(frame.getShell().getDisplay(), 255, 100, 100)
								: new Color(frame.getShell().getDisplay(), 100, 255, 100));
						}
					}
				}
			}
		});
	}

	public void updateLayerId() {
		final GamaDiagramEditor diagramEditor = ((GamaDiagramEditor)ExampleUtil.getDiagramEditor(fp));
		List<String> loc = new ArrayList<String>();
		diagramEditor.buildLocation(eobject, loc);
		int size = loc.size();
		List<List<String>> ids = new ArrayList<List<String>>(diagramEditor.getIdsEObjects().keySet());
		for ( List<String> lid : ids ) {
			if ( lid.size() > size && lid.get(lid.size() - 2).equals(eobject.getName()) ) {
				diagramEditor.getIdsEObjects().remove(lid);
			}
		}
		for ( ELayer layer : ((EDisplay) eobject).getLayers() ) {
			if ( layer.getType() == null ) {
				continue;
			}
			List<String> key = new ArrayList<String>(loc);
			key.add(layer.getType());
			diagramEditor.getIdsEObjects().put(key, eobject);
		}
	}

	
	/**
	 * Return the initial size of the window.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(743, 645);
	}

	public Table getLayerViewer() {
		return layerViewer;
	}

	private void modifyOtherProperties() {
		EDisplay display = (EDisplay) eobject;
		display.setName(textName.getText());
		saveFacets();
	}

	@Override
	protected void save(final String name) {
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(eobject);
		if ( domain != null ) {
			domain.getCommandStack().execute(new RecordingCommand(domain) {

				@Override
				public void doExecute() {
					if (name == null) {
						eobject.setName(textName.getText());
						modifyOtherProperties();
					}
					else if ( name.equals("name") ) {
						eobject.setName(textName.getText());
					} else {
						// modifyLayerOrder();
						modifyOtherProperties();
					}
				}
			});
		}
		ef.hasDoneChanges = true;

	}

	public void updateLayer() {
		layerViewer.removeAll();
		for ( ELayer elayer : ((EDisplay) eobject).getLayers() ) {
			TableItem ti = new TableItem(layerViewer, SWT.NONE);
			ti.setText(elayer.getName());
			ti.setBackground(hasError(elayer) ? new Color(frame.getShell().getDisplay(), 255, 100, 100) : new Color(
				frame.getShell().getDisplay(), 100, 255, 100));

		}
	}

	public boolean testBasicOk(final ELayer lay, final List<String> speciesStr) {
		return (lay.getType() == null || lay.getType().equals("species") && speciesStr.contains(lay.getSpecies())) &&
			
			!ModelGenerator.hasSyntaxError(fp, lay.getName(), true);
	}

	public boolean hasError(final ELayer elayer) {
		final GamaDiagramEditor diagramEditor = ((GamaDiagramEditor)ExampleUtil.getDiagramEditor(fp));
		List<String> speciesStr = new ArrayList<String>();
		for ( ESpecies sp : species ) {
			speciesStr.add(sp.getName());
		}
		List<String> ids = new ArrayList<String>();
		boolean basicOk = testBasicOk(elayer, speciesStr);
		if ( basicOk ) { return false; }
		diagramEditor.buildLocation(elayer, ids);

		if ( diagramEditor.getErrorsLoc().isEmpty() && diagramEditor.getSyntaxErrorsLoc().isEmpty() ) { return false; }

		return diagramEditor.getErrorsLoc().containsKey(ids) || diagramEditor.getSyntaxErrorsLoc().containsKey(ids);
	}

	public List<ESpecies> getGrids() {
		return grids;
	}

	public static boolean isNumber(final String s) {
		return s == null || s.isEmpty() || DOUBLE_PATTERN.matcher(s).matches();
	}
}
