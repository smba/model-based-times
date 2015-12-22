/**
 */
package de.tu_bs.cs.isf.mbse.mbtimes.npl.impl;

import de.tu_bs.cs.isf.mbse.mbtimes.npl.Date;
import de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration;
import de.tu_bs.cs.isf.mbse.mbtimes.npl.EString;
import de.tu_bs.cs.isf.mbse.mbtimes.npl.NplPackage;
import de.tu_bs.cs.isf.mbse.mbtimes.npl.Pair;
import de.tu_bs.cs.isf.mbse.mbtimes.npl.Price;
import de.tu_bs.cs.isf.mbse.mbtimes.npl.Topic;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.DeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.DeclarationImpl#getFeedlinks <em>Feedlinks</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.DeclarationImpl#getPairs <em>Pairs</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.DeclarationImpl#getTopics <em>Topics</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.DeclarationImpl#getDate <em>Date</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.DeclarationImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.DeclarationImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.DeclarationImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.DeclarationImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.DeclarationImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.DeclarationImpl#getArticle_cnt <em>Article cnt</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.DeclarationImpl#getArticle_char_min <em>Article char min</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.DeclarationImpl#getArticle_char_max <em>Article char max</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.DeclarationImpl#getArticle_images <em>Article images</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.DeclarationImpl#getColumns_cnt <em>Columns cnt</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.DeclarationImpl#getFont_size <em>Font size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeclarationImpl extends MinimalEObjectImpl.Container implements Declaration
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getFeedlinks() <em>Feedlinks</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeedlinks()
   * @generated
   * @ordered
   */
  protected EList<Pair> feedlinks;

  /**
   * The cached value of the '{@link #getPairs() <em>Pairs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPairs()
   * @generated
   * @ordered
   */
  protected EList<Pair> pairs;

  /**
   * The cached value of the '{@link #getTopics() <em>Topics</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTopics()
   * @generated
   * @ordered
   */
  protected EList<Topic> topics;

  /**
   * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDate()
   * @generated
   * @ordered
   */
  protected Date date;

  /**
   * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected static final String LOCATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected String location = LOCATION_EDEFAULT;

  /**
   * The cached value of the '{@link #getPrice() <em>Price</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrice()
   * @generated
   * @ordered
   */
  protected Price price;

  /**
   * The default value of the '{@link #getVolume() <em>Volume</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVolume()
   * @generated
   * @ordered
   */
  protected static final int VOLUME_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getVolume() <em>Volume</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVolume()
   * @generated
   * @ordered
   */
  protected int volume = VOLUME_EDEFAULT;

  /**
   * The cached value of the '{@link #getLanguage() <em>Language</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLanguage()
   * @generated
   * @ordered
   */
  protected EString language;

  /**
   * The cached value of the '{@link #getFormat() <em>Format</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormat()
   * @generated
   * @ordered
   */
  protected EString format;

  /**
   * The default value of the '{@link #getArticle_cnt() <em>Article cnt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArticle_cnt()
   * @generated
   * @ordered
   */
  protected static final int ARTICLE_CNT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getArticle_cnt() <em>Article cnt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArticle_cnt()
   * @generated
   * @ordered
   */
  protected int article_cnt = ARTICLE_CNT_EDEFAULT;

  /**
   * The default value of the '{@link #getArticle_char_min() <em>Article char min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArticle_char_min()
   * @generated
   * @ordered
   */
  protected static final int ARTICLE_CHAR_MIN_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getArticle_char_min() <em>Article char min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArticle_char_min()
   * @generated
   * @ordered
   */
  protected int article_char_min = ARTICLE_CHAR_MIN_EDEFAULT;

  /**
   * The default value of the '{@link #getArticle_char_max() <em>Article char max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArticle_char_max()
   * @generated
   * @ordered
   */
  protected static final int ARTICLE_CHAR_MAX_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getArticle_char_max() <em>Article char max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArticle_char_max()
   * @generated
   * @ordered
   */
  protected int article_char_max = ARTICLE_CHAR_MAX_EDEFAULT;

  /**
   * The default value of the '{@link #getArticle_images() <em>Article images</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArticle_images()
   * @generated
   * @ordered
   */
  protected static final int ARTICLE_IMAGES_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getArticle_images() <em>Article images</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArticle_images()
   * @generated
   * @ordered
   */
  protected int article_images = ARTICLE_IMAGES_EDEFAULT;

  /**
   * The default value of the '{@link #getColumns_cnt() <em>Columns cnt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumns_cnt()
   * @generated
   * @ordered
   */
  protected static final int COLUMNS_CNT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getColumns_cnt() <em>Columns cnt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumns_cnt()
   * @generated
   * @ordered
   */
  protected int columns_cnt = COLUMNS_CNT_EDEFAULT;

  /**
   * The cached value of the '{@link #getFont_size() <em>Font size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFont_size()
   * @generated
   * @ordered
   */
  protected EString font_size;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeclarationImpl()
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
    return NplPackage.Literals.DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NplPackage.DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Pair> getFeedlinks()
  {
    if (feedlinks == null)
    {
      feedlinks = new EObjectContainmentEList<Pair>(Pair.class, this, NplPackage.DECLARATION__FEEDLINKS);
    }
    return feedlinks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Pair> getPairs()
  {
    if (pairs == null)
    {
      pairs = new EObjectContainmentEList<Pair>(Pair.class, this, NplPackage.DECLARATION__PAIRS);
    }
    return pairs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Topic> getTopics()
  {
    if (topics == null)
    {
      topics = new EObjectContainmentEList<Topic>(Topic.class, this, NplPackage.DECLARATION__TOPICS);
    }
    return topics;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Date getDate()
  {
    return date;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDate(Date newDate, NotificationChain msgs)
  {
    Date oldDate = date;
    date = newDate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NplPackage.DECLARATION__DATE, oldDate, newDate);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDate(Date newDate)
  {
    if (newDate != date)
    {
      NotificationChain msgs = null;
      if (date != null)
        msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NplPackage.DECLARATION__DATE, null, msgs);
      if (newDate != null)
        msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NplPackage.DECLARATION__DATE, null, msgs);
      msgs = basicSetDate(newDate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NplPackage.DECLARATION__DATE, newDate, newDate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLocation()
  {
    return location;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocation(String newLocation)
  {
    String oldLocation = location;
    location = newLocation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NplPackage.DECLARATION__LOCATION, oldLocation, location));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Price getPrice()
  {
    return price;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrice(Price newPrice, NotificationChain msgs)
  {
    Price oldPrice = price;
    price = newPrice;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NplPackage.DECLARATION__PRICE, oldPrice, newPrice);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrice(Price newPrice)
  {
    if (newPrice != price)
    {
      NotificationChain msgs = null;
      if (price != null)
        msgs = ((InternalEObject)price).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NplPackage.DECLARATION__PRICE, null, msgs);
      if (newPrice != null)
        msgs = ((InternalEObject)newPrice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NplPackage.DECLARATION__PRICE, null, msgs);
      msgs = basicSetPrice(newPrice, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NplPackage.DECLARATION__PRICE, newPrice, newPrice));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getVolume()
  {
    return volume;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVolume(int newVolume)
  {
    int oldVolume = volume;
    volume = newVolume;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NplPackage.DECLARATION__VOLUME, oldVolume, volume));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EString getLanguage()
  {
    return language;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLanguage(EString newLanguage, NotificationChain msgs)
  {
    EString oldLanguage = language;
    language = newLanguage;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NplPackage.DECLARATION__LANGUAGE, oldLanguage, newLanguage);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLanguage(EString newLanguage)
  {
    if (newLanguage != language)
    {
      NotificationChain msgs = null;
      if (language != null)
        msgs = ((InternalEObject)language).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NplPackage.DECLARATION__LANGUAGE, null, msgs);
      if (newLanguage != null)
        msgs = ((InternalEObject)newLanguage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NplPackage.DECLARATION__LANGUAGE, null, msgs);
      msgs = basicSetLanguage(newLanguage, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NplPackage.DECLARATION__LANGUAGE, newLanguage, newLanguage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EString getFormat()
  {
    return format;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFormat(EString newFormat, NotificationChain msgs)
  {
    EString oldFormat = format;
    format = newFormat;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NplPackage.DECLARATION__FORMAT, oldFormat, newFormat);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFormat(EString newFormat)
  {
    if (newFormat != format)
    {
      NotificationChain msgs = null;
      if (format != null)
        msgs = ((InternalEObject)format).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NplPackage.DECLARATION__FORMAT, null, msgs);
      if (newFormat != null)
        msgs = ((InternalEObject)newFormat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NplPackage.DECLARATION__FORMAT, null, msgs);
      msgs = basicSetFormat(newFormat, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NplPackage.DECLARATION__FORMAT, newFormat, newFormat));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getArticle_cnt()
  {
    return article_cnt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArticle_cnt(int newArticle_cnt)
  {
    int oldArticle_cnt = article_cnt;
    article_cnt = newArticle_cnt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NplPackage.DECLARATION__ARTICLE_CNT, oldArticle_cnt, article_cnt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getArticle_char_min()
  {
    return article_char_min;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArticle_char_min(int newArticle_char_min)
  {
    int oldArticle_char_min = article_char_min;
    article_char_min = newArticle_char_min;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NplPackage.DECLARATION__ARTICLE_CHAR_MIN, oldArticle_char_min, article_char_min));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getArticle_char_max()
  {
    return article_char_max;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArticle_char_max(int newArticle_char_max)
  {
    int oldArticle_char_max = article_char_max;
    article_char_max = newArticle_char_max;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NplPackage.DECLARATION__ARTICLE_CHAR_MAX, oldArticle_char_max, article_char_max));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getArticle_images()
  {
    return article_images;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArticle_images(int newArticle_images)
  {
    int oldArticle_images = article_images;
    article_images = newArticle_images;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NplPackage.DECLARATION__ARTICLE_IMAGES, oldArticle_images, article_images));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getColumns_cnt()
  {
    return columns_cnt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColumns_cnt(int newColumns_cnt)
  {
    int oldColumns_cnt = columns_cnt;
    columns_cnt = newColumns_cnt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NplPackage.DECLARATION__COLUMNS_CNT, oldColumns_cnt, columns_cnt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EString getFont_size()
  {
    return font_size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFont_size(EString newFont_size, NotificationChain msgs)
  {
    EString oldFont_size = font_size;
    font_size = newFont_size;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NplPackage.DECLARATION__FONT_SIZE, oldFont_size, newFont_size);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFont_size(EString newFont_size)
  {
    if (newFont_size != font_size)
    {
      NotificationChain msgs = null;
      if (font_size != null)
        msgs = ((InternalEObject)font_size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NplPackage.DECLARATION__FONT_SIZE, null, msgs);
      if (newFont_size != null)
        msgs = ((InternalEObject)newFont_size).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NplPackage.DECLARATION__FONT_SIZE, null, msgs);
      msgs = basicSetFont_size(newFont_size, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NplPackage.DECLARATION__FONT_SIZE, newFont_size, newFont_size));
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
      case NplPackage.DECLARATION__FEEDLINKS:
        return ((InternalEList<?>)getFeedlinks()).basicRemove(otherEnd, msgs);
      case NplPackage.DECLARATION__PAIRS:
        return ((InternalEList<?>)getPairs()).basicRemove(otherEnd, msgs);
      case NplPackage.DECLARATION__TOPICS:
        return ((InternalEList<?>)getTopics()).basicRemove(otherEnd, msgs);
      case NplPackage.DECLARATION__DATE:
        return basicSetDate(null, msgs);
      case NplPackage.DECLARATION__PRICE:
        return basicSetPrice(null, msgs);
      case NplPackage.DECLARATION__LANGUAGE:
        return basicSetLanguage(null, msgs);
      case NplPackage.DECLARATION__FORMAT:
        return basicSetFormat(null, msgs);
      case NplPackage.DECLARATION__FONT_SIZE:
        return basicSetFont_size(null, msgs);
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
      case NplPackage.DECLARATION__NAME:
        return getName();
      case NplPackage.DECLARATION__FEEDLINKS:
        return getFeedlinks();
      case NplPackage.DECLARATION__PAIRS:
        return getPairs();
      case NplPackage.DECLARATION__TOPICS:
        return getTopics();
      case NplPackage.DECLARATION__DATE:
        return getDate();
      case NplPackage.DECLARATION__LOCATION:
        return getLocation();
      case NplPackage.DECLARATION__PRICE:
        return getPrice();
      case NplPackage.DECLARATION__VOLUME:
        return getVolume();
      case NplPackage.DECLARATION__LANGUAGE:
        return getLanguage();
      case NplPackage.DECLARATION__FORMAT:
        return getFormat();
      case NplPackage.DECLARATION__ARTICLE_CNT:
        return getArticle_cnt();
      case NplPackage.DECLARATION__ARTICLE_CHAR_MIN:
        return getArticle_char_min();
      case NplPackage.DECLARATION__ARTICLE_CHAR_MAX:
        return getArticle_char_max();
      case NplPackage.DECLARATION__ARTICLE_IMAGES:
        return getArticle_images();
      case NplPackage.DECLARATION__COLUMNS_CNT:
        return getColumns_cnt();
      case NplPackage.DECLARATION__FONT_SIZE:
        return getFont_size();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case NplPackage.DECLARATION__NAME:
        setName((String)newValue);
        return;
      case NplPackage.DECLARATION__FEEDLINKS:
        getFeedlinks().clear();
        getFeedlinks().addAll((Collection<? extends Pair>)newValue);
        return;
      case NplPackage.DECLARATION__PAIRS:
        getPairs().clear();
        getPairs().addAll((Collection<? extends Pair>)newValue);
        return;
      case NplPackage.DECLARATION__TOPICS:
        getTopics().clear();
        getTopics().addAll((Collection<? extends Topic>)newValue);
        return;
      case NplPackage.DECLARATION__DATE:
        setDate((Date)newValue);
        return;
      case NplPackage.DECLARATION__LOCATION:
        setLocation((String)newValue);
        return;
      case NplPackage.DECLARATION__PRICE:
        setPrice((Price)newValue);
        return;
      case NplPackage.DECLARATION__VOLUME:
        setVolume((Integer)newValue);
        return;
      case NplPackage.DECLARATION__LANGUAGE:
        setLanguage((EString)newValue);
        return;
      case NplPackage.DECLARATION__FORMAT:
        setFormat((EString)newValue);
        return;
      case NplPackage.DECLARATION__ARTICLE_CNT:
        setArticle_cnt((Integer)newValue);
        return;
      case NplPackage.DECLARATION__ARTICLE_CHAR_MIN:
        setArticle_char_min((Integer)newValue);
        return;
      case NplPackage.DECLARATION__ARTICLE_CHAR_MAX:
        setArticle_char_max((Integer)newValue);
        return;
      case NplPackage.DECLARATION__ARTICLE_IMAGES:
        setArticle_images((Integer)newValue);
        return;
      case NplPackage.DECLARATION__COLUMNS_CNT:
        setColumns_cnt((Integer)newValue);
        return;
      case NplPackage.DECLARATION__FONT_SIZE:
        setFont_size((EString)newValue);
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
      case NplPackage.DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case NplPackage.DECLARATION__FEEDLINKS:
        getFeedlinks().clear();
        return;
      case NplPackage.DECLARATION__PAIRS:
        getPairs().clear();
        return;
      case NplPackage.DECLARATION__TOPICS:
        getTopics().clear();
        return;
      case NplPackage.DECLARATION__DATE:
        setDate((Date)null);
        return;
      case NplPackage.DECLARATION__LOCATION:
        setLocation(LOCATION_EDEFAULT);
        return;
      case NplPackage.DECLARATION__PRICE:
        setPrice((Price)null);
        return;
      case NplPackage.DECLARATION__VOLUME:
        setVolume(VOLUME_EDEFAULT);
        return;
      case NplPackage.DECLARATION__LANGUAGE:
        setLanguage((EString)null);
        return;
      case NplPackage.DECLARATION__FORMAT:
        setFormat((EString)null);
        return;
      case NplPackage.DECLARATION__ARTICLE_CNT:
        setArticle_cnt(ARTICLE_CNT_EDEFAULT);
        return;
      case NplPackage.DECLARATION__ARTICLE_CHAR_MIN:
        setArticle_char_min(ARTICLE_CHAR_MIN_EDEFAULT);
        return;
      case NplPackage.DECLARATION__ARTICLE_CHAR_MAX:
        setArticle_char_max(ARTICLE_CHAR_MAX_EDEFAULT);
        return;
      case NplPackage.DECLARATION__ARTICLE_IMAGES:
        setArticle_images(ARTICLE_IMAGES_EDEFAULT);
        return;
      case NplPackage.DECLARATION__COLUMNS_CNT:
        setColumns_cnt(COLUMNS_CNT_EDEFAULT);
        return;
      case NplPackage.DECLARATION__FONT_SIZE:
        setFont_size((EString)null);
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
      case NplPackage.DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case NplPackage.DECLARATION__FEEDLINKS:
        return feedlinks != null && !feedlinks.isEmpty();
      case NplPackage.DECLARATION__PAIRS:
        return pairs != null && !pairs.isEmpty();
      case NplPackage.DECLARATION__TOPICS:
        return topics != null && !topics.isEmpty();
      case NplPackage.DECLARATION__DATE:
        return date != null;
      case NplPackage.DECLARATION__LOCATION:
        return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
      case NplPackage.DECLARATION__PRICE:
        return price != null;
      case NplPackage.DECLARATION__VOLUME:
        return volume != VOLUME_EDEFAULT;
      case NplPackage.DECLARATION__LANGUAGE:
        return language != null;
      case NplPackage.DECLARATION__FORMAT:
        return format != null;
      case NplPackage.DECLARATION__ARTICLE_CNT:
        return article_cnt != ARTICLE_CNT_EDEFAULT;
      case NplPackage.DECLARATION__ARTICLE_CHAR_MIN:
        return article_char_min != ARTICLE_CHAR_MIN_EDEFAULT;
      case NplPackage.DECLARATION__ARTICLE_CHAR_MAX:
        return article_char_max != ARTICLE_CHAR_MAX_EDEFAULT;
      case NplPackage.DECLARATION__ARTICLE_IMAGES:
        return article_images != ARTICLE_IMAGES_EDEFAULT;
      case NplPackage.DECLARATION__COLUMNS_CNT:
        return columns_cnt != COLUMNS_CNT_EDEFAULT;
      case NplPackage.DECLARATION__FONT_SIZE:
        return font_size != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", location: ");
    result.append(location);
    result.append(", volume: ");
    result.append(volume);
    result.append(", article_cnt: ");
    result.append(article_cnt);
    result.append(", article_char_min: ");
    result.append(article_char_min);
    result.append(", article_char_max: ");
    result.append(article_char_max);
    result.append(", article_images: ");
    result.append(article_images);
    result.append(", columns_cnt: ");
    result.append(columns_cnt);
    result.append(')');
    return result.toString();
  }

} //DeclarationImpl
