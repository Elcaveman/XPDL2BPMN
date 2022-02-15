package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'START'", "'INTERMEDIATE'", "'END'", "'NONE'", "'MESSAGE'", "'EROR'", "'RULE'", "'TIMER'", "'XOR'", "'OR'", "'AND'", "'XpdlRoot'", "'{'", "'}'", "'diagramName'", "'participants'", "','", "'process'", "'messageflows'", "'Participant'", "'pools'", "'name'", "'Process'", "'workflowParticipants'", "'transitions'", "'activityset'", "'MessageFlow'", "'source'", "'target'", "'Pool'", "'lanes'", "'Lane'", "'ActivitySet'", "'activities'", "'participant'", "'Activity'", "'title'", "'BlockActivity'", "'Event'", "'time'", "'type'", "'Gateway'", "'rule'", "'SubFlow'", "'Transition'", "'condition'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
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
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
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


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleXpdlRoot"
    // InternalMyDsl.g:53:1: entryRuleXpdlRoot : ruleXpdlRoot EOF ;
    public final void entryRuleXpdlRoot() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleXpdlRoot EOF )
            // InternalMyDsl.g:55:1: ruleXpdlRoot EOF
            {
             before(grammarAccess.getXpdlRootRule()); 
            pushFollow(FOLLOW_1);
            ruleXpdlRoot();

            state._fsp--;

             after(grammarAccess.getXpdlRootRule()); 
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
    // $ANTLR end "entryRuleXpdlRoot"


    // $ANTLR start "ruleXpdlRoot"
    // InternalMyDsl.g:62:1: ruleXpdlRoot : ( ( rule__XpdlRoot__Group__0 ) ) ;
    public final void ruleXpdlRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__XpdlRoot__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__XpdlRoot__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__XpdlRoot__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__XpdlRoot__Group__0 )
            {
             before(grammarAccess.getXpdlRootAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__XpdlRoot__Group__0 )
            // InternalMyDsl.g:69:4: rule__XpdlRoot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXpdlRootAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXpdlRoot"


    // $ANTLR start "entryRuleActivity"
    // InternalMyDsl.g:78:1: entryRuleActivity : ruleActivity EOF ;
    public final void entryRuleActivity() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleActivity EOF )
            // InternalMyDsl.g:80:1: ruleActivity EOF
            {
             before(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_1);
            ruleActivity();

            state._fsp--;

             after(grammarAccess.getActivityRule()); 
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
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // InternalMyDsl.g:87:1: ruleActivity : ( ( rule__Activity__Alternatives ) ) ;
    public final void ruleActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Activity__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Activity__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Activity__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__Activity__Alternatives )
            {
             before(grammarAccess.getActivityAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__Activity__Alternatives )
            // InternalMyDsl.g:94:4: rule__Activity__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Activity__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivity"


    // $ANTLR start "entryRuleParticipant"
    // InternalMyDsl.g:103:1: entryRuleParticipant : ruleParticipant EOF ;
    public final void entryRuleParticipant() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleParticipant EOF )
            // InternalMyDsl.g:105:1: ruleParticipant EOF
            {
             before(grammarAccess.getParticipantRule()); 
            pushFollow(FOLLOW_1);
            ruleParticipant();

            state._fsp--;

             after(grammarAccess.getParticipantRule()); 
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
    // $ANTLR end "entryRuleParticipant"


    // $ANTLR start "ruleParticipant"
    // InternalMyDsl.g:112:1: ruleParticipant : ( ( rule__Participant__Group__0 ) ) ;
    public final void ruleParticipant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Participant__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Participant__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Participant__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Participant__Group__0 )
            {
             before(grammarAccess.getParticipantAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Participant__Group__0 )
            // InternalMyDsl.g:119:4: rule__Participant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Participant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParticipantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParticipant"


    // $ANTLR start "entryRuleProcess"
    // InternalMyDsl.g:128:1: entryRuleProcess : ruleProcess EOF ;
    public final void entryRuleProcess() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleProcess EOF )
            // InternalMyDsl.g:130:1: ruleProcess EOF
            {
             before(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            ruleProcess();

            state._fsp--;

             after(grammarAccess.getProcessRule()); 
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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalMyDsl.g:137:1: ruleProcess : ( ( rule__Process__Group__0 ) ) ;
    public final void ruleProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Process__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Process__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Process__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Process__Group__0 )
            {
             before(grammarAccess.getProcessAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Process__Group__0 )
            // InternalMyDsl.g:144:4: rule__Process__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleMessageFlow"
    // InternalMyDsl.g:153:1: entryRuleMessageFlow : ruleMessageFlow EOF ;
    public final void entryRuleMessageFlow() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleMessageFlow EOF )
            // InternalMyDsl.g:155:1: ruleMessageFlow EOF
            {
             before(grammarAccess.getMessageFlowRule()); 
            pushFollow(FOLLOW_1);
            ruleMessageFlow();

            state._fsp--;

             after(grammarAccess.getMessageFlowRule()); 
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
    // $ANTLR end "entryRuleMessageFlow"


    // $ANTLR start "ruleMessageFlow"
    // InternalMyDsl.g:162:1: ruleMessageFlow : ( ( rule__MessageFlow__Group__0 ) ) ;
    public final void ruleMessageFlow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__MessageFlow__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__MessageFlow__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__MessageFlow__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__MessageFlow__Group__0 )
            {
             before(grammarAccess.getMessageFlowAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__MessageFlow__Group__0 )
            // InternalMyDsl.g:169:4: rule__MessageFlow__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MessageFlow__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMessageFlowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessageFlow"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:178:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleEString EOF )
            // InternalMyDsl.g:180:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:187:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:193:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:194:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:194:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePool"
    // InternalMyDsl.g:203:1: entryRulePool : rulePool EOF ;
    public final void entryRulePool() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( rulePool EOF )
            // InternalMyDsl.g:205:1: rulePool EOF
            {
             before(grammarAccess.getPoolRule()); 
            pushFollow(FOLLOW_1);
            rulePool();

            state._fsp--;

             after(grammarAccess.getPoolRule()); 
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
    // $ANTLR end "entryRulePool"


    // $ANTLR start "rulePool"
    // InternalMyDsl.g:212:1: rulePool : ( ( rule__Pool__Group__0 ) ) ;
    public final void rulePool() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Pool__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Pool__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Pool__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Pool__Group__0 )
            {
             before(grammarAccess.getPoolAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Pool__Group__0 )
            // InternalMyDsl.g:219:4: rule__Pool__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pool__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPoolAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePool"


    // $ANTLR start "entryRuleLane"
    // InternalMyDsl.g:228:1: entryRuleLane : ruleLane EOF ;
    public final void entryRuleLane() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleLane EOF )
            // InternalMyDsl.g:230:1: ruleLane EOF
            {
             before(grammarAccess.getLaneRule()); 
            pushFollow(FOLLOW_1);
            ruleLane();

            state._fsp--;

             after(grammarAccess.getLaneRule()); 
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
    // $ANTLR end "entryRuleLane"


    // $ANTLR start "ruleLane"
    // InternalMyDsl.g:237:1: ruleLane : ( ( rule__Lane__Group__0 ) ) ;
    public final void ruleLane() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Lane__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Lane__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Lane__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Lane__Group__0 )
            {
             before(grammarAccess.getLaneAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Lane__Group__0 )
            // InternalMyDsl.g:244:4: rule__Lane__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Lane__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLaneAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLane"


    // $ANTLR start "entryRuleActivitySet"
    // InternalMyDsl.g:253:1: entryRuleActivitySet : ruleActivitySet EOF ;
    public final void entryRuleActivitySet() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleActivitySet EOF )
            // InternalMyDsl.g:255:1: ruleActivitySet EOF
            {
             before(grammarAccess.getActivitySetRule()); 
            pushFollow(FOLLOW_1);
            ruleActivitySet();

            state._fsp--;

             after(grammarAccess.getActivitySetRule()); 
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
    // $ANTLR end "entryRuleActivitySet"


    // $ANTLR start "ruleActivitySet"
    // InternalMyDsl.g:262:1: ruleActivitySet : ( ( rule__ActivitySet__Group__0 ) ) ;
    public final void ruleActivitySet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__ActivitySet__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__ActivitySet__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__ActivitySet__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__ActivitySet__Group__0 )
            {
             before(grammarAccess.getActivitySetAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__ActivitySet__Group__0 )
            // InternalMyDsl.g:269:4: rule__ActivitySet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ActivitySet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActivitySetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivitySet"


    // $ANTLR start "entryRuleActivity_Impl"
    // InternalMyDsl.g:278:1: entryRuleActivity_Impl : ruleActivity_Impl EOF ;
    public final void entryRuleActivity_Impl() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleActivity_Impl EOF )
            // InternalMyDsl.g:280:1: ruleActivity_Impl EOF
            {
             before(grammarAccess.getActivity_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleActivity_Impl();

            state._fsp--;

             after(grammarAccess.getActivity_ImplRule()); 
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
    // $ANTLR end "entryRuleActivity_Impl"


    // $ANTLR start "ruleActivity_Impl"
    // InternalMyDsl.g:287:1: ruleActivity_Impl : ( ( rule__Activity_Impl__Group__0 ) ) ;
    public final void ruleActivity_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__Activity_Impl__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__Activity_Impl__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__Activity_Impl__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__Activity_Impl__Group__0 )
            {
             before(grammarAccess.getActivity_ImplAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__Activity_Impl__Group__0 )
            // InternalMyDsl.g:294:4: rule__Activity_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Activity_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActivity_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivity_Impl"


    // $ANTLR start "entryRuleBlockActivity"
    // InternalMyDsl.g:303:1: entryRuleBlockActivity : ruleBlockActivity EOF ;
    public final void entryRuleBlockActivity() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleBlockActivity EOF )
            // InternalMyDsl.g:305:1: ruleBlockActivity EOF
            {
             before(grammarAccess.getBlockActivityRule()); 
            pushFollow(FOLLOW_1);
            ruleBlockActivity();

            state._fsp--;

             after(grammarAccess.getBlockActivityRule()); 
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
    // $ANTLR end "entryRuleBlockActivity"


    // $ANTLR start "ruleBlockActivity"
    // InternalMyDsl.g:312:1: ruleBlockActivity : ( ( rule__BlockActivity__Group__0 ) ) ;
    public final void ruleBlockActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__BlockActivity__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__BlockActivity__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__BlockActivity__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__BlockActivity__Group__0 )
            {
             before(grammarAccess.getBlockActivityAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__BlockActivity__Group__0 )
            // InternalMyDsl.g:319:4: rule__BlockActivity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BlockActivity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlockActivityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBlockActivity"


    // $ANTLR start "entryRuleEvent"
    // InternalMyDsl.g:328:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleEvent EOF )
            // InternalMyDsl.g:330:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalMyDsl.g:337:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__Event__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__Event__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__Event__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__Event__Group__0 )
            {
             before(grammarAccess.getEventAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__Event__Group__0 )
            // InternalMyDsl.g:344:4: rule__Event__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleGateway"
    // InternalMyDsl.g:353:1: entryRuleGateway : ruleGateway EOF ;
    public final void entryRuleGateway() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleGateway EOF )
            // InternalMyDsl.g:355:1: ruleGateway EOF
            {
             before(grammarAccess.getGatewayRule()); 
            pushFollow(FOLLOW_1);
            ruleGateway();

            state._fsp--;

             after(grammarAccess.getGatewayRule()); 
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
    // $ANTLR end "entryRuleGateway"


    // $ANTLR start "ruleGateway"
    // InternalMyDsl.g:362:1: ruleGateway : ( ( rule__Gateway__Group__0 ) ) ;
    public final void ruleGateway() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__Gateway__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__Gateway__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__Gateway__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__Gateway__Group__0 )
            {
             before(grammarAccess.getGatewayAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__Gateway__Group__0 )
            // InternalMyDsl.g:369:4: rule__Gateway__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Gateway__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGatewayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGateway"


    // $ANTLR start "entryRuleSubFlow"
    // InternalMyDsl.g:378:1: entryRuleSubFlow : ruleSubFlow EOF ;
    public final void entryRuleSubFlow() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleSubFlow EOF )
            // InternalMyDsl.g:380:1: ruleSubFlow EOF
            {
             before(grammarAccess.getSubFlowRule()); 
            pushFollow(FOLLOW_1);
            ruleSubFlow();

            state._fsp--;

             after(grammarAccess.getSubFlowRule()); 
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
    // $ANTLR end "entryRuleSubFlow"


    // $ANTLR start "ruleSubFlow"
    // InternalMyDsl.g:387:1: ruleSubFlow : ( ( rule__SubFlow__Group__0 ) ) ;
    public final void ruleSubFlow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__SubFlow__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__SubFlow__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__SubFlow__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__SubFlow__Group__0 )
            {
             before(grammarAccess.getSubFlowAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__SubFlow__Group__0 )
            // InternalMyDsl.g:394:4: rule__SubFlow__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubFlow__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubFlowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubFlow"


    // $ANTLR start "entryRuleTransition"
    // InternalMyDsl.g:403:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleTransition EOF )
            // InternalMyDsl.g:405:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalMyDsl.g:412:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__Transition__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__Transition__Group__0 )
            // InternalMyDsl.g:419:4: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "ruleEventTime"
    // InternalMyDsl.g:428:1: ruleEventTime : ( ( rule__EventTime__Alternatives ) ) ;
    public final void ruleEventTime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:432:1: ( ( ( rule__EventTime__Alternatives ) ) )
            // InternalMyDsl.g:433:2: ( ( rule__EventTime__Alternatives ) )
            {
            // InternalMyDsl.g:433:2: ( ( rule__EventTime__Alternatives ) )
            // InternalMyDsl.g:434:3: ( rule__EventTime__Alternatives )
            {
             before(grammarAccess.getEventTimeAccess().getAlternatives()); 
            // InternalMyDsl.g:435:3: ( rule__EventTime__Alternatives )
            // InternalMyDsl.g:435:4: rule__EventTime__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EventTime__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEventTimeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEventTime"


    // $ANTLR start "ruleEventType"
    // InternalMyDsl.g:444:1: ruleEventType : ( ( rule__EventType__Alternatives ) ) ;
    public final void ruleEventType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:448:1: ( ( ( rule__EventType__Alternatives ) ) )
            // InternalMyDsl.g:449:2: ( ( rule__EventType__Alternatives ) )
            {
            // InternalMyDsl.g:449:2: ( ( rule__EventType__Alternatives ) )
            // InternalMyDsl.g:450:3: ( rule__EventType__Alternatives )
            {
             before(grammarAccess.getEventTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:451:3: ( rule__EventType__Alternatives )
            // InternalMyDsl.g:451:4: rule__EventType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EventType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEventTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEventType"


    // $ANTLR start "ruleGateRule"
    // InternalMyDsl.g:460:1: ruleGateRule : ( ( rule__GateRule__Alternatives ) ) ;
    public final void ruleGateRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:464:1: ( ( ( rule__GateRule__Alternatives ) ) )
            // InternalMyDsl.g:465:2: ( ( rule__GateRule__Alternatives ) )
            {
            // InternalMyDsl.g:465:2: ( ( rule__GateRule__Alternatives ) )
            // InternalMyDsl.g:466:3: ( rule__GateRule__Alternatives )
            {
             before(grammarAccess.getGateRuleAccess().getAlternatives()); 
            // InternalMyDsl.g:467:3: ( rule__GateRule__Alternatives )
            // InternalMyDsl.g:467:4: rule__GateRule__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GateRule__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGateRuleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGateRule"


    // $ANTLR start "rule__Activity__Alternatives"
    // InternalMyDsl.g:475:1: rule__Activity__Alternatives : ( ( ruleActivity_Impl ) | ( ruleBlockActivity ) | ( ruleEvent ) | ( ruleGateway ) | ( ruleSubFlow ) );
    public final void rule__Activity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:479:1: ( ( ruleActivity_Impl ) | ( ruleBlockActivity ) | ( ruleEvent ) | ( ruleGateway ) | ( ruleSubFlow ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt1=1;
                }
                break;
            case 48:
                {
                alt1=2;
                }
                break;
            case 49:
                {
                alt1=3;
                }
                break;
            case 52:
                {
                alt1=4;
                }
                break;
            case 54:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:480:2: ( ruleActivity_Impl )
                    {
                    // InternalMyDsl.g:480:2: ( ruleActivity_Impl )
                    // InternalMyDsl.g:481:3: ruleActivity_Impl
                    {
                     before(grammarAccess.getActivityAccess().getActivity_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleActivity_Impl();

                    state._fsp--;

                     after(grammarAccess.getActivityAccess().getActivity_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:486:2: ( ruleBlockActivity )
                    {
                    // InternalMyDsl.g:486:2: ( ruleBlockActivity )
                    // InternalMyDsl.g:487:3: ruleBlockActivity
                    {
                     before(grammarAccess.getActivityAccess().getBlockActivityParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBlockActivity();

                    state._fsp--;

                     after(grammarAccess.getActivityAccess().getBlockActivityParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:492:2: ( ruleEvent )
                    {
                    // InternalMyDsl.g:492:2: ( ruleEvent )
                    // InternalMyDsl.g:493:3: ruleEvent
                    {
                     before(grammarAccess.getActivityAccess().getEventParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEvent();

                    state._fsp--;

                     after(grammarAccess.getActivityAccess().getEventParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:498:2: ( ruleGateway )
                    {
                    // InternalMyDsl.g:498:2: ( ruleGateway )
                    // InternalMyDsl.g:499:3: ruleGateway
                    {
                     before(grammarAccess.getActivityAccess().getGatewayParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleGateway();

                    state._fsp--;

                     after(grammarAccess.getActivityAccess().getGatewayParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:504:2: ( ruleSubFlow )
                    {
                    // InternalMyDsl.g:504:2: ( ruleSubFlow )
                    // InternalMyDsl.g:505:3: ruleSubFlow
                    {
                     before(grammarAccess.getActivityAccess().getSubFlowParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleSubFlow();

                    state._fsp--;

                     after(grammarAccess.getActivityAccess().getSubFlowParserRuleCall_4()); 

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
    // $ANTLR end "rule__Activity__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:514:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:518:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:519:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:519:2: ( RULE_STRING )
                    // InternalMyDsl.g:520:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:525:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:525:2: ( RULE_ID )
                    // InternalMyDsl.g:526:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EventTime__Alternatives"
    // InternalMyDsl.g:535:1: rule__EventTime__Alternatives : ( ( ( 'START' ) ) | ( ( 'INTERMEDIATE' ) ) | ( ( 'END' ) ) );
    public final void rule__EventTime__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:539:1: ( ( ( 'START' ) ) | ( ( 'INTERMEDIATE' ) ) | ( ( 'END' ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:540:2: ( ( 'START' ) )
                    {
                    // InternalMyDsl.g:540:2: ( ( 'START' ) )
                    // InternalMyDsl.g:541:3: ( 'START' )
                    {
                     before(grammarAccess.getEventTimeAccess().getSTARTEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:542:3: ( 'START' )
                    // InternalMyDsl.g:542:4: 'START'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getEventTimeAccess().getSTARTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:546:2: ( ( 'INTERMEDIATE' ) )
                    {
                    // InternalMyDsl.g:546:2: ( ( 'INTERMEDIATE' ) )
                    // InternalMyDsl.g:547:3: ( 'INTERMEDIATE' )
                    {
                     before(grammarAccess.getEventTimeAccess().getINTERMEDIATEEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:548:3: ( 'INTERMEDIATE' )
                    // InternalMyDsl.g:548:4: 'INTERMEDIATE'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getEventTimeAccess().getINTERMEDIATEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:552:2: ( ( 'END' ) )
                    {
                    // InternalMyDsl.g:552:2: ( ( 'END' ) )
                    // InternalMyDsl.g:553:3: ( 'END' )
                    {
                     before(grammarAccess.getEventTimeAccess().getENDEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:554:3: ( 'END' )
                    // InternalMyDsl.g:554:4: 'END'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getEventTimeAccess().getENDEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__EventTime__Alternatives"


    // $ANTLR start "rule__EventType__Alternatives"
    // InternalMyDsl.g:562:1: rule__EventType__Alternatives : ( ( ( 'NONE' ) ) | ( ( 'MESSAGE' ) ) | ( ( 'EROR' ) ) | ( ( 'RULE' ) ) | ( ( 'TIMER' ) ) );
    public final void rule__EventType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:1: ( ( ( 'NONE' ) ) | ( ( 'MESSAGE' ) ) | ( ( 'EROR' ) ) | ( ( 'RULE' ) ) | ( ( 'TIMER' ) ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            case 17:
                {
                alt4=4;
                }
                break;
            case 18:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:567:2: ( ( 'NONE' ) )
                    {
                    // InternalMyDsl.g:567:2: ( ( 'NONE' ) )
                    // InternalMyDsl.g:568:3: ( 'NONE' )
                    {
                     before(grammarAccess.getEventTypeAccess().getNONEEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:569:3: ( 'NONE' )
                    // InternalMyDsl.g:569:4: 'NONE'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getEventTypeAccess().getNONEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:573:2: ( ( 'MESSAGE' ) )
                    {
                    // InternalMyDsl.g:573:2: ( ( 'MESSAGE' ) )
                    // InternalMyDsl.g:574:3: ( 'MESSAGE' )
                    {
                     before(grammarAccess.getEventTypeAccess().getMESSAGEEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:575:3: ( 'MESSAGE' )
                    // InternalMyDsl.g:575:4: 'MESSAGE'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getEventTypeAccess().getMESSAGEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:579:2: ( ( 'EROR' ) )
                    {
                    // InternalMyDsl.g:579:2: ( ( 'EROR' ) )
                    // InternalMyDsl.g:580:3: ( 'EROR' )
                    {
                     before(grammarAccess.getEventTypeAccess().getEROREnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:581:3: ( 'EROR' )
                    // InternalMyDsl.g:581:4: 'EROR'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getEventTypeAccess().getEROREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:585:2: ( ( 'RULE' ) )
                    {
                    // InternalMyDsl.g:585:2: ( ( 'RULE' ) )
                    // InternalMyDsl.g:586:3: ( 'RULE' )
                    {
                     before(grammarAccess.getEventTypeAccess().getRULEEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:587:3: ( 'RULE' )
                    // InternalMyDsl.g:587:4: 'RULE'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getEventTypeAccess().getRULEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:591:2: ( ( 'TIMER' ) )
                    {
                    // InternalMyDsl.g:591:2: ( ( 'TIMER' ) )
                    // InternalMyDsl.g:592:3: ( 'TIMER' )
                    {
                     before(grammarAccess.getEventTypeAccess().getTIMEREnumLiteralDeclaration_4()); 
                    // InternalMyDsl.g:593:3: ( 'TIMER' )
                    // InternalMyDsl.g:593:4: 'TIMER'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getEventTypeAccess().getTIMEREnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__EventType__Alternatives"


    // $ANTLR start "rule__GateRule__Alternatives"
    // InternalMyDsl.g:601:1: rule__GateRule__Alternatives : ( ( ( 'XOR' ) ) | ( ( 'OR' ) ) | ( ( 'AND' ) ) );
    public final void rule__GateRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:605:1: ( ( ( 'XOR' ) ) | ( ( 'OR' ) ) | ( ( 'AND' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt5=1;
                }
                break;
            case 20:
                {
                alt5=2;
                }
                break;
            case 21:
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
                    // InternalMyDsl.g:606:2: ( ( 'XOR' ) )
                    {
                    // InternalMyDsl.g:606:2: ( ( 'XOR' ) )
                    // InternalMyDsl.g:607:3: ( 'XOR' )
                    {
                     before(grammarAccess.getGateRuleAccess().getXOREnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:608:3: ( 'XOR' )
                    // InternalMyDsl.g:608:4: 'XOR'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getGateRuleAccess().getXOREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:612:2: ( ( 'OR' ) )
                    {
                    // InternalMyDsl.g:612:2: ( ( 'OR' ) )
                    // InternalMyDsl.g:613:3: ( 'OR' )
                    {
                     before(grammarAccess.getGateRuleAccess().getOREnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:614:3: ( 'OR' )
                    // InternalMyDsl.g:614:4: 'OR'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getGateRuleAccess().getOREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:618:2: ( ( 'AND' ) )
                    {
                    // InternalMyDsl.g:618:2: ( ( 'AND' ) )
                    // InternalMyDsl.g:619:3: ( 'AND' )
                    {
                     before(grammarAccess.getGateRuleAccess().getANDEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:620:3: ( 'AND' )
                    // InternalMyDsl.g:620:4: 'AND'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getGateRuleAccess().getANDEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__GateRule__Alternatives"


    // $ANTLR start "rule__XpdlRoot__Group__0"
    // InternalMyDsl.g:628:1: rule__XpdlRoot__Group__0 : rule__XpdlRoot__Group__0__Impl rule__XpdlRoot__Group__1 ;
    public final void rule__XpdlRoot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:632:1: ( rule__XpdlRoot__Group__0__Impl rule__XpdlRoot__Group__1 )
            // InternalMyDsl.g:633:2: rule__XpdlRoot__Group__0__Impl rule__XpdlRoot__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__XpdlRoot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group__0"


    // $ANTLR start "rule__XpdlRoot__Group__0__Impl"
    // InternalMyDsl.g:640:1: rule__XpdlRoot__Group__0__Impl : ( () ) ;
    public final void rule__XpdlRoot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:644:1: ( ( () ) )
            // InternalMyDsl.g:645:1: ( () )
            {
            // InternalMyDsl.g:645:1: ( () )
            // InternalMyDsl.g:646:2: ()
            {
             before(grammarAccess.getXpdlRootAccess().getXpdlRootAction_0()); 
            // InternalMyDsl.g:647:2: ()
            // InternalMyDsl.g:647:3: 
            {
            }

             after(grammarAccess.getXpdlRootAccess().getXpdlRootAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group__0__Impl"


    // $ANTLR start "rule__XpdlRoot__Group__1"
    // InternalMyDsl.g:655:1: rule__XpdlRoot__Group__1 : rule__XpdlRoot__Group__1__Impl rule__XpdlRoot__Group__2 ;
    public final void rule__XpdlRoot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:659:1: ( rule__XpdlRoot__Group__1__Impl rule__XpdlRoot__Group__2 )
            // InternalMyDsl.g:660:2: rule__XpdlRoot__Group__1__Impl rule__XpdlRoot__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__XpdlRoot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group__1"


    // $ANTLR start "rule__XpdlRoot__Group__1__Impl"
    // InternalMyDsl.g:667:1: rule__XpdlRoot__Group__1__Impl : ( 'XpdlRoot' ) ;
    public final void rule__XpdlRoot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:671:1: ( ( 'XpdlRoot' ) )
            // InternalMyDsl.g:672:1: ( 'XpdlRoot' )
            {
            // InternalMyDsl.g:672:1: ( 'XpdlRoot' )
            // InternalMyDsl.g:673:2: 'XpdlRoot'
            {
             before(grammarAccess.getXpdlRootAccess().getXpdlRootKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getXpdlRootAccess().getXpdlRootKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group__1__Impl"


    // $ANTLR start "rule__XpdlRoot__Group__2"
    // InternalMyDsl.g:682:1: rule__XpdlRoot__Group__2 : rule__XpdlRoot__Group__2__Impl rule__XpdlRoot__Group__3 ;
    public final void rule__XpdlRoot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:686:1: ( rule__XpdlRoot__Group__2__Impl rule__XpdlRoot__Group__3 )
            // InternalMyDsl.g:687:2: rule__XpdlRoot__Group__2__Impl rule__XpdlRoot__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__XpdlRoot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group__2"


    // $ANTLR start "rule__XpdlRoot__Group__2__Impl"
    // InternalMyDsl.g:694:1: rule__XpdlRoot__Group__2__Impl : ( ( rule__XpdlRoot__IdAssignment_2 ) ) ;
    public final void rule__XpdlRoot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:698:1: ( ( ( rule__XpdlRoot__IdAssignment_2 ) ) )
            // InternalMyDsl.g:699:1: ( ( rule__XpdlRoot__IdAssignment_2 ) )
            {
            // InternalMyDsl.g:699:1: ( ( rule__XpdlRoot__IdAssignment_2 ) )
            // InternalMyDsl.g:700:2: ( rule__XpdlRoot__IdAssignment_2 )
            {
             before(grammarAccess.getXpdlRootAccess().getIdAssignment_2()); 
            // InternalMyDsl.g:701:2: ( rule__XpdlRoot__IdAssignment_2 )
            // InternalMyDsl.g:701:3: rule__XpdlRoot__IdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XpdlRoot__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXpdlRootAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group__2__Impl"


    // $ANTLR start "rule__XpdlRoot__Group__3"
    // InternalMyDsl.g:709:1: rule__XpdlRoot__Group__3 : rule__XpdlRoot__Group__3__Impl rule__XpdlRoot__Group__4 ;
    public final void rule__XpdlRoot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:713:1: ( rule__XpdlRoot__Group__3__Impl rule__XpdlRoot__Group__4 )
            // InternalMyDsl.g:714:2: rule__XpdlRoot__Group__3__Impl rule__XpdlRoot__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__XpdlRoot__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group__3"


    // $ANTLR start "rule__XpdlRoot__Group__3__Impl"
    // InternalMyDsl.g:721:1: rule__XpdlRoot__Group__3__Impl : ( '{' ) ;
    public final void rule__XpdlRoot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:725:1: ( ( '{' ) )
            // InternalMyDsl.g:726:1: ( '{' )
            {
            // InternalMyDsl.g:726:1: ( '{' )
            // InternalMyDsl.g:727:2: '{'
            {
             before(grammarAccess.getXpdlRootAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getXpdlRootAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group__3__Impl"


    // $ANTLR start "rule__XpdlRoot__Group__4"
    // InternalMyDsl.g:736:1: rule__XpdlRoot__Group__4 : rule__XpdlRoot__Group__4__Impl rule__XpdlRoot__Group__5 ;
    public final void rule__XpdlRoot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:740:1: ( rule__XpdlRoot__Group__4__Impl rule__XpdlRoot__Group__5 )
            // InternalMyDsl.g:741:2: rule__XpdlRoot__Group__4__Impl rule__XpdlRoot__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__XpdlRoot__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group__4"


    // $ANTLR start "rule__XpdlRoot__Group__4__Impl"
    // InternalMyDsl.g:748:1: rule__XpdlRoot__Group__4__Impl : ( ( rule__XpdlRoot__Group_4__0 )? ) ;
    public final void rule__XpdlRoot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:752:1: ( ( ( rule__XpdlRoot__Group_4__0 )? ) )
            // InternalMyDsl.g:753:1: ( ( rule__XpdlRoot__Group_4__0 )? )
            {
            // InternalMyDsl.g:753:1: ( ( rule__XpdlRoot__Group_4__0 )? )
            // InternalMyDsl.g:754:2: ( rule__XpdlRoot__Group_4__0 )?
            {
             before(grammarAccess.getXpdlRootAccess().getGroup_4()); 
            // InternalMyDsl.g:755:2: ( rule__XpdlRoot__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:755:3: rule__XpdlRoot__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XpdlRoot__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXpdlRootAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group__4__Impl"


    // $ANTLR start "rule__XpdlRoot__Group__5"
    // InternalMyDsl.g:763:1: rule__XpdlRoot__Group__5 : rule__XpdlRoot__Group__5__Impl rule__XpdlRoot__Group__6 ;
    public final void rule__XpdlRoot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:767:1: ( rule__XpdlRoot__Group__5__Impl rule__XpdlRoot__Group__6 )
            // InternalMyDsl.g:768:2: rule__XpdlRoot__Group__5__Impl rule__XpdlRoot__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__XpdlRoot__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group__5"


    // $ANTLR start "rule__XpdlRoot__Group__5__Impl"
    // InternalMyDsl.g:775:1: rule__XpdlRoot__Group__5__Impl : ( ( rule__XpdlRoot__Group_5__0 )? ) ;
    public final void rule__XpdlRoot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:779:1: ( ( ( rule__XpdlRoot__Group_5__0 )? ) )
            // InternalMyDsl.g:780:1: ( ( rule__XpdlRoot__Group_5__0 )? )
            {
            // InternalMyDsl.g:780:1: ( ( rule__XpdlRoot__Group_5__0 )? )
            // InternalMyDsl.g:781:2: ( rule__XpdlRoot__Group_5__0 )?
            {
             before(grammarAccess.getXpdlRootAccess().getGroup_5()); 
            // InternalMyDsl.g:782:2: ( rule__XpdlRoot__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:782:3: rule__XpdlRoot__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XpdlRoot__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXpdlRootAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group__5__Impl"


    // $ANTLR start "rule__XpdlRoot__Group__6"
    // InternalMyDsl.g:790:1: rule__XpdlRoot__Group__6 : rule__XpdlRoot__Group__6__Impl rule__XpdlRoot__Group__7 ;
    public final void rule__XpdlRoot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:794:1: ( rule__XpdlRoot__Group__6__Impl rule__XpdlRoot__Group__7 )
            // InternalMyDsl.g:795:2: rule__XpdlRoot__Group__6__Impl rule__XpdlRoot__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__XpdlRoot__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group__6"


    // $ANTLR start "rule__XpdlRoot__Group__6__Impl"
    // InternalMyDsl.g:802:1: rule__XpdlRoot__Group__6__Impl : ( ( rule__XpdlRoot__Group_6__0 )? ) ;
    public final void rule__XpdlRoot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:806:1: ( ( ( rule__XpdlRoot__Group_6__0 )? ) )
            // InternalMyDsl.g:807:1: ( ( rule__XpdlRoot__Group_6__0 )? )
            {
            // InternalMyDsl.g:807:1: ( ( rule__XpdlRoot__Group_6__0 )? )
            // InternalMyDsl.g:808:2: ( rule__XpdlRoot__Group_6__0 )?
            {
             before(grammarAccess.getXpdlRootAccess().getGroup_6()); 
            // InternalMyDsl.g:809:2: ( rule__XpdlRoot__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:809:3: rule__XpdlRoot__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XpdlRoot__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXpdlRootAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group__6__Impl"


    // $ANTLR start "rule__XpdlRoot__Group__7"
    // InternalMyDsl.g:817:1: rule__XpdlRoot__Group__7 : rule__XpdlRoot__Group__7__Impl rule__XpdlRoot__Group__8 ;
    public final void rule__XpdlRoot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:821:1: ( rule__XpdlRoot__Group__7__Impl rule__XpdlRoot__Group__8 )
            // InternalMyDsl.g:822:2: rule__XpdlRoot__Group__7__Impl rule__XpdlRoot__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__XpdlRoot__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group__7"


    // $ANTLR start "rule__XpdlRoot__Group__7__Impl"
    // InternalMyDsl.g:829:1: rule__XpdlRoot__Group__7__Impl : ( ( rule__XpdlRoot__Group_7__0 )? ) ;
    public final void rule__XpdlRoot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:833:1: ( ( ( rule__XpdlRoot__Group_7__0 )? ) )
            // InternalMyDsl.g:834:1: ( ( rule__XpdlRoot__Group_7__0 )? )
            {
            // InternalMyDsl.g:834:1: ( ( rule__XpdlRoot__Group_7__0 )? )
            // InternalMyDsl.g:835:2: ( rule__XpdlRoot__Group_7__0 )?
            {
             before(grammarAccess.getXpdlRootAccess().getGroup_7()); 
            // InternalMyDsl.g:836:2: ( rule__XpdlRoot__Group_7__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:836:3: rule__XpdlRoot__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XpdlRoot__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXpdlRootAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group__7__Impl"


    // $ANTLR start "rule__XpdlRoot__Group__8"
    // InternalMyDsl.g:844:1: rule__XpdlRoot__Group__8 : rule__XpdlRoot__Group__8__Impl ;
    public final void rule__XpdlRoot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:848:1: ( rule__XpdlRoot__Group__8__Impl )
            // InternalMyDsl.g:849:2: rule__XpdlRoot__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group__8"


    // $ANTLR start "rule__XpdlRoot__Group__8__Impl"
    // InternalMyDsl.g:855:1: rule__XpdlRoot__Group__8__Impl : ( '}' ) ;
    public final void rule__XpdlRoot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:859:1: ( ( '}' ) )
            // InternalMyDsl.g:860:1: ( '}' )
            {
            // InternalMyDsl.g:860:1: ( '}' )
            // InternalMyDsl.g:861:2: '}'
            {
             before(grammarAccess.getXpdlRootAccess().getRightCurlyBracketKeyword_8()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getXpdlRootAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group__8__Impl"


    // $ANTLR start "rule__XpdlRoot__Group_4__0"
    // InternalMyDsl.g:871:1: rule__XpdlRoot__Group_4__0 : rule__XpdlRoot__Group_4__0__Impl rule__XpdlRoot__Group_4__1 ;
    public final void rule__XpdlRoot__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:875:1: ( rule__XpdlRoot__Group_4__0__Impl rule__XpdlRoot__Group_4__1 )
            // InternalMyDsl.g:876:2: rule__XpdlRoot__Group_4__0__Impl rule__XpdlRoot__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__XpdlRoot__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_4__0"


    // $ANTLR start "rule__XpdlRoot__Group_4__0__Impl"
    // InternalMyDsl.g:883:1: rule__XpdlRoot__Group_4__0__Impl : ( 'diagramName' ) ;
    public final void rule__XpdlRoot__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:887:1: ( ( 'diagramName' ) )
            // InternalMyDsl.g:888:1: ( 'diagramName' )
            {
            // InternalMyDsl.g:888:1: ( 'diagramName' )
            // InternalMyDsl.g:889:2: 'diagramName'
            {
             before(grammarAccess.getXpdlRootAccess().getDiagramNameKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getXpdlRootAccess().getDiagramNameKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_4__0__Impl"


    // $ANTLR start "rule__XpdlRoot__Group_4__1"
    // InternalMyDsl.g:898:1: rule__XpdlRoot__Group_4__1 : rule__XpdlRoot__Group_4__1__Impl ;
    public final void rule__XpdlRoot__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:902:1: ( rule__XpdlRoot__Group_4__1__Impl )
            // InternalMyDsl.g:903:2: rule__XpdlRoot__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_4__1"


    // $ANTLR start "rule__XpdlRoot__Group_4__1__Impl"
    // InternalMyDsl.g:909:1: rule__XpdlRoot__Group_4__1__Impl : ( ( rule__XpdlRoot__DiagramNameAssignment_4_1 ) ) ;
    public final void rule__XpdlRoot__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:913:1: ( ( ( rule__XpdlRoot__DiagramNameAssignment_4_1 ) ) )
            // InternalMyDsl.g:914:1: ( ( rule__XpdlRoot__DiagramNameAssignment_4_1 ) )
            {
            // InternalMyDsl.g:914:1: ( ( rule__XpdlRoot__DiagramNameAssignment_4_1 ) )
            // InternalMyDsl.g:915:2: ( rule__XpdlRoot__DiagramNameAssignment_4_1 )
            {
             before(grammarAccess.getXpdlRootAccess().getDiagramNameAssignment_4_1()); 
            // InternalMyDsl.g:916:2: ( rule__XpdlRoot__DiagramNameAssignment_4_1 )
            // InternalMyDsl.g:916:3: rule__XpdlRoot__DiagramNameAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__XpdlRoot__DiagramNameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getXpdlRootAccess().getDiagramNameAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_4__1__Impl"


    // $ANTLR start "rule__XpdlRoot__Group_5__0"
    // InternalMyDsl.g:925:1: rule__XpdlRoot__Group_5__0 : rule__XpdlRoot__Group_5__0__Impl rule__XpdlRoot__Group_5__1 ;
    public final void rule__XpdlRoot__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:929:1: ( rule__XpdlRoot__Group_5__0__Impl rule__XpdlRoot__Group_5__1 )
            // InternalMyDsl.g:930:2: rule__XpdlRoot__Group_5__0__Impl rule__XpdlRoot__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__XpdlRoot__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_5__0"


    // $ANTLR start "rule__XpdlRoot__Group_5__0__Impl"
    // InternalMyDsl.g:937:1: rule__XpdlRoot__Group_5__0__Impl : ( 'participants' ) ;
    public final void rule__XpdlRoot__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:941:1: ( ( 'participants' ) )
            // InternalMyDsl.g:942:1: ( 'participants' )
            {
            // InternalMyDsl.g:942:1: ( 'participants' )
            // InternalMyDsl.g:943:2: 'participants'
            {
             before(grammarAccess.getXpdlRootAccess().getParticipantsKeyword_5_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getXpdlRootAccess().getParticipantsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_5__0__Impl"


    // $ANTLR start "rule__XpdlRoot__Group_5__1"
    // InternalMyDsl.g:952:1: rule__XpdlRoot__Group_5__1 : rule__XpdlRoot__Group_5__1__Impl rule__XpdlRoot__Group_5__2 ;
    public final void rule__XpdlRoot__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:956:1: ( rule__XpdlRoot__Group_5__1__Impl rule__XpdlRoot__Group_5__2 )
            // InternalMyDsl.g:957:2: rule__XpdlRoot__Group_5__1__Impl rule__XpdlRoot__Group_5__2
            {
            pushFollow(FOLLOW_7);
            rule__XpdlRoot__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_5__1"


    // $ANTLR start "rule__XpdlRoot__Group_5__1__Impl"
    // InternalMyDsl.g:964:1: rule__XpdlRoot__Group_5__1__Impl : ( '{' ) ;
    public final void rule__XpdlRoot__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:968:1: ( ( '{' ) )
            // InternalMyDsl.g:969:1: ( '{' )
            {
            // InternalMyDsl.g:969:1: ( '{' )
            // InternalMyDsl.g:970:2: '{'
            {
             before(grammarAccess.getXpdlRootAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getXpdlRootAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_5__1__Impl"


    // $ANTLR start "rule__XpdlRoot__Group_5__2"
    // InternalMyDsl.g:979:1: rule__XpdlRoot__Group_5__2 : rule__XpdlRoot__Group_5__2__Impl rule__XpdlRoot__Group_5__3 ;
    public final void rule__XpdlRoot__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:983:1: ( rule__XpdlRoot__Group_5__2__Impl rule__XpdlRoot__Group_5__3 )
            // InternalMyDsl.g:984:2: rule__XpdlRoot__Group_5__2__Impl rule__XpdlRoot__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__XpdlRoot__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_5__2"


    // $ANTLR start "rule__XpdlRoot__Group_5__2__Impl"
    // InternalMyDsl.g:991:1: rule__XpdlRoot__Group_5__2__Impl : ( ( rule__XpdlRoot__ParticipantsAssignment_5_2 ) ) ;
    public final void rule__XpdlRoot__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:995:1: ( ( ( rule__XpdlRoot__ParticipantsAssignment_5_2 ) ) )
            // InternalMyDsl.g:996:1: ( ( rule__XpdlRoot__ParticipantsAssignment_5_2 ) )
            {
            // InternalMyDsl.g:996:1: ( ( rule__XpdlRoot__ParticipantsAssignment_5_2 ) )
            // InternalMyDsl.g:997:2: ( rule__XpdlRoot__ParticipantsAssignment_5_2 )
            {
             before(grammarAccess.getXpdlRootAccess().getParticipantsAssignment_5_2()); 
            // InternalMyDsl.g:998:2: ( rule__XpdlRoot__ParticipantsAssignment_5_2 )
            // InternalMyDsl.g:998:3: rule__XpdlRoot__ParticipantsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__XpdlRoot__ParticipantsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getXpdlRootAccess().getParticipantsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_5__2__Impl"


    // $ANTLR start "rule__XpdlRoot__Group_5__3"
    // InternalMyDsl.g:1006:1: rule__XpdlRoot__Group_5__3 : rule__XpdlRoot__Group_5__3__Impl rule__XpdlRoot__Group_5__4 ;
    public final void rule__XpdlRoot__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1010:1: ( rule__XpdlRoot__Group_5__3__Impl rule__XpdlRoot__Group_5__4 )
            // InternalMyDsl.g:1011:2: rule__XpdlRoot__Group_5__3__Impl rule__XpdlRoot__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__XpdlRoot__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_5__3"


    // $ANTLR start "rule__XpdlRoot__Group_5__3__Impl"
    // InternalMyDsl.g:1018:1: rule__XpdlRoot__Group_5__3__Impl : ( ( rule__XpdlRoot__Group_5_3__0 )* ) ;
    public final void rule__XpdlRoot__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1022:1: ( ( ( rule__XpdlRoot__Group_5_3__0 )* ) )
            // InternalMyDsl.g:1023:1: ( ( rule__XpdlRoot__Group_5_3__0 )* )
            {
            // InternalMyDsl.g:1023:1: ( ( rule__XpdlRoot__Group_5_3__0 )* )
            // InternalMyDsl.g:1024:2: ( rule__XpdlRoot__Group_5_3__0 )*
            {
             before(grammarAccess.getXpdlRootAccess().getGroup_5_3()); 
            // InternalMyDsl.g:1025:2: ( rule__XpdlRoot__Group_5_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==27) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1025:3: rule__XpdlRoot__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__XpdlRoot__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getXpdlRootAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_5__3__Impl"


    // $ANTLR start "rule__XpdlRoot__Group_5__4"
    // InternalMyDsl.g:1033:1: rule__XpdlRoot__Group_5__4 : rule__XpdlRoot__Group_5__4__Impl ;
    public final void rule__XpdlRoot__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1037:1: ( rule__XpdlRoot__Group_5__4__Impl )
            // InternalMyDsl.g:1038:2: rule__XpdlRoot__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_5__4"


    // $ANTLR start "rule__XpdlRoot__Group_5__4__Impl"
    // InternalMyDsl.g:1044:1: rule__XpdlRoot__Group_5__4__Impl : ( '}' ) ;
    public final void rule__XpdlRoot__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1048:1: ( ( '}' ) )
            // InternalMyDsl.g:1049:1: ( '}' )
            {
            // InternalMyDsl.g:1049:1: ( '}' )
            // InternalMyDsl.g:1050:2: '}'
            {
             before(grammarAccess.getXpdlRootAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getXpdlRootAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_5__4__Impl"


    // $ANTLR start "rule__XpdlRoot__Group_5_3__0"
    // InternalMyDsl.g:1060:1: rule__XpdlRoot__Group_5_3__0 : rule__XpdlRoot__Group_5_3__0__Impl rule__XpdlRoot__Group_5_3__1 ;
    public final void rule__XpdlRoot__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1064:1: ( rule__XpdlRoot__Group_5_3__0__Impl rule__XpdlRoot__Group_5_3__1 )
            // InternalMyDsl.g:1065:2: rule__XpdlRoot__Group_5_3__0__Impl rule__XpdlRoot__Group_5_3__1
            {
            pushFollow(FOLLOW_7);
            rule__XpdlRoot__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_5_3__0"


    // $ANTLR start "rule__XpdlRoot__Group_5_3__0__Impl"
    // InternalMyDsl.g:1072:1: rule__XpdlRoot__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__XpdlRoot__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1076:1: ( ( ',' ) )
            // InternalMyDsl.g:1077:1: ( ',' )
            {
            // InternalMyDsl.g:1077:1: ( ',' )
            // InternalMyDsl.g:1078:2: ','
            {
             before(grammarAccess.getXpdlRootAccess().getCommaKeyword_5_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getXpdlRootAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_5_3__0__Impl"


    // $ANTLR start "rule__XpdlRoot__Group_5_3__1"
    // InternalMyDsl.g:1087:1: rule__XpdlRoot__Group_5_3__1 : rule__XpdlRoot__Group_5_3__1__Impl ;
    public final void rule__XpdlRoot__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1091:1: ( rule__XpdlRoot__Group_5_3__1__Impl )
            // InternalMyDsl.g:1092:2: rule__XpdlRoot__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_5_3__1"


    // $ANTLR start "rule__XpdlRoot__Group_5_3__1__Impl"
    // InternalMyDsl.g:1098:1: rule__XpdlRoot__Group_5_3__1__Impl : ( ( rule__XpdlRoot__ParticipantsAssignment_5_3_1 ) ) ;
    public final void rule__XpdlRoot__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1102:1: ( ( ( rule__XpdlRoot__ParticipantsAssignment_5_3_1 ) ) )
            // InternalMyDsl.g:1103:1: ( ( rule__XpdlRoot__ParticipantsAssignment_5_3_1 ) )
            {
            // InternalMyDsl.g:1103:1: ( ( rule__XpdlRoot__ParticipantsAssignment_5_3_1 ) )
            // InternalMyDsl.g:1104:2: ( rule__XpdlRoot__ParticipantsAssignment_5_3_1 )
            {
             before(grammarAccess.getXpdlRootAccess().getParticipantsAssignment_5_3_1()); 
            // InternalMyDsl.g:1105:2: ( rule__XpdlRoot__ParticipantsAssignment_5_3_1 )
            // InternalMyDsl.g:1105:3: rule__XpdlRoot__ParticipantsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__XpdlRoot__ParticipantsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getXpdlRootAccess().getParticipantsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_5_3__1__Impl"


    // $ANTLR start "rule__XpdlRoot__Group_6__0"
    // InternalMyDsl.g:1114:1: rule__XpdlRoot__Group_6__0 : rule__XpdlRoot__Group_6__0__Impl rule__XpdlRoot__Group_6__1 ;
    public final void rule__XpdlRoot__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1118:1: ( rule__XpdlRoot__Group_6__0__Impl rule__XpdlRoot__Group_6__1 )
            // InternalMyDsl.g:1119:2: rule__XpdlRoot__Group_6__0__Impl rule__XpdlRoot__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__XpdlRoot__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_6__0"


    // $ANTLR start "rule__XpdlRoot__Group_6__0__Impl"
    // InternalMyDsl.g:1126:1: rule__XpdlRoot__Group_6__0__Impl : ( 'process' ) ;
    public final void rule__XpdlRoot__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1130:1: ( ( 'process' ) )
            // InternalMyDsl.g:1131:1: ( 'process' )
            {
            // InternalMyDsl.g:1131:1: ( 'process' )
            // InternalMyDsl.g:1132:2: 'process'
            {
             before(grammarAccess.getXpdlRootAccess().getProcessKeyword_6_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getXpdlRootAccess().getProcessKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_6__0__Impl"


    // $ANTLR start "rule__XpdlRoot__Group_6__1"
    // InternalMyDsl.g:1141:1: rule__XpdlRoot__Group_6__1 : rule__XpdlRoot__Group_6__1__Impl rule__XpdlRoot__Group_6__2 ;
    public final void rule__XpdlRoot__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1145:1: ( rule__XpdlRoot__Group_6__1__Impl rule__XpdlRoot__Group_6__2 )
            // InternalMyDsl.g:1146:2: rule__XpdlRoot__Group_6__1__Impl rule__XpdlRoot__Group_6__2
            {
            pushFollow(FOLLOW_10);
            rule__XpdlRoot__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_6__1"


    // $ANTLR start "rule__XpdlRoot__Group_6__1__Impl"
    // InternalMyDsl.g:1153:1: rule__XpdlRoot__Group_6__1__Impl : ( '{' ) ;
    public final void rule__XpdlRoot__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1157:1: ( ( '{' ) )
            // InternalMyDsl.g:1158:1: ( '{' )
            {
            // InternalMyDsl.g:1158:1: ( '{' )
            // InternalMyDsl.g:1159:2: '{'
            {
             before(grammarAccess.getXpdlRootAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getXpdlRootAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_6__1__Impl"


    // $ANTLR start "rule__XpdlRoot__Group_6__2"
    // InternalMyDsl.g:1168:1: rule__XpdlRoot__Group_6__2 : rule__XpdlRoot__Group_6__2__Impl rule__XpdlRoot__Group_6__3 ;
    public final void rule__XpdlRoot__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1172:1: ( rule__XpdlRoot__Group_6__2__Impl rule__XpdlRoot__Group_6__3 )
            // InternalMyDsl.g:1173:2: rule__XpdlRoot__Group_6__2__Impl rule__XpdlRoot__Group_6__3
            {
            pushFollow(FOLLOW_8);
            rule__XpdlRoot__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_6__2"


    // $ANTLR start "rule__XpdlRoot__Group_6__2__Impl"
    // InternalMyDsl.g:1180:1: rule__XpdlRoot__Group_6__2__Impl : ( ( rule__XpdlRoot__ProcessAssignment_6_2 ) ) ;
    public final void rule__XpdlRoot__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1184:1: ( ( ( rule__XpdlRoot__ProcessAssignment_6_2 ) ) )
            // InternalMyDsl.g:1185:1: ( ( rule__XpdlRoot__ProcessAssignment_6_2 ) )
            {
            // InternalMyDsl.g:1185:1: ( ( rule__XpdlRoot__ProcessAssignment_6_2 ) )
            // InternalMyDsl.g:1186:2: ( rule__XpdlRoot__ProcessAssignment_6_2 )
            {
             before(grammarAccess.getXpdlRootAccess().getProcessAssignment_6_2()); 
            // InternalMyDsl.g:1187:2: ( rule__XpdlRoot__ProcessAssignment_6_2 )
            // InternalMyDsl.g:1187:3: rule__XpdlRoot__ProcessAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__XpdlRoot__ProcessAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getXpdlRootAccess().getProcessAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_6__2__Impl"


    // $ANTLR start "rule__XpdlRoot__Group_6__3"
    // InternalMyDsl.g:1195:1: rule__XpdlRoot__Group_6__3 : rule__XpdlRoot__Group_6__3__Impl rule__XpdlRoot__Group_6__4 ;
    public final void rule__XpdlRoot__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1199:1: ( rule__XpdlRoot__Group_6__3__Impl rule__XpdlRoot__Group_6__4 )
            // InternalMyDsl.g:1200:2: rule__XpdlRoot__Group_6__3__Impl rule__XpdlRoot__Group_6__4
            {
            pushFollow(FOLLOW_8);
            rule__XpdlRoot__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_6__3"


    // $ANTLR start "rule__XpdlRoot__Group_6__3__Impl"
    // InternalMyDsl.g:1207:1: rule__XpdlRoot__Group_6__3__Impl : ( ( rule__XpdlRoot__Group_6_3__0 )* ) ;
    public final void rule__XpdlRoot__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1211:1: ( ( ( rule__XpdlRoot__Group_6_3__0 )* ) )
            // InternalMyDsl.g:1212:1: ( ( rule__XpdlRoot__Group_6_3__0 )* )
            {
            // InternalMyDsl.g:1212:1: ( ( rule__XpdlRoot__Group_6_3__0 )* )
            // InternalMyDsl.g:1213:2: ( rule__XpdlRoot__Group_6_3__0 )*
            {
             before(grammarAccess.getXpdlRootAccess().getGroup_6_3()); 
            // InternalMyDsl.g:1214:2: ( rule__XpdlRoot__Group_6_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1214:3: rule__XpdlRoot__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__XpdlRoot__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getXpdlRootAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_6__3__Impl"


    // $ANTLR start "rule__XpdlRoot__Group_6__4"
    // InternalMyDsl.g:1222:1: rule__XpdlRoot__Group_6__4 : rule__XpdlRoot__Group_6__4__Impl ;
    public final void rule__XpdlRoot__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1226:1: ( rule__XpdlRoot__Group_6__4__Impl )
            // InternalMyDsl.g:1227:2: rule__XpdlRoot__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_6__4"


    // $ANTLR start "rule__XpdlRoot__Group_6__4__Impl"
    // InternalMyDsl.g:1233:1: rule__XpdlRoot__Group_6__4__Impl : ( '}' ) ;
    public final void rule__XpdlRoot__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1237:1: ( ( '}' ) )
            // InternalMyDsl.g:1238:1: ( '}' )
            {
            // InternalMyDsl.g:1238:1: ( '}' )
            // InternalMyDsl.g:1239:2: '}'
            {
             before(grammarAccess.getXpdlRootAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getXpdlRootAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_6__4__Impl"


    // $ANTLR start "rule__XpdlRoot__Group_6_3__0"
    // InternalMyDsl.g:1249:1: rule__XpdlRoot__Group_6_3__0 : rule__XpdlRoot__Group_6_3__0__Impl rule__XpdlRoot__Group_6_3__1 ;
    public final void rule__XpdlRoot__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1253:1: ( rule__XpdlRoot__Group_6_3__0__Impl rule__XpdlRoot__Group_6_3__1 )
            // InternalMyDsl.g:1254:2: rule__XpdlRoot__Group_6_3__0__Impl rule__XpdlRoot__Group_6_3__1
            {
            pushFollow(FOLLOW_10);
            rule__XpdlRoot__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_6_3__0"


    // $ANTLR start "rule__XpdlRoot__Group_6_3__0__Impl"
    // InternalMyDsl.g:1261:1: rule__XpdlRoot__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__XpdlRoot__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1265:1: ( ( ',' ) )
            // InternalMyDsl.g:1266:1: ( ',' )
            {
            // InternalMyDsl.g:1266:1: ( ',' )
            // InternalMyDsl.g:1267:2: ','
            {
             before(grammarAccess.getXpdlRootAccess().getCommaKeyword_6_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getXpdlRootAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_6_3__0__Impl"


    // $ANTLR start "rule__XpdlRoot__Group_6_3__1"
    // InternalMyDsl.g:1276:1: rule__XpdlRoot__Group_6_3__1 : rule__XpdlRoot__Group_6_3__1__Impl ;
    public final void rule__XpdlRoot__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1280:1: ( rule__XpdlRoot__Group_6_3__1__Impl )
            // InternalMyDsl.g:1281:2: rule__XpdlRoot__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_6_3__1"


    // $ANTLR start "rule__XpdlRoot__Group_6_3__1__Impl"
    // InternalMyDsl.g:1287:1: rule__XpdlRoot__Group_6_3__1__Impl : ( ( rule__XpdlRoot__ProcessAssignment_6_3_1 ) ) ;
    public final void rule__XpdlRoot__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1291:1: ( ( ( rule__XpdlRoot__ProcessAssignment_6_3_1 ) ) )
            // InternalMyDsl.g:1292:1: ( ( rule__XpdlRoot__ProcessAssignment_6_3_1 ) )
            {
            // InternalMyDsl.g:1292:1: ( ( rule__XpdlRoot__ProcessAssignment_6_3_1 ) )
            // InternalMyDsl.g:1293:2: ( rule__XpdlRoot__ProcessAssignment_6_3_1 )
            {
             before(grammarAccess.getXpdlRootAccess().getProcessAssignment_6_3_1()); 
            // InternalMyDsl.g:1294:2: ( rule__XpdlRoot__ProcessAssignment_6_3_1 )
            // InternalMyDsl.g:1294:3: rule__XpdlRoot__ProcessAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__XpdlRoot__ProcessAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getXpdlRootAccess().getProcessAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_6_3__1__Impl"


    // $ANTLR start "rule__XpdlRoot__Group_7__0"
    // InternalMyDsl.g:1303:1: rule__XpdlRoot__Group_7__0 : rule__XpdlRoot__Group_7__0__Impl rule__XpdlRoot__Group_7__1 ;
    public final void rule__XpdlRoot__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1307:1: ( rule__XpdlRoot__Group_7__0__Impl rule__XpdlRoot__Group_7__1 )
            // InternalMyDsl.g:1308:2: rule__XpdlRoot__Group_7__0__Impl rule__XpdlRoot__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__XpdlRoot__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_7__0"


    // $ANTLR start "rule__XpdlRoot__Group_7__0__Impl"
    // InternalMyDsl.g:1315:1: rule__XpdlRoot__Group_7__0__Impl : ( 'messageflows' ) ;
    public final void rule__XpdlRoot__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1319:1: ( ( 'messageflows' ) )
            // InternalMyDsl.g:1320:1: ( 'messageflows' )
            {
            // InternalMyDsl.g:1320:1: ( 'messageflows' )
            // InternalMyDsl.g:1321:2: 'messageflows'
            {
             before(grammarAccess.getXpdlRootAccess().getMessageflowsKeyword_7_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getXpdlRootAccess().getMessageflowsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_7__0__Impl"


    // $ANTLR start "rule__XpdlRoot__Group_7__1"
    // InternalMyDsl.g:1330:1: rule__XpdlRoot__Group_7__1 : rule__XpdlRoot__Group_7__1__Impl rule__XpdlRoot__Group_7__2 ;
    public final void rule__XpdlRoot__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1334:1: ( rule__XpdlRoot__Group_7__1__Impl rule__XpdlRoot__Group_7__2 )
            // InternalMyDsl.g:1335:2: rule__XpdlRoot__Group_7__1__Impl rule__XpdlRoot__Group_7__2
            {
            pushFollow(FOLLOW_11);
            rule__XpdlRoot__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_7__1"


    // $ANTLR start "rule__XpdlRoot__Group_7__1__Impl"
    // InternalMyDsl.g:1342:1: rule__XpdlRoot__Group_7__1__Impl : ( '{' ) ;
    public final void rule__XpdlRoot__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1346:1: ( ( '{' ) )
            // InternalMyDsl.g:1347:1: ( '{' )
            {
            // InternalMyDsl.g:1347:1: ( '{' )
            // InternalMyDsl.g:1348:2: '{'
            {
             before(grammarAccess.getXpdlRootAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getXpdlRootAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_7__1__Impl"


    // $ANTLR start "rule__XpdlRoot__Group_7__2"
    // InternalMyDsl.g:1357:1: rule__XpdlRoot__Group_7__2 : rule__XpdlRoot__Group_7__2__Impl rule__XpdlRoot__Group_7__3 ;
    public final void rule__XpdlRoot__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1361:1: ( rule__XpdlRoot__Group_7__2__Impl rule__XpdlRoot__Group_7__3 )
            // InternalMyDsl.g:1362:2: rule__XpdlRoot__Group_7__2__Impl rule__XpdlRoot__Group_7__3
            {
            pushFollow(FOLLOW_8);
            rule__XpdlRoot__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_7__2"


    // $ANTLR start "rule__XpdlRoot__Group_7__2__Impl"
    // InternalMyDsl.g:1369:1: rule__XpdlRoot__Group_7__2__Impl : ( ( rule__XpdlRoot__MessageflowsAssignment_7_2 ) ) ;
    public final void rule__XpdlRoot__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1373:1: ( ( ( rule__XpdlRoot__MessageflowsAssignment_7_2 ) ) )
            // InternalMyDsl.g:1374:1: ( ( rule__XpdlRoot__MessageflowsAssignment_7_2 ) )
            {
            // InternalMyDsl.g:1374:1: ( ( rule__XpdlRoot__MessageflowsAssignment_7_2 ) )
            // InternalMyDsl.g:1375:2: ( rule__XpdlRoot__MessageflowsAssignment_7_2 )
            {
             before(grammarAccess.getXpdlRootAccess().getMessageflowsAssignment_7_2()); 
            // InternalMyDsl.g:1376:2: ( rule__XpdlRoot__MessageflowsAssignment_7_2 )
            // InternalMyDsl.g:1376:3: rule__XpdlRoot__MessageflowsAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__XpdlRoot__MessageflowsAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getXpdlRootAccess().getMessageflowsAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_7__2__Impl"


    // $ANTLR start "rule__XpdlRoot__Group_7__3"
    // InternalMyDsl.g:1384:1: rule__XpdlRoot__Group_7__3 : rule__XpdlRoot__Group_7__3__Impl rule__XpdlRoot__Group_7__4 ;
    public final void rule__XpdlRoot__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1388:1: ( rule__XpdlRoot__Group_7__3__Impl rule__XpdlRoot__Group_7__4 )
            // InternalMyDsl.g:1389:2: rule__XpdlRoot__Group_7__3__Impl rule__XpdlRoot__Group_7__4
            {
            pushFollow(FOLLOW_8);
            rule__XpdlRoot__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_7__3"


    // $ANTLR start "rule__XpdlRoot__Group_7__3__Impl"
    // InternalMyDsl.g:1396:1: rule__XpdlRoot__Group_7__3__Impl : ( ( rule__XpdlRoot__Group_7_3__0 )* ) ;
    public final void rule__XpdlRoot__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1400:1: ( ( ( rule__XpdlRoot__Group_7_3__0 )* ) )
            // InternalMyDsl.g:1401:1: ( ( rule__XpdlRoot__Group_7_3__0 )* )
            {
            // InternalMyDsl.g:1401:1: ( ( rule__XpdlRoot__Group_7_3__0 )* )
            // InternalMyDsl.g:1402:2: ( rule__XpdlRoot__Group_7_3__0 )*
            {
             before(grammarAccess.getXpdlRootAccess().getGroup_7_3()); 
            // InternalMyDsl.g:1403:2: ( rule__XpdlRoot__Group_7_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1403:3: rule__XpdlRoot__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__XpdlRoot__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getXpdlRootAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_7__3__Impl"


    // $ANTLR start "rule__XpdlRoot__Group_7__4"
    // InternalMyDsl.g:1411:1: rule__XpdlRoot__Group_7__4 : rule__XpdlRoot__Group_7__4__Impl ;
    public final void rule__XpdlRoot__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1415:1: ( rule__XpdlRoot__Group_7__4__Impl )
            // InternalMyDsl.g:1416:2: rule__XpdlRoot__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_7__4"


    // $ANTLR start "rule__XpdlRoot__Group_7__4__Impl"
    // InternalMyDsl.g:1422:1: rule__XpdlRoot__Group_7__4__Impl : ( '}' ) ;
    public final void rule__XpdlRoot__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1426:1: ( ( '}' ) )
            // InternalMyDsl.g:1427:1: ( '}' )
            {
            // InternalMyDsl.g:1427:1: ( '}' )
            // InternalMyDsl.g:1428:2: '}'
            {
             before(grammarAccess.getXpdlRootAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getXpdlRootAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_7__4__Impl"


    // $ANTLR start "rule__XpdlRoot__Group_7_3__0"
    // InternalMyDsl.g:1438:1: rule__XpdlRoot__Group_7_3__0 : rule__XpdlRoot__Group_7_3__0__Impl rule__XpdlRoot__Group_7_3__1 ;
    public final void rule__XpdlRoot__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1442:1: ( rule__XpdlRoot__Group_7_3__0__Impl rule__XpdlRoot__Group_7_3__1 )
            // InternalMyDsl.g:1443:2: rule__XpdlRoot__Group_7_3__0__Impl rule__XpdlRoot__Group_7_3__1
            {
            pushFollow(FOLLOW_11);
            rule__XpdlRoot__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_7_3__0"


    // $ANTLR start "rule__XpdlRoot__Group_7_3__0__Impl"
    // InternalMyDsl.g:1450:1: rule__XpdlRoot__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__XpdlRoot__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1454:1: ( ( ',' ) )
            // InternalMyDsl.g:1455:1: ( ',' )
            {
            // InternalMyDsl.g:1455:1: ( ',' )
            // InternalMyDsl.g:1456:2: ','
            {
             before(grammarAccess.getXpdlRootAccess().getCommaKeyword_7_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getXpdlRootAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_7_3__0__Impl"


    // $ANTLR start "rule__XpdlRoot__Group_7_3__1"
    // InternalMyDsl.g:1465:1: rule__XpdlRoot__Group_7_3__1 : rule__XpdlRoot__Group_7_3__1__Impl ;
    public final void rule__XpdlRoot__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1469:1: ( rule__XpdlRoot__Group_7_3__1__Impl )
            // InternalMyDsl.g:1470:2: rule__XpdlRoot__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_7_3__1"


    // $ANTLR start "rule__XpdlRoot__Group_7_3__1__Impl"
    // InternalMyDsl.g:1476:1: rule__XpdlRoot__Group_7_3__1__Impl : ( ( rule__XpdlRoot__MessageflowsAssignment_7_3_1 ) ) ;
    public final void rule__XpdlRoot__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1480:1: ( ( ( rule__XpdlRoot__MessageflowsAssignment_7_3_1 ) ) )
            // InternalMyDsl.g:1481:1: ( ( rule__XpdlRoot__MessageflowsAssignment_7_3_1 ) )
            {
            // InternalMyDsl.g:1481:1: ( ( rule__XpdlRoot__MessageflowsAssignment_7_3_1 ) )
            // InternalMyDsl.g:1482:2: ( rule__XpdlRoot__MessageflowsAssignment_7_3_1 )
            {
             before(grammarAccess.getXpdlRootAccess().getMessageflowsAssignment_7_3_1()); 
            // InternalMyDsl.g:1483:2: ( rule__XpdlRoot__MessageflowsAssignment_7_3_1 )
            // InternalMyDsl.g:1483:3: rule__XpdlRoot__MessageflowsAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__XpdlRoot__MessageflowsAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getXpdlRootAccess().getMessageflowsAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_7_3__1__Impl"


    // $ANTLR start "rule__Participant__Group__0"
    // InternalMyDsl.g:1492:1: rule__Participant__Group__0 : rule__Participant__Group__0__Impl rule__Participant__Group__1 ;
    public final void rule__Participant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1496:1: ( rule__Participant__Group__0__Impl rule__Participant__Group__1 )
            // InternalMyDsl.g:1497:2: rule__Participant__Group__0__Impl rule__Participant__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Participant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Participant__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__0"


    // $ANTLR start "rule__Participant__Group__0__Impl"
    // InternalMyDsl.g:1504:1: rule__Participant__Group__0__Impl : ( 'Participant' ) ;
    public final void rule__Participant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1508:1: ( ( 'Participant' ) )
            // InternalMyDsl.g:1509:1: ( 'Participant' )
            {
            // InternalMyDsl.g:1509:1: ( 'Participant' )
            // InternalMyDsl.g:1510:2: 'Participant'
            {
             before(grammarAccess.getParticipantAccess().getParticipantKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getParticipantAccess().getParticipantKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__0__Impl"


    // $ANTLR start "rule__Participant__Group__1"
    // InternalMyDsl.g:1519:1: rule__Participant__Group__1 : rule__Participant__Group__1__Impl rule__Participant__Group__2 ;
    public final void rule__Participant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1523:1: ( rule__Participant__Group__1__Impl rule__Participant__Group__2 )
            // InternalMyDsl.g:1524:2: rule__Participant__Group__1__Impl rule__Participant__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Participant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Participant__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__1"


    // $ANTLR start "rule__Participant__Group__1__Impl"
    // InternalMyDsl.g:1531:1: rule__Participant__Group__1__Impl : ( ( rule__Participant__IdAssignment_1 ) ) ;
    public final void rule__Participant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1535:1: ( ( ( rule__Participant__IdAssignment_1 ) ) )
            // InternalMyDsl.g:1536:1: ( ( rule__Participant__IdAssignment_1 ) )
            {
            // InternalMyDsl.g:1536:1: ( ( rule__Participant__IdAssignment_1 ) )
            // InternalMyDsl.g:1537:2: ( rule__Participant__IdAssignment_1 )
            {
             before(grammarAccess.getParticipantAccess().getIdAssignment_1()); 
            // InternalMyDsl.g:1538:2: ( rule__Participant__IdAssignment_1 )
            // InternalMyDsl.g:1538:3: rule__Participant__IdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Participant__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParticipantAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__1__Impl"


    // $ANTLR start "rule__Participant__Group__2"
    // InternalMyDsl.g:1546:1: rule__Participant__Group__2 : rule__Participant__Group__2__Impl rule__Participant__Group__3 ;
    public final void rule__Participant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1550:1: ( rule__Participant__Group__2__Impl rule__Participant__Group__3 )
            // InternalMyDsl.g:1551:2: rule__Participant__Group__2__Impl rule__Participant__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Participant__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Participant__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__2"


    // $ANTLR start "rule__Participant__Group__2__Impl"
    // InternalMyDsl.g:1558:1: rule__Participant__Group__2__Impl : ( '{' ) ;
    public final void rule__Participant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1562:1: ( ( '{' ) )
            // InternalMyDsl.g:1563:1: ( '{' )
            {
            // InternalMyDsl.g:1563:1: ( '{' )
            // InternalMyDsl.g:1564:2: '{'
            {
             before(grammarAccess.getParticipantAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getParticipantAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__2__Impl"


    // $ANTLR start "rule__Participant__Group__3"
    // InternalMyDsl.g:1573:1: rule__Participant__Group__3 : rule__Participant__Group__3__Impl rule__Participant__Group__4 ;
    public final void rule__Participant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1577:1: ( rule__Participant__Group__3__Impl rule__Participant__Group__4 )
            // InternalMyDsl.g:1578:2: rule__Participant__Group__3__Impl rule__Participant__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Participant__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Participant__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__3"


    // $ANTLR start "rule__Participant__Group__3__Impl"
    // InternalMyDsl.g:1585:1: rule__Participant__Group__3__Impl : ( ( rule__Participant__Group_3__0 )? ) ;
    public final void rule__Participant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1589:1: ( ( ( rule__Participant__Group_3__0 )? ) )
            // InternalMyDsl.g:1590:1: ( ( rule__Participant__Group_3__0 )? )
            {
            // InternalMyDsl.g:1590:1: ( ( rule__Participant__Group_3__0 )? )
            // InternalMyDsl.g:1591:2: ( rule__Participant__Group_3__0 )?
            {
             before(grammarAccess.getParticipantAccess().getGroup_3()); 
            // InternalMyDsl.g:1592:2: ( rule__Participant__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1592:3: rule__Participant__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Participant__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParticipantAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__3__Impl"


    // $ANTLR start "rule__Participant__Group__4"
    // InternalMyDsl.g:1600:1: rule__Participant__Group__4 : rule__Participant__Group__4__Impl rule__Participant__Group__5 ;
    public final void rule__Participant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1604:1: ( rule__Participant__Group__4__Impl rule__Participant__Group__5 )
            // InternalMyDsl.g:1605:2: rule__Participant__Group__4__Impl rule__Participant__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Participant__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Participant__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__4"


    // $ANTLR start "rule__Participant__Group__4__Impl"
    // InternalMyDsl.g:1612:1: rule__Participant__Group__4__Impl : ( 'pools' ) ;
    public final void rule__Participant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1616:1: ( ( 'pools' ) )
            // InternalMyDsl.g:1617:1: ( 'pools' )
            {
            // InternalMyDsl.g:1617:1: ( 'pools' )
            // InternalMyDsl.g:1618:2: 'pools'
            {
             before(grammarAccess.getParticipantAccess().getPoolsKeyword_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getParticipantAccess().getPoolsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__4__Impl"


    // $ANTLR start "rule__Participant__Group__5"
    // InternalMyDsl.g:1627:1: rule__Participant__Group__5 : rule__Participant__Group__5__Impl rule__Participant__Group__6 ;
    public final void rule__Participant__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1631:1: ( rule__Participant__Group__5__Impl rule__Participant__Group__6 )
            // InternalMyDsl.g:1632:2: rule__Participant__Group__5__Impl rule__Participant__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Participant__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Participant__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__5"


    // $ANTLR start "rule__Participant__Group__5__Impl"
    // InternalMyDsl.g:1639:1: rule__Participant__Group__5__Impl : ( '{' ) ;
    public final void rule__Participant__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1643:1: ( ( '{' ) )
            // InternalMyDsl.g:1644:1: ( '{' )
            {
            // InternalMyDsl.g:1644:1: ( '{' )
            // InternalMyDsl.g:1645:2: '{'
            {
             before(grammarAccess.getParticipantAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getParticipantAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__5__Impl"


    // $ANTLR start "rule__Participant__Group__6"
    // InternalMyDsl.g:1654:1: rule__Participant__Group__6 : rule__Participant__Group__6__Impl rule__Participant__Group__7 ;
    public final void rule__Participant__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1658:1: ( rule__Participant__Group__6__Impl rule__Participant__Group__7 )
            // InternalMyDsl.g:1659:2: rule__Participant__Group__6__Impl rule__Participant__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Participant__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Participant__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__6"


    // $ANTLR start "rule__Participant__Group__6__Impl"
    // InternalMyDsl.g:1666:1: rule__Participant__Group__6__Impl : ( ( rule__Participant__PoolsAssignment_6 ) ) ;
    public final void rule__Participant__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1670:1: ( ( ( rule__Participant__PoolsAssignment_6 ) ) )
            // InternalMyDsl.g:1671:1: ( ( rule__Participant__PoolsAssignment_6 ) )
            {
            // InternalMyDsl.g:1671:1: ( ( rule__Participant__PoolsAssignment_6 ) )
            // InternalMyDsl.g:1672:2: ( rule__Participant__PoolsAssignment_6 )
            {
             before(grammarAccess.getParticipantAccess().getPoolsAssignment_6()); 
            // InternalMyDsl.g:1673:2: ( rule__Participant__PoolsAssignment_6 )
            // InternalMyDsl.g:1673:3: rule__Participant__PoolsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Participant__PoolsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getParticipantAccess().getPoolsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__6__Impl"


    // $ANTLR start "rule__Participant__Group__7"
    // InternalMyDsl.g:1681:1: rule__Participant__Group__7 : rule__Participant__Group__7__Impl rule__Participant__Group__8 ;
    public final void rule__Participant__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1685:1: ( rule__Participant__Group__7__Impl rule__Participant__Group__8 )
            // InternalMyDsl.g:1686:2: rule__Participant__Group__7__Impl rule__Participant__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Participant__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Participant__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__7"


    // $ANTLR start "rule__Participant__Group__7__Impl"
    // InternalMyDsl.g:1693:1: rule__Participant__Group__7__Impl : ( ( rule__Participant__Group_7__0 )* ) ;
    public final void rule__Participant__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1697:1: ( ( ( rule__Participant__Group_7__0 )* ) )
            // InternalMyDsl.g:1698:1: ( ( rule__Participant__Group_7__0 )* )
            {
            // InternalMyDsl.g:1698:1: ( ( rule__Participant__Group_7__0 )* )
            // InternalMyDsl.g:1699:2: ( rule__Participant__Group_7__0 )*
            {
             before(grammarAccess.getParticipantAccess().getGroup_7()); 
            // InternalMyDsl.g:1700:2: ( rule__Participant__Group_7__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==27) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:1700:3: rule__Participant__Group_7__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Participant__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getParticipantAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__7__Impl"


    // $ANTLR start "rule__Participant__Group__8"
    // InternalMyDsl.g:1708:1: rule__Participant__Group__8 : rule__Participant__Group__8__Impl rule__Participant__Group__9 ;
    public final void rule__Participant__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1712:1: ( rule__Participant__Group__8__Impl rule__Participant__Group__9 )
            // InternalMyDsl.g:1713:2: rule__Participant__Group__8__Impl rule__Participant__Group__9
            {
            pushFollow(FOLLOW_14);
            rule__Participant__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Participant__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__8"


    // $ANTLR start "rule__Participant__Group__8__Impl"
    // InternalMyDsl.g:1720:1: rule__Participant__Group__8__Impl : ( '}' ) ;
    public final void rule__Participant__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1724:1: ( ( '}' ) )
            // InternalMyDsl.g:1725:1: ( '}' )
            {
            // InternalMyDsl.g:1725:1: ( '}' )
            // InternalMyDsl.g:1726:2: '}'
            {
             before(grammarAccess.getParticipantAccess().getRightCurlyBracketKeyword_8()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getParticipantAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__8__Impl"


    // $ANTLR start "rule__Participant__Group__9"
    // InternalMyDsl.g:1735:1: rule__Participant__Group__9 : rule__Participant__Group__9__Impl ;
    public final void rule__Participant__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1739:1: ( rule__Participant__Group__9__Impl )
            // InternalMyDsl.g:1740:2: rule__Participant__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Participant__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__9"


    // $ANTLR start "rule__Participant__Group__9__Impl"
    // InternalMyDsl.g:1746:1: rule__Participant__Group__9__Impl : ( '}' ) ;
    public final void rule__Participant__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1750:1: ( ( '}' ) )
            // InternalMyDsl.g:1751:1: ( '}' )
            {
            // InternalMyDsl.g:1751:1: ( '}' )
            // InternalMyDsl.g:1752:2: '}'
            {
             before(grammarAccess.getParticipantAccess().getRightCurlyBracketKeyword_9()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getParticipantAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__9__Impl"


    // $ANTLR start "rule__Participant__Group_3__0"
    // InternalMyDsl.g:1762:1: rule__Participant__Group_3__0 : rule__Participant__Group_3__0__Impl rule__Participant__Group_3__1 ;
    public final void rule__Participant__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1766:1: ( rule__Participant__Group_3__0__Impl rule__Participant__Group_3__1 )
            // InternalMyDsl.g:1767:2: rule__Participant__Group_3__0__Impl rule__Participant__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Participant__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Participant__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group_3__0"


    // $ANTLR start "rule__Participant__Group_3__0__Impl"
    // InternalMyDsl.g:1774:1: rule__Participant__Group_3__0__Impl : ( 'name' ) ;
    public final void rule__Participant__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1778:1: ( ( 'name' ) )
            // InternalMyDsl.g:1779:1: ( 'name' )
            {
            // InternalMyDsl.g:1779:1: ( 'name' )
            // InternalMyDsl.g:1780:2: 'name'
            {
             before(grammarAccess.getParticipantAccess().getNameKeyword_3_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getParticipantAccess().getNameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group_3__0__Impl"


    // $ANTLR start "rule__Participant__Group_3__1"
    // InternalMyDsl.g:1789:1: rule__Participant__Group_3__1 : rule__Participant__Group_3__1__Impl ;
    public final void rule__Participant__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1793:1: ( rule__Participant__Group_3__1__Impl )
            // InternalMyDsl.g:1794:2: rule__Participant__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Participant__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group_3__1"


    // $ANTLR start "rule__Participant__Group_3__1__Impl"
    // InternalMyDsl.g:1800:1: rule__Participant__Group_3__1__Impl : ( ( rule__Participant__NameAssignment_3_1 ) ) ;
    public final void rule__Participant__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1804:1: ( ( ( rule__Participant__NameAssignment_3_1 ) ) )
            // InternalMyDsl.g:1805:1: ( ( rule__Participant__NameAssignment_3_1 ) )
            {
            // InternalMyDsl.g:1805:1: ( ( rule__Participant__NameAssignment_3_1 ) )
            // InternalMyDsl.g:1806:2: ( rule__Participant__NameAssignment_3_1 )
            {
             before(grammarAccess.getParticipantAccess().getNameAssignment_3_1()); 
            // InternalMyDsl.g:1807:2: ( rule__Participant__NameAssignment_3_1 )
            // InternalMyDsl.g:1807:3: rule__Participant__NameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Participant__NameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getParticipantAccess().getNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group_3__1__Impl"


    // $ANTLR start "rule__Participant__Group_7__0"
    // InternalMyDsl.g:1816:1: rule__Participant__Group_7__0 : rule__Participant__Group_7__0__Impl rule__Participant__Group_7__1 ;
    public final void rule__Participant__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1820:1: ( rule__Participant__Group_7__0__Impl rule__Participant__Group_7__1 )
            // InternalMyDsl.g:1821:2: rule__Participant__Group_7__0__Impl rule__Participant__Group_7__1
            {
            pushFollow(FOLLOW_13);
            rule__Participant__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Participant__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group_7__0"


    // $ANTLR start "rule__Participant__Group_7__0__Impl"
    // InternalMyDsl.g:1828:1: rule__Participant__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Participant__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1832:1: ( ( ',' ) )
            // InternalMyDsl.g:1833:1: ( ',' )
            {
            // InternalMyDsl.g:1833:1: ( ',' )
            // InternalMyDsl.g:1834:2: ','
            {
             before(grammarAccess.getParticipantAccess().getCommaKeyword_7_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getParticipantAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group_7__0__Impl"


    // $ANTLR start "rule__Participant__Group_7__1"
    // InternalMyDsl.g:1843:1: rule__Participant__Group_7__1 : rule__Participant__Group_7__1__Impl ;
    public final void rule__Participant__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1847:1: ( rule__Participant__Group_7__1__Impl )
            // InternalMyDsl.g:1848:2: rule__Participant__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Participant__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group_7__1"


    // $ANTLR start "rule__Participant__Group_7__1__Impl"
    // InternalMyDsl.g:1854:1: rule__Participant__Group_7__1__Impl : ( ( rule__Participant__PoolsAssignment_7_1 ) ) ;
    public final void rule__Participant__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1858:1: ( ( ( rule__Participant__PoolsAssignment_7_1 ) ) )
            // InternalMyDsl.g:1859:1: ( ( rule__Participant__PoolsAssignment_7_1 ) )
            {
            // InternalMyDsl.g:1859:1: ( ( rule__Participant__PoolsAssignment_7_1 ) )
            // InternalMyDsl.g:1860:2: ( rule__Participant__PoolsAssignment_7_1 )
            {
             before(grammarAccess.getParticipantAccess().getPoolsAssignment_7_1()); 
            // InternalMyDsl.g:1861:2: ( rule__Participant__PoolsAssignment_7_1 )
            // InternalMyDsl.g:1861:3: rule__Participant__PoolsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Participant__PoolsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getParticipantAccess().getPoolsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group_7__1__Impl"


    // $ANTLR start "rule__Process__Group__0"
    // InternalMyDsl.g:1870:1: rule__Process__Group__0 : rule__Process__Group__0__Impl rule__Process__Group__1 ;
    public final void rule__Process__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1874:1: ( rule__Process__Group__0__Impl rule__Process__Group__1 )
            // InternalMyDsl.g:1875:2: rule__Process__Group__0__Impl rule__Process__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Process__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__0"


    // $ANTLR start "rule__Process__Group__0__Impl"
    // InternalMyDsl.g:1882:1: rule__Process__Group__0__Impl : ( () ) ;
    public final void rule__Process__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1886:1: ( ( () ) )
            // InternalMyDsl.g:1887:1: ( () )
            {
            // InternalMyDsl.g:1887:1: ( () )
            // InternalMyDsl.g:1888:2: ()
            {
             before(grammarAccess.getProcessAccess().getProcessAction_0()); 
            // InternalMyDsl.g:1889:2: ()
            // InternalMyDsl.g:1889:3: 
            {
            }

             after(grammarAccess.getProcessAccess().getProcessAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__0__Impl"


    // $ANTLR start "rule__Process__Group__1"
    // InternalMyDsl.g:1897:1: rule__Process__Group__1 : rule__Process__Group__1__Impl rule__Process__Group__2 ;
    public final void rule__Process__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1901:1: ( rule__Process__Group__1__Impl rule__Process__Group__2 )
            // InternalMyDsl.g:1902:2: rule__Process__Group__1__Impl rule__Process__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__1"


    // $ANTLR start "rule__Process__Group__1__Impl"
    // InternalMyDsl.g:1909:1: rule__Process__Group__1__Impl : ( 'Process' ) ;
    public final void rule__Process__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1913:1: ( ( 'Process' ) )
            // InternalMyDsl.g:1914:1: ( 'Process' )
            {
            // InternalMyDsl.g:1914:1: ( 'Process' )
            // InternalMyDsl.g:1915:2: 'Process'
            {
             before(grammarAccess.getProcessAccess().getProcessKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getProcessKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__1__Impl"


    // $ANTLR start "rule__Process__Group__2"
    // InternalMyDsl.g:1924:1: rule__Process__Group__2 : rule__Process__Group__2__Impl rule__Process__Group__3 ;
    public final void rule__Process__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1928:1: ( rule__Process__Group__2__Impl rule__Process__Group__3 )
            // InternalMyDsl.g:1929:2: rule__Process__Group__2__Impl rule__Process__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Process__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__2"


    // $ANTLR start "rule__Process__Group__2__Impl"
    // InternalMyDsl.g:1936:1: rule__Process__Group__2__Impl : ( ( rule__Process__IdAssignment_2 ) ) ;
    public final void rule__Process__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1940:1: ( ( ( rule__Process__IdAssignment_2 ) ) )
            // InternalMyDsl.g:1941:1: ( ( rule__Process__IdAssignment_2 ) )
            {
            // InternalMyDsl.g:1941:1: ( ( rule__Process__IdAssignment_2 ) )
            // InternalMyDsl.g:1942:2: ( rule__Process__IdAssignment_2 )
            {
             before(grammarAccess.getProcessAccess().getIdAssignment_2()); 
            // InternalMyDsl.g:1943:2: ( rule__Process__IdAssignment_2 )
            // InternalMyDsl.g:1943:3: rule__Process__IdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Process__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__2__Impl"


    // $ANTLR start "rule__Process__Group__3"
    // InternalMyDsl.g:1951:1: rule__Process__Group__3 : rule__Process__Group__3__Impl rule__Process__Group__4 ;
    public final void rule__Process__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1955:1: ( rule__Process__Group__3__Impl rule__Process__Group__4 )
            // InternalMyDsl.g:1956:2: rule__Process__Group__3__Impl rule__Process__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Process__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__3"


    // $ANTLR start "rule__Process__Group__3__Impl"
    // InternalMyDsl.g:1963:1: rule__Process__Group__3__Impl : ( '{' ) ;
    public final void rule__Process__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1967:1: ( ( '{' ) )
            // InternalMyDsl.g:1968:1: ( '{' )
            {
            // InternalMyDsl.g:1968:1: ( '{' )
            // InternalMyDsl.g:1969:2: '{'
            {
             before(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__3__Impl"


    // $ANTLR start "rule__Process__Group__4"
    // InternalMyDsl.g:1978:1: rule__Process__Group__4 : rule__Process__Group__4__Impl rule__Process__Group__5 ;
    public final void rule__Process__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1982:1: ( rule__Process__Group__4__Impl rule__Process__Group__5 )
            // InternalMyDsl.g:1983:2: rule__Process__Group__4__Impl rule__Process__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Process__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__4"


    // $ANTLR start "rule__Process__Group__4__Impl"
    // InternalMyDsl.g:1990:1: rule__Process__Group__4__Impl : ( ( rule__Process__Group_4__0 )? ) ;
    public final void rule__Process__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1994:1: ( ( ( rule__Process__Group_4__0 )? ) )
            // InternalMyDsl.g:1995:1: ( ( rule__Process__Group_4__0 )? )
            {
            // InternalMyDsl.g:1995:1: ( ( rule__Process__Group_4__0 )? )
            // InternalMyDsl.g:1996:2: ( rule__Process__Group_4__0 )?
            {
             before(grammarAccess.getProcessAccess().getGroup_4()); 
            // InternalMyDsl.g:1997:2: ( rule__Process__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1997:3: rule__Process__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Process__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__4__Impl"


    // $ANTLR start "rule__Process__Group__5"
    // InternalMyDsl.g:2005:1: rule__Process__Group__5 : rule__Process__Group__5__Impl rule__Process__Group__6 ;
    public final void rule__Process__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2009:1: ( rule__Process__Group__5__Impl rule__Process__Group__6 )
            // InternalMyDsl.g:2010:2: rule__Process__Group__5__Impl rule__Process__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__Process__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__5"


    // $ANTLR start "rule__Process__Group__5__Impl"
    // InternalMyDsl.g:2017:1: rule__Process__Group__5__Impl : ( ( rule__Process__Group_5__0 )? ) ;
    public final void rule__Process__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2021:1: ( ( ( rule__Process__Group_5__0 )? ) )
            // InternalMyDsl.g:2022:1: ( ( rule__Process__Group_5__0 )? )
            {
            // InternalMyDsl.g:2022:1: ( ( rule__Process__Group_5__0 )? )
            // InternalMyDsl.g:2023:2: ( rule__Process__Group_5__0 )?
            {
             before(grammarAccess.getProcessAccess().getGroup_5()); 
            // InternalMyDsl.g:2024:2: ( rule__Process__Group_5__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:2024:3: rule__Process__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Process__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__5__Impl"


    // $ANTLR start "rule__Process__Group__6"
    // InternalMyDsl.g:2032:1: rule__Process__Group__6 : rule__Process__Group__6__Impl rule__Process__Group__7 ;
    public final void rule__Process__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2036:1: ( rule__Process__Group__6__Impl rule__Process__Group__7 )
            // InternalMyDsl.g:2037:2: rule__Process__Group__6__Impl rule__Process__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__Process__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__6"


    // $ANTLR start "rule__Process__Group__6__Impl"
    // InternalMyDsl.g:2044:1: rule__Process__Group__6__Impl : ( ( rule__Process__Group_6__0 )? ) ;
    public final void rule__Process__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2048:1: ( ( ( rule__Process__Group_6__0 )? ) )
            // InternalMyDsl.g:2049:1: ( ( rule__Process__Group_6__0 )? )
            {
            // InternalMyDsl.g:2049:1: ( ( rule__Process__Group_6__0 )? )
            // InternalMyDsl.g:2050:2: ( rule__Process__Group_6__0 )?
            {
             before(grammarAccess.getProcessAccess().getGroup_6()); 
            // InternalMyDsl.g:2051:2: ( rule__Process__Group_6__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:2051:3: rule__Process__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Process__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__6__Impl"


    // $ANTLR start "rule__Process__Group__7"
    // InternalMyDsl.g:2059:1: rule__Process__Group__7 : rule__Process__Group__7__Impl rule__Process__Group__8 ;
    public final void rule__Process__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2063:1: ( rule__Process__Group__7__Impl rule__Process__Group__8 )
            // InternalMyDsl.g:2064:2: rule__Process__Group__7__Impl rule__Process__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__Process__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__7"


    // $ANTLR start "rule__Process__Group__7__Impl"
    // InternalMyDsl.g:2071:1: rule__Process__Group__7__Impl : ( ( rule__Process__Group_7__0 )? ) ;
    public final void rule__Process__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2075:1: ( ( ( rule__Process__Group_7__0 )? ) )
            // InternalMyDsl.g:2076:1: ( ( rule__Process__Group_7__0 )? )
            {
            // InternalMyDsl.g:2076:1: ( ( rule__Process__Group_7__0 )? )
            // InternalMyDsl.g:2077:2: ( rule__Process__Group_7__0 )?
            {
             before(grammarAccess.getProcessAccess().getGroup_7()); 
            // InternalMyDsl.g:2078:2: ( rule__Process__Group_7__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:2078:3: rule__Process__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Process__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__7__Impl"


    // $ANTLR start "rule__Process__Group__8"
    // InternalMyDsl.g:2086:1: rule__Process__Group__8 : rule__Process__Group__8__Impl ;
    public final void rule__Process__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2090:1: ( rule__Process__Group__8__Impl )
            // InternalMyDsl.g:2091:2: rule__Process__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__8"


    // $ANTLR start "rule__Process__Group__8__Impl"
    // InternalMyDsl.g:2097:1: rule__Process__Group__8__Impl : ( '}' ) ;
    public final void rule__Process__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2101:1: ( ( '}' ) )
            // InternalMyDsl.g:2102:1: ( '}' )
            {
            // InternalMyDsl.g:2102:1: ( '}' )
            // InternalMyDsl.g:2103:2: '}'
            {
             before(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_8()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__8__Impl"


    // $ANTLR start "rule__Process__Group_4__0"
    // InternalMyDsl.g:2113:1: rule__Process__Group_4__0 : rule__Process__Group_4__0__Impl rule__Process__Group_4__1 ;
    public final void rule__Process__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2117:1: ( rule__Process__Group_4__0__Impl rule__Process__Group_4__1 )
            // InternalMyDsl.g:2118:2: rule__Process__Group_4__0__Impl rule__Process__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__0"


    // $ANTLR start "rule__Process__Group_4__0__Impl"
    // InternalMyDsl.g:2125:1: rule__Process__Group_4__0__Impl : ( 'name' ) ;
    public final void rule__Process__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2129:1: ( ( 'name' ) )
            // InternalMyDsl.g:2130:1: ( 'name' )
            {
            // InternalMyDsl.g:2130:1: ( 'name' )
            // InternalMyDsl.g:2131:2: 'name'
            {
             before(grammarAccess.getProcessAccess().getNameKeyword_4_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getNameKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__0__Impl"


    // $ANTLR start "rule__Process__Group_4__1"
    // InternalMyDsl.g:2140:1: rule__Process__Group_4__1 : rule__Process__Group_4__1__Impl ;
    public final void rule__Process__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2144:1: ( rule__Process__Group_4__1__Impl )
            // InternalMyDsl.g:2145:2: rule__Process__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__1"


    // $ANTLR start "rule__Process__Group_4__1__Impl"
    // InternalMyDsl.g:2151:1: rule__Process__Group_4__1__Impl : ( ( rule__Process__NameAssignment_4_1 ) ) ;
    public final void rule__Process__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2155:1: ( ( ( rule__Process__NameAssignment_4_1 ) ) )
            // InternalMyDsl.g:2156:1: ( ( rule__Process__NameAssignment_4_1 ) )
            {
            // InternalMyDsl.g:2156:1: ( ( rule__Process__NameAssignment_4_1 ) )
            // InternalMyDsl.g:2157:2: ( rule__Process__NameAssignment_4_1 )
            {
             before(grammarAccess.getProcessAccess().getNameAssignment_4_1()); 
            // InternalMyDsl.g:2158:2: ( rule__Process__NameAssignment_4_1 )
            // InternalMyDsl.g:2158:3: rule__Process__NameAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Process__NameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getNameAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__1__Impl"


    // $ANTLR start "rule__Process__Group_5__0"
    // InternalMyDsl.g:2167:1: rule__Process__Group_5__0 : rule__Process__Group_5__0__Impl rule__Process__Group_5__1 ;
    public final void rule__Process__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2171:1: ( rule__Process__Group_5__0__Impl rule__Process__Group_5__1 )
            // InternalMyDsl.g:2172:2: rule__Process__Group_5__0__Impl rule__Process__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Process__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_5__0"


    // $ANTLR start "rule__Process__Group_5__0__Impl"
    // InternalMyDsl.g:2179:1: rule__Process__Group_5__0__Impl : ( 'workflowParticipants' ) ;
    public final void rule__Process__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2183:1: ( ( 'workflowParticipants' ) )
            // InternalMyDsl.g:2184:1: ( 'workflowParticipants' )
            {
            // InternalMyDsl.g:2184:1: ( 'workflowParticipants' )
            // InternalMyDsl.g:2185:2: 'workflowParticipants'
            {
             before(grammarAccess.getProcessAccess().getWorkflowParticipantsKeyword_5_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getWorkflowParticipantsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_5__0__Impl"


    // $ANTLR start "rule__Process__Group_5__1"
    // InternalMyDsl.g:2194:1: rule__Process__Group_5__1 : rule__Process__Group_5__1__Impl rule__Process__Group_5__2 ;
    public final void rule__Process__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2198:1: ( rule__Process__Group_5__1__Impl rule__Process__Group_5__2 )
            // InternalMyDsl.g:2199:2: rule__Process__Group_5__1__Impl rule__Process__Group_5__2
            {
            pushFollow(FOLLOW_7);
            rule__Process__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_5__1"


    // $ANTLR start "rule__Process__Group_5__1__Impl"
    // InternalMyDsl.g:2206:1: rule__Process__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Process__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2210:1: ( ( '{' ) )
            // InternalMyDsl.g:2211:1: ( '{' )
            {
            // InternalMyDsl.g:2211:1: ( '{' )
            // InternalMyDsl.g:2212:2: '{'
            {
             before(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_5__1__Impl"


    // $ANTLR start "rule__Process__Group_5__2"
    // InternalMyDsl.g:2221:1: rule__Process__Group_5__2 : rule__Process__Group_5__2__Impl rule__Process__Group_5__3 ;
    public final void rule__Process__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2225:1: ( rule__Process__Group_5__2__Impl rule__Process__Group_5__3 )
            // InternalMyDsl.g:2226:2: rule__Process__Group_5__2__Impl rule__Process__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__Process__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_5__2"


    // $ANTLR start "rule__Process__Group_5__2__Impl"
    // InternalMyDsl.g:2233:1: rule__Process__Group_5__2__Impl : ( ( rule__Process__WorkflowParticipantsAssignment_5_2 ) ) ;
    public final void rule__Process__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2237:1: ( ( ( rule__Process__WorkflowParticipantsAssignment_5_2 ) ) )
            // InternalMyDsl.g:2238:1: ( ( rule__Process__WorkflowParticipantsAssignment_5_2 ) )
            {
            // InternalMyDsl.g:2238:1: ( ( rule__Process__WorkflowParticipantsAssignment_5_2 ) )
            // InternalMyDsl.g:2239:2: ( rule__Process__WorkflowParticipantsAssignment_5_2 )
            {
             before(grammarAccess.getProcessAccess().getWorkflowParticipantsAssignment_5_2()); 
            // InternalMyDsl.g:2240:2: ( rule__Process__WorkflowParticipantsAssignment_5_2 )
            // InternalMyDsl.g:2240:3: rule__Process__WorkflowParticipantsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Process__WorkflowParticipantsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getWorkflowParticipantsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_5__2__Impl"


    // $ANTLR start "rule__Process__Group_5__3"
    // InternalMyDsl.g:2248:1: rule__Process__Group_5__3 : rule__Process__Group_5__3__Impl rule__Process__Group_5__4 ;
    public final void rule__Process__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2252:1: ( rule__Process__Group_5__3__Impl rule__Process__Group_5__4 )
            // InternalMyDsl.g:2253:2: rule__Process__Group_5__3__Impl rule__Process__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__Process__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_5__3"


    // $ANTLR start "rule__Process__Group_5__3__Impl"
    // InternalMyDsl.g:2260:1: rule__Process__Group_5__3__Impl : ( ( rule__Process__Group_5_3__0 )* ) ;
    public final void rule__Process__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2264:1: ( ( ( rule__Process__Group_5_3__0 )* ) )
            // InternalMyDsl.g:2265:1: ( ( rule__Process__Group_5_3__0 )* )
            {
            // InternalMyDsl.g:2265:1: ( ( rule__Process__Group_5_3__0 )* )
            // InternalMyDsl.g:2266:2: ( rule__Process__Group_5_3__0 )*
            {
             before(grammarAccess.getProcessAccess().getGroup_5_3()); 
            // InternalMyDsl.g:2267:2: ( rule__Process__Group_5_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==27) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:2267:3: rule__Process__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Process__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_5__3__Impl"


    // $ANTLR start "rule__Process__Group_5__4"
    // InternalMyDsl.g:2275:1: rule__Process__Group_5__4 : rule__Process__Group_5__4__Impl ;
    public final void rule__Process__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2279:1: ( rule__Process__Group_5__4__Impl )
            // InternalMyDsl.g:2280:2: rule__Process__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_5__4"


    // $ANTLR start "rule__Process__Group_5__4__Impl"
    // InternalMyDsl.g:2286:1: rule__Process__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Process__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2290:1: ( ( '}' ) )
            // InternalMyDsl.g:2291:1: ( '}' )
            {
            // InternalMyDsl.g:2291:1: ( '}' )
            // InternalMyDsl.g:2292:2: '}'
            {
             before(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_5__4__Impl"


    // $ANTLR start "rule__Process__Group_5_3__0"
    // InternalMyDsl.g:2302:1: rule__Process__Group_5_3__0 : rule__Process__Group_5_3__0__Impl rule__Process__Group_5_3__1 ;
    public final void rule__Process__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2306:1: ( rule__Process__Group_5_3__0__Impl rule__Process__Group_5_3__1 )
            // InternalMyDsl.g:2307:2: rule__Process__Group_5_3__0__Impl rule__Process__Group_5_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Process__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_5_3__0"


    // $ANTLR start "rule__Process__Group_5_3__0__Impl"
    // InternalMyDsl.g:2314:1: rule__Process__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Process__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2318:1: ( ( ',' ) )
            // InternalMyDsl.g:2319:1: ( ',' )
            {
            // InternalMyDsl.g:2319:1: ( ',' )
            // InternalMyDsl.g:2320:2: ','
            {
             before(grammarAccess.getProcessAccess().getCommaKeyword_5_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_5_3__0__Impl"


    // $ANTLR start "rule__Process__Group_5_3__1"
    // InternalMyDsl.g:2329:1: rule__Process__Group_5_3__1 : rule__Process__Group_5_3__1__Impl ;
    public final void rule__Process__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2333:1: ( rule__Process__Group_5_3__1__Impl )
            // InternalMyDsl.g:2334:2: rule__Process__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_5_3__1"


    // $ANTLR start "rule__Process__Group_5_3__1__Impl"
    // InternalMyDsl.g:2340:1: rule__Process__Group_5_3__1__Impl : ( ( rule__Process__WorkflowParticipantsAssignment_5_3_1 ) ) ;
    public final void rule__Process__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2344:1: ( ( ( rule__Process__WorkflowParticipantsAssignment_5_3_1 ) ) )
            // InternalMyDsl.g:2345:1: ( ( rule__Process__WorkflowParticipantsAssignment_5_3_1 ) )
            {
            // InternalMyDsl.g:2345:1: ( ( rule__Process__WorkflowParticipantsAssignment_5_3_1 ) )
            // InternalMyDsl.g:2346:2: ( rule__Process__WorkflowParticipantsAssignment_5_3_1 )
            {
             before(grammarAccess.getProcessAccess().getWorkflowParticipantsAssignment_5_3_1()); 
            // InternalMyDsl.g:2347:2: ( rule__Process__WorkflowParticipantsAssignment_5_3_1 )
            // InternalMyDsl.g:2347:3: rule__Process__WorkflowParticipantsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Process__WorkflowParticipantsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getWorkflowParticipantsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_5_3__1__Impl"


    // $ANTLR start "rule__Process__Group_6__0"
    // InternalMyDsl.g:2356:1: rule__Process__Group_6__0 : rule__Process__Group_6__0__Impl rule__Process__Group_6__1 ;
    public final void rule__Process__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2360:1: ( rule__Process__Group_6__0__Impl rule__Process__Group_6__1 )
            // InternalMyDsl.g:2361:2: rule__Process__Group_6__0__Impl rule__Process__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__Process__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_6__0"


    // $ANTLR start "rule__Process__Group_6__0__Impl"
    // InternalMyDsl.g:2368:1: rule__Process__Group_6__0__Impl : ( 'transitions' ) ;
    public final void rule__Process__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2372:1: ( ( 'transitions' ) )
            // InternalMyDsl.g:2373:1: ( 'transitions' )
            {
            // InternalMyDsl.g:2373:1: ( 'transitions' )
            // InternalMyDsl.g:2374:2: 'transitions'
            {
             before(grammarAccess.getProcessAccess().getTransitionsKeyword_6_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getTransitionsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_6__0__Impl"


    // $ANTLR start "rule__Process__Group_6__1"
    // InternalMyDsl.g:2383:1: rule__Process__Group_6__1 : rule__Process__Group_6__1__Impl rule__Process__Group_6__2 ;
    public final void rule__Process__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2387:1: ( rule__Process__Group_6__1__Impl rule__Process__Group_6__2 )
            // InternalMyDsl.g:2388:2: rule__Process__Group_6__1__Impl rule__Process__Group_6__2
            {
            pushFollow(FOLLOW_16);
            rule__Process__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_6__1"


    // $ANTLR start "rule__Process__Group_6__1__Impl"
    // InternalMyDsl.g:2395:1: rule__Process__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Process__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2399:1: ( ( '{' ) )
            // InternalMyDsl.g:2400:1: ( '{' )
            {
            // InternalMyDsl.g:2400:1: ( '{' )
            // InternalMyDsl.g:2401:2: '{'
            {
             before(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_6__1__Impl"


    // $ANTLR start "rule__Process__Group_6__2"
    // InternalMyDsl.g:2410:1: rule__Process__Group_6__2 : rule__Process__Group_6__2__Impl rule__Process__Group_6__3 ;
    public final void rule__Process__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2414:1: ( rule__Process__Group_6__2__Impl rule__Process__Group_6__3 )
            // InternalMyDsl.g:2415:2: rule__Process__Group_6__2__Impl rule__Process__Group_6__3
            {
            pushFollow(FOLLOW_8);
            rule__Process__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_6__2"


    // $ANTLR start "rule__Process__Group_6__2__Impl"
    // InternalMyDsl.g:2422:1: rule__Process__Group_6__2__Impl : ( ( rule__Process__TransitionsAssignment_6_2 ) ) ;
    public final void rule__Process__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2426:1: ( ( ( rule__Process__TransitionsAssignment_6_2 ) ) )
            // InternalMyDsl.g:2427:1: ( ( rule__Process__TransitionsAssignment_6_2 ) )
            {
            // InternalMyDsl.g:2427:1: ( ( rule__Process__TransitionsAssignment_6_2 ) )
            // InternalMyDsl.g:2428:2: ( rule__Process__TransitionsAssignment_6_2 )
            {
             before(grammarAccess.getProcessAccess().getTransitionsAssignment_6_2()); 
            // InternalMyDsl.g:2429:2: ( rule__Process__TransitionsAssignment_6_2 )
            // InternalMyDsl.g:2429:3: rule__Process__TransitionsAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Process__TransitionsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getTransitionsAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_6__2__Impl"


    // $ANTLR start "rule__Process__Group_6__3"
    // InternalMyDsl.g:2437:1: rule__Process__Group_6__3 : rule__Process__Group_6__3__Impl rule__Process__Group_6__4 ;
    public final void rule__Process__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2441:1: ( rule__Process__Group_6__3__Impl rule__Process__Group_6__4 )
            // InternalMyDsl.g:2442:2: rule__Process__Group_6__3__Impl rule__Process__Group_6__4
            {
            pushFollow(FOLLOW_8);
            rule__Process__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_6__3"


    // $ANTLR start "rule__Process__Group_6__3__Impl"
    // InternalMyDsl.g:2449:1: rule__Process__Group_6__3__Impl : ( ( rule__Process__Group_6_3__0 )* ) ;
    public final void rule__Process__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2453:1: ( ( ( rule__Process__Group_6_3__0 )* ) )
            // InternalMyDsl.g:2454:1: ( ( rule__Process__Group_6_3__0 )* )
            {
            // InternalMyDsl.g:2454:1: ( ( rule__Process__Group_6_3__0 )* )
            // InternalMyDsl.g:2455:2: ( rule__Process__Group_6_3__0 )*
            {
             before(grammarAccess.getProcessAccess().getGroup_6_3()); 
            // InternalMyDsl.g:2456:2: ( rule__Process__Group_6_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==27) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:2456:3: rule__Process__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Process__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_6__3__Impl"


    // $ANTLR start "rule__Process__Group_6__4"
    // InternalMyDsl.g:2464:1: rule__Process__Group_6__4 : rule__Process__Group_6__4__Impl ;
    public final void rule__Process__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2468:1: ( rule__Process__Group_6__4__Impl )
            // InternalMyDsl.g:2469:2: rule__Process__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_6__4"


    // $ANTLR start "rule__Process__Group_6__4__Impl"
    // InternalMyDsl.g:2475:1: rule__Process__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Process__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2479:1: ( ( '}' ) )
            // InternalMyDsl.g:2480:1: ( '}' )
            {
            // InternalMyDsl.g:2480:1: ( '}' )
            // InternalMyDsl.g:2481:2: '}'
            {
             before(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_6__4__Impl"


    // $ANTLR start "rule__Process__Group_6_3__0"
    // InternalMyDsl.g:2491:1: rule__Process__Group_6_3__0 : rule__Process__Group_6_3__0__Impl rule__Process__Group_6_3__1 ;
    public final void rule__Process__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2495:1: ( rule__Process__Group_6_3__0__Impl rule__Process__Group_6_3__1 )
            // InternalMyDsl.g:2496:2: rule__Process__Group_6_3__0__Impl rule__Process__Group_6_3__1
            {
            pushFollow(FOLLOW_16);
            rule__Process__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_6_3__0"


    // $ANTLR start "rule__Process__Group_6_3__0__Impl"
    // InternalMyDsl.g:2503:1: rule__Process__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Process__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2507:1: ( ( ',' ) )
            // InternalMyDsl.g:2508:1: ( ',' )
            {
            // InternalMyDsl.g:2508:1: ( ',' )
            // InternalMyDsl.g:2509:2: ','
            {
             before(grammarAccess.getProcessAccess().getCommaKeyword_6_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_6_3__0__Impl"


    // $ANTLR start "rule__Process__Group_6_3__1"
    // InternalMyDsl.g:2518:1: rule__Process__Group_6_3__1 : rule__Process__Group_6_3__1__Impl ;
    public final void rule__Process__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2522:1: ( rule__Process__Group_6_3__1__Impl )
            // InternalMyDsl.g:2523:2: rule__Process__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_6_3__1"


    // $ANTLR start "rule__Process__Group_6_3__1__Impl"
    // InternalMyDsl.g:2529:1: rule__Process__Group_6_3__1__Impl : ( ( rule__Process__TransitionsAssignment_6_3_1 ) ) ;
    public final void rule__Process__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2533:1: ( ( ( rule__Process__TransitionsAssignment_6_3_1 ) ) )
            // InternalMyDsl.g:2534:1: ( ( rule__Process__TransitionsAssignment_6_3_1 ) )
            {
            // InternalMyDsl.g:2534:1: ( ( rule__Process__TransitionsAssignment_6_3_1 ) )
            // InternalMyDsl.g:2535:2: ( rule__Process__TransitionsAssignment_6_3_1 )
            {
             before(grammarAccess.getProcessAccess().getTransitionsAssignment_6_3_1()); 
            // InternalMyDsl.g:2536:2: ( rule__Process__TransitionsAssignment_6_3_1 )
            // InternalMyDsl.g:2536:3: rule__Process__TransitionsAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Process__TransitionsAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getTransitionsAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_6_3__1__Impl"


    // $ANTLR start "rule__Process__Group_7__0"
    // InternalMyDsl.g:2545:1: rule__Process__Group_7__0 : rule__Process__Group_7__0__Impl rule__Process__Group_7__1 ;
    public final void rule__Process__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2549:1: ( rule__Process__Group_7__0__Impl rule__Process__Group_7__1 )
            // InternalMyDsl.g:2550:2: rule__Process__Group_7__0__Impl rule__Process__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__Process__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_7__0"


    // $ANTLR start "rule__Process__Group_7__0__Impl"
    // InternalMyDsl.g:2557:1: rule__Process__Group_7__0__Impl : ( 'activityset' ) ;
    public final void rule__Process__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2561:1: ( ( 'activityset' ) )
            // InternalMyDsl.g:2562:1: ( 'activityset' )
            {
            // InternalMyDsl.g:2562:1: ( 'activityset' )
            // InternalMyDsl.g:2563:2: 'activityset'
            {
             before(grammarAccess.getProcessAccess().getActivitysetKeyword_7_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getActivitysetKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_7__0__Impl"


    // $ANTLR start "rule__Process__Group_7__1"
    // InternalMyDsl.g:2572:1: rule__Process__Group_7__1 : rule__Process__Group_7__1__Impl rule__Process__Group_7__2 ;
    public final void rule__Process__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2576:1: ( rule__Process__Group_7__1__Impl rule__Process__Group_7__2 )
            // InternalMyDsl.g:2577:2: rule__Process__Group_7__1__Impl rule__Process__Group_7__2
            {
            pushFollow(FOLLOW_17);
            rule__Process__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_7__1"


    // $ANTLR start "rule__Process__Group_7__1__Impl"
    // InternalMyDsl.g:2584:1: rule__Process__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Process__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2588:1: ( ( '{' ) )
            // InternalMyDsl.g:2589:1: ( '{' )
            {
            // InternalMyDsl.g:2589:1: ( '{' )
            // InternalMyDsl.g:2590:2: '{'
            {
             before(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_7__1__Impl"


    // $ANTLR start "rule__Process__Group_7__2"
    // InternalMyDsl.g:2599:1: rule__Process__Group_7__2 : rule__Process__Group_7__2__Impl rule__Process__Group_7__3 ;
    public final void rule__Process__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2603:1: ( rule__Process__Group_7__2__Impl rule__Process__Group_7__3 )
            // InternalMyDsl.g:2604:2: rule__Process__Group_7__2__Impl rule__Process__Group_7__3
            {
            pushFollow(FOLLOW_8);
            rule__Process__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_7__2"


    // $ANTLR start "rule__Process__Group_7__2__Impl"
    // InternalMyDsl.g:2611:1: rule__Process__Group_7__2__Impl : ( ( rule__Process__ActivitysetAssignment_7_2 ) ) ;
    public final void rule__Process__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2615:1: ( ( ( rule__Process__ActivitysetAssignment_7_2 ) ) )
            // InternalMyDsl.g:2616:1: ( ( rule__Process__ActivitysetAssignment_7_2 ) )
            {
            // InternalMyDsl.g:2616:1: ( ( rule__Process__ActivitysetAssignment_7_2 ) )
            // InternalMyDsl.g:2617:2: ( rule__Process__ActivitysetAssignment_7_2 )
            {
             before(grammarAccess.getProcessAccess().getActivitysetAssignment_7_2()); 
            // InternalMyDsl.g:2618:2: ( rule__Process__ActivitysetAssignment_7_2 )
            // InternalMyDsl.g:2618:3: rule__Process__ActivitysetAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Process__ActivitysetAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getActivitysetAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_7__2__Impl"


    // $ANTLR start "rule__Process__Group_7__3"
    // InternalMyDsl.g:2626:1: rule__Process__Group_7__3 : rule__Process__Group_7__3__Impl rule__Process__Group_7__4 ;
    public final void rule__Process__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2630:1: ( rule__Process__Group_7__3__Impl rule__Process__Group_7__4 )
            // InternalMyDsl.g:2631:2: rule__Process__Group_7__3__Impl rule__Process__Group_7__4
            {
            pushFollow(FOLLOW_8);
            rule__Process__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_7__3"


    // $ANTLR start "rule__Process__Group_7__3__Impl"
    // InternalMyDsl.g:2638:1: rule__Process__Group_7__3__Impl : ( ( rule__Process__Group_7_3__0 )* ) ;
    public final void rule__Process__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2642:1: ( ( ( rule__Process__Group_7_3__0 )* ) )
            // InternalMyDsl.g:2643:1: ( ( rule__Process__Group_7_3__0 )* )
            {
            // InternalMyDsl.g:2643:1: ( ( rule__Process__Group_7_3__0 )* )
            // InternalMyDsl.g:2644:2: ( rule__Process__Group_7_3__0 )*
            {
             before(grammarAccess.getProcessAccess().getGroup_7_3()); 
            // InternalMyDsl.g:2645:2: ( rule__Process__Group_7_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==27) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:2645:3: rule__Process__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Process__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_7__3__Impl"


    // $ANTLR start "rule__Process__Group_7__4"
    // InternalMyDsl.g:2653:1: rule__Process__Group_7__4 : rule__Process__Group_7__4__Impl ;
    public final void rule__Process__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2657:1: ( rule__Process__Group_7__4__Impl )
            // InternalMyDsl.g:2658:2: rule__Process__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_7__4"


    // $ANTLR start "rule__Process__Group_7__4__Impl"
    // InternalMyDsl.g:2664:1: rule__Process__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Process__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2668:1: ( ( '}' ) )
            // InternalMyDsl.g:2669:1: ( '}' )
            {
            // InternalMyDsl.g:2669:1: ( '}' )
            // InternalMyDsl.g:2670:2: '}'
            {
             before(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_7__4__Impl"


    // $ANTLR start "rule__Process__Group_7_3__0"
    // InternalMyDsl.g:2680:1: rule__Process__Group_7_3__0 : rule__Process__Group_7_3__0__Impl rule__Process__Group_7_3__1 ;
    public final void rule__Process__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2684:1: ( rule__Process__Group_7_3__0__Impl rule__Process__Group_7_3__1 )
            // InternalMyDsl.g:2685:2: rule__Process__Group_7_3__0__Impl rule__Process__Group_7_3__1
            {
            pushFollow(FOLLOW_17);
            rule__Process__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_7_3__0"


    // $ANTLR start "rule__Process__Group_7_3__0__Impl"
    // InternalMyDsl.g:2692:1: rule__Process__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Process__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2696:1: ( ( ',' ) )
            // InternalMyDsl.g:2697:1: ( ',' )
            {
            // InternalMyDsl.g:2697:1: ( ',' )
            // InternalMyDsl.g:2698:2: ','
            {
             before(grammarAccess.getProcessAccess().getCommaKeyword_7_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_7_3__0__Impl"


    // $ANTLR start "rule__Process__Group_7_3__1"
    // InternalMyDsl.g:2707:1: rule__Process__Group_7_3__1 : rule__Process__Group_7_3__1__Impl ;
    public final void rule__Process__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2711:1: ( rule__Process__Group_7_3__1__Impl )
            // InternalMyDsl.g:2712:2: rule__Process__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_7_3__1"


    // $ANTLR start "rule__Process__Group_7_3__1__Impl"
    // InternalMyDsl.g:2718:1: rule__Process__Group_7_3__1__Impl : ( ( rule__Process__ActivitysetAssignment_7_3_1 ) ) ;
    public final void rule__Process__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2722:1: ( ( ( rule__Process__ActivitysetAssignment_7_3_1 ) ) )
            // InternalMyDsl.g:2723:1: ( ( rule__Process__ActivitysetAssignment_7_3_1 ) )
            {
            // InternalMyDsl.g:2723:1: ( ( rule__Process__ActivitysetAssignment_7_3_1 ) )
            // InternalMyDsl.g:2724:2: ( rule__Process__ActivitysetAssignment_7_3_1 )
            {
             before(grammarAccess.getProcessAccess().getActivitysetAssignment_7_3_1()); 
            // InternalMyDsl.g:2725:2: ( rule__Process__ActivitysetAssignment_7_3_1 )
            // InternalMyDsl.g:2725:3: rule__Process__ActivitysetAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Process__ActivitysetAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getActivitysetAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_7_3__1__Impl"


    // $ANTLR start "rule__MessageFlow__Group__0"
    // InternalMyDsl.g:2734:1: rule__MessageFlow__Group__0 : rule__MessageFlow__Group__0__Impl rule__MessageFlow__Group__1 ;
    public final void rule__MessageFlow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2738:1: ( rule__MessageFlow__Group__0__Impl rule__MessageFlow__Group__1 )
            // InternalMyDsl.g:2739:2: rule__MessageFlow__Group__0__Impl rule__MessageFlow__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__MessageFlow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageFlow__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFlow__Group__0"


    // $ANTLR start "rule__MessageFlow__Group__0__Impl"
    // InternalMyDsl.g:2746:1: rule__MessageFlow__Group__0__Impl : ( () ) ;
    public final void rule__MessageFlow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2750:1: ( ( () ) )
            // InternalMyDsl.g:2751:1: ( () )
            {
            // InternalMyDsl.g:2751:1: ( () )
            // InternalMyDsl.g:2752:2: ()
            {
             before(grammarAccess.getMessageFlowAccess().getMessageFlowAction_0()); 
            // InternalMyDsl.g:2753:2: ()
            // InternalMyDsl.g:2753:3: 
            {
            }

             after(grammarAccess.getMessageFlowAccess().getMessageFlowAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFlow__Group__0__Impl"


    // $ANTLR start "rule__MessageFlow__Group__1"
    // InternalMyDsl.g:2761:1: rule__MessageFlow__Group__1 : rule__MessageFlow__Group__1__Impl rule__MessageFlow__Group__2 ;
    public final void rule__MessageFlow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2765:1: ( rule__MessageFlow__Group__1__Impl rule__MessageFlow__Group__2 )
            // InternalMyDsl.g:2766:2: rule__MessageFlow__Group__1__Impl rule__MessageFlow__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__MessageFlow__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageFlow__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFlow__Group__1"


    // $ANTLR start "rule__MessageFlow__Group__1__Impl"
    // InternalMyDsl.g:2773:1: rule__MessageFlow__Group__1__Impl : ( 'MessageFlow' ) ;
    public final void rule__MessageFlow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2777:1: ( ( 'MessageFlow' ) )
            // InternalMyDsl.g:2778:1: ( 'MessageFlow' )
            {
            // InternalMyDsl.g:2778:1: ( 'MessageFlow' )
            // InternalMyDsl.g:2779:2: 'MessageFlow'
            {
             before(grammarAccess.getMessageFlowAccess().getMessageFlowKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getMessageFlowAccess().getMessageFlowKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFlow__Group__1__Impl"


    // $ANTLR start "rule__MessageFlow__Group__2"
    // InternalMyDsl.g:2788:1: rule__MessageFlow__Group__2 : rule__MessageFlow__Group__2__Impl rule__MessageFlow__Group__3 ;
    public final void rule__MessageFlow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2792:1: ( rule__MessageFlow__Group__2__Impl rule__MessageFlow__Group__3 )
            // InternalMyDsl.g:2793:2: rule__MessageFlow__Group__2__Impl rule__MessageFlow__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__MessageFlow__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageFlow__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFlow__Group__2"


    // $ANTLR start "rule__MessageFlow__Group__2__Impl"
    // InternalMyDsl.g:2800:1: rule__MessageFlow__Group__2__Impl : ( '{' ) ;
    public final void rule__MessageFlow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2804:1: ( ( '{' ) )
            // InternalMyDsl.g:2805:1: ( '{' )
            {
            // InternalMyDsl.g:2805:1: ( '{' )
            // InternalMyDsl.g:2806:2: '{'
            {
             before(grammarAccess.getMessageFlowAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMessageFlowAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFlow__Group__2__Impl"


    // $ANTLR start "rule__MessageFlow__Group__3"
    // InternalMyDsl.g:2815:1: rule__MessageFlow__Group__3 : rule__MessageFlow__Group__3__Impl rule__MessageFlow__Group__4 ;
    public final void rule__MessageFlow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2819:1: ( rule__MessageFlow__Group__3__Impl rule__MessageFlow__Group__4 )
            // InternalMyDsl.g:2820:2: rule__MessageFlow__Group__3__Impl rule__MessageFlow__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__MessageFlow__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageFlow__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFlow__Group__3"


    // $ANTLR start "rule__MessageFlow__Group__3__Impl"
    // InternalMyDsl.g:2827:1: rule__MessageFlow__Group__3__Impl : ( ( rule__MessageFlow__Group_3__0 )? ) ;
    public final void rule__MessageFlow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2831:1: ( ( ( rule__MessageFlow__Group_3__0 )? ) )
            // InternalMyDsl.g:2832:1: ( ( rule__MessageFlow__Group_3__0 )? )
            {
            // InternalMyDsl.g:2832:1: ( ( rule__MessageFlow__Group_3__0 )? )
            // InternalMyDsl.g:2833:2: ( rule__MessageFlow__Group_3__0 )?
            {
             before(grammarAccess.getMessageFlowAccess().getGroup_3()); 
            // InternalMyDsl.g:2834:2: ( rule__MessageFlow__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:2834:3: rule__MessageFlow__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MessageFlow__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMessageFlowAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFlow__Group__3__Impl"


    // $ANTLR start "rule__MessageFlow__Group__4"
    // InternalMyDsl.g:2842:1: rule__MessageFlow__Group__4 : rule__MessageFlow__Group__4__Impl rule__MessageFlow__Group__5 ;
    public final void rule__MessageFlow__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2846:1: ( rule__MessageFlow__Group__4__Impl rule__MessageFlow__Group__5 )
            // InternalMyDsl.g:2847:2: rule__MessageFlow__Group__4__Impl rule__MessageFlow__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__MessageFlow__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageFlow__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFlow__Group__4"


    // $ANTLR start "rule__MessageFlow__Group__4__Impl"
    // InternalMyDsl.g:2854:1: rule__MessageFlow__Group__4__Impl : ( ( rule__MessageFlow__Group_4__0 )? ) ;
    public final void rule__MessageFlow__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2858:1: ( ( ( rule__MessageFlow__Group_4__0 )? ) )
            // InternalMyDsl.g:2859:1: ( ( rule__MessageFlow__Group_4__0 )? )
            {
            // InternalMyDsl.g:2859:1: ( ( rule__MessageFlow__Group_4__0 )? )
            // InternalMyDsl.g:2860:2: ( rule__MessageFlow__Group_4__0 )?
            {
             before(grammarAccess.getMessageFlowAccess().getGroup_4()); 
            // InternalMyDsl.g:2861:2: ( rule__MessageFlow__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:2861:3: rule__MessageFlow__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MessageFlow__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMessageFlowAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFlow__Group__4__Impl"


    // $ANTLR start "rule__MessageFlow__Group__5"
    // InternalMyDsl.g:2869:1: rule__MessageFlow__Group__5 : rule__MessageFlow__Group__5__Impl ;
    public final void rule__MessageFlow__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2873:1: ( rule__MessageFlow__Group__5__Impl )
            // InternalMyDsl.g:2874:2: rule__MessageFlow__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MessageFlow__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFlow__Group__5"


    // $ANTLR start "rule__MessageFlow__Group__5__Impl"
    // InternalMyDsl.g:2880:1: rule__MessageFlow__Group__5__Impl : ( '}' ) ;
    public final void rule__MessageFlow__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2884:1: ( ( '}' ) )
            // InternalMyDsl.g:2885:1: ( '}' )
            {
            // InternalMyDsl.g:2885:1: ( '}' )
            // InternalMyDsl.g:2886:2: '}'
            {
             before(grammarAccess.getMessageFlowAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMessageFlowAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFlow__Group__5__Impl"


    // $ANTLR start "rule__MessageFlow__Group_3__0"
    // InternalMyDsl.g:2896:1: rule__MessageFlow__Group_3__0 : rule__MessageFlow__Group_3__0__Impl rule__MessageFlow__Group_3__1 ;
    public final void rule__MessageFlow__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2900:1: ( rule__MessageFlow__Group_3__0__Impl rule__MessageFlow__Group_3__1 )
            // InternalMyDsl.g:2901:2: rule__MessageFlow__Group_3__0__Impl rule__MessageFlow__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__MessageFlow__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageFlow__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFlow__Group_3__0"


    // $ANTLR start "rule__MessageFlow__Group_3__0__Impl"
    // InternalMyDsl.g:2908:1: rule__MessageFlow__Group_3__0__Impl : ( 'source' ) ;
    public final void rule__MessageFlow__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2912:1: ( ( 'source' ) )
            // InternalMyDsl.g:2913:1: ( 'source' )
            {
            // InternalMyDsl.g:2913:1: ( 'source' )
            // InternalMyDsl.g:2914:2: 'source'
            {
             before(grammarAccess.getMessageFlowAccess().getSourceKeyword_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMessageFlowAccess().getSourceKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFlow__Group_3__0__Impl"


    // $ANTLR start "rule__MessageFlow__Group_3__1"
    // InternalMyDsl.g:2923:1: rule__MessageFlow__Group_3__1 : rule__MessageFlow__Group_3__1__Impl ;
    public final void rule__MessageFlow__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2927:1: ( rule__MessageFlow__Group_3__1__Impl )
            // InternalMyDsl.g:2928:2: rule__MessageFlow__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MessageFlow__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFlow__Group_3__1"


    // $ANTLR start "rule__MessageFlow__Group_3__1__Impl"
    // InternalMyDsl.g:2934:1: rule__MessageFlow__Group_3__1__Impl : ( ( rule__MessageFlow__SourceAssignment_3_1 ) ) ;
    public final void rule__MessageFlow__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2938:1: ( ( ( rule__MessageFlow__SourceAssignment_3_1 ) ) )
            // InternalMyDsl.g:2939:1: ( ( rule__MessageFlow__SourceAssignment_3_1 ) )
            {
            // InternalMyDsl.g:2939:1: ( ( rule__MessageFlow__SourceAssignment_3_1 ) )
            // InternalMyDsl.g:2940:2: ( rule__MessageFlow__SourceAssignment_3_1 )
            {
             before(grammarAccess.getMessageFlowAccess().getSourceAssignment_3_1()); 
            // InternalMyDsl.g:2941:2: ( rule__MessageFlow__SourceAssignment_3_1 )
            // InternalMyDsl.g:2941:3: rule__MessageFlow__SourceAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__MessageFlow__SourceAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMessageFlowAccess().getSourceAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFlow__Group_3__1__Impl"


    // $ANTLR start "rule__MessageFlow__Group_4__0"
    // InternalMyDsl.g:2950:1: rule__MessageFlow__Group_4__0 : rule__MessageFlow__Group_4__0__Impl rule__MessageFlow__Group_4__1 ;
    public final void rule__MessageFlow__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2954:1: ( rule__MessageFlow__Group_4__0__Impl rule__MessageFlow__Group_4__1 )
            // InternalMyDsl.g:2955:2: rule__MessageFlow__Group_4__0__Impl rule__MessageFlow__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__MessageFlow__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageFlow__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFlow__Group_4__0"


    // $ANTLR start "rule__MessageFlow__Group_4__0__Impl"
    // InternalMyDsl.g:2962:1: rule__MessageFlow__Group_4__0__Impl : ( 'target' ) ;
    public final void rule__MessageFlow__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2966:1: ( ( 'target' ) )
            // InternalMyDsl.g:2967:1: ( 'target' )
            {
            // InternalMyDsl.g:2967:1: ( 'target' )
            // InternalMyDsl.g:2968:2: 'target'
            {
             before(grammarAccess.getMessageFlowAccess().getTargetKeyword_4_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getMessageFlowAccess().getTargetKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFlow__Group_4__0__Impl"


    // $ANTLR start "rule__MessageFlow__Group_4__1"
    // InternalMyDsl.g:2977:1: rule__MessageFlow__Group_4__1 : rule__MessageFlow__Group_4__1__Impl ;
    public final void rule__MessageFlow__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2981:1: ( rule__MessageFlow__Group_4__1__Impl )
            // InternalMyDsl.g:2982:2: rule__MessageFlow__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MessageFlow__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFlow__Group_4__1"


    // $ANTLR start "rule__MessageFlow__Group_4__1__Impl"
    // InternalMyDsl.g:2988:1: rule__MessageFlow__Group_4__1__Impl : ( ( rule__MessageFlow__TargetAssignment_4_1 ) ) ;
    public final void rule__MessageFlow__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2992:1: ( ( ( rule__MessageFlow__TargetAssignment_4_1 ) ) )
            // InternalMyDsl.g:2993:1: ( ( rule__MessageFlow__TargetAssignment_4_1 ) )
            {
            // InternalMyDsl.g:2993:1: ( ( rule__MessageFlow__TargetAssignment_4_1 ) )
            // InternalMyDsl.g:2994:2: ( rule__MessageFlow__TargetAssignment_4_1 )
            {
             before(grammarAccess.getMessageFlowAccess().getTargetAssignment_4_1()); 
            // InternalMyDsl.g:2995:2: ( rule__MessageFlow__TargetAssignment_4_1 )
            // InternalMyDsl.g:2995:3: rule__MessageFlow__TargetAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__MessageFlow__TargetAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMessageFlowAccess().getTargetAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFlow__Group_4__1__Impl"


    // $ANTLR start "rule__Pool__Group__0"
    // InternalMyDsl.g:3004:1: rule__Pool__Group__0 : rule__Pool__Group__0__Impl rule__Pool__Group__1 ;
    public final void rule__Pool__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3008:1: ( rule__Pool__Group__0__Impl rule__Pool__Group__1 )
            // InternalMyDsl.g:3009:2: rule__Pool__Group__0__Impl rule__Pool__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Pool__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pool__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group__0"


    // $ANTLR start "rule__Pool__Group__0__Impl"
    // InternalMyDsl.g:3016:1: rule__Pool__Group__0__Impl : ( 'Pool' ) ;
    public final void rule__Pool__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3020:1: ( ( 'Pool' ) )
            // InternalMyDsl.g:3021:1: ( 'Pool' )
            {
            // InternalMyDsl.g:3021:1: ( 'Pool' )
            // InternalMyDsl.g:3022:2: 'Pool'
            {
             before(grammarAccess.getPoolAccess().getPoolKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getPoolAccess().getPoolKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group__0__Impl"


    // $ANTLR start "rule__Pool__Group__1"
    // InternalMyDsl.g:3031:1: rule__Pool__Group__1 : rule__Pool__Group__1__Impl rule__Pool__Group__2 ;
    public final void rule__Pool__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3035:1: ( rule__Pool__Group__1__Impl rule__Pool__Group__2 )
            // InternalMyDsl.g:3036:2: rule__Pool__Group__1__Impl rule__Pool__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Pool__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pool__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group__1"


    // $ANTLR start "rule__Pool__Group__1__Impl"
    // InternalMyDsl.g:3043:1: rule__Pool__Group__1__Impl : ( ( rule__Pool__IdAssignment_1 ) ) ;
    public final void rule__Pool__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3047:1: ( ( ( rule__Pool__IdAssignment_1 ) ) )
            // InternalMyDsl.g:3048:1: ( ( rule__Pool__IdAssignment_1 ) )
            {
            // InternalMyDsl.g:3048:1: ( ( rule__Pool__IdAssignment_1 ) )
            // InternalMyDsl.g:3049:2: ( rule__Pool__IdAssignment_1 )
            {
             before(grammarAccess.getPoolAccess().getIdAssignment_1()); 
            // InternalMyDsl.g:3050:2: ( rule__Pool__IdAssignment_1 )
            // InternalMyDsl.g:3050:3: rule__Pool__IdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Pool__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPoolAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group__1__Impl"


    // $ANTLR start "rule__Pool__Group__2"
    // InternalMyDsl.g:3058:1: rule__Pool__Group__2 : rule__Pool__Group__2__Impl rule__Pool__Group__3 ;
    public final void rule__Pool__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3062:1: ( rule__Pool__Group__2__Impl rule__Pool__Group__3 )
            // InternalMyDsl.g:3063:2: rule__Pool__Group__2__Impl rule__Pool__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Pool__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pool__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group__2"


    // $ANTLR start "rule__Pool__Group__2__Impl"
    // InternalMyDsl.g:3070:1: rule__Pool__Group__2__Impl : ( '{' ) ;
    public final void rule__Pool__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3074:1: ( ( '{' ) )
            // InternalMyDsl.g:3075:1: ( '{' )
            {
            // InternalMyDsl.g:3075:1: ( '{' )
            // InternalMyDsl.g:3076:2: '{'
            {
             before(grammarAccess.getPoolAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPoolAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group__2__Impl"


    // $ANTLR start "rule__Pool__Group__3"
    // InternalMyDsl.g:3085:1: rule__Pool__Group__3 : rule__Pool__Group__3__Impl rule__Pool__Group__4 ;
    public final void rule__Pool__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3089:1: ( rule__Pool__Group__3__Impl rule__Pool__Group__4 )
            // InternalMyDsl.g:3090:2: rule__Pool__Group__3__Impl rule__Pool__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Pool__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pool__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group__3"


    // $ANTLR start "rule__Pool__Group__3__Impl"
    // InternalMyDsl.g:3097:1: rule__Pool__Group__3__Impl : ( ( rule__Pool__Group_3__0 )? ) ;
    public final void rule__Pool__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3101:1: ( ( ( rule__Pool__Group_3__0 )? ) )
            // InternalMyDsl.g:3102:1: ( ( rule__Pool__Group_3__0 )? )
            {
            // InternalMyDsl.g:3102:1: ( ( rule__Pool__Group_3__0 )? )
            // InternalMyDsl.g:3103:2: ( rule__Pool__Group_3__0 )?
            {
             before(grammarAccess.getPoolAccess().getGroup_3()); 
            // InternalMyDsl.g:3104:2: ( rule__Pool__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:3104:3: rule__Pool__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pool__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPoolAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group__3__Impl"


    // $ANTLR start "rule__Pool__Group__4"
    // InternalMyDsl.g:3112:1: rule__Pool__Group__4 : rule__Pool__Group__4__Impl rule__Pool__Group__5 ;
    public final void rule__Pool__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3116:1: ( rule__Pool__Group__4__Impl rule__Pool__Group__5 )
            // InternalMyDsl.g:3117:2: rule__Pool__Group__4__Impl rule__Pool__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Pool__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pool__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group__4"


    // $ANTLR start "rule__Pool__Group__4__Impl"
    // InternalMyDsl.g:3124:1: rule__Pool__Group__4__Impl : ( 'lanes' ) ;
    public final void rule__Pool__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3128:1: ( ( 'lanes' ) )
            // InternalMyDsl.g:3129:1: ( 'lanes' )
            {
            // InternalMyDsl.g:3129:1: ( 'lanes' )
            // InternalMyDsl.g:3130:2: 'lanes'
            {
             before(grammarAccess.getPoolAccess().getLanesKeyword_4()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getPoolAccess().getLanesKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group__4__Impl"


    // $ANTLR start "rule__Pool__Group__5"
    // InternalMyDsl.g:3139:1: rule__Pool__Group__5 : rule__Pool__Group__5__Impl rule__Pool__Group__6 ;
    public final void rule__Pool__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3143:1: ( rule__Pool__Group__5__Impl rule__Pool__Group__6 )
            // InternalMyDsl.g:3144:2: rule__Pool__Group__5__Impl rule__Pool__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__Pool__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pool__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group__5"


    // $ANTLR start "rule__Pool__Group__5__Impl"
    // InternalMyDsl.g:3151:1: rule__Pool__Group__5__Impl : ( '{' ) ;
    public final void rule__Pool__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3155:1: ( ( '{' ) )
            // InternalMyDsl.g:3156:1: ( '{' )
            {
            // InternalMyDsl.g:3156:1: ( '{' )
            // InternalMyDsl.g:3157:2: '{'
            {
             before(grammarAccess.getPoolAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPoolAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group__5__Impl"


    // $ANTLR start "rule__Pool__Group__6"
    // InternalMyDsl.g:3166:1: rule__Pool__Group__6 : rule__Pool__Group__6__Impl rule__Pool__Group__7 ;
    public final void rule__Pool__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3170:1: ( rule__Pool__Group__6__Impl rule__Pool__Group__7 )
            // InternalMyDsl.g:3171:2: rule__Pool__Group__6__Impl rule__Pool__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Pool__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pool__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group__6"


    // $ANTLR start "rule__Pool__Group__6__Impl"
    // InternalMyDsl.g:3178:1: rule__Pool__Group__6__Impl : ( ( rule__Pool__LanesAssignment_6 ) ) ;
    public final void rule__Pool__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3182:1: ( ( ( rule__Pool__LanesAssignment_6 ) ) )
            // InternalMyDsl.g:3183:1: ( ( rule__Pool__LanesAssignment_6 ) )
            {
            // InternalMyDsl.g:3183:1: ( ( rule__Pool__LanesAssignment_6 ) )
            // InternalMyDsl.g:3184:2: ( rule__Pool__LanesAssignment_6 )
            {
             before(grammarAccess.getPoolAccess().getLanesAssignment_6()); 
            // InternalMyDsl.g:3185:2: ( rule__Pool__LanesAssignment_6 )
            // InternalMyDsl.g:3185:3: rule__Pool__LanesAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Pool__LanesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPoolAccess().getLanesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group__6__Impl"


    // $ANTLR start "rule__Pool__Group__7"
    // InternalMyDsl.g:3193:1: rule__Pool__Group__7 : rule__Pool__Group__7__Impl rule__Pool__Group__8 ;
    public final void rule__Pool__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3197:1: ( rule__Pool__Group__7__Impl rule__Pool__Group__8 )
            // InternalMyDsl.g:3198:2: rule__Pool__Group__7__Impl rule__Pool__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Pool__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pool__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group__7"


    // $ANTLR start "rule__Pool__Group__7__Impl"
    // InternalMyDsl.g:3205:1: rule__Pool__Group__7__Impl : ( ( rule__Pool__Group_7__0 )* ) ;
    public final void rule__Pool__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3209:1: ( ( ( rule__Pool__Group_7__0 )* ) )
            // InternalMyDsl.g:3210:1: ( ( rule__Pool__Group_7__0 )* )
            {
            // InternalMyDsl.g:3210:1: ( ( rule__Pool__Group_7__0 )* )
            // InternalMyDsl.g:3211:2: ( rule__Pool__Group_7__0 )*
            {
             before(grammarAccess.getPoolAccess().getGroup_7()); 
            // InternalMyDsl.g:3212:2: ( rule__Pool__Group_7__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==27) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMyDsl.g:3212:3: rule__Pool__Group_7__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Pool__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getPoolAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group__7__Impl"


    // $ANTLR start "rule__Pool__Group__8"
    // InternalMyDsl.g:3220:1: rule__Pool__Group__8 : rule__Pool__Group__8__Impl rule__Pool__Group__9 ;
    public final void rule__Pool__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3224:1: ( rule__Pool__Group__8__Impl rule__Pool__Group__9 )
            // InternalMyDsl.g:3225:2: rule__Pool__Group__8__Impl rule__Pool__Group__9
            {
            pushFollow(FOLLOW_14);
            rule__Pool__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pool__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group__8"


    // $ANTLR start "rule__Pool__Group__8__Impl"
    // InternalMyDsl.g:3232:1: rule__Pool__Group__8__Impl : ( '}' ) ;
    public final void rule__Pool__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3236:1: ( ( '}' ) )
            // InternalMyDsl.g:3237:1: ( '}' )
            {
            // InternalMyDsl.g:3237:1: ( '}' )
            // InternalMyDsl.g:3238:2: '}'
            {
             before(grammarAccess.getPoolAccess().getRightCurlyBracketKeyword_8()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPoolAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group__8__Impl"


    // $ANTLR start "rule__Pool__Group__9"
    // InternalMyDsl.g:3247:1: rule__Pool__Group__9 : rule__Pool__Group__9__Impl ;
    public final void rule__Pool__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3251:1: ( rule__Pool__Group__9__Impl )
            // InternalMyDsl.g:3252:2: rule__Pool__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pool__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group__9"


    // $ANTLR start "rule__Pool__Group__9__Impl"
    // InternalMyDsl.g:3258:1: rule__Pool__Group__9__Impl : ( '}' ) ;
    public final void rule__Pool__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3262:1: ( ( '}' ) )
            // InternalMyDsl.g:3263:1: ( '}' )
            {
            // InternalMyDsl.g:3263:1: ( '}' )
            // InternalMyDsl.g:3264:2: '}'
            {
             before(grammarAccess.getPoolAccess().getRightCurlyBracketKeyword_9()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPoolAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group__9__Impl"


    // $ANTLR start "rule__Pool__Group_3__0"
    // InternalMyDsl.g:3274:1: rule__Pool__Group_3__0 : rule__Pool__Group_3__0__Impl rule__Pool__Group_3__1 ;
    public final void rule__Pool__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3278:1: ( rule__Pool__Group_3__0__Impl rule__Pool__Group_3__1 )
            // InternalMyDsl.g:3279:2: rule__Pool__Group_3__0__Impl rule__Pool__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Pool__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pool__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group_3__0"


    // $ANTLR start "rule__Pool__Group_3__0__Impl"
    // InternalMyDsl.g:3286:1: rule__Pool__Group_3__0__Impl : ( 'name' ) ;
    public final void rule__Pool__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3290:1: ( ( 'name' ) )
            // InternalMyDsl.g:3291:1: ( 'name' )
            {
            // InternalMyDsl.g:3291:1: ( 'name' )
            // InternalMyDsl.g:3292:2: 'name'
            {
             before(grammarAccess.getPoolAccess().getNameKeyword_3_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPoolAccess().getNameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group_3__0__Impl"


    // $ANTLR start "rule__Pool__Group_3__1"
    // InternalMyDsl.g:3301:1: rule__Pool__Group_3__1 : rule__Pool__Group_3__1__Impl ;
    public final void rule__Pool__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3305:1: ( rule__Pool__Group_3__1__Impl )
            // InternalMyDsl.g:3306:2: rule__Pool__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pool__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group_3__1"


    // $ANTLR start "rule__Pool__Group_3__1__Impl"
    // InternalMyDsl.g:3312:1: rule__Pool__Group_3__1__Impl : ( ( rule__Pool__NameAssignment_3_1 ) ) ;
    public final void rule__Pool__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3316:1: ( ( ( rule__Pool__NameAssignment_3_1 ) ) )
            // InternalMyDsl.g:3317:1: ( ( rule__Pool__NameAssignment_3_1 ) )
            {
            // InternalMyDsl.g:3317:1: ( ( rule__Pool__NameAssignment_3_1 ) )
            // InternalMyDsl.g:3318:2: ( rule__Pool__NameAssignment_3_1 )
            {
             before(grammarAccess.getPoolAccess().getNameAssignment_3_1()); 
            // InternalMyDsl.g:3319:2: ( rule__Pool__NameAssignment_3_1 )
            // InternalMyDsl.g:3319:3: rule__Pool__NameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Pool__NameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPoolAccess().getNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group_3__1__Impl"


    // $ANTLR start "rule__Pool__Group_7__0"
    // InternalMyDsl.g:3328:1: rule__Pool__Group_7__0 : rule__Pool__Group_7__0__Impl rule__Pool__Group_7__1 ;
    public final void rule__Pool__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3332:1: ( rule__Pool__Group_7__0__Impl rule__Pool__Group_7__1 )
            // InternalMyDsl.g:3333:2: rule__Pool__Group_7__0__Impl rule__Pool__Group_7__1
            {
            pushFollow(FOLLOW_20);
            rule__Pool__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pool__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group_7__0"


    // $ANTLR start "rule__Pool__Group_7__0__Impl"
    // InternalMyDsl.g:3340:1: rule__Pool__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Pool__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3344:1: ( ( ',' ) )
            // InternalMyDsl.g:3345:1: ( ',' )
            {
            // InternalMyDsl.g:3345:1: ( ',' )
            // InternalMyDsl.g:3346:2: ','
            {
             before(grammarAccess.getPoolAccess().getCommaKeyword_7_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPoolAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group_7__0__Impl"


    // $ANTLR start "rule__Pool__Group_7__1"
    // InternalMyDsl.g:3355:1: rule__Pool__Group_7__1 : rule__Pool__Group_7__1__Impl ;
    public final void rule__Pool__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3359:1: ( rule__Pool__Group_7__1__Impl )
            // InternalMyDsl.g:3360:2: rule__Pool__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pool__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group_7__1"


    // $ANTLR start "rule__Pool__Group_7__1__Impl"
    // InternalMyDsl.g:3366:1: rule__Pool__Group_7__1__Impl : ( ( rule__Pool__LanesAssignment_7_1 ) ) ;
    public final void rule__Pool__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3370:1: ( ( ( rule__Pool__LanesAssignment_7_1 ) ) )
            // InternalMyDsl.g:3371:1: ( ( rule__Pool__LanesAssignment_7_1 ) )
            {
            // InternalMyDsl.g:3371:1: ( ( rule__Pool__LanesAssignment_7_1 ) )
            // InternalMyDsl.g:3372:2: ( rule__Pool__LanesAssignment_7_1 )
            {
             before(grammarAccess.getPoolAccess().getLanesAssignment_7_1()); 
            // InternalMyDsl.g:3373:2: ( rule__Pool__LanesAssignment_7_1 )
            // InternalMyDsl.g:3373:3: rule__Pool__LanesAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Pool__LanesAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getPoolAccess().getLanesAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group_7__1__Impl"


    // $ANTLR start "rule__Lane__Group__0"
    // InternalMyDsl.g:3382:1: rule__Lane__Group__0 : rule__Lane__Group__0__Impl rule__Lane__Group__1 ;
    public final void rule__Lane__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3386:1: ( rule__Lane__Group__0__Impl rule__Lane__Group__1 )
            // InternalMyDsl.g:3387:2: rule__Lane__Group__0__Impl rule__Lane__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Lane__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lane__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__Group__0"


    // $ANTLR start "rule__Lane__Group__0__Impl"
    // InternalMyDsl.g:3394:1: rule__Lane__Group__0__Impl : ( () ) ;
    public final void rule__Lane__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3398:1: ( ( () ) )
            // InternalMyDsl.g:3399:1: ( () )
            {
            // InternalMyDsl.g:3399:1: ( () )
            // InternalMyDsl.g:3400:2: ()
            {
             before(grammarAccess.getLaneAccess().getLaneAction_0()); 
            // InternalMyDsl.g:3401:2: ()
            // InternalMyDsl.g:3401:3: 
            {
            }

             after(grammarAccess.getLaneAccess().getLaneAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__Group__0__Impl"


    // $ANTLR start "rule__Lane__Group__1"
    // InternalMyDsl.g:3409:1: rule__Lane__Group__1 : rule__Lane__Group__1__Impl rule__Lane__Group__2 ;
    public final void rule__Lane__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3413:1: ( rule__Lane__Group__1__Impl rule__Lane__Group__2 )
            // InternalMyDsl.g:3414:2: rule__Lane__Group__1__Impl rule__Lane__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Lane__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lane__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__Group__1"


    // $ANTLR start "rule__Lane__Group__1__Impl"
    // InternalMyDsl.g:3421:1: rule__Lane__Group__1__Impl : ( 'Lane' ) ;
    public final void rule__Lane__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3425:1: ( ( 'Lane' ) )
            // InternalMyDsl.g:3426:1: ( 'Lane' )
            {
            // InternalMyDsl.g:3426:1: ( 'Lane' )
            // InternalMyDsl.g:3427:2: 'Lane'
            {
             before(grammarAccess.getLaneAccess().getLaneKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getLaneAccess().getLaneKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__Group__1__Impl"


    // $ANTLR start "rule__Lane__Group__2"
    // InternalMyDsl.g:3436:1: rule__Lane__Group__2 : rule__Lane__Group__2__Impl rule__Lane__Group__3 ;
    public final void rule__Lane__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3440:1: ( rule__Lane__Group__2__Impl rule__Lane__Group__3 )
            // InternalMyDsl.g:3441:2: rule__Lane__Group__2__Impl rule__Lane__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Lane__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lane__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__Group__2"


    // $ANTLR start "rule__Lane__Group__2__Impl"
    // InternalMyDsl.g:3448:1: rule__Lane__Group__2__Impl : ( ( rule__Lane__IdAssignment_2 ) ) ;
    public final void rule__Lane__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3452:1: ( ( ( rule__Lane__IdAssignment_2 ) ) )
            // InternalMyDsl.g:3453:1: ( ( rule__Lane__IdAssignment_2 ) )
            {
            // InternalMyDsl.g:3453:1: ( ( rule__Lane__IdAssignment_2 ) )
            // InternalMyDsl.g:3454:2: ( rule__Lane__IdAssignment_2 )
            {
             before(grammarAccess.getLaneAccess().getIdAssignment_2()); 
            // InternalMyDsl.g:3455:2: ( rule__Lane__IdAssignment_2 )
            // InternalMyDsl.g:3455:3: rule__Lane__IdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Lane__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLaneAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__Group__2__Impl"


    // $ANTLR start "rule__Lane__Group__3"
    // InternalMyDsl.g:3463:1: rule__Lane__Group__3 : rule__Lane__Group__3__Impl rule__Lane__Group__4 ;
    public final void rule__Lane__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3467:1: ( rule__Lane__Group__3__Impl rule__Lane__Group__4 )
            // InternalMyDsl.g:3468:2: rule__Lane__Group__3__Impl rule__Lane__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Lane__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lane__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__Group__3"


    // $ANTLR start "rule__Lane__Group__3__Impl"
    // InternalMyDsl.g:3475:1: rule__Lane__Group__3__Impl : ( '{' ) ;
    public final void rule__Lane__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3479:1: ( ( '{' ) )
            // InternalMyDsl.g:3480:1: ( '{' )
            {
            // InternalMyDsl.g:3480:1: ( '{' )
            // InternalMyDsl.g:3481:2: '{'
            {
             before(grammarAccess.getLaneAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLaneAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__Group__3__Impl"


    // $ANTLR start "rule__Lane__Group__4"
    // InternalMyDsl.g:3490:1: rule__Lane__Group__4 : rule__Lane__Group__4__Impl rule__Lane__Group__5 ;
    public final void rule__Lane__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3494:1: ( rule__Lane__Group__4__Impl rule__Lane__Group__5 )
            // InternalMyDsl.g:3495:2: rule__Lane__Group__4__Impl rule__Lane__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Lane__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lane__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__Group__4"


    // $ANTLR start "rule__Lane__Group__4__Impl"
    // InternalMyDsl.g:3502:1: rule__Lane__Group__4__Impl : ( ( rule__Lane__Group_4__0 )? ) ;
    public final void rule__Lane__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3506:1: ( ( ( rule__Lane__Group_4__0 )? ) )
            // InternalMyDsl.g:3507:1: ( ( rule__Lane__Group_4__0 )? )
            {
            // InternalMyDsl.g:3507:1: ( ( rule__Lane__Group_4__0 )? )
            // InternalMyDsl.g:3508:2: ( rule__Lane__Group_4__0 )?
            {
             before(grammarAccess.getLaneAccess().getGroup_4()); 
            // InternalMyDsl.g:3509:2: ( rule__Lane__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==32) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:3509:3: rule__Lane__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Lane__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLaneAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__Group__4__Impl"


    // $ANTLR start "rule__Lane__Group__5"
    // InternalMyDsl.g:3517:1: rule__Lane__Group__5 : rule__Lane__Group__5__Impl rule__Lane__Group__6 ;
    public final void rule__Lane__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3521:1: ( rule__Lane__Group__5__Impl rule__Lane__Group__6 )
            // InternalMyDsl.g:3522:2: rule__Lane__Group__5__Impl rule__Lane__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__Lane__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lane__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__Group__5"


    // $ANTLR start "rule__Lane__Group__5__Impl"
    // InternalMyDsl.g:3529:1: rule__Lane__Group__5__Impl : ( ( rule__Lane__Group_5__0 )? ) ;
    public final void rule__Lane__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3533:1: ( ( ( rule__Lane__Group_5__0 )? ) )
            // InternalMyDsl.g:3534:1: ( ( rule__Lane__Group_5__0 )? )
            {
            // InternalMyDsl.g:3534:1: ( ( rule__Lane__Group_5__0 )? )
            // InternalMyDsl.g:3535:2: ( rule__Lane__Group_5__0 )?
            {
             before(grammarAccess.getLaneAccess().getGroup_5()); 
            // InternalMyDsl.g:3536:2: ( rule__Lane__Group_5__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==36) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:3536:3: rule__Lane__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Lane__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLaneAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__Group__5__Impl"


    // $ANTLR start "rule__Lane__Group__6"
    // InternalMyDsl.g:3544:1: rule__Lane__Group__6 : rule__Lane__Group__6__Impl ;
    public final void rule__Lane__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3548:1: ( rule__Lane__Group__6__Impl )
            // InternalMyDsl.g:3549:2: rule__Lane__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lane__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__Group__6"


    // $ANTLR start "rule__Lane__Group__6__Impl"
    // InternalMyDsl.g:3555:1: rule__Lane__Group__6__Impl : ( '}' ) ;
    public final void rule__Lane__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3559:1: ( ( '}' ) )
            // InternalMyDsl.g:3560:1: ( '}' )
            {
            // InternalMyDsl.g:3560:1: ( '}' )
            // InternalMyDsl.g:3561:2: '}'
            {
             before(grammarAccess.getLaneAccess().getRightCurlyBracketKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLaneAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__Group__6__Impl"


    // $ANTLR start "rule__Lane__Group_4__0"
    // InternalMyDsl.g:3571:1: rule__Lane__Group_4__0 : rule__Lane__Group_4__0__Impl rule__Lane__Group_4__1 ;
    public final void rule__Lane__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3575:1: ( rule__Lane__Group_4__0__Impl rule__Lane__Group_4__1 )
            // InternalMyDsl.g:3576:2: rule__Lane__Group_4__0__Impl rule__Lane__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Lane__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lane__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__Group_4__0"


    // $ANTLR start "rule__Lane__Group_4__0__Impl"
    // InternalMyDsl.g:3583:1: rule__Lane__Group_4__0__Impl : ( 'name' ) ;
    public final void rule__Lane__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3587:1: ( ( 'name' ) )
            // InternalMyDsl.g:3588:1: ( 'name' )
            {
            // InternalMyDsl.g:3588:1: ( 'name' )
            // InternalMyDsl.g:3589:2: 'name'
            {
             before(grammarAccess.getLaneAccess().getNameKeyword_4_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLaneAccess().getNameKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__Group_4__0__Impl"


    // $ANTLR start "rule__Lane__Group_4__1"
    // InternalMyDsl.g:3598:1: rule__Lane__Group_4__1 : rule__Lane__Group_4__1__Impl ;
    public final void rule__Lane__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3602:1: ( rule__Lane__Group_4__1__Impl )
            // InternalMyDsl.g:3603:2: rule__Lane__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lane__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__Group_4__1"


    // $ANTLR start "rule__Lane__Group_4__1__Impl"
    // InternalMyDsl.g:3609:1: rule__Lane__Group_4__1__Impl : ( ( rule__Lane__NameAssignment_4_1 ) ) ;
    public final void rule__Lane__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3613:1: ( ( ( rule__Lane__NameAssignment_4_1 ) ) )
            // InternalMyDsl.g:3614:1: ( ( rule__Lane__NameAssignment_4_1 ) )
            {
            // InternalMyDsl.g:3614:1: ( ( rule__Lane__NameAssignment_4_1 ) )
            // InternalMyDsl.g:3615:2: ( rule__Lane__NameAssignment_4_1 )
            {
             before(grammarAccess.getLaneAccess().getNameAssignment_4_1()); 
            // InternalMyDsl.g:3616:2: ( rule__Lane__NameAssignment_4_1 )
            // InternalMyDsl.g:3616:3: rule__Lane__NameAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Lane__NameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getLaneAccess().getNameAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__Group_4__1__Impl"


    // $ANTLR start "rule__Lane__Group_5__0"
    // InternalMyDsl.g:3625:1: rule__Lane__Group_5__0 : rule__Lane__Group_5__0__Impl rule__Lane__Group_5__1 ;
    public final void rule__Lane__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3629:1: ( rule__Lane__Group_5__0__Impl rule__Lane__Group_5__1 )
            // InternalMyDsl.g:3630:2: rule__Lane__Group_5__0__Impl rule__Lane__Group_5__1
            {
            pushFollow(FOLLOW_17);
            rule__Lane__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lane__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__Group_5__0"


    // $ANTLR start "rule__Lane__Group_5__0__Impl"
    // InternalMyDsl.g:3637:1: rule__Lane__Group_5__0__Impl : ( 'activityset' ) ;
    public final void rule__Lane__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3641:1: ( ( 'activityset' ) )
            // InternalMyDsl.g:3642:1: ( 'activityset' )
            {
            // InternalMyDsl.g:3642:1: ( 'activityset' )
            // InternalMyDsl.g:3643:2: 'activityset'
            {
             before(grammarAccess.getLaneAccess().getActivitysetKeyword_5_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getLaneAccess().getActivitysetKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__Group_5__0__Impl"


    // $ANTLR start "rule__Lane__Group_5__1"
    // InternalMyDsl.g:3652:1: rule__Lane__Group_5__1 : rule__Lane__Group_5__1__Impl ;
    public final void rule__Lane__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3656:1: ( rule__Lane__Group_5__1__Impl )
            // InternalMyDsl.g:3657:2: rule__Lane__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lane__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__Group_5__1"


    // $ANTLR start "rule__Lane__Group_5__1__Impl"
    // InternalMyDsl.g:3663:1: rule__Lane__Group_5__1__Impl : ( ( rule__Lane__ActivitysetAssignment_5_1 ) ) ;
    public final void rule__Lane__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3667:1: ( ( ( rule__Lane__ActivitysetAssignment_5_1 ) ) )
            // InternalMyDsl.g:3668:1: ( ( rule__Lane__ActivitysetAssignment_5_1 ) )
            {
            // InternalMyDsl.g:3668:1: ( ( rule__Lane__ActivitysetAssignment_5_1 ) )
            // InternalMyDsl.g:3669:2: ( rule__Lane__ActivitysetAssignment_5_1 )
            {
             before(grammarAccess.getLaneAccess().getActivitysetAssignment_5_1()); 
            // InternalMyDsl.g:3670:2: ( rule__Lane__ActivitysetAssignment_5_1 )
            // InternalMyDsl.g:3670:3: rule__Lane__ActivitysetAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Lane__ActivitysetAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getLaneAccess().getActivitysetAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__Group_5__1__Impl"


    // $ANTLR start "rule__ActivitySet__Group__0"
    // InternalMyDsl.g:3679:1: rule__ActivitySet__Group__0 : rule__ActivitySet__Group__0__Impl rule__ActivitySet__Group__1 ;
    public final void rule__ActivitySet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3683:1: ( rule__ActivitySet__Group__0__Impl rule__ActivitySet__Group__1 )
            // InternalMyDsl.g:3684:2: rule__ActivitySet__Group__0__Impl rule__ActivitySet__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ActivitySet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivitySet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group__0"


    // $ANTLR start "rule__ActivitySet__Group__0__Impl"
    // InternalMyDsl.g:3691:1: rule__ActivitySet__Group__0__Impl : ( 'ActivitySet' ) ;
    public final void rule__ActivitySet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3695:1: ( ( 'ActivitySet' ) )
            // InternalMyDsl.g:3696:1: ( 'ActivitySet' )
            {
            // InternalMyDsl.g:3696:1: ( 'ActivitySet' )
            // InternalMyDsl.g:3697:2: 'ActivitySet'
            {
             before(grammarAccess.getActivitySetAccess().getActivitySetKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getActivitySetAccess().getActivitySetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group__0__Impl"


    // $ANTLR start "rule__ActivitySet__Group__1"
    // InternalMyDsl.g:3706:1: rule__ActivitySet__Group__1 : rule__ActivitySet__Group__1__Impl rule__ActivitySet__Group__2 ;
    public final void rule__ActivitySet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3710:1: ( rule__ActivitySet__Group__1__Impl rule__ActivitySet__Group__2 )
            // InternalMyDsl.g:3711:2: rule__ActivitySet__Group__1__Impl rule__ActivitySet__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ActivitySet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivitySet__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group__1"


    // $ANTLR start "rule__ActivitySet__Group__1__Impl"
    // InternalMyDsl.g:3718:1: rule__ActivitySet__Group__1__Impl : ( ( rule__ActivitySet__IdAssignment_1 ) ) ;
    public final void rule__ActivitySet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3722:1: ( ( ( rule__ActivitySet__IdAssignment_1 ) ) )
            // InternalMyDsl.g:3723:1: ( ( rule__ActivitySet__IdAssignment_1 ) )
            {
            // InternalMyDsl.g:3723:1: ( ( rule__ActivitySet__IdAssignment_1 ) )
            // InternalMyDsl.g:3724:2: ( rule__ActivitySet__IdAssignment_1 )
            {
             before(grammarAccess.getActivitySetAccess().getIdAssignment_1()); 
            // InternalMyDsl.g:3725:2: ( rule__ActivitySet__IdAssignment_1 )
            // InternalMyDsl.g:3725:3: rule__ActivitySet__IdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ActivitySet__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActivitySetAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group__1__Impl"


    // $ANTLR start "rule__ActivitySet__Group__2"
    // InternalMyDsl.g:3733:1: rule__ActivitySet__Group__2 : rule__ActivitySet__Group__2__Impl rule__ActivitySet__Group__3 ;
    public final void rule__ActivitySet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3737:1: ( rule__ActivitySet__Group__2__Impl rule__ActivitySet__Group__3 )
            // InternalMyDsl.g:3738:2: rule__ActivitySet__Group__2__Impl rule__ActivitySet__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__ActivitySet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivitySet__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group__2"


    // $ANTLR start "rule__ActivitySet__Group__2__Impl"
    // InternalMyDsl.g:3745:1: rule__ActivitySet__Group__2__Impl : ( '{' ) ;
    public final void rule__ActivitySet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3749:1: ( ( '{' ) )
            // InternalMyDsl.g:3750:1: ( '{' )
            {
            // InternalMyDsl.g:3750:1: ( '{' )
            // InternalMyDsl.g:3751:2: '{'
            {
             before(grammarAccess.getActivitySetAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getActivitySetAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group__2__Impl"


    // $ANTLR start "rule__ActivitySet__Group__3"
    // InternalMyDsl.g:3760:1: rule__ActivitySet__Group__3 : rule__ActivitySet__Group__3__Impl rule__ActivitySet__Group__4 ;
    public final void rule__ActivitySet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3764:1: ( rule__ActivitySet__Group__3__Impl rule__ActivitySet__Group__4 )
            // InternalMyDsl.g:3765:2: rule__ActivitySet__Group__3__Impl rule__ActivitySet__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__ActivitySet__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivitySet__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group__3"


    // $ANTLR start "rule__ActivitySet__Group__3__Impl"
    // InternalMyDsl.g:3772:1: rule__ActivitySet__Group__3__Impl : ( ( rule__ActivitySet__Group_3__0 )? ) ;
    public final void rule__ActivitySet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3776:1: ( ( ( rule__ActivitySet__Group_3__0 )? ) )
            // InternalMyDsl.g:3777:1: ( ( rule__ActivitySet__Group_3__0 )? )
            {
            // InternalMyDsl.g:3777:1: ( ( rule__ActivitySet__Group_3__0 )? )
            // InternalMyDsl.g:3778:2: ( rule__ActivitySet__Group_3__0 )?
            {
             before(grammarAccess.getActivitySetAccess().getGroup_3()); 
            // InternalMyDsl.g:3779:2: ( rule__ActivitySet__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==32) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:3779:3: rule__ActivitySet__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActivitySet__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivitySetAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group__3__Impl"


    // $ANTLR start "rule__ActivitySet__Group__4"
    // InternalMyDsl.g:3787:1: rule__ActivitySet__Group__4 : rule__ActivitySet__Group__4__Impl rule__ActivitySet__Group__5 ;
    public final void rule__ActivitySet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3791:1: ( rule__ActivitySet__Group__4__Impl rule__ActivitySet__Group__5 )
            // InternalMyDsl.g:3792:2: rule__ActivitySet__Group__4__Impl rule__ActivitySet__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__ActivitySet__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivitySet__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group__4"


    // $ANTLR start "rule__ActivitySet__Group__4__Impl"
    // InternalMyDsl.g:3799:1: rule__ActivitySet__Group__4__Impl : ( ( rule__ActivitySet__Group_4__0 )? ) ;
    public final void rule__ActivitySet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3803:1: ( ( ( rule__ActivitySet__Group_4__0 )? ) )
            // InternalMyDsl.g:3804:1: ( ( rule__ActivitySet__Group_4__0 )? )
            {
            // InternalMyDsl.g:3804:1: ( ( rule__ActivitySet__Group_4__0 )? )
            // InternalMyDsl.g:3805:2: ( rule__ActivitySet__Group_4__0 )?
            {
             before(grammarAccess.getActivitySetAccess().getGroup_4()); 
            // InternalMyDsl.g:3806:2: ( rule__ActivitySet__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==45) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:3806:3: rule__ActivitySet__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActivitySet__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivitySetAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group__4__Impl"


    // $ANTLR start "rule__ActivitySet__Group__5"
    // InternalMyDsl.g:3814:1: rule__ActivitySet__Group__5 : rule__ActivitySet__Group__5__Impl rule__ActivitySet__Group__6 ;
    public final void rule__ActivitySet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3818:1: ( rule__ActivitySet__Group__5__Impl rule__ActivitySet__Group__6 )
            // InternalMyDsl.g:3819:2: rule__ActivitySet__Group__5__Impl rule__ActivitySet__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__ActivitySet__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivitySet__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group__5"


    // $ANTLR start "rule__ActivitySet__Group__5__Impl"
    // InternalMyDsl.g:3826:1: rule__ActivitySet__Group__5__Impl : ( 'activities' ) ;
    public final void rule__ActivitySet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3830:1: ( ( 'activities' ) )
            // InternalMyDsl.g:3831:1: ( 'activities' )
            {
            // InternalMyDsl.g:3831:1: ( 'activities' )
            // InternalMyDsl.g:3832:2: 'activities'
            {
             before(grammarAccess.getActivitySetAccess().getActivitiesKeyword_5()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getActivitySetAccess().getActivitiesKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group__5__Impl"


    // $ANTLR start "rule__ActivitySet__Group__6"
    // InternalMyDsl.g:3841:1: rule__ActivitySet__Group__6 : rule__ActivitySet__Group__6__Impl rule__ActivitySet__Group__7 ;
    public final void rule__ActivitySet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3845:1: ( rule__ActivitySet__Group__6__Impl rule__ActivitySet__Group__7 )
            // InternalMyDsl.g:3846:2: rule__ActivitySet__Group__6__Impl rule__ActivitySet__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__ActivitySet__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivitySet__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group__6"


    // $ANTLR start "rule__ActivitySet__Group__6__Impl"
    // InternalMyDsl.g:3853:1: rule__ActivitySet__Group__6__Impl : ( '{' ) ;
    public final void rule__ActivitySet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3857:1: ( ( '{' ) )
            // InternalMyDsl.g:3858:1: ( '{' )
            {
            // InternalMyDsl.g:3858:1: ( '{' )
            // InternalMyDsl.g:3859:2: '{'
            {
             before(grammarAccess.getActivitySetAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getActivitySetAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group__6__Impl"


    // $ANTLR start "rule__ActivitySet__Group__7"
    // InternalMyDsl.g:3868:1: rule__ActivitySet__Group__7 : rule__ActivitySet__Group__7__Impl rule__ActivitySet__Group__8 ;
    public final void rule__ActivitySet__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3872:1: ( rule__ActivitySet__Group__7__Impl rule__ActivitySet__Group__8 )
            // InternalMyDsl.g:3873:2: rule__ActivitySet__Group__7__Impl rule__ActivitySet__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__ActivitySet__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivitySet__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group__7"


    // $ANTLR start "rule__ActivitySet__Group__7__Impl"
    // InternalMyDsl.g:3880:1: rule__ActivitySet__Group__7__Impl : ( ( rule__ActivitySet__ActivitiesAssignment_7 ) ) ;
    public final void rule__ActivitySet__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3884:1: ( ( ( rule__ActivitySet__ActivitiesAssignment_7 ) ) )
            // InternalMyDsl.g:3885:1: ( ( rule__ActivitySet__ActivitiesAssignment_7 ) )
            {
            // InternalMyDsl.g:3885:1: ( ( rule__ActivitySet__ActivitiesAssignment_7 ) )
            // InternalMyDsl.g:3886:2: ( rule__ActivitySet__ActivitiesAssignment_7 )
            {
             before(grammarAccess.getActivitySetAccess().getActivitiesAssignment_7()); 
            // InternalMyDsl.g:3887:2: ( rule__ActivitySet__ActivitiesAssignment_7 )
            // InternalMyDsl.g:3887:3: rule__ActivitySet__ActivitiesAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__ActivitySet__ActivitiesAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getActivitySetAccess().getActivitiesAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group__7__Impl"


    // $ANTLR start "rule__ActivitySet__Group__8"
    // InternalMyDsl.g:3895:1: rule__ActivitySet__Group__8 : rule__ActivitySet__Group__8__Impl rule__ActivitySet__Group__9 ;
    public final void rule__ActivitySet__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3899:1: ( rule__ActivitySet__Group__8__Impl rule__ActivitySet__Group__9 )
            // InternalMyDsl.g:3900:2: rule__ActivitySet__Group__8__Impl rule__ActivitySet__Group__9
            {
            pushFollow(FOLLOW_8);
            rule__ActivitySet__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivitySet__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group__8"


    // $ANTLR start "rule__ActivitySet__Group__8__Impl"
    // InternalMyDsl.g:3907:1: rule__ActivitySet__Group__8__Impl : ( ( rule__ActivitySet__Group_8__0 )* ) ;
    public final void rule__ActivitySet__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3911:1: ( ( ( rule__ActivitySet__Group_8__0 )* ) )
            // InternalMyDsl.g:3912:1: ( ( rule__ActivitySet__Group_8__0 )* )
            {
            // InternalMyDsl.g:3912:1: ( ( rule__ActivitySet__Group_8__0 )* )
            // InternalMyDsl.g:3913:2: ( rule__ActivitySet__Group_8__0 )*
            {
             before(grammarAccess.getActivitySetAccess().getGroup_8()); 
            // InternalMyDsl.g:3914:2: ( rule__ActivitySet__Group_8__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==27) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMyDsl.g:3914:3: rule__ActivitySet__Group_8__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ActivitySet__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getActivitySetAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group__8__Impl"


    // $ANTLR start "rule__ActivitySet__Group__9"
    // InternalMyDsl.g:3922:1: rule__ActivitySet__Group__9 : rule__ActivitySet__Group__9__Impl rule__ActivitySet__Group__10 ;
    public final void rule__ActivitySet__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3926:1: ( rule__ActivitySet__Group__9__Impl rule__ActivitySet__Group__10 )
            // InternalMyDsl.g:3927:2: rule__ActivitySet__Group__9__Impl rule__ActivitySet__Group__10
            {
            pushFollow(FOLLOW_14);
            rule__ActivitySet__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivitySet__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group__9"


    // $ANTLR start "rule__ActivitySet__Group__9__Impl"
    // InternalMyDsl.g:3934:1: rule__ActivitySet__Group__9__Impl : ( '}' ) ;
    public final void rule__ActivitySet__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3938:1: ( ( '}' ) )
            // InternalMyDsl.g:3939:1: ( '}' )
            {
            // InternalMyDsl.g:3939:1: ( '}' )
            // InternalMyDsl.g:3940:2: '}'
            {
             before(grammarAccess.getActivitySetAccess().getRightCurlyBracketKeyword_9()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getActivitySetAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group__9__Impl"


    // $ANTLR start "rule__ActivitySet__Group__10"
    // InternalMyDsl.g:3949:1: rule__ActivitySet__Group__10 : rule__ActivitySet__Group__10__Impl ;
    public final void rule__ActivitySet__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3953:1: ( rule__ActivitySet__Group__10__Impl )
            // InternalMyDsl.g:3954:2: rule__ActivitySet__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivitySet__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group__10"


    // $ANTLR start "rule__ActivitySet__Group__10__Impl"
    // InternalMyDsl.g:3960:1: rule__ActivitySet__Group__10__Impl : ( '}' ) ;
    public final void rule__ActivitySet__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3964:1: ( ( '}' ) )
            // InternalMyDsl.g:3965:1: ( '}' )
            {
            // InternalMyDsl.g:3965:1: ( '}' )
            // InternalMyDsl.g:3966:2: '}'
            {
             before(grammarAccess.getActivitySetAccess().getRightCurlyBracketKeyword_10()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getActivitySetAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group__10__Impl"


    // $ANTLR start "rule__ActivitySet__Group_3__0"
    // InternalMyDsl.g:3976:1: rule__ActivitySet__Group_3__0 : rule__ActivitySet__Group_3__0__Impl rule__ActivitySet__Group_3__1 ;
    public final void rule__ActivitySet__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3980:1: ( rule__ActivitySet__Group_3__0__Impl rule__ActivitySet__Group_3__1 )
            // InternalMyDsl.g:3981:2: rule__ActivitySet__Group_3__0__Impl rule__ActivitySet__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__ActivitySet__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivitySet__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group_3__0"


    // $ANTLR start "rule__ActivitySet__Group_3__0__Impl"
    // InternalMyDsl.g:3988:1: rule__ActivitySet__Group_3__0__Impl : ( 'name' ) ;
    public final void rule__ActivitySet__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3992:1: ( ( 'name' ) )
            // InternalMyDsl.g:3993:1: ( 'name' )
            {
            // InternalMyDsl.g:3993:1: ( 'name' )
            // InternalMyDsl.g:3994:2: 'name'
            {
             before(grammarAccess.getActivitySetAccess().getNameKeyword_3_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getActivitySetAccess().getNameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group_3__0__Impl"


    // $ANTLR start "rule__ActivitySet__Group_3__1"
    // InternalMyDsl.g:4003:1: rule__ActivitySet__Group_3__1 : rule__ActivitySet__Group_3__1__Impl ;
    public final void rule__ActivitySet__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4007:1: ( rule__ActivitySet__Group_3__1__Impl )
            // InternalMyDsl.g:4008:2: rule__ActivitySet__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivitySet__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group_3__1"


    // $ANTLR start "rule__ActivitySet__Group_3__1__Impl"
    // InternalMyDsl.g:4014:1: rule__ActivitySet__Group_3__1__Impl : ( ( rule__ActivitySet__NameAssignment_3_1 ) ) ;
    public final void rule__ActivitySet__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4018:1: ( ( ( rule__ActivitySet__NameAssignment_3_1 ) ) )
            // InternalMyDsl.g:4019:1: ( ( rule__ActivitySet__NameAssignment_3_1 ) )
            {
            // InternalMyDsl.g:4019:1: ( ( rule__ActivitySet__NameAssignment_3_1 ) )
            // InternalMyDsl.g:4020:2: ( rule__ActivitySet__NameAssignment_3_1 )
            {
             before(grammarAccess.getActivitySetAccess().getNameAssignment_3_1()); 
            // InternalMyDsl.g:4021:2: ( rule__ActivitySet__NameAssignment_3_1 )
            // InternalMyDsl.g:4021:3: rule__ActivitySet__NameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ActivitySet__NameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActivitySetAccess().getNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group_3__1__Impl"


    // $ANTLR start "rule__ActivitySet__Group_4__0"
    // InternalMyDsl.g:4030:1: rule__ActivitySet__Group_4__0 : rule__ActivitySet__Group_4__0__Impl rule__ActivitySet__Group_4__1 ;
    public final void rule__ActivitySet__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4034:1: ( rule__ActivitySet__Group_4__0__Impl rule__ActivitySet__Group_4__1 )
            // InternalMyDsl.g:4035:2: rule__ActivitySet__Group_4__0__Impl rule__ActivitySet__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__ActivitySet__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivitySet__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group_4__0"


    // $ANTLR start "rule__ActivitySet__Group_4__0__Impl"
    // InternalMyDsl.g:4042:1: rule__ActivitySet__Group_4__0__Impl : ( 'participant' ) ;
    public final void rule__ActivitySet__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4046:1: ( ( 'participant' ) )
            // InternalMyDsl.g:4047:1: ( 'participant' )
            {
            // InternalMyDsl.g:4047:1: ( 'participant' )
            // InternalMyDsl.g:4048:2: 'participant'
            {
             before(grammarAccess.getActivitySetAccess().getParticipantKeyword_4_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getActivitySetAccess().getParticipantKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group_4__0__Impl"


    // $ANTLR start "rule__ActivitySet__Group_4__1"
    // InternalMyDsl.g:4057:1: rule__ActivitySet__Group_4__1 : rule__ActivitySet__Group_4__1__Impl ;
    public final void rule__ActivitySet__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4061:1: ( rule__ActivitySet__Group_4__1__Impl )
            // InternalMyDsl.g:4062:2: rule__ActivitySet__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivitySet__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group_4__1"


    // $ANTLR start "rule__ActivitySet__Group_4__1__Impl"
    // InternalMyDsl.g:4068:1: rule__ActivitySet__Group_4__1__Impl : ( ( rule__ActivitySet__ParticipantAssignment_4_1 ) ) ;
    public final void rule__ActivitySet__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4072:1: ( ( ( rule__ActivitySet__ParticipantAssignment_4_1 ) ) )
            // InternalMyDsl.g:4073:1: ( ( rule__ActivitySet__ParticipantAssignment_4_1 ) )
            {
            // InternalMyDsl.g:4073:1: ( ( rule__ActivitySet__ParticipantAssignment_4_1 ) )
            // InternalMyDsl.g:4074:2: ( rule__ActivitySet__ParticipantAssignment_4_1 )
            {
             before(grammarAccess.getActivitySetAccess().getParticipantAssignment_4_1()); 
            // InternalMyDsl.g:4075:2: ( rule__ActivitySet__ParticipantAssignment_4_1 )
            // InternalMyDsl.g:4075:3: rule__ActivitySet__ParticipantAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ActivitySet__ParticipantAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getActivitySetAccess().getParticipantAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group_4__1__Impl"


    // $ANTLR start "rule__ActivitySet__Group_8__0"
    // InternalMyDsl.g:4084:1: rule__ActivitySet__Group_8__0 : rule__ActivitySet__Group_8__0__Impl rule__ActivitySet__Group_8__1 ;
    public final void rule__ActivitySet__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4088:1: ( rule__ActivitySet__Group_8__0__Impl rule__ActivitySet__Group_8__1 )
            // InternalMyDsl.g:4089:2: rule__ActivitySet__Group_8__0__Impl rule__ActivitySet__Group_8__1
            {
            pushFollow(FOLLOW_23);
            rule__ActivitySet__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivitySet__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group_8__0"


    // $ANTLR start "rule__ActivitySet__Group_8__0__Impl"
    // InternalMyDsl.g:4096:1: rule__ActivitySet__Group_8__0__Impl : ( ',' ) ;
    public final void rule__ActivitySet__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4100:1: ( ( ',' ) )
            // InternalMyDsl.g:4101:1: ( ',' )
            {
            // InternalMyDsl.g:4101:1: ( ',' )
            // InternalMyDsl.g:4102:2: ','
            {
             before(grammarAccess.getActivitySetAccess().getCommaKeyword_8_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getActivitySetAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group_8__0__Impl"


    // $ANTLR start "rule__ActivitySet__Group_8__1"
    // InternalMyDsl.g:4111:1: rule__ActivitySet__Group_8__1 : rule__ActivitySet__Group_8__1__Impl ;
    public final void rule__ActivitySet__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4115:1: ( rule__ActivitySet__Group_8__1__Impl )
            // InternalMyDsl.g:4116:2: rule__ActivitySet__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivitySet__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group_8__1"


    // $ANTLR start "rule__ActivitySet__Group_8__1__Impl"
    // InternalMyDsl.g:4122:1: rule__ActivitySet__Group_8__1__Impl : ( ( rule__ActivitySet__ActivitiesAssignment_8_1 ) ) ;
    public final void rule__ActivitySet__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4126:1: ( ( ( rule__ActivitySet__ActivitiesAssignment_8_1 ) ) )
            // InternalMyDsl.g:4127:1: ( ( rule__ActivitySet__ActivitiesAssignment_8_1 ) )
            {
            // InternalMyDsl.g:4127:1: ( ( rule__ActivitySet__ActivitiesAssignment_8_1 ) )
            // InternalMyDsl.g:4128:2: ( rule__ActivitySet__ActivitiesAssignment_8_1 )
            {
             before(grammarAccess.getActivitySetAccess().getActivitiesAssignment_8_1()); 
            // InternalMyDsl.g:4129:2: ( rule__ActivitySet__ActivitiesAssignment_8_1 )
            // InternalMyDsl.g:4129:3: rule__ActivitySet__ActivitiesAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__ActivitySet__ActivitiesAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getActivitySetAccess().getActivitiesAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group_8__1__Impl"


    // $ANTLR start "rule__Activity_Impl__Group__0"
    // InternalMyDsl.g:4138:1: rule__Activity_Impl__Group__0 : rule__Activity_Impl__Group__0__Impl rule__Activity_Impl__Group__1 ;
    public final void rule__Activity_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4142:1: ( rule__Activity_Impl__Group__0__Impl rule__Activity_Impl__Group__1 )
            // InternalMyDsl.g:4143:2: rule__Activity_Impl__Group__0__Impl rule__Activity_Impl__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Activity_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity_Impl__Group__0"


    // $ANTLR start "rule__Activity_Impl__Group__0__Impl"
    // InternalMyDsl.g:4150:1: rule__Activity_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Activity_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4154:1: ( ( () ) )
            // InternalMyDsl.g:4155:1: ( () )
            {
            // InternalMyDsl.g:4155:1: ( () )
            // InternalMyDsl.g:4156:2: ()
            {
             before(grammarAccess.getActivity_ImplAccess().getActivityAction_0()); 
            // InternalMyDsl.g:4157:2: ()
            // InternalMyDsl.g:4157:3: 
            {
            }

             after(grammarAccess.getActivity_ImplAccess().getActivityAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity_Impl__Group__0__Impl"


    // $ANTLR start "rule__Activity_Impl__Group__1"
    // InternalMyDsl.g:4165:1: rule__Activity_Impl__Group__1 : rule__Activity_Impl__Group__1__Impl rule__Activity_Impl__Group__2 ;
    public final void rule__Activity_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4169:1: ( rule__Activity_Impl__Group__1__Impl rule__Activity_Impl__Group__2 )
            // InternalMyDsl.g:4170:2: rule__Activity_Impl__Group__1__Impl rule__Activity_Impl__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Activity_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity_Impl__Group__1"


    // $ANTLR start "rule__Activity_Impl__Group__1__Impl"
    // InternalMyDsl.g:4177:1: rule__Activity_Impl__Group__1__Impl : ( 'Activity' ) ;
    public final void rule__Activity_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4181:1: ( ( 'Activity' ) )
            // InternalMyDsl.g:4182:1: ( 'Activity' )
            {
            // InternalMyDsl.g:4182:1: ( 'Activity' )
            // InternalMyDsl.g:4183:2: 'Activity'
            {
             before(grammarAccess.getActivity_ImplAccess().getActivityKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getActivity_ImplAccess().getActivityKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity_Impl__Group__1__Impl"


    // $ANTLR start "rule__Activity_Impl__Group__2"
    // InternalMyDsl.g:4192:1: rule__Activity_Impl__Group__2 : rule__Activity_Impl__Group__2__Impl rule__Activity_Impl__Group__3 ;
    public final void rule__Activity_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4196:1: ( rule__Activity_Impl__Group__2__Impl rule__Activity_Impl__Group__3 )
            // InternalMyDsl.g:4197:2: rule__Activity_Impl__Group__2__Impl rule__Activity_Impl__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Activity_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity_Impl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity_Impl__Group__2"


    // $ANTLR start "rule__Activity_Impl__Group__2__Impl"
    // InternalMyDsl.g:4204:1: rule__Activity_Impl__Group__2__Impl : ( ( rule__Activity_Impl__IdAssignment_2 ) ) ;
    public final void rule__Activity_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4208:1: ( ( ( rule__Activity_Impl__IdAssignment_2 ) ) )
            // InternalMyDsl.g:4209:1: ( ( rule__Activity_Impl__IdAssignment_2 ) )
            {
            // InternalMyDsl.g:4209:1: ( ( rule__Activity_Impl__IdAssignment_2 ) )
            // InternalMyDsl.g:4210:2: ( rule__Activity_Impl__IdAssignment_2 )
            {
             before(grammarAccess.getActivity_ImplAccess().getIdAssignment_2()); 
            // InternalMyDsl.g:4211:2: ( rule__Activity_Impl__IdAssignment_2 )
            // InternalMyDsl.g:4211:3: rule__Activity_Impl__IdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Activity_Impl__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getActivity_ImplAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity_Impl__Group__2__Impl"


    // $ANTLR start "rule__Activity_Impl__Group__3"
    // InternalMyDsl.g:4219:1: rule__Activity_Impl__Group__3 : rule__Activity_Impl__Group__3__Impl rule__Activity_Impl__Group__4 ;
    public final void rule__Activity_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4223:1: ( rule__Activity_Impl__Group__3__Impl rule__Activity_Impl__Group__4 )
            // InternalMyDsl.g:4224:2: rule__Activity_Impl__Group__3__Impl rule__Activity_Impl__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__Activity_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity_Impl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity_Impl__Group__3"


    // $ANTLR start "rule__Activity_Impl__Group__3__Impl"
    // InternalMyDsl.g:4231:1: rule__Activity_Impl__Group__3__Impl : ( '{' ) ;
    public final void rule__Activity_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4235:1: ( ( '{' ) )
            // InternalMyDsl.g:4236:1: ( '{' )
            {
            // InternalMyDsl.g:4236:1: ( '{' )
            // InternalMyDsl.g:4237:2: '{'
            {
             before(grammarAccess.getActivity_ImplAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getActivity_ImplAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity_Impl__Group__3__Impl"


    // $ANTLR start "rule__Activity_Impl__Group__4"
    // InternalMyDsl.g:4246:1: rule__Activity_Impl__Group__4 : rule__Activity_Impl__Group__4__Impl rule__Activity_Impl__Group__5 ;
    public final void rule__Activity_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4250:1: ( rule__Activity_Impl__Group__4__Impl rule__Activity_Impl__Group__5 )
            // InternalMyDsl.g:4251:2: rule__Activity_Impl__Group__4__Impl rule__Activity_Impl__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__Activity_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity_Impl__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity_Impl__Group__4"


    // $ANTLR start "rule__Activity_Impl__Group__4__Impl"
    // InternalMyDsl.g:4258:1: rule__Activity_Impl__Group__4__Impl : ( ( rule__Activity_Impl__Group_4__0 )? ) ;
    public final void rule__Activity_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4262:1: ( ( ( rule__Activity_Impl__Group_4__0 )? ) )
            // InternalMyDsl.g:4263:1: ( ( rule__Activity_Impl__Group_4__0 )? )
            {
            // InternalMyDsl.g:4263:1: ( ( rule__Activity_Impl__Group_4__0 )? )
            // InternalMyDsl.g:4264:2: ( rule__Activity_Impl__Group_4__0 )?
            {
             before(grammarAccess.getActivity_ImplAccess().getGroup_4()); 
            // InternalMyDsl.g:4265:2: ( rule__Activity_Impl__Group_4__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==47) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:4265:3: rule__Activity_Impl__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Activity_Impl__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivity_ImplAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity_Impl__Group__4__Impl"


    // $ANTLR start "rule__Activity_Impl__Group__5"
    // InternalMyDsl.g:4273:1: rule__Activity_Impl__Group__5 : rule__Activity_Impl__Group__5__Impl ;
    public final void rule__Activity_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4277:1: ( rule__Activity_Impl__Group__5__Impl )
            // InternalMyDsl.g:4278:2: rule__Activity_Impl__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Activity_Impl__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity_Impl__Group__5"


    // $ANTLR start "rule__Activity_Impl__Group__5__Impl"
    // InternalMyDsl.g:4284:1: rule__Activity_Impl__Group__5__Impl : ( '}' ) ;
    public final void rule__Activity_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4288:1: ( ( '}' ) )
            // InternalMyDsl.g:4289:1: ( '}' )
            {
            // InternalMyDsl.g:4289:1: ( '}' )
            // InternalMyDsl.g:4290:2: '}'
            {
             before(grammarAccess.getActivity_ImplAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getActivity_ImplAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity_Impl__Group__5__Impl"


    // $ANTLR start "rule__Activity_Impl__Group_4__0"
    // InternalMyDsl.g:4300:1: rule__Activity_Impl__Group_4__0 : rule__Activity_Impl__Group_4__0__Impl rule__Activity_Impl__Group_4__1 ;
    public final void rule__Activity_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4304:1: ( rule__Activity_Impl__Group_4__0__Impl rule__Activity_Impl__Group_4__1 )
            // InternalMyDsl.g:4305:2: rule__Activity_Impl__Group_4__0__Impl rule__Activity_Impl__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Activity_Impl__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity_Impl__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity_Impl__Group_4__0"


    // $ANTLR start "rule__Activity_Impl__Group_4__0__Impl"
    // InternalMyDsl.g:4312:1: rule__Activity_Impl__Group_4__0__Impl : ( 'title' ) ;
    public final void rule__Activity_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4316:1: ( ( 'title' ) )
            // InternalMyDsl.g:4317:1: ( 'title' )
            {
            // InternalMyDsl.g:4317:1: ( 'title' )
            // InternalMyDsl.g:4318:2: 'title'
            {
             before(grammarAccess.getActivity_ImplAccess().getTitleKeyword_4_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getActivity_ImplAccess().getTitleKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity_Impl__Group_4__0__Impl"


    // $ANTLR start "rule__Activity_Impl__Group_4__1"
    // InternalMyDsl.g:4327:1: rule__Activity_Impl__Group_4__1 : rule__Activity_Impl__Group_4__1__Impl ;
    public final void rule__Activity_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4331:1: ( rule__Activity_Impl__Group_4__1__Impl )
            // InternalMyDsl.g:4332:2: rule__Activity_Impl__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Activity_Impl__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity_Impl__Group_4__1"


    // $ANTLR start "rule__Activity_Impl__Group_4__1__Impl"
    // InternalMyDsl.g:4338:1: rule__Activity_Impl__Group_4__1__Impl : ( ( rule__Activity_Impl__TitleAssignment_4_1 ) ) ;
    public final void rule__Activity_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4342:1: ( ( ( rule__Activity_Impl__TitleAssignment_4_1 ) ) )
            // InternalMyDsl.g:4343:1: ( ( rule__Activity_Impl__TitleAssignment_4_1 ) )
            {
            // InternalMyDsl.g:4343:1: ( ( rule__Activity_Impl__TitleAssignment_4_1 ) )
            // InternalMyDsl.g:4344:2: ( rule__Activity_Impl__TitleAssignment_4_1 )
            {
             before(grammarAccess.getActivity_ImplAccess().getTitleAssignment_4_1()); 
            // InternalMyDsl.g:4345:2: ( rule__Activity_Impl__TitleAssignment_4_1 )
            // InternalMyDsl.g:4345:3: rule__Activity_Impl__TitleAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Activity_Impl__TitleAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getActivity_ImplAccess().getTitleAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity_Impl__Group_4__1__Impl"


    // $ANTLR start "rule__BlockActivity__Group__0"
    // InternalMyDsl.g:4354:1: rule__BlockActivity__Group__0 : rule__BlockActivity__Group__0__Impl rule__BlockActivity__Group__1 ;
    public final void rule__BlockActivity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4358:1: ( rule__BlockActivity__Group__0__Impl rule__BlockActivity__Group__1 )
            // InternalMyDsl.g:4359:2: rule__BlockActivity__Group__0__Impl rule__BlockActivity__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__BlockActivity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlockActivity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockActivity__Group__0"


    // $ANTLR start "rule__BlockActivity__Group__0__Impl"
    // InternalMyDsl.g:4366:1: rule__BlockActivity__Group__0__Impl : ( () ) ;
    public final void rule__BlockActivity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4370:1: ( ( () ) )
            // InternalMyDsl.g:4371:1: ( () )
            {
            // InternalMyDsl.g:4371:1: ( () )
            // InternalMyDsl.g:4372:2: ()
            {
             before(grammarAccess.getBlockActivityAccess().getBlockActivityAction_0()); 
            // InternalMyDsl.g:4373:2: ()
            // InternalMyDsl.g:4373:3: 
            {
            }

             after(grammarAccess.getBlockActivityAccess().getBlockActivityAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockActivity__Group__0__Impl"


    // $ANTLR start "rule__BlockActivity__Group__1"
    // InternalMyDsl.g:4381:1: rule__BlockActivity__Group__1 : rule__BlockActivity__Group__1__Impl rule__BlockActivity__Group__2 ;
    public final void rule__BlockActivity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4385:1: ( rule__BlockActivity__Group__1__Impl rule__BlockActivity__Group__2 )
            // InternalMyDsl.g:4386:2: rule__BlockActivity__Group__1__Impl rule__BlockActivity__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__BlockActivity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlockActivity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockActivity__Group__1"


    // $ANTLR start "rule__BlockActivity__Group__1__Impl"
    // InternalMyDsl.g:4393:1: rule__BlockActivity__Group__1__Impl : ( 'BlockActivity' ) ;
    public final void rule__BlockActivity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4397:1: ( ( 'BlockActivity' ) )
            // InternalMyDsl.g:4398:1: ( 'BlockActivity' )
            {
            // InternalMyDsl.g:4398:1: ( 'BlockActivity' )
            // InternalMyDsl.g:4399:2: 'BlockActivity'
            {
             before(grammarAccess.getBlockActivityAccess().getBlockActivityKeyword_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getBlockActivityAccess().getBlockActivityKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockActivity__Group__1__Impl"


    // $ANTLR start "rule__BlockActivity__Group__2"
    // InternalMyDsl.g:4408:1: rule__BlockActivity__Group__2 : rule__BlockActivity__Group__2__Impl rule__BlockActivity__Group__3 ;
    public final void rule__BlockActivity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4412:1: ( rule__BlockActivity__Group__2__Impl rule__BlockActivity__Group__3 )
            // InternalMyDsl.g:4413:2: rule__BlockActivity__Group__2__Impl rule__BlockActivity__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__BlockActivity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlockActivity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockActivity__Group__2"


    // $ANTLR start "rule__BlockActivity__Group__2__Impl"
    // InternalMyDsl.g:4420:1: rule__BlockActivity__Group__2__Impl : ( ( rule__BlockActivity__IdAssignment_2 ) ) ;
    public final void rule__BlockActivity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4424:1: ( ( ( rule__BlockActivity__IdAssignment_2 ) ) )
            // InternalMyDsl.g:4425:1: ( ( rule__BlockActivity__IdAssignment_2 ) )
            {
            // InternalMyDsl.g:4425:1: ( ( rule__BlockActivity__IdAssignment_2 ) )
            // InternalMyDsl.g:4426:2: ( rule__BlockActivity__IdAssignment_2 )
            {
             before(grammarAccess.getBlockActivityAccess().getIdAssignment_2()); 
            // InternalMyDsl.g:4427:2: ( rule__BlockActivity__IdAssignment_2 )
            // InternalMyDsl.g:4427:3: rule__BlockActivity__IdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BlockActivity__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBlockActivityAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockActivity__Group__2__Impl"


    // $ANTLR start "rule__BlockActivity__Group__3"
    // InternalMyDsl.g:4435:1: rule__BlockActivity__Group__3 : rule__BlockActivity__Group__3__Impl rule__BlockActivity__Group__4 ;
    public final void rule__BlockActivity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4439:1: ( rule__BlockActivity__Group__3__Impl rule__BlockActivity__Group__4 )
            // InternalMyDsl.g:4440:2: rule__BlockActivity__Group__3__Impl rule__BlockActivity__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__BlockActivity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlockActivity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockActivity__Group__3"


    // $ANTLR start "rule__BlockActivity__Group__3__Impl"
    // InternalMyDsl.g:4447:1: rule__BlockActivity__Group__3__Impl : ( '{' ) ;
    public final void rule__BlockActivity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4451:1: ( ( '{' ) )
            // InternalMyDsl.g:4452:1: ( '{' )
            {
            // InternalMyDsl.g:4452:1: ( '{' )
            // InternalMyDsl.g:4453:2: '{'
            {
             before(grammarAccess.getBlockActivityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getBlockActivityAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockActivity__Group__3__Impl"


    // $ANTLR start "rule__BlockActivity__Group__4"
    // InternalMyDsl.g:4462:1: rule__BlockActivity__Group__4 : rule__BlockActivity__Group__4__Impl rule__BlockActivity__Group__5 ;
    public final void rule__BlockActivity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4466:1: ( rule__BlockActivity__Group__4__Impl rule__BlockActivity__Group__5 )
            // InternalMyDsl.g:4467:2: rule__BlockActivity__Group__4__Impl rule__BlockActivity__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__BlockActivity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlockActivity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockActivity__Group__4"


    // $ANTLR start "rule__BlockActivity__Group__4__Impl"
    // InternalMyDsl.g:4474:1: rule__BlockActivity__Group__4__Impl : ( ( rule__BlockActivity__Group_4__0 )? ) ;
    public final void rule__BlockActivity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4478:1: ( ( ( rule__BlockActivity__Group_4__0 )? ) )
            // InternalMyDsl.g:4479:1: ( ( rule__BlockActivity__Group_4__0 )? )
            {
            // InternalMyDsl.g:4479:1: ( ( rule__BlockActivity__Group_4__0 )? )
            // InternalMyDsl.g:4480:2: ( rule__BlockActivity__Group_4__0 )?
            {
             before(grammarAccess.getBlockActivityAccess().getGroup_4()); 
            // InternalMyDsl.g:4481:2: ( rule__BlockActivity__Group_4__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==47) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:4481:3: rule__BlockActivity__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BlockActivity__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBlockActivityAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockActivity__Group__4__Impl"


    // $ANTLR start "rule__BlockActivity__Group__5"
    // InternalMyDsl.g:4489:1: rule__BlockActivity__Group__5 : rule__BlockActivity__Group__5__Impl ;
    public final void rule__BlockActivity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4493:1: ( rule__BlockActivity__Group__5__Impl )
            // InternalMyDsl.g:4494:2: rule__BlockActivity__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BlockActivity__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockActivity__Group__5"


    // $ANTLR start "rule__BlockActivity__Group__5__Impl"
    // InternalMyDsl.g:4500:1: rule__BlockActivity__Group__5__Impl : ( '}' ) ;
    public final void rule__BlockActivity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4504:1: ( ( '}' ) )
            // InternalMyDsl.g:4505:1: ( '}' )
            {
            // InternalMyDsl.g:4505:1: ( '}' )
            // InternalMyDsl.g:4506:2: '}'
            {
             before(grammarAccess.getBlockActivityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getBlockActivityAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockActivity__Group__5__Impl"


    // $ANTLR start "rule__BlockActivity__Group_4__0"
    // InternalMyDsl.g:4516:1: rule__BlockActivity__Group_4__0 : rule__BlockActivity__Group_4__0__Impl rule__BlockActivity__Group_4__1 ;
    public final void rule__BlockActivity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4520:1: ( rule__BlockActivity__Group_4__0__Impl rule__BlockActivity__Group_4__1 )
            // InternalMyDsl.g:4521:2: rule__BlockActivity__Group_4__0__Impl rule__BlockActivity__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__BlockActivity__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlockActivity__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockActivity__Group_4__0"


    // $ANTLR start "rule__BlockActivity__Group_4__0__Impl"
    // InternalMyDsl.g:4528:1: rule__BlockActivity__Group_4__0__Impl : ( 'title' ) ;
    public final void rule__BlockActivity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4532:1: ( ( 'title' ) )
            // InternalMyDsl.g:4533:1: ( 'title' )
            {
            // InternalMyDsl.g:4533:1: ( 'title' )
            // InternalMyDsl.g:4534:2: 'title'
            {
             before(grammarAccess.getBlockActivityAccess().getTitleKeyword_4_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getBlockActivityAccess().getTitleKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockActivity__Group_4__0__Impl"


    // $ANTLR start "rule__BlockActivity__Group_4__1"
    // InternalMyDsl.g:4543:1: rule__BlockActivity__Group_4__1 : rule__BlockActivity__Group_4__1__Impl ;
    public final void rule__BlockActivity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4547:1: ( rule__BlockActivity__Group_4__1__Impl )
            // InternalMyDsl.g:4548:2: rule__BlockActivity__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BlockActivity__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockActivity__Group_4__1"


    // $ANTLR start "rule__BlockActivity__Group_4__1__Impl"
    // InternalMyDsl.g:4554:1: rule__BlockActivity__Group_4__1__Impl : ( ( rule__BlockActivity__TitleAssignment_4_1 ) ) ;
    public final void rule__BlockActivity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4558:1: ( ( ( rule__BlockActivity__TitleAssignment_4_1 ) ) )
            // InternalMyDsl.g:4559:1: ( ( rule__BlockActivity__TitleAssignment_4_1 ) )
            {
            // InternalMyDsl.g:4559:1: ( ( rule__BlockActivity__TitleAssignment_4_1 ) )
            // InternalMyDsl.g:4560:2: ( rule__BlockActivity__TitleAssignment_4_1 )
            {
             before(grammarAccess.getBlockActivityAccess().getTitleAssignment_4_1()); 
            // InternalMyDsl.g:4561:2: ( rule__BlockActivity__TitleAssignment_4_1 )
            // InternalMyDsl.g:4561:3: rule__BlockActivity__TitleAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__BlockActivity__TitleAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getBlockActivityAccess().getTitleAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockActivity__Group_4__1__Impl"


    // $ANTLR start "rule__Event__Group__0"
    // InternalMyDsl.g:4570:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4574:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // InternalMyDsl.g:4575:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Event__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0"


    // $ANTLR start "rule__Event__Group__0__Impl"
    // InternalMyDsl.g:4582:1: rule__Event__Group__0__Impl : ( () ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4586:1: ( ( () ) )
            // InternalMyDsl.g:4587:1: ( () )
            {
            // InternalMyDsl.g:4587:1: ( () )
            // InternalMyDsl.g:4588:2: ()
            {
             before(grammarAccess.getEventAccess().getEventAction_0()); 
            // InternalMyDsl.g:4589:2: ()
            // InternalMyDsl.g:4589:3: 
            {
            }

             after(grammarAccess.getEventAccess().getEventAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0__Impl"


    // $ANTLR start "rule__Event__Group__1"
    // InternalMyDsl.g:4597:1: rule__Event__Group__1 : rule__Event__Group__1__Impl rule__Event__Group__2 ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4601:1: ( rule__Event__Group__1__Impl rule__Event__Group__2 )
            // InternalMyDsl.g:4602:2: rule__Event__Group__1__Impl rule__Event__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Event__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1"


    // $ANTLR start "rule__Event__Group__1__Impl"
    // InternalMyDsl.g:4609:1: rule__Event__Group__1__Impl : ( 'Event' ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4613:1: ( ( 'Event' ) )
            // InternalMyDsl.g:4614:1: ( 'Event' )
            {
            // InternalMyDsl.g:4614:1: ( 'Event' )
            // InternalMyDsl.g:4615:2: 'Event'
            {
             before(grammarAccess.getEventAccess().getEventKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getEventKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1__Impl"


    // $ANTLR start "rule__Event__Group__2"
    // InternalMyDsl.g:4624:1: rule__Event__Group__2 : rule__Event__Group__2__Impl rule__Event__Group__3 ;
    public final void rule__Event__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4628:1: ( rule__Event__Group__2__Impl rule__Event__Group__3 )
            // InternalMyDsl.g:4629:2: rule__Event__Group__2__Impl rule__Event__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Event__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__2"


    // $ANTLR start "rule__Event__Group__2__Impl"
    // InternalMyDsl.g:4636:1: rule__Event__Group__2__Impl : ( ( rule__Event__IdAssignment_2 ) ) ;
    public final void rule__Event__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4640:1: ( ( ( rule__Event__IdAssignment_2 ) ) )
            // InternalMyDsl.g:4641:1: ( ( rule__Event__IdAssignment_2 ) )
            {
            // InternalMyDsl.g:4641:1: ( ( rule__Event__IdAssignment_2 ) )
            // InternalMyDsl.g:4642:2: ( rule__Event__IdAssignment_2 )
            {
             before(grammarAccess.getEventAccess().getIdAssignment_2()); 
            // InternalMyDsl.g:4643:2: ( rule__Event__IdAssignment_2 )
            // InternalMyDsl.g:4643:3: rule__Event__IdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Event__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__2__Impl"


    // $ANTLR start "rule__Event__Group__3"
    // InternalMyDsl.g:4651:1: rule__Event__Group__3 : rule__Event__Group__3__Impl rule__Event__Group__4 ;
    public final void rule__Event__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4655:1: ( rule__Event__Group__3__Impl rule__Event__Group__4 )
            // InternalMyDsl.g:4656:2: rule__Event__Group__3__Impl rule__Event__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__Event__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__3"


    // $ANTLR start "rule__Event__Group__3__Impl"
    // InternalMyDsl.g:4663:1: rule__Event__Group__3__Impl : ( '{' ) ;
    public final void rule__Event__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4667:1: ( ( '{' ) )
            // InternalMyDsl.g:4668:1: ( '{' )
            {
            // InternalMyDsl.g:4668:1: ( '{' )
            // InternalMyDsl.g:4669:2: '{'
            {
             before(grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__3__Impl"


    // $ANTLR start "rule__Event__Group__4"
    // InternalMyDsl.g:4678:1: rule__Event__Group__4 : rule__Event__Group__4__Impl rule__Event__Group__5 ;
    public final void rule__Event__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4682:1: ( rule__Event__Group__4__Impl rule__Event__Group__5 )
            // InternalMyDsl.g:4683:2: rule__Event__Group__4__Impl rule__Event__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__Event__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__4"


    // $ANTLR start "rule__Event__Group__4__Impl"
    // InternalMyDsl.g:4690:1: rule__Event__Group__4__Impl : ( ( rule__Event__Group_4__0 )? ) ;
    public final void rule__Event__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4694:1: ( ( ( rule__Event__Group_4__0 )? ) )
            // InternalMyDsl.g:4695:1: ( ( rule__Event__Group_4__0 )? )
            {
            // InternalMyDsl.g:4695:1: ( ( rule__Event__Group_4__0 )? )
            // InternalMyDsl.g:4696:2: ( rule__Event__Group_4__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_4()); 
            // InternalMyDsl.g:4697:2: ( rule__Event__Group_4__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==47) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:4697:3: rule__Event__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Event__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__4__Impl"


    // $ANTLR start "rule__Event__Group__5"
    // InternalMyDsl.g:4705:1: rule__Event__Group__5 : rule__Event__Group__5__Impl rule__Event__Group__6 ;
    public final void rule__Event__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4709:1: ( rule__Event__Group__5__Impl rule__Event__Group__6 )
            // InternalMyDsl.g:4710:2: rule__Event__Group__5__Impl rule__Event__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__Event__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__5"


    // $ANTLR start "rule__Event__Group__5__Impl"
    // InternalMyDsl.g:4717:1: rule__Event__Group__5__Impl : ( ( rule__Event__Group_5__0 )? ) ;
    public final void rule__Event__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4721:1: ( ( ( rule__Event__Group_5__0 )? ) )
            // InternalMyDsl.g:4722:1: ( ( rule__Event__Group_5__0 )? )
            {
            // InternalMyDsl.g:4722:1: ( ( rule__Event__Group_5__0 )? )
            // InternalMyDsl.g:4723:2: ( rule__Event__Group_5__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_5()); 
            // InternalMyDsl.g:4724:2: ( rule__Event__Group_5__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==50) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:4724:3: rule__Event__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Event__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__5__Impl"


    // $ANTLR start "rule__Event__Group__6"
    // InternalMyDsl.g:4732:1: rule__Event__Group__6 : rule__Event__Group__6__Impl rule__Event__Group__7 ;
    public final void rule__Event__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4736:1: ( rule__Event__Group__6__Impl rule__Event__Group__7 )
            // InternalMyDsl.g:4737:2: rule__Event__Group__6__Impl rule__Event__Group__7
            {
            pushFollow(FOLLOW_28);
            rule__Event__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__6"


    // $ANTLR start "rule__Event__Group__6__Impl"
    // InternalMyDsl.g:4744:1: rule__Event__Group__6__Impl : ( ( rule__Event__Group_6__0 )? ) ;
    public final void rule__Event__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4748:1: ( ( ( rule__Event__Group_6__0 )? ) )
            // InternalMyDsl.g:4749:1: ( ( rule__Event__Group_6__0 )? )
            {
            // InternalMyDsl.g:4749:1: ( ( rule__Event__Group_6__0 )? )
            // InternalMyDsl.g:4750:2: ( rule__Event__Group_6__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_6()); 
            // InternalMyDsl.g:4751:2: ( rule__Event__Group_6__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==51) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:4751:3: rule__Event__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Event__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__6__Impl"


    // $ANTLR start "rule__Event__Group__7"
    // InternalMyDsl.g:4759:1: rule__Event__Group__7 : rule__Event__Group__7__Impl ;
    public final void rule__Event__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4763:1: ( rule__Event__Group__7__Impl )
            // InternalMyDsl.g:4764:2: rule__Event__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__7"


    // $ANTLR start "rule__Event__Group__7__Impl"
    // InternalMyDsl.g:4770:1: rule__Event__Group__7__Impl : ( '}' ) ;
    public final void rule__Event__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4774:1: ( ( '}' ) )
            // InternalMyDsl.g:4775:1: ( '}' )
            {
            // InternalMyDsl.g:4775:1: ( '}' )
            // InternalMyDsl.g:4776:2: '}'
            {
             before(grammarAccess.getEventAccess().getRightCurlyBracketKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__7__Impl"


    // $ANTLR start "rule__Event__Group_4__0"
    // InternalMyDsl.g:4786:1: rule__Event__Group_4__0 : rule__Event__Group_4__0__Impl rule__Event__Group_4__1 ;
    public final void rule__Event__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4790:1: ( rule__Event__Group_4__0__Impl rule__Event__Group_4__1 )
            // InternalMyDsl.g:4791:2: rule__Event__Group_4__0__Impl rule__Event__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Event__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_4__0"


    // $ANTLR start "rule__Event__Group_4__0__Impl"
    // InternalMyDsl.g:4798:1: rule__Event__Group_4__0__Impl : ( 'title' ) ;
    public final void rule__Event__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4802:1: ( ( 'title' ) )
            // InternalMyDsl.g:4803:1: ( 'title' )
            {
            // InternalMyDsl.g:4803:1: ( 'title' )
            // InternalMyDsl.g:4804:2: 'title'
            {
             before(grammarAccess.getEventAccess().getTitleKeyword_4_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getTitleKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_4__0__Impl"


    // $ANTLR start "rule__Event__Group_4__1"
    // InternalMyDsl.g:4813:1: rule__Event__Group_4__1 : rule__Event__Group_4__1__Impl ;
    public final void rule__Event__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4817:1: ( rule__Event__Group_4__1__Impl )
            // InternalMyDsl.g:4818:2: rule__Event__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_4__1"


    // $ANTLR start "rule__Event__Group_4__1__Impl"
    // InternalMyDsl.g:4824:1: rule__Event__Group_4__1__Impl : ( ( rule__Event__TitleAssignment_4_1 ) ) ;
    public final void rule__Event__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4828:1: ( ( ( rule__Event__TitleAssignment_4_1 ) ) )
            // InternalMyDsl.g:4829:1: ( ( rule__Event__TitleAssignment_4_1 ) )
            {
            // InternalMyDsl.g:4829:1: ( ( rule__Event__TitleAssignment_4_1 ) )
            // InternalMyDsl.g:4830:2: ( rule__Event__TitleAssignment_4_1 )
            {
             before(grammarAccess.getEventAccess().getTitleAssignment_4_1()); 
            // InternalMyDsl.g:4831:2: ( rule__Event__TitleAssignment_4_1 )
            // InternalMyDsl.g:4831:3: rule__Event__TitleAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__TitleAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getTitleAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_4__1__Impl"


    // $ANTLR start "rule__Event__Group_5__0"
    // InternalMyDsl.g:4840:1: rule__Event__Group_5__0 : rule__Event__Group_5__0__Impl rule__Event__Group_5__1 ;
    public final void rule__Event__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4844:1: ( rule__Event__Group_5__0__Impl rule__Event__Group_5__1 )
            // InternalMyDsl.g:4845:2: rule__Event__Group_5__0__Impl rule__Event__Group_5__1
            {
            pushFollow(FOLLOW_29);
            rule__Event__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_5__0"


    // $ANTLR start "rule__Event__Group_5__0__Impl"
    // InternalMyDsl.g:4852:1: rule__Event__Group_5__0__Impl : ( 'time' ) ;
    public final void rule__Event__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4856:1: ( ( 'time' ) )
            // InternalMyDsl.g:4857:1: ( 'time' )
            {
            // InternalMyDsl.g:4857:1: ( 'time' )
            // InternalMyDsl.g:4858:2: 'time'
            {
             before(grammarAccess.getEventAccess().getTimeKeyword_5_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getTimeKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_5__0__Impl"


    // $ANTLR start "rule__Event__Group_5__1"
    // InternalMyDsl.g:4867:1: rule__Event__Group_5__1 : rule__Event__Group_5__1__Impl ;
    public final void rule__Event__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4871:1: ( rule__Event__Group_5__1__Impl )
            // InternalMyDsl.g:4872:2: rule__Event__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_5__1"


    // $ANTLR start "rule__Event__Group_5__1__Impl"
    // InternalMyDsl.g:4878:1: rule__Event__Group_5__1__Impl : ( ( rule__Event__TimeAssignment_5_1 ) ) ;
    public final void rule__Event__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4882:1: ( ( ( rule__Event__TimeAssignment_5_1 ) ) )
            // InternalMyDsl.g:4883:1: ( ( rule__Event__TimeAssignment_5_1 ) )
            {
            // InternalMyDsl.g:4883:1: ( ( rule__Event__TimeAssignment_5_1 ) )
            // InternalMyDsl.g:4884:2: ( rule__Event__TimeAssignment_5_1 )
            {
             before(grammarAccess.getEventAccess().getTimeAssignment_5_1()); 
            // InternalMyDsl.g:4885:2: ( rule__Event__TimeAssignment_5_1 )
            // InternalMyDsl.g:4885:3: rule__Event__TimeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__TimeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getTimeAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_5__1__Impl"


    // $ANTLR start "rule__Event__Group_6__0"
    // InternalMyDsl.g:4894:1: rule__Event__Group_6__0 : rule__Event__Group_6__0__Impl rule__Event__Group_6__1 ;
    public final void rule__Event__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4898:1: ( rule__Event__Group_6__0__Impl rule__Event__Group_6__1 )
            // InternalMyDsl.g:4899:2: rule__Event__Group_6__0__Impl rule__Event__Group_6__1
            {
            pushFollow(FOLLOW_30);
            rule__Event__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_6__0"


    // $ANTLR start "rule__Event__Group_6__0__Impl"
    // InternalMyDsl.g:4906:1: rule__Event__Group_6__0__Impl : ( 'type' ) ;
    public final void rule__Event__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4910:1: ( ( 'type' ) )
            // InternalMyDsl.g:4911:1: ( 'type' )
            {
            // InternalMyDsl.g:4911:1: ( 'type' )
            // InternalMyDsl.g:4912:2: 'type'
            {
             before(grammarAccess.getEventAccess().getTypeKeyword_6_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getTypeKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_6__0__Impl"


    // $ANTLR start "rule__Event__Group_6__1"
    // InternalMyDsl.g:4921:1: rule__Event__Group_6__1 : rule__Event__Group_6__1__Impl ;
    public final void rule__Event__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4925:1: ( rule__Event__Group_6__1__Impl )
            // InternalMyDsl.g:4926:2: rule__Event__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_6__1"


    // $ANTLR start "rule__Event__Group_6__1__Impl"
    // InternalMyDsl.g:4932:1: rule__Event__Group_6__1__Impl : ( ( rule__Event__TypeAssignment_6_1 ) ) ;
    public final void rule__Event__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4936:1: ( ( ( rule__Event__TypeAssignment_6_1 ) ) )
            // InternalMyDsl.g:4937:1: ( ( rule__Event__TypeAssignment_6_1 ) )
            {
            // InternalMyDsl.g:4937:1: ( ( rule__Event__TypeAssignment_6_1 ) )
            // InternalMyDsl.g:4938:2: ( rule__Event__TypeAssignment_6_1 )
            {
             before(grammarAccess.getEventAccess().getTypeAssignment_6_1()); 
            // InternalMyDsl.g:4939:2: ( rule__Event__TypeAssignment_6_1 )
            // InternalMyDsl.g:4939:3: rule__Event__TypeAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__TypeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getTypeAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_6__1__Impl"


    // $ANTLR start "rule__Gateway__Group__0"
    // InternalMyDsl.g:4948:1: rule__Gateway__Group__0 : rule__Gateway__Group__0__Impl rule__Gateway__Group__1 ;
    public final void rule__Gateway__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4952:1: ( rule__Gateway__Group__0__Impl rule__Gateway__Group__1 )
            // InternalMyDsl.g:4953:2: rule__Gateway__Group__0__Impl rule__Gateway__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__Gateway__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gateway__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__0"


    // $ANTLR start "rule__Gateway__Group__0__Impl"
    // InternalMyDsl.g:4960:1: rule__Gateway__Group__0__Impl : ( () ) ;
    public final void rule__Gateway__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4964:1: ( ( () ) )
            // InternalMyDsl.g:4965:1: ( () )
            {
            // InternalMyDsl.g:4965:1: ( () )
            // InternalMyDsl.g:4966:2: ()
            {
             before(grammarAccess.getGatewayAccess().getGatewayAction_0()); 
            // InternalMyDsl.g:4967:2: ()
            // InternalMyDsl.g:4967:3: 
            {
            }

             after(grammarAccess.getGatewayAccess().getGatewayAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__0__Impl"


    // $ANTLR start "rule__Gateway__Group__1"
    // InternalMyDsl.g:4975:1: rule__Gateway__Group__1 : rule__Gateway__Group__1__Impl rule__Gateway__Group__2 ;
    public final void rule__Gateway__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4979:1: ( rule__Gateway__Group__1__Impl rule__Gateway__Group__2 )
            // InternalMyDsl.g:4980:2: rule__Gateway__Group__1__Impl rule__Gateway__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Gateway__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gateway__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__1"


    // $ANTLR start "rule__Gateway__Group__1__Impl"
    // InternalMyDsl.g:4987:1: rule__Gateway__Group__1__Impl : ( 'Gateway' ) ;
    public final void rule__Gateway__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4991:1: ( ( 'Gateway' ) )
            // InternalMyDsl.g:4992:1: ( 'Gateway' )
            {
            // InternalMyDsl.g:4992:1: ( 'Gateway' )
            // InternalMyDsl.g:4993:2: 'Gateway'
            {
             before(grammarAccess.getGatewayAccess().getGatewayKeyword_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getGatewayAccess().getGatewayKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__1__Impl"


    // $ANTLR start "rule__Gateway__Group__2"
    // InternalMyDsl.g:5002:1: rule__Gateway__Group__2 : rule__Gateway__Group__2__Impl rule__Gateway__Group__3 ;
    public final void rule__Gateway__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5006:1: ( rule__Gateway__Group__2__Impl rule__Gateway__Group__3 )
            // InternalMyDsl.g:5007:2: rule__Gateway__Group__2__Impl rule__Gateway__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Gateway__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gateway__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__2"


    // $ANTLR start "rule__Gateway__Group__2__Impl"
    // InternalMyDsl.g:5014:1: rule__Gateway__Group__2__Impl : ( ( rule__Gateway__IdAssignment_2 ) ) ;
    public final void rule__Gateway__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5018:1: ( ( ( rule__Gateway__IdAssignment_2 ) ) )
            // InternalMyDsl.g:5019:1: ( ( rule__Gateway__IdAssignment_2 ) )
            {
            // InternalMyDsl.g:5019:1: ( ( rule__Gateway__IdAssignment_2 ) )
            // InternalMyDsl.g:5020:2: ( rule__Gateway__IdAssignment_2 )
            {
             before(grammarAccess.getGatewayAccess().getIdAssignment_2()); 
            // InternalMyDsl.g:5021:2: ( rule__Gateway__IdAssignment_2 )
            // InternalMyDsl.g:5021:3: rule__Gateway__IdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Gateway__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGatewayAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__2__Impl"


    // $ANTLR start "rule__Gateway__Group__3"
    // InternalMyDsl.g:5029:1: rule__Gateway__Group__3 : rule__Gateway__Group__3__Impl rule__Gateway__Group__4 ;
    public final void rule__Gateway__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5033:1: ( rule__Gateway__Group__3__Impl rule__Gateway__Group__4 )
            // InternalMyDsl.g:5034:2: rule__Gateway__Group__3__Impl rule__Gateway__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__Gateway__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gateway__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__3"


    // $ANTLR start "rule__Gateway__Group__3__Impl"
    // InternalMyDsl.g:5041:1: rule__Gateway__Group__3__Impl : ( '{' ) ;
    public final void rule__Gateway__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5045:1: ( ( '{' ) )
            // InternalMyDsl.g:5046:1: ( '{' )
            {
            // InternalMyDsl.g:5046:1: ( '{' )
            // InternalMyDsl.g:5047:2: '{'
            {
             before(grammarAccess.getGatewayAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGatewayAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__3__Impl"


    // $ANTLR start "rule__Gateway__Group__4"
    // InternalMyDsl.g:5056:1: rule__Gateway__Group__4 : rule__Gateway__Group__4__Impl rule__Gateway__Group__5 ;
    public final void rule__Gateway__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5060:1: ( rule__Gateway__Group__4__Impl rule__Gateway__Group__5 )
            // InternalMyDsl.g:5061:2: rule__Gateway__Group__4__Impl rule__Gateway__Group__5
            {
            pushFollow(FOLLOW_32);
            rule__Gateway__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gateway__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__4"


    // $ANTLR start "rule__Gateway__Group__4__Impl"
    // InternalMyDsl.g:5068:1: rule__Gateway__Group__4__Impl : ( ( rule__Gateway__Group_4__0 )? ) ;
    public final void rule__Gateway__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5072:1: ( ( ( rule__Gateway__Group_4__0 )? ) )
            // InternalMyDsl.g:5073:1: ( ( rule__Gateway__Group_4__0 )? )
            {
            // InternalMyDsl.g:5073:1: ( ( rule__Gateway__Group_4__0 )? )
            // InternalMyDsl.g:5074:2: ( rule__Gateway__Group_4__0 )?
            {
             before(grammarAccess.getGatewayAccess().getGroup_4()); 
            // InternalMyDsl.g:5075:2: ( rule__Gateway__Group_4__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==47) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyDsl.g:5075:3: rule__Gateway__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Gateway__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGatewayAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__4__Impl"


    // $ANTLR start "rule__Gateway__Group__5"
    // InternalMyDsl.g:5083:1: rule__Gateway__Group__5 : rule__Gateway__Group__5__Impl rule__Gateway__Group__6 ;
    public final void rule__Gateway__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5087:1: ( rule__Gateway__Group__5__Impl rule__Gateway__Group__6 )
            // InternalMyDsl.g:5088:2: rule__Gateway__Group__5__Impl rule__Gateway__Group__6
            {
            pushFollow(FOLLOW_32);
            rule__Gateway__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gateway__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__5"


    // $ANTLR start "rule__Gateway__Group__5__Impl"
    // InternalMyDsl.g:5095:1: rule__Gateway__Group__5__Impl : ( ( rule__Gateway__Group_5__0 )? ) ;
    public final void rule__Gateway__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5099:1: ( ( ( rule__Gateway__Group_5__0 )? ) )
            // InternalMyDsl.g:5100:1: ( ( rule__Gateway__Group_5__0 )? )
            {
            // InternalMyDsl.g:5100:1: ( ( rule__Gateway__Group_5__0 )? )
            // InternalMyDsl.g:5101:2: ( rule__Gateway__Group_5__0 )?
            {
             before(grammarAccess.getGatewayAccess().getGroup_5()); 
            // InternalMyDsl.g:5102:2: ( rule__Gateway__Group_5__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==53) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:5102:3: rule__Gateway__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Gateway__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGatewayAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__5__Impl"


    // $ANTLR start "rule__Gateway__Group__6"
    // InternalMyDsl.g:5110:1: rule__Gateway__Group__6 : rule__Gateway__Group__6__Impl ;
    public final void rule__Gateway__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5114:1: ( rule__Gateway__Group__6__Impl )
            // InternalMyDsl.g:5115:2: rule__Gateway__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gateway__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__6"


    // $ANTLR start "rule__Gateway__Group__6__Impl"
    // InternalMyDsl.g:5121:1: rule__Gateway__Group__6__Impl : ( '}' ) ;
    public final void rule__Gateway__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5125:1: ( ( '}' ) )
            // InternalMyDsl.g:5126:1: ( '}' )
            {
            // InternalMyDsl.g:5126:1: ( '}' )
            // InternalMyDsl.g:5127:2: '}'
            {
             before(grammarAccess.getGatewayAccess().getRightCurlyBracketKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getGatewayAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__6__Impl"


    // $ANTLR start "rule__Gateway__Group_4__0"
    // InternalMyDsl.g:5137:1: rule__Gateway__Group_4__0 : rule__Gateway__Group_4__0__Impl rule__Gateway__Group_4__1 ;
    public final void rule__Gateway__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5141:1: ( rule__Gateway__Group_4__0__Impl rule__Gateway__Group_4__1 )
            // InternalMyDsl.g:5142:2: rule__Gateway__Group_4__0__Impl rule__Gateway__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Gateway__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gateway__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group_4__0"


    // $ANTLR start "rule__Gateway__Group_4__0__Impl"
    // InternalMyDsl.g:5149:1: rule__Gateway__Group_4__0__Impl : ( 'title' ) ;
    public final void rule__Gateway__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5153:1: ( ( 'title' ) )
            // InternalMyDsl.g:5154:1: ( 'title' )
            {
            // InternalMyDsl.g:5154:1: ( 'title' )
            // InternalMyDsl.g:5155:2: 'title'
            {
             before(grammarAccess.getGatewayAccess().getTitleKeyword_4_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getGatewayAccess().getTitleKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group_4__0__Impl"


    // $ANTLR start "rule__Gateway__Group_4__1"
    // InternalMyDsl.g:5164:1: rule__Gateway__Group_4__1 : rule__Gateway__Group_4__1__Impl ;
    public final void rule__Gateway__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5168:1: ( rule__Gateway__Group_4__1__Impl )
            // InternalMyDsl.g:5169:2: rule__Gateway__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gateway__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group_4__1"


    // $ANTLR start "rule__Gateway__Group_4__1__Impl"
    // InternalMyDsl.g:5175:1: rule__Gateway__Group_4__1__Impl : ( ( rule__Gateway__TitleAssignment_4_1 ) ) ;
    public final void rule__Gateway__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5179:1: ( ( ( rule__Gateway__TitleAssignment_4_1 ) ) )
            // InternalMyDsl.g:5180:1: ( ( rule__Gateway__TitleAssignment_4_1 ) )
            {
            // InternalMyDsl.g:5180:1: ( ( rule__Gateway__TitleAssignment_4_1 ) )
            // InternalMyDsl.g:5181:2: ( rule__Gateway__TitleAssignment_4_1 )
            {
             before(grammarAccess.getGatewayAccess().getTitleAssignment_4_1()); 
            // InternalMyDsl.g:5182:2: ( rule__Gateway__TitleAssignment_4_1 )
            // InternalMyDsl.g:5182:3: rule__Gateway__TitleAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Gateway__TitleAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getGatewayAccess().getTitleAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group_4__1__Impl"


    // $ANTLR start "rule__Gateway__Group_5__0"
    // InternalMyDsl.g:5191:1: rule__Gateway__Group_5__0 : rule__Gateway__Group_5__0__Impl rule__Gateway__Group_5__1 ;
    public final void rule__Gateway__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5195:1: ( rule__Gateway__Group_5__0__Impl rule__Gateway__Group_5__1 )
            // InternalMyDsl.g:5196:2: rule__Gateway__Group_5__0__Impl rule__Gateway__Group_5__1
            {
            pushFollow(FOLLOW_33);
            rule__Gateway__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gateway__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group_5__0"


    // $ANTLR start "rule__Gateway__Group_5__0__Impl"
    // InternalMyDsl.g:5203:1: rule__Gateway__Group_5__0__Impl : ( 'rule' ) ;
    public final void rule__Gateway__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5207:1: ( ( 'rule' ) )
            // InternalMyDsl.g:5208:1: ( 'rule' )
            {
            // InternalMyDsl.g:5208:1: ( 'rule' )
            // InternalMyDsl.g:5209:2: 'rule'
            {
             before(grammarAccess.getGatewayAccess().getRuleKeyword_5_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getGatewayAccess().getRuleKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group_5__0__Impl"


    // $ANTLR start "rule__Gateway__Group_5__1"
    // InternalMyDsl.g:5218:1: rule__Gateway__Group_5__1 : rule__Gateway__Group_5__1__Impl ;
    public final void rule__Gateway__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5222:1: ( rule__Gateway__Group_5__1__Impl )
            // InternalMyDsl.g:5223:2: rule__Gateway__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gateway__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group_5__1"


    // $ANTLR start "rule__Gateway__Group_5__1__Impl"
    // InternalMyDsl.g:5229:1: rule__Gateway__Group_5__1__Impl : ( ( rule__Gateway__RuleAssignment_5_1 ) ) ;
    public final void rule__Gateway__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5233:1: ( ( ( rule__Gateway__RuleAssignment_5_1 ) ) )
            // InternalMyDsl.g:5234:1: ( ( rule__Gateway__RuleAssignment_5_1 ) )
            {
            // InternalMyDsl.g:5234:1: ( ( rule__Gateway__RuleAssignment_5_1 ) )
            // InternalMyDsl.g:5235:2: ( rule__Gateway__RuleAssignment_5_1 )
            {
             before(grammarAccess.getGatewayAccess().getRuleAssignment_5_1()); 
            // InternalMyDsl.g:5236:2: ( rule__Gateway__RuleAssignment_5_1 )
            // InternalMyDsl.g:5236:3: rule__Gateway__RuleAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Gateway__RuleAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getGatewayAccess().getRuleAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group_5__1__Impl"


    // $ANTLR start "rule__SubFlow__Group__0"
    // InternalMyDsl.g:5245:1: rule__SubFlow__Group__0 : rule__SubFlow__Group__0__Impl rule__SubFlow__Group__1 ;
    public final void rule__SubFlow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5249:1: ( rule__SubFlow__Group__0__Impl rule__SubFlow__Group__1 )
            // InternalMyDsl.g:5250:2: rule__SubFlow__Group__0__Impl rule__SubFlow__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__SubFlow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubFlow__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFlow__Group__0"


    // $ANTLR start "rule__SubFlow__Group__0__Impl"
    // InternalMyDsl.g:5257:1: rule__SubFlow__Group__0__Impl : ( () ) ;
    public final void rule__SubFlow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5261:1: ( ( () ) )
            // InternalMyDsl.g:5262:1: ( () )
            {
            // InternalMyDsl.g:5262:1: ( () )
            // InternalMyDsl.g:5263:2: ()
            {
             before(grammarAccess.getSubFlowAccess().getSubFlowAction_0()); 
            // InternalMyDsl.g:5264:2: ()
            // InternalMyDsl.g:5264:3: 
            {
            }

             after(grammarAccess.getSubFlowAccess().getSubFlowAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFlow__Group__0__Impl"


    // $ANTLR start "rule__SubFlow__Group__1"
    // InternalMyDsl.g:5272:1: rule__SubFlow__Group__1 : rule__SubFlow__Group__1__Impl rule__SubFlow__Group__2 ;
    public final void rule__SubFlow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5276:1: ( rule__SubFlow__Group__1__Impl rule__SubFlow__Group__2 )
            // InternalMyDsl.g:5277:2: rule__SubFlow__Group__1__Impl rule__SubFlow__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SubFlow__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubFlow__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFlow__Group__1"


    // $ANTLR start "rule__SubFlow__Group__1__Impl"
    // InternalMyDsl.g:5284:1: rule__SubFlow__Group__1__Impl : ( 'SubFlow' ) ;
    public final void rule__SubFlow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5288:1: ( ( 'SubFlow' ) )
            // InternalMyDsl.g:5289:1: ( 'SubFlow' )
            {
            // InternalMyDsl.g:5289:1: ( 'SubFlow' )
            // InternalMyDsl.g:5290:2: 'SubFlow'
            {
             before(grammarAccess.getSubFlowAccess().getSubFlowKeyword_1()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getSubFlowAccess().getSubFlowKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFlow__Group__1__Impl"


    // $ANTLR start "rule__SubFlow__Group__2"
    // InternalMyDsl.g:5299:1: rule__SubFlow__Group__2 : rule__SubFlow__Group__2__Impl rule__SubFlow__Group__3 ;
    public final void rule__SubFlow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5303:1: ( rule__SubFlow__Group__2__Impl rule__SubFlow__Group__3 )
            // InternalMyDsl.g:5304:2: rule__SubFlow__Group__2__Impl rule__SubFlow__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__SubFlow__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubFlow__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFlow__Group__2"


    // $ANTLR start "rule__SubFlow__Group__2__Impl"
    // InternalMyDsl.g:5311:1: rule__SubFlow__Group__2__Impl : ( ( rule__SubFlow__IdAssignment_2 ) ) ;
    public final void rule__SubFlow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5315:1: ( ( ( rule__SubFlow__IdAssignment_2 ) ) )
            // InternalMyDsl.g:5316:1: ( ( rule__SubFlow__IdAssignment_2 ) )
            {
            // InternalMyDsl.g:5316:1: ( ( rule__SubFlow__IdAssignment_2 ) )
            // InternalMyDsl.g:5317:2: ( rule__SubFlow__IdAssignment_2 )
            {
             before(grammarAccess.getSubFlowAccess().getIdAssignment_2()); 
            // InternalMyDsl.g:5318:2: ( rule__SubFlow__IdAssignment_2 )
            // InternalMyDsl.g:5318:3: rule__SubFlow__IdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SubFlow__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSubFlowAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFlow__Group__2__Impl"


    // $ANTLR start "rule__SubFlow__Group__3"
    // InternalMyDsl.g:5326:1: rule__SubFlow__Group__3 : rule__SubFlow__Group__3__Impl rule__SubFlow__Group__4 ;
    public final void rule__SubFlow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5330:1: ( rule__SubFlow__Group__3__Impl rule__SubFlow__Group__4 )
            // InternalMyDsl.g:5331:2: rule__SubFlow__Group__3__Impl rule__SubFlow__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__SubFlow__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubFlow__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFlow__Group__3"


    // $ANTLR start "rule__SubFlow__Group__3__Impl"
    // InternalMyDsl.g:5338:1: rule__SubFlow__Group__3__Impl : ( '{' ) ;
    public final void rule__SubFlow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5342:1: ( ( '{' ) )
            // InternalMyDsl.g:5343:1: ( '{' )
            {
            // InternalMyDsl.g:5343:1: ( '{' )
            // InternalMyDsl.g:5344:2: '{'
            {
             before(grammarAccess.getSubFlowAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSubFlowAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFlow__Group__3__Impl"


    // $ANTLR start "rule__SubFlow__Group__4"
    // InternalMyDsl.g:5353:1: rule__SubFlow__Group__4 : rule__SubFlow__Group__4__Impl rule__SubFlow__Group__5 ;
    public final void rule__SubFlow__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5357:1: ( rule__SubFlow__Group__4__Impl rule__SubFlow__Group__5 )
            // InternalMyDsl.g:5358:2: rule__SubFlow__Group__4__Impl rule__SubFlow__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__SubFlow__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubFlow__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFlow__Group__4"


    // $ANTLR start "rule__SubFlow__Group__4__Impl"
    // InternalMyDsl.g:5365:1: rule__SubFlow__Group__4__Impl : ( ( rule__SubFlow__Group_4__0 )? ) ;
    public final void rule__SubFlow__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5369:1: ( ( ( rule__SubFlow__Group_4__0 )? ) )
            // InternalMyDsl.g:5370:1: ( ( rule__SubFlow__Group_4__0 )? )
            {
            // InternalMyDsl.g:5370:1: ( ( rule__SubFlow__Group_4__0 )? )
            // InternalMyDsl.g:5371:2: ( rule__SubFlow__Group_4__0 )?
            {
             before(grammarAccess.getSubFlowAccess().getGroup_4()); 
            // InternalMyDsl.g:5372:2: ( rule__SubFlow__Group_4__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==47) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:5372:3: rule__SubFlow__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubFlow__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubFlowAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFlow__Group__4__Impl"


    // $ANTLR start "rule__SubFlow__Group__5"
    // InternalMyDsl.g:5380:1: rule__SubFlow__Group__5 : rule__SubFlow__Group__5__Impl ;
    public final void rule__SubFlow__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5384:1: ( rule__SubFlow__Group__5__Impl )
            // InternalMyDsl.g:5385:2: rule__SubFlow__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubFlow__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFlow__Group__5"


    // $ANTLR start "rule__SubFlow__Group__5__Impl"
    // InternalMyDsl.g:5391:1: rule__SubFlow__Group__5__Impl : ( '}' ) ;
    public final void rule__SubFlow__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5395:1: ( ( '}' ) )
            // InternalMyDsl.g:5396:1: ( '}' )
            {
            // InternalMyDsl.g:5396:1: ( '}' )
            // InternalMyDsl.g:5397:2: '}'
            {
             before(grammarAccess.getSubFlowAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSubFlowAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFlow__Group__5__Impl"


    // $ANTLR start "rule__SubFlow__Group_4__0"
    // InternalMyDsl.g:5407:1: rule__SubFlow__Group_4__0 : rule__SubFlow__Group_4__0__Impl rule__SubFlow__Group_4__1 ;
    public final void rule__SubFlow__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5411:1: ( rule__SubFlow__Group_4__0__Impl rule__SubFlow__Group_4__1 )
            // InternalMyDsl.g:5412:2: rule__SubFlow__Group_4__0__Impl rule__SubFlow__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__SubFlow__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubFlow__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFlow__Group_4__0"


    // $ANTLR start "rule__SubFlow__Group_4__0__Impl"
    // InternalMyDsl.g:5419:1: rule__SubFlow__Group_4__0__Impl : ( 'title' ) ;
    public final void rule__SubFlow__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5423:1: ( ( 'title' ) )
            // InternalMyDsl.g:5424:1: ( 'title' )
            {
            // InternalMyDsl.g:5424:1: ( 'title' )
            // InternalMyDsl.g:5425:2: 'title'
            {
             before(grammarAccess.getSubFlowAccess().getTitleKeyword_4_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSubFlowAccess().getTitleKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFlow__Group_4__0__Impl"


    // $ANTLR start "rule__SubFlow__Group_4__1"
    // InternalMyDsl.g:5434:1: rule__SubFlow__Group_4__1 : rule__SubFlow__Group_4__1__Impl ;
    public final void rule__SubFlow__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5438:1: ( rule__SubFlow__Group_4__1__Impl )
            // InternalMyDsl.g:5439:2: rule__SubFlow__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubFlow__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFlow__Group_4__1"


    // $ANTLR start "rule__SubFlow__Group_4__1__Impl"
    // InternalMyDsl.g:5445:1: rule__SubFlow__Group_4__1__Impl : ( ( rule__SubFlow__TitleAssignment_4_1 ) ) ;
    public final void rule__SubFlow__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5449:1: ( ( ( rule__SubFlow__TitleAssignment_4_1 ) ) )
            // InternalMyDsl.g:5450:1: ( ( rule__SubFlow__TitleAssignment_4_1 ) )
            {
            // InternalMyDsl.g:5450:1: ( ( rule__SubFlow__TitleAssignment_4_1 ) )
            // InternalMyDsl.g:5451:2: ( rule__SubFlow__TitleAssignment_4_1 )
            {
             before(grammarAccess.getSubFlowAccess().getTitleAssignment_4_1()); 
            // InternalMyDsl.g:5452:2: ( rule__SubFlow__TitleAssignment_4_1 )
            // InternalMyDsl.g:5452:3: rule__SubFlow__TitleAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__SubFlow__TitleAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSubFlowAccess().getTitleAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFlow__Group_4__1__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // InternalMyDsl.g:5461:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5465:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalMyDsl.g:5466:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // InternalMyDsl.g:5473:1: rule__Transition__Group__0__Impl : ( 'Transition' ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5477:1: ( ( 'Transition' ) )
            // InternalMyDsl.g:5478:1: ( 'Transition' )
            {
            // InternalMyDsl.g:5478:1: ( 'Transition' )
            // InternalMyDsl.g:5479:2: 'Transition'
            {
             before(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // InternalMyDsl.g:5488:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5492:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalMyDsl.g:5493:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // InternalMyDsl.g:5500:1: rule__Transition__Group__1__Impl : ( '{' ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5504:1: ( ( '{' ) )
            // InternalMyDsl.g:5505:1: ( '{' )
            {
            // InternalMyDsl.g:5505:1: ( '{' )
            // InternalMyDsl.g:5506:2: '{'
            {
             before(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // InternalMyDsl.g:5515:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5519:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalMyDsl.g:5520:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // InternalMyDsl.g:5527:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__Group_2__0 )? ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5531:1: ( ( ( rule__Transition__Group_2__0 )? ) )
            // InternalMyDsl.g:5532:1: ( ( rule__Transition__Group_2__0 )? )
            {
            // InternalMyDsl.g:5532:1: ( ( rule__Transition__Group_2__0 )? )
            // InternalMyDsl.g:5533:2: ( rule__Transition__Group_2__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_2()); 
            // InternalMyDsl.g:5534:2: ( rule__Transition__Group_2__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==56) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:5534:3: rule__Transition__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__3"
    // InternalMyDsl.g:5542:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5546:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // InternalMyDsl.g:5547:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Transition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3"


    // $ANTLR start "rule__Transition__Group__3__Impl"
    // InternalMyDsl.g:5554:1: rule__Transition__Group__3__Impl : ( 'source' ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5558:1: ( ( 'source' ) )
            // InternalMyDsl.g:5559:1: ( 'source' )
            {
            // InternalMyDsl.g:5559:1: ( 'source' )
            // InternalMyDsl.g:5560:2: 'source'
            {
             before(grammarAccess.getTransitionAccess().getSourceKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getSourceKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3__Impl"


    // $ANTLR start "rule__Transition__Group__4"
    // InternalMyDsl.g:5569:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl rule__Transition__Group__5 ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5573:1: ( rule__Transition__Group__4__Impl rule__Transition__Group__5 )
            // InternalMyDsl.g:5574:2: rule__Transition__Group__4__Impl rule__Transition__Group__5
            {
            pushFollow(FOLLOW_35);
            rule__Transition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4"


    // $ANTLR start "rule__Transition__Group__4__Impl"
    // InternalMyDsl.g:5581:1: rule__Transition__Group__4__Impl : ( ( rule__Transition__SourceAssignment_4 ) ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5585:1: ( ( ( rule__Transition__SourceAssignment_4 ) ) )
            // InternalMyDsl.g:5586:1: ( ( rule__Transition__SourceAssignment_4 ) )
            {
            // InternalMyDsl.g:5586:1: ( ( rule__Transition__SourceAssignment_4 ) )
            // InternalMyDsl.g:5587:2: ( rule__Transition__SourceAssignment_4 )
            {
             before(grammarAccess.getTransitionAccess().getSourceAssignment_4()); 
            // InternalMyDsl.g:5588:2: ( rule__Transition__SourceAssignment_4 )
            // InternalMyDsl.g:5588:3: rule__Transition__SourceAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Transition__SourceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getSourceAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4__Impl"


    // $ANTLR start "rule__Transition__Group__5"
    // InternalMyDsl.g:5596:1: rule__Transition__Group__5 : rule__Transition__Group__5__Impl rule__Transition__Group__6 ;
    public final void rule__Transition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5600:1: ( rule__Transition__Group__5__Impl rule__Transition__Group__6 )
            // InternalMyDsl.g:5601:2: rule__Transition__Group__5__Impl rule__Transition__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Transition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__5"


    // $ANTLR start "rule__Transition__Group__5__Impl"
    // InternalMyDsl.g:5608:1: rule__Transition__Group__5__Impl : ( 'target' ) ;
    public final void rule__Transition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5612:1: ( ( 'target' ) )
            // InternalMyDsl.g:5613:1: ( 'target' )
            {
            // InternalMyDsl.g:5613:1: ( 'target' )
            // InternalMyDsl.g:5614:2: 'target'
            {
             before(grammarAccess.getTransitionAccess().getTargetKeyword_5()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getTargetKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__5__Impl"


    // $ANTLR start "rule__Transition__Group__6"
    // InternalMyDsl.g:5623:1: rule__Transition__Group__6 : rule__Transition__Group__6__Impl rule__Transition__Group__7 ;
    public final void rule__Transition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5627:1: ( rule__Transition__Group__6__Impl rule__Transition__Group__7 )
            // InternalMyDsl.g:5628:2: rule__Transition__Group__6__Impl rule__Transition__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__Transition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__6"


    // $ANTLR start "rule__Transition__Group__6__Impl"
    // InternalMyDsl.g:5635:1: rule__Transition__Group__6__Impl : ( ( rule__Transition__TargetAssignment_6 ) ) ;
    public final void rule__Transition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5639:1: ( ( ( rule__Transition__TargetAssignment_6 ) ) )
            // InternalMyDsl.g:5640:1: ( ( rule__Transition__TargetAssignment_6 ) )
            {
            // InternalMyDsl.g:5640:1: ( ( rule__Transition__TargetAssignment_6 ) )
            // InternalMyDsl.g:5641:2: ( rule__Transition__TargetAssignment_6 )
            {
             before(grammarAccess.getTransitionAccess().getTargetAssignment_6()); 
            // InternalMyDsl.g:5642:2: ( rule__Transition__TargetAssignment_6 )
            // InternalMyDsl.g:5642:3: rule__Transition__TargetAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Transition__TargetAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getTargetAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__6__Impl"


    // $ANTLR start "rule__Transition__Group__7"
    // InternalMyDsl.g:5650:1: rule__Transition__Group__7 : rule__Transition__Group__7__Impl ;
    public final void rule__Transition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5654:1: ( rule__Transition__Group__7__Impl )
            // InternalMyDsl.g:5655:2: rule__Transition__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__7"


    // $ANTLR start "rule__Transition__Group__7__Impl"
    // InternalMyDsl.g:5661:1: rule__Transition__Group__7__Impl : ( '}' ) ;
    public final void rule__Transition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5665:1: ( ( '}' ) )
            // InternalMyDsl.g:5666:1: ( '}' )
            {
            // InternalMyDsl.g:5666:1: ( '}' )
            // InternalMyDsl.g:5667:2: '}'
            {
             before(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__7__Impl"


    // $ANTLR start "rule__Transition__Group_2__0"
    // InternalMyDsl.g:5677:1: rule__Transition__Group_2__0 : rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1 ;
    public final void rule__Transition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5681:1: ( rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1 )
            // InternalMyDsl.g:5682:2: rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Transition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_2__0"


    // $ANTLR start "rule__Transition__Group_2__0__Impl"
    // InternalMyDsl.g:5689:1: rule__Transition__Group_2__0__Impl : ( 'condition' ) ;
    public final void rule__Transition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5693:1: ( ( 'condition' ) )
            // InternalMyDsl.g:5694:1: ( 'condition' )
            {
            // InternalMyDsl.g:5694:1: ( 'condition' )
            // InternalMyDsl.g:5695:2: 'condition'
            {
             before(grammarAccess.getTransitionAccess().getConditionKeyword_2_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getConditionKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_2__0__Impl"


    // $ANTLR start "rule__Transition__Group_2__1"
    // InternalMyDsl.g:5704:1: rule__Transition__Group_2__1 : rule__Transition__Group_2__1__Impl ;
    public final void rule__Transition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5708:1: ( rule__Transition__Group_2__1__Impl )
            // InternalMyDsl.g:5709:2: rule__Transition__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_2__1"


    // $ANTLR start "rule__Transition__Group_2__1__Impl"
    // InternalMyDsl.g:5715:1: rule__Transition__Group_2__1__Impl : ( ( rule__Transition__ConditionAssignment_2_1 ) ) ;
    public final void rule__Transition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5719:1: ( ( ( rule__Transition__ConditionAssignment_2_1 ) ) )
            // InternalMyDsl.g:5720:1: ( ( rule__Transition__ConditionAssignment_2_1 ) )
            {
            // InternalMyDsl.g:5720:1: ( ( rule__Transition__ConditionAssignment_2_1 ) )
            // InternalMyDsl.g:5721:2: ( rule__Transition__ConditionAssignment_2_1 )
            {
             before(grammarAccess.getTransitionAccess().getConditionAssignment_2_1()); 
            // InternalMyDsl.g:5722:2: ( rule__Transition__ConditionAssignment_2_1 )
            // InternalMyDsl.g:5722:3: rule__Transition__ConditionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__ConditionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getConditionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_2__1__Impl"


    // $ANTLR start "rule__XpdlRoot__IdAssignment_2"
    // InternalMyDsl.g:5731:1: rule__XpdlRoot__IdAssignment_2 : ( ruleEString ) ;
    public final void rule__XpdlRoot__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5735:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5736:2: ( ruleEString )
            {
            // InternalMyDsl.g:5736:2: ( ruleEString )
            // InternalMyDsl.g:5737:3: ruleEString
            {
             before(grammarAccess.getXpdlRootAccess().getIdEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getXpdlRootAccess().getIdEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__IdAssignment_2"


    // $ANTLR start "rule__XpdlRoot__DiagramNameAssignment_4_1"
    // InternalMyDsl.g:5746:1: rule__XpdlRoot__DiagramNameAssignment_4_1 : ( ruleEString ) ;
    public final void rule__XpdlRoot__DiagramNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5750:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5751:2: ( ruleEString )
            {
            // InternalMyDsl.g:5751:2: ( ruleEString )
            // InternalMyDsl.g:5752:3: ruleEString
            {
             before(grammarAccess.getXpdlRootAccess().getDiagramNameEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getXpdlRootAccess().getDiagramNameEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__DiagramNameAssignment_4_1"


    // $ANTLR start "rule__XpdlRoot__ParticipantsAssignment_5_2"
    // InternalMyDsl.g:5761:1: rule__XpdlRoot__ParticipantsAssignment_5_2 : ( ruleParticipant ) ;
    public final void rule__XpdlRoot__ParticipantsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5765:1: ( ( ruleParticipant ) )
            // InternalMyDsl.g:5766:2: ( ruleParticipant )
            {
            // InternalMyDsl.g:5766:2: ( ruleParticipant )
            // InternalMyDsl.g:5767:3: ruleParticipant
            {
             before(grammarAccess.getXpdlRootAccess().getParticipantsParticipantParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParticipant();

            state._fsp--;

             after(grammarAccess.getXpdlRootAccess().getParticipantsParticipantParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__ParticipantsAssignment_5_2"


    // $ANTLR start "rule__XpdlRoot__ParticipantsAssignment_5_3_1"
    // InternalMyDsl.g:5776:1: rule__XpdlRoot__ParticipantsAssignment_5_3_1 : ( ruleParticipant ) ;
    public final void rule__XpdlRoot__ParticipantsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5780:1: ( ( ruleParticipant ) )
            // InternalMyDsl.g:5781:2: ( ruleParticipant )
            {
            // InternalMyDsl.g:5781:2: ( ruleParticipant )
            // InternalMyDsl.g:5782:3: ruleParticipant
            {
             before(grammarAccess.getXpdlRootAccess().getParticipantsParticipantParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParticipant();

            state._fsp--;

             after(grammarAccess.getXpdlRootAccess().getParticipantsParticipantParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__ParticipantsAssignment_5_3_1"


    // $ANTLR start "rule__XpdlRoot__ProcessAssignment_6_2"
    // InternalMyDsl.g:5791:1: rule__XpdlRoot__ProcessAssignment_6_2 : ( ruleProcess ) ;
    public final void rule__XpdlRoot__ProcessAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5795:1: ( ( ruleProcess ) )
            // InternalMyDsl.g:5796:2: ( ruleProcess )
            {
            // InternalMyDsl.g:5796:2: ( ruleProcess )
            // InternalMyDsl.g:5797:3: ruleProcess
            {
             before(grammarAccess.getXpdlRootAccess().getProcessProcessParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleProcess();

            state._fsp--;

             after(grammarAccess.getXpdlRootAccess().getProcessProcessParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__ProcessAssignment_6_2"


    // $ANTLR start "rule__XpdlRoot__ProcessAssignment_6_3_1"
    // InternalMyDsl.g:5806:1: rule__XpdlRoot__ProcessAssignment_6_3_1 : ( ruleProcess ) ;
    public final void rule__XpdlRoot__ProcessAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5810:1: ( ( ruleProcess ) )
            // InternalMyDsl.g:5811:2: ( ruleProcess )
            {
            // InternalMyDsl.g:5811:2: ( ruleProcess )
            // InternalMyDsl.g:5812:3: ruleProcess
            {
             before(grammarAccess.getXpdlRootAccess().getProcessProcessParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProcess();

            state._fsp--;

             after(grammarAccess.getXpdlRootAccess().getProcessProcessParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__ProcessAssignment_6_3_1"


    // $ANTLR start "rule__XpdlRoot__MessageflowsAssignment_7_2"
    // InternalMyDsl.g:5821:1: rule__XpdlRoot__MessageflowsAssignment_7_2 : ( ruleMessageFlow ) ;
    public final void rule__XpdlRoot__MessageflowsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5825:1: ( ( ruleMessageFlow ) )
            // InternalMyDsl.g:5826:2: ( ruleMessageFlow )
            {
            // InternalMyDsl.g:5826:2: ( ruleMessageFlow )
            // InternalMyDsl.g:5827:3: ruleMessageFlow
            {
             before(grammarAccess.getXpdlRootAccess().getMessageflowsMessageFlowParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMessageFlow();

            state._fsp--;

             after(grammarAccess.getXpdlRootAccess().getMessageflowsMessageFlowParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__MessageflowsAssignment_7_2"


    // $ANTLR start "rule__XpdlRoot__MessageflowsAssignment_7_3_1"
    // InternalMyDsl.g:5836:1: rule__XpdlRoot__MessageflowsAssignment_7_3_1 : ( ruleMessageFlow ) ;
    public final void rule__XpdlRoot__MessageflowsAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5840:1: ( ( ruleMessageFlow ) )
            // InternalMyDsl.g:5841:2: ( ruleMessageFlow )
            {
            // InternalMyDsl.g:5841:2: ( ruleMessageFlow )
            // InternalMyDsl.g:5842:3: ruleMessageFlow
            {
             before(grammarAccess.getXpdlRootAccess().getMessageflowsMessageFlowParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMessageFlow();

            state._fsp--;

             after(grammarAccess.getXpdlRootAccess().getMessageflowsMessageFlowParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__MessageflowsAssignment_7_3_1"


    // $ANTLR start "rule__Participant__IdAssignment_1"
    // InternalMyDsl.g:5851:1: rule__Participant__IdAssignment_1 : ( ruleEString ) ;
    public final void rule__Participant__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5855:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5856:2: ( ruleEString )
            {
            // InternalMyDsl.g:5856:2: ( ruleEString )
            // InternalMyDsl.g:5857:3: ruleEString
            {
             before(grammarAccess.getParticipantAccess().getIdEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParticipantAccess().getIdEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__IdAssignment_1"


    // $ANTLR start "rule__Participant__NameAssignment_3_1"
    // InternalMyDsl.g:5866:1: rule__Participant__NameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Participant__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5870:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5871:2: ( ruleEString )
            {
            // InternalMyDsl.g:5871:2: ( ruleEString )
            // InternalMyDsl.g:5872:3: ruleEString
            {
             before(grammarAccess.getParticipantAccess().getNameEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParticipantAccess().getNameEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__NameAssignment_3_1"


    // $ANTLR start "rule__Participant__PoolsAssignment_6"
    // InternalMyDsl.g:5881:1: rule__Participant__PoolsAssignment_6 : ( rulePool ) ;
    public final void rule__Participant__PoolsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5885:1: ( ( rulePool ) )
            // InternalMyDsl.g:5886:2: ( rulePool )
            {
            // InternalMyDsl.g:5886:2: ( rulePool )
            // InternalMyDsl.g:5887:3: rulePool
            {
             before(grammarAccess.getParticipantAccess().getPoolsPoolParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulePool();

            state._fsp--;

             after(grammarAccess.getParticipantAccess().getPoolsPoolParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__PoolsAssignment_6"


    // $ANTLR start "rule__Participant__PoolsAssignment_7_1"
    // InternalMyDsl.g:5896:1: rule__Participant__PoolsAssignment_7_1 : ( rulePool ) ;
    public final void rule__Participant__PoolsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5900:1: ( ( rulePool ) )
            // InternalMyDsl.g:5901:2: ( rulePool )
            {
            // InternalMyDsl.g:5901:2: ( rulePool )
            // InternalMyDsl.g:5902:3: rulePool
            {
             before(grammarAccess.getParticipantAccess().getPoolsPoolParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            rulePool();

            state._fsp--;

             after(grammarAccess.getParticipantAccess().getPoolsPoolParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__PoolsAssignment_7_1"


    // $ANTLR start "rule__Process__IdAssignment_2"
    // InternalMyDsl.g:5911:1: rule__Process__IdAssignment_2 : ( ruleEString ) ;
    public final void rule__Process__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5915:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5916:2: ( ruleEString )
            {
            // InternalMyDsl.g:5916:2: ( ruleEString )
            // InternalMyDsl.g:5917:3: ruleEString
            {
             before(grammarAccess.getProcessAccess().getIdEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getIdEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__IdAssignment_2"


    // $ANTLR start "rule__Process__NameAssignment_4_1"
    // InternalMyDsl.g:5926:1: rule__Process__NameAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Process__NameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5930:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5931:2: ( ruleEString )
            {
            // InternalMyDsl.g:5931:2: ( ruleEString )
            // InternalMyDsl.g:5932:3: ruleEString
            {
             before(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__NameAssignment_4_1"


    // $ANTLR start "rule__Process__WorkflowParticipantsAssignment_5_2"
    // InternalMyDsl.g:5941:1: rule__Process__WorkflowParticipantsAssignment_5_2 : ( ruleParticipant ) ;
    public final void rule__Process__WorkflowParticipantsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5945:1: ( ( ruleParticipant ) )
            // InternalMyDsl.g:5946:2: ( ruleParticipant )
            {
            // InternalMyDsl.g:5946:2: ( ruleParticipant )
            // InternalMyDsl.g:5947:3: ruleParticipant
            {
             before(grammarAccess.getProcessAccess().getWorkflowParticipantsParticipantParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParticipant();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getWorkflowParticipantsParticipantParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__WorkflowParticipantsAssignment_5_2"


    // $ANTLR start "rule__Process__WorkflowParticipantsAssignment_5_3_1"
    // InternalMyDsl.g:5956:1: rule__Process__WorkflowParticipantsAssignment_5_3_1 : ( ruleParticipant ) ;
    public final void rule__Process__WorkflowParticipantsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5960:1: ( ( ruleParticipant ) )
            // InternalMyDsl.g:5961:2: ( ruleParticipant )
            {
            // InternalMyDsl.g:5961:2: ( ruleParticipant )
            // InternalMyDsl.g:5962:3: ruleParticipant
            {
             before(grammarAccess.getProcessAccess().getWorkflowParticipantsParticipantParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParticipant();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getWorkflowParticipantsParticipantParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__WorkflowParticipantsAssignment_5_3_1"


    // $ANTLR start "rule__Process__TransitionsAssignment_6_2"
    // InternalMyDsl.g:5971:1: rule__Process__TransitionsAssignment_6_2 : ( ruleTransition ) ;
    public final void rule__Process__TransitionsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5975:1: ( ( ruleTransition ) )
            // InternalMyDsl.g:5976:2: ( ruleTransition )
            {
            // InternalMyDsl.g:5976:2: ( ruleTransition )
            // InternalMyDsl.g:5977:3: ruleTransition
            {
             before(grammarAccess.getProcessAccess().getTransitionsTransitionParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getTransitionsTransitionParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__TransitionsAssignment_6_2"


    // $ANTLR start "rule__Process__TransitionsAssignment_6_3_1"
    // InternalMyDsl.g:5986:1: rule__Process__TransitionsAssignment_6_3_1 : ( ruleTransition ) ;
    public final void rule__Process__TransitionsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5990:1: ( ( ruleTransition ) )
            // InternalMyDsl.g:5991:2: ( ruleTransition )
            {
            // InternalMyDsl.g:5991:2: ( ruleTransition )
            // InternalMyDsl.g:5992:3: ruleTransition
            {
             before(grammarAccess.getProcessAccess().getTransitionsTransitionParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getTransitionsTransitionParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__TransitionsAssignment_6_3_1"


    // $ANTLR start "rule__Process__ActivitysetAssignment_7_2"
    // InternalMyDsl.g:6001:1: rule__Process__ActivitysetAssignment_7_2 : ( ruleActivitySet ) ;
    public final void rule__Process__ActivitysetAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6005:1: ( ( ruleActivitySet ) )
            // InternalMyDsl.g:6006:2: ( ruleActivitySet )
            {
            // InternalMyDsl.g:6006:2: ( ruleActivitySet )
            // InternalMyDsl.g:6007:3: ruleActivitySet
            {
             before(grammarAccess.getProcessAccess().getActivitysetActivitySetParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleActivitySet();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getActivitysetActivitySetParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__ActivitysetAssignment_7_2"


    // $ANTLR start "rule__Process__ActivitysetAssignment_7_3_1"
    // InternalMyDsl.g:6016:1: rule__Process__ActivitysetAssignment_7_3_1 : ( ruleActivitySet ) ;
    public final void rule__Process__ActivitysetAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6020:1: ( ( ruleActivitySet ) )
            // InternalMyDsl.g:6021:2: ( ruleActivitySet )
            {
            // InternalMyDsl.g:6021:2: ( ruleActivitySet )
            // InternalMyDsl.g:6022:3: ruleActivitySet
            {
             before(grammarAccess.getProcessAccess().getActivitysetActivitySetParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActivitySet();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getActivitysetActivitySetParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__ActivitysetAssignment_7_3_1"


    // $ANTLR start "rule__MessageFlow__SourceAssignment_3_1"
    // InternalMyDsl.g:6031:1: rule__MessageFlow__SourceAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__MessageFlow__SourceAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6035:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:6036:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:6036:2: ( ( ruleEString ) )
            // InternalMyDsl.g:6037:3: ( ruleEString )
            {
             before(grammarAccess.getMessageFlowAccess().getSourceMessageFlowValidCrossReference_3_1_0()); 
            // InternalMyDsl.g:6038:3: ( ruleEString )
            // InternalMyDsl.g:6039:4: ruleEString
            {
             before(grammarAccess.getMessageFlowAccess().getSourceMessageFlowValidEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMessageFlowAccess().getSourceMessageFlowValidEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getMessageFlowAccess().getSourceMessageFlowValidCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFlow__SourceAssignment_3_1"


    // $ANTLR start "rule__MessageFlow__TargetAssignment_4_1"
    // InternalMyDsl.g:6050:1: rule__MessageFlow__TargetAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__MessageFlow__TargetAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6054:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:6055:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:6055:2: ( ( ruleEString ) )
            // InternalMyDsl.g:6056:3: ( ruleEString )
            {
             before(grammarAccess.getMessageFlowAccess().getTargetMessageFlowValidCrossReference_4_1_0()); 
            // InternalMyDsl.g:6057:3: ( ruleEString )
            // InternalMyDsl.g:6058:4: ruleEString
            {
             before(grammarAccess.getMessageFlowAccess().getTargetMessageFlowValidEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMessageFlowAccess().getTargetMessageFlowValidEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getMessageFlowAccess().getTargetMessageFlowValidCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFlow__TargetAssignment_4_1"


    // $ANTLR start "rule__Pool__IdAssignment_1"
    // InternalMyDsl.g:6069:1: rule__Pool__IdAssignment_1 : ( ruleEString ) ;
    public final void rule__Pool__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6073:1: ( ( ruleEString ) )
            // InternalMyDsl.g:6074:2: ( ruleEString )
            {
            // InternalMyDsl.g:6074:2: ( ruleEString )
            // InternalMyDsl.g:6075:3: ruleEString
            {
             before(grammarAccess.getPoolAccess().getIdEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPoolAccess().getIdEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__IdAssignment_1"


    // $ANTLR start "rule__Pool__NameAssignment_3_1"
    // InternalMyDsl.g:6084:1: rule__Pool__NameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Pool__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6088:1: ( ( ruleEString ) )
            // InternalMyDsl.g:6089:2: ( ruleEString )
            {
            // InternalMyDsl.g:6089:2: ( ruleEString )
            // InternalMyDsl.g:6090:3: ruleEString
            {
             before(grammarAccess.getPoolAccess().getNameEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPoolAccess().getNameEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__NameAssignment_3_1"


    // $ANTLR start "rule__Pool__LanesAssignment_6"
    // InternalMyDsl.g:6099:1: rule__Pool__LanesAssignment_6 : ( ruleLane ) ;
    public final void rule__Pool__LanesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6103:1: ( ( ruleLane ) )
            // InternalMyDsl.g:6104:2: ( ruleLane )
            {
            // InternalMyDsl.g:6104:2: ( ruleLane )
            // InternalMyDsl.g:6105:3: ruleLane
            {
             before(grammarAccess.getPoolAccess().getLanesLaneParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleLane();

            state._fsp--;

             after(grammarAccess.getPoolAccess().getLanesLaneParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__LanesAssignment_6"


    // $ANTLR start "rule__Pool__LanesAssignment_7_1"
    // InternalMyDsl.g:6114:1: rule__Pool__LanesAssignment_7_1 : ( ruleLane ) ;
    public final void rule__Pool__LanesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6118:1: ( ( ruleLane ) )
            // InternalMyDsl.g:6119:2: ( ruleLane )
            {
            // InternalMyDsl.g:6119:2: ( ruleLane )
            // InternalMyDsl.g:6120:3: ruleLane
            {
             before(grammarAccess.getPoolAccess().getLanesLaneParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLane();

            state._fsp--;

             after(grammarAccess.getPoolAccess().getLanesLaneParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__LanesAssignment_7_1"


    // $ANTLR start "rule__Lane__IdAssignment_2"
    // InternalMyDsl.g:6129:1: rule__Lane__IdAssignment_2 : ( ruleEString ) ;
    public final void rule__Lane__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6133:1: ( ( ruleEString ) )
            // InternalMyDsl.g:6134:2: ( ruleEString )
            {
            // InternalMyDsl.g:6134:2: ( ruleEString )
            // InternalMyDsl.g:6135:3: ruleEString
            {
             before(grammarAccess.getLaneAccess().getIdEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLaneAccess().getIdEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__IdAssignment_2"


    // $ANTLR start "rule__Lane__NameAssignment_4_1"
    // InternalMyDsl.g:6144:1: rule__Lane__NameAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Lane__NameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6148:1: ( ( ruleEString ) )
            // InternalMyDsl.g:6149:2: ( ruleEString )
            {
            // InternalMyDsl.g:6149:2: ( ruleEString )
            // InternalMyDsl.g:6150:3: ruleEString
            {
             before(grammarAccess.getLaneAccess().getNameEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLaneAccess().getNameEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__NameAssignment_4_1"


    // $ANTLR start "rule__Lane__ActivitysetAssignment_5_1"
    // InternalMyDsl.g:6159:1: rule__Lane__ActivitysetAssignment_5_1 : ( ruleActivitySet ) ;
    public final void rule__Lane__ActivitysetAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6163:1: ( ( ruleActivitySet ) )
            // InternalMyDsl.g:6164:2: ( ruleActivitySet )
            {
            // InternalMyDsl.g:6164:2: ( ruleActivitySet )
            // InternalMyDsl.g:6165:3: ruleActivitySet
            {
             before(grammarAccess.getLaneAccess().getActivitysetActivitySetParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActivitySet();

            state._fsp--;

             after(grammarAccess.getLaneAccess().getActivitysetActivitySetParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__ActivitysetAssignment_5_1"


    // $ANTLR start "rule__ActivitySet__IdAssignment_1"
    // InternalMyDsl.g:6174:1: rule__ActivitySet__IdAssignment_1 : ( ruleEString ) ;
    public final void rule__ActivitySet__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6178:1: ( ( ruleEString ) )
            // InternalMyDsl.g:6179:2: ( ruleEString )
            {
            // InternalMyDsl.g:6179:2: ( ruleEString )
            // InternalMyDsl.g:6180:3: ruleEString
            {
             before(grammarAccess.getActivitySetAccess().getIdEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActivitySetAccess().getIdEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__IdAssignment_1"


    // $ANTLR start "rule__ActivitySet__NameAssignment_3_1"
    // InternalMyDsl.g:6189:1: rule__ActivitySet__NameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__ActivitySet__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6193:1: ( ( ruleEString ) )
            // InternalMyDsl.g:6194:2: ( ruleEString )
            {
            // InternalMyDsl.g:6194:2: ( ruleEString )
            // InternalMyDsl.g:6195:3: ruleEString
            {
             before(grammarAccess.getActivitySetAccess().getNameEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActivitySetAccess().getNameEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__NameAssignment_3_1"


    // $ANTLR start "rule__ActivitySet__ParticipantAssignment_4_1"
    // InternalMyDsl.g:6204:1: rule__ActivitySet__ParticipantAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__ActivitySet__ParticipantAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6208:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:6209:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:6209:2: ( ( ruleEString ) )
            // InternalMyDsl.g:6210:3: ( ruleEString )
            {
             before(grammarAccess.getActivitySetAccess().getParticipantParticipantCrossReference_4_1_0()); 
            // InternalMyDsl.g:6211:3: ( ruleEString )
            // InternalMyDsl.g:6212:4: ruleEString
            {
             before(grammarAccess.getActivitySetAccess().getParticipantParticipantEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActivitySetAccess().getParticipantParticipantEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getActivitySetAccess().getParticipantParticipantCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__ParticipantAssignment_4_1"


    // $ANTLR start "rule__ActivitySet__ActivitiesAssignment_7"
    // InternalMyDsl.g:6223:1: rule__ActivitySet__ActivitiesAssignment_7 : ( ruleActivity ) ;
    public final void rule__ActivitySet__ActivitiesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6227:1: ( ( ruleActivity ) )
            // InternalMyDsl.g:6228:2: ( ruleActivity )
            {
            // InternalMyDsl.g:6228:2: ( ruleActivity )
            // InternalMyDsl.g:6229:3: ruleActivity
            {
             before(grammarAccess.getActivitySetAccess().getActivitiesActivityParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleActivity();

            state._fsp--;

             after(grammarAccess.getActivitySetAccess().getActivitiesActivityParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__ActivitiesAssignment_7"


    // $ANTLR start "rule__ActivitySet__ActivitiesAssignment_8_1"
    // InternalMyDsl.g:6238:1: rule__ActivitySet__ActivitiesAssignment_8_1 : ( ruleActivity ) ;
    public final void rule__ActivitySet__ActivitiesAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6242:1: ( ( ruleActivity ) )
            // InternalMyDsl.g:6243:2: ( ruleActivity )
            {
            // InternalMyDsl.g:6243:2: ( ruleActivity )
            // InternalMyDsl.g:6244:3: ruleActivity
            {
             before(grammarAccess.getActivitySetAccess().getActivitiesActivityParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActivity();

            state._fsp--;

             after(grammarAccess.getActivitySetAccess().getActivitiesActivityParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__ActivitiesAssignment_8_1"


    // $ANTLR start "rule__Activity_Impl__IdAssignment_2"
    // InternalMyDsl.g:6253:1: rule__Activity_Impl__IdAssignment_2 : ( ruleEString ) ;
    public final void rule__Activity_Impl__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6257:1: ( ( ruleEString ) )
            // InternalMyDsl.g:6258:2: ( ruleEString )
            {
            // InternalMyDsl.g:6258:2: ( ruleEString )
            // InternalMyDsl.g:6259:3: ruleEString
            {
             before(grammarAccess.getActivity_ImplAccess().getIdEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActivity_ImplAccess().getIdEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity_Impl__IdAssignment_2"


    // $ANTLR start "rule__Activity_Impl__TitleAssignment_4_1"
    // InternalMyDsl.g:6268:1: rule__Activity_Impl__TitleAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Activity_Impl__TitleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6272:1: ( ( ruleEString ) )
            // InternalMyDsl.g:6273:2: ( ruleEString )
            {
            // InternalMyDsl.g:6273:2: ( ruleEString )
            // InternalMyDsl.g:6274:3: ruleEString
            {
             before(grammarAccess.getActivity_ImplAccess().getTitleEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActivity_ImplAccess().getTitleEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity_Impl__TitleAssignment_4_1"


    // $ANTLR start "rule__BlockActivity__IdAssignment_2"
    // InternalMyDsl.g:6283:1: rule__BlockActivity__IdAssignment_2 : ( ruleEString ) ;
    public final void rule__BlockActivity__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6287:1: ( ( ruleEString ) )
            // InternalMyDsl.g:6288:2: ( ruleEString )
            {
            // InternalMyDsl.g:6288:2: ( ruleEString )
            // InternalMyDsl.g:6289:3: ruleEString
            {
             before(grammarAccess.getBlockActivityAccess().getIdEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBlockActivityAccess().getIdEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockActivity__IdAssignment_2"


    // $ANTLR start "rule__BlockActivity__TitleAssignment_4_1"
    // InternalMyDsl.g:6298:1: rule__BlockActivity__TitleAssignment_4_1 : ( ruleEString ) ;
    public final void rule__BlockActivity__TitleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6302:1: ( ( ruleEString ) )
            // InternalMyDsl.g:6303:2: ( ruleEString )
            {
            // InternalMyDsl.g:6303:2: ( ruleEString )
            // InternalMyDsl.g:6304:3: ruleEString
            {
             before(grammarAccess.getBlockActivityAccess().getTitleEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBlockActivityAccess().getTitleEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockActivity__TitleAssignment_4_1"


    // $ANTLR start "rule__Event__IdAssignment_2"
    // InternalMyDsl.g:6313:1: rule__Event__IdAssignment_2 : ( ruleEString ) ;
    public final void rule__Event__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6317:1: ( ( ruleEString ) )
            // InternalMyDsl.g:6318:2: ( ruleEString )
            {
            // InternalMyDsl.g:6318:2: ( ruleEString )
            // InternalMyDsl.g:6319:3: ruleEString
            {
             before(grammarAccess.getEventAccess().getIdEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEventAccess().getIdEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__IdAssignment_2"


    // $ANTLR start "rule__Event__TitleAssignment_4_1"
    // InternalMyDsl.g:6328:1: rule__Event__TitleAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Event__TitleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6332:1: ( ( ruleEString ) )
            // InternalMyDsl.g:6333:2: ( ruleEString )
            {
            // InternalMyDsl.g:6333:2: ( ruleEString )
            // InternalMyDsl.g:6334:3: ruleEString
            {
             before(grammarAccess.getEventAccess().getTitleEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEventAccess().getTitleEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__TitleAssignment_4_1"


    // $ANTLR start "rule__Event__TimeAssignment_5_1"
    // InternalMyDsl.g:6343:1: rule__Event__TimeAssignment_5_1 : ( ruleEventTime ) ;
    public final void rule__Event__TimeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6347:1: ( ( ruleEventTime ) )
            // InternalMyDsl.g:6348:2: ( ruleEventTime )
            {
            // InternalMyDsl.g:6348:2: ( ruleEventTime )
            // InternalMyDsl.g:6349:3: ruleEventTime
            {
             before(grammarAccess.getEventAccess().getTimeEventTimeEnumRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEventTime();

            state._fsp--;

             after(grammarAccess.getEventAccess().getTimeEventTimeEnumRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__TimeAssignment_5_1"


    // $ANTLR start "rule__Event__TypeAssignment_6_1"
    // InternalMyDsl.g:6358:1: rule__Event__TypeAssignment_6_1 : ( ruleEventType ) ;
    public final void rule__Event__TypeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6362:1: ( ( ruleEventType ) )
            // InternalMyDsl.g:6363:2: ( ruleEventType )
            {
            // InternalMyDsl.g:6363:2: ( ruleEventType )
            // InternalMyDsl.g:6364:3: ruleEventType
            {
             before(grammarAccess.getEventAccess().getTypeEventTypeEnumRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEventType();

            state._fsp--;

             after(grammarAccess.getEventAccess().getTypeEventTypeEnumRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__TypeAssignment_6_1"


    // $ANTLR start "rule__Gateway__IdAssignment_2"
    // InternalMyDsl.g:6373:1: rule__Gateway__IdAssignment_2 : ( ruleEString ) ;
    public final void rule__Gateway__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6377:1: ( ( ruleEString ) )
            // InternalMyDsl.g:6378:2: ( ruleEString )
            {
            // InternalMyDsl.g:6378:2: ( ruleEString )
            // InternalMyDsl.g:6379:3: ruleEString
            {
             before(grammarAccess.getGatewayAccess().getIdEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGatewayAccess().getIdEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__IdAssignment_2"


    // $ANTLR start "rule__Gateway__TitleAssignment_4_1"
    // InternalMyDsl.g:6388:1: rule__Gateway__TitleAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Gateway__TitleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6392:1: ( ( ruleEString ) )
            // InternalMyDsl.g:6393:2: ( ruleEString )
            {
            // InternalMyDsl.g:6393:2: ( ruleEString )
            // InternalMyDsl.g:6394:3: ruleEString
            {
             before(grammarAccess.getGatewayAccess().getTitleEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGatewayAccess().getTitleEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__TitleAssignment_4_1"


    // $ANTLR start "rule__Gateway__RuleAssignment_5_1"
    // InternalMyDsl.g:6403:1: rule__Gateway__RuleAssignment_5_1 : ( ruleGateRule ) ;
    public final void rule__Gateway__RuleAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6407:1: ( ( ruleGateRule ) )
            // InternalMyDsl.g:6408:2: ( ruleGateRule )
            {
            // InternalMyDsl.g:6408:2: ( ruleGateRule )
            // InternalMyDsl.g:6409:3: ruleGateRule
            {
             before(grammarAccess.getGatewayAccess().getRuleGateRuleEnumRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGateRule();

            state._fsp--;

             after(grammarAccess.getGatewayAccess().getRuleGateRuleEnumRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__RuleAssignment_5_1"


    // $ANTLR start "rule__SubFlow__IdAssignment_2"
    // InternalMyDsl.g:6418:1: rule__SubFlow__IdAssignment_2 : ( ruleEString ) ;
    public final void rule__SubFlow__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6422:1: ( ( ruleEString ) )
            // InternalMyDsl.g:6423:2: ( ruleEString )
            {
            // InternalMyDsl.g:6423:2: ( ruleEString )
            // InternalMyDsl.g:6424:3: ruleEString
            {
             before(grammarAccess.getSubFlowAccess().getIdEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubFlowAccess().getIdEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFlow__IdAssignment_2"


    // $ANTLR start "rule__SubFlow__TitleAssignment_4_1"
    // InternalMyDsl.g:6433:1: rule__SubFlow__TitleAssignment_4_1 : ( ruleEString ) ;
    public final void rule__SubFlow__TitleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6437:1: ( ( ruleEString ) )
            // InternalMyDsl.g:6438:2: ( ruleEString )
            {
            // InternalMyDsl.g:6438:2: ( ruleEString )
            // InternalMyDsl.g:6439:3: ruleEString
            {
             before(grammarAccess.getSubFlowAccess().getTitleEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubFlowAccess().getTitleEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFlow__TitleAssignment_4_1"


    // $ANTLR start "rule__Transition__ConditionAssignment_2_1"
    // InternalMyDsl.g:6448:1: rule__Transition__ConditionAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Transition__ConditionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6452:1: ( ( ruleEString ) )
            // InternalMyDsl.g:6453:2: ( ruleEString )
            {
            // InternalMyDsl.g:6453:2: ( ruleEString )
            // InternalMyDsl.g:6454:3: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getConditionEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getConditionEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ConditionAssignment_2_1"


    // $ANTLR start "rule__Transition__SourceAssignment_4"
    // InternalMyDsl.g:6463:1: rule__Transition__SourceAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Transition__SourceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6467:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:6468:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:6468:2: ( ( ruleEString ) )
            // InternalMyDsl.g:6469:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getSourceTransitionValidCrossReference_4_0()); 
            // InternalMyDsl.g:6470:3: ( ruleEString )
            // InternalMyDsl.g:6471:4: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getSourceTransitionValidEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getSourceTransitionValidEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getSourceTransitionValidCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__SourceAssignment_4"


    // $ANTLR start "rule__Transition__TargetAssignment_6"
    // InternalMyDsl.g:6482:1: rule__Transition__TargetAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Transition__TargetAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6486:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:6487:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:6487:2: ( ( ruleEString ) )
            // InternalMyDsl.g:6488:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getTargetTransitionValidCrossReference_6_0()); 
            // InternalMyDsl.g:6489:3: ( ruleEString )
            // InternalMyDsl.g:6490:4: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getTargetTransitionValidEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getTargetTransitionValidEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getTargetTransitionValidCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__TargetAssignment_6"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000037000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000009000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001D01000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000C001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000020100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001101000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000300100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0053400000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000800001000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000C800001000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000000007C000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0020800001000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0100004000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000000L});

}