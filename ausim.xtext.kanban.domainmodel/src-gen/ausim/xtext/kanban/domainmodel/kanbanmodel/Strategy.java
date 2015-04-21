/**
 */
package ausim.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Strategy#getName <em>Name</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Strategy#getDescription <em>Description</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Strategy#getWIAcceptance <em>WI Acceptance</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Strategy#getWISelection <em>WI Selection</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Strategy#getWIAssignment <em>WI Assignment</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Strategy#getResourceAllocation <em>Resource Allocation</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Strategy#getResourceOutsourcing <em>Resource Outsourcing</em>}</li>
 * </ul>
 * </p>
 *
 * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getStrategy()
 * @model
 * @generated
 */
public interface Strategy extends EObject
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
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getStrategy_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Strategy#getName <em>Name</em>}' attribute.
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
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getStrategy_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Strategy#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>WI Acceptance</b></em>' containment reference list.
   * The list contents are of type {@link ausim.xtext.kanban.domainmodel.kanbanmodel.WIAcceptance}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>WI Acceptance</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>WI Acceptance</em>' containment reference list.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getStrategy_WIAcceptance()
   * @model containment="true"
   * @generated
   */
  EList<WIAcceptance> getWIAcceptance();

  /**
   * Returns the value of the '<em><b>WI Selection</b></em>' containment reference list.
   * The list contents are of type {@link ausim.xtext.kanban.domainmodel.kanbanmodel.WISelection}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>WI Selection</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>WI Selection</em>' containment reference list.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getStrategy_WISelection()
   * @model containment="true"
   * @generated
   */
  EList<WISelection> getWISelection();

  /**
   * Returns the value of the '<em><b>WI Assignment</b></em>' containment reference list.
   * The list contents are of type {@link ausim.xtext.kanban.domainmodel.kanbanmodel.WIAssignment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>WI Assignment</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>WI Assignment</em>' containment reference list.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getStrategy_WIAssignment()
   * @model containment="true"
   * @generated
   */
  EList<WIAssignment> getWIAssignment();

  /**
   * Returns the value of the '<em><b>Resource Allocation</b></em>' containment reference list.
   * The list contents are of type {@link ausim.xtext.kanban.domainmodel.kanbanmodel.ResourceAllocation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resource Allocation</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resource Allocation</em>' containment reference list.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getStrategy_ResourceAllocation()
   * @model containment="true"
   * @generated
   */
  EList<ResourceAllocation> getResourceAllocation();

  /**
   * Returns the value of the '<em><b>Resource Outsourcing</b></em>' containment reference list.
   * The list contents are of type {@link ausim.xtext.kanban.domainmodel.kanbanmodel.ResourceOutsourcing}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resource Outsourcing</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resource Outsourcing</em>' containment reference list.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getStrategy_ResourceOutsourcing()
   * @model containment="true"
   * @generated
   */
  EList<ResourceOutsourcing> getResourceOutsourcing();

} // Strategy
