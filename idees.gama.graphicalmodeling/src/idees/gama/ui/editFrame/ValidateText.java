package idees.gama.ui.editFrame;

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

import idees.gama.diagram.GamaDiagramEditor;
import idees.gama.features.modelgeneration.ModelGenerator;
import msi.gama.util.TOrderedHashMap;

public class ValidateText extends StyledText {

	Color colValid;
	Color colNotValid;
	boolean isValid;
	String error;
	final Diagram diagram;
	final IFeatureProvider fp;
	final EditFrame frame;
	final String nameLoc;
	final List<String> loc;
	final GamaDiagramEditor editor;
	final ToolTip tip;
	List<String> uselessName;

	final static int TOOLTIP_HIDE_DELAY = 200; // 0.2s
	final static int TOOLTIP_SHOW_DELAY = 500; // 0.5s
	final List<ValidateText> linkedVts = new ArrayList<ValidateText>();
	boolean allErrors;

	boolean isString = false;

	boolean saveData = false;

	boolean nameFeature = true;
	
	boolean simpleValidation = false;
	String addToLoc;

	@SuppressWarnings("unused")
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
		loc = new ArrayList<String>();
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

		isValid = error.equals("");
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

	public void updateColor() {
		if (nameLoc.equals("name")) {
			isValid = !getText().isEmpty() && !getText().contains(" ") && !getText().contains(";")
					&& !getText().contains("{") && !getText().contains("}") && !getText().contains("\t");
		} else {
			isValid = !ModelGenerator.hasSyntaxError(fp, getText(), true, isString);
		}
		if (isValid) {
			final Map<String, String> locs = editor.getSyntaxErrorsLoc().get(loc);
			if (locs != null) {
				locs.remove(nameLoc);
			}
			if (nameFeature && nameLoc.equals("name")) {
				addToLoc = getText();
				final List<String> oldLoc = new ArrayList<String>();
				oldLoc.addAll(loc);
				loc.clear();
				editor.buildLocation(frame.eobject, loc);
				if (addToLoc != null && !addToLoc.isEmpty() && !loc.get(loc.size() - 1).equals(addToLoc)) {
					loc.add(addToLoc);
				}

				for (final ValidateText vst : linkedVts) {
					if (vst != null) {
						vst.updateLoc(loc);
					}
				}
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
			final List<String> wStr = new ArrayList<String>();
			wStr.add("world");
			editor.getSyntaxErrorsLoc().remove(wStr);
			Map<String, String> locs = editor.getSyntaxErrorsLoc().get(loc);

			if (locs == null) {
				locs = new TOrderedHashMap<String, String>();
			}
			locs.put(nameLoc, "Syntax errors detected ");
			// .out.println("loc: " + loc);
			editor.getSyntaxErrorsLoc().put(loc, locs);
		}
		if (error != null) {
			tip.setMessage(error);
			isValid = error.equals("");
		}
		setBackground(isValid ? colValid : colNotValid);
		if (isValid) {
			tip.setVisible(false);
		}
		editor.updateEObjectErrors();
	}

	public void applyModification() {
		// System.out.println("Loc: " + loc + "nameLoc: " + nameLoc + "
		// saveData:" + saveData);

		if (saveData) {
			frame.save(nameLoc);
		}
		// System.out.println("isString");
		frame.getShell().forceFocus();
		if (nameLoc.equals("name")) {
			if (simpleValidation) 
				isValid = !getText().isEmpty() ;
			else 
				isValid = !getText().isEmpty() && !getText().contains(" ") && !getText().contains(";")
					&& !getText().contains("{") && !getText().contains("}") && !getText().contains("\t");
		} else {
			isValid = !ModelGenerator.hasSyntaxError(fp, getText(), true, isString);
		}
		if (isValid) {
			ModelGenerator.modelValidation(fp, diagram);
			final Map<String, String> locs = editor.getSyntaxErrorsLoc().get(loc);
			if (locs != null) {
				locs.remove(nameLoc);
			}
			if (nameFeature && nameLoc.equals("name")) {
				addToLoc = getText();
				final List<String> oldLoc = new ArrayList<String>();
				oldLoc.addAll(loc);
				// System.out.println("oldLoc: " + oldLoc);
				loc.clear();
				// editor.buildLocation(frame.eobject, loc);
				editor.buildLocation(frame.eobject, loc);
				if (addToLoc != null && !addToLoc.isEmpty() && !loc.get(loc.size() - 1).equals(addToLoc)) {
					loc.add(addToLoc);
				}

				// System.out.println("newLoc: " + loc);
				for (final ValidateText vst : linkedVts) {
					if (vst != null) {
						vst.updateLoc(loc);
					}
				}
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
			if (editor.isWasOK()) {
				ModelGenerator.modelValidation(fp, diagram);
			}

			final List<String> wStr = new ArrayList<String>();
			wStr.add("world");
			editor.getSyntaxErrorsLoc().remove(wStr);
			Map<String, String> locs = editor.getSyntaxErrorsLoc().get(loc);

			if (locs == null) {
				locs = new TOrderedHashMap<String, String>();
			}
			locs.put(nameLoc, "Syntax errors detected ");

			editor.getSyntaxErrorsLoc().put(loc, locs);
		}
		/*
		 * System.out.println("location:" + loc); System.out.println("name:" +
		 * nameLoc); System.out.println("isValid: " + isValid);
		 */if (error != null) {
			tip.setMessage(error);
			isValid = error.equals("");
		}
		setBackground(isValid ? colValid : colNotValid);
		if (isValid) {
			tip.setVisible(false);
		}
		setFocus();
		editor.updateEObjectErrors();
		frame.updateError();
	}

	@Override
	protected void checkSubclass() {
		return;
	}

	public String getNameLoc() {
		return nameLoc;
	}

	public List<String> getLoc() {
		return loc;
	}

	public void updateLoc(final List<String> nwLoc) {
		loc.clear();
		loc.addAll(nwLoc);
	}

	public List<ValidateText> getLinkedVts() {
		return linkedVts;
	}

	public boolean isAllErrors() {
		return allErrors;
	}

	public void setAllErrors(final boolean allErrors) {
		this.allErrors = allErrors;
	}

	public boolean isSaveData() {
		return saveData;
	}

	public void setSaveData(final boolean saveData) {
		this.saveData = saveData;
	}

	public boolean isString() {
		return isString;
	}

	public void setString(final boolean isString) {
		this.isString = isString;
	}

	public boolean isNameFeature() {
		return nameFeature;
	}

	public void setNameFeature(final boolean nameFeature) {
		this.nameFeature = nameFeature;
	}

	public boolean isSimpleValidation() {
		return simpleValidation;
	}

	public void setSimpleValidation(boolean simpleValidation) {
		this.simpleValidation = simpleValidation;
	}
	
	

}
