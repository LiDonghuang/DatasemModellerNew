/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel.impl;

import datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy;
import datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import datasem.xtext.kanban.domainmodel.kanbanmodel.Mechanism;
import datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceAllocation;
import datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceOutsourcing;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptance;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WIAssignment;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WISelection;

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
 * An implementation of the model object '<em><b>Governance Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.GovernanceStrategyImpl#getId <em>Id</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.GovernanceStrategyImpl#getName <em>Name</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.GovernanceStrategyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.GovernanceStrategyImpl#getWIAcceptanceRule <em>WI Acceptance Rule</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.GovernanceStrategyImpl#getWISelectionRule <em>WI Selection Rule</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.GovernanceStrategyImpl#getWIAssignmentRule <em>WI Assignment Rule</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.GovernanceStrategyImpl#getResourceAllocationRule <em>Resource Allocation Rule</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.GovernanceStrategyImpl#getResourceOutsourcingRule <em>Resource Outsourcing Rule</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.GovernanceStrategyImpl#getMechanisms <em>Mechanisms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GovernanceStrategyImpl extends MinimalEObjectImpl.Container implements GovernanceStrategy
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
   * The cached value of the '{@link #getWIAcceptanceRule() <em>WI Acceptance Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWIAcceptanceRule()
   * @generated
   * @ordered
   */
  protected WIAcceptance wiAcceptanceRule;

  /**
   * The cached value of the '{@link #getWISelectionRule() <em>WI Selection Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWISelectionRule()
   * @generated
   * @ordered
   */
  protected WISelection wiSelectionRule;

  /**
   * The cached value of the '{@link #getWIAssignmentRule() <em>WI Assignment Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWIAssignmentRule()
   * @generated
   * @ordered
   */
  protected WIAssignment wiAssignmentRule;

  /**
   * The cached value of the '{@link #getResourceAllocationRule() <em>Resource Allocation Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResourceAllocationRule()
   * @generated
   * @ordered
   */
  protected ResourceAllocation resourceAllocationRule;

  /**
   * The cached value of the '{@link #getResourceOutsourcingRule() <em>Resource Outsourcing Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResourceOutsourcingRule()
   * @generated
   * @ordered
   */
  protected ResourceOutsourcing resourceOutsourcingRule;

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
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.GOVERNANCE_STRATEGY__ID, oldId, id));
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
  public WIAcceptance getWIAcceptanceRule()
  {
    return wiAcceptanceRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWIAcceptanceRule(WIAcceptance newWIAcceptanceRule, NotificationChain msgs)
  {
    WIAcceptance oldWIAcceptanceRule = wiAcceptanceRule;
    wiAcceptanceRule = newWIAcceptanceRule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.GOVERNANCE_STRATEGY__WI_ACCEPTANCE_RULE, oldWIAcceptanceRule, newWIAcceptanceRule);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWIAcceptanceRule(WIAcceptance newWIAcceptanceRule)
  {
    if (newWIAcceptanceRule != wiAcceptanceRule)
    {
      NotificationChain msgs = null;
      if (wiAcceptanceRule != null)
        msgs = ((InternalEObject)wiAcceptanceRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.GOVERNANCE_STRATEGY__WI_ACCEPTANCE_RULE, null, msgs);
      if (newWIAcceptanceRule != null)
        msgs = ((InternalEObject)newWIAcceptanceRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.GOVERNANCE_STRATEGY__WI_ACCEPTANCE_RULE, null, msgs);
      msgs = basicSetWIAcceptanceRule(newWIAcceptanceRule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.GOVERNANCE_STRATEGY__WI_ACCEPTANCE_RULE, newWIAcceptanceRule, newWIAcceptanceRule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WISelection getWISelectionRule()
  {
    return wiSelectionRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWISelectionRule(WISelection newWISelectionRule, NotificationChain msgs)
  {
    WISelection oldWISelectionRule = wiSelectionRule;
    wiSelectionRule = newWISelectionRule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.GOVERNANCE_STRATEGY__WI_SELECTION_RULE, oldWISelectionRule, newWISelectionRule);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWISelectionRule(WISelection newWISelectionRule)
  {
    if (newWISelectionRule != wiSelectionRule)
    {
      NotificationChain msgs = null;
      if (wiSelectionRule != null)
        msgs = ((InternalEObject)wiSelectionRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.GOVERNANCE_STRATEGY__WI_SELECTION_RULE, null, msgs);
      if (newWISelectionRule != null)
        msgs = ((InternalEObject)newWISelectionRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.GOVERNANCE_STRATEGY__WI_SELECTION_RULE, null, msgs);
      msgs = basicSetWISelectionRule(newWISelectionRule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.GOVERNANCE_STRATEGY__WI_SELECTION_RULE, newWISelectionRule, newWISelectionRule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WIAssignment getWIAssignmentRule()
  {
    return wiAssignmentRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWIAssignmentRule(WIAssignment newWIAssignmentRule, NotificationChain msgs)
  {
    WIAssignment oldWIAssignmentRule = wiAssignmentRule;
    wiAssignmentRule = newWIAssignmentRule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.GOVERNANCE_STRATEGY__WI_ASSIGNMENT_RULE, oldWIAssignmentRule, newWIAssignmentRule);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWIAssignmentRule(WIAssignment newWIAssignmentRule)
  {
    if (newWIAssignmentRule != wiAssignmentRule)
    {
      NotificationChain msgs = null;
      if (wiAssignmentRule != null)
        msgs = ((InternalEObject)wiAssignmentRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.GOVERNANCE_STRATEGY__WI_ASSIGNMENT_RULE, null, msgs);
      if (newWIAssignmentRule != null)
        msgs = ((InternalEObject)newWIAssignmentRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.GOVERNANCE_STRATEGY__WI_ASSIGNMENT_RULE, null, msgs);
      msgs = basicSetWIAssignmentRule(newWIAssignmentRule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.GOVERNANCE_STRATEGY__WI_ASSIGNMENT_RULE, newWIAssignmentRule, newWIAssignmentRule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceAllocation getResourceAllocationRule()
  {
    return resourceAllocationRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetResourceAllocationRule(ResourceAllocation newResourceAllocationRule, NotificationChain msgs)
  {
    ResourceAllocation oldResourceAllocationRule = resourceAllocationRule;
    resourceAllocationRule = newResourceAllocationRule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.GOVERNANCE_STRATEGY__RESOURCE_ALLOCATION_RULE, oldResourceAllocationRule, newResourceAllocationRule);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResourceAllocationRule(ResourceAllocation newResourceAllocationRule)
  {
    if (newResourceAllocationRule != resourceAllocationRule)
    {
      NotificationChain msgs = null;
      if (resourceAllocationRule != null)
        msgs = ((InternalEObject)resourceAllocationRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.GOVERNANCE_STRATEGY__RESOURCE_ALLOCATION_RULE, null, msgs);
      if (newResourceAllocationRule != null)
        msgs = ((InternalEObject)newResourceAllocationRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.GOVERNANCE_STRATEGY__RESOURCE_ALLOCATION_RULE, null, msgs);
      msgs = basicSetResourceAllocationRule(newResourceAllocationRule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.GOVERNANCE_STRATEGY__RESOURCE_ALLOCATION_RULE, newResourceAllocationRule, newResourceAllocationRule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceOutsourcing getResourceOutsourcingRule()
  {
    return resourceOutsourcingRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetResourceOutsourcingRule(ResourceOutsourcing newResourceOutsourcingRule, NotificationChain msgs)
  {
    ResourceOutsourcing oldResourceOutsourcingRule = resourceOutsourcingRule;
    resourceOutsourcingRule = newResourceOutsourcingRule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.GOVERNANCE_STRATEGY__RESOURCE_OUTSOURCING_RULE, oldResourceOutsourcingRule, newResourceOutsourcingRule);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResourceOutsourcingRule(ResourceOutsourcing newResourceOutsourcingRule)
  {
    if (newResourceOutsourcingRule != resourceOutsourcingRule)
    {
      NotificationChain msgs = null;
      if (resourceOutsourcingRule != null)
        msgs = ((InternalEObject)resourceOutsourcingRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.GOVERNANCE_STRATEGY__RESOURCE_OUTSOURCING_RULE, null, msgs);
      if (newResourceOutsourcingRule != null)
        msgs = ((InternalEObject)newResourceOutsourcingRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.GOVERNANCE_STRATEGY__RESOURCE_OUTSOURCING_RULE, null, msgs);
      msgs = basicSetResourceOutsourcingRule(newResourceOutsourcingRule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.GOVERNANCE_STRATEGY__RESOURCE_OUTSOURCING_RULE, newResourceOutsourcingRule, newResourceOutsourcingRule));
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
      mechanisms = new EObjectContainmentEList<Mechanism>(Mechanism.class, this, KanbanmodelPackage.GOVERNANCE_STRATEGY__MECHANISMS);
    }
    return mechanisms;
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
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__WI_ACCEPTANCE_RULE:
        return basicSetWIAcceptanceRule(null, msgs);
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__WI_SELECTION_RULE:
        return basicSetWISelectionRule(null, msgs);
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__WI_ASSIGNMENT_RULE:
        return basicSetWIAssignmentRule(null, msgs);
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__RESOURCE_ALLOCATION_RULE:
        return basicSetResourceAllocationRule(null, msgs);
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__RESOURCE_OUTSOURCING_RULE:
        return basicSetResourceOutsourcingRule(null, msgs);
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__MECHANISMS:
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
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__ID:
        return getId();
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__NAME:
        return getName();
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__DESCRIPTION:
        return getDescription();
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__WI_ACCEPTANCE_RULE:
        return getWIAcceptanceRule();
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__WI_SELECTION_RULE:
        return getWISelectionRule();
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__WI_ASSIGNMENT_RULE:
        return getWIAssignmentRule();
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__RESOURCE_ALLOCATION_RULE:
        return getResourceAllocationRule();
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__RESOURCE_OUTSOURCING_RULE:
        return getResourceOutsourcingRule();
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__MECHANISMS:
        return getMechanisms();
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
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__ID:
        setId((Integer)newValue);
        return;
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__NAME:
        setName((String)newValue);
        return;
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__WI_ACCEPTANCE_RULE:
        setWIAcceptanceRule((WIAcceptance)newValue);
        return;
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__WI_SELECTION_RULE:
        setWISelectionRule((WISelection)newValue);
        return;
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__WI_ASSIGNMENT_RULE:
        setWIAssignmentRule((WIAssignment)newValue);
        return;
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__RESOURCE_ALLOCATION_RULE:
        setResourceAllocationRule((ResourceAllocation)newValue);
        return;
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__RESOURCE_OUTSOURCING_RULE:
        setResourceOutsourcingRule((ResourceOutsourcing)newValue);
        return;
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__MECHANISMS:
        getMechanisms().clear();
        getMechanisms().addAll((Collection<? extends Mechanism>)newValue);
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
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__ID:
        setId(ID_EDEFAULT);
        return;
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__WI_ACCEPTANCE_RULE:
        setWIAcceptanceRule((WIAcceptance)null);
        return;
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__WI_SELECTION_RULE:
        setWISelectionRule((WISelection)null);
        return;
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__WI_ASSIGNMENT_RULE:
        setWIAssignmentRule((WIAssignment)null);
        return;
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__RESOURCE_ALLOCATION_RULE:
        setResourceAllocationRule((ResourceAllocation)null);
        return;
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__RESOURCE_OUTSOURCING_RULE:
        setResourceOutsourcingRule((ResourceOutsourcing)null);
        return;
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__MECHANISMS:
        getMechanisms().clear();
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
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__ID:
        return id != ID_EDEFAULT;
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__WI_ACCEPTANCE_RULE:
        return wiAcceptanceRule != null;
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__WI_SELECTION_RULE:
        return wiSelectionRule != null;
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__WI_ASSIGNMENT_RULE:
        return wiAssignmentRule != null;
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__RESOURCE_ALLOCATION_RULE:
        return resourceAllocationRule != null;
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__RESOURCE_OUTSOURCING_RULE:
        return resourceOutsourcingRule != null;
      case KanbanmodelPackage.GOVERNANCE_STRATEGY__MECHANISMS:
        return mechanisms != null && !mechanisms.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //GovernanceStrategyImpl
