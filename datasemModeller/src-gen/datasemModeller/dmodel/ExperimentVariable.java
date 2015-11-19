/**
 */
package datasemModeller.dmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Experiment Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasemModeller.dmodel.ExperimentVariable#getName <em>Name</em>}</li>
 *   <li>{@link datasemModeller.dmodel.ExperimentVariable#isBoolean <em>Boolean</em>}</li>
 *   <li>{@link datasemModeller.dmodel.ExperimentVariable#isBooleanValue <em>Boolean Value</em>}</li>
 *   <li>{@link datasemModeller.dmodel.ExperimentVariable#isNum <em>Num</em>}</li>
 *   <li>{@link datasemModeller.dmodel.ExperimentVariable#getNumValue <em>Num Value</em>}</li>
 *   <li>{@link datasemModeller.dmodel.ExperimentVariable#isDistribution <em>Distribution</em>}</li>
 *   <li>{@link datasemModeller.dmodel.ExperimentVariable#getNumDist <em>Num Dist</em>}</li>
 *   <li>{@link datasemModeller.dmodel.ExperimentVariable#isString <em>String</em>}</li>
 *   <li>{@link datasemModeller.dmodel.ExperimentVariable#getStringValue <em>String Value</em>}</li>
 *   <li>{@link datasemModeller.dmodel.ExperimentVariable#isStrategy <em>Strategy</em>}</li>
 *   <li>{@link datasemModeller.dmodel.ExperimentVariable#getStrategyValue <em>Strategy Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasemModeller.dmodel.DmodelPackage#getExperimentVariable()
 * @model
 * @generated
 */
public interface ExperimentVariable extends EObject
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
   * @see datasemModeller.dmodel.DmodelPackage#getExperimentVariable_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.ExperimentVariable#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Boolean</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Boolean</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Boolean</em>' attribute.
   * @see #setBoolean(boolean)
   * @see datasemModeller.dmodel.DmodelPackage#getExperimentVariable_Boolean()
   * @model
   * @generated
   */
  boolean isBoolean();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.ExperimentVariable#isBoolean <em>Boolean</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Boolean</em>' attribute.
   * @see #isBoolean()
   * @generated
   */
  void setBoolean(boolean value);

  /**
   * Returns the value of the '<em><b>Boolean Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Boolean Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Boolean Value</em>' attribute.
   * @see #setBooleanValue(boolean)
   * @see datasemModeller.dmodel.DmodelPackage#getExperimentVariable_BooleanValue()
   * @model
   * @generated
   */
  boolean isBooleanValue();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.ExperimentVariable#isBooleanValue <em>Boolean Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Boolean Value</em>' attribute.
   * @see #isBooleanValue()
   * @generated
   */
  void setBooleanValue(boolean value);

  /**
   * Returns the value of the '<em><b>Num</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Num</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Num</em>' attribute.
   * @see #setNum(boolean)
   * @see datasemModeller.dmodel.DmodelPackage#getExperimentVariable_Num()
   * @model
   * @generated
   */
  boolean isNum();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.ExperimentVariable#isNum <em>Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Num</em>' attribute.
   * @see #isNum()
   * @generated
   */
  void setNum(boolean value);

  /**
   * Returns the value of the '<em><b>Num Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Num Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Num Value</em>' attribute.
   * @see #setNumValue(String)
   * @see datasemModeller.dmodel.DmodelPackage#getExperimentVariable_NumValue()
   * @model
   * @generated
   */
  String getNumValue();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.ExperimentVariable#getNumValue <em>Num Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Num Value</em>' attribute.
   * @see #getNumValue()
   * @generated
   */
  void setNumValue(String value);

  /**
   * Returns the value of the '<em><b>Distribution</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Distribution</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Distribution</em>' attribute.
   * @see #setDistribution(boolean)
   * @see datasemModeller.dmodel.DmodelPackage#getExperimentVariable_Distribution()
   * @model
   * @generated
   */
  boolean isDistribution();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.ExperimentVariable#isDistribution <em>Distribution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Distribution</em>' attribute.
   * @see #isDistribution()
   * @generated
   */
  void setDistribution(boolean value);

  /**
   * Returns the value of the '<em><b>Num Dist</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Num Dist</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Num Dist</em>' containment reference.
   * @see #setNumDist(Distribution)
   * @see datasemModeller.dmodel.DmodelPackage#getExperimentVariable_NumDist()
   * @model containment="true"
   * @generated
   */
  Distribution getNumDist();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.ExperimentVariable#getNumDist <em>Num Dist</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Num Dist</em>' containment reference.
   * @see #getNumDist()
   * @generated
   */
  void setNumDist(Distribution value);

  /**
   * Returns the value of the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String</em>' attribute.
   * @see #setString(boolean)
   * @see datasemModeller.dmodel.DmodelPackage#getExperimentVariable_String()
   * @model
   * @generated
   */
  boolean isString();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.ExperimentVariable#isString <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String</em>' attribute.
   * @see #isString()
   * @generated
   */
  void setString(boolean value);

  /**
   * Returns the value of the '<em><b>String Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String Value</em>' attribute.
   * @see #setStringValue(String)
   * @see datasemModeller.dmodel.DmodelPackage#getExperimentVariable_StringValue()
   * @model
   * @generated
   */
  String getStringValue();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.ExperimentVariable#getStringValue <em>String Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String Value</em>' attribute.
   * @see #getStringValue()
   * @generated
   */
  void setStringValue(String value);

  /**
   * Returns the value of the '<em><b>Strategy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Strategy</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Strategy</em>' attribute.
   * @see #setStrategy(boolean)
   * @see datasemModeller.dmodel.DmodelPackage#getExperimentVariable_Strategy()
   * @model
   * @generated
   */
  boolean isStrategy();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.ExperimentVariable#isStrategy <em>Strategy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Strategy</em>' attribute.
   * @see #isStrategy()
   * @generated
   */
  void setStrategy(boolean value);

  /**
   * Returns the value of the '<em><b>Strategy Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Strategy Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Strategy Value</em>' containment reference.
   * @see #setStrategyValue(GovernanceStrategy)
   * @see datasemModeller.dmodel.DmodelPackage#getExperimentVariable_StrategyValue()
   * @model containment="true"
   * @generated
   */
  GovernanceStrategy getStrategyValue();

  /**
   * Sets the value of the '{@link datasemModeller.dmodel.ExperimentVariable#getStrategyValue <em>Strategy Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Strategy Value</em>' containment reference.
   * @see #getStrategyValue()
   * @generated
   */
  void setStrategyValue(GovernanceStrategy value);

} // ExperimentVariable
