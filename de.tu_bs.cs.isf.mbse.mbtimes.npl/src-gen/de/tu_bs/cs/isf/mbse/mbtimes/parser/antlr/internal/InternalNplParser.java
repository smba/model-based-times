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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_URL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'newspaper'", "'{'", "'recrawl'", "'feed links'", "'}'", "'topics'", "'optional: date'", "'optional: location'", "'optional: price'", "'optional: volume'", "'no.'", "'optional: language'", "'format'", "'number of articles per topic'", "'number of words per article'", "'-'", "'optional: number of images per article'", "'number of columns'", "'font size'", "'small'", "'medium'", "'large'", "'DIN A6'", "'DIN A5'", "'DIN A4'", "'DIN A3'", "'DIN A2'", "'DIN A1'", "'DIN A0'", "'English'", "'German'", "'EUR'", "'DOLLAR'", "'topic'", "', '", "'<'", "'>'", "'.'", "','", "'RSS'", "'Atom'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
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
    // InternalNpl.g:76:1: ruleDeclaration returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'newspaper' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_recrawl_4_0= 'recrawl' ) ) otherlv_5= 'feed links' otherlv_6= '{' ( (lv_feedlinks_7_0= rulePair ) ) ( (lv_feedlinks_8_0= rulePair ) )* otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'topics' otherlv_11= '{' ( (lv_topics_12_0= ruleTopic ) ) ( (lv_topics_13_0= ruleTopic ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'optional: date' ( (lv_date_16_0= ruleDate ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'optional: location' ( (lv_location_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'optional: price' ( (lv_price_20_0= rulePrice ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'optional: volume' ( (lv_volume_22_0= RULE_INT ) ) otherlv_23= 'no.' ( (lv_number_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'optional: language' ( (lv_language_26_0= ruleLanguage ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'format' ( (lv_format_28_0= ruleFormat ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'number of articles per topic' ( (lv_articleCnt_30_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'number of words per article' ( (lv_articleWordsMin_32_0= RULE_INT ) ) otherlv_33= '-' ( (lv_articleWordsMax_34_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'optional: number of images per article' ( (lv_imagesCnt_36_0= ruleImagesCount ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'number of columns' ( (lv_columnsCnt_38_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'font size' ( (lv_fontSize_40_0= ruleFontSize ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= '}' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_recrawl_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token lv_location_18_0=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token lv_volume_22_0=null;
        Token otherlv_23=null;
        Token lv_number_24_0=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token lv_articleCnt_30_0=null;
        Token otherlv_31=null;
        Token lv_articleWordsMin_32_0=null;
        Token otherlv_33=null;
        Token lv_articleWordsMax_34_0=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token lv_columnsCnt_38_0=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        EObject lv_feedlinks_7_0 = null;

        EObject lv_feedlinks_8_0 = null;

        EObject lv_topics_12_0 = null;

        EObject lv_topics_13_0 = null;

        EObject lv_date_16_0 = null;

        EObject lv_price_20_0 = null;

        EObject lv_language_26_0 = null;

        EObject lv_format_28_0 = null;

        EObject lv_imagesCnt_36_0 = null;

        EObject lv_fontSize_40_0 = null;


         enterRule(); 
            
        try {
            // InternalNpl.g:79:28: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'newspaper' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_recrawl_4_0= 'recrawl' ) ) otherlv_5= 'feed links' otherlv_6= '{' ( (lv_feedlinks_7_0= rulePair ) ) ( (lv_feedlinks_8_0= rulePair ) )* otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'topics' otherlv_11= '{' ( (lv_topics_12_0= ruleTopic ) ) ( (lv_topics_13_0= ruleTopic ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'optional: date' ( (lv_date_16_0= ruleDate ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'optional: location' ( (lv_location_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'optional: price' ( (lv_price_20_0= rulePrice ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'optional: volume' ( (lv_volume_22_0= RULE_INT ) ) otherlv_23= 'no.' ( (lv_number_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'optional: language' ( (lv_language_26_0= ruleLanguage ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'format' ( (lv_format_28_0= ruleFormat ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'number of articles per topic' ( (lv_articleCnt_30_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'number of words per article' ( (lv_articleWordsMin_32_0= RULE_INT ) ) otherlv_33= '-' ( (lv_articleWordsMax_34_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'optional: number of images per article' ( (lv_imagesCnt_36_0= ruleImagesCount ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'number of columns' ( (lv_columnsCnt_38_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'font size' ( (lv_fontSize_40_0= ruleFontSize ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= '}' ) ) ) ) )+ {...}?) ) ) )
            // InternalNpl.g:80:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'newspaper' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_recrawl_4_0= 'recrawl' ) ) otherlv_5= 'feed links' otherlv_6= '{' ( (lv_feedlinks_7_0= rulePair ) ) ( (lv_feedlinks_8_0= rulePair ) )* otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'topics' otherlv_11= '{' ( (lv_topics_12_0= ruleTopic ) ) ( (lv_topics_13_0= ruleTopic ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'optional: date' ( (lv_date_16_0= ruleDate ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'optional: location' ( (lv_location_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'optional: price' ( (lv_price_20_0= rulePrice ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'optional: volume' ( (lv_volume_22_0= RULE_INT ) ) otherlv_23= 'no.' ( (lv_number_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'optional: language' ( (lv_language_26_0= ruleLanguage ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'format' ( (lv_format_28_0= ruleFormat ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'number of articles per topic' ( (lv_articleCnt_30_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'number of words per article' ( (lv_articleWordsMin_32_0= RULE_INT ) ) otherlv_33= '-' ( (lv_articleWordsMax_34_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'optional: number of images per article' ( (lv_imagesCnt_36_0= ruleImagesCount ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'number of columns' ( (lv_columnsCnt_38_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'font size' ( (lv_fontSize_40_0= ruleFontSize ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= '}' ) ) ) ) )+ {...}?) ) )
            {
            // InternalNpl.g:80:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'newspaper' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_recrawl_4_0= 'recrawl' ) ) otherlv_5= 'feed links' otherlv_6= '{' ( (lv_feedlinks_7_0= rulePair ) ) ( (lv_feedlinks_8_0= rulePair ) )* otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'topics' otherlv_11= '{' ( (lv_topics_12_0= ruleTopic ) ) ( (lv_topics_13_0= ruleTopic ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'optional: date' ( (lv_date_16_0= ruleDate ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'optional: location' ( (lv_location_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'optional: price' ( (lv_price_20_0= rulePrice ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'optional: volume' ( (lv_volume_22_0= RULE_INT ) ) otherlv_23= 'no.' ( (lv_number_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'optional: language' ( (lv_language_26_0= ruleLanguage ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'format' ( (lv_format_28_0= ruleFormat ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'number of articles per topic' ( (lv_articleCnt_30_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'number of words per article' ( (lv_articleWordsMin_32_0= RULE_INT ) ) otherlv_33= '-' ( (lv_articleWordsMax_34_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'optional: number of images per article' ( (lv_imagesCnt_36_0= ruleImagesCount ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'number of columns' ( (lv_columnsCnt_38_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'font size' ( (lv_fontSize_40_0= ruleFontSize ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= '}' ) ) ) ) )+ {...}?) ) )
            // InternalNpl.g:82:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'newspaper' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_recrawl_4_0= 'recrawl' ) ) otherlv_5= 'feed links' otherlv_6= '{' ( (lv_feedlinks_7_0= rulePair ) ) ( (lv_feedlinks_8_0= rulePair ) )* otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'topics' otherlv_11= '{' ( (lv_topics_12_0= ruleTopic ) ) ( (lv_topics_13_0= ruleTopic ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'optional: date' ( (lv_date_16_0= ruleDate ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'optional: location' ( (lv_location_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'optional: price' ( (lv_price_20_0= rulePrice ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'optional: volume' ( (lv_volume_22_0= RULE_INT ) ) otherlv_23= 'no.' ( (lv_number_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'optional: language' ( (lv_language_26_0= ruleLanguage ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'format' ( (lv_format_28_0= ruleFormat ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'number of articles per topic' ( (lv_articleCnt_30_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'number of words per article' ( (lv_articleWordsMin_32_0= RULE_INT ) ) otherlv_33= '-' ( (lv_articleWordsMax_34_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'optional: number of images per article' ( (lv_imagesCnt_36_0= ruleImagesCount ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'number of columns' ( (lv_columnsCnt_38_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'font size' ( (lv_fontSize_40_0= ruleFontSize ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= '}' ) ) ) ) )+ {...}?) )
            {
            // InternalNpl.g:82:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'newspaper' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_recrawl_4_0= 'recrawl' ) ) otherlv_5= 'feed links' otherlv_6= '{' ( (lv_feedlinks_7_0= rulePair ) ) ( (lv_feedlinks_8_0= rulePair ) )* otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'topics' otherlv_11= '{' ( (lv_topics_12_0= ruleTopic ) ) ( (lv_topics_13_0= ruleTopic ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'optional: date' ( (lv_date_16_0= ruleDate ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'optional: location' ( (lv_location_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'optional: price' ( (lv_price_20_0= rulePrice ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'optional: volume' ( (lv_volume_22_0= RULE_INT ) ) otherlv_23= 'no.' ( (lv_number_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'optional: language' ( (lv_language_26_0= ruleLanguage ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'format' ( (lv_format_28_0= ruleFormat ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'number of articles per topic' ( (lv_articleCnt_30_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'number of words per article' ( (lv_articleWordsMin_32_0= RULE_INT ) ) otherlv_33= '-' ( (lv_articleWordsMax_34_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'optional: number of images per article' ( (lv_imagesCnt_36_0= ruleImagesCount ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'number of columns' ( (lv_columnsCnt_38_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'font size' ( (lv_fontSize_40_0= ruleFontSize ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= '}' ) ) ) ) )+ {...}?) )
            // InternalNpl.g:83:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'newspaper' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_recrawl_4_0= 'recrawl' ) ) otherlv_5= 'feed links' otherlv_6= '{' ( (lv_feedlinks_7_0= rulePair ) ) ( (lv_feedlinks_8_0= rulePair ) )* otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'topics' otherlv_11= '{' ( (lv_topics_12_0= ruleTopic ) ) ( (lv_topics_13_0= ruleTopic ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'optional: date' ( (lv_date_16_0= ruleDate ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'optional: location' ( (lv_location_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'optional: price' ( (lv_price_20_0= rulePrice ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'optional: volume' ( (lv_volume_22_0= RULE_INT ) ) otherlv_23= 'no.' ( (lv_number_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'optional: language' ( (lv_language_26_0= ruleLanguage ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'format' ( (lv_format_28_0= ruleFormat ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'number of articles per topic' ( (lv_articleCnt_30_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'number of words per article' ( (lv_articleWordsMin_32_0= RULE_INT ) ) otherlv_33= '-' ( (lv_articleWordsMax_34_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'optional: number of images per article' ( (lv_imagesCnt_36_0= ruleImagesCount ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'number of columns' ( (lv_columnsCnt_38_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'font size' ( (lv_fontSize_40_0= ruleFontSize ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= '}' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getDeclarationAccess().getUnorderedGroup());
            	
            // InternalNpl.g:86:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'newspaper' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_recrawl_4_0= 'recrawl' ) ) otherlv_5= 'feed links' otherlv_6= '{' ( (lv_feedlinks_7_0= rulePair ) ) ( (lv_feedlinks_8_0= rulePair ) )* otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'topics' otherlv_11= '{' ( (lv_topics_12_0= ruleTopic ) ) ( (lv_topics_13_0= ruleTopic ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'optional: date' ( (lv_date_16_0= ruleDate ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'optional: location' ( (lv_location_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'optional: price' ( (lv_price_20_0= rulePrice ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'optional: volume' ( (lv_volume_22_0= RULE_INT ) ) otherlv_23= 'no.' ( (lv_number_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'optional: language' ( (lv_language_26_0= ruleLanguage ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'format' ( (lv_format_28_0= ruleFormat ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'number of articles per topic' ( (lv_articleCnt_30_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'number of words per article' ( (lv_articleWordsMin_32_0= RULE_INT ) ) otherlv_33= '-' ( (lv_articleWordsMax_34_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'optional: number of images per article' ( (lv_imagesCnt_36_0= ruleImagesCount ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'number of columns' ( (lv_columnsCnt_38_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'font size' ( (lv_fontSize_40_0= ruleFontSize ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= '}' ) ) ) ) )+ {...}?)
            // InternalNpl.g:87:3: ( ({...}? => ( ({...}? => (otherlv_1= 'newspaper' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_recrawl_4_0= 'recrawl' ) ) otherlv_5= 'feed links' otherlv_6= '{' ( (lv_feedlinks_7_0= rulePair ) ) ( (lv_feedlinks_8_0= rulePair ) )* otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'topics' otherlv_11= '{' ( (lv_topics_12_0= ruleTopic ) ) ( (lv_topics_13_0= ruleTopic ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'optional: date' ( (lv_date_16_0= ruleDate ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'optional: location' ( (lv_location_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'optional: price' ( (lv_price_20_0= rulePrice ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'optional: volume' ( (lv_volume_22_0= RULE_INT ) ) otherlv_23= 'no.' ( (lv_number_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'optional: language' ( (lv_language_26_0= ruleLanguage ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'format' ( (lv_format_28_0= ruleFormat ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'number of articles per topic' ( (lv_articleCnt_30_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'number of words per article' ( (lv_articleWordsMin_32_0= RULE_INT ) ) otherlv_33= '-' ( (lv_articleWordsMax_34_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'optional: number of images per article' ( (lv_imagesCnt_36_0= ruleImagesCount ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'number of columns' ( (lv_columnsCnt_38_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'font size' ( (lv_fontSize_40_0= ruleFontSize ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= '}' ) ) ) ) )+ {...}?
            {
            // InternalNpl.g:87:3: ( ({...}? => ( ({...}? => (otherlv_1= 'newspaper' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_recrawl_4_0= 'recrawl' ) ) otherlv_5= 'feed links' otherlv_6= '{' ( (lv_feedlinks_7_0= rulePair ) ) ( (lv_feedlinks_8_0= rulePair ) )* otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'topics' otherlv_11= '{' ( (lv_topics_12_0= ruleTopic ) ) ( (lv_topics_13_0= ruleTopic ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'optional: date' ( (lv_date_16_0= ruleDate ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'optional: location' ( (lv_location_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'optional: price' ( (lv_price_20_0= rulePrice ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'optional: volume' ( (lv_volume_22_0= RULE_INT ) ) otherlv_23= 'no.' ( (lv_number_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'optional: language' ( (lv_language_26_0= ruleLanguage ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'format' ( (lv_format_28_0= ruleFormat ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'number of articles per topic' ( (lv_articleCnt_30_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'number of words per article' ( (lv_articleWordsMin_32_0= RULE_INT ) ) otherlv_33= '-' ( (lv_articleWordsMax_34_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'optional: number of images per article' ( (lv_imagesCnt_36_0= ruleImagesCount ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'number of columns' ( (lv_columnsCnt_38_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'font size' ( (lv_fontSize_40_0= ruleFontSize ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= '}' ) ) ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=16;
                alt3 = dfa3.predict(input);
                switch (alt3) {
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
            	    // InternalNpl.g:127:4: ({...}? => ( ({...}? => ( ( (lv_recrawl_4_0= 'recrawl' ) ) otherlv_5= 'feed links' otherlv_6= '{' ( (lv_feedlinks_7_0= rulePair ) ) ( (lv_feedlinks_8_0= rulePair ) )* otherlv_9= '}' ) ) ) )
            	    {
            	    // InternalNpl.g:127:4: ({...}? => ( ({...}? => ( ( (lv_recrawl_4_0= 'recrawl' ) ) otherlv_5= 'feed links' otherlv_6= '{' ( (lv_feedlinks_7_0= rulePair ) ) ( (lv_feedlinks_8_0= rulePair ) )* otherlv_9= '}' ) ) ) )
            	    // InternalNpl.g:128:5: {...}? => ( ({...}? => ( ( (lv_recrawl_4_0= 'recrawl' ) ) otherlv_5= 'feed links' otherlv_6= '{' ( (lv_feedlinks_7_0= rulePair ) ) ( (lv_feedlinks_8_0= rulePair ) )* otherlv_9= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalNpl.g:128:106: ( ({...}? => ( ( (lv_recrawl_4_0= 'recrawl' ) ) otherlv_5= 'feed links' otherlv_6= '{' ( (lv_feedlinks_7_0= rulePair ) ) ( (lv_feedlinks_8_0= rulePair ) )* otherlv_9= '}' ) ) )
            	    // InternalNpl.g:129:6: ({...}? => ( ( (lv_recrawl_4_0= 'recrawl' ) ) otherlv_5= 'feed links' otherlv_6= '{' ( (lv_feedlinks_7_0= rulePair ) ) ( (lv_feedlinks_8_0= rulePair ) )* otherlv_9= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // InternalNpl.g:132:6: ({...}? => ( ( (lv_recrawl_4_0= 'recrawl' ) ) otherlv_5= 'feed links' otherlv_6= '{' ( (lv_feedlinks_7_0= rulePair ) ) ( (lv_feedlinks_8_0= rulePair ) )* otherlv_9= '}' ) )
            	    // InternalNpl.g:132:7: {...}? => ( ( (lv_recrawl_4_0= 'recrawl' ) ) otherlv_5= 'feed links' otherlv_6= '{' ( (lv_feedlinks_7_0= rulePair ) ) ( (lv_feedlinks_8_0= rulePair ) )* otherlv_9= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "true");
            	    }
            	    // InternalNpl.g:132:16: ( ( (lv_recrawl_4_0= 'recrawl' ) ) otherlv_5= 'feed links' otherlv_6= '{' ( (lv_feedlinks_7_0= rulePair ) ) ( (lv_feedlinks_8_0= rulePair ) )* otherlv_9= '}' )
            	    // InternalNpl.g:132:17: ( (lv_recrawl_4_0= 'recrawl' ) ) otherlv_5= 'feed links' otherlv_6= '{' ( (lv_feedlinks_7_0= rulePair ) ) ( (lv_feedlinks_8_0= rulePair ) )* otherlv_9= '}'
            	    {
            	    // InternalNpl.g:132:17: ( (lv_recrawl_4_0= 'recrawl' ) )
            	    // InternalNpl.g:133:1: (lv_recrawl_4_0= 'recrawl' )
            	    {
            	    // InternalNpl.g:133:1: (lv_recrawl_4_0= 'recrawl' )
            	    // InternalNpl.g:134:3: lv_recrawl_4_0= 'recrawl'
            	    {
            	    lv_recrawl_4_0=(Token)match(input,14,FOLLOW_6); 

            	            newLeafNode(lv_recrawl_4_0, grammarAccess.getDeclarationAccess().getRecrawlRecrawlKeyword_1_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDeclarationRule());
            	    	        }
            	           		setWithLastConsumed(current, "recrawl", true, "recrawl");
            	    	    

            	    }


            	    }

            	    otherlv_5=(Token)match(input,15,FOLLOW_4); 

            	        	newLeafNode(otherlv_5, grammarAccess.getDeclarationAccess().getFeedLinksKeyword_1_1());
            	        
            	    otherlv_6=(Token)match(input,13,FOLLOW_7); 

            	        	newLeafNode(otherlv_6, grammarAccess.getDeclarationAccess().getLeftCurlyBracketKeyword_1_2());
            	        
            	    // InternalNpl.g:155:1: ( (lv_feedlinks_7_0= rulePair ) )
            	    // InternalNpl.g:156:1: (lv_feedlinks_7_0= rulePair )
            	    {
            	    // InternalNpl.g:156:1: (lv_feedlinks_7_0= rulePair )
            	    // InternalNpl.g:157:3: lv_feedlinks_7_0= rulePair
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclarationAccess().getFeedlinksPairParserRuleCall_1_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_8);
            	    lv_feedlinks_7_0=rulePair();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"feedlinks",
            	            		lv_feedlinks_7_0, 
            	            		"de.tu_bs.cs.isf.mbse.mbtimes.Npl.Pair");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // InternalNpl.g:173:2: ( (lv_feedlinks_8_0= rulePair ) )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( ((LA1_0>=51 && LA1_0<=52)) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalNpl.g:174:1: (lv_feedlinks_8_0= rulePair )
            	    	    {
            	    	    // InternalNpl.g:174:1: (lv_feedlinks_8_0= rulePair )
            	    	    // InternalNpl.g:175:3: lv_feedlinks_8_0= rulePair
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getDeclarationAccess().getFeedlinksPairParserRuleCall_1_4_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_8);
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
            	    	    break;

            	    	default :
            	    	    break loop1;
            	        }
            	    } while (true);

            	    otherlv_9=(Token)match(input,16,FOLLOW_5); 

            	        	newLeafNode(otherlv_9, grammarAccess.getDeclarationAccess().getRightCurlyBracketKeyword_1_5());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeclarationAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalNpl.g:202:4: ({...}? => ( ({...}? => (otherlv_10= 'topics' otherlv_11= '{' ( (lv_topics_12_0= ruleTopic ) ) ( (lv_topics_13_0= ruleTopic ) )* otherlv_14= '}' ) ) ) )
            	    {
            	    // InternalNpl.g:202:4: ({...}? => ( ({...}? => (otherlv_10= 'topics' otherlv_11= '{' ( (lv_topics_12_0= ruleTopic ) ) ( (lv_topics_13_0= ruleTopic ) )* otherlv_14= '}' ) ) ) )
            	    // InternalNpl.g:203:5: {...}? => ( ({...}? => (otherlv_10= 'topics' otherlv_11= '{' ( (lv_topics_12_0= ruleTopic ) ) ( (lv_topics_13_0= ruleTopic ) )* otherlv_14= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalNpl.g:203:106: ( ({...}? => (otherlv_10= 'topics' otherlv_11= '{' ( (lv_topics_12_0= ruleTopic ) ) ( (lv_topics_13_0= ruleTopic ) )* otherlv_14= '}' ) ) )
            	    // InternalNpl.g:204:6: ({...}? => (otherlv_10= 'topics' otherlv_11= '{' ( (lv_topics_12_0= ruleTopic ) ) ( (lv_topics_13_0= ruleTopic ) )* otherlv_14= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2);
            	    	 				
            	    // InternalNpl.g:207:6: ({...}? => (otherlv_10= 'topics' otherlv_11= '{' ( (lv_topics_12_0= ruleTopic ) ) ( (lv_topics_13_0= ruleTopic ) )* otherlv_14= '}' ) )
            	    // InternalNpl.g:207:7: {...}? => (otherlv_10= 'topics' otherlv_11= '{' ( (lv_topics_12_0= ruleTopic ) ) ( (lv_topics_13_0= ruleTopic ) )* otherlv_14= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "true");
            	    }
            	    // InternalNpl.g:207:16: (otherlv_10= 'topics' otherlv_11= '{' ( (lv_topics_12_0= ruleTopic ) ) ( (lv_topics_13_0= ruleTopic ) )* otherlv_14= '}' )
            	    // InternalNpl.g:207:18: otherlv_10= 'topics' otherlv_11= '{' ( (lv_topics_12_0= ruleTopic ) ) ( (lv_topics_13_0= ruleTopic ) )* otherlv_14= '}'
            	    {
            	    otherlv_10=(Token)match(input,17,FOLLOW_4); 

            	        	newLeafNode(otherlv_10, grammarAccess.getDeclarationAccess().getTopicsKeyword_2_0());
            	        
            	    otherlv_11=(Token)match(input,13,FOLLOW_9); 

            	        	newLeafNode(otherlv_11, grammarAccess.getDeclarationAccess().getLeftCurlyBracketKeyword_2_1());
            	        
            	    // InternalNpl.g:215:1: ( (lv_topics_12_0= ruleTopic ) )
            	    // InternalNpl.g:216:1: (lv_topics_12_0= ruleTopic )
            	    {
            	    // InternalNpl.g:216:1: (lv_topics_12_0= ruleTopic )
            	    // InternalNpl.g:217:3: lv_topics_12_0= ruleTopic
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclarationAccess().getTopicsTopicParserRuleCall_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_10);
            	    lv_topics_12_0=ruleTopic();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"topics",
            	            		lv_topics_12_0, 
            	            		"de.tu_bs.cs.isf.mbse.mbtimes.Npl.Topic");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // InternalNpl.g:233:2: ( (lv_topics_13_0= ruleTopic ) )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==45) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalNpl.g:234:1: (lv_topics_13_0= ruleTopic )
            	    	    {
            	    	    // InternalNpl.g:234:1: (lv_topics_13_0= ruleTopic )
            	    	    // InternalNpl.g:235:3: lv_topics_13_0= ruleTopic
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getDeclarationAccess().getTopicsTopicParserRuleCall_2_3_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_10);
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
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);

            	    otherlv_14=(Token)match(input,16,FOLLOW_5); 

            	        	newLeafNode(otherlv_14, grammarAccess.getDeclarationAccess().getRightCurlyBracketKeyword_2_4());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeclarationAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalNpl.g:262:4: ({...}? => ( ({...}? => (otherlv_15= 'optional: date' ( (lv_date_16_0= ruleDate ) ) ) ) ) )
            	    {
            	    // InternalNpl.g:262:4: ({...}? => ( ({...}? => (otherlv_15= 'optional: date' ( (lv_date_16_0= ruleDate ) ) ) ) ) )
            	    // InternalNpl.g:263:5: {...}? => ( ({...}? => (otherlv_15= 'optional: date' ( (lv_date_16_0= ruleDate ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalNpl.g:263:106: ( ({...}? => (otherlv_15= 'optional: date' ( (lv_date_16_0= ruleDate ) ) ) ) )
            	    // InternalNpl.g:264:6: ({...}? => (otherlv_15= 'optional: date' ( (lv_date_16_0= ruleDate ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3);
            	    	 				
            	    // InternalNpl.g:267:6: ({...}? => (otherlv_15= 'optional: date' ( (lv_date_16_0= ruleDate ) ) ) )
            	    // InternalNpl.g:267:7: {...}? => (otherlv_15= 'optional: date' ( (lv_date_16_0= ruleDate ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "true");
            	    }
            	    // InternalNpl.g:267:16: (otherlv_15= 'optional: date' ( (lv_date_16_0= ruleDate ) ) )
            	    // InternalNpl.g:267:18: otherlv_15= 'optional: date' ( (lv_date_16_0= ruleDate ) )
            	    {
            	    otherlv_15=(Token)match(input,18,FOLLOW_4); 

            	        	newLeafNode(otherlv_15, grammarAccess.getDeclarationAccess().getOptionalDateKeyword_3_0());
            	        
            	    // InternalNpl.g:271:1: ( (lv_date_16_0= ruleDate ) )
            	    // InternalNpl.g:272:1: (lv_date_16_0= ruleDate )
            	    {
            	    // InternalNpl.g:272:1: (lv_date_16_0= ruleDate )
            	    // InternalNpl.g:273:3: lv_date_16_0= ruleDate
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclarationAccess().getDateDateParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_5);
            	    lv_date_16_0=ruleDate();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"date",
            	            		lv_date_16_0, 
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
            	    // InternalNpl.g:296:4: ({...}? => ( ({...}? => (otherlv_17= 'optional: location' ( (lv_location_18_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalNpl.g:296:4: ({...}? => ( ({...}? => (otherlv_17= 'optional: location' ( (lv_location_18_0= RULE_STRING ) ) ) ) ) )
            	    // InternalNpl.g:297:5: {...}? => ( ({...}? => (otherlv_17= 'optional: location' ( (lv_location_18_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalNpl.g:297:106: ( ({...}? => (otherlv_17= 'optional: location' ( (lv_location_18_0= RULE_STRING ) ) ) ) )
            	    // InternalNpl.g:298:6: ({...}? => (otherlv_17= 'optional: location' ( (lv_location_18_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4);
            	    	 				
            	    // InternalNpl.g:301:6: ({...}? => (otherlv_17= 'optional: location' ( (lv_location_18_0= RULE_STRING ) ) ) )
            	    // InternalNpl.g:301:7: {...}? => (otherlv_17= 'optional: location' ( (lv_location_18_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "true");
            	    }
            	    // InternalNpl.g:301:16: (otherlv_17= 'optional: location' ( (lv_location_18_0= RULE_STRING ) ) )
            	    // InternalNpl.g:301:18: otherlv_17= 'optional: location' ( (lv_location_18_0= RULE_STRING ) )
            	    {
            	    otherlv_17=(Token)match(input,19,FOLLOW_11); 

            	        	newLeafNode(otherlv_17, grammarAccess.getDeclarationAccess().getOptionalLocationKeyword_4_0());
            	        
            	    // InternalNpl.g:305:1: ( (lv_location_18_0= RULE_STRING ) )
            	    // InternalNpl.g:306:1: (lv_location_18_0= RULE_STRING )
            	    {
            	    // InternalNpl.g:306:1: (lv_location_18_0= RULE_STRING )
            	    // InternalNpl.g:307:3: lv_location_18_0= RULE_STRING
            	    {
            	    lv_location_18_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            	    			newLeafNode(lv_location_18_0, grammarAccess.getDeclarationAccess().getLocationSTRINGTerminalRuleCall_4_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDeclarationRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"location",
            	            		lv_location_18_0, 
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
            	    // InternalNpl.g:330:4: ({...}? => ( ({...}? => (otherlv_19= 'optional: price' ( (lv_price_20_0= rulePrice ) ) ) ) ) )
            	    {
            	    // InternalNpl.g:330:4: ({...}? => ( ({...}? => (otherlv_19= 'optional: price' ( (lv_price_20_0= rulePrice ) ) ) ) ) )
            	    // InternalNpl.g:331:5: {...}? => ( ({...}? => (otherlv_19= 'optional: price' ( (lv_price_20_0= rulePrice ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalNpl.g:331:106: ( ({...}? => (otherlv_19= 'optional: price' ( (lv_price_20_0= rulePrice ) ) ) ) )
            	    // InternalNpl.g:332:6: ({...}? => (otherlv_19= 'optional: price' ( (lv_price_20_0= rulePrice ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5);
            	    	 				
            	    // InternalNpl.g:335:6: ({...}? => (otherlv_19= 'optional: price' ( (lv_price_20_0= rulePrice ) ) ) )
            	    // InternalNpl.g:335:7: {...}? => (otherlv_19= 'optional: price' ( (lv_price_20_0= rulePrice ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "true");
            	    }
            	    // InternalNpl.g:335:16: (otherlv_19= 'optional: price' ( (lv_price_20_0= rulePrice ) ) )
            	    // InternalNpl.g:335:18: otherlv_19= 'optional: price' ( (lv_price_20_0= rulePrice ) )
            	    {
            	    otherlv_19=(Token)match(input,20,FOLLOW_4); 

            	        	newLeafNode(otherlv_19, grammarAccess.getDeclarationAccess().getOptionalPriceKeyword_5_0());
            	        
            	    // InternalNpl.g:339:1: ( (lv_price_20_0= rulePrice ) )
            	    // InternalNpl.g:340:1: (lv_price_20_0= rulePrice )
            	    {
            	    // InternalNpl.g:340:1: (lv_price_20_0= rulePrice )
            	    // InternalNpl.g:341:3: lv_price_20_0= rulePrice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclarationAccess().getPricePriceParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_5);
            	    lv_price_20_0=rulePrice();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"price",
            	            		lv_price_20_0, 
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
            	    // InternalNpl.g:364:4: ({...}? => ( ({...}? => (otherlv_21= 'optional: volume' ( (lv_volume_22_0= RULE_INT ) ) otherlv_23= 'no.' ( (lv_number_24_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalNpl.g:364:4: ({...}? => ( ({...}? => (otherlv_21= 'optional: volume' ( (lv_volume_22_0= RULE_INT ) ) otherlv_23= 'no.' ( (lv_number_24_0= RULE_INT ) ) ) ) ) )
            	    // InternalNpl.g:365:5: {...}? => ( ({...}? => (otherlv_21= 'optional: volume' ( (lv_volume_22_0= RULE_INT ) ) otherlv_23= 'no.' ( (lv_number_24_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalNpl.g:365:106: ( ({...}? => (otherlv_21= 'optional: volume' ( (lv_volume_22_0= RULE_INT ) ) otherlv_23= 'no.' ( (lv_number_24_0= RULE_INT ) ) ) ) )
            	    // InternalNpl.g:366:6: ({...}? => (otherlv_21= 'optional: volume' ( (lv_volume_22_0= RULE_INT ) ) otherlv_23= 'no.' ( (lv_number_24_0= RULE_INT ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6);
            	    	 				
            	    // InternalNpl.g:369:6: ({...}? => (otherlv_21= 'optional: volume' ( (lv_volume_22_0= RULE_INT ) ) otherlv_23= 'no.' ( (lv_number_24_0= RULE_INT ) ) ) )
            	    // InternalNpl.g:369:7: {...}? => (otherlv_21= 'optional: volume' ( (lv_volume_22_0= RULE_INT ) ) otherlv_23= 'no.' ( (lv_number_24_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "true");
            	    }
            	    // InternalNpl.g:369:16: (otherlv_21= 'optional: volume' ( (lv_volume_22_0= RULE_INT ) ) otherlv_23= 'no.' ( (lv_number_24_0= RULE_INT ) ) )
            	    // InternalNpl.g:369:18: otherlv_21= 'optional: volume' ( (lv_volume_22_0= RULE_INT ) ) otherlv_23= 'no.' ( (lv_number_24_0= RULE_INT ) )
            	    {
            	    otherlv_21=(Token)match(input,21,FOLLOW_12); 

            	        	newLeafNode(otherlv_21, grammarAccess.getDeclarationAccess().getOptionalVolumeKeyword_6_0());
            	        
            	    // InternalNpl.g:373:1: ( (lv_volume_22_0= RULE_INT ) )
            	    // InternalNpl.g:374:1: (lv_volume_22_0= RULE_INT )
            	    {
            	    // InternalNpl.g:374:1: (lv_volume_22_0= RULE_INT )
            	    // InternalNpl.g:375:3: lv_volume_22_0= RULE_INT
            	    {
            	    lv_volume_22_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            	    			newLeafNode(lv_volume_22_0, grammarAccess.getDeclarationAccess().getVolumeINTTerminalRuleCall_6_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDeclarationRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"volume",
            	            		lv_volume_22_0, 
            	            		"org.eclipse.xtext.common.Terminals.INT");
            	    	    

            	    }


            	    }

            	    otherlv_23=(Token)match(input,22,FOLLOW_12); 

            	        	newLeafNode(otherlv_23, grammarAccess.getDeclarationAccess().getNoKeyword_6_2());
            	        
            	    // InternalNpl.g:395:1: ( (lv_number_24_0= RULE_INT ) )
            	    // InternalNpl.g:396:1: (lv_number_24_0= RULE_INT )
            	    {
            	    // InternalNpl.g:396:1: (lv_number_24_0= RULE_INT )
            	    // InternalNpl.g:397:3: lv_number_24_0= RULE_INT
            	    {
            	    lv_number_24_0=(Token)match(input,RULE_INT,FOLLOW_5); 

            	    			newLeafNode(lv_number_24_0, grammarAccess.getDeclarationAccess().getNumberINTTerminalRuleCall_6_3_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDeclarationRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"number",
            	            		lv_number_24_0, 
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
            	case 8 :
            	    // InternalNpl.g:420:4: ({...}? => ( ({...}? => (otherlv_25= 'optional: language' ( (lv_language_26_0= ruleLanguage ) ) ) ) ) )
            	    {
            	    // InternalNpl.g:420:4: ({...}? => ( ({...}? => (otherlv_25= 'optional: language' ( (lv_language_26_0= ruleLanguage ) ) ) ) ) )
            	    // InternalNpl.g:421:5: {...}? => ( ({...}? => (otherlv_25= 'optional: language' ( (lv_language_26_0= ruleLanguage ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7)");
            	    }
            	    // InternalNpl.g:421:106: ( ({...}? => (otherlv_25= 'optional: language' ( (lv_language_26_0= ruleLanguage ) ) ) ) )
            	    // InternalNpl.g:422:6: ({...}? => (otherlv_25= 'optional: language' ( (lv_language_26_0= ruleLanguage ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7);
            	    	 				
            	    // InternalNpl.g:425:6: ({...}? => (otherlv_25= 'optional: language' ( (lv_language_26_0= ruleLanguage ) ) ) )
            	    // InternalNpl.g:425:7: {...}? => (otherlv_25= 'optional: language' ( (lv_language_26_0= ruleLanguage ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "true");
            	    }
            	    // InternalNpl.g:425:16: (otherlv_25= 'optional: language' ( (lv_language_26_0= ruleLanguage ) ) )
            	    // InternalNpl.g:425:18: otherlv_25= 'optional: language' ( (lv_language_26_0= ruleLanguage ) )
            	    {
            	    otherlv_25=(Token)match(input,23,FOLLOW_14); 

            	        	newLeafNode(otherlv_25, grammarAccess.getDeclarationAccess().getOptionalLanguageKeyword_7_0());
            	        
            	    // InternalNpl.g:429:1: ( (lv_language_26_0= ruleLanguage ) )
            	    // InternalNpl.g:430:1: (lv_language_26_0= ruleLanguage )
            	    {
            	    // InternalNpl.g:430:1: (lv_language_26_0= ruleLanguage )
            	    // InternalNpl.g:431:3: lv_language_26_0= ruleLanguage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclarationAccess().getLanguageLanguageParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_5);
            	    lv_language_26_0=ruleLanguage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"language",
            	            		lv_language_26_0, 
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
            	    // InternalNpl.g:454:4: ({...}? => ( ({...}? => (otherlv_27= 'format' ( (lv_format_28_0= ruleFormat ) ) ) ) ) )
            	    {
            	    // InternalNpl.g:454:4: ({...}? => ( ({...}? => (otherlv_27= 'format' ( (lv_format_28_0= ruleFormat ) ) ) ) ) )
            	    // InternalNpl.g:455:5: {...}? => ( ({...}? => (otherlv_27= 'format' ( (lv_format_28_0= ruleFormat ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8)");
            	    }
            	    // InternalNpl.g:455:106: ( ({...}? => (otherlv_27= 'format' ( (lv_format_28_0= ruleFormat ) ) ) ) )
            	    // InternalNpl.g:456:6: ({...}? => (otherlv_27= 'format' ( (lv_format_28_0= ruleFormat ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8);
            	    	 				
            	    // InternalNpl.g:459:6: ({...}? => (otherlv_27= 'format' ( (lv_format_28_0= ruleFormat ) ) ) )
            	    // InternalNpl.g:459:7: {...}? => (otherlv_27= 'format' ( (lv_format_28_0= ruleFormat ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "true");
            	    }
            	    // InternalNpl.g:459:16: (otherlv_27= 'format' ( (lv_format_28_0= ruleFormat ) ) )
            	    // InternalNpl.g:459:18: otherlv_27= 'format' ( (lv_format_28_0= ruleFormat ) )
            	    {
            	    otherlv_27=(Token)match(input,24,FOLLOW_15); 

            	        	newLeafNode(otherlv_27, grammarAccess.getDeclarationAccess().getFormatKeyword_8_0());
            	        
            	    // InternalNpl.g:463:1: ( (lv_format_28_0= ruleFormat ) )
            	    // InternalNpl.g:464:1: (lv_format_28_0= ruleFormat )
            	    {
            	    // InternalNpl.g:464:1: (lv_format_28_0= ruleFormat )
            	    // InternalNpl.g:465:3: lv_format_28_0= ruleFormat
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclarationAccess().getFormatFormatParserRuleCall_8_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_5);
            	    lv_format_28_0=ruleFormat();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"format",
            	            		lv_format_28_0, 
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
            	    // InternalNpl.g:488:4: ({...}? => ( ({...}? => (otherlv_29= 'number of articles per topic' ( (lv_articleCnt_30_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalNpl.g:488:4: ({...}? => ( ({...}? => (otherlv_29= 'number of articles per topic' ( (lv_articleCnt_30_0= RULE_INT ) ) ) ) ) )
            	    // InternalNpl.g:489:5: {...}? => ( ({...}? => (otherlv_29= 'number of articles per topic' ( (lv_articleCnt_30_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9)");
            	    }
            	    // InternalNpl.g:489:106: ( ({...}? => (otherlv_29= 'number of articles per topic' ( (lv_articleCnt_30_0= RULE_INT ) ) ) ) )
            	    // InternalNpl.g:490:6: ({...}? => (otherlv_29= 'number of articles per topic' ( (lv_articleCnt_30_0= RULE_INT ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9);
            	    	 				
            	    // InternalNpl.g:493:6: ({...}? => (otherlv_29= 'number of articles per topic' ( (lv_articleCnt_30_0= RULE_INT ) ) ) )
            	    // InternalNpl.g:493:7: {...}? => (otherlv_29= 'number of articles per topic' ( (lv_articleCnt_30_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "true");
            	    }
            	    // InternalNpl.g:493:16: (otherlv_29= 'number of articles per topic' ( (lv_articleCnt_30_0= RULE_INT ) ) )
            	    // InternalNpl.g:493:18: otherlv_29= 'number of articles per topic' ( (lv_articleCnt_30_0= RULE_INT ) )
            	    {
            	    otherlv_29=(Token)match(input,25,FOLLOW_12); 

            	        	newLeafNode(otherlv_29, grammarAccess.getDeclarationAccess().getNumberOfArticlesPerTopicKeyword_9_0());
            	        
            	    // InternalNpl.g:497:1: ( (lv_articleCnt_30_0= RULE_INT ) )
            	    // InternalNpl.g:498:1: (lv_articleCnt_30_0= RULE_INT )
            	    {
            	    // InternalNpl.g:498:1: (lv_articleCnt_30_0= RULE_INT )
            	    // InternalNpl.g:499:3: lv_articleCnt_30_0= RULE_INT
            	    {
            	    lv_articleCnt_30_0=(Token)match(input,RULE_INT,FOLLOW_5); 

            	    			newLeafNode(lv_articleCnt_30_0, grammarAccess.getDeclarationAccess().getArticleCntINTTerminalRuleCall_9_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDeclarationRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"articleCnt",
            	            		lv_articleCnt_30_0, 
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
            	    // InternalNpl.g:522:4: ({...}? => ( ({...}? => (otherlv_31= 'number of words per article' ( (lv_articleWordsMin_32_0= RULE_INT ) ) otherlv_33= '-' ( (lv_articleWordsMax_34_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalNpl.g:522:4: ({...}? => ( ({...}? => (otherlv_31= 'number of words per article' ( (lv_articleWordsMin_32_0= RULE_INT ) ) otherlv_33= '-' ( (lv_articleWordsMax_34_0= RULE_INT ) ) ) ) ) )
            	    // InternalNpl.g:523:5: {...}? => ( ({...}? => (otherlv_31= 'number of words per article' ( (lv_articleWordsMin_32_0= RULE_INT ) ) otherlv_33= '-' ( (lv_articleWordsMax_34_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10)");
            	    }
            	    // InternalNpl.g:523:107: ( ({...}? => (otherlv_31= 'number of words per article' ( (lv_articleWordsMin_32_0= RULE_INT ) ) otherlv_33= '-' ( (lv_articleWordsMax_34_0= RULE_INT ) ) ) ) )
            	    // InternalNpl.g:524:6: ({...}? => (otherlv_31= 'number of words per article' ( (lv_articleWordsMin_32_0= RULE_INT ) ) otherlv_33= '-' ( (lv_articleWordsMax_34_0= RULE_INT ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10);
            	    	 				
            	    // InternalNpl.g:527:6: ({...}? => (otherlv_31= 'number of words per article' ( (lv_articleWordsMin_32_0= RULE_INT ) ) otherlv_33= '-' ( (lv_articleWordsMax_34_0= RULE_INT ) ) ) )
            	    // InternalNpl.g:527:7: {...}? => (otherlv_31= 'number of words per article' ( (lv_articleWordsMin_32_0= RULE_INT ) ) otherlv_33= '-' ( (lv_articleWordsMax_34_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "true");
            	    }
            	    // InternalNpl.g:527:16: (otherlv_31= 'number of words per article' ( (lv_articleWordsMin_32_0= RULE_INT ) ) otherlv_33= '-' ( (lv_articleWordsMax_34_0= RULE_INT ) ) )
            	    // InternalNpl.g:527:18: otherlv_31= 'number of words per article' ( (lv_articleWordsMin_32_0= RULE_INT ) ) otherlv_33= '-' ( (lv_articleWordsMax_34_0= RULE_INT ) )
            	    {
            	    otherlv_31=(Token)match(input,26,FOLLOW_12); 

            	        	newLeafNode(otherlv_31, grammarAccess.getDeclarationAccess().getNumberOfWordsPerArticleKeyword_10_0());
            	        
            	    // InternalNpl.g:531:1: ( (lv_articleWordsMin_32_0= RULE_INT ) )
            	    // InternalNpl.g:532:1: (lv_articleWordsMin_32_0= RULE_INT )
            	    {
            	    // InternalNpl.g:532:1: (lv_articleWordsMin_32_0= RULE_INT )
            	    // InternalNpl.g:533:3: lv_articleWordsMin_32_0= RULE_INT
            	    {
            	    lv_articleWordsMin_32_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            	    			newLeafNode(lv_articleWordsMin_32_0, grammarAccess.getDeclarationAccess().getArticleWordsMinINTTerminalRuleCall_10_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDeclarationRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"articleWordsMin",
            	            		lv_articleWordsMin_32_0, 
            	            		"org.eclipse.xtext.common.Terminals.INT");
            	    	    

            	    }


            	    }

            	    otherlv_33=(Token)match(input,27,FOLLOW_12); 

            	        	newLeafNode(otherlv_33, grammarAccess.getDeclarationAccess().getHyphenMinusKeyword_10_2());
            	        
            	    // InternalNpl.g:553:1: ( (lv_articleWordsMax_34_0= RULE_INT ) )
            	    // InternalNpl.g:554:1: (lv_articleWordsMax_34_0= RULE_INT )
            	    {
            	    // InternalNpl.g:554:1: (lv_articleWordsMax_34_0= RULE_INT )
            	    // InternalNpl.g:555:3: lv_articleWordsMax_34_0= RULE_INT
            	    {
            	    lv_articleWordsMax_34_0=(Token)match(input,RULE_INT,FOLLOW_5); 

            	    			newLeafNode(lv_articleWordsMax_34_0, grammarAccess.getDeclarationAccess().getArticleWordsMaxINTTerminalRuleCall_10_3_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDeclarationRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"articleWordsMax",
            	            		lv_articleWordsMax_34_0, 
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
            	    // InternalNpl.g:578:4: ({...}? => ( ({...}? => (otherlv_35= 'optional: number of images per article' ( (lv_imagesCnt_36_0= ruleImagesCount ) ) ) ) ) )
            	    {
            	    // InternalNpl.g:578:4: ({...}? => ( ({...}? => (otherlv_35= 'optional: number of images per article' ( (lv_imagesCnt_36_0= ruleImagesCount ) ) ) ) ) )
            	    // InternalNpl.g:579:5: {...}? => ( ({...}? => (otherlv_35= 'optional: number of images per article' ( (lv_imagesCnt_36_0= ruleImagesCount ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11)");
            	    }
            	    // InternalNpl.g:579:107: ( ({...}? => (otherlv_35= 'optional: number of images per article' ( (lv_imagesCnt_36_0= ruleImagesCount ) ) ) ) )
            	    // InternalNpl.g:580:6: ({...}? => (otherlv_35= 'optional: number of images per article' ( (lv_imagesCnt_36_0= ruleImagesCount ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11);
            	    	 				
            	    // InternalNpl.g:583:6: ({...}? => (otherlv_35= 'optional: number of images per article' ( (lv_imagesCnt_36_0= ruleImagesCount ) ) ) )
            	    // InternalNpl.g:583:7: {...}? => (otherlv_35= 'optional: number of images per article' ( (lv_imagesCnt_36_0= ruleImagesCount ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "true");
            	    }
            	    // InternalNpl.g:583:16: (otherlv_35= 'optional: number of images per article' ( (lv_imagesCnt_36_0= ruleImagesCount ) ) )
            	    // InternalNpl.g:583:18: otherlv_35= 'optional: number of images per article' ( (lv_imagesCnt_36_0= ruleImagesCount ) )
            	    {
            	    otherlv_35=(Token)match(input,28,FOLLOW_12); 

            	        	newLeafNode(otherlv_35, grammarAccess.getDeclarationAccess().getOptionalNumberOfImagesPerArticleKeyword_11_0());
            	        
            	    // InternalNpl.g:587:1: ( (lv_imagesCnt_36_0= ruleImagesCount ) )
            	    // InternalNpl.g:588:1: (lv_imagesCnt_36_0= ruleImagesCount )
            	    {
            	    // InternalNpl.g:588:1: (lv_imagesCnt_36_0= ruleImagesCount )
            	    // InternalNpl.g:589:3: lv_imagesCnt_36_0= ruleImagesCount
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclarationAccess().getImagesCntImagesCountParserRuleCall_11_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_5);
            	    lv_imagesCnt_36_0=ruleImagesCount();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"imagesCnt",
            	            		lv_imagesCnt_36_0, 
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
            	    // InternalNpl.g:612:4: ({...}? => ( ({...}? => (otherlv_37= 'number of columns' ( (lv_columnsCnt_38_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalNpl.g:612:4: ({...}? => ( ({...}? => (otherlv_37= 'number of columns' ( (lv_columnsCnt_38_0= RULE_INT ) ) ) ) ) )
            	    // InternalNpl.g:613:5: {...}? => ( ({...}? => (otherlv_37= 'number of columns' ( (lv_columnsCnt_38_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12)");
            	    }
            	    // InternalNpl.g:613:107: ( ({...}? => (otherlv_37= 'number of columns' ( (lv_columnsCnt_38_0= RULE_INT ) ) ) ) )
            	    // InternalNpl.g:614:6: ({...}? => (otherlv_37= 'number of columns' ( (lv_columnsCnt_38_0= RULE_INT ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12);
            	    	 				
            	    // InternalNpl.g:617:6: ({...}? => (otherlv_37= 'number of columns' ( (lv_columnsCnt_38_0= RULE_INT ) ) ) )
            	    // InternalNpl.g:617:7: {...}? => (otherlv_37= 'number of columns' ( (lv_columnsCnt_38_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "true");
            	    }
            	    // InternalNpl.g:617:16: (otherlv_37= 'number of columns' ( (lv_columnsCnt_38_0= RULE_INT ) ) )
            	    // InternalNpl.g:617:18: otherlv_37= 'number of columns' ( (lv_columnsCnt_38_0= RULE_INT ) )
            	    {
            	    otherlv_37=(Token)match(input,29,FOLLOW_12); 

            	        	newLeafNode(otherlv_37, grammarAccess.getDeclarationAccess().getNumberOfColumnsKeyword_12_0());
            	        
            	    // InternalNpl.g:621:1: ( (lv_columnsCnt_38_0= RULE_INT ) )
            	    // InternalNpl.g:622:1: (lv_columnsCnt_38_0= RULE_INT )
            	    {
            	    // InternalNpl.g:622:1: (lv_columnsCnt_38_0= RULE_INT )
            	    // InternalNpl.g:623:3: lv_columnsCnt_38_0= RULE_INT
            	    {
            	    lv_columnsCnt_38_0=(Token)match(input,RULE_INT,FOLLOW_5); 

            	    			newLeafNode(lv_columnsCnt_38_0, grammarAccess.getDeclarationAccess().getColumnsCntINTTerminalRuleCall_12_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDeclarationRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"columnsCnt",
            	            		lv_columnsCnt_38_0, 
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
            	    // InternalNpl.g:646:4: ({...}? => ( ({...}? => (otherlv_39= 'font size' ( (lv_fontSize_40_0= ruleFontSize ) ) ) ) ) )
            	    {
            	    // InternalNpl.g:646:4: ({...}? => ( ({...}? => (otherlv_39= 'font size' ( (lv_fontSize_40_0= ruleFontSize ) ) ) ) ) )
            	    // InternalNpl.g:647:5: {...}? => ( ({...}? => (otherlv_39= 'font size' ( (lv_fontSize_40_0= ruleFontSize ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13)");
            	    }
            	    // InternalNpl.g:647:107: ( ({...}? => (otherlv_39= 'font size' ( (lv_fontSize_40_0= ruleFontSize ) ) ) ) )
            	    // InternalNpl.g:648:6: ({...}? => (otherlv_39= 'font size' ( (lv_fontSize_40_0= ruleFontSize ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13);
            	    	 				
            	    // InternalNpl.g:651:6: ({...}? => (otherlv_39= 'font size' ( (lv_fontSize_40_0= ruleFontSize ) ) ) )
            	    // InternalNpl.g:651:7: {...}? => (otherlv_39= 'font size' ( (lv_fontSize_40_0= ruleFontSize ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "true");
            	    }
            	    // InternalNpl.g:651:16: (otherlv_39= 'font size' ( (lv_fontSize_40_0= ruleFontSize ) ) )
            	    // InternalNpl.g:651:18: otherlv_39= 'font size' ( (lv_fontSize_40_0= ruleFontSize ) )
            	    {
            	    otherlv_39=(Token)match(input,30,FOLLOW_17); 

            	        	newLeafNode(otherlv_39, grammarAccess.getDeclarationAccess().getFontSizeKeyword_13_0());
            	        
            	    // InternalNpl.g:655:1: ( (lv_fontSize_40_0= ruleFontSize ) )
            	    // InternalNpl.g:656:1: (lv_fontSize_40_0= ruleFontSize )
            	    {
            	    // InternalNpl.g:656:1: (lv_fontSize_40_0= ruleFontSize )
            	    // InternalNpl.g:657:3: lv_fontSize_40_0= ruleFontSize
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclarationAccess().getFontSizeFontSizeParserRuleCall_13_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_5);
            	    lv_fontSize_40_0=ruleFontSize();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"fontSize",
            	            		lv_fontSize_40_0, 
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
            	    // InternalNpl.g:680:4: ({...}? => ( ({...}? => (otherlv_41= '}' ) ) ) )
            	    {
            	    // InternalNpl.g:680:4: ({...}? => ( ({...}? => (otherlv_41= '}' ) ) ) )
            	    // InternalNpl.g:681:5: {...}? => ( ({...}? => (otherlv_41= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14)");
            	    }
            	    // InternalNpl.g:681:107: ( ({...}? => (otherlv_41= '}' ) ) )
            	    // InternalNpl.g:682:6: ({...}? => (otherlv_41= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14);
            	    	 				
            	    // InternalNpl.g:685:6: ({...}? => (otherlv_41= '}' ) )
            	    // InternalNpl.g:685:7: {...}? => (otherlv_41= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDeclaration", "true");
            	    }
            	    // InternalNpl.g:685:16: (otherlv_41= '}' )
            	    // InternalNpl.g:685:18: otherlv_41= '}'
            	    {
            	    otherlv_41=(Token)match(input,16,FOLLOW_5); 

            	        	newLeafNode(otherlv_41, grammarAccess.getDeclarationAccess().getRightCurlyBracketKeyword_14());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeclarationAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
    // InternalNpl.g:712:1: entryRuleImagesCount returns [EObject current=null] : iv_ruleImagesCount= ruleImagesCount EOF ;
    public final EObject entryRuleImagesCount() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImagesCount = null;


        try {
            // InternalNpl.g:713:2: (iv_ruleImagesCount= ruleImagesCount EOF )
            // InternalNpl.g:714:2: iv_ruleImagesCount= ruleImagesCount EOF
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
    // InternalNpl.g:721:1: ruleImagesCount returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleImagesCount() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalNpl.g:724:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalNpl.g:725:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalNpl.g:725:1: ( (lv_value_0_0= RULE_INT ) )
            // InternalNpl.g:726:1: (lv_value_0_0= RULE_INT )
            {
            // InternalNpl.g:726:1: (lv_value_0_0= RULE_INT )
            // InternalNpl.g:727:3: lv_value_0_0= RULE_INT
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
    // InternalNpl.g:751:1: entryRuleFontSize returns [EObject current=null] : iv_ruleFontSize= ruleFontSize EOF ;
    public final EObject entryRuleFontSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFontSize = null;


        try {
            // InternalNpl.g:752:2: (iv_ruleFontSize= ruleFontSize EOF )
            // InternalNpl.g:753:2: iv_ruleFontSize= ruleFontSize EOF
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
    // InternalNpl.g:760:1: ruleFontSize returns [EObject current=null] : ( ( (lv_value_0_0= 'small' ) ) | ( (lv_value_1_0= 'medium' ) ) | ( (lv_value_2_0= 'large' ) ) ) ;
    public final EObject ruleFontSize() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_value_1_0=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // InternalNpl.g:763:28: ( ( ( (lv_value_0_0= 'small' ) ) | ( (lv_value_1_0= 'medium' ) ) | ( (lv_value_2_0= 'large' ) ) ) )
            // InternalNpl.g:764:1: ( ( (lv_value_0_0= 'small' ) ) | ( (lv_value_1_0= 'medium' ) ) | ( (lv_value_2_0= 'large' ) ) )
            {
            // InternalNpl.g:764:1: ( ( (lv_value_0_0= 'small' ) ) | ( (lv_value_1_0= 'medium' ) ) | ( (lv_value_2_0= 'large' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt4=1;
                }
                break;
            case 32:
                {
                alt4=2;
                }
                break;
            case 33:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalNpl.g:764:2: ( (lv_value_0_0= 'small' ) )
                    {
                    // InternalNpl.g:764:2: ( (lv_value_0_0= 'small' ) )
                    // InternalNpl.g:765:1: (lv_value_0_0= 'small' )
                    {
                    // InternalNpl.g:765:1: (lv_value_0_0= 'small' )
                    // InternalNpl.g:766:3: lv_value_0_0= 'small'
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
                    // InternalNpl.g:780:6: ( (lv_value_1_0= 'medium' ) )
                    {
                    // InternalNpl.g:780:6: ( (lv_value_1_0= 'medium' ) )
                    // InternalNpl.g:781:1: (lv_value_1_0= 'medium' )
                    {
                    // InternalNpl.g:781:1: (lv_value_1_0= 'medium' )
                    // InternalNpl.g:782:3: lv_value_1_0= 'medium'
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
                    // InternalNpl.g:796:6: ( (lv_value_2_0= 'large' ) )
                    {
                    // InternalNpl.g:796:6: ( (lv_value_2_0= 'large' ) )
                    // InternalNpl.g:797:1: (lv_value_2_0= 'large' )
                    {
                    // InternalNpl.g:797:1: (lv_value_2_0= 'large' )
                    // InternalNpl.g:798:3: lv_value_2_0= 'large'
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
    // InternalNpl.g:819:1: entryRuleFormat returns [EObject current=null] : iv_ruleFormat= ruleFormat EOF ;
    public final EObject entryRuleFormat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormat = null;


        try {
            // InternalNpl.g:820:2: (iv_ruleFormat= ruleFormat EOF )
            // InternalNpl.g:821:2: iv_ruleFormat= ruleFormat EOF
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
    // InternalNpl.g:828:1: ruleFormat returns [EObject current=null] : ( ( (lv_value_0_0= 'DIN A6' ) ) | ( (lv_value_1_0= 'DIN A5' ) ) | ( (lv_value_2_0= 'DIN A4' ) ) | ( (lv_value_3_0= 'DIN A3' ) ) | ( (lv_value_4_0= 'DIN A2' ) ) | ( (lv_value_5_0= 'DIN A1' ) ) | ( (lv_value_6_0= 'DIN A0' ) ) ) ;
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
            // InternalNpl.g:831:28: ( ( ( (lv_value_0_0= 'DIN A6' ) ) | ( (lv_value_1_0= 'DIN A5' ) ) | ( (lv_value_2_0= 'DIN A4' ) ) | ( (lv_value_3_0= 'DIN A3' ) ) | ( (lv_value_4_0= 'DIN A2' ) ) | ( (lv_value_5_0= 'DIN A1' ) ) | ( (lv_value_6_0= 'DIN A0' ) ) ) )
            // InternalNpl.g:832:1: ( ( (lv_value_0_0= 'DIN A6' ) ) | ( (lv_value_1_0= 'DIN A5' ) ) | ( (lv_value_2_0= 'DIN A4' ) ) | ( (lv_value_3_0= 'DIN A3' ) ) | ( (lv_value_4_0= 'DIN A2' ) ) | ( (lv_value_5_0= 'DIN A1' ) ) | ( (lv_value_6_0= 'DIN A0' ) ) )
            {
            // InternalNpl.g:832:1: ( ( (lv_value_0_0= 'DIN A6' ) ) | ( (lv_value_1_0= 'DIN A5' ) ) | ( (lv_value_2_0= 'DIN A4' ) ) | ( (lv_value_3_0= 'DIN A3' ) ) | ( (lv_value_4_0= 'DIN A2' ) ) | ( (lv_value_5_0= 'DIN A1' ) ) | ( (lv_value_6_0= 'DIN A0' ) ) )
            int alt5=7;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt5=1;
                }
                break;
            case 35:
                {
                alt5=2;
                }
                break;
            case 36:
                {
                alt5=3;
                }
                break;
            case 37:
                {
                alt5=4;
                }
                break;
            case 38:
                {
                alt5=5;
                }
                break;
            case 39:
                {
                alt5=6;
                }
                break;
            case 40:
                {
                alt5=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalNpl.g:832:2: ( (lv_value_0_0= 'DIN A6' ) )
                    {
                    // InternalNpl.g:832:2: ( (lv_value_0_0= 'DIN A6' ) )
                    // InternalNpl.g:833:1: (lv_value_0_0= 'DIN A6' )
                    {
                    // InternalNpl.g:833:1: (lv_value_0_0= 'DIN A6' )
                    // InternalNpl.g:834:3: lv_value_0_0= 'DIN A6'
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
                    // InternalNpl.g:848:6: ( (lv_value_1_0= 'DIN A5' ) )
                    {
                    // InternalNpl.g:848:6: ( (lv_value_1_0= 'DIN A5' ) )
                    // InternalNpl.g:849:1: (lv_value_1_0= 'DIN A5' )
                    {
                    // InternalNpl.g:849:1: (lv_value_1_0= 'DIN A5' )
                    // InternalNpl.g:850:3: lv_value_1_0= 'DIN A5'
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
                    // InternalNpl.g:864:6: ( (lv_value_2_0= 'DIN A4' ) )
                    {
                    // InternalNpl.g:864:6: ( (lv_value_2_0= 'DIN A4' ) )
                    // InternalNpl.g:865:1: (lv_value_2_0= 'DIN A4' )
                    {
                    // InternalNpl.g:865:1: (lv_value_2_0= 'DIN A4' )
                    // InternalNpl.g:866:3: lv_value_2_0= 'DIN A4'
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
                    // InternalNpl.g:880:6: ( (lv_value_3_0= 'DIN A3' ) )
                    {
                    // InternalNpl.g:880:6: ( (lv_value_3_0= 'DIN A3' ) )
                    // InternalNpl.g:881:1: (lv_value_3_0= 'DIN A3' )
                    {
                    // InternalNpl.g:881:1: (lv_value_3_0= 'DIN A3' )
                    // InternalNpl.g:882:3: lv_value_3_0= 'DIN A3'
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
                    // InternalNpl.g:896:6: ( (lv_value_4_0= 'DIN A2' ) )
                    {
                    // InternalNpl.g:896:6: ( (lv_value_4_0= 'DIN A2' ) )
                    // InternalNpl.g:897:1: (lv_value_4_0= 'DIN A2' )
                    {
                    // InternalNpl.g:897:1: (lv_value_4_0= 'DIN A2' )
                    // InternalNpl.g:898:3: lv_value_4_0= 'DIN A2'
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
                    // InternalNpl.g:912:6: ( (lv_value_5_0= 'DIN A1' ) )
                    {
                    // InternalNpl.g:912:6: ( (lv_value_5_0= 'DIN A1' ) )
                    // InternalNpl.g:913:1: (lv_value_5_0= 'DIN A1' )
                    {
                    // InternalNpl.g:913:1: (lv_value_5_0= 'DIN A1' )
                    // InternalNpl.g:914:3: lv_value_5_0= 'DIN A1'
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
                    // InternalNpl.g:928:6: ( (lv_value_6_0= 'DIN A0' ) )
                    {
                    // InternalNpl.g:928:6: ( (lv_value_6_0= 'DIN A0' ) )
                    // InternalNpl.g:929:1: (lv_value_6_0= 'DIN A0' )
                    {
                    // InternalNpl.g:929:1: (lv_value_6_0= 'DIN A0' )
                    // InternalNpl.g:930:3: lv_value_6_0= 'DIN A0'
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
    // InternalNpl.g:951:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // InternalNpl.g:952:2: (iv_ruleDate= ruleDate EOF )
            // InternalNpl.g:953:2: iv_ruleDate= ruleDate EOF
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
    // InternalNpl.g:960:1: ruleDate returns [EObject current=null] : (otherlv_0= '{' ( (lv_day_1_0= RULE_INT ) ) otherlv_2= '-' ( (lv_month_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_year_5_0= RULE_INT ) ) otherlv_6= '}' ) ;
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
            // InternalNpl.g:963:28: ( (otherlv_0= '{' ( (lv_day_1_0= RULE_INT ) ) otherlv_2= '-' ( (lv_month_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_year_5_0= RULE_INT ) ) otherlv_6= '}' ) )
            // InternalNpl.g:964:1: (otherlv_0= '{' ( (lv_day_1_0= RULE_INT ) ) otherlv_2= '-' ( (lv_month_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_year_5_0= RULE_INT ) ) otherlv_6= '}' )
            {
            // InternalNpl.g:964:1: (otherlv_0= '{' ( (lv_day_1_0= RULE_INT ) ) otherlv_2= '-' ( (lv_month_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_year_5_0= RULE_INT ) ) otherlv_6= '}' )
            // InternalNpl.g:964:3: otherlv_0= '{' ( (lv_day_1_0= RULE_INT ) ) otherlv_2= '-' ( (lv_month_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_year_5_0= RULE_INT ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_12); 

                	newLeafNode(otherlv_0, grammarAccess.getDateAccess().getLeftCurlyBracketKeyword_0());
                
            // InternalNpl.g:968:1: ( (lv_day_1_0= RULE_INT ) )
            // InternalNpl.g:969:1: (lv_day_1_0= RULE_INT )
            {
            // InternalNpl.g:969:1: (lv_day_1_0= RULE_INT )
            // InternalNpl.g:970:3: lv_day_1_0= RULE_INT
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
                
            // InternalNpl.g:990:1: ( (lv_month_3_0= RULE_INT ) )
            // InternalNpl.g:991:1: (lv_month_3_0= RULE_INT )
            {
            // InternalNpl.g:991:1: (lv_month_3_0= RULE_INT )
            // InternalNpl.g:992:3: lv_month_3_0= RULE_INT
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
                
            // InternalNpl.g:1012:1: ( (lv_year_5_0= RULE_INT ) )
            // InternalNpl.g:1013:1: (lv_year_5_0= RULE_INT )
            {
            // InternalNpl.g:1013:1: (lv_year_5_0= RULE_INT )
            // InternalNpl.g:1014:3: lv_year_5_0= RULE_INT
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
    // InternalNpl.g:1042:1: entryRuleLanguage returns [EObject current=null] : iv_ruleLanguage= ruleLanguage EOF ;
    public final EObject entryRuleLanguage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguage = null;


        try {
            // InternalNpl.g:1043:2: (iv_ruleLanguage= ruleLanguage EOF )
            // InternalNpl.g:1044:2: iv_ruleLanguage= ruleLanguage EOF
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
    // InternalNpl.g:1051:1: ruleLanguage returns [EObject current=null] : ( ( (lv_value_0_0= 'English' ) ) | ( (lv_value_1_0= 'German' ) ) ) ;
    public final EObject ruleLanguage() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // InternalNpl.g:1054:28: ( ( ( (lv_value_0_0= 'English' ) ) | ( (lv_value_1_0= 'German' ) ) ) )
            // InternalNpl.g:1055:1: ( ( (lv_value_0_0= 'English' ) ) | ( (lv_value_1_0= 'German' ) ) )
            {
            // InternalNpl.g:1055:1: ( ( (lv_value_0_0= 'English' ) ) | ( (lv_value_1_0= 'German' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==41) ) {
                alt6=1;
            }
            else if ( (LA6_0==42) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalNpl.g:1055:2: ( (lv_value_0_0= 'English' ) )
                    {
                    // InternalNpl.g:1055:2: ( (lv_value_0_0= 'English' ) )
                    // InternalNpl.g:1056:1: (lv_value_0_0= 'English' )
                    {
                    // InternalNpl.g:1056:1: (lv_value_0_0= 'English' )
                    // InternalNpl.g:1057:3: lv_value_0_0= 'English'
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
                    // InternalNpl.g:1071:6: ( (lv_value_1_0= 'German' ) )
                    {
                    // InternalNpl.g:1071:6: ( (lv_value_1_0= 'German' ) )
                    // InternalNpl.g:1072:1: (lv_value_1_0= 'German' )
                    {
                    // InternalNpl.g:1072:1: (lv_value_1_0= 'German' )
                    // InternalNpl.g:1073:3: lv_value_1_0= 'German'
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
    // InternalNpl.g:1094:1: entryRulePrice returns [EObject current=null] : iv_rulePrice= rulePrice EOF ;
    public final EObject entryRulePrice() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrice = null;


        try {
            // InternalNpl.g:1095:2: (iv_rulePrice= rulePrice EOF )
            // InternalNpl.g:1096:2: iv_rulePrice= rulePrice EOF
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
    // InternalNpl.g:1103:1: rulePrice returns [EObject current=null] : (otherlv_0= '{' ( (lv_value_1_0= ruleFloat ) ) ( (lv_currency_2_0= ruleCurrency ) ) otherlv_3= '}' ) ;
    public final EObject rulePrice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;

        EObject lv_currency_2_0 = null;


         enterRule(); 
            
        try {
            // InternalNpl.g:1106:28: ( (otherlv_0= '{' ( (lv_value_1_0= ruleFloat ) ) ( (lv_currency_2_0= ruleCurrency ) ) otherlv_3= '}' ) )
            // InternalNpl.g:1107:1: (otherlv_0= '{' ( (lv_value_1_0= ruleFloat ) ) ( (lv_currency_2_0= ruleCurrency ) ) otherlv_3= '}' )
            {
            // InternalNpl.g:1107:1: (otherlv_0= '{' ( (lv_value_1_0= ruleFloat ) ) ( (lv_currency_2_0= ruleCurrency ) ) otherlv_3= '}' )
            // InternalNpl.g:1107:3: otherlv_0= '{' ( (lv_value_1_0= ruleFloat ) ) ( (lv_currency_2_0= ruleCurrency ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_12); 

                	newLeafNode(otherlv_0, grammarAccess.getPriceAccess().getLeftCurlyBracketKeyword_0());
                
            // InternalNpl.g:1111:1: ( (lv_value_1_0= ruleFloat ) )
            // InternalNpl.g:1112:1: (lv_value_1_0= ruleFloat )
            {
            // InternalNpl.g:1112:1: (lv_value_1_0= ruleFloat )
            // InternalNpl.g:1113:3: lv_value_1_0= ruleFloat
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

            // InternalNpl.g:1129:2: ( (lv_currency_2_0= ruleCurrency ) )
            // InternalNpl.g:1130:1: (lv_currency_2_0= ruleCurrency )
            {
            // InternalNpl.g:1130:1: (lv_currency_2_0= ruleCurrency )
            // InternalNpl.g:1131:3: lv_currency_2_0= ruleCurrency
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
    // InternalNpl.g:1159:1: entryRuleCurrency returns [EObject current=null] : iv_ruleCurrency= ruleCurrency EOF ;
    public final EObject entryRuleCurrency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCurrency = null;


        try {
            // InternalNpl.g:1160:2: (iv_ruleCurrency= ruleCurrency EOF )
            // InternalNpl.g:1161:2: iv_ruleCurrency= ruleCurrency EOF
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
    // InternalNpl.g:1168:1: ruleCurrency returns [EObject current=null] : ( ( (lv_value_0_0= 'EUR' ) ) | ( (lv_value_1_0= 'DOLLAR' ) ) ) ;
    public final EObject ruleCurrency() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // InternalNpl.g:1171:28: ( ( ( (lv_value_0_0= 'EUR' ) ) | ( (lv_value_1_0= 'DOLLAR' ) ) ) )
            // InternalNpl.g:1172:1: ( ( (lv_value_0_0= 'EUR' ) ) | ( (lv_value_1_0= 'DOLLAR' ) ) )
            {
            // InternalNpl.g:1172:1: ( ( (lv_value_0_0= 'EUR' ) ) | ( (lv_value_1_0= 'DOLLAR' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==43) ) {
                alt7=1;
            }
            else if ( (LA7_0==44) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalNpl.g:1172:2: ( (lv_value_0_0= 'EUR' ) )
                    {
                    // InternalNpl.g:1172:2: ( (lv_value_0_0= 'EUR' ) )
                    // InternalNpl.g:1173:1: (lv_value_0_0= 'EUR' )
                    {
                    // InternalNpl.g:1173:1: (lv_value_0_0= 'EUR' )
                    // InternalNpl.g:1174:3: lv_value_0_0= 'EUR'
                    {
                    lv_value_0_0=(Token)match(input,43,FOLLOW_2); 

                            newLeafNode(lv_value_0_0, grammarAccess.getCurrencyAccess().getValueEURKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCurrencyRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_0, "EUR");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalNpl.g:1188:6: ( (lv_value_1_0= 'DOLLAR' ) )
                    {
                    // InternalNpl.g:1188:6: ( (lv_value_1_0= 'DOLLAR' ) )
                    // InternalNpl.g:1189:1: (lv_value_1_0= 'DOLLAR' )
                    {
                    // InternalNpl.g:1189:1: (lv_value_1_0= 'DOLLAR' )
                    // InternalNpl.g:1190:3: lv_value_1_0= 'DOLLAR'
                    {
                    lv_value_1_0=(Token)match(input,44,FOLLOW_2); 

                            newLeafNode(lv_value_1_0, grammarAccess.getCurrencyAccess().getValueDOLLARKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCurrencyRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_1_0, "DOLLAR");
                    	    

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
    // InternalNpl.g:1211:1: entryRuleTopic returns [EObject current=null] : iv_ruleTopic= ruleTopic EOF ;
    public final EObject entryRuleTopic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopic = null;


        try {
            // InternalNpl.g:1212:2: (iv_ruleTopic= ruleTopic EOF )
            // InternalNpl.g:1213:2: iv_ruleTopic= ruleTopic EOF
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
    // InternalNpl.g:1220:1: ruleTopic returns [EObject current=null] : (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tags_3_0= ruleTopicTag ) ) (otherlv_4= ', ' ( (lv_tags_5_0= ruleTopicTag ) ) )* otherlv_6= '}' ) ;
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
            // InternalNpl.g:1223:28: ( (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tags_3_0= ruleTopicTag ) ) (otherlv_4= ', ' ( (lv_tags_5_0= ruleTopicTag ) ) )* otherlv_6= '}' ) )
            // InternalNpl.g:1224:1: (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tags_3_0= ruleTopicTag ) ) (otherlv_4= ', ' ( (lv_tags_5_0= ruleTopicTag ) ) )* otherlv_6= '}' )
            {
            // InternalNpl.g:1224:1: (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tags_3_0= ruleTopicTag ) ) (otherlv_4= ', ' ( (lv_tags_5_0= ruleTopicTag ) ) )* otherlv_6= '}' )
            // InternalNpl.g:1224:3: otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tags_3_0= ruleTopicTag ) ) (otherlv_4= ', ' ( (lv_tags_5_0= ruleTopicTag ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getTopicAccess().getTopicKeyword_0());
                
            // InternalNpl.g:1228:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalNpl.g:1229:1: (lv_name_1_0= RULE_ID )
            {
            // InternalNpl.g:1229:1: (lv_name_1_0= RULE_ID )
            // InternalNpl.g:1230:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_11); 

                	newLeafNode(otherlv_2, grammarAccess.getTopicAccess().getLeftCurlyBracketKeyword_2());
                
            // InternalNpl.g:1250:1: ( (lv_tags_3_0= ruleTopicTag ) )
            // InternalNpl.g:1251:1: (lv_tags_3_0= ruleTopicTag )
            {
            // InternalNpl.g:1251:1: (lv_tags_3_0= ruleTopicTag )
            // InternalNpl.g:1252:3: lv_tags_3_0= ruleTopicTag
            {
             
            	        newCompositeNode(grammarAccess.getTopicAccess().getTagsTopicTagParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_20);
            lv_tags_3_0=ruleTopicTag();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTopicRule());
            	        }
                   		add(
                   			current, 
                   			"tags",
                    		lv_tags_3_0, 
                    		"de.tu_bs.cs.isf.mbse.mbtimes.Npl.TopicTag");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalNpl.g:1268:2: (otherlv_4= ', ' ( (lv_tags_5_0= ruleTopicTag ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==46) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalNpl.g:1268:4: otherlv_4= ', ' ( (lv_tags_5_0= ruleTopicTag ) )
            	    {
            	    otherlv_4=(Token)match(input,46,FOLLOW_11); 

            	        	newLeafNode(otherlv_4, grammarAccess.getTopicAccess().getCommaSpaceKeyword_4_0());
            	        
            	    // InternalNpl.g:1272:1: ( (lv_tags_5_0= ruleTopicTag ) )
            	    // InternalNpl.g:1273:1: (lv_tags_5_0= ruleTopicTag )
            	    {
            	    // InternalNpl.g:1273:1: (lv_tags_5_0= ruleTopicTag )
            	    // InternalNpl.g:1274:3: lv_tags_5_0= ruleTopicTag
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTopicAccess().getTagsTopicTagParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_20);
            	    lv_tags_5_0=ruleTopicTag();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTopicRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"tags",
            	            		lv_tags_5_0, 
            	            		"de.tu_bs.cs.isf.mbse.mbtimes.Npl.TopicTag");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

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
    // InternalNpl.g:1302:1: entryRuleTopicTag returns [EObject current=null] : iv_ruleTopicTag= ruleTopicTag EOF ;
    public final EObject entryRuleTopicTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopicTag = null;


        try {
            // InternalNpl.g:1303:2: (iv_ruleTopicTag= ruleTopicTag EOF )
            // InternalNpl.g:1304:2: iv_ruleTopicTag= ruleTopicTag EOF
            {
             newCompositeNode(grammarAccess.getTopicTagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTopicTag=ruleTopicTag();

            state._fsp--;

             current =iv_ruleTopicTag; 
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
    // $ANTLR end "entryRuleTopicTag"


    // $ANTLR start "ruleTopicTag"
    // InternalNpl.g:1311:1: ruleTopicTag returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleTopicTag() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalNpl.g:1314:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalNpl.g:1315:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalNpl.g:1315:1: ( (lv_value_0_0= RULE_STRING ) )
            // InternalNpl.g:1316:1: (lv_value_0_0= RULE_STRING )
            {
            // InternalNpl.g:1316:1: (lv_value_0_0= RULE_STRING )
            // InternalNpl.g:1317:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(lv_value_0_0, grammarAccess.getTopicTagAccess().getValueSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTopicTagRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

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
    // InternalNpl.g:1341:1: entryRulePair returns [EObject current=null] : iv_rulePair= rulePair EOF ;
    public final EObject entryRulePair() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePair = null;


        try {
            // InternalNpl.g:1342:2: (iv_rulePair= rulePair EOF )
            // InternalNpl.g:1343:2: iv_rulePair= rulePair EOF
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
    // InternalNpl.g:1350:1: rulePair returns [EObject current=null] : ( ( (lv_type_0_0= ruleFeedType ) ) ( (lv_key_1_0= RULE_STRING ) ) otherlv_2= '<' ( (lv_value_3_0= RULE_URL ) ) otherlv_4= '>' ) ;
    public final EObject rulePair() throws RecognitionException {
        EObject current = null;

        Token lv_key_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // InternalNpl.g:1353:28: ( ( ( (lv_type_0_0= ruleFeedType ) ) ( (lv_key_1_0= RULE_STRING ) ) otherlv_2= '<' ( (lv_value_3_0= RULE_URL ) ) otherlv_4= '>' ) )
            // InternalNpl.g:1354:1: ( ( (lv_type_0_0= ruleFeedType ) ) ( (lv_key_1_0= RULE_STRING ) ) otherlv_2= '<' ( (lv_value_3_0= RULE_URL ) ) otherlv_4= '>' )
            {
            // InternalNpl.g:1354:1: ( ( (lv_type_0_0= ruleFeedType ) ) ( (lv_key_1_0= RULE_STRING ) ) otherlv_2= '<' ( (lv_value_3_0= RULE_URL ) ) otherlv_4= '>' )
            // InternalNpl.g:1354:2: ( (lv_type_0_0= ruleFeedType ) ) ( (lv_key_1_0= RULE_STRING ) ) otherlv_2= '<' ( (lv_value_3_0= RULE_URL ) ) otherlv_4= '>'
            {
            // InternalNpl.g:1354:2: ( (lv_type_0_0= ruleFeedType ) )
            // InternalNpl.g:1355:1: (lv_type_0_0= ruleFeedType )
            {
            // InternalNpl.g:1355:1: (lv_type_0_0= ruleFeedType )
            // InternalNpl.g:1356:3: lv_type_0_0= ruleFeedType
            {
             
            	        newCompositeNode(grammarAccess.getPairAccess().getTypeFeedTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_11);
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

            // InternalNpl.g:1372:2: ( (lv_key_1_0= RULE_STRING ) )
            // InternalNpl.g:1373:1: (lv_key_1_0= RULE_STRING )
            {
            // InternalNpl.g:1373:1: (lv_key_1_0= RULE_STRING )
            // InternalNpl.g:1374:3: lv_key_1_0= RULE_STRING
            {
            lv_key_1_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

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

            otherlv_2=(Token)match(input,47,FOLLOW_22); 

                	newLeafNode(otherlv_2, grammarAccess.getPairAccess().getLessThanSignKeyword_2());
                
            // InternalNpl.g:1394:1: ( (lv_value_3_0= RULE_URL ) )
            // InternalNpl.g:1395:1: (lv_value_3_0= RULE_URL )
            {
            // InternalNpl.g:1395:1: (lv_value_3_0= RULE_URL )
            // InternalNpl.g:1396:3: lv_value_3_0= RULE_URL
            {
            lv_value_3_0=(Token)match(input,RULE_URL,FOLLOW_23); 

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

            otherlv_4=(Token)match(input,48,FOLLOW_2); 

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
    // InternalNpl.g:1424:1: entryRuleFloat returns [String current=null] : iv_ruleFloat= ruleFloat EOF ;
    public final String entryRuleFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloat = null;


        try {
            // InternalNpl.g:1425:2: (iv_ruleFloat= ruleFloat EOF )
            // InternalNpl.g:1426:2: iv_ruleFloat= ruleFloat EOF
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
    // InternalNpl.g:1433:1: ruleFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT ( (kw= '.' | kw= ',' ) this_INT_3= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_3=null;

         enterRule(); 
            
        try {
            // InternalNpl.g:1436:28: ( (this_INT_0= RULE_INT ( (kw= '.' | kw= ',' ) this_INT_3= RULE_INT )? ) )
            // InternalNpl.g:1437:1: (this_INT_0= RULE_INT ( (kw= '.' | kw= ',' ) this_INT_3= RULE_INT )? )
            {
            // InternalNpl.g:1437:1: (this_INT_0= RULE_INT ( (kw= '.' | kw= ',' ) this_INT_3= RULE_INT )? )
            // InternalNpl.g:1437:6: this_INT_0= RULE_INT ( (kw= '.' | kw= ',' ) this_INT_3= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_24); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getFloatAccess().getINTTerminalRuleCall_0()); 
                
            // InternalNpl.g:1444:1: ( (kw= '.' | kw= ',' ) this_INT_3= RULE_INT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=49 && LA10_0<=50)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalNpl.g:1444:2: (kw= '.' | kw= ',' ) this_INT_3= RULE_INT
                    {
                    // InternalNpl.g:1444:2: (kw= '.' | kw= ',' )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==49) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==50) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalNpl.g:1445:2: kw= '.'
                            {
                            kw=(Token)match(input,49,FOLLOW_12); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getFloatAccess().getFullStopKeyword_1_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // InternalNpl.g:1452:2: kw= ','
                            {
                            kw=(Token)match(input,50,FOLLOW_12); 

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
    // InternalNpl.g:1472:1: entryRuleFeedType returns [String current=null] : iv_ruleFeedType= ruleFeedType EOF ;
    public final String entryRuleFeedType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeedType = null;


        try {
            // InternalNpl.g:1473:2: (iv_ruleFeedType= ruleFeedType EOF )
            // InternalNpl.g:1474:2: iv_ruleFeedType= ruleFeedType EOF
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
    // InternalNpl.g:1481:1: ruleFeedType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'RSS' | kw= 'Atom' ) ;
    public final AntlrDatatypeRuleToken ruleFeedType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalNpl.g:1484:28: ( (kw= 'RSS' | kw= 'Atom' ) )
            // InternalNpl.g:1485:1: (kw= 'RSS' | kw= 'Atom' )
            {
            // InternalNpl.g:1485:1: (kw= 'RSS' | kw= 'Atom' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==51) ) {
                alt11=1;
            }
            else if ( (LA11_0==52) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalNpl.g:1486:2: kw= 'RSS'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFeedTypeAccess().getRSSKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalNpl.g:1493:2: kw= 'Atom'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

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


    protected DFA3 dfa3 = new DFA3(this);
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

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 87:3: ( ({...}? => ( ({...}? => (otherlv_1= 'newspaper' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_recrawl_4_0= 'recrawl' ) ) otherlv_5= 'feed links' otherlv_6= '{' ( (lv_feedlinks_7_0= rulePair ) ) ( (lv_feedlinks_8_0= rulePair ) )* otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'topics' otherlv_11= '{' ( (lv_topics_12_0= ruleTopic ) ) ( (lv_topics_13_0= ruleTopic ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'optional: date' ( (lv_date_16_0= ruleDate ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'optional: location' ( (lv_location_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'optional: price' ( (lv_price_20_0= rulePrice ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'optional: volume' ( (lv_volume_22_0= RULE_INT ) ) otherlv_23= 'no.' ( (lv_number_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'optional: language' ( (lv_language_26_0= ruleLanguage ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'format' ( (lv_format_28_0= ruleFormat ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'number of articles per topic' ( (lv_articleCnt_30_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'number of words per article' ( (lv_articleWordsMin_32_0= RULE_INT ) ) otherlv_33= '-' ( (lv_articleWordsMax_34_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'optional: number of images per article' ( (lv_imagesCnt_36_0= ruleImagesCount ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'number of columns' ( (lv_columnsCnt_38_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'font size' ( (lv_fontSize_40_0= ruleFontSize ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= '}' ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_0 = input.LA(1);

                         
                        int index3_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_0==EOF) ) {s = 1;}

                        else if ( LA3_0 == 12 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 0) ) {s = 2;}

                        else if ( LA3_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1) ) {s = 3;}

                        else if ( LA3_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2) ) {s = 4;}

                        else if ( LA3_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3) ) {s = 5;}

                        else if ( LA3_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4) ) {s = 6;}

                        else if ( LA3_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5) ) {s = 7;}

                        else if ( LA3_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6) ) {s = 8;}

                        else if ( LA3_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7) ) {s = 9;}

                        else if ( LA3_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8) ) {s = 10;}

                        else if ( LA3_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9) ) {s = 11;}

                        else if ( LA3_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10) ) {s = 12;}

                        else if ( LA3_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11) ) {s = 13;}

                        else if ( LA3_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12) ) {s = 14;}

                        else if ( LA3_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13) ) {s = 15;}

                        else if ( LA3_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14) ) {s = 16;}

                         
                        input.seek(index3_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 3, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000077BF5002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0018000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000200000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000001FC00000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000400000010000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0006000000000002L});

}
