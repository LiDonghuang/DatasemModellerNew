/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kanban Scheduling System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getWIAcceptanceRuleTypes <em>WI Acceptance Rule Types</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getWISelectionRuleTypes <em>WI Selection Rule Types</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getWIAssignmentRuleTypes <em>WI Assignment Rule Types</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getResourceAllocationRuleTypes <em>Resource Allocation Rule Types</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getResourceOutsourcingRuleTypes <em>Resource Outsourcing Rule Types</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getProcessModels <em>Process Models</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getValueFunctions <em>Value Functions</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getTaskTypes <em>Task Types</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getTaskHierarchy <em>Task Hierarchy</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getClassOfServices <em>Class Of Services</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getServiceTypes <em>Service Types</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getGovernanceStrategies <em>Governance Strategies</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getRepositories <em>Repositories</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getName <em>Name</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getPath <em>Path</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getServiceProviders <em>Service Providers</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getWorkSources <em>Work Sources</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getWorkItems <em>Work Items</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getReplications <em>Replications</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getInterArrivalTime <em>Inter Arrival Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getKanbanSchedulingSystem()
 * @model
 * @generated
 */
public interface KanbanSchedulingSystem extends EObject
{
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
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getKanbanSchedulingSystem_WIAcceptanceRuleTypes()
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
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getKanbanSchedulingSystem_WISelectionRuleTypes()
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
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getKanbanSchedulingSystem_WIAssignmentRuleTypes()
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
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getKanbanSchedulingSystem_ResourceAllocationRuleTypes()
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
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getKanbanSchedulingSystem_ResourceOutsourcingRuleTypes()
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
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getKanbanSchedulingSystem_ProcessModels()
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
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getKanbanSchedulingSystem_ValueFunctions()
   * @model containment="true"
   * @generated
   */
  EList<ValueFunction> getValueFunctions();

  /**
   * Returns the value of the '<em><b>Task Types</b></em>' containment reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.TaskType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Task Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Task Types</em>' containment reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getKanbanSchedulingSystem_TaskTypes()
   * @model containment="true"
   * @generated
   */
  EList<TaskType> getTaskTypes();

  /**
   * Returns the value of the '<em><b>Task Hierarchy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Task Hierarchy</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Task Hierarchy</em>' containment reference.
   * @see #setTaskHierarchy(TaskHierarchy)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getKanbanSchedulingSystem_TaskHierarchy()
   * @model containment="true"
   * @generated
   */
  TaskHierarchy getTaskHierarchy();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getTaskHierarchy <em>Task Hierarchy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Task Hierarchy</em>' containment reference.
   * @see #getTaskHierarchy()
   * @generated
   */
  void setTaskHierarchy(TaskHierarchy value);

  /**
   * Returns the value of the '<em><b>Class Of Services</b></em>' containment reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.ClassOfService}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Of Services</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Of Services</em>' containment reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getKanbanSchedulingSystem_ClassOfServices()
   * @model containment="true"
   * @generated
   */
  EList<ClassOfService> getClassOfServices();

  /**
   * Returns the value of the '<em><b>Service Types</b></em>' containment reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service Types</em>' containment reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getKanbanSchedulingSystem_ServiceTypes()
   * @model containment="true"
   * @generated
   */
  EList<ServiceType> getServiceTypes();

  /**
   * Returns the value of the '<em><b>Governance Strategies</b></em>' containment reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Governance Strategies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Governance Strategies</em>' containment reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getKanbanSchedulingSystem_GovernanceStrategies()
   * @model containment="true"
   * @generated
   */
  EList<GovernanceStrategy> getGovernanceStrategies();

  /**
   * Returns the value of the '<em><b>Repositories</b></em>' containment reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.Repository}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Repositories</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Repositories</em>' containment reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getKanbanSchedulingSystem_Repositories()
   * @model containment="true"
   * @generated
   */
  EList<Repository> getRepositories();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getKanbanSchedulingSystem_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' attribute.
   * @see #setPath(String)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getKanbanSchedulingSystem_Path()
   * @model
   * @generated
   */
  String getPath();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getPath <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' attribute.
   * @see #getPath()
   * @generated
   */
  void setPath(String value);

  /**
   * Returns the value of the '<em><b>Service Providers</b></em>' containment reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service Providers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service Providers</em>' containment reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getKanbanSchedulingSystem_ServiceProviders()
   * @model containment="true"
   * @generated
   */
  EList<ServiceProvider> getServiceProviders();

  /**
   * Returns the value of the '<em><b>Work Sources</b></em>' containment reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkSource}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Work Sources</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Work Sources</em>' containment reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getKanbanSchedulingSystem_WorkSources()
   * @model containment="true"
   * @generated
   */
  EList<WorkSource> getWorkSources();

  /**
   * Returns the value of the '<em><b>Work Items</b></em>' containment reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Work Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Work Items</em>' containment reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getKanbanSchedulingSystem_WorkItems()
   * @model containment="true"
   * @generated
   */
  EList<WorkItem> getWorkItems();

  /**
   * Returns the value of the '<em><b>Replications</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Replications</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Replications</em>' attribute.
   * @see #setReplications(int)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getKanbanSchedulingSystem_Replications()
   * @model
   * @generated
   */
  int getReplications();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getReplications <em>Replications</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Replications</em>' attribute.
   * @see #getReplications()
   * @generated
   */
  void setReplications(int value);

  /**
   * Returns the value of the '<em><b>Inter Arrival Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inter Arrival Time</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inter Arrival Time</em>' attribute.
   * @see #setInterArrivalTime(int)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getKanbanSchedulingSystem_InterArrivalTime()
   * @model
   * @generated
   */
  int getInterArrivalTime();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getInterArrivalTime <em>Inter Arrival Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inter Arrival Time</em>' attribute.
   * @see #getInterArrivalTime()
   * @generated
   */
  void setInterArrivalTime(int value);

} // KanbanSchedulingSystem
