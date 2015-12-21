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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DIN A5'", "'DIN A4'", "'DIN A3'", "'DIN A2'", "'DIN A1'", "'newspaper'", "'feed link'", "'topics'", "'date'", "'location'", "'price'", "'volume'", "'language'", "'format'", "'number of articles'", "'number of characters per article'", "'-'", "'number of images per article'", "'number of columns'", "'font size'", "'{'", "'DIN A6'", "'DIN A0'", "'}'", "'English'", "'German'", "'Euro'", "'Dollar'", "', '"
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


    // $ANTLR start "entryRuleFormat"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:88:1: entryRuleFormat : ruleFormat EOF ;
    public final void entryRuleFormat() throws RecognitionException {
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:89:1: ( ruleFormat EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:90:1: ruleFormat EOF
            {
             before(grammarAccess.getFormatRule()); 
            pushFollow(FOLLOW_ruleFormat_in_entryRuleFormat121);
            ruleFormat();

            state._fsp--;

             after(grammarAccess.getFormatRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormat128); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:97:1: ruleFormat : ( ( rule__Format__Alternatives ) ) ;
    public final void ruleFormat() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:101:2: ( ( ( rule__Format__Alternatives ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:102:1: ( ( rule__Format__Alternatives ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:102:1: ( ( rule__Format__Alternatives ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:103:1: ( rule__Format__Alternatives )
            {
             before(grammarAccess.getFormatAccess().getAlternatives()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:104:1: ( rule__Format__Alternatives )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:104:2: rule__Format__Alternatives
            {
            pushFollow(FOLLOW_rule__Format__Alternatives_in_ruleFormat154);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:116:1: entryRuleDate : ruleDate EOF ;
    public final void entryRuleDate() throws RecognitionException {
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:117:1: ( ruleDate EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:118:1: ruleDate EOF
            {
             before(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_ruleDate_in_entryRuleDate181);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getDateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDate188); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:125:1: ruleDate : ( ( rule__Date__Group__0 ) ) ;
    public final void ruleDate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:129:2: ( ( ( rule__Date__Group__0 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:130:1: ( ( rule__Date__Group__0 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:130:1: ( ( rule__Date__Group__0 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:131:1: ( rule__Date__Group__0 )
            {
             before(grammarAccess.getDateAccess().getGroup()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:132:1: ( rule__Date__Group__0 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:132:2: rule__Date__Group__0
            {
            pushFollow(FOLLOW_rule__Date__Group__0_in_ruleDate214);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:144:1: entryRuleLanguage : ruleLanguage EOF ;
    public final void entryRuleLanguage() throws RecognitionException {
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:145:1: ( ruleLanguage EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:146:1: ruleLanguage EOF
            {
             before(grammarAccess.getLanguageRule()); 
            pushFollow(FOLLOW_ruleLanguage_in_entryRuleLanguage241);
            ruleLanguage();

            state._fsp--;

             after(grammarAccess.getLanguageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLanguage248); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:153:1: ruleLanguage : ( ( rule__Language__Alternatives ) ) ;
    public final void ruleLanguage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:157:2: ( ( ( rule__Language__Alternatives ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:158:1: ( ( rule__Language__Alternatives ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:158:1: ( ( rule__Language__Alternatives ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:159:1: ( rule__Language__Alternatives )
            {
             before(grammarAccess.getLanguageAccess().getAlternatives()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:160:1: ( rule__Language__Alternatives )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:160:2: rule__Language__Alternatives
            {
            pushFollow(FOLLOW_rule__Language__Alternatives_in_ruleLanguage274);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:172:1: entryRulePrice : rulePrice EOF ;
    public final void entryRulePrice() throws RecognitionException {
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:173:1: ( rulePrice EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:174:1: rulePrice EOF
            {
             before(grammarAccess.getPriceRule()); 
            pushFollow(FOLLOW_rulePrice_in_entryRulePrice301);
            rulePrice();

            state._fsp--;

             after(grammarAccess.getPriceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrice308); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:181:1: rulePrice : ( ( rule__Price__Group__0 ) ) ;
    public final void rulePrice() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:185:2: ( ( ( rule__Price__Group__0 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:186:1: ( ( rule__Price__Group__0 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:186:1: ( ( rule__Price__Group__0 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:187:1: ( rule__Price__Group__0 )
            {
             before(grammarAccess.getPriceAccess().getGroup()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:188:1: ( rule__Price__Group__0 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:188:2: rule__Price__Group__0
            {
            pushFollow(FOLLOW_rule__Price__Group__0_in_rulePrice334);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:200:1: entryRuleCurrency : ruleCurrency EOF ;
    public final void entryRuleCurrency() throws RecognitionException {
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:201:1: ( ruleCurrency EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:202:1: ruleCurrency EOF
            {
             before(grammarAccess.getCurrencyRule()); 
            pushFollow(FOLLOW_ruleCurrency_in_entryRuleCurrency361);
            ruleCurrency();

            state._fsp--;

             after(grammarAccess.getCurrencyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCurrency368); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:209:1: ruleCurrency : ( ( rule__Currency__Alternatives ) ) ;
    public final void ruleCurrency() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:213:2: ( ( ( rule__Currency__Alternatives ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:214:1: ( ( rule__Currency__Alternatives ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:214:1: ( ( rule__Currency__Alternatives ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:215:1: ( rule__Currency__Alternatives )
            {
             before(grammarAccess.getCurrencyAccess().getAlternatives()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:216:1: ( rule__Currency__Alternatives )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:216:2: rule__Currency__Alternatives
            {
            pushFollow(FOLLOW_rule__Currency__Alternatives_in_ruleCurrency394);
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


    // $ANTLR start "entryRuleTopics"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:228:1: entryRuleTopics : ruleTopics EOF ;
    public final void entryRuleTopics() throws RecognitionException {
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:229:1: ( ruleTopics EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:230:1: ruleTopics EOF
            {
             before(grammarAccess.getTopicsRule()); 
            pushFollow(FOLLOW_ruleTopics_in_entryRuleTopics421);
            ruleTopics();

            state._fsp--;

             after(grammarAccess.getTopicsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTopics428); 

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
    // $ANTLR end "entryRuleTopics"


    // $ANTLR start "ruleTopics"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:237:1: ruleTopics : ( ( rule__Topics__Group__0 ) ) ;
    public final void ruleTopics() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:241:2: ( ( ( rule__Topics__Group__0 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:242:1: ( ( rule__Topics__Group__0 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:242:1: ( ( rule__Topics__Group__0 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:243:1: ( rule__Topics__Group__0 )
            {
             before(grammarAccess.getTopicsAccess().getGroup()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:244:1: ( rule__Topics__Group__0 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:244:2: rule__Topics__Group__0
            {
            pushFollow(FOLLOW_rule__Topics__Group__0_in_ruleTopics454);
            rule__Topics__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTopicsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTopics"


    // $ANTLR start "entryRuleFeedlinks"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:256:1: entryRuleFeedlinks : ruleFeedlinks EOF ;
    public final void entryRuleFeedlinks() throws RecognitionException {
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:257:1: ( ruleFeedlinks EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:258:1: ruleFeedlinks EOF
            {
             before(grammarAccess.getFeedlinksRule()); 
            pushFollow(FOLLOW_ruleFeedlinks_in_entryRuleFeedlinks481);
            ruleFeedlinks();

            state._fsp--;

             after(grammarAccess.getFeedlinksRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeedlinks488); 

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
    // $ANTLR end "entryRuleFeedlinks"


    // $ANTLR start "ruleFeedlinks"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:265:1: ruleFeedlinks : ( ( rule__Feedlinks__Group__0 ) ) ;
    public final void ruleFeedlinks() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:269:2: ( ( ( rule__Feedlinks__Group__0 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:270:1: ( ( rule__Feedlinks__Group__0 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:270:1: ( ( rule__Feedlinks__Group__0 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:271:1: ( rule__Feedlinks__Group__0 )
            {
             before(grammarAccess.getFeedlinksAccess().getGroup()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:272:1: ( rule__Feedlinks__Group__0 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:272:2: rule__Feedlinks__Group__0
            {
            pushFollow(FOLLOW_rule__Feedlinks__Group__0_in_ruleFeedlinks514);
            rule__Feedlinks__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeedlinksAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeedlinks"


    // $ANTLR start "entryRulePair"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:284:1: entryRulePair : rulePair EOF ;
    public final void entryRulePair() throws RecognitionException {
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:285:1: ( rulePair EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:286:1: rulePair EOF
            {
             before(grammarAccess.getPairRule()); 
            pushFollow(FOLLOW_rulePair_in_entryRulePair541);
            rulePair();

            state._fsp--;

             after(grammarAccess.getPairRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePair548); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:293:1: rulePair : ( ( rule__Pair__Group__0 ) ) ;
    public final void rulePair() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:297:2: ( ( ( rule__Pair__Group__0 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:298:1: ( ( rule__Pair__Group__0 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:298:1: ( ( rule__Pair__Group__0 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:299:1: ( rule__Pair__Group__0 )
            {
             before(grammarAccess.getPairAccess().getGroup()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:300:1: ( rule__Pair__Group__0 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:300:2: rule__Pair__Group__0
            {
            pushFollow(FOLLOW_rule__Pair__Group__0_in_rulePair574);
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


    // $ANTLR start "rule__Format__Alternatives"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:312:1: rule__Format__Alternatives : ( ( ( rule__Format__Group_0__0 ) ) | ( 'DIN A5' ) | ( 'DIN A4' ) | ( 'DIN A3' ) | ( 'DIN A2' ) | ( 'DIN A1' ) | ( ( rule__Format__Group_6__0 ) ) );
    public final void rule__Format__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:316:1: ( ( ( rule__Format__Group_0__0 ) ) | ( 'DIN A5' ) | ( 'DIN A4' ) | ( 'DIN A3' ) | ( 'DIN A2' ) | ( 'DIN A1' ) | ( ( rule__Format__Group_6__0 ) ) )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt1=1;
                }
                break;
            case 11:
                {
                alt1=2;
                }
                break;
            case 12:
                {
                alt1=3;
                }
                break;
            case 13:
                {
                alt1=4;
                }
                break;
            case 14:
                {
                alt1=5;
                }
                break;
            case 15:
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
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:317:1: ( ( rule__Format__Group_0__0 ) )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:317:1: ( ( rule__Format__Group_0__0 ) )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:318:1: ( rule__Format__Group_0__0 )
                    {
                     before(grammarAccess.getFormatAccess().getGroup_0()); 
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:319:1: ( rule__Format__Group_0__0 )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:319:2: rule__Format__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Format__Group_0__0_in_rule__Format__Alternatives610);
                    rule__Format__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormatAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:323:6: ( 'DIN A5' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:323:6: ( 'DIN A5' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:324:1: 'DIN A5'
                    {
                     before(grammarAccess.getFormatAccess().getDINA5Keyword_1()); 
                    match(input,11,FOLLOW_11_in_rule__Format__Alternatives629); 
                     after(grammarAccess.getFormatAccess().getDINA5Keyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:331:6: ( 'DIN A4' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:331:6: ( 'DIN A4' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:332:1: 'DIN A4'
                    {
                     before(grammarAccess.getFormatAccess().getDINA4Keyword_2()); 
                    match(input,12,FOLLOW_12_in_rule__Format__Alternatives649); 
                     after(grammarAccess.getFormatAccess().getDINA4Keyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:339:6: ( 'DIN A3' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:339:6: ( 'DIN A3' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:340:1: 'DIN A3'
                    {
                     before(grammarAccess.getFormatAccess().getDINA3Keyword_3()); 
                    match(input,13,FOLLOW_13_in_rule__Format__Alternatives669); 
                     after(grammarAccess.getFormatAccess().getDINA3Keyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:347:6: ( 'DIN A2' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:347:6: ( 'DIN A2' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:348:1: 'DIN A2'
                    {
                     before(grammarAccess.getFormatAccess().getDINA2Keyword_4()); 
                    match(input,14,FOLLOW_14_in_rule__Format__Alternatives689); 
                     after(grammarAccess.getFormatAccess().getDINA2Keyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:355:6: ( 'DIN A1' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:355:6: ( 'DIN A1' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:356:1: 'DIN A1'
                    {
                     before(grammarAccess.getFormatAccess().getDINA1Keyword_5()); 
                    match(input,15,FOLLOW_15_in_rule__Format__Alternatives709); 
                     after(grammarAccess.getFormatAccess().getDINA1Keyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:363:6: ( ( rule__Format__Group_6__0 ) )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:363:6: ( ( rule__Format__Group_6__0 ) )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:364:1: ( rule__Format__Group_6__0 )
                    {
                     before(grammarAccess.getFormatAccess().getGroup_6()); 
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:365:1: ( rule__Format__Group_6__0 )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:365:2: rule__Format__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Format__Group_6__0_in_rule__Format__Alternatives728);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:374:1: rule__Language__Alternatives : ( ( ( rule__Language__Group_0__0 ) ) | ( ( rule__Language__Group_1__0 ) ) );
    public final void rule__Language__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:378:1: ( ( ( rule__Language__Group_0__0 ) ) | ( ( rule__Language__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==31) ) {
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
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:379:1: ( ( rule__Language__Group_0__0 ) )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:379:1: ( ( rule__Language__Group_0__0 ) )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:380:1: ( rule__Language__Group_0__0 )
                    {
                     before(grammarAccess.getLanguageAccess().getGroup_0()); 
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:381:1: ( rule__Language__Group_0__0 )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:381:2: rule__Language__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Language__Group_0__0_in_rule__Language__Alternatives761);
                    rule__Language__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLanguageAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:385:6: ( ( rule__Language__Group_1__0 ) )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:385:6: ( ( rule__Language__Group_1__0 ) )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:386:1: ( rule__Language__Group_1__0 )
                    {
                     before(grammarAccess.getLanguageAccess().getGroup_1()); 
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:387:1: ( rule__Language__Group_1__0 )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:387:2: rule__Language__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Language__Group_1__0_in_rule__Language__Alternatives779);
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


    // $ANTLR start "rule__Currency__Alternatives"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:396:1: rule__Currency__Alternatives : ( ( ( rule__Currency__Group_0__0 ) ) | ( ( rule__Currency__Group_1__0 ) ) );
    public final void rule__Currency__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:400:1: ( ( ( rule__Currency__Group_0__0 ) ) | ( ( rule__Currency__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==31) ) {
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
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:401:1: ( ( rule__Currency__Group_0__0 ) )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:401:1: ( ( rule__Currency__Group_0__0 ) )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:402:1: ( rule__Currency__Group_0__0 )
                    {
                     before(grammarAccess.getCurrencyAccess().getGroup_0()); 
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:403:1: ( rule__Currency__Group_0__0 )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:403:2: rule__Currency__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Currency__Group_0__0_in_rule__Currency__Alternatives812);
                    rule__Currency__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCurrencyAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:407:6: ( ( rule__Currency__Group_1__0 ) )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:407:6: ( ( rule__Currency__Group_1__0 ) )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:408:1: ( rule__Currency__Group_1__0 )
                    {
                     before(grammarAccess.getCurrencyAccess().getGroup_1()); 
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:409:1: ( rule__Currency__Group_1__0 )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:409:2: rule__Currency__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Currency__Group_1__0_in_rule__Currency__Alternatives830);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:420:1: rule__Declaration__Group__0 : rule__Declaration__Group__0__Impl rule__Declaration__Group__1 ;
    public final void rule__Declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:424:1: ( rule__Declaration__Group__0__Impl rule__Declaration__Group__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:425:2: rule__Declaration__Group__0__Impl rule__Declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group__0__Impl_in_rule__Declaration__Group__0861);
            rule__Declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__1_in_rule__Declaration__Group__0864);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:432:1: rule__Declaration__Group__0__Impl : ( 'newspaper' ) ;
    public final void rule__Declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:436:1: ( ( 'newspaper' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:437:1: ( 'newspaper' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:437:1: ( 'newspaper' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:438:1: 'newspaper'
            {
             before(grammarAccess.getDeclarationAccess().getNewspaperKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Declaration__Group__0__Impl892); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:451:1: rule__Declaration__Group__1 : rule__Declaration__Group__1__Impl rule__Declaration__Group__2 ;
    public final void rule__Declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:455:1: ( rule__Declaration__Group__1__Impl rule__Declaration__Group__2 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:456:2: rule__Declaration__Group__1__Impl rule__Declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Declaration__Group__1__Impl_in_rule__Declaration__Group__1923);
            rule__Declaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__2_in_rule__Declaration__Group__1926);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:463:1: rule__Declaration__Group__1__Impl : ( ( rule__Declaration__NameAssignment_1 ) ) ;
    public final void rule__Declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:467:1: ( ( ( rule__Declaration__NameAssignment_1 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:468:1: ( ( rule__Declaration__NameAssignment_1 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:468:1: ( ( rule__Declaration__NameAssignment_1 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:469:1: ( rule__Declaration__NameAssignment_1 )
            {
             before(grammarAccess.getDeclarationAccess().getNameAssignment_1()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:470:1: ( rule__Declaration__NameAssignment_1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:470:2: rule__Declaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Declaration__NameAssignment_1_in_rule__Declaration__Group__1__Impl953);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:480:1: rule__Declaration__Group__2 : rule__Declaration__Group__2__Impl rule__Declaration__Group__3 ;
    public final void rule__Declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:484:1: ( rule__Declaration__Group__2__Impl rule__Declaration__Group__3 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:485:2: rule__Declaration__Group__2__Impl rule__Declaration__Group__3
            {
            pushFollow(FOLLOW_rule__Declaration__Group__2__Impl_in_rule__Declaration__Group__2983);
            rule__Declaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__3_in_rule__Declaration__Group__2986);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:492:1: rule__Declaration__Group__2__Impl : ( 'feed link' ) ;
    public final void rule__Declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:496:1: ( ( 'feed link' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:497:1: ( 'feed link' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:497:1: ( 'feed link' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:498:1: 'feed link'
            {
             before(grammarAccess.getDeclarationAccess().getFeedLinkKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__Declaration__Group__2__Impl1014); 
             after(grammarAccess.getDeclarationAccess().getFeedLinkKeyword_2()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:511:1: rule__Declaration__Group__3 : rule__Declaration__Group__3__Impl rule__Declaration__Group__4 ;
    public final void rule__Declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:515:1: ( rule__Declaration__Group__3__Impl rule__Declaration__Group__4 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:516:2: rule__Declaration__Group__3__Impl rule__Declaration__Group__4
            {
            pushFollow(FOLLOW_rule__Declaration__Group__3__Impl_in_rule__Declaration__Group__31045);
            rule__Declaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__4_in_rule__Declaration__Group__31048);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:523:1: rule__Declaration__Group__3__Impl : ( ( rule__Declaration__FeedlinksAssignment_3 ) ) ;
    public final void rule__Declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:527:1: ( ( ( rule__Declaration__FeedlinksAssignment_3 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:528:1: ( ( rule__Declaration__FeedlinksAssignment_3 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:528:1: ( ( rule__Declaration__FeedlinksAssignment_3 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:529:1: ( rule__Declaration__FeedlinksAssignment_3 )
            {
             before(grammarAccess.getDeclarationAccess().getFeedlinksAssignment_3()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:530:1: ( rule__Declaration__FeedlinksAssignment_3 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:530:2: rule__Declaration__FeedlinksAssignment_3
            {
            pushFollow(FOLLOW_rule__Declaration__FeedlinksAssignment_3_in_rule__Declaration__Group__3__Impl1075);
            rule__Declaration__FeedlinksAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getFeedlinksAssignment_3()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:540:1: rule__Declaration__Group__4 : rule__Declaration__Group__4__Impl rule__Declaration__Group__5 ;
    public final void rule__Declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:544:1: ( rule__Declaration__Group__4__Impl rule__Declaration__Group__5 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:545:2: rule__Declaration__Group__4__Impl rule__Declaration__Group__5
            {
            pushFollow(FOLLOW_rule__Declaration__Group__4__Impl_in_rule__Declaration__Group__41105);
            rule__Declaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__5_in_rule__Declaration__Group__41108);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:552:1: rule__Declaration__Group__4__Impl : ( 'topics' ) ;
    public final void rule__Declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:556:1: ( ( 'topics' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:557:1: ( 'topics' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:557:1: ( 'topics' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:558:1: 'topics'
            {
             before(grammarAccess.getDeclarationAccess().getTopicsKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__Declaration__Group__4__Impl1136); 
             after(grammarAccess.getDeclarationAccess().getTopicsKeyword_4()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:571:1: rule__Declaration__Group__5 : rule__Declaration__Group__5__Impl rule__Declaration__Group__6 ;
    public final void rule__Declaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:575:1: ( rule__Declaration__Group__5__Impl rule__Declaration__Group__6 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:576:2: rule__Declaration__Group__5__Impl rule__Declaration__Group__6
            {
            pushFollow(FOLLOW_rule__Declaration__Group__5__Impl_in_rule__Declaration__Group__51167);
            rule__Declaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__6_in_rule__Declaration__Group__51170);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:583:1: rule__Declaration__Group__5__Impl : ( ( rule__Declaration__TopicsAssignment_5 ) ) ;
    public final void rule__Declaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:587:1: ( ( ( rule__Declaration__TopicsAssignment_5 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:588:1: ( ( rule__Declaration__TopicsAssignment_5 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:588:1: ( ( rule__Declaration__TopicsAssignment_5 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:589:1: ( rule__Declaration__TopicsAssignment_5 )
            {
             before(grammarAccess.getDeclarationAccess().getTopicsAssignment_5()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:590:1: ( rule__Declaration__TopicsAssignment_5 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:590:2: rule__Declaration__TopicsAssignment_5
            {
            pushFollow(FOLLOW_rule__Declaration__TopicsAssignment_5_in_rule__Declaration__Group__5__Impl1197);
            rule__Declaration__TopicsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getTopicsAssignment_5()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:600:1: rule__Declaration__Group__6 : rule__Declaration__Group__6__Impl rule__Declaration__Group__7 ;
    public final void rule__Declaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:604:1: ( rule__Declaration__Group__6__Impl rule__Declaration__Group__7 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:605:2: rule__Declaration__Group__6__Impl rule__Declaration__Group__7
            {
            pushFollow(FOLLOW_rule__Declaration__Group__6__Impl_in_rule__Declaration__Group__61227);
            rule__Declaration__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__7_in_rule__Declaration__Group__61230);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:612:1: rule__Declaration__Group__6__Impl : ( 'date' ) ;
    public final void rule__Declaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:616:1: ( ( 'date' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:617:1: ( 'date' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:617:1: ( 'date' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:618:1: 'date'
            {
             before(grammarAccess.getDeclarationAccess().getDateKeyword_6()); 
            match(input,19,FOLLOW_19_in_rule__Declaration__Group__6__Impl1258); 
             after(grammarAccess.getDeclarationAccess().getDateKeyword_6()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:631:1: rule__Declaration__Group__7 : rule__Declaration__Group__7__Impl rule__Declaration__Group__8 ;
    public final void rule__Declaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:635:1: ( rule__Declaration__Group__7__Impl rule__Declaration__Group__8 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:636:2: rule__Declaration__Group__7__Impl rule__Declaration__Group__8
            {
            pushFollow(FOLLOW_rule__Declaration__Group__7__Impl_in_rule__Declaration__Group__71289);
            rule__Declaration__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__8_in_rule__Declaration__Group__71292);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:643:1: rule__Declaration__Group__7__Impl : ( ( rule__Declaration__DateAssignment_7 ) ) ;
    public final void rule__Declaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:647:1: ( ( ( rule__Declaration__DateAssignment_7 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:648:1: ( ( rule__Declaration__DateAssignment_7 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:648:1: ( ( rule__Declaration__DateAssignment_7 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:649:1: ( rule__Declaration__DateAssignment_7 )
            {
             before(grammarAccess.getDeclarationAccess().getDateAssignment_7()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:650:1: ( rule__Declaration__DateAssignment_7 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:650:2: rule__Declaration__DateAssignment_7
            {
            pushFollow(FOLLOW_rule__Declaration__DateAssignment_7_in_rule__Declaration__Group__7__Impl1319);
            rule__Declaration__DateAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getDateAssignment_7()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:660:1: rule__Declaration__Group__8 : rule__Declaration__Group__8__Impl rule__Declaration__Group__9 ;
    public final void rule__Declaration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:664:1: ( rule__Declaration__Group__8__Impl rule__Declaration__Group__9 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:665:2: rule__Declaration__Group__8__Impl rule__Declaration__Group__9
            {
            pushFollow(FOLLOW_rule__Declaration__Group__8__Impl_in_rule__Declaration__Group__81349);
            rule__Declaration__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__9_in_rule__Declaration__Group__81352);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:672:1: rule__Declaration__Group__8__Impl : ( 'location' ) ;
    public final void rule__Declaration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:676:1: ( ( 'location' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:677:1: ( 'location' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:677:1: ( 'location' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:678:1: 'location'
            {
             before(grammarAccess.getDeclarationAccess().getLocationKeyword_8()); 
            match(input,20,FOLLOW_20_in_rule__Declaration__Group__8__Impl1380); 
             after(grammarAccess.getDeclarationAccess().getLocationKeyword_8()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:691:1: rule__Declaration__Group__9 : rule__Declaration__Group__9__Impl rule__Declaration__Group__10 ;
    public final void rule__Declaration__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:695:1: ( rule__Declaration__Group__9__Impl rule__Declaration__Group__10 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:696:2: rule__Declaration__Group__9__Impl rule__Declaration__Group__10
            {
            pushFollow(FOLLOW_rule__Declaration__Group__9__Impl_in_rule__Declaration__Group__91411);
            rule__Declaration__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__10_in_rule__Declaration__Group__91414);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:703:1: rule__Declaration__Group__9__Impl : ( ( rule__Declaration__LocationAssignment_9 ) ) ;
    public final void rule__Declaration__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:707:1: ( ( ( rule__Declaration__LocationAssignment_9 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:708:1: ( ( rule__Declaration__LocationAssignment_9 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:708:1: ( ( rule__Declaration__LocationAssignment_9 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:709:1: ( rule__Declaration__LocationAssignment_9 )
            {
             before(grammarAccess.getDeclarationAccess().getLocationAssignment_9()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:710:1: ( rule__Declaration__LocationAssignment_9 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:710:2: rule__Declaration__LocationAssignment_9
            {
            pushFollow(FOLLOW_rule__Declaration__LocationAssignment_9_in_rule__Declaration__Group__9__Impl1441);
            rule__Declaration__LocationAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getLocationAssignment_9()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:720:1: rule__Declaration__Group__10 : rule__Declaration__Group__10__Impl rule__Declaration__Group__11 ;
    public final void rule__Declaration__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:724:1: ( rule__Declaration__Group__10__Impl rule__Declaration__Group__11 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:725:2: rule__Declaration__Group__10__Impl rule__Declaration__Group__11
            {
            pushFollow(FOLLOW_rule__Declaration__Group__10__Impl_in_rule__Declaration__Group__101471);
            rule__Declaration__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__11_in_rule__Declaration__Group__101474);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:732:1: rule__Declaration__Group__10__Impl : ( 'price' ) ;
    public final void rule__Declaration__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:736:1: ( ( 'price' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:737:1: ( 'price' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:737:1: ( 'price' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:738:1: 'price'
            {
             before(grammarAccess.getDeclarationAccess().getPriceKeyword_10()); 
            match(input,21,FOLLOW_21_in_rule__Declaration__Group__10__Impl1502); 
             after(grammarAccess.getDeclarationAccess().getPriceKeyword_10()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:751:1: rule__Declaration__Group__11 : rule__Declaration__Group__11__Impl rule__Declaration__Group__12 ;
    public final void rule__Declaration__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:755:1: ( rule__Declaration__Group__11__Impl rule__Declaration__Group__12 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:756:2: rule__Declaration__Group__11__Impl rule__Declaration__Group__12
            {
            pushFollow(FOLLOW_rule__Declaration__Group__11__Impl_in_rule__Declaration__Group__111533);
            rule__Declaration__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__12_in_rule__Declaration__Group__111536);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:763:1: rule__Declaration__Group__11__Impl : ( ( rule__Declaration__PriceAssignment_11 ) ) ;
    public final void rule__Declaration__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:767:1: ( ( ( rule__Declaration__PriceAssignment_11 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:768:1: ( ( rule__Declaration__PriceAssignment_11 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:768:1: ( ( rule__Declaration__PriceAssignment_11 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:769:1: ( rule__Declaration__PriceAssignment_11 )
            {
             before(grammarAccess.getDeclarationAccess().getPriceAssignment_11()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:770:1: ( rule__Declaration__PriceAssignment_11 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:770:2: rule__Declaration__PriceAssignment_11
            {
            pushFollow(FOLLOW_rule__Declaration__PriceAssignment_11_in_rule__Declaration__Group__11__Impl1563);
            rule__Declaration__PriceAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getPriceAssignment_11()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:780:1: rule__Declaration__Group__12 : rule__Declaration__Group__12__Impl rule__Declaration__Group__13 ;
    public final void rule__Declaration__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:784:1: ( rule__Declaration__Group__12__Impl rule__Declaration__Group__13 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:785:2: rule__Declaration__Group__12__Impl rule__Declaration__Group__13
            {
            pushFollow(FOLLOW_rule__Declaration__Group__12__Impl_in_rule__Declaration__Group__121593);
            rule__Declaration__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__13_in_rule__Declaration__Group__121596);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:792:1: rule__Declaration__Group__12__Impl : ( 'volume' ) ;
    public final void rule__Declaration__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:796:1: ( ( 'volume' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:797:1: ( 'volume' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:797:1: ( 'volume' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:798:1: 'volume'
            {
             before(grammarAccess.getDeclarationAccess().getVolumeKeyword_12()); 
            match(input,22,FOLLOW_22_in_rule__Declaration__Group__12__Impl1624); 
             after(grammarAccess.getDeclarationAccess().getVolumeKeyword_12()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:811:1: rule__Declaration__Group__13 : rule__Declaration__Group__13__Impl rule__Declaration__Group__14 ;
    public final void rule__Declaration__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:815:1: ( rule__Declaration__Group__13__Impl rule__Declaration__Group__14 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:816:2: rule__Declaration__Group__13__Impl rule__Declaration__Group__14
            {
            pushFollow(FOLLOW_rule__Declaration__Group__13__Impl_in_rule__Declaration__Group__131655);
            rule__Declaration__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__14_in_rule__Declaration__Group__131658);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:823:1: rule__Declaration__Group__13__Impl : ( ( rule__Declaration__VolumeAssignment_13 ) ) ;
    public final void rule__Declaration__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:827:1: ( ( ( rule__Declaration__VolumeAssignment_13 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:828:1: ( ( rule__Declaration__VolumeAssignment_13 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:828:1: ( ( rule__Declaration__VolumeAssignment_13 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:829:1: ( rule__Declaration__VolumeAssignment_13 )
            {
             before(grammarAccess.getDeclarationAccess().getVolumeAssignment_13()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:830:1: ( rule__Declaration__VolumeAssignment_13 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:830:2: rule__Declaration__VolumeAssignment_13
            {
            pushFollow(FOLLOW_rule__Declaration__VolumeAssignment_13_in_rule__Declaration__Group__13__Impl1685);
            rule__Declaration__VolumeAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getVolumeAssignment_13()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:840:1: rule__Declaration__Group__14 : rule__Declaration__Group__14__Impl rule__Declaration__Group__15 ;
    public final void rule__Declaration__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:844:1: ( rule__Declaration__Group__14__Impl rule__Declaration__Group__15 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:845:2: rule__Declaration__Group__14__Impl rule__Declaration__Group__15
            {
            pushFollow(FOLLOW_rule__Declaration__Group__14__Impl_in_rule__Declaration__Group__141715);
            rule__Declaration__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__15_in_rule__Declaration__Group__141718);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:852:1: rule__Declaration__Group__14__Impl : ( 'language' ) ;
    public final void rule__Declaration__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:856:1: ( ( 'language' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:857:1: ( 'language' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:857:1: ( 'language' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:858:1: 'language'
            {
             before(grammarAccess.getDeclarationAccess().getLanguageKeyword_14()); 
            match(input,23,FOLLOW_23_in_rule__Declaration__Group__14__Impl1746); 
             after(grammarAccess.getDeclarationAccess().getLanguageKeyword_14()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:871:1: rule__Declaration__Group__15 : rule__Declaration__Group__15__Impl rule__Declaration__Group__16 ;
    public final void rule__Declaration__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:875:1: ( rule__Declaration__Group__15__Impl rule__Declaration__Group__16 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:876:2: rule__Declaration__Group__15__Impl rule__Declaration__Group__16
            {
            pushFollow(FOLLOW_rule__Declaration__Group__15__Impl_in_rule__Declaration__Group__151777);
            rule__Declaration__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__16_in_rule__Declaration__Group__151780);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:883:1: rule__Declaration__Group__15__Impl : ( ( rule__Declaration__LanguageAssignment_15 ) ) ;
    public final void rule__Declaration__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:887:1: ( ( ( rule__Declaration__LanguageAssignment_15 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:888:1: ( ( rule__Declaration__LanguageAssignment_15 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:888:1: ( ( rule__Declaration__LanguageAssignment_15 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:889:1: ( rule__Declaration__LanguageAssignment_15 )
            {
             before(grammarAccess.getDeclarationAccess().getLanguageAssignment_15()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:890:1: ( rule__Declaration__LanguageAssignment_15 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:890:2: rule__Declaration__LanguageAssignment_15
            {
            pushFollow(FOLLOW_rule__Declaration__LanguageAssignment_15_in_rule__Declaration__Group__15__Impl1807);
            rule__Declaration__LanguageAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getLanguageAssignment_15()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:900:1: rule__Declaration__Group__16 : rule__Declaration__Group__16__Impl rule__Declaration__Group__17 ;
    public final void rule__Declaration__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:904:1: ( rule__Declaration__Group__16__Impl rule__Declaration__Group__17 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:905:2: rule__Declaration__Group__16__Impl rule__Declaration__Group__17
            {
            pushFollow(FOLLOW_rule__Declaration__Group__16__Impl_in_rule__Declaration__Group__161837);
            rule__Declaration__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__17_in_rule__Declaration__Group__161840);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:912:1: rule__Declaration__Group__16__Impl : ( 'format' ) ;
    public final void rule__Declaration__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:916:1: ( ( 'format' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:917:1: ( 'format' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:917:1: ( 'format' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:918:1: 'format'
            {
             before(grammarAccess.getDeclarationAccess().getFormatKeyword_16()); 
            match(input,24,FOLLOW_24_in_rule__Declaration__Group__16__Impl1868); 
             after(grammarAccess.getDeclarationAccess().getFormatKeyword_16()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:931:1: rule__Declaration__Group__17 : rule__Declaration__Group__17__Impl rule__Declaration__Group__18 ;
    public final void rule__Declaration__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:935:1: ( rule__Declaration__Group__17__Impl rule__Declaration__Group__18 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:936:2: rule__Declaration__Group__17__Impl rule__Declaration__Group__18
            {
            pushFollow(FOLLOW_rule__Declaration__Group__17__Impl_in_rule__Declaration__Group__171899);
            rule__Declaration__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__18_in_rule__Declaration__Group__171902);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:943:1: rule__Declaration__Group__17__Impl : ( ( rule__Declaration__FormatAssignment_17 ) ) ;
    public final void rule__Declaration__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:947:1: ( ( ( rule__Declaration__FormatAssignment_17 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:948:1: ( ( rule__Declaration__FormatAssignment_17 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:948:1: ( ( rule__Declaration__FormatAssignment_17 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:949:1: ( rule__Declaration__FormatAssignment_17 )
            {
             before(grammarAccess.getDeclarationAccess().getFormatAssignment_17()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:950:1: ( rule__Declaration__FormatAssignment_17 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:950:2: rule__Declaration__FormatAssignment_17
            {
            pushFollow(FOLLOW_rule__Declaration__FormatAssignment_17_in_rule__Declaration__Group__17__Impl1929);
            rule__Declaration__FormatAssignment_17();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getFormatAssignment_17()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:960:1: rule__Declaration__Group__18 : rule__Declaration__Group__18__Impl rule__Declaration__Group__19 ;
    public final void rule__Declaration__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:964:1: ( rule__Declaration__Group__18__Impl rule__Declaration__Group__19 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:965:2: rule__Declaration__Group__18__Impl rule__Declaration__Group__19
            {
            pushFollow(FOLLOW_rule__Declaration__Group__18__Impl_in_rule__Declaration__Group__181959);
            rule__Declaration__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__19_in_rule__Declaration__Group__181962);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:972:1: rule__Declaration__Group__18__Impl : ( 'number of articles' ) ;
    public final void rule__Declaration__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:976:1: ( ( 'number of articles' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:977:1: ( 'number of articles' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:977:1: ( 'number of articles' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:978:1: 'number of articles'
            {
             before(grammarAccess.getDeclarationAccess().getNumberOfArticlesKeyword_18()); 
            match(input,25,FOLLOW_25_in_rule__Declaration__Group__18__Impl1990); 
             after(grammarAccess.getDeclarationAccess().getNumberOfArticlesKeyword_18()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:991:1: rule__Declaration__Group__19 : rule__Declaration__Group__19__Impl rule__Declaration__Group__20 ;
    public final void rule__Declaration__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:995:1: ( rule__Declaration__Group__19__Impl rule__Declaration__Group__20 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:996:2: rule__Declaration__Group__19__Impl rule__Declaration__Group__20
            {
            pushFollow(FOLLOW_rule__Declaration__Group__19__Impl_in_rule__Declaration__Group__192021);
            rule__Declaration__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__20_in_rule__Declaration__Group__192024);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1003:1: rule__Declaration__Group__19__Impl : ( ( rule__Declaration__Article_cntAssignment_19 ) ) ;
    public final void rule__Declaration__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1007:1: ( ( ( rule__Declaration__Article_cntAssignment_19 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1008:1: ( ( rule__Declaration__Article_cntAssignment_19 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1008:1: ( ( rule__Declaration__Article_cntAssignment_19 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1009:1: ( rule__Declaration__Article_cntAssignment_19 )
            {
             before(grammarAccess.getDeclarationAccess().getArticle_cntAssignment_19()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1010:1: ( rule__Declaration__Article_cntAssignment_19 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1010:2: rule__Declaration__Article_cntAssignment_19
            {
            pushFollow(FOLLOW_rule__Declaration__Article_cntAssignment_19_in_rule__Declaration__Group__19__Impl2051);
            rule__Declaration__Article_cntAssignment_19();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getArticle_cntAssignment_19()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1020:1: rule__Declaration__Group__20 : rule__Declaration__Group__20__Impl rule__Declaration__Group__21 ;
    public final void rule__Declaration__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1024:1: ( rule__Declaration__Group__20__Impl rule__Declaration__Group__21 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1025:2: rule__Declaration__Group__20__Impl rule__Declaration__Group__21
            {
            pushFollow(FOLLOW_rule__Declaration__Group__20__Impl_in_rule__Declaration__Group__202081);
            rule__Declaration__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__21_in_rule__Declaration__Group__202084);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1032:1: rule__Declaration__Group__20__Impl : ( 'number of characters per article' ) ;
    public final void rule__Declaration__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1036:1: ( ( 'number of characters per article' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1037:1: ( 'number of characters per article' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1037:1: ( 'number of characters per article' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1038:1: 'number of characters per article'
            {
             before(grammarAccess.getDeclarationAccess().getNumberOfCharactersPerArticleKeyword_20()); 
            match(input,26,FOLLOW_26_in_rule__Declaration__Group__20__Impl2112); 
             after(grammarAccess.getDeclarationAccess().getNumberOfCharactersPerArticleKeyword_20()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1051:1: rule__Declaration__Group__21 : rule__Declaration__Group__21__Impl rule__Declaration__Group__22 ;
    public final void rule__Declaration__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1055:1: ( rule__Declaration__Group__21__Impl rule__Declaration__Group__22 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1056:2: rule__Declaration__Group__21__Impl rule__Declaration__Group__22
            {
            pushFollow(FOLLOW_rule__Declaration__Group__21__Impl_in_rule__Declaration__Group__212143);
            rule__Declaration__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__22_in_rule__Declaration__Group__212146);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1063:1: rule__Declaration__Group__21__Impl : ( ( rule__Declaration__Article_char_minAssignment_21 ) ) ;
    public final void rule__Declaration__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1067:1: ( ( ( rule__Declaration__Article_char_minAssignment_21 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1068:1: ( ( rule__Declaration__Article_char_minAssignment_21 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1068:1: ( ( rule__Declaration__Article_char_minAssignment_21 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1069:1: ( rule__Declaration__Article_char_minAssignment_21 )
            {
             before(grammarAccess.getDeclarationAccess().getArticle_char_minAssignment_21()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1070:1: ( rule__Declaration__Article_char_minAssignment_21 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1070:2: rule__Declaration__Article_char_minAssignment_21
            {
            pushFollow(FOLLOW_rule__Declaration__Article_char_minAssignment_21_in_rule__Declaration__Group__21__Impl2173);
            rule__Declaration__Article_char_minAssignment_21();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getArticle_char_minAssignment_21()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1080:1: rule__Declaration__Group__22 : rule__Declaration__Group__22__Impl rule__Declaration__Group__23 ;
    public final void rule__Declaration__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1084:1: ( rule__Declaration__Group__22__Impl rule__Declaration__Group__23 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1085:2: rule__Declaration__Group__22__Impl rule__Declaration__Group__23
            {
            pushFollow(FOLLOW_rule__Declaration__Group__22__Impl_in_rule__Declaration__Group__222203);
            rule__Declaration__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__23_in_rule__Declaration__Group__222206);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1092:1: rule__Declaration__Group__22__Impl : ( '-' ) ;
    public final void rule__Declaration__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1096:1: ( ( '-' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1097:1: ( '-' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1097:1: ( '-' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1098:1: '-'
            {
             before(grammarAccess.getDeclarationAccess().getHyphenMinusKeyword_22()); 
            match(input,27,FOLLOW_27_in_rule__Declaration__Group__22__Impl2234); 
             after(grammarAccess.getDeclarationAccess().getHyphenMinusKeyword_22()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1111:1: rule__Declaration__Group__23 : rule__Declaration__Group__23__Impl rule__Declaration__Group__24 ;
    public final void rule__Declaration__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1115:1: ( rule__Declaration__Group__23__Impl rule__Declaration__Group__24 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1116:2: rule__Declaration__Group__23__Impl rule__Declaration__Group__24
            {
            pushFollow(FOLLOW_rule__Declaration__Group__23__Impl_in_rule__Declaration__Group__232265);
            rule__Declaration__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__24_in_rule__Declaration__Group__232268);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1123:1: rule__Declaration__Group__23__Impl : ( ( rule__Declaration__Article_char_maxAssignment_23 ) ) ;
    public final void rule__Declaration__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1127:1: ( ( ( rule__Declaration__Article_char_maxAssignment_23 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1128:1: ( ( rule__Declaration__Article_char_maxAssignment_23 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1128:1: ( ( rule__Declaration__Article_char_maxAssignment_23 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1129:1: ( rule__Declaration__Article_char_maxAssignment_23 )
            {
             before(grammarAccess.getDeclarationAccess().getArticle_char_maxAssignment_23()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1130:1: ( rule__Declaration__Article_char_maxAssignment_23 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1130:2: rule__Declaration__Article_char_maxAssignment_23
            {
            pushFollow(FOLLOW_rule__Declaration__Article_char_maxAssignment_23_in_rule__Declaration__Group__23__Impl2295);
            rule__Declaration__Article_char_maxAssignment_23();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getArticle_char_maxAssignment_23()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1140:1: rule__Declaration__Group__24 : rule__Declaration__Group__24__Impl rule__Declaration__Group__25 ;
    public final void rule__Declaration__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1144:1: ( rule__Declaration__Group__24__Impl rule__Declaration__Group__25 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1145:2: rule__Declaration__Group__24__Impl rule__Declaration__Group__25
            {
            pushFollow(FOLLOW_rule__Declaration__Group__24__Impl_in_rule__Declaration__Group__242325);
            rule__Declaration__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__25_in_rule__Declaration__Group__242328);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1152:1: rule__Declaration__Group__24__Impl : ( 'number of images per article' ) ;
    public final void rule__Declaration__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1156:1: ( ( 'number of images per article' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1157:1: ( 'number of images per article' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1157:1: ( 'number of images per article' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1158:1: 'number of images per article'
            {
             before(grammarAccess.getDeclarationAccess().getNumberOfImagesPerArticleKeyword_24()); 
            match(input,28,FOLLOW_28_in_rule__Declaration__Group__24__Impl2356); 
             after(grammarAccess.getDeclarationAccess().getNumberOfImagesPerArticleKeyword_24()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1171:1: rule__Declaration__Group__25 : rule__Declaration__Group__25__Impl rule__Declaration__Group__26 ;
    public final void rule__Declaration__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1175:1: ( rule__Declaration__Group__25__Impl rule__Declaration__Group__26 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1176:2: rule__Declaration__Group__25__Impl rule__Declaration__Group__26
            {
            pushFollow(FOLLOW_rule__Declaration__Group__25__Impl_in_rule__Declaration__Group__252387);
            rule__Declaration__Group__25__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__26_in_rule__Declaration__Group__252390);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1183:1: rule__Declaration__Group__25__Impl : ( ( rule__Declaration__Article_imagesAssignment_25 ) ) ;
    public final void rule__Declaration__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1187:1: ( ( ( rule__Declaration__Article_imagesAssignment_25 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1188:1: ( ( rule__Declaration__Article_imagesAssignment_25 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1188:1: ( ( rule__Declaration__Article_imagesAssignment_25 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1189:1: ( rule__Declaration__Article_imagesAssignment_25 )
            {
             before(grammarAccess.getDeclarationAccess().getArticle_imagesAssignment_25()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1190:1: ( rule__Declaration__Article_imagesAssignment_25 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1190:2: rule__Declaration__Article_imagesAssignment_25
            {
            pushFollow(FOLLOW_rule__Declaration__Article_imagesAssignment_25_in_rule__Declaration__Group__25__Impl2417);
            rule__Declaration__Article_imagesAssignment_25();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getArticle_imagesAssignment_25()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1200:1: rule__Declaration__Group__26 : rule__Declaration__Group__26__Impl rule__Declaration__Group__27 ;
    public final void rule__Declaration__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1204:1: ( rule__Declaration__Group__26__Impl rule__Declaration__Group__27 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1205:2: rule__Declaration__Group__26__Impl rule__Declaration__Group__27
            {
            pushFollow(FOLLOW_rule__Declaration__Group__26__Impl_in_rule__Declaration__Group__262447);
            rule__Declaration__Group__26__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__27_in_rule__Declaration__Group__262450);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1212:1: rule__Declaration__Group__26__Impl : ( 'number of columns' ) ;
    public final void rule__Declaration__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1216:1: ( ( 'number of columns' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1217:1: ( 'number of columns' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1217:1: ( 'number of columns' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1218:1: 'number of columns'
            {
             before(grammarAccess.getDeclarationAccess().getNumberOfColumnsKeyword_26()); 
            match(input,29,FOLLOW_29_in_rule__Declaration__Group__26__Impl2478); 
             after(grammarAccess.getDeclarationAccess().getNumberOfColumnsKeyword_26()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1231:1: rule__Declaration__Group__27 : rule__Declaration__Group__27__Impl rule__Declaration__Group__28 ;
    public final void rule__Declaration__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1235:1: ( rule__Declaration__Group__27__Impl rule__Declaration__Group__28 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1236:2: rule__Declaration__Group__27__Impl rule__Declaration__Group__28
            {
            pushFollow(FOLLOW_rule__Declaration__Group__27__Impl_in_rule__Declaration__Group__272509);
            rule__Declaration__Group__27__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__28_in_rule__Declaration__Group__272512);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1243:1: rule__Declaration__Group__27__Impl : ( ( rule__Declaration__Columns_cntAssignment_27 ) ) ;
    public final void rule__Declaration__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1247:1: ( ( ( rule__Declaration__Columns_cntAssignment_27 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1248:1: ( ( rule__Declaration__Columns_cntAssignment_27 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1248:1: ( ( rule__Declaration__Columns_cntAssignment_27 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1249:1: ( rule__Declaration__Columns_cntAssignment_27 )
            {
             before(grammarAccess.getDeclarationAccess().getColumns_cntAssignment_27()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1250:1: ( rule__Declaration__Columns_cntAssignment_27 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1250:2: rule__Declaration__Columns_cntAssignment_27
            {
            pushFollow(FOLLOW_rule__Declaration__Columns_cntAssignment_27_in_rule__Declaration__Group__27__Impl2539);
            rule__Declaration__Columns_cntAssignment_27();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getColumns_cntAssignment_27()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1260:1: rule__Declaration__Group__28 : rule__Declaration__Group__28__Impl rule__Declaration__Group__29 ;
    public final void rule__Declaration__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1264:1: ( rule__Declaration__Group__28__Impl rule__Declaration__Group__29 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1265:2: rule__Declaration__Group__28__Impl rule__Declaration__Group__29
            {
            pushFollow(FOLLOW_rule__Declaration__Group__28__Impl_in_rule__Declaration__Group__282569);
            rule__Declaration__Group__28__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__29_in_rule__Declaration__Group__282572);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1272:1: rule__Declaration__Group__28__Impl : ( 'font size' ) ;
    public final void rule__Declaration__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1276:1: ( ( 'font size' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1277:1: ( 'font size' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1277:1: ( 'font size' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1278:1: 'font size'
            {
             before(grammarAccess.getDeclarationAccess().getFontSizeKeyword_28()); 
            match(input,30,FOLLOW_30_in_rule__Declaration__Group__28__Impl2600); 
             after(grammarAccess.getDeclarationAccess().getFontSizeKeyword_28()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1291:1: rule__Declaration__Group__29 : rule__Declaration__Group__29__Impl ;
    public final void rule__Declaration__Group__29() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1295:1: ( rule__Declaration__Group__29__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1296:2: rule__Declaration__Group__29__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group__29__Impl_in_rule__Declaration__Group__292631);
            rule__Declaration__Group__29__Impl();

            state._fsp--;


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1302:1: rule__Declaration__Group__29__Impl : ( ( rule__Declaration__Font_sizeAssignment_29 ) ) ;
    public final void rule__Declaration__Group__29__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1306:1: ( ( ( rule__Declaration__Font_sizeAssignment_29 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1307:1: ( ( rule__Declaration__Font_sizeAssignment_29 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1307:1: ( ( rule__Declaration__Font_sizeAssignment_29 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1308:1: ( rule__Declaration__Font_sizeAssignment_29 )
            {
             before(grammarAccess.getDeclarationAccess().getFont_sizeAssignment_29()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1309:1: ( rule__Declaration__Font_sizeAssignment_29 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1309:2: rule__Declaration__Font_sizeAssignment_29
            {
            pushFollow(FOLLOW_rule__Declaration__Font_sizeAssignment_29_in_rule__Declaration__Group__29__Impl2658);
            rule__Declaration__Font_sizeAssignment_29();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getFont_sizeAssignment_29()); 

            }


            }

        }
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


    // $ANTLR start "rule__Format__Group_0__0"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1379:1: rule__Format__Group_0__0 : rule__Format__Group_0__0__Impl rule__Format__Group_0__1 ;
    public final void rule__Format__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1383:1: ( rule__Format__Group_0__0__Impl rule__Format__Group_0__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1384:2: rule__Format__Group_0__0__Impl rule__Format__Group_0__1
            {
            pushFollow(FOLLOW_rule__Format__Group_0__0__Impl_in_rule__Format__Group_0__02748);
            rule__Format__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Format__Group_0__1_in_rule__Format__Group_0__02751);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1391:1: rule__Format__Group_0__0__Impl : ( '{' ) ;
    public final void rule__Format__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1395:1: ( ( '{' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1396:1: ( '{' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1396:1: ( '{' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1397:1: '{'
            {
             before(grammarAccess.getFormatAccess().getLeftCurlyBracketKeyword_0_0()); 
            match(input,31,FOLLOW_31_in_rule__Format__Group_0__0__Impl2779); 
             after(grammarAccess.getFormatAccess().getLeftCurlyBracketKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Format__Group_0__0__Impl"


    // $ANTLR start "rule__Format__Group_0__1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1410:1: rule__Format__Group_0__1 : rule__Format__Group_0__1__Impl ;
    public final void rule__Format__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1414:1: ( rule__Format__Group_0__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1415:2: rule__Format__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Format__Group_0__1__Impl_in_rule__Format__Group_0__12810);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1421:1: rule__Format__Group_0__1__Impl : ( 'DIN A6' ) ;
    public final void rule__Format__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1425:1: ( ( 'DIN A6' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1426:1: ( 'DIN A6' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1426:1: ( 'DIN A6' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1427:1: 'DIN A6'
            {
             before(grammarAccess.getFormatAccess().getDINA6Keyword_0_1()); 
            match(input,32,FOLLOW_32_in_rule__Format__Group_0__1__Impl2838); 
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


    // $ANTLR start "rule__Format__Group_6__0"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1444:1: rule__Format__Group_6__0 : rule__Format__Group_6__0__Impl rule__Format__Group_6__1 ;
    public final void rule__Format__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1448:1: ( rule__Format__Group_6__0__Impl rule__Format__Group_6__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1449:2: rule__Format__Group_6__0__Impl rule__Format__Group_6__1
            {
            pushFollow(FOLLOW_rule__Format__Group_6__0__Impl_in_rule__Format__Group_6__02873);
            rule__Format__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Format__Group_6__1_in_rule__Format__Group_6__02876);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1456:1: rule__Format__Group_6__0__Impl : ( 'DIN A0' ) ;
    public final void rule__Format__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1460:1: ( ( 'DIN A0' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1461:1: ( 'DIN A0' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1461:1: ( 'DIN A0' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1462:1: 'DIN A0'
            {
             before(grammarAccess.getFormatAccess().getDINA0Keyword_6_0()); 
            match(input,33,FOLLOW_33_in_rule__Format__Group_6__0__Impl2904); 
             after(grammarAccess.getFormatAccess().getDINA0Keyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Format__Group_6__0__Impl"


    // $ANTLR start "rule__Format__Group_6__1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1475:1: rule__Format__Group_6__1 : rule__Format__Group_6__1__Impl ;
    public final void rule__Format__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1479:1: ( rule__Format__Group_6__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1480:2: rule__Format__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Format__Group_6__1__Impl_in_rule__Format__Group_6__12935);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1486:1: rule__Format__Group_6__1__Impl : ( '}' ) ;
    public final void rule__Format__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1490:1: ( ( '}' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1491:1: ( '}' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1491:1: ( '}' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1492:1: '}'
            {
             before(grammarAccess.getFormatAccess().getRightCurlyBracketKeyword_6_1()); 
            match(input,34,FOLLOW_34_in_rule__Format__Group_6__1__Impl2963); 
             after(grammarAccess.getFormatAccess().getRightCurlyBracketKeyword_6_1()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1509:1: rule__Date__Group__0 : rule__Date__Group__0__Impl rule__Date__Group__1 ;
    public final void rule__Date__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1513:1: ( rule__Date__Group__0__Impl rule__Date__Group__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1514:2: rule__Date__Group__0__Impl rule__Date__Group__1
            {
            pushFollow(FOLLOW_rule__Date__Group__0__Impl_in_rule__Date__Group__02998);
            rule__Date__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Date__Group__1_in_rule__Date__Group__03001);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1521:1: rule__Date__Group__0__Impl : ( '{' ) ;
    public final void rule__Date__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1525:1: ( ( '{' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1526:1: ( '{' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1526:1: ( '{' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1527:1: '{'
            {
             before(grammarAccess.getDateAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Date__Group__0__Impl3029); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1540:1: rule__Date__Group__1 : rule__Date__Group__1__Impl rule__Date__Group__2 ;
    public final void rule__Date__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1544:1: ( rule__Date__Group__1__Impl rule__Date__Group__2 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1545:2: rule__Date__Group__1__Impl rule__Date__Group__2
            {
            pushFollow(FOLLOW_rule__Date__Group__1__Impl_in_rule__Date__Group__13060);
            rule__Date__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Date__Group__2_in_rule__Date__Group__13063);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1552:1: rule__Date__Group__1__Impl : ( ( rule__Date__DayAssignment_1 ) ) ;
    public final void rule__Date__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1556:1: ( ( ( rule__Date__DayAssignment_1 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1557:1: ( ( rule__Date__DayAssignment_1 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1557:1: ( ( rule__Date__DayAssignment_1 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1558:1: ( rule__Date__DayAssignment_1 )
            {
             before(grammarAccess.getDateAccess().getDayAssignment_1()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1559:1: ( rule__Date__DayAssignment_1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1559:2: rule__Date__DayAssignment_1
            {
            pushFollow(FOLLOW_rule__Date__DayAssignment_1_in_rule__Date__Group__1__Impl3090);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1569:1: rule__Date__Group__2 : rule__Date__Group__2__Impl rule__Date__Group__3 ;
    public final void rule__Date__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1573:1: ( rule__Date__Group__2__Impl rule__Date__Group__3 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1574:2: rule__Date__Group__2__Impl rule__Date__Group__3
            {
            pushFollow(FOLLOW_rule__Date__Group__2__Impl_in_rule__Date__Group__23120);
            rule__Date__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Date__Group__3_in_rule__Date__Group__23123);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1581:1: rule__Date__Group__2__Impl : ( '-' ) ;
    public final void rule__Date__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1585:1: ( ( '-' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1586:1: ( '-' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1586:1: ( '-' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1587:1: '-'
            {
             before(grammarAccess.getDateAccess().getHyphenMinusKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__Date__Group__2__Impl3151); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1600:1: rule__Date__Group__3 : rule__Date__Group__3__Impl rule__Date__Group__4 ;
    public final void rule__Date__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1604:1: ( rule__Date__Group__3__Impl rule__Date__Group__4 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1605:2: rule__Date__Group__3__Impl rule__Date__Group__4
            {
            pushFollow(FOLLOW_rule__Date__Group__3__Impl_in_rule__Date__Group__33182);
            rule__Date__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Date__Group__4_in_rule__Date__Group__33185);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1612:1: rule__Date__Group__3__Impl : ( ( rule__Date__MonthAssignment_3 ) ) ;
    public final void rule__Date__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1616:1: ( ( ( rule__Date__MonthAssignment_3 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1617:1: ( ( rule__Date__MonthAssignment_3 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1617:1: ( ( rule__Date__MonthAssignment_3 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1618:1: ( rule__Date__MonthAssignment_3 )
            {
             before(grammarAccess.getDateAccess().getMonthAssignment_3()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1619:1: ( rule__Date__MonthAssignment_3 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1619:2: rule__Date__MonthAssignment_3
            {
            pushFollow(FOLLOW_rule__Date__MonthAssignment_3_in_rule__Date__Group__3__Impl3212);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1629:1: rule__Date__Group__4 : rule__Date__Group__4__Impl rule__Date__Group__5 ;
    public final void rule__Date__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1633:1: ( rule__Date__Group__4__Impl rule__Date__Group__5 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1634:2: rule__Date__Group__4__Impl rule__Date__Group__5
            {
            pushFollow(FOLLOW_rule__Date__Group__4__Impl_in_rule__Date__Group__43242);
            rule__Date__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Date__Group__5_in_rule__Date__Group__43245);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1641:1: rule__Date__Group__4__Impl : ( '-' ) ;
    public final void rule__Date__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1645:1: ( ( '-' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1646:1: ( '-' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1646:1: ( '-' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1647:1: '-'
            {
             before(grammarAccess.getDateAccess().getHyphenMinusKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__Date__Group__4__Impl3273); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1660:1: rule__Date__Group__5 : rule__Date__Group__5__Impl rule__Date__Group__6 ;
    public final void rule__Date__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1664:1: ( rule__Date__Group__5__Impl rule__Date__Group__6 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1665:2: rule__Date__Group__5__Impl rule__Date__Group__6
            {
            pushFollow(FOLLOW_rule__Date__Group__5__Impl_in_rule__Date__Group__53304);
            rule__Date__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Date__Group__6_in_rule__Date__Group__53307);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1672:1: rule__Date__Group__5__Impl : ( ( rule__Date__YearAssignment_5 ) ) ;
    public final void rule__Date__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1676:1: ( ( ( rule__Date__YearAssignment_5 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1677:1: ( ( rule__Date__YearAssignment_5 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1677:1: ( ( rule__Date__YearAssignment_5 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1678:1: ( rule__Date__YearAssignment_5 )
            {
             before(grammarAccess.getDateAccess().getYearAssignment_5()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1679:1: ( rule__Date__YearAssignment_5 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1679:2: rule__Date__YearAssignment_5
            {
            pushFollow(FOLLOW_rule__Date__YearAssignment_5_in_rule__Date__Group__5__Impl3334);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1689:1: rule__Date__Group__6 : rule__Date__Group__6__Impl ;
    public final void rule__Date__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1693:1: ( rule__Date__Group__6__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1694:2: rule__Date__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Date__Group__6__Impl_in_rule__Date__Group__63364);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1700:1: rule__Date__Group__6__Impl : ( '}' ) ;
    public final void rule__Date__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1704:1: ( ( '}' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1705:1: ( '}' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1705:1: ( '}' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1706:1: '}'
            {
             before(grammarAccess.getDateAccess().getRightCurlyBracketKeyword_6()); 
            match(input,34,FOLLOW_34_in_rule__Date__Group__6__Impl3392); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1733:1: rule__Language__Group_0__0 : rule__Language__Group_0__0__Impl rule__Language__Group_0__1 ;
    public final void rule__Language__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1737:1: ( rule__Language__Group_0__0__Impl rule__Language__Group_0__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1738:2: rule__Language__Group_0__0__Impl rule__Language__Group_0__1
            {
            pushFollow(FOLLOW_rule__Language__Group_0__0__Impl_in_rule__Language__Group_0__03437);
            rule__Language__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Language__Group_0__1_in_rule__Language__Group_0__03440);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1745:1: rule__Language__Group_0__0__Impl : ( '{' ) ;
    public final void rule__Language__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1749:1: ( ( '{' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1750:1: ( '{' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1750:1: ( '{' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1751:1: '{'
            {
             before(grammarAccess.getLanguageAccess().getLeftCurlyBracketKeyword_0_0()); 
            match(input,31,FOLLOW_31_in_rule__Language__Group_0__0__Impl3468); 
             after(grammarAccess.getLanguageAccess().getLeftCurlyBracketKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__Group_0__0__Impl"


    // $ANTLR start "rule__Language__Group_0__1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1764:1: rule__Language__Group_0__1 : rule__Language__Group_0__1__Impl ;
    public final void rule__Language__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1768:1: ( rule__Language__Group_0__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1769:2: rule__Language__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Language__Group_0__1__Impl_in_rule__Language__Group_0__13499);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1775:1: rule__Language__Group_0__1__Impl : ( 'English' ) ;
    public final void rule__Language__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1779:1: ( ( 'English' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1780:1: ( 'English' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1780:1: ( 'English' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1781:1: 'English'
            {
             before(grammarAccess.getLanguageAccess().getEnglishKeyword_0_1()); 
            match(input,35,FOLLOW_35_in_rule__Language__Group_0__1__Impl3527); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1798:1: rule__Language__Group_1__0 : rule__Language__Group_1__0__Impl rule__Language__Group_1__1 ;
    public final void rule__Language__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1802:1: ( rule__Language__Group_1__0__Impl rule__Language__Group_1__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1803:2: rule__Language__Group_1__0__Impl rule__Language__Group_1__1
            {
            pushFollow(FOLLOW_rule__Language__Group_1__0__Impl_in_rule__Language__Group_1__03562);
            rule__Language__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Language__Group_1__1_in_rule__Language__Group_1__03565);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1810:1: rule__Language__Group_1__0__Impl : ( 'German' ) ;
    public final void rule__Language__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1814:1: ( ( 'German' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1815:1: ( 'German' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1815:1: ( 'German' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1816:1: 'German'
            {
             before(grammarAccess.getLanguageAccess().getGermanKeyword_1_0()); 
            match(input,36,FOLLOW_36_in_rule__Language__Group_1__0__Impl3593); 
             after(grammarAccess.getLanguageAccess().getGermanKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__Group_1__0__Impl"


    // $ANTLR start "rule__Language__Group_1__1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1829:1: rule__Language__Group_1__1 : rule__Language__Group_1__1__Impl ;
    public final void rule__Language__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1833:1: ( rule__Language__Group_1__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1834:2: rule__Language__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Language__Group_1__1__Impl_in_rule__Language__Group_1__13624);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1840:1: rule__Language__Group_1__1__Impl : ( '}' ) ;
    public final void rule__Language__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1844:1: ( ( '}' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1845:1: ( '}' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1845:1: ( '}' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1846:1: '}'
            {
             before(grammarAccess.getLanguageAccess().getRightCurlyBracketKeyword_1_1()); 
            match(input,34,FOLLOW_34_in_rule__Language__Group_1__1__Impl3652); 
             after(grammarAccess.getLanguageAccess().getRightCurlyBracketKeyword_1_1()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1863:1: rule__Price__Group__0 : rule__Price__Group__0__Impl rule__Price__Group__1 ;
    public final void rule__Price__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1867:1: ( rule__Price__Group__0__Impl rule__Price__Group__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1868:2: rule__Price__Group__0__Impl rule__Price__Group__1
            {
            pushFollow(FOLLOW_rule__Price__Group__0__Impl_in_rule__Price__Group__03687);
            rule__Price__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Price__Group__1_in_rule__Price__Group__03690);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1875:1: rule__Price__Group__0__Impl : ( '{' ) ;
    public final void rule__Price__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1879:1: ( ( '{' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1880:1: ( '{' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1880:1: ( '{' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1881:1: '{'
            {
             before(grammarAccess.getPriceAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Price__Group__0__Impl3718); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1894:1: rule__Price__Group__1 : rule__Price__Group__1__Impl rule__Price__Group__2 ;
    public final void rule__Price__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1898:1: ( rule__Price__Group__1__Impl rule__Price__Group__2 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1899:2: rule__Price__Group__1__Impl rule__Price__Group__2
            {
            pushFollow(FOLLOW_rule__Price__Group__1__Impl_in_rule__Price__Group__13749);
            rule__Price__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Price__Group__2_in_rule__Price__Group__13752);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1906:1: rule__Price__Group__1__Impl : ( ( rule__Price__ValueAssignment_1 ) ) ;
    public final void rule__Price__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1910:1: ( ( ( rule__Price__ValueAssignment_1 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1911:1: ( ( rule__Price__ValueAssignment_1 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1911:1: ( ( rule__Price__ValueAssignment_1 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1912:1: ( rule__Price__ValueAssignment_1 )
            {
             before(grammarAccess.getPriceAccess().getValueAssignment_1()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1913:1: ( rule__Price__ValueAssignment_1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1913:2: rule__Price__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Price__ValueAssignment_1_in_rule__Price__Group__1__Impl3779);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1923:1: rule__Price__Group__2 : rule__Price__Group__2__Impl rule__Price__Group__3 ;
    public final void rule__Price__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1927:1: ( rule__Price__Group__2__Impl rule__Price__Group__3 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1928:2: rule__Price__Group__2__Impl rule__Price__Group__3
            {
            pushFollow(FOLLOW_rule__Price__Group__2__Impl_in_rule__Price__Group__23809);
            rule__Price__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Price__Group__3_in_rule__Price__Group__23812);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1935:1: rule__Price__Group__2__Impl : ( ( rule__Price__CurrencyAssignment_2 ) ) ;
    public final void rule__Price__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1939:1: ( ( ( rule__Price__CurrencyAssignment_2 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1940:1: ( ( rule__Price__CurrencyAssignment_2 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1940:1: ( ( rule__Price__CurrencyAssignment_2 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1941:1: ( rule__Price__CurrencyAssignment_2 )
            {
             before(grammarAccess.getPriceAccess().getCurrencyAssignment_2()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1942:1: ( rule__Price__CurrencyAssignment_2 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1942:2: rule__Price__CurrencyAssignment_2
            {
            pushFollow(FOLLOW_rule__Price__CurrencyAssignment_2_in_rule__Price__Group__2__Impl3839);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1952:1: rule__Price__Group__3 : rule__Price__Group__3__Impl ;
    public final void rule__Price__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1956:1: ( rule__Price__Group__3__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1957:2: rule__Price__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Price__Group__3__Impl_in_rule__Price__Group__33869);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1963:1: rule__Price__Group__3__Impl : ( '}' ) ;
    public final void rule__Price__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1967:1: ( ( '}' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1968:1: ( '}' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1968:1: ( '}' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1969:1: '}'
            {
             before(grammarAccess.getPriceAccess().getRightCurlyBracketKeyword_3()); 
            match(input,34,FOLLOW_34_in_rule__Price__Group__3__Impl3897); 
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


    // $ANTLR start "rule__Currency__Group_0__0"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1990:1: rule__Currency__Group_0__0 : rule__Currency__Group_0__0__Impl rule__Currency__Group_0__1 ;
    public final void rule__Currency__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1994:1: ( rule__Currency__Group_0__0__Impl rule__Currency__Group_0__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1995:2: rule__Currency__Group_0__0__Impl rule__Currency__Group_0__1
            {
            pushFollow(FOLLOW_rule__Currency__Group_0__0__Impl_in_rule__Currency__Group_0__03936);
            rule__Currency__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Currency__Group_0__1_in_rule__Currency__Group_0__03939);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2002:1: rule__Currency__Group_0__0__Impl : ( '{' ) ;
    public final void rule__Currency__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2006:1: ( ( '{' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2007:1: ( '{' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2007:1: ( '{' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2008:1: '{'
            {
             before(grammarAccess.getCurrencyAccess().getLeftCurlyBracketKeyword_0_0()); 
            match(input,31,FOLLOW_31_in_rule__Currency__Group_0__0__Impl3967); 
             after(grammarAccess.getCurrencyAccess().getLeftCurlyBracketKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Currency__Group_0__0__Impl"


    // $ANTLR start "rule__Currency__Group_0__1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2021:1: rule__Currency__Group_0__1 : rule__Currency__Group_0__1__Impl ;
    public final void rule__Currency__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2025:1: ( rule__Currency__Group_0__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2026:2: rule__Currency__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Currency__Group_0__1__Impl_in_rule__Currency__Group_0__13998);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2032:1: rule__Currency__Group_0__1__Impl : ( 'Euro' ) ;
    public final void rule__Currency__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2036:1: ( ( 'Euro' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2037:1: ( 'Euro' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2037:1: ( 'Euro' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2038:1: 'Euro'
            {
             before(grammarAccess.getCurrencyAccess().getEuroKeyword_0_1()); 
            match(input,37,FOLLOW_37_in_rule__Currency__Group_0__1__Impl4026); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2055:1: rule__Currency__Group_1__0 : rule__Currency__Group_1__0__Impl rule__Currency__Group_1__1 ;
    public final void rule__Currency__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2059:1: ( rule__Currency__Group_1__0__Impl rule__Currency__Group_1__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2060:2: rule__Currency__Group_1__0__Impl rule__Currency__Group_1__1
            {
            pushFollow(FOLLOW_rule__Currency__Group_1__0__Impl_in_rule__Currency__Group_1__04061);
            rule__Currency__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Currency__Group_1__1_in_rule__Currency__Group_1__04064);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2067:1: rule__Currency__Group_1__0__Impl : ( 'Dollar' ) ;
    public final void rule__Currency__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2071:1: ( ( 'Dollar' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2072:1: ( 'Dollar' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2072:1: ( 'Dollar' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2073:1: 'Dollar'
            {
             before(grammarAccess.getCurrencyAccess().getDollarKeyword_1_0()); 
            match(input,38,FOLLOW_38_in_rule__Currency__Group_1__0__Impl4092); 
             after(grammarAccess.getCurrencyAccess().getDollarKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Currency__Group_1__0__Impl"


    // $ANTLR start "rule__Currency__Group_1__1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2086:1: rule__Currency__Group_1__1 : rule__Currency__Group_1__1__Impl ;
    public final void rule__Currency__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2090:1: ( rule__Currency__Group_1__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2091:2: rule__Currency__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Currency__Group_1__1__Impl_in_rule__Currency__Group_1__14123);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2097:1: rule__Currency__Group_1__1__Impl : ( '}' ) ;
    public final void rule__Currency__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2101:1: ( ( '}' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2102:1: ( '}' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2102:1: ( '}' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2103:1: '}'
            {
             before(grammarAccess.getCurrencyAccess().getRightCurlyBracketKeyword_1_1()); 
            match(input,34,FOLLOW_34_in_rule__Currency__Group_1__1__Impl4151); 
             after(grammarAccess.getCurrencyAccess().getRightCurlyBracketKeyword_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Topics__Group__0"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2120:1: rule__Topics__Group__0 : rule__Topics__Group__0__Impl rule__Topics__Group__1 ;
    public final void rule__Topics__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2124:1: ( rule__Topics__Group__0__Impl rule__Topics__Group__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2125:2: rule__Topics__Group__0__Impl rule__Topics__Group__1
            {
            pushFollow(FOLLOW_rule__Topics__Group__0__Impl_in_rule__Topics__Group__04186);
            rule__Topics__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Topics__Group__1_in_rule__Topics__Group__04189);
            rule__Topics__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topics__Group__0"


    // $ANTLR start "rule__Topics__Group__0__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2132:1: rule__Topics__Group__0__Impl : ( '{' ) ;
    public final void rule__Topics__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2136:1: ( ( '{' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2137:1: ( '{' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2137:1: ( '{' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2138:1: '{'
            {
             before(grammarAccess.getTopicsAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Topics__Group__0__Impl4217); 
             after(grammarAccess.getTopicsAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topics__Group__0__Impl"


    // $ANTLR start "rule__Topics__Group__1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2151:1: rule__Topics__Group__1 : rule__Topics__Group__1__Impl ;
    public final void rule__Topics__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2155:1: ( rule__Topics__Group__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2156:2: rule__Topics__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Topics__Group__1__Impl_in_rule__Topics__Group__14248);
            rule__Topics__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topics__Group__1"


    // $ANTLR start "rule__Topics__Group__1__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2162:1: rule__Topics__Group__1__Impl : ( '}' ) ;
    public final void rule__Topics__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2166:1: ( ( '}' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2167:1: ( '}' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2167:1: ( '}' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2168:1: '}'
            {
             before(grammarAccess.getTopicsAccess().getRightCurlyBracketKeyword_1()); 
            match(input,34,FOLLOW_34_in_rule__Topics__Group__1__Impl4276); 
             after(grammarAccess.getTopicsAccess().getRightCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topics__Group__1__Impl"


    // $ANTLR start "rule__Feedlinks__Group__0"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2185:1: rule__Feedlinks__Group__0 : rule__Feedlinks__Group__0__Impl rule__Feedlinks__Group__1 ;
    public final void rule__Feedlinks__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2189:1: ( rule__Feedlinks__Group__0__Impl rule__Feedlinks__Group__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2190:2: rule__Feedlinks__Group__0__Impl rule__Feedlinks__Group__1
            {
            pushFollow(FOLLOW_rule__Feedlinks__Group__0__Impl_in_rule__Feedlinks__Group__04311);
            rule__Feedlinks__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feedlinks__Group__1_in_rule__Feedlinks__Group__04314);
            rule__Feedlinks__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feedlinks__Group__0"


    // $ANTLR start "rule__Feedlinks__Group__0__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2197:1: rule__Feedlinks__Group__0__Impl : ( '{' ) ;
    public final void rule__Feedlinks__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2201:1: ( ( '{' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2202:1: ( '{' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2202:1: ( '{' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2203:1: '{'
            {
             before(grammarAccess.getFeedlinksAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Feedlinks__Group__0__Impl4342); 
             after(grammarAccess.getFeedlinksAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feedlinks__Group__0__Impl"


    // $ANTLR start "rule__Feedlinks__Group__1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2216:1: rule__Feedlinks__Group__1 : rule__Feedlinks__Group__1__Impl rule__Feedlinks__Group__2 ;
    public final void rule__Feedlinks__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2220:1: ( rule__Feedlinks__Group__1__Impl rule__Feedlinks__Group__2 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2221:2: rule__Feedlinks__Group__1__Impl rule__Feedlinks__Group__2
            {
            pushFollow(FOLLOW_rule__Feedlinks__Group__1__Impl_in_rule__Feedlinks__Group__14373);
            rule__Feedlinks__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feedlinks__Group__2_in_rule__Feedlinks__Group__14376);
            rule__Feedlinks__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feedlinks__Group__1"


    // $ANTLR start "rule__Feedlinks__Group__1__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2228:1: rule__Feedlinks__Group__1__Impl : ( ( rule__Feedlinks__PairsAssignment_1 ) ) ;
    public final void rule__Feedlinks__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2232:1: ( ( ( rule__Feedlinks__PairsAssignment_1 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2233:1: ( ( rule__Feedlinks__PairsAssignment_1 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2233:1: ( ( rule__Feedlinks__PairsAssignment_1 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2234:1: ( rule__Feedlinks__PairsAssignment_1 )
            {
             before(grammarAccess.getFeedlinksAccess().getPairsAssignment_1()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2235:1: ( rule__Feedlinks__PairsAssignment_1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2235:2: rule__Feedlinks__PairsAssignment_1
            {
            pushFollow(FOLLOW_rule__Feedlinks__PairsAssignment_1_in_rule__Feedlinks__Group__1__Impl4403);
            rule__Feedlinks__PairsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFeedlinksAccess().getPairsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feedlinks__Group__1__Impl"


    // $ANTLR start "rule__Feedlinks__Group__2"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2245:1: rule__Feedlinks__Group__2 : rule__Feedlinks__Group__2__Impl rule__Feedlinks__Group__3 ;
    public final void rule__Feedlinks__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2249:1: ( rule__Feedlinks__Group__2__Impl rule__Feedlinks__Group__3 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2250:2: rule__Feedlinks__Group__2__Impl rule__Feedlinks__Group__3
            {
            pushFollow(FOLLOW_rule__Feedlinks__Group__2__Impl_in_rule__Feedlinks__Group__24433);
            rule__Feedlinks__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feedlinks__Group__3_in_rule__Feedlinks__Group__24436);
            rule__Feedlinks__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feedlinks__Group__2"


    // $ANTLR start "rule__Feedlinks__Group__2__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2257:1: rule__Feedlinks__Group__2__Impl : ( ( rule__Feedlinks__Group_2__0 )* ) ;
    public final void rule__Feedlinks__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2261:1: ( ( ( rule__Feedlinks__Group_2__0 )* ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2262:1: ( ( rule__Feedlinks__Group_2__0 )* )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2262:1: ( ( rule__Feedlinks__Group_2__0 )* )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2263:1: ( rule__Feedlinks__Group_2__0 )*
            {
             before(grammarAccess.getFeedlinksAccess().getGroup_2()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2264:1: ( rule__Feedlinks__Group_2__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==39) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2264:2: rule__Feedlinks__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Feedlinks__Group_2__0_in_rule__Feedlinks__Group__2__Impl4463);
            	    rule__Feedlinks__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getFeedlinksAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feedlinks__Group__2__Impl"


    // $ANTLR start "rule__Feedlinks__Group__3"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2274:1: rule__Feedlinks__Group__3 : rule__Feedlinks__Group__3__Impl ;
    public final void rule__Feedlinks__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2278:1: ( rule__Feedlinks__Group__3__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2279:2: rule__Feedlinks__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Feedlinks__Group__3__Impl_in_rule__Feedlinks__Group__34494);
            rule__Feedlinks__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feedlinks__Group__3"


    // $ANTLR start "rule__Feedlinks__Group__3__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2285:1: rule__Feedlinks__Group__3__Impl : ( '}' ) ;
    public final void rule__Feedlinks__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2289:1: ( ( '}' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2290:1: ( '}' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2290:1: ( '}' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2291:1: '}'
            {
             before(grammarAccess.getFeedlinksAccess().getRightCurlyBracketKeyword_3()); 
            match(input,34,FOLLOW_34_in_rule__Feedlinks__Group__3__Impl4522); 
             after(grammarAccess.getFeedlinksAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feedlinks__Group__3__Impl"


    // $ANTLR start "rule__Feedlinks__Group_2__0"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2312:1: rule__Feedlinks__Group_2__0 : rule__Feedlinks__Group_2__0__Impl rule__Feedlinks__Group_2__1 ;
    public final void rule__Feedlinks__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2316:1: ( rule__Feedlinks__Group_2__0__Impl rule__Feedlinks__Group_2__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2317:2: rule__Feedlinks__Group_2__0__Impl rule__Feedlinks__Group_2__1
            {
            pushFollow(FOLLOW_rule__Feedlinks__Group_2__0__Impl_in_rule__Feedlinks__Group_2__04561);
            rule__Feedlinks__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feedlinks__Group_2__1_in_rule__Feedlinks__Group_2__04564);
            rule__Feedlinks__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feedlinks__Group_2__0"


    // $ANTLR start "rule__Feedlinks__Group_2__0__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2324:1: rule__Feedlinks__Group_2__0__Impl : ( ', ' ) ;
    public final void rule__Feedlinks__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2328:1: ( ( ', ' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2329:1: ( ', ' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2329:1: ( ', ' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2330:1: ', '
            {
             before(grammarAccess.getFeedlinksAccess().getCommaSpaceKeyword_2_0()); 
            match(input,39,FOLLOW_39_in_rule__Feedlinks__Group_2__0__Impl4592); 
             after(grammarAccess.getFeedlinksAccess().getCommaSpaceKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feedlinks__Group_2__0__Impl"


    // $ANTLR start "rule__Feedlinks__Group_2__1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2343:1: rule__Feedlinks__Group_2__1 : rule__Feedlinks__Group_2__1__Impl ;
    public final void rule__Feedlinks__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2347:1: ( rule__Feedlinks__Group_2__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2348:2: rule__Feedlinks__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Feedlinks__Group_2__1__Impl_in_rule__Feedlinks__Group_2__14623);
            rule__Feedlinks__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feedlinks__Group_2__1"


    // $ANTLR start "rule__Feedlinks__Group_2__1__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2354:1: rule__Feedlinks__Group_2__1__Impl : ( ( rule__Feedlinks__PairsAssignment_2_1 ) ) ;
    public final void rule__Feedlinks__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2358:1: ( ( ( rule__Feedlinks__PairsAssignment_2_1 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2359:1: ( ( rule__Feedlinks__PairsAssignment_2_1 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2359:1: ( ( rule__Feedlinks__PairsAssignment_2_1 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2360:1: ( rule__Feedlinks__PairsAssignment_2_1 )
            {
             before(grammarAccess.getFeedlinksAccess().getPairsAssignment_2_1()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2361:1: ( rule__Feedlinks__PairsAssignment_2_1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2361:2: rule__Feedlinks__PairsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Feedlinks__PairsAssignment_2_1_in_rule__Feedlinks__Group_2__1__Impl4650);
            rule__Feedlinks__PairsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFeedlinksAccess().getPairsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feedlinks__Group_2__1__Impl"


    // $ANTLR start "rule__Pair__Group__0"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2375:1: rule__Pair__Group__0 : rule__Pair__Group__0__Impl rule__Pair__Group__1 ;
    public final void rule__Pair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2379:1: ( rule__Pair__Group__0__Impl rule__Pair__Group__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2380:2: rule__Pair__Group__0__Impl rule__Pair__Group__1
            {
            pushFollow(FOLLOW_rule__Pair__Group__0__Impl_in_rule__Pair__Group__04684);
            rule__Pair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Pair__Group__1_in_rule__Pair__Group__04687);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2387:1: rule__Pair__Group__0__Impl : ( '{' ) ;
    public final void rule__Pair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2391:1: ( ( '{' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2392:1: ( '{' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2392:1: ( '{' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2393:1: '{'
            {
             before(grammarAccess.getPairAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Pair__Group__0__Impl4715); 
             after(grammarAccess.getPairAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2406:1: rule__Pair__Group__1 : rule__Pair__Group__1__Impl rule__Pair__Group__2 ;
    public final void rule__Pair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2410:1: ( rule__Pair__Group__1__Impl rule__Pair__Group__2 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2411:2: rule__Pair__Group__1__Impl rule__Pair__Group__2
            {
            pushFollow(FOLLOW_rule__Pair__Group__1__Impl_in_rule__Pair__Group__14746);
            rule__Pair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Pair__Group__2_in_rule__Pair__Group__14749);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2418:1: rule__Pair__Group__1__Impl : ( ( rule__Pair__KeyAssignment_1 ) ) ;
    public final void rule__Pair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2422:1: ( ( ( rule__Pair__KeyAssignment_1 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2423:1: ( ( rule__Pair__KeyAssignment_1 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2423:1: ( ( rule__Pair__KeyAssignment_1 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2424:1: ( rule__Pair__KeyAssignment_1 )
            {
             before(grammarAccess.getPairAccess().getKeyAssignment_1()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2425:1: ( rule__Pair__KeyAssignment_1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2425:2: rule__Pair__KeyAssignment_1
            {
            pushFollow(FOLLOW_rule__Pair__KeyAssignment_1_in_rule__Pair__Group__1__Impl4776);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2435:1: rule__Pair__Group__2 : rule__Pair__Group__2__Impl rule__Pair__Group__3 ;
    public final void rule__Pair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2439:1: ( rule__Pair__Group__2__Impl rule__Pair__Group__3 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2440:2: rule__Pair__Group__2__Impl rule__Pair__Group__3
            {
            pushFollow(FOLLOW_rule__Pair__Group__2__Impl_in_rule__Pair__Group__24806);
            rule__Pair__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Pair__Group__3_in_rule__Pair__Group__24809);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2447:1: rule__Pair__Group__2__Impl : ( ( rule__Pair__ValueAssignment_2 ) ) ;
    public final void rule__Pair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2451:1: ( ( ( rule__Pair__ValueAssignment_2 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2452:1: ( ( rule__Pair__ValueAssignment_2 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2452:1: ( ( rule__Pair__ValueAssignment_2 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2453:1: ( rule__Pair__ValueAssignment_2 )
            {
             before(grammarAccess.getPairAccess().getValueAssignment_2()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2454:1: ( rule__Pair__ValueAssignment_2 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2454:2: rule__Pair__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Pair__ValueAssignment_2_in_rule__Pair__Group__2__Impl4836);
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


    // $ANTLR start "rule__Pair__Group__3"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2464:1: rule__Pair__Group__3 : rule__Pair__Group__3__Impl ;
    public final void rule__Pair__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2468:1: ( rule__Pair__Group__3__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2469:2: rule__Pair__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Pair__Group__3__Impl_in_rule__Pair__Group__34866);
            rule__Pair__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2475:1: rule__Pair__Group__3__Impl : ( '}' ) ;
    public final void rule__Pair__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2479:1: ( ( '}' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2480:1: ( '}' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2480:1: ( '}' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2481:1: '}'
            {
             before(grammarAccess.getPairAccess().getRightCurlyBracketKeyword_3()); 
            match(input,34,FOLLOW_34_in_rule__Pair__Group__3__Impl4894); 
             after(grammarAccess.getPairAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Declaration__NameAssignment_1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2503:1: rule__Declaration__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Declaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2507:1: ( ( RULE_STRING ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2508:1: ( RULE_STRING )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2508:1: ( RULE_STRING )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2509:1: RULE_STRING
            {
             before(grammarAccess.getDeclarationAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Declaration__NameAssignment_14938); 
             after(grammarAccess.getDeclarationAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Declaration__FeedlinksAssignment_3"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2518:1: rule__Declaration__FeedlinksAssignment_3 : ( ruleFeedlinks ) ;
    public final void rule__Declaration__FeedlinksAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2522:1: ( ( ruleFeedlinks ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2523:1: ( ruleFeedlinks )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2523:1: ( ruleFeedlinks )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2524:1: ruleFeedlinks
            {
             before(grammarAccess.getDeclarationAccess().getFeedlinksFeedlinksParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleFeedlinks_in_rule__Declaration__FeedlinksAssignment_34969);
            ruleFeedlinks();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getFeedlinksFeedlinksParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__FeedlinksAssignment_3"


    // $ANTLR start "rule__Declaration__TopicsAssignment_5"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2533:1: rule__Declaration__TopicsAssignment_5 : ( ruleTopics ) ;
    public final void rule__Declaration__TopicsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2537:1: ( ( ruleTopics ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2538:1: ( ruleTopics )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2538:1: ( ruleTopics )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2539:1: ruleTopics
            {
             before(grammarAccess.getDeclarationAccess().getTopicsTopicsParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleTopics_in_rule__Declaration__TopicsAssignment_55000);
            ruleTopics();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getTopicsTopicsParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__TopicsAssignment_5"


    // $ANTLR start "rule__Declaration__DateAssignment_7"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2548:1: rule__Declaration__DateAssignment_7 : ( ruleDate ) ;
    public final void rule__Declaration__DateAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2552:1: ( ( ruleDate ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2553:1: ( ruleDate )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2553:1: ( ruleDate )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2554:1: ruleDate
            {
             before(grammarAccess.getDeclarationAccess().getDateDateParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleDate_in_rule__Declaration__DateAssignment_75031);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getDateDateParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__DateAssignment_7"


    // $ANTLR start "rule__Declaration__LocationAssignment_9"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2563:1: rule__Declaration__LocationAssignment_9 : ( RULE_STRING ) ;
    public final void rule__Declaration__LocationAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2567:1: ( ( RULE_STRING ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2568:1: ( RULE_STRING )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2568:1: ( RULE_STRING )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2569:1: RULE_STRING
            {
             before(grammarAccess.getDeclarationAccess().getLocationSTRINGTerminalRuleCall_9_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Declaration__LocationAssignment_95062); 
             after(grammarAccess.getDeclarationAccess().getLocationSTRINGTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__LocationAssignment_9"


    // $ANTLR start "rule__Declaration__PriceAssignment_11"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2578:1: rule__Declaration__PriceAssignment_11 : ( rulePrice ) ;
    public final void rule__Declaration__PriceAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2582:1: ( ( rulePrice ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2583:1: ( rulePrice )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2583:1: ( rulePrice )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2584:1: rulePrice
            {
             before(grammarAccess.getDeclarationAccess().getPricePriceParserRuleCall_11_0()); 
            pushFollow(FOLLOW_rulePrice_in_rule__Declaration__PriceAssignment_115093);
            rulePrice();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getPricePriceParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__PriceAssignment_11"


    // $ANTLR start "rule__Declaration__VolumeAssignment_13"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2593:1: rule__Declaration__VolumeAssignment_13 : ( RULE_INT ) ;
    public final void rule__Declaration__VolumeAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2597:1: ( ( RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2598:1: ( RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2598:1: ( RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2599:1: RULE_INT
            {
             before(grammarAccess.getDeclarationAccess().getVolumeINTTerminalRuleCall_13_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Declaration__VolumeAssignment_135124); 
             after(grammarAccess.getDeclarationAccess().getVolumeINTTerminalRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__VolumeAssignment_13"


    // $ANTLR start "rule__Declaration__LanguageAssignment_15"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2608:1: rule__Declaration__LanguageAssignment_15 : ( ruleLanguage ) ;
    public final void rule__Declaration__LanguageAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2612:1: ( ( ruleLanguage ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2613:1: ( ruleLanguage )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2613:1: ( ruleLanguage )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2614:1: ruleLanguage
            {
             before(grammarAccess.getDeclarationAccess().getLanguageLanguageParserRuleCall_15_0()); 
            pushFollow(FOLLOW_ruleLanguage_in_rule__Declaration__LanguageAssignment_155155);
            ruleLanguage();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getLanguageLanguageParserRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__LanguageAssignment_15"


    // $ANTLR start "rule__Declaration__FormatAssignment_17"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2623:1: rule__Declaration__FormatAssignment_17 : ( ruleFormat ) ;
    public final void rule__Declaration__FormatAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2627:1: ( ( ruleFormat ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2628:1: ( ruleFormat )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2628:1: ( ruleFormat )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2629:1: ruleFormat
            {
             before(grammarAccess.getDeclarationAccess().getFormatFormatParserRuleCall_17_0()); 
            pushFollow(FOLLOW_ruleFormat_in_rule__Declaration__FormatAssignment_175186);
            ruleFormat();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getFormatFormatParserRuleCall_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__FormatAssignment_17"


    // $ANTLR start "rule__Declaration__Article_cntAssignment_19"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2638:1: rule__Declaration__Article_cntAssignment_19 : ( RULE_INT ) ;
    public final void rule__Declaration__Article_cntAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2642:1: ( ( RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2643:1: ( RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2643:1: ( RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2644:1: RULE_INT
            {
             before(grammarAccess.getDeclarationAccess().getArticle_cntINTTerminalRuleCall_19_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Declaration__Article_cntAssignment_195217); 
             after(grammarAccess.getDeclarationAccess().getArticle_cntINTTerminalRuleCall_19_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Article_cntAssignment_19"


    // $ANTLR start "rule__Declaration__Article_char_minAssignment_21"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2653:1: rule__Declaration__Article_char_minAssignment_21 : ( RULE_INT ) ;
    public final void rule__Declaration__Article_char_minAssignment_21() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2657:1: ( ( RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2658:1: ( RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2658:1: ( RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2659:1: RULE_INT
            {
             before(grammarAccess.getDeclarationAccess().getArticle_char_minINTTerminalRuleCall_21_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Declaration__Article_char_minAssignment_215248); 
             after(grammarAccess.getDeclarationAccess().getArticle_char_minINTTerminalRuleCall_21_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Article_char_minAssignment_21"


    // $ANTLR start "rule__Declaration__Article_char_maxAssignment_23"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2668:1: rule__Declaration__Article_char_maxAssignment_23 : ( RULE_INT ) ;
    public final void rule__Declaration__Article_char_maxAssignment_23() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2672:1: ( ( RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2673:1: ( RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2673:1: ( RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2674:1: RULE_INT
            {
             before(grammarAccess.getDeclarationAccess().getArticle_char_maxINTTerminalRuleCall_23_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Declaration__Article_char_maxAssignment_235279); 
             after(grammarAccess.getDeclarationAccess().getArticle_char_maxINTTerminalRuleCall_23_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Article_char_maxAssignment_23"


    // $ANTLR start "rule__Declaration__Article_imagesAssignment_25"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2683:1: rule__Declaration__Article_imagesAssignment_25 : ( RULE_INT ) ;
    public final void rule__Declaration__Article_imagesAssignment_25() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2687:1: ( ( RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2688:1: ( RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2688:1: ( RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2689:1: RULE_INT
            {
             before(grammarAccess.getDeclarationAccess().getArticle_imagesINTTerminalRuleCall_25_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Declaration__Article_imagesAssignment_255310); 
             after(grammarAccess.getDeclarationAccess().getArticle_imagesINTTerminalRuleCall_25_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Article_imagesAssignment_25"


    // $ANTLR start "rule__Declaration__Columns_cntAssignment_27"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2698:1: rule__Declaration__Columns_cntAssignment_27 : ( RULE_INT ) ;
    public final void rule__Declaration__Columns_cntAssignment_27() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2702:1: ( ( RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2703:1: ( RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2703:1: ( RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2704:1: RULE_INT
            {
             before(grammarAccess.getDeclarationAccess().getColumns_cntINTTerminalRuleCall_27_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Declaration__Columns_cntAssignment_275341); 
             after(grammarAccess.getDeclarationAccess().getColumns_cntINTTerminalRuleCall_27_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Columns_cntAssignment_27"


    // $ANTLR start "rule__Declaration__Font_sizeAssignment_29"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2713:1: rule__Declaration__Font_sizeAssignment_29 : ( RULE_INT ) ;
    public final void rule__Declaration__Font_sizeAssignment_29() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2717:1: ( ( RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2718:1: ( RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2718:1: ( RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2719:1: RULE_INT
            {
             before(grammarAccess.getDeclarationAccess().getFont_sizeINTTerminalRuleCall_29_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Declaration__Font_sizeAssignment_295372); 
             after(grammarAccess.getDeclarationAccess().getFont_sizeINTTerminalRuleCall_29_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Font_sizeAssignment_29"


    // $ANTLR start "rule__Date__DayAssignment_1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2728:1: rule__Date__DayAssignment_1 : ( RULE_INT ) ;
    public final void rule__Date__DayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2732:1: ( ( RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2733:1: ( RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2733:1: ( RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2734:1: RULE_INT
            {
             before(grammarAccess.getDateAccess().getDayINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Date__DayAssignment_15403); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2743:1: rule__Date__MonthAssignment_3 : ( RULE_INT ) ;
    public final void rule__Date__MonthAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2747:1: ( ( RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2748:1: ( RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2748:1: ( RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2749:1: RULE_INT
            {
             before(grammarAccess.getDateAccess().getMonthINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Date__MonthAssignment_35434); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2758:1: rule__Date__YearAssignment_5 : ( RULE_INT ) ;
    public final void rule__Date__YearAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2762:1: ( ( RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2763:1: ( RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2763:1: ( RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2764:1: RULE_INT
            {
             before(grammarAccess.getDateAccess().getYearINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Date__YearAssignment_55465); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2773:1: rule__Price__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Price__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2777:1: ( ( RULE_STRING ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2778:1: ( RULE_STRING )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2778:1: ( RULE_STRING )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2779:1: RULE_STRING
            {
             before(grammarAccess.getPriceAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Price__ValueAssignment_15496); 
             after(grammarAccess.getPriceAccess().getValueSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2788:1: rule__Price__CurrencyAssignment_2 : ( ruleCurrency ) ;
    public final void rule__Price__CurrencyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2792:1: ( ( ruleCurrency ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2793:1: ( ruleCurrency )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2793:1: ( ruleCurrency )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2794:1: ruleCurrency
            {
             before(grammarAccess.getPriceAccess().getCurrencyCurrencyParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCurrency_in_rule__Price__CurrencyAssignment_25527);
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


    // $ANTLR start "rule__Feedlinks__PairsAssignment_1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2803:1: rule__Feedlinks__PairsAssignment_1 : ( rulePair ) ;
    public final void rule__Feedlinks__PairsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2807:1: ( ( rulePair ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2808:1: ( rulePair )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2808:1: ( rulePair )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2809:1: rulePair
            {
             before(grammarAccess.getFeedlinksAccess().getPairsPairParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePair_in_rule__Feedlinks__PairsAssignment_15558);
            rulePair();

            state._fsp--;

             after(grammarAccess.getFeedlinksAccess().getPairsPairParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feedlinks__PairsAssignment_1"


    // $ANTLR start "rule__Feedlinks__PairsAssignment_2_1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2818:1: rule__Feedlinks__PairsAssignment_2_1 : ( rulePair ) ;
    public final void rule__Feedlinks__PairsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2822:1: ( ( rulePair ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2823:1: ( rulePair )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2823:1: ( rulePair )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2824:1: rulePair
            {
             before(grammarAccess.getFeedlinksAccess().getPairsPairParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_rulePair_in_rule__Feedlinks__PairsAssignment_2_15589);
            rulePair();

            state._fsp--;

             after(grammarAccess.getFeedlinksAccess().getPairsPairParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feedlinks__PairsAssignment_2_1"


    // $ANTLR start "rule__Pair__KeyAssignment_1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2833:1: rule__Pair__KeyAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Pair__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2837:1: ( ( RULE_STRING ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2838:1: ( RULE_STRING )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2838:1: ( RULE_STRING )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2839:1: RULE_STRING
            {
             before(grammarAccess.getPairAccess().getKeySTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Pair__KeyAssignment_15620); 
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


    // $ANTLR start "rule__Pair__ValueAssignment_2"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2848:1: rule__Pair__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Pair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2852:1: ( ( RULE_STRING ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2853:1: ( RULE_STRING )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2853:1: ( RULE_STRING )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2854:1: RULE_STRING
            {
             before(grammarAccess.getPairAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Pair__ValueAssignment_25651); 
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
    public static final BitSet FOLLOW_ruleFormat_in_entryRuleFormat121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormat128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Alternatives_in_ruleFormat154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_in_entryRuleDate181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDate188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__Group__0_in_ruleDate214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLanguage_in_entryRuleLanguage241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLanguage248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Alternatives_in_ruleLanguage274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrice_in_entryRulePrice301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrice308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Price__Group__0_in_rulePrice334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCurrency_in_entryRuleCurrency361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCurrency368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Currency__Alternatives_in_ruleCurrency394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopics_in_entryRuleTopics421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopics428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Topics__Group__0_in_ruleTopics454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeedlinks_in_entryRuleFeedlinks481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeedlinks488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feedlinks__Group__0_in_ruleFeedlinks514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePair_in_entryRulePair541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePair548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pair__Group__0_in_rulePair574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_0__0_in_rule__Format__Alternatives610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Format__Alternatives629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Format__Alternatives649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Format__Alternatives669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Format__Alternatives689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Format__Alternatives709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_6__0_in_rule__Format__Alternatives728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group_0__0_in_rule__Language__Alternatives761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group_1__0_in_rule__Language__Alternatives779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Currency__Group_0__0_in_rule__Currency__Alternatives812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Currency__Group_1__0_in_rule__Currency__Alternatives830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__0__Impl_in_rule__Declaration__Group__0861 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Declaration__Group__1_in_rule__Declaration__Group__0864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Declaration__Group__0__Impl892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__1__Impl_in_rule__Declaration__Group__1923 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__2_in_rule__Declaration__Group__1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__NameAssignment_1_in_rule__Declaration__Group__1__Impl953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__2__Impl_in_rule__Declaration__Group__2983 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__3_in_rule__Declaration__Group__2986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Declaration__Group__2__Impl1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__3__Impl_in_rule__Declaration__Group__31045 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__4_in_rule__Declaration__Group__31048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__FeedlinksAssignment_3_in_rule__Declaration__Group__3__Impl1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__4__Impl_in_rule__Declaration__Group__41105 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__5_in_rule__Declaration__Group__41108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Declaration__Group__4__Impl1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__5__Impl_in_rule__Declaration__Group__51167 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__6_in_rule__Declaration__Group__51170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__TopicsAssignment_5_in_rule__Declaration__Group__5__Impl1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__6__Impl_in_rule__Declaration__Group__61227 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__7_in_rule__Declaration__Group__61230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Declaration__Group__6__Impl1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__7__Impl_in_rule__Declaration__Group__71289 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__8_in_rule__Declaration__Group__71292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__DateAssignment_7_in_rule__Declaration__Group__7__Impl1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__8__Impl_in_rule__Declaration__Group__81349 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Declaration__Group__9_in_rule__Declaration__Group__81352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Declaration__Group__8__Impl1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__9__Impl_in_rule__Declaration__Group__91411 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__10_in_rule__Declaration__Group__91414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__LocationAssignment_9_in_rule__Declaration__Group__9__Impl1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__10__Impl_in_rule__Declaration__Group__101471 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__11_in_rule__Declaration__Group__101474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Declaration__Group__10__Impl1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__11__Impl_in_rule__Declaration__Group__111533 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__12_in_rule__Declaration__Group__111536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__PriceAssignment_11_in_rule__Declaration__Group__11__Impl1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__12__Impl_in_rule__Declaration__Group__121593 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Declaration__Group__13_in_rule__Declaration__Group__121596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Declaration__Group__12__Impl1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__13__Impl_in_rule__Declaration__Group__131655 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__14_in_rule__Declaration__Group__131658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__VolumeAssignment_13_in_rule__Declaration__Group__13__Impl1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__14__Impl_in_rule__Declaration__Group__141715 = new BitSet(new long[]{0x0000001080000000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__15_in_rule__Declaration__Group__141718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Declaration__Group__14__Impl1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__15__Impl_in_rule__Declaration__Group__151777 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__16_in_rule__Declaration__Group__151780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__LanguageAssignment_15_in_rule__Declaration__Group__15__Impl1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__16__Impl_in_rule__Declaration__Group__161837 = new BitSet(new long[]{0x000000028000F800L});
    public static final BitSet FOLLOW_rule__Declaration__Group__17_in_rule__Declaration__Group__161840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Declaration__Group__16__Impl1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__17__Impl_in_rule__Declaration__Group__171899 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__18_in_rule__Declaration__Group__171902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__FormatAssignment_17_in_rule__Declaration__Group__17__Impl1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__18__Impl_in_rule__Declaration__Group__181959 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Declaration__Group__19_in_rule__Declaration__Group__181962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Declaration__Group__18__Impl1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__19__Impl_in_rule__Declaration__Group__192021 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__20_in_rule__Declaration__Group__192024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Article_cntAssignment_19_in_rule__Declaration__Group__19__Impl2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__20__Impl_in_rule__Declaration__Group__202081 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Declaration__Group__21_in_rule__Declaration__Group__202084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Declaration__Group__20__Impl2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__21__Impl_in_rule__Declaration__Group__212143 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__22_in_rule__Declaration__Group__212146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Article_char_minAssignment_21_in_rule__Declaration__Group__21__Impl2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__22__Impl_in_rule__Declaration__Group__222203 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Declaration__Group__23_in_rule__Declaration__Group__222206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Declaration__Group__22__Impl2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__23__Impl_in_rule__Declaration__Group__232265 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__24_in_rule__Declaration__Group__232268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Article_char_maxAssignment_23_in_rule__Declaration__Group__23__Impl2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__24__Impl_in_rule__Declaration__Group__242325 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Declaration__Group__25_in_rule__Declaration__Group__242328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Declaration__Group__24__Impl2356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__25__Impl_in_rule__Declaration__Group__252387 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__26_in_rule__Declaration__Group__252390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Article_imagesAssignment_25_in_rule__Declaration__Group__25__Impl2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__26__Impl_in_rule__Declaration__Group__262447 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Declaration__Group__27_in_rule__Declaration__Group__262450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Declaration__Group__26__Impl2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__27__Impl_in_rule__Declaration__Group__272509 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__28_in_rule__Declaration__Group__272512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Columns_cntAssignment_27_in_rule__Declaration__Group__27__Impl2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__28__Impl_in_rule__Declaration__Group__282569 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Declaration__Group__29_in_rule__Declaration__Group__282572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Declaration__Group__28__Impl2600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__29__Impl_in_rule__Declaration__Group__292631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Font_sizeAssignment_29_in_rule__Declaration__Group__29__Impl2658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_0__0__Impl_in_rule__Format__Group_0__02748 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Format__Group_0__1_in_rule__Format__Group_0__02751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Format__Group_0__0__Impl2779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_0__1__Impl_in_rule__Format__Group_0__12810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Format__Group_0__1__Impl2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_6__0__Impl_in_rule__Format__Group_6__02873 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Format__Group_6__1_in_rule__Format__Group_6__02876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Format__Group_6__0__Impl2904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_6__1__Impl_in_rule__Format__Group_6__12935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Format__Group_6__1__Impl2963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__Group__0__Impl_in_rule__Date__Group__02998 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Date__Group__1_in_rule__Date__Group__03001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Date__Group__0__Impl3029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__Group__1__Impl_in_rule__Date__Group__13060 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Date__Group__2_in_rule__Date__Group__13063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__DayAssignment_1_in_rule__Date__Group__1__Impl3090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__Group__2__Impl_in_rule__Date__Group__23120 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Date__Group__3_in_rule__Date__Group__23123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Date__Group__2__Impl3151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__Group__3__Impl_in_rule__Date__Group__33182 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Date__Group__4_in_rule__Date__Group__33185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__MonthAssignment_3_in_rule__Date__Group__3__Impl3212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__Group__4__Impl_in_rule__Date__Group__43242 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Date__Group__5_in_rule__Date__Group__43245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Date__Group__4__Impl3273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__Group__5__Impl_in_rule__Date__Group__53304 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Date__Group__6_in_rule__Date__Group__53307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__YearAssignment_5_in_rule__Date__Group__5__Impl3334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__Group__6__Impl_in_rule__Date__Group__63364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Date__Group__6__Impl3392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group_0__0__Impl_in_rule__Language__Group_0__03437 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Language__Group_0__1_in_rule__Language__Group_0__03440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Language__Group_0__0__Impl3468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group_0__1__Impl_in_rule__Language__Group_0__13499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Language__Group_0__1__Impl3527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group_1__0__Impl_in_rule__Language__Group_1__03562 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Language__Group_1__1_in_rule__Language__Group_1__03565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Language__Group_1__0__Impl3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group_1__1__Impl_in_rule__Language__Group_1__13624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Language__Group_1__1__Impl3652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Price__Group__0__Impl_in_rule__Price__Group__03687 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Price__Group__1_in_rule__Price__Group__03690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Price__Group__0__Impl3718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Price__Group__1__Impl_in_rule__Price__Group__13749 = new BitSet(new long[]{0x0000004080000000L});
    public static final BitSet FOLLOW_rule__Price__Group__2_in_rule__Price__Group__13752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Price__ValueAssignment_1_in_rule__Price__Group__1__Impl3779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Price__Group__2__Impl_in_rule__Price__Group__23809 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Price__Group__3_in_rule__Price__Group__23812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Price__CurrencyAssignment_2_in_rule__Price__Group__2__Impl3839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Price__Group__3__Impl_in_rule__Price__Group__33869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Price__Group__3__Impl3897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Currency__Group_0__0__Impl_in_rule__Currency__Group_0__03936 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Currency__Group_0__1_in_rule__Currency__Group_0__03939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Currency__Group_0__0__Impl3967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Currency__Group_0__1__Impl_in_rule__Currency__Group_0__13998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Currency__Group_0__1__Impl4026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Currency__Group_1__0__Impl_in_rule__Currency__Group_1__04061 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Currency__Group_1__1_in_rule__Currency__Group_1__04064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Currency__Group_1__0__Impl4092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Currency__Group_1__1__Impl_in_rule__Currency__Group_1__14123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Currency__Group_1__1__Impl4151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Topics__Group__0__Impl_in_rule__Topics__Group__04186 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Topics__Group__1_in_rule__Topics__Group__04189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Topics__Group__0__Impl4217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Topics__Group__1__Impl_in_rule__Topics__Group__14248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Topics__Group__1__Impl4276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feedlinks__Group__0__Impl_in_rule__Feedlinks__Group__04311 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Feedlinks__Group__1_in_rule__Feedlinks__Group__04314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Feedlinks__Group__0__Impl4342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feedlinks__Group__1__Impl_in_rule__Feedlinks__Group__14373 = new BitSet(new long[]{0x0000008400000000L});
    public static final BitSet FOLLOW_rule__Feedlinks__Group__2_in_rule__Feedlinks__Group__14376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feedlinks__PairsAssignment_1_in_rule__Feedlinks__Group__1__Impl4403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feedlinks__Group__2__Impl_in_rule__Feedlinks__Group__24433 = new BitSet(new long[]{0x0000008400000000L});
    public static final BitSet FOLLOW_rule__Feedlinks__Group__3_in_rule__Feedlinks__Group__24436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feedlinks__Group_2__0_in_rule__Feedlinks__Group__2__Impl4463 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__Feedlinks__Group__3__Impl_in_rule__Feedlinks__Group__34494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Feedlinks__Group__3__Impl4522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feedlinks__Group_2__0__Impl_in_rule__Feedlinks__Group_2__04561 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Feedlinks__Group_2__1_in_rule__Feedlinks__Group_2__04564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Feedlinks__Group_2__0__Impl4592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feedlinks__Group_2__1__Impl_in_rule__Feedlinks__Group_2__14623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feedlinks__PairsAssignment_2_1_in_rule__Feedlinks__Group_2__1__Impl4650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pair__Group__0__Impl_in_rule__Pair__Group__04684 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Pair__Group__1_in_rule__Pair__Group__04687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Pair__Group__0__Impl4715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pair__Group__1__Impl_in_rule__Pair__Group__14746 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Pair__Group__2_in_rule__Pair__Group__14749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pair__KeyAssignment_1_in_rule__Pair__Group__1__Impl4776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pair__Group__2__Impl_in_rule__Pair__Group__24806 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Pair__Group__3_in_rule__Pair__Group__24809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pair__ValueAssignment_2_in_rule__Pair__Group__2__Impl4836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pair__Group__3__Impl_in_rule__Pair__Group__34866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Pair__Group__3__Impl4894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Declaration__NameAssignment_14938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeedlinks_in_rule__Declaration__FeedlinksAssignment_34969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopics_in_rule__Declaration__TopicsAssignment_55000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_in_rule__Declaration__DateAssignment_75031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Declaration__LocationAssignment_95062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrice_in_rule__Declaration__PriceAssignment_115093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Declaration__VolumeAssignment_135124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLanguage_in_rule__Declaration__LanguageAssignment_155155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormat_in_rule__Declaration__FormatAssignment_175186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Declaration__Article_cntAssignment_195217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Declaration__Article_char_minAssignment_215248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Declaration__Article_char_maxAssignment_235279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Declaration__Article_imagesAssignment_255310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Declaration__Columns_cntAssignment_275341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Declaration__Font_sizeAssignment_295372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Date__DayAssignment_15403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Date__MonthAssignment_35434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Date__YearAssignment_55465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Price__ValueAssignment_15496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCurrency_in_rule__Price__CurrencyAssignment_25527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePair_in_rule__Feedlinks__PairsAssignment_15558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePair_in_rule__Feedlinks__PairsAssignment_2_15589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Pair__KeyAssignment_15620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Pair__ValueAssignment_25651 = new BitSet(new long[]{0x0000000000000002L});

}