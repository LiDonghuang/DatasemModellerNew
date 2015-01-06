/**
 */
package ausim.xtext.kanban.domainmodel.kanbanmodel.util;

import ausim.xtext.kanban.domainmodel.kanbanmodel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage
 * @generated
 */
public class KanbanmodelSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static KanbanmodelPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KanbanmodelSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = KanbanmodelPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM:
      {
        KanbanSchedulingSystem kanbanSchedulingSystem = (KanbanSchedulingSystem)theEObject;
        T result = caseKanbanSchedulingSystem(kanbanSchedulingSystem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KanbanmodelPackage.TEAM:
      {
        Team team = (Team)theEObject;
        T result = caseTeam(team);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KanbanmodelPackage.SERVICE:
      {
        Service service = (Service)theEObject;
        T result = caseService(service);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KanbanmodelPackage.ASSET:
      {
        Asset asset = (Asset)theEObject;
        T result = caseAsset(asset);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KanbanmodelPackage.KSS_BLOCK:
      {
        KSSBlock kssBlock = (KSSBlock)theEObject;
        T result = caseKSSBlock(kssBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KanbanmodelPackage.MECHANISM:
      {
        Mechanism mechanism = (Mechanism)theEObject;
        T result = caseMechanism(mechanism);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KanbanmodelPackage.REQUIREMENT:
      {
        Requirement requirement = (Requirement)theEObject;
        T result = caseRequirement(requirement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KanbanmodelPackage.TASK:
      {
        Task task = (Task)theEObject;
        T result = caseTask(task);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KanbanmodelPackage.KANBAN_WORK_FLOW:
      {
        KanbanWorkFlow kanbanWorkFlow = (KanbanWorkFlow)theEObject;
        T result = caseKanbanWorkFlow(kanbanWorkFlow);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KanbanmodelPackage.CAPABILITY:
      {
        Capability capability = (Capability)theEObject;
        T result = caseCapability(capability);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Kanban Scheduling System</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Kanban Scheduling System</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKanbanSchedulingSystem(KanbanSchedulingSystem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Team</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Team</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTeam(Team object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Service</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseService(Service object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Asset</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Asset</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAsset(Asset object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>KSS Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>KSS Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKSSBlock(KSSBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mechanism</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mechanism</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMechanism(Mechanism object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequirement(Requirement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Task</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTask(Task object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Kanban Work Flow</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Kanban Work Flow</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKanbanWorkFlow(KanbanWorkFlow object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Capability</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Capability</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCapability(Capability object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //KanbanmodelSwitch
