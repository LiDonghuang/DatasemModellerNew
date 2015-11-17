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
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getType <em>Type</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getDescription <em>Description</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#isHasPredecessors <em>Has Predecessors</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getPTasks <em>PTasks</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#isHasSubtasks <em>Has Subtasks</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getSTasks <em>STasks</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getRequiredAnalysis <em>Required Analysis</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getRequiredServices <em>Required Services</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getMaturityLevels <em>Maturity Levels</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getUncertainty <em>Uncertainty</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#isHasImpacts <em>Has Impacts</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getImpacts <em>Impacts</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getValue <em>Value</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getRisk <em>Risk</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getClassOfService <em>Class Of Service</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getWorkSource <em>Work Source</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getArrivalTime <em>Arrival Time</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getId <em>Id</em>}</li>
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
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(WorkItemType)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItem_Type()
   * @model
   * @generated
   */
  WorkItemType getType();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(WorkItemType value);

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
   * Returns the value of the '<em><b>Has Predecessors</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Predecessors</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Predecessors</em>' attribute.
   * @see #setHasPredecessors(boolean)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItem_HasPredecessors()
   * @model
   * @generated
   */
  boolean isHasPredecessors();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#isHasPredecessors <em>Has Predecessors</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Predecessors</em>' attribute.
   * @see #isHasPredecessors()
   * @generated
   */
  void setHasPredecessors(boolean value);

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
   * Returns the value of the '<em><b>Has Subtasks</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Subtasks</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Subtasks</em>' attribute.
   * @see #setHasSubtasks(boolean)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItem_HasSubtasks()
   * @model
   * @generated
   */
  boolean isHasSubtasks();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#isHasSubtasks <em>Has Subtasks</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Subtasks</em>' attribute.
   * @see #isHasSubtasks()
   * @generated
   */
  void setHasSubtasks(boolean value);

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
   * Returns the value of the '<em><b>Required Analysis</b></em>' containment reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.RequiredService}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Required Analysis</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Required Analysis</em>' containment reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItem_RequiredAnalysis()
   * @model containment="true"
   * @generated
   */
  EList<RequiredService> getRequiredAnalysis();

  /**
   * Returns the value of the '<em><b>Required Services</b></em>' containment reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.RequiredService}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Required Services</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Required Services</em>' containment reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItem_RequiredServices()
   * @model containment="true"
   * @generated
   */
  EList<RequiredService> getRequiredServices();

  /**
   * Returns the value of the '<em><b>Maturity Levels</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Maturity Levels</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Maturity Levels</em>' containment reference.
   * @see #setMaturityLevels(AbstractParameter)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItem_MaturityLevels()
   * @model containment="true"
   * @generated
   */
  AbstractParameter getMaturityLevels();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getMaturityLevels <em>Maturity Levels</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Maturity Levels</em>' containment reference.
   * @see #getMaturityLevels()
   * @generated
   */
  void setMaturityLevels(AbstractParameter value);

  /**
   * Returns the value of the '<em><b>Uncertainty</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uncertainty</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uncertainty</em>' containment reference.
   * @see #setUncertainty(AbstractParameter)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItem_Uncertainty()
   * @model containment="true"
   * @generated
   */
  AbstractParameter getUncertainty();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getUncertainty <em>Uncertainty</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uncertainty</em>' containment reference.
   * @see #getUncertainty()
   * @generated
   */
  void setUncertainty(AbstractParameter value);

  /**
   * Returns the value of the '<em><b>Has Impacts</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Impacts</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Impacts</em>' attribute.
   * @see #setHasImpacts(boolean)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItem_HasImpacts()
   * @model
   * @generated
   */
  boolean isHasImpacts();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#isHasImpacts <em>Has Impacts</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Impacts</em>' attribute.
   * @see #isHasImpacts()
   * @generated
   */
  void setHasImpacts(boolean value);

  /**
   * Returns the value of the '<em><b>Impacts</b></em>' containment reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.Impact}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Impacts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Impacts</em>' containment reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItem_Impacts()
   * @model containment="true"
   * @generated
   */
  EList<Impact> getImpacts();

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(NumExpression)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItem_Value()
   * @model containment="true"
   * @generated
   */
  NumExpression getValue();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(NumExpression value);

  /**
   * Returns the value of the '<em><b>Risk</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Risk</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Risk</em>' containment reference.
   * @see #setRisk(AbstractParameter)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItem_Risk()
   * @model containment="true"
   * @generated
   */
  AbstractParameter getRisk();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getRisk <em>Risk</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Risk</em>' containment reference.
   * @see #getRisk()
   * @generated
   */
  void setRisk(AbstractParameter value);

  /**
   * Returns the value of the '<em><b>Class Of Service</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Of Service</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Of Service</em>' reference.
   * @see #setClassOfService(ClassOfService)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItem_ClassOfService()
   * @model
   * @generated
   */
  ClassOfService getClassOfService();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getClassOfService <em>Class Of Service</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Of Service</em>' reference.
   * @see #getClassOfService()
   * @generated
   */
  void setClassOfService(ClassOfService value);

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

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(int)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItem_Id()
   * @model
   * @generated
   */
  int getId();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(int value);

} // WorkItem
