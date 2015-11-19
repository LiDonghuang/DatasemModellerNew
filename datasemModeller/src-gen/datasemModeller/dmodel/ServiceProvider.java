/**
 */
package datasemModeller.dmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasemModeller.dmodel.ServiceProvider#getName <em>Name</em>}</li>
 *   <li>{@link datasemModeller.dmodel.ServiceProvider#getType <em>Type</em>}</li>
 *   <li>{@link datasemModeller.dmodel.ServiceProvider#getAssignTo <em>Assign To</em>}</li>
 *   <li>{@link datasemModeller.dmodel.ServiceProvider#getOutsourceFrom <em>Outsource From</em>}</li>
 *   <li>{@link datasemModeller.dmodel.ServiceProvider#getGovernanceStrategy <em>Governance Strategy</em>}</li>
 *   <li>{@link datasemModeller.dmodel.ServiceProvider#getResources <em>Resources</em>}</li>
 *   <li>{@link datasemModeller.dmodel.ServiceProvider#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasemModeller.dmodel.DmodelPackage#getServiceProvider()
 * @model
 * @generated
 */
public interface ServiceProvider extends EObject
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
   * @see datasemModeller.dmodel.DmodelPackage#getServiceProvider_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.ServiceProvider#getName <em>Name</em>}' attribute.
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
   * @see #setType(ServiceProviderType)
   * @see datasemModeller.dmodel.DmodelPackage#getServiceProvider_Type()
   * @model
   * @generated
   */
  ServiceProviderType getType();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.ServiceProvider#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(ServiceProviderType value);

  /**
   * Returns the value of the '<em><b>Assign To</b></em>' reference list.
   * The list contents are of type {@link datasemModeller.dmodel.ServiceProvider}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assign To</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assign To</em>' reference list.
   * @see datasemModeller.dmodel.DmodelPackage#getServiceProvider_AssignTo()
   * @model
   * @generated
   */
  EList<ServiceProvider> getAssignTo();

  /**
   * Returns the value of the '<em><b>Outsource From</b></em>' reference list.
   * The list contents are of type {@link datasemModeller.dmodel.ServiceProvider}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outsource From</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outsource From</em>' reference list.
   * @see datasemModeller.dmodel.DmodelPackage#getServiceProvider_OutsourceFrom()
   * @model
   * @generated
   */
  EList<ServiceProvider> getOutsourceFrom();

  /**
   * Returns the value of the '<em><b>Governance Strategy</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Governance Strategy</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Governance Strategy</em>' reference.
   * @see #setGovernanceStrategy(GovernanceStrategy)
   * @see datasemModeller.dmodel.DmodelPackage#getServiceProvider_GovernanceStrategy()
   * @model
   * @generated
   */
  GovernanceStrategy getGovernanceStrategy();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.ServiceProvider#getGovernanceStrategy <em>Governance Strategy</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Governance Strategy</em>' reference.
   * @see #getGovernanceStrategy()
   * @generated
   */
  void setGovernanceStrategy(GovernanceStrategy value);

  /**
   * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
   * The list contents are of type {@link datasemModeller.dmodel.Asset}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resources</em>' containment reference list.
   * @see datasemModeller.dmodel.DmodelPackage#getServiceProvider_Resources()
   * @model containment="true"
   * @generated
   */
  EList<Asset> getResources();

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
   * @see datasemModeller.dmodel.DmodelPackage#getServiceProvider_Id()
   * @model
   * @generated
   */
  int getId();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.ServiceProvider#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(int value);

} // ServiceProvider
