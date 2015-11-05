/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skill</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Skill#getService <em>Service</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Skill#getEfficiency <em>Efficiency</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getSkill()
 * @model
 * @generated
 */
public interface Skill extends EObject
{
  /**
   * Returns the value of the '<em><b>Service</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service</em>' reference.
   * @see #setService(Service)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getSkill_Service()
   * @model
   * @generated
   */
  Service getService();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Skill#getService <em>Service</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Service</em>' reference.
   * @see #getService()
   * @generated
   */
  void setService(Service value);

  /**
   * Returns the value of the '<em><b>Efficiency</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Efficiency</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Efficiency</em>' containment reference.
   * @see #setEfficiency(AbstractParameter)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getSkill_Efficiency()
   * @model containment="true"
   * @generated
   */
  AbstractParameter getEfficiency();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Skill#getEfficiency <em>Efficiency</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Efficiency</em>' containment reference.
   * @see #getEfficiency()
   * @generated
   */
  void setEfficiency(AbstractParameter value);

} // Skill
