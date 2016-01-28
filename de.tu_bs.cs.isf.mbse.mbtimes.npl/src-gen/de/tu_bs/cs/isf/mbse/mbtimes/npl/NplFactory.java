/**
 */
package de.tu_bs.cs.isf.mbse.mbtimes.npl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.NplPackage
 * @generated
 */
public interface NplFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  NplFactory eINSTANCE = de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.NplFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Declaration</em>'.
   * @generated
   */
  Declaration createDeclaration();

  /**
   * Returns a new object of class '<em>Images Count</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Images Count</em>'.
   * @generated
   */
  ImagesCount createImagesCount();

  /**
   * Returns a new object of class '<em>Font Size</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Font Size</em>'.
   * @generated
   */
  FontSize createFontSize();

  /**
   * Returns a new object of class '<em>Format</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Format</em>'.
   * @generated
   */
  Format createFormat();

  /**
   * Returns a new object of class '<em>Date</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Date</em>'.
   * @generated
   */
  Date createDate();

  /**
   * Returns a new object of class '<em>Language</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Language</em>'.
   * @generated
   */
  Language createLanguage();

  /**
   * Returns a new object of class '<em>Price</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Price</em>'.
   * @generated
   */
  Price createPrice();

  /**
   * Returns a new object of class '<em>Currency</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Currency</em>'.
   * @generated
   */
  Currency createCurrency();

  /**
   * Returns a new object of class '<em>Topic</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Topic</em>'.
   * @generated
   */
  Topic createTopic();

  /**
   * Returns a new object of class '<em>Pair</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pair</em>'.
   * @generated
   */
  Pair createPair();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  NplPackage getNplPackage();

} //NplFactory
