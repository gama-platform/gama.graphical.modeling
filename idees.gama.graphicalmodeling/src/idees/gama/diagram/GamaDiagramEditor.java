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
import idees.gama.features.modelgeneration.ModelGenerator;
import msi.gama.kernel.model.IModel;
import msi.gama.lang.gaml.gaml.Model;
import msi.gama.lang.gaml.gaml.Statement;
import msi.gama.lang.gaml.gaml.impl.ArgumentDefinitionImpl;
import msi.gama.lang.gaml.gaml.impl.BlockImpl;
import msi.gama.lang.gaml.gaml.impl.FacetImpl;
import msi.gama.lang.gaml.gaml.impl.S_ActionImpl;
import msi.gama.lang.gaml.gaml.impl.S_DefinitionImpl;
import msi.gama.lang.gaml.gaml.impl.S_DisplayImpl;
import msi.gama.lang.gaml.gaml.impl.S_ExperimentImpl;
import msi.gama.lang.gaml.gaml.impl.S_ReflexImpl;
import msi.gama.lang.gaml.gaml.impl.S_SpeciesImpl;
import msi.gama.lang.gaml.gaml.impl.StatementImpl;
import msi.gama.lang.gaml.gaml.impl.VariableRefImpl;
import msi.gama.lang.gaml.gaml.impl.speciesOrGridDisplayStatementImpl;
import msi.gama.lang.gaml.resource.GamlResource;
import msi.gama.lang.gaml.resource.GamlResourceServices;
import msi.gama.lang.gaml.validation.IGamlBuilderListener;
import msi.gama.runtime.GAMA;
import msi.gama.util.GamaMapFactory;
import msi.gaml.compilation.GamlCompilationError;
import msi.gaml.descriptions.IDescription;
import msi.gaml.descriptions.ModelDescription;
import msi.gaml.descriptions.ValidationContext;
import ummisco.gama.ui.resources.IGamaColors;

public class GamaDiagramEditor extends DiagramEditor implements IGamlBuilderListener {

	private static final int INITIAL_BUTTONS = 20;
	public static final Color COLOR_TEXT = Display.getDefault().getSystemColor(SWT.COLOR_BLACK);
	private static Font labelFont;

	GamlResource resource;
	List<String> abbreviations = new ArrayList<String>();
	List<String> completeNamesOfExperiments = new ArrayList<String>();
	boolean wasOK = true, inited = false;
	Composite toolbar, parent, indicator;
	Button[] buttons = new Button[INITIAL_BUTTONS];
	CLabel status;
	Button menu;
	Diagram diagram;
	List<GamlCompilationError> errors;

	List<String> facets = Arrays.asList("torus:", "width:", "height:", "neighbours:", "refresh_every:", "background:",
			"among:", "->", "<-", "step:", "min:", "max:", "update:", "refresh:", "size:", "position:", "background:",
			"transparency:", "color:", "empty:", "rotate:", "schedules:", "at:", "depth:", "texture:");

	boolean toRefresh = true;
	Map<List<String>, EObject> idsEObjects = GamaMapFactory.create();

	Map<List<String>, Map<String, String>> errorsLoc = GamaMapFactory.create();
	Map<List<String>, Map<String, String>> syntaxErrorsLoc = GamaMapFactory.create();

	static {
		final FontData fd = Display.getDefault().getSystemFont().getFontData()[0];
		fd.setStyle(SWT.BOLD);
		labelFont = new Font(Display.getDefault(), fd);
	}

	public GamaDiagramEditor() {
		super();
	}

	@Override
	public void validationEnded(ModelDescription model, final Iterable<? extends IDescription> experiments,
			final ValidationContext status) {
		updateExperiments(experiments, status.hasErrors());
		toRefresh = true;
	}

	/*
	 * public void validationEnded(Set<String> experiments, boolean withErrors) {
	 * 
	 * }
	 */

	private <T extends IDescription> void updateExperiments(final Iterable<T> experiments, final boolean withErrors) {
		if (withErrors == true && wasOK == false) { return; }
		final Set<String> oldNames = new LinkedHashSet<String>(completeNamesOfExperiments);
		if (inited && wasOK && !withErrors && oldNames.equals(experiments)) { return; }
		final Collection<T> exps = new ArrayList<>();
		for (final T desc : experiments)
			exps.add(desc);
		inited = true;
		wasOK = !withErrors;
		completeNamesOfExperiments = exps.stream().map(each -> each.getName()).collect(Collectors.toList());
		buildAbbreviations();
		updateToolbar(wasOK);
	}

	private void buildAbbreviations() {
		// Very simple method used here
		final int size = completeNamesOfExperiments.size();
		abbreviations.clear();
		if (size > 6) {
			// We remove "Experiment".
			for (final String s : completeNamesOfExperiments) {
				abbreviations.add(s.replaceFirst("Experiment ", ""));
			}
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

	public void updateToolbar(final boolean ok) {

		Display.getDefault().asyncExec(() -> {
			if (toolbar == null || toolbar.isDisposed()) { return; }
			for (final Button b : buttons) {
				if (b.isVisible()) {
					hideButton(b);
				}
			}
			if (ok) {
				final int size = abbreviations.size();
				if (size == 0) {
					setStatus("Model is functional, but no experiments have been defined.", ok);
				} else {
					setStatus(size == 1 ? "Run :" : "Run :", ok);
				}
				int i = 0;
				for (final String e : abbreviations) {
					enableButton(i++, e);
				}
			} else {
				String textError = "";
				for (GamlCompilationError err :errors)
					if (err != null) textError += err.toString() + "; ";
				setStatus("Error(s) detected: " + textError, ok);
			}

			toolbar.layout(true);
		});

	}

	private void enableButton(final int index, final String text) {
		if (text == null) { return; }
		((GridData) buttons[index].getLayoutData()).exclude = false;
		buttons[index].setVisible(true);
		buttons[index].setText(text);
		buttons[index].pack();
	}

	private void hideButton(final Button b) {
		((GridData) b.getLayoutData()).exclude = true;
		b.setVisible(false);
	}

	private void setStatus(final String text, final boolean ok) {
		final Color c = ok ? abbreviations.size() == 0 ? IGamaColors.WARNING.inactive() : IGamaColors.OK.inactive()
				: IGamaColors.ERROR.inactive();
		indicator.setBackground(c);
		status.setText(text);
	}

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

	private final SelectionListener listener = new SelectionAdapter() {

		@Override
		public void widgetSelected(final SelectionEvent evt) {
			diagram = getDiagram();
			final String xp = ((Button) evt.getSource()).getText();
			if (diagram != null && !diagram.getChildren().isEmpty()) {
				final IModel model =
						ModelGenerator.modelGeneration(getDiagramTypeProvider().getFeatureProvider(), diagram);
				if (model != null) {
					GAMA.runGuiExperiment(xp, model);
				}
			}

		}
	};

	@Override
	public void doSave(final IProgressMonitor monitor) {
		super.doSave(monitor);
	}

	public void initGamlResource() {
		final XtextResourceSet rs = new SynchronizedXtextResourceSet();
		rs.setClasspathURIContext(ModelGenerator.class);
		final URI uri = URI.createPlatformResourceURI("toto/" + getTitle() + ".gaml", true);
		resource = (GamlResource) rs.createResource(uri);
	}

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

	public GamlResource getResource() {
		return resource;
	}

	public void setResource(final GamlResource resource) {
		this.resource = resource;
		if (resource != null) {
			GamlResourceServices.addResourceListener(resource.getURI(), GamaDiagramEditor.this);
		}

	}

	public List<GamlCompilationError> getErrors() {
		return errors;
	}

	public void setErrors(final List<GamlCompilationError> errors/*
																	 * , ValidateStyledText vst
																	 */) {
		this.errors = errors;

		for (final GamlCompilationError error : errors) {
			final EObject toto = error.getStatement();
			// System.out.println("syntaxErrorsLoc : " + syntaxErrorsLoc);*/
			final List<String> ids = new ArrayList<String>();
			final String fist_obj = buildLocation(toto, ids);
			// System.out.println("location of error: " + ids);
			while (!ids.isEmpty()) {
				// System.out.println("idsEObjects.getKeys(): " +
				// idsEObjects.getKeys());
				if (!idsEObjects.keySet().contains(ids)) {
					ids.remove(ids.size() - 1);
				} else {
					break;
				}
			}
			Map<String, String> locs = errorsLoc.get(ids);

			if (locs == null) {
				locs = GamaMapFactory.create();
			}
			// System.out.println("error.getCode() : " + error.getCode());
			final String key = error.getCode().equals("gaml.duplicate.definition.issue")
					|| error.getCode().equals("gaml.duplicate.name.issue") ? "name" : fist_obj;
			locs.put(key, (locs.containsKey(key) ? locs.get(key) : "") + "\n" + error.toString());
			if (error.toString().equals("Syntax errors detected ")) {
				if (syntaxErrorsLoc.isEmpty()) {
					syntaxErrorsLoc.put(ids, locs);
				}
			} else {
				errorsLoc.put(ids, locs);
			}

		}
		toRefresh = false;
		updateEObjectErrors();
	}

	public String buildLocation(EObject toto, final List<String> ids) {
		String fist_obj = null;
		do {
			// System.out.println("toto: " + toto);
			if (toto instanceof S_ReflexImpl) {
				final S_ReflexImpl vv = (S_ReflexImpl) toto;
				if (vv.getName() != null) {
					ids.add(0, vv.getName());
				}
				if (fist_obj == null) {
					if (vv.getName() != null) {
						fist_obj = vv.getName();
					} else if (vv.getKey() != null) {
						fist_obj = vv.getKey();
					}
				}
			} else if (toto instanceof S_SpeciesImpl) {
				final S_SpeciesImpl vv = (S_SpeciesImpl) toto;
				ids.add(0, vv.getName());
				if (fist_obj == null) {
					fist_obj = vv.getName();
				}

			} else if (toto instanceof FacetImpl) {
				final FacetImpl vv = (FacetImpl) toto;
				// System.out.println("vv :" + vv.getKey() + ";");
				if (fist_obj == null && facets.contains(vv.getKey())) {
					fist_obj = vv.getKey();
					// System.out.println("fist_obj facet : " + fist_obj);
				}
			} else if (toto instanceof S_ActionImpl) {
				final S_ActionImpl vv = (S_ActionImpl) toto;
				ids.add(0, vv.getName());
				if (fist_obj == null) {
					fist_obj = vv.getName();
				}
			} else if (toto instanceof speciesOrGridDisplayStatementImpl) {
				final speciesOrGridDisplayStatementImpl vv = (speciesOrGridDisplayStatementImpl) toto;
				ids.add(0, vv.getKey());
				// System.out.println("vv:"+ vv.getKey());

				// System.out.println("vv.getFacets:"+ vv.getFacets());
			} else if (toto instanceof S_DisplayImpl) {
				final S_DisplayImpl vv = (S_DisplayImpl) toto;
				ids.add(0, vv.getName());
				if (fist_obj == null) {
					fist_obj = vv.getName();
				}
			} else if (toto instanceof BlockImpl) {
				final BlockImpl vv = (BlockImpl) toto;
				/*
				 * System.out.println("block:" + vv ); System.out.println( "block getFunction:" + vv.getFunction() );
				 * System.out.println("block getStatements:" + vv.getStatements() );
				 */
				if (vv.getStatements() != null) {
					for (final Statement st : vv.getStatements()) {
						if (st != null && st.getKey() != null && st.getKey().equals("parameter")) {
							//ids.add(0, st.getExpr().getOp());
							// System.out.println("st.getExpr " + st.getExpr());
							// System.out.println("st.getFacets " +
							// st.getFacets());

							// System.out.println("st.getBlock " +
							// st.getBlock());
						}
					}
				}

			} else if (toto instanceof S_DefinitionImpl) {
				final S_DefinitionImpl vv = (S_DefinitionImpl) toto;
				ids.add(0, vv.getName());
			} else if (toto instanceof ArgumentDefinitionImpl) {
				final ArgumentDefinitionImpl vv = (ArgumentDefinitionImpl) toto;
				ids.add(0, vv.getName());
			} else if (toto instanceof S_ExperimentImpl) {
				final S_ExperimentImpl vv = (S_ExperimentImpl) toto;
				ids.add(0, vv.getName());
				if (fist_obj == null) {
					fist_obj = vv.getName();
				}
			} else if (toto instanceof StatementImpl) {
				final StatementImpl vv = (StatementImpl) toto;
				if (vv.getKey().equals("text") || vv.getKey().equals("image") || vv.getKey().equals("chart")
						|| vv.getKey().equals("draw")) {
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
			} else if (toto instanceof EGamaObject) {
				final EGamaObject vv = (EGamaObject) toto;
				if (toto instanceof ELayer) {
					ids.add(0, ((ELayer) vv).getType() == null ? "species" : ((ELayer) vv).getType());
				} else if (toto instanceof ELayerAspect) {
					ids.add(0, "draw");
				} else {
					ids.add(0, vv.getName());
				}
				if (fist_obj == null) {
					fist_obj = vv.getName();
				}
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
				if (!((ESpecies) toto).getName().equals("world")) {
					toto = ((ESpecies) toto).getMacroSpeciesLinks().get(0).getMacro();
				} else {
					toto = null;
				}
			} else {
				toto = toto != null ? toto.eContainer() : toto;
			}

		} while (toto != null && !(toto instanceof Model));
		if (!ids.contains("world")) {
			ids.add(0, "world");
		}
		// System.out.println("ids: " + ids);
		return fist_obj;
	}

	public String containErrors(final List<String> location, final String name, final List<String> uselessName) {
		// System.out.println("syntaxErrorsLoc: " + syntaxErrorsLoc);
		final boolean noName = name.equals("");
		// System.out.println("location: " + location + " name: " + name);

		// System.out.println("errorsLoc: " + errorsLoc);
		if (errorsLoc == null || errorsLoc.isEmpty() || !errorsLoc.containsKey(location)) { return ""; }

		if (noName) {
			final Map<String, String> er = errorsLoc.get(location);
			if (uselessName != null) {
				for (final String val : uselessName) {
					er.remove(val);
				}
			}
			// System.out.println("er 2: " + er);
			if (!er.isEmpty()) {
				final List<String> l = new ArrayList<String>(er.values());
				return l.get(0);
			}
		} else if (errorsLoc.get(location).containsKey(name)) {
			// System.out.println("errorsLoc.get(location).get(name): " +
			// errorsLoc.get(location).get(name));
			return errorsLoc.get(location).get(name);
		}

		return "";
	}

	public List<String> computeIds(final EObject obj) {
		EObject toto = obj;
		final List<String> ids = new ArrayList<String>();
		do {
			if (toto != null) {
				if (toto instanceof EGamaObject) {
					if (toto instanceof ELayer) {
						ids.add(0, ((ELayer) toto).getType());
					}
					if (toto instanceof ELayerAspect) {
						ids.add(0, "draw");
					} else {
						ids.add(0, ((EGamaObject) toto).getName());
					}
				}

				else if (toto instanceof EVariable) {
					ids.add(0, ((EVariable) toto).getName());
				} else if (toto instanceof EFacet) {
					ids.add(0, ((EFacet) toto).getName());
				}
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
					if (!((ESpecies) toto).getName().equals("world")) {
						toto = ((ESpecies) toto).getMacroSpeciesLinks().get(0).getMacro();
					} else {
						toto = null;
					}
				} else {
					toto = toto.eContainer();
				}
			}
		} while (toto != null && !(toto instanceof Model));
		if (!ids.contains("world")) {
			ids.add(0, "world");
		}
		return ids;
	}

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

	public void addEOject(final EObject obj, final String name) {
		final List<String> ids = computeIds(obj);
		ids.add(name);
		idsEObjects.put(ids, obj);
	}

	public void removeEOject(final EObject obj) {
		final List<String> ids = computeIds(obj);
		idsEObjects.remove(ids);
	}

	public void updateEObjectErrors() {
		final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(getDiagram());
		if (domain != null) {
			domain.getCommandStack().execute(new RecordingCommand(domain) {

				@Override
				public void doExecute() {

					initIdsEObjects();
					final List<List<String>> vals = new ArrayList<List<String>>(idsEObjects.keySet());
					final Map<List<String>, EObject> valM = GamaMapFactory.create();
					for (final EObject bo : valM.values()) {
						if (bo instanceof EGamaObject) {
							((EGamaObject) bo).setHasError(false);
						} else if (bo instanceof EVariable) {
							((EVariable) bo).setHasError(false);
						}
					}
					for (final List<String> ids : vals) {
						final EObject obj = valM.get(ids);
						// System.out.println("ids: " + ids + " obj: " + obj);
						if (obj == null) {
							continue;
						}
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

	public Map<List<String>, Map<String, String>> getErrorsLoc() {
		return errorsLoc;
	}

	public Map<List<String>, Map<String, String>> getSyntaxErrorsLoc() {
		return syntaxErrorsLoc;
	}

	public Map<List<String>, EObject> getIdsEObjects() {
		return idsEObjects;
	}

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
						if (location || v.getName().equals("location")) {
							location = true;
						}
						if (shape || v.getName().equals("shape")) {
							shape = true;
						}
					}
					if (!shape) {
						addEOject((EObject) bo, "shape");
					}
					if (!location) {
						addEOject((EObject) bo, "location");
					}
				} else if (bo instanceof EAspect) {
					addEOject((EObject) bo, "draw");
				} else if (bo instanceof EDisplay) {
					for (final ELayer lay : ((EDisplay) bo).getLayers()) {
						addEOject((EObject) bo, lay.getType());
					}
				} else if (bo instanceof EExperiment) {
					for (final EParameter v : ((EExperiment) bo).getParameters()) {
						addEOject(v);
					}
					for (final EMonitor v : ((EExperiment) bo).getMonitors()) {
						addEOject(v);
					}
				}
			}
		}
	}

	public void updateErrors(final List<String> oldId, final List<String> newId) {
		final Map<String, String> eMap = errorsLoc.remove(oldId);
		if (eMap != null) {
			errorsLoc.put(newId, eMap);
		}

		final Map<String, String> eMap2 = syntaxErrorsLoc.remove(oldId);
		if (eMap2 != null) {
			syntaxErrorsLoc.put(newId, eMap2);
		}

		final EObject obj = idsEObjects.remove(oldId);
		if (obj != null) {
			idsEObjects.put(newId, obj);
		}
	}

	public boolean isWasOK() {
		return wasOK;
	}

	@Override
	protected DiagramBehavior createDiagramBehavior() {
		return new GamaDiagramBehavior(this);
	}

}
