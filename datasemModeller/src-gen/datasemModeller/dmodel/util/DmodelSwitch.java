/**
 */
package datasemModeller.dmodel.util;

import datasemModeller.dmodel.*;

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
 * @see datasemModeller.dmodel.DmodelPackage
 * @generated
 */
public class DmodelSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DmodelPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DmodelSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = DmodelPackage.eINSTANCE;
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
      case DmodelPackage.MODEL_BUILDER:
      {
        ModelBuilder modelBuilder = (ModelBuilder)theEObject;
        T result = caseModelBuilder(modelBuilder);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmodelPackage.USER_LIBRARIES:
      {
        UserLibraries userLibraries = (UserLibraries)theEObject;
        T result = caseUserLibraries(userLibraries);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmodelPackage.EXPERIMENT_MODEL:
      {
        ExperimentModel experimentModel = (ExperimentModel)theEObject;
        T result = caseExperimentModel(experimentModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmodelPackage.ABSTRACT_PARAMETER:
      {
        AbstractParameter abstractParameter = (AbstractParameter)theEObject;
        T result = caseAbstractParameter(abstractParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmodelPackage.NUM_EXPRESSION:
      {
        NumExpression numExpression = (NumExpression)theEObject;
        T result = caseNumExpression(numExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmodelPackage.DISTRIBUTION:
      {
        Distribution distribution = (Distribution)theEObject;
        T result = caseDistribution(distribution);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmodelPackage.GOVERNANCE_STRATEGY:
      {
        GovernanceStrategy governanceStrategy = (GovernanceStrategy)theEObject;
        T result = caseGovernanceStrategy(governanceStrategy);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmodelPackage.PULL_STRATEGY:
      {
        PullStrategy pullStrategy = (PullStrategy)theEObject;
        T result = casePullStrategy(pullStrategy);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmodelPackage.PUSH_STRATEGY:
      {
        PushStrategy pushStrategy = (PushStrategy)theEObject;
        T result = casePushStrategy(pushStrategy);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmodelPackage.MECHANISM:
      {
        Mechanism mechanism = (Mechanism)theEObject;
        T result = caseMechanism(mechanism);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmodelPackage.MECHANISM_ATTRIBUTE:
      {
        MechanismAttribute mechanismAttribute = (MechanismAttribute)theEObject;
        T result = caseMechanismAttribute(mechanismAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmodelPackage.WORK_ITEM_TYPE:
      {
        WorkItemType workItemType = (WorkItemType)theEObject;
        T result = caseWorkItemType(workItemType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmodelPackage.WORK_ITEM_NETWORK:
      {
        WorkItemNetwork workItemNetwork = (WorkItemNetwork)theEObject;
        T result = caseWorkItemNetwork(workItemNetwork);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmodelPackage.WORK_ITEM:
      {
        WorkItem workItem = (WorkItem)theEObject;
        T result = caseWorkItem(workItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmodelPackage.REQUIRED_SERVICE:
      {
        RequiredService requiredService = (RequiredService)theEObject;
        T result = caseRequiredService(requiredService);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmodelPackage.IMPACT:
      {
        Impact impact = (Impact)theEObject;
        T result = caseImpact(impact);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmodelPackage.SERVICE_PROVIDER_TYPE:
      {
        ServiceProviderType serviceProviderType = (ServiceProviderType)theEObject;
        T result = caseServiceProviderType(serviceProviderType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmodelPackage.SERVICE:
      {
        Service service = (Service)theEObject;
        T result = caseService(service);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmodelPackage.SERVICE_PROVIDER:
      {
        ServiceProvider serviceProvider = (ServiceProvider)theEObject;
        T result = caseServiceProvider(serviceProvider);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmodelPackage.ASSET:
      {
        Asset asset = (Asset)theEObject;
        T result = caseAsset(asset);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmodelPackage.SKILL:
      {
        Skill skill = (Skill)theEObject;
        T result = caseSkill(skill);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmodelPackage.EXPERIMENT_VARIABLE:
      {
        ExperimentVariable experimentVariable = (ExperimentVariable)theEObject;
        T result = caseExperimentVariable(experimentVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmodelPackage.WIN_REPLICATION:
      {
        WINReplication winReplication = (WINReplication)theEObject;
        T result = caseWINReplication(winReplication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Builder</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Builder</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelBuilder(ModelBuilder object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>User Libraries</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>User Libraries</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUserLibraries(UserLibraries object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Experiment Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Experiment Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExperimentModel(ExperimentModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractParameter(AbstractParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Num Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Num Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumExpression(NumExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Distribution</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Distribution</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDistribution(Distribution object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Governance Strategy</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Governance Strategy</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGovernanceStrategy(GovernanceStrategy object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pull Strategy</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pull Strategy</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePullStrategy(PullStrategy object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Push Strategy</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Push Strategy</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePushStrategy(PushStrategy object)
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
   * Returns the result of interpreting the object as an instance of '<em>Mechanism Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mechanism Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMechanismAttribute(MechanismAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Work Item Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Work Item Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWorkItemType(WorkItemType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Work Item Network</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Work Item Network</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWorkItemNetwork(WorkItemNetwork object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Work Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Work Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWorkItem(WorkItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Required Service</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Required Service</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequiredService(RequiredService object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Impact</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Impact</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImpact(Impact object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Service Provider Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Service Provider Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseServiceProviderType(ServiceProviderType object)
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
   * Returns the result of interpreting the object as an instance of '<em>Service Provider</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Service Provider</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseServiceProvider(ServiceProvider object)
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
   * Returns the result of interpreting the object as an instance of '<em>Skill</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Skill</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSkill(Skill object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Experiment Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Experiment Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExperimentVariable(ExperimentVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>WIN Replication</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>WIN Replication</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWINReplication(WINReplication object)
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

} //DmodelSwitch
