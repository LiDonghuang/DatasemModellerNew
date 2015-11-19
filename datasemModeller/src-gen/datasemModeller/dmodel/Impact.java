/**
 */
package datasemModeller.dmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Impact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasemModeller.dmodel.Impact#getImpactWI <em>Impact WI</em>}</li>
 *   <li>{@link datasemModeller.dmodel.Impact#getLikelihood <em>Likelihood</em>}</li>
 *   <li>{@link datasemModeller.dmodel.Impact#getRisk <em>Risk</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasemModeller.dmodel.DmodelPackage#getImpact()
 * @model
 * @generated
 */
public interface Impact extends EObject
{
  /**
   * Returns the value of the '<em><b>Impact WI</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Impact WI</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Impact WI</em>' reference.
   * @see #setImpactWI(WorkItem)
   * @see datasemModeller.dmodel.DmodelPackage#getImpact_ImpactWI()
   * @model
   * @generated
   */
  WorkItem getImpactWI();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.Impact#getImpactWI <em>Impact WI</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Impact WI</em>' reference.
   * @see #getImpactWI()
   * @generated
   */
  void setImpactWI(WorkItem value);

  /**
   * Returns the value of the '<em><b>Likelihood</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Likelihood</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Likelihood</em>' containment reference.
   * @see #setLikelihood(AbstractParameter)
   * @see datasemModeller.dmodel.DmodelPackage#getImpact_Likelihood()
   * @model containment="true"
   * @generated
   */
  AbstractParameter getLikelihood();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.Impact#getLikelihood <em>Likelihood</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Likelihood</em>' containment reference.
   * @see #getLikelihood()
   * @generated
   */
  void setLikelihood(AbstractParameter value);

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
   * @see datasemModeller.dmodel.DmodelPackage#getImpact_Risk()
   * @model containment="true"
   * @generated
   */
  AbstractParameter getRisk();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.Impact#getRisk <em>Risk</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Risk</em>' containment reference.
   * @see #getRisk()
   * @generated
   */
  void setRisk(AbstractParameter value);

} // Impact
