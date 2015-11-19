/**
 */
package datasemModeller.dmodel;

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
 *   <li>{@link datasemModeller.dmodel.ContractNetProtocol#getMechanisms <em>Mechanisms</em>}</li>
 *   <li>{@link datasemModeller.dmodel.ContractNetProtocol#getVariables <em>Variables</em>}</li>
 *   <li>{@link datasemModeller.dmodel.ContractNetProtocol#getRoleBehaviors <em>Role Behaviors</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasemModeller.dmodel.DmodelPackage#getContractNetProtocol()
 * @model
 * @generated
 */
public interface ContractNetProtocol extends EObject
{
  /**
   * Returns the value of the '<em><b>Mechanisms</b></em>' containment reference list.
   * The list contents are of type {@link datasemModeller.dmodel.Mechanism}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mechanisms</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mechanisms</em>' containment reference list.
   * @see datasemModeller.dmodel.DmodelPackage#getContractNetProtocol_Mechanisms()
   * @model containment="true"
   * @generated
   */
  EList<Mechanism> getMechanisms();

  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
   * The list contents are of type {@link datasemModeller.dmodel.Variable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference list.
   * @see datasemModeller.dmodel.DmodelPackage#getContractNetProtocol_Variables()
   * @model containment="true"
   * @generated
   */
  EList<Variable> getVariables();

  /**
   * Returns the value of the '<em><b>Role Behaviors</b></em>' containment reference list.
   * The list contents are of type {@link datasemModeller.dmodel.RoleBehavior}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Role Behaviors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Role Behaviors</em>' containment reference list.
   * @see datasemModeller.dmodel.DmodelPackage#getContractNetProtocol_RoleBehaviors()
   * @model containment="true"
   * @generated
   */
  EList<RoleBehavior> getRoleBehaviors();

} // ContractNetProtocol
