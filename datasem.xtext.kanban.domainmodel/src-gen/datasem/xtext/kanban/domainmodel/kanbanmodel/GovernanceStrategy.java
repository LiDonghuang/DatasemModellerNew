/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Governance Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getId <em>Id</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getName <em>Name</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getDescription <em>Description</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getWIAcceptanceRule <em>WI Acceptance Rule</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getWISelectionRule <em>WI Selection Rule</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getWIAssignmentRule <em>WI Assignment Rule</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getResourceAllocationRule <em>Resource Allocation Rule</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getResourceOutsourcingRule <em>Resource Outsourcing Rule</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getMechanisms <em>Mechanisms</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getGovernanceStrategy()
 * @model
 * @generated
 */
public interface GovernanceStrategy extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(int)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getGovernanceStrategy_Id()
   * @model
   * @generated
   */
  int getId();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(int value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getGovernanceStrategy_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getGovernanceStrategy_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>WI Acceptance Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>WI Acceptance Rule</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>WI Acceptance Rule</em>' containment reference.
   * @see #setWIAcceptanceRule(WIAcceptance)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getGovernanceStrategy_WIAcceptanceRule()
   * @model containment="true"
   * @generated
   */
  WIAcceptance getWIAcceptanceRule();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getWIAcceptanceRule <em>WI Acceptance Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>WI Acceptance Rule</em>' containment reference.
   * @see #getWIAcceptanceRule()
   * @generated
   */
  void setWIAcceptanceRule(WIAcceptance value);

  /**
   * Returns the value of the '<em><b>WI Selection Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>WI Selection Rule</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>WI Selection Rule</em>' containment reference.
   * @see #setWISelectionRule(WISelection)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getGovernanceStrategy_WISelectionRule()
   * @model containment="true"
   * @generated
   */
  WISelection getWISelectionRule();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getWISelectionRule <em>WI Selection Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>WI Selection Rule</em>' containment reference.
   * @see #getWISelectionRule()
   * @generated
   */
  void setWISelectionRule(WISelection value);

  /**
   * Returns the value of the '<em><b>WI Assignment Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>WI Assignment Rule</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>WI Assignment Rule</em>' containment reference.
   * @see #setWIAssignmentRule(WIAssignment)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getGovernanceStrategy_WIAssignmentRule()
   * @model containment="true"
   * @generated
   */
  WIAssignment getWIAssignmentRule();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getWIAssignmentRule <em>WI Assignment Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>WI Assignment Rule</em>' containment reference.
   * @see #getWIAssignmentRule()
   * @generated
   */
  void setWIAssignmentRule(WIAssignment value);

  /**
   * Returns the value of the '<em><b>Resource Allocation Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resource Allocation Rule</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resource Allocation Rule</em>' containment reference.
   * @see #setResourceAllocationRule(ResourceAllocation)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getGovernanceStrategy_ResourceAllocationRule()
   * @model containment="true"
   * @generated
   */
  ResourceAllocation getResourceAllocationRule();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getResourceAllocationRule <em>Resource Allocation Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resource Allocation Rule</em>' containment reference.
   * @see #getResourceAllocationRule()
   * @generated
   */
  void setResourceAllocationRule(ResourceAllocation value);

  /**
   * Returns the value of the '<em><b>Resource Outsourcing Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resource Outsourcing Rule</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resource Outsourcing Rule</em>' containment reference.
   * @see #setResourceOutsourcingRule(ResourceOutsourcing)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getGovernanceStrategy_ResourceOutsourcingRule()
   * @model containment="true"
   * @generated
   */
  ResourceOutsourcing getResourceOutsourcingRule();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getResourceOutsourcingRule <em>Resource Outsourcing Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resource Outsourcing Rule</em>' containment reference.
   * @see #getResourceOutsourcingRule()
   * @generated
   */
  void setResourceOutsourcingRule(ResourceOutsourcing value);

  /**
   * Returns the value of the '<em><b>Mechanisms</b></em>' containment reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.Mechanism}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mechanisms</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mechanisms</em>' containment reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getGovernanceStrategy_Mechanisms()
   * @model containment="true"
   * @generated
   */
  EList<Mechanism> getMechanisms();

} // GovernanceStrategy
