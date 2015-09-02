/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel.impl;

import datasem.xtext.kanban.domainmodel.kanbanmodel.ClassOfService;
import datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy;
import datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import datasem.xtext.kanban.domainmodel.kanbanmodel.Service;
import datasem.xtext.kanban.domainmodel.kanbanmodel.UserLibraries;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemType;

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
 * An implementation of the model object '<em><b>User Libraries</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.UserLibrariesImpl#getWorkItemTypes <em>Work Item Types</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.UserLibrariesImpl#getClassOfServices <em>Class Of Services</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.UserLibrariesImpl#getServices <em>Services</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.UserLibrariesImpl#getGovernanceStrategies <em>Governance Strategies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserLibrariesImpl extends MinimalEObjectImpl.Container implements UserLibraries
{
  /**
   * The cached value of the '{@link #getWorkItemTypes() <em>Work Item Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWorkItemTypes()
   * @generated
   * @ordered
   */
  protected EList<WorkItemType> workItemTypes;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UserLibrariesImpl()
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
    return KanbanmodelPackage.Literals.USER_LIBRARIES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WorkItemType> getWorkItemTypes()
  {
    if (workItemTypes == null)
    {
      workItemTypes = new EObjectContainmentEList<WorkItemType>(WorkItemType.class, this, KanbanmodelPackage.USER_LIBRARIES__WORK_ITEM_TYPES);
    }
    return workItemTypes;
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
      classOfServices = new EObjectContainmentEList<ClassOfService>(ClassOfService.class, this, KanbanmodelPackage.USER_LIBRARIES__CLASS_OF_SERVICES);
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
      services = new EObjectContainmentEList<Service>(Service.class, this, KanbanmodelPackage.USER_LIBRARIES__SERVICES);
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
      governanceStrategies = new EObjectContainmentEList<GovernanceStrategy>(GovernanceStrategy.class, this, KanbanmodelPackage.USER_LIBRARIES__GOVERNANCE_STRATEGIES);
    }
    return governanceStrategies;
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
      case KanbanmodelPackage.USER_LIBRARIES__WORK_ITEM_TYPES:
        return ((InternalEList<?>)getWorkItemTypes()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.USER_LIBRARIES__CLASS_OF_SERVICES:
        return ((InternalEList<?>)getClassOfServices()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.USER_LIBRARIES__SERVICES:
        return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.USER_LIBRARIES__GOVERNANCE_STRATEGIES:
        return ((InternalEList<?>)getGovernanceStrategies()).basicRemove(otherEnd, msgs);
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
      case KanbanmodelPackage.USER_LIBRARIES__WORK_ITEM_TYPES:
        return getWorkItemTypes();
      case KanbanmodelPackage.USER_LIBRARIES__CLASS_OF_SERVICES:
        return getClassOfServices();
      case KanbanmodelPackage.USER_LIBRARIES__SERVICES:
        return getServices();
      case KanbanmodelPackage.USER_LIBRARIES__GOVERNANCE_STRATEGIES:
        return getGovernanceStrategies();
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
      case KanbanmodelPackage.USER_LIBRARIES__WORK_ITEM_TYPES:
        getWorkItemTypes().clear();
        getWorkItemTypes().addAll((Collection<? extends WorkItemType>)newValue);
        return;
      case KanbanmodelPackage.USER_LIBRARIES__CLASS_OF_SERVICES:
        getClassOfServices().clear();
        getClassOfServices().addAll((Collection<? extends ClassOfService>)newValue);
        return;
      case KanbanmodelPackage.USER_LIBRARIES__SERVICES:
        getServices().clear();
        getServices().addAll((Collection<? extends Service>)newValue);
        return;
      case KanbanmodelPackage.USER_LIBRARIES__GOVERNANCE_STRATEGIES:
        getGovernanceStrategies().clear();
        getGovernanceStrategies().addAll((Collection<? extends GovernanceStrategy>)newValue);
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
      case KanbanmodelPackage.USER_LIBRARIES__WORK_ITEM_TYPES:
        getWorkItemTypes().clear();
        return;
      case KanbanmodelPackage.USER_LIBRARIES__CLASS_OF_SERVICES:
        getClassOfServices().clear();
        return;
      case KanbanmodelPackage.USER_LIBRARIES__SERVICES:
        getServices().clear();
        return;
      case KanbanmodelPackage.USER_LIBRARIES__GOVERNANCE_STRATEGIES:
        getGovernanceStrategies().clear();
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
      case KanbanmodelPackage.USER_LIBRARIES__WORK_ITEM_TYPES:
        return workItemTypes != null && !workItemTypes.isEmpty();
      case KanbanmodelPackage.USER_LIBRARIES__CLASS_OF_SERVICES:
        return classOfServices != null && !classOfServices.isEmpty();
      case KanbanmodelPackage.USER_LIBRARIES__SERVICES:
        return services != null && !services.isEmpty();
      case KanbanmodelPackage.USER_LIBRARIES__GOVERNANCE_STRATEGIES:
        return governanceStrategies != null && !governanceStrategies.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //UserLibrariesImpl
