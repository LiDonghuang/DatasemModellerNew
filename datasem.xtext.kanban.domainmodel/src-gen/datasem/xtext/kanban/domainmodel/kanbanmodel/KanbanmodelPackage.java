/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel;

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
 * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelFactory
 * @model kind="package"
 * @generated
 */
public interface KanbanmodelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "kanbanmodel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.datasem/kanban/domainmodel/Kanbanmodel";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "kanbanmodel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  KanbanmodelPackage eINSTANCE = datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl.init();

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ModelBuilderImpl <em>Model Builder</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ModelBuilderImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getModelBuilder()
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
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BUILDER__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>User Libraries</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BUILDER__USER_LIBRARIES = 2;

  /**
   * The feature id for the '<em><b>Experiment Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BUILDER__EXPERIMENT_MODEL = 3;

  /**
   * The number of structural features of the '<em>Model Builder</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BUILDER_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ExperimentModelImpl <em>Experiment Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ExperimentModelImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getExperimentModel()
   * @generated
   */
  int EXPERIMENT_MODEL = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIMENT_MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIMENT_MODEL__PATH = 1;

  /**
   * The feature id for the '<em><b>Experiment Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIMENT_MODEL__EXPERIMENT_VARIABLES = 2;

  /**
   * The feature id for the '<em><b>Service Providers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIMENT_MODEL__SERVICE_PROVIDERS = 3;

  /**
   * The feature id for the '<em><b>Work Sources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIMENT_MODEL__WORK_SOURCES = 4;

  /**
   * The feature id for the '<em><b>Work Item Networks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIMENT_MODEL__WORK_ITEM_NETWORKS = 5;

  /**
   * The feature id for the '<em><b>WIN Replications</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIMENT_MODEL__WIN_REPLICATIONS = 6;

  /**
   * The feature id for the '<em><b>Indicators</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIMENT_MODEL__INDICATORS = 7;

  /**
   * The number of structural features of the '<em>Experiment Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIMENT_MODEL_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.UserLibrariesImpl <em>User Libraries</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.UserLibrariesImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getUserLibraries()
   * @generated
   */
  int USER_LIBRARIES = 2;

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
   * The feature id for the '<em><b>Process Models</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_LIBRARIES__PROCESS_MODELS = 2;

  /**
   * The feature id for the '<em><b>Class Of Services</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_LIBRARIES__CLASS_OF_SERVICES = 3;

  /**
   * The feature id for the '<em><b>Services</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_LIBRARIES__SERVICES = 4;

  /**
   * The feature id for the '<em><b>Governance Strategies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_LIBRARIES__GOVERNANCE_STRATEGIES = 5;

  /**
   * The number of structural features of the '<em>User Libraries</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_LIBRARIES_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AbstractParameterImpl <em>Abstract Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AbstractParameterImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getAbstractParameter()
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
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.NumExpressionImpl <em>Num Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.NumExpressionImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getNumExpression()
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
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.OperatorImpl <em>Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.OperatorImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getOperator()
   * @generated
   */
  int OPERATOR = 5;

  /**
   * The feature id for the '<em><b>Equal To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR__EQUAL_TO = 0;

  /**
   * The feature id for the '<em><b>Larger Than</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR__LARGER_THAN = 1;

  /**
   * The feature id for the '<em><b>Smaller Than</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR__SMALLER_THAN = 2;

  /**
   * The feature id for the '<em><b>Larger Or Equal To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR__LARGER_OR_EQUAL_TO = 3;

  /**
   * The feature id for the '<em><b>Smaller Or Equal To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR__SMALLER_OR_EQUAL_TO = 4;

  /**
   * The feature id for the '<em><b>Not Equal To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR__NOT_EQUAL_TO = 5;

  /**
   * The number of structural features of the '<em>Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ExperimentVariableImpl <em>Experiment Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ExperimentVariableImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getExperimentVariable()
   * @generated
   */
  int EXPERIMENT_VARIABLE = 6;

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
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.DistributionImpl <em>Distribution</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.DistributionImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getDistribution()
   * @generated
   */
  int DISTRIBUTION = 7;

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
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WINReplicationImpl <em>WIN Replication</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WINReplicationImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWINReplication()
   * @generated
   */
  int WIN_REPLICATION = 8;

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
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.GovernanceStrategyImpl <em>Governance Strategy</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.GovernanceStrategyImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getGovernanceStrategy()
   * @generated
   */
  int GOVERNANCE_STRATEGY = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOVERNANCE_STRATEGY__NAME = 0;

  /**
   * The feature id for the '<em><b>Pull</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOVERNANCE_STRATEGY__PULL = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOVERNANCE_STRATEGY__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Pull Strategy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOVERNANCE_STRATEGY__PULL_STRATEGY = 3;

  /**
   * The feature id for the '<em><b>Push</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOVERNANCE_STRATEGY__PUSH = 4;

  /**
   * The feature id for the '<em><b>Push Strategy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOVERNANCE_STRATEGY__PUSH_STRATEGY = 5;

  /**
   * The feature id for the '<em><b>Cnp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOVERNANCE_STRATEGY__CNP = 6;

  /**
   * The feature id for the '<em><b>Contract Net Protocal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOVERNANCE_STRATEGY__CONTRACT_NET_PROTOCAL = 7;

  /**
   * The feature id for the '<em><b>Processes</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOVERNANCE_STRATEGY__PROCESSES = 8;

  /**
   * The number of structural features of the '<em>Governance Strategy</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOVERNANCE_STRATEGY_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ContractNetProtocolImpl <em>Contract Net Protocol</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ContractNetProtocolImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getContractNetProtocol()
   * @generated
   */
  int CONTRACT_NET_PROTOCOL = 10;

  /**
   * The feature id for the '<em><b>Mechanisms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACT_NET_PROTOCOL__MECHANISMS = 0;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACT_NET_PROTOCOL__VARIABLES = 1;

  /**
   * The feature id for the '<em><b>Role Behaviors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACT_NET_PROTOCOL__ROLE_BEHAVIORS = 2;

  /**
   * The number of structural features of the '<em>Contract Net Protocol</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACT_NET_PROTOCOL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.RoleBehaviorImpl <em>Role Behavior</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.RoleBehaviorImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getRoleBehavior()
   * @generated
   */
  int ROLE_BEHAVIOR = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_BEHAVIOR__NAME = 0;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_BEHAVIOR__ACTIONS = 1;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_BEHAVIOR__STATES = 2;

  /**
   * The number of structural features of the '<em>Role Behavior</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_BEHAVIOR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ProcessModelImpl <em>Process Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ProcessModelImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getProcessModel()
   * @generated
   */
  int PROCESS_MODEL = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL__ACTIONS = 1;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL__STATES = 2;

  /**
   * The number of structural features of the '<em>Process Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.PullStrategyImpl <em>Pull Strategy</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.PullStrategyImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getPullStrategy()
   * @generated
   */
  int PULL_STRATEGY = 13;

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
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.PushStrategyImpl <em>Push Strategy</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.PushStrategyImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getPushStrategy()
   * @generated
   */
  int PUSH_STRATEGY = 14;

  /**
   * The feature id for the '<em><b>Mechanisms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUSH_STRATEGY__MECHANISMS = 0;

  /**
   * The number of structural features of the '<em>Push Strategy</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUSH_STRATEGY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.MechanismImpl <em>Mechanism</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.MechanismImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getMechanism()
   * @generated
   */
  int MECHANISM = 15;

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
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MECHANISM__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MECHANISM__ATTRIBUTES = 3;

  /**
   * The number of structural features of the '<em>Mechanism</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MECHANISM_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.MechanismAttributeImpl <em>Mechanism Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.MechanismAttributeImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getMechanismAttribute()
   * @generated
   */
  int MECHANISM_ATTRIBUTE = 16;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MECHANISM_ATTRIBUTE__ATTRIBUTE = 0;

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
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkSourceImpl <em>Work Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkSourceImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWorkSource()
   * @generated
   */
  int WORK_SOURCE = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_SOURCE__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_SOURCE__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Assign To</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_SOURCE__ASSIGN_TO = 2;

  /**
   * The number of structural features of the '<em>Work Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_SOURCE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemNetworkImpl <em>Work Item Network</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemNetworkImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWorkItemNetwork()
   * @generated
   */
  int WORK_ITEM_NETWORK = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_NETWORK__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_NETWORK__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Work Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_NETWORK__WORK_ITEMS = 2;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_NETWORK__ID = 3;

  /**
   * The number of structural features of the '<em>Work Item Network</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_NETWORK_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl <em>Work Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWorkItem()
   * @generated
   */
  int WORK_ITEM = 19;

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
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Has Predecessors</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__HAS_PREDECESSORS = 3;

  /**
   * The feature id for the '<em><b>PTasks</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__PTASKS = 4;

  /**
   * The feature id for the '<em><b>Has Subtasks</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__HAS_SUBTASKS = 5;

  /**
   * The feature id for the '<em><b>STasks</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__STASKS = 6;

  /**
   * The feature id for the '<em><b>Required Analysis</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__REQUIRED_ANALYSIS = 7;

  /**
   * The feature id for the '<em><b>Required Services</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__REQUIRED_SERVICES = 8;

  /**
   * The feature id for the '<em><b>Maturity Levels</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__MATURITY_LEVELS = 9;

  /**
   * The feature id for the '<em><b>Uncertainty</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__UNCERTAINTY = 10;

  /**
   * The feature id for the '<em><b>Has Impacts</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__HAS_IMPACTS = 11;

  /**
   * The feature id for the '<em><b>Impacts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__IMPACTS = 12;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__VALUE = 13;

  /**
   * The feature id for the '<em><b>Risk</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__RISK = 14;

  /**
   * The feature id for the '<em><b>Class Of Service</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__CLASS_OF_SERVICE = 15;

  /**
   * The feature id for the '<em><b>Work Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__WORK_SOURCE = 16;

  /**
   * The feature id for the '<em><b>Arrival Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__ARRIVAL_TIME = 17;

  /**
   * The feature id for the '<em><b>Due Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__DUE_DATE = 18;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__ID = 19;

  /**
   * The number of structural features of the '<em>Work Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_FEATURE_COUNT = 20;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.RequiredServiceImpl <em>Required Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.RequiredServiceImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getRequiredService()
   * @generated
   */
  int REQUIRED_SERVICE = 20;

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
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ImpactImpl <em>Impact</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ImpactImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getImpact()
   * @generated
   */
  int IMPACT = 21;

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
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemTypeImpl <em>Work Item Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemTypeImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWorkItemType()
   * @generated
   */
  int WORK_ITEM_TYPE = 22;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_TYPE__ID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_TYPE__NAME = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_TYPE__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Hierarchy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_TYPE__HIERARCHY = 3;

  /**
   * The number of structural features of the '<em>Work Item Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_TYPE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ValueFunctionImpl <em>Value Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ValueFunctionImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getValueFunction()
   * @generated
   */
  int VALUE_FUNCTION = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FUNCTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FUNCTION__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>Value Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FUNCTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ClassOfServiceImpl <em>Class Of Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ClassOfServiceImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getClassOfService()
   * @generated
   */
  int CLASS_OF_SERVICE = 24;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_OF_SERVICE__ID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_OF_SERVICE__NAME = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_OF_SERVICE__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_OF_SERVICE__PRIORITY = 3;

  /**
   * The feature id for the '<em><b>Disruptive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_OF_SERVICE__DISRUPTIVE = 4;

  /**
   * The number of structural features of the '<em>Class Of Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_OF_SERVICE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceImpl <em>Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getService()
   * @generated
   */
  int SERVICE = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Hierarchy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__HIERARCHY = 2;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__ID = 3;

  /**
   * The number of structural features of the '<em>Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceProviderImpl <em>Service Provider</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceProviderImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getServiceProvider()
   * @generated
   */
  int SERVICE_PROVIDER = 26;

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
   * The feature id for the '<em><b>Outsource From</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER__OUTSOURCE_FROM = 3;

  /**
   * The feature id for the '<em><b>Governance Strategy</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER__GOVERNANCE_STRATEGY = 4;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER__RESOURCES = 5;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER__ID = 6;

  /**
   * The number of structural features of the '<em>Service Provider</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceProviderTypeImpl <em>Service Provider Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceProviderTypeImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getServiceProviderType()
   * @generated
   */
  int SERVICE_PROVIDER_TYPE = 27;

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
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER_TYPE__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Hierarchy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER_TYPE__HIERARCHY = 3;

  /**
   * The number of structural features of the '<em>Service Provider Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER_TYPE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AssetImpl <em>Asset</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AssetImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getAsset()
   * @generated
   */
  int ASSET = 28;

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
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.SkillImpl <em>Skill</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.SkillImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getSkill()
   * @generated
   */
  int SKILL = 29;

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
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AbstractTypeImpl <em>Abstract Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AbstractTypeImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getAbstractType()
   * @generated
   */
  int ABSTRACT_TYPE = 30;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_TYPE__TYPE = 0;

  /**
   * The feature id for the '<em><b>List Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_TYPE__LIST_TYPE = 1;

  /**
   * The feature id for the '<em><b>Map Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_TYPE__MAP_TYPE = 2;

  /**
   * The feature id for the '<em><b>Key Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_TYPE__KEY_TYPE = 3;

  /**
   * The feature id for the '<em><b>Value Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_TYPE__VALUE_TYPE = 4;

  /**
   * The number of structural features of the '<em>Abstract Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_TYPE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ClassAttributesImpl <em>Class Attributes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ClassAttributesImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getClassAttributes()
   * @generated
   */
  int CLASS_ATTRIBUTES = 31;

  /**
   * The feature id for the '<em><b>Agent Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_ATTRIBUTES__AGENT_ATTRIBUTES = 0;

  /**
   * The number of structural features of the '<em>Class Attributes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_ATTRIBUTES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AgentImpl <em>Agent</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AgentImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getAgent()
   * @generated
   */
  int AGENT = 32;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Attribute Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT__ATTRIBUTE_VALUES = 1;

  /**
   * The number of structural features of the '<em>Agent</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.TaskImpl <em>Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.TaskImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getTask()
   * @generated
   */
  int TASK = 33;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__NAME = 0;

  /**
   * The feature id for the '<em><b>Attribute Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__ATTRIBUTE_VALUES = 1;

  /**
   * The number of structural features of the '<em>Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AttributeImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 34;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 1;

  /**
   * The feature id for the '<em><b>Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__DEFAULT = 2;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AttributeValueImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getAttributeValue()
   * @generated
   */
  int ATTRIBUTE_VALUE = 35;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_VALUE__ATTRIBUTE = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_VALUE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Attribute Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.DeclarationStatementImpl <em>Declaration Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.DeclarationStatementImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getDeclarationStatement()
   * @generated
   */
  int DECLARATION_STATEMENT = 44;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_STATEMENT__VARIABLE = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_STATEMENT__VALUE = 1;

  /**
   * The number of structural features of the '<em>Declaration Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.VariableImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 36;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__VARIABLE = DECLARATION_STATEMENT__VARIABLE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__VALUE = DECLARATION_STATEMENT__VALUE;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__TYPE = DECLARATION_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = DECLARATION_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = DECLARATION_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ActionImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getAction()
   * @generated
   */
  int ACTION = 37;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__INPUTS = 1;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.StateImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getState()
   * @generated
   */
  int STATE = 38;

  /**
   * The feature id for the '<em><b>Background State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__BACKGROUND_STATE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = 1;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__STATEMENTS = 2;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.IfExpressionImpl <em>If Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.IfExpressionImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getIfExpression()
   * @generated
   */
  int IF_EXPRESSION = 39;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_EXPRESSION__CONDITION = 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_EXPRESSION__STATEMENTS = 1;

  /**
   * The feature id for the '<em><b>Has Else If</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_EXPRESSION__HAS_ELSE_IF = 2;

  /**
   * The feature id for the '<em><b>Else If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_EXPRESSION__ELSE_IF = 3;

  /**
   * The feature id for the '<em><b>Elses</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_EXPRESSION__ELSES = 4;

  /**
   * The number of structural features of the '<em>If Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_EXPRESSION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ForExpressionImpl <em>For Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ForExpressionImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getForExpression()
   * @generated
   */
  int FOR_EXPRESSION = 40;

  /**
   * The feature id for the '<em><b>Object</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_EXPRESSION__OBJECT = 0;

  /**
   * The feature id for the '<em><b>Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_EXPRESSION__SET = 1;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_EXPRESSION__STATEMENTS = 2;

  /**
   * The number of structural features of the '<em>For Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WhileExpressionImpl <em>While Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WhileExpressionImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWhileExpression()
   * @generated
   */
  int WHILE_EXPRESSION = 41;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_EXPRESSION__CONDITION = 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_EXPRESSION__STATEMENTS = 1;

  /**
   * The number of structural features of the '<em>While Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ConditionImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 42;

  /**
   * The feature id for the '<em><b>Subjective</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__SUBJECTIVE = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Objective</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__OBJECTIVE = 2;

  /**
   * The feature id for the '<em><b>Has And</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__HAS_AND = 3;

  /**
   * The feature id for the '<em><b>And Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__AND_CONDITION = 4;

  /**
   * The feature id for the '<em><b>Has Or</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__HAS_OR = 5;

  /**
   * The feature id for the '<em><b>Or Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__OR_CONDITION = 6;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.StatementImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 43;

  /**
   * The feature id for the '<em><b>Is Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__IS_ACTION = 0;

  /**
   * The feature id for the '<em><b>Action Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__ACTION_STATEMENT = 1;

  /**
   * The feature id for the '<em><b>Is Change State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__IS_CHANGE_STATE = 2;

  /**
   * The feature id for the '<em><b>Change State Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__CHANGE_STATE_STATEMENT = 3;

  /**
   * The feature id for the '<em><b>Is Declaration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__IS_DECLARATION = 4;

  /**
   * The feature id for the '<em><b>Declaration Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__DECLARATION_STATEMENT = 5;

  /**
   * The feature id for the '<em><b>Is If Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__IS_IF_EXPRESSION = 6;

  /**
   * The feature id for the '<em><b>If Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__IF_EXPRESSION = 7;

  /**
   * The feature id for the '<em><b>Is For Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__IS_FOR_EXPRESSION = 8;

  /**
   * The feature id for the '<em><b>For Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__FOR_EXPRESSION = 9;

  /**
   * The feature id for the '<em><b>Is While Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__IS_WHILE_EXPRESSION = 10;

  /**
   * The feature id for the '<em><b>While Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__WHILE_EXPRESSION = 11;

  /**
   * The feature id for the '<em><b>Assert Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__ASSERT_STATEMENT = 12;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 13;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ActionStatementImpl <em>Action Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ActionStatementImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getActionStatement()
   * @generated
   */
  int ACTION_STATEMENT = 45;

  /**
   * The feature id for the '<em><b>Action</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_STATEMENT__ACTION = 0;

  /**
   * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_STATEMENT__INPUTS = 1;

  /**
   * The number of structural features of the '<em>Action Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AssertStatementImpl <em>Assert Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AssertStatementImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getAssertStatement()
   * @generated
   */
  int ASSERT_STATEMENT = 46;

  /**
   * The feature id for the '<em><b>Input</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERT_STATEMENT__INPUT = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERT_STATEMENT__VALUE = 1;

  /**
   * The number of structural features of the '<em>Assert Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERT_STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ChangeStateStatementImpl <em>Change State Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ChangeStateStatementImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getChangeStateStatement()
   * @generated
   */
  int CHANGE_STATE_STATEMENT = 47;

  /**
   * The feature id for the '<em><b>Target State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANGE_STATE_STATEMENT__TARGET_STATE = 0;

  /**
   * The number of structural features of the '<em>Change State Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANGE_STATE_STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ExpressionImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 48;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.TermImpl <em>Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.TermImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getTerm()
   * @generated
   */
  int TERM = 49;

  /**
   * The number of structural features of the '<em>Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.FactorImpl <em>Factor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.FactorImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getFactor()
   * @generated
   */
  int FACTOR = 50;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__NUMBER = TERM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__VARIABLE = TERM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__STRING = TERM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Boolean</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__BOOLEAN = TERM_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__EXPRESSION = TERM_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Factor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR_FEATURE_COUNT = TERM_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.VarExpressionImpl <em>Var Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.VarExpressionImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getVarExpression()
   * @generated
   */
  int VAR_EXPRESSION = 51;

  /**
   * The feature id for the '<em><b>Self</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_EXPRESSION__SELF = 0;

  /**
   * The feature id for the '<em><b>Context</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_EXPRESSION__CONTEXT = 1;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_EXPRESSION__VARIABLE = 2;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_EXPRESSION__METHODS = 3;

  /**
   * The number of structural features of the '<em>Var Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_EXPRESSION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.MethodImpl <em>Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.MethodImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getMethod()
   * @generated
   */
  int METHOD = 52;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__NAME = 0;

  /**
   * The feature id for the '<em><b>Function Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__FUNCTION_METHOD = 1;

  /**
   * The feature id for the '<em><b>Inputs</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__INPUTS = 2;

  /**
   * The number of structural features of the '<em>Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.PlusImpl <em>Plus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.PlusImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getPlus()
   * @generated
   */
  int PLUS = 53;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Plus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.MinusImpl <em>Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.MinusImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getMinus()
   * @generated
   */
  int MINUS = 54;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.MultiplyImpl <em>Multiply</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.MultiplyImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getMultiply()
   * @generated
   */
  int MULTIPLY = 55;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLY__LEFT = TERM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLY__RIGHT = TERM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Multiply</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLY_FEATURE_COUNT = TERM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.DivisionImpl <em>Division</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.DivisionImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getDivision()
   * @generated
   */
  int DIVISION = 56;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION__LEFT = TERM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION__RIGHT = TERM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Division</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION_FEATURE_COUNT = TERM_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ModelBuilder <em>Model Builder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Builder</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ModelBuilder
   * @generated
   */
  EClass getModelBuilder();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ModelBuilder#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ModelBuilder#getName()
   * @see #getModelBuilder()
   * @generated
   */
  EAttribute getModelBuilder_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ModelBuilder#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ModelBuilder#getDescription()
   * @see #getModelBuilder()
   * @generated
   */
  EAttribute getModelBuilder_Description();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ModelBuilder#getUserLibraries <em>User Libraries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>User Libraries</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ModelBuilder#getUserLibraries()
   * @see #getModelBuilder()
   * @generated
   */
  EReference getModelBuilder_UserLibraries();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ModelBuilder#getExperimentModel <em>Experiment Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Experiment Model</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ModelBuilder#getExperimentModel()
   * @see #getModelBuilder()
   * @generated
   */
  EReference getModelBuilder_ExperimentModel();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentModel <em>Experiment Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Experiment Model</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentModel
   * @generated
   */
  EClass getExperimentModel();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentModel#getName()
   * @see #getExperimentModel()
   * @generated
   */
  EAttribute getExperimentModel_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentModel#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentModel#getPath()
   * @see #getExperimentModel()
   * @generated
   */
  EAttribute getExperimentModel_Path();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentModel#getExperimentVariables <em>Experiment Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Experiment Variables</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentModel#getExperimentVariables()
   * @see #getExperimentModel()
   * @generated
   */
  EReference getExperimentModel_ExperimentVariables();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentModel#getServiceProviders <em>Service Providers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Service Providers</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentModel#getServiceProviders()
   * @see #getExperimentModel()
   * @generated
   */
  EReference getExperimentModel_ServiceProviders();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentModel#getWorkSources <em>Work Sources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Work Sources</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentModel#getWorkSources()
   * @see #getExperimentModel()
   * @generated
   */
  EReference getExperimentModel_WorkSources();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentModel#getWorkItemNetworks <em>Work Item Networks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Work Item Networks</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentModel#getWorkItemNetworks()
   * @see #getExperimentModel()
   * @generated
   */
  EReference getExperimentModel_WorkItemNetworks();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentModel#getWINReplications <em>WIN Replications</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>WIN Replications</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentModel#getWINReplications()
   * @see #getExperimentModel()
   * @generated
   */
  EReference getExperimentModel_WINReplications();

  /**
   * Returns the meta object for the attribute list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentModel#getIndicators <em>Indicators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Indicators</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentModel#getIndicators()
   * @see #getExperimentModel()
   * @generated
   */
  EAttribute getExperimentModel_Indicators();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.UserLibraries <em>User Libraries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>User Libraries</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.UserLibraries
   * @generated
   */
  EClass getUserLibraries();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.UserLibraries#getServiceProviderTypes <em>Service Provider Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Service Provider Types</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.UserLibraries#getServiceProviderTypes()
   * @see #getUserLibraries()
   * @generated
   */
  EReference getUserLibraries_ServiceProviderTypes();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.UserLibraries#getWorkItemTypes <em>Work Item Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Work Item Types</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.UserLibraries#getWorkItemTypes()
   * @see #getUserLibraries()
   * @generated
   */
  EReference getUserLibraries_WorkItemTypes();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.UserLibraries#getProcessModels <em>Process Models</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Process Models</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.UserLibraries#getProcessModels()
   * @see #getUserLibraries()
   * @generated
   */
  EReference getUserLibraries_ProcessModels();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.UserLibraries#getClassOfServices <em>Class Of Services</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Class Of Services</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.UserLibraries#getClassOfServices()
   * @see #getUserLibraries()
   * @generated
   */
  EReference getUserLibraries_ClassOfServices();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.UserLibraries#getServices <em>Services</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Services</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.UserLibraries#getServices()
   * @see #getUserLibraries()
   * @generated
   */
  EReference getUserLibraries_Services();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.UserLibraries#getGovernanceStrategies <em>Governance Strategies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Governance Strategies</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.UserLibraries#getGovernanceStrategies()
   * @see #getUserLibraries()
   * @generated
   */
  EReference getUserLibraries_GovernanceStrategies();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.AbstractParameter <em>Abstract Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Parameter</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.AbstractParameter
   * @generated
   */
  EClass getAbstractParameter();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.AbstractParameter#isIsVariable <em>Is Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Variable</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.AbstractParameter#isIsVariable()
   * @see #getAbstractParameter()
   * @generated
   */
  EAttribute getAbstractParameter_IsVariable();

  /**
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.AbstractParameter#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variable</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.AbstractParameter#getVariable()
   * @see #getAbstractParameter()
   * @generated
   */
  EReference getAbstractParameter_Variable();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.AbstractParameter#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.AbstractParameter#getValue()
   * @see #getAbstractParameter()
   * @generated
   */
  EAttribute getAbstractParameter_Value();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.NumExpression <em>Num Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Num Expression</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.NumExpression
   * @generated
   */
  EClass getNumExpression();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.NumExpression#getNumValue <em>Num Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Num Value</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.NumExpression#getNumValue()
   * @see #getNumExpression()
   * @generated
   */
  EAttribute getNumExpression_NumValue();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.NumExpression#isDistribution <em>Distribution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Distribution</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.NumExpression#isDistribution()
   * @see #getNumExpression()
   * @generated
   */
  EAttribute getNumExpression_Distribution();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.NumExpression#getNumDist <em>Num Dist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Num Dist</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.NumExpression#getNumDist()
   * @see #getNumExpression()
   * @generated
   */
  EReference getNumExpression_NumDist();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Operator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operator</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Operator
   * @generated
   */
  EClass getOperator();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Operator#isEqualTo <em>Equal To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Equal To</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Operator#isEqualTo()
   * @see #getOperator()
   * @generated
   */
  EAttribute getOperator_EqualTo();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Operator#isLargerThan <em>Larger Than</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Larger Than</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Operator#isLargerThan()
   * @see #getOperator()
   * @generated
   */
  EAttribute getOperator_LargerThan();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Operator#isSmallerThan <em>Smaller Than</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Smaller Than</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Operator#isSmallerThan()
   * @see #getOperator()
   * @generated
   */
  EAttribute getOperator_SmallerThan();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Operator#isLargerOrEqualTo <em>Larger Or Equal To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Larger Or Equal To</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Operator#isLargerOrEqualTo()
   * @see #getOperator()
   * @generated
   */
  EAttribute getOperator_LargerOrEqualTo();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Operator#isSmallerOrEqualTo <em>Smaller Or Equal To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Smaller Or Equal To</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Operator#isSmallerOrEqualTo()
   * @see #getOperator()
   * @generated
   */
  EAttribute getOperator_SmallerOrEqualTo();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Operator#isNotEqualTo <em>Not Equal To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Not Equal To</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Operator#isNotEqualTo()
   * @see #getOperator()
   * @generated
   */
  EAttribute getOperator_NotEqualTo();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentVariable <em>Experiment Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Experiment Variable</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentVariable
   * @generated
   */
  EClass getExperimentVariable();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentVariable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentVariable#getName()
   * @see #getExperimentVariable()
   * @generated
   */
  EAttribute getExperimentVariable_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentVariable#isBoolean <em>Boolean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Boolean</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentVariable#isBoolean()
   * @see #getExperimentVariable()
   * @generated
   */
  EAttribute getExperimentVariable_Boolean();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentVariable#isBooleanValue <em>Boolean Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Boolean Value</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentVariable#isBooleanValue()
   * @see #getExperimentVariable()
   * @generated
   */
  EAttribute getExperimentVariable_BooleanValue();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentVariable#isNum <em>Num</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Num</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentVariable#isNum()
   * @see #getExperimentVariable()
   * @generated
   */
  EAttribute getExperimentVariable_Num();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentVariable#getNumValue <em>Num Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Num Value</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentVariable#getNumValue()
   * @see #getExperimentVariable()
   * @generated
   */
  EAttribute getExperimentVariable_NumValue();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentVariable#isDistribution <em>Distribution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Distribution</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentVariable#isDistribution()
   * @see #getExperimentVariable()
   * @generated
   */
  EAttribute getExperimentVariable_Distribution();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentVariable#getNumDist <em>Num Dist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Num Dist</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentVariable#getNumDist()
   * @see #getExperimentVariable()
   * @generated
   */
  EReference getExperimentVariable_NumDist();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentVariable#isString <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentVariable#isString()
   * @see #getExperimentVariable()
   * @generated
   */
  EAttribute getExperimentVariable_String();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentVariable#getStringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String Value</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentVariable#getStringValue()
   * @see #getExperimentVariable()
   * @generated
   */
  EAttribute getExperimentVariable_StringValue();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentVariable#isStrategy <em>Strategy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Strategy</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentVariable#isStrategy()
   * @see #getExperimentVariable()
   * @generated
   */
  EAttribute getExperimentVariable_Strategy();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentVariable#getStrategyValue <em>Strategy Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Strategy Value</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentVariable#getStrategyValue()
   * @see #getExperimentVariable()
   * @generated
   */
  EReference getExperimentVariable_StrategyValue();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Distribution <em>Distribution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Distribution</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Distribution
   * @generated
   */
  EClass getDistribution();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Distribution#isIsNormal <em>Is Normal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Normal</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Distribution#isIsNormal()
   * @see #getDistribution()
   * @generated
   */
  EAttribute getDistribution_IsNormal();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Distribution#isIsUniform <em>Is Uniform</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Uniform</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Distribution#isIsUniform()
   * @see #getDistribution()
   * @generated
   */
  EAttribute getDistribution_IsUniform();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Distribution#isIsExponential <em>Is Exponential</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Exponential</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Distribution#isIsExponential()
   * @see #getDistribution()
   * @generated
   */
  EAttribute getDistribution_IsExponential();

  /**
   * Returns the meta object for the attribute list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Distribution#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Parameters</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Distribution#getParameters()
   * @see #getDistribution()
   * @generated
   */
  EAttribute getDistribution_Parameters();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WINReplication <em>WIN Replication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>WIN Replication</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WINReplication
   * @generated
   */
  EClass getWINReplication();

  /**
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WINReplication#getWorkItemNetwork <em>Work Item Network</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Work Item Network</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WINReplication#getWorkItemNetwork()
   * @see #getWINReplication()
   * @generated
   */
  EReference getWINReplication_WorkItemNetwork();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WINReplication#getNumReplications <em>Num Replications</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Num Replications</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WINReplication#getNumReplications()
   * @see #getWINReplication()
   * @generated
   */
  EAttribute getWINReplication_NumReplications();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy <em>Governance Strategy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Governance Strategy</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy
   * @generated
   */
  EClass getGovernanceStrategy();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getName()
   * @see #getGovernanceStrategy()
   * @generated
   */
  EAttribute getGovernanceStrategy_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#isPull <em>Pull</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pull</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#isPull()
   * @see #getGovernanceStrategy()
   * @generated
   */
  EAttribute getGovernanceStrategy_Pull();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getDescription()
   * @see #getGovernanceStrategy()
   * @generated
   */
  EAttribute getGovernanceStrategy_Description();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getPullStrategy <em>Pull Strategy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pull Strategy</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getPullStrategy()
   * @see #getGovernanceStrategy()
   * @generated
   */
  EReference getGovernanceStrategy_PullStrategy();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#isPush <em>Push</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Push</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#isPush()
   * @see #getGovernanceStrategy()
   * @generated
   */
  EAttribute getGovernanceStrategy_Push();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getPushStrategy <em>Push Strategy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Push Strategy</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getPushStrategy()
   * @see #getGovernanceStrategy()
   * @generated
   */
  EReference getGovernanceStrategy_PushStrategy();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#isCnp <em>Cnp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cnp</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#isCnp()
   * @see #getGovernanceStrategy()
   * @generated
   */
  EAttribute getGovernanceStrategy_Cnp();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getContractNetProtocal <em>Contract Net Protocal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Contract Net Protocal</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getContractNetProtocal()
   * @see #getGovernanceStrategy()
   * @generated
   */
  EReference getGovernanceStrategy_ContractNetProtocal();

  /**
   * Returns the meta object for the reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getProcesses <em>Processes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Processes</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getProcesses()
   * @see #getGovernanceStrategy()
   * @generated
   */
  EReference getGovernanceStrategy_Processes();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ContractNetProtocol <em>Contract Net Protocol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Contract Net Protocol</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ContractNetProtocol
   * @generated
   */
  EClass getContractNetProtocol();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ContractNetProtocol#getMechanisms <em>Mechanisms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mechanisms</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ContractNetProtocol#getMechanisms()
   * @see #getContractNetProtocol()
   * @generated
   */
  EReference getContractNetProtocol_Mechanisms();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ContractNetProtocol#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ContractNetProtocol#getVariables()
   * @see #getContractNetProtocol()
   * @generated
   */
  EReference getContractNetProtocol_Variables();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ContractNetProtocol#getRoleBehaviors <em>Role Behaviors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Role Behaviors</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ContractNetProtocol#getRoleBehaviors()
   * @see #getContractNetProtocol()
   * @generated
   */
  EReference getContractNetProtocol_RoleBehaviors();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.RoleBehavior <em>Role Behavior</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Role Behavior</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.RoleBehavior
   * @generated
   */
  EClass getRoleBehavior();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.RoleBehavior#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.RoleBehavior#getName()
   * @see #getRoleBehavior()
   * @generated
   */
  EAttribute getRoleBehavior_Name();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.RoleBehavior#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.RoleBehavior#getActions()
   * @see #getRoleBehavior()
   * @generated
   */
  EReference getRoleBehavior_Actions();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.RoleBehavior#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.RoleBehavior#getStates()
   * @see #getRoleBehavior()
   * @generated
   */
  EReference getRoleBehavior_States();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ProcessModel <em>Process Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process Model</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ProcessModel
   * @generated
   */
  EClass getProcessModel();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ProcessModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ProcessModel#getName()
   * @see #getProcessModel()
   * @generated
   */
  EAttribute getProcessModel_Name();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ProcessModel#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ProcessModel#getActions()
   * @see #getProcessModel()
   * @generated
   */
  EReference getProcessModel_Actions();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ProcessModel#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ProcessModel#getStates()
   * @see #getProcessModel()
   * @generated
   */
  EReference getProcessModel_States();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.PullStrategy <em>Pull Strategy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pull Strategy</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.PullStrategy
   * @generated
   */
  EClass getPullStrategy();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.PullStrategy#getMechanisms <em>Mechanisms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mechanisms</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.PullStrategy#getMechanisms()
   * @see #getPullStrategy()
   * @generated
   */
  EReference getPullStrategy_Mechanisms();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.PushStrategy <em>Push Strategy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Push Strategy</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.PushStrategy
   * @generated
   */
  EClass getPushStrategy();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.PushStrategy#getMechanisms <em>Mechanisms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mechanisms</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.PushStrategy#getMechanisms()
   * @see #getPushStrategy()
   * @generated
   */
  EReference getPushStrategy_Mechanisms();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Mechanism <em>Mechanism</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mechanism</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Mechanism
   * @generated
   */
  EClass getMechanism();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Mechanism#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Mechanism#getName()
   * @see #getMechanism()
   * @generated
   */
  EAttribute getMechanism_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Mechanism#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Mechanism#getValue()
   * @see #getMechanism()
   * @generated
   */
  EAttribute getMechanism_Value();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Mechanism#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Mechanism#getDescription()
   * @see #getMechanism()
   * @generated
   */
  EAttribute getMechanism_Description();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Mechanism#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Mechanism#getAttributes()
   * @see #getMechanism()
   * @generated
   */
  EReference getMechanism_Attributes();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.MechanismAttribute <em>Mechanism Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mechanism Attribute</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.MechanismAttribute
   * @generated
   */
  EClass getMechanismAttribute();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.MechanismAttribute#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attribute</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.MechanismAttribute#getAttribute()
   * @see #getMechanismAttribute()
   * @generated
   */
  EAttribute getMechanismAttribute_Attribute();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.MechanismAttribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.MechanismAttribute#getValue()
   * @see #getMechanismAttribute()
   * @generated
   */
  EAttribute getMechanismAttribute_Value();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkSource <em>Work Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Work Source</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkSource
   * @generated
   */
  EClass getWorkSource();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkSource#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkSource#getName()
   * @see #getWorkSource()
   * @generated
   */
  EAttribute getWorkSource_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkSource#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkSource#getDescription()
   * @see #getWorkSource()
   * @generated
   */
  EAttribute getWorkSource_Description();

  /**
   * Returns the meta object for the reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkSource#getAssignTo <em>Assign To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Assign To</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkSource#getAssignTo()
   * @see #getWorkSource()
   * @generated
   */
  EReference getWorkSource_AssignTo();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemNetwork <em>Work Item Network</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Work Item Network</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemNetwork
   * @generated
   */
  EClass getWorkItemNetwork();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemNetwork#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemNetwork#getName()
   * @see #getWorkItemNetwork()
   * @generated
   */
  EAttribute getWorkItemNetwork_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemNetwork#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemNetwork#getDescription()
   * @see #getWorkItemNetwork()
   * @generated
   */
  EAttribute getWorkItemNetwork_Description();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemNetwork#getWorkItems <em>Work Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Work Items</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemNetwork#getWorkItems()
   * @see #getWorkItemNetwork()
   * @generated
   */
  EReference getWorkItemNetwork_WorkItems();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemNetwork#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemNetwork#getId()
   * @see #getWorkItemNetwork()
   * @generated
   */
  EAttribute getWorkItemNetwork_Id();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem <em>Work Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Work Item</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem
   * @generated
   */
  EClass getWorkItem();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getName()
   * @see #getWorkItem()
   * @generated
   */
  EAttribute getWorkItem_Name();

  /**
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getType()
   * @see #getWorkItem()
   * @generated
   */
  EReference getWorkItem_Type();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getDescription()
   * @see #getWorkItem()
   * @generated
   */
  EAttribute getWorkItem_Description();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#isHasPredecessors <em>Has Predecessors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Predecessors</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#isHasPredecessors()
   * @see #getWorkItem()
   * @generated
   */
  EAttribute getWorkItem_HasPredecessors();

  /**
   * Returns the meta object for the reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getPTasks <em>PTasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>PTasks</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getPTasks()
   * @see #getWorkItem()
   * @generated
   */
  EReference getWorkItem_PTasks();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#isHasSubtasks <em>Has Subtasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Subtasks</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#isHasSubtasks()
   * @see #getWorkItem()
   * @generated
   */
  EAttribute getWorkItem_HasSubtasks();

  /**
   * Returns the meta object for the reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getSTasks <em>STasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>STasks</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getSTasks()
   * @see #getWorkItem()
   * @generated
   */
  EReference getWorkItem_STasks();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getRequiredAnalysis <em>Required Analysis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Required Analysis</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getRequiredAnalysis()
   * @see #getWorkItem()
   * @generated
   */
  EReference getWorkItem_RequiredAnalysis();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getRequiredServices <em>Required Services</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Required Services</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getRequiredServices()
   * @see #getWorkItem()
   * @generated
   */
  EReference getWorkItem_RequiredServices();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getMaturityLevels <em>Maturity Levels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Maturity Levels</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getMaturityLevels()
   * @see #getWorkItem()
   * @generated
   */
  EReference getWorkItem_MaturityLevels();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getUncertainty <em>Uncertainty</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Uncertainty</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getUncertainty()
   * @see #getWorkItem()
   * @generated
   */
  EReference getWorkItem_Uncertainty();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#isHasImpacts <em>Has Impacts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Impacts</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#isHasImpacts()
   * @see #getWorkItem()
   * @generated
   */
  EAttribute getWorkItem_HasImpacts();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getImpacts <em>Impacts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Impacts</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getImpacts()
   * @see #getWorkItem()
   * @generated
   */
  EReference getWorkItem_Impacts();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getValue()
   * @see #getWorkItem()
   * @generated
   */
  EReference getWorkItem_Value();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getRisk <em>Risk</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Risk</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getRisk()
   * @see #getWorkItem()
   * @generated
   */
  EReference getWorkItem_Risk();

  /**
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getClassOfService <em>Class Of Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Class Of Service</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getClassOfService()
   * @see #getWorkItem()
   * @generated
   */
  EReference getWorkItem_ClassOfService();

  /**
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getWorkSource <em>Work Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Work Source</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getWorkSource()
   * @see #getWorkItem()
   * @generated
   */
  EReference getWorkItem_WorkSource();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getArrivalTime <em>Arrival Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arrival Time</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getArrivalTime()
   * @see #getWorkItem()
   * @generated
   */
  EAttribute getWorkItem_ArrivalTime();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getDueDate <em>Due Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Due Date</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getDueDate()
   * @see #getWorkItem()
   * @generated
   */
  EAttribute getWorkItem_DueDate();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getId()
   * @see #getWorkItem()
   * @generated
   */
  EAttribute getWorkItem_Id();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.RequiredService <em>Required Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Required Service</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.RequiredService
   * @generated
   */
  EClass getRequiredService();

  /**
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.RequiredService#getServiceType <em>Service Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Service Type</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.RequiredService#getServiceType()
   * @see #getRequiredService()
   * @generated
   */
  EReference getRequiredService_ServiceType();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.RequiredService#getEfforts <em>Efforts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Efforts</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.RequiredService#getEfforts()
   * @see #getRequiredService()
   * @generated
   */
  EReference getRequiredService_Efforts();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Impact <em>Impact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Impact</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Impact
   * @generated
   */
  EClass getImpact();

  /**
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Impact#getImpactWI <em>Impact WI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Impact WI</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Impact#getImpactWI()
   * @see #getImpact()
   * @generated
   */
  EReference getImpact_ImpactWI();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Impact#getLikelihood <em>Likelihood</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Likelihood</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Impact#getLikelihood()
   * @see #getImpact()
   * @generated
   */
  EReference getImpact_Likelihood();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Impact#getRisk <em>Risk</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Risk</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Impact#getRisk()
   * @see #getImpact()
   * @generated
   */
  EReference getImpact_Risk();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemType <em>Work Item Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Work Item Type</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemType
   * @generated
   */
  EClass getWorkItemType();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemType#getId()
   * @see #getWorkItemType()
   * @generated
   */
  EAttribute getWorkItemType_Id();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemType#getName()
   * @see #getWorkItemType()
   * @generated
   */
  EAttribute getWorkItemType_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemType#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemType#getDescription()
   * @see #getWorkItemType()
   * @generated
   */
  EAttribute getWorkItemType_Description();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemType#getHierarchy <em>Hierarchy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hierarchy</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemType#getHierarchy()
   * @see #getWorkItemType()
   * @generated
   */
  EAttribute getWorkItemType_Hierarchy();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ValueFunction <em>Value Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Function</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ValueFunction
   * @generated
   */
  EClass getValueFunction();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ValueFunction#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ValueFunction#getName()
   * @see #getValueFunction()
   * @generated
   */
  EAttribute getValueFunction_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ValueFunction#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ValueFunction#getDescription()
   * @see #getValueFunction()
   * @generated
   */
  EAttribute getValueFunction_Description();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ClassOfService <em>Class Of Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Of Service</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ClassOfService
   * @generated
   */
  EClass getClassOfService();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ClassOfService#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ClassOfService#getId()
   * @see #getClassOfService()
   * @generated
   */
  EAttribute getClassOfService_Id();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ClassOfService#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ClassOfService#getName()
   * @see #getClassOfService()
   * @generated
   */
  EAttribute getClassOfService_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ClassOfService#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ClassOfService#getDescription()
   * @see #getClassOfService()
   * @generated
   */
  EAttribute getClassOfService_Description();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ClassOfService#getPriority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Priority</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ClassOfService#getPriority()
   * @see #getClassOfService()
   * @generated
   */
  EAttribute getClassOfService_Priority();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ClassOfService#isDisruptive <em>Disruptive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Disruptive</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ClassOfService#isDisruptive()
   * @see #getClassOfService()
   * @generated
   */
  EAttribute getClassOfService_Disruptive();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Service
   * @generated
   */
  EClass getService();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Service#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Service#getName()
   * @see #getService()
   * @generated
   */
  EAttribute getService_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Service#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Service#getDescription()
   * @see #getService()
   * @generated
   */
  EAttribute getService_Description();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Service#getHierarchy <em>Hierarchy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hierarchy</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Service#getHierarchy()
   * @see #getService()
   * @generated
   */
  EAttribute getService_Hierarchy();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Service#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Service#getId()
   * @see #getService()
   * @generated
   */
  EAttribute getService_Id();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider <em>Service Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service Provider</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider
   * @generated
   */
  EClass getServiceProvider();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getName()
   * @see #getServiceProvider()
   * @generated
   */
  EAttribute getServiceProvider_Name();

  /**
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getType()
   * @see #getServiceProvider()
   * @generated
   */
  EReference getServiceProvider_Type();

  /**
   * Returns the meta object for the reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getAssignTo <em>Assign To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Assign To</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getAssignTo()
   * @see #getServiceProvider()
   * @generated
   */
  EReference getServiceProvider_AssignTo();

  /**
   * Returns the meta object for the reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getOutsourceFrom <em>Outsource From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Outsource From</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getOutsourceFrom()
   * @see #getServiceProvider()
   * @generated
   */
  EReference getServiceProvider_OutsourceFrom();

  /**
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getGovernanceStrategy <em>Governance Strategy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Governance Strategy</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getGovernanceStrategy()
   * @see #getServiceProvider()
   * @generated
   */
  EReference getServiceProvider_GovernanceStrategy();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getResources <em>Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Resources</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getResources()
   * @see #getServiceProvider()
   * @generated
   */
  EReference getServiceProvider_Resources();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getId()
   * @see #getServiceProvider()
   * @generated
   */
  EAttribute getServiceProvider_Id();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProviderType <em>Service Provider Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service Provider Type</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProviderType
   * @generated
   */
  EClass getServiceProviderType();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProviderType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProviderType#getId()
   * @see #getServiceProviderType()
   * @generated
   */
  EAttribute getServiceProviderType_Id();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProviderType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProviderType#getName()
   * @see #getServiceProviderType()
   * @generated
   */
  EAttribute getServiceProviderType_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProviderType#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProviderType#getDescription()
   * @see #getServiceProviderType()
   * @generated
   */
  EAttribute getServiceProviderType_Description();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProviderType#getHierarchy <em>Hierarchy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hierarchy</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProviderType#getHierarchy()
   * @see #getServiceProviderType()
   * @generated
   */
  EAttribute getServiceProviderType_Hierarchy();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Asset <em>Asset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Asset</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Asset
   * @generated
   */
  EClass getAsset();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Asset#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Asset#getName()
   * @see #getAsset()
   * @generated
   */
  EAttribute getAsset_Name();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Asset#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Number</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Asset#getNumber()
   * @see #getAsset()
   * @generated
   */
  EReference getAsset_Number();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Asset#getSkillSet <em>Skill Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Skill Set</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Asset#getSkillSet()
   * @see #getAsset()
   * @generated
   */
  EReference getAsset_SkillSet();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Asset#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Asset#getId()
   * @see #getAsset()
   * @generated
   */
  EAttribute getAsset_Id();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Skill <em>Skill</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Skill</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Skill
   * @generated
   */
  EClass getSkill();

  /**
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Skill#getService <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Service</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Skill#getService()
   * @see #getSkill()
   * @generated
   */
  EReference getSkill_Service();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Skill#getEfficiency <em>Efficiency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Efficiency</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Skill#getEfficiency()
   * @see #getSkill()
   * @generated
   */
  EReference getSkill_Efficiency();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.AbstractType <em>Abstract Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Type</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.AbstractType
   * @generated
   */
  EClass getAbstractType();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.AbstractType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.AbstractType#getType()
   * @see #getAbstractType()
   * @generated
   */
  EAttribute getAbstractType_Type();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.AbstractType#isListType <em>List Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>List Type</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.AbstractType#isListType()
   * @see #getAbstractType()
   * @generated
   */
  EAttribute getAbstractType_ListType();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.AbstractType#isMapType <em>Map Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Map Type</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.AbstractType#isMapType()
   * @see #getAbstractType()
   * @generated
   */
  EAttribute getAbstractType_MapType();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.AbstractType#getKeyType <em>Key Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key Type</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.AbstractType#getKeyType()
   * @see #getAbstractType()
   * @generated
   */
  EAttribute getAbstractType_KeyType();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.AbstractType#getValueType <em>Value Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value Type</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.AbstractType#getValueType()
   * @see #getAbstractType()
   * @generated
   */
  EAttribute getAbstractType_ValueType();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ClassAttributes <em>Class Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Attributes</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ClassAttributes
   * @generated
   */
  EClass getClassAttributes();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ClassAttributes#getAgentAttributes <em>Agent Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Agent Attributes</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ClassAttributes#getAgentAttributes()
   * @see #getClassAttributes()
   * @generated
   */
  EReference getClassAttributes_AgentAttributes();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Agent <em>Agent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Agent</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Agent
   * @generated
   */
  EClass getAgent();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Agent#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Agent#getName()
   * @see #getAgent()
   * @generated
   */
  EAttribute getAgent_Name();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Agent#getAttributeValues <em>Attribute Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attribute Values</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Agent#getAttributeValues()
   * @see #getAgent()
   * @generated
   */
  EReference getAgent_AttributeValues();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Task <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Task
   * @generated
   */
  EClass getTask();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Task#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Task#getName()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_Name();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Task#getAttributeValues <em>Attribute Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attribute Values</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Task#getAttributeValues()
   * @see #getTask()
   * @generated
   */
  EReference getTask_AttributeValues();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Attribute#getType()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Type();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Attribute#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Attribute#getDefault()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Default();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.AttributeValue <em>Attribute Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Value</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.AttributeValue
   * @generated
   */
  EClass getAttributeValue();

  /**
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.AttributeValue#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Attribute</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.AttributeValue#getAttribute()
   * @see #getAttributeValue()
   * @generated
   */
  EReference getAttributeValue_Attribute();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.AttributeValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.AttributeValue#getValue()
   * @see #getAttributeValue()
   * @generated
   */
  EAttribute getAttributeValue_Value();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Variable#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Variable#getType()
   * @see #getVariable()
   * @generated
   */
  EReference getVariable_Type();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Variable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Variable#getName()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Name();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Action#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Action#getName()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_Name();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Action#getInputs <em>Inputs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inputs</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Action#getInputs()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Inputs();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.State#isBackgroundState <em>Background State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Background State</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.State#isBackgroundState()
   * @see #getState()
   * @generated
   */
  EAttribute getState_BackgroundState();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.State#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.State#getName()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Name();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.State#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.State#getStatements()
   * @see #getState()
   * @generated
   */
  EReference getState_Statements();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.IfExpression <em>If Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Expression</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.IfExpression
   * @generated
   */
  EClass getIfExpression();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.IfExpression#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.IfExpression#getCondition()
   * @see #getIfExpression()
   * @generated
   */
  EReference getIfExpression_Condition();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.IfExpression#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.IfExpression#getStatements()
   * @see #getIfExpression()
   * @generated
   */
  EReference getIfExpression_Statements();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.IfExpression#isHasElseIf <em>Has Else If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Else If</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.IfExpression#isHasElseIf()
   * @see #getIfExpression()
   * @generated
   */
  EAttribute getIfExpression_HasElseIf();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.IfExpression#getElseIf <em>Else If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else If</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.IfExpression#getElseIf()
   * @see #getIfExpression()
   * @generated
   */
  EReference getIfExpression_ElseIf();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.IfExpression#getElses <em>Elses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elses</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.IfExpression#getElses()
   * @see #getIfExpression()
   * @generated
   */
  EReference getIfExpression_Elses();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ForExpression <em>For Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Expression</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ForExpression
   * @generated
   */
  EClass getForExpression();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ForExpression#getObject <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ForExpression#getObject()
   * @see #getForExpression()
   * @generated
   */
  EReference getForExpression_Object();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ForExpression#getSet <em>Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Set</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ForExpression#getSet()
   * @see #getForExpression()
   * @generated
   */
  EReference getForExpression_Set();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ForExpression#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ForExpression#getStatements()
   * @see #getForExpression()
   * @generated
   */
  EReference getForExpression_Statements();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WhileExpression <em>While Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>While Expression</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WhileExpression
   * @generated
   */
  EClass getWhileExpression();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WhileExpression#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WhileExpression#getCondition()
   * @see #getWhileExpression()
   * @generated
   */
  EReference getWhileExpression_Condition();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WhileExpression#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WhileExpression#getStatements()
   * @see #getWhileExpression()
   * @generated
   */
  EReference getWhileExpression_Statements();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Condition#getSubjective <em>Subjective</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Subjective</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Condition#getSubjective()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_Subjective();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Condition#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operator</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Condition#getOperator()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_Operator();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Condition#getObjective <em>Objective</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Objective</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Condition#getObjective()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_Objective();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Condition#isHasAnd <em>Has And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has And</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Condition#isHasAnd()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_HasAnd();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Condition#getAndCondition <em>And Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>And Condition</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Condition#getAndCondition()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_AndCondition();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Condition#isHasOr <em>Has Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Or</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Condition#isHasOr()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_HasOr();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Condition#getOrCondition <em>Or Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Or Condition</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Condition#getOrCondition()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_OrCondition();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#isIsAction <em>Is Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Action</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#isIsAction()
   * @see #getStatement()
   * @generated
   */
  EAttribute getStatement_IsAction();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#getActionStatement <em>Action Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action Statement</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#getActionStatement()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_ActionStatement();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#isIsChangeState <em>Is Change State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Change State</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#isIsChangeState()
   * @see #getStatement()
   * @generated
   */
  EAttribute getStatement_IsChangeState();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#getChangeStateStatement <em>Change State Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Change State Statement</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#getChangeStateStatement()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_ChangeStateStatement();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#isIsDeclaration <em>Is Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Declaration</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#isIsDeclaration()
   * @see #getStatement()
   * @generated
   */
  EAttribute getStatement_IsDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#getDeclarationStatement <em>Declaration Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Declaration Statement</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#getDeclarationStatement()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_DeclarationStatement();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#isIsIfExpression <em>Is If Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is If Expression</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#isIsIfExpression()
   * @see #getStatement()
   * @generated
   */
  EAttribute getStatement_IsIfExpression();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#getIfExpression <em>If Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If Expression</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#getIfExpression()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_IfExpression();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#isIsForExpression <em>Is For Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is For Expression</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#isIsForExpression()
   * @see #getStatement()
   * @generated
   */
  EAttribute getStatement_IsForExpression();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#getForExpression <em>For Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>For Expression</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#getForExpression()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_ForExpression();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#isIsWhileExpression <em>Is While Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is While Expression</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#isIsWhileExpression()
   * @see #getStatement()
   * @generated
   */
  EAttribute getStatement_IsWhileExpression();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#getWhileExpression <em>While Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>While Expression</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#getWhileExpression()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_WhileExpression();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#getAssertStatement <em>Assert Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assert Statement</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Statement#getAssertStatement()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_AssertStatement();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.DeclarationStatement <em>Declaration Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declaration Statement</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.DeclarationStatement
   * @generated
   */
  EClass getDeclarationStatement();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.DeclarationStatement#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.DeclarationStatement#getVariable()
   * @see #getDeclarationStatement()
   * @generated
   */
  EReference getDeclarationStatement_Variable();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.DeclarationStatement#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.DeclarationStatement#getValue()
   * @see #getDeclarationStatement()
   * @generated
   */
  EReference getDeclarationStatement_Value();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ActionStatement <em>Action Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Statement</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ActionStatement
   * @generated
   */
  EClass getActionStatement();

  /**
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ActionStatement#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Action</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ActionStatement#getAction()
   * @see #getActionStatement()
   * @generated
   */
  EReference getActionStatement_Action();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ActionStatement#getInputs <em>Inputs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inputs</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ActionStatement#getInputs()
   * @see #getActionStatement()
   * @generated
   */
  EReference getActionStatement_Inputs();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.AssertStatement <em>Assert Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assert Statement</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.AssertStatement
   * @generated
   */
  EClass getAssertStatement();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.AssertStatement#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.AssertStatement#getInput()
   * @see #getAssertStatement()
   * @generated
   */
  EReference getAssertStatement_Input();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.AssertStatement#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.AssertStatement#getValue()
   * @see #getAssertStatement()
   * @generated
   */
  EReference getAssertStatement_Value();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ChangeStateStatement <em>Change State Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Change State Statement</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ChangeStateStatement
   * @generated
   */
  EClass getChangeStateStatement();

  /**
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ChangeStateStatement#getTargetState <em>Target State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target State</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ChangeStateStatement#getTargetState()
   * @see #getChangeStateStatement()
   * @generated
   */
  EReference getChangeStateStatement_TargetState();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Term</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Term
   * @generated
   */
  EClass getTerm();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Factor <em>Factor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Factor</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Factor
   * @generated
   */
  EClass getFactor();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Factor#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Factor#getNumber()
   * @see #getFactor()
   * @generated
   */
  EAttribute getFactor_Number();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Factor#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Factor#getVariable()
   * @see #getFactor()
   * @generated
   */
  EReference getFactor_Variable();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Factor#getString <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Factor#getString()
   * @see #getFactor()
   * @generated
   */
  EAttribute getFactor_String();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Factor#isBoolean <em>Boolean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Boolean</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Factor#isBoolean()
   * @see #getFactor()
   * @generated
   */
  EAttribute getFactor_Boolean();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Factor#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Factor#getExpression()
   * @see #getFactor()
   * @generated
   */
  EReference getFactor_Expression();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.VarExpression <em>Var Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Expression</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.VarExpression
   * @generated
   */
  EClass getVarExpression();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.VarExpression#isSelf <em>Self</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Self</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.VarExpression#isSelf()
   * @see #getVarExpression()
   * @generated
   */
  EAttribute getVarExpression_Self();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.VarExpression#isContext <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Context</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.VarExpression#isContext()
   * @see #getVarExpression()
   * @generated
   */
  EAttribute getVarExpression_Context();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.VarExpression#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.VarExpression#getVariable()
   * @see #getVarExpression()
   * @generated
   */
  EAttribute getVarExpression_Variable();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.VarExpression#getMethods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methods</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.VarExpression#getMethods()
   * @see #getVarExpression()
   * @generated
   */
  EReference getVarExpression_Methods();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Method
   * @generated
   */
  EClass getMethod();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Method#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Method#getName()
   * @see #getMethod()
   * @generated
   */
  EAttribute getMethod_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Method#isFunctionMethod <em>Function Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Function Method</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Method#isFunctionMethod()
   * @see #getMethod()
   * @generated
   */
  EAttribute getMethod_FunctionMethod();

  /**
   * Returns the meta object for the attribute list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Method#getInputs <em>Inputs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Inputs</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Method#getInputs()
   * @see #getMethod()
   * @generated
   */
  EAttribute getMethod_Inputs();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Plus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plus</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Plus
   * @generated
   */
  EClass getPlus();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Plus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Plus#getLeft()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Left();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Plus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Plus#getRight()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Right();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Minus</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Minus
   * @generated
   */
  EClass getMinus();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Minus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Minus#getLeft()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Left();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Minus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Minus#getRight()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Right();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Multiply <em>Multiply</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiply</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Multiply
   * @generated
   */
  EClass getMultiply();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Multiply#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Multiply#getLeft()
   * @see #getMultiply()
   * @generated
   */
  EReference getMultiply_Left();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Multiply#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Multiply#getRight()
   * @see #getMultiply()
   * @generated
   */
  EReference getMultiply_Right();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Division <em>Division</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Division</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Division
   * @generated
   */
  EClass getDivision();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Division#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Division#getLeft()
   * @see #getDivision()
   * @generated
   */
  EReference getDivision_Left();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Division#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Division#getRight()
   * @see #getDivision()
   * @generated
   */
  EReference getDivision_Right();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  KanbanmodelFactory getKanbanmodelFactory();

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
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ModelBuilderImpl <em>Model Builder</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ModelBuilderImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getModelBuilder()
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
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL_BUILDER__DESCRIPTION = eINSTANCE.getModelBuilder_Description();

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
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ExperimentModelImpl <em>Experiment Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ExperimentModelImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getExperimentModel()
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
     * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPERIMENT_MODEL__PATH = eINSTANCE.getExperimentModel_Path();

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
     * The meta object literal for the '<em><b>Work Sources</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPERIMENT_MODEL__WORK_SOURCES = eINSTANCE.getExperimentModel_WorkSources();

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
     * The meta object literal for the '<em><b>Indicators</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPERIMENT_MODEL__INDICATORS = eINSTANCE.getExperimentModel_Indicators();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.UserLibrariesImpl <em>User Libraries</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.UserLibrariesImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getUserLibraries()
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
     * The meta object literal for the '<em><b>Process Models</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USER_LIBRARIES__PROCESS_MODELS = eINSTANCE.getUserLibraries_ProcessModels();

    /**
     * The meta object literal for the '<em><b>Class Of Services</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USER_LIBRARIES__CLASS_OF_SERVICES = eINSTANCE.getUserLibraries_ClassOfServices();

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
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AbstractParameterImpl <em>Abstract Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AbstractParameterImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getAbstractParameter()
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
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.NumExpressionImpl <em>Num Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.NumExpressionImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getNumExpression()
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
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.OperatorImpl <em>Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.OperatorImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getOperator()
     * @generated
     */
    EClass OPERATOR = eINSTANCE.getOperator();

    /**
     * The meta object literal for the '<em><b>Equal To</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATOR__EQUAL_TO = eINSTANCE.getOperator_EqualTo();

    /**
     * The meta object literal for the '<em><b>Larger Than</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATOR__LARGER_THAN = eINSTANCE.getOperator_LargerThan();

    /**
     * The meta object literal for the '<em><b>Smaller Than</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATOR__SMALLER_THAN = eINSTANCE.getOperator_SmallerThan();

    /**
     * The meta object literal for the '<em><b>Larger Or Equal To</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATOR__LARGER_OR_EQUAL_TO = eINSTANCE.getOperator_LargerOrEqualTo();

    /**
     * The meta object literal for the '<em><b>Smaller Or Equal To</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATOR__SMALLER_OR_EQUAL_TO = eINSTANCE.getOperator_SmallerOrEqualTo();

    /**
     * The meta object literal for the '<em><b>Not Equal To</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATOR__NOT_EQUAL_TO = eINSTANCE.getOperator_NotEqualTo();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ExperimentVariableImpl <em>Experiment Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ExperimentVariableImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getExperimentVariable()
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
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.DistributionImpl <em>Distribution</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.DistributionImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getDistribution()
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
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WINReplicationImpl <em>WIN Replication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WINReplicationImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWINReplication()
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

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.GovernanceStrategyImpl <em>Governance Strategy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.GovernanceStrategyImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getGovernanceStrategy()
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
     * The meta object literal for the '<em><b>Pull</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOVERNANCE_STRATEGY__PULL = eINSTANCE.getGovernanceStrategy_Pull();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOVERNANCE_STRATEGY__DESCRIPTION = eINSTANCE.getGovernanceStrategy_Description();

    /**
     * The meta object literal for the '<em><b>Pull Strategy</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOVERNANCE_STRATEGY__PULL_STRATEGY = eINSTANCE.getGovernanceStrategy_PullStrategy();

    /**
     * The meta object literal for the '<em><b>Push</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOVERNANCE_STRATEGY__PUSH = eINSTANCE.getGovernanceStrategy_Push();

    /**
     * The meta object literal for the '<em><b>Push Strategy</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOVERNANCE_STRATEGY__PUSH_STRATEGY = eINSTANCE.getGovernanceStrategy_PushStrategy();

    /**
     * The meta object literal for the '<em><b>Cnp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOVERNANCE_STRATEGY__CNP = eINSTANCE.getGovernanceStrategy_Cnp();

    /**
     * The meta object literal for the '<em><b>Contract Net Protocal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOVERNANCE_STRATEGY__CONTRACT_NET_PROTOCAL = eINSTANCE.getGovernanceStrategy_ContractNetProtocal();

    /**
     * The meta object literal for the '<em><b>Processes</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOVERNANCE_STRATEGY__PROCESSES = eINSTANCE.getGovernanceStrategy_Processes();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ContractNetProtocolImpl <em>Contract Net Protocol</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ContractNetProtocolImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getContractNetProtocol()
     * @generated
     */
    EClass CONTRACT_NET_PROTOCOL = eINSTANCE.getContractNetProtocol();

    /**
     * The meta object literal for the '<em><b>Mechanisms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRACT_NET_PROTOCOL__MECHANISMS = eINSTANCE.getContractNetProtocol_Mechanisms();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRACT_NET_PROTOCOL__VARIABLES = eINSTANCE.getContractNetProtocol_Variables();

    /**
     * The meta object literal for the '<em><b>Role Behaviors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRACT_NET_PROTOCOL__ROLE_BEHAVIORS = eINSTANCE.getContractNetProtocol_RoleBehaviors();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.RoleBehaviorImpl <em>Role Behavior</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.RoleBehaviorImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getRoleBehavior()
     * @generated
     */
    EClass ROLE_BEHAVIOR = eINSTANCE.getRoleBehavior();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLE_BEHAVIOR__NAME = eINSTANCE.getRoleBehavior_Name();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLE_BEHAVIOR__ACTIONS = eINSTANCE.getRoleBehavior_Actions();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLE_BEHAVIOR__STATES = eINSTANCE.getRoleBehavior_States();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ProcessModelImpl <em>Process Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ProcessModelImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getProcessModel()
     * @generated
     */
    EClass PROCESS_MODEL = eINSTANCE.getProcessModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCESS_MODEL__NAME = eINSTANCE.getProcessModel_Name();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS_MODEL__ACTIONS = eINSTANCE.getProcessModel_Actions();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS_MODEL__STATES = eINSTANCE.getProcessModel_States();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.PullStrategyImpl <em>Pull Strategy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.PullStrategyImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getPullStrategy()
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
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.PushStrategyImpl <em>Push Strategy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.PushStrategyImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getPushStrategy()
     * @generated
     */
    EClass PUSH_STRATEGY = eINSTANCE.getPushStrategy();

    /**
     * The meta object literal for the '<em><b>Mechanisms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PUSH_STRATEGY__MECHANISMS = eINSTANCE.getPushStrategy_Mechanisms();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.MechanismImpl <em>Mechanism</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.MechanismImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getMechanism()
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
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MECHANISM__DESCRIPTION = eINSTANCE.getMechanism_Description();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MECHANISM__ATTRIBUTES = eINSTANCE.getMechanism_Attributes();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.MechanismAttributeImpl <em>Mechanism Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.MechanismAttributeImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getMechanismAttribute()
     * @generated
     */
    EClass MECHANISM_ATTRIBUTE = eINSTANCE.getMechanismAttribute();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MECHANISM_ATTRIBUTE__ATTRIBUTE = eINSTANCE.getMechanismAttribute_Attribute();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MECHANISM_ATTRIBUTE__VALUE = eINSTANCE.getMechanismAttribute_Value();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkSourceImpl <em>Work Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkSourceImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWorkSource()
     * @generated
     */
    EClass WORK_SOURCE = eINSTANCE.getWorkSource();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_SOURCE__NAME = eINSTANCE.getWorkSource_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_SOURCE__DESCRIPTION = eINSTANCE.getWorkSource_Description();

    /**
     * The meta object literal for the '<em><b>Assign To</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_SOURCE__ASSIGN_TO = eINSTANCE.getWorkSource_AssignTo();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemNetworkImpl <em>Work Item Network</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemNetworkImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWorkItemNetwork()
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
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM_NETWORK__DESCRIPTION = eINSTANCE.getWorkItemNetwork_Description();

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
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl <em>Work Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWorkItem()
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
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM__DESCRIPTION = eINSTANCE.getWorkItem_Description();

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
     * The meta object literal for the '<em><b>Maturity Levels</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM__MATURITY_LEVELS = eINSTANCE.getWorkItem_MaturityLevels();

    /**
     * The meta object literal for the '<em><b>Uncertainty</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM__UNCERTAINTY = eINSTANCE.getWorkItem_Uncertainty();

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
     * The meta object literal for the '<em><b>Risk</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM__RISK = eINSTANCE.getWorkItem_Risk();

    /**
     * The meta object literal for the '<em><b>Class Of Service</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM__CLASS_OF_SERVICE = eINSTANCE.getWorkItem_ClassOfService();

    /**
     * The meta object literal for the '<em><b>Work Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM__WORK_SOURCE = eINSTANCE.getWorkItem_WorkSource();

    /**
     * The meta object literal for the '<em><b>Arrival Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM__ARRIVAL_TIME = eINSTANCE.getWorkItem_ArrivalTime();

    /**
     * The meta object literal for the '<em><b>Due Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM__DUE_DATE = eINSTANCE.getWorkItem_DueDate();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM__ID = eINSTANCE.getWorkItem_Id();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.RequiredServiceImpl <em>Required Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.RequiredServiceImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getRequiredService()
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
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ImpactImpl <em>Impact</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ImpactImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getImpact()
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
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemTypeImpl <em>Work Item Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemTypeImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWorkItemType()
     * @generated
     */
    EClass WORK_ITEM_TYPE = eINSTANCE.getWorkItemType();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM_TYPE__ID = eINSTANCE.getWorkItemType_Id();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM_TYPE__NAME = eINSTANCE.getWorkItemType_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM_TYPE__DESCRIPTION = eINSTANCE.getWorkItemType_Description();

    /**
     * The meta object literal for the '<em><b>Hierarchy</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM_TYPE__HIERARCHY = eINSTANCE.getWorkItemType_Hierarchy();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ValueFunctionImpl <em>Value Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ValueFunctionImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getValueFunction()
     * @generated
     */
    EClass VALUE_FUNCTION = eINSTANCE.getValueFunction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE_FUNCTION__NAME = eINSTANCE.getValueFunction_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE_FUNCTION__DESCRIPTION = eINSTANCE.getValueFunction_Description();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ClassOfServiceImpl <em>Class Of Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ClassOfServiceImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getClassOfService()
     * @generated
     */
    EClass CLASS_OF_SERVICE = eINSTANCE.getClassOfService();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_OF_SERVICE__ID = eINSTANCE.getClassOfService_Id();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_OF_SERVICE__NAME = eINSTANCE.getClassOfService_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_OF_SERVICE__DESCRIPTION = eINSTANCE.getClassOfService_Description();

    /**
     * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_OF_SERVICE__PRIORITY = eINSTANCE.getClassOfService_Priority();

    /**
     * The meta object literal for the '<em><b>Disruptive</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_OF_SERVICE__DISRUPTIVE = eINSTANCE.getClassOfService_Disruptive();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceImpl <em>Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getService()
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
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__DESCRIPTION = eINSTANCE.getService_Description();

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
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceProviderImpl <em>Service Provider</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceProviderImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getServiceProvider()
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
     * The meta object literal for the '<em><b>Outsource From</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_PROVIDER__OUTSOURCE_FROM = eINSTANCE.getServiceProvider_OutsourceFrom();

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
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceProviderTypeImpl <em>Service Provider Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceProviderTypeImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getServiceProviderType()
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
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE_PROVIDER_TYPE__DESCRIPTION = eINSTANCE.getServiceProviderType_Description();

    /**
     * The meta object literal for the '<em><b>Hierarchy</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE_PROVIDER_TYPE__HIERARCHY = eINSTANCE.getServiceProviderType_Hierarchy();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AssetImpl <em>Asset</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AssetImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getAsset()
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
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.SkillImpl <em>Skill</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.SkillImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getSkill()
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
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AbstractTypeImpl <em>Abstract Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AbstractTypeImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getAbstractType()
     * @generated
     */
    EClass ABSTRACT_TYPE = eINSTANCE.getAbstractType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_TYPE__TYPE = eINSTANCE.getAbstractType_Type();

    /**
     * The meta object literal for the '<em><b>List Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_TYPE__LIST_TYPE = eINSTANCE.getAbstractType_ListType();

    /**
     * The meta object literal for the '<em><b>Map Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_TYPE__MAP_TYPE = eINSTANCE.getAbstractType_MapType();

    /**
     * The meta object literal for the '<em><b>Key Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_TYPE__KEY_TYPE = eINSTANCE.getAbstractType_KeyType();

    /**
     * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_TYPE__VALUE_TYPE = eINSTANCE.getAbstractType_ValueType();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ClassAttributesImpl <em>Class Attributes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ClassAttributesImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getClassAttributes()
     * @generated
     */
    EClass CLASS_ATTRIBUTES = eINSTANCE.getClassAttributes();

    /**
     * The meta object literal for the '<em><b>Agent Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_ATTRIBUTES__AGENT_ATTRIBUTES = eINSTANCE.getClassAttributes_AgentAttributes();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AgentImpl <em>Agent</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AgentImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getAgent()
     * @generated
     */
    EClass AGENT = eINSTANCE.getAgent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGENT__NAME = eINSTANCE.getAgent_Name();

    /**
     * The meta object literal for the '<em><b>Attribute Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGENT__ATTRIBUTE_VALUES = eINSTANCE.getAgent_AttributeValues();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.TaskImpl <em>Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.TaskImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getTask()
     * @generated
     */
    EClass TASK = eINSTANCE.getTask();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__NAME = eINSTANCE.getTask_Name();

    /**
     * The meta object literal for the '<em><b>Attribute Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK__ATTRIBUTE_VALUES = eINSTANCE.getTask_AttributeValues();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AttributeImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__DEFAULT = eINSTANCE.getAttribute_Default();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AttributeValueImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getAttributeValue()
     * @generated
     */
    EClass ATTRIBUTE_VALUE = eINSTANCE.getAttributeValue();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_VALUE__ATTRIBUTE = eINSTANCE.getAttributeValue_Attribute();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_VALUE__VALUE = eINSTANCE.getAttributeValue_Value();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.VariableImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE__TYPE = eINSTANCE.getVariable_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ActionImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

    /**
     * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__INPUTS = eINSTANCE.getAction_Inputs();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.StateImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Background State</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__BACKGROUND_STATE = eINSTANCE.getState_BackgroundState();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__NAME = eINSTANCE.getState_Name();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__STATEMENTS = eINSTANCE.getState_Statements();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.IfExpressionImpl <em>If Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.IfExpressionImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getIfExpression()
     * @generated
     */
    EClass IF_EXPRESSION = eINSTANCE.getIfExpression();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_EXPRESSION__CONDITION = eINSTANCE.getIfExpression_Condition();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_EXPRESSION__STATEMENTS = eINSTANCE.getIfExpression_Statements();

    /**
     * The meta object literal for the '<em><b>Has Else If</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IF_EXPRESSION__HAS_ELSE_IF = eINSTANCE.getIfExpression_HasElseIf();

    /**
     * The meta object literal for the '<em><b>Else If</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_EXPRESSION__ELSE_IF = eINSTANCE.getIfExpression_ElseIf();

    /**
     * The meta object literal for the '<em><b>Elses</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_EXPRESSION__ELSES = eINSTANCE.getIfExpression_Elses();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ForExpressionImpl <em>For Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ForExpressionImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getForExpression()
     * @generated
     */
    EClass FOR_EXPRESSION = eINSTANCE.getForExpression();

    /**
     * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_EXPRESSION__OBJECT = eINSTANCE.getForExpression_Object();

    /**
     * The meta object literal for the '<em><b>Set</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_EXPRESSION__SET = eINSTANCE.getForExpression_Set();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_EXPRESSION__STATEMENTS = eINSTANCE.getForExpression_Statements();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WhileExpressionImpl <em>While Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WhileExpressionImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWhileExpression()
     * @generated
     */
    EClass WHILE_EXPRESSION = eINSTANCE.getWhileExpression();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_EXPRESSION__CONDITION = eINSTANCE.getWhileExpression_Condition();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_EXPRESSION__STATEMENTS = eINSTANCE.getWhileExpression_Statements();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ConditionImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '<em><b>Subjective</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__SUBJECTIVE = eINSTANCE.getCondition_Subjective();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__OPERATOR = eINSTANCE.getCondition_Operator();

    /**
     * The meta object literal for the '<em><b>Objective</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__OBJECTIVE = eINSTANCE.getCondition_Objective();

    /**
     * The meta object literal for the '<em><b>Has And</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__HAS_AND = eINSTANCE.getCondition_HasAnd();

    /**
     * The meta object literal for the '<em><b>And Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__AND_CONDITION = eINSTANCE.getCondition_AndCondition();

    /**
     * The meta object literal for the '<em><b>Has Or</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__HAS_OR = eINSTANCE.getCondition_HasOr();

    /**
     * The meta object literal for the '<em><b>Or Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__OR_CONDITION = eINSTANCE.getCondition_OrCondition();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.StatementImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '<em><b>Is Action</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT__IS_ACTION = eINSTANCE.getStatement_IsAction();

    /**
     * The meta object literal for the '<em><b>Action Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__ACTION_STATEMENT = eINSTANCE.getStatement_ActionStatement();

    /**
     * The meta object literal for the '<em><b>Is Change State</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT__IS_CHANGE_STATE = eINSTANCE.getStatement_IsChangeState();

    /**
     * The meta object literal for the '<em><b>Change State Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__CHANGE_STATE_STATEMENT = eINSTANCE.getStatement_ChangeStateStatement();

    /**
     * The meta object literal for the '<em><b>Is Declaration</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT__IS_DECLARATION = eINSTANCE.getStatement_IsDeclaration();

    /**
     * The meta object literal for the '<em><b>Declaration Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__DECLARATION_STATEMENT = eINSTANCE.getStatement_DeclarationStatement();

    /**
     * The meta object literal for the '<em><b>Is If Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT__IS_IF_EXPRESSION = eINSTANCE.getStatement_IsIfExpression();

    /**
     * The meta object literal for the '<em><b>If Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__IF_EXPRESSION = eINSTANCE.getStatement_IfExpression();

    /**
     * The meta object literal for the '<em><b>Is For Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT__IS_FOR_EXPRESSION = eINSTANCE.getStatement_IsForExpression();

    /**
     * The meta object literal for the '<em><b>For Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__FOR_EXPRESSION = eINSTANCE.getStatement_ForExpression();

    /**
     * The meta object literal for the '<em><b>Is While Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT__IS_WHILE_EXPRESSION = eINSTANCE.getStatement_IsWhileExpression();

    /**
     * The meta object literal for the '<em><b>While Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__WHILE_EXPRESSION = eINSTANCE.getStatement_WhileExpression();

    /**
     * The meta object literal for the '<em><b>Assert Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__ASSERT_STATEMENT = eINSTANCE.getStatement_AssertStatement();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.DeclarationStatementImpl <em>Declaration Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.DeclarationStatementImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getDeclarationStatement()
     * @generated
     */
    EClass DECLARATION_STATEMENT = eINSTANCE.getDeclarationStatement();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION_STATEMENT__VARIABLE = eINSTANCE.getDeclarationStatement_Variable();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION_STATEMENT__VALUE = eINSTANCE.getDeclarationStatement_Value();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ActionStatementImpl <em>Action Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ActionStatementImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getActionStatement()
     * @generated
     */
    EClass ACTION_STATEMENT = eINSTANCE.getActionStatement();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_STATEMENT__ACTION = eINSTANCE.getActionStatement_Action();

    /**
     * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_STATEMENT__INPUTS = eINSTANCE.getActionStatement_Inputs();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AssertStatementImpl <em>Assert Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AssertStatementImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getAssertStatement()
     * @generated
     */
    EClass ASSERT_STATEMENT = eINSTANCE.getAssertStatement();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSERT_STATEMENT__INPUT = eINSTANCE.getAssertStatement_Input();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSERT_STATEMENT__VALUE = eINSTANCE.getAssertStatement_Value();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ChangeStateStatementImpl <em>Change State Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ChangeStateStatementImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getChangeStateStatement()
     * @generated
     */
    EClass CHANGE_STATE_STATEMENT = eINSTANCE.getChangeStateStatement();

    /**
     * The meta object literal for the '<em><b>Target State</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHANGE_STATE_STATEMENT__TARGET_STATE = eINSTANCE.getChangeStateStatement_TargetState();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ExpressionImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.TermImpl <em>Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.TermImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getTerm()
     * @generated
     */
    EClass TERM = eINSTANCE.getTerm();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.FactorImpl <em>Factor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.FactorImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getFactor()
     * @generated
     */
    EClass FACTOR = eINSTANCE.getFactor();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FACTOR__NUMBER = eINSTANCE.getFactor_Number();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACTOR__VARIABLE = eINSTANCE.getFactor_Variable();

    /**
     * The meta object literal for the '<em><b>String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FACTOR__STRING = eINSTANCE.getFactor_String();

    /**
     * The meta object literal for the '<em><b>Boolean</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FACTOR__BOOLEAN = eINSTANCE.getFactor_Boolean();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACTOR__EXPRESSION = eINSTANCE.getFactor_Expression();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.VarExpressionImpl <em>Var Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.VarExpressionImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getVarExpression()
     * @generated
     */
    EClass VAR_EXPRESSION = eINSTANCE.getVarExpression();

    /**
     * The meta object literal for the '<em><b>Self</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR_EXPRESSION__SELF = eINSTANCE.getVarExpression_Self();

    /**
     * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR_EXPRESSION__CONTEXT = eINSTANCE.getVarExpression_Context();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR_EXPRESSION__VARIABLE = eINSTANCE.getVarExpression_Variable();

    /**
     * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_EXPRESSION__METHODS = eINSTANCE.getVarExpression_Methods();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.MethodImpl <em>Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.MethodImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getMethod()
     * @generated
     */
    EClass METHOD = eINSTANCE.getMethod();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

    /**
     * The meta object literal for the '<em><b>Function Method</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD__FUNCTION_METHOD = eINSTANCE.getMethod_FunctionMethod();

    /**
     * The meta object literal for the '<em><b>Inputs</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD__INPUTS = eINSTANCE.getMethod_Inputs();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.PlusImpl <em>Plus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.PlusImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getPlus()
     * @generated
     */
    EClass PLUS = eINSTANCE.getPlus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS__LEFT = eINSTANCE.getPlus_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS__RIGHT = eINSTANCE.getPlus_Right();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.MinusImpl <em>Minus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.MinusImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getMinus()
     * @generated
     */
    EClass MINUS = eINSTANCE.getMinus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__LEFT = eINSTANCE.getMinus_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__RIGHT = eINSTANCE.getMinus_Right();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.MultiplyImpl <em>Multiply</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.MultiplyImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getMultiply()
     * @generated
     */
    EClass MULTIPLY = eINSTANCE.getMultiply();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLY__LEFT = eINSTANCE.getMultiply_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLY__RIGHT = eINSTANCE.getMultiply_Right();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.DivisionImpl <em>Division</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.DivisionImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getDivision()
     * @generated
     */
    EClass DIVISION = eINSTANCE.getDivision();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIVISION__LEFT = eINSTANCE.getDivision_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIVISION__RIGHT = eINSTANCE.getDivision_Right();

  }

} //KanbanmodelPackage
