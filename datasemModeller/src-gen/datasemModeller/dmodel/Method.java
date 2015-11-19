/**
 */
package datasemModeller.dmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasemModeller.dmodel.Method#getName <em>Name</em>}</li>
 *   <li>{@link datasemModeller.dmodel.Method#isFunctionMethod <em>Function Method</em>}</li>
 *   <li>{@link datasemModeller.dmodel.Method#getInputs <em>Inputs</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasemModeller.dmodel.DmodelPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see datasemModeller.dmodel.DmodelPackage#getMethod_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.Method#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Function Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function Method</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Method</em>' attribute.
   * @see #setFunctionMethod(boolean)
   * @see datasemModeller.dmodel.DmodelPackage#getMethod_FunctionMethod()
   * @model
   * @generated
   */
  boolean isFunctionMethod();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.Method#isFunctionMethod <em>Function Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function Method</em>' attribute.
   * @see #isFunctionMethod()
   * @generated
   */
  void setFunctionMethod(boolean value);

  /**
   * Returns the value of the '<em><b>Inputs</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inputs</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inputs</em>' attribute list.
   * @see datasemModeller.dmodel.DmodelPackage#getMethod_Inputs()
   * @model unique="false"
   * @generated
   */
  EList<String> getInputs();

} // Method
