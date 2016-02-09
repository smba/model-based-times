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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_URL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'newspaper'", "'{'", "'title'", "'feed links'", "'}'", "'topics'", "'date'", "'location'", "'price'", "'volume'", "'no.'", "'language'", "'format'", "'number of articles per topic'", "'number of words per article'", "'-'", "'number of images per article'", "'number of columns'", "'font size'", "'small'", "'medium'", "'large'", "'DIN A6'", "'DIN A5'", "'DIN A4'", "'DIN A3'", "'DIN A2'", "'DIN A1'", "'DIN A0'", "'English'", "'German'", "'Euro'", "'EUR'", "'\\u20AC'", "'Dollar'", "'USD'", "'$'", "'topic'", "'as'", "', '", "'<'", "'>'", "'.'", "','", "'RSS'", "'Atom'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
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
    public static final int T__48=48;
    public static final int T__49=49;
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
    public String getGrammarFileName() { return "InternalNpl.g"; }



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
    // InternalNpl.g:67:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalNpl.g:68:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalNpl.g:69:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalNpl.g:76:1: ruleDeclaration returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'newspaper' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) otherlv_6= 'feed links' otherlv_7= '{' ( (lv_feedlinks_8_0= rulePair ) ) ( (lv_feedlinks_9_0= rulePair ) )* otherlv_10= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'topics' otherlv_12= '{' ( (lv_topics_13_0= ruleTopic ) ) ( (lv_topics_14_0= ruleTopic ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'date' ( (lv_date_17_0= ruleDate ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'location' ( (lv_location_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'price' ( (lv_price_21_0= rulePrice ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volume' ( (lv_volume_23_0= RULE_INT ) ) (otherlv_24= 'no.' ( (lv_number_25_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'language' ( (lv_language_27_0= ruleLanguage ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'format' ( (lv_format_29_0= ruleFormat ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'number of articles per topic' ( (lv_articleCnt_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'number of words per article' ( (lv_articleWordsMin_33_0= RULE_INT ) ) otherlv_34= '-' ( (lv_articleWordsMax_35_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'number of images per article' ( (lv_imagesCnt_37_0= ruleImagesCount ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'number of columns' ( (lv_columnsCnt_39_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'font size' ( (lv_fontSize_41_0= ruleFontSize ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= '}' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_title_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token lv_location_19_0=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token lv_volume_23_0=null;
        Token otherlv_24=null;
        Token lv_number_25_0=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token lv_articleCnt_31_0=null;
        Token otherlv_32=null;
        Token lv_articleWordsMin_33_0=null;
        Token otherlv_34=null;
        Token lv_articleWordsMax_35_0=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token lv_columnsCnt_39_0=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        EObject lv_feedlinks_8_0 = null;

        EObject lv_feedlinks_9_0 = null;

        EObject lv_topics_13_0 = null;

        EObject lv_topics_14_0 = null;

        EObject lv_date_17_0 = null;

        EObject lv_price_21_0 = null;

        EObject lv_language_27_0 = null;

        EObject lv_format_29_0 = null;

        EObject lv_imagesCnt_37_0 = null;

        EObject lv_fontSize_41_0 = null;


         enterRule(); 
            
        try {
            // InternalNpl.g:79:28: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'newspaper' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) otherlv_6= 'feed links' otherlv_7= '{' ( (lv_feedlinks_8_0= rulePair ) ) ( (lv_feedlinks_9_0= rulePair ) )* otherlv_10= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'topics' otherlv_12= '{' ( (lv_topics_13_0= ruleTopic ) ) ( (lv_topics_14_0= ruleTopic ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'date' ( (lv_date_17_0= ruleDate ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'location' ( (lv_location_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'price' ( (lv_price_21_0= rulePrice ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volume' ( (lv_volume_23_0= RULE_INT ) ) (otherlv_24= 'no.' ( (lv_number_25_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'language' ( (lv_language_27_0= ruleLanguage ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'format' ( (lv_format_29_0= ruleFormat ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'number of articles per topic' ( (lv_articleCnt_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'number of words per article' ( (lv_articleWordsMin_33_0= RULE_INT ) ) otherlv_34= '-' ( (lv_articleWordsMax_35_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'number of images per article' ( (lv_imagesCnt_37_0= ruleImagesCount ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'number of columns' ( (lv_columnsCnt_39_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'font size' ( (lv_fontSize_41_0= ruleFontSize ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= '}' ) ) ) ) )+ {...}?) ) ) )
            // InternalNpl.g:80:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'newspaper' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) otherlv_6= 'feed links' otherlv_7= '{' ( (lv_feedlinks_8_0= rulePair ) ) ( (lv_feedlinks_9_0= rulePair ) )* otherlv_10= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'topics' otherlv_12= '{' ( (lv_topics_13_0= ruleTopic ) ) ( (lv_topics_14_0= ruleTopic ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'date' ( (lv_date_17_0= ruleDate ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'location' ( (lv_location_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'price' ( (lv_price_21_0= rulePrice ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volume' ( (lv_volume_23_0= RULE_INT ) ) (otherlv_24= 'no.' ( (lv_number_25_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'language' ( (lv_language_27_0= ruleLanguage ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'format' ( (lv_format_29_0= ruleFormat ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'number of articles per topic' ( (lv_articleCnt_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'number of words per article' ( (lv_articleWordsMin_33_0= RULE_INT ) ) otherlv_34= '-' ( (lv_articleWordsMax_35_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'number of images per article' ( (lv_imagesCnt_37_0= ruleImagesCount ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'number of columns' ( (lv_columnsCnt_39_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'font size' ( (lv_fontSize_41_0= ruleFontSize ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= '}' ) ) ) ) )+ {...}?) ) )
            {
            // InternalNpl.g:80:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'newspaper' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) otherlv_6= 'feed links' otherlv_7= '{' ( (lv_feedlinks_8_0= rulePair ) ) ( (lv_feedlinks_9_0= rulePair ) )* otherlv_10= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'topics' otherlv_12= '{' ( (lv_topics_13_0= ruleTopic ) ) ( (lv_topics_14_0= ruleTopic ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'date' ( (lv_date_17_0= ruleDate ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'location' ( (lv_location_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'price' ( (lv_price_21_0= rulePrice ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volume' ( (lv_volume_23_0= RULE_INT ) ) (otherlv_24= 'no.' ( (lv_number_25_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'language' ( (lv_language_27_0= ruleLanguage ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'format' ( (lv_format_29_0= ruleFormat ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'number of articles per topic' ( (lv_articleCnt_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'number of words per article' ( (lv_articleWordsMin_33_0= RULE_INT ) ) otherlv_34= '-' ( (lv_articleWordsMax_35_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'number of images per article' ( (lv_imagesCnt_37_0= ruleImagesCount ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'number of columns' ( (lv_columnsCnt_39_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'font size' ( (lv_fontSize_41_0= ruleFontSize ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= '}' ) ) ) ) )+ {...}?) ) )
            // InternalNpl.g:82:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'newspaper' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) otherlv_6= 'feed links' otherlv_7= '{' ( (lv_feedlinks_8_0= rulePair ) ) ( (lv_feedlinks_9_0= rulePair ) )* otherlv_10= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'topics' otherlv_12= '{' ( (lv_topics_13_0= ruleTopic ) ) ( (lv_topics_14_0= ruleTopic ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'date' ( (lv_date_17_0= ruleDate ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'location' ( (lv_location_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'price' ( (lv_price_21_0= rulePrice ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volume' ( (lv_volume_23_0= RULE_INT ) ) (otherlv_24= 'no.' ( (lv_number_25_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'language' ( (lv_language_27_0= ruleLanguage ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'format' ( (lv_format_29_0= ruleFormat ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'number of articles per topic' ( (lv_articleCnt_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'number of words per article' ( (lv_articleWordsMin_33_0= RULE_INT ) ) otherlv_34= '-' ( (lv_articleWordsMax_35_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'number of images per article' ( (lv_imagesCnt_37_0= ruleImagesCount ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'number of columns' ( (lv_columnsCnt_39_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'font size' ( (lv_fontSize_41_0= ruleFontSize ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= '}' ) ) ) ) )+ {...}?) )
            {
            // InternalNpl.g:82:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'newspaper' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) otherlv_6= 'feed links' otherlv_7= '{' ( (lv_feedlinks_8_0= rulePair ) ) ( (lv_feedlinks_9_0= rulePair ) )* otherlv_10= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'topics' otherlv_12= '{' ( (lv_topics_13_0= ruleTopic ) ) ( (lv_topics_14_0= ruleTopic ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'date' ( (lv_date_17_0= ruleDate ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'location' ( (lv_location_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'price' ( (lv_price_21_0= rulePrice ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volume' ( (lv_volume_23_0= RULE_INT ) ) (otherlv_24= 'no.' ( (lv_number_25_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'language' ( (lv_language_27_0= ruleLanguage ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'format' ( (lv_format_29_0= ruleFormat ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'number of articles per topic' ( (lv_articleCnt_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'number of words per article' ( (lv_articleWordsMin_33_0= RULE_INT ) ) otherlv_34= '-' ( (lv_articleWordsMax_35_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'number of images per article' ( (lv_imagesCnt_37_0= ruleImagesCount ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'number of columns' ( (lv_columnsCnt_39_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'font size' ( (lv_fontSize_41_0= ruleFontSize ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= '}' ) ) ) ) )+ {...}?) )
            // InternalNpl.g:83:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'newspaper' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) otherlv_6= 'feed links' otherlv_7= '{' ( (lv_feedlinks_8_0= rulePair ) ) ( (lv_feedlinks_9_0= rulePair ) )* otherlv_10= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'topics' otherlv_12= '{' ( (lv_topics_13_0= ruleTopic ) ) ( (lv_topics_14_0= ruleTopic ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'date' ( (lv_date_17_0= ruleDate ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'location' ( (lv_location_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'price' ( (lv_price_21_0= rulePrice ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volume' ( (lv_volume_23_0= RULE_INT ) ) (otherlv_24= 'no.' ( (lv_number_25_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'language' ( (lv_language_27_0= ruleLanguage ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'format' ( (lv_format_29_0= ruleFormat ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'number of articles per topic' ( (lv_articleCnt_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'number of words per article' ( (lv_articleWordsMin_33_0= RULE_INT ) ) otherlv_34= '-' ( (lv_articleWordsMax_35_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'number of images per article' ( (lv_imagesCnt_37_0= ruleImagesCount ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'number of columns' ( (lv_columnsCnt_39_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'font size' ( (lv_fontSize_41_0= ruleFontSize ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= '}' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getDeclarationAccess().getUnorderedGroup());
            	
            // InternalNpl.g:86:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'newspaper' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) otherlv_6= 'feed links' otherlv_7= '{' ( (lv_feedlinks_8_0= rulePair ) ) ( (lv_feedlinks_9_0= rulePair ) )* otherlv_10= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'topics' otherlv_12= '{' ( (lv_topics_13_0= ruleTopic ) ) ( (lv_topics_14_0= ruleTopic ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'date' ( (lv_date_17_0= ruleDate ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'location' ( (lv_location_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'price' ( (lv_price_21_0= rulePrice ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volume' ( (lv_volume_23_0= RULE_INT ) ) (otherlv_24= 'no.' ( (lv_number_25_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'language' ( (lv_language_27_0= ruleLanguage ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'format' ( (lv_format_29_0= ruleFormat ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'number of articles per topic' ( (lv_articleCnt_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'number of words per article' ( (lv_articleWordsMin_33_0= RULE_INT ) ) otherlv_34= '-' ( (lv_articleWordsMax_35_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'number of images per article' ( (lv_imagesCnt_37_0= ruleImagesCount ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'number of columns' ( (lv_columnsCnt_39_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'font size' ( (lv_fontSize_41_0= ruleFontSize ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= '}' ) ) ) ) )+ {...}?)
            // InternalNpl.g:87:3: ( ({...}? => ( ({...}? => (otherlv_1= 'newspaper' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) otherlv_6= 'feed links' otherlv_7= '{' ( (lv_feedlinks_8_0= rulePair ) ) ( (lv_feedlinks_9_0= rulePair ) )* otherlv_10= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'topics' otherlv_12= '{' ( (lv_topics_13_0= ruleTopic ) ) ( (lv_topics_14_0= ruleTopic ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'date' ( (lv_date_17_0= ruleDate ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'location' ( (lv_location_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'price' ( (lv_price_21_0= rulePrice ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volume' ( (lv_volume_23_0= RULE_INT ) ) (otherlv_24= 'no.' ( (lv_number_25_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'language' ( (lv_language_27_0= ruleLanguage ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'format' ( (lv_format_29_0= ruleFormat ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'number of articles per topic' ( (lv_articleCnt_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'number of words per article' ( (lv_articleWordsMin_33_0= RULE_INT ) ) otherlv_34= '-' ( (lv_articleWordsMax_35_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'number of images per article' ( (lv_imagesCnt_37_0= ruleImagesCount ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'number of columns' ( (lv_columnsCnt_39_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'font size' ( (lv_fontSize_41_0= ruleFontSize ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= '}' ) ) ) ) )+ {...}?
            {
            // InternalNpl.g:87:3: ( ({...}? => ( ({...}? => (otherlv_1= 'newspaper' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) otherlv_6= 'feed links' otherlv_7= '{' ( (lv_feedlinks_8_0= rulePair ) ) ( (lv_feedlinks_9_0= rulePair ) )* otherlv_10= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'topics' otherlv_12= '{' ( (lv_topics_13_0= ruleTopic ) ) ( (lv_topics_14_0= ruleTopic ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'date' ( (lv_date_17_0= ruleDate ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'location' ( (lv_location_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'price' ( (lv_price_21_0= rulePrice ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volume' ( (lv_volume_23_0= RULE_INT ) ) (otherlv_24= 'no.' ( (lv_number_25_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'language' ( (lv_language_27_0= ruleLanguage ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'format' ( (lv_format_29_0= ruleFormat ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'number of articles per topic' ( (lv_articleCnt_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'number of words per article' ( (lv_articleWordsMin_33_0= RULE_INT ) ) otherlv_34= '-' ( (lv_articleWordsMax_35_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'number of images per article' ( (lv_imagesCnt_37_0= ruleImagesCount ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'number of columns' ( (lv_columnsCnt_39_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'font size' ( (lv_fontSize_41_0= ruleFontSize ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= '}' ) ) ) ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=16;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // InternalNpl.g:89:4: ({...}? => ( ({...}? => (otherlv_1= 'newspaper' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ) ) ) )
            	    {
            	    // InternalNpl.g:89:4: ({...}? => ( ({...}? => (otherlv_1= 'newspaper' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ) ) ) )
            	    // InternalNpl.g:90:5: {...}? => ( ({...}? => (otherlv_1= 'newspaper' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalNpl.g:90:106: ( ({...}? => (otherlv_1= 'newspaper' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ) ) )
            	    // InternalNpl.g:91:6: ({...}? => (otherlv_1= 'newspaper' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // InternalNpl.g:94:6: ({...}? => (otherlv_1= 'newspaper' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ) )
            	    // InternalNpl.g:94:7: {...}? => (otherlv_1= 'newspaper' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "true");
            	    }
            	    // InternalNpl.g:94:16: (otherlv_1= 'newspaper' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' )
            	    // InternalNpl.g:94:18: otherlv_1= 'newspaper' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{'
            	    {
            	    otherlv_1=(Token)match(input,12,FOLLOW_3); 

            	        	newLeafNode(otherlv_1, grammarAccess.getDeclarationAccess().getNewspaperKeyword_0_0());
            	        
            	    // InternalNpl.g:98:1: ( (lv_name_2_0= RULE_ID ) )
            	    // InternalNpl.g:99:1: (lv_name_2_0= RULE_ID )
            	    {
            	    // InternalNpl.g:99:1: (lv_name_2_0= RULE_ID )
            	    // InternalNpl.g:100:3: lv_name_2_0= RULE_ID
            	    {
            	    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            	    			newLeafNode(lv_name_2_0, grammarAccess.getDeclarationAccess().getNameIDTerminalRuleCall_0_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDeclarationRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"name",
            	            		lv_name_2_0, 
            	            		"org.eclipse.xtext.common.Terminals.ID");
            	    	    

            	    }


            	    }

            	    otherlv_3=(Token)match(input,13,FOLLOW_5); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDeclarationAccess().getLeftCurlyBracketKeyword_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeclarationAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalNpl.g:127:4: ({...}? => ( ({...}? => (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) otherlv_6= 'feed links' otherlv_7= '{' ( (lv_feedlinks_8_0= rulePair ) ) ( (lv_feedlinks_9_0= rulePair ) )* otherlv_10= '}' ) ) ) )
            	    {
            	    // InternalNpl.g:127:4: ({...}? => ( ({...}? => (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) otherlv_6= 'feed links' otherlv_7= '{' ( (lv_feedlinks_8_0= rulePair ) ) ( (lv_feedlinks_9_0= rulePair ) )* otherlv_10= '}' ) ) ) )
            	    // InternalNpl.g:128:5: {...}? => ( ({...}? => (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) otherlv_6= 'feed links' otherlv_7= '{' ( (lv_feedlinks_8_0= rulePair ) ) ( (lv_feedlinks_9_0= rulePair ) )* otherlv_10= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalNpl.g:128:106: ( ({...}? => (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) otherlv_6= 'feed links' otherlv_7= '{' ( (lv_feedlinks_8_0= rulePair ) ) ( (lv_feedlinks_9_0= rulePair ) )* otherlv_10= '}' ) ) )
            	    // InternalNpl.g:129:6: ({...}? => (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) otherlv_6= 'feed links' otherlv_7= '{' ( (lv_feedlinks_8_0= rulePair ) ) ( (lv_feedlinks_9_0= rulePair ) )* otherlv_10= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // InternalNpl.g:132:6: ({...}? => (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) otherlv_6= 'feed links' otherlv_7= '{' ( (lv_feedlinks_8_0= rulePair ) ) ( (lv_feedlinks_9_0= rulePair ) )* otherlv_10= '}' ) )
            	    // InternalNpl.g:132:7: {...}? => (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) otherlv_6= 'feed links' otherlv_7= '{' ( (lv_feedlinks_8_0= rulePair ) ) ( (lv_feedlinks_9_0= rulePair ) )* otherlv_10= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "true");
            	    }
            	    // InternalNpl.g:132:16: (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) otherlv_6= 'feed links' otherlv_7= '{' ( (lv_feedlinks_8_0= rulePair ) ) ( (lv_feedlinks_9_0= rulePair ) )* otherlv_10= '}' )
            	    // InternalNpl.g:132:18: otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) otherlv_6= 'feed links' otherlv_7= '{' ( (lv_feedlinks_8_0= rulePair ) ) ( (lv_feedlinks_9_0= rulePair ) )* otherlv_10= '}'
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_6); 

            	        	newLeafNode(otherlv_4, grammarAccess.getDeclarationAccess().getTitleKeyword_1_0());
            	        
            	    // InternalNpl.g:136:1: ( (lv_title_5_0= RULE_STRING ) )
            	    // InternalNpl.g:137:1: (lv_title_5_0= RULE_STRING )
            	    {
            	    // InternalNpl.g:137:1: (lv_title_5_0= RULE_STRING )
            	    // InternalNpl.g:138:3: lv_title_5_0= RULE_STRING
            	    {
            	    lv_title_5_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            	    			newLeafNode(lv_title_5_0, grammarAccess.getDeclarationAccess().getTitleSTRINGTerminalRuleCall_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDeclarationRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"title",
            	            		lv_title_5_0, 
            	            		"org.eclipse.xtext.common.Terminals.STRING");
            	    	    

            	    }


            	    }

            	    otherlv_6=(Token)match(input,15,FOLLOW_4); 

            	        	newLeafNode(otherlv_6, grammarAccess.getDeclarationAccess().getFeedLinksKeyword_1_2());
            	        
            	    otherlv_7=(Token)match(input,13,FOLLOW_8); 

            	        	newLeafNode(otherlv_7, grammarAccess.getDeclarationAccess().getLeftCurlyBracketKeyword_1_3());
            	        
            	    // InternalNpl.g:162:1: ( (lv_feedlinks_8_0= rulePair ) )
            	    // InternalNpl.g:163:1: (lv_feedlinks_8_0= rulePair )
            	    {
            	    // InternalNpl.g:163:1: (lv_feedlinks_8_0= rulePair )
            	    // InternalNpl.g:164:3: lv_feedlinks_8_0= rulePair
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclarationAccess().getFeedlinksPairParserRuleCall_1_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_9);
            	    lv_feedlinks_8_0=rulePair();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"feedlinks",
            	            		lv_feedlinks_8_0, 
            	            		"de.tu_bs.cs.isf.mbse.mbtimes.Npl.Pair");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // InternalNpl.g:180:2: ( (lv_feedlinks_9_0= rulePair ) )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( ((LA1_0>=56 && LA1_0<=57)) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalNpl.g:181:1: (lv_feedlinks_9_0= rulePair )
            	    	    {
            	    	    // InternalNpl.g:181:1: (lv_feedlinks_9_0= rulePair )
            	    	    // InternalNpl.g:182:3: lv_feedlinks_9_0= rulePair
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getDeclarationAccess().getFeedlinksPairParserRuleCall_1_5_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_9);
            	    	    lv_feedlinks_9_0=rulePair();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"feedlinks",
            	    	            		lv_feedlinks_9_0, 
            	    	            		"de.tu_bs.cs.isf.mbse.mbtimes.Npl.Pair");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop1;
            	        }
            	    } while (true);

            	    otherlv_10=(Token)match(input,16,FOLLOW_5); 

            	        	newLeafNode(otherlv_10, grammarAccess.getDeclarationAccess().getRightCurlyBracketKeyword_1_6());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeclarationAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalNpl.g:209:4: ({...}? => ( ({...}? => (otherlv_11= 'topics' otherlv_12= '{' ( (lv_topics_13_0= ruleTopic ) ) ( (lv_topics_14_0= ruleTopic ) )* otherlv_15= '}' ) ) ) )
            	    {
            	    // InternalNpl.g:209:4: ({...}? => ( ({...}? => (otherlv_11= 'topics' otherlv_12= '{' ( (lv_topics_13_0= ruleTopic ) ) ( (lv_topics_14_0= ruleTopic ) )* otherlv_15= '}' ) ) ) )
            	    // InternalNpl.g:210:5: {...}? => ( ({...}? => (otherlv_11= 'topics' otherlv_12= '{' ( (lv_topics_13_0= ruleTopic ) ) ( (lv_topics_14_0= ruleTopic ) )* otherlv_15= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalNpl.g:210:106: ( ({...}? => (otherlv_11= 'topics' otherlv_12= '{' ( (lv_topics_13_0= ruleTopic ) ) ( (lv_topics_14_0= ruleTopic ) )* otherlv_15= '}' ) ) )
            	    // InternalNpl.g:211:6: ({...}? => (otherlv_11= 'topics' otherlv_12= '{' ( (lv_topics_13_0= ruleTopic ) ) ( (lv_topics_14_0= ruleTopic ) )* otherlv_15= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2);
            	    	 				
            	    // InternalNpl.g:214:6: ({...}? => (otherlv_11= 'topics' otherlv_12= '{' ( (lv_topics_13_0= ruleTopic ) ) ( (lv_topics_14_0= ruleTopic ) )* otherlv_15= '}' ) )
            	    // InternalNpl.g:214:7: {...}? => (otherlv_11= 'topics' otherlv_12= '{' ( (lv_topics_13_0= ruleTopic ) ) ( (lv_topics_14_0= ruleTopic ) )* otherlv_15= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "true");
            	    }
            	    // InternalNpl.g:214:16: (otherlv_11= 'topics' otherlv_12= '{' ( (lv_topics_13_0= ruleTopic ) ) ( (lv_topics_14_0= ruleTopic ) )* otherlv_15= '}' )
            	    // InternalNpl.g:214:18: otherlv_11= 'topics' otherlv_12= '{' ( (lv_topics_13_0= ruleTopic ) ) ( (lv_topics_14_0= ruleTopic ) )* otherlv_15= '}'
            	    {
            	    otherlv_11=(Token)match(input,17,FOLLOW_4); 

            	        	newLeafNode(otherlv_11, grammarAccess.getDeclarationAccess().getTopicsKeyword_2_0());
            	        
            	    otherlv_12=(Token)match(input,13,FOLLOW_10); 

            	        	newLeafNode(otherlv_12, grammarAccess.getDeclarationAccess().getLeftCurlyBracketKeyword_2_1());
            	        
            	    // InternalNpl.g:222:1: ( (lv_topics_13_0= ruleTopic ) )
            	    // InternalNpl.g:223:1: (lv_topics_13_0= ruleTopic )
            	    {
            	    // InternalNpl.g:223:1: (lv_topics_13_0= ruleTopic )
            	    // InternalNpl.g:224:3: lv_topics_13_0= ruleTopic
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclarationAccess().getTopicsTopicParserRuleCall_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_11);
            	    lv_topics_13_0=ruleTopic();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"topics",
            	            		lv_topics_13_0, 
            	            		"de.tu_bs.cs.isf.mbse.mbtimes.Npl.Topic");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // InternalNpl.g:240:2: ( (lv_topics_14_0= ruleTopic ) )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==49) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalNpl.g:241:1: (lv_topics_14_0= ruleTopic )
            	    	    {
            	    	    // InternalNpl.g:241:1: (lv_topics_14_0= ruleTopic )
            	    	    // InternalNpl.g:242:3: lv_topics_14_0= ruleTopic
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getDeclarationAccess().getTopicsTopicParserRuleCall_2_3_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_11);
            	    	    lv_topics_14_0=ruleTopic();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"topics",
            	    	            		lv_topics_14_0, 
            	    	            		"de.tu_bs.cs.isf.mbse.mbtimes.Npl.Topic");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);

            	    otherlv_15=(Token)match(input,16,FOLLOW_5); 

            	        	newLeafNode(otherlv_15, grammarAccess.getDeclarationAccess().getRightCurlyBracketKeyword_2_4());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeclarationAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalNpl.g:269:4: ({...}? => ( ({...}? => (otherlv_16= 'date' ( (lv_date_17_0= ruleDate ) ) ) ) ) )
            	    {
            	    // InternalNpl.g:269:4: ({...}? => ( ({...}? => (otherlv_16= 'date' ( (lv_date_17_0= ruleDate ) ) ) ) ) )
            	    // InternalNpl.g:270:5: {...}? => ( ({...}? => (otherlv_16= 'date' ( (lv_date_17_0= ruleDate ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalNpl.g:270:106: ( ({...}? => (otherlv_16= 'date' ( (lv_date_17_0= ruleDate ) ) ) ) )
            	    // InternalNpl.g:271:6: ({...}? => (otherlv_16= 'date' ( (lv_date_17_0= ruleDate ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3);
            	    	 				
            	    // InternalNpl.g:274:6: ({...}? => (otherlv_16= 'date' ( (lv_date_17_0= ruleDate ) ) ) )
            	    // InternalNpl.g:274:7: {...}? => (otherlv_16= 'date' ( (lv_date_17_0= ruleDate ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "true");
            	    }
            	    // InternalNpl.g:274:16: (otherlv_16= 'date' ( (lv_date_17_0= ruleDate ) ) )
            	    // InternalNpl.g:274:18: otherlv_16= 'date' ( (lv_date_17_0= ruleDate ) )
            	    {
            	    otherlv_16=(Token)match(input,18,FOLLOW_4); 

            	        	newLeafNode(otherlv_16, grammarAccess.getDeclarationAccess().getDateKeyword_3_0());
            	        
            	    // InternalNpl.g:278:1: ( (lv_date_17_0= ruleDate ) )
            	    // InternalNpl.g:279:1: (lv_date_17_0= ruleDate )
            	    {
            	    // InternalNpl.g:279:1: (lv_date_17_0= ruleDate )
            	    // InternalNpl.g:280:3: lv_date_17_0= ruleDate
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclarationAccess().getDateDateParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_5);
            	    lv_date_17_0=ruleDate();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"date",
            	            		lv_date_17_0, 
            	            		"de.tu_bs.cs.isf.mbse.mbtimes.Npl.Date");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeclarationAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalNpl.g:303:4: ({...}? => ( ({...}? => (otherlv_18= 'location' ( (lv_location_19_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalNpl.g:303:4: ({...}? => ( ({...}? => (otherlv_18= 'location' ( (lv_location_19_0= RULE_STRING ) ) ) ) ) )
            	    // InternalNpl.g:304:5: {...}? => ( ({...}? => (otherlv_18= 'location' ( (lv_location_19_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalNpl.g:304:106: ( ({...}? => (otherlv_18= 'location' ( (lv_location_19_0= RULE_STRING ) ) ) ) )
            	    // InternalNpl.g:305:6: ({...}? => (otherlv_18= 'location' ( (lv_location_19_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4);
            	    	 				
            	    // InternalNpl.g:308:6: ({...}? => (otherlv_18= 'location' ( (lv_location_19_0= RULE_STRING ) ) ) )
            	    // InternalNpl.g:308:7: {...}? => (otherlv_18= 'location' ( (lv_location_19_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "true");
            	    }
            	    // InternalNpl.g:308:16: (otherlv_18= 'location' ( (lv_location_19_0= RULE_STRING ) ) )
            	    // InternalNpl.g:308:18: otherlv_18= 'location' ( (lv_location_19_0= RULE_STRING ) )
            	    {
            	    otherlv_18=(Token)match(input,19,FOLLOW_6); 

            	        	newLeafNode(otherlv_18, grammarAccess.getDeclarationAccess().getLocationKeyword_4_0());
            	        
            	    // InternalNpl.g:312:1: ( (lv_location_19_0= RULE_STRING ) )
            	    // InternalNpl.g:313:1: (lv_location_19_0= RULE_STRING )
            	    {
            	    // InternalNpl.g:313:1: (lv_location_19_0= RULE_STRING )
            	    // InternalNpl.g:314:3: lv_location_19_0= RULE_STRING
            	    {
            	    lv_location_19_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            	    			newLeafNode(lv_location_19_0, grammarAccess.getDeclarationAccess().getLocationSTRINGTerminalRuleCall_4_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDeclarationRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"location",
            	            		lv_location_19_0, 
            	            		"org.eclipse.xtext.common.Terminals.STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeclarationAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalNpl.g:337:4: ({...}? => ( ({...}? => (otherlv_20= 'price' ( (lv_price_21_0= rulePrice ) ) ) ) ) )
            	    {
            	    // InternalNpl.g:337:4: ({...}? => ( ({...}? => (otherlv_20= 'price' ( (lv_price_21_0= rulePrice ) ) ) ) ) )
            	    // InternalNpl.g:338:5: {...}? => ( ({...}? => (otherlv_20= 'price' ( (lv_price_21_0= rulePrice ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalNpl.g:338:106: ( ({...}? => (otherlv_20= 'price' ( (lv_price_21_0= rulePrice ) ) ) ) )
            	    // InternalNpl.g:339:6: ({...}? => (otherlv_20= 'price' ( (lv_price_21_0= rulePrice ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5);
            	    	 				
            	    // InternalNpl.g:342:6: ({...}? => (otherlv_20= 'price' ( (lv_price_21_0= rulePrice ) ) ) )
            	    // InternalNpl.g:342:7: {...}? => (otherlv_20= 'price' ( (lv_price_21_0= rulePrice ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "true");
            	    }
            	    // InternalNpl.g:342:16: (otherlv_20= 'price' ( (lv_price_21_0= rulePrice ) ) )
            	    // InternalNpl.g:342:18: otherlv_20= 'price' ( (lv_price_21_0= rulePrice ) )
            	    {
            	    otherlv_20=(Token)match(input,20,FOLLOW_4); 

            	        	newLeafNode(otherlv_20, grammarAccess.getDeclarationAccess().getPriceKeyword_5_0());
            	        
            	    // InternalNpl.g:346:1: ( (lv_price_21_0= rulePrice ) )
            	    // InternalNpl.g:347:1: (lv_price_21_0= rulePrice )
            	    {
            	    // InternalNpl.g:347:1: (lv_price_21_0= rulePrice )
            	    // InternalNpl.g:348:3: lv_price_21_0= rulePrice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclarationAccess().getPricePriceParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_5);
            	    lv_price_21_0=rulePrice();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"price",
            	            		lv_price_21_0, 
            	            		"de.tu_bs.cs.isf.mbse.mbtimes.Npl.Price");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeclarationAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalNpl.g:371:4: ({...}? => ( ({...}? => (otherlv_22= 'volume' ( (lv_volume_23_0= RULE_INT ) ) (otherlv_24= 'no.' ( (lv_number_25_0= RULE_INT ) ) )? ) ) ) )
            	    {
            	    // InternalNpl.g:371:4: ({...}? => ( ({...}? => (otherlv_22= 'volume' ( (lv_volume_23_0= RULE_INT ) ) (otherlv_24= 'no.' ( (lv_number_25_0= RULE_INT ) ) )? ) ) ) )
            	    // InternalNpl.g:372:5: {...}? => ( ({...}? => (otherlv_22= 'volume' ( (lv_volume_23_0= RULE_INT ) ) (otherlv_24= 'no.' ( (lv_number_25_0= RULE_INT ) ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalNpl.g:372:106: ( ({...}? => (otherlv_22= 'volume' ( (lv_volume_23_0= RULE_INT ) ) (otherlv_24= 'no.' ( (lv_number_25_0= RULE_INT ) ) )? ) ) )
            	    // InternalNpl.g:373:6: ({...}? => (otherlv_22= 'volume' ( (lv_volume_23_0= RULE_INT ) ) (otherlv_24= 'no.' ( (lv_number_25_0= RULE_INT ) ) )? ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6);
            	    	 				
            	    // InternalNpl.g:376:6: ({...}? => (otherlv_22= 'volume' ( (lv_volume_23_0= RULE_INT ) ) (otherlv_24= 'no.' ( (lv_number_25_0= RULE_INT ) ) )? ) )
            	    // InternalNpl.g:376:7: {...}? => (otherlv_22= 'volume' ( (lv_volume_23_0= RULE_INT ) ) (otherlv_24= 'no.' ( (lv_number_25_0= RULE_INT ) ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "true");
            	    }
            	    // InternalNpl.g:376:16: (otherlv_22= 'volume' ( (lv_volume_23_0= RULE_INT ) ) (otherlv_24= 'no.' ( (lv_number_25_0= RULE_INT ) ) )? )
            	    // InternalNpl.g:376:18: otherlv_22= 'volume' ( (lv_volume_23_0= RULE_INT ) ) (otherlv_24= 'no.' ( (lv_number_25_0= RULE_INT ) ) )?
            	    {
            	    otherlv_22=(Token)match(input,21,FOLLOW_12); 

            	        	newLeafNode(otherlv_22, grammarAccess.getDeclarationAccess().getVolumeKeyword_6_0());
            	        
            	    // InternalNpl.g:380:1: ( (lv_volume_23_0= RULE_INT ) )
            	    // InternalNpl.g:381:1: (lv_volume_23_0= RULE_INT )
            	    {
            	    // InternalNpl.g:381:1: (lv_volume_23_0= RULE_INT )
            	    // InternalNpl.g:382:3: lv_volume_23_0= RULE_INT
            	    {
            	    lv_volume_23_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            	    			newLeafNode(lv_volume_23_0, grammarAccess.getDeclarationAccess().getVolumeINTTerminalRuleCall_6_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDeclarationRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"volume",
            	            		lv_volume_23_0, 
            	            		"org.eclipse.xtext.common.Terminals.INT");
            	    	    

            	    }


            	    }

            	    // InternalNpl.g:398:2: (otherlv_24= 'no.' ( (lv_number_25_0= RULE_INT ) ) )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==22) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalNpl.g:398:4: otherlv_24= 'no.' ( (lv_number_25_0= RULE_INT ) )
            	            {
            	            otherlv_24=(Token)match(input,22,FOLLOW_12); 

            	                	newLeafNode(otherlv_24, grammarAccess.getDeclarationAccess().getNoKeyword_6_2_0());
            	                
            	            // InternalNpl.g:402:1: ( (lv_number_25_0= RULE_INT ) )
            	            // InternalNpl.g:403:1: (lv_number_25_0= RULE_INT )
            	            {
            	            // InternalNpl.g:403:1: (lv_number_25_0= RULE_INT )
            	            // InternalNpl.g:404:3: lv_number_25_0= RULE_INT
            	            {
            	            lv_number_25_0=(Token)match(input,RULE_INT,FOLLOW_5); 

            	            			newLeafNode(lv_number_25_0, grammarAccess.getDeclarationAccess().getNumberINTTerminalRuleCall_6_2_1_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getDeclarationRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"number",
            	                    		lv_number_25_0, 
            	                    		"org.eclipse.xtext.common.Terminals.INT");
            	            	    

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeclarationAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalNpl.g:427:4: ({...}? => ( ({...}? => (otherlv_26= 'language' ( (lv_language_27_0= ruleLanguage ) ) ) ) ) )
            	    {
            	    // InternalNpl.g:427:4: ({...}? => ( ({...}? => (otherlv_26= 'language' ( (lv_language_27_0= ruleLanguage ) ) ) ) ) )
            	    // InternalNpl.g:428:5: {...}? => ( ({...}? => (otherlv_26= 'language' ( (lv_language_27_0= ruleLanguage ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7)");
            	    }
            	    // InternalNpl.g:428:106: ( ({...}? => (otherlv_26= 'language' ( (lv_language_27_0= ruleLanguage ) ) ) ) )
            	    // InternalNpl.g:429:6: ({...}? => (otherlv_26= 'language' ( (lv_language_27_0= ruleLanguage ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7);
            	    	 				
            	    // InternalNpl.g:432:6: ({...}? => (otherlv_26= 'language' ( (lv_language_27_0= ruleLanguage ) ) ) )
            	    // InternalNpl.g:432:7: {...}? => (otherlv_26= 'language' ( (lv_language_27_0= ruleLanguage ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "true");
            	    }
            	    // InternalNpl.g:432:16: (otherlv_26= 'language' ( (lv_language_27_0= ruleLanguage ) ) )
            	    // InternalNpl.g:432:18: otherlv_26= 'language' ( (lv_language_27_0= ruleLanguage ) )
            	    {
            	    otherlv_26=(Token)match(input,23,FOLLOW_14); 

            	        	newLeafNode(otherlv_26, grammarAccess.getDeclarationAccess().getLanguageKeyword_7_0());
            	        
            	    // InternalNpl.g:436:1: ( (lv_language_27_0= ruleLanguage ) )
            	    // InternalNpl.g:437:1: (lv_language_27_0= ruleLanguage )
            	    {
            	    // InternalNpl.g:437:1: (lv_language_27_0= ruleLanguage )
            	    // InternalNpl.g:438:3: lv_language_27_0= ruleLanguage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclarationAccess().getLanguageLanguageParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_5);
            	    lv_language_27_0=ruleLanguage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"language",
            	            		lv_language_27_0, 
            	            		"de.tu_bs.cs.isf.mbse.mbtimes.Npl.Language");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeclarationAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalNpl.g:461:4: ({...}? => ( ({...}? => (otherlv_28= 'format' ( (lv_format_29_0= ruleFormat ) ) ) ) ) )
            	    {
            	    // InternalNpl.g:461:4: ({...}? => ( ({...}? => (otherlv_28= 'format' ( (lv_format_29_0= ruleFormat ) ) ) ) ) )
            	    // InternalNpl.g:462:5: {...}? => ( ({...}? => (otherlv_28= 'format' ( (lv_format_29_0= ruleFormat ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8)");
            	    }
            	    // InternalNpl.g:462:106: ( ({...}? => (otherlv_28= 'format' ( (lv_format_29_0= ruleFormat ) ) ) ) )
            	    // InternalNpl.g:463:6: ({...}? => (otherlv_28= 'format' ( (lv_format_29_0= ruleFormat ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8);
            	    	 				
            	    // InternalNpl.g:466:6: ({...}? => (otherlv_28= 'format' ( (lv_format_29_0= ruleFormat ) ) ) )
            	    // InternalNpl.g:466:7: {...}? => (otherlv_28= 'format' ( (lv_format_29_0= ruleFormat ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "true");
            	    }
            	    // InternalNpl.g:466:16: (otherlv_28= 'format' ( (lv_format_29_0= ruleFormat ) ) )
            	    // InternalNpl.g:466:18: otherlv_28= 'format' ( (lv_format_29_0= ruleFormat ) )
            	    {
            	    otherlv_28=(Token)match(input,24,FOLLOW_15); 

            	        	newLeafNode(otherlv_28, grammarAccess.getDeclarationAccess().getFormatKeyword_8_0());
            	        
            	    // InternalNpl.g:470:1: ( (lv_format_29_0= ruleFormat ) )
            	    // InternalNpl.g:471:1: (lv_format_29_0= ruleFormat )
            	    {
            	    // InternalNpl.g:471:1: (lv_format_29_0= ruleFormat )
            	    // InternalNpl.g:472:3: lv_format_29_0= ruleFormat
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclarationAccess().getFormatFormatParserRuleCall_8_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_5);
            	    lv_format_29_0=ruleFormat();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"format",
            	            		lv_format_29_0, 
            	            		"de.tu_bs.cs.isf.mbse.mbtimes.Npl.Format");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeclarationAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalNpl.g:495:4: ({...}? => ( ({...}? => (otherlv_30= 'number of articles per topic' ( (lv_articleCnt_31_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalNpl.g:495:4: ({...}? => ( ({...}? => (otherlv_30= 'number of articles per topic' ( (lv_articleCnt_31_0= RULE_INT ) ) ) ) ) )
            	    // InternalNpl.g:496:5: {...}? => ( ({...}? => (otherlv_30= 'number of articles per topic' ( (lv_articleCnt_31_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9)");
            	    }
            	    // InternalNpl.g:496:106: ( ({...}? => (otherlv_30= 'number of articles per topic' ( (lv_articleCnt_31_0= RULE_INT ) ) ) ) )
            	    // InternalNpl.g:497:6: ({...}? => (otherlv_30= 'number of articles per topic' ( (lv_articleCnt_31_0= RULE_INT ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9);
            	    	 				
            	    // InternalNpl.g:500:6: ({...}? => (otherlv_30= 'number of articles per topic' ( (lv_articleCnt_31_0= RULE_INT ) ) ) )
            	    // InternalNpl.g:500:7: {...}? => (otherlv_30= 'number of articles per topic' ( (lv_articleCnt_31_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "true");
            	    }
            	    // InternalNpl.g:500:16: (otherlv_30= 'number of articles per topic' ( (lv_articleCnt_31_0= RULE_INT ) ) )
            	    // InternalNpl.g:500:18: otherlv_30= 'number of articles per topic' ( (lv_articleCnt_31_0= RULE_INT ) )
            	    {
            	    otherlv_30=(Token)match(input,25,FOLLOW_12); 

            	        	newLeafNode(otherlv_30, grammarAccess.getDeclarationAccess().getNumberOfArticlesPerTopicKeyword_9_0());
            	        
            	    // InternalNpl.g:504:1: ( (lv_articleCnt_31_0= RULE_INT ) )
            	    // InternalNpl.g:505:1: (lv_articleCnt_31_0= RULE_INT )
            	    {
            	    // InternalNpl.g:505:1: (lv_articleCnt_31_0= RULE_INT )
            	    // InternalNpl.g:506:3: lv_articleCnt_31_0= RULE_INT
            	    {
            	    lv_articleCnt_31_0=(Token)match(input,RULE_INT,FOLLOW_5); 

            	    			newLeafNode(lv_articleCnt_31_0, grammarAccess.getDeclarationAccess().getArticleCntINTTerminalRuleCall_9_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDeclarationRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"articleCnt",
            	            		lv_articleCnt_31_0, 
            	            		"org.eclipse.xtext.common.Terminals.INT");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeclarationAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // InternalNpl.g:529:4: ({...}? => ( ({...}? => (otherlv_32= 'number of words per article' ( (lv_articleWordsMin_33_0= RULE_INT ) ) otherlv_34= '-' ( (lv_articleWordsMax_35_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalNpl.g:529:4: ({...}? => ( ({...}? => (otherlv_32= 'number of words per article' ( (lv_articleWordsMin_33_0= RULE_INT ) ) otherlv_34= '-' ( (lv_articleWordsMax_35_0= RULE_INT ) ) ) ) ) )
            	    // InternalNpl.g:530:5: {...}? => ( ({...}? => (otherlv_32= 'number of words per article' ( (lv_articleWordsMin_33_0= RULE_INT ) ) otherlv_34= '-' ( (lv_articleWordsMax_35_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10)");
            	    }
            	    // InternalNpl.g:530:107: ( ({...}? => (otherlv_32= 'number of words per article' ( (lv_articleWordsMin_33_0= RULE_INT ) ) otherlv_34= '-' ( (lv_articleWordsMax_35_0= RULE_INT ) ) ) ) )
            	    // InternalNpl.g:531:6: ({...}? => (otherlv_32= 'number of words per article' ( (lv_articleWordsMin_33_0= RULE_INT ) ) otherlv_34= '-' ( (lv_articleWordsMax_35_0= RULE_INT ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10);
            	    	 				
            	    // InternalNpl.g:534:6: ({...}? => (otherlv_32= 'number of words per article' ( (lv_articleWordsMin_33_0= RULE_INT ) ) otherlv_34= '-' ( (lv_articleWordsMax_35_0= RULE_INT ) ) ) )
            	    // InternalNpl.g:534:7: {...}? => (otherlv_32= 'number of words per article' ( (lv_articleWordsMin_33_0= RULE_INT ) ) otherlv_34= '-' ( (lv_articleWordsMax_35_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "true");
            	    }
            	    // InternalNpl.g:534:16: (otherlv_32= 'number of words per article' ( (lv_articleWordsMin_33_0= RULE_INT ) ) otherlv_34= '-' ( (lv_articleWordsMax_35_0= RULE_INT ) ) )
            	    // InternalNpl.g:534:18: otherlv_32= 'number of words per article' ( (lv_articleWordsMin_33_0= RULE_INT ) ) otherlv_34= '-' ( (lv_articleWordsMax_35_0= RULE_INT ) )
            	    {
            	    otherlv_32=(Token)match(input,26,FOLLOW_12); 

            	        	newLeafNode(otherlv_32, grammarAccess.getDeclarationAccess().getNumberOfWordsPerArticleKeyword_10_0());
            	        
            	    // InternalNpl.g:538:1: ( (lv_articleWordsMin_33_0= RULE_INT ) )
            	    // InternalNpl.g:539:1: (lv_articleWordsMin_33_0= RULE_INT )
            	    {
            	    // InternalNpl.g:539:1: (lv_articleWordsMin_33_0= RULE_INT )
            	    // InternalNpl.g:540:3: lv_articleWordsMin_33_0= RULE_INT
            	    {
            	    lv_articleWordsMin_33_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            	    			newLeafNode(lv_articleWordsMin_33_0, grammarAccess.getDeclarationAccess().getArticleWordsMinINTTerminalRuleCall_10_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDeclarationRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"articleWordsMin",
            	            		lv_articleWordsMin_33_0, 
            	            		"org.eclipse.xtext.common.Terminals.INT");
            	    	    

            	    }


            	    }

            	    otherlv_34=(Token)match(input,27,FOLLOW_12); 

            	        	newLeafNode(otherlv_34, grammarAccess.getDeclarationAccess().getHyphenMinusKeyword_10_2());
            	        
            	    // InternalNpl.g:560:1: ( (lv_articleWordsMax_35_0= RULE_INT ) )
            	    // InternalNpl.g:561:1: (lv_articleWordsMax_35_0= RULE_INT )
            	    {
            	    // InternalNpl.g:561:1: (lv_articleWordsMax_35_0= RULE_INT )
            	    // InternalNpl.g:562:3: lv_articleWordsMax_35_0= RULE_INT
            	    {
            	    lv_articleWordsMax_35_0=(Token)match(input,RULE_INT,FOLLOW_5); 

            	    			newLeafNode(lv_articleWordsMax_35_0, grammarAccess.getDeclarationAccess().getArticleWordsMaxINTTerminalRuleCall_10_3_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDeclarationRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"articleWordsMax",
            	            		lv_articleWordsMax_35_0, 
            	            		"org.eclipse.xtext.common.Terminals.INT");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeclarationAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // InternalNpl.g:585:4: ({...}? => ( ({...}? => (otherlv_36= 'number of images per article' ( (lv_imagesCnt_37_0= ruleImagesCount ) ) ) ) ) )
            	    {
            	    // InternalNpl.g:585:4: ({...}? => ( ({...}? => (otherlv_36= 'number of images per article' ( (lv_imagesCnt_37_0= ruleImagesCount ) ) ) ) ) )
            	    // InternalNpl.g:586:5: {...}? => ( ({...}? => (otherlv_36= 'number of images per article' ( (lv_imagesCnt_37_0= ruleImagesCount ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11)");
            	    }
            	    // InternalNpl.g:586:107: ( ({...}? => (otherlv_36= 'number of images per article' ( (lv_imagesCnt_37_0= ruleImagesCount ) ) ) ) )
            	    // InternalNpl.g:587:6: ({...}? => (otherlv_36= 'number of images per article' ( (lv_imagesCnt_37_0= ruleImagesCount ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11);
            	    	 				
            	    // InternalNpl.g:590:6: ({...}? => (otherlv_36= 'number of images per article' ( (lv_imagesCnt_37_0= ruleImagesCount ) ) ) )
            	    // InternalNpl.g:590:7: {...}? => (otherlv_36= 'number of images per article' ( (lv_imagesCnt_37_0= ruleImagesCount ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "true");
            	    }
            	    // InternalNpl.g:590:16: (otherlv_36= 'number of images per article' ( (lv_imagesCnt_37_0= ruleImagesCount ) ) )
            	    // InternalNpl.g:590:18: otherlv_36= 'number of images per article' ( (lv_imagesCnt_37_0= ruleImagesCount ) )
            	    {
            	    otherlv_36=(Token)match(input,28,FOLLOW_12); 

            	        	newLeafNode(otherlv_36, grammarAccess.getDeclarationAccess().getNumberOfImagesPerArticleKeyword_11_0());
            	        
            	    // InternalNpl.g:594:1: ( (lv_imagesCnt_37_0= ruleImagesCount ) )
            	    // InternalNpl.g:595:1: (lv_imagesCnt_37_0= ruleImagesCount )
            	    {
            	    // InternalNpl.g:595:1: (lv_imagesCnt_37_0= ruleImagesCount )
            	    // InternalNpl.g:596:3: lv_imagesCnt_37_0= ruleImagesCount
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclarationAccess().getImagesCntImagesCountParserRuleCall_11_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_5);
            	    lv_imagesCnt_37_0=ruleImagesCount();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"imagesCnt",
            	            		lv_imagesCnt_37_0, 
            	            		"de.tu_bs.cs.isf.mbse.mbtimes.Npl.ImagesCount");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeclarationAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 13 :
            	    // InternalNpl.g:619:4: ({...}? => ( ({...}? => (otherlv_38= 'number of columns' ( (lv_columnsCnt_39_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalNpl.g:619:4: ({...}? => ( ({...}? => (otherlv_38= 'number of columns' ( (lv_columnsCnt_39_0= RULE_INT ) ) ) ) ) )
            	    // InternalNpl.g:620:5: {...}? => ( ({...}? => (otherlv_38= 'number of columns' ( (lv_columnsCnt_39_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12)");
            	    }
            	    // InternalNpl.g:620:107: ( ({...}? => (otherlv_38= 'number of columns' ( (lv_columnsCnt_39_0= RULE_INT ) ) ) ) )
            	    // InternalNpl.g:621:6: ({...}? => (otherlv_38= 'number of columns' ( (lv_columnsCnt_39_0= RULE_INT ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12);
            	    	 				
            	    // InternalNpl.g:624:6: ({...}? => (otherlv_38= 'number of columns' ( (lv_columnsCnt_39_0= RULE_INT ) ) ) )
            	    // InternalNpl.g:624:7: {...}? => (otherlv_38= 'number of columns' ( (lv_columnsCnt_39_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "true");
            	    }
            	    // InternalNpl.g:624:16: (otherlv_38= 'number of columns' ( (lv_columnsCnt_39_0= RULE_INT ) ) )
            	    // InternalNpl.g:624:18: otherlv_38= 'number of columns' ( (lv_columnsCnt_39_0= RULE_INT ) )
            	    {
            	    otherlv_38=(Token)match(input,29,FOLLOW_12); 

            	        	newLeafNode(otherlv_38, grammarAccess.getDeclarationAccess().getNumberOfColumnsKeyword_12_0());
            	        
            	    // InternalNpl.g:628:1: ( (lv_columnsCnt_39_0= RULE_INT ) )
            	    // InternalNpl.g:629:1: (lv_columnsCnt_39_0= RULE_INT )
            	    {
            	    // InternalNpl.g:629:1: (lv_columnsCnt_39_0= RULE_INT )
            	    // InternalNpl.g:630:3: lv_columnsCnt_39_0= RULE_INT
            	    {
            	    lv_columnsCnt_39_0=(Token)match(input,RULE_INT,FOLLOW_5); 

            	    			newLeafNode(lv_columnsCnt_39_0, grammarAccess.getDeclarationAccess().getColumnsCntINTTerminalRuleCall_12_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDeclarationRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"columnsCnt",
            	            		lv_columnsCnt_39_0, 
            	            		"org.eclipse.xtext.common.Terminals.INT");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeclarationAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 14 :
            	    // InternalNpl.g:653:4: ({...}? => ( ({...}? => (otherlv_40= 'font size' ( (lv_fontSize_41_0= ruleFontSize ) ) ) ) ) )
            	    {
            	    // InternalNpl.g:653:4: ({...}? => ( ({...}? => (otherlv_40= 'font size' ( (lv_fontSize_41_0= ruleFontSize ) ) ) ) ) )
            	    // InternalNpl.g:654:5: {...}? => ( ({...}? => (otherlv_40= 'font size' ( (lv_fontSize_41_0= ruleFontSize ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13)");
            	    }
            	    // InternalNpl.g:654:107: ( ({...}? => (otherlv_40= 'font size' ( (lv_fontSize_41_0= ruleFontSize ) ) ) ) )
            	    // InternalNpl.g:655:6: ({...}? => (otherlv_40= 'font size' ( (lv_fontSize_41_0= ruleFontSize ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13);
            	    	 				
            	    // InternalNpl.g:658:6: ({...}? => (otherlv_40= 'font size' ( (lv_fontSize_41_0= ruleFontSize ) ) ) )
            	    // InternalNpl.g:658:7: {...}? => (otherlv_40= 'font size' ( (lv_fontSize_41_0= ruleFontSize ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "true");
            	    }
            	    // InternalNpl.g:658:16: (otherlv_40= 'font size' ( (lv_fontSize_41_0= ruleFontSize ) ) )
            	    // InternalNpl.g:658:18: otherlv_40= 'font size' ( (lv_fontSize_41_0= ruleFontSize ) )
            	    {
            	    otherlv_40=(Token)match(input,30,FOLLOW_17); 

            	        	newLeafNode(otherlv_40, grammarAccess.getDeclarationAccess().getFontSizeKeyword_13_0());
            	        
            	    // InternalNpl.g:662:1: ( (lv_fontSize_41_0= ruleFontSize ) )
            	    // InternalNpl.g:663:1: (lv_fontSize_41_0= ruleFontSize )
            	    {
            	    // InternalNpl.g:663:1: (lv_fontSize_41_0= ruleFontSize )
            	    // InternalNpl.g:664:3: lv_fontSize_41_0= ruleFontSize
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclarationAccess().getFontSizeFontSizeParserRuleCall_13_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_5);
            	    lv_fontSize_41_0=ruleFontSize();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"fontSize",
            	            		lv_fontSize_41_0, 
            	            		"de.tu_bs.cs.isf.mbse.mbtimes.Npl.FontSize");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeclarationAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 15 :
            	    // InternalNpl.g:687:4: ({...}? => ( ({...}? => (otherlv_42= '}' ) ) ) )
            	    {
            	    // InternalNpl.g:687:4: ({...}? => ( ({...}? => (otherlv_42= '}' ) ) ) )
            	    // InternalNpl.g:688:5: {...}? => ( ({...}? => (otherlv_42= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14)");
            	    }
            	    // InternalNpl.g:688:107: ( ({...}? => (otherlv_42= '}' ) ) )
            	    // InternalNpl.g:689:6: ({...}? => (otherlv_42= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14);
            	    	 				
            	    // InternalNpl.g:692:6: ({...}? => (otherlv_42= '}' ) )
            	    // InternalNpl.g:692:7: {...}? => (otherlv_42= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "true");
            	    }
            	    // InternalNpl.g:692:16: (otherlv_42= '}' )
            	    // InternalNpl.g:692:18: otherlv_42= '}'
            	    {
            	    otherlv_42=(Token)match(input,16,FOLLOW_5); 

            	        	newLeafNode(otherlv_42, grammarAccess.getDeclarationAccess().getRightCurlyBracketKeyword_14());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeclarationAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getDeclarationAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleDeclaration", "getUnorderedGroupHelper().canLeave(grammarAccess.getDeclarationAccess().getUnorderedGroup())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getDeclarationAccess().getUnorderedGroup());
            	

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
    // InternalNpl.g:719:1: entryRuleImagesCount returns [EObject current=null] : iv_ruleImagesCount= ruleImagesCount EOF ;
    public final EObject entryRuleImagesCount() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImagesCount = null;


        try {
            // InternalNpl.g:720:2: (iv_ruleImagesCount= ruleImagesCount EOF )
            // InternalNpl.g:721:2: iv_ruleImagesCount= ruleImagesCount EOF
            {
             newCompositeNode(grammarAccess.getImagesCountRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImagesCount=ruleImagesCount();

            state._fsp--;

             current =iv_ruleImagesCount; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalNpl.g:728:1: ruleImagesCount returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleImagesCount() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalNpl.g:731:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalNpl.g:732:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalNpl.g:732:1: ( (lv_value_0_0= RULE_INT ) )
            // InternalNpl.g:733:1: (lv_value_0_0= RULE_INT )
            {
            // InternalNpl.g:733:1: (lv_value_0_0= RULE_INT )
            // InternalNpl.g:734:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            			newLeafNode(lv_value_0_0, grammarAccess.getImagesCountAccess().getValueINTTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImagesCountRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"org.eclipse.xtext.common.Terminals.INT");
            	    

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
    // InternalNpl.g:758:1: entryRuleFontSize returns [EObject current=null] : iv_ruleFontSize= ruleFontSize EOF ;
    public final EObject entryRuleFontSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFontSize = null;


        try {
            // InternalNpl.g:759:2: (iv_ruleFontSize= ruleFontSize EOF )
            // InternalNpl.g:760:2: iv_ruleFontSize= ruleFontSize EOF
            {
             newCompositeNode(grammarAccess.getFontSizeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFontSize=ruleFontSize();

            state._fsp--;

             current =iv_ruleFontSize; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalNpl.g:767:1: ruleFontSize returns [EObject current=null] : ( ( (lv_value_0_0= 'small' ) ) | ( (lv_value_1_0= 'medium' ) ) | ( (lv_value_2_0= 'large' ) ) ) ;
    public final EObject ruleFontSize() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_value_1_0=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // InternalNpl.g:770:28: ( ( ( (lv_value_0_0= 'small' ) ) | ( (lv_value_1_0= 'medium' ) ) | ( (lv_value_2_0= 'large' ) ) ) )
            // InternalNpl.g:771:1: ( ( (lv_value_0_0= 'small' ) ) | ( (lv_value_1_0= 'medium' ) ) | ( (lv_value_2_0= 'large' ) ) )
            {
            // InternalNpl.g:771:1: ( ( (lv_value_0_0= 'small' ) ) | ( (lv_value_1_0= 'medium' ) ) | ( (lv_value_2_0= 'large' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt5=1;
                }
                break;
            case 32:
                {
                alt5=2;
                }
                break;
            case 33:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalNpl.g:771:2: ( (lv_value_0_0= 'small' ) )
                    {
                    // InternalNpl.g:771:2: ( (lv_value_0_0= 'small' ) )
                    // InternalNpl.g:772:1: (lv_value_0_0= 'small' )
                    {
                    // InternalNpl.g:772:1: (lv_value_0_0= 'small' )
                    // InternalNpl.g:773:3: lv_value_0_0= 'small'
                    {
                    lv_value_0_0=(Token)match(input,31,FOLLOW_2); 

                            newLeafNode(lv_value_0_0, grammarAccess.getFontSizeAccess().getValueSmallKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFontSizeRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_0, "small");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalNpl.g:787:6: ( (lv_value_1_0= 'medium' ) )
                    {
                    // InternalNpl.g:787:6: ( (lv_value_1_0= 'medium' ) )
                    // InternalNpl.g:788:1: (lv_value_1_0= 'medium' )
                    {
                    // InternalNpl.g:788:1: (lv_value_1_0= 'medium' )
                    // InternalNpl.g:789:3: lv_value_1_0= 'medium'
                    {
                    lv_value_1_0=(Token)match(input,32,FOLLOW_2); 

                            newLeafNode(lv_value_1_0, grammarAccess.getFontSizeAccess().getValueMediumKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFontSizeRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_1_0, "medium");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalNpl.g:803:6: ( (lv_value_2_0= 'large' ) )
                    {
                    // InternalNpl.g:803:6: ( (lv_value_2_0= 'large' ) )
                    // InternalNpl.g:804:1: (lv_value_2_0= 'large' )
                    {
                    // InternalNpl.g:804:1: (lv_value_2_0= 'large' )
                    // InternalNpl.g:805:3: lv_value_2_0= 'large'
                    {
                    lv_value_2_0=(Token)match(input,33,FOLLOW_2); 

                            newLeafNode(lv_value_2_0, grammarAccess.getFontSizeAccess().getValueLargeKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFontSizeRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_0, "large");
                    	    

                    }


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
    // InternalNpl.g:826:1: entryRuleFormat returns [EObject current=null] : iv_ruleFormat= ruleFormat EOF ;
    public final EObject entryRuleFormat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormat = null;


        try {
            // InternalNpl.g:827:2: (iv_ruleFormat= ruleFormat EOF )
            // InternalNpl.g:828:2: iv_ruleFormat= ruleFormat EOF
            {
             newCompositeNode(grammarAccess.getFormatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormat=ruleFormat();

            state._fsp--;

             current =iv_ruleFormat; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalNpl.g:835:1: ruleFormat returns [EObject current=null] : ( ( (lv_value_0_0= 'DIN A6' ) ) | ( (lv_value_1_0= 'DIN A5' ) ) | ( (lv_value_2_0= 'DIN A4' ) ) | ( (lv_value_3_0= 'DIN A3' ) ) | ( (lv_value_4_0= 'DIN A2' ) ) | ( (lv_value_5_0= 'DIN A1' ) ) | ( (lv_value_6_0= 'DIN A0' ) ) ) ;
    public final EObject ruleFormat() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_value_1_0=null;
        Token lv_value_2_0=null;
        Token lv_value_3_0=null;
        Token lv_value_4_0=null;
        Token lv_value_5_0=null;
        Token lv_value_6_0=null;

         enterRule(); 
            
        try {
            // InternalNpl.g:838:28: ( ( ( (lv_value_0_0= 'DIN A6' ) ) | ( (lv_value_1_0= 'DIN A5' ) ) | ( (lv_value_2_0= 'DIN A4' ) ) | ( (lv_value_3_0= 'DIN A3' ) ) | ( (lv_value_4_0= 'DIN A2' ) ) | ( (lv_value_5_0= 'DIN A1' ) ) | ( (lv_value_6_0= 'DIN A0' ) ) ) )
            // InternalNpl.g:839:1: ( ( (lv_value_0_0= 'DIN A6' ) ) | ( (lv_value_1_0= 'DIN A5' ) ) | ( (lv_value_2_0= 'DIN A4' ) ) | ( (lv_value_3_0= 'DIN A3' ) ) | ( (lv_value_4_0= 'DIN A2' ) ) | ( (lv_value_5_0= 'DIN A1' ) ) | ( (lv_value_6_0= 'DIN A0' ) ) )
            {
            // InternalNpl.g:839:1: ( ( (lv_value_0_0= 'DIN A6' ) ) | ( (lv_value_1_0= 'DIN A5' ) ) | ( (lv_value_2_0= 'DIN A4' ) ) | ( (lv_value_3_0= 'DIN A3' ) ) | ( (lv_value_4_0= 'DIN A2' ) ) | ( (lv_value_5_0= 'DIN A1' ) ) | ( (lv_value_6_0= 'DIN A0' ) ) )
            int alt6=7;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt6=1;
                }
                break;
            case 35:
                {
                alt6=2;
                }
                break;
            case 36:
                {
                alt6=3;
                }
                break;
            case 37:
                {
                alt6=4;
                }
                break;
            case 38:
                {
                alt6=5;
                }
                break;
            case 39:
                {
                alt6=6;
                }
                break;
            case 40:
                {
                alt6=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalNpl.g:839:2: ( (lv_value_0_0= 'DIN A6' ) )
                    {
                    // InternalNpl.g:839:2: ( (lv_value_0_0= 'DIN A6' ) )
                    // InternalNpl.g:840:1: (lv_value_0_0= 'DIN A6' )
                    {
                    // InternalNpl.g:840:1: (lv_value_0_0= 'DIN A6' )
                    // InternalNpl.g:841:3: lv_value_0_0= 'DIN A6'
                    {
                    lv_value_0_0=(Token)match(input,34,FOLLOW_2); 

                            newLeafNode(lv_value_0_0, grammarAccess.getFormatAccess().getValueDINA6Keyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFormatRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_0, "DIN A6");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalNpl.g:855:6: ( (lv_value_1_0= 'DIN A5' ) )
                    {
                    // InternalNpl.g:855:6: ( (lv_value_1_0= 'DIN A5' ) )
                    // InternalNpl.g:856:1: (lv_value_1_0= 'DIN A5' )
                    {
                    // InternalNpl.g:856:1: (lv_value_1_0= 'DIN A5' )
                    // InternalNpl.g:857:3: lv_value_1_0= 'DIN A5'
                    {
                    lv_value_1_0=(Token)match(input,35,FOLLOW_2); 

                            newLeafNode(lv_value_1_0, grammarAccess.getFormatAccess().getValueDINA5Keyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFormatRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_1_0, "DIN A5");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalNpl.g:871:6: ( (lv_value_2_0= 'DIN A4' ) )
                    {
                    // InternalNpl.g:871:6: ( (lv_value_2_0= 'DIN A4' ) )
                    // InternalNpl.g:872:1: (lv_value_2_0= 'DIN A4' )
                    {
                    // InternalNpl.g:872:1: (lv_value_2_0= 'DIN A4' )
                    // InternalNpl.g:873:3: lv_value_2_0= 'DIN A4'
                    {
                    lv_value_2_0=(Token)match(input,36,FOLLOW_2); 

                            newLeafNode(lv_value_2_0, grammarAccess.getFormatAccess().getValueDINA4Keyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFormatRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_0, "DIN A4");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalNpl.g:887:6: ( (lv_value_3_0= 'DIN A3' ) )
                    {
                    // InternalNpl.g:887:6: ( (lv_value_3_0= 'DIN A3' ) )
                    // InternalNpl.g:888:1: (lv_value_3_0= 'DIN A3' )
                    {
                    // InternalNpl.g:888:1: (lv_value_3_0= 'DIN A3' )
                    // InternalNpl.g:889:3: lv_value_3_0= 'DIN A3'
                    {
                    lv_value_3_0=(Token)match(input,37,FOLLOW_2); 

                            newLeafNode(lv_value_3_0, grammarAccess.getFormatAccess().getValueDINA3Keyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFormatRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_3_0, "DIN A3");
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalNpl.g:903:6: ( (lv_value_4_0= 'DIN A2' ) )
                    {
                    // InternalNpl.g:903:6: ( (lv_value_4_0= 'DIN A2' ) )
                    // InternalNpl.g:904:1: (lv_value_4_0= 'DIN A2' )
                    {
                    // InternalNpl.g:904:1: (lv_value_4_0= 'DIN A2' )
                    // InternalNpl.g:905:3: lv_value_4_0= 'DIN A2'
                    {
                    lv_value_4_0=(Token)match(input,38,FOLLOW_2); 

                            newLeafNode(lv_value_4_0, grammarAccess.getFormatAccess().getValueDINA2Keyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFormatRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_4_0, "DIN A2");
                    	    

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalNpl.g:919:6: ( (lv_value_5_0= 'DIN A1' ) )
                    {
                    // InternalNpl.g:919:6: ( (lv_value_5_0= 'DIN A1' ) )
                    // InternalNpl.g:920:1: (lv_value_5_0= 'DIN A1' )
                    {
                    // InternalNpl.g:920:1: (lv_value_5_0= 'DIN A1' )
                    // InternalNpl.g:921:3: lv_value_5_0= 'DIN A1'
                    {
                    lv_value_5_0=(Token)match(input,39,FOLLOW_2); 

                            newLeafNode(lv_value_5_0, grammarAccess.getFormatAccess().getValueDINA1Keyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFormatRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_5_0, "DIN A1");
                    	    

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalNpl.g:935:6: ( (lv_value_6_0= 'DIN A0' ) )
                    {
                    // InternalNpl.g:935:6: ( (lv_value_6_0= 'DIN A0' ) )
                    // InternalNpl.g:936:1: (lv_value_6_0= 'DIN A0' )
                    {
                    // InternalNpl.g:936:1: (lv_value_6_0= 'DIN A0' )
                    // InternalNpl.g:937:3: lv_value_6_0= 'DIN A0'
                    {
                    lv_value_6_0=(Token)match(input,40,FOLLOW_2); 

                            newLeafNode(lv_value_6_0, grammarAccess.getFormatAccess().getValueDINA0Keyword_6_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFormatRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_6_0, "DIN A0");
                    	    

                    }


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
    // InternalNpl.g:958:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // InternalNpl.g:959:2: (iv_ruleDate= ruleDate EOF )
            // InternalNpl.g:960:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalNpl.g:967:1: ruleDate returns [EObject current=null] : (otherlv_0= '{' ( (lv_day_1_0= RULE_INT ) ) otherlv_2= '-' ( (lv_month_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_year_5_0= RULE_INT ) ) otherlv_6= '}' ) ;
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
            // InternalNpl.g:970:28: ( (otherlv_0= '{' ( (lv_day_1_0= RULE_INT ) ) otherlv_2= '-' ( (lv_month_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_year_5_0= RULE_INT ) ) otherlv_6= '}' ) )
            // InternalNpl.g:971:1: (otherlv_0= '{' ( (lv_day_1_0= RULE_INT ) ) otherlv_2= '-' ( (lv_month_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_year_5_0= RULE_INT ) ) otherlv_6= '}' )
            {
            // InternalNpl.g:971:1: (otherlv_0= '{' ( (lv_day_1_0= RULE_INT ) ) otherlv_2= '-' ( (lv_month_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_year_5_0= RULE_INT ) ) otherlv_6= '}' )
            // InternalNpl.g:971:3: otherlv_0= '{' ( (lv_day_1_0= RULE_INT ) ) otherlv_2= '-' ( (lv_month_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_year_5_0= RULE_INT ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_12); 

                	newLeafNode(otherlv_0, grammarAccess.getDateAccess().getLeftCurlyBracketKeyword_0());
                
            // InternalNpl.g:975:1: ( (lv_day_1_0= RULE_INT ) )
            // InternalNpl.g:976:1: (lv_day_1_0= RULE_INT )
            {
            // InternalNpl.g:976:1: (lv_day_1_0= RULE_INT )
            // InternalNpl.g:977:3: lv_day_1_0= RULE_INT
            {
            lv_day_1_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            			newLeafNode(lv_day_1_0, grammarAccess.getDateAccess().getDayINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"day",
                    		lv_day_1_0, 
                    		"org.eclipse.xtext.common.Terminals.INT");
            	    

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_12); 

                	newLeafNode(otherlv_2, grammarAccess.getDateAccess().getHyphenMinusKeyword_2());
                
            // InternalNpl.g:997:1: ( (lv_month_3_0= RULE_INT ) )
            // InternalNpl.g:998:1: (lv_month_3_0= RULE_INT )
            {
            // InternalNpl.g:998:1: (lv_month_3_0= RULE_INT )
            // InternalNpl.g:999:3: lv_month_3_0= RULE_INT
            {
            lv_month_3_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            			newLeafNode(lv_month_3_0, grammarAccess.getDateAccess().getMonthINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"month",
                    		lv_month_3_0, 
                    		"org.eclipse.xtext.common.Terminals.INT");
            	    

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_12); 

                	newLeafNode(otherlv_4, grammarAccess.getDateAccess().getHyphenMinusKeyword_4());
                
            // InternalNpl.g:1019:1: ( (lv_year_5_0= RULE_INT ) )
            // InternalNpl.g:1020:1: (lv_year_5_0= RULE_INT )
            {
            // InternalNpl.g:1020:1: (lv_year_5_0= RULE_INT )
            // InternalNpl.g:1021:3: lv_year_5_0= RULE_INT
            {
            lv_year_5_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            			newLeafNode(lv_year_5_0, grammarAccess.getDateAccess().getYearINTTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"year",
                    		lv_year_5_0, 
                    		"org.eclipse.xtext.common.Terminals.INT");
            	    

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

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
    // InternalNpl.g:1049:1: entryRuleLanguage returns [EObject current=null] : iv_ruleLanguage= ruleLanguage EOF ;
    public final EObject entryRuleLanguage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguage = null;


        try {
            // InternalNpl.g:1050:2: (iv_ruleLanguage= ruleLanguage EOF )
            // InternalNpl.g:1051:2: iv_ruleLanguage= ruleLanguage EOF
            {
             newCompositeNode(grammarAccess.getLanguageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLanguage=ruleLanguage();

            state._fsp--;

             current =iv_ruleLanguage; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalNpl.g:1058:1: ruleLanguage returns [EObject current=null] : ( ( (lv_value_0_0= 'English' ) ) | ( (lv_value_1_0= 'German' ) ) ) ;
    public final EObject ruleLanguage() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // InternalNpl.g:1061:28: ( ( ( (lv_value_0_0= 'English' ) ) | ( (lv_value_1_0= 'German' ) ) ) )
            // InternalNpl.g:1062:1: ( ( (lv_value_0_0= 'English' ) ) | ( (lv_value_1_0= 'German' ) ) )
            {
            // InternalNpl.g:1062:1: ( ( (lv_value_0_0= 'English' ) ) | ( (lv_value_1_0= 'German' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==41) ) {
                alt7=1;
            }
            else if ( (LA7_0==42) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalNpl.g:1062:2: ( (lv_value_0_0= 'English' ) )
                    {
                    // InternalNpl.g:1062:2: ( (lv_value_0_0= 'English' ) )
                    // InternalNpl.g:1063:1: (lv_value_0_0= 'English' )
                    {
                    // InternalNpl.g:1063:1: (lv_value_0_0= 'English' )
                    // InternalNpl.g:1064:3: lv_value_0_0= 'English'
                    {
                    lv_value_0_0=(Token)match(input,41,FOLLOW_2); 

                            newLeafNode(lv_value_0_0, grammarAccess.getLanguageAccess().getValueEnglishKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLanguageRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_0, "English");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalNpl.g:1078:6: ( (lv_value_1_0= 'German' ) )
                    {
                    // InternalNpl.g:1078:6: ( (lv_value_1_0= 'German' ) )
                    // InternalNpl.g:1079:1: (lv_value_1_0= 'German' )
                    {
                    // InternalNpl.g:1079:1: (lv_value_1_0= 'German' )
                    // InternalNpl.g:1080:3: lv_value_1_0= 'German'
                    {
                    lv_value_1_0=(Token)match(input,42,FOLLOW_2); 

                            newLeafNode(lv_value_1_0, grammarAccess.getLanguageAccess().getValueGermanKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLanguageRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_1_0, "German");
                    	    

                    }


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
    // InternalNpl.g:1101:1: entryRulePrice returns [EObject current=null] : iv_rulePrice= rulePrice EOF ;
    public final EObject entryRulePrice() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrice = null;


        try {
            // InternalNpl.g:1102:2: (iv_rulePrice= rulePrice EOF )
            // InternalNpl.g:1103:2: iv_rulePrice= rulePrice EOF
            {
             newCompositeNode(grammarAccess.getPriceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrice=rulePrice();

            state._fsp--;

             current =iv_rulePrice; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalNpl.g:1110:1: rulePrice returns [EObject current=null] : (otherlv_0= '{' ( (lv_value_1_0= ruleFloat ) ) ( (lv_currency_2_0= ruleCurrency ) ) otherlv_3= '}' ) ;
    public final EObject rulePrice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;

        EObject lv_currency_2_0 = null;


         enterRule(); 
            
        try {
            // InternalNpl.g:1113:28: ( (otherlv_0= '{' ( (lv_value_1_0= ruleFloat ) ) ( (lv_currency_2_0= ruleCurrency ) ) otherlv_3= '}' ) )
            // InternalNpl.g:1114:1: (otherlv_0= '{' ( (lv_value_1_0= ruleFloat ) ) ( (lv_currency_2_0= ruleCurrency ) ) otherlv_3= '}' )
            {
            // InternalNpl.g:1114:1: (otherlv_0= '{' ( (lv_value_1_0= ruleFloat ) ) ( (lv_currency_2_0= ruleCurrency ) ) otherlv_3= '}' )
            // InternalNpl.g:1114:3: otherlv_0= '{' ( (lv_value_1_0= ruleFloat ) ) ( (lv_currency_2_0= ruleCurrency ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_12); 

                	newLeafNode(otherlv_0, grammarAccess.getPriceAccess().getLeftCurlyBracketKeyword_0());
                
            // InternalNpl.g:1118:1: ( (lv_value_1_0= ruleFloat ) )
            // InternalNpl.g:1119:1: (lv_value_1_0= ruleFloat )
            {
            // InternalNpl.g:1119:1: (lv_value_1_0= ruleFloat )
            // InternalNpl.g:1120:3: lv_value_1_0= ruleFloat
            {
             
            	        newCompositeNode(grammarAccess.getPriceAccess().getValueFloatParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_19);
            lv_value_1_0=ruleFloat();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPriceRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"de.tu_bs.cs.isf.mbse.mbtimes.Npl.Float");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalNpl.g:1136:2: ( (lv_currency_2_0= ruleCurrency ) )
            // InternalNpl.g:1137:1: (lv_currency_2_0= ruleCurrency )
            {
            // InternalNpl.g:1137:1: (lv_currency_2_0= ruleCurrency )
            // InternalNpl.g:1138:3: lv_currency_2_0= ruleCurrency
            {
             
            	        newCompositeNode(grammarAccess.getPriceAccess().getCurrencyCurrencyParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_18);
            lv_currency_2_0=ruleCurrency();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPriceRule());
            	        }
                   		set(
                   			current, 
                   			"currency",
                    		lv_currency_2_0, 
                    		"de.tu_bs.cs.isf.mbse.mbtimes.Npl.Currency");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

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
    // InternalNpl.g:1166:1: entryRuleCurrency returns [EObject current=null] : iv_ruleCurrency= ruleCurrency EOF ;
    public final EObject entryRuleCurrency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCurrency = null;


        try {
            // InternalNpl.g:1167:2: (iv_ruleCurrency= ruleCurrency EOF )
            // InternalNpl.g:1168:2: iv_ruleCurrency= ruleCurrency EOF
            {
             newCompositeNode(grammarAccess.getCurrencyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCurrency=ruleCurrency();

            state._fsp--;

             current =iv_ruleCurrency; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalNpl.g:1175:1: ruleCurrency returns [EObject current=null] : ( ( (lv_value_0_0= 'Euro' ) ) | ( (lv_value_1_0= 'EUR' ) ) | ( (lv_value_2_0= '\\u20AC' ) ) | ( (lv_value_3_0= 'Dollar' ) ) | ( (lv_value_4_0= 'USD' ) ) | ( (lv_value_5_0= '$' ) ) ) ;
    public final EObject ruleCurrency() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_value_1_0=null;
        Token lv_value_2_0=null;
        Token lv_value_3_0=null;
        Token lv_value_4_0=null;
        Token lv_value_5_0=null;

         enterRule(); 
            
        try {
            // InternalNpl.g:1178:28: ( ( ( (lv_value_0_0= 'Euro' ) ) | ( (lv_value_1_0= 'EUR' ) ) | ( (lv_value_2_0= '\\u20AC' ) ) | ( (lv_value_3_0= 'Dollar' ) ) | ( (lv_value_4_0= 'USD' ) ) | ( (lv_value_5_0= '$' ) ) ) )
            // InternalNpl.g:1179:1: ( ( (lv_value_0_0= 'Euro' ) ) | ( (lv_value_1_0= 'EUR' ) ) | ( (lv_value_2_0= '\\u20AC' ) ) | ( (lv_value_3_0= 'Dollar' ) ) | ( (lv_value_4_0= 'USD' ) ) | ( (lv_value_5_0= '$' ) ) )
            {
            // InternalNpl.g:1179:1: ( ( (lv_value_0_0= 'Euro' ) ) | ( (lv_value_1_0= 'EUR' ) ) | ( (lv_value_2_0= '\\u20AC' ) ) | ( (lv_value_3_0= 'Dollar' ) ) | ( (lv_value_4_0= 'USD' ) ) | ( (lv_value_5_0= '$' ) ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt8=1;
                }
                break;
            case 44:
                {
                alt8=2;
                }
                break;
            case 45:
                {
                alt8=3;
                }
                break;
            case 46:
                {
                alt8=4;
                }
                break;
            case 47:
                {
                alt8=5;
                }
                break;
            case 48:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalNpl.g:1179:2: ( (lv_value_0_0= 'Euro' ) )
                    {
                    // InternalNpl.g:1179:2: ( (lv_value_0_0= 'Euro' ) )
                    // InternalNpl.g:1180:1: (lv_value_0_0= 'Euro' )
                    {
                    // InternalNpl.g:1180:1: (lv_value_0_0= 'Euro' )
                    // InternalNpl.g:1181:3: lv_value_0_0= 'Euro'
                    {
                    lv_value_0_0=(Token)match(input,43,FOLLOW_2); 

                            newLeafNode(lv_value_0_0, grammarAccess.getCurrencyAccess().getValueEuroKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCurrencyRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_0, "Euro");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalNpl.g:1195:6: ( (lv_value_1_0= 'EUR' ) )
                    {
                    // InternalNpl.g:1195:6: ( (lv_value_1_0= 'EUR' ) )
                    // InternalNpl.g:1196:1: (lv_value_1_0= 'EUR' )
                    {
                    // InternalNpl.g:1196:1: (lv_value_1_0= 'EUR' )
                    // InternalNpl.g:1197:3: lv_value_1_0= 'EUR'
                    {
                    lv_value_1_0=(Token)match(input,44,FOLLOW_2); 

                            newLeafNode(lv_value_1_0, grammarAccess.getCurrencyAccess().getValueEURKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCurrencyRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_1_0, "EUR");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalNpl.g:1211:6: ( (lv_value_2_0= '\\u20AC' ) )
                    {
                    // InternalNpl.g:1211:6: ( (lv_value_2_0= '\\u20AC' ) )
                    // InternalNpl.g:1212:1: (lv_value_2_0= '\\u20AC' )
                    {
                    // InternalNpl.g:1212:1: (lv_value_2_0= '\\u20AC' )
                    // InternalNpl.g:1213:3: lv_value_2_0= '\\u20AC'
                    {
                    lv_value_2_0=(Token)match(input,45,FOLLOW_2); 

                            newLeafNode(lv_value_2_0, grammarAccess.getCurrencyAccess().getValueEuroSignKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCurrencyRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_0, "\u20AC");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalNpl.g:1227:6: ( (lv_value_3_0= 'Dollar' ) )
                    {
                    // InternalNpl.g:1227:6: ( (lv_value_3_0= 'Dollar' ) )
                    // InternalNpl.g:1228:1: (lv_value_3_0= 'Dollar' )
                    {
                    // InternalNpl.g:1228:1: (lv_value_3_0= 'Dollar' )
                    // InternalNpl.g:1229:3: lv_value_3_0= 'Dollar'
                    {
                    lv_value_3_0=(Token)match(input,46,FOLLOW_2); 

                            newLeafNode(lv_value_3_0, grammarAccess.getCurrencyAccess().getValueDollarKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCurrencyRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_3_0, "Dollar");
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalNpl.g:1243:6: ( (lv_value_4_0= 'USD' ) )
                    {
                    // InternalNpl.g:1243:6: ( (lv_value_4_0= 'USD' ) )
                    // InternalNpl.g:1244:1: (lv_value_4_0= 'USD' )
                    {
                    // InternalNpl.g:1244:1: (lv_value_4_0= 'USD' )
                    // InternalNpl.g:1245:3: lv_value_4_0= 'USD'
                    {
                    lv_value_4_0=(Token)match(input,47,FOLLOW_2); 

                            newLeafNode(lv_value_4_0, grammarAccess.getCurrencyAccess().getValueUSDKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCurrencyRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_4_0, "USD");
                    	    

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalNpl.g:1259:6: ( (lv_value_5_0= '$' ) )
                    {
                    // InternalNpl.g:1259:6: ( (lv_value_5_0= '$' ) )
                    // InternalNpl.g:1260:1: (lv_value_5_0= '$' )
                    {
                    // InternalNpl.g:1260:1: (lv_value_5_0= '$' )
                    // InternalNpl.g:1261:3: lv_value_5_0= '$'
                    {
                    lv_value_5_0=(Token)match(input,48,FOLLOW_2); 

                            newLeafNode(lv_value_5_0, grammarAccess.getCurrencyAccess().getValueDollarSignKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCurrencyRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_5_0, "$");
                    	    

                    }


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
    // InternalNpl.g:1282:1: entryRuleTopic returns [EObject current=null] : iv_ruleTopic= ruleTopic EOF ;
    public final EObject entryRuleTopic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopic = null;


        try {
            // InternalNpl.g:1283:2: (iv_ruleTopic= ruleTopic EOF )
            // InternalNpl.g:1284:2: iv_ruleTopic= ruleTopic EOF
            {
             newCompositeNode(grammarAccess.getTopicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTopic=ruleTopic();

            state._fsp--;

             current =iv_ruleTopic; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalNpl.g:1291:1: ruleTopic returns [EObject current=null] : (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_title_3_0= RULE_STRING ) ) otherlv_4= '{' ( (lv_tags_5_0= RULE_STRING ) ) (otherlv_6= ', ' ( (lv_tags_7_0= RULE_STRING ) ) )* otherlv_8= '}' ) ;
    public final EObject ruleTopic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_title_3_0=null;
        Token otherlv_4=null;
        Token lv_tags_5_0=null;
        Token otherlv_6=null;
        Token lv_tags_7_0=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // InternalNpl.g:1294:28: ( (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_title_3_0= RULE_STRING ) ) otherlv_4= '{' ( (lv_tags_5_0= RULE_STRING ) ) (otherlv_6= ', ' ( (lv_tags_7_0= RULE_STRING ) ) )* otherlv_8= '}' ) )
            // InternalNpl.g:1295:1: (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_title_3_0= RULE_STRING ) ) otherlv_4= '{' ( (lv_tags_5_0= RULE_STRING ) ) (otherlv_6= ', ' ( (lv_tags_7_0= RULE_STRING ) ) )* otherlv_8= '}' )
            {
            // InternalNpl.g:1295:1: (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_title_3_0= RULE_STRING ) ) otherlv_4= '{' ( (lv_tags_5_0= RULE_STRING ) ) (otherlv_6= ', ' ( (lv_tags_7_0= RULE_STRING ) ) )* otherlv_8= '}' )
            // InternalNpl.g:1295:3: otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_title_3_0= RULE_STRING ) ) otherlv_4= '{' ( (lv_tags_5_0= RULE_STRING ) ) (otherlv_6= ', ' ( (lv_tags_7_0= RULE_STRING ) ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getTopicAccess().getTopicKeyword_0());
                
            // InternalNpl.g:1299:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalNpl.g:1300:1: (lv_name_1_0= RULE_ID )
            {
            // InternalNpl.g:1300:1: (lv_name_1_0= RULE_ID )
            // InternalNpl.g:1301:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTopicAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTopicRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,50,FOLLOW_6); 

                	newLeafNode(otherlv_2, grammarAccess.getTopicAccess().getAsKeyword_2());
                
            // InternalNpl.g:1321:1: ( (lv_title_3_0= RULE_STRING ) )
            // InternalNpl.g:1322:1: (lv_title_3_0= RULE_STRING )
            {
            // InternalNpl.g:1322:1: (lv_title_3_0= RULE_STRING )
            // InternalNpl.g:1323:3: lv_title_3_0= RULE_STRING
            {
            lv_title_3_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            			newLeafNode(lv_title_3_0, grammarAccess.getTopicAccess().getTitleSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTopicRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"title",
                    		lv_title_3_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_6); 

                	newLeafNode(otherlv_4, grammarAccess.getTopicAccess().getLeftCurlyBracketKeyword_4());
                
            // InternalNpl.g:1343:1: ( (lv_tags_5_0= RULE_STRING ) )
            // InternalNpl.g:1344:1: (lv_tags_5_0= RULE_STRING )
            {
            // InternalNpl.g:1344:1: (lv_tags_5_0= RULE_STRING )
            // InternalNpl.g:1345:3: lv_tags_5_0= RULE_STRING
            {
            lv_tags_5_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            			newLeafNode(lv_tags_5_0, grammarAccess.getTopicAccess().getTagsSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTopicRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"tags",
                    		lv_tags_5_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalNpl.g:1361:2: (otherlv_6= ', ' ( (lv_tags_7_0= RULE_STRING ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==51) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalNpl.g:1361:4: otherlv_6= ', ' ( (lv_tags_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,51,FOLLOW_6); 

            	        	newLeafNode(otherlv_6, grammarAccess.getTopicAccess().getCommaSpaceKeyword_6_0());
            	        
            	    // InternalNpl.g:1365:1: ( (lv_tags_7_0= RULE_STRING ) )
            	    // InternalNpl.g:1366:1: (lv_tags_7_0= RULE_STRING )
            	    {
            	    // InternalNpl.g:1366:1: (lv_tags_7_0= RULE_STRING )
            	    // InternalNpl.g:1367:3: lv_tags_7_0= RULE_STRING
            	    {
            	    lv_tags_7_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            	    			newLeafNode(lv_tags_7_0, grammarAccess.getTopicAccess().getTagsSTRINGTerminalRuleCall_6_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTopicRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"tags",
            	            		lv_tags_7_0, 
            	            		"org.eclipse.xtext.common.Terminals.STRING");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

                	newLeafNode(otherlv_8, grammarAccess.getTopicAccess().getRightCurlyBracketKeyword_7());
                

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


    // $ANTLR start "entryRulePair"
    // InternalNpl.g:1395:1: entryRulePair returns [EObject current=null] : iv_rulePair= rulePair EOF ;
    public final EObject entryRulePair() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePair = null;


        try {
            // InternalNpl.g:1396:2: (iv_rulePair= rulePair EOF )
            // InternalNpl.g:1397:2: iv_rulePair= rulePair EOF
            {
             newCompositeNode(grammarAccess.getPairRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePair=rulePair();

            state._fsp--;

             current =iv_rulePair; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalNpl.g:1404:1: rulePair returns [EObject current=null] : ( ( (lv_type_0_0= ruleFeedType ) ) ( (lv_key_1_0= RULE_STRING ) ) otherlv_2= '<' ( (lv_value_3_0= RULE_URL ) ) otherlv_4= '>' ) ;
    public final EObject rulePair() throws RecognitionException {
        EObject current = null;

        Token lv_key_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // InternalNpl.g:1407:28: ( ( ( (lv_type_0_0= ruleFeedType ) ) ( (lv_key_1_0= RULE_STRING ) ) otherlv_2= '<' ( (lv_value_3_0= RULE_URL ) ) otherlv_4= '>' ) )
            // InternalNpl.g:1408:1: ( ( (lv_type_0_0= ruleFeedType ) ) ( (lv_key_1_0= RULE_STRING ) ) otherlv_2= '<' ( (lv_value_3_0= RULE_URL ) ) otherlv_4= '>' )
            {
            // InternalNpl.g:1408:1: ( ( (lv_type_0_0= ruleFeedType ) ) ( (lv_key_1_0= RULE_STRING ) ) otherlv_2= '<' ( (lv_value_3_0= RULE_URL ) ) otherlv_4= '>' )
            // InternalNpl.g:1408:2: ( (lv_type_0_0= ruleFeedType ) ) ( (lv_key_1_0= RULE_STRING ) ) otherlv_2= '<' ( (lv_value_3_0= RULE_URL ) ) otherlv_4= '>'
            {
            // InternalNpl.g:1408:2: ( (lv_type_0_0= ruleFeedType ) )
            // InternalNpl.g:1409:1: (lv_type_0_0= ruleFeedType )
            {
            // InternalNpl.g:1409:1: (lv_type_0_0= ruleFeedType )
            // InternalNpl.g:1410:3: lv_type_0_0= ruleFeedType
            {
             
            	        newCompositeNode(grammarAccess.getPairAccess().getTypeFeedTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_6);
            lv_type_0_0=ruleFeedType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPairRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"de.tu_bs.cs.isf.mbse.mbtimes.Npl.FeedType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalNpl.g:1426:2: ( (lv_key_1_0= RULE_STRING ) )
            // InternalNpl.g:1427:1: (lv_key_1_0= RULE_STRING )
            {
            // InternalNpl.g:1427:1: (lv_key_1_0= RULE_STRING )
            // InternalNpl.g:1428:3: lv_key_1_0= RULE_STRING
            {
            lv_key_1_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            			newLeafNode(lv_key_1_0, grammarAccess.getPairAccess().getKeySTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPairRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"key",
                    		lv_key_1_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,52,FOLLOW_23); 

                	newLeafNode(otherlv_2, grammarAccess.getPairAccess().getLessThanSignKeyword_2());
                
            // InternalNpl.g:1448:1: ( (lv_value_3_0= RULE_URL ) )
            // InternalNpl.g:1449:1: (lv_value_3_0= RULE_URL )
            {
            // InternalNpl.g:1449:1: (lv_value_3_0= RULE_URL )
            // InternalNpl.g:1450:3: lv_value_3_0= RULE_URL
            {
            lv_value_3_0=(Token)match(input,RULE_URL,FOLLOW_24); 

            			newLeafNode(lv_value_3_0, grammarAccess.getPairAccess().getValueURLTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPairRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"de.tu_bs.cs.isf.mbse.mbtimes.Npl.URL");
            	    

            }


            }

            otherlv_4=(Token)match(input,53,FOLLOW_2); 

                	newLeafNode(otherlv_4, grammarAccess.getPairAccess().getGreaterThanSignKeyword_4());
                

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
    // InternalNpl.g:1478:1: entryRuleFloat returns [String current=null] : iv_ruleFloat= ruleFloat EOF ;
    public final String entryRuleFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloat = null;


        try {
            // InternalNpl.g:1479:2: (iv_ruleFloat= ruleFloat EOF )
            // InternalNpl.g:1480:2: iv_ruleFloat= ruleFloat EOF
            {
             newCompositeNode(grammarAccess.getFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloat=ruleFloat();

            state._fsp--;

             current =iv_ruleFloat.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalNpl.g:1487:1: ruleFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT ( (kw= '.' | kw= ',' ) this_INT_3= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_3=null;

         enterRule(); 
            
        try {
            // InternalNpl.g:1490:28: ( (this_INT_0= RULE_INT ( (kw= '.' | kw= ',' ) this_INT_3= RULE_INT )? ) )
            // InternalNpl.g:1491:1: (this_INT_0= RULE_INT ( (kw= '.' | kw= ',' ) this_INT_3= RULE_INT )? )
            {
            // InternalNpl.g:1491:1: (this_INT_0= RULE_INT ( (kw= '.' | kw= ',' ) this_INT_3= RULE_INT )? )
            // InternalNpl.g:1491:6: this_INT_0= RULE_INT ( (kw= '.' | kw= ',' ) this_INT_3= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_25); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getFloatAccess().getINTTerminalRuleCall_0()); 
                
            // InternalNpl.g:1498:1: ( (kw= '.' | kw= ',' ) this_INT_3= RULE_INT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=54 && LA11_0<=55)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalNpl.g:1498:2: (kw= '.' | kw= ',' ) this_INT_3= RULE_INT
                    {
                    // InternalNpl.g:1498:2: (kw= '.' | kw= ',' )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==54) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==55) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalNpl.g:1499:2: kw= '.'
                            {
                            kw=(Token)match(input,54,FOLLOW_12); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getFloatAccess().getFullStopKeyword_1_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // InternalNpl.g:1506:2: kw= ','
                            {
                            kw=(Token)match(input,55,FOLLOW_12); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getFloatAccess().getCommaKeyword_1_0_1()); 
                                

                            }
                            break;

                    }

                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); 

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


    // $ANTLR start "entryRuleFeedType"
    // InternalNpl.g:1526:1: entryRuleFeedType returns [String current=null] : iv_ruleFeedType= ruleFeedType EOF ;
    public final String entryRuleFeedType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeedType = null;


        try {
            // InternalNpl.g:1527:2: (iv_ruleFeedType= ruleFeedType EOF )
            // InternalNpl.g:1528:2: iv_ruleFeedType= ruleFeedType EOF
            {
             newCompositeNode(grammarAccess.getFeedTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeedType=ruleFeedType();

            state._fsp--;

             current =iv_ruleFeedType.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFeedType"


    // $ANTLR start "ruleFeedType"
    // InternalNpl.g:1535:1: ruleFeedType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'RSS' | kw= 'Atom' ) ;
    public final AntlrDatatypeRuleToken ruleFeedType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalNpl.g:1538:28: ( (kw= 'RSS' | kw= 'Atom' ) )
            // InternalNpl.g:1539:1: (kw= 'RSS' | kw= 'Atom' )
            {
            // InternalNpl.g:1539:1: (kw= 'RSS' | kw= 'Atom' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==56) ) {
                alt12=1;
            }
            else if ( (LA12_0==57) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalNpl.g:1540:2: kw= 'RSS'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFeedTypeAccess().getRSSKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalNpl.g:1547:2: kw= 'Atom'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFeedTypeAccess().getAtomKeyword_1()); 
                        

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
    // $ANTLR end "ruleFeedType"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\21\uffff";
    static final String dfa_2s = "\1\1\20\uffff";
    static final String dfa_3s = "\1\14\20\uffff";
    static final String dfa_4s = "\1\36\20\uffff";
    static final String dfa_5s = "\1\uffff\1\20\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17";
    static final String dfa_6s = "\1\0\20\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\uffff\1\3\1\uffff\1\20\1\4\1\5\1\6\1\7\1\10\1\uffff\1\11\1\12\1\13\1\14\1\uffff\1\15\1\16\1\17",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 87:3: ( ({...}? => ( ({...}? => (otherlv_1= 'newspaper' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) otherlv_6= 'feed links' otherlv_7= '{' ( (lv_feedlinks_8_0= rulePair ) ) ( (lv_feedlinks_9_0= rulePair ) )* otherlv_10= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'topics' otherlv_12= '{' ( (lv_topics_13_0= ruleTopic ) ) ( (lv_topics_14_0= ruleTopic ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'date' ( (lv_date_17_0= ruleDate ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'location' ( (lv_location_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'price' ( (lv_price_21_0= rulePrice ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'volume' ( (lv_volume_23_0= RULE_INT ) ) (otherlv_24= 'no.' ( (lv_number_25_0= RULE_INT ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'language' ( (lv_language_27_0= ruleLanguage ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'format' ( (lv_format_29_0= ruleFormat ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'number of articles per topic' ( (lv_articleCnt_31_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'number of words per article' ( (lv_articleWordsMin_33_0= RULE_INT ) ) otherlv_34= '-' ( (lv_articleWordsMax_35_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'number of images per article' ( (lv_imagesCnt_37_0= ruleImagesCount ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'number of columns' ( (lv_columnsCnt_39_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'font size' ( (lv_fontSize_41_0= ruleFontSize ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= '}' ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_0 = input.LA(1);

                         
                        int index4_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA4_0==EOF) ) {s = 1;}

                        else if ( LA4_0 == 12 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 0) ) {s = 2;}

                        else if ( LA4_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1) ) {s = 3;}

                        else if ( LA4_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2) ) {s = 4;}

                        else if ( LA4_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3) ) {s = 5;}

                        else if ( LA4_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4) ) {s = 6;}

                        else if ( LA4_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5) ) {s = 7;}

                        else if ( LA4_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6) ) {s = 8;}

                        else if ( LA4_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7) ) {s = 9;}

                        else if ( LA4_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8) ) {s = 10;}

                        else if ( LA4_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9) ) {s = 11;}

                        else if ( LA4_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10) ) {s = 12;}

                        else if ( LA4_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11) ) {s = 13;}

                        else if ( LA4_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12) ) {s = 14;}

                        else if ( LA4_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13) ) {s = 15;}

                        else if ( LA4_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14) ) {s = 16;}

                         
                        input.seek(index4_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000077BF5002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0300000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0002000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000077FF5002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000001FC00000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0001F80000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0008000000010000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00C0000000000002L});

}
