/**
 */
package datasemModeller.dmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Experiment Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasemModeller.dmodel.ExperimentModel#getName <em>Name</em>}</li>
 *   <li>{@link datasemModeller.dmodel.ExperimentModel#getExperimentVariables <em>Experiment Variables</em>}</li>
 *   <li>{@link datasemModeller.dmodel.ExperimentModel#getServiceProviders <em>Service Providers</em>}</li>
 *   <li>{@link datasemModeller.dmodel.ExperimentModel#getWorkItemNetworks <em>Work Item Networks</em>}</li>
 *   <li>{@link datasemModeller.dmodel.ExperimentModel#getWINReplications <em>WIN Replications</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasemModeller.dmodel.DmodelPackage#getExperimentModel()
 * @model
 * @generated
 */
public interface ExperimentModel extends EObject
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
   * @see datasemModeller.dmodel.DmodelPackage#getExperimentModel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.ExperimentModel#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Experiment Variables</b></em>' containment reference list.
   * The list contents are of type {@link datasemModeller.dmodel.ExperimentVariable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Experiment Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Experiment Variables</em>' containment reference list.
   * @see datasemModeller.dmodel.DmodelPackage#getExperimentModel_ExperimentVariables()
   * @model containment="true"
   * @generated
   */
  EList<ExperimentVariable> getExperimentVariables();

  /**
   * Returns the value of the '<em><b>Service Providers</b></em>' containment reference list.
   * The list contents are of type {@link datasemModeller.dmodel.ServiceProvider}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service Providers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service Providers</em>' containment reference list.
   * @see datasemModeller.dmodel.DmodelPackage#getExperimentModel_ServiceProviders()
   * @model containment="true"
   * @generated
   */
  EList<ServiceProvider> getServiceProviders();

  /**
   * Returns the value of the '<em><b>Work Item Networks</b></em>' containment reference list.
   * The list contents are of type {@link datasemModeller.dmodel.WorkItemNetwork}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Work Item Networks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Work Item Networks</em>' containment reference list.
   * @see datasemModeller.dmodel.DmodelPackage#getExperimentModel_WorkItemNetworks()
   * @model containment="true"
   * @generated
   */
  EList<WorkItemNetwork> getWorkItemNetworks();

  /**
   * Returns the value of the '<em><b>WIN Replications</b></em>' containment reference list.
   * The list contents are of type {@link datasemModeller.dmodel.WINReplication}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>WIN Replications</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>WIN Replications</em>' containment reference list.
   * @see datasemModeller.dmodel.DmodelPackage#getExperimentModel_WINReplications()
   * @model containment="true"
   * @generated
   */
  EList<WINReplication> getWINReplications();

} // ExperimentModel
