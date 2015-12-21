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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalNplParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'newspaper'", "'feed link'", "'topics'", "'date'", "'location'", "'price'", "'volume'", "'language'", "'format'", "'number of articles'", "'number of characters per article'", "'-'", "'number of images per article'", "'number of columns'", "'font size'", "'{'", "'DIN A6'", "'DIN A5'", "'DIN A4'", "'DIN A3'", "'DIN A2'", "'DIN A1'", "'DIN A0'", "'}'", "'English'", "'German'", "'Euro'", "'Dollar'", "', '"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalNplParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalNplParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalNplParser.tokenNames; }
    public String getGrammarFileName() { return "../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g"; }



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



    // $ANTLR start "entryRuleDeclaration"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:67:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:68:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:69:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration75);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:76:1: ruleDeclaration returns [EObject current=null] : (otherlv_0= 'newspaper' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'feed link' ( (lv_feedlinks_3_0= ruleFeedlinks ) ) otherlv_4= 'topics' ( (lv_topics_5_0= ruleTopics ) ) otherlv_6= 'date' ( (lv_date_7_0= ruleDate ) ) otherlv_8= 'location' ( (lv_location_9_0= RULE_STRING ) ) otherlv_10= 'price' ( (lv_price_11_0= rulePrice ) ) otherlv_12= 'volume' ( (lv_volume_13_0= RULE_INT ) ) otherlv_14= 'language' ( (lv_language_15_0= ruleLanguage ) ) otherlv_16= 'format' ( (lv_format_17_0= ruleFormat ) ) otherlv_18= 'number of articles' ( (lv_article_cnt_19_0= RULE_INT ) ) otherlv_20= 'number of characters per article' ( (lv_article_char_min_21_0= RULE_INT ) ) otherlv_22= '-' ( (lv_article_char_max_23_0= RULE_INT ) ) otherlv_24= 'number of images per article' ( (lv_article_images_25_0= RULE_INT ) ) otherlv_26= 'number of columns' ( (lv_columns_cnt_27_0= RULE_INT ) ) otherlv_28= 'font size' ( (lv_font_size_29_0= RULE_INT ) ) ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_location_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token lv_volume_13_0=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token lv_article_cnt_19_0=null;
        Token otherlv_20=null;
        Token lv_article_char_min_21_0=null;
        Token otherlv_22=null;
        Token lv_article_char_max_23_0=null;
        Token otherlv_24=null;
        Token lv_article_images_25_0=null;
        Token otherlv_26=null;
        Token lv_columns_cnt_27_0=null;
        Token otherlv_28=null;
        Token lv_font_size_29_0=null;
        EObject lv_feedlinks_3_0 = null;

        AntlrDatatypeRuleToken lv_topics_5_0 = null;

        EObject lv_date_7_0 = null;

        EObject lv_price_11_0 = null;

        AntlrDatatypeRuleToken lv_language_15_0 = null;

        AntlrDatatypeRuleToken lv_format_17_0 = null;


         enterRule(); 
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:79:28: ( (otherlv_0= 'newspaper' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'feed link' ( (lv_feedlinks_3_0= ruleFeedlinks ) ) otherlv_4= 'topics' ( (lv_topics_5_0= ruleTopics ) ) otherlv_6= 'date' ( (lv_date_7_0= ruleDate ) ) otherlv_8= 'location' ( (lv_location_9_0= RULE_STRING ) ) otherlv_10= 'price' ( (lv_price_11_0= rulePrice ) ) otherlv_12= 'volume' ( (lv_volume_13_0= RULE_INT ) ) otherlv_14= 'language' ( (lv_language_15_0= ruleLanguage ) ) otherlv_16= 'format' ( (lv_format_17_0= ruleFormat ) ) otherlv_18= 'number of articles' ( (lv_article_cnt_19_0= RULE_INT ) ) otherlv_20= 'number of characters per article' ( (lv_article_char_min_21_0= RULE_INT ) ) otherlv_22= '-' ( (lv_article_char_max_23_0= RULE_INT ) ) otherlv_24= 'number of images per article' ( (lv_article_images_25_0= RULE_INT ) ) otherlv_26= 'number of columns' ( (lv_columns_cnt_27_0= RULE_INT ) ) otherlv_28= 'font size' ( (lv_font_size_29_0= RULE_INT ) ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:80:1: (otherlv_0= 'newspaper' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'feed link' ( (lv_feedlinks_3_0= ruleFeedlinks ) ) otherlv_4= 'topics' ( (lv_topics_5_0= ruleTopics ) ) otherlv_6= 'date' ( (lv_date_7_0= ruleDate ) ) otherlv_8= 'location' ( (lv_location_9_0= RULE_STRING ) ) otherlv_10= 'price' ( (lv_price_11_0= rulePrice ) ) otherlv_12= 'volume' ( (lv_volume_13_0= RULE_INT ) ) otherlv_14= 'language' ( (lv_language_15_0= ruleLanguage ) ) otherlv_16= 'format' ( (lv_format_17_0= ruleFormat ) ) otherlv_18= 'number of articles' ( (lv_article_cnt_19_0= RULE_INT ) ) otherlv_20= 'number of characters per article' ( (lv_article_char_min_21_0= RULE_INT ) ) otherlv_22= '-' ( (lv_article_char_max_23_0= RULE_INT ) ) otherlv_24= 'number of images per article' ( (lv_article_images_25_0= RULE_INT ) ) otherlv_26= 'number of columns' ( (lv_columns_cnt_27_0= RULE_INT ) ) otherlv_28= 'font size' ( (lv_font_size_29_0= RULE_INT ) ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:80:1: (otherlv_0= 'newspaper' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'feed link' ( (lv_feedlinks_3_0= ruleFeedlinks ) ) otherlv_4= 'topics' ( (lv_topics_5_0= ruleTopics ) ) otherlv_6= 'date' ( (lv_date_7_0= ruleDate ) ) otherlv_8= 'location' ( (lv_location_9_0= RULE_STRING ) ) otherlv_10= 'price' ( (lv_price_11_0= rulePrice ) ) otherlv_12= 'volume' ( (lv_volume_13_0= RULE_INT ) ) otherlv_14= 'language' ( (lv_language_15_0= ruleLanguage ) ) otherlv_16= 'format' ( (lv_format_17_0= ruleFormat ) ) otherlv_18= 'number of articles' ( (lv_article_cnt_19_0= RULE_INT ) ) otherlv_20= 'number of characters per article' ( (lv_article_char_min_21_0= RULE_INT ) ) otherlv_22= '-' ( (lv_article_char_max_23_0= RULE_INT ) ) otherlv_24= 'number of images per article' ( (lv_article_images_25_0= RULE_INT ) ) otherlv_26= 'number of columns' ( (lv_columns_cnt_27_0= RULE_INT ) ) otherlv_28= 'font size' ( (lv_font_size_29_0= RULE_INT ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:80:3: otherlv_0= 'newspaper' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'feed link' ( (lv_feedlinks_3_0= ruleFeedlinks ) ) otherlv_4= 'topics' ( (lv_topics_5_0= ruleTopics ) ) otherlv_6= 'date' ( (lv_date_7_0= ruleDate ) ) otherlv_8= 'location' ( (lv_location_9_0= RULE_STRING ) ) otherlv_10= 'price' ( (lv_price_11_0= rulePrice ) ) otherlv_12= 'volume' ( (lv_volume_13_0= RULE_INT ) ) otherlv_14= 'language' ( (lv_language_15_0= ruleLanguage ) ) otherlv_16= 'format' ( (lv_format_17_0= ruleFormat ) ) otherlv_18= 'number of articles' ( (lv_article_cnt_19_0= RULE_INT ) ) otherlv_20= 'number of characters per article' ( (lv_article_char_min_21_0= RULE_INT ) ) otherlv_22= '-' ( (lv_article_char_max_23_0= RULE_INT ) ) otherlv_24= 'number of images per article' ( (lv_article_images_25_0= RULE_INT ) ) otherlv_26= 'number of columns' ( (lv_columns_cnt_27_0= RULE_INT ) ) otherlv_28= 'font size' ( (lv_font_size_29_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleDeclaration122); 

                	newLeafNode(otherlv_0, grammarAccess.getDeclarationAccess().getNewspaperKeyword_0());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:84:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:85:1: (lv_name_1_0= RULE_STRING )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:85:1: (lv_name_1_0= RULE_STRING )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:86:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDeclaration139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDeclarationAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleDeclaration156); 

                	newLeafNode(otherlv_2, grammarAccess.getDeclarationAccess().getFeedLinkKeyword_2());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:106:1: ( (lv_feedlinks_3_0= ruleFeedlinks ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:107:1: (lv_feedlinks_3_0= ruleFeedlinks )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:107:1: (lv_feedlinks_3_0= ruleFeedlinks )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:108:3: lv_feedlinks_3_0= ruleFeedlinks
            {
             
            	        newCompositeNode(grammarAccess.getDeclarationAccess().getFeedlinksFeedlinksParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleFeedlinks_in_ruleDeclaration177);
            lv_feedlinks_3_0=ruleFeedlinks();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"feedlinks",
                    		lv_feedlinks_3_0, 
                    		"Feedlinks");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleDeclaration189); 

                	newLeafNode(otherlv_4, grammarAccess.getDeclarationAccess().getTopicsKeyword_4());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:128:1: ( (lv_topics_5_0= ruleTopics ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:129:1: (lv_topics_5_0= ruleTopics )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:129:1: (lv_topics_5_0= ruleTopics )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:130:3: lv_topics_5_0= ruleTopics
            {
             
            	        newCompositeNode(grammarAccess.getDeclarationAccess().getTopicsTopicsParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleTopics_in_ruleDeclaration210);
            lv_topics_5_0=ruleTopics();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"topics",
                    		lv_topics_5_0, 
                    		"Topics");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleDeclaration222); 

                	newLeafNode(otherlv_6, grammarAccess.getDeclarationAccess().getDateKeyword_6());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:150:1: ( (lv_date_7_0= ruleDate ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:151:1: (lv_date_7_0= ruleDate )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:151:1: (lv_date_7_0= ruleDate )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:152:3: lv_date_7_0= ruleDate
            {
             
            	        newCompositeNode(grammarAccess.getDeclarationAccess().getDateDateParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleDate_in_ruleDeclaration243);
            lv_date_7_0=ruleDate();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"date",
                    		lv_date_7_0, 
                    		"Date");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleDeclaration255); 

                	newLeafNode(otherlv_8, grammarAccess.getDeclarationAccess().getLocationKeyword_8());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:172:1: ( (lv_location_9_0= RULE_STRING ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:173:1: (lv_location_9_0= RULE_STRING )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:173:1: (lv_location_9_0= RULE_STRING )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:174:3: lv_location_9_0= RULE_STRING
            {
            lv_location_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDeclaration272); 

            			newLeafNode(lv_location_9_0, grammarAccess.getDeclarationAccess().getLocationSTRINGTerminalRuleCall_9_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"location",
                    		lv_location_9_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleDeclaration289); 

                	newLeafNode(otherlv_10, grammarAccess.getDeclarationAccess().getPriceKeyword_10());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:194:1: ( (lv_price_11_0= rulePrice ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:195:1: (lv_price_11_0= rulePrice )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:195:1: (lv_price_11_0= rulePrice )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:196:3: lv_price_11_0= rulePrice
            {
             
            	        newCompositeNode(grammarAccess.getDeclarationAccess().getPricePriceParserRuleCall_11_0()); 
            	    
            pushFollow(FOLLOW_rulePrice_in_ruleDeclaration310);
            lv_price_11_0=rulePrice();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"price",
                    		lv_price_11_0, 
                    		"Price");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleDeclaration322); 

                	newLeafNode(otherlv_12, grammarAccess.getDeclarationAccess().getVolumeKeyword_12());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:216:1: ( (lv_volume_13_0= RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:217:1: (lv_volume_13_0= RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:217:1: (lv_volume_13_0= RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:218:3: lv_volume_13_0= RULE_INT
            {
            lv_volume_13_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDeclaration339); 

            			newLeafNode(lv_volume_13_0, grammarAccess.getDeclarationAccess().getVolumeINTTerminalRuleCall_13_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"volume",
                    		lv_volume_13_0, 
                    		"INT");
            	    

            }


            }

            otherlv_14=(Token)match(input,18,FOLLOW_18_in_ruleDeclaration356); 

                	newLeafNode(otherlv_14, grammarAccess.getDeclarationAccess().getLanguageKeyword_14());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:238:1: ( (lv_language_15_0= ruleLanguage ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:239:1: (lv_language_15_0= ruleLanguage )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:239:1: (lv_language_15_0= ruleLanguage )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:240:3: lv_language_15_0= ruleLanguage
            {
             
            	        newCompositeNode(grammarAccess.getDeclarationAccess().getLanguageLanguageParserRuleCall_15_0()); 
            	    
            pushFollow(FOLLOW_ruleLanguage_in_ruleDeclaration377);
            lv_language_15_0=ruleLanguage();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"language",
                    		lv_language_15_0, 
                    		"Language");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_16=(Token)match(input,19,FOLLOW_19_in_ruleDeclaration389); 

                	newLeafNode(otherlv_16, grammarAccess.getDeclarationAccess().getFormatKeyword_16());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:260:1: ( (lv_format_17_0= ruleFormat ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:261:1: (lv_format_17_0= ruleFormat )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:261:1: (lv_format_17_0= ruleFormat )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:262:3: lv_format_17_0= ruleFormat
            {
             
            	        newCompositeNode(grammarAccess.getDeclarationAccess().getFormatFormatParserRuleCall_17_0()); 
            	    
            pushFollow(FOLLOW_ruleFormat_in_ruleDeclaration410);
            lv_format_17_0=ruleFormat();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"format",
                    		lv_format_17_0, 
                    		"Format");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_18=(Token)match(input,20,FOLLOW_20_in_ruleDeclaration422); 

                	newLeafNode(otherlv_18, grammarAccess.getDeclarationAccess().getNumberOfArticlesKeyword_18());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:282:1: ( (lv_article_cnt_19_0= RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:283:1: (lv_article_cnt_19_0= RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:283:1: (lv_article_cnt_19_0= RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:284:3: lv_article_cnt_19_0= RULE_INT
            {
            lv_article_cnt_19_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDeclaration439); 

            			newLeafNode(lv_article_cnt_19_0, grammarAccess.getDeclarationAccess().getArticle_cntINTTerminalRuleCall_19_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"article_cnt",
                    		lv_article_cnt_19_0, 
                    		"INT");
            	    

            }


            }

            otherlv_20=(Token)match(input,21,FOLLOW_21_in_ruleDeclaration456); 

                	newLeafNode(otherlv_20, grammarAccess.getDeclarationAccess().getNumberOfCharactersPerArticleKeyword_20());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:304:1: ( (lv_article_char_min_21_0= RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:305:1: (lv_article_char_min_21_0= RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:305:1: (lv_article_char_min_21_0= RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:306:3: lv_article_char_min_21_0= RULE_INT
            {
            lv_article_char_min_21_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDeclaration473); 

            			newLeafNode(lv_article_char_min_21_0, grammarAccess.getDeclarationAccess().getArticle_char_minINTTerminalRuleCall_21_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"article_char_min",
                    		lv_article_char_min_21_0, 
                    		"INT");
            	    

            }


            }

            otherlv_22=(Token)match(input,22,FOLLOW_22_in_ruleDeclaration490); 

                	newLeafNode(otherlv_22, grammarAccess.getDeclarationAccess().getHyphenMinusKeyword_22());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:326:1: ( (lv_article_char_max_23_0= RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:327:1: (lv_article_char_max_23_0= RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:327:1: (lv_article_char_max_23_0= RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:328:3: lv_article_char_max_23_0= RULE_INT
            {
            lv_article_char_max_23_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDeclaration507); 

            			newLeafNode(lv_article_char_max_23_0, grammarAccess.getDeclarationAccess().getArticle_char_maxINTTerminalRuleCall_23_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"article_char_max",
                    		lv_article_char_max_23_0, 
                    		"INT");
            	    

            }


            }

            otherlv_24=(Token)match(input,23,FOLLOW_23_in_ruleDeclaration524); 

                	newLeafNode(otherlv_24, grammarAccess.getDeclarationAccess().getNumberOfImagesPerArticleKeyword_24());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:348:1: ( (lv_article_images_25_0= RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:349:1: (lv_article_images_25_0= RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:349:1: (lv_article_images_25_0= RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:350:3: lv_article_images_25_0= RULE_INT
            {
            lv_article_images_25_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDeclaration541); 

            			newLeafNode(lv_article_images_25_0, grammarAccess.getDeclarationAccess().getArticle_imagesINTTerminalRuleCall_25_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"article_images",
                    		lv_article_images_25_0, 
                    		"INT");
            	    

            }


            }

            otherlv_26=(Token)match(input,24,FOLLOW_24_in_ruleDeclaration558); 

                	newLeafNode(otherlv_26, grammarAccess.getDeclarationAccess().getNumberOfColumnsKeyword_26());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:370:1: ( (lv_columns_cnt_27_0= RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:371:1: (lv_columns_cnt_27_0= RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:371:1: (lv_columns_cnt_27_0= RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:372:3: lv_columns_cnt_27_0= RULE_INT
            {
            lv_columns_cnt_27_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDeclaration575); 

            			newLeafNode(lv_columns_cnt_27_0, grammarAccess.getDeclarationAccess().getColumns_cntINTTerminalRuleCall_27_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"columns_cnt",
                    		lv_columns_cnt_27_0, 
                    		"INT");
            	    

            }


            }

            otherlv_28=(Token)match(input,25,FOLLOW_25_in_ruleDeclaration592); 

                	newLeafNode(otherlv_28, grammarAccess.getDeclarationAccess().getFontSizeKeyword_28());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:392:1: ( (lv_font_size_29_0= RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:393:1: (lv_font_size_29_0= RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:393:1: (lv_font_size_29_0= RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:394:3: lv_font_size_29_0= RULE_INT
            {
            lv_font_size_29_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDeclaration609); 

            			newLeafNode(lv_font_size_29_0, grammarAccess.getDeclarationAccess().getFont_sizeINTTerminalRuleCall_29_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"font_size",
                    		lv_font_size_29_0, 
                    		"INT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleFormat"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:418:1: entryRuleFormat returns [String current=null] : iv_ruleFormat= ruleFormat EOF ;
    public final String entryRuleFormat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFormat = null;


        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:419:2: (iv_ruleFormat= ruleFormat EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:420:2: iv_ruleFormat= ruleFormat EOF
            {
             newCompositeNode(grammarAccess.getFormatRule()); 
            pushFollow(FOLLOW_ruleFormat_in_entryRuleFormat651);
            iv_ruleFormat=ruleFormat();

            state._fsp--;

             current =iv_ruleFormat.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormat662); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormat"


    // $ANTLR start "ruleFormat"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:427:1: ruleFormat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '{' kw= 'DIN A6' ) | kw= 'DIN A5' | kw= 'DIN A4' | kw= 'DIN A3' | kw= 'DIN A2' | kw= 'DIN A1' | (kw= 'DIN A0' kw= '}' ) ) ;
    public final AntlrDatatypeRuleToken ruleFormat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:430:28: ( ( (kw= '{' kw= 'DIN A6' ) | kw= 'DIN A5' | kw= 'DIN A4' | kw= 'DIN A3' | kw= 'DIN A2' | kw= 'DIN A1' | (kw= 'DIN A0' kw= '}' ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:431:1: ( (kw= '{' kw= 'DIN A6' ) | kw= 'DIN A5' | kw= 'DIN A4' | kw= 'DIN A3' | kw= 'DIN A2' | kw= 'DIN A1' | (kw= 'DIN A0' kw= '}' ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:431:1: ( (kw= '{' kw= 'DIN A6' ) | kw= 'DIN A5' | kw= 'DIN A4' | kw= 'DIN A3' | kw= 'DIN A2' | kw= 'DIN A1' | (kw= 'DIN A0' kw= '}' ) )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt1=1;
                }
                break;
            case 28:
                {
                alt1=2;
                }
                break;
            case 29:
                {
                alt1=3;
                }
                break;
            case 30:
                {
                alt1=4;
                }
                break;
            case 31:
                {
                alt1=5;
                }
                break;
            case 32:
                {
                alt1=6;
                }
                break;
            case 33:
                {
                alt1=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:431:2: (kw= '{' kw= 'DIN A6' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:431:2: (kw= '{' kw= 'DIN A6' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:432:2: kw= '{' kw= 'DIN A6'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleFormat701); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFormatAccess().getLeftCurlyBracketKeyword_0_0()); 
                        
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleFormat714); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFormatAccess().getDINA6Keyword_0_1()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:445:2: kw= 'DIN A5'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleFormat734); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFormatAccess().getDINA5Keyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:452:2: kw= 'DIN A4'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleFormat753); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFormatAccess().getDINA4Keyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:459:2: kw= 'DIN A3'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleFormat772); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFormatAccess().getDINA3Keyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:466:2: kw= 'DIN A2'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleFormat791); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFormatAccess().getDINA2Keyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:473:2: kw= 'DIN A1'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleFormat810); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFormatAccess().getDINA1Keyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:479:6: (kw= 'DIN A0' kw= '}' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:479:6: (kw= 'DIN A0' kw= '}' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:480:2: kw= 'DIN A0' kw= '}'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleFormat830); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFormatAccess().getDINA0Keyword_6_0()); 
                        
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleFormat843); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFormatAccess().getRightCurlyBracketKeyword_6_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormat"


    // $ANTLR start "entryRuleDate"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:499:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:500:2: (iv_ruleDate= ruleDate EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:501:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_ruleDate_in_entryRuleDate884);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDate894); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:508:1: ruleDate returns [EObject current=null] : (otherlv_0= '{' ( (lv_day_1_0= RULE_INT ) ) otherlv_2= '-' ( (lv_month_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_year_5_0= RULE_INT ) ) otherlv_6= '}' ) ;
    public final EObject ruleDate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_day_1_0=null;
        Token otherlv_2=null;
        Token lv_month_3_0=null;
        Token otherlv_4=null;
        Token lv_year_5_0=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:511:28: ( (otherlv_0= '{' ( (lv_day_1_0= RULE_INT ) ) otherlv_2= '-' ( (lv_month_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_year_5_0= RULE_INT ) ) otherlv_6= '}' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:512:1: (otherlv_0= '{' ( (lv_day_1_0= RULE_INT ) ) otherlv_2= '-' ( (lv_month_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_year_5_0= RULE_INT ) ) otherlv_6= '}' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:512:1: (otherlv_0= '{' ( (lv_day_1_0= RULE_INT ) ) otherlv_2= '-' ( (lv_month_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_year_5_0= RULE_INT ) ) otherlv_6= '}' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:512:3: otherlv_0= '{' ( (lv_day_1_0= RULE_INT ) ) otherlv_2= '-' ( (lv_month_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_year_5_0= RULE_INT ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleDate931); 

                	newLeafNode(otherlv_0, grammarAccess.getDateAccess().getLeftCurlyBracketKeyword_0());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:516:1: ( (lv_day_1_0= RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:517:1: (lv_day_1_0= RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:517:1: (lv_day_1_0= RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:518:3: lv_day_1_0= RULE_INT
            {
            lv_day_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDate948); 

            			newLeafNode(lv_day_1_0, grammarAccess.getDateAccess().getDayINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"day",
                    		lv_day_1_0, 
                    		"INT");
            	    

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleDate965); 

                	newLeafNode(otherlv_2, grammarAccess.getDateAccess().getHyphenMinusKeyword_2());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:538:1: ( (lv_month_3_0= RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:539:1: (lv_month_3_0= RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:539:1: (lv_month_3_0= RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:540:3: lv_month_3_0= RULE_INT
            {
            lv_month_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDate982); 

            			newLeafNode(lv_month_3_0, grammarAccess.getDateAccess().getMonthINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"month",
                    		lv_month_3_0, 
                    		"INT");
            	    

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleDate999); 

                	newLeafNode(otherlv_4, grammarAccess.getDateAccess().getHyphenMinusKeyword_4());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:560:1: ( (lv_year_5_0= RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:561:1: (lv_year_5_0= RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:561:1: (lv_year_5_0= RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:562:3: lv_year_5_0= RULE_INT
            {
            lv_year_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDate1016); 

            			newLeafNode(lv_year_5_0, grammarAccess.getDateAccess().getYearINTTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"year",
                    		lv_year_5_0, 
                    		"INT");
            	    

            }


            }

            otherlv_6=(Token)match(input,34,FOLLOW_34_in_ruleDate1033); 

                	newLeafNode(otherlv_6, grammarAccess.getDateAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDate"


    // $ANTLR start "entryRuleLanguage"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:590:1: entryRuleLanguage returns [String current=null] : iv_ruleLanguage= ruleLanguage EOF ;
    public final String entryRuleLanguage() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLanguage = null;


        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:591:2: (iv_ruleLanguage= ruleLanguage EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:592:2: iv_ruleLanguage= ruleLanguage EOF
            {
             newCompositeNode(grammarAccess.getLanguageRule()); 
            pushFollow(FOLLOW_ruleLanguage_in_entryRuleLanguage1070);
            iv_ruleLanguage=ruleLanguage();

            state._fsp--;

             current =iv_ruleLanguage.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLanguage1081); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLanguage"


    // $ANTLR start "ruleLanguage"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:599:1: ruleLanguage returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '{' kw= 'English' ) | (kw= 'German' kw= '}' ) ) ;
    public final AntlrDatatypeRuleToken ruleLanguage() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:602:28: ( ( (kw= '{' kw= 'English' ) | (kw= 'German' kw= '}' ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:603:1: ( (kw= '{' kw= 'English' ) | (kw= 'German' kw= '}' ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:603:1: ( (kw= '{' kw= 'English' ) | (kw= 'German' kw= '}' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==26) ) {
                alt2=1;
            }
            else if ( (LA2_0==36) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:603:2: (kw= '{' kw= 'English' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:603:2: (kw= '{' kw= 'English' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:604:2: kw= '{' kw= 'English'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleLanguage1120); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLanguageAccess().getLeftCurlyBracketKeyword_0_0()); 
                        
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleLanguage1133); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLanguageAccess().getEnglishKeyword_0_1()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:616:6: (kw= 'German' kw= '}' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:616:6: (kw= 'German' kw= '}' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:617:2: kw= 'German' kw= '}'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleLanguage1154); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLanguageAccess().getGermanKeyword_1_0()); 
                        
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleLanguage1167); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLanguageAccess().getRightCurlyBracketKeyword_1_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLanguage"


    // $ANTLR start "entryRulePrice"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:636:1: entryRulePrice returns [EObject current=null] : iv_rulePrice= rulePrice EOF ;
    public final EObject entryRulePrice() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrice = null;


        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:637:2: (iv_rulePrice= rulePrice EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:638:2: iv_rulePrice= rulePrice EOF
            {
             newCompositeNode(grammarAccess.getPriceRule()); 
            pushFollow(FOLLOW_rulePrice_in_entryRulePrice1208);
            iv_rulePrice=rulePrice();

            state._fsp--;

             current =iv_rulePrice; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrice1218); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrice"


    // $ANTLR start "rulePrice"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:645:1: rulePrice returns [EObject current=null] : (otherlv_0= '{' ( (lv_value_1_0= RULE_STRING ) ) ( (lv_currency_2_0= ruleCurrency ) ) otherlv_3= '}' ) ;
    public final EObject rulePrice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_currency_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:648:28: ( (otherlv_0= '{' ( (lv_value_1_0= RULE_STRING ) ) ( (lv_currency_2_0= ruleCurrency ) ) otherlv_3= '}' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:649:1: (otherlv_0= '{' ( (lv_value_1_0= RULE_STRING ) ) ( (lv_currency_2_0= ruleCurrency ) ) otherlv_3= '}' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:649:1: (otherlv_0= '{' ( (lv_value_1_0= RULE_STRING ) ) ( (lv_currency_2_0= ruleCurrency ) ) otherlv_3= '}' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:649:3: otherlv_0= '{' ( (lv_value_1_0= RULE_STRING ) ) ( (lv_currency_2_0= ruleCurrency ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_rulePrice1255); 

                	newLeafNode(otherlv_0, grammarAccess.getPriceAccess().getLeftCurlyBracketKeyword_0());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:653:1: ( (lv_value_1_0= RULE_STRING ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:654:1: (lv_value_1_0= RULE_STRING )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:654:1: (lv_value_1_0= RULE_STRING )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:655:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePrice1272); 

            			newLeafNode(lv_value_1_0, grammarAccess.getPriceAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPriceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:671:2: ( (lv_currency_2_0= ruleCurrency ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:672:1: (lv_currency_2_0= ruleCurrency )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:672:1: (lv_currency_2_0= ruleCurrency )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:673:3: lv_currency_2_0= ruleCurrency
            {
             
            	        newCompositeNode(grammarAccess.getPriceAccess().getCurrencyCurrencyParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleCurrency_in_rulePrice1298);
            lv_currency_2_0=ruleCurrency();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPriceRule());
            	        }
                   		set(
                   			current, 
                   			"currency",
                    		lv_currency_2_0, 
                    		"Currency");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,34,FOLLOW_34_in_rulePrice1310); 

                	newLeafNode(otherlv_3, grammarAccess.getPriceAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrice"


    // $ANTLR start "entryRuleCurrency"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:701:1: entryRuleCurrency returns [String current=null] : iv_ruleCurrency= ruleCurrency EOF ;
    public final String entryRuleCurrency() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCurrency = null;


        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:702:2: (iv_ruleCurrency= ruleCurrency EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:703:2: iv_ruleCurrency= ruleCurrency EOF
            {
             newCompositeNode(grammarAccess.getCurrencyRule()); 
            pushFollow(FOLLOW_ruleCurrency_in_entryRuleCurrency1347);
            iv_ruleCurrency=ruleCurrency();

            state._fsp--;

             current =iv_ruleCurrency.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCurrency1358); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCurrency"


    // $ANTLR start "ruleCurrency"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:710:1: ruleCurrency returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '{' kw= 'Euro' ) | (kw= 'Dollar' kw= '}' ) ) ;
    public final AntlrDatatypeRuleToken ruleCurrency() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:713:28: ( ( (kw= '{' kw= 'Euro' ) | (kw= 'Dollar' kw= '}' ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:714:1: ( (kw= '{' kw= 'Euro' ) | (kw= 'Dollar' kw= '}' ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:714:1: ( (kw= '{' kw= 'Euro' ) | (kw= 'Dollar' kw= '}' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==26) ) {
                alt3=1;
            }
            else if ( (LA3_0==38) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:714:2: (kw= '{' kw= 'Euro' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:714:2: (kw= '{' kw= 'Euro' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:715:2: kw= '{' kw= 'Euro'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleCurrency1397); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCurrencyAccess().getLeftCurlyBracketKeyword_0_0()); 
                        
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleCurrency1410); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCurrencyAccess().getEuroKeyword_0_1()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:727:6: (kw= 'Dollar' kw= '}' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:727:6: (kw= 'Dollar' kw= '}' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:728:2: kw= 'Dollar' kw= '}'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleCurrency1431); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCurrencyAccess().getDollarKeyword_1_0()); 
                        
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleCurrency1444); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCurrencyAccess().getRightCurlyBracketKeyword_1_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCurrency"


    // $ANTLR start "entryRuleTopics"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:747:1: entryRuleTopics returns [String current=null] : iv_ruleTopics= ruleTopics EOF ;
    public final String entryRuleTopics() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTopics = null;


        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:748:2: (iv_ruleTopics= ruleTopics EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:749:2: iv_ruleTopics= ruleTopics EOF
            {
             newCompositeNode(grammarAccess.getTopicsRule()); 
            pushFollow(FOLLOW_ruleTopics_in_entryRuleTopics1486);
            iv_ruleTopics=ruleTopics();

            state._fsp--;

             current =iv_ruleTopics.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTopics1497); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTopics"


    // $ANTLR start "ruleTopics"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:756:1: ruleTopics returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleTopics() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:759:28: ( (kw= '{' kw= '}' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:760:1: (kw= '{' kw= '}' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:760:1: (kw= '{' kw= '}' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:761:2: kw= '{' kw= '}'
            {
            kw=(Token)match(input,26,FOLLOW_26_in_ruleTopics1535); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTopicsAccess().getLeftCurlyBracketKeyword_0()); 
                
            kw=(Token)match(input,34,FOLLOW_34_in_ruleTopics1548); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTopicsAccess().getRightCurlyBracketKeyword_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTopics"


    // $ANTLR start "entryRuleFeedlinks"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:780:1: entryRuleFeedlinks returns [EObject current=null] : iv_ruleFeedlinks= ruleFeedlinks EOF ;
    public final EObject entryRuleFeedlinks() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeedlinks = null;


        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:781:2: (iv_ruleFeedlinks= ruleFeedlinks EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:782:2: iv_ruleFeedlinks= ruleFeedlinks EOF
            {
             newCompositeNode(grammarAccess.getFeedlinksRule()); 
            pushFollow(FOLLOW_ruleFeedlinks_in_entryRuleFeedlinks1588);
            iv_ruleFeedlinks=ruleFeedlinks();

            state._fsp--;

             current =iv_ruleFeedlinks; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeedlinks1598); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeedlinks"


    // $ANTLR start "ruleFeedlinks"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:789:1: ruleFeedlinks returns [EObject current=null] : (otherlv_0= '{' ( (lv_pairs_1_0= rulePair ) ) (otherlv_2= ', ' ( (lv_pairs_3_0= rulePair ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleFeedlinks() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_pairs_1_0 = null;

        EObject lv_pairs_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:792:28: ( (otherlv_0= '{' ( (lv_pairs_1_0= rulePair ) ) (otherlv_2= ', ' ( (lv_pairs_3_0= rulePair ) ) )* otherlv_4= '}' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:793:1: (otherlv_0= '{' ( (lv_pairs_1_0= rulePair ) ) (otherlv_2= ', ' ( (lv_pairs_3_0= rulePair ) ) )* otherlv_4= '}' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:793:1: (otherlv_0= '{' ( (lv_pairs_1_0= rulePair ) ) (otherlv_2= ', ' ( (lv_pairs_3_0= rulePair ) ) )* otherlv_4= '}' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:793:3: otherlv_0= '{' ( (lv_pairs_1_0= rulePair ) ) (otherlv_2= ', ' ( (lv_pairs_3_0= rulePair ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleFeedlinks1635); 

                	newLeafNode(otherlv_0, grammarAccess.getFeedlinksAccess().getLeftCurlyBracketKeyword_0());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:797:1: ( (lv_pairs_1_0= rulePair ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:798:1: (lv_pairs_1_0= rulePair )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:798:1: (lv_pairs_1_0= rulePair )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:799:3: lv_pairs_1_0= rulePair
            {
             
            	        newCompositeNode(grammarAccess.getFeedlinksAccess().getPairsPairParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePair_in_ruleFeedlinks1656);
            lv_pairs_1_0=rulePair();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFeedlinksRule());
            	        }
                   		add(
                   			current, 
                   			"pairs",
                    		lv_pairs_1_0, 
                    		"Pair");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:815:2: (otherlv_2= ', ' ( (lv_pairs_3_0= rulePair ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==39) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:815:4: otherlv_2= ', ' ( (lv_pairs_3_0= rulePair ) )
            	    {
            	    otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleFeedlinks1669); 

            	        	newLeafNode(otherlv_2, grammarAccess.getFeedlinksAccess().getCommaSpaceKeyword_2_0());
            	        
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:819:1: ( (lv_pairs_3_0= rulePair ) )
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:820:1: (lv_pairs_3_0= rulePair )
            	    {
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:820:1: (lv_pairs_3_0= rulePair )
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:821:3: lv_pairs_3_0= rulePair
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFeedlinksAccess().getPairsPairParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePair_in_ruleFeedlinks1690);
            	    lv_pairs_3_0=rulePair();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFeedlinksRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"pairs",
            	            		lv_pairs_3_0, 
            	            		"Pair");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleFeedlinks1704); 

                	newLeafNode(otherlv_4, grammarAccess.getFeedlinksAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeedlinks"


    // $ANTLR start "entryRulePair"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:849:1: entryRulePair returns [EObject current=null] : iv_rulePair= rulePair EOF ;
    public final EObject entryRulePair() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePair = null;


        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:850:2: (iv_rulePair= rulePair EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:851:2: iv_rulePair= rulePair EOF
            {
             newCompositeNode(grammarAccess.getPairRule()); 
            pushFollow(FOLLOW_rulePair_in_entryRulePair1740);
            iv_rulePair=rulePair();

            state._fsp--;

             current =iv_rulePair; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePair1750); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePair"


    // $ANTLR start "rulePair"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:858:1: rulePair returns [EObject current=null] : (otherlv_0= '{' ( (lv_key_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= '}' ) ;
    public final EObject rulePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_key_1_0=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:861:28: ( (otherlv_0= '{' ( (lv_key_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= '}' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:862:1: (otherlv_0= '{' ( (lv_key_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= '}' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:862:1: (otherlv_0= '{' ( (lv_key_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= '}' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:862:3: otherlv_0= '{' ( (lv_key_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_rulePair1787); 

                	newLeafNode(otherlv_0, grammarAccess.getPairAccess().getLeftCurlyBracketKeyword_0());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:866:1: ( (lv_key_1_0= RULE_STRING ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:867:1: (lv_key_1_0= RULE_STRING )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:867:1: (lv_key_1_0= RULE_STRING )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:868:3: lv_key_1_0= RULE_STRING
            {
            lv_key_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePair1804); 

            			newLeafNode(lv_key_1_0, grammarAccess.getPairAccess().getKeySTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPairRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"key",
                    		lv_key_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:884:2: ( (lv_value_2_0= RULE_STRING ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:885:1: (lv_value_2_0= RULE_STRING )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:885:1: (lv_value_2_0= RULE_STRING )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:886:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePair1826); 

            			newLeafNode(lv_value_2_0, grammarAccess.getPairAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPairRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,34,FOLLOW_34_in_rulePair1843); 

                	newLeafNode(otherlv_3, grammarAccess.getPairAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePair"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleDeclaration122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDeclaration139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDeclaration156 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleFeedlinks_in_ruleDeclaration177 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDeclaration189 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleTopics_in_ruleDeclaration210 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDeclaration222 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleDate_in_ruleDeclaration243 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDeclaration255 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDeclaration272 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDeclaration289 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rulePrice_in_ruleDeclaration310 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDeclaration322 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDeclaration339 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDeclaration356 = new BitSet(new long[]{0x0000001004000000L});
    public static final BitSet FOLLOW_ruleLanguage_in_ruleDeclaration377 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDeclaration389 = new BitSet(new long[]{0x00000003F4000000L});
    public static final BitSet FOLLOW_ruleFormat_in_ruleDeclaration410 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDeclaration422 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDeclaration439 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDeclaration456 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDeclaration473 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDeclaration490 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDeclaration507 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleDeclaration524 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDeclaration541 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDeclaration558 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDeclaration575 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDeclaration592 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDeclaration609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormat_in_entryRuleFormat651 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormat662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleFormat701 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleFormat714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleFormat734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleFormat753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleFormat772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleFormat791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleFormat810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleFormat830 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleFormat843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_in_entryRuleDate884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDate894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleDate931 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDate948 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDate965 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDate982 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDate999 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDate1016 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleDate1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLanguage_in_entryRuleLanguage1070 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLanguage1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleLanguage1120 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleLanguage1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleLanguage1154 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleLanguage1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrice_in_entryRulePrice1208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrice1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulePrice1255 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePrice1272 = new BitSet(new long[]{0x0000004004000000L});
    public static final BitSet FOLLOW_ruleCurrency_in_rulePrice1298 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_rulePrice1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCurrency_in_entryRuleCurrency1347 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCurrency1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleCurrency1397 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleCurrency1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleCurrency1431 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleCurrency1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopics_in_entryRuleTopics1486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopics1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleTopics1535 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleTopics1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeedlinks_in_entryRuleFeedlinks1588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeedlinks1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleFeedlinks1635 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rulePair_in_ruleFeedlinks1656 = new BitSet(new long[]{0x0000008400000000L});
    public static final BitSet FOLLOW_39_in_ruleFeedlinks1669 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rulePair_in_ruleFeedlinks1690 = new BitSet(new long[]{0x0000008400000000L});
    public static final BitSet FOLLOW_34_in_ruleFeedlinks1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePair_in_entryRulePair1740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePair1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulePair1787 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePair1804 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePair1826 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_rulePair1843 = new BitSet(new long[]{0x0000000000000002L});

}