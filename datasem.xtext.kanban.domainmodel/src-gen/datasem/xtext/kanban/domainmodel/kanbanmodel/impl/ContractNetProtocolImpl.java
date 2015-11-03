/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel.impl;

import datasem.xtext.kanban.domainmodel.kanbanmodel.ContractNetProtocol;
import datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import datasem.xtext.kanban.domainmodel.kanbanmodel.ProcessModel;
import datasem.xtext.kanban.domainmodel.kanbanmodel.RoleBehavior;
import datasem.xtext.kanban.domainmodel.kanbanmodel.Variable;

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
 * An implementation of the model object '<em><b>Contract Net Protocol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ContractNetProtocolImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ContractNetProtocolImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ContractNetProtocolImpl#getRoleBehaviors <em>Role Behaviors</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ContractNetProtocolImpl#getProcesses <em>Processes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContractNetProtocolImpl extends MinimalEObjectImpl.Container implements ContractNetProtocol
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
    return KanbanmodelPackage.Literals.CONTRACT_NET_PROTOCOL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.CONTRACT_NET_PROTOCOL__DESCRIPTION, oldDescription, description));
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
      variables = new EObjectContainmentEList<Variable>(Variable.class, this, KanbanmodelPackage.CONTRACT_NET_PROTOCOL__VARIABLES);
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
      roleBehaviors = new EObjectContainmentEList<RoleBehavior>(RoleBehavior.class, this, KanbanmodelPackage.CONTRACT_NET_PROTOCOL__ROLE_BEHAVIORS);
    }
    return roleBehaviors;
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
      processes = new EObjectResolvingEList<ProcessModel>(ProcessModel.class, this, KanbanmodelPackage.CONTRACT_NET_PROTOCOL__PROCESSES);
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
      case KanbanmodelPackage.CONTRACT_NET_PROTOCOL__VARIABLES:
        return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.CONTRACT_NET_PROTOCOL__ROLE_BEHAVIORS:
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
      case KanbanmodelPackage.CONTRACT_NET_PROTOCOL__DESCRIPTION:
        return getDescription();
      case KanbanmodelPackage.CONTRACT_NET_PROTOCOL__VARIABLES:
        return getVariables();
      case KanbanmodelPackage.CONTRACT_NET_PROTOCOL__ROLE_BEHAVIORS:
        return getRoleBehaviors();
      case KanbanmodelPackage.CONTRACT_NET_PROTOCOL__PROCESSES:
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
      case KanbanmodelPackage.CONTRACT_NET_PROTOCOL__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case KanbanmodelPackage.CONTRACT_NET_PROTOCOL__VARIABLES:
        getVariables().clear();
        getVariables().addAll((Collection<? extends Variable>)newValue);
        return;
      case KanbanmodelPackage.CONTRACT_NET_PROTOCOL__ROLE_BEHAVIORS:
        getRoleBehaviors().clear();
        getRoleBehaviors().addAll((Collection<? extends RoleBehavior>)newValue);
        return;
      case KanbanmodelPackage.CONTRACT_NET_PROTOCOL__PROCESSES:
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
      case KanbanmodelPackage.CONTRACT_NET_PROTOCOL__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case KanbanmodelPackage.CONTRACT_NET_PROTOCOL__VARIABLES:
        getVariables().clear();
        return;
      case KanbanmodelPackage.CONTRACT_NET_PROTOCOL__ROLE_BEHAVIORS:
        getRoleBehaviors().clear();
        return;
      case KanbanmodelPackage.CONTRACT_NET_PROTOCOL__PROCESSES:
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
      case KanbanmodelPackage.CONTRACT_NET_PROTOCOL__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case KanbanmodelPackage.CONTRACT_NET_PROTOCOL__VARIABLES:
        return variables != null && !variables.isEmpty();
      case KanbanmodelPackage.CONTRACT_NET_PROTOCOL__ROLE_BEHAVIORS:
        return roleBehaviors != null && !roleBehaviors.isEmpty();
      case KanbanmodelPackage.CONTRACT_NET_PROTOCOL__PROCESSES:
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

} //ContractNetProtocolImpl
