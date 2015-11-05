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
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getName <em>Name</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#isPull <em>Pull</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getDescription <em>Description</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getPullStrategy <em>Pull Strategy</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#isPush <em>Push</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getPushStrategy <em>Push Strategy</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#isCnp <em>Cnp</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getContractNetProtocal <em>Contract Net Protocal</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getProcesses <em>Processes</em>}</li>
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
   * Returns the value of the '<em><b>Pull</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pull</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pull</em>' attribute.
   * @see #setPull(boolean)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getGovernanceStrategy_Pull()
   * @model
   * @generated
   */
  boolean isPull();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#isPull <em>Pull</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pull</em>' attribute.
   * @see #isPull()
   * @generated
   */
  void setPull(boolean value);

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
   * Returns the value of the '<em><b>Pull Strategy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pull Strategy</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pull Strategy</em>' containment reference.
   * @see #setPullStrategy(PullStrategy)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getGovernanceStrategy_PullStrategy()
   * @model containment="true"
   * @generated
   */
  PullStrategy getPullStrategy();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getPullStrategy <em>Pull Strategy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pull Strategy</em>' containment reference.
   * @see #getPullStrategy()
   * @generated
   */
  void setPullStrategy(PullStrategy value);

  /**
   * Returns the value of the '<em><b>Push</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Push</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Push</em>' attribute.
   * @see #setPush(boolean)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getGovernanceStrategy_Push()
   * @model
   * @generated
   */
  boolean isPush();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#isPush <em>Push</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Push</em>' attribute.
   * @see #isPush()
   * @generated
   */
  void setPush(boolean value);

  /**
   * Returns the value of the '<em><b>Push Strategy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Push Strategy</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Push Strategy</em>' containment reference.
   * @see #setPushStrategy(PushStrategy)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getGovernanceStrategy_PushStrategy()
   * @model containment="true"
   * @generated
   */
  PushStrategy getPushStrategy();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getPushStrategy <em>Push Strategy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Push Strategy</em>' containment reference.
   * @see #getPushStrategy()
   * @generated
   */
  void setPushStrategy(PushStrategy value);

  /**
   * Returns the value of the '<em><b>Cnp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cnp</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cnp</em>' attribute.
   * @see #setCnp(boolean)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getGovernanceStrategy_Cnp()
   * @model
   * @generated
   */
  boolean isCnp();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#isCnp <em>Cnp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cnp</em>' attribute.
   * @see #isCnp()
   * @generated
   */
  void setCnp(boolean value);

  /**
   * Returns the value of the '<em><b>Contract Net Protocal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contract Net Protocal</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contract Net Protocal</em>' containment reference.
   * @see #setContractNetProtocal(ContractNetProtocol)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getGovernanceStrategy_ContractNetProtocal()
   * @model containment="true"
   * @generated
   */
  ContractNetProtocol getContractNetProtocal();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.GovernanceStrategy#getContractNetProtocal <em>Contract Net Protocal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Contract Net Protocal</em>' containment reference.
   * @see #getContractNetProtocal()
   * @generated
   */
  void setContractNetProtocal(ContractNetProtocol value);

  /**
   * Returns the value of the '<em><b>Processes</b></em>' reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.ProcessModel}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Processes</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Processes</em>' reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getGovernanceStrategy_Processes()
   * @model
   * @generated
   */
  EList<ProcessModel> getProcesses();

} // GovernanceStrategy
