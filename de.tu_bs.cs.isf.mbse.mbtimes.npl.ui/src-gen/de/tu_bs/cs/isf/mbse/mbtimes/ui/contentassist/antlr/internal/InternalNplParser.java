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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "','", "'newspaper'", "'{'", "'feed links'", "'}'", "'topics'", "'price'", "'language'", "'format'", "'number of articles per topic'", "'number of words per article'", "'-'", "'number of columns'", "'font size'", "', '", "'date'", "'location'", "'volume'", "'number of images per article'", "'small'", "'medium'", "'large'", "'DIN A6'", "'DIN A5'", "'DIN A4'", "'DIN A3'", "'DIN A2'", "'DIN A1'", "'DIN A0'", "'English'", "'German'", "'Euro [\\u20AC]'", "'Dollar [$]'", "'topic'", "':'"
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
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
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
    public String getGrammarFileName() { return "../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g"; }


     
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:60:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:61:1: ( ruleDeclaration EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:62:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration61);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration68); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:69:1: ruleDeclaration : ( ( rule__Declaration__Group__0 ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:73:2: ( ( ( rule__Declaration__Group__0 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:74:1: ( ( rule__Declaration__Group__0 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:74:1: ( ( rule__Declaration__Group__0 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:75:1: ( rule__Declaration__Group__0 )
            {
             before(grammarAccess.getDeclarationAccess().getGroup()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:76:1: ( rule__Declaration__Group__0 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:76:2: rule__Declaration__Group__0
            {
            pushFollow(FOLLOW_rule__Declaration__Group__0_in_ruleDeclaration94);
            rule__Declaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleFontSize"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:88:1: entryRuleFontSize : ruleFontSize EOF ;
    public final void entryRuleFontSize() throws RecognitionException {
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:89:1: ( ruleFontSize EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:90:1: ruleFontSize EOF
            {
             before(grammarAccess.getFontSizeRule()); 
            pushFollow(FOLLOW_ruleFontSize_in_entryRuleFontSize121);
            ruleFontSize();

            state._fsp--;

             after(grammarAccess.getFontSizeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFontSize128); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:97:1: ruleFontSize : ( ( rule__FontSize__Alternatives ) ) ;
    public final void ruleFontSize() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:101:2: ( ( ( rule__FontSize__Alternatives ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:102:1: ( ( rule__FontSize__Alternatives ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:102:1: ( ( rule__FontSize__Alternatives ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:103:1: ( rule__FontSize__Alternatives )
            {
             before(grammarAccess.getFontSizeAccess().getAlternatives()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:104:1: ( rule__FontSize__Alternatives )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:104:2: rule__FontSize__Alternatives
            {
            pushFollow(FOLLOW_rule__FontSize__Alternatives_in_ruleFontSize154);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:116:1: entryRuleFormat : ruleFormat EOF ;
    public final void entryRuleFormat() throws RecognitionException {
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:117:1: ( ruleFormat EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:118:1: ruleFormat EOF
            {
             before(grammarAccess.getFormatRule()); 
            pushFollow(FOLLOW_ruleFormat_in_entryRuleFormat181);
            ruleFormat();

            state._fsp--;

             after(grammarAccess.getFormatRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormat188); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:125:1: ruleFormat : ( ( rule__Format__Alternatives ) ) ;
    public final void ruleFormat() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:129:2: ( ( ( rule__Format__Alternatives ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:130:1: ( ( rule__Format__Alternatives ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:130:1: ( ( rule__Format__Alternatives ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:131:1: ( rule__Format__Alternatives )
            {
             before(grammarAccess.getFormatAccess().getAlternatives()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:132:1: ( rule__Format__Alternatives )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:132:2: rule__Format__Alternatives
            {
            pushFollow(FOLLOW_rule__Format__Alternatives_in_ruleFormat214);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:144:1: entryRuleDate : ruleDate EOF ;
    public final void entryRuleDate() throws RecognitionException {
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:145:1: ( ruleDate EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:146:1: ruleDate EOF
            {
             before(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_ruleDate_in_entryRuleDate241);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getDateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDate248); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:153:1: ruleDate : ( ( rule__Date__Group__0 ) ) ;
    public final void ruleDate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:157:2: ( ( ( rule__Date__Group__0 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:158:1: ( ( rule__Date__Group__0 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:158:1: ( ( rule__Date__Group__0 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:159:1: ( rule__Date__Group__0 )
            {
             before(grammarAccess.getDateAccess().getGroup()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:160:1: ( rule__Date__Group__0 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:160:2: rule__Date__Group__0
            {
            pushFollow(FOLLOW_rule__Date__Group__0_in_ruleDate274);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:172:1: entryRuleLanguage : ruleLanguage EOF ;
    public final void entryRuleLanguage() throws RecognitionException {
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:173:1: ( ruleLanguage EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:174:1: ruleLanguage EOF
            {
             before(grammarAccess.getLanguageRule()); 
            pushFollow(FOLLOW_ruleLanguage_in_entryRuleLanguage301);
            ruleLanguage();

            state._fsp--;

             after(grammarAccess.getLanguageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLanguage308); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:181:1: ruleLanguage : ( ( rule__Language__Alternatives ) ) ;
    public final void ruleLanguage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:185:2: ( ( ( rule__Language__Alternatives ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:186:1: ( ( rule__Language__Alternatives ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:186:1: ( ( rule__Language__Alternatives ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:187:1: ( rule__Language__Alternatives )
            {
             before(grammarAccess.getLanguageAccess().getAlternatives()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:188:1: ( rule__Language__Alternatives )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:188:2: rule__Language__Alternatives
            {
            pushFollow(FOLLOW_rule__Language__Alternatives_in_ruleLanguage334);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:200:1: entryRulePrice : rulePrice EOF ;
    public final void entryRulePrice() throws RecognitionException {
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:201:1: ( rulePrice EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:202:1: rulePrice EOF
            {
             before(grammarAccess.getPriceRule()); 
            pushFollow(FOLLOW_rulePrice_in_entryRulePrice361);
            rulePrice();

            state._fsp--;

             after(grammarAccess.getPriceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrice368); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:209:1: rulePrice : ( ( rule__Price__Group__0 ) ) ;
    public final void rulePrice() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:213:2: ( ( ( rule__Price__Group__0 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:214:1: ( ( rule__Price__Group__0 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:214:1: ( ( rule__Price__Group__0 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:215:1: ( rule__Price__Group__0 )
            {
             before(grammarAccess.getPriceAccess().getGroup()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:216:1: ( rule__Price__Group__0 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:216:2: rule__Price__Group__0
            {
            pushFollow(FOLLOW_rule__Price__Group__0_in_rulePrice394);
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


    // $ANTLR start "entryRuleValue"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:228:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:229:1: ( ruleValue EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:230:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue421);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue428); 

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:237:1: ruleValue : ( ( rule__Value__Group__0 ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:241:2: ( ( ( rule__Value__Group__0 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:242:1: ( ( rule__Value__Group__0 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:242:1: ( ( rule__Value__Group__0 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:243:1: ( rule__Value__Group__0 )
            {
             before(grammarAccess.getValueAccess().getGroup()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:244:1: ( rule__Value__Group__0 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:244:2: rule__Value__Group__0
            {
            pushFollow(FOLLOW_rule__Value__Group__0_in_ruleValue454);
            rule__Value__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleCurrency"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:256:1: entryRuleCurrency : ruleCurrency EOF ;
    public final void entryRuleCurrency() throws RecognitionException {
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:257:1: ( ruleCurrency EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:258:1: ruleCurrency EOF
            {
             before(grammarAccess.getCurrencyRule()); 
            pushFollow(FOLLOW_ruleCurrency_in_entryRuleCurrency481);
            ruleCurrency();

            state._fsp--;

             after(grammarAccess.getCurrencyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCurrency488); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:265:1: ruleCurrency : ( ( rule__Currency__Alternatives ) ) ;
    public final void ruleCurrency() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:269:2: ( ( ( rule__Currency__Alternatives ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:270:1: ( ( rule__Currency__Alternatives ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:270:1: ( ( rule__Currency__Alternatives ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:271:1: ( rule__Currency__Alternatives )
            {
             before(grammarAccess.getCurrencyAccess().getAlternatives()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:272:1: ( rule__Currency__Alternatives )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:272:2: rule__Currency__Alternatives
            {
            pushFollow(FOLLOW_rule__Currency__Alternatives_in_ruleCurrency514);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:284:1: entryRuleTopic : ruleTopic EOF ;
    public final void entryRuleTopic() throws RecognitionException {
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:285:1: ( ruleTopic EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:286:1: ruleTopic EOF
            {
             before(grammarAccess.getTopicRule()); 
            pushFollow(FOLLOW_ruleTopic_in_entryRuleTopic541);
            ruleTopic();

            state._fsp--;

             after(grammarAccess.getTopicRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTopic548); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:293:1: ruleTopic : ( ( rule__Topic__Group__0 ) ) ;
    public final void ruleTopic() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:297:2: ( ( ( rule__Topic__Group__0 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:298:1: ( ( rule__Topic__Group__0 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:298:1: ( ( rule__Topic__Group__0 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:299:1: ( rule__Topic__Group__0 )
            {
             before(grammarAccess.getTopicAccess().getGroup()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:300:1: ( rule__Topic__Group__0 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:300:2: rule__Topic__Group__0
            {
            pushFollow(FOLLOW_rule__Topic__Group__0_in_ruleTopic574);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:312:1: entryRuleTopicTag : ruleTopicTag EOF ;
    public final void entryRuleTopicTag() throws RecognitionException {
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:313:1: ( ruleTopicTag EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:314:1: ruleTopicTag EOF
            {
             before(grammarAccess.getTopicTagRule()); 
            pushFollow(FOLLOW_ruleTopicTag_in_entryRuleTopicTag601);
            ruleTopicTag();

            state._fsp--;

             after(grammarAccess.getTopicTagRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTopicTag608); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:321:1: ruleTopicTag : ( ( rule__TopicTag__ValueAssignment ) ) ;
    public final void ruleTopicTag() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:325:2: ( ( ( rule__TopicTag__ValueAssignment ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:326:1: ( ( rule__TopicTag__ValueAssignment ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:326:1: ( ( rule__TopicTag__ValueAssignment ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:327:1: ( rule__TopicTag__ValueAssignment )
            {
             before(grammarAccess.getTopicTagAccess().getValueAssignment()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:328:1: ( rule__TopicTag__ValueAssignment )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:328:2: rule__TopicTag__ValueAssignment
            {
            pushFollow(FOLLOW_rule__TopicTag__ValueAssignment_in_ruleTopicTag634);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:340:1: entryRulePair : rulePair EOF ;
    public final void entryRulePair() throws RecognitionException {
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:341:1: ( rulePair EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:342:1: rulePair EOF
            {
             before(grammarAccess.getPairRule()); 
            pushFollow(FOLLOW_rulePair_in_entryRulePair661);
            rulePair();

            state._fsp--;

             after(grammarAccess.getPairRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePair668); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:349:1: rulePair : ( ( rule__Pair__Group__0 ) ) ;
    public final void rulePair() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:353:2: ( ( ( rule__Pair__Group__0 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:354:1: ( ( rule__Pair__Group__0 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:354:1: ( ( rule__Pair__Group__0 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:355:1: ( rule__Pair__Group__0 )
            {
             before(grammarAccess.getPairAccess().getGroup()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:356:1: ( rule__Pair__Group__0 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:356:2: rule__Pair__Group__0
            {
            pushFollow(FOLLOW_rule__Pair__Group__0_in_rulePair694);
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


    // $ANTLR start "rule__FontSize__Alternatives"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:368:1: rule__FontSize__Alternatives : ( ( ( rule__FontSize__Group_0__0 ) ) | ( ( rule__FontSize__Group_1__0 ) ) | ( ( rule__FontSize__Group_2__0 ) ) );
    public final void rule__FontSize__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:372:1: ( ( ( rule__FontSize__Group_0__0 ) ) | ( ( rule__FontSize__Group_1__0 ) ) | ( ( rule__FontSize__Group_2__0 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt1=1;
                }
                break;
            case 32:
                {
                alt1=2;
                }
                break;
            case 33:
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
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:373:1: ( ( rule__FontSize__Group_0__0 ) )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:373:1: ( ( rule__FontSize__Group_0__0 ) )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:374:1: ( rule__FontSize__Group_0__0 )
                    {
                     before(grammarAccess.getFontSizeAccess().getGroup_0()); 
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:375:1: ( rule__FontSize__Group_0__0 )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:375:2: rule__FontSize__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__FontSize__Group_0__0_in_rule__FontSize__Alternatives730);
                    rule__FontSize__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFontSizeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:379:6: ( ( rule__FontSize__Group_1__0 ) )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:379:6: ( ( rule__FontSize__Group_1__0 ) )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:380:1: ( rule__FontSize__Group_1__0 )
                    {
                     before(grammarAccess.getFontSizeAccess().getGroup_1()); 
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:381:1: ( rule__FontSize__Group_1__0 )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:381:2: rule__FontSize__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__FontSize__Group_1__0_in_rule__FontSize__Alternatives748);
                    rule__FontSize__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFontSizeAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:385:6: ( ( rule__FontSize__Group_2__0 ) )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:385:6: ( ( rule__FontSize__Group_2__0 ) )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:386:1: ( rule__FontSize__Group_2__0 )
                    {
                     before(grammarAccess.getFontSizeAccess().getGroup_2()); 
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:387:1: ( rule__FontSize__Group_2__0 )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:387:2: rule__FontSize__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__FontSize__Group_2__0_in_rule__FontSize__Alternatives766);
                    rule__FontSize__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFontSizeAccess().getGroup_2()); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:396:1: rule__Format__Alternatives : ( ( ( rule__Format__Group_0__0 ) ) | ( ( rule__Format__Group_1__0 ) ) | ( ( rule__Format__Group_2__0 ) ) | ( ( rule__Format__Group_3__0 ) ) | ( ( rule__Format__Group_4__0 ) ) | ( ( rule__Format__Group_5__0 ) ) | ( ( rule__Format__Group_6__0 ) ) );
    public final void rule__Format__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:400:1: ( ( ( rule__Format__Group_0__0 ) ) | ( ( rule__Format__Group_1__0 ) ) | ( ( rule__Format__Group_2__0 ) ) | ( ( rule__Format__Group_3__0 ) ) | ( ( rule__Format__Group_4__0 ) ) | ( ( rule__Format__Group_5__0 ) ) | ( ( rule__Format__Group_6__0 ) ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt2=1;
                }
                break;
            case 35:
                {
                alt2=2;
                }
                break;
            case 36:
                {
                alt2=3;
                }
                break;
            case 37:
                {
                alt2=4;
                }
                break;
            case 38:
                {
                alt2=5;
                }
                break;
            case 39:
                {
                alt2=6;
                }
                break;
            case 40:
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
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:401:1: ( ( rule__Format__Group_0__0 ) )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:401:1: ( ( rule__Format__Group_0__0 ) )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:402:1: ( rule__Format__Group_0__0 )
                    {
                     before(grammarAccess.getFormatAccess().getGroup_0()); 
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:403:1: ( rule__Format__Group_0__0 )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:403:2: rule__Format__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Format__Group_0__0_in_rule__Format__Alternatives799);
                    rule__Format__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormatAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:407:6: ( ( rule__Format__Group_1__0 ) )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:407:6: ( ( rule__Format__Group_1__0 ) )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:408:1: ( rule__Format__Group_1__0 )
                    {
                     before(grammarAccess.getFormatAccess().getGroup_1()); 
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:409:1: ( rule__Format__Group_1__0 )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:409:2: rule__Format__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Format__Group_1__0_in_rule__Format__Alternatives817);
                    rule__Format__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormatAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:413:6: ( ( rule__Format__Group_2__0 ) )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:413:6: ( ( rule__Format__Group_2__0 ) )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:414:1: ( rule__Format__Group_2__0 )
                    {
                     before(grammarAccess.getFormatAccess().getGroup_2()); 
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:415:1: ( rule__Format__Group_2__0 )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:415:2: rule__Format__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Format__Group_2__0_in_rule__Format__Alternatives835);
                    rule__Format__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormatAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:419:6: ( ( rule__Format__Group_3__0 ) )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:419:6: ( ( rule__Format__Group_3__0 ) )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:420:1: ( rule__Format__Group_3__0 )
                    {
                     before(grammarAccess.getFormatAccess().getGroup_3()); 
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:421:1: ( rule__Format__Group_3__0 )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:421:2: rule__Format__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Format__Group_3__0_in_rule__Format__Alternatives853);
                    rule__Format__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormatAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:425:6: ( ( rule__Format__Group_4__0 ) )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:425:6: ( ( rule__Format__Group_4__0 ) )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:426:1: ( rule__Format__Group_4__0 )
                    {
                     before(grammarAccess.getFormatAccess().getGroup_4()); 
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:427:1: ( rule__Format__Group_4__0 )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:427:2: rule__Format__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Format__Group_4__0_in_rule__Format__Alternatives871);
                    rule__Format__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormatAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:431:6: ( ( rule__Format__Group_5__0 ) )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:431:6: ( ( rule__Format__Group_5__0 ) )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:432:1: ( rule__Format__Group_5__0 )
                    {
                     before(grammarAccess.getFormatAccess().getGroup_5()); 
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:433:1: ( rule__Format__Group_5__0 )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:433:2: rule__Format__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Format__Group_5__0_in_rule__Format__Alternatives889);
                    rule__Format__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormatAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:437:6: ( ( rule__Format__Group_6__0 ) )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:437:6: ( ( rule__Format__Group_6__0 ) )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:438:1: ( rule__Format__Group_6__0 )
                    {
                     before(grammarAccess.getFormatAccess().getGroup_6()); 
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:439:1: ( rule__Format__Group_6__0 )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:439:2: rule__Format__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Format__Group_6__0_in_rule__Format__Alternatives907);
                    rule__Format__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormatAccess().getGroup_6()); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:448:1: rule__Language__Alternatives : ( ( ( rule__Language__Group_0__0 ) ) | ( ( rule__Language__Group_1__0 ) ) );
    public final void rule__Language__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:452:1: ( ( ( rule__Language__Group_0__0 ) ) | ( ( rule__Language__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==41) ) {
                alt3=1;
            }
            else if ( (LA3_0==42) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:453:1: ( ( rule__Language__Group_0__0 ) )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:453:1: ( ( rule__Language__Group_0__0 ) )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:454:1: ( rule__Language__Group_0__0 )
                    {
                     before(grammarAccess.getLanguageAccess().getGroup_0()); 
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:455:1: ( rule__Language__Group_0__0 )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:455:2: rule__Language__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Language__Group_0__0_in_rule__Language__Alternatives940);
                    rule__Language__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLanguageAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:459:6: ( ( rule__Language__Group_1__0 ) )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:459:6: ( ( rule__Language__Group_1__0 ) )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:460:1: ( rule__Language__Group_1__0 )
                    {
                     before(grammarAccess.getLanguageAccess().getGroup_1()); 
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:461:1: ( rule__Language__Group_1__0 )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:461:2: rule__Language__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Language__Group_1__0_in_rule__Language__Alternatives958);
                    rule__Language__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLanguageAccess().getGroup_1()); 

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


    // $ANTLR start "rule__Value__Alternatives_1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:470:1: rule__Value__Alternatives_1 : ( ( '.' ) | ( ',' ) );
    public final void rule__Value__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:474:1: ( ( '.' ) | ( ',' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:475:1: ( '.' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:475:1: ( '.' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:476:1: '.'
                    {
                     before(grammarAccess.getValueAccess().getFullStopKeyword_1_0()); 
                    match(input,11,FOLLOW_11_in_rule__Value__Alternatives_1992); 
                     after(grammarAccess.getValueAccess().getFullStopKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:483:6: ( ',' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:483:6: ( ',' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:484:1: ','
                    {
                     before(grammarAccess.getValueAccess().getCommaKeyword_1_1()); 
                    match(input,12,FOLLOW_12_in_rule__Value__Alternatives_11012); 
                     after(grammarAccess.getValueAccess().getCommaKeyword_1_1()); 

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
    // $ANTLR end "rule__Value__Alternatives_1"


    // $ANTLR start "rule__Currency__Alternatives"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:496:1: rule__Currency__Alternatives : ( ( ( rule__Currency__Group_0__0 ) ) | ( ( rule__Currency__Group_1__0 ) ) );
    public final void rule__Currency__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:500:1: ( ( ( rule__Currency__Group_0__0 ) ) | ( ( rule__Currency__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==43) ) {
                alt5=1;
            }
            else if ( (LA5_0==44) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:501:1: ( ( rule__Currency__Group_0__0 ) )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:501:1: ( ( rule__Currency__Group_0__0 ) )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:502:1: ( rule__Currency__Group_0__0 )
                    {
                     before(grammarAccess.getCurrencyAccess().getGroup_0()); 
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:503:1: ( rule__Currency__Group_0__0 )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:503:2: rule__Currency__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Currency__Group_0__0_in_rule__Currency__Alternatives1046);
                    rule__Currency__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCurrencyAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:507:6: ( ( rule__Currency__Group_1__0 ) )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:507:6: ( ( rule__Currency__Group_1__0 ) )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:508:1: ( rule__Currency__Group_1__0 )
                    {
                     before(grammarAccess.getCurrencyAccess().getGroup_1()); 
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:509:1: ( rule__Currency__Group_1__0 )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:509:2: rule__Currency__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Currency__Group_1__0_in_rule__Currency__Alternatives1064);
                    rule__Currency__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCurrencyAccess().getGroup_1()); 

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


    // $ANTLR start "rule__Declaration__Group__0"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:520:1: rule__Declaration__Group__0 : rule__Declaration__Group__0__Impl rule__Declaration__Group__1 ;
    public final void rule__Declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:524:1: ( rule__Declaration__Group__0__Impl rule__Declaration__Group__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:525:2: rule__Declaration__Group__0__Impl rule__Declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group__0__Impl_in_rule__Declaration__Group__01095);
            rule__Declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__1_in_rule__Declaration__Group__01098);
            rule__Declaration__Group__1();

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
    // $ANTLR end "rule__Declaration__Group__0"


    // $ANTLR start "rule__Declaration__Group__0__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:532:1: rule__Declaration__Group__0__Impl : ( 'newspaper' ) ;
    public final void rule__Declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:536:1: ( ( 'newspaper' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:537:1: ( 'newspaper' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:537:1: ( 'newspaper' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:538:1: 'newspaper'
            {
             before(grammarAccess.getDeclarationAccess().getNewspaperKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Declaration__Group__0__Impl1126); 
             after(grammarAccess.getDeclarationAccess().getNewspaperKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__0__Impl"


    // $ANTLR start "rule__Declaration__Group__1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:551:1: rule__Declaration__Group__1 : rule__Declaration__Group__1__Impl rule__Declaration__Group__2 ;
    public final void rule__Declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:555:1: ( rule__Declaration__Group__1__Impl rule__Declaration__Group__2 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:556:2: rule__Declaration__Group__1__Impl rule__Declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Declaration__Group__1__Impl_in_rule__Declaration__Group__11157);
            rule__Declaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__2_in_rule__Declaration__Group__11160);
            rule__Declaration__Group__2();

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
    // $ANTLR end "rule__Declaration__Group__1"


    // $ANTLR start "rule__Declaration__Group__1__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:563:1: rule__Declaration__Group__1__Impl : ( ( rule__Declaration__NameAssignment_1 ) ) ;
    public final void rule__Declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:567:1: ( ( ( rule__Declaration__NameAssignment_1 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:568:1: ( ( rule__Declaration__NameAssignment_1 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:568:1: ( ( rule__Declaration__NameAssignment_1 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:569:1: ( rule__Declaration__NameAssignment_1 )
            {
             before(grammarAccess.getDeclarationAccess().getNameAssignment_1()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:570:1: ( rule__Declaration__NameAssignment_1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:570:2: rule__Declaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Declaration__NameAssignment_1_in_rule__Declaration__Group__1__Impl1187);
            rule__Declaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__1__Impl"


    // $ANTLR start "rule__Declaration__Group__2"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:580:1: rule__Declaration__Group__2 : rule__Declaration__Group__2__Impl rule__Declaration__Group__3 ;
    public final void rule__Declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:584:1: ( rule__Declaration__Group__2__Impl rule__Declaration__Group__3 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:585:2: rule__Declaration__Group__2__Impl rule__Declaration__Group__3
            {
            pushFollow(FOLLOW_rule__Declaration__Group__2__Impl_in_rule__Declaration__Group__21217);
            rule__Declaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__3_in_rule__Declaration__Group__21220);
            rule__Declaration__Group__3();

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
    // $ANTLR end "rule__Declaration__Group__2"


    // $ANTLR start "rule__Declaration__Group__2__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:592:1: rule__Declaration__Group__2__Impl : ( '{' ) ;
    public final void rule__Declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:596:1: ( ( '{' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:597:1: ( '{' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:597:1: ( '{' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:598:1: '{'
            {
             before(grammarAccess.getDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Declaration__Group__2__Impl1248); 
             after(grammarAccess.getDeclarationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__2__Impl"


    // $ANTLR start "rule__Declaration__Group__3"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:611:1: rule__Declaration__Group__3 : rule__Declaration__Group__3__Impl rule__Declaration__Group__4 ;
    public final void rule__Declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:615:1: ( rule__Declaration__Group__3__Impl rule__Declaration__Group__4 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:616:2: rule__Declaration__Group__3__Impl rule__Declaration__Group__4
            {
            pushFollow(FOLLOW_rule__Declaration__Group__3__Impl_in_rule__Declaration__Group__31279);
            rule__Declaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__4_in_rule__Declaration__Group__31282);
            rule__Declaration__Group__4();

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
    // $ANTLR end "rule__Declaration__Group__3"


    // $ANTLR start "rule__Declaration__Group__3__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:623:1: rule__Declaration__Group__3__Impl : ( 'feed links' ) ;
    public final void rule__Declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:627:1: ( ( 'feed links' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:628:1: ( 'feed links' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:628:1: ( 'feed links' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:629:1: 'feed links'
            {
             before(grammarAccess.getDeclarationAccess().getFeedLinksKeyword_3()); 
            match(input,15,FOLLOW_15_in_rule__Declaration__Group__3__Impl1310); 
             after(grammarAccess.getDeclarationAccess().getFeedLinksKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__3__Impl"


    // $ANTLR start "rule__Declaration__Group__4"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:642:1: rule__Declaration__Group__4 : rule__Declaration__Group__4__Impl rule__Declaration__Group__5 ;
    public final void rule__Declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:646:1: ( rule__Declaration__Group__4__Impl rule__Declaration__Group__5 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:647:2: rule__Declaration__Group__4__Impl rule__Declaration__Group__5
            {
            pushFollow(FOLLOW_rule__Declaration__Group__4__Impl_in_rule__Declaration__Group__41341);
            rule__Declaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__5_in_rule__Declaration__Group__41344);
            rule__Declaration__Group__5();

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
    // $ANTLR end "rule__Declaration__Group__4"


    // $ANTLR start "rule__Declaration__Group__4__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:654:1: rule__Declaration__Group__4__Impl : ( '{' ) ;
    public final void rule__Declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:658:1: ( ( '{' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:659:1: ( '{' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:659:1: ( '{' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:660:1: '{'
            {
             before(grammarAccess.getDeclarationAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__Declaration__Group__4__Impl1372); 
             after(grammarAccess.getDeclarationAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__4__Impl"


    // $ANTLR start "rule__Declaration__Group__5"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:673:1: rule__Declaration__Group__5 : rule__Declaration__Group__5__Impl rule__Declaration__Group__6 ;
    public final void rule__Declaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:677:1: ( rule__Declaration__Group__5__Impl rule__Declaration__Group__6 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:678:2: rule__Declaration__Group__5__Impl rule__Declaration__Group__6
            {
            pushFollow(FOLLOW_rule__Declaration__Group__5__Impl_in_rule__Declaration__Group__51403);
            rule__Declaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__6_in_rule__Declaration__Group__51406);
            rule__Declaration__Group__6();

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
    // $ANTLR end "rule__Declaration__Group__5"


    // $ANTLR start "rule__Declaration__Group__5__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:685:1: rule__Declaration__Group__5__Impl : ( ( rule__Declaration__FeedlinksAssignment_5 ) ) ;
    public final void rule__Declaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:689:1: ( ( ( rule__Declaration__FeedlinksAssignment_5 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:690:1: ( ( rule__Declaration__FeedlinksAssignment_5 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:690:1: ( ( rule__Declaration__FeedlinksAssignment_5 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:691:1: ( rule__Declaration__FeedlinksAssignment_5 )
            {
             before(grammarAccess.getDeclarationAccess().getFeedlinksAssignment_5()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:692:1: ( rule__Declaration__FeedlinksAssignment_5 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:692:2: rule__Declaration__FeedlinksAssignment_5
            {
            pushFollow(FOLLOW_rule__Declaration__FeedlinksAssignment_5_in_rule__Declaration__Group__5__Impl1433);
            rule__Declaration__FeedlinksAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getFeedlinksAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__5__Impl"


    // $ANTLR start "rule__Declaration__Group__6"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:702:1: rule__Declaration__Group__6 : rule__Declaration__Group__6__Impl rule__Declaration__Group__7 ;
    public final void rule__Declaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:706:1: ( rule__Declaration__Group__6__Impl rule__Declaration__Group__7 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:707:2: rule__Declaration__Group__6__Impl rule__Declaration__Group__7
            {
            pushFollow(FOLLOW_rule__Declaration__Group__6__Impl_in_rule__Declaration__Group__61463);
            rule__Declaration__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__7_in_rule__Declaration__Group__61466);
            rule__Declaration__Group__7();

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
    // $ANTLR end "rule__Declaration__Group__6"


    // $ANTLR start "rule__Declaration__Group__6__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:714:1: rule__Declaration__Group__6__Impl : ( ( rule__Declaration__Group_6__0 )* ) ;
    public final void rule__Declaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:718:1: ( ( ( rule__Declaration__Group_6__0 )* ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:719:1: ( ( rule__Declaration__Group_6__0 )* )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:719:1: ( ( rule__Declaration__Group_6__0 )* )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:720:1: ( rule__Declaration__Group_6__0 )*
            {
             before(grammarAccess.getDeclarationAccess().getGroup_6()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:721:1: ( rule__Declaration__Group_6__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==26) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:721:2: rule__Declaration__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__Declaration__Group_6__0_in_rule__Declaration__Group__6__Impl1493);
            	    rule__Declaration__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getDeclarationAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__6__Impl"


    // $ANTLR start "rule__Declaration__Group__7"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:731:1: rule__Declaration__Group__7 : rule__Declaration__Group__7__Impl rule__Declaration__Group__8 ;
    public final void rule__Declaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:735:1: ( rule__Declaration__Group__7__Impl rule__Declaration__Group__8 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:736:2: rule__Declaration__Group__7__Impl rule__Declaration__Group__8
            {
            pushFollow(FOLLOW_rule__Declaration__Group__7__Impl_in_rule__Declaration__Group__71524);
            rule__Declaration__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__8_in_rule__Declaration__Group__71527);
            rule__Declaration__Group__8();

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
    // $ANTLR end "rule__Declaration__Group__7"


    // $ANTLR start "rule__Declaration__Group__7__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:743:1: rule__Declaration__Group__7__Impl : ( '}' ) ;
    public final void rule__Declaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:747:1: ( ( '}' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:748:1: ( '}' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:748:1: ( '}' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:749:1: '}'
            {
             before(grammarAccess.getDeclarationAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FOLLOW_16_in_rule__Declaration__Group__7__Impl1555); 
             after(grammarAccess.getDeclarationAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__7__Impl"


    // $ANTLR start "rule__Declaration__Group__8"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:762:1: rule__Declaration__Group__8 : rule__Declaration__Group__8__Impl rule__Declaration__Group__9 ;
    public final void rule__Declaration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:766:1: ( rule__Declaration__Group__8__Impl rule__Declaration__Group__9 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:767:2: rule__Declaration__Group__8__Impl rule__Declaration__Group__9
            {
            pushFollow(FOLLOW_rule__Declaration__Group__8__Impl_in_rule__Declaration__Group__81586);
            rule__Declaration__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__9_in_rule__Declaration__Group__81589);
            rule__Declaration__Group__9();

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
    // $ANTLR end "rule__Declaration__Group__8"


    // $ANTLR start "rule__Declaration__Group__8__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:774:1: rule__Declaration__Group__8__Impl : ( 'topics' ) ;
    public final void rule__Declaration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:778:1: ( ( 'topics' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:779:1: ( 'topics' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:779:1: ( 'topics' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:780:1: 'topics'
            {
             before(grammarAccess.getDeclarationAccess().getTopicsKeyword_8()); 
            match(input,17,FOLLOW_17_in_rule__Declaration__Group__8__Impl1617); 
             after(grammarAccess.getDeclarationAccess().getTopicsKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__8__Impl"


    // $ANTLR start "rule__Declaration__Group__9"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:793:1: rule__Declaration__Group__9 : rule__Declaration__Group__9__Impl rule__Declaration__Group__10 ;
    public final void rule__Declaration__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:797:1: ( rule__Declaration__Group__9__Impl rule__Declaration__Group__10 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:798:2: rule__Declaration__Group__9__Impl rule__Declaration__Group__10
            {
            pushFollow(FOLLOW_rule__Declaration__Group__9__Impl_in_rule__Declaration__Group__91648);
            rule__Declaration__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__10_in_rule__Declaration__Group__91651);
            rule__Declaration__Group__10();

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
    // $ANTLR end "rule__Declaration__Group__9"


    // $ANTLR start "rule__Declaration__Group__9__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:805:1: rule__Declaration__Group__9__Impl : ( '{' ) ;
    public final void rule__Declaration__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:809:1: ( ( '{' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:810:1: ( '{' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:810:1: ( '{' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:811:1: '{'
            {
             before(grammarAccess.getDeclarationAccess().getLeftCurlyBracketKeyword_9()); 
            match(input,14,FOLLOW_14_in_rule__Declaration__Group__9__Impl1679); 
             after(grammarAccess.getDeclarationAccess().getLeftCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__9__Impl"


    // $ANTLR start "rule__Declaration__Group__10"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:824:1: rule__Declaration__Group__10 : rule__Declaration__Group__10__Impl rule__Declaration__Group__11 ;
    public final void rule__Declaration__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:828:1: ( rule__Declaration__Group__10__Impl rule__Declaration__Group__11 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:829:2: rule__Declaration__Group__10__Impl rule__Declaration__Group__11
            {
            pushFollow(FOLLOW_rule__Declaration__Group__10__Impl_in_rule__Declaration__Group__101710);
            rule__Declaration__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__11_in_rule__Declaration__Group__101713);
            rule__Declaration__Group__11();

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
    // $ANTLR end "rule__Declaration__Group__10"


    // $ANTLR start "rule__Declaration__Group__10__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:836:1: rule__Declaration__Group__10__Impl : ( ( rule__Declaration__TopicsAssignment_10 ) ) ;
    public final void rule__Declaration__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:840:1: ( ( ( rule__Declaration__TopicsAssignment_10 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:841:1: ( ( rule__Declaration__TopicsAssignment_10 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:841:1: ( ( rule__Declaration__TopicsAssignment_10 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:842:1: ( rule__Declaration__TopicsAssignment_10 )
            {
             before(grammarAccess.getDeclarationAccess().getTopicsAssignment_10()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:843:1: ( rule__Declaration__TopicsAssignment_10 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:843:2: rule__Declaration__TopicsAssignment_10
            {
            pushFollow(FOLLOW_rule__Declaration__TopicsAssignment_10_in_rule__Declaration__Group__10__Impl1740);
            rule__Declaration__TopicsAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getTopicsAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__10__Impl"


    // $ANTLR start "rule__Declaration__Group__11"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:853:1: rule__Declaration__Group__11 : rule__Declaration__Group__11__Impl rule__Declaration__Group__12 ;
    public final void rule__Declaration__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:857:1: ( rule__Declaration__Group__11__Impl rule__Declaration__Group__12 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:858:2: rule__Declaration__Group__11__Impl rule__Declaration__Group__12
            {
            pushFollow(FOLLOW_rule__Declaration__Group__11__Impl_in_rule__Declaration__Group__111770);
            rule__Declaration__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__12_in_rule__Declaration__Group__111773);
            rule__Declaration__Group__12();

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
    // $ANTLR end "rule__Declaration__Group__11"


    // $ANTLR start "rule__Declaration__Group__11__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:865:1: rule__Declaration__Group__11__Impl : ( ( rule__Declaration__TopicsAssignment_11 )* ) ;
    public final void rule__Declaration__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:869:1: ( ( ( rule__Declaration__TopicsAssignment_11 )* ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:870:1: ( ( rule__Declaration__TopicsAssignment_11 )* )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:870:1: ( ( rule__Declaration__TopicsAssignment_11 )* )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:871:1: ( rule__Declaration__TopicsAssignment_11 )*
            {
             before(grammarAccess.getDeclarationAccess().getTopicsAssignment_11()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:872:1: ( rule__Declaration__TopicsAssignment_11 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==45) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:872:2: rule__Declaration__TopicsAssignment_11
            	    {
            	    pushFollow(FOLLOW_rule__Declaration__TopicsAssignment_11_in_rule__Declaration__Group__11__Impl1800);
            	    rule__Declaration__TopicsAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getDeclarationAccess().getTopicsAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__11__Impl"


    // $ANTLR start "rule__Declaration__Group__12"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:882:1: rule__Declaration__Group__12 : rule__Declaration__Group__12__Impl rule__Declaration__Group__13 ;
    public final void rule__Declaration__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:886:1: ( rule__Declaration__Group__12__Impl rule__Declaration__Group__13 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:887:2: rule__Declaration__Group__12__Impl rule__Declaration__Group__13
            {
            pushFollow(FOLLOW_rule__Declaration__Group__12__Impl_in_rule__Declaration__Group__121831);
            rule__Declaration__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__13_in_rule__Declaration__Group__121834);
            rule__Declaration__Group__13();

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
    // $ANTLR end "rule__Declaration__Group__12"


    // $ANTLR start "rule__Declaration__Group__12__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:894:1: rule__Declaration__Group__12__Impl : ( '}' ) ;
    public final void rule__Declaration__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:898:1: ( ( '}' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:899:1: ( '}' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:899:1: ( '}' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:900:1: '}'
            {
             before(grammarAccess.getDeclarationAccess().getRightCurlyBracketKeyword_12()); 
            match(input,16,FOLLOW_16_in_rule__Declaration__Group__12__Impl1862); 
             after(grammarAccess.getDeclarationAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__12__Impl"


    // $ANTLR start "rule__Declaration__Group__13"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:913:1: rule__Declaration__Group__13 : rule__Declaration__Group__13__Impl rule__Declaration__Group__14 ;
    public final void rule__Declaration__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:917:1: ( rule__Declaration__Group__13__Impl rule__Declaration__Group__14 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:918:2: rule__Declaration__Group__13__Impl rule__Declaration__Group__14
            {
            pushFollow(FOLLOW_rule__Declaration__Group__13__Impl_in_rule__Declaration__Group__131893);
            rule__Declaration__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__14_in_rule__Declaration__Group__131896);
            rule__Declaration__Group__14();

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
    // $ANTLR end "rule__Declaration__Group__13"


    // $ANTLR start "rule__Declaration__Group__13__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:925:1: rule__Declaration__Group__13__Impl : ( ( rule__Declaration__Group_13__0 )? ) ;
    public final void rule__Declaration__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:929:1: ( ( ( rule__Declaration__Group_13__0 )? ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:930:1: ( ( rule__Declaration__Group_13__0 )? )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:930:1: ( ( rule__Declaration__Group_13__0 )? )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:931:1: ( rule__Declaration__Group_13__0 )?
            {
             before(grammarAccess.getDeclarationAccess().getGroup_13()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:932:1: ( rule__Declaration__Group_13__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:932:2: rule__Declaration__Group_13__0
                    {
                    pushFollow(FOLLOW_rule__Declaration__Group_13__0_in_rule__Declaration__Group__13__Impl1923);
                    rule__Declaration__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeclarationAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__13__Impl"


    // $ANTLR start "rule__Declaration__Group__14"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:942:1: rule__Declaration__Group__14 : rule__Declaration__Group__14__Impl rule__Declaration__Group__15 ;
    public final void rule__Declaration__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:946:1: ( rule__Declaration__Group__14__Impl rule__Declaration__Group__15 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:947:2: rule__Declaration__Group__14__Impl rule__Declaration__Group__15
            {
            pushFollow(FOLLOW_rule__Declaration__Group__14__Impl_in_rule__Declaration__Group__141954);
            rule__Declaration__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__15_in_rule__Declaration__Group__141957);
            rule__Declaration__Group__15();

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
    // $ANTLR end "rule__Declaration__Group__14"


    // $ANTLR start "rule__Declaration__Group__14__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:954:1: rule__Declaration__Group__14__Impl : ( ( rule__Declaration__Group_14__0 )? ) ;
    public final void rule__Declaration__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:958:1: ( ( ( rule__Declaration__Group_14__0 )? ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:959:1: ( ( rule__Declaration__Group_14__0 )? )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:959:1: ( ( rule__Declaration__Group_14__0 )? )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:960:1: ( rule__Declaration__Group_14__0 )?
            {
             before(grammarAccess.getDeclarationAccess().getGroup_14()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:961:1: ( rule__Declaration__Group_14__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:961:2: rule__Declaration__Group_14__0
                    {
                    pushFollow(FOLLOW_rule__Declaration__Group_14__0_in_rule__Declaration__Group__14__Impl1984);
                    rule__Declaration__Group_14__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeclarationAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__14__Impl"


    // $ANTLR start "rule__Declaration__Group__15"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:971:1: rule__Declaration__Group__15 : rule__Declaration__Group__15__Impl rule__Declaration__Group__16 ;
    public final void rule__Declaration__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:975:1: ( rule__Declaration__Group__15__Impl rule__Declaration__Group__16 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:976:2: rule__Declaration__Group__15__Impl rule__Declaration__Group__16
            {
            pushFollow(FOLLOW_rule__Declaration__Group__15__Impl_in_rule__Declaration__Group__152015);
            rule__Declaration__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__16_in_rule__Declaration__Group__152018);
            rule__Declaration__Group__16();

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
    // $ANTLR end "rule__Declaration__Group__15"


    // $ANTLR start "rule__Declaration__Group__15__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:983:1: rule__Declaration__Group__15__Impl : ( 'price' ) ;
    public final void rule__Declaration__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:987:1: ( ( 'price' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:988:1: ( 'price' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:988:1: ( 'price' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:989:1: 'price'
            {
             before(grammarAccess.getDeclarationAccess().getPriceKeyword_15()); 
            match(input,18,FOLLOW_18_in_rule__Declaration__Group__15__Impl2046); 
             after(grammarAccess.getDeclarationAccess().getPriceKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__15__Impl"


    // $ANTLR start "rule__Declaration__Group__16"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1002:1: rule__Declaration__Group__16 : rule__Declaration__Group__16__Impl rule__Declaration__Group__17 ;
    public final void rule__Declaration__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1006:1: ( rule__Declaration__Group__16__Impl rule__Declaration__Group__17 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1007:2: rule__Declaration__Group__16__Impl rule__Declaration__Group__17
            {
            pushFollow(FOLLOW_rule__Declaration__Group__16__Impl_in_rule__Declaration__Group__162077);
            rule__Declaration__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__17_in_rule__Declaration__Group__162080);
            rule__Declaration__Group__17();

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
    // $ANTLR end "rule__Declaration__Group__16"


    // $ANTLR start "rule__Declaration__Group__16__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1014:1: rule__Declaration__Group__16__Impl : ( ( rule__Declaration__PriceAssignment_16 ) ) ;
    public final void rule__Declaration__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1018:1: ( ( ( rule__Declaration__PriceAssignment_16 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1019:1: ( ( rule__Declaration__PriceAssignment_16 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1019:1: ( ( rule__Declaration__PriceAssignment_16 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1020:1: ( rule__Declaration__PriceAssignment_16 )
            {
             before(grammarAccess.getDeclarationAccess().getPriceAssignment_16()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1021:1: ( rule__Declaration__PriceAssignment_16 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1021:2: rule__Declaration__PriceAssignment_16
            {
            pushFollow(FOLLOW_rule__Declaration__PriceAssignment_16_in_rule__Declaration__Group__16__Impl2107);
            rule__Declaration__PriceAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getPriceAssignment_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__16__Impl"


    // $ANTLR start "rule__Declaration__Group__17"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1031:1: rule__Declaration__Group__17 : rule__Declaration__Group__17__Impl rule__Declaration__Group__18 ;
    public final void rule__Declaration__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1035:1: ( rule__Declaration__Group__17__Impl rule__Declaration__Group__18 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1036:2: rule__Declaration__Group__17__Impl rule__Declaration__Group__18
            {
            pushFollow(FOLLOW_rule__Declaration__Group__17__Impl_in_rule__Declaration__Group__172137);
            rule__Declaration__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__18_in_rule__Declaration__Group__172140);
            rule__Declaration__Group__18();

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
    // $ANTLR end "rule__Declaration__Group__17"


    // $ANTLR start "rule__Declaration__Group__17__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1043:1: rule__Declaration__Group__17__Impl : ( ( rule__Declaration__Group_17__0 )? ) ;
    public final void rule__Declaration__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1047:1: ( ( ( rule__Declaration__Group_17__0 )? ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1048:1: ( ( rule__Declaration__Group_17__0 )? )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1048:1: ( ( rule__Declaration__Group_17__0 )? )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1049:1: ( rule__Declaration__Group_17__0 )?
            {
             before(grammarAccess.getDeclarationAccess().getGroup_17()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1050:1: ( rule__Declaration__Group_17__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1050:2: rule__Declaration__Group_17__0
                    {
                    pushFollow(FOLLOW_rule__Declaration__Group_17__0_in_rule__Declaration__Group__17__Impl2167);
                    rule__Declaration__Group_17__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeclarationAccess().getGroup_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__17__Impl"


    // $ANTLR start "rule__Declaration__Group__18"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1060:1: rule__Declaration__Group__18 : rule__Declaration__Group__18__Impl rule__Declaration__Group__19 ;
    public final void rule__Declaration__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1064:1: ( rule__Declaration__Group__18__Impl rule__Declaration__Group__19 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1065:2: rule__Declaration__Group__18__Impl rule__Declaration__Group__19
            {
            pushFollow(FOLLOW_rule__Declaration__Group__18__Impl_in_rule__Declaration__Group__182198);
            rule__Declaration__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__19_in_rule__Declaration__Group__182201);
            rule__Declaration__Group__19();

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
    // $ANTLR end "rule__Declaration__Group__18"


    // $ANTLR start "rule__Declaration__Group__18__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1072:1: rule__Declaration__Group__18__Impl : ( 'language' ) ;
    public final void rule__Declaration__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1076:1: ( ( 'language' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1077:1: ( 'language' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1077:1: ( 'language' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1078:1: 'language'
            {
             before(grammarAccess.getDeclarationAccess().getLanguageKeyword_18()); 
            match(input,19,FOLLOW_19_in_rule__Declaration__Group__18__Impl2229); 
             after(grammarAccess.getDeclarationAccess().getLanguageKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__18__Impl"


    // $ANTLR start "rule__Declaration__Group__19"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1091:1: rule__Declaration__Group__19 : rule__Declaration__Group__19__Impl rule__Declaration__Group__20 ;
    public final void rule__Declaration__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1095:1: ( rule__Declaration__Group__19__Impl rule__Declaration__Group__20 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1096:2: rule__Declaration__Group__19__Impl rule__Declaration__Group__20
            {
            pushFollow(FOLLOW_rule__Declaration__Group__19__Impl_in_rule__Declaration__Group__192260);
            rule__Declaration__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__20_in_rule__Declaration__Group__192263);
            rule__Declaration__Group__20();

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
    // $ANTLR end "rule__Declaration__Group__19"


    // $ANTLR start "rule__Declaration__Group__19__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1103:1: rule__Declaration__Group__19__Impl : ( ( rule__Declaration__LanguageAssignment_19 ) ) ;
    public final void rule__Declaration__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1107:1: ( ( ( rule__Declaration__LanguageAssignment_19 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1108:1: ( ( rule__Declaration__LanguageAssignment_19 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1108:1: ( ( rule__Declaration__LanguageAssignment_19 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1109:1: ( rule__Declaration__LanguageAssignment_19 )
            {
             before(grammarAccess.getDeclarationAccess().getLanguageAssignment_19()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1110:1: ( rule__Declaration__LanguageAssignment_19 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1110:2: rule__Declaration__LanguageAssignment_19
            {
            pushFollow(FOLLOW_rule__Declaration__LanguageAssignment_19_in_rule__Declaration__Group__19__Impl2290);
            rule__Declaration__LanguageAssignment_19();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getLanguageAssignment_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__19__Impl"


    // $ANTLR start "rule__Declaration__Group__20"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1120:1: rule__Declaration__Group__20 : rule__Declaration__Group__20__Impl rule__Declaration__Group__21 ;
    public final void rule__Declaration__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1124:1: ( rule__Declaration__Group__20__Impl rule__Declaration__Group__21 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1125:2: rule__Declaration__Group__20__Impl rule__Declaration__Group__21
            {
            pushFollow(FOLLOW_rule__Declaration__Group__20__Impl_in_rule__Declaration__Group__202320);
            rule__Declaration__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__21_in_rule__Declaration__Group__202323);
            rule__Declaration__Group__21();

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
    // $ANTLR end "rule__Declaration__Group__20"


    // $ANTLR start "rule__Declaration__Group__20__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1132:1: rule__Declaration__Group__20__Impl : ( 'format' ) ;
    public final void rule__Declaration__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1136:1: ( ( 'format' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1137:1: ( 'format' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1137:1: ( 'format' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1138:1: 'format'
            {
             before(grammarAccess.getDeclarationAccess().getFormatKeyword_20()); 
            match(input,20,FOLLOW_20_in_rule__Declaration__Group__20__Impl2351); 
             after(grammarAccess.getDeclarationAccess().getFormatKeyword_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__20__Impl"


    // $ANTLR start "rule__Declaration__Group__21"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1151:1: rule__Declaration__Group__21 : rule__Declaration__Group__21__Impl rule__Declaration__Group__22 ;
    public final void rule__Declaration__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1155:1: ( rule__Declaration__Group__21__Impl rule__Declaration__Group__22 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1156:2: rule__Declaration__Group__21__Impl rule__Declaration__Group__22
            {
            pushFollow(FOLLOW_rule__Declaration__Group__21__Impl_in_rule__Declaration__Group__212382);
            rule__Declaration__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__22_in_rule__Declaration__Group__212385);
            rule__Declaration__Group__22();

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
    // $ANTLR end "rule__Declaration__Group__21"


    // $ANTLR start "rule__Declaration__Group__21__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1163:1: rule__Declaration__Group__21__Impl : ( ( rule__Declaration__FormatAssignment_21 ) ) ;
    public final void rule__Declaration__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1167:1: ( ( ( rule__Declaration__FormatAssignment_21 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1168:1: ( ( rule__Declaration__FormatAssignment_21 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1168:1: ( ( rule__Declaration__FormatAssignment_21 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1169:1: ( rule__Declaration__FormatAssignment_21 )
            {
             before(grammarAccess.getDeclarationAccess().getFormatAssignment_21()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1170:1: ( rule__Declaration__FormatAssignment_21 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1170:2: rule__Declaration__FormatAssignment_21
            {
            pushFollow(FOLLOW_rule__Declaration__FormatAssignment_21_in_rule__Declaration__Group__21__Impl2412);
            rule__Declaration__FormatAssignment_21();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getFormatAssignment_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__21__Impl"


    // $ANTLR start "rule__Declaration__Group__22"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1180:1: rule__Declaration__Group__22 : rule__Declaration__Group__22__Impl rule__Declaration__Group__23 ;
    public final void rule__Declaration__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1184:1: ( rule__Declaration__Group__22__Impl rule__Declaration__Group__23 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1185:2: rule__Declaration__Group__22__Impl rule__Declaration__Group__23
            {
            pushFollow(FOLLOW_rule__Declaration__Group__22__Impl_in_rule__Declaration__Group__222442);
            rule__Declaration__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__23_in_rule__Declaration__Group__222445);
            rule__Declaration__Group__23();

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
    // $ANTLR end "rule__Declaration__Group__22"


    // $ANTLR start "rule__Declaration__Group__22__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1192:1: rule__Declaration__Group__22__Impl : ( 'number of articles per topic' ) ;
    public final void rule__Declaration__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1196:1: ( ( 'number of articles per topic' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1197:1: ( 'number of articles per topic' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1197:1: ( 'number of articles per topic' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1198:1: 'number of articles per topic'
            {
             before(grammarAccess.getDeclarationAccess().getNumberOfArticlesPerTopicKeyword_22()); 
            match(input,21,FOLLOW_21_in_rule__Declaration__Group__22__Impl2473); 
             after(grammarAccess.getDeclarationAccess().getNumberOfArticlesPerTopicKeyword_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__22__Impl"


    // $ANTLR start "rule__Declaration__Group__23"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1211:1: rule__Declaration__Group__23 : rule__Declaration__Group__23__Impl rule__Declaration__Group__24 ;
    public final void rule__Declaration__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1215:1: ( rule__Declaration__Group__23__Impl rule__Declaration__Group__24 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1216:2: rule__Declaration__Group__23__Impl rule__Declaration__Group__24
            {
            pushFollow(FOLLOW_rule__Declaration__Group__23__Impl_in_rule__Declaration__Group__232504);
            rule__Declaration__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__24_in_rule__Declaration__Group__232507);
            rule__Declaration__Group__24();

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
    // $ANTLR end "rule__Declaration__Group__23"


    // $ANTLR start "rule__Declaration__Group__23__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1223:1: rule__Declaration__Group__23__Impl : ( ( rule__Declaration__ArticleCntAssignment_23 ) ) ;
    public final void rule__Declaration__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1227:1: ( ( ( rule__Declaration__ArticleCntAssignment_23 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1228:1: ( ( rule__Declaration__ArticleCntAssignment_23 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1228:1: ( ( rule__Declaration__ArticleCntAssignment_23 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1229:1: ( rule__Declaration__ArticleCntAssignment_23 )
            {
             before(grammarAccess.getDeclarationAccess().getArticleCntAssignment_23()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1230:1: ( rule__Declaration__ArticleCntAssignment_23 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1230:2: rule__Declaration__ArticleCntAssignment_23
            {
            pushFollow(FOLLOW_rule__Declaration__ArticleCntAssignment_23_in_rule__Declaration__Group__23__Impl2534);
            rule__Declaration__ArticleCntAssignment_23();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getArticleCntAssignment_23()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__23__Impl"


    // $ANTLR start "rule__Declaration__Group__24"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1240:1: rule__Declaration__Group__24 : rule__Declaration__Group__24__Impl rule__Declaration__Group__25 ;
    public final void rule__Declaration__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1244:1: ( rule__Declaration__Group__24__Impl rule__Declaration__Group__25 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1245:2: rule__Declaration__Group__24__Impl rule__Declaration__Group__25
            {
            pushFollow(FOLLOW_rule__Declaration__Group__24__Impl_in_rule__Declaration__Group__242564);
            rule__Declaration__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__25_in_rule__Declaration__Group__242567);
            rule__Declaration__Group__25();

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
    // $ANTLR end "rule__Declaration__Group__24"


    // $ANTLR start "rule__Declaration__Group__24__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1252:1: rule__Declaration__Group__24__Impl : ( 'number of words per article' ) ;
    public final void rule__Declaration__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1256:1: ( ( 'number of words per article' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1257:1: ( 'number of words per article' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1257:1: ( 'number of words per article' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1258:1: 'number of words per article'
            {
             before(grammarAccess.getDeclarationAccess().getNumberOfWordsPerArticleKeyword_24()); 
            match(input,22,FOLLOW_22_in_rule__Declaration__Group__24__Impl2595); 
             after(grammarAccess.getDeclarationAccess().getNumberOfWordsPerArticleKeyword_24()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__24__Impl"


    // $ANTLR start "rule__Declaration__Group__25"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1271:1: rule__Declaration__Group__25 : rule__Declaration__Group__25__Impl rule__Declaration__Group__26 ;
    public final void rule__Declaration__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1275:1: ( rule__Declaration__Group__25__Impl rule__Declaration__Group__26 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1276:2: rule__Declaration__Group__25__Impl rule__Declaration__Group__26
            {
            pushFollow(FOLLOW_rule__Declaration__Group__25__Impl_in_rule__Declaration__Group__252626);
            rule__Declaration__Group__25__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__26_in_rule__Declaration__Group__252629);
            rule__Declaration__Group__26();

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
    // $ANTLR end "rule__Declaration__Group__25"


    // $ANTLR start "rule__Declaration__Group__25__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1283:1: rule__Declaration__Group__25__Impl : ( ( rule__Declaration__ArticleCharMinAssignment_25 ) ) ;
    public final void rule__Declaration__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1287:1: ( ( ( rule__Declaration__ArticleCharMinAssignment_25 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1288:1: ( ( rule__Declaration__ArticleCharMinAssignment_25 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1288:1: ( ( rule__Declaration__ArticleCharMinAssignment_25 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1289:1: ( rule__Declaration__ArticleCharMinAssignment_25 )
            {
             before(grammarAccess.getDeclarationAccess().getArticleCharMinAssignment_25()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1290:1: ( rule__Declaration__ArticleCharMinAssignment_25 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1290:2: rule__Declaration__ArticleCharMinAssignment_25
            {
            pushFollow(FOLLOW_rule__Declaration__ArticleCharMinAssignment_25_in_rule__Declaration__Group__25__Impl2656);
            rule__Declaration__ArticleCharMinAssignment_25();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getArticleCharMinAssignment_25()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__25__Impl"


    // $ANTLR start "rule__Declaration__Group__26"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1300:1: rule__Declaration__Group__26 : rule__Declaration__Group__26__Impl rule__Declaration__Group__27 ;
    public final void rule__Declaration__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1304:1: ( rule__Declaration__Group__26__Impl rule__Declaration__Group__27 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1305:2: rule__Declaration__Group__26__Impl rule__Declaration__Group__27
            {
            pushFollow(FOLLOW_rule__Declaration__Group__26__Impl_in_rule__Declaration__Group__262686);
            rule__Declaration__Group__26__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__27_in_rule__Declaration__Group__262689);
            rule__Declaration__Group__27();

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
    // $ANTLR end "rule__Declaration__Group__26"


    // $ANTLR start "rule__Declaration__Group__26__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1312:1: rule__Declaration__Group__26__Impl : ( '-' ) ;
    public final void rule__Declaration__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1316:1: ( ( '-' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1317:1: ( '-' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1317:1: ( '-' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1318:1: '-'
            {
             before(grammarAccess.getDeclarationAccess().getHyphenMinusKeyword_26()); 
            match(input,23,FOLLOW_23_in_rule__Declaration__Group__26__Impl2717); 
             after(grammarAccess.getDeclarationAccess().getHyphenMinusKeyword_26()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__26__Impl"


    // $ANTLR start "rule__Declaration__Group__27"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1331:1: rule__Declaration__Group__27 : rule__Declaration__Group__27__Impl rule__Declaration__Group__28 ;
    public final void rule__Declaration__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1335:1: ( rule__Declaration__Group__27__Impl rule__Declaration__Group__28 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1336:2: rule__Declaration__Group__27__Impl rule__Declaration__Group__28
            {
            pushFollow(FOLLOW_rule__Declaration__Group__27__Impl_in_rule__Declaration__Group__272748);
            rule__Declaration__Group__27__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__28_in_rule__Declaration__Group__272751);
            rule__Declaration__Group__28();

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
    // $ANTLR end "rule__Declaration__Group__27"


    // $ANTLR start "rule__Declaration__Group__27__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1343:1: rule__Declaration__Group__27__Impl : ( ( rule__Declaration__ArticleCharMaxAssignment_27 ) ) ;
    public final void rule__Declaration__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1347:1: ( ( ( rule__Declaration__ArticleCharMaxAssignment_27 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1348:1: ( ( rule__Declaration__ArticleCharMaxAssignment_27 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1348:1: ( ( rule__Declaration__ArticleCharMaxAssignment_27 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1349:1: ( rule__Declaration__ArticleCharMaxAssignment_27 )
            {
             before(grammarAccess.getDeclarationAccess().getArticleCharMaxAssignment_27()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1350:1: ( rule__Declaration__ArticleCharMaxAssignment_27 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1350:2: rule__Declaration__ArticleCharMaxAssignment_27
            {
            pushFollow(FOLLOW_rule__Declaration__ArticleCharMaxAssignment_27_in_rule__Declaration__Group__27__Impl2778);
            rule__Declaration__ArticleCharMaxAssignment_27();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getArticleCharMaxAssignment_27()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__27__Impl"


    // $ANTLR start "rule__Declaration__Group__28"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1360:1: rule__Declaration__Group__28 : rule__Declaration__Group__28__Impl rule__Declaration__Group__29 ;
    public final void rule__Declaration__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1364:1: ( rule__Declaration__Group__28__Impl rule__Declaration__Group__29 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1365:2: rule__Declaration__Group__28__Impl rule__Declaration__Group__29
            {
            pushFollow(FOLLOW_rule__Declaration__Group__28__Impl_in_rule__Declaration__Group__282808);
            rule__Declaration__Group__28__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__29_in_rule__Declaration__Group__282811);
            rule__Declaration__Group__29();

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
    // $ANTLR end "rule__Declaration__Group__28"


    // $ANTLR start "rule__Declaration__Group__28__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1372:1: rule__Declaration__Group__28__Impl : ( ( rule__Declaration__Group_28__0 )? ) ;
    public final void rule__Declaration__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1376:1: ( ( ( rule__Declaration__Group_28__0 )? ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1377:1: ( ( rule__Declaration__Group_28__0 )? )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1377:1: ( ( rule__Declaration__Group_28__0 )? )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1378:1: ( rule__Declaration__Group_28__0 )?
            {
             before(grammarAccess.getDeclarationAccess().getGroup_28()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1379:1: ( rule__Declaration__Group_28__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1379:2: rule__Declaration__Group_28__0
                    {
                    pushFollow(FOLLOW_rule__Declaration__Group_28__0_in_rule__Declaration__Group__28__Impl2838);
                    rule__Declaration__Group_28__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeclarationAccess().getGroup_28()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__28__Impl"


    // $ANTLR start "rule__Declaration__Group__29"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1389:1: rule__Declaration__Group__29 : rule__Declaration__Group__29__Impl rule__Declaration__Group__30 ;
    public final void rule__Declaration__Group__29() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1393:1: ( rule__Declaration__Group__29__Impl rule__Declaration__Group__30 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1394:2: rule__Declaration__Group__29__Impl rule__Declaration__Group__30
            {
            pushFollow(FOLLOW_rule__Declaration__Group__29__Impl_in_rule__Declaration__Group__292869);
            rule__Declaration__Group__29__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__30_in_rule__Declaration__Group__292872);
            rule__Declaration__Group__30();

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
    // $ANTLR end "rule__Declaration__Group__29"


    // $ANTLR start "rule__Declaration__Group__29__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1401:1: rule__Declaration__Group__29__Impl : ( 'number of columns' ) ;
    public final void rule__Declaration__Group__29__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1405:1: ( ( 'number of columns' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1406:1: ( 'number of columns' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1406:1: ( 'number of columns' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1407:1: 'number of columns'
            {
             before(grammarAccess.getDeclarationAccess().getNumberOfColumnsKeyword_29()); 
            match(input,24,FOLLOW_24_in_rule__Declaration__Group__29__Impl2900); 
             after(grammarAccess.getDeclarationAccess().getNumberOfColumnsKeyword_29()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__29__Impl"


    // $ANTLR start "rule__Declaration__Group__30"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1420:1: rule__Declaration__Group__30 : rule__Declaration__Group__30__Impl rule__Declaration__Group__31 ;
    public final void rule__Declaration__Group__30() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1424:1: ( rule__Declaration__Group__30__Impl rule__Declaration__Group__31 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1425:2: rule__Declaration__Group__30__Impl rule__Declaration__Group__31
            {
            pushFollow(FOLLOW_rule__Declaration__Group__30__Impl_in_rule__Declaration__Group__302931);
            rule__Declaration__Group__30__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__31_in_rule__Declaration__Group__302934);
            rule__Declaration__Group__31();

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
    // $ANTLR end "rule__Declaration__Group__30"


    // $ANTLR start "rule__Declaration__Group__30__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1432:1: rule__Declaration__Group__30__Impl : ( ( rule__Declaration__ColumnsCntAssignment_30 ) ) ;
    public final void rule__Declaration__Group__30__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1436:1: ( ( ( rule__Declaration__ColumnsCntAssignment_30 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1437:1: ( ( rule__Declaration__ColumnsCntAssignment_30 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1437:1: ( ( rule__Declaration__ColumnsCntAssignment_30 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1438:1: ( rule__Declaration__ColumnsCntAssignment_30 )
            {
             before(grammarAccess.getDeclarationAccess().getColumnsCntAssignment_30()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1439:1: ( rule__Declaration__ColumnsCntAssignment_30 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1439:2: rule__Declaration__ColumnsCntAssignment_30
            {
            pushFollow(FOLLOW_rule__Declaration__ColumnsCntAssignment_30_in_rule__Declaration__Group__30__Impl2961);
            rule__Declaration__ColumnsCntAssignment_30();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getColumnsCntAssignment_30()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__30__Impl"


    // $ANTLR start "rule__Declaration__Group__31"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1449:1: rule__Declaration__Group__31 : rule__Declaration__Group__31__Impl rule__Declaration__Group__32 ;
    public final void rule__Declaration__Group__31() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1453:1: ( rule__Declaration__Group__31__Impl rule__Declaration__Group__32 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1454:2: rule__Declaration__Group__31__Impl rule__Declaration__Group__32
            {
            pushFollow(FOLLOW_rule__Declaration__Group__31__Impl_in_rule__Declaration__Group__312991);
            rule__Declaration__Group__31__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__32_in_rule__Declaration__Group__312994);
            rule__Declaration__Group__32();

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
    // $ANTLR end "rule__Declaration__Group__31"


    // $ANTLR start "rule__Declaration__Group__31__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1461:1: rule__Declaration__Group__31__Impl : ( 'font size' ) ;
    public final void rule__Declaration__Group__31__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1465:1: ( ( 'font size' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1466:1: ( 'font size' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1466:1: ( 'font size' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1467:1: 'font size'
            {
             before(grammarAccess.getDeclarationAccess().getFontSizeKeyword_31()); 
            match(input,25,FOLLOW_25_in_rule__Declaration__Group__31__Impl3022); 
             after(grammarAccess.getDeclarationAccess().getFontSizeKeyword_31()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__31__Impl"


    // $ANTLR start "rule__Declaration__Group__32"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1480:1: rule__Declaration__Group__32 : rule__Declaration__Group__32__Impl rule__Declaration__Group__33 ;
    public final void rule__Declaration__Group__32() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1484:1: ( rule__Declaration__Group__32__Impl rule__Declaration__Group__33 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1485:2: rule__Declaration__Group__32__Impl rule__Declaration__Group__33
            {
            pushFollow(FOLLOW_rule__Declaration__Group__32__Impl_in_rule__Declaration__Group__323053);
            rule__Declaration__Group__32__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__33_in_rule__Declaration__Group__323056);
            rule__Declaration__Group__33();

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
    // $ANTLR end "rule__Declaration__Group__32"


    // $ANTLR start "rule__Declaration__Group__32__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1492:1: rule__Declaration__Group__32__Impl : ( ( rule__Declaration__FontSizeAssignment_32 ) ) ;
    public final void rule__Declaration__Group__32__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1496:1: ( ( ( rule__Declaration__FontSizeAssignment_32 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1497:1: ( ( rule__Declaration__FontSizeAssignment_32 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1497:1: ( ( rule__Declaration__FontSizeAssignment_32 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1498:1: ( rule__Declaration__FontSizeAssignment_32 )
            {
             before(grammarAccess.getDeclarationAccess().getFontSizeAssignment_32()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1499:1: ( rule__Declaration__FontSizeAssignment_32 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1499:2: rule__Declaration__FontSizeAssignment_32
            {
            pushFollow(FOLLOW_rule__Declaration__FontSizeAssignment_32_in_rule__Declaration__Group__32__Impl3083);
            rule__Declaration__FontSizeAssignment_32();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getFontSizeAssignment_32()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__32__Impl"


    // $ANTLR start "rule__Declaration__Group__33"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1509:1: rule__Declaration__Group__33 : rule__Declaration__Group__33__Impl ;
    public final void rule__Declaration__Group__33() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1513:1: ( rule__Declaration__Group__33__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1514:2: rule__Declaration__Group__33__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group__33__Impl_in_rule__Declaration__Group__333113);
            rule__Declaration__Group__33__Impl();

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
    // $ANTLR end "rule__Declaration__Group__33"


    // $ANTLR start "rule__Declaration__Group__33__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1520:1: rule__Declaration__Group__33__Impl : ( '}' ) ;
    public final void rule__Declaration__Group__33__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1524:1: ( ( '}' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1525:1: ( '}' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1525:1: ( '}' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1526:1: '}'
            {
             before(grammarAccess.getDeclarationAccess().getRightCurlyBracketKeyword_33()); 
            match(input,16,FOLLOW_16_in_rule__Declaration__Group__33__Impl3141); 
             after(grammarAccess.getDeclarationAccess().getRightCurlyBracketKeyword_33()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__33__Impl"


    // $ANTLR start "rule__Declaration__Group_6__0"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1607:1: rule__Declaration__Group_6__0 : rule__Declaration__Group_6__0__Impl rule__Declaration__Group_6__1 ;
    public final void rule__Declaration__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1611:1: ( rule__Declaration__Group_6__0__Impl rule__Declaration__Group_6__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1612:2: rule__Declaration__Group_6__0__Impl rule__Declaration__Group_6__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group_6__0__Impl_in_rule__Declaration__Group_6__03240);
            rule__Declaration__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group_6__1_in_rule__Declaration__Group_6__03243);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1619:1: rule__Declaration__Group_6__0__Impl : ( ', ' ) ;
    public final void rule__Declaration__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1623:1: ( ( ', ' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1624:1: ( ', ' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1624:1: ( ', ' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1625:1: ', '
            {
             before(grammarAccess.getDeclarationAccess().getCommaSpaceKeyword_6_0()); 
            match(input,26,FOLLOW_26_in_rule__Declaration__Group_6__0__Impl3271); 
             after(grammarAccess.getDeclarationAccess().getCommaSpaceKeyword_6_0()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1638:1: rule__Declaration__Group_6__1 : rule__Declaration__Group_6__1__Impl ;
    public final void rule__Declaration__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1642:1: ( rule__Declaration__Group_6__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1643:2: rule__Declaration__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group_6__1__Impl_in_rule__Declaration__Group_6__13302);
            rule__Declaration__Group_6__1__Impl();

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1649:1: rule__Declaration__Group_6__1__Impl : ( ( rule__Declaration__PairsAssignment_6_1 ) ) ;
    public final void rule__Declaration__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1653:1: ( ( ( rule__Declaration__PairsAssignment_6_1 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1654:1: ( ( rule__Declaration__PairsAssignment_6_1 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1654:1: ( ( rule__Declaration__PairsAssignment_6_1 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1655:1: ( rule__Declaration__PairsAssignment_6_1 )
            {
             before(grammarAccess.getDeclarationAccess().getPairsAssignment_6_1()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1656:1: ( rule__Declaration__PairsAssignment_6_1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1656:2: rule__Declaration__PairsAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Declaration__PairsAssignment_6_1_in_rule__Declaration__Group_6__1__Impl3329);
            rule__Declaration__PairsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getPairsAssignment_6_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Declaration__Group_13__0"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1670:1: rule__Declaration__Group_13__0 : rule__Declaration__Group_13__0__Impl rule__Declaration__Group_13__1 ;
    public final void rule__Declaration__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1674:1: ( rule__Declaration__Group_13__0__Impl rule__Declaration__Group_13__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1675:2: rule__Declaration__Group_13__0__Impl rule__Declaration__Group_13__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group_13__0__Impl_in_rule__Declaration__Group_13__03363);
            rule__Declaration__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group_13__1_in_rule__Declaration__Group_13__03366);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1682:1: rule__Declaration__Group_13__0__Impl : ( 'date' ) ;
    public final void rule__Declaration__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1686:1: ( ( 'date' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1687:1: ( 'date' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1687:1: ( 'date' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1688:1: 'date'
            {
             before(grammarAccess.getDeclarationAccess().getDateKeyword_13_0()); 
            match(input,27,FOLLOW_27_in_rule__Declaration__Group_13__0__Impl3394); 
             after(grammarAccess.getDeclarationAccess().getDateKeyword_13_0()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1701:1: rule__Declaration__Group_13__1 : rule__Declaration__Group_13__1__Impl ;
    public final void rule__Declaration__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1705:1: ( rule__Declaration__Group_13__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1706:2: rule__Declaration__Group_13__1__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group_13__1__Impl_in_rule__Declaration__Group_13__13425);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1712:1: rule__Declaration__Group_13__1__Impl : ( ( rule__Declaration__DateAssignment_13_1 ) ) ;
    public final void rule__Declaration__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1716:1: ( ( ( rule__Declaration__DateAssignment_13_1 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1717:1: ( ( rule__Declaration__DateAssignment_13_1 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1717:1: ( ( rule__Declaration__DateAssignment_13_1 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1718:1: ( rule__Declaration__DateAssignment_13_1 )
            {
             before(grammarAccess.getDeclarationAccess().getDateAssignment_13_1()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1719:1: ( rule__Declaration__DateAssignment_13_1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1719:2: rule__Declaration__DateAssignment_13_1
            {
            pushFollow(FOLLOW_rule__Declaration__DateAssignment_13_1_in_rule__Declaration__Group_13__1__Impl3452);
            rule__Declaration__DateAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getDateAssignment_13_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Declaration__Group_14__0"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1733:1: rule__Declaration__Group_14__0 : rule__Declaration__Group_14__0__Impl rule__Declaration__Group_14__1 ;
    public final void rule__Declaration__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1737:1: ( rule__Declaration__Group_14__0__Impl rule__Declaration__Group_14__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1738:2: rule__Declaration__Group_14__0__Impl rule__Declaration__Group_14__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group_14__0__Impl_in_rule__Declaration__Group_14__03486);
            rule__Declaration__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group_14__1_in_rule__Declaration__Group_14__03489);
            rule__Declaration__Group_14__1();

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
    // $ANTLR end "rule__Declaration__Group_14__0"


    // $ANTLR start "rule__Declaration__Group_14__0__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1745:1: rule__Declaration__Group_14__0__Impl : ( 'location' ) ;
    public final void rule__Declaration__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1749:1: ( ( 'location' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1750:1: ( 'location' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1750:1: ( 'location' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1751:1: 'location'
            {
             before(grammarAccess.getDeclarationAccess().getLocationKeyword_14_0()); 
            match(input,28,FOLLOW_28_in_rule__Declaration__Group_14__0__Impl3517); 
             after(grammarAccess.getDeclarationAccess().getLocationKeyword_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_14__0__Impl"


    // $ANTLR start "rule__Declaration__Group_14__1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1764:1: rule__Declaration__Group_14__1 : rule__Declaration__Group_14__1__Impl ;
    public final void rule__Declaration__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1768:1: ( rule__Declaration__Group_14__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1769:2: rule__Declaration__Group_14__1__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group_14__1__Impl_in_rule__Declaration__Group_14__13548);
            rule__Declaration__Group_14__1__Impl();

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
    // $ANTLR end "rule__Declaration__Group_14__1"


    // $ANTLR start "rule__Declaration__Group_14__1__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1775:1: rule__Declaration__Group_14__1__Impl : ( ( rule__Declaration__LocationAssignment_14_1 ) ) ;
    public final void rule__Declaration__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1779:1: ( ( ( rule__Declaration__LocationAssignment_14_1 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1780:1: ( ( rule__Declaration__LocationAssignment_14_1 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1780:1: ( ( rule__Declaration__LocationAssignment_14_1 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1781:1: ( rule__Declaration__LocationAssignment_14_1 )
            {
             before(grammarAccess.getDeclarationAccess().getLocationAssignment_14_1()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1782:1: ( rule__Declaration__LocationAssignment_14_1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1782:2: rule__Declaration__LocationAssignment_14_1
            {
            pushFollow(FOLLOW_rule__Declaration__LocationAssignment_14_1_in_rule__Declaration__Group_14__1__Impl3575);
            rule__Declaration__LocationAssignment_14_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getLocationAssignment_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_14__1__Impl"


    // $ANTLR start "rule__Declaration__Group_17__0"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1796:1: rule__Declaration__Group_17__0 : rule__Declaration__Group_17__0__Impl rule__Declaration__Group_17__1 ;
    public final void rule__Declaration__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1800:1: ( rule__Declaration__Group_17__0__Impl rule__Declaration__Group_17__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1801:2: rule__Declaration__Group_17__0__Impl rule__Declaration__Group_17__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group_17__0__Impl_in_rule__Declaration__Group_17__03609);
            rule__Declaration__Group_17__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group_17__1_in_rule__Declaration__Group_17__03612);
            rule__Declaration__Group_17__1();

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
    // $ANTLR end "rule__Declaration__Group_17__0"


    // $ANTLR start "rule__Declaration__Group_17__0__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1808:1: rule__Declaration__Group_17__0__Impl : ( 'volume' ) ;
    public final void rule__Declaration__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1812:1: ( ( 'volume' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1813:1: ( 'volume' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1813:1: ( 'volume' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1814:1: 'volume'
            {
             before(grammarAccess.getDeclarationAccess().getVolumeKeyword_17_0()); 
            match(input,29,FOLLOW_29_in_rule__Declaration__Group_17__0__Impl3640); 
             after(grammarAccess.getDeclarationAccess().getVolumeKeyword_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_17__0__Impl"


    // $ANTLR start "rule__Declaration__Group_17__1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1827:1: rule__Declaration__Group_17__1 : rule__Declaration__Group_17__1__Impl ;
    public final void rule__Declaration__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1831:1: ( rule__Declaration__Group_17__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1832:2: rule__Declaration__Group_17__1__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group_17__1__Impl_in_rule__Declaration__Group_17__13671);
            rule__Declaration__Group_17__1__Impl();

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
    // $ANTLR end "rule__Declaration__Group_17__1"


    // $ANTLR start "rule__Declaration__Group_17__1__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1838:1: rule__Declaration__Group_17__1__Impl : ( ( rule__Declaration__VolumeAssignment_17_1 ) ) ;
    public final void rule__Declaration__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1842:1: ( ( ( rule__Declaration__VolumeAssignment_17_1 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1843:1: ( ( rule__Declaration__VolumeAssignment_17_1 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1843:1: ( ( rule__Declaration__VolumeAssignment_17_1 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1844:1: ( rule__Declaration__VolumeAssignment_17_1 )
            {
             before(grammarAccess.getDeclarationAccess().getVolumeAssignment_17_1()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1845:1: ( rule__Declaration__VolumeAssignment_17_1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1845:2: rule__Declaration__VolumeAssignment_17_1
            {
            pushFollow(FOLLOW_rule__Declaration__VolumeAssignment_17_1_in_rule__Declaration__Group_17__1__Impl3698);
            rule__Declaration__VolumeAssignment_17_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getVolumeAssignment_17_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_17__1__Impl"


    // $ANTLR start "rule__Declaration__Group_28__0"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1859:1: rule__Declaration__Group_28__0 : rule__Declaration__Group_28__0__Impl rule__Declaration__Group_28__1 ;
    public final void rule__Declaration__Group_28__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1863:1: ( rule__Declaration__Group_28__0__Impl rule__Declaration__Group_28__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1864:2: rule__Declaration__Group_28__0__Impl rule__Declaration__Group_28__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group_28__0__Impl_in_rule__Declaration__Group_28__03732);
            rule__Declaration__Group_28__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group_28__1_in_rule__Declaration__Group_28__03735);
            rule__Declaration__Group_28__1();

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
    // $ANTLR end "rule__Declaration__Group_28__0"


    // $ANTLR start "rule__Declaration__Group_28__0__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1871:1: rule__Declaration__Group_28__0__Impl : ( 'number of images per article' ) ;
    public final void rule__Declaration__Group_28__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1875:1: ( ( 'number of images per article' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1876:1: ( 'number of images per article' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1876:1: ( 'number of images per article' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1877:1: 'number of images per article'
            {
             before(grammarAccess.getDeclarationAccess().getNumberOfImagesPerArticleKeyword_28_0()); 
            match(input,30,FOLLOW_30_in_rule__Declaration__Group_28__0__Impl3763); 
             after(grammarAccess.getDeclarationAccess().getNumberOfImagesPerArticleKeyword_28_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_28__0__Impl"


    // $ANTLR start "rule__Declaration__Group_28__1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1890:1: rule__Declaration__Group_28__1 : rule__Declaration__Group_28__1__Impl ;
    public final void rule__Declaration__Group_28__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1894:1: ( rule__Declaration__Group_28__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1895:2: rule__Declaration__Group_28__1__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group_28__1__Impl_in_rule__Declaration__Group_28__13794);
            rule__Declaration__Group_28__1__Impl();

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
    // $ANTLR end "rule__Declaration__Group_28__1"


    // $ANTLR start "rule__Declaration__Group_28__1__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1901:1: rule__Declaration__Group_28__1__Impl : ( ( rule__Declaration__ImagesCntAssignment_28_1 ) ) ;
    public final void rule__Declaration__Group_28__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1905:1: ( ( ( rule__Declaration__ImagesCntAssignment_28_1 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1906:1: ( ( rule__Declaration__ImagesCntAssignment_28_1 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1906:1: ( ( rule__Declaration__ImagesCntAssignment_28_1 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1907:1: ( rule__Declaration__ImagesCntAssignment_28_1 )
            {
             before(grammarAccess.getDeclarationAccess().getImagesCntAssignment_28_1()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1908:1: ( rule__Declaration__ImagesCntAssignment_28_1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1908:2: rule__Declaration__ImagesCntAssignment_28_1
            {
            pushFollow(FOLLOW_rule__Declaration__ImagesCntAssignment_28_1_in_rule__Declaration__Group_28__1__Impl3821);
            rule__Declaration__ImagesCntAssignment_28_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getImagesCntAssignment_28_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_28__1__Impl"


    // $ANTLR start "rule__FontSize__Group_0__0"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1922:1: rule__FontSize__Group_0__0 : rule__FontSize__Group_0__0__Impl rule__FontSize__Group_0__1 ;
    public final void rule__FontSize__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1926:1: ( rule__FontSize__Group_0__0__Impl rule__FontSize__Group_0__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1927:2: rule__FontSize__Group_0__0__Impl rule__FontSize__Group_0__1
            {
            pushFollow(FOLLOW_rule__FontSize__Group_0__0__Impl_in_rule__FontSize__Group_0__03855);
            rule__FontSize__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FontSize__Group_0__1_in_rule__FontSize__Group_0__03858);
            rule__FontSize__Group_0__1();

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
    // $ANTLR end "rule__FontSize__Group_0__0"


    // $ANTLR start "rule__FontSize__Group_0__0__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1934:1: rule__FontSize__Group_0__0__Impl : ( () ) ;
    public final void rule__FontSize__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1938:1: ( ( () ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1939:1: ( () )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1939:1: ( () )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1940:1: ()
            {
             before(grammarAccess.getFontSizeAccess().getEStringAction_0_0()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1941:1: ()
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1943:1: 
            {
            }

             after(grammarAccess.getFontSizeAccess().getEStringAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontSize__Group_0__0__Impl"


    // $ANTLR start "rule__FontSize__Group_0__1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1953:1: rule__FontSize__Group_0__1 : rule__FontSize__Group_0__1__Impl ;
    public final void rule__FontSize__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1957:1: ( rule__FontSize__Group_0__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1958:2: rule__FontSize__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__FontSize__Group_0__1__Impl_in_rule__FontSize__Group_0__13916);
            rule__FontSize__Group_0__1__Impl();

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
    // $ANTLR end "rule__FontSize__Group_0__1"


    // $ANTLR start "rule__FontSize__Group_0__1__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1964:1: rule__FontSize__Group_0__1__Impl : ( 'small' ) ;
    public final void rule__FontSize__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1968:1: ( ( 'small' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1969:1: ( 'small' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1969:1: ( 'small' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1970:1: 'small'
            {
             before(grammarAccess.getFontSizeAccess().getSmallKeyword_0_1()); 
            match(input,31,FOLLOW_31_in_rule__FontSize__Group_0__1__Impl3944); 
             after(grammarAccess.getFontSizeAccess().getSmallKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontSize__Group_0__1__Impl"


    // $ANTLR start "rule__FontSize__Group_1__0"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1987:1: rule__FontSize__Group_1__0 : rule__FontSize__Group_1__0__Impl rule__FontSize__Group_1__1 ;
    public final void rule__FontSize__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1991:1: ( rule__FontSize__Group_1__0__Impl rule__FontSize__Group_1__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1992:2: rule__FontSize__Group_1__0__Impl rule__FontSize__Group_1__1
            {
            pushFollow(FOLLOW_rule__FontSize__Group_1__0__Impl_in_rule__FontSize__Group_1__03979);
            rule__FontSize__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FontSize__Group_1__1_in_rule__FontSize__Group_1__03982);
            rule__FontSize__Group_1__1();

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
    // $ANTLR end "rule__FontSize__Group_1__0"


    // $ANTLR start "rule__FontSize__Group_1__0__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1999:1: rule__FontSize__Group_1__0__Impl : ( () ) ;
    public final void rule__FontSize__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2003:1: ( ( () ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2004:1: ( () )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2004:1: ( () )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2005:1: ()
            {
             before(grammarAccess.getFontSizeAccess().getEStringAction_1_0()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2006:1: ()
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2008:1: 
            {
            }

             after(grammarAccess.getFontSizeAccess().getEStringAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontSize__Group_1__0__Impl"


    // $ANTLR start "rule__FontSize__Group_1__1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2018:1: rule__FontSize__Group_1__1 : rule__FontSize__Group_1__1__Impl ;
    public final void rule__FontSize__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2022:1: ( rule__FontSize__Group_1__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2023:2: rule__FontSize__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FontSize__Group_1__1__Impl_in_rule__FontSize__Group_1__14040);
            rule__FontSize__Group_1__1__Impl();

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
    // $ANTLR end "rule__FontSize__Group_1__1"


    // $ANTLR start "rule__FontSize__Group_1__1__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2029:1: rule__FontSize__Group_1__1__Impl : ( 'medium' ) ;
    public final void rule__FontSize__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2033:1: ( ( 'medium' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2034:1: ( 'medium' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2034:1: ( 'medium' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2035:1: 'medium'
            {
             before(grammarAccess.getFontSizeAccess().getMediumKeyword_1_1()); 
            match(input,32,FOLLOW_32_in_rule__FontSize__Group_1__1__Impl4068); 
             after(grammarAccess.getFontSizeAccess().getMediumKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontSize__Group_1__1__Impl"


    // $ANTLR start "rule__FontSize__Group_2__0"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2052:1: rule__FontSize__Group_2__0 : rule__FontSize__Group_2__0__Impl rule__FontSize__Group_2__1 ;
    public final void rule__FontSize__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2056:1: ( rule__FontSize__Group_2__0__Impl rule__FontSize__Group_2__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2057:2: rule__FontSize__Group_2__0__Impl rule__FontSize__Group_2__1
            {
            pushFollow(FOLLOW_rule__FontSize__Group_2__0__Impl_in_rule__FontSize__Group_2__04103);
            rule__FontSize__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FontSize__Group_2__1_in_rule__FontSize__Group_2__04106);
            rule__FontSize__Group_2__1();

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
    // $ANTLR end "rule__FontSize__Group_2__0"


    // $ANTLR start "rule__FontSize__Group_2__0__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2064:1: rule__FontSize__Group_2__0__Impl : ( () ) ;
    public final void rule__FontSize__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2068:1: ( ( () ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2069:1: ( () )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2069:1: ( () )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2070:1: ()
            {
             before(grammarAccess.getFontSizeAccess().getEStringAction_2_0()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2071:1: ()
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2073:1: 
            {
            }

             after(grammarAccess.getFontSizeAccess().getEStringAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontSize__Group_2__0__Impl"


    // $ANTLR start "rule__FontSize__Group_2__1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2083:1: rule__FontSize__Group_2__1 : rule__FontSize__Group_2__1__Impl ;
    public final void rule__FontSize__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2087:1: ( rule__FontSize__Group_2__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2088:2: rule__FontSize__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__FontSize__Group_2__1__Impl_in_rule__FontSize__Group_2__14164);
            rule__FontSize__Group_2__1__Impl();

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
    // $ANTLR end "rule__FontSize__Group_2__1"


    // $ANTLR start "rule__FontSize__Group_2__1__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2094:1: rule__FontSize__Group_2__1__Impl : ( 'large' ) ;
    public final void rule__FontSize__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2098:1: ( ( 'large' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2099:1: ( 'large' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2099:1: ( 'large' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2100:1: 'large'
            {
             before(grammarAccess.getFontSizeAccess().getLargeKeyword_2_1()); 
            match(input,33,FOLLOW_33_in_rule__FontSize__Group_2__1__Impl4192); 
             after(grammarAccess.getFontSizeAccess().getLargeKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontSize__Group_2__1__Impl"


    // $ANTLR start "rule__Format__Group_0__0"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2117:1: rule__Format__Group_0__0 : rule__Format__Group_0__0__Impl rule__Format__Group_0__1 ;
    public final void rule__Format__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2121:1: ( rule__Format__Group_0__0__Impl rule__Format__Group_0__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2122:2: rule__Format__Group_0__0__Impl rule__Format__Group_0__1
            {
            pushFollow(FOLLOW_rule__Format__Group_0__0__Impl_in_rule__Format__Group_0__04227);
            rule__Format__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Format__Group_0__1_in_rule__Format__Group_0__04230);
            rule__Format__Group_0__1();

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
    // $ANTLR end "rule__Format__Group_0__0"


    // $ANTLR start "rule__Format__Group_0__0__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2129:1: rule__Format__Group_0__0__Impl : ( () ) ;
    public final void rule__Format__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2133:1: ( ( () ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2134:1: ( () )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2134:1: ( () )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2135:1: ()
            {
             before(grammarAccess.getFormatAccess().getEStringAction_0_0()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2136:1: ()
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2138:1: 
            {
            }

             after(grammarAccess.getFormatAccess().getEStringAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Format__Group_0__0__Impl"


    // $ANTLR start "rule__Format__Group_0__1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2148:1: rule__Format__Group_0__1 : rule__Format__Group_0__1__Impl ;
    public final void rule__Format__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2152:1: ( rule__Format__Group_0__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2153:2: rule__Format__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Format__Group_0__1__Impl_in_rule__Format__Group_0__14288);
            rule__Format__Group_0__1__Impl();

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
    // $ANTLR end "rule__Format__Group_0__1"


    // $ANTLR start "rule__Format__Group_0__1__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2159:1: rule__Format__Group_0__1__Impl : ( 'DIN A6' ) ;
    public final void rule__Format__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2163:1: ( ( 'DIN A6' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2164:1: ( 'DIN A6' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2164:1: ( 'DIN A6' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2165:1: 'DIN A6'
            {
             before(grammarAccess.getFormatAccess().getDINA6Keyword_0_1()); 
            match(input,34,FOLLOW_34_in_rule__Format__Group_0__1__Impl4316); 
             after(grammarAccess.getFormatAccess().getDINA6Keyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Format__Group_0__1__Impl"


    // $ANTLR start "rule__Format__Group_1__0"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2182:1: rule__Format__Group_1__0 : rule__Format__Group_1__0__Impl rule__Format__Group_1__1 ;
    public final void rule__Format__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2186:1: ( rule__Format__Group_1__0__Impl rule__Format__Group_1__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2187:2: rule__Format__Group_1__0__Impl rule__Format__Group_1__1
            {
            pushFollow(FOLLOW_rule__Format__Group_1__0__Impl_in_rule__Format__Group_1__04351);
            rule__Format__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Format__Group_1__1_in_rule__Format__Group_1__04354);
            rule__Format__Group_1__1();

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
    // $ANTLR end "rule__Format__Group_1__0"


    // $ANTLR start "rule__Format__Group_1__0__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2194:1: rule__Format__Group_1__0__Impl : ( () ) ;
    public final void rule__Format__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2198:1: ( ( () ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2199:1: ( () )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2199:1: ( () )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2200:1: ()
            {
             before(grammarAccess.getFormatAccess().getEStringAction_1_0()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2201:1: ()
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2203:1: 
            {
            }

             after(grammarAccess.getFormatAccess().getEStringAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Format__Group_1__0__Impl"


    // $ANTLR start "rule__Format__Group_1__1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2213:1: rule__Format__Group_1__1 : rule__Format__Group_1__1__Impl ;
    public final void rule__Format__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2217:1: ( rule__Format__Group_1__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2218:2: rule__Format__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Format__Group_1__1__Impl_in_rule__Format__Group_1__14412);
            rule__Format__Group_1__1__Impl();

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
    // $ANTLR end "rule__Format__Group_1__1"


    // $ANTLR start "rule__Format__Group_1__1__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2224:1: rule__Format__Group_1__1__Impl : ( 'DIN A5' ) ;
    public final void rule__Format__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2228:1: ( ( 'DIN A5' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2229:1: ( 'DIN A5' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2229:1: ( 'DIN A5' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2230:1: 'DIN A5'
            {
             before(grammarAccess.getFormatAccess().getDINA5Keyword_1_1()); 
            match(input,35,FOLLOW_35_in_rule__Format__Group_1__1__Impl4440); 
             after(grammarAccess.getFormatAccess().getDINA5Keyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Format__Group_1__1__Impl"


    // $ANTLR start "rule__Format__Group_2__0"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2247:1: rule__Format__Group_2__0 : rule__Format__Group_2__0__Impl rule__Format__Group_2__1 ;
    public final void rule__Format__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2251:1: ( rule__Format__Group_2__0__Impl rule__Format__Group_2__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2252:2: rule__Format__Group_2__0__Impl rule__Format__Group_2__1
            {
            pushFollow(FOLLOW_rule__Format__Group_2__0__Impl_in_rule__Format__Group_2__04475);
            rule__Format__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Format__Group_2__1_in_rule__Format__Group_2__04478);
            rule__Format__Group_2__1();

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
    // $ANTLR end "rule__Format__Group_2__0"


    // $ANTLR start "rule__Format__Group_2__0__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2259:1: rule__Format__Group_2__0__Impl : ( () ) ;
    public final void rule__Format__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2263:1: ( ( () ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2264:1: ( () )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2264:1: ( () )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2265:1: ()
            {
             before(grammarAccess.getFormatAccess().getEStringAction_2_0()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2266:1: ()
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2268:1: 
            {
            }

             after(grammarAccess.getFormatAccess().getEStringAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Format__Group_2__0__Impl"


    // $ANTLR start "rule__Format__Group_2__1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2278:1: rule__Format__Group_2__1 : rule__Format__Group_2__1__Impl ;
    public final void rule__Format__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2282:1: ( rule__Format__Group_2__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2283:2: rule__Format__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Format__Group_2__1__Impl_in_rule__Format__Group_2__14536);
            rule__Format__Group_2__1__Impl();

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
    // $ANTLR end "rule__Format__Group_2__1"


    // $ANTLR start "rule__Format__Group_2__1__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2289:1: rule__Format__Group_2__1__Impl : ( 'DIN A4' ) ;
    public final void rule__Format__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2293:1: ( ( 'DIN A4' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2294:1: ( 'DIN A4' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2294:1: ( 'DIN A4' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2295:1: 'DIN A4'
            {
             before(grammarAccess.getFormatAccess().getDINA4Keyword_2_1()); 
            match(input,36,FOLLOW_36_in_rule__Format__Group_2__1__Impl4564); 
             after(grammarAccess.getFormatAccess().getDINA4Keyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Format__Group_2__1__Impl"


    // $ANTLR start "rule__Format__Group_3__0"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2312:1: rule__Format__Group_3__0 : rule__Format__Group_3__0__Impl rule__Format__Group_3__1 ;
    public final void rule__Format__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2316:1: ( rule__Format__Group_3__0__Impl rule__Format__Group_3__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2317:2: rule__Format__Group_3__0__Impl rule__Format__Group_3__1
            {
            pushFollow(FOLLOW_rule__Format__Group_3__0__Impl_in_rule__Format__Group_3__04599);
            rule__Format__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Format__Group_3__1_in_rule__Format__Group_3__04602);
            rule__Format__Group_3__1();

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
    // $ANTLR end "rule__Format__Group_3__0"


    // $ANTLR start "rule__Format__Group_3__0__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2324:1: rule__Format__Group_3__0__Impl : ( () ) ;
    public final void rule__Format__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2328:1: ( ( () ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2329:1: ( () )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2329:1: ( () )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2330:1: ()
            {
             before(grammarAccess.getFormatAccess().getEStringAction_3_0()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2331:1: ()
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2333:1: 
            {
            }

             after(grammarAccess.getFormatAccess().getEStringAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Format__Group_3__0__Impl"


    // $ANTLR start "rule__Format__Group_3__1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2343:1: rule__Format__Group_3__1 : rule__Format__Group_3__1__Impl ;
    public final void rule__Format__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2347:1: ( rule__Format__Group_3__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2348:2: rule__Format__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Format__Group_3__1__Impl_in_rule__Format__Group_3__14660);
            rule__Format__Group_3__1__Impl();

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
    // $ANTLR end "rule__Format__Group_3__1"


    // $ANTLR start "rule__Format__Group_3__1__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2354:1: rule__Format__Group_3__1__Impl : ( 'DIN A3' ) ;
    public final void rule__Format__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2358:1: ( ( 'DIN A3' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2359:1: ( 'DIN A3' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2359:1: ( 'DIN A3' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2360:1: 'DIN A3'
            {
             before(grammarAccess.getFormatAccess().getDINA3Keyword_3_1()); 
            match(input,37,FOLLOW_37_in_rule__Format__Group_3__1__Impl4688); 
             after(grammarAccess.getFormatAccess().getDINA3Keyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Format__Group_3__1__Impl"


    // $ANTLR start "rule__Format__Group_4__0"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2377:1: rule__Format__Group_4__0 : rule__Format__Group_4__0__Impl rule__Format__Group_4__1 ;
    public final void rule__Format__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2381:1: ( rule__Format__Group_4__0__Impl rule__Format__Group_4__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2382:2: rule__Format__Group_4__0__Impl rule__Format__Group_4__1
            {
            pushFollow(FOLLOW_rule__Format__Group_4__0__Impl_in_rule__Format__Group_4__04723);
            rule__Format__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Format__Group_4__1_in_rule__Format__Group_4__04726);
            rule__Format__Group_4__1();

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
    // $ANTLR end "rule__Format__Group_4__0"


    // $ANTLR start "rule__Format__Group_4__0__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2389:1: rule__Format__Group_4__0__Impl : ( () ) ;
    public final void rule__Format__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2393:1: ( ( () ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2394:1: ( () )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2394:1: ( () )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2395:1: ()
            {
             before(grammarAccess.getFormatAccess().getEStringAction_4_0()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2396:1: ()
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2398:1: 
            {
            }

             after(grammarAccess.getFormatAccess().getEStringAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Format__Group_4__0__Impl"


    // $ANTLR start "rule__Format__Group_4__1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2408:1: rule__Format__Group_4__1 : rule__Format__Group_4__1__Impl ;
    public final void rule__Format__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2412:1: ( rule__Format__Group_4__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2413:2: rule__Format__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Format__Group_4__1__Impl_in_rule__Format__Group_4__14784);
            rule__Format__Group_4__1__Impl();

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
    // $ANTLR end "rule__Format__Group_4__1"


    // $ANTLR start "rule__Format__Group_4__1__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2419:1: rule__Format__Group_4__1__Impl : ( 'DIN A2' ) ;
    public final void rule__Format__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2423:1: ( ( 'DIN A2' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2424:1: ( 'DIN A2' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2424:1: ( 'DIN A2' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2425:1: 'DIN A2'
            {
             before(grammarAccess.getFormatAccess().getDINA2Keyword_4_1()); 
            match(input,38,FOLLOW_38_in_rule__Format__Group_4__1__Impl4812); 
             after(grammarAccess.getFormatAccess().getDINA2Keyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Format__Group_4__1__Impl"


    // $ANTLR start "rule__Format__Group_5__0"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2442:1: rule__Format__Group_5__0 : rule__Format__Group_5__0__Impl rule__Format__Group_5__1 ;
    public final void rule__Format__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2446:1: ( rule__Format__Group_5__0__Impl rule__Format__Group_5__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2447:2: rule__Format__Group_5__0__Impl rule__Format__Group_5__1
            {
            pushFollow(FOLLOW_rule__Format__Group_5__0__Impl_in_rule__Format__Group_5__04847);
            rule__Format__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Format__Group_5__1_in_rule__Format__Group_5__04850);
            rule__Format__Group_5__1();

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
    // $ANTLR end "rule__Format__Group_5__0"


    // $ANTLR start "rule__Format__Group_5__0__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2454:1: rule__Format__Group_5__0__Impl : ( () ) ;
    public final void rule__Format__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2458:1: ( ( () ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2459:1: ( () )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2459:1: ( () )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2460:1: ()
            {
             before(grammarAccess.getFormatAccess().getEStringAction_5_0()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2461:1: ()
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2463:1: 
            {
            }

             after(grammarAccess.getFormatAccess().getEStringAction_5_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Format__Group_5__0__Impl"


    // $ANTLR start "rule__Format__Group_5__1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2473:1: rule__Format__Group_5__1 : rule__Format__Group_5__1__Impl ;
    public final void rule__Format__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2477:1: ( rule__Format__Group_5__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2478:2: rule__Format__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Format__Group_5__1__Impl_in_rule__Format__Group_5__14908);
            rule__Format__Group_5__1__Impl();

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
    // $ANTLR end "rule__Format__Group_5__1"


    // $ANTLR start "rule__Format__Group_5__1__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2484:1: rule__Format__Group_5__1__Impl : ( 'DIN A1' ) ;
    public final void rule__Format__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2488:1: ( ( 'DIN A1' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2489:1: ( 'DIN A1' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2489:1: ( 'DIN A1' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2490:1: 'DIN A1'
            {
             before(grammarAccess.getFormatAccess().getDINA1Keyword_5_1()); 
            match(input,39,FOLLOW_39_in_rule__Format__Group_5__1__Impl4936); 
             after(grammarAccess.getFormatAccess().getDINA1Keyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Format__Group_5__1__Impl"


    // $ANTLR start "rule__Format__Group_6__0"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2507:1: rule__Format__Group_6__0 : rule__Format__Group_6__0__Impl rule__Format__Group_6__1 ;
    public final void rule__Format__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2511:1: ( rule__Format__Group_6__0__Impl rule__Format__Group_6__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2512:2: rule__Format__Group_6__0__Impl rule__Format__Group_6__1
            {
            pushFollow(FOLLOW_rule__Format__Group_6__0__Impl_in_rule__Format__Group_6__04971);
            rule__Format__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Format__Group_6__1_in_rule__Format__Group_6__04974);
            rule__Format__Group_6__1();

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
    // $ANTLR end "rule__Format__Group_6__0"


    // $ANTLR start "rule__Format__Group_6__0__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2519:1: rule__Format__Group_6__0__Impl : ( () ) ;
    public final void rule__Format__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2523:1: ( ( () ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2524:1: ( () )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2524:1: ( () )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2525:1: ()
            {
             before(grammarAccess.getFormatAccess().getEStringAction_6_0()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2526:1: ()
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2528:1: 
            {
            }

             after(grammarAccess.getFormatAccess().getEStringAction_6_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Format__Group_6__0__Impl"


    // $ANTLR start "rule__Format__Group_6__1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2538:1: rule__Format__Group_6__1 : rule__Format__Group_6__1__Impl ;
    public final void rule__Format__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2542:1: ( rule__Format__Group_6__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2543:2: rule__Format__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Format__Group_6__1__Impl_in_rule__Format__Group_6__15032);
            rule__Format__Group_6__1__Impl();

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
    // $ANTLR end "rule__Format__Group_6__1"


    // $ANTLR start "rule__Format__Group_6__1__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2549:1: rule__Format__Group_6__1__Impl : ( 'DIN A0' ) ;
    public final void rule__Format__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2553:1: ( ( 'DIN A0' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2554:1: ( 'DIN A0' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2554:1: ( 'DIN A0' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2555:1: 'DIN A0'
            {
             before(grammarAccess.getFormatAccess().getDINA0Keyword_6_1()); 
            match(input,40,FOLLOW_40_in_rule__Format__Group_6__1__Impl5060); 
             after(grammarAccess.getFormatAccess().getDINA0Keyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Format__Group_6__1__Impl"


    // $ANTLR start "rule__Date__Group__0"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2572:1: rule__Date__Group__0 : rule__Date__Group__0__Impl rule__Date__Group__1 ;
    public final void rule__Date__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2576:1: ( rule__Date__Group__0__Impl rule__Date__Group__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2577:2: rule__Date__Group__0__Impl rule__Date__Group__1
            {
            pushFollow(FOLLOW_rule__Date__Group__0__Impl_in_rule__Date__Group__05095);
            rule__Date__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Date__Group__1_in_rule__Date__Group__05098);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2584:1: rule__Date__Group__0__Impl : ( '{' ) ;
    public final void rule__Date__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2588:1: ( ( '{' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2589:1: ( '{' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2589:1: ( '{' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2590:1: '{'
            {
             before(grammarAccess.getDateAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Date__Group__0__Impl5126); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2603:1: rule__Date__Group__1 : rule__Date__Group__1__Impl rule__Date__Group__2 ;
    public final void rule__Date__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2607:1: ( rule__Date__Group__1__Impl rule__Date__Group__2 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2608:2: rule__Date__Group__1__Impl rule__Date__Group__2
            {
            pushFollow(FOLLOW_rule__Date__Group__1__Impl_in_rule__Date__Group__15157);
            rule__Date__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Date__Group__2_in_rule__Date__Group__15160);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2615:1: rule__Date__Group__1__Impl : ( ( rule__Date__DayAssignment_1 ) ) ;
    public final void rule__Date__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2619:1: ( ( ( rule__Date__DayAssignment_1 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2620:1: ( ( rule__Date__DayAssignment_1 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2620:1: ( ( rule__Date__DayAssignment_1 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2621:1: ( rule__Date__DayAssignment_1 )
            {
             before(grammarAccess.getDateAccess().getDayAssignment_1()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2622:1: ( rule__Date__DayAssignment_1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2622:2: rule__Date__DayAssignment_1
            {
            pushFollow(FOLLOW_rule__Date__DayAssignment_1_in_rule__Date__Group__1__Impl5187);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2632:1: rule__Date__Group__2 : rule__Date__Group__2__Impl rule__Date__Group__3 ;
    public final void rule__Date__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2636:1: ( rule__Date__Group__2__Impl rule__Date__Group__3 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2637:2: rule__Date__Group__2__Impl rule__Date__Group__3
            {
            pushFollow(FOLLOW_rule__Date__Group__2__Impl_in_rule__Date__Group__25217);
            rule__Date__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Date__Group__3_in_rule__Date__Group__25220);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2644:1: rule__Date__Group__2__Impl : ( '-' ) ;
    public final void rule__Date__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2648:1: ( ( '-' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2649:1: ( '-' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2649:1: ( '-' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2650:1: '-'
            {
             before(grammarAccess.getDateAccess().getHyphenMinusKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__Date__Group__2__Impl5248); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2663:1: rule__Date__Group__3 : rule__Date__Group__3__Impl rule__Date__Group__4 ;
    public final void rule__Date__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2667:1: ( rule__Date__Group__3__Impl rule__Date__Group__4 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2668:2: rule__Date__Group__3__Impl rule__Date__Group__4
            {
            pushFollow(FOLLOW_rule__Date__Group__3__Impl_in_rule__Date__Group__35279);
            rule__Date__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Date__Group__4_in_rule__Date__Group__35282);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2675:1: rule__Date__Group__3__Impl : ( ( rule__Date__MonthAssignment_3 ) ) ;
    public final void rule__Date__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2679:1: ( ( ( rule__Date__MonthAssignment_3 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2680:1: ( ( rule__Date__MonthAssignment_3 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2680:1: ( ( rule__Date__MonthAssignment_3 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2681:1: ( rule__Date__MonthAssignment_3 )
            {
             before(grammarAccess.getDateAccess().getMonthAssignment_3()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2682:1: ( rule__Date__MonthAssignment_3 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2682:2: rule__Date__MonthAssignment_3
            {
            pushFollow(FOLLOW_rule__Date__MonthAssignment_3_in_rule__Date__Group__3__Impl5309);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2692:1: rule__Date__Group__4 : rule__Date__Group__4__Impl rule__Date__Group__5 ;
    public final void rule__Date__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2696:1: ( rule__Date__Group__4__Impl rule__Date__Group__5 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2697:2: rule__Date__Group__4__Impl rule__Date__Group__5
            {
            pushFollow(FOLLOW_rule__Date__Group__4__Impl_in_rule__Date__Group__45339);
            rule__Date__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Date__Group__5_in_rule__Date__Group__45342);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2704:1: rule__Date__Group__4__Impl : ( '-' ) ;
    public final void rule__Date__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2708:1: ( ( '-' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2709:1: ( '-' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2709:1: ( '-' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2710:1: '-'
            {
             before(grammarAccess.getDateAccess().getHyphenMinusKeyword_4()); 
            match(input,23,FOLLOW_23_in_rule__Date__Group__4__Impl5370); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2723:1: rule__Date__Group__5 : rule__Date__Group__5__Impl rule__Date__Group__6 ;
    public final void rule__Date__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2727:1: ( rule__Date__Group__5__Impl rule__Date__Group__6 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2728:2: rule__Date__Group__5__Impl rule__Date__Group__6
            {
            pushFollow(FOLLOW_rule__Date__Group__5__Impl_in_rule__Date__Group__55401);
            rule__Date__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Date__Group__6_in_rule__Date__Group__55404);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2735:1: rule__Date__Group__5__Impl : ( ( rule__Date__YearAssignment_5 ) ) ;
    public final void rule__Date__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2739:1: ( ( ( rule__Date__YearAssignment_5 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2740:1: ( ( rule__Date__YearAssignment_5 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2740:1: ( ( rule__Date__YearAssignment_5 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2741:1: ( rule__Date__YearAssignment_5 )
            {
             before(grammarAccess.getDateAccess().getYearAssignment_5()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2742:1: ( rule__Date__YearAssignment_5 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2742:2: rule__Date__YearAssignment_5
            {
            pushFollow(FOLLOW_rule__Date__YearAssignment_5_in_rule__Date__Group__5__Impl5431);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2752:1: rule__Date__Group__6 : rule__Date__Group__6__Impl ;
    public final void rule__Date__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2756:1: ( rule__Date__Group__6__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2757:2: rule__Date__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Date__Group__6__Impl_in_rule__Date__Group__65461);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2763:1: rule__Date__Group__6__Impl : ( '}' ) ;
    public final void rule__Date__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2767:1: ( ( '}' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2768:1: ( '}' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2768:1: ( '}' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2769:1: '}'
            {
             before(grammarAccess.getDateAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_16_in_rule__Date__Group__6__Impl5489); 
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


    // $ANTLR start "rule__Language__Group_0__0"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2796:1: rule__Language__Group_0__0 : rule__Language__Group_0__0__Impl rule__Language__Group_0__1 ;
    public final void rule__Language__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2800:1: ( rule__Language__Group_0__0__Impl rule__Language__Group_0__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2801:2: rule__Language__Group_0__0__Impl rule__Language__Group_0__1
            {
            pushFollow(FOLLOW_rule__Language__Group_0__0__Impl_in_rule__Language__Group_0__05534);
            rule__Language__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Language__Group_0__1_in_rule__Language__Group_0__05537);
            rule__Language__Group_0__1();

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
    // $ANTLR end "rule__Language__Group_0__0"


    // $ANTLR start "rule__Language__Group_0__0__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2808:1: rule__Language__Group_0__0__Impl : ( () ) ;
    public final void rule__Language__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2812:1: ( ( () ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2813:1: ( () )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2813:1: ( () )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2814:1: ()
            {
             before(grammarAccess.getLanguageAccess().getEStringAction_0_0()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2815:1: ()
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2817:1: 
            {
            }

             after(grammarAccess.getLanguageAccess().getEStringAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__Group_0__0__Impl"


    // $ANTLR start "rule__Language__Group_0__1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2827:1: rule__Language__Group_0__1 : rule__Language__Group_0__1__Impl ;
    public final void rule__Language__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2831:1: ( rule__Language__Group_0__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2832:2: rule__Language__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Language__Group_0__1__Impl_in_rule__Language__Group_0__15595);
            rule__Language__Group_0__1__Impl();

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
    // $ANTLR end "rule__Language__Group_0__1"


    // $ANTLR start "rule__Language__Group_0__1__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2838:1: rule__Language__Group_0__1__Impl : ( 'English' ) ;
    public final void rule__Language__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2842:1: ( ( 'English' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2843:1: ( 'English' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2843:1: ( 'English' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2844:1: 'English'
            {
             before(grammarAccess.getLanguageAccess().getEnglishKeyword_0_1()); 
            match(input,41,FOLLOW_41_in_rule__Language__Group_0__1__Impl5623); 
             after(grammarAccess.getLanguageAccess().getEnglishKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__Group_0__1__Impl"


    // $ANTLR start "rule__Language__Group_1__0"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2861:1: rule__Language__Group_1__0 : rule__Language__Group_1__0__Impl rule__Language__Group_1__1 ;
    public final void rule__Language__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2865:1: ( rule__Language__Group_1__0__Impl rule__Language__Group_1__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2866:2: rule__Language__Group_1__0__Impl rule__Language__Group_1__1
            {
            pushFollow(FOLLOW_rule__Language__Group_1__0__Impl_in_rule__Language__Group_1__05658);
            rule__Language__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Language__Group_1__1_in_rule__Language__Group_1__05661);
            rule__Language__Group_1__1();

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
    // $ANTLR end "rule__Language__Group_1__0"


    // $ANTLR start "rule__Language__Group_1__0__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2873:1: rule__Language__Group_1__0__Impl : ( () ) ;
    public final void rule__Language__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2877:1: ( ( () ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2878:1: ( () )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2878:1: ( () )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2879:1: ()
            {
             before(grammarAccess.getLanguageAccess().getEStringAction_1_0()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2880:1: ()
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2882:1: 
            {
            }

             after(grammarAccess.getLanguageAccess().getEStringAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__Group_1__0__Impl"


    // $ANTLR start "rule__Language__Group_1__1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2892:1: rule__Language__Group_1__1 : rule__Language__Group_1__1__Impl ;
    public final void rule__Language__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2896:1: ( rule__Language__Group_1__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2897:2: rule__Language__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Language__Group_1__1__Impl_in_rule__Language__Group_1__15719);
            rule__Language__Group_1__1__Impl();

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
    // $ANTLR end "rule__Language__Group_1__1"


    // $ANTLR start "rule__Language__Group_1__1__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2903:1: rule__Language__Group_1__1__Impl : ( 'German' ) ;
    public final void rule__Language__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2907:1: ( ( 'German' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2908:1: ( 'German' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2908:1: ( 'German' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2909:1: 'German'
            {
             before(grammarAccess.getLanguageAccess().getGermanKeyword_1_1()); 
            match(input,42,FOLLOW_42_in_rule__Language__Group_1__1__Impl5747); 
             after(grammarAccess.getLanguageAccess().getGermanKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__Group_1__1__Impl"


    // $ANTLR start "rule__Price__Group__0"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2926:1: rule__Price__Group__0 : rule__Price__Group__0__Impl rule__Price__Group__1 ;
    public final void rule__Price__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2930:1: ( rule__Price__Group__0__Impl rule__Price__Group__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2931:2: rule__Price__Group__0__Impl rule__Price__Group__1
            {
            pushFollow(FOLLOW_rule__Price__Group__0__Impl_in_rule__Price__Group__05782);
            rule__Price__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Price__Group__1_in_rule__Price__Group__05785);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2938:1: rule__Price__Group__0__Impl : ( '{' ) ;
    public final void rule__Price__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2942:1: ( ( '{' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2943:1: ( '{' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2943:1: ( '{' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2944:1: '{'
            {
             before(grammarAccess.getPriceAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Price__Group__0__Impl5813); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2957:1: rule__Price__Group__1 : rule__Price__Group__1__Impl rule__Price__Group__2 ;
    public final void rule__Price__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2961:1: ( rule__Price__Group__1__Impl rule__Price__Group__2 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2962:2: rule__Price__Group__1__Impl rule__Price__Group__2
            {
            pushFollow(FOLLOW_rule__Price__Group__1__Impl_in_rule__Price__Group__15844);
            rule__Price__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Price__Group__2_in_rule__Price__Group__15847);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2969:1: rule__Price__Group__1__Impl : ( ( rule__Price__ValueAssignment_1 ) ) ;
    public final void rule__Price__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2973:1: ( ( ( rule__Price__ValueAssignment_1 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2974:1: ( ( rule__Price__ValueAssignment_1 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2974:1: ( ( rule__Price__ValueAssignment_1 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2975:1: ( rule__Price__ValueAssignment_1 )
            {
             before(grammarAccess.getPriceAccess().getValueAssignment_1()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2976:1: ( rule__Price__ValueAssignment_1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2976:2: rule__Price__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Price__ValueAssignment_1_in_rule__Price__Group__1__Impl5874);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2986:1: rule__Price__Group__2 : rule__Price__Group__2__Impl rule__Price__Group__3 ;
    public final void rule__Price__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2990:1: ( rule__Price__Group__2__Impl rule__Price__Group__3 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2991:2: rule__Price__Group__2__Impl rule__Price__Group__3
            {
            pushFollow(FOLLOW_rule__Price__Group__2__Impl_in_rule__Price__Group__25904);
            rule__Price__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Price__Group__3_in_rule__Price__Group__25907);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2998:1: rule__Price__Group__2__Impl : ( ( rule__Price__CurrencyAssignment_2 ) ) ;
    public final void rule__Price__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3002:1: ( ( ( rule__Price__CurrencyAssignment_2 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3003:1: ( ( rule__Price__CurrencyAssignment_2 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3003:1: ( ( rule__Price__CurrencyAssignment_2 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3004:1: ( rule__Price__CurrencyAssignment_2 )
            {
             before(grammarAccess.getPriceAccess().getCurrencyAssignment_2()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3005:1: ( rule__Price__CurrencyAssignment_2 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3005:2: rule__Price__CurrencyAssignment_2
            {
            pushFollow(FOLLOW_rule__Price__CurrencyAssignment_2_in_rule__Price__Group__2__Impl5934);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3015:1: rule__Price__Group__3 : rule__Price__Group__3__Impl ;
    public final void rule__Price__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3019:1: ( rule__Price__Group__3__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3020:2: rule__Price__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Price__Group__3__Impl_in_rule__Price__Group__35964);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3026:1: rule__Price__Group__3__Impl : ( '}' ) ;
    public final void rule__Price__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3030:1: ( ( '}' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3031:1: ( '}' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3031:1: ( '}' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3032:1: '}'
            {
             before(grammarAccess.getPriceAccess().getRightCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__Price__Group__3__Impl5992); 
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


    // $ANTLR start "rule__Value__Group__0"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3053:1: rule__Value__Group__0 : rule__Value__Group__0__Impl rule__Value__Group__1 ;
    public final void rule__Value__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3057:1: ( rule__Value__Group__0__Impl rule__Value__Group__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3058:2: rule__Value__Group__0__Impl rule__Value__Group__1
            {
            pushFollow(FOLLOW_rule__Value__Group__0__Impl_in_rule__Value__Group__06031);
            rule__Value__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Value__Group__1_in_rule__Value__Group__06034);
            rule__Value__Group__1();

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
    // $ANTLR end "rule__Value__Group__0"


    // $ANTLR start "rule__Value__Group__0__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3065:1: rule__Value__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Value__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3069:1: ( ( RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3070:1: ( RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3070:1: ( RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3071:1: RULE_INT
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Value__Group__0__Impl6061); 
             after(grammarAccess.getValueAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__0__Impl"


    // $ANTLR start "rule__Value__Group__1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3082:1: rule__Value__Group__1 : rule__Value__Group__1__Impl rule__Value__Group__2 ;
    public final void rule__Value__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3086:1: ( rule__Value__Group__1__Impl rule__Value__Group__2 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3087:2: rule__Value__Group__1__Impl rule__Value__Group__2
            {
            pushFollow(FOLLOW_rule__Value__Group__1__Impl_in_rule__Value__Group__16090);
            rule__Value__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Value__Group__2_in_rule__Value__Group__16093);
            rule__Value__Group__2();

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
    // $ANTLR end "rule__Value__Group__1"


    // $ANTLR start "rule__Value__Group__1__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3094:1: rule__Value__Group__1__Impl : ( ( rule__Value__Alternatives_1 ) ) ;
    public final void rule__Value__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3098:1: ( ( ( rule__Value__Alternatives_1 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3099:1: ( ( rule__Value__Alternatives_1 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3099:1: ( ( rule__Value__Alternatives_1 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3100:1: ( rule__Value__Alternatives_1 )
            {
             before(grammarAccess.getValueAccess().getAlternatives_1()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3101:1: ( rule__Value__Alternatives_1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3101:2: rule__Value__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_1_in_rule__Value__Group__1__Impl6120);
            rule__Value__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__1__Impl"


    // $ANTLR start "rule__Value__Group__2"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3111:1: rule__Value__Group__2 : rule__Value__Group__2__Impl ;
    public final void rule__Value__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3115:1: ( rule__Value__Group__2__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3116:2: rule__Value__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Value__Group__2__Impl_in_rule__Value__Group__26150);
            rule__Value__Group__2__Impl();

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
    // $ANTLR end "rule__Value__Group__2"


    // $ANTLR start "rule__Value__Group__2__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3122:1: rule__Value__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Value__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3126:1: ( ( RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3127:1: ( RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3127:1: ( RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3128:1: RULE_INT
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Value__Group__2__Impl6177); 
             after(grammarAccess.getValueAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__2__Impl"


    // $ANTLR start "rule__Currency__Group_0__0"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3145:1: rule__Currency__Group_0__0 : rule__Currency__Group_0__0__Impl rule__Currency__Group_0__1 ;
    public final void rule__Currency__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3149:1: ( rule__Currency__Group_0__0__Impl rule__Currency__Group_0__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3150:2: rule__Currency__Group_0__0__Impl rule__Currency__Group_0__1
            {
            pushFollow(FOLLOW_rule__Currency__Group_0__0__Impl_in_rule__Currency__Group_0__06212);
            rule__Currency__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Currency__Group_0__1_in_rule__Currency__Group_0__06215);
            rule__Currency__Group_0__1();

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
    // $ANTLR end "rule__Currency__Group_0__0"


    // $ANTLR start "rule__Currency__Group_0__0__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3157:1: rule__Currency__Group_0__0__Impl : ( () ) ;
    public final void rule__Currency__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3161:1: ( ( () ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3162:1: ( () )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3162:1: ( () )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3163:1: ()
            {
             before(grammarAccess.getCurrencyAccess().getEStringAction_0_0()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3164:1: ()
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3166:1: 
            {
            }

             after(grammarAccess.getCurrencyAccess().getEStringAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Currency__Group_0__0__Impl"


    // $ANTLR start "rule__Currency__Group_0__1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3176:1: rule__Currency__Group_0__1 : rule__Currency__Group_0__1__Impl ;
    public final void rule__Currency__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3180:1: ( rule__Currency__Group_0__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3181:2: rule__Currency__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Currency__Group_0__1__Impl_in_rule__Currency__Group_0__16273);
            rule__Currency__Group_0__1__Impl();

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
    // $ANTLR end "rule__Currency__Group_0__1"


    // $ANTLR start "rule__Currency__Group_0__1__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3187:1: rule__Currency__Group_0__1__Impl : ( 'Euro [\\u20AC]' ) ;
    public final void rule__Currency__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3191:1: ( ( 'Euro [\\u20AC]' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3192:1: ( 'Euro [\\u20AC]' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3192:1: ( 'Euro [\\u20AC]' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3193:1: 'Euro [\\u20AC]'
            {
             before(grammarAccess.getCurrencyAccess().getEuroKeyword_0_1()); 
            match(input,43,FOLLOW_43_in_rule__Currency__Group_0__1__Impl6301); 
             after(grammarAccess.getCurrencyAccess().getEuroKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Currency__Group_0__1__Impl"


    // $ANTLR start "rule__Currency__Group_1__0"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3210:1: rule__Currency__Group_1__0 : rule__Currency__Group_1__0__Impl rule__Currency__Group_1__1 ;
    public final void rule__Currency__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3214:1: ( rule__Currency__Group_1__0__Impl rule__Currency__Group_1__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3215:2: rule__Currency__Group_1__0__Impl rule__Currency__Group_1__1
            {
            pushFollow(FOLLOW_rule__Currency__Group_1__0__Impl_in_rule__Currency__Group_1__06336);
            rule__Currency__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Currency__Group_1__1_in_rule__Currency__Group_1__06339);
            rule__Currency__Group_1__1();

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
    // $ANTLR end "rule__Currency__Group_1__0"


    // $ANTLR start "rule__Currency__Group_1__0__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3222:1: rule__Currency__Group_1__0__Impl : ( () ) ;
    public final void rule__Currency__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3226:1: ( ( () ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3227:1: ( () )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3227:1: ( () )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3228:1: ()
            {
             before(grammarAccess.getCurrencyAccess().getEStringAction_1_0()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3229:1: ()
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3231:1: 
            {
            }

             after(grammarAccess.getCurrencyAccess().getEStringAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Currency__Group_1__0__Impl"


    // $ANTLR start "rule__Currency__Group_1__1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3241:1: rule__Currency__Group_1__1 : rule__Currency__Group_1__1__Impl ;
    public final void rule__Currency__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3245:1: ( rule__Currency__Group_1__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3246:2: rule__Currency__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Currency__Group_1__1__Impl_in_rule__Currency__Group_1__16397);
            rule__Currency__Group_1__1__Impl();

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
    // $ANTLR end "rule__Currency__Group_1__1"


    // $ANTLR start "rule__Currency__Group_1__1__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3252:1: rule__Currency__Group_1__1__Impl : ( 'Dollar [$]' ) ;
    public final void rule__Currency__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3256:1: ( ( 'Dollar [$]' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3257:1: ( 'Dollar [$]' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3257:1: ( 'Dollar [$]' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3258:1: 'Dollar [$]'
            {
             before(grammarAccess.getCurrencyAccess().getDollarKeyword_1_1()); 
            match(input,44,FOLLOW_44_in_rule__Currency__Group_1__1__Impl6425); 
             after(grammarAccess.getCurrencyAccess().getDollarKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Currency__Group_1__1__Impl"


    // $ANTLR start "rule__Topic__Group__0"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3275:1: rule__Topic__Group__0 : rule__Topic__Group__0__Impl rule__Topic__Group__1 ;
    public final void rule__Topic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3279:1: ( rule__Topic__Group__0__Impl rule__Topic__Group__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3280:2: rule__Topic__Group__0__Impl rule__Topic__Group__1
            {
            pushFollow(FOLLOW_rule__Topic__Group__0__Impl_in_rule__Topic__Group__06460);
            rule__Topic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Topic__Group__1_in_rule__Topic__Group__06463);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3287:1: rule__Topic__Group__0__Impl : ( 'topic' ) ;
    public final void rule__Topic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3291:1: ( ( 'topic' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3292:1: ( 'topic' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3292:1: ( 'topic' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3293:1: 'topic'
            {
             before(grammarAccess.getTopicAccess().getTopicKeyword_0()); 
            match(input,45,FOLLOW_45_in_rule__Topic__Group__0__Impl6491); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3306:1: rule__Topic__Group__1 : rule__Topic__Group__1__Impl rule__Topic__Group__2 ;
    public final void rule__Topic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3310:1: ( rule__Topic__Group__1__Impl rule__Topic__Group__2 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3311:2: rule__Topic__Group__1__Impl rule__Topic__Group__2
            {
            pushFollow(FOLLOW_rule__Topic__Group__1__Impl_in_rule__Topic__Group__16522);
            rule__Topic__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Topic__Group__2_in_rule__Topic__Group__16525);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3318:1: rule__Topic__Group__1__Impl : ( ( rule__Topic__NameAssignment_1 ) ) ;
    public final void rule__Topic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3322:1: ( ( ( rule__Topic__NameAssignment_1 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3323:1: ( ( rule__Topic__NameAssignment_1 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3323:1: ( ( rule__Topic__NameAssignment_1 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3324:1: ( rule__Topic__NameAssignment_1 )
            {
             before(grammarAccess.getTopicAccess().getNameAssignment_1()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3325:1: ( rule__Topic__NameAssignment_1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3325:2: rule__Topic__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Topic__NameAssignment_1_in_rule__Topic__Group__1__Impl6552);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3335:1: rule__Topic__Group__2 : rule__Topic__Group__2__Impl rule__Topic__Group__3 ;
    public final void rule__Topic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3339:1: ( rule__Topic__Group__2__Impl rule__Topic__Group__3 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3340:2: rule__Topic__Group__2__Impl rule__Topic__Group__3
            {
            pushFollow(FOLLOW_rule__Topic__Group__2__Impl_in_rule__Topic__Group__26582);
            rule__Topic__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Topic__Group__3_in_rule__Topic__Group__26585);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3347:1: rule__Topic__Group__2__Impl : ( '{' ) ;
    public final void rule__Topic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3351:1: ( ( '{' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3352:1: ( '{' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3352:1: ( '{' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3353:1: '{'
            {
             before(grammarAccess.getTopicAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Topic__Group__2__Impl6613); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3366:1: rule__Topic__Group__3 : rule__Topic__Group__3__Impl rule__Topic__Group__4 ;
    public final void rule__Topic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3370:1: ( rule__Topic__Group__3__Impl rule__Topic__Group__4 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3371:2: rule__Topic__Group__3__Impl rule__Topic__Group__4
            {
            pushFollow(FOLLOW_rule__Topic__Group__3__Impl_in_rule__Topic__Group__36644);
            rule__Topic__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Topic__Group__4_in_rule__Topic__Group__36647);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3378:1: rule__Topic__Group__3__Impl : ( ( rule__Topic__TagsAssignment_3 ) ) ;
    public final void rule__Topic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3382:1: ( ( ( rule__Topic__TagsAssignment_3 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3383:1: ( ( rule__Topic__TagsAssignment_3 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3383:1: ( ( rule__Topic__TagsAssignment_3 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3384:1: ( rule__Topic__TagsAssignment_3 )
            {
             before(grammarAccess.getTopicAccess().getTagsAssignment_3()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3385:1: ( rule__Topic__TagsAssignment_3 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3385:2: rule__Topic__TagsAssignment_3
            {
            pushFollow(FOLLOW_rule__Topic__TagsAssignment_3_in_rule__Topic__Group__3__Impl6674);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3395:1: rule__Topic__Group__4 : rule__Topic__Group__4__Impl rule__Topic__Group__5 ;
    public final void rule__Topic__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3399:1: ( rule__Topic__Group__4__Impl rule__Topic__Group__5 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3400:2: rule__Topic__Group__4__Impl rule__Topic__Group__5
            {
            pushFollow(FOLLOW_rule__Topic__Group__4__Impl_in_rule__Topic__Group__46704);
            rule__Topic__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Topic__Group__5_in_rule__Topic__Group__46707);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3407:1: rule__Topic__Group__4__Impl : ( ( rule__Topic__Group_4__0 )* ) ;
    public final void rule__Topic__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3411:1: ( ( ( rule__Topic__Group_4__0 )* ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3412:1: ( ( rule__Topic__Group_4__0 )* )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3412:1: ( ( rule__Topic__Group_4__0 )* )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3413:1: ( rule__Topic__Group_4__0 )*
            {
             before(grammarAccess.getTopicAccess().getGroup_4()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3414:1: ( rule__Topic__Group_4__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3414:2: rule__Topic__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Topic__Group_4__0_in_rule__Topic__Group__4__Impl6734);
            	    rule__Topic__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3424:1: rule__Topic__Group__5 : rule__Topic__Group__5__Impl ;
    public final void rule__Topic__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3428:1: ( rule__Topic__Group__5__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3429:2: rule__Topic__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Topic__Group__5__Impl_in_rule__Topic__Group__56765);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3435:1: rule__Topic__Group__5__Impl : ( '}' ) ;
    public final void rule__Topic__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3439:1: ( ( '}' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3440:1: ( '}' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3440:1: ( '}' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3441:1: '}'
            {
             before(grammarAccess.getTopicAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_16_in_rule__Topic__Group__5__Impl6793); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3466:1: rule__Topic__Group_4__0 : rule__Topic__Group_4__0__Impl rule__Topic__Group_4__1 ;
    public final void rule__Topic__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3470:1: ( rule__Topic__Group_4__0__Impl rule__Topic__Group_4__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3471:2: rule__Topic__Group_4__0__Impl rule__Topic__Group_4__1
            {
            pushFollow(FOLLOW_rule__Topic__Group_4__0__Impl_in_rule__Topic__Group_4__06836);
            rule__Topic__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Topic__Group_4__1_in_rule__Topic__Group_4__06839);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3478:1: rule__Topic__Group_4__0__Impl : ( ', ' ) ;
    public final void rule__Topic__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3482:1: ( ( ', ' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3483:1: ( ', ' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3483:1: ( ', ' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3484:1: ', '
            {
             before(grammarAccess.getTopicAccess().getCommaSpaceKeyword_4_0()); 
            match(input,26,FOLLOW_26_in_rule__Topic__Group_4__0__Impl6867); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3497:1: rule__Topic__Group_4__1 : rule__Topic__Group_4__1__Impl ;
    public final void rule__Topic__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3501:1: ( rule__Topic__Group_4__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3502:2: rule__Topic__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Topic__Group_4__1__Impl_in_rule__Topic__Group_4__16898);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3508:1: rule__Topic__Group_4__1__Impl : ( ( rule__Topic__TagsAssignment_4_1 ) ) ;
    public final void rule__Topic__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3512:1: ( ( ( rule__Topic__TagsAssignment_4_1 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3513:1: ( ( rule__Topic__TagsAssignment_4_1 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3513:1: ( ( rule__Topic__TagsAssignment_4_1 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3514:1: ( rule__Topic__TagsAssignment_4_1 )
            {
             before(grammarAccess.getTopicAccess().getTagsAssignment_4_1()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3515:1: ( rule__Topic__TagsAssignment_4_1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3515:2: rule__Topic__TagsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Topic__TagsAssignment_4_1_in_rule__Topic__Group_4__1__Impl6925);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3529:1: rule__Pair__Group__0 : rule__Pair__Group__0__Impl rule__Pair__Group__1 ;
    public final void rule__Pair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3533:1: ( rule__Pair__Group__0__Impl rule__Pair__Group__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3534:2: rule__Pair__Group__0__Impl rule__Pair__Group__1
            {
            pushFollow(FOLLOW_rule__Pair__Group__0__Impl_in_rule__Pair__Group__06959);
            rule__Pair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Pair__Group__1_in_rule__Pair__Group__06962);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3541:1: rule__Pair__Group__0__Impl : ( ( rule__Pair__KeyAssignment_0 ) ) ;
    public final void rule__Pair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3545:1: ( ( ( rule__Pair__KeyAssignment_0 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3546:1: ( ( rule__Pair__KeyAssignment_0 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3546:1: ( ( rule__Pair__KeyAssignment_0 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3547:1: ( rule__Pair__KeyAssignment_0 )
            {
             before(grammarAccess.getPairAccess().getKeyAssignment_0()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3548:1: ( rule__Pair__KeyAssignment_0 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3548:2: rule__Pair__KeyAssignment_0
            {
            pushFollow(FOLLOW_rule__Pair__KeyAssignment_0_in_rule__Pair__Group__0__Impl6989);
            rule__Pair__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPairAccess().getKeyAssignment_0()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3558:1: rule__Pair__Group__1 : rule__Pair__Group__1__Impl rule__Pair__Group__2 ;
    public final void rule__Pair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3562:1: ( rule__Pair__Group__1__Impl rule__Pair__Group__2 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3563:2: rule__Pair__Group__1__Impl rule__Pair__Group__2
            {
            pushFollow(FOLLOW_rule__Pair__Group__1__Impl_in_rule__Pair__Group__17019);
            rule__Pair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Pair__Group__2_in_rule__Pair__Group__17022);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3570:1: rule__Pair__Group__1__Impl : ( ':' ) ;
    public final void rule__Pair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3574:1: ( ( ':' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3575:1: ( ':' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3575:1: ( ':' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3576:1: ':'
            {
             before(grammarAccess.getPairAccess().getColonKeyword_1()); 
            match(input,46,FOLLOW_46_in_rule__Pair__Group__1__Impl7050); 
             after(grammarAccess.getPairAccess().getColonKeyword_1()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3589:1: rule__Pair__Group__2 : rule__Pair__Group__2__Impl ;
    public final void rule__Pair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3593:1: ( rule__Pair__Group__2__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3594:2: rule__Pair__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Pair__Group__2__Impl_in_rule__Pair__Group__27081);
            rule__Pair__Group__2__Impl();

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3600:1: rule__Pair__Group__2__Impl : ( ( rule__Pair__ValueAssignment_2 ) ) ;
    public final void rule__Pair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3604:1: ( ( ( rule__Pair__ValueAssignment_2 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3605:1: ( ( rule__Pair__ValueAssignment_2 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3605:1: ( ( rule__Pair__ValueAssignment_2 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3606:1: ( rule__Pair__ValueAssignment_2 )
            {
             before(grammarAccess.getPairAccess().getValueAssignment_2()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3607:1: ( rule__Pair__ValueAssignment_2 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3607:2: rule__Pair__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Pair__ValueAssignment_2_in_rule__Pair__Group__2__Impl7108);
            rule__Pair__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPairAccess().getValueAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Declaration__NameAssignment_1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3624:1: rule__Declaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Declaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3628:1: ( ( RULE_ID ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3629:1: ( RULE_ID )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3629:1: ( RULE_ID )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3630:1: RULE_ID
            {
             before(grammarAccess.getDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Declaration__NameAssignment_17149); 
             after(grammarAccess.getDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__NameAssignment_1"


    // $ANTLR start "rule__Declaration__FeedlinksAssignment_5"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3639:1: rule__Declaration__FeedlinksAssignment_5 : ( rulePair ) ;
    public final void rule__Declaration__FeedlinksAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3643:1: ( ( rulePair ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3644:1: ( rulePair )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3644:1: ( rulePair )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3645:1: rulePair
            {
             before(grammarAccess.getDeclarationAccess().getFeedlinksPairParserRuleCall_5_0()); 
            pushFollow(FOLLOW_rulePair_in_rule__Declaration__FeedlinksAssignment_57180);
            rulePair();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getFeedlinksPairParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__FeedlinksAssignment_5"


    // $ANTLR start "rule__Declaration__PairsAssignment_6_1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3654:1: rule__Declaration__PairsAssignment_6_1 : ( rulePair ) ;
    public final void rule__Declaration__PairsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3658:1: ( ( rulePair ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3659:1: ( rulePair )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3659:1: ( rulePair )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3660:1: rulePair
            {
             before(grammarAccess.getDeclarationAccess().getPairsPairParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_rulePair_in_rule__Declaration__PairsAssignment_6_17211);
            rulePair();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getPairsPairParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__PairsAssignment_6_1"


    // $ANTLR start "rule__Declaration__TopicsAssignment_10"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3669:1: rule__Declaration__TopicsAssignment_10 : ( ruleTopic ) ;
    public final void rule__Declaration__TopicsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3673:1: ( ( ruleTopic ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3674:1: ( ruleTopic )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3674:1: ( ruleTopic )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3675:1: ruleTopic
            {
             before(grammarAccess.getDeclarationAccess().getTopicsTopicParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleTopic_in_rule__Declaration__TopicsAssignment_107242);
            ruleTopic();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getTopicsTopicParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__TopicsAssignment_10"


    // $ANTLR start "rule__Declaration__TopicsAssignment_11"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3684:1: rule__Declaration__TopicsAssignment_11 : ( ruleTopic ) ;
    public final void rule__Declaration__TopicsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3688:1: ( ( ruleTopic ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3689:1: ( ruleTopic )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3689:1: ( ruleTopic )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3690:1: ruleTopic
            {
             before(grammarAccess.getDeclarationAccess().getTopicsTopicParserRuleCall_11_0()); 
            pushFollow(FOLLOW_ruleTopic_in_rule__Declaration__TopicsAssignment_117273);
            ruleTopic();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getTopicsTopicParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__TopicsAssignment_11"


    // $ANTLR start "rule__Declaration__DateAssignment_13_1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3699:1: rule__Declaration__DateAssignment_13_1 : ( ruleDate ) ;
    public final void rule__Declaration__DateAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3703:1: ( ( ruleDate ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3704:1: ( ruleDate )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3704:1: ( ruleDate )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3705:1: ruleDate
            {
             before(grammarAccess.getDeclarationAccess().getDateDateParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_ruleDate_in_rule__Declaration__DateAssignment_13_17304);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getDateDateParserRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__DateAssignment_13_1"


    // $ANTLR start "rule__Declaration__LocationAssignment_14_1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3714:1: rule__Declaration__LocationAssignment_14_1 : ( RULE_STRING ) ;
    public final void rule__Declaration__LocationAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3718:1: ( ( RULE_STRING ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3719:1: ( RULE_STRING )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3719:1: ( RULE_STRING )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3720:1: RULE_STRING
            {
             before(grammarAccess.getDeclarationAccess().getLocationSTRINGTerminalRuleCall_14_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Declaration__LocationAssignment_14_17335); 
             after(grammarAccess.getDeclarationAccess().getLocationSTRINGTerminalRuleCall_14_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__LocationAssignment_14_1"


    // $ANTLR start "rule__Declaration__PriceAssignment_16"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3729:1: rule__Declaration__PriceAssignment_16 : ( rulePrice ) ;
    public final void rule__Declaration__PriceAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3733:1: ( ( rulePrice ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3734:1: ( rulePrice )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3734:1: ( rulePrice )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3735:1: rulePrice
            {
             before(grammarAccess.getDeclarationAccess().getPricePriceParserRuleCall_16_0()); 
            pushFollow(FOLLOW_rulePrice_in_rule__Declaration__PriceAssignment_167366);
            rulePrice();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getPricePriceParserRuleCall_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__PriceAssignment_16"


    // $ANTLR start "rule__Declaration__VolumeAssignment_17_1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3744:1: rule__Declaration__VolumeAssignment_17_1 : ( RULE_INT ) ;
    public final void rule__Declaration__VolumeAssignment_17_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3748:1: ( ( RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3749:1: ( RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3749:1: ( RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3750:1: RULE_INT
            {
             before(grammarAccess.getDeclarationAccess().getVolumeINTTerminalRuleCall_17_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Declaration__VolumeAssignment_17_17397); 
             after(grammarAccess.getDeclarationAccess().getVolumeINTTerminalRuleCall_17_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__VolumeAssignment_17_1"


    // $ANTLR start "rule__Declaration__LanguageAssignment_19"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3759:1: rule__Declaration__LanguageAssignment_19 : ( ruleLanguage ) ;
    public final void rule__Declaration__LanguageAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3763:1: ( ( ruleLanguage ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3764:1: ( ruleLanguage )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3764:1: ( ruleLanguage )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3765:1: ruleLanguage
            {
             before(grammarAccess.getDeclarationAccess().getLanguageLanguageParserRuleCall_19_0()); 
            pushFollow(FOLLOW_ruleLanguage_in_rule__Declaration__LanguageAssignment_197428);
            ruleLanguage();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getLanguageLanguageParserRuleCall_19_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__LanguageAssignment_19"


    // $ANTLR start "rule__Declaration__FormatAssignment_21"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3774:1: rule__Declaration__FormatAssignment_21 : ( ruleFormat ) ;
    public final void rule__Declaration__FormatAssignment_21() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3778:1: ( ( ruleFormat ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3779:1: ( ruleFormat )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3779:1: ( ruleFormat )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3780:1: ruleFormat
            {
             before(grammarAccess.getDeclarationAccess().getFormatFormatParserRuleCall_21_0()); 
            pushFollow(FOLLOW_ruleFormat_in_rule__Declaration__FormatAssignment_217459);
            ruleFormat();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getFormatFormatParserRuleCall_21_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__FormatAssignment_21"


    // $ANTLR start "rule__Declaration__ArticleCntAssignment_23"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3789:1: rule__Declaration__ArticleCntAssignment_23 : ( RULE_INT ) ;
    public final void rule__Declaration__ArticleCntAssignment_23() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3793:1: ( ( RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3794:1: ( RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3794:1: ( RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3795:1: RULE_INT
            {
             before(grammarAccess.getDeclarationAccess().getArticleCntINTTerminalRuleCall_23_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Declaration__ArticleCntAssignment_237490); 
             after(grammarAccess.getDeclarationAccess().getArticleCntINTTerminalRuleCall_23_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__ArticleCntAssignment_23"


    // $ANTLR start "rule__Declaration__ArticleCharMinAssignment_25"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3804:1: rule__Declaration__ArticleCharMinAssignment_25 : ( RULE_INT ) ;
    public final void rule__Declaration__ArticleCharMinAssignment_25() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3808:1: ( ( RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3809:1: ( RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3809:1: ( RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3810:1: RULE_INT
            {
             before(grammarAccess.getDeclarationAccess().getArticleCharMinINTTerminalRuleCall_25_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Declaration__ArticleCharMinAssignment_257521); 
             after(grammarAccess.getDeclarationAccess().getArticleCharMinINTTerminalRuleCall_25_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__ArticleCharMinAssignment_25"


    // $ANTLR start "rule__Declaration__ArticleCharMaxAssignment_27"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3819:1: rule__Declaration__ArticleCharMaxAssignment_27 : ( RULE_INT ) ;
    public final void rule__Declaration__ArticleCharMaxAssignment_27() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3823:1: ( ( RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3824:1: ( RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3824:1: ( RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3825:1: RULE_INT
            {
             before(grammarAccess.getDeclarationAccess().getArticleCharMaxINTTerminalRuleCall_27_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Declaration__ArticleCharMaxAssignment_277552); 
             after(grammarAccess.getDeclarationAccess().getArticleCharMaxINTTerminalRuleCall_27_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__ArticleCharMaxAssignment_27"


    // $ANTLR start "rule__Declaration__ImagesCntAssignment_28_1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3834:1: rule__Declaration__ImagesCntAssignment_28_1 : ( RULE_INT ) ;
    public final void rule__Declaration__ImagesCntAssignment_28_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3838:1: ( ( RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3839:1: ( RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3839:1: ( RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3840:1: RULE_INT
            {
             before(grammarAccess.getDeclarationAccess().getImagesCntINTTerminalRuleCall_28_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Declaration__ImagesCntAssignment_28_17583); 
             after(grammarAccess.getDeclarationAccess().getImagesCntINTTerminalRuleCall_28_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__ImagesCntAssignment_28_1"


    // $ANTLR start "rule__Declaration__ColumnsCntAssignment_30"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3849:1: rule__Declaration__ColumnsCntAssignment_30 : ( RULE_INT ) ;
    public final void rule__Declaration__ColumnsCntAssignment_30() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3853:1: ( ( RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3854:1: ( RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3854:1: ( RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3855:1: RULE_INT
            {
             before(grammarAccess.getDeclarationAccess().getColumnsCntINTTerminalRuleCall_30_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Declaration__ColumnsCntAssignment_307614); 
             after(grammarAccess.getDeclarationAccess().getColumnsCntINTTerminalRuleCall_30_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__ColumnsCntAssignment_30"


    // $ANTLR start "rule__Declaration__FontSizeAssignment_32"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3864:1: rule__Declaration__FontSizeAssignment_32 : ( ruleFontSize ) ;
    public final void rule__Declaration__FontSizeAssignment_32() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3868:1: ( ( ruleFontSize ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3869:1: ( ruleFontSize )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3869:1: ( ruleFontSize )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3870:1: ruleFontSize
            {
             before(grammarAccess.getDeclarationAccess().getFontSizeFontSizeParserRuleCall_32_0()); 
            pushFollow(FOLLOW_ruleFontSize_in_rule__Declaration__FontSizeAssignment_327645);
            ruleFontSize();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getFontSizeFontSizeParserRuleCall_32_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__FontSizeAssignment_32"


    // $ANTLR start "rule__Date__DayAssignment_1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3879:1: rule__Date__DayAssignment_1 : ( RULE_INT ) ;
    public final void rule__Date__DayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3883:1: ( ( RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3884:1: ( RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3884:1: ( RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3885:1: RULE_INT
            {
             before(grammarAccess.getDateAccess().getDayINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Date__DayAssignment_17676); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3894:1: rule__Date__MonthAssignment_3 : ( RULE_INT ) ;
    public final void rule__Date__MonthAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3898:1: ( ( RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3899:1: ( RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3899:1: ( RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3900:1: RULE_INT
            {
             before(grammarAccess.getDateAccess().getMonthINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Date__MonthAssignment_37707); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3909:1: rule__Date__YearAssignment_5 : ( RULE_INT ) ;
    public final void rule__Date__YearAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3913:1: ( ( RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3914:1: ( RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3914:1: ( RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3915:1: RULE_INT
            {
             before(grammarAccess.getDateAccess().getYearINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Date__YearAssignment_57738); 
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


    // $ANTLR start "rule__Price__ValueAssignment_1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3924:1: rule__Price__ValueAssignment_1 : ( ruleValue ) ;
    public final void rule__Price__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3928:1: ( ( ruleValue ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3929:1: ( ruleValue )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3929:1: ( ruleValue )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3930:1: ruleValue
            {
             before(grammarAccess.getPriceAccess().getValueValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Price__ValueAssignment_17769);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getPriceAccess().getValueValueParserRuleCall_1_0()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3939:1: rule__Price__CurrencyAssignment_2 : ( ruleCurrency ) ;
    public final void rule__Price__CurrencyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3943:1: ( ( ruleCurrency ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3944:1: ( ruleCurrency )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3944:1: ( ruleCurrency )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3945:1: ruleCurrency
            {
             before(grammarAccess.getPriceAccess().getCurrencyCurrencyParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCurrency_in_rule__Price__CurrencyAssignment_27800);
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


    // $ANTLR start "rule__Topic__NameAssignment_1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3954:1: rule__Topic__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Topic__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3958:1: ( ( RULE_ID ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3959:1: ( RULE_ID )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3959:1: ( RULE_ID )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3960:1: RULE_ID
            {
             before(grammarAccess.getTopicAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Topic__NameAssignment_17831); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3969:1: rule__Topic__TagsAssignment_3 : ( ruleTopicTag ) ;
    public final void rule__Topic__TagsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3973:1: ( ( ruleTopicTag ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3974:1: ( ruleTopicTag )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3974:1: ( ruleTopicTag )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3975:1: ruleTopicTag
            {
             before(grammarAccess.getTopicAccess().getTagsTopicTagParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTopicTag_in_rule__Topic__TagsAssignment_37862);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3984:1: rule__Topic__TagsAssignment_4_1 : ( ruleTopicTag ) ;
    public final void rule__Topic__TagsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3988:1: ( ( ruleTopicTag ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3989:1: ( ruleTopicTag )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3989:1: ( ruleTopicTag )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3990:1: ruleTopicTag
            {
             before(grammarAccess.getTopicAccess().getTagsTopicTagParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleTopicTag_in_rule__Topic__TagsAssignment_4_17893);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3999:1: rule__TopicTag__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__TopicTag__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4003:1: ( ( RULE_STRING ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4004:1: ( RULE_STRING )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4004:1: ( RULE_STRING )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4005:1: RULE_STRING
            {
             before(grammarAccess.getTopicTagAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TopicTag__ValueAssignment7924); 
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


    // $ANTLR start "rule__Pair__KeyAssignment_0"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4014:1: rule__Pair__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__Pair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4018:1: ( ( RULE_ID ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4019:1: ( RULE_ID )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4019:1: ( RULE_ID )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4020:1: RULE_ID
            {
             before(grammarAccess.getPairAccess().getKeyIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Pair__KeyAssignment_07955); 
             after(grammarAccess.getPairAccess().getKeyIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pair__KeyAssignment_0"


    // $ANTLR start "rule__Pair__ValueAssignment_2"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4029:1: rule__Pair__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Pair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4033:1: ( ( RULE_STRING ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4034:1: ( RULE_STRING )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4034:1: ( RULE_STRING )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4035:1: RULE_STRING
            {
             before(grammarAccess.getPairAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Pair__ValueAssignment_27986); 
             after(grammarAccess.getPairAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pair__ValueAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__0_in_ruleDeclaration94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFontSize_in_entryRuleFontSize121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFontSize128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FontSize__Alternatives_in_ruleFontSize154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormat_in_entryRuleFormat181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormat188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Alternatives_in_ruleFormat214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_in_entryRuleDate241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDate248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__Group__0_in_ruleDate274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLanguage_in_entryRuleLanguage301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLanguage308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Alternatives_in_ruleLanguage334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrice_in_entryRulePrice361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrice368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Price__Group__0_in_rulePrice394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group__0_in_ruleValue454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCurrency_in_entryRuleCurrency481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCurrency488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Currency__Alternatives_in_ruleCurrency514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopic_in_entryRuleTopic541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopic548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Topic__Group__0_in_ruleTopic574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopicTag_in_entryRuleTopicTag601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopicTag608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopicTag__ValueAssignment_in_ruleTopicTag634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePair_in_entryRulePair661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePair668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pair__Group__0_in_rulePair694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FontSize__Group_0__0_in_rule__FontSize__Alternatives730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FontSize__Group_1__0_in_rule__FontSize__Alternatives748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FontSize__Group_2__0_in_rule__FontSize__Alternatives766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_0__0_in_rule__Format__Alternatives799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_1__0_in_rule__Format__Alternatives817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_2__0_in_rule__Format__Alternatives835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_3__0_in_rule__Format__Alternatives853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_4__0_in_rule__Format__Alternatives871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_5__0_in_rule__Format__Alternatives889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_6__0_in_rule__Format__Alternatives907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group_0__0_in_rule__Language__Alternatives940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group_1__0_in_rule__Language__Alternatives958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Value__Alternatives_1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Value__Alternatives_11012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Currency__Group_0__0_in_rule__Currency__Alternatives1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Currency__Group_1__0_in_rule__Currency__Alternatives1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__0__Impl_in_rule__Declaration__Group__01095 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Declaration__Group__1_in_rule__Declaration__Group__01098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Declaration__Group__0__Impl1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__1__Impl_in_rule__Declaration__Group__11157 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__2_in_rule__Declaration__Group__11160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__NameAssignment_1_in_rule__Declaration__Group__1__Impl1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__2__Impl_in_rule__Declaration__Group__21217 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__3_in_rule__Declaration__Group__21220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Declaration__Group__2__Impl1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__3__Impl_in_rule__Declaration__Group__31279 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__4_in_rule__Declaration__Group__31282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Declaration__Group__3__Impl1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__4__Impl_in_rule__Declaration__Group__41341 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Declaration__Group__5_in_rule__Declaration__Group__41344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Declaration__Group__4__Impl1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__5__Impl_in_rule__Declaration__Group__51403 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__6_in_rule__Declaration__Group__51406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__FeedlinksAssignment_5_in_rule__Declaration__Group__5__Impl1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__6__Impl_in_rule__Declaration__Group__61463 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__7_in_rule__Declaration__Group__61466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_6__0_in_rule__Declaration__Group__6__Impl1493 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__7__Impl_in_rule__Declaration__Group__71524 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__8_in_rule__Declaration__Group__71527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Declaration__Group__7__Impl1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__8__Impl_in_rule__Declaration__Group__81586 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__9_in_rule__Declaration__Group__81589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Declaration__Group__8__Impl1617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__9__Impl_in_rule__Declaration__Group__91648 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__10_in_rule__Declaration__Group__91651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Declaration__Group__9__Impl1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__10__Impl_in_rule__Declaration__Group__101710 = new BitSet(new long[]{0x0000200000010000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__11_in_rule__Declaration__Group__101713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__TopicsAssignment_10_in_rule__Declaration__Group__10__Impl1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__11__Impl_in_rule__Declaration__Group__111770 = new BitSet(new long[]{0x0000200000010000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__12_in_rule__Declaration__Group__111773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__TopicsAssignment_11_in_rule__Declaration__Group__11__Impl1800 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__12__Impl_in_rule__Declaration__Group__121831 = new BitSet(new long[]{0x0000000018040000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__13_in_rule__Declaration__Group__121834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Declaration__Group__12__Impl1862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__13__Impl_in_rule__Declaration__Group__131893 = new BitSet(new long[]{0x0000000018040000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__14_in_rule__Declaration__Group__131896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_13__0_in_rule__Declaration__Group__13__Impl1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__14__Impl_in_rule__Declaration__Group__141954 = new BitSet(new long[]{0x0000000018040000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__15_in_rule__Declaration__Group__141957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_14__0_in_rule__Declaration__Group__14__Impl1984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__15__Impl_in_rule__Declaration__Group__152015 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__16_in_rule__Declaration__Group__152018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Declaration__Group__15__Impl2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__16__Impl_in_rule__Declaration__Group__162077 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__17_in_rule__Declaration__Group__162080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__PriceAssignment_16_in_rule__Declaration__Group__16__Impl2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__17__Impl_in_rule__Declaration__Group__172137 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__18_in_rule__Declaration__Group__172140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_17__0_in_rule__Declaration__Group__17__Impl2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__18__Impl_in_rule__Declaration__Group__182198 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__19_in_rule__Declaration__Group__182201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Declaration__Group__18__Impl2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__19__Impl_in_rule__Declaration__Group__192260 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__20_in_rule__Declaration__Group__192263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__LanguageAssignment_19_in_rule__Declaration__Group__19__Impl2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__20__Impl_in_rule__Declaration__Group__202320 = new BitSet(new long[]{0x000001FC00000000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__21_in_rule__Declaration__Group__202323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Declaration__Group__20__Impl2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__21__Impl_in_rule__Declaration__Group__212382 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__22_in_rule__Declaration__Group__212385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__FormatAssignment_21_in_rule__Declaration__Group__21__Impl2412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__22__Impl_in_rule__Declaration__Group__222442 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Declaration__Group__23_in_rule__Declaration__Group__222445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Declaration__Group__22__Impl2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__23__Impl_in_rule__Declaration__Group__232504 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__24_in_rule__Declaration__Group__232507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__ArticleCntAssignment_23_in_rule__Declaration__Group__23__Impl2534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__24__Impl_in_rule__Declaration__Group__242564 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Declaration__Group__25_in_rule__Declaration__Group__242567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Declaration__Group__24__Impl2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__25__Impl_in_rule__Declaration__Group__252626 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__26_in_rule__Declaration__Group__252629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__ArticleCharMinAssignment_25_in_rule__Declaration__Group__25__Impl2656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__26__Impl_in_rule__Declaration__Group__262686 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Declaration__Group__27_in_rule__Declaration__Group__262689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Declaration__Group__26__Impl2717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__27__Impl_in_rule__Declaration__Group__272748 = new BitSet(new long[]{0x0000000041000000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__28_in_rule__Declaration__Group__272751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__ArticleCharMaxAssignment_27_in_rule__Declaration__Group__27__Impl2778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__28__Impl_in_rule__Declaration__Group__282808 = new BitSet(new long[]{0x0000000041000000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__29_in_rule__Declaration__Group__282811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_28__0_in_rule__Declaration__Group__28__Impl2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__29__Impl_in_rule__Declaration__Group__292869 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Declaration__Group__30_in_rule__Declaration__Group__292872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Declaration__Group__29__Impl2900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__30__Impl_in_rule__Declaration__Group__302931 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__31_in_rule__Declaration__Group__302934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__ColumnsCntAssignment_30_in_rule__Declaration__Group__30__Impl2961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__31__Impl_in_rule__Declaration__Group__312991 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__32_in_rule__Declaration__Group__312994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Declaration__Group__31__Impl3022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__32__Impl_in_rule__Declaration__Group__323053 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__33_in_rule__Declaration__Group__323056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__FontSizeAssignment_32_in_rule__Declaration__Group__32__Impl3083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__33__Impl_in_rule__Declaration__Group__333113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Declaration__Group__33__Impl3141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_6__0__Impl_in_rule__Declaration__Group_6__03240 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Declaration__Group_6__1_in_rule__Declaration__Group_6__03243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Declaration__Group_6__0__Impl3271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_6__1__Impl_in_rule__Declaration__Group_6__13302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__PairsAssignment_6_1_in_rule__Declaration__Group_6__1__Impl3329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_13__0__Impl_in_rule__Declaration__Group_13__03363 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Declaration__Group_13__1_in_rule__Declaration__Group_13__03366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Declaration__Group_13__0__Impl3394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_13__1__Impl_in_rule__Declaration__Group_13__13425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__DateAssignment_13_1_in_rule__Declaration__Group_13__1__Impl3452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_14__0__Impl_in_rule__Declaration__Group_14__03486 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Declaration__Group_14__1_in_rule__Declaration__Group_14__03489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Declaration__Group_14__0__Impl3517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_14__1__Impl_in_rule__Declaration__Group_14__13548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__LocationAssignment_14_1_in_rule__Declaration__Group_14__1__Impl3575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_17__0__Impl_in_rule__Declaration__Group_17__03609 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Declaration__Group_17__1_in_rule__Declaration__Group_17__03612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Declaration__Group_17__0__Impl3640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_17__1__Impl_in_rule__Declaration__Group_17__13671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__VolumeAssignment_17_1_in_rule__Declaration__Group_17__1__Impl3698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_28__0__Impl_in_rule__Declaration__Group_28__03732 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Declaration__Group_28__1_in_rule__Declaration__Group_28__03735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Declaration__Group_28__0__Impl3763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_28__1__Impl_in_rule__Declaration__Group_28__13794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__ImagesCntAssignment_28_1_in_rule__Declaration__Group_28__1__Impl3821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FontSize__Group_0__0__Impl_in_rule__FontSize__Group_0__03855 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__FontSize__Group_0__1_in_rule__FontSize__Group_0__03858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FontSize__Group_0__1__Impl_in_rule__FontSize__Group_0__13916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__FontSize__Group_0__1__Impl3944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FontSize__Group_1__0__Impl_in_rule__FontSize__Group_1__03979 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__FontSize__Group_1__1_in_rule__FontSize__Group_1__03982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FontSize__Group_1__1__Impl_in_rule__FontSize__Group_1__14040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__FontSize__Group_1__1__Impl4068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FontSize__Group_2__0__Impl_in_rule__FontSize__Group_2__04103 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_rule__FontSize__Group_2__1_in_rule__FontSize__Group_2__04106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FontSize__Group_2__1__Impl_in_rule__FontSize__Group_2__14164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__FontSize__Group_2__1__Impl4192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_0__0__Impl_in_rule__Format__Group_0__04227 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Format__Group_0__1_in_rule__Format__Group_0__04230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_0__1__Impl_in_rule__Format__Group_0__14288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Format__Group_0__1__Impl4316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_1__0__Impl_in_rule__Format__Group_1__04351 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Format__Group_1__1_in_rule__Format__Group_1__04354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_1__1__Impl_in_rule__Format__Group_1__14412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Format__Group_1__1__Impl4440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_2__0__Impl_in_rule__Format__Group_2__04475 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Format__Group_2__1_in_rule__Format__Group_2__04478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_2__1__Impl_in_rule__Format__Group_2__14536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Format__Group_2__1__Impl4564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_3__0__Impl_in_rule__Format__Group_3__04599 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Format__Group_3__1_in_rule__Format__Group_3__04602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_3__1__Impl_in_rule__Format__Group_3__14660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Format__Group_3__1__Impl4688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_4__0__Impl_in_rule__Format__Group_4__04723 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Format__Group_4__1_in_rule__Format__Group_4__04726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_4__1__Impl_in_rule__Format__Group_4__14784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Format__Group_4__1__Impl4812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_5__0__Impl_in_rule__Format__Group_5__04847 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Format__Group_5__1_in_rule__Format__Group_5__04850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_5__1__Impl_in_rule__Format__Group_5__14908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Format__Group_5__1__Impl4936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_6__0__Impl_in_rule__Format__Group_6__04971 = new BitSet(new long[]{0x000001FC00000000L});
    public static final BitSet FOLLOW_rule__Format__Group_6__1_in_rule__Format__Group_6__04974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_6__1__Impl_in_rule__Format__Group_6__15032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Format__Group_6__1__Impl5060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__Group__0__Impl_in_rule__Date__Group__05095 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Date__Group__1_in_rule__Date__Group__05098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Date__Group__0__Impl5126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__Group__1__Impl_in_rule__Date__Group__15157 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Date__Group__2_in_rule__Date__Group__15160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__DayAssignment_1_in_rule__Date__Group__1__Impl5187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__Group__2__Impl_in_rule__Date__Group__25217 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Date__Group__3_in_rule__Date__Group__25220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Date__Group__2__Impl5248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__Group__3__Impl_in_rule__Date__Group__35279 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Date__Group__4_in_rule__Date__Group__35282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__MonthAssignment_3_in_rule__Date__Group__3__Impl5309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__Group__4__Impl_in_rule__Date__Group__45339 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Date__Group__5_in_rule__Date__Group__45342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Date__Group__4__Impl5370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__Group__5__Impl_in_rule__Date__Group__55401 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Date__Group__6_in_rule__Date__Group__55404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__YearAssignment_5_in_rule__Date__Group__5__Impl5431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__Group__6__Impl_in_rule__Date__Group__65461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Date__Group__6__Impl5489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group_0__0__Impl_in_rule__Language__Group_0__05534 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Language__Group_0__1_in_rule__Language__Group_0__05537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group_0__1__Impl_in_rule__Language__Group_0__15595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Language__Group_0__1__Impl5623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group_1__0__Impl_in_rule__Language__Group_1__05658 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_rule__Language__Group_1__1_in_rule__Language__Group_1__05661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group_1__1__Impl_in_rule__Language__Group_1__15719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Language__Group_1__1__Impl5747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Price__Group__0__Impl_in_rule__Price__Group__05782 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Price__Group__1_in_rule__Price__Group__05785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Price__Group__0__Impl5813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Price__Group__1__Impl_in_rule__Price__Group__15844 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_rule__Price__Group__2_in_rule__Price__Group__15847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Price__ValueAssignment_1_in_rule__Price__Group__1__Impl5874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Price__Group__2__Impl_in_rule__Price__Group__25904 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Price__Group__3_in_rule__Price__Group__25907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Price__CurrencyAssignment_2_in_rule__Price__Group__2__Impl5934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Price__Group__3__Impl_in_rule__Price__Group__35964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Price__Group__3__Impl5992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group__0__Impl_in_rule__Value__Group__06031 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Value__Group__1_in_rule__Value__Group__06034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Value__Group__0__Impl6061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group__1__Impl_in_rule__Value__Group__16090 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Value__Group__2_in_rule__Value__Group__16093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_1_in_rule__Value__Group__1__Impl6120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group__2__Impl_in_rule__Value__Group__26150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Value__Group__2__Impl6177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Currency__Group_0__0__Impl_in_rule__Currency__Group_0__06212 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Currency__Group_0__1_in_rule__Currency__Group_0__06215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Currency__Group_0__1__Impl_in_rule__Currency__Group_0__16273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Currency__Group_0__1__Impl6301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Currency__Group_1__0__Impl_in_rule__Currency__Group_1__06336 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_rule__Currency__Group_1__1_in_rule__Currency__Group_1__06339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Currency__Group_1__1__Impl_in_rule__Currency__Group_1__16397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Currency__Group_1__1__Impl6425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Topic__Group__0__Impl_in_rule__Topic__Group__06460 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Topic__Group__1_in_rule__Topic__Group__06463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Topic__Group__0__Impl6491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Topic__Group__1__Impl_in_rule__Topic__Group__16522 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Topic__Group__2_in_rule__Topic__Group__16525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Topic__NameAssignment_1_in_rule__Topic__Group__1__Impl6552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Topic__Group__2__Impl_in_rule__Topic__Group__26582 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Topic__Group__3_in_rule__Topic__Group__26585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Topic__Group__2__Impl6613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Topic__Group__3__Impl_in_rule__Topic__Group__36644 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_rule__Topic__Group__4_in_rule__Topic__Group__36647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Topic__TagsAssignment_3_in_rule__Topic__Group__3__Impl6674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Topic__Group__4__Impl_in_rule__Topic__Group__46704 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_rule__Topic__Group__5_in_rule__Topic__Group__46707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Topic__Group_4__0_in_rule__Topic__Group__4__Impl6734 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Topic__Group__5__Impl_in_rule__Topic__Group__56765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Topic__Group__5__Impl6793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Topic__Group_4__0__Impl_in_rule__Topic__Group_4__06836 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Topic__Group_4__1_in_rule__Topic__Group_4__06839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Topic__Group_4__0__Impl6867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Topic__Group_4__1__Impl_in_rule__Topic__Group_4__16898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Topic__TagsAssignment_4_1_in_rule__Topic__Group_4__1__Impl6925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pair__Group__0__Impl_in_rule__Pair__Group__06959 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Pair__Group__1_in_rule__Pair__Group__06962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pair__KeyAssignment_0_in_rule__Pair__Group__0__Impl6989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pair__Group__1__Impl_in_rule__Pair__Group__17019 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Pair__Group__2_in_rule__Pair__Group__17022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Pair__Group__1__Impl7050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pair__Group__2__Impl_in_rule__Pair__Group__27081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pair__ValueAssignment_2_in_rule__Pair__Group__2__Impl7108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Declaration__NameAssignment_17149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePair_in_rule__Declaration__FeedlinksAssignment_57180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePair_in_rule__Declaration__PairsAssignment_6_17211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopic_in_rule__Declaration__TopicsAssignment_107242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopic_in_rule__Declaration__TopicsAssignment_117273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_in_rule__Declaration__DateAssignment_13_17304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Declaration__LocationAssignment_14_17335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrice_in_rule__Declaration__PriceAssignment_167366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Declaration__VolumeAssignment_17_17397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLanguage_in_rule__Declaration__LanguageAssignment_197428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormat_in_rule__Declaration__FormatAssignment_217459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Declaration__ArticleCntAssignment_237490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Declaration__ArticleCharMinAssignment_257521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Declaration__ArticleCharMaxAssignment_277552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Declaration__ImagesCntAssignment_28_17583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Declaration__ColumnsCntAssignment_307614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFontSize_in_rule__Declaration__FontSizeAssignment_327645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Date__DayAssignment_17676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Date__MonthAssignment_37707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Date__YearAssignment_57738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Price__ValueAssignment_17769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCurrency_in_rule__Price__CurrencyAssignment_27800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Topic__NameAssignment_17831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopicTag_in_rule__Topic__TagsAssignment_37862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopicTag_in_rule__Topic__TagsAssignment_4_17893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TopicTag__ValueAssignment7924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Pair__KeyAssignment_07955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Pair__ValueAssignment_27986 = new BitSet(new long[]{0x0000000000000002L});

}