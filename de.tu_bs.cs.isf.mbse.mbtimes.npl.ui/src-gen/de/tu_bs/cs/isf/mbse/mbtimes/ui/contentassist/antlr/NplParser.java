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
					put(grammarAccess.getFloatAccess().getAlternatives_1_0(), "rule__Float__Alternatives_1_0");
					put(grammarAccess.getFeedTypeAccess().getAlternatives(), "rule__FeedType__Alternatives");
					put(grammarAccess.getDeclarationAccess().getGroup_0(), "rule__Declaration__Group_0__0");
					put(grammarAccess.getDeclarationAccess().getGroup_1(), "rule__Declaration__Group_1__0");
					put(grammarAccess.getDeclarationAccess().getGroup_2(), "rule__Declaration__Group_2__0");
					put(grammarAccess.getDeclarationAccess().getGroup_3(), "rule__Declaration__Group_3__0");
					put(grammarAccess.getDeclarationAccess().getGroup_4(), "rule__Declaration__Group_4__0");
					put(grammarAccess.getDeclarationAccess().getGroup_5(), "rule__Declaration__Group_5__0");
					put(grammarAccess.getDeclarationAccess().getGroup_6(), "rule__Declaration__Group_6__0");
					put(grammarAccess.getDeclarationAccess().getGroup_6_2(), "rule__Declaration__Group_6_2__0");
					put(grammarAccess.getDeclarationAccess().getGroup_7(), "rule__Declaration__Group_7__0");
					put(grammarAccess.getDeclarationAccess().getGroup_8(), "rule__Declaration__Group_8__0");
					put(grammarAccess.getDeclarationAccess().getGroup_9(), "rule__Declaration__Group_9__0");
					put(grammarAccess.getDeclarationAccess().getGroup_10(), "rule__Declaration__Group_10__0");
					put(grammarAccess.getDeclarationAccess().getGroup_11(), "rule__Declaration__Group_11__0");
					put(grammarAccess.getDeclarationAccess().getGroup_12(), "rule__Declaration__Group_12__0");
					put(grammarAccess.getDeclarationAccess().getGroup_13(), "rule__Declaration__Group_13__0");
					put(grammarAccess.getDateAccess().getGroup(), "rule__Date__Group__0");
					put(grammarAccess.getPriceAccess().getGroup(), "rule__Price__Group__0");
					put(grammarAccess.getTopicAccess().getGroup(), "rule__Topic__Group__0");
					put(grammarAccess.getTopicAccess().getGroup_6(), "rule__Topic__Group_6__0");
					put(grammarAccess.getPairAccess().getGroup(), "rule__Pair__Group__0");
					put(grammarAccess.getFloatAccess().getGroup(), "rule__Float__Group__0");
					put(grammarAccess.getFloatAccess().getGroup_1(), "rule__Float__Group_1__0");
					put(grammarAccess.getDeclarationAccess().getNameAssignment_0_1(), "rule__Declaration__NameAssignment_0_1");
					put(grammarAccess.getDeclarationAccess().getTitleAssignment_1_1(), "rule__Declaration__TitleAssignment_1_1");
					put(grammarAccess.getDeclarationAccess().getFeedlinksAssignment_1_4(), "rule__Declaration__FeedlinksAssignment_1_4");
					put(grammarAccess.getDeclarationAccess().getFeedlinksAssignment_1_5(), "rule__Declaration__FeedlinksAssignment_1_5");
					put(grammarAccess.getDeclarationAccess().getTopicsAssignment_2_2(), "rule__Declaration__TopicsAssignment_2_2");
					put(grammarAccess.getDeclarationAccess().getTopicsAssignment_2_3(), "rule__Declaration__TopicsAssignment_2_3");
					put(grammarAccess.getDeclarationAccess().getDateAssignment_3_1(), "rule__Declaration__DateAssignment_3_1");
					put(grammarAccess.getDeclarationAccess().getLocationAssignment_4_1(), "rule__Declaration__LocationAssignment_4_1");
					put(grammarAccess.getDeclarationAccess().getPriceAssignment_5_1(), "rule__Declaration__PriceAssignment_5_1");
					put(grammarAccess.getDeclarationAccess().getVolumeAssignment_6_1(), "rule__Declaration__VolumeAssignment_6_1");
					put(grammarAccess.getDeclarationAccess().getNumberAssignment_6_2_1(), "rule__Declaration__NumberAssignment_6_2_1");
					put(grammarAccess.getDeclarationAccess().getLanguageAssignment_7_1(), "rule__Declaration__LanguageAssignment_7_1");
					put(grammarAccess.getDeclarationAccess().getFormatAssignment_8_1(), "rule__Declaration__FormatAssignment_8_1");
					put(grammarAccess.getDeclarationAccess().getArticleCntAssignment_9_1(), "rule__Declaration__ArticleCntAssignment_9_1");
					put(grammarAccess.getDeclarationAccess().getArticleWordsMinAssignment_10_1(), "rule__Declaration__ArticleWordsMinAssignment_10_1");
					put(grammarAccess.getDeclarationAccess().getArticleWordsMaxAssignment_10_3(), "rule__Declaration__ArticleWordsMaxAssignment_10_3");
					put(grammarAccess.getDeclarationAccess().getImagesCntAssignment_11_1(), "rule__Declaration__ImagesCntAssignment_11_1");
					put(grammarAccess.getDeclarationAccess().getColumnsCntAssignment_12_1(), "rule__Declaration__ColumnsCntAssignment_12_1");
					put(grammarAccess.getDeclarationAccess().getFontSizeAssignment_13_1(), "rule__Declaration__FontSizeAssignment_13_1");
					put(grammarAccess.getImagesCountAccess().getValueAssignment(), "rule__ImagesCount__ValueAssignment");
					put(grammarAccess.getFontSizeAccess().getValueAssignment_0(), "rule__FontSize__ValueAssignment_0");
					put(grammarAccess.getFontSizeAccess().getValueAssignment_1(), "rule__FontSize__ValueAssignment_1");
					put(grammarAccess.getFontSizeAccess().getValueAssignment_2(), "rule__FontSize__ValueAssignment_2");
					put(grammarAccess.getFormatAccess().getValueAssignment_0(), "rule__Format__ValueAssignment_0");
					put(grammarAccess.getFormatAccess().getValueAssignment_1(), "rule__Format__ValueAssignment_1");
					put(grammarAccess.getFormatAccess().getValueAssignment_2(), "rule__Format__ValueAssignment_2");
					put(grammarAccess.getFormatAccess().getValueAssignment_3(), "rule__Format__ValueAssignment_3");
					put(grammarAccess.getFormatAccess().getValueAssignment_4(), "rule__Format__ValueAssignment_4");
					put(grammarAccess.getFormatAccess().getValueAssignment_5(), "rule__Format__ValueAssignment_5");
					put(grammarAccess.getFormatAccess().getValueAssignment_6(), "rule__Format__ValueAssignment_6");
					put(grammarAccess.getDateAccess().getDayAssignment_1(), "rule__Date__DayAssignment_1");
					put(grammarAccess.getDateAccess().getMonthAssignment_3(), "rule__Date__MonthAssignment_3");
					put(grammarAccess.getDateAccess().getYearAssignment_5(), "rule__Date__YearAssignment_5");
					put(grammarAccess.getLanguageAccess().getValueAssignment_0(), "rule__Language__ValueAssignment_0");
					put(grammarAccess.getLanguageAccess().getValueAssignment_1(), "rule__Language__ValueAssignment_1");
					put(grammarAccess.getPriceAccess().getValueAssignment_1(), "rule__Price__ValueAssignment_1");
					put(grammarAccess.getPriceAccess().getCurrencyAssignment_2(), "rule__Price__CurrencyAssignment_2");
					put(grammarAccess.getCurrencyAccess().getValueAssignment_0(), "rule__Currency__ValueAssignment_0");
					put(grammarAccess.getCurrencyAccess().getValueAssignment_1(), "rule__Currency__ValueAssignment_1");
					put(grammarAccess.getCurrencyAccess().getValueAssignment_2(), "rule__Currency__ValueAssignment_2");
					put(grammarAccess.getCurrencyAccess().getValueAssignment_3(), "rule__Currency__ValueAssignment_3");
					put(grammarAccess.getCurrencyAccess().getValueAssignment_4(), "rule__Currency__ValueAssignment_4");
					put(grammarAccess.getCurrencyAccess().getValueAssignment_5(), "rule__Currency__ValueAssignment_5");
					put(grammarAccess.getTopicAccess().getNameAssignment_1(), "rule__Topic__NameAssignment_1");
					put(grammarAccess.getTopicAccess().getTitleAssignment_3(), "rule__Topic__TitleAssignment_3");
					put(grammarAccess.getTopicAccess().getTagsAssignment_5(), "rule__Topic__TagsAssignment_5");
					put(grammarAccess.getTopicAccess().getTagsAssignment_6_1(), "rule__Topic__TagsAssignment_6_1");
					put(grammarAccess.getPairAccess().getTypeAssignment_0(), "rule__Pair__TypeAssignment_0");
					put(grammarAccess.getPairAccess().getKeyAssignment_1(), "rule__Pair__KeyAssignment_1");
					put(grammarAccess.getPairAccess().getValueAssignment_3(), "rule__Pair__ValueAssignment_3");
					put(grammarAccess.getDeclarationAccess().getUnorderedGroup(), "rule__Declaration__UnorderedGroup");
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
