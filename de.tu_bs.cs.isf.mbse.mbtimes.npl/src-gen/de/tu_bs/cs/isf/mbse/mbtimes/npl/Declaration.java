/**
 */
package de.tu_bs.cs.isf.mbse.mbtimes.npl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getName <em>Name</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getFeedlinks <em>Feedlinks</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getPairs <em>Pairs</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getTopics <em>Topics</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getDate <em>Date</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getLocation <em>Location</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getPrice <em>Price</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getVolume <em>Volume</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getLanguage <em>Language</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getFormat <em>Format</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getArticle_cnt <em>Article cnt</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getArticle_char_min <em>Article char min</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getArticle_char_max <em>Article char max</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getArticle_images <em>Article images</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getColumns_cnt <em>Columns cnt</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getFont_size <em>Font size</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.NplPackage#getDeclaration()
 * @model
 * @generated
 */
public interface Declaration extends EObject
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
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.NplPackage#getDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Feedlinks</b></em>' containment reference list.
   * The list contents are of type {@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Pair}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feedlinks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feedlinks</em>' containment reference list.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.NplPackage#getDeclaration_Feedlinks()
   * @model containment="true"
   * @generated
   */
  EList<Pair> getFeedlinks();

  /**
   * Returns the value of the '<em><b>Pairs</b></em>' containment reference list.
   * The list contents are of type {@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Pair}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pairs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pairs</em>' containment reference list.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.NplPackage#getDeclaration_Pairs()
   * @model containment="true"
   * @generated
   */
  EList<Pair> getPairs();

  /**
   * Returns the value of the '<em><b>Topics</b></em>' containment reference list.
   * The list contents are of type {@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Topic}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Topics</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Topics</em>' containment reference list.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.NplPackage#getDeclaration_Topics()
   * @model containment="true"
   * @generated
   */
  EList<Topic> getTopics();

  /**
   * Returns the value of the '<em><b>Date</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Date</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Date</em>' containment reference.
   * @see #setDate(Date)
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.NplPackage#getDeclaration_Date()
   * @model containment="true"
   * @generated
   */
  Date getDate();

  /**
   * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getDate <em>Date</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Date</em>' containment reference.
   * @see #getDate()
   * @generated
   */
  void setDate(Date value);

  /**
   * Returns the value of the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Location</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location</em>' attribute.
   * @see #setLocation(String)
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.NplPackage#getDeclaration_Location()
   * @model
   * @generated
   */
  String getLocation();

  /**
   * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getLocation <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location</em>' attribute.
   * @see #getLocation()
   * @generated
   */
  void setLocation(String value);

  /**
   * Returns the value of the '<em><b>Price</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Price</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Price</em>' containment reference.
   * @see #setPrice(Price)
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.NplPackage#getDeclaration_Price()
   * @model containment="true"
   * @generated
   */
  Price getPrice();

  /**
   * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getPrice <em>Price</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Price</em>' containment reference.
   * @see #getPrice()
   * @generated
   */
  void setPrice(Price value);

  /**
   * Returns the value of the '<em><b>Volume</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Volume</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Volume</em>' attribute.
   * @see #setVolume(int)
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.NplPackage#getDeclaration_Volume()
   * @model
   * @generated
   */
  int getVolume();

  /**
   * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getVolume <em>Volume</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Volume</em>' attribute.
   * @see #getVolume()
   * @generated
   */
  void setVolume(int value);

  /**
   * Returns the value of the '<em><b>Language</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Language</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Language</em>' containment reference.
   * @see #setLanguage(EString)
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.NplPackage#getDeclaration_Language()
   * @model containment="true"
   * @generated
   */
  EString getLanguage();

  /**
   * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getLanguage <em>Language</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Language</em>' containment reference.
   * @see #getLanguage()
   * @generated
   */
  void setLanguage(EString value);

  /**
   * Returns the value of the '<em><b>Format</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Format</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Format</em>' containment reference.
   * @see #setFormat(EString)
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.NplPackage#getDeclaration_Format()
   * @model containment="true"
   * @generated
   */
  EString getFormat();

  /**
   * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getFormat <em>Format</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Format</em>' containment reference.
   * @see #getFormat()
   * @generated
   */
  void setFormat(EString value);

  /**
   * Returns the value of the '<em><b>Article cnt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Article cnt</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Article cnt</em>' attribute.
   * @see #setArticle_cnt(int)
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.NplPackage#getDeclaration_Article_cnt()
   * @model
   * @generated
   */
  int getArticle_cnt();

  /**
   * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getArticle_cnt <em>Article cnt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Article cnt</em>' attribute.
   * @see #getArticle_cnt()
   * @generated
   */
  void setArticle_cnt(int value);

  /**
   * Returns the value of the '<em><b>Article char min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Article char min</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Article char min</em>' attribute.
   * @see #setArticle_char_min(int)
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.NplPackage#getDeclaration_Article_char_min()
   * @model
   * @generated
   */
  int getArticle_char_min();

  /**
   * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getArticle_char_min <em>Article char min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Article char min</em>' attribute.
   * @see #getArticle_char_min()
   * @generated
   */
  void setArticle_char_min(int value);

  /**
   * Returns the value of the '<em><b>Article char max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Article char max</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Article char max</em>' attribute.
   * @see #setArticle_char_max(int)
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.NplPackage#getDeclaration_Article_char_max()
   * @model
   * @generated
   */
  int getArticle_char_max();

  /**
   * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getArticle_char_max <em>Article char max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Article char max</em>' attribute.
   * @see #getArticle_char_max()
   * @generated
   */
  void setArticle_char_max(int value);

  /**
   * Returns the value of the '<em><b>Article images</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Article images</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Article images</em>' attribute.
   * @see #setArticle_images(int)
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.NplPackage#getDeclaration_Article_images()
   * @model
   * @generated
   */
  int getArticle_images();

  /**
   * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getArticle_images <em>Article images</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Article images</em>' attribute.
   * @see #getArticle_images()
   * @generated
   */
  void setArticle_images(int value);

  /**
   * Returns the value of the '<em><b>Columns cnt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Columns cnt</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columns cnt</em>' attribute.
   * @see #setColumns_cnt(int)
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.NplPackage#getDeclaration_Columns_cnt()
   * @model
   * @generated
   */
  int getColumns_cnt();

  /**
   * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getColumns_cnt <em>Columns cnt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Columns cnt</em>' attribute.
   * @see #getColumns_cnt()
   * @generated
   */
  void setColumns_cnt(int value);

  /**
   * Returns the value of the '<em><b>Font size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Font size</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Font size</em>' containment reference.
   * @see #setFont_size(EString)
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.NplPackage#getDeclaration_Font_size()
   * @model containment="true"
   * @generated
   */
  EString getFont_size();

  /**
   * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getFont_size <em>Font size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Font size</em>' containment reference.
   * @see #getFont_size()
   * @generated
   */
  void setFont_size(EString value);

} // Declaration
