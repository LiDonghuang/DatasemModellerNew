/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getName <em>Name</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getProfile <em>Profile</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getDescription <em>Description</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getPattern <em>Pattern</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getPatternType <em>Pattern Type</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getPTasks <em>PTasks</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getSTasks <em>STasks</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getCausalTriggers <em>Causal Triggers</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getRequiredServices <em>Required Services</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getEfforts <em>Efforts</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getValue <em>Value</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getClassOfService <em>Class Of Service</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getWorkSource <em>Work Source</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getArrivalTime <em>Arrival Time</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getDueDate <em>Due Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItem()
 * @model
 * @generated
 */
public interface WorkItem extends EObject
{
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
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItem_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Profile</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Profile</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Profile</em>' reference.
   * @see #setProfile(WorkItemProfile)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItem_Profile()
   * @model
   * @generated
   */
  WorkItemProfile getProfile();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getProfile <em>Profile</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Profile</em>' reference.
   * @see #getProfile()
   * @generated
   */
  void setProfile(WorkItemProfile value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItem_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Pattern</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' reference.
   * @see #setPattern(TaskPattern)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItem_Pattern()
   * @model
   * @generated
   */
  TaskPattern getPattern();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getPattern <em>Pattern</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern</em>' reference.
   * @see #getPattern()
   * @generated
   */
  void setPattern(TaskPattern value);

  /**
   * Returns the value of the '<em><b>Pattern Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern Type</em>' reference.
   * @see #setPatternType(TaskType)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItem_PatternType()
   * @model
   * @generated
   */
  TaskType getPatternType();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getPatternType <em>Pattern Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern Type</em>' reference.
   * @see #getPatternType()
   * @generated
   */
  void setPatternType(TaskType value);

  /**
   * Returns the value of the '<em><b>PTasks</b></em>' reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>PTasks</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>PTasks</em>' reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItem_PTasks()
   * @model
   * @generated
   */
  EList<WorkItem> getPTasks();

  /**
   * Returns the value of the '<em><b>STasks</b></em>' reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>STasks</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>STasks</em>' reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItem_STasks()
   * @model
   * @generated
   */
  EList<WorkItem> getSTasks();

  /**
   * Returns the value of the '<em><b>Causal Triggers</b></em>' containment reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.Causality}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Causal Triggers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Causal Triggers</em>' containment reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItem_CausalTriggers()
   * @model containment="true"
   * @generated
   */
  EList<Causality> getCausalTriggers();

  /**
   * Returns the value of the '<em><b>Required Services</b></em>' reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Required Services</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Required Services</em>' reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItem_RequiredServices()
   * @model
   * @generated
   */
  EList<ServiceType> getRequiredServices();

  /**
   * Returns the value of the '<em><b>Efforts</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Efforts</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Efforts</em>' attribute.
   * @see #setEfforts(String)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItem_Efforts()
   * @model
   * @generated
   */
  String getEfforts();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getEfforts <em>Efforts</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Efforts</em>' attribute.
   * @see #getEfforts()
   * @generated
   */
  void setEfforts(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItem_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Class Of Service</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Of Service</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Of Service</em>' attribute.
   * @see #setClassOfService(String)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItem_ClassOfService()
   * @model
   * @generated
   */
  String getClassOfService();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getClassOfService <em>Class Of Service</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Of Service</em>' attribute.
   * @see #getClassOfService()
   * @generated
   */
  void setClassOfService(String value);

  /**
   * Returns the value of the '<em><b>Work Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Work Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Work Source</em>' reference.
   * @see #setWorkSource(WorkSource)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItem_WorkSource()
   * @model
   * @generated
   */
  WorkSource getWorkSource();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getWorkSource <em>Work Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Work Source</em>' reference.
   * @see #getWorkSource()
   * @generated
   */
  void setWorkSource(WorkSource value);

  /**
   * Returns the value of the '<em><b>Arrival Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arrival Time</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arrival Time</em>' attribute.
   * @see #setArrivalTime(int)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItem_ArrivalTime()
   * @model
   * @generated
   */
  int getArrivalTime();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getArrivalTime <em>Arrival Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arrival Time</em>' attribute.
   * @see #getArrivalTime()
   * @generated
   */
  void setArrivalTime(int value);

  /**
   * Returns the value of the '<em><b>Due Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Due Date</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Due Date</em>' attribute.
   * @see #setDueDate(int)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItem_DueDate()
   * @model
   * @generated
   */
  int getDueDate();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getDueDate <em>Due Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Due Date</em>' attribute.
   * @see #getDueDate()
   * @generated
   */
  void setDueDate(int value);

} // WorkItem
