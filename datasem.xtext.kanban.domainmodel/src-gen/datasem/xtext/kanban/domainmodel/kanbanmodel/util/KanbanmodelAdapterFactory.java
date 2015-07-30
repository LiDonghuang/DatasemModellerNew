/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel.util;

import datasem.xtext.kanban.domainmodel.kanbanmodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage
 * @generated
 */
public class KanbanmodelAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static KanbanmodelPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KanbanmodelAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = KanbanmodelPackage.eINSTANCE;
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
  protected KanbanmodelSwitch<Adapter> modelSwitch =
    new KanbanmodelSwitch<Adapter>()
    {
      @Override
      public Adapter caseKanbanSchedulingSystem(KanbanSchedulingSystem object)
      {
        return createKanbanSchedulingSystemAdapter();
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
      public Adapter caseRepository(Repository object)
      {
        return createRepositoryAdapter();
      }
      @Override
      public Adapter caseWorkItemProfile(WorkItemProfile object)
      {
        return createWorkItemProfileAdapter();
      }
      @Override
      public Adapter caseWorkReference(WorkReference object)
      {
        return createWorkReferenceAdapter();
      }
      @Override
      public Adapter caseWorkDecomposition(WorkDecomposition object)
      {
        return createWorkDecompositionAdapter();
      }
      @Override
      public Adapter caseWorkPrecedency(WorkPrecedency object)
      {
        return createWorkPrecedencyAdapter();
      }
      @Override
      public Adapter caseWorkCausality(WorkCausality object)
      {
        return createWorkCausalityAdapter();
      }
      @Override
      public Adapter caseTaskPattern(TaskPattern object)
      {
        return createTaskPatternAdapter();
      }
      @Override
      public Adapter caseTaskType(TaskType object)
      {
        return createTaskTypeAdapter();
      }
      @Override
      public Adapter caseValueFunction(ValueFunction object)
      {
        return createValueFunctionAdapter();
      }
      @Override
      public Adapter caseProcessModel(ProcessModel object)
      {
        return createProcessModelAdapter();
      }
      @Override
      public Adapter caseMechanism(Mechanism object)
      {
        return createMechanismAdapter();
      }
      @Override
      public Adapter caseStrategy(Strategy object)
      {
        return createStrategyAdapter();
      }
      @Override
      public Adapter caseWIAcceptance(WIAcceptance object)
      {
        return createWIAcceptanceAdapter();
      }
      @Override
      public Adapter caseWISelection(WISelection object)
      {
        return createWISelectionAdapter();
      }
      @Override
      public Adapter caseWIAssignment(WIAssignment object)
      {
        return createWIAssignmentAdapter();
      }
      @Override
      public Adapter caseResourceAllocation(ResourceAllocation object)
      {
        return createResourceAllocationAdapter();
      }
      @Override
      public Adapter caseResourceOutsourcing(ResourceOutsourcing object)
      {
        return createResourceOutsourcingAdapter();
      }
      @Override
      public Adapter caseWorkSource(WorkSource object)
      {
        return createWorkSourceAdapter();
      }
      @Override
      public Adapter caseWorkItem(WorkItem object)
      {
        return createWorkItemAdapter();
      }
      @Override
      public Adapter caseCausality(Causality object)
      {
        return createCausalityAdapter();
      }
      @Override
      public Adapter caseLocalValue(LocalValue object)
      {
        return createLocalValueAdapter();
      }
      @Override
      public Adapter caseServiceType(ServiceType object)
      {
        return createServiceTypeAdapter();
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
      public Adapter caseKanbanTaskModel(KanbanTaskModel object)
      {
        return createKanbanTaskModelAdapter();
      }
      @Override
      public Adapter caseCapability(Capability object)
      {
        return createCapabilityAdapter();
      }
      @Override
      public Adapter caseRequirement(Requirement object)
      {
        return createRequirementAdapter();
      }
      @Override
      public Adapter caseEntity(Entity object)
      {
        return createEntityAdapter();
      }
      @Override
      public Adapter caseProvision(Provision object)
      {
        return createProvisionAdapter();
      }
      @Override
      public Adapter caseStatemachine(Statemachine object)
      {
        return createStatemachineAdapter();
      }
      @Override
      public Adapter caseEvent(Event object)
      {
        return createEventAdapter();
      }
      @Override
      public Adapter caseCommand(Command object)
      {
        return createCommandAdapter();
      }
      @Override
      public Adapter caseState(State object)
      {
        return createStateAdapter();
      }
      @Override
      public Adapter caseTransition(Transition object)
      {
        return createTransitionAdapter();
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
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem <em>Kanban Scheduling System</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem
   * @generated
   */
  public Adapter createKanbanSchedulingSystemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.NumExpression <em>Num Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.NumExpression
   * @generated
   */
  public Adapter createNumExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Distribution <em>Distribution</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Distribution
   * @generated
   */
  public Adapter createDistributionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Repository <em>Repository</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Repository
   * @generated
   */
  public Adapter createRepositoryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile <em>Work Item Profile</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile
   * @generated
   */
  public Adapter createWorkItemProfileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkReference <em>Work Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkReference
   * @generated
   */
  public Adapter createWorkReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkDecomposition <em>Work Decomposition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkDecomposition
   * @generated
   */
  public Adapter createWorkDecompositionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkPrecedency <em>Work Precedency</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkPrecedency
   * @generated
   */
  public Adapter createWorkPrecedencyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkCausality <em>Work Causality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkCausality
   * @generated
   */
  public Adapter createWorkCausalityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.TaskPattern <em>Task Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.TaskPattern
   * @generated
   */
  public Adapter createTaskPatternAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.TaskType <em>Task Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.TaskType
   * @generated
   */
  public Adapter createTaskTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ValueFunction <em>Value Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ValueFunction
   * @generated
   */
  public Adapter createValueFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ProcessModel <em>Process Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ProcessModel
   * @generated
   */
  public Adapter createProcessModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Mechanism <em>Mechanism</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Mechanism
   * @generated
   */
  public Adapter createMechanismAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Strategy <em>Strategy</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Strategy
   * @generated
   */
  public Adapter createStrategyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptance <em>WI Acceptance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WIAcceptance
   * @generated
   */
  public Adapter createWIAcceptanceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WISelection <em>WI Selection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WISelection
   * @generated
   */
  public Adapter createWISelectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WIAssignment <em>WI Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WIAssignment
   * @generated
   */
  public Adapter createWIAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceAllocation <em>Resource Allocation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceAllocation
   * @generated
   */
  public Adapter createResourceAllocationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceOutsourcing <em>Resource Outsourcing</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ResourceOutsourcing
   * @generated
   */
  public Adapter createResourceOutsourcingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkSource <em>Work Source</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkSource
   * @generated
   */
  public Adapter createWorkSourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem <em>Work Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem
   * @generated
   */
  public Adapter createWorkItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Causality <em>Causality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Causality
   * @generated
   */
  public Adapter createCausalityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.LocalValue <em>Local Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.LocalValue
   * @generated
   */
  public Adapter createLocalValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceType <em>Service Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceType
   * @generated
   */
  public Adapter createServiceTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Service
   * @generated
   */
  public Adapter createServiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider <em>Service Provider</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider
   * @generated
   */
  public Adapter createServiceProviderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Asset <em>Asset</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Asset
   * @generated
   */
  public Adapter createAssetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanTaskModel <em>Kanban Task Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanTaskModel
   * @generated
   */
  public Adapter createKanbanTaskModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Capability <em>Capability</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Capability
   * @generated
   */
  public Adapter createCapabilityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Requirement <em>Requirement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Requirement
   * @generated
   */
  public Adapter createRequirementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Entity
   * @generated
   */
  public Adapter createEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Provision <em>Provision</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Provision
   * @generated
   */
  public Adapter createProvisionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Statemachine <em>Statemachine</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Statemachine
   * @generated
   */
  public Adapter createStatemachineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Event
   * @generated
   */
  public Adapter createEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Command
   * @generated
   */
  public Adapter createCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.State
   * @generated
   */
  public Adapter createStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.Transition
   * @generated
   */
  public Adapter createTransitionAdapter()
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

} //KanbanmodelAdapterFactory
