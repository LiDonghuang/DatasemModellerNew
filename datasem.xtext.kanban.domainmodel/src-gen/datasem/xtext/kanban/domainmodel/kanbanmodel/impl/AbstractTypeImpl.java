/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel.impl;

import datasem.xtext.kanban.domainmodel.kanbanmodel.AbstractType;
import datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AbstractTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AbstractTypeImpl#isListType <em>List Type</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AbstractTypeImpl#isMapType <em>Map Type</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AbstractTypeImpl#getKeyType <em>Key Type</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AbstractTypeImpl#getValueType <em>Value Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractTypeImpl extends MinimalEObjectImpl.Container implements AbstractType
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #isListType() <em>List Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isListType()
   * @generated
   * @ordered
   */
  protected static final boolean LIST_TYPE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isListType() <em>List Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isListType()
   * @generated
   * @ordered
   */
  protected boolean listType = LIST_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #isMapType() <em>Map Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMapType()
   * @generated
   * @ordered
   */
  protected static final boolean MAP_TYPE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMapType() <em>Map Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMapType()
   * @generated
   * @ordered
   */
  protected boolean mapType = MAP_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getKeyType() <em>Key Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeyType()
   * @generated
   * @ordered
   */
  protected static final String KEY_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getKeyType() <em>Key Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeyType()
   * @generated
   * @ordered
   */
  protected String keyType = KEY_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getValueType() <em>Value Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueType()
   * @generated
   * @ordered
   */
  protected static final String VALUE_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValueType() <em>Value Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueType()
   * @generated
   * @ordered
   */
  protected String valueType = VALUE_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AbstractTypeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return KanbanmodelPackage.Literals.ABSTRACT_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.ABSTRACT_TYPE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isListType()
  {
    return listType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setListType(boolean newListType)
  {
    boolean oldListType = listType;
    listType = newListType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.ABSTRACT_TYPE__LIST_TYPE, oldListType, listType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMapType()
  {
    return mapType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMapType(boolean newMapType)
  {
    boolean oldMapType = mapType;
    mapType = newMapType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.ABSTRACT_TYPE__MAP_TYPE, oldMapType, mapType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getKeyType()
  {
    return keyType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKeyType(String newKeyType)
  {
    String oldKeyType = keyType;
    keyType = newKeyType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.ABSTRACT_TYPE__KEY_TYPE, oldKeyType, keyType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValueType()
  {
    return valueType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueType(String newValueType)
  {
    String oldValueType = valueType;
    valueType = newValueType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.ABSTRACT_TYPE__VALUE_TYPE, oldValueType, valueType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case KanbanmodelPackage.ABSTRACT_TYPE__TYPE:
        return getType();
      case KanbanmodelPackage.ABSTRACT_TYPE__LIST_TYPE:
        return isListType();
      case KanbanmodelPackage.ABSTRACT_TYPE__MAP_TYPE:
        return isMapType();
      case KanbanmodelPackage.ABSTRACT_TYPE__KEY_TYPE:
        return getKeyType();
      case KanbanmodelPackage.ABSTRACT_TYPE__VALUE_TYPE:
        return getValueType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case KanbanmodelPackage.ABSTRACT_TYPE__TYPE:
        setType((String)newValue);
        return;
      case KanbanmodelPackage.ABSTRACT_TYPE__LIST_TYPE:
        setListType((Boolean)newValue);
        return;
      case KanbanmodelPackage.ABSTRACT_TYPE__MAP_TYPE:
        setMapType((Boolean)newValue);
        return;
      case KanbanmodelPackage.ABSTRACT_TYPE__KEY_TYPE:
        setKeyType((String)newValue);
        return;
      case KanbanmodelPackage.ABSTRACT_TYPE__VALUE_TYPE:
        setValueType((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case KanbanmodelPackage.ABSTRACT_TYPE__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case KanbanmodelPackage.ABSTRACT_TYPE__LIST_TYPE:
        setListType(LIST_TYPE_EDEFAULT);
        return;
      case KanbanmodelPackage.ABSTRACT_TYPE__MAP_TYPE:
        setMapType(MAP_TYPE_EDEFAULT);
        return;
      case KanbanmodelPackage.ABSTRACT_TYPE__KEY_TYPE:
        setKeyType(KEY_TYPE_EDEFAULT);
        return;
      case KanbanmodelPackage.ABSTRACT_TYPE__VALUE_TYPE:
        setValueType(VALUE_TYPE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case KanbanmodelPackage.ABSTRACT_TYPE__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case KanbanmodelPackage.ABSTRACT_TYPE__LIST_TYPE:
        return listType != LIST_TYPE_EDEFAULT;
      case KanbanmodelPackage.ABSTRACT_TYPE__MAP_TYPE:
        return mapType != MAP_TYPE_EDEFAULT;
      case KanbanmodelPackage.ABSTRACT_TYPE__KEY_TYPE:
        return KEY_TYPE_EDEFAULT == null ? keyType != null : !KEY_TYPE_EDEFAULT.equals(keyType);
      case KanbanmodelPackage.ABSTRACT_TYPE__VALUE_TYPE:
        return VALUE_TYPE_EDEFAULT == null ? valueType != null : !VALUE_TYPE_EDEFAULT.equals(valueType);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (type: ");
    result.append(type);
    result.append(", listType: ");
    result.append(listType);
    result.append(", mapType: ");
    result.append(mapType);
    result.append(", keyType: ");
    result.append(keyType);
    result.append(", valueType: ");
    result.append(valueType);
    result.append(')');
    return result.toString();
  }

} //AbstractTypeImpl
