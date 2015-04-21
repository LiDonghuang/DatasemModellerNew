/**
 */
package ausim.xtext.kanban.domainmodel.kanbanmodel.impl;

import ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import ausim.xtext.kanban.domainmodel.kanbanmodel.ResourceAllocation;
import ausim.xtext.kanban.domainmodel.kanbanmodel.ResourceOutsourcing;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Strategy;
import ausim.xtext.kanban.domainmodel.kanbanmodel.WIAcceptance;
import ausim.xtext.kanban.domainmodel.kanbanmodel.WIAssignment;
import ausim.xtext.kanban.domainmodel.kanbanmodel.WISelection;

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
 * An implementation of the model object '<em><b>Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.StrategyImpl#getName <em>Name</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.StrategyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.StrategyImpl#getWIAcceptance <em>WI Acceptance</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.StrategyImpl#getWISelection <em>WI Selection</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.StrategyImpl#getWIAssignment <em>WI Assignment</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.StrategyImpl#getResourceAllocation <em>Resource Allocation</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.StrategyImpl#getResourceOutsourcing <em>Resource Outsourcing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StrategyImpl extends MinimalEObjectImpl.Container implements Strategy
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
   * The cached value of the '{@link #getWIAcceptance() <em>WI Acceptance</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWIAcceptance()
   * @generated
   * @ordered
   */
  protected EList<WIAcceptance> wiAcceptance;

  /**
   * The cached value of the '{@link #getWISelection() <em>WI Selection</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWISelection()
   * @generated
   * @ordered
   */
  protected EList<WISelection> wiSelection;

  /**
   * The cached value of the '{@link #getWIAssignment() <em>WI Assignment</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWIAssignment()
   * @generated
   * @ordered
   */
  protected EList<WIAssignment> wiAssignment;

  /**
   * The cached value of the '{@link #getResourceAllocation() <em>Resource Allocation</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResourceAllocation()
   * @generated
   * @ordered
   */
  protected EList<ResourceAllocation> resourceAllocation;

  /**
   * The cached value of the '{@link #getResourceOutsourcing() <em>Resource Outsourcing</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResourceOutsourcing()
   * @generated
   * @ordered
   */
  protected EList<ResourceOutsourcing> resourceOutsourcing;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StrategyImpl()
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
    return KanbanmodelPackage.Literals.STRATEGY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.STRATEGY__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.STRATEGY__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WIAcceptance> getWIAcceptance()
  {
    if (wiAcceptance == null)
    {
      wiAcceptance = new EObjectContainmentEList<WIAcceptance>(WIAcceptance.class, this, KanbanmodelPackage.STRATEGY__WI_ACCEPTANCE);
    }
    return wiAcceptance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WISelection> getWISelection()
  {
    if (wiSelection == null)
    {
      wiSelection = new EObjectContainmentEList<WISelection>(WISelection.class, this, KanbanmodelPackage.STRATEGY__WI_SELECTION);
    }
    return wiSelection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WIAssignment> getWIAssignment()
  {
    if (wiAssignment == null)
    {
      wiAssignment = new EObjectContainmentEList<WIAssignment>(WIAssignment.class, this, KanbanmodelPackage.STRATEGY__WI_ASSIGNMENT);
    }
    return wiAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ResourceAllocation> getResourceAllocation()
  {
    if (resourceAllocation == null)
    {
      resourceAllocation = new EObjectContainmentEList<ResourceAllocation>(ResourceAllocation.class, this, KanbanmodelPackage.STRATEGY__RESOURCE_ALLOCATION);
    }
    return resourceAllocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ResourceOutsourcing> getResourceOutsourcing()
  {
    if (resourceOutsourcing == null)
    {
      resourceOutsourcing = new EObjectContainmentEList<ResourceOutsourcing>(ResourceOutsourcing.class, this, KanbanmodelPackage.STRATEGY__RESOURCE_OUTSOURCING);
    }
    return resourceOutsourcing;
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
      case KanbanmodelPackage.STRATEGY__WI_ACCEPTANCE:
        return ((InternalEList<?>)getWIAcceptance()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.STRATEGY__WI_SELECTION:
        return ((InternalEList<?>)getWISelection()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.STRATEGY__WI_ASSIGNMENT:
        return ((InternalEList<?>)getWIAssignment()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.STRATEGY__RESOURCE_ALLOCATION:
        return ((InternalEList<?>)getResourceAllocation()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.STRATEGY__RESOURCE_OUTSOURCING:
        return ((InternalEList<?>)getResourceOutsourcing()).basicRemove(otherEnd, msgs);
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
      case KanbanmodelPackage.STRATEGY__NAME:
        return getName();
      case KanbanmodelPackage.STRATEGY__DESCRIPTION:
        return getDescription();
      case KanbanmodelPackage.STRATEGY__WI_ACCEPTANCE:
        return getWIAcceptance();
      case KanbanmodelPackage.STRATEGY__WI_SELECTION:
        return getWISelection();
      case KanbanmodelPackage.STRATEGY__WI_ASSIGNMENT:
        return getWIAssignment();
      case KanbanmodelPackage.STRATEGY__RESOURCE_ALLOCATION:
        return getResourceAllocation();
      case KanbanmodelPackage.STRATEGY__RESOURCE_OUTSOURCING:
        return getResourceOutsourcing();
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
      case KanbanmodelPackage.STRATEGY__NAME:
        setName((String)newValue);
        return;
      case KanbanmodelPackage.STRATEGY__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case KanbanmodelPackage.STRATEGY__WI_ACCEPTANCE:
        getWIAcceptance().clear();
        getWIAcceptance().addAll((Collection<? extends WIAcceptance>)newValue);
        return;
      case KanbanmodelPackage.STRATEGY__WI_SELECTION:
        getWISelection().clear();
        getWISelection().addAll((Collection<? extends WISelection>)newValue);
        return;
      case KanbanmodelPackage.STRATEGY__WI_ASSIGNMENT:
        getWIAssignment().clear();
        getWIAssignment().addAll((Collection<? extends WIAssignment>)newValue);
        return;
      case KanbanmodelPackage.STRATEGY__RESOURCE_ALLOCATION:
        getResourceAllocation().clear();
        getResourceAllocation().addAll((Collection<? extends ResourceAllocation>)newValue);
        return;
      case KanbanmodelPackage.STRATEGY__RESOURCE_OUTSOURCING:
        getResourceOutsourcing().clear();
        getResourceOutsourcing().addAll((Collection<? extends ResourceOutsourcing>)newValue);
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
      case KanbanmodelPackage.STRATEGY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case KanbanmodelPackage.STRATEGY__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case KanbanmodelPackage.STRATEGY__WI_ACCEPTANCE:
        getWIAcceptance().clear();
        return;
      case KanbanmodelPackage.STRATEGY__WI_SELECTION:
        getWISelection().clear();
        return;
      case KanbanmodelPackage.STRATEGY__WI_ASSIGNMENT:
        getWIAssignment().clear();
        return;
      case KanbanmodelPackage.STRATEGY__RESOURCE_ALLOCATION:
        getResourceAllocation().clear();
        return;
      case KanbanmodelPackage.STRATEGY__RESOURCE_OUTSOURCING:
        getResourceOutsourcing().clear();
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
      case KanbanmodelPackage.STRATEGY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case KanbanmodelPackage.STRATEGY__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case KanbanmodelPackage.STRATEGY__WI_ACCEPTANCE:
        return wiAcceptance != null && !wiAcceptance.isEmpty();
      case KanbanmodelPackage.STRATEGY__WI_SELECTION:
        return wiSelection != null && !wiSelection.isEmpty();
      case KanbanmodelPackage.STRATEGY__WI_ASSIGNMENT:
        return wiAssignment != null && !wiAssignment.isEmpty();
      case KanbanmodelPackage.STRATEGY__RESOURCE_ALLOCATION:
        return resourceAllocation != null && !resourceAllocation.isEmpty();
      case KanbanmodelPackage.STRATEGY__RESOURCE_OUTSOURCING:
        return resourceOutsourcing != null && !resourceOutsourcing.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //StrategyImpl
