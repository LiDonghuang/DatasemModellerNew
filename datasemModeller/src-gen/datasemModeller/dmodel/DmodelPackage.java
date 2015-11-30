/**
 */
package datasemModeller.dmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see datasemModeller.dmodel.DmodelFactory
 * @model kind="package"
 * @generated
 */
public interface DmodelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dmodel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.Dmodel.datasemModeller";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dmodel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DmodelPackage eINSTANCE = datasemModeller.dmodel.impl.DmodelPackageImpl.init();

  /**
   * The meta object id for the '{@link datasemModeller.dmodel.impl.ModelBuilderImpl <em>Model Builder</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasemModeller.dmodel.impl.ModelBuilderImpl
   * @see datasemModeller.dmodel.impl.DmodelPackageImpl#getModelBuilder()
   * @generated
   */
  int MODEL_BUILDER = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BUILDER__NAME = 0;

  /**
   * The feature id for the '<em><b>User Libraries</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BUILDER__USER_LIBRARIES = 1;

  /**
   * The feature id for the '<em><b>Experiment Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BUILDER__EXPERIMENT_MODEL = 2;

  /**
   * The number of structural features of the '<em>Model Builder</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BUILDER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link datasemModeller.dmodel.impl.UserLibrariesImpl <em>User Libraries</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasemModeller.dmodel.impl.UserLibrariesImpl
   * @see datasemModeller.dmodel.impl.DmodelPackageImpl#getUserLibraries()
   * @generated
   */
  int USER_LIBRARIES = 1;

  /**
   * The feature id for the '<em><b>Service Provider Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_LIBRARIES__SERVICE_PROVIDER_TYPES = 0;

  /**
   * The feature id for the '<em><b>Work Item Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_LIBRARIES__WORK_ITEM_TYPES = 1;

  /**
   * The feature id for the '<em><b>Services</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_LIBRARIES__SERVICES = 2;

  /**
   * The feature id for the '<em><b>Governance Strategies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_LIBRARIES__GOVERNANCE_STRATEGIES = 3;

  /**
   * The number of structural features of the '<em>User Libraries</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_LIBRARIES_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link datasemModeller.dmodel.impl.ExperimentModelImpl <em>Experiment Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasemModeller.dmodel.impl.ExperimentModelImpl
   * @see datasemModeller.dmodel.impl.DmodelPackageImpl#getExperimentModel()
   * @generated
   */
  int EXPERIMENT_MODEL = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIMENT_MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Experiment Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIMENT_MODEL__EXPERIMENT_VARIABLES = 1;

  /**
   * The feature id for the '<em><b>Service Providers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIMENT_MODEL__SERVICE_PROVIDERS = 2;

  /**
   * The feature id for the '<em><b>Work Item Networks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIMENT_MODEL__WORK_ITEM_NETWORKS = 3;

  /**
   * The feature id for the '<em><b>WIN Replications</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIMENT_MODEL__WIN_REPLICATIONS = 4;

  /**
   * The number of structural features of the '<em>Experiment Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIMENT_MODEL_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link datasemModeller.dmodel.impl.AbstractParameterImpl <em>Abstract Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasemModeller.dmodel.impl.AbstractParameterImpl
   * @see datasemModeller.dmodel.impl.DmodelPackageImpl#getAbstractParameter()
   * @generated
   */
  int ABSTRACT_PARAMETER = 3;

  /**
   * The feature id for the '<em><b>Is Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_PARAMETER__IS_VARIABLE = 0;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_PARAMETER__VARIABLE = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_PARAMETER__VALUE = 2;

  /**
   * The number of structural features of the '<em>Abstract Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_PARAMETER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link datasemModeller.dmodel.impl.NumExpressionImpl <em>Num Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasemModeller.dmodel.impl.NumExpressionImpl
   * @see datasemModeller.dmodel.impl.DmodelPackageImpl#getNumExpression()
   * @generated
   */
  int NUM_EXPRESSION = 4;

  /**
   * The feature id for the '<em><b>Num Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUM_EXPRESSION__NUM_VALUE = 0;

  /**
   * The feature id for the '<em><b>Distribution</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUM_EXPRESSION__DISTRIBUTION = 1;

  /**
   * The feature id for the '<em><b>Num Dist</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUM_EXPRESSION__NUM_DIST = 2;

  /**
   * The number of structural features of the '<em>Num Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUM_EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link datasemModeller.dmodel.impl.DistributionImpl <em>Distribution</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasemModeller.dmodel.impl.DistributionImpl
   * @see datasemModeller.dmodel.impl.DmodelPackageImpl#getDistribution()
   * @generated
   */
  int DISTRIBUTION = 5;

  /**
   * The feature id for the '<em><b>Is Normal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTION__IS_NORMAL = 0;

  /**
   * The feature id for the '<em><b>Is Uniform</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTION__IS_UNIFORM = 1;

  /**
   * The feature id for the '<em><b>Is Exponential</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTION__IS_EXPONENTIAL = 2;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTION__PARAMETERS = 3;

  /**
   * The number of structural features of the '<em>Distribution</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link datasemModeller.dmodel.impl.GovernanceStrategyImpl <em>Governance Strategy</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasemModeller.dmodel.impl.GovernanceStrategyImpl
   * @see datasemModeller.dmodel.impl.DmodelPackageImpl#getGovernanceStrategy()
   * @generated
   */
  int GOVERNANCE_STRATEGY = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOVERNANCE_STRATEGY__NAME = 0;

  /**
   * The feature id for the '<em><b>Pull Strategy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOVERNANCE_STRATEGY__PULL_STRATEGY = 1;

  /**
   * The number of structural features of the '<em>Governance Strategy</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOVERNANCE_STRATEGY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasemModeller.dmodel.impl.PullStrategyImpl <em>Pull Strategy</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasemModeller.dmodel.impl.PullStrategyImpl
   * @see datasemModeller.dmodel.impl.DmodelPackageImpl#getPullStrategy()
   * @generated
   */
  int PULL_STRATEGY = 7;

  /**
   * The feature id for the '<em><b>Mechanisms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PULL_STRATEGY__MECHANISMS = 0;

  /**
   * The number of structural features of the '<em>Pull Strategy</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PULL_STRATEGY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link datasemModeller.dmodel.impl.MechanismImpl <em>Mechanism</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasemModeller.dmodel.impl.MechanismImpl
   * @see datasemModeller.dmodel.impl.DmodelPackageImpl#getMechanism()
   * @generated
   */
  int MECHANISM = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MECHANISM__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MECHANISM__VALUE = 1;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MECHANISM__ATTRIBUTES = 2;

  /**
   * The number of structural features of the '<em>Mechanism</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MECHANISM_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link datasemModeller.dmodel.impl.MechanismAttributeImpl <em>Mechanism Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasemModeller.dmodel.impl.MechanismAttributeImpl
   * @see datasemModeller.dmodel.impl.DmodelPackageImpl#getMechanismAttribute()
   * @generated
   */
  int MECHANISM_ATTRIBUTE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MECHANISM_ATTRIBUTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MECHANISM_ATTRIBUTE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Mechanism Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MECHANISM_ATTRIBUTE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasemModeller.dmodel.impl.WorkItemTypeImpl <em>Work Item Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasemModeller.dmodel.impl.WorkItemTypeImpl
   * @see datasemModeller.dmodel.impl.DmodelPackageImpl#getWorkItemType()
   * @generated
   */
  int WORK_ITEM_TYPE = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_TYPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Hierarchy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_TYPE__HIERARCHY = 1;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_TYPE__ID = 2;

  /**
   * The number of structural features of the '<em>Work Item Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link datasemModeller.dmodel.impl.WorkItemNetworkImpl <em>Work Item Network</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasemModeller.dmodel.impl.WorkItemNetworkImpl
   * @see datasemModeller.dmodel.impl.DmodelPackageImpl#getWorkItemNetwork()
   * @generated
   */
  int WORK_ITEM_NETWORK = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_NETWORK__NAME = 0;

  /**
   * The feature id for the '<em><b>Work Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_NETWORK__WORK_ITEMS = 1;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_NETWORK__ID = 2;

  /**
   * The number of structural features of the '<em>Work Item Network</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_NETWORK_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link datasemModeller.dmodel.impl.WorkItemImpl <em>Work Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasemModeller.dmodel.impl.WorkItemImpl
   * @see datasemModeller.dmodel.impl.DmodelPackageImpl#getWorkItem()
   * @generated
   */
  int WORK_ITEM = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__TYPE = 1;

  /**
   * The feature id for the '<em><b>Has Predecessors</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__HAS_PREDECESSORS = 2;

  /**
   * The feature id for the '<em><b>PTasks</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__PTASKS = 3;

  /**
   * The feature id for the '<em><b>Has Subtasks</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__HAS_SUBTASKS = 4;

  /**
   * The feature id for the '<em><b>STasks</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__STASKS = 5;

  /**
   * The feature id for the '<em><b>Required Analysis</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__REQUIRED_ANALYSIS = 6;

  /**
   * The feature id for the '<em><b>Required Services</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__REQUIRED_SERVICES = 7;

  /**
   * The feature id for the '<em><b>Has Impacts</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__HAS_IMPACTS = 8;

  /**
   * The feature id for the '<em><b>Impacts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__IMPACTS = 9;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__VALUE = 10;

  /**
   * The feature id for the '<em><b>Arrival Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__ARRIVAL_TIME = 11;

  /**
   * The feature id for the '<em><b>Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__DURATION = 12;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__ID = 13;

  /**
   * The number of structural features of the '<em>Work Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_FEATURE_COUNT = 14;

  /**
   * The meta object id for the '{@link datasemModeller.dmodel.impl.RequiredServiceImpl <em>Required Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasemModeller.dmodel.impl.RequiredServiceImpl
   * @see datasemModeller.dmodel.impl.DmodelPackageImpl#getRequiredService()
   * @generated
   */
  int REQUIRED_SERVICE = 13;

  /**
   * The feature id for the '<em><b>Service Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_SERVICE__SERVICE_TYPE = 0;

  /**
   * The feature id for the '<em><b>Efforts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_SERVICE__EFFORTS = 1;

  /**
   * The number of structural features of the '<em>Required Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_SERVICE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasemModeller.dmodel.impl.ImpactImpl <em>Impact</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasemModeller.dmodel.impl.ImpactImpl
   * @see datasemModeller.dmodel.impl.DmodelPackageImpl#getImpact()
   * @generated
   */
  int IMPACT = 14;

  /**
   * The feature id for the '<em><b>Impact WI</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPACT__IMPACT_WI = 0;

  /**
   * The feature id for the '<em><b>Likelihood</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPACT__LIKELIHOOD = 1;

  /**
   * The feature id for the '<em><b>Risk</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPACT__RISK = 2;

  /**
   * The number of structural features of the '<em>Impact</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPACT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link datasemModeller.dmodel.impl.ServiceProviderTypeImpl <em>Service Provider Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasemModeller.dmodel.impl.ServiceProviderTypeImpl
   * @see datasemModeller.dmodel.impl.DmodelPackageImpl#getServiceProviderType()
   * @generated
   */
  int SERVICE_PROVIDER_TYPE = 15;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER_TYPE__ID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER_TYPE__NAME = 1;

  /**
   * The feature id for the '<em><b>Hierarchy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER_TYPE__HIERARCHY = 2;

  /**
   * The number of structural features of the '<em>Service Provider Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link datasemModeller.dmodel.impl.ServiceImpl <em>Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasemModeller.dmodel.impl.ServiceImpl
   * @see datasemModeller.dmodel.impl.DmodelPackageImpl#getService()
   * @generated
   */
  int SERVICE = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__NAME = 0;

  /**
   * The feature id for the '<em><b>Hierarchy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__HIERARCHY = 1;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__ID = 2;

  /**
   * The number of structural features of the '<em>Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link datasemModeller.dmodel.impl.ServiceProviderImpl <em>Service Provider</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasemModeller.dmodel.impl.ServiceProviderImpl
   * @see datasemModeller.dmodel.impl.DmodelPackageImpl#getServiceProvider()
   * @generated
   */
  int SERVICE_PROVIDER = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER__TYPE = 1;

  /**
   * The feature id for the '<em><b>Assign To</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER__ASSIGN_TO = 2;

  /**
   * The feature id for the '<em><b>Governance Strategy</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER__GOVERNANCE_STRATEGY = 3;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER__RESOURCES = 4;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER__ID = 5;

  /**
   * The number of structural features of the '<em>Service Provider</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link datasemModeller.dmodel.impl.AssetImpl <em>Asset</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasemModeller.dmodel.impl.AssetImpl
   * @see datasemModeller.dmodel.impl.DmodelPackageImpl#getAsset()
   * @generated
   */
  int ASSET = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSET__NAME = 0;

  /**
   * The feature id for the '<em><b>Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSET__NUMBER = 1;

  /**
   * The feature id for the '<em><b>Skill Set</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSET__SKILL_SET = 2;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSET__ID = 3;

  /**
   * The number of structural features of the '<em>Asset</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSET_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link datasemModeller.dmodel.impl.SkillImpl <em>Skill</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasemModeller.dmodel.impl.SkillImpl
   * @see datasemModeller.dmodel.impl.DmodelPackageImpl#getSkill()
   * @generated
   */
  int SKILL = 19;

  /**
   * The feature id for the '<em><b>Service</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SKILL__SERVICE = 0;

  /**
   * The feature id for the '<em><b>Efficiency</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SKILL__EFFICIENCY = 1;

  /**
   * The number of structural features of the '<em>Skill</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SKILL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasemModeller.dmodel.impl.ExperimentVariableImpl <em>Experiment Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasemModeller.dmodel.impl.ExperimentVariableImpl
   * @see datasemModeller.dmodel.impl.DmodelPackageImpl#getExperimentVariable()
   * @generated
   */
  int EXPERIMENT_VARIABLE = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIMENT_VARIABLE__NAME = 0;

  /**
   * The feature id for the '<em><b>Boolean</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIMENT_VARIABLE__BOOLEAN = 1;

  /**
   * The feature id for the '<em><b>Boolean Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIMENT_VARIABLE__BOOLEAN_VALUE = 2;

  /**
   * The feature id for the '<em><b>Num</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIMENT_VARIABLE__NUM = 3;

  /**
   * The feature id for the '<em><b>Num Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIMENT_VARIABLE__NUM_VALUE = 4;

  /**
   * The feature id for the '<em><b>Distribution</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIMENT_VARIABLE__DISTRIBUTION = 5;

  /**
   * The feature id for the '<em><b>Num Dist</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIMENT_VARIABLE__NUM_DIST = 6;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIMENT_VARIABLE__STRING = 7;

  /**
   * The feature id for the '<em><b>String Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIMENT_VARIABLE__STRING_VALUE = 8;

  /**
   * The feature id for the '<em><b>Strategy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIMENT_VARIABLE__STRATEGY = 9;

  /**
   * The feature id for the '<em><b>Strategy Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIMENT_VARIABLE__STRATEGY_VALUE = 10;

  /**
   * The number of structural features of the '<em>Experiment Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIMENT_VARIABLE_FEATURE_COUNT = 11;

  /**
   * The meta object id for the '{@link datasemModeller.dmodel.impl.WINReplicationImpl <em>WIN Replication</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasemModeller.dmodel.impl.WINReplicationImpl
   * @see datasemModeller.dmodel.impl.DmodelPackageImpl#getWINReplication()
   * @generated
   */
  int WIN_REPLICATION = 21;

  /**
   * The feature id for the '<em><b>Work Item Network</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIN_REPLICATION__WORK_ITEM_NETWORK = 0;

  /**
   * The feature id for the '<em><b>Num Replications</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIN_REPLICATION__NUM_REPLICATIONS = 1;

  /**
   * The number of structural features of the '<em>WIN Replication</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIN_REPLICATION_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link datasemModeller.dmodel.ModelBuilder <em>Model Builder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Builder</em>'.
   * @see datasemModeller.dmodel.ModelBuilder
   * @generated
   */
  EClass getModelBuilder();

  /**
   * Returns the meta object for the attribute '{@link datasemModeller.dmodel.ModelBuilder#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasemModeller.dmodel.ModelBuilder#getName()
   * @see #getModelBuilder()
   * @generated
   */
  EAttribute getModelBuilder_Name();

  /**
   * Returns the meta object for the containment reference '{@link datasemModeller.dmodel.ModelBuilder#getUserLibraries <em>User Libraries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>User Libraries</em>'.
   * @see datasemModeller.dmodel.ModelBuilder#getUserLibraries()
   * @see #getModelBuilder()
   * @generated
   */
  EReference getModelBuilder_UserLibraries();

  /**
   * Returns the meta object for the containment reference '{@link datasemModeller.dmodel.ModelBuilder#getExperimentModel <em>Experiment Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Experiment Model</em>'.
   * @see datasemModeller.dmodel.ModelBuilder#getExperimentModel()
   * @see #getModelBuilder()
   * @generated
   */
  EReference getModelBuilder_ExperimentModel();

  /**
   * Returns the meta object for class '{@link datasemModeller.dmodel.UserLibraries <em>User Libraries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>User Libraries</em>'.
   * @see datasemModeller.dmodel.UserLibraries
   * @generated
   */
  EClass getUserLibraries();

  /**
   * Returns the meta object for the containment reference list '{@link datasemModeller.dmodel.UserLibraries#getServiceProviderTypes <em>Service Provider Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Service Provider Types</em>'.
   * @see datasemModeller.dmodel.UserLibraries#getServiceProviderTypes()
   * @see #getUserLibraries()
   * @generated
   */
  EReference getUserLibraries_ServiceProviderTypes();

  /**
   * Returns the meta object for the containment reference list '{@link datasemModeller.dmodel.UserLibraries#getWorkItemTypes <em>Work Item Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Work Item Types</em>'.
   * @see datasemModeller.dmodel.UserLibraries#getWorkItemTypes()
   * @see #getUserLibraries()
   * @generated
   */
  EReference getUserLibraries_WorkItemTypes();

  /**
   * Returns the meta object for the containment reference list '{@link datasemModeller.dmodel.UserLibraries#getServices <em>Services</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Services</em>'.
   * @see datasemModeller.dmodel.UserLibraries#getServices()
   * @see #getUserLibraries()
   * @generated
   */
  EReference getUserLibraries_Services();

  /**
   * Returns the meta object for the containment reference list '{@link datasemModeller.dmodel.UserLibraries#getGovernanceStrategies <em>Governance Strategies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Governance Strategies</em>'.
   * @see datasemModeller.dmodel.UserLibraries#getGovernanceStrategies()
   * @see #getUserLibraries()
   * @generated
   */
  EReference getUserLibraries_GovernanceStrategies();

  /**
   * Returns the meta object for class '{@link datasemModeller.dmodel.ExperimentModel <em>Experiment Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Experiment Model</em>'.
   * @see datasemModeller.dmodel.ExperimentModel
   * @generated
   */
  EClass getExperimentModel();

  /**
   * Returns the meta object for the attribute '{@link datasemModeller.dmodel.ExperimentModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasemModeller.dmodel.ExperimentModel#getName()
   * @see #getExperimentModel()
   * @generated
   */
  EAttribute getExperimentModel_Name();

  /**
   * Returns the meta object for the containment reference list '{@link datasemModeller.dmodel.ExperimentModel#getExperimentVariables <em>Experiment Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Experiment Variables</em>'.
   * @see datasemModeller.dmodel.ExperimentModel#getExperimentVariables()
   * @see #getExperimentModel()
   * @generated
   */
  EReference getExperimentModel_ExperimentVariables();

  /**
   * Returns the meta object for the containment reference list '{@link datasemModeller.dmodel.ExperimentModel#getServiceProviders <em>Service Providers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Service Providers</em>'.
   * @see datasemModeller.dmodel.ExperimentModel#getServiceProviders()
   * @see #getExperimentModel()
   * @generated
   */
  EReference getExperimentModel_ServiceProviders();

  /**
   * Returns the meta object for the containment reference list '{@link datasemModeller.dmodel.ExperimentModel#getWorkItemNetworks <em>Work Item Networks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Work Item Networks</em>'.
   * @see datasemModeller.dmodel.ExperimentModel#getWorkItemNetworks()
   * @see #getExperimentModel()
   * @generated
   */
  EReference getExperimentModel_WorkItemNetworks();

  /**
   * Returns the meta object for the containment reference list '{@link datasemModeller.dmodel.ExperimentModel#getWINReplications <em>WIN Replications</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>WIN Replications</em>'.
   * @see datasemModeller.dmodel.ExperimentModel#getWINReplications()
   * @see #getExperimentModel()
   * @generated
   */
  EReference getExperimentModel_WINReplications();

  /**
   * Returns the meta object for class '{@link datasemModeller.dmodel.AbstractParameter <em>Abstract Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Parameter</em>'.
   * @see datasemModeller.dmodel.AbstractParameter
   * @generated
   */
  EClass getAbstractParameter();

  /**
   * Returns the meta object for the attribute '{@link datasemModeller.dmodel.AbstractParameter#isIsVariable <em>Is Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Variable</em>'.
   * @see datasemModeller.dmodel.AbstractParameter#isIsVariable()
   * @see #getAbstractParameter()
   * @generated
   */
  EAttribute getAbstractParameter_IsVariable();

  /**
   * Returns the meta object for the reference '{@link datasemModeller.dmodel.AbstractParameter#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variable</em>'.
   * @see datasemModeller.dmodel.AbstractParameter#getVariable()
   * @see #getAbstractParameter()
   * @generated
   */
  EReference getAbstractParameter_Variable();

  /**
   * Returns the meta object for the attribute '{@link datasemModeller.dmodel.AbstractParameter#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see datasemModeller.dmodel.AbstractParameter#getValue()
   * @see #getAbstractParameter()
   * @generated
   */
  EAttribute getAbstractParameter_Value();

  /**
   * Returns the meta object for class '{@link datasemModeller.dmodel.NumExpression <em>Num Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Num Expression</em>'.
   * @see datasemModeller.dmodel.NumExpression
   * @generated
   */
  EClass getNumExpression();

  /**
   * Returns the meta object for the attribute '{@link datasemModeller.dmodel.NumExpression#getNumValue <em>Num Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Num Value</em>'.
   * @see datasemModeller.dmodel.NumExpression#getNumValue()
   * @see #getNumExpression()
   * @generated
   */
  EAttribute getNumExpression_NumValue();

  /**
   * Returns the meta object for the attribute '{@link datasemModeller.dmodel.NumExpression#isDistribution <em>Distribution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Distribution</em>'.
   * @see datasemModeller.dmodel.NumExpression#isDistribution()
   * @see #getNumExpression()
   * @generated
   */
  EAttribute getNumExpression_Distribution();

  /**
   * Returns the meta object for the containment reference '{@link datasemModeller.dmodel.NumExpression#getNumDist <em>Num Dist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Num Dist</em>'.
   * @see datasemModeller.dmodel.NumExpression#getNumDist()
   * @see #getNumExpression()
   * @generated
   */
  EReference getNumExpression_NumDist();

  /**
   * Returns the meta object for class '{@link datasemModeller.dmodel.Distribution <em>Distribution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Distribution</em>'.
   * @see datasemModeller.dmodel.Distribution
   * @generated
   */
  EClass getDistribution();

  /**
   * Returns the meta object for the attribute '{@link datasemModeller.dmodel.Distribution#isIsNormal <em>Is Normal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Normal</em>'.
   * @see datasemModeller.dmodel.Distribution#isIsNormal()
   * @see #getDistribution()
   * @generated
   */
  EAttribute getDistribution_IsNormal();

  /**
   * Returns the meta object for the attribute '{@link datasemModeller.dmodel.Distribution#isIsUniform <em>Is Uniform</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Uniform</em>'.
   * @see datasemModeller.dmodel.Distribution#isIsUniform()
   * @see #getDistribution()
   * @generated
   */
  EAttribute getDistribution_IsUniform();

  /**
   * Returns the meta object for the attribute '{@link datasemModeller.dmodel.Distribution#isIsExponential <em>Is Exponential</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Exponential</em>'.
   * @see datasemModeller.dmodel.Distribution#isIsExponential()
   * @see #getDistribution()
   * @generated
   */
  EAttribute getDistribution_IsExponential();

  /**
   * Returns the meta object for the attribute list '{@link datasemModeller.dmodel.Distribution#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Parameters</em>'.
   * @see datasemModeller.dmodel.Distribution#getParameters()
   * @see #getDistribution()
   * @generated
   */
  EAttribute getDistribution_Parameters();

  /**
   * Returns the meta object for class '{@link datasemModeller.dmodel.GovernanceStrategy <em>Governance Strategy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Governance Strategy</em>'.
   * @see datasemModeller.dmodel.GovernanceStrategy
   * @generated
   */
  EClass getGovernanceStrategy();

  /**
   * Returns the meta object for the attribute '{@link datasemModeller.dmodel.GovernanceStrategy#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasemModeller.dmodel.GovernanceStrategy#getName()
   * @see #getGovernanceStrategy()
   * @generated
   */
  EAttribute getGovernanceStrategy_Name();

  /**
   * Returns the meta object for the containment reference '{@link datasemModeller.dmodel.GovernanceStrategy#getPullStrategy <em>Pull Strategy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pull Strategy</em>'.
   * @see datasemModeller.dmodel.GovernanceStrategy#getPullStrategy()
   * @see #getGovernanceStrategy()
   * @generated
   */
  EReference getGovernanceStrategy_PullStrategy();

  /**
   * Returns the meta object for class '{@link datasemModeller.dmodel.PullStrategy <em>Pull Strategy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pull Strategy</em>'.
   * @see datasemModeller.dmodel.PullStrategy
   * @generated
   */
  EClass getPullStrategy();

  /**
   * Returns the meta object for the containment reference list '{@link datasemModeller.dmodel.PullStrategy#getMechanisms <em>Mechanisms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mechanisms</em>'.
   * @see datasemModeller.dmodel.PullStrategy#getMechanisms()
   * @see #getPullStrategy()
   * @generated
   */
  EReference getPullStrategy_Mechanisms();

  /**
   * Returns the meta object for class '{@link datasemModeller.dmodel.Mechanism <em>Mechanism</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mechanism</em>'.
   * @see datasemModeller.dmodel.Mechanism
   * @generated
   */
  EClass getMechanism();

  /**
   * Returns the meta object for the attribute '{@link datasemModeller.dmodel.Mechanism#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasemModeller.dmodel.Mechanism#getName()
   * @see #getMechanism()
   * @generated
   */
  EAttribute getMechanism_Name();

  /**
   * Returns the meta object for the attribute '{@link datasemModeller.dmodel.Mechanism#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see datasemModeller.dmodel.Mechanism#getValue()
   * @see #getMechanism()
   * @generated
   */
  EAttribute getMechanism_Value();

  /**
   * Returns the meta object for the containment reference list '{@link datasemModeller.dmodel.Mechanism#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see datasemModeller.dmodel.Mechanism#getAttributes()
   * @see #getMechanism()
   * @generated
   */
  EReference getMechanism_Attributes();

  /**
   * Returns the meta object for class '{@link datasemModeller.dmodel.MechanismAttribute <em>Mechanism Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mechanism Attribute</em>'.
   * @see datasemModeller.dmodel.MechanismAttribute
   * @generated
   */
  EClass getMechanismAttribute();

  /**
   * Returns the meta object for the attribute '{@link datasemModeller.dmodel.MechanismAttribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasemModeller.dmodel.MechanismAttribute#getName()
   * @see #getMechanismAttribute()
   * @generated
   */
  EAttribute getMechanismAttribute_Name();

  /**
   * Returns the meta object for the attribute '{@link datasemModeller.dmodel.MechanismAttribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see datasemModeller.dmodel.MechanismAttribute#getValue()
   * @see #getMechanismAttribute()
   * @generated
   */
  EAttribute getMechanismAttribute_Value();

  /**
   * Returns the meta object for class '{@link datasemModeller.dmodel.WorkItemType <em>Work Item Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Work Item Type</em>'.
   * @see datasemModeller.dmodel.WorkItemType
   * @generated
   */
  EClass getWorkItemType();

  /**
   * Returns the meta object for the attribute '{@link datasemModeller.dmodel.WorkItemType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasemModeller.dmodel.WorkItemType#getName()
   * @see #getWorkItemType()
   * @generated
   */
  EAttribute getWorkItemType_Name();

  /**
   * Returns the meta object for the attribute '{@link datasemModeller.dmodel.WorkItemType#getHierarchy <em>Hierarchy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hierarchy</em>'.
   * @see datasemModeller.dmodel.WorkItemType#getHierarchy()
   * @see #getWorkItemType()
   * @generated
   */
  EAttribute getWorkItemType_Hierarchy();

  /**
   * Returns the meta object for the attribute '{@link datasemModeller.dmodel.WorkItemType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see datasemModeller.dmodel.WorkItemType#getId()
   * @see #getWorkItemType()
   * @generated
   */
  EAttribute getWorkItemType_Id();

  /**
   * Returns the meta object for class '{@link datasemModeller.dmodel.WorkItemNetwork <em>Work Item Network</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Work Item Network</em>'.
   * @see datasemModeller.dmodel.WorkItemNetwork
   * @generated
   */
  EClass getWorkItemNetwork();

  /**
   * Returns the meta object for the attribute '{@link datasemModeller.dmodel.WorkItemNetwork#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasemModeller.dmodel.WorkItemNetwork#getName()
   * @see #getWorkItemNetwork()
   * @generated
   */
  EAttribute getWorkItemNetwork_Name();

  /**
   * Returns the meta object for the containment reference list '{@link datasemModeller.dmodel.WorkItemNetwork#getWorkItems <em>Work Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Work Items</em>'.
   * @see datasemModeller.dmodel.WorkItemNetwork#getWorkItems()
   * @see #getWorkItemNetwork()
   * @generated
   */
  EReference getWorkItemNetwork_WorkItems();

  /**
   * Returns the meta object for the attribute '{@link datasemModeller.dmodel.WorkItemNetwork#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see datasemModeller.dmodel.WorkItemNetwork#getId()
   * @see #getWorkItemNetwork()
   * @generated
   */
  EAttribute getWorkItemNetwork_Id();

  /**
   * Returns the meta object for class '{@link datasemModeller.dmodel.WorkItem <em>Work Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Work Item</em>'.
   * @see datasemModeller.dmodel.WorkItem
   * @generated
   */
  EClass getWorkItem();

  /**
   * Returns the meta object for the attribute '{@link datasemModeller.dmodel.WorkItem#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasemModeller.dmodel.WorkItem#getName()
   * @see #getWorkItem()
   * @generated
   */
  EAttribute getWorkItem_Name();

  /**
   * Returns the meta object for the reference '{@link datasemModeller.dmodel.WorkItem#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see datasemModeller.dmodel.WorkItem#getType()
   * @see #getWorkItem()
   * @generated
   */
  EReference getWorkItem_Type();

  /**
   * Returns the meta object for the attribute '{@link datasemModeller.dmodel.WorkItem#isHasPredecessors <em>Has Predecessors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Predecessors</em>'.
   * @see datasemModeller.dmodel.WorkItem#isHasPredecessors()
   * @see #getWorkItem()
   * @generated
   */
  EAttribute getWorkItem_HasPredecessors();

  /**
   * Returns the meta object for the reference list '{@link datasemModeller.dmodel.WorkItem#getPTasks <em>PTasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>PTasks</em>'.
   * @see datasemModeller.dmodel.WorkItem#getPTasks()
   * @see #getWorkItem()
   * @generated
   */
  EReference getWorkItem_PTasks();

  /**
   * Returns the meta object for the attribute '{@link datasemModeller.dmodel.WorkItem#isHasSubtasks <em>Has Subtasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Subtasks</em>'.
   * @see datasemModeller.dmodel.WorkItem#isHasSubtasks()
   * @see #getWorkItem()
   * @generated
   */
  EAttribute getWorkItem_HasSubtasks();

  /**
   * Returns the meta object for the reference list '{@link datasemModeller.dmodel.WorkItem#getSTasks <em>STasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>STasks</em>'.
   * @see datasemModeller.dmodel.WorkItem#getSTasks()
   * @see #getWorkItem()
   * @generated
   */
  EReference getWorkItem_STasks();

  /**
   * Returns the meta object for the containment reference list '{@link datasemModeller.dmodel.WorkItem#getRequiredAnalysis <em>Required Analysis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Required Analysis</em>'.
   * @see datasemModeller.dmodel.WorkItem#getRequiredAnalysis()
   * @see #getWorkItem()
   * @generated
   */
  EReference getWorkItem_RequiredAnalysis();

  /**
   * Returns the meta object for the containment reference list '{@link datasemModeller.dmodel.WorkItem#getRequiredServices <em>Required Services</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Required Services</em>'.
   * @see datasemModeller.dmodel.WorkItem#getRequiredServices()
   * @see #getWorkItem()
   * @generated
   */
  EReference getWorkItem_RequiredServices();

  /**
   * Returns the meta object for the attribute '{@link datasemModeller.dmodel.WorkItem#isHasImpacts <em>Has Impacts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Impacts</em>'.
   * @see datasemModeller.dmodel.WorkItem#isHasImpacts()
   * @see #getWorkItem()
   * @generated
   */
  EAttribute getWorkItem_HasImpacts();

  /**
   * Returns the meta object for the containment reference list '{@link datasemModeller.dmodel.WorkItem#getImpacts <em>Impacts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Impacts</em>'.
   * @see datasemModeller.dmodel.WorkItem#getImpacts()
   * @see #getWorkItem()
   * @generated
   */
  EReference getWorkItem_Impacts();

  /**
   * Returns the meta object for the containment reference '{@link datasemModeller.dmodel.WorkItem#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see datasemModeller.dmodel.WorkItem#getValue()
   * @see #getWorkItem()
   * @generated
   */
  EReference getWorkItem_Value();

  /**
   * Returns the meta object for the attribute '{@link datasemModeller.dmodel.WorkItem#getArrivalTime <em>Arrival Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arrival Time</em>'.
   * @see datasemModeller.dmodel.WorkItem#getArrivalTime()
   * @see #getWorkItem()
   * @generated
   */
  EAttribute getWorkItem_ArrivalTime();

  /**
   * Returns the meta object for the attribute '{@link datasemModeller.dmodel.WorkItem#getDuration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Duration</em>'.
   * @see datasemModeller.dmodel.WorkItem#getDuration()
   * @see #getWorkItem()
   * @generated
   */
  EAttribute getWorkItem_Duration();

  /**
   * Returns the meta object for the attribute '{@link datasemModeller.dmodel.WorkItem#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see datasemModeller.dmodel.WorkItem#getId()
   * @see #getWorkItem()
   * @generated
   */
  EAttribute getWorkItem_Id();

  /**
   * Returns the meta object for class '{@link datasemModeller.dmodel.RequiredService <em>Required Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Required Service</em>'.
   * @see datasemModeller.dmodel.RequiredService
   * @generated
   */
  EClass getRequiredService();

  /**
   * Returns the meta object for the reference '{@link datasemModeller.dmodel.RequiredService#getServiceType <em>Service Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Service Type</em>'.
   * @see datasemModeller.dmodel.RequiredService#getServiceType()
   * @see #getRequiredService()
   * @generated
   */
  EReference getRequiredService_ServiceType();

  /**
   * Returns the meta object for the containment reference '{@link datasemModeller.dmodel.RequiredService#getEfforts <em>Efforts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Efforts</em>'.
   * @see datasemModeller.dmodel.RequiredService#getEfforts()
   * @see #getRequiredService()
   * @generated
   */
  EReference getRequiredService_Efforts();

  /**
   * Returns the meta object for class '{@link datasemModeller.dmodel.Impact <em>Impact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Impact</em>'.
   * @see datasemModeller.dmodel.Impact
   * @generated
   */
  EClass getImpact();

  /**
   * Returns the meta object for the reference '{@link datasemModeller.dmodel.Impact#getImpactWI <em>Impact WI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Impact WI</em>'.
   * @see datasemModeller.dmodel.Impact#getImpactWI()
   * @see #getImpact()
   * @generated
   */
  EReference getImpact_ImpactWI();

  /**
   * Returns the meta object for the containment reference '{@link datasemModeller.dmodel.Impact#getLikelihood <em>Likelihood</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Likelihood</em>'.
   * @see datasemModeller.dmodel.Impact#getLikelihood()
   * @see #getImpact()
   * @generated
   */
  EReference getImpact_Likelihood();

  /**
   * Returns the meta object for the containment reference '{@link datasemModeller.dmodel.Impact#getRisk <em>Risk</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Risk</em>'.
   * @see datasemModeller.dmodel.Impact#getRisk()
   * @see #getImpact()
   * @generated
   */
  EReference getImpact_Risk();

  /**
   * Returns the meta object for class '{@link datasemModeller.dmodel.ServiceProviderType <em>Service Provider Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service Provider Type</em>'.
   * @see datasemModeller.dmodel.ServiceProviderType
   * @generated
   */
  EClass getServiceProviderType();

  /**
   * Returns the meta object for the attribute '{@link datasemModeller.dmodel.ServiceProviderType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see datasemModeller.dmodel.ServiceProviderType#getId()
   * @see #getServiceProviderType()
   * @generated
   */
  EAttribute getServiceProviderType_Id();

  /**
   * Returns the meta object for the attribute '{@link datasemModeller.dmodel.ServiceProviderType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasemModeller.dmodel.ServiceProviderType#getName()
   * @see #getServiceProviderType()
   * @generated
   */
  EAttribute getServiceProviderType_Name();

  /**
   * Returns the meta object for the attribute '{@link datasemModeller.dmodel.ServiceProviderType#getHierarchy <em>Hierarchy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hierarchy</em>'.
   * @see datasemModeller.dmodel.ServiceProviderType#getHierarchy()
   * @see #getServiceProviderType()
   * @generated
   */
  EAttribute getServiceProviderType_Hierarchy();

  /**
   * Returns the meta object for class '{@link datasemModeller.dmodel.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service</em>'.
   * @see datasemModeller.dmodel.Service
   * @generated
   */
  EClass getService();

  /**
   * Returns the meta object for the attribute '{@link datasemModeller.dmodel.Service#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasemModeller.dmodel.Service#getName()
   * @see #getService()
   * @generated
   */
  EAttribute getService_Name();

  /**
   * Returns the meta object for the attribute '{@link datasemModeller.dmodel.Service#getHierarchy <em>Hierarchy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hierarchy</em>'.
   * @see datasemModeller.dmodel.Service#getHierarchy()
   * @see #getService()
   * @generated
   */
  EAttribute getService_Hierarchy();

  /**
   * Returns the meta object for the attribute '{@link datasemModeller.dmodel.Service#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see datasemModeller.dmodel.Service#getId()
   * @see #getService()
   * @generated
   */
  EAttribute getService_Id();

  /**
   * Returns the meta object for class '{@link datasemModeller.dmodel.ServiceProvider <em>Service Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service Provider</em>'.
   * @see datasemModeller.dmodel.ServiceProvider
   * @generated
   */
  EClass getServiceProvider();

  /**
   * Returns the meta object for the attribute '{@link datasemModeller.dmodel.ServiceProvider#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasemModeller.dmodel.ServiceProvider#getName()
   * @see #getServiceProvider()
   * @generated
   */
  EAttribute getServiceProvider_Name();

  /**
   * Returns the meta object for the reference '{@link datasemModeller.dmodel.ServiceProvider#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see datasemModeller.dmodel.ServiceProvider#getType()
   * @see #getServiceProvider()
   * @generated
   */
  EReference getServiceProvider_Type();

  /**
   * Returns the meta object for the reference list '{@link datasemModeller.dmodel.ServiceProvider#getAssignTo <em>Assign To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Assign To</em>'.
   * @see datasemModeller.dmodel.ServiceProvider#getAssignTo()
   * @see #getServiceProvider()
   * @generated
   */
  EReference getServiceProvider_AssignTo();

  /**
   * Returns the meta object for the reference '{@link datasemModeller.dmodel.ServiceProvider#getGovernanceStrategy <em>Governance Strategy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Governance Strategy</em>'.
   * @see datasemModeller.dmodel.ServiceProvider#getGovernanceStrategy()
   * @see #getServiceProvider()
   * @generated
   */
  EReference getServiceProvider_GovernanceStrategy();

  /**
   * Returns the meta object for the containment reference list '{@link datasemModeller.dmodel.ServiceProvider#getResources <em>Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Resources</em>'.
   * @see datasemModeller.dmodel.ServiceProvider#getResources()
   * @see #getServiceProvider()
   * @generated
   */
  EReference getServiceProvider_Resources();

  /**
   * Returns the meta object for the attribute '{@link datasemModeller.dmodel.ServiceProvider#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see datasemModeller.dmodel.ServiceProvider#getId()
   * @see #getServiceProvider()
   * @generated
   */
  EAttribute getServiceProvider_Id();

  /**
   * Returns the meta object for class '{@link datasemModeller.dmodel.Asset <em>Asset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Asset</em>'.
   * @see datasemModeller.dmodel.Asset
   * @generated
   */
  EClass getAsset();

  /**
   * Returns the meta object for the attribute '{@link datasemModeller.dmodel.Asset#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasemModeller.dmodel.Asset#getName()
   * @see #getAsset()
   * @generated
   */
  EAttribute getAsset_Name();

  /**
   * Returns the meta object for the containment reference '{@link datasemModeller.dmodel.Asset#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Number</em>'.
   * @see datasemModeller.dmodel.Asset#getNumber()
   * @see #getAsset()
   * @generated
   */
  EReference getAsset_Number();

  /**
   * Returns the meta object for the containment reference list '{@link datasemModeller.dmodel.Asset#getSkillSet <em>Skill Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Skill Set</em>'.
   * @see datasemModeller.dmodel.Asset#getSkillSet()
   * @see #getAsset()
   * @generated
   */
  EReference getAsset_SkillSet();

  /**
   * Returns the meta object for the attribute '{@link datasemModeller.dmodel.Asset#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see datasemModeller.dmodel.Asset#getId()
   * @see #getAsset()
   * @generated
   */
  EAttribute getAsset_Id();

  /**
   * Returns the meta object for class '{@link datasemModeller.dmodel.Skill <em>Skill</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Skill</em>'.
   * @see datasemModeller.dmodel.Skill
   * @generated
   */
  EClass getSkill();

  /**
   * Returns the meta object for the reference '{@link datasemModeller.dmodel.Skill#getService <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Service</em>'.
   * @see datasemModeller.dmodel.Skill#getService()
   * @see #getSkill()
   * @generated
   */
  EReference getSkill_Service();

  /**
   * Returns the meta object for the containment reference '{@link datasemModeller.dmodel.Skill#getEfficiency <em>Efficiency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Efficiency</em>'.
   * @see datasemModeller.dmodel.Skill#getEfficiency()
   * @see #getSkill()
   * @generated
   */
  EReference getSkill_Efficiency();

  /**
   * Returns the meta object for class '{@link datasemModeller.dmodel.ExperimentVariable <em>Experiment Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Experiment Variable</em>'.
   * @see datasemModeller.dmodel.ExperimentVariable
   * @generated
   */
  EClass getExperimentVariable();

  /**
   * Returns the meta object for the attribute '{@link datasemModeller.dmodel.ExperimentVariable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasemModeller.dmodel.ExperimentVariable#getName()
   * @see #getExperimentVariable()
   * @generated
   */
  EAttribute getExperimentVariable_Name();

  /**
   * Returns the meta object for the attribute '{@link datasemModeller.dmodel.ExperimentVariable#isBoolean <em>Boolean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Boolean</em>'.
   * @see datasemModeller.dmodel.ExperimentVariable#isBoolean()
   * @see #getExperimentVariable()
   * @generated
   */
  EAttribute getExperimentVariable_Boolean();

  /**
   * Returns the meta object for the attribute '{@link datasemModeller.dmodel.ExperimentVariable#isBooleanValue <em>Boolean Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Boolean Value</em>'.
   * @see datasemModeller.dmodel.ExperimentVariable#isBooleanValue()
   * @see #getExperimentVariable()
   * @generated
   */
  EAttribute getExperimentVariable_BooleanValue();

  /**
   * Returns the meta object for the attribute '{@link datasemModeller.dmodel.ExperimentVariable#isNum <em>Num</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Num</em>'.
   * @see datasemModeller.dmodel.ExperimentVariable#isNum()
   * @see #getExperimentVariable()
   * @generated
   */
  EAttribute getExperimentVariable_Num();

  /**
   * Returns the meta object for the attribute '{@link datasemModeller.dmodel.ExperimentVariable#getNumValue <em>Num Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Num Value</em>'.
   * @see datasemModeller.dmodel.ExperimentVariable#getNumValue()
   * @see #getExperimentVariable()
   * @generated
   */
  EAttribute getExperimentVariable_NumValue();

  /**
   * Returns the meta object for the attribute '{@link datasemModeller.dmodel.ExperimentVariable#isDistribution <em>Distribution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Distribution</em>'.
   * @see datasemModeller.dmodel.ExperimentVariable#isDistribution()
   * @see #getExperimentVariable()
   * @generated
   */
  EAttribute getExperimentVariable_Distribution();

  /**
   * Returns the meta object for the containment reference '{@link datasemModeller.dmodel.ExperimentVariable#getNumDist <em>Num Dist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Num Dist</em>'.
   * @see datasemModeller.dmodel.ExperimentVariable#getNumDist()
   * @see #getExperimentVariable()
   * @generated
   */
  EReference getExperimentVariable_NumDist();

  /**
   * Returns the meta object for the attribute '{@link datasemModeller.dmodel.ExperimentVariable#isString <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String</em>'.
   * @see datasemModeller.dmodel.ExperimentVariable#isString()
   * @see #getExperimentVariable()
   * @generated
   */
  EAttribute getExperimentVariable_String();

  /**
   * Returns the meta object for the attribute '{@link datasemModeller.dmodel.ExperimentVariable#getStringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String Value</em>'.
   * @see datasemModeller.dmodel.ExperimentVariable#getStringValue()
   * @see #getExperimentVariable()
   * @generated
   */
  EAttribute getExperimentVariable_StringValue();

  /**
   * Returns the meta object for the attribute '{@link datasemModeller.dmodel.ExperimentVariable#isStrategy <em>Strategy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Strategy</em>'.
   * @see datasemModeller.dmodel.ExperimentVariable#isStrategy()
   * @see #getExperimentVariable()
   * @generated
   */
  EAttribute getExperimentVariable_Strategy();

  /**
   * Returns the meta object for the containment reference '{@link datasemModeller.dmodel.ExperimentVariable#getStrategyValue <em>Strategy Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Strategy Value</em>'.
   * @see datasemModeller.dmodel.ExperimentVariable#getStrategyValue()
   * @see #getExperimentVariable()
   * @generated
   */
  EReference getExperimentVariable_StrategyValue();

  /**
   * Returns the meta object for class '{@link datasemModeller.dmodel.WINReplication <em>WIN Replication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>WIN Replication</em>'.
   * @see datasemModeller.dmodel.WINReplication
   * @generated
   */
  EClass getWINReplication();

  /**
   * Returns the meta object for the reference '{@link datasemModeller.dmodel.WINReplication#getWorkItemNetwork <em>Work Item Network</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Work Item Network</em>'.
   * @see datasemModeller.dmodel.WINReplication#getWorkItemNetwork()
   * @see #getWINReplication()
   * @generated
   */
  EReference getWINReplication_WorkItemNetwork();

  /**
   * Returns the meta object for the attribute '{@link datasemModeller.dmodel.WINReplication#getNumReplications <em>Num Replications</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Num Replications</em>'.
   * @see datasemModeller.dmodel.WINReplication#getNumReplications()
   * @see #getWINReplication()
   * @generated
   */
  EAttribute getWINReplication_NumReplications();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DmodelFactory getDmodelFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link datasemModeller.dmodel.impl.ModelBuilderImpl <em>Model Builder</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasemModeller.dmodel.impl.ModelBuilderImpl
     * @see datasemModeller.dmodel.impl.DmodelPackageImpl#getModelBuilder()
     * @generated
     */
    EClass MODEL_BUILDER = eINSTANCE.getModelBuilder();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL_BUILDER__NAME = eINSTANCE.getModelBuilder_Name();

    /**
     * The meta object literal for the '<em><b>User Libraries</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BUILDER__USER_LIBRARIES = eINSTANCE.getModelBuilder_UserLibraries();

    /**
     * The meta object literal for the '<em><b>Experiment Model</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BUILDER__EXPERIMENT_MODEL = eINSTANCE.getModelBuilder_ExperimentModel();

    /**
     * The meta object literal for the '{@link datasemModeller.dmodel.impl.UserLibrariesImpl <em>User Libraries</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasemModeller.dmodel.impl.UserLibrariesImpl
     * @see datasemModeller.dmodel.impl.DmodelPackageImpl#getUserLibraries()
     * @generated
     */
    EClass USER_LIBRARIES = eINSTANCE.getUserLibraries();

    /**
     * The meta object literal for the '<em><b>Service Provider Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USER_LIBRARIES__SERVICE_PROVIDER_TYPES = eINSTANCE.getUserLibraries_ServiceProviderTypes();

    /**
     * The meta object literal for the '<em><b>Work Item Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USER_LIBRARIES__WORK_ITEM_TYPES = eINSTANCE.getUserLibraries_WorkItemTypes();

    /**
     * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USER_LIBRARIES__SERVICES = eINSTANCE.getUserLibraries_Services();

    /**
     * The meta object literal for the '<em><b>Governance Strategies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USER_LIBRARIES__GOVERNANCE_STRATEGIES = eINSTANCE.getUserLibraries_GovernanceStrategies();

    /**
     * The meta object literal for the '{@link datasemModeller.dmodel.impl.ExperimentModelImpl <em>Experiment Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasemModeller.dmodel.impl.ExperimentModelImpl
     * @see datasemModeller.dmodel.impl.DmodelPackageImpl#getExperimentModel()
     * @generated
     */
    EClass EXPERIMENT_MODEL = eINSTANCE.getExperimentModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPERIMENT_MODEL__NAME = eINSTANCE.getExperimentModel_Name();

    /**
     * The meta object literal for the '<em><b>Experiment Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPERIMENT_MODEL__EXPERIMENT_VARIABLES = eINSTANCE.getExperimentModel_ExperimentVariables();

    /**
     * The meta object literal for the '<em><b>Service Providers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPERIMENT_MODEL__SERVICE_PROVIDERS = eINSTANCE.getExperimentModel_ServiceProviders();

    /**
     * The meta object literal for the '<em><b>Work Item Networks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPERIMENT_MODEL__WORK_ITEM_NETWORKS = eINSTANCE.getExperimentModel_WorkItemNetworks();

    /**
     * The meta object literal for the '<em><b>WIN Replications</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPERIMENT_MODEL__WIN_REPLICATIONS = eINSTANCE.getExperimentModel_WINReplications();

    /**
     * The meta object literal for the '{@link datasemModeller.dmodel.impl.AbstractParameterImpl <em>Abstract Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasemModeller.dmodel.impl.AbstractParameterImpl
     * @see datasemModeller.dmodel.impl.DmodelPackageImpl#getAbstractParameter()
     * @generated
     */
    EClass ABSTRACT_PARAMETER = eINSTANCE.getAbstractParameter();

    /**
     * The meta object literal for the '<em><b>Is Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_PARAMETER__IS_VARIABLE = eINSTANCE.getAbstractParameter_IsVariable();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_PARAMETER__VARIABLE = eINSTANCE.getAbstractParameter_Variable();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_PARAMETER__VALUE = eINSTANCE.getAbstractParameter_Value();

    /**
     * The meta object literal for the '{@link datasemModeller.dmodel.impl.NumExpressionImpl <em>Num Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasemModeller.dmodel.impl.NumExpressionImpl
     * @see datasemModeller.dmodel.impl.DmodelPackageImpl#getNumExpression()
     * @generated
     */
    EClass NUM_EXPRESSION = eINSTANCE.getNumExpression();

    /**
     * The meta object literal for the '<em><b>Num Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUM_EXPRESSION__NUM_VALUE = eINSTANCE.getNumExpression_NumValue();

    /**
     * The meta object literal for the '<em><b>Distribution</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUM_EXPRESSION__DISTRIBUTION = eINSTANCE.getNumExpression_Distribution();

    /**
     * The meta object literal for the '<em><b>Num Dist</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUM_EXPRESSION__NUM_DIST = eINSTANCE.getNumExpression_NumDist();

    /**
     * The meta object literal for the '{@link datasemModeller.dmodel.impl.DistributionImpl <em>Distribution</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasemModeller.dmodel.impl.DistributionImpl
     * @see datasemModeller.dmodel.impl.DmodelPackageImpl#getDistribution()
     * @generated
     */
    EClass DISTRIBUTION = eINSTANCE.getDistribution();

    /**
     * The meta object literal for the '<em><b>Is Normal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DISTRIBUTION__IS_NORMAL = eINSTANCE.getDistribution_IsNormal();

    /**
     * The meta object literal for the '<em><b>Is Uniform</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DISTRIBUTION__IS_UNIFORM = eINSTANCE.getDistribution_IsUniform();

    /**
     * The meta object literal for the '<em><b>Is Exponential</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DISTRIBUTION__IS_EXPONENTIAL = eINSTANCE.getDistribution_IsExponential();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DISTRIBUTION__PARAMETERS = eINSTANCE.getDistribution_Parameters();

    /**
     * The meta object literal for the '{@link datasemModeller.dmodel.impl.GovernanceStrategyImpl <em>Governance Strategy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasemModeller.dmodel.impl.GovernanceStrategyImpl
     * @see datasemModeller.dmodel.impl.DmodelPackageImpl#getGovernanceStrategy()
     * @generated
     */
    EClass GOVERNANCE_STRATEGY = eINSTANCE.getGovernanceStrategy();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOVERNANCE_STRATEGY__NAME = eINSTANCE.getGovernanceStrategy_Name();

    /**
     * The meta object literal for the '<em><b>Pull Strategy</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOVERNANCE_STRATEGY__PULL_STRATEGY = eINSTANCE.getGovernanceStrategy_PullStrategy();

    /**
     * The meta object literal for the '{@link datasemModeller.dmodel.impl.PullStrategyImpl <em>Pull Strategy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasemModeller.dmodel.impl.PullStrategyImpl
     * @see datasemModeller.dmodel.impl.DmodelPackageImpl#getPullStrategy()
     * @generated
     */
    EClass PULL_STRATEGY = eINSTANCE.getPullStrategy();

    /**
     * The meta object literal for the '<em><b>Mechanisms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PULL_STRATEGY__MECHANISMS = eINSTANCE.getPullStrategy_Mechanisms();

    /**
     * The meta object literal for the '{@link datasemModeller.dmodel.impl.MechanismImpl <em>Mechanism</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasemModeller.dmodel.impl.MechanismImpl
     * @see datasemModeller.dmodel.impl.DmodelPackageImpl#getMechanism()
     * @generated
     */
    EClass MECHANISM = eINSTANCE.getMechanism();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MECHANISM__NAME = eINSTANCE.getMechanism_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MECHANISM__VALUE = eINSTANCE.getMechanism_Value();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MECHANISM__ATTRIBUTES = eINSTANCE.getMechanism_Attributes();

    /**
     * The meta object literal for the '{@link datasemModeller.dmodel.impl.MechanismAttributeImpl <em>Mechanism Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasemModeller.dmodel.impl.MechanismAttributeImpl
     * @see datasemModeller.dmodel.impl.DmodelPackageImpl#getMechanismAttribute()
     * @generated
     */
    EClass MECHANISM_ATTRIBUTE = eINSTANCE.getMechanismAttribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MECHANISM_ATTRIBUTE__NAME = eINSTANCE.getMechanismAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MECHANISM_ATTRIBUTE__VALUE = eINSTANCE.getMechanismAttribute_Value();

    /**
     * The meta object literal for the '{@link datasemModeller.dmodel.impl.WorkItemTypeImpl <em>Work Item Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasemModeller.dmodel.impl.WorkItemTypeImpl
     * @see datasemModeller.dmodel.impl.DmodelPackageImpl#getWorkItemType()
     * @generated
     */
    EClass WORK_ITEM_TYPE = eINSTANCE.getWorkItemType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM_TYPE__NAME = eINSTANCE.getWorkItemType_Name();

    /**
     * The meta object literal for the '<em><b>Hierarchy</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM_TYPE__HIERARCHY = eINSTANCE.getWorkItemType_Hierarchy();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM_TYPE__ID = eINSTANCE.getWorkItemType_Id();

    /**
     * The meta object literal for the '{@link datasemModeller.dmodel.impl.WorkItemNetworkImpl <em>Work Item Network</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasemModeller.dmodel.impl.WorkItemNetworkImpl
     * @see datasemModeller.dmodel.impl.DmodelPackageImpl#getWorkItemNetwork()
     * @generated
     */
    EClass WORK_ITEM_NETWORK = eINSTANCE.getWorkItemNetwork();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM_NETWORK__NAME = eINSTANCE.getWorkItemNetwork_Name();

    /**
     * The meta object literal for the '<em><b>Work Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM_NETWORK__WORK_ITEMS = eINSTANCE.getWorkItemNetwork_WorkItems();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM_NETWORK__ID = eINSTANCE.getWorkItemNetwork_Id();

    /**
     * The meta object literal for the '{@link datasemModeller.dmodel.impl.WorkItemImpl <em>Work Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasemModeller.dmodel.impl.WorkItemImpl
     * @see datasemModeller.dmodel.impl.DmodelPackageImpl#getWorkItem()
     * @generated
     */
    EClass WORK_ITEM = eINSTANCE.getWorkItem();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM__NAME = eINSTANCE.getWorkItem_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM__TYPE = eINSTANCE.getWorkItem_Type();

    /**
     * The meta object literal for the '<em><b>Has Predecessors</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM__HAS_PREDECESSORS = eINSTANCE.getWorkItem_HasPredecessors();

    /**
     * The meta object literal for the '<em><b>PTasks</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM__PTASKS = eINSTANCE.getWorkItem_PTasks();

    /**
     * The meta object literal for the '<em><b>Has Subtasks</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM__HAS_SUBTASKS = eINSTANCE.getWorkItem_HasSubtasks();

    /**
     * The meta object literal for the '<em><b>STasks</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM__STASKS = eINSTANCE.getWorkItem_STasks();

    /**
     * The meta object literal for the '<em><b>Required Analysis</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM__REQUIRED_ANALYSIS = eINSTANCE.getWorkItem_RequiredAnalysis();

    /**
     * The meta object literal for the '<em><b>Required Services</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM__REQUIRED_SERVICES = eINSTANCE.getWorkItem_RequiredServices();

    /**
     * The meta object literal for the '<em><b>Has Impacts</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM__HAS_IMPACTS = eINSTANCE.getWorkItem_HasImpacts();

    /**
     * The meta object literal for the '<em><b>Impacts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM__IMPACTS = eINSTANCE.getWorkItem_Impacts();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM__VALUE = eINSTANCE.getWorkItem_Value();

    /**
     * The meta object literal for the '<em><b>Arrival Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM__ARRIVAL_TIME = eINSTANCE.getWorkItem_ArrivalTime();

    /**
     * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM__DURATION = eINSTANCE.getWorkItem_Duration();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM__ID = eINSTANCE.getWorkItem_Id();

    /**
     * The meta object literal for the '{@link datasemModeller.dmodel.impl.RequiredServiceImpl <em>Required Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasemModeller.dmodel.impl.RequiredServiceImpl
     * @see datasemModeller.dmodel.impl.DmodelPackageImpl#getRequiredService()
     * @generated
     */
    EClass REQUIRED_SERVICE = eINSTANCE.getRequiredService();

    /**
     * The meta object literal for the '<em><b>Service Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIRED_SERVICE__SERVICE_TYPE = eINSTANCE.getRequiredService_ServiceType();

    /**
     * The meta object literal for the '<em><b>Efforts</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIRED_SERVICE__EFFORTS = eINSTANCE.getRequiredService_Efforts();

    /**
     * The meta object literal for the '{@link datasemModeller.dmodel.impl.ImpactImpl <em>Impact</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasemModeller.dmodel.impl.ImpactImpl
     * @see datasemModeller.dmodel.impl.DmodelPackageImpl#getImpact()
     * @generated
     */
    EClass IMPACT = eINSTANCE.getImpact();

    /**
     * The meta object literal for the '<em><b>Impact WI</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPACT__IMPACT_WI = eINSTANCE.getImpact_ImpactWI();

    /**
     * The meta object literal for the '<em><b>Likelihood</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPACT__LIKELIHOOD = eINSTANCE.getImpact_Likelihood();

    /**
     * The meta object literal for the '<em><b>Risk</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPACT__RISK = eINSTANCE.getImpact_Risk();

    /**
     * The meta object literal for the '{@link datasemModeller.dmodel.impl.ServiceProviderTypeImpl <em>Service Provider Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasemModeller.dmodel.impl.ServiceProviderTypeImpl
     * @see datasemModeller.dmodel.impl.DmodelPackageImpl#getServiceProviderType()
     * @generated
     */
    EClass SERVICE_PROVIDER_TYPE = eINSTANCE.getServiceProviderType();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE_PROVIDER_TYPE__ID = eINSTANCE.getServiceProviderType_Id();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE_PROVIDER_TYPE__NAME = eINSTANCE.getServiceProviderType_Name();

    /**
     * The meta object literal for the '<em><b>Hierarchy</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE_PROVIDER_TYPE__HIERARCHY = eINSTANCE.getServiceProviderType_Hierarchy();

    /**
     * The meta object literal for the '{@link datasemModeller.dmodel.impl.ServiceImpl <em>Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasemModeller.dmodel.impl.ServiceImpl
     * @see datasemModeller.dmodel.impl.DmodelPackageImpl#getService()
     * @generated
     */
    EClass SERVICE = eINSTANCE.getService();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

    /**
     * The meta object literal for the '<em><b>Hierarchy</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__HIERARCHY = eINSTANCE.getService_Hierarchy();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__ID = eINSTANCE.getService_Id();

    /**
     * The meta object literal for the '{@link datasemModeller.dmodel.impl.ServiceProviderImpl <em>Service Provider</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasemModeller.dmodel.impl.ServiceProviderImpl
     * @see datasemModeller.dmodel.impl.DmodelPackageImpl#getServiceProvider()
     * @generated
     */
    EClass SERVICE_PROVIDER = eINSTANCE.getServiceProvider();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE_PROVIDER__NAME = eINSTANCE.getServiceProvider_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_PROVIDER__TYPE = eINSTANCE.getServiceProvider_Type();

    /**
     * The meta object literal for the '<em><b>Assign To</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_PROVIDER__ASSIGN_TO = eINSTANCE.getServiceProvider_AssignTo();

    /**
     * The meta object literal for the '<em><b>Governance Strategy</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_PROVIDER__GOVERNANCE_STRATEGY = eINSTANCE.getServiceProvider_GovernanceStrategy();

    /**
     * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_PROVIDER__RESOURCES = eINSTANCE.getServiceProvider_Resources();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE_PROVIDER__ID = eINSTANCE.getServiceProvider_Id();

    /**
     * The meta object literal for the '{@link datasemModeller.dmodel.impl.AssetImpl <em>Asset</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasemModeller.dmodel.impl.AssetImpl
     * @see datasemModeller.dmodel.impl.DmodelPackageImpl#getAsset()
     * @generated
     */
    EClass ASSET = eINSTANCE.getAsset();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSET__NAME = eINSTANCE.getAsset_Name();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSET__NUMBER = eINSTANCE.getAsset_Number();

    /**
     * The meta object literal for the '<em><b>Skill Set</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSET__SKILL_SET = eINSTANCE.getAsset_SkillSet();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSET__ID = eINSTANCE.getAsset_Id();

    /**
     * The meta object literal for the '{@link datasemModeller.dmodel.impl.SkillImpl <em>Skill</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasemModeller.dmodel.impl.SkillImpl
     * @see datasemModeller.dmodel.impl.DmodelPackageImpl#getSkill()
     * @generated
     */
    EClass SKILL = eINSTANCE.getSkill();

    /**
     * The meta object literal for the '<em><b>Service</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SKILL__SERVICE = eINSTANCE.getSkill_Service();

    /**
     * The meta object literal for the '<em><b>Efficiency</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SKILL__EFFICIENCY = eINSTANCE.getSkill_Efficiency();

    /**
     * The meta object literal for the '{@link datasemModeller.dmodel.impl.ExperimentVariableImpl <em>Experiment Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasemModeller.dmodel.impl.ExperimentVariableImpl
     * @see datasemModeller.dmodel.impl.DmodelPackageImpl#getExperimentVariable()
     * @generated
     */
    EClass EXPERIMENT_VARIABLE = eINSTANCE.getExperimentVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPERIMENT_VARIABLE__NAME = eINSTANCE.getExperimentVariable_Name();

    /**
     * The meta object literal for the '<em><b>Boolean</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPERIMENT_VARIABLE__BOOLEAN = eINSTANCE.getExperimentVariable_Boolean();

    /**
     * The meta object literal for the '<em><b>Boolean Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPERIMENT_VARIABLE__BOOLEAN_VALUE = eINSTANCE.getExperimentVariable_BooleanValue();

    /**
     * The meta object literal for the '<em><b>Num</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPERIMENT_VARIABLE__NUM = eINSTANCE.getExperimentVariable_Num();

    /**
     * The meta object literal for the '<em><b>Num Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPERIMENT_VARIABLE__NUM_VALUE = eINSTANCE.getExperimentVariable_NumValue();

    /**
     * The meta object literal for the '<em><b>Distribution</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPERIMENT_VARIABLE__DISTRIBUTION = eINSTANCE.getExperimentVariable_Distribution();

    /**
     * The meta object literal for the '<em><b>Num Dist</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPERIMENT_VARIABLE__NUM_DIST = eINSTANCE.getExperimentVariable_NumDist();

    /**
     * The meta object literal for the '<em><b>String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPERIMENT_VARIABLE__STRING = eINSTANCE.getExperimentVariable_String();

    /**
     * The meta object literal for the '<em><b>String Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPERIMENT_VARIABLE__STRING_VALUE = eINSTANCE.getExperimentVariable_StringValue();

    /**
     * The meta object literal for the '<em><b>Strategy</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPERIMENT_VARIABLE__STRATEGY = eINSTANCE.getExperimentVariable_Strategy();

    /**
     * The meta object literal for the '<em><b>Strategy Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPERIMENT_VARIABLE__STRATEGY_VALUE = eINSTANCE.getExperimentVariable_StrategyValue();

    /**
     * The meta object literal for the '{@link datasemModeller.dmodel.impl.WINReplicationImpl <em>WIN Replication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasemModeller.dmodel.impl.WINReplicationImpl
     * @see datasemModeller.dmodel.impl.DmodelPackageImpl#getWINReplication()
     * @generated
     */
    EClass WIN_REPLICATION = eINSTANCE.getWINReplication();

    /**
     * The meta object literal for the '<em><b>Work Item Network</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WIN_REPLICATION__WORK_ITEM_NETWORK = eINSTANCE.getWINReplication_WorkItemNetwork();

    /**
     * The meta object literal for the '<em><b>Num Replications</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WIN_REPLICATION__NUM_REPLICATIONS = eINSTANCE.getWINReplication_NumReplications();

  }

} //DmodelPackage
