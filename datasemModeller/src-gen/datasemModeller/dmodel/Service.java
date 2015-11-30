/**
 */
package datasemModeller.dmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasemModeller.dmodel.Service#getName <em>Name</em>}</li>
 *   <li>{@link datasemModeller.dmodel.Service#getHierarchy <em>Hierarchy</em>}</li>
 *   <li>{@link datasemModeller.dmodel.Service#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasemModeller.dmodel.DmodelPackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject
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
   * @see datasemModeller.dmodel.DmodelPackage#getService_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.Service#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Hierarchy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hierarchy</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hierarchy</em>' attribute.
   * @see #setHierarchy(int)
   * @see datasemModeller.dmodel.DmodelPackage#getService_Hierarchy()
   * @model
   * @generated
   */
  int getHierarchy();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.Service#getHierarchy <em>Hierarchy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hierarchy</em>' attribute.
   * @see #getHierarchy()
   * @generated
   */
  void setHierarchy(int value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(int)
   * @see datasemModeller.dmodel.DmodelPackage#getService_Id()
   * @model
   * @generated
   */
  int getId();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.Service#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(int value);

} // Service
