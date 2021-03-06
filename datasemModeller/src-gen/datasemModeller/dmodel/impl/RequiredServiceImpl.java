/**
 */
package datasemModeller.dmodel.impl;

import datasemModeller.dmodel.AbstractParameter;
import datasemModeller.dmodel.DmodelPackage;
import datasemModeller.dmodel.RequiredService;
import datasemModeller.dmodel.Service;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Required Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasemModeller.dmodel.impl.RequiredServiceImpl#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.RequiredServiceImpl#getEfforts <em>Efforts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequiredServiceImpl extends MinimalEObjectImpl.Container implements RequiredService
{
  /**
   * The cached value of the '{@link #getServiceType() <em>Service Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceType()
   * @generated
   * @ordered
   */
  protected Service serviceType;

  /**
   * The cached value of the '{@link #getEfforts() <em>Efforts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEfforts()
   * @generated
   * @ordered
   */
  protected AbstractParameter efforts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RequiredServiceImpl()
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
    return DmodelPackage.Literals.REQUIRED_SERVICE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service getServiceType()
  {
    if (serviceType != null && serviceType.eIsProxy())
    {
      InternalEObject oldServiceType = (InternalEObject)serviceType;
      serviceType = (Service)eResolveProxy(oldServiceType);
      if (serviceType != oldServiceType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DmodelPackage.REQUIRED_SERVICE__SERVICE_TYPE, oldServiceType, serviceType));
      }
    }
    return serviceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service basicGetServiceType()
  {
    return serviceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setServiceType(Service newServiceType)
  {
    Service oldServiceType = serviceType;
    serviceType = newServiceType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.REQUIRED_SERVICE__SERVICE_TYPE, oldServiceType, serviceType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractParameter getEfforts()
  {
    return efforts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEfforts(AbstractParameter newEfforts, NotificationChain msgs)
  {
    AbstractParameter oldEfforts = efforts;
    efforts = newEfforts;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmodelPackage.REQUIRED_SERVICE__EFFORTS, oldEfforts, newEfforts);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEfforts(AbstractParameter newEfforts)
  {
    if (newEfforts != efforts)
    {
      NotificationChain msgs = null;
      if (efforts != null)
        msgs = ((InternalEObject)efforts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmodelPackage.REQUIRED_SERVICE__EFFORTS, null, msgs);
      if (newEfforts != null)
        msgs = ((InternalEObject)newEfforts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmodelPackage.REQUIRED_SERVICE__EFFORTS, null, msgs);
      msgs = basicSetEfforts(newEfforts, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.REQUIRED_SERVICE__EFFORTS, newEfforts, newEfforts));
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
      case DmodelPackage.REQUIRED_SERVICE__EFFORTS:
        return basicSetEfforts(null, msgs);
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
      case DmodelPackage.REQUIRED_SERVICE__SERVICE_TYPE:
        if (resolve) return getServiceType();
        return basicGetServiceType();
      case DmodelPackage.REQUIRED_SERVICE__EFFORTS:
        return getEfforts();
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
      case DmodelPackage.REQUIRED_SERVICE__SERVICE_TYPE:
        setServiceType((Service)newValue);
        return;
      case DmodelPackage.REQUIRED_SERVICE__EFFORTS:
        setEfforts((AbstractParameter)newValue);
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
      case DmodelPackage.REQUIRED_SERVICE__SERVICE_TYPE:
        setServiceType((Service)null);
        return;
      case DmodelPackage.REQUIRED_SERVICE__EFFORTS:
        setEfforts((AbstractParameter)null);
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
      case DmodelPackage.REQUIRED_SERVICE__SERVICE_TYPE:
        return serviceType != null;
      case DmodelPackage.REQUIRED_SERVICE__EFFORTS:
        return efforts != null;
    }
    return super.eIsSet(featureID);
  }

} //RequiredServiceImpl
