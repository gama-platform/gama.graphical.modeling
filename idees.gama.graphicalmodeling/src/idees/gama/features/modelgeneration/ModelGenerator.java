
package idees.gama.features.modelgeneration;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.xtext.resource.SynchronizedXtextResourceSet;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.common.collect.Iterables;

import gama.EAction;
import gama.EActionLink;
import gama.EAspect;
import gama.EAspectLink;
import gama.EBatchExperiment;
import gama.EChartLayer;
import gama.EDisplay;
import gama.EDisplayLink;
import gama.EEquation;
import gama.EEquationLink;
import gama.EExperiment;
import gama.EExperimentLink;
import gama.EFacet;
import gama.EGamaLink;
import gama.EGamaObject;
import gama.EGrid;
import gama.ELayer;
import gama.ELayerAspect;
import gama.EMonitor;
import gama.EParameter;
import gama.EPerceive;
import gama.EPerceiveLink;
import gama.EPlan;
import gama.EPlanLink;
import gama.EReflex;
import gama.EReflexLink;
import gama.ERule;
import gama.ERuleLink;
import gama.ESpecies;
import gama.EState;
import gama.EStateLink;
import gama.ESubSpeciesLink;
import gama.ETask;
import gama.ETaskLink;
import gama.EVariable;
import gama.EWorldAgent;
import idees.gama.diagram.GamaDiagramEditor;
import idees.gama.diagram.ModelStructure;
import idees.gama.features.ExampleUtil;
import msi.gaml.interfaces.IGamlIssue;
import msi.gama.kernel.model.IModel;
import msi.gama.lang.gaml.resource.GamlResource;
import msi.gama.runtime.exceptions.GamaRuntimeException;
import msi.gaml.compilation.GamlCompilationError;
import msi.gaml.descriptions.ModelDescription;

public class ModelGenerator {

	private static String EL = System.getProperty("line.separator");

	
	private static ModelDescription buildModelDescription(final GamlResource r, final List<GamlCompilationError> errors) {
		try {
			
			// Syntactic errors detected, we cannot build the resource
			if (r.hasErrors()) {
				if (errors != null)
					errors.add(new GamlCompilationError("Syntax errors ", IGamlIssue.GENERAL, r.getContents().get(0),
							false, false));
				return null;
			} else {
				// We build the description
				final ModelDescription model = r.buildCompleteDescription();
				if (errors != null)
					Iterables.addAll(errors, r.getValidationContext());
				return model;
			}
		} finally {}
	}
	
	public static IModel modelGeneration(final IFeatureProvider fp, final Diagram diagram) {
		final GamaDiagramEditor diagramEditor = (GamaDiagramEditor) ExampleUtil.getDiagramEditor(fp);
		diagramEditor.initIdsEObjects();
		final XtextResourceSet rs = new SynchronizedXtextResourceSet();
		rs.setClasspathURIContext(ModelGenerator.class);
		URI du = diagramEditor.getDiagramEditorInput().getUri();
		final URI uri = URI.createURI((du.trimFragment()).toString().replace(".gadl",".gaml"), true);
		final GamlResource resource = (GamlResource) rs.createResource(uri);
		final String gamlModel = ModelGenerator.generateModel(fp, diagram, null);
		final InputStream is = new ByteArrayInputStream(gamlModel.getBytes());
		diagramEditor.setResource(resource);
		try {
			resource.load(is, null);
		} catch (final IOException e1) {
			e1.printStackTrace();
		}
		try {
			final Set<GamlResource> resources = new HashSet<GamlResource>();
			resources.add(resource);
			final ModelDescription modeldesc = buildModelDescription(resource, new ArrayList<GamlCompilationError>());
			//((ModelDescription) model.getDescription()).setModelFilePath(getPath(fp, diagram));
			return modeldesc == null ? null : (IModel) modeldesc.compile();
		} catch (final GamaRuntimeException e1) {
			e1.printStackTrace();
		} catch (final Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String getPath(final IFeatureProvider fp, final Diagram diagram) {
		final List<Shape> contents = diagram.getChildren();
		URI uri = null;
		if (contents != null) {
			uri = EcoreUtil.getURI((EObject) fp.getBusinessObjectForPictogramElement(contents.get(0)));
		} else {
			return "";
		}
		uri = uri.trimFragment();
		if (uri.isPlatform()) {
			uri = URI.createURI(uri.toPlatformString(true));
		}
		// String containerStr = "/"+ uri.segment(0);
		String path = ResourcesPlugin.getWorkspace().getRoot().getLocation() + uri.path();
		path = path.replace(".gadl", ".gaml");
		return path;
	}

	public static String getFolder(final IFeatureProvider fp, final Diagram diagram) {
		final String path = getPath(fp, diagram);
		final String[] pp = path.split("/");
		String pF = "";
		for (int i = 0; i < pp.length - 1; i++) {
			pF += pp[i] + "/";
		}
		return pF;
	}

	public static boolean hasSyntaxError(final IFeatureProvider fp, final String expression,
			final boolean isExpression) {
		return hasSyntaxError(fp, expression, isExpression, false);
	}

	public static boolean hasSyntaxError(final IFeatureProvider fp, final String expression, final boolean isExpression,
			final boolean isString) {
		if (expression.replace(" ", "").isEmpty()) {
			return false;
		}
		URI du = ((GamaDiagramEditor) ExampleUtil.getDiagramEditor(fp)).getDiagramEditorInput().getUri();
		
		final URI uri = URI.createURI((du.trimFragment()).toString().replace(".gadl",".gaml"), true);
		
		final XtextResourceSet rs = new SynchronizedXtextResourceSet();
		rs.setClasspathURIContext(ModelGenerator.class);
		final String gamlModel = "model toto2733663525\nglobal{init{" + (isExpression ? "string _toto_t <-" : "")
				+ (isString ? "\"" : "") + expression + (isString ? "\"" : "") + (isExpression ? ";" : "") + "}}";
		final InputStream is = new ByteArrayInputStream(gamlModel.getBytes());
		final GamlResource resource = (GamlResource) rs.createResource(uri);
		
		try {
			resource.load(is, null);
		} catch (final IOException e1) {
			e1.printStackTrace();
		}
		try {
			resource.validate();
			Iterator<GamlCompilationError> it = resource.getValidationContext().getInternalErrors().iterator();
			while (it.hasNext()) {
				GamlCompilationError error = it.next();
				if (error.isError() && error.toString().equals("Syntax errors detected ")) {
					return true;
				}
			}
			return false;
		} catch (final GamaRuntimeException e1) {
			return true;
		} catch (final Exception e) {
			return true;
		}
	}

	public static List<GamlCompilationError> modelValidation(final IFeatureProvider fp,
			final Diagram diagram) {

		final GamaDiagramEditor diagramEditor = (GamaDiagramEditor) ExampleUtil.getDiagramEditor(fp);
		diagramEditor.initIdsEObjects();

		final XtextResourceSet rs = new SynchronizedXtextResourceSet();
		rs.setClasspathURIContext(ModelGenerator.class);
		URI du = diagramEditor.getDiagramEditorInput().getUri();
		final URI uri = URI.createURI((du.trimFragment()).toString().replace(".gadl",".gaml"), true);
		final GamlResource resource = (GamlResource) rs.createResource(uri);
		final String gamlModel = ModelGenerator.generateModel(fp, diagram, null);
		if (gamlModel.equals(""))
			return null;
		final InputStream is = new ByteArrayInputStream(gamlModel.getBytes());
		diagramEditor.setResource(resource);
		try {
			resource.load(is, null);
		} catch (final IOException e1) {
			e1.printStackTrace();
		}
		try {
			
		resource.getValidationContext().clear();
			resource.validate();
			
			final List<GamlCompilationError> errors = new ArrayList<GamlCompilationError>();
			Iterator<GamlCompilationError> it = resource.getValidationContext().getInternalErrors().iterator();
			while (it.hasNext()) {
				GamlCompilationError error = it.next();
				if (error.isError()) {
					errors.add(error);
				}
			}
			diagramEditor.getErrorsLoc().clear();

			diagramEditor.setErrors(errors);
			if (errors.isEmpty()) {
				diagramEditor.getSyntaxErrorsLoc().clear();
			}
			return errors;
		} catch (final GamaRuntimeException e1) {
			e1.printStackTrace();
		} catch (final Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	static String manageName(String name) {
		if (name.contains(" ")) {
			return "\"" + name + "\"";
		} else {
			return name;
		}
	}

	static String defineSpecies(final ESpecies species, final int level, final String id) {
		if (species == null) {
			return "";
		}
		String model = EL;
		String sp = "";
		for (int i = 0; i < level; i++) {
			sp += "\t";
		}
		model += sp;
		if (species instanceof EGrid) {
			model += "grid " + manageName(species.getName());
		} else {
			model += "species " + manageName(species.getName());
		}

		if (species.getInheritsFrom() != null) {
			model += " parent:" + manageName(species.getInheritsFrom().getName());
		}
		
		if (species.getSkills() != null && !species.getSkills().isEmpty()) {
			model += " skills:" + species.getSkills();
		}
		for (final EFacet facet : species.getFacets()) {
			if (facet.getValue().replace(" ", "").isEmpty())
				continue;
			if (facet.getName().equals("name") || facet.getName().equals("skills")) continue;
			model += " " + facet.getName() + ":" + facet.getValue();
		}
		model += " {" + EL;
		for (final EVariable var : species.getVariables()) {
			model += defineVariable(var, level + 1);
		}
		String idT = ModelStructure.getElementId(species);
		boolean isId = idT.equals(id);
		if (isId)
			model += EL + idT + EL;
		model += defineInit(species, isId ? -1 : level + 1);
		if (isId)
			model += EL + idT + EL;

		final Map<String, EReflexLink> reflexMap = new Hashtable<String, EReflexLink>();

		for (final EActionLink link : species.getActionLinks()) {
			final String idA = ModelStructure.getElementId(link.getAction());
			isId = idA.equals(id);
			if (isId)
				model += EL + idA + EL;
			model += defineAction(link, isId ? -1 : level + 1);
			if (isId)
				model += EL + idA + EL;
		}
		for (final EReflexLink link : species.getReflexLinks()) {
			if (link.getTarget() == null) {
				continue;
			}
			reflexMap.put(link.getTarget().getName(), link);
		}
		final List<String> reflexes = new ArrayList<String>();
		if (species.getReflexList().isEmpty() && !reflexMap.isEmpty()) {
			reflexes.addAll(reflexMap.keySet());
		} else {
			reflexes.addAll(species.getReflexList());
		}
		for (final String reflex : reflexes) {
			if (reflexMap.containsKey(reflex)) {
				idT = ModelStructure.getElementId(reflexMap.get(reflex).getReflex());
				isId = idT.equals(id);
				if (isId)
					model += EL + idT + EL;
				model += defineGeneric(reflexMap.get(reflex), isId ? -1 : level + 1);
				if (isId)
					model += EL + idT + EL;

			}
		}

		for (final EStateLink link : species.getStateLinks()) {
			final String idT2 = ModelStructure.getElementId(link.getState());
			final boolean isId2 = idT2.equals(id);
			if (isId2)
				model += EL + idT2 + EL;
			model += defineGeneric(link, isId2 ? -1 : level);
			if (isId2)
				model += EL + idT2 + EL;
		}
		for (final ETaskLink link : species.getTaskLinks()) {
			final String idT2 = ModelStructure.getElementId(link.getTask());
			final boolean isId2 = idT2.equals(id);
			if (isId2)
				model += EL + idT2 + EL;
			model += defineGeneric(link, isId2 ? -1 : level);
			if (isId2)
				model += EL + idT2 + EL;
		}
		for (final EEquationLink link : species.getEquationLinks()) {
			final String idT2 = ModelStructure.getElementId(link.getEquation());
			final boolean isId2 = idT2.equals(id);
			if (isId2)
				model += EL + idT2 + EL;
			model += defineGeneric(link, isId2 ? -1 : level);
			if (isId2)
				model += EL + idT2 + EL;
		}
		for (final EPlanLink link : species.getPlanLinks()) {
			final String idT2 = ModelStructure.getElementId(link.getPlan());
			final boolean isId2 = idT2.equals(id);
			if (isId2)
				model += EL + idT2 + EL;
			model += defineGeneric(link, isId2 ? -1 : level);
			if (isId2)
				model += EL + idT2 + EL;
		}
		for (final ERuleLink link : species.getRuleLinks()) {
			final String idT2 = ModelStructure.getElementId(link.getRule());
			final boolean isId2 = idT2.equals(id);
			if (isId2)
				model += EL + idT2 + EL;
			model += defineGeneric(link, isId2 ? -1 : level);
			if (isId2)
				model += EL + idT2 + EL;
		}
		for (final EPerceiveLink link : species.getPerceiveLinks()) {
			final String idT2 = ModelStructure.getElementId(link.getPerceive());
			final boolean isId2 = idT2.equals(id);
			if (isId2)
				model += EL + idT2 + EL;
			model += defineGeneric(link, isId2 ? -1 : level);
			if (isId2)
				model += EL + idT2 + EL;
		}

		for (final EAspectLink link : species.getAspectLinks()) {
			final String idA = ModelStructure.getElementId(link.getAspect());
			isId = idA.equals(id);
			if (isId)
				model += EL + idA + EL;
			model += defineAspect(link, isId ? -1 : level + 1);
			if (isId)
				model += EL + idA + EL;
		}
		for (final ESubSpeciesLink link : species.getMicroSpeciesLinks()) {
			model += defineSpecies(link.getMicro(), level + 1, id);
		}

		model += sp + "}" + EL;

		return model;
	}

	static String defineVariable(final EVariable var, final int level) {
		if (var == null) {
			return "";
		}
		String varStr = "";
		for (int i = 0; i < level; i++) {
			varStr += "\t";
		}
		if (var.getType() == null || var.getType().equals("")) {
			varStr += "var ";
		} else {
			varStr += var.getType() + " ";
		}
		varStr += var.getName();
		if (var.getInit() != null && !var.getInit().equals("")) {
			varStr += " <- " + var.getInit();
		}
		if (var.getUpdate() != null && !var.getUpdate().equals("")) {
			varStr += " update: " + var.getUpdate();
		}
		if (var.getFunction() != null && !var.getFunction().equals("")) {
			varStr += " -> {" + var.getFunction() + "}";
		}
		if (var.getMin() != null && !var.getMin().equals("")) {
			varStr += " min: " + var.getMin();
		}
		if (var.getMax() != null && !var.getMax().equals("")) {
			varStr += " max: " + var.getMax();
		}
		varStr += ";" + EL;
		return varStr;
	}

	static String defineAction(final EActionLink link, final int level) {
		if (link == null || link.getAction() == null) {
			return "";
		}

		final EAction action = link.getAction();
		String result = "";
		String sp = "";
		for (int i = 0; i < level; i++) {
			sp += "\t";
		}

		final String returnType = action.getReturnType() == null || action.getReturnType().isEmpty() ? "action"
				: action.getReturnType();
		String arguments = "";
		for (final EVariable var : action.getVariables()) {
			arguments += (arguments.isEmpty() ? "" : ", ") + var.getType() + " " + var.getName()
					+ (var.getInit() == null || var.getInit().isEmpty() ? "" : " <- " + var.getInit());
		}
		result += sp + returnType + " " + manageName(action.getName()) + (arguments.isEmpty() ? "" : "(" + arguments + ")") + " {"
				+ EL;
		final String code = action.getGamlCode();
		if (code != null && !code.isEmpty()) {
			/*
			for (final String line : code.split("\n")) {
				if (line.replace(" ", "").replace("\t", "").isEmpty()) continue;
				result += sp + (level == -1 ? "" : "\t") + line;
			}*/
			result += code;
		}
		result += EL + sp + "}" + EL;

		return result;
	}

	static String defineInit(final ESpecies species, final int level) {
		if (species == null) {
			return "";
		}
		String result = "";
		final String code = species.getInit();
		String sp = "";
		for (int i = 0; i < level; i++) {
			sp += "\t";
		}
		result += sp + "init {" + EL;
		if (code != null && !code.isEmpty()) {
			/*for (final String line : code.split("\n")) {
				if (line.replace(" ", "").replace("\t", "").isEmpty()) continue;
				result += sp + (level == -1 ? "" : "\t") + line;
			}*/
			result += code;
		}
		result += EL + sp + "}" + EL;
		return result;
	}

	static String defineGeneric(final EGamaLink link, final int level) {
		if (link == null || link.getTarget() == null) {
			return "";
		}
		final EGamaObject object = link.getTarget();
		String result = "";
		String sp = "";
		for (int i = 0; i < level; i++) {
			sp += "\t";
		}
		String type = "";
		if (object instanceof EReflex)
			type = "reflex";
		else if (object instanceof EState)
			type = "state";
		else if (object instanceof ETask)
			type = "task";
		else if (object instanceof EEquation)
			type = "equation";
		else if (object instanceof EPlan)
			type = "plan";
		else if (object instanceof EPerceive)
			type = "perceive";
		else if (object instanceof ERule)
			type = "rule";
		result += type + " " + manageName(link.getTarget().getName());
		for (final EFacet facet : object.getFacets()) {
			if (facet.getValue().replace(" ", "").isEmpty())
				continue;
			result += " " + facet.getName() + ":" + facet.getValue();
		}
		String code = null;
		if (object instanceof EReflex)
			code = ((EReflex) object).getGamlCode();
		else if (object instanceof EState)
			code = ((EState) object).getGamlCode();
		else if (object instanceof EEquation)
			code = ((EEquation) object).getGamlCode();
		else if (object instanceof ETask)
			code = ((ETask) object).getGamlCode();
		else if (object instanceof EPlan)
			code = ((EPlan) object).getGamlCode();
		else if (object instanceof EPerceive)
			code = ((EPerceive) object).getGamlCode();
		result += " {" + EL;
		if (code != null && !code.isEmpty()) {
			/*for (final String line : code.split("\n")) {
				if (line.replace(" ", "").replace("\t", "").isEmpty()) continue;
				result += sp + (level == -1 ? "" : "\t") + line;
			}*/
			result += code;
		}

		result += EL + sp + "}" + EL;
		return result;
	}

	static String defineAspect(final EAspectLink link, final int level) {
		if (link == null || link.getAspect() == null) {
			return "";
		}
		String result = "";
		final EAspect asp = link.getAspect();
		String sp = "";
		for (int i = 0; i < level; i++) {
			sp += "\t";
		}
		result += sp + "aspect " + manageName(asp.getName()) + " {" + EL;
		if (asp.isDefineGamlCode()) {
			final String code = asp.getGamlCode();
			if (code != null && !code.isEmpty()) {
				/*for (final String line : code.split("\n")) {
					if (line.replace(" ", "").replace("\t", "").isEmpty()) continue;
					result += sp + (level == -1 ? "" : "\t") + line;
				}*/
				result += code;
			}
		} else {

			for (final ELayerAspect lay : asp.getLayers()) {
				String code = sp + (level >= 0 ? "\t" : "") + "draw ";
				final String val = lay.getShapeType();
				if (val == null) {
					continue;
				}
				if (val.equals("polyline") || val.equals("polygon")) {
					code += val + "(" + lay.getPoints() + ")";
				} else if (val.equals("circle") || val.equals("sphere")) {
					code += val + "(" + lay.getRadius() + ")";
				} else if (val.equals("square") || val.equals("cube") || val.equals("pyramid")) {
					code += val + "(" + lay.getSize() + ")";
				} else if (val.equals("rectangle") || val.equals("hexagon")) {
					code += val + "({" + lay.getWidth() + "," + lay.getHeigth() + "})";
				} else if (val.equals("expression")) {
					code += lay.getExpression();
				} else if (val.equals("image")) {
					code += "file(\"" + lay.getPath() + "\")"
							+ (lay.getImageSize() != null && !lay.getImageSize().isEmpty() ? ""
									: " size:" + lay.getSize());
				} else if (val.equals("text")) {
					code += "\"" + lay.getText() + "\"" + (lay.getTextSize() != null && !lay.getTextSize().isEmpty()
							? "" : " size:" + lay.getSize());
				}
				if (lay.getIsColorCst()) {
					code += " color: rgb(" + lay.getColorRBG().toString().replace("[", "").replace("]", "") + ")";
				} else if (lay.getColor() != null && !lay.getColor().isEmpty()) {
					code += " color: " + lay.getColor();
				}
				if (lay.getEmpty() != null && !lay.getEmpty().isEmpty() && !lay.getEmpty().equals("false")) {
					code += " empty: " + lay.getEmpty();
				}
				if (lay.getRotate() != null && !lay.getRotate().isEmpty() && !lay.getRotate().equals("0.0")) {
					code += " rotate: " + lay.getRotate();
				}
				if (lay.getAt() != null && !lay.getAt().isEmpty()) {
					code += " at: " + lay.getAt();
				}
				if (lay.getDepth() != null && !lay.getDepth().isEmpty() && !lay.getDepth().equals("0.0")) {
					code += " depth: " + lay.getDepth();
				}
				if (lay.getTexture() != null && !lay.getTexture().isEmpty() && !lay.getTexture().equals("[]")) {
					code += " texture: " + lay.getTexture();
				}
				result += code + ";" + EL;
			}
		}
		result += EL + sp + "}" + EL;
		return result;
	}

	static String defineExperiment(final EExperiment exp, final String id) {
		String model = "";
		if (exp == null) {
			return model;
		}
		if (exp instanceof EBatchExperiment) {
			model += EL + EL + "experiment \"" + exp.getName() + "\" type:batch ";
			for (final EFacet facet : exp.getFacets()) {
				if (facet.getValue().replace(" ", "").isEmpty())
					continue;
					model += " " + facet.getName() + ":" + facet.getValue();
			}
					
			model +=  " {" +EL;
			for (final EParameter link : exp.getParameters()) {
				model += defineParameter(link);
			}

			model += EL + "}" + EL;

		} else {
			model += EL + EL + "experiment \"" + exp.getName() + "\" type:gui " ;
			for (final EFacet facet : exp.getFacets()) {
				if (facet.getValue().replace(" ", "").isEmpty())
					continue;
					model += " " + facet.getName() + ":" + facet.getValue();
			}
					
			model +=  " {" +EL;
			
			for (final EParameter link : exp.getParameters()) {
				model += defineParameter(link);
			}

			model += "\toutput{";
			for (final EMonitor mon : exp.getMonitors()) {
				model += defineMonitor(mon);
			}
			for (final EDisplayLink link : exp.getDisplayLinks()) {
				final String idA = ModelStructure.getElementId(link.getDisplay());
				final boolean isId = idA.equals(id);
				if (isId)
					model += EL + idA + EL;
				model += defineDisplay(link);
				if (isId)
					model += EL + idA + EL;

			}
			model += EL + "\t}" + EL + "}" + EL;
		}
		return model;

	}

	static String defineParameter(final EParameter par) {
		if (par == null) {
			return "";
		}
		String parStr = "\tparameter";
		parStr += "\"" + par.getName() + "\"";
		parStr += " var:" + par.getVariable();
		if (par.getCategory() != null && !par.getCategory().isEmpty()) {
			parStr += " category: \"" + par.getCategory() + "\"";
		}
		if (par.getAmong() != null && !par.getAmong().isEmpty()) {
			parStr += " among:" + par.getAmong();
		}
		if (par.getInit() != null && !par.getInit().isEmpty()) {
			parStr += " <-" + par.getInit();
		}
		if (par.getMin() != null && !par.getMin().isEmpty()) {
			parStr += " min:" + par.getMin();
		}
		if (par.getMax() != null && !par.getMax().isEmpty()) {
			parStr += " max:" + par.getMax();
		}
		if (par.getStep() != null && !par.getStep().isEmpty()) {
			parStr += " step:" + par.getStep();
		}
		parStr += ";" + EL;
		return parStr;
	}

	static String defineMonitor(final EMonitor mon) {
		if (mon == null) {
			return "";
		}
		String parStr = "\t\tmonitor ";
		parStr += "\"" + mon.getName() + "\"";
		if (mon.getValue() != null && !mon.getValue().isEmpty()) {
			parStr += " value:" + mon.getValue();
		}
		parStr += ";" + EL;
		return parStr;
	}

	static String defineDisplay(final EDisplayLink link) {
		if (link == null || link.getDisplay() == null) {
			return "";
		}
		final EDisplay disp = link.getDisplay();
		String model = EL + "\t\t";
		model += "display " + manageName(disp.getName());
		for (final EFacet facet : disp.getFacets()) {
			if (facet.getValue().replace(" ", "").isEmpty())
				continue;
			model += " " + facet.getName() + ":" + facet.getValue();

		}

		model += " {" + EL;
		if (disp.isDefineGamlCode()) {
			final String code = disp.getGamlCode();
			if (code != null && !code.isEmpty()) {
				/*for (final String line : code.split("\n")) {
					if (line.replace(" ", "").replace("\t", "").isEmpty()) continue;
					model += line;
				}*/
				model += code;
			}
		} else {

			for (final ELayer lay : disp.getLayers()) {
				if (lay.getType() == null) {
					continue;
				}
				model += "\n\t\t\t";
				if (lay.getType().equals("species")) {
					model += lay.getType() + " " + lay.getSpecies()
							+ (lay.getAspect() == null || lay.getAspect().isEmpty() || lay.getAspect().equals("default")
									? "" : " aspect: " + lay.getAspect());
				} else if (lay.getType().equals("grid")) {
					model += lay.getType() + " " + lay.getGrid();
					if (lay.getIsColorCst() == null || lay.getIsColorCst()) {
						if (lay.getColorRBG().size() == 3) {
							if (lay.isShowLines()) {
								model += " lines:rgb(" + lay.getColorRBG().get(0) + "," + lay.getColorRBG().get(1) + ","
										+ lay.getColorRBG().get(2) + ")";
							}
						}
					} else {
						if (lay.getColor() != null && !lay.getColor().equals("rgb(255,255,255)")
								&& !lay.getColor().isEmpty()) {
							model += " lines:" + lay.getColor();
						}
					}
				} else if (lay.getType().equals("agents")) {
					model += lay.getType() + " \"" + lay.getName() + "\" value:" + lay.getAgents()
							+ (lay.getAspect() == null || lay.getAspect().isEmpty() ? ""
									: " aspect: " + lay.getAspect());
				} else if (lay.getType().equals("image")) {
					model += lay.getType() + "\"" + lay.getFile() + "\""
							+ (lay.getSize().isEmpty() ? "" : " size: " + lay.getSize());
					if (lay.getIsColorCst() == null || lay.getIsColorCst()) {
						if (lay.getColorRBG().size() == 3) {
							if (!lay.getColorRBG().get(0).equals("255") || !lay.getColorRBG().get(1).equals("255")
									|| !lay.getColorRBG().get(2).equals("255")) {
								model += " color:rgb(" + lay.getColorRBG().get(0) + "," + lay.getColorRBG().get(1) + ","
										+ lay.getColorRBG().get(2) + ")";
							}
						}
					} else {
						if (lay.getColor() != null && !lay.getColor().equals("rgb(255,255,255)")
								&& !lay.getColor().isEmpty()) {
							model += " color:" + lay.getColor();
						}
					}
				} else if (lay.getType().equals("text")) {
					model += lay.getType() + "\"" + lay.getText() + "\""
							+ (lay.getSize().isEmpty() ? "" : " size: " + lay.getSize());
					if (lay.getIsColorCst() == null || lay.getIsColorCst()) {
						if (lay.getColorRBG().size() == 3) {
							if (!lay.getColorRBG().get(0).equals("255") || !lay.getColorRBG().get(1).equals("255")
									|| !lay.getColorRBG().get(2).equals("255")) {
								model += " color:rgb(" + lay.getColorRBG().get(0) + "," + lay.getColorRBG().get(1) + ","
										+ lay.getColorRBG().get(2) + ")";
							}
						}
					} else {
						if (lay.getColor() != null && !lay.getColor().equals("rgb(255,255,255)")
								&& !lay.getColor().isEmpty()) {
							model += " color:" + lay.getColor();
						}
					}
				} else if (lay.getType().equals("chart")) {
					String background = "";
					if (lay.getIsColorCst() == null || lay.getIsColorCst()) {
						if (lay.getColorRBG().size() == 3
								&& (!lay.getColorRBG().get(0).equals("255") || !lay.getColorRBG().get(1).equals("255")
										|| !lay.getColorRBG().get(2).equals("255"))) {
							background = " background:rgb(" + lay.getColorRBG().get(0) + "," + lay.getColorRBG().get(1)
									+ "," + lay.getColorRBG().get(2) + ")";
						}
					} else {
						if (lay.getColor() != null && !lay.getColor().equals("rgb(255,255,255)")
								&& !lay.getColor().isEmpty()) {
							background = " background:" + lay.getColor();
						}
					}
					model += lay.getType() + " \"" + lay.getName() + "\" type:" + lay.getChart_type() + background;
				}

				for (final EFacet facet : lay.getFacets()) {
					if (facet.getValue().replace(" ", "").isEmpty())
						continue;
					model += " " + facet.getName() + ":" + facet.getValue();
				}
				if (lay.getType().equals("chart")) {
					model += "{" + EL;
					if (lay.getChartlayers() != null && !lay.getChartlayers().isEmpty()) {
						for (final EChartLayer cl : lay.getChartlayers()) {
							model += "\t\t\t\tdata \"" + cl.getName() + "\" style:" + cl.getStyle() + " value:"
									+ (cl.getValue() == null || cl.getValue().isEmpty() ? "0.0" : cl.getValue())
									+ (cl.getColor() == null || cl.getColor().isEmpty() ? ""
											: " color:" + cl.getColor())
									+ ";" + EL;
						}
					}
					model += EL+"\t\t\t}" + EL;
				} else {
					model += ";" + EL;
				}
			}
		}
		model += "\t\t}";
		return model;
	}

	public static String generateModel(final IFeatureProvider fp, final Diagram diagram, final String id) {
		String model = "";
		final List<Shape> contents = diagram.getChildren();
		if (contents != null) {
			EWorldAgent worldAgent = null;
			for (final Shape obj : contents) {
				final Object bo = fp.getBusinessObjectForPictogramElement(obj);
				if (bo instanceof EWorldAgent) {
					worldAgent = (EWorldAgent) bo;
					break;

				}
			}
			if (worldAgent == null)
				return "";
			String modelName = diagram.getName();
			if (!Character.isLetter(modelName.charAt(0))) {
				modelName = "_" + modelName;
			}
			model = "model " + modelName + EL + EL + "global";

			if (worldAgent.getSkills() != null && !worldAgent.getSkills().isEmpty()) {
				model += " skills:" + worldAgent.getSkills();
			}
			for (final EFacet facet : worldAgent.getFacets()) {
				if (facet.getValue().replace(" ", "").isEmpty())
					continue;
				model += " " + facet.getName() + ":" + facet.getValue();
			}

			model += " {" + EL;
			final int level = 1;
			for (final EVariable var : worldAgent.getVariables()) {
				model += defineVariable(var, level);
			}

			for (final EActionLink link : worldAgent.getActionLinks()) {
				final String idA = ModelStructure.getElementId(link.getAction());
				final boolean isId = idA.equals(id);
				if (isId)
					model += EL + idA + EL;
				model += defineAction(link, isId ? -1 : level);
				if (isId)
					model += EL + idA + EL;
			}
			final Map<String, EReflexLink> reflexMap = new Hashtable<String, EReflexLink>();
			for (final EReflexLink link : worldAgent.getReflexLinks()) {
				if (link.getTarget() == null) {
					continue;
				}
				reflexMap.put(link.getTarget().getName(), link);
			}
			final List<String> reflexes = new ArrayList<String>();
			if (worldAgent.getReflexList().isEmpty() && !reflexMap.isEmpty()) {
				reflexes.addAll(reflexMap.keySet());
			} else {
				reflexes.addAll(worldAgent.getReflexList());
			}
			for (final String reflex : reflexes) {
				if (reflexMap.containsKey(reflex)) {
					final String idT = ModelStructure.getElementId(reflexMap.get(reflex).getReflex());
					final boolean isId = idT.equals(id);
					if (isId)
						model += EL + idT + EL;
					model += defineGeneric(reflexMap.get(reflex), isId ? -1 : level);
					if (isId)
						model += EL + idT + EL;
				}
			}

			for (final EStateLink link : worldAgent.getStateLinks()) {
				final String idT = ModelStructure.getElementId(link.getState());
				final boolean isId = idT.equals(id);
				if (isId)
					model += EL + idT + EL;
				model += defineGeneric(link, isId ? -1 : level);
				if (isId)
					model += EL + idT + EL;

			}
			for (final ETaskLink link : worldAgent.getTaskLinks()) {
				final String idT = ModelStructure.getElementId(link.getTask());
				final boolean isId = idT.equals(id);
				if (isId)
					model += EL + idT + EL;
				model += defineGeneric(link, isId ? -1 : level);
				if (isId)
					model += EL + idT + EL;
			}
			for (final EEquationLink link : worldAgent.getEquationLinks()) {
				final String idT = ModelStructure.getElementId(link.getEquation());
				final boolean isId = idT.equals(id);
				if (isId)
					model += EL + idT + EL;
				model += defineGeneric(link, isId ? -1 : level);
				if (isId)
					model += EL + idT + EL;
			}
			for (final EPlanLink link : worldAgent.getPlanLinks()) {
				final String idT = ModelStructure.getElementId(link.getPlan());
				final boolean isId = idT.equals(id);
				if (isId)
					model += EL + idT + EL;
				model += defineGeneric(link, isId ? -1 : level);
				if (isId)
					model += EL + idT + EL;
			}
			for (final ERuleLink link : worldAgent.getRuleLinks()) {
				final String idT = ModelStructure.getElementId(link.getRule());
				final boolean isId = idT.equals(id);
				if (isId)
					model += EL + idT + EL;
				model += defineGeneric(link, isId ? -1 : level);
				if (isId)
					model += EL + idT + EL;
			}
			for (final EPerceiveLink link : worldAgent.getPerceiveLinks()) {
				final String idT = ModelStructure.getElementId(link.getPerceive());
				final boolean isId = idT.equals(id);
				if (isId)
					model += EL + idT + EL;
				model += defineGeneric(link, isId ? -1 : level);
				if (isId)
					model += EL + idT + EL;
			}

			for (final EAspectLink link : worldAgent.getAspectLinks()) {

				final String idT = ModelStructure.getElementId(link.getAspect());
				final boolean isId = idT.equals(id);
				if (isId)
					model += EL + idT + EL;
				model += defineAspect(link, isId ? -1 : level);
				if (isId)
					model += EL + idT + EL;
			}
			final String idT = ModelStructure.getElementId(worldAgent);
			final boolean isId = idT.equals(id);
			if (isId)
				model += EL + idT + EL;
			model += defineInit(worldAgent, isId ? -1 : 1);
			if (isId)
				model += EL + idT + EL;

			model += "}";
			model += EL;
			for (final ESubSpeciesLink link : worldAgent.getMicroSpeciesLinks()) {
				model += defineSpecies(link.getMicro(), 0, id);
			}

			model += EL;

			for (final EExperimentLink link : worldAgent.getExperimentLinks()) {
				model += defineExperiment(link.getExperiment(), id);
			}

		}
		return model;
	}
}
