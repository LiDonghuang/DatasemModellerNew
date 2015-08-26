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
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl <em>Kanban Scheduling System</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getKanbanSchedulingSystem()
   * @generated
   */
  int KANBAN_SCHEDULING_SYSTEM = 0;

  /**
   * The feature id for the '<em><b>Event Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM__EVENT_TYPES = 0;

  /**
   * The feature id for the '<em><b>Condition Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM__CONDITION_TYPES = 1;

  /**
   * The feature id for the '<em><b>WI Acceptance Rule Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM__WI_ACCEPTANCE_RULE_TYPES = 2;

  /**
   * The feature id for the '<em><b>WI Selection Rule Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM__WI_SELECTION_RULE_TYPES = 3;

  /**
   * The feature id for the '<em><b>WI Assignment Rule Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM__WI_ASSIGNMENT_RULE_TYPES = 4;

  /**
   * The feature id for the '<em><b>Resource Allocation Rule Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM__RESOURCE_ALLOCATION_RULE_TYPES = 5;

  /**
   * The feature id for the '<em><b>Resource Outsourcing Rule Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM__RESOURCE_OUTSOURCING_RULE_TYPES = 6;

  /**
   * The feature id for the '<em><b>Process Models</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM__PROCESS_MODELS = 7;

  /**
   * The feature id for the '<em><b>Value Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM__VALUE_FUNCTIONS = 8;

  /**
   * The feature id for the '<em><b>Task Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM__TASK_TYPES = 9;

  /**
   * The feature id for the '<em><b>Task Hierarchy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM__TASK_HIERARCHY = 10;

  /**
   * The feature id for the '<em><b>Class Of Services</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM__CLASS_OF_SERVICES = 11;

  /**
   * The feature id for the '<em><b>Services</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM__SERVICES = 12;

  /**
   * The feature id for the '<em><b>Governance Strategies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM__GOVERNANCE_STRATEGIES = 13;

  /**
   * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM__REPOSITORIES = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM__NAME = 15;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM__PATH = 16;

  /**
   * The feature id for the '<em><b>Service Providers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM__SERVICE_PROVIDERS = 17;

  /**
   * The feature id for the '<em><b>Work Sources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM__WORK_SOURCES = 18;

  /**
   * The feature id for the '<em><b>Work Item Networks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM__WORK_ITEM_NETWORKS = 19;

  /**
   * The feature id for the '<em><b>Replications</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM__REPLICATIONS = 20;

  /**
   * The feature id for the '<em><b>Inter Arrival Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM__INTER_ARRIVAL_TIME = 21;

  /**
   * The number of structural features of the '<em>Kanban Scheduling System</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_SCHEDULING_SYSTEM_FEATURE_COUNT = 22;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.NumExpressionImpl <em>Num Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.NumExpressionImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getNumExpression()
   * @generated
   */
  int NUM_EXPRESSION = 1;

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
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.DistributionImpl <em>Distribution</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.DistributionImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getDistribution()
   * @generated
   */
  int DISTRIBUTION = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTION__PARAMETERS = 1;

  /**
   * The number of structural features of the '<em>Distribution</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTRIBUTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.EventTypeImpl <em>Event Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.EventTypeImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getEventType()
   * @generated
   */
  int EVENT_TYPE = 3;

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
  int CONDITION_TYPE = 4;

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
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.GovernanceStrategyImpl <em>Governance Strategy</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.GovernanceStrategyImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getGovernanceStrategy()
   * @generated
   */
  int GOVERNANCE_STRATEGY = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOVERNANCE_STRATEGY__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOVERNANCE_STRATEGY__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>WI Acceptance Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOVERNANCE_STRATEGY__WI_ACCEPTANCE_RULE = 2;

  /**
   * The feature id for the '<em><b>WI Selection Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOVERNANCE_STRATEGY__WI_SELECTION_RULE = 3;

  /**
   * The feature id for the '<em><b>WI Assignment Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOVERNANCE_STRATEGY__WI_ASSIGNMENT_RULE = 4;

  /**
   * The feature id for the '<em><b>Resource Allocation Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOVERNANCE_STRATEGY__RESOURCE_ALLOCATION_RULE = 5;

  /**
   * The feature id for the '<em><b>Resource Outsourcing Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOVERNANCE_STRATEGY__RESOURCE_OUTSOURCING_RULE = 6;

  /**
   * The feature id for the '<em><b>Mechanisms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOVERNANCE_STRATEGY__MECHANISMS = 7;

  /**
   * The number of structural features of the '<em>Governance Strategy</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOVERNANCE_STRATEGY_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WIAcceptanceImpl <em>WI Acceptance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WIAcceptanceImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWIAcceptance()
   * @generated
   */
  int WI_ACCEPTANCE = 6;

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
  int WI_SELECTION = 7;

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
  int WI_ASSIGNMENT = 8;

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
  int RESOURCE_ALLOCATION = 9;

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
  int RESOURCE_OUTSOURCING = 10;

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
  int WI_ACCEPTANCE_RULE_TYPE = 11;

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
  int WI_SELECTION_RULE_TYPE = 12;

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
  int WI_ASSIGNMENT_RULE_TYPE = 13;

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
  int RESOURCE_ALLOCATION_RULE_TYPE = 14;

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
  int RESOURCE_OUTSOURCING_RULE_TYPE = 15;

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
  int MECHANISM = 16;

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
   * The feature id for the '<em><b>Mechanism Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MECHANISM__MECHANISM_ATTRIBUTES = 3;

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
  int MECHANISM_ATTRIBUTE = 17;

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
  int WORK_SOURCE = 18;

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
   * The feature id for the '<em><b>Assignment Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_SOURCE__ASSIGNMENT_RULE = 3;

  /**
   * The number of structural features of the '<em>Work Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_SOURCE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemNetworkImpl <em>Work Item Network</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemNetworkImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWorkItemNetwork()
   * @generated
   */
  int WORK_ITEM_NETWORK = 19;

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
   * The number of structural features of the '<em>Work Item Network</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_NETWORK_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl <em>Work Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWorkItem()
   * @generated
   */
  int WORK_ITEM = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__NAME = 0;

  /**
   * The feature id for the '<em><b>Profile</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__PROFILE = 1;

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
   * The feature id for the '<em><b>PTasks</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__PTASKS = 4;

  /**
   * The feature id for the '<em><b>STasks</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__STASKS = 5;

  /**
   * The feature id for the '<em><b>Causal Triggers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__CAUSAL_TRIGGERS = 6;

  /**
   * The feature id for the '<em><b>Required Services</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__REQUIRED_SERVICES = 7;

  /**
   * The feature id for the '<em><b>Efforts</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__EFFORTS = 8;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__VALUE = 9;

  /**
   * The feature id for the '<em><b>Class Of Service</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__CLASS_OF_SERVICE = 10;

  /**
   * The feature id for the '<em><b>Work Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__WORK_SOURCE = 11;

  /**
   * The feature id for the '<em><b>Arrival Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__ARRIVAL_TIME = 12;

  /**
   * The feature id for the '<em><b>Due Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM__DUE_DATE = 13;

  /**
   * The number of structural features of the '<em>Work Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_FEATURE_COUNT = 14;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.CausalTriggerImpl <em>Causal Trigger</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.CausalTriggerImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getCausalTrigger()
   * @generated
   */
  int CAUSAL_TRIGGER = 21;

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
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.TaskHierarchyImpl <em>Task Hierarchy</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.TaskHierarchyImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getTaskHierarchy()
   * @generated
   */
  int TASK_HIERARCHY = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_HIERARCHY__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_HIERARCHY__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Task Types</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_HIERARCHY__TASK_TYPES = 2;

  /**
   * The number of structural features of the '<em>Task Hierarchy</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_HIERARCHY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.TaskTypeImpl <em>Task Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.TaskTypeImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getTaskType()
   * @generated
   */
  int TASK_TYPE = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_TYPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_TYPE__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>Task Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ValueFunctionImpl <em>Value Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ValueFunctionImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getValueFunction()
   * @generated
   */
  int VALUE_FUNCTION = 24;

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
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ProcessModelImpl <em>Process Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ProcessModelImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getProcessModel()
   * @generated
   */
  int PROCESS_MODEL = 25;

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
   * The number of structural features of the '<em>Process Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ClassOfServiceImpl <em>Class Of Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ClassOfServiceImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getClassOfService()
   * @generated
   */
  int CLASS_OF_SERVICE = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_OF_SERVICE__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_OF_SERVICE__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>Class Of Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_OF_SERVICE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.LocalValueImpl <em>Local Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.LocalValueImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getLocalValue()
   * @generated
   */
  int LOCAL_VALUE = 27;

  /**
   * The feature id for the '<em><b>Owner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VALUE__OWNER = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VALUE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Local Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceImpl <em>Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getService()
   * @generated
   */
  int SERVICE = 28;

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
   * The number of structural features of the '<em>Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceProviderImpl <em>Service Provider</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ServiceProviderImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getServiceProvider()
   * @generated
   */
  int SERVICE_PROVIDER = 29;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER__DESCRIPTION = 1;

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
   * The feature id for the '<em><b>Team Service</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER__TEAM_SERVICE = 4;

  /**
   * The feature id for the '<em><b>Governance Strategy</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER__GOVERNANCE_STRATEGY = 5;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER__RESOURCES = 6;

  /**
   * The number of structural features of the '<em>Service Provider</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROVIDER_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AssetImpl <em>Asset</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.AssetImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getAsset()
   * @generated
   */
  int ASSET = 30;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSET__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSET__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Skill Set</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSET__SKILL_SET = 2;

  /**
   * The number of structural features of the '<em>Asset</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSET_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.SkillImpl <em>Skill</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.SkillImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getSkill()
   * @generated
   */
  int SKILL = 31;

  /**
   * The feature id for the '<em><b>Service</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SKILL__SERVICE = 0;

  /**
   * The feature id for the '<em><b>Efficiency</b></em>' attribute.
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
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.RepositoryImpl <em>Repository</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.RepositoryImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getRepository()
   * @generated
   */
  int REPOSITORY = 32;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY__TYPE = 0;

  /**
   * The feature id for the '<em><b>Profiles</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY__PROFILES = 1;

  /**
   * The number of structural features of the '<em>Repository</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemProfileImpl <em>Work Item Profile</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemProfileImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWorkItemProfile()
   * @generated
   */
  int WORK_ITEM_PROFILE = 33;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_PROFILE__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_PROFILE__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Process Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_PROFILE__PROCESS_MODEL = 2;

  /**
   * The feature id for the '<em><b>References</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_PROFILE__REFERENCES = 3;

  /**
   * The feature id for the '<em><b>Decompositions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_PROFILE__DECOMPOSITIONS = 4;

  /**
   * The feature id for the '<em><b>Required Services</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_PROFILE__REQUIRED_SERVICES = 5;

  /**
   * The feature id for the '<em><b>Efforts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_PROFILE__EFFORTS = 6;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_PROFILE__VALUE = 7;

  /**
   * The feature id for the '<em><b>Class Of Service</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_PROFILE__CLASS_OF_SERVICE = 8;

  /**
   * The feature id for the '<em><b>Allow Assignment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_PROFILE__ALLOW_ASSIGNMENT = 9;

  /**
   * The feature id for the '<em><b>Allow Discard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_PROFILE__ALLOW_DISCARD = 10;

  /**
   * The number of structural features of the '<em>Work Item Profile</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_ITEM_PROFILE_FEATURE_COUNT = 11;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkReferenceImpl <em>Work Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkReferenceImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWorkReference()
   * @generated
   */
  int WORK_REFERENCE = 34;

  /**
   * The feature id for the '<em><b>Work Item</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_REFERENCE__WORK_ITEM = 0;

  /**
   * The feature id for the '<em><b>Quantity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_REFERENCE__QUANTITY = 1;

  /**
   * The number of structural features of the '<em>Work Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_REFERENCE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkDecompositionImpl <em>Work Decomposition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkDecompositionImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWorkDecomposition()
   * @generated
   */
  int WORK_DECOMPOSITION = 35;

  /**
   * The feature id for the '<em><b>Work Item</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_DECOMPOSITION__WORK_ITEM = 0;

  /**
   * The feature id for the '<em><b>Quantity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_DECOMPOSITION__QUANTITY = 1;

  /**
   * The number of structural features of the '<em>Work Decomposition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_DECOMPOSITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkPrecedencyImpl <em>Work Precedency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkPrecedencyImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWorkPrecedency()
   * @generated
   */
  int WORK_PRECEDENCY = 36;

  /**
   * The feature id for the '<em><b>Work Item</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_PRECEDENCY__WORK_ITEM = 0;

  /**
   * The number of structural features of the '<em>Work Precedency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_PRECEDENCY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkCausalityImpl <em>Work Causality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkCausalityImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWorkCausality()
   * @generated
   */
  int WORK_CAUSALITY = 37;

  /**
   * The feature id for the '<em><b>Work Item</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_CAUSALITY__WORK_ITEM = 0;

  /**
   * The number of structural features of the '<em>Work Causality</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_CAUSALITY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanTaskModelImpl <em>Kanban Task Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanTaskModelImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getKanbanTaskModel()
   * @generated
   */
  int KANBAN_TASK_MODEL = 38;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_TASK_MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Caps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_TASK_MODEL__CAPS = 1;

  /**
   * The number of structural features of the '<em>Kanban Task Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KANBAN_TASK_MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.CapabilityImpl <em>Capability</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.CapabilityImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getCapability()
   * @generated
   */
  int CAPABILITY = 39;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Reqs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY__REQS = 2;

  /**
   * The number of structural features of the '<em>Capability</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.RequirementImpl <em>Requirement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.RequirementImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getRequirement()
   * @generated
   */
  int REQUIREMENT = 40;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>RTasks</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__RTASKS = 2;

  /**
   * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__DEPENDENCIES = 3;

  /**
   * The number of structural features of the '<em>Requirement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.EntityImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 41;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = 0;

  /**
   * The feature id for the '<em><b>Sdname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__SDNAME = 1;

  /**
   * The feature id for the '<em><b>Service Provisions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__SERVICE_PROVISIONS = 2;

  /**
   * The feature id for the '<em><b>Entity Behavior</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__ENTITY_BEHAVIOR = 3;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ProvisionImpl <em>Provision</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ProvisionImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getProvision()
   * @generated
   */
  int PROVISION = 42;

  /**
   * The feature id for the '<em><b>Service Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVISION__SERVICE_NAME = 0;

  /**
   * The feature id for the '<em><b>Providers</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVISION__PROVIDERS = 1;

  /**
   * The number of structural features of the '<em>Provision</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVISION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.StatemachineImpl <em>Statemachine</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.StatemachineImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getStatemachine()
   * @generated
   */
  int STATEMACHINE = 43;

  /**
   * The feature id for the '<em><b>Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMACHINE__EVENTS = 0;

  /**
   * The feature id for the '<em><b>Commands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMACHINE__COMMANDS = 1;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMACHINE__STATES = 2;

  /**
   * The number of structural features of the '<em>Statemachine</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMACHINE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.EventImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getEvent()
   * @generated
   */
  int EVENT = 44;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__CODE = 1;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.CommandImpl <em>Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.CommandImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getCommand()
   * @generated
   */
  int COMMAND = 45;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__NAME = 0;

  /**
   * The feature id for the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__CODE = 1;

  /**
   * The number of structural features of the '<em>Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.StateImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getState()
   * @generated
   */
  int STATE = 46;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = 0;

  /**
   * The feature id for the '<em><b>Actions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__ACTIONS = 1;

  /**
   * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__TRANSITIONS = 2;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.TransitionImpl
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 47;

  /**
   * The feature id for the '<em><b>Event</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__EVENT = 0;

  /**
   * The feature id for the '<em><b>State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__STATE = 1;

  /**
   * The feature id for the '<em><b>Eventactions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__EVENTACTIONS = 2;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem <em>Kanban Scheduling System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Kanban Scheduling System</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem
   * @generated
   */
  EClass getKanbanSchedulingSystem();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getEventTypes <em>Event Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Event Types</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getEventTypes()
   * @see #getKanbanSchedulingSystem()
   * @generated
   */
  EReference getKanbanSchedulingSystem_EventTypes();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getConditionTypes <em>Condition Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Condition Types</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getConditionTypes()
   * @see #getKanbanSchedulingSystem()
   * @generated
   */
  EReference getKanbanSchedulingSystem_ConditionTypes();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getWIAcceptanceRuleTypes <em>WI Acceptance Rule Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>WI Acceptance Rule Types</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getWIAcceptanceRuleTypes()
   * @see #getKanbanSchedulingSystem()
   * @generated
   */
  EReference getKanbanSchedulingSystem_WIAcceptanceRuleTypes();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getWISelectionRuleTypes <em>WI Selection Rule Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>WI Selection Rule Types</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getWISelectionRuleTypes()
   * @see #getKanbanSchedulingSystem()
   * @generated
   */
  EReference getKanbanSchedulingSystem_WISelectionRuleTypes();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getWIAssignmentRuleTypes <em>WI Assignment Rule Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>WI Assignment Rule Types</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getWIAssignmentRuleTypes()
   * @see #getKanbanSchedulingSystem()
   * @generated
   */
  EReference getKanbanSchedulingSystem_WIAssignmentRuleTypes();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getResourceAllocationRuleTypes <em>Resource Allocation Rule Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Resource Allocation Rule Types</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getResourceAllocationRuleTypes()
   * @see #getKanbanSchedulingSystem()
   * @generated
   */
  EReference getKanbanSchedulingSystem_ResourceAllocationRuleTypes();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getResourceOutsourcingRuleTypes <em>Resource Outsourcing Rule Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Resource Outsourcing Rule Types</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getResourceOutsourcingRuleTypes()
   * @see #getKanbanSchedulingSystem()
   * @generated
   */
  EReference getKanbanSchedulingSystem_ResourceOutsourcingRuleTypes();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getProcessModels <em>Process Models</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Process Models</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getProcessModels()
   * @see #getKanbanSchedulingSystem()
   * @generated
   */
  EReference getKanbanSchedulingSystem_ProcessModels();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getValueFunctions <em>Value Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Value Functions</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getValueFunctions()
   * @see #getKanbanSchedulingSystem()
   * @generated
   */
  EReference getKanbanSchedulingSystem_ValueFunctions();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getTaskTypes <em>Task Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Task Types</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getTaskTypes()
   * @see #getKanbanSchedulingSystem()
   * @generated
   */
  EReference getKanbanSchedulingSystem_TaskTypes();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getTaskHierarchy <em>Task Hierarchy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Task Hierarchy</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getTaskHierarchy()
   * @see #getKanbanSchedulingSystem()
   * @generated
   */
  EReference getKanbanSchedulingSystem_TaskHierarchy();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getClassOfServices <em>Class Of Services</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Class Of Services</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getClassOfServices()
   * @see #getKanbanSchedulingSystem()
   * @generated
   */
  EReference getKanbanSchedulingSystem_ClassOfServices();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getServices <em>Services</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Services</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getServices()
   * @see #getKanbanSchedulingSystem()
   * @generated
   */
  EReference getKanbanSchedulingSystem_Services();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getGovernanceStrategies <em>Governance Strategies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Governance Strategies</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getGovernanceStrategies()
   * @see #getKanbanSchedulingSystem()
   * @generated
   */
  EReference getKanbanSchedulingSystem_GovernanceStrategies();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getRepositories <em>Repositories</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Repositories</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getRepositories()
   * @see #getKanbanSchedulingSystem()
   * @generated
   */
  EReference getKanbanSchedulingSystem_Repositories();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getName()
   * @see #getKanbanSchedulingSystem()
   * @generated
   */
  EAttribute getKanbanSchedulingSystem_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getPath()
   * @see #getKanbanSchedulingSystem()
   * @generated
   */
  EAttribute getKanbanSchedulingSystem_Path();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getServiceProviders <em>Service Providers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Service Providers</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getServiceProviders()
   * @see #getKanbanSchedulingSystem()
   * @generated
   */
  EReference getKanbanSchedulingSystem_ServiceProviders();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getWorkSources <em>Work Sources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Work Sources</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getWorkSources()
   * @see #getKanbanSchedulingSystem()
   * @generated
   */
  EReference getKanbanSchedulingSystem_WorkSources();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getWorkItemNetworks <em>Work Item Networks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Work Item Networks</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getWorkItemNetworks()
   * @see #getKanbanSchedulingSystem()
   * @generated
   */
  EReference getKanbanSchedulingSystem_WorkItemNetworks();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getReplications <em>Replications</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replications</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getReplications()
   * @see #getKanbanSchedulingSystem()
   * @generated
   */
  EAttribute getKanbanSchedulingSystem_Replications();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getInterArrivalTime <em>Inter Arrival Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inter Arrival Time</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem#getInterArrivalTime()
   * @see #getKanbanSchedulingSystem()
   * @generated
   */
  EAttribute getKanbanSchedulingSystem_InterArrivalTime();

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
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Distribution <em>Distribution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Distribution</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Distribution
   * @generated
   */
  EClass getDistribution();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Distribution#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Distribution#getType()
   * @see #getDistribution()
   * @generated
   */
  EAttribute getDistribution_Type();

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
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Mechanism#getMechanismAttributes <em>Mechanism Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mechanism Attributes</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Mechanism#getMechanismAttributes()
   * @see #getMechanism()
   * @generated
   */
  EReference getMechanism_MechanismAttributes();

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
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getProfile <em>Profile</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Profile</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getProfile()
   * @see #getWorkItem()
   * @generated
   */
  EReference getWorkItem_Profile();

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
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getEfforts <em>Efforts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Efforts</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getEfforts()
   * @see #getWorkItem()
   * @generated
   */
  EAttribute getWorkItem_Efforts();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem#getValue()
   * @see #getWorkItem()
   * @generated
   */
  EAttribute getWorkItem_Value();

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
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.TaskHierarchy <em>Task Hierarchy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task Hierarchy</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.TaskHierarchy
   * @generated
   */
  EClass getTaskHierarchy();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.TaskHierarchy#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.TaskHierarchy#getName()
   * @see #getTaskHierarchy()
   * @generated
   */
  EAttribute getTaskHierarchy_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.TaskHierarchy#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.TaskHierarchy#getDescription()
   * @see #getTaskHierarchy()
   * @generated
   */
  EAttribute getTaskHierarchy_Description();

  /**
   * Returns the meta object for the reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.TaskHierarchy#getTaskTypes <em>Task Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Task Types</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.TaskHierarchy#getTaskTypes()
   * @see #getTaskHierarchy()
   * @generated
   */
  EReference getTaskHierarchy_TaskTypes();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.TaskType <em>Task Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task Type</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.TaskType
   * @generated
   */
  EClass getTaskType();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.TaskType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.TaskType#getName()
   * @see #getTaskType()
   * @generated
   */
  EAttribute getTaskType_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.TaskType#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.TaskType#getDescription()
   * @see #getTaskType()
   * @generated
   */
  EAttribute getTaskType_Description();

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
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ClassOfService <em>Class Of Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Of Service</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ClassOfService
   * @generated
   */
  EClass getClassOfService();

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
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.LocalValue <em>Local Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Value</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.LocalValue
   * @generated
   */
  EClass getLocalValue();

  /**
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.LocalValue#getOwner <em>Owner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Owner</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.LocalValue#getOwner()
   * @see #getLocalValue()
   * @generated
   */
  EReference getLocalValue_Owner();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.LocalValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.LocalValue#getValue()
   * @see #getLocalValue()
   * @generated
   */
  EAttribute getLocalValue_Value();

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
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Skill#getEfficiency <em>Efficiency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Efficiency</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Skill#getEfficiency()
   * @see #getSkill()
   * @generated
   */
  EAttribute getSkill_Efficiency();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Repository <em>Repository</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Repository</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Repository
   * @generated
   */
  EClass getRepository();

  /**
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Repository#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Repository#getType()
   * @see #getRepository()
   * @generated
   */
  EReference getRepository_Type();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Repository#getProfiles <em>Profiles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Profiles</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Repository#getProfiles()
   * @see #getRepository()
   * @generated
   */
  EReference getRepository_Profiles();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile <em>Work Item Profile</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Work Item Profile</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile
   * @generated
   */
  EClass getWorkItemProfile();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getName()
   * @see #getWorkItemProfile()
   * @generated
   */
  EAttribute getWorkItemProfile_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getDescription()
   * @see #getWorkItemProfile()
   * @generated
   */
  EAttribute getWorkItemProfile_Description();

  /**
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getProcessModel <em>Process Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Process Model</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getProcessModel()
   * @see #getWorkItemProfile()
   * @generated
   */
  EReference getWorkItemProfile_ProcessModel();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getReferences <em>References</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>References</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getReferences()
   * @see #getWorkItemProfile()
   * @generated
   */
  EReference getWorkItemProfile_References();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getDecompositions <em>Decompositions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Decompositions</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getDecompositions()
   * @see #getWorkItemProfile()
   * @generated
   */
  EReference getWorkItemProfile_Decompositions();

  /**
   * Returns the meta object for the reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getRequiredServices <em>Required Services</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Required Services</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getRequiredServices()
   * @see #getWorkItemProfile()
   * @generated
   */
  EReference getWorkItemProfile_RequiredServices();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getEfforts <em>Efforts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Efforts</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getEfforts()
   * @see #getWorkItemProfile()
   * @generated
   */
  EReference getWorkItemProfile_Efforts();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getValue()
   * @see #getWorkItemProfile()
   * @generated
   */
  EReference getWorkItemProfile_Value();

  /**
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getClassOfService <em>Class Of Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Class Of Service</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#getClassOfService()
   * @see #getWorkItemProfile()
   * @generated
   */
  EReference getWorkItemProfile_ClassOfService();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#isAllowAssignment <em>Allow Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Allow Assignment</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#isAllowAssignment()
   * @see #getWorkItemProfile()
   * @generated
   */
  EAttribute getWorkItemProfile_AllowAssignment();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#isAllowDiscard <em>Allow Discard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Allow Discard</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile#isAllowDiscard()
   * @see #getWorkItemProfile()
   * @generated
   */
  EAttribute getWorkItemProfile_AllowDiscard();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkReference <em>Work Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Work Reference</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkReference
   * @generated
   */
  EClass getWorkReference();

  /**
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkReference#getWorkItem <em>Work Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Work Item</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkReference#getWorkItem()
   * @see #getWorkReference()
   * @generated
   */
  EReference getWorkReference_WorkItem();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkReference#getQuantity <em>Quantity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantity</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkReference#getQuantity()
   * @see #getWorkReference()
   * @generated
   */
  EReference getWorkReference_Quantity();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkDecomposition <em>Work Decomposition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Work Decomposition</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkDecomposition
   * @generated
   */
  EClass getWorkDecomposition();

  /**
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkDecomposition#getWorkItem <em>Work Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Work Item</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkDecomposition#getWorkItem()
   * @see #getWorkDecomposition()
   * @generated
   */
  EReference getWorkDecomposition_WorkItem();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkDecomposition#getQuantity <em>Quantity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantity</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkDecomposition#getQuantity()
   * @see #getWorkDecomposition()
   * @generated
   */
  EReference getWorkDecomposition_Quantity();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkPrecedency <em>Work Precedency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Work Precedency</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkPrecedency
   * @generated
   */
  EClass getWorkPrecedency();

  /**
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkPrecedency#getWorkItem <em>Work Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Work Item</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkPrecedency#getWorkItem()
   * @see #getWorkPrecedency()
   * @generated
   */
  EReference getWorkPrecedency_WorkItem();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkCausality <em>Work Causality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Work Causality</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkCausality
   * @generated
   */
  EClass getWorkCausality();

  /**
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkCausality#getWorkItem <em>Work Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Work Item</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkCausality#getWorkItem()
   * @see #getWorkCausality()
   * @generated
   */
  EReference getWorkCausality_WorkItem();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanTaskModel <em>Kanban Task Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Kanban Task Model</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanTaskModel
   * @generated
   */
  EClass getKanbanTaskModel();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanTaskModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanTaskModel#getName()
   * @see #getKanbanTaskModel()
   * @generated
   */
  EAttribute getKanbanTaskModel_Name();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanTaskModel#getCaps <em>Caps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Caps</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanTaskModel#getCaps()
   * @see #getKanbanTaskModel()
   * @generated
   */
  EReference getKanbanTaskModel_Caps();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Capability <em>Capability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Capability</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Capability
   * @generated
   */
  EClass getCapability();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Capability#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Capability#getName()
   * @see #getCapability()
   * @generated
   */
  EAttribute getCapability_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Capability#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Capability#getDescription()
   * @see #getCapability()
   * @generated
   */
  EAttribute getCapability_Description();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Capability#getReqs <em>Reqs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Reqs</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Capability#getReqs()
   * @see #getCapability()
   * @generated
   */
  EReference getCapability_Reqs();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Requirement <em>Requirement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Requirement</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Requirement
   * @generated
   */
  EClass getRequirement();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Requirement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Requirement#getName()
   * @see #getRequirement()
   * @generated
   */
  EAttribute getRequirement_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Requirement#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Requirement#getDescription()
   * @see #getRequirement()
   * @generated
   */
  EAttribute getRequirement_Description();

  /**
   * Returns the meta object for the reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Requirement#getRTasks <em>RTasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>RTasks</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Requirement#getRTasks()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_RTasks();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Requirement#getDependencies <em>Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dependencies</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Requirement#getDependencies()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_Dependencies();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Entity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Entity#getName()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Entity#getSdname <em>Sdname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sdname</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Entity#getSdname()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Sdname();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Entity#getServiceProvisions <em>Service Provisions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Service Provisions</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Entity#getServiceProvisions()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_ServiceProvisions();

  /**
   * Returns the meta object for the containment reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Entity#getEntityBehavior <em>Entity Behavior</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Entity Behavior</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Entity#getEntityBehavior()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_EntityBehavior();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Provision <em>Provision</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Provision</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Provision
   * @generated
   */
  EClass getProvision();

  /**
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Provision#getServiceName <em>Service Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Service Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Provision#getServiceName()
   * @see #getProvision()
   * @generated
   */
  EReference getProvision_ServiceName();

  /**
   * Returns the meta object for the reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Provision#getProviders <em>Providers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Providers</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Provision#getProviders()
   * @see #getProvision()
   * @generated
   */
  EReference getProvision_Providers();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statemachine <em>Statemachine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statemachine</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Statemachine
   * @generated
   */
  EClass getStatemachine();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statemachine#getEvents <em>Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Events</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Statemachine#getEvents()
   * @see #getStatemachine()
   * @generated
   */
  EReference getStatemachine_Events();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statemachine#getCommands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Commands</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Statemachine#getCommands()
   * @see #getStatemachine()
   * @generated
   */
  EReference getStatemachine_Commands();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statemachine#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Statemachine#getStates()
   * @see #getStatemachine()
   * @generated
   */
  EReference getStatemachine_States();

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
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Event#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Event#getName()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Event#getCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Event#getCode()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Code();

  /**
   * Returns the meta object for class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Command
   * @generated
   */
  EClass getCommand();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Command#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Command#getName()
   * @see #getCommand()
   * @generated
   */
  EAttribute getCommand_Name();

  /**
   * Returns the meta object for the attribute '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Command#getCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Command#getCode()
   * @see #getCommand()
   * @generated
   */
  EAttribute getCommand_Code();

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
   * Returns the meta object for the reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.State#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Actions</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.State#getActions()
   * @see #getState()
   * @generated
   */
  EReference getState_Actions();

  /**
   * Returns the meta object for the containment reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.State#getTransitions <em>Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transitions</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.State#getTransitions()
   * @see #getState()
   * @generated
   */
  EReference getState_Transitions();

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
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Transition#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Event</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Transition#getEvent()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Event();

  /**
   * Returns the meta object for the reference '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Transition#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>State</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Transition#getState()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_State();

  /**
   * Returns the meta object for the reference list '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Transition#getEventactions <em>Eventactions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Eventactions</em>'.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Transition#getEventactions()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Eventactions();

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
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl <em>Kanban Scheduling System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getKanbanSchedulingSystem()
     * @generated
     */
    EClass KANBAN_SCHEDULING_SYSTEM = eINSTANCE.getKanbanSchedulingSystem();

    /**
     * The meta object literal for the '<em><b>Event Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KANBAN_SCHEDULING_SYSTEM__EVENT_TYPES = eINSTANCE.getKanbanSchedulingSystem_EventTypes();

    /**
     * The meta object literal for the '<em><b>Condition Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KANBAN_SCHEDULING_SYSTEM__CONDITION_TYPES = eINSTANCE.getKanbanSchedulingSystem_ConditionTypes();

    /**
     * The meta object literal for the '<em><b>WI Acceptance Rule Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KANBAN_SCHEDULING_SYSTEM__WI_ACCEPTANCE_RULE_TYPES = eINSTANCE.getKanbanSchedulingSystem_WIAcceptanceRuleTypes();

    /**
     * The meta object literal for the '<em><b>WI Selection Rule Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KANBAN_SCHEDULING_SYSTEM__WI_SELECTION_RULE_TYPES = eINSTANCE.getKanbanSchedulingSystem_WISelectionRuleTypes();

    /**
     * The meta object literal for the '<em><b>WI Assignment Rule Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KANBAN_SCHEDULING_SYSTEM__WI_ASSIGNMENT_RULE_TYPES = eINSTANCE.getKanbanSchedulingSystem_WIAssignmentRuleTypes();

    /**
     * The meta object literal for the '<em><b>Resource Allocation Rule Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KANBAN_SCHEDULING_SYSTEM__RESOURCE_ALLOCATION_RULE_TYPES = eINSTANCE.getKanbanSchedulingSystem_ResourceAllocationRuleTypes();

    /**
     * The meta object literal for the '<em><b>Resource Outsourcing Rule Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KANBAN_SCHEDULING_SYSTEM__RESOURCE_OUTSOURCING_RULE_TYPES = eINSTANCE.getKanbanSchedulingSystem_ResourceOutsourcingRuleTypes();

    /**
     * The meta object literal for the '<em><b>Process Models</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KANBAN_SCHEDULING_SYSTEM__PROCESS_MODELS = eINSTANCE.getKanbanSchedulingSystem_ProcessModels();

    /**
     * The meta object literal for the '<em><b>Value Functions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KANBAN_SCHEDULING_SYSTEM__VALUE_FUNCTIONS = eINSTANCE.getKanbanSchedulingSystem_ValueFunctions();

    /**
     * The meta object literal for the '<em><b>Task Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KANBAN_SCHEDULING_SYSTEM__TASK_TYPES = eINSTANCE.getKanbanSchedulingSystem_TaskTypes();

    /**
     * The meta object literal for the '<em><b>Task Hierarchy</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KANBAN_SCHEDULING_SYSTEM__TASK_HIERARCHY = eINSTANCE.getKanbanSchedulingSystem_TaskHierarchy();

    /**
     * The meta object literal for the '<em><b>Class Of Services</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KANBAN_SCHEDULING_SYSTEM__CLASS_OF_SERVICES = eINSTANCE.getKanbanSchedulingSystem_ClassOfServices();

    /**
     * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KANBAN_SCHEDULING_SYSTEM__SERVICES = eINSTANCE.getKanbanSchedulingSystem_Services();

    /**
     * The meta object literal for the '<em><b>Governance Strategies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KANBAN_SCHEDULING_SYSTEM__GOVERNANCE_STRATEGIES = eINSTANCE.getKanbanSchedulingSystem_GovernanceStrategies();

    /**
     * The meta object literal for the '<em><b>Repositories</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KANBAN_SCHEDULING_SYSTEM__REPOSITORIES = eINSTANCE.getKanbanSchedulingSystem_Repositories();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KANBAN_SCHEDULING_SYSTEM__NAME = eINSTANCE.getKanbanSchedulingSystem_Name();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KANBAN_SCHEDULING_SYSTEM__PATH = eINSTANCE.getKanbanSchedulingSystem_Path();

    /**
     * The meta object literal for the '<em><b>Service Providers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KANBAN_SCHEDULING_SYSTEM__SERVICE_PROVIDERS = eINSTANCE.getKanbanSchedulingSystem_ServiceProviders();

    /**
     * The meta object literal for the '<em><b>Work Sources</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KANBAN_SCHEDULING_SYSTEM__WORK_SOURCES = eINSTANCE.getKanbanSchedulingSystem_WorkSources();

    /**
     * The meta object literal for the '<em><b>Work Item Networks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KANBAN_SCHEDULING_SYSTEM__WORK_ITEM_NETWORKS = eINSTANCE.getKanbanSchedulingSystem_WorkItemNetworks();

    /**
     * The meta object literal for the '<em><b>Replications</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KANBAN_SCHEDULING_SYSTEM__REPLICATIONS = eINSTANCE.getKanbanSchedulingSystem_Replications();

    /**
     * The meta object literal for the '<em><b>Inter Arrival Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KANBAN_SCHEDULING_SYSTEM__INTER_ARRIVAL_TIME = eINSTANCE.getKanbanSchedulingSystem_InterArrivalTime();

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
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.DistributionImpl <em>Distribution</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.DistributionImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getDistribution()
     * @generated
     */
    EClass DISTRIBUTION = eINSTANCE.getDistribution();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DISTRIBUTION__TYPE = eINSTANCE.getDistribution_Type();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DISTRIBUTION__PARAMETERS = eINSTANCE.getDistribution_Parameters();

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
     * The meta object literal for the '<em><b>Mechanism Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MECHANISM__MECHANISM_ATTRIBUTES = eINSTANCE.getMechanism_MechanismAttributes();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM__NAME = eINSTANCE.getWorkItem_Name();

    /**
     * The meta object literal for the '<em><b>Profile</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM__PROFILE = eINSTANCE.getWorkItem_Profile();

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
     * The meta object literal for the '<em><b>PTasks</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM__PTASKS = eINSTANCE.getWorkItem_PTasks();

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
     * The meta object literal for the '<em><b>Efforts</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM__EFFORTS = eINSTANCE.getWorkItem_Efforts();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM__VALUE = eINSTANCE.getWorkItem_Value();

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
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.TaskHierarchyImpl <em>Task Hierarchy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.TaskHierarchyImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getTaskHierarchy()
     * @generated
     */
    EClass TASK_HIERARCHY = eINSTANCE.getTaskHierarchy();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK_HIERARCHY__NAME = eINSTANCE.getTaskHierarchy_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK_HIERARCHY__DESCRIPTION = eINSTANCE.getTaskHierarchy_Description();

    /**
     * The meta object literal for the '<em><b>Task Types</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK_HIERARCHY__TASK_TYPES = eINSTANCE.getTaskHierarchy_TaskTypes();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.TaskTypeImpl <em>Task Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.TaskTypeImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getTaskType()
     * @generated
     */
    EClass TASK_TYPE = eINSTANCE.getTaskType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK_TYPE__NAME = eINSTANCE.getTaskType_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK_TYPE__DESCRIPTION = eINSTANCE.getTaskType_Description();

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
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ClassOfServiceImpl <em>Class Of Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ClassOfServiceImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getClassOfService()
     * @generated
     */
    EClass CLASS_OF_SERVICE = eINSTANCE.getClassOfService();

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
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.LocalValueImpl <em>Local Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.LocalValueImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getLocalValue()
     * @generated
     */
    EClass LOCAL_VALUE = eINSTANCE.getLocalValue();

    /**
     * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_VALUE__OWNER = eINSTANCE.getLocalValue_Owner();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL_VALUE__VALUE = eINSTANCE.getLocalValue_Value();

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
     * The meta object literal for the '<em><b>Efficiency</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SKILL__EFFICIENCY = eINSTANCE.getSkill_Efficiency();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.RepositoryImpl <em>Repository</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.RepositoryImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getRepository()
     * @generated
     */
    EClass REPOSITORY = eINSTANCE.getRepository();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPOSITORY__TYPE = eINSTANCE.getRepository_Type();

    /**
     * The meta object literal for the '<em><b>Profiles</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPOSITORY__PROFILES = eINSTANCE.getRepository_Profiles();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemProfileImpl <em>Work Item Profile</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemProfileImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWorkItemProfile()
     * @generated
     */
    EClass WORK_ITEM_PROFILE = eINSTANCE.getWorkItemProfile();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM_PROFILE__NAME = eINSTANCE.getWorkItemProfile_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM_PROFILE__DESCRIPTION = eINSTANCE.getWorkItemProfile_Description();

    /**
     * The meta object literal for the '<em><b>Process Model</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM_PROFILE__PROCESS_MODEL = eINSTANCE.getWorkItemProfile_ProcessModel();

    /**
     * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM_PROFILE__REFERENCES = eINSTANCE.getWorkItemProfile_References();

    /**
     * The meta object literal for the '<em><b>Decompositions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM_PROFILE__DECOMPOSITIONS = eINSTANCE.getWorkItemProfile_Decompositions();

    /**
     * The meta object literal for the '<em><b>Required Services</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM_PROFILE__REQUIRED_SERVICES = eINSTANCE.getWorkItemProfile_RequiredServices();

    /**
     * The meta object literal for the '<em><b>Efforts</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM_PROFILE__EFFORTS = eINSTANCE.getWorkItemProfile_Efforts();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM_PROFILE__VALUE = eINSTANCE.getWorkItemProfile_Value();

    /**
     * The meta object literal for the '<em><b>Class Of Service</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_ITEM_PROFILE__CLASS_OF_SERVICE = eINSTANCE.getWorkItemProfile_ClassOfService();

    /**
     * The meta object literal for the '<em><b>Allow Assignment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM_PROFILE__ALLOW_ASSIGNMENT = eINSTANCE.getWorkItemProfile_AllowAssignment();

    /**
     * The meta object literal for the '<em><b>Allow Discard</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_ITEM_PROFILE__ALLOW_DISCARD = eINSTANCE.getWorkItemProfile_AllowDiscard();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkReferenceImpl <em>Work Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkReferenceImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWorkReference()
     * @generated
     */
    EClass WORK_REFERENCE = eINSTANCE.getWorkReference();

    /**
     * The meta object literal for the '<em><b>Work Item</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_REFERENCE__WORK_ITEM = eINSTANCE.getWorkReference_WorkItem();

    /**
     * The meta object literal for the '<em><b>Quantity</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_REFERENCE__QUANTITY = eINSTANCE.getWorkReference_Quantity();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkDecompositionImpl <em>Work Decomposition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkDecompositionImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWorkDecomposition()
     * @generated
     */
    EClass WORK_DECOMPOSITION = eINSTANCE.getWorkDecomposition();

    /**
     * The meta object literal for the '<em><b>Work Item</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_DECOMPOSITION__WORK_ITEM = eINSTANCE.getWorkDecomposition_WorkItem();

    /**
     * The meta object literal for the '<em><b>Quantity</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_DECOMPOSITION__QUANTITY = eINSTANCE.getWorkDecomposition_Quantity();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkPrecedencyImpl <em>Work Precedency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkPrecedencyImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWorkPrecedency()
     * @generated
     */
    EClass WORK_PRECEDENCY = eINSTANCE.getWorkPrecedency();

    /**
     * The meta object literal for the '<em><b>Work Item</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_PRECEDENCY__WORK_ITEM = eINSTANCE.getWorkPrecedency_WorkItem();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkCausalityImpl <em>Work Causality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkCausalityImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getWorkCausality()
     * @generated
     */
    EClass WORK_CAUSALITY = eINSTANCE.getWorkCausality();

    /**
     * The meta object literal for the '<em><b>Work Item</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_CAUSALITY__WORK_ITEM = eINSTANCE.getWorkCausality_WorkItem();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanTaskModelImpl <em>Kanban Task Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanTaskModelImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getKanbanTaskModel()
     * @generated
     */
    EClass KANBAN_TASK_MODEL = eINSTANCE.getKanbanTaskModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KANBAN_TASK_MODEL__NAME = eINSTANCE.getKanbanTaskModel_Name();

    /**
     * The meta object literal for the '<em><b>Caps</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KANBAN_TASK_MODEL__CAPS = eINSTANCE.getKanbanTaskModel_Caps();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.CapabilityImpl <em>Capability</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.CapabilityImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getCapability()
     * @generated
     */
    EClass CAPABILITY = eINSTANCE.getCapability();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAPABILITY__NAME = eINSTANCE.getCapability_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAPABILITY__DESCRIPTION = eINSTANCE.getCapability_Description();

    /**
     * The meta object literal for the '<em><b>Reqs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAPABILITY__REQS = eINSTANCE.getCapability_Reqs();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.RequirementImpl <em>Requirement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.RequirementImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getRequirement()
     * @generated
     */
    EClass REQUIREMENT = eINSTANCE.getRequirement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIREMENT__NAME = eINSTANCE.getRequirement_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIREMENT__DESCRIPTION = eINSTANCE.getRequirement_Description();

    /**
     * The meta object literal for the '<em><b>RTasks</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__RTASKS = eINSTANCE.getRequirement_RTasks();

    /**
     * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__DEPENDENCIES = eINSTANCE.getRequirement_Dependencies();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.EntityImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

    /**
     * The meta object literal for the '<em><b>Sdname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__SDNAME = eINSTANCE.getEntity_Sdname();

    /**
     * The meta object literal for the '<em><b>Service Provisions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__SERVICE_PROVISIONS = eINSTANCE.getEntity_ServiceProvisions();

    /**
     * The meta object literal for the '<em><b>Entity Behavior</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__ENTITY_BEHAVIOR = eINSTANCE.getEntity_EntityBehavior();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ProvisionImpl <em>Provision</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.ProvisionImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getProvision()
     * @generated
     */
    EClass PROVISION = eINSTANCE.getProvision();

    /**
     * The meta object literal for the '<em><b>Service Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVISION__SERVICE_NAME = eINSTANCE.getProvision_ServiceName();

    /**
     * The meta object literal for the '<em><b>Providers</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVISION__PROVIDERS = eINSTANCE.getProvision_Providers();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.StatemachineImpl <em>Statemachine</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.StatemachineImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getStatemachine()
     * @generated
     */
    EClass STATEMACHINE = eINSTANCE.getStatemachine();

    /**
     * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMACHINE__EVENTS = eINSTANCE.getStatemachine_Events();

    /**
     * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMACHINE__COMMANDS = eINSTANCE.getStatemachine_Commands();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMACHINE__STATES = eINSTANCE.getStatemachine_States();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__CODE = eINSTANCE.getEvent_Code();

    /**
     * The meta object literal for the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.CommandImpl <em>Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.CommandImpl
     * @see datasem.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanmodelPackageImpl#getCommand()
     * @generated
     */
    EClass COMMAND = eINSTANCE.getCommand();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMAND__NAME = eINSTANCE.getCommand_Name();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMAND__CODE = eINSTANCE.getCommand_Code();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__NAME = eINSTANCE.getState_Name();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__ACTIONS = eINSTANCE.getState_Actions();

    /**
     * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__TRANSITIONS = eINSTANCE.getState_Transitions();

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
     * The meta object literal for the '<em><b>Event</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__EVENT = eINSTANCE.getTransition_Event();

    /**
     * The meta object literal for the '<em><b>State</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__STATE = eINSTANCE.getTransition_State();

    /**
     * The meta object literal for the '<em><b>Eventactions</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__EVENTACTIONS = eINSTANCE.getTransition_Eventactions();

  }

} //KanbanmodelPackage
