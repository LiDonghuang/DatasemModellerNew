/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel.util;

import datasem.xtext.kanban.domainmodel.kanbanmodel.*;

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
 * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage
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
      case KanbanmodelPackage.MODEL_BUILDER:
      {
        ModelBuilder modelBuilder = (ModelBuilder)theEObject;
        T result = caseModelBuilder(modelBuilder);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KanbanmodelPackage.EXPERIMENT_MODEL:
      {
        ExperimentModel experimentModel = (ExperimentModel)theEObject;
        T result = caseExperimentModel(experimentModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KanbanmodelPackage.SYSTEM_LIBRARIES:
      {
        SystemLibraries systemLibraries = (SystemLibraries)theEObject;
        T result = caseSystemLibraries(systemLibraries);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KanbanmodelPackage.USER_LIBRARIES:
      {
        UserLibraries userLibraries = (UserLibraries)theEObject;
        T result = caseUserLibraries(userLibraries);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KanbanmodelPackage.ABSTRACT_PARAMETER:
      {
        AbstractParameter abstractParameter = (AbstractParameter)theEObject;
        T result = caseAbstractParameter(abstractParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KanbanmodelPackage.NUM_EXPRESSION:
      {
        NumExpression numExpression = (NumExpression)theEObject;
        T result = caseNumExpression(numExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KanbanmodelPackage.OPERATOR:
      {
        Operator operator = (Operator)theEObject;
        T result = caseOperator(operator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KanbanmodelPackage.VARIABLE:
      {
        Variable variable = (Variable)theEObject;
        T result = caseVariable(variable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KanbanmodelPackage.DISTRIBUTION:
      {
        Distribution distribution = (Distribution)theEObject;
        T result = caseDistribution(distribution);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KanbanmodelPackage.EVENT_TYPE:
      {
        EventType eventType = (EventType)theEObject;
        T result = caseEventType(eventType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KanbanmodelPackage.CONDITION_TYPE:
      {
        ConditionType conditionType = (ConditionType)theEObject;
        T result = caseConditionType(conditionType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KanbanmodelPackage.TRANSITION_TYPE:
      {
        TransitionType transitionType = (TransitionType)theEObject;
        T result = caseTransitionType(transitionType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KanbanmodelPackage.PROCESS_MODEL:
      {
        ProcessModel processModel = (ProcessModel)theEObject;
        T result = caseProcessModel(processModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KanbanmodelPackage.EVENT:
      {
        Event event = (Event)theEObject;
        T result = caseEvent(event);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KanbanmodelPackage.CONDITION:
      {
        Condition condition = (Condition)theEObject;
        T result = caseCondition(condition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KanbanmodelPackage.TRANSITION:
      {
        Transition transition = (Transition)theEObject;
        T result = caseTransition(transition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KanbanmodelPackage.AGENT_ROLE_TYPE:
      {
        AgentRoleType agentRoleType = (AgentRoleType)theEObject;
        T result = caseAgentRoleType(agentRoleType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KanbanmodelPackage.WIN_REPLICATION:
      {
        WINReplication winReplication = (WINReplication)theEObject;
        T result = caseWINReplication(winReplication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KanbanmodelPackage.GOVERNANCE_STRATEGY:
      {
        GovernanceStrategy governanceStrategy = (GovernanceStrategy)theEObject;
        T result = caseGovernanceStrategy(governanceStrategy);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KanbanmodelPackage.WI_ACCEPTANCE:
      {
        WIAcceptance wiAcceptance = (WIAcceptance)theEObject;
        T result = caseWIAcceptance(wiAcceptance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KanbanmodelPackage.WI_SELECTION:
      {
        WISelection wiSelection = (WISelection)theEObject;
        T result = caseWISelection(wiSelection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KanbanmodelPackage.WI_ASSIGNMENT:
      {
        WIAssignment wiAssignment = (WIAssignment)theEObject;
        T result = caseWIAssignment(wiAssignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KanbanmodelPackage.RESOURCE_ALLOCATION:
      {
        ResourceAllocation resourceAllocation = (ResourceAllocation)theEObject;
        T result = caseResourceAllocation(resourceAllocation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KanbanmodelPackage.RESOURCE_OUTSOURCING:
      {
        ResourceOutsourcing resourceOutsourcing = (ResourceOutsourcing)theEObject;
        T result = caseResourceOutsourcing(resourceOutsourcing);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KanbanmodelPackage.WI_ACCEPTANCE_RULE_TYPE:
      {
        WIAcceptanceRuleType wiAcceptanceRuleType = (WIAcceptanceRuleType)theEObject;
        T result = caseWIAcceptanceRuleType(wiAcceptanceRuleType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KanbanmodelPackage.WI_SELECTION_RULE_TYPE:
      {
        WISelectionRuleType wiSelectionRuleType = (WISelectionRuleType)theEObject;
        T result = caseWISelectionRuleType(wiSelectionRuleType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KanbanmodelPackage.WI_ASSIGNMENT_RULE_TYPE:
      {
        WIAssignmentRuleType wiAssignmentRuleType = (WIAssignmentRuleType)theEObject;
        T result = caseWIAssignmentRuleType(wiAssignmentRuleType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KanbanmodelPackage.RESOURCE_ALLOCATION_RULE_TYPE:
      {
        ResourceAllocationRuleType resourceAllocationRuleType = (ResourceAllocationRuleType)theEObject;
        T result = caseResourceAllocationRuleType(resourceAllocationRuleType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KanbanmodelPackage.RESOURCE_OUTSOURCING_RULE_TYPE:
      {
        ResourceOutsourcingRuleType resourceOutsourcingRuleType = (ResourceOutsourcingRuleType)theEObject;
        T result = caseResourceOutsourcingRuleType(resourceOutsourcingRuleType);
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
      case KanbanmodelPackage.MECHANISM_ATTRIBUTE:
      {
        MechanismAttribute mechanismAttribute = (MechanismAttribute)theEObject;
        T result = caseMechanismAttribute(mechanismAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KanbanmodelPackage.WORK_SOURCE:
      {
        WorkSource workSource = (WorkSource)theEObject;
        T result = caseWorkSource(workSource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KanbanmodelPackage.WORK_ITEM_NETWORK:
      {
        WorkItemNetwork workItemNetwork = (WorkItemNetwork)theEObject;
        T result = caseWorkItemNetwork(workItemNetwork);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KanbanmodelPackage.WORK_ITEM:
      {
        WorkItem workItem = (WorkItem)theEObject;
        T result = caseWorkItem(workItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KanbanmodelPackage.CAUSAL_TRIGGER:
      {
        CausalTrigger causalTrigger = (CausalTrigger)theEObject;
        T result = caseCausalTrigger(causalTrigger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KanbanmodelPackage.WORK_ITEM_TYPE:
      {
        WorkItemType workItemType = (WorkItemType)theEObject;
        T result = caseWorkItemType(workItemType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KanbanmodelPackage.VALUE_FUNCTION:
      {
        ValueFunction valueFunction = (ValueFunction)theEObject;
        T result = caseValueFunction(valueFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KanbanmodelPackage.CLASS_OF_SERVICE:
      {
        ClassOfService classOfService = (ClassOfService)theEObject;
        T result = caseClassOfService(classOfService);
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
      case KanbanmodelPackage.SERVICE_PROVIDER:
      {
        ServiceProvider serviceProvider = (ServiceProvider)theEObject;
        T result = caseServiceProvider(serviceProvider);
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
      case KanbanmodelPackage.SKILL:
      {
        Skill skill = (Skill)theEObject;
        T result = caseSkill(skill);
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
   * Returns the result of interpreting the object as an instance of '<em>System Libraries</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>System Libraries</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSystemLibraries(SystemLibraries object)
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
   * Returns the result of interpreting the object as an instance of '<em>Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperator(Operator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable(Variable object)
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
   * Returns the result of interpreting the object as an instance of '<em>Event Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEventType(EventType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condition Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condition Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionType(ConditionType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transition Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transition Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransitionType(TransitionType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Process Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Process Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcessModel(ProcessModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvent(Event object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCondition(Condition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransition(Transition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Agent Role Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Agent Role Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAgentRoleType(AgentRoleType object)
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
   * Returns the result of interpreting the object as an instance of '<em>WI Acceptance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>WI Acceptance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWIAcceptance(WIAcceptance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>WI Selection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>WI Selection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWISelection(WISelection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>WI Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>WI Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWIAssignment(WIAssignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resource Allocation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resource Allocation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResourceAllocation(ResourceAllocation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resource Outsourcing</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resource Outsourcing</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResourceOutsourcing(ResourceOutsourcing object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>WI Acceptance Rule Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>WI Acceptance Rule Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWIAcceptanceRuleType(WIAcceptanceRuleType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>WI Selection Rule Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>WI Selection Rule Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWISelectionRuleType(WISelectionRuleType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>WI Assignment Rule Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>WI Assignment Rule Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWIAssignmentRuleType(WIAssignmentRuleType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resource Allocation Rule Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resource Allocation Rule Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResourceAllocationRuleType(ResourceAllocationRuleType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resource Outsourcing Rule Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resource Outsourcing Rule Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResourceOutsourcingRuleType(ResourceOutsourcingRuleType object)
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
   * Returns the result of interpreting the object as an instance of '<em>Work Source</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Work Source</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWorkSource(WorkSource object)
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
   * Returns the result of interpreting the object as an instance of '<em>Causal Trigger</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Causal Trigger</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCausalTrigger(CausalTrigger object)
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
   * Returns the result of interpreting the object as an instance of '<em>Value Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValueFunction(ValueFunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Of Service</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Of Service</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassOfService(ClassOfService object)
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
