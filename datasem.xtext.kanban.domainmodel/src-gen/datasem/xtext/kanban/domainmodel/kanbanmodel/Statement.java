/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#isIsAction <em>Is Action</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#getActionStatement <em>Action Statement</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#isIsChangeState <em>Is Change State</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#getChangeStateStatement <em>Change State Statement</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#isIsDeclaration <em>Is Declaration</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#getDeclarationStatement <em>Declaration Statement</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#isIsIfExpression <em>Is If Expression</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#getIfExpression <em>If Expression</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#isIsForExpression <em>Is For Expression</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#getForExpression <em>For Expression</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#isIsWhileExpression <em>Is While Expression</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#getWhileExpression <em>While Expression</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#getAssertStatement <em>Assert Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getStatement()
 * @model
 * @generated
 */
public interface Statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Is Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Action</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Action</em>' attribute.
   * @see #setIsAction(boolean)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getStatement_IsAction()
   * @model
   * @generated
   */
  boolean isIsAction();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#isIsAction <em>Is Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Action</em>' attribute.
   * @see #isIsAction()
   * @generated
   */
  void setIsAction(boolean value);

  /**
   * Returns the value of the '<em><b>Action Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action Statement</em>' containment reference.
   * @see #setActionStatement(ActionStatement)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getStatement_ActionStatement()
   * @model containment="true"
   * @generated
   */
  ActionStatement getActionStatement();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#getActionStatement <em>Action Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action Statement</em>' containment reference.
   * @see #getActionStatement()
   * @generated
   */
  void setActionStatement(ActionStatement value);

  /**
   * Returns the value of the '<em><b>Is Change State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Change State</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Change State</em>' attribute.
   * @see #setIsChangeState(boolean)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getStatement_IsChangeState()
   * @model
   * @generated
   */
  boolean isIsChangeState();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#isIsChangeState <em>Is Change State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Change State</em>' attribute.
   * @see #isIsChangeState()
   * @generated
   */
  void setIsChangeState(boolean value);

  /**
   * Returns the value of the '<em><b>Change State Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Change State Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Change State Statement</em>' containment reference.
   * @see #setChangeStateStatement(ChangeStateStatement)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getStatement_ChangeStateStatement()
   * @model containment="true"
   * @generated
   */
  ChangeStateStatement getChangeStateStatement();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#getChangeStateStatement <em>Change State Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Change State Statement</em>' containment reference.
   * @see #getChangeStateStatement()
   * @generated
   */
  void setChangeStateStatement(ChangeStateStatement value);

  /**
   * Returns the value of the '<em><b>Is Declaration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Declaration</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Declaration</em>' attribute.
   * @see #setIsDeclaration(boolean)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getStatement_IsDeclaration()
   * @model
   * @generated
   */
  boolean isIsDeclaration();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#isIsDeclaration <em>Is Declaration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Declaration</em>' attribute.
   * @see #isIsDeclaration()
   * @generated
   */
  void setIsDeclaration(boolean value);

  /**
   * Returns the value of the '<em><b>Declaration Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declaration Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declaration Statement</em>' containment reference.
   * @see #setDeclarationStatement(DeclarationStatement)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getStatement_DeclarationStatement()
   * @model containment="true"
   * @generated
   */
  DeclarationStatement getDeclarationStatement();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#getDeclarationStatement <em>Declaration Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declaration Statement</em>' containment reference.
   * @see #getDeclarationStatement()
   * @generated
   */
  void setDeclarationStatement(DeclarationStatement value);

  /**
   * Returns the value of the '<em><b>Is If Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is If Expression</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is If Expression</em>' attribute.
   * @see #setIsIfExpression(boolean)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getStatement_IsIfExpression()
   * @model
   * @generated
   */
  boolean isIsIfExpression();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#isIsIfExpression <em>Is If Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is If Expression</em>' attribute.
   * @see #isIsIfExpression()
   * @generated
   */
  void setIsIfExpression(boolean value);

  /**
   * Returns the value of the '<em><b>If Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>If Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>If Expression</em>' containment reference.
   * @see #setIfExpression(IfExpression)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getStatement_IfExpression()
   * @model containment="true"
   * @generated
   */
  IfExpression getIfExpression();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#getIfExpression <em>If Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>If Expression</em>' containment reference.
   * @see #getIfExpression()
   * @generated
   */
  void setIfExpression(IfExpression value);

  /**
   * Returns the value of the '<em><b>Is For Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is For Expression</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is For Expression</em>' attribute.
   * @see #setIsForExpression(boolean)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getStatement_IsForExpression()
   * @model
   * @generated
   */
  boolean isIsForExpression();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#isIsForExpression <em>Is For Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is For Expression</em>' attribute.
   * @see #isIsForExpression()
   * @generated
   */
  void setIsForExpression(boolean value);

  /**
   * Returns the value of the '<em><b>For Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>For Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>For Expression</em>' containment reference.
   * @see #setForExpression(ForExpression)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getStatement_ForExpression()
   * @model containment="true"
   * @generated
   */
  ForExpression getForExpression();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#getForExpression <em>For Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>For Expression</em>' containment reference.
   * @see #getForExpression()
   * @generated
   */
  void setForExpression(ForExpression value);

  /**
   * Returns the value of the '<em><b>Is While Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is While Expression</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is While Expression</em>' attribute.
   * @see #setIsWhileExpression(boolean)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getStatement_IsWhileExpression()
   * @model
   * @generated
   */
  boolean isIsWhileExpression();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#isIsWhileExpression <em>Is While Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is While Expression</em>' attribute.
   * @see #isIsWhileExpression()
   * @generated
   */
  void setIsWhileExpression(boolean value);

  /**
   * Returns the value of the '<em><b>While Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>While Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>While Expression</em>' containment reference.
   * @see #setWhileExpression(WhileExpression)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getStatement_WhileExpression()
   * @model containment="true"
   * @generated
   */
  WhileExpression getWhileExpression();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#getWhileExpression <em>While Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>While Expression</em>' containment reference.
   * @see #getWhileExpression()
   * @generated
   */
  void setWhileExpression(WhileExpression value);

  /**
   * Returns the value of the '<em><b>Assert Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assert Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assert Statement</em>' containment reference.
   * @see #setAssertStatement(AssertStatement)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getStatement_AssertStatement()
   * @model containment="true"
   * @generated
   */
  AssertStatement getAssertStatement();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#getAssertStatement <em>Assert Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assert Statement</em>' containment reference.
   * @see #getAssertStatement()
   * @generated
   */
  void setAssertStatement(AssertStatement value);

} // Statement
