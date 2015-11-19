/**
 */
package datasemModeller.dmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WIN Replication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasemModeller.dmodel.WINReplication#getWorkItemNetwork <em>Work Item Network</em>}</li>
 *   <li>{@link datasemModeller.dmodel.WINReplication#getNumReplications <em>Num Replications</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasemModeller.dmodel.DmodelPackage#getWINReplication()
 * @model
 * @generated
 */
public interface WINReplication extends EObject
{
  /**
   * Returns the value of the '<em><b>Work Item Network</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Work Item Network</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Work Item Network</em>' reference.
   * @see #setWorkItemNetwork(WorkItemNetwork)
   * @see datasemModeller.dmodel.DmodelPackage#getWINReplication_WorkItemNetwork()
   * @model
   * @generated
   */
  WorkItemNetwork getWorkItemNetwork();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.WINReplication#getWorkItemNetwork <em>Work Item Network</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Work Item Network</em>' reference.
   * @see #getWorkItemNetwork()
   * @generated
   */
  void setWorkItemNetwork(WorkItemNetwork value);

  /**
   * Returns the value of the '<em><b>Num Replications</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Num Replications</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Num Replications</em>' attribute.
   * @see #setNumReplications(int)
   * @see datasemModeller.dmodel.DmodelPackage#getWINReplication_NumReplications()
   * @model
   * @generated
   */
  int getNumReplications();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.WINReplication#getNumReplications <em>Num Replications</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Num Replications</em>' attribute.
   * @see #getNumReplications()
   * @generated
   */
  void setNumReplications(int value);

} // WINReplication
