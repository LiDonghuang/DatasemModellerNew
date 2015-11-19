/**
 */
package datasemModeller.dmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasemModeller.dmodel.ForExpression#getObject <em>Object</em>}</li>
 *   <li>{@link datasemModeller.dmodel.ForExpression#getSet <em>Set</em>}</li>
 *   <li>{@link datasemModeller.dmodel.ForExpression#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasemModeller.dmodel.DmodelPackage#getForExpression()
 * @model
 * @generated
 */
public interface ForExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Object</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object</em>' containment reference.
   * @see #setObject(VarExpression)
   * @see datasemModeller.dmodel.DmodelPackage#getForExpression_Object()
   * @model containment="true"
   * @generated
   */
  VarExpression getObject();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.ForExpression#getObject <em>Object</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object</em>' containment reference.
   * @see #getObject()
   * @generated
   */
  void setObject(VarExpression value);

  /**
   * Returns the value of the '<em><b>Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Set</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Set</em>' containment reference.
   * @see #setSet(VarExpression)
   * @see datasemModeller.dmodel.DmodelPackage#getForExpression_Set()
   * @model containment="true"
   * @generated
   */
  VarExpression getSet();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.ForExpression#getSet <em>Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Set</em>' containment reference.
   * @see #getSet()
   * @generated
   */
  void setSet(VarExpression value);

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
   * @see datasemModeller.dmodel.DmodelPackage#getForExpression_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

} // ForExpression
