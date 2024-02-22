/*******************************************************************************************************
 *
 * UtilEditFrame.java, in idees.gama.graphicalmodeling, is part of the source code of the GAMA modeling and simulation
 * platform (v.1.9.3).
 *
 * (c) 2007-2024 UMI 209 UMMISCO IRD/SU & Partners (IRIT, MIAT, TLU, CTU)
 *
 * Visit https://github.com/gama-platform/gama for license information and contacts.
 *
 ********************************************************************************************************/
package idees.gama.ui.editFrame;

import java.util.List;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

import gama.EGamaObject;
import gama.EWorldAgent;
import gama.gaml.compilation.GamlCompilationError;
import idees.gama.features.edit.EditFeature;
import idees.gama.features.modelgeneration.ModelGenerator;

/**
 * The Class UtilEditFrame.
 */
public class UtilEditFrame {

	/**
	 * Builds the canvas validation.
	 *
	 * @param container
	 *            the container
	 * @param canvasValidation
	 *            the canvas validation
	 * @param validationResult
	 *            the validation result
	 * @param fp
	 *            the fp
	 * @param diagram
	 *            the diagram
	 * @param eobject
	 *            the eobject
	 */
	public static void buildCanvasValidation(final Composite container, final Canvas canvasValidation,
			final StyledText validationResult, final IFeatureProvider fp, final Diagram diagram,
			final EGamaObject eobject) {
		// ****** CANVAS VALIDATION *********
		canvasValidation.setBounds(10, 580, 720, 95);

		validationResult.setBounds(5, 30, 700, 55);
		validationResult.setEditable(false);

		Button btnValidate = new Button(canvasValidation, SWT.NONE);
		btnValidate.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(final SelectionEvent e) {
				List<GamlCompilationError> errors = ModelGenerator.modelValidation(fp, diagram);
				StringBuilder eC = new StringBuilder();
				for (GamlCompilationError val : errors) { eC.append(val.toString()).append("\n"); }
				validationResult.setText(eC.toString());
			}
		});
		btnValidate.setBounds(75, 5, 80, 20);
		btnValidate.setText("Validate");
		CLabel lblCompilation = new CLabel(canvasValidation, SWT.NONE);
		lblCompilation.setText("Validation");
		lblCompilation.setBounds(5, 5, 70, 20);
	}

	/**
	 * Builds the canvas name.
	 *
	 * @param container
	 *            the container
	 * @param canvasName
	 *            the canvas name
	 * @param textName
	 *            the text name
	 * @param eobject
	 *            the eobject
	 * @param ef
	 *            the ef
	 */
	public static void buildCanvasName(final Composite container, final Canvas canvasName, final ValidateText textName,
			final EGamaObject eobject, final EditFeature ef) {
		// ****** CANVAS NAME *********
		canvasName.setBounds(10, 10, 720, 30);

		// textName = new Text(canvasName, SWT.BORDER);
		textName.setBounds(70, 5, 300, 20);
		textName.setText(eobject.getName());
		if (eobject instanceof EWorldAgent) { textName.setEditable(false); }

		CLabel lblName = new CLabel(canvasName, SWT.NONE);
		lblName.setBounds(10, 5, 60, 20);
		lblName.setText("Name");
	}

	/**
	 * Canvas validation.
	 *
	 * @param container
	 *            the container
	 */
	protected void canvasValidation(final Composite container) {
		Group group = new Group(container, SWT.BORDER);
		group.setLayout(new FillLayout(SWT.HORIZONTAL));
		group.setText("GAML code compilation result");

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

	}
}
