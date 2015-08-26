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
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceProviderImpl#getAssignTo <em>Assign To</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceProviderImpl#getOutsourceFrom <em>Outsource From</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceProviderImpl#getTeamService <em>Team Service</em>}</li>
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
   * The cached value of the '{@link #getAssignTo() <em>Assign To</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignTo()
   * @generated
   * @ordered
   */
  protected EList<ServiceProvider> assignTo;

  /**
   * The cached value of the '{@link #getOutsourceFrom() <em>Outsource From</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutsourceFrom()
   * @generated
   * @ordered
   */
  protected EList<ServiceProvider> outsourceFrom;

  /**
   * The cached value of the '{@link #getTeamService() <em>Team Service</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTeamService()
   * @generated
   * @ordered
   */
  protected Service teamService;

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
  public EList<ServiceProvider> getAssignTo()
  {
    if (assignTo == null)
    {
      assignTo = new EObjectResolvingEList<ServiceProvider>(ServiceProvider.class, this, KanbanmodelPackage.SERVICE_PROVIDER__ASSIGN_TO);
    }
    return assignTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ServiceProvider> getOutsourceFrom()
  {
    if (outsourceFrom == null)
    {
      outsourceFrom = new EObjectResolvingEList<ServiceProvider>(ServiceProvider.class, this, KanbanmodelPackage.SERVICE_PROVIDER__OUTSOURCE_FROM);
    }
    return outsourceFrom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service getTeamService()
  {
    if (teamService != null && teamService.eIsProxy())
    {
      InternalEObject oldTeamService = (InternalEObject)teamService;
      teamService = (Service)eResolveProxy(oldTeamService);
      if (teamService != oldTeamService)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, KanbanmodelPackage.SERVICE_PROVIDER__TEAM_SERVICE, oldTeamService, teamService));
      }
    }
    return teamService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service basicGetTeamService()
  {
    return teamService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTeamService(Service newTeamService)
  {
    Service oldTeamService = teamService;
    teamService = newTeamService;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.SERVICE_PROVIDER__TEAM_SERVICE, oldTeamService, teamService));
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
      case KanbanmodelPackage.SERVICE_PROVIDER__ASSIGN_TO:
        return getAssignTo();
      case KanbanmodelPackage.SERVICE_PROVIDER__OUTSOURCE_FROM:
        return getOutsourceFrom();
      case KanbanmodelPackage.SERVICE_PROVIDER__TEAM_SERVICE:
        if (resolve) return getTeamService();
        return basicGetTeamService();
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
      case KanbanmodelPackage.SERVICE_PROVIDER__ASSIGN_TO:
        getAssignTo().clear();
        getAssignTo().addAll((Collection<? extends ServiceProvider>)newValue);
        return;
      case KanbanmodelPackage.SERVICE_PROVIDER__OUTSOURCE_FROM:
        getOutsourceFrom().clear();
        getOutsourceFrom().addAll((Collection<? extends ServiceProvider>)newValue);
        return;
      case KanbanmodelPackage.SERVICE_PROVIDER__TEAM_SERVICE:
        setTeamService((Service)newValue);
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
      case KanbanmodelPackage.SERVICE_PROVIDER__ASSIGN_TO:
        getAssignTo().clear();
        return;
      case KanbanmodelPackage.SERVICE_PROVIDER__OUTSOURCE_FROM:
        getOutsourceFrom().clear();
        return;
      case KanbanmodelPackage.SERVICE_PROVIDER__TEAM_SERVICE:
        setTeamService((Service)null);
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
      case KanbanmodelPackage.SERVICE_PROVIDER__ASSIGN_TO:
        return assignTo != null && !assignTo.isEmpty();
      case KanbanmodelPackage.SERVICE_PROVIDER__OUTSOURCE_FROM:
        return outsourceFrom != null && !outsourceFrom.isEmpty();
      case KanbanmodelPackage.SERVICE_PROVIDER__TEAM_SERVICE:
        return teamService != null;
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
