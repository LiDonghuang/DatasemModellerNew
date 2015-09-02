/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Libraries</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.SystemLibraries#getEventTypes <em>Event Types</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.SystemLibraries#getConditionTypes <em>Condition Types</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.SystemLibraries#getTransitionTypes <em>Transition Types</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.SystemLibraries#getWIAcceptanceRuleTypes <em>WI Acceptance Rule Types</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.SystemLibraries#getWISelectionRuleTypes <em>WI Selection Rule Types</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.SystemLibraries#getWIAssignmentRuleTypes <em>WI Assignment Rule Types</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.SystemLibraries#getResourceAllocationRuleTypes <em>Resource Allocation Rule Types</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.SystemLibraries#getResourceOutsourcingRuleTypes <em>Resource Outsourcing Rule Types</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.SystemLibraries#getProcessModels <em>Process Models</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.SystemLibraries#getValueFunctions <em>Value Functions</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getSystemLibraries()
 * @model
 * @generated
 */
public interface SystemLibraries extends EObject
{
  /**
   * Returns the value of the '<em><b>Event Types</b></em>' containment reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.EventType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event Types</em>' containment reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getSystemLibraries_EventTypes()
   * @model containment="true"
   * @generated
   */
  EList<EventType> getEventTypes();

  /**
   * Returns the value of the '<em><b>Condition Types</b></em>' containment reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.ConditionType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition Types</em>' containment reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getSystemLibraries_ConditionTypes()
   * @model containment="true"
   * @generated
   */
  EList<ConditionType> getConditionTypes();

  /**
   * Returns the value of the '<em><b>Transition Types</b></em>' containment reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.TransitionType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transition Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transition Types</em>' containment reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getSystemLibraries_TransitionTypes()
   * @model containment="true"
   * @generated
   */
  EList<TransitionType> getTransitionTypes();

  /**
   * Returns the value of the '<em><b>WI Acceptance Rule Types</b></em>' containment reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptanceRuleType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>WI Acceptance Rule Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>WI Acceptance Rule Types</em>' containment reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getSystemLibraries_WIAcceptanceRuleTypes()
   * @model containment="true"
   * @generated
   */
  EList<WIAcceptanceRuleType> getWIAcceptanceRuleTypes();

  /**
   * Returns the value of the '<em><b>WI Selection Rule Types</b></em>' containment reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.WISelectionRuleType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>WI Selection Rule Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>WI Selection Rule Types</em>' containment reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getSystemLibraries_WISelectionRuleTypes()
   * @model containment="true"
   * @generated
   */
  EList<WISelectionRuleType> getWISelectionRuleTypes();

  /**
   * Returns the value of the '<em><b>WI Assignment Rule Types</b></em>' containment reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.WIAssignmentRuleType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>WI Assignment Rule Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>WI Assignment Rule Types</em>' containment reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getSystemLibraries_WIAssignmentRuleTypes()
   * @model containment="true"
   * @generated
   */
  EList<WIAssignmentRuleType> getWIAssignmentRuleTypes();

  /**
   * Returns the value of the '<em><b>Resource Allocation Rule Types</b></em>' containment reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceAllocationRuleType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resource Allocation Rule Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resource Allocation Rule Types</em>' containment reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getSystemLibraries_ResourceAllocationRuleTypes()
   * @model containment="true"
   * @generated
   */
  EList<ResourceAllocationRuleType> getResourceAllocationRuleTypes();

  /**
   * Returns the value of the '<em><b>Resource Outsourcing Rule Types</b></em>' containment reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceOutsourcingRuleType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resource Outsourcing Rule Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resource Outsourcing Rule Types</em>' containment reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getSystemLibraries_ResourceOutsourcingRuleTypes()
   * @model containment="true"
   * @generated
   */
  EList<ResourceOutsourcingRuleType> getResourceOutsourcingRuleTypes();

  /**
   * Returns the value of the '<em><b>Process Models</b></em>' containment reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.ProcessModel}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Process Models</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Process Models</em>' containment reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getSystemLibraries_ProcessModels()
   * @model containment="true"
   * @generated
   */
  EList<ProcessModel> getProcessModels();

  /**
   * Returns the value of the '<em><b>Value Functions</b></em>' containment reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.ValueFunction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Functions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Functions</em>' containment reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getSystemLibraries_ValueFunctions()
   * @model containment="true"
   * @generated
   */
  EList<ValueFunction> getValueFunctions();

} // SystemLibraries
