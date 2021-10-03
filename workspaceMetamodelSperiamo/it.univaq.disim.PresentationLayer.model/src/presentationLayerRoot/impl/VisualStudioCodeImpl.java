/**
 */
package presentationLayerRoot.impl;

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

import presentationLayerRoot.Model;
import presentationLayerRoot.PresentationLayerRootPackage;
import presentationLayerRoot.Service;
import presentationLayerRoot.UI;
import presentationLayerRoot.VisualStudioCode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visual Studio Code</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link presentationLayerRoot.impl.VisualStudioCodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link presentationLayerRoot.impl.VisualStudioCodeImpl#getModelref <em>Modelref</em>}</li>
 *   <li>{@link presentationLayerRoot.impl.VisualStudioCodeImpl#getServiceref <em>Serviceref</em>}</li>
 *   <li>{@link presentationLayerRoot.impl.VisualStudioCodeImpl#isIsReactive <em>Is Reactive</em>}</li>
 *   <li>{@link presentationLayerRoot.impl.VisualStudioCodeImpl#isIsPopup <em>Is Popup</em>}</li>
 *   <li>{@link presentationLayerRoot.impl.VisualStudioCodeImpl#isIsVIsualization <em>Is VIsualization</em>}</li>
 *   <li>{@link presentationLayerRoot.impl.VisualStudioCodeImpl#getUiref <em>Uiref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VisualStudioCodeImpl extends MinimalEObjectImpl.Container implements VisualStudioCode {
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
	 * The cached value of the '{@link #getModelref() <em>Modelref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelref()
	 * @generated
	 * @ordered
	 */
	protected EList<Model> modelref;

	/**
	 * The cached value of the '{@link #getServiceref() <em>Serviceref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceref()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> serviceref;

	/**
	 * The default value of the '{@link #isIsReactive() <em>Is Reactive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReactive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsReactive() <em>Is Reactive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReactive()
	 * @generated
	 * @ordered
	 */
	protected boolean isReactive = IS_REACTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsPopup() <em>Is Popup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPopup()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_POPUP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPopup() <em>Is Popup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPopup()
	 * @generated
	 * @ordered
	 */
	protected boolean isPopup = IS_POPUP_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsVIsualization() <em>Is VIsualization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsVIsualization()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_VISUALIZATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsVIsualization() <em>Is VIsualization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsVIsualization()
	 * @generated
	 * @ordered
	 */
	protected boolean isVIsualization = IS_VISUALIZATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUiref() <em>Uiref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUiref()
	 * @generated
	 * @ordered
	 */
	protected UI uiref;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisualStudioCodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationLayerRootPackage.Literals.VISUAL_STUDIO_CODE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationLayerRootPackage.VISUAL_STUDIO_CODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Model> getModelref() {
		if (modelref == null) {
			modelref = new EObjectContainmentEList<Model>(Model.class, this, PresentationLayerRootPackage.VISUAL_STUDIO_CODE__MODELREF);
		}
		return modelref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getServiceref() {
		if (serviceref == null) {
			serviceref = new EObjectContainmentEList<Service>(Service.class, this, PresentationLayerRootPackage.VISUAL_STUDIO_CODE__SERVICEREF);
		}
		return serviceref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsReactive() {
		return isReactive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReactive(boolean newIsReactive) {
		boolean oldIsReactive = isReactive;
		isReactive = newIsReactive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationLayerRootPackage.VISUAL_STUDIO_CODE__IS_REACTIVE, oldIsReactive, isReactive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPopup() {
		return isPopup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPopup(boolean newIsPopup) {
		boolean oldIsPopup = isPopup;
		isPopup = newIsPopup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationLayerRootPackage.VISUAL_STUDIO_CODE__IS_POPUP, oldIsPopup, isPopup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsVIsualization() {
		return isVIsualization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsVIsualization(boolean newIsVIsualization) {
		boolean oldIsVIsualization = isVIsualization;
		isVIsualization = newIsVIsualization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationLayerRootPackage.VISUAL_STUDIO_CODE__IS_VISUALIZATION, oldIsVIsualization, isVIsualization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI getUiref() {
		return uiref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUiref(UI newUiref, NotificationChain msgs) {
		UI oldUiref = uiref;
		uiref = newUiref;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PresentationLayerRootPackage.VISUAL_STUDIO_CODE__UIREF, oldUiref, newUiref);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUiref(UI newUiref) {
		if (newUiref != uiref) {
			NotificationChain msgs = null;
			if (uiref != null)
				msgs = ((InternalEObject)uiref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PresentationLayerRootPackage.VISUAL_STUDIO_CODE__UIREF, null, msgs);
			if (newUiref != null)
				msgs = ((InternalEObject)newUiref).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PresentationLayerRootPackage.VISUAL_STUDIO_CODE__UIREF, null, msgs);
			msgs = basicSetUiref(newUiref, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationLayerRootPackage.VISUAL_STUDIO_CODE__UIREF, newUiref, newUiref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PresentationLayerRootPackage.VISUAL_STUDIO_CODE__MODELREF:
				return ((InternalEList<?>)getModelref()).basicRemove(otherEnd, msgs);
			case PresentationLayerRootPackage.VISUAL_STUDIO_CODE__SERVICEREF:
				return ((InternalEList<?>)getServiceref()).basicRemove(otherEnd, msgs);
			case PresentationLayerRootPackage.VISUAL_STUDIO_CODE__UIREF:
				return basicSetUiref(null, msgs);
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
			case PresentationLayerRootPackage.VISUAL_STUDIO_CODE__NAME:
				return getName();
			case PresentationLayerRootPackage.VISUAL_STUDIO_CODE__MODELREF:
				return getModelref();
			case PresentationLayerRootPackage.VISUAL_STUDIO_CODE__SERVICEREF:
				return getServiceref();
			case PresentationLayerRootPackage.VISUAL_STUDIO_CODE__IS_REACTIVE:
				return isIsReactive();
			case PresentationLayerRootPackage.VISUAL_STUDIO_CODE__IS_POPUP:
				return isIsPopup();
			case PresentationLayerRootPackage.VISUAL_STUDIO_CODE__IS_VISUALIZATION:
				return isIsVIsualization();
			case PresentationLayerRootPackage.VISUAL_STUDIO_CODE__UIREF:
				return getUiref();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PresentationLayerRootPackage.VISUAL_STUDIO_CODE__NAME:
				setName((String)newValue);
				return;
			case PresentationLayerRootPackage.VISUAL_STUDIO_CODE__MODELREF:
				getModelref().clear();
				getModelref().addAll((Collection<? extends Model>)newValue);
				return;
			case PresentationLayerRootPackage.VISUAL_STUDIO_CODE__SERVICEREF:
				getServiceref().clear();
				getServiceref().addAll((Collection<? extends Service>)newValue);
				return;
			case PresentationLayerRootPackage.VISUAL_STUDIO_CODE__IS_REACTIVE:
				setIsReactive((Boolean)newValue);
				return;
			case PresentationLayerRootPackage.VISUAL_STUDIO_CODE__IS_POPUP:
				setIsPopup((Boolean)newValue);
				return;
			case PresentationLayerRootPackage.VISUAL_STUDIO_CODE__IS_VISUALIZATION:
				setIsVIsualization((Boolean)newValue);
				return;
			case PresentationLayerRootPackage.VISUAL_STUDIO_CODE__UIREF:
				setUiref((UI)newValue);
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
			case PresentationLayerRootPackage.VISUAL_STUDIO_CODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PresentationLayerRootPackage.VISUAL_STUDIO_CODE__MODELREF:
				getModelref().clear();
				return;
			case PresentationLayerRootPackage.VISUAL_STUDIO_CODE__SERVICEREF:
				getServiceref().clear();
				return;
			case PresentationLayerRootPackage.VISUAL_STUDIO_CODE__IS_REACTIVE:
				setIsReactive(IS_REACTIVE_EDEFAULT);
				return;
			case PresentationLayerRootPackage.VISUAL_STUDIO_CODE__IS_POPUP:
				setIsPopup(IS_POPUP_EDEFAULT);
				return;
			case PresentationLayerRootPackage.VISUAL_STUDIO_CODE__IS_VISUALIZATION:
				setIsVIsualization(IS_VISUALIZATION_EDEFAULT);
				return;
			case PresentationLayerRootPackage.VISUAL_STUDIO_CODE__UIREF:
				setUiref((UI)null);
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
			case PresentationLayerRootPackage.VISUAL_STUDIO_CODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PresentationLayerRootPackage.VISUAL_STUDIO_CODE__MODELREF:
				return modelref != null && !modelref.isEmpty();
			case PresentationLayerRootPackage.VISUAL_STUDIO_CODE__SERVICEREF:
				return serviceref != null && !serviceref.isEmpty();
			case PresentationLayerRootPackage.VISUAL_STUDIO_CODE__IS_REACTIVE:
				return isReactive != IS_REACTIVE_EDEFAULT;
			case PresentationLayerRootPackage.VISUAL_STUDIO_CODE__IS_POPUP:
				return isPopup != IS_POPUP_EDEFAULT;
			case PresentationLayerRootPackage.VISUAL_STUDIO_CODE__IS_VISUALIZATION:
				return isVIsualization != IS_VISUALIZATION_EDEFAULT;
			case PresentationLayerRootPackage.VISUAL_STUDIO_CODE__UIREF:
				return uiref != null;
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
		result.append(", isReactive: ");
		result.append(isReactive);
		result.append(", isPopup: ");
		result.append(isPopup);
		result.append(", isVIsualization: ");
		result.append(isVIsualization);
		result.append(')');
		return result.toString();
	}

} //VisualStudioCodeImpl
