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
   * The feature id for the '<em><b>Feedlinks</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__FEEDLINKS = 1;

  /**
   * The number of structural features of the '<em>Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.FeedlinksImpl <em>Feedlinks</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.FeedlinksImpl
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.NplPackageImpl#getFeedlinks()
   * @generated
   */
  int FEEDLINKS = 1;

  /**
   * The feature id for the '<em><b>Pairs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDLINKS__PAIRS = 0;

  /**
   * The number of structural features of the '<em>Feedlinks</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEEDLINKS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.PairImpl <em>Pair</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.PairImpl
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.NplPackageImpl#getPair()
   * @generated
   */
  int PAIR = 2;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAIR__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAIR__VALUE = 1;

  /**
   * The number of structural features of the '<em>Pair</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAIR_FEATURE_COUNT = 2;


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
   * Returns the meta object for the containment reference '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getFeedlinks <em>Feedlinks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Feedlinks</em>'.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration#getFeedlinks()
   * @see #getDeclaration()
   * @generated
   */
  EReference getDeclaration_Feedlinks();

  /**
   * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Feedlinks <em>Feedlinks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feedlinks</em>'.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Feedlinks
   * @generated
   */
  EClass getFeedlinks();

  /**
   * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Feedlinks#getPairs <em>Pairs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pairs</em>'.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Feedlinks#getPairs()
   * @see #getFeedlinks()
   * @generated
   */
  EReference getFeedlinks_Pairs();

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
     * The meta object literal for the '<em><b>Feedlinks</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION__FEEDLINKS = eINSTANCE.getDeclaration_Feedlinks();

    /**
     * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.FeedlinksImpl <em>Feedlinks</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.FeedlinksImpl
     * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.NplPackageImpl#getFeedlinks()
     * @generated
     */
    EClass FEEDLINKS = eINSTANCE.getFeedlinks();

    /**
     * The meta object literal for the '<em><b>Pairs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEEDLINKS__PAIRS = eINSTANCE.getFeedlinks_Pairs();

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
