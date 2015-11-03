/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change State Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ChangeStateStatement#getTargetState <em>Target State</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getChangeStateStatement()
 * @model
 * @generated
 */
public interface ChangeStateStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Target State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target State</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target State</em>' reference.
   * @see #setTargetState(State)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getChangeStateStatement_TargetState()
   * @model
   * @generated
   */
  State getTargetState();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ChangeStateStatement#getTargetState <em>Target State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target State</em>' reference.
   * @see #getTargetState()
   * @generated
   */
  void setTargetState(State value);

} // ChangeStateStatement
