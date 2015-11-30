/**
 */
package datasemModeller.dmodel.impl;

import datasemModeller.dmodel.DmodelPackage;
import datasemModeller.dmodel.GovernanceStrategy;
import datasemModeller.dmodel.PullStrategy;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Governance Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasemModeller.dmodel.impl.GovernanceStrategyImpl#getName <em>Name</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.GovernanceStrategyImpl#getPullStrategy <em>Pull Strategy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GovernanceStrategyImpl extends MinimalEObjectImpl.Container implements GovernanceStrategy
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
   * The cached value of the '{@link #getPullStrategy() <em>Pull Strategy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPullStrategy()
   * @generated
   * @ordered
   */
  protected PullStrategy pullStrategy;

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
    return DmodelPackage.Literals.GOVERNANCE_STRATEGY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.GOVERNANCE_STRATEGY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PullStrategy getPullStrategy()
  {
    return pullStrategy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPullStrategy(PullStrategy newPullStrategy, NotificationChain msgs)
  {
    PullStrategy oldPullStrategy = pullStrategy;
    pullStrategy = newPullStrategy;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmodelPackage.GOVERNANCE_STRATEGY__PULL_STRATEGY, oldPullStrategy, newPullStrategy);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPullStrategy(PullStrategy newPullStrategy)
  {
    if (newPullStrategy != pullStrategy)
    {
      NotificationChain msgs = null;
      if (pullStrategy != null)
        msgs = ((InternalEObject)pullStrategy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmodelPackage.GOVERNANCE_STRATEGY__PULL_STRATEGY, null, msgs);
      if (newPullStrategy != null)
        msgs = ((InternalEObject)newPullStrategy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmodelPackage.GOVERNANCE_STRATEGY__PULL_STRATEGY, null, msgs);
      msgs = basicSetPullStrategy(newPullStrategy, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.GOVERNANCE_STRATEGY__PULL_STRATEGY, newPullStrategy, newPullStrategy));
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
      case DmodelPackage.GOVERNANCE_STRATEGY__PULL_STRATEGY:
        return basicSetPullStrategy(null, msgs);
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
      case DmodelPackage.GOVERNANCE_STRATEGY__NAME:
        return getName();
      case DmodelPackage.GOVERNANCE_STRATEGY__PULL_STRATEGY:
        return getPullStrategy();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DmodelPackage.GOVERNANCE_STRATEGY__NAME:
        setName((String)newValue);
        return;
      case DmodelPackage.GOVERNANCE_STRATEGY__PULL_STRATEGY:
        setPullStrategy((PullStrategy)newValue);
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
      case DmodelPackage.GOVERNANCE_STRATEGY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DmodelPackage.GOVERNANCE_STRATEGY__PULL_STRATEGY:
        setPullStrategy((PullStrategy)null);
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
      case DmodelPackage.GOVERNANCE_STRATEGY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DmodelPackage.GOVERNANCE_STRATEGY__PULL_STRATEGY:
        return pullStrategy != null;
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

} //GovernanceStrategyImpl
