/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel.impl;

import datasem.xtext.kanban.domainmodel.kanbanmodel.Distribution;
import datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy;
import datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import datasem.xtext.kanban.domainmodel.kanbanmodel.Variable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.VariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.VariableImpl#isTypeInteger <em>Type Integer</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.VariableImpl#getIntValue <em>Int Value</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.VariableImpl#isTypeDouble <em>Type Double</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.VariableImpl#getDoubleValue <em>Double Value</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.VariableImpl#isTypeString <em>Type String</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.VariableImpl#getStringValue <em>String Value</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.VariableImpl#isTypeDistribution <em>Type Distribution</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.VariableImpl#getDistrbution <em>Distrbution</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.VariableImpl#isTypeStrategy <em>Type Strategy</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.VariableImpl#getStrategy <em>Strategy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableImpl extends MinimalEObjectImpl.Container implements Variable
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
   * The default value of the '{@link #isTypeInteger() <em>Type Integer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTypeInteger()
   * @generated
   * @ordered
   */
  protected static final boolean TYPE_INTEGER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTypeInteger() <em>Type Integer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTypeInteger()
   * @generated
   * @ordered
   */
  protected boolean typeInteger = TYPE_INTEGER_EDEFAULT;

  /**
   * The default value of the '{@link #getIntValue() <em>Int Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntValue()
   * @generated
   * @ordered
   */
  protected static final int INT_VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIntValue() <em>Int Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntValue()
   * @generated
   * @ordered
   */
  protected int intValue = INT_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #isTypeDouble() <em>Type Double</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTypeDouble()
   * @generated
   * @ordered
   */
  protected static final boolean TYPE_DOUBLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTypeDouble() <em>Type Double</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTypeDouble()
   * @generated
   * @ordered
   */
  protected boolean typeDouble = TYPE_DOUBLE_EDEFAULT;

  /**
   * The default value of the '{@link #getDoubleValue() <em>Double Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoubleValue()
   * @generated
   * @ordered
   */
  protected static final double DOUBLE_VALUE_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getDoubleValue() <em>Double Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoubleValue()
   * @generated
   * @ordered
   */
  protected double doubleValue = DOUBLE_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #isTypeString() <em>Type String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTypeString()
   * @generated
   * @ordered
   */
  protected static final boolean TYPE_STRING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTypeString() <em>Type String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTypeString()
   * @generated
   * @ordered
   */
  protected boolean typeString = TYPE_STRING_EDEFAULT;

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
   * The default value of the '{@link #isTypeDistribution() <em>Type Distribution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTypeDistribution()
   * @generated
   * @ordered
   */
  protected static final boolean TYPE_DISTRIBUTION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTypeDistribution() <em>Type Distribution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTypeDistribution()
   * @generated
   * @ordered
   */
  protected boolean typeDistribution = TYPE_DISTRIBUTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getDistrbution() <em>Distrbution</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDistrbution()
   * @generated
   * @ordered
   */
  protected Distribution distrbution;

  /**
   * The default value of the '{@link #isTypeStrategy() <em>Type Strategy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTypeStrategy()
   * @generated
   * @ordered
   */
  protected static final boolean TYPE_STRATEGY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTypeStrategy() <em>Type Strategy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTypeStrategy()
   * @generated
   * @ordered
   */
  protected boolean typeStrategy = TYPE_STRATEGY_EDEFAULT;

  /**
   * The cached value of the '{@link #getStrategy() <em>Strategy</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrategy()
   * @generated
   * @ordered
   */
  protected GovernanceStrategy strategy;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableImpl()
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
    return KanbanmodelPackage.Literals.VARIABLE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.VARIABLE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTypeInteger()
  {
    return typeInteger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeInteger(boolean newTypeInteger)
  {
    boolean oldTypeInteger = typeInteger;
    typeInteger = newTypeInteger;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.VARIABLE__TYPE_INTEGER, oldTypeInteger, typeInteger));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getIntValue()
  {
    return intValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIntValue(int newIntValue)
  {
    int oldIntValue = intValue;
    intValue = newIntValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.VARIABLE__INT_VALUE, oldIntValue, intValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTypeDouble()
  {
    return typeDouble;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeDouble(boolean newTypeDouble)
  {
    boolean oldTypeDouble = typeDouble;
    typeDouble = newTypeDouble;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.VARIABLE__TYPE_DOUBLE, oldTypeDouble, typeDouble));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getDoubleValue()
  {
    return doubleValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDoubleValue(double newDoubleValue)
  {
    double oldDoubleValue = doubleValue;
    doubleValue = newDoubleValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.VARIABLE__DOUBLE_VALUE, oldDoubleValue, doubleValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTypeString()
  {
    return typeString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeString(boolean newTypeString)
  {
    boolean oldTypeString = typeString;
    typeString = newTypeString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.VARIABLE__TYPE_STRING, oldTypeString, typeString));
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
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.VARIABLE__STRING_VALUE, oldStringValue, stringValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTypeDistribution()
  {
    return typeDistribution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeDistribution(boolean newTypeDistribution)
  {
    boolean oldTypeDistribution = typeDistribution;
    typeDistribution = newTypeDistribution;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.VARIABLE__TYPE_DISTRIBUTION, oldTypeDistribution, typeDistribution));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Distribution getDistrbution()
  {
    return distrbution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDistrbution(Distribution newDistrbution, NotificationChain msgs)
  {
    Distribution oldDistrbution = distrbution;
    distrbution = newDistrbution;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.VARIABLE__DISTRBUTION, oldDistrbution, newDistrbution);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDistrbution(Distribution newDistrbution)
  {
    if (newDistrbution != distrbution)
    {
      NotificationChain msgs = null;
      if (distrbution != null)
        msgs = ((InternalEObject)distrbution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.VARIABLE__DISTRBUTION, null, msgs);
      if (newDistrbution != null)
        msgs = ((InternalEObject)newDistrbution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.VARIABLE__DISTRBUTION, null, msgs);
      msgs = basicSetDistrbution(newDistrbution, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.VARIABLE__DISTRBUTION, newDistrbution, newDistrbution));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTypeStrategy()
  {
    return typeStrategy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeStrategy(boolean newTypeStrategy)
  {
    boolean oldTypeStrategy = typeStrategy;
    typeStrategy = newTypeStrategy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.VARIABLE__TYPE_STRATEGY, oldTypeStrategy, typeStrategy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GovernanceStrategy getStrategy()
  {
    if (strategy != null && strategy.eIsProxy())
    {
      InternalEObject oldStrategy = (InternalEObject)strategy;
      strategy = (GovernanceStrategy)eResolveProxy(oldStrategy);
      if (strategy != oldStrategy)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, KanbanmodelPackage.VARIABLE__STRATEGY, oldStrategy, strategy));
      }
    }
    return strategy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GovernanceStrategy basicGetStrategy()
  {
    return strategy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStrategy(GovernanceStrategy newStrategy)
  {
    GovernanceStrategy oldStrategy = strategy;
    strategy = newStrategy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.VARIABLE__STRATEGY, oldStrategy, strategy));
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
      case KanbanmodelPackage.VARIABLE__DISTRBUTION:
        return basicSetDistrbution(null, msgs);
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
      case KanbanmodelPackage.VARIABLE__NAME:
        return getName();
      case KanbanmodelPackage.VARIABLE__TYPE_INTEGER:
        return isTypeInteger();
      case KanbanmodelPackage.VARIABLE__INT_VALUE:
        return getIntValue();
      case KanbanmodelPackage.VARIABLE__TYPE_DOUBLE:
        return isTypeDouble();
      case KanbanmodelPackage.VARIABLE__DOUBLE_VALUE:
        return getDoubleValue();
      case KanbanmodelPackage.VARIABLE__TYPE_STRING:
        return isTypeString();
      case KanbanmodelPackage.VARIABLE__STRING_VALUE:
        return getStringValue();
      case KanbanmodelPackage.VARIABLE__TYPE_DISTRIBUTION:
        return isTypeDistribution();
      case KanbanmodelPackage.VARIABLE__DISTRBUTION:
        return getDistrbution();
      case KanbanmodelPackage.VARIABLE__TYPE_STRATEGY:
        return isTypeStrategy();
      case KanbanmodelPackage.VARIABLE__STRATEGY:
        if (resolve) return getStrategy();
        return basicGetStrategy();
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
      case KanbanmodelPackage.VARIABLE__NAME:
        setName((String)newValue);
        return;
      case KanbanmodelPackage.VARIABLE__TYPE_INTEGER:
        setTypeInteger((Boolean)newValue);
        return;
      case KanbanmodelPackage.VARIABLE__INT_VALUE:
        setIntValue((Integer)newValue);
        return;
      case KanbanmodelPackage.VARIABLE__TYPE_DOUBLE:
        setTypeDouble((Boolean)newValue);
        return;
      case KanbanmodelPackage.VARIABLE__DOUBLE_VALUE:
        setDoubleValue((Double)newValue);
        return;
      case KanbanmodelPackage.VARIABLE__TYPE_STRING:
        setTypeString((Boolean)newValue);
        return;
      case KanbanmodelPackage.VARIABLE__STRING_VALUE:
        setStringValue((String)newValue);
        return;
      case KanbanmodelPackage.VARIABLE__TYPE_DISTRIBUTION:
        setTypeDistribution((Boolean)newValue);
        return;
      case KanbanmodelPackage.VARIABLE__DISTRBUTION:
        setDistrbution((Distribution)newValue);
        return;
      case KanbanmodelPackage.VARIABLE__TYPE_STRATEGY:
        setTypeStrategy((Boolean)newValue);
        return;
      case KanbanmodelPackage.VARIABLE__STRATEGY:
        setStrategy((GovernanceStrategy)newValue);
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
      case KanbanmodelPackage.VARIABLE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case KanbanmodelPackage.VARIABLE__TYPE_INTEGER:
        setTypeInteger(TYPE_INTEGER_EDEFAULT);
        return;
      case KanbanmodelPackage.VARIABLE__INT_VALUE:
        setIntValue(INT_VALUE_EDEFAULT);
        return;
      case KanbanmodelPackage.VARIABLE__TYPE_DOUBLE:
        setTypeDouble(TYPE_DOUBLE_EDEFAULT);
        return;
      case KanbanmodelPackage.VARIABLE__DOUBLE_VALUE:
        setDoubleValue(DOUBLE_VALUE_EDEFAULT);
        return;
      case KanbanmodelPackage.VARIABLE__TYPE_STRING:
        setTypeString(TYPE_STRING_EDEFAULT);
        return;
      case KanbanmodelPackage.VARIABLE__STRING_VALUE:
        setStringValue(STRING_VALUE_EDEFAULT);
        return;
      case KanbanmodelPackage.VARIABLE__TYPE_DISTRIBUTION:
        setTypeDistribution(TYPE_DISTRIBUTION_EDEFAULT);
        return;
      case KanbanmodelPackage.VARIABLE__DISTRBUTION:
        setDistrbution((Distribution)null);
        return;
      case KanbanmodelPackage.VARIABLE__TYPE_STRATEGY:
        setTypeStrategy(TYPE_STRATEGY_EDEFAULT);
        return;
      case KanbanmodelPackage.VARIABLE__STRATEGY:
        setStrategy((GovernanceStrategy)null);
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
      case KanbanmodelPackage.VARIABLE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case KanbanmodelPackage.VARIABLE__TYPE_INTEGER:
        return typeInteger != TYPE_INTEGER_EDEFAULT;
      case KanbanmodelPackage.VARIABLE__INT_VALUE:
        return intValue != INT_VALUE_EDEFAULT;
      case KanbanmodelPackage.VARIABLE__TYPE_DOUBLE:
        return typeDouble != TYPE_DOUBLE_EDEFAULT;
      case KanbanmodelPackage.VARIABLE__DOUBLE_VALUE:
        return doubleValue != DOUBLE_VALUE_EDEFAULT;
      case KanbanmodelPackage.VARIABLE__TYPE_STRING:
        return typeString != TYPE_STRING_EDEFAULT;
      case KanbanmodelPackage.VARIABLE__STRING_VALUE:
        return STRING_VALUE_EDEFAULT == null ? stringValue != null : !STRING_VALUE_EDEFAULT.equals(stringValue);
      case KanbanmodelPackage.VARIABLE__TYPE_DISTRIBUTION:
        return typeDistribution != TYPE_DISTRIBUTION_EDEFAULT;
      case KanbanmodelPackage.VARIABLE__DISTRBUTION:
        return distrbution != null;
      case KanbanmodelPackage.VARIABLE__TYPE_STRATEGY:
        return typeStrategy != TYPE_STRATEGY_EDEFAULT;
      case KanbanmodelPackage.VARIABLE__STRATEGY:
        return strategy != null;
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
    result.append(", typeInteger: ");
    result.append(typeInteger);
    result.append(", intValue: ");
    result.append(intValue);
    result.append(", typeDouble: ");
    result.append(typeDouble);
    result.append(", doubleValue: ");
    result.append(doubleValue);
    result.append(", typeString: ");
    result.append(typeString);
    result.append(", stringValue: ");
    result.append(stringValue);
    result.append(", typeDistribution: ");
    result.append(typeDistribution);
    result.append(", typeStrategy: ");
    result.append(typeStrategy);
    result.append(')');
    return result.toString();
  }

} //VariableImpl
