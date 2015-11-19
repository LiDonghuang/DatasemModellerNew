/**
 */
package datasemModeller.dmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasemModeller.dmodel.Distribution#isIsNormal <em>Is Normal</em>}</li>
 *   <li>{@link datasemModeller.dmodel.Distribution#isIsUniform <em>Is Uniform</em>}</li>
 *   <li>{@link datasemModeller.dmodel.Distribution#isIsExponential <em>Is Exponential</em>}</li>
 *   <li>{@link datasemModeller.dmodel.Distribution#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasemModeller.dmodel.DmodelPackage#getDistribution()
 * @model
 * @generated
 */
public interface Distribution extends EObject
{
  /**
   * Returns the value of the '<em><b>Is Normal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Normal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Normal</em>' attribute.
   * @see #setIsNormal(boolean)
   * @see datasemModeller.dmodel.DmodelPackage#getDistribution_IsNormal()
   * @model
   * @generated
   */
  boolean isIsNormal();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.Distribution#isIsNormal <em>Is Normal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Normal</em>' attribute.
   * @see #isIsNormal()
   * @generated
   */
  void setIsNormal(boolean value);

  /**
   * Returns the value of the '<em><b>Is Uniform</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Uniform</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Uniform</em>' attribute.
   * @see #setIsUniform(boolean)
   * @see datasemModeller.dmodel.DmodelPackage#getDistribution_IsUniform()
   * @model
   * @generated
   */
  boolean isIsUniform();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.Distribution#isIsUniform <em>Is Uniform</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Uniform</em>' attribute.
   * @see #isIsUniform()
   * @generated
   */
  void setIsUniform(boolean value);

  /**
   * Returns the value of the '<em><b>Is Exponential</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Exponential</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Exponential</em>' attribute.
   * @see #setIsExponential(boolean)
   * @see datasemModeller.dmodel.DmodelPackage#getDistribution_IsExponential()
   * @model
   * @generated
   */
  boolean isIsExponential();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.Distribution#isIsExponential <em>Is Exponential</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Exponential</em>' attribute.
   * @see #isIsExponential()
   * @generated
   */
  void setIsExponential(boolean value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' attribute list.
   * @see datasemModeller.dmodel.DmodelPackage#getDistribution_Parameters()
   * @model unique="false"
   * @generated
   */
  EList<String> getParameters();

} // Distribution
