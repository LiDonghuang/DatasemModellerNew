/**
 */
package datasemModeller.dmodel.impl;

import datasemModeller.dmodel.Asset;
import datasemModeller.dmodel.DmodelPackage;
import datasemModeller.dmodel.GovernanceStrategy;
import datasemModeller.dmodel.MechanismAttribute;
import datasemModeller.dmodel.ServiceProvider;
import datasemModeller.dmodel.ServiceProviderType;

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
 *   <li>{@link datasemModeller.dmodel.impl.ServiceProviderImpl#getName <em>Name</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.ServiceProviderImpl#getType <em>Type</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.ServiceProviderImpl#getAssignTo <em>Assign To</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.ServiceProviderImpl#getGovernanceStrategy <em>Governance Strategy</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.ServiceProviderImpl#getStrategySpecs <em>Strategy Specs</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.ServiceProviderImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.ServiceProviderImpl#getId <em>Id</em>}</li>
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
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected ServiceProviderType type;

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
   * The cached value of the '{@link #getGovernanceStrategy() <em>Governance Strategy</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGovernanceStrategy()
   * @generated
   * @ordered
   */
  protected GovernanceStrategy governanceStrategy;

  /**
   * The cached value of the '{@link #getStrategySpecs() <em>Strategy Specs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrategySpecs()
   * @generated
   * @ordered
   */
  protected EList<MechanismAttribute> strategySpecs;

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
    return DmodelPackage.Literals.SERVICE_PROVIDER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.SERVICE_PROVIDER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceProviderType getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (ServiceProviderType)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DmodelPackage.SERVICE_PROVIDER__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceProviderType basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(ServiceProviderType newType)
  {
    ServiceProviderType oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.SERVICE_PROVIDER__TYPE, oldType, type));
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
      assignTo = new EObjectResolvingEList<ServiceProvider>(ServiceProvider.class, this, DmodelPackage.SERVICE_PROVIDER__ASSIGN_TO);
    }
    return assignTo;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DmodelPackage.SERVICE_PROVIDER__GOVERNANCE_STRATEGY, oldGovernanceStrategy, governanceStrategy));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.SERVICE_PROVIDER__GOVERNANCE_STRATEGY, oldGovernanceStrategy, governanceStrategy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MechanismAttribute> getStrategySpecs()
  {
    if (strategySpecs == null)
    {
      strategySpecs = new EObjectContainmentEList<MechanismAttribute>(MechanismAttribute.class, this, DmodelPackage.SERVICE_PROVIDER__STRATEGY_SPECS);
    }
    return strategySpecs;
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
      resources = new EObjectContainmentEList<Asset>(Asset.class, this, DmodelPackage.SERVICE_PROVIDER__RESOURCES);
    }
    return resources;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.SERVICE_PROVIDER__ID, oldId, id));
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
      case DmodelPackage.SERVICE_PROVIDER__STRATEGY_SPECS:
        return ((InternalEList<?>)getStrategySpecs()).basicRemove(otherEnd, msgs);
      case DmodelPackage.SERVICE_PROVIDER__RESOURCES:
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
      case DmodelPackage.SERVICE_PROVIDER__NAME:
        return getName();
      case DmodelPackage.SERVICE_PROVIDER__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case DmodelPackage.SERVICE_PROVIDER__ASSIGN_TO:
        return getAssignTo();
      case DmodelPackage.SERVICE_PROVIDER__GOVERNANCE_STRATEGY:
        if (resolve) return getGovernanceStrategy();
        return basicGetGovernanceStrategy();
      case DmodelPackage.SERVICE_PROVIDER__STRATEGY_SPECS:
        return getStrategySpecs();
      case DmodelPackage.SERVICE_PROVIDER__RESOURCES:
        return getResources();
      case DmodelPackage.SERVICE_PROVIDER__ID:
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
      case DmodelPackage.SERVICE_PROVIDER__NAME:
        setName((String)newValue);
        return;
      case DmodelPackage.SERVICE_PROVIDER__TYPE:
        setType((ServiceProviderType)newValue);
        return;
      case DmodelPackage.SERVICE_PROVIDER__ASSIGN_TO:
        getAssignTo().clear();
        getAssignTo().addAll((Collection<? extends ServiceProvider>)newValue);
        return;
      case DmodelPackage.SERVICE_PROVIDER__GOVERNANCE_STRATEGY:
        setGovernanceStrategy((GovernanceStrategy)newValue);
        return;
      case DmodelPackage.SERVICE_PROVIDER__STRATEGY_SPECS:
        getStrategySpecs().clear();
        getStrategySpecs().addAll((Collection<? extends MechanismAttribute>)newValue);
        return;
      case DmodelPackage.SERVICE_PROVIDER__RESOURCES:
        getResources().clear();
        getResources().addAll((Collection<? extends Asset>)newValue);
        return;
      case DmodelPackage.SERVICE_PROVIDER__ID:
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
      case DmodelPackage.SERVICE_PROVIDER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DmodelPackage.SERVICE_PROVIDER__TYPE:
        setType((ServiceProviderType)null);
        return;
      case DmodelPackage.SERVICE_PROVIDER__ASSIGN_TO:
        getAssignTo().clear();
        return;
      case DmodelPackage.SERVICE_PROVIDER__GOVERNANCE_STRATEGY:
        setGovernanceStrategy((GovernanceStrategy)null);
        return;
      case DmodelPackage.SERVICE_PROVIDER__STRATEGY_SPECS:
        getStrategySpecs().clear();
        return;
      case DmodelPackage.SERVICE_PROVIDER__RESOURCES:
        getResources().clear();
        return;
      case DmodelPackage.SERVICE_PROVIDER__ID:
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
      case DmodelPackage.SERVICE_PROVIDER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DmodelPackage.SERVICE_PROVIDER__TYPE:
        return type != null;
      case DmodelPackage.SERVICE_PROVIDER__ASSIGN_TO:
        return assignTo != null && !assignTo.isEmpty();
      case DmodelPackage.SERVICE_PROVIDER__GOVERNANCE_STRATEGY:
        return governanceStrategy != null;
      case DmodelPackage.SERVICE_PROVIDER__STRATEGY_SPECS:
        return strategySpecs != null && !strategySpecs.isEmpty();
      case DmodelPackage.SERVICE_PROVIDER__RESOURCES:
        return resources != null && !resources.isEmpty();
      case DmodelPackage.SERVICE_PROVIDER__ID:
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
    result.append(", id: ");
    result.append(id);
    result.append(')');
    return result.toString();
  }

} //ServiceProviderImpl
