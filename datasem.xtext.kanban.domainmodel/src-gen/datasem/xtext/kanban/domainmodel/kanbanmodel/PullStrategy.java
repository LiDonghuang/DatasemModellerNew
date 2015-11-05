/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pull Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.PullStrategy#getMechanisms <em>Mechanisms</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getPullStrategy()
 * @model
 * @generated
 */
public interface PullStrategy extends EObject
{
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
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getPullStrategy_Mechanisms()
   * @model containment="true"
   * @generated
   */
  EList<Mechanism> getMechanisms();

} // PullStrategy
