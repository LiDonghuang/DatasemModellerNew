/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Condition#getSubjective <em>Subjective</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Condition#getOperator <em>Operator</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Condition#getObjective <em>Objective</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Condition#isHasAnd <em>Has And</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Condition#getAndCondition <em>And Condition</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Condition#isHasOr <em>Has Or</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Condition#getOrCondition <em>Or Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject
{
  /**
   * Returns the value of the '<em><b>Subjective</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subjective</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subjective</em>' containment reference.
   * @see #setSubjective(VarExpression)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getCondition_Subjective()
   * @model containment="true"
   * @generated
   */
  VarExpression getSubjective();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Condition#getSubjective <em>Subjective</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subjective</em>' containment reference.
   * @see #getSubjective()
   * @generated
   */
  void setSubjective(VarExpression value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' containment reference.
   * @see #setOperator(Operator)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getCondition_Operator()
   * @model containment="true"
   * @generated
   */
  Operator getOperator();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Condition#getOperator <em>Operator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' containment reference.
   * @see #getOperator()
   * @generated
   */
  void setOperator(Operator value);

  /**
   * Returns the value of the '<em><b>Objective</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Objective</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objective</em>' containment reference.
   * @see #setObjective(Expression)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getCondition_Objective()
   * @model containment="true"
   * @generated
   */
  Expression getObjective();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Condition#getObjective <em>Objective</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Objective</em>' containment reference.
   * @see #getObjective()
   * @generated
   */
  void setObjective(Expression value);

  /**
   * Returns the value of the '<em><b>Has And</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has And</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has And</em>' attribute.
   * @see #setHasAnd(boolean)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getCondition_HasAnd()
   * @model
   * @generated
   */
  boolean isHasAnd();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Condition#isHasAnd <em>Has And</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has And</em>' attribute.
   * @see #isHasAnd()
   * @generated
   */
  void setHasAnd(boolean value);

  /**
   * Returns the value of the '<em><b>And Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>And Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>And Condition</em>' containment reference.
   * @see #setAndCondition(Condition)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getCondition_AndCondition()
   * @model containment="true"
   * @generated
   */
  Condition getAndCondition();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Condition#getAndCondition <em>And Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>And Condition</em>' containment reference.
   * @see #getAndCondition()
   * @generated
   */
  void setAndCondition(Condition value);

  /**
   * Returns the value of the '<em><b>Has Or</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Or</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Or</em>' attribute.
   * @see #setHasOr(boolean)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getCondition_HasOr()
   * @model
   * @generated
   */
  boolean isHasOr();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Condition#isHasOr <em>Has Or</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Or</em>' attribute.
   * @see #isHasOr()
   * @generated
   */
  void setHasOr(boolean value);

  /**
   * Returns the value of the '<em><b>Or Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Or Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Or Condition</em>' containment reference.
   * @see #setOrCondition(Condition)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getCondition_OrCondition()
   * @model containment="true"
   * @generated
   */
  Condition getOrCondition();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Condition#getOrCondition <em>Or Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Or Condition</em>' containment reference.
   * @see #getOrCondition()
   * @generated
   */
  void setOrCondition(Condition value);

} // Condition
