/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Item Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getName <em>Name</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getDescription <em>Description</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getProcessModel <em>Process Model</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getReferences <em>References</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getDecompositions <em>Decompositions</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getRequiredServices <em>Required Services</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getEfforts <em>Efforts</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getValue <em>Value</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getClassOfService <em>Class Of Service</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#isAllowAssignment <em>Allow Assignment</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#isAllowDiscard <em>Allow Discard</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItemProfile()
 * @model
 * @generated
 */
public interface WorkItemProfile extends EObject
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
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItemProfile_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItemProfile_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Process Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Process Model</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Process Model</em>' reference.
   * @see #setProcessModel(ProcessModel)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItemProfile_ProcessModel()
   * @model
   * @generated
   */
  ProcessModel getProcessModel();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getProcessModel <em>Process Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Process Model</em>' reference.
   * @see #getProcessModel()
   * @generated
   */
  void setProcessModel(ProcessModel value);

  /**
   * Returns the value of the '<em><b>References</b></em>' containment reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkReference}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>References</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>References</em>' containment reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItemProfile_References()
   * @model containment="true"
   * @generated
   */
  EList<WorkReference> getReferences();

  /**
   * Returns the value of the '<em><b>Decompositions</b></em>' containment reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkDecomposition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decompositions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decompositions</em>' containment reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItemProfile_Decompositions()
   * @model containment="true"
   * @generated
   */
  EList<WorkDecomposition> getDecompositions();

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
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItemProfile_RequiredServices()
   * @model
   * @generated
   */
  EList<ServiceType> getRequiredServices();

  /**
   * Returns the value of the '<em><b>Efforts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Efforts</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Efforts</em>' containment reference.
   * @see #setEfforts(NumExpression)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItemProfile_Efforts()
   * @model containment="true"
   * @generated
   */
  NumExpression getEfforts();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getEfforts <em>Efforts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Efforts</em>' containment reference.
   * @see #getEfforts()
   * @generated
   */
  void setEfforts(NumExpression value);

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
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItemProfile_Value()
   * @model containment="true"
   * @generated
   */
  NumExpression getValue();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(NumExpression value);

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
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItemProfile_ClassOfService()
   * @model
   * @generated
   */
  ClassOfService getClassOfService();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getClassOfService <em>Class Of Service</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Of Service</em>' reference.
   * @see #getClassOfService()
   * @generated
   */
  void setClassOfService(ClassOfService value);

  /**
   * Returns the value of the '<em><b>Allow Assignment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Allow Assignment</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Allow Assignment</em>' attribute.
   * @see #setAllowAssignment(boolean)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItemProfile_AllowAssignment()
   * @model
   * @generated
   */
  boolean isAllowAssignment();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#isAllowAssignment <em>Allow Assignment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Allow Assignment</em>' attribute.
   * @see #isAllowAssignment()
   * @generated
   */
  void setAllowAssignment(boolean value);

  /**
   * Returns the value of the '<em><b>Allow Discard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Allow Discard</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Allow Discard</em>' attribute.
   * @see #setAllowDiscard(boolean)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWorkItemProfile_AllowDiscard()
   * @model
   * @generated
   */
  boolean isAllowDiscard();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#isAllowDiscard <em>Allow Discard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Allow Discard</em>' attribute.
   * @see #isAllowDiscard()
   * @generated
   */
  void setAllowDiscard(boolean value);

} // WorkItemProfile
