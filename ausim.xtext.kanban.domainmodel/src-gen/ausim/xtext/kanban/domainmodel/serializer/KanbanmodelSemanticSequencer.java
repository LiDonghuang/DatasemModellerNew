package ausim.xtext.kanban.domainmodel.serializer;

import ausim.xtext.kanban.domainmodel.kanbanmodel.Asset;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Capability;
import ausim.xtext.kanban.domainmodel.kanbanmodel.KSSBlock;
import ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem;
import ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanWorkFlow;
import ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Mechanism;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Requirement;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Service;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Task;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Team;
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
			case KanbanmodelPackage.KSS_BLOCK:
				if(context == grammarAccess.getKSSBlockRule()) {
					sequence_KSSBlock(context, (KSSBlock) semanticObject); 
					return; 
				}
				else break;
			case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM:
				if(context == grammarAccess.getKanbanSchedulingSystemRule()) {
					sequence_KanbanSchedulingSystem(context, (KanbanSchedulingSystem) semanticObject); 
					return; 
				}
				else break;
			case KanbanmodelPackage.KANBAN_WORK_FLOW:
				if(context == grammarAccess.getKanbanWorkFlowRule()) {
					sequence_KanbanWorkFlow(context, (KanbanWorkFlow) semanticObject); 
					return; 
				}
				else break;
			case KanbanmodelPackage.MECHANISM:
				if(context == grammarAccess.getMechanismRule()) {
					sequence_Mechanism(context, (Mechanism) semanticObject); 
					return; 
				}
				else break;
			case KanbanmodelPackage.REQUIREMENT:
				if(context == grammarAccess.getRequirementRule()) {
					sequence_Requirement(context, (Requirement) semanticObject); 
					return; 
				}
				else break;
			case KanbanmodelPackage.SERVICE:
				if(context == grammarAccess.getServiceRule()) {
					sequence_Service(context, (Service) semanticObject); 
					return; 
				}
				else break;
			case KanbanmodelPackage.TASK:
				if(context == grammarAccess.getTaskRule()) {
					sequence_Task(context, (Task) semanticObject); 
					return; 
				}
				else break;
			case KanbanmodelPackage.TEAM:
				if(context == grammarAccess.getTeamRule()) {
					sequence_Team(context, (Team) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID employedAt=[Team|ID]?)
	 */
	protected void sequence_Asset(EObject context, Asset semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID reqs+=Requirement+)
	 */
	protected void sequence_Capability(EObject context, Capability semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         assignedUnit=[Team|ID] 
	 *         demandUnits+=[Team|ID]* 
	 *         sourcedUnits+=[Team|ID]* 
	 *         rQueueLimit=INT? 
	 *         wipLimit=INT?
	 *     )
	 */
	protected void sequence_KSSBlock(EObject context, KSSBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID orgUnits+=Team+ kssTasks+=Task+ kssWorkFlow=KanbanWorkFlow)
	 */
	protected void sequence_KanbanSchedulingSystem(EObject context, KanbanSchedulingSystem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID caps+=Capability+)
	 */
	protected void sequence_KanbanWorkFlow(EObject context, KanbanWorkFlow semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (sourceTask=[Task|ID] targetTask=[Task|ID])
	 */
	protected void sequence_Mechanism(EObject context, Mechanism semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, KanbanmodelPackage.Literals.MECHANISM__SOURCE_TASK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KanbanmodelPackage.Literals.MECHANISM__SOURCE_TASK));
			if(transientValues.isValueTransient(semanticObject, KanbanmodelPackage.Literals.MECHANISM__TARGET_TASK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KanbanmodelPackage.Literals.MECHANISM__TARGET_TASK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMechanismAccess().getSourceTaskTaskIDTerminalRuleCall_0_0_1(), semanticObject.getSourceTask());
		feeder.accept(grammarAccess.getMechanismAccess().getTargetTaskTaskIDTerminalRuleCall_2_0_1(), semanticObject.getTargetTask());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID rTasks+=[Task|ID]+ mechanisms+=Mechanism*)
	 */
	protected void sequence_Requirement(EObject context, Requirement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Service(EObject context, Service semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, KanbanmodelPackage.Literals.SERVICE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KanbanmodelPackage.Literals.SERVICE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         sTasks+=[Task|ID]* 
	 *         taskMechanims+=Mechanism* 
	 *         reqSpecialties+=[Service|ID]* 
	 *         bvalue=INT? 
	 *         COS=ID?
	 *     )
	 */
	protected void sequence_Task(EObject context, Task semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         groupmembers+=[Team|ID]* 
	 *         resources+=Asset* 
	 *         teamProfile=ProfileType? 
	 *         services+=Service* 
	 *         kssBlock=KSSBlock?
	 *     )
	 */
	protected void sequence_Team(EObject context, Team semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
