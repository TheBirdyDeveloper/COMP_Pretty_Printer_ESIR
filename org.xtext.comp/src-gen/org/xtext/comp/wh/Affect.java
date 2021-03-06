/**
 * generated by Xtext 2.10.0
 */
package org.xtext.comp.wh;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Affect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.comp.wh.Affect#getVars <em>Vars</em>}</li>
 *   <li>{@link org.xtext.comp.wh.Affect#getExprs <em>Exprs</em>}</li>
 * </ul>
 *
 * @see org.xtext.comp.wh.WhPackage#getAffect()
 * @model
 * @generated
 */
public interface Affect extends EObject
{
  /**
   * Returns the value of the '<em><b>Vars</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vars</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vars</em>' attribute list.
   * @see org.xtext.comp.wh.WhPackage#getAffect_Vars()
   * @model unique="false"
   * @generated
   */
  EList<String> getVars();

  /**
   * Returns the value of the '<em><b>Exprs</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exprs</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exprs</em>' attribute list.
   * @see org.xtext.comp.wh.WhPackage#getAffect_Exprs()
   * @model unique="false"
   * @generated
   */
  EList<String> getExprs();

} // Affect
