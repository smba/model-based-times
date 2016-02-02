/**
 */
package de.tu_bs.cs.isf.mbse.mbtimes.npl;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.NplFactory
 * @model kind="package"
 * @generated
 */
public interface NplPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "npl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.tu_bs.de/cs/isf/mbse/mbtimes/Npl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "npl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  NplPackage eINSTANCE = de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.NplPackageImpl.init();

  /**
   * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.DeclarationImpl <em>Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.DeclarationImpl
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.NplPackageImpl#getDeclaration()
   * @generated
   */
  int DECLARATION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__TITLE = 1;

  /**
   * The feature id for the '<em><b>Feedlinks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__FEEDLINKS = 2;

  /**
   * The feature id for the '<em><b>Topics</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__TOPICS = 3;

  /**
   * The feature id for the '<em><b>Date</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__DATE = 4;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__LOCATION = 5;

  /**
   * The feature id for the '<em><b>Price</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__PRICE = 6;

  /**
   * The feature id for the '<em><b>Volume</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__VOLUME = 7;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__NUMBER = 8;

  /**
   * The feature id for the '<em><b>Language</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__LANGUAGE = 9;

  /**
   * The feature id for the '<em><b>Format</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__FORMAT = 10;

  /**
   * The feature id for the '<em><b>Article Cnt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__ARTICLE_CNT = 11;

  /**
   * The feature id for the '<em><b>Article Words Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__ARTICLE_WORDS_MIN = 12;

  /**
   * The feature id for the '<em><b>Article Words Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__ARTICLE_WORDS_MAX = 13;

  /**
   * The feature id for the '<em><b>Images Cnt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__IMAGES_CNT = 14;

  /**
   * The feature id for the '<em><b>Columns Cnt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__COLUMNS_CNT = 15;

  /**
   * The feature id for the '<em><b>Font Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__FONT_SIZE = 16;

  /**
   * The number of structural features of the '<em>Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_FEATURE_COUNT = 17;

  /**
   * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.ImagesCountImpl <em>Images Count</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.ImagesCountImpl
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.NplPackageImpl#getImagesCount()
   * @generated
   */
  int IMAGES_COUNT = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGES_COUNT__VALUE = 0;

  /**
   * The number of structural features of the '<em>Images Count</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGES_COUNT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.FontSizeImpl <em>Font Size</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.FontSizeImpl
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.NplPackageImpl#getFontSize()
   * @generated
   */
  int FONT_SIZE = 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_SIZE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Font Size</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_SIZE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.FormatImpl <em>Format</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.FormatImpl
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.NplPackageImpl#getFormat()
   * @generated
   */
  int FORMAT = 3;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAT__VALUE = 0;

  /**
   * The number of structural features of the '<em>Format</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.DateImpl <em>Date</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.DateImpl
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.NplPackageImpl#getDate()
   * @generated
   */
  int DATE = 4;

  /**
   * The feature id for the '<em><b>Day</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE__DAY = 0;

  /**
   * The feature id for the '<em><b>Month</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE__MONTH = 1;

  /**
   * The feature id for the '<em><b>Year</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE__YEAR = 2;

  /**
   * The number of structural features of the '<em>Date</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.LanguageImpl <em>Language</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.LanguageImpl
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.NplPackageImpl#getLanguage()
   * @generated
   */
  int LANGUAGE = 5;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANGUAGE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Language</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANGUAGE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.PriceImpl <em>Price</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.PriceImpl
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.NplPackageImpl#getPrice()
   * @generated
   */
  int PRICE = 6;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRICE__VALUE = 0;

  /**
   * The feature id for the '<em><b>Currency</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRICE__CURRENCY = 1;

  /**
   * The number of structural features of the '<em>Price</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRICE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.CurrencyImpl <em>Currency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.CurrencyImpl
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.NplPackageImpl#getCurrency()
   * @generated
   */
  int CURRENCY = 7;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURRENCY__VALUE = 0;

  /**
   * The number of structural features of the '<em>Currency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURRENCY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.TopicImpl <em>Topic</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.TopicImpl
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.NplPackageImpl#getTopic()
   * @generated
   */
  int TOPIC = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOPIC__NAME = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOPIC__TITLE = 1;

  /**
   * The feature id for the '<em><b>Tags</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOPIC__TAGS = 2;

  /**
   * The number of structural features of the '<em>Topic</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOPIC_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.PairImpl <em>Pair</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.PairImpl
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.NplPackageImpl#getPair()
   * @generated
   */
  int PAIR = 9;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAIR__TYPE = 0;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAIR__KEY = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAIR__VALUE = 2;

  /**
   * The number of structural features of the '<em>Pair</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAIR_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declaration</em>'.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration
   * @generated
   */
  EClass getDeclaration();

  /**
   * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getName()
   * @see #getDeclaration()
   * @generated
   */
  EAttribute getDeclaration_Name();

  /**
   * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getTitle()
   * @see #getDeclaration()
   * @generated
   */
  EAttribute getDeclaration_Title();

  /**
   * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getFeedlinks <em>Feedlinks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Feedlinks</em>'.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getFeedlinks()
   * @see #getDeclaration()
   * @generated
   */
  EReference getDeclaration_Feedlinks();

  /**
   * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getTopics <em>Topics</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Topics</em>'.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getTopics()
   * @see #getDeclaration()
   * @generated
   */
  EReference getDeclaration_Topics();

  /**
   * Returns the meta object for the containment reference '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getDate <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Date</em>'.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getDate()
   * @see #getDeclaration()
   * @generated
   */
  EReference getDeclaration_Date();

  /**
   * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Location</em>'.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getLocation()
   * @see #getDeclaration()
   * @generated
   */
  EAttribute getDeclaration_Location();

  /**
   * Returns the meta object for the containment reference '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getPrice <em>Price</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Price</em>'.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getPrice()
   * @see #getDeclaration()
   * @generated
   */
  EReference getDeclaration_Price();

  /**
   * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getVolume <em>Volume</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Volume</em>'.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getVolume()
   * @see #getDeclaration()
   * @generated
   */
  EAttribute getDeclaration_Volume();

  /**
   * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number</em>'.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getNumber()
   * @see #getDeclaration()
   * @generated
   */
  EAttribute getDeclaration_Number();

  /**
   * Returns the meta object for the containment reference '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getLanguage <em>Language</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Language</em>'.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getLanguage()
   * @see #getDeclaration()
   * @generated
   */
  EReference getDeclaration_Language();

  /**
   * Returns the meta object for the containment reference '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getFormat <em>Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Format</em>'.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getFormat()
   * @see #getDeclaration()
   * @generated
   */
  EReference getDeclaration_Format();

  /**
   * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getArticleCnt <em>Article Cnt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Article Cnt</em>'.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getArticleCnt()
   * @see #getDeclaration()
   * @generated
   */
  EAttribute getDeclaration_ArticleCnt();

  /**
   * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getArticleWordsMin <em>Article Words Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Article Words Min</em>'.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getArticleWordsMin()
   * @see #getDeclaration()
   * @generated
   */
  EAttribute getDeclaration_ArticleWordsMin();

  /**
   * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getArticleWordsMax <em>Article Words Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Article Words Max</em>'.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getArticleWordsMax()
   * @see #getDeclaration()
   * @generated
   */
  EAttribute getDeclaration_ArticleWordsMax();

  /**
   * Returns the meta object for the containment reference '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getImagesCnt <em>Images Cnt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Images Cnt</em>'.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getImagesCnt()
   * @see #getDeclaration()
   * @generated
   */
  EReference getDeclaration_ImagesCnt();

  /**
   * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getColumnsCnt <em>Columns Cnt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Columns Cnt</em>'.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getColumnsCnt()
   * @see #getDeclaration()
   * @generated
   */
  EAttribute getDeclaration_ColumnsCnt();

  /**
   * Returns the meta object for the containment reference '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getFontSize <em>Font Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Font Size</em>'.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getFontSize()
   * @see #getDeclaration()
   * @generated
   */
  EReference getDeclaration_FontSize();

  /**
   * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.ImagesCount <em>Images Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Images Count</em>'.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.ImagesCount
   * @generated
   */
  EClass getImagesCount();

  /**
   * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.ImagesCount#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.ImagesCount#getValue()
   * @see #getImagesCount()
   * @generated
   */
  EAttribute getImagesCount_Value();

  /**
   * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.FontSize <em>Font Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Font Size</em>'.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.FontSize
   * @generated
   */
  EClass getFontSize();

  /**
   * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.FontSize#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.FontSize#getValue()
   * @see #getFontSize()
   * @generated
   */
  EAttribute getFontSize_Value();

  /**
   * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Format <em>Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Format</em>'.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Format
   * @generated
   */
  EClass getFormat();

  /**
   * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Format#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Format#getValue()
   * @see #getFormat()
   * @generated
   */
  EAttribute getFormat_Value();

  /**
   * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Date <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Date</em>'.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Date
   * @generated
   */
  EClass getDate();

  /**
   * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Date#getDay <em>Day</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Day</em>'.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Date#getDay()
   * @see #getDate()
   * @generated
   */
  EAttribute getDate_Day();

  /**
   * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Date#getMonth <em>Month</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Month</em>'.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Date#getMonth()
   * @see #getDate()
   * @generated
   */
  EAttribute getDate_Month();

  /**
   * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Date#getYear <em>Year</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Year</em>'.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Date#getYear()
   * @see #getDate()
   * @generated
   */
  EAttribute getDate_Year();

  /**
   * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Language <em>Language</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Language</em>'.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Language
   * @generated
   */
  EClass getLanguage();

  /**
   * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Language#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Language#getValue()
   * @see #getLanguage()
   * @generated
   */
  EAttribute getLanguage_Value();

  /**
   * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Price <em>Price</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Price</em>'.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Price
   * @generated
   */
  EClass getPrice();

  /**
   * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Price#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Price#getValue()
   * @see #getPrice()
   * @generated
   */
  EAttribute getPrice_Value();

  /**
   * Returns the meta object for the containment reference '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Price#getCurrency <em>Currency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Currency</em>'.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Price#getCurrency()
   * @see #getPrice()
   * @generated
   */
  EReference getPrice_Currency();

  /**
   * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Currency <em>Currency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Currency</em>'.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Currency
   * @generated
   */
  EClass getCurrency();

  /**
   * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Currency#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Currency#getValue()
   * @see #getCurrency()
   * @generated
   */
  EAttribute getCurrency_Value();

  /**
   * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Topic <em>Topic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Topic</em>'.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Topic
   * @generated
   */
  EClass getTopic();

  /**
   * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Topic#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Topic#getName()
   * @see #getTopic()
   * @generated
   */
  EAttribute getTopic_Name();

  /**
   * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Topic#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Topic#getTitle()
   * @see #getTopic()
   * @generated
   */
  EAttribute getTopic_Title();

  /**
   * Returns the meta object for the attribute list '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Topic#getTags <em>Tags</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Tags</em>'.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Topic#getTags()
   * @see #getTopic()
   * @generated
   */
  EAttribute getTopic_Tags();

  /**
   * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Pair <em>Pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pair</em>'.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Pair
   * @generated
   */
  EClass getPair();

  /**
   * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Pair#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Pair#getType()
   * @see #getPair()
   * @generated
   */
  EAttribute getPair_Type();

  /**
   * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Pair#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Pair#getKey()
   * @see #getPair()
   * @generated
   */
  EAttribute getPair_Key();

  /**
   * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Pair#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Pair#getValue()
   * @see #getPair()
   * @generated
   */
  EAttribute getPair_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  NplFactory getNplFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.DeclarationImpl <em>Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.DeclarationImpl
     * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.NplPackageImpl#getDeclaration()
     * @generated
     */
    EClass DECLARATION = eINSTANCE.getDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATION__NAME = eINSTANCE.getDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATION__TITLE = eINSTANCE.getDeclaration_Title();

    /**
     * The meta object literal for the '<em><b>Feedlinks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION__FEEDLINKS = eINSTANCE.getDeclaration_Feedlinks();

    /**
     * The meta object literal for the '<em><b>Topics</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION__TOPICS = eINSTANCE.getDeclaration_Topics();

    /**
     * The meta object literal for the '<em><b>Date</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION__DATE = eINSTANCE.getDeclaration_Date();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATION__LOCATION = eINSTANCE.getDeclaration_Location();

    /**
     * The meta object literal for the '<em><b>Price</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION__PRICE = eINSTANCE.getDeclaration_Price();

    /**
     * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATION__VOLUME = eINSTANCE.getDeclaration_Volume();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATION__NUMBER = eINSTANCE.getDeclaration_Number();

    /**
     * The meta object literal for the '<em><b>Language</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION__LANGUAGE = eINSTANCE.getDeclaration_Language();

    /**
     * The meta object literal for the '<em><b>Format</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION__FORMAT = eINSTANCE.getDeclaration_Format();

    /**
     * The meta object literal for the '<em><b>Article Cnt</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATION__ARTICLE_CNT = eINSTANCE.getDeclaration_ArticleCnt();

    /**
     * The meta object literal for the '<em><b>Article Words Min</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATION__ARTICLE_WORDS_MIN = eINSTANCE.getDeclaration_ArticleWordsMin();

    /**
     * The meta object literal for the '<em><b>Article Words Max</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATION__ARTICLE_WORDS_MAX = eINSTANCE.getDeclaration_ArticleWordsMax();

    /**
     * The meta object literal for the '<em><b>Images Cnt</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION__IMAGES_CNT = eINSTANCE.getDeclaration_ImagesCnt();

    /**
     * The meta object literal for the '<em><b>Columns Cnt</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATION__COLUMNS_CNT = eINSTANCE.getDeclaration_ColumnsCnt();

    /**
     * The meta object literal for the '<em><b>Font Size</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION__FONT_SIZE = eINSTANCE.getDeclaration_FontSize();

    /**
     * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.ImagesCountImpl <em>Images Count</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.ImagesCountImpl
     * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.NplPackageImpl#getImagesCount()
     * @generated
     */
    EClass IMAGES_COUNT = eINSTANCE.getImagesCount();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGES_COUNT__VALUE = eINSTANCE.getImagesCount_Value();

    /**
     * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.FontSizeImpl <em>Font Size</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.FontSizeImpl
     * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.NplPackageImpl#getFontSize()
     * @generated
     */
    EClass FONT_SIZE = eINSTANCE.getFontSize();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FONT_SIZE__VALUE = eINSTANCE.getFontSize_Value();

    /**
     * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.FormatImpl <em>Format</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.FormatImpl
     * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.NplPackageImpl#getFormat()
     * @generated
     */
    EClass FORMAT = eINSTANCE.getFormat();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORMAT__VALUE = eINSTANCE.getFormat_Value();

    /**
     * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.DateImpl <em>Date</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.DateImpl
     * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.NplPackageImpl#getDate()
     * @generated
     */
    EClass DATE = eINSTANCE.getDate();

    /**
     * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATE__DAY = eINSTANCE.getDate_Day();

    /**
     * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATE__MONTH = eINSTANCE.getDate_Month();

    /**
     * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATE__YEAR = eINSTANCE.getDate_Year();

    /**
     * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.LanguageImpl <em>Language</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.LanguageImpl
     * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.NplPackageImpl#getLanguage()
     * @generated
     */
    EClass LANGUAGE = eINSTANCE.getLanguage();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LANGUAGE__VALUE = eINSTANCE.getLanguage_Value();

    /**
     * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.PriceImpl <em>Price</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.PriceImpl
     * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.NplPackageImpl#getPrice()
     * @generated
     */
    EClass PRICE = eINSTANCE.getPrice();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRICE__VALUE = eINSTANCE.getPrice_Value();

    /**
     * The meta object literal for the '<em><b>Currency</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRICE__CURRENCY = eINSTANCE.getPrice_Currency();

    /**
     * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.CurrencyImpl <em>Currency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.CurrencyImpl
     * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.NplPackageImpl#getCurrency()
     * @generated
     */
    EClass CURRENCY = eINSTANCE.getCurrency();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CURRENCY__VALUE = eINSTANCE.getCurrency_Value();

    /**
     * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.TopicImpl <em>Topic</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.TopicImpl
     * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.NplPackageImpl#getTopic()
     * @generated
     */
    EClass TOPIC = eINSTANCE.getTopic();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOPIC__NAME = eINSTANCE.getTopic_Name();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOPIC__TITLE = eINSTANCE.getTopic_Title();

    /**
     * The meta object literal for the '<em><b>Tags</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOPIC__TAGS = eINSTANCE.getTopic_Tags();

    /**
     * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.PairImpl <em>Pair</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.PairImpl
     * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.NplPackageImpl#getPair()
     * @generated
     */
    EClass PAIR = eINSTANCE.getPair();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAIR__TYPE = eINSTANCE.getPair_Type();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAIR__KEY = eINSTANCE.getPair_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAIR__VALUE = eINSTANCE.getPair_Value();

  }

} //NplPackage
