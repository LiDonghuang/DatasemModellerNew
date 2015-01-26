/**
 */
package ausim.xtext.kanban.domainmodel.kanbanmodel.util;

import ausim.xtext.kanban.domainmodel.kanbanmodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage
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
      public Adapter caseTeam(Team object)
      {
        return createTeamAdapter();
      }
      @Override
      public Adapter caseService(Service object)
      {
        return createServiceAdapter();
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
      public Adapter caseDependency(Dependency object)
      {
        return createDependencyAdapter();
      }
      @Override
      public Adapter caseRequirement(Requirement object)
      {
        return createRequirementAdapter();
      }
      @Override
      public Adapter caseTask(Task object)
      {
        return createTaskAdapter();
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
      public Adapter caseKanbanGovModel(KanbanGovModel object)
      {
        return createKanbanGovModelAdapter();
      }
      @Override
      public Adapter caseStrategy(Strategy object)
      {
        return createStrategyAdapter();
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
   * Creates a new adapter for an object of class '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem <em>Kanban Scheduling System</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem
   * @generated
   */
  public Adapter createKanbanSchedulingSystemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Team <em>Team</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Team
   * @generated
   */
  public Adapter createTeamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Service
   * @generated
   */
  public Adapter createServiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Asset <em>Asset</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Asset
   * @generated
   */
  public Adapter createAssetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Skill <em>Skill</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Skill
   * @generated
   */
  public Adapter createSkillAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Dependency <em>Dependency</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Dependency
   * @generated
   */
  public Adapter createDependencyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Requirement <em>Requirement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Requirement
   * @generated
   */
  public Adapter createRequirementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Task <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Task
   * @generated
   */
  public Adapter createTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanTaskModel <em>Kanban Task Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanTaskModel
   * @generated
   */
  public Adapter createKanbanTaskModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Capability <em>Capability</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Capability
   * @generated
   */
  public Adapter createCapabilityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanGovModel <em>Kanban Gov Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanGovModel
   * @generated
   */
  public Adapter createKanbanGovModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Strategy <em>Strategy</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Strategy
   * @generated
   */
  public Adapter createStrategyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Entity
   * @generated
   */
  public Adapter createEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Provision <em>Provision</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Provision
   * @generated
   */
  public Adapter createProvisionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Statemachine <em>Statemachine</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Statemachine
   * @generated
   */
  public Adapter createStatemachineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Event
   * @generated
   */
  public Adapter createEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Command
   * @generated
   */
  public Adapter createCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.State
   * @generated
   */
  public Adapter createStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ausim.xtext.kanban.domainmodel.kanbanmodel.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ausim.xtext.kanban.domainmodel.kanbanmodel.Transition
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
