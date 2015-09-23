/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel.impl;

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
import datasem.xtext.kanban.domainmodel.kanbanmodel.Impact;
import datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelFactory;
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KanbanmodelFactoryImpl extends EFactoryImpl implements KanbanmodelFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static KanbanmodelFactory init()
  {
    try
    {
      KanbanmodelFactory theKanbanmodelFactory = (KanbanmodelFactory)EPackage.Registry.INSTANCE.getEFactory(KanbanmodelPackage.eNS_URI);
      if (theKanbanmodelFactory != null)
      {
        return theKanbanmodelFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new KanbanmodelFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KanbanmodelFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case KanbanmodelPackage.MODEL_BUILDER: return createModelBuilder();
      case KanbanmodelPackage.EXPERIMENT_MODEL: return createExperimentModel();
      case KanbanmodelPackage.SYSTEM_LIBRARIES: return createSystemLibraries();
      case KanbanmodelPackage.USER_LIBRARIES: return createUserLibraries();
      case KanbanmodelPackage.ABSTRACT_PARAMETER: return createAbstractParameter();
      case KanbanmodelPackage.NUM_EXPRESSION: return createNumExpression();
      case KanbanmodelPackage.OPERATOR: return createOperator();
      case KanbanmodelPackage.VARIABLE: return createVariable();
      case KanbanmodelPackage.DISTRIBUTION: return createDistribution();
      case KanbanmodelPackage.EVENT_TYPE: return createEventType();
      case KanbanmodelPackage.CONDITION_TYPE: return createConditionType();
      case KanbanmodelPackage.TRANSITION_TYPE: return createTransitionType();
      case KanbanmodelPackage.PROCESS_MODEL: return createProcessModel();
      case KanbanmodelPackage.EVENT: return createEvent();
      case KanbanmodelPackage.CONDITION: return createCondition();
      case KanbanmodelPackage.TRANSITION: return createTransition();
      case KanbanmodelPackage.AGENT_ROLE_TYPE: return createAgentRoleType();
      case KanbanmodelPackage.WIN_REPLICATION: return createWINReplication();
      case KanbanmodelPackage.GOVERNANCE_STRATEGY: return createGovernanceStrategy();
      case KanbanmodelPackage.WI_ACCEPTANCE: return createWIAcceptance();
      case KanbanmodelPackage.WI_SELECTION: return createWISelection();
      case KanbanmodelPackage.WI_ASSIGNMENT: return createWIAssignment();
      case KanbanmodelPackage.RESOURCE_ALLOCATION: return createResourceAllocation();
      case KanbanmodelPackage.RESOURCE_OUTSOURCING: return createResourceOutsourcing();
      case KanbanmodelPackage.WI_ACCEPTANCE_RULE_TYPE: return createWIAcceptanceRuleType();
      case KanbanmodelPackage.WI_SELECTION_RULE_TYPE: return createWISelectionRuleType();
      case KanbanmodelPackage.WI_ASSIGNMENT_RULE_TYPE: return createWIAssignmentRuleType();
      case KanbanmodelPackage.RESOURCE_ALLOCATION_RULE_TYPE: return createResourceAllocationRuleType();
      case KanbanmodelPackage.RESOURCE_OUTSOURCING_RULE_TYPE: return createResourceOutsourcingRuleType();
      case KanbanmodelPackage.MECHANISM: return createMechanism();
      case KanbanmodelPackage.MECHANISM_ATTRIBUTE: return createMechanismAttribute();
      case KanbanmodelPackage.PROCESS: return createProcess();
      case KanbanmodelPackage.PROCESS_ATTRIBUTE: return createProcessAttribute();
      case KanbanmodelPackage.WORK_SOURCE: return createWorkSource();
      case KanbanmodelPackage.WORK_ITEM_NETWORK: return createWorkItemNetwork();
      case KanbanmodelPackage.WORK_ITEM: return createWorkItem();
      case KanbanmodelPackage.IMPACT: return createImpact();
      case KanbanmodelPackage.CAUSAL_TRIGGER: return createCausalTrigger();
      case KanbanmodelPackage.WORK_ITEM_TYPE: return createWorkItemType();
      case KanbanmodelPackage.VALUE_FUNCTION: return createValueFunction();
      case KanbanmodelPackage.CLASS_OF_SERVICE: return createClassOfService();
      case KanbanmodelPackage.SERVICE: return createService();
      case KanbanmodelPackage.SERVICE_PROVIDER: return createServiceProvider();
      case KanbanmodelPackage.ASSET: return createAsset();
      case KanbanmodelPackage.SKILL: return createSkill();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelBuilder createModelBuilder()
  {
    ModelBuilderImpl modelBuilder = new ModelBuilderImpl();
    return modelBuilder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExperimentModel createExperimentModel()
  {
    ExperimentModelImpl experimentModel = new ExperimentModelImpl();
    return experimentModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemLibraries createSystemLibraries()
  {
    SystemLibrariesImpl systemLibraries = new SystemLibrariesImpl();
    return systemLibraries;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UserLibraries createUserLibraries()
  {
    UserLibrariesImpl userLibraries = new UserLibrariesImpl();
    return userLibraries;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractParameter createAbstractParameter()
  {
    AbstractParameterImpl abstractParameter = new AbstractParameterImpl();
    return abstractParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumExpression createNumExpression()
  {
    NumExpressionImpl numExpression = new NumExpressionImpl();
    return numExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operator createOperator()
  {
    OperatorImpl operator = new OperatorImpl();
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Distribution createDistribution()
  {
    DistributionImpl distribution = new DistributionImpl();
    return distribution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventType createEventType()
  {
    EventTypeImpl eventType = new EventTypeImpl();
    return eventType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionType createConditionType()
  {
    ConditionTypeImpl conditionType = new ConditionTypeImpl();
    return conditionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionType createTransitionType()
  {
    TransitionTypeImpl transitionType = new TransitionTypeImpl();
    return transitionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessModel createProcessModel()
  {
    ProcessModelImpl processModel = new ProcessModelImpl();
    return processModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event createEvent()
  {
    EventImpl event = new EventImpl();
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition createCondition()
  {
    ConditionImpl condition = new ConditionImpl();
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transition createTransition()
  {
    TransitionImpl transition = new TransitionImpl();
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AgentRoleType createAgentRoleType()
  {
    AgentRoleTypeImpl agentRoleType = new AgentRoleTypeImpl();
    return agentRoleType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WINReplication createWINReplication()
  {
    WINReplicationImpl winReplication = new WINReplicationImpl();
    return winReplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GovernanceStrategy createGovernanceStrategy()
  {
    GovernanceStrategyImpl governanceStrategy = new GovernanceStrategyImpl();
    return governanceStrategy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WIAcceptance createWIAcceptance()
  {
    WIAcceptanceImpl wiAcceptance = new WIAcceptanceImpl();
    return wiAcceptance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WISelection createWISelection()
  {
    WISelectionImpl wiSelection = new WISelectionImpl();
    return wiSelection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WIAssignment createWIAssignment()
  {
    WIAssignmentImpl wiAssignment = new WIAssignmentImpl();
    return wiAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceAllocation createResourceAllocation()
  {
    ResourceAllocationImpl resourceAllocation = new ResourceAllocationImpl();
    return resourceAllocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceOutsourcing createResourceOutsourcing()
  {
    ResourceOutsourcingImpl resourceOutsourcing = new ResourceOutsourcingImpl();
    return resourceOutsourcing;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WIAcceptanceRuleType createWIAcceptanceRuleType()
  {
    WIAcceptanceRuleTypeImpl wiAcceptanceRuleType = new WIAcceptanceRuleTypeImpl();
    return wiAcceptanceRuleType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WISelectionRuleType createWISelectionRuleType()
  {
    WISelectionRuleTypeImpl wiSelectionRuleType = new WISelectionRuleTypeImpl();
    return wiSelectionRuleType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WIAssignmentRuleType createWIAssignmentRuleType()
  {
    WIAssignmentRuleTypeImpl wiAssignmentRuleType = new WIAssignmentRuleTypeImpl();
    return wiAssignmentRuleType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceAllocationRuleType createResourceAllocationRuleType()
  {
    ResourceAllocationRuleTypeImpl resourceAllocationRuleType = new ResourceAllocationRuleTypeImpl();
    return resourceAllocationRuleType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceOutsourcingRuleType createResourceOutsourcingRuleType()
  {
    ResourceOutsourcingRuleTypeImpl resourceOutsourcingRuleType = new ResourceOutsourcingRuleTypeImpl();
    return resourceOutsourcingRuleType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mechanism createMechanism()
  {
    MechanismImpl mechanism = new MechanismImpl();
    return mechanism;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MechanismAttribute createMechanismAttribute()
  {
    MechanismAttributeImpl mechanismAttribute = new MechanismAttributeImpl();
    return mechanismAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public datasem.xtext.kanban.domainmodel.kanbanmodel.Process createProcess()
  {
    ProcessImpl process = new ProcessImpl();
    return process;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessAttribute createProcessAttribute()
  {
    ProcessAttributeImpl processAttribute = new ProcessAttributeImpl();
    return processAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkSource createWorkSource()
  {
    WorkSourceImpl workSource = new WorkSourceImpl();
    return workSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkItemNetwork createWorkItemNetwork()
  {
    WorkItemNetworkImpl workItemNetwork = new WorkItemNetworkImpl();
    return workItemNetwork;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkItem createWorkItem()
  {
    WorkItemImpl workItem = new WorkItemImpl();
    return workItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Impact createImpact()
  {
    ImpactImpl impact = new ImpactImpl();
    return impact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CausalTrigger createCausalTrigger()
  {
    CausalTriggerImpl causalTrigger = new CausalTriggerImpl();
    return causalTrigger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkItemType createWorkItemType()
  {
    WorkItemTypeImpl workItemType = new WorkItemTypeImpl();
    return workItemType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueFunction createValueFunction()
  {
    ValueFunctionImpl valueFunction = new ValueFunctionImpl();
    return valueFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassOfService createClassOfService()
  {
    ClassOfServiceImpl classOfService = new ClassOfServiceImpl();
    return classOfService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service createService()
  {
    ServiceImpl service = new ServiceImpl();
    return service;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceProvider createServiceProvider()
  {
    ServiceProviderImpl serviceProvider = new ServiceProviderImpl();
    return serviceProvider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Asset createAsset()
  {
    AssetImpl asset = new AssetImpl();
    return asset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Skill createSkill()
  {
    SkillImpl skill = new SkillImpl();
    return skill;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KanbanmodelPackage getKanbanmodelPackage()
  {
    return (KanbanmodelPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static KanbanmodelPackage getPackage()
  {
    return KanbanmodelPackage.eINSTANCE;
  }

} //KanbanmodelFactoryImpl
