/**
 */
package datasemModeller.dmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasemModeller.dmodel.RequiredService#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link datasemModeller.dmodel.RequiredService#getEfforts <em>Efforts</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasemModeller.dmodel.DmodelPackage#getRequiredService()
 * @model
 * @generated
 */
public interface RequiredService extends EObject
{
  /**
   * Returns the value of the '<em><b>Service Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service Type</em>' reference.
   * @see #setServiceType(Service)
   * @see datasemModeller.dmodel.DmodelPackage#getRequiredService_ServiceType()
   * @model
   * @generated
   */
  Service getServiceType();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.RequiredService#getServiceType <em>Service Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Service Type</em>' reference.
   * @see #getServiceType()
   * @generated
   */
  void setServiceType(Service value);

  /**
   * Returns the value of the '<em><b>Efforts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Efforts</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Efforts</em>' containment reference.
   * @see #setEfforts(AbstractParameter)
   * @see datasemModeller.dmodel.DmodelPackage#getRequiredService_Efforts()
   * @model containment="true"
   * @generated
   */
  AbstractParameter getEfforts();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.RequiredService#getEfforts <em>Efforts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Efforts</em>' containment reference.
   * @see #getEfforts()
   * @generated
   */
  void setEfforts(AbstractParameter value);

} // RequiredService
