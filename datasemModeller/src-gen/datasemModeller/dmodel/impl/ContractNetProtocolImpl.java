/**
 */
package datasemModeller.dmodel.impl;

import datasemModeller.dmodel.ContractNetProtocol;
import datasemModeller.dmodel.DmodelPackage;
import datasemModeller.dmodel.Mechanism;
import datasemModeller.dmodel.RoleBehavior;
import datasemModeller.dmodel.Variable;

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
 * An implementation of the model object '<em><b>Contract Net Protocol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasemModeller.dmodel.impl.ContractNetProtocolImpl#getMechanisms <em>Mechanisms</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.ContractNetProtocolImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.ContractNetProtocolImpl#getRoleBehaviors <em>Role Behaviors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContractNetProtocolImpl extends MinimalEObjectImpl.Container implements ContractNetProtocol
{
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
   * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected EList<Variable> variables;

  /**
   * The cached value of the '{@link #getRoleBehaviors() <em>Role Behaviors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoleBehaviors()
   * @generated
   * @ordered
   */
  protected EList<RoleBehavior> roleBehaviors;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContractNetProtocolImpl()
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
    return DmodelPackage.Literals.CONTRACT_NET_PROTOCOL;
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
      mechanisms = new EObjectContainmentEList<Mechanism>(Mechanism.class, this, DmodelPackage.CONTRACT_NET_PROTOCOL__MECHANISMS);
    }
    return mechanisms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Variable> getVariables()
  {
    if (variables == null)
    {
      variables = new EObjectContainmentEList<Variable>(Variable.class, this, DmodelPackage.CONTRACT_NET_PROTOCOL__VARIABLES);
    }
    return variables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RoleBehavior> getRoleBehaviors()
  {
    if (roleBehaviors == null)
    {
      roleBehaviors = new EObjectContainmentEList<RoleBehavior>(RoleBehavior.class, this, DmodelPackage.CONTRACT_NET_PROTOCOL__ROLE_BEHAVIORS);
    }
    return roleBehaviors;
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
      case DmodelPackage.CONTRACT_NET_PROTOCOL__MECHANISMS:
        return ((InternalEList<?>)getMechanisms()).basicRemove(otherEnd, msgs);
      case DmodelPackage.CONTRACT_NET_PROTOCOL__VARIABLES:
        return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
      case DmodelPackage.CONTRACT_NET_PROTOCOL__ROLE_BEHAVIORS:
        return ((InternalEList<?>)getRoleBehaviors()).basicRemove(otherEnd, msgs);
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
      case DmodelPackage.CONTRACT_NET_PROTOCOL__MECHANISMS:
        return getMechanisms();
      case DmodelPackage.CONTRACT_NET_PROTOCOL__VARIABLES:
        return getVariables();
      case DmodelPackage.CONTRACT_NET_PROTOCOL__ROLE_BEHAVIORS:
        return getRoleBehaviors();
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
      case DmodelPackage.CONTRACT_NET_PROTOCOL__MECHANISMS:
        getMechanisms().clear();
        getMechanisms().addAll((Collection<? extends Mechanism>)newValue);
        return;
      case DmodelPackage.CONTRACT_NET_PROTOCOL__VARIABLES:
        getVariables().clear();
        getVariables().addAll((Collection<? extends Variable>)newValue);
        return;
      case DmodelPackage.CONTRACT_NET_PROTOCOL__ROLE_BEHAVIORS:
        getRoleBehaviors().clear();
        getRoleBehaviors().addAll((Collection<? extends RoleBehavior>)newValue);
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
      case DmodelPackage.CONTRACT_NET_PROTOCOL__MECHANISMS:
        getMechanisms().clear();
        return;
      case DmodelPackage.CONTRACT_NET_PROTOCOL__VARIABLES:
        getVariables().clear();
        return;
      case DmodelPackage.CONTRACT_NET_PROTOCOL__ROLE_BEHAVIORS:
        getRoleBehaviors().clear();
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
      case DmodelPackage.CONTRACT_NET_PROTOCOL__MECHANISMS:
        return mechanisms != null && !mechanisms.isEmpty();
      case DmodelPackage.CONTRACT_NET_PROTOCOL__VARIABLES:
        return variables != null && !variables.isEmpty();
      case DmodelPackage.CONTRACT_NET_PROTOCOL__ROLE_BEHAVIORS:
        return roleBehaviors != null && !roleBehaviors.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ContractNetProtocolImpl
