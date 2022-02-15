package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'XpdlRoot'", "'{'", "'diagramName'", "'participants'", "','", "'}'", "'process'", "'messageflows'", "'Participant'", "'name'", "'pools'", "'Process'", "'workflowParticipants'", "'transitions'", "'activityset'", "'MessageFlow'", "'source'", "'target'", "'Pool'", "'lanes'", "'Lane'", "'ActivitySet'", "'participant'", "'activities'", "'Activity'", "'title'", "'BlockActivity'", "'Event'", "'time'", "'type'", "'Gateway'", "'rule'", "'SubFlow'", "'Transition'", "'condition'", "'START'", "'INTERMEDIATE'", "'END'", "'NONE'", "'MESSAGE'", "'EROR'", "'RULE'", "'TIMER'", "'XOR'", "'OR'", "'AND'"
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "XpdlRoot";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleXpdlRoot"
    // InternalMyDsl.g:65:1: entryRuleXpdlRoot returns [EObject current=null] : iv_ruleXpdlRoot= ruleXpdlRoot EOF ;
    public final EObject entryRuleXpdlRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXpdlRoot = null;


        try {
            // InternalMyDsl.g:65:49: (iv_ruleXpdlRoot= ruleXpdlRoot EOF )
            // InternalMyDsl.g:66:2: iv_ruleXpdlRoot= ruleXpdlRoot EOF
            {
             newCompositeNode(grammarAccess.getXpdlRootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXpdlRoot=ruleXpdlRoot();

            state._fsp--;

             current =iv_ruleXpdlRoot; 
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
    // $ANTLR end "entryRuleXpdlRoot"


    // $ANTLR start "ruleXpdlRoot"
    // InternalMyDsl.g:72:1: ruleXpdlRoot returns [EObject current=null] : ( () otherlv_1= 'XpdlRoot' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'diagramName' ( (lv_diagramName_5_0= ruleEString ) ) )? (otherlv_6= 'participants' otherlv_7= '{' ( (lv_participants_8_0= ruleParticipant ) ) (otherlv_9= ',' ( (lv_participants_10_0= ruleParticipant ) ) )* otherlv_11= '}' )? (otherlv_12= 'process' otherlv_13= '{' ( (lv_process_14_0= ruleProcess ) ) (otherlv_15= ',' ( (lv_process_16_0= ruleProcess ) ) )* otherlv_17= '}' )? (otherlv_18= 'messageflows' otherlv_19= '{' ( (lv_messageflows_20_0= ruleMessageFlow ) ) (otherlv_21= ',' ( (lv_messageflows_22_0= ruleMessageFlow ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) ;
    public final EObject ruleXpdlRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_id_2_0 = null;

        AntlrDatatypeRuleToken lv_diagramName_5_0 = null;

        EObject lv_participants_8_0 = null;

        EObject lv_participants_10_0 = null;

        EObject lv_process_14_0 = null;

        EObject lv_process_16_0 = null;

        EObject lv_messageflows_20_0 = null;

        EObject lv_messageflows_22_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( ( () otherlv_1= 'XpdlRoot' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'diagramName' ( (lv_diagramName_5_0= ruleEString ) ) )? (otherlv_6= 'participants' otherlv_7= '{' ( (lv_participants_8_0= ruleParticipant ) ) (otherlv_9= ',' ( (lv_participants_10_0= ruleParticipant ) ) )* otherlv_11= '}' )? (otherlv_12= 'process' otherlv_13= '{' ( (lv_process_14_0= ruleProcess ) ) (otherlv_15= ',' ( (lv_process_16_0= ruleProcess ) ) )* otherlv_17= '}' )? (otherlv_18= 'messageflows' otherlv_19= '{' ( (lv_messageflows_20_0= ruleMessageFlow ) ) (otherlv_21= ',' ( (lv_messageflows_22_0= ruleMessageFlow ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) )
            // InternalMyDsl.g:79:2: ( () otherlv_1= 'XpdlRoot' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'diagramName' ( (lv_diagramName_5_0= ruleEString ) ) )? (otherlv_6= 'participants' otherlv_7= '{' ( (lv_participants_8_0= ruleParticipant ) ) (otherlv_9= ',' ( (lv_participants_10_0= ruleParticipant ) ) )* otherlv_11= '}' )? (otherlv_12= 'process' otherlv_13= '{' ( (lv_process_14_0= ruleProcess ) ) (otherlv_15= ',' ( (lv_process_16_0= ruleProcess ) ) )* otherlv_17= '}' )? (otherlv_18= 'messageflows' otherlv_19= '{' ( (lv_messageflows_20_0= ruleMessageFlow ) ) (otherlv_21= ',' ( (lv_messageflows_22_0= ruleMessageFlow ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            {
            // InternalMyDsl.g:79:2: ( () otherlv_1= 'XpdlRoot' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'diagramName' ( (lv_diagramName_5_0= ruleEString ) ) )? (otherlv_6= 'participants' otherlv_7= '{' ( (lv_participants_8_0= ruleParticipant ) ) (otherlv_9= ',' ( (lv_participants_10_0= ruleParticipant ) ) )* otherlv_11= '}' )? (otherlv_12= 'process' otherlv_13= '{' ( (lv_process_14_0= ruleProcess ) ) (otherlv_15= ',' ( (lv_process_16_0= ruleProcess ) ) )* otherlv_17= '}' )? (otherlv_18= 'messageflows' otherlv_19= '{' ( (lv_messageflows_20_0= ruleMessageFlow ) ) (otherlv_21= ',' ( (lv_messageflows_22_0= ruleMessageFlow ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            // InternalMyDsl.g:80:3: () otherlv_1= 'XpdlRoot' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'diagramName' ( (lv_diagramName_5_0= ruleEString ) ) )? (otherlv_6= 'participants' otherlv_7= '{' ( (lv_participants_8_0= ruleParticipant ) ) (otherlv_9= ',' ( (lv_participants_10_0= ruleParticipant ) ) )* otherlv_11= '}' )? (otherlv_12= 'process' otherlv_13= '{' ( (lv_process_14_0= ruleProcess ) ) (otherlv_15= ',' ( (lv_process_16_0= ruleProcess ) ) )* otherlv_17= '}' )? (otherlv_18= 'messageflows' otherlv_19= '{' ( (lv_messageflows_20_0= ruleMessageFlow ) ) (otherlv_21= ',' ( (lv_messageflows_22_0= ruleMessageFlow ) ) )* otherlv_23= '}' )? otherlv_24= '}'
            {
            // InternalMyDsl.g:80:3: ()
            // InternalMyDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXpdlRootAccess().getXpdlRootAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getXpdlRootAccess().getXpdlRootKeyword_1());
            		
            // InternalMyDsl.g:91:3: ( (lv_id_2_0= ruleEString ) )
            // InternalMyDsl.g:92:4: (lv_id_2_0= ruleEString )
            {
            // InternalMyDsl.g:92:4: (lv_id_2_0= ruleEString )
            // InternalMyDsl.g:93:5: lv_id_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getXpdlRootAccess().getIdEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_id_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXpdlRootRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getXpdlRootAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:114:3: (otherlv_4= 'diagramName' ( (lv_diagramName_5_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:115:4: otherlv_4= 'diagramName' ( (lv_diagramName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getXpdlRootAccess().getDiagramNameKeyword_4_0());
                    			
                    // InternalMyDsl.g:119:4: ( (lv_diagramName_5_0= ruleEString ) )
                    // InternalMyDsl.g:120:5: (lv_diagramName_5_0= ruleEString )
                    {
                    // InternalMyDsl.g:120:5: (lv_diagramName_5_0= ruleEString )
                    // InternalMyDsl.g:121:6: lv_diagramName_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getXpdlRootAccess().getDiagramNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_diagramName_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getXpdlRootRule());
                    						}
                    						set(
                    							current,
                    							"diagramName",
                    							lv_diagramName_5_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:139:3: (otherlv_6= 'participants' otherlv_7= '{' ( (lv_participants_8_0= ruleParticipant ) ) (otherlv_9= ',' ( (lv_participants_10_0= ruleParticipant ) ) )* otherlv_11= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:140:4: otherlv_6= 'participants' otherlv_7= '{' ( (lv_participants_8_0= ruleParticipant ) ) (otherlv_9= ',' ( (lv_participants_10_0= ruleParticipant ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getXpdlRootAccess().getParticipantsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getXpdlRootAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMyDsl.g:148:4: ( (lv_participants_8_0= ruleParticipant ) )
                    // InternalMyDsl.g:149:5: (lv_participants_8_0= ruleParticipant )
                    {
                    // InternalMyDsl.g:149:5: (lv_participants_8_0= ruleParticipant )
                    // InternalMyDsl.g:150:6: lv_participants_8_0= ruleParticipant
                    {

                    						newCompositeNode(grammarAccess.getXpdlRootAccess().getParticipantsParticipantParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_participants_8_0=ruleParticipant();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getXpdlRootRule());
                    						}
                    						add(
                    							current,
                    							"participants",
                    							lv_participants_8_0,
                    							"org.xtext.example.mydsl.MyDsl.Participant");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:167:4: (otherlv_9= ',' ( (lv_participants_10_0= ruleParticipant ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalMyDsl.g:168:5: otherlv_9= ',' ( (lv_participants_10_0= ruleParticipant ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_7); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getXpdlRootAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMyDsl.g:172:5: ( (lv_participants_10_0= ruleParticipant ) )
                    	    // InternalMyDsl.g:173:6: (lv_participants_10_0= ruleParticipant )
                    	    {
                    	    // InternalMyDsl.g:173:6: (lv_participants_10_0= ruleParticipant )
                    	    // InternalMyDsl.g:174:7: lv_participants_10_0= ruleParticipant
                    	    {

                    	    							newCompositeNode(grammarAccess.getXpdlRootAccess().getParticipantsParticipantParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_participants_10_0=ruleParticipant();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXpdlRootRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"participants",
                    	    								lv_participants_10_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Participant");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getXpdlRootAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:197:3: (otherlv_12= 'process' otherlv_13= '{' ( (lv_process_14_0= ruleProcess ) ) (otherlv_15= ',' ( (lv_process_16_0= ruleProcess ) ) )* otherlv_17= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:198:4: otherlv_12= 'process' otherlv_13= '{' ( (lv_process_14_0= ruleProcess ) ) (otherlv_15= ',' ( (lv_process_16_0= ruleProcess ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getXpdlRootAccess().getProcessKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_13, grammarAccess.getXpdlRootAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalMyDsl.g:206:4: ( (lv_process_14_0= ruleProcess ) )
                    // InternalMyDsl.g:207:5: (lv_process_14_0= ruleProcess )
                    {
                    // InternalMyDsl.g:207:5: (lv_process_14_0= ruleProcess )
                    // InternalMyDsl.g:208:6: lv_process_14_0= ruleProcess
                    {

                    						newCompositeNode(grammarAccess.getXpdlRootAccess().getProcessProcessParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_process_14_0=ruleProcess();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getXpdlRootRule());
                    						}
                    						add(
                    							current,
                    							"process",
                    							lv_process_14_0,
                    							"org.xtext.example.mydsl.MyDsl.Process");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:225:4: (otherlv_15= ',' ( (lv_process_16_0= ruleProcess ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDsl.g:226:5: otherlv_15= ',' ( (lv_process_16_0= ruleProcess ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_10); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getXpdlRootAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalMyDsl.g:230:5: ( (lv_process_16_0= ruleProcess ) )
                    	    // InternalMyDsl.g:231:6: (lv_process_16_0= ruleProcess )
                    	    {
                    	    // InternalMyDsl.g:231:6: (lv_process_16_0= ruleProcess )
                    	    // InternalMyDsl.g:232:7: lv_process_16_0= ruleProcess
                    	    {

                    	    							newCompositeNode(grammarAccess.getXpdlRootAccess().getProcessProcessParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_process_16_0=ruleProcess();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXpdlRootRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"process",
                    	    								lv_process_16_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Process");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_17, grammarAccess.getXpdlRootAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:255:3: (otherlv_18= 'messageflows' otherlv_19= '{' ( (lv_messageflows_20_0= ruleMessageFlow ) ) (otherlv_21= ',' ( (lv_messageflows_22_0= ruleMessageFlow ) ) )* otherlv_23= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:256:4: otherlv_18= 'messageflows' otherlv_19= '{' ( (lv_messageflows_20_0= ruleMessageFlow ) ) (otherlv_21= ',' ( (lv_messageflows_22_0= ruleMessageFlow ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_18, grammarAccess.getXpdlRootAccess().getMessageflowsKeyword_7_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_19, grammarAccess.getXpdlRootAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalMyDsl.g:264:4: ( (lv_messageflows_20_0= ruleMessageFlow ) )
                    // InternalMyDsl.g:265:5: (lv_messageflows_20_0= ruleMessageFlow )
                    {
                    // InternalMyDsl.g:265:5: (lv_messageflows_20_0= ruleMessageFlow )
                    // InternalMyDsl.g:266:6: lv_messageflows_20_0= ruleMessageFlow
                    {

                    						newCompositeNode(grammarAccess.getXpdlRootAccess().getMessageflowsMessageFlowParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_messageflows_20_0=ruleMessageFlow();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getXpdlRootRule());
                    						}
                    						add(
                    							current,
                    							"messageflows",
                    							lv_messageflows_20_0,
                    							"org.xtext.example.mydsl.MyDsl.MessageFlow");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:283:4: (otherlv_21= ',' ( (lv_messageflows_22_0= ruleMessageFlow ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==15) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMyDsl.g:284:5: otherlv_21= ',' ( (lv_messageflows_22_0= ruleMessageFlow ) )
                    	    {
                    	    otherlv_21=(Token)match(input,15,FOLLOW_12); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getXpdlRootAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalMyDsl.g:288:5: ( (lv_messageflows_22_0= ruleMessageFlow ) )
                    	    // InternalMyDsl.g:289:6: (lv_messageflows_22_0= ruleMessageFlow )
                    	    {
                    	    // InternalMyDsl.g:289:6: (lv_messageflows_22_0= ruleMessageFlow )
                    	    // InternalMyDsl.g:290:7: lv_messageflows_22_0= ruleMessageFlow
                    	    {

                    	    							newCompositeNode(grammarAccess.getXpdlRootAccess().getMessageflowsMessageFlowParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_messageflows_22_0=ruleMessageFlow();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXpdlRootRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"messageflows",
                    	    								lv_messageflows_22_0,
                    	    								"org.xtext.example.mydsl.MyDsl.MessageFlow");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_23, grammarAccess.getXpdlRootAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_24=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getXpdlRootAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleXpdlRoot"


    // $ANTLR start "entryRuleActivity"
    // InternalMyDsl.g:321:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // InternalMyDsl.g:321:49: (iv_ruleActivity= ruleActivity EOF )
            // InternalMyDsl.g:322:2: iv_ruleActivity= ruleActivity EOF
            {
             newCompositeNode(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivity=ruleActivity();

            state._fsp--;

             current =iv_ruleActivity; 
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
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // InternalMyDsl.g:328:1: ruleActivity returns [EObject current=null] : (this_Activity_Impl_0= ruleActivity_Impl | this_BlockActivity_1= ruleBlockActivity | this_Event_2= ruleEvent | this_Gateway_3= ruleGateway | this_SubFlow_4= ruleSubFlow ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        EObject this_Activity_Impl_0 = null;

        EObject this_BlockActivity_1 = null;

        EObject this_Event_2 = null;

        EObject this_Gateway_3 = null;

        EObject this_SubFlow_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:334:2: ( (this_Activity_Impl_0= ruleActivity_Impl | this_BlockActivity_1= ruleBlockActivity | this_Event_2= ruleEvent | this_Gateway_3= ruleGateway | this_SubFlow_4= ruleSubFlow ) )
            // InternalMyDsl.g:335:2: (this_Activity_Impl_0= ruleActivity_Impl | this_BlockActivity_1= ruleBlockActivity | this_Event_2= ruleEvent | this_Gateway_3= ruleGateway | this_SubFlow_4= ruleSubFlow )
            {
            // InternalMyDsl.g:335:2: (this_Activity_Impl_0= ruleActivity_Impl | this_BlockActivity_1= ruleBlockActivity | this_Event_2= ruleEvent | this_Gateway_3= ruleGateway | this_SubFlow_4= ruleSubFlow )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt8=1;
                }
                break;
            case 37:
                {
                alt8=2;
                }
                break;
            case 38:
                {
                alt8=3;
                }
                break;
            case 41:
                {
                alt8=4;
                }
                break;
            case 43:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:336:3: this_Activity_Impl_0= ruleActivity_Impl
                    {

                    			newCompositeNode(grammarAccess.getActivityAccess().getActivity_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Activity_Impl_0=ruleActivity_Impl();

                    state._fsp--;


                    			current = this_Activity_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:345:3: this_BlockActivity_1= ruleBlockActivity
                    {

                    			newCompositeNode(grammarAccess.getActivityAccess().getBlockActivityParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BlockActivity_1=ruleBlockActivity();

                    state._fsp--;


                    			current = this_BlockActivity_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:354:3: this_Event_2= ruleEvent
                    {

                    			newCompositeNode(grammarAccess.getActivityAccess().getEventParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Event_2=ruleEvent();

                    state._fsp--;


                    			current = this_Event_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:363:3: this_Gateway_3= ruleGateway
                    {

                    			newCompositeNode(grammarAccess.getActivityAccess().getGatewayParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Gateway_3=ruleGateway();

                    state._fsp--;


                    			current = this_Gateway_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:372:3: this_SubFlow_4= ruleSubFlow
                    {

                    			newCompositeNode(grammarAccess.getActivityAccess().getSubFlowParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_SubFlow_4=ruleSubFlow();

                    state._fsp--;


                    			current = this_SubFlow_4;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleActivity"


    // $ANTLR start "entryRuleParticipant"
    // InternalMyDsl.g:384:1: entryRuleParticipant returns [EObject current=null] : iv_ruleParticipant= ruleParticipant EOF ;
    public final EObject entryRuleParticipant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParticipant = null;


        try {
            // InternalMyDsl.g:384:52: (iv_ruleParticipant= ruleParticipant EOF )
            // InternalMyDsl.g:385:2: iv_ruleParticipant= ruleParticipant EOF
            {
             newCompositeNode(grammarAccess.getParticipantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParticipant=ruleParticipant();

            state._fsp--;

             current =iv_ruleParticipant; 
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
    // $ANTLR end "entryRuleParticipant"


    // $ANTLR start "ruleParticipant"
    // InternalMyDsl.g:391:1: ruleParticipant returns [EObject current=null] : (otherlv_0= 'Participant' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= 'pools' otherlv_6= '{' ( (lv_pools_7_0= rulePool ) ) (otherlv_8= ',' ( (lv_pools_9_0= rulePool ) ) )* otherlv_10= '}' otherlv_11= '}' ) ;
    public final EObject ruleParticipant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_id_1_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_pools_7_0 = null;

        EObject lv_pools_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:397:2: ( (otherlv_0= 'Participant' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= 'pools' otherlv_6= '{' ( (lv_pools_7_0= rulePool ) ) (otherlv_8= ',' ( (lv_pools_9_0= rulePool ) ) )* otherlv_10= '}' otherlv_11= '}' ) )
            // InternalMyDsl.g:398:2: (otherlv_0= 'Participant' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= 'pools' otherlv_6= '{' ( (lv_pools_7_0= rulePool ) ) (otherlv_8= ',' ( (lv_pools_9_0= rulePool ) ) )* otherlv_10= '}' otherlv_11= '}' )
            {
            // InternalMyDsl.g:398:2: (otherlv_0= 'Participant' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= 'pools' otherlv_6= '{' ( (lv_pools_7_0= rulePool ) ) (otherlv_8= ',' ( (lv_pools_9_0= rulePool ) ) )* otherlv_10= '}' otherlv_11= '}' )
            // InternalMyDsl.g:399:3: otherlv_0= 'Participant' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= 'pools' otherlv_6= '{' ( (lv_pools_7_0= rulePool ) ) (otherlv_8= ',' ( (lv_pools_9_0= rulePool ) ) )* otherlv_10= '}' otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParticipantAccess().getParticipantKeyword_0());
            		
            // InternalMyDsl.g:403:3: ( (lv_id_1_0= ruleEString ) )
            // InternalMyDsl.g:404:4: (lv_id_1_0= ruleEString )
            {
            // InternalMyDsl.g:404:4: (lv_id_1_0= ruleEString )
            // InternalMyDsl.g:405:5: lv_id_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParticipantAccess().getIdEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_id_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParticipantRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getParticipantAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:426:3: (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:427:4: otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getParticipantAccess().getNameKeyword_3_0());
                    			
                    // InternalMyDsl.g:431:4: ( (lv_name_4_0= ruleEString ) )
                    // InternalMyDsl.g:432:5: (lv_name_4_0= ruleEString )
                    {
                    // InternalMyDsl.g:432:5: (lv_name_4_0= ruleEString )
                    // InternalMyDsl.g:433:6: lv_name_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getParticipantAccess().getNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_name_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParticipantRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getParticipantAccess().getPoolsKeyword_4());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getParticipantAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalMyDsl.g:459:3: ( (lv_pools_7_0= rulePool ) )
            // InternalMyDsl.g:460:4: (lv_pools_7_0= rulePool )
            {
            // InternalMyDsl.g:460:4: (lv_pools_7_0= rulePool )
            // InternalMyDsl.g:461:5: lv_pools_7_0= rulePool
            {

            					newCompositeNode(grammarAccess.getParticipantAccess().getPoolsPoolParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_pools_7_0=rulePool();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParticipantRule());
            					}
            					add(
            						current,
            						"pools",
            						lv_pools_7_0,
            						"org.xtext.example.mydsl.MyDsl.Pool");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:478:3: (otherlv_8= ',' ( (lv_pools_9_0= rulePool ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:479:4: otherlv_8= ',' ( (lv_pools_9_0= rulePool ) )
            	    {
            	    otherlv_8=(Token)match(input,15,FOLLOW_16); 

            	    				newLeafNode(otherlv_8, grammarAccess.getParticipantAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalMyDsl.g:483:4: ( (lv_pools_9_0= rulePool ) )
            	    // InternalMyDsl.g:484:5: (lv_pools_9_0= rulePool )
            	    {
            	    // InternalMyDsl.g:484:5: (lv_pools_9_0= rulePool )
            	    // InternalMyDsl.g:485:6: lv_pools_9_0= rulePool
            	    {

            	    						newCompositeNode(grammarAccess.getParticipantAccess().getPoolsPoolParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_pools_9_0=rulePool();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getParticipantRule());
            	    						}
            	    						add(
            	    							current,
            	    							"pools",
            	    							lv_pools_9_0,
            	    							"org.xtext.example.mydsl.MyDsl.Pool");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_10, grammarAccess.getParticipantAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getParticipantAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleParticipant"


    // $ANTLR start "entryRuleProcess"
    // InternalMyDsl.g:515:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // InternalMyDsl.g:515:48: (iv_ruleProcess= ruleProcess EOF )
            // InternalMyDsl.g:516:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalMyDsl.g:522:1: ruleProcess returns [EObject current=null] : ( () otherlv_1= 'Process' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) )? (otherlv_6= 'workflowParticipants' otherlv_7= '{' ( (lv_workflowParticipants_8_0= ruleParticipant ) ) (otherlv_9= ',' ( (lv_workflowParticipants_10_0= ruleParticipant ) ) )* otherlv_11= '}' )? (otherlv_12= 'transitions' otherlv_13= '{' ( (lv_transitions_14_0= ruleTransition ) ) (otherlv_15= ',' ( (lv_transitions_16_0= ruleTransition ) ) )* otherlv_17= '}' )? (otherlv_18= 'activityset' otherlv_19= '{' ( (lv_activityset_20_0= ruleActivitySet ) ) (otherlv_21= ',' ( (lv_activityset_22_0= ruleActivitySet ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_id_2_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_workflowParticipants_8_0 = null;

        EObject lv_workflowParticipants_10_0 = null;

        EObject lv_transitions_14_0 = null;

        EObject lv_transitions_16_0 = null;

        EObject lv_activityset_20_0 = null;

        EObject lv_activityset_22_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:528:2: ( ( () otherlv_1= 'Process' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) )? (otherlv_6= 'workflowParticipants' otherlv_7= '{' ( (lv_workflowParticipants_8_0= ruleParticipant ) ) (otherlv_9= ',' ( (lv_workflowParticipants_10_0= ruleParticipant ) ) )* otherlv_11= '}' )? (otherlv_12= 'transitions' otherlv_13= '{' ( (lv_transitions_14_0= ruleTransition ) ) (otherlv_15= ',' ( (lv_transitions_16_0= ruleTransition ) ) )* otherlv_17= '}' )? (otherlv_18= 'activityset' otherlv_19= '{' ( (lv_activityset_20_0= ruleActivitySet ) ) (otherlv_21= ',' ( (lv_activityset_22_0= ruleActivitySet ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) )
            // InternalMyDsl.g:529:2: ( () otherlv_1= 'Process' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) )? (otherlv_6= 'workflowParticipants' otherlv_7= '{' ( (lv_workflowParticipants_8_0= ruleParticipant ) ) (otherlv_9= ',' ( (lv_workflowParticipants_10_0= ruleParticipant ) ) )* otherlv_11= '}' )? (otherlv_12= 'transitions' otherlv_13= '{' ( (lv_transitions_14_0= ruleTransition ) ) (otherlv_15= ',' ( (lv_transitions_16_0= ruleTransition ) ) )* otherlv_17= '}' )? (otherlv_18= 'activityset' otherlv_19= '{' ( (lv_activityset_20_0= ruleActivitySet ) ) (otherlv_21= ',' ( (lv_activityset_22_0= ruleActivitySet ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            {
            // InternalMyDsl.g:529:2: ( () otherlv_1= 'Process' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) )? (otherlv_6= 'workflowParticipants' otherlv_7= '{' ( (lv_workflowParticipants_8_0= ruleParticipant ) ) (otherlv_9= ',' ( (lv_workflowParticipants_10_0= ruleParticipant ) ) )* otherlv_11= '}' )? (otherlv_12= 'transitions' otherlv_13= '{' ( (lv_transitions_14_0= ruleTransition ) ) (otherlv_15= ',' ( (lv_transitions_16_0= ruleTransition ) ) )* otherlv_17= '}' )? (otherlv_18= 'activityset' otherlv_19= '{' ( (lv_activityset_20_0= ruleActivitySet ) ) (otherlv_21= ',' ( (lv_activityset_22_0= ruleActivitySet ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            // InternalMyDsl.g:530:3: () otherlv_1= 'Process' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) )? (otherlv_6= 'workflowParticipants' otherlv_7= '{' ( (lv_workflowParticipants_8_0= ruleParticipant ) ) (otherlv_9= ',' ( (lv_workflowParticipants_10_0= ruleParticipant ) ) )* otherlv_11= '}' )? (otherlv_12= 'transitions' otherlv_13= '{' ( (lv_transitions_14_0= ruleTransition ) ) (otherlv_15= ',' ( (lv_transitions_16_0= ruleTransition ) ) )* otherlv_17= '}' )? (otherlv_18= 'activityset' otherlv_19= '{' ( (lv_activityset_20_0= ruleActivitySet ) ) (otherlv_21= ',' ( (lv_activityset_22_0= ruleActivitySet ) ) )* otherlv_23= '}' )? otherlv_24= '}'
            {
            // InternalMyDsl.g:530:3: ()
            // InternalMyDsl.g:531:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProcessAccess().getProcessAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getProcessAccess().getProcessKeyword_1());
            		
            // InternalMyDsl.g:541:3: ( (lv_id_2_0= ruleEString ) )
            // InternalMyDsl.g:542:4: (lv_id_2_0= ruleEString )
            {
            // InternalMyDsl.g:542:4: (lv_id_2_0= ruleEString )
            // InternalMyDsl.g:543:5: lv_id_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProcessAccess().getIdEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_id_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:564:3: (otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:565:4: otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getProcessAccess().getNameKeyword_4_0());
                    			
                    // InternalMyDsl.g:569:4: ( (lv_name_5_0= ruleEString ) )
                    // InternalMyDsl.g:570:5: (lv_name_5_0= ruleEString )
                    {
                    // InternalMyDsl.g:570:5: (lv_name_5_0= ruleEString )
                    // InternalMyDsl.g:571:6: lv_name_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_name_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcessRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_5_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:589:3: (otherlv_6= 'workflowParticipants' otherlv_7= '{' ( (lv_workflowParticipants_8_0= ruleParticipant ) ) (otherlv_9= ',' ( (lv_workflowParticipants_10_0= ruleParticipant ) ) )* otherlv_11= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:590:4: otherlv_6= 'workflowParticipants' otherlv_7= '{' ( (lv_workflowParticipants_8_0= ruleParticipant ) ) (otherlv_9= ',' ( (lv_workflowParticipants_10_0= ruleParticipant ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getProcessAccess().getWorkflowParticipantsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMyDsl.g:598:4: ( (lv_workflowParticipants_8_0= ruleParticipant ) )
                    // InternalMyDsl.g:599:5: (lv_workflowParticipants_8_0= ruleParticipant )
                    {
                    // InternalMyDsl.g:599:5: (lv_workflowParticipants_8_0= ruleParticipant )
                    // InternalMyDsl.g:600:6: lv_workflowParticipants_8_0= ruleParticipant
                    {

                    						newCompositeNode(grammarAccess.getProcessAccess().getWorkflowParticipantsParticipantParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_workflowParticipants_8_0=ruleParticipant();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcessRule());
                    						}
                    						add(
                    							current,
                    							"workflowParticipants",
                    							lv_workflowParticipants_8_0,
                    							"org.xtext.example.mydsl.MyDsl.Participant");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:617:4: (otherlv_9= ',' ( (lv_workflowParticipants_10_0= ruleParticipant ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==15) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalMyDsl.g:618:5: otherlv_9= ',' ( (lv_workflowParticipants_10_0= ruleParticipant ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_7); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getProcessAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMyDsl.g:622:5: ( (lv_workflowParticipants_10_0= ruleParticipant ) )
                    	    // InternalMyDsl.g:623:6: (lv_workflowParticipants_10_0= ruleParticipant )
                    	    {
                    	    // InternalMyDsl.g:623:6: (lv_workflowParticipants_10_0= ruleParticipant )
                    	    // InternalMyDsl.g:624:7: lv_workflowParticipants_10_0= ruleParticipant
                    	    {

                    	    							newCompositeNode(grammarAccess.getProcessAccess().getWorkflowParticipantsParticipantParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_workflowParticipants_10_0=ruleParticipant();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProcessRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"workflowParticipants",
                    	    								lv_workflowParticipants_10_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Participant");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_19); 

                    				newLeafNode(otherlv_11, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:647:3: (otherlv_12= 'transitions' otherlv_13= '{' ( (lv_transitions_14_0= ruleTransition ) ) (otherlv_15= ',' ( (lv_transitions_16_0= ruleTransition ) ) )* otherlv_17= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:648:4: otherlv_12= 'transitions' otherlv_13= '{' ( (lv_transitions_14_0= ruleTransition ) ) (otherlv_15= ',' ( (lv_transitions_16_0= ruleTransition ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getProcessAccess().getTransitionsKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_20); 

                    				newLeafNode(otherlv_13, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalMyDsl.g:656:4: ( (lv_transitions_14_0= ruleTransition ) )
                    // InternalMyDsl.g:657:5: (lv_transitions_14_0= ruleTransition )
                    {
                    // InternalMyDsl.g:657:5: (lv_transitions_14_0= ruleTransition )
                    // InternalMyDsl.g:658:6: lv_transitions_14_0= ruleTransition
                    {

                    						newCompositeNode(grammarAccess.getProcessAccess().getTransitionsTransitionParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_transitions_14_0=ruleTransition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcessRule());
                    						}
                    						add(
                    							current,
                    							"transitions",
                    							lv_transitions_14_0,
                    							"org.xtext.example.mydsl.MyDsl.Transition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:675:4: (otherlv_15= ',' ( (lv_transitions_16_0= ruleTransition ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==15) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalMyDsl.g:676:5: otherlv_15= ',' ( (lv_transitions_16_0= ruleTransition ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_20); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getProcessAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalMyDsl.g:680:5: ( (lv_transitions_16_0= ruleTransition ) )
                    	    // InternalMyDsl.g:681:6: (lv_transitions_16_0= ruleTransition )
                    	    {
                    	    // InternalMyDsl.g:681:6: (lv_transitions_16_0= ruleTransition )
                    	    // InternalMyDsl.g:682:7: lv_transitions_16_0= ruleTransition
                    	    {

                    	    							newCompositeNode(grammarAccess.getProcessAccess().getTransitionsTransitionParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_transitions_16_0=ruleTransition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProcessRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"transitions",
                    	    								lv_transitions_16_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Transition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,16,FOLLOW_21); 

                    				newLeafNode(otherlv_17, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:705:3: (otherlv_18= 'activityset' otherlv_19= '{' ( (lv_activityset_20_0= ruleActivitySet ) ) (otherlv_21= ',' ( (lv_activityset_22_0= ruleActivitySet ) ) )* otherlv_23= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:706:4: otherlv_18= 'activityset' otherlv_19= '{' ( (lv_activityset_20_0= ruleActivitySet ) ) (otherlv_21= ',' ( (lv_activityset_22_0= ruleActivitySet ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_18, grammarAccess.getProcessAccess().getActivitysetKeyword_7_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_22); 

                    				newLeafNode(otherlv_19, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalMyDsl.g:714:4: ( (lv_activityset_20_0= ruleActivitySet ) )
                    // InternalMyDsl.g:715:5: (lv_activityset_20_0= ruleActivitySet )
                    {
                    // InternalMyDsl.g:715:5: (lv_activityset_20_0= ruleActivitySet )
                    // InternalMyDsl.g:716:6: lv_activityset_20_0= ruleActivitySet
                    {

                    						newCompositeNode(grammarAccess.getProcessAccess().getActivitysetActivitySetParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_activityset_20_0=ruleActivitySet();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcessRule());
                    						}
                    						add(
                    							current,
                    							"activityset",
                    							lv_activityset_20_0,
                    							"org.xtext.example.mydsl.MyDsl.ActivitySet");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:733:4: (otherlv_21= ',' ( (lv_activityset_22_0= ruleActivitySet ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==15) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalMyDsl.g:734:5: otherlv_21= ',' ( (lv_activityset_22_0= ruleActivitySet ) )
                    	    {
                    	    otherlv_21=(Token)match(input,15,FOLLOW_22); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getProcessAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalMyDsl.g:738:5: ( (lv_activityset_22_0= ruleActivitySet ) )
                    	    // InternalMyDsl.g:739:6: (lv_activityset_22_0= ruleActivitySet )
                    	    {
                    	    // InternalMyDsl.g:739:6: (lv_activityset_22_0= ruleActivitySet )
                    	    // InternalMyDsl.g:740:7: lv_activityset_22_0= ruleActivitySet
                    	    {

                    	    							newCompositeNode(grammarAccess.getProcessAccess().getActivitysetActivitySetParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_activityset_22_0=ruleActivitySet();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProcessRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"activityset",
                    	    								lv_activityset_22_0,
                    	    								"org.xtext.example.mydsl.MyDsl.ActivitySet");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_23, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_24=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleMessageFlow"
    // InternalMyDsl.g:771:1: entryRuleMessageFlow returns [EObject current=null] : iv_ruleMessageFlow= ruleMessageFlow EOF ;
    public final EObject entryRuleMessageFlow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageFlow = null;


        try {
            // InternalMyDsl.g:771:52: (iv_ruleMessageFlow= ruleMessageFlow EOF )
            // InternalMyDsl.g:772:2: iv_ruleMessageFlow= ruleMessageFlow EOF
            {
             newCompositeNode(grammarAccess.getMessageFlowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessageFlow=ruleMessageFlow();

            state._fsp--;

             current =iv_ruleMessageFlow; 
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
    // $ANTLR end "entryRuleMessageFlow"


    // $ANTLR start "ruleMessageFlow"
    // InternalMyDsl.g:778:1: ruleMessageFlow returns [EObject current=null] : ( () otherlv_1= 'MessageFlow' otherlv_2= '{' (otherlv_3= 'source' ( ( ruleEString ) ) )? (otherlv_5= 'target' ( ( ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleMessageFlow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalMyDsl.g:784:2: ( ( () otherlv_1= 'MessageFlow' otherlv_2= '{' (otherlv_3= 'source' ( ( ruleEString ) ) )? (otherlv_5= 'target' ( ( ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalMyDsl.g:785:2: ( () otherlv_1= 'MessageFlow' otherlv_2= '{' (otherlv_3= 'source' ( ( ruleEString ) ) )? (otherlv_5= 'target' ( ( ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalMyDsl.g:785:2: ( () otherlv_1= 'MessageFlow' otherlv_2= '{' (otherlv_3= 'source' ( ( ruleEString ) ) )? (otherlv_5= 'target' ( ( ruleEString ) ) )? otherlv_7= '}' )
            // InternalMyDsl.g:786:3: () otherlv_1= 'MessageFlow' otherlv_2= '{' (otherlv_3= 'source' ( ( ruleEString ) ) )? (otherlv_5= 'target' ( ( ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalMyDsl.g:786:3: ()
            // InternalMyDsl.g:787:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMessageFlowAccess().getMessageFlowAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageFlowAccess().getMessageFlowKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getMessageFlowAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:801:3: (otherlv_3= 'source' ( ( ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:802:4: otherlv_3= 'source' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMessageFlowAccess().getSourceKeyword_3_0());
                    			
                    // InternalMyDsl.g:806:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:807:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:807:5: ( ruleEString )
                    // InternalMyDsl.g:808:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMessageFlowRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMessageFlowAccess().getSourceMessageFlowValidCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:823:3: (otherlv_5= 'target' ( ( ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:824:4: otherlv_5= 'target' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getMessageFlowAccess().getTargetKeyword_4_0());
                    			
                    // InternalMyDsl.g:828:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:829:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:829:5: ( ruleEString )
                    // InternalMyDsl.g:830:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMessageFlowRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMessageFlowAccess().getTargetMessageFlowValidCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getMessageFlowAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleMessageFlow"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:853:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:853:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:854:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:860:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:866:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:867:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:867:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_ID) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:868:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:876:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePool"
    // InternalMyDsl.g:887:1: entryRulePool returns [EObject current=null] : iv_rulePool= rulePool EOF ;
    public final EObject entryRulePool() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePool = null;


        try {
            // InternalMyDsl.g:887:45: (iv_rulePool= rulePool EOF )
            // InternalMyDsl.g:888:2: iv_rulePool= rulePool EOF
            {
             newCompositeNode(grammarAccess.getPoolRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePool=rulePool();

            state._fsp--;

             current =iv_rulePool; 
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
    // $ANTLR end "entryRulePool"


    // $ANTLR start "rulePool"
    // InternalMyDsl.g:894:1: rulePool returns [EObject current=null] : (otherlv_0= 'Pool' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= 'lanes' otherlv_6= '{' ( (lv_lanes_7_0= ruleLane ) ) (otherlv_8= ',' ( (lv_lanes_9_0= ruleLane ) ) )* otherlv_10= '}' otherlv_11= '}' ) ;
    public final EObject rulePool() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_id_1_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_lanes_7_0 = null;

        EObject lv_lanes_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:900:2: ( (otherlv_0= 'Pool' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= 'lanes' otherlv_6= '{' ( (lv_lanes_7_0= ruleLane ) ) (otherlv_8= ',' ( (lv_lanes_9_0= ruleLane ) ) )* otherlv_10= '}' otherlv_11= '}' ) )
            // InternalMyDsl.g:901:2: (otherlv_0= 'Pool' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= 'lanes' otherlv_6= '{' ( (lv_lanes_7_0= ruleLane ) ) (otherlv_8= ',' ( (lv_lanes_9_0= ruleLane ) ) )* otherlv_10= '}' otherlv_11= '}' )
            {
            // InternalMyDsl.g:901:2: (otherlv_0= 'Pool' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= 'lanes' otherlv_6= '{' ( (lv_lanes_7_0= ruleLane ) ) (otherlv_8= ',' ( (lv_lanes_9_0= ruleLane ) ) )* otherlv_10= '}' otherlv_11= '}' )
            // InternalMyDsl.g:902:3: otherlv_0= 'Pool' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= 'lanes' otherlv_6= '{' ( (lv_lanes_7_0= ruleLane ) ) (otherlv_8= ',' ( (lv_lanes_9_0= ruleLane ) ) )* otherlv_10= '}' otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPoolAccess().getPoolKeyword_0());
            		
            // InternalMyDsl.g:906:3: ( (lv_id_1_0= ruleEString ) )
            // InternalMyDsl.g:907:4: (lv_id_1_0= ruleEString )
            {
            // InternalMyDsl.g:907:4: (lv_id_1_0= ruleEString )
            // InternalMyDsl.g:908:5: lv_id_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPoolAccess().getIdEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_id_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPoolRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getPoolAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:929:3: (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==20) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:930:4: otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getPoolAccess().getNameKeyword_3_0());
                    			
                    // InternalMyDsl.g:934:4: ( (lv_name_4_0= ruleEString ) )
                    // InternalMyDsl.g:935:5: (lv_name_4_0= ruleEString )
                    {
                    // InternalMyDsl.g:935:5: (lv_name_4_0= ruleEString )
                    // InternalMyDsl.g:936:6: lv_name_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPoolAccess().getNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_name_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPoolRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getPoolAccess().getLanesKeyword_4());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_6, grammarAccess.getPoolAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalMyDsl.g:962:3: ( (lv_lanes_7_0= ruleLane ) )
            // InternalMyDsl.g:963:4: (lv_lanes_7_0= ruleLane )
            {
            // InternalMyDsl.g:963:4: (lv_lanes_7_0= ruleLane )
            // InternalMyDsl.g:964:5: lv_lanes_7_0= ruleLane
            {

            					newCompositeNode(grammarAccess.getPoolAccess().getLanesLaneParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_lanes_7_0=ruleLane();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPoolRule());
            					}
            					add(
            						current,
            						"lanes",
            						lv_lanes_7_0,
            						"org.xtext.example.mydsl.MyDsl.Lane");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:981:3: (otherlv_8= ',' ( (lv_lanes_9_0= ruleLane ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==15) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:982:4: otherlv_8= ',' ( (lv_lanes_9_0= ruleLane ) )
            	    {
            	    otherlv_8=(Token)match(input,15,FOLLOW_27); 

            	    				newLeafNode(otherlv_8, grammarAccess.getPoolAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalMyDsl.g:986:4: ( (lv_lanes_9_0= ruleLane ) )
            	    // InternalMyDsl.g:987:5: (lv_lanes_9_0= ruleLane )
            	    {
            	    // InternalMyDsl.g:987:5: (lv_lanes_9_0= ruleLane )
            	    // InternalMyDsl.g:988:6: lv_lanes_9_0= ruleLane
            	    {

            	    						newCompositeNode(grammarAccess.getPoolAccess().getLanesLaneParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_lanes_9_0=ruleLane();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPoolRule());
            	    						}
            	    						add(
            	    							current,
            	    							"lanes",
            	    							lv_lanes_9_0,
            	    							"org.xtext.example.mydsl.MyDsl.Lane");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_10, grammarAccess.getPoolAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getPoolAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "rulePool"


    // $ANTLR start "entryRuleLane"
    // InternalMyDsl.g:1018:1: entryRuleLane returns [EObject current=null] : iv_ruleLane= ruleLane EOF ;
    public final EObject entryRuleLane() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLane = null;


        try {
            // InternalMyDsl.g:1018:45: (iv_ruleLane= ruleLane EOF )
            // InternalMyDsl.g:1019:2: iv_ruleLane= ruleLane EOF
            {
             newCompositeNode(grammarAccess.getLaneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLane=ruleLane();

            state._fsp--;

             current =iv_ruleLane; 
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
    // $ANTLR end "entryRuleLane"


    // $ANTLR start "ruleLane"
    // InternalMyDsl.g:1025:1: ruleLane returns [EObject current=null] : ( () otherlv_1= 'Lane' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) )? (otherlv_6= 'activityset' ( (lv_activityset_7_0= ruleActivitySet ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleLane() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_id_2_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_activityset_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1031:2: ( ( () otherlv_1= 'Lane' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) )? (otherlv_6= 'activityset' ( (lv_activityset_7_0= ruleActivitySet ) ) )? otherlv_8= '}' ) )
            // InternalMyDsl.g:1032:2: ( () otherlv_1= 'Lane' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) )? (otherlv_6= 'activityset' ( (lv_activityset_7_0= ruleActivitySet ) ) )? otherlv_8= '}' )
            {
            // InternalMyDsl.g:1032:2: ( () otherlv_1= 'Lane' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) )? (otherlv_6= 'activityset' ( (lv_activityset_7_0= ruleActivitySet ) ) )? otherlv_8= '}' )
            // InternalMyDsl.g:1033:3: () otherlv_1= 'Lane' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) )? (otherlv_6= 'activityset' ( (lv_activityset_7_0= ruleActivitySet ) ) )? otherlv_8= '}'
            {
            // InternalMyDsl.g:1033:3: ()
            // InternalMyDsl.g:1034:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLaneAccess().getLaneAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLaneAccess().getLaneKeyword_1());
            		
            // InternalMyDsl.g:1044:3: ( (lv_id_2_0= ruleEString ) )
            // InternalMyDsl.g:1045:4: (lv_id_2_0= ruleEString )
            {
            // InternalMyDsl.g:1045:4: (lv_id_2_0= ruleEString )
            // InternalMyDsl.g:1046:5: lv_id_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLaneAccess().getIdEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_id_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLaneRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_3, grammarAccess.getLaneAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:1067:3: (otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==20) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1068:4: otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getLaneAccess().getNameKeyword_4_0());
                    			
                    // InternalMyDsl.g:1072:4: ( (lv_name_5_0= ruleEString ) )
                    // InternalMyDsl.g:1073:5: (lv_name_5_0= ruleEString )
                    {
                    // InternalMyDsl.g:1073:5: (lv_name_5_0= ruleEString )
                    // InternalMyDsl.g:1074:6: lv_name_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLaneAccess().getNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_name_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLaneRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_5_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1092:3: (otherlv_6= 'activityset' ( (lv_activityset_7_0= ruleActivitySet ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==25) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:1093:4: otherlv_6= 'activityset' ( (lv_activityset_7_0= ruleActivitySet ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_22); 

                    				newLeafNode(otherlv_6, grammarAccess.getLaneAccess().getActivitysetKeyword_5_0());
                    			
                    // InternalMyDsl.g:1097:4: ( (lv_activityset_7_0= ruleActivitySet ) )
                    // InternalMyDsl.g:1098:5: (lv_activityset_7_0= ruleActivitySet )
                    {
                    // InternalMyDsl.g:1098:5: (lv_activityset_7_0= ruleActivitySet )
                    // InternalMyDsl.g:1099:6: lv_activityset_7_0= ruleActivitySet
                    {

                    						newCompositeNode(grammarAccess.getLaneAccess().getActivitysetActivitySetParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_activityset_7_0=ruleActivitySet();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLaneRule());
                    						}
                    						set(
                    							current,
                    							"activityset",
                    							lv_activityset_7_0,
                    							"org.xtext.example.mydsl.MyDsl.ActivitySet");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getLaneAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleLane"


    // $ANTLR start "entryRuleActivitySet"
    // InternalMyDsl.g:1125:1: entryRuleActivitySet returns [EObject current=null] : iv_ruleActivitySet= ruleActivitySet EOF ;
    public final EObject entryRuleActivitySet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivitySet = null;


        try {
            // InternalMyDsl.g:1125:52: (iv_ruleActivitySet= ruleActivitySet EOF )
            // InternalMyDsl.g:1126:2: iv_ruleActivitySet= ruleActivitySet EOF
            {
             newCompositeNode(grammarAccess.getActivitySetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivitySet=ruleActivitySet();

            state._fsp--;

             current =iv_ruleActivitySet; 
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
    // $ANTLR end "entryRuleActivitySet"


    // $ANTLR start "ruleActivitySet"
    // InternalMyDsl.g:1132:1: ruleActivitySet returns [EObject current=null] : (otherlv_0= 'ActivitySet' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= 'participant' ( ( ruleEString ) ) )? otherlv_7= 'activities' otherlv_8= '{' ( (lv_activities_9_0= ruleActivity ) ) (otherlv_10= ',' ( (lv_activities_11_0= ruleActivity ) ) )* otherlv_12= '}' otherlv_13= '}' ) ;
    public final EObject ruleActivitySet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_id_1_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_activities_9_0 = null;

        EObject lv_activities_11_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1138:2: ( (otherlv_0= 'ActivitySet' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= 'participant' ( ( ruleEString ) ) )? otherlv_7= 'activities' otherlv_8= '{' ( (lv_activities_9_0= ruleActivity ) ) (otherlv_10= ',' ( (lv_activities_11_0= ruleActivity ) ) )* otherlv_12= '}' otherlv_13= '}' ) )
            // InternalMyDsl.g:1139:2: (otherlv_0= 'ActivitySet' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= 'participant' ( ( ruleEString ) ) )? otherlv_7= 'activities' otherlv_8= '{' ( (lv_activities_9_0= ruleActivity ) ) (otherlv_10= ',' ( (lv_activities_11_0= ruleActivity ) ) )* otherlv_12= '}' otherlv_13= '}' )
            {
            // InternalMyDsl.g:1139:2: (otherlv_0= 'ActivitySet' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= 'participant' ( ( ruleEString ) ) )? otherlv_7= 'activities' otherlv_8= '{' ( (lv_activities_9_0= ruleActivity ) ) (otherlv_10= ',' ( (lv_activities_11_0= ruleActivity ) ) )* otherlv_12= '}' otherlv_13= '}' )
            // InternalMyDsl.g:1140:3: otherlv_0= 'ActivitySet' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= 'participant' ( ( ruleEString ) ) )? otherlv_7= 'activities' otherlv_8= '{' ( (lv_activities_9_0= ruleActivity ) ) (otherlv_10= ',' ( (lv_activities_11_0= ruleActivity ) ) )* otherlv_12= '}' otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActivitySetAccess().getActivitySetKeyword_0());
            		
            // InternalMyDsl.g:1144:3: ( (lv_id_1_0= ruleEString ) )
            // InternalMyDsl.g:1145:4: (lv_id_1_0= ruleEString )
            {
            // InternalMyDsl.g:1145:4: (lv_id_1_0= ruleEString )
            // InternalMyDsl.g:1146:5: lv_id_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActivitySetAccess().getIdEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_id_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActivitySetRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getActivitySetAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1167:3: (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==20) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:1168:4: otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getActivitySetAccess().getNameKeyword_3_0());
                    			
                    // InternalMyDsl.g:1172:4: ( (lv_name_4_0= ruleEString ) )
                    // InternalMyDsl.g:1173:5: (lv_name_4_0= ruleEString )
                    {
                    // InternalMyDsl.g:1173:5: (lv_name_4_0= ruleEString )
                    // InternalMyDsl.g:1174:6: lv_name_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getActivitySetAccess().getNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_name_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivitySetRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1192:3: (otherlv_5= 'participant' ( ( ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==33) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:1193:4: otherlv_5= 'participant' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getActivitySetAccess().getParticipantKeyword_4_0());
                    			
                    // InternalMyDsl.g:1197:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:1198:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:1198:5: ( ruleEString )
                    // InternalMyDsl.g:1199:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActivitySetRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getActivitySetAccess().getParticipantParticipantCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getActivitySetAccess().getActivitiesKeyword_5());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_8, grammarAccess.getActivitySetAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalMyDsl.g:1222:3: ( (lv_activities_9_0= ruleActivity ) )
            // InternalMyDsl.g:1223:4: (lv_activities_9_0= ruleActivity )
            {
            // InternalMyDsl.g:1223:4: (lv_activities_9_0= ruleActivity )
            // InternalMyDsl.g:1224:5: lv_activities_9_0= ruleActivity
            {

            					newCompositeNode(grammarAccess.getActivitySetAccess().getActivitiesActivityParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_8);
            lv_activities_9_0=ruleActivity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActivitySetRule());
            					}
            					add(
            						current,
            						"activities",
            						lv_activities_9_0,
            						"org.xtext.example.mydsl.MyDsl.Activity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1241:3: (otherlv_10= ',' ( (lv_activities_11_0= ruleActivity ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==15) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMyDsl.g:1242:4: otherlv_10= ',' ( (lv_activities_11_0= ruleActivity ) )
            	    {
            	    otherlv_10=(Token)match(input,15,FOLLOW_32); 

            	    				newLeafNode(otherlv_10, grammarAccess.getActivitySetAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalMyDsl.g:1246:4: ( (lv_activities_11_0= ruleActivity ) )
            	    // InternalMyDsl.g:1247:5: (lv_activities_11_0= ruleActivity )
            	    {
            	    // InternalMyDsl.g:1247:5: (lv_activities_11_0= ruleActivity )
            	    // InternalMyDsl.g:1248:6: lv_activities_11_0= ruleActivity
            	    {

            	    						newCompositeNode(grammarAccess.getActivitySetAccess().getActivitiesActivityParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_activities_11_0=ruleActivity();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getActivitySetRule());
            	    						}
            	    						add(
            	    							current,
            	    							"activities",
            	    							lv_activities_11_0,
            	    							"org.xtext.example.mydsl.MyDsl.Activity");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_12=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_12, grammarAccess.getActivitySetAccess().getRightCurlyBracketKeyword_9());
            		
            otherlv_13=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getActivitySetAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleActivitySet"


    // $ANTLR start "entryRuleActivity_Impl"
    // InternalMyDsl.g:1278:1: entryRuleActivity_Impl returns [EObject current=null] : iv_ruleActivity_Impl= ruleActivity_Impl EOF ;
    public final EObject entryRuleActivity_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity_Impl = null;


        try {
            // InternalMyDsl.g:1278:54: (iv_ruleActivity_Impl= ruleActivity_Impl EOF )
            // InternalMyDsl.g:1279:2: iv_ruleActivity_Impl= ruleActivity_Impl EOF
            {
             newCompositeNode(grammarAccess.getActivity_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivity_Impl=ruleActivity_Impl();

            state._fsp--;

             current =iv_ruleActivity_Impl; 
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
    // $ANTLR end "entryRuleActivity_Impl"


    // $ANTLR start "ruleActivity_Impl"
    // InternalMyDsl.g:1285:1: ruleActivity_Impl returns [EObject current=null] : ( () otherlv_1= 'Activity' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleActivity_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_id_2_0 = null;

        AntlrDatatypeRuleToken lv_title_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1291:2: ( ( () otherlv_1= 'Activity' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalMyDsl.g:1292:2: ( () otherlv_1= 'Activity' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalMyDsl.g:1292:2: ( () otherlv_1= 'Activity' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalMyDsl.g:1293:3: () otherlv_1= 'Activity' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalMyDsl.g:1293:3: ()
            // InternalMyDsl.g:1294:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActivity_ImplAccess().getActivityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getActivity_ImplAccess().getActivityKeyword_1());
            		
            // InternalMyDsl.g:1304:3: ( (lv_id_2_0= ruleEString ) )
            // InternalMyDsl.g:1305:4: (lv_id_2_0= ruleEString )
            {
            // InternalMyDsl.g:1305:4: (lv_id_2_0= ruleEString )
            // InternalMyDsl.g:1306:5: lv_id_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActivity_ImplAccess().getIdEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_id_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActivity_ImplRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_3, grammarAccess.getActivity_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:1327:3: (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==36) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:1328:4: otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getActivity_ImplAccess().getTitleKeyword_4_0());
                    			
                    // InternalMyDsl.g:1332:4: ( (lv_title_5_0= ruleEString ) )
                    // InternalMyDsl.g:1333:5: (lv_title_5_0= ruleEString )
                    {
                    // InternalMyDsl.g:1333:5: (lv_title_5_0= ruleEString )
                    // InternalMyDsl.g:1334:6: lv_title_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getActivity_ImplAccess().getTitleEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_title_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivity_ImplRule());
                    						}
                    						set(
                    							current,
                    							"title",
                    							lv_title_5_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getActivity_ImplAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleActivity_Impl"


    // $ANTLR start "entryRuleBlockActivity"
    // InternalMyDsl.g:1360:1: entryRuleBlockActivity returns [EObject current=null] : iv_ruleBlockActivity= ruleBlockActivity EOF ;
    public final EObject entryRuleBlockActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockActivity = null;


        try {
            // InternalMyDsl.g:1360:54: (iv_ruleBlockActivity= ruleBlockActivity EOF )
            // InternalMyDsl.g:1361:2: iv_ruleBlockActivity= ruleBlockActivity EOF
            {
             newCompositeNode(grammarAccess.getBlockActivityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlockActivity=ruleBlockActivity();

            state._fsp--;

             current =iv_ruleBlockActivity; 
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
    // $ANTLR end "entryRuleBlockActivity"


    // $ANTLR start "ruleBlockActivity"
    // InternalMyDsl.g:1367:1: ruleBlockActivity returns [EObject current=null] : ( () otherlv_1= 'BlockActivity' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleBlockActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_id_2_0 = null;

        AntlrDatatypeRuleToken lv_title_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1373:2: ( ( () otherlv_1= 'BlockActivity' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalMyDsl.g:1374:2: ( () otherlv_1= 'BlockActivity' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalMyDsl.g:1374:2: ( () otherlv_1= 'BlockActivity' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalMyDsl.g:1375:3: () otherlv_1= 'BlockActivity' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalMyDsl.g:1375:3: ()
            // InternalMyDsl.g:1376:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBlockActivityAccess().getBlockActivityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBlockActivityAccess().getBlockActivityKeyword_1());
            		
            // InternalMyDsl.g:1386:3: ( (lv_id_2_0= ruleEString ) )
            // InternalMyDsl.g:1387:4: (lv_id_2_0= ruleEString )
            {
            // InternalMyDsl.g:1387:4: (lv_id_2_0= ruleEString )
            // InternalMyDsl.g:1388:5: lv_id_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBlockActivityAccess().getIdEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_id_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBlockActivityRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_3, grammarAccess.getBlockActivityAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:1409:3: (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==36) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:1410:4: otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getBlockActivityAccess().getTitleKeyword_4_0());
                    			
                    // InternalMyDsl.g:1414:4: ( (lv_title_5_0= ruleEString ) )
                    // InternalMyDsl.g:1415:5: (lv_title_5_0= ruleEString )
                    {
                    // InternalMyDsl.g:1415:5: (lv_title_5_0= ruleEString )
                    // InternalMyDsl.g:1416:6: lv_title_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBlockActivityAccess().getTitleEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_title_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBlockActivityRule());
                    						}
                    						set(
                    							current,
                    							"title",
                    							lv_title_5_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getBlockActivityAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleBlockActivity"


    // $ANTLR start "entryRuleEvent"
    // InternalMyDsl.g:1442:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalMyDsl.g:1442:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalMyDsl.g:1443:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalMyDsl.g:1449:1: ruleEvent returns [EObject current=null] : ( () otherlv_1= 'Event' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'time' ( (lv_time_7_0= ruleEventTime ) ) )? (otherlv_8= 'type' ( (lv_type_9_0= ruleEventType ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_id_2_0 = null;

        AntlrDatatypeRuleToken lv_title_5_0 = null;

        Enumerator lv_time_7_0 = null;

        Enumerator lv_type_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1455:2: ( ( () otherlv_1= 'Event' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'time' ( (lv_time_7_0= ruleEventTime ) ) )? (otherlv_8= 'type' ( (lv_type_9_0= ruleEventType ) ) )? otherlv_10= '}' ) )
            // InternalMyDsl.g:1456:2: ( () otherlv_1= 'Event' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'time' ( (lv_time_7_0= ruleEventTime ) ) )? (otherlv_8= 'type' ( (lv_type_9_0= ruleEventType ) ) )? otherlv_10= '}' )
            {
            // InternalMyDsl.g:1456:2: ( () otherlv_1= 'Event' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'time' ( (lv_time_7_0= ruleEventTime ) ) )? (otherlv_8= 'type' ( (lv_type_9_0= ruleEventType ) ) )? otherlv_10= '}' )
            // InternalMyDsl.g:1457:3: () otherlv_1= 'Event' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'time' ( (lv_time_7_0= ruleEventTime ) ) )? (otherlv_8= 'type' ( (lv_type_9_0= ruleEventType ) ) )? otherlv_10= '}'
            {
            // InternalMyDsl.g:1457:3: ()
            // InternalMyDsl.g:1458:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEventAccess().getEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEventAccess().getEventKeyword_1());
            		
            // InternalMyDsl.g:1468:3: ( (lv_id_2_0= ruleEString ) )
            // InternalMyDsl.g:1469:4: (lv_id_2_0= ruleEString )
            {
            // InternalMyDsl.g:1469:4: (lv_id_2_0= ruleEString )
            // InternalMyDsl.g:1470:5: lv_id_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEventAccess().getIdEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_id_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_3, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:1491:3: (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==36) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:1492:4: otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getEventAccess().getTitleKeyword_4_0());
                    			
                    // InternalMyDsl.g:1496:4: ( (lv_title_5_0= ruleEString ) )
                    // InternalMyDsl.g:1497:5: (lv_title_5_0= ruleEString )
                    {
                    // InternalMyDsl.g:1497:5: (lv_title_5_0= ruleEString )
                    // InternalMyDsl.g:1498:6: lv_title_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getTitleEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_title_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						set(
                    							current,
                    							"title",
                    							lv_title_5_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1516:3: (otherlv_6= 'time' ( (lv_time_7_0= ruleEventTime ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==39) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:1517:4: otherlv_6= 'time' ( (lv_time_7_0= ruleEventTime ) )
                    {
                    otherlv_6=(Token)match(input,39,FOLLOW_36); 

                    				newLeafNode(otherlv_6, grammarAccess.getEventAccess().getTimeKeyword_5_0());
                    			
                    // InternalMyDsl.g:1521:4: ( (lv_time_7_0= ruleEventTime ) )
                    // InternalMyDsl.g:1522:5: (lv_time_7_0= ruleEventTime )
                    {
                    // InternalMyDsl.g:1522:5: (lv_time_7_0= ruleEventTime )
                    // InternalMyDsl.g:1523:6: lv_time_7_0= ruleEventTime
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getTimeEventTimeEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_time_7_0=ruleEventTime();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						set(
                    							current,
                    							"time",
                    							lv_time_7_0,
                    							"org.xtext.example.mydsl.MyDsl.EventTime");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1541:3: (otherlv_8= 'type' ( (lv_type_9_0= ruleEventType ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==40) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:1542:4: otherlv_8= 'type' ( (lv_type_9_0= ruleEventType ) )
                    {
                    otherlv_8=(Token)match(input,40,FOLLOW_38); 

                    				newLeafNode(otherlv_8, grammarAccess.getEventAccess().getTypeKeyword_6_0());
                    			
                    // InternalMyDsl.g:1546:4: ( (lv_type_9_0= ruleEventType ) )
                    // InternalMyDsl.g:1547:5: (lv_type_9_0= ruleEventType )
                    {
                    // InternalMyDsl.g:1547:5: (lv_type_9_0= ruleEventType )
                    // InternalMyDsl.g:1548:6: lv_type_9_0= ruleEventType
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getTypeEventTypeEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_type_9_0=ruleEventType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_9_0,
                    							"org.xtext.example.mydsl.MyDsl.EventType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleGateway"
    // InternalMyDsl.g:1574:1: entryRuleGateway returns [EObject current=null] : iv_ruleGateway= ruleGateway EOF ;
    public final EObject entryRuleGateway() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGateway = null;


        try {
            // InternalMyDsl.g:1574:48: (iv_ruleGateway= ruleGateway EOF )
            // InternalMyDsl.g:1575:2: iv_ruleGateway= ruleGateway EOF
            {
             newCompositeNode(grammarAccess.getGatewayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGateway=ruleGateway();

            state._fsp--;

             current =iv_ruleGateway; 
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
    // $ANTLR end "entryRuleGateway"


    // $ANTLR start "ruleGateway"
    // InternalMyDsl.g:1581:1: ruleGateway returns [EObject current=null] : ( () otherlv_1= 'Gateway' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'rule' ( (lv_rule_7_0= ruleGateRule ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleGateway() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_id_2_0 = null;

        AntlrDatatypeRuleToken lv_title_5_0 = null;

        Enumerator lv_rule_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1587:2: ( ( () otherlv_1= 'Gateway' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'rule' ( (lv_rule_7_0= ruleGateRule ) ) )? otherlv_8= '}' ) )
            // InternalMyDsl.g:1588:2: ( () otherlv_1= 'Gateway' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'rule' ( (lv_rule_7_0= ruleGateRule ) ) )? otherlv_8= '}' )
            {
            // InternalMyDsl.g:1588:2: ( () otherlv_1= 'Gateway' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'rule' ( (lv_rule_7_0= ruleGateRule ) ) )? otherlv_8= '}' )
            // InternalMyDsl.g:1589:3: () otherlv_1= 'Gateway' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'rule' ( (lv_rule_7_0= ruleGateRule ) ) )? otherlv_8= '}'
            {
            // InternalMyDsl.g:1589:3: ()
            // InternalMyDsl.g:1590:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGatewayAccess().getGatewayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGatewayAccess().getGatewayKeyword_1());
            		
            // InternalMyDsl.g:1600:3: ( (lv_id_2_0= ruleEString ) )
            // InternalMyDsl.g:1601:4: (lv_id_2_0= ruleEString )
            {
            // InternalMyDsl.g:1601:4: (lv_id_2_0= ruleEString )
            // InternalMyDsl.g:1602:5: lv_id_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGatewayAccess().getIdEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_id_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGatewayRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getGatewayAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:1623:3: (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==36) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:1624:4: otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getGatewayAccess().getTitleKeyword_4_0());
                    			
                    // InternalMyDsl.g:1628:4: ( (lv_title_5_0= ruleEString ) )
                    // InternalMyDsl.g:1629:5: (lv_title_5_0= ruleEString )
                    {
                    // InternalMyDsl.g:1629:5: (lv_title_5_0= ruleEString )
                    // InternalMyDsl.g:1630:6: lv_title_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGatewayAccess().getTitleEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_title_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGatewayRule());
                    						}
                    						set(
                    							current,
                    							"title",
                    							lv_title_5_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1648:3: (otherlv_6= 'rule' ( (lv_rule_7_0= ruleGateRule ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==42) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:1649:4: otherlv_6= 'rule' ( (lv_rule_7_0= ruleGateRule ) )
                    {
                    otherlv_6=(Token)match(input,42,FOLLOW_41); 

                    				newLeafNode(otherlv_6, grammarAccess.getGatewayAccess().getRuleKeyword_5_0());
                    			
                    // InternalMyDsl.g:1653:4: ( (lv_rule_7_0= ruleGateRule ) )
                    // InternalMyDsl.g:1654:5: (lv_rule_7_0= ruleGateRule )
                    {
                    // InternalMyDsl.g:1654:5: (lv_rule_7_0= ruleGateRule )
                    // InternalMyDsl.g:1655:6: lv_rule_7_0= ruleGateRule
                    {

                    						newCompositeNode(grammarAccess.getGatewayAccess().getRuleGateRuleEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_rule_7_0=ruleGateRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGatewayRule());
                    						}
                    						set(
                    							current,
                    							"rule",
                    							lv_rule_7_0,
                    							"org.xtext.example.mydsl.MyDsl.GateRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getGatewayAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleGateway"


    // $ANTLR start "entryRuleSubFlow"
    // InternalMyDsl.g:1681:1: entryRuleSubFlow returns [EObject current=null] : iv_ruleSubFlow= ruleSubFlow EOF ;
    public final EObject entryRuleSubFlow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubFlow = null;


        try {
            // InternalMyDsl.g:1681:48: (iv_ruleSubFlow= ruleSubFlow EOF )
            // InternalMyDsl.g:1682:2: iv_ruleSubFlow= ruleSubFlow EOF
            {
             newCompositeNode(grammarAccess.getSubFlowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubFlow=ruleSubFlow();

            state._fsp--;

             current =iv_ruleSubFlow; 
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
    // $ANTLR end "entryRuleSubFlow"


    // $ANTLR start "ruleSubFlow"
    // InternalMyDsl.g:1688:1: ruleSubFlow returns [EObject current=null] : ( () otherlv_1= 'SubFlow' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleSubFlow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_id_2_0 = null;

        AntlrDatatypeRuleToken lv_title_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1694:2: ( ( () otherlv_1= 'SubFlow' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalMyDsl.g:1695:2: ( () otherlv_1= 'SubFlow' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalMyDsl.g:1695:2: ( () otherlv_1= 'SubFlow' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalMyDsl.g:1696:3: () otherlv_1= 'SubFlow' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalMyDsl.g:1696:3: ()
            // InternalMyDsl.g:1697:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSubFlowAccess().getSubFlowAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSubFlowAccess().getSubFlowKeyword_1());
            		
            // InternalMyDsl.g:1707:3: ( (lv_id_2_0= ruleEString ) )
            // InternalMyDsl.g:1708:4: (lv_id_2_0= ruleEString )
            {
            // InternalMyDsl.g:1708:4: (lv_id_2_0= ruleEString )
            // InternalMyDsl.g:1709:5: lv_id_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSubFlowAccess().getIdEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_id_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubFlowRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_3, grammarAccess.getSubFlowAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:1730:3: (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==36) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:1731:4: otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getSubFlowAccess().getTitleKeyword_4_0());
                    			
                    // InternalMyDsl.g:1735:4: ( (lv_title_5_0= ruleEString ) )
                    // InternalMyDsl.g:1736:5: (lv_title_5_0= ruleEString )
                    {
                    // InternalMyDsl.g:1736:5: (lv_title_5_0= ruleEString )
                    // InternalMyDsl.g:1737:6: lv_title_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSubFlowAccess().getTitleEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_title_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubFlowRule());
                    						}
                    						set(
                    							current,
                    							"title",
                    							lv_title_5_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSubFlowAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleSubFlow"


    // $ANTLR start "entryRuleTransition"
    // InternalMyDsl.g:1763:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalMyDsl.g:1763:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalMyDsl.g:1764:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalMyDsl.g:1770:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'Transition' otherlv_1= '{' (otherlv_2= 'condition' ( (lv_condition_3_0= ruleEString ) ) )? otherlv_4= 'source' ( ( ruleEString ) ) otherlv_6= 'target' ( ( ruleEString ) ) otherlv_8= '}' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_condition_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1776:2: ( (otherlv_0= 'Transition' otherlv_1= '{' (otherlv_2= 'condition' ( (lv_condition_3_0= ruleEString ) ) )? otherlv_4= 'source' ( ( ruleEString ) ) otherlv_6= 'target' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalMyDsl.g:1777:2: (otherlv_0= 'Transition' otherlv_1= '{' (otherlv_2= 'condition' ( (lv_condition_3_0= ruleEString ) ) )? otherlv_4= 'source' ( ( ruleEString ) ) otherlv_6= 'target' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalMyDsl.g:1777:2: (otherlv_0= 'Transition' otherlv_1= '{' (otherlv_2= 'condition' ( (lv_condition_3_0= ruleEString ) ) )? otherlv_4= 'source' ( ( ruleEString ) ) otherlv_6= 'target' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalMyDsl.g:1778:3: otherlv_0= 'Transition' otherlv_1= '{' (otherlv_2= 'condition' ( (lv_condition_3_0= ruleEString ) ) )? otherlv_4= 'source' ( ( ruleEString ) ) otherlv_6= 'target' ( ( ruleEString ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_42); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:1786:3: (otherlv_2= 'condition' ( (lv_condition_3_0= ruleEString ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==45) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyDsl.g:1787:4: otherlv_2= 'condition' ( (lv_condition_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,45,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getConditionKeyword_2_0());
                    			
                    // InternalMyDsl.g:1791:4: ( (lv_condition_3_0= ruleEString ) )
                    // InternalMyDsl.g:1792:5: (lv_condition_3_0= ruleEString )
                    {
                    // InternalMyDsl.g:1792:5: (lv_condition_3_0= ruleEString )
                    // InternalMyDsl.g:1793:6: lv_condition_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTransitionAccess().getConditionEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_condition_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransitionRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_3_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getSourceKeyword_3());
            		
            // InternalMyDsl.g:1815:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1816:4: ( ruleEString )
            {
            // InternalMyDsl.g:1816:4: ( ruleEString )
            // InternalMyDsl.g:1817:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getSourceTransitionValidCrossReference_4_0());
            				
            pushFollow(FOLLOW_44);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getTargetKeyword_5());
            		
            // InternalMyDsl.g:1835:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1836:4: ( ruleEString )
            {
            // InternalMyDsl.g:1836:4: ( ruleEString )
            // InternalMyDsl.g:1837:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getTargetTransitionValidCrossReference_6_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "ruleEventTime"
    // InternalMyDsl.g:1859:1: ruleEventTime returns [Enumerator current=null] : ( (enumLiteral_0= 'START' ) | (enumLiteral_1= 'INTERMEDIATE' ) | (enumLiteral_2= 'END' ) ) ;
    public final Enumerator ruleEventTime() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1865:2: ( ( (enumLiteral_0= 'START' ) | (enumLiteral_1= 'INTERMEDIATE' ) | (enumLiteral_2= 'END' ) ) )
            // InternalMyDsl.g:1866:2: ( (enumLiteral_0= 'START' ) | (enumLiteral_1= 'INTERMEDIATE' ) | (enumLiteral_2= 'END' ) )
            {
            // InternalMyDsl.g:1866:2: ( (enumLiteral_0= 'START' ) | (enumLiteral_1= 'INTERMEDIATE' ) | (enumLiteral_2= 'END' ) )
            int alt37=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt37=1;
                }
                break;
            case 47:
                {
                alt37=2;
                }
                break;
            case 48:
                {
                alt37=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:1867:3: (enumLiteral_0= 'START' )
                    {
                    // InternalMyDsl.g:1867:3: (enumLiteral_0= 'START' )
                    // InternalMyDsl.g:1868:4: enumLiteral_0= 'START'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getEventTimeAccess().getSTARTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEventTimeAccess().getSTARTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1875:3: (enumLiteral_1= 'INTERMEDIATE' )
                    {
                    // InternalMyDsl.g:1875:3: (enumLiteral_1= 'INTERMEDIATE' )
                    // InternalMyDsl.g:1876:4: enumLiteral_1= 'INTERMEDIATE'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getEventTimeAccess().getINTERMEDIATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEventTimeAccess().getINTERMEDIATEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1883:3: (enumLiteral_2= 'END' )
                    {
                    // InternalMyDsl.g:1883:3: (enumLiteral_2= 'END' )
                    // InternalMyDsl.g:1884:4: enumLiteral_2= 'END'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getEventTimeAccess().getENDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEventTimeAccess().getENDEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleEventTime"


    // $ANTLR start "ruleEventType"
    // InternalMyDsl.g:1894:1: ruleEventType returns [Enumerator current=null] : ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'MESSAGE' ) | (enumLiteral_2= 'EROR' ) | (enumLiteral_3= 'RULE' ) | (enumLiteral_4= 'TIMER' ) ) ;
    public final Enumerator ruleEventType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1900:2: ( ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'MESSAGE' ) | (enumLiteral_2= 'EROR' ) | (enumLiteral_3= 'RULE' ) | (enumLiteral_4= 'TIMER' ) ) )
            // InternalMyDsl.g:1901:2: ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'MESSAGE' ) | (enumLiteral_2= 'EROR' ) | (enumLiteral_3= 'RULE' ) | (enumLiteral_4= 'TIMER' ) )
            {
            // InternalMyDsl.g:1901:2: ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'MESSAGE' ) | (enumLiteral_2= 'EROR' ) | (enumLiteral_3= 'RULE' ) | (enumLiteral_4= 'TIMER' ) )
            int alt38=5;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt38=1;
                }
                break;
            case 50:
                {
                alt38=2;
                }
                break;
            case 51:
                {
                alt38=3;
                }
                break;
            case 52:
                {
                alt38=4;
                }
                break;
            case 53:
                {
                alt38=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:1902:3: (enumLiteral_0= 'NONE' )
                    {
                    // InternalMyDsl.g:1902:3: (enumLiteral_0= 'NONE' )
                    // InternalMyDsl.g:1903:4: enumLiteral_0= 'NONE'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEventTypeAccess().getNONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1910:3: (enumLiteral_1= 'MESSAGE' )
                    {
                    // InternalMyDsl.g:1910:3: (enumLiteral_1= 'MESSAGE' )
                    // InternalMyDsl.g:1911:4: enumLiteral_1= 'MESSAGE'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getMESSAGEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEventTypeAccess().getMESSAGEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1918:3: (enumLiteral_2= 'EROR' )
                    {
                    // InternalMyDsl.g:1918:3: (enumLiteral_2= 'EROR' )
                    // InternalMyDsl.g:1919:4: enumLiteral_2= 'EROR'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getEROREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEventTypeAccess().getEROREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1926:3: (enumLiteral_3= 'RULE' )
                    {
                    // InternalMyDsl.g:1926:3: (enumLiteral_3= 'RULE' )
                    // InternalMyDsl.g:1927:4: enumLiteral_3= 'RULE'
                    {
                    enumLiteral_3=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getRULEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getEventTypeAccess().getRULEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1934:3: (enumLiteral_4= 'TIMER' )
                    {
                    // InternalMyDsl.g:1934:3: (enumLiteral_4= 'TIMER' )
                    // InternalMyDsl.g:1935:4: enumLiteral_4= 'TIMER'
                    {
                    enumLiteral_4=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getTIMEREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getEventTypeAccess().getTIMEREnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleEventType"


    // $ANTLR start "ruleGateRule"
    // InternalMyDsl.g:1945:1: ruleGateRule returns [Enumerator current=null] : ( (enumLiteral_0= 'XOR' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'AND' ) ) ;
    public final Enumerator ruleGateRule() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1951:2: ( ( (enumLiteral_0= 'XOR' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'AND' ) ) )
            // InternalMyDsl.g:1952:2: ( (enumLiteral_0= 'XOR' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'AND' ) )
            {
            // InternalMyDsl.g:1952:2: ( (enumLiteral_0= 'XOR' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'AND' ) )
            int alt39=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt39=1;
                }
                break;
            case 55:
                {
                alt39=2;
                }
                break;
            case 56:
                {
                alt39=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:1953:3: (enumLiteral_0= 'XOR' )
                    {
                    // InternalMyDsl.g:1953:3: (enumLiteral_0= 'XOR' )
                    // InternalMyDsl.g:1954:4: enumLiteral_0= 'XOR'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getGateRuleAccess().getXOREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getGateRuleAccess().getXOREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1961:3: (enumLiteral_1= 'OR' )
                    {
                    // InternalMyDsl.g:1961:3: (enumLiteral_1= 'OR' )
                    // InternalMyDsl.g:1962:4: enumLiteral_1= 'OR'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getGateRuleAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getGateRuleAccess().getOREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1969:3: (enumLiteral_2= 'AND' )
                    {
                    // InternalMyDsl.g:1969:3: (enumLiteral_2= 'AND' )
                    // InternalMyDsl.g:1970:4: enumLiteral_2= 'AND'
                    {
                    enumLiteral_2=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getGateRuleAccess().getANDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getGateRuleAccess().getANDEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleGateRule"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000076000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000074000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000003910000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000003810000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000003010000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000018010000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040100000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000002110000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000600100000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000A6800000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000019000010000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000018000010000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0001C00000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010000010000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x003E000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000041000010000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000040000010000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x01C0000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000200008000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000010000000L});

}