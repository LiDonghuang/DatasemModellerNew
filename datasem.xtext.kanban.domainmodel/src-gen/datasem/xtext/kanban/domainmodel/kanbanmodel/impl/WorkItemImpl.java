/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel.impl;

import datasem.xtext.kanban.domainmodel.kanbanmodel.AbstractParameter;
import datasem.xtext.kanban.domainmodel.kanbanmodel.CausalTrigger;
import datasem.xtext.kanban.domainmodel.kanbanmodel.ClassOfService;
import datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import datasem.xtext.kanban.domainmodel.kanbanmodel.NumExpression;
import datasem.xtext.kanban.domainmodel.kanbanmodel.Service;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemType;
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
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl#getId <em>Id</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl#getName <em>Name</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl#getType <em>Type</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl#isHasPredecessors <em>Has Predecessors</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl#getPTasks <em>PTasks</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl#isIsAggregationNode <em>Is Aggregation Node</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl#getSTasks <em>STasks</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl#getCausalTriggers <em>Causal Triggers</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl#getRequiredServices <em>Required Services</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl#getEfforts <em>Efforts</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl#getMaturityLevels <em>Maturity Levels</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl#getUncertainty <em>Uncertainty</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl#getRisk <em>Risk</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl#getChangePropagation <em>Change Propagation</em>}</li>
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
  protected WorkItemType type;

  /**
   * The default value of the '{@link #isHasPredecessors() <em>Has Predecessors</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasPredecessors()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_PREDECESSORS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasPredecessors() <em>Has Predecessors</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasPredecessors()
   * @generated
   * @ordered
   */
  protected boolean hasPredecessors = HAS_PREDECESSORS_EDEFAULT;

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
   * The default value of the '{@link #isIsAggregationNode() <em>Is Aggregation Node</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsAggregationNode()
   * @generated
   * @ordered
   */
  protected static final boolean IS_AGGREGATION_NODE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsAggregationNode() <em>Is Aggregation Node</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsAggregationNode()
   * @generated
   * @ordered
   */
  protected boolean isAggregationNode = IS_AGGREGATION_NODE_EDEFAULT;

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
  protected EList<Service> requiredServices;

  /**
   * The cached value of the '{@link #getEfforts() <em>Efforts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEfforts()
   * @generated
   * @ordered
   */
  protected NumExpression efforts;

  /**
   * The cached value of the '{@link #getMaturityLevels() <em>Maturity Levels</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaturityLevels()
   * @generated
   * @ordered
   */
  protected AbstractParameter maturityLevels;

  /**
   * The cached value of the '{@link #getUncertainty() <em>Uncertainty</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUncertainty()
   * @generated
   * @ordered
   */
  protected AbstractParameter uncertainty;

  /**
   * The cached value of the '{@link #getRisk() <em>Risk</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRisk()
   * @generated
   * @ordered
   */
  protected AbstractParameter risk;

  /**
   * The default value of the '{@link #getChangePropagation() <em>Change Propagation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChangePropagation()
   * @generated
   * @ordered
   */
  protected static final String CHANGE_PROPAGATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getChangePropagation() <em>Change Propagation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChangePropagation()
   * @generated
   * @ordered
   */
  protected String changePropagation = CHANGE_PROPAGATION_EDEFAULT;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected NumExpression value;

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
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM__ID, oldId, id));
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
  public WorkItemType getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (WorkItemType)eResolveProxy(oldType);
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
  public WorkItemType basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(WorkItemType newType)
  {
    WorkItemType oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHasPredecessors()
  {
    return hasPredecessors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasPredecessors(boolean newHasPredecessors)
  {
    boolean oldHasPredecessors = hasPredecessors;
    hasPredecessors = newHasPredecessors;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM__HAS_PREDECESSORS, oldHasPredecessors, hasPredecessors));
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
  public boolean isIsAggregationNode()
  {
    return isAggregationNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsAggregationNode(boolean newIsAggregationNode)
  {
    boolean oldIsAggregationNode = isAggregationNode;
    isAggregationNode = newIsAggregationNode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM__IS_AGGREGATION_NODE, oldIsAggregationNode, isAggregationNode));
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
  public EList<Service> getRequiredServices()
  {
    if (requiredServices == null)
    {
      requiredServices = new EObjectResolvingEList<Service>(Service.class, this, KanbanmodelPackage.WORK_ITEM__REQUIRED_SERVICES);
    }
    return requiredServices;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumExpression getEfforts()
  {
    return efforts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEfforts(NumExpression newEfforts, NotificationChain msgs)
  {
    NumExpression oldEfforts = efforts;
    efforts = newEfforts;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM__EFFORTS, oldEfforts, newEfforts);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEfforts(NumExpression newEfforts)
  {
    if (newEfforts != efforts)
    {
      NotificationChain msgs = null;
      if (efforts != null)
        msgs = ((InternalEObject)efforts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.WORK_ITEM__EFFORTS, null, msgs);
      if (newEfforts != null)
        msgs = ((InternalEObject)newEfforts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.WORK_ITEM__EFFORTS, null, msgs);
      msgs = basicSetEfforts(newEfforts, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM__EFFORTS, newEfforts, newEfforts));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractParameter getMaturityLevels()
  {
    if (maturityLevels != null && maturityLevels.eIsProxy())
    {
      InternalEObject oldMaturityLevels = (InternalEObject)maturityLevels;
      maturityLevels = (AbstractParameter)eResolveProxy(oldMaturityLevels);
      if (maturityLevels != oldMaturityLevels)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, KanbanmodelPackage.WORK_ITEM__MATURITY_LEVELS, oldMaturityLevels, maturityLevels));
      }
    }
    return maturityLevels;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractParameter basicGetMaturityLevels()
  {
    return maturityLevels;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaturityLevels(AbstractParameter newMaturityLevels)
  {
    AbstractParameter oldMaturityLevels = maturityLevels;
    maturityLevels = newMaturityLevels;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM__MATURITY_LEVELS, oldMaturityLevels, maturityLevels));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractParameter getUncertainty()
  {
    if (uncertainty != null && uncertainty.eIsProxy())
    {
      InternalEObject oldUncertainty = (InternalEObject)uncertainty;
      uncertainty = (AbstractParameter)eResolveProxy(oldUncertainty);
      if (uncertainty != oldUncertainty)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, KanbanmodelPackage.WORK_ITEM__UNCERTAINTY, oldUncertainty, uncertainty));
      }
    }
    return uncertainty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractParameter basicGetUncertainty()
  {
    return uncertainty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUncertainty(AbstractParameter newUncertainty)
  {
    AbstractParameter oldUncertainty = uncertainty;
    uncertainty = newUncertainty;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM__UNCERTAINTY, oldUncertainty, uncertainty));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractParameter getRisk()
  {
    if (risk != null && risk.eIsProxy())
    {
      InternalEObject oldRisk = (InternalEObject)risk;
      risk = (AbstractParameter)eResolveProxy(oldRisk);
      if (risk != oldRisk)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, KanbanmodelPackage.WORK_ITEM__RISK, oldRisk, risk));
      }
    }
    return risk;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractParameter basicGetRisk()
  {
    return risk;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRisk(AbstractParameter newRisk)
  {
    AbstractParameter oldRisk = risk;
    risk = newRisk;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM__RISK, oldRisk, risk));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getChangePropagation()
  {
    return changePropagation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChangePropagation(String newChangePropagation)
  {
    String oldChangePropagation = changePropagation;
    changePropagation = newChangePropagation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM__CHANGE_PROPAGATION, oldChangePropagation, changePropagation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumExpression getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(NumExpression newValue, NotificationChain msgs)
  {
    NumExpression oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(NumExpression newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.WORK_ITEM__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.WORK_ITEM__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM__VALUE, newValue, newValue));
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
      case KanbanmodelPackage.WORK_ITEM__EFFORTS:
        return basicSetEfforts(null, msgs);
      case KanbanmodelPackage.WORK_ITEM__VALUE:
        return basicSetValue(null, msgs);
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
      case KanbanmodelPackage.WORK_ITEM__ID:
        return getId();
      case KanbanmodelPackage.WORK_ITEM__NAME:
        return getName();
      case KanbanmodelPackage.WORK_ITEM__DESCRIPTION:
        return getDescription();
      case KanbanmodelPackage.WORK_ITEM__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case KanbanmodelPackage.WORK_ITEM__HAS_PREDECESSORS:
        return isHasPredecessors();
      case KanbanmodelPackage.WORK_ITEM__PTASKS:
        return getPTasks();
      case KanbanmodelPackage.WORK_ITEM__IS_AGGREGATION_NODE:
        return isIsAggregationNode();
      case KanbanmodelPackage.WORK_ITEM__STASKS:
        return getSTasks();
      case KanbanmodelPackage.WORK_ITEM__CAUSAL_TRIGGERS:
        return getCausalTriggers();
      case KanbanmodelPackage.WORK_ITEM__REQUIRED_SERVICES:
        return getRequiredServices();
      case KanbanmodelPackage.WORK_ITEM__EFFORTS:
        return getEfforts();
      case KanbanmodelPackage.WORK_ITEM__MATURITY_LEVELS:
        if (resolve) return getMaturityLevels();
        return basicGetMaturityLevels();
      case KanbanmodelPackage.WORK_ITEM__UNCERTAINTY:
        if (resolve) return getUncertainty();
        return basicGetUncertainty();
      case KanbanmodelPackage.WORK_ITEM__RISK:
        if (resolve) return getRisk();
        return basicGetRisk();
      case KanbanmodelPackage.WORK_ITEM__CHANGE_PROPAGATION:
        return getChangePropagation();
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
      case KanbanmodelPackage.WORK_ITEM__ID:
        setId((Integer)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM__NAME:
        setName((String)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM__TYPE:
        setType((WorkItemType)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM__HAS_PREDECESSORS:
        setHasPredecessors((Boolean)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM__PTASKS:
        getPTasks().clear();
        getPTasks().addAll((Collection<? extends WorkItem>)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM__IS_AGGREGATION_NODE:
        setIsAggregationNode((Boolean)newValue);
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
        getRequiredServices().addAll((Collection<? extends Service>)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM__EFFORTS:
        setEfforts((NumExpression)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM__MATURITY_LEVELS:
        setMaturityLevels((AbstractParameter)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM__UNCERTAINTY:
        setUncertainty((AbstractParameter)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM__RISK:
        setRisk((AbstractParameter)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM__CHANGE_PROPAGATION:
        setChangePropagation((String)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM__VALUE:
        setValue((NumExpression)newValue);
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
      case KanbanmodelPackage.WORK_ITEM__ID:
        setId(ID_EDEFAULT);
        return;
      case KanbanmodelPackage.WORK_ITEM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case KanbanmodelPackage.WORK_ITEM__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case KanbanmodelPackage.WORK_ITEM__TYPE:
        setType((WorkItemType)null);
        return;
      case KanbanmodelPackage.WORK_ITEM__HAS_PREDECESSORS:
        setHasPredecessors(HAS_PREDECESSORS_EDEFAULT);
        return;
      case KanbanmodelPackage.WORK_ITEM__PTASKS:
        getPTasks().clear();
        return;
      case KanbanmodelPackage.WORK_ITEM__IS_AGGREGATION_NODE:
        setIsAggregationNode(IS_AGGREGATION_NODE_EDEFAULT);
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
        setEfforts((NumExpression)null);
        return;
      case KanbanmodelPackage.WORK_ITEM__MATURITY_LEVELS:
        setMaturityLevels((AbstractParameter)null);
        return;
      case KanbanmodelPackage.WORK_ITEM__UNCERTAINTY:
        setUncertainty((AbstractParameter)null);
        return;
      case KanbanmodelPackage.WORK_ITEM__RISK:
        setRisk((AbstractParameter)null);
        return;
      case KanbanmodelPackage.WORK_ITEM__CHANGE_PROPAGATION:
        setChangePropagation(CHANGE_PROPAGATION_EDEFAULT);
        return;
      case KanbanmodelPackage.WORK_ITEM__VALUE:
        setValue((NumExpression)null);
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
      case KanbanmodelPackage.WORK_ITEM__ID:
        return id != ID_EDEFAULT;
      case KanbanmodelPackage.WORK_ITEM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case KanbanmodelPackage.WORK_ITEM__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case KanbanmodelPackage.WORK_ITEM__TYPE:
        return type != null;
      case KanbanmodelPackage.WORK_ITEM__HAS_PREDECESSORS:
        return hasPredecessors != HAS_PREDECESSORS_EDEFAULT;
      case KanbanmodelPackage.WORK_ITEM__PTASKS:
        return pTasks != null && !pTasks.isEmpty();
      case KanbanmodelPackage.WORK_ITEM__IS_AGGREGATION_NODE:
        return isAggregationNode != IS_AGGREGATION_NODE_EDEFAULT;
      case KanbanmodelPackage.WORK_ITEM__STASKS:
        return sTasks != null && !sTasks.isEmpty();
      case KanbanmodelPackage.WORK_ITEM__CAUSAL_TRIGGERS:
        return causalTriggers != null && !causalTriggers.isEmpty();
      case KanbanmodelPackage.WORK_ITEM__REQUIRED_SERVICES:
        return requiredServices != null && !requiredServices.isEmpty();
      case KanbanmodelPackage.WORK_ITEM__EFFORTS:
        return efforts != null;
      case KanbanmodelPackage.WORK_ITEM__MATURITY_LEVELS:
        return maturityLevels != null;
      case KanbanmodelPackage.WORK_ITEM__UNCERTAINTY:
        return uncertainty != null;
      case KanbanmodelPackage.WORK_ITEM__RISK:
        return risk != null;
      case KanbanmodelPackage.WORK_ITEM__CHANGE_PROPAGATION:
        return CHANGE_PROPAGATION_EDEFAULT == null ? changePropagation != null : !CHANGE_PROPAGATION_EDEFAULT.equals(changePropagation);
      case KanbanmodelPackage.WORK_ITEM__VALUE:
        return value != null;
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
    result.append(" (id: ");
    result.append(id);
    result.append(", name: ");
    result.append(name);
    result.append(", description: ");
    result.append(description);
    result.append(", hasPredecessors: ");
    result.append(hasPredecessors);
    result.append(", isAggregationNode: ");
    result.append(isAggregationNode);
    result.append(", changePropagation: ");
    result.append(changePropagation);
    result.append(", arrivalTime: ");
    result.append(arrivalTime);
    result.append(", dueDate: ");
    result.append(dueDate);
    result.append(')');
    return result.toString();
  }

} //WorkItemImpl
