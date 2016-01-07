/**
 */
package de.tu_bs.cs.isf.mbse.mbtimes.npl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Pair#getType <em>Type</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Pair#getKey <em>Key</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Pair#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.NplPackage#getPair()
 * @model
 * @generated
 */
public interface Pair extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.NplPackage#getPair_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Pair#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key</em>' attribute.
   * @see #setKey(String)
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.NplPackage#getPair_Key()
   * @model
   * @generated
   */
  String getKey();

  /**
   * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Pair#getKey <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key</em>' attribute.
   * @see #getKey()
   * @generated
   */
  void setKey(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.NplPackage#getPair_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Pair#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // Pair
