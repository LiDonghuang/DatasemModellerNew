/**
 */
package datasemModeller.dmodel.impl;

import datasemModeller.dmodel.*;

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
public class DmodelFactoryImpl extends EFactoryImpl implements DmodelFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DmodelFactory init()
  {
    try
    {
      DmodelFactory theDmodelFactory = (DmodelFactory)EPackage.Registry.INSTANCE.getEFactory(DmodelPackage.eNS_URI);
      if (theDmodelFactory != null)
      {
        return theDmodelFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DmodelFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DmodelFactoryImpl()
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
      case DmodelPackage.MODEL_BUILDER: return createModelBuilder();
      case DmodelPackage.EXPERIMENT_MODEL: return createExperimentModel();
      case DmodelPackage.USER_LIBRARIES: return createUserLibraries();
      case DmodelPackage.ABSTRACT_PARAMETER: return createAbstractParameter();
      case DmodelPackage.NUM_EXPRESSION: return createNumExpression();
      case DmodelPackage.OPERATOR: return createOperator();
      case DmodelPackage.EXPERIMENT_VARIABLE: return createExperimentVariable();
      case DmodelPackage.DISTRIBUTION: return createDistribution();
      case DmodelPackage.WIN_REPLICATION: return createWINReplication();
      case DmodelPackage.GOVERNANCE_STRATEGY: return createGovernanceStrategy();
      case DmodelPackage.CONTRACT_NET_PROTOCOL: return createContractNetProtocol();
      case DmodelPackage.ROLE_BEHAVIOR: return createRoleBehavior();
      case DmodelPackage.PROCESS_MODEL: return createProcessModel();
      case DmodelPackage.PULL_STRATEGY: return createPullStrategy();
      case DmodelPackage.PUSH_STRATEGY: return createPushStrategy();
      case DmodelPackage.MECHANISM: return createMechanism();
      case DmodelPackage.MECHANISM_ATTRIBUTE: return createMechanismAttribute();
      case DmodelPackage.WORK_SOURCE: return createWorkSource();
      case DmodelPackage.WORK_ITEM_NETWORK: return createWorkItemNetwork();
      case DmodelPackage.WORK_ITEM: return createWorkItem();
      case DmodelPackage.REQUIRED_SERVICE: return createRequiredService();
      case DmodelPackage.IMPACT: return createImpact();
      case DmodelPackage.WORK_ITEM_TYPE: return createWorkItemType();
      case DmodelPackage.VALUE_FUNCTION: return createValueFunction();
      case DmodelPackage.CLASS_OF_SERVICE: return createClassOfService();
      case DmodelPackage.SERVICE: return createService();
      case DmodelPackage.SERVICE_PROVIDER: return createServiceProvider();
      case DmodelPackage.SERVICE_PROVIDER_TYPE: return createServiceProviderType();
      case DmodelPackage.ASSET: return createAsset();
      case DmodelPackage.SKILL: return createSkill();
      case DmodelPackage.ABSTRACT_TYPE: return createAbstractType();
      case DmodelPackage.CLASS_ATTRIBUTES: return createClassAttributes();
      case DmodelPackage.AGENT: return createAgent();
      case DmodelPackage.TASK: return createTask();
      case DmodelPackage.ATTRIBUTE: return createAttribute();
      case DmodelPackage.ATTRIBUTE_VALUE: return createAttributeValue();
      case DmodelPackage.VARIABLE: return createVariable();
      case DmodelPackage.ACTION: return createAction();
      case DmodelPackage.STATE: return createState();
      case DmodelPackage.IF_EXPRESSION: return createIfExpression();
      case DmodelPackage.FOR_EXPRESSION: return createForExpression();
      case DmodelPackage.WHILE_EXPRESSION: return createWhileExpression();
      case DmodelPackage.CONDITION: return createCondition();
      case DmodelPackage.STATEMENT: return createStatement();
      case DmodelPackage.DECLARATION_STATEMENT: return createDeclarationStatement();
      case DmodelPackage.ACTION_STATEMENT: return createActionStatement();
      case DmodelPackage.ASSERT_STATEMENT: return createAssertStatement();
      case DmodelPackage.CHANGE_STATE_STATEMENT: return createChangeStateStatement();
      case DmodelPackage.EXPRESSION: return createExpression();
      case DmodelPackage.TERM: return createTerm();
      case DmodelPackage.FACTOR: return createFactor();
      case DmodelPackage.VAR_EXPRESSION: return createVarExpression();
      case DmodelPackage.METHOD: return createMethod();
      case DmodelPackage.PLUS: return createPlus();
      case DmodelPackage.MINUS: return createMinus();
      case DmodelPackage.MULTIPLY: return createMultiply();
      case DmodelPackage.DIVISION: return createDivision();
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
  public DmodelPackage getDmodelPackage()
  {
    return (DmodelPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DmodelPackage getPackage()
  {
    return DmodelPackage.eINSTANCE;
  }

} //DmodelFactoryImpl
