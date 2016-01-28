/*
 * generated by Xtext
 */
grammar InternalNpl;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package de.tu_bs.cs.isf.mbse.mbtimes.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package de.tu_bs.cs.isf.mbse.mbtimes.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.tu_bs.cs.isf.mbse.mbtimes.services.NplGrammarAccess;

}

@parser::members {

 	private NplGrammarAccess grammarAccess;
 	
    public InternalNplParser(TokenStream input, NplGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Declaration";	
   	}
   	
   	@Override
   	protected NplGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleDeclaration
entryRuleDeclaration returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDeclarationRule()); }
	 iv_ruleDeclaration=ruleDeclaration 
	 { $current=$iv_ruleDeclaration.current; } 
	 EOF 
;

// Rule Declaration
ruleDeclaration returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getDeclarationAccess().getUnorderedGroup());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 0);
	 				}
					({true}?=>(	otherlv_1='newspaper' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getDeclarationAccess().getNewspaperKeyword_0_0());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getDeclarationAccess().getNameIDTerminalRuleCall_0_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDeclarationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"org.eclipse.xtext.common.Terminals.ID");
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getDeclarationAccess().getLeftCurlyBracketKeyword_0_2());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeclarationAccess().getUnorderedGroup());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1);
	 				}
					({true}?=>((
(
		lv_recrawl_4_0=	'recrawl' 
    {
        newLeafNode(lv_recrawl_4_0, grammarAccess.getDeclarationAccess().getRecrawlRecrawlKeyword_1_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDeclarationRule());
	        }
       		setWithLastConsumed($current, "recrawl", true, "recrawl");
	    }

)
)	otherlv_5='feed links' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getDeclarationAccess().getFeedLinksKeyword_1_1());
    }
	otherlv_6='{' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getDeclarationAccess().getLeftCurlyBracketKeyword_1_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDeclarationAccess().getFeedlinksPairParserRuleCall_1_3_0()); 
	    }
		lv_feedlinks_7_0=rulePair		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDeclarationRule());
	        }
       		add(
       			$current, 
       			"feedlinks",
        		lv_feedlinks_7_0, 
        		"de.tu_bs.cs.isf.mbse.mbtimes.Npl.Pair");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getDeclarationAccess().getFeedlinksPairParserRuleCall_1_4_0()); 
	    }
		lv_feedlinks_8_0=rulePair		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDeclarationRule());
	        }
       		add(
       			$current, 
       			"feedlinks",
        		lv_feedlinks_8_0, 
        		"de.tu_bs.cs.isf.mbse.mbtimes.Npl.Pair");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_9='}' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getDeclarationAccess().getRightCurlyBracketKeyword_1_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeclarationAccess().getUnorderedGroup());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2);
	 				}
					({true}?=>(	otherlv_10='topics' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getDeclarationAccess().getTopicsKeyword_2_0());
    }
	otherlv_11='{' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getDeclarationAccess().getLeftCurlyBracketKeyword_2_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDeclarationAccess().getTopicsTopicParserRuleCall_2_2_0()); 
	    }
		lv_topics_12_0=ruleTopic		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDeclarationRule());
	        }
       		add(
       			$current, 
       			"topics",
        		lv_topics_12_0, 
        		"de.tu_bs.cs.isf.mbse.mbtimes.Npl.Topic");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getDeclarationAccess().getTopicsTopicParserRuleCall_2_3_0()); 
	    }
		lv_topics_13_0=ruleTopic		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDeclarationRule());
	        }
       		add(
       			$current, 
       			"topics",
        		lv_topics_13_0, 
        		"de.tu_bs.cs.isf.mbse.mbtimes.Npl.Topic");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_14='}' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getDeclarationAccess().getRightCurlyBracketKeyword_2_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeclarationAccess().getUnorderedGroup());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3);
	 				}
					({true}?=>(	otherlv_15='optional: date' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getDeclarationAccess().getOptionalDateKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDeclarationAccess().getDateDateParserRuleCall_3_1_0()); 
	    }
		lv_date_16_0=ruleDate		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDeclarationRule());
	        }
       		set(
       			$current, 
       			"date",
        		lv_date_16_0, 
        		"de.tu_bs.cs.isf.mbse.mbtimes.Npl.Date");
	        afterParserOrEnumRuleCall();
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeclarationAccess().getUnorderedGroup());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4);
	 				}
					({true}?=>(	otherlv_17='optional: location' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getDeclarationAccess().getOptionalLocationKeyword_4_0());
    }
(
(
		lv_location_18_0=RULE_STRING
		{
			newLeafNode(lv_location_18_0, grammarAccess.getDeclarationAccess().getLocationSTRINGTerminalRuleCall_4_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDeclarationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"location",
        		lv_location_18_0, 
        		"org.eclipse.xtext.common.Terminals.STRING");
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeclarationAccess().getUnorderedGroup());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5);
	 				}
					({true}?=>(	otherlv_19='optional: price' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getDeclarationAccess().getOptionalPriceKeyword_5_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDeclarationAccess().getPricePriceParserRuleCall_5_1_0()); 
	    }
		lv_price_20_0=rulePrice		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDeclarationRule());
	        }
       		set(
       			$current, 
       			"price",
        		lv_price_20_0, 
        		"de.tu_bs.cs.isf.mbse.mbtimes.Npl.Price");
	        afterParserOrEnumRuleCall();
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeclarationAccess().getUnorderedGroup());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6);
	 				}
					({true}?=>(	otherlv_21='optional: volume' 
    {
    	newLeafNode(otherlv_21, grammarAccess.getDeclarationAccess().getOptionalVolumeKeyword_6_0());
    }
(
(
		lv_volume_22_0=RULE_INT
		{
			newLeafNode(lv_volume_22_0, grammarAccess.getDeclarationAccess().getVolumeINTTerminalRuleCall_6_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDeclarationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"volume",
        		lv_volume_22_0, 
        		"org.eclipse.xtext.common.Terminals.INT");
	    }

)
)(	otherlv_23='no.' 
    {
    	newLeafNode(otherlv_23, grammarAccess.getDeclarationAccess().getNoKeyword_6_2_0());
    }
(
(
		lv_number_24_0=RULE_INT
		{
			newLeafNode(lv_number_24_0, grammarAccess.getDeclarationAccess().getNumberINTTerminalRuleCall_6_2_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDeclarationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"number",
        		lv_number_24_0, 
        		"org.eclipse.xtext.common.Terminals.INT");
	    }

)
))?))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeclarationAccess().getUnorderedGroup());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7);
	 				}
					({true}?=>(	otherlv_25='optional: language' 
    {
    	newLeafNode(otherlv_25, grammarAccess.getDeclarationAccess().getOptionalLanguageKeyword_7_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDeclarationAccess().getLanguageLanguageParserRuleCall_7_1_0()); 
	    }
		lv_language_26_0=ruleLanguage		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDeclarationRule());
	        }
       		set(
       			$current, 
       			"language",
        		lv_language_26_0, 
        		"de.tu_bs.cs.isf.mbse.mbtimes.Npl.Language");
	        afterParserOrEnumRuleCall();
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeclarationAccess().getUnorderedGroup());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8);
	 				}
					({true}?=>(	otherlv_27='format' 
    {
    	newLeafNode(otherlv_27, grammarAccess.getDeclarationAccess().getFormatKeyword_8_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDeclarationAccess().getFormatFormatParserRuleCall_8_1_0()); 
	    }
		lv_format_28_0=ruleFormat		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDeclarationRule());
	        }
       		set(
       			$current, 
       			"format",
        		lv_format_28_0, 
        		"de.tu_bs.cs.isf.mbse.mbtimes.Npl.Format");
	        afterParserOrEnumRuleCall();
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeclarationAccess().getUnorderedGroup());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9);
	 				}
					({true}?=>(	otherlv_29='number of articles per topic' 
    {
    	newLeafNode(otherlv_29, grammarAccess.getDeclarationAccess().getNumberOfArticlesPerTopicKeyword_9_0());
    }
(
(
		lv_articleCnt_30_0=RULE_INT
		{
			newLeafNode(lv_articleCnt_30_0, grammarAccess.getDeclarationAccess().getArticleCntINTTerminalRuleCall_9_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDeclarationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"articleCnt",
        		lv_articleCnt_30_0, 
        		"org.eclipse.xtext.common.Terminals.INT");
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeclarationAccess().getUnorderedGroup());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10);
	 				}
					({true}?=>(	otherlv_31='number of words per article' 
    {
    	newLeafNode(otherlv_31, grammarAccess.getDeclarationAccess().getNumberOfWordsPerArticleKeyword_10_0());
    }
(
(
		lv_articleWordsMin_32_0=RULE_INT
		{
			newLeafNode(lv_articleWordsMin_32_0, grammarAccess.getDeclarationAccess().getArticleWordsMinINTTerminalRuleCall_10_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDeclarationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"articleWordsMin",
        		lv_articleWordsMin_32_0, 
        		"org.eclipse.xtext.common.Terminals.INT");
	    }

)
)	otherlv_33='-' 
    {
    	newLeafNode(otherlv_33, grammarAccess.getDeclarationAccess().getHyphenMinusKeyword_10_2());
    }
(
(
		lv_articleWordsMax_34_0=RULE_INT
		{
			newLeafNode(lv_articleWordsMax_34_0, grammarAccess.getDeclarationAccess().getArticleWordsMaxINTTerminalRuleCall_10_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDeclarationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"articleWordsMax",
        		lv_articleWordsMax_34_0, 
        		"org.eclipse.xtext.common.Terminals.INT");
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeclarationAccess().getUnorderedGroup());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11);
	 				}
					({true}?=>(	otherlv_35='optional: number of images per article' 
    {
    	newLeafNode(otherlv_35, grammarAccess.getDeclarationAccess().getOptionalNumberOfImagesPerArticleKeyword_11_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDeclarationAccess().getImagesCntImagesCountParserRuleCall_11_1_0()); 
	    }
		lv_imagesCnt_36_0=ruleImagesCount		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDeclarationRule());
	        }
       		set(
       			$current, 
       			"imagesCnt",
        		lv_imagesCnt_36_0, 
        		"de.tu_bs.cs.isf.mbse.mbtimes.Npl.ImagesCount");
	        afterParserOrEnumRuleCall();
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeclarationAccess().getUnorderedGroup());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12);
	 				}
					({true}?=>(	otherlv_37='number of columns' 
    {
    	newLeafNode(otherlv_37, grammarAccess.getDeclarationAccess().getNumberOfColumnsKeyword_12_0());
    }
(
(
		lv_columnsCnt_38_0=RULE_INT
		{
			newLeafNode(lv_columnsCnt_38_0, grammarAccess.getDeclarationAccess().getColumnsCntINTTerminalRuleCall_12_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDeclarationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"columnsCnt",
        		lv_columnsCnt_38_0, 
        		"org.eclipse.xtext.common.Terminals.INT");
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeclarationAccess().getUnorderedGroup());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13);
	 				}
					({true}?=>(	otherlv_39='font size' 
    {
    	newLeafNode(otherlv_39, grammarAccess.getDeclarationAccess().getFontSizeKeyword_13_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDeclarationAccess().getFontSizeFontSizeParserRuleCall_13_1_0()); 
	    }
		lv_fontSize_40_0=ruleFontSize		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDeclarationRule());
	        }
       		set(
       			$current, 
       			"fontSize",
        		lv_fontSize_40_0, 
        		"de.tu_bs.cs.isf.mbse.mbtimes.Npl.FontSize");
	        afterParserOrEnumRuleCall();
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeclarationAccess().getUnorderedGroup());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14);
	 				}
					({true}?=>(	otherlv_41='}' 
    {
    	newLeafNode(otherlv_41, grammarAccess.getDeclarationAccess().getRightCurlyBracketKeyword_14());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeclarationAccess().getUnorderedGroup());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getDeclarationAccess().getUnorderedGroup())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getDeclarationAccess().getUnorderedGroup());
	}

)
;





// Entry rule entryRuleImagesCount
entryRuleImagesCount returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getImagesCountRule()); }
	 iv_ruleImagesCount=ruleImagesCount 
	 { $current=$iv_ruleImagesCount.current; } 
	 EOF 
;

// Rule ImagesCount
ruleImagesCount returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_value_0_0=RULE_INT
		{
			newLeafNode(lv_value_0_0, grammarAccess.getImagesCountAccess().getValueINTTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getImagesCountRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"org.eclipse.xtext.common.Terminals.INT");
	    }

)
)
;





// Entry rule entryRuleFontSize
entryRuleFontSize returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFontSizeRule()); }
	 iv_ruleFontSize=ruleFontSize 
	 { $current=$iv_ruleFontSize.current; } 
	 EOF 
;

// Rule FontSize
ruleFontSize returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_value_0_0=	'small' 
    {
        newLeafNode(lv_value_0_0, grammarAccess.getFontSizeAccess().getValueSmallKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFontSizeRule());
	        }
       		setWithLastConsumed($current, "value", lv_value_0_0, "small");
	    }

)
)
    |(
(
		lv_value_1_0=	'medium' 
    {
        newLeafNode(lv_value_1_0, grammarAccess.getFontSizeAccess().getValueMediumKeyword_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFontSizeRule());
	        }
       		setWithLastConsumed($current, "value", lv_value_1_0, "medium");
	    }

)
)
    |(
(
		lv_value_2_0=	'large' 
    {
        newLeafNode(lv_value_2_0, grammarAccess.getFontSizeAccess().getValueLargeKeyword_2_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFontSizeRule());
	        }
       		setWithLastConsumed($current, "value", lv_value_2_0, "large");
	    }

)
))
;





// Entry rule entryRuleFormat
entryRuleFormat returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFormatRule()); }
	 iv_ruleFormat=ruleFormat 
	 { $current=$iv_ruleFormat.current; } 
	 EOF 
;

// Rule Format
ruleFormat returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_value_0_0=	'DIN A6' 
    {
        newLeafNode(lv_value_0_0, grammarAccess.getFormatAccess().getValueDINA6Keyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFormatRule());
	        }
       		setWithLastConsumed($current, "value", lv_value_0_0, "DIN A6");
	    }

)
)
    |(
(
		lv_value_1_0=	'DIN A5' 
    {
        newLeafNode(lv_value_1_0, grammarAccess.getFormatAccess().getValueDINA5Keyword_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFormatRule());
	        }
       		setWithLastConsumed($current, "value", lv_value_1_0, "DIN A5");
	    }

)
)
    |(
(
		lv_value_2_0=	'DIN A4' 
    {
        newLeafNode(lv_value_2_0, grammarAccess.getFormatAccess().getValueDINA4Keyword_2_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFormatRule());
	        }
       		setWithLastConsumed($current, "value", lv_value_2_0, "DIN A4");
	    }

)
)
    |(
(
		lv_value_3_0=	'DIN A3' 
    {
        newLeafNode(lv_value_3_0, grammarAccess.getFormatAccess().getValueDINA3Keyword_3_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFormatRule());
	        }
       		setWithLastConsumed($current, "value", lv_value_3_0, "DIN A3");
	    }

)
)
    |(
(
		lv_value_4_0=	'DIN A2' 
    {
        newLeafNode(lv_value_4_0, grammarAccess.getFormatAccess().getValueDINA2Keyword_4_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFormatRule());
	        }
       		setWithLastConsumed($current, "value", lv_value_4_0, "DIN A2");
	    }

)
)
    |(
(
		lv_value_5_0=	'DIN A1' 
    {
        newLeafNode(lv_value_5_0, grammarAccess.getFormatAccess().getValueDINA1Keyword_5_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFormatRule());
	        }
       		setWithLastConsumed($current, "value", lv_value_5_0, "DIN A1");
	    }

)
)
    |(
(
		lv_value_6_0=	'DIN A0' 
    {
        newLeafNode(lv_value_6_0, grammarAccess.getFormatAccess().getValueDINA0Keyword_6_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFormatRule());
	        }
       		setWithLastConsumed($current, "value", lv_value_6_0, "DIN A0");
	    }

)
))
;





// Entry rule entryRuleDate
entryRuleDate returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDateRule()); }
	 iv_ruleDate=ruleDate 
	 { $current=$iv_ruleDate.current; } 
	 EOF 
;

// Rule Date
ruleDate returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='{' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getDateAccess().getLeftCurlyBracketKeyword_0());
    }
(
(
		lv_day_1_0=RULE_INT
		{
			newLeafNode(lv_day_1_0, grammarAccess.getDateAccess().getDayINTTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDateRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"day",
        		lv_day_1_0, 
        		"org.eclipse.xtext.common.Terminals.INT");
	    }

)
)	otherlv_2='-' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getDateAccess().getHyphenMinusKeyword_2());
    }
(
(
		lv_month_3_0=RULE_INT
		{
			newLeafNode(lv_month_3_0, grammarAccess.getDateAccess().getMonthINTTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDateRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"month",
        		lv_month_3_0, 
        		"org.eclipse.xtext.common.Terminals.INT");
	    }

)
)	otherlv_4='-' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getDateAccess().getHyphenMinusKeyword_4());
    }
(
(
		lv_year_5_0=RULE_INT
		{
			newLeafNode(lv_year_5_0, grammarAccess.getDateAccess().getYearINTTerminalRuleCall_5_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDateRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"year",
        		lv_year_5_0, 
        		"org.eclipse.xtext.common.Terminals.INT");
	    }

)
)	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getDateAccess().getRightCurlyBracketKeyword_6());
    }
)
;





// Entry rule entryRuleLanguage
entryRuleLanguage returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getLanguageRule()); }
	 iv_ruleLanguage=ruleLanguage 
	 { $current=$iv_ruleLanguage.current; } 
	 EOF 
;

// Rule Language
ruleLanguage returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_value_0_0=	'English' 
    {
        newLeafNode(lv_value_0_0, grammarAccess.getLanguageAccess().getValueEnglishKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getLanguageRule());
	        }
       		setWithLastConsumed($current, "value", lv_value_0_0, "English");
	    }

)
)
    |(
(
		lv_value_1_0=	'German' 
    {
        newLeafNode(lv_value_1_0, grammarAccess.getLanguageAccess().getValueGermanKeyword_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getLanguageRule());
	        }
       		setWithLastConsumed($current, "value", lv_value_1_0, "German");
	    }

)
))
;





// Entry rule entryRulePrice
entryRulePrice returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPriceRule()); }
	 iv_rulePrice=rulePrice 
	 { $current=$iv_rulePrice.current; } 
	 EOF 
;

// Rule Price
rulePrice returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='{' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getPriceAccess().getLeftCurlyBracketKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPriceAccess().getValueFloatParserRuleCall_1_0()); 
	    }
		lv_value_1_0=ruleFloat		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPriceRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_1_0, 
        		"de.tu_bs.cs.isf.mbse.mbtimes.Npl.Float");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getPriceAccess().getCurrencyCurrencyParserRuleCall_2_0()); 
	    }
		lv_currency_2_0=ruleCurrency		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPriceRule());
	        }
       		set(
       			$current, 
       			"currency",
        		lv_currency_2_0, 
        		"de.tu_bs.cs.isf.mbse.mbtimes.Npl.Currency");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='}' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getPriceAccess().getRightCurlyBracketKeyword_3());
    }
)
;





// Entry rule entryRuleCurrency
entryRuleCurrency returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCurrencyRule()); }
	 iv_ruleCurrency=ruleCurrency 
	 { $current=$iv_ruleCurrency.current; } 
	 EOF 
;

// Rule Currency
ruleCurrency returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_value_0_0=	'Euro' 
    {
        newLeafNode(lv_value_0_0, grammarAccess.getCurrencyAccess().getValueEuroKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCurrencyRule());
	        }
       		setWithLastConsumed($current, "value", lv_value_0_0, "Euro");
	    }

)
)
    |(
(
		lv_value_1_0=	'EUR' 
    {
        newLeafNode(lv_value_1_0, grammarAccess.getCurrencyAccess().getValueEURKeyword_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCurrencyRule());
	        }
       		setWithLastConsumed($current, "value", lv_value_1_0, "EUR");
	    }

)
)
    |(
(
		lv_value_2_0=	'\u20AC' 
    {
        newLeafNode(lv_value_2_0, grammarAccess.getCurrencyAccess().getValueEuroSignKeyword_2_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCurrencyRule());
	        }
       		setWithLastConsumed($current, "value", lv_value_2_0, "\u20AC");
	    }

)
)
    |(
(
		lv_value_3_0=	'Dollar' 
    {
        newLeafNode(lv_value_3_0, grammarAccess.getCurrencyAccess().getValueDollarKeyword_3_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCurrencyRule());
	        }
       		setWithLastConsumed($current, "value", lv_value_3_0, "Dollar");
	    }

)
)
    |(
(
		lv_value_4_0=	'USD' 
    {
        newLeafNode(lv_value_4_0, grammarAccess.getCurrencyAccess().getValueUSDKeyword_4_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCurrencyRule());
	        }
       		setWithLastConsumed($current, "value", lv_value_4_0, "USD");
	    }

)
)
    |(
(
		lv_value_5_0=	'$' 
    {
        newLeafNode(lv_value_5_0, grammarAccess.getCurrencyAccess().getValueDollarSignKeyword_5_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCurrencyRule());
	        }
       		setWithLastConsumed($current, "value", lv_value_5_0, "\$");
	    }

)
))
;





// Entry rule entryRuleTopic
entryRuleTopic returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTopicRule()); }
	 iv_ruleTopic=ruleTopic 
	 { $current=$iv_ruleTopic.current; } 
	 EOF 
;

// Rule Topic
ruleTopic returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='topic' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getTopicAccess().getTopicKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getTopicAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTopicRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"org.eclipse.xtext.common.Terminals.ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getTopicAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		lv_tags_3_0=RULE_STRING
		{
			newLeafNode(lv_tags_3_0, grammarAccess.getTopicAccess().getTagsSTRINGTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTopicRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"tags",
        		lv_tags_3_0, 
        		"org.eclipse.xtext.common.Terminals.STRING");
	    }

)
)(	otherlv_4=', ' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getTopicAccess().getCommaSpaceKeyword_4_0());
    }
(
(
		lv_tags_5_0=RULE_STRING
		{
			newLeafNode(lv_tags_5_0, grammarAccess.getTopicAccess().getTagsSTRINGTerminalRuleCall_4_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTopicRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"tags",
        		lv_tags_5_0, 
        		"org.eclipse.xtext.common.Terminals.STRING");
	    }

)
))*	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getTopicAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRulePair
entryRulePair returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPairRule()); }
	 iv_rulePair=rulePair 
	 { $current=$iv_rulePair.current; } 
	 EOF 
;

// Rule Pair
rulePair returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getPairAccess().getTypeFeedTypeParserRuleCall_0_0()); 
	    }
		lv_type_0_0=ruleFeedType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPairRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_0_0, 
        		"de.tu_bs.cs.isf.mbse.mbtimes.Npl.FeedType");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_key_1_0=RULE_STRING
		{
			newLeafNode(lv_key_1_0, grammarAccess.getPairAccess().getKeySTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPairRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"key",
        		lv_key_1_0, 
        		"org.eclipse.xtext.common.Terminals.STRING");
	    }

)
)	otherlv_2='<' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getPairAccess().getLessThanSignKeyword_2());
    }
(
(
		lv_value_3_0=RULE_URL
		{
			newLeafNode(lv_value_3_0, grammarAccess.getPairAccess().getValueURLTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPairRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_3_0, 
        		"de.tu_bs.cs.isf.mbse.mbtimes.Npl.URL");
	    }

)
)	otherlv_4='>' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getPairAccess().getGreaterThanSignKeyword_4());
    }
)
;





// Entry rule entryRuleFloat
entryRuleFloat returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getFloatRule()); } 
	 iv_ruleFloat=ruleFloat 
	 { $current=$iv_ruleFloat.current.getText(); }  
	 EOF 
;

// Rule Float
ruleFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_INT_0=RULE_INT    {
		$current.merge(this_INT_0);
    }

    { 
    newLeafNode(this_INT_0, grammarAccess.getFloatAccess().getINTTerminalRuleCall_0()); 
    }
((
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getFloatAccess().getFullStopKeyword_1_0_0()); 
    }

    |
	kw=',' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getFloatAccess().getCommaKeyword_1_0_1()); 
    }
)    this_INT_3=RULE_INT    {
		$current.merge(this_INT_3);
    }

    { 
    newLeafNode(this_INT_3, grammarAccess.getFloatAccess().getINTTerminalRuleCall_1_1()); 
    }
)?)
    ;





// Entry rule entryRuleFeedType
entryRuleFeedType returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getFeedTypeRule()); } 
	 iv_ruleFeedType=ruleFeedType 
	 { $current=$iv_ruleFeedType.current.getText(); }  
	 EOF 
;

// Rule FeedType
ruleFeedType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='RSS' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getFeedTypeAccess().getRSSKeyword_0()); 
    }

    |
	kw='Atom' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getFeedTypeAccess().getAtomKeyword_1()); 
    }
)
    ;





RULE_URL : ('a'..'z')+ '://' (('0'..'9')+ '.' ('0'..'9')+ '.' ('0'..'9')+ '.' ('0'..'9')+|('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'$'|'-'|'_'|'\\' ('0'..'9'|'a'..'f'|'A'..'F') ('0'..'9'|'a'..'f'|'A'..'F')|'%' '0'..'9' '0'..'9')* ('.' ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'$'|'-'|'_'|'\\' ('0'..'9'|'a'..'f'|'A'..'F') ('0'..'9'|'a'..'f'|'A'..'F')|'%' '0'..'9' '0'..'9')*)*) (':' ('0'..'9')+)? ('/' ('a'..'z'|'A'..'Z'|'0'..'9'|'$'|'-'|'_'|'~'|'+'|'.'|'\\' ('0'..'9'|'a'..'f'|'A'..'F') ('0'..'9'|'a'..'f'|'A'..'F')|'%' '0'..'9' '0'..'9')*)* ('?' ('a'..'z'|'A'..'Z'|'0'..'9'|'$'|'-'|'_'|'='|'&'|';'|'\\' ('0'..'9'|'a'..'f'|'A'..'F') ('0'..'9'|'a'..'f'|'A'..'F')|'%' '0'..'9' '0'..'9')+ ('+' ('a'..'z'|'A'..'Z'|'0'..'9'|'$'|'-'|'_'|'='|'&'|';'|'\\' ('0'..'9'|'a'..'f'|'A'..'F') ('0'..'9'|'a'..'f'|'A'..'F')|'%' '0'..'9' '0'..'9')+)*)?;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


