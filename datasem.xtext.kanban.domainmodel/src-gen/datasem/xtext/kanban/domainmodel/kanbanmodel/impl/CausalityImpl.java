/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel.impl;

import datasem.xtext.kanban.domainmodel.kanbanmodel.Causality;
import datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Causality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.CausalityImpl#getTriggered <em>Triggered</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.CausalityImpl#getAtProgress <em>At Progress</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.CausalityImpl#getOnProbability <em>On Probability</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CausalityImpl extends MinimalEObjectImpl.Container implements Causality
{
  /**
   * The cached value of the '{@link #getTriggered() <em>Triggered</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTriggered()
   * @generated
   * @ordered
   */
  protected EList<WorkItem> triggered;

  /**
   * The default value of the '{@link #getAtProgress() <em>At Progress</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtProgress()
   * @generated
   * @ordered
   */
  protected static final int AT_PROGRESS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getAtProgress() <em>At Progress</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtProgress()
   * @generated
   * @ordered
   */
  protected int atProgress = AT_PROGRESS_EDEFAULT;

  /**
   * The default value of the '{@link #getOnProbability() <em>On Probability</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOnProbability()
   * @generated
   * @ordered
   */
  protected static final int ON_PROBABILITY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getOnProbability() <em>On Probability</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOnProbability()
   * @generated
   * @ordered
   */
  protected int onProbability = ON_PROBABILITY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CausalityImpl()
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
    return KanbanmodelPackage.Literals.CAUSALITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WorkItem> getTriggered()
  {
    if (triggered == null)
    {
      triggered = new EObjectResolvingEList<WorkItem>(WorkItem.class, this, KanbanmodelPackage.CAUSALITY__TRIGGERED);
    }
    return triggered;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getAtProgress()
  {
    return atProgress;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAtProgress(int newAtProgress)
  {
    int oldAtProgress = atProgress;
    atProgress = newAtProgress;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.CAUSALITY__AT_PROGRESS, oldAtProgress, atProgress));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getOnProbability()
  {
    return onProbability;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOnProbability(int newOnProbability)
  {
    int oldOnProbability = onProbability;
    onProbability = newOnProbability;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.CAUSALITY__ON_PROBABILITY, oldOnProbability, onProbability));
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
      case KanbanmodelPackage.CAUSALITY__TRIGGERED:
        return getTriggered();
      case KanbanmodelPackage.CAUSALITY__AT_PROGRESS:
        return getAtProgress();
      case KanbanmodelPackage.CAUSALITY__ON_PROBABILITY:
        return getOnProbability();
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
      case KanbanmodelPackage.CAUSALITY__TRIGGERED:
        getTriggered().clear();
        getTriggered().addAll((Collection<? extends WorkItem>)newValue);
        return;
      case KanbanmodelPackage.CAUSALITY__AT_PROGRESS:
        setAtProgress((Integer)newValue);
        return;
      case KanbanmodelPackage.CAUSALITY__ON_PROBABILITY:
        setOnProbability((Integer)newValue);
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
      case KanbanmodelPackage.CAUSALITY__TRIGGERED:
        getTriggered().clear();
        return;
      case KanbanmodelPackage.CAUSALITY__AT_PROGRESS:
        setAtProgress(AT_PROGRESS_EDEFAULT);
        return;
      case KanbanmodelPackage.CAUSALITY__ON_PROBABILITY:
        setOnProbability(ON_PROBABILITY_EDEFAULT);
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
      case KanbanmodelPackage.CAUSALITY__TRIGGERED:
        return triggered != null && !triggered.isEmpty();
      case KanbanmodelPackage.CAUSALITY__AT_PROGRESS:
        return atProgress != AT_PROGRESS_EDEFAULT;
      case KanbanmodelPackage.CAUSALITY__ON_PROBABILITY:
        return onProbability != ON_PROBABILITY_EDEFAULT;
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
    result.append(" (atProgress: ");
    result.append(atProgress);
    result.append(", onProbability: ");
    result.append(onProbability);
    result.append(')');
    return result.toString();
  }

} //CausalityImpl
