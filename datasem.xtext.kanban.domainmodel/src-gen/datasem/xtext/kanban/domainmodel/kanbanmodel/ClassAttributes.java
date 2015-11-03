/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.ClassAttributes#getAgentAttributes <em>Agent Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getClassAttributes()
 * @model
 * @generated
 */
public interface ClassAttributes extends EObject
{
  /**
   * Returns the value of the '<em><b>Agent Attributes</b></em>' containment reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Agent Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Agent Attributes</em>' containment reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getClassAttributes_AgentAttributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAgentAttributes();

} // ClassAttributes
