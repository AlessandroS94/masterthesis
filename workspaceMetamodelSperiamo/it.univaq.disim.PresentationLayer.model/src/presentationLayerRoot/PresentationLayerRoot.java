/**
 */
package presentationLayerRoot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Presentation Layer Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link presentationLayerRoot.PresentationLayerRoot#getName <em>Name</em>}</li>
 *   <li>{@link presentationLayerRoot.PresentationLayerRoot#getVisualstudiocoderef <em>Visualstudiocoderef</em>}</li>
 * </ul>
 *
 * @see presentationLayerRoot.PresentationLayerRootPackage#getPresentationLayerRoot()
 * @model
 * @generated
 */
public interface PresentationLayerRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see presentationLayerRoot.PresentationLayerRootPackage#getPresentationLayerRoot_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link presentationLayerRoot.PresentationLayerRoot#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Visualstudiocoderef</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visualstudiocoderef</em>' containment reference.
	 * @see #setVisualstudiocoderef(VisualStudioCode)
	 * @see presentationLayerRoot.PresentationLayerRootPackage#getPresentationLayerRoot_Visualstudiocoderef()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VisualStudioCode getVisualstudiocoderef();

	/**
	 * Sets the value of the '{@link presentationLayerRoot.PresentationLayerRoot#getVisualstudiocoderef <em>Visualstudiocoderef</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visualstudiocoderef</em>' containment reference.
	 * @see #getVisualstudiocoderef()
	 * @generated
	 */
	void setVisualstudiocoderef(VisualStudioCode value);

} // PresentationLayerRoot
