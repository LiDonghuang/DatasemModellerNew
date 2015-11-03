/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel.impl;

import datasem.xtext.kanban.domainmodel.kanbanmodel.AssertStatement;
import datasem.xtext.kanban.domainmodel.kanbanmodel.Expression;
import datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import datasem.xtext.kanban.domainmodel.kanbanmodel.VarExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assert Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AssertStatementImpl#getInput <em>Input</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AssertStatementImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssertStatementImpl extends MinimalEObjectImpl.Container implements AssertStatement
{
  /**
   * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInput()
   * @generated
   * @ordered
   */
  protected VarExpression input;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected Expression value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssertStatementImpl()
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
    return KanbanmodelPackage.Literals.ASSERT_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarExpression getInput()
  {
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInput(VarExpression newInput, NotificationChain msgs)
  {
    VarExpression oldInput = input;
    input = newInput;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.ASSERT_STATEMENT__INPUT, oldInput, newInput);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInput(VarExpression newInput)
  {
    if (newInput != input)
    {
      NotificationChain msgs = null;
      if (input != null)
        msgs = ((InternalEObject)input).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.ASSERT_STATEMENT__INPUT, null, msgs);
      if (newInput != null)
        msgs = ((InternalEObject)newInput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.ASSERT_STATEMENT__INPUT, null, msgs);
      msgs = basicSetInput(newInput, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.ASSERT_STATEMENT__INPUT, newInput, newInput));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(Expression newValue, NotificationChain msgs)
  {
    Expression oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.ASSERT_STATEMENT__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(Expression newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.ASSERT_STATEMENT__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.ASSERT_STATEMENT__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.ASSERT_STATEMENT__VALUE, newValue, newValue));
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
      case KanbanmodelPackage.ASSERT_STATEMENT__INPUT:
        return basicSetInput(null, msgs);
      case KanbanmodelPackage.ASSERT_STATEMENT__VALUE:
        return basicSetValue(null, msgs);
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
      case KanbanmodelPackage.ASSERT_STATEMENT__INPUT:
        return getInput();
      case KanbanmodelPackage.ASSERT_STATEMENT__VALUE:
        return getValue();
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
      case KanbanmodelPackage.ASSERT_STATEMENT__INPUT:
        setInput((VarExpression)newValue);
        return;
      case KanbanmodelPackage.ASSERT_STATEMENT__VALUE:
        setValue((Expression)newValue);
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
      case KanbanmodelPackage.ASSERT_STATEMENT__INPUT:
        setInput((VarExpression)null);
        return;
      case KanbanmodelPackage.ASSERT_STATEMENT__VALUE:
        setValue((Expression)null);
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
      case KanbanmodelPackage.ASSERT_STATEMENT__INPUT:
        return input != null;
      case KanbanmodelPackage.ASSERT_STATEMENT__VALUE:
        return value != null;
    }
    return super.eIsSet(featureID);
  }

} //AssertStatementImpl
