/**
 */
package datasemModeller.dmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasemModeller.dmodel.IfExpression#getCondition <em>Condition</em>}</li>
 *   <li>{@link datasemModeller.dmodel.IfExpression#getStatements <em>Statements</em>}</li>
 *   <li>{@link datasemModeller.dmodel.IfExpression#isHasElseIf <em>Has Else If</em>}</li>
 *   <li>{@link datasemModeller.dmodel.IfExpression#getElseIf <em>Else If</em>}</li>
 *   <li>{@link datasemModeller.dmodel.IfExpression#getElses <em>Elses</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasemModeller.dmodel.DmodelPackage#getIfExpression()
 * @model
 * @generated
 */
public interface IfExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(Condition)
   * @see datasemModeller.dmodel.DmodelPackage#getIfExpression_Condition()
   * @model containment="true"
   * @generated
   */
  Condition getCondition();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.IfExpression#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Condition value);

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link datasemModeller.dmodel.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see datasemModeller.dmodel.DmodelPackage#getIfExpression_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

  /**
   * Returns the value of the '<em><b>Has Else If</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Else If</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Else If</em>' attribute.
   * @see #setHasElseIf(boolean)
   * @see datasemModeller.dmodel.DmodelPackage#getIfExpression_HasElseIf()
   * @model
   * @generated
   */
  boolean isHasElseIf();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.IfExpression#isHasElseIf <em>Has Else If</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Else If</em>' attribute.
   * @see #isHasElseIf()
   * @generated
   */
  void setHasElseIf(boolean value);

  /**
   * Returns the value of the '<em><b>Else If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else If</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else If</em>' containment reference.
   * @see #setElseIf(IfExpression)
   * @see datasemModeller.dmodel.DmodelPackage#getIfExpression_ElseIf()
   * @model containment="true"
   * @generated
   */
  IfExpression getElseIf();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.IfExpression#getElseIf <em>Else If</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else If</em>' containment reference.
   * @see #getElseIf()
   * @generated
   */
  void setElseIf(IfExpression value);

  /**
   * Returns the value of the '<em><b>Elses</b></em>' containment reference list.
   * The list contents are of type {@link datasemModeller.dmodel.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elses</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elses</em>' containment reference list.
   * @see datasemModeller.dmodel.DmodelPackage#getIfExpression_Elses()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getElses();

} // IfExpression
