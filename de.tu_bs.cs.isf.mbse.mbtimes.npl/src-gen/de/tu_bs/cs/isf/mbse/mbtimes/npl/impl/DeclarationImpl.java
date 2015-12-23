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
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.DeclarationImpl#getArticleCnt <em>Article Cnt</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.DeclarationImpl#getArticleWordsMin <em>Article Words Min</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.DeclarationImpl#getArticleWordsMax <em>Article Words Max</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.DeclarationImpl#getImagesCnt <em>Images Cnt</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.DeclarationImpl#getColumnsCnt <em>Columns Cnt</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.mbtimes.npl.impl.DeclarationImpl#getFontSize <em>Font Size</em>}</li>
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
   * The default value of the '{@link #getArticleCnt() <em>Article Cnt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArticleCnt()
   * @generated
   * @ordered
   */
  protected static final int ARTICLE_CNT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getArticleCnt() <em>Article Cnt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArticleCnt()
   * @generated
   * @ordered
   */
  protected int articleCnt = ARTICLE_CNT_EDEFAULT;

  /**
   * The default value of the '{@link #getArticleWordsMin() <em>Article Words Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArticleWordsMin()
   * @generated
   * @ordered
   */
  protected static final int ARTICLE_WORDS_MIN_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getArticleWordsMin() <em>Article Words Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArticleWordsMin()
   * @generated
   * @ordered
   */
  protected int articleWordsMin = ARTICLE_WORDS_MIN_EDEFAULT;

  /**
   * The default value of the '{@link #getArticleWordsMax() <em>Article Words Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArticleWordsMax()
   * @generated
   * @ordered
   */
  protected static final int ARTICLE_WORDS_MAX_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getArticleWordsMax() <em>Article Words Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArticleWordsMax()
   * @generated
   * @ordered
   */
  protected int articleWordsMax = ARTICLE_WORDS_MAX_EDEFAULT;

  /**
   * The default value of the '{@link #getImagesCnt() <em>Images Cnt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImagesCnt()
   * @generated
   * @ordered
   */
  protected static final int IMAGES_CNT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getImagesCnt() <em>Images Cnt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImagesCnt()
   * @generated
   * @ordered
   */
  protected int imagesCnt = IMAGES_CNT_EDEFAULT;

  /**
   * The default value of the '{@link #getColumnsCnt() <em>Columns Cnt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumnsCnt()
   * @generated
   * @ordered
   */
  protected static final int COLUMNS_CNT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getColumnsCnt() <em>Columns Cnt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumnsCnt()
   * @generated
   * @ordered
   */
  protected int columnsCnt = COLUMNS_CNT_EDEFAULT;

  /**
   * The cached value of the '{@link #getFontSize() <em>Font Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFontSize()
   * @generated
   * @ordered
   */
  protected EString fontSize;

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
  public int getArticleCnt()
  {
    return articleCnt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArticleCnt(int newArticleCnt)
  {
    int oldArticleCnt = articleCnt;
    articleCnt = newArticleCnt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NplPackage.DECLARATION__ARTICLE_CNT, oldArticleCnt, articleCnt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getArticleWordsMin()
  {
    return articleWordsMin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArticleWordsMin(int newArticleWordsMin)
  {
    int oldArticleWordsMin = articleWordsMin;
    articleWordsMin = newArticleWordsMin;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NplPackage.DECLARATION__ARTICLE_WORDS_MIN, oldArticleWordsMin, articleWordsMin));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getArticleWordsMax()
  {
    return articleWordsMax;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArticleWordsMax(int newArticleWordsMax)
  {
    int oldArticleWordsMax = articleWordsMax;
    articleWordsMax = newArticleWordsMax;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NplPackage.DECLARATION__ARTICLE_WORDS_MAX, oldArticleWordsMax, articleWordsMax));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getImagesCnt()
  {
    return imagesCnt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImagesCnt(int newImagesCnt)
  {
    int oldImagesCnt = imagesCnt;
    imagesCnt = newImagesCnt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NplPackage.DECLARATION__IMAGES_CNT, oldImagesCnt, imagesCnt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getColumnsCnt()
  {
    return columnsCnt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColumnsCnt(int newColumnsCnt)
  {
    int oldColumnsCnt = columnsCnt;
    columnsCnt = newColumnsCnt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NplPackage.DECLARATION__COLUMNS_CNT, oldColumnsCnt, columnsCnt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EString getFontSize()
  {
    return fontSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFontSize(EString newFontSize, NotificationChain msgs)
  {
    EString oldFontSize = fontSize;
    fontSize = newFontSize;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NplPackage.DECLARATION__FONT_SIZE, oldFontSize, newFontSize);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFontSize(EString newFontSize)
  {
    if (newFontSize != fontSize)
    {
      NotificationChain msgs = null;
      if (fontSize != null)
        msgs = ((InternalEObject)fontSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NplPackage.DECLARATION__FONT_SIZE, null, msgs);
      if (newFontSize != null)
        msgs = ((InternalEObject)newFontSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NplPackage.DECLARATION__FONT_SIZE, null, msgs);
      msgs = basicSetFontSize(newFontSize, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NplPackage.DECLARATION__FONT_SIZE, newFontSize, newFontSize));
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
        return basicSetFontSize(null, msgs);
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
        return getArticleCnt();
      case NplPackage.DECLARATION__ARTICLE_WORDS_MIN:
        return getArticleWordsMin();
      case NplPackage.DECLARATION__ARTICLE_WORDS_MAX:
        return getArticleWordsMax();
      case NplPackage.DECLARATION__IMAGES_CNT:
        return getImagesCnt();
      case NplPackage.DECLARATION__COLUMNS_CNT:
        return getColumnsCnt();
      case NplPackage.DECLARATION__FONT_SIZE:
        return getFontSize();
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
        setArticleCnt((Integer)newValue);
        return;
      case NplPackage.DECLARATION__ARTICLE_WORDS_MIN:
        setArticleWordsMin((Integer)newValue);
        return;
      case NplPackage.DECLARATION__ARTICLE_WORDS_MAX:
        setArticleWordsMax((Integer)newValue);
        return;
      case NplPackage.DECLARATION__IMAGES_CNT:
        setImagesCnt((Integer)newValue);
        return;
      case NplPackage.DECLARATION__COLUMNS_CNT:
        setColumnsCnt((Integer)newValue);
        return;
      case NplPackage.DECLARATION__FONT_SIZE:
        setFontSize((EString)newValue);
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
        setArticleCnt(ARTICLE_CNT_EDEFAULT);
        return;
      case NplPackage.DECLARATION__ARTICLE_WORDS_MIN:
        setArticleWordsMin(ARTICLE_WORDS_MIN_EDEFAULT);
        return;
      case NplPackage.DECLARATION__ARTICLE_WORDS_MAX:
        setArticleWordsMax(ARTICLE_WORDS_MAX_EDEFAULT);
        return;
      case NplPackage.DECLARATION__IMAGES_CNT:
        setImagesCnt(IMAGES_CNT_EDEFAULT);
        return;
      case NplPackage.DECLARATION__COLUMNS_CNT:
        setColumnsCnt(COLUMNS_CNT_EDEFAULT);
        return;
      case NplPackage.DECLARATION__FONT_SIZE:
        setFontSize((EString)null);
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
        return articleCnt != ARTICLE_CNT_EDEFAULT;
      case NplPackage.DECLARATION__ARTICLE_WORDS_MIN:
        return articleWordsMin != ARTICLE_WORDS_MIN_EDEFAULT;
      case NplPackage.DECLARATION__ARTICLE_WORDS_MAX:
        return articleWordsMax != ARTICLE_WORDS_MAX_EDEFAULT;
      case NplPackage.DECLARATION__IMAGES_CNT:
        return imagesCnt != IMAGES_CNT_EDEFAULT;
      case NplPackage.DECLARATION__COLUMNS_CNT:
        return columnsCnt != COLUMNS_CNT_EDEFAULT;
      case NplPackage.DECLARATION__FONT_SIZE:
        return fontSize != null;
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
    result.append(", articleCnt: ");
    result.append(articleCnt);
    result.append(", articleWordsMin: ");
    result.append(articleWordsMin);
    result.append(", articleWordsMax: ");
    result.append(articleWordsMax);
    result.append(", imagesCnt: ");
    result.append(imagesCnt);
    result.append(", columnsCnt: ");
    result.append(columnsCnt);
    result.append(')');
    return result.toString();
  }

} //DeclarationImpl
