/**
 */
package datasemModeller.dmodel.impl;

import datasemModeller.dmodel.DmodelPackage;
import datasemModeller.dmodel.Mechanism;
import datasemModeller.dmodel.WorkItemType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Item Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasemModeller.dmodel.impl.WorkItemTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.WorkItemTypeImpl#getHierarchy <em>Hierarchy</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.WorkItemTypeImpl#getMechanisms <em>Mechanisms</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.WorkItemTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkItemTypeImpl extends MinimalEObjectImpl.Container implements WorkItemType
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getHierarchy() <em>Hierarchy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHierarchy()
   * @generated
   * @ordered
   */
  protected static final int HIERARCHY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getHierarchy() <em>Hierarchy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHierarchy()
   * @generated
   * @ordered
   */
  protected int hierarchy = HIERARCHY_EDEFAULT;

  /**
   * The cached value of the '{@link #getMechanisms() <em>Mechanisms</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMechanisms()
   * @generated
   * @ordered
   */
  protected EList<Mechanism> mechanisms;

  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final int ID_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected int id = ID_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WorkItemTypeImpl()
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
    return DmodelPackage.Literals.WORK_ITEM_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.WORK_ITEM_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getHierarchy()
  {
    return hierarchy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHierarchy(int newHierarchy)
  {
    int oldHierarchy = hierarchy;
    hierarchy = newHierarchy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.WORK_ITEM_TYPE__HIERARCHY, oldHierarchy, hierarchy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Mechanism> getMechanisms()
  {
    if (mechanisms == null)
    {
      mechanisms = new EObjectContainmentEList<Mechanism>(Mechanism.class, this, DmodelPackage.WORK_ITEM_TYPE__MECHANISMS);
    }
    return mechanisms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(int newId)
  {
    int oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.WORK_ITEM_TYPE__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DmodelPackage.WORK_ITEM_TYPE__MECHANISMS:
        return ((InternalEList<?>)getMechanisms()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case DmodelPackage.WORK_ITEM_TYPE__NAME:
        return getName();
      case DmodelPackage.WORK_ITEM_TYPE__HIERARCHY:
        return getHierarchy();
      case DmodelPackage.WORK_ITEM_TYPE__MECHANISMS:
        return getMechanisms();
      case DmodelPackage.WORK_ITEM_TYPE__ID:
        return getId();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DmodelPackage.WORK_ITEM_TYPE__NAME:
        setName((String)newValue);
        return;
      case DmodelPackage.WORK_ITEM_TYPE__HIERARCHY:
        setHierarchy((Integer)newValue);
        return;
      case DmodelPackage.WORK_ITEM_TYPE__MECHANISMS:
        getMechanisms().clear();
        getMechanisms().addAll((Collection<? extends Mechanism>)newValue);
        return;
      case DmodelPackage.WORK_ITEM_TYPE__ID:
        setId((Integer)newValue);
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
      case DmodelPackage.WORK_ITEM_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DmodelPackage.WORK_ITEM_TYPE__HIERARCHY:
        setHierarchy(HIERARCHY_EDEFAULT);
        return;
      case DmodelPackage.WORK_ITEM_TYPE__MECHANISMS:
        getMechanisms().clear();
        return;
      case DmodelPackage.WORK_ITEM_TYPE__ID:
        setId(ID_EDEFAULT);
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
      case DmodelPackage.WORK_ITEM_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DmodelPackage.WORK_ITEM_TYPE__HIERARCHY:
        return hierarchy != HIERARCHY_EDEFAULT;
      case DmodelPackage.WORK_ITEM_TYPE__MECHANISMS:
        return mechanisms != null && !mechanisms.isEmpty();
      case DmodelPackage.WORK_ITEM_TYPE__ID:
        return id != ID_EDEFAULT;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", hierarchy: ");
    result.append(hierarchy);
    result.append(", id: ");
    result.append(id);
    result.append(')');
    return result.toString();
  }

} //WorkItemTypeImpl
