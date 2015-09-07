/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel.impl;

import datasem.xtext.kanban.domainmodel.kanbanmodel.AbstractParameter;
import datasem.xtext.kanban.domainmodel.kanbanmodel.Distribution;
import datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;

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
 * An implementation of the model object '<em><b>Distribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.DistributionImpl#isIsNormal <em>Is Normal</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.DistributionImpl#isIsUniform <em>Is Uniform</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.DistributionImpl#isIsExponential <em>Is Exponential</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.DistributionImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DistributionImpl extends MinimalEObjectImpl.Container implements Distribution
{
  /**
   * The default value of the '{@link #isIsNormal() <em>Is Normal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsNormal()
   * @generated
   * @ordered
   */
  protected static final boolean IS_NORMAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsNormal() <em>Is Normal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsNormal()
   * @generated
   * @ordered
   */
  protected boolean isNormal = IS_NORMAL_EDEFAULT;

  /**
   * The default value of the '{@link #isIsUniform() <em>Is Uniform</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsUniform()
   * @generated
   * @ordered
   */
  protected static final boolean IS_UNIFORM_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsUniform() <em>Is Uniform</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsUniform()
   * @generated
   * @ordered
   */
  protected boolean isUniform = IS_UNIFORM_EDEFAULT;

  /**
   * The default value of the '{@link #isIsExponential() <em>Is Exponential</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsExponential()
   * @generated
   * @ordered
   */
  protected static final boolean IS_EXPONENTIAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsExponential() <em>Is Exponential</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsExponential()
   * @generated
   * @ordered
   */
  protected boolean isExponential = IS_EXPONENTIAL_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<AbstractParameter> parameters;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DistributionImpl()
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
    return KanbanmodelPackage.Literals.DISTRIBUTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsNormal()
  {
    return isNormal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsNormal(boolean newIsNormal)
  {
    boolean oldIsNormal = isNormal;
    isNormal = newIsNormal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.DISTRIBUTION__IS_NORMAL, oldIsNormal, isNormal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsUniform()
  {
    return isUniform;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsUniform(boolean newIsUniform)
  {
    boolean oldIsUniform = isUniform;
    isUniform = newIsUniform;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.DISTRIBUTION__IS_UNIFORM, oldIsUniform, isUniform));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsExponential()
  {
    return isExponential;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsExponential(boolean newIsExponential)
  {
    boolean oldIsExponential = isExponential;
    isExponential = newIsExponential;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.DISTRIBUTION__IS_EXPONENTIAL, oldIsExponential, isExponential));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractParameter> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<AbstractParameter>(AbstractParameter.class, this, KanbanmodelPackage.DISTRIBUTION__PARAMETERS);
    }
    return parameters;
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
      case KanbanmodelPackage.DISTRIBUTION__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
      case KanbanmodelPackage.DISTRIBUTION__IS_NORMAL:
        return isIsNormal();
      case KanbanmodelPackage.DISTRIBUTION__IS_UNIFORM:
        return isIsUniform();
      case KanbanmodelPackage.DISTRIBUTION__IS_EXPONENTIAL:
        return isIsExponential();
      case KanbanmodelPackage.DISTRIBUTION__PARAMETERS:
        return getParameters();
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
      case KanbanmodelPackage.DISTRIBUTION__IS_NORMAL:
        setIsNormal((Boolean)newValue);
        return;
      case KanbanmodelPackage.DISTRIBUTION__IS_UNIFORM:
        setIsUniform((Boolean)newValue);
        return;
      case KanbanmodelPackage.DISTRIBUTION__IS_EXPONENTIAL:
        setIsExponential((Boolean)newValue);
        return;
      case KanbanmodelPackage.DISTRIBUTION__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends AbstractParameter>)newValue);
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
      case KanbanmodelPackage.DISTRIBUTION__IS_NORMAL:
        setIsNormal(IS_NORMAL_EDEFAULT);
        return;
      case KanbanmodelPackage.DISTRIBUTION__IS_UNIFORM:
        setIsUniform(IS_UNIFORM_EDEFAULT);
        return;
      case KanbanmodelPackage.DISTRIBUTION__IS_EXPONENTIAL:
        setIsExponential(IS_EXPONENTIAL_EDEFAULT);
        return;
      case KanbanmodelPackage.DISTRIBUTION__PARAMETERS:
        getParameters().clear();
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
      case KanbanmodelPackage.DISTRIBUTION__IS_NORMAL:
        return isNormal != IS_NORMAL_EDEFAULT;
      case KanbanmodelPackage.DISTRIBUTION__IS_UNIFORM:
        return isUniform != IS_UNIFORM_EDEFAULT;
      case KanbanmodelPackage.DISTRIBUTION__IS_EXPONENTIAL:
        return isExponential != IS_EXPONENTIAL_EDEFAULT;
      case KanbanmodelPackage.DISTRIBUTION__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
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
    result.append(" (isNormal: ");
    result.append(isNormal);
    result.append(", isUniform: ");
    result.append(isUniform);
    result.append(", isExponential: ");
    result.append(isExponential);
    result.append(')');
    return result.toString();
  }

} //DistributionImpl
