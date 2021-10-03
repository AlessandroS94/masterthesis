/**
 */
package presentationLayerRoot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link presentationLayerRoot.UI#getName <em>Name</em>}</li>
 *   <li>{@link presentationLayerRoot.UI#getComponentref <em>Componentref</em>}</li>
 *   <li>{@link presentationLayerRoot.UI#isIsTrasformative <em>Is Trasformative</em>}</li>
 *   <li>{@link presentationLayerRoot.UI#isIsDashoboard <em>Is Dashoboard</em>}</li>
 * </ul>
 *
 * @see presentationLayerRoot.PresentationLayerRootPackage#getUI()
 * @model
 * @generated
 */
public interface UI extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see presentationLayerRoot.PresentationLayerRootPackage#getUI_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link presentationLayerRoot.UI#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Componentref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Componentref</em>' containment reference.
	 * @see #setComponentref(Component)
	 * @see presentationLayerRoot.PresentationLayerRootPackage#getUI_Componentref()
	 * @model containment="true"
	 * @generated
	 */
	Component getComponentref();

	/**
	 * Sets the value of the '{@link presentationLayerRoot.UI#getComponentref <em>Componentref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Componentref</em>' containment reference.
	 * @see #getComponentref()
	 * @generated
	 */
	void setComponentref(Component value);

	/**
	 * Returns the value of the '<em><b>Is Trasformative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Trasformative</em>' attribute.
	 * @see #setIsTrasformative(boolean)
	 * @see presentationLayerRoot.PresentationLayerRootPackage#getUI_IsTrasformative()
	 * @model
	 * @generated
	 */
	boolean isIsTrasformative();

	/**
	 * Sets the value of the '{@link presentationLayerRoot.UI#isIsTrasformative <em>Is Trasformative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Trasformative</em>' attribute.
	 * @see #isIsTrasformative()
	 * @generated
	 */
	void setIsTrasformative(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Dashoboard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Dashoboard</em>' attribute.
	 * @see #setIsDashoboard(boolean)
	 * @see presentationLayerRoot.PresentationLayerRootPackage#getUI_IsDashoboard()
	 * @model
	 * @generated
	 */
	boolean isIsDashoboard();

	/**
	 * Sets the value of the '{@link presentationLayerRoot.UI#isIsDashoboard <em>Is Dashoboard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Dashoboard</em>' attribute.
	 * @see #isIsDashoboard()
	 * @generated
	 */
	void setIsDashoboard(boolean value);

} // UI
