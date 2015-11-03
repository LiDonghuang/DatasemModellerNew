/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.VarExpression#isSelf <em>Self</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.VarExpression#isContext <em>Context</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.VarExpression#getVariable <em>Variable</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.VarExpression#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getVarExpression()
 * @model
 * @generated
 */
public interface VarExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Self</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Self</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Self</em>' attribute.
   * @see #setSelf(boolean)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getVarExpression_Self()
   * @model
   * @generated
   */
  boolean isSelf();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.VarExpression#isSelf <em>Self</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Self</em>' attribute.
   * @see #isSelf()
   * @generated
   */
  void setSelf(boolean value);

  /**
   * Returns the value of the '<em><b>Context</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Context</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Context</em>' attribute.
   * @see #setContext(boolean)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getVarExpression_Context()
   * @model
   * @generated
   */
  boolean isContext();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.VarExpression#isContext <em>Context</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Context</em>' attribute.
   * @see #isContext()
   * @generated
   */
  void setContext(boolean value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' attribute.
   * @see #setVariable(String)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getVarExpression_Variable()
   * @model
   * @generated
   */
  String getVariable();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.VarExpression#getVariable <em>Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' attribute.
   * @see #getVariable()
   * @generated
   */
  void setVariable(String value);

  /**
   * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.Method}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methods</em>' containment reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getVarExpression_Methods()
   * @model containment="true"
   * @generated
   */
  EList<Method> getMethods();

} // VarExpression
