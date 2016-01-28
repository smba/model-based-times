/**
 */
package de.tu_bs.cs.isf.mbse.mbtimes.npl.util;

import de.tu_bs.cs.isf.mbse.mbtimes.npl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.NplPackage
 * @generated
 */
public class NplSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static NplPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NplSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = NplPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case NplPackage.DECLARATION:
      {
        Declaration declaration = (Declaration)theEObject;
        T result = caseDeclaration(declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NplPackage.IMAGES_COUNT:
      {
        ImagesCount imagesCount = (ImagesCount)theEObject;
        T result = caseImagesCount(imagesCount);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NplPackage.FONT_SIZE:
      {
        FontSize fontSize = (FontSize)theEObject;
        T result = caseFontSize(fontSize);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NplPackage.FORMAT:
      {
        Format format = (Format)theEObject;
        T result = caseFormat(format);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NplPackage.DATE:
      {
        Date date = (Date)theEObject;
        T result = caseDate(date);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NplPackage.LANGUAGE:
      {
        Language language = (Language)theEObject;
        T result = caseLanguage(language);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NplPackage.PRICE:
      {
        Price price = (Price)theEObject;
        T result = casePrice(price);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NplPackage.CURRENCY:
      {
        Currency currency = (Currency)theEObject;
        T result = caseCurrency(currency);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NplPackage.TOPIC:
      {
        Topic topic = (Topic)theEObject;
        T result = caseTopic(topic);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NplPackage.PAIR:
      {
        Pair pair = (Pair)theEObject;
        T result = casePair(pair);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclaration(Declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Images Count</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Images Count</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImagesCount(ImagesCount object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Font Size</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Font Size</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFontSize(FontSize object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Format</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Format</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormat(Format object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Date</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Date</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDate(Date object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Language</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Language</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLanguage(Language object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Price</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Price</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrice(Price object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Currency</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Currency</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCurrency(Currency object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Topic</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Topic</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTopic(Topic object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pair</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pair</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePair(Pair object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //NplSwitch
