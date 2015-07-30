/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Causality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Causality#getTriggered <em>Triggered</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Causality#getAtProgress <em>At Progress</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Causality#getOnProbability <em>On Probability</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getCausality()
 * @model
 * @generated
 */
public interface Causality extends EObject
{
  /**
   * Returns the value of the '<em><b>Triggered</b></em>' reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Triggered</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Triggered</em>' reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getCausality_Triggered()
   * @model
   * @generated
   */
  EList<WorkItem> getTriggered();

  /**
   * Returns the value of the '<em><b>At Progress</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>At Progress</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>At Progress</em>' attribute.
   * @see #setAtProgress(int)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getCausality_AtProgress()
   * @model
   * @generated
   */
  int getAtProgress();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Causality#getAtProgress <em>At Progress</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>At Progress</em>' attribute.
   * @see #getAtProgress()
   * @generated
   */
  void setAtProgress(int value);

  /**
   * Returns the value of the '<em><b>On Probability</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>On Probability</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>On Probability</em>' attribute.
   * @see #setOnProbability(int)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getCausality_OnProbability()
   * @model
   * @generated
   */
  int getOnProbability();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Causality#getOnProbability <em>On Probability</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>On Probability</em>' attribute.
   * @see #getOnProbability()
   * @generated
   */
  void setOnProbability(int value);

} // Causality
