/**
 */
package de.tu_bs.cs.isf.mbse.mbtimes.npl.impl;

import de.tu_bs.cs.isf.mbse.mbtimes.npl.EString;
import de.tu_bs.cs.isf.mbse.mbtimes.npl.NplPackage;
import de.tu_bs.cs.isf.mbse.mbtimes.npl.Price;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Price</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.PriceImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.PriceImpl#getCurrency <em>Currency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PriceImpl extends MinimalEObjectImpl.Container implements Price
{
  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final float VALUE_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected float value = VALUE_EDEFAULT;

  /**
   * The cached value of the '{@link #getCurrency() <em>Currency</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCurrency()
   * @generated
   * @ordered
   */
  protected EString currency;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PriceImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return NplPackage.Literals.PRICE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(float newValue)
  {
    float oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NplPackage.PRICE__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EString getCurrency()
  {
    return currency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCurrency(EString newCurrency, NotificationChain msgs)
  {
    EString oldCurrency = currency;
    currency = newCurrency;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NplPackage.PRICE__CURRENCY, oldCurrency, newCurrency);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCurrency(EString newCurrency)
  {
    if (newCurrency != currency)
    {
      NotificationChain msgs = null;
      if (currency != null)
        msgs = ((InternalEObject)currency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NplPackage.PRICE__CURRENCY, null, msgs);
      if (newCurrency != null)
        msgs = ((InternalEObject)newCurrency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NplPackage.PRICE__CURRENCY, null, msgs);
      msgs = basicSetCurrency(newCurrency, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NplPackage.PRICE__CURRENCY, newCurrency, newCurrency));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case NplPackage.PRICE__CURRENCY:
        return basicSetCurrency(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case NplPackage.PRICE__VALUE:
        return getValue();
      case NplPackage.PRICE__CURRENCY:
        return getCurrency();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case NplPackage.PRICE__VALUE:
        setValue((Float)newValue);
        return;
      case NplPackage.PRICE__CURRENCY:
        setCurrency((EString)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case NplPackage.PRICE__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case NplPackage.PRICE__CURRENCY:
        setCurrency((EString)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case NplPackage.PRICE__VALUE:
        return value != VALUE_EDEFAULT;
      case NplPackage.PRICE__CURRENCY:
        return currency != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //PriceImpl
