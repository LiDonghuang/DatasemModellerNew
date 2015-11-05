/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel.impl;

import datasem.xtext.kanban.domainmodel.kanbanmodel.ContractNetProtocol;
import datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy;
import datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import datasem.xtext.kanban.domainmodel.kanbanmodel.ProcessModel;
import datasem.xtext.kanban.domainmodel.kanbanmodel.PullStrategy;
import datasem.xtext.kanban.domainmodel.kanbanmodel.PushStrategy;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Governance Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.GovernanceStrategyImpl#getName <em>Name</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.GovernanceStrategyImpl#isPull <em>Pull</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.GovernanceStrategyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.GovernanceStrategyImpl#getPullStrategy <em>Pull Strategy</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.GovernanceStrategyImpl#isPush <em>Push</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.GovernanceStrategyImpl#getPushStrategy <em>Push Strategy</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.GovernanceStrategyImpl#isCnp <em>Cnp</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.GovernanceStrategyImpl#getContractNetProtocal <em>Contract Net Protocal</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.GovernanceStrategyImpl#getProcesses <em>Processes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GovernanceStrategyImpl extends MinimalEObjectImpl.Container implements GovernanceStrategy
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
   * The default value of the '{@link #isPull() <em>Pull</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPull()
   * @generated
   * @ordered
   */
  protected static final boolean PULL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPull() <em>Pull</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPull()
   * @generated
   * @ordered
   */
  protected boolean pull = PULL_EDEFAULT;

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
   * The cached value of the '{@link #getPullStrategy() <em>Pull Strategy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPullStrategy()
   * @generated
   * @ordered
   */
  protected PullStrategy pullStrategy;

  /**
   * The default value of the '{@link #isPush() <em>Push</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPush()
   * @generated
   * @ordered
   */
  protected static final boolean PUSH_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPush() <em>Push</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPush()
   * @generated
   * @ordered
   */
  protected boolean push = PUSH_EDEFAULT;

  /**
   * The cached value of the '{@link #getPushStrategy() <em>Push Strategy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPushStrategy()
   * @generated
   * @ordered
   */
  protected PushStrategy pushStrategy;

  /**
   * The default value of the '{@link #isCnp() <em>Cnp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCnp()
   * @generated
   * @ordered
   */
  protected static final boolean CNP_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCnp() <em>Cnp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCnp()
   * @generated
   * @ordered
   */
  protected boolean cnp = CNP_EDEFAULT;

  /**
   * The cached value of the '{@link #getContractNetProtocal() <em>Contract Net Protocal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContractNetProtocal()
   * @generated
   * @ordered
   */
  protected ContractNetProtocol contractNetProtocal;

  /**
   * The cached value of the '{@link #getProcesses() <em>Processes</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcesses()
   * @generated
   * @ordered
   */
  protected EList<ProcessModel> processes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GovernanceStrategyImpl()
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
    return KanbanmodelPackage.Literals.GOVERNANCE_STRATEGY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.GOVERNANCE_STRATEGY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPull()
  {
    return pull;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPull(boolean newPull)
  {
    boolean oldPull = pull;
    pull = newPull;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.GOVERNANCE_STRATEGY__PULL, oldPull, pull));
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
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.GOVERNANCE_STRATEGY__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PullStrategy getPullStrategy()
  {
    return pullStrategy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPullStrategy(PullStrategy newPullStrategy, NotificationChain msgs)
  {
    PullStrategy oldPullStrategy = pullStrategy;
    pullStrategy = newPullStrategy;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.GOVERNANCE_STRATEGY__PULL_STRATEGY, oldPullStrategy, newPullStrategy);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPullStrategy(PullStrategy newPullStrategy)
  {
    if (newPullStrategy != pullStrategy)
    {
      NotificationChain msgs = null;
      if (pullStrategy != null)
        msgs = ((InternalEObject)pullStrategy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.GOVERNANCE_STRATEGY__PULL_STRATEGY, null, msgs);
      if (newPullStrategy != null)
        msgs = ((InternalEObject)newPullStrategy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.GOVERNANCE_STRATEGY__PULL_STRATEGY, null, msgs);
      msgs = basicSetPullStrategy(newPullStrategy, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.GOVERNANCE_STRATEGY__PULL_STRATEGY, newPullStrategy, newPullStrategy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPush()
  {
    return push;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPush(boolean newPush)
  {
    boolean oldPush = push;
    push = newPush;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.GOVERNANCE_STRATEGY__PUSH, oldPush, push));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PushStrategy getPushStrategy()
  {
    return pushStrategy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPushStrategy(PushStrategy newPushStrategy, NotificationChain msgs)
  {
    PushStrategy oldPushStrategy = pushStrategy;
    pushStrategy = newPushStrategy;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.GOVERNANCE_STRATEGY__PUSH_STRATEGY, oldPushStrategy, newPushStrategy);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPushStrategy(PushStrategy newPushStrategy)
  {
    if (newPushStrategy != pushStrategy)
    {
      NotificationChain msgs = null;
      if (pushStrategy != null)
        msgs = ((InternalEObject)pushStrategy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.GOVERNANCE_STRATEGY__PUSH_STRATEGY, null, msgs);
      if (newPushStrategy != null)
        msgs = ((InternalEObject)newPushStrategy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.GOVERNANCE_STRATEGY__PUSH_STRATEGY, null, msgs);
      msgs = basicSetPushStrategy(newPushStrategy, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.GOVERNANCE_STRATEGY__PUSH_STRATEGY, newPushStrategy, newPushStrategy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isCnp()
  {
    return cnp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCnp(boolean newCnp)
  {
    boolean oldCnp = cnp;
    cnp = newCnp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.GOVERNANCE_STRATEGY__CNP, oldCnp, cnp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContractNetProtocol getContractNetProtocal()
  {
    return contractNetProtocal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContractNetProtocal(ContractNetProtocol newContractNetProtocal, NotificationChain msgs)
  {
    ContractNetProtocol oldContractNetProtocal = contractNetProtocal;
    contractNetProtocal = newContractNetProtocal;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.GOVERNANCE_STRATEGY__CONTRACT_NET_PROTOCAL, oldContractNetProtocal, newContractNetProtocal);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContractNetProtocal(ContractNetProtocol newContractNetProtocal)
  {
    if (newContractNetProtocal != contractNetProtocal)
    {
      NotificationChain msgs = null;
      if (contractNetProtocal != null)
        msgs = ((InternalEObject)contractNetProtocal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.GOVERNANCE_STRATEGY__CONTRACT_NET_PROTOCAL, null, msgs);
      if (newContractNetProtocal != null)
        msgs = ((InternalEObject)newContractNetProtocal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.GOVERNANCE_STRATEGY__CONTRACT_NET_PROTOCAL, null, msgs);
      msgs = basicSetContractNetProtocal(newContractNetProtocal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.GOVERNANCE_STRATEGY__CONTRACT_NET_PROTOCAL, newContractNetProtocal, newContractNetProtocal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProcessModel> getProcesses()
  {
    if (processes == null)
    {
      processes = new EObjectResolvingEList<ProcessModel>(ProcessModel.class, this, KanbanmodelPackage.GOVERNANCE_STRATEGY__PROCESSES);
    }
    return processes;
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
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__PULL_STRATEGY:
        return basicSetPullStrategy(null, msgs);
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__PUSH_STRATEGY:
        return basicSetPushStrategy(null, msgs);
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__CONTRACT_NET_PROTOCAL:
        return basicSetContractNetProtocal(null, msgs);
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
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__NAME:
        return getName();
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__PULL:
        return isPull();
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__DESCRIPTION:
        return getDescription();
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__PULL_STRATEGY:
        return getPullStrategy();
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__PUSH:
        return isPush();
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__PUSH_STRATEGY:
        return getPushStrategy();
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__CNP:
        return isCnp();
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__CONTRACT_NET_PROTOCAL:
        return getContractNetProtocal();
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__PROCESSES:
        return getProcesses();
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
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__NAME:
        setName((String)newValue);
        return;
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__PULL:
        setPull((Boolean)newValue);
        return;
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__PULL_STRATEGY:
        setPullStrategy((PullStrategy)newValue);
        return;
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__PUSH:
        setPush((Boolean)newValue);
        return;
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__PUSH_STRATEGY:
        setPushStrategy((PushStrategy)newValue);
        return;
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__CNP:
        setCnp((Boolean)newValue);
        return;
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__CONTRACT_NET_PROTOCAL:
        setContractNetProtocal((ContractNetProtocol)newValue);
        return;
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__PROCESSES:
        getProcesses().clear();
        getProcesses().addAll((Collection<? extends ProcessModel>)newValue);
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
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__PULL:
        setPull(PULL_EDEFAULT);
        return;
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__PULL_STRATEGY:
        setPullStrategy((PullStrategy)null);
        return;
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__PUSH:
        setPush(PUSH_EDEFAULT);
        return;
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__PUSH_STRATEGY:
        setPushStrategy((PushStrategy)null);
        return;
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__CNP:
        setCnp(CNP_EDEFAULT);
        return;
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__CONTRACT_NET_PROTOCAL:
        setContractNetProtocal((ContractNetProtocol)null);
        return;
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__PROCESSES:
        getProcesses().clear();
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
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__PULL:
        return pull != PULL_EDEFAULT;
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__PULL_STRATEGY:
        return pullStrategy != null;
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__PUSH:
        return push != PUSH_EDEFAULT;
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__PUSH_STRATEGY:
        return pushStrategy != null;
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__CNP:
        return cnp != CNP_EDEFAULT;
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__CONTRACT_NET_PROTOCAL:
        return contractNetProtocal != null;
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__PROCESSES:
        return processes != null && !processes.isEmpty();
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
    result.append(", pull: ");
    result.append(pull);
    result.append(", description: ");
    result.append(description);
    result.append(", push: ");
    result.append(push);
    result.append(", cnp: ");
    result.append(cnp);
    result.append(')');
    return result.toString();
  }

} //GovernanceStrategyImpl
