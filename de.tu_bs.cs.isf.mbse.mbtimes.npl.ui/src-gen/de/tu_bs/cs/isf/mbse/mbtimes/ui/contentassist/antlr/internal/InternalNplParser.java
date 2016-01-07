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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_URL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "','", "'RSS'", "'Atom'", "'newspaper'", "'{'", "'feed links'", "'}'", "'topics'", "'optional: date'", "'optional: location'", "'optional: price'", "'optional: volume'", "'no.'", "'optional: language'", "'format'", "'number of articles per topic'", "'number of words per article'", "'-'", "'optional: number of images per article'", "'number of columns'", "'font size'", "'topic'", "', '", "'<'", "'>'", "'recrawl'", "'small'", "'medium'", "'large'", "'DIN A6'", "'DIN A5'", "'DIN A4'", "'DIN A3'", "'DIN A2'", "'DIN A1'", "'DIN A0'", "'English'", "'German'", "'EUR'", "'DOLLAR'"
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


    // $ANTLR start "entryRuleTopicTag"
    // InternalNpl.g:312:1: entryRuleTopicTag : ruleTopicTag EOF ;
    public final void entryRuleTopicTag() throws RecognitionException {
        try {
            // InternalNpl.g:313:1: ( ruleTopicTag EOF )
            // InternalNpl.g:314:1: ruleTopicTag EOF
            {
             before(grammarAccess.getTopicTagRule()); 
            pushFollow(FOLLOW_1);
            ruleTopicTag();

            state._fsp--;

             after(grammarAccess.getTopicTagRule()); 
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
    // $ANTLR end "entryRuleTopicTag"


    // $ANTLR start "ruleTopicTag"
    // InternalNpl.g:321:1: ruleTopicTag : ( ( rule__TopicTag__ValueAssignment ) ) ;
    public final void ruleTopicTag() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:325:2: ( ( ( rule__TopicTag__ValueAssignment ) ) )
            // InternalNpl.g:326:1: ( ( rule__TopicTag__ValueAssignment ) )
            {
            // InternalNpl.g:326:1: ( ( rule__TopicTag__ValueAssignment ) )
            // InternalNpl.g:327:1: ( rule__TopicTag__ValueAssignment )
            {
             before(grammarAccess.getTopicTagAccess().getValueAssignment()); 
            // InternalNpl.g:328:1: ( rule__TopicTag__ValueAssignment )
            // InternalNpl.g:328:2: rule__TopicTag__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__TopicTag__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTopicTagAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTopicTag"


    // $ANTLR start "entryRulePair"
    // InternalNpl.g:340:1: entryRulePair : rulePair EOF ;
    public final void entryRulePair() throws RecognitionException {
        try {
            // InternalNpl.g:341:1: ( rulePair EOF )
            // InternalNpl.g:342:1: rulePair EOF
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
    // InternalNpl.g:349:1: rulePair : ( ( rule__Pair__Group__0 ) ) ;
    public final void rulePair() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:353:2: ( ( ( rule__Pair__Group__0 ) ) )
            // InternalNpl.g:354:1: ( ( rule__Pair__Group__0 ) )
            {
            // InternalNpl.g:354:1: ( ( rule__Pair__Group__0 ) )
            // InternalNpl.g:355:1: ( rule__Pair__Group__0 )
            {
             before(grammarAccess.getPairAccess().getGroup()); 
            // InternalNpl.g:356:1: ( rule__Pair__Group__0 )
            // InternalNpl.g:356:2: rule__Pair__Group__0
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
    // InternalNpl.g:368:1: entryRuleFloat : ruleFloat EOF ;
    public final void entryRuleFloat() throws RecognitionException {
        try {
            // InternalNpl.g:369:1: ( ruleFloat EOF )
            // InternalNpl.g:370:1: ruleFloat EOF
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
    // InternalNpl.g:377:1: ruleFloat : ( ( rule__Float__Group__0 ) ) ;
    public final void ruleFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:381:2: ( ( ( rule__Float__Group__0 ) ) )
            // InternalNpl.g:382:1: ( ( rule__Float__Group__0 ) )
            {
            // InternalNpl.g:382:1: ( ( rule__Float__Group__0 ) )
            // InternalNpl.g:383:1: ( rule__Float__Group__0 )
            {
             before(grammarAccess.getFloatAccess().getGroup()); 
            // InternalNpl.g:384:1: ( rule__Float__Group__0 )
            // InternalNpl.g:384:2: rule__Float__Group__0
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
    // InternalNpl.g:396:1: entryRuleFeedType : ruleFeedType EOF ;
    public final void entryRuleFeedType() throws RecognitionException {
        try {
            // InternalNpl.g:397:1: ( ruleFeedType EOF )
            // InternalNpl.g:398:1: ruleFeedType EOF
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
    // InternalNpl.g:405:1: ruleFeedType : ( ( rule__FeedType__Alternatives ) ) ;
    public final void ruleFeedType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:409:2: ( ( ( rule__FeedType__Alternatives ) ) )
            // InternalNpl.g:410:1: ( ( rule__FeedType__Alternatives ) )
            {
            // InternalNpl.g:410:1: ( ( rule__FeedType__Alternatives ) )
            // InternalNpl.g:411:1: ( rule__FeedType__Alternatives )
            {
             before(grammarAccess.getFeedTypeAccess().getAlternatives()); 
            // InternalNpl.g:412:1: ( rule__FeedType__Alternatives )
            // InternalNpl.g:412:2: rule__FeedType__Alternatives
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
    // InternalNpl.g:424:1: rule__FontSize__Alternatives : ( ( ( rule__FontSize__ValueAssignment_0 ) ) | ( ( rule__FontSize__ValueAssignment_1 ) ) | ( ( rule__FontSize__ValueAssignment_2 ) ) );
    public final void rule__FontSize__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:428:1: ( ( ( rule__FontSize__ValueAssignment_0 ) ) | ( ( rule__FontSize__ValueAssignment_1 ) ) | ( ( rule__FontSize__ValueAssignment_2 ) ) )
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
                    // InternalNpl.g:429:1: ( ( rule__FontSize__ValueAssignment_0 ) )
                    {
                    // InternalNpl.g:429:1: ( ( rule__FontSize__ValueAssignment_0 ) )
                    // InternalNpl.g:430:1: ( rule__FontSize__ValueAssignment_0 )
                    {
                     before(grammarAccess.getFontSizeAccess().getValueAssignment_0()); 
                    // InternalNpl.g:431:1: ( rule__FontSize__ValueAssignment_0 )
                    // InternalNpl.g:431:2: rule__FontSize__ValueAssignment_0
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
                    // InternalNpl.g:435:6: ( ( rule__FontSize__ValueAssignment_1 ) )
                    {
                    // InternalNpl.g:435:6: ( ( rule__FontSize__ValueAssignment_1 ) )
                    // InternalNpl.g:436:1: ( rule__FontSize__ValueAssignment_1 )
                    {
                     before(grammarAccess.getFontSizeAccess().getValueAssignment_1()); 
                    // InternalNpl.g:437:1: ( rule__FontSize__ValueAssignment_1 )
                    // InternalNpl.g:437:2: rule__FontSize__ValueAssignment_1
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
                    // InternalNpl.g:441:6: ( ( rule__FontSize__ValueAssignment_2 ) )
                    {
                    // InternalNpl.g:441:6: ( ( rule__FontSize__ValueAssignment_2 ) )
                    // InternalNpl.g:442:1: ( rule__FontSize__ValueAssignment_2 )
                    {
                     before(grammarAccess.getFontSizeAccess().getValueAssignment_2()); 
                    // InternalNpl.g:443:1: ( rule__FontSize__ValueAssignment_2 )
                    // InternalNpl.g:443:2: rule__FontSize__ValueAssignment_2
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
    // InternalNpl.g:452:1: rule__Format__Alternatives : ( ( ( rule__Format__ValueAssignment_0 ) ) | ( ( rule__Format__ValueAssignment_1 ) ) | ( ( rule__Format__ValueAssignment_2 ) ) | ( ( rule__Format__ValueAssignment_3 ) ) | ( ( rule__Format__ValueAssignment_4 ) ) | ( ( rule__Format__ValueAssignment_5 ) ) | ( ( rule__Format__ValueAssignment_6 ) ) );
    public final void rule__Format__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:456:1: ( ( ( rule__Format__ValueAssignment_0 ) ) | ( ( rule__Format__ValueAssignment_1 ) ) | ( ( rule__Format__ValueAssignment_2 ) ) | ( ( rule__Format__ValueAssignment_3 ) ) | ( ( rule__Format__ValueAssignment_4 ) ) | ( ( rule__Format__ValueAssignment_5 ) ) | ( ( rule__Format__ValueAssignment_6 ) ) )
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
                    // InternalNpl.g:457:1: ( ( rule__Format__ValueAssignment_0 ) )
                    {
                    // InternalNpl.g:457:1: ( ( rule__Format__ValueAssignment_0 ) )
                    // InternalNpl.g:458:1: ( rule__Format__ValueAssignment_0 )
                    {
                     before(grammarAccess.getFormatAccess().getValueAssignment_0()); 
                    // InternalNpl.g:459:1: ( rule__Format__ValueAssignment_0 )
                    // InternalNpl.g:459:2: rule__Format__ValueAssignment_0
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
                    // InternalNpl.g:463:6: ( ( rule__Format__ValueAssignment_1 ) )
                    {
                    // InternalNpl.g:463:6: ( ( rule__Format__ValueAssignment_1 ) )
                    // InternalNpl.g:464:1: ( rule__Format__ValueAssignment_1 )
                    {
                     before(grammarAccess.getFormatAccess().getValueAssignment_1()); 
                    // InternalNpl.g:465:1: ( rule__Format__ValueAssignment_1 )
                    // InternalNpl.g:465:2: rule__Format__ValueAssignment_1
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
                    // InternalNpl.g:469:6: ( ( rule__Format__ValueAssignment_2 ) )
                    {
                    // InternalNpl.g:469:6: ( ( rule__Format__ValueAssignment_2 ) )
                    // InternalNpl.g:470:1: ( rule__Format__ValueAssignment_2 )
                    {
                     before(grammarAccess.getFormatAccess().getValueAssignment_2()); 
                    // InternalNpl.g:471:1: ( rule__Format__ValueAssignment_2 )
                    // InternalNpl.g:471:2: rule__Format__ValueAssignment_2
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
                    // InternalNpl.g:475:6: ( ( rule__Format__ValueAssignment_3 ) )
                    {
                    // InternalNpl.g:475:6: ( ( rule__Format__ValueAssignment_3 ) )
                    // InternalNpl.g:476:1: ( rule__Format__ValueAssignment_3 )
                    {
                     before(grammarAccess.getFormatAccess().getValueAssignment_3()); 
                    // InternalNpl.g:477:1: ( rule__Format__ValueAssignment_3 )
                    // InternalNpl.g:477:2: rule__Format__ValueAssignment_3
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
                    // InternalNpl.g:481:6: ( ( rule__Format__ValueAssignment_4 ) )
                    {
                    // InternalNpl.g:481:6: ( ( rule__Format__ValueAssignment_4 ) )
                    // InternalNpl.g:482:1: ( rule__Format__ValueAssignment_4 )
                    {
                     before(grammarAccess.getFormatAccess().getValueAssignment_4()); 
                    // InternalNpl.g:483:1: ( rule__Format__ValueAssignment_4 )
                    // InternalNpl.g:483:2: rule__Format__ValueAssignment_4
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
                    // InternalNpl.g:487:6: ( ( rule__Format__ValueAssignment_5 ) )
                    {
                    // InternalNpl.g:487:6: ( ( rule__Format__ValueAssignment_5 ) )
                    // InternalNpl.g:488:1: ( rule__Format__ValueAssignment_5 )
                    {
                     before(grammarAccess.getFormatAccess().getValueAssignment_5()); 
                    // InternalNpl.g:489:1: ( rule__Format__ValueAssignment_5 )
                    // InternalNpl.g:489:2: rule__Format__ValueAssignment_5
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
                    // InternalNpl.g:493:6: ( ( rule__Format__ValueAssignment_6 ) )
                    {
                    // InternalNpl.g:493:6: ( ( rule__Format__ValueAssignment_6 ) )
                    // InternalNpl.g:494:1: ( rule__Format__ValueAssignment_6 )
                    {
                     before(grammarAccess.getFormatAccess().getValueAssignment_6()); 
                    // InternalNpl.g:495:1: ( rule__Format__ValueAssignment_6 )
                    // InternalNpl.g:495:2: rule__Format__ValueAssignment_6
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
    // InternalNpl.g:504:1: rule__Language__Alternatives : ( ( ( rule__Language__ValueAssignment_0 ) ) | ( ( rule__Language__ValueAssignment_1 ) ) );
    public final void rule__Language__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:508:1: ( ( ( rule__Language__ValueAssignment_0 ) ) | ( ( rule__Language__ValueAssignment_1 ) ) )
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
                    // InternalNpl.g:509:1: ( ( rule__Language__ValueAssignment_0 ) )
                    {
                    // InternalNpl.g:509:1: ( ( rule__Language__ValueAssignment_0 ) )
                    // InternalNpl.g:510:1: ( rule__Language__ValueAssignment_0 )
                    {
                     before(grammarAccess.getLanguageAccess().getValueAssignment_0()); 
                    // InternalNpl.g:511:1: ( rule__Language__ValueAssignment_0 )
                    // InternalNpl.g:511:2: rule__Language__ValueAssignment_0
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
                    // InternalNpl.g:515:6: ( ( rule__Language__ValueAssignment_1 ) )
                    {
                    // InternalNpl.g:515:6: ( ( rule__Language__ValueAssignment_1 ) )
                    // InternalNpl.g:516:1: ( rule__Language__ValueAssignment_1 )
                    {
                     before(grammarAccess.getLanguageAccess().getValueAssignment_1()); 
                    // InternalNpl.g:517:1: ( rule__Language__ValueAssignment_1 )
                    // InternalNpl.g:517:2: rule__Language__ValueAssignment_1
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
    // InternalNpl.g:526:1: rule__Currency__Alternatives : ( ( ( rule__Currency__ValueAssignment_0 ) ) | ( ( rule__Currency__ValueAssignment_1 ) ) );
    public final void rule__Currency__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:530:1: ( ( ( rule__Currency__ValueAssignment_0 ) ) | ( ( rule__Currency__ValueAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==51) ) {
                alt4=1;
            }
            else if ( (LA4_0==52) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalNpl.g:531:1: ( ( rule__Currency__ValueAssignment_0 ) )
                    {
                    // InternalNpl.g:531:1: ( ( rule__Currency__ValueAssignment_0 ) )
                    // InternalNpl.g:532:1: ( rule__Currency__ValueAssignment_0 )
                    {
                     before(grammarAccess.getCurrencyAccess().getValueAssignment_0()); 
                    // InternalNpl.g:533:1: ( rule__Currency__ValueAssignment_0 )
                    // InternalNpl.g:533:2: rule__Currency__ValueAssignment_0
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
                    // InternalNpl.g:537:6: ( ( rule__Currency__ValueAssignment_1 ) )
                    {
                    // InternalNpl.g:537:6: ( ( rule__Currency__ValueAssignment_1 ) )
                    // InternalNpl.g:538:1: ( rule__Currency__ValueAssignment_1 )
                    {
                     before(grammarAccess.getCurrencyAccess().getValueAssignment_1()); 
                    // InternalNpl.g:539:1: ( rule__Currency__ValueAssignment_1 )
                    // InternalNpl.g:539:2: rule__Currency__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Currency__ValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCurrencyAccess().getValueAssignment_1()); 

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
    // InternalNpl.g:548:1: rule__Float__Alternatives_1_0 : ( ( '.' ) | ( ',' ) );
    public final void rule__Float__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:552:1: ( ( '.' ) | ( ',' ) )
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
                    // InternalNpl.g:553:1: ( '.' )
                    {
                    // InternalNpl.g:553:1: ( '.' )
                    // InternalNpl.g:554:1: '.'
                    {
                     before(grammarAccess.getFloatAccess().getFullStopKeyword_1_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getFloatAccess().getFullStopKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalNpl.g:561:6: ( ',' )
                    {
                    // InternalNpl.g:561:6: ( ',' )
                    // InternalNpl.g:562:1: ','
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
    // InternalNpl.g:574:1: rule__FeedType__Alternatives : ( ( 'RSS' ) | ( 'Atom' ) );
    public final void rule__FeedType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:578:1: ( ( 'RSS' ) | ( 'Atom' ) )
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
                    // InternalNpl.g:579:1: ( 'RSS' )
                    {
                    // InternalNpl.g:579:1: ( 'RSS' )
                    // InternalNpl.g:580:1: 'RSS'
                    {
                     before(grammarAccess.getFeedTypeAccess().getRSSKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getFeedTypeAccess().getRSSKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalNpl.g:587:6: ( 'Atom' )
                    {
                    // InternalNpl.g:587:6: ( 'Atom' )
                    // InternalNpl.g:588:1: 'Atom'
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
    // InternalNpl.g:602:1: rule__Declaration__Group_0__0 : rule__Declaration__Group_0__0__Impl rule__Declaration__Group_0__1 ;
    public final void rule__Declaration__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:606:1: ( rule__Declaration__Group_0__0__Impl rule__Declaration__Group_0__1 )
            // InternalNpl.g:607:2: rule__Declaration__Group_0__0__Impl rule__Declaration__Group_0__1
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
    // InternalNpl.g:614:1: rule__Declaration__Group_0__0__Impl : ( 'newspaper' ) ;
    public final void rule__Declaration__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:618:1: ( ( 'newspaper' ) )
            // InternalNpl.g:619:1: ( 'newspaper' )
            {
            // InternalNpl.g:619:1: ( 'newspaper' )
            // InternalNpl.g:620:1: 'newspaper'
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
    // InternalNpl.g:633:1: rule__Declaration__Group_0__1 : rule__Declaration__Group_0__1__Impl rule__Declaration__Group_0__2 ;
    public final void rule__Declaration__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:637:1: ( rule__Declaration__Group_0__1__Impl rule__Declaration__Group_0__2 )
            // InternalNpl.g:638:2: rule__Declaration__Group_0__1__Impl rule__Declaration__Group_0__2
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
    // InternalNpl.g:645:1: rule__Declaration__Group_0__1__Impl : ( ( rule__Declaration__NameAssignment_0_1 ) ) ;
    public final void rule__Declaration__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:649:1: ( ( ( rule__Declaration__NameAssignment_0_1 ) ) )
            // InternalNpl.g:650:1: ( ( rule__Declaration__NameAssignment_0_1 ) )
            {
            // InternalNpl.g:650:1: ( ( rule__Declaration__NameAssignment_0_1 ) )
            // InternalNpl.g:651:1: ( rule__Declaration__NameAssignment_0_1 )
            {
             before(grammarAccess.getDeclarationAccess().getNameAssignment_0_1()); 
            // InternalNpl.g:652:1: ( rule__Declaration__NameAssignment_0_1 )
            // InternalNpl.g:652:2: rule__Declaration__NameAssignment_0_1
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
    // InternalNpl.g:662:1: rule__Declaration__Group_0__2 : rule__Declaration__Group_0__2__Impl ;
    public final void rule__Declaration__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:666:1: ( rule__Declaration__Group_0__2__Impl )
            // InternalNpl.g:667:2: rule__Declaration__Group_0__2__Impl
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
    // InternalNpl.g:673:1: rule__Declaration__Group_0__2__Impl : ( '{' ) ;
    public final void rule__Declaration__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:677:1: ( ( '{' ) )
            // InternalNpl.g:678:1: ( '{' )
            {
            // InternalNpl.g:678:1: ( '{' )
            // InternalNpl.g:679:1: '{'
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
    // InternalNpl.g:698:1: rule__Declaration__Group_1__0 : rule__Declaration__Group_1__0__Impl rule__Declaration__Group_1__1 ;
    public final void rule__Declaration__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:702:1: ( rule__Declaration__Group_1__0__Impl rule__Declaration__Group_1__1 )
            // InternalNpl.g:703:2: rule__Declaration__Group_1__0__Impl rule__Declaration__Group_1__1
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
    // InternalNpl.g:710:1: rule__Declaration__Group_1__0__Impl : ( ( rule__Declaration__RecrawlAssignment_1_0 ) ) ;
    public final void rule__Declaration__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:714:1: ( ( ( rule__Declaration__RecrawlAssignment_1_0 ) ) )
            // InternalNpl.g:715:1: ( ( rule__Declaration__RecrawlAssignment_1_0 ) )
            {
            // InternalNpl.g:715:1: ( ( rule__Declaration__RecrawlAssignment_1_0 ) )
            // InternalNpl.g:716:1: ( rule__Declaration__RecrawlAssignment_1_0 )
            {
             before(grammarAccess.getDeclarationAccess().getRecrawlAssignment_1_0()); 
            // InternalNpl.g:717:1: ( rule__Declaration__RecrawlAssignment_1_0 )
            // InternalNpl.g:717:2: rule__Declaration__RecrawlAssignment_1_0
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
    // InternalNpl.g:727:1: rule__Declaration__Group_1__1 : rule__Declaration__Group_1__1__Impl rule__Declaration__Group_1__2 ;
    public final void rule__Declaration__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:731:1: ( rule__Declaration__Group_1__1__Impl rule__Declaration__Group_1__2 )
            // InternalNpl.g:732:2: rule__Declaration__Group_1__1__Impl rule__Declaration__Group_1__2
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
    // InternalNpl.g:739:1: rule__Declaration__Group_1__1__Impl : ( 'feed links' ) ;
    public final void rule__Declaration__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:743:1: ( ( 'feed links' ) )
            // InternalNpl.g:744:1: ( 'feed links' )
            {
            // InternalNpl.g:744:1: ( 'feed links' )
            // InternalNpl.g:745:1: 'feed links'
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
    // InternalNpl.g:758:1: rule__Declaration__Group_1__2 : rule__Declaration__Group_1__2__Impl rule__Declaration__Group_1__3 ;
    public final void rule__Declaration__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:762:1: ( rule__Declaration__Group_1__2__Impl rule__Declaration__Group_1__3 )
            // InternalNpl.g:763:2: rule__Declaration__Group_1__2__Impl rule__Declaration__Group_1__3
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
    // InternalNpl.g:770:1: rule__Declaration__Group_1__2__Impl : ( '{' ) ;
    public final void rule__Declaration__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:774:1: ( ( '{' ) )
            // InternalNpl.g:775:1: ( '{' )
            {
            // InternalNpl.g:775:1: ( '{' )
            // InternalNpl.g:776:1: '{'
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
    // InternalNpl.g:789:1: rule__Declaration__Group_1__3 : rule__Declaration__Group_1__3__Impl rule__Declaration__Group_1__4 ;
    public final void rule__Declaration__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:793:1: ( rule__Declaration__Group_1__3__Impl rule__Declaration__Group_1__4 )
            // InternalNpl.g:794:2: rule__Declaration__Group_1__3__Impl rule__Declaration__Group_1__4
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
    // InternalNpl.g:801:1: rule__Declaration__Group_1__3__Impl : ( ( rule__Declaration__FeedlinksAssignment_1_3 ) ) ;
    public final void rule__Declaration__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:805:1: ( ( ( rule__Declaration__FeedlinksAssignment_1_3 ) ) )
            // InternalNpl.g:806:1: ( ( rule__Declaration__FeedlinksAssignment_1_3 ) )
            {
            // InternalNpl.g:806:1: ( ( rule__Declaration__FeedlinksAssignment_1_3 ) )
            // InternalNpl.g:807:1: ( rule__Declaration__FeedlinksAssignment_1_3 )
            {
             before(grammarAccess.getDeclarationAccess().getFeedlinksAssignment_1_3()); 
            // InternalNpl.g:808:1: ( rule__Declaration__FeedlinksAssignment_1_3 )
            // InternalNpl.g:808:2: rule__Declaration__FeedlinksAssignment_1_3
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
    // InternalNpl.g:818:1: rule__Declaration__Group_1__4 : rule__Declaration__Group_1__4__Impl rule__Declaration__Group_1__5 ;
    public final void rule__Declaration__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:822:1: ( rule__Declaration__Group_1__4__Impl rule__Declaration__Group_1__5 )
            // InternalNpl.g:823:2: rule__Declaration__Group_1__4__Impl rule__Declaration__Group_1__5
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
    // InternalNpl.g:830:1: rule__Declaration__Group_1__4__Impl : ( ( rule__Declaration__FeedlinksAssignment_1_4 )* ) ;
    public final void rule__Declaration__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:834:1: ( ( ( rule__Declaration__FeedlinksAssignment_1_4 )* ) )
            // InternalNpl.g:835:1: ( ( rule__Declaration__FeedlinksAssignment_1_4 )* )
            {
            // InternalNpl.g:835:1: ( ( rule__Declaration__FeedlinksAssignment_1_4 )* )
            // InternalNpl.g:836:1: ( rule__Declaration__FeedlinksAssignment_1_4 )*
            {
             before(grammarAccess.getDeclarationAccess().getFeedlinksAssignment_1_4()); 
            // InternalNpl.g:837:1: ( rule__Declaration__FeedlinksAssignment_1_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=14 && LA7_0<=15)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalNpl.g:837:2: rule__Declaration__FeedlinksAssignment_1_4
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
    // InternalNpl.g:847:1: rule__Declaration__Group_1__5 : rule__Declaration__Group_1__5__Impl ;
    public final void rule__Declaration__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:851:1: ( rule__Declaration__Group_1__5__Impl )
            // InternalNpl.g:852:2: rule__Declaration__Group_1__5__Impl
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
    // InternalNpl.g:858:1: rule__Declaration__Group_1__5__Impl : ( '}' ) ;
    public final void rule__Declaration__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:862:1: ( ( '}' ) )
            // InternalNpl.g:863:1: ( '}' )
            {
            // InternalNpl.g:863:1: ( '}' )
            // InternalNpl.g:864:1: '}'
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
    // InternalNpl.g:889:1: rule__Declaration__Group_2__0 : rule__Declaration__Group_2__0__Impl rule__Declaration__Group_2__1 ;
    public final void rule__Declaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:893:1: ( rule__Declaration__Group_2__0__Impl rule__Declaration__Group_2__1 )
            // InternalNpl.g:894:2: rule__Declaration__Group_2__0__Impl rule__Declaration__Group_2__1
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
    // InternalNpl.g:901:1: rule__Declaration__Group_2__0__Impl : ( 'topics' ) ;
    public final void rule__Declaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:905:1: ( ( 'topics' ) )
            // InternalNpl.g:906:1: ( 'topics' )
            {
            // InternalNpl.g:906:1: ( 'topics' )
            // InternalNpl.g:907:1: 'topics'
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
    // InternalNpl.g:920:1: rule__Declaration__Group_2__1 : rule__Declaration__Group_2__1__Impl rule__Declaration__Group_2__2 ;
    public final void rule__Declaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:924:1: ( rule__Declaration__Group_2__1__Impl rule__Declaration__Group_2__2 )
            // InternalNpl.g:925:2: rule__Declaration__Group_2__1__Impl rule__Declaration__Group_2__2
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
    // InternalNpl.g:932:1: rule__Declaration__Group_2__1__Impl : ( '{' ) ;
    public final void rule__Declaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:936:1: ( ( '{' ) )
            // InternalNpl.g:937:1: ( '{' )
            {
            // InternalNpl.g:937:1: ( '{' )
            // InternalNpl.g:938:1: '{'
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
    // InternalNpl.g:951:1: rule__Declaration__Group_2__2 : rule__Declaration__Group_2__2__Impl rule__Declaration__Group_2__3 ;
    public final void rule__Declaration__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:955:1: ( rule__Declaration__Group_2__2__Impl rule__Declaration__Group_2__3 )
            // InternalNpl.g:956:2: rule__Declaration__Group_2__2__Impl rule__Declaration__Group_2__3
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
    // InternalNpl.g:963:1: rule__Declaration__Group_2__2__Impl : ( ( rule__Declaration__TopicsAssignment_2_2 ) ) ;
    public final void rule__Declaration__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:967:1: ( ( ( rule__Declaration__TopicsAssignment_2_2 ) ) )
            // InternalNpl.g:968:1: ( ( rule__Declaration__TopicsAssignment_2_2 ) )
            {
            // InternalNpl.g:968:1: ( ( rule__Declaration__TopicsAssignment_2_2 ) )
            // InternalNpl.g:969:1: ( rule__Declaration__TopicsAssignment_2_2 )
            {
             before(grammarAccess.getDeclarationAccess().getTopicsAssignment_2_2()); 
            // InternalNpl.g:970:1: ( rule__Declaration__TopicsAssignment_2_2 )
            // InternalNpl.g:970:2: rule__Declaration__TopicsAssignment_2_2
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
    // InternalNpl.g:980:1: rule__Declaration__Group_2__3 : rule__Declaration__Group_2__3__Impl rule__Declaration__Group_2__4 ;
    public final void rule__Declaration__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:984:1: ( rule__Declaration__Group_2__3__Impl rule__Declaration__Group_2__4 )
            // InternalNpl.g:985:2: rule__Declaration__Group_2__3__Impl rule__Declaration__Group_2__4
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
    // InternalNpl.g:992:1: rule__Declaration__Group_2__3__Impl : ( ( rule__Declaration__TopicsAssignment_2_3 )* ) ;
    public final void rule__Declaration__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:996:1: ( ( ( rule__Declaration__TopicsAssignment_2_3 )* ) )
            // InternalNpl.g:997:1: ( ( rule__Declaration__TopicsAssignment_2_3 )* )
            {
            // InternalNpl.g:997:1: ( ( rule__Declaration__TopicsAssignment_2_3 )* )
            // InternalNpl.g:998:1: ( rule__Declaration__TopicsAssignment_2_3 )*
            {
             before(grammarAccess.getDeclarationAccess().getTopicsAssignment_2_3()); 
            // InternalNpl.g:999:1: ( rule__Declaration__TopicsAssignment_2_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==34) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalNpl.g:999:2: rule__Declaration__TopicsAssignment_2_3
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
    // InternalNpl.g:1009:1: rule__Declaration__Group_2__4 : rule__Declaration__Group_2__4__Impl ;
    public final void rule__Declaration__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1013:1: ( rule__Declaration__Group_2__4__Impl )
            // InternalNpl.g:1014:2: rule__Declaration__Group_2__4__Impl
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
    // InternalNpl.g:1020:1: rule__Declaration__Group_2__4__Impl : ( '}' ) ;
    public final void rule__Declaration__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1024:1: ( ( '}' ) )
            // InternalNpl.g:1025:1: ( '}' )
            {
            // InternalNpl.g:1025:1: ( '}' )
            // InternalNpl.g:1026:1: '}'
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
    // InternalNpl.g:1049:1: rule__Declaration__Group_3__0 : rule__Declaration__Group_3__0__Impl rule__Declaration__Group_3__1 ;
    public final void rule__Declaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1053:1: ( rule__Declaration__Group_3__0__Impl rule__Declaration__Group_3__1 )
            // InternalNpl.g:1054:2: rule__Declaration__Group_3__0__Impl rule__Declaration__Group_3__1
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
    // InternalNpl.g:1061:1: rule__Declaration__Group_3__0__Impl : ( 'optional: date' ) ;
    public final void rule__Declaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1065:1: ( ( 'optional: date' ) )
            // InternalNpl.g:1066:1: ( 'optional: date' )
            {
            // InternalNpl.g:1066:1: ( 'optional: date' )
            // InternalNpl.g:1067:1: 'optional: date'
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
    // InternalNpl.g:1080:1: rule__Declaration__Group_3__1 : rule__Declaration__Group_3__1__Impl ;
    public final void rule__Declaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1084:1: ( rule__Declaration__Group_3__1__Impl )
            // InternalNpl.g:1085:2: rule__Declaration__Group_3__1__Impl
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
    // InternalNpl.g:1091:1: rule__Declaration__Group_3__1__Impl : ( ( rule__Declaration__DateAssignment_3_1 ) ) ;
    public final void rule__Declaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1095:1: ( ( ( rule__Declaration__DateAssignment_3_1 ) ) )
            // InternalNpl.g:1096:1: ( ( rule__Declaration__DateAssignment_3_1 ) )
            {
            // InternalNpl.g:1096:1: ( ( rule__Declaration__DateAssignment_3_1 ) )
            // InternalNpl.g:1097:1: ( rule__Declaration__DateAssignment_3_1 )
            {
             before(grammarAccess.getDeclarationAccess().getDateAssignment_3_1()); 
            // InternalNpl.g:1098:1: ( rule__Declaration__DateAssignment_3_1 )
            // InternalNpl.g:1098:2: rule__Declaration__DateAssignment_3_1
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
    // InternalNpl.g:1112:1: rule__Declaration__Group_4__0 : rule__Declaration__Group_4__0__Impl rule__Declaration__Group_4__1 ;
    public final void rule__Declaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1116:1: ( rule__Declaration__Group_4__0__Impl rule__Declaration__Group_4__1 )
            // InternalNpl.g:1117:2: rule__Declaration__Group_4__0__Impl rule__Declaration__Group_4__1
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
    // InternalNpl.g:1124:1: rule__Declaration__Group_4__0__Impl : ( 'optional: location' ) ;
    public final void rule__Declaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1128:1: ( ( 'optional: location' ) )
            // InternalNpl.g:1129:1: ( 'optional: location' )
            {
            // InternalNpl.g:1129:1: ( 'optional: location' )
            // InternalNpl.g:1130:1: 'optional: location'
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
    // InternalNpl.g:1143:1: rule__Declaration__Group_4__1 : rule__Declaration__Group_4__1__Impl ;
    public final void rule__Declaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1147:1: ( rule__Declaration__Group_4__1__Impl )
            // InternalNpl.g:1148:2: rule__Declaration__Group_4__1__Impl
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
    // InternalNpl.g:1154:1: rule__Declaration__Group_4__1__Impl : ( ( rule__Declaration__LocationAssignment_4_1 ) ) ;
    public final void rule__Declaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1158:1: ( ( ( rule__Declaration__LocationAssignment_4_1 ) ) )
            // InternalNpl.g:1159:1: ( ( rule__Declaration__LocationAssignment_4_1 ) )
            {
            // InternalNpl.g:1159:1: ( ( rule__Declaration__LocationAssignment_4_1 ) )
            // InternalNpl.g:1160:1: ( rule__Declaration__LocationAssignment_4_1 )
            {
             before(grammarAccess.getDeclarationAccess().getLocationAssignment_4_1()); 
            // InternalNpl.g:1161:1: ( rule__Declaration__LocationAssignment_4_1 )
            // InternalNpl.g:1161:2: rule__Declaration__LocationAssignment_4_1
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
    // InternalNpl.g:1175:1: rule__Declaration__Group_5__0 : rule__Declaration__Group_5__0__Impl rule__Declaration__Group_5__1 ;
    public final void rule__Declaration__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1179:1: ( rule__Declaration__Group_5__0__Impl rule__Declaration__Group_5__1 )
            // InternalNpl.g:1180:2: rule__Declaration__Group_5__0__Impl rule__Declaration__Group_5__1
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
    // InternalNpl.g:1187:1: rule__Declaration__Group_5__0__Impl : ( 'optional: price' ) ;
    public final void rule__Declaration__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1191:1: ( ( 'optional: price' ) )
            // InternalNpl.g:1192:1: ( 'optional: price' )
            {
            // InternalNpl.g:1192:1: ( 'optional: price' )
            // InternalNpl.g:1193:1: 'optional: price'
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
    // InternalNpl.g:1206:1: rule__Declaration__Group_5__1 : rule__Declaration__Group_5__1__Impl ;
    public final void rule__Declaration__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1210:1: ( rule__Declaration__Group_5__1__Impl )
            // InternalNpl.g:1211:2: rule__Declaration__Group_5__1__Impl
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
    // InternalNpl.g:1217:1: rule__Declaration__Group_5__1__Impl : ( ( rule__Declaration__PriceAssignment_5_1 ) ) ;
    public final void rule__Declaration__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1221:1: ( ( ( rule__Declaration__PriceAssignment_5_1 ) ) )
            // InternalNpl.g:1222:1: ( ( rule__Declaration__PriceAssignment_5_1 ) )
            {
            // InternalNpl.g:1222:1: ( ( rule__Declaration__PriceAssignment_5_1 ) )
            // InternalNpl.g:1223:1: ( rule__Declaration__PriceAssignment_5_1 )
            {
             before(grammarAccess.getDeclarationAccess().getPriceAssignment_5_1()); 
            // InternalNpl.g:1224:1: ( rule__Declaration__PriceAssignment_5_1 )
            // InternalNpl.g:1224:2: rule__Declaration__PriceAssignment_5_1
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
    // InternalNpl.g:1238:1: rule__Declaration__Group_6__0 : rule__Declaration__Group_6__0__Impl rule__Declaration__Group_6__1 ;
    public final void rule__Declaration__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1242:1: ( rule__Declaration__Group_6__0__Impl rule__Declaration__Group_6__1 )
            // InternalNpl.g:1243:2: rule__Declaration__Group_6__0__Impl rule__Declaration__Group_6__1
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
    // InternalNpl.g:1250:1: rule__Declaration__Group_6__0__Impl : ( 'optional: volume' ) ;
    public final void rule__Declaration__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1254:1: ( ( 'optional: volume' ) )
            // InternalNpl.g:1255:1: ( 'optional: volume' )
            {
            // InternalNpl.g:1255:1: ( 'optional: volume' )
            // InternalNpl.g:1256:1: 'optional: volume'
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
    // InternalNpl.g:1269:1: rule__Declaration__Group_6__1 : rule__Declaration__Group_6__1__Impl rule__Declaration__Group_6__2 ;
    public final void rule__Declaration__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1273:1: ( rule__Declaration__Group_6__1__Impl rule__Declaration__Group_6__2 )
            // InternalNpl.g:1274:2: rule__Declaration__Group_6__1__Impl rule__Declaration__Group_6__2
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
    // InternalNpl.g:1281:1: rule__Declaration__Group_6__1__Impl : ( ( rule__Declaration__VolumeAssignment_6_1 ) ) ;
    public final void rule__Declaration__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1285:1: ( ( ( rule__Declaration__VolumeAssignment_6_1 ) ) )
            // InternalNpl.g:1286:1: ( ( rule__Declaration__VolumeAssignment_6_1 ) )
            {
            // InternalNpl.g:1286:1: ( ( rule__Declaration__VolumeAssignment_6_1 ) )
            // InternalNpl.g:1287:1: ( rule__Declaration__VolumeAssignment_6_1 )
            {
             before(grammarAccess.getDeclarationAccess().getVolumeAssignment_6_1()); 
            // InternalNpl.g:1288:1: ( rule__Declaration__VolumeAssignment_6_1 )
            // InternalNpl.g:1288:2: rule__Declaration__VolumeAssignment_6_1
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
    // InternalNpl.g:1298:1: rule__Declaration__Group_6__2 : rule__Declaration__Group_6__2__Impl rule__Declaration__Group_6__3 ;
    public final void rule__Declaration__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1302:1: ( rule__Declaration__Group_6__2__Impl rule__Declaration__Group_6__3 )
            // InternalNpl.g:1303:2: rule__Declaration__Group_6__2__Impl rule__Declaration__Group_6__3
            {
            pushFollow(FOLLOW_13);
            rule__Declaration__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group_6__3();

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
    // InternalNpl.g:1310:1: rule__Declaration__Group_6__2__Impl : ( 'no.' ) ;
    public final void rule__Declaration__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1314:1: ( ( 'no.' ) )
            // InternalNpl.g:1315:1: ( 'no.' )
            {
            // InternalNpl.g:1315:1: ( 'no.' )
            // InternalNpl.g:1316:1: 'no.'
            {
             before(grammarAccess.getDeclarationAccess().getNoKeyword_6_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getNoKeyword_6_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Declaration__Group_6__3"
    // InternalNpl.g:1329:1: rule__Declaration__Group_6__3 : rule__Declaration__Group_6__3__Impl ;
    public final void rule__Declaration__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1333:1: ( rule__Declaration__Group_6__3__Impl )
            // InternalNpl.g:1334:2: rule__Declaration__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Group_6__3__Impl();

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
    // $ANTLR end "rule__Declaration__Group_6__3"


    // $ANTLR start "rule__Declaration__Group_6__3__Impl"
    // InternalNpl.g:1340:1: rule__Declaration__Group_6__3__Impl : ( ( rule__Declaration__NumberAssignment_6_3 ) ) ;
    public final void rule__Declaration__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1344:1: ( ( ( rule__Declaration__NumberAssignment_6_3 ) ) )
            // InternalNpl.g:1345:1: ( ( rule__Declaration__NumberAssignment_6_3 ) )
            {
            // InternalNpl.g:1345:1: ( ( rule__Declaration__NumberAssignment_6_3 ) )
            // InternalNpl.g:1346:1: ( rule__Declaration__NumberAssignment_6_3 )
            {
             before(grammarAccess.getDeclarationAccess().getNumberAssignment_6_3()); 
            // InternalNpl.g:1347:1: ( rule__Declaration__NumberAssignment_6_3 )
            // InternalNpl.g:1347:2: rule__Declaration__NumberAssignment_6_3
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__NumberAssignment_6_3();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getNumberAssignment_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_6__3__Impl"


    // $ANTLR start "rule__Declaration__Group_7__0"
    // InternalNpl.g:1365:1: rule__Declaration__Group_7__0 : rule__Declaration__Group_7__0__Impl rule__Declaration__Group_7__1 ;
    public final void rule__Declaration__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1369:1: ( rule__Declaration__Group_7__0__Impl rule__Declaration__Group_7__1 )
            // InternalNpl.g:1370:2: rule__Declaration__Group_7__0__Impl rule__Declaration__Group_7__1
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
    // InternalNpl.g:1377:1: rule__Declaration__Group_7__0__Impl : ( 'optional: language' ) ;
    public final void rule__Declaration__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1381:1: ( ( 'optional: language' ) )
            // InternalNpl.g:1382:1: ( 'optional: language' )
            {
            // InternalNpl.g:1382:1: ( 'optional: language' )
            // InternalNpl.g:1383:1: 'optional: language'
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
    // InternalNpl.g:1396:1: rule__Declaration__Group_7__1 : rule__Declaration__Group_7__1__Impl ;
    public final void rule__Declaration__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1400:1: ( rule__Declaration__Group_7__1__Impl )
            // InternalNpl.g:1401:2: rule__Declaration__Group_7__1__Impl
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
    // InternalNpl.g:1407:1: rule__Declaration__Group_7__1__Impl : ( ( rule__Declaration__LanguageAssignment_7_1 ) ) ;
    public final void rule__Declaration__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1411:1: ( ( ( rule__Declaration__LanguageAssignment_7_1 ) ) )
            // InternalNpl.g:1412:1: ( ( rule__Declaration__LanguageAssignment_7_1 ) )
            {
            // InternalNpl.g:1412:1: ( ( rule__Declaration__LanguageAssignment_7_1 ) )
            // InternalNpl.g:1413:1: ( rule__Declaration__LanguageAssignment_7_1 )
            {
             before(grammarAccess.getDeclarationAccess().getLanguageAssignment_7_1()); 
            // InternalNpl.g:1414:1: ( rule__Declaration__LanguageAssignment_7_1 )
            // InternalNpl.g:1414:2: rule__Declaration__LanguageAssignment_7_1
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
    // InternalNpl.g:1428:1: rule__Declaration__Group_8__0 : rule__Declaration__Group_8__0__Impl rule__Declaration__Group_8__1 ;
    public final void rule__Declaration__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1432:1: ( rule__Declaration__Group_8__0__Impl rule__Declaration__Group_8__1 )
            // InternalNpl.g:1433:2: rule__Declaration__Group_8__0__Impl rule__Declaration__Group_8__1
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
    // InternalNpl.g:1440:1: rule__Declaration__Group_8__0__Impl : ( 'format' ) ;
    public final void rule__Declaration__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1444:1: ( ( 'format' ) )
            // InternalNpl.g:1445:1: ( 'format' )
            {
            // InternalNpl.g:1445:1: ( 'format' )
            // InternalNpl.g:1446:1: 'format'
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
    // InternalNpl.g:1459:1: rule__Declaration__Group_8__1 : rule__Declaration__Group_8__1__Impl ;
    public final void rule__Declaration__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1463:1: ( rule__Declaration__Group_8__1__Impl )
            // InternalNpl.g:1464:2: rule__Declaration__Group_8__1__Impl
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
    // InternalNpl.g:1470:1: rule__Declaration__Group_8__1__Impl : ( ( rule__Declaration__FormatAssignment_8_1 ) ) ;
    public final void rule__Declaration__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1474:1: ( ( ( rule__Declaration__FormatAssignment_8_1 ) ) )
            // InternalNpl.g:1475:1: ( ( rule__Declaration__FormatAssignment_8_1 ) )
            {
            // InternalNpl.g:1475:1: ( ( rule__Declaration__FormatAssignment_8_1 ) )
            // InternalNpl.g:1476:1: ( rule__Declaration__FormatAssignment_8_1 )
            {
             before(grammarAccess.getDeclarationAccess().getFormatAssignment_8_1()); 
            // InternalNpl.g:1477:1: ( rule__Declaration__FormatAssignment_8_1 )
            // InternalNpl.g:1477:2: rule__Declaration__FormatAssignment_8_1
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
    // InternalNpl.g:1491:1: rule__Declaration__Group_9__0 : rule__Declaration__Group_9__0__Impl rule__Declaration__Group_9__1 ;
    public final void rule__Declaration__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1495:1: ( rule__Declaration__Group_9__0__Impl rule__Declaration__Group_9__1 )
            // InternalNpl.g:1496:2: rule__Declaration__Group_9__0__Impl rule__Declaration__Group_9__1
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
    // InternalNpl.g:1503:1: rule__Declaration__Group_9__0__Impl : ( 'number of articles per topic' ) ;
    public final void rule__Declaration__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1507:1: ( ( 'number of articles per topic' ) )
            // InternalNpl.g:1508:1: ( 'number of articles per topic' )
            {
            // InternalNpl.g:1508:1: ( 'number of articles per topic' )
            // InternalNpl.g:1509:1: 'number of articles per topic'
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
    // InternalNpl.g:1522:1: rule__Declaration__Group_9__1 : rule__Declaration__Group_9__1__Impl ;
    public final void rule__Declaration__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1526:1: ( rule__Declaration__Group_9__1__Impl )
            // InternalNpl.g:1527:2: rule__Declaration__Group_9__1__Impl
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
    // InternalNpl.g:1533:1: rule__Declaration__Group_9__1__Impl : ( ( rule__Declaration__ArticleCntAssignment_9_1 ) ) ;
    public final void rule__Declaration__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1537:1: ( ( ( rule__Declaration__ArticleCntAssignment_9_1 ) ) )
            // InternalNpl.g:1538:1: ( ( rule__Declaration__ArticleCntAssignment_9_1 ) )
            {
            // InternalNpl.g:1538:1: ( ( rule__Declaration__ArticleCntAssignment_9_1 ) )
            // InternalNpl.g:1539:1: ( rule__Declaration__ArticleCntAssignment_9_1 )
            {
             before(grammarAccess.getDeclarationAccess().getArticleCntAssignment_9_1()); 
            // InternalNpl.g:1540:1: ( rule__Declaration__ArticleCntAssignment_9_1 )
            // InternalNpl.g:1540:2: rule__Declaration__ArticleCntAssignment_9_1
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
    // InternalNpl.g:1554:1: rule__Declaration__Group_10__0 : rule__Declaration__Group_10__0__Impl rule__Declaration__Group_10__1 ;
    public final void rule__Declaration__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1558:1: ( rule__Declaration__Group_10__0__Impl rule__Declaration__Group_10__1 )
            // InternalNpl.g:1559:2: rule__Declaration__Group_10__0__Impl rule__Declaration__Group_10__1
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
    // InternalNpl.g:1566:1: rule__Declaration__Group_10__0__Impl : ( 'number of words per article' ) ;
    public final void rule__Declaration__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1570:1: ( ( 'number of words per article' ) )
            // InternalNpl.g:1571:1: ( 'number of words per article' )
            {
            // InternalNpl.g:1571:1: ( 'number of words per article' )
            // InternalNpl.g:1572:1: 'number of words per article'
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
    // InternalNpl.g:1585:1: rule__Declaration__Group_10__1 : rule__Declaration__Group_10__1__Impl rule__Declaration__Group_10__2 ;
    public final void rule__Declaration__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1589:1: ( rule__Declaration__Group_10__1__Impl rule__Declaration__Group_10__2 )
            // InternalNpl.g:1590:2: rule__Declaration__Group_10__1__Impl rule__Declaration__Group_10__2
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
    // InternalNpl.g:1597:1: rule__Declaration__Group_10__1__Impl : ( ( rule__Declaration__ArticleWordsMinAssignment_10_1 ) ) ;
    public final void rule__Declaration__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1601:1: ( ( ( rule__Declaration__ArticleWordsMinAssignment_10_1 ) ) )
            // InternalNpl.g:1602:1: ( ( rule__Declaration__ArticleWordsMinAssignment_10_1 ) )
            {
            // InternalNpl.g:1602:1: ( ( rule__Declaration__ArticleWordsMinAssignment_10_1 ) )
            // InternalNpl.g:1603:1: ( rule__Declaration__ArticleWordsMinAssignment_10_1 )
            {
             before(grammarAccess.getDeclarationAccess().getArticleWordsMinAssignment_10_1()); 
            // InternalNpl.g:1604:1: ( rule__Declaration__ArticleWordsMinAssignment_10_1 )
            // InternalNpl.g:1604:2: rule__Declaration__ArticleWordsMinAssignment_10_1
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
    // InternalNpl.g:1614:1: rule__Declaration__Group_10__2 : rule__Declaration__Group_10__2__Impl rule__Declaration__Group_10__3 ;
    public final void rule__Declaration__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1618:1: ( rule__Declaration__Group_10__2__Impl rule__Declaration__Group_10__3 )
            // InternalNpl.g:1619:2: rule__Declaration__Group_10__2__Impl rule__Declaration__Group_10__3
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
    // InternalNpl.g:1626:1: rule__Declaration__Group_10__2__Impl : ( '-' ) ;
    public final void rule__Declaration__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1630:1: ( ( '-' ) )
            // InternalNpl.g:1631:1: ( '-' )
            {
            // InternalNpl.g:1631:1: ( '-' )
            // InternalNpl.g:1632:1: '-'
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
    // InternalNpl.g:1645:1: rule__Declaration__Group_10__3 : rule__Declaration__Group_10__3__Impl ;
    public final void rule__Declaration__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1649:1: ( rule__Declaration__Group_10__3__Impl )
            // InternalNpl.g:1650:2: rule__Declaration__Group_10__3__Impl
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
    // InternalNpl.g:1656:1: rule__Declaration__Group_10__3__Impl : ( ( rule__Declaration__ArticleWordsMaxAssignment_10_3 ) ) ;
    public final void rule__Declaration__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1660:1: ( ( ( rule__Declaration__ArticleWordsMaxAssignment_10_3 ) ) )
            // InternalNpl.g:1661:1: ( ( rule__Declaration__ArticleWordsMaxAssignment_10_3 ) )
            {
            // InternalNpl.g:1661:1: ( ( rule__Declaration__ArticleWordsMaxAssignment_10_3 ) )
            // InternalNpl.g:1662:1: ( rule__Declaration__ArticleWordsMaxAssignment_10_3 )
            {
             before(grammarAccess.getDeclarationAccess().getArticleWordsMaxAssignment_10_3()); 
            // InternalNpl.g:1663:1: ( rule__Declaration__ArticleWordsMaxAssignment_10_3 )
            // InternalNpl.g:1663:2: rule__Declaration__ArticleWordsMaxAssignment_10_3
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
    // InternalNpl.g:1681:1: rule__Declaration__Group_11__0 : rule__Declaration__Group_11__0__Impl rule__Declaration__Group_11__1 ;
    public final void rule__Declaration__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1685:1: ( rule__Declaration__Group_11__0__Impl rule__Declaration__Group_11__1 )
            // InternalNpl.g:1686:2: rule__Declaration__Group_11__0__Impl rule__Declaration__Group_11__1
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
    // InternalNpl.g:1693:1: rule__Declaration__Group_11__0__Impl : ( 'optional: number of images per article' ) ;
    public final void rule__Declaration__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1697:1: ( ( 'optional: number of images per article' ) )
            // InternalNpl.g:1698:1: ( 'optional: number of images per article' )
            {
            // InternalNpl.g:1698:1: ( 'optional: number of images per article' )
            // InternalNpl.g:1699:1: 'optional: number of images per article'
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
    // InternalNpl.g:1712:1: rule__Declaration__Group_11__1 : rule__Declaration__Group_11__1__Impl ;
    public final void rule__Declaration__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1716:1: ( rule__Declaration__Group_11__1__Impl )
            // InternalNpl.g:1717:2: rule__Declaration__Group_11__1__Impl
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
    // InternalNpl.g:1723:1: rule__Declaration__Group_11__1__Impl : ( ( rule__Declaration__ImagesCntAssignment_11_1 ) ) ;
    public final void rule__Declaration__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1727:1: ( ( ( rule__Declaration__ImagesCntAssignment_11_1 ) ) )
            // InternalNpl.g:1728:1: ( ( rule__Declaration__ImagesCntAssignment_11_1 ) )
            {
            // InternalNpl.g:1728:1: ( ( rule__Declaration__ImagesCntAssignment_11_1 ) )
            // InternalNpl.g:1729:1: ( rule__Declaration__ImagesCntAssignment_11_1 )
            {
             before(grammarAccess.getDeclarationAccess().getImagesCntAssignment_11_1()); 
            // InternalNpl.g:1730:1: ( rule__Declaration__ImagesCntAssignment_11_1 )
            // InternalNpl.g:1730:2: rule__Declaration__ImagesCntAssignment_11_1
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
    // InternalNpl.g:1744:1: rule__Declaration__Group_12__0 : rule__Declaration__Group_12__0__Impl rule__Declaration__Group_12__1 ;
    public final void rule__Declaration__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1748:1: ( rule__Declaration__Group_12__0__Impl rule__Declaration__Group_12__1 )
            // InternalNpl.g:1749:2: rule__Declaration__Group_12__0__Impl rule__Declaration__Group_12__1
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
    // InternalNpl.g:1756:1: rule__Declaration__Group_12__0__Impl : ( 'number of columns' ) ;
    public final void rule__Declaration__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1760:1: ( ( 'number of columns' ) )
            // InternalNpl.g:1761:1: ( 'number of columns' )
            {
            // InternalNpl.g:1761:1: ( 'number of columns' )
            // InternalNpl.g:1762:1: 'number of columns'
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
    // InternalNpl.g:1775:1: rule__Declaration__Group_12__1 : rule__Declaration__Group_12__1__Impl ;
    public final void rule__Declaration__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1779:1: ( rule__Declaration__Group_12__1__Impl )
            // InternalNpl.g:1780:2: rule__Declaration__Group_12__1__Impl
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
    // InternalNpl.g:1786:1: rule__Declaration__Group_12__1__Impl : ( ( rule__Declaration__ColumnsCntAssignment_12_1 ) ) ;
    public final void rule__Declaration__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1790:1: ( ( ( rule__Declaration__ColumnsCntAssignment_12_1 ) ) )
            // InternalNpl.g:1791:1: ( ( rule__Declaration__ColumnsCntAssignment_12_1 ) )
            {
            // InternalNpl.g:1791:1: ( ( rule__Declaration__ColumnsCntAssignment_12_1 ) )
            // InternalNpl.g:1792:1: ( rule__Declaration__ColumnsCntAssignment_12_1 )
            {
             before(grammarAccess.getDeclarationAccess().getColumnsCntAssignment_12_1()); 
            // InternalNpl.g:1793:1: ( rule__Declaration__ColumnsCntAssignment_12_1 )
            // InternalNpl.g:1793:2: rule__Declaration__ColumnsCntAssignment_12_1
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
    // InternalNpl.g:1807:1: rule__Declaration__Group_13__0 : rule__Declaration__Group_13__0__Impl rule__Declaration__Group_13__1 ;
    public final void rule__Declaration__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1811:1: ( rule__Declaration__Group_13__0__Impl rule__Declaration__Group_13__1 )
            // InternalNpl.g:1812:2: rule__Declaration__Group_13__0__Impl rule__Declaration__Group_13__1
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
    // InternalNpl.g:1819:1: rule__Declaration__Group_13__0__Impl : ( 'font size' ) ;
    public final void rule__Declaration__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1823:1: ( ( 'font size' ) )
            // InternalNpl.g:1824:1: ( 'font size' )
            {
            // InternalNpl.g:1824:1: ( 'font size' )
            // InternalNpl.g:1825:1: 'font size'
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
    // InternalNpl.g:1838:1: rule__Declaration__Group_13__1 : rule__Declaration__Group_13__1__Impl ;
    public final void rule__Declaration__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1842:1: ( rule__Declaration__Group_13__1__Impl )
            // InternalNpl.g:1843:2: rule__Declaration__Group_13__1__Impl
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
    // InternalNpl.g:1849:1: rule__Declaration__Group_13__1__Impl : ( ( rule__Declaration__FontSizeAssignment_13_1 ) ) ;
    public final void rule__Declaration__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1853:1: ( ( ( rule__Declaration__FontSizeAssignment_13_1 ) ) )
            // InternalNpl.g:1854:1: ( ( rule__Declaration__FontSizeAssignment_13_1 ) )
            {
            // InternalNpl.g:1854:1: ( ( rule__Declaration__FontSizeAssignment_13_1 ) )
            // InternalNpl.g:1855:1: ( rule__Declaration__FontSizeAssignment_13_1 )
            {
             before(grammarAccess.getDeclarationAccess().getFontSizeAssignment_13_1()); 
            // InternalNpl.g:1856:1: ( rule__Declaration__FontSizeAssignment_13_1 )
            // InternalNpl.g:1856:2: rule__Declaration__FontSizeAssignment_13_1
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
    // InternalNpl.g:1870:1: rule__Date__Group__0 : rule__Date__Group__0__Impl rule__Date__Group__1 ;
    public final void rule__Date__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1874:1: ( rule__Date__Group__0__Impl rule__Date__Group__1 )
            // InternalNpl.g:1875:2: rule__Date__Group__0__Impl rule__Date__Group__1
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
    // InternalNpl.g:1882:1: rule__Date__Group__0__Impl : ( '{' ) ;
    public final void rule__Date__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1886:1: ( ( '{' ) )
            // InternalNpl.g:1887:1: ( '{' )
            {
            // InternalNpl.g:1887:1: ( '{' )
            // InternalNpl.g:1888:1: '{'
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
    // InternalNpl.g:1901:1: rule__Date__Group__1 : rule__Date__Group__1__Impl rule__Date__Group__2 ;
    public final void rule__Date__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1905:1: ( rule__Date__Group__1__Impl rule__Date__Group__2 )
            // InternalNpl.g:1906:2: rule__Date__Group__1__Impl rule__Date__Group__2
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
    // InternalNpl.g:1913:1: rule__Date__Group__1__Impl : ( ( rule__Date__DayAssignment_1 ) ) ;
    public final void rule__Date__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1917:1: ( ( ( rule__Date__DayAssignment_1 ) ) )
            // InternalNpl.g:1918:1: ( ( rule__Date__DayAssignment_1 ) )
            {
            // InternalNpl.g:1918:1: ( ( rule__Date__DayAssignment_1 ) )
            // InternalNpl.g:1919:1: ( rule__Date__DayAssignment_1 )
            {
             before(grammarAccess.getDateAccess().getDayAssignment_1()); 
            // InternalNpl.g:1920:1: ( rule__Date__DayAssignment_1 )
            // InternalNpl.g:1920:2: rule__Date__DayAssignment_1
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
    // InternalNpl.g:1930:1: rule__Date__Group__2 : rule__Date__Group__2__Impl rule__Date__Group__3 ;
    public final void rule__Date__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1934:1: ( rule__Date__Group__2__Impl rule__Date__Group__3 )
            // InternalNpl.g:1935:2: rule__Date__Group__2__Impl rule__Date__Group__3
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
    // InternalNpl.g:1942:1: rule__Date__Group__2__Impl : ( '-' ) ;
    public final void rule__Date__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1946:1: ( ( '-' ) )
            // InternalNpl.g:1947:1: ( '-' )
            {
            // InternalNpl.g:1947:1: ( '-' )
            // InternalNpl.g:1948:1: '-'
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
    // InternalNpl.g:1961:1: rule__Date__Group__3 : rule__Date__Group__3__Impl rule__Date__Group__4 ;
    public final void rule__Date__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1965:1: ( rule__Date__Group__3__Impl rule__Date__Group__4 )
            // InternalNpl.g:1966:2: rule__Date__Group__3__Impl rule__Date__Group__4
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
    // InternalNpl.g:1973:1: rule__Date__Group__3__Impl : ( ( rule__Date__MonthAssignment_3 ) ) ;
    public final void rule__Date__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1977:1: ( ( ( rule__Date__MonthAssignment_3 ) ) )
            // InternalNpl.g:1978:1: ( ( rule__Date__MonthAssignment_3 ) )
            {
            // InternalNpl.g:1978:1: ( ( rule__Date__MonthAssignment_3 ) )
            // InternalNpl.g:1979:1: ( rule__Date__MonthAssignment_3 )
            {
             before(grammarAccess.getDateAccess().getMonthAssignment_3()); 
            // InternalNpl.g:1980:1: ( rule__Date__MonthAssignment_3 )
            // InternalNpl.g:1980:2: rule__Date__MonthAssignment_3
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
    // InternalNpl.g:1990:1: rule__Date__Group__4 : rule__Date__Group__4__Impl rule__Date__Group__5 ;
    public final void rule__Date__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:1994:1: ( rule__Date__Group__4__Impl rule__Date__Group__5 )
            // InternalNpl.g:1995:2: rule__Date__Group__4__Impl rule__Date__Group__5
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
    // InternalNpl.g:2002:1: rule__Date__Group__4__Impl : ( '-' ) ;
    public final void rule__Date__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2006:1: ( ( '-' ) )
            // InternalNpl.g:2007:1: ( '-' )
            {
            // InternalNpl.g:2007:1: ( '-' )
            // InternalNpl.g:2008:1: '-'
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
    // InternalNpl.g:2021:1: rule__Date__Group__5 : rule__Date__Group__5__Impl rule__Date__Group__6 ;
    public final void rule__Date__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2025:1: ( rule__Date__Group__5__Impl rule__Date__Group__6 )
            // InternalNpl.g:2026:2: rule__Date__Group__5__Impl rule__Date__Group__6
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
    // InternalNpl.g:2033:1: rule__Date__Group__5__Impl : ( ( rule__Date__YearAssignment_5 ) ) ;
    public final void rule__Date__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2037:1: ( ( ( rule__Date__YearAssignment_5 ) ) )
            // InternalNpl.g:2038:1: ( ( rule__Date__YearAssignment_5 ) )
            {
            // InternalNpl.g:2038:1: ( ( rule__Date__YearAssignment_5 ) )
            // InternalNpl.g:2039:1: ( rule__Date__YearAssignment_5 )
            {
             before(grammarAccess.getDateAccess().getYearAssignment_5()); 
            // InternalNpl.g:2040:1: ( rule__Date__YearAssignment_5 )
            // InternalNpl.g:2040:2: rule__Date__YearAssignment_5
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
    // InternalNpl.g:2050:1: rule__Date__Group__6 : rule__Date__Group__6__Impl ;
    public final void rule__Date__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2054:1: ( rule__Date__Group__6__Impl )
            // InternalNpl.g:2055:2: rule__Date__Group__6__Impl
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
    // InternalNpl.g:2061:1: rule__Date__Group__6__Impl : ( '}' ) ;
    public final void rule__Date__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2065:1: ( ( '}' ) )
            // InternalNpl.g:2066:1: ( '}' )
            {
            // InternalNpl.g:2066:1: ( '}' )
            // InternalNpl.g:2067:1: '}'
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
    // InternalNpl.g:2094:1: rule__Price__Group__0 : rule__Price__Group__0__Impl rule__Price__Group__1 ;
    public final void rule__Price__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2098:1: ( rule__Price__Group__0__Impl rule__Price__Group__1 )
            // InternalNpl.g:2099:2: rule__Price__Group__0__Impl rule__Price__Group__1
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
    // InternalNpl.g:2106:1: rule__Price__Group__0__Impl : ( '{' ) ;
    public final void rule__Price__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2110:1: ( ( '{' ) )
            // InternalNpl.g:2111:1: ( '{' )
            {
            // InternalNpl.g:2111:1: ( '{' )
            // InternalNpl.g:2112:1: '{'
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
    // InternalNpl.g:2125:1: rule__Price__Group__1 : rule__Price__Group__1__Impl rule__Price__Group__2 ;
    public final void rule__Price__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2129:1: ( rule__Price__Group__1__Impl rule__Price__Group__2 )
            // InternalNpl.g:2130:2: rule__Price__Group__1__Impl rule__Price__Group__2
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
    // InternalNpl.g:2137:1: rule__Price__Group__1__Impl : ( ( rule__Price__ValueAssignment_1 ) ) ;
    public final void rule__Price__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2141:1: ( ( ( rule__Price__ValueAssignment_1 ) ) )
            // InternalNpl.g:2142:1: ( ( rule__Price__ValueAssignment_1 ) )
            {
            // InternalNpl.g:2142:1: ( ( rule__Price__ValueAssignment_1 ) )
            // InternalNpl.g:2143:1: ( rule__Price__ValueAssignment_1 )
            {
             before(grammarAccess.getPriceAccess().getValueAssignment_1()); 
            // InternalNpl.g:2144:1: ( rule__Price__ValueAssignment_1 )
            // InternalNpl.g:2144:2: rule__Price__ValueAssignment_1
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
    // InternalNpl.g:2154:1: rule__Price__Group__2 : rule__Price__Group__2__Impl rule__Price__Group__3 ;
    public final void rule__Price__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2158:1: ( rule__Price__Group__2__Impl rule__Price__Group__3 )
            // InternalNpl.g:2159:2: rule__Price__Group__2__Impl rule__Price__Group__3
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
    // InternalNpl.g:2166:1: rule__Price__Group__2__Impl : ( ( rule__Price__CurrencyAssignment_2 ) ) ;
    public final void rule__Price__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2170:1: ( ( ( rule__Price__CurrencyAssignment_2 ) ) )
            // InternalNpl.g:2171:1: ( ( rule__Price__CurrencyAssignment_2 ) )
            {
            // InternalNpl.g:2171:1: ( ( rule__Price__CurrencyAssignment_2 ) )
            // InternalNpl.g:2172:1: ( rule__Price__CurrencyAssignment_2 )
            {
             before(grammarAccess.getPriceAccess().getCurrencyAssignment_2()); 
            // InternalNpl.g:2173:1: ( rule__Price__CurrencyAssignment_2 )
            // InternalNpl.g:2173:2: rule__Price__CurrencyAssignment_2
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
    // InternalNpl.g:2183:1: rule__Price__Group__3 : rule__Price__Group__3__Impl ;
    public final void rule__Price__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2187:1: ( rule__Price__Group__3__Impl )
            // InternalNpl.g:2188:2: rule__Price__Group__3__Impl
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
    // InternalNpl.g:2194:1: rule__Price__Group__3__Impl : ( '}' ) ;
    public final void rule__Price__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2198:1: ( ( '}' ) )
            // InternalNpl.g:2199:1: ( '}' )
            {
            // InternalNpl.g:2199:1: ( '}' )
            // InternalNpl.g:2200:1: '}'
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
    // InternalNpl.g:2221:1: rule__Topic__Group__0 : rule__Topic__Group__0__Impl rule__Topic__Group__1 ;
    public final void rule__Topic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2225:1: ( rule__Topic__Group__0__Impl rule__Topic__Group__1 )
            // InternalNpl.g:2226:2: rule__Topic__Group__0__Impl rule__Topic__Group__1
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
    // InternalNpl.g:2233:1: rule__Topic__Group__0__Impl : ( 'topic' ) ;
    public final void rule__Topic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2237:1: ( ( 'topic' ) )
            // InternalNpl.g:2238:1: ( 'topic' )
            {
            // InternalNpl.g:2238:1: ( 'topic' )
            // InternalNpl.g:2239:1: 'topic'
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
    // InternalNpl.g:2252:1: rule__Topic__Group__1 : rule__Topic__Group__1__Impl rule__Topic__Group__2 ;
    public final void rule__Topic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2256:1: ( rule__Topic__Group__1__Impl rule__Topic__Group__2 )
            // InternalNpl.g:2257:2: rule__Topic__Group__1__Impl rule__Topic__Group__2
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
    // InternalNpl.g:2264:1: rule__Topic__Group__1__Impl : ( ( rule__Topic__NameAssignment_1 ) ) ;
    public final void rule__Topic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2268:1: ( ( ( rule__Topic__NameAssignment_1 ) ) )
            // InternalNpl.g:2269:1: ( ( rule__Topic__NameAssignment_1 ) )
            {
            // InternalNpl.g:2269:1: ( ( rule__Topic__NameAssignment_1 ) )
            // InternalNpl.g:2270:1: ( rule__Topic__NameAssignment_1 )
            {
             before(grammarAccess.getTopicAccess().getNameAssignment_1()); 
            // InternalNpl.g:2271:1: ( rule__Topic__NameAssignment_1 )
            // InternalNpl.g:2271:2: rule__Topic__NameAssignment_1
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
    // InternalNpl.g:2281:1: rule__Topic__Group__2 : rule__Topic__Group__2__Impl rule__Topic__Group__3 ;
    public final void rule__Topic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2285:1: ( rule__Topic__Group__2__Impl rule__Topic__Group__3 )
            // InternalNpl.g:2286:2: rule__Topic__Group__2__Impl rule__Topic__Group__3
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
    // InternalNpl.g:2293:1: rule__Topic__Group__2__Impl : ( '{' ) ;
    public final void rule__Topic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2297:1: ( ( '{' ) )
            // InternalNpl.g:2298:1: ( '{' )
            {
            // InternalNpl.g:2298:1: ( '{' )
            // InternalNpl.g:2299:1: '{'
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
    // InternalNpl.g:2312:1: rule__Topic__Group__3 : rule__Topic__Group__3__Impl rule__Topic__Group__4 ;
    public final void rule__Topic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2316:1: ( rule__Topic__Group__3__Impl rule__Topic__Group__4 )
            // InternalNpl.g:2317:2: rule__Topic__Group__3__Impl rule__Topic__Group__4
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
    // InternalNpl.g:2324:1: rule__Topic__Group__3__Impl : ( ( rule__Topic__TagsAssignment_3 ) ) ;
    public final void rule__Topic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2328:1: ( ( ( rule__Topic__TagsAssignment_3 ) ) )
            // InternalNpl.g:2329:1: ( ( rule__Topic__TagsAssignment_3 ) )
            {
            // InternalNpl.g:2329:1: ( ( rule__Topic__TagsAssignment_3 ) )
            // InternalNpl.g:2330:1: ( rule__Topic__TagsAssignment_3 )
            {
             before(grammarAccess.getTopicAccess().getTagsAssignment_3()); 
            // InternalNpl.g:2331:1: ( rule__Topic__TagsAssignment_3 )
            // InternalNpl.g:2331:2: rule__Topic__TagsAssignment_3
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
    // InternalNpl.g:2341:1: rule__Topic__Group__4 : rule__Topic__Group__4__Impl rule__Topic__Group__5 ;
    public final void rule__Topic__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2345:1: ( rule__Topic__Group__4__Impl rule__Topic__Group__5 )
            // InternalNpl.g:2346:2: rule__Topic__Group__4__Impl rule__Topic__Group__5
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
    // InternalNpl.g:2353:1: rule__Topic__Group__4__Impl : ( ( rule__Topic__Group_4__0 )* ) ;
    public final void rule__Topic__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2357:1: ( ( ( rule__Topic__Group_4__0 )* ) )
            // InternalNpl.g:2358:1: ( ( rule__Topic__Group_4__0 )* )
            {
            // InternalNpl.g:2358:1: ( ( rule__Topic__Group_4__0 )* )
            // InternalNpl.g:2359:1: ( rule__Topic__Group_4__0 )*
            {
             before(grammarAccess.getTopicAccess().getGroup_4()); 
            // InternalNpl.g:2360:1: ( rule__Topic__Group_4__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==35) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalNpl.g:2360:2: rule__Topic__Group_4__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Topic__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalNpl.g:2370:1: rule__Topic__Group__5 : rule__Topic__Group__5__Impl ;
    public final void rule__Topic__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2374:1: ( rule__Topic__Group__5__Impl )
            // InternalNpl.g:2375:2: rule__Topic__Group__5__Impl
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
    // InternalNpl.g:2381:1: rule__Topic__Group__5__Impl : ( '}' ) ;
    public final void rule__Topic__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2385:1: ( ( '}' ) )
            // InternalNpl.g:2386:1: ( '}' )
            {
            // InternalNpl.g:2386:1: ( '}' )
            // InternalNpl.g:2387:1: '}'
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
    // InternalNpl.g:2412:1: rule__Topic__Group_4__0 : rule__Topic__Group_4__0__Impl rule__Topic__Group_4__1 ;
    public final void rule__Topic__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2416:1: ( rule__Topic__Group_4__0__Impl rule__Topic__Group_4__1 )
            // InternalNpl.g:2417:2: rule__Topic__Group_4__0__Impl rule__Topic__Group_4__1
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
    // InternalNpl.g:2424:1: rule__Topic__Group_4__0__Impl : ( ', ' ) ;
    public final void rule__Topic__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2428:1: ( ( ', ' ) )
            // InternalNpl.g:2429:1: ( ', ' )
            {
            // InternalNpl.g:2429:1: ( ', ' )
            // InternalNpl.g:2430:1: ', '
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
    // InternalNpl.g:2443:1: rule__Topic__Group_4__1 : rule__Topic__Group_4__1__Impl ;
    public final void rule__Topic__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2447:1: ( rule__Topic__Group_4__1__Impl )
            // InternalNpl.g:2448:2: rule__Topic__Group_4__1__Impl
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
    // InternalNpl.g:2454:1: rule__Topic__Group_4__1__Impl : ( ( rule__Topic__TagsAssignment_4_1 ) ) ;
    public final void rule__Topic__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2458:1: ( ( ( rule__Topic__TagsAssignment_4_1 ) ) )
            // InternalNpl.g:2459:1: ( ( rule__Topic__TagsAssignment_4_1 ) )
            {
            // InternalNpl.g:2459:1: ( ( rule__Topic__TagsAssignment_4_1 ) )
            // InternalNpl.g:2460:1: ( rule__Topic__TagsAssignment_4_1 )
            {
             before(grammarAccess.getTopicAccess().getTagsAssignment_4_1()); 
            // InternalNpl.g:2461:1: ( rule__Topic__TagsAssignment_4_1 )
            // InternalNpl.g:2461:2: rule__Topic__TagsAssignment_4_1
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
    // InternalNpl.g:2475:1: rule__Pair__Group__0 : rule__Pair__Group__0__Impl rule__Pair__Group__1 ;
    public final void rule__Pair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2479:1: ( rule__Pair__Group__0__Impl rule__Pair__Group__1 )
            // InternalNpl.g:2480:2: rule__Pair__Group__0__Impl rule__Pair__Group__1
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
    // InternalNpl.g:2487:1: rule__Pair__Group__0__Impl : ( ( rule__Pair__TypeAssignment_0 ) ) ;
    public final void rule__Pair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2491:1: ( ( ( rule__Pair__TypeAssignment_0 ) ) )
            // InternalNpl.g:2492:1: ( ( rule__Pair__TypeAssignment_0 ) )
            {
            // InternalNpl.g:2492:1: ( ( rule__Pair__TypeAssignment_0 ) )
            // InternalNpl.g:2493:1: ( rule__Pair__TypeAssignment_0 )
            {
             before(grammarAccess.getPairAccess().getTypeAssignment_0()); 
            // InternalNpl.g:2494:1: ( rule__Pair__TypeAssignment_0 )
            // InternalNpl.g:2494:2: rule__Pair__TypeAssignment_0
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
    // InternalNpl.g:2504:1: rule__Pair__Group__1 : rule__Pair__Group__1__Impl rule__Pair__Group__2 ;
    public final void rule__Pair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2508:1: ( rule__Pair__Group__1__Impl rule__Pair__Group__2 )
            // InternalNpl.g:2509:2: rule__Pair__Group__1__Impl rule__Pair__Group__2
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
    // InternalNpl.g:2516:1: rule__Pair__Group__1__Impl : ( ( rule__Pair__KeyAssignment_1 ) ) ;
    public final void rule__Pair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2520:1: ( ( ( rule__Pair__KeyAssignment_1 ) ) )
            // InternalNpl.g:2521:1: ( ( rule__Pair__KeyAssignment_1 ) )
            {
            // InternalNpl.g:2521:1: ( ( rule__Pair__KeyAssignment_1 ) )
            // InternalNpl.g:2522:1: ( rule__Pair__KeyAssignment_1 )
            {
             before(grammarAccess.getPairAccess().getKeyAssignment_1()); 
            // InternalNpl.g:2523:1: ( rule__Pair__KeyAssignment_1 )
            // InternalNpl.g:2523:2: rule__Pair__KeyAssignment_1
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
    // InternalNpl.g:2533:1: rule__Pair__Group__2 : rule__Pair__Group__2__Impl rule__Pair__Group__3 ;
    public final void rule__Pair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2537:1: ( rule__Pair__Group__2__Impl rule__Pair__Group__3 )
            // InternalNpl.g:2538:2: rule__Pair__Group__2__Impl rule__Pair__Group__3
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
    // InternalNpl.g:2545:1: rule__Pair__Group__2__Impl : ( '<' ) ;
    public final void rule__Pair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2549:1: ( ( '<' ) )
            // InternalNpl.g:2550:1: ( '<' )
            {
            // InternalNpl.g:2550:1: ( '<' )
            // InternalNpl.g:2551:1: '<'
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
    // InternalNpl.g:2564:1: rule__Pair__Group__3 : rule__Pair__Group__3__Impl rule__Pair__Group__4 ;
    public final void rule__Pair__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2568:1: ( rule__Pair__Group__3__Impl rule__Pair__Group__4 )
            // InternalNpl.g:2569:2: rule__Pair__Group__3__Impl rule__Pair__Group__4
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
    // InternalNpl.g:2576:1: rule__Pair__Group__3__Impl : ( ( rule__Pair__ValueAssignment_3 ) ) ;
    public final void rule__Pair__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2580:1: ( ( ( rule__Pair__ValueAssignment_3 ) ) )
            // InternalNpl.g:2581:1: ( ( rule__Pair__ValueAssignment_3 ) )
            {
            // InternalNpl.g:2581:1: ( ( rule__Pair__ValueAssignment_3 ) )
            // InternalNpl.g:2582:1: ( rule__Pair__ValueAssignment_3 )
            {
             before(grammarAccess.getPairAccess().getValueAssignment_3()); 
            // InternalNpl.g:2583:1: ( rule__Pair__ValueAssignment_3 )
            // InternalNpl.g:2583:2: rule__Pair__ValueAssignment_3
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
    // InternalNpl.g:2593:1: rule__Pair__Group__4 : rule__Pair__Group__4__Impl ;
    public final void rule__Pair__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2597:1: ( rule__Pair__Group__4__Impl )
            // InternalNpl.g:2598:2: rule__Pair__Group__4__Impl
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
    // InternalNpl.g:2604:1: rule__Pair__Group__4__Impl : ( '>' ) ;
    public final void rule__Pair__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2608:1: ( ( '>' ) )
            // InternalNpl.g:2609:1: ( '>' )
            {
            // InternalNpl.g:2609:1: ( '>' )
            // InternalNpl.g:2610:1: '>'
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
    // InternalNpl.g:2633:1: rule__Float__Group__0 : rule__Float__Group__0__Impl rule__Float__Group__1 ;
    public final void rule__Float__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2637:1: ( rule__Float__Group__0__Impl rule__Float__Group__1 )
            // InternalNpl.g:2638:2: rule__Float__Group__0__Impl rule__Float__Group__1
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
    // InternalNpl.g:2645:1: rule__Float__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Float__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2649:1: ( ( RULE_INT ) )
            // InternalNpl.g:2650:1: ( RULE_INT )
            {
            // InternalNpl.g:2650:1: ( RULE_INT )
            // InternalNpl.g:2651:1: RULE_INT
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
    // InternalNpl.g:2662:1: rule__Float__Group__1 : rule__Float__Group__1__Impl ;
    public final void rule__Float__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2666:1: ( rule__Float__Group__1__Impl )
            // InternalNpl.g:2667:2: rule__Float__Group__1__Impl
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
    // InternalNpl.g:2673:1: rule__Float__Group__1__Impl : ( ( rule__Float__Group_1__0 )? ) ;
    public final void rule__Float__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2677:1: ( ( ( rule__Float__Group_1__0 )? ) )
            // InternalNpl.g:2678:1: ( ( rule__Float__Group_1__0 )? )
            {
            // InternalNpl.g:2678:1: ( ( rule__Float__Group_1__0 )? )
            // InternalNpl.g:2679:1: ( rule__Float__Group_1__0 )?
            {
             before(grammarAccess.getFloatAccess().getGroup_1()); 
            // InternalNpl.g:2680:1: ( rule__Float__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=12 && LA10_0<=13)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalNpl.g:2680:2: rule__Float__Group_1__0
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
    // InternalNpl.g:2694:1: rule__Float__Group_1__0 : rule__Float__Group_1__0__Impl rule__Float__Group_1__1 ;
    public final void rule__Float__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2698:1: ( rule__Float__Group_1__0__Impl rule__Float__Group_1__1 )
            // InternalNpl.g:2699:2: rule__Float__Group_1__0__Impl rule__Float__Group_1__1
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
    // InternalNpl.g:2706:1: rule__Float__Group_1__0__Impl : ( ( rule__Float__Alternatives_1_0 ) ) ;
    public final void rule__Float__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2710:1: ( ( ( rule__Float__Alternatives_1_0 ) ) )
            // InternalNpl.g:2711:1: ( ( rule__Float__Alternatives_1_0 ) )
            {
            // InternalNpl.g:2711:1: ( ( rule__Float__Alternatives_1_0 ) )
            // InternalNpl.g:2712:1: ( rule__Float__Alternatives_1_0 )
            {
             before(grammarAccess.getFloatAccess().getAlternatives_1_0()); 
            // InternalNpl.g:2713:1: ( rule__Float__Alternatives_1_0 )
            // InternalNpl.g:2713:2: rule__Float__Alternatives_1_0
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
    // InternalNpl.g:2723:1: rule__Float__Group_1__1 : rule__Float__Group_1__1__Impl ;
    public final void rule__Float__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2727:1: ( rule__Float__Group_1__1__Impl )
            // InternalNpl.g:2728:2: rule__Float__Group_1__1__Impl
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
    // InternalNpl.g:2734:1: rule__Float__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__Float__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:2738:1: ( ( RULE_INT ) )
            // InternalNpl.g:2739:1: ( RULE_INT )
            {
            // InternalNpl.g:2739:1: ( RULE_INT )
            // InternalNpl.g:2740:1: RULE_INT
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
    // InternalNpl.g:2756:1: rule__Declaration__UnorderedGroup : rule__Declaration__UnorderedGroup__0 {...}?;
    public final void rule__Declaration__UnorderedGroup() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getDeclarationAccess().getUnorderedGroup());
            
        try {
            // InternalNpl.g:2761:1: ( rule__Declaration__UnorderedGroup__0 {...}?)
            // InternalNpl.g:2762:2: rule__Declaration__UnorderedGroup__0 {...}?
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
    // InternalNpl.g:2773:1: rule__Declaration__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__Declaration__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_8__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_9__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_10__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_11__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_12__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_13__0 ) ) ) ) | ({...}? => ( ( ( '}' ) ) ) ) ) ;
    public final void rule__Declaration__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // InternalNpl.g:2778:1: ( ( ({...}? => ( ( ( rule__Declaration__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_8__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_9__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_10__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_11__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_12__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_13__0 ) ) ) ) | ({...}? => ( ( ( '}' ) ) ) ) ) )
            // InternalNpl.g:2779:3: ( ({...}? => ( ( ( rule__Declaration__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_8__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_9__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_10__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_11__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_12__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_13__0 ) ) ) ) | ({...}? => ( ( ( '}' ) ) ) ) )
            {
            // InternalNpl.g:2779:3: ( ({...}? => ( ( ( rule__Declaration__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_8__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_9__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_10__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_11__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_12__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_13__0 ) ) ) ) | ({...}? => ( ( ( '}' ) ) ) ) )
            int alt11=15;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalNpl.g:2781:4: ({...}? => ( ( ( rule__Declaration__Group_0__0 ) ) ) )
                    {
                    // InternalNpl.g:2781:4: ({...}? => ( ( ( rule__Declaration__Group_0__0 ) ) ) )
                    // InternalNpl.g:2782:5: {...}? => ( ( ( rule__Declaration__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Declaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalNpl.g:2782:106: ( ( ( rule__Declaration__Group_0__0 ) ) )
                    // InternalNpl.g:2783:6: ( ( rule__Declaration__Group_0__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalNpl.g:2789:6: ( ( rule__Declaration__Group_0__0 ) )
                    // InternalNpl.g:2791:7: ( rule__Declaration__Group_0__0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getGroup_0()); 
                    // InternalNpl.g:2792:7: ( rule__Declaration__Group_0__0 )
                    // InternalNpl.g:2792:8: rule__Declaration__Group_0__0
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
                    // InternalNpl.g:2798:4: ({...}? => ( ( ( rule__Declaration__Group_1__0 ) ) ) )
                    {
                    // InternalNpl.g:2798:4: ({...}? => ( ( ( rule__Declaration__Group_1__0 ) ) ) )
                    // InternalNpl.g:2799:5: {...}? => ( ( ( rule__Declaration__Group_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Declaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalNpl.g:2799:106: ( ( ( rule__Declaration__Group_1__0 ) ) )
                    // InternalNpl.g:2800:6: ( ( rule__Declaration__Group_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalNpl.g:2806:6: ( ( rule__Declaration__Group_1__0 ) )
                    // InternalNpl.g:2808:7: ( rule__Declaration__Group_1__0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getGroup_1()); 
                    // InternalNpl.g:2809:7: ( rule__Declaration__Group_1__0 )
                    // InternalNpl.g:2809:8: rule__Declaration__Group_1__0
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
                    // InternalNpl.g:2815:4: ({...}? => ( ( ( rule__Declaration__Group_2__0 ) ) ) )
                    {
                    // InternalNpl.g:2815:4: ({...}? => ( ( ( rule__Declaration__Group_2__0 ) ) ) )
                    // InternalNpl.g:2816:5: {...}? => ( ( ( rule__Declaration__Group_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Declaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2)");
                    }
                    // InternalNpl.g:2816:106: ( ( ( rule__Declaration__Group_2__0 ) ) )
                    // InternalNpl.g:2817:6: ( ( rule__Declaration__Group_2__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalNpl.g:2823:6: ( ( rule__Declaration__Group_2__0 ) )
                    // InternalNpl.g:2825:7: ( rule__Declaration__Group_2__0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getGroup_2()); 
                    // InternalNpl.g:2826:7: ( rule__Declaration__Group_2__0 )
                    // InternalNpl.g:2826:8: rule__Declaration__Group_2__0
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
                    // InternalNpl.g:2832:4: ({...}? => ( ( ( rule__Declaration__Group_3__0 ) ) ) )
                    {
                    // InternalNpl.g:2832:4: ({...}? => ( ( ( rule__Declaration__Group_3__0 ) ) ) )
                    // InternalNpl.g:2833:5: {...}? => ( ( ( rule__Declaration__Group_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3) ) {
                        throw new FailedPredicateException(input, "rule__Declaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3)");
                    }
                    // InternalNpl.g:2833:106: ( ( ( rule__Declaration__Group_3__0 ) ) )
                    // InternalNpl.g:2834:6: ( ( rule__Declaration__Group_3__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalNpl.g:2840:6: ( ( rule__Declaration__Group_3__0 ) )
                    // InternalNpl.g:2842:7: ( rule__Declaration__Group_3__0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getGroup_3()); 
                    // InternalNpl.g:2843:7: ( rule__Declaration__Group_3__0 )
                    // InternalNpl.g:2843:8: rule__Declaration__Group_3__0
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
                    // InternalNpl.g:2849:4: ({...}? => ( ( ( rule__Declaration__Group_4__0 ) ) ) )
                    {
                    // InternalNpl.g:2849:4: ({...}? => ( ( ( rule__Declaration__Group_4__0 ) ) ) )
                    // InternalNpl.g:2850:5: {...}? => ( ( ( rule__Declaration__Group_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4) ) {
                        throw new FailedPredicateException(input, "rule__Declaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4)");
                    }
                    // InternalNpl.g:2850:106: ( ( ( rule__Declaration__Group_4__0 ) ) )
                    // InternalNpl.g:2851:6: ( ( rule__Declaration__Group_4__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalNpl.g:2857:6: ( ( rule__Declaration__Group_4__0 ) )
                    // InternalNpl.g:2859:7: ( rule__Declaration__Group_4__0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getGroup_4()); 
                    // InternalNpl.g:2860:7: ( rule__Declaration__Group_4__0 )
                    // InternalNpl.g:2860:8: rule__Declaration__Group_4__0
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
                    // InternalNpl.g:2866:4: ({...}? => ( ( ( rule__Declaration__Group_5__0 ) ) ) )
                    {
                    // InternalNpl.g:2866:4: ({...}? => ( ( ( rule__Declaration__Group_5__0 ) ) ) )
                    // InternalNpl.g:2867:5: {...}? => ( ( ( rule__Declaration__Group_5__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5) ) {
                        throw new FailedPredicateException(input, "rule__Declaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5)");
                    }
                    // InternalNpl.g:2867:106: ( ( ( rule__Declaration__Group_5__0 ) ) )
                    // InternalNpl.g:2868:6: ( ( rule__Declaration__Group_5__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalNpl.g:2874:6: ( ( rule__Declaration__Group_5__0 ) )
                    // InternalNpl.g:2876:7: ( rule__Declaration__Group_5__0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getGroup_5()); 
                    // InternalNpl.g:2877:7: ( rule__Declaration__Group_5__0 )
                    // InternalNpl.g:2877:8: rule__Declaration__Group_5__0
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
                    // InternalNpl.g:2883:4: ({...}? => ( ( ( rule__Declaration__Group_6__0 ) ) ) )
                    {
                    // InternalNpl.g:2883:4: ({...}? => ( ( ( rule__Declaration__Group_6__0 ) ) ) )
                    // InternalNpl.g:2884:5: {...}? => ( ( ( rule__Declaration__Group_6__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6) ) {
                        throw new FailedPredicateException(input, "rule__Declaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6)");
                    }
                    // InternalNpl.g:2884:106: ( ( ( rule__Declaration__Group_6__0 ) ) )
                    // InternalNpl.g:2885:6: ( ( rule__Declaration__Group_6__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalNpl.g:2891:6: ( ( rule__Declaration__Group_6__0 ) )
                    // InternalNpl.g:2893:7: ( rule__Declaration__Group_6__0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getGroup_6()); 
                    // InternalNpl.g:2894:7: ( rule__Declaration__Group_6__0 )
                    // InternalNpl.g:2894:8: rule__Declaration__Group_6__0
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
                    // InternalNpl.g:2900:4: ({...}? => ( ( ( rule__Declaration__Group_7__0 ) ) ) )
                    {
                    // InternalNpl.g:2900:4: ({...}? => ( ( ( rule__Declaration__Group_7__0 ) ) ) )
                    // InternalNpl.g:2901:5: {...}? => ( ( ( rule__Declaration__Group_7__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7) ) {
                        throw new FailedPredicateException(input, "rule__Declaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7)");
                    }
                    // InternalNpl.g:2901:106: ( ( ( rule__Declaration__Group_7__0 ) ) )
                    // InternalNpl.g:2902:6: ( ( rule__Declaration__Group_7__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalNpl.g:2908:6: ( ( rule__Declaration__Group_7__0 ) )
                    // InternalNpl.g:2910:7: ( rule__Declaration__Group_7__0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getGroup_7()); 
                    // InternalNpl.g:2911:7: ( rule__Declaration__Group_7__0 )
                    // InternalNpl.g:2911:8: rule__Declaration__Group_7__0
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
                    // InternalNpl.g:2917:4: ({...}? => ( ( ( rule__Declaration__Group_8__0 ) ) ) )
                    {
                    // InternalNpl.g:2917:4: ({...}? => ( ( ( rule__Declaration__Group_8__0 ) ) ) )
                    // InternalNpl.g:2918:5: {...}? => ( ( ( rule__Declaration__Group_8__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8) ) {
                        throw new FailedPredicateException(input, "rule__Declaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8)");
                    }
                    // InternalNpl.g:2918:106: ( ( ( rule__Declaration__Group_8__0 ) ) )
                    // InternalNpl.g:2919:6: ( ( rule__Declaration__Group_8__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalNpl.g:2925:6: ( ( rule__Declaration__Group_8__0 ) )
                    // InternalNpl.g:2927:7: ( rule__Declaration__Group_8__0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getGroup_8()); 
                    // InternalNpl.g:2928:7: ( rule__Declaration__Group_8__0 )
                    // InternalNpl.g:2928:8: rule__Declaration__Group_8__0
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
                    // InternalNpl.g:2934:4: ({...}? => ( ( ( rule__Declaration__Group_9__0 ) ) ) )
                    {
                    // InternalNpl.g:2934:4: ({...}? => ( ( ( rule__Declaration__Group_9__0 ) ) ) )
                    // InternalNpl.g:2935:5: {...}? => ( ( ( rule__Declaration__Group_9__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9) ) {
                        throw new FailedPredicateException(input, "rule__Declaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9)");
                    }
                    // InternalNpl.g:2935:106: ( ( ( rule__Declaration__Group_9__0 ) ) )
                    // InternalNpl.g:2936:6: ( ( rule__Declaration__Group_9__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalNpl.g:2942:6: ( ( rule__Declaration__Group_9__0 ) )
                    // InternalNpl.g:2944:7: ( rule__Declaration__Group_9__0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getGroup_9()); 
                    // InternalNpl.g:2945:7: ( rule__Declaration__Group_9__0 )
                    // InternalNpl.g:2945:8: rule__Declaration__Group_9__0
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
                    // InternalNpl.g:2951:4: ({...}? => ( ( ( rule__Declaration__Group_10__0 ) ) ) )
                    {
                    // InternalNpl.g:2951:4: ({...}? => ( ( ( rule__Declaration__Group_10__0 ) ) ) )
                    // InternalNpl.g:2952:5: {...}? => ( ( ( rule__Declaration__Group_10__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10) ) {
                        throw new FailedPredicateException(input, "rule__Declaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10)");
                    }
                    // InternalNpl.g:2952:107: ( ( ( rule__Declaration__Group_10__0 ) ) )
                    // InternalNpl.g:2953:6: ( ( rule__Declaration__Group_10__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalNpl.g:2959:6: ( ( rule__Declaration__Group_10__0 ) )
                    // InternalNpl.g:2961:7: ( rule__Declaration__Group_10__0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getGroup_10()); 
                    // InternalNpl.g:2962:7: ( rule__Declaration__Group_10__0 )
                    // InternalNpl.g:2962:8: rule__Declaration__Group_10__0
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
                    // InternalNpl.g:2968:4: ({...}? => ( ( ( rule__Declaration__Group_11__0 ) ) ) )
                    {
                    // InternalNpl.g:2968:4: ({...}? => ( ( ( rule__Declaration__Group_11__0 ) ) ) )
                    // InternalNpl.g:2969:5: {...}? => ( ( ( rule__Declaration__Group_11__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11) ) {
                        throw new FailedPredicateException(input, "rule__Declaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11)");
                    }
                    // InternalNpl.g:2969:107: ( ( ( rule__Declaration__Group_11__0 ) ) )
                    // InternalNpl.g:2970:6: ( ( rule__Declaration__Group_11__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalNpl.g:2976:6: ( ( rule__Declaration__Group_11__0 ) )
                    // InternalNpl.g:2978:7: ( rule__Declaration__Group_11__0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getGroup_11()); 
                    // InternalNpl.g:2979:7: ( rule__Declaration__Group_11__0 )
                    // InternalNpl.g:2979:8: rule__Declaration__Group_11__0
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
                    // InternalNpl.g:2985:4: ({...}? => ( ( ( rule__Declaration__Group_12__0 ) ) ) )
                    {
                    // InternalNpl.g:2985:4: ({...}? => ( ( ( rule__Declaration__Group_12__0 ) ) ) )
                    // InternalNpl.g:2986:5: {...}? => ( ( ( rule__Declaration__Group_12__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12) ) {
                        throw new FailedPredicateException(input, "rule__Declaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12)");
                    }
                    // InternalNpl.g:2986:107: ( ( ( rule__Declaration__Group_12__0 ) ) )
                    // InternalNpl.g:2987:6: ( ( rule__Declaration__Group_12__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalNpl.g:2993:6: ( ( rule__Declaration__Group_12__0 ) )
                    // InternalNpl.g:2995:7: ( rule__Declaration__Group_12__0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getGroup_12()); 
                    // InternalNpl.g:2996:7: ( rule__Declaration__Group_12__0 )
                    // InternalNpl.g:2996:8: rule__Declaration__Group_12__0
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
                    // InternalNpl.g:3002:4: ({...}? => ( ( ( rule__Declaration__Group_13__0 ) ) ) )
                    {
                    // InternalNpl.g:3002:4: ({...}? => ( ( ( rule__Declaration__Group_13__0 ) ) ) )
                    // InternalNpl.g:3003:5: {...}? => ( ( ( rule__Declaration__Group_13__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13) ) {
                        throw new FailedPredicateException(input, "rule__Declaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13)");
                    }
                    // InternalNpl.g:3003:107: ( ( ( rule__Declaration__Group_13__0 ) ) )
                    // InternalNpl.g:3004:6: ( ( rule__Declaration__Group_13__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalNpl.g:3010:6: ( ( rule__Declaration__Group_13__0 ) )
                    // InternalNpl.g:3012:7: ( rule__Declaration__Group_13__0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getGroup_13()); 
                    // InternalNpl.g:3013:7: ( rule__Declaration__Group_13__0 )
                    // InternalNpl.g:3013:8: rule__Declaration__Group_13__0
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
                    // InternalNpl.g:3019:4: ({...}? => ( ( ( '}' ) ) ) )
                    {
                    // InternalNpl.g:3019:4: ({...}? => ( ( ( '}' ) ) ) )
                    // InternalNpl.g:3020:5: {...}? => ( ( ( '}' ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14) ) {
                        throw new FailedPredicateException(input, "rule__Declaration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14)");
                    }
                    // InternalNpl.g:3020:107: ( ( ( '}' ) ) )
                    // InternalNpl.g:3021:6: ( ( '}' ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalNpl.g:3027:6: ( ( '}' ) )
                    // InternalNpl.g:3029:7: ( '}' )
                    {
                     before(grammarAccess.getDeclarationAccess().getRightCurlyBracketKeyword_14()); 
                    // InternalNpl.g:3030:7: ( '}' )
                    // InternalNpl.g:3031:2: '}'
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
    // InternalNpl.g:3047:1: rule__Declaration__UnorderedGroup__0 : rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__1 )? ;
    public final void rule__Declaration__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3051:1: ( rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__1 )? )
            // InternalNpl.g:3052:2: rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_27);
            rule__Declaration__UnorderedGroup__Impl();

            state._fsp--;

            // InternalNpl.g:3053:2: ( rule__Declaration__UnorderedGroup__1 )?
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalNpl.g:3053:2: rule__Declaration__UnorderedGroup__1
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
    // InternalNpl.g:3060:1: rule__Declaration__UnorderedGroup__1 : rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__2 )? ;
    public final void rule__Declaration__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3064:1: ( rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__2 )? )
            // InternalNpl.g:3065:2: rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_27);
            rule__Declaration__UnorderedGroup__Impl();

            state._fsp--;

            // InternalNpl.g:3066:2: ( rule__Declaration__UnorderedGroup__2 )?
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalNpl.g:3066:2: rule__Declaration__UnorderedGroup__2
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
    // InternalNpl.g:3073:1: rule__Declaration__UnorderedGroup__2 : rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__3 )? ;
    public final void rule__Declaration__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3077:1: ( rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__3 )? )
            // InternalNpl.g:3078:2: rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__3 )?
            {
            pushFollow(FOLLOW_27);
            rule__Declaration__UnorderedGroup__Impl();

            state._fsp--;

            // InternalNpl.g:3079:2: ( rule__Declaration__UnorderedGroup__3 )?
            int alt14=2;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalNpl.g:3079:2: rule__Declaration__UnorderedGroup__3
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
    // InternalNpl.g:3086:1: rule__Declaration__UnorderedGroup__3 : rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__4 )? ;
    public final void rule__Declaration__UnorderedGroup__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3090:1: ( rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__4 )? )
            // InternalNpl.g:3091:2: rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__4 )?
            {
            pushFollow(FOLLOW_27);
            rule__Declaration__UnorderedGroup__Impl();

            state._fsp--;

            // InternalNpl.g:3092:2: ( rule__Declaration__UnorderedGroup__4 )?
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalNpl.g:3092:2: rule__Declaration__UnorderedGroup__4
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
    // InternalNpl.g:3099:1: rule__Declaration__UnorderedGroup__4 : rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__5 )? ;
    public final void rule__Declaration__UnorderedGroup__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3103:1: ( rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__5 )? )
            // InternalNpl.g:3104:2: rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__5 )?
            {
            pushFollow(FOLLOW_27);
            rule__Declaration__UnorderedGroup__Impl();

            state._fsp--;

            // InternalNpl.g:3105:2: ( rule__Declaration__UnorderedGroup__5 )?
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalNpl.g:3105:2: rule__Declaration__UnorderedGroup__5
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
    // InternalNpl.g:3112:1: rule__Declaration__UnorderedGroup__5 : rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__6 )? ;
    public final void rule__Declaration__UnorderedGroup__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3116:1: ( rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__6 )? )
            // InternalNpl.g:3117:2: rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__6 )?
            {
            pushFollow(FOLLOW_27);
            rule__Declaration__UnorderedGroup__Impl();

            state._fsp--;

            // InternalNpl.g:3118:2: ( rule__Declaration__UnorderedGroup__6 )?
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalNpl.g:3118:2: rule__Declaration__UnorderedGroup__6
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
    // InternalNpl.g:3125:1: rule__Declaration__UnorderedGroup__6 : rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__7 )? ;
    public final void rule__Declaration__UnorderedGroup__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3129:1: ( rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__7 )? )
            // InternalNpl.g:3130:2: rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__7 )?
            {
            pushFollow(FOLLOW_27);
            rule__Declaration__UnorderedGroup__Impl();

            state._fsp--;

            // InternalNpl.g:3131:2: ( rule__Declaration__UnorderedGroup__7 )?
            int alt18=2;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalNpl.g:3131:2: rule__Declaration__UnorderedGroup__7
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
    // InternalNpl.g:3138:1: rule__Declaration__UnorderedGroup__7 : rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__8 )? ;
    public final void rule__Declaration__UnorderedGroup__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3142:1: ( rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__8 )? )
            // InternalNpl.g:3143:2: rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__8 )?
            {
            pushFollow(FOLLOW_27);
            rule__Declaration__UnorderedGroup__Impl();

            state._fsp--;

            // InternalNpl.g:3144:2: ( rule__Declaration__UnorderedGroup__8 )?
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalNpl.g:3144:2: rule__Declaration__UnorderedGroup__8
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
    // InternalNpl.g:3151:1: rule__Declaration__UnorderedGroup__8 : rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__9 )? ;
    public final void rule__Declaration__UnorderedGroup__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3155:1: ( rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__9 )? )
            // InternalNpl.g:3156:2: rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__9 )?
            {
            pushFollow(FOLLOW_27);
            rule__Declaration__UnorderedGroup__Impl();

            state._fsp--;

            // InternalNpl.g:3157:2: ( rule__Declaration__UnorderedGroup__9 )?
            int alt20=2;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalNpl.g:3157:2: rule__Declaration__UnorderedGroup__9
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
    // InternalNpl.g:3164:1: rule__Declaration__UnorderedGroup__9 : rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__10 )? ;
    public final void rule__Declaration__UnorderedGroup__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3168:1: ( rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__10 )? )
            // InternalNpl.g:3169:2: rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__10 )?
            {
            pushFollow(FOLLOW_27);
            rule__Declaration__UnorderedGroup__Impl();

            state._fsp--;

            // InternalNpl.g:3170:2: ( rule__Declaration__UnorderedGroup__10 )?
            int alt21=2;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalNpl.g:3170:2: rule__Declaration__UnorderedGroup__10
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
    // InternalNpl.g:3177:1: rule__Declaration__UnorderedGroup__10 : rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__11 )? ;
    public final void rule__Declaration__UnorderedGroup__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3181:1: ( rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__11 )? )
            // InternalNpl.g:3182:2: rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__11 )?
            {
            pushFollow(FOLLOW_27);
            rule__Declaration__UnorderedGroup__Impl();

            state._fsp--;

            // InternalNpl.g:3183:2: ( rule__Declaration__UnorderedGroup__11 )?
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalNpl.g:3183:2: rule__Declaration__UnorderedGroup__11
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
    // InternalNpl.g:3190:1: rule__Declaration__UnorderedGroup__11 : rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__12 )? ;
    public final void rule__Declaration__UnorderedGroup__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3194:1: ( rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__12 )? )
            // InternalNpl.g:3195:2: rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__12 )?
            {
            pushFollow(FOLLOW_27);
            rule__Declaration__UnorderedGroup__Impl();

            state._fsp--;

            // InternalNpl.g:3196:2: ( rule__Declaration__UnorderedGroup__12 )?
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // InternalNpl.g:3196:2: rule__Declaration__UnorderedGroup__12
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
    // InternalNpl.g:3203:1: rule__Declaration__UnorderedGroup__12 : rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__13 )? ;
    public final void rule__Declaration__UnorderedGroup__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3207:1: ( rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__13 )? )
            // InternalNpl.g:3208:2: rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__13 )?
            {
            pushFollow(FOLLOW_27);
            rule__Declaration__UnorderedGroup__Impl();

            state._fsp--;

            // InternalNpl.g:3209:2: ( rule__Declaration__UnorderedGroup__13 )?
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // InternalNpl.g:3209:2: rule__Declaration__UnorderedGroup__13
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
    // InternalNpl.g:3216:1: rule__Declaration__UnorderedGroup__13 : rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__14 )? ;
    public final void rule__Declaration__UnorderedGroup__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3220:1: ( rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__14 )? )
            // InternalNpl.g:3221:2: rule__Declaration__UnorderedGroup__Impl ( rule__Declaration__UnorderedGroup__14 )?
            {
            pushFollow(FOLLOW_27);
            rule__Declaration__UnorderedGroup__Impl();

            state._fsp--;

            // InternalNpl.g:3222:2: ( rule__Declaration__UnorderedGroup__14 )?
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // InternalNpl.g:3222:2: rule__Declaration__UnorderedGroup__14
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
    // InternalNpl.g:3229:1: rule__Declaration__UnorderedGroup__14 : rule__Declaration__UnorderedGroup__Impl ;
    public final void rule__Declaration__UnorderedGroup__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3233:1: ( rule__Declaration__UnorderedGroup__Impl )
            // InternalNpl.g:3234:2: rule__Declaration__UnorderedGroup__Impl
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
    // InternalNpl.g:3271:1: rule__Declaration__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Declaration__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3275:1: ( ( RULE_ID ) )
            // InternalNpl.g:3276:1: ( RULE_ID )
            {
            // InternalNpl.g:3276:1: ( RULE_ID )
            // InternalNpl.g:3277:1: RULE_ID
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
    // InternalNpl.g:3286:1: rule__Declaration__RecrawlAssignment_1_0 : ( ( 'recrawl' ) ) ;
    public final void rule__Declaration__RecrawlAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3290:1: ( ( ( 'recrawl' ) ) )
            // InternalNpl.g:3291:1: ( ( 'recrawl' ) )
            {
            // InternalNpl.g:3291:1: ( ( 'recrawl' ) )
            // InternalNpl.g:3292:1: ( 'recrawl' )
            {
             before(grammarAccess.getDeclarationAccess().getRecrawlRecrawlKeyword_1_0_0()); 
            // InternalNpl.g:3293:1: ( 'recrawl' )
            // InternalNpl.g:3294:1: 'recrawl'
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
    // InternalNpl.g:3309:1: rule__Declaration__FeedlinksAssignment_1_3 : ( rulePair ) ;
    public final void rule__Declaration__FeedlinksAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3313:1: ( ( rulePair ) )
            // InternalNpl.g:3314:1: ( rulePair )
            {
            // InternalNpl.g:3314:1: ( rulePair )
            // InternalNpl.g:3315:1: rulePair
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
    // InternalNpl.g:3324:1: rule__Declaration__FeedlinksAssignment_1_4 : ( rulePair ) ;
    public final void rule__Declaration__FeedlinksAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3328:1: ( ( rulePair ) )
            // InternalNpl.g:3329:1: ( rulePair )
            {
            // InternalNpl.g:3329:1: ( rulePair )
            // InternalNpl.g:3330:1: rulePair
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
    // InternalNpl.g:3339:1: rule__Declaration__TopicsAssignment_2_2 : ( ruleTopic ) ;
    public final void rule__Declaration__TopicsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3343:1: ( ( ruleTopic ) )
            // InternalNpl.g:3344:1: ( ruleTopic )
            {
            // InternalNpl.g:3344:1: ( ruleTopic )
            // InternalNpl.g:3345:1: ruleTopic
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
    // InternalNpl.g:3354:1: rule__Declaration__TopicsAssignment_2_3 : ( ruleTopic ) ;
    public final void rule__Declaration__TopicsAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3358:1: ( ( ruleTopic ) )
            // InternalNpl.g:3359:1: ( ruleTopic )
            {
            // InternalNpl.g:3359:1: ( ruleTopic )
            // InternalNpl.g:3360:1: ruleTopic
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
    // InternalNpl.g:3369:1: rule__Declaration__DateAssignment_3_1 : ( ruleDate ) ;
    public final void rule__Declaration__DateAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3373:1: ( ( ruleDate ) )
            // InternalNpl.g:3374:1: ( ruleDate )
            {
            // InternalNpl.g:3374:1: ( ruleDate )
            // InternalNpl.g:3375:1: ruleDate
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
    // InternalNpl.g:3384:1: rule__Declaration__LocationAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Declaration__LocationAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3388:1: ( ( RULE_STRING ) )
            // InternalNpl.g:3389:1: ( RULE_STRING )
            {
            // InternalNpl.g:3389:1: ( RULE_STRING )
            // InternalNpl.g:3390:1: RULE_STRING
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
    // InternalNpl.g:3399:1: rule__Declaration__PriceAssignment_5_1 : ( rulePrice ) ;
    public final void rule__Declaration__PriceAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3403:1: ( ( rulePrice ) )
            // InternalNpl.g:3404:1: ( rulePrice )
            {
            // InternalNpl.g:3404:1: ( rulePrice )
            // InternalNpl.g:3405:1: rulePrice
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
    // InternalNpl.g:3414:1: rule__Declaration__VolumeAssignment_6_1 : ( RULE_INT ) ;
    public final void rule__Declaration__VolumeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3418:1: ( ( RULE_INT ) )
            // InternalNpl.g:3419:1: ( RULE_INT )
            {
            // InternalNpl.g:3419:1: ( RULE_INT )
            // InternalNpl.g:3420:1: RULE_INT
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


    // $ANTLR start "rule__Declaration__NumberAssignment_6_3"
    // InternalNpl.g:3429:1: rule__Declaration__NumberAssignment_6_3 : ( RULE_INT ) ;
    public final void rule__Declaration__NumberAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3433:1: ( ( RULE_INT ) )
            // InternalNpl.g:3434:1: ( RULE_INT )
            {
            // InternalNpl.g:3434:1: ( RULE_INT )
            // InternalNpl.g:3435:1: RULE_INT
            {
             before(grammarAccess.getDeclarationAccess().getNumberINTTerminalRuleCall_6_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getNumberINTTerminalRuleCall_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__NumberAssignment_6_3"


    // $ANTLR start "rule__Declaration__LanguageAssignment_7_1"
    // InternalNpl.g:3444:1: rule__Declaration__LanguageAssignment_7_1 : ( ruleLanguage ) ;
    public final void rule__Declaration__LanguageAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3448:1: ( ( ruleLanguage ) )
            // InternalNpl.g:3449:1: ( ruleLanguage )
            {
            // InternalNpl.g:3449:1: ( ruleLanguage )
            // InternalNpl.g:3450:1: ruleLanguage
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
    // InternalNpl.g:3459:1: rule__Declaration__FormatAssignment_8_1 : ( ruleFormat ) ;
    public final void rule__Declaration__FormatAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3463:1: ( ( ruleFormat ) )
            // InternalNpl.g:3464:1: ( ruleFormat )
            {
            // InternalNpl.g:3464:1: ( ruleFormat )
            // InternalNpl.g:3465:1: ruleFormat
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
    // InternalNpl.g:3474:1: rule__Declaration__ArticleCntAssignment_9_1 : ( RULE_INT ) ;
    public final void rule__Declaration__ArticleCntAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3478:1: ( ( RULE_INT ) )
            // InternalNpl.g:3479:1: ( RULE_INT )
            {
            // InternalNpl.g:3479:1: ( RULE_INT )
            // InternalNpl.g:3480:1: RULE_INT
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
    // InternalNpl.g:3489:1: rule__Declaration__ArticleWordsMinAssignment_10_1 : ( RULE_INT ) ;
    public final void rule__Declaration__ArticleWordsMinAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3493:1: ( ( RULE_INT ) )
            // InternalNpl.g:3494:1: ( RULE_INT )
            {
            // InternalNpl.g:3494:1: ( RULE_INT )
            // InternalNpl.g:3495:1: RULE_INT
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
    // InternalNpl.g:3504:1: rule__Declaration__ArticleWordsMaxAssignment_10_3 : ( RULE_INT ) ;
    public final void rule__Declaration__ArticleWordsMaxAssignment_10_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3508:1: ( ( RULE_INT ) )
            // InternalNpl.g:3509:1: ( RULE_INT )
            {
            // InternalNpl.g:3509:1: ( RULE_INT )
            // InternalNpl.g:3510:1: RULE_INT
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
    // InternalNpl.g:3519:1: rule__Declaration__ImagesCntAssignment_11_1 : ( ruleImagesCount ) ;
    public final void rule__Declaration__ImagesCntAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3523:1: ( ( ruleImagesCount ) )
            // InternalNpl.g:3524:1: ( ruleImagesCount )
            {
            // InternalNpl.g:3524:1: ( ruleImagesCount )
            // InternalNpl.g:3525:1: ruleImagesCount
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
    // InternalNpl.g:3534:1: rule__Declaration__ColumnsCntAssignment_12_1 : ( RULE_INT ) ;
    public final void rule__Declaration__ColumnsCntAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3538:1: ( ( RULE_INT ) )
            // InternalNpl.g:3539:1: ( RULE_INT )
            {
            // InternalNpl.g:3539:1: ( RULE_INT )
            // InternalNpl.g:3540:1: RULE_INT
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
    // InternalNpl.g:3549:1: rule__Declaration__FontSizeAssignment_13_1 : ( ruleFontSize ) ;
    public final void rule__Declaration__FontSizeAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3553:1: ( ( ruleFontSize ) )
            // InternalNpl.g:3554:1: ( ruleFontSize )
            {
            // InternalNpl.g:3554:1: ( ruleFontSize )
            // InternalNpl.g:3555:1: ruleFontSize
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
    // InternalNpl.g:3564:1: rule__ImagesCount__ValueAssignment : ( RULE_INT ) ;
    public final void rule__ImagesCount__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3568:1: ( ( RULE_INT ) )
            // InternalNpl.g:3569:1: ( RULE_INT )
            {
            // InternalNpl.g:3569:1: ( RULE_INT )
            // InternalNpl.g:3570:1: RULE_INT
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
    // InternalNpl.g:3579:1: rule__FontSize__ValueAssignment_0 : ( ( 'small' ) ) ;
    public final void rule__FontSize__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3583:1: ( ( ( 'small' ) ) )
            // InternalNpl.g:3584:1: ( ( 'small' ) )
            {
            // InternalNpl.g:3584:1: ( ( 'small' ) )
            // InternalNpl.g:3585:1: ( 'small' )
            {
             before(grammarAccess.getFontSizeAccess().getValueSmallKeyword_0_0()); 
            // InternalNpl.g:3586:1: ( 'small' )
            // InternalNpl.g:3587:1: 'small'
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
    // InternalNpl.g:3602:1: rule__FontSize__ValueAssignment_1 : ( ( 'medium' ) ) ;
    public final void rule__FontSize__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3606:1: ( ( ( 'medium' ) ) )
            // InternalNpl.g:3607:1: ( ( 'medium' ) )
            {
            // InternalNpl.g:3607:1: ( ( 'medium' ) )
            // InternalNpl.g:3608:1: ( 'medium' )
            {
             before(grammarAccess.getFontSizeAccess().getValueMediumKeyword_1_0()); 
            // InternalNpl.g:3609:1: ( 'medium' )
            // InternalNpl.g:3610:1: 'medium'
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
    // InternalNpl.g:3625:1: rule__FontSize__ValueAssignment_2 : ( ( 'large' ) ) ;
    public final void rule__FontSize__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3629:1: ( ( ( 'large' ) ) )
            // InternalNpl.g:3630:1: ( ( 'large' ) )
            {
            // InternalNpl.g:3630:1: ( ( 'large' ) )
            // InternalNpl.g:3631:1: ( 'large' )
            {
             before(grammarAccess.getFontSizeAccess().getValueLargeKeyword_2_0()); 
            // InternalNpl.g:3632:1: ( 'large' )
            // InternalNpl.g:3633:1: 'large'
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
    // InternalNpl.g:3648:1: rule__Format__ValueAssignment_0 : ( ( 'DIN A6' ) ) ;
    public final void rule__Format__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3652:1: ( ( ( 'DIN A6' ) ) )
            // InternalNpl.g:3653:1: ( ( 'DIN A6' ) )
            {
            // InternalNpl.g:3653:1: ( ( 'DIN A6' ) )
            // InternalNpl.g:3654:1: ( 'DIN A6' )
            {
             before(grammarAccess.getFormatAccess().getValueDINA6Keyword_0_0()); 
            // InternalNpl.g:3655:1: ( 'DIN A6' )
            // InternalNpl.g:3656:1: 'DIN A6'
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
    // InternalNpl.g:3671:1: rule__Format__ValueAssignment_1 : ( ( 'DIN A5' ) ) ;
    public final void rule__Format__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3675:1: ( ( ( 'DIN A5' ) ) )
            // InternalNpl.g:3676:1: ( ( 'DIN A5' ) )
            {
            // InternalNpl.g:3676:1: ( ( 'DIN A5' ) )
            // InternalNpl.g:3677:1: ( 'DIN A5' )
            {
             before(grammarAccess.getFormatAccess().getValueDINA5Keyword_1_0()); 
            // InternalNpl.g:3678:1: ( 'DIN A5' )
            // InternalNpl.g:3679:1: 'DIN A5'
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
    // InternalNpl.g:3694:1: rule__Format__ValueAssignment_2 : ( ( 'DIN A4' ) ) ;
    public final void rule__Format__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3698:1: ( ( ( 'DIN A4' ) ) )
            // InternalNpl.g:3699:1: ( ( 'DIN A4' ) )
            {
            // InternalNpl.g:3699:1: ( ( 'DIN A4' ) )
            // InternalNpl.g:3700:1: ( 'DIN A4' )
            {
             before(grammarAccess.getFormatAccess().getValueDINA4Keyword_2_0()); 
            // InternalNpl.g:3701:1: ( 'DIN A4' )
            // InternalNpl.g:3702:1: 'DIN A4'
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
    // InternalNpl.g:3717:1: rule__Format__ValueAssignment_3 : ( ( 'DIN A3' ) ) ;
    public final void rule__Format__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3721:1: ( ( ( 'DIN A3' ) ) )
            // InternalNpl.g:3722:1: ( ( 'DIN A3' ) )
            {
            // InternalNpl.g:3722:1: ( ( 'DIN A3' ) )
            // InternalNpl.g:3723:1: ( 'DIN A3' )
            {
             before(grammarAccess.getFormatAccess().getValueDINA3Keyword_3_0()); 
            // InternalNpl.g:3724:1: ( 'DIN A3' )
            // InternalNpl.g:3725:1: 'DIN A3'
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
    // InternalNpl.g:3740:1: rule__Format__ValueAssignment_4 : ( ( 'DIN A2' ) ) ;
    public final void rule__Format__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3744:1: ( ( ( 'DIN A2' ) ) )
            // InternalNpl.g:3745:1: ( ( 'DIN A2' ) )
            {
            // InternalNpl.g:3745:1: ( ( 'DIN A2' ) )
            // InternalNpl.g:3746:1: ( 'DIN A2' )
            {
             before(grammarAccess.getFormatAccess().getValueDINA2Keyword_4_0()); 
            // InternalNpl.g:3747:1: ( 'DIN A2' )
            // InternalNpl.g:3748:1: 'DIN A2'
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
    // InternalNpl.g:3763:1: rule__Format__ValueAssignment_5 : ( ( 'DIN A1' ) ) ;
    public final void rule__Format__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3767:1: ( ( ( 'DIN A1' ) ) )
            // InternalNpl.g:3768:1: ( ( 'DIN A1' ) )
            {
            // InternalNpl.g:3768:1: ( ( 'DIN A1' ) )
            // InternalNpl.g:3769:1: ( 'DIN A1' )
            {
             before(grammarAccess.getFormatAccess().getValueDINA1Keyword_5_0()); 
            // InternalNpl.g:3770:1: ( 'DIN A1' )
            // InternalNpl.g:3771:1: 'DIN A1'
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
    // InternalNpl.g:3786:1: rule__Format__ValueAssignment_6 : ( ( 'DIN A0' ) ) ;
    public final void rule__Format__ValueAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3790:1: ( ( ( 'DIN A0' ) ) )
            // InternalNpl.g:3791:1: ( ( 'DIN A0' ) )
            {
            // InternalNpl.g:3791:1: ( ( 'DIN A0' ) )
            // InternalNpl.g:3792:1: ( 'DIN A0' )
            {
             before(grammarAccess.getFormatAccess().getValueDINA0Keyword_6_0()); 
            // InternalNpl.g:3793:1: ( 'DIN A0' )
            // InternalNpl.g:3794:1: 'DIN A0'
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
    // InternalNpl.g:3809:1: rule__Date__DayAssignment_1 : ( RULE_INT ) ;
    public final void rule__Date__DayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3813:1: ( ( RULE_INT ) )
            // InternalNpl.g:3814:1: ( RULE_INT )
            {
            // InternalNpl.g:3814:1: ( RULE_INT )
            // InternalNpl.g:3815:1: RULE_INT
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
    // InternalNpl.g:3824:1: rule__Date__MonthAssignment_3 : ( RULE_INT ) ;
    public final void rule__Date__MonthAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3828:1: ( ( RULE_INT ) )
            // InternalNpl.g:3829:1: ( RULE_INT )
            {
            // InternalNpl.g:3829:1: ( RULE_INT )
            // InternalNpl.g:3830:1: RULE_INT
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
    // InternalNpl.g:3839:1: rule__Date__YearAssignment_5 : ( RULE_INT ) ;
    public final void rule__Date__YearAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3843:1: ( ( RULE_INT ) )
            // InternalNpl.g:3844:1: ( RULE_INT )
            {
            // InternalNpl.g:3844:1: ( RULE_INT )
            // InternalNpl.g:3845:1: RULE_INT
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
    // InternalNpl.g:3854:1: rule__Language__ValueAssignment_0 : ( ( 'English' ) ) ;
    public final void rule__Language__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3858:1: ( ( ( 'English' ) ) )
            // InternalNpl.g:3859:1: ( ( 'English' ) )
            {
            // InternalNpl.g:3859:1: ( ( 'English' ) )
            // InternalNpl.g:3860:1: ( 'English' )
            {
             before(grammarAccess.getLanguageAccess().getValueEnglishKeyword_0_0()); 
            // InternalNpl.g:3861:1: ( 'English' )
            // InternalNpl.g:3862:1: 'English'
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
    // InternalNpl.g:3877:1: rule__Language__ValueAssignment_1 : ( ( 'German' ) ) ;
    public final void rule__Language__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3881:1: ( ( ( 'German' ) ) )
            // InternalNpl.g:3882:1: ( ( 'German' ) )
            {
            // InternalNpl.g:3882:1: ( ( 'German' ) )
            // InternalNpl.g:3883:1: ( 'German' )
            {
             before(grammarAccess.getLanguageAccess().getValueGermanKeyword_1_0()); 
            // InternalNpl.g:3884:1: ( 'German' )
            // InternalNpl.g:3885:1: 'German'
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
    // InternalNpl.g:3900:1: rule__Price__ValueAssignment_1 : ( ruleFloat ) ;
    public final void rule__Price__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3904:1: ( ( ruleFloat ) )
            // InternalNpl.g:3905:1: ( ruleFloat )
            {
            // InternalNpl.g:3905:1: ( ruleFloat )
            // InternalNpl.g:3906:1: ruleFloat
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
    // InternalNpl.g:3915:1: rule__Price__CurrencyAssignment_2 : ( ruleCurrency ) ;
    public final void rule__Price__CurrencyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3919:1: ( ( ruleCurrency ) )
            // InternalNpl.g:3920:1: ( ruleCurrency )
            {
            // InternalNpl.g:3920:1: ( ruleCurrency )
            // InternalNpl.g:3921:1: ruleCurrency
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
    // InternalNpl.g:3930:1: rule__Currency__ValueAssignment_0 : ( ( 'EUR' ) ) ;
    public final void rule__Currency__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3934:1: ( ( ( 'EUR' ) ) )
            // InternalNpl.g:3935:1: ( ( 'EUR' ) )
            {
            // InternalNpl.g:3935:1: ( ( 'EUR' ) )
            // InternalNpl.g:3936:1: ( 'EUR' )
            {
             before(grammarAccess.getCurrencyAccess().getValueEURKeyword_0_0()); 
            // InternalNpl.g:3937:1: ( 'EUR' )
            // InternalNpl.g:3938:1: 'EUR'
            {
             before(grammarAccess.getCurrencyAccess().getValueEURKeyword_0_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getCurrencyAccess().getValueEURKeyword_0_0()); 

            }

             after(grammarAccess.getCurrencyAccess().getValueEURKeyword_0_0()); 

            }


            }

        }
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
    // InternalNpl.g:3953:1: rule__Currency__ValueAssignment_1 : ( ( 'DOLLAR' ) ) ;
    public final void rule__Currency__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3957:1: ( ( ( 'DOLLAR' ) ) )
            // InternalNpl.g:3958:1: ( ( 'DOLLAR' ) )
            {
            // InternalNpl.g:3958:1: ( ( 'DOLLAR' ) )
            // InternalNpl.g:3959:1: ( 'DOLLAR' )
            {
             before(grammarAccess.getCurrencyAccess().getValueDOLLARKeyword_1_0()); 
            // InternalNpl.g:3960:1: ( 'DOLLAR' )
            // InternalNpl.g:3961:1: 'DOLLAR'
            {
             before(grammarAccess.getCurrencyAccess().getValueDOLLARKeyword_1_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getCurrencyAccess().getValueDOLLARKeyword_1_0()); 

            }

             after(grammarAccess.getCurrencyAccess().getValueDOLLARKeyword_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Topic__NameAssignment_1"
    // InternalNpl.g:3976:1: rule__Topic__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Topic__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3980:1: ( ( RULE_ID ) )
            // InternalNpl.g:3981:1: ( RULE_ID )
            {
            // InternalNpl.g:3981:1: ( RULE_ID )
            // InternalNpl.g:3982:1: RULE_ID
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
    // InternalNpl.g:3991:1: rule__Topic__TagsAssignment_3 : ( ruleTopicTag ) ;
    public final void rule__Topic__TagsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:3995:1: ( ( ruleTopicTag ) )
            // InternalNpl.g:3996:1: ( ruleTopicTag )
            {
            // InternalNpl.g:3996:1: ( ruleTopicTag )
            // InternalNpl.g:3997:1: ruleTopicTag
            {
             before(grammarAccess.getTopicAccess().getTagsTopicTagParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTopicTag();

            state._fsp--;

             after(grammarAccess.getTopicAccess().getTagsTopicTagParserRuleCall_3_0()); 

            }


            }

        }
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
    // InternalNpl.g:4006:1: rule__Topic__TagsAssignment_4_1 : ( ruleTopicTag ) ;
    public final void rule__Topic__TagsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:4010:1: ( ( ruleTopicTag ) )
            // InternalNpl.g:4011:1: ( ruleTopicTag )
            {
            // InternalNpl.g:4011:1: ( ruleTopicTag )
            // InternalNpl.g:4012:1: ruleTopicTag
            {
             before(grammarAccess.getTopicAccess().getTagsTopicTagParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTopicTag();

            state._fsp--;

             after(grammarAccess.getTopicAccess().getTagsTopicTagParserRuleCall_4_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__TopicTag__ValueAssignment"
    // InternalNpl.g:4021:1: rule__TopicTag__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__TopicTag__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:4025:1: ( ( RULE_STRING ) )
            // InternalNpl.g:4026:1: ( RULE_STRING )
            {
            // InternalNpl.g:4026:1: ( RULE_STRING )
            // InternalNpl.g:4027:1: RULE_STRING
            {
             before(grammarAccess.getTopicTagAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTopicTagAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicTag__ValueAssignment"


    // $ANTLR start "rule__Pair__TypeAssignment_0"
    // InternalNpl.g:4036:1: rule__Pair__TypeAssignment_0 : ( ruleFeedType ) ;
    public final void rule__Pair__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:4040:1: ( ( ruleFeedType ) )
            // InternalNpl.g:4041:1: ( ruleFeedType )
            {
            // InternalNpl.g:4041:1: ( ruleFeedType )
            // InternalNpl.g:4042:1: ruleFeedType
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
    // InternalNpl.g:4051:1: rule__Pair__KeyAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Pair__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:4055:1: ( ( RULE_STRING ) )
            // InternalNpl.g:4056:1: ( RULE_STRING )
            {
            // InternalNpl.g:4056:1: ( RULE_STRING )
            // InternalNpl.g:4057:1: RULE_STRING
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
    // InternalNpl.g:4066:1: rule__Pair__ValueAssignment_3 : ( RULE_URL ) ;
    public final void rule__Pair__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalNpl.g:4070:1: ( ( RULE_URL ) )
            // InternalNpl.g:4071:1: ( RULE_URL )
            {
            // InternalNpl.g:4071:1: ( RULE_URL )
            // InternalNpl.g:4072:1: RULE_URL
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


    protected DFA11 dfa11 = new DFA11(this);
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

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "2779:3: ( ({...}? => ( ( ( rule__Declaration__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_8__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_9__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_10__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_11__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_12__0 ) ) ) ) | ({...}? => ( ( ( rule__Declaration__Group_13__0 ) ) ) ) | ({...}? => ( ( ( '}' ) ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_0 = input.LA(1);

                         
                        int index11_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA11_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA11_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA11_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA11_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA11_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA11_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA11_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA11_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA11_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA11_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA11_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( LA11_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 11) ) {s = 12;}

                        else if ( LA11_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 12) ) {s = 13;}

                        else if ( LA11_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 13) ) {s = 14;}

                        else if ( LA11_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeclarationAccess().getUnorderedGroup(), 14) ) {s = 15;}

                         
                        input.seek(index11_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
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

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "3053:2: ( rule__Declaration__UnorderedGroup__1 )?";
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

                        else if ( (LA12_0==EOF) ) {s = 16;}

                         
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
            return "3066:2: ( rule__Declaration__UnorderedGroup__2 )?";
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
            return "3079:2: ( rule__Declaration__UnorderedGroup__3 )?";
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
            return "3092:2: ( rule__Declaration__UnorderedGroup__4 )?";
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
            return "3105:2: ( rule__Declaration__UnorderedGroup__5 )?";
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
            return "3118:2: ( rule__Declaration__UnorderedGroup__6 )?";
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
            return "3131:2: ( rule__Declaration__UnorderedGroup__7 )?";
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
            return "3144:2: ( rule__Declaration__UnorderedGroup__8 )?";
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
            return "3157:2: ( rule__Declaration__UnorderedGroup__9 )?";
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
            return "3170:2: ( rule__Declaration__UnorderedGroup__10 )?";
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
            return "3183:2: ( rule__Declaration__UnorderedGroup__11 )?";
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
            return "3196:2: ( rule__Declaration__UnorderedGroup__12 )?";
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
            return "3209:2: ( rule__Declaration__UnorderedGroup__13 )?";
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
            return "3222:2: ( rule__Declaration__UnorderedGroup__14 )?";
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
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800080000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000043BDF90002L});

}
