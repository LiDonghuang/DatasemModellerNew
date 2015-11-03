/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract Net Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ContractNetProtocol#getDescription <em>Description</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ContractNetProtocol#getVariables <em>Variables</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ContractNetProtocol#getRoleBehaviors <em>Role Behaviors</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ContractNetProtocol#getProcesses <em>Processes</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getContractNetProtocol()
 * @model
 * @generated
 */
public interface ContractNetProtocol extends EObject
{
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
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getContractNetProtocol_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ContractNetProtocol#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.Variable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getContractNetProtocol_Variables()
   * @model containment="true"
   * @generated
   */
  EList<Variable> getVariables();

  /**
   * Returns the value of the '<em><b>Role Behaviors</b></em>' containment reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.RoleBehavior}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Role Behaviors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Role Behaviors</em>' containment reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getContractNetProtocol_RoleBehaviors()
   * @model containment="true"
   * @generated
   */
  EList<RoleBehavior> getRoleBehaviors();

  /**
   * Returns the value of the '<em><b>Processes</b></em>' reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.ProcessModel}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Processes</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Processes</em>' reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getContractNetProtocol_Processes()
   * @model
   * @generated
   */
  EList<ProcessModel> getProcesses();

} // ContractNetProtocol
