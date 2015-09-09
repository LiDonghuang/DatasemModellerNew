/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Variable#getName <em>Name</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Variable#isTypeInteger <em>Type Integer</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Variable#getIntValue <em>Int Value</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Variable#isTypeDouble <em>Type Double</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Variable#getDoubleValue <em>Double Value</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Variable#isTypeString <em>Type String</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Variable#getStringValue <em>String Value</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Variable#isTypeDistribution <em>Type Distribution</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Variable#getDistrbution <em>Distrbution</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Variable#isTypeStrategy <em>Type Strategy</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Variable#getStrategy <em>Strategy</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends EObject
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
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getVariable_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Variable#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type Integer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Integer</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Integer</em>' attribute.
   * @see #setTypeInteger(boolean)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getVariable_TypeInteger()
   * @model
   * @generated
   */
  boolean isTypeInteger();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Variable#isTypeInteger <em>Type Integer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Integer</em>' attribute.
   * @see #isTypeInteger()
   * @generated
   */
  void setTypeInteger(boolean value);

  /**
   * Returns the value of the '<em><b>Int Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Value</em>' attribute.
   * @see #setIntValue(int)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getVariable_IntValue()
   * @model
   * @generated
   */
  int getIntValue();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Variable#getIntValue <em>Int Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int Value</em>' attribute.
   * @see #getIntValue()
   * @generated
   */
  void setIntValue(int value);

  /**
   * Returns the value of the '<em><b>Type Double</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Double</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Double</em>' attribute.
   * @see #setTypeDouble(boolean)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getVariable_TypeDouble()
   * @model
   * @generated
   */
  boolean isTypeDouble();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Variable#isTypeDouble <em>Type Double</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Double</em>' attribute.
   * @see #isTypeDouble()
   * @generated
   */
  void setTypeDouble(boolean value);

  /**
   * Returns the value of the '<em><b>Double Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Double Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Double Value</em>' attribute.
   * @see #setDoubleValue(double)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getVariable_DoubleValue()
   * @model
   * @generated
   */
  double getDoubleValue();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Variable#getDoubleValue <em>Double Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Double Value</em>' attribute.
   * @see #getDoubleValue()
   * @generated
   */
  void setDoubleValue(double value);

  /**
   * Returns the value of the '<em><b>Type String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type String</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type String</em>' attribute.
   * @see #setTypeString(boolean)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getVariable_TypeString()
   * @model
   * @generated
   */
  boolean isTypeString();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Variable#isTypeString <em>Type String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type String</em>' attribute.
   * @see #isTypeString()
   * @generated
   */
  void setTypeString(boolean value);

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
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getVariable_StringValue()
   * @model
   * @generated
   */
  String getStringValue();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Variable#getStringValue <em>String Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String Value</em>' attribute.
   * @see #getStringValue()
   * @generated
   */
  void setStringValue(String value);

  /**
   * Returns the value of the '<em><b>Type Distribution</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Distribution</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Distribution</em>' attribute.
   * @see #setTypeDistribution(boolean)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getVariable_TypeDistribution()
   * @model
   * @generated
   */
  boolean isTypeDistribution();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Variable#isTypeDistribution <em>Type Distribution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Distribution</em>' attribute.
   * @see #isTypeDistribution()
   * @generated
   */
  void setTypeDistribution(boolean value);

  /**
   * Returns the value of the '<em><b>Distrbution</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Distrbution</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Distrbution</em>' containment reference.
   * @see #setDistrbution(Distribution)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getVariable_Distrbution()
   * @model containment="true"
   * @generated
   */
  Distribution getDistrbution();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Variable#getDistrbution <em>Distrbution</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Distrbution</em>' containment reference.
   * @see #getDistrbution()
   * @generated
   */
  void setDistrbution(Distribution value);

  /**
   * Returns the value of the '<em><b>Type Strategy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Strategy</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Strategy</em>' attribute.
   * @see #setTypeStrategy(boolean)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getVariable_TypeStrategy()
   * @model
   * @generated
   */
  boolean isTypeStrategy();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Variable#isTypeStrategy <em>Type Strategy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Strategy</em>' attribute.
   * @see #isTypeStrategy()
   * @generated
   */
  void setTypeStrategy(boolean value);

  /**
   * Returns the value of the '<em><b>Strategy</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Strategy</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Strategy</em>' reference.
   * @see #setStrategy(GovernanceStrategy)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getVariable_Strategy()
   * @model
   * @generated
   */
  GovernanceStrategy getStrategy();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Variable#getStrategy <em>Strategy</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Strategy</em>' reference.
   * @see #getStrategy()
   * @generated
   */
  void setStrategy(GovernanceStrategy value);

} // Variable
