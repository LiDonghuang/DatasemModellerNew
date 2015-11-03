/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel.impl;

import datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import datasem.xtext.kanban.domainmodel.kanbanmodel.Mechanism;
import datasem.xtext.kanban.domainmodel.kanbanmodel.ProcessModel;
import datasem.xtext.kanban.domainmodel.kanbanmodel.PullStrategy;

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
 * An implementation of the model object '<em><b>Pull Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.PullStrategyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.PullStrategyImpl#getMechanisms <em>Mechanisms</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.PullStrategyImpl#getProcesses <em>Processes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PullStrategyImpl extends MinimalEObjectImpl.Container implements PullStrategy
{
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
   * The cached value of the '{@link #getMechanisms() <em>Mechanisms</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMechanisms()
   * @generated
   * @ordered
   */
  protected EList<Mechanism> mechanisms;

  /**
   * The cached value of the '{@link #getProcesses() <em>Processes</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcesses()
   * @generated
   * @ordered
   */
  protected EList<ProcessModel> processes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PullStrategyImpl()
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
    return KanbanmodelPackage.Literals.PULL_STRATEGY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.PULL_STRATEGY__DESCRIPTION, oldDescription, description));
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
      mechanisms = new EObjectContainmentEList<Mechanism>(Mechanism.class, this, KanbanmodelPackage.PULL_STRATEGY__MECHANISMS);
    }
    return mechanisms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProcessModel> getProcesses()
  {
    if (processes == null)
    {
      processes = new EObjectResolvingEList<ProcessModel>(ProcessModel.class, this, KanbanmodelPackage.PULL_STRATEGY__PROCESSES);
    }
    return processes;
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
      case KanbanmodelPackage.PULL_STRATEGY__MECHANISMS:
        return ((InternalEList<?>)getMechanisms()).basicRemove(otherEnd, msgs);
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
      case KanbanmodelPackage.PULL_STRATEGY__DESCRIPTION:
        return getDescription();
      case KanbanmodelPackage.PULL_STRATEGY__MECHANISMS:
        return getMechanisms();
      case KanbanmodelPackage.PULL_STRATEGY__PROCESSES:
        return getProcesses();
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
      case KanbanmodelPackage.PULL_STRATEGY__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case KanbanmodelPackage.PULL_STRATEGY__MECHANISMS:
        getMechanisms().clear();
        getMechanisms().addAll((Collection<? extends Mechanism>)newValue);
        return;
      case KanbanmodelPackage.PULL_STRATEGY__PROCESSES:
        getProcesses().clear();
        getProcesses().addAll((Collection<? extends ProcessModel>)newValue);
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
      case KanbanmodelPackage.PULL_STRATEGY__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case KanbanmodelPackage.PULL_STRATEGY__MECHANISMS:
        getMechanisms().clear();
        return;
      case KanbanmodelPackage.PULL_STRATEGY__PROCESSES:
        getProcesses().clear();
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
      case KanbanmodelPackage.PULL_STRATEGY__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case KanbanmodelPackage.PULL_STRATEGY__MECHANISMS:
        return mechanisms != null && !mechanisms.isEmpty();
      case KanbanmodelPackage.PULL_STRATEGY__PROCESSES:
        return processes != null && !processes.isEmpty();
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
    result.append(" (description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //PullStrategyImpl
