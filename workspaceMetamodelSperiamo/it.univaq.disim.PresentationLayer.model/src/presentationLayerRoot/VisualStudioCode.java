/**
 */
package presentationLayerRoot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visual Studio Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link presentationLayerRoot.VisualStudioCode#getName <em>Name</em>}</li>
 *   <li>{@link presentationLayerRoot.VisualStudioCode#getModelref <em>Modelref</em>}</li>
 *   <li>{@link presentationLayerRoot.VisualStudioCode#getServiceref <em>Serviceref</em>}</li>
 *   <li>{@link presentationLayerRoot.VisualStudioCode#isIsReactive <em>Is Reactive</em>}</li>
 *   <li>{@link presentationLayerRoot.VisualStudioCode#isIsPopup <em>Is Popup</em>}</li>
 *   <li>{@link presentationLayerRoot.VisualStudioCode#isIsVIsualization <em>Is VIsualization</em>}</li>
 *   <li>{@link presentationLayerRoot.VisualStudioCode#getUiref <em>Uiref</em>}</li>
 * </ul>
 *
 * @see presentationLayerRoot.PresentationLayerRootPackage#getVisualStudioCode()
 * @model
 * @generated
 */
public interface VisualStudioCode extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see presentationLayerRoot.PresentationLayerRootPackage#getVisualStudioCode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link presentationLayerRoot.VisualStudioCode#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Modelref</b></em>' containment reference list.
	 * The list contents are of type {@link presentationLayerRoot.Model}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modelref</em>' containment reference list.
	 * @see presentationLayerRoot.PresentationLayerRootPackage#getVisualStudioCode_Modelref()
	 * @model containment="true"
	 * @generated
	 */
	EList<Model> getModelref();

	/**
	 * Returns the value of the '<em><b>Serviceref</b></em>' containment reference list.
	 * The list contents are of type {@link presentationLayerRoot.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serviceref</em>' containment reference list.
	 * @see presentationLayerRoot.PresentationLayerRootPackage#getVisualStudioCode_Serviceref()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getServiceref();

	/**
	 * Returns the value of the '<em><b>Is Reactive</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Reactive</em>' attribute.
	 * @see #setIsReactive(boolean)
	 * @see presentationLayerRoot.PresentationLayerRootPackage#getVisualStudioCode_IsReactive()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsReactive();

	/**
	 * Sets the value of the '{@link presentationLayerRoot.VisualStudioCode#isIsReactive <em>Is Reactive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Reactive</em>' attribute.
	 * @see #isIsReactive()
	 * @generated
	 */
	void setIsReactive(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Popup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Popup</em>' attribute.
	 * @see #setIsPopup(boolean)
	 * @see presentationLayerRoot.PresentationLayerRootPackage#getVisualStudioCode_IsPopup()
	 * @model
	 * @generated
	 */
	boolean isIsPopup();

	/**
	 * Sets the value of the '{@link presentationLayerRoot.VisualStudioCode#isIsPopup <em>Is Popup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Popup</em>' attribute.
	 * @see #isIsPopup()
	 * @generated
	 */
	void setIsPopup(boolean value);

	/**
	 * Returns the value of the '<em><b>Is VIsualization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is VIsualization</em>' attribute.
	 * @see #setIsVIsualization(boolean)
	 * @see presentationLayerRoot.PresentationLayerRootPackage#getVisualStudioCode_IsVIsualization()
	 * @model
	 * @generated
	 */
	boolean isIsVIsualization();

	/**
	 * Sets the value of the '{@link presentationLayerRoot.VisualStudioCode#isIsVIsualization <em>Is VIsualization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is VIsualization</em>' attribute.
	 * @see #isIsVIsualization()
	 * @generated
	 */
	void setIsVIsualization(boolean value);

	/**
	 * Returns the value of the '<em><b>Uiref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uiref</em>' containment reference.
	 * @see #setUiref(UI)
	 * @see presentationLayerRoot.PresentationLayerRootPackage#getVisualStudioCode_Uiref()
	 * @model containment="true"
	 * @generated
	 */
	UI getUiref();

	/**
	 * Sets the value of the '{@link presentationLayerRoot.VisualStudioCode#getUiref <em>Uiref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uiref</em>' containment reference.
	 * @see #getUiref()
	 * @generated
	 */
	void setUiref(UI value);

} // VisualStudioCode
