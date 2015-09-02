/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel.impl;

import datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentModel;
import datasem.xtext.kanban.domainmodel.kanbanmodel.Indicators;
import datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WINReplicationSetting;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemNetwork;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WorkSource;

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
 * An implementation of the model object '<em><b>Experiment Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ExperimentModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ExperimentModelImpl#getPath <em>Path</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ExperimentModelImpl#getServiceProviders <em>Service Providers</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ExperimentModelImpl#getWorkSources <em>Work Sources</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ExperimentModelImpl#getWorkItemNetworks <em>Work Item Networks</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ExperimentModelImpl#getWINReplicationSetting <em>WIN Replication Setting</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ExperimentModelImpl#getIndicators <em>Indicators</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExperimentModelImpl extends MinimalEObjectImpl.Container implements ExperimentModel
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
   * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected static final String PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected String path = PATH_EDEFAULT;

  /**
   * The cached value of the '{@link #getServiceProviders() <em>Service Providers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceProviders()
   * @generated
   * @ordered
   */
  protected EList<ServiceProvider> serviceProviders;

  /**
   * The cached value of the '{@link #getWorkSources() <em>Work Sources</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWorkSources()
   * @generated
   * @ordered
   */
  protected EList<WorkSource> workSources;

  /**
   * The cached value of the '{@link #getWorkItemNetworks() <em>Work Item Networks</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWorkItemNetworks()
   * @generated
   * @ordered
   */
  protected EList<WorkItemNetwork> workItemNetworks;

  /**
   * The cached value of the '{@link #getWINReplicationSetting() <em>WIN Replication Setting</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWINReplicationSetting()
   * @generated
   * @ordered
   */
  protected WINReplicationSetting winReplicationSetting;

  /**
   * The cached value of the '{@link #getIndicators() <em>Indicators</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndicators()
   * @generated
   * @ordered
   */
  protected Indicators indicators;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExperimentModelImpl()
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
    return KanbanmodelPackage.Literals.EXPERIMENT_MODEL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.EXPERIMENT_MODEL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPath()
  {
    return path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPath(String newPath)
  {
    String oldPath = path;
    path = newPath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.EXPERIMENT_MODEL__PATH, oldPath, path));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ServiceProvider> getServiceProviders()
  {
    if (serviceProviders == null)
    {
      serviceProviders = new EObjectContainmentEList<ServiceProvider>(ServiceProvider.class, this, KanbanmodelPackage.EXPERIMENT_MODEL__SERVICE_PROVIDERS);
    }
    return serviceProviders;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WorkSource> getWorkSources()
  {
    if (workSources == null)
    {
      workSources = new EObjectContainmentEList<WorkSource>(WorkSource.class, this, KanbanmodelPackage.EXPERIMENT_MODEL__WORK_SOURCES);
    }
    return workSources;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WorkItemNetwork> getWorkItemNetworks()
  {
    if (workItemNetworks == null)
    {
      workItemNetworks = new EObjectContainmentEList<WorkItemNetwork>(WorkItemNetwork.class, this, KanbanmodelPackage.EXPERIMENT_MODEL__WORK_ITEM_NETWORKS);
    }
    return workItemNetworks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WINReplicationSetting getWINReplicationSetting()
  {
    return winReplicationSetting;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWINReplicationSetting(WINReplicationSetting newWINReplicationSetting, NotificationChain msgs)
  {
    WINReplicationSetting oldWINReplicationSetting = winReplicationSetting;
    winReplicationSetting = newWINReplicationSetting;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.EXPERIMENT_MODEL__WIN_REPLICATION_SETTING, oldWINReplicationSetting, newWINReplicationSetting);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWINReplicationSetting(WINReplicationSetting newWINReplicationSetting)
  {
    if (newWINReplicationSetting != winReplicationSetting)
    {
      NotificationChain msgs = null;
      if (winReplicationSetting != null)
        msgs = ((InternalEObject)winReplicationSetting).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.EXPERIMENT_MODEL__WIN_REPLICATION_SETTING, null, msgs);
      if (newWINReplicationSetting != null)
        msgs = ((InternalEObject)newWINReplicationSetting).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.EXPERIMENT_MODEL__WIN_REPLICATION_SETTING, null, msgs);
      msgs = basicSetWINReplicationSetting(newWINReplicationSetting, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.EXPERIMENT_MODEL__WIN_REPLICATION_SETTING, newWINReplicationSetting, newWINReplicationSetting));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Indicators getIndicators()
  {
    return indicators;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIndicators(Indicators newIndicators, NotificationChain msgs)
  {
    Indicators oldIndicators = indicators;
    indicators = newIndicators;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.EXPERIMENT_MODEL__INDICATORS, oldIndicators, newIndicators);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIndicators(Indicators newIndicators)
  {
    if (newIndicators != indicators)
    {
      NotificationChain msgs = null;
      if (indicators != null)
        msgs = ((InternalEObject)indicators).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.EXPERIMENT_MODEL__INDICATORS, null, msgs);
      if (newIndicators != null)
        msgs = ((InternalEObject)newIndicators).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.EXPERIMENT_MODEL__INDICATORS, null, msgs);
      msgs = basicSetIndicators(newIndicators, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.EXPERIMENT_MODEL__INDICATORS, newIndicators, newIndicators));
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
      case KanbanmodelPackage.EXPERIMENT_MODEL__SERVICE_PROVIDERS:
        return ((InternalEList<?>)getServiceProviders()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.EXPERIMENT_MODEL__WORK_SOURCES:
        return ((InternalEList<?>)getWorkSources()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.EXPERIMENT_MODEL__WORK_ITEM_NETWORKS:
        return ((InternalEList<?>)getWorkItemNetworks()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.EXPERIMENT_MODEL__WIN_REPLICATION_SETTING:
        return basicSetWINReplicationSetting(null, msgs);
      case KanbanmodelPackage.EXPERIMENT_MODEL__INDICATORS:
        return basicSetIndicators(null, msgs);
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
      case KanbanmodelPackage.EXPERIMENT_MODEL__NAME:
        return getName();
      case KanbanmodelPackage.EXPERIMENT_MODEL__PATH:
        return getPath();
      case KanbanmodelPackage.EXPERIMENT_MODEL__SERVICE_PROVIDERS:
        return getServiceProviders();
      case KanbanmodelPackage.EXPERIMENT_MODEL__WORK_SOURCES:
        return getWorkSources();
      case KanbanmodelPackage.EXPERIMENT_MODEL__WORK_ITEM_NETWORKS:
        return getWorkItemNetworks();
      case KanbanmodelPackage.EXPERIMENT_MODEL__WIN_REPLICATION_SETTING:
        return getWINReplicationSetting();
      case KanbanmodelPackage.EXPERIMENT_MODEL__INDICATORS:
        return getIndicators();
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
      case KanbanmodelPackage.EXPERIMENT_MODEL__NAME:
        setName((String)newValue);
        return;
      case KanbanmodelPackage.EXPERIMENT_MODEL__PATH:
        setPath((String)newValue);
        return;
      case KanbanmodelPackage.EXPERIMENT_MODEL__SERVICE_PROVIDERS:
        getServiceProviders().clear();
        getServiceProviders().addAll((Collection<? extends ServiceProvider>)newValue);
        return;
      case KanbanmodelPackage.EXPERIMENT_MODEL__WORK_SOURCES:
        getWorkSources().clear();
        getWorkSources().addAll((Collection<? extends WorkSource>)newValue);
        return;
      case KanbanmodelPackage.EXPERIMENT_MODEL__WORK_ITEM_NETWORKS:
        getWorkItemNetworks().clear();
        getWorkItemNetworks().addAll((Collection<? extends WorkItemNetwork>)newValue);
        return;
      case KanbanmodelPackage.EXPERIMENT_MODEL__WIN_REPLICATION_SETTING:
        setWINReplicationSetting((WINReplicationSetting)newValue);
        return;
      case KanbanmodelPackage.EXPERIMENT_MODEL__INDICATORS:
        setIndicators((Indicators)newValue);
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
      case KanbanmodelPackage.EXPERIMENT_MODEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case KanbanmodelPackage.EXPERIMENT_MODEL__PATH:
        setPath(PATH_EDEFAULT);
        return;
      case KanbanmodelPackage.EXPERIMENT_MODEL__SERVICE_PROVIDERS:
        getServiceProviders().clear();
        return;
      case KanbanmodelPackage.EXPERIMENT_MODEL__WORK_SOURCES:
        getWorkSources().clear();
        return;
      case KanbanmodelPackage.EXPERIMENT_MODEL__WORK_ITEM_NETWORKS:
        getWorkItemNetworks().clear();
        return;
      case KanbanmodelPackage.EXPERIMENT_MODEL__WIN_REPLICATION_SETTING:
        setWINReplicationSetting((WINReplicationSetting)null);
        return;
      case KanbanmodelPackage.EXPERIMENT_MODEL__INDICATORS:
        setIndicators((Indicators)null);
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
      case KanbanmodelPackage.EXPERIMENT_MODEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case KanbanmodelPackage.EXPERIMENT_MODEL__PATH:
        return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
      case KanbanmodelPackage.EXPERIMENT_MODEL__SERVICE_PROVIDERS:
        return serviceProviders != null && !serviceProviders.isEmpty();
      case KanbanmodelPackage.EXPERIMENT_MODEL__WORK_SOURCES:
        return workSources != null && !workSources.isEmpty();
      case KanbanmodelPackage.EXPERIMENT_MODEL__WORK_ITEM_NETWORKS:
        return workItemNetworks != null && !workItemNetworks.isEmpty();
      case KanbanmodelPackage.EXPERIMENT_MODEL__WIN_REPLICATION_SETTING:
        return winReplicationSetting != null;
      case KanbanmodelPackage.EXPERIMENT_MODEL__INDICATORS:
        return indicators != null;
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
    result.append(", Path: ");
    result.append(path);
    result.append(')');
    return result.toString();
  }

} //ExperimentModelImpl
