/**
 */
package datasemModeller.dmodel.impl;

import datasemModeller.dmodel.Condition;
import datasemModeller.dmodel.DmodelPackage;
import datasemModeller.dmodel.IfExpression;
import datasemModeller.dmodel.Statement;

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
 * An implementation of the model object '<em><b>If Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasemModeller.dmodel.impl.IfExpressionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.IfExpressionImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.IfExpressionImpl#isHasElseIf <em>Has Else If</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.IfExpressionImpl#getElseIf <em>Else If</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.IfExpressionImpl#getElses <em>Elses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfExpressionImpl extends MinimalEObjectImpl.Container implements IfExpression
{
  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected Condition condition;

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
   * The default value of the '{@link #isHasElseIf() <em>Has Else If</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasElseIf()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_ELSE_IF_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasElseIf() <em>Has Else If</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasElseIf()
   * @generated
   * @ordered
   */
  protected boolean hasElseIf = HAS_ELSE_IF_EDEFAULT;

  /**
   * The cached value of the '{@link #getElseIf() <em>Else If</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseIf()
   * @generated
   * @ordered
   */
  protected IfExpression elseIf;

  /**
   * The cached value of the '{@link #getElses() <em>Elses</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElses()
   * @generated
   * @ordered
   */
  protected EList<Statement> elses;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfExpressionImpl()
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
    return DmodelPackage.Literals.IF_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(Condition newCondition, NotificationChain msgs)
  {
    Condition oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmodelPackage.IF_EXPRESSION__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(Condition newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmodelPackage.IF_EXPRESSION__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmodelPackage.IF_EXPRESSION__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.IF_EXPRESSION__CONDITION, newCondition, newCondition));
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
      statements = new EObjectContainmentEList<Statement>(Statement.class, this, DmodelPackage.IF_EXPRESSION__STATEMENTS);
    }
    return statements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHasElseIf()
  {
    return hasElseIf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasElseIf(boolean newHasElseIf)
  {
    boolean oldHasElseIf = hasElseIf;
    hasElseIf = newHasElseIf;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.IF_EXPRESSION__HAS_ELSE_IF, oldHasElseIf, hasElseIf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfExpression getElseIf()
  {
    return elseIf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElseIf(IfExpression newElseIf, NotificationChain msgs)
  {
    IfExpression oldElseIf = elseIf;
    elseIf = newElseIf;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmodelPackage.IF_EXPRESSION__ELSE_IF, oldElseIf, newElseIf);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElseIf(IfExpression newElseIf)
  {
    if (newElseIf != elseIf)
    {
      NotificationChain msgs = null;
      if (elseIf != null)
        msgs = ((InternalEObject)elseIf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmodelPackage.IF_EXPRESSION__ELSE_IF, null, msgs);
      if (newElseIf != null)
        msgs = ((InternalEObject)newElseIf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmodelPackage.IF_EXPRESSION__ELSE_IF, null, msgs);
      msgs = basicSetElseIf(newElseIf, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.IF_EXPRESSION__ELSE_IF, newElseIf, newElseIf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getElses()
  {
    if (elses == null)
    {
      elses = new EObjectContainmentEList<Statement>(Statement.class, this, DmodelPackage.IF_EXPRESSION__ELSES);
    }
    return elses;
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
      case DmodelPackage.IF_EXPRESSION__CONDITION:
        return basicSetCondition(null, msgs);
      case DmodelPackage.IF_EXPRESSION__STATEMENTS:
        return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
      case DmodelPackage.IF_EXPRESSION__ELSE_IF:
        return basicSetElseIf(null, msgs);
      case DmodelPackage.IF_EXPRESSION__ELSES:
        return ((InternalEList<?>)getElses()).basicRemove(otherEnd, msgs);
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
      case DmodelPackage.IF_EXPRESSION__CONDITION:
        return getCondition();
      case DmodelPackage.IF_EXPRESSION__STATEMENTS:
        return getStatements();
      case DmodelPackage.IF_EXPRESSION__HAS_ELSE_IF:
        return isHasElseIf();
      case DmodelPackage.IF_EXPRESSION__ELSE_IF:
        return getElseIf();
      case DmodelPackage.IF_EXPRESSION__ELSES:
        return getElses();
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
      case DmodelPackage.IF_EXPRESSION__CONDITION:
        setCondition((Condition)newValue);
        return;
      case DmodelPackage.IF_EXPRESSION__STATEMENTS:
        getStatements().clear();
        getStatements().addAll((Collection<? extends Statement>)newValue);
        return;
      case DmodelPackage.IF_EXPRESSION__HAS_ELSE_IF:
        setHasElseIf((Boolean)newValue);
        return;
      case DmodelPackage.IF_EXPRESSION__ELSE_IF:
        setElseIf((IfExpression)newValue);
        return;
      case DmodelPackage.IF_EXPRESSION__ELSES:
        getElses().clear();
        getElses().addAll((Collection<? extends Statement>)newValue);
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
      case DmodelPackage.IF_EXPRESSION__CONDITION:
        setCondition((Condition)null);
        return;
      case DmodelPackage.IF_EXPRESSION__STATEMENTS:
        getStatements().clear();
        return;
      case DmodelPackage.IF_EXPRESSION__HAS_ELSE_IF:
        setHasElseIf(HAS_ELSE_IF_EDEFAULT);
        return;
      case DmodelPackage.IF_EXPRESSION__ELSE_IF:
        setElseIf((IfExpression)null);
        return;
      case DmodelPackage.IF_EXPRESSION__ELSES:
        getElses().clear();
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
      case DmodelPackage.IF_EXPRESSION__CONDITION:
        return condition != null;
      case DmodelPackage.IF_EXPRESSION__STATEMENTS:
        return statements != null && !statements.isEmpty();
      case DmodelPackage.IF_EXPRESSION__HAS_ELSE_IF:
        return hasElseIf != HAS_ELSE_IF_EDEFAULT;
      case DmodelPackage.IF_EXPRESSION__ELSE_IF:
        return elseIf != null;
      case DmodelPackage.IF_EXPRESSION__ELSES:
        return elses != null && !elses.isEmpty();
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
    result.append(" (hasElseIf: ");
    result.append(hasElseIf);
    result.append(')');
    return result.toString();
  }

} //IfExpressionImpl
