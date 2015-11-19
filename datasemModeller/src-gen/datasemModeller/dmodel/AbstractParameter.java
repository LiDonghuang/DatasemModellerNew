/**
 */
package datasemModeller.dmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasemModeller.dmodel.AbstractParameter#isIsVariable <em>Is Variable</em>}</li>
 *   <li>{@link datasemModeller.dmodel.AbstractParameter#getVariable <em>Variable</em>}</li>
 *   <li>{@link datasemModeller.dmodel.AbstractParameter#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasemModeller.dmodel.DmodelPackage#getAbstractParameter()
 * @model
 * @generated
 */
public interface AbstractParameter extends EObject
{
  /**
   * Returns the value of the '<em><b>Is Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Variable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Variable</em>' attribute.
   * @see #setIsVariable(boolean)
   * @see datasemModeller.dmodel.DmodelPackage#getAbstractParameter_IsVariable()
   * @model
   * @generated
   */
  boolean isIsVariable();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.AbstractParameter#isIsVariable <em>Is Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Variable</em>' attribute.
   * @see #isIsVariable()
   * @generated
   */
  void setIsVariable(boolean value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' reference.
   * @see #setVariable(ExperimentVariable)
   * @see datasemModeller.dmodel.DmodelPackage#getAbstractParameter_Variable()
   * @model
   * @generated
   */
  ExperimentVariable getVariable();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.AbstractParameter#getVariable <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(ExperimentVariable value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see datasemModeller.dmodel.DmodelPackage#getAbstractParameter_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.AbstractParameter#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // AbstractParameter
