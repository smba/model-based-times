/*
 * generated by Xtext
 */
package de.tu_bs.cs.isf.mbse.mbtimes.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import de.tu_bs.cs.isf.mbse.mbtimes.services.NplGrammarAccess;

public class NplParser extends AbstractContentAssistParser {
	
	@Inject
	private NplGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected de.tu_bs.cs.isf.mbse.mbtimes.ui.contentassist.antlr.internal.InternalNplParser createParser() {
		de.tu_bs.cs.isf.mbse.mbtimes.ui.contentassist.antlr.internal.InternalNplParser result = new de.tu_bs.cs.isf.mbse.mbtimes.ui.contentassist.antlr.internal.InternalNplParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getFontSizeAccess().getAlternatives(), "rule__FontSize__Alternatives");
					put(grammarAccess.getFormatAccess().getAlternatives(), "rule__Format__Alternatives");
					put(grammarAccess.getLanguageAccess().getAlternatives(), "rule__Language__Alternatives");
					put(grammarAccess.getCurrencyAccess().getAlternatives(), "rule__Currency__Alternatives");
					put(grammarAccess.getDeclarationAccess().getGroup(), "rule__Declaration__Group__0");
					put(grammarAccess.getDeclarationAccess().getGroup_6(), "rule__Declaration__Group_6__0");
					put(grammarAccess.getDeclarationAccess().getGroup_13(), "rule__Declaration__Group_13__0");
					put(grammarAccess.getDeclarationAccess().getGroup_14(), "rule__Declaration__Group_14__0");
					put(grammarAccess.getDeclarationAccess().getGroup_17(), "rule__Declaration__Group_17__0");
					put(grammarAccess.getDeclarationAccess().getGroup_28(), "rule__Declaration__Group_28__0");
					put(grammarAccess.getFontSizeAccess().getGroup_0(), "rule__FontSize__Group_0__0");
					put(grammarAccess.getFontSizeAccess().getGroup_1(), "rule__FontSize__Group_1__0");
					put(grammarAccess.getFontSizeAccess().getGroup_2(), "rule__FontSize__Group_2__0");
					put(grammarAccess.getFormatAccess().getGroup_0(), "rule__Format__Group_0__0");
					put(grammarAccess.getFormatAccess().getGroup_1(), "rule__Format__Group_1__0");
					put(grammarAccess.getFormatAccess().getGroup_2(), "rule__Format__Group_2__0");
					put(grammarAccess.getFormatAccess().getGroup_3(), "rule__Format__Group_3__0");
					put(grammarAccess.getFormatAccess().getGroup_4(), "rule__Format__Group_4__0");
					put(grammarAccess.getFormatAccess().getGroup_5(), "rule__Format__Group_5__0");
					put(grammarAccess.getFormatAccess().getGroup_6(), "rule__Format__Group_6__0");
					put(grammarAccess.getDateAccess().getGroup(), "rule__Date__Group__0");
					put(grammarAccess.getLanguageAccess().getGroup_0(), "rule__Language__Group_0__0");
					put(grammarAccess.getLanguageAccess().getGroup_1(), "rule__Language__Group_1__0");
					put(grammarAccess.getPriceAccess().getGroup(), "rule__Price__Group__0");
					put(grammarAccess.getCurrencyAccess().getGroup_0(), "rule__Currency__Group_0__0");
					put(grammarAccess.getCurrencyAccess().getGroup_1(), "rule__Currency__Group_1__0");
					put(grammarAccess.getTopicAccess().getGroup(), "rule__Topic__Group__0");
					put(grammarAccess.getTopicAccess().getGroup_4(), "rule__Topic__Group_4__0");
					put(grammarAccess.getPairAccess().getGroup(), "rule__Pair__Group__0");
					put(grammarAccess.getDeclarationAccess().getNameAssignment_1(), "rule__Declaration__NameAssignment_1");
					put(grammarAccess.getDeclarationAccess().getFeedlinksAssignment_5(), "rule__Declaration__FeedlinksAssignment_5");
					put(grammarAccess.getDeclarationAccess().getPairsAssignment_6_1(), "rule__Declaration__PairsAssignment_6_1");
					put(grammarAccess.getDeclarationAccess().getTopicsAssignment_10(), "rule__Declaration__TopicsAssignment_10");
					put(grammarAccess.getDeclarationAccess().getTopicsAssignment_11(), "rule__Declaration__TopicsAssignment_11");
					put(grammarAccess.getDeclarationAccess().getDateAssignment_13_1(), "rule__Declaration__DateAssignment_13_1");
					put(grammarAccess.getDeclarationAccess().getLocationAssignment_14_1(), "rule__Declaration__LocationAssignment_14_1");
					put(grammarAccess.getDeclarationAccess().getPriceAssignment_16(), "rule__Declaration__PriceAssignment_16");
					put(grammarAccess.getDeclarationAccess().getVolumeAssignment_17_1(), "rule__Declaration__VolumeAssignment_17_1");
					put(grammarAccess.getDeclarationAccess().getLanguageAssignment_19(), "rule__Declaration__LanguageAssignment_19");
					put(grammarAccess.getDeclarationAccess().getFormatAssignment_21(), "rule__Declaration__FormatAssignment_21");
					put(grammarAccess.getDeclarationAccess().getArticle_cntAssignment_23(), "rule__Declaration__Article_cntAssignment_23");
					put(grammarAccess.getDeclarationAccess().getArticle_char_minAssignment_25(), "rule__Declaration__Article_char_minAssignment_25");
					put(grammarAccess.getDeclarationAccess().getArticle_char_maxAssignment_27(), "rule__Declaration__Article_char_maxAssignment_27");
					put(grammarAccess.getDeclarationAccess().getArticle_imagesAssignment_28_1(), "rule__Declaration__Article_imagesAssignment_28_1");
					put(grammarAccess.getDeclarationAccess().getColumns_cntAssignment_30(), "rule__Declaration__Columns_cntAssignment_30");
					put(grammarAccess.getDeclarationAccess().getFont_sizeAssignment_32(), "rule__Declaration__Font_sizeAssignment_32");
					put(grammarAccess.getDateAccess().getDayAssignment_1(), "rule__Date__DayAssignment_1");
					put(grammarAccess.getDateAccess().getMonthAssignment_3(), "rule__Date__MonthAssignment_3");
					put(grammarAccess.getDateAccess().getYearAssignment_5(), "rule__Date__YearAssignment_5");
					put(grammarAccess.getPriceAccess().getValueAssignment_1(), "rule__Price__ValueAssignment_1");
					put(grammarAccess.getPriceAccess().getCurrencyAssignment_2(), "rule__Price__CurrencyAssignment_2");
					put(grammarAccess.getTopicAccess().getNameAssignment_1(), "rule__Topic__NameAssignment_1");
					put(grammarAccess.getTopicAccess().getTagsAssignment_3(), "rule__Topic__TagsAssignment_3");
					put(grammarAccess.getTopicAccess().getTagsAssignment_4_1(), "rule__Topic__TagsAssignment_4_1");
					put(grammarAccess.getTopicTagAccess().getValueAssignment(), "rule__TopicTag__ValueAssignment");
					put(grammarAccess.getPairAccess().getKeyAssignment_0(), "rule__Pair__KeyAssignment_0");
					put(grammarAccess.getPairAccess().getValueAssignment_2(), "rule__Pair__ValueAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			de.tu_bs.cs.isf.mbse.mbtimes.ui.contentassist.antlr.internal.InternalNplParser typedParser = (de.tu_bs.cs.isf.mbse.mbtimes.ui.contentassist.antlr.internal.InternalNplParser) parser;
			typedParser.entryRuleDeclaration();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public NplGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(NplGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
