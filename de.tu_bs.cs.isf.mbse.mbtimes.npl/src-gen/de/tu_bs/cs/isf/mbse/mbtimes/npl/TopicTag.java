/**
 */
package de.tu_bs.cs.isf.mbse.mbtimes.npl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topic Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.TopicTag#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.NplPackage#getTopicTag()
 * @model
 * @generated
 */
public interface TopicTag extends EObject
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
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.NplPackage#getTopicTag_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.TopicTag#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // TopicTag
