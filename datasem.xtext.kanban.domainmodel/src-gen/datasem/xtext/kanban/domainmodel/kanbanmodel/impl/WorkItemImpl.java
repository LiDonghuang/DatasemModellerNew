/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel.impl;

import datasem.xtext.kanban.domainmodel.kanbanmodel.CausalTrigger;
import datasem.xtext.kanban.domainmodel.kanbanmodel.ClassOfService;
import datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceType;
import datasem.xtext.kanban.domainmodel.kanbanmodel.TaskType;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile;
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl#getName <em>Name</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl#getProfile <em>Profile</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl#getType <em>Type</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl#getPTasks <em>PTasks</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl#getSTasks <em>STasks</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl#getCausalTriggers <em>Causal Triggers</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl#getRequiredServices <em>Required Services</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl#getEfforts <em>Efforts</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl#getValue <em>Value</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl#getClassOfService <em>Class Of Service</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl#getWorkSource <em>Work Source</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl#getArrivalTime <em>Arrival Time</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl#getDueDate <em>Due Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkItemImpl extends MinimalEObjectImpl.Container implements WorkItem
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
   * The cached value of the '{@link #getProfile() <em>Profile</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProfile()
   * @generated
   * @ordered
   */
  protected WorkItemProfile profile;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected TaskType type;

  /**
   * The cached value of the '{@link #getPTasks() <em>PTasks</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPTasks()
   * @generated
   * @ordered
   */
  protected EList<WorkItem> pTasks;

  /**
   * The cached value of the '{@link #getSTasks() <em>STasks</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSTasks()
   * @generated
   * @ordered
   */
  protected EList<WorkItem> sTasks;

  /**
   * The cached value of the '{@link #getCausalTriggers() <em>Causal Triggers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCausalTriggers()
   * @generated
   * @ordered
   */
  protected EList<CausalTrigger> causalTriggers;

  /**
   * The cached value of the '{@link #getRequiredServices() <em>Required Services</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequiredServices()
   * @generated
   * @ordered
   */
  protected EList<ServiceType> requiredServices;

  /**
   * The default value of the '{@link #getEfforts() <em>Efforts</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEfforts()
   * @generated
   * @ordered
   */
  protected static final int EFFORTS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getEfforts() <em>Efforts</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEfforts()
   * @generated
   * @ordered
   */
  protected int efforts = EFFORTS_EDEFAULT;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final int VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected int value = VALUE_EDEFAULT;

  /**
   * The cached value of the '{@link #getClassOfService() <em>Class Of Service</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassOfService()
   * @generated
   * @ordered
   */
  protected ClassOfService classOfService;

  /**
   * The cached value of the '{@link #getWorkSource() <em>Work Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWorkSource()
   * @generated
   * @ordered
   */
  protected WorkSource workSource;

  /**
   * The default value of the '{@link #getArrivalTime() <em>Arrival Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrivalTime()
   * @generated
   * @ordered
   */
  protected static final int ARRIVAL_TIME_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getArrivalTime() <em>Arrival Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrivalTime()
   * @generated
   * @ordered
   */
  protected int arrivalTime = ARRIVAL_TIME_EDEFAULT;

  /**
   * The default value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDueDate()
   * @generated
   * @ordered
   */
  protected static final int DUE_DATE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDueDate()
   * @generated
   * @ordered
   */
  protected int dueDate = DUE_DATE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WorkItemImpl()
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
    return KanbanmodelPackage.Literals.WORK_ITEM;
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
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkItemProfile getProfile()
  {
    if (profile != null && profile.eIsProxy())
    {
      InternalEObject oldProfile = (InternalEObject)profile;
      profile = (WorkItemProfile)eResolveProxy(oldProfile);
      if (profile != oldProfile)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, KanbanmodelPackage.WORK_ITEM__PROFILE, oldProfile, profile));
      }
    }
    return profile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkItemProfile basicGetProfile()
  {
    return profile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProfile(WorkItemProfile newProfile)
  {
    WorkItemProfile oldProfile = profile;
    profile = newProfile;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM__PROFILE, oldProfile, profile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskType getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (TaskType)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, KanbanmodelPackage.WORK_ITEM__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskType basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(TaskType newType)
  {
    TaskType oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WorkItem> getPTasks()
  {
    if (pTasks == null)
    {
      pTasks = new EObjectResolvingEList<WorkItem>(WorkItem.class, this, KanbanmodelPackage.WORK_ITEM__PTASKS);
    }
    return pTasks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WorkItem> getSTasks()
  {
    if (sTasks == null)
    {
      sTasks = new EObjectResolvingEList<WorkItem>(WorkItem.class, this, KanbanmodelPackage.WORK_ITEM__STASKS);
    }
    return sTasks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CausalTrigger> getCausalTriggers()
  {
    if (causalTriggers == null)
    {
      causalTriggers = new EObjectContainmentEList<CausalTrigger>(CausalTrigger.class, this, KanbanmodelPackage.WORK_ITEM__CAUSAL_TRIGGERS);
    }
    return causalTriggers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ServiceType> getRequiredServices()
  {
    if (requiredServices == null)
    {
      requiredServices = new EObjectResolvingEList<ServiceType>(ServiceType.class, this, KanbanmodelPackage.WORK_ITEM__REQUIRED_SERVICES);
    }
    return requiredServices;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getEfforts()
  {
    return efforts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEfforts(int newEfforts)
  {
    int oldEfforts = efforts;
    efforts = newEfforts;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM__EFFORTS, oldEfforts, efforts));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(int newValue)
  {
    int oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassOfService getClassOfService()
  {
    if (classOfService != null && classOfService.eIsProxy())
    {
      InternalEObject oldClassOfService = (InternalEObject)classOfService;
      classOfService = (ClassOfService)eResolveProxy(oldClassOfService);
      if (classOfService != oldClassOfService)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, KanbanmodelPackage.WORK_ITEM__CLASS_OF_SERVICE, oldClassOfService, classOfService));
      }
    }
    return classOfService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassOfService basicGetClassOfService()
  {
    return classOfService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassOfService(ClassOfService newClassOfService)
  {
    ClassOfService oldClassOfService = classOfService;
    classOfService = newClassOfService;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM__CLASS_OF_SERVICE, oldClassOfService, classOfService));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkSource getWorkSource()
  {
    if (workSource != null && workSource.eIsProxy())
    {
      InternalEObject oldWorkSource = (InternalEObject)workSource;
      workSource = (WorkSource)eResolveProxy(oldWorkSource);
      if (workSource != oldWorkSource)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, KanbanmodelPackage.WORK_ITEM__WORK_SOURCE, oldWorkSource, workSource));
      }
    }
    return workSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkSource basicGetWorkSource()
  {
    return workSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWorkSource(WorkSource newWorkSource)
  {
    WorkSource oldWorkSource = workSource;
    workSource = newWorkSource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM__WORK_SOURCE, oldWorkSource, workSource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getArrivalTime()
  {
    return arrivalTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArrivalTime(int newArrivalTime)
  {
    int oldArrivalTime = arrivalTime;
    arrivalTime = newArrivalTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM__ARRIVAL_TIME, oldArrivalTime, arrivalTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDueDate()
  {
    return dueDate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDueDate(int newDueDate)
  {
    int oldDueDate = dueDate;
    dueDate = newDueDate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM__DUE_DATE, oldDueDate, dueDate));
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
      case KanbanmodelPackage.WORK_ITEM__CAUSAL_TRIGGERS:
        return ((InternalEList<?>)getCausalTriggers()).basicRemove(otherEnd, msgs);
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
      case KanbanmodelPackage.WORK_ITEM__NAME:
        return getName();
      case KanbanmodelPackage.WORK_ITEM__PROFILE:
        if (resolve) return getProfile();
        return basicGetProfile();
      case KanbanmodelPackage.WORK_ITEM__DESCRIPTION:
        return getDescription();
      case KanbanmodelPackage.WORK_ITEM__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case KanbanmodelPackage.WORK_ITEM__PTASKS:
        return getPTasks();
      case KanbanmodelPackage.WORK_ITEM__STASKS:
        return getSTasks();
      case KanbanmodelPackage.WORK_ITEM__CAUSAL_TRIGGERS:
        return getCausalTriggers();
      case KanbanmodelPackage.WORK_ITEM__REQUIRED_SERVICES:
        return getRequiredServices();
      case KanbanmodelPackage.WORK_ITEM__EFFORTS:
        return getEfforts();
      case KanbanmodelPackage.WORK_ITEM__VALUE:
        return getValue();
      case KanbanmodelPackage.WORK_ITEM__CLASS_OF_SERVICE:
        if (resolve) return getClassOfService();
        return basicGetClassOfService();
      case KanbanmodelPackage.WORK_ITEM__WORK_SOURCE:
        if (resolve) return getWorkSource();
        return basicGetWorkSource();
      case KanbanmodelPackage.WORK_ITEM__ARRIVAL_TIME:
        return getArrivalTime();
      case KanbanmodelPackage.WORK_ITEM__DUE_DATE:
        return getDueDate();
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
      case KanbanmodelPackage.WORK_ITEM__NAME:
        setName((String)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM__PROFILE:
        setProfile((WorkItemProfile)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM__TYPE:
        setType((TaskType)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM__PTASKS:
        getPTasks().clear();
        getPTasks().addAll((Collection<? extends WorkItem>)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM__STASKS:
        getSTasks().clear();
        getSTasks().addAll((Collection<? extends WorkItem>)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM__CAUSAL_TRIGGERS:
        getCausalTriggers().clear();
        getCausalTriggers().addAll((Collection<? extends CausalTrigger>)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM__REQUIRED_SERVICES:
        getRequiredServices().clear();
        getRequiredServices().addAll((Collection<? extends ServiceType>)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM__EFFORTS:
        setEfforts((Integer)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM__VALUE:
        setValue((Integer)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM__CLASS_OF_SERVICE:
        setClassOfService((ClassOfService)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM__WORK_SOURCE:
        setWorkSource((WorkSource)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM__ARRIVAL_TIME:
        setArrivalTime((Integer)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM__DUE_DATE:
        setDueDate((Integer)newValue);
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
      case KanbanmodelPackage.WORK_ITEM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case KanbanmodelPackage.WORK_ITEM__PROFILE:
        setProfile((WorkItemProfile)null);
        return;
      case KanbanmodelPackage.WORK_ITEM__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case KanbanmodelPackage.WORK_ITEM__TYPE:
        setType((TaskType)null);
        return;
      case KanbanmodelPackage.WORK_ITEM__PTASKS:
        getPTasks().clear();
        return;
      case KanbanmodelPackage.WORK_ITEM__STASKS:
        getSTasks().clear();
        return;
      case KanbanmodelPackage.WORK_ITEM__CAUSAL_TRIGGERS:
        getCausalTriggers().clear();
        return;
      case KanbanmodelPackage.WORK_ITEM__REQUIRED_SERVICES:
        getRequiredServices().clear();
        return;
      case KanbanmodelPackage.WORK_ITEM__EFFORTS:
        setEfforts(EFFORTS_EDEFAULT);
        return;
      case KanbanmodelPackage.WORK_ITEM__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case KanbanmodelPackage.WORK_ITEM__CLASS_OF_SERVICE:
        setClassOfService((ClassOfService)null);
        return;
      case KanbanmodelPackage.WORK_ITEM__WORK_SOURCE:
        setWorkSource((WorkSource)null);
        return;
      case KanbanmodelPackage.WORK_ITEM__ARRIVAL_TIME:
        setArrivalTime(ARRIVAL_TIME_EDEFAULT);
        return;
      case KanbanmodelPackage.WORK_ITEM__DUE_DATE:
        setDueDate(DUE_DATE_EDEFAULT);
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
      case KanbanmodelPackage.WORK_ITEM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case KanbanmodelPackage.WORK_ITEM__PROFILE:
        return profile != null;
      case KanbanmodelPackage.WORK_ITEM__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case KanbanmodelPackage.WORK_ITEM__TYPE:
        return type != null;
      case KanbanmodelPackage.WORK_ITEM__PTASKS:
        return pTasks != null && !pTasks.isEmpty();
      case KanbanmodelPackage.WORK_ITEM__STASKS:
        return sTasks != null && !sTasks.isEmpty();
      case KanbanmodelPackage.WORK_ITEM__CAUSAL_TRIGGERS:
        return causalTriggers != null && !causalTriggers.isEmpty();
      case KanbanmodelPackage.WORK_ITEM__REQUIRED_SERVICES:
        return requiredServices != null && !requiredServices.isEmpty();
      case KanbanmodelPackage.WORK_ITEM__EFFORTS:
        return efforts != EFFORTS_EDEFAULT;
      case KanbanmodelPackage.WORK_ITEM__VALUE:
        return value != VALUE_EDEFAULT;
      case KanbanmodelPackage.WORK_ITEM__CLASS_OF_SERVICE:
        return classOfService != null;
      case KanbanmodelPackage.WORK_ITEM__WORK_SOURCE:
        return workSource != null;
      case KanbanmodelPackage.WORK_ITEM__ARRIVAL_TIME:
        return arrivalTime != ARRIVAL_TIME_EDEFAULT;
      case KanbanmodelPackage.WORK_ITEM__DUE_DATE:
        return dueDate != DUE_DATE_EDEFAULT;
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
    result.append(", description: ");
    result.append(description);
    result.append(", efforts: ");
    result.append(efforts);
    result.append(", value: ");
    result.append(value);
    result.append(", arrivalTime: ");
    result.append(arrivalTime);
    result.append(", dueDate: ");
    result.append(dueDate);
    result.append(')');
    return result.toString();
  }

} //WorkItemImpl
