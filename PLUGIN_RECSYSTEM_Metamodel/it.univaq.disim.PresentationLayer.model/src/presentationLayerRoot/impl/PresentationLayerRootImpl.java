/**
 */
package presentationLayerRoot.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import presentationLayerRoot.PresentationLayerRoot;
import presentationLayerRoot.PresentationLayerRootPackage;
import presentationLayerRoot.VisualStudioCode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Presentation Layer Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link presentationLayerRoot.impl.PresentationLayerRootImpl#getName <em>Name</em>}</li>
 *   <li>{@link presentationLayerRoot.impl.PresentationLayerRootImpl#getVisualstudiocoderef <em>Visualstudiocoderef</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PresentationLayerRootImpl extends MinimalEObjectImpl.Container implements PresentationLayerRoot {
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
	 * The cached value of the '{@link #getVisualstudiocoderef() <em>Visualstudiocoderef</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualstudiocoderef()
	 * @generated
	 * @ordered
	 */
	protected VisualStudioCode visualstudiocoderef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PresentationLayerRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationLayerRootPackage.Literals.PRESENTATION_LAYER_ROOT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationLayerRootPackage.PRESENTATION_LAYER_ROOT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualStudioCode getVisualstudiocoderef() {
		return visualstudiocoderef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVisualstudiocoderef(VisualStudioCode newVisualstudiocoderef, NotificationChain msgs) {
		VisualStudioCode oldVisualstudiocoderef = visualstudiocoderef;
		visualstudiocoderef = newVisualstudiocoderef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PresentationLayerRootPackage.PRESENTATION_LAYER_ROOT__VISUALSTUDIOCODEREF, oldVisualstudiocoderef, newVisualstudiocoderef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisualstudiocoderef(VisualStudioCode newVisualstudiocoderef) {
		if (newVisualstudiocoderef != visualstudiocoderef) {
			NotificationChain msgs = null;
			if (visualstudiocoderef != null)
				msgs = ((InternalEObject)visualstudiocoderef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PresentationLayerRootPackage.PRESENTATION_LAYER_ROOT__VISUALSTUDIOCODEREF, null, msgs);
			if (newVisualstudiocoderef != null)
				msgs = ((InternalEObject)newVisualstudiocoderef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PresentationLayerRootPackage.PRESENTATION_LAYER_ROOT__VISUALSTUDIOCODEREF, null, msgs);
			msgs = basicSetVisualstudiocoderef(newVisualstudiocoderef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationLayerRootPackage.PRESENTATION_LAYER_ROOT__VISUALSTUDIOCODEREF, newVisualstudiocoderef, newVisualstudiocoderef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PresentationLayerRootPackage.PRESENTATION_LAYER_ROOT__VISUALSTUDIOCODEREF:
				return basicSetVisualstudiocoderef(null, msgs);
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
			case PresentationLayerRootPackage.PRESENTATION_LAYER_ROOT__NAME:
				return getName();
			case PresentationLayerRootPackage.PRESENTATION_LAYER_ROOT__VISUALSTUDIOCODEREF:
				return getVisualstudiocoderef();
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
			case PresentationLayerRootPackage.PRESENTATION_LAYER_ROOT__NAME:
				setName((String)newValue);
				return;
			case PresentationLayerRootPackage.PRESENTATION_LAYER_ROOT__VISUALSTUDIOCODEREF:
				setVisualstudiocoderef((VisualStudioCode)newValue);
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
			case PresentationLayerRootPackage.PRESENTATION_LAYER_ROOT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PresentationLayerRootPackage.PRESENTATION_LAYER_ROOT__VISUALSTUDIOCODEREF:
				setVisualstudiocoderef((VisualStudioCode)null);
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
			case PresentationLayerRootPackage.PRESENTATION_LAYER_ROOT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PresentationLayerRootPackage.PRESENTATION_LAYER_ROOT__VISUALSTUDIOCODEREF:
				return visualstudiocoderef != null;
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
		result.append(')');
		return result.toString();
	}

} //PresentationLayerRootImpl
