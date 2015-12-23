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
      case DmodelPackage.USER_LIBRARIES: return createUserLibraries();
      case DmodelPackage.EXPERIMENT_MODEL: return createExperimentModel();
      case DmodelPackage.ABSTRACT_PARAMETER: return createAbstractParameter();
      case DmodelPackage.NUM_EXPRESSION: return createNumExpression();
      case DmodelPackage.DISTRIBUTION: return createDistribution();
      case DmodelPackage.GOVERNANCE_STRATEGY: return createGovernanceStrategy();
      case DmodelPackage.PULL_STRATEGY: return createPullStrategy();
      case DmodelPackage.PUSH_STRATEGY: return createPushStrategy();
      case DmodelPackage.MECHANISM: return createMechanism();
      case DmodelPackage.MECHANISM_ATTRIBUTE: return createMechanismAttribute();
      case DmodelPackage.WORK_ITEM_TYPE: return createWorkItemType();
      case DmodelPackage.WORK_ITEM_NETWORK: return createWorkItemNetwork();
      case DmodelPackage.WORK_ITEM: return createWorkItem();
      case DmodelPackage.REQUIRED_SERVICE: return createRequiredService();
      case DmodelPackage.IMPACT: return createImpact();
      case DmodelPackage.SERVICE_PROVIDER_TYPE: return createServiceProviderType();
      case DmodelPackage.SERVICE: return createService();
      case DmodelPackage.SERVICE_PROVIDER: return createServiceProvider();
      case DmodelPackage.ASSET: return createAsset();
      case DmodelPackage.SKILL: return createSkill();
      case DmodelPackage.EXPERIMENT_VARIABLE: return createExperimentVariable();
      case DmodelPackage.WIN_REPLICATION: return createWINReplication();
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
