/**
 */
package datasemModeller.dmodel.impl;

import datasemModeller.dmodel.DmodelPackage;
import datasemModeller.dmodel.ExperimentModel;
import datasemModeller.dmodel.ExperimentVariable;
import datasemModeller.dmodel.ServiceProvider;
import datasemModeller.dmodel.WINReplication;
import datasemModeller.dmodel.WorkItemNetwork;

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
 * An implementation of the model object '<em><b>Experiment Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasemModeller.dmodel.impl.ExperimentModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.ExperimentModelImpl#getExperimentVariables <em>Experiment Variables</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.ExperimentModelImpl#getServiceProviders <em>Service Providers</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.ExperimentModelImpl#getWorkItemNetworks <em>Work Item Networks</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.ExperimentModelImpl#getWINReplications <em>WIN Replications</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExperimentModelImpl extends MinimalEObjectImpl.Container implements ExperimentModel
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
   * The cached value of the '{@link #getExperimentVariables() <em>Experiment Variables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExperimentVariables()
   * @generated
   * @ordered
   */
  protected EList<ExperimentVariable> experimentVariables;

  /**
   * The cached value of the '{@link #getServiceProviders() <em>Service Providers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceProviders()
   * @generated
   * @ordered
   */
  protected EList<ServiceProvider> serviceProviders;

  /**
   * The cached value of the '{@link #getWorkItemNetworks() <em>Work Item Networks</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWorkItemNetworks()
   * @generated
   * @ordered
   */
  protected EList<WorkItemNetwork> workItemNetworks;

  /**
   * The cached value of the '{@link #getWINReplications() <em>WIN Replications</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWINReplications()
   * @generated
   * @ordered
   */
  protected EList<WINReplication> winReplications;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExperimentModelImpl()
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
    return DmodelPackage.Literals.EXPERIMENT_MODEL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.EXPERIMENT_MODEL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExperimentVariable> getExperimentVariables()
  {
    if (experimentVariables == null)
    {
      experimentVariables = new EObjectContainmentEList<ExperimentVariable>(ExperimentVariable.class, this, DmodelPackage.EXPERIMENT_MODEL__EXPERIMENT_VARIABLES);
    }
    return experimentVariables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ServiceProvider> getServiceProviders()
  {
    if (serviceProviders == null)
    {
      serviceProviders = new EObjectContainmentEList<ServiceProvider>(ServiceProvider.class, this, DmodelPackage.EXPERIMENT_MODEL__SERVICE_PROVIDERS);
    }
    return serviceProviders;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WorkItemNetwork> getWorkItemNetworks()
  {
    if (workItemNetworks == null)
    {
      workItemNetworks = new EObjectContainmentEList<WorkItemNetwork>(WorkItemNetwork.class, this, DmodelPackage.EXPERIMENT_MODEL__WORK_ITEM_NETWORKS);
    }
    return workItemNetworks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WINReplication> getWINReplications()
  {
    if (winReplications == null)
    {
      winReplications = new EObjectContainmentEList<WINReplication>(WINReplication.class, this, DmodelPackage.EXPERIMENT_MODEL__WIN_REPLICATIONS);
    }
    return winReplications;
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
      case DmodelPackage.EXPERIMENT_MODEL__EXPERIMENT_VARIABLES:
        return ((InternalEList<?>)getExperimentVariables()).basicRemove(otherEnd, msgs);
      case DmodelPackage.EXPERIMENT_MODEL__SERVICE_PROVIDERS:
        return ((InternalEList<?>)getServiceProviders()).basicRemove(otherEnd, msgs);
      case DmodelPackage.EXPERIMENT_MODEL__WORK_ITEM_NETWORKS:
        return ((InternalEList<?>)getWorkItemNetworks()).basicRemove(otherEnd, msgs);
      case DmodelPackage.EXPERIMENT_MODEL__WIN_REPLICATIONS:
        return ((InternalEList<?>)getWINReplications()).basicRemove(otherEnd, msgs);
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
      case DmodelPackage.EXPERIMENT_MODEL__NAME:
        return getName();
      case DmodelPackage.EXPERIMENT_MODEL__EXPERIMENT_VARIABLES:
        return getExperimentVariables();
      case DmodelPackage.EXPERIMENT_MODEL__SERVICE_PROVIDERS:
        return getServiceProviders();
      case DmodelPackage.EXPERIMENT_MODEL__WORK_ITEM_NETWORKS:
        return getWorkItemNetworks();
      case DmodelPackage.EXPERIMENT_MODEL__WIN_REPLICATIONS:
        return getWINReplications();
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
      case DmodelPackage.EXPERIMENT_MODEL__NAME:
        setName((String)newValue);
        return;
      case DmodelPackage.EXPERIMENT_MODEL__EXPERIMENT_VARIABLES:
        getExperimentVariables().clear();
        getExperimentVariables().addAll((Collection<? extends ExperimentVariable>)newValue);
        return;
      case DmodelPackage.EXPERIMENT_MODEL__SERVICE_PROVIDERS:
        getServiceProviders().clear();
        getServiceProviders().addAll((Collection<? extends ServiceProvider>)newValue);
        return;
      case DmodelPackage.EXPERIMENT_MODEL__WORK_ITEM_NETWORKS:
        getWorkItemNetworks().clear();
        getWorkItemNetworks().addAll((Collection<? extends WorkItemNetwork>)newValue);
        return;
      case DmodelPackage.EXPERIMENT_MODEL__WIN_REPLICATIONS:
        getWINReplications().clear();
        getWINReplications().addAll((Collection<? extends WINReplication>)newValue);
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
      case DmodelPackage.EXPERIMENT_MODEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DmodelPackage.EXPERIMENT_MODEL__EXPERIMENT_VARIABLES:
        getExperimentVariables().clear();
        return;
      case DmodelPackage.EXPERIMENT_MODEL__SERVICE_PROVIDERS:
        getServiceProviders().clear();
        return;
      case DmodelPackage.EXPERIMENT_MODEL__WORK_ITEM_NETWORKS:
        getWorkItemNetworks().clear();
        return;
      case DmodelPackage.EXPERIMENT_MODEL__WIN_REPLICATIONS:
        getWINReplications().clear();
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
      case DmodelPackage.EXPERIMENT_MODEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DmodelPackage.EXPERIMENT_MODEL__EXPERIMENT_VARIABLES:
        return experimentVariables != null && !experimentVariables.isEmpty();
      case DmodelPackage.EXPERIMENT_MODEL__SERVICE_PROVIDERS:
        return serviceProviders != null && !serviceProviders.isEmpty();
      case DmodelPackage.EXPERIMENT_MODEL__WORK_ITEM_NETWORKS:
        return workItemNetworks != null && !workItemNetworks.isEmpty();
      case DmodelPackage.EXPERIMENT_MODEL__WIN_REPLICATIONS:
        return winReplications != null && !winReplications.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //ExperimentModelImpl
