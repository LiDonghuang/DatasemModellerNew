/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Factor#getNumber <em>Number</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Factor#getVariable <em>Variable</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Factor#getString <em>String</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Factor#isBoolean <em>Boolean</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Factor#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getFactor()
 * @model
 * @generated
 */
public interface Factor extends Term
{
  /**
   * Returns the value of the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number</em>' attribute.
   * @see #setNumber(String)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getFactor_Number()
   * @model
   * @generated
   */
  String getNumber();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Factor#getNumber <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number</em>' attribute.
   * @see #getNumber()
   * @generated
   */
  void setNumber(String value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference.
   * @see #setVariable(VarExpression)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getFactor_Variable()
   * @model containment="true"
   * @generated
   */
  VarExpression getVariable();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Factor#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(VarExpression value);

  /**
   * Returns the value of the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String</em>' attribute.
   * @see #setString(String)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getFactor_String()
   * @model
   * @generated
   */
  String getString();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Factor#getString <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String</em>' attribute.
   * @see #getString()
   * @generated
   */
  void setString(String value);

  /**
   * Returns the value of the '<em><b>Boolean</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Boolean</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Boolean</em>' attribute.
   * @see #setBoolean(boolean)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getFactor_Boolean()
   * @model
   * @generated
   */
  boolean isBoolean();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Factor#isBoolean <em>Boolean</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Boolean</em>' attribute.
   * @see #isBoolean()
   * @generated
   */
  void setBoolean(boolean value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getFactor_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Factor#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // Factor
