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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_URL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "','", "'newspaper'", "'{'", "'feed links'", "'}'", "'topics'", "'price'", "'language'", "'format'", "'number of articles per topic'", "'number of words per article'", "'-'", "'number of columns'", "'font size'", "', '", "'date'", "'location'", "'volume'", "'number of images per article'", "'small'", "'medium'", "'large'", "'DIN A6'", "'DIN A5'", "'DIN A4'", "'DIN A3'", "'DIN A2'", "'DIN A1'", "'DIN A0'", "'English'", "'German'", "'Euro [\\u20AC]'", "'Dollar [$]'", "'topic'", "':'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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


    // $ANTLR start "entryRuleImagesCount"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:88:1: entryRuleImagesCount : ruleImagesCount EOF ;
    public final void entryRuleImagesCount() throws RecognitionException {
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:89:1: ( ruleImagesCount EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:90:1: ruleImagesCount EOF
            {
             before(grammarAccess.getImagesCountRule()); 
            pushFollow(FOLLOW_ruleImagesCount_in_entryRuleImagesCount121);
            ruleImagesCount();

            state._fsp--;

             after(grammarAccess.getImagesCountRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImagesCount128); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:97:1: ruleImagesCount : ( ( rule__ImagesCount__ValueAssignment ) ) ;
    public final void ruleImagesCount() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:101:2: ( ( ( rule__ImagesCount__ValueAssignment ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:102:1: ( ( rule__ImagesCount__ValueAssignment ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:102:1: ( ( rule__ImagesCount__ValueAssignment ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:103:1: ( rule__ImagesCount__ValueAssignment )
            {
             before(grammarAccess.getImagesCountAccess().getValueAssignment()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:104:1: ( rule__ImagesCount__ValueAssignment )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:104:2: rule__ImagesCount__ValueAssignment
            {
            pushFollow(FOLLOW_rule__ImagesCount__ValueAssignment_in_ruleImagesCount154);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:116:1: entryRuleFontSize : ruleFontSize EOF ;
    public final void entryRuleFontSize() throws RecognitionException {
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:117:1: ( ruleFontSize EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:118:1: ruleFontSize EOF
            {
             before(grammarAccess.getFontSizeRule()); 
            pushFollow(FOLLOW_ruleFontSize_in_entryRuleFontSize181);
            ruleFontSize();

            state._fsp--;

             after(grammarAccess.getFontSizeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFontSize188); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:125:1: ruleFontSize : ( ( rule__FontSize__Alternatives ) ) ;
    public final void ruleFontSize() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:129:2: ( ( ( rule__FontSize__Alternatives ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:130:1: ( ( rule__FontSize__Alternatives ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:130:1: ( ( rule__FontSize__Alternatives ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:131:1: ( rule__FontSize__Alternatives )
            {
             before(grammarAccess.getFontSizeAccess().getAlternatives()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:132:1: ( rule__FontSize__Alternatives )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:132:2: rule__FontSize__Alternatives
            {
            pushFollow(FOLLOW_rule__FontSize__Alternatives_in_ruleFontSize214);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:144:1: entryRuleFormat : ruleFormat EOF ;
    public final void entryRuleFormat() throws RecognitionException {
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:145:1: ( ruleFormat EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:146:1: ruleFormat EOF
            {
             before(grammarAccess.getFormatRule()); 
            pushFollow(FOLLOW_ruleFormat_in_entryRuleFormat241);
            ruleFormat();

            state._fsp--;

             after(grammarAccess.getFormatRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormat248); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:153:1: ruleFormat : ( ( rule__Format__Alternatives ) ) ;
    public final void ruleFormat() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:157:2: ( ( ( rule__Format__Alternatives ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:158:1: ( ( rule__Format__Alternatives ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:158:1: ( ( rule__Format__Alternatives ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:159:1: ( rule__Format__Alternatives )
            {
             before(grammarAccess.getFormatAccess().getAlternatives()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:160:1: ( rule__Format__Alternatives )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:160:2: rule__Format__Alternatives
            {
            pushFollow(FOLLOW_rule__Format__Alternatives_in_ruleFormat274);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:172:1: entryRuleDate : ruleDate EOF ;
    public final void entryRuleDate() throws RecognitionException {
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:173:1: ( ruleDate EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:174:1: ruleDate EOF
            {
             before(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_ruleDate_in_entryRuleDate301);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getDateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDate308); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:181:1: ruleDate : ( ( rule__Date__Group__0 ) ) ;
    public final void ruleDate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:185:2: ( ( ( rule__Date__Group__0 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:186:1: ( ( rule__Date__Group__0 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:186:1: ( ( rule__Date__Group__0 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:187:1: ( rule__Date__Group__0 )
            {
             before(grammarAccess.getDateAccess().getGroup()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:188:1: ( rule__Date__Group__0 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:188:2: rule__Date__Group__0
            {
            pushFollow(FOLLOW_rule__Date__Group__0_in_ruleDate334);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:200:1: entryRuleLanguage : ruleLanguage EOF ;
    public final void entryRuleLanguage() throws RecognitionException {
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:201:1: ( ruleLanguage EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:202:1: ruleLanguage EOF
            {
             before(grammarAccess.getLanguageRule()); 
            pushFollow(FOLLOW_ruleLanguage_in_entryRuleLanguage361);
            ruleLanguage();

            state._fsp--;

             after(grammarAccess.getLanguageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLanguage368); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:209:1: ruleLanguage : ( ( rule__Language__Alternatives ) ) ;
    public final void ruleLanguage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:213:2: ( ( ( rule__Language__Alternatives ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:214:1: ( ( rule__Language__Alternatives ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:214:1: ( ( rule__Language__Alternatives ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:215:1: ( rule__Language__Alternatives )
            {
             before(grammarAccess.getLanguageAccess().getAlternatives()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:216:1: ( rule__Language__Alternatives )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:216:2: rule__Language__Alternatives
            {
            pushFollow(FOLLOW_rule__Language__Alternatives_in_ruleLanguage394);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:228:1: entryRulePrice : rulePrice EOF ;
    public final void entryRulePrice() throws RecognitionException {
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:229:1: ( rulePrice EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:230:1: rulePrice EOF
            {
             before(grammarAccess.getPriceRule()); 
            pushFollow(FOLLOW_rulePrice_in_entryRulePrice421);
            rulePrice();

            state._fsp--;

             after(grammarAccess.getPriceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrice428); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:237:1: rulePrice : ( ( rule__Price__Group__0 ) ) ;
    public final void rulePrice() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:241:2: ( ( ( rule__Price__Group__0 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:242:1: ( ( rule__Price__Group__0 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:242:1: ( ( rule__Price__Group__0 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:243:1: ( rule__Price__Group__0 )
            {
             before(grammarAccess.getPriceAccess().getGroup()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:244:1: ( rule__Price__Group__0 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:244:2: rule__Price__Group__0
            {
            pushFollow(FOLLOW_rule__Price__Group__0_in_rulePrice454);
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


    // $ANTLR start "entryRuleFloat"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:368:1: entryRuleFloat : ruleFloat EOF ;
    public final void entryRuleFloat() throws RecognitionException {
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:369:1: ( ruleFloat EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:370:1: ruleFloat EOF
            {
             before(grammarAccess.getFloatRule()); 
            pushFollow(FOLLOW_ruleFloat_in_entryRuleFloat721);
            ruleFloat();

            state._fsp--;

             after(grammarAccess.getFloatRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloat728); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:377:1: ruleFloat : ( ( rule__Float__Group__0 ) ) ;
    public final void ruleFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:381:2: ( ( ( rule__Float__Group__0 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:382:1: ( ( rule__Float__Group__0 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:382:1: ( ( rule__Float__Group__0 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:383:1: ( rule__Float__Group__0 )
            {
             before(grammarAccess.getFloatAccess().getGroup()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:384:1: ( rule__Float__Group__0 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:384:2: rule__Float__Group__0
            {
            pushFollow(FOLLOW_rule__Float__Group__0_in_ruleFloat754);
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


    // $ANTLR start "rule__FontSize__Alternatives"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:396:1: rule__FontSize__Alternatives : ( ( ( rule__FontSize__Group_0__0 ) ) | ( ( rule__FontSize__Group_1__0 ) ) | ( ( rule__FontSize__Group_2__0 ) ) );
    public final void rule__FontSize__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:400:1: ( ( ( rule__FontSize__Group_0__0 ) ) | ( ( rule__FontSize__Group_1__0 ) ) | ( ( rule__FontSize__Group_2__0 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt1=1;
                }
                break;
            case 33:
                {
                alt1=2;
                }
                break;
            case 34:
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
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:401:1: ( ( rule__FontSize__Group_0__0 ) )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:401:1: ( ( rule__FontSize__Group_0__0 ) )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:402:1: ( rule__FontSize__Group_0__0 )
                    {
                     before(grammarAccess.getFontSizeAccess().getGroup_0()); 
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:403:1: ( rule__FontSize__Group_0__0 )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:403:2: rule__FontSize__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__FontSize__Group_0__0_in_rule__FontSize__Alternatives790);
                    rule__FontSize__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFontSizeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:407:6: ( ( rule__FontSize__Group_1__0 ) )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:407:6: ( ( rule__FontSize__Group_1__0 ) )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:408:1: ( rule__FontSize__Group_1__0 )
                    {
                     before(grammarAccess.getFontSizeAccess().getGroup_1()); 
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:409:1: ( rule__FontSize__Group_1__0 )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:409:2: rule__FontSize__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__FontSize__Group_1__0_in_rule__FontSize__Alternatives808);
                    rule__FontSize__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFontSizeAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:413:6: ( ( rule__FontSize__Group_2__0 ) )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:413:6: ( ( rule__FontSize__Group_2__0 ) )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:414:1: ( rule__FontSize__Group_2__0 )
                    {
                     before(grammarAccess.getFontSizeAccess().getGroup_2()); 
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:415:1: ( rule__FontSize__Group_2__0 )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:415:2: rule__FontSize__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__FontSize__Group_2__0_in_rule__FontSize__Alternatives826);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:424:1: rule__Format__Alternatives : ( ( ( rule__Format__Group_0__0 ) ) | ( ( rule__Format__Group_1__0 ) ) | ( ( rule__Format__Group_2__0 ) ) | ( ( rule__Format__Group_3__0 ) ) | ( ( rule__Format__Group_4__0 ) ) | ( ( rule__Format__Group_5__0 ) ) | ( ( rule__Format__Group_6__0 ) ) );
    public final void rule__Format__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:428:1: ( ( ( rule__Format__Group_0__0 ) ) | ( ( rule__Format__Group_1__0 ) ) | ( ( rule__Format__Group_2__0 ) ) | ( ( rule__Format__Group_3__0 ) ) | ( ( rule__Format__Group_4__0 ) ) | ( ( rule__Format__Group_5__0 ) ) | ( ( rule__Format__Group_6__0 ) ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt2=1;
                }
                break;
            case 36:
                {
                alt2=2;
                }
                break;
            case 37:
                {
                alt2=3;
                }
                break;
            case 38:
                {
                alt2=4;
                }
                break;
            case 39:
                {
                alt2=5;
                }
                break;
            case 40:
                {
                alt2=6;
                }
                break;
            case 41:
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
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:429:1: ( ( rule__Format__Group_0__0 ) )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:429:1: ( ( rule__Format__Group_0__0 ) )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:430:1: ( rule__Format__Group_0__0 )
                    {
                     before(grammarAccess.getFormatAccess().getGroup_0()); 
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:431:1: ( rule__Format__Group_0__0 )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:431:2: rule__Format__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Format__Group_0__0_in_rule__Format__Alternatives859);
                    rule__Format__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormatAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:435:6: ( ( rule__Format__Group_1__0 ) )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:435:6: ( ( rule__Format__Group_1__0 ) )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:436:1: ( rule__Format__Group_1__0 )
                    {
                     before(grammarAccess.getFormatAccess().getGroup_1()); 
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:437:1: ( rule__Format__Group_1__0 )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:437:2: rule__Format__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Format__Group_1__0_in_rule__Format__Alternatives877);
                    rule__Format__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormatAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:441:6: ( ( rule__Format__Group_2__0 ) )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:441:6: ( ( rule__Format__Group_2__0 ) )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:442:1: ( rule__Format__Group_2__0 )
                    {
                     before(grammarAccess.getFormatAccess().getGroup_2()); 
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:443:1: ( rule__Format__Group_2__0 )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:443:2: rule__Format__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Format__Group_2__0_in_rule__Format__Alternatives895);
                    rule__Format__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormatAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:447:6: ( ( rule__Format__Group_3__0 ) )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:447:6: ( ( rule__Format__Group_3__0 ) )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:448:1: ( rule__Format__Group_3__0 )
                    {
                     before(grammarAccess.getFormatAccess().getGroup_3()); 
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:449:1: ( rule__Format__Group_3__0 )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:449:2: rule__Format__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Format__Group_3__0_in_rule__Format__Alternatives913);
                    rule__Format__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormatAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:453:6: ( ( rule__Format__Group_4__0 ) )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:453:6: ( ( rule__Format__Group_4__0 ) )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:454:1: ( rule__Format__Group_4__0 )
                    {
                     before(grammarAccess.getFormatAccess().getGroup_4()); 
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:455:1: ( rule__Format__Group_4__0 )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:455:2: rule__Format__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Format__Group_4__0_in_rule__Format__Alternatives931);
                    rule__Format__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormatAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:459:6: ( ( rule__Format__Group_5__0 ) )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:459:6: ( ( rule__Format__Group_5__0 ) )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:460:1: ( rule__Format__Group_5__0 )
                    {
                     before(grammarAccess.getFormatAccess().getGroup_5()); 
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:461:1: ( rule__Format__Group_5__0 )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:461:2: rule__Format__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Format__Group_5__0_in_rule__Format__Alternatives949);
                    rule__Format__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormatAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:465:6: ( ( rule__Format__Group_6__0 ) )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:465:6: ( ( rule__Format__Group_6__0 ) )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:466:1: ( rule__Format__Group_6__0 )
                    {
                     before(grammarAccess.getFormatAccess().getGroup_6()); 
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:467:1: ( rule__Format__Group_6__0 )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:467:2: rule__Format__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Format__Group_6__0_in_rule__Format__Alternatives967);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:476:1: rule__Language__Alternatives : ( ( ( rule__Language__Group_0__0 ) ) | ( ( rule__Language__Group_1__0 ) ) );
    public final void rule__Language__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:480:1: ( ( ( rule__Language__Group_0__0 ) ) | ( ( rule__Language__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==42) ) {
                alt3=1;
            }
            else if ( (LA3_0==43) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:481:1: ( ( rule__Language__Group_0__0 ) )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:481:1: ( ( rule__Language__Group_0__0 ) )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:482:1: ( rule__Language__Group_0__0 )
                    {
                     before(grammarAccess.getLanguageAccess().getGroup_0()); 
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:483:1: ( rule__Language__Group_0__0 )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:483:2: rule__Language__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Language__Group_0__0_in_rule__Language__Alternatives1000);
                    rule__Language__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLanguageAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:487:6: ( ( rule__Language__Group_1__0 ) )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:487:6: ( ( rule__Language__Group_1__0 ) )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:488:1: ( rule__Language__Group_1__0 )
                    {
                     before(grammarAccess.getLanguageAccess().getGroup_1()); 
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:489:1: ( rule__Language__Group_1__0 )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:489:2: rule__Language__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Language__Group_1__0_in_rule__Language__Alternatives1018);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:498:1: rule__Currency__Alternatives : ( ( ( rule__Currency__Group_0__0 ) ) | ( ( rule__Currency__Group_1__0 ) ) );
    public final void rule__Currency__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:502:1: ( ( ( rule__Currency__Group_0__0 ) ) | ( ( rule__Currency__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==44) ) {
                alt4=1;
            }
            else if ( (LA4_0==45) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:503:1: ( ( rule__Currency__Group_0__0 ) )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:503:1: ( ( rule__Currency__Group_0__0 ) )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:504:1: ( rule__Currency__Group_0__0 )
                    {
                     before(grammarAccess.getCurrencyAccess().getGroup_0()); 
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:505:1: ( rule__Currency__Group_0__0 )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:505:2: rule__Currency__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Currency__Group_0__0_in_rule__Currency__Alternatives1051);
                    rule__Currency__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCurrencyAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:509:6: ( ( rule__Currency__Group_1__0 ) )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:509:6: ( ( rule__Currency__Group_1__0 ) )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:510:1: ( rule__Currency__Group_1__0 )
                    {
                     before(grammarAccess.getCurrencyAccess().getGroup_1()); 
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:511:1: ( rule__Currency__Group_1__0 )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:511:2: rule__Currency__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Currency__Group_1__0_in_rule__Currency__Alternatives1069);
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


    // $ANTLR start "rule__Float__Alternatives_1_0"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:520:1: rule__Float__Alternatives_1_0 : ( ( '.' ) | ( ',' ) );
    public final void rule__Float__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:524:1: ( ( '.' ) | ( ',' ) )
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
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:525:1: ( '.' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:525:1: ( '.' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:526:1: '.'
                    {
                     before(grammarAccess.getFloatAccess().getFullStopKeyword_1_0_0()); 
                    match(input,12,FOLLOW_12_in_rule__Float__Alternatives_1_01103); 
                     after(grammarAccess.getFloatAccess().getFullStopKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:533:6: ( ',' )
                    {
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:533:6: ( ',' )
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:534:1: ','
                    {
                     before(grammarAccess.getFloatAccess().getCommaKeyword_1_0_1()); 
                    match(input,13,FOLLOW_13_in_rule__Float__Alternatives_1_01123); 
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


    // $ANTLR start "rule__Declaration__Group__0"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:548:1: rule__Declaration__Group__0 : rule__Declaration__Group__0__Impl rule__Declaration__Group__1 ;
    public final void rule__Declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:552:1: ( rule__Declaration__Group__0__Impl rule__Declaration__Group__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:553:2: rule__Declaration__Group__0__Impl rule__Declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group__0__Impl_in_rule__Declaration__Group__01155);
            rule__Declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__1_in_rule__Declaration__Group__01158);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:560:1: rule__Declaration__Group__0__Impl : ( 'newspaper' ) ;
    public final void rule__Declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:564:1: ( ( 'newspaper' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:565:1: ( 'newspaper' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:565:1: ( 'newspaper' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:566:1: 'newspaper'
            {
             before(grammarAccess.getDeclarationAccess().getNewspaperKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Declaration__Group__0__Impl1186); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:579:1: rule__Declaration__Group__1 : rule__Declaration__Group__1__Impl rule__Declaration__Group__2 ;
    public final void rule__Declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:583:1: ( rule__Declaration__Group__1__Impl rule__Declaration__Group__2 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:584:2: rule__Declaration__Group__1__Impl rule__Declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Declaration__Group__1__Impl_in_rule__Declaration__Group__11217);
            rule__Declaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__2_in_rule__Declaration__Group__11220);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:591:1: rule__Declaration__Group__1__Impl : ( ( rule__Declaration__NameAssignment_1 ) ) ;
    public final void rule__Declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:595:1: ( ( ( rule__Declaration__NameAssignment_1 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:596:1: ( ( rule__Declaration__NameAssignment_1 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:596:1: ( ( rule__Declaration__NameAssignment_1 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:597:1: ( rule__Declaration__NameAssignment_1 )
            {
             before(grammarAccess.getDeclarationAccess().getNameAssignment_1()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:598:1: ( rule__Declaration__NameAssignment_1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:598:2: rule__Declaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Declaration__NameAssignment_1_in_rule__Declaration__Group__1__Impl1247);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:608:1: rule__Declaration__Group__2 : rule__Declaration__Group__2__Impl rule__Declaration__Group__3 ;
    public final void rule__Declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:612:1: ( rule__Declaration__Group__2__Impl rule__Declaration__Group__3 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:613:2: rule__Declaration__Group__2__Impl rule__Declaration__Group__3
            {
            pushFollow(FOLLOW_rule__Declaration__Group__2__Impl_in_rule__Declaration__Group__21277);
            rule__Declaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__3_in_rule__Declaration__Group__21280);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:620:1: rule__Declaration__Group__2__Impl : ( '{' ) ;
    public final void rule__Declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:624:1: ( ( '{' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:625:1: ( '{' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:625:1: ( '{' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:626:1: '{'
            {
             before(grammarAccess.getDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Declaration__Group__2__Impl1308); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:639:1: rule__Declaration__Group__3 : rule__Declaration__Group__3__Impl rule__Declaration__Group__4 ;
    public final void rule__Declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:643:1: ( rule__Declaration__Group__3__Impl rule__Declaration__Group__4 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:644:2: rule__Declaration__Group__3__Impl rule__Declaration__Group__4
            {
            pushFollow(FOLLOW_rule__Declaration__Group__3__Impl_in_rule__Declaration__Group__31339);
            rule__Declaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__4_in_rule__Declaration__Group__31342);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:651:1: rule__Declaration__Group__3__Impl : ( 'feed links' ) ;
    public final void rule__Declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:655:1: ( ( 'feed links' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:656:1: ( 'feed links' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:656:1: ( 'feed links' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:657:1: 'feed links'
            {
             before(grammarAccess.getDeclarationAccess().getFeedLinksKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__Declaration__Group__3__Impl1370); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:670:1: rule__Declaration__Group__4 : rule__Declaration__Group__4__Impl rule__Declaration__Group__5 ;
    public final void rule__Declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:674:1: ( rule__Declaration__Group__4__Impl rule__Declaration__Group__5 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:675:2: rule__Declaration__Group__4__Impl rule__Declaration__Group__5
            {
            pushFollow(FOLLOW_rule__Declaration__Group__4__Impl_in_rule__Declaration__Group__41401);
            rule__Declaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__5_in_rule__Declaration__Group__41404);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:682:1: rule__Declaration__Group__4__Impl : ( '{' ) ;
    public final void rule__Declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:686:1: ( ( '{' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:687:1: ( '{' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:687:1: ( '{' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:688:1: '{'
            {
             before(grammarAccess.getDeclarationAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__Declaration__Group__4__Impl1432); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:701:1: rule__Declaration__Group__5 : rule__Declaration__Group__5__Impl rule__Declaration__Group__6 ;
    public final void rule__Declaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:705:1: ( rule__Declaration__Group__5__Impl rule__Declaration__Group__6 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:706:2: rule__Declaration__Group__5__Impl rule__Declaration__Group__6
            {
            pushFollow(FOLLOW_rule__Declaration__Group__5__Impl_in_rule__Declaration__Group__51463);
            rule__Declaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__6_in_rule__Declaration__Group__51466);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:713:1: rule__Declaration__Group__5__Impl : ( ( rule__Declaration__FeedlinksAssignment_5 ) ) ;
    public final void rule__Declaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:717:1: ( ( ( rule__Declaration__FeedlinksAssignment_5 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:718:1: ( ( rule__Declaration__FeedlinksAssignment_5 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:718:1: ( ( rule__Declaration__FeedlinksAssignment_5 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:719:1: ( rule__Declaration__FeedlinksAssignment_5 )
            {
             before(grammarAccess.getDeclarationAccess().getFeedlinksAssignment_5()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:720:1: ( rule__Declaration__FeedlinksAssignment_5 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:720:2: rule__Declaration__FeedlinksAssignment_5
            {
            pushFollow(FOLLOW_rule__Declaration__FeedlinksAssignment_5_in_rule__Declaration__Group__5__Impl1493);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:730:1: rule__Declaration__Group__6 : rule__Declaration__Group__6__Impl rule__Declaration__Group__7 ;
    public final void rule__Declaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:734:1: ( rule__Declaration__Group__6__Impl rule__Declaration__Group__7 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:735:2: rule__Declaration__Group__6__Impl rule__Declaration__Group__7
            {
            pushFollow(FOLLOW_rule__Declaration__Group__6__Impl_in_rule__Declaration__Group__61523);
            rule__Declaration__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__7_in_rule__Declaration__Group__61526);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:742:1: rule__Declaration__Group__6__Impl : ( ( rule__Declaration__Group_6__0 )* ) ;
    public final void rule__Declaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:746:1: ( ( ( rule__Declaration__Group_6__0 )* ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:747:1: ( ( rule__Declaration__Group_6__0 )* )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:747:1: ( ( rule__Declaration__Group_6__0 )* )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:748:1: ( rule__Declaration__Group_6__0 )*
            {
             before(grammarAccess.getDeclarationAccess().getGroup_6()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:749:1: ( rule__Declaration__Group_6__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==27) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:749:2: rule__Declaration__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__Declaration__Group_6__0_in_rule__Declaration__Group__6__Impl1553);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:759:1: rule__Declaration__Group__7 : rule__Declaration__Group__7__Impl rule__Declaration__Group__8 ;
    public final void rule__Declaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:763:1: ( rule__Declaration__Group__7__Impl rule__Declaration__Group__8 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:764:2: rule__Declaration__Group__7__Impl rule__Declaration__Group__8
            {
            pushFollow(FOLLOW_rule__Declaration__Group__7__Impl_in_rule__Declaration__Group__71584);
            rule__Declaration__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__8_in_rule__Declaration__Group__71587);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:771:1: rule__Declaration__Group__7__Impl : ( '}' ) ;
    public final void rule__Declaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:775:1: ( ( '}' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:776:1: ( '}' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:776:1: ( '}' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:777:1: '}'
            {
             before(grammarAccess.getDeclarationAccess().getRightCurlyBracketKeyword_7()); 
            match(input,17,FOLLOW_17_in_rule__Declaration__Group__7__Impl1615); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:790:1: rule__Declaration__Group__8 : rule__Declaration__Group__8__Impl rule__Declaration__Group__9 ;
    public final void rule__Declaration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:794:1: ( rule__Declaration__Group__8__Impl rule__Declaration__Group__9 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:795:2: rule__Declaration__Group__8__Impl rule__Declaration__Group__9
            {
            pushFollow(FOLLOW_rule__Declaration__Group__8__Impl_in_rule__Declaration__Group__81646);
            rule__Declaration__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__9_in_rule__Declaration__Group__81649);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:802:1: rule__Declaration__Group__8__Impl : ( 'topics' ) ;
    public final void rule__Declaration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:806:1: ( ( 'topics' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:807:1: ( 'topics' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:807:1: ( 'topics' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:808:1: 'topics'
            {
             before(grammarAccess.getDeclarationAccess().getTopicsKeyword_8()); 
            match(input,18,FOLLOW_18_in_rule__Declaration__Group__8__Impl1677); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:821:1: rule__Declaration__Group__9 : rule__Declaration__Group__9__Impl rule__Declaration__Group__10 ;
    public final void rule__Declaration__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:825:1: ( rule__Declaration__Group__9__Impl rule__Declaration__Group__10 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:826:2: rule__Declaration__Group__9__Impl rule__Declaration__Group__10
            {
            pushFollow(FOLLOW_rule__Declaration__Group__9__Impl_in_rule__Declaration__Group__91708);
            rule__Declaration__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__10_in_rule__Declaration__Group__91711);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:833:1: rule__Declaration__Group__9__Impl : ( '{' ) ;
    public final void rule__Declaration__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:837:1: ( ( '{' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:838:1: ( '{' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:838:1: ( '{' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:839:1: '{'
            {
             before(grammarAccess.getDeclarationAccess().getLeftCurlyBracketKeyword_9()); 
            match(input,15,FOLLOW_15_in_rule__Declaration__Group__9__Impl1739); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:852:1: rule__Declaration__Group__10 : rule__Declaration__Group__10__Impl rule__Declaration__Group__11 ;
    public final void rule__Declaration__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:856:1: ( rule__Declaration__Group__10__Impl rule__Declaration__Group__11 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:857:2: rule__Declaration__Group__10__Impl rule__Declaration__Group__11
            {
            pushFollow(FOLLOW_rule__Declaration__Group__10__Impl_in_rule__Declaration__Group__101770);
            rule__Declaration__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__11_in_rule__Declaration__Group__101773);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:864:1: rule__Declaration__Group__10__Impl : ( ( rule__Declaration__TopicsAssignment_10 ) ) ;
    public final void rule__Declaration__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:868:1: ( ( ( rule__Declaration__TopicsAssignment_10 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:869:1: ( ( rule__Declaration__TopicsAssignment_10 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:869:1: ( ( rule__Declaration__TopicsAssignment_10 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:870:1: ( rule__Declaration__TopicsAssignment_10 )
            {
             before(grammarAccess.getDeclarationAccess().getTopicsAssignment_10()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:871:1: ( rule__Declaration__TopicsAssignment_10 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:871:2: rule__Declaration__TopicsAssignment_10
            {
            pushFollow(FOLLOW_rule__Declaration__TopicsAssignment_10_in_rule__Declaration__Group__10__Impl1800);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:881:1: rule__Declaration__Group__11 : rule__Declaration__Group__11__Impl rule__Declaration__Group__12 ;
    public final void rule__Declaration__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:885:1: ( rule__Declaration__Group__11__Impl rule__Declaration__Group__12 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:886:2: rule__Declaration__Group__11__Impl rule__Declaration__Group__12
            {
            pushFollow(FOLLOW_rule__Declaration__Group__11__Impl_in_rule__Declaration__Group__111830);
            rule__Declaration__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__12_in_rule__Declaration__Group__111833);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:893:1: rule__Declaration__Group__11__Impl : ( ( rule__Declaration__TopicsAssignment_11 )* ) ;
    public final void rule__Declaration__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:897:1: ( ( ( rule__Declaration__TopicsAssignment_11 )* ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:898:1: ( ( rule__Declaration__TopicsAssignment_11 )* )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:898:1: ( ( rule__Declaration__TopicsAssignment_11 )* )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:899:1: ( rule__Declaration__TopicsAssignment_11 )*
            {
             before(grammarAccess.getDeclarationAccess().getTopicsAssignment_11()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:900:1: ( rule__Declaration__TopicsAssignment_11 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==46) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:900:2: rule__Declaration__TopicsAssignment_11
            	    {
            	    pushFollow(FOLLOW_rule__Declaration__TopicsAssignment_11_in_rule__Declaration__Group__11__Impl1860);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:910:1: rule__Declaration__Group__12 : rule__Declaration__Group__12__Impl rule__Declaration__Group__13 ;
    public final void rule__Declaration__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:914:1: ( rule__Declaration__Group__12__Impl rule__Declaration__Group__13 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:915:2: rule__Declaration__Group__12__Impl rule__Declaration__Group__13
            {
            pushFollow(FOLLOW_rule__Declaration__Group__12__Impl_in_rule__Declaration__Group__121891);
            rule__Declaration__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__13_in_rule__Declaration__Group__121894);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:922:1: rule__Declaration__Group__12__Impl : ( '}' ) ;
    public final void rule__Declaration__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:926:1: ( ( '}' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:927:1: ( '}' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:927:1: ( '}' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:928:1: '}'
            {
             before(grammarAccess.getDeclarationAccess().getRightCurlyBracketKeyword_12()); 
            match(input,17,FOLLOW_17_in_rule__Declaration__Group__12__Impl1922); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:941:1: rule__Declaration__Group__13 : rule__Declaration__Group__13__Impl rule__Declaration__Group__14 ;
    public final void rule__Declaration__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:945:1: ( rule__Declaration__Group__13__Impl rule__Declaration__Group__14 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:946:2: rule__Declaration__Group__13__Impl rule__Declaration__Group__14
            {
            pushFollow(FOLLOW_rule__Declaration__Group__13__Impl_in_rule__Declaration__Group__131953);
            rule__Declaration__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__14_in_rule__Declaration__Group__131956);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:953:1: rule__Declaration__Group__13__Impl : ( ( rule__Declaration__Group_13__0 )? ) ;
    public final void rule__Declaration__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:957:1: ( ( ( rule__Declaration__Group_13__0 )? ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:958:1: ( ( rule__Declaration__Group_13__0 )? )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:958:1: ( ( rule__Declaration__Group_13__0 )? )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:959:1: ( rule__Declaration__Group_13__0 )?
            {
             before(grammarAccess.getDeclarationAccess().getGroup_13()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:960:1: ( rule__Declaration__Group_13__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:960:2: rule__Declaration__Group_13__0
                    {
                    pushFollow(FOLLOW_rule__Declaration__Group_13__0_in_rule__Declaration__Group__13__Impl1983);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:970:1: rule__Declaration__Group__14 : rule__Declaration__Group__14__Impl rule__Declaration__Group__15 ;
    public final void rule__Declaration__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:974:1: ( rule__Declaration__Group__14__Impl rule__Declaration__Group__15 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:975:2: rule__Declaration__Group__14__Impl rule__Declaration__Group__15
            {
            pushFollow(FOLLOW_rule__Declaration__Group__14__Impl_in_rule__Declaration__Group__142014);
            rule__Declaration__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__15_in_rule__Declaration__Group__142017);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:982:1: rule__Declaration__Group__14__Impl : ( ( rule__Declaration__Group_14__0 )? ) ;
    public final void rule__Declaration__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:986:1: ( ( ( rule__Declaration__Group_14__0 )? ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:987:1: ( ( rule__Declaration__Group_14__0 )? )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:987:1: ( ( rule__Declaration__Group_14__0 )? )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:988:1: ( rule__Declaration__Group_14__0 )?
            {
             before(grammarAccess.getDeclarationAccess().getGroup_14()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:989:1: ( rule__Declaration__Group_14__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:989:2: rule__Declaration__Group_14__0
                    {
                    pushFollow(FOLLOW_rule__Declaration__Group_14__0_in_rule__Declaration__Group__14__Impl2044);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:999:1: rule__Declaration__Group__15 : rule__Declaration__Group__15__Impl rule__Declaration__Group__16 ;
    public final void rule__Declaration__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1003:1: ( rule__Declaration__Group__15__Impl rule__Declaration__Group__16 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1004:2: rule__Declaration__Group__15__Impl rule__Declaration__Group__16
            {
            pushFollow(FOLLOW_rule__Declaration__Group__15__Impl_in_rule__Declaration__Group__152075);
            rule__Declaration__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__16_in_rule__Declaration__Group__152078);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1011:1: rule__Declaration__Group__15__Impl : ( 'price' ) ;
    public final void rule__Declaration__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1015:1: ( ( 'price' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1016:1: ( 'price' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1016:1: ( 'price' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1017:1: 'price'
            {
             before(grammarAccess.getDeclarationAccess().getPriceKeyword_15()); 
            match(input,19,FOLLOW_19_in_rule__Declaration__Group__15__Impl2106); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1030:1: rule__Declaration__Group__16 : rule__Declaration__Group__16__Impl rule__Declaration__Group__17 ;
    public final void rule__Declaration__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1034:1: ( rule__Declaration__Group__16__Impl rule__Declaration__Group__17 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1035:2: rule__Declaration__Group__16__Impl rule__Declaration__Group__17
            {
            pushFollow(FOLLOW_rule__Declaration__Group__16__Impl_in_rule__Declaration__Group__162137);
            rule__Declaration__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__17_in_rule__Declaration__Group__162140);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1042:1: rule__Declaration__Group__16__Impl : ( ( rule__Declaration__PriceAssignment_16 ) ) ;
    public final void rule__Declaration__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1046:1: ( ( ( rule__Declaration__PriceAssignment_16 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1047:1: ( ( rule__Declaration__PriceAssignment_16 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1047:1: ( ( rule__Declaration__PriceAssignment_16 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1048:1: ( rule__Declaration__PriceAssignment_16 )
            {
             before(grammarAccess.getDeclarationAccess().getPriceAssignment_16()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1049:1: ( rule__Declaration__PriceAssignment_16 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1049:2: rule__Declaration__PriceAssignment_16
            {
            pushFollow(FOLLOW_rule__Declaration__PriceAssignment_16_in_rule__Declaration__Group__16__Impl2167);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1059:1: rule__Declaration__Group__17 : rule__Declaration__Group__17__Impl rule__Declaration__Group__18 ;
    public final void rule__Declaration__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1063:1: ( rule__Declaration__Group__17__Impl rule__Declaration__Group__18 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1064:2: rule__Declaration__Group__17__Impl rule__Declaration__Group__18
            {
            pushFollow(FOLLOW_rule__Declaration__Group__17__Impl_in_rule__Declaration__Group__172197);
            rule__Declaration__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__18_in_rule__Declaration__Group__172200);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1071:1: rule__Declaration__Group__17__Impl : ( ( rule__Declaration__Group_17__0 )? ) ;
    public final void rule__Declaration__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1075:1: ( ( ( rule__Declaration__Group_17__0 )? ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1076:1: ( ( rule__Declaration__Group_17__0 )? )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1076:1: ( ( rule__Declaration__Group_17__0 )? )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1077:1: ( rule__Declaration__Group_17__0 )?
            {
             before(grammarAccess.getDeclarationAccess().getGroup_17()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1078:1: ( rule__Declaration__Group_17__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1078:2: rule__Declaration__Group_17__0
                    {
                    pushFollow(FOLLOW_rule__Declaration__Group_17__0_in_rule__Declaration__Group__17__Impl2227);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1088:1: rule__Declaration__Group__18 : rule__Declaration__Group__18__Impl rule__Declaration__Group__19 ;
    public final void rule__Declaration__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1092:1: ( rule__Declaration__Group__18__Impl rule__Declaration__Group__19 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1093:2: rule__Declaration__Group__18__Impl rule__Declaration__Group__19
            {
            pushFollow(FOLLOW_rule__Declaration__Group__18__Impl_in_rule__Declaration__Group__182258);
            rule__Declaration__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__19_in_rule__Declaration__Group__182261);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1100:1: rule__Declaration__Group__18__Impl : ( 'language' ) ;
    public final void rule__Declaration__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1104:1: ( ( 'language' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1105:1: ( 'language' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1105:1: ( 'language' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1106:1: 'language'
            {
             before(grammarAccess.getDeclarationAccess().getLanguageKeyword_18()); 
            match(input,20,FOLLOW_20_in_rule__Declaration__Group__18__Impl2289); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1119:1: rule__Declaration__Group__19 : rule__Declaration__Group__19__Impl rule__Declaration__Group__20 ;
    public final void rule__Declaration__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1123:1: ( rule__Declaration__Group__19__Impl rule__Declaration__Group__20 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1124:2: rule__Declaration__Group__19__Impl rule__Declaration__Group__20
            {
            pushFollow(FOLLOW_rule__Declaration__Group__19__Impl_in_rule__Declaration__Group__192320);
            rule__Declaration__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__20_in_rule__Declaration__Group__192323);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1131:1: rule__Declaration__Group__19__Impl : ( ( rule__Declaration__LanguageAssignment_19 ) ) ;
    public final void rule__Declaration__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1135:1: ( ( ( rule__Declaration__LanguageAssignment_19 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1136:1: ( ( rule__Declaration__LanguageAssignment_19 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1136:1: ( ( rule__Declaration__LanguageAssignment_19 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1137:1: ( rule__Declaration__LanguageAssignment_19 )
            {
             before(grammarAccess.getDeclarationAccess().getLanguageAssignment_19()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1138:1: ( rule__Declaration__LanguageAssignment_19 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1138:2: rule__Declaration__LanguageAssignment_19
            {
            pushFollow(FOLLOW_rule__Declaration__LanguageAssignment_19_in_rule__Declaration__Group__19__Impl2350);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1148:1: rule__Declaration__Group__20 : rule__Declaration__Group__20__Impl rule__Declaration__Group__21 ;
    public final void rule__Declaration__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1152:1: ( rule__Declaration__Group__20__Impl rule__Declaration__Group__21 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1153:2: rule__Declaration__Group__20__Impl rule__Declaration__Group__21
            {
            pushFollow(FOLLOW_rule__Declaration__Group__20__Impl_in_rule__Declaration__Group__202380);
            rule__Declaration__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__21_in_rule__Declaration__Group__202383);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1160:1: rule__Declaration__Group__20__Impl : ( 'format' ) ;
    public final void rule__Declaration__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1164:1: ( ( 'format' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1165:1: ( 'format' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1165:1: ( 'format' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1166:1: 'format'
            {
             before(grammarAccess.getDeclarationAccess().getFormatKeyword_20()); 
            match(input,21,FOLLOW_21_in_rule__Declaration__Group__20__Impl2411); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1179:1: rule__Declaration__Group__21 : rule__Declaration__Group__21__Impl rule__Declaration__Group__22 ;
    public final void rule__Declaration__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1183:1: ( rule__Declaration__Group__21__Impl rule__Declaration__Group__22 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1184:2: rule__Declaration__Group__21__Impl rule__Declaration__Group__22
            {
            pushFollow(FOLLOW_rule__Declaration__Group__21__Impl_in_rule__Declaration__Group__212442);
            rule__Declaration__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__22_in_rule__Declaration__Group__212445);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1191:1: rule__Declaration__Group__21__Impl : ( ( rule__Declaration__FormatAssignment_21 ) ) ;
    public final void rule__Declaration__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1195:1: ( ( ( rule__Declaration__FormatAssignment_21 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1196:1: ( ( rule__Declaration__FormatAssignment_21 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1196:1: ( ( rule__Declaration__FormatAssignment_21 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1197:1: ( rule__Declaration__FormatAssignment_21 )
            {
             before(grammarAccess.getDeclarationAccess().getFormatAssignment_21()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1198:1: ( rule__Declaration__FormatAssignment_21 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1198:2: rule__Declaration__FormatAssignment_21
            {
            pushFollow(FOLLOW_rule__Declaration__FormatAssignment_21_in_rule__Declaration__Group__21__Impl2472);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1208:1: rule__Declaration__Group__22 : rule__Declaration__Group__22__Impl rule__Declaration__Group__23 ;
    public final void rule__Declaration__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1212:1: ( rule__Declaration__Group__22__Impl rule__Declaration__Group__23 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1213:2: rule__Declaration__Group__22__Impl rule__Declaration__Group__23
            {
            pushFollow(FOLLOW_rule__Declaration__Group__22__Impl_in_rule__Declaration__Group__222502);
            rule__Declaration__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__23_in_rule__Declaration__Group__222505);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1220:1: rule__Declaration__Group__22__Impl : ( 'number of articles per topic' ) ;
    public final void rule__Declaration__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1224:1: ( ( 'number of articles per topic' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1225:1: ( 'number of articles per topic' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1225:1: ( 'number of articles per topic' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1226:1: 'number of articles per topic'
            {
             before(grammarAccess.getDeclarationAccess().getNumberOfArticlesPerTopicKeyword_22()); 
            match(input,22,FOLLOW_22_in_rule__Declaration__Group__22__Impl2533); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1239:1: rule__Declaration__Group__23 : rule__Declaration__Group__23__Impl rule__Declaration__Group__24 ;
    public final void rule__Declaration__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1243:1: ( rule__Declaration__Group__23__Impl rule__Declaration__Group__24 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1244:2: rule__Declaration__Group__23__Impl rule__Declaration__Group__24
            {
            pushFollow(FOLLOW_rule__Declaration__Group__23__Impl_in_rule__Declaration__Group__232564);
            rule__Declaration__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__24_in_rule__Declaration__Group__232567);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1251:1: rule__Declaration__Group__23__Impl : ( ( rule__Declaration__ArticleCntAssignment_23 ) ) ;
    public final void rule__Declaration__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1255:1: ( ( ( rule__Declaration__ArticleCntAssignment_23 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1256:1: ( ( rule__Declaration__ArticleCntAssignment_23 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1256:1: ( ( rule__Declaration__ArticleCntAssignment_23 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1257:1: ( rule__Declaration__ArticleCntAssignment_23 )
            {
             before(grammarAccess.getDeclarationAccess().getArticleCntAssignment_23()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1258:1: ( rule__Declaration__ArticleCntAssignment_23 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1258:2: rule__Declaration__ArticleCntAssignment_23
            {
            pushFollow(FOLLOW_rule__Declaration__ArticleCntAssignment_23_in_rule__Declaration__Group__23__Impl2594);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1268:1: rule__Declaration__Group__24 : rule__Declaration__Group__24__Impl rule__Declaration__Group__25 ;
    public final void rule__Declaration__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1272:1: ( rule__Declaration__Group__24__Impl rule__Declaration__Group__25 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1273:2: rule__Declaration__Group__24__Impl rule__Declaration__Group__25
            {
            pushFollow(FOLLOW_rule__Declaration__Group__24__Impl_in_rule__Declaration__Group__242624);
            rule__Declaration__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__25_in_rule__Declaration__Group__242627);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1280:1: rule__Declaration__Group__24__Impl : ( 'number of words per article' ) ;
    public final void rule__Declaration__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1284:1: ( ( 'number of words per article' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1285:1: ( 'number of words per article' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1285:1: ( 'number of words per article' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1286:1: 'number of words per article'
            {
             before(grammarAccess.getDeclarationAccess().getNumberOfWordsPerArticleKeyword_24()); 
            match(input,23,FOLLOW_23_in_rule__Declaration__Group__24__Impl2655); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1299:1: rule__Declaration__Group__25 : rule__Declaration__Group__25__Impl rule__Declaration__Group__26 ;
    public final void rule__Declaration__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1303:1: ( rule__Declaration__Group__25__Impl rule__Declaration__Group__26 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1304:2: rule__Declaration__Group__25__Impl rule__Declaration__Group__26
            {
            pushFollow(FOLLOW_rule__Declaration__Group__25__Impl_in_rule__Declaration__Group__252686);
            rule__Declaration__Group__25__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__26_in_rule__Declaration__Group__252689);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1311:1: rule__Declaration__Group__25__Impl : ( ( rule__Declaration__ArticleWordsMinAssignment_25 ) ) ;
    public final void rule__Declaration__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1315:1: ( ( ( rule__Declaration__ArticleWordsMinAssignment_25 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1316:1: ( ( rule__Declaration__ArticleWordsMinAssignment_25 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1316:1: ( ( rule__Declaration__ArticleWordsMinAssignment_25 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1317:1: ( rule__Declaration__ArticleWordsMinAssignment_25 )
            {
             before(grammarAccess.getDeclarationAccess().getArticleWordsMinAssignment_25()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1318:1: ( rule__Declaration__ArticleWordsMinAssignment_25 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1318:2: rule__Declaration__ArticleWordsMinAssignment_25
            {
            pushFollow(FOLLOW_rule__Declaration__ArticleWordsMinAssignment_25_in_rule__Declaration__Group__25__Impl2716);
            rule__Declaration__ArticleWordsMinAssignment_25();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getArticleWordsMinAssignment_25()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1328:1: rule__Declaration__Group__26 : rule__Declaration__Group__26__Impl rule__Declaration__Group__27 ;
    public final void rule__Declaration__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1332:1: ( rule__Declaration__Group__26__Impl rule__Declaration__Group__27 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1333:2: rule__Declaration__Group__26__Impl rule__Declaration__Group__27
            {
            pushFollow(FOLLOW_rule__Declaration__Group__26__Impl_in_rule__Declaration__Group__262746);
            rule__Declaration__Group__26__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__27_in_rule__Declaration__Group__262749);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1340:1: rule__Declaration__Group__26__Impl : ( '-' ) ;
    public final void rule__Declaration__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1344:1: ( ( '-' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1345:1: ( '-' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1345:1: ( '-' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1346:1: '-'
            {
             before(grammarAccess.getDeclarationAccess().getHyphenMinusKeyword_26()); 
            match(input,24,FOLLOW_24_in_rule__Declaration__Group__26__Impl2777); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1359:1: rule__Declaration__Group__27 : rule__Declaration__Group__27__Impl rule__Declaration__Group__28 ;
    public final void rule__Declaration__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1363:1: ( rule__Declaration__Group__27__Impl rule__Declaration__Group__28 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1364:2: rule__Declaration__Group__27__Impl rule__Declaration__Group__28
            {
            pushFollow(FOLLOW_rule__Declaration__Group__27__Impl_in_rule__Declaration__Group__272808);
            rule__Declaration__Group__27__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__28_in_rule__Declaration__Group__272811);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1371:1: rule__Declaration__Group__27__Impl : ( ( rule__Declaration__ArticleWordsMaxAssignment_27 ) ) ;
    public final void rule__Declaration__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1375:1: ( ( ( rule__Declaration__ArticleWordsMaxAssignment_27 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1376:1: ( ( rule__Declaration__ArticleWordsMaxAssignment_27 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1376:1: ( ( rule__Declaration__ArticleWordsMaxAssignment_27 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1377:1: ( rule__Declaration__ArticleWordsMaxAssignment_27 )
            {
             before(grammarAccess.getDeclarationAccess().getArticleWordsMaxAssignment_27()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1378:1: ( rule__Declaration__ArticleWordsMaxAssignment_27 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1378:2: rule__Declaration__ArticleWordsMaxAssignment_27
            {
            pushFollow(FOLLOW_rule__Declaration__ArticleWordsMaxAssignment_27_in_rule__Declaration__Group__27__Impl2838);
            rule__Declaration__ArticleWordsMaxAssignment_27();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getArticleWordsMaxAssignment_27()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1388:1: rule__Declaration__Group__28 : rule__Declaration__Group__28__Impl rule__Declaration__Group__29 ;
    public final void rule__Declaration__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1392:1: ( rule__Declaration__Group__28__Impl rule__Declaration__Group__29 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1393:2: rule__Declaration__Group__28__Impl rule__Declaration__Group__29
            {
            pushFollow(FOLLOW_rule__Declaration__Group__28__Impl_in_rule__Declaration__Group__282868);
            rule__Declaration__Group__28__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__29_in_rule__Declaration__Group__282871);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1400:1: rule__Declaration__Group__28__Impl : ( ( rule__Declaration__Group_28__0 )? ) ;
    public final void rule__Declaration__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1404:1: ( ( ( rule__Declaration__Group_28__0 )? ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1405:1: ( ( rule__Declaration__Group_28__0 )? )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1405:1: ( ( rule__Declaration__Group_28__0 )? )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1406:1: ( rule__Declaration__Group_28__0 )?
            {
             before(grammarAccess.getDeclarationAccess().getGroup_28()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1407:1: ( rule__Declaration__Group_28__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1407:2: rule__Declaration__Group_28__0
                    {
                    pushFollow(FOLLOW_rule__Declaration__Group_28__0_in_rule__Declaration__Group__28__Impl2898);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1417:1: rule__Declaration__Group__29 : rule__Declaration__Group__29__Impl rule__Declaration__Group__30 ;
    public final void rule__Declaration__Group__29() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1421:1: ( rule__Declaration__Group__29__Impl rule__Declaration__Group__30 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1422:2: rule__Declaration__Group__29__Impl rule__Declaration__Group__30
            {
            pushFollow(FOLLOW_rule__Declaration__Group__29__Impl_in_rule__Declaration__Group__292929);
            rule__Declaration__Group__29__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__30_in_rule__Declaration__Group__292932);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1429:1: rule__Declaration__Group__29__Impl : ( 'number of columns' ) ;
    public final void rule__Declaration__Group__29__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1433:1: ( ( 'number of columns' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1434:1: ( 'number of columns' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1434:1: ( 'number of columns' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1435:1: 'number of columns'
            {
             before(grammarAccess.getDeclarationAccess().getNumberOfColumnsKeyword_29()); 
            match(input,25,FOLLOW_25_in_rule__Declaration__Group__29__Impl2960); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1448:1: rule__Declaration__Group__30 : rule__Declaration__Group__30__Impl rule__Declaration__Group__31 ;
    public final void rule__Declaration__Group__30() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1452:1: ( rule__Declaration__Group__30__Impl rule__Declaration__Group__31 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1453:2: rule__Declaration__Group__30__Impl rule__Declaration__Group__31
            {
            pushFollow(FOLLOW_rule__Declaration__Group__30__Impl_in_rule__Declaration__Group__302991);
            rule__Declaration__Group__30__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__31_in_rule__Declaration__Group__302994);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1460:1: rule__Declaration__Group__30__Impl : ( ( rule__Declaration__ColumnsCntAssignment_30 ) ) ;
    public final void rule__Declaration__Group__30__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1464:1: ( ( ( rule__Declaration__ColumnsCntAssignment_30 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1465:1: ( ( rule__Declaration__ColumnsCntAssignment_30 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1465:1: ( ( rule__Declaration__ColumnsCntAssignment_30 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1466:1: ( rule__Declaration__ColumnsCntAssignment_30 )
            {
             before(grammarAccess.getDeclarationAccess().getColumnsCntAssignment_30()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1467:1: ( rule__Declaration__ColumnsCntAssignment_30 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1467:2: rule__Declaration__ColumnsCntAssignment_30
            {
            pushFollow(FOLLOW_rule__Declaration__ColumnsCntAssignment_30_in_rule__Declaration__Group__30__Impl3021);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1477:1: rule__Declaration__Group__31 : rule__Declaration__Group__31__Impl rule__Declaration__Group__32 ;
    public final void rule__Declaration__Group__31() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1481:1: ( rule__Declaration__Group__31__Impl rule__Declaration__Group__32 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1482:2: rule__Declaration__Group__31__Impl rule__Declaration__Group__32
            {
            pushFollow(FOLLOW_rule__Declaration__Group__31__Impl_in_rule__Declaration__Group__313051);
            rule__Declaration__Group__31__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__32_in_rule__Declaration__Group__313054);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1489:1: rule__Declaration__Group__31__Impl : ( 'font size' ) ;
    public final void rule__Declaration__Group__31__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1493:1: ( ( 'font size' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1494:1: ( 'font size' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1494:1: ( 'font size' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1495:1: 'font size'
            {
             before(grammarAccess.getDeclarationAccess().getFontSizeKeyword_31()); 
            match(input,26,FOLLOW_26_in_rule__Declaration__Group__31__Impl3082); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1508:1: rule__Declaration__Group__32 : rule__Declaration__Group__32__Impl rule__Declaration__Group__33 ;
    public final void rule__Declaration__Group__32() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1512:1: ( rule__Declaration__Group__32__Impl rule__Declaration__Group__33 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1513:2: rule__Declaration__Group__32__Impl rule__Declaration__Group__33
            {
            pushFollow(FOLLOW_rule__Declaration__Group__32__Impl_in_rule__Declaration__Group__323113);
            rule__Declaration__Group__32__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__33_in_rule__Declaration__Group__323116);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1520:1: rule__Declaration__Group__32__Impl : ( ( rule__Declaration__FontSizeAssignment_32 ) ) ;
    public final void rule__Declaration__Group__32__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1524:1: ( ( ( rule__Declaration__FontSizeAssignment_32 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1525:1: ( ( rule__Declaration__FontSizeAssignment_32 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1525:1: ( ( rule__Declaration__FontSizeAssignment_32 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1526:1: ( rule__Declaration__FontSizeAssignment_32 )
            {
             before(grammarAccess.getDeclarationAccess().getFontSizeAssignment_32()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1527:1: ( rule__Declaration__FontSizeAssignment_32 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1527:2: rule__Declaration__FontSizeAssignment_32
            {
            pushFollow(FOLLOW_rule__Declaration__FontSizeAssignment_32_in_rule__Declaration__Group__32__Impl3143);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1537:1: rule__Declaration__Group__33 : rule__Declaration__Group__33__Impl ;
    public final void rule__Declaration__Group__33() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1541:1: ( rule__Declaration__Group__33__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1542:2: rule__Declaration__Group__33__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group__33__Impl_in_rule__Declaration__Group__333173);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1548:1: rule__Declaration__Group__33__Impl : ( '}' ) ;
    public final void rule__Declaration__Group__33__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1552:1: ( ( '}' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1553:1: ( '}' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1553:1: ( '}' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1554:1: '}'
            {
             before(grammarAccess.getDeclarationAccess().getRightCurlyBracketKeyword_33()); 
            match(input,17,FOLLOW_17_in_rule__Declaration__Group__33__Impl3201); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1635:1: rule__Declaration__Group_6__0 : rule__Declaration__Group_6__0__Impl rule__Declaration__Group_6__1 ;
    public final void rule__Declaration__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1639:1: ( rule__Declaration__Group_6__0__Impl rule__Declaration__Group_6__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1640:2: rule__Declaration__Group_6__0__Impl rule__Declaration__Group_6__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group_6__0__Impl_in_rule__Declaration__Group_6__03300);
            rule__Declaration__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group_6__1_in_rule__Declaration__Group_6__03303);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1647:1: rule__Declaration__Group_6__0__Impl : ( ', ' ) ;
    public final void rule__Declaration__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1651:1: ( ( ', ' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1652:1: ( ', ' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1652:1: ( ', ' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1653:1: ', '
            {
             before(grammarAccess.getDeclarationAccess().getCommaSpaceKeyword_6_0()); 
            match(input,27,FOLLOW_27_in_rule__Declaration__Group_6__0__Impl3331); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1666:1: rule__Declaration__Group_6__1 : rule__Declaration__Group_6__1__Impl ;
    public final void rule__Declaration__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1670:1: ( rule__Declaration__Group_6__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1671:2: rule__Declaration__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group_6__1__Impl_in_rule__Declaration__Group_6__13362);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1677:1: rule__Declaration__Group_6__1__Impl : ( ( rule__Declaration__PairsAssignment_6_1 ) ) ;
    public final void rule__Declaration__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1681:1: ( ( ( rule__Declaration__PairsAssignment_6_1 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1682:1: ( ( rule__Declaration__PairsAssignment_6_1 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1682:1: ( ( rule__Declaration__PairsAssignment_6_1 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1683:1: ( rule__Declaration__PairsAssignment_6_1 )
            {
             before(grammarAccess.getDeclarationAccess().getPairsAssignment_6_1()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1684:1: ( rule__Declaration__PairsAssignment_6_1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1684:2: rule__Declaration__PairsAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Declaration__PairsAssignment_6_1_in_rule__Declaration__Group_6__1__Impl3389);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1698:1: rule__Declaration__Group_13__0 : rule__Declaration__Group_13__0__Impl rule__Declaration__Group_13__1 ;
    public final void rule__Declaration__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1702:1: ( rule__Declaration__Group_13__0__Impl rule__Declaration__Group_13__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1703:2: rule__Declaration__Group_13__0__Impl rule__Declaration__Group_13__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group_13__0__Impl_in_rule__Declaration__Group_13__03423);
            rule__Declaration__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group_13__1_in_rule__Declaration__Group_13__03426);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1710:1: rule__Declaration__Group_13__0__Impl : ( 'date' ) ;
    public final void rule__Declaration__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1714:1: ( ( 'date' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1715:1: ( 'date' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1715:1: ( 'date' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1716:1: 'date'
            {
             before(grammarAccess.getDeclarationAccess().getDateKeyword_13_0()); 
            match(input,28,FOLLOW_28_in_rule__Declaration__Group_13__0__Impl3454); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1729:1: rule__Declaration__Group_13__1 : rule__Declaration__Group_13__1__Impl ;
    public final void rule__Declaration__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1733:1: ( rule__Declaration__Group_13__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1734:2: rule__Declaration__Group_13__1__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group_13__1__Impl_in_rule__Declaration__Group_13__13485);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1740:1: rule__Declaration__Group_13__1__Impl : ( ( rule__Declaration__DateAssignment_13_1 ) ) ;
    public final void rule__Declaration__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1744:1: ( ( ( rule__Declaration__DateAssignment_13_1 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1745:1: ( ( rule__Declaration__DateAssignment_13_1 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1745:1: ( ( rule__Declaration__DateAssignment_13_1 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1746:1: ( rule__Declaration__DateAssignment_13_1 )
            {
             before(grammarAccess.getDeclarationAccess().getDateAssignment_13_1()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1747:1: ( rule__Declaration__DateAssignment_13_1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1747:2: rule__Declaration__DateAssignment_13_1
            {
            pushFollow(FOLLOW_rule__Declaration__DateAssignment_13_1_in_rule__Declaration__Group_13__1__Impl3512);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1761:1: rule__Declaration__Group_14__0 : rule__Declaration__Group_14__0__Impl rule__Declaration__Group_14__1 ;
    public final void rule__Declaration__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1765:1: ( rule__Declaration__Group_14__0__Impl rule__Declaration__Group_14__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1766:2: rule__Declaration__Group_14__0__Impl rule__Declaration__Group_14__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group_14__0__Impl_in_rule__Declaration__Group_14__03546);
            rule__Declaration__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group_14__1_in_rule__Declaration__Group_14__03549);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1773:1: rule__Declaration__Group_14__0__Impl : ( 'location' ) ;
    public final void rule__Declaration__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1777:1: ( ( 'location' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1778:1: ( 'location' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1778:1: ( 'location' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1779:1: 'location'
            {
             before(grammarAccess.getDeclarationAccess().getLocationKeyword_14_0()); 
            match(input,29,FOLLOW_29_in_rule__Declaration__Group_14__0__Impl3577); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1792:1: rule__Declaration__Group_14__1 : rule__Declaration__Group_14__1__Impl ;
    public final void rule__Declaration__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1796:1: ( rule__Declaration__Group_14__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1797:2: rule__Declaration__Group_14__1__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group_14__1__Impl_in_rule__Declaration__Group_14__13608);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1803:1: rule__Declaration__Group_14__1__Impl : ( ( rule__Declaration__LocationAssignment_14_1 ) ) ;
    public final void rule__Declaration__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1807:1: ( ( ( rule__Declaration__LocationAssignment_14_1 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1808:1: ( ( rule__Declaration__LocationAssignment_14_1 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1808:1: ( ( rule__Declaration__LocationAssignment_14_1 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1809:1: ( rule__Declaration__LocationAssignment_14_1 )
            {
             before(grammarAccess.getDeclarationAccess().getLocationAssignment_14_1()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1810:1: ( rule__Declaration__LocationAssignment_14_1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1810:2: rule__Declaration__LocationAssignment_14_1
            {
            pushFollow(FOLLOW_rule__Declaration__LocationAssignment_14_1_in_rule__Declaration__Group_14__1__Impl3635);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1824:1: rule__Declaration__Group_17__0 : rule__Declaration__Group_17__0__Impl rule__Declaration__Group_17__1 ;
    public final void rule__Declaration__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1828:1: ( rule__Declaration__Group_17__0__Impl rule__Declaration__Group_17__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1829:2: rule__Declaration__Group_17__0__Impl rule__Declaration__Group_17__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group_17__0__Impl_in_rule__Declaration__Group_17__03669);
            rule__Declaration__Group_17__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group_17__1_in_rule__Declaration__Group_17__03672);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1836:1: rule__Declaration__Group_17__0__Impl : ( 'volume' ) ;
    public final void rule__Declaration__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1840:1: ( ( 'volume' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1841:1: ( 'volume' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1841:1: ( 'volume' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1842:1: 'volume'
            {
             before(grammarAccess.getDeclarationAccess().getVolumeKeyword_17_0()); 
            match(input,30,FOLLOW_30_in_rule__Declaration__Group_17__0__Impl3700); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1855:1: rule__Declaration__Group_17__1 : rule__Declaration__Group_17__1__Impl ;
    public final void rule__Declaration__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1859:1: ( rule__Declaration__Group_17__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1860:2: rule__Declaration__Group_17__1__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group_17__1__Impl_in_rule__Declaration__Group_17__13731);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1866:1: rule__Declaration__Group_17__1__Impl : ( ( rule__Declaration__VolumeAssignment_17_1 ) ) ;
    public final void rule__Declaration__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1870:1: ( ( ( rule__Declaration__VolumeAssignment_17_1 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1871:1: ( ( rule__Declaration__VolumeAssignment_17_1 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1871:1: ( ( rule__Declaration__VolumeAssignment_17_1 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1872:1: ( rule__Declaration__VolumeAssignment_17_1 )
            {
             before(grammarAccess.getDeclarationAccess().getVolumeAssignment_17_1()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1873:1: ( rule__Declaration__VolumeAssignment_17_1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1873:2: rule__Declaration__VolumeAssignment_17_1
            {
            pushFollow(FOLLOW_rule__Declaration__VolumeAssignment_17_1_in_rule__Declaration__Group_17__1__Impl3758);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1887:1: rule__Declaration__Group_28__0 : rule__Declaration__Group_28__0__Impl rule__Declaration__Group_28__1 ;
    public final void rule__Declaration__Group_28__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1891:1: ( rule__Declaration__Group_28__0__Impl rule__Declaration__Group_28__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1892:2: rule__Declaration__Group_28__0__Impl rule__Declaration__Group_28__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group_28__0__Impl_in_rule__Declaration__Group_28__03792);
            rule__Declaration__Group_28__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group_28__1_in_rule__Declaration__Group_28__03795);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1899:1: rule__Declaration__Group_28__0__Impl : ( 'number of images per article' ) ;
    public final void rule__Declaration__Group_28__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1903:1: ( ( 'number of images per article' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1904:1: ( 'number of images per article' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1904:1: ( 'number of images per article' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1905:1: 'number of images per article'
            {
             before(grammarAccess.getDeclarationAccess().getNumberOfImagesPerArticleKeyword_28_0()); 
            match(input,31,FOLLOW_31_in_rule__Declaration__Group_28__0__Impl3823); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1918:1: rule__Declaration__Group_28__1 : rule__Declaration__Group_28__1__Impl ;
    public final void rule__Declaration__Group_28__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1922:1: ( rule__Declaration__Group_28__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1923:2: rule__Declaration__Group_28__1__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group_28__1__Impl_in_rule__Declaration__Group_28__13854);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1929:1: rule__Declaration__Group_28__1__Impl : ( ( rule__Declaration__ImagesCntAssignment_28_1 ) ) ;
    public final void rule__Declaration__Group_28__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1933:1: ( ( ( rule__Declaration__ImagesCntAssignment_28_1 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1934:1: ( ( rule__Declaration__ImagesCntAssignment_28_1 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1934:1: ( ( rule__Declaration__ImagesCntAssignment_28_1 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1935:1: ( rule__Declaration__ImagesCntAssignment_28_1 )
            {
             before(grammarAccess.getDeclarationAccess().getImagesCntAssignment_28_1()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1936:1: ( rule__Declaration__ImagesCntAssignment_28_1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1936:2: rule__Declaration__ImagesCntAssignment_28_1
            {
            pushFollow(FOLLOW_rule__Declaration__ImagesCntAssignment_28_1_in_rule__Declaration__Group_28__1__Impl3881);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1950:1: rule__FontSize__Group_0__0 : rule__FontSize__Group_0__0__Impl rule__FontSize__Group_0__1 ;
    public final void rule__FontSize__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1954:1: ( rule__FontSize__Group_0__0__Impl rule__FontSize__Group_0__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1955:2: rule__FontSize__Group_0__0__Impl rule__FontSize__Group_0__1
            {
            pushFollow(FOLLOW_rule__FontSize__Group_0__0__Impl_in_rule__FontSize__Group_0__03915);
            rule__FontSize__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FontSize__Group_0__1_in_rule__FontSize__Group_0__03918);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1962:1: rule__FontSize__Group_0__0__Impl : ( () ) ;
    public final void rule__FontSize__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1966:1: ( ( () ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1967:1: ( () )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1967:1: ( () )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1968:1: ()
            {
             before(grammarAccess.getFontSizeAccess().getEStringAction_0_0()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1969:1: ()
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1971:1: 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1981:1: rule__FontSize__Group_0__1 : rule__FontSize__Group_0__1__Impl ;
    public final void rule__FontSize__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1985:1: ( rule__FontSize__Group_0__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1986:2: rule__FontSize__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__FontSize__Group_0__1__Impl_in_rule__FontSize__Group_0__13976);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1992:1: rule__FontSize__Group_0__1__Impl : ( 'small' ) ;
    public final void rule__FontSize__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1996:1: ( ( 'small' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1997:1: ( 'small' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1997:1: ( 'small' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:1998:1: 'small'
            {
             before(grammarAccess.getFontSizeAccess().getSmallKeyword_0_1()); 
            match(input,32,FOLLOW_32_in_rule__FontSize__Group_0__1__Impl4004); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2015:1: rule__FontSize__Group_1__0 : rule__FontSize__Group_1__0__Impl rule__FontSize__Group_1__1 ;
    public final void rule__FontSize__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2019:1: ( rule__FontSize__Group_1__0__Impl rule__FontSize__Group_1__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2020:2: rule__FontSize__Group_1__0__Impl rule__FontSize__Group_1__1
            {
            pushFollow(FOLLOW_rule__FontSize__Group_1__0__Impl_in_rule__FontSize__Group_1__04039);
            rule__FontSize__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FontSize__Group_1__1_in_rule__FontSize__Group_1__04042);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2027:1: rule__FontSize__Group_1__0__Impl : ( () ) ;
    public final void rule__FontSize__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2031:1: ( ( () ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2032:1: ( () )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2032:1: ( () )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2033:1: ()
            {
             before(grammarAccess.getFontSizeAccess().getEStringAction_1_0()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2034:1: ()
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2036:1: 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2046:1: rule__FontSize__Group_1__1 : rule__FontSize__Group_1__1__Impl ;
    public final void rule__FontSize__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2050:1: ( rule__FontSize__Group_1__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2051:2: rule__FontSize__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FontSize__Group_1__1__Impl_in_rule__FontSize__Group_1__14100);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2057:1: rule__FontSize__Group_1__1__Impl : ( 'medium' ) ;
    public final void rule__FontSize__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2061:1: ( ( 'medium' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2062:1: ( 'medium' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2062:1: ( 'medium' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2063:1: 'medium'
            {
             before(grammarAccess.getFontSizeAccess().getMediumKeyword_1_1()); 
            match(input,33,FOLLOW_33_in_rule__FontSize__Group_1__1__Impl4128); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2080:1: rule__FontSize__Group_2__0 : rule__FontSize__Group_2__0__Impl rule__FontSize__Group_2__1 ;
    public final void rule__FontSize__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2084:1: ( rule__FontSize__Group_2__0__Impl rule__FontSize__Group_2__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2085:2: rule__FontSize__Group_2__0__Impl rule__FontSize__Group_2__1
            {
            pushFollow(FOLLOW_rule__FontSize__Group_2__0__Impl_in_rule__FontSize__Group_2__04163);
            rule__FontSize__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FontSize__Group_2__1_in_rule__FontSize__Group_2__04166);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2092:1: rule__FontSize__Group_2__0__Impl : ( () ) ;
    public final void rule__FontSize__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2096:1: ( ( () ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2097:1: ( () )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2097:1: ( () )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2098:1: ()
            {
             before(grammarAccess.getFontSizeAccess().getEStringAction_2_0()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2099:1: ()
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2101:1: 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2111:1: rule__FontSize__Group_2__1 : rule__FontSize__Group_2__1__Impl ;
    public final void rule__FontSize__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2115:1: ( rule__FontSize__Group_2__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2116:2: rule__FontSize__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__FontSize__Group_2__1__Impl_in_rule__FontSize__Group_2__14224);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2122:1: rule__FontSize__Group_2__1__Impl : ( 'large' ) ;
    public final void rule__FontSize__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2126:1: ( ( 'large' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2127:1: ( 'large' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2127:1: ( 'large' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2128:1: 'large'
            {
             before(grammarAccess.getFontSizeAccess().getLargeKeyword_2_1()); 
            match(input,34,FOLLOW_34_in_rule__FontSize__Group_2__1__Impl4252); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2145:1: rule__Format__Group_0__0 : rule__Format__Group_0__0__Impl rule__Format__Group_0__1 ;
    public final void rule__Format__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2149:1: ( rule__Format__Group_0__0__Impl rule__Format__Group_0__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2150:2: rule__Format__Group_0__0__Impl rule__Format__Group_0__1
            {
            pushFollow(FOLLOW_rule__Format__Group_0__0__Impl_in_rule__Format__Group_0__04287);
            rule__Format__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Format__Group_0__1_in_rule__Format__Group_0__04290);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2157:1: rule__Format__Group_0__0__Impl : ( () ) ;
    public final void rule__Format__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2161:1: ( ( () ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2162:1: ( () )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2162:1: ( () )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2163:1: ()
            {
             before(grammarAccess.getFormatAccess().getEStringAction_0_0()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2164:1: ()
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2166:1: 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2176:1: rule__Format__Group_0__1 : rule__Format__Group_0__1__Impl ;
    public final void rule__Format__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2180:1: ( rule__Format__Group_0__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2181:2: rule__Format__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Format__Group_0__1__Impl_in_rule__Format__Group_0__14348);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2187:1: rule__Format__Group_0__1__Impl : ( 'DIN A6' ) ;
    public final void rule__Format__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2191:1: ( ( 'DIN A6' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2192:1: ( 'DIN A6' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2192:1: ( 'DIN A6' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2193:1: 'DIN A6'
            {
             before(grammarAccess.getFormatAccess().getDINA6Keyword_0_1()); 
            match(input,35,FOLLOW_35_in_rule__Format__Group_0__1__Impl4376); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2210:1: rule__Format__Group_1__0 : rule__Format__Group_1__0__Impl rule__Format__Group_1__1 ;
    public final void rule__Format__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2214:1: ( rule__Format__Group_1__0__Impl rule__Format__Group_1__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2215:2: rule__Format__Group_1__0__Impl rule__Format__Group_1__1
            {
            pushFollow(FOLLOW_rule__Format__Group_1__0__Impl_in_rule__Format__Group_1__04411);
            rule__Format__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Format__Group_1__1_in_rule__Format__Group_1__04414);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2222:1: rule__Format__Group_1__0__Impl : ( () ) ;
    public final void rule__Format__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2226:1: ( ( () ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2227:1: ( () )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2227:1: ( () )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2228:1: ()
            {
             before(grammarAccess.getFormatAccess().getEStringAction_1_0()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2229:1: ()
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2231:1: 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2241:1: rule__Format__Group_1__1 : rule__Format__Group_1__1__Impl ;
    public final void rule__Format__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2245:1: ( rule__Format__Group_1__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2246:2: rule__Format__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Format__Group_1__1__Impl_in_rule__Format__Group_1__14472);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2252:1: rule__Format__Group_1__1__Impl : ( 'DIN A5' ) ;
    public final void rule__Format__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2256:1: ( ( 'DIN A5' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2257:1: ( 'DIN A5' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2257:1: ( 'DIN A5' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2258:1: 'DIN A5'
            {
             before(grammarAccess.getFormatAccess().getDINA5Keyword_1_1()); 
            match(input,36,FOLLOW_36_in_rule__Format__Group_1__1__Impl4500); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2275:1: rule__Format__Group_2__0 : rule__Format__Group_2__0__Impl rule__Format__Group_2__1 ;
    public final void rule__Format__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2279:1: ( rule__Format__Group_2__0__Impl rule__Format__Group_2__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2280:2: rule__Format__Group_2__0__Impl rule__Format__Group_2__1
            {
            pushFollow(FOLLOW_rule__Format__Group_2__0__Impl_in_rule__Format__Group_2__04535);
            rule__Format__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Format__Group_2__1_in_rule__Format__Group_2__04538);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2287:1: rule__Format__Group_2__0__Impl : ( () ) ;
    public final void rule__Format__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2291:1: ( ( () ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2292:1: ( () )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2292:1: ( () )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2293:1: ()
            {
             before(grammarAccess.getFormatAccess().getEStringAction_2_0()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2294:1: ()
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2296:1: 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2306:1: rule__Format__Group_2__1 : rule__Format__Group_2__1__Impl ;
    public final void rule__Format__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2310:1: ( rule__Format__Group_2__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2311:2: rule__Format__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Format__Group_2__1__Impl_in_rule__Format__Group_2__14596);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2317:1: rule__Format__Group_2__1__Impl : ( 'DIN A4' ) ;
    public final void rule__Format__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2321:1: ( ( 'DIN A4' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2322:1: ( 'DIN A4' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2322:1: ( 'DIN A4' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2323:1: 'DIN A4'
            {
             before(grammarAccess.getFormatAccess().getDINA4Keyword_2_1()); 
            match(input,37,FOLLOW_37_in_rule__Format__Group_2__1__Impl4624); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2340:1: rule__Format__Group_3__0 : rule__Format__Group_3__0__Impl rule__Format__Group_3__1 ;
    public final void rule__Format__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2344:1: ( rule__Format__Group_3__0__Impl rule__Format__Group_3__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2345:2: rule__Format__Group_3__0__Impl rule__Format__Group_3__1
            {
            pushFollow(FOLLOW_rule__Format__Group_3__0__Impl_in_rule__Format__Group_3__04659);
            rule__Format__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Format__Group_3__1_in_rule__Format__Group_3__04662);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2352:1: rule__Format__Group_3__0__Impl : ( () ) ;
    public final void rule__Format__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2356:1: ( ( () ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2357:1: ( () )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2357:1: ( () )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2358:1: ()
            {
             before(grammarAccess.getFormatAccess().getEStringAction_3_0()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2359:1: ()
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2361:1: 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2371:1: rule__Format__Group_3__1 : rule__Format__Group_3__1__Impl ;
    public final void rule__Format__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2375:1: ( rule__Format__Group_3__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2376:2: rule__Format__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Format__Group_3__1__Impl_in_rule__Format__Group_3__14720);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2382:1: rule__Format__Group_3__1__Impl : ( 'DIN A3' ) ;
    public final void rule__Format__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2386:1: ( ( 'DIN A3' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2387:1: ( 'DIN A3' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2387:1: ( 'DIN A3' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2388:1: 'DIN A3'
            {
             before(grammarAccess.getFormatAccess().getDINA3Keyword_3_1()); 
            match(input,38,FOLLOW_38_in_rule__Format__Group_3__1__Impl4748); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2405:1: rule__Format__Group_4__0 : rule__Format__Group_4__0__Impl rule__Format__Group_4__1 ;
    public final void rule__Format__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2409:1: ( rule__Format__Group_4__0__Impl rule__Format__Group_4__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2410:2: rule__Format__Group_4__0__Impl rule__Format__Group_4__1
            {
            pushFollow(FOLLOW_rule__Format__Group_4__0__Impl_in_rule__Format__Group_4__04783);
            rule__Format__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Format__Group_4__1_in_rule__Format__Group_4__04786);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2417:1: rule__Format__Group_4__0__Impl : ( () ) ;
    public final void rule__Format__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2421:1: ( ( () ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2422:1: ( () )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2422:1: ( () )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2423:1: ()
            {
             before(grammarAccess.getFormatAccess().getEStringAction_4_0()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2424:1: ()
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2426:1: 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2436:1: rule__Format__Group_4__1 : rule__Format__Group_4__1__Impl ;
    public final void rule__Format__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2440:1: ( rule__Format__Group_4__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2441:2: rule__Format__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Format__Group_4__1__Impl_in_rule__Format__Group_4__14844);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2447:1: rule__Format__Group_4__1__Impl : ( 'DIN A2' ) ;
    public final void rule__Format__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2451:1: ( ( 'DIN A2' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2452:1: ( 'DIN A2' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2452:1: ( 'DIN A2' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2453:1: 'DIN A2'
            {
             before(grammarAccess.getFormatAccess().getDINA2Keyword_4_1()); 
            match(input,39,FOLLOW_39_in_rule__Format__Group_4__1__Impl4872); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2470:1: rule__Format__Group_5__0 : rule__Format__Group_5__0__Impl rule__Format__Group_5__1 ;
    public final void rule__Format__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2474:1: ( rule__Format__Group_5__0__Impl rule__Format__Group_5__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2475:2: rule__Format__Group_5__0__Impl rule__Format__Group_5__1
            {
            pushFollow(FOLLOW_rule__Format__Group_5__0__Impl_in_rule__Format__Group_5__04907);
            rule__Format__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Format__Group_5__1_in_rule__Format__Group_5__04910);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2482:1: rule__Format__Group_5__0__Impl : ( () ) ;
    public final void rule__Format__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2486:1: ( ( () ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2487:1: ( () )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2487:1: ( () )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2488:1: ()
            {
             before(grammarAccess.getFormatAccess().getEStringAction_5_0()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2489:1: ()
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2491:1: 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2501:1: rule__Format__Group_5__1 : rule__Format__Group_5__1__Impl ;
    public final void rule__Format__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2505:1: ( rule__Format__Group_5__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2506:2: rule__Format__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Format__Group_5__1__Impl_in_rule__Format__Group_5__14968);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2512:1: rule__Format__Group_5__1__Impl : ( 'DIN A1' ) ;
    public final void rule__Format__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2516:1: ( ( 'DIN A1' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2517:1: ( 'DIN A1' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2517:1: ( 'DIN A1' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2518:1: 'DIN A1'
            {
             before(grammarAccess.getFormatAccess().getDINA1Keyword_5_1()); 
            match(input,40,FOLLOW_40_in_rule__Format__Group_5__1__Impl4996); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2535:1: rule__Format__Group_6__0 : rule__Format__Group_6__0__Impl rule__Format__Group_6__1 ;
    public final void rule__Format__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2539:1: ( rule__Format__Group_6__0__Impl rule__Format__Group_6__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2540:2: rule__Format__Group_6__0__Impl rule__Format__Group_6__1
            {
            pushFollow(FOLLOW_rule__Format__Group_6__0__Impl_in_rule__Format__Group_6__05031);
            rule__Format__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Format__Group_6__1_in_rule__Format__Group_6__05034);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2547:1: rule__Format__Group_6__0__Impl : ( () ) ;
    public final void rule__Format__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2551:1: ( ( () ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2552:1: ( () )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2552:1: ( () )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2553:1: ()
            {
             before(grammarAccess.getFormatAccess().getEStringAction_6_0()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2554:1: ()
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2556:1: 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2566:1: rule__Format__Group_6__1 : rule__Format__Group_6__1__Impl ;
    public final void rule__Format__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2570:1: ( rule__Format__Group_6__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2571:2: rule__Format__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Format__Group_6__1__Impl_in_rule__Format__Group_6__15092);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2577:1: rule__Format__Group_6__1__Impl : ( 'DIN A0' ) ;
    public final void rule__Format__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2581:1: ( ( 'DIN A0' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2582:1: ( 'DIN A0' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2582:1: ( 'DIN A0' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2583:1: 'DIN A0'
            {
             before(grammarAccess.getFormatAccess().getDINA0Keyword_6_1()); 
            match(input,41,FOLLOW_41_in_rule__Format__Group_6__1__Impl5120); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2600:1: rule__Date__Group__0 : rule__Date__Group__0__Impl rule__Date__Group__1 ;
    public final void rule__Date__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2604:1: ( rule__Date__Group__0__Impl rule__Date__Group__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2605:2: rule__Date__Group__0__Impl rule__Date__Group__1
            {
            pushFollow(FOLLOW_rule__Date__Group__0__Impl_in_rule__Date__Group__05155);
            rule__Date__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Date__Group__1_in_rule__Date__Group__05158);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2612:1: rule__Date__Group__0__Impl : ( '{' ) ;
    public final void rule__Date__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2616:1: ( ( '{' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2617:1: ( '{' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2617:1: ( '{' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2618:1: '{'
            {
             before(grammarAccess.getDateAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Date__Group__0__Impl5186); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2631:1: rule__Date__Group__1 : rule__Date__Group__1__Impl rule__Date__Group__2 ;
    public final void rule__Date__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2635:1: ( rule__Date__Group__1__Impl rule__Date__Group__2 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2636:2: rule__Date__Group__1__Impl rule__Date__Group__2
            {
            pushFollow(FOLLOW_rule__Date__Group__1__Impl_in_rule__Date__Group__15217);
            rule__Date__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Date__Group__2_in_rule__Date__Group__15220);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2643:1: rule__Date__Group__1__Impl : ( ( rule__Date__DayAssignment_1 ) ) ;
    public final void rule__Date__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2647:1: ( ( ( rule__Date__DayAssignment_1 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2648:1: ( ( rule__Date__DayAssignment_1 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2648:1: ( ( rule__Date__DayAssignment_1 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2649:1: ( rule__Date__DayAssignment_1 )
            {
             before(grammarAccess.getDateAccess().getDayAssignment_1()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2650:1: ( rule__Date__DayAssignment_1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2650:2: rule__Date__DayAssignment_1
            {
            pushFollow(FOLLOW_rule__Date__DayAssignment_1_in_rule__Date__Group__1__Impl5247);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2660:1: rule__Date__Group__2 : rule__Date__Group__2__Impl rule__Date__Group__3 ;
    public final void rule__Date__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2664:1: ( rule__Date__Group__2__Impl rule__Date__Group__3 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2665:2: rule__Date__Group__2__Impl rule__Date__Group__3
            {
            pushFollow(FOLLOW_rule__Date__Group__2__Impl_in_rule__Date__Group__25277);
            rule__Date__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Date__Group__3_in_rule__Date__Group__25280);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2672:1: rule__Date__Group__2__Impl : ( '-' ) ;
    public final void rule__Date__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2676:1: ( ( '-' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2677:1: ( '-' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2677:1: ( '-' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2678:1: '-'
            {
             before(grammarAccess.getDateAccess().getHyphenMinusKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__Date__Group__2__Impl5308); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2691:1: rule__Date__Group__3 : rule__Date__Group__3__Impl rule__Date__Group__4 ;
    public final void rule__Date__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2695:1: ( rule__Date__Group__3__Impl rule__Date__Group__4 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2696:2: rule__Date__Group__3__Impl rule__Date__Group__4
            {
            pushFollow(FOLLOW_rule__Date__Group__3__Impl_in_rule__Date__Group__35339);
            rule__Date__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Date__Group__4_in_rule__Date__Group__35342);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2703:1: rule__Date__Group__3__Impl : ( ( rule__Date__MonthAssignment_3 ) ) ;
    public final void rule__Date__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2707:1: ( ( ( rule__Date__MonthAssignment_3 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2708:1: ( ( rule__Date__MonthAssignment_3 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2708:1: ( ( rule__Date__MonthAssignment_3 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2709:1: ( rule__Date__MonthAssignment_3 )
            {
             before(grammarAccess.getDateAccess().getMonthAssignment_3()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2710:1: ( rule__Date__MonthAssignment_3 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2710:2: rule__Date__MonthAssignment_3
            {
            pushFollow(FOLLOW_rule__Date__MonthAssignment_3_in_rule__Date__Group__3__Impl5369);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2720:1: rule__Date__Group__4 : rule__Date__Group__4__Impl rule__Date__Group__5 ;
    public final void rule__Date__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2724:1: ( rule__Date__Group__4__Impl rule__Date__Group__5 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2725:2: rule__Date__Group__4__Impl rule__Date__Group__5
            {
            pushFollow(FOLLOW_rule__Date__Group__4__Impl_in_rule__Date__Group__45399);
            rule__Date__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Date__Group__5_in_rule__Date__Group__45402);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2732:1: rule__Date__Group__4__Impl : ( '-' ) ;
    public final void rule__Date__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2736:1: ( ( '-' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2737:1: ( '-' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2737:1: ( '-' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2738:1: '-'
            {
             before(grammarAccess.getDateAccess().getHyphenMinusKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__Date__Group__4__Impl5430); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2751:1: rule__Date__Group__5 : rule__Date__Group__5__Impl rule__Date__Group__6 ;
    public final void rule__Date__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2755:1: ( rule__Date__Group__5__Impl rule__Date__Group__6 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2756:2: rule__Date__Group__5__Impl rule__Date__Group__6
            {
            pushFollow(FOLLOW_rule__Date__Group__5__Impl_in_rule__Date__Group__55461);
            rule__Date__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Date__Group__6_in_rule__Date__Group__55464);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2763:1: rule__Date__Group__5__Impl : ( ( rule__Date__YearAssignment_5 ) ) ;
    public final void rule__Date__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2767:1: ( ( ( rule__Date__YearAssignment_5 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2768:1: ( ( rule__Date__YearAssignment_5 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2768:1: ( ( rule__Date__YearAssignment_5 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2769:1: ( rule__Date__YearAssignment_5 )
            {
             before(grammarAccess.getDateAccess().getYearAssignment_5()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2770:1: ( rule__Date__YearAssignment_5 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2770:2: rule__Date__YearAssignment_5
            {
            pushFollow(FOLLOW_rule__Date__YearAssignment_5_in_rule__Date__Group__5__Impl5491);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2780:1: rule__Date__Group__6 : rule__Date__Group__6__Impl ;
    public final void rule__Date__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2784:1: ( rule__Date__Group__6__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2785:2: rule__Date__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Date__Group__6__Impl_in_rule__Date__Group__65521);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2791:1: rule__Date__Group__6__Impl : ( '}' ) ;
    public final void rule__Date__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2795:1: ( ( '}' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2796:1: ( '}' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2796:1: ( '}' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2797:1: '}'
            {
             before(grammarAccess.getDateAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_17_in_rule__Date__Group__6__Impl5549); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2824:1: rule__Language__Group_0__0 : rule__Language__Group_0__0__Impl rule__Language__Group_0__1 ;
    public final void rule__Language__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2828:1: ( rule__Language__Group_0__0__Impl rule__Language__Group_0__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2829:2: rule__Language__Group_0__0__Impl rule__Language__Group_0__1
            {
            pushFollow(FOLLOW_rule__Language__Group_0__0__Impl_in_rule__Language__Group_0__05594);
            rule__Language__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Language__Group_0__1_in_rule__Language__Group_0__05597);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2836:1: rule__Language__Group_0__0__Impl : ( () ) ;
    public final void rule__Language__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2840:1: ( ( () ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2841:1: ( () )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2841:1: ( () )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2842:1: ()
            {
             before(grammarAccess.getLanguageAccess().getEStringAction_0_0()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2843:1: ()
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2845:1: 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2855:1: rule__Language__Group_0__1 : rule__Language__Group_0__1__Impl ;
    public final void rule__Language__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2859:1: ( rule__Language__Group_0__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2860:2: rule__Language__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Language__Group_0__1__Impl_in_rule__Language__Group_0__15655);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2866:1: rule__Language__Group_0__1__Impl : ( 'English' ) ;
    public final void rule__Language__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2870:1: ( ( 'English' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2871:1: ( 'English' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2871:1: ( 'English' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2872:1: 'English'
            {
             before(grammarAccess.getLanguageAccess().getEnglishKeyword_0_1()); 
            match(input,42,FOLLOW_42_in_rule__Language__Group_0__1__Impl5683); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2889:1: rule__Language__Group_1__0 : rule__Language__Group_1__0__Impl rule__Language__Group_1__1 ;
    public final void rule__Language__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2893:1: ( rule__Language__Group_1__0__Impl rule__Language__Group_1__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2894:2: rule__Language__Group_1__0__Impl rule__Language__Group_1__1
            {
            pushFollow(FOLLOW_rule__Language__Group_1__0__Impl_in_rule__Language__Group_1__05718);
            rule__Language__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Language__Group_1__1_in_rule__Language__Group_1__05721);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2901:1: rule__Language__Group_1__0__Impl : ( () ) ;
    public final void rule__Language__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2905:1: ( ( () ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2906:1: ( () )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2906:1: ( () )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2907:1: ()
            {
             before(grammarAccess.getLanguageAccess().getEStringAction_1_0()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2908:1: ()
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2910:1: 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2920:1: rule__Language__Group_1__1 : rule__Language__Group_1__1__Impl ;
    public final void rule__Language__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2924:1: ( rule__Language__Group_1__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2925:2: rule__Language__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Language__Group_1__1__Impl_in_rule__Language__Group_1__15779);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2931:1: rule__Language__Group_1__1__Impl : ( 'German' ) ;
    public final void rule__Language__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2935:1: ( ( 'German' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2936:1: ( 'German' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2936:1: ( 'German' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2937:1: 'German'
            {
             before(grammarAccess.getLanguageAccess().getGermanKeyword_1_1()); 
            match(input,43,FOLLOW_43_in_rule__Language__Group_1__1__Impl5807); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2954:1: rule__Price__Group__0 : rule__Price__Group__0__Impl rule__Price__Group__1 ;
    public final void rule__Price__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2958:1: ( rule__Price__Group__0__Impl rule__Price__Group__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2959:2: rule__Price__Group__0__Impl rule__Price__Group__1
            {
            pushFollow(FOLLOW_rule__Price__Group__0__Impl_in_rule__Price__Group__05842);
            rule__Price__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Price__Group__1_in_rule__Price__Group__05845);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2966:1: rule__Price__Group__0__Impl : ( '{' ) ;
    public final void rule__Price__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2970:1: ( ( '{' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2971:1: ( '{' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2971:1: ( '{' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2972:1: '{'
            {
             before(grammarAccess.getPriceAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Price__Group__0__Impl5873); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2985:1: rule__Price__Group__1 : rule__Price__Group__1__Impl rule__Price__Group__2 ;
    public final void rule__Price__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2989:1: ( rule__Price__Group__1__Impl rule__Price__Group__2 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2990:2: rule__Price__Group__1__Impl rule__Price__Group__2
            {
            pushFollow(FOLLOW_rule__Price__Group__1__Impl_in_rule__Price__Group__15904);
            rule__Price__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Price__Group__2_in_rule__Price__Group__15907);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:2997:1: rule__Price__Group__1__Impl : ( ( rule__Price__ValueAssignment_1 ) ) ;
    public final void rule__Price__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3001:1: ( ( ( rule__Price__ValueAssignment_1 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3002:1: ( ( rule__Price__ValueAssignment_1 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3002:1: ( ( rule__Price__ValueAssignment_1 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3003:1: ( rule__Price__ValueAssignment_1 )
            {
             before(grammarAccess.getPriceAccess().getValueAssignment_1()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3004:1: ( rule__Price__ValueAssignment_1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3004:2: rule__Price__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Price__ValueAssignment_1_in_rule__Price__Group__1__Impl5934);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3014:1: rule__Price__Group__2 : rule__Price__Group__2__Impl rule__Price__Group__3 ;
    public final void rule__Price__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3018:1: ( rule__Price__Group__2__Impl rule__Price__Group__3 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3019:2: rule__Price__Group__2__Impl rule__Price__Group__3
            {
            pushFollow(FOLLOW_rule__Price__Group__2__Impl_in_rule__Price__Group__25964);
            rule__Price__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Price__Group__3_in_rule__Price__Group__25967);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3026:1: rule__Price__Group__2__Impl : ( ( rule__Price__CurrencyAssignment_2 ) ) ;
    public final void rule__Price__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3030:1: ( ( ( rule__Price__CurrencyAssignment_2 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3031:1: ( ( rule__Price__CurrencyAssignment_2 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3031:1: ( ( rule__Price__CurrencyAssignment_2 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3032:1: ( rule__Price__CurrencyAssignment_2 )
            {
             before(grammarAccess.getPriceAccess().getCurrencyAssignment_2()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3033:1: ( rule__Price__CurrencyAssignment_2 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3033:2: rule__Price__CurrencyAssignment_2
            {
            pushFollow(FOLLOW_rule__Price__CurrencyAssignment_2_in_rule__Price__Group__2__Impl5994);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3043:1: rule__Price__Group__3 : rule__Price__Group__3__Impl ;
    public final void rule__Price__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3047:1: ( rule__Price__Group__3__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3048:2: rule__Price__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Price__Group__3__Impl_in_rule__Price__Group__36024);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3054:1: rule__Price__Group__3__Impl : ( '}' ) ;
    public final void rule__Price__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3058:1: ( ( '}' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3059:1: ( '}' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3059:1: ( '}' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3060:1: '}'
            {
             before(grammarAccess.getPriceAccess().getRightCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__Price__Group__3__Impl6052); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3081:1: rule__Currency__Group_0__0 : rule__Currency__Group_0__0__Impl rule__Currency__Group_0__1 ;
    public final void rule__Currency__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3085:1: ( rule__Currency__Group_0__0__Impl rule__Currency__Group_0__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3086:2: rule__Currency__Group_0__0__Impl rule__Currency__Group_0__1
            {
            pushFollow(FOLLOW_rule__Currency__Group_0__0__Impl_in_rule__Currency__Group_0__06091);
            rule__Currency__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Currency__Group_0__1_in_rule__Currency__Group_0__06094);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3093:1: rule__Currency__Group_0__0__Impl : ( () ) ;
    public final void rule__Currency__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3097:1: ( ( () ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3098:1: ( () )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3098:1: ( () )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3099:1: ()
            {
             before(grammarAccess.getCurrencyAccess().getEStringAction_0_0()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3100:1: ()
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3102:1: 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3112:1: rule__Currency__Group_0__1 : rule__Currency__Group_0__1__Impl ;
    public final void rule__Currency__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3116:1: ( rule__Currency__Group_0__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3117:2: rule__Currency__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Currency__Group_0__1__Impl_in_rule__Currency__Group_0__16152);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3123:1: rule__Currency__Group_0__1__Impl : ( 'Euro [\\u20AC]' ) ;
    public final void rule__Currency__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3127:1: ( ( 'Euro [\\u20AC]' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3128:1: ( 'Euro [\\u20AC]' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3128:1: ( 'Euro [\\u20AC]' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3129:1: 'Euro [\\u20AC]'
            {
             before(grammarAccess.getCurrencyAccess().getEuroKeyword_0_1()); 
            match(input,44,FOLLOW_44_in_rule__Currency__Group_0__1__Impl6180); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3146:1: rule__Currency__Group_1__0 : rule__Currency__Group_1__0__Impl rule__Currency__Group_1__1 ;
    public final void rule__Currency__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3150:1: ( rule__Currency__Group_1__0__Impl rule__Currency__Group_1__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3151:2: rule__Currency__Group_1__0__Impl rule__Currency__Group_1__1
            {
            pushFollow(FOLLOW_rule__Currency__Group_1__0__Impl_in_rule__Currency__Group_1__06215);
            rule__Currency__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Currency__Group_1__1_in_rule__Currency__Group_1__06218);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3158:1: rule__Currency__Group_1__0__Impl : ( () ) ;
    public final void rule__Currency__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3162:1: ( ( () ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3163:1: ( () )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3163:1: ( () )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3164:1: ()
            {
             before(grammarAccess.getCurrencyAccess().getEStringAction_1_0()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3165:1: ()
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3167:1: 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3177:1: rule__Currency__Group_1__1 : rule__Currency__Group_1__1__Impl ;
    public final void rule__Currency__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3181:1: ( rule__Currency__Group_1__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3182:2: rule__Currency__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Currency__Group_1__1__Impl_in_rule__Currency__Group_1__16276);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3188:1: rule__Currency__Group_1__1__Impl : ( 'Dollar [$]' ) ;
    public final void rule__Currency__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3192:1: ( ( 'Dollar [$]' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3193:1: ( 'Dollar [$]' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3193:1: ( 'Dollar [$]' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3194:1: 'Dollar [$]'
            {
             before(grammarAccess.getCurrencyAccess().getDollarKeyword_1_1()); 
            match(input,45,FOLLOW_45_in_rule__Currency__Group_1__1__Impl6304); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3211:1: rule__Topic__Group__0 : rule__Topic__Group__0__Impl rule__Topic__Group__1 ;
    public final void rule__Topic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3215:1: ( rule__Topic__Group__0__Impl rule__Topic__Group__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3216:2: rule__Topic__Group__0__Impl rule__Topic__Group__1
            {
            pushFollow(FOLLOW_rule__Topic__Group__0__Impl_in_rule__Topic__Group__06339);
            rule__Topic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Topic__Group__1_in_rule__Topic__Group__06342);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3223:1: rule__Topic__Group__0__Impl : ( 'topic' ) ;
    public final void rule__Topic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3227:1: ( ( 'topic' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3228:1: ( 'topic' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3228:1: ( 'topic' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3229:1: 'topic'
            {
             before(grammarAccess.getTopicAccess().getTopicKeyword_0()); 
            match(input,46,FOLLOW_46_in_rule__Topic__Group__0__Impl6370); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3242:1: rule__Topic__Group__1 : rule__Topic__Group__1__Impl rule__Topic__Group__2 ;
    public final void rule__Topic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3246:1: ( rule__Topic__Group__1__Impl rule__Topic__Group__2 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3247:2: rule__Topic__Group__1__Impl rule__Topic__Group__2
            {
            pushFollow(FOLLOW_rule__Topic__Group__1__Impl_in_rule__Topic__Group__16401);
            rule__Topic__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Topic__Group__2_in_rule__Topic__Group__16404);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3254:1: rule__Topic__Group__1__Impl : ( ( rule__Topic__NameAssignment_1 ) ) ;
    public final void rule__Topic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3258:1: ( ( ( rule__Topic__NameAssignment_1 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3259:1: ( ( rule__Topic__NameAssignment_1 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3259:1: ( ( rule__Topic__NameAssignment_1 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3260:1: ( rule__Topic__NameAssignment_1 )
            {
             before(grammarAccess.getTopicAccess().getNameAssignment_1()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3261:1: ( rule__Topic__NameAssignment_1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3261:2: rule__Topic__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Topic__NameAssignment_1_in_rule__Topic__Group__1__Impl6431);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3271:1: rule__Topic__Group__2 : rule__Topic__Group__2__Impl rule__Topic__Group__3 ;
    public final void rule__Topic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3275:1: ( rule__Topic__Group__2__Impl rule__Topic__Group__3 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3276:2: rule__Topic__Group__2__Impl rule__Topic__Group__3
            {
            pushFollow(FOLLOW_rule__Topic__Group__2__Impl_in_rule__Topic__Group__26461);
            rule__Topic__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Topic__Group__3_in_rule__Topic__Group__26464);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3283:1: rule__Topic__Group__2__Impl : ( '{' ) ;
    public final void rule__Topic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3287:1: ( ( '{' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3288:1: ( '{' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3288:1: ( '{' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3289:1: '{'
            {
             before(grammarAccess.getTopicAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Topic__Group__2__Impl6492); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3302:1: rule__Topic__Group__3 : rule__Topic__Group__3__Impl rule__Topic__Group__4 ;
    public final void rule__Topic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3306:1: ( rule__Topic__Group__3__Impl rule__Topic__Group__4 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3307:2: rule__Topic__Group__3__Impl rule__Topic__Group__4
            {
            pushFollow(FOLLOW_rule__Topic__Group__3__Impl_in_rule__Topic__Group__36523);
            rule__Topic__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Topic__Group__4_in_rule__Topic__Group__36526);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3314:1: rule__Topic__Group__3__Impl : ( ( rule__Topic__TagsAssignment_3 ) ) ;
    public final void rule__Topic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3318:1: ( ( ( rule__Topic__TagsAssignment_3 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3319:1: ( ( rule__Topic__TagsAssignment_3 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3319:1: ( ( rule__Topic__TagsAssignment_3 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3320:1: ( rule__Topic__TagsAssignment_3 )
            {
             before(grammarAccess.getTopicAccess().getTagsAssignment_3()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3321:1: ( rule__Topic__TagsAssignment_3 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3321:2: rule__Topic__TagsAssignment_3
            {
            pushFollow(FOLLOW_rule__Topic__TagsAssignment_3_in_rule__Topic__Group__3__Impl6553);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3331:1: rule__Topic__Group__4 : rule__Topic__Group__4__Impl rule__Topic__Group__5 ;
    public final void rule__Topic__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3335:1: ( rule__Topic__Group__4__Impl rule__Topic__Group__5 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3336:2: rule__Topic__Group__4__Impl rule__Topic__Group__5
            {
            pushFollow(FOLLOW_rule__Topic__Group__4__Impl_in_rule__Topic__Group__46583);
            rule__Topic__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Topic__Group__5_in_rule__Topic__Group__46586);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3343:1: rule__Topic__Group__4__Impl : ( ( rule__Topic__Group_4__0 )* ) ;
    public final void rule__Topic__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3347:1: ( ( ( rule__Topic__Group_4__0 )* ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3348:1: ( ( rule__Topic__Group_4__0 )* )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3348:1: ( ( rule__Topic__Group_4__0 )* )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3349:1: ( rule__Topic__Group_4__0 )*
            {
             before(grammarAccess.getTopicAccess().getGroup_4()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3350:1: ( rule__Topic__Group_4__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3350:2: rule__Topic__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Topic__Group_4__0_in_rule__Topic__Group__4__Impl6613);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3360:1: rule__Topic__Group__5 : rule__Topic__Group__5__Impl ;
    public final void rule__Topic__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3364:1: ( rule__Topic__Group__5__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3365:2: rule__Topic__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Topic__Group__5__Impl_in_rule__Topic__Group__56644);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3371:1: rule__Topic__Group__5__Impl : ( '}' ) ;
    public final void rule__Topic__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3375:1: ( ( '}' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3376:1: ( '}' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3376:1: ( '}' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3377:1: '}'
            {
             before(grammarAccess.getTopicAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_17_in_rule__Topic__Group__5__Impl6672); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3402:1: rule__Topic__Group_4__0 : rule__Topic__Group_4__0__Impl rule__Topic__Group_4__1 ;
    public final void rule__Topic__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3406:1: ( rule__Topic__Group_4__0__Impl rule__Topic__Group_4__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3407:2: rule__Topic__Group_4__0__Impl rule__Topic__Group_4__1
            {
            pushFollow(FOLLOW_rule__Topic__Group_4__0__Impl_in_rule__Topic__Group_4__06715);
            rule__Topic__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Topic__Group_4__1_in_rule__Topic__Group_4__06718);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3414:1: rule__Topic__Group_4__0__Impl : ( ', ' ) ;
    public final void rule__Topic__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3418:1: ( ( ', ' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3419:1: ( ', ' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3419:1: ( ', ' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3420:1: ', '
            {
             before(grammarAccess.getTopicAccess().getCommaSpaceKeyword_4_0()); 
            match(input,27,FOLLOW_27_in_rule__Topic__Group_4__0__Impl6746); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3433:1: rule__Topic__Group_4__1 : rule__Topic__Group_4__1__Impl ;
    public final void rule__Topic__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3437:1: ( rule__Topic__Group_4__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3438:2: rule__Topic__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Topic__Group_4__1__Impl_in_rule__Topic__Group_4__16777);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3444:1: rule__Topic__Group_4__1__Impl : ( ( rule__Topic__TagsAssignment_4_1 ) ) ;
    public final void rule__Topic__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3448:1: ( ( ( rule__Topic__TagsAssignment_4_1 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3449:1: ( ( rule__Topic__TagsAssignment_4_1 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3449:1: ( ( rule__Topic__TagsAssignment_4_1 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3450:1: ( rule__Topic__TagsAssignment_4_1 )
            {
             before(grammarAccess.getTopicAccess().getTagsAssignment_4_1()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3451:1: ( rule__Topic__TagsAssignment_4_1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3451:2: rule__Topic__TagsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Topic__TagsAssignment_4_1_in_rule__Topic__Group_4__1__Impl6804);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3465:1: rule__Pair__Group__0 : rule__Pair__Group__0__Impl rule__Pair__Group__1 ;
    public final void rule__Pair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3469:1: ( rule__Pair__Group__0__Impl rule__Pair__Group__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3470:2: rule__Pair__Group__0__Impl rule__Pair__Group__1
            {
            pushFollow(FOLLOW_rule__Pair__Group__0__Impl_in_rule__Pair__Group__06838);
            rule__Pair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Pair__Group__1_in_rule__Pair__Group__06841);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3477:1: rule__Pair__Group__0__Impl : ( ( rule__Pair__KeyAssignment_0 ) ) ;
    public final void rule__Pair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3481:1: ( ( ( rule__Pair__KeyAssignment_0 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3482:1: ( ( rule__Pair__KeyAssignment_0 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3482:1: ( ( rule__Pair__KeyAssignment_0 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3483:1: ( rule__Pair__KeyAssignment_0 )
            {
             before(grammarAccess.getPairAccess().getKeyAssignment_0()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3484:1: ( rule__Pair__KeyAssignment_0 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3484:2: rule__Pair__KeyAssignment_0
            {
            pushFollow(FOLLOW_rule__Pair__KeyAssignment_0_in_rule__Pair__Group__0__Impl6868);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3494:1: rule__Pair__Group__1 : rule__Pair__Group__1__Impl rule__Pair__Group__2 ;
    public final void rule__Pair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3498:1: ( rule__Pair__Group__1__Impl rule__Pair__Group__2 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3499:2: rule__Pair__Group__1__Impl rule__Pair__Group__2
            {
            pushFollow(FOLLOW_rule__Pair__Group__1__Impl_in_rule__Pair__Group__16898);
            rule__Pair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Pair__Group__2_in_rule__Pair__Group__16901);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3506:1: rule__Pair__Group__1__Impl : ( ':' ) ;
    public final void rule__Pair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3510:1: ( ( ':' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3511:1: ( ':' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3511:1: ( ':' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3512:1: ':'
            {
             before(grammarAccess.getPairAccess().getColonKeyword_1()); 
            match(input,47,FOLLOW_47_in_rule__Pair__Group__1__Impl6929); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3525:1: rule__Pair__Group__2 : rule__Pair__Group__2__Impl ;
    public final void rule__Pair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3529:1: ( rule__Pair__Group__2__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3530:2: rule__Pair__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Pair__Group__2__Impl_in_rule__Pair__Group__26960);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3536:1: rule__Pair__Group__2__Impl : ( ( rule__Pair__ValueAssignment_2 ) ) ;
    public final void rule__Pair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3540:1: ( ( ( rule__Pair__ValueAssignment_2 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3541:1: ( ( rule__Pair__ValueAssignment_2 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3541:1: ( ( rule__Pair__ValueAssignment_2 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3542:1: ( rule__Pair__ValueAssignment_2 )
            {
             before(grammarAccess.getPairAccess().getValueAssignment_2()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3543:1: ( rule__Pair__ValueAssignment_2 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3543:2: rule__Pair__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Pair__ValueAssignment_2_in_rule__Pair__Group__2__Impl6987);
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


    // $ANTLR start "rule__Float__Group__0"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3559:1: rule__Float__Group__0 : rule__Float__Group__0__Impl rule__Float__Group__1 ;
    public final void rule__Float__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3563:1: ( rule__Float__Group__0__Impl rule__Float__Group__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3564:2: rule__Float__Group__0__Impl rule__Float__Group__1
            {
            pushFollow(FOLLOW_rule__Float__Group__0__Impl_in_rule__Float__Group__07023);
            rule__Float__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Float__Group__1_in_rule__Float__Group__07026);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3571:1: rule__Float__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Float__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3575:1: ( ( RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3576:1: ( RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3576:1: ( RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3577:1: RULE_INT
            {
             before(grammarAccess.getFloatAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Float__Group__0__Impl7053); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3588:1: rule__Float__Group__1 : rule__Float__Group__1__Impl ;
    public final void rule__Float__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3592:1: ( rule__Float__Group__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3593:2: rule__Float__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Float__Group__1__Impl_in_rule__Float__Group__17082);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3599:1: rule__Float__Group__1__Impl : ( ( rule__Float__Group_1__0 )? ) ;
    public final void rule__Float__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3603:1: ( ( ( rule__Float__Group_1__0 )? ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3604:1: ( ( rule__Float__Group_1__0 )? )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3604:1: ( ( rule__Float__Group_1__0 )? )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3605:1: ( rule__Float__Group_1__0 )?
            {
             before(grammarAccess.getFloatAccess().getGroup_1()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3606:1: ( rule__Float__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=12 && LA13_0<=13)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3606:2: rule__Float__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Float__Group_1__0_in_rule__Float__Group__1__Impl7109);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3620:1: rule__Float__Group_1__0 : rule__Float__Group_1__0__Impl rule__Float__Group_1__1 ;
    public final void rule__Float__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3624:1: ( rule__Float__Group_1__0__Impl rule__Float__Group_1__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3625:2: rule__Float__Group_1__0__Impl rule__Float__Group_1__1
            {
            pushFollow(FOLLOW_rule__Float__Group_1__0__Impl_in_rule__Float__Group_1__07144);
            rule__Float__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Float__Group_1__1_in_rule__Float__Group_1__07147);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3632:1: rule__Float__Group_1__0__Impl : ( ( rule__Float__Alternatives_1_0 ) ) ;
    public final void rule__Float__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3636:1: ( ( ( rule__Float__Alternatives_1_0 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3637:1: ( ( rule__Float__Alternatives_1_0 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3637:1: ( ( rule__Float__Alternatives_1_0 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3638:1: ( rule__Float__Alternatives_1_0 )
            {
             before(grammarAccess.getFloatAccess().getAlternatives_1_0()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3639:1: ( rule__Float__Alternatives_1_0 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3639:2: rule__Float__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Float__Alternatives_1_0_in_rule__Float__Group_1__0__Impl7174);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3649:1: rule__Float__Group_1__1 : rule__Float__Group_1__1__Impl ;
    public final void rule__Float__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3653:1: ( rule__Float__Group_1__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3654:2: rule__Float__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Float__Group_1__1__Impl_in_rule__Float__Group_1__17204);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3660:1: rule__Float__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__Float__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3664:1: ( ( RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3665:1: ( RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3665:1: ( RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3666:1: RULE_INT
            {
             before(grammarAccess.getFloatAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Float__Group_1__1__Impl7231); 
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


    // $ANTLR start "rule__Declaration__NameAssignment_1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3682:1: rule__Declaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Declaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3686:1: ( ( RULE_ID ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3687:1: ( RULE_ID )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3687:1: ( RULE_ID )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3688:1: RULE_ID
            {
             before(grammarAccess.getDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Declaration__NameAssignment_17269); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3697:1: rule__Declaration__FeedlinksAssignment_5 : ( rulePair ) ;
    public final void rule__Declaration__FeedlinksAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3701:1: ( ( rulePair ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3702:1: ( rulePair )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3702:1: ( rulePair )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3703:1: rulePair
            {
             before(grammarAccess.getDeclarationAccess().getFeedlinksPairParserRuleCall_5_0()); 
            pushFollow(FOLLOW_rulePair_in_rule__Declaration__FeedlinksAssignment_57300);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3712:1: rule__Declaration__PairsAssignment_6_1 : ( rulePair ) ;
    public final void rule__Declaration__PairsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3716:1: ( ( rulePair ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3717:1: ( rulePair )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3717:1: ( rulePair )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3718:1: rulePair
            {
             before(grammarAccess.getDeclarationAccess().getPairsPairParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_rulePair_in_rule__Declaration__PairsAssignment_6_17331);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3727:1: rule__Declaration__TopicsAssignment_10 : ( ruleTopic ) ;
    public final void rule__Declaration__TopicsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3731:1: ( ( ruleTopic ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3732:1: ( ruleTopic )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3732:1: ( ruleTopic )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3733:1: ruleTopic
            {
             before(grammarAccess.getDeclarationAccess().getTopicsTopicParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleTopic_in_rule__Declaration__TopicsAssignment_107362);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3742:1: rule__Declaration__TopicsAssignment_11 : ( ruleTopic ) ;
    public final void rule__Declaration__TopicsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3746:1: ( ( ruleTopic ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3747:1: ( ruleTopic )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3747:1: ( ruleTopic )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3748:1: ruleTopic
            {
             before(grammarAccess.getDeclarationAccess().getTopicsTopicParserRuleCall_11_0()); 
            pushFollow(FOLLOW_ruleTopic_in_rule__Declaration__TopicsAssignment_117393);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3757:1: rule__Declaration__DateAssignment_13_1 : ( ruleDate ) ;
    public final void rule__Declaration__DateAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3761:1: ( ( ruleDate ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3762:1: ( ruleDate )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3762:1: ( ruleDate )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3763:1: ruleDate
            {
             before(grammarAccess.getDeclarationAccess().getDateDateParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_ruleDate_in_rule__Declaration__DateAssignment_13_17424);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3772:1: rule__Declaration__LocationAssignment_14_1 : ( RULE_STRING ) ;
    public final void rule__Declaration__LocationAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3776:1: ( ( RULE_STRING ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3777:1: ( RULE_STRING )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3777:1: ( RULE_STRING )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3778:1: RULE_STRING
            {
             before(grammarAccess.getDeclarationAccess().getLocationSTRINGTerminalRuleCall_14_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Declaration__LocationAssignment_14_17455); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3787:1: rule__Declaration__PriceAssignment_16 : ( rulePrice ) ;
    public final void rule__Declaration__PriceAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3791:1: ( ( rulePrice ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3792:1: ( rulePrice )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3792:1: ( rulePrice )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3793:1: rulePrice
            {
             before(grammarAccess.getDeclarationAccess().getPricePriceParserRuleCall_16_0()); 
            pushFollow(FOLLOW_rulePrice_in_rule__Declaration__PriceAssignment_167486);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3802:1: rule__Declaration__VolumeAssignment_17_1 : ( RULE_INT ) ;
    public final void rule__Declaration__VolumeAssignment_17_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3806:1: ( ( RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3807:1: ( RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3807:1: ( RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3808:1: RULE_INT
            {
             before(grammarAccess.getDeclarationAccess().getVolumeINTTerminalRuleCall_17_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Declaration__VolumeAssignment_17_17517); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3817:1: rule__Declaration__LanguageAssignment_19 : ( ruleLanguage ) ;
    public final void rule__Declaration__LanguageAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3821:1: ( ( ruleLanguage ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3822:1: ( ruleLanguage )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3822:1: ( ruleLanguage )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3823:1: ruleLanguage
            {
             before(grammarAccess.getDeclarationAccess().getLanguageLanguageParserRuleCall_19_0()); 
            pushFollow(FOLLOW_ruleLanguage_in_rule__Declaration__LanguageAssignment_197548);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3832:1: rule__Declaration__FormatAssignment_21 : ( ruleFormat ) ;
    public final void rule__Declaration__FormatAssignment_21() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3836:1: ( ( ruleFormat ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3837:1: ( ruleFormat )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3837:1: ( ruleFormat )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3838:1: ruleFormat
            {
             before(grammarAccess.getDeclarationAccess().getFormatFormatParserRuleCall_21_0()); 
            pushFollow(FOLLOW_ruleFormat_in_rule__Declaration__FormatAssignment_217579);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3847:1: rule__Declaration__ArticleCntAssignment_23 : ( RULE_INT ) ;
    public final void rule__Declaration__ArticleCntAssignment_23() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3851:1: ( ( RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3852:1: ( RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3852:1: ( RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3853:1: RULE_INT
            {
             before(grammarAccess.getDeclarationAccess().getArticleCntINTTerminalRuleCall_23_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Declaration__ArticleCntAssignment_237610); 
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


    // $ANTLR start "rule__Declaration__ArticleWordsMinAssignment_25"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3862:1: rule__Declaration__ArticleWordsMinAssignment_25 : ( RULE_INT ) ;
    public final void rule__Declaration__ArticleWordsMinAssignment_25() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3866:1: ( ( RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3867:1: ( RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3867:1: ( RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3868:1: RULE_INT
            {
             before(grammarAccess.getDeclarationAccess().getArticleWordsMinINTTerminalRuleCall_25_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Declaration__ArticleWordsMinAssignment_257641); 
             after(grammarAccess.getDeclarationAccess().getArticleWordsMinINTTerminalRuleCall_25_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__ArticleWordsMinAssignment_25"


    // $ANTLR start "rule__Declaration__ArticleWordsMaxAssignment_27"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3877:1: rule__Declaration__ArticleWordsMaxAssignment_27 : ( RULE_INT ) ;
    public final void rule__Declaration__ArticleWordsMaxAssignment_27() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3881:1: ( ( RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3882:1: ( RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3882:1: ( RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3883:1: RULE_INT
            {
             before(grammarAccess.getDeclarationAccess().getArticleWordsMaxINTTerminalRuleCall_27_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Declaration__ArticleWordsMaxAssignment_277672); 
             after(grammarAccess.getDeclarationAccess().getArticleWordsMaxINTTerminalRuleCall_27_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__ArticleWordsMaxAssignment_27"


    // $ANTLR start "rule__Declaration__ImagesCntAssignment_28_1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3892:1: rule__Declaration__ImagesCntAssignment_28_1 : ( ruleImagesCount ) ;
    public final void rule__Declaration__ImagesCntAssignment_28_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3896:1: ( ( ruleImagesCount ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3897:1: ( ruleImagesCount )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3897:1: ( ruleImagesCount )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3898:1: ruleImagesCount
            {
             before(grammarAccess.getDeclarationAccess().getImagesCntImagesCountParserRuleCall_28_1_0()); 
            pushFollow(FOLLOW_ruleImagesCount_in_rule__Declaration__ImagesCntAssignment_28_17703);
            ruleImagesCount();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getImagesCntImagesCountParserRuleCall_28_1_0()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3907:1: rule__Declaration__ColumnsCntAssignment_30 : ( RULE_INT ) ;
    public final void rule__Declaration__ColumnsCntAssignment_30() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3911:1: ( ( RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3912:1: ( RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3912:1: ( RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3913:1: RULE_INT
            {
             before(grammarAccess.getDeclarationAccess().getColumnsCntINTTerminalRuleCall_30_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Declaration__ColumnsCntAssignment_307734); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3922:1: rule__Declaration__FontSizeAssignment_32 : ( ruleFontSize ) ;
    public final void rule__Declaration__FontSizeAssignment_32() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3926:1: ( ( ruleFontSize ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3927:1: ( ruleFontSize )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3927:1: ( ruleFontSize )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3928:1: ruleFontSize
            {
             before(grammarAccess.getDeclarationAccess().getFontSizeFontSizeParserRuleCall_32_0()); 
            pushFollow(FOLLOW_ruleFontSize_in_rule__Declaration__FontSizeAssignment_327765);
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


    // $ANTLR start "rule__ImagesCount__ValueAssignment"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3937:1: rule__ImagesCount__ValueAssignment : ( RULE_INT ) ;
    public final void rule__ImagesCount__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3941:1: ( ( RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3942:1: ( RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3942:1: ( RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3943:1: RULE_INT
            {
             before(grammarAccess.getImagesCountAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ImagesCount__ValueAssignment7796); 
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


    // $ANTLR start "rule__Date__DayAssignment_1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3952:1: rule__Date__DayAssignment_1 : ( RULE_INT ) ;
    public final void rule__Date__DayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3956:1: ( ( RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3957:1: ( RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3957:1: ( RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3958:1: RULE_INT
            {
             before(grammarAccess.getDateAccess().getDayINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Date__DayAssignment_17827); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3967:1: rule__Date__MonthAssignment_3 : ( RULE_INT ) ;
    public final void rule__Date__MonthAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3971:1: ( ( RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3972:1: ( RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3972:1: ( RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3973:1: RULE_INT
            {
             before(grammarAccess.getDateAccess().getMonthINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Date__MonthAssignment_37858); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3982:1: rule__Date__YearAssignment_5 : ( RULE_INT ) ;
    public final void rule__Date__YearAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3986:1: ( ( RULE_INT ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3987:1: ( RULE_INT )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3987:1: ( RULE_INT )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3988:1: RULE_INT
            {
             before(grammarAccess.getDateAccess().getYearINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Date__YearAssignment_57889); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:3997:1: rule__Price__ValueAssignment_1 : ( ruleFloat ) ;
    public final void rule__Price__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4001:1: ( ( ruleFloat ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4002:1: ( ruleFloat )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4002:1: ( ruleFloat )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4003:1: ruleFloat
            {
             before(grammarAccess.getPriceAccess().getValueFloatParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFloat_in_rule__Price__ValueAssignment_17920);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4012:1: rule__Price__CurrencyAssignment_2 : ( ruleCurrency ) ;
    public final void rule__Price__CurrencyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4016:1: ( ( ruleCurrency ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4017:1: ( ruleCurrency )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4017:1: ( ruleCurrency )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4018:1: ruleCurrency
            {
             before(grammarAccess.getPriceAccess().getCurrencyCurrencyParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCurrency_in_rule__Price__CurrencyAssignment_27951);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4027:1: rule__Topic__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Topic__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4031:1: ( ( RULE_ID ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4032:1: ( RULE_ID )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4032:1: ( RULE_ID )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4033:1: RULE_ID
            {
             before(grammarAccess.getTopicAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Topic__NameAssignment_17982); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4042:1: rule__Topic__TagsAssignment_3 : ( ruleTopicTag ) ;
    public final void rule__Topic__TagsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4046:1: ( ( ruleTopicTag ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4047:1: ( ruleTopicTag )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4047:1: ( ruleTopicTag )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4048:1: ruleTopicTag
            {
             before(grammarAccess.getTopicAccess().getTagsTopicTagParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTopicTag_in_rule__Topic__TagsAssignment_38013);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4057:1: rule__Topic__TagsAssignment_4_1 : ( ruleTopicTag ) ;
    public final void rule__Topic__TagsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4061:1: ( ( ruleTopicTag ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4062:1: ( ruleTopicTag )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4062:1: ( ruleTopicTag )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4063:1: ruleTopicTag
            {
             before(grammarAccess.getTopicAccess().getTagsTopicTagParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleTopicTag_in_rule__Topic__TagsAssignment_4_18044);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4072:1: rule__TopicTag__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__TopicTag__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4076:1: ( ( RULE_STRING ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4077:1: ( RULE_STRING )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4077:1: ( RULE_STRING )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4078:1: RULE_STRING
            {
             before(grammarAccess.getTopicTagAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TopicTag__ValueAssignment8075); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4087:1: rule__Pair__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__Pair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4091:1: ( ( RULE_ID ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4092:1: ( RULE_ID )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4092:1: ( RULE_ID )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4093:1: RULE_ID
            {
             before(grammarAccess.getPairAccess().getKeyIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Pair__KeyAssignment_08106); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4102:1: rule__Pair__ValueAssignment_2 : ( RULE_URL ) ;
    public final void rule__Pair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4106:1: ( ( RULE_URL ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4107:1: ( RULE_URL )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4107:1: ( RULE_URL )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:4108:1: RULE_URL
            {
             before(grammarAccess.getPairAccess().getValueURLTerminalRuleCall_2_0()); 
            match(input,RULE_URL,FOLLOW_RULE_URL_in_rule__Pair__ValueAssignment_28137); 
             after(grammarAccess.getPairAccess().getValueURLTerminalRuleCall_2_0()); 

            }


            }

        }
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
    public static final BitSet FOLLOW_ruleImagesCount_in_entryRuleImagesCount121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImagesCount128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImagesCount__ValueAssignment_in_ruleImagesCount154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFontSize_in_entryRuleFontSize181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFontSize188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FontSize__Alternatives_in_ruleFontSize214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormat_in_entryRuleFormat241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormat248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Alternatives_in_ruleFormat274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_in_entryRuleDate301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDate308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__Group__0_in_ruleDate334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLanguage_in_entryRuleLanguage361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLanguage368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Alternatives_in_ruleLanguage394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrice_in_entryRulePrice421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrice428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Price__Group__0_in_rulePrice454 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_ruleFloat_in_entryRuleFloat721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloat728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Float__Group__0_in_ruleFloat754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FontSize__Group_0__0_in_rule__FontSize__Alternatives790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FontSize__Group_1__0_in_rule__FontSize__Alternatives808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FontSize__Group_2__0_in_rule__FontSize__Alternatives826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_0__0_in_rule__Format__Alternatives859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_1__0_in_rule__Format__Alternatives877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_2__0_in_rule__Format__Alternatives895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_3__0_in_rule__Format__Alternatives913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_4__0_in_rule__Format__Alternatives931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_5__0_in_rule__Format__Alternatives949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_6__0_in_rule__Format__Alternatives967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group_0__0_in_rule__Language__Alternatives1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group_1__0_in_rule__Language__Alternatives1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Currency__Group_0__0_in_rule__Currency__Alternatives1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Currency__Group_1__0_in_rule__Currency__Alternatives1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Float__Alternatives_1_01103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Float__Alternatives_1_01123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__0__Impl_in_rule__Declaration__Group__01155 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Declaration__Group__1_in_rule__Declaration__Group__01158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Declaration__Group__0__Impl1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__1__Impl_in_rule__Declaration__Group__11217 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__2_in_rule__Declaration__Group__11220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__NameAssignment_1_in_rule__Declaration__Group__1__Impl1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__2__Impl_in_rule__Declaration__Group__21277 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__3_in_rule__Declaration__Group__21280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Declaration__Group__2__Impl1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__3__Impl_in_rule__Declaration__Group__31339 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__4_in_rule__Declaration__Group__31342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Declaration__Group__3__Impl1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__4__Impl_in_rule__Declaration__Group__41401 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Declaration__Group__5_in_rule__Declaration__Group__41404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Declaration__Group__4__Impl1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__5__Impl_in_rule__Declaration__Group__51463 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__6_in_rule__Declaration__Group__51466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__FeedlinksAssignment_5_in_rule__Declaration__Group__5__Impl1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__6__Impl_in_rule__Declaration__Group__61523 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__7_in_rule__Declaration__Group__61526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_6__0_in_rule__Declaration__Group__6__Impl1553 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__7__Impl_in_rule__Declaration__Group__71584 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__8_in_rule__Declaration__Group__71587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Declaration__Group__7__Impl1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__8__Impl_in_rule__Declaration__Group__81646 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__9_in_rule__Declaration__Group__81649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Declaration__Group__8__Impl1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__9__Impl_in_rule__Declaration__Group__91708 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__10_in_rule__Declaration__Group__91711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Declaration__Group__9__Impl1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__10__Impl_in_rule__Declaration__Group__101770 = new BitSet(new long[]{0x0000400000020000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__11_in_rule__Declaration__Group__101773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__TopicsAssignment_10_in_rule__Declaration__Group__10__Impl1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__11__Impl_in_rule__Declaration__Group__111830 = new BitSet(new long[]{0x0000400000020000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__12_in_rule__Declaration__Group__111833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__TopicsAssignment_11_in_rule__Declaration__Group__11__Impl1860 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__12__Impl_in_rule__Declaration__Group__121891 = new BitSet(new long[]{0x0000000030080000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__13_in_rule__Declaration__Group__121894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Declaration__Group__12__Impl1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__13__Impl_in_rule__Declaration__Group__131953 = new BitSet(new long[]{0x0000000030080000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__14_in_rule__Declaration__Group__131956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_13__0_in_rule__Declaration__Group__13__Impl1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__14__Impl_in_rule__Declaration__Group__142014 = new BitSet(new long[]{0x0000000030080000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__15_in_rule__Declaration__Group__142017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_14__0_in_rule__Declaration__Group__14__Impl2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__15__Impl_in_rule__Declaration__Group__152075 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__16_in_rule__Declaration__Group__152078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Declaration__Group__15__Impl2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__16__Impl_in_rule__Declaration__Group__162137 = new BitSet(new long[]{0x0000000040100000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__17_in_rule__Declaration__Group__162140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__PriceAssignment_16_in_rule__Declaration__Group__16__Impl2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__17__Impl_in_rule__Declaration__Group__172197 = new BitSet(new long[]{0x0000000040100000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__18_in_rule__Declaration__Group__172200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_17__0_in_rule__Declaration__Group__17__Impl2227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__18__Impl_in_rule__Declaration__Group__182258 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__19_in_rule__Declaration__Group__182261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Declaration__Group__18__Impl2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__19__Impl_in_rule__Declaration__Group__192320 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__20_in_rule__Declaration__Group__192323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__LanguageAssignment_19_in_rule__Declaration__Group__19__Impl2350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__20__Impl_in_rule__Declaration__Group__202380 = new BitSet(new long[]{0x000003F800000000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__21_in_rule__Declaration__Group__202383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Declaration__Group__20__Impl2411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__21__Impl_in_rule__Declaration__Group__212442 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__22_in_rule__Declaration__Group__212445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__FormatAssignment_21_in_rule__Declaration__Group__21__Impl2472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__22__Impl_in_rule__Declaration__Group__222502 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Declaration__Group__23_in_rule__Declaration__Group__222505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Declaration__Group__22__Impl2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__23__Impl_in_rule__Declaration__Group__232564 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__24_in_rule__Declaration__Group__232567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__ArticleCntAssignment_23_in_rule__Declaration__Group__23__Impl2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__24__Impl_in_rule__Declaration__Group__242624 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Declaration__Group__25_in_rule__Declaration__Group__242627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Declaration__Group__24__Impl2655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__25__Impl_in_rule__Declaration__Group__252686 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__26_in_rule__Declaration__Group__252689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__ArticleWordsMinAssignment_25_in_rule__Declaration__Group__25__Impl2716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__26__Impl_in_rule__Declaration__Group__262746 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Declaration__Group__27_in_rule__Declaration__Group__262749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Declaration__Group__26__Impl2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__27__Impl_in_rule__Declaration__Group__272808 = new BitSet(new long[]{0x0000000082000000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__28_in_rule__Declaration__Group__272811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__ArticleWordsMaxAssignment_27_in_rule__Declaration__Group__27__Impl2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__28__Impl_in_rule__Declaration__Group__282868 = new BitSet(new long[]{0x0000000082000000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__29_in_rule__Declaration__Group__282871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_28__0_in_rule__Declaration__Group__28__Impl2898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__29__Impl_in_rule__Declaration__Group__292929 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Declaration__Group__30_in_rule__Declaration__Group__292932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Declaration__Group__29__Impl2960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__30__Impl_in_rule__Declaration__Group__302991 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__31_in_rule__Declaration__Group__302994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__ColumnsCntAssignment_30_in_rule__Declaration__Group__30__Impl3021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__31__Impl_in_rule__Declaration__Group__313051 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__32_in_rule__Declaration__Group__313054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Declaration__Group__31__Impl3082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__32__Impl_in_rule__Declaration__Group__323113 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__33_in_rule__Declaration__Group__323116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__FontSizeAssignment_32_in_rule__Declaration__Group__32__Impl3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__33__Impl_in_rule__Declaration__Group__333173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Declaration__Group__33__Impl3201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_6__0__Impl_in_rule__Declaration__Group_6__03300 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Declaration__Group_6__1_in_rule__Declaration__Group_6__03303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Declaration__Group_6__0__Impl3331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_6__1__Impl_in_rule__Declaration__Group_6__13362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__PairsAssignment_6_1_in_rule__Declaration__Group_6__1__Impl3389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_13__0__Impl_in_rule__Declaration__Group_13__03423 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Declaration__Group_13__1_in_rule__Declaration__Group_13__03426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Declaration__Group_13__0__Impl3454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_13__1__Impl_in_rule__Declaration__Group_13__13485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__DateAssignment_13_1_in_rule__Declaration__Group_13__1__Impl3512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_14__0__Impl_in_rule__Declaration__Group_14__03546 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Declaration__Group_14__1_in_rule__Declaration__Group_14__03549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Declaration__Group_14__0__Impl3577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_14__1__Impl_in_rule__Declaration__Group_14__13608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__LocationAssignment_14_1_in_rule__Declaration__Group_14__1__Impl3635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_17__0__Impl_in_rule__Declaration__Group_17__03669 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Declaration__Group_17__1_in_rule__Declaration__Group_17__03672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Declaration__Group_17__0__Impl3700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_17__1__Impl_in_rule__Declaration__Group_17__13731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__VolumeAssignment_17_1_in_rule__Declaration__Group_17__1__Impl3758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_28__0__Impl_in_rule__Declaration__Group_28__03792 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Declaration__Group_28__1_in_rule__Declaration__Group_28__03795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Declaration__Group_28__0__Impl3823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_28__1__Impl_in_rule__Declaration__Group_28__13854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__ImagesCntAssignment_28_1_in_rule__Declaration__Group_28__1__Impl3881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FontSize__Group_0__0__Impl_in_rule__FontSize__Group_0__03915 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__FontSize__Group_0__1_in_rule__FontSize__Group_0__03918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FontSize__Group_0__1__Impl_in_rule__FontSize__Group_0__13976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__FontSize__Group_0__1__Impl4004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FontSize__Group_1__0__Impl_in_rule__FontSize__Group_1__04039 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__FontSize__Group_1__1_in_rule__FontSize__Group_1__04042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FontSize__Group_1__1__Impl_in_rule__FontSize__Group_1__14100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__FontSize__Group_1__1__Impl4128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FontSize__Group_2__0__Impl_in_rule__FontSize__Group_2__04163 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_rule__FontSize__Group_2__1_in_rule__FontSize__Group_2__04166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FontSize__Group_2__1__Impl_in_rule__FontSize__Group_2__14224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__FontSize__Group_2__1__Impl4252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_0__0__Impl_in_rule__Format__Group_0__04287 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Format__Group_0__1_in_rule__Format__Group_0__04290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_0__1__Impl_in_rule__Format__Group_0__14348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Format__Group_0__1__Impl4376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_1__0__Impl_in_rule__Format__Group_1__04411 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Format__Group_1__1_in_rule__Format__Group_1__04414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_1__1__Impl_in_rule__Format__Group_1__14472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Format__Group_1__1__Impl4500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_2__0__Impl_in_rule__Format__Group_2__04535 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Format__Group_2__1_in_rule__Format__Group_2__04538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_2__1__Impl_in_rule__Format__Group_2__14596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Format__Group_2__1__Impl4624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_3__0__Impl_in_rule__Format__Group_3__04659 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Format__Group_3__1_in_rule__Format__Group_3__04662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_3__1__Impl_in_rule__Format__Group_3__14720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Format__Group_3__1__Impl4748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_4__0__Impl_in_rule__Format__Group_4__04783 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Format__Group_4__1_in_rule__Format__Group_4__04786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_4__1__Impl_in_rule__Format__Group_4__14844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Format__Group_4__1__Impl4872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_5__0__Impl_in_rule__Format__Group_5__04907 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Format__Group_5__1_in_rule__Format__Group_5__04910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_5__1__Impl_in_rule__Format__Group_5__14968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Format__Group_5__1__Impl4996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_6__0__Impl_in_rule__Format__Group_6__05031 = new BitSet(new long[]{0x000003F800000000L});
    public static final BitSet FOLLOW_rule__Format__Group_6__1_in_rule__Format__Group_6__05034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Format__Group_6__1__Impl_in_rule__Format__Group_6__15092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Format__Group_6__1__Impl5120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__Group__0__Impl_in_rule__Date__Group__05155 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Date__Group__1_in_rule__Date__Group__05158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Date__Group__0__Impl5186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__Group__1__Impl_in_rule__Date__Group__15217 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Date__Group__2_in_rule__Date__Group__15220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__DayAssignment_1_in_rule__Date__Group__1__Impl5247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__Group__2__Impl_in_rule__Date__Group__25277 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Date__Group__3_in_rule__Date__Group__25280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Date__Group__2__Impl5308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__Group__3__Impl_in_rule__Date__Group__35339 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Date__Group__4_in_rule__Date__Group__35342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__MonthAssignment_3_in_rule__Date__Group__3__Impl5369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__Group__4__Impl_in_rule__Date__Group__45399 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Date__Group__5_in_rule__Date__Group__45402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Date__Group__4__Impl5430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__Group__5__Impl_in_rule__Date__Group__55461 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Date__Group__6_in_rule__Date__Group__55464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__YearAssignment_5_in_rule__Date__Group__5__Impl5491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__Group__6__Impl_in_rule__Date__Group__65521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Date__Group__6__Impl5549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group_0__0__Impl_in_rule__Language__Group_0__05594 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Language__Group_0__1_in_rule__Language__Group_0__05597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group_0__1__Impl_in_rule__Language__Group_0__15655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Language__Group_0__1__Impl5683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group_1__0__Impl_in_rule__Language__Group_1__05718 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_rule__Language__Group_1__1_in_rule__Language__Group_1__05721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group_1__1__Impl_in_rule__Language__Group_1__15779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Language__Group_1__1__Impl5807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Price__Group__0__Impl_in_rule__Price__Group__05842 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Price__Group__1_in_rule__Price__Group__05845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Price__Group__0__Impl5873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Price__Group__1__Impl_in_rule__Price__Group__15904 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_rule__Price__Group__2_in_rule__Price__Group__15907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Price__ValueAssignment_1_in_rule__Price__Group__1__Impl5934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Price__Group__2__Impl_in_rule__Price__Group__25964 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Price__Group__3_in_rule__Price__Group__25967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Price__CurrencyAssignment_2_in_rule__Price__Group__2__Impl5994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Price__Group__3__Impl_in_rule__Price__Group__36024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Price__Group__3__Impl6052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Currency__Group_0__0__Impl_in_rule__Currency__Group_0__06091 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Currency__Group_0__1_in_rule__Currency__Group_0__06094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Currency__Group_0__1__Impl_in_rule__Currency__Group_0__16152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Currency__Group_0__1__Impl6180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Currency__Group_1__0__Impl_in_rule__Currency__Group_1__06215 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_rule__Currency__Group_1__1_in_rule__Currency__Group_1__06218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Currency__Group_1__1__Impl_in_rule__Currency__Group_1__16276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Currency__Group_1__1__Impl6304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Topic__Group__0__Impl_in_rule__Topic__Group__06339 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Topic__Group__1_in_rule__Topic__Group__06342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Topic__Group__0__Impl6370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Topic__Group__1__Impl_in_rule__Topic__Group__16401 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Topic__Group__2_in_rule__Topic__Group__16404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Topic__NameAssignment_1_in_rule__Topic__Group__1__Impl6431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Topic__Group__2__Impl_in_rule__Topic__Group__26461 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Topic__Group__3_in_rule__Topic__Group__26464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Topic__Group__2__Impl6492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Topic__Group__3__Impl_in_rule__Topic__Group__36523 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_rule__Topic__Group__4_in_rule__Topic__Group__36526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Topic__TagsAssignment_3_in_rule__Topic__Group__3__Impl6553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Topic__Group__4__Impl_in_rule__Topic__Group__46583 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_rule__Topic__Group__5_in_rule__Topic__Group__46586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Topic__Group_4__0_in_rule__Topic__Group__4__Impl6613 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Topic__Group__5__Impl_in_rule__Topic__Group__56644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Topic__Group__5__Impl6672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Topic__Group_4__0__Impl_in_rule__Topic__Group_4__06715 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Topic__Group_4__1_in_rule__Topic__Group_4__06718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Topic__Group_4__0__Impl6746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Topic__Group_4__1__Impl_in_rule__Topic__Group_4__16777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Topic__TagsAssignment_4_1_in_rule__Topic__Group_4__1__Impl6804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pair__Group__0__Impl_in_rule__Pair__Group__06838 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__Pair__Group__1_in_rule__Pair__Group__06841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pair__KeyAssignment_0_in_rule__Pair__Group__0__Impl6868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pair__Group__1__Impl_in_rule__Pair__Group__16898 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Pair__Group__2_in_rule__Pair__Group__16901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Pair__Group__1__Impl6929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pair__Group__2__Impl_in_rule__Pair__Group__26960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pair__ValueAssignment_2_in_rule__Pair__Group__2__Impl6987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Float__Group__0__Impl_in_rule__Float__Group__07023 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__Float__Group__1_in_rule__Float__Group__07026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Float__Group__0__Impl7053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Float__Group__1__Impl_in_rule__Float__Group__17082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Float__Group_1__0_in_rule__Float__Group__1__Impl7109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Float__Group_1__0__Impl_in_rule__Float__Group_1__07144 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Float__Group_1__1_in_rule__Float__Group_1__07147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Float__Alternatives_1_0_in_rule__Float__Group_1__0__Impl7174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Float__Group_1__1__Impl_in_rule__Float__Group_1__17204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Float__Group_1__1__Impl7231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Declaration__NameAssignment_17269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePair_in_rule__Declaration__FeedlinksAssignment_57300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePair_in_rule__Declaration__PairsAssignment_6_17331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopic_in_rule__Declaration__TopicsAssignment_107362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopic_in_rule__Declaration__TopicsAssignment_117393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_in_rule__Declaration__DateAssignment_13_17424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Declaration__LocationAssignment_14_17455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrice_in_rule__Declaration__PriceAssignment_167486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Declaration__VolumeAssignment_17_17517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLanguage_in_rule__Declaration__LanguageAssignment_197548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormat_in_rule__Declaration__FormatAssignment_217579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Declaration__ArticleCntAssignment_237610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Declaration__ArticleWordsMinAssignment_257641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Declaration__ArticleWordsMaxAssignment_277672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImagesCount_in_rule__Declaration__ImagesCntAssignment_28_17703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Declaration__ColumnsCntAssignment_307734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFontSize_in_rule__Declaration__FontSizeAssignment_327765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ImagesCount__ValueAssignment7796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Date__DayAssignment_17827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Date__MonthAssignment_37858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Date__YearAssignment_57889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloat_in_rule__Price__ValueAssignment_17920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCurrency_in_rule__Price__CurrencyAssignment_27951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Topic__NameAssignment_17982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopicTag_in_rule__Topic__TagsAssignment_38013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopicTag_in_rule__Topic__TagsAssignment_4_18044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TopicTag__ValueAssignment8075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Pair__KeyAssignment_08106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_URL_in_rule__Pair__ValueAssignment_28137 = new BitSet(new long[]{0x0000000000000002L});

}