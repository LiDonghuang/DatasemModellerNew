/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel.impl;

import datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import datasem.xtext.kanban.domainmodel.kanbanmodel.Method;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.MethodImpl#getName <em>Name</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.MethodImpl#isFunctionMethod <em>Function Method</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.MethodImpl#getInputs <em>Inputs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodImpl extends MinimalEObjectImpl.Container implements Method
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
   * The default value of the '{@link #isFunctionMethod() <em>Function Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFunctionMethod()
   * @generated
   * @ordered
   */
  protected static final boolean FUNCTION_METHOD_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFunctionMethod() <em>Function Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFunctionMethod()
   * @generated
   * @ordered
   */
  protected boolean functionMethod = FUNCTION_METHOD_EDEFAULT;

  /**
   * The cached value of the '{@link #getInputs() <em>Inputs</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputs()
   * @generated
   * @ordered
   */
  protected EList<String> inputs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MethodImpl()
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
    return KanbanmodelPackage.Literals.METHOD;
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
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.METHOD__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isFunctionMethod()
  {
    return functionMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunctionMethod(boolean newFunctionMethod)
  {
    boolean oldFunctionMethod = functionMethod;
    functionMethod = newFunctionMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.METHOD__FUNCTION_METHOD, oldFunctionMethod, functionMethod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getInputs()
  {
    if (inputs == null)
    {
      inputs = new EDataTypeEList<String>(String.class, this, KanbanmodelPackage.METHOD__INPUTS);
    }
    return inputs;
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
      case KanbanmodelPackage.METHOD__NAME:
        return getName();
      case KanbanmodelPackage.METHOD__FUNCTION_METHOD:
        return isFunctionMethod();
      case KanbanmodelPackage.METHOD__INPUTS:
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
      case KanbanmodelPackage.METHOD__NAME:
        setName((String)newValue);
        return;
      case KanbanmodelPackage.METHOD__FUNCTION_METHOD:
        setFunctionMethod((Boolean)newValue);
        return;
      case KanbanmodelPackage.METHOD__INPUTS:
        getInputs().clear();
        getInputs().addAll((Collection<? extends String>)newValue);
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
      case KanbanmodelPackage.METHOD__NAME:
        setName(NAME_EDEFAULT);
        return;
      case KanbanmodelPackage.METHOD__FUNCTION_METHOD:
        setFunctionMethod(FUNCTION_METHOD_EDEFAULT);
        return;
      case KanbanmodelPackage.METHOD__INPUTS:
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
      case KanbanmodelPackage.METHOD__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case KanbanmodelPackage.METHOD__FUNCTION_METHOD:
        return functionMethod != FUNCTION_METHOD_EDEFAULT;
      case KanbanmodelPackage.METHOD__INPUTS:
        return inputs != null && !inputs.isEmpty();
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
    result.append(", functionMethod: ");
    result.append(functionMethod);
    result.append(", inputs: ");
    result.append(inputs);
    result.append(')');
    return result.toString();
  }

} //MethodImpl
