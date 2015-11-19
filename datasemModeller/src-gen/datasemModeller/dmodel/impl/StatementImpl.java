/**
 */
package datasemModeller.dmodel.impl;

import datasemModeller.dmodel.ActionStatement;
import datasemModeller.dmodel.AssertStatement;
import datasemModeller.dmodel.ChangeStateStatement;
import datasemModeller.dmodel.DeclarationStatement;
import datasemModeller.dmodel.DmodelPackage;
import datasemModeller.dmodel.ForExpression;
import datasemModeller.dmodel.IfExpression;
import datasemModeller.dmodel.Statement;
import datasemModeller.dmodel.WhileExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datasemModeller.dmodel.impl.StatementImpl#isIsAction <em>Is Action</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.StatementImpl#getActionStatement <em>Action Statement</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.StatementImpl#isIsChangeState <em>Is Change State</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.StatementImpl#getChangeStateStatement <em>Change State Statement</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.StatementImpl#isIsDeclaration <em>Is Declaration</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.StatementImpl#getDeclarationStatement <em>Declaration Statement</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.StatementImpl#isIsIfExpression <em>Is If Expression</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.StatementImpl#getIfExpression <em>If Expression</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.StatementImpl#isIsForExpression <em>Is For Expression</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.StatementImpl#getForExpression <em>For Expression</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.StatementImpl#isIsWhileExpression <em>Is While Expression</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.StatementImpl#getWhileExpression <em>While Expression</em>}</li>
 *   <li>{@link datasemModeller.dmodel.impl.StatementImpl#getAssertStatement <em>Assert Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatementImpl extends MinimalEObjectImpl.Container implements Statement
{
  /**
   * The default value of the '{@link #isIsAction() <em>Is Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsAction()
   * @generated
   * @ordered
   */
  protected static final boolean IS_ACTION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsAction() <em>Is Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsAction()
   * @generated
   * @ordered
   */
  protected boolean isAction = IS_ACTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getActionStatement() <em>Action Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActionStatement()
   * @generated
   * @ordered
   */
  protected ActionStatement actionStatement;

  /**
   * The default value of the '{@link #isIsChangeState() <em>Is Change State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsChangeState()
   * @generated
   * @ordered
   */
  protected static final boolean IS_CHANGE_STATE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsChangeState() <em>Is Change State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsChangeState()
   * @generated
   * @ordered
   */
  protected boolean isChangeState = IS_CHANGE_STATE_EDEFAULT;

  /**
   * The cached value of the '{@link #getChangeStateStatement() <em>Change State Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChangeStateStatement()
   * @generated
   * @ordered
   */
  protected ChangeStateStatement changeStateStatement;

  /**
   * The default value of the '{@link #isIsDeclaration() <em>Is Declaration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsDeclaration()
   * @generated
   * @ordered
   */
  protected static final boolean IS_DECLARATION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsDeclaration() <em>Is Declaration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsDeclaration()
   * @generated
   * @ordered
   */
  protected boolean isDeclaration = IS_DECLARATION_EDEFAULT;

  /**
   * The cached value of the '{@link #getDeclarationStatement() <em>Declaration Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclarationStatement()
   * @generated
   * @ordered
   */
  protected DeclarationStatement declarationStatement;

  /**
   * The default value of the '{@link #isIsIfExpression() <em>Is If Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsIfExpression()
   * @generated
   * @ordered
   */
  protected static final boolean IS_IF_EXPRESSION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsIfExpression() <em>Is If Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsIfExpression()
   * @generated
   * @ordered
   */
  protected boolean isIfExpression = IS_IF_EXPRESSION_EDEFAULT;

  /**
   * The cached value of the '{@link #getIfExpression() <em>If Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfExpression()
   * @generated
   * @ordered
   */
  protected IfExpression ifExpression;

  /**
   * The default value of the '{@link #isIsForExpression() <em>Is For Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsForExpression()
   * @generated
   * @ordered
   */
  protected static final boolean IS_FOR_EXPRESSION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsForExpression() <em>Is For Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsForExpression()
   * @generated
   * @ordered
   */
  protected boolean isForExpression = IS_FOR_EXPRESSION_EDEFAULT;

  /**
   * The cached value of the '{@link #getForExpression() <em>For Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForExpression()
   * @generated
   * @ordered
   */
  protected ForExpression forExpression;

  /**
   * The default value of the '{@link #isIsWhileExpression() <em>Is While Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsWhileExpression()
   * @generated
   * @ordered
   */
  protected static final boolean IS_WHILE_EXPRESSION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsWhileExpression() <em>Is While Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsWhileExpression()
   * @generated
   * @ordered
   */
  protected boolean isWhileExpression = IS_WHILE_EXPRESSION_EDEFAULT;

  /**
   * The cached value of the '{@link #getWhileExpression() <em>While Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhileExpression()
   * @generated
   * @ordered
   */
  protected WhileExpression whileExpression;

  /**
   * The cached value of the '{@link #getAssertStatement() <em>Assert Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssertStatement()
   * @generated
   * @ordered
   */
  protected AssertStatement assertStatement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StatementImpl()
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
    return DmodelPackage.Literals.STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsAction()
  {
    return isAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsAction(boolean newIsAction)
  {
    boolean oldIsAction = isAction;
    isAction = newIsAction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.STATEMENT__IS_ACTION, oldIsAction, isAction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionStatement getActionStatement()
  {
    return actionStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActionStatement(ActionStatement newActionStatement, NotificationChain msgs)
  {
    ActionStatement oldActionStatement = actionStatement;
    actionStatement = newActionStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmodelPackage.STATEMENT__ACTION_STATEMENT, oldActionStatement, newActionStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActionStatement(ActionStatement newActionStatement)
  {
    if (newActionStatement != actionStatement)
    {
      NotificationChain msgs = null;
      if (actionStatement != null)
        msgs = ((InternalEObject)actionStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmodelPackage.STATEMENT__ACTION_STATEMENT, null, msgs);
      if (newActionStatement != null)
        msgs = ((InternalEObject)newActionStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmodelPackage.STATEMENT__ACTION_STATEMENT, null, msgs);
      msgs = basicSetActionStatement(newActionStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.STATEMENT__ACTION_STATEMENT, newActionStatement, newActionStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsChangeState()
  {
    return isChangeState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsChangeState(boolean newIsChangeState)
  {
    boolean oldIsChangeState = isChangeState;
    isChangeState = newIsChangeState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.STATEMENT__IS_CHANGE_STATE, oldIsChangeState, isChangeState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChangeStateStatement getChangeStateStatement()
  {
    return changeStateStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetChangeStateStatement(ChangeStateStatement newChangeStateStatement, NotificationChain msgs)
  {
    ChangeStateStatement oldChangeStateStatement = changeStateStatement;
    changeStateStatement = newChangeStateStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmodelPackage.STATEMENT__CHANGE_STATE_STATEMENT, oldChangeStateStatement, newChangeStateStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChangeStateStatement(ChangeStateStatement newChangeStateStatement)
  {
    if (newChangeStateStatement != changeStateStatement)
    {
      NotificationChain msgs = null;
      if (changeStateStatement != null)
        msgs = ((InternalEObject)changeStateStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmodelPackage.STATEMENT__CHANGE_STATE_STATEMENT, null, msgs);
      if (newChangeStateStatement != null)
        msgs = ((InternalEObject)newChangeStateStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmodelPackage.STATEMENT__CHANGE_STATE_STATEMENT, null, msgs);
      msgs = basicSetChangeStateStatement(newChangeStateStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.STATEMENT__CHANGE_STATE_STATEMENT, newChangeStateStatement, newChangeStateStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsDeclaration()
  {
    return isDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsDeclaration(boolean newIsDeclaration)
  {
    boolean oldIsDeclaration = isDeclaration;
    isDeclaration = newIsDeclaration;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.STATEMENT__IS_DECLARATION, oldIsDeclaration, isDeclaration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeclarationStatement getDeclarationStatement()
  {
    return declarationStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeclarationStatement(DeclarationStatement newDeclarationStatement, NotificationChain msgs)
  {
    DeclarationStatement oldDeclarationStatement = declarationStatement;
    declarationStatement = newDeclarationStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmodelPackage.STATEMENT__DECLARATION_STATEMENT, oldDeclarationStatement, newDeclarationStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclarationStatement(DeclarationStatement newDeclarationStatement)
  {
    if (newDeclarationStatement != declarationStatement)
    {
      NotificationChain msgs = null;
      if (declarationStatement != null)
        msgs = ((InternalEObject)declarationStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmodelPackage.STATEMENT__DECLARATION_STATEMENT, null, msgs);
      if (newDeclarationStatement != null)
        msgs = ((InternalEObject)newDeclarationStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmodelPackage.STATEMENT__DECLARATION_STATEMENT, null, msgs);
      msgs = basicSetDeclarationStatement(newDeclarationStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.STATEMENT__DECLARATION_STATEMENT, newDeclarationStatement, newDeclarationStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsIfExpression()
  {
    return isIfExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsIfExpression(boolean newIsIfExpression)
  {
    boolean oldIsIfExpression = isIfExpression;
    isIfExpression = newIsIfExpression;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.STATEMENT__IS_IF_EXPRESSION, oldIsIfExpression, isIfExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfExpression getIfExpression()
  {
    return ifExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIfExpression(IfExpression newIfExpression, NotificationChain msgs)
  {
    IfExpression oldIfExpression = ifExpression;
    ifExpression = newIfExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmodelPackage.STATEMENT__IF_EXPRESSION, oldIfExpression, newIfExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIfExpression(IfExpression newIfExpression)
  {
    if (newIfExpression != ifExpression)
    {
      NotificationChain msgs = null;
      if (ifExpression != null)
        msgs = ((InternalEObject)ifExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmodelPackage.STATEMENT__IF_EXPRESSION, null, msgs);
      if (newIfExpression != null)
        msgs = ((InternalEObject)newIfExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmodelPackage.STATEMENT__IF_EXPRESSION, null, msgs);
      msgs = basicSetIfExpression(newIfExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.STATEMENT__IF_EXPRESSION, newIfExpression, newIfExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsForExpression()
  {
    return isForExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsForExpression(boolean newIsForExpression)
  {
    boolean oldIsForExpression = isForExpression;
    isForExpression = newIsForExpression;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.STATEMENT__IS_FOR_EXPRESSION, oldIsForExpression, isForExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForExpression getForExpression()
  {
    return forExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForExpression(ForExpression newForExpression, NotificationChain msgs)
  {
    ForExpression oldForExpression = forExpression;
    forExpression = newForExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmodelPackage.STATEMENT__FOR_EXPRESSION, oldForExpression, newForExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForExpression(ForExpression newForExpression)
  {
    if (newForExpression != forExpression)
    {
      NotificationChain msgs = null;
      if (forExpression != null)
        msgs = ((InternalEObject)forExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmodelPackage.STATEMENT__FOR_EXPRESSION, null, msgs);
      if (newForExpression != null)
        msgs = ((InternalEObject)newForExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmodelPackage.STATEMENT__FOR_EXPRESSION, null, msgs);
      msgs = basicSetForExpression(newForExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.STATEMENT__FOR_EXPRESSION, newForExpression, newForExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsWhileExpression()
  {
    return isWhileExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsWhileExpression(boolean newIsWhileExpression)
  {
    boolean oldIsWhileExpression = isWhileExpression;
    isWhileExpression = newIsWhileExpression;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.STATEMENT__IS_WHILE_EXPRESSION, oldIsWhileExpression, isWhileExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhileExpression getWhileExpression()
  {
    return whileExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhileExpression(WhileExpression newWhileExpression, NotificationChain msgs)
  {
    WhileExpression oldWhileExpression = whileExpression;
    whileExpression = newWhileExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmodelPackage.STATEMENT__WHILE_EXPRESSION, oldWhileExpression, newWhileExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhileExpression(WhileExpression newWhileExpression)
  {
    if (newWhileExpression != whileExpression)
    {
      NotificationChain msgs = null;
      if (whileExpression != null)
        msgs = ((InternalEObject)whileExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmodelPackage.STATEMENT__WHILE_EXPRESSION, null, msgs);
      if (newWhileExpression != null)
        msgs = ((InternalEObject)newWhileExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmodelPackage.STATEMENT__WHILE_EXPRESSION, null, msgs);
      msgs = basicSetWhileExpression(newWhileExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.STATEMENT__WHILE_EXPRESSION, newWhileExpression, newWhileExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssertStatement getAssertStatement()
  {
    return assertStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssertStatement(AssertStatement newAssertStatement, NotificationChain msgs)
  {
    AssertStatement oldAssertStatement = assertStatement;
    assertStatement = newAssertStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmodelPackage.STATEMENT__ASSERT_STATEMENT, oldAssertStatement, newAssertStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssertStatement(AssertStatement newAssertStatement)
  {
    if (newAssertStatement != assertStatement)
    {
      NotificationChain msgs = null;
      if (assertStatement != null)
        msgs = ((InternalEObject)assertStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmodelPackage.STATEMENT__ASSERT_STATEMENT, null, msgs);
      if (newAssertStatement != null)
        msgs = ((InternalEObject)newAssertStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmodelPackage.STATEMENT__ASSERT_STATEMENT, null, msgs);
      msgs = basicSetAssertStatement(newAssertStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmodelPackage.STATEMENT__ASSERT_STATEMENT, newAssertStatement, newAssertStatement));
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
      case DmodelPackage.STATEMENT__ACTION_STATEMENT:
        return basicSetActionStatement(null, msgs);
      case DmodelPackage.STATEMENT__CHANGE_STATE_STATEMENT:
        return basicSetChangeStateStatement(null, msgs);
      case DmodelPackage.STATEMENT__DECLARATION_STATEMENT:
        return basicSetDeclarationStatement(null, msgs);
      case DmodelPackage.STATEMENT__IF_EXPRESSION:
        return basicSetIfExpression(null, msgs);
      case DmodelPackage.STATEMENT__FOR_EXPRESSION:
        return basicSetForExpression(null, msgs);
      case DmodelPackage.STATEMENT__WHILE_EXPRESSION:
        return basicSetWhileExpression(null, msgs);
      case DmodelPackage.STATEMENT__ASSERT_STATEMENT:
        return basicSetAssertStatement(null, msgs);
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
      case DmodelPackage.STATEMENT__IS_ACTION:
        return isIsAction();
      case DmodelPackage.STATEMENT__ACTION_STATEMENT:
        return getActionStatement();
      case DmodelPackage.STATEMENT__IS_CHANGE_STATE:
        return isIsChangeState();
      case DmodelPackage.STATEMENT__CHANGE_STATE_STATEMENT:
        return getChangeStateStatement();
      case DmodelPackage.STATEMENT__IS_DECLARATION:
        return isIsDeclaration();
      case DmodelPackage.STATEMENT__DECLARATION_STATEMENT:
        return getDeclarationStatement();
      case DmodelPackage.STATEMENT__IS_IF_EXPRESSION:
        return isIsIfExpression();
      case DmodelPackage.STATEMENT__IF_EXPRESSION:
        return getIfExpression();
      case DmodelPackage.STATEMENT__IS_FOR_EXPRESSION:
        return isIsForExpression();
      case DmodelPackage.STATEMENT__FOR_EXPRESSION:
        return getForExpression();
      case DmodelPackage.STATEMENT__IS_WHILE_EXPRESSION:
        return isIsWhileExpression();
      case DmodelPackage.STATEMENT__WHILE_EXPRESSION:
        return getWhileExpression();
      case DmodelPackage.STATEMENT__ASSERT_STATEMENT:
        return getAssertStatement();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DmodelPackage.STATEMENT__IS_ACTION:
        setIsAction((Boolean)newValue);
        return;
      case DmodelPackage.STATEMENT__ACTION_STATEMENT:
        setActionStatement((ActionStatement)newValue);
        return;
      case DmodelPackage.STATEMENT__IS_CHANGE_STATE:
        setIsChangeState((Boolean)newValue);
        return;
      case DmodelPackage.STATEMENT__CHANGE_STATE_STATEMENT:
        setChangeStateStatement((ChangeStateStatement)newValue);
        return;
      case DmodelPackage.STATEMENT__IS_DECLARATION:
        setIsDeclaration((Boolean)newValue);
        return;
      case DmodelPackage.STATEMENT__DECLARATION_STATEMENT:
        setDeclarationStatement((DeclarationStatement)newValue);
        return;
      case DmodelPackage.STATEMENT__IS_IF_EXPRESSION:
        setIsIfExpression((Boolean)newValue);
        return;
      case DmodelPackage.STATEMENT__IF_EXPRESSION:
        setIfExpression((IfExpression)newValue);
        return;
      case DmodelPackage.STATEMENT__IS_FOR_EXPRESSION:
        setIsForExpression((Boolean)newValue);
        return;
      case DmodelPackage.STATEMENT__FOR_EXPRESSION:
        setForExpression((ForExpression)newValue);
        return;
      case DmodelPackage.STATEMENT__IS_WHILE_EXPRESSION:
        setIsWhileExpression((Boolean)newValue);
        return;
      case DmodelPackage.STATEMENT__WHILE_EXPRESSION:
        setWhileExpression((WhileExpression)newValue);
        return;
      case DmodelPackage.STATEMENT__ASSERT_STATEMENT:
        setAssertStatement((AssertStatement)newValue);
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
      case DmodelPackage.STATEMENT__IS_ACTION:
        setIsAction(IS_ACTION_EDEFAULT);
        return;
      case DmodelPackage.STATEMENT__ACTION_STATEMENT:
        setActionStatement((ActionStatement)null);
        return;
      case DmodelPackage.STATEMENT__IS_CHANGE_STATE:
        setIsChangeState(IS_CHANGE_STATE_EDEFAULT);
        return;
      case DmodelPackage.STATEMENT__CHANGE_STATE_STATEMENT:
        setChangeStateStatement((ChangeStateStatement)null);
        return;
      case DmodelPackage.STATEMENT__IS_DECLARATION:
        setIsDeclaration(IS_DECLARATION_EDEFAULT);
        return;
      case DmodelPackage.STATEMENT__DECLARATION_STATEMENT:
        setDeclarationStatement((DeclarationStatement)null);
        return;
      case DmodelPackage.STATEMENT__IS_IF_EXPRESSION:
        setIsIfExpression(IS_IF_EXPRESSION_EDEFAULT);
        return;
      case DmodelPackage.STATEMENT__IF_EXPRESSION:
        setIfExpression((IfExpression)null);
        return;
      case DmodelPackage.STATEMENT__IS_FOR_EXPRESSION:
        setIsForExpression(IS_FOR_EXPRESSION_EDEFAULT);
        return;
      case DmodelPackage.STATEMENT__FOR_EXPRESSION:
        setForExpression((ForExpression)null);
        return;
      case DmodelPackage.STATEMENT__IS_WHILE_EXPRESSION:
        setIsWhileExpression(IS_WHILE_EXPRESSION_EDEFAULT);
        return;
      case DmodelPackage.STATEMENT__WHILE_EXPRESSION:
        setWhileExpression((WhileExpression)null);
        return;
      case DmodelPackage.STATEMENT__ASSERT_STATEMENT:
        setAssertStatement((AssertStatement)null);
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
      case DmodelPackage.STATEMENT__IS_ACTION:
        return isAction != IS_ACTION_EDEFAULT;
      case DmodelPackage.STATEMENT__ACTION_STATEMENT:
        return actionStatement != null;
      case DmodelPackage.STATEMENT__IS_CHANGE_STATE:
        return isChangeState != IS_CHANGE_STATE_EDEFAULT;
      case DmodelPackage.STATEMENT__CHANGE_STATE_STATEMENT:
        return changeStateStatement != null;
      case DmodelPackage.STATEMENT__IS_DECLARATION:
        return isDeclaration != IS_DECLARATION_EDEFAULT;
      case DmodelPackage.STATEMENT__DECLARATION_STATEMENT:
        return declarationStatement != null;
      case DmodelPackage.STATEMENT__IS_IF_EXPRESSION:
        return isIfExpression != IS_IF_EXPRESSION_EDEFAULT;
      case DmodelPackage.STATEMENT__IF_EXPRESSION:
        return ifExpression != null;
      case DmodelPackage.STATEMENT__IS_FOR_EXPRESSION:
        return isForExpression != IS_FOR_EXPRESSION_EDEFAULT;
      case DmodelPackage.STATEMENT__FOR_EXPRESSION:
        return forExpression != null;
      case DmodelPackage.STATEMENT__IS_WHILE_EXPRESSION:
        return isWhileExpression != IS_WHILE_EXPRESSION_EDEFAULT;
      case DmodelPackage.STATEMENT__WHILE_EXPRESSION:
        return whileExpression != null;
      case DmodelPackage.STATEMENT__ASSERT_STATEMENT:
        return assertStatement != null;
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
    result.append(" (isAction: ");
    result.append(isAction);
    result.append(", isChangeState: ");
    result.append(isChangeState);
    result.append(", isDeclaration: ");
    result.append(isDeclaration);
    result.append(", isIfExpression: ");
    result.append(isIfExpression);
    result.append(", isForExpression: ");
    result.append(isForExpression);
    result.append(", isWhileExpression: ");
    result.append(isWhileExpression);
    result.append(')');
    return result.toString();
  }

} //StatementImpl
