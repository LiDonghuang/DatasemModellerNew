/**
 */
package datasemModeller.dmodel.impl;

import datasemModeller.dmodel.AbstractParameter;
import datasemModeller.dmodel.DmodelPackage;
import datasemModeller.dmodel.Impact;
import datasemModeller.dmodel.Mechanism;
import datasemModeller.dmodel.NumExpression;
import datasemModeller.dmodel.RequiredService;
import datasemModeller.dmodel.WorkItem;
import datasemModeller.dmodel.WorkItemType;
import datasemModeller.dmodel.WorkSource;

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
 *   <li>{@link datasemModeller.dmodel.impl.WorkItemImpl#getName <em>Name</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.WorkItemImpl#getType <em>Type</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.WorkItemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.WorkItemImpl#isHasPredecessors <em>Has Predecessors</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.WorkItemImpl#getPTasks <em>PTasks</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.WorkItemImpl#isHasSubtasks <em>Has Subtasks</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.WorkItemImpl#getSTasks <em>STasks</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.WorkItemImpl#getRequiredAnalysis <em>Required Analysis</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.WorkItemImpl#isHasDecompositionMechanism <em>Has Decomposition Mechanism</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.WorkItemImpl#getDecompositionMechanism <em>Decomposition Mechanism</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.WorkItemImpl#getRequiredServices <em>Required Services</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.WorkItemImpl#getMaturityLevels <em>Maturity Levels</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.WorkItemImpl#getUncertainty <em>Uncertainty</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.WorkItemImpl#getRisk <em>Risk</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.WorkItemImpl#isHasImpacts <em>Has Impacts</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.WorkItemImpl#getImpacts <em>Impacts</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.WorkItemImpl#getValue <em>Value</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.WorkItemImpl#getWorkSource <em>Work Source</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.WorkItemImpl#getArrivalTime <em>Arrival Time</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.WorkItemImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.WorkItemImpl#getId <em>Id</em>}</li>
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
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected WorkItemType type;

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
   * The default value of the '{@link #isHasSubtasks() <em>Has Subtasks</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasSubtasks()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_SUBTASKS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasSubtasks() <em>Has Subtasks</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasSubtasks()
   * @generated
   * @ordered
   */
  protected boolean hasSubtasks = HAS_SUBTASKS_EDEFAULT;

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
   * The cached value of the '{@link #getRequiredAnalysis() <em>Required Analysis</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequiredAnalysis()
   * @generated
   * @ordered
   */
  protected EList<RequiredService> requiredAnalysis;

  /**
   * The default value of the '{@link #isHasDecompositionMechanism() <em>Has Decomposition Mechanism</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasDecompositionMechanism()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_DECOMPOSITION_MECHANISM_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasDecompositionMechanism() <em>Has Decomposition Mechanism</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasDecompositionMechanism()
   * @generated
   * @ordered
   */
  protected boolean hasDecompositionMechanism = HAS_DECOMPOSITION_MECHANISM_EDEFAULT;

  /**
   * The cached value of the '{@link #getDecompositionMechanism() <em>Decomposition Mechanism</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecompositionMechanism()
   * @generated
   * @ordered
   */
  protected Mechanism decompositionMechanism;

  /**
   * The cached value of the '{@link #getRequiredServices() <em>Required Services</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequiredServices()
   * @generated
   * @ordered
   */
  protected EList<RequiredService> requiredServices;

  /**
   * The cached value of the '{@link #getMaturityLevels() <em>Maturity Levels</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaturityLevels()
   * @generated
   * @ordered
   */
  protected AbstractParameter maturityLevels;

  /**
   * The cached value of the '{@link #getUncertainty() <em>Uncertainty</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUncertainty()
   * @generated
   * @ordered
   */
  protected AbstractParameter uncertainty;

  /**
   * The cached value of the '{@link #getRisk() <em>Risk</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRisk()
   * @generated
   * @ordered
   */
  protected AbstractParameter risk;

  /**
   * The default value of the '{@link #isHasImpacts() <em>Has Impacts</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasImpacts()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_IMPACTS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasImpacts() <em>Has Impacts</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasImpacts()
   * @generated
   * @ordered
   */
  protected boolean hasImpacts = HAS_IMPACTS_EDEFAULT;

  /**
   * The cached value of the '{@link #getImpacts() <em>Impacts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImpacts()
   * @generated
   * @ordered
   */
  protected EList<Impact> impacts;

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
   * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDuration()
   * @generated
   * @ordered
   */
  protected static final int DURATION_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDuration()
   * @generated
   * @ordered
   */
  protected int duration = DURATION_EDEFAULT;

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
    return DmodelPackage.Literals.WORK_ITEM;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.WORK_ITEM__NAME, oldName, name));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DmodelPackage.WORK_ITEM__TYPE, oldType, type));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.WORK_ITEM__TYPE, oldType, type));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.WORK_ITEM__DESCRIPTION, oldDescription, description));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.WORK_ITEM__HAS_PREDECESSORS, oldHasPredecessors, hasPredecessors));
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
      pTasks = new EObjectResolvingEList<WorkItem>(WorkItem.class, this, DmodelPackage.WORK_ITEM__PTASKS);
    }
    return pTasks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHasSubtasks()
  {
    return hasSubtasks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasSubtasks(boolean newHasSubtasks)
  {
    boolean oldHasSubtasks = hasSubtasks;
    hasSubtasks = newHasSubtasks;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.WORK_ITEM__HAS_SUBTASKS, oldHasSubtasks, hasSubtasks));
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
      sTasks = new EObjectResolvingEList<WorkItem>(WorkItem.class, this, DmodelPackage.WORK_ITEM__STASKS);
    }
    return sTasks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RequiredService> getRequiredAnalysis()
  {
    if (requiredAnalysis == null)
    {
      requiredAnalysis = new EObjectContainmentEList<RequiredService>(RequiredService.class, this, DmodelPackage.WORK_ITEM__REQUIRED_ANALYSIS);
    }
    return requiredAnalysis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHasDecompositionMechanism()
  {
    return hasDecompositionMechanism;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasDecompositionMechanism(boolean newHasDecompositionMechanism)
  {
    boolean oldHasDecompositionMechanism = hasDecompositionMechanism;
    hasDecompositionMechanism = newHasDecompositionMechanism;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.WORK_ITEM__HAS_DECOMPOSITION_MECHANISM, oldHasDecompositionMechanism, hasDecompositionMechanism));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mechanism getDecompositionMechanism()
  {
    return decompositionMechanism;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDecompositionMechanism(Mechanism newDecompositionMechanism, NotificationChain msgs)
  {
    Mechanism oldDecompositionMechanism = decompositionMechanism;
    decompositionMechanism = newDecompositionMechanism;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmodelPackage.WORK_ITEM__DECOMPOSITION_MECHANISM, oldDecompositionMechanism, newDecompositionMechanism);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDecompositionMechanism(Mechanism newDecompositionMechanism)
  {
    if (newDecompositionMechanism != decompositionMechanism)
    {
      NotificationChain msgs = null;
      if (decompositionMechanism != null)
        msgs = ((InternalEObject)decompositionMechanism).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmodelPackage.WORK_ITEM__DECOMPOSITION_MECHANISM, null, msgs);
      if (newDecompositionMechanism != null)
        msgs = ((InternalEObject)newDecompositionMechanism).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmodelPackage.WORK_ITEM__DECOMPOSITION_MECHANISM, null, msgs);
      msgs = basicSetDecompositionMechanism(newDecompositionMechanism, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.WORK_ITEM__DECOMPOSITION_MECHANISM, newDecompositionMechanism, newDecompositionMechanism));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RequiredService> getRequiredServices()
  {
    if (requiredServices == null)
    {
      requiredServices = new EObjectContainmentEList<RequiredService>(RequiredService.class, this, DmodelPackage.WORK_ITEM__REQUIRED_SERVICES);
    }
    return requiredServices;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractParameter getMaturityLevels()
  {
    return maturityLevels;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMaturityLevels(AbstractParameter newMaturityLevels, NotificationChain msgs)
  {
    AbstractParameter oldMaturityLevels = maturityLevels;
    maturityLevels = newMaturityLevels;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmodelPackage.WORK_ITEM__MATURITY_LEVELS, oldMaturityLevels, newMaturityLevels);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaturityLevels(AbstractParameter newMaturityLevels)
  {
    if (newMaturityLevels != maturityLevels)
    {
      NotificationChain msgs = null;
      if (maturityLevels != null)
        msgs = ((InternalEObject)maturityLevels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmodelPackage.WORK_ITEM__MATURITY_LEVELS, null, msgs);
      if (newMaturityLevels != null)
        msgs = ((InternalEObject)newMaturityLevels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmodelPackage.WORK_ITEM__MATURITY_LEVELS, null, msgs);
      msgs = basicSetMaturityLevels(newMaturityLevels, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.WORK_ITEM__MATURITY_LEVELS, newMaturityLevels, newMaturityLevels));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractParameter getUncertainty()
  {
    return uncertainty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUncertainty(AbstractParameter newUncertainty, NotificationChain msgs)
  {
    AbstractParameter oldUncertainty = uncertainty;
    uncertainty = newUncertainty;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmodelPackage.WORK_ITEM__UNCERTAINTY, oldUncertainty, newUncertainty);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUncertainty(AbstractParameter newUncertainty)
  {
    if (newUncertainty != uncertainty)
    {
      NotificationChain msgs = null;
      if (uncertainty != null)
        msgs = ((InternalEObject)uncertainty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmodelPackage.WORK_ITEM__UNCERTAINTY, null, msgs);
      if (newUncertainty != null)
        msgs = ((InternalEObject)newUncertainty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmodelPackage.WORK_ITEM__UNCERTAINTY, null, msgs);
      msgs = basicSetUncertainty(newUncertainty, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.WORK_ITEM__UNCERTAINTY, newUncertainty, newUncertainty));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractParameter getRisk()
  {
    return risk;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRisk(AbstractParameter newRisk, NotificationChain msgs)
  {
    AbstractParameter oldRisk = risk;
    risk = newRisk;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmodelPackage.WORK_ITEM__RISK, oldRisk, newRisk);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRisk(AbstractParameter newRisk)
  {
    if (newRisk != risk)
    {
      NotificationChain msgs = null;
      if (risk != null)
        msgs = ((InternalEObject)risk).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmodelPackage.WORK_ITEM__RISK, null, msgs);
      if (newRisk != null)
        msgs = ((InternalEObject)newRisk).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmodelPackage.WORK_ITEM__RISK, null, msgs);
      msgs = basicSetRisk(newRisk, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.WORK_ITEM__RISK, newRisk, newRisk));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHasImpacts()
  {
    return hasImpacts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasImpacts(boolean newHasImpacts)
  {
    boolean oldHasImpacts = hasImpacts;
    hasImpacts = newHasImpacts;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.WORK_ITEM__HAS_IMPACTS, oldHasImpacts, hasImpacts));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Impact> getImpacts()
  {
    if (impacts == null)
    {
      impacts = new EObjectContainmentEList<Impact>(Impact.class, this, DmodelPackage.WORK_ITEM__IMPACTS);
    }
    return impacts;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmodelPackage.WORK_ITEM__VALUE, oldValue, newValue);
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
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmodelPackage.WORK_ITEM__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmodelPackage.WORK_ITEM__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.WORK_ITEM__VALUE, newValue, newValue));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DmodelPackage.WORK_ITEM__WORK_SOURCE, oldWorkSource, workSource));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.WORK_ITEM__WORK_SOURCE, oldWorkSource, workSource));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.WORK_ITEM__ARRIVAL_TIME, oldArrivalTime, arrivalTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDuration()
  {
    return duration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDuration(int newDuration)
  {
    int oldDuration = duration;
    duration = newDuration;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.WORK_ITEM__DURATION, oldDuration, duration));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.WORK_ITEM__ID, oldId, id));
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
      case DmodelPackage.WORK_ITEM__REQUIRED_ANALYSIS:
        return ((InternalEList<?>)getRequiredAnalysis()).basicRemove(otherEnd, msgs);
      case DmodelPackage.WORK_ITEM__DECOMPOSITION_MECHANISM:
        return basicSetDecompositionMechanism(null, msgs);
      case DmodelPackage.WORK_ITEM__REQUIRED_SERVICES:
        return ((InternalEList<?>)getRequiredServices()).basicRemove(otherEnd, msgs);
      case DmodelPackage.WORK_ITEM__MATURITY_LEVELS:
        return basicSetMaturityLevels(null, msgs);
      case DmodelPackage.WORK_ITEM__UNCERTAINTY:
        return basicSetUncertainty(null, msgs);
      case DmodelPackage.WORK_ITEM__RISK:
        return basicSetRisk(null, msgs);
      case DmodelPackage.WORK_ITEM__IMPACTS:
        return ((InternalEList<?>)getImpacts()).basicRemove(otherEnd, msgs);
      case DmodelPackage.WORK_ITEM__VALUE:
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
      case DmodelPackage.WORK_ITEM__NAME:
        return getName();
      case DmodelPackage.WORK_ITEM__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case DmodelPackage.WORK_ITEM__DESCRIPTION:
        return getDescription();
      case DmodelPackage.WORK_ITEM__HAS_PREDECESSORS:
        return isHasPredecessors();
      case DmodelPackage.WORK_ITEM__PTASKS:
        return getPTasks();
      case DmodelPackage.WORK_ITEM__HAS_SUBTASKS:
        return isHasSubtasks();
      case DmodelPackage.WORK_ITEM__STASKS:
        return getSTasks();
      case DmodelPackage.WORK_ITEM__REQUIRED_ANALYSIS:
        return getRequiredAnalysis();
      case DmodelPackage.WORK_ITEM__HAS_DECOMPOSITION_MECHANISM:
        return isHasDecompositionMechanism();
      case DmodelPackage.WORK_ITEM__DECOMPOSITION_MECHANISM:
        return getDecompositionMechanism();
      case DmodelPackage.WORK_ITEM__REQUIRED_SERVICES:
        return getRequiredServices();
      case DmodelPackage.WORK_ITEM__MATURITY_LEVELS:
        return getMaturityLevels();
      case DmodelPackage.WORK_ITEM__UNCERTAINTY:
        return getUncertainty();
      case DmodelPackage.WORK_ITEM__RISK:
        return getRisk();
      case DmodelPackage.WORK_ITEM__HAS_IMPACTS:
        return isHasImpacts();
      case DmodelPackage.WORK_ITEM__IMPACTS:
        return getImpacts();
      case DmodelPackage.WORK_ITEM__VALUE:
        return getValue();
      case DmodelPackage.WORK_ITEM__WORK_SOURCE:
        if (resolve) return getWorkSource();
        return basicGetWorkSource();
      case DmodelPackage.WORK_ITEM__ARRIVAL_TIME:
        return getArrivalTime();
      case DmodelPackage.WORK_ITEM__DURATION:
        return getDuration();
      case DmodelPackage.WORK_ITEM__ID:
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
      case DmodelPackage.WORK_ITEM__NAME:
        setName((String)newValue);
        return;
      case DmodelPackage.WORK_ITEM__TYPE:
        setType((WorkItemType)newValue);
        return;
      case DmodelPackage.WORK_ITEM__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case DmodelPackage.WORK_ITEM__HAS_PREDECESSORS:
        setHasPredecessors((Boolean)newValue);
        return;
      case DmodelPackage.WORK_ITEM__PTASKS:
        getPTasks().clear();
        getPTasks().addAll((Collection<? extends WorkItem>)newValue);
        return;
      case DmodelPackage.WORK_ITEM__HAS_SUBTASKS:
        setHasSubtasks((Boolean)newValue);
        return;
      case DmodelPackage.WORK_ITEM__STASKS:
        getSTasks().clear();
        getSTasks().addAll((Collection<? extends WorkItem>)newValue);
        return;
      case DmodelPackage.WORK_ITEM__REQUIRED_ANALYSIS:
        getRequiredAnalysis().clear();
        getRequiredAnalysis().addAll((Collection<? extends RequiredService>)newValue);
        return;
      case DmodelPackage.WORK_ITEM__HAS_DECOMPOSITION_MECHANISM:
        setHasDecompositionMechanism((Boolean)newValue);
        return;
      case DmodelPackage.WORK_ITEM__DECOMPOSITION_MECHANISM:
        setDecompositionMechanism((Mechanism)newValue);
        return;
      case DmodelPackage.WORK_ITEM__REQUIRED_SERVICES:
        getRequiredServices().clear();
        getRequiredServices().addAll((Collection<? extends RequiredService>)newValue);
        return;
      case DmodelPackage.WORK_ITEM__MATURITY_LEVELS:
        setMaturityLevels((AbstractParameter)newValue);
        return;
      case DmodelPackage.WORK_ITEM__UNCERTAINTY:
        setUncertainty((AbstractParameter)newValue);
        return;
      case DmodelPackage.WORK_ITEM__RISK:
        setRisk((AbstractParameter)newValue);
        return;
      case DmodelPackage.WORK_ITEM__HAS_IMPACTS:
        setHasImpacts((Boolean)newValue);
        return;
      case DmodelPackage.WORK_ITEM__IMPACTS:
        getImpacts().clear();
        getImpacts().addAll((Collection<? extends Impact>)newValue);
        return;
      case DmodelPackage.WORK_ITEM__VALUE:
        setValue((NumExpression)newValue);
        return;
      case DmodelPackage.WORK_ITEM__WORK_SOURCE:
        setWorkSource((WorkSource)newValue);
        return;
      case DmodelPackage.WORK_ITEM__ARRIVAL_TIME:
        setArrivalTime((Integer)newValue);
        return;
      case DmodelPackage.WORK_ITEM__DURATION:
        setDuration((Integer)newValue);
        return;
      case DmodelPackage.WORK_ITEM__ID:
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
      case DmodelPackage.WORK_ITEM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DmodelPackage.WORK_ITEM__TYPE:
        setType((WorkItemType)null);
        return;
      case DmodelPackage.WORK_ITEM__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case DmodelPackage.WORK_ITEM__HAS_PREDECESSORS:
        setHasPredecessors(HAS_PREDECESSORS_EDEFAULT);
        return;
      case DmodelPackage.WORK_ITEM__PTASKS:
        getPTasks().clear();
        return;
      case DmodelPackage.WORK_ITEM__HAS_SUBTASKS:
        setHasSubtasks(HAS_SUBTASKS_EDEFAULT);
        return;
      case DmodelPackage.WORK_ITEM__STASKS:
        getSTasks().clear();
        return;
      case DmodelPackage.WORK_ITEM__REQUIRED_ANALYSIS:
        getRequiredAnalysis().clear();
        return;
      case DmodelPackage.WORK_ITEM__HAS_DECOMPOSITION_MECHANISM:
        setHasDecompositionMechanism(HAS_DECOMPOSITION_MECHANISM_EDEFAULT);
        return;
      case DmodelPackage.WORK_ITEM__DECOMPOSITION_MECHANISM:
        setDecompositionMechanism((Mechanism)null);
        return;
      case DmodelPackage.WORK_ITEM__REQUIRED_SERVICES:
        getRequiredServices().clear();
        return;
      case DmodelPackage.WORK_ITEM__MATURITY_LEVELS:
        setMaturityLevels((AbstractParameter)null);
        return;
      case DmodelPackage.WORK_ITEM__UNCERTAINTY:
        setUncertainty((AbstractParameter)null);
        return;
      case DmodelPackage.WORK_ITEM__RISK:
        setRisk((AbstractParameter)null);
        return;
      case DmodelPackage.WORK_ITEM__HAS_IMPACTS:
        setHasImpacts(HAS_IMPACTS_EDEFAULT);
        return;
      case DmodelPackage.WORK_ITEM__IMPACTS:
        getImpacts().clear();
        return;
      case DmodelPackage.WORK_ITEM__VALUE:
        setValue((NumExpression)null);
        return;
      case DmodelPackage.WORK_ITEM__WORK_SOURCE:
        setWorkSource((WorkSource)null);
        return;
      case DmodelPackage.WORK_ITEM__ARRIVAL_TIME:
        setArrivalTime(ARRIVAL_TIME_EDEFAULT);
        return;
      case DmodelPackage.WORK_ITEM__DURATION:
        setDuration(DURATION_EDEFAULT);
        return;
      case DmodelPackage.WORK_ITEM__ID:
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
      case DmodelPackage.WORK_ITEM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DmodelPackage.WORK_ITEM__TYPE:
        return type != null;
      case DmodelPackage.WORK_ITEM__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case DmodelPackage.WORK_ITEM__HAS_PREDECESSORS:
        return hasPredecessors != HAS_PREDECESSORS_EDEFAULT;
      case DmodelPackage.WORK_ITEM__PTASKS:
        return pTasks != null && !pTasks.isEmpty();
      case DmodelPackage.WORK_ITEM__HAS_SUBTASKS:
        return hasSubtasks != HAS_SUBTASKS_EDEFAULT;
      case DmodelPackage.WORK_ITEM__STASKS:
        return sTasks != null && !sTasks.isEmpty();
      case DmodelPackage.WORK_ITEM__REQUIRED_ANALYSIS:
        return requiredAnalysis != null && !requiredAnalysis.isEmpty();
      case DmodelPackage.WORK_ITEM__HAS_DECOMPOSITION_MECHANISM:
        return hasDecompositionMechanism != HAS_DECOMPOSITION_MECHANISM_EDEFAULT;
      case DmodelPackage.WORK_ITEM__DECOMPOSITION_MECHANISM:
        return decompositionMechanism != null;
      case DmodelPackage.WORK_ITEM__REQUIRED_SERVICES:
        return requiredServices != null && !requiredServices.isEmpty();
      case DmodelPackage.WORK_ITEM__MATURITY_LEVELS:
        return maturityLevels != null;
      case DmodelPackage.WORK_ITEM__UNCERTAINTY:
        return uncertainty != null;
      case DmodelPackage.WORK_ITEM__RISK:
        return risk != null;
      case DmodelPackage.WORK_ITEM__HAS_IMPACTS:
        return hasImpacts != HAS_IMPACTS_EDEFAULT;
      case DmodelPackage.WORK_ITEM__IMPACTS:
        return impacts != null && !impacts.isEmpty();
      case DmodelPackage.WORK_ITEM__VALUE:
        return value != null;
      case DmodelPackage.WORK_ITEM__WORK_SOURCE:
        return workSource != null;
      case DmodelPackage.WORK_ITEM__ARRIVAL_TIME:
        return arrivalTime != ARRIVAL_TIME_EDEFAULT;
      case DmodelPackage.WORK_ITEM__DURATION:
        return duration != DURATION_EDEFAULT;
      case DmodelPackage.WORK_ITEM__ID:
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
    result.append(", description: ");
    result.append(description);
    result.append(", hasPredecessors: ");
    result.append(hasPredecessors);
    result.append(", hasSubtasks: ");
    result.append(hasSubtasks);
    result.append(", hasDecompositionMechanism: ");
    result.append(hasDecompositionMechanism);
    result.append(", hasImpacts: ");
    result.append(hasImpacts);
    result.append(", arrivalTime: ");
    result.append(arrivalTime);
    result.append(", duration: ");
    result.append(duration);
    result.append(", id: ");
    result.append(id);
    result.append(')');
    return result.toString();
  }

} //WorkItemImpl
