/**
 */
package de.tu_bs.cs.isf.mbse.mbtimes.npl.util;

import de.tu_bs.cs.isf.mbse.mbtimes.npl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.NplPackage
 * @generated
 */
public class NplAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static NplPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NplAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = NplPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NplSwitch<Adapter> modelSwitch =
    new NplSwitch<Adapter>()
    {
      @Override
      public Adapter caseDeclaration(Declaration object)
      {
        return createDeclarationAdapter();
      }
      @Override
      public Adapter caseImagesCount(ImagesCount object)
      {
        return createImagesCountAdapter();
      }
      @Override
      public Adapter caseFontSize(FontSize object)
      {
        return createFontSizeAdapter();
      }
      @Override
      public Adapter caseFormat(Format object)
      {
        return createFormatAdapter();
      }
      @Override
      public Adapter caseDate(Date object)
      {
        return createDateAdapter();
      }
      @Override
      public Adapter caseLanguage(Language object)
      {
        return createLanguageAdapter();
      }
      @Override
      public Adapter casePrice(Price object)
      {
        return createPriceAdapter();
      }
      @Override
      public Adapter caseCurrency(Currency object)
      {
        return createCurrencyAdapter();
      }
      @Override
      public Adapter caseTopic(Topic object)
      {
        return createTopicAdapter();
      }
      @Override
      public Adapter casePair(Pair object)
      {
        return createPairAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration
   * @generated
   */
  public Adapter createDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.ImagesCount <em>Images Count</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.ImagesCount
   * @generated
   */
  public Adapter createImagesCountAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.FontSize <em>Font Size</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.FontSize
   * @generated
   */
  public Adapter createFontSizeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Format <em>Format</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Format
   * @generated
   */
  public Adapter createFormatAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Date <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Date
   * @generated
   */
  public Adapter createDateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Language <em>Language</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Language
   * @generated
   */
  public Adapter createLanguageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Price <em>Price</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Price
   * @generated
   */
  public Adapter createPriceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Currency <em>Currency</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Currency
   * @generated
   */
  public Adapter createCurrencyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Topic <em>Topic</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Topic
   * @generated
   */
  public Adapter createTopicAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.Pair <em>Pair</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.tu_bs.cs.isf.mbse.mbtimes.npl.Pair
   * @generated
   */
  public Adapter createPairAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //NplAdapterFactory
