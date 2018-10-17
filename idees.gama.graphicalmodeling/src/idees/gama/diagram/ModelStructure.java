package idees.gama.diagram;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import gama.EAction;
import gama.EAspect;
import gama.EDisplay;
import gama.EEquation;
import gama.EPerceive;
import gama.EPlan;
import gama.EReflex;
import gama.ERule;
import gama.ESpecies;
import gama.EState;
import gama.ETask;
import idees.gama.features.modelgeneration.ModelGenerator;

public class ModelStructure {
	Diagram diagram;
	final IFeatureProvider fp;
	String prefix;
	String text;
	String suffix;
	boolean inModel;

	public ModelStructure(Diagram diagram, IFeatureProvider fp) {
		this.diagram = diagram;
		this.fp = fp;
	}

	
	public void writeModelWithoutElement(EObject element){
		prefix = "";
		text = "";
		suffix = "";
		String id = getElementId(element);
		inModel = id != null;
		String model = ModelGenerator.generateModel(fp, diagram, id);
		//String model = ModelGenerator.generateModel(fp, diagram, id);
		if (inModel) {
			String[] mds = model.split(id);
			if (mds.length < 3) {
				inModel = false;
				text = model;
			}else {
				text = mds[1];
				int str = text.indexOf("{");
				if (str == -1) {
					prefix = mds[0];
					text = mds[1];
					suffix = mds[2];
					return;
				}
				prefix = mds[0] + text.substring(0, str+1) +"\n//generated";
				int end = text.lastIndexOf("}");
				if (end >= text.length()) end = text.length() - 1;
				suffix = (end < 0) ? "" :text.substring(end) + mds[2];
				text = str + 2 >= end ? "" :text.substring(str+2, end);
				
			}
		} else 
			text = model;
			while (text.indexOf("\n") == 0) {
				text = text.replaceFirst("\n", "");
			}
	}

	public static String getElementId(EObject newElement) {
		if (newElement instanceof EAction) {
			EAction action = (EAction) newElement;
			return "action:"+ action.getActionLinks().get(0).getSpecies().getName() + ":"+ action.getName(); 
		}else if (newElement instanceof EReflex) {
			EReflex reflex = (EReflex) newElement;
			return "reflex:"+ reflex.getReflexLinks().get(0).getSpecies().getName() + ":"+ reflex.getName(); 
		}else if (newElement instanceof ESpecies) {
			ESpecies species = (ESpecies) newElement;
			return "species:"+ species.getName(); 
		}else if (newElement instanceof EEquation) {
			EEquation equation = (EEquation) newElement;
			return "equation:"+ equation.getEquationLinks().get(0).getSpecies().getName() + ":"+ equation.getName(); 
		}else if (newElement instanceof EState) {
			EState reflex = (EState) newElement;
			return "state:"+ reflex.getStateLinks().get(0).getSpecies().getName() + ":"+ reflex.getName(); 
		}else if (newElement instanceof ETask) {
			ETask reflex = (ETask) newElement;
			return "task:"+ reflex.getTaskLinks().get(0).getSpecies().getName() + ":"+ reflex.getName(); 
		}else if (newElement instanceof EPlan) {
			EPlan reflex = (EPlan) newElement;
			return "plan:"+ reflex.getPlanLinks().get(0).getSpecies().getName() + ":"+ reflex.getName(); 
		}else if (newElement instanceof EPerceive) {
			EPerceive reflex = (EPerceive) newElement;
			return "perceive:"+ reflex.getPerceiveLinks().get(0).getSpecies().getName() + ":"+ reflex.getName(); 
		}else if (newElement instanceof ERule) {
			ERule reflex = (ERule) newElement;
			return "rule:"+ reflex.getRuleLinks().get(0).getSpecies().getName() + ":"+ reflex.getName(); 
		}else if (newElement instanceof EAspect) {
			EAspect aspect = (EAspect) newElement;
			return "aspect:"+ aspect.getAspectLinks().get(0).getSpecies().getName() + ":"+ aspect.getName(); 
		}else if (newElement instanceof EDisplay) {
			EDisplay display = (EDisplay) newElement;
			return "display:"+ display.getDisplayLink().getExperiment().getName() + ":"+ display.getName(); 
		}
		return "";
	}


	public String getPrefix() {
		return prefix;
	}


	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	public String getSuffix() {
		return suffix;
	}


	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}


	public boolean isInModel() {
		return inModel;
	}


	public void setInModel(boolean inModel) {
		this.inModel = inModel;
	}	
	
	
}
