/**
 */
package de.tu_bs.cs.isf.mbse.mbtimes.npl.impl;

import de.tu_bs.cs.isf.mbse.mbtimes.npl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NplFactoryImpl extends EFactoryImpl implements NplFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static NplFactory init()
  {
    try
    {
      NplFactory theNplFactory = (NplFactory)EPackage.Registry.INSTANCE.getEFactory(NplPackage.eNS_URI);
      if (theNplFactory != null)
      {
        return theNplFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new NplFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NplFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case NplPackage.DECLARATION: return createDeclaration();
      case NplPackage.IMAGES_COUNT: return createImagesCount();
      case NplPackage.FONT_SIZE: return createFontSize();
      case NplPackage.FORMAT: return createFormat();
      case NplPackage.DATE: return createDate();
      case NplPackage.LANGUAGE: return createLanguage();
      case NplPackage.PRICE: return createPrice();
      case NplPackage.CURRENCY: return createCurrency();
      case NplPackage.TOPIC: return createTopic();
      case NplPackage.PAIR: return createPair();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declaration createDeclaration()
  {
    DeclarationImpl declaration = new DeclarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImagesCount createImagesCount()
  {
    ImagesCountImpl imagesCount = new ImagesCountImpl();
    return imagesCount;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FontSize createFontSize()
  {
    FontSizeImpl fontSize = new FontSizeImpl();
    return fontSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Format createFormat()
  {
    FormatImpl format = new FormatImpl();
    return format;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Date createDate()
  {
    DateImpl date = new DateImpl();
    return date;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Language createLanguage()
  {
    LanguageImpl language = new LanguageImpl();
    return language;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Price createPrice()
  {
    PriceImpl price = new PriceImpl();
    return price;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Currency createCurrency()
  {
    CurrencyImpl currency = new CurrencyImpl();
    return currency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Topic createTopic()
  {
    TopicImpl topic = new TopicImpl();
    return topic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pair createPair()
  {
    PairImpl pair = new PairImpl();
    return pair;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NplPackage getNplPackage()
  {
    return (NplPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static NplPackage getPackage()
  {
    return NplPackage.eINSTANCE;
  }

} //NplFactoryImpl
