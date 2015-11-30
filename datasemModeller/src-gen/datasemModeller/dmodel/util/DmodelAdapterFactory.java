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
      public Adapter caseDistribution(Distribution object)
      {
        return createDistributionAdapter();
      }
      @Override
      public Adapter caseGovernanceStrategy(GovernanceStrategy object)
      {
        return createGovernanceStrategyAdapter();
      }
      @Override
      public Adapter casePullStrategy(PullStrategy object)
      {
        return createPullStrategyAdapter();
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
      public Adapter caseWorkItemType(WorkItemType object)
      {
        return createWorkItemTypeAdapter();
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
      public Adapter caseServiceProviderType(ServiceProviderType object)
      {
        return createServiceProviderTypeAdapter();
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
      public Adapter caseExperimentVariable(ExperimentVariable object)
      {
        return createExperimentVariableAdapter();
      }
      @Override
      public Adapter caseWINReplication(WINReplication object)
      {
        return createWINReplicationAdapter();
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
