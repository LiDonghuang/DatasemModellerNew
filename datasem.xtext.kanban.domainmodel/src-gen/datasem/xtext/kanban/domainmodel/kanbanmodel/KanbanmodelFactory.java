/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage
 * @generated
 */
public interface KanbanmodelFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  KanbanmodelFactory eINSTANCE = datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model Builder</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Builder</em>'.
   * @generated
   */
  ModelBuilder createModelBuilder();

  /**
   * Returns a new object of class '<em>Experiment Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Experiment Model</em>'.
   * @generated
   */
  ExperimentModel createExperimentModel();

  /**
   * Returns a new object of class '<em>System Libraries</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>System Libraries</em>'.
   * @generated
   */
  SystemLibraries createSystemLibraries();

  /**
   * Returns a new object of class '<em>User Libraries</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>User Libraries</em>'.
   * @generated
   */
  UserLibraries createUserLibraries();

  /**
   * Returns a new object of class '<em>Abstract Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Parameter</em>'.
   * @generated
   */
  AbstractParameter createAbstractParameter();

  /**
   * Returns a new object of class '<em>Num Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Num Expression</em>'.
   * @generated
   */
  NumExpression createNumExpression();

  /**
   * Returns a new object of class '<em>Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operator</em>'.
   * @generated
   */
  Operator createOperator();

  /**
   * Returns a new object of class '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable</em>'.
   * @generated
   */
  Variable createVariable();

  /**
   * Returns a new object of class '<em>Distribution</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Distribution</em>'.
   * @generated
   */
  Distribution createDistribution();

  /**
   * Returns a new object of class '<em>Event Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event Type</em>'.
   * @generated
   */
  EventType createEventType();

  /**
   * Returns a new object of class '<em>Condition Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condition Type</em>'.
   * @generated
   */
  ConditionType createConditionType();

  /**
   * Returns a new object of class '<em>Transition Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition Type</em>'.
   * @generated
   */
  TransitionType createTransitionType();

  /**
   * Returns a new object of class '<em>Process Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Process Model</em>'.
   * @generated
   */
  ProcessModel createProcessModel();

  /**
   * Returns a new object of class '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event</em>'.
   * @generated
   */
  Event createEvent();

  /**
   * Returns a new object of class '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condition</em>'.
   * @generated
   */
  Condition createCondition();

  /**
   * Returns a new object of class '<em>Transition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition</em>'.
   * @generated
   */
  Transition createTransition();

  /**
   * Returns a new object of class '<em>Agent Role Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Agent Role Type</em>'.
   * @generated
   */
  AgentRoleType createAgentRoleType();

  /**
   * Returns a new object of class '<em>WIN Replication</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>WIN Replication</em>'.
   * @generated
   */
  WINReplication createWINReplication();

  /**
   * Returns a new object of class '<em>Governance Strategy</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Governance Strategy</em>'.
   * @generated
   */
  GovernanceStrategy createGovernanceStrategy();

  /**
   * Returns a new object of class '<em>WI Acceptance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>WI Acceptance</em>'.
   * @generated
   */
  WIAcceptance createWIAcceptance();

  /**
   * Returns a new object of class '<em>WI Selection</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>WI Selection</em>'.
   * @generated
   */
  WISelection createWISelection();

  /**
   * Returns a new object of class '<em>WI Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>WI Assignment</em>'.
   * @generated
   */
  WIAssignment createWIAssignment();

  /**
   * Returns a new object of class '<em>Resource Allocation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource Allocation</em>'.
   * @generated
   */
  ResourceAllocation createResourceAllocation();

  /**
   * Returns a new object of class '<em>Resource Outsourcing</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource Outsourcing</em>'.
   * @generated
   */
  ResourceOutsourcing createResourceOutsourcing();

  /**
   * Returns a new object of class '<em>WI Acceptance Rule Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>WI Acceptance Rule Type</em>'.
   * @generated
   */
  WIAcceptanceRuleType createWIAcceptanceRuleType();

  /**
   * Returns a new object of class '<em>WI Selection Rule Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>WI Selection Rule Type</em>'.
   * @generated
   */
  WISelectionRuleType createWISelectionRuleType();

  /**
   * Returns a new object of class '<em>WI Assignment Rule Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>WI Assignment Rule Type</em>'.
   * @generated
   */
  WIAssignmentRuleType createWIAssignmentRuleType();

  /**
   * Returns a new object of class '<em>Resource Allocation Rule Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource Allocation Rule Type</em>'.
   * @generated
   */
  ResourceAllocationRuleType createResourceAllocationRuleType();

  /**
   * Returns a new object of class '<em>Resource Outsourcing Rule Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource Outsourcing Rule Type</em>'.
   * @generated
   */
  ResourceOutsourcingRuleType createResourceOutsourcingRuleType();

  /**
   * Returns a new object of class '<em>Mechanism</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mechanism</em>'.
   * @generated
   */
  Mechanism createMechanism();

  /**
   * Returns a new object of class '<em>Mechanism Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mechanism Attribute</em>'.
   * @generated
   */
  MechanismAttribute createMechanismAttribute();

  /**
   * Returns a new object of class '<em>Process</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Process</em>'.
   * @generated
   */
  Process createProcess();

  /**
   * Returns a new object of class '<em>Process Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Process Attribute</em>'.
   * @generated
   */
  ProcessAttribute createProcessAttribute();

  /**
   * Returns a new object of class '<em>Work Source</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Work Source</em>'.
   * @generated
   */
  WorkSource createWorkSource();

  /**
   * Returns a new object of class '<em>Work Item Network</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Work Item Network</em>'.
   * @generated
   */
  WorkItemNetwork createWorkItemNetwork();

  /**
   * Returns a new object of class '<em>Work Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Work Item</em>'.
   * @generated
   */
  WorkItem createWorkItem();

  /**
   * Returns a new object of class '<em>Causal Trigger</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Causal Trigger</em>'.
   * @generated
   */
  CausalTrigger createCausalTrigger();

  /**
   * Returns a new object of class '<em>Work Item Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Work Item Type</em>'.
   * @generated
   */
  WorkItemType createWorkItemType();

  /**
   * Returns a new object of class '<em>Value Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value Function</em>'.
   * @generated
   */
  ValueFunction createValueFunction();

  /**
   * Returns a new object of class '<em>Class Of Service</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Of Service</em>'.
   * @generated
   */
  ClassOfService createClassOfService();

  /**
   * Returns a new object of class '<em>Service</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service</em>'.
   * @generated
   */
  Service createService();

  /**
   * Returns a new object of class '<em>Service Provider</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service Provider</em>'.
   * @generated
   */
  ServiceProvider createServiceProvider();

  /**
   * Returns a new object of class '<em>Asset</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Asset</em>'.
   * @generated
   */
  Asset createAsset();

  /**
   * Returns a new object of class '<em>Skill</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Skill</em>'.
   * @generated
   */
  Skill createSkill();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  KanbanmodelPackage getKanbanmodelPackage();

} //KanbanmodelFactory
