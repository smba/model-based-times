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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'newspaper'", "'feed link'", "'topics'", "'{'", "'}'", "'date'", "'location'", "'price'", "'volume'", "'language'", "'format'", "'number of articles per topic'", "'number of words per article'", "'-'", "'number of images per article'", "'number of columns'", "'font size'", "'small'", "'medium'", "'large'", "'DIN A6'", "'DIN A5'", "'DIN A4'", "'DIN A3'", "'DIN A2'", "'DIN A1'", "'DIN A0'", "'English'", "'German'", "'Euro'", "'Dollar'", "'topic'", "', '"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:76:1: ruleDeclaration returns [EObject current=null] : (otherlv_0= 'newspaper' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'feed link' ( (lv_feedlinks_3_0= ruleFeedlinks ) ) otherlv_4= 'topics' otherlv_5= '{' ( (lv_topics_6_0= ruleTopic ) ) ( (lv_topics_7_0= ruleTopic ) )* otherlv_8= '}' (otherlv_9= 'date' ( (lv_date_10_0= ruleDate ) ) )? (otherlv_11= 'location' ( (lv_location_12_0= RULE_STRING ) ) )? otherlv_13= 'price' ( (lv_price_14_0= rulePrice ) ) (otherlv_15= 'volume' ( (lv_volume_16_0= RULE_INT ) ) )? otherlv_17= 'language' ( (lv_language_18_0= ruleLanguage ) ) otherlv_19= 'format' ( (lv_format_20_0= ruleFormat ) ) otherlv_21= 'number of articles per topic' ( (lv_article_cnt_22_0= RULE_INT ) ) otherlv_23= 'number of words per article' ( (lv_article_char_min_24_0= RULE_INT ) ) otherlv_25= '-' ( (lv_article_char_max_26_0= RULE_INT ) ) (otherlv_27= 'number of images per article' ( (lv_article_images_28_0= RULE_INT ) ) )? otherlv_29= 'number of columns' ( (lv_columns_cnt_30_0= RULE_INT ) ) otherlv_31= 'font size' ( (lv_font_size_32_0= ruleFontSize ) ) ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_location_12_0=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token lv_volume_16_0=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token lv_article_cnt_22_0=null;
        Token otherlv_23=null;
        Token lv_article_char_min_24_0=null;
        Token otherlv_25=null;
        Token lv_article_char_max_26_0=null;
        Token otherlv_27=null;
        Token lv_article_images_28_0=null;
        Token otherlv_29=null;
        Token lv_columns_cnt_30_0=null;
        Token otherlv_31=null;
        EObject lv_feedlinks_3_0 = null;

        EObject lv_topics_6_0 = null;

        EObject lv_topics_7_0 = null;

        EObject lv_date_10_0 = null;

        EObject lv_price_14_0 = null;

        EObject lv_language_18_0 = null;

        EObject lv_format_20_0 = null;

        EObject lv_font_size_32_0 = null;


         enterRule(); 
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:79:28: ( (otherlv_0= 'newspaper' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'feed link' ( (lv_feedlinks_3_0= ruleFeedlinks ) ) otherlv_4= 'topics' otherlv_5= '{' ( (lv_topics_6_0= ruleTopic ) ) ( (lv_topics_7_0= ruleTopic ) )* otherlv_8= '}' (otherlv_9= 'date' ( (lv_date_10_0= ruleDate ) ) )? (otherlv_11= 'location' ( (lv_location_12_0= RULE_STRING ) ) )? otherlv_13= 'price' ( (lv_price_14_0= rulePrice ) ) (otherlv_15= 'volume' ( (lv_volume_16_0= RULE_INT ) ) )? otherlv_17= 'language' ( (lv_language_18_0= ruleLanguage ) ) otherlv_19= 'format' ( (lv_format_20_0= ruleFormat ) ) otherlv_21= 'number of articles per topic' ( (lv_article_cnt_22_0= RULE_INT ) ) otherlv_23= 'number of words per article' ( (lv_article_char_min_24_0= RULE_INT ) ) otherlv_25= '-' ( (lv_article_char_max_26_0= RULE_INT ) ) (otherlv_27= 'number of images per article' ( (lv_article_images_28_0= RULE_INT ) ) )? otherlv_29= 'number of columns' ( (lv_columns_cnt_30_0= RULE_INT ) ) otherlv_31= 'font size' ( (lv_font_size_32_0= ruleFontSize ) ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:80:1: (otherlv_0= 'newspaper' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'feed link' ( (lv_feedlinks_3_0= ruleFeedlinks ) ) otherlv_4= 'topics' otherlv_5= '{' ( (lv_topics_6_0= ruleTopic ) ) ( (lv_topics_7_0= ruleTopic ) )* otherlv_8= '}' (otherlv_9= 'date' ( (lv_date_10_0= ruleDate ) ) )? (otherlv_11= 'location' ( (lv_location_12_0= RULE_STRING ) ) )? otherlv_13= 'price' ( (lv_price_14_0= rulePrice ) ) (otherlv_15= 'volume' ( (lv_volume_16_0= RULE_INT ) ) )? otherlv_17= 'language' ( (lv_language_18_0= ruleLanguage ) ) otherlv_19= 'format' ( (lv_format_20_0= ruleFormat ) ) otherlv_21= 'number of articles per topic' ( (lv_article_cnt_22_0= RULE_INT ) ) otherlv_23= 'number of words per article' ( (lv_article_char_min_24_0= RULE_INT ) ) otherlv_25= '-' ( (lv_article_char_max_26_0= RULE_INT ) ) (otherlv_27= 'number of images per article' ( (lv_article_images_28_0= RULE_INT ) ) )? otherlv_29= 'number of columns' ( (lv_columns_cnt_30_0= RULE_INT ) ) otherlv_31= 'font size' ( (lv_font_size_32_0= ruleFontSize ) ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:80:1: (otherlv_0= 'newspaper' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'feed link' ( (lv_feedlinks_3_0= ruleFeedlinks ) ) otherlv_4= 'topics' otherlv_5= '{' ( (lv_topics_6_0= ruleTopic ) ) ( (lv_topics_7_0= ruleTopic ) )* otherlv_8= '}' (otherlv_9= 'date' ( (lv_date_10_0= ruleDate ) ) )? (otherlv_11= 'location' ( (lv_location_12_0= RULE_STRING ) ) )? otherlv_13= 'price' ( (lv_price_14_0= rulePrice ) ) (otherlv_15= 'volume' ( (lv_volume_16_0= RULE_INT ) ) )? otherlv_17= 'language' ( (lv_language_18_0= ruleLanguage ) ) otherlv_19= 'format' ( (lv_format_20_0= ruleFormat ) ) otherlv_21= 'number of articles per topic' ( (lv_article_cnt_22_0= RULE_INT ) ) otherlv_23= 'number of words per article' ( (lv_article_char_min_24_0= RULE_INT ) ) otherlv_25= '-' ( (lv_article_char_max_26_0= RULE_INT ) ) (otherlv_27= 'number of images per article' ( (lv_article_images_28_0= RULE_INT ) ) )? otherlv_29= 'number of columns' ( (lv_columns_cnt_30_0= RULE_INT ) ) otherlv_31= 'font size' ( (lv_font_size_32_0= ruleFontSize ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:80:3: otherlv_0= 'newspaper' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'feed link' ( (lv_feedlinks_3_0= ruleFeedlinks ) ) otherlv_4= 'topics' otherlv_5= '{' ( (lv_topics_6_0= ruleTopic ) ) ( (lv_topics_7_0= ruleTopic ) )* otherlv_8= '}' (otherlv_9= 'date' ( (lv_date_10_0= ruleDate ) ) )? (otherlv_11= 'location' ( (lv_location_12_0= RULE_STRING ) ) )? otherlv_13= 'price' ( (lv_price_14_0= rulePrice ) ) (otherlv_15= 'volume' ( (lv_volume_16_0= RULE_INT ) ) )? otherlv_17= 'language' ( (lv_language_18_0= ruleLanguage ) ) otherlv_19= 'format' ( (lv_format_20_0= ruleFormat ) ) otherlv_21= 'number of articles per topic' ( (lv_article_cnt_22_0= RULE_INT ) ) otherlv_23= 'number of words per article' ( (lv_article_char_min_24_0= RULE_INT ) ) otherlv_25= '-' ( (lv_article_char_max_26_0= RULE_INT ) ) (otherlv_27= 'number of images per article' ( (lv_article_images_28_0= RULE_INT ) ) )? otherlv_29= 'number of columns' ( (lv_columns_cnt_30_0= RULE_INT ) ) otherlv_31= 'font size' ( (lv_font_size_32_0= ruleFontSize ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleDeclaration122); 

                	newLeafNode(otherlv_0, grammarAccess.getDeclarationAccess().getNewspaperKeyword_0());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:85:1: (lv_name_1_0= RULE_ID )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeclaration139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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
                
            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleDeclaration201); 

                	newLeafNode(otherlv_5, grammarAccess.getDeclarationAccess().getLeftCurlyBracketKeyword_5());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:132:1: ( (lv_topics_6_0= ruleTopic ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:133:1: (lv_topics_6_0= ruleTopic )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:133:1: (lv_topics_6_0= ruleTopic )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:134:3: lv_topics_6_0= ruleTopic
            {
             
            	        newCompositeNode(grammarAccess.getDeclarationAccess().getTopicsTopicParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleTopic_in_ruleDeclaration222);
            lv_topics_6_0=ruleTopic();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	        }
                   		add(
                   			current, 
                   			"topics",
                    		lv_topics_6_0, 
                    		"Topic");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:150:2: ( (lv_topics_7_0= ruleTopic ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==42) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:151:1: (lv_topics_7_0= ruleTopic )
            	    {
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:151:1: (lv_topics_7_0= ruleTopic )
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:152:3: lv_topics_7_0= ruleTopic
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclarationAccess().getTopicsTopicParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTopic_in_ruleDeclaration243);
            	    lv_topics_7_0=ruleTopic();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"topics",
            	            		lv_topics_7_0, 
            	            		"Topic");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleDeclaration256); 

                	newLeafNode(otherlv_8, grammarAccess.getDeclarationAccess().getRightCurlyBracketKeyword_8());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:172:1: (otherlv_9= 'date' ( (lv_date_10_0= ruleDate ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:172:3: otherlv_9= 'date' ( (lv_date_10_0= ruleDate ) )
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleDeclaration269); 

                        	newLeafNode(otherlv_9, grammarAccess.getDeclarationAccess().getDateKeyword_9_0());
                        
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:176:1: ( (lv_date_10_0= ruleDate ) )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:177:1: (lv_date_10_0= ruleDate )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:177:1: (lv_date_10_0= ruleDate )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:178:3: lv_date_10_0= ruleDate
                    {
                     
                    	        newCompositeNode(grammarAccess.getDeclarationAccess().getDateDateParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDate_in_ruleDeclaration290);
                    lv_date_10_0=ruleDate();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
                    	        }
                           		set(
                           			current, 
                           			"date",
                            		lv_date_10_0, 
                            		"Date");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:194:4: (otherlv_11= 'location' ( (lv_location_12_0= RULE_STRING ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:194:6: otherlv_11= 'location' ( (lv_location_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleDeclaration305); 

                        	newLeafNode(otherlv_11, grammarAccess.getDeclarationAccess().getLocationKeyword_10_0());
                        
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:198:1: ( (lv_location_12_0= RULE_STRING ) )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:199:1: (lv_location_12_0= RULE_STRING )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:199:1: (lv_location_12_0= RULE_STRING )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:200:3: lv_location_12_0= RULE_STRING
                    {
                    lv_location_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDeclaration322); 

                    			newLeafNode(lv_location_12_0, grammarAccess.getDeclarationAccess().getLocationSTRINGTerminalRuleCall_10_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDeclarationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"location",
                            		lv_location_12_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleDeclaration341); 

                	newLeafNode(otherlv_13, grammarAccess.getDeclarationAccess().getPriceKeyword_11());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:220:1: ( (lv_price_14_0= rulePrice ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:221:1: (lv_price_14_0= rulePrice )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:221:1: (lv_price_14_0= rulePrice )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:222:3: lv_price_14_0= rulePrice
            {
             
            	        newCompositeNode(grammarAccess.getDeclarationAccess().getPricePriceParserRuleCall_12_0()); 
            	    
            pushFollow(FOLLOW_rulePrice_in_ruleDeclaration362);
            lv_price_14_0=rulePrice();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"price",
                    		lv_price_14_0, 
                    		"Price");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:238:2: (otherlv_15= 'volume' ( (lv_volume_16_0= RULE_INT ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:238:4: otherlv_15= 'volume' ( (lv_volume_16_0= RULE_INT ) )
                    {
                    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleDeclaration375); 

                        	newLeafNode(otherlv_15, grammarAccess.getDeclarationAccess().getVolumeKeyword_13_0());
                        
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:242:1: ( (lv_volume_16_0= RULE_INT ) )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:243:1: (lv_volume_16_0= RULE_INT )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:243:1: (lv_volume_16_0= RULE_INT )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:244:3: lv_volume_16_0= RULE_INT
                    {
                    lv_volume_16_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDeclaration392); 

                    			newLeafNode(lv_volume_16_0, grammarAccess.getDeclarationAccess().getVolumeINTTerminalRuleCall_13_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDeclarationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"volume",
                            		lv_volume_16_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,20,FOLLOW_20_in_ruleDeclaration411); 

                	newLeafNode(otherlv_17, grammarAccess.getDeclarationAccess().getLanguageKeyword_14());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:264:1: ( (lv_language_18_0= ruleLanguage ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:265:1: (lv_language_18_0= ruleLanguage )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:265:1: (lv_language_18_0= ruleLanguage )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:266:3: lv_language_18_0= ruleLanguage
            {
             
            	        newCompositeNode(grammarAccess.getDeclarationAccess().getLanguageLanguageParserRuleCall_15_0()); 
            	    
            pushFollow(FOLLOW_ruleLanguage_in_ruleDeclaration432);
            lv_language_18_0=ruleLanguage();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"language",
                    		lv_language_18_0, 
                    		"Language");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_19=(Token)match(input,21,FOLLOW_21_in_ruleDeclaration444); 

                	newLeafNode(otherlv_19, grammarAccess.getDeclarationAccess().getFormatKeyword_16());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:286:1: ( (lv_format_20_0= ruleFormat ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:287:1: (lv_format_20_0= ruleFormat )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:287:1: (lv_format_20_0= ruleFormat )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:288:3: lv_format_20_0= ruleFormat
            {
             
            	        newCompositeNode(grammarAccess.getDeclarationAccess().getFormatFormatParserRuleCall_17_0()); 
            	    
            pushFollow(FOLLOW_ruleFormat_in_ruleDeclaration465);
            lv_format_20_0=ruleFormat();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"format",
                    		lv_format_20_0, 
                    		"Format");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_21=(Token)match(input,22,FOLLOW_22_in_ruleDeclaration477); 

                	newLeafNode(otherlv_21, grammarAccess.getDeclarationAccess().getNumberOfArticlesPerTopicKeyword_18());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:308:1: ( (lv_article_cnt_22_0= RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:309:1: (lv_article_cnt_22_0= RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:309:1: (lv_article_cnt_22_0= RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:310:3: lv_article_cnt_22_0= RULE_INT
            {
            lv_article_cnt_22_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDeclaration494); 

            			newLeafNode(lv_article_cnt_22_0, grammarAccess.getDeclarationAccess().getArticle_cntINTTerminalRuleCall_19_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"article_cnt",
                    		lv_article_cnt_22_0, 
                    		"INT");
            	    

            }


            }

            otherlv_23=(Token)match(input,23,FOLLOW_23_in_ruleDeclaration511); 

                	newLeafNode(otherlv_23, grammarAccess.getDeclarationAccess().getNumberOfWordsPerArticleKeyword_20());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:330:1: ( (lv_article_char_min_24_0= RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:331:1: (lv_article_char_min_24_0= RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:331:1: (lv_article_char_min_24_0= RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:332:3: lv_article_char_min_24_0= RULE_INT
            {
            lv_article_char_min_24_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDeclaration528); 

            			newLeafNode(lv_article_char_min_24_0, grammarAccess.getDeclarationAccess().getArticle_char_minINTTerminalRuleCall_21_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"article_char_min",
                    		lv_article_char_min_24_0, 
                    		"INT");
            	    

            }


            }

            otherlv_25=(Token)match(input,24,FOLLOW_24_in_ruleDeclaration545); 

                	newLeafNode(otherlv_25, grammarAccess.getDeclarationAccess().getHyphenMinusKeyword_22());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:352:1: ( (lv_article_char_max_26_0= RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:353:1: (lv_article_char_max_26_0= RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:353:1: (lv_article_char_max_26_0= RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:354:3: lv_article_char_max_26_0= RULE_INT
            {
            lv_article_char_max_26_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDeclaration562); 

            			newLeafNode(lv_article_char_max_26_0, grammarAccess.getDeclarationAccess().getArticle_char_maxINTTerminalRuleCall_23_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"article_char_max",
                    		lv_article_char_max_26_0, 
                    		"INT");
            	    

            }


            }

            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:370:2: (otherlv_27= 'number of images per article' ( (lv_article_images_28_0= RULE_INT ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:370:4: otherlv_27= 'number of images per article' ( (lv_article_images_28_0= RULE_INT ) )
                    {
                    otherlv_27=(Token)match(input,25,FOLLOW_25_in_ruleDeclaration580); 

                        	newLeafNode(otherlv_27, grammarAccess.getDeclarationAccess().getNumberOfImagesPerArticleKeyword_24_0());
                        
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:374:1: ( (lv_article_images_28_0= RULE_INT ) )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:375:1: (lv_article_images_28_0= RULE_INT )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:375:1: (lv_article_images_28_0= RULE_INT )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:376:3: lv_article_images_28_0= RULE_INT
                    {
                    lv_article_images_28_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDeclaration597); 

                    			newLeafNode(lv_article_images_28_0, grammarAccess.getDeclarationAccess().getArticle_imagesINTTerminalRuleCall_24_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDeclarationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"article_images",
                            		lv_article_images_28_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_29=(Token)match(input,26,FOLLOW_26_in_ruleDeclaration616); 

                	newLeafNode(otherlv_29, grammarAccess.getDeclarationAccess().getNumberOfColumnsKeyword_25());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:396:1: ( (lv_columns_cnt_30_0= RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:397:1: (lv_columns_cnt_30_0= RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:397:1: (lv_columns_cnt_30_0= RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:398:3: lv_columns_cnt_30_0= RULE_INT
            {
            lv_columns_cnt_30_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDeclaration633); 

            			newLeafNode(lv_columns_cnt_30_0, grammarAccess.getDeclarationAccess().getColumns_cntINTTerminalRuleCall_26_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"columns_cnt",
                    		lv_columns_cnt_30_0, 
                    		"INT");
            	    

            }


            }

            otherlv_31=(Token)match(input,27,FOLLOW_27_in_ruleDeclaration650); 

                	newLeafNode(otherlv_31, grammarAccess.getDeclarationAccess().getFontSizeKeyword_27());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:418:1: ( (lv_font_size_32_0= ruleFontSize ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:419:1: (lv_font_size_32_0= ruleFontSize )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:419:1: (lv_font_size_32_0= ruleFontSize )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:420:3: lv_font_size_32_0= ruleFontSize
            {
             
            	        newCompositeNode(grammarAccess.getDeclarationAccess().getFont_sizeFontSizeParserRuleCall_28_0()); 
            	    
            pushFollow(FOLLOW_ruleFontSize_in_ruleDeclaration671);
            lv_font_size_32_0=ruleFontSize();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"font_size",
                    		lv_font_size_32_0, 
                    		"FontSize");
            	        afterParserOrEnumRuleCall();
            	    

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


    // $ANTLR start "entryRuleFontSize"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:444:1: entryRuleFontSize returns [EObject current=null] : iv_ruleFontSize= ruleFontSize EOF ;
    public final EObject entryRuleFontSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFontSize = null;


        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:445:2: (iv_ruleFontSize= ruleFontSize EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:446:2: iv_ruleFontSize= ruleFontSize EOF
            {
             newCompositeNode(grammarAccess.getFontSizeRule()); 
            pushFollow(FOLLOW_ruleFontSize_in_entryRuleFontSize707);
            iv_ruleFontSize=ruleFontSize();

            state._fsp--;

             current =iv_ruleFontSize; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFontSize717); 

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
    // $ANTLR end "entryRuleFontSize"


    // $ANTLR start "ruleFontSize"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:453:1: ruleFontSize returns [EObject current=null] : ( ( () otherlv_1= 'small' ) | ( () otherlv_3= 'medium' ) | ( () otherlv_5= 'large' ) ) ;
    public final EObject ruleFontSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:456:28: ( ( ( () otherlv_1= 'small' ) | ( () otherlv_3= 'medium' ) | ( () otherlv_5= 'large' ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:457:1: ( ( () otherlv_1= 'small' ) | ( () otherlv_3= 'medium' ) | ( () otherlv_5= 'large' ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:457:1: ( ( () otherlv_1= 'small' ) | ( () otherlv_3= 'medium' ) | ( () otherlv_5= 'large' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt6=1;
                }
                break;
            case 29:
                {
                alt6=2;
                }
                break;
            case 30:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:457:2: ( () otherlv_1= 'small' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:457:2: ( () otherlv_1= 'small' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:457:3: () otherlv_1= 'small'
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:457:3: ()
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:458:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFontSizeAccess().getEStringAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleFontSize764); 

                        	newLeafNode(otherlv_1, grammarAccess.getFontSizeAccess().getSmallKeyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:468:6: ( () otherlv_3= 'medium' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:468:6: ( () otherlv_3= 'medium' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:468:7: () otherlv_3= 'medium'
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:468:7: ()
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:469:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFontSizeAccess().getEStringAction_1_0(),
                                current);
                        

                    }

                    otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleFontSize793); 

                        	newLeafNode(otherlv_3, grammarAccess.getFontSizeAccess().getMediumKeyword_1_1());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:479:6: ( () otherlv_5= 'large' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:479:6: ( () otherlv_5= 'large' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:479:7: () otherlv_5= 'large'
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:479:7: ()
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:480:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFontSizeAccess().getEStringAction_2_0(),
                                current);
                        

                    }

                    otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleFontSize822); 

                        	newLeafNode(otherlv_5, grammarAccess.getFontSizeAccess().getLargeKeyword_2_1());
                        

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
    // $ANTLR end "ruleFontSize"


    // $ANTLR start "entryRuleFormat"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:497:1: entryRuleFormat returns [EObject current=null] : iv_ruleFormat= ruleFormat EOF ;
    public final EObject entryRuleFormat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormat = null;


        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:498:2: (iv_ruleFormat= ruleFormat EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:499:2: iv_ruleFormat= ruleFormat EOF
            {
             newCompositeNode(grammarAccess.getFormatRule()); 
            pushFollow(FOLLOW_ruleFormat_in_entryRuleFormat859);
            iv_ruleFormat=ruleFormat();

            state._fsp--;

             current =iv_ruleFormat; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormat869); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:506:1: ruleFormat returns [EObject current=null] : ( ( () otherlv_1= 'DIN A6' ) | ( () otherlv_3= 'DIN A5' ) | ( () otherlv_5= 'DIN A4' ) | ( () otherlv_7= 'DIN A3' ) | ( () otherlv_9= 'DIN A2' ) | ( () otherlv_11= 'DIN A1' ) | ( () otherlv_13= 'DIN A0' ) ) ;
    public final EObject ruleFormat() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;

         enterRule(); 
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:509:28: ( ( ( () otherlv_1= 'DIN A6' ) | ( () otherlv_3= 'DIN A5' ) | ( () otherlv_5= 'DIN A4' ) | ( () otherlv_7= 'DIN A3' ) | ( () otherlv_9= 'DIN A2' ) | ( () otherlv_11= 'DIN A1' ) | ( () otherlv_13= 'DIN A0' ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:510:1: ( ( () otherlv_1= 'DIN A6' ) | ( () otherlv_3= 'DIN A5' ) | ( () otherlv_5= 'DIN A4' ) | ( () otherlv_7= 'DIN A3' ) | ( () otherlv_9= 'DIN A2' ) | ( () otherlv_11= 'DIN A1' ) | ( () otherlv_13= 'DIN A0' ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:510:1: ( ( () otherlv_1= 'DIN A6' ) | ( () otherlv_3= 'DIN A5' ) | ( () otherlv_5= 'DIN A4' ) | ( () otherlv_7= 'DIN A3' ) | ( () otherlv_9= 'DIN A2' ) | ( () otherlv_11= 'DIN A1' ) | ( () otherlv_13= 'DIN A0' ) )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt7=1;
                }
                break;
            case 32:
                {
                alt7=2;
                }
                break;
            case 33:
                {
                alt7=3;
                }
                break;
            case 34:
                {
                alt7=4;
                }
                break;
            case 35:
                {
                alt7=5;
                }
                break;
            case 36:
                {
                alt7=6;
                }
                break;
            case 37:
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:510:2: ( () otherlv_1= 'DIN A6' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:510:2: ( () otherlv_1= 'DIN A6' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:510:3: () otherlv_1= 'DIN A6'
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:510:3: ()
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:511:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFormatAccess().getEStringAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleFormat916); 

                        	newLeafNode(otherlv_1, grammarAccess.getFormatAccess().getDINA6Keyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:521:6: ( () otherlv_3= 'DIN A5' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:521:6: ( () otherlv_3= 'DIN A5' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:521:7: () otherlv_3= 'DIN A5'
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:521:7: ()
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:522:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFormatAccess().getEStringAction_1_0(),
                                current);
                        

                    }

                    otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleFormat945); 

                        	newLeafNode(otherlv_3, grammarAccess.getFormatAccess().getDINA5Keyword_1_1());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:532:6: ( () otherlv_5= 'DIN A4' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:532:6: ( () otherlv_5= 'DIN A4' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:532:7: () otherlv_5= 'DIN A4'
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:532:7: ()
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:533:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFormatAccess().getEStringAction_2_0(),
                                current);
                        

                    }

                    otherlv_5=(Token)match(input,33,FOLLOW_33_in_ruleFormat974); 

                        	newLeafNode(otherlv_5, grammarAccess.getFormatAccess().getDINA4Keyword_2_1());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:543:6: ( () otherlv_7= 'DIN A3' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:543:6: ( () otherlv_7= 'DIN A3' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:543:7: () otherlv_7= 'DIN A3'
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:543:7: ()
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:544:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFormatAccess().getEStringAction_3_0(),
                                current);
                        

                    }

                    otherlv_7=(Token)match(input,34,FOLLOW_34_in_ruleFormat1003); 

                        	newLeafNode(otherlv_7, grammarAccess.getFormatAccess().getDINA3Keyword_3_1());
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:554:6: ( () otherlv_9= 'DIN A2' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:554:6: ( () otherlv_9= 'DIN A2' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:554:7: () otherlv_9= 'DIN A2'
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:554:7: ()
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:555:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFormatAccess().getEStringAction_4_0(),
                                current);
                        

                    }

                    otherlv_9=(Token)match(input,35,FOLLOW_35_in_ruleFormat1032); 

                        	newLeafNode(otherlv_9, grammarAccess.getFormatAccess().getDINA2Keyword_4_1());
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:565:6: ( () otherlv_11= 'DIN A1' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:565:6: ( () otherlv_11= 'DIN A1' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:565:7: () otherlv_11= 'DIN A1'
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:565:7: ()
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:566:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFormatAccess().getEStringAction_5_0(),
                                current);
                        

                    }

                    otherlv_11=(Token)match(input,36,FOLLOW_36_in_ruleFormat1061); 

                        	newLeafNode(otherlv_11, grammarAccess.getFormatAccess().getDINA1Keyword_5_1());
                        

                    }


                    }
                    break;
                case 7 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:576:6: ( () otherlv_13= 'DIN A0' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:576:6: ( () otherlv_13= 'DIN A0' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:576:7: () otherlv_13= 'DIN A0'
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:576:7: ()
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:577:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFormatAccess().getEStringAction_6_0(),
                                current);
                        

                    }

                    otherlv_13=(Token)match(input,37,FOLLOW_37_in_ruleFormat1090); 

                        	newLeafNode(otherlv_13, grammarAccess.getFormatAccess().getDINA0Keyword_6_1());
                        

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:594:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:595:2: (iv_ruleDate= ruleDate EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:596:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_ruleDate_in_entryRuleDate1127);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDate1137); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:603:1: ruleDate returns [EObject current=null] : (otherlv_0= '{' ( (lv_day_1_0= RULE_INT ) ) otherlv_2= '-' ( (lv_month_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_year_5_0= RULE_INT ) ) otherlv_6= '}' ) ;
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
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:606:28: ( (otherlv_0= '{' ( (lv_day_1_0= RULE_INT ) ) otherlv_2= '-' ( (lv_month_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_year_5_0= RULE_INT ) ) otherlv_6= '}' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:607:1: (otherlv_0= '{' ( (lv_day_1_0= RULE_INT ) ) otherlv_2= '-' ( (lv_month_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_year_5_0= RULE_INT ) ) otherlv_6= '}' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:607:1: (otherlv_0= '{' ( (lv_day_1_0= RULE_INT ) ) otherlv_2= '-' ( (lv_month_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_year_5_0= RULE_INT ) ) otherlv_6= '}' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:607:3: otherlv_0= '{' ( (lv_day_1_0= RULE_INT ) ) otherlv_2= '-' ( (lv_month_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_year_5_0= RULE_INT ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleDate1174); 

                	newLeafNode(otherlv_0, grammarAccess.getDateAccess().getLeftCurlyBracketKeyword_0());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:611:1: ( (lv_day_1_0= RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:612:1: (lv_day_1_0= RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:612:1: (lv_day_1_0= RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:613:3: lv_day_1_0= RULE_INT
            {
            lv_day_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDate1191); 

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

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleDate1208); 

                	newLeafNode(otherlv_2, grammarAccess.getDateAccess().getHyphenMinusKeyword_2());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:633:1: ( (lv_month_3_0= RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:634:1: (lv_month_3_0= RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:634:1: (lv_month_3_0= RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:635:3: lv_month_3_0= RULE_INT
            {
            lv_month_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDate1225); 

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

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleDate1242); 

                	newLeafNode(otherlv_4, grammarAccess.getDateAccess().getHyphenMinusKeyword_4());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:655:1: ( (lv_year_5_0= RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:656:1: (lv_year_5_0= RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:656:1: (lv_year_5_0= RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:657:3: lv_year_5_0= RULE_INT
            {
            lv_year_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDate1259); 

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

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleDate1276); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:685:1: entryRuleLanguage returns [EObject current=null] : iv_ruleLanguage= ruleLanguage EOF ;
    public final EObject entryRuleLanguage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguage = null;


        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:686:2: (iv_ruleLanguage= ruleLanguage EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:687:2: iv_ruleLanguage= ruleLanguage EOF
            {
             newCompositeNode(grammarAccess.getLanguageRule()); 
            pushFollow(FOLLOW_ruleLanguage_in_entryRuleLanguage1312);
            iv_ruleLanguage=ruleLanguage();

            state._fsp--;

             current =iv_ruleLanguage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLanguage1322); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:694:1: ruleLanguage returns [EObject current=null] : ( ( () otherlv_1= 'English' ) | ( () otherlv_3= 'German' ) ) ;
    public final EObject ruleLanguage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:697:28: ( ( ( () otherlv_1= 'English' ) | ( () otherlv_3= 'German' ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:698:1: ( ( () otherlv_1= 'English' ) | ( () otherlv_3= 'German' ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:698:1: ( ( () otherlv_1= 'English' ) | ( () otherlv_3= 'German' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==38) ) {
                alt8=1;
            }
            else if ( (LA8_0==39) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:698:2: ( () otherlv_1= 'English' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:698:2: ( () otherlv_1= 'English' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:698:3: () otherlv_1= 'English'
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:698:3: ()
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:699:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLanguageAccess().getEStringAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleLanguage1369); 

                        	newLeafNode(otherlv_1, grammarAccess.getLanguageAccess().getEnglishKeyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:709:6: ( () otherlv_3= 'German' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:709:6: ( () otherlv_3= 'German' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:709:7: () otherlv_3= 'German'
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:709:7: ()
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:710:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLanguageAccess().getEStringAction_1_0(),
                                current);
                        

                    }

                    otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleLanguage1398); 

                        	newLeafNode(otherlv_3, grammarAccess.getLanguageAccess().getGermanKeyword_1_1());
                        

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:727:1: entryRulePrice returns [EObject current=null] : iv_rulePrice= rulePrice EOF ;
    public final EObject entryRulePrice() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrice = null;


        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:728:2: (iv_rulePrice= rulePrice EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:729:2: iv_rulePrice= rulePrice EOF
            {
             newCompositeNode(grammarAccess.getPriceRule()); 
            pushFollow(FOLLOW_rulePrice_in_entryRulePrice1435);
            iv_rulePrice=rulePrice();

            state._fsp--;

             current =iv_rulePrice; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrice1445); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:736:1: rulePrice returns [EObject current=null] : (otherlv_0= '{' ( (lv_value_1_0= RULE_STRING ) ) ( (lv_currency_2_0= ruleCurrency ) ) otherlv_3= '}' ) ;
    public final EObject rulePrice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_3=null;
        EObject lv_currency_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:739:28: ( (otherlv_0= '{' ( (lv_value_1_0= RULE_STRING ) ) ( (lv_currency_2_0= ruleCurrency ) ) otherlv_3= '}' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:740:1: (otherlv_0= '{' ( (lv_value_1_0= RULE_STRING ) ) ( (lv_currency_2_0= ruleCurrency ) ) otherlv_3= '}' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:740:1: (otherlv_0= '{' ( (lv_value_1_0= RULE_STRING ) ) ( (lv_currency_2_0= ruleCurrency ) ) otherlv_3= '}' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:740:3: otherlv_0= '{' ( (lv_value_1_0= RULE_STRING ) ) ( (lv_currency_2_0= ruleCurrency ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_rulePrice1482); 

                	newLeafNode(otherlv_0, grammarAccess.getPriceAccess().getLeftCurlyBracketKeyword_0());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:744:1: ( (lv_value_1_0= RULE_STRING ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:745:1: (lv_value_1_0= RULE_STRING )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:745:1: (lv_value_1_0= RULE_STRING )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:746:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePrice1499); 

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

            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:762:2: ( (lv_currency_2_0= ruleCurrency ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:763:1: (lv_currency_2_0= ruleCurrency )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:763:1: (lv_currency_2_0= ruleCurrency )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:764:3: lv_currency_2_0= ruleCurrency
            {
             
            	        newCompositeNode(grammarAccess.getPriceAccess().getCurrencyCurrencyParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleCurrency_in_rulePrice1525);
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

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_rulePrice1537); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:792:1: entryRuleCurrency returns [EObject current=null] : iv_ruleCurrency= ruleCurrency EOF ;
    public final EObject entryRuleCurrency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCurrency = null;


        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:793:2: (iv_ruleCurrency= ruleCurrency EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:794:2: iv_ruleCurrency= ruleCurrency EOF
            {
             newCompositeNode(grammarAccess.getCurrencyRule()); 
            pushFollow(FOLLOW_ruleCurrency_in_entryRuleCurrency1573);
            iv_ruleCurrency=ruleCurrency();

            state._fsp--;

             current =iv_ruleCurrency; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCurrency1583); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:801:1: ruleCurrency returns [EObject current=null] : ( ( () otherlv_1= 'Euro' ) | ( () otherlv_3= 'Dollar' ) ) ;
    public final EObject ruleCurrency() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:804:28: ( ( ( () otherlv_1= 'Euro' ) | ( () otherlv_3= 'Dollar' ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:805:1: ( ( () otherlv_1= 'Euro' ) | ( () otherlv_3= 'Dollar' ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:805:1: ( ( () otherlv_1= 'Euro' ) | ( () otherlv_3= 'Dollar' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==40) ) {
                alt9=1;
            }
            else if ( (LA9_0==41) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:805:2: ( () otherlv_1= 'Euro' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:805:2: ( () otherlv_1= 'Euro' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:805:3: () otherlv_1= 'Euro'
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:805:3: ()
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:806:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getCurrencyAccess().getEStringAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleCurrency1630); 

                        	newLeafNode(otherlv_1, grammarAccess.getCurrencyAccess().getEuroKeyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:816:6: ( () otherlv_3= 'Dollar' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:816:6: ( () otherlv_3= 'Dollar' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:816:7: () otherlv_3= 'Dollar'
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:816:7: ()
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:817:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getCurrencyAccess().getEStringAction_1_0(),
                                current);
                        

                    }

                    otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleCurrency1659); 

                        	newLeafNode(otherlv_3, grammarAccess.getCurrencyAccess().getDollarKeyword_1_1());
                        

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


    // $ANTLR start "entryRuleTopic"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:834:1: entryRuleTopic returns [EObject current=null] : iv_ruleTopic= ruleTopic EOF ;
    public final EObject entryRuleTopic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopic = null;


        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:835:2: (iv_ruleTopic= ruleTopic EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:836:2: iv_ruleTopic= ruleTopic EOF
            {
             newCompositeNode(grammarAccess.getTopicRule()); 
            pushFollow(FOLLOW_ruleTopic_in_entryRuleTopic1696);
            iv_ruleTopic=ruleTopic();

            state._fsp--;

             current =iv_ruleTopic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTopic1706); 

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
    // $ANTLR end "entryRuleTopic"


    // $ANTLR start "ruleTopic"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:843:1: ruleTopic returns [EObject current=null] : (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tags_3_0= ruleTopicTag ) ) (otherlv_4= ', ' ( (lv_tags_5_0= ruleTopicTag ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleTopic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_tags_3_0 = null;

        EObject lv_tags_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:846:28: ( (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tags_3_0= ruleTopicTag ) ) (otherlv_4= ', ' ( (lv_tags_5_0= ruleTopicTag ) ) )* otherlv_6= '}' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:847:1: (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tags_3_0= ruleTopicTag ) ) (otherlv_4= ', ' ( (lv_tags_5_0= ruleTopicTag ) ) )* otherlv_6= '}' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:847:1: (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tags_3_0= ruleTopicTag ) ) (otherlv_4= ', ' ( (lv_tags_5_0= ruleTopicTag ) ) )* otherlv_6= '}' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:847:3: otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tags_3_0= ruleTopicTag ) ) (otherlv_4= ', ' ( (lv_tags_5_0= ruleTopicTag ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleTopic1743); 

                	newLeafNode(otherlv_0, grammarAccess.getTopicAccess().getTopicKeyword_0());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:851:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:852:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:852:1: (lv_name_1_0= RULE_ID )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:853:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTopic1760); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTopicAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTopicRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleTopic1777); 

                	newLeafNode(otherlv_2, grammarAccess.getTopicAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:873:1: ( (lv_tags_3_0= ruleTopicTag ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:874:1: (lv_tags_3_0= ruleTopicTag )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:874:1: (lv_tags_3_0= ruleTopicTag )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:875:3: lv_tags_3_0= ruleTopicTag
            {
             
            	        newCompositeNode(grammarAccess.getTopicAccess().getTagsTopicTagParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTopicTag_in_ruleTopic1798);
            lv_tags_3_0=ruleTopicTag();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTopicRule());
            	        }
                   		add(
                   			current, 
                   			"tags",
                    		lv_tags_3_0, 
                    		"TopicTag");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:891:2: (otherlv_4= ', ' ( (lv_tags_5_0= ruleTopicTag ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==43) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:891:4: otherlv_4= ', ' ( (lv_tags_5_0= ruleTopicTag ) )
            	    {
            	    otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleTopic1811); 

            	        	newLeafNode(otherlv_4, grammarAccess.getTopicAccess().getCommaSpaceKeyword_4_0());
            	        
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:895:1: ( (lv_tags_5_0= ruleTopicTag ) )
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:896:1: (lv_tags_5_0= ruleTopicTag )
            	    {
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:896:1: (lv_tags_5_0= ruleTopicTag )
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:897:3: lv_tags_5_0= ruleTopicTag
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTopicAccess().getTagsTopicTagParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTopicTag_in_ruleTopic1832);
            	    lv_tags_5_0=ruleTopicTag();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTopicRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"tags",
            	            		lv_tags_5_0, 
            	            		"TopicTag");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleTopic1846); 

                	newLeafNode(otherlv_6, grammarAccess.getTopicAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleTopic"


    // $ANTLR start "entryRuleTopicTag"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:925:1: entryRuleTopicTag returns [EObject current=null] : iv_ruleTopicTag= ruleTopicTag EOF ;
    public final EObject entryRuleTopicTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopicTag = null;


        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:926:2: (iv_ruleTopicTag= ruleTopicTag EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:927:2: iv_ruleTopicTag= ruleTopicTag EOF
            {
             newCompositeNode(grammarAccess.getTopicTagRule()); 
            pushFollow(FOLLOW_ruleTopicTag_in_entryRuleTopicTag1882);
            iv_ruleTopicTag=ruleTopicTag();

            state._fsp--;

             current =iv_ruleTopicTag; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTopicTag1892); 

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
    // $ANTLR end "entryRuleTopicTag"


    // $ANTLR start "ruleTopicTag"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:934:1: ruleTopicTag returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleTopicTag() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:937:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:938:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:938:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:939:1: (lv_value_0_0= RULE_STRING )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:939:1: (lv_value_0_0= RULE_STRING )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:940:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTopicTag1933); 

            			newLeafNode(lv_value_0_0, grammarAccess.getTopicTagAccess().getValueSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTopicTagRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleTopicTag"


    // $ANTLR start "entryRuleFeedlinks"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:964:1: entryRuleFeedlinks returns [EObject current=null] : iv_ruleFeedlinks= ruleFeedlinks EOF ;
    public final EObject entryRuleFeedlinks() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeedlinks = null;


        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:965:2: (iv_ruleFeedlinks= ruleFeedlinks EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:966:2: iv_ruleFeedlinks= ruleFeedlinks EOF
            {
             newCompositeNode(grammarAccess.getFeedlinksRule()); 
            pushFollow(FOLLOW_ruleFeedlinks_in_entryRuleFeedlinks1973);
            iv_ruleFeedlinks=ruleFeedlinks();

            state._fsp--;

             current =iv_ruleFeedlinks; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeedlinks1983); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:973:1: ruleFeedlinks returns [EObject current=null] : (otherlv_0= '{' ( (lv_pairs_1_0= rulePair ) ) (otherlv_2= ', ' ( (lv_pairs_3_0= rulePair ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleFeedlinks() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_pairs_1_0 = null;

        EObject lv_pairs_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:976:28: ( (otherlv_0= '{' ( (lv_pairs_1_0= rulePair ) ) (otherlv_2= ', ' ( (lv_pairs_3_0= rulePair ) ) )* otherlv_4= '}' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:977:1: (otherlv_0= '{' ( (lv_pairs_1_0= rulePair ) ) (otherlv_2= ', ' ( (lv_pairs_3_0= rulePair ) ) )* otherlv_4= '}' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:977:1: (otherlv_0= '{' ( (lv_pairs_1_0= rulePair ) ) (otherlv_2= ', ' ( (lv_pairs_3_0= rulePair ) ) )* otherlv_4= '}' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:977:3: otherlv_0= '{' ( (lv_pairs_1_0= rulePair ) ) (otherlv_2= ', ' ( (lv_pairs_3_0= rulePair ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleFeedlinks2020); 

                	newLeafNode(otherlv_0, grammarAccess.getFeedlinksAccess().getLeftCurlyBracketKeyword_0());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:981:1: ( (lv_pairs_1_0= rulePair ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:982:1: (lv_pairs_1_0= rulePair )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:982:1: (lv_pairs_1_0= rulePair )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:983:3: lv_pairs_1_0= rulePair
            {
             
            	        newCompositeNode(grammarAccess.getFeedlinksAccess().getPairsPairParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePair_in_ruleFeedlinks2041);
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

            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:999:2: (otherlv_2= ', ' ( (lv_pairs_3_0= rulePair ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==43) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:999:4: otherlv_2= ', ' ( (lv_pairs_3_0= rulePair ) )
            	    {
            	    otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleFeedlinks2054); 

            	        	newLeafNode(otherlv_2, grammarAccess.getFeedlinksAccess().getCommaSpaceKeyword_2_0());
            	        
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1003:1: ( (lv_pairs_3_0= rulePair ) )
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1004:1: (lv_pairs_3_0= rulePair )
            	    {
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1004:1: (lv_pairs_3_0= rulePair )
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1005:3: lv_pairs_3_0= rulePair
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFeedlinksAccess().getPairsPairParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePair_in_ruleFeedlinks2075);
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
            	    break loop11;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleFeedlinks2089); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1033:1: entryRulePair returns [EObject current=null] : iv_rulePair= rulePair EOF ;
    public final EObject entryRulePair() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePair = null;


        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1034:2: (iv_rulePair= rulePair EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1035:2: iv_rulePair= rulePair EOF
            {
             newCompositeNode(grammarAccess.getPairRule()); 
            pushFollow(FOLLOW_rulePair_in_entryRulePair2125);
            iv_rulePair=rulePair();

            state._fsp--;

             current =iv_rulePair; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePair2135); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1042:1: rulePair returns [EObject current=null] : (otherlv_0= '{' ( (lv_key_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= '}' ) ;
    public final EObject rulePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_key_1_0=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1045:28: ( (otherlv_0= '{' ( (lv_key_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= '}' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1046:1: (otherlv_0= '{' ( (lv_key_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= '}' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1046:1: (otherlv_0= '{' ( (lv_key_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= '}' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1046:3: otherlv_0= '{' ( (lv_key_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_rulePair2172); 

                	newLeafNode(otherlv_0, grammarAccess.getPairAccess().getLeftCurlyBracketKeyword_0());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1050:1: ( (lv_key_1_0= RULE_ID ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1051:1: (lv_key_1_0= RULE_ID )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1051:1: (lv_key_1_0= RULE_ID )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1052:3: lv_key_1_0= RULE_ID
            {
            lv_key_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePair2189); 

            			newLeafNode(lv_key_1_0, grammarAccess.getPairAccess().getKeyIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPairRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"key",
                    		lv_key_1_0, 
                    		"ID");
            	    

            }


            }

            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1068:2: ( (lv_value_2_0= RULE_STRING ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1069:1: (lv_value_2_0= RULE_STRING )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1069:1: (lv_value_2_0= RULE_STRING )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1070:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePair2211); 

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

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_rulePair2228); 

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
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeclaration139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDeclaration156 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleFeedlinks_in_ruleDeclaration177 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDeclaration189 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDeclaration201 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ruleTopic_in_ruleDeclaration222 = new BitSet(new long[]{0x0000040000008000L});
    public static final BitSet FOLLOW_ruleTopic_in_ruleDeclaration243 = new BitSet(new long[]{0x0000040000008000L});
    public static final BitSet FOLLOW_15_in_ruleDeclaration256 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_16_in_ruleDeclaration269 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleDate_in_ruleDeclaration290 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleDeclaration305 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDeclaration322 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDeclaration341 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rulePrice_in_ruleDeclaration362 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleDeclaration375 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDeclaration392 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDeclaration411 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_ruleLanguage_in_ruleDeclaration432 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDeclaration444 = new BitSet(new long[]{0x0000003F80000000L});
    public static final BitSet FOLLOW_ruleFormat_in_ruleDeclaration465 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDeclaration477 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDeclaration494 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleDeclaration511 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDeclaration528 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDeclaration545 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDeclaration562 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_25_in_ruleDeclaration580 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDeclaration597 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleDeclaration616 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDeclaration633 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleDeclaration650 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_ruleFontSize_in_ruleDeclaration671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFontSize_in_entryRuleFontSize707 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFontSize717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleFontSize764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleFontSize793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleFontSize822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormat_in_entryRuleFormat859 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormat869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleFormat916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleFormat945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleFormat974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleFormat1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleFormat1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleFormat1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleFormat1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_in_entryRuleDate1127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDate1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleDate1174 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDate1191 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDate1208 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDate1225 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDate1242 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDate1259 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDate1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLanguage_in_entryRuleLanguage1312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLanguage1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleLanguage1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleLanguage1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrice_in_entryRulePrice1435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrice1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePrice1482 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePrice1499 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_ruleCurrency_in_rulePrice1525 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePrice1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCurrency_in_entryRuleCurrency1573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCurrency1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleCurrency1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleCurrency1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopic_in_entryRuleTopic1696 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopic1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleTopic1743 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTopic1760 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTopic1777 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleTopicTag_in_ruleTopic1798 = new BitSet(new long[]{0x0000080000008000L});
    public static final BitSet FOLLOW_43_in_ruleTopic1811 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleTopicTag_in_ruleTopic1832 = new BitSet(new long[]{0x0000080000008000L});
    public static final BitSet FOLLOW_15_in_ruleTopic1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopicTag_in_entryRuleTopicTag1882 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopicTag1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTopicTag1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeedlinks_in_entryRuleFeedlinks1973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeedlinks1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleFeedlinks2020 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rulePair_in_ruleFeedlinks2041 = new BitSet(new long[]{0x0000080000008000L});
    public static final BitSet FOLLOW_43_in_ruleFeedlinks2054 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rulePair_in_ruleFeedlinks2075 = new BitSet(new long[]{0x0000080000008000L});
    public static final BitSet FOLLOW_15_in_ruleFeedlinks2089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePair_in_entryRulePair2125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePair2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePair2172 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePair2189 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePair2211 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePair2228 = new BitSet(new long[]{0x0000000000000002L});

}