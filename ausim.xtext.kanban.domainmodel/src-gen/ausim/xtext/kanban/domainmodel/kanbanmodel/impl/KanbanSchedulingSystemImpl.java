/**
 */
package ausim.xtext.kanban.domainmodel.kanbanmodel.impl;

import ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanSchedulingSystem;
import ausim.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelPackage;
import ausim.xtext.kanban.domainmodel.kanbanmodel.Mechanism;
import ausim.xtext.kanban.domainmodel.kanbanmodel.ServiceProvider;
import ausim.xtext.kanban.domainmodel.kanbanmodel.ServiceType;
import ausim.xtext.kanban.domainmodel.kanbanmodel.TaskPattern;
import ausim.xtext.kanban.domainmodel.kanbanmodel.TaskType;
import ausim.xtext.kanban.domainmodel.kanbanmodel.WorkItem;
import ausim.xtext.kanban.domainmodel.kanbanmodel.WorkSource;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kanban Scheduling System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl#getMechanisms <em>Mechanisms</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl#getKSSTaskPatterns <em>KSS Task Patterns</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl#getKSStaskPatternTypes <em>KS Stask Pattern Types</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl#getSoSServices <em>So SServices</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl#getOrgUnits <em>Org Units</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl#getKssSources <em>Kss Sources</em>}</li>
 *   <li>{@link ausim.xtext.kanban.domainmodel.kanbanmodel.impl.KanbanSchedulingSystemImpl#getKssWItems <em>Kss WItems</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KanbanSchedulingSystemImpl extends MinimalEObjectImpl.Container implements KanbanSchedulingSystem
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
   * The cached value of the '{@link #getMechanisms() <em>Mechanisms</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMechanisms()
   * @generated
   * @ordered
   */
  protected EList<Mechanism> mechanisms;

  /**
   * The cached value of the '{@link #getKSSTaskPatterns() <em>KSS Task Patterns</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKSSTaskPatterns()
   * @generated
   * @ordered
   */
  protected EList<TaskPattern> kssTaskPatterns;

  /**
   * The cached value of the '{@link #getKSStaskPatternTypes() <em>KS Stask Pattern Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKSStaskPatternTypes()
   * @generated
   * @ordered
   */
  protected EList<TaskType> ksStaskPatternTypes;

  /**
   * The cached value of the '{@link #getSoSServices() <em>So SServices</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSoSServices()
   * @generated
   * @ordered
   */
  protected EList<ServiceType> soSServices;

  /**
   * The cached value of the '{@link #getOrgUnits() <em>Org Units</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrgUnits()
   * @generated
   * @ordered
   */
  protected EList<ServiceProvider> orgUnits;

  /**
   * The cached value of the '{@link #getKssSources() <em>Kss Sources</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKssSources()
   * @generated
   * @ordered
   */
  protected EList<WorkSource> kssSources;

  /**
   * The cached value of the '{@link #getKssWItems() <em>Kss WItems</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKssWItems()
   * @generated
   * @ordered
   */
  protected EList<WorkItem> kssWItems;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected KanbanSchedulingSystemImpl()
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
    return KanbanmodelPackage.Literals.KANBAN_SCHEDULING_SYSTEM;
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
      eNotify(new ENotificationImpl(this, Notification.SET, KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Mechanism> getMechanisms()
  {
    if (mechanisms == null)
    {
      mechanisms = new EObjectContainmentEList<Mechanism>(Mechanism.class, this, KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__MECHANISMS);
    }
    return mechanisms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TaskPattern> getKSSTaskPatterns()
  {
    if (kssTaskPatterns == null)
    {
      kssTaskPatterns = new EObjectContainmentEList<TaskPattern>(TaskPattern.class, this, KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__KSS_TASK_PATTERNS);
    }
    return kssTaskPatterns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TaskType> getKSStaskPatternTypes()
  {
    if (ksStaskPatternTypes == null)
    {
      ksStaskPatternTypes = new EObjectContainmentEList<TaskType>(TaskType.class, this, KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__KS_STASK_PATTERN_TYPES);
    }
    return ksStaskPatternTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ServiceType> getSoSServices()
  {
    if (soSServices == null)
    {
      soSServices = new EObjectContainmentEList<ServiceType>(ServiceType.class, this, KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__SO_SSERVICES);
    }
    return soSServices;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ServiceProvider> getOrgUnits()
  {
    if (orgUnits == null)
    {
      orgUnits = new EObjectContainmentEList<ServiceProvider>(ServiceProvider.class, this, KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__ORG_UNITS);
    }
    return orgUnits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WorkSource> getKssSources()
  {
    if (kssSources == null)
    {
      kssSources = new EObjectContainmentEList<WorkSource>(WorkSource.class, this, KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__KSS_SOURCES);
    }
    return kssSources;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WorkItem> getKssWItems()
  {
    if (kssWItems == null)
    {
      kssWItems = new EObjectContainmentEList<WorkItem>(WorkItem.class, this, KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__KSS_WITEMS);
    }
    return kssWItems;
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
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__MECHANISMS:
        return ((InternalEList<?>)getMechanisms()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__KSS_TASK_PATTERNS:
        return ((InternalEList<?>)getKSSTaskPatterns()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__KS_STASK_PATTERN_TYPES:
        return ((InternalEList<?>)getKSStaskPatternTypes()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__SO_SSERVICES:
        return ((InternalEList<?>)getSoSServices()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__ORG_UNITS:
        return ((InternalEList<?>)getOrgUnits()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__KSS_SOURCES:
        return ((InternalEList<?>)getKssSources()).basicRemove(otherEnd, msgs);
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__KSS_WITEMS:
        return ((InternalEList<?>)getKssWItems()).basicRemove(otherEnd, msgs);
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
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__NAME:
        return getName();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__MECHANISMS:
        return getMechanisms();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__KSS_TASK_PATTERNS:
        return getKSSTaskPatterns();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__KS_STASK_PATTERN_TYPES:
        return getKSStaskPatternTypes();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__SO_SSERVICES:
        return getSoSServices();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__ORG_UNITS:
        return getOrgUnits();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__KSS_SOURCES:
        return getKssSources();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__KSS_WITEMS:
        return getKssWItems();
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
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__NAME:
        setName((String)newValue);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__MECHANISMS:
        getMechanisms().clear();
        getMechanisms().addAll((Collection<? extends Mechanism>)newValue);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__KSS_TASK_PATTERNS:
        getKSSTaskPatterns().clear();
        getKSSTaskPatterns().addAll((Collection<? extends TaskPattern>)newValue);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__KS_STASK_PATTERN_TYPES:
        getKSStaskPatternTypes().clear();
        getKSStaskPatternTypes().addAll((Collection<? extends TaskType>)newValue);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__SO_SSERVICES:
        getSoSServices().clear();
        getSoSServices().addAll((Collection<? extends ServiceType>)newValue);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__ORG_UNITS:
        getOrgUnits().clear();
        getOrgUnits().addAll((Collection<? extends ServiceProvider>)newValue);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__KSS_SOURCES:
        getKssSources().clear();
        getKssSources().addAll((Collection<? extends WorkSource>)newValue);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__KSS_WITEMS:
        getKssWItems().clear();
        getKssWItems().addAll((Collection<? extends WorkItem>)newValue);
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
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__MECHANISMS:
        getMechanisms().clear();
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__KSS_TASK_PATTERNS:
        getKSSTaskPatterns().clear();
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__KS_STASK_PATTERN_TYPES:
        getKSStaskPatternTypes().clear();
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__SO_SSERVICES:
        getSoSServices().clear();
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__ORG_UNITS:
        getOrgUnits().clear();
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__KSS_SOURCES:
        getKssSources().clear();
        return;
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__KSS_WITEMS:
        getKssWItems().clear();
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
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__MECHANISMS:
        return mechanisms != null && !mechanisms.isEmpty();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__KSS_TASK_PATTERNS:
        return kssTaskPatterns != null && !kssTaskPatterns.isEmpty();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__KS_STASK_PATTERN_TYPES:
        return ksStaskPatternTypes != null && !ksStaskPatternTypes.isEmpty();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__SO_SSERVICES:
        return soSServices != null && !soSServices.isEmpty();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__ORG_UNITS:
        return orgUnits != null && !orgUnits.isEmpty();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__KSS_SOURCES:
        return kssSources != null && !kssSources.isEmpty();
      case KanbanmodelPackage.KANBAN_SCHEDULING_SYSTEM__KSS_WITEMS:
        return kssWItems != null && !kssWItems.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //KanbanSchedulingSystemImpl
