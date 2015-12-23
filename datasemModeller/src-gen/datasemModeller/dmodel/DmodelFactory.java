/**
 */
package datasemModeller.dmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see datasemModeller.dmodel.DmodelPackage
 * @generated
 */
public interface DmodelFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DmodelFactory eINSTANCE = datasemModeller.dmodel.impl.DmodelFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model Builder</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Builder</em>'.
   * @generated
   */
  ModelBuilder createModelBuilder();

  /**
   * Returns a new object of class '<em>User Libraries</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>User Libraries</em>'.
   * @generated
   */
  UserLibraries createUserLibraries();

  /**
   * Returns a new object of class '<em>Experiment Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Experiment Model</em>'.
   * @generated
   */
  ExperimentModel createExperimentModel();

  /**
   * Returns a new object of class '<em>Abstract Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Parameter</em>'.
   * @generated
   */
  AbstractParameter createAbstractParameter();

  /**
   * Returns a new object of class '<em>Num Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Num Expression</em>'.
   * @generated
   */
  NumExpression createNumExpression();

  /**
   * Returns a new object of class '<em>Distribution</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Distribution</em>'.
   * @generated
   */
  Distribution createDistribution();

  /**
   * Returns a new object of class '<em>Governance Strategy</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Governance Strategy</em>'.
   * @generated
   */
  GovernanceStrategy createGovernanceStrategy();

  /**
   * Returns a new object of class '<em>Pull Strategy</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pull Strategy</em>'.
   * @generated
   */
  PullStrategy createPullStrategy();

  /**
   * Returns a new object of class '<em>Push Strategy</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Push Strategy</em>'.
   * @generated
   */
  PushStrategy createPushStrategy();

  /**
   * Returns a new object of class '<em>Mechanism</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mechanism</em>'.
   * @generated
   */
  Mechanism createMechanism();

  /**
   * Returns a new object of class '<em>Mechanism Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mechanism Attribute</em>'.
   * @generated
   */
  MechanismAttribute createMechanismAttribute();

  /**
   * Returns a new object of class '<em>Work Item Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Work Item Type</em>'.
   * @generated
   */
  WorkItemType createWorkItemType();

  /**
   * Returns a new object of class '<em>Work Item Network</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Work Item Network</em>'.
   * @generated
   */
  WorkItemNetwork createWorkItemNetwork();

  /**
   * Returns a new object of class '<em>Work Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Work Item</em>'.
   * @generated
   */
  WorkItem createWorkItem();

  /**
   * Returns a new object of class '<em>Required Service</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Required Service</em>'.
   * @generated
   */
  RequiredService createRequiredService();

  /**
   * Returns a new object of class '<em>Impact</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Impact</em>'.
   * @generated
   */
  Impact createImpact();

  /**
   * Returns a new object of class '<em>Service Provider Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service Provider Type</em>'.
   * @generated
   */
  ServiceProviderType createServiceProviderType();

  /**
   * Returns a new object of class '<em>Service</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service</em>'.
   * @generated
   */
  Service createService();

  /**
   * Returns a new object of class '<em>Service Provider</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service Provider</em>'.
   * @generated
   */
  ServiceProvider createServiceProvider();

  /**
   * Returns a new object of class '<em>Asset</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Asset</em>'.
   * @generated
   */
  Asset createAsset();

  /**
   * Returns a new object of class '<em>Skill</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Skill</em>'.
   * @generated
   */
  Skill createSkill();

  /**
   * Returns a new object of class '<em>Experiment Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Experiment Variable</em>'.
   * @generated
   */
  ExperimentVariable createExperimentVariable();

  /**
   * Returns a new object of class '<em>WIN Replication</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>WIN Replication</em>'.
   * @generated
   */
  WINReplication createWINReplication();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DmodelPackage getDmodelPackage();

} //DmodelFactory
