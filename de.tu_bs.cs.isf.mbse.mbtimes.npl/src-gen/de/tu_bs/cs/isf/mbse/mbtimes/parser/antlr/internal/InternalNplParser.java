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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'newspaper'", "'{'", "'feed links'", "', '", "'}'", "'topics'", "'date'", "'location'", "'price'", "'volume'", "'language'", "'format'", "'number of articles per topic'", "'number of words per article'", "'-'", "'number of images per article'", "'number of columns'", "'font size'", "'small'", "'medium'", "'large'", "'DIN A6'", "'DIN A5'", "'DIN A4'", "'DIN A3'", "'DIN A2'", "'DIN A1'", "'DIN A0'", "'English'", "'German'", "'.'", "','", "'Euro [\\u20AC]'", "'Dollar [$]'", "'topic'", "':'"
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
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:76:1: ruleDeclaration returns [EObject current=null] : (otherlv_0= 'newspaper' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'feed links' otherlv_4= '{' ( (lv_feedlinks_5_0= rulePair ) ) (otherlv_6= ', ' ( (lv_pairs_7_0= rulePair ) ) )* otherlv_8= '}' otherlv_9= 'topics' otherlv_10= '{' ( (lv_topics_11_0= ruleTopic ) ) ( (lv_topics_12_0= ruleTopic ) )* otherlv_13= '}' (otherlv_14= 'date' ( (lv_date_15_0= ruleDate ) ) )? (otherlv_16= 'location' ( (lv_location_17_0= RULE_STRING ) ) )? otherlv_18= 'price' ( (lv_price_19_0= rulePrice ) ) (otherlv_20= 'volume' ( (lv_volume_21_0= RULE_INT ) ) )? otherlv_22= 'language' ( (lv_language_23_0= ruleLanguage ) ) otherlv_24= 'format' ( (lv_format_25_0= ruleFormat ) ) otherlv_26= 'number of articles per topic' ( (lv_articleCnt_27_0= RULE_INT ) ) otherlv_28= 'number of words per article' ( (lv_articleCharMin_29_0= RULE_INT ) ) otherlv_30= '-' ( (lv_articleCharMax_31_0= RULE_INT ) ) (otherlv_32= 'number of images per article' ( (lv_imagesCnt_33_0= RULE_INT ) ) )? otherlv_34= 'number of columns' ( (lv_columnsCnt_35_0= RULE_INT ) ) otherlv_36= 'font size' ( (lv_fontSize_37_0= ruleFontSize ) ) otherlv_38= '}' ) ;
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
        Token lv_articleCharMin_29_0=null;
        Token otherlv_30=null;
        Token lv_articleCharMax_31_0=null;
        Token otherlv_32=null;
        Token lv_imagesCnt_33_0=null;
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

        EObject lv_fontSize_37_0 = null;


         enterRule(); 
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:79:28: ( (otherlv_0= 'newspaper' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'feed links' otherlv_4= '{' ( (lv_feedlinks_5_0= rulePair ) ) (otherlv_6= ', ' ( (lv_pairs_7_0= rulePair ) ) )* otherlv_8= '}' otherlv_9= 'topics' otherlv_10= '{' ( (lv_topics_11_0= ruleTopic ) ) ( (lv_topics_12_0= ruleTopic ) )* otherlv_13= '}' (otherlv_14= 'date' ( (lv_date_15_0= ruleDate ) ) )? (otherlv_16= 'location' ( (lv_location_17_0= RULE_STRING ) ) )? otherlv_18= 'price' ( (lv_price_19_0= rulePrice ) ) (otherlv_20= 'volume' ( (lv_volume_21_0= RULE_INT ) ) )? otherlv_22= 'language' ( (lv_language_23_0= ruleLanguage ) ) otherlv_24= 'format' ( (lv_format_25_0= ruleFormat ) ) otherlv_26= 'number of articles per topic' ( (lv_articleCnt_27_0= RULE_INT ) ) otherlv_28= 'number of words per article' ( (lv_articleCharMin_29_0= RULE_INT ) ) otherlv_30= '-' ( (lv_articleCharMax_31_0= RULE_INT ) ) (otherlv_32= 'number of images per article' ( (lv_imagesCnt_33_0= RULE_INT ) ) )? otherlv_34= 'number of columns' ( (lv_columnsCnt_35_0= RULE_INT ) ) otherlv_36= 'font size' ( (lv_fontSize_37_0= ruleFontSize ) ) otherlv_38= '}' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:80:1: (otherlv_0= 'newspaper' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'feed links' otherlv_4= '{' ( (lv_feedlinks_5_0= rulePair ) ) (otherlv_6= ', ' ( (lv_pairs_7_0= rulePair ) ) )* otherlv_8= '}' otherlv_9= 'topics' otherlv_10= '{' ( (lv_topics_11_0= ruleTopic ) ) ( (lv_topics_12_0= ruleTopic ) )* otherlv_13= '}' (otherlv_14= 'date' ( (lv_date_15_0= ruleDate ) ) )? (otherlv_16= 'location' ( (lv_location_17_0= RULE_STRING ) ) )? otherlv_18= 'price' ( (lv_price_19_0= rulePrice ) ) (otherlv_20= 'volume' ( (lv_volume_21_0= RULE_INT ) ) )? otherlv_22= 'language' ( (lv_language_23_0= ruleLanguage ) ) otherlv_24= 'format' ( (lv_format_25_0= ruleFormat ) ) otherlv_26= 'number of articles per topic' ( (lv_articleCnt_27_0= RULE_INT ) ) otherlv_28= 'number of words per article' ( (lv_articleCharMin_29_0= RULE_INT ) ) otherlv_30= '-' ( (lv_articleCharMax_31_0= RULE_INT ) ) (otherlv_32= 'number of images per article' ( (lv_imagesCnt_33_0= RULE_INT ) ) )? otherlv_34= 'number of columns' ( (lv_columnsCnt_35_0= RULE_INT ) ) otherlv_36= 'font size' ( (lv_fontSize_37_0= ruleFontSize ) ) otherlv_38= '}' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:80:1: (otherlv_0= 'newspaper' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'feed links' otherlv_4= '{' ( (lv_feedlinks_5_0= rulePair ) ) (otherlv_6= ', ' ( (lv_pairs_7_0= rulePair ) ) )* otherlv_8= '}' otherlv_9= 'topics' otherlv_10= '{' ( (lv_topics_11_0= ruleTopic ) ) ( (lv_topics_12_0= ruleTopic ) )* otherlv_13= '}' (otherlv_14= 'date' ( (lv_date_15_0= ruleDate ) ) )? (otherlv_16= 'location' ( (lv_location_17_0= RULE_STRING ) ) )? otherlv_18= 'price' ( (lv_price_19_0= rulePrice ) ) (otherlv_20= 'volume' ( (lv_volume_21_0= RULE_INT ) ) )? otherlv_22= 'language' ( (lv_language_23_0= ruleLanguage ) ) otherlv_24= 'format' ( (lv_format_25_0= ruleFormat ) ) otherlv_26= 'number of articles per topic' ( (lv_articleCnt_27_0= RULE_INT ) ) otherlv_28= 'number of words per article' ( (lv_articleCharMin_29_0= RULE_INT ) ) otherlv_30= '-' ( (lv_articleCharMax_31_0= RULE_INT ) ) (otherlv_32= 'number of images per article' ( (lv_imagesCnt_33_0= RULE_INT ) ) )? otherlv_34= 'number of columns' ( (lv_columnsCnt_35_0= RULE_INT ) ) otherlv_36= 'font size' ( (lv_fontSize_37_0= ruleFontSize ) ) otherlv_38= '}' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:80:3: otherlv_0= 'newspaper' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'feed links' otherlv_4= '{' ( (lv_feedlinks_5_0= rulePair ) ) (otherlv_6= ', ' ( (lv_pairs_7_0= rulePair ) ) )* otherlv_8= '}' otherlv_9= 'topics' otherlv_10= '{' ( (lv_topics_11_0= ruleTopic ) ) ( (lv_topics_12_0= ruleTopic ) )* otherlv_13= '}' (otherlv_14= 'date' ( (lv_date_15_0= ruleDate ) ) )? (otherlv_16= 'location' ( (lv_location_17_0= RULE_STRING ) ) )? otherlv_18= 'price' ( (lv_price_19_0= rulePrice ) ) (otherlv_20= 'volume' ( (lv_volume_21_0= RULE_INT ) ) )? otherlv_22= 'language' ( (lv_language_23_0= ruleLanguage ) ) otherlv_24= 'format' ( (lv_format_25_0= ruleFormat ) ) otherlv_26= 'number of articles per topic' ( (lv_articleCnt_27_0= RULE_INT ) ) otherlv_28= 'number of words per article' ( (lv_articleCharMin_29_0= RULE_INT ) ) otherlv_30= '-' ( (lv_articleCharMax_31_0= RULE_INT ) ) (otherlv_32= 'number of images per article' ( (lv_imagesCnt_33_0= RULE_INT ) ) )? otherlv_34= 'number of columns' ( (lv_columnsCnt_35_0= RULE_INT ) ) otherlv_36= 'font size' ( (lv_fontSize_37_0= ruleFontSize ) ) otherlv_38= '}'
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

                	newLeafNode(otherlv_2, grammarAccess.getDeclarationAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleDeclaration168); 

                	newLeafNode(otherlv_3, grammarAccess.getDeclarationAccess().getFeedLinksKeyword_3());
                
            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleDeclaration180); 

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

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:132:4: otherlv_6= ', ' ( (lv_pairs_7_0= rulePair ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleDeclaration214); 

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

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleDeclaration249); 

                	newLeafNode(otherlv_8, grammarAccess.getDeclarationAccess().getRightCurlyBracketKeyword_7());
                
            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleDeclaration261); 

                	newLeafNode(otherlv_9, grammarAccess.getDeclarationAccess().getTopicsKeyword_8());
                
            otherlv_10=(Token)match(input,12,FOLLOW_12_in_ruleDeclaration273); 

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

                if ( (LA2_0==45) ) {
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

            otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleDeclaration328); 

                	newLeafNode(otherlv_13, grammarAccess.getDeclarationAccess().getRightCurlyBracketKeyword_12());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:206:1: (otherlv_14= 'date' ( (lv_date_15_0= ruleDate ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:206:3: otherlv_14= 'date' ( (lv_date_15_0= ruleDate ) )
                    {
                    otherlv_14=(Token)match(input,17,FOLLOW_17_in_ruleDeclaration341); 

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

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:228:6: otherlv_16= 'location' ( (lv_location_17_0= RULE_STRING ) )
                    {
                    otherlv_16=(Token)match(input,18,FOLLOW_18_in_ruleDeclaration377); 

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

            otherlv_18=(Token)match(input,19,FOLLOW_19_in_ruleDeclaration413); 

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

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:272:4: otherlv_20= 'volume' ( (lv_volume_21_0= RULE_INT ) )
                    {
                    otherlv_20=(Token)match(input,20,FOLLOW_20_in_ruleDeclaration447); 

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

            otherlv_22=(Token)match(input,21,FOLLOW_21_in_ruleDeclaration483); 

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

            otherlv_24=(Token)match(input,22,FOLLOW_22_in_ruleDeclaration516); 

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

            otherlv_26=(Token)match(input,23,FOLLOW_23_in_ruleDeclaration549); 

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

            otherlv_28=(Token)match(input,24,FOLLOW_24_in_ruleDeclaration583); 

                	newLeafNode(otherlv_28, grammarAccess.getDeclarationAccess().getNumberOfWordsPerArticleKeyword_24());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:364:1: ( (lv_articleCharMin_29_0= RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:365:1: (lv_articleCharMin_29_0= RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:365:1: (lv_articleCharMin_29_0= RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:366:3: lv_articleCharMin_29_0= RULE_INT
            {
            lv_articleCharMin_29_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDeclaration600); 

            			newLeafNode(lv_articleCharMin_29_0, grammarAccess.getDeclarationAccess().getArticleCharMinINTTerminalRuleCall_25_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"articleCharMin",
                    		lv_articleCharMin_29_0, 
                    		"INT");
            	    

            }


            }

            otherlv_30=(Token)match(input,25,FOLLOW_25_in_ruleDeclaration617); 

                	newLeafNode(otherlv_30, grammarAccess.getDeclarationAccess().getHyphenMinusKeyword_26());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:386:1: ( (lv_articleCharMax_31_0= RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:387:1: (lv_articleCharMax_31_0= RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:387:1: (lv_articleCharMax_31_0= RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:388:3: lv_articleCharMax_31_0= RULE_INT
            {
            lv_articleCharMax_31_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDeclaration634); 

            			newLeafNode(lv_articleCharMax_31_0, grammarAccess.getDeclarationAccess().getArticleCharMaxINTTerminalRuleCall_27_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"articleCharMax",
                    		lv_articleCharMax_31_0, 
                    		"INT");
            	    

            }


            }

            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:404:2: (otherlv_32= 'number of images per article' ( (lv_imagesCnt_33_0= RULE_INT ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:404:4: otherlv_32= 'number of images per article' ( (lv_imagesCnt_33_0= RULE_INT ) )
                    {
                    otherlv_32=(Token)match(input,26,FOLLOW_26_in_ruleDeclaration652); 

                        	newLeafNode(otherlv_32, grammarAccess.getDeclarationAccess().getNumberOfImagesPerArticleKeyword_28_0());
                        
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:408:1: ( (lv_imagesCnt_33_0= RULE_INT ) )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:409:1: (lv_imagesCnt_33_0= RULE_INT )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:409:1: (lv_imagesCnt_33_0= RULE_INT )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:410:3: lv_imagesCnt_33_0= RULE_INT
                    {
                    lv_imagesCnt_33_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDeclaration669); 

                    			newLeafNode(lv_imagesCnt_33_0, grammarAccess.getDeclarationAccess().getImagesCntINTTerminalRuleCall_28_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDeclarationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"imagesCnt",
                            		lv_imagesCnt_33_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_34=(Token)match(input,27,FOLLOW_27_in_ruleDeclaration688); 

                	newLeafNode(otherlv_34, grammarAccess.getDeclarationAccess().getNumberOfColumnsKeyword_29());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:430:1: ( (lv_columnsCnt_35_0= RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:431:1: (lv_columnsCnt_35_0= RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:431:1: (lv_columnsCnt_35_0= RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:432:3: lv_columnsCnt_35_0= RULE_INT
            {
            lv_columnsCnt_35_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDeclaration705); 

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

            otherlv_36=(Token)match(input,28,FOLLOW_28_in_ruleDeclaration722); 

                	newLeafNode(otherlv_36, grammarAccess.getDeclarationAccess().getFontSizeKeyword_31());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:452:1: ( (lv_fontSize_37_0= ruleFontSize ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:453:1: (lv_fontSize_37_0= ruleFontSize )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:453:1: (lv_fontSize_37_0= ruleFontSize )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:454:3: lv_fontSize_37_0= ruleFontSize
            {
             
            	        newCompositeNode(grammarAccess.getDeclarationAccess().getFontSizeFontSizeParserRuleCall_32_0()); 
            	    
            pushFollow(FOLLOW_ruleFontSize_in_ruleDeclaration743);
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

            otherlv_38=(Token)match(input,15,FOLLOW_15_in_ruleDeclaration755); 

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


    // $ANTLR start "entryRuleFontSize"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:482:1: entryRuleFontSize returns [EObject current=null] : iv_ruleFontSize= ruleFontSize EOF ;
    public final EObject entryRuleFontSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFontSize = null;


        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:483:2: (iv_ruleFontSize= ruleFontSize EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:484:2: iv_ruleFontSize= ruleFontSize EOF
            {
             newCompositeNode(grammarAccess.getFontSizeRule()); 
            pushFollow(FOLLOW_ruleFontSize_in_entryRuleFontSize791);
            iv_ruleFontSize=ruleFontSize();

            state._fsp--;

             current =iv_ruleFontSize; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFontSize801); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:491:1: ruleFontSize returns [EObject current=null] : ( ( () otherlv_1= 'small' ) | ( () otherlv_3= 'medium' ) | ( () otherlv_5= 'large' ) ) ;
    public final EObject ruleFontSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:494:28: ( ( ( () otherlv_1= 'small' ) | ( () otherlv_3= 'medium' ) | ( () otherlv_5= 'large' ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:495:1: ( ( () otherlv_1= 'small' ) | ( () otherlv_3= 'medium' ) | ( () otherlv_5= 'large' ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:495:1: ( ( () otherlv_1= 'small' ) | ( () otherlv_3= 'medium' ) | ( () otherlv_5= 'large' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt7=1;
                }
                break;
            case 30:
                {
                alt7=2;
                }
                break;
            case 31:
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
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:495:2: ( () otherlv_1= 'small' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:495:2: ( () otherlv_1= 'small' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:495:3: () otherlv_1= 'small'
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:495:3: ()
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:496:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFontSizeAccess().getEStringAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleFontSize848); 

                        	newLeafNode(otherlv_1, grammarAccess.getFontSizeAccess().getSmallKeyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:506:6: ( () otherlv_3= 'medium' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:506:6: ( () otherlv_3= 'medium' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:506:7: () otherlv_3= 'medium'
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:506:7: ()
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:507:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFontSizeAccess().getEStringAction_1_0(),
                                current);
                        

                    }

                    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleFontSize877); 

                        	newLeafNode(otherlv_3, grammarAccess.getFontSizeAccess().getMediumKeyword_1_1());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:517:6: ( () otherlv_5= 'large' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:517:6: ( () otherlv_5= 'large' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:517:7: () otherlv_5= 'large'
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:517:7: ()
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:518:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFontSizeAccess().getEStringAction_2_0(),
                                current);
                        

                    }

                    otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleFontSize906); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:535:1: entryRuleFormat returns [EObject current=null] : iv_ruleFormat= ruleFormat EOF ;
    public final EObject entryRuleFormat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormat = null;


        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:536:2: (iv_ruleFormat= ruleFormat EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:537:2: iv_ruleFormat= ruleFormat EOF
            {
             newCompositeNode(grammarAccess.getFormatRule()); 
            pushFollow(FOLLOW_ruleFormat_in_entryRuleFormat943);
            iv_ruleFormat=ruleFormat();

            state._fsp--;

             current =iv_ruleFormat; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormat953); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:544:1: ruleFormat returns [EObject current=null] : ( ( () otherlv_1= 'DIN A6' ) | ( () otherlv_3= 'DIN A5' ) | ( () otherlv_5= 'DIN A4' ) | ( () otherlv_7= 'DIN A3' ) | ( () otherlv_9= 'DIN A2' ) | ( () otherlv_11= 'DIN A1' ) | ( () otherlv_13= 'DIN A0' ) ) ;
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
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:547:28: ( ( ( () otherlv_1= 'DIN A6' ) | ( () otherlv_3= 'DIN A5' ) | ( () otherlv_5= 'DIN A4' ) | ( () otherlv_7= 'DIN A3' ) | ( () otherlv_9= 'DIN A2' ) | ( () otherlv_11= 'DIN A1' ) | ( () otherlv_13= 'DIN A0' ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:548:1: ( ( () otherlv_1= 'DIN A6' ) | ( () otherlv_3= 'DIN A5' ) | ( () otherlv_5= 'DIN A4' ) | ( () otherlv_7= 'DIN A3' ) | ( () otherlv_9= 'DIN A2' ) | ( () otherlv_11= 'DIN A1' ) | ( () otherlv_13= 'DIN A0' ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:548:1: ( ( () otherlv_1= 'DIN A6' ) | ( () otherlv_3= 'DIN A5' ) | ( () otherlv_5= 'DIN A4' ) | ( () otherlv_7= 'DIN A3' ) | ( () otherlv_9= 'DIN A2' ) | ( () otherlv_11= 'DIN A1' ) | ( () otherlv_13= 'DIN A0' ) )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt8=1;
                }
                break;
            case 33:
                {
                alt8=2;
                }
                break;
            case 34:
                {
                alt8=3;
                }
                break;
            case 35:
                {
                alt8=4;
                }
                break;
            case 36:
                {
                alt8=5;
                }
                break;
            case 37:
                {
                alt8=6;
                }
                break;
            case 38:
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
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:548:2: ( () otherlv_1= 'DIN A6' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:548:2: ( () otherlv_1= 'DIN A6' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:548:3: () otherlv_1= 'DIN A6'
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:548:3: ()
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:549:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFormatAccess().getEStringAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleFormat1000); 

                        	newLeafNode(otherlv_1, grammarAccess.getFormatAccess().getDINA6Keyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:559:6: ( () otherlv_3= 'DIN A5' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:559:6: ( () otherlv_3= 'DIN A5' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:559:7: () otherlv_3= 'DIN A5'
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:559:7: ()
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:560:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFormatAccess().getEStringAction_1_0(),
                                current);
                        

                    }

                    otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleFormat1029); 

                        	newLeafNode(otherlv_3, grammarAccess.getFormatAccess().getDINA5Keyword_1_1());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:570:6: ( () otherlv_5= 'DIN A4' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:570:6: ( () otherlv_5= 'DIN A4' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:570:7: () otherlv_5= 'DIN A4'
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:570:7: ()
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:571:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFormatAccess().getEStringAction_2_0(),
                                current);
                        

                    }

                    otherlv_5=(Token)match(input,34,FOLLOW_34_in_ruleFormat1058); 

                        	newLeafNode(otherlv_5, grammarAccess.getFormatAccess().getDINA4Keyword_2_1());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:581:6: ( () otherlv_7= 'DIN A3' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:581:6: ( () otherlv_7= 'DIN A3' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:581:7: () otherlv_7= 'DIN A3'
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:581:7: ()
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:582:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFormatAccess().getEStringAction_3_0(),
                                current);
                        

                    }

                    otherlv_7=(Token)match(input,35,FOLLOW_35_in_ruleFormat1087); 

                        	newLeafNode(otherlv_7, grammarAccess.getFormatAccess().getDINA3Keyword_3_1());
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:592:6: ( () otherlv_9= 'DIN A2' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:592:6: ( () otherlv_9= 'DIN A2' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:592:7: () otherlv_9= 'DIN A2'
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:592:7: ()
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:593:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFormatAccess().getEStringAction_4_0(),
                                current);
                        

                    }

                    otherlv_9=(Token)match(input,36,FOLLOW_36_in_ruleFormat1116); 

                        	newLeafNode(otherlv_9, grammarAccess.getFormatAccess().getDINA2Keyword_4_1());
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:603:6: ( () otherlv_11= 'DIN A1' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:603:6: ( () otherlv_11= 'DIN A1' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:603:7: () otherlv_11= 'DIN A1'
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:603:7: ()
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:604:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFormatAccess().getEStringAction_5_0(),
                                current);
                        

                    }

                    otherlv_11=(Token)match(input,37,FOLLOW_37_in_ruleFormat1145); 

                        	newLeafNode(otherlv_11, grammarAccess.getFormatAccess().getDINA1Keyword_5_1());
                        

                    }


                    }
                    break;
                case 7 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:614:6: ( () otherlv_13= 'DIN A0' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:614:6: ( () otherlv_13= 'DIN A0' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:614:7: () otherlv_13= 'DIN A0'
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:614:7: ()
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:615:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFormatAccess().getEStringAction_6_0(),
                                current);
                        

                    }

                    otherlv_13=(Token)match(input,38,FOLLOW_38_in_ruleFormat1174); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:632:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:633:2: (iv_ruleDate= ruleDate EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:634:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_ruleDate_in_entryRuleDate1211);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDate1221); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:641:1: ruleDate returns [EObject current=null] : (otherlv_0= '{' ( (lv_day_1_0= RULE_INT ) ) otherlv_2= '-' ( (lv_month_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_year_5_0= RULE_INT ) ) otherlv_6= '}' ) ;
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
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:644:28: ( (otherlv_0= '{' ( (lv_day_1_0= RULE_INT ) ) otherlv_2= '-' ( (lv_month_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_year_5_0= RULE_INT ) ) otherlv_6= '}' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:645:1: (otherlv_0= '{' ( (lv_day_1_0= RULE_INT ) ) otherlv_2= '-' ( (lv_month_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_year_5_0= RULE_INT ) ) otherlv_6= '}' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:645:1: (otherlv_0= '{' ( (lv_day_1_0= RULE_INT ) ) otherlv_2= '-' ( (lv_month_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_year_5_0= RULE_INT ) ) otherlv_6= '}' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:645:3: otherlv_0= '{' ( (lv_day_1_0= RULE_INT ) ) otherlv_2= '-' ( (lv_month_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_year_5_0= RULE_INT ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleDate1258); 

                	newLeafNode(otherlv_0, grammarAccess.getDateAccess().getLeftCurlyBracketKeyword_0());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:649:1: ( (lv_day_1_0= RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:650:1: (lv_day_1_0= RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:650:1: (lv_day_1_0= RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:651:3: lv_day_1_0= RULE_INT
            {
            lv_day_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDate1275); 

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

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleDate1292); 

                	newLeafNode(otherlv_2, grammarAccess.getDateAccess().getHyphenMinusKeyword_2());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:671:1: ( (lv_month_3_0= RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:672:1: (lv_month_3_0= RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:672:1: (lv_month_3_0= RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:673:3: lv_month_3_0= RULE_INT
            {
            lv_month_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDate1309); 

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

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleDate1326); 

                	newLeafNode(otherlv_4, grammarAccess.getDateAccess().getHyphenMinusKeyword_4());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:693:1: ( (lv_year_5_0= RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:694:1: (lv_year_5_0= RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:694:1: (lv_year_5_0= RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:695:3: lv_year_5_0= RULE_INT
            {
            lv_year_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDate1343); 

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

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleDate1360); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:723:1: entryRuleLanguage returns [EObject current=null] : iv_ruleLanguage= ruleLanguage EOF ;
    public final EObject entryRuleLanguage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguage = null;


        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:724:2: (iv_ruleLanguage= ruleLanguage EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:725:2: iv_ruleLanguage= ruleLanguage EOF
            {
             newCompositeNode(grammarAccess.getLanguageRule()); 
            pushFollow(FOLLOW_ruleLanguage_in_entryRuleLanguage1396);
            iv_ruleLanguage=ruleLanguage();

            state._fsp--;

             current =iv_ruleLanguage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLanguage1406); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:732:1: ruleLanguage returns [EObject current=null] : ( ( () otherlv_1= 'English' ) | ( () otherlv_3= 'German' ) ) ;
    public final EObject ruleLanguage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:735:28: ( ( ( () otherlv_1= 'English' ) | ( () otherlv_3= 'German' ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:736:1: ( ( () otherlv_1= 'English' ) | ( () otherlv_3= 'German' ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:736:1: ( ( () otherlv_1= 'English' ) | ( () otherlv_3= 'German' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==39) ) {
                alt9=1;
            }
            else if ( (LA9_0==40) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:736:2: ( () otherlv_1= 'English' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:736:2: ( () otherlv_1= 'English' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:736:3: () otherlv_1= 'English'
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:736:3: ()
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:737:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLanguageAccess().getEStringAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleLanguage1453); 

                        	newLeafNode(otherlv_1, grammarAccess.getLanguageAccess().getEnglishKeyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:747:6: ( () otherlv_3= 'German' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:747:6: ( () otherlv_3= 'German' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:747:7: () otherlv_3= 'German'
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:747:7: ()
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:748:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLanguageAccess().getEStringAction_1_0(),
                                current);
                        

                    }

                    otherlv_3=(Token)match(input,40,FOLLOW_40_in_ruleLanguage1482); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:765:1: entryRulePrice returns [EObject current=null] : iv_rulePrice= rulePrice EOF ;
    public final EObject entryRulePrice() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrice = null;


        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:766:2: (iv_rulePrice= rulePrice EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:767:2: iv_rulePrice= rulePrice EOF
            {
             newCompositeNode(grammarAccess.getPriceRule()); 
            pushFollow(FOLLOW_rulePrice_in_entryRulePrice1519);
            iv_rulePrice=rulePrice();

            state._fsp--;

             current =iv_rulePrice; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrice1529); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:774:1: rulePrice returns [EObject current=null] : (otherlv_0= '{' ( (lv_value_1_0= ruleValue ) ) ( (lv_currency_2_0= ruleCurrency ) ) otherlv_3= '}' ) ;
    public final EObject rulePrice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;

        EObject lv_currency_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:777:28: ( (otherlv_0= '{' ( (lv_value_1_0= ruleValue ) ) ( (lv_currency_2_0= ruleCurrency ) ) otherlv_3= '}' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:778:1: (otherlv_0= '{' ( (lv_value_1_0= ruleValue ) ) ( (lv_currency_2_0= ruleCurrency ) ) otherlv_3= '}' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:778:1: (otherlv_0= '{' ( (lv_value_1_0= ruleValue ) ) ( (lv_currency_2_0= ruleCurrency ) ) otherlv_3= '}' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:778:3: otherlv_0= '{' ( (lv_value_1_0= ruleValue ) ) ( (lv_currency_2_0= ruleCurrency ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_rulePrice1566); 

                	newLeafNode(otherlv_0, grammarAccess.getPriceAccess().getLeftCurlyBracketKeyword_0());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:782:1: ( (lv_value_1_0= ruleValue ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:783:1: (lv_value_1_0= ruleValue )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:783:1: (lv_value_1_0= ruleValue )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:784:3: lv_value_1_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getPriceAccess().getValueValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_rulePrice1587);
            lv_value_1_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPriceRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"Value");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:800:2: ( (lv_currency_2_0= ruleCurrency ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:801:1: (lv_currency_2_0= ruleCurrency )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:801:1: (lv_currency_2_0= ruleCurrency )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:802:3: lv_currency_2_0= ruleCurrency
            {
             
            	        newCompositeNode(grammarAccess.getPriceAccess().getCurrencyCurrencyParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleCurrency_in_rulePrice1608);
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

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_rulePrice1620); 

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


    // $ANTLR start "entryRuleValue"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:830:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:831:2: (iv_ruleValue= ruleValue EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:832:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue1657);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue1668); 

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:839:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' | kw= ',' ) this_INT_3= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_3=null;

         enterRule(); 
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:842:28: ( (this_INT_0= RULE_INT (kw= '.' | kw= ',' ) this_INT_3= RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:843:1: (this_INT_0= RULE_INT (kw= '.' | kw= ',' ) this_INT_3= RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:843:1: (this_INT_0= RULE_INT (kw= '.' | kw= ',' ) this_INT_3= RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:843:6: this_INT_0= RULE_INT (kw= '.' | kw= ',' ) this_INT_3= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleValue1708); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getValueAccess().getINTTerminalRuleCall_0()); 
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:850:1: (kw= '.' | kw= ',' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==41) ) {
                alt10=1;
            }
            else if ( (LA10_0==42) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:851:2: kw= '.'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleValue1727); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getValueAccess().getFullStopKeyword_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:858:2: kw= ','
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleValue1746); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getValueAccess().getCommaKeyword_1_1()); 
                        

                    }
                    break;

            }

            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleValue1762); 

            		current.merge(this_INT_3);
                
             
                newLeafNode(this_INT_3, grammarAccess.getValueAccess().getINTTerminalRuleCall_2()); 
                

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleCurrency"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:878:1: entryRuleCurrency returns [EObject current=null] : iv_ruleCurrency= ruleCurrency EOF ;
    public final EObject entryRuleCurrency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCurrency = null;


        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:879:2: (iv_ruleCurrency= ruleCurrency EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:880:2: iv_ruleCurrency= ruleCurrency EOF
            {
             newCompositeNode(grammarAccess.getCurrencyRule()); 
            pushFollow(FOLLOW_ruleCurrency_in_entryRuleCurrency1807);
            iv_ruleCurrency=ruleCurrency();

            state._fsp--;

             current =iv_ruleCurrency; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCurrency1817); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:887:1: ruleCurrency returns [EObject current=null] : ( ( () otherlv_1= 'Euro [\\u20AC]' ) | ( () otherlv_3= 'Dollar [$]' ) ) ;
    public final EObject ruleCurrency() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:890:28: ( ( ( () otherlv_1= 'Euro [\\u20AC]' ) | ( () otherlv_3= 'Dollar [$]' ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:891:1: ( ( () otherlv_1= 'Euro [\\u20AC]' ) | ( () otherlv_3= 'Dollar [$]' ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:891:1: ( ( () otherlv_1= 'Euro [\\u20AC]' ) | ( () otherlv_3= 'Dollar [$]' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==43) ) {
                alt11=1;
            }
            else if ( (LA11_0==44) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:891:2: ( () otherlv_1= 'Euro [\\u20AC]' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:891:2: ( () otherlv_1= 'Euro [\\u20AC]' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:891:3: () otherlv_1= 'Euro [\\u20AC]'
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:891:3: ()
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:892:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getCurrencyAccess().getEStringAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleCurrency1864); 

                        	newLeafNode(otherlv_1, grammarAccess.getCurrencyAccess().getEuroKeyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:902:6: ( () otherlv_3= 'Dollar [$]' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:902:6: ( () otherlv_3= 'Dollar [$]' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:902:7: () otherlv_3= 'Dollar [$]'
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:902:7: ()
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:903:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getCurrencyAccess().getEStringAction_1_0(),
                                current);
                        

                    }

                    otherlv_3=(Token)match(input,44,FOLLOW_44_in_ruleCurrency1893); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:920:1: entryRuleTopic returns [EObject current=null] : iv_ruleTopic= ruleTopic EOF ;
    public final EObject entryRuleTopic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopic = null;


        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:921:2: (iv_ruleTopic= ruleTopic EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:922:2: iv_ruleTopic= ruleTopic EOF
            {
             newCompositeNode(grammarAccess.getTopicRule()); 
            pushFollow(FOLLOW_ruleTopic_in_entryRuleTopic1930);
            iv_ruleTopic=ruleTopic();

            state._fsp--;

             current =iv_ruleTopic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTopic1940); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:929:1: ruleTopic returns [EObject current=null] : (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tags_3_0= ruleTopicTag ) ) (otherlv_4= ', ' ( (lv_tags_5_0= ruleTopicTag ) ) )* otherlv_6= '}' ) ;
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
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:932:28: ( (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tags_3_0= ruleTopicTag ) ) (otherlv_4= ', ' ( (lv_tags_5_0= ruleTopicTag ) ) )* otherlv_6= '}' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:933:1: (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tags_3_0= ruleTopicTag ) ) (otherlv_4= ', ' ( (lv_tags_5_0= ruleTopicTag ) ) )* otherlv_6= '}' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:933:1: (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tags_3_0= ruleTopicTag ) ) (otherlv_4= ', ' ( (lv_tags_5_0= ruleTopicTag ) ) )* otherlv_6= '}' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:933:3: otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tags_3_0= ruleTopicTag ) ) (otherlv_4= ', ' ( (lv_tags_5_0= ruleTopicTag ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleTopic1977); 

                	newLeafNode(otherlv_0, grammarAccess.getTopicAccess().getTopicKeyword_0());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:937:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:938:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:938:1: (lv_name_1_0= RULE_ID )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:939:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTopic1994); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleTopic2011); 

                	newLeafNode(otherlv_2, grammarAccess.getTopicAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:959:1: ( (lv_tags_3_0= ruleTopicTag ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:960:1: (lv_tags_3_0= ruleTopicTag )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:960:1: (lv_tags_3_0= ruleTopicTag )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:961:3: lv_tags_3_0= ruleTopicTag
            {
             
            	        newCompositeNode(grammarAccess.getTopicAccess().getTagsTopicTagParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTopicTag_in_ruleTopic2032);
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

            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:977:2: (otherlv_4= ', ' ( (lv_tags_5_0= ruleTopicTag ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==14) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:977:4: otherlv_4= ', ' ( (lv_tags_5_0= ruleTopicTag ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleTopic2045); 

            	        	newLeafNode(otherlv_4, grammarAccess.getTopicAccess().getCommaSpaceKeyword_4_0());
            	        
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:981:1: ( (lv_tags_5_0= ruleTopicTag ) )
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:982:1: (lv_tags_5_0= ruleTopicTag )
            	    {
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:982:1: (lv_tags_5_0= ruleTopicTag )
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:983:3: lv_tags_5_0= ruleTopicTag
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTopicAccess().getTagsTopicTagParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTopicTag_in_ruleTopic2066);
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
            	    break loop12;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleTopic2080); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1011:1: entryRuleTopicTag returns [EObject current=null] : iv_ruleTopicTag= ruleTopicTag EOF ;
    public final EObject entryRuleTopicTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopicTag = null;


        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1012:2: (iv_ruleTopicTag= ruleTopicTag EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1013:2: iv_ruleTopicTag= ruleTopicTag EOF
            {
             newCompositeNode(grammarAccess.getTopicTagRule()); 
            pushFollow(FOLLOW_ruleTopicTag_in_entryRuleTopicTag2116);
            iv_ruleTopicTag=ruleTopicTag();

            state._fsp--;

             current =iv_ruleTopicTag; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTopicTag2126); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1020:1: ruleTopicTag returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleTopicTag() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1023:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1024:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1024:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1025:1: (lv_value_0_0= RULE_STRING )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1025:1: (lv_value_0_0= RULE_STRING )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1026:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTopicTag2167); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1050:1: entryRulePair returns [EObject current=null] : iv_rulePair= rulePair EOF ;
    public final EObject entryRulePair() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePair = null;


        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1051:2: (iv_rulePair= rulePair EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1052:2: iv_rulePair= rulePair EOF
            {
             newCompositeNode(grammarAccess.getPairRule()); 
            pushFollow(FOLLOW_rulePair_in_entryRulePair2207);
            iv_rulePair=rulePair();

            state._fsp--;

             current =iv_rulePair; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePair2217); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1059:1: rulePair returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject rulePair() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1062:28: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1063:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1063:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1063:2: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1063:2: ( (lv_key_0_0= RULE_ID ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1064:1: (lv_key_0_0= RULE_ID )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1064:1: (lv_key_0_0= RULE_ID )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1065:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePair2259); 

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

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_rulePair2276); 

                	newLeafNode(otherlv_1, grammarAccess.getPairAccess().getColonKeyword_1());
                
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1085:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1086:1: (lv_value_2_0= RULE_STRING )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1086:1: (lv_value_2_0= RULE_STRING )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/parser/antlr/internal/InternalNpl.g:1087:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePair2293); 

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
    public static final BitSet FOLLOW_12_in_ruleDeclaration156 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDeclaration168 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDeclaration180 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePair_in_ruleDeclaration201 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleDeclaration214 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePair_in_ruleDeclaration235 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleDeclaration249 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDeclaration261 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDeclaration273 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ruleTopic_in_ruleDeclaration294 = new BitSet(new long[]{0x0000200000008000L});
    public static final BitSet FOLLOW_ruleTopic_in_ruleDeclaration315 = new BitSet(new long[]{0x0000200000008000L});
    public static final BitSet FOLLOW_15_in_ruleDeclaration328 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_17_in_ruleDeclaration341 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleDate_in_ruleDeclaration362 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleDeclaration377 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDeclaration394 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDeclaration413 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rulePrice_in_ruleDeclaration434 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleDeclaration447 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDeclaration464 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDeclaration483 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_ruleLanguage_in_ruleDeclaration504 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDeclaration516 = new BitSet(new long[]{0x0000007F00000000L});
    public static final BitSet FOLLOW_ruleFormat_in_ruleDeclaration537 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleDeclaration549 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDeclaration566 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDeclaration583 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDeclaration600 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDeclaration617 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDeclaration634 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_26_in_ruleDeclaration652 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDeclaration669 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleDeclaration688 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDeclaration705 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleDeclaration722 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_ruleFontSize_in_ruleDeclaration743 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDeclaration755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFontSize_in_entryRuleFontSize791 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFontSize801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleFontSize848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleFontSize877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleFontSize906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormat_in_entryRuleFormat943 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormat953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleFormat1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleFormat1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleFormat1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleFormat1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleFormat1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleFormat1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleFormat1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_in_entryRuleDate1211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDate1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleDate1258 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDate1275 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDate1292 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDate1309 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDate1326 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDate1343 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDate1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLanguage_in_entryRuleLanguage1396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLanguage1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleLanguage1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleLanguage1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrice_in_entryRulePrice1519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrice1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulePrice1566 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValue_in_rulePrice1587 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleCurrency_in_rulePrice1608 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePrice1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue1657 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleValue1708 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_41_in_ruleValue1727 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_42_in_ruleValue1746 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleValue1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCurrency_in_entryRuleCurrency1807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCurrency1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleCurrency1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleCurrency1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopic_in_entryRuleTopic1930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopic1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleTopic1977 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTopic1994 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTopic2011 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleTopicTag_in_ruleTopic2032 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleTopic2045 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleTopicTag_in_ruleTopic2066 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleTopic2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopicTag_in_entryRuleTopicTag2116 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopicTag2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTopicTag2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePair_in_entryRulePair2207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePair2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePair2259 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_rulePair2276 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePair2293 = new BitSet(new long[]{0x0000000000000002L});

}