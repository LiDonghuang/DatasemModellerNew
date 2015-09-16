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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KanbanmodelPackageImpl extends EPackageImpl implements KanbanmodelPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelBuilderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass experimentModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass systemLibrariesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass userLibrariesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass distributionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass processModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass agentRoleTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass winReplicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass governanceStrategyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wiAcceptanceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wiSelectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wiAssignmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resourceAllocationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resourceOutsourcingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wiAcceptanceRuleTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wiSelectionRuleTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wiAssignmentRuleTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resourceAllocationRuleTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resourceOutsourcingRuleTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mechanismEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mechanismAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass processEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass processAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass workSourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass workItemNetworkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass workItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass causalTriggerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass workItemTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueFunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classOfServiceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass serviceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass serviceProviderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass skillEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private KanbanmodelPackageImpl()
  {
    super(eNS_URI, KanbanmodelFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link KanbanmodelPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static KanbanmodelPackage init()
  {
    if (isInited) return (KanbanmodelPackage)EPackage.Registry.INSTANCE.getEPackage(KanbanmodelPackage.eNS_URI);

    // Obtain or create and register package
    KanbanmodelPackageImpl theKanbanmodelPackage = (KanbanmodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof KanbanmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new KanbanmodelPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theKanbanmodelPackage.createPackageContents();

    // Initialize created meta-data
    theKanbanmodelPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theKanbanmodelPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(KanbanmodelPackage.eNS_URI, theKanbanmodelPackage);
    return theKanbanmodelPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelBuilder()
  {
    return modelBuilderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModelBuilder_Name()
  {
    return (EAttribute)modelBuilderEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModelBuilder_Description()
  {
    return (EAttribute)modelBuilderEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBuilder_SystemLibraries()
  {
    return (EReference)modelBuilderEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBuilder_UserLibraries()
  {
    return (EReference)modelBuilderEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelBuilder_ExperimentModel()
  {
    return (EReference)modelBuilderEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExperimentModel()
  {
    return experimentModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExperimentModel_Name()
  {
    return (EAttribute)experimentModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExperimentModel_Path()
  {
    return (EAttribute)experimentModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExperimentModel_Variables()
  {
    return (EReference)experimentModelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExperimentModel_ServiceProviders()
  {
    return (EReference)experimentModelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExperimentModel_WorkSources()
  {
    return (EReference)experimentModelEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExperimentModel_WorkItemNetworks()
  {
    return (EReference)experimentModelEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExperimentModel_WINReplications()
  {
    return (EReference)experimentModelEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExperimentModel_Indicators()
  {
    return (EAttribute)experimentModelEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSystemLibraries()
  {
    return systemLibrariesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSystemLibraries_EventTypes()
  {
    return (EReference)systemLibrariesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSystemLibraries_ConditionTypes()
  {
    return (EReference)systemLibrariesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSystemLibraries_TransitionTypes()
  {
    return (EReference)systemLibrariesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSystemLibraries_WIAcceptanceRuleTypes()
  {
    return (EReference)systemLibrariesEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSystemLibraries_WISelectionRuleTypes()
  {
    return (EReference)systemLibrariesEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSystemLibraries_WIAssignmentRuleTypes()
  {
    return (EReference)systemLibrariesEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSystemLibraries_ResourceAllocationRuleTypes()
  {
    return (EReference)systemLibrariesEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSystemLibraries_ResourceOutsourcingRuleTypes()
  {
    return (EReference)systemLibrariesEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSystemLibraries_ProcessModels()
  {
    return (EReference)systemLibrariesEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSystemLibraries_ValueFunctions()
  {
    return (EReference)systemLibrariesEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUserLibraries()
  {
    return userLibrariesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUserLibraries_WorkItemTypes()
  {
    return (EReference)userLibrariesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUserLibraries_ClassOfServices()
  {
    return (EReference)userLibrariesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUserLibraries_Services()
  {
    return (EReference)userLibrariesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUserLibraries_GovernanceStrategies()
  {
    return (EReference)userLibrariesEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractParameter()
  {
    return abstractParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractParameter_IsVariable()
  {
    return (EAttribute)abstractParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractParameter_Variable()
  {
    return (EReference)abstractParameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractParameter_Value()
  {
    return (EAttribute)abstractParameterEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumExpression()
  {
    return numExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumExpression_NumValue()
  {
    return (EAttribute)numExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumExpression_Distribution()
  {
    return (EAttribute)numExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumExpression_NumDist()
  {
    return (EReference)numExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperator()
  {
    return operatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperator_EqualTo()
  {
    return (EAttribute)operatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperator_LargerThan()
  {
    return (EAttribute)operatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperator_SmallerThan()
  {
    return (EAttribute)operatorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperator_LargerOrEqualTo()
  {
    return (EAttribute)operatorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperator_SmallerOrEqualTo()
  {
    return (EAttribute)operatorEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperator_NotEqualTo()
  {
    return (EAttribute)operatorEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariable()
  {
    return variableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariable_Name()
  {
    return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariable_TypeInteger()
  {
    return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariable_IntValue()
  {
    return (EAttribute)variableEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariable_TypeDouble()
  {
    return (EAttribute)variableEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariable_DoubleValue()
  {
    return (EAttribute)variableEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariable_TypeString()
  {
    return (EAttribute)variableEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariable_StringValue()
  {
    return (EAttribute)variableEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariable_TypeDistribution()
  {
    return (EAttribute)variableEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariable_Distrbution()
  {
    return (EReference)variableEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariable_TypeStrategy()
  {
    return (EAttribute)variableEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariable_Strategy()
  {
    return (EReference)variableEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDistribution()
  {
    return distributionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDistribution_IsNormal()
  {
    return (EAttribute)distributionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDistribution_IsUniform()
  {
    return (EAttribute)distributionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDistribution_IsExponential()
  {
    return (EAttribute)distributionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDistribution_Parameters()
  {
    return (EReference)distributionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEventType()
  {
    return eventTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEventType_Name()
  {
    return (EAttribute)eventTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEventType_Description()
  {
    return (EAttribute)eventTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConditionType()
  {
    return conditionTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConditionType_Name()
  {
    return (EAttribute)conditionTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConditionType_Description()
  {
    return (EAttribute)conditionTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionType()
  {
    return transitionTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransitionType_Name()
  {
    return (EAttribute)transitionTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransitionType_Description()
  {
    return (EAttribute)transitionTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcessModel()
  {
    return processModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProcessModel_Name()
  {
    return (EAttribute)processModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProcessModel_Description()
  {
    return (EAttribute)processModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcessModel_Events()
  {
    return (EReference)processModelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEvent()
  {
    return eventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEvent_Conditions()
  {
    return (EReference)eventEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEvent_Transitions()
  {
    return (EReference)eventEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCondition()
  {
    return conditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCondition_Type()
  {
    return (EReference)conditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCondition_Operator()
  {
    return (EReference)conditionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCondition_Value()
  {
    return (EAttribute)conditionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransition()
  {
    return transitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransition_Type()
  {
    return (EReference)transitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransition_Value()
  {
    return (EAttribute)transitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAgentRoleType()
  {
    return agentRoleTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAgentRoleType_Name()
  {
    return (EAttribute)agentRoleTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAgentRoleType_Description()
  {
    return (EAttribute)agentRoleTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWINReplication()
  {
    return winReplicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWINReplication_WorkItemNetwork()
  {
    return (EReference)winReplicationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWINReplication_NumReplications()
  {
    return (EAttribute)winReplicationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGovernanceStrategy()
  {
    return governanceStrategyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGovernanceStrategy_Id()
  {
    return (EAttribute)governanceStrategyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGovernanceStrategy_Name()
  {
    return (EAttribute)governanceStrategyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGovernanceStrategy_Description()
  {
    return (EAttribute)governanceStrategyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGovernanceStrategy_WIAcceptanceRule()
  {
    return (EReference)governanceStrategyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGovernanceStrategy_WISelectionRule()
  {
    return (EReference)governanceStrategyEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGovernanceStrategy_WIAssignmentRule()
  {
    return (EReference)governanceStrategyEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGovernanceStrategy_ResourceAllocationRule()
  {
    return (EReference)governanceStrategyEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGovernanceStrategy_ResourceOutsourcingRule()
  {
    return (EReference)governanceStrategyEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGovernanceStrategy_Mechanisms()
  {
    return (EReference)governanceStrategyEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGovernanceStrategy_Processes()
  {
    return (EReference)governanceStrategyEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWIAcceptance()
  {
    return wiAcceptanceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWIAcceptance_Type()
  {
    return (EReference)wiAcceptanceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWIAcceptance_Description()
  {
    return (EAttribute)wiAcceptanceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWIAcceptance_BacklogQLimit()
  {
    return (EAttribute)wiAcceptanceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWIAcceptance_ReadyQLimit()
  {
    return (EAttribute)wiAcceptanceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWISelection()
  {
    return wiSelectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWISelection_Type()
  {
    return (EReference)wiSelectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWISelection_Description()
  {
    return (EAttribute)wiSelectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWIAssignment()
  {
    return wiAssignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWIAssignment_Type()
  {
    return (EReference)wiAssignmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWIAssignment_Description()
  {
    return (EAttribute)wiAssignmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResourceAllocation()
  {
    return resourceAllocationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResourceAllocation_Type()
  {
    return (EReference)resourceAllocationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResourceAllocation_Description()
  {
    return (EAttribute)resourceAllocationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResourceOutsourcing()
  {
    return resourceOutsourcingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResourceOutsourcing_Type()
  {
    return (EReference)resourceOutsourcingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResourceOutsourcing_Description()
  {
    return (EAttribute)resourceOutsourcingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWIAcceptanceRuleType()
  {
    return wiAcceptanceRuleTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWIAcceptanceRuleType_Name()
  {
    return (EAttribute)wiAcceptanceRuleTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWIAcceptanceRuleType_Description()
  {
    return (EAttribute)wiAcceptanceRuleTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWISelectionRuleType()
  {
    return wiSelectionRuleTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWISelectionRuleType_Name()
  {
    return (EAttribute)wiSelectionRuleTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWISelectionRuleType_Description()
  {
    return (EAttribute)wiSelectionRuleTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWIAssignmentRuleType()
  {
    return wiAssignmentRuleTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWIAssignmentRuleType_Name()
  {
    return (EAttribute)wiAssignmentRuleTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWIAssignmentRuleType_Description()
  {
    return (EAttribute)wiAssignmentRuleTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResourceAllocationRuleType()
  {
    return resourceAllocationRuleTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResourceAllocationRuleType_Name()
  {
    return (EAttribute)resourceAllocationRuleTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResourceAllocationRuleType_Description()
  {
    return (EAttribute)resourceAllocationRuleTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResourceOutsourcingRuleType()
  {
    return resourceOutsourcingRuleTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResourceOutsourcingRuleType_Name()
  {
    return (EAttribute)resourceOutsourcingRuleTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResourceOutsourcingRuleType_Description()
  {
    return (EAttribute)resourceOutsourcingRuleTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMechanism()
  {
    return mechanismEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMechanism_Name()
  {
    return (EAttribute)mechanismEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMechanism_Value()
  {
    return (EAttribute)mechanismEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMechanism_Description()
  {
    return (EAttribute)mechanismEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMechanism_Attributes()
  {
    return (EReference)mechanismEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMechanismAttribute()
  {
    return mechanismAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMechanismAttribute_Attribute()
  {
    return (EAttribute)mechanismAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMechanismAttribute_Value()
  {
    return (EAttribute)mechanismAttributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcess()
  {
    return processEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProcess_Name()
  {
    return (EAttribute)processEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProcess_Value()
  {
    return (EAttribute)processEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProcess_Description()
  {
    return (EAttribute)processEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcess_Attributes()
  {
    return (EReference)processEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcessAttribute()
  {
    return processAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProcessAttribute_Attribute()
  {
    return (EAttribute)processAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProcessAttribute_Value()
  {
    return (EAttribute)processAttributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWorkSource()
  {
    return workSourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkSource_Id()
  {
    return (EAttribute)workSourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkSource_Name()
  {
    return (EAttribute)workSourceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkSource_Description()
  {
    return (EAttribute)workSourceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkSource_AssignTo()
  {
    return (EReference)workSourceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkSource_AssignmentRule()
  {
    return (EReference)workSourceEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWorkItemNetwork()
  {
    return workItemNetworkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkItemNetwork_Id()
  {
    return (EAttribute)workItemNetworkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkItemNetwork_Name()
  {
    return (EAttribute)workItemNetworkEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkItemNetwork_Description()
  {
    return (EAttribute)workItemNetworkEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkItemNetwork_WorkItems()
  {
    return (EReference)workItemNetworkEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWorkItem()
  {
    return workItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkItem_Id()
  {
    return (EAttribute)workItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkItem_Name()
  {
    return (EAttribute)workItemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkItem_Description()
  {
    return (EAttribute)workItemEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkItem_Type()
  {
    return (EReference)workItemEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkItem_HasPredecessors()
  {
    return (EAttribute)workItemEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkItem_PTasks()
  {
    return (EReference)workItemEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkItem_IsAggregationNode()
  {
    return (EAttribute)workItemEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkItem_STasks()
  {
    return (EReference)workItemEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkItem_CausalTriggers()
  {
    return (EReference)workItemEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkItem_RequiredServices()
  {
    return (EReference)workItemEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkItem_Efforts()
  {
    return (EReference)workItemEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkItem_MaturityLevels()
  {
    return (EReference)workItemEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkItem_Uncertainty()
  {
    return (EReference)workItemEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkItem_Risk()
  {
    return (EReference)workItemEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkItem_ChangePropagation()
  {
    return (EAttribute)workItemEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkItem_Value()
  {
    return (EReference)workItemEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkItem_ClassOfService()
  {
    return (EReference)workItemEClass.getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkItem_WorkSource()
  {
    return (EReference)workItemEClass.getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkItem_ArrivalTime()
  {
    return (EAttribute)workItemEClass.getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkItem_DueDate()
  {
    return (EAttribute)workItemEClass.getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCausalTrigger()
  {
    return causalTriggerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCausalTrigger_Triggered()
  {
    return (EReference)causalTriggerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCausalTrigger_AtProgress()
  {
    return (EAttribute)causalTriggerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCausalTrigger_OnProbability()
  {
    return (EAttribute)causalTriggerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWorkItemType()
  {
    return workItemTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkItemType_Id()
  {
    return (EAttribute)workItemTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkItemType_Name()
  {
    return (EAttribute)workItemTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkItemType_Description()
  {
    return (EAttribute)workItemTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkItemType_Hierarchy()
  {
    return (EAttribute)workItemTypeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValueFunction()
  {
    return valueFunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValueFunction_Name()
  {
    return (EAttribute)valueFunctionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValueFunction_Description()
  {
    return (EAttribute)valueFunctionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassOfService()
  {
    return classOfServiceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassOfService_Id()
  {
    return (EAttribute)classOfServiceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassOfService_Name()
  {
    return (EAttribute)classOfServiceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassOfService_Description()
  {
    return (EAttribute)classOfServiceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassOfService_Disruptive()
  {
    return (EAttribute)classOfServiceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getService()
  {
    return serviceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getService_Id()
  {
    return (EAttribute)serviceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getService_Name()
  {
    return (EAttribute)serviceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getService_Description()
  {
    return (EAttribute)serviceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getServiceProvider()
  {
    return serviceProviderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getServiceProvider_Id()
  {
    return (EAttribute)serviceProviderEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getServiceProvider_Name()
  {
    return (EAttribute)serviceProviderEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getServiceProvider_Description()
  {
    return (EAttribute)serviceProviderEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceProvider_AssignTo()
  {
    return (EReference)serviceProviderEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceProvider_OutsourceFrom()
  {
    return (EReference)serviceProviderEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceProvider_TeamService()
  {
    return (EReference)serviceProviderEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceProvider_GovernanceStrategy()
  {
    return (EReference)serviceProviderEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceProvider_Resources()
  {
    return (EReference)serviceProviderEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAsset()
  {
    return assetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAsset_Id()
  {
    return (EAttribute)assetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAsset_Name()
  {
    return (EAttribute)assetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAsset_Description()
  {
    return (EAttribute)assetEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAsset_Number()
  {
    return (EReference)assetEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAsset_SkillSet()
  {
    return (EReference)assetEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSkill()
  {
    return skillEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSkill_Service()
  {
    return (EReference)skillEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSkill_Efficiency()
  {
    return (EReference)skillEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KanbanmodelFactory getKanbanmodelFactory()
  {
    return (KanbanmodelFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelBuilderEClass = createEClass(MODEL_BUILDER);
    createEAttribute(modelBuilderEClass, MODEL_BUILDER__NAME);
    createEAttribute(modelBuilderEClass, MODEL_BUILDER__DESCRIPTION);
    createEReference(modelBuilderEClass, MODEL_BUILDER__SYSTEM_LIBRARIES);
    createEReference(modelBuilderEClass, MODEL_BUILDER__USER_LIBRARIES);
    createEReference(modelBuilderEClass, MODEL_BUILDER__EXPERIMENT_MODEL);

    experimentModelEClass = createEClass(EXPERIMENT_MODEL);
    createEAttribute(experimentModelEClass, EXPERIMENT_MODEL__NAME);
    createEAttribute(experimentModelEClass, EXPERIMENT_MODEL__PATH);
    createEReference(experimentModelEClass, EXPERIMENT_MODEL__VARIABLES);
    createEReference(experimentModelEClass, EXPERIMENT_MODEL__SERVICE_PROVIDERS);
    createEReference(experimentModelEClass, EXPERIMENT_MODEL__WORK_SOURCES);
    createEReference(experimentModelEClass, EXPERIMENT_MODEL__WORK_ITEM_NETWORKS);
    createEReference(experimentModelEClass, EXPERIMENT_MODEL__WIN_REPLICATIONS);
    createEAttribute(experimentModelEClass, EXPERIMENT_MODEL__INDICATORS);

    systemLibrariesEClass = createEClass(SYSTEM_LIBRARIES);
    createEReference(systemLibrariesEClass, SYSTEM_LIBRARIES__EVENT_TYPES);
    createEReference(systemLibrariesEClass, SYSTEM_LIBRARIES__CONDITION_TYPES);
    createEReference(systemLibrariesEClass, SYSTEM_LIBRARIES__TRANSITION_TYPES);
    createEReference(systemLibrariesEClass, SYSTEM_LIBRARIES__WI_ACCEPTANCE_RULE_TYPES);
    createEReference(systemLibrariesEClass, SYSTEM_LIBRARIES__WI_SELECTION_RULE_TYPES);
    createEReference(systemLibrariesEClass, SYSTEM_LIBRARIES__WI_ASSIGNMENT_RULE_TYPES);
    createEReference(systemLibrariesEClass, SYSTEM_LIBRARIES__RESOURCE_ALLOCATION_RULE_TYPES);
    createEReference(systemLibrariesEClass, SYSTEM_LIBRARIES__RESOURCE_OUTSOURCING_RULE_TYPES);
    createEReference(systemLibrariesEClass, SYSTEM_LIBRARIES__PROCESS_MODELS);
    createEReference(systemLibrariesEClass, SYSTEM_LIBRARIES__VALUE_FUNCTIONS);

    userLibrariesEClass = createEClass(USER_LIBRARIES);
    createEReference(userLibrariesEClass, USER_LIBRARIES__WORK_ITEM_TYPES);
    createEReference(userLibrariesEClass, USER_LIBRARIES__CLASS_OF_SERVICES);
    createEReference(userLibrariesEClass, USER_LIBRARIES__SERVICES);
    createEReference(userLibrariesEClass, USER_LIBRARIES__GOVERNANCE_STRATEGIES);

    abstractParameterEClass = createEClass(ABSTRACT_PARAMETER);
    createEAttribute(abstractParameterEClass, ABSTRACT_PARAMETER__IS_VARIABLE);
    createEReference(abstractParameterEClass, ABSTRACT_PARAMETER__VARIABLE);
    createEAttribute(abstractParameterEClass, ABSTRACT_PARAMETER__VALUE);

    numExpressionEClass = createEClass(NUM_EXPRESSION);
    createEAttribute(numExpressionEClass, NUM_EXPRESSION__NUM_VALUE);
    createEAttribute(numExpressionEClass, NUM_EXPRESSION__DISTRIBUTION);
    createEReference(numExpressionEClass, NUM_EXPRESSION__NUM_DIST);

    operatorEClass = createEClass(OPERATOR);
    createEAttribute(operatorEClass, OPERATOR__EQUAL_TO);
    createEAttribute(operatorEClass, OPERATOR__LARGER_THAN);
    createEAttribute(operatorEClass, OPERATOR__SMALLER_THAN);
    createEAttribute(operatorEClass, OPERATOR__LARGER_OR_EQUAL_TO);
    createEAttribute(operatorEClass, OPERATOR__SMALLER_OR_EQUAL_TO);
    createEAttribute(operatorEClass, OPERATOR__NOT_EQUAL_TO);

    variableEClass = createEClass(VARIABLE);
    createEAttribute(variableEClass, VARIABLE__NAME);
    createEAttribute(variableEClass, VARIABLE__TYPE_INTEGER);
    createEAttribute(variableEClass, VARIABLE__INT_VALUE);
    createEAttribute(variableEClass, VARIABLE__TYPE_DOUBLE);
    createEAttribute(variableEClass, VARIABLE__DOUBLE_VALUE);
    createEAttribute(variableEClass, VARIABLE__TYPE_STRING);
    createEAttribute(variableEClass, VARIABLE__STRING_VALUE);
    createEAttribute(variableEClass, VARIABLE__TYPE_DISTRIBUTION);
    createEReference(variableEClass, VARIABLE__DISTRBUTION);
    createEAttribute(variableEClass, VARIABLE__TYPE_STRATEGY);
    createEReference(variableEClass, VARIABLE__STRATEGY);

    distributionEClass = createEClass(DISTRIBUTION);
    createEAttribute(distributionEClass, DISTRIBUTION__IS_NORMAL);
    createEAttribute(distributionEClass, DISTRIBUTION__IS_UNIFORM);
    createEAttribute(distributionEClass, DISTRIBUTION__IS_EXPONENTIAL);
    createEReference(distributionEClass, DISTRIBUTION__PARAMETERS);

    eventTypeEClass = createEClass(EVENT_TYPE);
    createEAttribute(eventTypeEClass, EVENT_TYPE__NAME);
    createEAttribute(eventTypeEClass, EVENT_TYPE__DESCRIPTION);

    conditionTypeEClass = createEClass(CONDITION_TYPE);
    createEAttribute(conditionTypeEClass, CONDITION_TYPE__NAME);
    createEAttribute(conditionTypeEClass, CONDITION_TYPE__DESCRIPTION);

    transitionTypeEClass = createEClass(TRANSITION_TYPE);
    createEAttribute(transitionTypeEClass, TRANSITION_TYPE__NAME);
    createEAttribute(transitionTypeEClass, TRANSITION_TYPE__DESCRIPTION);

    processModelEClass = createEClass(PROCESS_MODEL);
    createEAttribute(processModelEClass, PROCESS_MODEL__NAME);
    createEAttribute(processModelEClass, PROCESS_MODEL__DESCRIPTION);
    createEReference(processModelEClass, PROCESS_MODEL__EVENTS);

    eventEClass = createEClass(EVENT);
    createEReference(eventEClass, EVENT__CONDITIONS);
    createEReference(eventEClass, EVENT__TRANSITIONS);

    conditionEClass = createEClass(CONDITION);
    createEReference(conditionEClass, CONDITION__TYPE);
    createEReference(conditionEClass, CONDITION__OPERATOR);
    createEAttribute(conditionEClass, CONDITION__VALUE);

    transitionEClass = createEClass(TRANSITION);
    createEReference(transitionEClass, TRANSITION__TYPE);
    createEAttribute(transitionEClass, TRANSITION__VALUE);

    agentRoleTypeEClass = createEClass(AGENT_ROLE_TYPE);
    createEAttribute(agentRoleTypeEClass, AGENT_ROLE_TYPE__NAME);
    createEAttribute(agentRoleTypeEClass, AGENT_ROLE_TYPE__DESCRIPTION);

    winReplicationEClass = createEClass(WIN_REPLICATION);
    createEReference(winReplicationEClass, WIN_REPLICATION__WORK_ITEM_NETWORK);
    createEAttribute(winReplicationEClass, WIN_REPLICATION__NUM_REPLICATIONS);

    governanceStrategyEClass = createEClass(GOVERNANCE_STRATEGY);
    createEAttribute(governanceStrategyEClass, GOVERNANCE_STRATEGY__ID);
    createEAttribute(governanceStrategyEClass, GOVERNANCE_STRATEGY__NAME);
    createEAttribute(governanceStrategyEClass, GOVERNANCE_STRATEGY__DESCRIPTION);
    createEReference(governanceStrategyEClass, GOVERNANCE_STRATEGY__WI_ACCEPTANCE_RULE);
    createEReference(governanceStrategyEClass, GOVERNANCE_STRATEGY__WI_SELECTION_RULE);
    createEReference(governanceStrategyEClass, GOVERNANCE_STRATEGY__WI_ASSIGNMENT_RULE);
    createEReference(governanceStrategyEClass, GOVERNANCE_STRATEGY__RESOURCE_ALLOCATION_RULE);
    createEReference(governanceStrategyEClass, GOVERNANCE_STRATEGY__RESOURCE_OUTSOURCING_RULE);
    createEReference(governanceStrategyEClass, GOVERNANCE_STRATEGY__MECHANISMS);
    createEReference(governanceStrategyEClass, GOVERNANCE_STRATEGY__PROCESSES);

    wiAcceptanceEClass = createEClass(WI_ACCEPTANCE);
    createEReference(wiAcceptanceEClass, WI_ACCEPTANCE__TYPE);
    createEAttribute(wiAcceptanceEClass, WI_ACCEPTANCE__DESCRIPTION);
    createEAttribute(wiAcceptanceEClass, WI_ACCEPTANCE__BACKLOG_QLIMIT);
    createEAttribute(wiAcceptanceEClass, WI_ACCEPTANCE__READY_QLIMIT);

    wiSelectionEClass = createEClass(WI_SELECTION);
    createEReference(wiSelectionEClass, WI_SELECTION__TYPE);
    createEAttribute(wiSelectionEClass, WI_SELECTION__DESCRIPTION);

    wiAssignmentEClass = createEClass(WI_ASSIGNMENT);
    createEReference(wiAssignmentEClass, WI_ASSIGNMENT__TYPE);
    createEAttribute(wiAssignmentEClass, WI_ASSIGNMENT__DESCRIPTION);

    resourceAllocationEClass = createEClass(RESOURCE_ALLOCATION);
    createEReference(resourceAllocationEClass, RESOURCE_ALLOCATION__TYPE);
    createEAttribute(resourceAllocationEClass, RESOURCE_ALLOCATION__DESCRIPTION);

    resourceOutsourcingEClass = createEClass(RESOURCE_OUTSOURCING);
    createEReference(resourceOutsourcingEClass, RESOURCE_OUTSOURCING__TYPE);
    createEAttribute(resourceOutsourcingEClass, RESOURCE_OUTSOURCING__DESCRIPTION);

    wiAcceptanceRuleTypeEClass = createEClass(WI_ACCEPTANCE_RULE_TYPE);
    createEAttribute(wiAcceptanceRuleTypeEClass, WI_ACCEPTANCE_RULE_TYPE__NAME);
    createEAttribute(wiAcceptanceRuleTypeEClass, WI_ACCEPTANCE_RULE_TYPE__DESCRIPTION);

    wiSelectionRuleTypeEClass = createEClass(WI_SELECTION_RULE_TYPE);
    createEAttribute(wiSelectionRuleTypeEClass, WI_SELECTION_RULE_TYPE__NAME);
    createEAttribute(wiSelectionRuleTypeEClass, WI_SELECTION_RULE_TYPE__DESCRIPTION);

    wiAssignmentRuleTypeEClass = createEClass(WI_ASSIGNMENT_RULE_TYPE);
    createEAttribute(wiAssignmentRuleTypeEClass, WI_ASSIGNMENT_RULE_TYPE__NAME);
    createEAttribute(wiAssignmentRuleTypeEClass, WI_ASSIGNMENT_RULE_TYPE__DESCRIPTION);

    resourceAllocationRuleTypeEClass = createEClass(RESOURCE_ALLOCATION_RULE_TYPE);
    createEAttribute(resourceAllocationRuleTypeEClass, RESOURCE_ALLOCATION_RULE_TYPE__NAME);
    createEAttribute(resourceAllocationRuleTypeEClass, RESOURCE_ALLOCATION_RULE_TYPE__DESCRIPTION);

    resourceOutsourcingRuleTypeEClass = createEClass(RESOURCE_OUTSOURCING_RULE_TYPE);
    createEAttribute(resourceOutsourcingRuleTypeEClass, RESOURCE_OUTSOURCING_RULE_TYPE__NAME);
    createEAttribute(resourceOutsourcingRuleTypeEClass, RESOURCE_OUTSOURCING_RULE_TYPE__DESCRIPTION);

    mechanismEClass = createEClass(MECHANISM);
    createEAttribute(mechanismEClass, MECHANISM__NAME);
    createEAttribute(mechanismEClass, MECHANISM__VALUE);
    createEAttribute(mechanismEClass, MECHANISM__DESCRIPTION);
    createEReference(mechanismEClass, MECHANISM__ATTRIBUTES);

    mechanismAttributeEClass = createEClass(MECHANISM_ATTRIBUTE);
    createEAttribute(mechanismAttributeEClass, MECHANISM_ATTRIBUTE__ATTRIBUTE);
    createEAttribute(mechanismAttributeEClass, MECHANISM_ATTRIBUTE__VALUE);

    processEClass = createEClass(PROCESS);
    createEAttribute(processEClass, PROCESS__NAME);
    createEAttribute(processEClass, PROCESS__VALUE);
    createEAttribute(processEClass, PROCESS__DESCRIPTION);
    createEReference(processEClass, PROCESS__ATTRIBUTES);

    processAttributeEClass = createEClass(PROCESS_ATTRIBUTE);
    createEAttribute(processAttributeEClass, PROCESS_ATTRIBUTE__ATTRIBUTE);
    createEAttribute(processAttributeEClass, PROCESS_ATTRIBUTE__VALUE);

    workSourceEClass = createEClass(WORK_SOURCE);
    createEAttribute(workSourceEClass, WORK_SOURCE__ID);
    createEAttribute(workSourceEClass, WORK_SOURCE__NAME);
    createEAttribute(workSourceEClass, WORK_SOURCE__DESCRIPTION);
    createEReference(workSourceEClass, WORK_SOURCE__ASSIGN_TO);
    createEReference(workSourceEClass, WORK_SOURCE__ASSIGNMENT_RULE);

    workItemNetworkEClass = createEClass(WORK_ITEM_NETWORK);
    createEAttribute(workItemNetworkEClass, WORK_ITEM_NETWORK__ID);
    createEAttribute(workItemNetworkEClass, WORK_ITEM_NETWORK__NAME);
    createEAttribute(workItemNetworkEClass, WORK_ITEM_NETWORK__DESCRIPTION);
    createEReference(workItemNetworkEClass, WORK_ITEM_NETWORK__WORK_ITEMS);

    workItemEClass = createEClass(WORK_ITEM);
    createEAttribute(workItemEClass, WORK_ITEM__ID);
    createEAttribute(workItemEClass, WORK_ITEM__NAME);
    createEAttribute(workItemEClass, WORK_ITEM__DESCRIPTION);
    createEReference(workItemEClass, WORK_ITEM__TYPE);
    createEAttribute(workItemEClass, WORK_ITEM__HAS_PREDECESSORS);
    createEReference(workItemEClass, WORK_ITEM__PTASKS);
    createEAttribute(workItemEClass, WORK_ITEM__IS_AGGREGATION_NODE);
    createEReference(workItemEClass, WORK_ITEM__STASKS);
    createEReference(workItemEClass, WORK_ITEM__CAUSAL_TRIGGERS);
    createEReference(workItemEClass, WORK_ITEM__REQUIRED_SERVICES);
    createEReference(workItemEClass, WORK_ITEM__EFFORTS);
    createEReference(workItemEClass, WORK_ITEM__MATURITY_LEVELS);
    createEReference(workItemEClass, WORK_ITEM__UNCERTAINTY);
    createEReference(workItemEClass, WORK_ITEM__RISK);
    createEAttribute(workItemEClass, WORK_ITEM__CHANGE_PROPAGATION);
    createEReference(workItemEClass, WORK_ITEM__VALUE);
    createEReference(workItemEClass, WORK_ITEM__CLASS_OF_SERVICE);
    createEReference(workItemEClass, WORK_ITEM__WORK_SOURCE);
    createEAttribute(workItemEClass, WORK_ITEM__ARRIVAL_TIME);
    createEAttribute(workItemEClass, WORK_ITEM__DUE_DATE);

    causalTriggerEClass = createEClass(CAUSAL_TRIGGER);
    createEReference(causalTriggerEClass, CAUSAL_TRIGGER__TRIGGERED);
    createEAttribute(causalTriggerEClass, CAUSAL_TRIGGER__AT_PROGRESS);
    createEAttribute(causalTriggerEClass, CAUSAL_TRIGGER__ON_PROBABILITY);

    workItemTypeEClass = createEClass(WORK_ITEM_TYPE);
    createEAttribute(workItemTypeEClass, WORK_ITEM_TYPE__ID);
    createEAttribute(workItemTypeEClass, WORK_ITEM_TYPE__NAME);
    createEAttribute(workItemTypeEClass, WORK_ITEM_TYPE__DESCRIPTION);
    createEAttribute(workItemTypeEClass, WORK_ITEM_TYPE__HIERARCHY);

    valueFunctionEClass = createEClass(VALUE_FUNCTION);
    createEAttribute(valueFunctionEClass, VALUE_FUNCTION__NAME);
    createEAttribute(valueFunctionEClass, VALUE_FUNCTION__DESCRIPTION);

    classOfServiceEClass = createEClass(CLASS_OF_SERVICE);
    createEAttribute(classOfServiceEClass, CLASS_OF_SERVICE__ID);
    createEAttribute(classOfServiceEClass, CLASS_OF_SERVICE__NAME);
    createEAttribute(classOfServiceEClass, CLASS_OF_SERVICE__DESCRIPTION);
    createEAttribute(classOfServiceEClass, CLASS_OF_SERVICE__DISRUPTIVE);

    serviceEClass = createEClass(SERVICE);
    createEAttribute(serviceEClass, SERVICE__ID);
    createEAttribute(serviceEClass, SERVICE__NAME);
    createEAttribute(serviceEClass, SERVICE__DESCRIPTION);

    serviceProviderEClass = createEClass(SERVICE_PROVIDER);
    createEAttribute(serviceProviderEClass, SERVICE_PROVIDER__ID);
    createEAttribute(serviceProviderEClass, SERVICE_PROVIDER__NAME);
    createEAttribute(serviceProviderEClass, SERVICE_PROVIDER__DESCRIPTION);
    createEReference(serviceProviderEClass, SERVICE_PROVIDER__ASSIGN_TO);
    createEReference(serviceProviderEClass, SERVICE_PROVIDER__OUTSOURCE_FROM);
    createEReference(serviceProviderEClass, SERVICE_PROVIDER__TEAM_SERVICE);
    createEReference(serviceProviderEClass, SERVICE_PROVIDER__GOVERNANCE_STRATEGY);
    createEReference(serviceProviderEClass, SERVICE_PROVIDER__RESOURCES);

    assetEClass = createEClass(ASSET);
    createEAttribute(assetEClass, ASSET__ID);
    createEAttribute(assetEClass, ASSET__NAME);
    createEAttribute(assetEClass, ASSET__DESCRIPTION);
    createEReference(assetEClass, ASSET__NUMBER);
    createEReference(assetEClass, ASSET__SKILL_SET);

    skillEClass = createEClass(SKILL);
    createEReference(skillEClass, SKILL__SERVICE);
    createEReference(skillEClass, SKILL__EFFICIENCY);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(modelBuilderEClass, ModelBuilder.class, "ModelBuilder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModelBuilder_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModelBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModelBuilder_Description(), ecorePackage.getEString(), "Description", null, 0, 1, ModelBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBuilder_SystemLibraries(), this.getSystemLibraries(), null, "SystemLibraries", null, 0, 1, ModelBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBuilder_UserLibraries(), this.getUserLibraries(), null, "UserLibraries", null, 0, 1, ModelBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelBuilder_ExperimentModel(), this.getExperimentModel(), null, "ExperimentModel", null, 0, 1, ModelBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(experimentModelEClass, ExperimentModel.class, "ExperimentModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExperimentModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, ExperimentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExperimentModel_Path(), ecorePackage.getEString(), "Path", null, 0, 1, ExperimentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExperimentModel_Variables(), this.getVariable(), null, "Variables", null, 0, -1, ExperimentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExperimentModel_ServiceProviders(), this.getServiceProvider(), null, "ServiceProviders", null, 0, -1, ExperimentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExperimentModel_WorkSources(), this.getWorkSource(), null, "WorkSources", null, 0, -1, ExperimentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExperimentModel_WorkItemNetworks(), this.getWorkItemNetwork(), null, "WorkItemNetworks", null, 0, -1, ExperimentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExperimentModel_WINReplications(), this.getWINReplication(), null, "WINReplications", null, 0, -1, ExperimentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExperimentModel_Indicators(), ecorePackage.getEString(), "Indicators", null, 0, -1, ExperimentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(systemLibrariesEClass, SystemLibraries.class, "SystemLibraries", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSystemLibraries_EventTypes(), this.getEventType(), null, "EventTypes", null, 0, -1, SystemLibraries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSystemLibraries_ConditionTypes(), this.getConditionType(), null, "ConditionTypes", null, 0, -1, SystemLibraries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSystemLibraries_TransitionTypes(), this.getTransitionType(), null, "TransitionTypes", null, 0, -1, SystemLibraries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSystemLibraries_WIAcceptanceRuleTypes(), this.getWIAcceptanceRuleType(), null, "WIAcceptanceRuleTypes", null, 0, -1, SystemLibraries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSystemLibraries_WISelectionRuleTypes(), this.getWISelectionRuleType(), null, "WISelectionRuleTypes", null, 0, -1, SystemLibraries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSystemLibraries_WIAssignmentRuleTypes(), this.getWIAssignmentRuleType(), null, "WIAssignmentRuleTypes", null, 0, -1, SystemLibraries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSystemLibraries_ResourceAllocationRuleTypes(), this.getResourceAllocationRuleType(), null, "ResourceAllocationRuleTypes", null, 0, -1, SystemLibraries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSystemLibraries_ResourceOutsourcingRuleTypes(), this.getResourceOutsourcingRuleType(), null, "ResourceOutsourcingRuleTypes", null, 0, -1, SystemLibraries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSystemLibraries_ProcessModels(), this.getProcessModel(), null, "ProcessModels", null, 0, -1, SystemLibraries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSystemLibraries_ValueFunctions(), this.getValueFunction(), null, "ValueFunctions", null, 0, -1, SystemLibraries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(userLibrariesEClass, UserLibraries.class, "UserLibraries", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUserLibraries_WorkItemTypes(), this.getWorkItemType(), null, "WorkItemTypes", null, 0, -1, UserLibraries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUserLibraries_ClassOfServices(), this.getClassOfService(), null, "ClassOfServices", null, 0, -1, UserLibraries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUserLibraries_Services(), this.getService(), null, "Services", null, 0, -1, UserLibraries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUserLibraries_GovernanceStrategies(), this.getGovernanceStrategy(), null, "GovernanceStrategies", null, 0, -1, UserLibraries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractParameterEClass, AbstractParameter.class, "AbstractParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbstractParameter_IsVariable(), ecorePackage.getEBoolean(), "isVariable", null, 0, 1, AbstractParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbstractParameter_Variable(), this.getVariable(), null, "variable", null, 0, 1, AbstractParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractParameter_Value(), ecorePackage.getEString(), "value", null, 0, 1, AbstractParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numExpressionEClass, NumExpression.class, "NumExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNumExpression_NumValue(), ecorePackage.getEDouble(), "numValue", null, 0, 1, NumExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNumExpression_Distribution(), ecorePackage.getEBoolean(), "distribution", null, 0, 1, NumExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNumExpression_NumDist(), this.getDistribution(), null, "numDist", null, 0, 1, NumExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operatorEClass, Operator.class, "Operator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOperator_EqualTo(), ecorePackage.getEBoolean(), "equalTo", null, 0, 1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOperator_LargerThan(), ecorePackage.getEBoolean(), "largerThan", null, 0, 1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOperator_SmallerThan(), ecorePackage.getEBoolean(), "smallerThan", null, 0, 1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOperator_LargerOrEqualTo(), ecorePackage.getEBoolean(), "largerOrEqualTo", null, 0, 1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOperator_SmallerOrEqualTo(), ecorePackage.getEBoolean(), "smallerOrEqualTo", null, 0, 1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOperator_NotEqualTo(), ecorePackage.getEBoolean(), "notEqualTo", null, 0, 1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariable_TypeInteger(), ecorePackage.getEBoolean(), "typeInteger", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariable_IntValue(), ecorePackage.getEInt(), "intValue", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariable_TypeDouble(), ecorePackage.getEBoolean(), "typeDouble", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariable_DoubleValue(), ecorePackage.getEDouble(), "doubleValue", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariable_TypeString(), ecorePackage.getEBoolean(), "typeString", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariable_StringValue(), ecorePackage.getEString(), "stringValue", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariable_TypeDistribution(), ecorePackage.getEBoolean(), "typeDistribution", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariable_Distrbution(), this.getDistribution(), null, "distrbution", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariable_TypeStrategy(), ecorePackage.getEBoolean(), "typeStrategy", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariable_Strategy(), this.getGovernanceStrategy(), null, "strategy", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(distributionEClass, Distribution.class, "Distribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDistribution_IsNormal(), ecorePackage.getEBoolean(), "isNormal", null, 0, 1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDistribution_IsUniform(), ecorePackage.getEBoolean(), "isUniform", null, 0, 1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDistribution_IsExponential(), ecorePackage.getEBoolean(), "isExponential", null, 0, 1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDistribution_Parameters(), this.getAbstractParameter(), null, "parameters", null, 0, -1, Distribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eventTypeEClass, EventType.class, "EventType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEventType_Name(), ecorePackage.getEString(), "name", null, 0, 1, EventType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEventType_Description(), ecorePackage.getEString(), "description", null, 0, 1, EventType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionTypeEClass, ConditionType.class, "ConditionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConditionType_Name(), ecorePackage.getEString(), "name", null, 0, 1, ConditionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConditionType_Description(), ecorePackage.getEString(), "description", null, 0, 1, ConditionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionTypeEClass, TransitionType.class, "TransitionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTransitionType_Name(), ecorePackage.getEString(), "name", null, 0, 1, TransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTransitionType_Description(), ecorePackage.getEString(), "description", null, 0, 1, TransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(processModelEClass, ProcessModel.class, "ProcessModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProcessModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProcessModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProcessModel_Description(), ecorePackage.getEString(), "description", null, 0, 1, ProcessModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcessModel_Events(), this.getEvent(), null, "events", null, 0, -1, ProcessModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEvent_Conditions(), this.getCondition(), null, "conditions", null, 0, -1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEvent_Transitions(), this.getTransition(), null, "transitions", null, 0, -1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCondition_Type(), this.getConditionType(), null, "type", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCondition_Operator(), this.getOperator(), null, "operator", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCondition_Value(), ecorePackage.getEString(), "value", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTransition_Type(), this.getTransitionType(), null, "type", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTransition_Value(), ecorePackage.getEString(), "value", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(agentRoleTypeEClass, AgentRoleType.class, "AgentRoleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAgentRoleType_Name(), ecorePackage.getEString(), "name", null, 0, 1, AgentRoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAgentRoleType_Description(), ecorePackage.getEString(), "description", null, 0, 1, AgentRoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(winReplicationEClass, WINReplication.class, "WINReplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWINReplication_WorkItemNetwork(), this.getWorkItemNetwork(), null, "workItemNetwork", null, 0, 1, WINReplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWINReplication_NumReplications(), ecorePackage.getEInt(), "numReplications", null, 0, 1, WINReplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(governanceStrategyEClass, GovernanceStrategy.class, "GovernanceStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGovernanceStrategy_Id(), ecorePackage.getEInt(), "id", null, 0, 1, GovernanceStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGovernanceStrategy_Name(), ecorePackage.getEString(), "name", null, 0, 1, GovernanceStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGovernanceStrategy_Description(), ecorePackage.getEString(), "description", null, 0, 1, GovernanceStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGovernanceStrategy_WIAcceptanceRule(), this.getWIAcceptance(), null, "WIAcceptanceRule", null, 0, 1, GovernanceStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGovernanceStrategy_WISelectionRule(), this.getWISelection(), null, "WISelectionRule", null, 0, 1, GovernanceStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGovernanceStrategy_WIAssignmentRule(), this.getWIAssignment(), null, "WIAssignmentRule", null, 0, 1, GovernanceStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGovernanceStrategy_ResourceAllocationRule(), this.getResourceAllocation(), null, "ResourceAllocationRule", null, 0, 1, GovernanceStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGovernanceStrategy_ResourceOutsourcingRule(), this.getResourceOutsourcing(), null, "ResourceOutsourcingRule", null, 0, 1, GovernanceStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGovernanceStrategy_Mechanisms(), this.getMechanism(), null, "Mechanisms", null, 0, -1, GovernanceStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGovernanceStrategy_Processes(), this.getProcess(), null, "Processes", null, 0, -1, GovernanceStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wiAcceptanceEClass, WIAcceptance.class, "WIAcceptance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWIAcceptance_Type(), this.getWIAcceptanceRuleType(), null, "type", null, 0, 1, WIAcceptance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWIAcceptance_Description(), ecorePackage.getEString(), "description", null, 0, 1, WIAcceptance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWIAcceptance_BacklogQLimit(), ecorePackage.getEInt(), "backlogQLimit", null, 0, 1, WIAcceptance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWIAcceptance_ReadyQLimit(), ecorePackage.getEInt(), "readyQLimit", null, 0, 1, WIAcceptance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wiSelectionEClass, WISelection.class, "WISelection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWISelection_Type(), this.getWISelectionRuleType(), null, "type", null, 0, 1, WISelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWISelection_Description(), ecorePackage.getEString(), "description", null, 0, 1, WISelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wiAssignmentEClass, WIAssignment.class, "WIAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWIAssignment_Type(), this.getWIAssignmentRuleType(), null, "type", null, 0, 1, WIAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWIAssignment_Description(), ecorePackage.getEString(), "description", null, 0, 1, WIAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resourceAllocationEClass, ResourceAllocation.class, "ResourceAllocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getResourceAllocation_Type(), this.getResourceAllocationRuleType(), null, "type", null, 0, 1, ResourceAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getResourceAllocation_Description(), ecorePackage.getEString(), "description", null, 0, 1, ResourceAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resourceOutsourcingEClass, ResourceOutsourcing.class, "ResourceOutsourcing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getResourceOutsourcing_Type(), this.getResourceOutsourcingRuleType(), null, "type", null, 0, 1, ResourceOutsourcing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getResourceOutsourcing_Description(), ecorePackage.getEString(), "description", null, 0, 1, ResourceOutsourcing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wiAcceptanceRuleTypeEClass, WIAcceptanceRuleType.class, "WIAcceptanceRuleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWIAcceptanceRuleType_Name(), ecorePackage.getEString(), "name", null, 0, 1, WIAcceptanceRuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWIAcceptanceRuleType_Description(), ecorePackage.getEString(), "description", null, 0, 1, WIAcceptanceRuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wiSelectionRuleTypeEClass, WISelectionRuleType.class, "WISelectionRuleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWISelectionRuleType_Name(), ecorePackage.getEString(), "name", null, 0, 1, WISelectionRuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWISelectionRuleType_Description(), ecorePackage.getEString(), "description", null, 0, 1, WISelectionRuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wiAssignmentRuleTypeEClass, WIAssignmentRuleType.class, "WIAssignmentRuleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWIAssignmentRuleType_Name(), ecorePackage.getEString(), "name", null, 0, 1, WIAssignmentRuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWIAssignmentRuleType_Description(), ecorePackage.getEString(), "description", null, 0, 1, WIAssignmentRuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resourceAllocationRuleTypeEClass, ResourceAllocationRuleType.class, "ResourceAllocationRuleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getResourceAllocationRuleType_Name(), ecorePackage.getEString(), "name", null, 0, 1, ResourceAllocationRuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getResourceAllocationRuleType_Description(), ecorePackage.getEString(), "description", null, 0, 1, ResourceAllocationRuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resourceOutsourcingRuleTypeEClass, ResourceOutsourcingRuleType.class, "ResourceOutsourcingRuleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getResourceOutsourcingRuleType_Name(), ecorePackage.getEString(), "name", null, 0, 1, ResourceOutsourcingRuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getResourceOutsourcingRuleType_Description(), ecorePackage.getEString(), "description", null, 0, 1, ResourceOutsourcingRuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mechanismEClass, Mechanism.class, "Mechanism", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMechanism_Name(), ecorePackage.getEString(), "name", null, 0, 1, Mechanism.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMechanism_Value(), ecorePackage.getEString(), "value", null, 0, 1, Mechanism.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMechanism_Description(), ecorePackage.getEString(), "description", null, 0, 1, Mechanism.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMechanism_Attributes(), this.getMechanismAttribute(), null, "attributes", null, 0, -1, Mechanism.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mechanismAttributeEClass, MechanismAttribute.class, "MechanismAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMechanismAttribute_Attribute(), ecorePackage.getEString(), "attribute", null, 0, 1, MechanismAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMechanismAttribute_Value(), ecorePackage.getEString(), "value", null, 0, 1, MechanismAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(processEClass, datasem.xtext.kanban.domainmodel.kanbanmodel.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProcess_Name(), ecorePackage.getEString(), "name", null, 0, 1, datasem.xtext.kanban.domainmodel.kanbanmodel.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProcess_Value(), ecorePackage.getEString(), "value", null, 0, 1, datasem.xtext.kanban.domainmodel.kanbanmodel.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProcess_Description(), ecorePackage.getEString(), "description", null, 0, 1, datasem.xtext.kanban.domainmodel.kanbanmodel.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcess_Attributes(), this.getProcessAttribute(), null, "attributes", null, 0, -1, datasem.xtext.kanban.domainmodel.kanbanmodel.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(processAttributeEClass, ProcessAttribute.class, "ProcessAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProcessAttribute_Attribute(), ecorePackage.getEString(), "attribute", null, 0, 1, ProcessAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProcessAttribute_Value(), ecorePackage.getEString(), "value", null, 0, 1, ProcessAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(workSourceEClass, WorkSource.class, "WorkSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWorkSource_Id(), ecorePackage.getEInt(), "id", null, 0, 1, WorkSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWorkSource_Name(), ecorePackage.getEString(), "name", null, 0, 1, WorkSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWorkSource_Description(), ecorePackage.getEString(), "description", null, 0, 1, WorkSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkSource_AssignTo(), this.getServiceProvider(), null, "assignTo", null, 0, -1, WorkSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkSource_AssignmentRule(), this.getWIAssignment(), null, "assignmentRule", null, 0, 1, WorkSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(workItemNetworkEClass, WorkItemNetwork.class, "WorkItemNetwork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWorkItemNetwork_Id(), ecorePackage.getEInt(), "id", null, 0, 1, WorkItemNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWorkItemNetwork_Name(), ecorePackage.getEString(), "name", null, 0, 1, WorkItemNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWorkItemNetwork_Description(), ecorePackage.getEString(), "description", null, 0, 1, WorkItemNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkItemNetwork_WorkItems(), this.getWorkItem(), null, "workItems", null, 0, -1, WorkItemNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(workItemEClass, WorkItem.class, "WorkItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWorkItem_Id(), ecorePackage.getEInt(), "id", null, 0, 1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWorkItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWorkItem_Description(), ecorePackage.getEString(), "description", null, 0, 1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkItem_Type(), this.getWorkItemType(), null, "type", null, 0, 1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWorkItem_HasPredecessors(), ecorePackage.getEBoolean(), "hasPredecessors", null, 0, 1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkItem_PTasks(), this.getWorkItem(), null, "pTasks", null, 0, -1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWorkItem_IsAggregationNode(), ecorePackage.getEBoolean(), "isAggregationNode", null, 0, 1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkItem_STasks(), this.getWorkItem(), null, "sTasks", null, 0, -1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkItem_CausalTriggers(), this.getCausalTrigger(), null, "causalTriggers", null, 0, -1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkItem_RequiredServices(), this.getService(), null, "requiredServices", null, 0, -1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkItem_Efforts(), this.getNumExpression(), null, "efforts", null, 0, 1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkItem_MaturityLevels(), this.getAbstractParameter(), null, "maturityLevels", null, 0, 1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkItem_Uncertainty(), this.getAbstractParameter(), null, "uncertainty", null, 0, 1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkItem_Risk(), this.getAbstractParameter(), null, "risk", null, 0, 1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWorkItem_ChangePropagation(), ecorePackage.getEString(), "changePropagation", null, 0, 1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkItem_Value(), this.getNumExpression(), null, "value", null, 0, 1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkItem_ClassOfService(), this.getClassOfService(), null, "classOfService", null, 0, 1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkItem_WorkSource(), this.getWorkSource(), null, "workSource", null, 0, 1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWorkItem_ArrivalTime(), ecorePackage.getEInt(), "arrivalTime", null, 0, 1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWorkItem_DueDate(), ecorePackage.getEInt(), "dueDate", null, 0, 1, WorkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(causalTriggerEClass, CausalTrigger.class, "CausalTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCausalTrigger_Triggered(), this.getWorkItem(), null, "triggered", null, 0, -1, CausalTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCausalTrigger_AtProgress(), ecorePackage.getEDouble(), "atProgress", null, 0, 1, CausalTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCausalTrigger_OnProbability(), ecorePackage.getEDouble(), "onProbability", null, 0, 1, CausalTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(workItemTypeEClass, WorkItemType.class, "WorkItemType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWorkItemType_Id(), ecorePackage.getEInt(), "id", null, 0, 1, WorkItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWorkItemType_Name(), ecorePackage.getEString(), "name", null, 0, 1, WorkItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWorkItemType_Description(), ecorePackage.getEString(), "description", null, 0, 1, WorkItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWorkItemType_Hierarchy(), ecorePackage.getEInt(), "hierarchy", null, 0, 1, WorkItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueFunctionEClass, ValueFunction.class, "ValueFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getValueFunction_Name(), ecorePackage.getEString(), "name", null, 0, 1, ValueFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getValueFunction_Description(), ecorePackage.getEString(), "description", null, 0, 1, ValueFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classOfServiceEClass, ClassOfService.class, "ClassOfService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClassOfService_Id(), ecorePackage.getEInt(), "id", null, 0, 1, ClassOfService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClassOfService_Name(), ecorePackage.getEString(), "name", null, 0, 1, ClassOfService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClassOfService_Description(), ecorePackage.getEString(), "description", null, 0, 1, ClassOfService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClassOfService_Disruptive(), ecorePackage.getEBoolean(), "disruptive", null, 0, 1, ClassOfService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getService_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getService_Name(), ecorePackage.getEString(), "name", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getService_Description(), ecorePackage.getEString(), "description", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(serviceProviderEClass, ServiceProvider.class, "ServiceProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getServiceProvider_Id(), ecorePackage.getEInt(), "id", null, 0, 1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getServiceProvider_Name(), ecorePackage.getEString(), "name", null, 0, 1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getServiceProvider_Description(), ecorePackage.getEString(), "description", null, 0, 1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceProvider_AssignTo(), this.getServiceProvider(), null, "assignTo", null, 0, -1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceProvider_OutsourceFrom(), this.getServiceProvider(), null, "outsourceFrom", null, 0, -1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceProvider_TeamService(), this.getService(), null, "teamService", null, 0, 1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceProvider_GovernanceStrategy(), this.getGovernanceStrategy(), null, "governanceStrategy", null, 0, 1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceProvider_Resources(), this.getAsset(), null, "resources", null, 0, -1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assetEClass, Asset.class, "Asset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAsset_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAsset_Name(), ecorePackage.getEString(), "name", null, 0, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAsset_Description(), ecorePackage.getEString(), "description", null, 0, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAsset_Number(), this.getAbstractParameter(), null, "number", null, 0, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAsset_SkillSet(), this.getSkill(), null, "skillSet", null, 0, -1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(skillEClass, Skill.class, "Skill", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSkill_Service(), this.getService(), null, "service", null, 0, 1, Skill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSkill_Efficiency(), this.getNumExpression(), null, "efficiency", null, 0, 1, Skill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //KanbanmodelPackageImpl
