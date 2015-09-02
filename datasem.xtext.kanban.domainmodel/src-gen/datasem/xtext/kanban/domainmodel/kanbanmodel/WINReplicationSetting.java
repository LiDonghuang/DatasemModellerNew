/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WIN Replication Setting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.WINReplicationSetting#getWINReplications <em>WIN Replications</em>}</li>
 * </ul>
 * </p>
 *
 * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWINReplicationSetting()
 * @model
 * @generated
 */
public interface WINReplicationSetting extends EObject
{
  /**
   * Returns the value of the '<em><b>WIN Replications</b></em>' containment reference list.
   * The list contents are of type {@link datasem.xtext.kanban.domainmodel.kanbanmodel.WINReplication}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>WIN Replications</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>WIN Replications</em>' containment reference list.
   * @see datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage#getWINReplicationSetting_WINReplications()
   * @model containment="true"
   * @generated
   */
  EList<WINReplication> getWINReplications();

} // WINReplicationSetting
