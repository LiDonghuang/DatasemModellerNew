package ausim.xtext.kanban.domainmodel.serializer;

import ausim.xtext.kanban.domainmodel.kanbanmodel.Asset;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Capability;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Dependency;
import ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanGovModel;
import ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem;
import ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanTaskModel;
import ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Requirement;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Service;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Skill;
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
			case KanbanmodelPackage.DEPENDENCY:
				if(context == grammarAccess.getDependencyRule()) {
					sequence_Dependency(context, (Dependency) semanticObject); 
					return; 
				}
				else break;
			case KanbanmodelPackage.KANBAN_GOV_MODEL:
				if(context == grammarAccess.getKanbanGovModelRule()) {
					sequence_KanbanGovModel(context, (KanbanGovModel) semanticObject); 
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
			case KanbanmodelPackage.SKILL:
				if(context == grammarAccess.getSkillRule()) {
					sequence_Skill(context, (Skill) semanticObject); 
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
	 *     (name=ID hasSkills+=Skill*)
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
	 *     (sourceTask=[Task|ID] targetTask=[Task|ID])
	 */
	protected void sequence_Dependency(EObject context, Dependency semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, KanbanmodelPackage.Literals.DEPENDENCY__SOURCE_TASK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KanbanmodelPackage.Literals.DEPENDENCY__SOURCE_TASK));
			if(transientValues.isValueTransient(semanticObject, KanbanmodelPackage.Literals.DEPENDENCY__TARGET_TASK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KanbanmodelPackage.Literals.DEPENDENCY__TARGET_TASK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDependencyAccess().getSourceTaskTaskIDTerminalRuleCall_0_0_1(), semanticObject.getSourceTask());
		feeder.accept(grammarAccess.getDependencyAccess().getTargetTaskTaskIDTerminalRuleCall_2_0_1(), semanticObject.getTargetTask());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_KanbanGovModel(EObject context, KanbanGovModel semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, KanbanmodelPackage.Literals.KANBAN_GOV_MODEL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KanbanmodelPackage.Literals.KANBAN_GOV_MODEL__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getKanbanGovModelAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID orgUnits+=Team+ kssTasks+=Task+ kssWorkFlow=KanbanTaskModel kssGovModel=KanbanGovModel)
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
	 *     (name=ID rTasks+=[Task|ID]+ dependencies+=Dependency*)
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
	 *     name=ID
	 */
	protected void sequence_Skill(EObject context, Skill semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, KanbanmodelPackage.Literals.SKILL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KanbanmodelPackage.Literals.SKILL__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSkillAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         sTasks+=[Task|ID]* 
	 *         taskDependencies+=Dependency* 
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
	 *         demandUnits+=[Team|ID]* 
	 *         sourcedUnits+=[Team|ID]* 
	 *         groupmembers+=[Team|ID]* 
	 *         resources+=Asset* 
	 *         services+=Service*
	 *     )
	 */
	protected void sequence_Team(EObject context, Team semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
