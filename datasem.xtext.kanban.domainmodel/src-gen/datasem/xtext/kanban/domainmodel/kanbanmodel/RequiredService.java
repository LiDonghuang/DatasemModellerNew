/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.RequiredService#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.RequiredService#getEfforts <em>Efforts</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getRequiredService()
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
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getRequiredService_ServiceType()
   * @model
   * @generated
   */
  Service getServiceType();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.RequiredService#getServiceType <em>Service Type</em>}' reference.
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
   * @see #setEfforts(NumExpression)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getRequiredService_Efforts()
   * @model containment="true"
   * @generated
   */
  NumExpression getEfforts();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.RequiredService#getEfforts <em>Efforts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Efforts</em>' containment reference.
   * @see #getEfforts()
   * @generated
   */
  void setEfforts(NumExpression value);

} // RequiredService
