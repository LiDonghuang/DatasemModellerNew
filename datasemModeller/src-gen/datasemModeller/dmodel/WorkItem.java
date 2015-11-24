/**
 */
package datasemModeller.dmodel;

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
 *   <li>{@link datasemModeller.dmodel.WorkItem#getName <em>Name</em>}</li>
 *   <li>{@link datasemModeller.dmodel.WorkItem#getType <em>Type</em>}</li>
 *   <li>{@link datasemModeller.dmodel.WorkItem#getDescription <em>Description</em>}</li>
 *   <li>{@link datasemModeller.dmodel.WorkItem#isHasPredecessors <em>Has Predecessors</em>}</li>
 *   <li>{@link datasemModeller.dmodel.WorkItem#getPTasks <em>PTasks</em>}</li>
 *   <li>{@link datasemModeller.dmodel.WorkItem#isHasSubtasks <em>Has Subtasks</em>}</li>
 *   <li>{@link datasemModeller.dmodel.WorkItem#getSTasks <em>STasks</em>}</li>
 *   <li>{@link datasemModeller.dmodel.WorkItem#getRequiredAnalysis <em>Required Analysis</em>}</li>
 *   <li>{@link datasemModeller.dmodel.WorkItem#isHasDecompositionMechanism <em>Has Decomposition Mechanism</em>}</li>
 *   <li>{@link datasemModeller.dmodel.WorkItem#getDecompositionMechanism <em>Decomposition Mechanism</em>}</li>
 *   <li>{@link datasemModeller.dmodel.WorkItem#getRequiredServices <em>Required Services</em>}</li>
 *   <li>{@link datasemModeller.dmodel.WorkItem#getMaturityLevels <em>Maturity Levels</em>}</li>
 *   <li>{@link datasemModeller.dmodel.WorkItem#getUncertainty <em>Uncertainty</em>}</li>
 *   <li>{@link datasemModeller.dmodel.WorkItem#getRisk <em>Risk</em>}</li>
 *   <li>{@link datasemModeller.dmodel.WorkItem#isHasImpacts <em>Has Impacts</em>}</li>
 *   <li>{@link datasemModeller.dmodel.WorkItem#getImpacts <em>Impacts</em>}</li>
 *   <li>{@link datasemModeller.dmodel.WorkItem#getValue <em>Value</em>}</li>
 *   <li>{@link datasemModeller.dmodel.WorkItem#getWorkSource <em>Work Source</em>}</li>
 *   <li>{@link datasemModeller.dmodel.WorkItem#getArrivalTime <em>Arrival Time</em>}</li>
 *   <li>{@link datasemModeller.dmodel.WorkItem#getDuration <em>Duration</em>}</li>
 *   <li>{@link datasemModeller.dmodel.WorkItem#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasemModeller.dmodel.DmodelPackage#getWorkItem()
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
   * @see datasemModeller.dmodel.DmodelPackage#getWorkItem_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.WorkItem#getName <em>Name</em>}' attribute.
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
   * @see datasemModeller.dmodel.DmodelPackage#getWorkItem_Type()
   * @model
   * @generated
   */
  WorkItemType getType();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.WorkItem#getType <em>Type</em>}' reference.
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
   * @see datasemModeller.dmodel.DmodelPackage#getWorkItem_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.WorkItem#getDescription <em>Description</em>}' attribute.
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
   * @see datasemModeller.dmodel.DmodelPackage#getWorkItem_HasPredecessors()
   * @model
   * @generated
   */
  boolean isHasPredecessors();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.WorkItem#isHasPredecessors <em>Has Predecessors</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Predecessors</em>' attribute.
   * @see #isHasPredecessors()
   * @generated
   */
  void setHasPredecessors(boolean value);

  /**
   * Returns the value of the '<em><b>PTasks</b></em>' reference list.
   * The list contents are of type {@link datasemModeller.dmodel.WorkItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>PTasks</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>PTasks</em>' reference list.
   * @see datasemModeller.dmodel.DmodelPackage#getWorkItem_PTasks()
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
   * @see datasemModeller.dmodel.DmodelPackage#getWorkItem_HasSubtasks()
   * @model
   * @generated
   */
  boolean isHasSubtasks();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.WorkItem#isHasSubtasks <em>Has Subtasks</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Subtasks</em>' attribute.
   * @see #isHasSubtasks()
   * @generated
   */
  void setHasSubtasks(boolean value);

  /**
   * Returns the value of the '<em><b>STasks</b></em>' reference list.
   * The list contents are of type {@link datasemModeller.dmodel.WorkItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>STasks</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>STasks</em>' reference list.
   * @see datasemModeller.dmodel.DmodelPackage#getWorkItem_STasks()
   * @model
   * @generated
   */
  EList<WorkItem> getSTasks();

  /**
   * Returns the value of the '<em><b>Required Analysis</b></em>' containment reference list.
   * The list contents are of type {@link datasemModeller.dmodel.RequiredService}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Required Analysis</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Required Analysis</em>' containment reference list.
   * @see datasemModeller.dmodel.DmodelPackage#getWorkItem_RequiredAnalysis()
   * @model containment="true"
   * @generated
   */
  EList<RequiredService> getRequiredAnalysis();

  /**
   * Returns the value of the '<em><b>Has Decomposition Mechanism</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Decomposition Mechanism</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Decomposition Mechanism</em>' attribute.
   * @see #setHasDecompositionMechanism(boolean)
   * @see datasemModeller.dmodel.DmodelPackage#getWorkItem_HasDecompositionMechanism()
   * @model
   * @generated
   */
  boolean isHasDecompositionMechanism();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.WorkItem#isHasDecompositionMechanism <em>Has Decomposition Mechanism</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Decomposition Mechanism</em>' attribute.
   * @see #isHasDecompositionMechanism()
   * @generated
   */
  void setHasDecompositionMechanism(boolean value);

  /**
   * Returns the value of the '<em><b>Decomposition Mechanism</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decomposition Mechanism</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decomposition Mechanism</em>' containment reference.
   * @see #setDecompositionMechanism(Mechanism)
   * @see datasemModeller.dmodel.DmodelPackage#getWorkItem_DecompositionMechanism()
   * @model containment="true"
   * @generated
   */
  Mechanism getDecompositionMechanism();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.WorkItem#getDecompositionMechanism <em>Decomposition Mechanism</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Decomposition Mechanism</em>' containment reference.
   * @see #getDecompositionMechanism()
   * @generated
   */
  void setDecompositionMechanism(Mechanism value);

  /**
   * Returns the value of the '<em><b>Required Services</b></em>' containment reference list.
   * The list contents are of type {@link datasemModeller.dmodel.RequiredService}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Required Services</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Required Services</em>' containment reference list.
   * @see datasemModeller.dmodel.DmodelPackage#getWorkItem_RequiredServices()
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
   * @see datasemModeller.dmodel.DmodelPackage#getWorkItem_MaturityLevels()
   * @model containment="true"
   * @generated
   */
  AbstractParameter getMaturityLevels();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.WorkItem#getMaturityLevels <em>Maturity Levels</em>}' containment reference.
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
   * @see datasemModeller.dmodel.DmodelPackage#getWorkItem_Uncertainty()
   * @model containment="true"
   * @generated
   */
  AbstractParameter getUncertainty();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.WorkItem#getUncertainty <em>Uncertainty</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uncertainty</em>' containment reference.
   * @see #getUncertainty()
   * @generated
   */
  void setUncertainty(AbstractParameter value);

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
   * @see datasemModeller.dmodel.DmodelPackage#getWorkItem_Risk()
   * @model containment="true"
   * @generated
   */
  AbstractParameter getRisk();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.WorkItem#getRisk <em>Risk</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Risk</em>' containment reference.
   * @see #getRisk()
   * @generated
   */
  void setRisk(AbstractParameter value);

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
   * @see datasemModeller.dmodel.DmodelPackage#getWorkItem_HasImpacts()
   * @model
   * @generated
   */
  boolean isHasImpacts();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.WorkItem#isHasImpacts <em>Has Impacts</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Impacts</em>' attribute.
   * @see #isHasImpacts()
   * @generated
   */
  void setHasImpacts(boolean value);

  /**
   * Returns the value of the '<em><b>Impacts</b></em>' containment reference list.
   * The list contents are of type {@link datasemModeller.dmodel.Impact}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Impacts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Impacts</em>' containment reference list.
   * @see datasemModeller.dmodel.DmodelPackage#getWorkItem_Impacts()
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
   * @see datasemModeller.dmodel.DmodelPackage#getWorkItem_Value()
   * @model containment="true"
   * @generated
   */
  NumExpression getValue();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.WorkItem#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(NumExpression value);

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
   * @see datasemModeller.dmodel.DmodelPackage#getWorkItem_WorkSource()
   * @model
   * @generated
   */
  WorkSource getWorkSource();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.WorkItem#getWorkSource <em>Work Source</em>}' reference.
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
   * @see datasemModeller.dmodel.DmodelPackage#getWorkItem_ArrivalTime()
   * @model
   * @generated
   */
  int getArrivalTime();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.WorkItem#getArrivalTime <em>Arrival Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arrival Time</em>' attribute.
   * @see #getArrivalTime()
   * @generated
   */
  void setArrivalTime(int value);

  /**
   * Returns the value of the '<em><b>Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Duration</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Duration</em>' attribute.
   * @see #setDuration(int)
   * @see datasemModeller.dmodel.DmodelPackage#getWorkItem_Duration()
   * @model
   * @generated
   */
  int getDuration();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.WorkItem#getDuration <em>Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Duration</em>' attribute.
   * @see #getDuration()
   * @generated
   */
  void setDuration(int value);

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
   * @see datasemModeller.dmodel.DmodelPackage#getWorkItem_Id()
   * @model
   * @generated
   */
  int getId();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.WorkItem#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(int value);

} // WorkItem
