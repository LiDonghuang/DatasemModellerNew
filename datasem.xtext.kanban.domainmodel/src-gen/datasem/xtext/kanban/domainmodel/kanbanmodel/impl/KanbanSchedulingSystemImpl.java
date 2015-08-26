/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel.impl;

import datasem.xtext.kanban.domainmodel.kanbanmodel.ClassOfService;
import datasem.xtext.kanban.domainmodel.kanbanmodel.ConditionType;
import datasem.xtext.kanban.domainmodel.kanbanmodel.EventType;
import datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy;
import datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem;
import datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import datasem.xtext.kanban.domainmodel.kanbanmodel.ProcessModel;
import datasem.xtext.kanban.domainmodel.kanbanmodel.Repository;
import datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceAllocationRuleType;
import datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceOutsourcingRuleType;
import datasem.xtext.kanban.domainmodel.kanbanmodel.Service;
import datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider;
import datasem.xtext.kanban.domainmodel.kanbanmodel.TaskHierarchy;
import datasem.xtext.kanban.domainmodel.kanbanmodel.TaskType;
import datasem.xtext.kanban.domainmodel.kanbanmodel.ValueFunction;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptanceRuleType;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WIAssignmentRuleType;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WISelectionRuleType;
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
 * An implementation of the model object '<em><b>Kanban Scheduling System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl#getEventTypes <em>Event Types</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl#getConditionTypes <em>Condition Types</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl#getWIAcceptanceRuleTypes <em>WI Acceptance Rule Types</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl#getWISelectionRuleTypes <em>WI Selection Rule Types</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl#getWIAssignmentRuleTypes <em>WI Assignment Rule Types</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl#getResourceAllocationRuleTypes <em>Resource Allocation Rule Types</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl#getResourceOutsourcingRuleTypes <em>Resource Outsourcing Rule Types</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl#getProcessModels <em>Process Models</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl#getValueFunctions <em>Value Functions</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl#getTaskTypes <em>Task Types</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl#getTaskHierarchy <em>Task Hierarchy</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl#getClassOfServices <em>Class Of Services</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl#getServices <em>Services</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl#getGovernanceStrategies <em>Governance Strategies</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl#getRepositories <em>Repositories</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl#getPath <em>Path</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl#getServiceProviders <em>Service Providers</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl#getWorkSources <em>Work Sources</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl#getWorkItemNetworks <em>Work Item Networks</em>}</li>
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
   * The cached value of the '{@link #getEventTypes() <em>Event Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventTypes()
   * @generated
   * @ordered
   */
  protected EList<EventType> eventTypes;

  /**
   * The cached value of the '{@link #getConditionTypes() <em>Condition Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditionTypes()
   * @generated
   * @ordered
   */
  protected EList<ConditionType> conditionTypes;

  /**
   * The cached value of the '{@link #getWIAcceptanceRuleTypes() <em>WI Acceptance Rule Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWIAcceptanceRuleTypes()
   * @generated
   * @ordered
   */
  protected EList<WIAcceptanceRuleType> wiAcceptanceRuleTypes;

  /**
   * The cached value of the '{@link #getWISelectionRuleTypes() <em>WI Selection Rule Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWISelectionRuleTypes()
   * @generated
   * @ordered
   */
  protected EList<WISelectionRuleType> wiSelectionRuleTypes;

  /**
   * The cached value of the '{@link #getWIAssignmentRuleTypes() <em>WI Assignment Rule Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWIAssignmentRuleTypes()
   * @generated
   * @ordered
   */
  protected EList<WIAssignmentRuleType> wiAssignmentRuleTypes;

  /**
   * The cached value of the '{@link #getResourceAllocationRuleTypes() <em>Resource Allocation Rule Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResourceAllocationRuleTypes()
   * @generated
   * @ordered
   */
  protected EList<ResourceAllocationRuleType> resourceAllocationRuleTypes;

  /**
   * The cached value of the '{@link #getResourceOutsourcingRuleTypes() <em>Resource Outsourcing Rule Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResourceOutsourcingRuleTypes()
   * @generated
   * @ordered
   */
  protected EList<ResourceOutsourcingRuleType> resourceOutsourcingRuleTypes;

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
   * The cached value of the '{@link #getValueFunctions() <em>Value Functions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueFunctions()
   * @generated
   * @ordered
   */
  protected EList<ValueFunction> valueFunctions;

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
   * The cached value of the '{@link #getTaskHierarchy() <em>Task Hierarchy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTaskHierarchy()
   * @generated
   * @ordered
   */
  protected TaskHierarchy taskHierarchy;

  /**
   * The cached value of the '{@link #getClassOfServices() <em>Class Of Services</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassOfServices()
   * @generated
   * @ordered
   */
  protected EList<ClassOfService> classOfServices;

  /**
   * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServices()
   * @generated
   * @ordered
   */
  protected EList<Service> services;

  /**
   * The cached value of the '{@link #getGovernanceStrategies() <em>Governance Strategies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGovernanceStrategies()
   * @generated
   * @ordered
   */
  protected EList<GovernanceStrategy> governanceStrategies;

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
  public EList<EventType> getEventTypes()
  {
    if (eventTypes == null)
    {
      eventTypes = new EObjectContainmentEList<EventType>(EventType.class, this, KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__EVENT_TYPES);
    }
    return eventTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConditionType> getConditionTypes()
  {
    if (conditionTypes == null)
    {
      conditionTypes = new EObjectContainmentEList<ConditionType>(ConditionType.class, this, KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__CONDITION_TYPES);
    }
    return conditionTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WIAcceptanceRuleType> getWIAcceptanceRuleTypes()
  {
    if (wiAcceptanceRuleTypes == null)
    {
      wiAcceptanceRuleTypes = new EObjectContainmentEList<WIAcceptanceRuleType>(WIAcceptanceRuleType.class, this, KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__WI_ACCEPTANCE_RULE_TYPES);
    }
    return wiAcceptanceRuleTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WISelectionRuleType> getWISelectionRuleTypes()
  {
    if (wiSelectionRuleTypes == null)
    {
      wiSelectionRuleTypes = new EObjectContainmentEList<WISelectionRuleType>(WISelectionRuleType.class, this, KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__WI_SELECTION_RULE_TYPES);
    }
    return wiSelectionRuleTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WIAssignmentRuleType> getWIAssignmentRuleTypes()
  {
    if (wiAssignmentRuleTypes == null)
    {
      wiAssignmentRuleTypes = new EObjectContainmentEList<WIAssignmentRuleType>(WIAssignmentRuleType.class, this, KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__WI_ASSIGNMENT_RULE_TYPES);
    }
    return wiAssignmentRuleTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ResourceAllocationRuleType> getResourceAllocationRuleTypes()
  {
    if (resourceAllocationRuleTypes == null)
    {
      resourceAllocationRuleTypes = new EObjectContainmentEList<ResourceAllocationRuleType>(ResourceAllocationRuleType.class, this, KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__RESOURCE_ALLOCATION_RULE_TYPES);
    }
    return resourceAllocationRuleTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ResourceOutsourcingRuleType> getResourceOutsourcingRuleTypes()
  {
    if (resourceOutsourcingRuleTypes == null)
    {
      resourceOutsourcingRuleTypes = new EObjectContainmentEList<ResourceOutsourcingRuleType>(ResourceOutsourcingRuleType.class, this, KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__RESOURCE_OUTSOURCING_RULE_TYPES);
    }
    return resourceOutsourcingRuleTypes;
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
  public TaskHierarchy getTaskHierarchy()
  {
    return taskHierarchy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTaskHierarchy(TaskHierarchy newTaskHierarchy, NotificationChain msgs)
  {
    TaskHierarchy oldTaskHierarchy = taskHierarchy;
    taskHierarchy = newTaskHierarchy;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__TASK_HIERARCHY, oldTaskHierarchy, newTaskHierarchy);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTaskHierarchy(TaskHierarchy newTaskHierarchy)
  {
    if (newTaskHierarchy != taskHierarchy)
    {
      NotificationChain msgs = null;
      if (taskHierarchy != null)
        msgs = ((InternalEObject)taskHierarchy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__TASK_HIERARCHY, null, msgs);
      if (newTaskHierarchy != null)
        msgs = ((InternalEObject)newTaskHierarchy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__TASK_HIERARCHY, null, msgs);
      msgs = basicSetTaskHierarchy(newTaskHierarchy, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__TASK_HIERARCHY, newTaskHierarchy, newTaskHierarchy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ClassOfService> getClassOfServices()
  {
    if (classOfServices == null)
    {
      classOfServices = new EObjectContainmentEList<ClassOfService>(ClassOfService.class, this, KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__CLASS_OF_SERVICES);
    }
    return classOfServices;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Service> getServices()
  {
    if (services == null)
    {
      services = new EObjectContainmentEList<Service>(Service.class, this, KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__SERVICES);
    }
    return services;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GovernanceStrategy> getGovernanceStrategies()
  {
    if (governanceStrategies == null)
    {
      governanceStrategies = new EObjectContainmentEList<GovernanceStrategy>(GovernanceStrategy.class, this, KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__GOVERNANCE_STRATEGIES);
    }
    return governanceStrategies;
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
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__PATH, oldPath, path));
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
  public EList<WorkItemNetwork> getWorkItemNetworks()
  {
    if (workItemNetworks == null)
    {
      workItemNetworks = new EObjectContainmentEList<WorkItemNetwork>(WorkItemNetwork.class, this, KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__WORK_ITEM_NETWORKS);
    }
    return workItemNetworks;
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
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__EVENT_TYPES:
        return ((InternalEList<?>)getEventTypes()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__CONDITION_TYPES:
        return ((InternalEList<?>)getConditionTypes()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__WI_ACCEPTANCE_RULE_TYPES:
        return ((InternalEList<?>)getWIAcceptanceRuleTypes()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__WI_SELECTION_RULE_TYPES:
        return ((InternalEList<?>)getWISelectionRuleTypes()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__WI_ASSIGNMENT_RULE_TYPES:
        return ((InternalEList<?>)getWIAssignmentRuleTypes()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__RESOURCE_ALLOCATION_RULE_TYPES:
        return ((InternalEList<?>)getResourceAllocationRuleTypes()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__RESOURCE_OUTSOURCING_RULE_TYPES:
        return ((InternalEList<?>)getResourceOutsourcingRuleTypes()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__PROCESS_MODELS:
        return ((InternalEList<?>)getProcessModels()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__VALUE_FUNCTIONS:
        return ((InternalEList<?>)getValueFunctions()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__TASK_TYPES:
        return ((InternalEList<?>)getTaskTypes()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__TASK_HIERARCHY:
        return basicSetTaskHierarchy(null, msgs);
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__CLASS_OF_SERVICES:
        return ((InternalEList<?>)getClassOfServices()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__SERVICES:
        return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__GOVERNANCE_STRATEGIES:
        return ((InternalEList<?>)getGovernanceStrategies()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__REPOSITORIES:
        return ((InternalEList<?>)getRepositories()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__SERVICE_PROVIDERS:
        return ((InternalEList<?>)getServiceProviders()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__WORK_SOURCES:
        return ((InternalEList<?>)getWorkSources()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__WORK_ITEM_NETWORKS:
        return ((InternalEList<?>)getWorkItemNetworks()).basicRemove(otherEnd, msgs);
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
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__EVENT_TYPES:
        return getEventTypes();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__CONDITION_TYPES:
        return getConditionTypes();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__WI_ACCEPTANCE_RULE_TYPES:
        return getWIAcceptanceRuleTypes();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__WI_SELECTION_RULE_TYPES:
        return getWISelectionRuleTypes();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__WI_ASSIGNMENT_RULE_TYPES:
        return getWIAssignmentRuleTypes();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__RESOURCE_ALLOCATION_RULE_TYPES:
        return getResourceAllocationRuleTypes();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__RESOURCE_OUTSOURCING_RULE_TYPES:
        return getResourceOutsourcingRuleTypes();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__PROCESS_MODELS:
        return getProcessModels();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__VALUE_FUNCTIONS:
        return getValueFunctions();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__TASK_TYPES:
        return getTaskTypes();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__TASK_HIERARCHY:
        return getTaskHierarchy();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__CLASS_OF_SERVICES:
        return getClassOfServices();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__SERVICES:
        return getServices();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__GOVERNANCE_STRATEGIES:
        return getGovernanceStrategies();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__REPOSITORIES:
        return getRepositories();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__NAME:
        return getName();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__PATH:
        return getPath();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__SERVICE_PROVIDERS:
        return getServiceProviders();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__WORK_SOURCES:
        return getWorkSources();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__WORK_ITEM_NETWORKS:
        return getWorkItemNetworks();
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
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__EVENT_TYPES:
        getEventTypes().clear();
        getEventTypes().addAll((Collection<? extends EventType>)newValue);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__CONDITION_TYPES:
        getConditionTypes().clear();
        getConditionTypes().addAll((Collection<? extends ConditionType>)newValue);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__WI_ACCEPTANCE_RULE_TYPES:
        getWIAcceptanceRuleTypes().clear();
        getWIAcceptanceRuleTypes().addAll((Collection<? extends WIAcceptanceRuleType>)newValue);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__WI_SELECTION_RULE_TYPES:
        getWISelectionRuleTypes().clear();
        getWISelectionRuleTypes().addAll((Collection<? extends WISelectionRuleType>)newValue);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__WI_ASSIGNMENT_RULE_TYPES:
        getWIAssignmentRuleTypes().clear();
        getWIAssignmentRuleTypes().addAll((Collection<? extends WIAssignmentRuleType>)newValue);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__RESOURCE_ALLOCATION_RULE_TYPES:
        getResourceAllocationRuleTypes().clear();
        getResourceAllocationRuleTypes().addAll((Collection<? extends ResourceAllocationRuleType>)newValue);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__RESOURCE_OUTSOURCING_RULE_TYPES:
        getResourceOutsourcingRuleTypes().clear();
        getResourceOutsourcingRuleTypes().addAll((Collection<? extends ResourceOutsourcingRuleType>)newValue);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__PROCESS_MODELS:
        getProcessModels().clear();
        getProcessModels().addAll((Collection<? extends ProcessModel>)newValue);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__VALUE_FUNCTIONS:
        getValueFunctions().clear();
        getValueFunctions().addAll((Collection<? extends ValueFunction>)newValue);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__TASK_TYPES:
        getTaskTypes().clear();
        getTaskTypes().addAll((Collection<? extends TaskType>)newValue);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__TASK_HIERARCHY:
        setTaskHierarchy((TaskHierarchy)newValue);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__CLASS_OF_SERVICES:
        getClassOfServices().clear();
        getClassOfServices().addAll((Collection<? extends ClassOfService>)newValue);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__SERVICES:
        getServices().clear();
        getServices().addAll((Collection<? extends Service>)newValue);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__GOVERNANCE_STRATEGIES:
        getGovernanceStrategies().clear();
        getGovernanceStrategies().addAll((Collection<? extends GovernanceStrategy>)newValue);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__REPOSITORIES:
        getRepositories().clear();
        getRepositories().addAll((Collection<? extends Repository>)newValue);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__NAME:
        setName((String)newValue);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__PATH:
        setPath((String)newValue);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__SERVICE_PROVIDERS:
        getServiceProviders().clear();
        getServiceProviders().addAll((Collection<? extends ServiceProvider>)newValue);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__WORK_SOURCES:
        getWorkSources().clear();
        getWorkSources().addAll((Collection<? extends WorkSource>)newValue);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__WORK_ITEM_NETWORKS:
        getWorkItemNetworks().clear();
        getWorkItemNetworks().addAll((Collection<? extends WorkItemNetwork>)newValue);
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
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__EVENT_TYPES:
        getEventTypes().clear();
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__CONDITION_TYPES:
        getConditionTypes().clear();
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__WI_ACCEPTANCE_RULE_TYPES:
        getWIAcceptanceRuleTypes().clear();
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__WI_SELECTION_RULE_TYPES:
        getWISelectionRuleTypes().clear();
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__WI_ASSIGNMENT_RULE_TYPES:
        getWIAssignmentRuleTypes().clear();
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__RESOURCE_ALLOCATION_RULE_TYPES:
        getResourceAllocationRuleTypes().clear();
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__RESOURCE_OUTSOURCING_RULE_TYPES:
        getResourceOutsourcingRuleTypes().clear();
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__PROCESS_MODELS:
        getProcessModels().clear();
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__VALUE_FUNCTIONS:
        getValueFunctions().clear();
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__TASK_TYPES:
        getTaskTypes().clear();
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__TASK_HIERARCHY:
        setTaskHierarchy((TaskHierarchy)null);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__CLASS_OF_SERVICES:
        getClassOfServices().clear();
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__SERVICES:
        getServices().clear();
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__GOVERNANCE_STRATEGIES:
        getGovernanceStrategies().clear();
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__REPOSITORIES:
        getRepositories().clear();
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__PATH:
        setPath(PATH_EDEFAULT);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__SERVICE_PROVIDERS:
        getServiceProviders().clear();
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__WORK_SOURCES:
        getWorkSources().clear();
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__WORK_ITEM_NETWORKS:
        getWorkItemNetworks().clear();
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
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__EVENT_TYPES:
        return eventTypes != null && !eventTypes.isEmpty();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__CONDITION_TYPES:
        return conditionTypes != null && !conditionTypes.isEmpty();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__WI_ACCEPTANCE_RULE_TYPES:
        return wiAcceptanceRuleTypes != null && !wiAcceptanceRuleTypes.isEmpty();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__WI_SELECTION_RULE_TYPES:
        return wiSelectionRuleTypes != null && !wiSelectionRuleTypes.isEmpty();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__WI_ASSIGNMENT_RULE_TYPES:
        return wiAssignmentRuleTypes != null && !wiAssignmentRuleTypes.isEmpty();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__RESOURCE_ALLOCATION_RULE_TYPES:
        return resourceAllocationRuleTypes != null && !resourceAllocationRuleTypes.isEmpty();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__RESOURCE_OUTSOURCING_RULE_TYPES:
        return resourceOutsourcingRuleTypes != null && !resourceOutsourcingRuleTypes.isEmpty();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__PROCESS_MODELS:
        return processModels != null && !processModels.isEmpty();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__VALUE_FUNCTIONS:
        return valueFunctions != null && !valueFunctions.isEmpty();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__TASK_TYPES:
        return taskTypes != null && !taskTypes.isEmpty();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__TASK_HIERARCHY:
        return taskHierarchy != null;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__CLASS_OF_SERVICES:
        return classOfServices != null && !classOfServices.isEmpty();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__SERVICES:
        return services != null && !services.isEmpty();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__GOVERNANCE_STRATEGIES:
        return governanceStrategies != null && !governanceStrategies.isEmpty();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__REPOSITORIES:
        return repositories != null && !repositories.isEmpty();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__PATH:
        return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__SERVICE_PROVIDERS:
        return serviceProviders != null && !serviceProviders.isEmpty();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__WORK_SOURCES:
        return workSources != null && !workSources.isEmpty();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__WORK_ITEM_NETWORKS:
        return workItemNetworks != null && !workItemNetworks.isEmpty();
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
    result.append(", Path: ");
    result.append(path);
    result.append(", replications: ");
    result.append(replications);
    result.append(", interArrivalTime: ");
    result.append(interArrivalTime);
    result.append(')');
    return result.toString();
  }

} //KanbanSchedulingSystemImpl
