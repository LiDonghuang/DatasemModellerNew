/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel.impl;

import datasem.xtext.kanban.domainmodel.kanbanmodel.AbstractParameter;
import datasem.xtext.kanban.domainmodel.kanbanmodel.Impact;
import datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Impact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ImpactImpl#getImpactWIs <em>Impact WIs</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ImpactImpl#getLikelihood <em>Likelihood</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ImpactImpl#getImpact <em>Impact</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImpactImpl extends MinimalEObjectImpl.Container implements Impact
{
  /**
   * The cached value of the '{@link #getImpactWIs() <em>Impact WIs</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImpactWIs()
   * @generated
   * @ordered
   */
  protected EList<WorkItem> impactWIs;

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
   * The cached value of the '{@link #getImpact() <em>Impact</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImpact()
   * @generated
   * @ordered
   */
  protected AbstractParameter impact;

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
  public EList<WorkItem> getImpactWIs()
  {
    if (impactWIs == null)
    {
      impactWIs = new EObjectResolvingEList<WorkItem>(WorkItem.class, this, KanbanmodelPackage.IMPACT__IMPACT_WIS);
    }
    return impactWIs;
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
  public AbstractParameter getImpact()
  {
    return impact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetImpact(AbstractParameter newImpact, NotificationChain msgs)
  {
    AbstractParameter oldImpact = impact;
    impact = newImpact;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.IMPACT__IMPACT, oldImpact, newImpact);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImpact(AbstractParameter newImpact)
  {
    if (newImpact != impact)
    {
      NotificationChain msgs = null;
      if (impact != null)
        msgs = ((InternalEObject)impact).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.IMPACT__IMPACT, null, msgs);
      if (newImpact != null)
        msgs = ((InternalEObject)newImpact).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.IMPACT__IMPACT, null, msgs);
      msgs = basicSetImpact(newImpact, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.IMPACT__IMPACT, newImpact, newImpact));
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
      case KanbanmodelPackage.IMPACT__IMPACT:
        return basicSetImpact(null, msgs);
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
      case KanbanmodelPackage.IMPACT__IMPACT_WIS:
        return getImpactWIs();
      case KanbanmodelPackage.IMPACT__LIKELIHOOD:
        return getLikelihood();
      case KanbanmodelPackage.IMPACT__IMPACT:
        return getImpact();
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
      case KanbanmodelPackage.IMPACT__IMPACT_WIS:
        getImpactWIs().clear();
        getImpactWIs().addAll((Collection<? extends WorkItem>)newValue);
        return;
      case KanbanmodelPackage.IMPACT__LIKELIHOOD:
        setLikelihood((AbstractParameter)newValue);
        return;
      case KanbanmodelPackage.IMPACT__IMPACT:
        setImpact((AbstractParameter)newValue);
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
      case KanbanmodelPackage.IMPACT__IMPACT_WIS:
        getImpactWIs().clear();
        return;
      case KanbanmodelPackage.IMPACT__LIKELIHOOD:
        setLikelihood((AbstractParameter)null);
        return;
      case KanbanmodelPackage.IMPACT__IMPACT:
        setImpact((AbstractParameter)null);
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
      case KanbanmodelPackage.IMPACT__IMPACT_WIS:
        return impactWIs != null && !impactWIs.isEmpty();
      case KanbanmodelPackage.IMPACT__LIKELIHOOD:
        return likelihood != null;
      case KanbanmodelPackage.IMPACT__IMPACT:
        return impact != null;
    }
    return super.eIsSet(featureID);
  }

} //ImpactImpl
