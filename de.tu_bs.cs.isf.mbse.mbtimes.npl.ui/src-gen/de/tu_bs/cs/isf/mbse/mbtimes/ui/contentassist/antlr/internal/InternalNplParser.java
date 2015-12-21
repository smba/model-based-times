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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'newspaper'", "'feedlink'", "'{'", "'}'", "', '"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

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


    // $ANTLR start "entryRuleFeedlinks"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:88:1: entryRuleFeedlinks : ruleFeedlinks EOF ;
    public final void entryRuleFeedlinks() throws RecognitionException {
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:89:1: ( ruleFeedlinks EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:90:1: ruleFeedlinks EOF
            {
             before(grammarAccess.getFeedlinksRule()); 
            pushFollow(FOLLOW_ruleFeedlinks_in_entryRuleFeedlinks121);
            ruleFeedlinks();

            state._fsp--;

             after(grammarAccess.getFeedlinksRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeedlinks128); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:97:1: ruleFeedlinks : ( ( rule__Feedlinks__Group__0 ) ) ;
    public final void ruleFeedlinks() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:101:2: ( ( ( rule__Feedlinks__Group__0 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:102:1: ( ( rule__Feedlinks__Group__0 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:102:1: ( ( rule__Feedlinks__Group__0 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:103:1: ( rule__Feedlinks__Group__0 )
            {
             before(grammarAccess.getFeedlinksAccess().getGroup()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:104:1: ( rule__Feedlinks__Group__0 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:104:2: rule__Feedlinks__Group__0
            {
            pushFollow(FOLLOW_rule__Feedlinks__Group__0_in_ruleFeedlinks154);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:116:1: entryRulePair : rulePair EOF ;
    public final void entryRulePair() throws RecognitionException {
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:117:1: ( rulePair EOF )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:118:1: rulePair EOF
            {
             before(grammarAccess.getPairRule()); 
            pushFollow(FOLLOW_rulePair_in_entryRulePair181);
            rulePair();

            state._fsp--;

             after(grammarAccess.getPairRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePair188); 

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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:125:1: rulePair : ( ( rule__Pair__Group__0 ) ) ;
    public final void rulePair() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:129:2: ( ( ( rule__Pair__Group__0 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:130:1: ( ( rule__Pair__Group__0 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:130:1: ( ( rule__Pair__Group__0 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:131:1: ( rule__Pair__Group__0 )
            {
             before(grammarAccess.getPairAccess().getGroup()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:132:1: ( rule__Pair__Group__0 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:132:2: rule__Pair__Group__0
            {
            pushFollow(FOLLOW_rule__Pair__Group__0_in_rulePair214);
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


    // $ANTLR start "rule__Declaration__Group__0"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:146:1: rule__Declaration__Group__0 : rule__Declaration__Group__0__Impl rule__Declaration__Group__1 ;
    public final void rule__Declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:150:1: ( rule__Declaration__Group__0__Impl rule__Declaration__Group__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:151:2: rule__Declaration__Group__0__Impl rule__Declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group__0__Impl_in_rule__Declaration__Group__0248);
            rule__Declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__1_in_rule__Declaration__Group__0251);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:158:1: rule__Declaration__Group__0__Impl : ( 'newspaper' ) ;
    public final void rule__Declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:162:1: ( ( 'newspaper' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:163:1: ( 'newspaper' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:163:1: ( 'newspaper' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:164:1: 'newspaper'
            {
             before(grammarAccess.getDeclarationAccess().getNewspaperKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Declaration__Group__0__Impl279); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:177:1: rule__Declaration__Group__1 : rule__Declaration__Group__1__Impl rule__Declaration__Group__2 ;
    public final void rule__Declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:181:1: ( rule__Declaration__Group__1__Impl rule__Declaration__Group__2 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:182:2: rule__Declaration__Group__1__Impl rule__Declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Declaration__Group__1__Impl_in_rule__Declaration__Group__1310);
            rule__Declaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__2_in_rule__Declaration__Group__1313);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:189:1: rule__Declaration__Group__1__Impl : ( ( rule__Declaration__NameAssignment_1 ) ) ;
    public final void rule__Declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:193:1: ( ( ( rule__Declaration__NameAssignment_1 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:194:1: ( ( rule__Declaration__NameAssignment_1 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:194:1: ( ( rule__Declaration__NameAssignment_1 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:195:1: ( rule__Declaration__NameAssignment_1 )
            {
             before(grammarAccess.getDeclarationAccess().getNameAssignment_1()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:196:1: ( rule__Declaration__NameAssignment_1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:196:2: rule__Declaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Declaration__NameAssignment_1_in_rule__Declaration__Group__1__Impl340);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:206:1: rule__Declaration__Group__2 : rule__Declaration__Group__2__Impl rule__Declaration__Group__3 ;
    public final void rule__Declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:210:1: ( rule__Declaration__Group__2__Impl rule__Declaration__Group__3 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:211:2: rule__Declaration__Group__2__Impl rule__Declaration__Group__3
            {
            pushFollow(FOLLOW_rule__Declaration__Group__2__Impl_in_rule__Declaration__Group__2370);
            rule__Declaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__3_in_rule__Declaration__Group__2373);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:218:1: rule__Declaration__Group__2__Impl : ( 'feedlink' ) ;
    public final void rule__Declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:222:1: ( ( 'feedlink' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:223:1: ( 'feedlink' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:223:1: ( 'feedlink' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:224:1: 'feedlink'
            {
             before(grammarAccess.getDeclarationAccess().getFeedlinkKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Declaration__Group__2__Impl401); 
             after(grammarAccess.getDeclarationAccess().getFeedlinkKeyword_2()); 

            }


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:237:1: rule__Declaration__Group__3 : rule__Declaration__Group__3__Impl ;
    public final void rule__Declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:241:1: ( rule__Declaration__Group__3__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:242:2: rule__Declaration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group__3__Impl_in_rule__Declaration__Group__3432);
            rule__Declaration__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:248:1: rule__Declaration__Group__3__Impl : ( ( rule__Declaration__FeedlinksAssignment_3 ) ) ;
    public final void rule__Declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:252:1: ( ( ( rule__Declaration__FeedlinksAssignment_3 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:253:1: ( ( rule__Declaration__FeedlinksAssignment_3 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:253:1: ( ( rule__Declaration__FeedlinksAssignment_3 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:254:1: ( rule__Declaration__FeedlinksAssignment_3 )
            {
             before(grammarAccess.getDeclarationAccess().getFeedlinksAssignment_3()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:255:1: ( rule__Declaration__FeedlinksAssignment_3 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:255:2: rule__Declaration__FeedlinksAssignment_3
            {
            pushFollow(FOLLOW_rule__Declaration__FeedlinksAssignment_3_in_rule__Declaration__Group__3__Impl459);
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


    // $ANTLR start "rule__Feedlinks__Group__0"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:273:1: rule__Feedlinks__Group__0 : rule__Feedlinks__Group__0__Impl rule__Feedlinks__Group__1 ;
    public final void rule__Feedlinks__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:277:1: ( rule__Feedlinks__Group__0__Impl rule__Feedlinks__Group__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:278:2: rule__Feedlinks__Group__0__Impl rule__Feedlinks__Group__1
            {
            pushFollow(FOLLOW_rule__Feedlinks__Group__0__Impl_in_rule__Feedlinks__Group__0497);
            rule__Feedlinks__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feedlinks__Group__1_in_rule__Feedlinks__Group__0500);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:285:1: rule__Feedlinks__Group__0__Impl : ( '{' ) ;
    public final void rule__Feedlinks__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:289:1: ( ( '{' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:290:1: ( '{' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:290:1: ( '{' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:291:1: '{'
            {
             before(grammarAccess.getFeedlinksAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Feedlinks__Group__0__Impl528); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:304:1: rule__Feedlinks__Group__1 : rule__Feedlinks__Group__1__Impl rule__Feedlinks__Group__2 ;
    public final void rule__Feedlinks__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:308:1: ( rule__Feedlinks__Group__1__Impl rule__Feedlinks__Group__2 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:309:2: rule__Feedlinks__Group__1__Impl rule__Feedlinks__Group__2
            {
            pushFollow(FOLLOW_rule__Feedlinks__Group__1__Impl_in_rule__Feedlinks__Group__1559);
            rule__Feedlinks__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feedlinks__Group__2_in_rule__Feedlinks__Group__1562);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:316:1: rule__Feedlinks__Group__1__Impl : ( ( rule__Feedlinks__PairsAssignment_1 ) ) ;
    public final void rule__Feedlinks__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:320:1: ( ( ( rule__Feedlinks__PairsAssignment_1 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:321:1: ( ( rule__Feedlinks__PairsAssignment_1 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:321:1: ( ( rule__Feedlinks__PairsAssignment_1 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:322:1: ( rule__Feedlinks__PairsAssignment_1 )
            {
             before(grammarAccess.getFeedlinksAccess().getPairsAssignment_1()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:323:1: ( rule__Feedlinks__PairsAssignment_1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:323:2: rule__Feedlinks__PairsAssignment_1
            {
            pushFollow(FOLLOW_rule__Feedlinks__PairsAssignment_1_in_rule__Feedlinks__Group__1__Impl589);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:333:1: rule__Feedlinks__Group__2 : rule__Feedlinks__Group__2__Impl rule__Feedlinks__Group__3 ;
    public final void rule__Feedlinks__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:337:1: ( rule__Feedlinks__Group__2__Impl rule__Feedlinks__Group__3 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:338:2: rule__Feedlinks__Group__2__Impl rule__Feedlinks__Group__3
            {
            pushFollow(FOLLOW_rule__Feedlinks__Group__2__Impl_in_rule__Feedlinks__Group__2619);
            rule__Feedlinks__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feedlinks__Group__3_in_rule__Feedlinks__Group__2622);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:345:1: rule__Feedlinks__Group__2__Impl : ( ( rule__Feedlinks__Group_2__0 )* ) ;
    public final void rule__Feedlinks__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:349:1: ( ( ( rule__Feedlinks__Group_2__0 )* ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:350:1: ( ( rule__Feedlinks__Group_2__0 )* )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:350:1: ( ( rule__Feedlinks__Group_2__0 )* )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:351:1: ( rule__Feedlinks__Group_2__0 )*
            {
             before(grammarAccess.getFeedlinksAccess().getGroup_2()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:352:1: ( rule__Feedlinks__Group_2__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:352:2: rule__Feedlinks__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Feedlinks__Group_2__0_in_rule__Feedlinks__Group__2__Impl649);
            	    rule__Feedlinks__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:362:1: rule__Feedlinks__Group__3 : rule__Feedlinks__Group__3__Impl ;
    public final void rule__Feedlinks__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:366:1: ( rule__Feedlinks__Group__3__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:367:2: rule__Feedlinks__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Feedlinks__Group__3__Impl_in_rule__Feedlinks__Group__3680);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:373:1: rule__Feedlinks__Group__3__Impl : ( '}' ) ;
    public final void rule__Feedlinks__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:377:1: ( ( '}' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:378:1: ( '}' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:378:1: ( '}' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:379:1: '}'
            {
             before(grammarAccess.getFeedlinksAccess().getRightCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__Feedlinks__Group__3__Impl708); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:400:1: rule__Feedlinks__Group_2__0 : rule__Feedlinks__Group_2__0__Impl rule__Feedlinks__Group_2__1 ;
    public final void rule__Feedlinks__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:404:1: ( rule__Feedlinks__Group_2__0__Impl rule__Feedlinks__Group_2__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:405:2: rule__Feedlinks__Group_2__0__Impl rule__Feedlinks__Group_2__1
            {
            pushFollow(FOLLOW_rule__Feedlinks__Group_2__0__Impl_in_rule__Feedlinks__Group_2__0747);
            rule__Feedlinks__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feedlinks__Group_2__1_in_rule__Feedlinks__Group_2__0750);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:412:1: rule__Feedlinks__Group_2__0__Impl : ( ', ' ) ;
    public final void rule__Feedlinks__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:416:1: ( ( ', ' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:417:1: ( ', ' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:417:1: ( ', ' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:418:1: ', '
            {
             before(grammarAccess.getFeedlinksAccess().getCommaSpaceKeyword_2_0()); 
            match(input,15,FOLLOW_15_in_rule__Feedlinks__Group_2__0__Impl778); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:431:1: rule__Feedlinks__Group_2__1 : rule__Feedlinks__Group_2__1__Impl ;
    public final void rule__Feedlinks__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:435:1: ( rule__Feedlinks__Group_2__1__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:436:2: rule__Feedlinks__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Feedlinks__Group_2__1__Impl_in_rule__Feedlinks__Group_2__1809);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:442:1: rule__Feedlinks__Group_2__1__Impl : ( ( rule__Feedlinks__PairsAssignment_2_1 ) ) ;
    public final void rule__Feedlinks__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:446:1: ( ( ( rule__Feedlinks__PairsAssignment_2_1 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:447:1: ( ( rule__Feedlinks__PairsAssignment_2_1 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:447:1: ( ( rule__Feedlinks__PairsAssignment_2_1 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:448:1: ( rule__Feedlinks__PairsAssignment_2_1 )
            {
             before(grammarAccess.getFeedlinksAccess().getPairsAssignment_2_1()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:449:1: ( rule__Feedlinks__PairsAssignment_2_1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:449:2: rule__Feedlinks__PairsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Feedlinks__PairsAssignment_2_1_in_rule__Feedlinks__Group_2__1__Impl836);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:463:1: rule__Pair__Group__0 : rule__Pair__Group__0__Impl rule__Pair__Group__1 ;
    public final void rule__Pair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:467:1: ( rule__Pair__Group__0__Impl rule__Pair__Group__1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:468:2: rule__Pair__Group__0__Impl rule__Pair__Group__1
            {
            pushFollow(FOLLOW_rule__Pair__Group__0__Impl_in_rule__Pair__Group__0870);
            rule__Pair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Pair__Group__1_in_rule__Pair__Group__0873);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:475:1: rule__Pair__Group__0__Impl : ( '{' ) ;
    public final void rule__Pair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:479:1: ( ( '{' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:480:1: ( '{' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:480:1: ( '{' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:481:1: '{'
            {
             before(grammarAccess.getPairAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Pair__Group__0__Impl901); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:494:1: rule__Pair__Group__1 : rule__Pair__Group__1__Impl rule__Pair__Group__2 ;
    public final void rule__Pair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:498:1: ( rule__Pair__Group__1__Impl rule__Pair__Group__2 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:499:2: rule__Pair__Group__1__Impl rule__Pair__Group__2
            {
            pushFollow(FOLLOW_rule__Pair__Group__1__Impl_in_rule__Pair__Group__1932);
            rule__Pair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Pair__Group__2_in_rule__Pair__Group__1935);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:506:1: rule__Pair__Group__1__Impl : ( ( rule__Pair__KeyAssignment_1 ) ) ;
    public final void rule__Pair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:510:1: ( ( ( rule__Pair__KeyAssignment_1 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:511:1: ( ( rule__Pair__KeyAssignment_1 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:511:1: ( ( rule__Pair__KeyAssignment_1 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:512:1: ( rule__Pair__KeyAssignment_1 )
            {
             before(grammarAccess.getPairAccess().getKeyAssignment_1()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:513:1: ( rule__Pair__KeyAssignment_1 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:513:2: rule__Pair__KeyAssignment_1
            {
            pushFollow(FOLLOW_rule__Pair__KeyAssignment_1_in_rule__Pair__Group__1__Impl962);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:523:1: rule__Pair__Group__2 : rule__Pair__Group__2__Impl rule__Pair__Group__3 ;
    public final void rule__Pair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:527:1: ( rule__Pair__Group__2__Impl rule__Pair__Group__3 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:528:2: rule__Pair__Group__2__Impl rule__Pair__Group__3
            {
            pushFollow(FOLLOW_rule__Pair__Group__2__Impl_in_rule__Pair__Group__2992);
            rule__Pair__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Pair__Group__3_in_rule__Pair__Group__2995);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:535:1: rule__Pair__Group__2__Impl : ( ( rule__Pair__ValueAssignment_2 ) ) ;
    public final void rule__Pair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:539:1: ( ( ( rule__Pair__ValueAssignment_2 ) ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:540:1: ( ( rule__Pair__ValueAssignment_2 ) )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:540:1: ( ( rule__Pair__ValueAssignment_2 ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:541:1: ( rule__Pair__ValueAssignment_2 )
            {
             before(grammarAccess.getPairAccess().getValueAssignment_2()); 
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:542:1: ( rule__Pair__ValueAssignment_2 )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:542:2: rule__Pair__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Pair__ValueAssignment_2_in_rule__Pair__Group__2__Impl1022);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:552:1: rule__Pair__Group__3 : rule__Pair__Group__3__Impl ;
    public final void rule__Pair__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:556:1: ( rule__Pair__Group__3__Impl )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:557:2: rule__Pair__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Pair__Group__3__Impl_in_rule__Pair__Group__31052);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:563:1: rule__Pair__Group__3__Impl : ( '}' ) ;
    public final void rule__Pair__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:567:1: ( ( '}' ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:568:1: ( '}' )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:568:1: ( '}' )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:569:1: '}'
            {
             before(grammarAccess.getPairAccess().getRightCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__Pair__Group__3__Impl1080); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:591:1: rule__Declaration__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Declaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:595:1: ( ( RULE_STRING ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:596:1: ( RULE_STRING )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:596:1: ( RULE_STRING )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:597:1: RULE_STRING
            {
             before(grammarAccess.getDeclarationAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Declaration__NameAssignment_11124); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:606:1: rule__Declaration__FeedlinksAssignment_3 : ( ruleFeedlinks ) ;
    public final void rule__Declaration__FeedlinksAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:610:1: ( ( ruleFeedlinks ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:611:1: ( ruleFeedlinks )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:611:1: ( ruleFeedlinks )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:612:1: ruleFeedlinks
            {
             before(grammarAccess.getDeclarationAccess().getFeedlinksFeedlinksParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleFeedlinks_in_rule__Declaration__FeedlinksAssignment_31155);
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


    // $ANTLR start "rule__Feedlinks__PairsAssignment_1"
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:621:1: rule__Feedlinks__PairsAssignment_1 : ( rulePair ) ;
    public final void rule__Feedlinks__PairsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:625:1: ( ( rulePair ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:626:1: ( rulePair )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:626:1: ( rulePair )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:627:1: rulePair
            {
             before(grammarAccess.getFeedlinksAccess().getPairsPairParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePair_in_rule__Feedlinks__PairsAssignment_11186);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:636:1: rule__Feedlinks__PairsAssignment_2_1 : ( rulePair ) ;
    public final void rule__Feedlinks__PairsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:640:1: ( ( rulePair ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:641:1: ( rulePair )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:641:1: ( rulePair )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:642:1: rulePair
            {
             before(grammarAccess.getFeedlinksAccess().getPairsPairParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_rulePair_in_rule__Feedlinks__PairsAssignment_2_11217);
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:651:1: rule__Pair__KeyAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Pair__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:655:1: ( ( RULE_STRING ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:656:1: ( RULE_STRING )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:656:1: ( RULE_STRING )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:657:1: RULE_STRING
            {
             before(grammarAccess.getPairAccess().getKeySTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Pair__KeyAssignment_11248); 
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
    // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:666:1: rule__Pair__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Pair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:670:1: ( ( RULE_STRING ) )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:671:1: ( RULE_STRING )
            {
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:671:1: ( RULE_STRING )
            // ../de.tu_bs.cs.isf.mbse.mbtimes.npl.ui/src-gen/de/tu_bs/cs/isf/mbse/mbtimes/ui/contentassist/antlr/internal/InternalNpl.g:672:1: RULE_STRING
            {
             before(grammarAccess.getPairAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Pair__ValueAssignment_21279); 
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
    public static final BitSet FOLLOW_ruleFeedlinks_in_entryRuleFeedlinks121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeedlinks128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feedlinks__Group__0_in_ruleFeedlinks154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePair_in_entryRulePair181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePair188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pair__Group__0_in_rulePair214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__0__Impl_in_rule__Declaration__Group__0248 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Declaration__Group__1_in_rule__Declaration__Group__0251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Declaration__Group__0__Impl279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__1__Impl_in_rule__Declaration__Group__1310 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__2_in_rule__Declaration__Group__1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__NameAssignment_1_in_rule__Declaration__Group__1__Impl340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__2__Impl_in_rule__Declaration__Group__2370 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__3_in_rule__Declaration__Group__2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Declaration__Group__2__Impl401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__3__Impl_in_rule__Declaration__Group__3432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__FeedlinksAssignment_3_in_rule__Declaration__Group__3__Impl459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feedlinks__Group__0__Impl_in_rule__Feedlinks__Group__0497 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Feedlinks__Group__1_in_rule__Feedlinks__Group__0500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Feedlinks__Group__0__Impl528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feedlinks__Group__1__Impl_in_rule__Feedlinks__Group__1559 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Feedlinks__Group__2_in_rule__Feedlinks__Group__1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feedlinks__PairsAssignment_1_in_rule__Feedlinks__Group__1__Impl589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feedlinks__Group__2__Impl_in_rule__Feedlinks__Group__2619 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Feedlinks__Group__3_in_rule__Feedlinks__Group__2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feedlinks__Group_2__0_in_rule__Feedlinks__Group__2__Impl649 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Feedlinks__Group__3__Impl_in_rule__Feedlinks__Group__3680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Feedlinks__Group__3__Impl708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feedlinks__Group_2__0__Impl_in_rule__Feedlinks__Group_2__0747 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Feedlinks__Group_2__1_in_rule__Feedlinks__Group_2__0750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Feedlinks__Group_2__0__Impl778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feedlinks__Group_2__1__Impl_in_rule__Feedlinks__Group_2__1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feedlinks__PairsAssignment_2_1_in_rule__Feedlinks__Group_2__1__Impl836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pair__Group__0__Impl_in_rule__Pair__Group__0870 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Pair__Group__1_in_rule__Pair__Group__0873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Pair__Group__0__Impl901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pair__Group__1__Impl_in_rule__Pair__Group__1932 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Pair__Group__2_in_rule__Pair__Group__1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pair__KeyAssignment_1_in_rule__Pair__Group__1__Impl962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pair__Group__2__Impl_in_rule__Pair__Group__2992 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Pair__Group__3_in_rule__Pair__Group__2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pair__ValueAssignment_2_in_rule__Pair__Group__2__Impl1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pair__Group__3__Impl_in_rule__Pair__Group__31052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Pair__Group__3__Impl1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Declaration__NameAssignment_11124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeedlinks_in_rule__Declaration__FeedlinksAssignment_31155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePair_in_rule__Feedlinks__PairsAssignment_11186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePair_in_rule__Feedlinks__PairsAssignment_2_11217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Pair__KeyAssignment_11248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Pair__ValueAssignment_21279 = new BitSet(new long[]{0x0000000000000002L});

}