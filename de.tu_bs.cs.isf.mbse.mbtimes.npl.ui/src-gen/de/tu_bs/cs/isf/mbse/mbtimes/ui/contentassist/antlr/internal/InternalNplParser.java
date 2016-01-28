package de.tu_bs.cs.isf.mbse.mbtimes.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.tu_bs.cs.isf.mbse.mbtimes.services.NplGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalNplParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_URL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "','", "'RSS'", "'Atom'", "'newspaper'", "'{'", "'feed links'", "'}'", "'topics'", "'optional: date'", "'optional: location'", "'optional: price'", "'optional: volume'", "'no.'", "'optional: language'", "'format'", "'number of articles per topic'", "'number of words per article'", "'-'", "'optional: number of images per article'", "'number of columns'", "'font size'", "'topic'", "', '", "'<'", "'>'", "'recrawl'", "'small'", "'medium'", "'large'", "'DIN A6'", "'DIN A5'", "'DIN A4'", "'DIN A3'", "'DIN A2'", "'DIN A1'", "'DIN A0'", "'English'", "'German'", "'Euro'", "'EUR'", "'\\u20AC'", "'Dollar'", "'USD'", "'$'"
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
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int RULE_URL=7;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
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
     	
        public void setGrammarAccess(NplGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleDeclaration"
    // InternalNpl.g:60:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // InternalNpl.g:61:1: ( ruleDeclaration EOF )
            // InternalNpl.g:62:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalNpl.g:69:1: ruleDeclaration : ( ( rule__Declaration__UnorderedGroup ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:73:2: ( ( ( rule__Declaration__UnorderedGroup ) ) )
            // InternalNpl.g:74:1: ( ( rule__Declaration__UnorderedGroup ) )
            {
            // InternalNpl.g:74:1: ( ( rule__Declaration__UnorderedGroup ) )
            // InternalNpl.g:75:1: ( rule__Declaration__UnorderedGroup )
            {
             before(grammarAccess.getDeclarationAccess().getUnorderedGroup()); 
            // InternalNpl.g:76:1: ( rule__Declaration__UnorderedGroup )
            // InternalNpl.g:76:2: rule__Declaration__UnorderedGroup
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__UnorderedGroup();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getUnorderedGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleImagesCount"
    // InternalNpl.g:88:1: entryRuleImagesCount : ruleImagesCount EOF ;
    public final void entryRuleImagesCount() throws RecognitionException {
        try {
            // InternalNpl.g:89:1: ( ruleImagesCount EOF )
            // InternalNpl.g:90:1: ruleImagesCount EOF
            {
             before(grammarAccess.getImagesCountRule()); 
            pushFollow(FOLLOW_1);
            ruleImagesCount();

            state._fsp--;

             after(grammarAccess.getImagesCountRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImagesCount"


    // $ANTLR start "ruleImagesCount"
    // InternalNpl.g:97:1: ruleImagesCount : ( ( rule__ImagesCount__ValueAssignment ) ) ;
    public final void ruleImagesCount() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:101:2: ( ( ( rule__ImagesCount__ValueAssignment ) ) )
            // InternalNpl.g:102:1: ( ( rule__ImagesCount__ValueAssignment ) )
            {
            // InternalNpl.g:102:1: ( ( rule__ImagesCount__ValueAssignment ) )
            // InternalNpl.g:103:1: ( rule__ImagesCount__ValueAssignment )
            {
             before(grammarAccess.getImagesCountAccess().getValueAssignment()); 
            // InternalNpl.g:104:1: ( rule__ImagesCount__ValueAssignment )
            // InternalNpl.g:104:2: rule__ImagesCount__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ImagesCount__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getImagesCountAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImagesCount"


    // $ANTLR start "entryRuleFontSize"
    // InternalNpl.g:116:1: entryRuleFontSize : ruleFontSize EOF ;
    public final void entryRuleFontSize() throws RecognitionException {
        try {
            // InternalNpl.g:117:1: ( ruleFontSize EOF )
            // InternalNpl.g:118:1: ruleFontSize EOF
            {
             before(grammarAccess.getFontSizeRule()); 
            pushFollow(FOLLOW_1);
            ruleFontSize();

            state._fsp--;

             after(grammarAccess.getFontSizeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFontSize"


    // $ANTLR start "ruleFontSize"
    // InternalNpl.g:125:1: ruleFontSize : ( ( rule__FontSize__Alternatives ) ) ;
    public final void ruleFontSize() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:129:2: ( ( ( rule__FontSize__Alternatives ) ) )
            // InternalNpl.g:130:1: ( ( rule__FontSize__Alternatives ) )
            {
            // InternalNpl.g:130:1: ( ( rule__FontSize__Alternatives ) )
            // InternalNpl.g:131:1: ( rule__FontSize__Alternatives )
            {
             before(grammarAccess.getFontSizeAccess().getAlternatives()); 
            // InternalNpl.g:132:1: ( rule__FontSize__Alternatives )
            // InternalNpl.g:132:2: rule__FontSize__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FontSize__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFontSizeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFontSize"


    // $ANTLR start "entryRuleFormat"
    // InternalNpl.g:144:1: entryRuleFormat : ruleFormat EOF ;
    public final void entryRuleFormat() throws RecognitionException {
        try {
            // InternalNpl.g:145:1: ( ruleFormat EOF )
            // InternalNpl.g:146:1: ruleFormat EOF
            {
             before(grammarAccess.getFormatRule()); 
            pushFollow(FOLLOW_1);
            ruleFormat();

            state._fsp--;

             after(grammarAccess.getFormatRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFormat"


    // $ANTLR start "ruleFormat"
    // InternalNpl.g:153:1: ruleFormat : ( ( rule__Format__Alternatives ) ) ;
    public final void ruleFormat() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:157:2: ( ( ( rule__Format__Alternatives ) ) )
            // InternalNpl.g:158:1: ( ( rule__Format__Alternatives ) )
            {
            // InternalNpl.g:158:1: ( ( rule__Format__Alternatives ) )
            // InternalNpl.g:159:1: ( rule__Format__Alternatives )
            {
             before(grammarAccess.getFormatAccess().getAlternatives()); 
            // InternalNpl.g:160:1: ( rule__Format__Alternatives )
            // InternalNpl.g:160:2: rule__Format__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Format__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFormatAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormat"


    // $ANTLR start "entryRuleDate"
    // InternalNpl.g:172:1: entryRuleDate : ruleDate EOF ;
    public final void entryRuleDate() throws RecognitionException {
        try {
            // InternalNpl.g:173:1: ( ruleDate EOF )
            // InternalNpl.g:174:1: ruleDate EOF
            {
             before(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_1);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getDateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // InternalNpl.g:181:1: ruleDate : ( ( rule__Date__Group__0 ) ) ;
    public final void ruleDate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:185:2: ( ( ( rule__Date__Group__0 ) ) )
            // InternalNpl.g:186:1: ( ( rule__Date__Group__0 ) )
            {
            // InternalNpl.g:186:1: ( ( rule__Date__Group__0 ) )
            // InternalNpl.g:187:1: ( rule__Date__Group__0 )
            {
             before(grammarAccess.getDateAccess().getGroup()); 
            // InternalNpl.g:188:1: ( rule__Date__Group__0 )
            // InternalNpl.g:188:2: rule__Date__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Date__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDate"


    // $ANTLR start "entryRuleLanguage"
    // InternalNpl.g:200:1: entryRuleLanguage : ruleLanguage EOF ;
    public final void entryRuleLanguage() throws RecognitionException {
        try {
            // InternalNpl.g:201:1: ( ruleLanguage EOF )
            // InternalNpl.g:202:1: ruleLanguage EOF
            {
             before(grammarAccess.getLanguageRule()); 
            pushFollow(FOLLOW_1);
            ruleLanguage();

            state._fsp--;

             after(grammarAccess.getLanguageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLanguage"


    // $ANTLR start "ruleLanguage"
    // InternalNpl.g:209:1: ruleLanguage : ( ( rule__Language__Alternatives ) ) ;
    public final void ruleLanguage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:213:2: ( ( ( rule__Language__Alternatives ) ) )
            // InternalNpl.g:214:1: ( ( rule__Language__Alternatives ) )
            {
            // InternalNpl.g:214:1: ( ( rule__Language__Alternatives ) )
            // InternalNpl.g:215:1: ( rule__Language__Alternatives )
            {
             before(grammarAccess.getLanguageAccess().getAlternatives()); 
            // InternalNpl.g:216:1: ( rule__Language__Alternatives )
            // InternalNpl.g:216:2: rule__Language__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Language__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLanguageAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLanguage"


    // $ANTLR start "entryRulePrice"
    // InternalNpl.g:228:1: entryRulePrice : rulePrice EOF ;
    public final void entryRulePrice() throws RecognitionException {
        try {
            // InternalNpl.g:229:1: ( rulePrice EOF )
            // InternalNpl.g:230:1: rulePrice EOF
            {
             before(grammarAccess.getPriceRule()); 
            pushFollow(FOLLOW_1);
            rulePrice();

            state._fsp--;

             after(grammarAccess.getPriceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrice"


    // $ANTLR start "rulePrice"
    // InternalNpl.g:237:1: rulePrice : ( ( rule__Price__Group__0 ) ) ;
    public final void rulePrice() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:241:2: ( ( ( rule__Price__Group__0 ) ) )
            // InternalNpl.g:242:1: ( ( rule__Price__Group__0 ) )
            {
            // InternalNpl.g:242:1: ( ( rule__Price__Group__0 ) )
            // InternalNpl.g:243:1: ( rule__Price__Group__0 )
            {
             before(grammarAccess.getPriceAccess().getGroup()); 
            // InternalNpl.g:244:1: ( rule__Price__Group__0 )
            // InternalNpl.g:244:2: rule__Price__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Price__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPriceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrice"


    // $ANTLR start "entryRuleCurrency"
    // InternalNpl.g:256:1: entryRuleCurrency : ruleCurrency EOF ;
    public final void entryRuleCurrency() throws RecognitionException {
        try {
            // InternalNpl.g:257:1: ( ruleCurrency EOF )
            // InternalNpl.g:258:1: ruleCurrency EOF
            {
             before(grammarAccess.getCurrencyRule()); 
            pushFollow(FOLLOW_1);
            ruleCurrency();

            state._fsp--;

             after(grammarAccess.getCurrencyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCurrency"


    // $ANTLR start "ruleCurrency"
    // InternalNpl.g:265:1: ruleCurrency : ( ( rule__Currency__Alternatives ) ) ;
    public final void ruleCurrency() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:269:2: ( ( ( rule__Currency__Alternatives ) ) )
            // InternalNpl.g:270:1: ( ( rule__Currency__Alternatives ) )
            {
            // InternalNpl.g:270:1: ( ( rule__Currency__Alternatives ) )
            // InternalNpl.g:271:1: ( rule__Currency__Alternatives )
            {
             before(grammarAccess.getCurrencyAccess().getAlternatives()); 
            // InternalNpl.g:272:1: ( rule__Currency__Alternatives )
            // InternalNpl.g:272:2: rule__Currency__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Currency__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCurrencyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCurrency"


    // $ANTLR start "entryRuleTopic"
    // InternalNpl.g:284:1: entryRuleTopic : ruleTopic EOF ;
    public final void entryRuleTopic() throws RecognitionException {
        try {
            // InternalNpl.g:285:1: ( ruleTopic EOF )
            // InternalNpl.g:286:1: ruleTopic EOF
            {
             before(grammarAccess.getTopicRule()); 
            pushFollow(FOLLOW_1);
            ruleTopic();

            state._fsp--;

             after(grammarAccess.getTopicRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTopic"


    // $ANTLR start "ruleTopic"
    // InternalNpl.g:293:1: ruleTopic : ( ( rule__Topic__Group__0 ) ) ;
    public final void ruleTopic() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:297:2: ( ( ( rule__Topic__Group__0 ) ) )
            // InternalNpl.g:298:1: ( ( rule__Topic__Group__0 ) )
            {
            // InternalNpl.g:298:1: ( ( rule__Topic__Group__0 ) )
            // InternalNpl.g:299:1: ( rule__Topic__Group__0 )
            {
             before(grammarAccess.getTopicAccess().getGroup()); 
            // InternalNpl.g:300:1: ( rule__Topic__Group__0 )
            // InternalNpl.g:300:2: rule__Topic__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Topic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTopicAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTopic"


    // $ANTLR start "entryRulePair"
    // InternalNpl.g:312:1: entryRulePair : rulePair EOF ;
    public final void entryRulePair() throws RecognitionException {
        try {
            // InternalNpl.g:313:1: ( rulePair EOF )
            // InternalNpl.g:314:1: rulePair EOF
            {
             before(grammarAccess.getPairRule()); 
            pushFollow(FOLLOW_1);
            rulePair();

            state._fsp--;

             after(grammarAccess.getPairRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePair"


    // $ANTLR start "rulePair"
    // InternalNpl.g:321:1: rulePair : ( ( rule__Pair__Group__0 ) ) ;
    public final void rulePair() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:325:2: ( ( ( rule__Pair__Group__0 ) ) )
            // InternalNpl.g:326:1: ( ( rule__Pair__Group__0 ) )
            {
            // InternalNpl.g:326:1: ( ( rule__Pair__Group__0 ) )
            // InternalNpl.g:327:1: ( rule__Pair__Group__0 )
            {
             before(grammarAccess.getPairAccess().getGroup()); 
            // InternalNpl.g:328:1: ( rule__Pair__Group__0 )
            // InternalNpl.g:328:2: rule__Pair__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pair__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPairAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePair"


    // $ANTLR start "entryRuleFloat"
    // InternalNpl.g:340:1: entryRuleFloat : ruleFloat EOF ;
    public final void entryRuleFloat() throws RecognitionException {
        try {
            // InternalNpl.g:341:1: ( ruleFloat EOF )
            // InternalNpl.g:342:1: ruleFloat EOF
            {
             before(grammarAccess.getFloatRule()); 
            pushFollow(FOLLOW_1);
            ruleFloat();

            state._fsp--;

             after(grammarAccess.getFloatRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFloat"


    // $ANTLR start "ruleFloat"
    // InternalNpl.g:349:1: ruleFloat : ( ( rule__Float__Group__0 ) ) ;
    public final void ruleFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:353:2: ( ( ( rule__Float__Group__0 ) ) )
            // InternalNpl.g:354:1: ( ( rule__Float__Group__0 ) )
            {
            // InternalNpl.g:354:1: ( ( rule__Float__Group__0 ) )
            // InternalNpl.g:355:1: ( rule__Float__Group__0 )
            {
             before(grammarAccess.getFloatAccess().getGroup()); 
            // InternalNpl.g:356:1: ( rule__Float__Group__0 )
            // InternalNpl.g:356:2: rule__Float__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Float__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFloatAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFloat"


    // $ANTLR start "entryRuleFeedType"
    // InternalNpl.g:368:1: entryRuleFeedType : ruleFeedType EOF ;
    public final void entryRuleFeedType() throws RecognitionException {
        try {
            // InternalNpl.g:369:1: ( ruleFeedType EOF )
            // InternalNpl.g:370:1: ruleFeedType EOF
            {
             before(grammarAccess.getFeedTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleFeedType();

            state._fsp--;

             after(grammarAccess.getFeedTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeedType"


    // $ANTLR start "ruleFeedType"
    // InternalNpl.g:377:1: ruleFeedType : ( ( rule__FeedType__Alternatives ) ) ;
    public final void ruleFeedType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:381:2: ( ( ( rule__FeedType__Alternatives ) ) )
            // InternalNpl.g:382:1: ( ( rule__FeedType__Alternatives ) )
            {
            // InternalNpl.g:382:1: ( ( rule__FeedType__Alternatives ) )
            // InternalNpl.g:383:1: ( rule__FeedType__Alternatives )
            {
             before(grammarAccess.getFeedTypeAccess().getAlternatives()); 
            // InternalNpl.g:384:1: ( rule__FeedType__Alternatives )
            // InternalNpl.g:384:2: rule__FeedType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FeedType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFeedTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeedType"


    // $ANTLR start "rule__FontSize__Alternatives"
    // InternalNpl.g:396:1: rule__FontSize__Alternatives : ( ( ( rule__FontSize__ValueAssignment_0 ) ) | ( ( rule__FontSize__ValueAssignment_1 ) ) | ( ( rule__FontSize__ValueAssignment_2 ) ) );
    public final void rule__FontSize__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:400:1: ( ( ( rule__FontSize__ValueAssignment_0 ) ) | ( ( rule__FontSize__ValueAssignment_1 ) ) | ( ( rule__FontSize__ValueAssignment_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt1=1;
                }
                break;
            case 40:
                {
                alt1=2;
                }
                break;
            case 41:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalNpl.g:401:1: ( ( rule__FontSize__ValueAssignment_0 ) )
                    {
                    // InternalNpl.g:401:1: ( ( rule__FontSize__ValueAssignment_0 ) )
                    // InternalNpl.g:402:1: ( rule__FontSize__ValueAssignment_0 )
                    {
                     before(grammarAccess.getFontSizeAccess().getValueAssignment_0()); 
                    // InternalNpl.g:403:1: ( rule__FontSize__ValueAssignment_0 )
                    // InternalNpl.g:403:2: rule__FontSize__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FontSize__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFontSizeAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalNpl.g:407:6: ( ( rule__FontSize__ValueAssignment_1 ) )
                    {
                    // InternalNpl.g:407:6: ( ( rule__FontSize__ValueAssignment_1 ) )
                    // InternalNpl.g:408:1: ( rule__FontSize__ValueAssignment_1 )
                    {
                     before(grammarAccess.getFontSizeAccess().getValueAssignment_1()); 
                    // InternalNpl.g:409:1: ( rule__FontSize__ValueAssignment_1 )
                    // InternalNpl.g:409:2: rule__FontSize__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FontSize__ValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFontSizeAccess().getValueAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalNpl.g:413:6: ( ( rule__FontSize__ValueAssignment_2 ) )
                    {
                    // InternalNpl.g:413:6: ( ( rule__FontSize__ValueAssignment_2 ) )
                    // InternalNpl.g:414:1: ( rule__FontSize__ValueAssignment_2 )
                    {
                     before(grammarAccess.getFontSizeAccess().getValueAssignment_2()); 
                    // InternalNpl.g:415:1: ( rule__FontSize__ValueAssignment_2 )
                    // InternalNpl.g:415:2: rule__FontSize__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__FontSize__ValueAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getFontSizeAccess().getValueAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontSize__Alternatives"


    // $ANTLR start "rule__Format__Alternatives"
    // InternalNpl.g:424:1: rule__Format__Alternatives : ( ( ( rule__Format__ValueAssignment_0 ) ) | ( ( rule__Format__ValueAssignment_1 ) ) | ( ( rule__Format__ValueAssignment_2 ) ) | ( ( rule__Format__ValueAssignment_3 ) ) | ( ( rule__Format__ValueAssignment_4 ) ) | ( ( rule__Format__ValueAssignment_5 ) ) | ( ( rule__Format__ValueAssignment_6 ) ) );
    public final void rule__Format__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:428:1: ( ( ( rule__Format__ValueAssignment_0 ) ) | ( ( rule__Format__ValueAssignment_1 ) ) | ( ( rule__Format__ValueAssignment_2 ) ) | ( ( rule__Format__ValueAssignment_3 ) ) | ( ( rule__Format__ValueAssignment_4 ) ) | ( ( rule__Format__ValueAssignment_5 ) ) | ( ( rule__Format__ValueAssignment_6 ) ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt2=1;
                }
                break;
            case 43:
                {
                alt2=2;
                }
                break;
            case 44:
                {
                alt2=3;
                }
                break;
            case 45:
                {
                alt2=4;
                }
                break;
            case 46:
                {
                alt2=5;
                }
                break;
            case 47:
                {
                alt2=6;
                }
                break;
            case 48:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalNpl.g:429:1: ( ( rule__Format__ValueAssignment_0 ) )
                    {
                    // InternalNpl.g:429:1: ( ( rule__Format__ValueAssignment_0 ) )
                    // InternalNpl.g:430:1: ( rule__Format__ValueAssignment_0 )
                    {
                     before(grammarAccess.getFormatAccess().getValueAssignment_0()); 
                    // InternalNpl.g:431:1: ( rule__Format__ValueAssignment_0 )
                    // InternalNpl.g:431:2: rule__Format__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Format__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormatAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalNpl.g:435:6: ( ( rule__Format__ValueAssignment_1 ) )
                    {
                    // InternalNpl.g:435:6: ( ( rule__Format__ValueAssignment_1 ) )
                    // InternalNpl.g:436:1: ( rule__Format__ValueAssignment_1 )
                    {
                     before(grammarAccess.getFormatAccess().getValueAssignment_1()); 
                    // InternalNpl.g:437:1: ( rule__Format__ValueAssignment_1 )
                    // InternalNpl.g:437:2: rule__Format__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Format__ValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormatAccess().getValueAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalNpl.g:441:6: ( ( rule__Format__ValueAssignment_2 ) )
                    {
                    // InternalNpl.g:441:6: ( ( rule__Format__ValueAssignment_2 ) )
                    // InternalNpl.g:442:1: ( rule__Format__ValueAssignment_2 )
                    {
                     before(grammarAccess.getFormatAccess().getValueAssignment_2()); 
                    // InternalNpl.g:443:1: ( rule__Format__ValueAssignment_2 )
                    // InternalNpl.g:443:2: rule__Format__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Format__ValueAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormatAccess().getValueAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalNpl.g:447:6: ( ( rule__Format__ValueAssignment_3 ) )
                    {
                    // InternalNpl.g:447:6: ( ( rule__Format__ValueAssignment_3 ) )
                    // InternalNpl.g:448:1: ( rule__Format__ValueAssignment_3 )
                    {
                     before(grammarAccess.getFormatAccess().getValueAssignment_3()); 
                    // InternalNpl.g:449:1: ( rule__Format__ValueAssignment_3 )
                    // InternalNpl.g:449:2: rule__Format__ValueAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Format__ValueAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormatAccess().getValueAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalNpl.g:453:6: ( ( rule__Format__ValueAssignment_4 ) )
                    {
                    // InternalNpl.g:453:6: ( ( rule__Format__ValueAssignment_4 ) )
                    // InternalNpl.g:454:1: ( rule__Format__ValueAssignment_4 )
                    {
                     before(grammarAccess.getFormatAccess().getValueAssignment_4()); 
                    // InternalNpl.g:455:1: ( rule__Format__ValueAssignment_4 )
                    // InternalNpl.g:455:2: rule__Format__ValueAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Format__ValueAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormatAccess().getValueAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalNpl.g:459:6: ( ( rule__Format__ValueAssignment_5 ) )
                    {
                    // InternalNpl.g:459:6: ( ( rule__Format__ValueAssignment_5 ) )
                    // InternalNpl.g:460:1: ( rule__Format__ValueAssignment_5 )
                    {
                     before(grammarAccess.getFormatAccess().getValueAssignment_5()); 
                    // InternalNpl.g:461:1: ( rule__Format__ValueAssignment_5 )
                    // InternalNpl.g:461:2: rule__Format__ValueAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Format__ValueAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormatAccess().getValueAssignment_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalNpl.g:465:6: ( ( rule__Format__ValueAssignment_6 ) )
                    {
                    // InternalNpl.g:465:6: ( ( rule__Format__ValueAssignment_6 ) )
                    // InternalNpl.g:466:1: ( rule__Format__ValueAssignment_6 )
                    {
                     before(grammarAccess.getFormatAccess().getValueAssignment_6()); 
                    // InternalNpl.g:467:1: ( rule__Format__ValueAssignment_6 )
                    // InternalNpl.g:467:2: rule__Format__ValueAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Format__ValueAssignment_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormatAccess().getValueAssignment_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Format__Alternatives"


    // $ANTLR start "rule__Language__Alternatives"
    // InternalNpl.g:476:1: rule__Language__Alternatives : ( ( ( rule__Language__ValueAssignment_0 ) ) | ( ( rule__Language__ValueAssignment_1 ) ) );
    public final void rule__Language__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:480:1: ( ( ( rule__Language__ValueAssignment_0 ) ) | ( ( rule__Language__ValueAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==49) ) {
                alt3=1;
            }
            else if ( (LA3_0==50) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalNpl.g:481:1: ( ( rule__Language__ValueAssignment_0 ) )
                    {
                    // InternalNpl.g:481:1: ( ( rule__Language__ValueAssignment_0 ) )
                    // InternalNpl.g:482:1: ( rule__Language__ValueAssignment_0 )
                    {
                     before(grammarAccess.getLanguageAccess().getValueAssignment_0()); 
                    // InternalNpl.g:483:1: ( rule__Language__ValueAssignment_0 )
                    // InternalNpl.g:483:2: rule__Language__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Language__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLanguageAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalNpl.g:487:6: ( ( rule__Language__ValueAssignment_1 ) )
                    {
                    // InternalNpl.g:487:6: ( ( rule__Language__ValueAssignment_1 ) )
                    // InternalNpl.g:488:1: ( rule__Language__ValueAssignment_1 )
                    {
                     before(grammarAccess.getLanguageAccess().getValueAssignment_1()); 
                    // InternalNpl.g:489:1: ( rule__Language__ValueAssignment_1 )
                    // InternalNpl.g:489:2: rule__Language__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Language__ValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLanguageAccess().getValueAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__Alternatives"


    // $ANTLR start "rule__Currency__Alternatives"
    // InternalNpl.g:498:1: rule__Currency__Alternatives : ( ( ( rule__Currency__ValueAssignment_0 ) ) | ( ( rule__Currency__ValueAssignment_1 ) ) | ( ( rule__Currency__ValueAssignment_2 ) ) | ( ( rule__Currency__ValueAssignment_3 ) ) | ( ( rule__Currency__ValueAssignment_4 ) ) | ( ( rule__Currency__ValueAssignment_5 ) ) );
    public final void rule__Currency__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:502:1: ( ( ( rule__Currency__ValueAssignment_0 ) ) | ( ( rule__Currency__ValueAssignment_1 ) ) | ( ( rule__Currency__ValueAssignment_2 ) ) | ( ( rule__Currency__ValueAssignment_3 ) ) | ( ( rule__Currency__ValueAssignment_4 ) ) | ( ( rule__Currency__ValueAssignment_5 ) ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt4=1;
                }
                break;
            case 52:
                {
                alt4=2;
                }
                break;
            case 53:
                {
                alt4=3;
                }
                break;
            case 54:
                {
                alt4=4;
                }
                break;
            case 55:
                {
                alt4=5;
                }
                break;
            case 56:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalNpl.g:503:1: ( ( rule__Currency__ValueAssignment_0 ) )
                    {
                    // InternalNpl.g:503:1: ( ( rule__Currency__ValueAssignment_0 ) )
                    // InternalNpl.g:504:1: ( rule__Currency__ValueAssignment_0 )
                    {
                     before(grammarAccess.getCurrencyAccess().getValueAssignment_0()); 
                    // InternalNpl.g:505:1: ( rule__Currency__ValueAssignment_0 )
                    // InternalNpl.g:505:2: rule__Currency__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Currency__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCurrencyAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalNpl.g:509:6: ( ( rule__Currency__ValueAssignment_1 ) )
                    {
                    // InternalNpl.g:509:6: ( ( rule__Currency__ValueAssignment_1 ) )
                    // InternalNpl.g:510:1: ( rule__Currency__ValueAssignment_1 )
                    {
                     before(grammarAccess.getCurrencyAccess().getValueAssignment_1()); 
                    // InternalNpl.g:511:1: ( rule__Currency__ValueAssignment_1 )
                    // InternalNpl.g:511:2: rule__Currency__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Currency__ValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCurrencyAccess().getValueAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalNpl.g:515:6: ( ( rule__Currency__ValueAssignment_2 ) )
                    {
                    // InternalNpl.g:515:6: ( ( rule__Currency__ValueAssignment_2 ) )
                    // InternalNpl.g:516:1: ( rule__Currency__ValueAssignment_2 )
                    {
                     before(grammarAccess.getCurrencyAccess().getValueAssignment_2()); 
                    // InternalNpl.g:517:1: ( rule__Currency__ValueAssignment_2 )
                    // InternalNpl.g:517:2: rule__Currency__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Currency__ValueAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getCurrencyAccess().getValueAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalNpl.g:521:6: ( ( rule__Currency__ValueAssignment_3 ) )
                    {
                    // InternalNpl.g:521:6: ( ( rule__Currency__ValueAssignment_3 ) )
                    // InternalNpl.g:522:1: ( rule__Currency__ValueAssignment_3 )
                    {
                     before(grammarAccess.getCurrencyAccess().getValueAssignment_3()); 
                    // InternalNpl.g:523:1: ( rule__Currency__ValueAssignment_3 )
                    // InternalNpl.g:523:2: rule__Currency__ValueAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Currency__ValueAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getCurrencyAccess().getValueAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalNpl.g:527:6: ( ( rule__Currency__ValueAssignment_4 ) )
                    {
                    // InternalNpl.g:527:6: ( ( rule__Currency__ValueAssignment_4 ) )
                    // InternalNpl.g:528:1: ( rule__Currency__ValueAssignment_4 )
                    {
                     before(grammarAccess.getCurrencyAccess().getValueAssignment_4()); 
                    // InternalNpl.g:529:1: ( rule__Currency__ValueAssignment_4 )
                    // InternalNpl.g:529:2: rule__Currency__ValueAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Currency__ValueAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getCurrencyAccess().getValueAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalNpl.g:533:6: ( ( rule__Currency__ValueAssignment_5 ) )
                    {
                    // InternalNpl.g:533:6: ( ( rule__Currency__ValueAssignment_5 ) )
                    // InternalNpl.g:534:1: ( rule__Currency__ValueAssignment_5 )
                    {
                     before(grammarAccess.getCurrencyAccess().getValueAssignment_5()); 
                    // InternalNpl.g:535:1: ( rule__Currency__ValueAssignment_5 )
                    // InternalNpl.g:535:2: rule__Currency__ValueAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Currency__ValueAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getCurrencyAccess().getValueAssignment_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Currency__Alternatives"


    // $ANTLR start "rule__Float__Alternatives_1_0"
    // InternalNpl.g:544:1: rule__Float__Alternatives_1_0 : ( ( '.' ) | ( ',' ) );
    public final void rule__Float__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:548:1: ( ( '.' ) | ( ',' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            else if ( (LA5_0==13) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalNpl.g:549:1: ( '.' )
                    {
                    // InternalNpl.g:549:1: ( '.' )
                    // InternalNpl.g:550:1: '.'
                    {
                     before(grammarAccess.getFloatAccess().getFullStopKeyword_1_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getFloatAccess().getFullStopKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalNpl.g:557:6: ( ',' )
                    {
                    // InternalNpl.g:557:6: ( ',' )
                    // InternalNpl.g:558:1: ','
                    {
                     before(grammarAccess.getFloatAccess().getCommaKeyword_1_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getFloatAccess().getCommaKeyword_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Alternatives_1_0"


    // $ANTLR start "rule__FeedType__Alternatives"
    // InternalNpl.g:570:1: rule__FeedType__Alternatives : ( ( 'RSS' ) | ( 'Atom' ) );
    public final void rule__FeedType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:574:1: ( ( 'RSS' ) | ( 'Atom' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            else if ( (LA6_0==15) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalNpl.g:575:1: ( 'RSS' )
                    {
                    // InternalNpl.g:575:1: ( 'RSS' )
                    // InternalNpl.g:576:1: 'RSS'
                    {
                     before(grammarAccess.getFeedTypeAccess().getRSSKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getFeedTypeAccess().getRSSKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalNpl.g:583:6: ( 'Atom' )
                    {
                    // InternalNpl.g:583:6: ( 'Atom' )
                    // InternalNpl.g:584:1: 'Atom'
                    {
                     before(grammarAccess.getFeedTypeAccess().getAtomKeyword_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getFeedTypeAccess().getAtomKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeedType__Alternatives"


    // $ANTLR start "rule__Declaration__Group_0__0"
    // InternalNpl.g:598:1: rule__Declaration__Group_0__0 : rule__Declaration__Group_0__0__Impl rule__Declaration__Group_0__1 ;
    public final void rule__Declaration__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:602:1: ( rule__Declaration__Group_0__0__Impl rule__Declaration__Group_0__1 )
            // InternalNpl.g:603:2: rule__Declaration__Group_0__0__Impl rule__Declaration__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Declaration__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_0__0"


    // $ANTLR start "rule__Declaration__Group_0__0__Impl"
    // InternalNpl.g:610:1: rule__Declaration__Group_0__0__Impl : ( 'newspaper' ) ;
    public final void rule__Declaration__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:614:1: ( ( 'newspaper' ) )
            // InternalNpl.g:615:1: ( 'newspaper' )
            {
            // InternalNpl.g:615:1: ( 'newspaper' )
            // InternalNpl.g:616:1: 'newspaper'
            {
             before(grammarAccess.getDeclarationAccess().getNewspaperKeyword_0_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getNewspaperKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_0__0__Impl"


    // $ANTLR start "rule__Declaration__Group_0__1"
    // InternalNpl.g:629:1: rule__Declaration__Group_0__1 : rule__Declaration__Group_0__1__Impl rule__Declaration__Group_0__2 ;
    public final void rule__Declaration__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:633:1: ( rule__Declaration__Group_0__1__Impl rule__Declaration__Group_0__2 )
            // InternalNpl.g:634:2: rule__Declaration__Group_0__1__Impl rule__Declaration__Group_0__2
            {
            pushFollow(FOLLOW_4);
            rule__Declaration__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_0__1"


    // $ANTLR start "rule__Declaration__Group_0__1__Impl"
    // InternalNpl.g:641:1: rule__Declaration__Group_0__1__Impl : ( ( rule__Declaration__NameAssignment_0_1 ) ) ;
    public final void rule__Declaration__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:645:1: ( ( ( rule__Declaration__NameAssignment_0_1 ) ) )
            // InternalNpl.g:646:1: ( ( rule__Declaration__NameAssignment_0_1 ) )
            {
            // InternalNpl.g:646:1: ( ( rule__Declaration__NameAssignment_0_1 ) )
            // InternalNpl.g:647:1: ( rule__Declaration__NameAssignment_0_1 )
            {
             before(grammarAccess.getDeclarationAccess().getNameAssignment_0_1()); 
            // InternalNpl.g:648:1: ( rule__Declaration__NameAssignment_0_1 )
            // InternalNpl.g:648:2: rule__Declaration__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_0__1__Impl"


    // $ANTLR start "rule__Declaration__Group_0__2"
    // InternalNpl.g:658:1: rule__Declaration__Group_0__2 : rule__Declaration__Group_0__2__Impl ;
    public final void rule__Declaration__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:662:1: ( rule__Declaration__Group_0__2__Impl )
            // InternalNpl.g:663:2: rule__Declaration__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_0__2"


    // $ANTLR start "rule__Declaration__Group_0__2__Impl"
    // InternalNpl.g:669:1: rule__Declaration__Group_0__2__Impl : ( '{' ) ;
    public final void rule__Declaration__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:673:1: ( ( '{' ) )
            // InternalNpl.g:674:1: ( '{' )
            {
            // InternalNpl.g:674:1: ( '{' )
            // InternalNpl.g:675:1: '{'
            {
             before(grammarAccess.getDeclarationAccess().getLeftCurlyBracketKeyword_0_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getLeftCurlyBracketKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_0__2__Impl"


    // $ANTLR start "rule__Declaration__Group_1__0"
    // InternalNpl.g:694:1: rule__Declaration__Group_1__0 : rule__Declaration__Group_1__0__Impl rule__Declaration__Group_1__1 ;
    public final void rule__Declaration__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:698:1: ( rule__Declaration__Group_1__0__Impl rule__Declaration__Group_1__1 )
            // InternalNpl.g:699:2: rule__Declaration__Group_1__0__Impl rule__Declaration__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Declaration__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_1__0"


    // $ANTLR start "rule__Declaration__Group_1__0__Impl"
    // InternalNpl.g:706:1: rule__Declaration__Group_1__0__Impl : ( ( rule__Declaration__RecrawlAssignment_1_0 ) ) ;
    public final void rule__Declaration__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:710:1: ( ( ( rule__Declaration__RecrawlAssignment_1_0 ) ) )
            // InternalNpl.g:711:1: ( ( rule__Declaration__RecrawlAssignment_1_0 ) )
            {
            // InternalNpl.g:711:1: ( ( rule__Declaration__RecrawlAssignment_1_0 ) )
            // InternalNpl.g:712:1: ( rule__Declaration__RecrawlAssignment_1_0 )
            {
             before(grammarAccess.getDeclarationAccess().getRecrawlAssignment_1_0()); 
            // InternalNpl.g:713:1: ( rule__Declaration__RecrawlAssignment_1_0 )
            // InternalNpl.g:713:2: rule__Declaration__RecrawlAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__RecrawlAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getRecrawlAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_1__0__Impl"


    // $ANTLR start "rule__Declaration__Group_1__1"
    // InternalNpl.g:723:1: rule__Declaration__Group_1__1 : rule__Declaration__Group_1__1__Impl rule__Declaration__Group_1__2 ;
    public final void rule__Declaration__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:727:1: ( rule__Declaration__Group_1__1__Impl rule__Declaration__Group_1__2 )
            // InternalNpl.g:728:2: rule__Declaration__Group_1__1__Impl rule__Declaration__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__Declaration__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_1__1"


    // $ANTLR start "rule__Declaration__Group_1__1__Impl"
    // InternalNpl.g:735:1: rule__Declaration__Group_1__1__Impl : ( 'feed links' ) ;
    public final void rule__Declaration__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:739:1: ( ( 'feed links' ) )
            // InternalNpl.g:740:1: ( 'feed links' )
            {
            // InternalNpl.g:740:1: ( 'feed links' )
            // InternalNpl.g:741:1: 'feed links'
            {
             before(grammarAccess.getDeclarationAccess().getFeedLinksKeyword_1_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getFeedLinksKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_1__1__Impl"


    // $ANTLR start "rule__Declaration__Group_1__2"
    // InternalNpl.g:754:1: rule__Declaration__Group_1__2 : rule__Declaration__Group_1__2__Impl rule__Declaration__Group_1__3 ;
    public final void rule__Declaration__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:758:1: ( rule__Declaration__Group_1__2__Impl rule__Declaration__Group_1__3 )
            // InternalNpl.g:759:2: rule__Declaration__Group_1__2__Impl rule__Declaration__Group_1__3
            {
            pushFollow(FOLLOW_6);
            rule__Declaration__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_1__2"


    // $ANTLR start "rule__Declaration__Group_1__2__Impl"
    // InternalNpl.g:766:1: rule__Declaration__Group_1__2__Impl : ( '{' ) ;
    public final void rule__Declaration__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:770:1: ( ( '{' ) )
            // InternalNpl.g:771:1: ( '{' )
            {
            // InternalNpl.g:771:1: ( '{' )
            // InternalNpl.g:772:1: '{'
            {
             before(grammarAccess.getDeclarationAccess().getLeftCurlyBracketKeyword_1_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getLeftCurlyBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_1__2__Impl"


    // $ANTLR start "rule__Declaration__Group_1__3"
    // InternalNpl.g:785:1: rule__Declaration__Group_1__3 : rule__Declaration__Group_1__3__Impl rule__Declaration__Group_1__4 ;
    public final void rule__Declaration__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:789:1: ( rule__Declaration__Group_1__3__Impl rule__Declaration__Group_1__4 )
            // InternalNpl.g:790:2: rule__Declaration__Group_1__3__Impl rule__Declaration__Group_1__4
            {
            pushFollow(FOLLOW_7);
            rule__Declaration__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_1__3"


    // $ANTLR start "rule__Declaration__Group_1__3__Impl"
    // InternalNpl.g:797:1: rule__Declaration__Group_1__3__Impl : ( ( rule__Declaration__FeedlinksAssignment_1_3 ) ) ;
    public final void rule__Declaration__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:801:1: ( ( ( rule__Declaration__FeedlinksAssignment_1_3 ) ) )
            // InternalNpl.g:802:1: ( ( rule__Declaration__FeedlinksAssignment_1_3 ) )
            {
            // InternalNpl.g:802:1: ( ( rule__Declaration__FeedlinksAssignment_1_3 ) )
            // InternalNpl.g:803:1: ( rule__Declaration__FeedlinksAssignment_1_3 )
            {
             before(grammarAccess.getDeclarationAccess().getFeedlinksAssignment_1_3()); 
            // InternalNpl.g:804:1: ( rule__Declaration__FeedlinksAssignment_1_3 )
            // InternalNpl.g:804:2: rule__Declaration__FeedlinksAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__FeedlinksAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getFeedlinksAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_1__3__Impl"


    // $ANTLR start "rule__Declaration__Group_1__4"
    // InternalNpl.g:814:1: rule__Declaration__Group_1__4 : rule__Declaration__Group_1__4__Impl rule__Declaration__Group_1__5 ;
    public final void rule__Declaration__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:818:1: ( rule__Declaration__Group_1__4__Impl rule__Declaration__Group_1__5 )
            // InternalNpl.g:819:2: rule__Declaration__Group_1__4__Impl rule__Declaration__Group_1__5
            {
            pushFollow(FOLLOW_7);
            rule__Declaration__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_1__4"


    // $ANTLR start "rule__Declaration__Group_1__4__Impl"
    // InternalNpl.g:826:1: rule__Declaration__Group_1__4__Impl : ( ( rule__Declaration__FeedlinksAssignment_1_4 )* ) ;
    public final void rule__Declaration__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:830:1: ( ( ( rule__Declaration__FeedlinksAssignment_1_4 )* ) )
            // InternalNpl.g:831:1: ( ( rule__Declaration__FeedlinksAssignment_1_4 )* )
            {
            // InternalNpl.g:831:1: ( ( rule__Declaration__FeedlinksAssignment_1_4 )* )
            // InternalNpl.g:832:1: ( rule__Declaration__FeedlinksAssignment_1_4 )*
            {
             before(grammarAccess.getDeclarationAccess().getFeedlinksAssignment_1_4()); 
            // InternalNpl.g:833:1: ( rule__Declaration__FeedlinksAssignment_1_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=14 && LA7_0<=15)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalNpl.g:833:2: rule__Declaration__FeedlinksAssignment_1_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Declaration__FeedlinksAssignment_1_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getDeclarationAccess().getFeedlinksAssignment_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_1__4__Impl"


    // $ANTLR start "rule__Declaration__Group_1__5"
    // InternalNpl.g:843:1: rule__Declaration__Group_1__5 : rule__Declaration__Group_1__5__Impl ;
    public final void rule__Declaration__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:847:1: ( rule__Declaration__Group_1__5__Impl )
            // InternalNpl.g:848:2: rule__Declaration__Group_1__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Group_1__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_1__5"


    // $ANTLR start "rule__Declaration__Group_1__5__Impl"
    // InternalNpl.g:854:1: rule__Declaration__Group_1__5__Impl : ( '}' ) ;
    public final void rule__Declaration__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:858:1: ( ( '}' ) )
            // InternalNpl.g:859:1: ( '}' )
            {
            // InternalNpl.g:859:1: ( '}' )
            // InternalNpl.g:860:1: '}'
            {
             before(grammarAccess.getDeclarationAccess().getRightCurlyBracketKeyword_1_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getRightCurlyBracketKeyword_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_1__5__Impl"


    // $ANTLR start "rule__Declaration__Group_2__0"
    // InternalNpl.g:885:1: rule__Declaration__Group_2__0 : rule__Declaration__Group_2__0__Impl rule__Declaration__Group_2__1 ;
    public final void rule__Declaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:889:1: ( rule__Declaration__Group_2__0__Impl rule__Declaration__Group_2__1 )
            // InternalNpl.g:890:2: rule__Declaration__Group_2__0__Impl rule__Declaration__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Declaration__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_2__0"


    // $ANTLR start "rule__Declaration__Group_2__0__Impl"
    // InternalNpl.g:897:1: rule__Declaration__Group_2__0__Impl : ( 'topics' ) ;
    public final void rule__Declaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:901:1: ( ( 'topics' ) )
            // InternalNpl.g:902:1: ( 'topics' )
            {
            // InternalNpl.g:902:1: ( 'topics' )
            // InternalNpl.g:903:1: 'topics'
            {
             before(grammarAccess.getDeclarationAccess().getTopicsKeyword_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getTopicsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_2__0__Impl"


    // $ANTLR start "rule__Declaration__Group_2__1"
    // InternalNpl.g:916:1: rule__Declaration__Group_2__1 : rule__Declaration__Group_2__1__Impl rule__Declaration__Group_2__2 ;
    public final void rule__Declaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:920:1: ( rule__Declaration__Group_2__1__Impl rule__Declaration__Group_2__2 )
            // InternalNpl.g:921:2: rule__Declaration__Group_2__1__Impl rule__Declaration__Group_2__2
            {
            pushFollow(FOLLOW_9);
            rule__Declaration__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_2__1"


    // $ANTLR start "rule__Declaration__Group_2__1__Impl"
    // InternalNpl.g:928:1: rule__Declaration__Group_2__1__Impl : ( '{' ) ;
    public final void rule__Declaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:932:1: ( ( '{' ) )
            // InternalNpl.g:933:1: ( '{' )
            {
            // InternalNpl.g:933:1: ( '{' )
            // InternalNpl.g:934:1: '{'
            {
             before(grammarAccess.getDeclarationAccess().getLeftCurlyBracketKeyword_2_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getLeftCurlyBracketKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_2__1__Impl"


    // $ANTLR start "rule__Declaration__Group_2__2"
    // InternalNpl.g:947:1: rule__Declaration__Group_2__2 : rule__Declaration__Group_2__2__Impl rule__Declaration__Group_2__3 ;
    public final void rule__Declaration__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:951:1: ( rule__Declaration__Group_2__2__Impl rule__Declaration__Group_2__3 )
            // InternalNpl.g:952:2: rule__Declaration__Group_2__2__Impl rule__Declaration__Group_2__3
            {
            pushFollow(FOLLOW_10);
            rule__Declaration__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_2__2"


    // $ANTLR start "rule__Declaration__Group_2__2__Impl"
    // InternalNpl.g:959:1: rule__Declaration__Group_2__2__Impl : ( ( rule__Declaration__TopicsAssignment_2_2 ) ) ;
    public final void rule__Declaration__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:963:1: ( ( ( rule__Declaration__TopicsAssignment_2_2 ) ) )
            // InternalNpl.g:964:1: ( ( rule__Declaration__TopicsAssignment_2_2 ) )
            {
            // InternalNpl.g:964:1: ( ( rule__Declaration__TopicsAssignment_2_2 ) )
            // InternalNpl.g:965:1: ( rule__Declaration__TopicsAssignment_2_2 )
            {
             before(grammarAccess.getDeclarationAccess().getTopicsAssignment_2_2()); 
            // InternalNpl.g:966:1: ( rule__Declaration__TopicsAssignment_2_2 )
            // InternalNpl.g:966:2: rule__Declaration__TopicsAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__TopicsAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getTopicsAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_2__2__Impl"


    // $ANTLR start "rule__Declaration__Group_2__3"
    // InternalNpl.g:976:1: rule__Declaration__Group_2__3 : rule__Declaration__Group_2__3__Impl rule__Declaration__Group_2__4 ;
    public final void rule__Declaration__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:980:1: ( rule__Declaration__Group_2__3__Impl rule__Declaration__Group_2__4 )
            // InternalNpl.g:981:2: rule__Declaration__Group_2__3__Impl rule__Declaration__Group_2__4
            {
            pushFollow(FOLLOW_10);
            rule__Declaration__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_2__3"


    // $ANTLR start "rule__Declaration__Group_2__3__Impl"
    // InternalNpl.g:988:1: rule__Declaration__Group_2__3__Impl : ( ( rule__Declaration__TopicsAssignment_2_3 )* ) ;
    public final void rule__Declaration__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:992:1: ( ( ( rule__Declaration__TopicsAssignment_2_3 )* ) )
            // InternalNpl.g:993:1: ( ( rule__Declaration__TopicsAssignment_2_3 )* )
            {
            // InternalNpl.g:993:1: ( ( rule__Declaration__TopicsAssignment_2_3 )* )
            // InternalNpl.g:994:1: ( rule__Declaration__TopicsAssignment_2_3 )*
            {
             before(grammarAccess.getDeclarationAccess().getTopicsAssignment_2_3()); 
            // InternalNpl.g:995:1: ( rule__Declaration__TopicsAssignment_2_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==34) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalNpl.g:995:2: rule__Declaration__TopicsAssignment_2_3
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Declaration__TopicsAssignment_2_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getDeclarationAccess().getTopicsAssignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_2__3__Impl"


    // $ANTLR start "rule__Declaration__Group_2__4"
    // InternalNpl.g:1005:1: rule__Declaration__Group_2__4 : rule__Declaration__Group_2__4__Impl ;
    public final void rule__Declaration__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1009:1: ( rule__Declaration__Group_2__4__Impl )
            // InternalNpl.g:1010:2: rule__Declaration__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_2__4"


    // $ANTLR start "rule__Declaration__Group_2__4__Impl"
    // InternalNpl.g:1016:1: rule__Declaration__Group_2__4__Impl : ( '}' ) ;
    public final void rule__Declaration__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1020:1: ( ( '}' ) )
            // InternalNpl.g:1021:1: ( '}' )
            {
            // InternalNpl.g:1021:1: ( '}' )
            // InternalNpl.g:1022:1: '}'
            {
             before(grammarAccess.getDeclarationAccess().getRightCurlyBracketKeyword_2_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getRightCurlyBracketKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_2__4__Impl"


    // $ANTLR start "rule__Declaration__Group_3__0"
    // InternalNpl.g:1045:1: rule__Declaration__Group_3__0 : rule__Declaration__Group_3__0__Impl rule__Declaration__Group_3__1 ;
    public final void rule__Declaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1049:1: ( rule__Declaration__Group_3__0__Impl rule__Declaration__Group_3__1 )
            // InternalNpl.g:1050:2: rule__Declaration__Group_3__0__Impl rule__Declaration__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Declaration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_3__0"


    // $ANTLR start "rule__Declaration__Group_3__0__Impl"
    // InternalNpl.g:1057:1: rule__Declaration__Group_3__0__Impl : ( 'optional: date' ) ;
    public final void rule__Declaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1061:1: ( ( 'optional: date' ) )
            // InternalNpl.g:1062:1: ( 'optional: date' )
            {
            // InternalNpl.g:1062:1: ( 'optional: date' )
            // InternalNpl.g:1063:1: 'optional: date'
            {
             before(grammarAccess.getDeclarationAccess().getOptionalDateKeyword_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getOptionalDateKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_3__0__Impl"


    // $ANTLR start "rule__Declaration__Group_3__1"
    // InternalNpl.g:1076:1: rule__Declaration__Group_3__1 : rule__Declaration__Group_3__1__Impl ;
    public final void rule__Declaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1080:1: ( rule__Declaration__Group_3__1__Impl )
            // InternalNpl.g:1081:2: rule__Declaration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_3__1"


    // $ANTLR start "rule__Declaration__Group_3__1__Impl"
    // InternalNpl.g:1087:1: rule__Declaration__Group_3__1__Impl : ( ( rule__Declaration__DateAssignment_3_1 ) ) ;
    public final void rule__Declaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1091:1: ( ( ( rule__Declaration__DateAssignment_3_1 ) ) )
            // InternalNpl.g:1092:1: ( ( rule__Declaration__DateAssignment_3_1 ) )
            {
            // InternalNpl.g:1092:1: ( ( rule__Declaration__DateAssignment_3_1 ) )
            // InternalNpl.g:1093:1: ( rule__Declaration__DateAssignment_3_1 )
            {
             before(grammarAccess.getDeclarationAccess().getDateAssignment_3_1()); 
            // InternalNpl.g:1094:1: ( rule__Declaration__DateAssignment_3_1 )
            // InternalNpl.g:1094:2: rule__Declaration__DateAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__DateAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getDateAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_3__1__Impl"


    // $ANTLR start "rule__Declaration__Group_4__0"
    // InternalNpl.g:1108:1: rule__Declaration__Group_4__0 : rule__Declaration__Group_4__0__Impl rule__Declaration__Group_4__1 ;
    public final void rule__Declaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1112:1: ( rule__Declaration__Group_4__0__Impl rule__Declaration__Group_4__1 )
            // InternalNpl.g:1113:2: rule__Declaration__Group_4__0__Impl rule__Declaration__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__Declaration__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_4__0"


    // $ANTLR start "rule__Declaration__Group_4__0__Impl"
    // InternalNpl.g:1120:1: rule__Declaration__Group_4__0__Impl : ( 'optional: location' ) ;
    public final void rule__Declaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1124:1: ( ( 'optional: location' ) )
            // InternalNpl.g:1125:1: ( 'optional: location' )
            {
            // InternalNpl.g:1125:1: ( 'optional: location' )
            // InternalNpl.g:1126:1: 'optional: location'
            {
             before(grammarAccess.getDeclarationAccess().getOptionalLocationKeyword_4_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getOptionalLocationKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_4__0__Impl"


    // $ANTLR start "rule__Declaration__Group_4__1"
    // InternalNpl.g:1139:1: rule__Declaration__Group_4__1 : rule__Declaration__Group_4__1__Impl ;
    public final void rule__Declaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1143:1: ( rule__Declaration__Group_4__1__Impl )
            // InternalNpl.g:1144:2: rule__Declaration__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_4__1"


    // $ANTLR start "rule__Declaration__Group_4__1__Impl"
    // InternalNpl.g:1150:1: rule__Declaration__Group_4__1__Impl : ( ( rule__Declaration__LocationAssignment_4_1 ) ) ;
    public final void rule__Declaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1154:1: ( ( ( rule__Declaration__LocationAssignment_4_1 ) ) )
            // InternalNpl.g:1155:1: ( ( rule__Declaration__LocationAssignment_4_1 ) )
            {
            // InternalNpl.g:1155:1: ( ( rule__Declaration__LocationAssignment_4_1 ) )
            // InternalNpl.g:1156:1: ( rule__Declaration__LocationAssignment_4_1 )
            {
             before(grammarAccess.getDeclarationAccess().getLocationAssignment_4_1()); 
            // InternalNpl.g:1157:1: ( rule__Declaration__LocationAssignment_4_1 )
            // InternalNpl.g:1157:2: rule__Declaration__LocationAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__LocationAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getLocationAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_4__1__Impl"


    // $ANTLR start "rule__Declaration__Group_5__0"
    // InternalNpl.g:1171:1: rule__Declaration__Group_5__0 : rule__Declaration__Group_5__0__Impl rule__Declaration__Group_5__1 ;
    public final void rule__Declaration__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1175:1: ( rule__Declaration__Group_5__0__Impl rule__Declaration__Group_5__1 )
            // InternalNpl.g:1176:2: rule__Declaration__Group_5__0__Impl rule__Declaration__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Declaration__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_5__0"


    // $ANTLR start "rule__Declaration__Group_5__0__Impl"
    // InternalNpl.g:1183:1: rule__Declaration__Group_5__0__Impl : ( 'optional: price' ) ;
    public final void rule__Declaration__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1187:1: ( ( 'optional: price' ) )
            // InternalNpl.g:1188:1: ( 'optional: price' )
            {
            // InternalNpl.g:1188:1: ( 'optional: price' )
            // InternalNpl.g:1189:1: 'optional: price'
            {
             before(grammarAccess.getDeclarationAccess().getOptionalPriceKeyword_5_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getOptionalPriceKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_5__0__Impl"


    // $ANTLR start "rule__Declaration__Group_5__1"
    // InternalNpl.g:1202:1: rule__Declaration__Group_5__1 : rule__Declaration__Group_5__1__Impl ;
    public final void rule__Declaration__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1206:1: ( rule__Declaration__Group_5__1__Impl )
            // InternalNpl.g:1207:2: rule__Declaration__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_5__1"


    // $ANTLR start "rule__Declaration__Group_5__1__Impl"
    // InternalNpl.g:1213:1: rule__Declaration__Group_5__1__Impl : ( ( rule__Declaration__PriceAssignment_5_1 ) ) ;
    public final void rule__Declaration__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1217:1: ( ( ( rule__Declaration__PriceAssignment_5_1 ) ) )
            // InternalNpl.g:1218:1: ( ( rule__Declaration__PriceAssignment_5_1 ) )
            {
            // InternalNpl.g:1218:1: ( ( rule__Declaration__PriceAssignment_5_1 ) )
            // InternalNpl.g:1219:1: ( rule__Declaration__PriceAssignment_5_1 )
            {
             before(grammarAccess.getDeclarationAccess().getPriceAssignment_5_1()); 
            // InternalNpl.g:1220:1: ( rule__Declaration__PriceAssignment_5_1 )
            // InternalNpl.g:1220:2: rule__Declaration__PriceAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__PriceAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getPriceAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_5__1__Impl"


    // $ANTLR start "rule__Declaration__Group_6__0"
    // InternalNpl.g:1234:1: rule__Declaration__Group_6__0 : rule__Declaration__Group_6__0__Impl rule__Declaration__Group_6__1 ;
    public final void rule__Declaration__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1238:1: ( rule__Declaration__Group_6__0__Impl rule__Declaration__Group_6__1 )
            // InternalNpl.g:1239:2: rule__Declaration__Group_6__0__Impl rule__Declaration__Group_6__1
            {
            pushFollow(FOLLOW_13);
            rule__Declaration__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_6__0"


    // $ANTLR start "rule__Declaration__Group_6__0__Impl"
    // InternalNpl.g:1246:1: rule__Declaration__Group_6__0__Impl : ( 'optional: volume' ) ;
    public final void rule__Declaration__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1250:1: ( ( 'optional: volume' ) )
            // InternalNpl.g:1251:1: ( 'optional: volume' )
            {
            // InternalNpl.g:1251:1: ( 'optional: volume' )
            // InternalNpl.g:1252:1: 'optional: volume'
            {
             before(grammarAccess.getDeclarationAccess().getOptionalVolumeKeyword_6_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getOptionalVolumeKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_6__0__Impl"


    // $ANTLR start "rule__Declaration__Group_6__1"
    // InternalNpl.g:1265:1: rule__Declaration__Group_6__1 : rule__Declaration__Group_6__1__Impl rule__Declaration__Group_6__2 ;
    public final void rule__Declaration__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1269:1: ( rule__Declaration__Group_6__1__Impl rule__Declaration__Group_6__2 )
            // InternalNpl.g:1270:2: rule__Declaration__Group_6__1__Impl rule__Declaration__Group_6__2
            {
            pushFollow(FOLLOW_14);
            rule__Declaration__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_6__1"


    // $ANTLR start "rule__Declaration__Group_6__1__Impl"
    // InternalNpl.g:1277:1: rule__Declaration__Group_6__1__Impl : ( ( rule__Declaration__VolumeAssignment_6_1 ) ) ;
    public final void rule__Declaration__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1281:1: ( ( ( rule__Declaration__VolumeAssignment_6_1 ) ) )
            // InternalNpl.g:1282:1: ( ( rule__Declaration__VolumeAssignment_6_1 ) )
            {
            // InternalNpl.g:1282:1: ( ( rule__Declaration__VolumeAssignment_6_1 ) )
            // InternalNpl.g:1283:1: ( rule__Declaration__VolumeAssignment_6_1 )
            {
             before(grammarAccess.getDeclarationAccess().getVolumeAssignment_6_1()); 
            // InternalNpl.g:1284:1: ( rule__Declaration__VolumeAssignment_6_1 )
            // InternalNpl.g:1284:2: rule__Declaration__VolumeAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__VolumeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getVolumeAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_6__1__Impl"


    // $ANTLR start "rule__Declaration__Group_6__2"
    // InternalNpl.g:1294:1: rule__Declaration__Group_6__2 : rule__Declaration__Group_6__2__Impl ;
    public final void rule__Declaration__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1298:1: ( rule__Declaration__Group_6__2__Impl )
            // InternalNpl.g:1299:2: rule__Declaration__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_6__2"


    // $ANTLR start "rule__Declaration__Group_6__2__Impl"
    // InternalNpl.g:1305:1: rule__Declaration__Group_6__2__Impl : ( ( rule__Declaration__Group_6_2__0 )? ) ;
    public final void rule__Declaration__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1309:1: ( ( ( rule__Declaration__Group_6_2__0 )? ) )
            // InternalNpl.g:1310:1: ( ( rule__Declaration__Group_6_2__0 )? )
            {
            // InternalNpl.g:1310:1: ( ( rule__Declaration__Group_6_2__0 )? )
            // InternalNpl.g:1311:1: ( rule__Declaration__Group_6_2__0 )?
            {
             before(grammarAccess.getDeclarationAccess().getGroup_6_2()); 
            // InternalNpl.g:1312:1: ( rule__Declaration__Group_6_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalNpl.g:1312:2: rule__Declaration__Group_6_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Declaration__Group_6_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeclarationAccess().getGroup_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_6__2__Impl"


    // $ANTLR start "rule__Declaration__Group_6_2__0"
    // InternalNpl.g:1328:1: rule__Declaration__Group_6_2__0 : rule__Declaration__Group_6_2__0__Impl rule__Declaration__Group_6_2__1 ;
    public final void rule__Declaration__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1332:1: ( rule__Declaration__Group_6_2__0__Impl rule__Declaration__Group_6_2__1 )
            // InternalNpl.g:1333:2: rule__Declaration__Group_6_2__0__Impl rule__Declaration__Group_6_2__1
            {
            pushFollow(FOLLOW_13);
            rule__Declaration__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group_6_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_6_2__0"


    // $ANTLR start "rule__Declaration__Group_6_2__0__Impl"
    // InternalNpl.g:1340:1: rule__Declaration__Group_6_2__0__Impl : ( 'no.' ) ;
    public final void rule__Declaration__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1344:1: ( ( 'no.' ) )
            // InternalNpl.g:1345:1: ( 'no.' )
            {
            // InternalNpl.g:1345:1: ( 'no.' )
            // InternalNpl.g:1346:1: 'no.'
            {
             before(grammarAccess.getDeclarationAccess().getNoKeyword_6_2_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getNoKeyword_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_6_2__0__Impl"


    // $ANTLR start "rule__Declaration__Group_6_2__1"
    // InternalNpl.g:1359:1: rule__Declaration__Group_6_2__1 : rule__Declaration__Group_6_2__1__Impl ;
    public final void rule__Declaration__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1363:1: ( rule__Declaration__Group_6_2__1__Impl )
            // InternalNpl.g:1364:2: rule__Declaration__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Group_6_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_6_2__1"


    // $ANTLR start "rule__Declaration__Group_6_2__1__Impl"
    // InternalNpl.g:1370:1: rule__Declaration__Group_6_2__1__Impl : ( ( rule__Declaration__NumberAssignment_6_2_1 ) ) ;
    public final void rule__Declaration__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1374:1: ( ( ( rule__Declaration__NumberAssignment_6_2_1 ) ) )
            // InternalNpl.g:1375:1: ( ( rule__Declaration__NumberAssignment_6_2_1 ) )
            {
            // InternalNpl.g:1375:1: ( ( rule__Declaration__NumberAssignment_6_2_1 ) )
            // InternalNpl.g:1376:1: ( rule__Declaration__NumberAssignment_6_2_1 )
            {
             before(grammarAccess.getDeclarationAccess().getNumberAssignment_6_2_1()); 
            // InternalNpl.g:1377:1: ( rule__Declaration__NumberAssignment_6_2_1 )
            // InternalNpl.g:1377:2: rule__Declaration__NumberAssignment_6_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__NumberAssignment_6_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getNumberAssignment_6_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_6_2__1__Impl"


    // $ANTLR start "rule__Declaration__Group_7__0"
    // InternalNpl.g:1391:1: rule__Declaration__Group_7__0 : rule__Declaration__Group_7__0__Impl rule__Declaration__Group_7__1 ;
    public final void rule__Declaration__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1395:1: ( rule__Declaration__Group_7__0__Impl rule__Declaration__Group_7__1 )
            // InternalNpl.g:1396:2: rule__Declaration__Group_7__0__Impl rule__Declaration__Group_7__1
            {
            pushFollow(FOLLOW_15);
            rule__Declaration__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_7__0"


    // $ANTLR start "rule__Declaration__Group_7__0__Impl"
    // InternalNpl.g:1403:1: rule__Declaration__Group_7__0__Impl : ( 'optional: language' ) ;
    public final void rule__Declaration__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1407:1: ( ( 'optional: language' ) )
            // InternalNpl.g:1408:1: ( 'optional: language' )
            {
            // InternalNpl.g:1408:1: ( 'optional: language' )
            // InternalNpl.g:1409:1: 'optional: language'
            {
             before(grammarAccess.getDeclarationAccess().getOptionalLanguageKeyword_7_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getOptionalLanguageKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_7__0__Impl"


    // $ANTLR start "rule__Declaration__Group_7__1"
    // InternalNpl.g:1422:1: rule__Declaration__Group_7__1 : rule__Declaration__Group_7__1__Impl ;
    public final void rule__Declaration__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1426:1: ( rule__Declaration__Group_7__1__Impl )
            // InternalNpl.g:1427:2: rule__Declaration__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_7__1"


    // $ANTLR start "rule__Declaration__Group_7__1__Impl"
    // InternalNpl.g:1433:1: rule__Declaration__Group_7__1__Impl : ( ( rule__Declaration__LanguageAssignment_7_1 ) ) ;
    public final void rule__Declaration__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1437:1: ( ( ( rule__Declaration__LanguageAssignment_7_1 ) ) )
            // InternalNpl.g:1438:1: ( ( rule__Declaration__LanguageAssignment_7_1 ) )
            {
            // InternalNpl.g:1438:1: ( ( rule__Declaration__LanguageAssignment_7_1 ) )
            // InternalNpl.g:1439:1: ( rule__Declaration__LanguageAssignment_7_1 )
            {
             before(grammarAccess.getDeclarationAccess().getLanguageAssignment_7_1()); 
            // InternalNpl.g:1440:1: ( rule__Declaration__LanguageAssignment_7_1 )
            // InternalNpl.g:1440:2: rule__Declaration__LanguageAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__LanguageAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getLanguageAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_7__1__Impl"


    // $ANTLR start "rule__Declaration__Group_8__0"
    // InternalNpl.g:1454:1: rule__Declaration__Group_8__0 : rule__Declaration__Group_8__0__Impl rule__Declaration__Group_8__1 ;
    public final void rule__Declaration__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1458:1: ( rule__Declaration__Group_8__0__Impl rule__Declaration__Group_8__1 )
            // InternalNpl.g:1459:2: rule__Declaration__Group_8__0__Impl rule__Declaration__Group_8__1
            {
            pushFollow(FOLLOW_16);
            rule__Declaration__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_8__0"


    // $ANTLR start "rule__Declaration__Group_8__0__Impl"
    // InternalNpl.g:1466:1: rule__Declaration__Group_8__0__Impl : ( 'format' ) ;
    public final void rule__Declaration__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1470:1: ( ( 'format' ) )
            // InternalNpl.g:1471:1: ( 'format' )
            {
            // InternalNpl.g:1471:1: ( 'format' )
            // InternalNpl.g:1472:1: 'format'
            {
             before(grammarAccess.getDeclarationAccess().getFormatKeyword_8_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getFormatKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_8__0__Impl"


    // $ANTLR start "rule__Declaration__Group_8__1"
    // InternalNpl.g:1485:1: rule__Declaration__Group_8__1 : rule__Declaration__Group_8__1__Impl ;
    public final void rule__Declaration__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1489:1: ( rule__Declaration__Group_8__1__Impl )
            // InternalNpl.g:1490:2: rule__Declaration__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_8__1"


    // $ANTLR start "rule__Declaration__Group_8__1__Impl"
    // InternalNpl.g:1496:1: rule__Declaration__Group_8__1__Impl : ( ( rule__Declaration__FormatAssignment_8_1 ) ) ;
    public final void rule__Declaration__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1500:1: ( ( ( rule__Declaration__FormatAssignment_8_1 ) ) )
            // InternalNpl.g:1501:1: ( ( rule__Declaration__FormatAssignment_8_1 ) )
            {
            // InternalNpl.g:1501:1: ( ( rule__Declaration__FormatAssignment_8_1 ) )
            // InternalNpl.g:1502:1: ( rule__Declaration__FormatAssignment_8_1 )
            {
             before(grammarAccess.getDeclarationAccess().getFormatAssignment_8_1()); 
            // InternalNpl.g:1503:1: ( rule__Declaration__FormatAssignment_8_1 )
            // InternalNpl.g:1503:2: rule__Declaration__FormatAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__FormatAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getFormatAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_8__1__Impl"


    // $ANTLR start "rule__Declaration__Group_9__0"
    // InternalNpl.g:1517:1: rule__Declaration__Group_9__0 : rule__Declaration__Group_9__0__Impl rule__Declaration__Group_9__1 ;
    public final void rule__Declaration__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1521:1: ( rule__Declaration__Group_9__0__Impl rule__Declaration__Group_9__1 )
            // InternalNpl.g:1522:2: rule__Declaration__Group_9__0__Impl rule__Declaration__Group_9__1
            {
            pushFollow(FOLLOW_13);
            rule__Declaration__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_9__0"


    // $ANTLR start "rule__Declaration__Group_9__0__Impl"
    // InternalNpl.g:1529:1: rule__Declaration__Group_9__0__Impl : ( 'number of articles per topic' ) ;
    public final void rule__Declaration__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1533:1: ( ( 'number of articles per topic' ) )
            // InternalNpl.g:1534:1: ( 'number of articles per topic' )
            {
            // InternalNpl.g:1534:1: ( 'number of articles per topic' )
            // InternalNpl.g:1535:1: 'number of articles per topic'
            {
             before(grammarAccess.getDeclarationAccess().getNumberOfArticlesPerTopicKeyword_9_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getNumberOfArticlesPerTopicKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_9__0__Impl"


    // $ANTLR start "rule__Declaration__Group_9__1"
    // InternalNpl.g:1548:1: rule__Declaration__Group_9__1 : rule__Declaration__Group_9__1__Impl ;
    public final void rule__Declaration__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1552:1: ( rule__Declaration__Group_9__1__Impl )
            // InternalNpl.g:1553:2: rule__Declaration__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_9__1"


    // $ANTLR start "rule__Declaration__Group_9__1__Impl"
    // InternalNpl.g:1559:1: rule__Declaration__Group_9__1__Impl : ( ( rule__Declaration__ArticleCntAssignment_9_1 ) ) ;
    public final void rule__Declaration__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1563:1: ( ( ( rule__Declaration__ArticleCntAssignment_9_1 ) ) )
            // InternalNpl.g:1564:1: ( ( rule__Declaration__ArticleCntAssignment_9_1 ) )
            {
            // InternalNpl.g:1564:1: ( ( rule__Declaration__ArticleCntAssignment_9_1 ) )
            // InternalNpl.g:1565:1: ( rule__Declaration__ArticleCntAssignment_9_1 )
            {
             before(grammarAccess.getDeclarationAccess().getArticleCntAssignment_9_1()); 
            // InternalNpl.g:1566:1: ( rule__Declaration__ArticleCntAssignment_9_1 )
            // InternalNpl.g:1566:2: rule__Declaration__ArticleCntAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__ArticleCntAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getArticleCntAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_9__1__Impl"


    // $ANTLR start "rule__Declaration__Group_10__0"
    // InternalNpl.g:1580:1: rule__Declaration__Group_10__0 : rule__Declaration__Group_10__0__Impl rule__Declaration__Group_10__1 ;
    public final void rule__Declaration__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1584:1: ( rule__Declaration__Group_10__0__Impl rule__Declaration__Group_10__1 )
            // InternalNpl.g:1585:2: rule__Declaration__Group_10__0__Impl rule__Declaration__Group_10__1
            {
            pushFollow(FOLLOW_13);
            rule__Declaration__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_10__0"


    // $ANTLR start "rule__Declaration__Group_10__0__Impl"
    // InternalNpl.g:1592:1: rule__Declaration__Group_10__0__Impl : ( 'number of words per article' ) ;
    public final void rule__Declaration__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1596:1: ( ( 'number of words per article' ) )
            // InternalNpl.g:1597:1: ( 'number of words per article' )
            {
            // InternalNpl.g:1597:1: ( 'number of words per article' )
            // InternalNpl.g:1598:1: 'number of words per article'
            {
             before(grammarAccess.getDeclarationAccess().getNumberOfWordsPerArticleKeyword_10_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getNumberOfWordsPerArticleKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_10__0__Impl"


    // $ANTLR start "rule__Declaration__Group_10__1"
    // InternalNpl.g:1611:1: rule__Declaration__Group_10__1 : rule__Declaration__Group_10__1__Impl rule__Declaration__Group_10__2 ;
    public final void rule__Declaration__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1615:1: ( rule__Declaration__Group_10__1__Impl rule__Declaration__Group_10__2 )
            // InternalNpl.g:1616:2: rule__Declaration__Group_10__1__Impl rule__Declaration__Group_10__2
            {
            pushFollow(FOLLOW_17);
            rule__Declaration__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_10__1"


    // $ANTLR start "rule__Declaration__Group_10__1__Impl"
    // InternalNpl.g:1623:1: rule__Declaration__Group_10__1__Impl : ( ( rule__Declaration__ArticleWordsMinAssignment_10_1 ) ) ;
    public final void rule__Declaration__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1627:1: ( ( ( rule__Declaration__ArticleWordsMinAssignment_10_1 ) ) )
            // InternalNpl.g:1628:1: ( ( rule__Declaration__ArticleWordsMinAssignment_10_1 ) )
            {
            // InternalNpl.g:1628:1: ( ( rule__Declaration__ArticleWordsMinAssignment_10_1 ) )
            // InternalNpl.g:1629:1: ( rule__Declaration__ArticleWordsMinAssignment_10_1 )
            {
             before(grammarAccess.getDeclarationAccess().getArticleWordsMinAssignment_10_1()); 
            // InternalNpl.g:1630:1: ( rule__Declaration__ArticleWordsMinAssignment_10_1 )
            // InternalNpl.g:1630:2: rule__Declaration__ArticleWordsMinAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__ArticleWordsMinAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getArticleWordsMinAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_10__1__Impl"


    // $ANTLR start "rule__Declaration__Group_10__2"
    // InternalNpl.g:1640:1: rule__Declaration__Group_10__2 : rule__Declaration__Group_10__2__Impl rule__Declaration__Group_10__3 ;
    public final void rule__Declaration__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1644:1: ( rule__Declaration__Group_10__2__Impl rule__Declaration__Group_10__3 )
            // InternalNpl.g:1645:2: rule__Declaration__Group_10__2__Impl rule__Declaration__Group_10__3
            {
            pushFollow(FOLLOW_13);
            rule__Declaration__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_10__2"


    // $ANTLR start "rule__Declaration__Group_10__2__Impl"
    // InternalNpl.g:1652:1: rule__Declaration__Group_10__2__Impl : ( '-' ) ;
    public final void rule__Declaration__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1656:1: ( ( '-' ) )
            // InternalNpl.g:1657:1: ( '-' )
            {
            // InternalNpl.g:1657:1: ( '-' )
            // InternalNpl.g:1658:1: '-'
            {
             before(grammarAccess.getDeclarationAccess().getHyphenMinusKeyword_10_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getHyphenMinusKeyword_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_10__2__Impl"


    // $ANTLR start "rule__Declaration__Group_10__3"
    // InternalNpl.g:1671:1: rule__Declaration__Group_10__3 : rule__Declaration__Group_10__3__Impl ;
    public final void rule__Declaration__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1675:1: ( rule__Declaration__Group_10__3__Impl )
            // InternalNpl.g:1676:2: rule__Declaration__Group_10__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Group_10__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_10__3"


    // $ANTLR start "rule__Declaration__Group_10__3__Impl"
    // InternalNpl.g:1682:1: rule__Declaration__Group_10__3__Impl : ( ( rule__Declaration__ArticleWordsMaxAssignment_10_3 ) ) ;
    public final void rule__Declaration__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1686:1: ( ( ( rule__Declaration__ArticleWordsMaxAssignment_10_3 ) ) )
            // InternalNpl.g:1687:1: ( ( rule__Declaration__ArticleWordsMaxAssignment_10_3 ) )
            {
            // InternalNpl.g:1687:1: ( ( rule__Declaration__ArticleWordsMaxAssignment_10_3 ) )
            // InternalNpl.g:1688:1: ( rule__Declaration__ArticleWordsMaxAssignment_10_3 )
            {
             before(grammarAccess.getDeclarationAccess().getArticleWordsMaxAssignment_10_3()); 
            // InternalNpl.g:1689:1: ( rule__Declaration__ArticleWordsMaxAssignment_10_3 )
            // InternalNpl.g:1689:2: rule__Declaration__ArticleWordsMaxAssignment_10_3
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__ArticleWordsMaxAssignment_10_3();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getArticleWordsMaxAssignment_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_10__3__Impl"


    // $ANTLR start "rule__Declaration__Group_11__0"
    // InternalNpl.g:1707:1: rule__Declaration__Group_11__0 : rule__Declaration__Group_11__0__Impl rule__Declaration__Group_11__1 ;
    public final void rule__Declaration__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1711:1: ( rule__Declaration__Group_11__0__Impl rule__Declaration__Group_11__1 )
            // InternalNpl.g:1712:2: rule__Declaration__Group_11__0__Impl rule__Declaration__Group_11__1
            {
            pushFollow(FOLLOW_13);
            rule__Declaration__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_11__0"


    // $ANTLR start "rule__Declaration__Group_11__0__Impl"
    // InternalNpl.g:1719:1: rule__Declaration__Group_11__0__Impl : ( 'optional: number of images per article' ) ;
    public final void rule__Declaration__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1723:1: ( ( 'optional: number of images per article' ) )
            // InternalNpl.g:1724:1: ( 'optional: number of images per article' )
            {
            // InternalNpl.g:1724:1: ( 'optional: number of images per article' )
            // InternalNpl.g:1725:1: 'optional: number of images per article'
            {
             before(grammarAccess.getDeclarationAccess().getOptionalNumberOfImagesPerArticleKeyword_11_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getOptionalNumberOfImagesPerArticleKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_11__0__Impl"


    // $ANTLR start "rule__Declaration__Group_11__1"
    // InternalNpl.g:1738:1: rule__Declaration__Group_11__1 : rule__Declaration__Group_11__1__Impl ;
    public final void rule__Declaration__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1742:1: ( rule__Declaration__Group_11__1__Impl )
            // InternalNpl.g:1743:2: rule__Declaration__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_11__1"


    // $ANTLR start "rule__Declaration__Group_11__1__Impl"
    // InternalNpl.g:1749:1: rule__Declaration__Group_11__1__Impl : ( ( rule__Declaration__ImagesCntAssignment_11_1 ) ) ;
    public final void rule__Declaration__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1753:1: ( ( ( rule__Declaration__ImagesCntAssignment_11_1 ) ) )
            // InternalNpl.g:1754:1: ( ( rule__Declaration__ImagesCntAssignment_11_1 ) )
            {
            // InternalNpl.g:1754:1: ( ( rule__Declaration__ImagesCntAssignment_11_1 ) )
            // InternalNpl.g:1755:1: ( rule__Declaration__ImagesCntAssignment_11_1 )
            {
             before(grammarAccess.getDeclarationAccess().getImagesCntAssignment_11_1()); 
            // InternalNpl.g:1756:1: ( rule__Declaration__ImagesCntAssignment_11_1 )
            // InternalNpl.g:1756:2: rule__Declaration__ImagesCntAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__ImagesCntAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getImagesCntAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_11__1__Impl"


    // $ANTLR start "rule__Declaration__Group_12__0"
    // InternalNpl.g:1770:1: rule__Declaration__Group_12__0 : rule__Declaration__Group_12__0__Impl rule__Declaration__Group_12__1 ;
    public final void rule__Declaration__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1774:1: ( rule__Declaration__Group_12__0__Impl rule__Declaration__Group_12__1 )
            // InternalNpl.g:1775:2: rule__Declaration__Group_12__0__Impl rule__Declaration__Group_12__1
            {
            pushFollow(FOLLOW_13);
            rule__Declaration__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_12__0"


    // $ANTLR start "rule__Declaration__Group_12__0__Impl"
    // InternalNpl.g:1782:1: rule__Declaration__Group_12__0__Impl : ( 'number of columns' ) ;
    public final void rule__Declaration__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1786:1: ( ( 'number of columns' ) )
            // InternalNpl.g:1787:1: ( 'number of columns' )
            {
            // InternalNpl.g:1787:1: ( 'number of columns' )
            // InternalNpl.g:1788:1: 'number of columns'
            {
             before(grammarAccess.getDeclarationAccess().getNumberOfColumnsKeyword_12_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getNumberOfColumnsKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_12__0__Impl"


    // $ANTLR start "rule__Declaration__Group_12__1"
    // InternalNpl.g:1801:1: rule__Declaration__Group_12__1 : rule__Declaration__Group_12__1__Impl ;
    public final void rule__Declaration__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1805:1: ( rule__Declaration__Group_12__1__Impl )
            // InternalNpl.g:1806:2: rule__Declaration__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Group_12__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_12__1"


    // $ANTLR start "rule__Declaration__Group_12__1__Impl"
    // InternalNpl.g:1812:1: rule__Declaration__Group_12__1__Impl : ( ( rule__Declaration__ColumnsCntAssignment_12_1 ) ) ;
    public final void rule__Declaration__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1816:1: ( ( ( rule__Declaration__ColumnsCntAssignment_12_1 ) ) )
            // InternalNpl.g:1817:1: ( ( rule__Declaration__ColumnsCntAssignment_12_1 ) )
            {
            // InternalNpl.g:1817:1: ( ( rule__Declaration__ColumnsCntAssignment_12_1 ) )
            // InternalNpl.g:1818:1: ( rule__Declaration__ColumnsCntAssignment_12_1 )
            {
             before(grammarAccess.getDeclarationAccess().getColumnsCntAssignment_12_1()); 
            // InternalNpl.g:1819:1: ( rule__Declaration__ColumnsCntAssignment_12_1 )
            // InternalNpl.g:1819:2: rule__Declaration__ColumnsCntAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__ColumnsCntAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getColumnsCntAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_12__1__Impl"


    // $ANTLR start "rule__Declaration__Group_13__0"
    // InternalNpl.g:1833:1: rule__Declaration__Group_13__0 : rule__Declaration__Group_13__0__Impl rule__Declaration__Group_13__1 ;
    public final void rule__Declaration__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1837:1: ( rule__Declaration__Group_13__0__Impl rule__Declaration__Group_13__1 )
            // InternalNpl.g:1838:2: rule__Declaration__Group_13__0__Impl rule__Declaration__Group_13__1
            {
            pushFollow(FOLLOW_18);
            rule__Declaration__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_13__0"


    // $ANTLR start "rule__Declaration__Group_13__0__Impl"
    // InternalNpl.g:1845:1: rule__Declaration__Group_13__0__Impl : ( 'font size' ) ;
    public final void rule__Declaration__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1849:1: ( ( 'font size' ) )
            // InternalNpl.g:1850:1: ( 'font size' )
            {
            // InternalNpl.g:1850:1: ( 'font size' )
            // InternalNpl.g:1851:1: 'font size'
            {
             before(grammarAccess.getDeclarationAccess().getFontSizeKeyword_13_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getFontSizeKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_13__0__Impl"


    // $ANTLR start "rule__Declaration__Group_13__1"
    // InternalNpl.g:1864:1: rule__Declaration__Group_13__1 : rule__Declaration__Group_13__1__Impl ;
    public final void rule__Declaration__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1868:1: ( rule__Declaration__Group_13__1__Impl )
            // InternalNpl.g:1869:2: rule__Declaration__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Group_13__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_13__1"


    // $ANTLR start "rule__Declaration__Group_13__1__Impl"
    // InternalNpl.g:1875:1: rule__Declaration__Group_13__1__Impl : ( ( rule__Declaration__FontSizeAssignment_13_1 ) ) ;
    public final void rule__Declaration__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1879:1: ( ( ( rule__Declaration__FontSizeAssignment_13_1 ) ) )
            // InternalNpl.g:1880:1: ( ( rule__Declaration__FontSizeAssignment_13_1 ) )
            {
            // InternalNpl.g:1880:1: ( ( rule__Declaration__FontSizeAssignment_13_1 ) )
            // InternalNpl.g:1881:1: ( rule__Declaration__FontSizeAssignment_13_1 )
            {
             before(grammarAccess.getDeclarationAccess().getFontSizeAssignment_13_1()); 
            // InternalNpl.g:1882:1: ( rule__Declaration__FontSizeAssignment_13_1 )
            // InternalNpl.g:1882:2: rule__Declaration__FontSizeAssignment_13_1
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__FontSizeAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getFontSizeAssignment_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_13__1__Impl"


    // $ANTLR start "rule__Date__Group__0"
    // InternalNpl.g:1896:1: rule__Date__Group__0 : rule__Date__Group__0__Impl rule__Date__Group__1 ;
    public final void rule__Date__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1900:1: ( rule__Date__Group__0__Impl rule__Date__Group__1 )
            // InternalNpl.g:1901:2: rule__Date__Group__0__Impl rule__Date__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Date__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__0"


    // $ANTLR start "rule__Date__Group__0__Impl"
    // InternalNpl.g:1908:1: rule__Date__Group__0__Impl : ( '{' ) ;
    public final void rule__Date__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1912:1: ( ( '{' ) )
            // InternalNpl.g:1913:1: ( '{' )
            {
            // InternalNpl.g:1913:1: ( '{' )
            // InternalNpl.g:1914:1: '{'
            {
             before(grammarAccess.getDateAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__0__Impl"


    // $ANTLR start "rule__Date__Group__1"
    // InternalNpl.g:1927:1: rule__Date__Group__1 : rule__Date__Group__1__Impl rule__Date__Group__2 ;
    public final void rule__Date__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1931:1: ( rule__Date__Group__1__Impl rule__Date__Group__2 )
            // InternalNpl.g:1932:2: rule__Date__Group__1__Impl rule__Date__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Date__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__1"


    // $ANTLR start "rule__Date__Group__1__Impl"
    // InternalNpl.g:1939:1: rule__Date__Group__1__Impl : ( ( rule__Date__DayAssignment_1 ) ) ;
    public final void rule__Date__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1943:1: ( ( ( rule__Date__DayAssignment_1 ) ) )
            // InternalNpl.g:1944:1: ( ( rule__Date__DayAssignment_1 ) )
            {
            // InternalNpl.g:1944:1: ( ( rule__Date__DayAssignment_1 ) )
            // InternalNpl.g:1945:1: ( rule__Date__DayAssignment_1 )
            {
             before(grammarAccess.getDateAccess().getDayAssignment_1()); 
            // InternalNpl.g:1946:1: ( rule__Date__DayAssignment_1 )
            // InternalNpl.g:1946:2: rule__Date__DayAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Date__DayAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDateAccess().getDayAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__1__Impl"


    // $ANTLR start "rule__Date__Group__2"
    // InternalNpl.g:1956:1: rule__Date__Group__2 : rule__Date__Group__2__Impl rule__Date__Group__3 ;
    public final void rule__Date__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1960:1: ( rule__Date__Group__2__Impl rule__Date__Group__3 )
            // InternalNpl.g:1961:2: rule__Date__Group__2__Impl rule__Date__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Date__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__2"


    // $ANTLR start "rule__Date__Group__2__Impl"
    // InternalNpl.g:1968:1: rule__Date__Group__2__Impl : ( '-' ) ;
    public final void rule__Date__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1972:1: ( ( '-' ) )
            // InternalNpl.g:1973:1: ( '-' )
            {
            // InternalNpl.g:1973:1: ( '-' )
            // InternalNpl.g:1974:1: '-'
            {
             before(grammarAccess.getDateAccess().getHyphenMinusKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getHyphenMinusKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__2__Impl"


    // $ANTLR start "rule__Date__Group__3"
    // InternalNpl.g:1987:1: rule__Date__Group__3 : rule__Date__Group__3__Impl rule__Date__Group__4 ;
    public final void rule__Date__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1991:1: ( rule__Date__Group__3__Impl rule__Date__Group__4 )
            // InternalNpl.g:1992:2: rule__Date__Group__3__Impl rule__Date__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Date__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__3"


    // $ANTLR start "rule__Date__Group__3__Impl"
    // InternalNpl.g:1999:1: rule__Date__Group__3__Impl : ( ( rule__Date__MonthAssignment_3 ) ) ;
    public final void rule__Date__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2003:1: ( ( ( rule__Date__MonthAssignment_3 ) ) )
            // InternalNpl.g:2004:1: ( ( rule__Date__MonthAssignment_3 ) )
            {
            // InternalNpl.g:2004:1: ( ( rule__Date__MonthAssignment_3 ) )
            // InternalNpl.g:2005:1: ( rule__Date__MonthAssignment_3 )
            {
             before(grammarAccess.getDateAccess().getMonthAssignment_3()); 
            // InternalNpl.g:2006:1: ( rule__Date__MonthAssignment_3 )
            // InternalNpl.g:2006:2: rule__Date__MonthAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Date__MonthAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDateAccess().getMonthAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__3__Impl"


    // $ANTLR start "rule__Date__Group__4"
    // InternalNpl.g:2016:1: rule__Date__Group__4 : rule__Date__Group__4__Impl rule__Date__Group__5 ;
    public final void rule__Date__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2020:1: ( rule__Date__Group__4__Impl rule__Date__Group__5 )
            // InternalNpl.g:2021:2: rule__Date__Group__4__Impl rule__Date__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Date__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__4"


    // $ANTLR start "rule__Date__Group__4__Impl"
    // InternalNpl.g:2028:1: rule__Date__Group__4__Impl : ( '-' ) ;
    public final void rule__Date__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2032:1: ( ( '-' ) )
            // InternalNpl.g:2033:1: ( '-' )
            {
            // InternalNpl.g:2033:1: ( '-' )
            // InternalNpl.g:2034:1: '-'
            {
             before(grammarAccess.getDateAccess().getHyphenMinusKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getHyphenMinusKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__4__Impl"


    // $ANTLR start "rule__Date__Group__5"
    // InternalNpl.g:2047:1: rule__Date__Group__5 : rule__Date__Group__5__Impl rule__Date__Group__6 ;
    public final void rule__Date__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2051:1: ( rule__Date__Group__5__Impl rule__Date__Group__6 )
            // InternalNpl.g:2052:2: rule__Date__Group__5__Impl rule__Date__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__Date__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__5"


    // $ANTLR start "rule__Date__Group__5__Impl"
    // InternalNpl.g:2059:1: rule__Date__Group__5__Impl : ( ( rule__Date__YearAssignment_5 ) ) ;
    public final void rule__Date__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2063:1: ( ( ( rule__Date__YearAssignment_5 ) ) )
            // InternalNpl.g:2064:1: ( ( rule__Date__YearAssignment_5 ) )
            {
            // InternalNpl.g:2064:1: ( ( rule__Date__YearAssignment_5 ) )
            // InternalNpl.g:2065:1: ( rule__Date__YearAssignment_5 )
            {
             before(grammarAccess.getDateAccess().getYearAssignment_5()); 
            // InternalNpl.g:2066:1: ( rule__Date__YearAssignment_5 )
            // InternalNpl.g:2066:2: rule__Date__YearAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Date__YearAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDateAccess().getYearAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__5__Impl"


    // $ANTLR start "rule__Date__Group__6"
    // InternalNpl.g:2076:1: rule__Date__Group__6 : rule__Date__Group__6__Impl ;
    public final void rule__Date__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2080:1: ( rule__Date__Group__6__Impl )
            // InternalNpl.g:2081:2: rule__Date__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Date__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__6"


    // $ANTLR start "rule__Date__Group__6__Impl"
    // InternalNpl.g:2087:1: rule__Date__Group__6__Impl : ( '}' ) ;
    public final void rule__Date__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2091:1: ( ( '}' ) )
            // InternalNpl.g:2092:1: ( '}' )
            {
            // InternalNpl.g:2092:1: ( '}' )
            // InternalNpl.g:2093:1: '}'
            {
             before(grammarAccess.getDateAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__6__Impl"


    // $ANTLR start "rule__Price__Group__0"
    // InternalNpl.g:2120:1: rule__Price__Group__0 : rule__Price__Group__0__Impl rule__Price__Group__1 ;
    public final void rule__Price__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2124:1: ( rule__Price__Group__0__Impl rule__Price__Group__1 )
            // InternalNpl.g:2125:2: rule__Price__Group__0__Impl rule__Price__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Price__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Price__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Price__Group__0"


    // $ANTLR start "rule__Price__Group__0__Impl"
    // InternalNpl.g:2132:1: rule__Price__Group__0__Impl : ( '{' ) ;
    public final void rule__Price__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2136:1: ( ( '{' ) )
            // InternalNpl.g:2137:1: ( '{' )
            {
            // InternalNpl.g:2137:1: ( '{' )
            // InternalNpl.g:2138:1: '{'
            {
             before(grammarAccess.getPriceAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPriceAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Price__Group__0__Impl"


    // $ANTLR start "rule__Price__Group__1"
    // InternalNpl.g:2151:1: rule__Price__Group__1 : rule__Price__Group__1__Impl rule__Price__Group__2 ;
    public final void rule__Price__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2155:1: ( rule__Price__Group__1__Impl rule__Price__Group__2 )
            // InternalNpl.g:2156:2: rule__Price__Group__1__Impl rule__Price__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Price__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Price__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Price__Group__1"


    // $ANTLR start "rule__Price__Group__1__Impl"
    // InternalNpl.g:2163:1: rule__Price__Group__1__Impl : ( ( rule__Price__ValueAssignment_1 ) ) ;
    public final void rule__Price__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2167:1: ( ( ( rule__Price__ValueAssignment_1 ) ) )
            // InternalNpl.g:2168:1: ( ( rule__Price__ValueAssignment_1 ) )
            {
            // InternalNpl.g:2168:1: ( ( rule__Price__ValueAssignment_1 ) )
            // InternalNpl.g:2169:1: ( rule__Price__ValueAssignment_1 )
            {
             before(grammarAccess.getPriceAccess().getValueAssignment_1()); 
            // InternalNpl.g:2170:1: ( rule__Price__ValueAssignment_1 )
            // InternalNpl.g:2170:2: rule__Price__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Price__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPriceAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Price__Group__1__Impl"


    // $ANTLR start "rule__Price__Group__2"
    // InternalNpl.g:2180:1: rule__Price__Group__2 : rule__Price__Group__2__Impl rule__Price__Group__3 ;
    public final void rule__Price__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2184:1: ( rule__Price__Group__2__Impl rule__Price__Group__3 )
            // InternalNpl.g:2185:2: rule__Price__Group__2__Impl rule__Price__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Price__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Price__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Price__Group__2"


    // $ANTLR start "rule__Price__Group__2__Impl"
    // InternalNpl.g:2192:1: rule__Price__Group__2__Impl : ( ( rule__Price__CurrencyAssignment_2 ) ) ;
    public final void rule__Price__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2196:1: ( ( ( rule__Price__CurrencyAssignment_2 ) ) )
            // InternalNpl.g:2197:1: ( ( rule__Price__CurrencyAssignment_2 ) )
            {
            // InternalNpl.g:2197:1: ( ( rule__Price__CurrencyAssignment_2 ) )
            // InternalNpl.g:2198:1: ( rule__Price__CurrencyAssignment_2 )
            {
             before(grammarAccess.getPriceAccess().getCurrencyAssignment_2()); 
            // InternalNpl.g:2199:1: ( rule__Price__CurrencyAssignment_2 )
            // InternalNpl.g:2199:2: rule__Price__CurrencyAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Price__CurrencyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPriceAccess().getCurrencyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Price__Group__2__Impl"


    // $ANTLR start "rule__Price__Group__3"
    // InternalNpl.g:2209:1: rule__Price__Group__3 : rule__Price__Group__3__Impl ;
    public final void rule__Price__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2213:1: ( rule__Price__Group__3__Impl )
            // InternalNpl.g:2214:2: rule__Price__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Price__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Price__Group__3"


    // $ANTLR start "rule__Price__Group__3__Impl"
    // InternalNpl.g:2220:1: rule__Price__Group__3__Impl : ( '}' ) ;
    public final void rule__Price__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2224:1: ( ( '}' ) )
            // InternalNpl.g:2225:1: ( '}' )
            {
            // InternalNpl.g:2225:1: ( '}' )
            // InternalNpl.g:2226:1: '}'
            {
             before(grammarAccess.getPriceAccess().getRightCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPriceAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Price__Group__3__Impl"


    // $ANTLR start "rule__Topic__Group__0"
    // InternalNpl.g:2247:1: rule__Topic__Group__0 : rule__Topic__Group__0__Impl rule__Topic__Group__1 ;
    public final void rule__Topic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2251:1: ( rule__Topic__Group__0__Impl rule__Topic__Group__1 )
            // InternalNpl.g:2252:2: rule__Topic__Group__0__Impl rule__Topic__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Topic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Topic__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group__0"


    // $ANTLR start "rule__Topic__Group__0__Impl"
    // InternalNpl.g:2259:1: rule__Topic__Group__0__Impl : ( 'topic' ) ;
    public final void rule__Topic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2263:1: ( ( 'topic' ) )
            // InternalNpl.g:2264:1: ( 'topic' )
            {
            // InternalNpl.g:2264:1: ( 'topic' )
            // InternalNpl.g:2265:1: 'topic'
            {
             before(grammarAccess.getTopicAccess().getTopicKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTopicAccess().getTopicKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group__0__Impl"


    // $ANTLR start "rule__Topic__Group__1"
    // InternalNpl.g:2278:1: rule__Topic__Group__1 : rule__Topic__Group__1__Impl rule__Topic__Group__2 ;
    public final void rule__Topic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2282:1: ( rule__Topic__Group__1__Impl rule__Topic__Group__2 )
            // InternalNpl.g:2283:2: rule__Topic__Group__1__Impl rule__Topic__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Topic__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Topic__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group__1"


    // $ANTLR start "rule__Topic__Group__1__Impl"
    // InternalNpl.g:2290:1: rule__Topic__Group__1__Impl : ( ( rule__Topic__NameAssignment_1 ) ) ;
    public final void rule__Topic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2294:1: ( ( ( rule__Topic__NameAssignment_1 ) ) )
            // InternalNpl.g:2295:1: ( ( rule__Topic__NameAssignment_1 ) )
            {
            // InternalNpl.g:2295:1: ( ( rule__Topic__NameAssignment_1 ) )
            // InternalNpl.g:2296:1: ( rule__Topic__NameAssignment_1 )
            {
             before(grammarAccess.getTopicAccess().getNameAssignment_1()); 
            // InternalNpl.g:2297:1: ( rule__Topic__NameAssignment_1 )
            // InternalNpl.g:2297:2: rule__Topic__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Topic__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTopicAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group__1__Impl"


    // $ANTLR start "rule__Topic__Group__2"
    // InternalNpl.g:2307:1: rule__Topic__Group__2 : rule__Topic__Group__2__Impl rule__Topic__Group__3 ;
    public final void rule__Topic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2311:1: ( rule__Topic__Group__2__Impl rule__Topic__Group__3 )
            // InternalNpl.g:2312:2: rule__Topic__Group__2__Impl rule__Topic__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Topic__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Topic__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group__2"


    // $ANTLR start "rule__Topic__Group__2__Impl"
    // InternalNpl.g:2319:1: rule__Topic__Group__2__Impl : ( '{' ) ;
    public final void rule__Topic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2323:1: ( ( '{' ) )
            // InternalNpl.g:2324:1: ( '{' )
            {
            // InternalNpl.g:2324:1: ( '{' )
            // InternalNpl.g:2325:1: '{'
            {
             before(grammarAccess.getTopicAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTopicAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group__2__Impl"


    // $ANTLR start "rule__Topic__Group__3"
    // InternalNpl.g:2338:1: rule__Topic__Group__3 : rule__Topic__Group__3__Impl rule__Topic__Group__4 ;
    public final void rule__Topic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2342:1: ( rule__Topic__Group__3__Impl rule__Topic__Group__4 )
            // InternalNpl.g:2343:2: rule__Topic__Group__3__Impl rule__Topic__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Topic__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Topic__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group__3"


    // $ANTLR start "rule__Topic__Group__3__Impl"
    // InternalNpl.g:2350:1: rule__Topic__Group__3__Impl : ( ( rule__Topic__TagsAssignment_3 ) ) ;
    public final void rule__Topic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2354:1: ( ( ( rule__Topic__TagsAssignment_3 ) ) )
            // InternalNpl.g:2355:1: ( ( rule__Topic__TagsAssignment_3 ) )
            {
            // InternalNpl.g:2355:1: ( ( rule__Topic__TagsAssignment_3 ) )
            // InternalNpl.g:2356:1: ( rule__Topic__TagsAssignment_3 )
            {
             before(grammarAccess.getTopicAccess().getTagsAssignment_3()); 
            // InternalNpl.g:2357:1: ( rule__Topic__TagsAssignment_3 )
            // InternalNpl.g:2357:2: rule__Topic__TagsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Topic__TagsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTopicAccess().getTagsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group__3__Impl"


    // $ANTLR start "rule__Topic__Group__4"
    // InternalNpl.g:2367:1: rule__Topic__Group__4 : rule__Topic__Group__4__Impl rule__Topic__Group__5 ;
    public final void rule__Topic__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2371:1: ( rule__Topic__Group__4__Impl rule__Topic__Group__5 )
            // InternalNpl.g:2372:2: rule__Topic__Group__4__Impl rule__Topic__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Topic__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Topic__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group__4"


    // $ANTLR start "rule__Topic__Group__4__Impl"
    // InternalNpl.g:2379:1: rule__Topic__Group__4__Impl : ( ( rule__Topic__Group_4__0 )* ) ;
    public final void rule__Topic__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2383:1: ( ( ( rule__Topic__Group_4__0 )* ) )
            // InternalNpl.g:2384:1: ( ( rule__Topic__Group_4__0 )* )
            {
            // InternalNpl.g:2384:1: ( ( rule__Topic__Group_4__0 )* )
            // InternalNpl.g:2385:1: ( rule__Topic__Group_4__0 )*
            {
             before(grammarAccess.getTopicAccess().getGroup_4()); 
            // InternalNpl.g:2386:1: ( rule__Topic__Group_4__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==35) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalNpl.g:2386:2: rule__Topic__Group_4__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Topic__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getTopicAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group__4__Impl"


    // $ANTLR start "rule__Topic__Group__5"
    // InternalNpl.g:2396:1: rule__Topic__Group__5 : rule__Topic__Group__5__Impl ;
    public final void rule__Topic__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2400:1: ( rule__Topic__Group__5__Impl )
            // InternalNpl.g:2401:2: rule__Topic__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Topic__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group__5"


    // $ANTLR start "rule__Topic__Group__5__Impl"
    // InternalNpl.g:2407:1: rule__Topic__Group__5__Impl : ( '}' ) ;
    public final void rule__Topic__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2411:1: ( ( '}' ) )
            // InternalNpl.g:2412:1: ( '}' )
            {
            // InternalNpl.g:2412:1: ( '}' )
            // InternalNpl.g:2413:1: '}'
            {
             before(grammarAccess.getTopicAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTopicAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group__5__Impl"


    // $ANTLR start "rule__Topic__Group_4__0"
    // InternalNpl.g:2438:1: rule__Topic__Group_4__0 : rule__Topic__Group_4__0__Impl rule__Topic__Group_4__1 ;
    public final void rule__Topic__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2442:1: ( rule__Topic__Group_4__0__Impl rule__Topic__Group_4__1 )
            // InternalNpl.g:2443:2: rule__Topic__Group_4__0__Impl rule__Topic__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__Topic__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Topic__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group_4__0"


    // $ANTLR start "rule__Topic__Group_4__0__Impl"
    // InternalNpl.g:2450:1: rule__Topic__Group_4__0__Impl : ( ', ' ) ;
    public final void rule__Topic__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2454:1: ( ( ', ' ) )
            // InternalNpl.g:2455:1: ( ', ' )
            {
            // InternalNpl.g:2455:1: ( ', ' )
            // InternalNpl.g:2456:1: ', '
            {
             before(grammarAccess.getTopicAccess().getCommaSpaceKeyword_4_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTopicAccess().getCommaSpaceKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group_4__0__Impl"


    // $ANTLR start "rule__Topic__Group_4__1"
    // InternalNpl.g:2469:1: rule__Topic__Group_4__1 : rule__Topic__Group_4__1__Impl ;
    public final void rule__Topic__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2473:1: ( rule__Topic__Group_4__1__Impl )
            // InternalNpl.g:2474:2: rule__Topic__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Topic__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group_4__1"


    // $ANTLR start "rule__Topic__Group_4__1__Impl"
    // InternalNpl.g:2480:1: rule__Topic__Group_4__1__Impl : ( ( rule__Topic__TagsAssignment_4_1 ) ) ;
    public final void rule__Topic__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2484:1: ( ( ( rule__Topic__TagsAssignment_4_1 ) ) )
            // InternalNpl.g:2485:1: ( ( rule__Topic__TagsAssignment_4_1 ) )
            {
            // InternalNpl.g:2485:1: ( ( rule__Topic__TagsAssignment_4_1 ) )
            // InternalNpl.g:2486:1: ( rule__Topic__TagsAssignment_4_1 )
            {
             before(grammarAccess.getTopicAccess().getTagsAssignment_4_1()); 
            // InternalNpl.g:2487:1: ( rule__Topic__TagsAssignment_4_1 )
            // InternalNpl.g:2487:2: rule__Topic__TagsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Topic__TagsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTopicAccess().getTagsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group_4__1__Impl"


    // $ANTLR start "rule__Pair__Group__0"
    // InternalNpl.g:2501:1: rule__Pair__Group__0 : rule__Pair__Group__0__Impl rule__Pair__Group__1 ;
    public final void rule__Pair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2505:1: ( rule__Pair__Group__0__Impl rule__Pair__Group__1 )
            // InternalNpl.g:2506:2: rule__Pair__Group__0__Impl rule__Pair__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Pair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pair__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pair__Group__0"


    // $ANTLR start "rule__Pair__Group__0__Impl"
    // InternalNpl.g:2513:1: rule__Pair__Group__0__Impl : ( ( rule__Pair__TypeAssignment_0 ) ) ;
    public final void rule__Pair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2517:1: ( ( ( rule__Pair__TypeAssignment_0 ) ) )
            // InternalNpl.g:2518:1: ( ( rule__Pair__TypeAssignment_0 ) )
            {
            // InternalNpl.g:2518:1: ( ( rule__Pair__TypeAssignment_0 ) )
            // InternalNpl.g:2519:1: ( rule__Pair__TypeAssignment_0 )
            {
             before(grammarAccess.getPairAccess().getTypeAssignment_0()); 
            // InternalNpl.g:2520:1: ( rule__Pair__TypeAssignment_0 )
            // InternalNpl.g:2520:2: rule__Pair__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Pair__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPairAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pair__Group__0__Impl"


    // $ANTLR start "rule__Pair__Group__1"
    // InternalNpl.g:2530:1: rule__Pair__Group__1 : rule__Pair__Group__1__Impl rule__Pair__Group__2 ;
    public final void rule__Pair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2534:1: ( rule__Pair__Group__1__Impl rule__Pair__Group__2 )
            // InternalNpl.g:2535:2: rule__Pair__Group__1__Impl rule__Pair__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Pair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pair__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pair__Group__1"


    // $ANTLR start "rule__Pair__Group__1__Impl"
    // InternalNpl.g:2542:1: rule__Pair__Group__1__Impl : ( ( rule__Pair__KeyAssignment_1 ) ) ;
    public final void rule__Pair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2546:1: ( ( ( rule__Pair__KeyAssignment_1 ) ) )
            // InternalNpl.g:2547:1: ( ( rule__Pair__KeyAssignment_1 ) )
            {
            // InternalNpl.g:2547:1: ( ( rule__Pair__KeyAssignment_1 ) )
            // InternalNpl.g:2548:1: ( rule__Pair__KeyAssignment_1 )
            {
             before(grammarAccess.getPairAccess().getKeyAssignment_1()); 
            // InternalNpl.g:2549:1: ( rule__Pair__KeyAssignment_1 )
            // InternalNpl.g:2549:2: rule__Pair__KeyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Pair__KeyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPairAccess().getKeyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pair__Group__1__Impl"


    // $ANTLR start "rule__Pair__Group__2"
    // InternalNpl.g:2559:1: rule__Pair__Group__2 : rule__Pair__Group__2__Impl rule__Pair__Group__3 ;
    public final void rule__Pair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2563:1: ( rule__Pair__Group__2__Impl rule__Pair__Group__3 )
            // InternalNpl.g:2564:2: rule__Pair__Group__2__Impl rule__Pair__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Pair__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pair__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pair__Group__2"


    // $ANTLR start "rule__Pair__Group__2__Impl"
    // InternalNpl.g:2571:1: rule__Pair__Group__2__Impl : ( '<' ) ;
    public final void rule__Pair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2575:1: ( ( '<' ) )
            // InternalNpl.g:2576:1: ( '<' )
            {
            // InternalNpl.g:2576:1: ( '<' )
            // InternalNpl.g:2577:1: '<'
            {
             before(grammarAccess.getPairAccess().getLessThanSignKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPairAccess().getLessThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pair__Group__2__Impl"


    // $ANTLR start "rule__Pair__Group__3"
    // InternalNpl.g:2590:1: rule__Pair__Group__3 : rule__Pair__Group__3__Impl rule__Pair__Group__4 ;
    public final void rule__Pair__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2594:1: ( rule__Pair__Group__3__Impl rule__Pair__Group__4 )
            // InternalNpl.g:2595:2: rule__Pair__Group__3__Impl rule__Pair__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__Pair__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pair__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pair__Group__3"


    // $ANTLR start "rule__Pair__Group__3__Impl"
    // InternalNpl.g:2602:1: rule__Pair__Group__3__Impl : ( ( rule__Pair__ValueAssignment_3 ) ) ;
    public final void rule__Pair__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2606:1: ( ( ( rule__Pair__ValueAssignment_3 ) ) )
            // InternalNpl.g:2607:1: ( ( rule__Pair__ValueAssignment_3 ) )
            {
            // InternalNpl.g:2607:1: ( ( rule__Pair__ValueAssignment_3 ) )
            // InternalNpl.g:2608:1: ( rule__Pair__ValueAssignment_3 )
            {
             before(grammarAccess.getPairAccess().getValueAssignment_3()); 
            // InternalNpl.g:2609:1: ( rule__Pair__ValueAssignment_3 )
            // InternalNpl.g:2609:2: rule__Pair__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Pair__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPairAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pair__Group__3__Impl"


    // $ANTLR start "rule__Pair__Group__4"
    // InternalNpl.g:2619:1: rule__Pair__Group__4 : rule__Pair__Group__4__Impl ;
    public final void rule__Pair__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2623:1: ( rule__Pair__Group__4__Impl )
            // InternalNpl.g:2624:2: rule__Pair__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pair__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pair__Group__4"


    // $ANTLR start "rule__Pair__Group__4__Impl"
    // InternalNpl.g:2630:1: rule__Pair__Group__4__Impl : ( '>' ) ;
    public final void rule__Pair__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2634:1: ( ( '>' ) )
            // InternalNpl.g:2635:1: ( '>' )
            {
            // InternalNpl.g:2635:1: ( '>' )
            // InternalNpl.g:2636:1: '>'
            {
             before(grammarAccess.getPairAccess().getGreaterThanSignKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getPairAccess().getGreaterThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pair__Group__4__Impl"


    // $ANTLR start "rule__Float__Group__0"
    // InternalNpl.g:2659:1: rule__Float__Group__0 : rule__Float__Group__0__Impl rule__Float__Group__1 ;
    public final void rule__Float__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2663:1: ( rule__Float__Group__0__Impl rule__Float__Group__1 )
            // InternalNpl.g:2664:2: rule__Float__Group__0__Impl rule__Float__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Float__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Float__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group__0"


    // $ANTLR start "rule__Float__Group__0__Impl"
    // InternalNpl.g:2671:1: rule__Float__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Float__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2675:1: ( ( RULE_INT ) )
            // InternalNpl.g:2676:1: ( RULE_INT )
            {
            // InternalNpl.g:2676:1: ( RULE_INT )
            // InternalNpl.g:2677:1: RULE_INT
            {
             before(grammarAccess.getFloatAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFloatAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group__0__Impl"


    // $ANTLR start "rule__Float__Group__1"
    // InternalNpl.g:2688:1: rule__Float__Group__1 : rule__Float__Group__1__Impl ;
    public final void rule__Float__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2692:1: ( rule__Float__Group__1__Impl )
            // InternalNpl.g:2693:2: rule__Float__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Float__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group__1"


    // $ANTLR start "rule__Float__Group__1__Impl"
    // InternalNpl.g:2699:1: rule__Float__Group__1__Impl : ( ( rule__Float__Group_1__0 )? ) ;
    public final void rule__Float__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2703:1: ( ( ( rule__Float__Group_1__0 )? ) )
            // InternalNpl.g:2704:1: ( ( rule__Float__Group_1__0 )? )
            {
            // InternalNpl.g:2704:1: ( ( rule__Float__Group_1__0 )? )
            // InternalNpl.g:2705:1: ( rule__Float__Group_1__0 )?
            {
             before(grammarAccess.getFloatAccess().getGroup_1()); 
            // InternalNpl.g:2706:1: ( rule__Float__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=12 && LA11_0<=13)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalNpl.g:2706:2: rule__Float__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Float__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFloatAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group__1__Impl"


    // $ANTLR start "rule__Float__Group_1__0"
    // InternalNpl.g:2720:1: rule__Float__Group_1__0 : rule__Float__Group_1__0__Impl rule__Float__Group_1__1 ;
    public final void rule__Float__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2724:1: ( rule__Float__Group_1__0__Impl rule__Float__Group_1__1 )
            // InternalNpl.g:2725:2: rule__Float__Group_1__0__Impl rule__Float__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Float__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Float__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group_1__0"


    // $ANTLR start "rule__Float__Group_1__0__Impl"
    // InternalNpl.g:2732:1: rule__Float__Group_1__0__Impl : ( ( rule__Float__Alternatives_1_0 ) ) ;
    public final void rule__Float__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2736:1: ( ( ( rule__Float__Alternatives_1_0 ) ) )
            // InternalNpl.g:2737:1: ( ( rule__Float__Alternatives_1_0 ) )
            {
            // InternalNpl.g:2737:1: ( ( rule__Float__Alternatives_1_0 ) )
            // InternalNpl.g:2738:1: ( rule__Float__Alternatives_1_0 )
            {
             before(grammarAccess.getFloatAccess().getAlternatives_1_0()); 
            // InternalNpl.g:2739:1: ( rule__Float__Alternatives_1_0 )
            // InternalNpl.g:2739:2: rule__Float__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Float__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getFloatAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group_1__0__Impl"


    // $ANTLR start "rule__Float__Group_1__1"
    // InternalNpl.g:2749:1: rule__Float__Group_1__1 : rule__Float__Group_1__1__Impl ;
    public final void rule__Float__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2753:1: ( rule__Float__Group_1__1__Impl )
            // InternalNpl.g:2754:2: rule__Float__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Float__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group_1__1"


    // $ANTLR start "rule__Float__Group_1__1__Impl"
    // InternalNpl.g:2760:1: rule__Float__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__Float__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2764:1: ( ( RULE_INT ) )
            // InternalNpl.g:2765:1: ( RULE_INT )
            {
            // InternalNpl.g:2765:1: ( RULE_INT )
            // InternalNpl.g:2766:1: RULE_INT
            {
             before(grammarAccess.getFloatAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFloatAccess().getINTTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group_1__1__Impl"


    // $ANTLR start "rule__Declaration__UnorderedGroup"
    // InternalNpl.g:2782:1: rule__Declaration__UnorderedGroup : rule__Declaration__UnorderedGroup__0 {...}?;
    public final void rule__Declaration__UnorderedGroup() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getDeclarationAccess().getUnorderedGroup());
            
        try {
            // InternalNpl.g:2787:1: ( rule__Declaration__UnorderedGroup__0 {...}?)
            // InternalNpl.g:2788:2: rule__Declaration__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__UnorderedGroup__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getDeclarationAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "rule__Declaration__UnorderedGroup", "getUnorderedGroupHelper().canLeave(grammarAccess.getDeclarationAccess().getUnorderedGroup())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getDeclarationAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__UnorderedGroup"


    // $ANTLR start "rule__Declaration__UnorderedGroup__Impl"
    // InternalNpl.g:2799:1: rule__Declaration__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__Declaration__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_8__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_9__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_10__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_11__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_12__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_13__0 ) ) ) ) | ({...}? => ( ( ( '}' ) ) ) ) ) ;
    public final void rule__Declaration__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // InternalNpl.g:2804:1: ( ( ({...}? => ( ( ( rule__Declaration__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_8__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_9__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_10__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_11__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_12__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_13__0 ) ) ) ) | ({...}? => ( ( ( '}' ) ) ) ) ) )
            // InternalNpl.g:2805:3: ( ({...}? => ( ( ( rule__Declaration__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_8__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_9__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_10__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_11__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_12__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_13__0 ) ) ) ) | ({...}? => ( ( ( '}' ) ) ) ) )
            {
            // InternalNpl.g:2805:3: ( ({...}? => ( ( ( rule__Declaration__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_8__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_9__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_10__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_11__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_12__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_13__0 ) ) ) ) | ({...}? => ( ( ( '}' ) ) ) ) )
            int alt12=15;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalNpl.g:2807:4: ({...}? => ( ( ( rule__Declaration__Group_0__0 ) ) ) )
                    {
                    // InternalNpl.g:2807:4: ({...}? => ( ( ( rule__Declaration__Group_0__0 ) ) ) )
                    // InternalNpl.g:2808:5: {...}? => ( ( ( rule__Declaration__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Declaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalNpl.g:2808:106: ( ( ( rule__Declaration__Group_0__0 ) ) )
                    // InternalNpl.g:2809:6: ( ( rule__Declaration__Group_0__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalNpl.g:2815:6: ( ( rule__Declaration__Group_0__0 ) )
                    // InternalNpl.g:2817:7: ( rule__Declaration__Group_0__0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getGroup_0()); 
                    // InternalNpl.g:2818:7: ( rule__Declaration__Group_0__0 )
                    // InternalNpl.g:2818:8: rule__Declaration__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Declaration__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeclarationAccess().getGroup_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalNpl.g:2824:4: ({...}? => ( ( ( rule__Declaration__Group_1__0 ) ) ) )
                    {
                    // InternalNpl.g:2824:4: ({...}? => ( ( ( rule__Declaration__Group_1__0 ) ) ) )
                    // InternalNpl.g:2825:5: {...}? => ( ( ( rule__Declaration__Group_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Declaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalNpl.g:2825:106: ( ( ( rule__Declaration__Group_1__0 ) ) )
                    // InternalNpl.g:2826:6: ( ( rule__Declaration__Group_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalNpl.g:2832:6: ( ( rule__Declaration__Group_1__0 ) )
                    // InternalNpl.g:2834:7: ( rule__Declaration__Group_1__0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getGroup_1()); 
                    // InternalNpl.g:2835:7: ( rule__Declaration__Group_1__0 )
                    // InternalNpl.g:2835:8: rule__Declaration__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Declaration__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeclarationAccess().getGroup_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalNpl.g:2841:4: ({...}? => ( ( ( rule__Declaration__Group_2__0 ) ) ) )
                    {
                    // InternalNpl.g:2841:4: ({...}? => ( ( ( rule__Declaration__Group_2__0 ) ) ) )
                    // InternalNpl.g:2842:5: {...}? => ( ( ( rule__Declaration__Group_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Declaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2)");
                    }
                    // InternalNpl.g:2842:106: ( ( ( rule__Declaration__Group_2__0 ) ) )
                    // InternalNpl.g:2843:6: ( ( rule__Declaration__Group_2__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalNpl.g:2849:6: ( ( rule__Declaration__Group_2__0 ) )
                    // InternalNpl.g:2851:7: ( rule__Declaration__Group_2__0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getGroup_2()); 
                    // InternalNpl.g:2852:7: ( rule__Declaration__Group_2__0 )
                    // InternalNpl.g:2852:8: rule__Declaration__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Declaration__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeclarationAccess().getGroup_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalNpl.g:2858:4: ({...}? => ( ( ( rule__Declaration__Group_3__0 ) ) ) )
                    {
                    // InternalNpl.g:2858:4: ({...}? => ( ( ( rule__Declaration__Group_3__0 ) ) ) )
                    // InternalNpl.g:2859:5: {...}? => ( ( ( rule__Declaration__Group_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3) ) {
                        throw new FailedPredicateException(input, "rule__Declaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3)");
                    }
                    // InternalNpl.g:2859:106: ( ( ( rule__Declaration__Group_3__0 ) ) )
                    // InternalNpl.g:2860:6: ( ( rule__Declaration__Group_3__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalNpl.g:2866:6: ( ( rule__Declaration__Group_3__0 ) )
                    // InternalNpl.g:2868:7: ( rule__Declaration__Group_3__0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getGroup_3()); 
                    // InternalNpl.g:2869:7: ( rule__Declaration__Group_3__0 )
                    // InternalNpl.g:2869:8: rule__Declaration__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Declaration__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeclarationAccess().getGroup_3()); 

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalNpl.g:2875:4: ({...}? => ( ( ( rule__Declaration__Group_4__0 ) ) ) )
                    {
                    // InternalNpl.g:2875:4: ({...}? => ( ( ( rule__Declaration__Group_4__0 ) ) ) )
                    // InternalNpl.g:2876:5: {...}? => ( ( ( rule__Declaration__Group_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4) ) {
                        throw new FailedPredicateException(input, "rule__Declaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4)");
                    }
                    // InternalNpl.g:2876:106: ( ( ( rule__Declaration__Group_4__0 ) ) )
                    // InternalNpl.g:2877:6: ( ( rule__Declaration__Group_4__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalNpl.g:2883:6: ( ( rule__Declaration__Group_4__0 ) )
                    // InternalNpl.g:2885:7: ( rule__Declaration__Group_4__0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getGroup_4()); 
                    // InternalNpl.g:2886:7: ( rule__Declaration__Group_4__0 )
                    // InternalNpl.g:2886:8: rule__Declaration__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Declaration__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeclarationAccess().getGroup_4()); 

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalNpl.g:2892:4: ({...}? => ( ( ( rule__Declaration__Group_5__0 ) ) ) )
                    {
                    // InternalNpl.g:2892:4: ({...}? => ( ( ( rule__Declaration__Group_5__0 ) ) ) )
                    // InternalNpl.g:2893:5: {...}? => ( ( ( rule__Declaration__Group_5__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5) ) {
                        throw new FailedPredicateException(input, "rule__Declaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5)");
                    }
                    // InternalNpl.g:2893:106: ( ( ( rule__Declaration__Group_5__0 ) ) )
                    // InternalNpl.g:2894:6: ( ( rule__Declaration__Group_5__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalNpl.g:2900:6: ( ( rule__Declaration__Group_5__0 ) )
                    // InternalNpl.g:2902:7: ( rule__Declaration__Group_5__0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getGroup_5()); 
                    // InternalNpl.g:2903:7: ( rule__Declaration__Group_5__0 )
                    // InternalNpl.g:2903:8: rule__Declaration__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Declaration__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeclarationAccess().getGroup_5()); 

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalNpl.g:2909:4: ({...}? => ( ( ( rule__Declaration__Group_6__0 ) ) ) )
                    {
                    // InternalNpl.g:2909:4: ({...}? => ( ( ( rule__Declaration__Group_6__0 ) ) ) )
                    // InternalNpl.g:2910:5: {...}? => ( ( ( rule__Declaration__Group_6__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6) ) {
                        throw new FailedPredicateException(input, "rule__Declaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6)");
                    }
                    // InternalNpl.g:2910:106: ( ( ( rule__Declaration__Group_6__0 ) ) )
                    // InternalNpl.g:2911:6: ( ( rule__Declaration__Group_6__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalNpl.g:2917:6: ( ( rule__Declaration__Group_6__0 ) )
                    // InternalNpl.g:2919:7: ( rule__Declaration__Group_6__0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getGroup_6()); 
                    // InternalNpl.g:2920:7: ( rule__Declaration__Group_6__0 )
                    // InternalNpl.g:2920:8: rule__Declaration__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Declaration__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeclarationAccess().getGroup_6()); 

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalNpl.g:2926:4: ({...}? => ( ( ( rule__Declaration__Group_7__0 ) ) ) )
                    {
                    // InternalNpl.g:2926:4: ({...}? => ( ( ( rule__Declaration__Group_7__0 ) ) ) )
                    // InternalNpl.g:2927:5: {...}? => ( ( ( rule__Declaration__Group_7__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7) ) {
                        throw new FailedPredicateException(input, "rule__Declaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7)");
                    }
                    // InternalNpl.g:2927:106: ( ( ( rule__Declaration__Group_7__0 ) ) )
                    // InternalNpl.g:2928:6: ( ( rule__Declaration__Group_7__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalNpl.g:2934:6: ( ( rule__Declaration__Group_7__0 ) )
                    // InternalNpl.g:2936:7: ( rule__Declaration__Group_7__0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getGroup_7()); 
                    // InternalNpl.g:2937:7: ( rule__Declaration__Group_7__0 )
                    // InternalNpl.g:2937:8: rule__Declaration__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Declaration__Group_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeclarationAccess().getGroup_7()); 

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalNpl.g:2943:4: ({...}? => ( ( ( rule__Declaration__Group_8__0 ) ) ) )
                    {
                    // InternalNpl.g:2943:4: ({...}? => ( ( ( rule__Declaration__Group_8__0 ) ) ) )
                    // InternalNpl.g:2944:5: {...}? => ( ( ( rule__Declaration__Group_8__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8) ) {
                        throw new FailedPredicateException(input, "rule__Declaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8)");
                    }
                    // InternalNpl.g:2944:106: ( ( ( rule__Declaration__Group_8__0 ) ) )
                    // InternalNpl.g:2945:6: ( ( rule__Declaration__Group_8__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalNpl.g:2951:6: ( ( rule__Declaration__Group_8__0 ) )
                    // InternalNpl.g:2953:7: ( rule__Declaration__Group_8__0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getGroup_8()); 
                    // InternalNpl.g:2954:7: ( rule__Declaration__Group_8__0 )
                    // InternalNpl.g:2954:8: rule__Declaration__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Declaration__Group_8__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeclarationAccess().getGroup_8()); 

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalNpl.g:2960:4: ({...}? => ( ( ( rule__Declaration__Group_9__0 ) ) ) )
                    {
                    // InternalNpl.g:2960:4: ({...}? => ( ( ( rule__Declaration__Group_9__0 ) ) ) )
                    // InternalNpl.g:2961:5: {...}? => ( ( ( rule__Declaration__Group_9__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9) ) {
                        throw new FailedPredicateException(input, "rule__Declaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9)");
                    }
                    // InternalNpl.g:2961:106: ( ( ( rule__Declaration__Group_9__0 ) ) )
                    // InternalNpl.g:2962:6: ( ( rule__Declaration__Group_9__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalNpl.g:2968:6: ( ( rule__Declaration__Group_9__0 ) )
                    // InternalNpl.g:2970:7: ( rule__Declaration__Group_9__0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getGroup_9()); 
                    // InternalNpl.g:2971:7: ( rule__Declaration__Group_9__0 )
                    // InternalNpl.g:2971:8: rule__Declaration__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Declaration__Group_9__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeclarationAccess().getGroup_9()); 

                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // InternalNpl.g:2977:4: ({...}? => ( ( ( rule__Declaration__Group_10__0 ) ) ) )
                    {
                    // InternalNpl.g:2977:4: ({...}? => ( ( ( rule__Declaration__Group_10__0 ) ) ) )
                    // InternalNpl.g:2978:5: {...}? => ( ( ( rule__Declaration__Group_10__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10) ) {
                        throw new FailedPredicateException(input, "rule__Declaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10)");
                    }
                    // InternalNpl.g:2978:107: ( ( ( rule__Declaration__Group_10__0 ) ) )
                    // InternalNpl.g:2979:6: ( ( rule__Declaration__Group_10__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalNpl.g:2985:6: ( ( rule__Declaration__Group_10__0 ) )
                    // InternalNpl.g:2987:7: ( rule__Declaration__Group_10__0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getGroup_10()); 
                    // InternalNpl.g:2988:7: ( rule__Declaration__Group_10__0 )
                    // InternalNpl.g:2988:8: rule__Declaration__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Declaration__Group_10__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeclarationAccess().getGroup_10()); 

                    }


                    }


                    }


                    }
                    break;
                case 12 :
                    // InternalNpl.g:2994:4: ({...}? => ( ( ( rule__Declaration__Group_11__0 ) ) ) )
                    {
                    // InternalNpl.g:2994:4: ({...}? => ( ( ( rule__Declaration__Group_11__0 ) ) ) )
                    // InternalNpl.g:2995:5: {...}? => ( ( ( rule__Declaration__Group_11__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11) ) {
                        throw new FailedPredicateException(input, "rule__Declaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11)");
                    }
                    // InternalNpl.g:2995:107: ( ( ( rule__Declaration__Group_11__0 ) ) )
                    // InternalNpl.g:2996:6: ( ( rule__Declaration__Group_11__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalNpl.g:3002:6: ( ( rule__Declaration__Group_11__0 ) )
                    // InternalNpl.g:3004:7: ( rule__Declaration__Group_11__0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getGroup_11()); 
                    // InternalNpl.g:3005:7: ( rule__Declaration__Group_11__0 )
                    // InternalNpl.g:3005:8: rule__Declaration__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Declaration__Group_11__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeclarationAccess().getGroup_11()); 

                    }


                    }


                    }


                    }
                    break;
                case 13 :
                    // InternalNpl.g:3011:4: ({...}? => ( ( ( rule__Declaration__Group_12__0 ) ) ) )
                    {
                    // InternalNpl.g:3011:4: ({...}? => ( ( ( rule__Declaration__Group_12__0 ) ) ) )
                    // InternalNpl.g:3012:5: {...}? => ( ( ( rule__Declaration__Group_12__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12) ) {
                        throw new FailedPredicateException(input, "rule__Declaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12)");
                    }
                    // InternalNpl.g:3012:107: ( ( ( rule__Declaration__Group_12__0 ) ) )
                    // InternalNpl.g:3013:6: ( ( rule__Declaration__Group_12__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalNpl.g:3019:6: ( ( rule__Declaration__Group_12__0 ) )
                    // InternalNpl.g:3021:7: ( rule__Declaration__Group_12__0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getGroup_12()); 
                    // InternalNpl.g:3022:7: ( rule__Declaration__Group_12__0 )
                    // InternalNpl.g:3022:8: rule__Declaration__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Declaration__Group_12__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeclarationAccess().getGroup_12()); 

                    }


                    }


                    }


                    }
                    break;
                case 14 :
                    // InternalNpl.g:3028:4: ({...}? => ( ( ( rule__Declaration__Group_13__0 ) ) ) )
                    {
                    // InternalNpl.g:3028:4: ({...}? => ( ( ( rule__Declaration__Group_13__0 ) ) ) )
                    // InternalNpl.g:3029:5: {...}? => ( ( ( rule__Declaration__Group_13__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13) ) {
                        throw new FailedPredicateException(input, "rule__Declaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13)");
                    }
                    // InternalNpl.g:3029:107: ( ( ( rule__Declaration__Group_13__0 ) ) )
                    // InternalNpl.g:3030:6: ( ( rule__Declaration__Group_13__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalNpl.g:3036:6: ( ( rule__Declaration__Group_13__0 ) )
                    // InternalNpl.g:3038:7: ( rule__Declaration__Group_13__0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getGroup_13()); 
                    // InternalNpl.g:3039:7: ( rule__Declaration__Group_13__0 )
                    // InternalNpl.g:3039:8: rule__Declaration__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Declaration__Group_13__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeclarationAccess().getGroup_13()); 

                    }


                    }


                    }


                    }
                    break;
                case 15 :
                    // InternalNpl.g:3045:4: ({...}? => ( ( ( '}' ) ) ) )
                    {
                    // InternalNpl.g:3045:4: ({...}? => ( ( ( '}' ) ) ) )
                    // InternalNpl.g:3046:5: {...}? => ( ( ( '}' ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14) ) {
                        throw new FailedPredicateException(input, "rule__Declaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14)");
                    }
                    // InternalNpl.g:3046:107: ( ( ( '}' ) ) )
                    // InternalNpl.g:3047:6: ( ( '}' ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalNpl.g:3053:6: ( ( '}' ) )
                    // InternalNpl.g:3055:7: ( '}' )
                    {
                     before(grammarAccess.getDeclarationAccess().getRightCurlyBracketKeyword_14()); 
                    // InternalNpl.g:3056:7: ( '}' )
                    // InternalNpl.g:3057:2: '}'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getDeclarationAccess().getRightCurlyBracketKeyword_14()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeclarationAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__UnorderedGroup__Impl"


    // $ANTLR start "rule__Declaration__UnorderedGroup__0"
    // InternalNpl.g:3073:1: rule__Declaration__UnorderedGroup__0 : rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__1 )? ;
    public final void rule__Declaration__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3077:1: ( rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__1 )? )
            // InternalNpl.g:3078:2: rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_27);
            rule__Declaration__UnorderedGroup__Impl();

            state._fsp--;

            // InternalNpl.g:3079:2: ( rule__Declaration__UnorderedGroup__1 )?
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalNpl.g:3079:2: rule__Declaration__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Declaration__UnorderedGroup__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__UnorderedGroup__0"


    // $ANTLR start "rule__Declaration__UnorderedGroup__1"
    // InternalNpl.g:3086:1: rule__Declaration__UnorderedGroup__1 : rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__2 )? ;
    public final void rule__Declaration__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3090:1: ( rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__2 )? )
            // InternalNpl.g:3091:2: rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_27);
            rule__Declaration__UnorderedGroup__Impl();

            state._fsp--;

            // InternalNpl.g:3092:2: ( rule__Declaration__UnorderedGroup__2 )?
            int alt14=2;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalNpl.g:3092:2: rule__Declaration__UnorderedGroup__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Declaration__UnorderedGroup__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__UnorderedGroup__1"


    // $ANTLR start "rule__Declaration__UnorderedGroup__2"
    // InternalNpl.g:3099:1: rule__Declaration__UnorderedGroup__2 : rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__3 )? ;
    public final void rule__Declaration__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3103:1: ( rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__3 )? )
            // InternalNpl.g:3104:2: rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__3 )?
            {
            pushFollow(FOLLOW_27);
            rule__Declaration__UnorderedGroup__Impl();

            state._fsp--;

            // InternalNpl.g:3105:2: ( rule__Declaration__UnorderedGroup__3 )?
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalNpl.g:3105:2: rule__Declaration__UnorderedGroup__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Declaration__UnorderedGroup__3();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__UnorderedGroup__2"


    // $ANTLR start "rule__Declaration__UnorderedGroup__3"
    // InternalNpl.g:3112:1: rule__Declaration__UnorderedGroup__3 : rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__4 )? ;
    public final void rule__Declaration__UnorderedGroup__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3116:1: ( rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__4 )? )
            // InternalNpl.g:3117:2: rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__4 )?
            {
            pushFollow(FOLLOW_27);
            rule__Declaration__UnorderedGroup__Impl();

            state._fsp--;

            // InternalNpl.g:3118:2: ( rule__Declaration__UnorderedGroup__4 )?
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalNpl.g:3118:2: rule__Declaration__UnorderedGroup__4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Declaration__UnorderedGroup__4();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__UnorderedGroup__3"


    // $ANTLR start "rule__Declaration__UnorderedGroup__4"
    // InternalNpl.g:3125:1: rule__Declaration__UnorderedGroup__4 : rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__5 )? ;
    public final void rule__Declaration__UnorderedGroup__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3129:1: ( rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__5 )? )
            // InternalNpl.g:3130:2: rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__5 )?
            {
            pushFollow(FOLLOW_27);
            rule__Declaration__UnorderedGroup__Impl();

            state._fsp--;

            // InternalNpl.g:3131:2: ( rule__Declaration__UnorderedGroup__5 )?
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalNpl.g:3131:2: rule__Declaration__UnorderedGroup__5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Declaration__UnorderedGroup__5();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__UnorderedGroup__4"


    // $ANTLR start "rule__Declaration__UnorderedGroup__5"
    // InternalNpl.g:3138:1: rule__Declaration__UnorderedGroup__5 : rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__6 )? ;
    public final void rule__Declaration__UnorderedGroup__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3142:1: ( rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__6 )? )
            // InternalNpl.g:3143:2: rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__6 )?
            {
            pushFollow(FOLLOW_27);
            rule__Declaration__UnorderedGroup__Impl();

            state._fsp--;

            // InternalNpl.g:3144:2: ( rule__Declaration__UnorderedGroup__6 )?
            int alt18=2;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalNpl.g:3144:2: rule__Declaration__UnorderedGroup__6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Declaration__UnorderedGroup__6();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__UnorderedGroup__5"


    // $ANTLR start "rule__Declaration__UnorderedGroup__6"
    // InternalNpl.g:3151:1: rule__Declaration__UnorderedGroup__6 : rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__7 )? ;
    public final void rule__Declaration__UnorderedGroup__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3155:1: ( rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__7 )? )
            // InternalNpl.g:3156:2: rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__7 )?
            {
            pushFollow(FOLLOW_27);
            rule__Declaration__UnorderedGroup__Impl();

            state._fsp--;

            // InternalNpl.g:3157:2: ( rule__Declaration__UnorderedGroup__7 )?
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalNpl.g:3157:2: rule__Declaration__UnorderedGroup__7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Declaration__UnorderedGroup__7();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__UnorderedGroup__6"


    // $ANTLR start "rule__Declaration__UnorderedGroup__7"
    // InternalNpl.g:3164:1: rule__Declaration__UnorderedGroup__7 : rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__8 )? ;
    public final void rule__Declaration__UnorderedGroup__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3168:1: ( rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__8 )? )
            // InternalNpl.g:3169:2: rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__8 )?
            {
            pushFollow(FOLLOW_27);
            rule__Declaration__UnorderedGroup__Impl();

            state._fsp--;

            // InternalNpl.g:3170:2: ( rule__Declaration__UnorderedGroup__8 )?
            int alt20=2;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalNpl.g:3170:2: rule__Declaration__UnorderedGroup__8
                    {
                    pushFollow(FOLLOW_2);
                    rule__Declaration__UnorderedGroup__8();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__UnorderedGroup__7"


    // $ANTLR start "rule__Declaration__UnorderedGroup__8"
    // InternalNpl.g:3177:1: rule__Declaration__UnorderedGroup__8 : rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__9 )? ;
    public final void rule__Declaration__UnorderedGroup__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3181:1: ( rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__9 )? )
            // InternalNpl.g:3182:2: rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__9 )?
            {
            pushFollow(FOLLOW_27);
            rule__Declaration__UnorderedGroup__Impl();

            state._fsp--;

            // InternalNpl.g:3183:2: ( rule__Declaration__UnorderedGroup__9 )?
            int alt21=2;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalNpl.g:3183:2: rule__Declaration__UnorderedGroup__9
                    {
                    pushFollow(FOLLOW_2);
                    rule__Declaration__UnorderedGroup__9();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__UnorderedGroup__8"


    // $ANTLR start "rule__Declaration__UnorderedGroup__9"
    // InternalNpl.g:3190:1: rule__Declaration__UnorderedGroup__9 : rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__10 )? ;
    public final void rule__Declaration__UnorderedGroup__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3194:1: ( rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__10 )? )
            // InternalNpl.g:3195:2: rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__10 )?
            {
            pushFollow(FOLLOW_27);
            rule__Declaration__UnorderedGroup__Impl();

            state._fsp--;

            // InternalNpl.g:3196:2: ( rule__Declaration__UnorderedGroup__10 )?
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalNpl.g:3196:2: rule__Declaration__UnorderedGroup__10
                    {
                    pushFollow(FOLLOW_2);
                    rule__Declaration__UnorderedGroup__10();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__UnorderedGroup__9"


    // $ANTLR start "rule__Declaration__UnorderedGroup__10"
    // InternalNpl.g:3203:1: rule__Declaration__UnorderedGroup__10 : rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__11 )? ;
    public final void rule__Declaration__UnorderedGroup__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3207:1: ( rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__11 )? )
            // InternalNpl.g:3208:2: rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__11 )?
            {
            pushFollow(FOLLOW_27);
            rule__Declaration__UnorderedGroup__Impl();

            state._fsp--;

            // InternalNpl.g:3209:2: ( rule__Declaration__UnorderedGroup__11 )?
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // InternalNpl.g:3209:2: rule__Declaration__UnorderedGroup__11
                    {
                    pushFollow(FOLLOW_2);
                    rule__Declaration__UnorderedGroup__11();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__UnorderedGroup__10"


    // $ANTLR start "rule__Declaration__UnorderedGroup__11"
    // InternalNpl.g:3216:1: rule__Declaration__UnorderedGroup__11 : rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__12 )? ;
    public final void rule__Declaration__UnorderedGroup__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3220:1: ( rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__12 )? )
            // InternalNpl.g:3221:2: rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__12 )?
            {
            pushFollow(FOLLOW_27);
            rule__Declaration__UnorderedGroup__Impl();

            state._fsp--;

            // InternalNpl.g:3222:2: ( rule__Declaration__UnorderedGroup__12 )?
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // InternalNpl.g:3222:2: rule__Declaration__UnorderedGroup__12
                    {
                    pushFollow(FOLLOW_2);
                    rule__Declaration__UnorderedGroup__12();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__UnorderedGroup__11"


    // $ANTLR start "rule__Declaration__UnorderedGroup__12"
    // InternalNpl.g:3229:1: rule__Declaration__UnorderedGroup__12 : rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__13 )? ;
    public final void rule__Declaration__UnorderedGroup__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3233:1: ( rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__13 )? )
            // InternalNpl.g:3234:2: rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__13 )?
            {
            pushFollow(FOLLOW_27);
            rule__Declaration__UnorderedGroup__Impl();

            state._fsp--;

            // InternalNpl.g:3235:2: ( rule__Declaration__UnorderedGroup__13 )?
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // InternalNpl.g:3235:2: rule__Declaration__UnorderedGroup__13
                    {
                    pushFollow(FOLLOW_2);
                    rule__Declaration__UnorderedGroup__13();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__UnorderedGroup__12"


    // $ANTLR start "rule__Declaration__UnorderedGroup__13"
    // InternalNpl.g:3242:1: rule__Declaration__UnorderedGroup__13 : rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__14 )? ;
    public final void rule__Declaration__UnorderedGroup__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3246:1: ( rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__14 )? )
            // InternalNpl.g:3247:2: rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__14 )?
            {
            pushFollow(FOLLOW_27);
            rule__Declaration__UnorderedGroup__Impl();

            state._fsp--;

            // InternalNpl.g:3248:2: ( rule__Declaration__UnorderedGroup__14 )?
            int alt26=2;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // InternalNpl.g:3248:2: rule__Declaration__UnorderedGroup__14
                    {
                    pushFollow(FOLLOW_2);
                    rule__Declaration__UnorderedGroup__14();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__UnorderedGroup__13"


    // $ANTLR start "rule__Declaration__UnorderedGroup__14"
    // InternalNpl.g:3255:1: rule__Declaration__UnorderedGroup__14 : rule__Declaration__UnorderedGroup__Impl ;
    public final void rule__Declaration__UnorderedGroup__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3259:1: ( rule__Declaration__UnorderedGroup__Impl )
            // InternalNpl.g:3260:2: rule__Declaration__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__UnorderedGroup__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__UnorderedGroup__14"


    // $ANTLR start "rule__Declaration__NameAssignment_0_1"
    // InternalNpl.g:3297:1: rule__Declaration__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Declaration__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3301:1: ( ( RULE_ID ) )
            // InternalNpl.g:3302:1: ( RULE_ID )
            {
            // InternalNpl.g:3302:1: ( RULE_ID )
            // InternalNpl.g:3303:1: RULE_ID
            {
             before(grammarAccess.getDeclarationAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getNameIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__NameAssignment_0_1"


    // $ANTLR start "rule__Declaration__RecrawlAssignment_1_0"
    // InternalNpl.g:3312:1: rule__Declaration__RecrawlAssignment_1_0 : ( ( 'recrawl' ) ) ;
    public final void rule__Declaration__RecrawlAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3316:1: ( ( ( 'recrawl' ) ) )
            // InternalNpl.g:3317:1: ( ( 'recrawl' ) )
            {
            // InternalNpl.g:3317:1: ( ( 'recrawl' ) )
            // InternalNpl.g:3318:1: ( 'recrawl' )
            {
             before(grammarAccess.getDeclarationAccess().getRecrawlRecrawlKeyword_1_0_0()); 
            // InternalNpl.g:3319:1: ( 'recrawl' )
            // InternalNpl.g:3320:1: 'recrawl'
            {
             before(grammarAccess.getDeclarationAccess().getRecrawlRecrawlKeyword_1_0_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getRecrawlRecrawlKeyword_1_0_0()); 

            }

             after(grammarAccess.getDeclarationAccess().getRecrawlRecrawlKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__RecrawlAssignment_1_0"


    // $ANTLR start "rule__Declaration__FeedlinksAssignment_1_3"
    // InternalNpl.g:3335:1: rule__Declaration__FeedlinksAssignment_1_3 : ( rulePair ) ;
    public final void rule__Declaration__FeedlinksAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3339:1: ( ( rulePair ) )
            // InternalNpl.g:3340:1: ( rulePair )
            {
            // InternalNpl.g:3340:1: ( rulePair )
            // InternalNpl.g:3341:1: rulePair
            {
             before(grammarAccess.getDeclarationAccess().getFeedlinksPairParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            rulePair();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getFeedlinksPairParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__FeedlinksAssignment_1_3"


    // $ANTLR start "rule__Declaration__FeedlinksAssignment_1_4"
    // InternalNpl.g:3350:1: rule__Declaration__FeedlinksAssignment_1_4 : ( rulePair ) ;
    public final void rule__Declaration__FeedlinksAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3354:1: ( ( rulePair ) )
            // InternalNpl.g:3355:1: ( rulePair )
            {
            // InternalNpl.g:3355:1: ( rulePair )
            // InternalNpl.g:3356:1: rulePair
            {
             before(grammarAccess.getDeclarationAccess().getFeedlinksPairParserRuleCall_1_4_0()); 
            pushFollow(FOLLOW_2);
            rulePair();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getFeedlinksPairParserRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__FeedlinksAssignment_1_4"


    // $ANTLR start "rule__Declaration__TopicsAssignment_2_2"
    // InternalNpl.g:3365:1: rule__Declaration__TopicsAssignment_2_2 : ( ruleTopic ) ;
    public final void rule__Declaration__TopicsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3369:1: ( ( ruleTopic ) )
            // InternalNpl.g:3370:1: ( ruleTopic )
            {
            // InternalNpl.g:3370:1: ( ruleTopic )
            // InternalNpl.g:3371:1: ruleTopic
            {
             before(grammarAccess.getDeclarationAccess().getTopicsTopicParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTopic();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getTopicsTopicParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__TopicsAssignment_2_2"


    // $ANTLR start "rule__Declaration__TopicsAssignment_2_3"
    // InternalNpl.g:3380:1: rule__Declaration__TopicsAssignment_2_3 : ( ruleTopic ) ;
    public final void rule__Declaration__TopicsAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3384:1: ( ( ruleTopic ) )
            // InternalNpl.g:3385:1: ( ruleTopic )
            {
            // InternalNpl.g:3385:1: ( ruleTopic )
            // InternalNpl.g:3386:1: ruleTopic
            {
             before(grammarAccess.getDeclarationAccess().getTopicsTopicParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTopic();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getTopicsTopicParserRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__TopicsAssignment_2_3"


    // $ANTLR start "rule__Declaration__DateAssignment_3_1"
    // InternalNpl.g:3395:1: rule__Declaration__DateAssignment_3_1 : ( ruleDate ) ;
    public final void rule__Declaration__DateAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3399:1: ( ( ruleDate ) )
            // InternalNpl.g:3400:1: ( ruleDate )
            {
            // InternalNpl.g:3400:1: ( ruleDate )
            // InternalNpl.g:3401:1: ruleDate
            {
             before(grammarAccess.getDeclarationAccess().getDateDateParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getDateDateParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__DateAssignment_3_1"


    // $ANTLR start "rule__Declaration__LocationAssignment_4_1"
    // InternalNpl.g:3410:1: rule__Declaration__LocationAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Declaration__LocationAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3414:1: ( ( RULE_STRING ) )
            // InternalNpl.g:3415:1: ( RULE_STRING )
            {
            // InternalNpl.g:3415:1: ( RULE_STRING )
            // InternalNpl.g:3416:1: RULE_STRING
            {
             before(grammarAccess.getDeclarationAccess().getLocationSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getLocationSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__LocationAssignment_4_1"


    // $ANTLR start "rule__Declaration__PriceAssignment_5_1"
    // InternalNpl.g:3425:1: rule__Declaration__PriceAssignment_5_1 : ( rulePrice ) ;
    public final void rule__Declaration__PriceAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3429:1: ( ( rulePrice ) )
            // InternalNpl.g:3430:1: ( rulePrice )
            {
            // InternalNpl.g:3430:1: ( rulePrice )
            // InternalNpl.g:3431:1: rulePrice
            {
             before(grammarAccess.getDeclarationAccess().getPricePriceParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrice();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getPricePriceParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__PriceAssignment_5_1"


    // $ANTLR start "rule__Declaration__VolumeAssignment_6_1"
    // InternalNpl.g:3440:1: rule__Declaration__VolumeAssignment_6_1 : ( RULE_INT ) ;
    public final void rule__Declaration__VolumeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3444:1: ( ( RULE_INT ) )
            // InternalNpl.g:3445:1: ( RULE_INT )
            {
            // InternalNpl.g:3445:1: ( RULE_INT )
            // InternalNpl.g:3446:1: RULE_INT
            {
             before(grammarAccess.getDeclarationAccess().getVolumeINTTerminalRuleCall_6_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getVolumeINTTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__VolumeAssignment_6_1"


    // $ANTLR start "rule__Declaration__NumberAssignment_6_2_1"
    // InternalNpl.g:3455:1: rule__Declaration__NumberAssignment_6_2_1 : ( RULE_INT ) ;
    public final void rule__Declaration__NumberAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3459:1: ( ( RULE_INT ) )
            // InternalNpl.g:3460:1: ( RULE_INT )
            {
            // InternalNpl.g:3460:1: ( RULE_INT )
            // InternalNpl.g:3461:1: RULE_INT
            {
             before(grammarAccess.getDeclarationAccess().getNumberINTTerminalRuleCall_6_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getNumberINTTerminalRuleCall_6_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__NumberAssignment_6_2_1"


    // $ANTLR start "rule__Declaration__LanguageAssignment_7_1"
    // InternalNpl.g:3470:1: rule__Declaration__LanguageAssignment_7_1 : ( ruleLanguage ) ;
    public final void rule__Declaration__LanguageAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3474:1: ( ( ruleLanguage ) )
            // InternalNpl.g:3475:1: ( ruleLanguage )
            {
            // InternalNpl.g:3475:1: ( ruleLanguage )
            // InternalNpl.g:3476:1: ruleLanguage
            {
             before(grammarAccess.getDeclarationAccess().getLanguageLanguageParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLanguage();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getLanguageLanguageParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__LanguageAssignment_7_1"


    // $ANTLR start "rule__Declaration__FormatAssignment_8_1"
    // InternalNpl.g:3485:1: rule__Declaration__FormatAssignment_8_1 : ( ruleFormat ) ;
    public final void rule__Declaration__FormatAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3489:1: ( ( ruleFormat ) )
            // InternalNpl.g:3490:1: ( ruleFormat )
            {
            // InternalNpl.g:3490:1: ( ruleFormat )
            // InternalNpl.g:3491:1: ruleFormat
            {
             before(grammarAccess.getDeclarationAccess().getFormatFormatParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFormat();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getFormatFormatParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__FormatAssignment_8_1"


    // $ANTLR start "rule__Declaration__ArticleCntAssignment_9_1"
    // InternalNpl.g:3500:1: rule__Declaration__ArticleCntAssignment_9_1 : ( RULE_INT ) ;
    public final void rule__Declaration__ArticleCntAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3504:1: ( ( RULE_INT ) )
            // InternalNpl.g:3505:1: ( RULE_INT )
            {
            // InternalNpl.g:3505:1: ( RULE_INT )
            // InternalNpl.g:3506:1: RULE_INT
            {
             before(grammarAccess.getDeclarationAccess().getArticleCntINTTerminalRuleCall_9_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getArticleCntINTTerminalRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__ArticleCntAssignment_9_1"


    // $ANTLR start "rule__Declaration__ArticleWordsMinAssignment_10_1"
    // InternalNpl.g:3515:1: rule__Declaration__ArticleWordsMinAssignment_10_1 : ( RULE_INT ) ;
    public final void rule__Declaration__ArticleWordsMinAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3519:1: ( ( RULE_INT ) )
            // InternalNpl.g:3520:1: ( RULE_INT )
            {
            // InternalNpl.g:3520:1: ( RULE_INT )
            // InternalNpl.g:3521:1: RULE_INT
            {
             before(grammarAccess.getDeclarationAccess().getArticleWordsMinINTTerminalRuleCall_10_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getArticleWordsMinINTTerminalRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__ArticleWordsMinAssignment_10_1"


    // $ANTLR start "rule__Declaration__ArticleWordsMaxAssignment_10_3"
    // InternalNpl.g:3530:1: rule__Declaration__ArticleWordsMaxAssignment_10_3 : ( RULE_INT ) ;
    public final void rule__Declaration__ArticleWordsMaxAssignment_10_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3534:1: ( ( RULE_INT ) )
            // InternalNpl.g:3535:1: ( RULE_INT )
            {
            // InternalNpl.g:3535:1: ( RULE_INT )
            // InternalNpl.g:3536:1: RULE_INT
            {
             before(grammarAccess.getDeclarationAccess().getArticleWordsMaxINTTerminalRuleCall_10_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getArticleWordsMaxINTTerminalRuleCall_10_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__ArticleWordsMaxAssignment_10_3"


    // $ANTLR start "rule__Declaration__ImagesCntAssignment_11_1"
    // InternalNpl.g:3545:1: rule__Declaration__ImagesCntAssignment_11_1 : ( ruleImagesCount ) ;
    public final void rule__Declaration__ImagesCntAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3549:1: ( ( ruleImagesCount ) )
            // InternalNpl.g:3550:1: ( ruleImagesCount )
            {
            // InternalNpl.g:3550:1: ( ruleImagesCount )
            // InternalNpl.g:3551:1: ruleImagesCount
            {
             before(grammarAccess.getDeclarationAccess().getImagesCntImagesCountParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImagesCount();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getImagesCntImagesCountParserRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__ImagesCntAssignment_11_1"


    // $ANTLR start "rule__Declaration__ColumnsCntAssignment_12_1"
    // InternalNpl.g:3560:1: rule__Declaration__ColumnsCntAssignment_12_1 : ( RULE_INT ) ;
    public final void rule__Declaration__ColumnsCntAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3564:1: ( ( RULE_INT ) )
            // InternalNpl.g:3565:1: ( RULE_INT )
            {
            // InternalNpl.g:3565:1: ( RULE_INT )
            // InternalNpl.g:3566:1: RULE_INT
            {
             before(grammarAccess.getDeclarationAccess().getColumnsCntINTTerminalRuleCall_12_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getColumnsCntINTTerminalRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__ColumnsCntAssignment_12_1"


    // $ANTLR start "rule__Declaration__FontSizeAssignment_13_1"
    // InternalNpl.g:3575:1: rule__Declaration__FontSizeAssignment_13_1 : ( ruleFontSize ) ;
    public final void rule__Declaration__FontSizeAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3579:1: ( ( ruleFontSize ) )
            // InternalNpl.g:3580:1: ( ruleFontSize )
            {
            // InternalNpl.g:3580:1: ( ruleFontSize )
            // InternalNpl.g:3581:1: ruleFontSize
            {
             before(grammarAccess.getDeclarationAccess().getFontSizeFontSizeParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFontSize();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getFontSizeFontSizeParserRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__FontSizeAssignment_13_1"


    // $ANTLR start "rule__ImagesCount__ValueAssignment"
    // InternalNpl.g:3590:1: rule__ImagesCount__ValueAssignment : ( RULE_INT ) ;
    public final void rule__ImagesCount__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3594:1: ( ( RULE_INT ) )
            // InternalNpl.g:3595:1: ( RULE_INT )
            {
            // InternalNpl.g:3595:1: ( RULE_INT )
            // InternalNpl.g:3596:1: RULE_INT
            {
             before(grammarAccess.getImagesCountAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getImagesCountAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImagesCount__ValueAssignment"


    // $ANTLR start "rule__FontSize__ValueAssignment_0"
    // InternalNpl.g:3605:1: rule__FontSize__ValueAssignment_0 : ( ( 'small' ) ) ;
    public final void rule__FontSize__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3609:1: ( ( ( 'small' ) ) )
            // InternalNpl.g:3610:1: ( ( 'small' ) )
            {
            // InternalNpl.g:3610:1: ( ( 'small' ) )
            // InternalNpl.g:3611:1: ( 'small' )
            {
             before(grammarAccess.getFontSizeAccess().getValueSmallKeyword_0_0()); 
            // InternalNpl.g:3612:1: ( 'small' )
            // InternalNpl.g:3613:1: 'small'
            {
             before(grammarAccess.getFontSizeAccess().getValueSmallKeyword_0_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getFontSizeAccess().getValueSmallKeyword_0_0()); 

            }

             after(grammarAccess.getFontSizeAccess().getValueSmallKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontSize__ValueAssignment_0"


    // $ANTLR start "rule__FontSize__ValueAssignment_1"
    // InternalNpl.g:3628:1: rule__FontSize__ValueAssignment_1 : ( ( 'medium' ) ) ;
    public final void rule__FontSize__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3632:1: ( ( ( 'medium' ) ) )
            // InternalNpl.g:3633:1: ( ( 'medium' ) )
            {
            // InternalNpl.g:3633:1: ( ( 'medium' ) )
            // InternalNpl.g:3634:1: ( 'medium' )
            {
             before(grammarAccess.getFontSizeAccess().getValueMediumKeyword_1_0()); 
            // InternalNpl.g:3635:1: ( 'medium' )
            // InternalNpl.g:3636:1: 'medium'
            {
             before(grammarAccess.getFontSizeAccess().getValueMediumKeyword_1_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getFontSizeAccess().getValueMediumKeyword_1_0()); 

            }

             after(grammarAccess.getFontSizeAccess().getValueMediumKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontSize__ValueAssignment_1"


    // $ANTLR start "rule__FontSize__ValueAssignment_2"
    // InternalNpl.g:3651:1: rule__FontSize__ValueAssignment_2 : ( ( 'large' ) ) ;
    public final void rule__FontSize__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3655:1: ( ( ( 'large' ) ) )
            // InternalNpl.g:3656:1: ( ( 'large' ) )
            {
            // InternalNpl.g:3656:1: ( ( 'large' ) )
            // InternalNpl.g:3657:1: ( 'large' )
            {
             before(grammarAccess.getFontSizeAccess().getValueLargeKeyword_2_0()); 
            // InternalNpl.g:3658:1: ( 'large' )
            // InternalNpl.g:3659:1: 'large'
            {
             before(grammarAccess.getFontSizeAccess().getValueLargeKeyword_2_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getFontSizeAccess().getValueLargeKeyword_2_0()); 

            }

             after(grammarAccess.getFontSizeAccess().getValueLargeKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontSize__ValueAssignment_2"


    // $ANTLR start "rule__Format__ValueAssignment_0"
    // InternalNpl.g:3674:1: rule__Format__ValueAssignment_0 : ( ( 'DIN A6' ) ) ;
    public final void rule__Format__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3678:1: ( ( ( 'DIN A6' ) ) )
            // InternalNpl.g:3679:1: ( ( 'DIN A6' ) )
            {
            // InternalNpl.g:3679:1: ( ( 'DIN A6' ) )
            // InternalNpl.g:3680:1: ( 'DIN A6' )
            {
             before(grammarAccess.getFormatAccess().getValueDINA6Keyword_0_0()); 
            // InternalNpl.g:3681:1: ( 'DIN A6' )
            // InternalNpl.g:3682:1: 'DIN A6'
            {
             before(grammarAccess.getFormatAccess().getValueDINA6Keyword_0_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getFormatAccess().getValueDINA6Keyword_0_0()); 

            }

             after(grammarAccess.getFormatAccess().getValueDINA6Keyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Format__ValueAssignment_0"


    // $ANTLR start "rule__Format__ValueAssignment_1"
    // InternalNpl.g:3697:1: rule__Format__ValueAssignment_1 : ( ( 'DIN A5' ) ) ;
    public final void rule__Format__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3701:1: ( ( ( 'DIN A5' ) ) )
            // InternalNpl.g:3702:1: ( ( 'DIN A5' ) )
            {
            // InternalNpl.g:3702:1: ( ( 'DIN A5' ) )
            // InternalNpl.g:3703:1: ( 'DIN A5' )
            {
             before(grammarAccess.getFormatAccess().getValueDINA5Keyword_1_0()); 
            // InternalNpl.g:3704:1: ( 'DIN A5' )
            // InternalNpl.g:3705:1: 'DIN A5'
            {
             before(grammarAccess.getFormatAccess().getValueDINA5Keyword_1_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getFormatAccess().getValueDINA5Keyword_1_0()); 

            }

             after(grammarAccess.getFormatAccess().getValueDINA5Keyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Format__ValueAssignment_1"


    // $ANTLR start "rule__Format__ValueAssignment_2"
    // InternalNpl.g:3720:1: rule__Format__ValueAssignment_2 : ( ( 'DIN A4' ) ) ;
    public final void rule__Format__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3724:1: ( ( ( 'DIN A4' ) ) )
            // InternalNpl.g:3725:1: ( ( 'DIN A4' ) )
            {
            // InternalNpl.g:3725:1: ( ( 'DIN A4' ) )
            // InternalNpl.g:3726:1: ( 'DIN A4' )
            {
             before(grammarAccess.getFormatAccess().getValueDINA4Keyword_2_0()); 
            // InternalNpl.g:3727:1: ( 'DIN A4' )
            // InternalNpl.g:3728:1: 'DIN A4'
            {
             before(grammarAccess.getFormatAccess().getValueDINA4Keyword_2_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getFormatAccess().getValueDINA4Keyword_2_0()); 

            }

             after(grammarAccess.getFormatAccess().getValueDINA4Keyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Format__ValueAssignment_2"


    // $ANTLR start "rule__Format__ValueAssignment_3"
    // InternalNpl.g:3743:1: rule__Format__ValueAssignment_3 : ( ( 'DIN A3' ) ) ;
    public final void rule__Format__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3747:1: ( ( ( 'DIN A3' ) ) )
            // InternalNpl.g:3748:1: ( ( 'DIN A3' ) )
            {
            // InternalNpl.g:3748:1: ( ( 'DIN A3' ) )
            // InternalNpl.g:3749:1: ( 'DIN A3' )
            {
             before(grammarAccess.getFormatAccess().getValueDINA3Keyword_3_0()); 
            // InternalNpl.g:3750:1: ( 'DIN A3' )
            // InternalNpl.g:3751:1: 'DIN A3'
            {
             before(grammarAccess.getFormatAccess().getValueDINA3Keyword_3_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getFormatAccess().getValueDINA3Keyword_3_0()); 

            }

             after(grammarAccess.getFormatAccess().getValueDINA3Keyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Format__ValueAssignment_3"


    // $ANTLR start "rule__Format__ValueAssignment_4"
    // InternalNpl.g:3766:1: rule__Format__ValueAssignment_4 : ( ( 'DIN A2' ) ) ;
    public final void rule__Format__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3770:1: ( ( ( 'DIN A2' ) ) )
            // InternalNpl.g:3771:1: ( ( 'DIN A2' ) )
            {
            // InternalNpl.g:3771:1: ( ( 'DIN A2' ) )
            // InternalNpl.g:3772:1: ( 'DIN A2' )
            {
             before(grammarAccess.getFormatAccess().getValueDINA2Keyword_4_0()); 
            // InternalNpl.g:3773:1: ( 'DIN A2' )
            // InternalNpl.g:3774:1: 'DIN A2'
            {
             before(grammarAccess.getFormatAccess().getValueDINA2Keyword_4_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getFormatAccess().getValueDINA2Keyword_4_0()); 

            }

             after(grammarAccess.getFormatAccess().getValueDINA2Keyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Format__ValueAssignment_4"


    // $ANTLR start "rule__Format__ValueAssignment_5"
    // InternalNpl.g:3789:1: rule__Format__ValueAssignment_5 : ( ( 'DIN A1' ) ) ;
    public final void rule__Format__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3793:1: ( ( ( 'DIN A1' ) ) )
            // InternalNpl.g:3794:1: ( ( 'DIN A1' ) )
            {
            // InternalNpl.g:3794:1: ( ( 'DIN A1' ) )
            // InternalNpl.g:3795:1: ( 'DIN A1' )
            {
             before(grammarAccess.getFormatAccess().getValueDINA1Keyword_5_0()); 
            // InternalNpl.g:3796:1: ( 'DIN A1' )
            // InternalNpl.g:3797:1: 'DIN A1'
            {
             before(grammarAccess.getFormatAccess().getValueDINA1Keyword_5_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getFormatAccess().getValueDINA1Keyword_5_0()); 

            }

             after(grammarAccess.getFormatAccess().getValueDINA1Keyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Format__ValueAssignment_5"


    // $ANTLR start "rule__Format__ValueAssignment_6"
    // InternalNpl.g:3812:1: rule__Format__ValueAssignment_6 : ( ( 'DIN A0' ) ) ;
    public final void rule__Format__ValueAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3816:1: ( ( ( 'DIN A0' ) ) )
            // InternalNpl.g:3817:1: ( ( 'DIN A0' ) )
            {
            // InternalNpl.g:3817:1: ( ( 'DIN A0' ) )
            // InternalNpl.g:3818:1: ( 'DIN A0' )
            {
             before(grammarAccess.getFormatAccess().getValueDINA0Keyword_6_0()); 
            // InternalNpl.g:3819:1: ( 'DIN A0' )
            // InternalNpl.g:3820:1: 'DIN A0'
            {
             before(grammarAccess.getFormatAccess().getValueDINA0Keyword_6_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getFormatAccess().getValueDINA0Keyword_6_0()); 

            }

             after(grammarAccess.getFormatAccess().getValueDINA0Keyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Format__ValueAssignment_6"


    // $ANTLR start "rule__Date__DayAssignment_1"
    // InternalNpl.g:3835:1: rule__Date__DayAssignment_1 : ( RULE_INT ) ;
    public final void rule__Date__DayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3839:1: ( ( RULE_INT ) )
            // InternalNpl.g:3840:1: ( RULE_INT )
            {
            // InternalNpl.g:3840:1: ( RULE_INT )
            // InternalNpl.g:3841:1: RULE_INT
            {
             before(grammarAccess.getDateAccess().getDayINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getDayINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__DayAssignment_1"


    // $ANTLR start "rule__Date__MonthAssignment_3"
    // InternalNpl.g:3850:1: rule__Date__MonthAssignment_3 : ( RULE_INT ) ;
    public final void rule__Date__MonthAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3854:1: ( ( RULE_INT ) )
            // InternalNpl.g:3855:1: ( RULE_INT )
            {
            // InternalNpl.g:3855:1: ( RULE_INT )
            // InternalNpl.g:3856:1: RULE_INT
            {
             before(grammarAccess.getDateAccess().getMonthINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getMonthINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__MonthAssignment_3"


    // $ANTLR start "rule__Date__YearAssignment_5"
    // InternalNpl.g:3865:1: rule__Date__YearAssignment_5 : ( RULE_INT ) ;
    public final void rule__Date__YearAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3869:1: ( ( RULE_INT ) )
            // InternalNpl.g:3870:1: ( RULE_INT )
            {
            // InternalNpl.g:3870:1: ( RULE_INT )
            // InternalNpl.g:3871:1: RULE_INT
            {
             before(grammarAccess.getDateAccess().getYearINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getYearINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__YearAssignment_5"


    // $ANTLR start "rule__Language__ValueAssignment_0"
    // InternalNpl.g:3880:1: rule__Language__ValueAssignment_0 : ( ( 'English' ) ) ;
    public final void rule__Language__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3884:1: ( ( ( 'English' ) ) )
            // InternalNpl.g:3885:1: ( ( 'English' ) )
            {
            // InternalNpl.g:3885:1: ( ( 'English' ) )
            // InternalNpl.g:3886:1: ( 'English' )
            {
             before(grammarAccess.getLanguageAccess().getValueEnglishKeyword_0_0()); 
            // InternalNpl.g:3887:1: ( 'English' )
            // InternalNpl.g:3888:1: 'English'
            {
             before(grammarAccess.getLanguageAccess().getValueEnglishKeyword_0_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getLanguageAccess().getValueEnglishKeyword_0_0()); 

            }

             after(grammarAccess.getLanguageAccess().getValueEnglishKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__ValueAssignment_0"


    // $ANTLR start "rule__Language__ValueAssignment_1"
    // InternalNpl.g:3903:1: rule__Language__ValueAssignment_1 : ( ( 'German' ) ) ;
    public final void rule__Language__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3907:1: ( ( ( 'German' ) ) )
            // InternalNpl.g:3908:1: ( ( 'German' ) )
            {
            // InternalNpl.g:3908:1: ( ( 'German' ) )
            // InternalNpl.g:3909:1: ( 'German' )
            {
             before(grammarAccess.getLanguageAccess().getValueGermanKeyword_1_0()); 
            // InternalNpl.g:3910:1: ( 'German' )
            // InternalNpl.g:3911:1: 'German'
            {
             before(grammarAccess.getLanguageAccess().getValueGermanKeyword_1_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getLanguageAccess().getValueGermanKeyword_1_0()); 

            }

             after(grammarAccess.getLanguageAccess().getValueGermanKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__ValueAssignment_1"


    // $ANTLR start "rule__Price__ValueAssignment_1"
    // InternalNpl.g:3926:1: rule__Price__ValueAssignment_1 : ( ruleFloat ) ;
    public final void rule__Price__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3930:1: ( ( ruleFloat ) )
            // InternalNpl.g:3931:1: ( ruleFloat )
            {
            // InternalNpl.g:3931:1: ( ruleFloat )
            // InternalNpl.g:3932:1: ruleFloat
            {
             before(grammarAccess.getPriceAccess().getValueFloatParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFloat();

            state._fsp--;

             after(grammarAccess.getPriceAccess().getValueFloatParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Price__ValueAssignment_1"


    // $ANTLR start "rule__Price__CurrencyAssignment_2"
    // InternalNpl.g:3941:1: rule__Price__CurrencyAssignment_2 : ( ruleCurrency ) ;
    public final void rule__Price__CurrencyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3945:1: ( ( ruleCurrency ) )
            // InternalNpl.g:3946:1: ( ruleCurrency )
            {
            // InternalNpl.g:3946:1: ( ruleCurrency )
            // InternalNpl.g:3947:1: ruleCurrency
            {
             before(grammarAccess.getPriceAccess().getCurrencyCurrencyParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCurrency();

            state._fsp--;

             after(grammarAccess.getPriceAccess().getCurrencyCurrencyParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Price__CurrencyAssignment_2"


    // $ANTLR start "rule__Currency__ValueAssignment_0"
    // InternalNpl.g:3956:1: rule__Currency__ValueAssignment_0 : ( ( 'Euro' ) ) ;
    public final void rule__Currency__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3960:1: ( ( ( 'Euro' ) ) )
            // InternalNpl.g:3961:1: ( ( 'Euro' ) )
            {
            // InternalNpl.g:3961:1: ( ( 'Euro' ) )
            // InternalNpl.g:3962:1: ( 'Euro' )
            {
             before(grammarAccess.getCurrencyAccess().getValueEuroKeyword_0_0()); 
            // InternalNpl.g:3963:1: ( 'Euro' )
            // InternalNpl.g:3964:1: 'Euro'
            {
             before(grammarAccess.getCurrencyAccess().getValueEuroKeyword_0_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getCurrencyAccess().getValueEuroKeyword_0_0()); 

            }

             after(grammarAccess.getCurrencyAccess().getValueEuroKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Currency__ValueAssignment_0"


    // $ANTLR start "rule__Currency__ValueAssignment_1"
    // InternalNpl.g:3979:1: rule__Currency__ValueAssignment_1 : ( ( 'EUR' ) ) ;
    public final void rule__Currency__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3983:1: ( ( ( 'EUR' ) ) )
            // InternalNpl.g:3984:1: ( ( 'EUR' ) )
            {
            // InternalNpl.g:3984:1: ( ( 'EUR' ) )
            // InternalNpl.g:3985:1: ( 'EUR' )
            {
             before(grammarAccess.getCurrencyAccess().getValueEURKeyword_1_0()); 
            // InternalNpl.g:3986:1: ( 'EUR' )
            // InternalNpl.g:3987:1: 'EUR'
            {
             before(grammarAccess.getCurrencyAccess().getValueEURKeyword_1_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getCurrencyAccess().getValueEURKeyword_1_0()); 

            }

             after(grammarAccess.getCurrencyAccess().getValueEURKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Currency__ValueAssignment_1"


    // $ANTLR start "rule__Currency__ValueAssignment_2"
    // InternalNpl.g:4002:1: rule__Currency__ValueAssignment_2 : ( ( '\\u20AC' ) ) ;
    public final void rule__Currency__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:4006:1: ( ( ( '\\u20AC' ) ) )
            // InternalNpl.g:4007:1: ( ( '\\u20AC' ) )
            {
            // InternalNpl.g:4007:1: ( ( '\\u20AC' ) )
            // InternalNpl.g:4008:1: ( '\\u20AC' )
            {
             before(grammarAccess.getCurrencyAccess().getValueEuroSignKeyword_2_0()); 
            // InternalNpl.g:4009:1: ( '\\u20AC' )
            // InternalNpl.g:4010:1: '\\u20AC'
            {
             before(grammarAccess.getCurrencyAccess().getValueEuroSignKeyword_2_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getCurrencyAccess().getValueEuroSignKeyword_2_0()); 

            }

             after(grammarAccess.getCurrencyAccess().getValueEuroSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Currency__ValueAssignment_2"


    // $ANTLR start "rule__Currency__ValueAssignment_3"
    // InternalNpl.g:4025:1: rule__Currency__ValueAssignment_3 : ( ( 'Dollar' ) ) ;
    public final void rule__Currency__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:4029:1: ( ( ( 'Dollar' ) ) )
            // InternalNpl.g:4030:1: ( ( 'Dollar' ) )
            {
            // InternalNpl.g:4030:1: ( ( 'Dollar' ) )
            // InternalNpl.g:4031:1: ( 'Dollar' )
            {
             before(grammarAccess.getCurrencyAccess().getValueDollarKeyword_3_0()); 
            // InternalNpl.g:4032:1: ( 'Dollar' )
            // InternalNpl.g:4033:1: 'Dollar'
            {
             before(grammarAccess.getCurrencyAccess().getValueDollarKeyword_3_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getCurrencyAccess().getValueDollarKeyword_3_0()); 

            }

             after(grammarAccess.getCurrencyAccess().getValueDollarKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Currency__ValueAssignment_3"


    // $ANTLR start "rule__Currency__ValueAssignment_4"
    // InternalNpl.g:4048:1: rule__Currency__ValueAssignment_4 : ( ( 'USD' ) ) ;
    public final void rule__Currency__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:4052:1: ( ( ( 'USD' ) ) )
            // InternalNpl.g:4053:1: ( ( 'USD' ) )
            {
            // InternalNpl.g:4053:1: ( ( 'USD' ) )
            // InternalNpl.g:4054:1: ( 'USD' )
            {
             before(grammarAccess.getCurrencyAccess().getValueUSDKeyword_4_0()); 
            // InternalNpl.g:4055:1: ( 'USD' )
            // InternalNpl.g:4056:1: 'USD'
            {
             before(grammarAccess.getCurrencyAccess().getValueUSDKeyword_4_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getCurrencyAccess().getValueUSDKeyword_4_0()); 

            }

             after(grammarAccess.getCurrencyAccess().getValueUSDKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Currency__ValueAssignment_4"


    // $ANTLR start "rule__Currency__ValueAssignment_5"
    // InternalNpl.g:4071:1: rule__Currency__ValueAssignment_5 : ( ( '$' ) ) ;
    public final void rule__Currency__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:4075:1: ( ( ( '$' ) ) )
            // InternalNpl.g:4076:1: ( ( '$' ) )
            {
            // InternalNpl.g:4076:1: ( ( '$' ) )
            // InternalNpl.g:4077:1: ( '$' )
            {
             before(grammarAccess.getCurrencyAccess().getValueDollarSignKeyword_5_0()); 
            // InternalNpl.g:4078:1: ( '$' )
            // InternalNpl.g:4079:1: '$'
            {
             before(grammarAccess.getCurrencyAccess().getValueDollarSignKeyword_5_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getCurrencyAccess().getValueDollarSignKeyword_5_0()); 

            }

             after(grammarAccess.getCurrencyAccess().getValueDollarSignKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Currency__ValueAssignment_5"


    // $ANTLR start "rule__Topic__NameAssignment_1"
    // InternalNpl.g:4094:1: rule__Topic__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Topic__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:4098:1: ( ( RULE_ID ) )
            // InternalNpl.g:4099:1: ( RULE_ID )
            {
            // InternalNpl.g:4099:1: ( RULE_ID )
            // InternalNpl.g:4100:1: RULE_ID
            {
             before(grammarAccess.getTopicAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTopicAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__NameAssignment_1"


    // $ANTLR start "rule__Topic__TagsAssignment_3"
    // InternalNpl.g:4109:1: rule__Topic__TagsAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Topic__TagsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:4113:1: ( ( RULE_STRING ) )
            // InternalNpl.g:4114:1: ( RULE_STRING )
            {
            // InternalNpl.g:4114:1: ( RULE_STRING )
            // InternalNpl.g:4115:1: RULE_STRING
            {
             before(grammarAccess.getTopicAccess().getTagsSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTopicAccess().getTagsSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__TagsAssignment_3"


    // $ANTLR start "rule__Topic__TagsAssignment_4_1"
    // InternalNpl.g:4124:1: rule__Topic__TagsAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Topic__TagsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:4128:1: ( ( RULE_STRING ) )
            // InternalNpl.g:4129:1: ( RULE_STRING )
            {
            // InternalNpl.g:4129:1: ( RULE_STRING )
            // InternalNpl.g:4130:1: RULE_STRING
            {
             before(grammarAccess.getTopicAccess().getTagsSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTopicAccess().getTagsSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__TagsAssignment_4_1"


    // $ANTLR start "rule__Pair__TypeAssignment_0"
    // InternalNpl.g:4139:1: rule__Pair__TypeAssignment_0 : ( ruleFeedType ) ;
    public final void rule__Pair__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:4143:1: ( ( ruleFeedType ) )
            // InternalNpl.g:4144:1: ( ruleFeedType )
            {
            // InternalNpl.g:4144:1: ( ruleFeedType )
            // InternalNpl.g:4145:1: ruleFeedType
            {
             before(grammarAccess.getPairAccess().getTypeFeedTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFeedType();

            state._fsp--;

             after(grammarAccess.getPairAccess().getTypeFeedTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pair__TypeAssignment_0"


    // $ANTLR start "rule__Pair__KeyAssignment_1"
    // InternalNpl.g:4154:1: rule__Pair__KeyAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Pair__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:4158:1: ( ( RULE_STRING ) )
            // InternalNpl.g:4159:1: ( RULE_STRING )
            {
            // InternalNpl.g:4159:1: ( RULE_STRING )
            // InternalNpl.g:4160:1: RULE_STRING
            {
             before(grammarAccess.getPairAccess().getKeySTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPairAccess().getKeySTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pair__KeyAssignment_1"


    // $ANTLR start "rule__Pair__ValueAssignment_3"
    // InternalNpl.g:4169:1: rule__Pair__ValueAssignment_3 : ( RULE_URL ) ;
    public final void rule__Pair__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:4173:1: ( ( RULE_URL ) )
            // InternalNpl.g:4174:1: ( RULE_URL )
            {
            // InternalNpl.g:4174:1: ( RULE_URL )
            // InternalNpl.g:4175:1: RULE_URL
            {
             before(grammarAccess.getPairAccess().getValueURLTerminalRuleCall_3_0()); 
            match(input,RULE_URL,FOLLOW_2); 
             after(grammarAccess.getPairAccess().getValueURLTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pair__ValueAssignment_3"

    // Delegated rules


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA26 dfa26 = new DFA26(this);
    static final String dfa_1s = "\20\uffff";
    static final String dfa_2s = "\1\20\17\uffff";
    static final String dfa_3s = "\1\46\17\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17";
    static final String dfa_5s = "\1\0\17\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\2\uffff\1\17\1\3\1\4\1\5\1\6\1\7\1\uffff\1\10\1\11\1\12\1\13\1\uffff\1\14\1\15\1\16\4\uffff\1\2",
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
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "2805:3: ( ({...}? => ( ( ( rule__Declaration__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_8__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_9__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_10__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_11__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_12__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_13__0 ) ) ) ) | ({...}? => ( ( ( '}' ) ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                         
                        int index12_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA12_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA12_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA12_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA12_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA12_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA12_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA12_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA12_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA12_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA12_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA12_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( LA12_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11) ) {s = 12;}

                        else if ( LA12_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12) ) {s = 13;}

                        else if ( LA12_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13) ) {s = 14;}

                        else if ( LA12_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14) ) {s = 15;}

                         
                        input.seek(index12_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\21\uffff";
    static final String dfa_8s = "\1\20\20\uffff";
    static final String dfa_9s = "\1\46\20\uffff";
    static final String dfa_10s = "\1\uffff\17\1\1\2";
    static final String dfa_11s = "\1\0\20\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\2\uffff\1\17\1\3\1\4\1\5\1\6\1\7\1\uffff\1\10\1\11\1\12\1\13\1\uffff\1\14\1\15\1\16\4\uffff\1\2",
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

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_12s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "3079:2: ( rule__Declaration__UnorderedGroup__1 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_0 = input.LA(1);

                         
                        int index13_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA13_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA13_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA13_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA13_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA13_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA13_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA13_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA13_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA13_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA13_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA13_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( LA13_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11) ) {s = 12;}

                        else if ( LA13_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12) ) {s = 13;}

                        else if ( LA13_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13) ) {s = 14;}

                        else if ( LA13_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14) ) {s = 15;}

                        else if ( (LA13_0==EOF) ) {s = 16;}

                         
                        input.seek(index13_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "3092:2: ( rule__Declaration__UnorderedGroup__2 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_0 = input.LA(1);

                         
                        int index14_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA14_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA14_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA14_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA14_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA14_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA14_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA14_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA14_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA14_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA14_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA14_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( LA14_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11) ) {s = 12;}

                        else if ( LA14_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12) ) {s = 13;}

                        else if ( LA14_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13) ) {s = 14;}

                        else if ( LA14_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14) ) {s = 15;}

                        else if ( (LA14_0==EOF) ) {s = 16;}

                         
                        input.seek(index14_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "3105:2: ( rule__Declaration__UnorderedGroup__3 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_0 = input.LA(1);

                         
                        int index15_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA15_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA15_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA15_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA15_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA15_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA15_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA15_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA15_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA15_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA15_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA15_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( LA15_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11) ) {s = 12;}

                        else if ( LA15_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12) ) {s = 13;}

                        else if ( LA15_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13) ) {s = 14;}

                        else if ( LA15_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14) ) {s = 15;}

                        else if ( (LA15_0==EOF) ) {s = 16;}

                         
                        input.seek(index15_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "3118:2: ( rule__Declaration__UnorderedGroup__4 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_0 = input.LA(1);

                         
                        int index16_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA16_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA16_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA16_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA16_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA16_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA16_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA16_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA16_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA16_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA16_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA16_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( LA16_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11) ) {s = 12;}

                        else if ( LA16_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12) ) {s = 13;}

                        else if ( LA16_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13) ) {s = 14;}

                        else if ( LA16_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14) ) {s = 15;}

                        else if ( (LA16_0==EOF) ) {s = 16;}

                         
                        input.seek(index16_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "3131:2: ( rule__Declaration__UnorderedGroup__5 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_0 = input.LA(1);

                         
                        int index17_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA17_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA17_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA17_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA17_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA17_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA17_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA17_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA17_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA17_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA17_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA17_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( LA17_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11) ) {s = 12;}

                        else if ( LA17_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12) ) {s = 13;}

                        else if ( LA17_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13) ) {s = 14;}

                        else if ( LA17_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14) ) {s = 15;}

                        else if ( (LA17_0==EOF) ) {s = 16;}

                         
                        input.seek(index17_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "3144:2: ( rule__Declaration__UnorderedGroup__6 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_0 = input.LA(1);

                         
                        int index18_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA18_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA18_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA18_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA18_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA18_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA18_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA18_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA18_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA18_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA18_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA18_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( LA18_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11) ) {s = 12;}

                        else if ( LA18_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12) ) {s = 13;}

                        else if ( LA18_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13) ) {s = 14;}

                        else if ( LA18_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14) ) {s = 15;}

                        else if ( (LA18_0==EOF) ) {s = 16;}

                         
                        input.seek(index18_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "3157:2: ( rule__Declaration__UnorderedGroup__7 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_0 = input.LA(1);

                         
                        int index19_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA19_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA19_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA19_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA19_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA19_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA19_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA19_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA19_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA19_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA19_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA19_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( LA19_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11) ) {s = 12;}

                        else if ( LA19_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12) ) {s = 13;}

                        else if ( LA19_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13) ) {s = 14;}

                        else if ( LA19_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14) ) {s = 15;}

                        else if ( (LA19_0==EOF) ) {s = 16;}

                         
                        input.seek(index19_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "3170:2: ( rule__Declaration__UnorderedGroup__8 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_0 = input.LA(1);

                         
                        int index20_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA20_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA20_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA20_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA20_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA20_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA20_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA20_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA20_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA20_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA20_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA20_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( LA20_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11) ) {s = 12;}

                        else if ( LA20_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12) ) {s = 13;}

                        else if ( LA20_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13) ) {s = 14;}

                        else if ( LA20_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14) ) {s = 15;}

                        else if ( (LA20_0==EOF) ) {s = 16;}

                         
                        input.seek(index20_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "3183:2: ( rule__Declaration__UnorderedGroup__9 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_0 = input.LA(1);

                         
                        int index21_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA21_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA21_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA21_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA21_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA21_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA21_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA21_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA21_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA21_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA21_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA21_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( LA21_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11) ) {s = 12;}

                        else if ( LA21_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12) ) {s = 13;}

                        else if ( LA21_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13) ) {s = 14;}

                        else if ( LA21_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14) ) {s = 15;}

                        else if ( (LA21_0==EOF) ) {s = 16;}

                         
                        input.seek(index21_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "3196:2: ( rule__Declaration__UnorderedGroup__10 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_0 = input.LA(1);

                         
                        int index22_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA22_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA22_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA22_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA22_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA22_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA22_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA22_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA22_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA22_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA22_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA22_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( LA22_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11) ) {s = 12;}

                        else if ( LA22_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12) ) {s = 13;}

                        else if ( LA22_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13) ) {s = 14;}

                        else if ( LA22_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14) ) {s = 15;}

                        else if ( (LA22_0==EOF) ) {s = 16;}

                         
                        input.seek(index22_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "3209:2: ( rule__Declaration__UnorderedGroup__11 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_0 = input.LA(1);

                         
                        int index23_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA23_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA23_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA23_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA23_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA23_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA23_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA23_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA23_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA23_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA23_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA23_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( LA23_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11) ) {s = 12;}

                        else if ( LA23_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12) ) {s = 13;}

                        else if ( LA23_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13) ) {s = 14;}

                        else if ( LA23_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14) ) {s = 15;}

                        else if ( (LA23_0==EOF) ) {s = 16;}

                         
                        input.seek(index23_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "3222:2: ( rule__Declaration__UnorderedGroup__12 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_0 = input.LA(1);

                         
                        int index24_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA24_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA24_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA24_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA24_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA24_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA24_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA24_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA24_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA24_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA24_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA24_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( LA24_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11) ) {s = 12;}

                        else if ( LA24_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12) ) {s = 13;}

                        else if ( LA24_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13) ) {s = 14;}

                        else if ( LA24_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14) ) {s = 15;}

                        else if ( (LA24_0==EOF) ) {s = 16;}

                         
                        input.seek(index24_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "3235:2: ( rule__Declaration__UnorderedGroup__13 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_0 = input.LA(1);

                         
                        int index25_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA25_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA25_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA25_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA25_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA25_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA25_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA25_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA25_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA25_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA25_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA25_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( LA25_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11) ) {s = 12;}

                        else if ( LA25_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12) ) {s = 13;}

                        else if ( LA25_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13) ) {s = 14;}

                        else if ( LA25_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14) ) {s = 15;}

                        else if ( (LA25_0==EOF) ) {s = 16;}

                         
                        input.seek(index25_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "3248:2: ( rule__Declaration__UnorderedGroup__14 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_0 = input.LA(1);

                         
                        int index26_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA26_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA26_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA26_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA26_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA26_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA26_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA26_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA26_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA26_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA26_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA26_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( LA26_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11) ) {s = 12;}

                        else if ( LA26_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12) ) {s = 13;}

                        else if ( LA26_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13) ) {s = 14;}

                        else if ( LA26_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14) ) {s = 15;}

                        else if ( (LA26_0==EOF) ) {s = 16;}

                         
                        input.seek(index26_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000008C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000400080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0001FC0000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x01F8000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800080000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000043BDF90002L});

}
