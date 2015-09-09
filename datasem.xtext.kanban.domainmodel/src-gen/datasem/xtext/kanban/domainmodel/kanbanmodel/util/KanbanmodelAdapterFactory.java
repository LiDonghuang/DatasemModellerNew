/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel.util;

import datasem.xtext.kanban.domainmodel.kanbanmodel.AbstractParameter;
import datasem.xtext.kanban.domainmodel.kanbanmodel.AgentRoleType;
import datasem.xtext.kanban.domainmodel.kanbanmodel.Asset;
import datasem.xtext.kanban.domainmodel.kanbanmodel.CausalTrigger;
import datasem.xtext.kanban.domainmodel.kanbanmodel.ClassOfService;
import datasem.xtext.kanban.domainmodel.kanbanmodel.Condition;
import datasem.xtext.kanban.domainmodel.kanbanmodel.ConditionType;
import datasem.xtext.kanban.domainmodel.kanbanmodel.Distribution;
import datasem.xtext.kanban.domainmodel.kanbanmodel.Event;
import datasem.xtext.kanban.domainmodel.kanbanmodel.EventType;
import datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentModel;
import datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy;
import datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import datasem.xtext.kanban.domainmodel.kanbanmodel.Mechanism;
import datasem.xtext.kanban.domainmodel.kanbanmodel.MechanismAttribute;
import datasem.xtext.kanban.domainmodel.kanbanmodel.ModelBuilder;
import datasem.xtext.kanban.domainmodel.kanbanmodel.NumExpression;
import datasem.xtext.kanban.domainmodel.kanbanmodel.Operator;
import datasem.xtext.kanban.domainmodel.kanbanmodel.ProcessAttribute;
import datasem.xtext.kanban.domainmodel.kanbanmodel.ProcessModel;
import datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceAllocation;
import datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceAllocationRuleType;
import datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceOutsourcing;
import datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceOutsourcingRuleType;
import datasem.xtext.kanban.domainmodel.kanbanmodel.Service;
import datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider;
import datasem.xtext.kanban.domainmodel.kanbanmodel.Skill;
import datasem.xtext.kanban.domainmodel.kanbanmodel.SystemLibraries;
import datasem.xtext.kanban.domainmodel.kanbanmodel.Transition;
import datasem.xtext.kanban.domainmodel.kanbanmodel.TransitionType;
import datasem.xtext.kanban.domainmodel.kanbanmodel.UserLibraries;
import datasem.xtext.kanban.domainmodel.kanbanmodel.ValueFunction;
import datasem.xtext.kanban.domainmodel.kanbanmodel.Variable;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptance;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptanceRuleType;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WIAssignment;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WIAssignmentRuleType;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WINReplication;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WISelection;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WISelectionRuleType;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemNetwork;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemType;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WorkSource;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage
 * @generated
 */
public class KanbanmodelAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static KanbanmodelPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KanbanmodelAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = KanbanmodelPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected KanbanmodelSwitch<Adapter> modelSwitch =
    new KanbanmodelSwitch<Adapter>()
    {
      @Override
      public Adapter caseModelBuilder(ModelBuilder object)
      {
        return createModelBuilderAdapter();
      }
      @Override
      public Adapter caseExperimentModel(ExperimentModel object)
      {
        return createExperimentModelAdapter();
      }
      @Override
      public Adapter caseSystemLibraries(SystemLibraries object)
      {
        return createSystemLibrariesAdapter();
      }
      @Override
      public Adapter caseUserLibraries(UserLibraries object)
      {
        return createUserLibrariesAdapter();
      }
      @Override
      public Adapter caseAbstractParameter(AbstractParameter object)
      {
        return createAbstractParameterAdapter();
      }
      @Override
      public Adapter caseNumExpression(NumExpression object)
      {
        return createNumExpressionAdapter();
      }
      @Override
      public Adapter caseOperator(Operator object)
      {
        return createOperatorAdapter();
      }
      @Override
      public Adapter caseVariable(Variable object)
      {
        return createVariableAdapter();
      }
      @Override
      public Adapter caseDistribution(Distribution object)
      {
        return createDistributionAdapter();
      }
      @Override
      public Adapter caseEventType(EventType object)
      {
        return createEventTypeAdapter();
      }
      @Override
      public Adapter caseConditionType(ConditionType object)
      {
        return createConditionTypeAdapter();
      }
      @Override
      public Adapter caseTransitionType(TransitionType object)
      {
        return createTransitionTypeAdapter();
      }
      @Override
      public Adapter caseProcessModel(ProcessModel object)
      {
        return createProcessModelAdapter();
      }
      @Override
      public Adapter caseEvent(Event object)
      {
        return createEventAdapter();
      }
      @Override
      public Adapter caseCondition(Condition object)
      {
        return createConditionAdapter();
      }
      @Override
      public Adapter caseTransition(Transition object)
      {
        return createTransitionAdapter();
      }
      @Override
      public Adapter caseAgentRoleType(AgentRoleType object)
      {
        return createAgentRoleTypeAdapter();
      }
      @Override
      public Adapter caseWINReplication(WINReplication object)
      {
        return createWINReplicationAdapter();
      }
      @Override
      public Adapter caseGovernanceStrategy(GovernanceStrategy object)
      {
        return createGovernanceStrategyAdapter();
      }
      @Override
      public Adapter caseWIAcceptance(WIAcceptance object)
      {
        return createWIAcceptanceAdapter();
      }
      @Override
      public Adapter caseWISelection(WISelection object)
      {
        return createWISelectionAdapter();
      }
      @Override
      public Adapter caseWIAssignment(WIAssignment object)
      {
        return createWIAssignmentAdapter();
      }
      @Override
      public Adapter caseResourceAllocation(ResourceAllocation object)
      {
        return createResourceAllocationAdapter();
      }
      @Override
      public Adapter caseResourceOutsourcing(ResourceOutsourcing object)
      {
        return createResourceOutsourcingAdapter();
      }
      @Override
      public Adapter caseWIAcceptanceRuleType(WIAcceptanceRuleType object)
      {
        return createWIAcceptanceRuleTypeAdapter();
      }
      @Override
      public Adapter caseWISelectionRuleType(WISelectionRuleType object)
      {
        return createWISelectionRuleTypeAdapter();
      }
      @Override
      public Adapter caseWIAssignmentRuleType(WIAssignmentRuleType object)
      {
        return createWIAssignmentRuleTypeAdapter();
      }
      @Override
      public Adapter caseResourceAllocationRuleType(ResourceAllocationRuleType object)
      {
        return createResourceAllocationRuleTypeAdapter();
      }
      @Override
      public Adapter caseResourceOutsourcingRuleType(ResourceOutsourcingRuleType object)
      {
        return createResourceOutsourcingRuleTypeAdapter();
      }
      @Override
      public Adapter caseMechanism(Mechanism object)
      {
        return createMechanismAdapter();
      }
      @Override
      public Adapter caseMechanismAttribute(MechanismAttribute object)
      {
        return createMechanismAttributeAdapter();
      }
      @Override
      public Adapter caseProcess(datasem.xtext.kanban.domainmodel.kanbanmodel.Process object)
      {
        return createProcessAdapter();
      }
      @Override
      public Adapter caseProcessAttribute(ProcessAttribute object)
      {
        return createProcessAttributeAdapter();
      }
      @Override
      public Adapter caseWorkSource(WorkSource object)
      {
        return createWorkSourceAdapter();
      }
      @Override
      public Adapter caseWorkItemNetwork(WorkItemNetwork object)
      {
        return createWorkItemNetworkAdapter();
      }
      @Override
      public Adapter caseWorkItem(WorkItem object)
      {
        return createWorkItemAdapter();
      }
      @Override
      public Adapter caseCausalTrigger(CausalTrigger object)
      {
        return createCausalTriggerAdapter();
      }
      @Override
      public Adapter caseWorkItemType(WorkItemType object)
      {
        return createWorkItemTypeAdapter();
      }
      @Override
      public Adapter caseValueFunction(ValueFunction object)
      {
        return createValueFunctionAdapter();
      }
      @Override
      public Adapter caseClassOfService(ClassOfService object)
      {
        return createClassOfServiceAdapter();
      }
      @Override
      public Adapter caseService(Service object)
      {
        return createServiceAdapter();
      }
      @Override
      public Adapter caseServiceProvider(ServiceProvider object)
      {
        return createServiceProviderAdapter();
      }
      @Override
      public Adapter caseAsset(Asset object)
      {
        return createAssetAdapter();
      }
      @Override
      public Adapter caseSkill(Skill object)
      {
        return createSkillAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ModelBuilder <em>Model Builder</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ModelBuilder
   * @generated
   */
  public Adapter createModelBuilderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentModel <em>Experiment Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentModel
   * @generated
   */
  public Adapter createExperimentModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.SystemLibraries <em>System Libraries</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.SystemLibraries
   * @generated
   */
  public Adapter createSystemLibrariesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.UserLibraries <em>User Libraries</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.UserLibraries
   * @generated
   */
  public Adapter createUserLibrariesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.AbstractParameter <em>Abstract Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.AbstractParameter
   * @generated
   */
  public Adapter createAbstractParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.NumExpression <em>Num Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.NumExpression
   * @generated
   */
  public Adapter createNumExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Operator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Operator
   * @generated
   */
  public Adapter createOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Variable
   * @generated
   */
  public Adapter createVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Distribution <em>Distribution</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Distribution
   * @generated
   */
  public Adapter createDistributionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.EventType <em>Event Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.EventType
   * @generated
   */
  public Adapter createEventTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ConditionType <em>Condition Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ConditionType
   * @generated
   */
  public Adapter createConditionTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.TransitionType <em>Transition Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.TransitionType
   * @generated
   */
  public Adapter createTransitionTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ProcessModel <em>Process Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ProcessModel
   * @generated
   */
  public Adapter createProcessModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Event
   * @generated
   */
  public Adapter createEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Condition
   * @generated
   */
  public Adapter createConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Transition
   * @generated
   */
  public Adapter createTransitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.AgentRoleType <em>Agent Role Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.AgentRoleType
   * @generated
   */
  public Adapter createAgentRoleTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WINReplication <em>WIN Replication</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WINReplication
   * @generated
   */
  public Adapter createWINReplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy <em>Governance Strategy</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy
   * @generated
   */
  public Adapter createGovernanceStrategyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptance <em>WI Acceptance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptance
   * @generated
   */
  public Adapter createWIAcceptanceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WISelection <em>WI Selection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WISelection
   * @generated
   */
  public Adapter createWISelectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WIAssignment <em>WI Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WIAssignment
   * @generated
   */
  public Adapter createWIAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceAllocation <em>Resource Allocation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceAllocation
   * @generated
   */
  public Adapter createResourceAllocationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceOutsourcing <em>Resource Outsourcing</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceOutsourcing
   * @generated
   */
  public Adapter createResourceOutsourcingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptanceRuleType <em>WI Acceptance Rule Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptanceRuleType
   * @generated
   */
  public Adapter createWIAcceptanceRuleTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WISelectionRuleType <em>WI Selection Rule Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WISelectionRuleType
   * @generated
   */
  public Adapter createWISelectionRuleTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WIAssignmentRuleType <em>WI Assignment Rule Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WIAssignmentRuleType
   * @generated
   */
  public Adapter createWIAssignmentRuleTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceAllocationRuleType <em>Resource Allocation Rule Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceAllocationRuleType
   * @generated
   */
  public Adapter createResourceAllocationRuleTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceOutsourcingRuleType <em>Resource Outsourcing Rule Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceOutsourcingRuleType
   * @generated
   */
  public Adapter createResourceOutsourcingRuleTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Mechanism <em>Mechanism</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Mechanism
   * @generated
   */
  public Adapter createMechanismAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.MechanismAttribute <em>Mechanism Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.MechanismAttribute
   * @generated
   */
  public Adapter createMechanismAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Process <em>Process</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Process
   * @generated
   */
  public Adapter createProcessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ProcessAttribute <em>Process Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ProcessAttribute
   * @generated
   */
  public Adapter createProcessAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkSource <em>Work Source</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkSource
   * @generated
   */
  public Adapter createWorkSourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemNetwork <em>Work Item Network</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemNetwork
   * @generated
   */
  public Adapter createWorkItemNetworkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem <em>Work Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem
   * @generated
   */
  public Adapter createWorkItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.CausalTrigger <em>Causal Trigger</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.CausalTrigger
   * @generated
   */
  public Adapter createCausalTriggerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemType <em>Work Item Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemType
   * @generated
   */
  public Adapter createWorkItemTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ValueFunction <em>Value Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ValueFunction
   * @generated
   */
  public Adapter createValueFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ClassOfService <em>Class Of Service</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ClassOfService
   * @generated
   */
  public Adapter createClassOfServiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Service
   * @generated
   */
  public Adapter createServiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider <em>Service Provider</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider
   * @generated
   */
  public Adapter createServiceProviderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Asset <em>Asset</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Asset
   * @generated
   */
  public Adapter createAssetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Skill <em>Skill</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Skill
   * @generated
   */
  public Adapter createSkillAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //KanbanmodelAdapterFactory
