/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel.impl;

import datasem.xtext.kanban.domainmodel.kanbanmodel.Asset;
import datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy;
import datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import datasem.xtext.kanban.domainmodel.kanbanmodel.Service;
import datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider;

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
 * An implementation of the model object '<em><b>Service Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceProviderImpl#getName <em>Name</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceProviderImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceProviderImpl#getSourceUnits <em>Source Units</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceProviderImpl#getTargetUnits <em>Target Units</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceProviderImpl#getSubordinateUnits <em>Subordinate Units</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceProviderImpl#getServices <em>Services</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceProviderImpl#getGovernanceStrategy <em>Governance Strategy</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceProviderImpl#getResources <em>Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceProviderImpl extends MinimalEObjectImpl.Container implements ServiceProvider
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
   * The cached value of the '{@link #getSourceUnits() <em>Source Units</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceUnits()
   * @generated
   * @ordered
   */
  protected EList<ServiceProvider> sourceUnits;

  /**
   * The cached value of the '{@link #getTargetUnits() <em>Target Units</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetUnits()
   * @generated
   * @ordered
   */
  protected EList<ServiceProvider> targetUnits;

  /**
   * The cached value of the '{@link #getSubordinateUnits() <em>Subordinate Units</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubordinateUnits()
   * @generated
   * @ordered
   */
  protected EList<ServiceProvider> subordinateUnits;

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
   * The cached value of the '{@link #getGovernanceStrategy() <em>Governance Strategy</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGovernanceStrategy()
   * @generated
   * @ordered
   */
  protected GovernanceStrategy governanceStrategy;

  /**
   * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResources()
   * @generated
   * @ordered
   */
  protected EList<Asset> resources;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ServiceProviderImpl()
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
    return KanbanmodelPackage.Literals.SERVICE_PROVIDER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.SERVICE_PROVIDER__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.SERVICE_PROVIDER__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ServiceProvider> getSourceUnits()
  {
    if (sourceUnits == null)
    {
      sourceUnits = new EObjectResolvingEList<ServiceProvider>(ServiceProvider.class, this, KanbanmodelPackage.SERVICE_PROVIDER__SOURCE_UNITS);
    }
    return sourceUnits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ServiceProvider> getTargetUnits()
  {
    if (targetUnits == null)
    {
      targetUnits = new EObjectResolvingEList<ServiceProvider>(ServiceProvider.class, this, KanbanmodelPackage.SERVICE_PROVIDER__TARGET_UNITS);
    }
    return targetUnits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ServiceProvider> getSubordinateUnits()
  {
    if (subordinateUnits == null)
    {
      subordinateUnits = new EObjectResolvingEList<ServiceProvider>(ServiceProvider.class, this, KanbanmodelPackage.SERVICE_PROVIDER__SUBORDINATE_UNITS);
    }
    return subordinateUnits;
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
      services = new EObjectContainmentEList<Service>(Service.class, this, KanbanmodelPackage.SERVICE_PROVIDER__SERVICES);
    }
    return services;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GovernanceStrategy getGovernanceStrategy()
  {
    if (governanceStrategy != null && governanceStrategy.eIsProxy())
    {
      InternalEObject oldGovernanceStrategy = (InternalEObject)governanceStrategy;
      governanceStrategy = (GovernanceStrategy)eResolveProxy(oldGovernanceStrategy);
      if (governanceStrategy != oldGovernanceStrategy)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, KanbanmodelPackage.SERVICE_PROVIDER__GOVERNANCE_STRATEGY, oldGovernanceStrategy, governanceStrategy));
      }
    }
    return governanceStrategy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GovernanceStrategy basicGetGovernanceStrategy()
  {
    return governanceStrategy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGovernanceStrategy(GovernanceStrategy newGovernanceStrategy)
  {
    GovernanceStrategy oldGovernanceStrategy = governanceStrategy;
    governanceStrategy = newGovernanceStrategy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.SERVICE_PROVIDER__GOVERNANCE_STRATEGY, oldGovernanceStrategy, governanceStrategy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Asset> getResources()
  {
    if (resources == null)
    {
      resources = new EObjectContainmentEList<Asset>(Asset.class, this, KanbanmodelPackage.SERVICE_PROVIDER__RESOURCES);
    }
    return resources;
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
      case KanbanmodelPackage.SERVICE_PROVIDER__SERVICES:
        return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.SERVICE_PROVIDER__RESOURCES:
        return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
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
      case KanbanmodelPackage.SERVICE_PROVIDER__NAME:
        return getName();
      case KanbanmodelPackage.SERVICE_PROVIDER__DESCRIPTION:
        return getDescription();
      case KanbanmodelPackage.SERVICE_PROVIDER__SOURCE_UNITS:
        return getSourceUnits();
      case KanbanmodelPackage.SERVICE_PROVIDER__TARGET_UNITS:
        return getTargetUnits();
      case KanbanmodelPackage.SERVICE_PROVIDER__SUBORDINATE_UNITS:
        return getSubordinateUnits();
      case KanbanmodelPackage.SERVICE_PROVIDER__SERVICES:
        return getServices();
      case KanbanmodelPackage.SERVICE_PROVIDER__GOVERNANCE_STRATEGY:
        if (resolve) return getGovernanceStrategy();
        return basicGetGovernanceStrategy();
      case KanbanmodelPackage.SERVICE_PROVIDER__RESOURCES:
        return getResources();
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
      case KanbanmodelPackage.SERVICE_PROVIDER__NAME:
        setName((String)newValue);
        return;
      case KanbanmodelPackage.SERVICE_PROVIDER__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case KanbanmodelPackage.SERVICE_PROVIDER__SOURCE_UNITS:
        getSourceUnits().clear();
        getSourceUnits().addAll((Collection<? extends ServiceProvider>)newValue);
        return;
      case KanbanmodelPackage.SERVICE_PROVIDER__TARGET_UNITS:
        getTargetUnits().clear();
        getTargetUnits().addAll((Collection<? extends ServiceProvider>)newValue);
        return;
      case KanbanmodelPackage.SERVICE_PROVIDER__SUBORDINATE_UNITS:
        getSubordinateUnits().clear();
        getSubordinateUnits().addAll((Collection<? extends ServiceProvider>)newValue);
        return;
      case KanbanmodelPackage.SERVICE_PROVIDER__SERVICES:
        getServices().clear();
        getServices().addAll((Collection<? extends Service>)newValue);
        return;
      case KanbanmodelPackage.SERVICE_PROVIDER__GOVERNANCE_STRATEGY:
        setGovernanceStrategy((GovernanceStrategy)newValue);
        return;
      case KanbanmodelPackage.SERVICE_PROVIDER__RESOURCES:
        getResources().clear();
        getResources().addAll((Collection<? extends Asset>)newValue);
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
      case KanbanmodelPackage.SERVICE_PROVIDER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case KanbanmodelPackage.SERVICE_PROVIDER__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case KanbanmodelPackage.SERVICE_PROVIDER__SOURCE_UNITS:
        getSourceUnits().clear();
        return;
      case KanbanmodelPackage.SERVICE_PROVIDER__TARGET_UNITS:
        getTargetUnits().clear();
        return;
      case KanbanmodelPackage.SERVICE_PROVIDER__SUBORDINATE_UNITS:
        getSubordinateUnits().clear();
        return;
      case KanbanmodelPackage.SERVICE_PROVIDER__SERVICES:
        getServices().clear();
        return;
      case KanbanmodelPackage.SERVICE_PROVIDER__GOVERNANCE_STRATEGY:
        setGovernanceStrategy((GovernanceStrategy)null);
        return;
      case KanbanmodelPackage.SERVICE_PROVIDER__RESOURCES:
        getResources().clear();
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
      case KanbanmodelPackage.SERVICE_PROVIDER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case KanbanmodelPackage.SERVICE_PROVIDER__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case KanbanmodelPackage.SERVICE_PROVIDER__SOURCE_UNITS:
        return sourceUnits != null && !sourceUnits.isEmpty();
      case KanbanmodelPackage.SERVICE_PROVIDER__TARGET_UNITS:
        return targetUnits != null && !targetUnits.isEmpty();
      case KanbanmodelPackage.SERVICE_PROVIDER__SUBORDINATE_UNITS:
        return subordinateUnits != null && !subordinateUnits.isEmpty();
      case KanbanmodelPackage.SERVICE_PROVIDER__SERVICES:
        return services != null && !services.isEmpty();
      case KanbanmodelPackage.SERVICE_PROVIDER__GOVERNANCE_STRATEGY:
        return governanceStrategy != null;
      case KanbanmodelPackage.SERVICE_PROVIDER__RESOURCES:
        return resources != null && !resources.isEmpty();
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

} //ServiceProviderImpl
