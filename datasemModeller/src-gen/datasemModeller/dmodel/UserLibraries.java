/**
 */
package datasemModeller.dmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Libraries</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasemModeller.dmodel.UserLibraries#getServiceProviderTypes <em>Service Provider Types</em>}</li>
 *   <li>{@link datasemModeller.dmodel.UserLibraries#getWorkItemTypes <em>Work Item Types</em>}</li>
 *   <li>{@link datasemModeller.dmodel.UserLibraries#getProcessModels <em>Process Models</em>}</li>
 *   <li>{@link datasemModeller.dmodel.UserLibraries#getClassOfServices <em>Class Of Services</em>}</li>
 *   <li>{@link datasemModeller.dmodel.UserLibraries#getServices <em>Services</em>}</li>
 *   <li>{@link datasemModeller.dmodel.UserLibraries#getGovernanceStrategies <em>Governance Strategies</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasemModeller.dmodel.DmodelPackage#getUserLibraries()
 * @model
 * @generated
 */
public interface UserLibraries extends EObject
{
  /**
   * Returns the value of the '<em><b>Service Provider Types</b></em>' containment reference list.
   * The list contents are of type {@link datasemModeller.dmodel.ServiceProviderType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service Provider Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service Provider Types</em>' containment reference list.
   * @see datasemModeller.dmodel.DmodelPackage#getUserLibraries_ServiceProviderTypes()
   * @model containment="true"
   * @generated
   */
  EList<ServiceProviderType> getServiceProviderTypes();

  /**
   * Returns the value of the '<em><b>Work Item Types</b></em>' containment reference list.
   * The list contents are of type {@link datasemModeller.dmodel.WorkItemType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Work Item Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Work Item Types</em>' containment reference list.
   * @see datasemModeller.dmodel.DmodelPackage#getUserLibraries_WorkItemTypes()
   * @model containment="true"
   * @generated
   */
  EList<WorkItemType> getWorkItemTypes();

  /**
   * Returns the value of the '<em><b>Process Models</b></em>' containment reference list.
   * The list contents are of type {@link datasemModeller.dmodel.ProcessModel}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Process Models</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Process Models</em>' containment reference list.
   * @see datasemModeller.dmodel.DmodelPackage#getUserLibraries_ProcessModels()
   * @model containment="true"
   * @generated
   */
  EList<ProcessModel> getProcessModels();

  /**
   * Returns the value of the '<em><b>Class Of Services</b></em>' containment reference list.
   * The list contents are of type {@link datasemModeller.dmodel.ClassOfService}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Of Services</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Of Services</em>' containment reference list.
   * @see datasemModeller.dmodel.DmodelPackage#getUserLibraries_ClassOfServices()
   * @model containment="true"
   * @generated
   */
  EList<ClassOfService> getClassOfServices();

  /**
   * Returns the value of the '<em><b>Services</b></em>' containment reference list.
   * The list contents are of type {@link datasemModeller.dmodel.Service}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Services</em>' containment reference list.
   * @see datasemModeller.dmodel.DmodelPackage#getUserLibraries_Services()
   * @model containment="true"
   * @generated
   */
  EList<Service> getServices();

  /**
   * Returns the value of the '<em><b>Governance Strategies</b></em>' containment reference list.
   * The list contents are of type {@link datasemModeller.dmodel.GovernanceStrategy}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Governance Strategies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Governance Strategies</em>' containment reference list.
   * @see datasemModeller.dmodel.DmodelPackage#getUserLibraries_GovernanceStrategies()
   * @model containment="true"
   * @generated
   */
  EList<GovernanceStrategy> getGovernanceStrategies();

} // UserLibraries
