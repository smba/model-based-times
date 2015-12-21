/**
 */
package de.tu_bs.cs.isf.mbse.mbtimes.npl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Price</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Price#getValue <em>Value</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Price#getCurrency <em>Currency</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.NplPackage#getPrice()
 * @model
 * @generated
 */
public interface Price extends EObject
{
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
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.NplPackage#getPrice_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Price#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Currency</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Currency</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Currency</em>' containment reference.
   * @see #setCurrency(EString)
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.NplPackage#getPrice_Currency()
   * @model containment="true"
   * @generated
   */
  EString getCurrency();

  /**
   * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Price#getCurrency <em>Currency</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Currency</em>' containment reference.
   * @see #getCurrency()
   * @generated
   */
  void setCurrency(EString value);

} // Price
