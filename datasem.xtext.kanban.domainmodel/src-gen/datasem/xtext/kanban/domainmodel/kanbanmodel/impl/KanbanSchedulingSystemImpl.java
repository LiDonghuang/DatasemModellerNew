/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel.impl;

import datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem;
import datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import datasem.xtext.kanban.domainmodel.kanbanmodel.ProcessModel;
import datasem.xtext.kanban.domainmodel.kanbanmodel.Repository;
import datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider;
import datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceType;
import datasem.xtext.kanban.domainmodel.kanbanmodel.Strategy;
import datasem.xtext.kanban.domainmodel.kanbanmodel.TaskPattern;
import datasem.xtext.kanban.domainmodel.kanbanmodel.TaskType;
import datasem.xtext.kanban.domainmodel.kanbanmodel.ValueFunction;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WorkSource;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kanban Scheduling System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl#getTestItems <em>Test Items</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl#getProcessModels <em>Process Models</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl#getGovernanceSearchStrategies <em>Governance Search Strategies</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl#getTaskPatterns <em>Task Patterns</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl#getTaskTypes <em>Task Types</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl#getValueFunctions <em>Value Functions</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl#getServiceTypes <em>Service Types</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl#getServiceProviders <em>Service Providers</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl#getRepositories <em>Repositories</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl#getWorkSources <em>Work Sources</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl#getWorkItems <em>Work Items</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl#getReplications <em>Replications</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl#getInterArrivalTime <em>Inter Arrival Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KanbanSchedulingSystemImpl extends MinimalEObjectImpl.Container implements KanbanSchedulingSystem
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
   * The cached value of the '{@link #getTestItems() <em>Test Items</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTestItems()
   * @generated
   * @ordered
   */
  protected EList<String> testItems;

  /**
   * The cached value of the '{@link #getProcessModels() <em>Process Models</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessModels()
   * @generated
   * @ordered
   */
  protected EList<ProcessModel> processModels;

  /**
   * The cached value of the '{@link #getGovernanceSearchStrategies() <em>Governance Search Strategies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGovernanceSearchStrategies()
   * @generated
   * @ordered
   */
  protected EList<Strategy> governanceSearchStrategies;

  /**
   * The cached value of the '{@link #getTaskPatterns() <em>Task Patterns</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTaskPatterns()
   * @generated
   * @ordered
   */
  protected EList<TaskPattern> taskPatterns;

  /**
   * The cached value of the '{@link #getTaskTypes() <em>Task Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTaskTypes()
   * @generated
   * @ordered
   */
  protected EList<TaskType> taskTypes;

  /**
   * The cached value of the '{@link #getValueFunctions() <em>Value Functions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueFunctions()
   * @generated
   * @ordered
   */
  protected EList<ValueFunction> valueFunctions;

  /**
   * The cached value of the '{@link #getServiceTypes() <em>Service Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceTypes()
   * @generated
   * @ordered
   */
  protected EList<ServiceType> serviceTypes;

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
   * The cached value of the '{@link #getRepositories() <em>Repositories</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepositories()
   * @generated
   * @ordered
   */
  protected EList<Repository> repositories;

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
   * The cached value of the '{@link #getWorkItems() <em>Work Items</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWorkItems()
   * @generated
   * @ordered
   */
  protected EList<WorkItem> workItems;

  /**
   * The default value of the '{@link #getReplications() <em>Replications</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReplications()
   * @generated
   * @ordered
   */
  protected static final int REPLICATIONS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getReplications() <em>Replications</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReplications()
   * @generated
   * @ordered
   */
  protected int replications = REPLICATIONS_EDEFAULT;

  /**
   * The default value of the '{@link #getInterArrivalTime() <em>Inter Arrival Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterArrivalTime()
   * @generated
   * @ordered
   */
  protected static final int INTER_ARRIVAL_TIME_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getInterArrivalTime() <em>Inter Arrival Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterArrivalTime()
   * @generated
   * @ordered
   */
  protected int interArrivalTime = INTER_ARRIVAL_TIME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected KanbanSchedulingSystemImpl()
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
    return KanbanmodelPackage.Literals.KANBAN_SCHEDULING_SYSTEM;
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
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getTestItems()
  {
    if (testItems == null)
    {
      testItems = new EDataTypeEList<String>(String.class, this, KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__TEST_ITEMS);
    }
    return testItems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProcessModel> getProcessModels()
  {
    if (processModels == null)
    {
      processModels = new EObjectContainmentEList<ProcessModel>(ProcessModel.class, this, KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__PROCESS_MODELS);
    }
    return processModels;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Strategy> getGovernanceSearchStrategies()
  {
    if (governanceSearchStrategies == null)
    {
      governanceSearchStrategies = new EObjectContainmentEList<Strategy>(Strategy.class, this, KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__GOVERNANCE_SEARCH_STRATEGIES);
    }
    return governanceSearchStrategies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TaskPattern> getTaskPatterns()
  {
    if (taskPatterns == null)
    {
      taskPatterns = new EObjectContainmentEList<TaskPattern>(TaskPattern.class, this, KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__TASK_PATTERNS);
    }
    return taskPatterns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TaskType> getTaskTypes()
  {
    if (taskTypes == null)
    {
      taskTypes = new EObjectContainmentEList<TaskType>(TaskType.class, this, KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__TASK_TYPES);
    }
    return taskTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ValueFunction> getValueFunctions()
  {
    if (valueFunctions == null)
    {
      valueFunctions = new EObjectContainmentEList<ValueFunction>(ValueFunction.class, this, KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__VALUE_FUNCTIONS);
    }
    return valueFunctions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ServiceType> getServiceTypes()
  {
    if (serviceTypes == null)
    {
      serviceTypes = new EObjectContainmentEList<ServiceType>(ServiceType.class, this, KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__SERVICE_TYPES);
    }
    return serviceTypes;
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
      serviceProviders = new EObjectContainmentEList<ServiceProvider>(ServiceProvider.class, this, KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__SERVICE_PROVIDERS);
    }
    return serviceProviders;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Repository> getRepositories()
  {
    if (repositories == null)
    {
      repositories = new EObjectContainmentEList<Repository>(Repository.class, this, KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__REPOSITORIES);
    }
    return repositories;
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
      workSources = new EObjectContainmentEList<WorkSource>(WorkSource.class, this, KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__WORK_SOURCES);
    }
    return workSources;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WorkItem> getWorkItems()
  {
    if (workItems == null)
    {
      workItems = new EObjectContainmentEList<WorkItem>(WorkItem.class, this, KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__WORK_ITEMS);
    }
    return workItems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getReplications()
  {
    return replications;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReplications(int newReplications)
  {
    int oldReplications = replications;
    replications = newReplications;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__REPLICATIONS, oldReplications, replications));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getInterArrivalTime()
  {
    return interArrivalTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterArrivalTime(int newInterArrivalTime)
  {
    int oldInterArrivalTime = interArrivalTime;
    interArrivalTime = newInterArrivalTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__INTER_ARRIVAL_TIME, oldInterArrivalTime, interArrivalTime));
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
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__PROCESS_MODELS:
        return ((InternalEList<?>)getProcessModels()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__GOVERNANCE_SEARCH_STRATEGIES:
        return ((InternalEList<?>)getGovernanceSearchStrategies()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__TASK_PATTERNS:
        return ((InternalEList<?>)getTaskPatterns()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__TASK_TYPES:
        return ((InternalEList<?>)getTaskTypes()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__VALUE_FUNCTIONS:
        return ((InternalEList<?>)getValueFunctions()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__SERVICE_TYPES:
        return ((InternalEList<?>)getServiceTypes()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__SERVICE_PROVIDERS:
        return ((InternalEList<?>)getServiceProviders()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__REPOSITORIES:
        return ((InternalEList<?>)getRepositories()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__WORK_SOURCES:
        return ((InternalEList<?>)getWorkSources()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__WORK_ITEMS:
        return ((InternalEList<?>)getWorkItems()).basicRemove(otherEnd, msgs);
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
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__NAME:
        return getName();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__TEST_ITEMS:
        return getTestItems();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__PROCESS_MODELS:
        return getProcessModels();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__GOVERNANCE_SEARCH_STRATEGIES:
        return getGovernanceSearchStrategies();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__TASK_PATTERNS:
        return getTaskPatterns();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__TASK_TYPES:
        return getTaskTypes();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__VALUE_FUNCTIONS:
        return getValueFunctions();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__SERVICE_TYPES:
        return getServiceTypes();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__SERVICE_PROVIDERS:
        return getServiceProviders();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__REPOSITORIES:
        return getRepositories();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__WORK_SOURCES:
        return getWorkSources();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__WORK_ITEMS:
        return getWorkItems();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__REPLICATIONS:
        return getReplications();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__INTER_ARRIVAL_TIME:
        return getInterArrivalTime();
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
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__NAME:
        setName((String)newValue);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__TEST_ITEMS:
        getTestItems().clear();
        getTestItems().addAll((Collection<? extends String>)newValue);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__PROCESS_MODELS:
        getProcessModels().clear();
        getProcessModels().addAll((Collection<? extends ProcessModel>)newValue);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__GOVERNANCE_SEARCH_STRATEGIES:
        getGovernanceSearchStrategies().clear();
        getGovernanceSearchStrategies().addAll((Collection<? extends Strategy>)newValue);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__TASK_PATTERNS:
        getTaskPatterns().clear();
        getTaskPatterns().addAll((Collection<? extends TaskPattern>)newValue);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__TASK_TYPES:
        getTaskTypes().clear();
        getTaskTypes().addAll((Collection<? extends TaskType>)newValue);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__VALUE_FUNCTIONS:
        getValueFunctions().clear();
        getValueFunctions().addAll((Collection<? extends ValueFunction>)newValue);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__SERVICE_TYPES:
        getServiceTypes().clear();
        getServiceTypes().addAll((Collection<? extends ServiceType>)newValue);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__SERVICE_PROVIDERS:
        getServiceProviders().clear();
        getServiceProviders().addAll((Collection<? extends ServiceProvider>)newValue);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__REPOSITORIES:
        getRepositories().clear();
        getRepositories().addAll((Collection<? extends Repository>)newValue);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__WORK_SOURCES:
        getWorkSources().clear();
        getWorkSources().addAll((Collection<? extends WorkSource>)newValue);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__WORK_ITEMS:
        getWorkItems().clear();
        getWorkItems().addAll((Collection<? extends WorkItem>)newValue);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__REPLICATIONS:
        setReplications((Integer)newValue);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__INTER_ARRIVAL_TIME:
        setInterArrivalTime((Integer)newValue);
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
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__TEST_ITEMS:
        getTestItems().clear();
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__PROCESS_MODELS:
        getProcessModels().clear();
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__GOVERNANCE_SEARCH_STRATEGIES:
        getGovernanceSearchStrategies().clear();
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__TASK_PATTERNS:
        getTaskPatterns().clear();
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__TASK_TYPES:
        getTaskTypes().clear();
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__VALUE_FUNCTIONS:
        getValueFunctions().clear();
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__SERVICE_TYPES:
        getServiceTypes().clear();
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__SERVICE_PROVIDERS:
        getServiceProviders().clear();
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__REPOSITORIES:
        getRepositories().clear();
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__WORK_SOURCES:
        getWorkSources().clear();
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__WORK_ITEMS:
        getWorkItems().clear();
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__REPLICATIONS:
        setReplications(REPLICATIONS_EDEFAULT);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__INTER_ARRIVAL_TIME:
        setInterArrivalTime(INTER_ARRIVAL_TIME_EDEFAULT);
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
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__TEST_ITEMS:
        return testItems != null && !testItems.isEmpty();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__PROCESS_MODELS:
        return processModels != null && !processModels.isEmpty();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__GOVERNANCE_SEARCH_STRATEGIES:
        return governanceSearchStrategies != null && !governanceSearchStrategies.isEmpty();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__TASK_PATTERNS:
        return taskPatterns != null && !taskPatterns.isEmpty();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__TASK_TYPES:
        return taskTypes != null && !taskTypes.isEmpty();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__VALUE_FUNCTIONS:
        return valueFunctions != null && !valueFunctions.isEmpty();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__SERVICE_TYPES:
        return serviceTypes != null && !serviceTypes.isEmpty();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__SERVICE_PROVIDERS:
        return serviceProviders != null && !serviceProviders.isEmpty();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__REPOSITORIES:
        return repositories != null && !repositories.isEmpty();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__WORK_SOURCES:
        return workSources != null && !workSources.isEmpty();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__WORK_ITEMS:
        return workItems != null && !workItems.isEmpty();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__REPLICATIONS:
        return replications != REPLICATIONS_EDEFAULT;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__INTER_ARRIVAL_TIME:
        return interArrivalTime != INTER_ARRIVAL_TIME_EDEFAULT;
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
    result.append(", TestItems: ");
    result.append(testItems);
    result.append(", replications: ");
    result.append(replications);
    result.append(", interArrivalTime: ");
    result.append(interArrivalTime);
    result.append(')');
    return result.toString();
  }

} //KanbanSchedulingSystemImpl
