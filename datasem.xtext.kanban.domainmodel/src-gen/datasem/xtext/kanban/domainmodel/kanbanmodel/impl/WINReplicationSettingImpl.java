/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel.impl;

import datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WINReplication;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WINReplicationSetting;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WIN Replication Setting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WINReplicationSettingImpl#getWINReplications <em>WIN Replications</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WINReplicationSettingImpl extends MinimalEObjectImpl.Container implements WINReplicationSetting
{
  /**
   * The cached value of the '{@link #getWINReplications() <em>WIN Replications</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWINReplications()
   * @generated
   * @ordered
   */
  protected EList<WINReplication> winReplications;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WINReplicationSettingImpl()
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
    return KanbanmodelPackage.Literals.WIN_REPLICATION_SETTING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WINReplication> getWINReplications()
  {
    if (winReplications == null)
    {
      winReplications = new EObjectContainmentEList<WINReplication>(WINReplication.class, this, KanbanmodelPackage.WIN_REPLICATION_SETTING__WIN_REPLICATIONS);
    }
    return winReplications;
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
      case KanbanmodelPackage.WIN_REPLICATION_SETTING__WIN_REPLICATIONS:
        return ((InternalEList<?>)getWINReplications()).basicRemove(otherEnd, msgs);
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
      case KanbanmodelPackage.WIN_REPLICATION_SETTING__WIN_REPLICATIONS:
        return getWINReplications();
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
      case KanbanmodelPackage.WIN_REPLICATION_SETTING__WIN_REPLICATIONS:
        getWINReplications().clear();
        getWINReplications().addAll((Collection<? extends WINReplication>)newValue);
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
      case KanbanmodelPackage.WIN_REPLICATION_SETTING__WIN_REPLICATIONS:
        getWINReplications().clear();
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
      case KanbanmodelPackage.WIN_REPLICATION_SETTING__WIN_REPLICATIONS:
        return winReplications != null && !winReplications.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //WINReplicationSettingImpl
