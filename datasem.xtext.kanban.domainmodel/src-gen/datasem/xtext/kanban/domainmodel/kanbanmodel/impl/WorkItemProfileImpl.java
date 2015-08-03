/**
 */
package datasem.xtext.kanban.domainmodel.kanbanmodel.impl;

import datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import datasem.xtext.kanban.domainmodel.kanbanmodel.NumExpression;
import datasem.xtext.kanban.domainmodel.kanbanmodel.ProcessModel;
import datasem.xtext.kanban.domainmodel.kanbanmodel.ServiceType;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WorkDecomposition;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WorkItemProfile;
import datasem.xtext.kanban.domainmodel.kanbanmodel.WorkReference;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Item Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemProfileImpl#getName <em>Name</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemProfileImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemProfileImpl#getProcessModel <em>Process Model</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemProfileImpl#getReferences <em>References</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemProfileImpl#getDecompositions <em>Decompositions</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemProfileImpl#getRequiredServices <em>Required Services</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemProfileImpl#getEfforts <em>Efforts</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemProfileImpl#getValue <em>Value</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemProfileImpl#getClassOfService <em>Class Of Service</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemProfileImpl#isAllowAssignment <em>Allow Assignment</em>}</li>
 *   <li>{@link datasem.xtext.kanban.domainmodel.kanbanmodel.impl.WorkItemProfileImpl#isAllowDiscard <em>Allow Discard</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkItemProfileImpl extends MinimalEObjectImpl.Container implements WorkItemProfile
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getProcessModel() <em>Process Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessModel()
   * @generated
   * @ordered
   */
  protected ProcessModel processModel;

  /**
   * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferences()
   * @generated
   * @ordered
   */
  protected EList<WorkReference> references;

  /**
   * The cached value of the '{@link #getDecompositions() <em>Decompositions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecompositions()
   * @generated
   * @ordered
   */
  protected EList<WorkDecomposition> decompositions;

  /**
   * The cached value of the '{@link #getRequiredServices() <em>Required Services</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequiredServices()
   * @generated
   * @ordered
   */
  protected EList<ServiceType> requiredServices;

  /**
   * The cached value of the '{@link #getEfforts() <em>Efforts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEfforts()
   * @generated
   * @ordered
   */
  protected NumExpression efforts;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected NumExpression value;

  /**
   * The default value of the '{@link #getClassOfService() <em>Class Of Service</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassOfService()
   * @generated
   * @ordered
   */
  protected static final String CLASS_OF_SERVICE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClassOfService() <em>Class Of Service</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassOfService()
   * @generated
   * @ordered
   */
  protected String classOfService = CLASS_OF_SERVICE_EDEFAULT;

  /**
   * The default value of the '{@link #isAllowAssignment() <em>Allow Assignment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAllowAssignment()
   * @generated
   * @ordered
   */
  protected static final boolean ALLOW_ASSIGNMENT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAllowAssignment() <em>Allow Assignment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAllowAssignment()
   * @generated
   * @ordered
   */
  protected boolean allowAssignment = ALLOW_ASSIGNMENT_EDEFAULT;

  /**
   * The default value of the '{@link #isAllowDiscard() <em>Allow Discard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAllowDiscard()
   * @generated
   * @ordered
   */
  protected static final boolean ALLOW_DISCARD_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAllowDiscard() <em>Allow Discard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAllowDiscard()
   * @generated
   * @ordered
   */
  protected boolean allowDiscard = ALLOW_DISCARD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WorkItemProfileImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return KanbanmodelPackage.Literals.WORK_ITEM_PROFILE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM_PROFILE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM_PROFILE__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessModel getProcessModel()
  {
    if (processModel != null && processModel.eIsProxy())
    {
      InternalEObject oldProcessModel = (InternalEObject)processModel;
      processModel = (ProcessModel)eResolveProxy(oldProcessModel);
      if (processModel != oldProcessModel)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, KanbanmodelPackage.WORK_ITEM_PROFILE__PROCESS_MODEL, oldProcessModel, processModel));
      }
    }
    return processModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessModel basicGetProcessModel()
  {
    return processModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProcessModel(ProcessModel newProcessModel)
  {
    ProcessModel oldProcessModel = processModel;
    processModel = newProcessModel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM_PROFILE__PROCESS_MODEL, oldProcessModel, processModel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WorkReference> getReferences()
  {
    if (references == null)
    {
      references = new EObjectContainmentEList<WorkReference>(WorkReference.class, this, KanbanmodelPackage.WORK_ITEM_PROFILE__REFERENCES);
    }
    return references;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WorkDecomposition> getDecompositions()
  {
    if (decompositions == null)
    {
      decompositions = new EObjectContainmentEList<WorkDecomposition>(WorkDecomposition.class, this, KanbanmodelPackage.WORK_ITEM_PROFILE__DECOMPOSITIONS);
    }
    return decompositions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ServiceType> getRequiredServices()
  {
    if (requiredServices == null)
    {
      requiredServices = new EObjectResolvingEList<ServiceType>(ServiceType.class, this, KanbanmodelPackage.WORK_ITEM_PROFILE__REQUIRED_SERVICES);
    }
    return requiredServices;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumExpression getEfforts()
  {
    return efforts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEfforts(NumExpression newEfforts, NotificationChain msgs)
  {
    NumExpression oldEfforts = efforts;
    efforts = newEfforts;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM_PROFILE__EFFORTS, oldEfforts, newEfforts);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEfforts(NumExpression newEfforts)
  {
    if (newEfforts != efforts)
    {
      NotificationChain msgs = null;
      if (efforts != null)
        msgs = ((InternalEObject)efforts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.WORK_ITEM_PROFILE__EFFORTS, null, msgs);
      if (newEfforts != null)
        msgs = ((InternalEObject)newEfforts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.WORK_ITEM_PROFILE__EFFORTS, null, msgs);
      msgs = basicSetEfforts(newEfforts, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM_PROFILE__EFFORTS, newEfforts, newEfforts));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumExpression getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(NumExpression newValue, NotificationChain msgs)
  {
    NumExpression oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM_PROFILE__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(NumExpression newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.WORK_ITEM_PROFILE__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KanbanmodelPackage.WORK_ITEM_PROFILE__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM_PROFILE__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getClassOfService()
  {
    return classOfService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassOfService(String newClassOfService)
  {
    String oldClassOfService = classOfService;
    classOfService = newClassOfService;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM_PROFILE__CLASS_OF_SERVICE, oldClassOfService, classOfService));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAllowAssignment()
  {
    return allowAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAllowAssignment(boolean newAllowAssignment)
  {
    boolean oldAllowAssignment = allowAssignment;
    allowAssignment = newAllowAssignment;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM_PROFILE__ALLOW_ASSIGNMENT, oldAllowAssignment, allowAssignment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAllowDiscard()
  {
    return allowDiscard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAllowDiscard(boolean newAllowDiscard)
  {
    boolean oldAllowDiscard = allowDiscard;
    allowDiscard = newAllowDiscard;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.WORK_ITEM_PROFILE__ALLOW_DISCARD, oldAllowDiscard, allowDiscard));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case KanbanmodelPackage.WORK_ITEM_PROFILE__REFERENCES:
        return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.WORK_ITEM_PROFILE__DECOMPOSITIONS:
        return ((InternalEList<?>)getDecompositions()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.WORK_ITEM_PROFILE__EFFORTS:
        return basicSetEfforts(null, msgs);
      case KanbanmodelPackage.WORK_ITEM_PROFILE__VALUE:
        return basicSetValue(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case KanbanmodelPackage.WORK_ITEM_PROFILE__NAME:
        return getName();
      case KanbanmodelPackage.WORK_ITEM_PROFILE__DESCRIPTION:
        return getDescription();
      case KanbanmodelPackage.WORK_ITEM_PROFILE__PROCESS_MODEL:
        if (resolve) return getProcessModel();
        return basicGetProcessModel();
      case KanbanmodelPackage.WORK_ITEM_PROFILE__REFERENCES:
        return getReferences();
      case KanbanmodelPackage.WORK_ITEM_PROFILE__DECOMPOSITIONS:
        return getDecompositions();
      case KanbanmodelPackage.WORK_ITEM_PROFILE__REQUIRED_SERVICES:
        return getRequiredServices();
      case KanbanmodelPackage.WORK_ITEM_PROFILE__EFFORTS:
        return getEfforts();
      case KanbanmodelPackage.WORK_ITEM_PROFILE__VALUE:
        return getValue();
      case KanbanmodelPackage.WORK_ITEM_PROFILE__CLASS_OF_SERVICE:
        return getClassOfService();
      case KanbanmodelPackage.WORK_ITEM_PROFILE__ALLOW_ASSIGNMENT:
        return isAllowAssignment();
      case KanbanmodelPackage.WORK_ITEM_PROFILE__ALLOW_DISCARD:
        return isAllowDiscard();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case KanbanmodelPackage.WORK_ITEM_PROFILE__NAME:
        setName((String)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM_PROFILE__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM_PROFILE__PROCESS_MODEL:
        setProcessModel((ProcessModel)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM_PROFILE__REFERENCES:
        getReferences().clear();
        getReferences().addAll((Collection<? extends WorkReference>)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM_PROFILE__DECOMPOSITIONS:
        getDecompositions().clear();
        getDecompositions().addAll((Collection<? extends WorkDecomposition>)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM_PROFILE__REQUIRED_SERVICES:
        getRequiredServices().clear();
        getRequiredServices().addAll((Collection<? extends ServiceType>)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM_PROFILE__EFFORTS:
        setEfforts((NumExpression)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM_PROFILE__VALUE:
        setValue((NumExpression)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM_PROFILE__CLASS_OF_SERVICE:
        setClassOfService((String)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM_PROFILE__ALLOW_ASSIGNMENT:
        setAllowAssignment((Boolean)newValue);
        return;
      case KanbanmodelPackage.WORK_ITEM_PROFILE__ALLOW_DISCARD:
        setAllowDiscard((Boolean)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case KanbanmodelPackage.WORK_ITEM_PROFILE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case KanbanmodelPackage.WORK_ITEM_PROFILE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case KanbanmodelPackage.WORK_ITEM_PROFILE__PROCESS_MODEL:
        setProcessModel((ProcessModel)null);
        return;
      case KanbanmodelPackage.WORK_ITEM_PROFILE__REFERENCES:
        getReferences().clear();
        return;
      case KanbanmodelPackage.WORK_ITEM_PROFILE__DECOMPOSITIONS:
        getDecompositions().clear();
        return;
      case KanbanmodelPackage.WORK_ITEM_PROFILE__REQUIRED_SERVICES:
        getRequiredServices().clear();
        return;
      case KanbanmodelPackage.WORK_ITEM_PROFILE__EFFORTS:
        setEfforts((NumExpression)null);
        return;
      case KanbanmodelPackage.WORK_ITEM_PROFILE__VALUE:
        setValue((NumExpression)null);
        return;
      case KanbanmodelPackage.WORK_ITEM_PROFILE__CLASS_OF_SERVICE:
        setClassOfService(CLASS_OF_SERVICE_EDEFAULT);
        return;
      case KanbanmodelPackage.WORK_ITEM_PROFILE__ALLOW_ASSIGNMENT:
        setAllowAssignment(ALLOW_ASSIGNMENT_EDEFAULT);
        return;
      case KanbanmodelPackage.WORK_ITEM_PROFILE__ALLOW_DISCARD:
        setAllowDiscard(ALLOW_DISCARD_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case KanbanmodelPackage.WORK_ITEM_PROFILE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case KanbanmodelPackage.WORK_ITEM_PROFILE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case KanbanmodelPackage.WORK_ITEM_PROFILE__PROCESS_MODEL:
        return processModel != null;
      case KanbanmodelPackage.WORK_ITEM_PROFILE__REFERENCES:
        return references != null && !references.isEmpty();
      case KanbanmodelPackage.WORK_ITEM_PROFILE__DECOMPOSITIONS:
        return decompositions != null && !decompositions.isEmpty();
      case KanbanmodelPackage.WORK_ITEM_PROFILE__REQUIRED_SERVICES:
        return requiredServices != null && !requiredServices.isEmpty();
      case KanbanmodelPackage.WORK_ITEM_PROFILE__EFFORTS:
        return efforts != null;
      case KanbanmodelPackage.WORK_ITEM_PROFILE__VALUE:
        return value != null;
      case KanbanmodelPackage.WORK_ITEM_PROFILE__CLASS_OF_SERVICE:
        return CLASS_OF_SERVICE_EDEFAULT == null ? classOfService != null : !CLASS_OF_SERVICE_EDEFAULT.equals(classOfService);
      case KanbanmodelPackage.WORK_ITEM_PROFILE__ALLOW_ASSIGNMENT:
        return allowAssignment != ALLOW_ASSIGNMENT_EDEFAULT;
      case KanbanmodelPackage.WORK_ITEM_PROFILE__ALLOW_DISCARD:
        return allowDiscard != ALLOW_DISCARD_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", description: ");
    result.append(description);
    result.append(", classOfService: ");
    result.append(classOfService);
    result.append(", allowAssignment: ");
    result.append(allowAssignment);
    result.append(", allowDiscard: ");
    result.append(allowDiscard);
    result.append(')');
    return result.toString();
  }

} //WorkItemProfileImpl
