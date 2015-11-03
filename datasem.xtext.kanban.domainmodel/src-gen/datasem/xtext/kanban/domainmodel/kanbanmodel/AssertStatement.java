/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assert Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.AssertStatement#getInput <em>Input</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.AssertStatement#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getAssertStatement()
 * @model
 * @generated
 */
public interface AssertStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Input</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input</em>' containment reference.
   * @see #setInput(VarExpression)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getAssertStatement_Input()
   * @model containment="true"
   * @generated
   */
  VarExpression getInput();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.AssertStatement#getInput <em>Input</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input</em>' containment reference.
   * @see #getInput()
   * @generated
   */
  void setInput(VarExpression value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Expression)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getAssertStatement_Value()
   * @model containment="true"
   * @generated
   */
  Expression getValue();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.AssertStatement#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Expression value);

} // AssertStatement
