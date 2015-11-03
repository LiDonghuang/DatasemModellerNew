/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel.impl;

import datasem.xtext.kanban.domainmodel.kanbanmodel.*;

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
      case KanbanmodelPackage.USER_LIBRARIES: return createUserLibraries();
      case KanbanmodelPackage.ABSTRACT_PARAMETER: return createAbstractParameter();
      case KanbanmodelPackage.NUM_EXPRESSION: return createNumExpression();
      case KanbanmodelPackage.OPERATOR: return createOperator();
      case KanbanmodelPackage.EXPERIMENT_VARIABLE: return createExperimentVariable();
      case KanbanmodelPackage.DISTRIBUTION: return createDistribution();
      case KanbanmodelPackage.WIN_REPLICATION: return createWINReplication();
      case KanbanmodelPackage.GOVERNANCE_STRATEGY: return createGovernanceStrategy();
      case KanbanmodelPackage.CONTRACT_NET_PROTOCOL: return createContractNetProtocol();
      case KanbanmodelPackage.ROLE_BEHAVIOR: return createRoleBehavior();
      case KanbanmodelPackage.PROCESS_MODEL: return createProcessModel();
      case KanbanmodelPackage.PULL_STRATEGY: return createPullStrategy();
      case KanbanmodelPackage.PUSH_STRATEGY: return createPushStrategy();
      case KanbanmodelPackage.MECHANISM: return createMechanism();
      case KanbanmodelPackage.MECHANISM_ATTRIBUTE: return createMechanismAttribute();
      case KanbanmodelPackage.WORK_SOURCE: return createWorkSource();
      case KanbanmodelPackage.WORK_ITEM_NETWORK: return createWorkItemNetwork();
      case KanbanmodelPackage.WORK_ITEM: return createWorkItem();
      case KanbanmodelPackage.REQUIRED_SERVICE: return createRequiredService();
      case KanbanmodelPackage.IMPACT: return createImpact();
      case KanbanmodelPackage.WORK_ITEM_TYPE: return createWorkItemType();
      case KanbanmodelPackage.VALUE_FUNCTION: return createValueFunction();
      case KanbanmodelPackage.CLASS_OF_SERVICE: return createClassOfService();
      case KanbanmodelPackage.SERVICE: return createService();
      case KanbanmodelPackage.SERVICE_PROVIDER: return createServiceProvider();
      case KanbanmodelPackage.SERVICE_PROVIDER_TYPE: return createServiceProviderType();
      case KanbanmodelPackage.ASSET: return createAsset();
      case KanbanmodelPackage.SKILL: return createSkill();
      case KanbanmodelPackage.ABSTRACT_TYPE: return createAbstractType();
      case KanbanmodelPackage.CLASS_ATTRIBUTES: return createClassAttributes();
      case KanbanmodelPackage.AGENT: return createAgent();
      case KanbanmodelPackage.TASK: return createTask();
      case KanbanmodelPackage.ATTRIBUTE: return createAttribute();
      case KanbanmodelPackage.ATTRIBUTE_VALUE: return createAttributeValue();
      case KanbanmodelPackage.VARIABLE: return createVariable();
      case KanbanmodelPackage.ACTION: return createAction();
      case KanbanmodelPackage.STATE: return createState();
      case KanbanmodelPackage.IF_EXPRESSION: return createIfExpression();
      case KanbanmodelPackage.FOR_EXPRESSION: return createForExpression();
      case KanbanmodelPackage.WHILE_EXPRESSION: return createWhileExpression();
      case KanbanmodelPackage.CONDITION: return createCondition();
      case KanbanmodelPackage.STATEMENT: return createStatement();
      case KanbanmodelPackage.DECLARATION_STATEMENT: return createDeclarationStatement();
      case KanbanmodelPackage.ACTION_STATEMENT: return createActionStatement();
      case KanbanmodelPackage.ASSERT_STATEMENT: return createAssertStatement();
      case KanbanmodelPackage.CHANGE_STATE_STATEMENT: return createChangeStateStatement();
      case KanbanmodelPackage.EXPRESSION: return createExpression();
      case KanbanmodelPackage.TERM: return createTerm();
      case KanbanmodelPackage.FACTOR: return createFactor();
      case KanbanmodelPackage.VAR_EXPRESSION: return createVarExpression();
      case KanbanmodelPackage.METHOD: return createMethod();
      case KanbanmodelPackage.PLUS: return createPlus();
      case KanbanmodelPackage.MINUS: return createMinus();
      case KanbanmodelPackage.MULTIPLY: return createMultiply();
      case KanbanmodelPackage.DIVISION: return createDivision();
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
  public ExperimentVariable createExperimentVariable()
  {
    ExperimentVariableImpl experimentVariable = new ExperimentVariableImpl();
    return experimentVariable;
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
  public ContractNetProtocol createContractNetProtocol()
  {
    ContractNetProtocolImpl contractNetProtocol = new ContractNetProtocolImpl();
    return contractNetProtocol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoleBehavior createRoleBehavior()
  {
    RoleBehaviorImpl roleBehavior = new RoleBehaviorImpl();
    return roleBehavior;
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
  public PullStrategy createPullStrategy()
  {
    PullStrategyImpl pullStrategy = new PullStrategyImpl();
    return pullStrategy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PushStrategy createPushStrategy()
  {
    PushStrategyImpl pushStrategy = new PushStrategyImpl();
    return pushStrategy;
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
  public RequiredService createRequiredService()
  {
    RequiredServiceImpl requiredService = new RequiredServiceImpl();
    return requiredService;
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
  public ServiceProviderType createServiceProviderType()
  {
    ServiceProviderTypeImpl serviceProviderType = new ServiceProviderTypeImpl();
    return serviceProviderType;
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
  public AbstractType createAbstractType()
  {
    AbstractTypeImpl abstractType = new AbstractTypeImpl();
    return abstractType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassAttributes createClassAttributes()
  {
    ClassAttributesImpl classAttributes = new ClassAttributesImpl();
    return classAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Agent createAgent()
  {
    AgentImpl agent = new AgentImpl();
    return agent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Task createTask()
  {
    TaskImpl task = new TaskImpl();
    return task;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeValue createAttributeValue()
  {
    AttributeValueImpl attributeValue = new AttributeValueImpl();
    return attributeValue;
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
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State createState()
  {
    StateImpl state = new StateImpl();
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfExpression createIfExpression()
  {
    IfExpressionImpl ifExpression = new IfExpressionImpl();
    return ifExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForExpression createForExpression()
  {
    ForExpressionImpl forExpression = new ForExpressionImpl();
    return forExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhileExpression createWhileExpression()
  {
    WhileExpressionImpl whileExpression = new WhileExpressionImpl();
    return whileExpression;
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
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeclarationStatement createDeclarationStatement()
  {
    DeclarationStatementImpl declarationStatement = new DeclarationStatementImpl();
    return declarationStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionStatement createActionStatement()
  {
    ActionStatementImpl actionStatement = new ActionStatementImpl();
    return actionStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssertStatement createAssertStatement()
  {
    AssertStatementImpl assertStatement = new AssertStatementImpl();
    return assertStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChangeStateStatement createChangeStateStatement()
  {
    ChangeStateStatementImpl changeStateStatement = new ChangeStateStatementImpl();
    return changeStateStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Term createTerm()
  {
    TermImpl term = new TermImpl();
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Factor createFactor()
  {
    FactorImpl factor = new FactorImpl();
    return factor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarExpression createVarExpression()
  {
    VarExpressionImpl varExpression = new VarExpressionImpl();
    return varExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method createMethod()
  {
    MethodImpl method = new MethodImpl();
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multiply createMultiply()
  {
    MultiplyImpl multiply = new MultiplyImpl();
    return multiply;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Division createDivision()
  {
    DivisionImpl division = new DivisionImpl();
    return division;
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
