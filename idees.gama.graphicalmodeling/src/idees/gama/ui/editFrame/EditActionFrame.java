/*******************************************************************************************************
 *
 * EditActionFrame.java, in idees.gama.graphicalmodeling, is part of the source code of the GAMA modeling and simulation
 * platform (v.1.9.3).
 *
 * (c) 2007-2024 UMI 209 UMMISCO IRD/SU & Partners (IRIT, MIAT, TLU, CTU)
 *
 * Visit https://github.com/gama-platform/gama for license information and contacts.
 *
 ********************************************************************************************************/
package idees.gama.ui.editFrame;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

import gama.EAction;
import gama.EGamaObject;
import gama.ESpecies;
import gama.EVariable;
import gama.gaml.compilation.GAML;
import idees.gama.diagram.GamaDiagramEditor;
import idees.gama.features.ExampleUtil;
import idees.gama.features.edit.EditFeature;
import idees.gama.features.modelgeneration.ModelGenerator;

/**
 * The Class EditActionFrame.
 */
public class EditActionFrame extends EditFrame {

	/** The table vars. */
	private Table table_vars;

	/** The cpt. */
	int cpt = 1;

	/** The types. */
	private final List<String> types = new ArrayList<>();

	/** The title font. */
	Font titleFont;

	/** The return type. */
	CCombo returnType;

	/**
	 * Create the application window.
	 */
	public EditActionFrame(final Diagram diagram, final IFeatureProvider fp, final EditFeature eaf,
			final EGamaObject action, final String name, final List<ESpecies> speciesList) {
		super(diagram, fp, eaf, action, name == null ? "Action definition" : name);

		types.add("int");
		types.add("float");
		types.add("string");
		types.add("bool");
		types.add("rgb");
		types.add("point");
		types.add("geometry");
		for (final String ty : GAML.VARTYPE2KEYWORDS.values()) {
			if (!types.contains(ty) && !ty.toString().endsWith("_file")) { types.add(ty); }

		}
		for (final ESpecies sp : speciesList) { types.add(sp.getName()); }
		types.remove("unknown");
		types.remove("world");
		final List<String> tt = new ArrayList<>(types);
		for (final String ty : tt) { types.add("list<" + ty + ">"); }
	}

	/**
	 * Instantiates a new edits the action frame.
	 *
	 * @param diagram
	 *            the diagram
	 * @param fp
	 *            the fp
	 * @param eaf
	 *            the eaf
	 * @param action
	 *            the action
	 * @param name
	 *            the name
	 */
	public EditActionFrame(final Diagram diagram, final IFeatureProvider fp, final EditFeature eaf,
			final EGamaObject action, final String name) {
		super(diagram, fp, eaf, action, name == null ? "Action definition" : name);
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
		titleFont = new Font(this.getShell().getDisplay(), "Arial", 10, SWT.BOLD);

		// ****** CANVAS NAME *********
		groupName(container);

		groupReturnType(container);

		groupVar(container);

		// ****** CANVAS GAMLCODE *********
		groupGamlCode(container, "Gaml code");

		return container;
	}

	/**
	 * Group return type.
	 *
	 * @param container
	 *            the container
	 */
	protected void groupReturnType(final Composite container) {

		// ****** CANVAS RETURN TYPE *********
		final Group group = new Group(container, SWT.NONE);
		// group.setBounds(10, 50, 720, 50);
		// Group group = new Group(container, SWT.NONE);
		final GridData gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		group.setLayoutData(gridData);

		group.setLayout(new GridLayout(2, false));

		final CLabel lblName = new CLabel(group, SWT.NONE);
		lblName.setText("Return type:");

		// group.setLayout( new FillLayout(SWT.HORIZONTAL));
		// group.setText("Return Type");

		returnType = new CCombo(group, SWT.BORDER);
		returnType.add("returns nothing");
		final GridData gridData2 = new GridData();
		gridData2.horizontalAlignment = SWT.FILL;
		gridData2.grabExcessHorizontalSpace = true;
		returnType.setLayoutData(gridData2);

		for (String type : types) { returnType.add(type); }
		final EAction action = (EAction) eobject;
		if (action.getReturnType() == null || action.getReturnType().isEmpty()) {
			returnType.setText("returns nothing");
		} else {
			returnType.setText(action.getReturnType());
		}

		returnType.addModifyListener(event -> save("returnType"));

	}

	/**
	 * Return the initial size of the window.
	 */
	@Override
	protected Point getInitialSize() { return new Point(743, 680); }

	@Override
	protected void save(final String name) {
		final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(eobject);
		if (domain != null) {
			domain.getCommandStack().execute(new RecordingCommand(domain) {

				@Override
				public void doExecute() {
					if (name == null) {
						eobject.setName(textName.getText());
						final EAction action = (EAction) eobject;
						if (modelXText != null) { ((EAction) eobject).setGamlCode(modelXText.getEditablePart()); }
						action.setReturnType(
								"returns nothing".equals(returnType.getText()) ? "" : returnType.getText());
						modifyArguments();
						updateEditor();
					} else if ("name".equals(name)) {
						eobject.setName(textName.getText());
					} else {
						final EAction action = (EAction) eobject;
						if (modelXText != null) { ((EAction) eobject).setGamlCode(modelXText.getEditablePart()); }
						action.setReturnType(
								"returns nothing".equals(returnType.getText()) ? "" : returnType.getText());
						modifyArguments();
						updateEditor();
					}
				}
			});
		}
		ModelGenerator.modelValidation(fp, diagram);
		ef.hasDoneChanges = true;

	}

	/**
	 * Modify arguments.
	 */
	private void modifyArguments() {
		final EAction action = (EAction) eobject;
		final List<EVariable> vars = new ArrayList<>();
		vars.addAll(action.getVariables());
		action.getVariables().clear();
		for (final EVariable var : vars) {
			final GamaDiagramEditor diagramEditor = (GamaDiagramEditor) ExampleUtil.getDiagramEditor(fp);
			diagramEditor.removeEOject(var);
			EcoreUtil.delete(var, true);

		}
		for (final TableItem item : table_vars.getItems()) {
			final EVariable var = gama.GamaFactory.eINSTANCE.createEVariable();
			var.setName(item.getText(0));
			var.setType(item.getText(1));
			var.setInit(item.getText(2));
			action.getVariables().add(var);
			final GamaDiagramEditor diagramEditor = (GamaDiagramEditor) ExampleUtil.getDiagramEditor(fp);
			diagramEditor.addEOject(var);

		}
	}

	/**
	 * Creates the table editor.
	 *
	 * @param container
	 *            the container
	 * @return the table
	 */
	private Table createTableEditor(final Composite container) {
		// Create the table
		final Table tableVars = new Table(container, SWT.SINGLE | SWT.FULL_SELECTION
		/* | SWT.HIDE_SELECTION */);
		tableVars.setHeaderVisible(true);
		tableVars.setLinesVisible(true);

		tableVars.addListener(SWT.MeasureItem, event -> event.height = 20);

		final TableColumn tblclmnName = new TableColumn(tableVars, SWT.NONE);
		tblclmnName.setWidth(100);
		tblclmnName.setText("Name");

		final TableColumn tblclmnType = new TableColumn(tableVars, SWT.NONE);
		tblclmnType.setWidth(100);
		tblclmnType.setText("Type");

		final TableColumn tblclmnInitValue = new TableColumn(tableVars, SWT.NONE);
		tblclmnInitValue.setWidth(100);
		tblclmnInitValue.setText("default value");

		// Create an editor object to use for text editing
		final TableEditor editor = new TableEditor(tableVars);
		editor.horizontalAlignment = SWT.LEFT;
		editor.grabHorizontal = true;

		// Use a mouse listener, not a selection listener, since we're
		// interested
		// in the selected column as well as row
		tableVars.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseDown(final MouseEvent event) {
				// Dispose any existing editor
				final Control old = editor.getEditor();
				if (old != null) { old.dispose(); }

				// Determine where the mouse was clicked
				final Point pt = new Point(event.x, event.y);

				// Determine which row was selected
				final TableItem item = tableVars.getItem(pt);

				if (item != null) {
					// Determine which column was selected
					int column = -1;
					for (int i = 0, n = tableVars.getColumnCount(); i < n; i++) {
						final Rectangle rect = item.getBounds(i);
						if (rect.contains(pt)) {
							// This is the selected column
							column = i;
							break;
						}
					}

					// Column 2 holds dropdowns
					if (column == 1) {
						// Create the dropdown and add data to it
						final CCombo combo = new CCombo(tableVars, SWT.READ_ONLY);
						for (String type : types) { combo.add(type); }

						// Select the previously selected item from the cell
						combo.select(combo.indexOf(item.getText(column)));

						// Compute the width for the editor
						// Also, compute the column width, so that the dropdown
						// fits
						// editor.minimumWidth = combo.computeSize(SWT.DEFAULT,
						// SWT.DEFAULT).x;
						// table.getColumn(column).setWidth(editor.minimumWidth);

						// Set the focus on the dropdown and set into the editor
						combo.setFocus();
						editor.setEditor(combo, item, column);

						// Add a listener to set the selected item back into the
						// cell
						final int col = column;
						combo.addSelectionListener(new SelectionAdapter() {

							@Override
							public void widgetSelected(final SelectionEvent event) {
								item.setText(col, combo.getText());
								save("arguments");
								// They selected an item; end the editing
								// session
								combo.dispose();
							}
						});
					} else {
						// Create the Text object for our editor
						final GamaDiagramEditor diagramEditor = (GamaDiagramEditor) ExampleUtil.getDiagramEditor(fp);
						final List<String> uselessName = new ArrayList<>();

						String name = "name";
						switch (column) {
							case 2:
								name = "";
								uselessName.add("name");
								break;
						}

						final ValidateText text = new ValidateText(tableVars, SWT.BORDER, diagram, fp, frame,
								diagramEditor, name, uselessName, item.getText(0));
						// text.setAllErrors(true);

						// Listener[] lis = text.getListeners(SWT.Modify);
						// for (Listener li : lis)
						// {text.removeModifyListener((ModifyListener) li);}
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
						text.addModifyListener(event1 -> {
							// Set the text of the editor's control back into
							// the cell
							item.setText(col, text.getText());
							save("variables");
							text.applyModification();

							item.setBackground(col, text.getBackground());
							for (int i = 2; i < table_vars.getColumnCount(); i++) {
								if (i == col) { continue; }
								String name1 = "name";
								switch (i) {
									case 2:
										name1 = "";
										break;
								}
								final String error = diagramEditor.containErrors(text.getLoc(), name1, null);
								// System.out.println("error = " + error);
								final String textI = item.getText(i);
								if (error != null && !error.isEmpty()) {
									item.setBackground(i, new Color(text.getDisplay(), 255, 100, 100));
								} else if (!textI.contains(";") && !textI.contains("{") && !textI.contains("}")) {
									item.setBackground(i, new Color(text.getDisplay(), 100, 255, 100));
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

	/**
	 * Inits the table.
	 */
	void initTable() {
		for (final EVariable var : ((EAction) eobject).getVariables()) {
			final TableItem ti = new TableItem(table_vars, SWT.NONE);
			ti.setText(new String[] { var.getName(), var.getType(), var.getInit() });
			cpt++;
		}
	}

	/**
	 * Group var.
	 *
	 * @param container
	 *            the container
	 */
	public void groupVar(final Composite container) {
		// ****** CANVAS VARIABLES *********

		final Group group = new Group(container, SWT.NONE);
		group.setBounds(10, 30, 720, 140);
		// group.setLayout( new FillLayout(SWT.HORIZONTAL));
		group.setText("arguments");

		table_vars = createTableEditor(group);
		table_vars.setBounds(10, 30, 700, 120);
		table_vars.setHeaderVisible(true);
		table_vars.setLinesVisible(true);

		initTable();

		final CLabel lblVariables = new CLabel(group, SWT.NONE);
		lblVariables.setBounds(10, 5, 100, 20);
		lblVariables.setText("Arguments");
		lblVariables.setFont(titleFont);
		final Button btnAddVariable = new Button(group, SWT.NONE);
		btnAddVariable.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(final SelectionEvent e) {
				final TableItem ti = new TableItem(table_vars, SWT.NONE);
				final String name = "arg" + cpt;
				ti.setText(new String[] { name, "int", "" });
				ti.setBackground(new Color(frame.getShell().getDisplay(), 100, 255, 100));
				cpt++;
				save("argument");
			}
		});
		btnAddVariable.setBounds(62, 158, 120, 28);
		btnAddVariable.setText("Add argument");

		final Button btnDeleteVariable = new Button(group, SWT.NONE);
		btnDeleteVariable.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(final SelectionEvent e) {
				final int[] indices = table_vars.getSelectionIndices();
				table_vars.remove(indices);
				table_vars.redraw();
				save("variables");
			}
		});
		btnDeleteVariable.setBounds(183, 158, 130, 28);
		btnDeleteVariable.setText("Delete argument");

	}

	@Override
	protected void handleShellCloseEvent() {
		// create dialog with ok and cancel button and info icon
		clean_close();
		if (returnType != null) { returnType.dispose(); }
		returnType = null;
		if (table_vars != null) { table_vars.dispose(); }
		table_vars = null;
		close();
	}

}
