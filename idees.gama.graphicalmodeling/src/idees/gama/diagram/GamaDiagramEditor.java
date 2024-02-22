/*******************************************************************************************************
 *
 * GamaDiagramEditor.java, in idees.gama.graphicalmodeling, is part of the source code of the GAMA modeling and
 * simulation platform (v.1.9.3).
 *
 * (c) 2007-2024 UMI 209 UMMISCO IRD/SU & Partners (IRIT, MIAT, TLU, CTU)
 *
 * Visit https://github.com/gama-platform/gama for license information and contacts.
 *
 ********************************************************************************************************/
package idees.gama.diagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.ui.editor.DiagramBehavior;
import org.eclipse.graphiti.ui.editor.DiagramEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.xtext.resource.SynchronizedXtextResourceSet;
import org.eclipse.xtext.resource.XtextResourceSet;

import gama.EAction;
import gama.EAspect;
import gama.EDisplay;
import gama.EExperiment;
import gama.EFacet;
import gama.EGamaObject;
import gama.ELayer;
import gama.ELayerAspect;
import gama.EMonitor;
import gama.EParameter;
import gama.EReflex;
import gama.ESpecies;
import gama.EVariable;
import gama.core.kernel.model.IModel;
import gama.core.runtime.GAMA;
import gama.core.util.GamaMapFactory;
import gama.gaml.compilation.GamlCompilationError;
import gama.gaml.descriptions.IDescription;
import gama.gaml.descriptions.ModelDescription;
import gama.gaml.descriptions.ValidationContext;
import gama.ui.shared.resources.IGamaColors;
import gaml.compiler.gaml.Model;
import gaml.compiler.gaml.Statement;
import gaml.compiler.gaml.impl.ArgumentDefinitionImpl;
import gaml.compiler.gaml.impl.BlockImpl;
import gaml.compiler.gaml.impl.FacetImpl;
import gaml.compiler.gaml.impl.S_ActionImpl;
import gaml.compiler.gaml.impl.S_DefinitionImpl;
import gaml.compiler.gaml.impl.S_DisplayImpl;
import gaml.compiler.gaml.impl.S_ExperimentImpl;
import gaml.compiler.gaml.impl.S_ReflexImpl;
import gaml.compiler.gaml.impl.S_SpeciesImpl;
import gaml.compiler.gaml.impl.StatementImpl;
import gaml.compiler.gaml.impl.VariableRefImpl;
import gaml.compiler.gaml.impl.speciesOrGridDisplayStatementImpl;
import gaml.compiler.gaml.resource.GamlResource;
import gaml.compiler.gaml.resource.GamlResourceServices;
import gaml.compiler.gaml.validation.IGamlBuilderListener;
import idees.gama.features.modelgeneration.ModelGenerator;

/**
 * The Class GamaDiagramEditor.
 */
public class GamaDiagramEditor extends DiagramEditor implements IGamlBuilderListener {

	/** The Constant INITIAL_BUTTONS. */
	private static final int INITIAL_BUTTONS = 20;

	/** The Constant COLOR_TEXT. */
	public static final Color COLOR_TEXT = Display.getDefault().getSystemColor(SWT.COLOR_BLACK);

	/** The label font. */
	private static Font labelFont;

	/** The resource. */
	GamlResource resource;

	/** The abbreviations. */
	List<String> abbreviations = new ArrayList<>();

	/** The complete names of experiments. */
	List<String> completeNamesOfExperiments = new ArrayList<>();

	/** The inited. */
	boolean wasOK = true, inited = false;

	/** The indicator. */
	Composite toolbar, parent, indicator;

	/** The buttons. */
	Button[] buttons = new Button[INITIAL_BUTTONS];

	/** The status. */
	CLabel status;

	/** The menu. */
	Button menu;

	/** The diagram. */
	Diagram diagram;

	/** The errors. */
	List<GamlCompilationError> errors;

	/** The facets. */
	List<String> facets = Arrays.asList("torus:", "width:", "height:", "neighbours:", "refresh_every:", "background:",
			"among:", "->", "<-", "step:", "min:", "max:", "update:", "refresh:", "size:", "position:", "background:",
			"transparency:", "color:", "empty:", "rotate:", "schedules:", "at:", "depth:", "texture:");

	/** The to refresh. */
	boolean toRefresh = true;

	/** The ids E objects. */
	Map<List<String>, EObject> idsEObjects = GamaMapFactory.create();

	/** The errors loc. */
	Map<List<String>, Map<String, String>> errorsLoc = GamaMapFactory.create();

	/** The syntax errors loc. */
	Map<List<String>, Map<String, String>> syntaxErrorsLoc = GamaMapFactory.create();

	static {
		final FontData fd = Display.getDefault().getSystemFont().getFontData()[0];
		fd.setStyle(SWT.BOLD);
		labelFont = new Font(Display.getDefault(), fd);
	}

	/**
	 * Instantiates a new gama diagram editor.
	 */
	public GamaDiagramEditor() {}

	/**
	 * Validation ended.
	 *
	 * @param model
	 *            the model
	 * @param experiments
	 *            the experiments
	 * @param status
	 *            the status
	 */
	@Override
	public void validationEnded(final ModelDescription model, final Iterable<? extends IDescription> experiments,
			final ValidationContext status) {
		updateExperiments(experiments, status.hasErrors());
		toRefresh = true;
	}

	/*
	 * public void validationEnded(Set<String> experiments, boolean withErrors) {
	 *
	 * }
	 */

	/**
	 * Update experiments.
	 *
	 * @param <T>
	 *            the generic type
	 * @param experiments
	 *            the experiments
	 * @param withErrors
	 *            the with errors
	 */
	private <T extends IDescription> void updateExperiments(final Iterable<T> experiments, final boolean withErrors) {
		if (withErrors && !wasOK) return;
		final Set<String> oldNames = new LinkedHashSet<>(completeNamesOfExperiments);
		if (inited && wasOK && !withErrors && oldNames.equals(experiments)) return;
		final Collection<T> exps = new ArrayList<>();
		for (final T desc : experiments) { exps.add(desc); }
		inited = true;
		wasOK = !withErrors;
		completeNamesOfExperiments = exps.stream().map(IDescription::getName).collect(Collectors.toList());
		buildAbbreviations();
		updateToolbar(wasOK);
	}

	/**
	 * Builds the abbreviations.
	 */
	private void buildAbbreviations() {
		// Very simple method used here
		final int size = completeNamesOfExperiments.size();
		abbreviations.clear();
		if (size > 6) {
			// We remove "Experiment".
			for (final String s : completeNamesOfExperiments) { abbreviations.add(s.replaceFirst("Experiment ", "")); }
		} else if (size > 4) {
			// We replace "Experiment" by "Exp."
			for (final String s : completeNamesOfExperiments) {
				abbreviations.add(s.replaceFirst("Experiment", "Exp."));
			}
		} else {
			// We copy the names as it is
			abbreviations.addAll(completeNamesOfExperiments);
		}
	}

	/**
	 * Update toolbar.
	 *
	 * @param ok
	 *            the ok
	 */
	public void updateToolbar(final boolean ok) {

		Display.getDefault().asyncExec(() -> {
			if (toolbar == null || toolbar.isDisposed()) return;
			for (final Button b : buttons) { if (b.isVisible()) { hideButton(b); } }
			if (ok) {
				final int size = abbreviations.size();
				if (size == 0) {
					setStatus("Model is functional, but no experiments have been defined.", ok);
				} else {
					setStatus(size == 1 ? "Run :" : "Run :", ok);
				}
				int i = 0;
				for (final String e : abbreviations) { enableButton(i++, e); }
			} else {
				StringBuilder textError = new StringBuilder();
				for (GamlCompilationError err : errors)
					if (err != null) { textError.append(err.toString()).append("; "); }
				setStatus("Error(s) detected: " + textError.toString(), ok);
			}

			toolbar.layout(true);
		});

	}

	/**
	 * Enable button.
	 *
	 * @param index
	 *            the index
	 * @param text
	 *            the text
	 */
	private void enableButton(final int index, final String text) {
		if (text == null) return;
		((GridData) buttons[index].getLayoutData()).exclude = false;
		buttons[index].setVisible(true);
		buttons[index].setText(text);
		buttons[index].pack();
	}

	/**
	 * Hide button.
	 *
	 * @param b
	 *            the b
	 */
	private void hideButton(final Button b) {
		((GridData) b.getLayoutData()).exclude = true;
		b.setVisible(false);
	}

	/**
	 * Sets the status.
	 *
	 * @param text
	 *            the text
	 * @param ok
	 *            the ok
	 */
	private void setStatus(final String text, final boolean ok) {
		final Color c = ok ? abbreviations.size() == 0 ? IGamaColors.WARNING.inactive() : IGamaColors.OK.inactive()
				: IGamaColors.ERROR.inactive();
		indicator.setBackground(c);
		status.setText(text);
	}

	/**
	 * Creates the part control XP.
	 *
	 * @param parent
	 *            the parent
	 */
	public void createPartControlXP(final Composite parent) {
		this.parent = parent;

		GridLayout layout = new GridLayout(2, false);
		layout.horizontalSpacing = 0;
		layout.verticalSpacing = 0;
		layout.marginWidth = 0;
		layout.marginHeight = 0;
		parent.setLayout(layout);

		toolbar = new Composite(parent, SWT.NONE);

		GridData data = new GridData(SWT.FILL, SWT.FILL, true, false);
		data.heightHint = 26;
		data.horizontalIndent = 10;
		toolbar.setLayoutData(data);
		layout = new GridLayout(INITIAL_BUTTONS + 2, false);
		layout.horizontalSpacing = 2;
		layout.verticalSpacing = 0;
		layout.marginWidth = 0;
		layout.marginHeight = 0;
		toolbar.setLayout(layout);

		final Composite others = new Composite(parent, SWT.None);
		data = new GridData(SWT.RIGHT, SWT.FILL, false, false);
		data.heightHint = 26;
		others.setLayoutData(data);
		layout = new GridLayout(2, false);
		others.setLayout(layout);

		indicator = new Composite(parent, SWT.None);
		data = new GridData(SWT.FILL, SWT.FILL, true, false);
		data.horizontalSpan = 2;
		data.heightHint = 8;
		indicator.setLayoutData(data);
		final FillLayout layout2 = new FillLayout();
		layout2.marginWidth = 12;
		layout2.marginHeight = 0;
		indicator.setLayout(layout2);

		status = new CLabel(toolbar, SWT.NONE);
		status.setFont(labelFont);
		data = new GridData(SWT.FILL, SWT.CENTER, false, false);
		data.minimumHeight = SWT.DEFAULT;
		status.setLayoutData(data);
		status.setForeground(COLOR_TEXT);

		for (int i = 0; i < INITIAL_BUTTONS; i++) {
			buttons[i] = new Button(toolbar, SWT.PUSH);
			data = new GridData(SWT.LEFT, SWT.CENTER, false, false);
			buttons[i].setLayoutData(data);
			buttons[i].setText("Experiment " + i);
			buttons[i].addSelectionListener(listener);
			hideButton(buttons[i]);
		}

		// Asking the editor to fill the rest
		final Composite parent2 = new Composite(parent, SWT.NONE);
		data = new GridData(SWT.FILL, SWT.FILL, true, true);
		data.horizontalSpan = 2;
		parent2.setLayoutData(data);
		parent2.setLayout(new FillLayout());

		super.createPartControl(parent2);

	}

	/** The listener. */
	private final SelectionListener listener = new SelectionAdapter() {

		@Override
		public void widgetSelected(final SelectionEvent evt) {
			diagram = getDiagram();
			final String xp = ((Button) evt.getSource()).getText();
			if (diagram != null && !diagram.getChildren().isEmpty()) {
				final IModel model =
						ModelGenerator.modelGeneration(getDiagramTypeProvider().getFeatureProvider(), diagram);
				if (model != null) { GAMA.runGuiExperiment(xp, model); }
			}

		}
	};

	@Override
	public void doSave(final IProgressMonitor monitor) {
		super.doSave(monitor);
	}

	/**
	 * Inits the gaml resource.
	 */
	public void initGamlResource() {
		final XtextResourceSet rs = new SynchronizedXtextResourceSet();
		rs.setClasspathURIContext(ModelGenerator.class);
		final URI uri = URI.createPlatformResourceURI("toto/" + getTitle() + ".gaml", true);
		resource = (GamlResource) rs.createResource(uri);
	}

	/**
	 * Gets the diagram.
	 *
	 * @return the diagram
	 */
	public Diagram getDiagram() {
		Diagram diag = diagram;
		if (diagram == null) {
			diag = this.getDiagramTypeProvider().getDiagram();
			diagram = diag;

		}
		return diag;
	}

	@Override
	public void initializeGraphicalViewer() {
		super.initializeGraphicalViewer();

		initGamlResource();
		if (getDiagram() != null) {
			ModelGenerator.modelValidation(getDiagramTypeProvider().getFeatureProvider(), getDiagram());
			doSave(null);
		}
	}

	@Override
	public void createPartControl(final Composite parent) {

		createPartControlXP(parent);
	}

	/**
	 * Gets the resource.
	 *
	 * @return the resource
	 */
	public GamlResource getResource() { return resource; }

	/**
	 * Sets the resource.
	 *
	 * @param resource
	 *            the new resource
	 */
	public void setResource(final GamlResource resource) {
		this.resource = resource;
		if (resource != null) { GamlResourceServices.addResourceListener(resource.getURI(), GamaDiagramEditor.this); }

	}

	/**
	 * Gets the errors.
	 *
	 * @return the errors
	 */
	public List<GamlCompilationError> getErrors() { return errors; }

	/**
	 * Sets the errors.
	 *
	 * @param errors
	 *            the new errors
	 */
	public void setErrors(final List<GamlCompilationError> errors/*
																	 * , ValidateStyledText vst
																	 */) {
		this.errors = errors;

		for (final GamlCompilationError error : errors) {
			final EObject toto = error.getStatement();
			// System.out.println("syntaxErrorsLoc : " + syntaxErrorsLoc);*/
			final List<String> ids = new ArrayList<>();
			final String fist_obj = buildLocation(toto, ids);
			// System.out.println("location of error: " + ids);
			while (!ids.isEmpty()) {
				// System.out.println("idsEObjects.getKeys(): " +
				// idsEObjects.getKeys());
				if (idsEObjects.containsKey(ids)) { break; }
				ids.remove(ids.size() - 1);
			}
			Map<String, String> locs = errorsLoc.get(ids);

			if (locs == null) { locs = GamaMapFactory.create(); }
			// System.out.println("error.getCode() : " + error.getCode());
			final String key = "gaml.duplicate.definition.issue".equals(error.getCode())
					|| "gaml.duplicate.name.issue".equals(error.getCode()) ? "name" : fist_obj;
			locs.put(key, (locs.containsKey(key) ? locs.get(key) : "") + "\n" + error.toString());
			if ("Syntax errors detected ".equals(error.toString())) {
				if (syntaxErrorsLoc.isEmpty()) { syntaxErrorsLoc.put(ids, locs); }
			} else {
				errorsLoc.put(ids, locs);
			}

		}
		toRefresh = false;
		updateEObjectErrors();
	}

	/**
	 * Builds the location.
	 *
	 * @param toto
	 *            the toto
	 * @param ids
	 *            the ids
	 * @return the string
	 */
	public String buildLocation(EObject toto, final List<String> ids) {
		String fist_obj = null;
		do {
			// System.out.println("toto: " + toto);
			if (toto instanceof final S_ReflexImpl vv) {
				if (vv.getName() != null) { ids.add(0, vv.getName()); }
				if (fist_obj == null) {
					if (vv.getName() != null) {
						fist_obj = vv.getName();
					} else if (vv.getKey() != null) { fist_obj = vv.getKey(); }
				}
			} else if (toto instanceof final S_SpeciesImpl vv) {
				ids.add(0, vv.getName());
				if (fist_obj == null) { fist_obj = vv.getName(); }

			} else if (toto instanceof final FacetImpl vv) {
				// System.out.println("vv :" + vv.getKey() + ";");
				if (fist_obj == null && facets.contains(vv.getKey())) {
					fist_obj = vv.getKey();
					// System.out.println("fist_obj facet : " + fist_obj);
				}
			} else if (toto instanceof final S_ActionImpl vv) {
				ids.add(0, vv.getName());
				if (fist_obj == null) { fist_obj = vv.getName(); }
			} else if (toto instanceof final speciesOrGridDisplayStatementImpl vv) {
				ids.add(0, vv.getKey());
				// System.out.println("vv:"+ vv.getKey());

				// System.out.println("vv.getFacets:"+ vv.getFacets());
			} else if (toto instanceof final S_DisplayImpl vv) {
				ids.add(0, vv.getName());
				if (fist_obj == null) { fist_obj = vv.getName(); }
			} else if (toto instanceof final BlockImpl vv) {
				/*
				 * System.out.println("block:" + vv ); System.out.println( "block getFunction:" + vv.getFunction() );
				 * System.out.println("block getStatements:" + vv.getStatements() );
				 */
				if (vv.getStatements() != null) {
					for (final Statement st : vv.getStatements()) {
						if (st != null && st.getKey() != null && "parameter".equals(st.getKey())) {
							// ids.add(0, st.getExpr().getOp());
							// System.out.println("st.getExpr " + st.getExpr());
							// System.out.println("st.getFacets " +
							// st.getFacets());

							// System.out.println("st.getBlock " +
							// st.getBlock());
						}
					}
				}

			} else if (toto instanceof final S_DefinitionImpl vv) {
				ids.add(0, vv.getName());
			} else if (toto instanceof final ArgumentDefinitionImpl vv) {
				ids.add(0, vv.getName());
			} else if (toto instanceof final S_ExperimentImpl vv) {
				ids.add(0, vv.getName());
				if (fist_obj == null) { fist_obj = vv.getName(); }
			} else if (toto instanceof final StatementImpl vv) {
				if ("text".equals(vv.getKey()) || "image".equals(vv.getKey()) || "chart".equals(vv.getKey())
						|| "draw".equals(vv.getKey())) {
					ids.add(0, vv.getKey());
				}
			} else if (toto instanceof VariableRefImpl) {
				// VariableRefImpl vv = (VariableRefImpl) toto;
				// System.out.println("var:" + vv );
				// System.out.println("var getRef:" + vv.getRef() );

				/*
				 * } else if (toto instanceof S_DefinitionImpl) { S_DefinitionImpl vv = (S_DefinitionImpl) toto;
				 * ids.add(0,vv.getName()); if (fist_obj == null) { fist_obj = vv.getName(); }
				 */
			} else if (toto instanceof final EGamaObject vv) {
				if (toto instanceof ELayer) {
					ids.add(0, ((ELayer) vv).getType() == null ? "species" : ((ELayer) vv).getType());
				} else if (toto instanceof ELayerAspect) {
					ids.add(0, "draw");
				} else {
					ids.add(0, vv.getName());
				}
				if (fist_obj == null) { fist_obj = vv.getName(); }
			}

			if (toto instanceof EAction) {
				toto = ((EAction) toto).getActionLinks().get(0).getSpecies();
			} else if (toto instanceof EReflex) {
				toto = ((EReflex) toto).getReflexLinks().get(0).getSpecies();
			} else if (toto instanceof ELayer) {
				toto = ((ELayer) toto).getDisplay();
			} else if (toto instanceof ELayerAspect) {
				toto = ((ELayerAspect) toto).getAspect();
			} else if (toto instanceof EAspect) {
				toto = ((EAspect) toto).getAspectLinks().get(0).getSpecies();
			} else if (toto instanceof EExperiment) {
				toto = ((EExperiment) toto).getExperimentLink().getSpecies();
			} else if (toto instanceof EDisplay) {
				toto = ((EDisplay) toto).getDisplayLink().getExperiment();
			} else if (toto instanceof ESpecies) {
				if (!"world".equals(((ESpecies) toto).getName())) {
					toto = ((ESpecies) toto).getMacroSpeciesLinks().get(0).getMacro();
				} else {
					toto = null;
				}
			} else {
				toto = toto != null ? toto.eContainer() : toto;
			}

		} while (toto != null && !(toto instanceof Model));
		if (!ids.contains("world")) { ids.add(0, "world"); }
		// System.out.println("ids: " + ids);
		return fist_obj;
	}

	/**
	 * Contain errors.
	 *
	 * @param location
	 *            the location
	 * @param name
	 *            the name
	 * @param uselessName
	 *            the useless name
	 * @return the string
	 */
	public String containErrors(final List<String> location, final String name, final List<String> uselessName) {
		// System.out.println("syntaxErrorsLoc: " + syntaxErrorsLoc);
		final boolean noName = "".equals(name);
		// System.out.println("location: " + location + " name: " + name);

		// System.out.println("errorsLoc: " + errorsLoc);
		if (errorsLoc == null || errorsLoc.isEmpty() || !errorsLoc.containsKey(location)) return "";

		if (noName) {
			final Map<String, String> er = errorsLoc.get(location);
			if (uselessName != null) { for (final String val : uselessName) { er.remove(val); } }
			// System.out.println("er 2: " + er);
			if (!er.isEmpty()) {
				final List<String> l = new ArrayList<>(er.values());
				return l.get(0);
			}
		} else if (errorsLoc.get(location).containsKey(name)) // System.out.println("errorsLoc.get(location).get(name):
																// " +
			// errorsLoc.get(location).get(name));
			return errorsLoc.get(location).get(name);

		return "";
	}

	/**
	 * Compute ids.
	 *
	 * @param obj
	 *            the obj
	 * @return the list
	 */
	public List<String> computeIds(final EObject obj) {
		EObject toto = obj;
		final List<String> ids = new ArrayList<>();
		do {
			if (toto != null) {
				if (toto instanceof EGamaObject) {
					if (toto instanceof ELayer) { ids.add(0, ((ELayer) toto).getType()); }
					if (toto instanceof ELayerAspect) {
						ids.add(0, "draw");
					} else {
						ids.add(0, ((EGamaObject) toto).getName());
					}
				}

				else if (toto instanceof EVariable) {
					ids.add(0, ((EVariable) toto).getName());
				} else if (toto instanceof EFacet) { ids.add(0, ((EFacet) toto).getName()); }
				if (toto instanceof EAction) {
					toto = ((EAction) toto).getActionLinks().get(0).getSpecies();
				} else if (toto instanceof EReflex) {
					toto = ((EReflex) toto).getReflexLinks().get(0).getSpecies();
				} else if (toto instanceof EAspect) {
					toto = ((EAspect) toto).getAspectLinks().get(0).getSpecies();
				} else if (toto instanceof EExperiment) {
					toto = ((EExperiment) toto).getExperimentLink().getSpecies();
				} else if (toto instanceof EDisplay) {
					toto = ((EDisplay) toto).getDisplayLink().getExperiment();
				} else if (toto instanceof ELayer) {
					toto = ((ELayer) toto).getDisplay();
				} else if (toto instanceof ELayerAspect) {
					toto = ((ELayerAspect) toto).getAspect();
				} else if (toto instanceof ESpecies) {
					if (!"world".equals(((ESpecies) toto).getName())) {
						toto = ((ESpecies) toto).getMacroSpeciesLinks().get(0).getMacro();
					} else {
						toto = null;
					}
				} else {
					toto = toto.eContainer();
				}
			}
		} while (toto != null && !(toto instanceof Model));
		if (!ids.contains("world")) { ids.add(0, "world"); }
		return ids;
	}

	/**
	 * Adds the E oject.
	 *
	 * @param obj
	 *            the obj
	 */
	public void addEOject(final EObject obj) {
		final List<String> ids = computeIds(obj);
		if (obj instanceof EVariable) {
			idsEObjects.put(ids, ((EVariable) obj).eContainer());
		} else if (obj instanceof EParameter) {
			idsEObjects.put(ids, ((EParameter) obj).eContainer());
		} else if (obj instanceof EFacet) {
			idsEObjects.put(ids, ((EFacet) obj).eContainer());
		} else if (obj instanceof EMonitor) {
			idsEObjects.put(ids, ((EMonitor) obj).eContainer());
		} else {
			idsEObjects.put(ids, obj);
		}

		// System.out.println("add object: " + obj + " ids: " + ids + "
		// idsEObjects: " + idsEObjects.keySet());
	}

	/**
	 * Adds the E oject.
	 *
	 * @param obj
	 *            the obj
	 * @param name
	 *            the name
	 */
	public void addEOject(final EObject obj, final String name) {
		final List<String> ids = computeIds(obj);
		ids.add(name);
		idsEObjects.put(ids, obj);
	}

	/**
	 * Removes the E oject.
	 *
	 * @param obj
	 *            the obj
	 */
	public void removeEOject(final EObject obj) {
		final List<String> ids = computeIds(obj);
		idsEObjects.remove(ids);
	}

	/**
	 * Update E object errors.
	 */
	public void updateEObjectErrors() {
		final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(getDiagram());
		if (domain != null) {
			domain.getCommandStack().execute(new RecordingCommand(domain) {

				@Override
				public void doExecute() {

					initIdsEObjects();
					final List<List<String>> vals = new ArrayList<>(idsEObjects.keySet());
					final Map<List<String>, EObject> valM = GamaMapFactory.create();
					for (final EObject bo : valM.values()) {
						if (bo instanceof EGamaObject) {
							((EGamaObject) bo).setHasError(false);
						} else if (bo instanceof EVariable) { ((EVariable) bo).setHasError(false); }
					}
					for (final List<String> ids : vals) {
						final EObject obj = valM.get(ids);
						// System.out.println("ids: " + ids + " obj: " + obj);
						if (obj == null) { continue; }
						final boolean val = syntaxErrorsLoc.containsKey(ids) || errorsLoc.containsKey(ids);
						// System.out.println("val = " +val);
						if (val && obj instanceof EGamaObject) {
							((EGamaObject) obj).setHasError(val);
							// System.out.println(((EGamaObject)
							// obj).getHasError());
						}
					}
				}
			});
		}
	}

	/**
	 * Gets the errors loc.
	 *
	 * @return the errors loc
	 */
	public Map<List<String>, Map<String, String>> getErrorsLoc() { return errorsLoc; }

	/**
	 * Gets the syntax errors loc.
	 *
	 * @return the syntax errors loc
	 */
	public Map<List<String>, Map<String, String>> getSyntaxErrorsLoc() { return syntaxErrorsLoc; }

	/**
	 * Gets the ids E objects.
	 *
	 * @return the ids E objects
	 */
	public Map<List<String>, EObject> getIdsEObjects() { return idsEObjects; }

	/**
	 * Inits the ids E objects.
	 */
	public void initIdsEObjects() {
		// System.out.println("initIdsEObjects");
		if (diagram != null && !diagram.getChildren().isEmpty() && idsEObjects.isEmpty()) {
			for (final Shape obj : getDiagram().getChildren()) {
				final Object bo =
						getDiagramTypeProvider().getFeatureProvider().getBusinessObjectForPictogramElement(obj);
				// System.out.println("obj : " + bo);
				if (bo instanceof EObject) {
					addEOject((EObject) bo);

				}
				if (bo instanceof ESpecies) {
					boolean shape = false;
					boolean location = false;
					for (final EVariable v : ((ESpecies) bo).getVariables()) {
						addEOject(v);
						if (location || "location".equals(v.getName())) { location = true; }
						if (shape || "shape".equals(v.getName())) { shape = true; }
					}
					if (!shape) { addEOject((EObject) bo, "shape"); }
					if (!location) { addEOject((EObject) bo, "location"); }
				} else if (bo instanceof EAspect) {
					addEOject((EObject) bo, "draw");
				} else if (bo instanceof EDisplay) {
					for (final ELayer lay : ((EDisplay) bo).getLayers()) { addEOject((EObject) bo, lay.getType()); }
				} else if (bo instanceof EExperiment) {
					for (final EParameter v : ((EExperiment) bo).getParameters()) { addEOject(v); }
					for (final EMonitor v : ((EExperiment) bo).getMonitors()) { addEOject(v); }
				}
			}
		}
	}

	/**
	 * Update errors.
	 *
	 * @param oldId
	 *            the old id
	 * @param newId
	 *            the new id
	 */
	public void updateErrors(final List<String> oldId, final List<String> newId) {
		final Map<String, String> eMap = errorsLoc.remove(oldId);
		if (eMap != null) { errorsLoc.put(newId, eMap); }

		final Map<String, String> eMap2 = syntaxErrorsLoc.remove(oldId);
		if (eMap2 != null) { syntaxErrorsLoc.put(newId, eMap2); }

		final EObject obj = idsEObjects.remove(oldId);
		if (obj != null) { idsEObjects.put(newId, obj); }
	}

	/**
	 * Checks if is was OK.
	 *
	 * @return true, if is was OK
	 */
	public boolean isWasOK() { return wasOK; }

	@Override
	protected DiagramBehavior createDiagramBehavior() {
		return new GamaDiagramBehavior(this);
	}

}
