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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_URL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'newspaper'", "'{'", "'feed links'", "', '", "'}'", "'topics'", "'date'", "'location'", "'price'", "'volume'", "'language'", "'format'", "'number of articles per topic'", "'number of words per article'", "'-'", "'number of images per article'", "'number of columns'", "'font size'", "'small'", "'medium'", "'large'", "'DIN A6'", "'DIN A5'", "'DIN A4'", "'DIN A3'", "'DIN A2'", "'DIN A1'", "'DIN A0'", "'English'", "'German'", "'Euro [\\u20AC]'", "'Dollar [$]'", "'topic'", "':'", "'.'", "','"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int RULE_URL=7;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
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
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:76:1: ruleDeclaration returns [EObject current=null] : (otherlv_0= 'newspaper' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'feed links' otherlv_4= '{' ( (lv_feedlinks_5_0= rulePair ) ) (otherlv_6= ', ' ( (lv_pairs_7_0= rulePair ) ) )* otherlv_8= '}' otherlv_9= 'topics' otherlv_10= '{' ( (lv_topics_11_0= ruleTopic ) ) ( (lv_topics_12_0= ruleTopic ) )* otherlv_13= '}' (otherlv_14= 'date' ( (lv_date_15_0= ruleDate ) ) )? (otherlv_16= 'location' ( (lv_location_17_0= RULE_STRING ) ) )? otherlv_18= 'price' ( (lv_price_19_0= rulePrice ) ) (otherlv_20= 'volume' ( (lv_volume_21_0= RULE_INT ) ) )? otherlv_22= 'language' ( (lv_language_23_0= ruleLanguage ) ) otherlv_24= 'format' ( (lv_format_25_0= ruleFormat ) ) otherlv_26= 'number of articles per topic' ( (lv_articleCnt_27_0= RULE_INT ) ) otherlv_28= 'number of words per article' ( (lv_articleWordsMin_29_0= RULE_INT ) ) otherlv_30= '-' ( (lv_articleWordsMax_31_0= RULE_INT ) ) (otherlv_32= 'number of images per article' ( (lv_imagesCnt_33_0= ruleImagesCount ) ) )? otherlv_34= 'number of columns' ( (lv_columnsCnt_35_0= RULE_INT ) ) otherlv_36= 'font size' ( (lv_fontSize_37_0= ruleFontSize ) ) otherlv_38= '}' ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token lv_location_17_0=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token lv_volume_21_0=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token lv_articleCnt_27_0=null;
        Token otherlv_28=null;
        Token lv_articleWordsMin_29_0=null;
        Token otherlv_30=null;
        Token lv_articleWordsMax_31_0=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token lv_columnsCnt_35_0=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        EObject lv_feedlinks_5_0 = null;

        EObject lv_pairs_7_0 = null;

        EObject lv_topics_11_0 = null;

        EObject lv_topics_12_0 = null;

        EObject lv_date_15_0 = null;

        EObject lv_price_19_0 = null;

        EObject lv_language_23_0 = null;

        EObject lv_format_25_0 = null;

        EObject lv_imagesCnt_33_0 = null;

        EObject lv_fontSize_37_0 = null;


         enterRule(); 
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:79:28: ( (otherlv_0= 'newspaper' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'feed links' otherlv_4= '{' ( (lv_feedlinks_5_0= rulePair ) ) (otherlv_6= ', ' ( (lv_pairs_7_0= rulePair ) ) )* otherlv_8= '}' otherlv_9= 'topics' otherlv_10= '{' ( (lv_topics_11_0= ruleTopic ) ) ( (lv_topics_12_0= ruleTopic ) )* otherlv_13= '}' (otherlv_14= 'date' ( (lv_date_15_0= ruleDate ) ) )? (otherlv_16= 'location' ( (lv_location_17_0= RULE_STRING ) ) )? otherlv_18= 'price' ( (lv_price_19_0= rulePrice ) ) (otherlv_20= 'volume' ( (lv_volume_21_0= RULE_INT ) ) )? otherlv_22= 'language' ( (lv_language_23_0= ruleLanguage ) ) otherlv_24= 'format' ( (lv_format_25_0= ruleFormat ) ) otherlv_26= 'number of articles per topic' ( (lv_articleCnt_27_0= RULE_INT ) ) otherlv_28= 'number of words per article' ( (lv_articleWordsMin_29_0= RULE_INT ) ) otherlv_30= '-' ( (lv_articleWordsMax_31_0= RULE_INT ) ) (otherlv_32= 'number of images per article' ( (lv_imagesCnt_33_0= ruleImagesCount ) ) )? otherlv_34= 'number of columns' ( (lv_columnsCnt_35_0= RULE_INT ) ) otherlv_36= 'font size' ( (lv_fontSize_37_0= ruleFontSize ) ) otherlv_38= '}' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:80:1: (otherlv_0= 'newspaper' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'feed links' otherlv_4= '{' ( (lv_feedlinks_5_0= rulePair ) ) (otherlv_6= ', ' ( (lv_pairs_7_0= rulePair ) ) )* otherlv_8= '}' otherlv_9= 'topics' otherlv_10= '{' ( (lv_topics_11_0= ruleTopic ) ) ( (lv_topics_12_0= ruleTopic ) )* otherlv_13= '}' (otherlv_14= 'date' ( (lv_date_15_0= ruleDate ) ) )? (otherlv_16= 'location' ( (lv_location_17_0= RULE_STRING ) ) )? otherlv_18= 'price' ( (lv_price_19_0= rulePrice ) ) (otherlv_20= 'volume' ( (lv_volume_21_0= RULE_INT ) ) )? otherlv_22= 'language' ( (lv_language_23_0= ruleLanguage ) ) otherlv_24= 'format' ( (lv_format_25_0= ruleFormat ) ) otherlv_26= 'number of articles per topic' ( (lv_articleCnt_27_0= RULE_INT ) ) otherlv_28= 'number of words per article' ( (lv_articleWordsMin_29_0= RULE_INT ) ) otherlv_30= '-' ( (lv_articleWordsMax_31_0= RULE_INT ) ) (otherlv_32= 'number of images per article' ( (lv_imagesCnt_33_0= ruleImagesCount ) ) )? otherlv_34= 'number of columns' ( (lv_columnsCnt_35_0= RULE_INT ) ) otherlv_36= 'font size' ( (lv_fontSize_37_0= ruleFontSize ) ) otherlv_38= '}' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:80:1: (otherlv_0= 'newspaper' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'feed links' otherlv_4= '{' ( (lv_feedlinks_5_0= rulePair ) ) (otherlv_6= ', ' ( (lv_pairs_7_0= rulePair ) ) )* otherlv_8= '}' otherlv_9= 'topics' otherlv_10= '{' ( (lv_topics_11_0= ruleTopic ) ) ( (lv_topics_12_0= ruleTopic ) )* otherlv_13= '}' (otherlv_14= 'date' ( (lv_date_15_0= ruleDate ) ) )? (otherlv_16= 'location' ( (lv_location_17_0= RULE_STRING ) ) )? otherlv_18= 'price' ( (lv_price_19_0= rulePrice ) ) (otherlv_20= 'volume' ( (lv_volume_21_0= RULE_INT ) ) )? otherlv_22= 'language' ( (lv_language_23_0= ruleLanguage ) ) otherlv_24= 'format' ( (lv_format_25_0= ruleFormat ) ) otherlv_26= 'number of articles per topic' ( (lv_articleCnt_27_0= RULE_INT ) ) otherlv_28= 'number of words per article' ( (lv_articleWordsMin_29_0= RULE_INT ) ) otherlv_30= '-' ( (lv_articleWordsMax_31_0= RULE_INT ) ) (otherlv_32= 'number of images per article' ( (lv_imagesCnt_33_0= ruleImagesCount ) ) )? otherlv_34= 'number of columns' ( (lv_columnsCnt_35_0= RULE_INT ) ) otherlv_36= 'font size' ( (lv_fontSize_37_0= ruleFontSize ) ) otherlv_38= '}' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:80:3: otherlv_0= 'newspaper' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'feed links' otherlv_4= '{' ( (lv_feedlinks_5_0= rulePair ) ) (otherlv_6= ', ' ( (lv_pairs_7_0= rulePair ) ) )* otherlv_8= '}' otherlv_9= 'topics' otherlv_10= '{' ( (lv_topics_11_0= ruleTopic ) ) ( (lv_topics_12_0= ruleTopic ) )* otherlv_13= '}' (otherlv_14= 'date' ( (lv_date_15_0= ruleDate ) ) )? (otherlv_16= 'location' ( (lv_location_17_0= RULE_STRING ) ) )? otherlv_18= 'price' ( (lv_price_19_0= rulePrice ) ) (otherlv_20= 'volume' ( (lv_volume_21_0= RULE_INT ) ) )? otherlv_22= 'language' ( (lv_language_23_0= ruleLanguage ) ) otherlv_24= 'format' ( (lv_format_25_0= ruleFormat ) ) otherlv_26= 'number of articles per topic' ( (lv_articleCnt_27_0= RULE_INT ) ) otherlv_28= 'number of words per article' ( (lv_articleWordsMin_29_0= RULE_INT ) ) otherlv_30= '-' ( (lv_articleWordsMax_31_0= RULE_INT ) ) (otherlv_32= 'number of images per article' ( (lv_imagesCnt_33_0= ruleImagesCount ) ) )? otherlv_34= 'number of columns' ( (lv_columnsCnt_35_0= RULE_INT ) ) otherlv_36= 'font size' ( (lv_fontSize_37_0= ruleFontSize ) ) otherlv_38= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleDeclaration122); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleDeclaration156); 

                	newLeafNode(otherlv_2, grammarAccess.getDeclarationAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleDeclaration168); 

                	newLeafNode(otherlv_3, grammarAccess.getDeclarationAccess().getFeedLinksKeyword_3());
                
            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleDeclaration180); 

                	newLeafNode(otherlv_4, grammarAccess.getDeclarationAccess().getLeftCurlyBracketKeyword_4());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:114:1: ( (lv_feedlinks_5_0= rulePair ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:115:1: (lv_feedlinks_5_0= rulePair )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:115:1: (lv_feedlinks_5_0= rulePair )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:116:3: lv_feedlinks_5_0= rulePair
            {
             
            	        newCompositeNode(grammarAccess.getDeclarationAccess().getFeedlinksPairParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_rulePair_in_ruleDeclaration201);
            lv_feedlinks_5_0=rulePair();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	        }
                   		add(
                   			current, 
                   			"feedlinks",
                    		lv_feedlinks_5_0, 
                    		"Pair");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:132:2: (otherlv_6= ', ' ( (lv_pairs_7_0= rulePair ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:132:4: otherlv_6= ', ' ( (lv_pairs_7_0= rulePair ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleDeclaration214); 

            	        	newLeafNode(otherlv_6, grammarAccess.getDeclarationAccess().getCommaSpaceKeyword_6_0());
            	        
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:136:1: ( (lv_pairs_7_0= rulePair ) )
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:137:1: (lv_pairs_7_0= rulePair )
            	    {
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:137:1: (lv_pairs_7_0= rulePair )
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:138:3: lv_pairs_7_0= rulePair
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclarationAccess().getPairsPairParserRuleCall_6_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePair_in_ruleDeclaration235);
            	    lv_pairs_7_0=rulePair();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"pairs",
            	            		lv_pairs_7_0, 
            	            		"Pair");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleDeclaration249); 

                	newLeafNode(otherlv_8, grammarAccess.getDeclarationAccess().getRightCurlyBracketKeyword_7());
                
            otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleDeclaration261); 

                	newLeafNode(otherlv_9, grammarAccess.getDeclarationAccess().getTopicsKeyword_8());
                
            otherlv_10=(Token)match(input,13,FOLLOW_13_in_ruleDeclaration273); 

                	newLeafNode(otherlv_10, grammarAccess.getDeclarationAccess().getLeftCurlyBracketKeyword_9());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:166:1: ( (lv_topics_11_0= ruleTopic ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:167:1: (lv_topics_11_0= ruleTopic )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:167:1: (lv_topics_11_0= ruleTopic )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:168:3: lv_topics_11_0= ruleTopic
            {
             
            	        newCompositeNode(grammarAccess.getDeclarationAccess().getTopicsTopicParserRuleCall_10_0()); 
            	    
            pushFollow(FOLLOW_ruleTopic_in_ruleDeclaration294);
            lv_topics_11_0=ruleTopic();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	        }
                   		add(
                   			current, 
                   			"topics",
                    		lv_topics_11_0, 
                    		"Topic");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:184:2: ( (lv_topics_12_0= ruleTopic ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==44) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:185:1: (lv_topics_12_0= ruleTopic )
            	    {
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:185:1: (lv_topics_12_0= ruleTopic )
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:186:3: lv_topics_12_0= ruleTopic
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclarationAccess().getTopicsTopicParserRuleCall_11_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTopic_in_ruleDeclaration315);
            	    lv_topics_12_0=ruleTopic();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"topics",
            	            		lv_topics_12_0, 
            	            		"Topic");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_13=(Token)match(input,16,FOLLOW_16_in_ruleDeclaration328); 

                	newLeafNode(otherlv_13, grammarAccess.getDeclarationAccess().getRightCurlyBracketKeyword_12());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:206:1: (otherlv_14= 'date' ( (lv_date_15_0= ruleDate ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:206:3: otherlv_14= 'date' ( (lv_date_15_0= ruleDate ) )
                    {
                    otherlv_14=(Token)match(input,18,FOLLOW_18_in_ruleDeclaration341); 

                        	newLeafNode(otherlv_14, grammarAccess.getDeclarationAccess().getDateKeyword_13_0());
                        
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:210:1: ( (lv_date_15_0= ruleDate ) )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:211:1: (lv_date_15_0= ruleDate )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:211:1: (lv_date_15_0= ruleDate )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:212:3: lv_date_15_0= ruleDate
                    {
                     
                    	        newCompositeNode(grammarAccess.getDeclarationAccess().getDateDateParserRuleCall_13_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDate_in_ruleDeclaration362);
                    lv_date_15_0=ruleDate();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
                    	        }
                           		set(
                           			current, 
                           			"date",
                            		lv_date_15_0, 
                            		"Date");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:228:4: (otherlv_16= 'location' ( (lv_location_17_0= RULE_STRING ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:228:6: otherlv_16= 'location' ( (lv_location_17_0= RULE_STRING ) )
                    {
                    otherlv_16=(Token)match(input,19,FOLLOW_19_in_ruleDeclaration377); 

                        	newLeafNode(otherlv_16, grammarAccess.getDeclarationAccess().getLocationKeyword_14_0());
                        
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:232:1: ( (lv_location_17_0= RULE_STRING ) )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:233:1: (lv_location_17_0= RULE_STRING )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:233:1: (lv_location_17_0= RULE_STRING )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:234:3: lv_location_17_0= RULE_STRING
                    {
                    lv_location_17_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDeclaration394); 

                    			newLeafNode(lv_location_17_0, grammarAccess.getDeclarationAccess().getLocationSTRINGTerminalRuleCall_14_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDeclarationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"location",
                            		lv_location_17_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,20,FOLLOW_20_in_ruleDeclaration413); 

                	newLeafNode(otherlv_18, grammarAccess.getDeclarationAccess().getPriceKeyword_15());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:254:1: ( (lv_price_19_0= rulePrice ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:255:1: (lv_price_19_0= rulePrice )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:255:1: (lv_price_19_0= rulePrice )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:256:3: lv_price_19_0= rulePrice
            {
             
            	        newCompositeNode(grammarAccess.getDeclarationAccess().getPricePriceParserRuleCall_16_0()); 
            	    
            pushFollow(FOLLOW_rulePrice_in_ruleDeclaration434);
            lv_price_19_0=rulePrice();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"price",
                    		lv_price_19_0, 
                    		"Price");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:272:2: (otherlv_20= 'volume' ( (lv_volume_21_0= RULE_INT ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:272:4: otherlv_20= 'volume' ( (lv_volume_21_0= RULE_INT ) )
                    {
                    otherlv_20=(Token)match(input,21,FOLLOW_21_in_ruleDeclaration447); 

                        	newLeafNode(otherlv_20, grammarAccess.getDeclarationAccess().getVolumeKeyword_17_0());
                        
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:276:1: ( (lv_volume_21_0= RULE_INT ) )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:277:1: (lv_volume_21_0= RULE_INT )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:277:1: (lv_volume_21_0= RULE_INT )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:278:3: lv_volume_21_0= RULE_INT
                    {
                    lv_volume_21_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDeclaration464); 

                    			newLeafNode(lv_volume_21_0, grammarAccess.getDeclarationAccess().getVolumeINTTerminalRuleCall_17_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDeclarationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"volume",
                            		lv_volume_21_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_22=(Token)match(input,22,FOLLOW_22_in_ruleDeclaration483); 

                	newLeafNode(otherlv_22, grammarAccess.getDeclarationAccess().getLanguageKeyword_18());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:298:1: ( (lv_language_23_0= ruleLanguage ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:299:1: (lv_language_23_0= ruleLanguage )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:299:1: (lv_language_23_0= ruleLanguage )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:300:3: lv_language_23_0= ruleLanguage
            {
             
            	        newCompositeNode(grammarAccess.getDeclarationAccess().getLanguageLanguageParserRuleCall_19_0()); 
            	    
            pushFollow(FOLLOW_ruleLanguage_in_ruleDeclaration504);
            lv_language_23_0=ruleLanguage();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"language",
                    		lv_language_23_0, 
                    		"Language");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_24=(Token)match(input,23,FOLLOW_23_in_ruleDeclaration516); 

                	newLeafNode(otherlv_24, grammarAccess.getDeclarationAccess().getFormatKeyword_20());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:320:1: ( (lv_format_25_0= ruleFormat ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:321:1: (lv_format_25_0= ruleFormat )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:321:1: (lv_format_25_0= ruleFormat )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:322:3: lv_format_25_0= ruleFormat
            {
             
            	        newCompositeNode(grammarAccess.getDeclarationAccess().getFormatFormatParserRuleCall_21_0()); 
            	    
            pushFollow(FOLLOW_ruleFormat_in_ruleDeclaration537);
            lv_format_25_0=ruleFormat();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"format",
                    		lv_format_25_0, 
                    		"Format");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_26=(Token)match(input,24,FOLLOW_24_in_ruleDeclaration549); 

                	newLeafNode(otherlv_26, grammarAccess.getDeclarationAccess().getNumberOfArticlesPerTopicKeyword_22());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:342:1: ( (lv_articleCnt_27_0= RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:343:1: (lv_articleCnt_27_0= RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:343:1: (lv_articleCnt_27_0= RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:344:3: lv_articleCnt_27_0= RULE_INT
            {
            lv_articleCnt_27_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDeclaration566); 

            			newLeafNode(lv_articleCnt_27_0, grammarAccess.getDeclarationAccess().getArticleCntINTTerminalRuleCall_23_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"articleCnt",
                    		lv_articleCnt_27_0, 
                    		"INT");
            	    

            }


            }

            otherlv_28=(Token)match(input,25,FOLLOW_25_in_ruleDeclaration583); 

                	newLeafNode(otherlv_28, grammarAccess.getDeclarationAccess().getNumberOfWordsPerArticleKeyword_24());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:364:1: ( (lv_articleWordsMin_29_0= RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:365:1: (lv_articleWordsMin_29_0= RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:365:1: (lv_articleWordsMin_29_0= RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:366:3: lv_articleWordsMin_29_0= RULE_INT
            {
            lv_articleWordsMin_29_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDeclaration600); 

            			newLeafNode(lv_articleWordsMin_29_0, grammarAccess.getDeclarationAccess().getArticleWordsMinINTTerminalRuleCall_25_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"articleWordsMin",
                    		lv_articleWordsMin_29_0, 
                    		"INT");
            	    

            }


            }

            otherlv_30=(Token)match(input,26,FOLLOW_26_in_ruleDeclaration617); 

                	newLeafNode(otherlv_30, grammarAccess.getDeclarationAccess().getHyphenMinusKeyword_26());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:386:1: ( (lv_articleWordsMax_31_0= RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:387:1: (lv_articleWordsMax_31_0= RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:387:1: (lv_articleWordsMax_31_0= RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:388:3: lv_articleWordsMax_31_0= RULE_INT
            {
            lv_articleWordsMax_31_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDeclaration634); 

            			newLeafNode(lv_articleWordsMax_31_0, grammarAccess.getDeclarationAccess().getArticleWordsMaxINTTerminalRuleCall_27_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"articleWordsMax",
                    		lv_articleWordsMax_31_0, 
                    		"INT");
            	    

            }


            }

            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:404:2: (otherlv_32= 'number of images per article' ( (lv_imagesCnt_33_0= ruleImagesCount ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:404:4: otherlv_32= 'number of images per article' ( (lv_imagesCnt_33_0= ruleImagesCount ) )
                    {
                    otherlv_32=(Token)match(input,27,FOLLOW_27_in_ruleDeclaration652); 

                        	newLeafNode(otherlv_32, grammarAccess.getDeclarationAccess().getNumberOfImagesPerArticleKeyword_28_0());
                        
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:408:1: ( (lv_imagesCnt_33_0= ruleImagesCount ) )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:409:1: (lv_imagesCnt_33_0= ruleImagesCount )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:409:1: (lv_imagesCnt_33_0= ruleImagesCount )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:410:3: lv_imagesCnt_33_0= ruleImagesCount
                    {
                     
                    	        newCompositeNode(grammarAccess.getDeclarationAccess().getImagesCntImagesCountParserRuleCall_28_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleImagesCount_in_ruleDeclaration673);
                    lv_imagesCnt_33_0=ruleImagesCount();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
                    	        }
                           		set(
                           			current, 
                           			"imagesCnt",
                            		lv_imagesCnt_33_0, 
                            		"ImagesCount");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_34=(Token)match(input,28,FOLLOW_28_in_ruleDeclaration687); 

                	newLeafNode(otherlv_34, grammarAccess.getDeclarationAccess().getNumberOfColumnsKeyword_29());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:430:1: ( (lv_columnsCnt_35_0= RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:431:1: (lv_columnsCnt_35_0= RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:431:1: (lv_columnsCnt_35_0= RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:432:3: lv_columnsCnt_35_0= RULE_INT
            {
            lv_columnsCnt_35_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDeclaration704); 

            			newLeafNode(lv_columnsCnt_35_0, grammarAccess.getDeclarationAccess().getColumnsCntINTTerminalRuleCall_30_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"columnsCnt",
                    		lv_columnsCnt_35_0, 
                    		"INT");
            	    

            }


            }

            otherlv_36=(Token)match(input,29,FOLLOW_29_in_ruleDeclaration721); 

                	newLeafNode(otherlv_36, grammarAccess.getDeclarationAccess().getFontSizeKeyword_31());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:452:1: ( (lv_fontSize_37_0= ruleFontSize ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:453:1: (lv_fontSize_37_0= ruleFontSize )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:453:1: (lv_fontSize_37_0= ruleFontSize )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:454:3: lv_fontSize_37_0= ruleFontSize
            {
             
            	        newCompositeNode(grammarAccess.getDeclarationAccess().getFontSizeFontSizeParserRuleCall_32_0()); 
            	    
            pushFollow(FOLLOW_ruleFontSize_in_ruleDeclaration742);
            lv_fontSize_37_0=ruleFontSize();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"fontSize",
                    		lv_fontSize_37_0, 
                    		"FontSize");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_38=(Token)match(input,16,FOLLOW_16_in_ruleDeclaration754); 

                	newLeafNode(otherlv_38, grammarAccess.getDeclarationAccess().getRightCurlyBracketKeyword_33());
                

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


    // $ANTLR start "entryRuleImagesCount"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:482:1: entryRuleImagesCount returns [EObject current=null] : iv_ruleImagesCount= ruleImagesCount EOF ;
    public final EObject entryRuleImagesCount() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImagesCount = null;


        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:483:2: (iv_ruleImagesCount= ruleImagesCount EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:484:2: iv_ruleImagesCount= ruleImagesCount EOF
            {
             newCompositeNode(grammarAccess.getImagesCountRule()); 
            pushFollow(FOLLOW_ruleImagesCount_in_entryRuleImagesCount790);
            iv_ruleImagesCount=ruleImagesCount();

            state._fsp--;

             current =iv_ruleImagesCount; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImagesCount800); 

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
    // $ANTLR end "entryRuleImagesCount"


    // $ANTLR start "ruleImagesCount"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:491:1: ruleImagesCount returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleImagesCount() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:494:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:495:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:495:1: ( (lv_value_0_0= RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:496:1: (lv_value_0_0= RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:496:1: (lv_value_0_0= RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:497:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleImagesCount841); 

            			newLeafNode(lv_value_0_0, grammarAccess.getImagesCountAccess().getValueINTTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImagesCountRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"INT");
            	    

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
    // $ANTLR end "ruleImagesCount"


    // $ANTLR start "entryRuleFontSize"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:521:1: entryRuleFontSize returns [EObject current=null] : iv_ruleFontSize= ruleFontSize EOF ;
    public final EObject entryRuleFontSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFontSize = null;


        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:522:2: (iv_ruleFontSize= ruleFontSize EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:523:2: iv_ruleFontSize= ruleFontSize EOF
            {
             newCompositeNode(grammarAccess.getFontSizeRule()); 
            pushFollow(FOLLOW_ruleFontSize_in_entryRuleFontSize881);
            iv_ruleFontSize=ruleFontSize();

            state._fsp--;

             current =iv_ruleFontSize; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFontSize891); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:530:1: ruleFontSize returns [EObject current=null] : ( ( () otherlv_1= 'small' ) | ( () otherlv_3= 'medium' ) | ( () otherlv_5= 'large' ) ) ;
    public final EObject ruleFontSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:533:28: ( ( ( () otherlv_1= 'small' ) | ( () otherlv_3= 'medium' ) | ( () otherlv_5= 'large' ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:534:1: ( ( () otherlv_1= 'small' ) | ( () otherlv_3= 'medium' ) | ( () otherlv_5= 'large' ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:534:1: ( ( () otherlv_1= 'small' ) | ( () otherlv_3= 'medium' ) | ( () otherlv_5= 'large' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt7=1;
                }
                break;
            case 31:
                {
                alt7=2;
                }
                break;
            case 32:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:534:2: ( () otherlv_1= 'small' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:534:2: ( () otherlv_1= 'small' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:534:3: () otherlv_1= 'small'
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:534:3: ()
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:535:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFontSizeAccess().getEStringAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleFontSize938); 

                        	newLeafNode(otherlv_1, grammarAccess.getFontSizeAccess().getSmallKeyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:545:6: ( () otherlv_3= 'medium' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:545:6: ( () otherlv_3= 'medium' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:545:7: () otherlv_3= 'medium'
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:545:7: ()
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:546:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFontSizeAccess().getEStringAction_1_0(),
                                current);
                        

                    }

                    otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleFontSize967); 

                        	newLeafNode(otherlv_3, grammarAccess.getFontSizeAccess().getMediumKeyword_1_1());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:556:6: ( () otherlv_5= 'large' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:556:6: ( () otherlv_5= 'large' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:556:7: () otherlv_5= 'large'
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:556:7: ()
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:557:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFontSizeAccess().getEStringAction_2_0(),
                                current);
                        

                    }

                    otherlv_5=(Token)match(input,32,FOLLOW_32_in_ruleFontSize996); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:574:1: entryRuleFormat returns [EObject current=null] : iv_ruleFormat= ruleFormat EOF ;
    public final EObject entryRuleFormat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormat = null;


        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:575:2: (iv_ruleFormat= ruleFormat EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:576:2: iv_ruleFormat= ruleFormat EOF
            {
             newCompositeNode(grammarAccess.getFormatRule()); 
            pushFollow(FOLLOW_ruleFormat_in_entryRuleFormat1033);
            iv_ruleFormat=ruleFormat();

            state._fsp--;

             current =iv_ruleFormat; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormat1043); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:583:1: ruleFormat returns [EObject current=null] : ( ( () otherlv_1= 'DIN A6' ) | ( () otherlv_3= 'DIN A5' ) | ( () otherlv_5= 'DIN A4' ) | ( () otherlv_7= 'DIN A3' ) | ( () otherlv_9= 'DIN A2' ) | ( () otherlv_11= 'DIN A1' ) | ( () otherlv_13= 'DIN A0' ) ) ;
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
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:586:28: ( ( ( () otherlv_1= 'DIN A6' ) | ( () otherlv_3= 'DIN A5' ) | ( () otherlv_5= 'DIN A4' ) | ( () otherlv_7= 'DIN A3' ) | ( () otherlv_9= 'DIN A2' ) | ( () otherlv_11= 'DIN A1' ) | ( () otherlv_13= 'DIN A0' ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:587:1: ( ( () otherlv_1= 'DIN A6' ) | ( () otherlv_3= 'DIN A5' ) | ( () otherlv_5= 'DIN A4' ) | ( () otherlv_7= 'DIN A3' ) | ( () otherlv_9= 'DIN A2' ) | ( () otherlv_11= 'DIN A1' ) | ( () otherlv_13= 'DIN A0' ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:587:1: ( ( () otherlv_1= 'DIN A6' ) | ( () otherlv_3= 'DIN A5' ) | ( () otherlv_5= 'DIN A4' ) | ( () otherlv_7= 'DIN A3' ) | ( () otherlv_9= 'DIN A2' ) | ( () otherlv_11= 'DIN A1' ) | ( () otherlv_13= 'DIN A0' ) )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt8=1;
                }
                break;
            case 34:
                {
                alt8=2;
                }
                break;
            case 35:
                {
                alt8=3;
                }
                break;
            case 36:
                {
                alt8=4;
                }
                break;
            case 37:
                {
                alt8=5;
                }
                break;
            case 38:
                {
                alt8=6;
                }
                break;
            case 39:
                {
                alt8=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:587:2: ( () otherlv_1= 'DIN A6' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:587:2: ( () otherlv_1= 'DIN A6' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:587:3: () otherlv_1= 'DIN A6'
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:587:3: ()
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:588:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFormatAccess().getEStringAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleFormat1090); 

                        	newLeafNode(otherlv_1, grammarAccess.getFormatAccess().getDINA6Keyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:598:6: ( () otherlv_3= 'DIN A5' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:598:6: ( () otherlv_3= 'DIN A5' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:598:7: () otherlv_3= 'DIN A5'
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:598:7: ()
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:599:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFormatAccess().getEStringAction_1_0(),
                                current);
                        

                    }

                    otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleFormat1119); 

                        	newLeafNode(otherlv_3, grammarAccess.getFormatAccess().getDINA5Keyword_1_1());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:609:6: ( () otherlv_5= 'DIN A4' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:609:6: ( () otherlv_5= 'DIN A4' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:609:7: () otherlv_5= 'DIN A4'
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:609:7: ()
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:610:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFormatAccess().getEStringAction_2_0(),
                                current);
                        

                    }

                    otherlv_5=(Token)match(input,35,FOLLOW_35_in_ruleFormat1148); 

                        	newLeafNode(otherlv_5, grammarAccess.getFormatAccess().getDINA4Keyword_2_1());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:620:6: ( () otherlv_7= 'DIN A3' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:620:6: ( () otherlv_7= 'DIN A3' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:620:7: () otherlv_7= 'DIN A3'
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:620:7: ()
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:621:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFormatAccess().getEStringAction_3_0(),
                                current);
                        

                    }

                    otherlv_7=(Token)match(input,36,FOLLOW_36_in_ruleFormat1177); 

                        	newLeafNode(otherlv_7, grammarAccess.getFormatAccess().getDINA3Keyword_3_1());
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:631:6: ( () otherlv_9= 'DIN A2' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:631:6: ( () otherlv_9= 'DIN A2' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:631:7: () otherlv_9= 'DIN A2'
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:631:7: ()
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:632:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFormatAccess().getEStringAction_4_0(),
                                current);
                        

                    }

                    otherlv_9=(Token)match(input,37,FOLLOW_37_in_ruleFormat1206); 

                        	newLeafNode(otherlv_9, grammarAccess.getFormatAccess().getDINA2Keyword_4_1());
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:642:6: ( () otherlv_11= 'DIN A1' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:642:6: ( () otherlv_11= 'DIN A1' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:642:7: () otherlv_11= 'DIN A1'
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:642:7: ()
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:643:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFormatAccess().getEStringAction_5_0(),
                                current);
                        

                    }

                    otherlv_11=(Token)match(input,38,FOLLOW_38_in_ruleFormat1235); 

                        	newLeafNode(otherlv_11, grammarAccess.getFormatAccess().getDINA1Keyword_5_1());
                        

                    }


                    }
                    break;
                case 7 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:653:6: ( () otherlv_13= 'DIN A0' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:653:6: ( () otherlv_13= 'DIN A0' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:653:7: () otherlv_13= 'DIN A0'
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:653:7: ()
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:654:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFormatAccess().getEStringAction_6_0(),
                                current);
                        

                    }

                    otherlv_13=(Token)match(input,39,FOLLOW_39_in_ruleFormat1264); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:671:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:672:2: (iv_ruleDate= ruleDate EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:673:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_ruleDate_in_entryRuleDate1301);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDate1311); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:680:1: ruleDate returns [EObject current=null] : (otherlv_0= '{' ( (lv_day_1_0= RULE_INT ) ) otherlv_2= '-' ( (lv_month_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_year_5_0= RULE_INT ) ) otherlv_6= '}' ) ;
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
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:683:28: ( (otherlv_0= '{' ( (lv_day_1_0= RULE_INT ) ) otherlv_2= '-' ( (lv_month_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_year_5_0= RULE_INT ) ) otherlv_6= '}' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:684:1: (otherlv_0= '{' ( (lv_day_1_0= RULE_INT ) ) otherlv_2= '-' ( (lv_month_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_year_5_0= RULE_INT ) ) otherlv_6= '}' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:684:1: (otherlv_0= '{' ( (lv_day_1_0= RULE_INT ) ) otherlv_2= '-' ( (lv_month_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_year_5_0= RULE_INT ) ) otherlv_6= '}' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:684:3: otherlv_0= '{' ( (lv_day_1_0= RULE_INT ) ) otherlv_2= '-' ( (lv_month_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_year_5_0= RULE_INT ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleDate1348); 

                	newLeafNode(otherlv_0, grammarAccess.getDateAccess().getLeftCurlyBracketKeyword_0());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:688:1: ( (lv_day_1_0= RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:689:1: (lv_day_1_0= RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:689:1: (lv_day_1_0= RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:690:3: lv_day_1_0= RULE_INT
            {
            lv_day_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDate1365); 

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

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleDate1382); 

                	newLeafNode(otherlv_2, grammarAccess.getDateAccess().getHyphenMinusKeyword_2());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:710:1: ( (lv_month_3_0= RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:711:1: (lv_month_3_0= RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:711:1: (lv_month_3_0= RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:712:3: lv_month_3_0= RULE_INT
            {
            lv_month_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDate1399); 

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

            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleDate1416); 

                	newLeafNode(otherlv_4, grammarAccess.getDateAccess().getHyphenMinusKeyword_4());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:732:1: ( (lv_year_5_0= RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:733:1: (lv_year_5_0= RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:733:1: (lv_year_5_0= RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:734:3: lv_year_5_0= RULE_INT
            {
            lv_year_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDate1433); 

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

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleDate1450); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:762:1: entryRuleLanguage returns [EObject current=null] : iv_ruleLanguage= ruleLanguage EOF ;
    public final EObject entryRuleLanguage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguage = null;


        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:763:2: (iv_ruleLanguage= ruleLanguage EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:764:2: iv_ruleLanguage= ruleLanguage EOF
            {
             newCompositeNode(grammarAccess.getLanguageRule()); 
            pushFollow(FOLLOW_ruleLanguage_in_entryRuleLanguage1486);
            iv_ruleLanguage=ruleLanguage();

            state._fsp--;

             current =iv_ruleLanguage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLanguage1496); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:771:1: ruleLanguage returns [EObject current=null] : ( ( () otherlv_1= 'English' ) | ( () otherlv_3= 'German' ) ) ;
    public final EObject ruleLanguage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:774:28: ( ( ( () otherlv_1= 'English' ) | ( () otherlv_3= 'German' ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:775:1: ( ( () otherlv_1= 'English' ) | ( () otherlv_3= 'German' ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:775:1: ( ( () otherlv_1= 'English' ) | ( () otherlv_3= 'German' ) )
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
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:775:2: ( () otherlv_1= 'English' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:775:2: ( () otherlv_1= 'English' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:775:3: () otherlv_1= 'English'
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:775:3: ()
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:776:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLanguageAccess().getEStringAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleLanguage1543); 

                        	newLeafNode(otherlv_1, grammarAccess.getLanguageAccess().getEnglishKeyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:786:6: ( () otherlv_3= 'German' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:786:6: ( () otherlv_3= 'German' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:786:7: () otherlv_3= 'German'
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:786:7: ()
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:787:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLanguageAccess().getEStringAction_1_0(),
                                current);
                        

                    }

                    otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleLanguage1572); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:804:1: entryRulePrice returns [EObject current=null] : iv_rulePrice= rulePrice EOF ;
    public final EObject entryRulePrice() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrice = null;


        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:805:2: (iv_rulePrice= rulePrice EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:806:2: iv_rulePrice= rulePrice EOF
            {
             newCompositeNode(grammarAccess.getPriceRule()); 
            pushFollow(FOLLOW_rulePrice_in_entryRulePrice1609);
            iv_rulePrice=rulePrice();

            state._fsp--;

             current =iv_rulePrice; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrice1619); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:813:1: rulePrice returns [EObject current=null] : (otherlv_0= '{' ( (lv_value_1_0= ruleFloat ) ) ( (lv_currency_2_0= ruleCurrency ) ) otherlv_3= '}' ) ;
    public final EObject rulePrice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;

        EObject lv_currency_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:816:28: ( (otherlv_0= '{' ( (lv_value_1_0= ruleFloat ) ) ( (lv_currency_2_0= ruleCurrency ) ) otherlv_3= '}' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:817:1: (otherlv_0= '{' ( (lv_value_1_0= ruleFloat ) ) ( (lv_currency_2_0= ruleCurrency ) ) otherlv_3= '}' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:817:1: (otherlv_0= '{' ( (lv_value_1_0= ruleFloat ) ) ( (lv_currency_2_0= ruleCurrency ) ) otherlv_3= '}' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:817:3: otherlv_0= '{' ( (lv_value_1_0= ruleFloat ) ) ( (lv_currency_2_0= ruleCurrency ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_rulePrice1656); 

                	newLeafNode(otherlv_0, grammarAccess.getPriceAccess().getLeftCurlyBracketKeyword_0());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:821:1: ( (lv_value_1_0= ruleFloat ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:822:1: (lv_value_1_0= ruleFloat )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:822:1: (lv_value_1_0= ruleFloat )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:823:3: lv_value_1_0= ruleFloat
            {
             
            	        newCompositeNode(grammarAccess.getPriceAccess().getValueFloatParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFloat_in_rulePrice1677);
            lv_value_1_0=ruleFloat();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPriceRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"Float");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:839:2: ( (lv_currency_2_0= ruleCurrency ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:840:1: (lv_currency_2_0= ruleCurrency )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:840:1: (lv_currency_2_0= ruleCurrency )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:841:3: lv_currency_2_0= ruleCurrency
            {
             
            	        newCompositeNode(grammarAccess.getPriceAccess().getCurrencyCurrencyParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleCurrency_in_rulePrice1698);
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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_rulePrice1710); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:869:1: entryRuleCurrency returns [EObject current=null] : iv_ruleCurrency= ruleCurrency EOF ;
    public final EObject entryRuleCurrency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCurrency = null;


        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:870:2: (iv_ruleCurrency= ruleCurrency EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:871:2: iv_ruleCurrency= ruleCurrency EOF
            {
             newCompositeNode(grammarAccess.getCurrencyRule()); 
            pushFollow(FOLLOW_ruleCurrency_in_entryRuleCurrency1746);
            iv_ruleCurrency=ruleCurrency();

            state._fsp--;

             current =iv_ruleCurrency; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCurrency1756); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:878:1: ruleCurrency returns [EObject current=null] : ( ( () otherlv_1= 'Euro [\\u20AC]' ) | ( () otherlv_3= 'Dollar [$]' ) ) ;
    public final EObject ruleCurrency() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:881:28: ( ( ( () otherlv_1= 'Euro [\\u20AC]' ) | ( () otherlv_3= 'Dollar [$]' ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:882:1: ( ( () otherlv_1= 'Euro [\\u20AC]' ) | ( () otherlv_3= 'Dollar [$]' ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:882:1: ( ( () otherlv_1= 'Euro [\\u20AC]' ) | ( () otherlv_3= 'Dollar [$]' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==42) ) {
                alt10=1;
            }
            else if ( (LA10_0==43) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:882:2: ( () otherlv_1= 'Euro [\\u20AC]' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:882:2: ( () otherlv_1= 'Euro [\\u20AC]' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:882:3: () otherlv_1= 'Euro [\\u20AC]'
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:882:3: ()
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:883:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getCurrencyAccess().getEStringAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleCurrency1803); 

                        	newLeafNode(otherlv_1, grammarAccess.getCurrencyAccess().getEuroKeyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:893:6: ( () otherlv_3= 'Dollar [$]' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:893:6: ( () otherlv_3= 'Dollar [$]' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:893:7: () otherlv_3= 'Dollar [$]'
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:893:7: ()
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:894:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getCurrencyAccess().getEStringAction_1_0(),
                                current);
                        

                    }

                    otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleCurrency1832); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:911:1: entryRuleTopic returns [EObject current=null] : iv_ruleTopic= ruleTopic EOF ;
    public final EObject entryRuleTopic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopic = null;


        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:912:2: (iv_ruleTopic= ruleTopic EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:913:2: iv_ruleTopic= ruleTopic EOF
            {
             newCompositeNode(grammarAccess.getTopicRule()); 
            pushFollow(FOLLOW_ruleTopic_in_entryRuleTopic1869);
            iv_ruleTopic=ruleTopic();

            state._fsp--;

             current =iv_ruleTopic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTopic1879); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:920:1: ruleTopic returns [EObject current=null] : (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tags_3_0= ruleTopicTag ) ) (otherlv_4= ', ' ( (lv_tags_5_0= ruleTopicTag ) ) )* otherlv_6= '}' ) ;
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
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:923:28: ( (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tags_3_0= ruleTopicTag ) ) (otherlv_4= ', ' ( (lv_tags_5_0= ruleTopicTag ) ) )* otherlv_6= '}' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:924:1: (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tags_3_0= ruleTopicTag ) ) (otherlv_4= ', ' ( (lv_tags_5_0= ruleTopicTag ) ) )* otherlv_6= '}' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:924:1: (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tags_3_0= ruleTopicTag ) ) (otherlv_4= ', ' ( (lv_tags_5_0= ruleTopicTag ) ) )* otherlv_6= '}' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:924:3: otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tags_3_0= ruleTopicTag ) ) (otherlv_4= ', ' ( (lv_tags_5_0= ruleTopicTag ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleTopic1916); 

                	newLeafNode(otherlv_0, grammarAccess.getTopicAccess().getTopicKeyword_0());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:928:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:929:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:929:1: (lv_name_1_0= RULE_ID )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:930:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTopic1933); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleTopic1950); 

                	newLeafNode(otherlv_2, grammarAccess.getTopicAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:950:1: ( (lv_tags_3_0= ruleTopicTag ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:951:1: (lv_tags_3_0= ruleTopicTag )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:951:1: (lv_tags_3_0= ruleTopicTag )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:952:3: lv_tags_3_0= ruleTopicTag
            {
             
            	        newCompositeNode(grammarAccess.getTopicAccess().getTagsTopicTagParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTopicTag_in_ruleTopic1971);
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

            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:968:2: (otherlv_4= ', ' ( (lv_tags_5_0= ruleTopicTag ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:968:4: otherlv_4= ', ' ( (lv_tags_5_0= ruleTopicTag ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleTopic1984); 

            	        	newLeafNode(otherlv_4, grammarAccess.getTopicAccess().getCommaSpaceKeyword_4_0());
            	        
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:972:1: ( (lv_tags_5_0= ruleTopicTag ) )
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:973:1: (lv_tags_5_0= ruleTopicTag )
            	    {
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:973:1: (lv_tags_5_0= ruleTopicTag )
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:974:3: lv_tags_5_0= ruleTopicTag
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTopicAccess().getTagsTopicTagParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTopicTag_in_ruleTopic2005);
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
            	    break loop11;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleTopic2019); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1002:1: entryRuleTopicTag returns [EObject current=null] : iv_ruleTopicTag= ruleTopicTag EOF ;
    public final EObject entryRuleTopicTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopicTag = null;


        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1003:2: (iv_ruleTopicTag= ruleTopicTag EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1004:2: iv_ruleTopicTag= ruleTopicTag EOF
            {
             newCompositeNode(grammarAccess.getTopicTagRule()); 
            pushFollow(FOLLOW_ruleTopicTag_in_entryRuleTopicTag2055);
            iv_ruleTopicTag=ruleTopicTag();

            state._fsp--;

             current =iv_ruleTopicTag; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTopicTag2065); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1011:1: ruleTopicTag returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleTopicTag() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1014:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1015:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1015:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1016:1: (lv_value_0_0= RULE_STRING )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1016:1: (lv_value_0_0= RULE_STRING )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1017:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTopicTag2106); 

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


    // $ANTLR start "entryRulePair"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1041:1: entryRulePair returns [EObject current=null] : iv_rulePair= rulePair EOF ;
    public final EObject entryRulePair() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePair = null;


        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1042:2: (iv_rulePair= rulePair EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1043:2: iv_rulePair= rulePair EOF
            {
             newCompositeNode(grammarAccess.getPairRule()); 
            pushFollow(FOLLOW_rulePair_in_entryRulePair2146);
            iv_rulePair=rulePair();

            state._fsp--;

             current =iv_rulePair; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePair2156); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1050:1: rulePair returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_URL ) ) ) ;
    public final EObject rulePair() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1053:28: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_URL ) ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1054:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_URL ) ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1054:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_URL ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1054:2: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_URL ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1054:2: ( (lv_key_0_0= RULE_ID ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1055:1: (lv_key_0_0= RULE_ID )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1055:1: (lv_key_0_0= RULE_ID )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1056:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePair2198); 

            			newLeafNode(lv_key_0_0, grammarAccess.getPairAccess().getKeyIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPairRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"key",
                    		lv_key_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_rulePair2215); 

                	newLeafNode(otherlv_1, grammarAccess.getPairAccess().getColonKeyword_1());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1076:1: ( (lv_value_2_0= RULE_URL ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1077:1: (lv_value_2_0= RULE_URL )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1077:1: (lv_value_2_0= RULE_URL )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1078:3: lv_value_2_0= RULE_URL
            {
            lv_value_2_0=(Token)match(input,RULE_URL,FOLLOW_RULE_URL_in_rulePair2232); 

            			newLeafNode(lv_value_2_0, grammarAccess.getPairAccess().getValueURLTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPairRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"URL");
            	    

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
    // $ANTLR end "rulePair"


    // $ANTLR start "entryRuleFloat"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1102:1: entryRuleFloat returns [String current=null] : iv_ruleFloat= ruleFloat EOF ;
    public final String entryRuleFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloat = null;


        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1103:2: (iv_ruleFloat= ruleFloat EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1104:2: iv_ruleFloat= ruleFloat EOF
            {
             newCompositeNode(grammarAccess.getFloatRule()); 
            pushFollow(FOLLOW_ruleFloat_in_entryRuleFloat2274);
            iv_ruleFloat=ruleFloat();

            state._fsp--;

             current =iv_ruleFloat.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloat2285); 

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
    // $ANTLR end "entryRuleFloat"


    // $ANTLR start "ruleFloat"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1111:1: ruleFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT ( (kw= '.' | kw= ',' ) this_INT_3= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_3=null;

         enterRule(); 
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1114:28: ( (this_INT_0= RULE_INT ( (kw= '.' | kw= ',' ) this_INT_3= RULE_INT )? ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1115:1: (this_INT_0= RULE_INT ( (kw= '.' | kw= ',' ) this_INT_3= RULE_INT )? )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1115:1: (this_INT_0= RULE_INT ( (kw= '.' | kw= ',' ) this_INT_3= RULE_INT )? )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1115:6: this_INT_0= RULE_INT ( (kw= '.' | kw= ',' ) this_INT_3= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFloat2325); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getFloatAccess().getINTTerminalRuleCall_0()); 
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1122:1: ( (kw= '.' | kw= ',' ) this_INT_3= RULE_INT )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=46 && LA13_0<=47)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1122:2: (kw= '.' | kw= ',' ) this_INT_3= RULE_INT
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1122:2: (kw= '.' | kw= ',' )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==46) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==47) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1123:2: kw= '.'
                            {
                            kw=(Token)match(input,46,FOLLOW_46_in_ruleFloat2345); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getFloatAccess().getFullStopKeyword_1_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1130:2: kw= ','
                            {
                            kw=(Token)match(input,47,FOLLOW_47_in_ruleFloat2364); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getFloatAccess().getCommaKeyword_1_0_1()); 
                                

                            }
                            break;

                    }

                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFloat2380); 

                    		current.merge(this_INT_3);
                        
                     
                        newLeafNode(this_INT_3, grammarAccess.getFloatAccess().getINTTerminalRuleCall_1_1()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleFloat"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleDeclaration122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeclaration139 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDeclaration156 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDeclaration168 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDeclaration180 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePair_in_ruleDeclaration201 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleDeclaration214 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePair_in_ruleDeclaration235 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleDeclaration249 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDeclaration261 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDeclaration273 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ruleTopic_in_ruleDeclaration294 = new BitSet(new long[]{0x0000100000010000L});
    public static final BitSet FOLLOW_ruleTopic_in_ruleDeclaration315 = new BitSet(new long[]{0x0000100000010000L});
    public static final BitSet FOLLOW_16_in_ruleDeclaration328 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_18_in_ruleDeclaration341 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleDate_in_ruleDeclaration362 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleDeclaration377 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDeclaration394 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDeclaration413 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rulePrice_in_ruleDeclaration434 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleDeclaration447 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDeclaration464 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDeclaration483 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_ruleLanguage_in_ruleDeclaration504 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleDeclaration516 = new BitSet(new long[]{0x000000FE00000000L});
    public static final BitSet FOLLOW_ruleFormat_in_ruleDeclaration537 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDeclaration549 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDeclaration566 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDeclaration583 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDeclaration600 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleDeclaration617 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDeclaration634 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_27_in_ruleDeclaration652 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleImagesCount_in_ruleDeclaration673 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleDeclaration687 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDeclaration704 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleDeclaration721 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_ruleFontSize_in_ruleDeclaration742 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDeclaration754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImagesCount_in_entryRuleImagesCount790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImagesCount800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleImagesCount841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFontSize_in_entryRuleFontSize881 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFontSize891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleFontSize938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleFontSize967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleFontSize996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormat_in_entryRuleFormat1033 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormat1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleFormat1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleFormat1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleFormat1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleFormat1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleFormat1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleFormat1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleFormat1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_in_entryRuleDate1301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDate1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleDate1348 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDate1365 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleDate1382 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDate1399 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleDate1416 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDate1433 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDate1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLanguage_in_entryRuleLanguage1486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLanguage1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleLanguage1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleLanguage1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrice_in_entryRulePrice1609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrice1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rulePrice1656 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleFloat_in_rulePrice1677 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_ruleCurrency_in_rulePrice1698 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePrice1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCurrency_in_entryRuleCurrency1746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCurrency1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleCurrency1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleCurrency1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopic_in_entryRuleTopic1869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopic1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleTopic1916 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTopic1933 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleTopic1950 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleTopicTag_in_ruleTopic1971 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleTopic1984 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleTopicTag_in_ruleTopic2005 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleTopic2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopicTag_in_entryRuleTopicTag2055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopicTag2065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTopicTag2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePair_in_entryRulePair2146 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePair2156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePair2198 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_rulePair2215 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_URL_in_rulePair2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloat_in_entryRuleFloat2274 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloat2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFloat2325 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_46_in_ruleFloat2345 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_47_in_ruleFloat2364 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFloat2380 = new BitSet(new long[]{0x0000000000000002L});

}