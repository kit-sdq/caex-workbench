/**
 */
package caex.caex215.caex;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Class Lib</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link caex.caex215.caex.RoleClassLib#getRoleClass <em>Role Class</em>}</li>
 * </ul>
 *
 * @see caex.caex215.caex.CAEXPackage#getRoleClassLib()
 * @model extendedMetaData="name='RoleClassLib' kind='elementOnly'"
 * @generated
 */
public interface RoleClassLib extends CAEXObject {
	/**
	 * Returns the value of the '<em><b>Role Class</b></em>' containment reference list.
	 * The list contents are of type {@link caex.caex215.caex.RoleClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of a class of a role type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role Class</em>' containment reference list.
	 * @see caex.caex215.caex.CAEXPackage#getRoleClassLib_RoleClass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RoleClass' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RoleClass> getRoleClass();

} // RoleClassLib
