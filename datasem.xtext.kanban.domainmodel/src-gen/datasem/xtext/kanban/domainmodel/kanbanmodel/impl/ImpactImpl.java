/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel.impl;

import datasem.xtext.kanban.domainmodel.kanbanmodel.AbstractParameter;
import datasem.xtext.kanban.domainmodel.kanbanmodel.Impact;
import datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Impact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ImpactImpl#getImpactWI <em>Impact WI</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ImpactImpl#getLikelihood <em>Likelihood</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ImpactImpl#getRisk <em>Risk</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImpactImpl extends MinimalEObjectImpl.Container implements Impact
{
  /**
   * The cached value of the '{@link #getImpactWI() <em>Impact WI</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImpactWI()
   * @generated
   * @ordered
   */
  protected WorkItem impactWI;

  /**
   * The cached value of the '{@link #getLikelihood() <em>Likelihood</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLikelihood()
   * @generated
   * @ordered
   */
  protected AbstractParameter likelihood;

  /**
   * The cached value of the '{@link #getRisk() <em>Risk</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRisk()
   * @generated
   * @ordered
   */
  protected AbstractParameter risk;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImpactImpl()
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
    return KanbanmodelPackage.Literals.IMPACT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkItem getImpactWI()
  {
    if (impactWI != null && impactWI.eIsProxy())
    {
      InternalEObject oldImpactWI = (InternalEObject)impactWI;
      impactWI = (WorkItem)eResolveProxy(oldImpactWI);
      if (impactWI != oldImpactWI)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, KanbanmodelPackage.IMPACT__IMPACT_WI, oldImpactWI, impactWI));
      }
    }
    return impactWI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkItem basicGetImpactWI()
  {
    return impactWI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImpactWI(WorkItem newImpactWI)
  {
    WorkItem oldImpactWI = impactWI;
    impactWI = newImpactWI;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.IMPACT__IMPACT_WI, oldImpactWI, impactWI));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractParameter getLikelihood()
  {
    return likelihood;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLikelihood(AbstractParameter newLikelihood, NotificationChain msgs)
  {
    AbstractParameter oldLikelihood = likelihood;
    likelihood = newLikelihood;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.IMPACT__LIKELIHOOD, oldLikelihood, newLikelihood);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLikelihood(AbstractParameter newLikelihood)
  {
    if (newLikelihood != likelihood)
    {
      NotificationChain msgs = null;
      if (likelihood != null)
        msgs = ((InternalEObject)likelihood).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.IMPACT__LIKELIHOOD, null, msgs);
      if (newLikelihood != null)
        msgs = ((InternalEObject)newLikelihood).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.IMPACT__LIKELIHOOD, null, msgs);
      msgs = basicSetLikelihood(newLikelihood, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.IMPACT__LIKELIHOOD, newLikelihood, newLikelihood));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractParameter getRisk()
  {
    return risk;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRisk(AbstractParameter newRisk, NotificationChain msgs)
  {
    AbstractParameter oldRisk = risk;
    risk = newRisk;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.IMPACT__RISK, oldRisk, newRisk);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRisk(AbstractParameter newRisk)
  {
    if (newRisk != risk)
    {
      NotificationChain msgs = null;
      if (risk != null)
        msgs = ((InternalEObject)risk).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.IMPACT__RISK, null, msgs);
      if (newRisk != null)
        msgs = ((InternalEObject)newRisk).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.IMPACT__RISK, null, msgs);
      msgs = basicSetRisk(newRisk, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.IMPACT__RISK, newRisk, newRisk));
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
      case KanbanmodelPackage.IMPACT__LIKELIHOOD:
        return basicSetLikelihood(null, msgs);
      case KanbanmodelPackage.IMPACT__RISK:
        return basicSetRisk(null, msgs);
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
      case KanbanmodelPackage.IMPACT__IMPACT_WI:
        if (resolve) return getImpactWI();
        return basicGetImpactWI();
      case KanbanmodelPackage.IMPACT__LIKELIHOOD:
        return getLikelihood();
      case KanbanmodelPackage.IMPACT__RISK:
        return getRisk();
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
      case KanbanmodelPackage.IMPACT__IMPACT_WI:
        setImpactWI((WorkItem)newValue);
        return;
      case KanbanmodelPackage.IMPACT__LIKELIHOOD:
        setLikelihood((AbstractParameter)newValue);
        return;
      case KanbanmodelPackage.IMPACT__RISK:
        setRisk((AbstractParameter)newValue);
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
      case KanbanmodelPackage.IMPACT__IMPACT_WI:
        setImpactWI((WorkItem)null);
        return;
      case KanbanmodelPackage.IMPACT__LIKELIHOOD:
        setLikelihood((AbstractParameter)null);
        return;
      case KanbanmodelPackage.IMPACT__RISK:
        setRisk((AbstractParameter)null);
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
      case KanbanmodelPackage.IMPACT__IMPACT_WI:
        return impactWI != null;
      case KanbanmodelPackage.IMPACT__LIKELIHOOD:
        return likelihood != null;
      case KanbanmodelPackage.IMPACT__RISK:
        return risk != null;
    }
    return super.eIsSet(featureID);
  }

} //ImpactImpl
