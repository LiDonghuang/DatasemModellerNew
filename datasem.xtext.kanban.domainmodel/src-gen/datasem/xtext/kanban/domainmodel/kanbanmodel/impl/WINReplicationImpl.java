/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel.impl;

import datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WINReplication;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemNetwork;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WIN Replication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WINReplicationImpl#getWorkItemNetwork <em>Work Item Network</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WINReplicationImpl#getNumReplications <em>Num Replications</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WINReplicationImpl extends MinimalEObjectImpl.Container implements WINReplication
{
  /**
   * The cached value of the '{@link #getWorkItemNetwork() <em>Work Item Network</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWorkItemNetwork()
   * @generated
   * @ordered
   */
  protected WorkItemNetwork workItemNetwork;

  /**
   * The default value of the '{@link #getNumReplications() <em>Num Replications</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumReplications()
   * @generated
   * @ordered
   */
  protected static final int NUM_REPLICATIONS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNumReplications() <em>Num Replications</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumReplications()
   * @generated
   * @ordered
   */
  protected int numReplications = NUM_REPLICATIONS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WINReplicationImpl()
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
    return KanbanmodelPackage.Literals.WIN_REPLICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkItemNetwork getWorkItemNetwork()
  {
    if (workItemNetwork != null && workItemNetwork.eIsProxy())
    {
      InternalEObject oldWorkItemNetwork = (InternalEObject)workItemNetwork;
      workItemNetwork = (WorkItemNetwork)eResolveProxy(oldWorkItemNetwork);
      if (workItemNetwork != oldWorkItemNetwork)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, KanbanmodelPackage.WIN_REPLICATION__WORK_ITEM_NETWORK, oldWorkItemNetwork, workItemNetwork));
      }
    }
    return workItemNetwork;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkItemNetwork basicGetWorkItemNetwork()
  {
    return workItemNetwork;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWorkItemNetwork(WorkItemNetwork newWorkItemNetwork)
  {
    WorkItemNetwork oldWorkItemNetwork = workItemNetwork;
    workItemNetwork = newWorkItemNetwork;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WIN_REPLICATION__WORK_ITEM_NETWORK, oldWorkItemNetwork, workItemNetwork));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getNumReplications()
  {
    return numReplications;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumReplications(int newNumReplications)
  {
    int oldNumReplications = numReplications;
    numReplications = newNumReplications;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WIN_REPLICATION__NUM_REPLICATIONS, oldNumReplications, numReplications));
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
      case KanbanmodelPackage.WIN_REPLICATION__WORK_ITEM_NETWORK:
        if (resolve) return getWorkItemNetwork();
        return basicGetWorkItemNetwork();
      case KanbanmodelPackage.WIN_REPLICATION__NUM_REPLICATIONS:
        return getNumReplications();
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
      case KanbanmodelPackage.WIN_REPLICATION__WORK_ITEM_NETWORK:
        setWorkItemNetwork((WorkItemNetwork)newValue);
        return;
      case KanbanmodelPackage.WIN_REPLICATION__NUM_REPLICATIONS:
        setNumReplications((Integer)newValue);
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
      case KanbanmodelPackage.WIN_REPLICATION__WORK_ITEM_NETWORK:
        setWorkItemNetwork((WorkItemNetwork)null);
        return;
      case KanbanmodelPackage.WIN_REPLICATION__NUM_REPLICATIONS:
        setNumReplications(NUM_REPLICATIONS_EDEFAULT);
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
      case KanbanmodelPackage.WIN_REPLICATION__WORK_ITEM_NETWORK:
        return workItemNetwork != null;
      case KanbanmodelPackage.WIN_REPLICATION__NUM_REPLICATIONS:
        return numReplications != NUM_REPLICATIONS_EDEFAULT;
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
    result.append(" (numReplications: ");
    result.append(numReplications);
    result.append(')');
    return result.toString();
  }

} //WINReplicationImpl
