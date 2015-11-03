/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel.impl;

import datasem.xtext.kanban.domainmodel.kanbanmodel.Attribute;
import datasem.xtext.kanban.domainmodel.kanbanmodel.ClassAttributes;
import datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ClassAttributesImpl#getAgentAttributes <em>Agent Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassAttributesImpl extends MinimalEObjectImpl.Container implements ClassAttributes
{
  /**
   * The cached value of the '{@link #getAgentAttributes() <em>Agent Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAgentAttributes()
   * @generated
   * @ordered
   */
  protected EList<Attribute> agentAttributes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassAttributesImpl()
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
    return KanbanmodelPackage.Literals.CLASS_ATTRIBUTES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Attribute> getAgentAttributes()
  {
    if (agentAttributes == null)
    {
      agentAttributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, KanbanmodelPackage.CLASS_ATTRIBUTES__AGENT_ATTRIBUTES);
    }
    return agentAttributes;
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
      case KanbanmodelPackage.CLASS_ATTRIBUTES__AGENT_ATTRIBUTES:
        return ((InternalEList<?>)getAgentAttributes()).basicRemove(otherEnd, msgs);
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
      case KanbanmodelPackage.CLASS_ATTRIBUTES__AGENT_ATTRIBUTES:
        return getAgentAttributes();
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
      case KanbanmodelPackage.CLASS_ATTRIBUTES__AGENT_ATTRIBUTES:
        getAgentAttributes().clear();
        getAgentAttributes().addAll((Collection<? extends Attribute>)newValue);
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
      case KanbanmodelPackage.CLASS_ATTRIBUTES__AGENT_ATTRIBUTES:
        getAgentAttributes().clear();
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
      case KanbanmodelPackage.CLASS_ATTRIBUTES__AGENT_ATTRIBUTES:
        return agentAttributes != null && !agentAttributes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ClassAttributesImpl
