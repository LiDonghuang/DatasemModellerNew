/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ActionStatement#getAction <em>Action</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ActionStatement#getInputs <em>Inputs</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getActionStatement()
 * @model
 * @generated
 */
public interface ActionStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Action</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' reference.
   * @see #setAction(Action)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getActionStatement_Action()
   * @model
   * @generated
   */
  Action getAction();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ActionStatement#getAction <em>Action</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' reference.
   * @see #getAction()
   * @generated
   */
  void setAction(Action value);

  /**
   * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.VarExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inputs</em>' containment reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getActionStatement_Inputs()
   * @model containment="true"
   * @generated
   */
  EList<VarExpression> getInputs();

} // ActionStatement
