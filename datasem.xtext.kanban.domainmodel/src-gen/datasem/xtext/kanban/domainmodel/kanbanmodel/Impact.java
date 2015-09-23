/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Impact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Impact#getImpactWIs <em>Impact WIs</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Impact#getLikelihood <em>Likelihood</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Impact#getImpact <em>Impact</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getImpact()
 * @model
 * @generated
 */
public interface Impact extends EObject
{
  /**
   * Returns the value of the '<em><b>Impact WIs</b></em>' reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Impact WIs</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Impact WIs</em>' reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getImpact_ImpactWIs()
   * @model
   * @generated
   */
  EList<WorkItem> getImpactWIs();

  /**
   * Returns the value of the '<em><b>Likelihood</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Likelihood</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Likelihood</em>' containment reference.
   * @see #setLikelihood(AbstractParameter)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getImpact_Likelihood()
   * @model containment="true"
   * @generated
   */
  AbstractParameter getLikelihood();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Impact#getLikelihood <em>Likelihood</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Likelihood</em>' containment reference.
   * @see #getLikelihood()
   * @generated
   */
  void setLikelihood(AbstractParameter value);

  /**
   * Returns the value of the '<em><b>Impact</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Impact</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Impact</em>' containment reference.
   * @see #setImpact(AbstractParameter)
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getImpact_Impact()
   * @model containment="true"
   * @generated
   */
  AbstractParameter getImpact();

  /**
   * Sets the value of the '{@link datasem.xtext.kanban.domainmodel.kanbanmodel.Impact#getImpact <em>Impact</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Impact</em>' containment reference.
   * @see #getImpact()
   * @generated
   */
  void setImpact(AbstractParameter value);

} // Impact
