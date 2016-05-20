package idees.gama.features.modelgeneration;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.xtext.resource.XtextResourceSet;

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
import gama.EInheritLink;
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
import msi.gama.kernel.model.IModel;
import msi.gama.lang.gaml.resource.GamlResource;
import msi.gama.lang.utils.EGaml;
import msi.gama.runtime.exceptions.GamaRuntimeException;
import msi.gama.util.GAML;
import msi.gaml.compilation.GamlCompilationError;
import msi.gaml.descriptions.ErrorCollector;
import msi.gaml.descriptions.ModelDescription;

public class ModelGenerator {

	private static String EL = System.getProperty("line.separator");

	public static IModel modelGeneration(final IFeatureProvider fp, final Diagram diagram) {
		GamaDiagramEditor diagramEditor = ((GamaDiagramEditor)ExampleUtil.getDiagramEditor(fp));
		diagramEditor.initIdsEObjects();
		XtextResourceSet rs = EGaml.getInstance(XtextResourceSet.class);
		rs.setClasspathURIContext(ModelGenerator.class);
		URI uri = URI.createPlatformResourceURI("toto/" + diagramEditor.getTitle() + ".gaml", true);
		GamlResource resource = (GamlResource) rs.createResource(uri);
		String gamlModel = ModelGenerator.generateModel(fp, diagram, null);
		InputStream is = new ByteArrayInputStream(gamlModel.getBytes());
		diagramEditor.setResource(resource);
		try {
			resource.load(is, null);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			Set<GamlResource> resources = new HashSet<GamlResource>();
			resources.add(resource);
			IModel model = resource.build(resource.getResourceSet(), new ArrayList<GamlCompilationError>());// GAML.getModelFactory().compile(resource);
			((ModelDescription) model.getDescription()).setModelFilePath(getPath(fp, diagram));

			((ModelDescription) model.getDescription()).setModelFolderPath(getFolder(fp, diagram));
			return model;
		} catch (GamaRuntimeException e1) {
			return null;
		} catch (Exception e) {
			return null;
		}
	}

	public static String getPath(final IFeatureProvider fp, final Diagram diagram) {
		List<Shape> contents = diagram.getChildren();
		URI uri = null;
		if ( contents != null ) {
			uri = EcoreUtil.getURI((EObject) fp.getBusinessObjectForPictogramElement(contents.get(0)));
		} else {
			return "";
		}
		uri = uri.trimFragment();
		if ( uri.isPlatform() ) {
			uri = URI.createURI(uri.toPlatformString(true));
		}
		// String containerStr = "/"+ uri.segment(0);
		String path = ResourcesPlugin.getWorkspace().getRoot().getLocation() + uri.path();
		path = path.replace(".gadl", ".gaml");
		return path;
	}

	public static String getFolder(final IFeatureProvider fp, final Diagram diagram) {
		String path = getPath(fp, diagram);
		String[] pp = path.split("/");
		String pF = "";
		for ( int i = 0; i < pp.length - 1; i++ ) {
			pF += pp[i] + "/";
		}
		return pF;
	}

	public static boolean
		hasSyntaxError(final IFeatureProvider fp, final String expression, final boolean isExpression) {
		return hasSyntaxError(fp, expression, isExpression, false);
	}

	public static boolean hasSyntaxError(final IFeatureProvider fp, final String expression,
		final boolean isExpression, final boolean isString) {
		if ( expression.isEmpty() ) { return false; }
		// GamaDiagramEditor diagramEditor = ((GamaDiagramEditor)fp.getDiagramTypeProvider().getDiagramEditor());
		// System.out.println("isString: " + isString);
		XtextResourceSet rs = EGaml.getInstance(XtextResourceSet.class);
		rs.setClasspathURIContext(ModelGenerator.class);
		URI uri = URI.createPlatformResourceURI("toto/toto.gaml", true);
		GamlResource resource = (GamlResource) rs.createResource(uri);
		String gamlModel =
			"model toto2733663525\nglobal{init{" + (isExpression ? "var toto <-" : "") + (isString ? "\"" : "") +
				expression + (isString ? "\"" : "") + (isExpression ? ";" : "") + "}}";
		InputStream is = new ByteArrayInputStream(gamlModel.getBytes());
		// System.out.println("gamlModel: " + gamlModel);
		try {
			resource.load(is, null);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			ErrorCollector erColl = GAML.getModelFactory().validate(resource);
			for ( GamlCompilationError error : erColl ) {
				// System.out.println("error : " + error);

				if ( error.isError() && error.toString().equals("Syntax errors detected ") ) {
					// System.out.println("has syntax error");

					// diagramEditor.updateToolbar(false);
					return true;
				}
			}
			return false;
		} catch (GamaRuntimeException e1) {
			return true;
		} catch (Exception e) {
			return true;
		}
	}

	public static List<GamlCompilationError>
		modelValidation(final IFeatureProvider fp, final Diagram diagram/* ,ValidateStyledText vst */) {
		
		GamaDiagramEditor diagramEditor = ((GamaDiagramEditor)ExampleUtil.getDiagramEditor(fp));
		diagramEditor.initIdsEObjects();

		XtextResourceSet rs = EGaml.getInstance(XtextResourceSet.class);
		rs.setClasspathURIContext(ModelGenerator.class);
		URI uri = URI.createPlatformResourceURI("toto/" + diagramEditor.getTitle() + ".gaml", true);
		GamlResource resource = (GamlResource) rs.createResource(uri);
		String gamlModel = ModelGenerator.generateModel(fp, diagram, null);
		if (gamlModel.equals("")) return null;
		InputStream is = new ByteArrayInputStream(gamlModel.getBytes());
		diagramEditor.setResource(resource);
		try {
			resource.load(is, null);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			// GamlJavaValidator validator = EGaml.getInstance(GamlJavaValidator.class);
			List<GamlCompilationError> errors = new ArrayList<GamlCompilationError>();

			ErrorCollector erColl = GAML.getModelFactory().validate(resource);
			if ( erColl != null ) {
				for ( GamlCompilationError error : erColl ) {
					if ( error.isError() ) {
						errors.add(error);
					}
				}
			}
			diagramEditor.getErrorsLoc().clear();

			diagramEditor.setErrors(errors);
			if ( errors.isEmpty() ) {
				diagramEditor.getSyntaxErrorsLoc().clear();
			}
			return errors;
		} catch (GamaRuntimeException e1) {
			return null;
		} catch (Exception e) {
			return null;
		}
	}

	static String defineSpecies(final ESpecies species, final int level, final String id) {
		if ( species == null ) { return ""; }
		String model = EL;
		String sp = "";
		for ( int i = 0; i < level; i++ ) {
			sp += "\t";
		}
		model += sp;
		if ( species instanceof EGrid) {
			model += "grid " + species.getName() ;
		} else {
			model += "species " + species.getName();
		}
		
		for ( EInheritLink link : species.getInheritingLinks() ) {
			model += " parent:" + link.getParent();
		}
		
		if ( species.getSkills() != null && !species.getSkills().isEmpty() ) {
			model += " skills:" + species.getSkills();
		}
		for (EFacet facet :species.getFacets()) {
			if ((facet.getValue().replace(" ", "")).isEmpty()) continue;
			model += " "+ facet.getName()+":" + facet.getValue();
		}
		model += " {" + EL;
		for ( EVariable var : species.getVariables() ) {
			model += defineVariable(var, level + 1);
		}
		String idT = ModelStructure.getElementId(species); 
		boolean isId = idT.equals(id);
		if (isId) model+= EL + idT + EL;
		model += defineInit(species, isId? -1:level + 1);
		if (isId) model+= EL + idT + EL;
		
		Map<String, EReflexLink> reflexMap = new Hashtable<String, EReflexLink>();
		
		for ( EActionLink link : species.getActionLinks() ) {
			String idA = ModelStructure.getElementId(link.getAction()); 
			isId = idA.equals(id);
			if (isId) model+= EL + idA + EL;
			model += defineAction(link,isId? -1:level + 1);
			if (isId) model+= EL + idA + EL;
		}
		for ( EReflexLink link : species.getReflexLinks() ) {
			if ( link.getTarget() == null ) {
				continue;
			}
			reflexMap.put(link.getTarget().getName(), link);
		}
		List<String> reflexes = new ArrayList<String>();
		if ( species.getReflexList().isEmpty() && !reflexMap.isEmpty() ) {
			reflexes.addAll(reflexMap.keySet());
		} else {
			reflexes.addAll(species.getReflexList());
		}
		for ( String reflex : reflexes ) {
			if ( reflexMap.containsKey(reflex) ) {
				idT = ModelStructure.getElementId(reflexMap.get(reflex).getReflex()); 
				isId = idT.equals(id);
				if (isId) model+= EL + idT + EL;
				model += defineGeneric(reflexMap.get(reflex), isId? -1:level + 1);
				if (isId) model+= EL + idT + EL;
				
			}
		}
		
		for ( EStateLink link : species.getStateLinks() ) {
			String idT2 = ModelStructure.getElementId(link.getState()); 
			boolean isId2 = idT2.equals(id);
			if (isId2) model+= EL + idT2 + EL;
			model += defineGeneric(link, isId2? -1:level);
			if (isId2) model+= EL + idT2 + EL;
		}
		for ( ETaskLink link : species.getTaskLinks() ) {
			String idT2 = ModelStructure.getElementId(link.getTask()); 
			boolean isId2 = idT2.equals(id);
			if (isId2) model+= EL + idT2 + EL;
			model += defineGeneric(link, isId2? -1:level);
			if (isId2) model+= EL + idT2 + EL;
		}
		for ( EEquationLink link : species.getEquationLinks() ) {
			String idT2 = ModelStructure.getElementId(link.getEquation()); 
			boolean isId2 = idT2.equals(id);
			if (isId2) model+= EL + idT2 + EL;
			model += defineGeneric(link, isId2? -1:level);
			if (isId2) model+= EL + idT2 + EL;
		}
		for ( EPlanLink link : species.getPlanLinks() ) {
			String idT2 = ModelStructure.getElementId(link.getPlan()); 
			boolean isId2 = idT2.equals(id);
			if (isId2) model+= EL + idT2 + EL;
			model += defineGeneric(link, isId2? -1:level);
			if (isId2) model+= EL + idT2 + EL;
		}
		for ( ERuleLink link : species.getRuleLinks() ) {
			String idT2 = ModelStructure.getElementId(link.getRule()); 
			boolean isId2 = idT2.equals(id);
			if (isId2) model+= EL + idT2 + EL;
			model += defineGeneric(link, isId2? -1:level);
			if (isId2) model+= EL + idT2 + EL;
		}
		for ( EPerceiveLink link : species.getPerceiveLinks() ) {
			String idT2 = ModelStructure.getElementId(link.getPerceive()); 
			boolean isId2 = idT2.equals(id);
			if (isId2) model+= EL + idT2 + EL;
			model += defineGeneric(link, isId2? -1:level);
			if (isId2) model+= EL + idT2 + EL;
		}
		
		for ( EAspectLink link : species.getAspectLinks() ) {
			model += defineAspect(link, level + 1);
		}
		for ( ESubSpeciesLink link : species.getMicroSpeciesLinks() ) {
			model += defineSpecies(link.getMicro(), level + 1, id);
		}

		model += sp + "}" + EL;

		

		return model;
	}
	


	static String defineVariable(final EVariable var, final int level) {
		if ( var == null ) { return ""; }
		String varStr = "";
		for ( int i = 0; i < level; i++ ) {
			varStr += "\t";
		}
		if ( var.getType() == null || var.getType().equals("") ) {
			varStr += "var ";
		} else {
			varStr += var.getType() + " ";
		}
		varStr += var.getName();
		if ( var.getInit() != null && !var.getInit().equals("") ) {
			varStr += " <- " + var.getInit();
		}
		if ( var.getUpdate() != null && !var.getUpdate().equals("") ) {
			varStr += " update: " + var.getUpdate();
		}
		if ( var.getFunction() != null && !var.getFunction().equals("") ) {
			varStr += " -> {" + var.getFunction() + "}";
		}
		if ( var.getMin() != null && !var.getMin().equals("") ) {
			varStr += " min: " + var.getMin();
		}
		if ( var.getMax() != null && !var.getMax().equals("") ) {
			varStr += " max: " + var.getMax();
		}
		varStr += ";" + EL;
		return varStr;
	}

	static String defineAction(final EActionLink link, final int level) {
		if ( link == null || link.getAction() == null ) { return ""; }
		
		EAction action = link.getAction();
		String result = "";
		String sp = "";
		for ( int i = 0; i < level; i++ ) {
			sp += "\t";
		}
		
		String returnType =
			action.getReturnType() == null || action.getReturnType().isEmpty() ? "action" : action.getReturnType();
		String arguments = "";
		for ( EVariable var : action.getVariables() ) {
			arguments +=
				(arguments.isEmpty() ? "" : ", ") + var.getType() + " " + var.getName() +
					(var.getInit() == null || var.getInit().isEmpty() ? "" : " <- " + var.getInit());
		}
		result +=
			sp + returnType + " " + action.getName() + (arguments.isEmpty() ? "" : "(" + arguments + ")") + " {" + EL;
		String code = action.getGamlCode();
		if ( code != null && !code.isEmpty() ) {
			for ( String line : code.split(EL) ) {
				result += sp + (level == -1 ? "":"\t") + line + EL;
			}
		}
		result += sp + "}" + EL;
		
		return result;
	}
	

	static String defineInit(final ESpecies species, final int level) {
		if ( species == null ) { return ""; }
		String result = "";
		String code = species.getInit();
		String sp = "";
		for ( int i = 0; i < level; i++ ) {
			sp += "\t";
		}
		result += sp + "init {" + EL;
		if ( code != null && !code.isEmpty() ) {
			for ( String line : code.split(EL) ) {
				result += sp + (level == -1 ? "":"\t") + line + EL;
			}
		}
		result += sp + "}" + EL;
		return result;
	}

	static String defineGeneric(final EGamaLink link, final int level) {
		if ( link == null || link.getTarget() == null ) { return ""; }
		EGamaObject object = link.getTarget();
		String result = "";
		String sp = "";
		for ( int i = 0; i < level; i++ ) {
			sp += "\t";
		}
		String type = "";
		if (object instanceof EReflex) type = "reflex";
		else if (object instanceof EState)  type = "state";
		else if (object instanceof ETask)  type = "task";
		else if (object instanceof EEquation)  type = "equation";
		else if (object instanceof EPlan)  type = "plan";
		else if (object instanceof EPerceive)  type = "perceive";
		else if (object instanceof ERule)  type = "rule";
		result += type+" " + link.getTarget().getName();
		for (EFacet facet : object.getFacets()) {
			if ((facet.getValue().replace(" ", "")).isEmpty()) continue;
			result += " "+ facet.getName()+":" + facet.getValue();
		}
		String code = null;
		if (object instanceof EReflex) code = ((EReflex) object).getGamlCode();
		else if (object instanceof EState) code = ((EState) object).getGamlCode();
		else if (object instanceof EEquation) code = ((EEquation) object).getGamlCode();
		else if (object instanceof ETask) code = ((ETask) object).getGamlCode();
		else if (object instanceof EPlan) code = ((EPlan) object).getGamlCode();
		else if (object instanceof EPerceive) code = ((EPerceive) object).getGamlCode();
		result +=" {" + EL;
		if ( code != null && !code.isEmpty() ) {
			for ( String line : code.split(EL) ) {
				result += sp + (level == -1 ? "":"\t") + line + EL;
			}
		}
			
			result += sp + "}" + EL;
		return result;
	}
	
	

	static String defineAspect(final EAspectLink link, final int level) {
		if ( link == null || link.getAspect() == null ) { return ""; }
		String result = "";
		EAspect asp = link.getAspect();
		String sp = "";
		for ( int i = 0; i < level; i++ ) {
			sp += "\t";
		}
		result += sp + "aspect " + asp.getName() + " {" + EL;
		for ( ELayerAspect lay : asp.getLayers() ) {
			String code = sp + "\t" + "draw ";
			String val = lay.getShapeType();
			if ( val == null ) {
				continue;
			}
			if ( val.equals("polyline") || val.equals("polygon") ) {
				code += val + "(" + lay.getPoints() + ")";
			} else if ( val.equals("circle") || val.equals("sphere") ) {
				code += val + "(" + lay.getRadius() + ")";
			} else if ( val.equals("square") || val.equals("cube") || val.equals("pyramid") ) {
				code += val + "(" + lay.getSize() + ")";
			} else if ( val.equals("rectangle") || val.equals("hexagon") ) {
				code += val + "({" + lay.getWidth() + "," + lay.getHeigth() + "})";
			} else if ( val.equals("expression") ) {
				code += lay.getExpression();
			} else if ( val.equals("image") ) {
				code +=
					"file(\"" + lay.getPath() + "\")" +
						(lay.getImageSize() != null && !lay.getImageSize().isEmpty() ? "" : " size:" + lay.getSize());
			} else if ( val.equals("text") ) {
				code +=
					"\"" + lay.getText() + "\"" +
						(lay.getTextSize() != null && !lay.getTextSize().isEmpty() ? "" : " size:" + lay.getSize());
			}
			if ( lay.getIsColorCst() ) {
				code += " color: rgb(" + lay.getColorRBG().toString().replace("[", "").replace("]", "") + ")";
			} else if ( lay.getColor() != null && !lay.getColor().isEmpty() ) {
				code += " color: " + lay.getColor();
			}
			if ( lay.getEmpty() != null && !lay.getEmpty().isEmpty() && !lay.getEmpty().equals("false") ) {
				code += " empty: " + lay.getEmpty();
			}
			if ( lay.getRotate() != null && !lay.getRotate().isEmpty() && !lay.getRotate().equals("0.0") ) {
				code += " rotate: " + lay.getRotate();
			}
			if ( lay.getAt() != null && !lay.getAt().isEmpty() ) {
				code += " at: " + lay.getAt();
			}
			if ( lay.getDepth() != null && !lay.getDepth().isEmpty() && !lay.getDepth().equals("0.0") ) {
				code += " depth: " + lay.getDepth();
			}
			if ( lay.getTexture() != null && !lay.getTexture().isEmpty() && !lay.getTexture().equals("[]") ) {
				code += " texture: " + lay.getTexture();
			}
			result += code + ";" + EL;
		}
		result += EL + sp + "}" + EL;
		return result;
	}

	static String defineExperiment(final EExperiment exp) {
		String model = "";
		if ( exp == null ) { return model; }
		if ( exp instanceof EBatchExperiment ) {
			model += EL + EL + "experiment " + exp.getName() + " type:batch {}";
		} else {
			model += EL + EL + "experiment " + exp.getName() + " type:gui {" + EL;
			for ( EParameter link : exp.getParameters() ) {
				model += defineParameter(link);
			}

			model += "\toutput{";
			for ( EMonitor mon : exp.getMonitors() ) {
				model += defineMonitor(mon);
			}
			for ( EDisplayLink link : exp.getDisplayLinks() ) {
				model += defineDisplay(link);
			}
			model += EL + "\t}" + EL + "}" + EL;
		}
		return model;

	}

	static String defineParameter(final EParameter par) {
		if ( par == null ) { return ""; }
		String parStr = "\tparameter";
		parStr += "\"" + par.getName() + "\"";
		parStr += " var:" + par.getVariable();
		if ( par.getCategory() != null && !par.getCategory().isEmpty() ) {
			parStr += " category: \"" + par.getCategory() + "\"";
		}
		if ( par.getAmong() != null && !par.getAmong().isEmpty() ) {
			parStr += " among:" + par.getAmong();
		}
		if ( par.getInit() != null && !par.getInit().isEmpty() ) {
			parStr += " <-" + par.getInit();
		}
		if ( par.getMin() != null && !par.getMin().isEmpty() ) {
			parStr += " min:" + par.getMin();
		}
		if ( par.getMax() != null && !par.getMax().isEmpty() ) {
			parStr += " max:" + par.getMax();
		}
		if ( par.getStep() != null && !par.getStep().isEmpty() ) {
			parStr += " step:" + par.getStep();
		}
		parStr += ";" + EL;
		return parStr;
	}

	static String defineMonitor(final EMonitor mon) {
		if ( mon == null ) { return ""; }
		String parStr = "\t\tmonitor ";
		parStr += "\"" + mon.getName() + "\"";
		if ( mon.getValue() != null && !mon.getValue().isEmpty() ) {
			parStr += " value:" + mon.getValue();
		}
		parStr += ";" + EL;
		return parStr;
	}

	static String defineDisplay(final EDisplayLink link) {
		if ( link == null || link.getDisplay() == null ) { return ""; }
		EDisplay disp = link.getDisplay();
		String model = EL + "\t\t";
		model += "display " + disp.getName();
		for (EFacet facet : disp.getFacets()) {
			if ((facet.getValue().replace(" ", "")).isEmpty()) continue;
			model += " "+ facet.getName()+":" + facet.getValue();
		}

		model += " {";
		for ( ELayer lay : disp.getLayers() ) {
			if ( lay.getType() == null ) {
				continue;
			}
			model += "\n\t\t\t";
			if ( lay.getType().equals("species") ) {
				model +=
					lay.getType() +
						" " +
						lay.getSpecies() +
						(lay.getAspect() == null || lay.getAspect().isEmpty() || lay.getAspect().equals("default") ? ""
							: " aspect: " + lay.getAspect());
			} else if ( lay.getType().equals("grid") ) {
				model += lay.getType() + " " + lay.getGrid();
				if ( lay.getIsColorCst() == null || lay.getIsColorCst() ) {
					if ( lay.getColorRBG().size() == 3 ) {
						if ( lay.isShowLines() ) {
							model +=
								" lines:rgb(" + lay.getColorRBG().get(0) + "," + lay.getColorRBG().get(1) + "," +
									lay.getColorRBG().get(2) + ")";
						}
					}
				} else {
					if ( lay.getColor() != null && !lay.getColor().equals("rgb(255,255,255)") &&
						!lay.getColor().isEmpty() ) {
						model += " lines:" + lay.getColor();
					}
				}
			} else if ( lay.getType().equals("agents") ) {
				model +=
					lay.getType() + " \"" + lay.getName() + "\" value:" + lay.getAgents() +
						(lay.getAspect() == null || lay.getAspect().isEmpty() ? "" : " aspect: " + lay.getAspect());
			} else if ( lay.getType().equals("image") ) {
				model +=
					lay.getType() + "\"" + lay.getFile() + "\"" +
						(lay.getSize().isEmpty() ? "" : " size: " + lay.getSize());
				if ( lay.getIsColorCst() == null || lay.getIsColorCst() ) {
					if ( lay.getColorRBG().size() == 3 ) {
						if ( !lay.getColorRBG().get(0).equals("255") || !lay.getColorRBG().get(1).equals("255") ||
							!lay.getColorRBG().get(2).equals("255") ) {
							model +=
								" color:rgb(" + lay.getColorRBG().get(0) + "," + lay.getColorRBG().get(1) + "," +
									lay.getColorRBG().get(2) + ")";
						}
					}
				} else {
					if ( lay.getColor() != null && !lay.getColor().equals("rgb(255,255,255)") &&
						!lay.getColor().isEmpty() ) {
						model += " color:" + lay.getColor();
					}
				}
			} else if ( lay.getType().equals("text") ) {
				model +=
					lay.getType() + "\"" + lay.getText() + "\"" +
						(lay.getSize().isEmpty() ? "" : " size: " + lay.getSize());
				if ( lay.getIsColorCst() == null || lay.getIsColorCst() ) {
					if ( lay.getColorRBG().size() == 3 ) {
						if ( !lay.getColorRBG().get(0).equals("255") || !lay.getColorRBG().get(1).equals("255") ||
							!lay.getColorRBG().get(2).equals("255") ) {
							model +=
								" color:rgb(" + lay.getColorRBG().get(0) + "," + lay.getColorRBG().get(1) + "," +
									lay.getColorRBG().get(2) + ")";
						}
					}
				} else {
					if ( lay.getColor() != null && !lay.getColor().equals("rgb(255,255,255)") &&
						!lay.getColor().isEmpty() ) {
						model += " color:" + lay.getColor();
					}
				}
			} else if ( lay.getType().equals("chart") ) {
				String background = "";
				if ( lay.getIsColorCst() == null || lay.getIsColorCst() ) {
					if ( lay.getColorRBG().size() == 3 &&
						(!lay.getColorRBG().get(0).equals("255") || !lay.getColorRBG().get(1).equals("255") || !lay
							.getColorRBG().get(2).equals("255")) ) {
						background =
							" background:rgb(" + lay.getColorRBG().get(0) + "," + lay.getColorRBG().get(1) + "," +
								lay.getColorRBG().get(2) + ")";
					}
				} else {
					if ( lay.getColor() != null && !lay.getColor().equals("rgb(255,255,255)") &&
						!lay.getColor().isEmpty() ) {
						background = " background:" + lay.getColor();
					}
				}
				model += lay.getType() + " \"" + lay.getName() + "\" type:" + lay.getChart_type() + background;
			}
			
			for (EFacet facet : lay.getFacets()) {
				if ((facet.getValue().replace(" ", "")).isEmpty()) continue;
				model += " "+ facet.getName()+":" + facet.getValue();
			}
			if ( lay.getType().equals("chart") ) {
				model +=  "{" + EL;
				if ( lay.getChartlayers() != null && !lay.getChartlayers().isEmpty() ) {
					for ( EChartLayer cl : lay.getChartlayers() ) {
						model +=
							"\t\t\t\tdata \"" + cl.getName() + "\" style:" + cl.getStyle() + " value:" +
								(cl.getValue() == null || cl.getValue().isEmpty() ? "0.0" : cl.getValue()) +
								(cl.getColor() == null || cl.getColor().isEmpty() ? "" : " color:" + cl.getColor()) +
								";" + EL;
					}
				}
				model += "\t\t\t}" + EL;
			} else {
				model += ";" + EL;
			}
		}

		model += "\t\t}";
		return model;
	}

	
	public static String generateModel(final IFeatureProvider fp, final Diagram diagram, String id) {
		String model = "";
		List<Shape> contents = diagram.getChildren();
		if ( contents != null ) {
			EWorldAgent worldAgent = null;
			for ( Shape obj : contents ) {
				Object bo = fp.getBusinessObjectForPictogramElement(obj);
				if ( bo instanceof EWorldAgent ) {
					worldAgent = (EWorldAgent) bo;
					break;

				}
			}
			if (worldAgent == null) return "";
			String modelName = diagram.getName();
			if ( !Character.isLetter(modelName.charAt(0)) ) {
				modelName = "_" + modelName;
			}
			model = "model " + modelName + EL + EL + "global";
			
			if ( worldAgent.getSkills() != null && !worldAgent.getSkills().isEmpty() ) {
				model += " skills:" + worldAgent.getSkills();
			}
			for (EFacet facet : worldAgent.getFacets()) {
				if ((facet.getValue().replace(" ", "")).isEmpty()) continue;
				model += " "+ facet.getName()+":" + facet.getValue();
			}
			
			model += " {" + EL;
			int level = 1;
			for ( EVariable var : worldAgent.getVariables() ) {
				model += defineVariable(var, level);
			}
			
			

			for ( EActionLink link : worldAgent.getActionLinks() ) {
				String idA = ModelStructure.getElementId(link.getAction()); 
				boolean isId = idA.equals(id);
				if (isId) model+= EL + idA + EL;
				model += defineAction(link, isId? -1:level);
				if (isId) model+= EL + idA + EL;
			}
			Map<String, EReflexLink> reflexMap = new Hashtable<String, EReflexLink>();
			for ( EReflexLink link : worldAgent.getReflexLinks() ) {
				if ( link.getTarget() == null ) {
					continue;
				}
				reflexMap.put(link.getTarget().getName(), link);
			}
			List<String> reflexes = new ArrayList<String>();
			if ( worldAgent.getReflexList().isEmpty() && !reflexMap.isEmpty() ) {
				reflexes.addAll(reflexMap.keySet());
			} else {
				reflexes.addAll(worldAgent.getReflexList());
			}
			for ( String reflex : reflexes ) {
				if ( reflexMap.containsKey(reflex) ) {
					String idT = ModelStructure.getElementId(reflexMap.get(reflex).getReflex()); 
					boolean isId = idT.equals(id);
					if (isId) model+= EL + idT + EL;
					model += defineGeneric(reflexMap.get(reflex), isId? -1:level);
					if (isId) model+= EL + idT + EL;
				}
			}
			
			for ( EStateLink link : worldAgent.getStateLinks() ) {
				String idT = ModelStructure.getElementId(link.getState()); 
				boolean isId = idT.equals(id);
				if (isId) model+= EL + idT + EL;
				model += defineGeneric(link, isId? -1:level);
				if (isId) model+= EL + idT + EL;
				
			}
			for ( ETaskLink link : worldAgent.getTaskLinks() ) {
				String idT = ModelStructure.getElementId(link.getTask()); 
				boolean isId = idT.equals(id);
				if (isId) model+= EL + idT + EL;
				model += defineGeneric(link, isId? -1:level);
				if (isId) model+= EL + idT + EL;
			}
			for ( EEquationLink link : worldAgent.getEquationLinks() ) {
				String idT = ModelStructure.getElementId(link.getEquation()); 
				boolean isId = idT.equals(id);
				if (isId) model+= EL + idT + EL;
				model += defineGeneric(link, isId? -1:level);
				if (isId) model+= EL + idT + EL;
			}
			for ( EPlanLink link : worldAgent.getPlanLinks() ) {
				String idT = ModelStructure.getElementId(link.getPlan()); 
				boolean isId = idT.equals(id);
				if (isId) model+= EL + idT + EL;
				model += defineGeneric(link, isId? -1:level);
				if (isId) model+= EL + idT + EL;
			}
			for ( ERuleLink link : worldAgent.getRuleLinks() ) {
				String idT = ModelStructure.getElementId(link.getRule()); 
				boolean isId = idT.equals(id);
				if (isId) model+= EL + idT + EL;
				model += defineGeneric(link, isId? -1:level);
				if (isId) model+= EL + idT + EL;
			}
			for ( EPerceiveLink link : worldAgent.getPerceiveLinks() ) {
				String idT = ModelStructure.getElementId(link.getPerceive()); 
				boolean isId = idT.equals(id);
				if (isId) model+= EL + idT + EL;
				model += defineGeneric(link, isId? -1:level);
				if (isId) model+= EL + idT + EL;
			}
			
			for ( EAspectLink link : worldAgent.getAspectLinks() ) {
				model += defineAspect(link, level);
			}
			String idT = ModelStructure.getElementId(worldAgent); 
			boolean isId = idT.equals(id);
			if (isId) model+= EL + idT + EL;
			model += defineInit(worldAgent, isId? -1:1);
			if (isId) model+= EL + idT + EL;
			
			model += "}";
			model += EL;
			for ( ESubSpeciesLink link : worldAgent.getMicroSpeciesLinks() ) {
				model += defineSpecies(link.getMicro(), 0, id);
			}

			model += EL;

			for ( EExperimentLink link : worldAgent.getExperimentLinks() ) {
				model += defineExperiment(link.getExperiment());
			}

		}
		return model;
	}
}
