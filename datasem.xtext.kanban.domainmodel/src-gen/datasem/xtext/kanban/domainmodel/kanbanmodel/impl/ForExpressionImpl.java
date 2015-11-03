/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel.impl;

import datasem.xtext.kanban.domainmodel.kanbanmodel.ForExpression;
import datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import datasem.xtext.kanban.domainmodel.kanbanmodel.Statement;
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
 * An implementation of the model object '<em><b>For Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ForExpressionImpl#getObject <em>Object</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ForExpressionImpl#getSet <em>Set</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ForExpressionImpl#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForExpressionImpl extends MinimalEObjectImpl.Container implements ForExpression
{
  /**
   * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObject()
   * @generated
   * @ordered
   */
  protected VarExpression object;

  /**
   * The cached value of the '{@link #getSet() <em>Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSet()
   * @generated
   * @ordered
   */
  protected VarExpression set;

  /**
   * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatements()
   * @generated
   * @ordered
   */
  protected EList<Statement> statements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForExpressionImpl()
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
    return KanbanmodelPackage.Literals.FOR_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarExpression getObject()
  {
    return object;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetObject(VarExpression newObject, NotificationChain msgs)
  {
    VarExpression oldObject = object;
    object = newObject;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.FOR_EXPRESSION__OBJECT, oldObject, newObject);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObject(VarExpression newObject)
  {
    if (newObject != object)
    {
      NotificationChain msgs = null;
      if (object != null)
        msgs = ((InternalEObject)object).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.FOR_EXPRESSION__OBJECT, null, msgs);
      if (newObject != null)
        msgs = ((InternalEObject)newObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.FOR_EXPRESSION__OBJECT, null, msgs);
      msgs = basicSetObject(newObject, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.FOR_EXPRESSION__OBJECT, newObject, newObject));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarExpression getSet()
  {
    return set;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSet(VarExpression newSet, NotificationChain msgs)
  {
    VarExpression oldSet = set;
    set = newSet;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.FOR_EXPRESSION__SET, oldSet, newSet);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSet(VarExpression newSet)
  {
    if (newSet != set)
    {
      NotificationChain msgs = null;
      if (set != null)
        msgs = ((InternalEObject)set).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.FOR_EXPRESSION__SET, null, msgs);
      if (newSet != null)
        msgs = ((InternalEObject)newSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.FOR_EXPRESSION__SET, null, msgs);
      msgs = basicSetSet(newSet, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.FOR_EXPRESSION__SET, newSet, newSet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getStatements()
  {
    if (statements == null)
    {
      statements = new EObjectContainmentEList<Statement>(Statement.class, this, KanbanmodelPackage.FOR_EXPRESSION__STATEMENTS);
    }
    return statements;
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
      case KanbanmodelPackage.FOR_EXPRESSION__OBJECT:
        return basicSetObject(null, msgs);
      case KanbanmodelPackage.FOR_EXPRESSION__SET:
        return basicSetSet(null, msgs);
      case KanbanmodelPackage.FOR_EXPRESSION__STATEMENTS:
        return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
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
      case KanbanmodelPackage.FOR_EXPRESSION__OBJECT:
        return getObject();
      case KanbanmodelPackage.FOR_EXPRESSION__SET:
        return getSet();
      case KanbanmodelPackage.FOR_EXPRESSION__STATEMENTS:
        return getStatements();
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
      case KanbanmodelPackage.FOR_EXPRESSION__OBJECT:
        setObject((VarExpression)newValue);
        return;
      case KanbanmodelPackage.FOR_EXPRESSION__SET:
        setSet((VarExpression)newValue);
        return;
      case KanbanmodelPackage.FOR_EXPRESSION__STATEMENTS:
        getStatements().clear();
        getStatements().addAll((Collection<? extends Statement>)newValue);
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
      case KanbanmodelPackage.FOR_EXPRESSION__OBJECT:
        setObject((VarExpression)null);
        return;
      case KanbanmodelPackage.FOR_EXPRESSION__SET:
        setSet((VarExpression)null);
        return;
      case KanbanmodelPackage.FOR_EXPRESSION__STATEMENTS:
        getStatements().clear();
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
      case KanbanmodelPackage.FOR_EXPRESSION__OBJECT:
        return object != null;
      case KanbanmodelPackage.FOR_EXPRESSION__SET:
        return set != null;
      case KanbanmodelPackage.FOR_EXPRESSION__STATEMENTS:
        return statements != null && !statements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ForExpressionImpl
