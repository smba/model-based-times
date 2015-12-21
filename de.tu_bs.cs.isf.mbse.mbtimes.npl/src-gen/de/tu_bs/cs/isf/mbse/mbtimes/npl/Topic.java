/**
 */
package de.tu_bs.cs.isf.mbse.mbtimes.npl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Topic#getName <em>Name</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Topic#getTags <em>Tags</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.NplPackage#getTopic()
 * @model
 * @generated
 */
public interface Topic extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.NplPackage#getTopic_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Topic#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
   * The list contents are of type {@link de.tu_bs.cs.isf.mbse.mbtimes.npl.TopicTag}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tags</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tags</em>' containment reference list.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.NplPackage#getTopic_Tags()
   * @model containment="true"
   * @generated
   */
  EList<TopicTag> getTags();

} // Topic
