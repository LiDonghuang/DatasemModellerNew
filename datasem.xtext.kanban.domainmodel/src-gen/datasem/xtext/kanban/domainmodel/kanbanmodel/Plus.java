/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Plus#getLeft <em>Left</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Plus#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getPlus()
 * @model
 * @generated
 */
public interface Plus extends Expression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Expression)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getPlus_Left()
   * @model containment="true"
   * @generated
   */
  Expression getLeft();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Plus#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Term)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getPlus_Right()
   * @model containment="true"
   * @generated
   */
  Term getRight();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Plus#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Term value);

} // Plus
