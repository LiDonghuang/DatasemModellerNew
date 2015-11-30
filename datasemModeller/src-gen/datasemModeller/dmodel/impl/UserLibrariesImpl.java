/**
 */
package datasemModeller.dmodel.impl;

import datasemModeller.dmodel.DmodelPackage;
import datasemModeller.dmodel.GovernanceStrategy;
import datasemModeller.dmodel.Service;
import datasemModeller.dmodel.ServiceProviderType;
import datasemModeller.dmodel.UserLibraries;
import datasemModeller.dmodel.WorkItemType;

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
 *   <li>{@link datasemModeller.dmodel.impl.UserLibrariesImpl#getServiceProviderTypes <em>Service Provider Types</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.UserLibrariesImpl#getWorkItemTypes <em>Work Item Types</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.UserLibrariesImpl#getServices <em>Services</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.UserLibrariesImpl#getGovernanceStrategies <em>Governance Strategies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserLibrariesImpl extends MinimalEObjectImpl.Container implements UserLibraries
{
  /**
   * The cached value of the '{@link #getServiceProviderTypes() <em>Service Provider Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceProviderTypes()
   * @generated
   * @ordered
   */
  protected EList<ServiceProviderType> serviceProviderTypes;

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
    return DmodelPackage.Literals.USER_LIBRARIES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ServiceProviderType> getServiceProviderTypes()
  {
    if (serviceProviderTypes == null)
    {
      serviceProviderTypes = new EObjectContainmentEList<ServiceProviderType>(ServiceProviderType.class, this, DmodelPackage.USER_LIBRARIES__SERVICE_PROVIDER_TYPES);
    }
    return serviceProviderTypes;
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
      workItemTypes = new EObjectContainmentEList<WorkItemType>(WorkItemType.class, this, DmodelPackage.USER_LIBRARIES__WORK_ITEM_TYPES);
    }
    return workItemTypes;
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
      services = new EObjectContainmentEList<Service>(Service.class, this, DmodelPackage.USER_LIBRARIES__SERVICES);
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
      governanceStrategies = new EObjectContainmentEList<GovernanceStrategy>(GovernanceStrategy.class, this, DmodelPackage.USER_LIBRARIES__GOVERNANCE_STRATEGIES);
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
      case DmodelPackage.USER_LIBRARIES__SERVICE_PROVIDER_TYPES:
        return ((InternalEList<?>)getServiceProviderTypes()).basicRemove(otherEnd, msgs);
      case DmodelPackage.USER_LIBRARIES__WORK_ITEM_TYPES:
        return ((InternalEList<?>)getWorkItemTypes()).basicRemove(otherEnd, msgs);
      case DmodelPackage.USER_LIBRARIES__SERVICES:
        return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
      case DmodelPackage.USER_LIBRARIES__GOVERNANCE_STRATEGIES:
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
      case DmodelPackage.USER_LIBRARIES__SERVICE_PROVIDER_TYPES:
        return getServiceProviderTypes();
      case DmodelPackage.USER_LIBRARIES__WORK_ITEM_TYPES:
        return getWorkItemTypes();
      case DmodelPackage.USER_LIBRARIES__SERVICES:
        return getServices();
      case DmodelPackage.USER_LIBRARIES__GOVERNANCE_STRATEGIES:
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
      case DmodelPackage.USER_LIBRARIES__SERVICE_PROVIDER_TYPES:
        getServiceProviderTypes().clear();
        getServiceProviderTypes().addAll((Collection<? extends ServiceProviderType>)newValue);
        return;
      case DmodelPackage.USER_LIBRARIES__WORK_ITEM_TYPES:
        getWorkItemTypes().clear();
        getWorkItemTypes().addAll((Collection<? extends WorkItemType>)newValue);
        return;
      case DmodelPackage.USER_LIBRARIES__SERVICES:
        getServices().clear();
        getServices().addAll((Collection<? extends Service>)newValue);
        return;
      case DmodelPackage.USER_LIBRARIES__GOVERNANCE_STRATEGIES:
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
      case DmodelPackage.USER_LIBRARIES__SERVICE_PROVIDER_TYPES:
        getServiceProviderTypes().clear();
        return;
      case DmodelPackage.USER_LIBRARIES__WORK_ITEM_TYPES:
        getWorkItemTypes().clear();
        return;
      case DmodelPackage.USER_LIBRARIES__SERVICES:
        getServices().clear();
        return;
      case DmodelPackage.USER_LIBRARIES__GOVERNANCE_STRATEGIES:
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
      case DmodelPackage.USER_LIBRARIES__SERVICE_PROVIDER_TYPES:
        return serviceProviderTypes != null && !serviceProviderTypes.isEmpty();
      case DmodelPackage.USER_LIBRARIES__WORK_ITEM_TYPES:
        return workItemTypes != null && !workItemTypes.isEmpty();
      case DmodelPackage.USER_LIBRARIES__SERVICES:
        return services != null && !services.isEmpty();
      case DmodelPackage.USER_LIBRARIES__GOVERNANCE_STRATEGIES:
        return governanceStrategies != null && !governanceStrategies.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //UserLibrariesImpl
