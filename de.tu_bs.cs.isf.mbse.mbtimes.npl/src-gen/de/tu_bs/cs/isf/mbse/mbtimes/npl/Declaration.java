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
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getTitle <em>Title</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getFeedlinks <em>Feedlinks</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getTopics <em>Topics</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getDate <em>Date</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getLocation <em>Location</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getPrice <em>Price</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getVolume <em>Volume</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getNumber <em>Number</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getLanguage <em>Language</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getFormat <em>Format</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getArticleCnt <em>Article Cnt</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getArticleWordsMin <em>Article Words Min</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getArticleWordsMax <em>Article Words Max</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getImagesCnt <em>Images Cnt</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getColumnsCnt <em>Columns Cnt</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getFontSize <em>Font Size</em>}</li>
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
   * Returns the value of the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' attribute.
   * @see #setTitle(String)
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.NplPackage#getDeclaration_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
  void setTitle(String value);

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
   * Returns the value of the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number</em>' attribute.
   * @see #setNumber(int)
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.NplPackage#getDeclaration_Number()
   * @model
   * @generated
   */
  int getNumber();

  /**
   * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getNumber <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number</em>' attribute.
   * @see #getNumber()
   * @generated
   */
  void setNumber(int value);

  /**
   * Returns the value of the '<em><b>Language</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Language</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Language</em>' containment reference.
   * @see #setLanguage(Language)
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.NplPackage#getDeclaration_Language()
   * @model containment="true"
   * @generated
   */
  Language getLanguage();

  /**
   * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getLanguage <em>Language</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Language</em>' containment reference.
   * @see #getLanguage()
   * @generated
   */
  void setLanguage(Language value);

  /**
   * Returns the value of the '<em><b>Format</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Format</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Format</em>' containment reference.
   * @see #setFormat(Format)
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.NplPackage#getDeclaration_Format()
   * @model containment="true"
   * @generated
   */
  Format getFormat();

  /**
   * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getFormat <em>Format</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Format</em>' containment reference.
   * @see #getFormat()
   * @generated
   */
  void setFormat(Format value);

  /**
   * Returns the value of the '<em><b>Article Cnt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Article Cnt</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Article Cnt</em>' attribute.
   * @see #setArticleCnt(int)
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.NplPackage#getDeclaration_ArticleCnt()
   * @model
   * @generated
   */
  int getArticleCnt();

  /**
   * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getArticleCnt <em>Article Cnt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Article Cnt</em>' attribute.
   * @see #getArticleCnt()
   * @generated
   */
  void setArticleCnt(int value);

  /**
   * Returns the value of the '<em><b>Article Words Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Article Words Min</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Article Words Min</em>' attribute.
   * @see #setArticleWordsMin(int)
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.NplPackage#getDeclaration_ArticleWordsMin()
   * @model
   * @generated
   */
  int getArticleWordsMin();

  /**
   * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getArticleWordsMin <em>Article Words Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Article Words Min</em>' attribute.
   * @see #getArticleWordsMin()
   * @generated
   */
  void setArticleWordsMin(int value);

  /**
   * Returns the value of the '<em><b>Article Words Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Article Words Max</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Article Words Max</em>' attribute.
   * @see #setArticleWordsMax(int)
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.NplPackage#getDeclaration_ArticleWordsMax()
   * @model
   * @generated
   */
  int getArticleWordsMax();

  /**
   * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getArticleWordsMax <em>Article Words Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Article Words Max</em>' attribute.
   * @see #getArticleWordsMax()
   * @generated
   */
  void setArticleWordsMax(int value);

  /**
   * Returns the value of the '<em><b>Images Cnt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Images Cnt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Images Cnt</em>' containment reference.
   * @see #setImagesCnt(ImagesCount)
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.NplPackage#getDeclaration_ImagesCnt()
   * @model containment="true"
   * @generated
   */
  ImagesCount getImagesCnt();

  /**
   * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getImagesCnt <em>Images Cnt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Images Cnt</em>' containment reference.
   * @see #getImagesCnt()
   * @generated
   */
  void setImagesCnt(ImagesCount value);

  /**
   * Returns the value of the '<em><b>Columns Cnt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Columns Cnt</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columns Cnt</em>' attribute.
   * @see #setColumnsCnt(int)
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.NplPackage#getDeclaration_ColumnsCnt()
   * @model
   * @generated
   */
  int getColumnsCnt();

  /**
   * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getColumnsCnt <em>Columns Cnt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Columns Cnt</em>' attribute.
   * @see #getColumnsCnt()
   * @generated
   */
  void setColumnsCnt(int value);

  /**
   * Returns the value of the '<em><b>Font Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Font Size</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Font Size</em>' containment reference.
   * @see #setFontSize(FontSize)
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.NplPackage#getDeclaration_FontSize()
   * @model containment="true"
   * @generated
   */
  FontSize getFontSize();

  /**
   * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getFontSize <em>Font Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Font Size</em>' containment reference.
   * @see #getFontSize()
   * @generated
   */
  void setFontSize(FontSize value);

} // Declaration
