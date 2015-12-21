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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'newspaper'", "'feed link'", "'topics'", "'{'", "'}'", "'price'", "'language'", "'format'", "'number of articles per topic'", "'number of words per article'", "'-'", "'number of columns'", "'font size'", "'date'", "'location'", "'volume'", "'number of images per article'", "'small'", "'medium'", "'large'", "'DIN A6'", "'DIN A5'", "'DIN A4'", "'DIN A3'", "'DIN A2'", "'DIN A1'", "'DIN A0'", "'English'", "'German'", "'Euro'", "'Dollar'", "'topic'", "', '"
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


    // $ANTLR start "entryRuleCurrency"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:228:1: entryRuleCurrency : ruleCurrency EOF ;
    public final void entryRuleCurrency() throws RecognitionException {
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:229:1: ( ruleCurrency EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:230:1: ruleCurrency EOF
            {
             before(grammarAccess.getCurrencyRule()); 
            pushFollow(FOLLOW_ruleCurrency_in_entryRuleCurrency421);
            ruleCurrency();

            state._fsp--;

             after(grammarAccess.getCurrencyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCurrency428); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:237:1: ruleCurrency : ( ( rule__Currency__Alternatives ) ) ;
    public final void ruleCurrency() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:241:2: ( ( ( rule__Currency__Alternatives ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:242:1: ( ( rule__Currency__Alternatives ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:242:1: ( ( rule__Currency__Alternatives ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:243:1: ( rule__Currency__Alternatives )
            {
             before(grammarAccess.getCurrencyAccess().getAlternatives()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:244:1: ( rule__Currency__Alternatives )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:244:2: rule__Currency__Alternatives
            {
            pushFollow(FOLLOW_rule__Currency__Alternatives_in_ruleCurrency454);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:256:1: entryRuleTopic : ruleTopic EOF ;
    public final void entryRuleTopic() throws RecognitionException {
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:257:1: ( ruleTopic EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:258:1: ruleTopic EOF
            {
             before(grammarAccess.getTopicRule()); 
            pushFollow(FOLLOW_ruleTopic_in_entryRuleTopic481);
            ruleTopic();

            state._fsp--;

             after(grammarAccess.getTopicRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTopic488); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:265:1: ruleTopic : ( ( rule__Topic__Group__0 ) ) ;
    public final void ruleTopic() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:269:2: ( ( ( rule__Topic__Group__0 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:270:1: ( ( rule__Topic__Group__0 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:270:1: ( ( rule__Topic__Group__0 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:271:1: ( rule__Topic__Group__0 )
            {
             before(grammarAccess.getTopicAccess().getGroup()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:272:1: ( rule__Topic__Group__0 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:272:2: rule__Topic__Group__0
            {
            pushFollow(FOLLOW_rule__Topic__Group__0_in_ruleTopic514);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:284:1: entryRuleTopicTag : ruleTopicTag EOF ;
    public final void entryRuleTopicTag() throws RecognitionException {
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:285:1: ( ruleTopicTag EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:286:1: ruleTopicTag EOF
            {
             before(grammarAccess.getTopicTagRule()); 
            pushFollow(FOLLOW_ruleTopicTag_in_entryRuleTopicTag541);
            ruleTopicTag();

            state._fsp--;

             after(grammarAccess.getTopicTagRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTopicTag548); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:293:1: ruleTopicTag : ( ( rule__TopicTag__ValueAssignment ) ) ;
    public final void ruleTopicTag() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:297:2: ( ( ( rule__TopicTag__ValueAssignment ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:298:1: ( ( rule__TopicTag__ValueAssignment ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:298:1: ( ( rule__TopicTag__ValueAssignment ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:299:1: ( rule__TopicTag__ValueAssignment )
            {
             before(grammarAccess.getTopicTagAccess().getValueAssignment()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:300:1: ( rule__TopicTag__ValueAssignment )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:300:2: rule__TopicTag__ValueAssignment
            {
            pushFollow(FOLLOW_rule__TopicTag__ValueAssignment_in_ruleTopicTag574);
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


    // $ANTLR start "entryRuleFeedlinks"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:312:1: entryRuleFeedlinks : ruleFeedlinks EOF ;
    public final void entryRuleFeedlinks() throws RecognitionException {
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:313:1: ( ruleFeedlinks EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:314:1: ruleFeedlinks EOF
            {
             before(grammarAccess.getFeedlinksRule()); 
            pushFollow(FOLLOW_ruleFeedlinks_in_entryRuleFeedlinks601);
            ruleFeedlinks();

            state._fsp--;

             after(grammarAccess.getFeedlinksRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeedlinks608); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:321:1: ruleFeedlinks : ( ( rule__Feedlinks__Group__0 ) ) ;
    public final void ruleFeedlinks() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:325:2: ( ( ( rule__Feedlinks__Group__0 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:326:1: ( ( rule__Feedlinks__Group__0 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:326:1: ( ( rule__Feedlinks__Group__0 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:327:1: ( rule__Feedlinks__Group__0 )
            {
             before(grammarAccess.getFeedlinksAccess().getGroup()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:328:1: ( rule__Feedlinks__Group__0 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:328:2: rule__Feedlinks__Group__0
            {
            pushFollow(FOLLOW_rule__Feedlinks__Group__0_in_ruleFeedlinks634);
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
            case 28:
                {
                alt1=1;
                }
                break;
            case 29:
                {
                alt1=2;
                }
                break;
            case 30:
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
            case 31:
                {
                alt2=1;
                }
                break;
            case 32:
                {
                alt2=2;
                }
                break;
            case 33:
                {
                alt2=3;
                }
                break;
            case 34:
                {
                alt2=4;
                }
                break;
            case 35:
                {
                alt2=5;
                }
                break;
            case 36:
                {
                alt2=6;
                }
                break;
            case 37:
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

            if ( (LA3_0==38) ) {
                alt3=1;
            }
            else if ( (LA3_0==39) ) {
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


    // $ANTLR start "rule__Currency__Alternatives"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:470:1: rule__Currency__Alternatives : ( ( ( rule__Currency__Group_0__0 ) ) | ( ( rule__Currency__Group_1__0 ) ) );
    public final void rule__Currency__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:474:1: ( ( ( rule__Currency__Group_0__0 ) ) | ( ( rule__Currency__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==40) ) {
                alt4=1;
            }
            else if ( (LA4_0==41) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:475:1: ( ( rule__Currency__Group_0__0 ) )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:475:1: ( ( rule__Currency__Group_0__0 ) )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:476:1: ( rule__Currency__Group_0__0 )
                    {
                     before(grammarAccess.getCurrencyAccess().getGroup_0()); 
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:477:1: ( rule__Currency__Group_0__0 )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:477:2: rule__Currency__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Currency__Group_0__0_in_rule__Currency__Alternatives991);
                    rule__Currency__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCurrencyAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:481:6: ( ( rule__Currency__Group_1__0 ) )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:481:6: ( ( rule__Currency__Group_1__0 ) )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:482:1: ( rule__Currency__Group_1__0 )
                    {
                     before(grammarAccess.getCurrencyAccess().getGroup_1()); 
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:483:1: ( rule__Currency__Group_1__0 )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:483:2: rule__Currency__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Currency__Group_1__0_in_rule__Currency__Alternatives1009);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:494:1: rule__Declaration__Group__0 : rule__Declaration__Group__0__Impl rule__Declaration__Group__1 ;
    public final void rule__Declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:498:1: ( rule__Declaration__Group__0__Impl rule__Declaration__Group__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:499:2: rule__Declaration__Group__0__Impl rule__Declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group__0__Impl_in_rule__Declaration__Group__01040);
            rule__Declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__1_in_rule__Declaration__Group__01043);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:506:1: rule__Declaration__Group__0__Impl : ( 'newspaper' ) ;
    public final void rule__Declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:510:1: ( ( 'newspaper' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:511:1: ( 'newspaper' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:511:1: ( 'newspaper' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:512:1: 'newspaper'
            {
             before(grammarAccess.getDeclarationAccess().getNewspaperKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Declaration__Group__0__Impl1071); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:525:1: rule__Declaration__Group__1 : rule__Declaration__Group__1__Impl rule__Declaration__Group__2 ;
    public final void rule__Declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:529:1: ( rule__Declaration__Group__1__Impl rule__Declaration__Group__2 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:530:2: rule__Declaration__Group__1__Impl rule__Declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Declaration__Group__1__Impl_in_rule__Declaration__Group__11102);
            rule__Declaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__2_in_rule__Declaration__Group__11105);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:537:1: rule__Declaration__Group__1__Impl : ( ( rule__Declaration__NameAssignment_1 ) ) ;
    public final void rule__Declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:541:1: ( ( ( rule__Declaration__NameAssignment_1 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:542:1: ( ( rule__Declaration__NameAssignment_1 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:542:1: ( ( rule__Declaration__NameAssignment_1 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:543:1: ( rule__Declaration__NameAssignment_1 )
            {
             before(grammarAccess.getDeclarationAccess().getNameAssignment_1()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:544:1: ( rule__Declaration__NameAssignment_1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:544:2: rule__Declaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Declaration__NameAssignment_1_in_rule__Declaration__Group__1__Impl1132);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:554:1: rule__Declaration__Group__2 : rule__Declaration__Group__2__Impl rule__Declaration__Group__3 ;
    public final void rule__Declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:558:1: ( rule__Declaration__Group__2__Impl rule__Declaration__Group__3 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:559:2: rule__Declaration__Group__2__Impl rule__Declaration__Group__3
            {
            pushFollow(FOLLOW_rule__Declaration__Group__2__Impl_in_rule__Declaration__Group__21162);
            rule__Declaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__3_in_rule__Declaration__Group__21165);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:566:1: rule__Declaration__Group__2__Impl : ( 'feed link' ) ;
    public final void rule__Declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:570:1: ( ( 'feed link' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:571:1: ( 'feed link' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:571:1: ( 'feed link' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:572:1: 'feed link'
            {
             before(grammarAccess.getDeclarationAccess().getFeedLinkKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Declaration__Group__2__Impl1193); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:585:1: rule__Declaration__Group__3 : rule__Declaration__Group__3__Impl rule__Declaration__Group__4 ;
    public final void rule__Declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:589:1: ( rule__Declaration__Group__3__Impl rule__Declaration__Group__4 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:590:2: rule__Declaration__Group__3__Impl rule__Declaration__Group__4
            {
            pushFollow(FOLLOW_rule__Declaration__Group__3__Impl_in_rule__Declaration__Group__31224);
            rule__Declaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__4_in_rule__Declaration__Group__31227);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:597:1: rule__Declaration__Group__3__Impl : ( ( rule__Declaration__FeedlinksAssignment_3 ) ) ;
    public final void rule__Declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:601:1: ( ( ( rule__Declaration__FeedlinksAssignment_3 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:602:1: ( ( rule__Declaration__FeedlinksAssignment_3 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:602:1: ( ( rule__Declaration__FeedlinksAssignment_3 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:603:1: ( rule__Declaration__FeedlinksAssignment_3 )
            {
             before(grammarAccess.getDeclarationAccess().getFeedlinksAssignment_3()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:604:1: ( rule__Declaration__FeedlinksAssignment_3 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:604:2: rule__Declaration__FeedlinksAssignment_3
            {
            pushFollow(FOLLOW_rule__Declaration__FeedlinksAssignment_3_in_rule__Declaration__Group__3__Impl1254);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:614:1: rule__Declaration__Group__4 : rule__Declaration__Group__4__Impl rule__Declaration__Group__5 ;
    public final void rule__Declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:618:1: ( rule__Declaration__Group__4__Impl rule__Declaration__Group__5 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:619:2: rule__Declaration__Group__4__Impl rule__Declaration__Group__5
            {
            pushFollow(FOLLOW_rule__Declaration__Group__4__Impl_in_rule__Declaration__Group__41284);
            rule__Declaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__5_in_rule__Declaration__Group__41287);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:626:1: rule__Declaration__Group__4__Impl : ( 'topics' ) ;
    public final void rule__Declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:630:1: ( ( 'topics' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:631:1: ( 'topics' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:631:1: ( 'topics' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:632:1: 'topics'
            {
             before(grammarAccess.getDeclarationAccess().getTopicsKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Declaration__Group__4__Impl1315); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:645:1: rule__Declaration__Group__5 : rule__Declaration__Group__5__Impl rule__Declaration__Group__6 ;
    public final void rule__Declaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:649:1: ( rule__Declaration__Group__5__Impl rule__Declaration__Group__6 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:650:2: rule__Declaration__Group__5__Impl rule__Declaration__Group__6
            {
            pushFollow(FOLLOW_rule__Declaration__Group__5__Impl_in_rule__Declaration__Group__51346);
            rule__Declaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__6_in_rule__Declaration__Group__51349);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:657:1: rule__Declaration__Group__5__Impl : ( '{' ) ;
    public final void rule__Declaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:661:1: ( ( '{' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:662:1: ( '{' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:662:1: ( '{' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:663:1: '{'
            {
             before(grammarAccess.getDeclarationAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__Declaration__Group__5__Impl1377); 
             after(grammarAccess.getDeclarationAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:676:1: rule__Declaration__Group__6 : rule__Declaration__Group__6__Impl rule__Declaration__Group__7 ;
    public final void rule__Declaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:680:1: ( rule__Declaration__Group__6__Impl rule__Declaration__Group__7 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:681:2: rule__Declaration__Group__6__Impl rule__Declaration__Group__7
            {
            pushFollow(FOLLOW_rule__Declaration__Group__6__Impl_in_rule__Declaration__Group__61408);
            rule__Declaration__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__7_in_rule__Declaration__Group__61411);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:688:1: rule__Declaration__Group__6__Impl : ( ( rule__Declaration__TopicsAssignment_6 ) ) ;
    public final void rule__Declaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:692:1: ( ( ( rule__Declaration__TopicsAssignment_6 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:693:1: ( ( rule__Declaration__TopicsAssignment_6 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:693:1: ( ( rule__Declaration__TopicsAssignment_6 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:694:1: ( rule__Declaration__TopicsAssignment_6 )
            {
             before(grammarAccess.getDeclarationAccess().getTopicsAssignment_6()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:695:1: ( rule__Declaration__TopicsAssignment_6 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:695:2: rule__Declaration__TopicsAssignment_6
            {
            pushFollow(FOLLOW_rule__Declaration__TopicsAssignment_6_in_rule__Declaration__Group__6__Impl1438);
            rule__Declaration__TopicsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getTopicsAssignment_6()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:705:1: rule__Declaration__Group__7 : rule__Declaration__Group__7__Impl rule__Declaration__Group__8 ;
    public final void rule__Declaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:709:1: ( rule__Declaration__Group__7__Impl rule__Declaration__Group__8 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:710:2: rule__Declaration__Group__7__Impl rule__Declaration__Group__8
            {
            pushFollow(FOLLOW_rule__Declaration__Group__7__Impl_in_rule__Declaration__Group__71468);
            rule__Declaration__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__8_in_rule__Declaration__Group__71471);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:717:1: rule__Declaration__Group__7__Impl : ( ( rule__Declaration__TopicsAssignment_7 )* ) ;
    public final void rule__Declaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:721:1: ( ( ( rule__Declaration__TopicsAssignment_7 )* ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:722:1: ( ( rule__Declaration__TopicsAssignment_7 )* )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:722:1: ( ( rule__Declaration__TopicsAssignment_7 )* )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:723:1: ( rule__Declaration__TopicsAssignment_7 )*
            {
             before(grammarAccess.getDeclarationAccess().getTopicsAssignment_7()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:724:1: ( rule__Declaration__TopicsAssignment_7 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==42) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:724:2: rule__Declaration__TopicsAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Declaration__TopicsAssignment_7_in_rule__Declaration__Group__7__Impl1498);
            	    rule__Declaration__TopicsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getDeclarationAccess().getTopicsAssignment_7()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:734:1: rule__Declaration__Group__8 : rule__Declaration__Group__8__Impl rule__Declaration__Group__9 ;
    public final void rule__Declaration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:738:1: ( rule__Declaration__Group__8__Impl rule__Declaration__Group__9 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:739:2: rule__Declaration__Group__8__Impl rule__Declaration__Group__9
            {
            pushFollow(FOLLOW_rule__Declaration__Group__8__Impl_in_rule__Declaration__Group__81529);
            rule__Declaration__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__9_in_rule__Declaration__Group__81532);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:746:1: rule__Declaration__Group__8__Impl : ( '}' ) ;
    public final void rule__Declaration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:750:1: ( ( '}' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:751:1: ( '}' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:751:1: ( '}' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:752:1: '}'
            {
             before(grammarAccess.getDeclarationAccess().getRightCurlyBracketKeyword_8()); 
            match(input,15,FOLLOW_15_in_rule__Declaration__Group__8__Impl1560); 
             after(grammarAccess.getDeclarationAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:765:1: rule__Declaration__Group__9 : rule__Declaration__Group__9__Impl rule__Declaration__Group__10 ;
    public final void rule__Declaration__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:769:1: ( rule__Declaration__Group__9__Impl rule__Declaration__Group__10 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:770:2: rule__Declaration__Group__9__Impl rule__Declaration__Group__10
            {
            pushFollow(FOLLOW_rule__Declaration__Group__9__Impl_in_rule__Declaration__Group__91591);
            rule__Declaration__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__10_in_rule__Declaration__Group__91594);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:777:1: rule__Declaration__Group__9__Impl : ( ( rule__Declaration__Group_9__0 )? ) ;
    public final void rule__Declaration__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:781:1: ( ( ( rule__Declaration__Group_9__0 )? ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:782:1: ( ( rule__Declaration__Group_9__0 )? )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:782:1: ( ( rule__Declaration__Group_9__0 )? )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:783:1: ( rule__Declaration__Group_9__0 )?
            {
             before(grammarAccess.getDeclarationAccess().getGroup_9()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:784:1: ( rule__Declaration__Group_9__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:784:2: rule__Declaration__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Declaration__Group_9__0_in_rule__Declaration__Group__9__Impl1621);
                    rule__Declaration__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeclarationAccess().getGroup_9()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:794:1: rule__Declaration__Group__10 : rule__Declaration__Group__10__Impl rule__Declaration__Group__11 ;
    public final void rule__Declaration__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:798:1: ( rule__Declaration__Group__10__Impl rule__Declaration__Group__11 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:799:2: rule__Declaration__Group__10__Impl rule__Declaration__Group__11
            {
            pushFollow(FOLLOW_rule__Declaration__Group__10__Impl_in_rule__Declaration__Group__101652);
            rule__Declaration__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__11_in_rule__Declaration__Group__101655);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:806:1: rule__Declaration__Group__10__Impl : ( ( rule__Declaration__Group_10__0 )? ) ;
    public final void rule__Declaration__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:810:1: ( ( ( rule__Declaration__Group_10__0 )? ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:811:1: ( ( rule__Declaration__Group_10__0 )? )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:811:1: ( ( rule__Declaration__Group_10__0 )? )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:812:1: ( rule__Declaration__Group_10__0 )?
            {
             before(grammarAccess.getDeclarationAccess().getGroup_10()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:813:1: ( rule__Declaration__Group_10__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:813:2: rule__Declaration__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__Declaration__Group_10__0_in_rule__Declaration__Group__10__Impl1682);
                    rule__Declaration__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeclarationAccess().getGroup_10()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:823:1: rule__Declaration__Group__11 : rule__Declaration__Group__11__Impl rule__Declaration__Group__12 ;
    public final void rule__Declaration__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:827:1: ( rule__Declaration__Group__11__Impl rule__Declaration__Group__12 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:828:2: rule__Declaration__Group__11__Impl rule__Declaration__Group__12
            {
            pushFollow(FOLLOW_rule__Declaration__Group__11__Impl_in_rule__Declaration__Group__111713);
            rule__Declaration__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__12_in_rule__Declaration__Group__111716);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:835:1: rule__Declaration__Group__11__Impl : ( 'price' ) ;
    public final void rule__Declaration__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:839:1: ( ( 'price' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:840:1: ( 'price' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:840:1: ( 'price' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:841:1: 'price'
            {
             before(grammarAccess.getDeclarationAccess().getPriceKeyword_11()); 
            match(input,16,FOLLOW_16_in_rule__Declaration__Group__11__Impl1744); 
             after(grammarAccess.getDeclarationAccess().getPriceKeyword_11()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:854:1: rule__Declaration__Group__12 : rule__Declaration__Group__12__Impl rule__Declaration__Group__13 ;
    public final void rule__Declaration__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:858:1: ( rule__Declaration__Group__12__Impl rule__Declaration__Group__13 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:859:2: rule__Declaration__Group__12__Impl rule__Declaration__Group__13
            {
            pushFollow(FOLLOW_rule__Declaration__Group__12__Impl_in_rule__Declaration__Group__121775);
            rule__Declaration__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__13_in_rule__Declaration__Group__121778);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:866:1: rule__Declaration__Group__12__Impl : ( ( rule__Declaration__PriceAssignment_12 ) ) ;
    public final void rule__Declaration__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:870:1: ( ( ( rule__Declaration__PriceAssignment_12 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:871:1: ( ( rule__Declaration__PriceAssignment_12 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:871:1: ( ( rule__Declaration__PriceAssignment_12 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:872:1: ( rule__Declaration__PriceAssignment_12 )
            {
             before(grammarAccess.getDeclarationAccess().getPriceAssignment_12()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:873:1: ( rule__Declaration__PriceAssignment_12 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:873:2: rule__Declaration__PriceAssignment_12
            {
            pushFollow(FOLLOW_rule__Declaration__PriceAssignment_12_in_rule__Declaration__Group__12__Impl1805);
            rule__Declaration__PriceAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getPriceAssignment_12()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:883:1: rule__Declaration__Group__13 : rule__Declaration__Group__13__Impl rule__Declaration__Group__14 ;
    public final void rule__Declaration__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:887:1: ( rule__Declaration__Group__13__Impl rule__Declaration__Group__14 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:888:2: rule__Declaration__Group__13__Impl rule__Declaration__Group__14
            {
            pushFollow(FOLLOW_rule__Declaration__Group__13__Impl_in_rule__Declaration__Group__131835);
            rule__Declaration__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__14_in_rule__Declaration__Group__131838);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:895:1: rule__Declaration__Group__13__Impl : ( ( rule__Declaration__Group_13__0 )? ) ;
    public final void rule__Declaration__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:899:1: ( ( ( rule__Declaration__Group_13__0 )? ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:900:1: ( ( rule__Declaration__Group_13__0 )? )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:900:1: ( ( rule__Declaration__Group_13__0 )? )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:901:1: ( rule__Declaration__Group_13__0 )?
            {
             before(grammarAccess.getDeclarationAccess().getGroup_13()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:902:1: ( rule__Declaration__Group_13__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:902:2: rule__Declaration__Group_13__0
                    {
                    pushFollow(FOLLOW_rule__Declaration__Group_13__0_in_rule__Declaration__Group__13__Impl1865);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:912:1: rule__Declaration__Group__14 : rule__Declaration__Group__14__Impl rule__Declaration__Group__15 ;
    public final void rule__Declaration__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:916:1: ( rule__Declaration__Group__14__Impl rule__Declaration__Group__15 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:917:2: rule__Declaration__Group__14__Impl rule__Declaration__Group__15
            {
            pushFollow(FOLLOW_rule__Declaration__Group__14__Impl_in_rule__Declaration__Group__141896);
            rule__Declaration__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__15_in_rule__Declaration__Group__141899);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:924:1: rule__Declaration__Group__14__Impl : ( 'language' ) ;
    public final void rule__Declaration__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:928:1: ( ( 'language' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:929:1: ( 'language' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:929:1: ( 'language' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:930:1: 'language'
            {
             before(grammarAccess.getDeclarationAccess().getLanguageKeyword_14()); 
            match(input,17,FOLLOW_17_in_rule__Declaration__Group__14__Impl1927); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:943:1: rule__Declaration__Group__15 : rule__Declaration__Group__15__Impl rule__Declaration__Group__16 ;
    public final void rule__Declaration__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:947:1: ( rule__Declaration__Group__15__Impl rule__Declaration__Group__16 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:948:2: rule__Declaration__Group__15__Impl rule__Declaration__Group__16
            {
            pushFollow(FOLLOW_rule__Declaration__Group__15__Impl_in_rule__Declaration__Group__151958);
            rule__Declaration__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__16_in_rule__Declaration__Group__151961);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:955:1: rule__Declaration__Group__15__Impl : ( ( rule__Declaration__LanguageAssignment_15 ) ) ;
    public final void rule__Declaration__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:959:1: ( ( ( rule__Declaration__LanguageAssignment_15 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:960:1: ( ( rule__Declaration__LanguageAssignment_15 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:960:1: ( ( rule__Declaration__LanguageAssignment_15 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:961:1: ( rule__Declaration__LanguageAssignment_15 )
            {
             before(grammarAccess.getDeclarationAccess().getLanguageAssignment_15()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:962:1: ( rule__Declaration__LanguageAssignment_15 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:962:2: rule__Declaration__LanguageAssignment_15
            {
            pushFollow(FOLLOW_rule__Declaration__LanguageAssignment_15_in_rule__Declaration__Group__15__Impl1988);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:972:1: rule__Declaration__Group__16 : rule__Declaration__Group__16__Impl rule__Declaration__Group__17 ;
    public final void rule__Declaration__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:976:1: ( rule__Declaration__Group__16__Impl rule__Declaration__Group__17 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:977:2: rule__Declaration__Group__16__Impl rule__Declaration__Group__17
            {
            pushFollow(FOLLOW_rule__Declaration__Group__16__Impl_in_rule__Declaration__Group__162018);
            rule__Declaration__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__17_in_rule__Declaration__Group__162021);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:984:1: rule__Declaration__Group__16__Impl : ( 'format' ) ;
    public final void rule__Declaration__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:988:1: ( ( 'format' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:989:1: ( 'format' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:989:1: ( 'format' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:990:1: 'format'
            {
             before(grammarAccess.getDeclarationAccess().getFormatKeyword_16()); 
            match(input,18,FOLLOW_18_in_rule__Declaration__Group__16__Impl2049); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1003:1: rule__Declaration__Group__17 : rule__Declaration__Group__17__Impl rule__Declaration__Group__18 ;
    public final void rule__Declaration__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1007:1: ( rule__Declaration__Group__17__Impl rule__Declaration__Group__18 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1008:2: rule__Declaration__Group__17__Impl rule__Declaration__Group__18
            {
            pushFollow(FOLLOW_rule__Declaration__Group__17__Impl_in_rule__Declaration__Group__172080);
            rule__Declaration__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__18_in_rule__Declaration__Group__172083);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1015:1: rule__Declaration__Group__17__Impl : ( ( rule__Declaration__FormatAssignment_17 ) ) ;
    public final void rule__Declaration__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1019:1: ( ( ( rule__Declaration__FormatAssignment_17 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1020:1: ( ( rule__Declaration__FormatAssignment_17 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1020:1: ( ( rule__Declaration__FormatAssignment_17 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1021:1: ( rule__Declaration__FormatAssignment_17 )
            {
             before(grammarAccess.getDeclarationAccess().getFormatAssignment_17()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1022:1: ( rule__Declaration__FormatAssignment_17 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1022:2: rule__Declaration__FormatAssignment_17
            {
            pushFollow(FOLLOW_rule__Declaration__FormatAssignment_17_in_rule__Declaration__Group__17__Impl2110);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1032:1: rule__Declaration__Group__18 : rule__Declaration__Group__18__Impl rule__Declaration__Group__19 ;
    public final void rule__Declaration__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1036:1: ( rule__Declaration__Group__18__Impl rule__Declaration__Group__19 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1037:2: rule__Declaration__Group__18__Impl rule__Declaration__Group__19
            {
            pushFollow(FOLLOW_rule__Declaration__Group__18__Impl_in_rule__Declaration__Group__182140);
            rule__Declaration__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__19_in_rule__Declaration__Group__182143);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1044:1: rule__Declaration__Group__18__Impl : ( 'number of articles per topic' ) ;
    public final void rule__Declaration__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1048:1: ( ( 'number of articles per topic' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1049:1: ( 'number of articles per topic' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1049:1: ( 'number of articles per topic' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1050:1: 'number of articles per topic'
            {
             before(grammarAccess.getDeclarationAccess().getNumberOfArticlesPerTopicKeyword_18()); 
            match(input,19,FOLLOW_19_in_rule__Declaration__Group__18__Impl2171); 
             after(grammarAccess.getDeclarationAccess().getNumberOfArticlesPerTopicKeyword_18()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1063:1: rule__Declaration__Group__19 : rule__Declaration__Group__19__Impl rule__Declaration__Group__20 ;
    public final void rule__Declaration__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1067:1: ( rule__Declaration__Group__19__Impl rule__Declaration__Group__20 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1068:2: rule__Declaration__Group__19__Impl rule__Declaration__Group__20
            {
            pushFollow(FOLLOW_rule__Declaration__Group__19__Impl_in_rule__Declaration__Group__192202);
            rule__Declaration__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__20_in_rule__Declaration__Group__192205);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1075:1: rule__Declaration__Group__19__Impl : ( ( rule__Declaration__Article_cntAssignment_19 ) ) ;
    public final void rule__Declaration__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1079:1: ( ( ( rule__Declaration__Article_cntAssignment_19 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1080:1: ( ( rule__Declaration__Article_cntAssignment_19 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1080:1: ( ( rule__Declaration__Article_cntAssignment_19 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1081:1: ( rule__Declaration__Article_cntAssignment_19 )
            {
             before(grammarAccess.getDeclarationAccess().getArticle_cntAssignment_19()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1082:1: ( rule__Declaration__Article_cntAssignment_19 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1082:2: rule__Declaration__Article_cntAssignment_19
            {
            pushFollow(FOLLOW_rule__Declaration__Article_cntAssignment_19_in_rule__Declaration__Group__19__Impl2232);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1092:1: rule__Declaration__Group__20 : rule__Declaration__Group__20__Impl rule__Declaration__Group__21 ;
    public final void rule__Declaration__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1096:1: ( rule__Declaration__Group__20__Impl rule__Declaration__Group__21 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1097:2: rule__Declaration__Group__20__Impl rule__Declaration__Group__21
            {
            pushFollow(FOLLOW_rule__Declaration__Group__20__Impl_in_rule__Declaration__Group__202262);
            rule__Declaration__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__21_in_rule__Declaration__Group__202265);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1104:1: rule__Declaration__Group__20__Impl : ( 'number of words per article' ) ;
    public final void rule__Declaration__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1108:1: ( ( 'number of words per article' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1109:1: ( 'number of words per article' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1109:1: ( 'number of words per article' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1110:1: 'number of words per article'
            {
             before(grammarAccess.getDeclarationAccess().getNumberOfWordsPerArticleKeyword_20()); 
            match(input,20,FOLLOW_20_in_rule__Declaration__Group__20__Impl2293); 
             after(grammarAccess.getDeclarationAccess().getNumberOfWordsPerArticleKeyword_20()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1123:1: rule__Declaration__Group__21 : rule__Declaration__Group__21__Impl rule__Declaration__Group__22 ;
    public final void rule__Declaration__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1127:1: ( rule__Declaration__Group__21__Impl rule__Declaration__Group__22 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1128:2: rule__Declaration__Group__21__Impl rule__Declaration__Group__22
            {
            pushFollow(FOLLOW_rule__Declaration__Group__21__Impl_in_rule__Declaration__Group__212324);
            rule__Declaration__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__22_in_rule__Declaration__Group__212327);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1135:1: rule__Declaration__Group__21__Impl : ( ( rule__Declaration__Article_char_minAssignment_21 ) ) ;
    public final void rule__Declaration__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1139:1: ( ( ( rule__Declaration__Article_char_minAssignment_21 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1140:1: ( ( rule__Declaration__Article_char_minAssignment_21 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1140:1: ( ( rule__Declaration__Article_char_minAssignment_21 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1141:1: ( rule__Declaration__Article_char_minAssignment_21 )
            {
             before(grammarAccess.getDeclarationAccess().getArticle_char_minAssignment_21()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1142:1: ( rule__Declaration__Article_char_minAssignment_21 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1142:2: rule__Declaration__Article_char_minAssignment_21
            {
            pushFollow(FOLLOW_rule__Declaration__Article_char_minAssignment_21_in_rule__Declaration__Group__21__Impl2354);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1152:1: rule__Declaration__Group__22 : rule__Declaration__Group__22__Impl rule__Declaration__Group__23 ;
    public final void rule__Declaration__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1156:1: ( rule__Declaration__Group__22__Impl rule__Declaration__Group__23 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1157:2: rule__Declaration__Group__22__Impl rule__Declaration__Group__23
            {
            pushFollow(FOLLOW_rule__Declaration__Group__22__Impl_in_rule__Declaration__Group__222384);
            rule__Declaration__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__23_in_rule__Declaration__Group__222387);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1164:1: rule__Declaration__Group__22__Impl : ( '-' ) ;
    public final void rule__Declaration__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1168:1: ( ( '-' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1169:1: ( '-' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1169:1: ( '-' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1170:1: '-'
            {
             before(grammarAccess.getDeclarationAccess().getHyphenMinusKeyword_22()); 
            match(input,21,FOLLOW_21_in_rule__Declaration__Group__22__Impl2415); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1183:1: rule__Declaration__Group__23 : rule__Declaration__Group__23__Impl rule__Declaration__Group__24 ;
    public final void rule__Declaration__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1187:1: ( rule__Declaration__Group__23__Impl rule__Declaration__Group__24 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1188:2: rule__Declaration__Group__23__Impl rule__Declaration__Group__24
            {
            pushFollow(FOLLOW_rule__Declaration__Group__23__Impl_in_rule__Declaration__Group__232446);
            rule__Declaration__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__24_in_rule__Declaration__Group__232449);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1195:1: rule__Declaration__Group__23__Impl : ( ( rule__Declaration__Article_char_maxAssignment_23 ) ) ;
    public final void rule__Declaration__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1199:1: ( ( ( rule__Declaration__Article_char_maxAssignment_23 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1200:1: ( ( rule__Declaration__Article_char_maxAssignment_23 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1200:1: ( ( rule__Declaration__Article_char_maxAssignment_23 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1201:1: ( rule__Declaration__Article_char_maxAssignment_23 )
            {
             before(grammarAccess.getDeclarationAccess().getArticle_char_maxAssignment_23()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1202:1: ( rule__Declaration__Article_char_maxAssignment_23 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1202:2: rule__Declaration__Article_char_maxAssignment_23
            {
            pushFollow(FOLLOW_rule__Declaration__Article_char_maxAssignment_23_in_rule__Declaration__Group__23__Impl2476);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1212:1: rule__Declaration__Group__24 : rule__Declaration__Group__24__Impl rule__Declaration__Group__25 ;
    public final void rule__Declaration__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1216:1: ( rule__Declaration__Group__24__Impl rule__Declaration__Group__25 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1217:2: rule__Declaration__Group__24__Impl rule__Declaration__Group__25
            {
            pushFollow(FOLLOW_rule__Declaration__Group__24__Impl_in_rule__Declaration__Group__242506);
            rule__Declaration__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__25_in_rule__Declaration__Group__242509);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1224:1: rule__Declaration__Group__24__Impl : ( ( rule__Declaration__Group_24__0 )? ) ;
    public final void rule__Declaration__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1228:1: ( ( ( rule__Declaration__Group_24__0 )? ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1229:1: ( ( rule__Declaration__Group_24__0 )? )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1229:1: ( ( rule__Declaration__Group_24__0 )? )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1230:1: ( rule__Declaration__Group_24__0 )?
            {
             before(grammarAccess.getDeclarationAccess().getGroup_24()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1231:1: ( rule__Declaration__Group_24__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1231:2: rule__Declaration__Group_24__0
                    {
                    pushFollow(FOLLOW_rule__Declaration__Group_24__0_in_rule__Declaration__Group__24__Impl2536);
                    rule__Declaration__Group_24__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeclarationAccess().getGroup_24()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1241:1: rule__Declaration__Group__25 : rule__Declaration__Group__25__Impl rule__Declaration__Group__26 ;
    public final void rule__Declaration__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1245:1: ( rule__Declaration__Group__25__Impl rule__Declaration__Group__26 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1246:2: rule__Declaration__Group__25__Impl rule__Declaration__Group__26
            {
            pushFollow(FOLLOW_rule__Declaration__Group__25__Impl_in_rule__Declaration__Group__252567);
            rule__Declaration__Group__25__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__26_in_rule__Declaration__Group__252570);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1253:1: rule__Declaration__Group__25__Impl : ( 'number of columns' ) ;
    public final void rule__Declaration__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1257:1: ( ( 'number of columns' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1258:1: ( 'number of columns' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1258:1: ( 'number of columns' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1259:1: 'number of columns'
            {
             before(grammarAccess.getDeclarationAccess().getNumberOfColumnsKeyword_25()); 
            match(input,22,FOLLOW_22_in_rule__Declaration__Group__25__Impl2598); 
             after(grammarAccess.getDeclarationAccess().getNumberOfColumnsKeyword_25()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1272:1: rule__Declaration__Group__26 : rule__Declaration__Group__26__Impl rule__Declaration__Group__27 ;
    public final void rule__Declaration__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1276:1: ( rule__Declaration__Group__26__Impl rule__Declaration__Group__27 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1277:2: rule__Declaration__Group__26__Impl rule__Declaration__Group__27
            {
            pushFollow(FOLLOW_rule__Declaration__Group__26__Impl_in_rule__Declaration__Group__262629);
            rule__Declaration__Group__26__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__27_in_rule__Declaration__Group__262632);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1284:1: rule__Declaration__Group__26__Impl : ( ( rule__Declaration__Columns_cntAssignment_26 ) ) ;
    public final void rule__Declaration__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1288:1: ( ( ( rule__Declaration__Columns_cntAssignment_26 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1289:1: ( ( rule__Declaration__Columns_cntAssignment_26 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1289:1: ( ( rule__Declaration__Columns_cntAssignment_26 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1290:1: ( rule__Declaration__Columns_cntAssignment_26 )
            {
             before(grammarAccess.getDeclarationAccess().getColumns_cntAssignment_26()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1291:1: ( rule__Declaration__Columns_cntAssignment_26 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1291:2: rule__Declaration__Columns_cntAssignment_26
            {
            pushFollow(FOLLOW_rule__Declaration__Columns_cntAssignment_26_in_rule__Declaration__Group__26__Impl2659);
            rule__Declaration__Columns_cntAssignment_26();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getColumns_cntAssignment_26()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1301:1: rule__Declaration__Group__27 : rule__Declaration__Group__27__Impl rule__Declaration__Group__28 ;
    public final void rule__Declaration__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1305:1: ( rule__Declaration__Group__27__Impl rule__Declaration__Group__28 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1306:2: rule__Declaration__Group__27__Impl rule__Declaration__Group__28
            {
            pushFollow(FOLLOW_rule__Declaration__Group__27__Impl_in_rule__Declaration__Group__272689);
            rule__Declaration__Group__27__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__28_in_rule__Declaration__Group__272692);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1313:1: rule__Declaration__Group__27__Impl : ( 'font size' ) ;
    public final void rule__Declaration__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1317:1: ( ( 'font size' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1318:1: ( 'font size' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1318:1: ( 'font size' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1319:1: 'font size'
            {
             before(grammarAccess.getDeclarationAccess().getFontSizeKeyword_27()); 
            match(input,23,FOLLOW_23_in_rule__Declaration__Group__27__Impl2720); 
             after(grammarAccess.getDeclarationAccess().getFontSizeKeyword_27()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1332:1: rule__Declaration__Group__28 : rule__Declaration__Group__28__Impl ;
    public final void rule__Declaration__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1336:1: ( rule__Declaration__Group__28__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1337:2: rule__Declaration__Group__28__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group__28__Impl_in_rule__Declaration__Group__282751);
            rule__Declaration__Group__28__Impl();

            state._fsp--;


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1343:1: rule__Declaration__Group__28__Impl : ( ( rule__Declaration__Font_sizeAssignment_28 ) ) ;
    public final void rule__Declaration__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1347:1: ( ( ( rule__Declaration__Font_sizeAssignment_28 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1348:1: ( ( rule__Declaration__Font_sizeAssignment_28 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1348:1: ( ( rule__Declaration__Font_sizeAssignment_28 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1349:1: ( rule__Declaration__Font_sizeAssignment_28 )
            {
             before(grammarAccess.getDeclarationAccess().getFont_sizeAssignment_28()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1350:1: ( rule__Declaration__Font_sizeAssignment_28 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1350:2: rule__Declaration__Font_sizeAssignment_28
            {
            pushFollow(FOLLOW_rule__Declaration__Font_sizeAssignment_28_in_rule__Declaration__Group__28__Impl2778);
            rule__Declaration__Font_sizeAssignment_28();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getFont_sizeAssignment_28()); 

            }


            }

        }
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


    // $ANTLR start "rule__Declaration__Group_9__0"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1418:1: rule__Declaration__Group_9__0 : rule__Declaration__Group_9__0__Impl rule__Declaration__Group_9__1 ;
    public final void rule__Declaration__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1422:1: ( rule__Declaration__Group_9__0__Impl rule__Declaration__Group_9__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1423:2: rule__Declaration__Group_9__0__Impl rule__Declaration__Group_9__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group_9__0__Impl_in_rule__Declaration__Group_9__02866);
            rule__Declaration__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group_9__1_in_rule__Declaration__Group_9__02869);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1430:1: rule__Declaration__Group_9__0__Impl : ( 'date' ) ;
    public final void rule__Declaration__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1434:1: ( ( 'date' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1435:1: ( 'date' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1435:1: ( 'date' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1436:1: 'date'
            {
             before(grammarAccess.getDeclarationAccess().getDateKeyword_9_0()); 
            match(input,24,FOLLOW_24_in_rule__Declaration__Group_9__0__Impl2897); 
             after(grammarAccess.getDeclarationAccess().getDateKeyword_9_0()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1449:1: rule__Declaration__Group_9__1 : rule__Declaration__Group_9__1__Impl ;
    public final void rule__Declaration__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1453:1: ( rule__Declaration__Group_9__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1454:2: rule__Declaration__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group_9__1__Impl_in_rule__Declaration__Group_9__12928);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1460:1: rule__Declaration__Group_9__1__Impl : ( ( rule__Declaration__DateAssignment_9_1 ) ) ;
    public final void rule__Declaration__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1464:1: ( ( ( rule__Declaration__DateAssignment_9_1 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1465:1: ( ( rule__Declaration__DateAssignment_9_1 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1465:1: ( ( rule__Declaration__DateAssignment_9_1 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1466:1: ( rule__Declaration__DateAssignment_9_1 )
            {
             before(grammarAccess.getDeclarationAccess().getDateAssignment_9_1()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1467:1: ( rule__Declaration__DateAssignment_9_1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1467:2: rule__Declaration__DateAssignment_9_1
            {
            pushFollow(FOLLOW_rule__Declaration__DateAssignment_9_1_in_rule__Declaration__Group_9__1__Impl2955);
            rule__Declaration__DateAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getDateAssignment_9_1()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1481:1: rule__Declaration__Group_10__0 : rule__Declaration__Group_10__0__Impl rule__Declaration__Group_10__1 ;
    public final void rule__Declaration__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1485:1: ( rule__Declaration__Group_10__0__Impl rule__Declaration__Group_10__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1486:2: rule__Declaration__Group_10__0__Impl rule__Declaration__Group_10__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group_10__0__Impl_in_rule__Declaration__Group_10__02989);
            rule__Declaration__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group_10__1_in_rule__Declaration__Group_10__02992);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1493:1: rule__Declaration__Group_10__0__Impl : ( 'location' ) ;
    public final void rule__Declaration__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1497:1: ( ( 'location' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1498:1: ( 'location' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1498:1: ( 'location' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1499:1: 'location'
            {
             before(grammarAccess.getDeclarationAccess().getLocationKeyword_10_0()); 
            match(input,25,FOLLOW_25_in_rule__Declaration__Group_10__0__Impl3020); 
             after(grammarAccess.getDeclarationAccess().getLocationKeyword_10_0()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1512:1: rule__Declaration__Group_10__1 : rule__Declaration__Group_10__1__Impl ;
    public final void rule__Declaration__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1516:1: ( rule__Declaration__Group_10__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1517:2: rule__Declaration__Group_10__1__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group_10__1__Impl_in_rule__Declaration__Group_10__13051);
            rule__Declaration__Group_10__1__Impl();

            state._fsp--;


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1523:1: rule__Declaration__Group_10__1__Impl : ( ( rule__Declaration__LocationAssignment_10_1 ) ) ;
    public final void rule__Declaration__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1527:1: ( ( ( rule__Declaration__LocationAssignment_10_1 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1528:1: ( ( rule__Declaration__LocationAssignment_10_1 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1528:1: ( ( rule__Declaration__LocationAssignment_10_1 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1529:1: ( rule__Declaration__LocationAssignment_10_1 )
            {
             before(grammarAccess.getDeclarationAccess().getLocationAssignment_10_1()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1530:1: ( rule__Declaration__LocationAssignment_10_1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1530:2: rule__Declaration__LocationAssignment_10_1
            {
            pushFollow(FOLLOW_rule__Declaration__LocationAssignment_10_1_in_rule__Declaration__Group_10__1__Impl3078);
            rule__Declaration__LocationAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getLocationAssignment_10_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Declaration__Group_13__0"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1544:1: rule__Declaration__Group_13__0 : rule__Declaration__Group_13__0__Impl rule__Declaration__Group_13__1 ;
    public final void rule__Declaration__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1548:1: ( rule__Declaration__Group_13__0__Impl rule__Declaration__Group_13__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1549:2: rule__Declaration__Group_13__0__Impl rule__Declaration__Group_13__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group_13__0__Impl_in_rule__Declaration__Group_13__03112);
            rule__Declaration__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group_13__1_in_rule__Declaration__Group_13__03115);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1556:1: rule__Declaration__Group_13__0__Impl : ( 'volume' ) ;
    public final void rule__Declaration__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1560:1: ( ( 'volume' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1561:1: ( 'volume' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1561:1: ( 'volume' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1562:1: 'volume'
            {
             before(grammarAccess.getDeclarationAccess().getVolumeKeyword_13_0()); 
            match(input,26,FOLLOW_26_in_rule__Declaration__Group_13__0__Impl3143); 
             after(grammarAccess.getDeclarationAccess().getVolumeKeyword_13_0()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1575:1: rule__Declaration__Group_13__1 : rule__Declaration__Group_13__1__Impl ;
    public final void rule__Declaration__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1579:1: ( rule__Declaration__Group_13__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1580:2: rule__Declaration__Group_13__1__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group_13__1__Impl_in_rule__Declaration__Group_13__13174);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1586:1: rule__Declaration__Group_13__1__Impl : ( ( rule__Declaration__VolumeAssignment_13_1 ) ) ;
    public final void rule__Declaration__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1590:1: ( ( ( rule__Declaration__VolumeAssignment_13_1 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1591:1: ( ( rule__Declaration__VolumeAssignment_13_1 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1591:1: ( ( rule__Declaration__VolumeAssignment_13_1 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1592:1: ( rule__Declaration__VolumeAssignment_13_1 )
            {
             before(grammarAccess.getDeclarationAccess().getVolumeAssignment_13_1()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1593:1: ( rule__Declaration__VolumeAssignment_13_1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1593:2: rule__Declaration__VolumeAssignment_13_1
            {
            pushFollow(FOLLOW_rule__Declaration__VolumeAssignment_13_1_in_rule__Declaration__Group_13__1__Impl3201);
            rule__Declaration__VolumeAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getVolumeAssignment_13_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Declaration__Group_24__0"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1607:1: rule__Declaration__Group_24__0 : rule__Declaration__Group_24__0__Impl rule__Declaration__Group_24__1 ;
    public final void rule__Declaration__Group_24__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1611:1: ( rule__Declaration__Group_24__0__Impl rule__Declaration__Group_24__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1612:2: rule__Declaration__Group_24__0__Impl rule__Declaration__Group_24__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group_24__0__Impl_in_rule__Declaration__Group_24__03235);
            rule__Declaration__Group_24__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group_24__1_in_rule__Declaration__Group_24__03238);
            rule__Declaration__Group_24__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_24__0"


    // $ANTLR start "rule__Declaration__Group_24__0__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1619:1: rule__Declaration__Group_24__0__Impl : ( 'number of images per article' ) ;
    public final void rule__Declaration__Group_24__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1623:1: ( ( 'number of images per article' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1624:1: ( 'number of images per article' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1624:1: ( 'number of images per article' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1625:1: 'number of images per article'
            {
             before(grammarAccess.getDeclarationAccess().getNumberOfImagesPerArticleKeyword_24_0()); 
            match(input,27,FOLLOW_27_in_rule__Declaration__Group_24__0__Impl3266); 
             after(grammarAccess.getDeclarationAccess().getNumberOfImagesPerArticleKeyword_24_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_24__0__Impl"


    // $ANTLR start "rule__Declaration__Group_24__1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1638:1: rule__Declaration__Group_24__1 : rule__Declaration__Group_24__1__Impl ;
    public final void rule__Declaration__Group_24__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1642:1: ( rule__Declaration__Group_24__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1643:2: rule__Declaration__Group_24__1__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group_24__1__Impl_in_rule__Declaration__Group_24__13297);
            rule__Declaration__Group_24__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_24__1"


    // $ANTLR start "rule__Declaration__Group_24__1__Impl"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1649:1: rule__Declaration__Group_24__1__Impl : ( ( rule__Declaration__Article_imagesAssignment_24_1 ) ) ;
    public final void rule__Declaration__Group_24__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1653:1: ( ( ( rule__Declaration__Article_imagesAssignment_24_1 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1654:1: ( ( rule__Declaration__Article_imagesAssignment_24_1 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1654:1: ( ( rule__Declaration__Article_imagesAssignment_24_1 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1655:1: ( rule__Declaration__Article_imagesAssignment_24_1 )
            {
             before(grammarAccess.getDeclarationAccess().getArticle_imagesAssignment_24_1()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1656:1: ( rule__Declaration__Article_imagesAssignment_24_1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1656:2: rule__Declaration__Article_imagesAssignment_24_1
            {
            pushFollow(FOLLOW_rule__Declaration__Article_imagesAssignment_24_1_in_rule__Declaration__Group_24__1__Impl3324);
            rule__Declaration__Article_imagesAssignment_24_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getArticle_imagesAssignment_24_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_24__1__Impl"


    // $ANTLR start "rule__FontSize__Group_0__0"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1670:1: rule__FontSize__Group_0__0 : rule__FontSize__Group_0__0__Impl rule__FontSize__Group_0__1 ;
    public final void rule__FontSize__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1674:1: ( rule__FontSize__Group_0__0__Impl rule__FontSize__Group_0__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1675:2: rule__FontSize__Group_0__0__Impl rule__FontSize__Group_0__1
            {
            pushFollow(FOLLOW_rule__FontSize__Group_0__0__Impl_in_rule__FontSize__Group_0__03358);
            rule__FontSize__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FontSize__Group_0__1_in_rule__FontSize__Group_0__03361);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1682:1: rule__FontSize__Group_0__0__Impl : ( () ) ;
    public final void rule__FontSize__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1686:1: ( ( () ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1687:1: ( () )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1687:1: ( () )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1688:1: ()
            {
             before(grammarAccess.getFontSizeAccess().getEStringAction_0_0()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1689:1: ()
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1691:1: 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1701:1: rule__FontSize__Group_0__1 : rule__FontSize__Group_0__1__Impl ;
    public final void rule__FontSize__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1705:1: ( rule__FontSize__Group_0__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1706:2: rule__FontSize__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__FontSize__Group_0__1__Impl_in_rule__FontSize__Group_0__13419);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1712:1: rule__FontSize__Group_0__1__Impl : ( 'small' ) ;
    public final void rule__FontSize__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1716:1: ( ( 'small' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1717:1: ( 'small' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1717:1: ( 'small' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1718:1: 'small'
            {
             before(grammarAccess.getFontSizeAccess().getSmallKeyword_0_1()); 
            match(input,28,FOLLOW_28_in_rule__FontSize__Group_0__1__Impl3447); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1735:1: rule__FontSize__Group_1__0 : rule__FontSize__Group_1__0__Impl rule__FontSize__Group_1__1 ;
    public final void rule__FontSize__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1739:1: ( rule__FontSize__Group_1__0__Impl rule__FontSize__Group_1__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1740:2: rule__FontSize__Group_1__0__Impl rule__FontSize__Group_1__1
            {
            pushFollow(FOLLOW_rule__FontSize__Group_1__0__Impl_in_rule__FontSize__Group_1__03482);
            rule__FontSize__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FontSize__Group_1__1_in_rule__FontSize__Group_1__03485);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1747:1: rule__FontSize__Group_1__0__Impl : ( () ) ;
    public final void rule__FontSize__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1751:1: ( ( () ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1752:1: ( () )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1752:1: ( () )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1753:1: ()
            {
             before(grammarAccess.getFontSizeAccess().getEStringAction_1_0()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1754:1: ()
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1756:1: 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1766:1: rule__FontSize__Group_1__1 : rule__FontSize__Group_1__1__Impl ;
    public final void rule__FontSize__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1770:1: ( rule__FontSize__Group_1__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1771:2: rule__FontSize__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FontSize__Group_1__1__Impl_in_rule__FontSize__Group_1__13543);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1777:1: rule__FontSize__Group_1__1__Impl : ( 'medium' ) ;
    public final void rule__FontSize__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1781:1: ( ( 'medium' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1782:1: ( 'medium' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1782:1: ( 'medium' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1783:1: 'medium'
            {
             before(grammarAccess.getFontSizeAccess().getMediumKeyword_1_1()); 
            match(input,29,FOLLOW_29_in_rule__FontSize__Group_1__1__Impl3571); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1800:1: rule__FontSize__Group_2__0 : rule__FontSize__Group_2__0__Impl rule__FontSize__Group_2__1 ;
    public final void rule__FontSize__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1804:1: ( rule__FontSize__Group_2__0__Impl rule__FontSize__Group_2__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1805:2: rule__FontSize__Group_2__0__Impl rule__FontSize__Group_2__1
            {
            pushFollow(FOLLOW_rule__FontSize__Group_2__0__Impl_in_rule__FontSize__Group_2__03606);
            rule__FontSize__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FontSize__Group_2__1_in_rule__FontSize__Group_2__03609);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1812:1: rule__FontSize__Group_2__0__Impl : ( () ) ;
    public final void rule__FontSize__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1816:1: ( ( () ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1817:1: ( () )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1817:1: ( () )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1818:1: ()
            {
             before(grammarAccess.getFontSizeAccess().getEStringAction_2_0()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1819:1: ()
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1821:1: 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1831:1: rule__FontSize__Group_2__1 : rule__FontSize__Group_2__1__Impl ;
    public final void rule__FontSize__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1835:1: ( rule__FontSize__Group_2__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1836:2: rule__FontSize__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__FontSize__Group_2__1__Impl_in_rule__FontSize__Group_2__13667);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1842:1: rule__FontSize__Group_2__1__Impl : ( 'large' ) ;
    public final void rule__FontSize__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1846:1: ( ( 'large' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1847:1: ( 'large' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1847:1: ( 'large' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1848:1: 'large'
            {
             before(grammarAccess.getFontSizeAccess().getLargeKeyword_2_1()); 
            match(input,30,FOLLOW_30_in_rule__FontSize__Group_2__1__Impl3695); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1865:1: rule__Format__Group_0__0 : rule__Format__Group_0__0__Impl rule__Format__Group_0__1 ;
    public final void rule__Format__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1869:1: ( rule__Format__Group_0__0__Impl rule__Format__Group_0__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1870:2: rule__Format__Group_0__0__Impl rule__Format__Group_0__1
            {
            pushFollow(FOLLOW_rule__Format__Group_0__0__Impl_in_rule__Format__Group_0__03730);
            rule__Format__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Format__Group_0__1_in_rule__Format__Group_0__03733);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1877:1: rule__Format__Group_0__0__Impl : ( () ) ;
    public final void rule__Format__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1881:1: ( ( () ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1882:1: ( () )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1882:1: ( () )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1883:1: ()
            {
             before(grammarAccess.getFormatAccess().getEStringAction_0_0()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1884:1: ()
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1886:1: 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1896:1: rule__Format__Group_0__1 : rule__Format__Group_0__1__Impl ;
    public final void rule__Format__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1900:1: ( rule__Format__Group_0__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1901:2: rule__Format__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Format__Group_0__1__Impl_in_rule__Format__Group_0__13791);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1907:1: rule__Format__Group_0__1__Impl : ( 'DIN A6' ) ;
    public final void rule__Format__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1911:1: ( ( 'DIN A6' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1912:1: ( 'DIN A6' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1912:1: ( 'DIN A6' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1913:1: 'DIN A6'
            {
             before(grammarAccess.getFormatAccess().getDINA6Keyword_0_1()); 
            match(input,31,FOLLOW_31_in_rule__Format__Group_0__1__Impl3819); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1930:1: rule__Format__Group_1__0 : rule__Format__Group_1__0__Impl rule__Format__Group_1__1 ;
    public final void rule__Format__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1934:1: ( rule__Format__Group_1__0__Impl rule__Format__Group_1__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1935:2: rule__Format__Group_1__0__Impl rule__Format__Group_1__1
            {
            pushFollow(FOLLOW_rule__Format__Group_1__0__Impl_in_rule__Format__Group_1__03854);
            rule__Format__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Format__Group_1__1_in_rule__Format__Group_1__03857);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1942:1: rule__Format__Group_1__0__Impl : ( () ) ;
    public final void rule__Format__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1946:1: ( ( () ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1947:1: ( () )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1947:1: ( () )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1948:1: ()
            {
             before(grammarAccess.getFormatAccess().getEStringAction_1_0()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1949:1: ()
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1951:1: 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1961:1: rule__Format__Group_1__1 : rule__Format__Group_1__1__Impl ;
    public final void rule__Format__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1965:1: ( rule__Format__Group_1__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1966:2: rule__Format__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Format__Group_1__1__Impl_in_rule__Format__Group_1__13915);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1972:1: rule__Format__Group_1__1__Impl : ( 'DIN A5' ) ;
    public final void rule__Format__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1976:1: ( ( 'DIN A5' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1977:1: ( 'DIN A5' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1977:1: ( 'DIN A5' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1978:1: 'DIN A5'
            {
             before(grammarAccess.getFormatAccess().getDINA5Keyword_1_1()); 
            match(input,32,FOLLOW_32_in_rule__Format__Group_1__1__Impl3943); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1995:1: rule__Format__Group_2__0 : rule__Format__Group_2__0__Impl rule__Format__Group_2__1 ;
    public final void rule__Format__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1999:1: ( rule__Format__Group_2__0__Impl rule__Format__Group_2__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2000:2: rule__Format__Group_2__0__Impl rule__Format__Group_2__1
            {
            pushFollow(FOLLOW_rule__Format__Group_2__0__Impl_in_rule__Format__Group_2__03978);
            rule__Format__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Format__Group_2__1_in_rule__Format__Group_2__03981);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2007:1: rule__Format__Group_2__0__Impl : ( () ) ;
    public final void rule__Format__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2011:1: ( ( () ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2012:1: ( () )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2012:1: ( () )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2013:1: ()
            {
             before(grammarAccess.getFormatAccess().getEStringAction_2_0()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2014:1: ()
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2016:1: 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2026:1: rule__Format__Group_2__1 : rule__Format__Group_2__1__Impl ;
    public final void rule__Format__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2030:1: ( rule__Format__Group_2__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2031:2: rule__Format__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Format__Group_2__1__Impl_in_rule__Format__Group_2__14039);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2037:1: rule__Format__Group_2__1__Impl : ( 'DIN A4' ) ;
    public final void rule__Format__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2041:1: ( ( 'DIN A4' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2042:1: ( 'DIN A4' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2042:1: ( 'DIN A4' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2043:1: 'DIN A4'
            {
             before(grammarAccess.getFormatAccess().getDINA4Keyword_2_1()); 
            match(input,33,FOLLOW_33_in_rule__Format__Group_2__1__Impl4067); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2060:1: rule__Format__Group_3__0 : rule__Format__Group_3__0__Impl rule__Format__Group_3__1 ;
    public final void rule__Format__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2064:1: ( rule__Format__Group_3__0__Impl rule__Format__Group_3__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2065:2: rule__Format__Group_3__0__Impl rule__Format__Group_3__1
            {
            pushFollow(FOLLOW_rule__Format__Group_3__0__Impl_in_rule__Format__Group_3__04102);
            rule__Format__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Format__Group_3__1_in_rule__Format__Group_3__04105);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2072:1: rule__Format__Group_3__0__Impl : ( () ) ;
    public final void rule__Format__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2076:1: ( ( () ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2077:1: ( () )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2077:1: ( () )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2078:1: ()
            {
             before(grammarAccess.getFormatAccess().getEStringAction_3_0()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2079:1: ()
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2081:1: 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2091:1: rule__Format__Group_3__1 : rule__Format__Group_3__1__Impl ;
    public final void rule__Format__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2095:1: ( rule__Format__Group_3__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2096:2: rule__Format__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Format__Group_3__1__Impl_in_rule__Format__Group_3__14163);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2102:1: rule__Format__Group_3__1__Impl : ( 'DIN A3' ) ;
    public final void rule__Format__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2106:1: ( ( 'DIN A3' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2107:1: ( 'DIN A3' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2107:1: ( 'DIN A3' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2108:1: 'DIN A3'
            {
             before(grammarAccess.getFormatAccess().getDINA3Keyword_3_1()); 
            match(input,34,FOLLOW_34_in_rule__Format__Group_3__1__Impl4191); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2125:1: rule__Format__Group_4__0 : rule__Format__Group_4__0__Impl rule__Format__Group_4__1 ;
    public final void rule__Format__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2129:1: ( rule__Format__Group_4__0__Impl rule__Format__Group_4__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2130:2: rule__Format__Group_4__0__Impl rule__Format__Group_4__1
            {
            pushFollow(FOLLOW_rule__Format__Group_4__0__Impl_in_rule__Format__Group_4__04226);
            rule__Format__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Format__Group_4__1_in_rule__Format__Group_4__04229);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2137:1: rule__Format__Group_4__0__Impl : ( () ) ;
    public final void rule__Format__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2141:1: ( ( () ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2142:1: ( () )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2142:1: ( () )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2143:1: ()
            {
             before(grammarAccess.getFormatAccess().getEStringAction_4_0()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2144:1: ()
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2146:1: 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2156:1: rule__Format__Group_4__1 : rule__Format__Group_4__1__Impl ;
    public final void rule__Format__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2160:1: ( rule__Format__Group_4__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2161:2: rule__Format__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Format__Group_4__1__Impl_in_rule__Format__Group_4__14287);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2167:1: rule__Format__Group_4__1__Impl : ( 'DIN A2' ) ;
    public final void rule__Format__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2171:1: ( ( 'DIN A2' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2172:1: ( 'DIN A2' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2172:1: ( 'DIN A2' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2173:1: 'DIN A2'
            {
             before(grammarAccess.getFormatAccess().getDINA2Keyword_4_1()); 
            match(input,35,FOLLOW_35_in_rule__Format__Group_4__1__Impl4315); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2190:1: rule__Format__Group_5__0 : rule__Format__Group_5__0__Impl rule__Format__Group_5__1 ;
    public final void rule__Format__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2194:1: ( rule__Format__Group_5__0__Impl rule__Format__Group_5__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2195:2: rule__Format__Group_5__0__Impl rule__Format__Group_5__1
            {
            pushFollow(FOLLOW_rule__Format__Group_5__0__Impl_in_rule__Format__Group_5__04350);
            rule__Format__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Format__Group_5__1_in_rule__Format__Group_5__04353);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2202:1: rule__Format__Group_5__0__Impl : ( () ) ;
    public final void rule__Format__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2206:1: ( ( () ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2207:1: ( () )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2207:1: ( () )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2208:1: ()
            {
             before(grammarAccess.getFormatAccess().getEStringAction_5_0()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2209:1: ()
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2211:1: 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2221:1: rule__Format__Group_5__1 : rule__Format__Group_5__1__Impl ;
    public final void rule__Format__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2225:1: ( rule__Format__Group_5__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2226:2: rule__Format__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Format__Group_5__1__Impl_in_rule__Format__Group_5__14411);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2232:1: rule__Format__Group_5__1__Impl : ( 'DIN A1' ) ;
    public final void rule__Format__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2236:1: ( ( 'DIN A1' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2237:1: ( 'DIN A1' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2237:1: ( 'DIN A1' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2238:1: 'DIN A1'
            {
             before(grammarAccess.getFormatAccess().getDINA1Keyword_5_1()); 
            match(input,36,FOLLOW_36_in_rule__Format__Group_5__1__Impl4439); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2255:1: rule__Format__Group_6__0 : rule__Format__Group_6__0__Impl rule__Format__Group_6__1 ;
    public final void rule__Format__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2259:1: ( rule__Format__Group_6__0__Impl rule__Format__Group_6__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2260:2: rule__Format__Group_6__0__Impl rule__Format__Group_6__1
            {
            pushFollow(FOLLOW_rule__Format__Group_6__0__Impl_in_rule__Format__Group_6__04474);
            rule__Format__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Format__Group_6__1_in_rule__Format__Group_6__04477);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2267:1: rule__Format__Group_6__0__Impl : ( () ) ;
    public final void rule__Format__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2271:1: ( ( () ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2272:1: ( () )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2272:1: ( () )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2273:1: ()
            {
             before(grammarAccess.getFormatAccess().getEStringAction_6_0()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2274:1: ()
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2276:1: 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2286:1: rule__Format__Group_6__1 : rule__Format__Group_6__1__Impl ;
    public final void rule__Format__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2290:1: ( rule__Format__Group_6__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2291:2: rule__Format__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Format__Group_6__1__Impl_in_rule__Format__Group_6__14535);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2297:1: rule__Format__Group_6__1__Impl : ( 'DIN A0' ) ;
    public final void rule__Format__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2301:1: ( ( 'DIN A0' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2302:1: ( 'DIN A0' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2302:1: ( 'DIN A0' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2303:1: 'DIN A0'
            {
             before(grammarAccess.getFormatAccess().getDINA0Keyword_6_1()); 
            match(input,37,FOLLOW_37_in_rule__Format__Group_6__1__Impl4563); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2320:1: rule__Date__Group__0 : rule__Date__Group__0__Impl rule__Date__Group__1 ;
    public final void rule__Date__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2324:1: ( rule__Date__Group__0__Impl rule__Date__Group__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2325:2: rule__Date__Group__0__Impl rule__Date__Group__1
            {
            pushFollow(FOLLOW_rule__Date__Group__0__Impl_in_rule__Date__Group__04598);
            rule__Date__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Date__Group__1_in_rule__Date__Group__04601);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2332:1: rule__Date__Group__0__Impl : ( '{' ) ;
    public final void rule__Date__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2336:1: ( ( '{' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2337:1: ( '{' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2337:1: ( '{' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2338:1: '{'
            {
             before(grammarAccess.getDateAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Date__Group__0__Impl4629); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2351:1: rule__Date__Group__1 : rule__Date__Group__1__Impl rule__Date__Group__2 ;
    public final void rule__Date__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2355:1: ( rule__Date__Group__1__Impl rule__Date__Group__2 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2356:2: rule__Date__Group__1__Impl rule__Date__Group__2
            {
            pushFollow(FOLLOW_rule__Date__Group__1__Impl_in_rule__Date__Group__14660);
            rule__Date__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Date__Group__2_in_rule__Date__Group__14663);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2363:1: rule__Date__Group__1__Impl : ( ( rule__Date__DayAssignment_1 ) ) ;
    public final void rule__Date__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2367:1: ( ( ( rule__Date__DayAssignment_1 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2368:1: ( ( rule__Date__DayAssignment_1 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2368:1: ( ( rule__Date__DayAssignment_1 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2369:1: ( rule__Date__DayAssignment_1 )
            {
             before(grammarAccess.getDateAccess().getDayAssignment_1()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2370:1: ( rule__Date__DayAssignment_1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2370:2: rule__Date__DayAssignment_1
            {
            pushFollow(FOLLOW_rule__Date__DayAssignment_1_in_rule__Date__Group__1__Impl4690);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2380:1: rule__Date__Group__2 : rule__Date__Group__2__Impl rule__Date__Group__3 ;
    public final void rule__Date__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2384:1: ( rule__Date__Group__2__Impl rule__Date__Group__3 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2385:2: rule__Date__Group__2__Impl rule__Date__Group__3
            {
            pushFollow(FOLLOW_rule__Date__Group__2__Impl_in_rule__Date__Group__24720);
            rule__Date__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Date__Group__3_in_rule__Date__Group__24723);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2392:1: rule__Date__Group__2__Impl : ( '-' ) ;
    public final void rule__Date__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2396:1: ( ( '-' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2397:1: ( '-' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2397:1: ( '-' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2398:1: '-'
            {
             before(grammarAccess.getDateAccess().getHyphenMinusKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__Date__Group__2__Impl4751); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2411:1: rule__Date__Group__3 : rule__Date__Group__3__Impl rule__Date__Group__4 ;
    public final void rule__Date__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2415:1: ( rule__Date__Group__3__Impl rule__Date__Group__4 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2416:2: rule__Date__Group__3__Impl rule__Date__Group__4
            {
            pushFollow(FOLLOW_rule__Date__Group__3__Impl_in_rule__Date__Group__34782);
            rule__Date__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Date__Group__4_in_rule__Date__Group__34785);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2423:1: rule__Date__Group__3__Impl : ( ( rule__Date__MonthAssignment_3 ) ) ;
    public final void rule__Date__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2427:1: ( ( ( rule__Date__MonthAssignment_3 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2428:1: ( ( rule__Date__MonthAssignment_3 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2428:1: ( ( rule__Date__MonthAssignment_3 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2429:1: ( rule__Date__MonthAssignment_3 )
            {
             before(grammarAccess.getDateAccess().getMonthAssignment_3()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2430:1: ( rule__Date__MonthAssignment_3 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2430:2: rule__Date__MonthAssignment_3
            {
            pushFollow(FOLLOW_rule__Date__MonthAssignment_3_in_rule__Date__Group__3__Impl4812);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2440:1: rule__Date__Group__4 : rule__Date__Group__4__Impl rule__Date__Group__5 ;
    public final void rule__Date__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2444:1: ( rule__Date__Group__4__Impl rule__Date__Group__5 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2445:2: rule__Date__Group__4__Impl rule__Date__Group__5
            {
            pushFollow(FOLLOW_rule__Date__Group__4__Impl_in_rule__Date__Group__44842);
            rule__Date__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Date__Group__5_in_rule__Date__Group__44845);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2452:1: rule__Date__Group__4__Impl : ( '-' ) ;
    public final void rule__Date__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2456:1: ( ( '-' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2457:1: ( '-' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2457:1: ( '-' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2458:1: '-'
            {
             before(grammarAccess.getDateAccess().getHyphenMinusKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__Date__Group__4__Impl4873); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2471:1: rule__Date__Group__5 : rule__Date__Group__5__Impl rule__Date__Group__6 ;
    public final void rule__Date__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2475:1: ( rule__Date__Group__5__Impl rule__Date__Group__6 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2476:2: rule__Date__Group__5__Impl rule__Date__Group__6
            {
            pushFollow(FOLLOW_rule__Date__Group__5__Impl_in_rule__Date__Group__54904);
            rule__Date__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Date__Group__6_in_rule__Date__Group__54907);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2483:1: rule__Date__Group__5__Impl : ( ( rule__Date__YearAssignment_5 ) ) ;
    public final void rule__Date__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2487:1: ( ( ( rule__Date__YearAssignment_5 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2488:1: ( ( rule__Date__YearAssignment_5 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2488:1: ( ( rule__Date__YearAssignment_5 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2489:1: ( rule__Date__YearAssignment_5 )
            {
             before(grammarAccess.getDateAccess().getYearAssignment_5()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2490:1: ( rule__Date__YearAssignment_5 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2490:2: rule__Date__YearAssignment_5
            {
            pushFollow(FOLLOW_rule__Date__YearAssignment_5_in_rule__Date__Group__5__Impl4934);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2500:1: rule__Date__Group__6 : rule__Date__Group__6__Impl ;
    public final void rule__Date__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2504:1: ( rule__Date__Group__6__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2505:2: rule__Date__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Date__Group__6__Impl_in_rule__Date__Group__64964);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2511:1: rule__Date__Group__6__Impl : ( '}' ) ;
    public final void rule__Date__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2515:1: ( ( '}' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2516:1: ( '}' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2516:1: ( '}' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2517:1: '}'
            {
             before(grammarAccess.getDateAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FOLLOW_15_in_rule__Date__Group__6__Impl4992); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2544:1: rule__Language__Group_0__0 : rule__Language__Group_0__0__Impl rule__Language__Group_0__1 ;
    public final void rule__Language__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2548:1: ( rule__Language__Group_0__0__Impl rule__Language__Group_0__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2549:2: rule__Language__Group_0__0__Impl rule__Language__Group_0__1
            {
            pushFollow(FOLLOW_rule__Language__Group_0__0__Impl_in_rule__Language__Group_0__05037);
            rule__Language__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Language__Group_0__1_in_rule__Language__Group_0__05040);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2556:1: rule__Language__Group_0__0__Impl : ( () ) ;
    public final void rule__Language__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2560:1: ( ( () ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2561:1: ( () )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2561:1: ( () )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2562:1: ()
            {
             before(grammarAccess.getLanguageAccess().getEStringAction_0_0()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2563:1: ()
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2565:1: 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2575:1: rule__Language__Group_0__1 : rule__Language__Group_0__1__Impl ;
    public final void rule__Language__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2579:1: ( rule__Language__Group_0__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2580:2: rule__Language__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Language__Group_0__1__Impl_in_rule__Language__Group_0__15098);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2586:1: rule__Language__Group_0__1__Impl : ( 'English' ) ;
    public final void rule__Language__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2590:1: ( ( 'English' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2591:1: ( 'English' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2591:1: ( 'English' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2592:1: 'English'
            {
             before(grammarAccess.getLanguageAccess().getEnglishKeyword_0_1()); 
            match(input,38,FOLLOW_38_in_rule__Language__Group_0__1__Impl5126); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2609:1: rule__Language__Group_1__0 : rule__Language__Group_1__0__Impl rule__Language__Group_1__1 ;
    public final void rule__Language__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2613:1: ( rule__Language__Group_1__0__Impl rule__Language__Group_1__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2614:2: rule__Language__Group_1__0__Impl rule__Language__Group_1__1
            {
            pushFollow(FOLLOW_rule__Language__Group_1__0__Impl_in_rule__Language__Group_1__05161);
            rule__Language__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Language__Group_1__1_in_rule__Language__Group_1__05164);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2621:1: rule__Language__Group_1__0__Impl : ( () ) ;
    public final void rule__Language__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2625:1: ( ( () ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2626:1: ( () )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2626:1: ( () )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2627:1: ()
            {
             before(grammarAccess.getLanguageAccess().getEStringAction_1_0()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2628:1: ()
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2630:1: 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2640:1: rule__Language__Group_1__1 : rule__Language__Group_1__1__Impl ;
    public final void rule__Language__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2644:1: ( rule__Language__Group_1__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2645:2: rule__Language__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Language__Group_1__1__Impl_in_rule__Language__Group_1__15222);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2651:1: rule__Language__Group_1__1__Impl : ( 'German' ) ;
    public final void rule__Language__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2655:1: ( ( 'German' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2656:1: ( 'German' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2656:1: ( 'German' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2657:1: 'German'
            {
             before(grammarAccess.getLanguageAccess().getGermanKeyword_1_1()); 
            match(input,39,FOLLOW_39_in_rule__Language__Group_1__1__Impl5250); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2674:1: rule__Price__Group__0 : rule__Price__Group__0__Impl rule__Price__Group__1 ;
    public final void rule__Price__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2678:1: ( rule__Price__Group__0__Impl rule__Price__Group__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2679:2: rule__Price__Group__0__Impl rule__Price__Group__1
            {
            pushFollow(FOLLOW_rule__Price__Group__0__Impl_in_rule__Price__Group__05285);
            rule__Price__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Price__Group__1_in_rule__Price__Group__05288);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2686:1: rule__Price__Group__0__Impl : ( '{' ) ;
    public final void rule__Price__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2690:1: ( ( '{' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2691:1: ( '{' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2691:1: ( '{' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2692:1: '{'
            {
             before(grammarAccess.getPriceAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Price__Group__0__Impl5316); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2705:1: rule__Price__Group__1 : rule__Price__Group__1__Impl rule__Price__Group__2 ;
    public final void rule__Price__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2709:1: ( rule__Price__Group__1__Impl rule__Price__Group__2 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2710:2: rule__Price__Group__1__Impl rule__Price__Group__2
            {
            pushFollow(FOLLOW_rule__Price__Group__1__Impl_in_rule__Price__Group__15347);
            rule__Price__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Price__Group__2_in_rule__Price__Group__15350);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2717:1: rule__Price__Group__1__Impl : ( ( rule__Price__ValueAssignment_1 ) ) ;
    public final void rule__Price__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2721:1: ( ( ( rule__Price__ValueAssignment_1 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2722:1: ( ( rule__Price__ValueAssignment_1 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2722:1: ( ( rule__Price__ValueAssignment_1 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2723:1: ( rule__Price__ValueAssignment_1 )
            {
             before(grammarAccess.getPriceAccess().getValueAssignment_1()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2724:1: ( rule__Price__ValueAssignment_1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2724:2: rule__Price__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Price__ValueAssignment_1_in_rule__Price__Group__1__Impl5377);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2734:1: rule__Price__Group__2 : rule__Price__Group__2__Impl rule__Price__Group__3 ;
    public final void rule__Price__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2738:1: ( rule__Price__Group__2__Impl rule__Price__Group__3 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2739:2: rule__Price__Group__2__Impl rule__Price__Group__3
            {
            pushFollow(FOLLOW_rule__Price__Group__2__Impl_in_rule__Price__Group__25407);
            rule__Price__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Price__Group__3_in_rule__Price__Group__25410);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2746:1: rule__Price__Group__2__Impl : ( ( rule__Price__CurrencyAssignment_2 ) ) ;
    public final void rule__Price__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2750:1: ( ( ( rule__Price__CurrencyAssignment_2 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2751:1: ( ( rule__Price__CurrencyAssignment_2 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2751:1: ( ( rule__Price__CurrencyAssignment_2 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2752:1: ( rule__Price__CurrencyAssignment_2 )
            {
             before(grammarAccess.getPriceAccess().getCurrencyAssignment_2()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2753:1: ( rule__Price__CurrencyAssignment_2 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2753:2: rule__Price__CurrencyAssignment_2
            {
            pushFollow(FOLLOW_rule__Price__CurrencyAssignment_2_in_rule__Price__Group__2__Impl5437);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2763:1: rule__Price__Group__3 : rule__Price__Group__3__Impl ;
    public final void rule__Price__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2767:1: ( rule__Price__Group__3__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2768:2: rule__Price__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Price__Group__3__Impl_in_rule__Price__Group__35467);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2774:1: rule__Price__Group__3__Impl : ( '}' ) ;
    public final void rule__Price__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2778:1: ( ( '}' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2779:1: ( '}' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2779:1: ( '}' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2780:1: '}'
            {
             before(grammarAccess.getPriceAccess().getRightCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_15_in_rule__Price__Group__3__Impl5495); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2801:1: rule__Currency__Group_0__0 : rule__Currency__Group_0__0__Impl rule__Currency__Group_0__1 ;
    public final void rule__Currency__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2805:1: ( rule__Currency__Group_0__0__Impl rule__Currency__Group_0__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2806:2: rule__Currency__Group_0__0__Impl rule__Currency__Group_0__1
            {
            pushFollow(FOLLOW_rule__Currency__Group_0__0__Impl_in_rule__Currency__Group_0__05534);
            rule__Currency__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Currency__Group_0__1_in_rule__Currency__Group_0__05537);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2813:1: rule__Currency__Group_0__0__Impl : ( () ) ;
    public final void rule__Currency__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2817:1: ( ( () ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2818:1: ( () )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2818:1: ( () )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2819:1: ()
            {
             before(grammarAccess.getCurrencyAccess().getEStringAction_0_0()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2820:1: ()
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2822:1: 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2832:1: rule__Currency__Group_0__1 : rule__Currency__Group_0__1__Impl ;
    public final void rule__Currency__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2836:1: ( rule__Currency__Group_0__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2837:2: rule__Currency__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Currency__Group_0__1__Impl_in_rule__Currency__Group_0__15595);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2843:1: rule__Currency__Group_0__1__Impl : ( 'Euro' ) ;
    public final void rule__Currency__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2847:1: ( ( 'Euro' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2848:1: ( 'Euro' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2848:1: ( 'Euro' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2849:1: 'Euro'
            {
             before(grammarAccess.getCurrencyAccess().getEuroKeyword_0_1()); 
            match(input,40,FOLLOW_40_in_rule__Currency__Group_0__1__Impl5623); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2866:1: rule__Currency__Group_1__0 : rule__Currency__Group_1__0__Impl rule__Currency__Group_1__1 ;
    public final void rule__Currency__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2870:1: ( rule__Currency__Group_1__0__Impl rule__Currency__Group_1__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2871:2: rule__Currency__Group_1__0__Impl rule__Currency__Group_1__1
            {
            pushFollow(FOLLOW_rule__Currency__Group_1__0__Impl_in_rule__Currency__Group_1__05658);
            rule__Currency__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Currency__Group_1__1_in_rule__Currency__Group_1__05661);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2878:1: rule__Currency__Group_1__0__Impl : ( () ) ;
    public final void rule__Currency__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2882:1: ( ( () ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2883:1: ( () )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2883:1: ( () )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2884:1: ()
            {
             before(grammarAccess.getCurrencyAccess().getEStringAction_1_0()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2885:1: ()
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2887:1: 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2897:1: rule__Currency__Group_1__1 : rule__Currency__Group_1__1__Impl ;
    public final void rule__Currency__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2901:1: ( rule__Currency__Group_1__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2902:2: rule__Currency__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Currency__Group_1__1__Impl_in_rule__Currency__Group_1__15719);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2908:1: rule__Currency__Group_1__1__Impl : ( 'Dollar' ) ;
    public final void rule__Currency__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2912:1: ( ( 'Dollar' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2913:1: ( 'Dollar' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2913:1: ( 'Dollar' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2914:1: 'Dollar'
            {
             before(grammarAccess.getCurrencyAccess().getDollarKeyword_1_1()); 
            match(input,41,FOLLOW_41_in_rule__Currency__Group_1__1__Impl5747); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2931:1: rule__Topic__Group__0 : rule__Topic__Group__0__Impl rule__Topic__Group__1 ;
    public final void rule__Topic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2935:1: ( rule__Topic__Group__0__Impl rule__Topic__Group__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2936:2: rule__Topic__Group__0__Impl rule__Topic__Group__1
            {
            pushFollow(FOLLOW_rule__Topic__Group__0__Impl_in_rule__Topic__Group__05782);
            rule__Topic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Topic__Group__1_in_rule__Topic__Group__05785);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2943:1: rule__Topic__Group__0__Impl : ( 'topic' ) ;
    public final void rule__Topic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2947:1: ( ( 'topic' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2948:1: ( 'topic' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2948:1: ( 'topic' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2949:1: 'topic'
            {
             before(grammarAccess.getTopicAccess().getTopicKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__Topic__Group__0__Impl5813); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2962:1: rule__Topic__Group__1 : rule__Topic__Group__1__Impl rule__Topic__Group__2 ;
    public final void rule__Topic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2966:1: ( rule__Topic__Group__1__Impl rule__Topic__Group__2 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2967:2: rule__Topic__Group__1__Impl rule__Topic__Group__2
            {
            pushFollow(FOLLOW_rule__Topic__Group__1__Impl_in_rule__Topic__Group__15844);
            rule__Topic__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Topic__Group__2_in_rule__Topic__Group__15847);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2974:1: rule__Topic__Group__1__Impl : ( ( rule__Topic__NameAssignment_1 ) ) ;
    public final void rule__Topic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2978:1: ( ( ( rule__Topic__NameAssignment_1 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2979:1: ( ( rule__Topic__NameAssignment_1 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2979:1: ( ( rule__Topic__NameAssignment_1 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2980:1: ( rule__Topic__NameAssignment_1 )
            {
             before(grammarAccess.getTopicAccess().getNameAssignment_1()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2981:1: ( rule__Topic__NameAssignment_1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2981:2: rule__Topic__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Topic__NameAssignment_1_in_rule__Topic__Group__1__Impl5874);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2991:1: rule__Topic__Group__2 : rule__Topic__Group__2__Impl rule__Topic__Group__3 ;
    public final void rule__Topic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2995:1: ( rule__Topic__Group__2__Impl rule__Topic__Group__3 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2996:2: rule__Topic__Group__2__Impl rule__Topic__Group__3
            {
            pushFollow(FOLLOW_rule__Topic__Group__2__Impl_in_rule__Topic__Group__25904);
            rule__Topic__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Topic__Group__3_in_rule__Topic__Group__25907);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3003:1: rule__Topic__Group__2__Impl : ( '{' ) ;
    public final void rule__Topic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3007:1: ( ( '{' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3008:1: ( '{' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3008:1: ( '{' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3009:1: '{'
            {
             before(grammarAccess.getTopicAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Topic__Group__2__Impl5935); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3022:1: rule__Topic__Group__3 : rule__Topic__Group__3__Impl rule__Topic__Group__4 ;
    public final void rule__Topic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3026:1: ( rule__Topic__Group__3__Impl rule__Topic__Group__4 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3027:2: rule__Topic__Group__3__Impl rule__Topic__Group__4
            {
            pushFollow(FOLLOW_rule__Topic__Group__3__Impl_in_rule__Topic__Group__35966);
            rule__Topic__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Topic__Group__4_in_rule__Topic__Group__35969);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3034:1: rule__Topic__Group__3__Impl : ( ( rule__Topic__TagsAssignment_3 ) ) ;
    public final void rule__Topic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3038:1: ( ( ( rule__Topic__TagsAssignment_3 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3039:1: ( ( rule__Topic__TagsAssignment_3 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3039:1: ( ( rule__Topic__TagsAssignment_3 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3040:1: ( rule__Topic__TagsAssignment_3 )
            {
             before(grammarAccess.getTopicAccess().getTagsAssignment_3()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3041:1: ( rule__Topic__TagsAssignment_3 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3041:2: rule__Topic__TagsAssignment_3
            {
            pushFollow(FOLLOW_rule__Topic__TagsAssignment_3_in_rule__Topic__Group__3__Impl5996);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3051:1: rule__Topic__Group__4 : rule__Topic__Group__4__Impl rule__Topic__Group__5 ;
    public final void rule__Topic__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3055:1: ( rule__Topic__Group__4__Impl rule__Topic__Group__5 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3056:2: rule__Topic__Group__4__Impl rule__Topic__Group__5
            {
            pushFollow(FOLLOW_rule__Topic__Group__4__Impl_in_rule__Topic__Group__46026);
            rule__Topic__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Topic__Group__5_in_rule__Topic__Group__46029);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3063:1: rule__Topic__Group__4__Impl : ( ( rule__Topic__Group_4__0 )* ) ;
    public final void rule__Topic__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3067:1: ( ( ( rule__Topic__Group_4__0 )* ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3068:1: ( ( rule__Topic__Group_4__0 )* )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3068:1: ( ( rule__Topic__Group_4__0 )* )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3069:1: ( rule__Topic__Group_4__0 )*
            {
             before(grammarAccess.getTopicAccess().getGroup_4()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3070:1: ( rule__Topic__Group_4__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==43) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3070:2: rule__Topic__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Topic__Group_4__0_in_rule__Topic__Group__4__Impl6056);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3080:1: rule__Topic__Group__5 : rule__Topic__Group__5__Impl ;
    public final void rule__Topic__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3084:1: ( rule__Topic__Group__5__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3085:2: rule__Topic__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Topic__Group__5__Impl_in_rule__Topic__Group__56087);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3091:1: rule__Topic__Group__5__Impl : ( '}' ) ;
    public final void rule__Topic__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3095:1: ( ( '}' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3096:1: ( '}' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3096:1: ( '}' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3097:1: '}'
            {
             before(grammarAccess.getTopicAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__Topic__Group__5__Impl6115); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3122:1: rule__Topic__Group_4__0 : rule__Topic__Group_4__0__Impl rule__Topic__Group_4__1 ;
    public final void rule__Topic__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3126:1: ( rule__Topic__Group_4__0__Impl rule__Topic__Group_4__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3127:2: rule__Topic__Group_4__0__Impl rule__Topic__Group_4__1
            {
            pushFollow(FOLLOW_rule__Topic__Group_4__0__Impl_in_rule__Topic__Group_4__06158);
            rule__Topic__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Topic__Group_4__1_in_rule__Topic__Group_4__06161);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3134:1: rule__Topic__Group_4__0__Impl : ( ', ' ) ;
    public final void rule__Topic__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3138:1: ( ( ', ' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3139:1: ( ', ' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3139:1: ( ', ' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3140:1: ', '
            {
             before(grammarAccess.getTopicAccess().getCommaSpaceKeyword_4_0()); 
            match(input,43,FOLLOW_43_in_rule__Topic__Group_4__0__Impl6189); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3153:1: rule__Topic__Group_4__1 : rule__Topic__Group_4__1__Impl ;
    public final void rule__Topic__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3157:1: ( rule__Topic__Group_4__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3158:2: rule__Topic__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Topic__Group_4__1__Impl_in_rule__Topic__Group_4__16220);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3164:1: rule__Topic__Group_4__1__Impl : ( ( rule__Topic__TagsAssignment_4_1 ) ) ;
    public final void rule__Topic__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3168:1: ( ( ( rule__Topic__TagsAssignment_4_1 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3169:1: ( ( rule__Topic__TagsAssignment_4_1 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3169:1: ( ( rule__Topic__TagsAssignment_4_1 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3170:1: ( rule__Topic__TagsAssignment_4_1 )
            {
             before(grammarAccess.getTopicAccess().getTagsAssignment_4_1()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3171:1: ( rule__Topic__TagsAssignment_4_1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3171:2: rule__Topic__TagsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Topic__TagsAssignment_4_1_in_rule__Topic__Group_4__1__Impl6247);
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


    // $ANTLR start "rule__Feedlinks__Group__0"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3185:1: rule__Feedlinks__Group__0 : rule__Feedlinks__Group__0__Impl rule__Feedlinks__Group__1 ;
    public final void rule__Feedlinks__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3189:1: ( rule__Feedlinks__Group__0__Impl rule__Feedlinks__Group__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3190:2: rule__Feedlinks__Group__0__Impl rule__Feedlinks__Group__1
            {
            pushFollow(FOLLOW_rule__Feedlinks__Group__0__Impl_in_rule__Feedlinks__Group__06281);
            rule__Feedlinks__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feedlinks__Group__1_in_rule__Feedlinks__Group__06284);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3197:1: rule__Feedlinks__Group__0__Impl : ( '{' ) ;
    public final void rule__Feedlinks__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3201:1: ( ( '{' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3202:1: ( '{' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3202:1: ( '{' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3203:1: '{'
            {
             before(grammarAccess.getFeedlinksAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Feedlinks__Group__0__Impl6312); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3216:1: rule__Feedlinks__Group__1 : rule__Feedlinks__Group__1__Impl rule__Feedlinks__Group__2 ;
    public final void rule__Feedlinks__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3220:1: ( rule__Feedlinks__Group__1__Impl rule__Feedlinks__Group__2 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3221:2: rule__Feedlinks__Group__1__Impl rule__Feedlinks__Group__2
            {
            pushFollow(FOLLOW_rule__Feedlinks__Group__1__Impl_in_rule__Feedlinks__Group__16343);
            rule__Feedlinks__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feedlinks__Group__2_in_rule__Feedlinks__Group__16346);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3228:1: rule__Feedlinks__Group__1__Impl : ( ( rule__Feedlinks__PairsAssignment_1 ) ) ;
    public final void rule__Feedlinks__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3232:1: ( ( ( rule__Feedlinks__PairsAssignment_1 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3233:1: ( ( rule__Feedlinks__PairsAssignment_1 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3233:1: ( ( rule__Feedlinks__PairsAssignment_1 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3234:1: ( rule__Feedlinks__PairsAssignment_1 )
            {
             before(grammarAccess.getFeedlinksAccess().getPairsAssignment_1()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3235:1: ( rule__Feedlinks__PairsAssignment_1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3235:2: rule__Feedlinks__PairsAssignment_1
            {
            pushFollow(FOLLOW_rule__Feedlinks__PairsAssignment_1_in_rule__Feedlinks__Group__1__Impl6373);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3245:1: rule__Feedlinks__Group__2 : rule__Feedlinks__Group__2__Impl rule__Feedlinks__Group__3 ;
    public final void rule__Feedlinks__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3249:1: ( rule__Feedlinks__Group__2__Impl rule__Feedlinks__Group__3 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3250:2: rule__Feedlinks__Group__2__Impl rule__Feedlinks__Group__3
            {
            pushFollow(FOLLOW_rule__Feedlinks__Group__2__Impl_in_rule__Feedlinks__Group__26403);
            rule__Feedlinks__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feedlinks__Group__3_in_rule__Feedlinks__Group__26406);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3257:1: rule__Feedlinks__Group__2__Impl : ( ( rule__Feedlinks__Group_2__0 )* ) ;
    public final void rule__Feedlinks__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3261:1: ( ( ( rule__Feedlinks__Group_2__0 )* ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3262:1: ( ( rule__Feedlinks__Group_2__0 )* )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3262:1: ( ( rule__Feedlinks__Group_2__0 )* )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3263:1: ( rule__Feedlinks__Group_2__0 )*
            {
             before(grammarAccess.getFeedlinksAccess().getGroup_2()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3264:1: ( rule__Feedlinks__Group_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==43) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3264:2: rule__Feedlinks__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Feedlinks__Group_2__0_in_rule__Feedlinks__Group__2__Impl6433);
            	    rule__Feedlinks__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3274:1: rule__Feedlinks__Group__3 : rule__Feedlinks__Group__3__Impl ;
    public final void rule__Feedlinks__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3278:1: ( rule__Feedlinks__Group__3__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3279:2: rule__Feedlinks__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Feedlinks__Group__3__Impl_in_rule__Feedlinks__Group__36464);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3285:1: rule__Feedlinks__Group__3__Impl : ( '}' ) ;
    public final void rule__Feedlinks__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3289:1: ( ( '}' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3290:1: ( '}' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3290:1: ( '}' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3291:1: '}'
            {
             before(grammarAccess.getFeedlinksAccess().getRightCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_15_in_rule__Feedlinks__Group__3__Impl6492); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3312:1: rule__Feedlinks__Group_2__0 : rule__Feedlinks__Group_2__0__Impl rule__Feedlinks__Group_2__1 ;
    public final void rule__Feedlinks__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3316:1: ( rule__Feedlinks__Group_2__0__Impl rule__Feedlinks__Group_2__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3317:2: rule__Feedlinks__Group_2__0__Impl rule__Feedlinks__Group_2__1
            {
            pushFollow(FOLLOW_rule__Feedlinks__Group_2__0__Impl_in_rule__Feedlinks__Group_2__06531);
            rule__Feedlinks__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feedlinks__Group_2__1_in_rule__Feedlinks__Group_2__06534);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3324:1: rule__Feedlinks__Group_2__0__Impl : ( ', ' ) ;
    public final void rule__Feedlinks__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3328:1: ( ( ', ' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3329:1: ( ', ' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3329:1: ( ', ' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3330:1: ', '
            {
             before(grammarAccess.getFeedlinksAccess().getCommaSpaceKeyword_2_0()); 
            match(input,43,FOLLOW_43_in_rule__Feedlinks__Group_2__0__Impl6562); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3343:1: rule__Feedlinks__Group_2__1 : rule__Feedlinks__Group_2__1__Impl ;
    public final void rule__Feedlinks__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3347:1: ( rule__Feedlinks__Group_2__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3348:2: rule__Feedlinks__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Feedlinks__Group_2__1__Impl_in_rule__Feedlinks__Group_2__16593);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3354:1: rule__Feedlinks__Group_2__1__Impl : ( ( rule__Feedlinks__PairsAssignment_2_1 ) ) ;
    public final void rule__Feedlinks__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3358:1: ( ( ( rule__Feedlinks__PairsAssignment_2_1 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3359:1: ( ( rule__Feedlinks__PairsAssignment_2_1 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3359:1: ( ( rule__Feedlinks__PairsAssignment_2_1 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3360:1: ( rule__Feedlinks__PairsAssignment_2_1 )
            {
             before(grammarAccess.getFeedlinksAccess().getPairsAssignment_2_1()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3361:1: ( rule__Feedlinks__PairsAssignment_2_1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3361:2: rule__Feedlinks__PairsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Feedlinks__PairsAssignment_2_1_in_rule__Feedlinks__Group_2__1__Impl6620);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3375:1: rule__Pair__Group__0 : rule__Pair__Group__0__Impl rule__Pair__Group__1 ;
    public final void rule__Pair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3379:1: ( rule__Pair__Group__0__Impl rule__Pair__Group__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3380:2: rule__Pair__Group__0__Impl rule__Pair__Group__1
            {
            pushFollow(FOLLOW_rule__Pair__Group__0__Impl_in_rule__Pair__Group__06654);
            rule__Pair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Pair__Group__1_in_rule__Pair__Group__06657);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3387:1: rule__Pair__Group__0__Impl : ( '{' ) ;
    public final void rule__Pair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3391:1: ( ( '{' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3392:1: ( '{' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3392:1: ( '{' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3393:1: '{'
            {
             before(grammarAccess.getPairAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Pair__Group__0__Impl6685); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3406:1: rule__Pair__Group__1 : rule__Pair__Group__1__Impl rule__Pair__Group__2 ;
    public final void rule__Pair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3410:1: ( rule__Pair__Group__1__Impl rule__Pair__Group__2 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3411:2: rule__Pair__Group__1__Impl rule__Pair__Group__2
            {
            pushFollow(FOLLOW_rule__Pair__Group__1__Impl_in_rule__Pair__Group__16716);
            rule__Pair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Pair__Group__2_in_rule__Pair__Group__16719);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3418:1: rule__Pair__Group__1__Impl : ( ( rule__Pair__KeyAssignment_1 ) ) ;
    public final void rule__Pair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3422:1: ( ( ( rule__Pair__KeyAssignment_1 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3423:1: ( ( rule__Pair__KeyAssignment_1 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3423:1: ( ( rule__Pair__KeyAssignment_1 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3424:1: ( rule__Pair__KeyAssignment_1 )
            {
             before(grammarAccess.getPairAccess().getKeyAssignment_1()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3425:1: ( rule__Pair__KeyAssignment_1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3425:2: rule__Pair__KeyAssignment_1
            {
            pushFollow(FOLLOW_rule__Pair__KeyAssignment_1_in_rule__Pair__Group__1__Impl6746);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3435:1: rule__Pair__Group__2 : rule__Pair__Group__2__Impl rule__Pair__Group__3 ;
    public final void rule__Pair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3439:1: ( rule__Pair__Group__2__Impl rule__Pair__Group__3 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3440:2: rule__Pair__Group__2__Impl rule__Pair__Group__3
            {
            pushFollow(FOLLOW_rule__Pair__Group__2__Impl_in_rule__Pair__Group__26776);
            rule__Pair__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Pair__Group__3_in_rule__Pair__Group__26779);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3447:1: rule__Pair__Group__2__Impl : ( ( rule__Pair__ValueAssignment_2 ) ) ;
    public final void rule__Pair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3451:1: ( ( ( rule__Pair__ValueAssignment_2 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3452:1: ( ( rule__Pair__ValueAssignment_2 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3452:1: ( ( rule__Pair__ValueAssignment_2 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3453:1: ( rule__Pair__ValueAssignment_2 )
            {
             before(grammarAccess.getPairAccess().getValueAssignment_2()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3454:1: ( rule__Pair__ValueAssignment_2 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3454:2: rule__Pair__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Pair__ValueAssignment_2_in_rule__Pair__Group__2__Impl6806);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3464:1: rule__Pair__Group__3 : rule__Pair__Group__3__Impl ;
    public final void rule__Pair__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3468:1: ( rule__Pair__Group__3__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3469:2: rule__Pair__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Pair__Group__3__Impl_in_rule__Pair__Group__36836);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3475:1: rule__Pair__Group__3__Impl : ( '}' ) ;
    public final void rule__Pair__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3479:1: ( ( '}' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3480:1: ( '}' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3480:1: ( '}' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3481:1: '}'
            {
             before(grammarAccess.getPairAccess().getRightCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_15_in_rule__Pair__Group__3__Impl6864); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3503:1: rule__Declaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Declaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3507:1: ( ( RULE_ID ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3508:1: ( RULE_ID )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3508:1: ( RULE_ID )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3509:1: RULE_ID
            {
             before(grammarAccess.getDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Declaration__NameAssignment_16908); 
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


    // $ANTLR start "rule__Declaration__FeedlinksAssignment_3"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3518:1: rule__Declaration__FeedlinksAssignment_3 : ( ruleFeedlinks ) ;
    public final void rule__Declaration__FeedlinksAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3522:1: ( ( ruleFeedlinks ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3523:1: ( ruleFeedlinks )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3523:1: ( ruleFeedlinks )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3524:1: ruleFeedlinks
            {
             before(grammarAccess.getDeclarationAccess().getFeedlinksFeedlinksParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleFeedlinks_in_rule__Declaration__FeedlinksAssignment_36939);
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


    // $ANTLR start "rule__Declaration__TopicsAssignment_6"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3533:1: rule__Declaration__TopicsAssignment_6 : ( ruleTopic ) ;
    public final void rule__Declaration__TopicsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3537:1: ( ( ruleTopic ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3538:1: ( ruleTopic )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3538:1: ( ruleTopic )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3539:1: ruleTopic
            {
             before(grammarAccess.getDeclarationAccess().getTopicsTopicParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleTopic_in_rule__Declaration__TopicsAssignment_66970);
            ruleTopic();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getTopicsTopicParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__TopicsAssignment_6"


    // $ANTLR start "rule__Declaration__TopicsAssignment_7"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3548:1: rule__Declaration__TopicsAssignment_7 : ( ruleTopic ) ;
    public final void rule__Declaration__TopicsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3552:1: ( ( ruleTopic ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3553:1: ( ruleTopic )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3553:1: ( ruleTopic )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3554:1: ruleTopic
            {
             before(grammarAccess.getDeclarationAccess().getTopicsTopicParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleTopic_in_rule__Declaration__TopicsAssignment_77001);
            ruleTopic();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getTopicsTopicParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__TopicsAssignment_7"


    // $ANTLR start "rule__Declaration__DateAssignment_9_1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3563:1: rule__Declaration__DateAssignment_9_1 : ( ruleDate ) ;
    public final void rule__Declaration__DateAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3567:1: ( ( ruleDate ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3568:1: ( ruleDate )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3568:1: ( ruleDate )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3569:1: ruleDate
            {
             before(grammarAccess.getDeclarationAccess().getDateDateParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_ruleDate_in_rule__Declaration__DateAssignment_9_17032);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getDateDateParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__DateAssignment_9_1"


    // $ANTLR start "rule__Declaration__LocationAssignment_10_1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3578:1: rule__Declaration__LocationAssignment_10_1 : ( RULE_STRING ) ;
    public final void rule__Declaration__LocationAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3582:1: ( ( RULE_STRING ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3583:1: ( RULE_STRING )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3583:1: ( RULE_STRING )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3584:1: RULE_STRING
            {
             before(grammarAccess.getDeclarationAccess().getLocationSTRINGTerminalRuleCall_10_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Declaration__LocationAssignment_10_17063); 
             after(grammarAccess.getDeclarationAccess().getLocationSTRINGTerminalRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__LocationAssignment_10_1"


    // $ANTLR start "rule__Declaration__PriceAssignment_12"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3593:1: rule__Declaration__PriceAssignment_12 : ( rulePrice ) ;
    public final void rule__Declaration__PriceAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3597:1: ( ( rulePrice ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3598:1: ( rulePrice )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3598:1: ( rulePrice )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3599:1: rulePrice
            {
             before(grammarAccess.getDeclarationAccess().getPricePriceParserRuleCall_12_0()); 
            pushFollow(FOLLOW_rulePrice_in_rule__Declaration__PriceAssignment_127094);
            rulePrice();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getPricePriceParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__PriceAssignment_12"


    // $ANTLR start "rule__Declaration__VolumeAssignment_13_1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3608:1: rule__Declaration__VolumeAssignment_13_1 : ( RULE_INT ) ;
    public final void rule__Declaration__VolumeAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3612:1: ( ( RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3613:1: ( RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3613:1: ( RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3614:1: RULE_INT
            {
             before(grammarAccess.getDeclarationAccess().getVolumeINTTerminalRuleCall_13_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Declaration__VolumeAssignment_13_17125); 
             after(grammarAccess.getDeclarationAccess().getVolumeINTTerminalRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__VolumeAssignment_13_1"


    // $ANTLR start "rule__Declaration__LanguageAssignment_15"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3623:1: rule__Declaration__LanguageAssignment_15 : ( ruleLanguage ) ;
    public final void rule__Declaration__LanguageAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3627:1: ( ( ruleLanguage ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3628:1: ( ruleLanguage )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3628:1: ( ruleLanguage )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3629:1: ruleLanguage
            {
             before(grammarAccess.getDeclarationAccess().getLanguageLanguageParserRuleCall_15_0()); 
            pushFollow(FOLLOW_ruleLanguage_in_rule__Declaration__LanguageAssignment_157156);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3638:1: rule__Declaration__FormatAssignment_17 : ( ruleFormat ) ;
    public final void rule__Declaration__FormatAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3642:1: ( ( ruleFormat ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3643:1: ( ruleFormat )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3643:1: ( ruleFormat )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3644:1: ruleFormat
            {
             before(grammarAccess.getDeclarationAccess().getFormatFormatParserRuleCall_17_0()); 
            pushFollow(FOLLOW_ruleFormat_in_rule__Declaration__FormatAssignment_177187);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3653:1: rule__Declaration__Article_cntAssignment_19 : ( RULE_INT ) ;
    public final void rule__Declaration__Article_cntAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3657:1: ( ( RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3658:1: ( RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3658:1: ( RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3659:1: RULE_INT
            {
             before(grammarAccess.getDeclarationAccess().getArticle_cntINTTerminalRuleCall_19_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Declaration__Article_cntAssignment_197218); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3668:1: rule__Declaration__Article_char_minAssignment_21 : ( RULE_INT ) ;
    public final void rule__Declaration__Article_char_minAssignment_21() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3672:1: ( ( RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3673:1: ( RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3673:1: ( RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3674:1: RULE_INT
            {
             before(grammarAccess.getDeclarationAccess().getArticle_char_minINTTerminalRuleCall_21_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Declaration__Article_char_minAssignment_217249); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3683:1: rule__Declaration__Article_char_maxAssignment_23 : ( RULE_INT ) ;
    public final void rule__Declaration__Article_char_maxAssignment_23() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3687:1: ( ( RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3688:1: ( RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3688:1: ( RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3689:1: RULE_INT
            {
             before(grammarAccess.getDeclarationAccess().getArticle_char_maxINTTerminalRuleCall_23_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Declaration__Article_char_maxAssignment_237280); 
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


    // $ANTLR start "rule__Declaration__Article_imagesAssignment_24_1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3698:1: rule__Declaration__Article_imagesAssignment_24_1 : ( RULE_INT ) ;
    public final void rule__Declaration__Article_imagesAssignment_24_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3702:1: ( ( RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3703:1: ( RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3703:1: ( RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3704:1: RULE_INT
            {
             before(grammarAccess.getDeclarationAccess().getArticle_imagesINTTerminalRuleCall_24_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Declaration__Article_imagesAssignment_24_17311); 
             after(grammarAccess.getDeclarationAccess().getArticle_imagesINTTerminalRuleCall_24_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Article_imagesAssignment_24_1"


    // $ANTLR start "rule__Declaration__Columns_cntAssignment_26"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3713:1: rule__Declaration__Columns_cntAssignment_26 : ( RULE_INT ) ;
    public final void rule__Declaration__Columns_cntAssignment_26() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3717:1: ( ( RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3718:1: ( RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3718:1: ( RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3719:1: RULE_INT
            {
             before(grammarAccess.getDeclarationAccess().getColumns_cntINTTerminalRuleCall_26_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Declaration__Columns_cntAssignment_267342); 
             after(grammarAccess.getDeclarationAccess().getColumns_cntINTTerminalRuleCall_26_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Columns_cntAssignment_26"


    // $ANTLR start "rule__Declaration__Font_sizeAssignment_28"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3728:1: rule__Declaration__Font_sizeAssignment_28 : ( ruleFontSize ) ;
    public final void rule__Declaration__Font_sizeAssignment_28() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3732:1: ( ( ruleFontSize ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3733:1: ( ruleFontSize )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3733:1: ( ruleFontSize )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3734:1: ruleFontSize
            {
             before(grammarAccess.getDeclarationAccess().getFont_sizeFontSizeParserRuleCall_28_0()); 
            pushFollow(FOLLOW_ruleFontSize_in_rule__Declaration__Font_sizeAssignment_287373);
            ruleFontSize();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getFont_sizeFontSizeParserRuleCall_28_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Font_sizeAssignment_28"


    // $ANTLR start "rule__Date__DayAssignment_1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3743:1: rule__Date__DayAssignment_1 : ( RULE_INT ) ;
    public final void rule__Date__DayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3747:1: ( ( RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3748:1: ( RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3748:1: ( RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3749:1: RULE_INT
            {
             before(grammarAccess.getDateAccess().getDayINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Date__DayAssignment_17404); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3758:1: rule__Date__MonthAssignment_3 : ( RULE_INT ) ;
    public final void rule__Date__MonthAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3762:1: ( ( RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3763:1: ( RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3763:1: ( RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3764:1: RULE_INT
            {
             before(grammarAccess.getDateAccess().getMonthINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Date__MonthAssignment_37435); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3773:1: rule__Date__YearAssignment_5 : ( RULE_INT ) ;
    public final void rule__Date__YearAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3777:1: ( ( RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3778:1: ( RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3778:1: ( RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3779:1: RULE_INT
            {
             before(grammarAccess.getDateAccess().getYearINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Date__YearAssignment_57466); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3788:1: rule__Price__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Price__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3792:1: ( ( RULE_STRING ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3793:1: ( RULE_STRING )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3793:1: ( RULE_STRING )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3794:1: RULE_STRING
            {
             before(grammarAccess.getPriceAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Price__ValueAssignment_17497); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3803:1: rule__Price__CurrencyAssignment_2 : ( ruleCurrency ) ;
    public final void rule__Price__CurrencyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3807:1: ( ( ruleCurrency ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3808:1: ( ruleCurrency )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3808:1: ( ruleCurrency )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3809:1: ruleCurrency
            {
             before(grammarAccess.getPriceAccess().getCurrencyCurrencyParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCurrency_in_rule__Price__CurrencyAssignment_27528);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3818:1: rule__Topic__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Topic__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3822:1: ( ( RULE_ID ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3823:1: ( RULE_ID )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3823:1: ( RULE_ID )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3824:1: RULE_ID
            {
             before(grammarAccess.getTopicAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Topic__NameAssignment_17559); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3833:1: rule__Topic__TagsAssignment_3 : ( ruleTopicTag ) ;
    public final void rule__Topic__TagsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3837:1: ( ( ruleTopicTag ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3838:1: ( ruleTopicTag )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3838:1: ( ruleTopicTag )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3839:1: ruleTopicTag
            {
             before(grammarAccess.getTopicAccess().getTagsTopicTagParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTopicTag_in_rule__Topic__TagsAssignment_37590);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3848:1: rule__Topic__TagsAssignment_4_1 : ( ruleTopicTag ) ;
    public final void rule__Topic__TagsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3852:1: ( ( ruleTopicTag ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3853:1: ( ruleTopicTag )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3853:1: ( ruleTopicTag )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3854:1: ruleTopicTag
            {
             before(grammarAccess.getTopicAccess().getTagsTopicTagParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleTopicTag_in_rule__Topic__TagsAssignment_4_17621);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3863:1: rule__TopicTag__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__TopicTag__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3867:1: ( ( RULE_STRING ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3868:1: ( RULE_STRING )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3868:1: ( RULE_STRING )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3869:1: RULE_STRING
            {
             before(grammarAccess.getTopicTagAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TopicTag__ValueAssignment7652); 
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


    // $ANTLR start "rule__Feedlinks__PairsAssignment_1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3878:1: rule__Feedlinks__PairsAssignment_1 : ( rulePair ) ;
    public final void rule__Feedlinks__PairsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3882:1: ( ( rulePair ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3883:1: ( rulePair )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3883:1: ( rulePair )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3884:1: rulePair
            {
             before(grammarAccess.getFeedlinksAccess().getPairsPairParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePair_in_rule__Feedlinks__PairsAssignment_17683);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3893:1: rule__Feedlinks__PairsAssignment_2_1 : ( rulePair ) ;
    public final void rule__Feedlinks__PairsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3897:1: ( ( rulePair ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3898:1: ( rulePair )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3898:1: ( rulePair )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3899:1: rulePair
            {
             before(grammarAccess.getFeedlinksAccess().getPairsPairParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_rulePair_in_rule__Feedlinks__PairsAssignment_2_17714);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3908:1: rule__Pair__KeyAssignment_1 : ( RULE_ID ) ;
    public final void rule__Pair__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3912:1: ( ( RULE_ID ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3913:1: ( RULE_ID )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3913:1: ( RULE_ID )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3914:1: RULE_ID
            {
             before(grammarAccess.getPairAccess().getKeyIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Pair__KeyAssignment_17745); 
             after(grammarAccess.getPairAccess().getKeyIDTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3923:1: rule__Pair__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Pair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3927:1: ( ( RULE_STRING ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3928:1: ( RULE_STRING )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3928:1: ( RULE_STRING )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3929:1: RULE_STRING
            {
             before(grammarAccess.getPairAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Pair__ValueAssignment_27776); 
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
    public static final BitSet FOLLOW_ruleCurrency_in_entryRuleCurrency421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCurrency428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Currency__Alternatives_in_ruleCurrency454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopic_in_entryRuleTopic481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopic488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Topic__Group__0_in_ruleTopic514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopicTag_in_entryRuleTopicTag541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopicTag548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopicTag__ValueAssignment_in_ruleTopicTag574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeedlinks_in_entryRuleFeedlinks601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeedlinks608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feedlinks__Group__0_in_ruleFeedlinks634 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_rule__Currency__Group_0__0_in_rule__Currency__Alternatives991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Currency__Group_1__0_in_rule__Currency__Alternatives1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__0__Impl_in_rule__Declaration__Group__01040 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Declaration__Group__1_in_rule__Declaration__Group__01043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Declaration__Group__0__Impl1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__1__Impl_in_rule__Declaration__Group__11102 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__2_in_rule__Declaration__Group__11105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__NameAssignment_1_in_rule__Declaration__Group__1__Impl1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__2__Impl_in_rule__Declaration__Group__21162 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__3_in_rule__Declaration__Group__21165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Declaration__Group__2__Impl1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__3__Impl_in_rule__Declaration__Group__31224 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__4_in_rule__Declaration__Group__31227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__FeedlinksAssignment_3_in_rule__Declaration__Group__3__Impl1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__4__Impl_in_rule__Declaration__Group__41284 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__5_in_rule__Declaration__Group__41287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Declaration__Group__4__Impl1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__5__Impl_in_rule__Declaration__Group__51346 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__6_in_rule__Declaration__Group__51349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Declaration__Group__5__Impl1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__6__Impl_in_rule__Declaration__Group__61408 = new BitSet(new long[]{0x0000040000008000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__7_in_rule__Declaration__Group__61411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__TopicsAssignment_6_in_rule__Declaration__Group__6__Impl1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__7__Impl_in_rule__Declaration__Group__71468 = new BitSet(new long[]{0x0000040000008000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__8_in_rule__Declaration__Group__71471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__TopicsAssignment_7_in_rule__Declaration__Group__7__Impl1498 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__8__Impl_in_rule__Declaration__Group__81529 = new BitSet(new long[]{0x0000000003010000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__9_in_rule__Declaration__Group__81532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Declaration__Group__8__Impl1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__9__Impl_in_rule__Declaration__Group__91591 = new BitSet(new long[]{0x0000000003010000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__10_in_rule__Declaration__Group__91594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_9__0_in_rule__Declaration__Group__9__Impl1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__10__Impl_in_rule__Declaration__Group__101652 = new BitSet(new long[]{0x0000000003010000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__11_in_rule__Declaration__Group__101655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_10__0_in_rule__Declaration__Group__10__Impl1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__11__Impl_in_rule__Declaration__Group__111713 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__12_in_rule__Declaration__Group__111716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Declaration__Group__11__Impl1744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__12__Impl_in_rule__Declaration__Group__121775 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__13_in_rule__Declaration__Group__121778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__PriceAssignment_12_in_rule__Declaration__Group__12__Impl1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__13__Impl_in_rule__Declaration__Group__131835 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__14_in_rule__Declaration__Group__131838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_13__0_in_rule__Declaration__Group__13__Impl1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__14__Impl_in_rule__Declaration__Group__141896 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__15_in_rule__Declaration__Group__141899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Declaration__Group__14__Impl1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__15__Impl_in_rule__Declaration__Group__151958 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__16_in_rule__Declaration__Group__151961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__LanguageAssignment_15_in_rule__Declaration__Group__15__Impl1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__16__Impl_in_rule__Declaration__Group__162018 = new BitSet(new long[]{0x0000003F80000000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__17_in_rule__Declaration__Group__162021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Declaration__Group__16__Impl2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__17__Impl_in_rule__Declaration__Group__172080 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__18_in_rule__Declaration__Group__172083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__FormatAssignment_17_in_rule__Declaration__Group__17__Impl2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__18__Impl_in_rule__Declaration__Group__182140 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Declaration__Group__19_in_rule__Declaration__Group__182143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Declaration__Group__18__Impl2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__19__Impl_in_rule__Declaration__Group__192202 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__20_in_rule__Declaration__Group__192205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Article_cntAssignment_19_in_rule__Declaration__Group__19__Impl2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__20__Impl_in_rule__Declaration__Group__202262 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Declaration__Group__21_in_rule__Declaration__Group__202265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Declaration__Group__20__Impl2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__21__Impl_in_rule__Declaration__Group__212324 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__22_in_rule__Declaration__Group__212327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Article_char_minAssignment_21_in_rule__Declaration__Group__21__Impl2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__22__Impl_in_rule__Declaration__Group__222384 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Declaration__Group__23_in_rule__Declaration__Group__222387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Declaration__Group__22__Impl2415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__23__Impl_in_rule__Declaration__Group__232446 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__24_in_rule__Declaration__Group__232449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Article_char_maxAssignment_23_in_rule__Declaration__Group__23__Impl2476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__24__Impl_in_rule__Declaration__Group__242506 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__25_in_rule__Declaration__Group__242509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_24__0_in_rule__Declaration__Group__24__Impl2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__25__Impl_in_rule__Declaration__Group__252567 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Declaration__Group__26_in_rule__Declaration__Group__252570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Declaration__Group__25__Impl2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__26__Impl_in_rule__Declaration__Group__262629 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__27_in_rule__Declaration__Group__262632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Columns_cntAssignment_26_in_rule__Declaration__Group__26__Impl2659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__27__Impl_in_rule__Declaration__Group__272689 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__28_in_rule__Declaration__Group__272692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Declaration__Group__27__Impl2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__28__Impl_in_rule__Declaration__Group__282751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Font_sizeAssignment_28_in_rule__Declaration__Group__28__Impl2778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_9__0__Impl_in_rule__Declaration__Group_9__02866 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Declaration__Group_9__1_in_rule__Declaration__Group_9__02869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Declaration__Group_9__0__Impl2897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_9__1__Impl_in_rule__Declaration__Group_9__12928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__DateAssignment_9_1_in_rule__Declaration__Group_9__1__Impl2955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_10__0__Impl_in_rule__Declaration__Group_10__02989 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Declaration__Group_10__1_in_rule__Declaration__Group_10__02992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Declaration__Group_10__0__Impl3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_10__1__Impl_in_rule__Declaration__Group_10__13051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__LocationAssignment_10_1_in_rule__Declaration__Group_10__1__Impl3078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_13__0__Impl_in_rule__Declaration__Group_13__03112 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Declaration__Group_13__1_in_rule__Declaration__Group_13__03115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Declaration__Group_13__0__Impl3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_13__1__Impl_in_rule__Declaration__Group_13__13174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__VolumeAssignment_13_1_in_rule__Declaration__Group_13__1__Impl3201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_24__0__Impl_in_rule__Declaration__Group_24__03235 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Declaration__Group_24__1_in_rule__Declaration__Group_24__03238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Declaration__Group_24__0__Impl3266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_24__1__Impl_in_rule__Declaration__Group_24__13297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Article_imagesAssignment_24_1_in_rule__Declaration__Group_24__1__Impl3324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FontSize__Group_0__0__Impl_in_rule__FontSize__Group_0__03358 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__FontSize__Group_0__1_in_rule__FontSize__Group_0__03361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FontSize__Group_0__1__Impl_in_rule__FontSize__Group_0__13419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__FontSize__Group_0__1__Impl3447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FontSize__Group_1__0__Impl_in_rule__FontSize__Group_1__03482 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__FontSize__Group_1__1_in_rule__FontSize__Group_1__03485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FontSize__Group_1__1__Impl_in_rule__FontSize__Group_1__13543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__FontSize__Group_1__1__Impl3571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FontSize__Group_2__0__Impl_in_rule__FontSize__Group_2__03606 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_rule__FontSize__Group_2__1_in_rule__FontSize__Group_2__03609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FontSize__Group_2__1__Impl_in_rule__FontSize__Group_2__13667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__FontSize__Group_2__1__Impl3695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_0__0__Impl_in_rule__Format__Group_0__03730 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Format__Group_0__1_in_rule__Format__Group_0__03733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_0__1__Impl_in_rule__Format__Group_0__13791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Format__Group_0__1__Impl3819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_1__0__Impl_in_rule__Format__Group_1__03854 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Format__Group_1__1_in_rule__Format__Group_1__03857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_1__1__Impl_in_rule__Format__Group_1__13915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Format__Group_1__1__Impl3943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_2__0__Impl_in_rule__Format__Group_2__03978 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Format__Group_2__1_in_rule__Format__Group_2__03981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_2__1__Impl_in_rule__Format__Group_2__14039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Format__Group_2__1__Impl4067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_3__0__Impl_in_rule__Format__Group_3__04102 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Format__Group_3__1_in_rule__Format__Group_3__04105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_3__1__Impl_in_rule__Format__Group_3__14163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Format__Group_3__1__Impl4191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_4__0__Impl_in_rule__Format__Group_4__04226 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Format__Group_4__1_in_rule__Format__Group_4__04229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_4__1__Impl_in_rule__Format__Group_4__14287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Format__Group_4__1__Impl4315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_5__0__Impl_in_rule__Format__Group_5__04350 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Format__Group_5__1_in_rule__Format__Group_5__04353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_5__1__Impl_in_rule__Format__Group_5__14411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Format__Group_5__1__Impl4439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_6__0__Impl_in_rule__Format__Group_6__04474 = new BitSet(new long[]{0x0000003F80000000L});
    public static final BitSet FOLLOW_rule__Format__Group_6__1_in_rule__Format__Group_6__04477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_6__1__Impl_in_rule__Format__Group_6__14535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Format__Group_6__1__Impl4563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__Group__0__Impl_in_rule__Date__Group__04598 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Date__Group__1_in_rule__Date__Group__04601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Date__Group__0__Impl4629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__Group__1__Impl_in_rule__Date__Group__14660 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Date__Group__2_in_rule__Date__Group__14663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__DayAssignment_1_in_rule__Date__Group__1__Impl4690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__Group__2__Impl_in_rule__Date__Group__24720 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Date__Group__3_in_rule__Date__Group__24723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Date__Group__2__Impl4751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__Group__3__Impl_in_rule__Date__Group__34782 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Date__Group__4_in_rule__Date__Group__34785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__MonthAssignment_3_in_rule__Date__Group__3__Impl4812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__Group__4__Impl_in_rule__Date__Group__44842 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Date__Group__5_in_rule__Date__Group__44845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Date__Group__4__Impl4873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__Group__5__Impl_in_rule__Date__Group__54904 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Date__Group__6_in_rule__Date__Group__54907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__YearAssignment_5_in_rule__Date__Group__5__Impl4934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__Group__6__Impl_in_rule__Date__Group__64964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Date__Group__6__Impl4992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group_0__0__Impl_in_rule__Language__Group_0__05037 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Language__Group_0__1_in_rule__Language__Group_0__05040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group_0__1__Impl_in_rule__Language__Group_0__15098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Language__Group_0__1__Impl5126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group_1__0__Impl_in_rule__Language__Group_1__05161 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_rule__Language__Group_1__1_in_rule__Language__Group_1__05164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group_1__1__Impl_in_rule__Language__Group_1__15222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Language__Group_1__1__Impl5250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Price__Group__0__Impl_in_rule__Price__Group__05285 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Price__Group__1_in_rule__Price__Group__05288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Price__Group__0__Impl5316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Price__Group__1__Impl_in_rule__Price__Group__15347 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_rule__Price__Group__2_in_rule__Price__Group__15350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Price__ValueAssignment_1_in_rule__Price__Group__1__Impl5377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Price__Group__2__Impl_in_rule__Price__Group__25407 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Price__Group__3_in_rule__Price__Group__25410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Price__CurrencyAssignment_2_in_rule__Price__Group__2__Impl5437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Price__Group__3__Impl_in_rule__Price__Group__35467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Price__Group__3__Impl5495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Currency__Group_0__0__Impl_in_rule__Currency__Group_0__05534 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Currency__Group_0__1_in_rule__Currency__Group_0__05537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Currency__Group_0__1__Impl_in_rule__Currency__Group_0__15595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Currency__Group_0__1__Impl5623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Currency__Group_1__0__Impl_in_rule__Currency__Group_1__05658 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_rule__Currency__Group_1__1_in_rule__Currency__Group_1__05661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Currency__Group_1__1__Impl_in_rule__Currency__Group_1__15719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Currency__Group_1__1__Impl5747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Topic__Group__0__Impl_in_rule__Topic__Group__05782 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Topic__Group__1_in_rule__Topic__Group__05785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Topic__Group__0__Impl5813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Topic__Group__1__Impl_in_rule__Topic__Group__15844 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Topic__Group__2_in_rule__Topic__Group__15847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Topic__NameAssignment_1_in_rule__Topic__Group__1__Impl5874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Topic__Group__2__Impl_in_rule__Topic__Group__25904 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Topic__Group__3_in_rule__Topic__Group__25907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Topic__Group__2__Impl5935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Topic__Group__3__Impl_in_rule__Topic__Group__35966 = new BitSet(new long[]{0x0000080000008000L});
    public static final BitSet FOLLOW_rule__Topic__Group__4_in_rule__Topic__Group__35969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Topic__TagsAssignment_3_in_rule__Topic__Group__3__Impl5996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Topic__Group__4__Impl_in_rule__Topic__Group__46026 = new BitSet(new long[]{0x0000080000008000L});
    public static final BitSet FOLLOW_rule__Topic__Group__5_in_rule__Topic__Group__46029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Topic__Group_4__0_in_rule__Topic__Group__4__Impl6056 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__Topic__Group__5__Impl_in_rule__Topic__Group__56087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Topic__Group__5__Impl6115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Topic__Group_4__0__Impl_in_rule__Topic__Group_4__06158 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Topic__Group_4__1_in_rule__Topic__Group_4__06161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Topic__Group_4__0__Impl6189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Topic__Group_4__1__Impl_in_rule__Topic__Group_4__16220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Topic__TagsAssignment_4_1_in_rule__Topic__Group_4__1__Impl6247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feedlinks__Group__0__Impl_in_rule__Feedlinks__Group__06281 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Feedlinks__Group__1_in_rule__Feedlinks__Group__06284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Feedlinks__Group__0__Impl6312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feedlinks__Group__1__Impl_in_rule__Feedlinks__Group__16343 = new BitSet(new long[]{0x0000080000008000L});
    public static final BitSet FOLLOW_rule__Feedlinks__Group__2_in_rule__Feedlinks__Group__16346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feedlinks__PairsAssignment_1_in_rule__Feedlinks__Group__1__Impl6373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feedlinks__Group__2__Impl_in_rule__Feedlinks__Group__26403 = new BitSet(new long[]{0x0000080000008000L});
    public static final BitSet FOLLOW_rule__Feedlinks__Group__3_in_rule__Feedlinks__Group__26406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feedlinks__Group_2__0_in_rule__Feedlinks__Group__2__Impl6433 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__Feedlinks__Group__3__Impl_in_rule__Feedlinks__Group__36464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Feedlinks__Group__3__Impl6492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feedlinks__Group_2__0__Impl_in_rule__Feedlinks__Group_2__06531 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Feedlinks__Group_2__1_in_rule__Feedlinks__Group_2__06534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Feedlinks__Group_2__0__Impl6562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feedlinks__Group_2__1__Impl_in_rule__Feedlinks__Group_2__16593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feedlinks__PairsAssignment_2_1_in_rule__Feedlinks__Group_2__1__Impl6620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pair__Group__0__Impl_in_rule__Pair__Group__06654 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Pair__Group__1_in_rule__Pair__Group__06657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Pair__Group__0__Impl6685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pair__Group__1__Impl_in_rule__Pair__Group__16716 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Pair__Group__2_in_rule__Pair__Group__16719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pair__KeyAssignment_1_in_rule__Pair__Group__1__Impl6746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pair__Group__2__Impl_in_rule__Pair__Group__26776 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Pair__Group__3_in_rule__Pair__Group__26779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pair__ValueAssignment_2_in_rule__Pair__Group__2__Impl6806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pair__Group__3__Impl_in_rule__Pair__Group__36836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Pair__Group__3__Impl6864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Declaration__NameAssignment_16908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeedlinks_in_rule__Declaration__FeedlinksAssignment_36939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopic_in_rule__Declaration__TopicsAssignment_66970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopic_in_rule__Declaration__TopicsAssignment_77001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_in_rule__Declaration__DateAssignment_9_17032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Declaration__LocationAssignment_10_17063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrice_in_rule__Declaration__PriceAssignment_127094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Declaration__VolumeAssignment_13_17125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLanguage_in_rule__Declaration__LanguageAssignment_157156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormat_in_rule__Declaration__FormatAssignment_177187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Declaration__Article_cntAssignment_197218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Declaration__Article_char_minAssignment_217249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Declaration__Article_char_maxAssignment_237280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Declaration__Article_imagesAssignment_24_17311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Declaration__Columns_cntAssignment_267342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFontSize_in_rule__Declaration__Font_sizeAssignment_287373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Date__DayAssignment_17404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Date__MonthAssignment_37435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Date__YearAssignment_57466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Price__ValueAssignment_17497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCurrency_in_rule__Price__CurrencyAssignment_27528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Topic__NameAssignment_17559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopicTag_in_rule__Topic__TagsAssignment_37590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopicTag_in_rule__Topic__TagsAssignment_4_17621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TopicTag__ValueAssignment7652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePair_in_rule__Feedlinks__PairsAssignment_17683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePair_in_rule__Feedlinks__PairsAssignment_2_17714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Pair__KeyAssignment_17745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Pair__ValueAssignment_27776 = new BitSet(new long[]{0x0000000000000002L});

}