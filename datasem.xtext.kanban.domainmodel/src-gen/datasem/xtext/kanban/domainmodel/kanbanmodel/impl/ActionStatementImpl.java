/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel.impl;

import datasem.xtext.kanban.domainmodel.kanbanmodel.Action;
import datasem.xtext.kanban.domainmodel.kanbanmodel.ActionStatement;
import datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import datasem.xtext.kanban.domainmodel.kanbanmodel.VarExpression;

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
 * An implementation of the model object '<em><b>Action Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ActionStatementImpl#getAction <em>Action</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ActionStatementImpl#getInputs <em>Inputs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionStatementImpl extends MinimalEObjectImpl.Container implements ActionStatement
{
  /**
   * The cached value of the '{@link #getAction() <em>Action</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected Action action;

  /**
   * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputs()
   * @generated
   * @ordered
   */
  protected EList<VarExpression> inputs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionStatementImpl()
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
    return KanbanmodelPackage.Literals.ACTION_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action getAction()
  {
    if (action != null && action.eIsProxy())
    {
      InternalEObject oldAction = (InternalEObject)action;
      action = (Action)eResolveProxy(oldAction);
      if (action != oldAction)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, KanbanmodelPackage.ACTION_STATEMENT__ACTION, oldAction, action));
      }
    }
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action basicGetAction()
  {
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAction(Action newAction)
  {
    Action oldAction = action;
    action = newAction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.ACTION_STATEMENT__ACTION, oldAction, action));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VarExpression> getInputs()
  {
    if (inputs == null)
    {
      inputs = new EObjectContainmentEList<VarExpression>(VarExpression.class, this, KanbanmodelPackage.ACTION_STATEMENT__INPUTS);
    }
    return inputs;
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
      case KanbanmodelPackage.ACTION_STATEMENT__INPUTS:
        return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
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
      case KanbanmodelPackage.ACTION_STATEMENT__ACTION:
        if (resolve) return getAction();
        return basicGetAction();
      case KanbanmodelPackage.ACTION_STATEMENT__INPUTS:
        return getInputs();
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
      case KanbanmodelPackage.ACTION_STATEMENT__ACTION:
        setAction((Action)newValue);
        return;
      case KanbanmodelPackage.ACTION_STATEMENT__INPUTS:
        getInputs().clear();
        getInputs().addAll((Collection<? extends VarExpression>)newValue);
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
      case KanbanmodelPackage.ACTION_STATEMENT__ACTION:
        setAction((Action)null);
        return;
      case KanbanmodelPackage.ACTION_STATEMENT__INPUTS:
        getInputs().clear();
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
      case KanbanmodelPackage.ACTION_STATEMENT__ACTION:
        return action != null;
      case KanbanmodelPackage.ACTION_STATEMENT__INPUTS:
        return inputs != null && !inputs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ActionStatementImpl
