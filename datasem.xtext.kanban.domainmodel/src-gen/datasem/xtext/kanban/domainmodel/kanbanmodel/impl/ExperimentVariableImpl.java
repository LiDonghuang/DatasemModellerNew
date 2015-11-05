/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel.impl;

import datasem.xtext.kanban.domainmodel.kanbanmodel.Distribution;
import datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentVariable;
import datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy;
import datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Experiment Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ExperimentVariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ExperimentVariableImpl#isBoolean <em>Boolean</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ExperimentVariableImpl#isBooleanValue <em>Boolean Value</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ExperimentVariableImpl#isNum <em>Num</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ExperimentVariableImpl#getNumValue <em>Num Value</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ExperimentVariableImpl#isDistribution <em>Distribution</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ExperimentVariableImpl#getNumDist <em>Num Dist</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ExperimentVariableImpl#isString <em>String</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ExperimentVariableImpl#getStringValue <em>String Value</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ExperimentVariableImpl#isStrategy <em>Strategy</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ExperimentVariableImpl#getStrategyValue <em>Strategy Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExperimentVariableImpl extends MinimalEObjectImpl.Container implements ExperimentVariable
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #isBoolean() <em>Boolean</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBoolean()
   * @generated
   * @ordered
   */
  protected static final boolean BOOLEAN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isBoolean() <em>Boolean</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBoolean()
   * @generated
   * @ordered
   */
  protected boolean boolean_ = BOOLEAN_EDEFAULT;

  /**
   * The default value of the '{@link #isBooleanValue() <em>Boolean Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBooleanValue()
   * @generated
   * @ordered
   */
  protected static final boolean BOOLEAN_VALUE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isBooleanValue() <em>Boolean Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBooleanValue()
   * @generated
   * @ordered
   */
  protected boolean booleanValue = BOOLEAN_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #isNum() <em>Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNum()
   * @generated
   * @ordered
   */
  protected static final boolean NUM_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNum() <em>Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNum()
   * @generated
   * @ordered
   */
  protected boolean num = NUM_EDEFAULT;

  /**
   * The default value of the '{@link #getNumValue() <em>Num Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumValue()
   * @generated
   * @ordered
   */
  protected static final String NUM_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNumValue() <em>Num Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumValue()
   * @generated
   * @ordered
   */
  protected String numValue = NUM_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #isDistribution() <em>Distribution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDistribution()
   * @generated
   * @ordered
   */
  protected static final boolean DISTRIBUTION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDistribution() <em>Distribution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDistribution()
   * @generated
   * @ordered
   */
  protected boolean distribution = DISTRIBUTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getNumDist() <em>Num Dist</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumDist()
   * @generated
   * @ordered
   */
  protected Distribution numDist;

  /**
   * The default value of the '{@link #isString() <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isString()
   * @generated
   * @ordered
   */
  protected static final boolean STRING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isString() <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isString()
   * @generated
   * @ordered
   */
  protected boolean string = STRING_EDEFAULT;

  /**
   * The default value of the '{@link #getStringValue() <em>String Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringValue()
   * @generated
   * @ordered
   */
  protected static final String STRING_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStringValue() <em>String Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringValue()
   * @generated
   * @ordered
   */
  protected String stringValue = STRING_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #isStrategy() <em>Strategy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStrategy()
   * @generated
   * @ordered
   */
  protected static final boolean STRATEGY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isStrategy() <em>Strategy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStrategy()
   * @generated
   * @ordered
   */
  protected boolean strategy = STRATEGY_EDEFAULT;

  /**
   * The cached value of the '{@link #getStrategyValue() <em>Strategy Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrategyValue()
   * @generated
   * @ordered
   */
  protected GovernanceStrategy strategyValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExperimentVariableImpl()
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
    return KanbanmodelPackage.Literals.EXPERIMENT_VARIABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.EXPERIMENT_VARIABLE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isBoolean()
  {
    return boolean_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBoolean(boolean newBoolean)
  {
    boolean oldBoolean = boolean_;
    boolean_ = newBoolean;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.EXPERIMENT_VARIABLE__BOOLEAN, oldBoolean, boolean_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isBooleanValue()
  {
    return booleanValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBooleanValue(boolean newBooleanValue)
  {
    boolean oldBooleanValue = booleanValue;
    booleanValue = newBooleanValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.EXPERIMENT_VARIABLE__BOOLEAN_VALUE, oldBooleanValue, booleanValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNum()
  {
    return num;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNum(boolean newNum)
  {
    boolean oldNum = num;
    num = newNum;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.EXPERIMENT_VARIABLE__NUM, oldNum, num));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNumValue()
  {
    return numValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumValue(String newNumValue)
  {
    String oldNumValue = numValue;
    numValue = newNumValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.EXPERIMENT_VARIABLE__NUM_VALUE, oldNumValue, numValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDistribution()
  {
    return distribution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDistribution(boolean newDistribution)
  {
    boolean oldDistribution = distribution;
    distribution = newDistribution;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.EXPERIMENT_VARIABLE__DISTRIBUTION, oldDistribution, distribution));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Distribution getNumDist()
  {
    return numDist;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNumDist(Distribution newNumDist, NotificationChain msgs)
  {
    Distribution oldNumDist = numDist;
    numDist = newNumDist;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.EXPERIMENT_VARIABLE__NUM_DIST, oldNumDist, newNumDist);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumDist(Distribution newNumDist)
  {
    if (newNumDist != numDist)
    {
      NotificationChain msgs = null;
      if (numDist != null)
        msgs = ((InternalEObject)numDist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.EXPERIMENT_VARIABLE__NUM_DIST, null, msgs);
      if (newNumDist != null)
        msgs = ((InternalEObject)newNumDist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.EXPERIMENT_VARIABLE__NUM_DIST, null, msgs);
      msgs = basicSetNumDist(newNumDist, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.EXPERIMENT_VARIABLE__NUM_DIST, newNumDist, newNumDist));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isString()
  {
    return string;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setString(boolean newString)
  {
    boolean oldString = string;
    string = newString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.EXPERIMENT_VARIABLE__STRING, oldString, string));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStringValue()
  {
    return stringValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStringValue(String newStringValue)
  {
    String oldStringValue = stringValue;
    stringValue = newStringValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.EXPERIMENT_VARIABLE__STRING_VALUE, oldStringValue, stringValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isStrategy()
  {
    return strategy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStrategy(boolean newStrategy)
  {
    boolean oldStrategy = strategy;
    strategy = newStrategy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.EXPERIMENT_VARIABLE__STRATEGY, oldStrategy, strategy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GovernanceStrategy getStrategyValue()
  {
    return strategyValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStrategyValue(GovernanceStrategy newStrategyValue, NotificationChain msgs)
  {
    GovernanceStrategy oldStrategyValue = strategyValue;
    strategyValue = newStrategyValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.EXPERIMENT_VARIABLE__STRATEGY_VALUE, oldStrategyValue, newStrategyValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStrategyValue(GovernanceStrategy newStrategyValue)
  {
    if (newStrategyValue != strategyValue)
    {
      NotificationChain msgs = null;
      if (strategyValue != null)
        msgs = ((InternalEObject)strategyValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.EXPERIMENT_VARIABLE__STRATEGY_VALUE, null, msgs);
      if (newStrategyValue != null)
        msgs = ((InternalEObject)newStrategyValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.EXPERIMENT_VARIABLE__STRATEGY_VALUE, null, msgs);
      msgs = basicSetStrategyValue(newStrategyValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.EXPERIMENT_VARIABLE__STRATEGY_VALUE, newStrategyValue, newStrategyValue));
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
      case KanbanmodelPackage.EXPERIMENT_VARIABLE__NUM_DIST:
        return basicSetNumDist(null, msgs);
      case KanbanmodelPackage.EXPERIMENT_VARIABLE__STRATEGY_VALUE:
        return basicSetStrategyValue(null, msgs);
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
      case KanbanmodelPackage.EXPERIMENT_VARIABLE__NAME:
        return getName();
      case KanbanmodelPackage.EXPERIMENT_VARIABLE__BOOLEAN:
        return isBoolean();
      case KanbanmodelPackage.EXPERIMENT_VARIABLE__BOOLEAN_VALUE:
        return isBooleanValue();
      case KanbanmodelPackage.EXPERIMENT_VARIABLE__NUM:
        return isNum();
      case KanbanmodelPackage.EXPERIMENT_VARIABLE__NUM_VALUE:
        return getNumValue();
      case KanbanmodelPackage.EXPERIMENT_VARIABLE__DISTRIBUTION:
        return isDistribution();
      case KanbanmodelPackage.EXPERIMENT_VARIABLE__NUM_DIST:
        return getNumDist();
      case KanbanmodelPackage.EXPERIMENT_VARIABLE__STRING:
        return isString();
      case KanbanmodelPackage.EXPERIMENT_VARIABLE__STRING_VALUE:
        return getStringValue();
      case KanbanmodelPackage.EXPERIMENT_VARIABLE__STRATEGY:
        return isStrategy();
      case KanbanmodelPackage.EXPERIMENT_VARIABLE__STRATEGY_VALUE:
        return getStrategyValue();
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
      case KanbanmodelPackage.EXPERIMENT_VARIABLE__NAME:
        setName((String)newValue);
        return;
      case KanbanmodelPackage.EXPERIMENT_VARIABLE__BOOLEAN:
        setBoolean((Boolean)newValue);
        return;
      case KanbanmodelPackage.EXPERIMENT_VARIABLE__BOOLEAN_VALUE:
        setBooleanValue((Boolean)newValue);
        return;
      case KanbanmodelPackage.EXPERIMENT_VARIABLE__NUM:
        setNum((Boolean)newValue);
        return;
      case KanbanmodelPackage.EXPERIMENT_VARIABLE__NUM_VALUE:
        setNumValue((String)newValue);
        return;
      case KanbanmodelPackage.EXPERIMENT_VARIABLE__DISTRIBUTION:
        setDistribution((Boolean)newValue);
        return;
      case KanbanmodelPackage.EXPERIMENT_VARIABLE__NUM_DIST:
        setNumDist((Distribution)newValue);
        return;
      case KanbanmodelPackage.EXPERIMENT_VARIABLE__STRING:
        setString((Boolean)newValue);
        return;
      case KanbanmodelPackage.EXPERIMENT_VARIABLE__STRING_VALUE:
        setStringValue((String)newValue);
        return;
      case KanbanmodelPackage.EXPERIMENT_VARIABLE__STRATEGY:
        setStrategy((Boolean)newValue);
        return;
      case KanbanmodelPackage.EXPERIMENT_VARIABLE__STRATEGY_VALUE:
        setStrategyValue((GovernanceStrategy)newValue);
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
      case KanbanmodelPackage.EXPERIMENT_VARIABLE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case KanbanmodelPackage.EXPERIMENT_VARIABLE__BOOLEAN:
        setBoolean(BOOLEAN_EDEFAULT);
        return;
      case KanbanmodelPackage.EXPERIMENT_VARIABLE__BOOLEAN_VALUE:
        setBooleanValue(BOOLEAN_VALUE_EDEFAULT);
        return;
      case KanbanmodelPackage.EXPERIMENT_VARIABLE__NUM:
        setNum(NUM_EDEFAULT);
        return;
      case KanbanmodelPackage.EXPERIMENT_VARIABLE__NUM_VALUE:
        setNumValue(NUM_VALUE_EDEFAULT);
        return;
      case KanbanmodelPackage.EXPERIMENT_VARIABLE__DISTRIBUTION:
        setDistribution(DISTRIBUTION_EDEFAULT);
        return;
      case KanbanmodelPackage.EXPERIMENT_VARIABLE__NUM_DIST:
        setNumDist((Distribution)null);
        return;
      case KanbanmodelPackage.EXPERIMENT_VARIABLE__STRING:
        setString(STRING_EDEFAULT);
        return;
      case KanbanmodelPackage.EXPERIMENT_VARIABLE__STRING_VALUE:
        setStringValue(STRING_VALUE_EDEFAULT);
        return;
      case KanbanmodelPackage.EXPERIMENT_VARIABLE__STRATEGY:
        setStrategy(STRATEGY_EDEFAULT);
        return;
      case KanbanmodelPackage.EXPERIMENT_VARIABLE__STRATEGY_VALUE:
        setStrategyValue((GovernanceStrategy)null);
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
      case KanbanmodelPackage.EXPERIMENT_VARIABLE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case KanbanmodelPackage.EXPERIMENT_VARIABLE__BOOLEAN:
        return boolean_ != BOOLEAN_EDEFAULT;
      case KanbanmodelPackage.EXPERIMENT_VARIABLE__BOOLEAN_VALUE:
        return booleanValue != BOOLEAN_VALUE_EDEFAULT;
      case KanbanmodelPackage.EXPERIMENT_VARIABLE__NUM:
        return num != NUM_EDEFAULT;
      case KanbanmodelPackage.EXPERIMENT_VARIABLE__NUM_VALUE:
        return NUM_VALUE_EDEFAULT == null ? numValue != null : !NUM_VALUE_EDEFAULT.equals(numValue);
      case KanbanmodelPackage.EXPERIMENT_VARIABLE__DISTRIBUTION:
        return distribution != DISTRIBUTION_EDEFAULT;
      case KanbanmodelPackage.EXPERIMENT_VARIABLE__NUM_DIST:
        return numDist != null;
      case KanbanmodelPackage.EXPERIMENT_VARIABLE__STRING:
        return string != STRING_EDEFAULT;
      case KanbanmodelPackage.EXPERIMENT_VARIABLE__STRING_VALUE:
        return STRING_VALUE_EDEFAULT == null ? stringValue != null : !STRING_VALUE_EDEFAULT.equals(stringValue);
      case KanbanmodelPackage.EXPERIMENT_VARIABLE__STRATEGY:
        return strategy != STRATEGY_EDEFAULT;
      case KanbanmodelPackage.EXPERIMENT_VARIABLE__STRATEGY_VALUE:
        return strategyValue != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", boolean: ");
    result.append(boolean_);
    result.append(", booleanValue: ");
    result.append(booleanValue);
    result.append(", num: ");
    result.append(num);
    result.append(", numValue: ");
    result.append(numValue);
    result.append(", distribution: ");
    result.append(distribution);
    result.append(", string: ");
    result.append(string);
    result.append(", stringValue: ");
    result.append(stringValue);
    result.append(", strategy: ");
    result.append(strategy);
    result.append(')');
    return result.toString();
  }

} //ExperimentVariableImpl
