/**
 */
package presentationLayerRoot.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import presentationLayerRoot.Component;
import presentationLayerRoot.PresentationLayerRootPackage;
import presentationLayerRoot.UI;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link presentationLayerRoot.impl.UIImpl#getName <em>Name</em>}</li>
 *   <li>{@link presentationLayerRoot.impl.UIImpl#getComponentref <em>Componentref</em>}</li>
 *   <li>{@link presentationLayerRoot.impl.UIImpl#isIsTrasformative <em>Is Trasformative</em>}</li>
 *   <li>{@link presentationLayerRoot.impl.UIImpl#isIsDashoboard <em>Is Dashoboard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UIImpl extends MinimalEObjectImpl.Container implements UI {
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
	 * The cached value of the '{@link #getComponentref() <em>Componentref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentref()
	 * @generated
	 * @ordered
	 */
	protected Component componentref;

	/**
	 * The default value of the '{@link #isIsTrasformative() <em>Is Trasformative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTrasformative()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TRASFORMATIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsTrasformative() <em>Is Trasformative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTrasformative()
	 * @generated
	 * @ordered
	 */
	protected boolean isTrasformative = IS_TRASFORMATIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDashoboard() <em>Is Dashoboard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDashoboard()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DASHOBOARD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDashoboard() <em>Is Dashoboard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDashoboard()
	 * @generated
	 * @ordered
	 */
	protected boolean isDashoboard = IS_DASHOBOARD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationLayerRootPackage.Literals.UI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationLayerRootPackage.UI__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getComponentref() {
		return componentref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentref(Component newComponentref, NotificationChain msgs) {
		Component oldComponentref = componentref;
		componentref = newComponentref;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PresentationLayerRootPackage.UI__COMPONENTREF, oldComponentref, newComponentref);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentref(Component newComponentref) {
		if (newComponentref != componentref) {
			NotificationChain msgs = null;
			if (componentref != null)
				msgs = ((InternalEObject)componentref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PresentationLayerRootPackage.UI__COMPONENTREF, null, msgs);
			if (newComponentref != null)
				msgs = ((InternalEObject)newComponentref).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PresentationLayerRootPackage.UI__COMPONENTREF, null, msgs);
			msgs = basicSetComponentref(newComponentref, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationLayerRootPackage.UI__COMPONENTREF, newComponentref, newComponentref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsTrasformative() {
		return isTrasformative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTrasformative(boolean newIsTrasformative) {
		boolean oldIsTrasformative = isTrasformative;
		isTrasformative = newIsTrasformative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationLayerRootPackage.UI__IS_TRASFORMATIVE, oldIsTrasformative, isTrasformative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDashoboard() {
		return isDashoboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDashoboard(boolean newIsDashoboard) {
		boolean oldIsDashoboard = isDashoboard;
		isDashoboard = newIsDashoboard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationLayerRootPackage.UI__IS_DASHOBOARD, oldIsDashoboard, isDashoboard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PresentationLayerRootPackage.UI__COMPONENTREF:
				return basicSetComponentref(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PresentationLayerRootPackage.UI__NAME:
				return getName();
			case PresentationLayerRootPackage.UI__COMPONENTREF:
				return getComponentref();
			case PresentationLayerRootPackage.UI__IS_TRASFORMATIVE:
				return isIsTrasformative();
			case PresentationLayerRootPackage.UI__IS_DASHOBOARD:
				return isIsDashoboard();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PresentationLayerRootPackage.UI__NAME:
				setName((String)newValue);
				return;
			case PresentationLayerRootPackage.UI__COMPONENTREF:
				setComponentref((Component)newValue);
				return;
			case PresentationLayerRootPackage.UI__IS_TRASFORMATIVE:
				setIsTrasformative((Boolean)newValue);
				return;
			case PresentationLayerRootPackage.UI__IS_DASHOBOARD:
				setIsDashoboard((Boolean)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case PresentationLayerRootPackage.UI__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PresentationLayerRootPackage.UI__COMPONENTREF:
				setComponentref((Component)null);
				return;
			case PresentationLayerRootPackage.UI__IS_TRASFORMATIVE:
				setIsTrasformative(IS_TRASFORMATIVE_EDEFAULT);
				return;
			case PresentationLayerRootPackage.UI__IS_DASHOBOARD:
				setIsDashoboard(IS_DASHOBOARD_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PresentationLayerRootPackage.UI__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PresentationLayerRootPackage.UI__COMPONENTREF:
				return componentref != null;
			case PresentationLayerRootPackage.UI__IS_TRASFORMATIVE:
				return isTrasformative != IS_TRASFORMATIVE_EDEFAULT;
			case PresentationLayerRootPackage.UI__IS_DASHOBOARD:
				return isDashoboard != IS_DASHOBOARD_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", isTrasformative: ");
		result.append(isTrasformative);
		result.append(", isDashoboard: ");
		result.append(isDashoboard);
		result.append(')');
		return result.toString();
	}

} //UIImpl
