/**
 */
package datasemModeller.dmodel.impl;

import datasemModeller.dmodel.Condition;
import datasemModeller.dmodel.DmodelPackage;
import datasemModeller.dmodel.Expression;
import datasemModeller.dmodel.Operator;
import datasemModeller.dmodel.VarExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasemModeller.dmodel.impl.ConditionImpl#getSubjective <em>Subjective</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.ConditionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.ConditionImpl#getObjective <em>Objective</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.ConditionImpl#isHasAnd <em>Has And</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.ConditionImpl#getAndCondition <em>And Condition</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.ConditionImpl#isHasOr <em>Has Or</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.ConditionImpl#getOrCondition <em>Or Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionImpl extends MinimalEObjectImpl.Container implements Condition
{
  /**
   * The cached value of the '{@link #getSubjective() <em>Subjective</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubjective()
   * @generated
   * @ordered
   */
  protected VarExpression subjective;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected Operator operator;

  /**
   * The cached value of the '{@link #getObjective() <em>Objective</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjective()
   * @generated
   * @ordered
   */
  protected Expression objective;

  /**
   * The default value of the '{@link #isHasAnd() <em>Has And</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasAnd()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_AND_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasAnd() <em>Has And</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasAnd()
   * @generated
   * @ordered
   */
  protected boolean hasAnd = HAS_AND_EDEFAULT;

  /**
   * The cached value of the '{@link #getAndCondition() <em>And Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAndCondition()
   * @generated
   * @ordered
   */
  protected Condition andCondition;

  /**
   * The default value of the '{@link #isHasOr() <em>Has Or</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasOr()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_OR_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasOr() <em>Has Or</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasOr()
   * @generated
   * @ordered
   */
  protected boolean hasOr = HAS_OR_EDEFAULT;

  /**
   * The cached value of the '{@link #getOrCondition() <em>Or Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrCondition()
   * @generated
   * @ordered
   */
  protected Condition orCondition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionImpl()
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
    return DmodelPackage.Literals.CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarExpression getSubjective()
  {
    return subjective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubjective(VarExpression newSubjective, NotificationChain msgs)
  {
    VarExpression oldSubjective = subjective;
    subjective = newSubjective;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmodelPackage.CONDITION__SUBJECTIVE, oldSubjective, newSubjective);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubjective(VarExpression newSubjective)
  {
    if (newSubjective != subjective)
    {
      NotificationChain msgs = null;
      if (subjective != null)
        msgs = ((InternalEObject)subjective).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmodelPackage.CONDITION__SUBJECTIVE, null, msgs);
      if (newSubjective != null)
        msgs = ((InternalEObject)newSubjective).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmodelPackage.CONDITION__SUBJECTIVE, null, msgs);
      msgs = basicSetSubjective(newSubjective, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.CONDITION__SUBJECTIVE, newSubjective, newSubjective));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operator getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOperator(Operator newOperator, NotificationChain msgs)
  {
    Operator oldOperator = operator;
    operator = newOperator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmodelPackage.CONDITION__OPERATOR, oldOperator, newOperator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(Operator newOperator)
  {
    if (newOperator != operator)
    {
      NotificationChain msgs = null;
      if (operator != null)
        msgs = ((InternalEObject)operator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmodelPackage.CONDITION__OPERATOR, null, msgs);
      if (newOperator != null)
        msgs = ((InternalEObject)newOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmodelPackage.CONDITION__OPERATOR, null, msgs);
      msgs = basicSetOperator(newOperator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.CONDITION__OPERATOR, newOperator, newOperator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getObjective()
  {
    return objective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetObjective(Expression newObjective, NotificationChain msgs)
  {
    Expression oldObjective = objective;
    objective = newObjective;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmodelPackage.CONDITION__OBJECTIVE, oldObjective, newObjective);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObjective(Expression newObjective)
  {
    if (newObjective != objective)
    {
      NotificationChain msgs = null;
      if (objective != null)
        msgs = ((InternalEObject)objective).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmodelPackage.CONDITION__OBJECTIVE, null, msgs);
      if (newObjective != null)
        msgs = ((InternalEObject)newObjective).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmodelPackage.CONDITION__OBJECTIVE, null, msgs);
      msgs = basicSetObjective(newObjective, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.CONDITION__OBJECTIVE, newObjective, newObjective));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHasAnd()
  {
    return hasAnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasAnd(boolean newHasAnd)
  {
    boolean oldHasAnd = hasAnd;
    hasAnd = newHasAnd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.CONDITION__HAS_AND, oldHasAnd, hasAnd));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition getAndCondition()
  {
    return andCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAndCondition(Condition newAndCondition, NotificationChain msgs)
  {
    Condition oldAndCondition = andCondition;
    andCondition = newAndCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmodelPackage.CONDITION__AND_CONDITION, oldAndCondition, newAndCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAndCondition(Condition newAndCondition)
  {
    if (newAndCondition != andCondition)
    {
      NotificationChain msgs = null;
      if (andCondition != null)
        msgs = ((InternalEObject)andCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmodelPackage.CONDITION__AND_CONDITION, null, msgs);
      if (newAndCondition != null)
        msgs = ((InternalEObject)newAndCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmodelPackage.CONDITION__AND_CONDITION, null, msgs);
      msgs = basicSetAndCondition(newAndCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.CONDITION__AND_CONDITION, newAndCondition, newAndCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHasOr()
  {
    return hasOr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasOr(boolean newHasOr)
  {
    boolean oldHasOr = hasOr;
    hasOr = newHasOr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.CONDITION__HAS_OR, oldHasOr, hasOr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition getOrCondition()
  {
    return orCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOrCondition(Condition newOrCondition, NotificationChain msgs)
  {
    Condition oldOrCondition = orCondition;
    orCondition = newOrCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmodelPackage.CONDITION__OR_CONDITION, oldOrCondition, newOrCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrCondition(Condition newOrCondition)
  {
    if (newOrCondition != orCondition)
    {
      NotificationChain msgs = null;
      if (orCondition != null)
        msgs = ((InternalEObject)orCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmodelPackage.CONDITION__OR_CONDITION, null, msgs);
      if (newOrCondition != null)
        msgs = ((InternalEObject)newOrCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmodelPackage.CONDITION__OR_CONDITION, null, msgs);
      msgs = basicSetOrCondition(newOrCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.CONDITION__OR_CONDITION, newOrCondition, newOrCondition));
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
      case DmodelPackage.CONDITION__SUBJECTIVE:
        return basicSetSubjective(null, msgs);
      case DmodelPackage.CONDITION__OPERATOR:
        return basicSetOperator(null, msgs);
      case DmodelPackage.CONDITION__OBJECTIVE:
        return basicSetObjective(null, msgs);
      case DmodelPackage.CONDITION__AND_CONDITION:
        return basicSetAndCondition(null, msgs);
      case DmodelPackage.CONDITION__OR_CONDITION:
        return basicSetOrCondition(null, msgs);
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
      case DmodelPackage.CONDITION__SUBJECTIVE:
        return getSubjective();
      case DmodelPackage.CONDITION__OPERATOR:
        return getOperator();
      case DmodelPackage.CONDITION__OBJECTIVE:
        return getObjective();
      case DmodelPackage.CONDITION__HAS_AND:
        return isHasAnd();
      case DmodelPackage.CONDITION__AND_CONDITION:
        return getAndCondition();
      case DmodelPackage.CONDITION__HAS_OR:
        return isHasOr();
      case DmodelPackage.CONDITION__OR_CONDITION:
        return getOrCondition();
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
      case DmodelPackage.CONDITION__SUBJECTIVE:
        setSubjective((VarExpression)newValue);
        return;
      case DmodelPackage.CONDITION__OPERATOR:
        setOperator((Operator)newValue);
        return;
      case DmodelPackage.CONDITION__OBJECTIVE:
        setObjective((Expression)newValue);
        return;
      case DmodelPackage.CONDITION__HAS_AND:
        setHasAnd((Boolean)newValue);
        return;
      case DmodelPackage.CONDITION__AND_CONDITION:
        setAndCondition((Condition)newValue);
        return;
      case DmodelPackage.CONDITION__HAS_OR:
        setHasOr((Boolean)newValue);
        return;
      case DmodelPackage.CONDITION__OR_CONDITION:
        setOrCondition((Condition)newValue);
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
      case DmodelPackage.CONDITION__SUBJECTIVE:
        setSubjective((VarExpression)null);
        return;
      case DmodelPackage.CONDITION__OPERATOR:
        setOperator((Operator)null);
        return;
      case DmodelPackage.CONDITION__OBJECTIVE:
        setObjective((Expression)null);
        return;
      case DmodelPackage.CONDITION__HAS_AND:
        setHasAnd(HAS_AND_EDEFAULT);
        return;
      case DmodelPackage.CONDITION__AND_CONDITION:
        setAndCondition((Condition)null);
        return;
      case DmodelPackage.CONDITION__HAS_OR:
        setHasOr(HAS_OR_EDEFAULT);
        return;
      case DmodelPackage.CONDITION__OR_CONDITION:
        setOrCondition((Condition)null);
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
      case DmodelPackage.CONDITION__SUBJECTIVE:
        return subjective != null;
      case DmodelPackage.CONDITION__OPERATOR:
        return operator != null;
      case DmodelPackage.CONDITION__OBJECTIVE:
        return objective != null;
      case DmodelPackage.CONDITION__HAS_AND:
        return hasAnd != HAS_AND_EDEFAULT;
      case DmodelPackage.CONDITION__AND_CONDITION:
        return andCondition != null;
      case DmodelPackage.CONDITION__HAS_OR:
        return hasOr != HAS_OR_EDEFAULT;
      case DmodelPackage.CONDITION__OR_CONDITION:
        return orCondition != null;
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
    result.append(" (hasAnd: ");
    result.append(hasAnd);
    result.append(", hasOr: ");
    result.append(hasOr);
    result.append(')');
    return result.toString();
  }

} //ConditionImpl
