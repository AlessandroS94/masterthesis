/**
 */
package presentationLayerRoot;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see presentationLayerRoot.PresentationLayerRootFactory
 * @model kind="package"
 * @generated
 */
public interface PresentationLayerRootPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "presentationLayerRoot";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://model.org/presentationLayer";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "presentationLayerRoot";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PresentationLayerRootPackage eINSTANCE = presentationLayerRoot.impl.PresentationLayerRootPackageImpl.init();

	/**
	 * The meta object id for the '{@link presentationLayerRoot.impl.PresentationLayerRootImpl <em>Presentation Layer Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see presentationLayerRoot.impl.PresentationLayerRootImpl
	 * @see presentationLayerRoot.impl.PresentationLayerRootPackageImpl#getPresentationLayerRoot()
	 * @generated
	 */
	int PRESENTATION_LAYER_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_LAYER_ROOT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Visualstudiocoderef</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_LAYER_ROOT__VISUALSTUDIOCODEREF = 1;

	/**
	 * The number of structural features of the '<em>Presentation Layer Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_LAYER_ROOT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Presentation Layer Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_LAYER_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link presentationLayerRoot.impl.VisualStudioCodeImpl <em>Visual Studio Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see presentationLayerRoot.impl.VisualStudioCodeImpl
	 * @see presentationLayerRoot.impl.PresentationLayerRootPackageImpl#getVisualStudioCode()
	 * @generated
	 */
	int VISUAL_STUDIO_CODE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_STUDIO_CODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Modelref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_STUDIO_CODE__MODELREF = 1;

	/**
	 * The feature id for the '<em><b>Serviceref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_STUDIO_CODE__SERVICEREF = 2;

	/**
	 * The feature id for the '<em><b>Is Reactive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_STUDIO_CODE__IS_REACTIVE = 3;

	/**
	 * The feature id for the '<em><b>Is Popup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_STUDIO_CODE__IS_POPUP = 4;

	/**
	 * The feature id for the '<em><b>Is VIsualization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_STUDIO_CODE__IS_VISUALIZATION = 5;

	/**
	 * The feature id for the '<em><b>Uiref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_STUDIO_CODE__UIREF = 6;

	/**
	 * The number of structural features of the '<em>Visual Studio Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_STUDIO_CODE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Visual Studio Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_STUDIO_CODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link presentationLayerRoot.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see presentationLayerRoot.impl.ModelImpl
	 * @see presentationLayerRoot.impl.PresentationLayerRootPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link presentationLayerRoot.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see presentationLayerRoot.impl.ServiceImpl
	 * @see presentationLayerRoot.impl.PresentationLayerRootPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link presentationLayerRoot.impl.UIImpl <em>UI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see presentationLayerRoot.impl.UIImpl
	 * @see presentationLayerRoot.impl.PresentationLayerRootPackageImpl#getUI()
	 * @generated
	 */
	int UI = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__NAME = 0;

	/**
	 * The feature id for the '<em><b>Componentref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__COMPONENTREF = 1;

	/**
	 * The feature id for the '<em><b>Is Trasformative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__IS_TRASFORMATIVE = 2;

	/**
	 * The feature id for the '<em><b>Is Dashoboard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__IS_DASHOBOARD = 3;

	/**
	 * The number of structural features of the '<em>UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link presentationLayerRoot.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see presentationLayerRoot.impl.ComponentImpl
	 * @see presentationLayerRoot.impl.PresentationLayerRootPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link presentationLayerRoot.PresentationLayerRoot <em>Presentation Layer Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Presentation Layer Root</em>'.
	 * @see presentationLayerRoot.PresentationLayerRoot
	 * @generated
	 */
	EClass getPresentationLayerRoot();

	/**
	 * Returns the meta object for the attribute '{@link presentationLayerRoot.PresentationLayerRoot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see presentationLayerRoot.PresentationLayerRoot#getName()
	 * @see #getPresentationLayerRoot()
	 * @generated
	 */
	EAttribute getPresentationLayerRoot_Name();

	/**
	 * Returns the meta object for the containment reference '{@link presentationLayerRoot.PresentationLayerRoot#getVisualstudiocoderef <em>Visualstudiocoderef</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Visualstudiocoderef</em>'.
	 * @see presentationLayerRoot.PresentationLayerRoot#getVisualstudiocoderef()
	 * @see #getPresentationLayerRoot()
	 * @generated
	 */
	EReference getPresentationLayerRoot_Visualstudiocoderef();

	/**
	 * Returns the meta object for class '{@link presentationLayerRoot.VisualStudioCode <em>Visual Studio Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visual Studio Code</em>'.
	 * @see presentationLayerRoot.VisualStudioCode
	 * @generated
	 */
	EClass getVisualStudioCode();

	/**
	 * Returns the meta object for the attribute '{@link presentationLayerRoot.VisualStudioCode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see presentationLayerRoot.VisualStudioCode#getName()
	 * @see #getVisualStudioCode()
	 * @generated
	 */
	EAttribute getVisualStudioCode_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link presentationLayerRoot.VisualStudioCode#getModelref <em>Modelref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modelref</em>'.
	 * @see presentationLayerRoot.VisualStudioCode#getModelref()
	 * @see #getVisualStudioCode()
	 * @generated
	 */
	EReference getVisualStudioCode_Modelref();

	/**
	 * Returns the meta object for the containment reference list '{@link presentationLayerRoot.VisualStudioCode#getServiceref <em>Serviceref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Serviceref</em>'.
	 * @see presentationLayerRoot.VisualStudioCode#getServiceref()
	 * @see #getVisualStudioCode()
	 * @generated
	 */
	EReference getVisualStudioCode_Serviceref();

	/**
	 * Returns the meta object for the attribute '{@link presentationLayerRoot.VisualStudioCode#isIsReactive <em>Is Reactive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Reactive</em>'.
	 * @see presentationLayerRoot.VisualStudioCode#isIsReactive()
	 * @see #getVisualStudioCode()
	 * @generated
	 */
	EAttribute getVisualStudioCode_IsReactive();

	/**
	 * Returns the meta object for the attribute '{@link presentationLayerRoot.VisualStudioCode#isIsPopup <em>Is Popup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Popup</em>'.
	 * @see presentationLayerRoot.VisualStudioCode#isIsPopup()
	 * @see #getVisualStudioCode()
	 * @generated
	 */
	EAttribute getVisualStudioCode_IsPopup();

	/**
	 * Returns the meta object for the attribute '{@link presentationLayerRoot.VisualStudioCode#isIsVIsualization <em>Is VIsualization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is VIsualization</em>'.
	 * @see presentationLayerRoot.VisualStudioCode#isIsVIsualization()
	 * @see #getVisualStudioCode()
	 * @generated
	 */
	EAttribute getVisualStudioCode_IsVIsualization();

	/**
	 * Returns the meta object for the containment reference '{@link presentationLayerRoot.VisualStudioCode#getUiref <em>Uiref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uiref</em>'.
	 * @see presentationLayerRoot.VisualStudioCode#getUiref()
	 * @see #getVisualStudioCode()
	 * @generated
	 */
	EReference getVisualStudioCode_Uiref();

	/**
	 * Returns the meta object for class '{@link presentationLayerRoot.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see presentationLayerRoot.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link presentationLayerRoot.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see presentationLayerRoot.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for class '{@link presentationLayerRoot.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see presentationLayerRoot.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link presentationLayerRoot.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see presentationLayerRoot.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name();

	/**
	 * Returns the meta object for class '{@link presentationLayerRoot.UI <em>UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI</em>'.
	 * @see presentationLayerRoot.UI
	 * @generated
	 */
	EClass getUI();

	/**
	 * Returns the meta object for the attribute '{@link presentationLayerRoot.UI#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see presentationLayerRoot.UI#getName()
	 * @see #getUI()
	 * @generated
	 */
	EAttribute getUI_Name();

	/**
	 * Returns the meta object for the containment reference '{@link presentationLayerRoot.UI#getComponentref <em>Componentref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Componentref</em>'.
	 * @see presentationLayerRoot.UI#getComponentref()
	 * @see #getUI()
	 * @generated
	 */
	EReference getUI_Componentref();

	/**
	 * Returns the meta object for the attribute '{@link presentationLayerRoot.UI#isIsTrasformative <em>Is Trasformative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Trasformative</em>'.
	 * @see presentationLayerRoot.UI#isIsTrasformative()
	 * @see #getUI()
	 * @generated
	 */
	EAttribute getUI_IsTrasformative();

	/**
	 * Returns the meta object for the attribute '{@link presentationLayerRoot.UI#isIsDashoboard <em>Is Dashoboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Dashoboard</em>'.
	 * @see presentationLayerRoot.UI#isIsDashoboard()
	 * @see #getUI()
	 * @generated
	 */
	EAttribute getUI_IsDashoboard();

	/**
	 * Returns the meta object for class '{@link presentationLayerRoot.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see presentationLayerRoot.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link presentationLayerRoot.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see presentationLayerRoot.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PresentationLayerRootFactory getPresentationLayerRootFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link presentationLayerRoot.impl.PresentationLayerRootImpl <em>Presentation Layer Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see presentationLayerRoot.impl.PresentationLayerRootImpl
		 * @see presentationLayerRoot.impl.PresentationLayerRootPackageImpl#getPresentationLayerRoot()
		 * @generated
		 */
		EClass PRESENTATION_LAYER_ROOT = eINSTANCE.getPresentationLayerRoot();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION_LAYER_ROOT__NAME = eINSTANCE.getPresentationLayerRoot_Name();

		/**
		 * The meta object literal for the '<em><b>Visualstudiocoderef</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENTATION_LAYER_ROOT__VISUALSTUDIOCODEREF = eINSTANCE.getPresentationLayerRoot_Visualstudiocoderef();

		/**
		 * The meta object literal for the '{@link presentationLayerRoot.impl.VisualStudioCodeImpl <em>Visual Studio Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see presentationLayerRoot.impl.VisualStudioCodeImpl
		 * @see presentationLayerRoot.impl.PresentationLayerRootPackageImpl#getVisualStudioCode()
		 * @generated
		 */
		EClass VISUAL_STUDIO_CODE = eINSTANCE.getVisualStudioCode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUAL_STUDIO_CODE__NAME = eINSTANCE.getVisualStudioCode_Name();

		/**
		 * The meta object literal for the '<em><b>Modelref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISUAL_STUDIO_CODE__MODELREF = eINSTANCE.getVisualStudioCode_Modelref();

		/**
		 * The meta object literal for the '<em><b>Serviceref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISUAL_STUDIO_CODE__SERVICEREF = eINSTANCE.getVisualStudioCode_Serviceref();

		/**
		 * The meta object literal for the '<em><b>Is Reactive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUAL_STUDIO_CODE__IS_REACTIVE = eINSTANCE.getVisualStudioCode_IsReactive();

		/**
		 * The meta object literal for the '<em><b>Is Popup</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUAL_STUDIO_CODE__IS_POPUP = eINSTANCE.getVisualStudioCode_IsPopup();

		/**
		 * The meta object literal for the '<em><b>Is VIsualization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUAL_STUDIO_CODE__IS_VISUALIZATION = eINSTANCE.getVisualStudioCode_IsVIsualization();

		/**
		 * The meta object literal for the '<em><b>Uiref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISUAL_STUDIO_CODE__UIREF = eINSTANCE.getVisualStudioCode_Uiref();

		/**
		 * The meta object literal for the '{@link presentationLayerRoot.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see presentationLayerRoot.impl.ModelImpl
		 * @see presentationLayerRoot.impl.PresentationLayerRootPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

		/**
		 * The meta object literal for the '{@link presentationLayerRoot.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see presentationLayerRoot.impl.ServiceImpl
		 * @see presentationLayerRoot.impl.PresentationLayerRootPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

		/**
		 * The meta object literal for the '{@link presentationLayerRoot.impl.UIImpl <em>UI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see presentationLayerRoot.impl.UIImpl
		 * @see presentationLayerRoot.impl.PresentationLayerRootPackageImpl#getUI()
		 * @generated
		 */
		EClass UI = eINSTANCE.getUI();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI__NAME = eINSTANCE.getUI_Name();

		/**
		 * The meta object literal for the '<em><b>Componentref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI__COMPONENTREF = eINSTANCE.getUI_Componentref();

		/**
		 * The meta object literal for the '<em><b>Is Trasformative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI__IS_TRASFORMATIVE = eINSTANCE.getUI_IsTrasformative();

		/**
		 * The meta object literal for the '<em><b>Is Dashoboard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI__IS_DASHOBOARD = eINSTANCE.getUI_IsDashoboard();

		/**
		 * The meta object literal for the '{@link presentationLayerRoot.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see presentationLayerRoot.impl.ComponentImpl
		 * @see presentationLayerRoot.impl.PresentationLayerRootPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

	}

} //PresentationLayerRootPackage
