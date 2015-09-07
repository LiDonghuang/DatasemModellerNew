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
   * The feature id for the '<em><b>System Libraries</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BUILDER__SYSTEM_LIBRARIES = 2;

  /**
   * The feature id for the '<em><b>User Libraries</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BUILDER__USER_LIBRARIES = 3;

  /**
   * The feature id for the '<em><b>Experiment Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BUILDER__EXPERIMENT_MODEL = 4;

  /**
   * The number of structural features of the '<em>Model Builder</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_BUILDER_FEATURE_COUNT = 5;

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
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIMENT_MODEL__VARIABLES = 2;

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
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.SystemLibrariesImpl <em>System Libraries</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.SystemLibrariesImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getSystemLibraries()
   * @generated
   */
  int SYSTEM_LIBRARIES = 2;

  /**
   * The feature id for the '<em><b>Event Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_LIBRARIES__EVENT_TYPES = 0;

  /**
   * The feature id for the '<em><b>Condition Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_LIBRARIES__CONDITION_TYPES = 1;

  /**
   * The feature id for the '<em><b>Transition Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_LIBRARIES__TRANSITION_TYPES = 2;

  /**
   * The feature id for the '<em><b>WI Acceptance Rule Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_LIBRARIES__WI_ACCEPTANCE_RULE_TYPES = 3;

  /**
   * The feature id for the '<em><b>WI Selection Rule Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_LIBRARIES__WI_SELECTION_RULE_TYPES = 4;

  /**
   * The feature id for the '<em><b>WI Assignment Rule Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_LIBRARIES__WI_ASSIGNMENT_RULE_TYPES = 5;

  /**
   * The feature id for the '<em><b>Resource Allocation Rule Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_LIBRARIES__RESOURCE_ALLOCATION_RULE_TYPES = 6;

  /**
   * The feature id for the '<em><b>Resource Outsourcing Rule Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_LIBRARIES__RESOURCE_OUTSOURCING_RULE_TYPES = 7;

  /**
   * The feature id for the '<em><b>Process Models</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_LIBRARIES__PROCESS_MODELS = 8;

  /**
   * The feature id for the '<em><b>Value Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_LIBRARIES__VALUE_FUNCTIONS = 9;

  /**
   * The number of structural features of the '<em>System Libraries</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_LIBRARIES_FEATURE_COUNT = 10;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.UserLibrariesImpl <em>User Libraries</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.UserLibrariesImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getUserLibraries()
   * @generated
   */
  int USER_LIBRARIES = 3;

  /**
   * The feature id for the '<em><b>Work Item Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_LIBRARIES__WORK_ITEM_TYPES = 0;

  /**
   * The feature id for the '<em><b>Class Of Services</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_LIBRARIES__CLASS_OF_SERVICES = 1;

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
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AbstractParameterImpl <em>Abstract Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AbstractParameterImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getAbstractParameter()
   * @generated
   */
  int ABSTRACT_PARAMETER = 4;

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
  int NUM_EXPRESSION = 5;

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
  int OPERATOR = 6;

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
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.VariableImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type Numeric</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__TYPE_NUMERIC = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__VALUE = 2;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.DistributionImpl <em>Distribution</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.DistributionImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getDistribution()
   * @generated
   */
  int DISTRIBUTION = 8;

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
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
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
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.EventTypeImpl <em>Event Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.EventTypeImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getEventType()
   * @generated
   */
  int EVENT_TYPE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_TYPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_TYPE__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>Event Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ConditionTypeImpl <em>Condition Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ConditionTypeImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getConditionType()
   * @generated
   */
  int CONDITION_TYPE = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_TYPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_TYPE__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>Condition Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.TransitionTypeImpl <em>Transition Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.TransitionTypeImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getTransitionType()
   * @generated
   */
  int TRANSITION_TYPE = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_TYPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_TYPE__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>Transition Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_TYPE_FEATURE_COUNT = 2;

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
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL__EVENTS = 2;

  /**
   * The number of structural features of the '<em>Process Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.EventImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getEvent()
   * @generated
   */
  int EVENT = 13;

  /**
   * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__CONDITIONS = 0;

  /**
   * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__TRANSITIONS = 1;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ConditionImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 14;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__VALUE = 2;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.TransitionImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 15;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__VALUE = 1;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AgentRoleTypeImpl <em>Agent Role Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AgentRoleTypeImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getAgentRoleType()
   * @generated
   */
  int AGENT_ROLE_TYPE = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT_ROLE_TYPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT_ROLE_TYPE__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>Agent Role Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT_ROLE_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WINReplicationImpl <em>WIN Replication</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WINReplicationImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWINReplication()
   * @generated
   */
  int WIN_REPLICATION = 17;

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
  int GOVERNANCE_STRATEGY = 18;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOVERNANCE_STRATEGY__ID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOVERNANCE_STRATEGY__NAME = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOVERNANCE_STRATEGY__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>WI Acceptance Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOVERNANCE_STRATEGY__WI_ACCEPTANCE_RULE = 3;

  /**
   * The feature id for the '<em><b>WI Selection Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOVERNANCE_STRATEGY__WI_SELECTION_RULE = 4;

  /**
   * The feature id for the '<em><b>WI Assignment Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOVERNANCE_STRATEGY__WI_ASSIGNMENT_RULE = 5;

  /**
   * The feature id for the '<em><b>Resource Allocation Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOVERNANCE_STRATEGY__RESOURCE_ALLOCATION_RULE = 6;

  /**
   * The feature id for the '<em><b>Resource Outsourcing Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOVERNANCE_STRATEGY__RESOURCE_OUTSOURCING_RULE = 7;

  /**
   * The feature id for the '<em><b>Mechanisms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOVERNANCE_STRATEGY__MECHANISMS = 8;

  /**
   * The number of structural features of the '<em>Governance Strategy</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOVERNANCE_STRATEGY_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WIAcceptanceImpl <em>WI Acceptance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WIAcceptanceImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWIAcceptance()
   * @generated
   */
  int WI_ACCEPTANCE = 19;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WI_ACCEPTANCE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WI_ACCEPTANCE__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Backlog QLimit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WI_ACCEPTANCE__BACKLOG_QLIMIT = 2;

  /**
   * The feature id for the '<em><b>Ready QLimit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WI_ACCEPTANCE__READY_QLIMIT = 3;

  /**
   * The number of structural features of the '<em>WI Acceptance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WI_ACCEPTANCE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WISelectionImpl <em>WI Selection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WISelectionImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWISelection()
   * @generated
   */
  int WI_SELECTION = 20;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WI_SELECTION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WI_SELECTION__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>WI Selection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WI_SELECTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WIAssignmentImpl <em>WI Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WIAssignmentImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWIAssignment()
   * @generated
   */
  int WI_ASSIGNMENT = 21;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WI_ASSIGNMENT__TYPE = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WI_ASSIGNMENT__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>WI Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WI_ASSIGNMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ResourceAllocationImpl <em>Resource Allocation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ResourceAllocationImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getResourceAllocation()
   * @generated
   */
  int RESOURCE_ALLOCATION = 22;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_ALLOCATION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_ALLOCATION__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>Resource Allocation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_ALLOCATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ResourceOutsourcingImpl <em>Resource Outsourcing</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ResourceOutsourcingImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getResourceOutsourcing()
   * @generated
   */
  int RESOURCE_OUTSOURCING = 23;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_OUTSOURCING__TYPE = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_OUTSOURCING__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>Resource Outsourcing</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_OUTSOURCING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WIAcceptanceRuleTypeImpl <em>WI Acceptance Rule Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WIAcceptanceRuleTypeImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWIAcceptanceRuleType()
   * @generated
   */
  int WI_ACCEPTANCE_RULE_TYPE = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WI_ACCEPTANCE_RULE_TYPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WI_ACCEPTANCE_RULE_TYPE__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>WI Acceptance Rule Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WI_ACCEPTANCE_RULE_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WISelectionRuleTypeImpl <em>WI Selection Rule Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WISelectionRuleTypeImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWISelectionRuleType()
   * @generated
   */
  int WI_SELECTION_RULE_TYPE = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WI_SELECTION_RULE_TYPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WI_SELECTION_RULE_TYPE__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>WI Selection Rule Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WI_SELECTION_RULE_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WIAssignmentRuleTypeImpl <em>WI Assignment Rule Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WIAssignmentRuleTypeImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWIAssignmentRuleType()
   * @generated
   */
  int WI_ASSIGNMENT_RULE_TYPE = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WI_ASSIGNMENT_RULE_TYPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WI_ASSIGNMENT_RULE_TYPE__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>WI Assignment Rule Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WI_ASSIGNMENT_RULE_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ResourceAllocationRuleTypeImpl <em>Resource Allocation Rule Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ResourceAllocationRuleTypeImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getResourceAllocationRuleType()
   * @generated
   */
  int RESOURCE_ALLOCATION_RULE_TYPE = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_ALLOCATION_RULE_TYPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_ALLOCATION_RULE_TYPE__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>Resource Allocation Rule Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_ALLOCATION_RULE_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ResourceOutsourcingRuleTypeImpl <em>Resource Outsourcing Rule Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ResourceOutsourcingRuleTypeImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getResourceOutsourcingRuleType()
   * @generated
   */
  int RESOURCE_OUTSOURCING_RULE_TYPE = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_OUTSOURCING_RULE_TYPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_OUTSOURCING_RULE_TYPE__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>Resource Outsourcing Rule Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_OUTSOURCING_RULE_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.MechanismImpl <em>Mechanism</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.MechanismImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getMechanism()
   * @generated
   */
  int MECHANISM = 29;

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
  int MECHANISM_ATTRIBUTE = 30;

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
  int WORK_SOURCE = 31;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_SOURCE__ID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_SOURCE__NAME = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_SOURCE__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Assign To</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_SOURCE__ASSIGN_TO = 3;

  /**
   * The feature id for the '<em><b>Assignment Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_SOURCE__ASSIGNMENT_RULE = 4;

  /**
   * The number of structural features of the '<em>Work Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_SOURCE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemNetworkImpl <em>Work Item Network</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemNetworkImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWorkItemNetwork()
   * @generated
   */
  int WORK_ITEM_NETWORK = 32;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_NETWORK__ID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_NETWORK__NAME = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_NETWORK__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Work Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_NETWORK__WORK_ITEMS = 3;

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
  int WORK_ITEM = 33;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__ID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__NAME = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__TYPE = 3;

  /**
   * The feature id for the '<em><b>Has Predecessors</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__HAS_PREDECESSORS = 4;

  /**
   * The feature id for the '<em><b>PTasks</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__PTASKS = 5;

  /**
   * The feature id for the '<em><b>Is Aggregation Node</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__IS_AGGREGATION_NODE = 6;

  /**
   * The feature id for the '<em><b>STasks</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__STASKS = 7;

  /**
   * The feature id for the '<em><b>Causal Triggers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__CAUSAL_TRIGGERS = 8;

  /**
   * The feature id for the '<em><b>Required Services</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__REQUIRED_SERVICES = 9;

  /**
   * The feature id for the '<em><b>Efforts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__EFFORTS = 10;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__VALUE = 11;

  /**
   * The feature id for the '<em><b>Class Of Service</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__CLASS_OF_SERVICE = 12;

  /**
   * The feature id for the '<em><b>Work Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__WORK_SOURCE = 13;

  /**
   * The feature id for the '<em><b>Arrival Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__ARRIVAL_TIME = 14;

  /**
   * The feature id for the '<em><b>Due Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__DUE_DATE = 15;

  /**
   * The number of structural features of the '<em>Work Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_FEATURE_COUNT = 16;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.CausalTriggerImpl <em>Causal Trigger</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.CausalTriggerImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getCausalTrigger()
   * @generated
   */
  int CAUSAL_TRIGGER = 34;

  /**
   * The feature id for the '<em><b>Triggered</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAUSAL_TRIGGER__TRIGGERED = 0;

  /**
   * The feature id for the '<em><b>At Progress</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAUSAL_TRIGGER__AT_PROGRESS = 1;

  /**
   * The feature id for the '<em><b>On Probability</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAUSAL_TRIGGER__ON_PROBABILITY = 2;

  /**
   * The number of structural features of the '<em>Causal Trigger</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAUSAL_TRIGGER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemTypeImpl <em>Work Item Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemTypeImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWorkItemType()
   * @generated
   */
  int WORK_ITEM_TYPE = 35;

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
   * The number of structural features of the '<em>Work Item Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ValueFunctionImpl <em>Value Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ValueFunctionImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getValueFunction()
   * @generated
   */
  int VALUE_FUNCTION = 36;

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
  int CLASS_OF_SERVICE = 37;

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
   * The feature id for the '<em><b>Disruptive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_OF_SERVICE__DISRUPTIVE = 3;

  /**
   * The number of structural features of the '<em>Class Of Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_OF_SERVICE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceImpl <em>Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getService()
   * @generated
   */
  int SERVICE = 38;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__ID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__NAME = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__DESCRIPTION = 2;

  /**
   * The number of structural features of the '<em>Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceProviderImpl <em>Service Provider</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceProviderImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getServiceProvider()
   * @generated
   */
  int SERVICE_PROVIDER = 39;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER__ID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER__NAME = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Assign To</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER__ASSIGN_TO = 3;

  /**
   * The feature id for the '<em><b>Outsource From</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER__OUTSOURCE_FROM = 4;

  /**
   * The feature id for the '<em><b>Team Service</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER__TEAM_SERVICE = 5;

  /**
   * The feature id for the '<em><b>Governance Strategy</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER__GOVERNANCE_STRATEGY = 6;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER__RESOURCES = 7;

  /**
   * The number of structural features of the '<em>Service Provider</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AssetImpl <em>Asset</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AssetImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getAsset()
   * @generated
   */
  int ASSET = 40;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSET__ID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSET__NAME = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSET__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Skill Set</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSET__SKILL_SET = 3;

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
  int SKILL = 41;

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
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ModelBuilder#getSystemLibraries <em>System Libraries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>System Libraries</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ModelBuilder#getSystemLibraries()
   * @see #getModelBuilder()
   * @generated
   */
  EReference getModelBuilder_SystemLibraries();

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
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentModel#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ExperimentModel#getVariables()
   * @see #getExperimentModel()
   * @generated
   */
  EReference getExperimentModel_Variables();

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
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.SystemLibraries <em>System Libraries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>System Libraries</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.SystemLibraries
   * @generated
   */
  EClass getSystemLibraries();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.SystemLibraries#getEventTypes <em>Event Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Event Types</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.SystemLibraries#getEventTypes()
   * @see #getSystemLibraries()
   * @generated
   */
  EReference getSystemLibraries_EventTypes();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.SystemLibraries#getConditionTypes <em>Condition Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Condition Types</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.SystemLibraries#getConditionTypes()
   * @see #getSystemLibraries()
   * @generated
   */
  EReference getSystemLibraries_ConditionTypes();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.SystemLibraries#getTransitionTypes <em>Transition Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transition Types</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.SystemLibraries#getTransitionTypes()
   * @see #getSystemLibraries()
   * @generated
   */
  EReference getSystemLibraries_TransitionTypes();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.SystemLibraries#getWIAcceptanceRuleTypes <em>WI Acceptance Rule Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>WI Acceptance Rule Types</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.SystemLibraries#getWIAcceptanceRuleTypes()
   * @see #getSystemLibraries()
   * @generated
   */
  EReference getSystemLibraries_WIAcceptanceRuleTypes();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.SystemLibraries#getWISelectionRuleTypes <em>WI Selection Rule Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>WI Selection Rule Types</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.SystemLibraries#getWISelectionRuleTypes()
   * @see #getSystemLibraries()
   * @generated
   */
  EReference getSystemLibraries_WISelectionRuleTypes();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.SystemLibraries#getWIAssignmentRuleTypes <em>WI Assignment Rule Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>WI Assignment Rule Types</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.SystemLibraries#getWIAssignmentRuleTypes()
   * @see #getSystemLibraries()
   * @generated
   */
  EReference getSystemLibraries_WIAssignmentRuleTypes();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.SystemLibraries#getResourceAllocationRuleTypes <em>Resource Allocation Rule Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Resource Allocation Rule Types</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.SystemLibraries#getResourceAllocationRuleTypes()
   * @see #getSystemLibraries()
   * @generated
   */
  EReference getSystemLibraries_ResourceAllocationRuleTypes();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.SystemLibraries#getResourceOutsourcingRuleTypes <em>Resource Outsourcing Rule Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Resource Outsourcing Rule Types</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.SystemLibraries#getResourceOutsourcingRuleTypes()
   * @see #getSystemLibraries()
   * @generated
   */
  EReference getSystemLibraries_ResourceOutsourcingRuleTypes();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.SystemLibraries#getProcessModels <em>Process Models</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Process Models</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.SystemLibraries#getProcessModels()
   * @see #getSystemLibraries()
   * @generated
   */
  EReference getSystemLibraries_ProcessModels();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.SystemLibraries#getValueFunctions <em>Value Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Value Functions</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.SystemLibraries#getValueFunctions()
   * @see #getSystemLibraries()
   * @generated
   */
  EReference getSystemLibraries_ValueFunctions();

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
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Variable
   * @generated
   */
  EClass getVariable();

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
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Variable#isTypeNumeric <em>Type Numeric</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type Numeric</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Variable#isTypeNumeric()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_TypeNumeric();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Variable#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Variable#getValue()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Value();

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
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Distribution#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Distribution#getParameters()
   * @see #getDistribution()
   * @generated
   */
  EReference getDistribution_Parameters();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.EventType <em>Event Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event Type</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.EventType
   * @generated
   */
  EClass getEventType();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.EventType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.EventType#getName()
   * @see #getEventType()
   * @generated
   */
  EAttribute getEventType_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.EventType#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.EventType#getDescription()
   * @see #getEventType()
   * @generated
   */
  EAttribute getEventType_Description();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ConditionType <em>Condition Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition Type</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ConditionType
   * @generated
   */
  EClass getConditionType();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ConditionType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ConditionType#getName()
   * @see #getConditionType()
   * @generated
   */
  EAttribute getConditionType_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ConditionType#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ConditionType#getDescription()
   * @see #getConditionType()
   * @generated
   */
  EAttribute getConditionType_Description();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.TransitionType <em>Transition Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition Type</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.TransitionType
   * @generated
   */
  EClass getTransitionType();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.TransitionType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.TransitionType#getName()
   * @see #getTransitionType()
   * @generated
   */
  EAttribute getTransitionType_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.TransitionType#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.TransitionType#getDescription()
   * @see #getTransitionType()
   * @generated
   */
  EAttribute getTransitionType_Description();

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
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ProcessModel#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ProcessModel#getDescription()
   * @see #getProcessModel()
   * @generated
   */
  EAttribute getProcessModel_Description();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ProcessModel#getEvents <em>Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Events</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ProcessModel#getEvents()
   * @see #getProcessModel()
   * @generated
   */
  EReference getProcessModel_Events();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Event#getConditions <em>Conditions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Conditions</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Event#getConditions()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_Conditions();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Event#getTransitions <em>Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transitions</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Event#getTransitions()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_Transitions();

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
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Condition#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Condition#getType()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_Type();

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
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Condition#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Condition#getValue()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_Value();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Transition#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Transition#getType()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Type();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Transition#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Transition#getValue()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_Value();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.AgentRoleType <em>Agent Role Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Agent Role Type</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.AgentRoleType
   * @generated
   */
  EClass getAgentRoleType();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.AgentRoleType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.AgentRoleType#getName()
   * @see #getAgentRoleType()
   * @generated
   */
  EAttribute getAgentRoleType_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.AgentRoleType#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.AgentRoleType#getDescription()
   * @see #getAgentRoleType()
   * @generated
   */
  EAttribute getAgentRoleType_Description();

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
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getId()
   * @see #getGovernanceStrategy()
   * @generated
   */
  EAttribute getGovernanceStrategy_Id();

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
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getWIAcceptanceRule <em>WI Acceptance Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>WI Acceptance Rule</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getWIAcceptanceRule()
   * @see #getGovernanceStrategy()
   * @generated
   */
  EReference getGovernanceStrategy_WIAcceptanceRule();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getWISelectionRule <em>WI Selection Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>WI Selection Rule</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getWISelectionRule()
   * @see #getGovernanceStrategy()
   * @generated
   */
  EReference getGovernanceStrategy_WISelectionRule();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getWIAssignmentRule <em>WI Assignment Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>WI Assignment Rule</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getWIAssignmentRule()
   * @see #getGovernanceStrategy()
   * @generated
   */
  EReference getGovernanceStrategy_WIAssignmentRule();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getResourceAllocationRule <em>Resource Allocation Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Resource Allocation Rule</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getResourceAllocationRule()
   * @see #getGovernanceStrategy()
   * @generated
   */
  EReference getGovernanceStrategy_ResourceAllocationRule();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getResourceOutsourcingRule <em>Resource Outsourcing Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Resource Outsourcing Rule</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getResourceOutsourcingRule()
   * @see #getGovernanceStrategy()
   * @generated
   */
  EReference getGovernanceStrategy_ResourceOutsourcingRule();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getMechanisms <em>Mechanisms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mechanisms</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getMechanisms()
   * @see #getGovernanceStrategy()
   * @generated
   */
  EReference getGovernanceStrategy_Mechanisms();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptance <em>WI Acceptance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>WI Acceptance</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptance
   * @generated
   */
  EClass getWIAcceptance();

  /**
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptance#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptance#getType()
   * @see #getWIAcceptance()
   * @generated
   */
  EReference getWIAcceptance_Type();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptance#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptance#getDescription()
   * @see #getWIAcceptance()
   * @generated
   */
  EAttribute getWIAcceptance_Description();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptance#getBacklogQLimit <em>Backlog QLimit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Backlog QLimit</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptance#getBacklogQLimit()
   * @see #getWIAcceptance()
   * @generated
   */
  EAttribute getWIAcceptance_BacklogQLimit();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptance#getReadyQLimit <em>Ready QLimit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ready QLimit</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptance#getReadyQLimit()
   * @see #getWIAcceptance()
   * @generated
   */
  EAttribute getWIAcceptance_ReadyQLimit();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WISelection <em>WI Selection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>WI Selection</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WISelection
   * @generated
   */
  EClass getWISelection();

  /**
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WISelection#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WISelection#getType()
   * @see #getWISelection()
   * @generated
   */
  EReference getWISelection_Type();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WISelection#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WISelection#getDescription()
   * @see #getWISelection()
   * @generated
   */
  EAttribute getWISelection_Description();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WIAssignment <em>WI Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>WI Assignment</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WIAssignment
   * @generated
   */
  EClass getWIAssignment();

  /**
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WIAssignment#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WIAssignment#getType()
   * @see #getWIAssignment()
   * @generated
   */
  EReference getWIAssignment_Type();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WIAssignment#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WIAssignment#getDescription()
   * @see #getWIAssignment()
   * @generated
   */
  EAttribute getWIAssignment_Description();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceAllocation <em>Resource Allocation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource Allocation</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceAllocation
   * @generated
   */
  EClass getResourceAllocation();

  /**
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceAllocation#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceAllocation#getType()
   * @see #getResourceAllocation()
   * @generated
   */
  EReference getResourceAllocation_Type();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceAllocation#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceAllocation#getDescription()
   * @see #getResourceAllocation()
   * @generated
   */
  EAttribute getResourceAllocation_Description();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceOutsourcing <em>Resource Outsourcing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource Outsourcing</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceOutsourcing
   * @generated
   */
  EClass getResourceOutsourcing();

  /**
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceOutsourcing#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceOutsourcing#getType()
   * @see #getResourceOutsourcing()
   * @generated
   */
  EReference getResourceOutsourcing_Type();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceOutsourcing#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceOutsourcing#getDescription()
   * @see #getResourceOutsourcing()
   * @generated
   */
  EAttribute getResourceOutsourcing_Description();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptanceRuleType <em>WI Acceptance Rule Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>WI Acceptance Rule Type</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptanceRuleType
   * @generated
   */
  EClass getWIAcceptanceRuleType();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptanceRuleType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptanceRuleType#getName()
   * @see #getWIAcceptanceRuleType()
   * @generated
   */
  EAttribute getWIAcceptanceRuleType_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptanceRuleType#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptanceRuleType#getDescription()
   * @see #getWIAcceptanceRuleType()
   * @generated
   */
  EAttribute getWIAcceptanceRuleType_Description();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WISelectionRuleType <em>WI Selection Rule Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>WI Selection Rule Type</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WISelectionRuleType
   * @generated
   */
  EClass getWISelectionRuleType();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WISelectionRuleType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WISelectionRuleType#getName()
   * @see #getWISelectionRuleType()
   * @generated
   */
  EAttribute getWISelectionRuleType_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WISelectionRuleType#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WISelectionRuleType#getDescription()
   * @see #getWISelectionRuleType()
   * @generated
   */
  EAttribute getWISelectionRuleType_Description();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WIAssignmentRuleType <em>WI Assignment Rule Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>WI Assignment Rule Type</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WIAssignmentRuleType
   * @generated
   */
  EClass getWIAssignmentRuleType();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WIAssignmentRuleType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WIAssignmentRuleType#getName()
   * @see #getWIAssignmentRuleType()
   * @generated
   */
  EAttribute getWIAssignmentRuleType_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WIAssignmentRuleType#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WIAssignmentRuleType#getDescription()
   * @see #getWIAssignmentRuleType()
   * @generated
   */
  EAttribute getWIAssignmentRuleType_Description();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceAllocationRuleType <em>Resource Allocation Rule Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource Allocation Rule Type</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceAllocationRuleType
   * @generated
   */
  EClass getResourceAllocationRuleType();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceAllocationRuleType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceAllocationRuleType#getName()
   * @see #getResourceAllocationRuleType()
   * @generated
   */
  EAttribute getResourceAllocationRuleType_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceAllocationRuleType#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceAllocationRuleType#getDescription()
   * @see #getResourceAllocationRuleType()
   * @generated
   */
  EAttribute getResourceAllocationRuleType_Description();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceOutsourcingRuleType <em>Resource Outsourcing Rule Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource Outsourcing Rule Type</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceOutsourcingRuleType
   * @generated
   */
  EClass getResourceOutsourcingRuleType();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceOutsourcingRuleType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceOutsourcingRuleType#getName()
   * @see #getResourceOutsourcingRuleType()
   * @generated
   */
  EAttribute getResourceOutsourcingRuleType_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceOutsourcingRuleType#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceOutsourcingRuleType#getDescription()
   * @see #getResourceOutsourcingRuleType()
   * @generated
   */
  EAttribute getResourceOutsourcingRuleType_Description();

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
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkSource#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkSource#getId()
   * @see #getWorkSource()
   * @generated
   */
  EAttribute getWorkSource_Id();

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
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkSource#getAssignmentRule <em>Assignment Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assignment Rule</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkSource#getAssignmentRule()
   * @see #getWorkSource()
   * @generated
   */
  EReference getWorkSource_AssignmentRule();

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
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem <em>Work Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Work Item</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem
   * @generated
   */
  EClass getWorkItem();

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
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#isIsAggregationNode <em>Is Aggregation Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Aggregation Node</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#isIsAggregationNode()
   * @see #getWorkItem()
   * @generated
   */
  EAttribute getWorkItem_IsAggregationNode();

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
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getCausalTriggers <em>Causal Triggers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Causal Triggers</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getCausalTriggers()
   * @see #getWorkItem()
   * @generated
   */
  EReference getWorkItem_CausalTriggers();

  /**
   * Returns the meta object for the reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getRequiredServices <em>Required Services</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Required Services</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getRequiredServices()
   * @see #getWorkItem()
   * @generated
   */
  EReference getWorkItem_RequiredServices();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getEfforts <em>Efforts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Efforts</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getEfforts()
   * @see #getWorkItem()
   * @generated
   */
  EReference getWorkItem_Efforts();

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
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.CausalTrigger <em>Causal Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Causal Trigger</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.CausalTrigger
   * @generated
   */
  EClass getCausalTrigger();

  /**
   * Returns the meta object for the reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.CausalTrigger#getTriggered <em>Triggered</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Triggered</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.CausalTrigger#getTriggered()
   * @see #getCausalTrigger()
   * @generated
   */
  EReference getCausalTrigger_Triggered();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.CausalTrigger#getAtProgress <em>At Progress</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>At Progress</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.CausalTrigger#getAtProgress()
   * @see #getCausalTrigger()
   * @generated
   */
  EAttribute getCausalTrigger_AtProgress();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.CausalTrigger#getOnProbability <em>On Probability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>On Probability</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.CausalTrigger#getOnProbability()
   * @see #getCausalTrigger()
   * @generated
   */
  EAttribute getCausalTrigger_OnProbability();

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
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider <em>Service Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service Provider</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider
   * @generated
   */
  EClass getServiceProvider();

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
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getDescription()
   * @see #getServiceProvider()
   * @generated
   */
  EAttribute getServiceProvider_Description();

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
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getTeamService <em>Team Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Team Service</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider#getTeamService()
   * @see #getServiceProvider()
   * @generated
   */
  EReference getServiceProvider_TeamService();

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
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Asset <em>Asset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Asset</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Asset
   * @generated
   */
  EClass getAsset();

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
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Asset#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Asset#getDescription()
   * @see #getAsset()
   * @generated
   */
  EAttribute getAsset_Description();

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
     * The meta object literal for the '<em><b>System Libraries</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_BUILDER__SYSTEM_LIBRARIES = eINSTANCE.getModelBuilder_SystemLibraries();

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
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPERIMENT_MODEL__VARIABLES = eINSTANCE.getExperimentModel_Variables();

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
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.SystemLibrariesImpl <em>System Libraries</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.SystemLibrariesImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getSystemLibraries()
     * @generated
     */
    EClass SYSTEM_LIBRARIES = eINSTANCE.getSystemLibraries();

    /**
     * The meta object literal for the '<em><b>Event Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM_LIBRARIES__EVENT_TYPES = eINSTANCE.getSystemLibraries_EventTypes();

    /**
     * The meta object literal for the '<em><b>Condition Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM_LIBRARIES__CONDITION_TYPES = eINSTANCE.getSystemLibraries_ConditionTypes();

    /**
     * The meta object literal for the '<em><b>Transition Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM_LIBRARIES__TRANSITION_TYPES = eINSTANCE.getSystemLibraries_TransitionTypes();

    /**
     * The meta object literal for the '<em><b>WI Acceptance Rule Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM_LIBRARIES__WI_ACCEPTANCE_RULE_TYPES = eINSTANCE.getSystemLibraries_WIAcceptanceRuleTypes();

    /**
     * The meta object literal for the '<em><b>WI Selection Rule Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM_LIBRARIES__WI_SELECTION_RULE_TYPES = eINSTANCE.getSystemLibraries_WISelectionRuleTypes();

    /**
     * The meta object literal for the '<em><b>WI Assignment Rule Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM_LIBRARIES__WI_ASSIGNMENT_RULE_TYPES = eINSTANCE.getSystemLibraries_WIAssignmentRuleTypes();

    /**
     * The meta object literal for the '<em><b>Resource Allocation Rule Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM_LIBRARIES__RESOURCE_ALLOCATION_RULE_TYPES = eINSTANCE.getSystemLibraries_ResourceAllocationRuleTypes();

    /**
     * The meta object literal for the '<em><b>Resource Outsourcing Rule Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM_LIBRARIES__RESOURCE_OUTSOURCING_RULE_TYPES = eINSTANCE.getSystemLibraries_ResourceOutsourcingRuleTypes();

    /**
     * The meta object literal for the '<em><b>Process Models</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM_LIBRARIES__PROCESS_MODELS = eINSTANCE.getSystemLibraries_ProcessModels();

    /**
     * The meta object literal for the '<em><b>Value Functions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM_LIBRARIES__VALUE_FUNCTIONS = eINSTANCE.getSystemLibraries_ValueFunctions();

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
     * The meta object literal for the '<em><b>Work Item Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USER_LIBRARIES__WORK_ITEM_TYPES = eINSTANCE.getUserLibraries_WorkItemTypes();

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
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.VariableImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

    /**
     * The meta object literal for the '<em><b>Type Numeric</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__TYPE_NUMERIC = eINSTANCE.getVariable_TypeNumeric();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__VALUE = eINSTANCE.getVariable_Value();

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
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISTRIBUTION__PARAMETERS = eINSTANCE.getDistribution_Parameters();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.EventTypeImpl <em>Event Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.EventTypeImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getEventType()
     * @generated
     */
    EClass EVENT_TYPE = eINSTANCE.getEventType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT_TYPE__NAME = eINSTANCE.getEventType_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT_TYPE__DESCRIPTION = eINSTANCE.getEventType_Description();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ConditionTypeImpl <em>Condition Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ConditionTypeImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getConditionType()
     * @generated
     */
    EClass CONDITION_TYPE = eINSTANCE.getConditionType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION_TYPE__NAME = eINSTANCE.getConditionType_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION_TYPE__DESCRIPTION = eINSTANCE.getConditionType_Description();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.TransitionTypeImpl <em>Transition Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.TransitionTypeImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getTransitionType()
     * @generated
     */
    EClass TRANSITION_TYPE = eINSTANCE.getTransitionType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION_TYPE__NAME = eINSTANCE.getTransitionType_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION_TYPE__DESCRIPTION = eINSTANCE.getTransitionType_Description();

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
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCESS_MODEL__DESCRIPTION = eINSTANCE.getProcessModel_Description();

    /**
     * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS_MODEL__EVENTS = eINSTANCE.getProcessModel_Events();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.EventImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getEvent()
     * @generated
     */
    EClass EVENT = eINSTANCE.getEvent();

    /**
     * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__CONDITIONS = eINSTANCE.getEvent_Conditions();

    /**
     * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__TRANSITIONS = eINSTANCE.getEvent_Transitions();

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
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__TYPE = eINSTANCE.getCondition_Type();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__OPERATOR = eINSTANCE.getCondition_Operator();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__VALUE = eINSTANCE.getCondition_Value();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.TransitionImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__TYPE = eINSTANCE.getTransition_Type();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION__VALUE = eINSTANCE.getTransition_Value();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AgentRoleTypeImpl <em>Agent Role Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AgentRoleTypeImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getAgentRoleType()
     * @generated
     */
    EClass AGENT_ROLE_TYPE = eINSTANCE.getAgentRoleType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGENT_ROLE_TYPE__NAME = eINSTANCE.getAgentRoleType_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGENT_ROLE_TYPE__DESCRIPTION = eINSTANCE.getAgentRoleType_Description();

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
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOVERNANCE_STRATEGY__ID = eINSTANCE.getGovernanceStrategy_Id();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOVERNANCE_STRATEGY__NAME = eINSTANCE.getGovernanceStrategy_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOVERNANCE_STRATEGY__DESCRIPTION = eINSTANCE.getGovernanceStrategy_Description();

    /**
     * The meta object literal for the '<em><b>WI Acceptance Rule</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOVERNANCE_STRATEGY__WI_ACCEPTANCE_RULE = eINSTANCE.getGovernanceStrategy_WIAcceptanceRule();

    /**
     * The meta object literal for the '<em><b>WI Selection Rule</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOVERNANCE_STRATEGY__WI_SELECTION_RULE = eINSTANCE.getGovernanceStrategy_WISelectionRule();

    /**
     * The meta object literal for the '<em><b>WI Assignment Rule</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOVERNANCE_STRATEGY__WI_ASSIGNMENT_RULE = eINSTANCE.getGovernanceStrategy_WIAssignmentRule();

    /**
     * The meta object literal for the '<em><b>Resource Allocation Rule</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOVERNANCE_STRATEGY__RESOURCE_ALLOCATION_RULE = eINSTANCE.getGovernanceStrategy_ResourceAllocationRule();

    /**
     * The meta object literal for the '<em><b>Resource Outsourcing Rule</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOVERNANCE_STRATEGY__RESOURCE_OUTSOURCING_RULE = eINSTANCE.getGovernanceStrategy_ResourceOutsourcingRule();

    /**
     * The meta object literal for the '<em><b>Mechanisms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOVERNANCE_STRATEGY__MECHANISMS = eINSTANCE.getGovernanceStrategy_Mechanisms();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WIAcceptanceImpl <em>WI Acceptance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WIAcceptanceImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWIAcceptance()
     * @generated
     */
    EClass WI_ACCEPTANCE = eINSTANCE.getWIAcceptance();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WI_ACCEPTANCE__TYPE = eINSTANCE.getWIAcceptance_Type();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WI_ACCEPTANCE__DESCRIPTION = eINSTANCE.getWIAcceptance_Description();

    /**
     * The meta object literal for the '<em><b>Backlog QLimit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WI_ACCEPTANCE__BACKLOG_QLIMIT = eINSTANCE.getWIAcceptance_BacklogQLimit();

    /**
     * The meta object literal for the '<em><b>Ready QLimit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WI_ACCEPTANCE__READY_QLIMIT = eINSTANCE.getWIAcceptance_ReadyQLimit();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WISelectionImpl <em>WI Selection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WISelectionImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWISelection()
     * @generated
     */
    EClass WI_SELECTION = eINSTANCE.getWISelection();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WI_SELECTION__TYPE = eINSTANCE.getWISelection_Type();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WI_SELECTION__DESCRIPTION = eINSTANCE.getWISelection_Description();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WIAssignmentImpl <em>WI Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WIAssignmentImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWIAssignment()
     * @generated
     */
    EClass WI_ASSIGNMENT = eINSTANCE.getWIAssignment();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WI_ASSIGNMENT__TYPE = eINSTANCE.getWIAssignment_Type();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WI_ASSIGNMENT__DESCRIPTION = eINSTANCE.getWIAssignment_Description();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ResourceAllocationImpl <em>Resource Allocation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ResourceAllocationImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getResourceAllocation()
     * @generated
     */
    EClass RESOURCE_ALLOCATION = eINSTANCE.getResourceAllocation();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE_ALLOCATION__TYPE = eINSTANCE.getResourceAllocation_Type();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE_ALLOCATION__DESCRIPTION = eINSTANCE.getResourceAllocation_Description();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ResourceOutsourcingImpl <em>Resource Outsourcing</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ResourceOutsourcingImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getResourceOutsourcing()
     * @generated
     */
    EClass RESOURCE_OUTSOURCING = eINSTANCE.getResourceOutsourcing();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE_OUTSOURCING__TYPE = eINSTANCE.getResourceOutsourcing_Type();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE_OUTSOURCING__DESCRIPTION = eINSTANCE.getResourceOutsourcing_Description();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WIAcceptanceRuleTypeImpl <em>WI Acceptance Rule Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WIAcceptanceRuleTypeImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWIAcceptanceRuleType()
     * @generated
     */
    EClass WI_ACCEPTANCE_RULE_TYPE = eINSTANCE.getWIAcceptanceRuleType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WI_ACCEPTANCE_RULE_TYPE__NAME = eINSTANCE.getWIAcceptanceRuleType_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WI_ACCEPTANCE_RULE_TYPE__DESCRIPTION = eINSTANCE.getWIAcceptanceRuleType_Description();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WISelectionRuleTypeImpl <em>WI Selection Rule Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WISelectionRuleTypeImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWISelectionRuleType()
     * @generated
     */
    EClass WI_SELECTION_RULE_TYPE = eINSTANCE.getWISelectionRuleType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WI_SELECTION_RULE_TYPE__NAME = eINSTANCE.getWISelectionRuleType_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WI_SELECTION_RULE_TYPE__DESCRIPTION = eINSTANCE.getWISelectionRuleType_Description();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WIAssignmentRuleTypeImpl <em>WI Assignment Rule Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WIAssignmentRuleTypeImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWIAssignmentRuleType()
     * @generated
     */
    EClass WI_ASSIGNMENT_RULE_TYPE = eINSTANCE.getWIAssignmentRuleType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WI_ASSIGNMENT_RULE_TYPE__NAME = eINSTANCE.getWIAssignmentRuleType_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WI_ASSIGNMENT_RULE_TYPE__DESCRIPTION = eINSTANCE.getWIAssignmentRuleType_Description();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ResourceAllocationRuleTypeImpl <em>Resource Allocation Rule Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ResourceAllocationRuleTypeImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getResourceAllocationRuleType()
     * @generated
     */
    EClass RESOURCE_ALLOCATION_RULE_TYPE = eINSTANCE.getResourceAllocationRuleType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE_ALLOCATION_RULE_TYPE__NAME = eINSTANCE.getResourceAllocationRuleType_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE_ALLOCATION_RULE_TYPE__DESCRIPTION = eINSTANCE.getResourceAllocationRuleType_Description();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ResourceOutsourcingRuleTypeImpl <em>Resource Outsourcing Rule Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ResourceOutsourcingRuleTypeImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getResourceOutsourcingRuleType()
     * @generated
     */
    EClass RESOURCE_OUTSOURCING_RULE_TYPE = eINSTANCE.getResourceOutsourcingRuleType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE_OUTSOURCING_RULE_TYPE__NAME = eINSTANCE.getResourceOutsourcingRuleType_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE_OUTSOURCING_RULE_TYPE__DESCRIPTION = eINSTANCE.getResourceOutsourcingRuleType_Description();

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
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_SOURCE__ID = eINSTANCE.getWorkSource_Id();

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
     * The meta object literal for the '<em><b>Assignment Rule</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_SOURCE__ASSIGNMENT_RULE = eINSTANCE.getWorkSource_AssignmentRule();

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
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM_NETWORK__ID = eINSTANCE.getWorkItemNetwork_Id();

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
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl <em>Work Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWorkItem()
     * @generated
     */
    EClass WORK_ITEM = eINSTANCE.getWorkItem();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM__ID = eINSTANCE.getWorkItem_Id();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM__NAME = eINSTANCE.getWorkItem_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM__DESCRIPTION = eINSTANCE.getWorkItem_Description();

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
     * The meta object literal for the '<em><b>Is Aggregation Node</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM__IS_AGGREGATION_NODE = eINSTANCE.getWorkItem_IsAggregationNode();

    /**
     * The meta object literal for the '<em><b>STasks</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM__STASKS = eINSTANCE.getWorkItem_STasks();

    /**
     * The meta object literal for the '<em><b>Causal Triggers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM__CAUSAL_TRIGGERS = eINSTANCE.getWorkItem_CausalTriggers();

    /**
     * The meta object literal for the '<em><b>Required Services</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM__REQUIRED_SERVICES = eINSTANCE.getWorkItem_RequiredServices();

    /**
     * The meta object literal for the '<em><b>Efforts</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM__EFFORTS = eINSTANCE.getWorkItem_Efforts();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM__VALUE = eINSTANCE.getWorkItem_Value();

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
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.CausalTriggerImpl <em>Causal Trigger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.CausalTriggerImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getCausalTrigger()
     * @generated
     */
    EClass CAUSAL_TRIGGER = eINSTANCE.getCausalTrigger();

    /**
     * The meta object literal for the '<em><b>Triggered</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAUSAL_TRIGGER__TRIGGERED = eINSTANCE.getCausalTrigger_Triggered();

    /**
     * The meta object literal for the '<em><b>At Progress</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAUSAL_TRIGGER__AT_PROGRESS = eINSTANCE.getCausalTrigger_AtProgress();

    /**
     * The meta object literal for the '<em><b>On Probability</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAUSAL_TRIGGER__ON_PROBABILITY = eINSTANCE.getCausalTrigger_OnProbability();

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
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__ID = eINSTANCE.getService_Id();

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
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceProviderImpl <em>Service Provider</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceProviderImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getServiceProvider()
     * @generated
     */
    EClass SERVICE_PROVIDER = eINSTANCE.getServiceProvider();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE_PROVIDER__ID = eINSTANCE.getServiceProvider_Id();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE_PROVIDER__NAME = eINSTANCE.getServiceProvider_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE_PROVIDER__DESCRIPTION = eINSTANCE.getServiceProvider_Description();

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
     * The meta object literal for the '<em><b>Team Service</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_PROVIDER__TEAM_SERVICE = eINSTANCE.getServiceProvider_TeamService();

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
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AssetImpl <em>Asset</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AssetImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getAsset()
     * @generated
     */
    EClass ASSET = eINSTANCE.getAsset();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSET__ID = eINSTANCE.getAsset_Id();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSET__NAME = eINSTANCE.getAsset_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSET__DESCRIPTION = eINSTANCE.getAsset_Description();

    /**
     * The meta object literal for the '<em><b>Skill Set</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSET__SKILL_SET = eINSTANCE.getAsset_SkillSet();

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

  }

} //KanbanmodelPackage
