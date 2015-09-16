/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel.impl;

import datasem.xtext.kanban.domainmodel.kanbanmodel.ConditionType;
import datasem.xtext.kanban.domainmodel.kanbanmodel.EventType;
import datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import datasem.xtext.kanban.domainmodel.kanbanmodel.ProcessModel;
import datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceAllocationRuleType;
import datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceOutsourcingRuleType;
import datasem.xtext.kanban.domainmodel.kanbanmodel.SystemLibraries;
import datasem.xtext.kanban.domainmodel.kanbanmodel.TransitionType;
import datasem.xtext.kanban.domainmodel.kanbanmodel.ValueFunction;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptanceRuleType;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WIAssignmentRuleType;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WISelectionRuleType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Libraries</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.SystemLibrariesImpl#getEventTypes <em>Event Types</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.SystemLibrariesImpl#getConditionTypes <em>Condition Types</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.SystemLibrariesImpl#getTransitionTypes <em>Transition Types</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.SystemLibrariesImpl#getWIAcceptanceRuleTypes <em>WI Acceptance Rule Types</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.SystemLibrariesImpl#getWISelectionRuleTypes <em>WI Selection Rule Types</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.SystemLibrariesImpl#getWIAssignmentRuleTypes <em>WI Assignment Rule Types</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.SystemLibrariesImpl#getResourceAllocationRuleTypes <em>Resource Allocation Rule Types</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.SystemLibrariesImpl#getResourceOutsourcingRuleTypes <em>Resource Outsourcing Rule Types</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.SystemLibrariesImpl#getProcessModels <em>Process Models</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.SystemLibrariesImpl#getValueFunctions <em>Value Functions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemLibrariesImpl extends MinimalEObjectImpl.Container implements SystemLibraries
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
   * The cached value of the '{@link #getTransitionTypes() <em>Transition Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransitionTypes()
   * @generated
   * @ordered
   */
  protected EList<TransitionType> transitionTypes;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SystemLibrariesImpl()
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
    return KanbanmodelPackage.Literals.SYSTEM_LIBRARIES;
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
      eventTypes = new EObjectContainmentEList<EventType>(EventType.class, this, KanbanmodelPackage.SYSTEM_LIBRARIES__EVENT_TYPES);
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
      conditionTypes = new EObjectContainmentEList<ConditionType>(ConditionType.class, this, KanbanmodelPackage.SYSTEM_LIBRARIES__CONDITION_TYPES);
    }
    return conditionTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TransitionType> getTransitionTypes()
  {
    if (transitionTypes == null)
    {
      transitionTypes = new EObjectContainmentEList<TransitionType>(TransitionType.class, this, KanbanmodelPackage.SYSTEM_LIBRARIES__TRANSITION_TYPES);
    }
    return transitionTypes;
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
      wiAcceptanceRuleTypes = new EObjectContainmentEList<WIAcceptanceRuleType>(WIAcceptanceRuleType.class, this, KanbanmodelPackage.SYSTEM_LIBRARIES__WI_ACCEPTANCE_RULE_TYPES);
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
      wiSelectionRuleTypes = new EObjectContainmentEList<WISelectionRuleType>(WISelectionRuleType.class, this, KanbanmodelPackage.SYSTEM_LIBRARIES__WI_SELECTION_RULE_TYPES);
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
      wiAssignmentRuleTypes = new EObjectContainmentEList<WIAssignmentRuleType>(WIAssignmentRuleType.class, this, KanbanmodelPackage.SYSTEM_LIBRARIES__WI_ASSIGNMENT_RULE_TYPES);
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
      resourceAllocationRuleTypes = new EObjectContainmentEList<ResourceAllocationRuleType>(ResourceAllocationRuleType.class, this, KanbanmodelPackage.SYSTEM_LIBRARIES__RESOURCE_ALLOCATION_RULE_TYPES);
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
      resourceOutsourcingRuleTypes = new EObjectContainmentEList<ResourceOutsourcingRuleType>(ResourceOutsourcingRuleType.class, this, KanbanmodelPackage.SYSTEM_LIBRARIES__RESOURCE_OUTSOURCING_RULE_TYPES);
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
      processModels = new EObjectContainmentEList<ProcessModel>(ProcessModel.class, this, KanbanmodelPackage.SYSTEM_LIBRARIES__PROCESS_MODELS);
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
      valueFunctions = new EObjectContainmentEList<ValueFunction>(ValueFunction.class, this, KanbanmodelPackage.SYSTEM_LIBRARIES__VALUE_FUNCTIONS);
    }
    return valueFunctions;
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
      case KanbanmodelPackage.SYSTEM_LIBRARIES__EVENT_TYPES:
        return ((InternalEList<?>)getEventTypes()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.SYSTEM_LIBRARIES__CONDITION_TYPES:
        return ((InternalEList<?>)getConditionTypes()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.SYSTEM_LIBRARIES__TRANSITION_TYPES:
        return ((InternalEList<?>)getTransitionTypes()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.SYSTEM_LIBRARIES__WI_ACCEPTANCE_RULE_TYPES:
        return ((InternalEList<?>)getWIAcceptanceRuleTypes()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.SYSTEM_LIBRARIES__WI_SELECTION_RULE_TYPES:
        return ((InternalEList<?>)getWISelectionRuleTypes()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.SYSTEM_LIBRARIES__WI_ASSIGNMENT_RULE_TYPES:
        return ((InternalEList<?>)getWIAssignmentRuleTypes()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.SYSTEM_LIBRARIES__RESOURCE_ALLOCATION_RULE_TYPES:
        return ((InternalEList<?>)getResourceAllocationRuleTypes()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.SYSTEM_LIBRARIES__RESOURCE_OUTSOURCING_RULE_TYPES:
        return ((InternalEList<?>)getResourceOutsourcingRuleTypes()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.SYSTEM_LIBRARIES__PROCESS_MODELS:
        return ((InternalEList<?>)getProcessModels()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.SYSTEM_LIBRARIES__VALUE_FUNCTIONS:
        return ((InternalEList<?>)getValueFunctions()).basicRemove(otherEnd, msgs);
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
      case KanbanmodelPackage.SYSTEM_LIBRARIES__EVENT_TYPES:
        return getEventTypes();
      case KanbanmodelPackage.SYSTEM_LIBRARIES__CONDITION_TYPES:
        return getConditionTypes();
      case KanbanmodelPackage.SYSTEM_LIBRARIES__TRANSITION_TYPES:
        return getTransitionTypes();
      case KanbanmodelPackage.SYSTEM_LIBRARIES__WI_ACCEPTANCE_RULE_TYPES:
        return getWIAcceptanceRuleTypes();
      case KanbanmodelPackage.SYSTEM_LIBRARIES__WI_SELECTION_RULE_TYPES:
        return getWISelectionRuleTypes();
      case KanbanmodelPackage.SYSTEM_LIBRARIES__WI_ASSIGNMENT_RULE_TYPES:
        return getWIAssignmentRuleTypes();
      case KanbanmodelPackage.SYSTEM_LIBRARIES__RESOURCE_ALLOCATION_RULE_TYPES:
        return getResourceAllocationRuleTypes();
      case KanbanmodelPackage.SYSTEM_LIBRARIES__RESOURCE_OUTSOURCING_RULE_TYPES:
        return getResourceOutsourcingRuleTypes();
      case KanbanmodelPackage.SYSTEM_LIBRARIES__PROCESS_MODELS:
        return getProcessModels();
      case KanbanmodelPackage.SYSTEM_LIBRARIES__VALUE_FUNCTIONS:
        return getValueFunctions();
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
      case KanbanmodelPackage.SYSTEM_LIBRARIES__EVENT_TYPES:
        getEventTypes().clear();
        getEventTypes().addAll((Collection<? extends EventType>)newValue);
        return;
      case KanbanmodelPackage.SYSTEM_LIBRARIES__CONDITION_TYPES:
        getConditionTypes().clear();
        getConditionTypes().addAll((Collection<? extends ConditionType>)newValue);
        return;
      case KanbanmodelPackage.SYSTEM_LIBRARIES__TRANSITION_TYPES:
        getTransitionTypes().clear();
        getTransitionTypes().addAll((Collection<? extends TransitionType>)newValue);
        return;
      case KanbanmodelPackage.SYSTEM_LIBRARIES__WI_ACCEPTANCE_RULE_TYPES:
        getWIAcceptanceRuleTypes().clear();
        getWIAcceptanceRuleTypes().addAll((Collection<? extends WIAcceptanceRuleType>)newValue);
        return;
      case KanbanmodelPackage.SYSTEM_LIBRARIES__WI_SELECTION_RULE_TYPES:
        getWISelectionRuleTypes().clear();
        getWISelectionRuleTypes().addAll((Collection<? extends WISelectionRuleType>)newValue);
        return;
      case KanbanmodelPackage.SYSTEM_LIBRARIES__WI_ASSIGNMENT_RULE_TYPES:
        getWIAssignmentRuleTypes().clear();
        getWIAssignmentRuleTypes().addAll((Collection<? extends WIAssignmentRuleType>)newValue);
        return;
      case KanbanmodelPackage.SYSTEM_LIBRARIES__RESOURCE_ALLOCATION_RULE_TYPES:
        getResourceAllocationRuleTypes().clear();
        getResourceAllocationRuleTypes().addAll((Collection<? extends ResourceAllocationRuleType>)newValue);
        return;
      case KanbanmodelPackage.SYSTEM_LIBRARIES__RESOURCE_OUTSOURCING_RULE_TYPES:
        getResourceOutsourcingRuleTypes().clear();
        getResourceOutsourcingRuleTypes().addAll((Collection<? extends ResourceOutsourcingRuleType>)newValue);
        return;
      case KanbanmodelPackage.SYSTEM_LIBRARIES__PROCESS_MODELS:
        getProcessModels().clear();
        getProcessModels().addAll((Collection<? extends ProcessModel>)newValue);
        return;
      case KanbanmodelPackage.SYSTEM_LIBRARIES__VALUE_FUNCTIONS:
        getValueFunctions().clear();
        getValueFunctions().addAll((Collection<? extends ValueFunction>)newValue);
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
      case KanbanmodelPackage.SYSTEM_LIBRARIES__EVENT_TYPES:
        getEventTypes().clear();
        return;
      case KanbanmodelPackage.SYSTEM_LIBRARIES__CONDITION_TYPES:
        getConditionTypes().clear();
        return;
      case KanbanmodelPackage.SYSTEM_LIBRARIES__TRANSITION_TYPES:
        getTransitionTypes().clear();
        return;
      case KanbanmodelPackage.SYSTEM_LIBRARIES__WI_ACCEPTANCE_RULE_TYPES:
        getWIAcceptanceRuleTypes().clear();
        return;
      case KanbanmodelPackage.SYSTEM_LIBRARIES__WI_SELECTION_RULE_TYPES:
        getWISelectionRuleTypes().clear();
        return;
      case KanbanmodelPackage.SYSTEM_LIBRARIES__WI_ASSIGNMENT_RULE_TYPES:
        getWIAssignmentRuleTypes().clear();
        return;
      case KanbanmodelPackage.SYSTEM_LIBRARIES__RESOURCE_ALLOCATION_RULE_TYPES:
        getResourceAllocationRuleTypes().clear();
        return;
      case KanbanmodelPackage.SYSTEM_LIBRARIES__RESOURCE_OUTSOURCING_RULE_TYPES:
        getResourceOutsourcingRuleTypes().clear();
        return;
      case KanbanmodelPackage.SYSTEM_LIBRARIES__PROCESS_MODELS:
        getProcessModels().clear();
        return;
      case KanbanmodelPackage.SYSTEM_LIBRARIES__VALUE_FUNCTIONS:
        getValueFunctions().clear();
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
      case KanbanmodelPackage.SYSTEM_LIBRARIES__EVENT_TYPES:
        return eventTypes != null && !eventTypes.isEmpty();
      case KanbanmodelPackage.SYSTEM_LIBRARIES__CONDITION_TYPES:
        return conditionTypes != null && !conditionTypes.isEmpty();
      case KanbanmodelPackage.SYSTEM_LIBRARIES__TRANSITION_TYPES:
        return transitionTypes != null && !transitionTypes.isEmpty();
      case KanbanmodelPackage.SYSTEM_LIBRARIES__WI_ACCEPTANCE_RULE_TYPES:
        return wiAcceptanceRuleTypes != null && !wiAcceptanceRuleTypes.isEmpty();
      case KanbanmodelPackage.SYSTEM_LIBRARIES__WI_SELECTION_RULE_TYPES:
        return wiSelectionRuleTypes != null && !wiSelectionRuleTypes.isEmpty();
      case KanbanmodelPackage.SYSTEM_LIBRARIES__WI_ASSIGNMENT_RULE_TYPES:
        return wiAssignmentRuleTypes != null && !wiAssignmentRuleTypes.isEmpty();
      case KanbanmodelPackage.SYSTEM_LIBRARIES__RESOURCE_ALLOCATION_RULE_TYPES:
        return resourceAllocationRuleTypes != null && !resourceAllocationRuleTypes.isEmpty();
      case KanbanmodelPackage.SYSTEM_LIBRARIES__RESOURCE_OUTSOURCING_RULE_TYPES:
        return resourceOutsourcingRuleTypes != null && !resourceOutsourcingRuleTypes.isEmpty();
      case KanbanmodelPackage.SYSTEM_LIBRARIES__PROCESS_MODELS:
        return processModels != null && !processModels.isEmpty();
      case KanbanmodelPackage.SYSTEM_LIBRARIES__VALUE_FUNCTIONS:
        return valueFunctions != null && !valueFunctions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SystemLibrariesImpl
