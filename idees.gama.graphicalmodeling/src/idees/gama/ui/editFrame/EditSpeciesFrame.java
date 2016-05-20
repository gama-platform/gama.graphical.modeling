package idees.gama.ui.editFrame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;

import com.google.inject.Injector;

import gama.EAction;
import gama.EContinuousTopology;
import gama.EGraphTopologyEdge;
import gama.EGraphTopologyNode;
import gama.EGrid;
import gama.EGridTopology;
import gama.EReflexLink;
import gama.ESpecies;
import gama.EVariable;
import gama.EWorldAgent;
import idees.gama.diagram.GAMARessourceProvider;
import idees.gama.diagram.GamaDiagramEditor;
import idees.gama.diagram.ModelStructure;
import idees.gama.features.ExampleUtil;
import idees.gama.features.edit.EditSpeciesFeature;
import idees.gama.features.modelgeneration.ModelGenerator;
import msi.gama.lang.gaml.ui.internal.GamlActivator;
import msi.gama.lang.utils.EGaml;
import msi.gaml.compilation.AbstractGamlAdditions;

public class EditSpeciesFrame extends EditFrame {

	// Variables
	int cpt = 1;
	private Table table_vars;
	// private String[] types_base = {"int", "float", "string", "bool", "rgb", "pair", "list", "map", "file", "geometry", "path", "graph"};
	// private String[] types_base = new String[AbstractGamlAdditions.getAllFields().size()];
	private final List<String> types = new ArrayList<String>();

	org.eclipse.swt.widgets.List reflexViewer;
	org.eclipse.swt.widgets.List skillsViewer;
	List<String> reflexStrs;
	List<String> skillsStrs;
		Font titleFont;

	private final int CONST_WIDTH = 763;

	final EditFrame frame;
	

	// topology
	// private String[] type_topo = {"continuous", "grid", "graph_node", "graph_edge"};
	// private CCombo comboTopo;

	/**
	 * Create the application window.
	 */
	public EditSpeciesFrame(final Diagram diagram, final IFeatureProvider fp, final EditSpeciesFeature esf,
		final ESpecies species, final List<ESpecies> speciesList) {
		super(diagram, fp, esf, species, (species instanceof EWorldAgent) ? "World definition" : (species instanceof EGrid ? "Grid definition" :"Species definition" ));
		frame = this;
		skillsStrs = new ArrayList<String>();
		skillsStrs.addAll(AbstractGamlAdditions.getAllSkills());
		skillsStrs.removeAll(AbstractGamlAdditions.ARCHITECTURES);
		skillsStrs.remove("grid");

		reflexStrs = new ArrayList<String>();
		List<String> newReflex = new ArrayList<String>();
		for ( EReflexLink link : species.getReflexLinks() ) {
			if ( link.getTarget() == null ) {
				continue;
			}
			newReflex.add(link.getTarget().getName());
		}
		if ( species.getReflexList() == null || species.getReflexList().isEmpty() ) {
			reflexStrs.addAll(newReflex);
		} else {
			for ( String ref : species.getReflexList() ) {
				if ( newReflex.contains(ref) ) {
					reflexStrs.add(ref);
				}
			}
			for ( String ref : newReflex ) {
				if ( !reflexStrs.contains(ref) ) {
					reflexStrs.add(ref);
				}
			}
		}

		for ( Collection varType : AbstractGamlAdditions.VARTYPE2KEYWORDS.values() ) {
			types.addAll(varType);
		}
		for ( ESpecies sp : speciesList ) {
			types.add(sp.getName());
		}
		types.remove("unknown");
		types.remove("world");
		List<String> tt = new ArrayList<String>(types);
		for ( String ty : tt ) {
			types.add("list<" + ty + ">");
		}
	}

	/**
	 * Create contents of the application window.
	 * @param parent
	 */
	@Override
	protected Control createContents(final Composite parent) {
		final ScrolledComposite sc = new ScrolledComposite(parent, SWT.V_SCROLL | SWT.BORDER);
		Composite container = new Composite(sc, SWT.NONE);
		
		container.setLayout(new GridLayout(1, false));
		titleFont = new Font(this.getShell().getDisplay(), "Arial", 10, SWT.BOLD);

		if (!(eobject instanceof EWorldAgent)) groupName(container);
		groupSkills(container);
		
		if (eobject instanceof EWorldAgent) groupFacets(container, "global",2);
		else if (eobject instanceof EGrid) groupFacets(container, "grid",2); 
		else groupFacets(container, "species",2); 
		
		groupVariables(container);
		
		groupGamlCode(container, "Init");

		groupReflex(container);
		
		  /*
	     * // Set the absolute size of the child child.setSize(400, 400);
	     */
	    // Set the child as the scrolled content of the ScrolledComposite
	    sc.setContent(container);

	    // Set the minimum size
	    if (eobject instanceof EGrid)
	    	sc.setMinSize(container.computeSize(730, 980));
	    else
	    	sc.setMinSize(container.computeSize(730, 700));
	    // Expand both horizontally and vertically
	    sc.setExpandHorizontal(true);
	    sc.setExpandVertical(true);
		return container;
	}

	

	

	private EVariable getEVariable(final String name) {
		if ( ((ESpecies) eobject).getVariables() == null || ((ESpecies) eobject).getVariables().isEmpty() ) { return null; }
		for ( EVariable var : ((ESpecies) eobject).getVariables() ) {
			if ( var == null ) {
				continue;
			}
			if ( name.equals(var.getName()) ) { return var; }
		}
		return null;
	}

	private void modifyVariables() {
		ESpecies species = (ESpecies) eobject;
		List<EVariable> vars = new ArrayList<EVariable>();
		vars.addAll(species.getVariables());
		species.getVariables().clear();
		for ( EVariable var : vars ) {
			GamaDiagramEditor diagramEditor = ((GamaDiagramEditor)ExampleUtil.getDiagramEditor(fp));
			diagramEditor.removeEOject(var);
			EcoreUtil.delete(var, true);

		}
		for ( final TableItem item : table_vars.getItems() ) {
			final EVariable var = gama.GamaFactory.eINSTANCE.createEVariable();
			var.setName(item.getText(0));
			var.setType(item.getText(1));
			var.setInit(item.getText(2));
			var.setUpdate(item.getText(3));
			var.setFunction(item.getText(4));
			var.setMin(item.getText(5));
			var.setMax(item.getText(6));
			species.getVariables().add(var);
			GamaDiagramEditor diagramEditor = ((GamaDiagramEditor)ExampleUtil.getDiagramEditor(fp));
			diagramEditor.addEOject(var);

		}
	}

	
	private void modifyReflexOrder() {
		((ESpecies) eobject).getReflexList().clear();
		((ESpecies) eobject).getReflexList().addAll(reflexStrs);
	}

	

	/**
	 * Creates the main window's contents
	 * 
	 * @param shell the main window
	 */
	private Table createTableEditor(final Composite container) {
		// Create the table
		final Table tableVars = new Table(container, SWT.SINGLE | SWT.FULL_SELECTION
		/* | SWT.HIDE_SELECTION */);
		tableVars.setHeaderVisible(true);
		tableVars.setLinesVisible(true);

		tableVars.addListener(SWT.MeasureItem, new Listener() {

			@Override
			public void handleEvent(final Event event) {
				event.height = 20;
				// TableItem item = (TableItem) event.item;
				// System.out.println("item.getBackground(): " + item.getBackground());
				// event.gc.setBackground(item.getBackground());
			}
		});

		TableColumn tblclmnName = new TableColumn(tableVars, SWT.NONE);
		tblclmnName.setWidth(100);
		tblclmnName.setText("Name");

		TableColumn tblclmnType = new TableColumn(tableVars, SWT.NONE);
		tblclmnType.setWidth(100);
		tblclmnType.setText("Type");

		TableColumn tblclmnInitValue = new TableColumn(tableVars, SWT.NONE);
		tblclmnInitValue.setWidth(100);
		tblclmnInitValue.setText("init value");

		TableColumn tblclmnUpdate = new TableColumn(tableVars, SWT.NONE);
		tblclmnUpdate.setWidth(100);
		tblclmnUpdate.setText("update");

		TableColumn tblclmnFunction = new TableColumn(tableVars, SWT.NONE);
		tblclmnFunction.setWidth(100);
		tblclmnFunction.setText("function");

		TableColumn tblclmnMin = new TableColumn(tableVars, SWT.NONE);
		tblclmnMin.setWidth(100);
		tblclmnMin.setText("min");

		TableColumn tblclmnMax = new TableColumn(tableVars, SWT.NONE);
		tblclmnMax.setWidth(100);
		tblclmnMax.setText("max");

		// Create an editor object to use for text editing
		final TableEditor editor = new TableEditor(tableVars);
		editor.horizontalAlignment = SWT.LEFT;
		editor.grabHorizontal = true;

		// Use a mouse listener, not a selection listener, since we're interested
		// in the selected column as well as row
		tableVars.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseDown(final MouseEvent event) {
				// Dispose any existing editor
				Control old = editor.getEditor();
				if ( old != null ) {
					old.dispose();
				}

				// Determine where the mouse was clicked
				Point pt = new Point(event.x, event.y);

				// Determine which row was selected
				final TableItem item = tableVars.getItem(pt);

				if ( item != null ) {
					// Determine which column was selected
					int column = -1;
					for ( int i = 0, n = tableVars.getColumnCount(); i < n; i++ ) {
						Rectangle rect = item.getBounds(i);
						if ( rect.contains(pt) ) {
							// This is the selected column
							column = i;
							break;
						}
					}

					// Column 2 holds dropdowns
					if ( column == 1 ) {
						// Create the dropdown and add data to it
						final CCombo combo = new CCombo(tableVars, SWT.READ_ONLY);
						for ( int i = 0, n = types.size(); i < n; i++ ) {
							combo.add(types.get(i));
						}

						// Select the previously selected item from the cell
						combo.select(combo.indexOf(item.getText(column)));

						// Compute the width for the editor
						// Also, compute the column width, so that the dropdown fits
						// editor.minimumWidth = combo.computeSize(SWT.DEFAULT, SWT.DEFAULT).x;
						// table.getColumn(column).setWidth(editor.minimumWidth);

						// Set the focus on the dropdown and set into the editor
						combo.setFocus();
						editor.setEditor(combo, item, column);

						// Add a listener to set the selected item back into the cell
						final int col = column;
						combo.addSelectionListener(new SelectionAdapter() {

							@Override
							public void widgetSelected(final SelectionEvent event) {
								item.setText(col, combo.getText());
								save("variables");
								// They selected an item; end the editing session
								combo.dispose();
							}
						});
					} else if ( column != 1 ) {
						// Create the Text object for our editor
						final GamaDiagramEditor diagramEditor =
							((GamaDiagramEditor)ExampleUtil.getDiagramEditor(fp));
						String name = "name";
						switch (column) {
							case 2:
								name = "<-";
								break;
							case 3:
								name = "update:";
								break;
							case 4:
								name = "->";
								break;
							case 5:
								name = "min:";
								break;
							case 6:
								name = "max:";
								break;
						}

						final ValidateText text =
							new ValidateText(tableVars, SWT.BORDER, diagram, fp, frame, diagramEditor, name, null, item
								.getText(0));
						// text.setAllErrors(true);

						// Listener[] lis = text.getListeners(SWT.Modify);
						// for (Listener li : lis) {text.removeModifyListener((ModifyListener) li);}
						item.setBackground(column, text.getBackground());

						// final Text text = new Text(tableVars, SWT.NONE);
						// text.setForeground(item.getForeground());

						// Transfer any text from the cell to the Text control,
						// set the color to match this row, select the text,
						// and set focus to the control
						text.setText(item.getText(column));
						text.setForeground(item.getForeground());
						text.selectAll();
						text.setFocus();

						// Recalculate the minimum width for the editor
						editor.minimumWidth = text.getBounds().width;

						// Set the control into the editor
						editor.setEditor(text, item, column);

						// Add a handler to transfer the text back to the cell
						// any time it's modified
						final int col = column;
						text.addModifyListener(new ModifyListener() {

							@Override
							public void modifyText(final ModifyEvent event) {
								// Set the text of the editor's control back into the cell
								item.setText(col, text.getText());
								save("variables");
								text.applyModification();

								item.setBackground(col, text.getBackground());
								for ( int i = 2; i < table_vars.getColumnCount(); i++ ) {
									if ( i == col ) {
										continue;
									}
									String name = "name";
									switch (i) {
										case 2:
											name = "<-";
											break;
										case 3:
											name = "update:";
											break;
										case 4:
											name = "->";
											break;
										case 5:
											name = "min:";
											break;
										case 6:
											name = "max:";
											break;
									}
									String error = diagramEditor.containErrors(text.getLoc(), name, null);
									// System.out.println("error = " + error);
									String textI = item.getText(i);
									if ( error != null && !error.isEmpty() ) {
										item.setBackground(i, new Color(text.getDisplay(), 255, 100, 100));
									} else if ( !textI.contains(";") && !textI.contains("{") && !textI.contains("}") ) {
										item.setBackground(i, new Color(text.getDisplay(), 100, 255, 100));
									}
								}

							}
						});
					}
				} else {
					tableVars.deselectAll();
				}
			}
		});
		return tableVars;
	}

	void initTable() {
		for ( EVariable var : ((ESpecies) eobject).getVariables() ) {
			TableItem ti = new TableItem(table_vars, SWT.NONE);
			ti.setText(new String[] { var.getName(), var.getType(), var.getInit(), var.getUpdate(), var.getFunction(),
				var.getMin(), var.getMax() });
			cpt++;
		}
	}

	public void groupVariables(final Composite container) {
		Group group = new Group(container, SWT.NONE);
		group.setBounds(10, 250, 720, 200);

		table_vars = createTableEditor(group);
		table_vars.setBounds(10, 30, 700, 120);
		table_vars.setHeaderVisible(true);
		table_vars.setLinesVisible(true);

		initTable();

		CLabel lblVariables = new CLabel(group, SWT.NONE);
		lblVariables.setBounds(10, 5, 100, 20);
		lblVariables.setText("Variables");
		lblVariables.setFont(titleFont);
		Button btnAddVariable = new Button(group, SWT.NONE);
		btnAddVariable.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(final SelectionEvent e) {
				TableItem ti = new TableItem(table_vars, SWT.NONE);
				final String name = "var_name" + cpt;
				ti.setText(new String[] { name, "int", "", "", "", "", "" });
				ti.setBackground(new Color(frame.getShell().getDisplay(), 100, 255, 100));
				cpt++;
				save("variables");
			}
		});
		btnAddVariable.setBounds(62, 162, 94, 28);
		btnAddVariable.setText("Add variable");

		Button btnDeleteVariable = new Button(group, SWT.NONE);
		btnDeleteVariable.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(final SelectionEvent e) {
				int[] indices = table_vars.getSelectionIndices();
				table_vars.remove(indices);
				table_vars.redraw();
				save("variables");
			}
		});
		btnDeleteVariable.setBounds(163, 162, 112, 28);
		btnDeleteVariable.setText("Delete variable");
	}

	
	public void groupSkills(final Composite container) {
		// ****** CANVAS SKILLS *********
		final GamaDiagramEditor diagramEditor = ((GamaDiagramEditor)ExampleUtil.getDiagramEditor(fp));

		Group group = new Group(container, SWT.NONE);
		group.setBounds(10, 460, 720, 100);

		CLabel lblSkills = new CLabel(group, SWT.NONE);
		lblSkills.setBounds(5, 5, 100, 20);
		lblSkills.setText("Skills");
		lblSkills.setFont(titleFont);

		CLabel lblAvSkills = new CLabel(group, SWT.NONE);
		lblAvSkills.setBounds(5, 23, 100, 20);
		lblAvSkills.setText("Available Skills");

		CLabel lblSelectSkills = new CLabel(group, SWT.NONE);
		lblSelectSkills.setBounds(325, 23, 100, 20);
		lblSelectSkills.setText("Selected Skills");

		final org.eclipse.swt.widgets.List listAvSkills =
			new org.eclipse.swt.widgets.List(group, SWT.BORDER | SWT.V_SCROLL);
		listAvSkills.setBounds(5, 45, 250, 45);
		for ( String ski : skillsStrs ) {
			listAvSkills.add(ski);
		}
		skillsViewer = new org.eclipse.swt.widgets.List(group, SWT.BORDER | SWT.V_SCROLL);
		skillsViewer.setBounds(325, 45, 250, 45);

		Button btnRigth = new Button(group, SWT.ARROW | SWT.RIGHT);
		btnRigth.setBounds(265, 50, 50, 15);
		btnRigth.setSelection(true);
		btnRigth.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(final SelectionEvent e) {
				if ( listAvSkills.getSelectionCount() > 0 ) {
					String[] els = listAvSkills.getSelection();
					for ( String el : els ) {
						skillsViewer.add(el);
					}
					listAvSkills.remove(listAvSkills.getSelectionIndices());
					listAvSkills.redraw();
					skillsViewer.redraw();
					save("skills");
					ModelGenerator.modelValidation(fp, diagram);
					diagramEditor.updateEObjectErrors();
				}
			}
		});
		Button btnLeft = new Button(group, SWT.ARROW | SWT.LEFT);
		btnLeft.setBounds(265, 70, 50, 15);
		btnLeft.setSelection(true);
		btnLeft.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(final SelectionEvent e) {
				if ( skillsViewer.getSelectionCount() > 0 ) {
					String[] els = skillsViewer.getSelection();
					for ( String el : els ) {
						listAvSkills.add(el);
					}
					skillsViewer.remove(skillsViewer.getSelectionIndices());
					listAvSkills.redraw();
					skillsViewer.redraw();
					save("skills");
					ModelGenerator.modelValidation(fp, diagram);
					diagramEditor.updateEObjectErrors();
				}
			}
		});
		if ( ((ESpecies) eobject).getSkills() != null ) {
			for ( String sk : ((ESpecies) eobject).getSkills() ) {
				skillsStrs.remove(sk);
				skillsViewer.add(sk);
				listAvSkills.remove(sk);

			}
			skillsViewer.redraw();
			listAvSkills.redraw();

		}
	}

	
	public void groupReflex(final Composite container) {
		// ****** CANVAS REFLEX ORDER *********
		Group group = new Group(container, SWT.NONE);
		group.setBounds(10, 460, 720, 110);

		reflexViewer = new org.eclipse.swt.widgets.List(group, SWT.BORDER | SWT.V_SCROLL);

		for ( String ref : reflexStrs ) {
			reflexViewer.add(ref);
		}

		reflexViewer.setBounds(5, 30, 700, 45);
		CLabel lblReflexOrder = new CLabel(group, SWT.NONE);
		lblReflexOrder.setBounds(5, 5, 100, 20);
		lblReflexOrder.setText("Reflex order");
		lblReflexOrder.setFont(titleFont);

		Button btnUp = new Button(group, SWT.ARROW | SWT.UP);
		btnUp.setBounds(80, 85, 105, 20);
		btnUp.setText("Up");
		btnUp.setSelection(true);
		btnUp.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(final SelectionEvent e) {
				if ( reflexViewer.getSelectionCount() == 1 ) {
					String el = reflexViewer.getSelection()[0];
					int index = reflexViewer.getSelectionIndex();
					if ( index > 0 ) {
						reflexStrs.remove(el);
						reflexStrs.add(index - 1, el);
						reflexViewer.removeAll();
						for ( String ref : reflexStrs ) {
							reflexViewer.add(ref);
						}
					}
				}
			}
		});
		Button btnDown = new Button(group, SWT.ARROW | SWT.DOWN);
		btnDown.setBounds(200, 85, 105, 20);
		btnDown.setText("Down");
		btnDown.setSelection(true);
		btnDown.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(final SelectionEvent e) {
				if ( reflexViewer.getSelectionCount() == 1 ) {
					String el = reflexViewer.getSelection()[0];
					int index = reflexViewer.getSelectionIndex();
					if ( index < reflexViewer.getItemCount() - 1 ) {
						reflexStrs.remove(el);
						reflexStrs.add(index + 1, el);
						reflexViewer.removeAll();
						for ( String ref : reflexStrs ) {
							reflexViewer.add(ref);
						}

					}
				}
			}
		});
	}

	@Override
	protected void save(final String name) {
		final ESpecies species = (ESpecies) eobject;
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(eobject);
		if ( domain != null ) {
			domain.getCommandStack().execute(new RecordingCommand(domain) {

				@Override
				public void doExecute() {
					// System.out.println("totot name: " + name);
					if (name == null || "".equals(name)) {
						if (textName != null) eobject.setName(textName.getText());
						((ESpecies) eobject).setInit(modelXText.getEditablePart());
						modifyReflexOrder();
						modifyVariables();
						species.getSkills().clear();
						species.getSkills().addAll(Arrays.asList(skillsViewer.getItems()));
						saveFacets();
						updateEditor();
						
					}
					else if ( name.equals("name") ) {
						eobject.setName(textName.getText());
					} else if ( name.equals("init") ) {
						((ESpecies) eobject).setInit(modelXText.getEditablePart());
					} else if ( name.equals("reflex order") ) {
						modifyReflexOrder();

					} else if ( name.equals("variables") ) {
						modifyVariables();
						updateEditor();
					} else if ( name.equals("skills") ) {
						species.getSkills().clear();
						species.getSkills().addAll(Arrays.asList(skillsViewer.getItems()));
						updateEditor();
						// System.out.println("species: " + species);
					}

				}
			});
		}

		ef.hasDoneChanges = true;
		ModelGenerator.modelValidation(fp, diagram);
	}

	@Override
	protected Point getInitialSize() {
		return new Point(CONST_WIDTH, 600);
	}

	@Override
	public void create() {
		setShellStyle(SWT.DIALOG_TRIM | SWT.RESIZE);
		super.create();
		shell = getShell();
		shell.addControlListener(new ControlAdapter() {

			@Override
			public void controlResized(final ControlEvent e) {
				Rectangle rect = shell.getBounds();
				if ( rect.width != CONST_WIDTH ) {
					shell.setBounds(rect.x, rect.y, CONST_WIDTH, rect.height);
				}
			}
		});

	}

}