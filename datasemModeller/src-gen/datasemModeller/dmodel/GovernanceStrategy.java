/**
 */
package datasemModeller.dmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Governance Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasemModeller.dmodel.GovernanceStrategy#getName <em>Name</em>}</li>
 *   <li>{@link datasemModeller.dmodel.GovernanceStrategy#getPullStrategy <em>Pull Strategy</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasemModeller.dmodel.DmodelPackage#getGovernanceStrategy()
 * @model
 * @generated
 */
public interface GovernanceStrategy extends EObject
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
   * @see datasemModeller.dmodel.DmodelPackage#getGovernanceStrategy_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.GovernanceStrategy#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Pull Strategy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pull Strategy</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pull Strategy</em>' containment reference.
   * @see #setPullStrategy(PullStrategy)
   * @see datasemModeller.dmodel.DmodelPackage#getGovernanceStrategy_PullStrategy()
   * @model containment="true"
   * @generated
   */
  PullStrategy getPullStrategy();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.GovernanceStrategy#getPullStrategy <em>Pull Strategy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pull Strategy</em>' containment reference.
   * @see #getPullStrategy()
   * @generated
   */
  void setPullStrategy(PullStrategy value);

} // GovernanceStrategy
