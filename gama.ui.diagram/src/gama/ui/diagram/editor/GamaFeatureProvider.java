/*******************************************************************************************************
 *
 * GamaFeatureProvider.java, in gama.ui.diagram.graphicalmodeling, is part of the source code of the GAMA modeling and
 * simulation platform (v.1.9.3).
 *
 * (c) 2007-2024 UMI 209 UMMISCO IRD/SU & Partners (IRIT, MIAT, TLU, CTU)
 *
 * Visit https://github.com/gama-platform/gama for license information and contacts.
 *
 ********************************************************************************************************/
package gama.ui.diagram.editor;

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

import gama.core.common.interfaces.IKeyword;
import gama.core.kernel.experiment.IExperimentPlan;
import gama.core.kernel.model.IModel;
import gama.core.outputs.IOutput;
import gama.core.outputs.LayeredDisplayOutput;
import gama.core.outputs.SimulationOutputManager;
import gama.extension.bdi.PerceiveStatement;
import gama.extension.bdi.RuleStatement;
import gama.extension.bdi.SimpleBdiPlanStatement;
import gama.extension.maths.ode.statements.SystemOfEquationsStatement;
import gama.gaml.architecture.finite_state_machine.FsmStateStatement;
import gama.gaml.architecture.reflex.ReflexStatement;
import gama.gaml.architecture.weighted_tasks.WeightedTaskStatement;
import gama.gaml.compilation.GAML;
import gama.gaml.compilation.ISymbol;
import gama.gaml.compilation.kernel.GamaSkillRegistry;
import gama.gaml.descriptions.IDescription;
import gama.gaml.descriptions.SymbolProto;
import gama.gaml.factories.DescriptionFactory;
import gama.gaml.species.ISpecies;
import gama.gaml.statements.ActionStatement;
import gama.gaml.statements.AspectStatement;
import gama.gaml.statements.Facets;
import gama.gaml.statements.IExecutable;
import gama.gaml.statements.IStatement;
import gama.gaml.variables.IVariable;
import gama.ui.diagram.features.add.AddActionFeature;
import gama.ui.diagram.features.add.AddActionLinkFeature;
import gama.ui.diagram.features.add.AddAspectFeature;
import gama.ui.diagram.features.add.AddAspectLinkFeature;
import gama.ui.diagram.features.add.AddBatchExperimentFeature;
import gama.ui.diagram.features.add.AddDisplayFeature;
import gama.ui.diagram.features.add.AddDisplayLinkFeature;
import gama.ui.diagram.features.add.AddEExperimentLinkFeature;
import gama.ui.diagram.features.add.AddEquationFeature;
import gama.ui.diagram.features.add.AddEquationLinkFeature;
import gama.ui.diagram.features.add.AddGridFeature;
import gama.ui.diagram.features.add.AddGuiExperimentFeature;
import gama.ui.diagram.features.add.AddInheritingLinkFeature;
import gama.ui.diagram.features.add.AddPerceiveFeature;
import gama.ui.diagram.features.add.AddPerceiveLinkFeature;
import gama.ui.diagram.features.add.AddPlanFeature;
import gama.ui.diagram.features.add.AddPlanLinkFeature;
import gama.ui.diagram.features.add.AddReflexFeature;
import gama.ui.diagram.features.add.AddReflexLinkFeature;
import gama.ui.diagram.features.add.AddRuleFeature;
import gama.ui.diagram.features.add.AddRuleLinkFeature;
import gama.ui.diagram.features.add.AddSpeciesFeature;
import gama.ui.diagram.features.add.AddStateFeature;
import gama.ui.diagram.features.add.AddStateLinkFeature;
import gama.ui.diagram.features.add.AddSubSpecieLinkFeature;
import gama.ui.diagram.features.add.AddTaskFeature;
import gama.ui.diagram.features.add.AddTaskLinkFeature;
import gama.ui.diagram.features.add.AddWorldFeature;
import gama.ui.diagram.features.create.CreateActionLinkFeature;
import gama.ui.diagram.features.create.CreateAspectLinkFeature;
import gama.ui.diagram.features.create.CreateBatchExperimentLinkFeature;
import gama.ui.diagram.features.create.CreateDisplayLinkFeature;
import gama.ui.diagram.features.create.CreateEquationLinkFeature;
import gama.ui.diagram.features.create.CreateGuiExperimentLinkFeature;
import gama.ui.diagram.features.create.CreateInheritingLinkFeature;
import gama.ui.diagram.features.create.CreatePerceiveLinkFeature;
import gama.ui.diagram.features.create.CreatePlanLinkFeature;
import gama.ui.diagram.features.create.CreateReflexLinkFeature;
import gama.ui.diagram.features.create.CreateRuleLinkFeature;
import gama.ui.diagram.features.create.CreateStateLinkFeature;
import gama.ui.diagram.features.create.CreateSubGridLinkFeature;
import gama.ui.diagram.features.create.CreateSubSpeciesLinkFeature;
import gama.ui.diagram.features.create.CreateTaskLinkFeature;
import gama.ui.diagram.features.layout.LayoutCommonFeature;
import gama.ui.diagram.features.layout.LayoutDiagramFeature;
import gama.ui.diagram.features.layout.LayoutEExperimentFeature;
import gama.ui.diagram.features.layout.LayoutESpeciesFeature;
import gama.ui.diagram.features.modelgeneration.ModelGenerationFeature;
import gama.ui.diagram.features.modelgeneration.ModelGenerator;
import gama.ui.diagram.features.others.ChangeColorEGamaObjectFeature;
import gama.ui.diagram.features.others.CustomDeleteFeature;
import gama.ui.diagram.features.others.EmptyRemoveFeature;
import gama.ui.diagram.features.others.UpdateEGamaObjectFeature;
import gama.ui.diagram.metamodel.EAction;
import gama.ui.diagram.metamodel.EActionLink;
import gama.ui.diagram.metamodel.EAspect;
import gama.ui.diagram.metamodel.EAspectLink;
import gama.ui.diagram.metamodel.EBatchExperiment;
import gama.ui.diagram.metamodel.EDisplay;
import gama.ui.diagram.metamodel.EDisplayLink;
import gama.ui.diagram.metamodel.EEquation;
import gama.ui.diagram.metamodel.EEquationLink;
import gama.ui.diagram.metamodel.EExperiment;
import gama.ui.diagram.metamodel.EExperimentLink;
import gama.ui.diagram.metamodel.EFacet;
import gama.ui.diagram.metamodel.EGUIExperiment;
import gama.ui.diagram.metamodel.EGamaObject;
import gama.ui.diagram.metamodel.EGrid;
import gama.ui.diagram.metamodel.EInheritLink;
import gama.ui.diagram.metamodel.EPerceive;
import gama.ui.diagram.metamodel.EPerceiveLink;
import gama.ui.diagram.metamodel.EPlan;
import gama.ui.diagram.metamodel.EPlanLink;
import gama.ui.diagram.metamodel.EReflex;
import gama.ui.diagram.metamodel.EReflexLink;
import gama.ui.diagram.metamodel.ERule;
import gama.ui.diagram.metamodel.ERuleLink;
import gama.ui.diagram.metamodel.ESpecies;
import gama.ui.diagram.metamodel.EState;
import gama.ui.diagram.metamodel.EStateLink;
import gama.ui.diagram.metamodel.ESubSpeciesLink;
import gama.ui.diagram.metamodel.ETask;
import gama.ui.diagram.metamodel.ETaskLink;
import gama.ui.diagram.metamodel.EVariable;
import gama.ui.diagram.metamodel.EWorldAgent;

/**
 * The Class GamaFeatureProvider.
 */
public class GamaFeatureProvider extends DefaultFeatureProvider {

	/** The type of model. */
	private String typeOfModel;

	/** The gama model. */
	private IModel gamaModel;

	/** The fp. */
	private final GamaFeatureProvider fp;

	/** The built in species. */
	private final List<String> built_in_species = Arrays.asList();
	/** The built in variables. */
	/*
	 * "osm_node", "osm_building", "osm_road", "graph_edge", "graph_node", "AgentDB", "Physical3DWorld",
	 * "cluster_builder", "experimentator", "agent", "multicriteria_analyzer", "base_node", "base_edge", "world",
	 * "node", "edge");
	 */
	private final List<String> built_in_variables = Arrays.asList("name", "peers", "host", "members", "agents",
			"rng_usage", "starting_date", "current_date", "paused", "rng", "seed", "average_duration", "total_duration",
			"duration", "time", "cycle", "machine_time");

	/** The built in actions. */
	private final List<String> built_in_actions;

	/**
	 * Instantiates a new gama feature provider.
	 *
	 * @param dtp
	 *            the dtp
	 */
	public GamaFeatureProvider(final IDiagramTypeProvider dtp) {
		super(dtp);
		fp = this;

		built_in_actions = new ArrayList<>();
		for (final IDescription desc : GAML.getAllActions()) { built_in_actions.add(desc.getName()); }
	}

	@Override
	public IAddFeature getAddFeature(final IAddContext context) {
		if (context.getNewObject() instanceof EWorldAgent) return new AddWorldFeature(this);
		if (context.getNewObject() instanceof EAction) return new AddActionFeature(this);
		if (context.getNewObject() instanceof EReflex) return new AddReflexFeature(this);
		if (context.getNewObject() instanceof EPlan) return new AddPlanFeature(this);
		if (context.getNewObject() instanceof ETask) return new AddTaskFeature(this);
		if (context.getNewObject() instanceof EState) return new AddStateFeature(this);
		if (context.getNewObject() instanceof ERule) return new AddRuleFeature(this);
		if (context.getNewObject() instanceof EEquation) return new AddEquationFeature(this);
		if (context.getNewObject() instanceof EPerceive) return new AddPerceiveFeature(this);
		if (context.getNewObject() instanceof EAspect) return new AddAspectFeature(this);
		if (context.getNewObject() instanceof EGUIExperiment) return new AddGuiExperimentFeature(this);
		if (context.getNewObject() instanceof EBatchExperiment) return new AddBatchExperimentFeature(this);
		if (context.getNewObject() instanceof EDisplay) return new AddDisplayFeature(this);
		if (context.getNewObject() instanceof ESubSpeciesLink) return new AddSubSpecieLinkFeature(this);
		if (context.getNewObject() instanceof EActionLink) return new AddActionLinkFeature(this);
		if (context.getNewObject() instanceof EReflexLink) return new AddReflexLinkFeature(this);
		if (context.getNewObject() instanceof EEquationLink) return new AddEquationLinkFeature(this);
		if (context.getNewObject() instanceof EPlanLink)
			return new AddPlanLinkFeature(this);
		else if (context.getNewObject() instanceof EStateLink)
			return new AddStateLinkFeature(this);
		else if (context.getNewObject() instanceof ETaskLink)
			return new AddTaskLinkFeature(this);
		else if (context.getNewObject() instanceof ERuleLink)
			return new AddRuleLinkFeature(this);
		else if (context.getNewObject() instanceof EPerceiveLink)
			return new AddPerceiveLinkFeature(this);
		else if (context.getNewObject() instanceof EAspectLink)
			return new AddAspectLinkFeature(this);
		else if (context.getNewObject() instanceof EDisplayLink)
			return new AddDisplayLinkFeature(this);
		else if (context.getNewObject() instanceof EExperimentLink)
			return new AddEExperimentLinkFeature(this);
		else if (context.getNewObject() instanceof EInheritLink)
			return new AddInheritingLinkFeature(this);
		else if (context.getNewObject() instanceof EGrid)
			return new AddGridFeature(this);
		else if (context.getNewObject() instanceof ESpecies) return new AddSpeciesFeature(this);
		return super.getAddFeature(context);
	}

	@Override
	public ICreateFeature[] getCreateFeatures() {
		// init();
		return new ICreateFeature[] {};

	}

	/**
	 * Inits the.
	 */
	public void init() {
		final Diagram diagram = getDiagramTypeProvider().getDiagram();
		if (diagram.getChildren().isEmpty()) {
			final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(diagram);
			domain.getCommandStack().execute(new RecordingCommand(domain) {

				@Override
				public void doExecute() {
					final EWorldAgent newClass = gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createEWorldAgent();

					diagram.eResource().getContents().add(newClass);
					newClass.setName("world");

					final CreateContext ac = new CreateContext();
					ac.setLocation(100, 50);

					ac.setSize(0, 0);
					ac.setTargetContainer(diagram);
					final GamaDiagramEditor diagramEditor =
							(GamaDiagramEditor) getDiagramTypeProvider().getDiagramBehavior().getDiagramContainer();
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

	/**
	 * Inits the simple.
	 *
	 * @param world
	 *            the world
	 * @param diagram
	 *            the diagram
	 */
	@SuppressWarnings ("unused")
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

	/**
	 * Inits the skeleton.
	 *
	 * @param world
	 *            the world
	 * @param diagram
	 *            the diagram
	 */
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

	/**
	 * Adds the variable.
	 *
	 * @param var
	 *            the var
	 * @param target
	 *            the target
	 * @param listSpecies
	 *            the list species
	 */
	public void addVariable(final IVariable var, final ESpecies target, final List<String> listSpecies) {
		if (built_in_variables.contains(var.getName()) || built_in_species.contains(var.getName())
				|| listSpecies.contains(var.getName()))
			return;

		final EVariable eVar = gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createEVariable();
		eVar.setType(var.getType().toString());
		eVar.setName(var.getName());
		if (var.hasFacet(IKeyword.INIT)) {
			eVar.setInit(var.getFacet(IKeyword.INIT).serializeToGaml(false).replace("\\/", "/"));
		}
		if (var.hasFacet(IKeyword.UPDATE)) {
			eVar.setUpdate(var.getFacet(IKeyword.UPDATE).serializeToGaml(false).replace("\\/", "/"));
		}
		if (var.hasFacet(IKeyword.MIN)) { eVar.setMin(var.getFacet(IKeyword.MIN).serializeToGaml(false)); }
		if (var.hasFacet(IKeyword.MAX)) { eVar.setMax(var.getFacet(IKeyword.MAX).serializeToGaml(false)); }
		if (var.hasFacet(IKeyword.FUNCTION)) {
			eVar.setFunction(var.getFacet(IKeyword.FUNCTION).serializeToGaml(false).replace("\\/", "/"));
		}
		if (var.hasFacet(IKeyword.VALUE)) {
			eVar.setFunction(var.getFacet(IKeyword.VALUE).serializeToGaml(false).replace("\\/", "/"));
		}
		target.getVariables().add(eVar);
	}

	/**
	 * Creates the micro species.
	 *
	 * @param source
	 *            the source
	 * @param sourceE
	 *            the source E
	 * @param species
	 *            the species
	 * @param diagram
	 *            the diagram
	 * @param listSpecies
	 *            the list species
	 * @return the e species
	 */
	public ESpecies createMicroSpecies(final ESpecies source, final PictogramElement sourceE, final ISpecies species,
			final Diagram diagram, final List<String> listSpecies) {
		final ESpecies target = species.isGrid() ? gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createEGrid()
				: gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createESpecies();
		diagram.eResource().getContents().add(target);

		final Iterable<String> skills = species.getDescription().getSkillsNames();
		for (final String sk : skills) {
			if (!"reflex".equals(sk) && !"grid".equals(sk)
					&& !GamaSkillRegistry.INSTANCE.getArchitectureNames().contains(sk)) {
				target.getSkills().add(sk.toString());
			}

		}
		target.setName(species.getName());

		for (final Object facetN : getFacets(species)) {
			if (!(facetN instanceof final String name)) { continue; }
			final SymbolProto proto = DescriptionFactory.getStatementProto("species");
			if (proto.getFacet(name).internal) { continue; }
			final EFacet facet = gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createEFacet();
			facet.setName(name);
			facet.setOwner(target);
			target.getFacets().add(facet);
			facet.setValue(species.getFacet(name).serializeToGaml(false).replace("\\/", "/"));
		}

		for (final IVariable var : species.getVars()) {
			if ("shape".equals(var.getName()) && !var.getDescription().hasFacet("init")
					|| "location".equals(var.getName()) && !var.getDescription().hasFacet("init")) {
				continue;
			}
			if ("color".equals(var.getName()) && !var.getDescription().hasFacet("init")) { continue; }

			addVariable(var, target, listSpecies);
		}

		final CreateContext ac = new CreateContext();

		ac.setLocation(0, 0);
		ac.setSize(0, 0);
		ac.setTargetContainer(diagram);

		final PictogramElement targetE = addIfPossible(new AddContext(ac, target));

		final ESubSpeciesLink eReference = gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createESubSpeciesLink();
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
		final GamaDiagramEditor diagramEditor =
				(GamaDiagramEditor) getDiagramTypeProvider().getDiagramBehavior().getDiagramContainer();
		diagramEditor.addEOject(target);

		for (final ActionStatement action : species.getActions()) {
			if (!built_in_actions.contains(action.getName())) { createAction(target, targetE, action, diagram); }
		}
		for (final IStatement stat : species.getBehaviors()) {
			if (stat instanceof ReflexStatement) {
				if (stat.getName() != null && !stat.getName().isEmpty()
						&& !stat.getName().startsWith("_internal_init")) {
					createReflex(target, targetE, (ReflexStatement) stat, diagram);
				} else {
					StringBuilder gmlCode = new StringBuilder();
					final ReflexStatement rs = (ReflexStatement) stat;
					if (rs.getCommands() != null) {
						for (final IStatement st : rs.getCommands()) {
							if (st == null) { continue; }
							gmlCode.append(st.serializeToGaml(false));
						}
					}
					target.setInit(gmlCode.toString());
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
			if (asp instanceof AspectStatement) { createAspect(target, targetE, (AspectStatement) asp, diagram); }
		}

		return target;
	}

	/**
	 * Creates the XP.
	 *
	 * @param source
	 *            the source
	 * @param sourceE
	 *            the source E
	 * @param xp
	 *            the xp
	 * @param diagram
	 *            the diagram
	 * @return the e experiment
	 */
	public EExperiment createXP(final ESpecies source, final PictogramElement sourceE, final IExperimentPlan xp,
			final Diagram diagram) {
		EExperiment target = null;
		if (!xp.isBatch()) {
			target = gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createEGUIExperiment();
		} else {
			target = gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createEBatchExperiment();
		}
		diagram.eResource().getContents().add(target);
		target.setName(xp.getName());// xp.getName().substring("Experiment
										// ".length(), xp.getName().length()));
		final CreateContext ac = new CreateContext();

		ac.setLocation(0, 0);

		ac.setSize(0, 0);
		ac.setTargetContainer(diagram);
		final PictogramElement targetE = addIfPossible(new AddContext(ac, target));

		final EExperimentLink eReference = gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createEExperimentLink();
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
		final GamaDiagramEditor diagramEditor =
				(GamaDiagramEditor) getDiagramTypeProvider().getDiagramBehavior().getDiagramContainer();
		diagramEditor.addEOject(target);
		if (!xp.isBatch() && xp.getExperimentOutputs() != null) {
			for (final IOutput output : ((SimulationOutputManager) xp.getOriginalSimulationOutputs()).getOutputs()
					.values()) {
				if (output instanceof LayeredDisplayOutput) {
					createDisplay((EGUIExperiment) target, targetE, output, diagram);
				}
			}
		}

		for (final Object facetN : getFacets(xp)) {
			if (!(facetN instanceof final String name)) { continue; }
			final SymbolProto proto = DescriptionFactory.getStatementProto("experiment");
			if (proto.getFacet(name).internal || "type".equals(name) || "name".equals(name)) { continue; }
			final EFacet facet = gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createEFacet();
			facet.setName(name);
			facet.setOwner(target);
			target.getFacets().add(facet);
			facet.setValue(xp.getFacet(name).serializeToGaml(false).replace("\\/", "/"));
		}

		return target;
	}

	/**
	 * Creates the action.
	 *
	 * @param source
	 *            the source
	 * @param sourceE
	 *            the source E
	 * @param action
	 *            the action
	 * @param diagram
	 *            the diagram
	 * @return the e action
	 */
	public EAction createAction(final ESpecies source, final PictogramElement sourceE, final ActionStatement action,
			final Diagram diagram) {
		if (action == null) return null;
		final EAction target = gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createEAction();
		diagram.eResource().getContents().add(target);
		target.setName(action.getName());
		String gmlCode = "";
		if (action.getCommands() != null) {
			for (final IStatement st : action.getCommands()) {
				gmlCode += st.serializeToGaml(false) + System.lineSeparator();
			}
		}
		gmlCode = gmlCode.replace("\\/", "/");
		target.setGamlCode(gmlCode);
		final CreateContext ac = new CreateContext();

		ac.setLocation(0, 0);

		ac.setSize(0, 0);
		ac.setTargetContainer(diagram);

		final PictogramElement targetE = addIfPossible(new AddContext(ac, target));

		final EActionLink eReference = gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createEActionLink();
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
		final GamaDiagramEditor diagramEditor =
				(GamaDiagramEditor) getDiagramTypeProvider().getDiagramBehavior().getDiagramContainer();
		diagramEditor.addEOject(target);

		return target;
	}

	/**
	 * Creates the display.
	 *
	 * @param source
	 *            the source
	 * @param sourceE
	 *            the source E
	 * @param display
	 *            the display
	 * @param diagram
	 *            the diagram
	 * @return the e display
	 */
	public EDisplay createDisplay(final EGUIExperiment source, final PictogramElement sourceE, final IOutput display,
			final Diagram diagram) {
		if (display == null) return null;
		final EDisplay target = gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createEDisplay();
		diagram.eResource().getContents().add(target);
		target.setName(display.getName());

		final CreateContext ac = new CreateContext();

		ac.setLocation(0, 0);

		ac.setSize(0, 0);
		ac.setTargetContainer(diagram);

		final PictogramElement targetE = addIfPossible(new AddContext(ac, target));

		final EDisplayLink eReference = gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createEDisplayLink();
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
		final GamaDiagramEditor diagramEditor =
				(GamaDiagramEditor) getDiagramTypeProvider().getDiagramBehavior().getDiagramContainer();
		diagramEditor.addEOject(target);
		target.setDefineGamlCode(true);

		for (final Object facetN : getFacets(display)) {
			if (!(facetN instanceof final String name)) { continue; }
			final SymbolProto proto = DescriptionFactory.getStatementProto("display");
			if (proto.getFacet(name).internal) { continue; }
			final EFacet facet = gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createEFacet();
			facet.setName(name);
			facet.setOwner(target);
			target.getFacets().add(facet);
			facet.setValue(display.getFacet(name).serializeToGaml(false).replace("\\/", "/"));
		}
		String gmlCode = display.serializeToGaml(false);
		if (gmlCode.contains("{")) {
			gmlCode = gmlCode.substring(gmlCode.indexOf("{") + 1);
			gmlCode = gmlCode.substring(0, gmlCode.lastIndexOf("}"));
		} else {
			gmlCode = "";
		}
		gmlCode = gmlCode.replace("\\/", "/");
		target.setGamlCode(gmlCode);
		return target;
	}

	/**
	 * Creates the aspect.
	 *
	 * @param source
	 *            the source
	 * @param sourceE
	 *            the source E
	 * @param aspect
	 *            the aspect
	 * @param diagram
	 *            the diagram
	 * @return the e aspect
	 */
	public EAspect createAspect(final ESpecies source, final PictogramElement sourceE, final AspectStatement aspect,
			final Diagram diagram) {
		if (aspect == null) return null;
		final EAspect target = gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createEAspect();
		diagram.eResource().getContents().add(target);
		target.setName(aspect.getName());

		final CreateContext ac = new CreateContext();

		ac.setLocation(0, 0);

		ac.setSize(0, 0);
		ac.setTargetContainer(diagram);

		final PictogramElement targetE = addIfPossible(new AddContext(ac, target));

		final EAspectLink eReference = gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createEAspectLink();
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
		final GamaDiagramEditor diagramEditor =
				(GamaDiagramEditor) getDiagramTypeProvider().getDiagramBehavior().getDiagramContainer();
		diagramEditor.addEOject(target);
		target.setDefineGamlCode(true);

		for (final Object facetN : getFacets(aspect)) {
			if (!(facetN instanceof final String name)) { continue; }
			final SymbolProto proto = DescriptionFactory.getStatementProto("aspect");
			if (proto.getFacet(name).internal) { continue; }
			final EFacet facet = gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createEFacet();
			facet.setName(name);
			facet.setOwner(target);
			target.getFacets().add(facet);
			facet.setValue(aspect.getFacet(name).serializeToGaml(false).replace("\\/", "/"));
		}
		String gmlCode = aspect.serializeToGaml(false);
		if (gmlCode.contains("{")) {
			gmlCode = gmlCode.substring(gmlCode.indexOf("{") + 1);
			gmlCode = gmlCode.substring(0, gmlCode.lastIndexOf("}"));
		} else {
			gmlCode = "";
		}
		gmlCode = gmlCode.replace("\\/", "/");
		target.setGamlCode(gmlCode);
		return target;
	}

	/**
	 * Creates the equation.
	 *
	 * @param source
	 *            the source
	 * @param sourceE
	 *            the source E
	 * @param equation
	 *            the equation
	 * @param diagram
	 *            the diagram
	 * @return the e equation
	 */
	public EEquation createEquation(final ESpecies source, final PictogramElement sourceE,
			final SystemOfEquationsStatement equation, final Diagram diagram) {
		if (equation == null) return null;
		final EEquation target = gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createEEquation();
		diagram.eResource().getContents().add(target);
		target.setName(equation.getName());

		final CreateContext ac = new CreateContext();

		ac.setLocation(0, 0);

		ac.setSize(0, 0);
		ac.setTargetContainer(diagram);

		final PictogramElement targetE = addIfPossible(new AddContext(ac, target));

		final EEquationLink eReference = gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createEEquationLink();
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
		final GamaDiagramEditor diagramEditor =
				(GamaDiagramEditor) getDiagramTypeProvider().getDiagramBehavior().getDiagramContainer();
		diagramEditor.addEOject(target);

		for (final Object facetN : getFacets(equation)) {
			if (!(facetN instanceof final String name)) { continue; }
			final SymbolProto proto = DescriptionFactory.getStatementProto("equation");
			if (proto.getFacet(name).internal) { continue; }
			final EFacet facet = gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createEFacet();
			facet.setName(name);
			facet.setOwner(target);
			target.getFacets().add(facet);
			facet.setValue(equation.getFacet(name).serializeToGaml(false).replace("\\/", "/"));
		}
		String gmlCode = equation.serializeToGaml(false);
		if (gmlCode.contains("{")) {
			gmlCode = gmlCode.substring(gmlCode.indexOf("{") + 1);
			gmlCode = gmlCode.substring(0, gmlCode.lastIndexOf("}"));
			gmlCode = gmlCode.replace("\\/", "/");
		} else {
			gmlCode = "";
		}
		target.setGamlCode(gmlCode);
		return target;
	}

	/**
	 * Creates the state.
	 *
	 * @param source
	 *            the source
	 * @param sourceE
	 *            the source E
	 * @param state
	 *            the state
	 * @param diagram
	 *            the diagram
	 * @return the e state
	 */
	public EState createState(final ESpecies source, final PictogramElement sourceE, final FsmStateStatement state,
			final Diagram diagram) {
		if (state == null) return null;
		final EState target = gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createEState();
		diagram.eResource().getContents().add(target);
		target.setName(state.getName());

		final CreateContext ac = new CreateContext();

		ac.setLocation(0, 0);

		ac.setSize(0, 0);
		ac.setTargetContainer(diagram);

		final PictogramElement targetE = addIfPossible(new AddContext(ac, target));

		final EStateLink eReference = gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createEStateLink();
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
		final GamaDiagramEditor diagramEditor =
				(GamaDiagramEditor) getDiagramTypeProvider().getDiagramBehavior().getDiagramContainer();
		diagramEditor.addEOject(target);

		for (final Object facetN : getFacets(state)) {
			if (!(facetN instanceof final String name)) { continue; }
			final SymbolProto proto = DescriptionFactory.getStatementProto("state");
			if (proto.getFacet(name).internal) { continue; }
			final EFacet facet = gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createEFacet();
			facet.setName(name);
			facet.setOwner(target);
			target.getFacets().add(facet);
			facet.setValue(state.getFacet(name).serializeToGaml(false).replace("\\/", "/"));
		}
		String gmlCode = "";
		if (state.getCommands() != null) {
			for (final IStatement st : state.getCommands()) {
				if (st == null) { continue; }
				gmlCode += st.serializeToGaml(false);
			}
		}
		gmlCode = gmlCode.replace("\\/", "/");
		target.setGamlCode(gmlCode);
		return target;
	}

	/**
	 * Creates the task.
	 *
	 * @param source
	 *            the source
	 * @param sourceE
	 *            the source E
	 * @param task
	 *            the task
	 * @param diagram
	 *            the diagram
	 * @return the e task
	 */
	public ETask createTask(final ESpecies source, final PictogramElement sourceE, final WeightedTaskStatement task,
			final Diagram diagram) {
		if (task == null) return null;
		final ETask target = gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createETask();
		diagram.eResource().getContents().add(target);
		target.setName(task.getName());

		final CreateContext ac = new CreateContext();

		ac.setLocation(0, 0);

		ac.setSize(0, 0);
		ac.setTargetContainer(diagram);

		final PictogramElement targetE = addIfPossible(new AddContext(ac, target));

		final ETaskLink eReference = gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createETaskLink();
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
		final GamaDiagramEditor diagramEditor =
				(GamaDiagramEditor) getDiagramTypeProvider().getDiagramBehavior().getDiagramContainer();
		diagramEditor.addEOject(target);

		for (final Object facetN : getFacets(task)) {
			if (!(facetN instanceof final String name)) { continue; }
			final SymbolProto proto = DescriptionFactory.getStatementProto("task");
			if (proto.getFacet(name).internal) { continue; }
			final EFacet facet = gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createEFacet();
			facet.setName(name);
			facet.setOwner(target);
			target.getFacets().add(facet);
			facet.setValue(task.getFacet(name).serializeToGaml(false).replace("\\/", "/"));
		}
		String gmlCode = "";
		if (task.getCommands() != null) {
			for (final IStatement st : task.getCommands()) {
				if (st == null) { continue; }
				gmlCode += st.serializeToGaml(false);
			}
		}
		gmlCode = gmlCode.replace("\\/", "/");
		target.setGamlCode(gmlCode);
		return target;
	}

	/**
	 * Creates the plan.
	 *
	 * @param source
	 *            the source
	 * @param sourceE
	 *            the source E
	 * @param plan
	 *            the plan
	 * @param diagram
	 *            the diagram
	 * @return the e plan
	 */
	public EPlan createPlan(final ESpecies source, final PictogramElement sourceE, final SimpleBdiPlanStatement plan,
			final Diagram diagram) {
		if (plan == null) return null;
		final EPlan target = gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createEPlan();
		diagram.eResource().getContents().add(target);
		target.setName(plan.getName());

		final CreateContext ac = new CreateContext();

		ac.setLocation(0, 0);

		ac.setSize(0, 0);
		ac.setTargetContainer(diagram);

		final PictogramElement targetE = addIfPossible(new AddContext(ac, target));

		final EPlanLink eReference = gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createEPlanLink();
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
		final GamaDiagramEditor diagramEditor =
				(GamaDiagramEditor) getDiagramTypeProvider().getDiagramBehavior().getDiagramContainer();
		diagramEditor.addEOject(target);

		for (final Object facetN : getFacets(plan)) {
			if (!(facetN instanceof final String name)) { continue; }
			final SymbolProto proto = DescriptionFactory.getStatementProto("plan");
			if (proto.getFacet(name).internal) { continue; }
			final EFacet facet = gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createEFacet();
			facet.setName(name);
			facet.setOwner(target);
			target.getFacets().add(facet);
			facet.setValue(plan.getFacet(name).serializeToGaml(false).replace("\\/", "/"));
		}
		String gmlCode = "";
		if (plan.getCommands() != null) {
			for (final IStatement st : plan.getCommands()) {
				if (st == null) { continue; }
				gmlCode += st.serializeToGaml(false);
			}
		}
		gmlCode = gmlCode.replace("\\/", "/");
		target.setGamlCode(gmlCode);
		return target;
	}

	/**
	 * Creates the perception.
	 *
	 * @param source
	 *            the source
	 * @param sourceE
	 *            the source E
	 * @param perception
	 *            the perception
	 * @param diagram
	 *            the diagram
	 * @return the e perceive
	 */
	public EPerceive createPerception(final ESpecies source, final PictogramElement sourceE,
			final PerceiveStatement perception, final Diagram diagram) {
		if (perception == null) return null;
		final EPerceive target = gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createEPerceive();
		diagram.eResource().getContents().add(target);
		target.setName(perception.getName());

		final CreateContext ac = new CreateContext();

		ac.setLocation(0, 0);

		ac.setSize(0, 0);
		ac.setTargetContainer(diagram);

		final PictogramElement targetE = addIfPossible(new AddContext(ac, target));

		final EPerceiveLink eReference = gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createEPerceiveLink();
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
		final GamaDiagramEditor diagramEditor =
				(GamaDiagramEditor) getDiagramTypeProvider().getDiagramBehavior().getDiagramContainer();
		diagramEditor.addEOject(target);

		for (final Object facetN : getFacets(perception)) {
			if (!(facetN instanceof final String name)) { continue; }
			final SymbolProto proto = DescriptionFactory.getStatementProto("perceive");
			if (proto.getFacet(name).internal) { continue; }
			final EFacet facet = gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createEFacet();
			facet.setName(name);
			facet.setOwner(target);
			target.getFacets().add(facet);
			facet.setValue(perception.getFacet(name).serializeToGaml(false).replace("\\/", "/"));
		}
		String gmlCode = "";
		if (perception.getCommands() != null) {
			for (final IStatement st : perception.getCommands()) {
				if (st == null) { continue; }
				gmlCode += st.serializeToGaml(false);
			}
		}
		gmlCode = gmlCode.replace("\\/", "/");
		target.setGamlCode(gmlCode);
		return target;
	}

	/**
	 * Creates the rule.
	 *
	 * @param source
	 *            the source
	 * @param sourceE
	 *            the source E
	 * @param rule
	 *            the rule
	 * @param diagram
	 *            the diagram
	 * @return the e rule
	 */
	public ERule createRule(final ESpecies source, final PictogramElement sourceE, final RuleStatement rule,
			final Diagram diagram) {
		if (rule == null) return null;
		final ERule target = gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createERule();
		diagram.eResource().getContents().add(target);
		final String[] nR = rule.getName() == null ? null : rule.getName().split(" ");
		if (nR.length == 1) {
			target.setName(rule.getName());
		} else {
			target.setName(nR[nR.length - 1]);
		}
		final CreateContext ac = new CreateContext();

		ac.setLocation(0, 0);

		ac.setSize(0, 0);
		ac.setTargetContainer(diagram);

		final PictogramElement targetE = addIfPossible(new AddContext(ac, target));

		final ERuleLink eReference = gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createERuleLink();
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
		final GamaDiagramEditor diagramEditor =
				(GamaDiagramEditor) getDiagramTypeProvider().getDiagramBehavior().getDiagramContainer();
		diagramEditor.addEOject(target);

		for (final Object facetN : getFacets(rule)) {
			if (!(facetN instanceof final String name)) { continue; }
			final SymbolProto proto = DescriptionFactory.getStatementProto("rule");
			if (proto.getFacet(name).internal) { continue; }
			final EFacet facet = gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createEFacet();
			facet.setName(name);
			facet.setOwner(target);
			target.getFacets().add(facet);
			facet.setValue(rule.getFacet(name).serializeToGaml(false).replace("\\/", "/"));
		}
		return target;
	}

	/**
	 * Creates the reflex.
	 *
	 * @param source
	 *            the source
	 * @param sourceE
	 *            the source E
	 * @param reflex
	 *            the reflex
	 * @param diagram
	 *            the diagram
	 * @return the e reflex
	 */
	public EReflex createReflex(final ESpecies source, final PictogramElement sourceE, final ReflexStatement reflex,
			final Diagram diagram) {
		if (reflex == null) return null;
		final EReflex target = gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createEReflex();
		diagram.eResource().getContents().add(target);
		target.setName(reflex.getName());
		String gmlCode = reflex.serializeToGaml(false);
		if (gmlCode.contains("{")) {
			gmlCode = gmlCode.substring(gmlCode.indexOf("{") + 1);
			gmlCode = gmlCode.substring(0, gmlCode.lastIndexOf("}"));
			gmlCode = gmlCode.replace("\\/", "/");
		} else {
			gmlCode = "";
		}
		target.setGamlCode(gmlCode);
		if (reflex.hasFacet(IKeyword.WHEN)) {
			final EFacet facet = gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createEFacet();
			facet.setOwner(target);
			target.getFacets().add(facet);
			facet.setName(IKeyword.WHEN);
			facet.setValue(reflex.getFacet(IKeyword.WHEN).serializeToGaml(false));
		}

		final CreateContext ac = new CreateContext();

		ac.setLocation(0, 0);

		ac.setSize(0, 0);
		ac.setTargetContainer(diagram);

		final PictogramElement targetE = addIfPossible(new AddContext(ac, target));

		final EReflexLink eReference = gama.ui.diagram.metamodel.GamaFactory.eINSTANCE.createEReflexLink();
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
		final GamaDiagramEditor diagramEditor =
				(GamaDiagramEditor) getDiagramTypeProvider().getDiagramBehavior().getDiagramContainer();
		diagramEditor.addEOject(target);

		return target;
	}

	/**
	 * Gets the anchor.
	 *
	 * @param targetpe
	 *            the targetpe
	 * @return the anchor
	 */
	protected Anchor getAnchor(final PictogramElement targetpe) {
		Anchor ret = null;
		if (targetpe instanceof Anchor) {
			ret = (Anchor) targetpe;
		} else if (targetpe instanceof AnchorContainer) {
			ret = Graphiti.getPeService().getChopboxAnchor((AnchorContainer) targetpe);
		}
		return ret;
	}

	/**
	 * Inits the custom.
	 *
	 * @param eWorld
	 *            the e world
	 * @param worldPE
	 *            the world PE
	 * @param diagram
	 *            the diagram
	 */
	public void initCustom(final EWorldAgent eWorld, final PictogramElement worldPE, final Diagram diagram) {
		final List<String> listSpecies = new ArrayList<>();
		listSpecies.addAll(gamaModel.getMicroSpeciesNames());
		for (final IVariable var : gamaModel.getVars()) {
			if ("experiment".equals(var.getName()) || "world".equals(var.getName())
					|| "location".equals(var.getName())) {
				continue;
			}
			if ("shape".equals(var.getName()) && !var.getDescription().hasFacet("init")
					|| "step".equals(var.getName()) && !var.getDescription().hasFacet("init")) {
				continue;
			}
			if ("color".equals(var.getName()) && !var.getDescription().hasFacet("init")) { continue; }
			addVariable(var, eWorld, listSpecies);
		}
		for (final ActionStatement action : gamaModel.getActions()) {
			if (!built_in_actions.contains(action.getName())) { createAction(eWorld, worldPE, action, diagram); }
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
							if (st == null) { continue; }
							gmlCode += st.serializeToGaml(false);
						}
					}
					gmlCode = gmlCode.replace("\\/", "/");
					eWorld.setInit(gmlCode);
				}
			}
		}
		buildAgent(gamaModel, eWorld, worldPE, diagram, listSpecies);

	}

	/**
	 * Builds the agent.
	 *
	 * @param gamaSpecies
	 *            the gama species
	 * @param species
	 *            the species
	 * @param speciesE
	 *            the species E
	 * @param diagram
	 *            the diagram
	 * @param listSpecies
	 *            the list species
	 */
	public void buildAgent(final IModel gamaSpecies, final ESpecies species, final PictogramElement speciesE,
			final Diagram diagram, final List<String> listSpecies) {
		final Set<String> xpNames = gamaSpecies.getDescription().getModelDescription().getExperimentNames();
		for (final String xpN : xpNames) { createXP(species, speciesE, gamaSpecies.getExperiment(xpN), diagram); }
		for (final ISpecies sp : gamaSpecies.getMicroSpecies()) {

			if (built_in_species.contains(sp.getName())) { continue; }

			createMicroSpecies(species, speciesE, sp, diagram, listSpecies);

		}
	}

	@Override
	public ILayoutFeature getLayoutFeature(final ILayoutContext context) {
		final PictogramElement pictogramElement = context.getPictogramElement();
		final Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		if (bo instanceof ESpecies) return new LayoutESpeciesFeature(this);
		if (bo instanceof EExperiment) return new LayoutEExperimentFeature(this);
		if (bo instanceof EGamaObject) return new LayoutCommonFeature(this);
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
			if (bo instanceof EGamaObject) return new UpdateEGamaObjectFeature(this);
		}
		return super.getUpdateFeature(context);
	}

	/**
	 * Gets the type of model.
	 *
	 * @return the type of model
	 */
	public String getTypeOfModel() { return typeOfModel; }

	/**
	 * Sets the type of model.
	 *
	 * @param typeOfModel
	 *            the new type of model
	 */
	public void setTypeOfModel(final String typeOfModel) { this.typeOfModel = typeOfModel; }

	/**
	 * Gets the gama model.
	 *
	 * @return the gama model
	 */
	public IModel getGamaModel() { return gamaModel; }

	/**
	 * Sets the gama model.
	 *
	 * @param gamaModel
	 *            the new gama model
	 */
	public void setGamaModel(final IModel gamaModel) { this.gamaModel = gamaModel; }

	/**
	 * Gets the facets.
	 *
	 * @param statement
	 *            the statement
	 * @return the facets
	 */
	public List<String> getFacets(final ISymbol statement) {
		Facets fs = statement.getDescription().getFacets();
		ArrayList<String> a = new ArrayList<>();
		fs.forEach((key, value) -> { a.add(key); });
		return a;
	}

}