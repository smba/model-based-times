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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_URL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "','", "'RSS'", "'Atom'", "'newspaper'", "'{'", "'title'", "'feed links'", "'}'", "'topics'", "'optional: date'", "'optional: location'", "'optional: price'", "'optional: volume'", "'no.'", "'optional: language'", "'format'", "'number of articles per topic'", "'number of words per article'", "'-'", "'optional: number of images per article'", "'number of columns'", "'font size'", "'topic'", "'as'", "', '", "'<'", "'>'", "'small'", "'medium'", "'large'", "'DIN A6'", "'DIN A5'", "'DIN A4'", "'DIN A3'", "'DIN A2'", "'DIN A1'", "'DIN A0'", "'English'", "'German'", "'Euro'", "'EUR'", "'\\u20AC'", "'Dollar'", "'USD'", "'$'"
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
            case 40:
                {
                alt1=1;
                }
                break;
            case 41:
                {
                alt1=2;
                }
                break;
            case 42:
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
            case 43:
                {
                alt2=1;
                }
                break;
            case 44:
                {
                alt2=2;
                }
                break;
            case 45:
                {
                alt2=3;
                }
                break;
            case 46:
                {
                alt2=4;
                }
                break;
            case 47:
                {
                alt2=5;
                }
                break;
            case 48:
                {
                alt2=6;
                }
                break;
            case 49:
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

            if ( (LA3_0==50) ) {
                alt3=1;
            }
            else if ( (LA3_0==51) ) {
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
            case 52:
                {
                alt4=1;
                }
                break;
            case 53:
                {
                alt4=2;
                }
                break;
            case 54:
                {
                alt4=3;
                }
                break;
            case 55:
                {
                alt4=4;
                }
                break;
            case 56:
                {
                alt4=5;
                }
                break;
            case 57:
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
    // InternalNpl.g:706:1: rule__Declaration__Group_1__0__Impl : ( 'title' ) ;
    public final void rule__Declaration__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:710:1: ( ( 'title' ) )
            // InternalNpl.g:711:1: ( 'title' )
            {
            // InternalNpl.g:711:1: ( 'title' )
            // InternalNpl.g:712:1: 'title'
            {
             before(grammarAccess.getDeclarationAccess().getTitleKeyword_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getTitleKeyword_1_0()); 

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
    // InternalNpl.g:725:1: rule__Declaration__Group_1__1 : rule__Declaration__Group_1__1__Impl rule__Declaration__Group_1__2 ;
    public final void rule__Declaration__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:729:1: ( rule__Declaration__Group_1__1__Impl rule__Declaration__Group_1__2 )
            // InternalNpl.g:730:2: rule__Declaration__Group_1__1__Impl rule__Declaration__Group_1__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalNpl.g:737:1: rule__Declaration__Group_1__1__Impl : ( ( rule__Declaration__TitleAssignment_1_1 ) ) ;
    public final void rule__Declaration__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:741:1: ( ( ( rule__Declaration__TitleAssignment_1_1 ) ) )
            // InternalNpl.g:742:1: ( ( rule__Declaration__TitleAssignment_1_1 ) )
            {
            // InternalNpl.g:742:1: ( ( rule__Declaration__TitleAssignment_1_1 ) )
            // InternalNpl.g:743:1: ( rule__Declaration__TitleAssignment_1_1 )
            {
             before(grammarAccess.getDeclarationAccess().getTitleAssignment_1_1()); 
            // InternalNpl.g:744:1: ( rule__Declaration__TitleAssignment_1_1 )
            // InternalNpl.g:744:2: rule__Declaration__TitleAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__TitleAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getTitleAssignment_1_1()); 

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
            pushFollow(FOLLOW_4);
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
    // InternalNpl.g:766:1: rule__Declaration__Group_1__2__Impl : ( 'feed links' ) ;
    public final void rule__Declaration__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:770:1: ( ( 'feed links' ) )
            // InternalNpl.g:771:1: ( 'feed links' )
            {
            // InternalNpl.g:771:1: ( 'feed links' )
            // InternalNpl.g:772:1: 'feed links'
            {
             before(grammarAccess.getDeclarationAccess().getFeedLinksKeyword_1_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getFeedLinksKeyword_1_2()); 

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
    // InternalNpl.g:797:1: rule__Declaration__Group_1__3__Impl : ( '{' ) ;
    public final void rule__Declaration__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:801:1: ( ( '{' ) )
            // InternalNpl.g:802:1: ( '{' )
            {
            // InternalNpl.g:802:1: ( '{' )
            // InternalNpl.g:803:1: '{'
            {
             before(grammarAccess.getDeclarationAccess().getLeftCurlyBracketKeyword_1_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getLeftCurlyBracketKeyword_1_3()); 

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
    // InternalNpl.g:816:1: rule__Declaration__Group_1__4 : rule__Declaration__Group_1__4__Impl rule__Declaration__Group_1__5 ;
    public final void rule__Declaration__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:820:1: ( rule__Declaration__Group_1__4__Impl rule__Declaration__Group_1__5 )
            // InternalNpl.g:821:2: rule__Declaration__Group_1__4__Impl rule__Declaration__Group_1__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalNpl.g:828:1: rule__Declaration__Group_1__4__Impl : ( ( rule__Declaration__FeedlinksAssignment_1_4 ) ) ;
    public final void rule__Declaration__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:832:1: ( ( ( rule__Declaration__FeedlinksAssignment_1_4 ) ) )
            // InternalNpl.g:833:1: ( ( rule__Declaration__FeedlinksAssignment_1_4 ) )
            {
            // InternalNpl.g:833:1: ( ( rule__Declaration__FeedlinksAssignment_1_4 ) )
            // InternalNpl.g:834:1: ( rule__Declaration__FeedlinksAssignment_1_4 )
            {
             before(grammarAccess.getDeclarationAccess().getFeedlinksAssignment_1_4()); 
            // InternalNpl.g:835:1: ( rule__Declaration__FeedlinksAssignment_1_4 )
            // InternalNpl.g:835:2: rule__Declaration__FeedlinksAssignment_1_4
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__FeedlinksAssignment_1_4();

            state._fsp--;


            }

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
    // InternalNpl.g:845:1: rule__Declaration__Group_1__5 : rule__Declaration__Group_1__5__Impl rule__Declaration__Group_1__6 ;
    public final void rule__Declaration__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:849:1: ( rule__Declaration__Group_1__5__Impl rule__Declaration__Group_1__6 )
            // InternalNpl.g:850:2: rule__Declaration__Group_1__5__Impl rule__Declaration__Group_1__6
            {
            pushFollow(FOLLOW_8);
            rule__Declaration__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group_1__6();

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
    // InternalNpl.g:857:1: rule__Declaration__Group_1__5__Impl : ( ( rule__Declaration__FeedlinksAssignment_1_5 )* ) ;
    public final void rule__Declaration__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:861:1: ( ( ( rule__Declaration__FeedlinksAssignment_1_5 )* ) )
            // InternalNpl.g:862:1: ( ( rule__Declaration__FeedlinksAssignment_1_5 )* )
            {
            // InternalNpl.g:862:1: ( ( rule__Declaration__FeedlinksAssignment_1_5 )* )
            // InternalNpl.g:863:1: ( rule__Declaration__FeedlinksAssignment_1_5 )*
            {
             before(grammarAccess.getDeclarationAccess().getFeedlinksAssignment_1_5()); 
            // InternalNpl.g:864:1: ( rule__Declaration__FeedlinksAssignment_1_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=14 && LA7_0<=15)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalNpl.g:864:2: rule__Declaration__FeedlinksAssignment_1_5
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Declaration__FeedlinksAssignment_1_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getDeclarationAccess().getFeedlinksAssignment_1_5()); 

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


    // $ANTLR start "rule__Declaration__Group_1__6"
    // InternalNpl.g:874:1: rule__Declaration__Group_1__6 : rule__Declaration__Group_1__6__Impl ;
    public final void rule__Declaration__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:878:1: ( rule__Declaration__Group_1__6__Impl )
            // InternalNpl.g:879:2: rule__Declaration__Group_1__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Group_1__6__Impl();

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
    // $ANTLR end "rule__Declaration__Group_1__6"


    // $ANTLR start "rule__Declaration__Group_1__6__Impl"
    // InternalNpl.g:885:1: rule__Declaration__Group_1__6__Impl : ( '}' ) ;
    public final void rule__Declaration__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:889:1: ( ( '}' ) )
            // InternalNpl.g:890:1: ( '}' )
            {
            // InternalNpl.g:890:1: ( '}' )
            // InternalNpl.g:891:1: '}'
            {
             before(grammarAccess.getDeclarationAccess().getRightCurlyBracketKeyword_1_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getRightCurlyBracketKeyword_1_6()); 

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
    // $ANTLR end "rule__Declaration__Group_1__6__Impl"


    // $ANTLR start "rule__Declaration__Group_2__0"
    // InternalNpl.g:918:1: rule__Declaration__Group_2__0 : rule__Declaration__Group_2__0__Impl rule__Declaration__Group_2__1 ;
    public final void rule__Declaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:922:1: ( rule__Declaration__Group_2__0__Impl rule__Declaration__Group_2__1 )
            // InternalNpl.g:923:2: rule__Declaration__Group_2__0__Impl rule__Declaration__Group_2__1
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
    // InternalNpl.g:930:1: rule__Declaration__Group_2__0__Impl : ( 'topics' ) ;
    public final void rule__Declaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:934:1: ( ( 'topics' ) )
            // InternalNpl.g:935:1: ( 'topics' )
            {
            // InternalNpl.g:935:1: ( 'topics' )
            // InternalNpl.g:936:1: 'topics'
            {
             before(grammarAccess.getDeclarationAccess().getTopicsKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalNpl.g:949:1: rule__Declaration__Group_2__1 : rule__Declaration__Group_2__1__Impl rule__Declaration__Group_2__2 ;
    public final void rule__Declaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:953:1: ( rule__Declaration__Group_2__1__Impl rule__Declaration__Group_2__2 )
            // InternalNpl.g:954:2: rule__Declaration__Group_2__1__Impl rule__Declaration__Group_2__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalNpl.g:961:1: rule__Declaration__Group_2__1__Impl : ( '{' ) ;
    public final void rule__Declaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:965:1: ( ( '{' ) )
            // InternalNpl.g:966:1: ( '{' )
            {
            // InternalNpl.g:966:1: ( '{' )
            // InternalNpl.g:967:1: '{'
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
    // InternalNpl.g:980:1: rule__Declaration__Group_2__2 : rule__Declaration__Group_2__2__Impl rule__Declaration__Group_2__3 ;
    public final void rule__Declaration__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:984:1: ( rule__Declaration__Group_2__2__Impl rule__Declaration__Group_2__3 )
            // InternalNpl.g:985:2: rule__Declaration__Group_2__2__Impl rule__Declaration__Group_2__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalNpl.g:992:1: rule__Declaration__Group_2__2__Impl : ( ( rule__Declaration__TopicsAssignment_2_2 ) ) ;
    public final void rule__Declaration__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:996:1: ( ( ( rule__Declaration__TopicsAssignment_2_2 ) ) )
            // InternalNpl.g:997:1: ( ( rule__Declaration__TopicsAssignment_2_2 ) )
            {
            // InternalNpl.g:997:1: ( ( rule__Declaration__TopicsAssignment_2_2 ) )
            // InternalNpl.g:998:1: ( rule__Declaration__TopicsAssignment_2_2 )
            {
             before(grammarAccess.getDeclarationAccess().getTopicsAssignment_2_2()); 
            // InternalNpl.g:999:1: ( rule__Declaration__TopicsAssignment_2_2 )
            // InternalNpl.g:999:2: rule__Declaration__TopicsAssignment_2_2
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
    // InternalNpl.g:1009:1: rule__Declaration__Group_2__3 : rule__Declaration__Group_2__3__Impl rule__Declaration__Group_2__4 ;
    public final void rule__Declaration__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1013:1: ( rule__Declaration__Group_2__3__Impl rule__Declaration__Group_2__4 )
            // InternalNpl.g:1014:2: rule__Declaration__Group_2__3__Impl rule__Declaration__Group_2__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalNpl.g:1021:1: rule__Declaration__Group_2__3__Impl : ( ( rule__Declaration__TopicsAssignment_2_3 )* ) ;
    public final void rule__Declaration__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1025:1: ( ( ( rule__Declaration__TopicsAssignment_2_3 )* ) )
            // InternalNpl.g:1026:1: ( ( rule__Declaration__TopicsAssignment_2_3 )* )
            {
            // InternalNpl.g:1026:1: ( ( rule__Declaration__TopicsAssignment_2_3 )* )
            // InternalNpl.g:1027:1: ( rule__Declaration__TopicsAssignment_2_3 )*
            {
             before(grammarAccess.getDeclarationAccess().getTopicsAssignment_2_3()); 
            // InternalNpl.g:1028:1: ( rule__Declaration__TopicsAssignment_2_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==35) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalNpl.g:1028:2: rule__Declaration__TopicsAssignment_2_3
            	    {
            	    pushFollow(FOLLOW_12);
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
    // InternalNpl.g:1038:1: rule__Declaration__Group_2__4 : rule__Declaration__Group_2__4__Impl ;
    public final void rule__Declaration__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1042:1: ( rule__Declaration__Group_2__4__Impl )
            // InternalNpl.g:1043:2: rule__Declaration__Group_2__4__Impl
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
    // InternalNpl.g:1049:1: rule__Declaration__Group_2__4__Impl : ( '}' ) ;
    public final void rule__Declaration__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1053:1: ( ( '}' ) )
            // InternalNpl.g:1054:1: ( '}' )
            {
            // InternalNpl.g:1054:1: ( '}' )
            // InternalNpl.g:1055:1: '}'
            {
             before(grammarAccess.getDeclarationAccess().getRightCurlyBracketKeyword_2_4()); 
            match(input,20,FOLLOW_2); 
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
    // InternalNpl.g:1078:1: rule__Declaration__Group_3__0 : rule__Declaration__Group_3__0__Impl rule__Declaration__Group_3__1 ;
    public final void rule__Declaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1082:1: ( rule__Declaration__Group_3__0__Impl rule__Declaration__Group_3__1 )
            // InternalNpl.g:1083:2: rule__Declaration__Group_3__0__Impl rule__Declaration__Group_3__1
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
    // InternalNpl.g:1090:1: rule__Declaration__Group_3__0__Impl : ( 'optional: date' ) ;
    public final void rule__Declaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1094:1: ( ( 'optional: date' ) )
            // InternalNpl.g:1095:1: ( 'optional: date' )
            {
            // InternalNpl.g:1095:1: ( 'optional: date' )
            // InternalNpl.g:1096:1: 'optional: date'
            {
             before(grammarAccess.getDeclarationAccess().getOptionalDateKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalNpl.g:1109:1: rule__Declaration__Group_3__1 : rule__Declaration__Group_3__1__Impl ;
    public final void rule__Declaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1113:1: ( rule__Declaration__Group_3__1__Impl )
            // InternalNpl.g:1114:2: rule__Declaration__Group_3__1__Impl
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
    // InternalNpl.g:1120:1: rule__Declaration__Group_3__1__Impl : ( ( rule__Declaration__DateAssignment_3_1 ) ) ;
    public final void rule__Declaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1124:1: ( ( ( rule__Declaration__DateAssignment_3_1 ) ) )
            // InternalNpl.g:1125:1: ( ( rule__Declaration__DateAssignment_3_1 ) )
            {
            // InternalNpl.g:1125:1: ( ( rule__Declaration__DateAssignment_3_1 ) )
            // InternalNpl.g:1126:1: ( rule__Declaration__DateAssignment_3_1 )
            {
             before(grammarAccess.getDeclarationAccess().getDateAssignment_3_1()); 
            // InternalNpl.g:1127:1: ( rule__Declaration__DateAssignment_3_1 )
            // InternalNpl.g:1127:2: rule__Declaration__DateAssignment_3_1
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
    // InternalNpl.g:1141:1: rule__Declaration__Group_4__0 : rule__Declaration__Group_4__0__Impl rule__Declaration__Group_4__1 ;
    public final void rule__Declaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1145:1: ( rule__Declaration__Group_4__0__Impl rule__Declaration__Group_4__1 )
            // InternalNpl.g:1146:2: rule__Declaration__Group_4__0__Impl rule__Declaration__Group_4__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalNpl.g:1153:1: rule__Declaration__Group_4__0__Impl : ( 'optional: location' ) ;
    public final void rule__Declaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1157:1: ( ( 'optional: location' ) )
            // InternalNpl.g:1158:1: ( 'optional: location' )
            {
            // InternalNpl.g:1158:1: ( 'optional: location' )
            // InternalNpl.g:1159:1: 'optional: location'
            {
             before(grammarAccess.getDeclarationAccess().getOptionalLocationKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalNpl.g:1172:1: rule__Declaration__Group_4__1 : rule__Declaration__Group_4__1__Impl ;
    public final void rule__Declaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1176:1: ( rule__Declaration__Group_4__1__Impl )
            // InternalNpl.g:1177:2: rule__Declaration__Group_4__1__Impl
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
    // InternalNpl.g:1183:1: rule__Declaration__Group_4__1__Impl : ( ( rule__Declaration__LocationAssignment_4_1 ) ) ;
    public final void rule__Declaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1187:1: ( ( ( rule__Declaration__LocationAssignment_4_1 ) ) )
            // InternalNpl.g:1188:1: ( ( rule__Declaration__LocationAssignment_4_1 ) )
            {
            // InternalNpl.g:1188:1: ( ( rule__Declaration__LocationAssignment_4_1 ) )
            // InternalNpl.g:1189:1: ( rule__Declaration__LocationAssignment_4_1 )
            {
             before(grammarAccess.getDeclarationAccess().getLocationAssignment_4_1()); 
            // InternalNpl.g:1190:1: ( rule__Declaration__LocationAssignment_4_1 )
            // InternalNpl.g:1190:2: rule__Declaration__LocationAssignment_4_1
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
    // InternalNpl.g:1204:1: rule__Declaration__Group_5__0 : rule__Declaration__Group_5__0__Impl rule__Declaration__Group_5__1 ;
    public final void rule__Declaration__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1208:1: ( rule__Declaration__Group_5__0__Impl rule__Declaration__Group_5__1 )
            // InternalNpl.g:1209:2: rule__Declaration__Group_5__0__Impl rule__Declaration__Group_5__1
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
    // InternalNpl.g:1216:1: rule__Declaration__Group_5__0__Impl : ( 'optional: price' ) ;
    public final void rule__Declaration__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1220:1: ( ( 'optional: price' ) )
            // InternalNpl.g:1221:1: ( 'optional: price' )
            {
            // InternalNpl.g:1221:1: ( 'optional: price' )
            // InternalNpl.g:1222:1: 'optional: price'
            {
             before(grammarAccess.getDeclarationAccess().getOptionalPriceKeyword_5_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalNpl.g:1235:1: rule__Declaration__Group_5__1 : rule__Declaration__Group_5__1__Impl ;
    public final void rule__Declaration__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1239:1: ( rule__Declaration__Group_5__1__Impl )
            // InternalNpl.g:1240:2: rule__Declaration__Group_5__1__Impl
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
    // InternalNpl.g:1246:1: rule__Declaration__Group_5__1__Impl : ( ( rule__Declaration__PriceAssignment_5_1 ) ) ;
    public final void rule__Declaration__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1250:1: ( ( ( rule__Declaration__PriceAssignment_5_1 ) ) )
            // InternalNpl.g:1251:1: ( ( rule__Declaration__PriceAssignment_5_1 ) )
            {
            // InternalNpl.g:1251:1: ( ( rule__Declaration__PriceAssignment_5_1 ) )
            // InternalNpl.g:1252:1: ( rule__Declaration__PriceAssignment_5_1 )
            {
             before(grammarAccess.getDeclarationAccess().getPriceAssignment_5_1()); 
            // InternalNpl.g:1253:1: ( rule__Declaration__PriceAssignment_5_1 )
            // InternalNpl.g:1253:2: rule__Declaration__PriceAssignment_5_1
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
    // InternalNpl.g:1267:1: rule__Declaration__Group_6__0 : rule__Declaration__Group_6__0__Impl rule__Declaration__Group_6__1 ;
    public final void rule__Declaration__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1271:1: ( rule__Declaration__Group_6__0__Impl rule__Declaration__Group_6__1 )
            // InternalNpl.g:1272:2: rule__Declaration__Group_6__0__Impl rule__Declaration__Group_6__1
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
    // InternalNpl.g:1279:1: rule__Declaration__Group_6__0__Impl : ( 'optional: volume' ) ;
    public final void rule__Declaration__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1283:1: ( ( 'optional: volume' ) )
            // InternalNpl.g:1284:1: ( 'optional: volume' )
            {
            // InternalNpl.g:1284:1: ( 'optional: volume' )
            // InternalNpl.g:1285:1: 'optional: volume'
            {
             before(grammarAccess.getDeclarationAccess().getOptionalVolumeKeyword_6_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalNpl.g:1298:1: rule__Declaration__Group_6__1 : rule__Declaration__Group_6__1__Impl rule__Declaration__Group_6__2 ;
    public final void rule__Declaration__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1302:1: ( rule__Declaration__Group_6__1__Impl rule__Declaration__Group_6__2 )
            // InternalNpl.g:1303:2: rule__Declaration__Group_6__1__Impl rule__Declaration__Group_6__2
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
    // InternalNpl.g:1310:1: rule__Declaration__Group_6__1__Impl : ( ( rule__Declaration__VolumeAssignment_6_1 ) ) ;
    public final void rule__Declaration__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1314:1: ( ( ( rule__Declaration__VolumeAssignment_6_1 ) ) )
            // InternalNpl.g:1315:1: ( ( rule__Declaration__VolumeAssignment_6_1 ) )
            {
            // InternalNpl.g:1315:1: ( ( rule__Declaration__VolumeAssignment_6_1 ) )
            // InternalNpl.g:1316:1: ( rule__Declaration__VolumeAssignment_6_1 )
            {
             before(grammarAccess.getDeclarationAccess().getVolumeAssignment_6_1()); 
            // InternalNpl.g:1317:1: ( rule__Declaration__VolumeAssignment_6_1 )
            // InternalNpl.g:1317:2: rule__Declaration__VolumeAssignment_6_1
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
    // InternalNpl.g:1327:1: rule__Declaration__Group_6__2 : rule__Declaration__Group_6__2__Impl ;
    public final void rule__Declaration__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1331:1: ( rule__Declaration__Group_6__2__Impl )
            // InternalNpl.g:1332:2: rule__Declaration__Group_6__2__Impl
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
    // InternalNpl.g:1338:1: rule__Declaration__Group_6__2__Impl : ( ( rule__Declaration__Group_6_2__0 )? ) ;
    public final void rule__Declaration__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1342:1: ( ( ( rule__Declaration__Group_6_2__0 )? ) )
            // InternalNpl.g:1343:1: ( ( rule__Declaration__Group_6_2__0 )? )
            {
            // InternalNpl.g:1343:1: ( ( rule__Declaration__Group_6_2__0 )? )
            // InternalNpl.g:1344:1: ( rule__Declaration__Group_6_2__0 )?
            {
             before(grammarAccess.getDeclarationAccess().getGroup_6_2()); 
            // InternalNpl.g:1345:1: ( rule__Declaration__Group_6_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalNpl.g:1345:2: rule__Declaration__Group_6_2__0
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
    // InternalNpl.g:1361:1: rule__Declaration__Group_6_2__0 : rule__Declaration__Group_6_2__0__Impl rule__Declaration__Group_6_2__1 ;
    public final void rule__Declaration__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1365:1: ( rule__Declaration__Group_6_2__0__Impl rule__Declaration__Group_6_2__1 )
            // InternalNpl.g:1366:2: rule__Declaration__Group_6_2__0__Impl rule__Declaration__Group_6_2__1
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
    // InternalNpl.g:1373:1: rule__Declaration__Group_6_2__0__Impl : ( 'no.' ) ;
    public final void rule__Declaration__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1377:1: ( ( 'no.' ) )
            // InternalNpl.g:1378:1: ( 'no.' )
            {
            // InternalNpl.g:1378:1: ( 'no.' )
            // InternalNpl.g:1379:1: 'no.'
            {
             before(grammarAccess.getDeclarationAccess().getNoKeyword_6_2_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalNpl.g:1392:1: rule__Declaration__Group_6_2__1 : rule__Declaration__Group_6_2__1__Impl ;
    public final void rule__Declaration__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1396:1: ( rule__Declaration__Group_6_2__1__Impl )
            // InternalNpl.g:1397:2: rule__Declaration__Group_6_2__1__Impl
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
    // InternalNpl.g:1403:1: rule__Declaration__Group_6_2__1__Impl : ( ( rule__Declaration__NumberAssignment_6_2_1 ) ) ;
    public final void rule__Declaration__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1407:1: ( ( ( rule__Declaration__NumberAssignment_6_2_1 ) ) )
            // InternalNpl.g:1408:1: ( ( rule__Declaration__NumberAssignment_6_2_1 ) )
            {
            // InternalNpl.g:1408:1: ( ( rule__Declaration__NumberAssignment_6_2_1 ) )
            // InternalNpl.g:1409:1: ( rule__Declaration__NumberAssignment_6_2_1 )
            {
             before(grammarAccess.getDeclarationAccess().getNumberAssignment_6_2_1()); 
            // InternalNpl.g:1410:1: ( rule__Declaration__NumberAssignment_6_2_1 )
            // InternalNpl.g:1410:2: rule__Declaration__NumberAssignment_6_2_1
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
    // InternalNpl.g:1424:1: rule__Declaration__Group_7__0 : rule__Declaration__Group_7__0__Impl rule__Declaration__Group_7__1 ;
    public final void rule__Declaration__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1428:1: ( rule__Declaration__Group_7__0__Impl rule__Declaration__Group_7__1 )
            // InternalNpl.g:1429:2: rule__Declaration__Group_7__0__Impl rule__Declaration__Group_7__1
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
    // InternalNpl.g:1436:1: rule__Declaration__Group_7__0__Impl : ( 'optional: language' ) ;
    public final void rule__Declaration__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1440:1: ( ( 'optional: language' ) )
            // InternalNpl.g:1441:1: ( 'optional: language' )
            {
            // InternalNpl.g:1441:1: ( 'optional: language' )
            // InternalNpl.g:1442:1: 'optional: language'
            {
             before(grammarAccess.getDeclarationAccess().getOptionalLanguageKeyword_7_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalNpl.g:1455:1: rule__Declaration__Group_7__1 : rule__Declaration__Group_7__1__Impl ;
    public final void rule__Declaration__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1459:1: ( rule__Declaration__Group_7__1__Impl )
            // InternalNpl.g:1460:2: rule__Declaration__Group_7__1__Impl
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
    // InternalNpl.g:1466:1: rule__Declaration__Group_7__1__Impl : ( ( rule__Declaration__LanguageAssignment_7_1 ) ) ;
    public final void rule__Declaration__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1470:1: ( ( ( rule__Declaration__LanguageAssignment_7_1 ) ) )
            // InternalNpl.g:1471:1: ( ( rule__Declaration__LanguageAssignment_7_1 ) )
            {
            // InternalNpl.g:1471:1: ( ( rule__Declaration__LanguageAssignment_7_1 ) )
            // InternalNpl.g:1472:1: ( rule__Declaration__LanguageAssignment_7_1 )
            {
             before(grammarAccess.getDeclarationAccess().getLanguageAssignment_7_1()); 
            // InternalNpl.g:1473:1: ( rule__Declaration__LanguageAssignment_7_1 )
            // InternalNpl.g:1473:2: rule__Declaration__LanguageAssignment_7_1
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
    // InternalNpl.g:1487:1: rule__Declaration__Group_8__0 : rule__Declaration__Group_8__0__Impl rule__Declaration__Group_8__1 ;
    public final void rule__Declaration__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1491:1: ( rule__Declaration__Group_8__0__Impl rule__Declaration__Group_8__1 )
            // InternalNpl.g:1492:2: rule__Declaration__Group_8__0__Impl rule__Declaration__Group_8__1
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
    // InternalNpl.g:1499:1: rule__Declaration__Group_8__0__Impl : ( 'format' ) ;
    public final void rule__Declaration__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1503:1: ( ( 'format' ) )
            // InternalNpl.g:1504:1: ( 'format' )
            {
            // InternalNpl.g:1504:1: ( 'format' )
            // InternalNpl.g:1505:1: 'format'
            {
             before(grammarAccess.getDeclarationAccess().getFormatKeyword_8_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalNpl.g:1518:1: rule__Declaration__Group_8__1 : rule__Declaration__Group_8__1__Impl ;
    public final void rule__Declaration__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1522:1: ( rule__Declaration__Group_8__1__Impl )
            // InternalNpl.g:1523:2: rule__Declaration__Group_8__1__Impl
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
    // InternalNpl.g:1529:1: rule__Declaration__Group_8__1__Impl : ( ( rule__Declaration__FormatAssignment_8_1 ) ) ;
    public final void rule__Declaration__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1533:1: ( ( ( rule__Declaration__FormatAssignment_8_1 ) ) )
            // InternalNpl.g:1534:1: ( ( rule__Declaration__FormatAssignment_8_1 ) )
            {
            // InternalNpl.g:1534:1: ( ( rule__Declaration__FormatAssignment_8_1 ) )
            // InternalNpl.g:1535:1: ( rule__Declaration__FormatAssignment_8_1 )
            {
             before(grammarAccess.getDeclarationAccess().getFormatAssignment_8_1()); 
            // InternalNpl.g:1536:1: ( rule__Declaration__FormatAssignment_8_1 )
            // InternalNpl.g:1536:2: rule__Declaration__FormatAssignment_8_1
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
    // InternalNpl.g:1550:1: rule__Declaration__Group_9__0 : rule__Declaration__Group_9__0__Impl rule__Declaration__Group_9__1 ;
    public final void rule__Declaration__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1554:1: ( rule__Declaration__Group_9__0__Impl rule__Declaration__Group_9__1 )
            // InternalNpl.g:1555:2: rule__Declaration__Group_9__0__Impl rule__Declaration__Group_9__1
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
    // InternalNpl.g:1562:1: rule__Declaration__Group_9__0__Impl : ( 'number of articles per topic' ) ;
    public final void rule__Declaration__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1566:1: ( ( 'number of articles per topic' ) )
            // InternalNpl.g:1567:1: ( 'number of articles per topic' )
            {
            // InternalNpl.g:1567:1: ( 'number of articles per topic' )
            // InternalNpl.g:1568:1: 'number of articles per topic'
            {
             before(grammarAccess.getDeclarationAccess().getNumberOfArticlesPerTopicKeyword_9_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalNpl.g:1581:1: rule__Declaration__Group_9__1 : rule__Declaration__Group_9__1__Impl ;
    public final void rule__Declaration__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1585:1: ( rule__Declaration__Group_9__1__Impl )
            // InternalNpl.g:1586:2: rule__Declaration__Group_9__1__Impl
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
    // InternalNpl.g:1592:1: rule__Declaration__Group_9__1__Impl : ( ( rule__Declaration__ArticleCntAssignment_9_1 ) ) ;
    public final void rule__Declaration__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1596:1: ( ( ( rule__Declaration__ArticleCntAssignment_9_1 ) ) )
            // InternalNpl.g:1597:1: ( ( rule__Declaration__ArticleCntAssignment_9_1 ) )
            {
            // InternalNpl.g:1597:1: ( ( rule__Declaration__ArticleCntAssignment_9_1 ) )
            // InternalNpl.g:1598:1: ( rule__Declaration__ArticleCntAssignment_9_1 )
            {
             before(grammarAccess.getDeclarationAccess().getArticleCntAssignment_9_1()); 
            // InternalNpl.g:1599:1: ( rule__Declaration__ArticleCntAssignment_9_1 )
            // InternalNpl.g:1599:2: rule__Declaration__ArticleCntAssignment_9_1
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
    // InternalNpl.g:1613:1: rule__Declaration__Group_10__0 : rule__Declaration__Group_10__0__Impl rule__Declaration__Group_10__1 ;
    public final void rule__Declaration__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1617:1: ( rule__Declaration__Group_10__0__Impl rule__Declaration__Group_10__1 )
            // InternalNpl.g:1618:2: rule__Declaration__Group_10__0__Impl rule__Declaration__Group_10__1
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
    // InternalNpl.g:1625:1: rule__Declaration__Group_10__0__Impl : ( 'number of words per article' ) ;
    public final void rule__Declaration__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1629:1: ( ( 'number of words per article' ) )
            // InternalNpl.g:1630:1: ( 'number of words per article' )
            {
            // InternalNpl.g:1630:1: ( 'number of words per article' )
            // InternalNpl.g:1631:1: 'number of words per article'
            {
             before(grammarAccess.getDeclarationAccess().getNumberOfWordsPerArticleKeyword_10_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalNpl.g:1644:1: rule__Declaration__Group_10__1 : rule__Declaration__Group_10__1__Impl rule__Declaration__Group_10__2 ;
    public final void rule__Declaration__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1648:1: ( rule__Declaration__Group_10__1__Impl rule__Declaration__Group_10__2 )
            // InternalNpl.g:1649:2: rule__Declaration__Group_10__1__Impl rule__Declaration__Group_10__2
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
    // InternalNpl.g:1656:1: rule__Declaration__Group_10__1__Impl : ( ( rule__Declaration__ArticleWordsMinAssignment_10_1 ) ) ;
    public final void rule__Declaration__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1660:1: ( ( ( rule__Declaration__ArticleWordsMinAssignment_10_1 ) ) )
            // InternalNpl.g:1661:1: ( ( rule__Declaration__ArticleWordsMinAssignment_10_1 ) )
            {
            // InternalNpl.g:1661:1: ( ( rule__Declaration__ArticleWordsMinAssignment_10_1 ) )
            // InternalNpl.g:1662:1: ( rule__Declaration__ArticleWordsMinAssignment_10_1 )
            {
             before(grammarAccess.getDeclarationAccess().getArticleWordsMinAssignment_10_1()); 
            // InternalNpl.g:1663:1: ( rule__Declaration__ArticleWordsMinAssignment_10_1 )
            // InternalNpl.g:1663:2: rule__Declaration__ArticleWordsMinAssignment_10_1
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
    // InternalNpl.g:1673:1: rule__Declaration__Group_10__2 : rule__Declaration__Group_10__2__Impl rule__Declaration__Group_10__3 ;
    public final void rule__Declaration__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1677:1: ( rule__Declaration__Group_10__2__Impl rule__Declaration__Group_10__3 )
            // InternalNpl.g:1678:2: rule__Declaration__Group_10__2__Impl rule__Declaration__Group_10__3
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
    // InternalNpl.g:1685:1: rule__Declaration__Group_10__2__Impl : ( '-' ) ;
    public final void rule__Declaration__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1689:1: ( ( '-' ) )
            // InternalNpl.g:1690:1: ( '-' )
            {
            // InternalNpl.g:1690:1: ( '-' )
            // InternalNpl.g:1691:1: '-'
            {
             before(grammarAccess.getDeclarationAccess().getHyphenMinusKeyword_10_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalNpl.g:1704:1: rule__Declaration__Group_10__3 : rule__Declaration__Group_10__3__Impl ;
    public final void rule__Declaration__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1708:1: ( rule__Declaration__Group_10__3__Impl )
            // InternalNpl.g:1709:2: rule__Declaration__Group_10__3__Impl
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
    // InternalNpl.g:1715:1: rule__Declaration__Group_10__3__Impl : ( ( rule__Declaration__ArticleWordsMaxAssignment_10_3 ) ) ;
    public final void rule__Declaration__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1719:1: ( ( ( rule__Declaration__ArticleWordsMaxAssignment_10_3 ) ) )
            // InternalNpl.g:1720:1: ( ( rule__Declaration__ArticleWordsMaxAssignment_10_3 ) )
            {
            // InternalNpl.g:1720:1: ( ( rule__Declaration__ArticleWordsMaxAssignment_10_3 ) )
            // InternalNpl.g:1721:1: ( rule__Declaration__ArticleWordsMaxAssignment_10_3 )
            {
             before(grammarAccess.getDeclarationAccess().getArticleWordsMaxAssignment_10_3()); 
            // InternalNpl.g:1722:1: ( rule__Declaration__ArticleWordsMaxAssignment_10_3 )
            // InternalNpl.g:1722:2: rule__Declaration__ArticleWordsMaxAssignment_10_3
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
    // InternalNpl.g:1740:1: rule__Declaration__Group_11__0 : rule__Declaration__Group_11__0__Impl rule__Declaration__Group_11__1 ;
    public final void rule__Declaration__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1744:1: ( rule__Declaration__Group_11__0__Impl rule__Declaration__Group_11__1 )
            // InternalNpl.g:1745:2: rule__Declaration__Group_11__0__Impl rule__Declaration__Group_11__1
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
    // InternalNpl.g:1752:1: rule__Declaration__Group_11__0__Impl : ( 'optional: number of images per article' ) ;
    public final void rule__Declaration__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1756:1: ( ( 'optional: number of images per article' ) )
            // InternalNpl.g:1757:1: ( 'optional: number of images per article' )
            {
            // InternalNpl.g:1757:1: ( 'optional: number of images per article' )
            // InternalNpl.g:1758:1: 'optional: number of images per article'
            {
             before(grammarAccess.getDeclarationAccess().getOptionalNumberOfImagesPerArticleKeyword_11_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalNpl.g:1771:1: rule__Declaration__Group_11__1 : rule__Declaration__Group_11__1__Impl ;
    public final void rule__Declaration__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1775:1: ( rule__Declaration__Group_11__1__Impl )
            // InternalNpl.g:1776:2: rule__Declaration__Group_11__1__Impl
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
    // InternalNpl.g:1782:1: rule__Declaration__Group_11__1__Impl : ( ( rule__Declaration__ImagesCntAssignment_11_1 ) ) ;
    public final void rule__Declaration__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1786:1: ( ( ( rule__Declaration__ImagesCntAssignment_11_1 ) ) )
            // InternalNpl.g:1787:1: ( ( rule__Declaration__ImagesCntAssignment_11_1 ) )
            {
            // InternalNpl.g:1787:1: ( ( rule__Declaration__ImagesCntAssignment_11_1 ) )
            // InternalNpl.g:1788:1: ( rule__Declaration__ImagesCntAssignment_11_1 )
            {
             before(grammarAccess.getDeclarationAccess().getImagesCntAssignment_11_1()); 
            // InternalNpl.g:1789:1: ( rule__Declaration__ImagesCntAssignment_11_1 )
            // InternalNpl.g:1789:2: rule__Declaration__ImagesCntAssignment_11_1
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
    // InternalNpl.g:1803:1: rule__Declaration__Group_12__0 : rule__Declaration__Group_12__0__Impl rule__Declaration__Group_12__1 ;
    public final void rule__Declaration__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1807:1: ( rule__Declaration__Group_12__0__Impl rule__Declaration__Group_12__1 )
            // InternalNpl.g:1808:2: rule__Declaration__Group_12__0__Impl rule__Declaration__Group_12__1
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
    // InternalNpl.g:1815:1: rule__Declaration__Group_12__0__Impl : ( 'number of columns' ) ;
    public final void rule__Declaration__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1819:1: ( ( 'number of columns' ) )
            // InternalNpl.g:1820:1: ( 'number of columns' )
            {
            // InternalNpl.g:1820:1: ( 'number of columns' )
            // InternalNpl.g:1821:1: 'number of columns'
            {
             before(grammarAccess.getDeclarationAccess().getNumberOfColumnsKeyword_12_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalNpl.g:1834:1: rule__Declaration__Group_12__1 : rule__Declaration__Group_12__1__Impl ;
    public final void rule__Declaration__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1838:1: ( rule__Declaration__Group_12__1__Impl )
            // InternalNpl.g:1839:2: rule__Declaration__Group_12__1__Impl
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
    // InternalNpl.g:1845:1: rule__Declaration__Group_12__1__Impl : ( ( rule__Declaration__ColumnsCntAssignment_12_1 ) ) ;
    public final void rule__Declaration__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1849:1: ( ( ( rule__Declaration__ColumnsCntAssignment_12_1 ) ) )
            // InternalNpl.g:1850:1: ( ( rule__Declaration__ColumnsCntAssignment_12_1 ) )
            {
            // InternalNpl.g:1850:1: ( ( rule__Declaration__ColumnsCntAssignment_12_1 ) )
            // InternalNpl.g:1851:1: ( rule__Declaration__ColumnsCntAssignment_12_1 )
            {
             before(grammarAccess.getDeclarationAccess().getColumnsCntAssignment_12_1()); 
            // InternalNpl.g:1852:1: ( rule__Declaration__ColumnsCntAssignment_12_1 )
            // InternalNpl.g:1852:2: rule__Declaration__ColumnsCntAssignment_12_1
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
    // InternalNpl.g:1866:1: rule__Declaration__Group_13__0 : rule__Declaration__Group_13__0__Impl rule__Declaration__Group_13__1 ;
    public final void rule__Declaration__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1870:1: ( rule__Declaration__Group_13__0__Impl rule__Declaration__Group_13__1 )
            // InternalNpl.g:1871:2: rule__Declaration__Group_13__0__Impl rule__Declaration__Group_13__1
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
    // InternalNpl.g:1878:1: rule__Declaration__Group_13__0__Impl : ( 'font size' ) ;
    public final void rule__Declaration__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1882:1: ( ( 'font size' ) )
            // InternalNpl.g:1883:1: ( 'font size' )
            {
            // InternalNpl.g:1883:1: ( 'font size' )
            // InternalNpl.g:1884:1: 'font size'
            {
             before(grammarAccess.getDeclarationAccess().getFontSizeKeyword_13_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalNpl.g:1897:1: rule__Declaration__Group_13__1 : rule__Declaration__Group_13__1__Impl ;
    public final void rule__Declaration__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1901:1: ( rule__Declaration__Group_13__1__Impl )
            // InternalNpl.g:1902:2: rule__Declaration__Group_13__1__Impl
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
    // InternalNpl.g:1908:1: rule__Declaration__Group_13__1__Impl : ( ( rule__Declaration__FontSizeAssignment_13_1 ) ) ;
    public final void rule__Declaration__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1912:1: ( ( ( rule__Declaration__FontSizeAssignment_13_1 ) ) )
            // InternalNpl.g:1913:1: ( ( rule__Declaration__FontSizeAssignment_13_1 ) )
            {
            // InternalNpl.g:1913:1: ( ( rule__Declaration__FontSizeAssignment_13_1 ) )
            // InternalNpl.g:1914:1: ( rule__Declaration__FontSizeAssignment_13_1 )
            {
             before(grammarAccess.getDeclarationAccess().getFontSizeAssignment_13_1()); 
            // InternalNpl.g:1915:1: ( rule__Declaration__FontSizeAssignment_13_1 )
            // InternalNpl.g:1915:2: rule__Declaration__FontSizeAssignment_13_1
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
    // InternalNpl.g:1929:1: rule__Date__Group__0 : rule__Date__Group__0__Impl rule__Date__Group__1 ;
    public final void rule__Date__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1933:1: ( rule__Date__Group__0__Impl rule__Date__Group__1 )
            // InternalNpl.g:1934:2: rule__Date__Group__0__Impl rule__Date__Group__1
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
    // InternalNpl.g:1941:1: rule__Date__Group__0__Impl : ( '{' ) ;
    public final void rule__Date__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1945:1: ( ( '{' ) )
            // InternalNpl.g:1946:1: ( '{' )
            {
            // InternalNpl.g:1946:1: ( '{' )
            // InternalNpl.g:1947:1: '{'
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
    // InternalNpl.g:1960:1: rule__Date__Group__1 : rule__Date__Group__1__Impl rule__Date__Group__2 ;
    public final void rule__Date__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1964:1: ( rule__Date__Group__1__Impl rule__Date__Group__2 )
            // InternalNpl.g:1965:2: rule__Date__Group__1__Impl rule__Date__Group__2
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
    // InternalNpl.g:1972:1: rule__Date__Group__1__Impl : ( ( rule__Date__DayAssignment_1 ) ) ;
    public final void rule__Date__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1976:1: ( ( ( rule__Date__DayAssignment_1 ) ) )
            // InternalNpl.g:1977:1: ( ( rule__Date__DayAssignment_1 ) )
            {
            // InternalNpl.g:1977:1: ( ( rule__Date__DayAssignment_1 ) )
            // InternalNpl.g:1978:1: ( rule__Date__DayAssignment_1 )
            {
             before(grammarAccess.getDateAccess().getDayAssignment_1()); 
            // InternalNpl.g:1979:1: ( rule__Date__DayAssignment_1 )
            // InternalNpl.g:1979:2: rule__Date__DayAssignment_1
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
    // InternalNpl.g:1989:1: rule__Date__Group__2 : rule__Date__Group__2__Impl rule__Date__Group__3 ;
    public final void rule__Date__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1993:1: ( rule__Date__Group__2__Impl rule__Date__Group__3 )
            // InternalNpl.g:1994:2: rule__Date__Group__2__Impl rule__Date__Group__3
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
    // InternalNpl.g:2001:1: rule__Date__Group__2__Impl : ( '-' ) ;
    public final void rule__Date__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2005:1: ( ( '-' ) )
            // InternalNpl.g:2006:1: ( '-' )
            {
            // InternalNpl.g:2006:1: ( '-' )
            // InternalNpl.g:2007:1: '-'
            {
             before(grammarAccess.getDateAccess().getHyphenMinusKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalNpl.g:2020:1: rule__Date__Group__3 : rule__Date__Group__3__Impl rule__Date__Group__4 ;
    public final void rule__Date__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2024:1: ( rule__Date__Group__3__Impl rule__Date__Group__4 )
            // InternalNpl.g:2025:2: rule__Date__Group__3__Impl rule__Date__Group__4
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
    // InternalNpl.g:2032:1: rule__Date__Group__3__Impl : ( ( rule__Date__MonthAssignment_3 ) ) ;
    public final void rule__Date__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2036:1: ( ( ( rule__Date__MonthAssignment_3 ) ) )
            // InternalNpl.g:2037:1: ( ( rule__Date__MonthAssignment_3 ) )
            {
            // InternalNpl.g:2037:1: ( ( rule__Date__MonthAssignment_3 ) )
            // InternalNpl.g:2038:1: ( rule__Date__MonthAssignment_3 )
            {
             before(grammarAccess.getDateAccess().getMonthAssignment_3()); 
            // InternalNpl.g:2039:1: ( rule__Date__MonthAssignment_3 )
            // InternalNpl.g:2039:2: rule__Date__MonthAssignment_3
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
    // InternalNpl.g:2049:1: rule__Date__Group__4 : rule__Date__Group__4__Impl rule__Date__Group__5 ;
    public final void rule__Date__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2053:1: ( rule__Date__Group__4__Impl rule__Date__Group__5 )
            // InternalNpl.g:2054:2: rule__Date__Group__4__Impl rule__Date__Group__5
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
    // InternalNpl.g:2061:1: rule__Date__Group__4__Impl : ( '-' ) ;
    public final void rule__Date__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2065:1: ( ( '-' ) )
            // InternalNpl.g:2066:1: ( '-' )
            {
            // InternalNpl.g:2066:1: ( '-' )
            // InternalNpl.g:2067:1: '-'
            {
             before(grammarAccess.getDateAccess().getHyphenMinusKeyword_4()); 
            match(input,31,FOLLOW_2); 
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
    // InternalNpl.g:2080:1: rule__Date__Group__5 : rule__Date__Group__5__Impl rule__Date__Group__6 ;
    public final void rule__Date__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2084:1: ( rule__Date__Group__5__Impl rule__Date__Group__6 )
            // InternalNpl.g:2085:2: rule__Date__Group__5__Impl rule__Date__Group__6
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
    // InternalNpl.g:2092:1: rule__Date__Group__5__Impl : ( ( rule__Date__YearAssignment_5 ) ) ;
    public final void rule__Date__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2096:1: ( ( ( rule__Date__YearAssignment_5 ) ) )
            // InternalNpl.g:2097:1: ( ( rule__Date__YearAssignment_5 ) )
            {
            // InternalNpl.g:2097:1: ( ( rule__Date__YearAssignment_5 ) )
            // InternalNpl.g:2098:1: ( rule__Date__YearAssignment_5 )
            {
             before(grammarAccess.getDateAccess().getYearAssignment_5()); 
            // InternalNpl.g:2099:1: ( rule__Date__YearAssignment_5 )
            // InternalNpl.g:2099:2: rule__Date__YearAssignment_5
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
    // InternalNpl.g:2109:1: rule__Date__Group__6 : rule__Date__Group__6__Impl ;
    public final void rule__Date__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2113:1: ( rule__Date__Group__6__Impl )
            // InternalNpl.g:2114:2: rule__Date__Group__6__Impl
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
    // InternalNpl.g:2120:1: rule__Date__Group__6__Impl : ( '}' ) ;
    public final void rule__Date__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2124:1: ( ( '}' ) )
            // InternalNpl.g:2125:1: ( '}' )
            {
            // InternalNpl.g:2125:1: ( '}' )
            // InternalNpl.g:2126:1: '}'
            {
             before(grammarAccess.getDateAccess().getRightCurlyBracketKeyword_6()); 
            match(input,20,FOLLOW_2); 
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
    // InternalNpl.g:2153:1: rule__Price__Group__0 : rule__Price__Group__0__Impl rule__Price__Group__1 ;
    public final void rule__Price__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2157:1: ( rule__Price__Group__0__Impl rule__Price__Group__1 )
            // InternalNpl.g:2158:2: rule__Price__Group__0__Impl rule__Price__Group__1
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
    // InternalNpl.g:2165:1: rule__Price__Group__0__Impl : ( '{' ) ;
    public final void rule__Price__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2169:1: ( ( '{' ) )
            // InternalNpl.g:2170:1: ( '{' )
            {
            // InternalNpl.g:2170:1: ( '{' )
            // InternalNpl.g:2171:1: '{'
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
    // InternalNpl.g:2184:1: rule__Price__Group__1 : rule__Price__Group__1__Impl rule__Price__Group__2 ;
    public final void rule__Price__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2188:1: ( rule__Price__Group__1__Impl rule__Price__Group__2 )
            // InternalNpl.g:2189:2: rule__Price__Group__1__Impl rule__Price__Group__2
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
    // InternalNpl.g:2196:1: rule__Price__Group__1__Impl : ( ( rule__Price__ValueAssignment_1 ) ) ;
    public final void rule__Price__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2200:1: ( ( ( rule__Price__ValueAssignment_1 ) ) )
            // InternalNpl.g:2201:1: ( ( rule__Price__ValueAssignment_1 ) )
            {
            // InternalNpl.g:2201:1: ( ( rule__Price__ValueAssignment_1 ) )
            // InternalNpl.g:2202:1: ( rule__Price__ValueAssignment_1 )
            {
             before(grammarAccess.getPriceAccess().getValueAssignment_1()); 
            // InternalNpl.g:2203:1: ( rule__Price__ValueAssignment_1 )
            // InternalNpl.g:2203:2: rule__Price__ValueAssignment_1
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
    // InternalNpl.g:2213:1: rule__Price__Group__2 : rule__Price__Group__2__Impl rule__Price__Group__3 ;
    public final void rule__Price__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2217:1: ( rule__Price__Group__2__Impl rule__Price__Group__3 )
            // InternalNpl.g:2218:2: rule__Price__Group__2__Impl rule__Price__Group__3
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
    // InternalNpl.g:2225:1: rule__Price__Group__2__Impl : ( ( rule__Price__CurrencyAssignment_2 ) ) ;
    public final void rule__Price__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2229:1: ( ( ( rule__Price__CurrencyAssignment_2 ) ) )
            // InternalNpl.g:2230:1: ( ( rule__Price__CurrencyAssignment_2 ) )
            {
            // InternalNpl.g:2230:1: ( ( rule__Price__CurrencyAssignment_2 ) )
            // InternalNpl.g:2231:1: ( rule__Price__CurrencyAssignment_2 )
            {
             before(grammarAccess.getPriceAccess().getCurrencyAssignment_2()); 
            // InternalNpl.g:2232:1: ( rule__Price__CurrencyAssignment_2 )
            // InternalNpl.g:2232:2: rule__Price__CurrencyAssignment_2
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
    // InternalNpl.g:2242:1: rule__Price__Group__3 : rule__Price__Group__3__Impl ;
    public final void rule__Price__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2246:1: ( rule__Price__Group__3__Impl )
            // InternalNpl.g:2247:2: rule__Price__Group__3__Impl
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
    // InternalNpl.g:2253:1: rule__Price__Group__3__Impl : ( '}' ) ;
    public final void rule__Price__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2257:1: ( ( '}' ) )
            // InternalNpl.g:2258:1: ( '}' )
            {
            // InternalNpl.g:2258:1: ( '}' )
            // InternalNpl.g:2259:1: '}'
            {
             before(grammarAccess.getPriceAccess().getRightCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_2); 
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
    // InternalNpl.g:2280:1: rule__Topic__Group__0 : rule__Topic__Group__0__Impl rule__Topic__Group__1 ;
    public final void rule__Topic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2284:1: ( rule__Topic__Group__0__Impl rule__Topic__Group__1 )
            // InternalNpl.g:2285:2: rule__Topic__Group__0__Impl rule__Topic__Group__1
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
    // InternalNpl.g:2292:1: rule__Topic__Group__0__Impl : ( 'topic' ) ;
    public final void rule__Topic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2296:1: ( ( 'topic' ) )
            // InternalNpl.g:2297:1: ( 'topic' )
            {
            // InternalNpl.g:2297:1: ( 'topic' )
            // InternalNpl.g:2298:1: 'topic'
            {
             before(grammarAccess.getTopicAccess().getTopicKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalNpl.g:2311:1: rule__Topic__Group__1 : rule__Topic__Group__1__Impl rule__Topic__Group__2 ;
    public final void rule__Topic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2315:1: ( rule__Topic__Group__1__Impl rule__Topic__Group__2 )
            // InternalNpl.g:2316:2: rule__Topic__Group__1__Impl rule__Topic__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalNpl.g:2323:1: rule__Topic__Group__1__Impl : ( ( rule__Topic__NameAssignment_1 ) ) ;
    public final void rule__Topic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2327:1: ( ( ( rule__Topic__NameAssignment_1 ) ) )
            // InternalNpl.g:2328:1: ( ( rule__Topic__NameAssignment_1 ) )
            {
            // InternalNpl.g:2328:1: ( ( rule__Topic__NameAssignment_1 ) )
            // InternalNpl.g:2329:1: ( rule__Topic__NameAssignment_1 )
            {
             before(grammarAccess.getTopicAccess().getNameAssignment_1()); 
            // InternalNpl.g:2330:1: ( rule__Topic__NameAssignment_1 )
            // InternalNpl.g:2330:2: rule__Topic__NameAssignment_1
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
    // InternalNpl.g:2340:1: rule__Topic__Group__2 : rule__Topic__Group__2__Impl rule__Topic__Group__3 ;
    public final void rule__Topic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2344:1: ( rule__Topic__Group__2__Impl rule__Topic__Group__3 )
            // InternalNpl.g:2345:2: rule__Topic__Group__2__Impl rule__Topic__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalNpl.g:2352:1: rule__Topic__Group__2__Impl : ( 'as' ) ;
    public final void rule__Topic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2356:1: ( ( 'as' ) )
            // InternalNpl.g:2357:1: ( 'as' )
            {
            // InternalNpl.g:2357:1: ( 'as' )
            // InternalNpl.g:2358:1: 'as'
            {
             before(grammarAccess.getTopicAccess().getAsKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTopicAccess().getAsKeyword_2()); 

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
    // InternalNpl.g:2371:1: rule__Topic__Group__3 : rule__Topic__Group__3__Impl rule__Topic__Group__4 ;
    public final void rule__Topic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2375:1: ( rule__Topic__Group__3__Impl rule__Topic__Group__4 )
            // InternalNpl.g:2376:2: rule__Topic__Group__3__Impl rule__Topic__Group__4
            {
            pushFollow(FOLLOW_4);
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
    // InternalNpl.g:2383:1: rule__Topic__Group__3__Impl : ( ( rule__Topic__TitleAssignment_3 ) ) ;
    public final void rule__Topic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2387:1: ( ( ( rule__Topic__TitleAssignment_3 ) ) )
            // InternalNpl.g:2388:1: ( ( rule__Topic__TitleAssignment_3 ) )
            {
            // InternalNpl.g:2388:1: ( ( rule__Topic__TitleAssignment_3 ) )
            // InternalNpl.g:2389:1: ( rule__Topic__TitleAssignment_3 )
            {
             before(grammarAccess.getTopicAccess().getTitleAssignment_3()); 
            // InternalNpl.g:2390:1: ( rule__Topic__TitleAssignment_3 )
            // InternalNpl.g:2390:2: rule__Topic__TitleAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Topic__TitleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTopicAccess().getTitleAssignment_3()); 

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
    // InternalNpl.g:2400:1: rule__Topic__Group__4 : rule__Topic__Group__4__Impl rule__Topic__Group__5 ;
    public final void rule__Topic__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2404:1: ( rule__Topic__Group__4__Impl rule__Topic__Group__5 )
            // InternalNpl.g:2405:2: rule__Topic__Group__4__Impl rule__Topic__Group__5
            {
            pushFollow(FOLLOW_5);
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
    // InternalNpl.g:2412:1: rule__Topic__Group__4__Impl : ( '{' ) ;
    public final void rule__Topic__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2416:1: ( ( '{' ) )
            // InternalNpl.g:2417:1: ( '{' )
            {
            // InternalNpl.g:2417:1: ( '{' )
            // InternalNpl.g:2418:1: '{'
            {
             before(grammarAccess.getTopicAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTopicAccess().getLeftCurlyBracketKeyword_4()); 

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
    // InternalNpl.g:2431:1: rule__Topic__Group__5 : rule__Topic__Group__5__Impl rule__Topic__Group__6 ;
    public final void rule__Topic__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2435:1: ( rule__Topic__Group__5__Impl rule__Topic__Group__6 )
            // InternalNpl.g:2436:2: rule__Topic__Group__5__Impl rule__Topic__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__Topic__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Topic__Group__6();

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
    // InternalNpl.g:2443:1: rule__Topic__Group__5__Impl : ( ( rule__Topic__TagsAssignment_5 ) ) ;
    public final void rule__Topic__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2447:1: ( ( ( rule__Topic__TagsAssignment_5 ) ) )
            // InternalNpl.g:2448:1: ( ( rule__Topic__TagsAssignment_5 ) )
            {
            // InternalNpl.g:2448:1: ( ( rule__Topic__TagsAssignment_5 ) )
            // InternalNpl.g:2449:1: ( rule__Topic__TagsAssignment_5 )
            {
             before(grammarAccess.getTopicAccess().getTagsAssignment_5()); 
            // InternalNpl.g:2450:1: ( rule__Topic__TagsAssignment_5 )
            // InternalNpl.g:2450:2: rule__Topic__TagsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Topic__TagsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTopicAccess().getTagsAssignment_5()); 

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


    // $ANTLR start "rule__Topic__Group__6"
    // InternalNpl.g:2460:1: rule__Topic__Group__6 : rule__Topic__Group__6__Impl rule__Topic__Group__7 ;
    public final void rule__Topic__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2464:1: ( rule__Topic__Group__6__Impl rule__Topic__Group__7 )
            // InternalNpl.g:2465:2: rule__Topic__Group__6__Impl rule__Topic__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__Topic__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Topic__Group__7();

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
    // $ANTLR end "rule__Topic__Group__6"


    // $ANTLR start "rule__Topic__Group__6__Impl"
    // InternalNpl.g:2472:1: rule__Topic__Group__6__Impl : ( ( rule__Topic__Group_6__0 )* ) ;
    public final void rule__Topic__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2476:1: ( ( ( rule__Topic__Group_6__0 )* ) )
            // InternalNpl.g:2477:1: ( ( rule__Topic__Group_6__0 )* )
            {
            // InternalNpl.g:2477:1: ( ( rule__Topic__Group_6__0 )* )
            // InternalNpl.g:2478:1: ( rule__Topic__Group_6__0 )*
            {
             before(grammarAccess.getTopicAccess().getGroup_6()); 
            // InternalNpl.g:2479:1: ( rule__Topic__Group_6__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==37) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalNpl.g:2479:2: rule__Topic__Group_6__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Topic__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getTopicAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Topic__Group__6__Impl"


    // $ANTLR start "rule__Topic__Group__7"
    // InternalNpl.g:2489:1: rule__Topic__Group__7 : rule__Topic__Group__7__Impl ;
    public final void rule__Topic__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2493:1: ( rule__Topic__Group__7__Impl )
            // InternalNpl.g:2494:2: rule__Topic__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Topic__Group__7__Impl();

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
    // $ANTLR end "rule__Topic__Group__7"


    // $ANTLR start "rule__Topic__Group__7__Impl"
    // InternalNpl.g:2500:1: rule__Topic__Group__7__Impl : ( '}' ) ;
    public final void rule__Topic__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2504:1: ( ( '}' ) )
            // InternalNpl.g:2505:1: ( '}' )
            {
            // InternalNpl.g:2505:1: ( '}' )
            // InternalNpl.g:2506:1: '}'
            {
             before(grammarAccess.getTopicAccess().getRightCurlyBracketKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTopicAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Topic__Group__7__Impl"


    // $ANTLR start "rule__Topic__Group_6__0"
    // InternalNpl.g:2535:1: rule__Topic__Group_6__0 : rule__Topic__Group_6__0__Impl rule__Topic__Group_6__1 ;
    public final void rule__Topic__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2539:1: ( rule__Topic__Group_6__0__Impl rule__Topic__Group_6__1 )
            // InternalNpl.g:2540:2: rule__Topic__Group_6__0__Impl rule__Topic__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__Topic__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Topic__Group_6__1();

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
    // $ANTLR end "rule__Topic__Group_6__0"


    // $ANTLR start "rule__Topic__Group_6__0__Impl"
    // InternalNpl.g:2547:1: rule__Topic__Group_6__0__Impl : ( ', ' ) ;
    public final void rule__Topic__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2551:1: ( ( ', ' ) )
            // InternalNpl.g:2552:1: ( ', ' )
            {
            // InternalNpl.g:2552:1: ( ', ' )
            // InternalNpl.g:2553:1: ', '
            {
             before(grammarAccess.getTopicAccess().getCommaSpaceKeyword_6_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTopicAccess().getCommaSpaceKeyword_6_0()); 

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
    // $ANTLR end "rule__Topic__Group_6__0__Impl"


    // $ANTLR start "rule__Topic__Group_6__1"
    // InternalNpl.g:2566:1: rule__Topic__Group_6__1 : rule__Topic__Group_6__1__Impl ;
    public final void rule__Topic__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2570:1: ( rule__Topic__Group_6__1__Impl )
            // InternalNpl.g:2571:2: rule__Topic__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Topic__Group_6__1__Impl();

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
    // $ANTLR end "rule__Topic__Group_6__1"


    // $ANTLR start "rule__Topic__Group_6__1__Impl"
    // InternalNpl.g:2577:1: rule__Topic__Group_6__1__Impl : ( ( rule__Topic__TagsAssignment_6_1 ) ) ;
    public final void rule__Topic__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2581:1: ( ( ( rule__Topic__TagsAssignment_6_1 ) ) )
            // InternalNpl.g:2582:1: ( ( rule__Topic__TagsAssignment_6_1 ) )
            {
            // InternalNpl.g:2582:1: ( ( rule__Topic__TagsAssignment_6_1 ) )
            // InternalNpl.g:2583:1: ( rule__Topic__TagsAssignment_6_1 )
            {
             before(grammarAccess.getTopicAccess().getTagsAssignment_6_1()); 
            // InternalNpl.g:2584:1: ( rule__Topic__TagsAssignment_6_1 )
            // InternalNpl.g:2584:2: rule__Topic__TagsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Topic__TagsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getTopicAccess().getTagsAssignment_6_1()); 

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
    // $ANTLR end "rule__Topic__Group_6__1__Impl"


    // $ANTLR start "rule__Pair__Group__0"
    // InternalNpl.g:2598:1: rule__Pair__Group__0 : rule__Pair__Group__0__Impl rule__Pair__Group__1 ;
    public final void rule__Pair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2602:1: ( rule__Pair__Group__0__Impl rule__Pair__Group__1 )
            // InternalNpl.g:2603:2: rule__Pair__Group__0__Impl rule__Pair__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalNpl.g:2610:1: rule__Pair__Group__0__Impl : ( ( rule__Pair__TypeAssignment_0 ) ) ;
    public final void rule__Pair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2614:1: ( ( ( rule__Pair__TypeAssignment_0 ) ) )
            // InternalNpl.g:2615:1: ( ( rule__Pair__TypeAssignment_0 ) )
            {
            // InternalNpl.g:2615:1: ( ( rule__Pair__TypeAssignment_0 ) )
            // InternalNpl.g:2616:1: ( rule__Pair__TypeAssignment_0 )
            {
             before(grammarAccess.getPairAccess().getTypeAssignment_0()); 
            // InternalNpl.g:2617:1: ( rule__Pair__TypeAssignment_0 )
            // InternalNpl.g:2617:2: rule__Pair__TypeAssignment_0
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
    // InternalNpl.g:2627:1: rule__Pair__Group__1 : rule__Pair__Group__1__Impl rule__Pair__Group__2 ;
    public final void rule__Pair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2631:1: ( rule__Pair__Group__1__Impl rule__Pair__Group__2 )
            // InternalNpl.g:2632:2: rule__Pair__Group__1__Impl rule__Pair__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalNpl.g:2639:1: rule__Pair__Group__1__Impl : ( ( rule__Pair__KeyAssignment_1 ) ) ;
    public final void rule__Pair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2643:1: ( ( ( rule__Pair__KeyAssignment_1 ) ) )
            // InternalNpl.g:2644:1: ( ( rule__Pair__KeyAssignment_1 ) )
            {
            // InternalNpl.g:2644:1: ( ( rule__Pair__KeyAssignment_1 ) )
            // InternalNpl.g:2645:1: ( rule__Pair__KeyAssignment_1 )
            {
             before(grammarAccess.getPairAccess().getKeyAssignment_1()); 
            // InternalNpl.g:2646:1: ( rule__Pair__KeyAssignment_1 )
            // InternalNpl.g:2646:2: rule__Pair__KeyAssignment_1
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
    // InternalNpl.g:2656:1: rule__Pair__Group__2 : rule__Pair__Group__2__Impl rule__Pair__Group__3 ;
    public final void rule__Pair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2660:1: ( rule__Pair__Group__2__Impl rule__Pair__Group__3 )
            // InternalNpl.g:2661:2: rule__Pair__Group__2__Impl rule__Pair__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalNpl.g:2668:1: rule__Pair__Group__2__Impl : ( '<' ) ;
    public final void rule__Pair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2672:1: ( ( '<' ) )
            // InternalNpl.g:2673:1: ( '<' )
            {
            // InternalNpl.g:2673:1: ( '<' )
            // InternalNpl.g:2674:1: '<'
            {
             before(grammarAccess.getPairAccess().getLessThanSignKeyword_2()); 
            match(input,38,FOLLOW_2); 
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
    // InternalNpl.g:2687:1: rule__Pair__Group__3 : rule__Pair__Group__3__Impl rule__Pair__Group__4 ;
    public final void rule__Pair__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2691:1: ( rule__Pair__Group__3__Impl rule__Pair__Group__4 )
            // InternalNpl.g:2692:2: rule__Pair__Group__3__Impl rule__Pair__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalNpl.g:2699:1: rule__Pair__Group__3__Impl : ( ( rule__Pair__ValueAssignment_3 ) ) ;
    public final void rule__Pair__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2703:1: ( ( ( rule__Pair__ValueAssignment_3 ) ) )
            // InternalNpl.g:2704:1: ( ( rule__Pair__ValueAssignment_3 ) )
            {
            // InternalNpl.g:2704:1: ( ( rule__Pair__ValueAssignment_3 ) )
            // InternalNpl.g:2705:1: ( rule__Pair__ValueAssignment_3 )
            {
             before(grammarAccess.getPairAccess().getValueAssignment_3()); 
            // InternalNpl.g:2706:1: ( rule__Pair__ValueAssignment_3 )
            // InternalNpl.g:2706:2: rule__Pair__ValueAssignment_3
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
    // InternalNpl.g:2716:1: rule__Pair__Group__4 : rule__Pair__Group__4__Impl ;
    public final void rule__Pair__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2720:1: ( rule__Pair__Group__4__Impl )
            // InternalNpl.g:2721:2: rule__Pair__Group__4__Impl
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
    // InternalNpl.g:2727:1: rule__Pair__Group__4__Impl : ( '>' ) ;
    public final void rule__Pair__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2731:1: ( ( '>' ) )
            // InternalNpl.g:2732:1: ( '>' )
            {
            // InternalNpl.g:2732:1: ( '>' )
            // InternalNpl.g:2733:1: '>'
            {
             before(grammarAccess.getPairAccess().getGreaterThanSignKeyword_4()); 
            match(input,39,FOLLOW_2); 
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
    // InternalNpl.g:2756:1: rule__Float__Group__0 : rule__Float__Group__0__Impl rule__Float__Group__1 ;
    public final void rule__Float__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2760:1: ( rule__Float__Group__0__Impl rule__Float__Group__1 )
            // InternalNpl.g:2761:2: rule__Float__Group__0__Impl rule__Float__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalNpl.g:2768:1: rule__Float__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Float__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2772:1: ( ( RULE_INT ) )
            // InternalNpl.g:2773:1: ( RULE_INT )
            {
            // InternalNpl.g:2773:1: ( RULE_INT )
            // InternalNpl.g:2774:1: RULE_INT
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
    // InternalNpl.g:2785:1: rule__Float__Group__1 : rule__Float__Group__1__Impl ;
    public final void rule__Float__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2789:1: ( rule__Float__Group__1__Impl )
            // InternalNpl.g:2790:2: rule__Float__Group__1__Impl
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
    // InternalNpl.g:2796:1: rule__Float__Group__1__Impl : ( ( rule__Float__Group_1__0 )? ) ;
    public final void rule__Float__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2800:1: ( ( ( rule__Float__Group_1__0 )? ) )
            // InternalNpl.g:2801:1: ( ( rule__Float__Group_1__0 )? )
            {
            // InternalNpl.g:2801:1: ( ( rule__Float__Group_1__0 )? )
            // InternalNpl.g:2802:1: ( rule__Float__Group_1__0 )?
            {
             before(grammarAccess.getFloatAccess().getGroup_1()); 
            // InternalNpl.g:2803:1: ( rule__Float__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=12 && LA11_0<=13)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalNpl.g:2803:2: rule__Float__Group_1__0
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
    // InternalNpl.g:2817:1: rule__Float__Group_1__0 : rule__Float__Group_1__0__Impl rule__Float__Group_1__1 ;
    public final void rule__Float__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2821:1: ( rule__Float__Group_1__0__Impl rule__Float__Group_1__1 )
            // InternalNpl.g:2822:2: rule__Float__Group_1__0__Impl rule__Float__Group_1__1
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
    // InternalNpl.g:2829:1: rule__Float__Group_1__0__Impl : ( ( rule__Float__Alternatives_1_0 ) ) ;
    public final void rule__Float__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2833:1: ( ( ( rule__Float__Alternatives_1_0 ) ) )
            // InternalNpl.g:2834:1: ( ( rule__Float__Alternatives_1_0 ) )
            {
            // InternalNpl.g:2834:1: ( ( rule__Float__Alternatives_1_0 ) )
            // InternalNpl.g:2835:1: ( rule__Float__Alternatives_1_0 )
            {
             before(grammarAccess.getFloatAccess().getAlternatives_1_0()); 
            // InternalNpl.g:2836:1: ( rule__Float__Alternatives_1_0 )
            // InternalNpl.g:2836:2: rule__Float__Alternatives_1_0
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
    // InternalNpl.g:2846:1: rule__Float__Group_1__1 : rule__Float__Group_1__1__Impl ;
    public final void rule__Float__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2850:1: ( rule__Float__Group_1__1__Impl )
            // InternalNpl.g:2851:2: rule__Float__Group_1__1__Impl
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
    // InternalNpl.g:2857:1: rule__Float__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__Float__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2861:1: ( ( RULE_INT ) )
            // InternalNpl.g:2862:1: ( RULE_INT )
            {
            // InternalNpl.g:2862:1: ( RULE_INT )
            // InternalNpl.g:2863:1: RULE_INT
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
    // InternalNpl.g:2879:1: rule__Declaration__UnorderedGroup : rule__Declaration__UnorderedGroup__0 {...}?;
    public final void rule__Declaration__UnorderedGroup() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getDeclarationAccess().getUnorderedGroup());
            
        try {
            // InternalNpl.g:2884:1: ( rule__Declaration__UnorderedGroup__0 {...}?)
            // InternalNpl.g:2885:2: rule__Declaration__UnorderedGroup__0 {...}?
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
    // InternalNpl.g:2896:1: rule__Declaration__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__Declaration__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_8__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_9__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_10__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_11__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_12__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_13__0 ) ) ) ) | ({...}? => ( ( ( '}' ) ) ) ) ) ;
    public final void rule__Declaration__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // InternalNpl.g:2901:1: ( ( ({...}? => ( ( ( rule__Declaration__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_8__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_9__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_10__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_11__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_12__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_13__0 ) ) ) ) | ({...}? => ( ( ( '}' ) ) ) ) ) )
            // InternalNpl.g:2902:3: ( ({...}? => ( ( ( rule__Declaration__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_8__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_9__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_10__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_11__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_12__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_13__0 ) ) ) ) | ({...}? => ( ( ( '}' ) ) ) ) )
            {
            // InternalNpl.g:2902:3: ( ({...}? => ( ( ( rule__Declaration__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_8__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_9__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_10__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_11__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_12__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_13__0 ) ) ) ) | ({...}? => ( ( ( '}' ) ) ) ) )
            int alt12=15;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalNpl.g:2904:4: ({...}? => ( ( ( rule__Declaration__Group_0__0 ) ) ) )
                    {
                    // InternalNpl.g:2904:4: ({...}? => ( ( ( rule__Declaration__Group_0__0 ) ) ) )
                    // InternalNpl.g:2905:5: {...}? => ( ( ( rule__Declaration__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Declaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalNpl.g:2905:106: ( ( ( rule__Declaration__Group_0__0 ) ) )
                    // InternalNpl.g:2906:6: ( ( rule__Declaration__Group_0__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalNpl.g:2912:6: ( ( rule__Declaration__Group_0__0 ) )
                    // InternalNpl.g:2914:7: ( rule__Declaration__Group_0__0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getGroup_0()); 
                    // InternalNpl.g:2915:7: ( rule__Declaration__Group_0__0 )
                    // InternalNpl.g:2915:8: rule__Declaration__Group_0__0
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
                    // InternalNpl.g:2921:4: ({...}? => ( ( ( rule__Declaration__Group_1__0 ) ) ) )
                    {
                    // InternalNpl.g:2921:4: ({...}? => ( ( ( rule__Declaration__Group_1__0 ) ) ) )
                    // InternalNpl.g:2922:5: {...}? => ( ( ( rule__Declaration__Group_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Declaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalNpl.g:2922:106: ( ( ( rule__Declaration__Group_1__0 ) ) )
                    // InternalNpl.g:2923:6: ( ( rule__Declaration__Group_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalNpl.g:2929:6: ( ( rule__Declaration__Group_1__0 ) )
                    // InternalNpl.g:2931:7: ( rule__Declaration__Group_1__0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getGroup_1()); 
                    // InternalNpl.g:2932:7: ( rule__Declaration__Group_1__0 )
                    // InternalNpl.g:2932:8: rule__Declaration__Group_1__0
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
                    // InternalNpl.g:2938:4: ({...}? => ( ( ( rule__Declaration__Group_2__0 ) ) ) )
                    {
                    // InternalNpl.g:2938:4: ({...}? => ( ( ( rule__Declaration__Group_2__0 ) ) ) )
                    // InternalNpl.g:2939:5: {...}? => ( ( ( rule__Declaration__Group_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Declaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2)");
                    }
                    // InternalNpl.g:2939:106: ( ( ( rule__Declaration__Group_2__0 ) ) )
                    // InternalNpl.g:2940:6: ( ( rule__Declaration__Group_2__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalNpl.g:2946:6: ( ( rule__Declaration__Group_2__0 ) )
                    // InternalNpl.g:2948:7: ( rule__Declaration__Group_2__0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getGroup_2()); 
                    // InternalNpl.g:2949:7: ( rule__Declaration__Group_2__0 )
                    // InternalNpl.g:2949:8: rule__Declaration__Group_2__0
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
                    // InternalNpl.g:2955:4: ({...}? => ( ( ( rule__Declaration__Group_3__0 ) ) ) )
                    {
                    // InternalNpl.g:2955:4: ({...}? => ( ( ( rule__Declaration__Group_3__0 ) ) ) )
                    // InternalNpl.g:2956:5: {...}? => ( ( ( rule__Declaration__Group_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3) ) {
                        throw new FailedPredicateException(input, "rule__Declaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3)");
                    }
                    // InternalNpl.g:2956:106: ( ( ( rule__Declaration__Group_3__0 ) ) )
                    // InternalNpl.g:2957:6: ( ( rule__Declaration__Group_3__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalNpl.g:2963:6: ( ( rule__Declaration__Group_3__0 ) )
                    // InternalNpl.g:2965:7: ( rule__Declaration__Group_3__0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getGroup_3()); 
                    // InternalNpl.g:2966:7: ( rule__Declaration__Group_3__0 )
                    // InternalNpl.g:2966:8: rule__Declaration__Group_3__0
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
                    // InternalNpl.g:2972:4: ({...}? => ( ( ( rule__Declaration__Group_4__0 ) ) ) )
                    {
                    // InternalNpl.g:2972:4: ({...}? => ( ( ( rule__Declaration__Group_4__0 ) ) ) )
                    // InternalNpl.g:2973:5: {...}? => ( ( ( rule__Declaration__Group_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4) ) {
                        throw new FailedPredicateException(input, "rule__Declaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4)");
                    }
                    // InternalNpl.g:2973:106: ( ( ( rule__Declaration__Group_4__0 ) ) )
                    // InternalNpl.g:2974:6: ( ( rule__Declaration__Group_4__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalNpl.g:2980:6: ( ( rule__Declaration__Group_4__0 ) )
                    // InternalNpl.g:2982:7: ( rule__Declaration__Group_4__0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getGroup_4()); 
                    // InternalNpl.g:2983:7: ( rule__Declaration__Group_4__0 )
                    // InternalNpl.g:2983:8: rule__Declaration__Group_4__0
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
                    // InternalNpl.g:2989:4: ({...}? => ( ( ( rule__Declaration__Group_5__0 ) ) ) )
                    {
                    // InternalNpl.g:2989:4: ({...}? => ( ( ( rule__Declaration__Group_5__0 ) ) ) )
                    // InternalNpl.g:2990:5: {...}? => ( ( ( rule__Declaration__Group_5__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5) ) {
                        throw new FailedPredicateException(input, "rule__Declaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5)");
                    }
                    // InternalNpl.g:2990:106: ( ( ( rule__Declaration__Group_5__0 ) ) )
                    // InternalNpl.g:2991:6: ( ( rule__Declaration__Group_5__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalNpl.g:2997:6: ( ( rule__Declaration__Group_5__0 ) )
                    // InternalNpl.g:2999:7: ( rule__Declaration__Group_5__0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getGroup_5()); 
                    // InternalNpl.g:3000:7: ( rule__Declaration__Group_5__0 )
                    // InternalNpl.g:3000:8: rule__Declaration__Group_5__0
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
                    // InternalNpl.g:3006:4: ({...}? => ( ( ( rule__Declaration__Group_6__0 ) ) ) )
                    {
                    // InternalNpl.g:3006:4: ({...}? => ( ( ( rule__Declaration__Group_6__0 ) ) ) )
                    // InternalNpl.g:3007:5: {...}? => ( ( ( rule__Declaration__Group_6__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6) ) {
                        throw new FailedPredicateException(input, "rule__Declaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6)");
                    }
                    // InternalNpl.g:3007:106: ( ( ( rule__Declaration__Group_6__0 ) ) )
                    // InternalNpl.g:3008:6: ( ( rule__Declaration__Group_6__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalNpl.g:3014:6: ( ( rule__Declaration__Group_6__0 ) )
                    // InternalNpl.g:3016:7: ( rule__Declaration__Group_6__0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getGroup_6()); 
                    // InternalNpl.g:3017:7: ( rule__Declaration__Group_6__0 )
                    // InternalNpl.g:3017:8: rule__Declaration__Group_6__0
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
                    // InternalNpl.g:3023:4: ({...}? => ( ( ( rule__Declaration__Group_7__0 ) ) ) )
                    {
                    // InternalNpl.g:3023:4: ({...}? => ( ( ( rule__Declaration__Group_7__0 ) ) ) )
                    // InternalNpl.g:3024:5: {...}? => ( ( ( rule__Declaration__Group_7__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7) ) {
                        throw new FailedPredicateException(input, "rule__Declaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7)");
                    }
                    // InternalNpl.g:3024:106: ( ( ( rule__Declaration__Group_7__0 ) ) )
                    // InternalNpl.g:3025:6: ( ( rule__Declaration__Group_7__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalNpl.g:3031:6: ( ( rule__Declaration__Group_7__0 ) )
                    // InternalNpl.g:3033:7: ( rule__Declaration__Group_7__0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getGroup_7()); 
                    // InternalNpl.g:3034:7: ( rule__Declaration__Group_7__0 )
                    // InternalNpl.g:3034:8: rule__Declaration__Group_7__0
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
                    // InternalNpl.g:3040:4: ({...}? => ( ( ( rule__Declaration__Group_8__0 ) ) ) )
                    {
                    // InternalNpl.g:3040:4: ({...}? => ( ( ( rule__Declaration__Group_8__0 ) ) ) )
                    // InternalNpl.g:3041:5: {...}? => ( ( ( rule__Declaration__Group_8__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8) ) {
                        throw new FailedPredicateException(input, "rule__Declaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8)");
                    }
                    // InternalNpl.g:3041:106: ( ( ( rule__Declaration__Group_8__0 ) ) )
                    // InternalNpl.g:3042:6: ( ( rule__Declaration__Group_8__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalNpl.g:3048:6: ( ( rule__Declaration__Group_8__0 ) )
                    // InternalNpl.g:3050:7: ( rule__Declaration__Group_8__0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getGroup_8()); 
                    // InternalNpl.g:3051:7: ( rule__Declaration__Group_8__0 )
                    // InternalNpl.g:3051:8: rule__Declaration__Group_8__0
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
                    // InternalNpl.g:3057:4: ({...}? => ( ( ( rule__Declaration__Group_9__0 ) ) ) )
                    {
                    // InternalNpl.g:3057:4: ({...}? => ( ( ( rule__Declaration__Group_9__0 ) ) ) )
                    // InternalNpl.g:3058:5: {...}? => ( ( ( rule__Declaration__Group_9__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9) ) {
                        throw new FailedPredicateException(input, "rule__Declaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9)");
                    }
                    // InternalNpl.g:3058:106: ( ( ( rule__Declaration__Group_9__0 ) ) )
                    // InternalNpl.g:3059:6: ( ( rule__Declaration__Group_9__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalNpl.g:3065:6: ( ( rule__Declaration__Group_9__0 ) )
                    // InternalNpl.g:3067:7: ( rule__Declaration__Group_9__0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getGroup_9()); 
                    // InternalNpl.g:3068:7: ( rule__Declaration__Group_9__0 )
                    // InternalNpl.g:3068:8: rule__Declaration__Group_9__0
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
                    // InternalNpl.g:3074:4: ({...}? => ( ( ( rule__Declaration__Group_10__0 ) ) ) )
                    {
                    // InternalNpl.g:3074:4: ({...}? => ( ( ( rule__Declaration__Group_10__0 ) ) ) )
                    // InternalNpl.g:3075:5: {...}? => ( ( ( rule__Declaration__Group_10__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10) ) {
                        throw new FailedPredicateException(input, "rule__Declaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10)");
                    }
                    // InternalNpl.g:3075:107: ( ( ( rule__Declaration__Group_10__0 ) ) )
                    // InternalNpl.g:3076:6: ( ( rule__Declaration__Group_10__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalNpl.g:3082:6: ( ( rule__Declaration__Group_10__0 ) )
                    // InternalNpl.g:3084:7: ( rule__Declaration__Group_10__0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getGroup_10()); 
                    // InternalNpl.g:3085:7: ( rule__Declaration__Group_10__0 )
                    // InternalNpl.g:3085:8: rule__Declaration__Group_10__0
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
                    // InternalNpl.g:3091:4: ({...}? => ( ( ( rule__Declaration__Group_11__0 ) ) ) )
                    {
                    // InternalNpl.g:3091:4: ({...}? => ( ( ( rule__Declaration__Group_11__0 ) ) ) )
                    // InternalNpl.g:3092:5: {...}? => ( ( ( rule__Declaration__Group_11__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11) ) {
                        throw new FailedPredicateException(input, "rule__Declaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11)");
                    }
                    // InternalNpl.g:3092:107: ( ( ( rule__Declaration__Group_11__0 ) ) )
                    // InternalNpl.g:3093:6: ( ( rule__Declaration__Group_11__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalNpl.g:3099:6: ( ( rule__Declaration__Group_11__0 ) )
                    // InternalNpl.g:3101:7: ( rule__Declaration__Group_11__0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getGroup_11()); 
                    // InternalNpl.g:3102:7: ( rule__Declaration__Group_11__0 )
                    // InternalNpl.g:3102:8: rule__Declaration__Group_11__0
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
                    // InternalNpl.g:3108:4: ({...}? => ( ( ( rule__Declaration__Group_12__0 ) ) ) )
                    {
                    // InternalNpl.g:3108:4: ({...}? => ( ( ( rule__Declaration__Group_12__0 ) ) ) )
                    // InternalNpl.g:3109:5: {...}? => ( ( ( rule__Declaration__Group_12__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12) ) {
                        throw new FailedPredicateException(input, "rule__Declaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12)");
                    }
                    // InternalNpl.g:3109:107: ( ( ( rule__Declaration__Group_12__0 ) ) )
                    // InternalNpl.g:3110:6: ( ( rule__Declaration__Group_12__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalNpl.g:3116:6: ( ( rule__Declaration__Group_12__0 ) )
                    // InternalNpl.g:3118:7: ( rule__Declaration__Group_12__0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getGroup_12()); 
                    // InternalNpl.g:3119:7: ( rule__Declaration__Group_12__0 )
                    // InternalNpl.g:3119:8: rule__Declaration__Group_12__0
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
                    // InternalNpl.g:3125:4: ({...}? => ( ( ( rule__Declaration__Group_13__0 ) ) ) )
                    {
                    // InternalNpl.g:3125:4: ({...}? => ( ( ( rule__Declaration__Group_13__0 ) ) ) )
                    // InternalNpl.g:3126:5: {...}? => ( ( ( rule__Declaration__Group_13__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13) ) {
                        throw new FailedPredicateException(input, "rule__Declaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13)");
                    }
                    // InternalNpl.g:3126:107: ( ( ( rule__Declaration__Group_13__0 ) ) )
                    // InternalNpl.g:3127:6: ( ( rule__Declaration__Group_13__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalNpl.g:3133:6: ( ( rule__Declaration__Group_13__0 ) )
                    // InternalNpl.g:3135:7: ( rule__Declaration__Group_13__0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getGroup_13()); 
                    // InternalNpl.g:3136:7: ( rule__Declaration__Group_13__0 )
                    // InternalNpl.g:3136:8: rule__Declaration__Group_13__0
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
                    // InternalNpl.g:3142:4: ({...}? => ( ( ( '}' ) ) ) )
                    {
                    // InternalNpl.g:3142:4: ({...}? => ( ( ( '}' ) ) ) )
                    // InternalNpl.g:3143:5: {...}? => ( ( ( '}' ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14) ) {
                        throw new FailedPredicateException(input, "rule__Declaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14)");
                    }
                    // InternalNpl.g:3143:107: ( ( ( '}' ) ) )
                    // InternalNpl.g:3144:6: ( ( '}' ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalNpl.g:3150:6: ( ( '}' ) )
                    // InternalNpl.g:3152:7: ( '}' )
                    {
                     before(grammarAccess.getDeclarationAccess().getRightCurlyBracketKeyword_14()); 
                    // InternalNpl.g:3153:7: ( '}' )
                    // InternalNpl.g:3154:2: '}'
                    {
                    match(input,20,FOLLOW_2); 

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
    // InternalNpl.g:3170:1: rule__Declaration__UnorderedGroup__0 : rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__1 )? ;
    public final void rule__Declaration__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3174:1: ( rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__1 )? )
            // InternalNpl.g:3175:2: rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_28);
            rule__Declaration__UnorderedGroup__Impl();

            state._fsp--;

            // InternalNpl.g:3176:2: ( rule__Declaration__UnorderedGroup__1 )?
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalNpl.g:3176:2: rule__Declaration__UnorderedGroup__1
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
    // InternalNpl.g:3183:1: rule__Declaration__UnorderedGroup__1 : rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__2 )? ;
    public final void rule__Declaration__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3187:1: ( rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__2 )? )
            // InternalNpl.g:3188:2: rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_28);
            rule__Declaration__UnorderedGroup__Impl();

            state._fsp--;

            // InternalNpl.g:3189:2: ( rule__Declaration__UnorderedGroup__2 )?
            int alt14=2;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalNpl.g:3189:2: rule__Declaration__UnorderedGroup__2
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
    // InternalNpl.g:3196:1: rule__Declaration__UnorderedGroup__2 : rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__3 )? ;
    public final void rule__Declaration__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3200:1: ( rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__3 )? )
            // InternalNpl.g:3201:2: rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__3 )?
            {
            pushFollow(FOLLOW_28);
            rule__Declaration__UnorderedGroup__Impl();

            state._fsp--;

            // InternalNpl.g:3202:2: ( rule__Declaration__UnorderedGroup__3 )?
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalNpl.g:3202:2: rule__Declaration__UnorderedGroup__3
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
    // InternalNpl.g:3209:1: rule__Declaration__UnorderedGroup__3 : rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__4 )? ;
    public final void rule__Declaration__UnorderedGroup__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3213:1: ( rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__4 )? )
            // InternalNpl.g:3214:2: rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__4 )?
            {
            pushFollow(FOLLOW_28);
            rule__Declaration__UnorderedGroup__Impl();

            state._fsp--;

            // InternalNpl.g:3215:2: ( rule__Declaration__UnorderedGroup__4 )?
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalNpl.g:3215:2: rule__Declaration__UnorderedGroup__4
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
    // InternalNpl.g:3222:1: rule__Declaration__UnorderedGroup__4 : rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__5 )? ;
    public final void rule__Declaration__UnorderedGroup__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3226:1: ( rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__5 )? )
            // InternalNpl.g:3227:2: rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__5 )?
            {
            pushFollow(FOLLOW_28);
            rule__Declaration__UnorderedGroup__Impl();

            state._fsp--;

            // InternalNpl.g:3228:2: ( rule__Declaration__UnorderedGroup__5 )?
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalNpl.g:3228:2: rule__Declaration__UnorderedGroup__5
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
    // InternalNpl.g:3235:1: rule__Declaration__UnorderedGroup__5 : rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__6 )? ;
    public final void rule__Declaration__UnorderedGroup__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3239:1: ( rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__6 )? )
            // InternalNpl.g:3240:2: rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__6 )?
            {
            pushFollow(FOLLOW_28);
            rule__Declaration__UnorderedGroup__Impl();

            state._fsp--;

            // InternalNpl.g:3241:2: ( rule__Declaration__UnorderedGroup__6 )?
            int alt18=2;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalNpl.g:3241:2: rule__Declaration__UnorderedGroup__6
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
    // InternalNpl.g:3248:1: rule__Declaration__UnorderedGroup__6 : rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__7 )? ;
    public final void rule__Declaration__UnorderedGroup__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3252:1: ( rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__7 )? )
            // InternalNpl.g:3253:2: rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__7 )?
            {
            pushFollow(FOLLOW_28);
            rule__Declaration__UnorderedGroup__Impl();

            state._fsp--;

            // InternalNpl.g:3254:2: ( rule__Declaration__UnorderedGroup__7 )?
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalNpl.g:3254:2: rule__Declaration__UnorderedGroup__7
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
    // InternalNpl.g:3261:1: rule__Declaration__UnorderedGroup__7 : rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__8 )? ;
    public final void rule__Declaration__UnorderedGroup__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3265:1: ( rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__8 )? )
            // InternalNpl.g:3266:2: rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__8 )?
            {
            pushFollow(FOLLOW_28);
            rule__Declaration__UnorderedGroup__Impl();

            state._fsp--;

            // InternalNpl.g:3267:2: ( rule__Declaration__UnorderedGroup__8 )?
            int alt20=2;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalNpl.g:3267:2: rule__Declaration__UnorderedGroup__8
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
    // InternalNpl.g:3274:1: rule__Declaration__UnorderedGroup__8 : rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__9 )? ;
    public final void rule__Declaration__UnorderedGroup__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3278:1: ( rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__9 )? )
            // InternalNpl.g:3279:2: rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__9 )?
            {
            pushFollow(FOLLOW_28);
            rule__Declaration__UnorderedGroup__Impl();

            state._fsp--;

            // InternalNpl.g:3280:2: ( rule__Declaration__UnorderedGroup__9 )?
            int alt21=2;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalNpl.g:3280:2: rule__Declaration__UnorderedGroup__9
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
    // InternalNpl.g:3287:1: rule__Declaration__UnorderedGroup__9 : rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__10 )? ;
    public final void rule__Declaration__UnorderedGroup__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3291:1: ( rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__10 )? )
            // InternalNpl.g:3292:2: rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__10 )?
            {
            pushFollow(FOLLOW_28);
            rule__Declaration__UnorderedGroup__Impl();

            state._fsp--;

            // InternalNpl.g:3293:2: ( rule__Declaration__UnorderedGroup__10 )?
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalNpl.g:3293:2: rule__Declaration__UnorderedGroup__10
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
    // InternalNpl.g:3300:1: rule__Declaration__UnorderedGroup__10 : rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__11 )? ;
    public final void rule__Declaration__UnorderedGroup__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3304:1: ( rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__11 )? )
            // InternalNpl.g:3305:2: rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__11 )?
            {
            pushFollow(FOLLOW_28);
            rule__Declaration__UnorderedGroup__Impl();

            state._fsp--;

            // InternalNpl.g:3306:2: ( rule__Declaration__UnorderedGroup__11 )?
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // InternalNpl.g:3306:2: rule__Declaration__UnorderedGroup__11
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
    // InternalNpl.g:3313:1: rule__Declaration__UnorderedGroup__11 : rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__12 )? ;
    public final void rule__Declaration__UnorderedGroup__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3317:1: ( rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__12 )? )
            // InternalNpl.g:3318:2: rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__12 )?
            {
            pushFollow(FOLLOW_28);
            rule__Declaration__UnorderedGroup__Impl();

            state._fsp--;

            // InternalNpl.g:3319:2: ( rule__Declaration__UnorderedGroup__12 )?
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // InternalNpl.g:3319:2: rule__Declaration__UnorderedGroup__12
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
    // InternalNpl.g:3326:1: rule__Declaration__UnorderedGroup__12 : rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__13 )? ;
    public final void rule__Declaration__UnorderedGroup__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3330:1: ( rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__13 )? )
            // InternalNpl.g:3331:2: rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__13 )?
            {
            pushFollow(FOLLOW_28);
            rule__Declaration__UnorderedGroup__Impl();

            state._fsp--;

            // InternalNpl.g:3332:2: ( rule__Declaration__UnorderedGroup__13 )?
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // InternalNpl.g:3332:2: rule__Declaration__UnorderedGroup__13
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
    // InternalNpl.g:3339:1: rule__Declaration__UnorderedGroup__13 : rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__14 )? ;
    public final void rule__Declaration__UnorderedGroup__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3343:1: ( rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__14 )? )
            // InternalNpl.g:3344:2: rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__14 )?
            {
            pushFollow(FOLLOW_28);
            rule__Declaration__UnorderedGroup__Impl();

            state._fsp--;

            // InternalNpl.g:3345:2: ( rule__Declaration__UnorderedGroup__14 )?
            int alt26=2;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // InternalNpl.g:3345:2: rule__Declaration__UnorderedGroup__14
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
    // InternalNpl.g:3352:1: rule__Declaration__UnorderedGroup__14 : rule__Declaration__UnorderedGroup__Impl ;
    public final void rule__Declaration__UnorderedGroup__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3356:1: ( rule__Declaration__UnorderedGroup__Impl )
            // InternalNpl.g:3357:2: rule__Declaration__UnorderedGroup__Impl
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
    // InternalNpl.g:3394:1: rule__Declaration__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Declaration__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3398:1: ( ( RULE_ID ) )
            // InternalNpl.g:3399:1: ( RULE_ID )
            {
            // InternalNpl.g:3399:1: ( RULE_ID )
            // InternalNpl.g:3400:1: RULE_ID
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


    // $ANTLR start "rule__Declaration__TitleAssignment_1_1"
    // InternalNpl.g:3409:1: rule__Declaration__TitleAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Declaration__TitleAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3413:1: ( ( RULE_STRING ) )
            // InternalNpl.g:3414:1: ( RULE_STRING )
            {
            // InternalNpl.g:3414:1: ( RULE_STRING )
            // InternalNpl.g:3415:1: RULE_STRING
            {
             before(grammarAccess.getDeclarationAccess().getTitleSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getTitleSTRINGTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Declaration__TitleAssignment_1_1"


    // $ANTLR start "rule__Declaration__FeedlinksAssignment_1_4"
    // InternalNpl.g:3424:1: rule__Declaration__FeedlinksAssignment_1_4 : ( rulePair ) ;
    public final void rule__Declaration__FeedlinksAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3428:1: ( ( rulePair ) )
            // InternalNpl.g:3429:1: ( rulePair )
            {
            // InternalNpl.g:3429:1: ( rulePair )
            // InternalNpl.g:3430:1: rulePair
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


    // $ANTLR start "rule__Declaration__FeedlinksAssignment_1_5"
    // InternalNpl.g:3439:1: rule__Declaration__FeedlinksAssignment_1_5 : ( rulePair ) ;
    public final void rule__Declaration__FeedlinksAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3443:1: ( ( rulePair ) )
            // InternalNpl.g:3444:1: ( rulePair )
            {
            // InternalNpl.g:3444:1: ( rulePair )
            // InternalNpl.g:3445:1: rulePair
            {
             before(grammarAccess.getDeclarationAccess().getFeedlinksPairParserRuleCall_1_5_0()); 
            pushFollow(FOLLOW_2);
            rulePair();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getFeedlinksPairParserRuleCall_1_5_0()); 

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
    // $ANTLR end "rule__Declaration__FeedlinksAssignment_1_5"


    // $ANTLR start "rule__Declaration__TopicsAssignment_2_2"
    // InternalNpl.g:3454:1: rule__Declaration__TopicsAssignment_2_2 : ( ruleTopic ) ;
    public final void rule__Declaration__TopicsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3458:1: ( ( ruleTopic ) )
            // InternalNpl.g:3459:1: ( ruleTopic )
            {
            // InternalNpl.g:3459:1: ( ruleTopic )
            // InternalNpl.g:3460:1: ruleTopic
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
    // InternalNpl.g:3469:1: rule__Declaration__TopicsAssignment_2_3 : ( ruleTopic ) ;
    public final void rule__Declaration__TopicsAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3473:1: ( ( ruleTopic ) )
            // InternalNpl.g:3474:1: ( ruleTopic )
            {
            // InternalNpl.g:3474:1: ( ruleTopic )
            // InternalNpl.g:3475:1: ruleTopic
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
    // InternalNpl.g:3484:1: rule__Declaration__DateAssignment_3_1 : ( ruleDate ) ;
    public final void rule__Declaration__DateAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3488:1: ( ( ruleDate ) )
            // InternalNpl.g:3489:1: ( ruleDate )
            {
            // InternalNpl.g:3489:1: ( ruleDate )
            // InternalNpl.g:3490:1: ruleDate
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
    // InternalNpl.g:3499:1: rule__Declaration__LocationAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Declaration__LocationAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3503:1: ( ( RULE_STRING ) )
            // InternalNpl.g:3504:1: ( RULE_STRING )
            {
            // InternalNpl.g:3504:1: ( RULE_STRING )
            // InternalNpl.g:3505:1: RULE_STRING
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
    // InternalNpl.g:3514:1: rule__Declaration__PriceAssignment_5_1 : ( rulePrice ) ;
    public final void rule__Declaration__PriceAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3518:1: ( ( rulePrice ) )
            // InternalNpl.g:3519:1: ( rulePrice )
            {
            // InternalNpl.g:3519:1: ( rulePrice )
            // InternalNpl.g:3520:1: rulePrice
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
    // InternalNpl.g:3529:1: rule__Declaration__VolumeAssignment_6_1 : ( RULE_INT ) ;
    public final void rule__Declaration__VolumeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3533:1: ( ( RULE_INT ) )
            // InternalNpl.g:3534:1: ( RULE_INT )
            {
            // InternalNpl.g:3534:1: ( RULE_INT )
            // InternalNpl.g:3535:1: RULE_INT
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
    // InternalNpl.g:3544:1: rule__Declaration__NumberAssignment_6_2_1 : ( RULE_INT ) ;
    public final void rule__Declaration__NumberAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3548:1: ( ( RULE_INT ) )
            // InternalNpl.g:3549:1: ( RULE_INT )
            {
            // InternalNpl.g:3549:1: ( RULE_INT )
            // InternalNpl.g:3550:1: RULE_INT
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
    // InternalNpl.g:3559:1: rule__Declaration__LanguageAssignment_7_1 : ( ruleLanguage ) ;
    public final void rule__Declaration__LanguageAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3563:1: ( ( ruleLanguage ) )
            // InternalNpl.g:3564:1: ( ruleLanguage )
            {
            // InternalNpl.g:3564:1: ( ruleLanguage )
            // InternalNpl.g:3565:1: ruleLanguage
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
    // InternalNpl.g:3574:1: rule__Declaration__FormatAssignment_8_1 : ( ruleFormat ) ;
    public final void rule__Declaration__FormatAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3578:1: ( ( ruleFormat ) )
            // InternalNpl.g:3579:1: ( ruleFormat )
            {
            // InternalNpl.g:3579:1: ( ruleFormat )
            // InternalNpl.g:3580:1: ruleFormat
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
    // InternalNpl.g:3589:1: rule__Declaration__ArticleCntAssignment_9_1 : ( RULE_INT ) ;
    public final void rule__Declaration__ArticleCntAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3593:1: ( ( RULE_INT ) )
            // InternalNpl.g:3594:1: ( RULE_INT )
            {
            // InternalNpl.g:3594:1: ( RULE_INT )
            // InternalNpl.g:3595:1: RULE_INT
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
    // InternalNpl.g:3604:1: rule__Declaration__ArticleWordsMinAssignment_10_1 : ( RULE_INT ) ;
    public final void rule__Declaration__ArticleWordsMinAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3608:1: ( ( RULE_INT ) )
            // InternalNpl.g:3609:1: ( RULE_INT )
            {
            // InternalNpl.g:3609:1: ( RULE_INT )
            // InternalNpl.g:3610:1: RULE_INT
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
    // InternalNpl.g:3619:1: rule__Declaration__ArticleWordsMaxAssignment_10_3 : ( RULE_INT ) ;
    public final void rule__Declaration__ArticleWordsMaxAssignment_10_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3623:1: ( ( RULE_INT ) )
            // InternalNpl.g:3624:1: ( RULE_INT )
            {
            // InternalNpl.g:3624:1: ( RULE_INT )
            // InternalNpl.g:3625:1: RULE_INT
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
    // InternalNpl.g:3634:1: rule__Declaration__ImagesCntAssignment_11_1 : ( ruleImagesCount ) ;
    public final void rule__Declaration__ImagesCntAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3638:1: ( ( ruleImagesCount ) )
            // InternalNpl.g:3639:1: ( ruleImagesCount )
            {
            // InternalNpl.g:3639:1: ( ruleImagesCount )
            // InternalNpl.g:3640:1: ruleImagesCount
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
    // InternalNpl.g:3649:1: rule__Declaration__ColumnsCntAssignment_12_1 : ( RULE_INT ) ;
    public final void rule__Declaration__ColumnsCntAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3653:1: ( ( RULE_INT ) )
            // InternalNpl.g:3654:1: ( RULE_INT )
            {
            // InternalNpl.g:3654:1: ( RULE_INT )
            // InternalNpl.g:3655:1: RULE_INT
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
    // InternalNpl.g:3664:1: rule__Declaration__FontSizeAssignment_13_1 : ( ruleFontSize ) ;
    public final void rule__Declaration__FontSizeAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3668:1: ( ( ruleFontSize ) )
            // InternalNpl.g:3669:1: ( ruleFontSize )
            {
            // InternalNpl.g:3669:1: ( ruleFontSize )
            // InternalNpl.g:3670:1: ruleFontSize
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
    // InternalNpl.g:3679:1: rule__ImagesCount__ValueAssignment : ( RULE_INT ) ;
    public final void rule__ImagesCount__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3683:1: ( ( RULE_INT ) )
            // InternalNpl.g:3684:1: ( RULE_INT )
            {
            // InternalNpl.g:3684:1: ( RULE_INT )
            // InternalNpl.g:3685:1: RULE_INT
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
    // InternalNpl.g:3694:1: rule__FontSize__ValueAssignment_0 : ( ( 'small' ) ) ;
    public final void rule__FontSize__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3698:1: ( ( ( 'small' ) ) )
            // InternalNpl.g:3699:1: ( ( 'small' ) )
            {
            // InternalNpl.g:3699:1: ( ( 'small' ) )
            // InternalNpl.g:3700:1: ( 'small' )
            {
             before(grammarAccess.getFontSizeAccess().getValueSmallKeyword_0_0()); 
            // InternalNpl.g:3701:1: ( 'small' )
            // InternalNpl.g:3702:1: 'small'
            {
             before(grammarAccess.getFontSizeAccess().getValueSmallKeyword_0_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalNpl.g:3717:1: rule__FontSize__ValueAssignment_1 : ( ( 'medium' ) ) ;
    public final void rule__FontSize__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3721:1: ( ( ( 'medium' ) ) )
            // InternalNpl.g:3722:1: ( ( 'medium' ) )
            {
            // InternalNpl.g:3722:1: ( ( 'medium' ) )
            // InternalNpl.g:3723:1: ( 'medium' )
            {
             before(grammarAccess.getFontSizeAccess().getValueMediumKeyword_1_0()); 
            // InternalNpl.g:3724:1: ( 'medium' )
            // InternalNpl.g:3725:1: 'medium'
            {
             before(grammarAccess.getFontSizeAccess().getValueMediumKeyword_1_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalNpl.g:3740:1: rule__FontSize__ValueAssignment_2 : ( ( 'large' ) ) ;
    public final void rule__FontSize__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3744:1: ( ( ( 'large' ) ) )
            // InternalNpl.g:3745:1: ( ( 'large' ) )
            {
            // InternalNpl.g:3745:1: ( ( 'large' ) )
            // InternalNpl.g:3746:1: ( 'large' )
            {
             before(grammarAccess.getFontSizeAccess().getValueLargeKeyword_2_0()); 
            // InternalNpl.g:3747:1: ( 'large' )
            // InternalNpl.g:3748:1: 'large'
            {
             before(grammarAccess.getFontSizeAccess().getValueLargeKeyword_2_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalNpl.g:3763:1: rule__Format__ValueAssignment_0 : ( ( 'DIN A6' ) ) ;
    public final void rule__Format__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3767:1: ( ( ( 'DIN A6' ) ) )
            // InternalNpl.g:3768:1: ( ( 'DIN A6' ) )
            {
            // InternalNpl.g:3768:1: ( ( 'DIN A6' ) )
            // InternalNpl.g:3769:1: ( 'DIN A6' )
            {
             before(grammarAccess.getFormatAccess().getValueDINA6Keyword_0_0()); 
            // InternalNpl.g:3770:1: ( 'DIN A6' )
            // InternalNpl.g:3771:1: 'DIN A6'
            {
             before(grammarAccess.getFormatAccess().getValueDINA6Keyword_0_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalNpl.g:3786:1: rule__Format__ValueAssignment_1 : ( ( 'DIN A5' ) ) ;
    public final void rule__Format__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3790:1: ( ( ( 'DIN A5' ) ) )
            // InternalNpl.g:3791:1: ( ( 'DIN A5' ) )
            {
            // InternalNpl.g:3791:1: ( ( 'DIN A5' ) )
            // InternalNpl.g:3792:1: ( 'DIN A5' )
            {
             before(grammarAccess.getFormatAccess().getValueDINA5Keyword_1_0()); 
            // InternalNpl.g:3793:1: ( 'DIN A5' )
            // InternalNpl.g:3794:1: 'DIN A5'
            {
             before(grammarAccess.getFormatAccess().getValueDINA5Keyword_1_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalNpl.g:3809:1: rule__Format__ValueAssignment_2 : ( ( 'DIN A4' ) ) ;
    public final void rule__Format__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3813:1: ( ( ( 'DIN A4' ) ) )
            // InternalNpl.g:3814:1: ( ( 'DIN A4' ) )
            {
            // InternalNpl.g:3814:1: ( ( 'DIN A4' ) )
            // InternalNpl.g:3815:1: ( 'DIN A4' )
            {
             before(grammarAccess.getFormatAccess().getValueDINA4Keyword_2_0()); 
            // InternalNpl.g:3816:1: ( 'DIN A4' )
            // InternalNpl.g:3817:1: 'DIN A4'
            {
             before(grammarAccess.getFormatAccess().getValueDINA4Keyword_2_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalNpl.g:3832:1: rule__Format__ValueAssignment_3 : ( ( 'DIN A3' ) ) ;
    public final void rule__Format__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3836:1: ( ( ( 'DIN A3' ) ) )
            // InternalNpl.g:3837:1: ( ( 'DIN A3' ) )
            {
            // InternalNpl.g:3837:1: ( ( 'DIN A3' ) )
            // InternalNpl.g:3838:1: ( 'DIN A3' )
            {
             before(grammarAccess.getFormatAccess().getValueDINA3Keyword_3_0()); 
            // InternalNpl.g:3839:1: ( 'DIN A3' )
            // InternalNpl.g:3840:1: 'DIN A3'
            {
             before(grammarAccess.getFormatAccess().getValueDINA3Keyword_3_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalNpl.g:3855:1: rule__Format__ValueAssignment_4 : ( ( 'DIN A2' ) ) ;
    public final void rule__Format__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3859:1: ( ( ( 'DIN A2' ) ) )
            // InternalNpl.g:3860:1: ( ( 'DIN A2' ) )
            {
            // InternalNpl.g:3860:1: ( ( 'DIN A2' ) )
            // InternalNpl.g:3861:1: ( 'DIN A2' )
            {
             before(grammarAccess.getFormatAccess().getValueDINA2Keyword_4_0()); 
            // InternalNpl.g:3862:1: ( 'DIN A2' )
            // InternalNpl.g:3863:1: 'DIN A2'
            {
             before(grammarAccess.getFormatAccess().getValueDINA2Keyword_4_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalNpl.g:3878:1: rule__Format__ValueAssignment_5 : ( ( 'DIN A1' ) ) ;
    public final void rule__Format__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3882:1: ( ( ( 'DIN A1' ) ) )
            // InternalNpl.g:3883:1: ( ( 'DIN A1' ) )
            {
            // InternalNpl.g:3883:1: ( ( 'DIN A1' ) )
            // InternalNpl.g:3884:1: ( 'DIN A1' )
            {
             before(grammarAccess.getFormatAccess().getValueDINA1Keyword_5_0()); 
            // InternalNpl.g:3885:1: ( 'DIN A1' )
            // InternalNpl.g:3886:1: 'DIN A1'
            {
             before(grammarAccess.getFormatAccess().getValueDINA1Keyword_5_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalNpl.g:3901:1: rule__Format__ValueAssignment_6 : ( ( 'DIN A0' ) ) ;
    public final void rule__Format__ValueAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3905:1: ( ( ( 'DIN A0' ) ) )
            // InternalNpl.g:3906:1: ( ( 'DIN A0' ) )
            {
            // InternalNpl.g:3906:1: ( ( 'DIN A0' ) )
            // InternalNpl.g:3907:1: ( 'DIN A0' )
            {
             before(grammarAccess.getFormatAccess().getValueDINA0Keyword_6_0()); 
            // InternalNpl.g:3908:1: ( 'DIN A0' )
            // InternalNpl.g:3909:1: 'DIN A0'
            {
             before(grammarAccess.getFormatAccess().getValueDINA0Keyword_6_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalNpl.g:3924:1: rule__Date__DayAssignment_1 : ( RULE_INT ) ;
    public final void rule__Date__DayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3928:1: ( ( RULE_INT ) )
            // InternalNpl.g:3929:1: ( RULE_INT )
            {
            // InternalNpl.g:3929:1: ( RULE_INT )
            // InternalNpl.g:3930:1: RULE_INT
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
    // InternalNpl.g:3939:1: rule__Date__MonthAssignment_3 : ( RULE_INT ) ;
    public final void rule__Date__MonthAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3943:1: ( ( RULE_INT ) )
            // InternalNpl.g:3944:1: ( RULE_INT )
            {
            // InternalNpl.g:3944:1: ( RULE_INT )
            // InternalNpl.g:3945:1: RULE_INT
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
    // InternalNpl.g:3954:1: rule__Date__YearAssignment_5 : ( RULE_INT ) ;
    public final void rule__Date__YearAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3958:1: ( ( RULE_INT ) )
            // InternalNpl.g:3959:1: ( RULE_INT )
            {
            // InternalNpl.g:3959:1: ( RULE_INT )
            // InternalNpl.g:3960:1: RULE_INT
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
    // InternalNpl.g:3969:1: rule__Language__ValueAssignment_0 : ( ( 'English' ) ) ;
    public final void rule__Language__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3973:1: ( ( ( 'English' ) ) )
            // InternalNpl.g:3974:1: ( ( 'English' ) )
            {
            // InternalNpl.g:3974:1: ( ( 'English' ) )
            // InternalNpl.g:3975:1: ( 'English' )
            {
             before(grammarAccess.getLanguageAccess().getValueEnglishKeyword_0_0()); 
            // InternalNpl.g:3976:1: ( 'English' )
            // InternalNpl.g:3977:1: 'English'
            {
             before(grammarAccess.getLanguageAccess().getValueEnglishKeyword_0_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalNpl.g:3992:1: rule__Language__ValueAssignment_1 : ( ( 'German' ) ) ;
    public final void rule__Language__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3996:1: ( ( ( 'German' ) ) )
            // InternalNpl.g:3997:1: ( ( 'German' ) )
            {
            // InternalNpl.g:3997:1: ( ( 'German' ) )
            // InternalNpl.g:3998:1: ( 'German' )
            {
             before(grammarAccess.getLanguageAccess().getValueGermanKeyword_1_0()); 
            // InternalNpl.g:3999:1: ( 'German' )
            // InternalNpl.g:4000:1: 'German'
            {
             before(grammarAccess.getLanguageAccess().getValueGermanKeyword_1_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalNpl.g:4015:1: rule__Price__ValueAssignment_1 : ( ruleFloat ) ;
    public final void rule__Price__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:4019:1: ( ( ruleFloat ) )
            // InternalNpl.g:4020:1: ( ruleFloat )
            {
            // InternalNpl.g:4020:1: ( ruleFloat )
            // InternalNpl.g:4021:1: ruleFloat
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
    // InternalNpl.g:4030:1: rule__Price__CurrencyAssignment_2 : ( ruleCurrency ) ;
    public final void rule__Price__CurrencyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:4034:1: ( ( ruleCurrency ) )
            // InternalNpl.g:4035:1: ( ruleCurrency )
            {
            // InternalNpl.g:4035:1: ( ruleCurrency )
            // InternalNpl.g:4036:1: ruleCurrency
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
    // InternalNpl.g:4045:1: rule__Currency__ValueAssignment_0 : ( ( 'Euro' ) ) ;
    public final void rule__Currency__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:4049:1: ( ( ( 'Euro' ) ) )
            // InternalNpl.g:4050:1: ( ( 'Euro' ) )
            {
            // InternalNpl.g:4050:1: ( ( 'Euro' ) )
            // InternalNpl.g:4051:1: ( 'Euro' )
            {
             before(grammarAccess.getCurrencyAccess().getValueEuroKeyword_0_0()); 
            // InternalNpl.g:4052:1: ( 'Euro' )
            // InternalNpl.g:4053:1: 'Euro'
            {
             before(grammarAccess.getCurrencyAccess().getValueEuroKeyword_0_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalNpl.g:4068:1: rule__Currency__ValueAssignment_1 : ( ( 'EUR' ) ) ;
    public final void rule__Currency__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:4072:1: ( ( ( 'EUR' ) ) )
            // InternalNpl.g:4073:1: ( ( 'EUR' ) )
            {
            // InternalNpl.g:4073:1: ( ( 'EUR' ) )
            // InternalNpl.g:4074:1: ( 'EUR' )
            {
             before(grammarAccess.getCurrencyAccess().getValueEURKeyword_1_0()); 
            // InternalNpl.g:4075:1: ( 'EUR' )
            // InternalNpl.g:4076:1: 'EUR'
            {
             before(grammarAccess.getCurrencyAccess().getValueEURKeyword_1_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalNpl.g:4091:1: rule__Currency__ValueAssignment_2 : ( ( '\\u20AC' ) ) ;
    public final void rule__Currency__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:4095:1: ( ( ( '\\u20AC' ) ) )
            // InternalNpl.g:4096:1: ( ( '\\u20AC' ) )
            {
            // InternalNpl.g:4096:1: ( ( '\\u20AC' ) )
            // InternalNpl.g:4097:1: ( '\\u20AC' )
            {
             before(grammarAccess.getCurrencyAccess().getValueEuroSignKeyword_2_0()); 
            // InternalNpl.g:4098:1: ( '\\u20AC' )
            // InternalNpl.g:4099:1: '\\u20AC'
            {
             before(grammarAccess.getCurrencyAccess().getValueEuroSignKeyword_2_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalNpl.g:4114:1: rule__Currency__ValueAssignment_3 : ( ( 'Dollar' ) ) ;
    public final void rule__Currency__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:4118:1: ( ( ( 'Dollar' ) ) )
            // InternalNpl.g:4119:1: ( ( 'Dollar' ) )
            {
            // InternalNpl.g:4119:1: ( ( 'Dollar' ) )
            // InternalNpl.g:4120:1: ( 'Dollar' )
            {
             before(grammarAccess.getCurrencyAccess().getValueDollarKeyword_3_0()); 
            // InternalNpl.g:4121:1: ( 'Dollar' )
            // InternalNpl.g:4122:1: 'Dollar'
            {
             before(grammarAccess.getCurrencyAccess().getValueDollarKeyword_3_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalNpl.g:4137:1: rule__Currency__ValueAssignment_4 : ( ( 'USD' ) ) ;
    public final void rule__Currency__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:4141:1: ( ( ( 'USD' ) ) )
            // InternalNpl.g:4142:1: ( ( 'USD' ) )
            {
            // InternalNpl.g:4142:1: ( ( 'USD' ) )
            // InternalNpl.g:4143:1: ( 'USD' )
            {
             before(grammarAccess.getCurrencyAccess().getValueUSDKeyword_4_0()); 
            // InternalNpl.g:4144:1: ( 'USD' )
            // InternalNpl.g:4145:1: 'USD'
            {
             before(grammarAccess.getCurrencyAccess().getValueUSDKeyword_4_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalNpl.g:4160:1: rule__Currency__ValueAssignment_5 : ( ( '$' ) ) ;
    public final void rule__Currency__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:4164:1: ( ( ( '$' ) ) )
            // InternalNpl.g:4165:1: ( ( '$' ) )
            {
            // InternalNpl.g:4165:1: ( ( '$' ) )
            // InternalNpl.g:4166:1: ( '$' )
            {
             before(grammarAccess.getCurrencyAccess().getValueDollarSignKeyword_5_0()); 
            // InternalNpl.g:4167:1: ( '$' )
            // InternalNpl.g:4168:1: '$'
            {
             before(grammarAccess.getCurrencyAccess().getValueDollarSignKeyword_5_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalNpl.g:4183:1: rule__Topic__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Topic__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:4187:1: ( ( RULE_ID ) )
            // InternalNpl.g:4188:1: ( RULE_ID )
            {
            // InternalNpl.g:4188:1: ( RULE_ID )
            // InternalNpl.g:4189:1: RULE_ID
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


    // $ANTLR start "rule__Topic__TitleAssignment_3"
    // InternalNpl.g:4198:1: rule__Topic__TitleAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Topic__TitleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:4202:1: ( ( RULE_STRING ) )
            // InternalNpl.g:4203:1: ( RULE_STRING )
            {
            // InternalNpl.g:4203:1: ( RULE_STRING )
            // InternalNpl.g:4204:1: RULE_STRING
            {
             before(grammarAccess.getTopicAccess().getTitleSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTopicAccess().getTitleSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Topic__TitleAssignment_3"


    // $ANTLR start "rule__Topic__TagsAssignment_5"
    // InternalNpl.g:4213:1: rule__Topic__TagsAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Topic__TagsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:4217:1: ( ( RULE_STRING ) )
            // InternalNpl.g:4218:1: ( RULE_STRING )
            {
            // InternalNpl.g:4218:1: ( RULE_STRING )
            // InternalNpl.g:4219:1: RULE_STRING
            {
             before(grammarAccess.getTopicAccess().getTagsSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTopicAccess().getTagsSTRINGTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Topic__TagsAssignment_5"


    // $ANTLR start "rule__Topic__TagsAssignment_6_1"
    // InternalNpl.g:4228:1: rule__Topic__TagsAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__Topic__TagsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:4232:1: ( ( RULE_STRING ) )
            // InternalNpl.g:4233:1: ( RULE_STRING )
            {
            // InternalNpl.g:4233:1: ( RULE_STRING )
            // InternalNpl.g:4234:1: RULE_STRING
            {
             before(grammarAccess.getTopicAccess().getTagsSTRINGTerminalRuleCall_6_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTopicAccess().getTagsSTRINGTerminalRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Topic__TagsAssignment_6_1"


    // $ANTLR start "rule__Pair__TypeAssignment_0"
    // InternalNpl.g:4243:1: rule__Pair__TypeAssignment_0 : ( ruleFeedType ) ;
    public final void rule__Pair__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:4247:1: ( ( ruleFeedType ) )
            // InternalNpl.g:4248:1: ( ruleFeedType )
            {
            // InternalNpl.g:4248:1: ( ruleFeedType )
            // InternalNpl.g:4249:1: ruleFeedType
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
    // InternalNpl.g:4258:1: rule__Pair__KeyAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Pair__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:4262:1: ( ( RULE_STRING ) )
            // InternalNpl.g:4263:1: ( RULE_STRING )
            {
            // InternalNpl.g:4263:1: ( RULE_STRING )
            // InternalNpl.g:4264:1: RULE_STRING
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
    // InternalNpl.g:4273:1: rule__Pair__ValueAssignment_3 : ( RULE_URL ) ;
    public final void rule__Pair__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:4277:1: ( ( RULE_URL ) )
            // InternalNpl.g:4278:1: ( RULE_URL )
            {
            // InternalNpl.g:4278:1: ( RULE_URL )
            // InternalNpl.g:4279:1: RULE_URL
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
    static final String dfa_3s = "\1\42\17\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17";
    static final String dfa_5s = "\1\0\17\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\uffff\1\2\1\uffff\1\17\1\3\1\4\1\5\1\6\1\7\1\uffff\1\10\1\11\1\12\1\13\1\uffff\1\14\1\15\1\16",
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
            return "2902:3: ( ({...}? => ( ( ( rule__Declaration__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_8__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_9__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_10__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_11__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_12__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_13__0 ) ) ) ) | ({...}? => ( ( ( '}' ) ) ) ) )";
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

                        else if ( LA12_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA12_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA12_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA12_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA12_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA12_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA12_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA12_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA12_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA12_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( LA12_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11) ) {s = 12;}

                        else if ( LA12_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12) ) {s = 13;}

                        else if ( LA12_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13) ) {s = 14;}

                        else if ( LA12_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14) ) {s = 15;}

                         
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
    static final String dfa_9s = "\1\42\20\uffff";
    static final String dfa_10s = "\1\uffff\17\1\1\2";
    static final String dfa_11s = "\1\0\20\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\1\uffff\1\2\1\uffff\1\17\1\3\1\4\1\5\1\6\1\7\1\uffff\1\10\1\11\1\12\1\13\1\uffff\1\14\1\15\1\16",
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
            return "3176:2: ( rule__Declaration__UnorderedGroup__1 )?";
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

                        else if ( LA13_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA13_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA13_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA13_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA13_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA13_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA13_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA13_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA13_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA13_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( LA13_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11) ) {s = 12;}

                        else if ( LA13_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12) ) {s = 13;}

                        else if ( LA13_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13) ) {s = 14;}

                        else if ( LA13_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14) ) {s = 15;}

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
            return "3189:2: ( rule__Declaration__UnorderedGroup__2 )?";
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

                        else if ( LA14_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA14_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA14_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA14_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA14_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA14_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA14_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA14_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA14_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA14_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( LA14_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11) ) {s = 12;}

                        else if ( LA14_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12) ) {s = 13;}

                        else if ( LA14_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13) ) {s = 14;}

                        else if ( LA14_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14) ) {s = 15;}

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
            return "3202:2: ( rule__Declaration__UnorderedGroup__3 )?";
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

                        else if ( LA15_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA15_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA15_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA15_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA15_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA15_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA15_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA15_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA15_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA15_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( LA15_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11) ) {s = 12;}

                        else if ( LA15_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12) ) {s = 13;}

                        else if ( LA15_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13) ) {s = 14;}

                        else if ( LA15_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14) ) {s = 15;}

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
            return "3215:2: ( rule__Declaration__UnorderedGroup__4 )?";
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

                        else if ( LA16_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA16_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA16_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA16_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA16_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA16_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA16_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA16_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA16_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA16_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( LA16_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11) ) {s = 12;}

                        else if ( LA16_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12) ) {s = 13;}

                        else if ( LA16_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13) ) {s = 14;}

                        else if ( LA16_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14) ) {s = 15;}

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
            return "3228:2: ( rule__Declaration__UnorderedGroup__5 )?";
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

                        else if ( LA17_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA17_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA17_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA17_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA17_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA17_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA17_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA17_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA17_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA17_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( LA17_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11) ) {s = 12;}

                        else if ( LA17_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12) ) {s = 13;}

                        else if ( LA17_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13) ) {s = 14;}

                        else if ( LA17_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14) ) {s = 15;}

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
            return "3241:2: ( rule__Declaration__UnorderedGroup__6 )?";
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

                        else if ( LA18_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA18_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA18_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA18_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA18_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA18_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA18_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA18_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA18_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA18_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( LA18_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11) ) {s = 12;}

                        else if ( LA18_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12) ) {s = 13;}

                        else if ( LA18_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13) ) {s = 14;}

                        else if ( LA18_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14) ) {s = 15;}

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
            return "3254:2: ( rule__Declaration__UnorderedGroup__7 )?";
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

                        else if ( LA19_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA19_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA19_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA19_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA19_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA19_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA19_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA19_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA19_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA19_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( LA19_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11) ) {s = 12;}

                        else if ( LA19_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12) ) {s = 13;}

                        else if ( LA19_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13) ) {s = 14;}

                        else if ( LA19_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14) ) {s = 15;}

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
            return "3267:2: ( rule__Declaration__UnorderedGroup__8 )?";
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

                        else if ( LA20_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA20_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA20_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA20_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA20_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA20_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA20_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA20_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA20_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA20_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( LA20_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11) ) {s = 12;}

                        else if ( LA20_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12) ) {s = 13;}

                        else if ( LA20_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13) ) {s = 14;}

                        else if ( LA20_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14) ) {s = 15;}

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
            return "3280:2: ( rule__Declaration__UnorderedGroup__9 )?";
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

                        else if ( LA21_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA21_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA21_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA21_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA21_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA21_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA21_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA21_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA21_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA21_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( LA21_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11) ) {s = 12;}

                        else if ( LA21_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12) ) {s = 13;}

                        else if ( LA21_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13) ) {s = 14;}

                        else if ( LA21_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14) ) {s = 15;}

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
            return "3293:2: ( rule__Declaration__UnorderedGroup__10 )?";
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

                        else if ( LA22_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA22_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA22_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA22_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA22_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA22_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA22_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA22_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA22_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA22_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( LA22_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11) ) {s = 12;}

                        else if ( LA22_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12) ) {s = 13;}

                        else if ( LA22_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13) ) {s = 14;}

                        else if ( LA22_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14) ) {s = 15;}

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
            return "3306:2: ( rule__Declaration__UnorderedGroup__11 )?";
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

                        else if ( LA23_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA23_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA23_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA23_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA23_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA23_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA23_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA23_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA23_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA23_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( LA23_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11) ) {s = 12;}

                        else if ( LA23_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12) ) {s = 13;}

                        else if ( LA23_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13) ) {s = 14;}

                        else if ( LA23_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14) ) {s = 15;}

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
            return "3319:2: ( rule__Declaration__UnorderedGroup__12 )?";
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

                        else if ( LA24_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA24_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA24_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA24_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA24_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA24_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA24_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA24_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA24_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA24_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( LA24_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11) ) {s = 12;}

                        else if ( LA24_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12) ) {s = 13;}

                        else if ( LA24_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13) ) {s = 14;}

                        else if ( LA24_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14) ) {s = 15;}

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
            return "3332:2: ( rule__Declaration__UnorderedGroup__13 )?";
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

                        else if ( LA25_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA25_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA25_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA25_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA25_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA25_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA25_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA25_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA25_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA25_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( LA25_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11) ) {s = 12;}

                        else if ( LA25_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12) ) {s = 13;}

                        else if ( LA25_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13) ) {s = 14;}

                        else if ( LA25_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14) ) {s = 15;}

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
            return "3345:2: ( rule__Declaration__UnorderedGroup__14 )?";
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

                        else if ( LA26_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA26_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA26_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA26_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA26_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA26_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA26_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA26_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA26_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA26_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( LA26_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11) ) {s = 12;}

                        else if ( LA26_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12) ) {s = 13;}

                        else if ( LA26_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13) ) {s = 14;}

                        else if ( LA26_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14) ) {s = 15;}

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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000010C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0003F80000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000070000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x03F0000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002000100000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000077BF50002L});

}
