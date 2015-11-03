/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.AbstractType#getType <em>Type</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.AbstractType#isListType <em>List Type</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.AbstractType#isMapType <em>Map Type</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.AbstractType#getKeyType <em>Key Type</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.AbstractType#getValueType <em>Value Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getAbstractType()
 * @model
 * @generated
 */
public interface AbstractType extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getAbstractType_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.AbstractType#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>List Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List Type</em>' attribute.
   * @see #setListType(boolean)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getAbstractType_ListType()
   * @model
   * @generated
   */
  boolean isListType();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.AbstractType#isListType <em>List Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List Type</em>' attribute.
   * @see #isListType()
   * @generated
   */
  void setListType(boolean value);

  /**
   * Returns the value of the '<em><b>Map Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Map Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Map Type</em>' attribute.
   * @see #setMapType(boolean)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getAbstractType_MapType()
   * @model
   * @generated
   */
  boolean isMapType();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.AbstractType#isMapType <em>Map Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Map Type</em>' attribute.
   * @see #isMapType()
   * @generated
   */
  void setMapType(boolean value);

  /**
   * Returns the value of the '<em><b>Key Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key Type</em>' attribute.
   * @see #setKeyType(String)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getAbstractType_KeyType()
   * @model
   * @generated
   */
  String getKeyType();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.AbstractType#getKeyType <em>Key Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key Type</em>' attribute.
   * @see #getKeyType()
   * @generated
   */
  void setKeyType(String value);

  /**
   * Returns the value of the '<em><b>Value Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Type</em>' attribute.
   * @see #setValueType(String)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getAbstractType_ValueType()
   * @model
   * @generated
   */
  String getValueType();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.AbstractType#getValueType <em>Value Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Type</em>' attribute.
   * @see #getValueType()
   * @generated
   */
  void setValueType(String value);

} // AbstractType
