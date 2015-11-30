/**
 */
package datasemModeller.dmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Provider Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasemModeller.dmodel.ServiceProviderType#getId <em>Id</em>}</li>
 *   <li>{@link datasemModeller.dmodel.ServiceProviderType#getName <em>Name</em>}</li>
 *   <li>{@link datasemModeller.dmodel.ServiceProviderType#getHierarchy <em>Hierarchy</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasemModeller.dmodel.DmodelPackage#getServiceProviderType()
 * @model
 * @generated
 */
public interface ServiceProviderType extends EObject
{
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
   * @see datasemModeller.dmodel.DmodelPackage#getServiceProviderType_Id()
   * @model
   * @generated
   */
  int getId();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.ServiceProviderType#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(int value);

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
   * @see datasemModeller.dmodel.DmodelPackage#getServiceProviderType_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.ServiceProviderType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Hierarchy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hierarchy</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hierarchy</em>' attribute.
   * @see #setHierarchy(int)
   * @see datasemModeller.dmodel.DmodelPackage#getServiceProviderType_Hierarchy()
   * @model
   * @generated
   */
  int getHierarchy();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.ServiceProviderType#getHierarchy <em>Hierarchy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hierarchy</em>' attribute.
   * @see #getHierarchy()
   * @generated
   */
  void setHierarchy(int value);

} // ServiceProviderType
