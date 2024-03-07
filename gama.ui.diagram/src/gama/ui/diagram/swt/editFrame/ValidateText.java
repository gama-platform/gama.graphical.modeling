/*******************************************************************************************************
 *
 * ValidateText.java, in gama.ui.diagram, is part of the source code of the GAMA modeling and simulation
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

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ToolTip;

import gama.core.util.GamaMapFactory;
import gama.ui.diagram.editor.GamaDiagramEditor;
import gama.ui.diagram.features.modelgeneration.ModelGenerator;

/**
 * The Class ValidateText.
 */
public class ValidateText extends StyledText {

	/** The col valid. */
	Color colValid;

	/** The col not valid. */
	Color colNotValid;

	/** The is valid. */
	boolean isValid;

	/** The error. */
	String error;

	/** The diagram. */
	final Diagram diagram;

	/** The fp. */
	final IFeatureProvider fp;

	/** The frame. */
	final EditFrame frame;

	/** The name loc. */
	final String nameLoc;

	/** The loc. */
	final List<String> loc;

	/** The editor. */
	final GamaDiagramEditor editor;

	/** The tip. */
	final ToolTip tip;

	/** The useless name. */
	List<String> uselessName;

	/** The Constant TOOLTIP_HIDE_DELAY. */
	final static int TOOLTIP_HIDE_DELAY = 200; // 0.2s

	/** The Constant TOOLTIP_SHOW_DELAY. */
	final static int TOOLTIP_SHOW_DELAY = 500; // 0.5s

	/** The linked vts. */
	final List<ValidateText> linkedVts = new ArrayList<>();

	/** The all errors. */
	boolean allErrors;

	/** The is string. */
	boolean isString = false;

	/** The save data. */
	boolean saveData = false;

	/** The name feature. */
	boolean nameFeature = true;

	/** The simple validation. */
	boolean simpleValidation = false;

	/** The add to loc. */
	String addToLoc;

	/**
	 * Instantiates a new validate text.
	 *
	 * @param parent
	 *            the parent
	 * @param style
	 *            the style
	 * @param diagram
	 *            the diagram
	 * @param fp
	 *            the fp
	 * @param frame
	 *            the frame
	 * @param editor
	 *            the editor
	 * @param name
	 *            the name
	 * @param uselessName
	 *            the useless name
	 * @param addToLoc
	 *            the add to loc
	 */
	@SuppressWarnings ("unused")
	public ValidateText(final Composite parent, final int style, final Diagram diagram, final IFeatureProvider fp,
			final EditFrame frame, final GamaDiagramEditor editor, final String name, final List<String> uselessName,
			final String addToLoc) {
		super(parent, style);
		this.diagram = diagram;
		new UndoRedoStyledText(this);

		tip = new ToolTip(getShell(), SWT.BALLOON);
		tip.setText("ERROR");
		tip.setAutoHide(false);
		this.uselessName = uselessName;
		allErrors = false;

		this.fp = fp;
		this.nameLoc = name;

		// System.out.println("ValidateText");
		this.addToLoc = addToLoc;
		loc = new ArrayList<>();
		editor.buildLocation(frame.eobject, loc);
		// System.out.println("loc: " + loc);
		if (addToLoc != null && !addToLoc.isEmpty()) {
			loc.add(addToLoc);
			// loc.add(0, "world");
		}

		colValid = new Color(getDisplay(), 150, 255, 150);
		colNotValid = new Color(getDisplay(), 255, 150, 150);
		error = editor.containErrors(loc, name, uselessName);
		tip.setMessage(error);

		isValid = "".equals(error);
		this.setBackground(isValid ? colValid : colNotValid);
		this.frame = frame;
		this.editor = editor;

		addModifyListener(event -> applyModification());

		addListener(SWT.MouseHover, event -> tip.getDisplay().timerExec(TOOLTIP_SHOW_DELAY, () -> {
			if (!isValid) {
				tip.setVisible(true);
			} else {
				tip.setVisible(false);
			}
		}));

		addListener(SWT.MouseExit,
				event -> tip.getDisplay().timerExec(TOOLTIP_HIDE_DELAY, () -> tip.setVisible(false)));
	}

	/**
	 * Update color.
	 */
	public void updateColor() {
		if ("name".equals(nameLoc)) {
			isValid = !getText().isEmpty() && !getText().contains(" ") && !getText().contains(";")
					&& !getText().contains("{") && !getText().contains("}") && !getText().contains("\t");
		} else {
			isValid = !ModelGenerator.hasSyntaxError(fp, getText(), true, isString);
		}
		if (isValid) {
			final Map<String, String> locs = editor.getSyntaxErrorsLoc().get(loc);
			if (locs != null) { locs.remove(nameLoc); }
			if (nameFeature && "name".equals(nameLoc)) {
				addToLoc = getText();
				final List<String> oldLoc = new ArrayList<>();
				oldLoc.addAll(loc);
				loc.clear();
				editor.buildLocation(frame.eobject, loc);
				if (addToLoc != null && !addToLoc.isEmpty() && !loc.get(loc.size() - 1).equals(addToLoc)) {
					loc.add(addToLoc);
				}

				for (final ValidateText vst : linkedVts) { if (vst != null) { vst.updateLoc(loc); } }
				editor.updateErrors(oldLoc, loc);
				editor.getIdsEObjects().clear();
				editor.initIdsEObjects();

			}
			if (allErrors) {
				error = editor.containErrors(loc, "", uselessName);
			} else {
				error = editor.containErrors(loc, nameLoc, uselessName);
			}

		} else {
			error = "Syntax errors detected ";
			final List<String> wStr = new ArrayList<>();
			wStr.add("world");
			editor.getSyntaxErrorsLoc().remove(wStr);
			Map<String, String> locs = editor.getSyntaxErrorsLoc().get(loc);

			if (locs == null) { locs = GamaMapFactory.create(); }
			locs.put(nameLoc, "Syntax errors detected ");
			// .out.println("loc: " + loc);
			editor.getSyntaxErrorsLoc().put(loc, locs);
		}
		if (error != null) {
			tip.setMessage(error);
			isValid = "".equals(error);
		}
		setBackground(isValid ? colValid : colNotValid);
		if (isValid) { tip.setVisible(false); }
		editor.updateEObjectErrors();
	}

	/**
	 * Apply modification.
	 */
	public void applyModification() {
		// System.out.println("Loc: " + loc + "nameLoc: " + nameLoc + "
		// saveData:" + saveData);

		if (saveData) { frame.save(nameLoc); }
		// System.out.println("isString");
		frame.getShell().forceFocus();
		if ("name".equals(nameLoc)) {
			if (simpleValidation) {
				isValid = !getText().isEmpty();
			} else {
				isValid = !getText().isEmpty() && !getText().contains(" ") && !getText().contains(";")
						&& !getText().contains("{") && !getText().contains("}") && !getText().contains("\t");
			}
		} else {
			isValid = !ModelGenerator.hasSyntaxError(fp, getText(), true, isString);
		}
		if (isValid) {
			ModelGenerator.modelValidation(fp, diagram);
			final Map<String, String> locs = editor.getSyntaxErrorsLoc().get(loc);
			if (locs != null) { locs.remove(nameLoc); }
			if (nameFeature && "name".equals(nameLoc)) {
				addToLoc = getText();
				final List<String> oldLoc = new ArrayList<>();
				oldLoc.addAll(loc);
				// System.out.println("oldLoc: " + oldLoc);
				loc.clear();
				// editor.buildLocation(frame.eobject, loc);
				editor.buildLocation(frame.eobject, loc);
				if (addToLoc != null && !addToLoc.isEmpty() && !loc.get(loc.size() - 1).equals(addToLoc)) {
					loc.add(addToLoc);
				}

				// System.out.println("newLoc: " + loc);
				for (final ValidateText vst : linkedVts) { if (vst != null) { vst.updateLoc(loc); } }
				editor.updateErrors(oldLoc, loc);
				editor.getIdsEObjects().clear();
				editor.initIdsEObjects();

			}
			if (allErrors) {
				error = editor.containErrors(loc, "", uselessName);
			} else {
				error = editor.containErrors(loc, nameLoc, uselessName);
			}

		} else {
			error = "Syntax errors detected ";
			if (editor.isWasOK()) { ModelGenerator.modelValidation(fp, diagram); }

			final List<String> wStr = new ArrayList<>();
			wStr.add("world");
			editor.getSyntaxErrorsLoc().remove(wStr);
			Map<String, String> locs = editor.getSyntaxErrorsLoc().get(loc);

			if (locs == null) { locs = GamaMapFactory.create(); }
			locs.put(nameLoc, "Syntax errors detected ");

			editor.getSyntaxErrorsLoc().put(loc, locs);
		}
		/*
		 * System.out.println("location:" + loc); System.out.println("name:" + nameLoc); System.out.println("isValid: "
		 * + isValid);
		 */if (error != null) {
			tip.setMessage(error);
			isValid = "".equals(error);
		}
		setBackground(isValid ? colValid : colNotValid);
		if (isValid) { tip.setVisible(false); }
		setFocus();
		editor.updateEObjectErrors();
		frame.updateError();
	}

	@Override
	protected void checkSubclass() {}

	/**
	 * Gets the name loc.
	 *
	 * @return the name loc
	 */
	public String getNameLoc() { return nameLoc; }

	/**
	 * Gets the loc.
	 *
	 * @return the loc
	 */
	public List<String> getLoc() { return loc; }

	/**
	 * Update loc.
	 *
	 * @param nwLoc
	 *            the nw loc
	 */
	public void updateLoc(final List<String> nwLoc) {
		loc.clear();
		loc.addAll(nwLoc);
	}

	/**
	 * Gets the linked vts.
	 *
	 * @return the linked vts
	 */
	public List<ValidateText> getLinkedVts() { return linkedVts; }

	/**
	 * Checks if is all errors.
	 *
	 * @return true, if is all errors
	 */
	public boolean isAllErrors() { return allErrors; }

	/**
	 * Sets the all errors.
	 *
	 * @param allErrors
	 *            the new all errors
	 */
	public void setAllErrors(final boolean allErrors) { this.allErrors = allErrors; }

	/**
	 * Checks if is save data.
	 *
	 * @return true, if is save data
	 */
	public boolean isSaveData() { return saveData; }

	/**
	 * Sets the save data.
	 *
	 * @param saveData
	 *            the new save data
	 */
	public void setSaveData(final boolean saveData) { this.saveData = saveData; }

	/**
	 * Checks if is string.
	 *
	 * @return true, if is string
	 */
	public boolean isString() { return isString; }

	/**
	 * Sets the string.
	 *
	 * @param isString
	 *            the new string
	 */
	public void setString(final boolean isString) { this.isString = isString; }

	/**
	 * Checks if is name feature.
	 *
	 * @return true, if is name feature
	 */
	public boolean isNameFeature() { return nameFeature; }

	/**
	 * Sets the name feature.
	 *
	 * @param nameFeature
	 *            the new name feature
	 */
	public void setNameFeature(final boolean nameFeature) { this.nameFeature = nameFeature; }

	/**
	 * Checks if is simple validation.
	 *
	 * @return true, if is simple validation
	 */
	public boolean isSimpleValidation() { return simpleValidation; }

	/**
	 * Sets the simple validation.
	 *
	 * @param simpleValidation
	 *            the new simple validation
	 */
	public void setSimpleValidation(final boolean simpleValidation) { this.simpleValidation = simpleValidation; }

}
