package ausim.xtext.kanban.domainmodel.serializer;

import ausim.xtext.kanban.domainmodel.kanbanmodel.Asset;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Capability;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Causality;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Command;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Entity;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Event;
import ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem;
import ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanTaskModel;
import ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Mechanism;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Provision;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Requirement;
import ausim.xtext.kanban.domainmodel.kanbanmodel.ResourceAllocation;
import ausim.xtext.kanban.domainmodel.kanbanmodel.ResourceOutsourcing;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Service;
import ausim.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider;
import ausim.xtext.kanban.domainmodel.kanbanmodel.ServiceType;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Skill;
import ausim.xtext.kanban.domainmodel.kanbanmodel.State;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Statemachine;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Strategy;
import ausim.xtext.kanban.domainmodel.kanbanmodel.TaskPattern;
import ausim.xtext.kanban.domainmodel.kanbanmodel.TaskType;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Transition;
import ausim.xtext.kanban.domainmodel.kanbanmodel.ValueFunction;
import ausim.xtext.kanban.domainmodel.kanbanmodel.WIAcceptance;
import ausim.xtext.kanban.domainmodel.kanbanmodel.WIAssignment;
import ausim.xtext.kanban.domainmodel.kanbanmodel.WISelection;
import ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItem;
import ausim.xtext.kanban.domainmodel.kanbanmodel.WorkSource;
import ausim.xtext.kanban.domainmodel.services.KanbanmodelGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class KanbanmodelSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private KanbanmodelGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == KanbanmodelPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case KanbanmodelPackage.ASSET:
				if(context == grammarAccess.getAssetRule()) {
					sequence_Asset(context, (Asset) semanticObject); 
					return; 
				}
				else break;
			case KanbanmodelPackage.CAPABILITY:
				if(context == grammarAccess.getCapabilityRule()) {
					sequence_Capability(context, (Capability) semanticObject); 
					return; 
				}
				else break;
			case KanbanmodelPackage.CAUSALITY:
				if(context == grammarAccess.getCausalityRule()) {
					sequence_Causality(context, (Causality) semanticObject); 
					return; 
				}
				else break;
			case KanbanmodelPackage.COMMAND:
				if(context == grammarAccess.getCommandRule()) {
					sequence_Command(context, (Command) semanticObject); 
					return; 
				}
				else break;
			case KanbanmodelPackage.ENTITY:
				if(context == grammarAccess.getEntityRule()) {
					sequence_Entity(context, (Entity) semanticObject); 
					return; 
				}
				else break;
			case KanbanmodelPackage.EVENT:
				if(context == grammarAccess.getEventRule()) {
					sequence_Event(context, (Event) semanticObject); 
					return; 
				}
				else break;
			case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM:
				if(context == grammarAccess.getKanbanSchedulingSystemRule()) {
					sequence_KanbanSchedulingSystem(context, (KanbanSchedulingSystem) semanticObject); 
					return; 
				}
				else break;
			case KanbanmodelPackage.KANBAN_TASK_MODEL:
				if(context == grammarAccess.getKanbanTaskModelRule()) {
					sequence_KanbanTaskModel(context, (KanbanTaskModel) semanticObject); 
					return; 
				}
				else break;
			case KanbanmodelPackage.MECHANISM:
				if(context == grammarAccess.getMechanismRule()) {
					sequence_Mechanism(context, (Mechanism) semanticObject); 
					return; 
				}
				else break;
			case KanbanmodelPackage.PROVISION:
				if(context == grammarAccess.getProvisionRule()) {
					sequence_Provision(context, (Provision) semanticObject); 
					return; 
				}
				else break;
			case KanbanmodelPackage.REQUIREMENT:
				if(context == grammarAccess.getRequirementRule()) {
					sequence_Requirement(context, (Requirement) semanticObject); 
					return; 
				}
				else break;
			case KanbanmodelPackage.RESOURCE_ALLOCATION:
				if(context == grammarAccess.getResourceAllocationRule()) {
					sequence_ResourceAllocation(context, (ResourceAllocation) semanticObject); 
					return; 
				}
				else break;
			case KanbanmodelPackage.RESOURCE_OUTSOURCING:
				if(context == grammarAccess.getResourceOutsourcingRule()) {
					sequence_ResourceOutsourcing(context, (ResourceOutsourcing) semanticObject); 
					return; 
				}
				else break;
			case KanbanmodelPackage.SERVICE:
				if(context == grammarAccess.getServiceRule()) {
					sequence_Service(context, (Service) semanticObject); 
					return; 
				}
				else break;
			case KanbanmodelPackage.SERVICE_PROVIDER:
				if(context == grammarAccess.getServiceProviderRule()) {
					sequence_ServiceProvider(context, (ServiceProvider) semanticObject); 
					return; 
				}
				else break;
			case KanbanmodelPackage.SERVICE_TYPE:
				if(context == grammarAccess.getServiceTypeRule()) {
					sequence_ServiceType(context, (ServiceType) semanticObject); 
					return; 
				}
				else break;
			case KanbanmodelPackage.SKILL:
				if(context == grammarAccess.getSkillRule()) {
					sequence_Skill(context, (Skill) semanticObject); 
					return; 
				}
				else break;
			case KanbanmodelPackage.STATE:
				if(context == grammarAccess.getStateRule()) {
					sequence_State(context, (State) semanticObject); 
					return; 
				}
				else break;
			case KanbanmodelPackage.STATEMACHINE:
				if(context == grammarAccess.getStatemachineRule()) {
					sequence_Statemachine(context, (Statemachine) semanticObject); 
					return; 
				}
				else break;
			case KanbanmodelPackage.STRATEGY:
				if(context == grammarAccess.getStrategyRule()) {
					sequence_Strategy(context, (Strategy) semanticObject); 
					return; 
				}
				else break;
			case KanbanmodelPackage.TASK_PATTERN:
				if(context == grammarAccess.getTaskPatternRule()) {
					sequence_TaskPattern(context, (TaskPattern) semanticObject); 
					return; 
				}
				else break;
			case KanbanmodelPackage.TASK_TYPE:
				if(context == grammarAccess.getTaskTypeRule()) {
					sequence_TaskType(context, (TaskType) semanticObject); 
					return; 
				}
				else break;
			case KanbanmodelPackage.TRANSITION:
				if(context == grammarAccess.getTransitionRule()) {
					sequence_Transition(context, (Transition) semanticObject); 
					return; 
				}
				else break;
			case KanbanmodelPackage.VALUE_FUNCTION:
				if(context == grammarAccess.getValueFunctionRule()) {
					sequence_ValueFunction(context, (ValueFunction) semanticObject); 
					return; 
				}
				else break;
			case KanbanmodelPackage.WI_ACCEPTANCE:
				if(context == grammarAccess.getWIAcceptanceRule()) {
					sequence_WIAcceptance(context, (WIAcceptance) semanticObject); 
					return; 
				}
				else break;
			case KanbanmodelPackage.WI_ASSIGNMENT:
				if(context == grammarAccess.getWIAssignmentRule()) {
					sequence_WIAssignment(context, (WIAssignment) semanticObject); 
					return; 
				}
				else break;
			case KanbanmodelPackage.WI_SELECTION:
				if(context == grammarAccess.getWISelectionRule()) {
					sequence_WISelection(context, (WISelection) semanticObject); 
					return; 
				}
				else break;
			case KanbanmodelPackage.WORK_ITEM:
				if(context == grammarAccess.getWorkItemRule()) {
					sequence_WorkItem(context, (WorkItem) semanticObject); 
					return; 
				}
				else break;
			case KanbanmodelPackage.WORK_SOURCE:
				if(context == grammarAccess.getWorkSourceRule()) {
					sequence_WorkSource(context, (WorkSource) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING? hasSkills+=Skill+)
	 */
	protected void sequence_Asset(EObject context, Asset semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING? reqs+=Requirement+)
	 */
	protected void sequence_Capability(EObject context, Capability semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (triggered+=[WorkItem|ID]+ tProgress=INT? tProbability=INT?)
	 */
	protected void sequence_Causality(EObject context, Causality semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID code=ID)
	 */
	protected void sequence_Command(EObject context, Command semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, KanbanmodelPackage.Literals.COMMAND__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KanbanmodelPackage.Literals.COMMAND__NAME));
			if(transientValues.isValueTransient(semanticObject, KanbanmodelPackage.Literals.COMMAND__CODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KanbanmodelPackage.Literals.COMMAND__CODE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCommandAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCommandAccess().getCodeIDTerminalRuleCall_1_0(), semanticObject.getCode());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (sdname=ID serviceProvisions+=Provision*)? entityBehavior=Statemachine)
	 */
	protected void sequence_Entity(EObject context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID code=ID)
	 */
	protected void sequence_Event(EObject context, Event semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, KanbanmodelPackage.Literals.EVENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KanbanmodelPackage.Literals.EVENT__NAME));
			if(transientValues.isValueTransient(semanticObject, KanbanmodelPackage.Literals.EVENT__CODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KanbanmodelPackage.Literals.EVENT__CODE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEventAccess().getCodeIDTerminalRuleCall_1_0(), semanticObject.getCode());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         Mechanisms+=Mechanism? 
	 *         KSSSearchStrategies+=Strategy* 
	 *         (KSSTaskPatterns+=TaskPattern+ KSStaskPatternTypes+=TaskType+)? 
	 *         KSSValueFunctions+=ValueFunction* 
	 *         SoSServices+=ServiceType+ 
	 *         orgUnits+=ServiceProvider+ 
	 *         kssSources+=WorkSource+ 
	 *         kssWItems+=WorkItem+ 
	 *         replications=INT 
	 *         interArrivalTime=INT
	 *     )
	 */
	protected void sequence_KanbanSchedulingSystem(EObject context, KanbanSchedulingSystem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID caps+=Capability+)
	 */
	protected void sequence_KanbanTaskModel(EObject context, KanbanTaskModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING? processtype=STRING Strategies+=Strategy+)
	 */
	protected void sequence_Mechanism(EObject context, Mechanism semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (serviceName=[ServiceType|ID] providers+=[ServiceProvider|ID]*)
	 */
	protected void sequence_Provision(EObject context, Provision semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING? rTasks+=[WorkItem|ID]+ dependencies+=Causality*)
	 */
	protected void sequence_Requirement(EObject context, Requirement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING?)
	 */
	protected void sequence_ResourceAllocation(EObject context, ResourceAllocation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING?)
	 */
	protected void sequence_ResourceOutsourcing(EObject context, ResourceOutsourcing semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         description=STRING? 
	 *         sourceUnits+=[ServiceProvider|ID]* 
	 *         targetUnits+=[ServiceProvider|ID]* 
	 *         subordinateUnits+=[ServiceProvider|ID]* 
	 *         resources+=Asset* 
	 *         services+=Service* 
	 *         (
	 *             defaultStrategy=[Strategy|ID] 
	 *             (
	 *                 acceptanceRule=WIAcceptance? 
	 *                 selectionRule=WISelection? 
	 *                 assignmentRule=WIAssignment? 
	 *                 allocationRule=ResourceAllocation? 
	 *                 outsourcingRule=ResourceOutsourcing?
	 *             )?
	 *         )?
	 *     )
	 */
	protected void sequence_ServiceProvider(EObject context, ServiceProvider semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING?)
	 */
	protected void sequence_ServiceType(EObject context, ServiceType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (description=STRING? serviceType=[ServiceType|ID] efficiency=INT?)?)
	 */
	protected void sequence_Service(EObject context, Service semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING?)
	 */
	protected void sequence_Skill(EObject context, Skill semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID actions+=[Command|ID]* transitions+=Transition*)
	 */
	protected void sequence_State(EObject context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (events+=Event* commands+=Command* states+=State*)
	 */
	protected void sequence_Statemachine(EObject context, Statemachine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         description=STRING? 
	 *         WIAcceptanceRule=WIAcceptance 
	 *         WISelectionRule=WISelection 
	 *         WIAssignmentRule=WIAssignment 
	 *         ResourceAllocationRule=ResourceAllocation 
	 *         ResourceOutsourcingRule=ResourceOutsourcing
	 *     )
	 */
	protected void sequence_Strategy(EObject context, Strategy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING? taskpatternTypes+=[TaskType|ID]*)
	 */
	protected void sequence_TaskPattern(EObject context, TaskPattern semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING?)
	 */
	protected void sequence_TaskType(EObject context, TaskType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((event=[Event|ID] state=[State|ID]) | (event=[Event|ID] eventactions+=[Command|ID]+ state=[State|ID]))
	 */
	protected void sequence_Transition(EObject context, Transition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING?)
	 */
	protected void sequence_ValueFunction(EObject context, ValueFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING? backlogQLimit=INT? readyQLimit=INT?)
	 */
	protected void sequence_WIAcceptance(EObject context, WIAcceptance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING?)
	 */
	protected void sequence_WIAssignment(EObject context, WIAssignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING?)
	 */
	protected void sequence_WISelection(EObject context, WISelection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         description=STRING? 
	 *         pattern=[TaskPattern|ID]? 
	 *         patternType=[TaskType|ID]? 
	 *         pTasks+=[WorkItem|ID]* 
	 *         sTasks+=[WorkItem|ID]* 
	 *         causalTriggers+=Causality* 
	 *         reqSpecialties+=[ServiceType|ID]* 
	 *         befforts=INT? 
	 *         bvalue=INT? 
	 *         COS=ID? 
	 *         wItemSource=[WorkSource|ID]? 
	 *         arrtime=INT? 
	 *         duedate=INT?
	 *     )
	 */
	protected void sequence_WorkItem(EObject context, WorkItem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING? assignmentRule=WIAssignment?)
	 */
	protected void sequence_WorkSource(EObject context, WorkSource semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
