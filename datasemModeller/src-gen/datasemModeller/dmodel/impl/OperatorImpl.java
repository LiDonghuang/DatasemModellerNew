/**
 */
package datasemModeller.dmodel.impl;

import datasemModeller.dmodel.DmodelPackage;
import datasemModeller.dmodel.Operator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasemModeller.dmodel.impl.OperatorImpl#isEqualTo <em>Equal To</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.OperatorImpl#isLargerThan <em>Larger Than</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.OperatorImpl#isSmallerThan <em>Smaller Than</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.OperatorImpl#isLargerOrEqualTo <em>Larger Or Equal To</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.OperatorImpl#isSmallerOrEqualTo <em>Smaller Or Equal To</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.OperatorImpl#isNotEqualTo <em>Not Equal To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperatorImpl extends MinimalEObjectImpl.Container implements Operator
{
  /**
   * The default value of the '{@link #isEqualTo() <em>Equal To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEqualTo()
   * @generated
   * @ordered
   */
  protected static final boolean EQUAL_TO_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEqualTo() <em>Equal To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEqualTo()
   * @generated
   * @ordered
   */
  protected boolean equalTo = EQUAL_TO_EDEFAULT;

  /**
   * The default value of the '{@link #isLargerThan() <em>Larger Than</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLargerThan()
   * @generated
   * @ordered
   */
  protected static final boolean LARGER_THAN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isLargerThan() <em>Larger Than</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLargerThan()
   * @generated
   * @ordered
   */
  protected boolean largerThan = LARGER_THAN_EDEFAULT;

  /**
   * The default value of the '{@link #isSmallerThan() <em>Smaller Than</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSmallerThan()
   * @generated
   * @ordered
   */
  protected static final boolean SMALLER_THAN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSmallerThan() <em>Smaller Than</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSmallerThan()
   * @generated
   * @ordered
   */
  protected boolean smallerThan = SMALLER_THAN_EDEFAULT;

  /**
   * The default value of the '{@link #isLargerOrEqualTo() <em>Larger Or Equal To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLargerOrEqualTo()
   * @generated
   * @ordered
   */
  protected static final boolean LARGER_OR_EQUAL_TO_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isLargerOrEqualTo() <em>Larger Or Equal To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLargerOrEqualTo()
   * @generated
   * @ordered
   */
  protected boolean largerOrEqualTo = LARGER_OR_EQUAL_TO_EDEFAULT;

  /**
   * The default value of the '{@link #isSmallerOrEqualTo() <em>Smaller Or Equal To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSmallerOrEqualTo()
   * @generated
   * @ordered
   */
  protected static final boolean SMALLER_OR_EQUAL_TO_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSmallerOrEqualTo() <em>Smaller Or Equal To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSmallerOrEqualTo()
   * @generated
   * @ordered
   */
  protected boolean smallerOrEqualTo = SMALLER_OR_EQUAL_TO_EDEFAULT;

  /**
   * The default value of the '{@link #isNotEqualTo() <em>Not Equal To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNotEqualTo()
   * @generated
   * @ordered
   */
  protected static final boolean NOT_EQUAL_TO_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNotEqualTo() <em>Not Equal To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNotEqualTo()
   * @generated
   * @ordered
   */
  protected boolean notEqualTo = NOT_EQUAL_TO_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperatorImpl()
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
    return DmodelPackage.Literals.OPERATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEqualTo()
  {
    return equalTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEqualTo(boolean newEqualTo)
  {
    boolean oldEqualTo = equalTo;
    equalTo = newEqualTo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.OPERATOR__EQUAL_TO, oldEqualTo, equalTo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isLargerThan()
  {
    return largerThan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLargerThan(boolean newLargerThan)
  {
    boolean oldLargerThan = largerThan;
    largerThan = newLargerThan;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.OPERATOR__LARGER_THAN, oldLargerThan, largerThan));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSmallerThan()
  {
    return smallerThan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSmallerThan(boolean newSmallerThan)
  {
    boolean oldSmallerThan = smallerThan;
    smallerThan = newSmallerThan;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.OPERATOR__SMALLER_THAN, oldSmallerThan, smallerThan));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isLargerOrEqualTo()
  {
    return largerOrEqualTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLargerOrEqualTo(boolean newLargerOrEqualTo)
  {
    boolean oldLargerOrEqualTo = largerOrEqualTo;
    largerOrEqualTo = newLargerOrEqualTo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.OPERATOR__LARGER_OR_EQUAL_TO, oldLargerOrEqualTo, largerOrEqualTo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSmallerOrEqualTo()
  {
    return smallerOrEqualTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSmallerOrEqualTo(boolean newSmallerOrEqualTo)
  {
    boolean oldSmallerOrEqualTo = smallerOrEqualTo;
    smallerOrEqualTo = newSmallerOrEqualTo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.OPERATOR__SMALLER_OR_EQUAL_TO, oldSmallerOrEqualTo, smallerOrEqualTo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNotEqualTo()
  {
    return notEqualTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNotEqualTo(boolean newNotEqualTo)
  {
    boolean oldNotEqualTo = notEqualTo;
    notEqualTo = newNotEqualTo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.OPERATOR__NOT_EQUAL_TO, oldNotEqualTo, notEqualTo));
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
      case DmodelPackage.OPERATOR__EQUAL_TO:
        return isEqualTo();
      case DmodelPackage.OPERATOR__LARGER_THAN:
        return isLargerThan();
      case DmodelPackage.OPERATOR__SMALLER_THAN:
        return isSmallerThan();
      case DmodelPackage.OPERATOR__LARGER_OR_EQUAL_TO:
        return isLargerOrEqualTo();
      case DmodelPackage.OPERATOR__SMALLER_OR_EQUAL_TO:
        return isSmallerOrEqualTo();
      case DmodelPackage.OPERATOR__NOT_EQUAL_TO:
        return isNotEqualTo();
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
      case DmodelPackage.OPERATOR__EQUAL_TO:
        setEqualTo((Boolean)newValue);
        return;
      case DmodelPackage.OPERATOR__LARGER_THAN:
        setLargerThan((Boolean)newValue);
        return;
      case DmodelPackage.OPERATOR__SMALLER_THAN:
        setSmallerThan((Boolean)newValue);
        return;
      case DmodelPackage.OPERATOR__LARGER_OR_EQUAL_TO:
        setLargerOrEqualTo((Boolean)newValue);
        return;
      case DmodelPackage.OPERATOR__SMALLER_OR_EQUAL_TO:
        setSmallerOrEqualTo((Boolean)newValue);
        return;
      case DmodelPackage.OPERATOR__NOT_EQUAL_TO:
        setNotEqualTo((Boolean)newValue);
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
      case DmodelPackage.OPERATOR__EQUAL_TO:
        setEqualTo(EQUAL_TO_EDEFAULT);
        return;
      case DmodelPackage.OPERATOR__LARGER_THAN:
        setLargerThan(LARGER_THAN_EDEFAULT);
        return;
      case DmodelPackage.OPERATOR__SMALLER_THAN:
        setSmallerThan(SMALLER_THAN_EDEFAULT);
        return;
      case DmodelPackage.OPERATOR__LARGER_OR_EQUAL_TO:
        setLargerOrEqualTo(LARGER_OR_EQUAL_TO_EDEFAULT);
        return;
      case DmodelPackage.OPERATOR__SMALLER_OR_EQUAL_TO:
        setSmallerOrEqualTo(SMALLER_OR_EQUAL_TO_EDEFAULT);
        return;
      case DmodelPackage.OPERATOR__NOT_EQUAL_TO:
        setNotEqualTo(NOT_EQUAL_TO_EDEFAULT);
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
      case DmodelPackage.OPERATOR__EQUAL_TO:
        return equalTo != EQUAL_TO_EDEFAULT;
      case DmodelPackage.OPERATOR__LARGER_THAN:
        return largerThan != LARGER_THAN_EDEFAULT;
      case DmodelPackage.OPERATOR__SMALLER_THAN:
        return smallerThan != SMALLER_THAN_EDEFAULT;
      case DmodelPackage.OPERATOR__LARGER_OR_EQUAL_TO:
        return largerOrEqualTo != LARGER_OR_EQUAL_TO_EDEFAULT;
      case DmodelPackage.OPERATOR__SMALLER_OR_EQUAL_TO:
        return smallerOrEqualTo != SMALLER_OR_EQUAL_TO_EDEFAULT;
      case DmodelPackage.OPERATOR__NOT_EQUAL_TO:
        return notEqualTo != NOT_EQUAL_TO_EDEFAULT;
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
    result.append(" (equalTo: ");
    result.append(equalTo);
    result.append(", largerThan: ");
    result.append(largerThan);
    result.append(", smallerThan: ");
    result.append(smallerThan);
    result.append(", largerOrEqualTo: ");
    result.append(largerOrEqualTo);
    result.append(", smallerOrEqualTo: ");
    result.append(smallerOrEqualTo);
    result.append(", notEqualTo: ");
    result.append(notEqualTo);
    result.append(')');
    return result.toString();
  }

} //OperatorImpl
