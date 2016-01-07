/*
 * generated by Xtext
 */
package de.tu_bs.cs.isf.mbse.mbtimes.serializer;

import com.google.inject.Inject;
import de.tu_bs.cs.isf.mbse.mbtimes.npl.Currency;
import de.tu_bs.cs.isf.mbse.mbtimes.npl.Date;
import de.tu_bs.cs.isf.mbse.mbtimes.npl.Declaration;
import de.tu_bs.cs.isf.mbse.mbtimes.npl.FontSize;
import de.tu_bs.cs.isf.mbse.mbtimes.npl.Format;
import de.tu_bs.cs.isf.mbse.mbtimes.npl.ImagesCount;
import de.tu_bs.cs.isf.mbse.mbtimes.npl.Language;
import de.tu_bs.cs.isf.mbse.mbtimes.npl.NplPackage;
import de.tu_bs.cs.isf.mbse.mbtimes.npl.Pair;
import de.tu_bs.cs.isf.mbse.mbtimes.npl.Price;
import de.tu_bs.cs.isf.mbse.mbtimes.npl.Topic;
import de.tu_bs.cs.isf.mbse.mbtimes.npl.TopicTag;
import de.tu_bs.cs.isf.mbse.mbtimes.services.NplGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class NplSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private NplGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == NplPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case NplPackage.CURRENCY:
				sequence_Currency(context, (Currency) semanticObject); 
				return; 
			case NplPackage.DATE:
				sequence_Date(context, (Date) semanticObject); 
				return; 
			case NplPackage.DECLARATION:
				sequence_Declaration(context, (Declaration) semanticObject); 
				return; 
			case NplPackage.FONT_SIZE:
				sequence_FontSize(context, (FontSize) semanticObject); 
				return; 
			case NplPackage.FORMAT:
				sequence_Format(context, (Format) semanticObject); 
				return; 
			case NplPackage.IMAGES_COUNT:
				sequence_ImagesCount(context, (ImagesCount) semanticObject); 
				return; 
			case NplPackage.LANGUAGE:
				sequence_Language(context, (Language) semanticObject); 
				return; 
			case NplPackage.PAIR:
				sequence_Pair(context, (Pair) semanticObject); 
				return; 
			case NplPackage.PRICE:
				sequence_Price(context, (Price) semanticObject); 
				return; 
			case NplPackage.TOPIC:
				sequence_Topic(context, (Topic) semanticObject); 
				return; 
			case NplPackage.TOPIC_TAG:
				sequence_TopicTag(context, (TopicTag) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Currency returns Currency
	 *
	 * Constraint:
	 *     (value='EUR' | value='DOLLAR')
	 */
	protected void sequence_Currency(ISerializationContext context, Currency semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Date returns Date
	 *
	 * Constraint:
	 *     (day=INT month=INT year=INT)
	 */
	protected void sequence_Date(ISerializationContext context, Date semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, NplPackage.Literals.DATE__DAY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NplPackage.Literals.DATE__DAY));
			if (transientValues.isValueTransient(semanticObject, NplPackage.Literals.DATE__MONTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NplPackage.Literals.DATE__MONTH));
			if (transientValues.isValueTransient(semanticObject, NplPackage.Literals.DATE__YEAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NplPackage.Literals.DATE__YEAR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDateAccess().getDayINTTerminalRuleCall_1_0(), semanticObject.getDay());
		feeder.accept(grammarAccess.getDateAccess().getMonthINTTerminalRuleCall_3_0(), semanticObject.getMonth());
		feeder.accept(grammarAccess.getDateAccess().getYearINTTerminalRuleCall_5_0(), semanticObject.getYear());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Declaration returns Declaration
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             name=ID | 
	 *             date=Date | 
	 *             location=STRING | 
	 *             price=Price | 
	 *             language=Language | 
	 *             format=Format | 
	 *             articleCnt=INT | 
	 *             imagesCnt=ImagesCount | 
	 *             columnsCnt=INT | 
	 *             fontSize=FontSize
	 *         )? 
	 *         (topics+=Topic topics+=Topic*)? 
	 *         (volume=INT number=INT)? 
	 *         (articleWordsMin=INT articleWordsMax=INT)? 
	 *         (recrawl?='recrawl' feedlinks+=Pair feedlinks+=Pair*)?
	 *     )+
	 */
	protected void sequence_Declaration(ISerializationContext context, Declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FontSize returns FontSize
	 *
	 * Constraint:
	 *     (value='small' | value='medium' | value='large')
	 */
	protected void sequence_FontSize(ISerializationContext context, FontSize semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Format returns Format
	 *
	 * Constraint:
	 *     (
	 *         value='DIN A6' | 
	 *         value='DIN A5' | 
	 *         value='DIN A4' | 
	 *         value='DIN A3' | 
	 *         value='DIN A2' | 
	 *         value='DIN A1' | 
	 *         value='DIN A0'
	 *     )
	 */
	protected void sequence_Format(ISerializationContext context, Format semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ImagesCount returns ImagesCount
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_ImagesCount(ISerializationContext context, ImagesCount semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, NplPackage.Literals.IMAGES_COUNT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NplPackage.Literals.IMAGES_COUNT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImagesCountAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Language returns Language
	 *
	 * Constraint:
	 *     (value='English' | value='German')
	 */
	protected void sequence_Language(ISerializationContext context, Language semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Pair returns Pair
	 *
	 * Constraint:
	 *     (type=FeedType key=STRING value=URL)
	 */
	protected void sequence_Pair(ISerializationContext context, Pair semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, NplPackage.Literals.PAIR__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NplPackage.Literals.PAIR__TYPE));
			if (transientValues.isValueTransient(semanticObject, NplPackage.Literals.PAIR__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NplPackage.Literals.PAIR__KEY));
			if (transientValues.isValueTransient(semanticObject, NplPackage.Literals.PAIR__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NplPackage.Literals.PAIR__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPairAccess().getTypeFeedTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getPairAccess().getKeySTRINGTerminalRuleCall_1_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getPairAccess().getValueURLTerminalRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Price returns Price
	 *
	 * Constraint:
	 *     (value=Float currency=Currency)
	 */
	protected void sequence_Price(ISerializationContext context, Price semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, NplPackage.Literals.PRICE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NplPackage.Literals.PRICE__VALUE));
			if (transientValues.isValueTransient(semanticObject, NplPackage.Literals.PRICE__CURRENCY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NplPackage.Literals.PRICE__CURRENCY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPriceAccess().getValueFloatParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getPriceAccess().getCurrencyCurrencyParserRuleCall_2_0(), semanticObject.getCurrency());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TopicTag returns TopicTag
	 *
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_TopicTag(ISerializationContext context, TopicTag semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, NplPackage.Literals.TOPIC_TAG__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NplPackage.Literals.TOPIC_TAG__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTopicTagAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Topic returns Topic
	 *
	 * Constraint:
	 *     (name=ID tags+=TopicTag tags+=TopicTag*)
	 */
	protected void sequence_Topic(ISerializationContext context, Topic semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
