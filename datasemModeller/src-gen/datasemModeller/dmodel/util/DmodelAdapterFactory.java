/**
 */
package datasemModeller.dmodel.util;

import datasemModeller.dmodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see datasemModeller.dmodel.DmodelPackage
 * @generated
 */
public class DmodelAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DmodelPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DmodelAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DmodelPackage.eINSTANCE;
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
  protected DmodelSwitch<Adapter> modelSwitch =
    new DmodelSwitch<Adapter>()
    {
      @Override
      public Adapter caseModelBuilder(ModelBuilder object)
      {
        return createModelBuilderAdapter();
      }
      @Override
      public Adapter caseUserLibraries(UserLibraries object)
      {
        return createUserLibrariesAdapter();
      }
      @Override
      public Adapter caseExperimentModel(ExperimentModel object)
      {
        return createExperimentModelAdapter();
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
      public Adapter caseExperimentVariable(ExperimentVariable object)
      {
        return createExperimentVariableAdapter();
      }
      @Override
      public Adapter caseDistribution(Distribution object)
      {
        return createDistributionAdapter();
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
      public Adapter caseContractNetProtocol(ContractNetProtocol object)
      {
        return createContractNetProtocolAdapter();
      }
      @Override
      public Adapter caseRoleBehavior(RoleBehavior object)
      {
        return createRoleBehaviorAdapter();
      }
      @Override
      public Adapter caseProcessModel(ProcessModel object)
      {
        return createProcessModelAdapter();
      }
      @Override
      public Adapter casePullStrategy(PullStrategy object)
      {
        return createPullStrategyAdapter();
      }
      @Override
      public Adapter casePushStrategy(PushStrategy object)
      {
        return createPushStrategyAdapter();
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
      public Adapter caseRequiredService(RequiredService object)
      {
        return createRequiredServiceAdapter();
      }
      @Override
      public Adapter caseImpact(Impact object)
      {
        return createImpactAdapter();
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
      public Adapter caseServiceProviderType(ServiceProviderType object)
      {
        return createServiceProviderTypeAdapter();
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
      public Adapter caseAbstractType(AbstractType object)
      {
        return createAbstractTypeAdapter();
      }
      @Override
      public Adapter caseClassAttributes(ClassAttributes object)
      {
        return createClassAttributesAdapter();
      }
      @Override
      public Adapter caseAgent(Agent object)
      {
        return createAgentAdapter();
      }
      @Override
      public Adapter caseTask(Task object)
      {
        return createTaskAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseAttributeValue(AttributeValue object)
      {
        return createAttributeValueAdapter();
      }
      @Override
      public Adapter caseVariable(Variable object)
      {
        return createVariableAdapter();
      }
      @Override
      public Adapter caseAction(Action object)
      {
        return createActionAdapter();
      }
      @Override
      public Adapter caseState(State object)
      {
        return createStateAdapter();
      }
      @Override
      public Adapter caseIfExpression(IfExpression object)
      {
        return createIfExpressionAdapter();
      }
      @Override
      public Adapter caseForExpression(ForExpression object)
      {
        return createForExpressionAdapter();
      }
      @Override
      public Adapter caseWhileExpression(WhileExpression object)
      {
        return createWhileExpressionAdapter();
      }
      @Override
      public Adapter caseCondition(Condition object)
      {
        return createConditionAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseDeclarationStatement(DeclarationStatement object)
      {
        return createDeclarationStatementAdapter();
      }
      @Override
      public Adapter caseActionStatement(ActionStatement object)
      {
        return createActionStatementAdapter();
      }
      @Override
      public Adapter caseAssertStatement(AssertStatement object)
      {
        return createAssertStatementAdapter();
      }
      @Override
      public Adapter caseChangeStateStatement(ChangeStateStatement object)
      {
        return createChangeStateStatementAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseTerm(Term object)
      {
        return createTermAdapter();
      }
      @Override
      public Adapter caseFactor(Factor object)
      {
        return createFactorAdapter();
      }
      @Override
      public Adapter caseVarExpression(VarExpression object)
      {
        return createVarExpressionAdapter();
      }
      @Override
      public Adapter caseMethod(Method object)
      {
        return createMethodAdapter();
      }
      @Override
      public Adapter casePlus(Plus object)
      {
        return createPlusAdapter();
      }
      @Override
      public Adapter caseMinus(Minus object)
      {
        return createMinusAdapter();
      }
      @Override
      public Adapter caseMultiply(Multiply object)
      {
        return createMultiplyAdapter();
      }
      @Override
      public Adapter caseDivision(Division object)
      {
        return createDivisionAdapter();
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
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.ModelBuilder <em>Model Builder</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.ModelBuilder
   * @generated
   */
  public Adapter createModelBuilderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.UserLibraries <em>User Libraries</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.UserLibraries
   * @generated
   */
  public Adapter createUserLibrariesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.ExperimentModel <em>Experiment Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.ExperimentModel
   * @generated
   */
  public Adapter createExperimentModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.AbstractParameter <em>Abstract Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.AbstractParameter
   * @generated
   */
  public Adapter createAbstractParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.NumExpression <em>Num Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.NumExpression
   * @generated
   */
  public Adapter createNumExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.Operator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.Operator
   * @generated
   */
  public Adapter createOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.ExperimentVariable <em>Experiment Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.ExperimentVariable
   * @generated
   */
  public Adapter createExperimentVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.Distribution <em>Distribution</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.Distribution
   * @generated
   */
  public Adapter createDistributionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.WINReplication <em>WIN Replication</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.WINReplication
   * @generated
   */
  public Adapter createWINReplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.GovernanceStrategy <em>Governance Strategy</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.GovernanceStrategy
   * @generated
   */
  public Adapter createGovernanceStrategyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.ContractNetProtocol <em>Contract Net Protocol</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.ContractNetProtocol
   * @generated
   */
  public Adapter createContractNetProtocolAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.RoleBehavior <em>Role Behavior</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.RoleBehavior
   * @generated
   */
  public Adapter createRoleBehaviorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.ProcessModel <em>Process Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.ProcessModel
   * @generated
   */
  public Adapter createProcessModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.PullStrategy <em>Pull Strategy</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.PullStrategy
   * @generated
   */
  public Adapter createPullStrategyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.PushStrategy <em>Push Strategy</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.PushStrategy
   * @generated
   */
  public Adapter createPushStrategyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.Mechanism <em>Mechanism</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.Mechanism
   * @generated
   */
  public Adapter createMechanismAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.MechanismAttribute <em>Mechanism Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.MechanismAttribute
   * @generated
   */
  public Adapter createMechanismAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.WorkSource <em>Work Source</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.WorkSource
   * @generated
   */
  public Adapter createWorkSourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.WorkItemNetwork <em>Work Item Network</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.WorkItemNetwork
   * @generated
   */
  public Adapter createWorkItemNetworkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.WorkItem <em>Work Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.WorkItem
   * @generated
   */
  public Adapter createWorkItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.RequiredService <em>Required Service</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.RequiredService
   * @generated
   */
  public Adapter createRequiredServiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.Impact <em>Impact</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.Impact
   * @generated
   */
  public Adapter createImpactAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.WorkItemType <em>Work Item Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.WorkItemType
   * @generated
   */
  public Adapter createWorkItemTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.ValueFunction <em>Value Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.ValueFunction
   * @generated
   */
  public Adapter createValueFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.ClassOfService <em>Class Of Service</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.ClassOfService
   * @generated
   */
  public Adapter createClassOfServiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.Service
   * @generated
   */
  public Adapter createServiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.ServiceProvider <em>Service Provider</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.ServiceProvider
   * @generated
   */
  public Adapter createServiceProviderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.ServiceProviderType <em>Service Provider Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.ServiceProviderType
   * @generated
   */
  public Adapter createServiceProviderTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.Asset <em>Asset</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.Asset
   * @generated
   */
  public Adapter createAssetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.Skill <em>Skill</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.Skill
   * @generated
   */
  public Adapter createSkillAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.AbstractType <em>Abstract Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.AbstractType
   * @generated
   */
  public Adapter createAbstractTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.ClassAttributes <em>Class Attributes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.ClassAttributes
   * @generated
   */
  public Adapter createClassAttributesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.Agent <em>Agent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.Agent
   * @generated
   */
  public Adapter createAgentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.Task <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.Task
   * @generated
   */
  public Adapter createTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.AttributeValue <em>Attribute Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.AttributeValue
   * @generated
   */
  public Adapter createAttributeValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.Variable
   * @generated
   */
  public Adapter createVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.Action
   * @generated
   */
  public Adapter createActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.State
   * @generated
   */
  public Adapter createStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.IfExpression <em>If Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.IfExpression
   * @generated
   */
  public Adapter createIfExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.ForExpression <em>For Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.ForExpression
   * @generated
   */
  public Adapter createForExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.WhileExpression <em>While Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.WhileExpression
   * @generated
   */
  public Adapter createWhileExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.Condition
   * @generated
   */
  public Adapter createConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.DeclarationStatement <em>Declaration Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.DeclarationStatement
   * @generated
   */
  public Adapter createDeclarationStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.ActionStatement <em>Action Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.ActionStatement
   * @generated
   */
  public Adapter createActionStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.AssertStatement <em>Assert Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.AssertStatement
   * @generated
   */
  public Adapter createAssertStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.ChangeStateStatement <em>Change State Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.ChangeStateStatement
   * @generated
   */
  public Adapter createChangeStateStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.Term
   * @generated
   */
  public Adapter createTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.Factor <em>Factor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.Factor
   * @generated
   */
  public Adapter createFactorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.VarExpression <em>Var Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.VarExpression
   * @generated
   */
  public Adapter createVarExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.Method
   * @generated
   */
  public Adapter createMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.Plus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.Plus
   * @generated
   */
  public Adapter createPlusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.Minus
   * @generated
   */
  public Adapter createMinusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.Multiply <em>Multiply</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.Multiply
   * @generated
   */
  public Adapter createMultiplyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasemModeller.dmodel.Division <em>Division</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasemModeller.dmodel.Division
   * @generated
   */
  public Adapter createDivisionAdapter()
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

} //DmodelAdapterFactory
