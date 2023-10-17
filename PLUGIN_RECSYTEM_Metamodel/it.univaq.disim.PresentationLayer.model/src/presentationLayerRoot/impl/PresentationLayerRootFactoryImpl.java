/**
 */
package presentationLayerRoot.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import presentationLayerRoot.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PresentationLayerRootFactoryImpl extends EFactoryImpl implements PresentationLayerRootFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PresentationLayerRootFactory init() {
		try {
			PresentationLayerRootFactory thePresentationLayerRootFactory = (PresentationLayerRootFactory)EPackage.Registry.INSTANCE.getEFactory(PresentationLayerRootPackage.eNS_URI);
			if (thePresentationLayerRootFactory != null) {
				return thePresentationLayerRootFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PresentationLayerRootFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationLayerRootFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PresentationLayerRootPackage.PRESENTATION_LAYER_ROOT: return createPresentationLayerRoot();
			case PresentationLayerRootPackage.VISUAL_STUDIO_CODE: return createVisualStudioCode();
			case PresentationLayerRootPackage.MODEL: return createModel();
			case PresentationLayerRootPackage.SERVICE: return createService();
			case PresentationLayerRootPackage.UI: return createUI();
			case PresentationLayerRootPackage.COMPONENT: return createComponent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationLayerRoot createPresentationLayerRoot() {
		PresentationLayerRootImpl presentationLayerRoot = new PresentationLayerRootImpl();
		return presentationLayerRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualStudioCode createVisualStudioCode() {
		VisualStudioCodeImpl visualStudioCode = new VisualStudioCodeImpl();
		return visualStudioCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI createUI() {
		UIImpl ui = new UIImpl();
		return ui;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationLayerRootPackage getPresentationLayerRootPackage() {
		return (PresentationLayerRootPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PresentationLayerRootPackage getPackage() {
		return PresentationLayerRootPackage.eINSTANCE;
	}

} //PresentationLayerRootFactoryImpl
