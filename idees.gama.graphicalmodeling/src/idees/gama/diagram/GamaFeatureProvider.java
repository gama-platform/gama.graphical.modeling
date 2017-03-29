package idees.gama.diagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IDeleteFeature;
import org.eclipse.graphiti.features.IFeature;
import org.eclipse.graphiti.features.ILayoutFeature;
import org.eclipse.graphiti.features.IRemoveFeature;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.context.IPictogramElementContext;
import org.eclipse.graphiti.features.context.IRemoveContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.features.context.impl.CreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.CreateContext;
import org.eclipse.graphiti.features.context.impl.UpdateContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.internal.datatypes.impl.LocationImpl;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.AnchorContainer;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;

import gama.EAction;
import gama.EActionLink;
import gama.EAspect;
import gama.EAspectLink;
import gama.EBatchExperiment;
import gama.EDisplay;
import gama.EDisplayLink;
import gama.EEquation;
import gama.EEquationLink;
import gama.EExperiment;
import gama.EExperimentLink;
import gama.EFacet;
import gama.EGUIExperiment;
import gama.EGamaObject;
import gama.EGrid;
import gama.EInheritLink;
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
import idees.gama.features.add.AddActionFeature;
import idees.gama.features.add.AddActionLinkFeature;
import idees.gama.features.add.AddAspectFeature;
import idees.gama.features.add.AddAspectLinkFeature;
import idees.gama.features.add.AddBatchExperimentFeature;
import idees.gama.features.add.AddDisplayFeature;
import idees.gama.features.add.AddDisplayLinkFeature;
import idees.gama.features.add.AddEExperimentLinkFeature;
import idees.gama.features.add.AddEquationFeature;
import idees.gama.features.add.AddEquationLinkFeature;
import idees.gama.features.add.AddGridFeature;
import idees.gama.features.add.AddGuiExperimentFeature;
import idees.gama.features.add.AddInheritingLinkFeature;
import idees.gama.features.add.AddPerceiveFeature;
import idees.gama.features.add.AddPerceiveLinkFeature;
import idees.gama.features.add.AddPlanFeature;
import idees.gama.features.add.AddPlanLinkFeature;
import idees.gama.features.add.AddReflexFeature;
import idees.gama.features.add.AddReflexLinkFeature;
import idees.gama.features.add.AddRuleFeature;
import idees.gama.features.add.AddRuleLinkFeature;
import idees.gama.features.add.AddSpeciesFeature;
import idees.gama.features.add.AddStateFeature;
import idees.gama.features.add.AddStateLinkFeature;
import idees.gama.features.add.AddSubSpecieLinkFeature;
import idees.gama.features.add.AddTaskFeature;
import idees.gama.features.add.AddTaskLinkFeature;
import idees.gama.features.add.AddWorldFeature;
import idees.gama.features.create.CreateActionLinkFeature;
import idees.gama.features.create.CreateAspectLinkFeature;
import idees.gama.features.create.CreateBatchExperimentLinkFeature;
import idees.gama.features.create.CreateDisplayLinkFeature;
import idees.gama.features.create.CreateEquationLinkFeature;
import idees.gama.features.create.CreateGuiExperimentLinkFeature;
import idees.gama.features.create.CreateInheritingLinkFeature;
import idees.gama.features.create.CreatePerceiveLinkFeature;
import idees.gama.features.create.CreatePlanLinkFeature;
import idees.gama.features.create.CreateReflexLinkFeature;
import idees.gama.features.create.CreateRuleLinkFeature;
import idees.gama.features.create.CreateStateLinkFeature;
import idees.gama.features.create.CreateSubGridLinkFeature;
import idees.gama.features.create.CreateSubSpeciesLinkFeature;
import idees.gama.features.create.CreateTaskLinkFeature;
import idees.gama.features.layout.LayoutCommonFeature;
import idees.gama.features.layout.LayoutDiagramFeature;
import idees.gama.features.layout.LayoutEExperimentFeature;
import idees.gama.features.layout.LayoutESpeciesFeature;
import idees.gama.features.modelgeneration.ModelGenerationFeature;
import idees.gama.features.modelgeneration.ModelGenerator;
import idees.gama.features.others.ChangeColorEGamaObjectFeature;
import idees.gama.features.others.CustomDeleteFeature;
import idees.gama.features.others.EmptyRemoveFeature;
import idees.gama.features.others.UpdateEGamaObjectFeature;
import msi.gama.common.interfaces.IKeyword;
import msi.gama.kernel.experiment.IExperimentPlan;
import msi.gama.kernel.model.IModel;
import msi.gama.outputs.IOutput;
import msi.gama.outputs.LayeredDisplayOutput;
import msi.gama.outputs.SimulationOutputManager;
import msi.gaml.architecture.finite_state_machine.FsmStateStatement;
import msi.gaml.architecture.reflex.ReflexStatement;
import msi.gaml.architecture.simplebdi.PerceiveStatement;
import msi.gaml.architecture.simplebdi.RuleStatement;
import msi.gaml.architecture.simplebdi.SimpleBdiPlanStatement;
import msi.gaml.architecture.weighted_tasks.WeightedTaskStatement;
import msi.gaml.compilation.AbstractGamlAdditions;
import msi.gaml.compilation.ISymbol;
import msi.gaml.compilation.kernel.GamaSkillRegistry;
import msi.gaml.descriptions.IDescription;
import msi.gaml.descriptions.IDescription.FacetVisitor;
import msi.gaml.descriptions.IExpressionDescription;
import msi.gaml.descriptions.SpeciesDescription;
import msi.gaml.descriptions.SymbolProto;
import msi.gaml.factories.DescriptionFactory;
import msi.gaml.species.ISpecies;
import msi.gaml.statements.ActionStatement;
import msi.gaml.statements.AspectStatement;
import msi.gaml.statements.IExecutable;
import msi.gaml.statements.IStatement;
import msi.gaml.variables.IVariable;
import ummisco.gaml.extensions.maths.ode.statements.SystemOfEquationsStatement;

public class GamaFeatureProvider extends DefaultFeatureProvider {

	private String typeOfModel;
	private IModel gamaModel;
	private final GamaFeatureProvider fp;
	private final List<String> built_in_species = Arrays
			.asList();/*
						 * "osm_node", "osm_building", "osm_road", "graph_edge",
						 * "graph_node", "AgentDB", "Physical3DWorld",
						 * "cluster_builder", "experimentator", "agent",
						 * "multicriteria_analyzer", "base_node", "base_edge",
						 * "world", "node", "edge");
						 */
	private final List<String> built_in_variables = Arrays.asList("name", "peers", "host", "members", "agents",
			"rng_usage", "starting_date", "current_date", "paused", "rng", "seed", "average_duration", "total_duration",
			"duration", "time", "cycle", "machine_time");
	private final List<String> built_in_actions;

	public GamaFeatureProvider(final IDiagramTypeProvider dtp) {
		super(dtp);
		fp = this;

		built_in_actions = new ArrayList<String>();
		for (final IDescription desc : AbstractGamlAdditions.getAllActions()) {
			built_in_actions.add(desc.getName());
		}
	}

	@Override
	public IAddFeature getAddFeature(final IAddContext context) {
		if (context.getNewObject() instanceof EWorldAgent) {
			return new AddWorldFeature(this);
		} else if (context.getNewObject() instanceof EAction) {
			return new AddActionFeature(this);
		} else if (context.getNewObject() instanceof EReflex) {
			return new AddReflexFeature(this);
		} else if (context.getNewObject() instanceof EPlan) {
			return new AddPlanFeature(this);
		} else if (context.getNewObject() instanceof ETask) {
			return new AddTaskFeature(this);
		} else if (context.getNewObject() instanceof EState) {
			return new AddStateFeature(this);
		} else if (context.getNewObject() instanceof ERule) {
			return new AddRuleFeature(this);
		} else if (context.getNewObject() instanceof EEquation) {
			return new AddEquationFeature(this);
		} else if (context.getNewObject() instanceof EPerceive) {
			return new AddPerceiveFeature(this);
		} else if (context.getNewObject() instanceof EAspect) {
			return new AddAspectFeature(this);
		} else if (context.getNewObject() instanceof EGUIExperiment) {
			return new AddGuiExperimentFeature(this);
		} else if (context.getNewObject() instanceof EBatchExperiment) {
			return new AddBatchExperimentFeature(this);
		} else if (context.getNewObject() instanceof EDisplay) {
			return new AddDisplayFeature(this);
		} else if (context.getNewObject() instanceof ESubSpeciesLink) {
			return new AddSubSpecieLinkFeature(this);
		} else if (context.getNewObject() instanceof EActionLink) {
			return new AddActionLinkFeature(this);
		} else if (context.getNewObject() instanceof EReflexLink) {
			return new AddReflexLinkFeature(this);
		} else if (context.getNewObject() instanceof EEquationLink) {
			return new AddEquationLinkFeature(this);
		} else if (context.getNewObject() instanceof EPlanLink) {
			return new AddPlanLinkFeature(this);
		} else if (context.getNewObject() instanceof EStateLink) {
			return new AddStateLinkFeature(this);
		} else if (context.getNewObject() instanceof ETaskLink) {
			return new AddTaskLinkFeature(this);
		} else if (context.getNewObject() instanceof ERuleLink) {
			return new AddRuleLinkFeature(this);
		} else if (context.getNewObject() instanceof EPerceiveLink) {
			return new AddPerceiveLinkFeature(this);
		} else if (context.getNewObject() instanceof EAspectLink) {
			return new AddAspectLinkFeature(this);
		} else if (context.getNewObject() instanceof EDisplayLink) {
			return new AddDisplayLinkFeature(this);
		} else if (context.getNewObject() instanceof EExperimentLink) {
			return new AddEExperimentLinkFeature(this);
		} else if (context.getNewObject() instanceof EInheritLink) {
			return new AddInheritingLinkFeature(this);
		} else if (context.getNewObject() instanceof EGrid) {
			return new AddGridFeature(this);
		} else if (context.getNewObject() instanceof ESpecies) {
			return new AddSpeciesFeature(this);
		}
		return super.getAddFeature(context);
	}

	@Override
	public ICreateFeature[] getCreateFeatures() {
		// init();
		return new ICreateFeature[] {};

	}

	public void init() {
		final Diagram diagram = getDiagramTypeProvider().getDiagram();
		if (diagram.getChildren().isEmpty()) {
			final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(diagram);
			domain.getCommandStack().execute(new RecordingCommand(domain) {

				@Override
				public void doExecute() {
					final EWorldAgent newClass = gama.GamaFactory.eINSTANCE.createEWorldAgent();

					diagram.eResource().getContents().add(newClass);
					newClass.setName("world");

					final CreateContext ac = new CreateContext();
					ac.setLocation(100, 50);

					ac.setSize(0, 0);
					ac.setTargetContainer(diagram);
					final GamaDiagramEditor diagramEditor = (GamaDiagramEditor) getDiagramTypeProvider()
							.getDiagramBehavior().getDiagramContainer();
					diagramEditor.addEOject(newClass);

					final PictogramElement worldPE = addIfPossible(new AddContext(ac, newClass));
					if ("skeleton".equals(typeOfModel)) {
						initSkeleton(newClass, diagram);
					} else if ("custom".equals(typeOfModel)) {
						initCustom(newClass, worldPE, diagram);
						LayoutDiagramFeature.execute(diagram);
						final IUpdateContext context = new UpdateContext(diagram);
						final IUpdateFeature dfp = fp.getUpdateFeature(context);
						dfp.execute(context);

					} else {
						initSimple(newClass, diagram);
					}
					ModelGenerator.modelValidation(fp, diagram);
					diagramEditor.updateEObjectErrors();

				}
			});
		}
	}

	@SuppressWarnings("unused")
	public void initSimple(final EWorldAgent world, final Diagram diagram) {
		final CreateGuiExperimentLinkFeature cXp = new CreateGuiExperimentLinkFeature(this);
		final CreateDisplayLinkFeature cDisp = new CreateDisplayLinkFeature(this);
		final PictogramElement worldPe = getPictogramElementForBusinessObject(world);

		final CreateConnectionContext context = new CreateConnectionContext();
		context.setSourcePictogramElement(worldPe);
		context.setSourceAnchor(Graphiti.getPeService().getChopboxAnchor((AnchorContainer) worldPe));
		// context.setSourceLocation(new LocationImpl(100,50));
		context.setTargetLocation(new LocationImpl(600, 50));
		final Connection link = cXp.create(context, false);
		final AddConnectionContext cont = new AddConnectionContext(null, null);
		cont.setNewObject(link);
		addIfPossible(cont);
	}

	public void initSkeleton(final EWorldAgent world, final Diagram diagram) {
		final CreateGuiExperimentLinkFeature cXp = new CreateGuiExperimentLinkFeature(this);
		final CreateDisplayLinkFeature cDisp = new CreateDisplayLinkFeature(this);
		final PictogramElement worldPe = getPictogramElementForBusinessObject(world);

		final CreateConnectionContext context = new CreateConnectionContext();
		context.setSourcePictogramElement(worldPe);
		context.setSourceAnchor(Graphiti.getPeService().getChopboxAnchor((AnchorContainer) worldPe));
		// context.setSourceLocation(new LocationImpl(100,50));
		context.setTargetLocation(new LocationImpl(600, 50));
		final Connection link = cXp.create(context, false);
		final AddConnectionContext cont = new AddConnectionContext(null, null);
		cont.setNewObject(link);
		addIfPossible(cont);

		final CreateConnectionContext contextDisp = new CreateConnectionContext();
		PictogramElement xp = null;
		final List<Shape> contents = diagram.getChildren();
		for (final Shape obj : contents) {
			final Object bo = getBusinessObjectForPictogramElement(obj);
			if (bo instanceof EExperiment) {
				xp = obj;
				break;
			}

		}
		contextDisp.setSourcePictogramElement(xp);
		contextDisp.setSourceAnchor(Graphiti.getPeService().getChopboxAnchor((AnchorContainer) xp));
		// contextDisp.setSourceLocation(new LocationImpl(500,50));
		contextDisp.setTargetLocation(new LocationImpl(800, 50));
		final Connection linkDisp = cDisp.create(contextDisp, false);
		final AddConnectionContext contDisp = new AddConnectionContext(null, null);
		contDisp.setNewObject(linkDisp);
		addIfPossible(contDisp);
	}

	public void addVariable(final IVariable var, final ESpecies target, final List<String> listSpecies) {
		if (built_in_variables.contains(var.getName()) || built_in_species.contains(var.getName())
				|| listSpecies.contains(var.getName())) {
			return;
		}

		final EVariable eVar = gama.GamaFactory.eINSTANCE.createEVariable();
		eVar.setType(var.getType().toString());
		eVar.setName(var.getName());
		if (var.hasFacet(IKeyword.INIT)) {
			eVar.setInit(var.getFacet(IKeyword.INIT).serialize(false));
		}
		if (var.hasFacet(IKeyword.UPDATE)) {
			eVar.setUpdate(var.getFacet(IKeyword.UPDATE).serialize(false));
		}
		if (var.hasFacet(IKeyword.MIN)) {
			eVar.setMin(var.getFacet(IKeyword.MIN).serialize(false));
		}
		if (var.hasFacet(IKeyword.MAX)) {
			eVar.setMax(var.getFacet(IKeyword.MAX).serialize(false));
		}
		if (var.hasFacet(IKeyword.FUNCTION)) {
			eVar.setFunction(var.getFacet(IKeyword.FUNCTION).serialize(false));
		}
		if (var.hasFacet(IKeyword.VALUE)) {
			eVar.setFunction(var.getFacet(IKeyword.VALUE).serialize(false));
		}
		target.getVariables().add(eVar);
	}

	public ESpecies createMicroSpecies(final ESpecies source, final PictogramElement sourceE, final ISpecies species,
			final Diagram diagram, final List<String> listSpecies) {
		final ESpecies target = species.isGrid() ? gama.GamaFactory.eINSTANCE.createEGrid()
				: gama.GamaFactory.eINSTANCE.createESpecies();
		diagram.eResource().getContents().add(target);

		final Iterable<String> skills = ((SpeciesDescription) species.getDescription()).getSkillsNames();
		for (final String sk : skills) {
			if (!"reflex".equals(sk) && !"grid".equals(sk)
					&& !GamaSkillRegistry.INSTANCE.getArchitectureNames().contains(sk))
				target.getSkills().add(sk.toString());
		}
		target.setName(species.getName());

		for (final Object facetN : getFacets(species)) {
			if (!(facetN instanceof String))
				continue;
			final String name = (String) facetN;
			final SymbolProto proto = DescriptionFactory.getStatementProto("species");
			if (proto.getFacet(name).internal)
				continue;
			final EFacet facet = gama.GamaFactory.eINSTANCE.createEFacet();
			facet.setName(name);
			facet.setOwner(target);
			target.getFacets().add(facet);
			facet.setValue(species.getFacet(name).serialize(false));
		}

		for (final IVariable var : species.getVars()) {
			if (var.getName().equals("shape") && !var.getDescription().hasFacet("init")) continue;
			if (var.getName().equals("location") && !var.getDescription().hasFacet("init")) continue;
			if (var.getName().equals("color") && !var.getDescription().hasFacet("init")) continue;
			
			addVariable(var, target, listSpecies);
		}

		final CreateContext ac = new CreateContext();

		ac.setLocation(0, 0);
		ac.setSize(0, 0);
		ac.setTargetContainer(diagram);

		final PictogramElement targetE = addIfPossible(new AddContext(ac, target));

		final ESubSpeciesLink eReference = gama.GamaFactory.eINSTANCE.createESubSpeciesLink();
		diagram.eResource().getContents().add(eReference);

		// add connection for business object
		final AddConnectionContext addContext = new AddConnectionContext(getAnchor(sourceE), getAnchor(targetE));
		addContext.setNewObject(eReference);
		addIfPossible(addContext);
		eReference.setMacro(source);
		eReference.setMicro(target);
		eReference.setSource(source);
		eReference.setTarget(target);

		source.getMicroSpeciesLinks().add(eReference);
		target.getMacroSpeciesLinks().add(eReference);
		final GamaDiagramEditor diagramEditor = (GamaDiagramEditor) getDiagramTypeProvider().getDiagramBehavior()
				.getDiagramContainer();
		diagramEditor.addEOject(target);

		for (final ActionStatement action : species.getActions()) {
			if (!built_in_actions.contains(action.getName())) {
				createAction(target, targetE, action, diagram);
			}
		}
		for (final IStatement stat : species.getBehaviors()) {
			if (stat instanceof ReflexStatement) {
				if (stat.getName() != null && !stat.getName().isEmpty()
						&& !stat.getName().startsWith("_internal_init")) {
					createReflex(target, targetE, (ReflexStatement) stat, diagram);
				} else {
					String gmlCode = "";
					final ReflexStatement rs = (ReflexStatement) stat;
					if (rs.getCommands() != null) {
						for (final IStatement st : rs.getCommands()) {
							if (st == null) {
								continue;
							}
							gmlCode += st.serialize(false);
						}
					}
					target.setInit(gmlCode);
				}
			} else if (stat instanceof FsmStateStatement) {
				createState(target, targetE, (FsmStateStatement) stat, diagram);
			} else if (stat instanceof WeightedTaskStatement) {
				createTask(target, targetE, (WeightedTaskStatement) stat, diagram);
			} else if (stat instanceof SimpleBdiPlanStatement) {
				createPlan(target, targetE, (SimpleBdiPlanStatement) stat, diagram);
			} else if (stat instanceof PerceiveStatement) {
				createPerception(target, targetE, (PerceiveStatement) stat, diagram);
			} else if (stat instanceof RuleStatement) {
				createRule(target, targetE, (RuleStatement) stat, diagram);
			} else if (stat instanceof SystemOfEquationsStatement) {
				createEquation(target, targetE, (SystemOfEquationsStatement) stat, diagram);
			}
			// System.out.println("stat : " + stat);
			// if (stat instanceof ReflexStatement)
			// createReflex( target, targetE, (ReflexStatement) stat, diagram);
		}
		for (final IExecutable asp : species.getAspects()) {
			if (asp instanceof AspectStatement) {
				createAspect(target, targetE, (AspectStatement) asp, diagram);
			}
		}

		return target;
	}

	public EExperiment createXP(final ESpecies source, final PictogramElement sourceE, final IExperimentPlan xp,
			final Diagram diagram) {
		EExperiment target = null;
		if (xp.isGui()) {
			target = gama.GamaFactory.eINSTANCE.createEGUIExperiment();
		} else {
			target = gama.GamaFactory.eINSTANCE.createEBatchExperiment();
		}
		diagram.eResource().getContents().add(target);
		target.setName(xp.getName());// xp.getName().substring("Experiment
										// ".length(), xp.getName().length()));
		final CreateContext ac = new CreateContext();

		ac.setLocation(0, 0);

		ac.setSize(0, 0);
		ac.setTargetContainer(diagram);
		final PictogramElement targetE = addIfPossible(new AddContext(ac, target));

		final EExperimentLink eReference = gama.GamaFactory.eINSTANCE.createEExperimentLink();
		diagram.eResource().getContents().add(eReference);

		// add connection for business object
		final AddConnectionContext addContext = new AddConnectionContext(getAnchor(sourceE), getAnchor(targetE));
		addContext.setNewObject(eReference);
		addIfPossible(addContext);
		eReference.setSpecies(source);
		eReference.setExperiment(target);
		eReference.setSource(source);
		eReference.setTarget(target);

		source.getExperimentLinks().add(eReference);
		target.setExperimentLink(eReference);
		final GamaDiagramEditor diagramEditor = (GamaDiagramEditor) getDiagramTypeProvider().getDiagramBehavior()
				.getDiagramContainer();
		diagramEditor.addEOject(target);
		if (xp.isGui() && xp.getExperimentOutputs() != null) {
			for (final IOutput output : ((SimulationOutputManager) xp.getOriginalSimulationOutputs()).getOutputs()
					.values()) {
				if (output instanceof LayeredDisplayOutput) {
					createDisplay((EGUIExperiment) target, targetE, output, diagram);
				}
			}
		}

		return target;
	}

	public EAction createAction(final ESpecies source, final PictogramElement sourceE, final ActionStatement action,
			final Diagram diagram) {
		if (action == null) {
			return null;
		}
		final EAction target = gama.GamaFactory.eINSTANCE.createEAction();
		diagram.eResource().getContents().add(target);
		target.setName(action.getName());
		String gmlCode = "";
		if (action.getCommands() != null) {
			for (final IStatement st : action.getCommands()) {
				gmlCode += st.serialize(false) + System.getProperty("line.separator");
			}
		}
		target.setGamlCode(gmlCode);
		final CreateContext ac = new CreateContext();

		ac.setLocation(0, 0);

		ac.setSize(0, 0);
		ac.setTargetContainer(diagram);

		final PictogramElement targetE = addIfPossible(new AddContext(ac, target));

		final EActionLink eReference = gama.GamaFactory.eINSTANCE.createEActionLink();
		diagram.eResource().getContents().add(eReference);

		// add connection for business object
		final AddConnectionContext addContext = new AddConnectionContext(getAnchor(sourceE), getAnchor(targetE));
		addContext.setNewObject(eReference);
		addIfPossible(addContext);
		eReference.setSpecies(source);
		eReference.setAction(target);
		eReference.setSource(source);
		eReference.setTarget(target);

		source.getActionLinks().add(eReference);
		target.getActionLinks().add(eReference);
		final GamaDiagramEditor diagramEditor = (GamaDiagramEditor) getDiagramTypeProvider().getDiagramBehavior()
				.getDiagramContainer();
		diagramEditor.addEOject(target);

		return target;
	}

	public EDisplay createDisplay(final EGUIExperiment source, final PictogramElement sourceE, final IOutput display,
			final Diagram diagram) {
		if (display == null) {
			return null;
		}
		final EDisplay target = gama.GamaFactory.eINSTANCE.createEDisplay();
		diagram.eResource().getContents().add(target);
		target.setName(display.getName());

		final CreateContext ac = new CreateContext();

		ac.setLocation(0, 0);

		ac.setSize(0, 0);
		ac.setTargetContainer(diagram);

		final PictogramElement targetE = addIfPossible(new AddContext(ac, target));

		final EDisplayLink eReference = gama.GamaFactory.eINSTANCE.createEDisplayLink();
		diagram.eResource().getContents().add(eReference);

		// add connection for business object
		final AddConnectionContext addContext = new AddConnectionContext(getAnchor(sourceE), getAnchor(targetE));
		addContext.setNewObject(eReference);
		addIfPossible(addContext);
		eReference.setExperiment(source);
		eReference.setDisplay(target);
		eReference.setSource(source);
		eReference.setTarget(target);

		source.getDisplayLinks().add(eReference);
		target.setDisplayLink(eReference);
		final GamaDiagramEditor diagramEditor = (GamaDiagramEditor) getDiagramTypeProvider().getDiagramBehavior()
				.getDiagramContainer();
		diagramEditor.addEOject(target);
		target.setDefineGamlCode(true);

		for (final Object facetN : getFacets(display)) {
			if (!(facetN instanceof String))
				continue;
			final String name = (String) facetN;
			final SymbolProto proto = DescriptionFactory.getStatementProto("display");
			if (proto.getFacet(name).internal)
				continue;
			final EFacet facet = gama.GamaFactory.eINSTANCE.createEFacet();
			facet.setName(name);
			facet.setOwner(target);
			target.getFacets().add(facet);
			facet.setValue(display.getFacet(name).serialize(false));
		}
		String gmlCode = display.serialize(false);
		if (gmlCode.contains("{")) {
			gmlCode = gmlCode.substring(gmlCode.indexOf("{") + 1);
			gmlCode = gmlCode.substring(0, gmlCode.lastIndexOf("}"));
		} else gmlCode = "";
		target.setGamlCode(gmlCode);
		return target;
	}

	public EAspect createAspect(final ESpecies source, final PictogramElement sourceE, final AspectStatement aspect,
			final Diagram diagram) {
		if (aspect == null) {
			return null;
		}
		final EAspect target = gama.GamaFactory.eINSTANCE.createEAspect();
		diagram.eResource().getContents().add(target);
		target.setName(aspect.getName());

		final CreateContext ac = new CreateContext();

		ac.setLocation(0, 0);

		ac.setSize(0, 0);
		ac.setTargetContainer(diagram);

		final PictogramElement targetE = addIfPossible(new AddContext(ac, target));

		final EAspectLink eReference = gama.GamaFactory.eINSTANCE.createEAspectLink();
		diagram.eResource().getContents().add(eReference);

		// add connection for business object
		final AddConnectionContext addContext = new AddConnectionContext(getAnchor(sourceE), getAnchor(targetE));
		addContext.setNewObject(eReference);
		addIfPossible(addContext);
		eReference.setSpecies(source);
		eReference.setAspect(target);
		eReference.setSource(source);
		eReference.setTarget(target);

		source.getAspectLinks().add(eReference);
		target.getAspectLinks().add(eReference);
		final GamaDiagramEditor diagramEditor = (GamaDiagramEditor) getDiagramTypeProvider().getDiagramBehavior()
				.getDiagramContainer();
		diagramEditor.addEOject(target);
		target.setDefineGamlCode(true);

		for (final Object facetN : getFacets(aspect)) {
			if (!(facetN instanceof String))
				continue;
			final String name = (String) facetN;
			final SymbolProto proto = DescriptionFactory.getStatementProto("aspect");
			if (proto.getFacet(name).internal)
				continue;
			final EFacet facet = gama.GamaFactory.eINSTANCE.createEFacet();
			facet.setName(name);
			facet.setOwner(target);
			target.getFacets().add(facet);
			facet.setValue(aspect.getFacet(name).serialize(false));
		}
		String gmlCode = aspect.serialize(false);
		if (gmlCode.contains("{")) {
			gmlCode = gmlCode.substring(gmlCode.indexOf("{") + 1);
			gmlCode = gmlCode.substring(0, gmlCode.lastIndexOf("}"));
		} else gmlCode = "";
		target.setGamlCode(gmlCode);
		return target;
	}

	public EEquation createEquation(final ESpecies source, final PictogramElement sourceE,
			final SystemOfEquationsStatement equation, final Diagram diagram) {
		if (equation == null) {
			return null;
		}
		final EEquation target = gama.GamaFactory.eINSTANCE.createEEquation();
		diagram.eResource().getContents().add(target);
		target.setName(equation.getName());

		final CreateContext ac = new CreateContext();

		ac.setLocation(0, 0);

		ac.setSize(0, 0);
		ac.setTargetContainer(diagram);

		final PictogramElement targetE = addIfPossible(new AddContext(ac, target));

		final EEquationLink eReference = gama.GamaFactory.eINSTANCE.createEEquationLink();
		diagram.eResource().getContents().add(eReference);

		// add connection for business object
		final AddConnectionContext addContext = new AddConnectionContext(getAnchor(sourceE), getAnchor(targetE));
		addContext.setNewObject(eReference);
		addIfPossible(addContext);
		eReference.setSpecies(source);
		eReference.setEquation(target);
		eReference.setSource(source);
		eReference.setTarget(target);
		source.getEquationLinks().add(eReference);
		target.getEquationLinks().add(eReference);
		final GamaDiagramEditor diagramEditor = (GamaDiagramEditor) getDiagramTypeProvider().getDiagramBehavior()
				.getDiagramContainer();
		diagramEditor.addEOject(target);

		for (final Object facetN : getFacets(equation)) {
			if (!(facetN instanceof String))
				continue;
			final String name = (String) facetN;
			final SymbolProto proto = DescriptionFactory.getStatementProto("equation");
			if (proto.getFacet(name).internal)
				continue;
			final EFacet facet = gama.GamaFactory.eINSTANCE.createEFacet();
			facet.setName(name);
			facet.setOwner(target);
			target.getFacets().add(facet);
			facet.setValue(equation.getFacet(name).serialize(false));
		}
		String gmlCode = equation.serialize(false);
		if (gmlCode.contains("{")) {
			gmlCode = gmlCode.substring(gmlCode.indexOf("{") + 1);
			gmlCode = gmlCode.substring(0, gmlCode.lastIndexOf("}"));
		} else gmlCode = "";
		target.setGamlCode(gmlCode);
		return target;
	}

	public EState createState(final ESpecies source, final PictogramElement sourceE, final FsmStateStatement state,
			final Diagram diagram) {
		if (state == null) {
			return null;
		}
		final EState target = gama.GamaFactory.eINSTANCE.createEState();
		diagram.eResource().getContents().add(target);
		target.setName(state.getName());

		final CreateContext ac = new CreateContext();

		ac.setLocation(0, 0);

		ac.setSize(0, 0);
		ac.setTargetContainer(diagram);

		final PictogramElement targetE = addIfPossible(new AddContext(ac, target));

		final EStateLink eReference = gama.GamaFactory.eINSTANCE.createEStateLink();
		diagram.eResource().getContents().add(eReference);

		// add connection for business object
		final AddConnectionContext addContext = new AddConnectionContext(getAnchor(sourceE), getAnchor(targetE));
		addContext.setNewObject(eReference);
		addIfPossible(addContext);
		eReference.setSpecies(source);
		eReference.setState(target);
		eReference.setSource(source);
		eReference.setTarget(target);

		source.getStateLinks().add(eReference);
		target.getStateLinks().add(eReference);
		final GamaDiagramEditor diagramEditor = (GamaDiagramEditor) getDiagramTypeProvider().getDiagramBehavior()
				.getDiagramContainer();
		diagramEditor.addEOject(target);

		for (final Object facetN : getFacets(state)) {
			if (!(facetN instanceof String))
				continue;
			final String name = (String) facetN;
			final SymbolProto proto = DescriptionFactory.getStatementProto("state");
			if (proto.getFacet(name).internal)
				continue;
			final EFacet facet = gama.GamaFactory.eINSTANCE.createEFacet();
			facet.setName(name);
			facet.setOwner(target);
			target.getFacets().add(facet);
			facet.setValue(state.getFacet(name).serialize(false));
		}
		String gmlCode = "";
		if (state.getCommands() != null) {
			for (final IStatement st : state.getCommands()) {
				if (st == null) {
					continue;
				}
				gmlCode += st.serialize(false);
			}
		}
		target.setGamlCode(gmlCode);
		return target;
	}

	public ETask createTask(final ESpecies source, final PictogramElement sourceE, final WeightedTaskStatement task,
			final Diagram diagram) {
		if (task == null) {
			return null;
		}
		final ETask target = gama.GamaFactory.eINSTANCE.createETask();
		diagram.eResource().getContents().add(target);
		target.setName(task.getName());

		final CreateContext ac = new CreateContext();

		ac.setLocation(0, 0);

		ac.setSize(0, 0);
		ac.setTargetContainer(diagram);

		final PictogramElement targetE = addIfPossible(new AddContext(ac, target));

		final ETaskLink eReference = gama.GamaFactory.eINSTANCE.createETaskLink();
		diagram.eResource().getContents().add(eReference);

		// add connection for business object
		final AddConnectionContext addContext = new AddConnectionContext(getAnchor(sourceE), getAnchor(targetE));
		addContext.setNewObject(eReference);
		addIfPossible(addContext);
		eReference.setSpecies(source);
		eReference.setTask(target);
		eReference.setSource(source);
		eReference.setTarget(target);

		source.getTaskLinks().add(eReference);
		target.getTaskLinks().add(eReference);
		final GamaDiagramEditor diagramEditor = (GamaDiagramEditor) getDiagramTypeProvider().getDiagramBehavior()
				.getDiagramContainer();
		diagramEditor.addEOject(target);

		for (final Object facetN : getFacets(task)) {
			if (!(facetN instanceof String))
				continue;
			final String name = (String) facetN;
			final SymbolProto proto = DescriptionFactory.getStatementProto("task");
			if (proto.getFacet(name).internal)
				continue;
			final EFacet facet = gama.GamaFactory.eINSTANCE.createEFacet();
			facet.setName(name);
			facet.setOwner(target);
			target.getFacets().add(facet);
			facet.setValue(task.getFacet(name).serialize(false));
		}
		String gmlCode = "";
		if (task.getCommands() != null) {
			for (final IStatement st : task.getCommands()) {
				if (st == null) {
					continue;
				}
				gmlCode += st.serialize(false);
			}
		}
		target.setGamlCode(gmlCode);
		return target;
	}

	public EPlan createPlan(final ESpecies source, final PictogramElement sourceE, final SimpleBdiPlanStatement plan,
			final Diagram diagram) {
		if (plan == null) {
			return null;
		}
		final EPlan target = gama.GamaFactory.eINSTANCE.createEPlan();
		diagram.eResource().getContents().add(target);
		target.setName(plan.getName());

		final CreateContext ac = new CreateContext();

		ac.setLocation(0, 0);

		ac.setSize(0, 0);
		ac.setTargetContainer(diagram);

		final PictogramElement targetE = addIfPossible(new AddContext(ac, target));

		final EPlanLink eReference = gama.GamaFactory.eINSTANCE.createEPlanLink();
		diagram.eResource().getContents().add(eReference);

		// add connection for business object
		final AddConnectionContext addContext = new AddConnectionContext(getAnchor(sourceE), getAnchor(targetE));
		addContext.setNewObject(eReference);
		addIfPossible(addContext);
		eReference.setSpecies(source);
		eReference.setPlan(target);
		eReference.setSource(source);
		eReference.setTarget(target);

		source.getPlanLinks().add(eReference);
		target.getPlanLinks().add(eReference);
		final GamaDiagramEditor diagramEditor = (GamaDiagramEditor) getDiagramTypeProvider().getDiagramBehavior()
				.getDiagramContainer();
		diagramEditor.addEOject(target);

		for (final Object facetN : getFacets(plan)) {
			if (!(facetN instanceof String))
				continue;
			final String name = (String) facetN;
			final SymbolProto proto = DescriptionFactory.getStatementProto("plan");
			if (proto.getFacet(name).internal)
				continue;
			final EFacet facet = gama.GamaFactory.eINSTANCE.createEFacet();
			facet.setName(name);
			facet.setOwner(target);
			target.getFacets().add(facet);
			facet.setValue(plan.getFacet(name).serialize(false));
		}
		String gmlCode = "";
		if (plan.getCommands() != null) {
			for (final IStatement st : plan.getCommands()) {
				if (st == null) {
					continue;
				}
				gmlCode += st.serialize(false);
			}
		}
		target.setGamlCode(gmlCode);
		return target;
	}

	public EPerceive createPerception(final ESpecies source, final PictogramElement sourceE,
			final PerceiveStatement perception, final Diagram diagram) {
		if (perception == null) {
			return null;
		}
		final EPerceive target = gama.GamaFactory.eINSTANCE.createEPerceive();
		diagram.eResource().getContents().add(target);
		target.setName(perception.getName());

		final CreateContext ac = new CreateContext();

		ac.setLocation(0, 0);

		ac.setSize(0, 0);
		ac.setTargetContainer(diagram);

		final PictogramElement targetE = addIfPossible(new AddContext(ac, target));

		final EPerceiveLink eReference = gama.GamaFactory.eINSTANCE.createEPerceiveLink();
		diagram.eResource().getContents().add(eReference);

		// add connection for business object
		final AddConnectionContext addContext = new AddConnectionContext(getAnchor(sourceE), getAnchor(targetE));
		addContext.setNewObject(eReference);
		addIfPossible(addContext);
		eReference.setSpecies(source);
		eReference.setPerceive(target);
		eReference.setSource(source);
		eReference.setTarget(target);

		source.getPerceiveLinks().add(eReference);
		target.getPerceiveLinks().add(eReference);
		final GamaDiagramEditor diagramEditor = (GamaDiagramEditor) getDiagramTypeProvider().getDiagramBehavior()
				.getDiagramContainer();
		diagramEditor.addEOject(target);

		for (final Object facetN : getFacets(perception)) {
			if (!(facetN instanceof String))
				continue;
			final String name = (String) facetN;
			final SymbolProto proto = DescriptionFactory.getStatementProto("perceive");
			if (proto.getFacet(name).internal)
				continue;
			final EFacet facet = gama.GamaFactory.eINSTANCE.createEFacet();
			facet.setName(name);
			facet.setOwner(target);
			target.getFacets().add(facet);
			facet.setValue(perception.getFacet(name).serialize(false));
		}
		String gmlCode = "";
		if (perception.getCommands() != null) {
			for (final IStatement st : perception.getCommands()) {
				if (st == null) {
					continue;
				}
				gmlCode += st.serialize(false);
			}
		}
		target.setGamlCode(gmlCode);
		return target;
	}

	public ERule createRule(final ESpecies source, final PictogramElement sourceE, final RuleStatement rule,
			final Diagram diagram) {
		if (rule == null) {
			return null;
		}
		final ERule target = gama.GamaFactory.eINSTANCE.createERule();
		diagram.eResource().getContents().add(target);
		String[] nR = rule.getName() == null ? null : rule.getName().split(" ");
		if (nR.length == 1)
			target.setName(rule.getName());
		else target.setName(nR[nR.length-1]);
		final CreateContext ac = new CreateContext();

		ac.setLocation(0, 0);

		ac.setSize(0, 0);
		ac.setTargetContainer(diagram);

		final PictogramElement targetE = addIfPossible(new AddContext(ac, target));

		final ERuleLink eReference = gama.GamaFactory.eINSTANCE.createERuleLink();
		diagram.eResource().getContents().add(eReference);

		// add connection for business object
		final AddConnectionContext addContext = new AddConnectionContext(getAnchor(sourceE), getAnchor(targetE));
		addContext.setNewObject(eReference);
		addIfPossible(addContext);
		eReference.setSpecies(source);
		eReference.setRule(target);
		eReference.setSource(source);
		eReference.setTarget(target);

		source.getRuleLinks().add(eReference);
		target.getRuleLinks().add(eReference);
		final GamaDiagramEditor diagramEditor = (GamaDiagramEditor) getDiagramTypeProvider().getDiagramBehavior()
				.getDiagramContainer();
		diagramEditor.addEOject(target);

		for (final Object facetN : getFacets(rule)) {
			if (!(facetN instanceof String))
				continue;
			final String name = (String) facetN;
			final SymbolProto proto = DescriptionFactory.getStatementProto("rule");
			if (proto.getFacet(name).internal)
				continue;
			final EFacet facet = gama.GamaFactory.eINSTANCE.createEFacet();
			facet.setName(name);
			facet.setOwner(target);
			target.getFacets().add(facet);
			facet.setValue(rule.getFacet(name).serialize(false));
		}
		return target;
	}

	public EReflex createReflex(final ESpecies source, final PictogramElement sourceE, final ReflexStatement reflex,
			final Diagram diagram) {
		if (reflex == null) {
			return null;
		}
		final EReflex target = gama.GamaFactory.eINSTANCE.createEReflex();
		diagram.eResource().getContents().add(target);
		target.setName(reflex.getName());
		String gmlCode = reflex.serialize(false);
		if (gmlCode.contains("{")) {
			gmlCode = gmlCode.substring(gmlCode.indexOf("{") + 1);
			gmlCode = gmlCode.substring(0, gmlCode.lastIndexOf("}"));
		} else gmlCode = "";
		target.setGamlCode(gmlCode);
		if (reflex.hasFacet(IKeyword.WHEN)) {
			final EFacet facet = gama.GamaFactory.eINSTANCE.createEFacet();
			facet.setOwner(target);
			target.getFacets().add(facet);
			facet.setName(IKeyword.WHEN);
			facet.setValue(reflex.getFacet(IKeyword.WHEN).serialize(false));
		}

		target.setGamlCode(gmlCode);
		final CreateContext ac = new CreateContext();

		ac.setLocation(0, 0);

		ac.setSize(0, 0);
		ac.setTargetContainer(diagram);

		final PictogramElement targetE = addIfPossible(new AddContext(ac, target));

		final EReflexLink eReference = gama.GamaFactory.eINSTANCE.createEReflexLink();
		diagram.eResource().getContents().add(eReference);

		// add connection for business object
		final AddConnectionContext addContext = new AddConnectionContext(getAnchor(sourceE), getAnchor(targetE));
		addContext.setNewObject(eReference);
		addIfPossible(addContext);
		eReference.setSpecies(source);
		eReference.setReflex(target);
		eReference.setSource(source);
		eReference.setTarget(target);

		source.getReflexLinks().add(eReference);
		target.getReflexLinks().add(eReference);
		final GamaDiagramEditor diagramEditor = (GamaDiagramEditor) getDiagramTypeProvider().getDiagramBehavior()
				.getDiagramContainer();
		diagramEditor.addEOject(target);

		return target;
	}

	protected Anchor getAnchor(final PictogramElement targetpe) {
		Anchor ret = null;
		if (targetpe instanceof Anchor) {
			ret = (Anchor) targetpe;
		} else if (targetpe instanceof AnchorContainer) {
			ret = Graphiti.getPeService().getChopboxAnchor((AnchorContainer) targetpe);
		}
		return ret;
	}

	public void initCustom(final EWorldAgent eWorld, final PictogramElement worldPE, final Diagram diagram) {
		final List<String> listSpecies = new ArrayList<String>();
		listSpecies.addAll(gamaModel.getMicroSpeciesNames());
		for (final IVariable var : gamaModel.getVars()) {
			if (var.getName().equals("experiment") || var.getName().equals("world") || var.getName().equals("location")) continue;
			if (var.getName().equals("shape") && !var.getDescription().hasFacet("init")) continue;
			if (var.getName().equals("step") && !var.getDescription().hasFacet("init")) continue;
			if (var.getName().equals("color") && !var.getDescription().hasFacet("init")) continue;
			addVariable(var, eWorld, listSpecies);
		}
		for (final ActionStatement action : gamaModel.getActions()) {
			if (!built_in_actions.contains(action.getName())) {
				createAction(eWorld, worldPE, action, diagram);
			}
		}
		for (final IStatement stat : gamaModel.getBehaviors()) {
			if (stat instanceof ReflexStatement) {
				if (stat.getName() != null && !stat.getName().isEmpty()
						&& !stat.getName().startsWith("_internal_init")) {
					createReflex(eWorld, worldPE, (ReflexStatement) stat, diagram);
				} else {
					String gmlCode = "";
					final ReflexStatement rs = (ReflexStatement) stat;
					if (rs.getCommands() != null) {
						for (final IStatement st : rs.getCommands()) {
							if (st == null) {
								continue;
							}
							gmlCode += st.serialize(false);
						}
					}
					eWorld.setInit(gmlCode);
				}
			}
		}
		buildAgent(gamaModel, eWorld, worldPE, diagram, listSpecies);

	}

	public void buildAgent(final IModel gamaSpecies, final ESpecies species, final PictogramElement speciesE,
			final Diagram diagram, final List<String> listSpecies) {
		final Set<String> xpNames = gamaSpecies.getDescription().getModelDescription().getExperimentNames();
		for (final String xpN : xpNames) {
			createXP(species, speciesE, gamaSpecies.getExperiment(xpN), diagram);
		}
		for (final ISpecies sp : gamaSpecies.getMicroSpecies()) {

			if (built_in_species.contains(sp.getName())) {
				continue;
			}

			createMicroSpecies(species, speciesE, sp, diagram, listSpecies);

		}
	}

	@Override
	public ILayoutFeature getLayoutFeature(final ILayoutContext context) {
		final PictogramElement pictogramElement = context.getPictogramElement();
		final Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		if (bo instanceof ESpecies) {
			return new LayoutESpeciesFeature(this);
		} else if (bo instanceof EExperiment) {
			return new LayoutEExperimentFeature(this);
		} else if (bo instanceof EGamaObject) {
			return new LayoutCommonFeature(this);
		}
		return super.getLayoutFeature(context);
	}

	@Override
	public IFeature[] getDragAndDropFeatures(final IPictogramElementContext context) {
		// simply return all create connection features
		return getCreateConnectionFeatures();
	}

	@Override
	public ICreateConnectionFeature[] getCreateConnectionFeatures() {
		return new ICreateConnectionFeature[] { new CreateSubSpeciesLinkFeature(this),
				new CreateSubGridLinkFeature(this), new CreateInheritingLinkFeature(this),
				new CreateActionLinkFeature(this), new CreateReflexLinkFeature(this), new CreateAspectLinkFeature(this),
				new CreateDisplayLinkFeature(this), new CreateBatchExperimentLinkFeature(this),
				new CreateGuiExperimentLinkFeature(this), new CreatePlanLinkFeature(this),
				new CreateTaskLinkFeature(this), new CreateStateLinkFeature(this), new CreateRuleLinkFeature(this),
				new CreateEquationLinkFeature(this), new CreatePerceiveLinkFeature(this) };
	}

	@Override
	public ICustomFeature[] getCustomFeatures(final ICustomContext context) {
		return new ICustomFeature[] { /* new RenameEGamaObjectFeature(this), */new ModelGenerationFeature(this),
				new LayoutDiagramFeature(this), new ChangeColorEGamaObjectFeature(this) };
	}

	@Override
	public IRemoveFeature getRemoveFeature(final IRemoveContext context) {
		return new EmptyRemoveFeature(this);
	}

	@Override
	public IDeleteFeature getDeleteFeature(final IDeleteContext context) {
		return new CustomDeleteFeature(this);
	}

	@Override
	public IUpdateFeature getUpdateFeature(final IUpdateContext context) {
		final PictogramElement pictogramElement = context.getPictogramElement();
		if (pictogramElement instanceof ContainerShape) {
			final Object bo = getBusinessObjectForPictogramElement(pictogramElement);
			if (bo instanceof EGamaObject) {
				return new UpdateEGamaObjectFeature(this);
			}
		}
		return super.getUpdateFeature(context);
	}

	public String getTypeOfModel() {
		return typeOfModel;
	}

	public void setTypeOfModel(final String typeOfModel) {
		this.typeOfModel = typeOfModel;
	}

	public IModel getGamaModel() {
		return gamaModel;
	}

	public void setGamaModel(final IModel gamaModel) {
		this.gamaModel = gamaModel;
	}

	public List<String> getFacets(final ISymbol statement) {
		final List<String> facets = new ArrayList<String>();
		statement.getDescription().visitFacets(new FacetVisitor() {

			@Override
			public boolean visit(final String name, final IExpressionDescription ed) {
				if (name.equals(IKeyword.NAME)) {
					final String n = statement.getFacet(IKeyword.NAME).literalValue();
					if (n.startsWith("internal_"))
						return true;
				}
				facets.add(name);
				return true;
			}

		});
		return facets;
	}

}