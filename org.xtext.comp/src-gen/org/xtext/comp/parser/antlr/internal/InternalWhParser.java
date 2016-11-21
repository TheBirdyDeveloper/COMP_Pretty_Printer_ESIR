package org.xtext.comp.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.comp.services.WhGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWhParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_VARIABLE", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'function'", "':'", "'read'", "'%'", "'write'", "','", "';'", "'nop'", "':='", "'nil'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_VARIABLE=5;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalWhParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalWhParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalWhParser.tokenNames; }
    public String getGrammarFileName() { return "InternalWh.g"; }



     	private WhGrammarAccess grammarAccess;

        public InternalWhParser(TokenStream input, WhGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Wh";
       	}

       	@Override
       	protected WhGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleWh"
    // InternalWh.g:64:1: entryRuleWh returns [EObject current=null] : iv_ruleWh= ruleWh EOF ;
    public final EObject entryRuleWh() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWh = null;


        try {
            // InternalWh.g:64:43: (iv_ruleWh= ruleWh EOF )
            // InternalWh.g:65:2: iv_ruleWh= ruleWh EOF
            {
             newCompositeNode(grammarAccess.getWhRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWh=ruleWh();

            state._fsp--;

             current =iv_ruleWh; 
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
    // $ANTLR end "entryRuleWh"


    // $ANTLR start "ruleWh"
    // InternalWh.g:71:1: ruleWh returns [EObject current=null] : ( (lv_elements_0_0= ruleProgram ) )* ;
    public final EObject ruleWh() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalWh.g:77:2: ( ( (lv_elements_0_0= ruleProgram ) )* )
            // InternalWh.g:78:2: ( (lv_elements_0_0= ruleProgram ) )*
            {
            // InternalWh.g:78:2: ( (lv_elements_0_0= ruleProgram ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWh.g:79:3: (lv_elements_0_0= ruleProgram )
            	    {
            	    // InternalWh.g:79:3: (lv_elements_0_0= ruleProgram )
            	    // InternalWh.g:80:4: lv_elements_0_0= ruleProgram
            	    {

            	    				newCompositeNode(grammarAccess.getWhAccess().getElementsProgramParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleProgram();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getWhRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.xtext.comp.Wh.Program");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleWh"


    // $ANTLR start "entryRuleProgram"
    // InternalWh.g:100:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalWh.g:100:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalWh.g:101:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalWh.g:107:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) ) ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_definition_3_0 = null;



        	enterRule();

        try {
            // InternalWh.g:113:2: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) ) ) )
            // InternalWh.g:114:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) ) )
            {
            // InternalWh.g:114:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) ) )
            // InternalWh.g:115:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getFunctionKeyword_0());
            		
            // InternalWh.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalWh.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalWh.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalWh.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProgramRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getColonKeyword_2());
            		
            // InternalWh.g:141:3: ( (lv_definition_3_0= ruleDefinition ) )
            // InternalWh.g:142:4: (lv_definition_3_0= ruleDefinition )
            {
            // InternalWh.g:142:4: (lv_definition_3_0= ruleDefinition )
            // InternalWh.g:143:5: lv_definition_3_0= ruleDefinition
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getDefinitionDefinitionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_definition_3_0=ruleDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"definition",
            						lv_definition_3_0,
            						"org.xtext.comp.Wh.Definition");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleDefinition"
    // InternalWh.g:164:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalWh.g:164:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalWh.g:165:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
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
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalWh.g:171:1: ruleDefinition returns [EObject current=null] : (otherlv_0= 'read' ( (lv_input_1_0= ruleInput ) ) otherlv_2= '%' ( (lv_command_3_0= ruleCommands ) ) otherlv_4= '%' otherlv_5= 'write' ( (lv_output_6_0= ruleOutput ) ) ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_input_1_0 = null;

        EObject lv_command_3_0 = null;

        EObject lv_output_6_0 = null;



        	enterRule();

        try {
            // InternalWh.g:177:2: ( (otherlv_0= 'read' ( (lv_input_1_0= ruleInput ) ) otherlv_2= '%' ( (lv_command_3_0= ruleCommands ) ) otherlv_4= '%' otherlv_5= 'write' ( (lv_output_6_0= ruleOutput ) ) ) )
            // InternalWh.g:178:2: (otherlv_0= 'read' ( (lv_input_1_0= ruleInput ) ) otherlv_2= '%' ( (lv_command_3_0= ruleCommands ) ) otherlv_4= '%' otherlv_5= 'write' ( (lv_output_6_0= ruleOutput ) ) )
            {
            // InternalWh.g:178:2: (otherlv_0= 'read' ( (lv_input_1_0= ruleInput ) ) otherlv_2= '%' ( (lv_command_3_0= ruleCommands ) ) otherlv_4= '%' otherlv_5= 'write' ( (lv_output_6_0= ruleOutput ) ) )
            // InternalWh.g:179:3: otherlv_0= 'read' ( (lv_input_1_0= ruleInput ) ) otherlv_2= '%' ( (lv_command_3_0= ruleCommands ) ) otherlv_4= '%' otherlv_5= 'write' ( (lv_output_6_0= ruleOutput ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getReadKeyword_0());
            		
            // InternalWh.g:183:3: ( (lv_input_1_0= ruleInput ) )
            // InternalWh.g:184:4: (lv_input_1_0= ruleInput )
            {
            // InternalWh.g:184:4: (lv_input_1_0= ruleInput )
            // InternalWh.g:185:5: lv_input_1_0= ruleInput
            {

            					newCompositeNode(grammarAccess.getDefinitionAccess().getInputInputParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_input_1_0=ruleInput();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefinitionRule());
            					}
            					set(
            						current,
            						"input",
            						lv_input_1_0,
            						"org.xtext.comp.Wh.Input");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getDefinitionAccess().getPercentSignKeyword_2());
            		
            // InternalWh.g:206:3: ( (lv_command_3_0= ruleCommands ) )
            // InternalWh.g:207:4: (lv_command_3_0= ruleCommands )
            {
            // InternalWh.g:207:4: (lv_command_3_0= ruleCommands )
            // InternalWh.g:208:5: lv_command_3_0= ruleCommands
            {

            					newCompositeNode(grammarAccess.getDefinitionAccess().getCommandCommandsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_command_3_0=ruleCommands();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefinitionRule());
            					}
            					set(
            						current,
            						"command",
            						lv_command_3_0,
            						"org.xtext.comp.Wh.Commands");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getDefinitionAccess().getPercentSignKeyword_4());
            		
            otherlv_5=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getDefinitionAccess().getWriteKeyword_5());
            		
            // InternalWh.g:233:3: ( (lv_output_6_0= ruleOutput ) )
            // InternalWh.g:234:4: (lv_output_6_0= ruleOutput )
            {
            // InternalWh.g:234:4: (lv_output_6_0= ruleOutput )
            // InternalWh.g:235:5: lv_output_6_0= ruleOutput
            {

            					newCompositeNode(grammarAccess.getDefinitionAccess().getOutputOutputParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_output_6_0=ruleOutput();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefinitionRule());
            					}
            					set(
            						current,
            						"output",
            						lv_output_6_0,
            						"org.xtext.comp.Wh.Output");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleInput"
    // InternalWh.g:256:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalWh.g:256:46: (iv_ruleInput= ruleInput EOF )
            // InternalWh.g:257:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalWh.g:263:1: ruleInput returns [EObject current=null] : ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token lv_vars_0_0=null;
        Token otherlv_1=null;
        Token lv_vars_2_0=null;


        	enterRule();

        try {
            // InternalWh.g:269:2: ( ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* ) )
            // InternalWh.g:270:2: ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* )
            {
            // InternalWh.g:270:2: ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* )
            // InternalWh.g:271:3: ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )*
            {
            // InternalWh.g:271:3: ( (lv_vars_0_0= RULE_VARIABLE ) )
            // InternalWh.g:272:4: (lv_vars_0_0= RULE_VARIABLE )
            {
            // InternalWh.g:272:4: (lv_vars_0_0= RULE_VARIABLE )
            // InternalWh.g:273:5: lv_vars_0_0= RULE_VARIABLE
            {
            lv_vars_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); 

            					newLeafNode(lv_vars_0_0, grammarAccess.getInputAccess().getVarsVARIABLETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputRule());
            					}
            					addWithLastConsumed(
            						current,
            						"vars",
            						lv_vars_0_0,
            						"org.xtext.comp.Wh.VARIABLE");
            				

            }


            }

            // InternalWh.g:289:3: (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalWh.g:290:4: otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_7); 

            	    				newLeafNode(otherlv_1, grammarAccess.getInputAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalWh.g:294:4: ( (lv_vars_2_0= RULE_VARIABLE ) )
            	    // InternalWh.g:295:5: (lv_vars_2_0= RULE_VARIABLE )
            	    {
            	    // InternalWh.g:295:5: (lv_vars_2_0= RULE_VARIABLE )
            	    // InternalWh.g:296:6: lv_vars_2_0= RULE_VARIABLE
            	    {
            	    lv_vars_2_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); 

            	    						newLeafNode(lv_vars_2_0, grammarAccess.getInputAccess().getVarsVARIABLETerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getInputRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"vars",
            	    							lv_vars_2_0,
            	    							"org.xtext.comp.Wh.VARIABLE");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleOutput"
    // InternalWh.g:317:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalWh.g:317:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalWh.g:318:2: iv_ruleOutput= ruleOutput EOF
            {
             newCompositeNode(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutput=ruleOutput();

            state._fsp--;

             current =iv_ruleOutput; 
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
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalWh.g:324:1: ruleOutput returns [EObject current=null] : ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token lv_vars_0_0=null;
        Token otherlv_1=null;
        Token lv_vars_2_0=null;


        	enterRule();

        try {
            // InternalWh.g:330:2: ( ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* ) )
            // InternalWh.g:331:2: ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* )
            {
            // InternalWh.g:331:2: ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* )
            // InternalWh.g:332:3: ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )*
            {
            // InternalWh.g:332:3: ( (lv_vars_0_0= RULE_VARIABLE ) )
            // InternalWh.g:333:4: (lv_vars_0_0= RULE_VARIABLE )
            {
            // InternalWh.g:333:4: (lv_vars_0_0= RULE_VARIABLE )
            // InternalWh.g:334:5: lv_vars_0_0= RULE_VARIABLE
            {
            lv_vars_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); 

            					newLeafNode(lv_vars_0_0, grammarAccess.getOutputAccess().getVarsVARIABLETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutputRule());
            					}
            					addWithLastConsumed(
            						current,
            						"vars",
            						lv_vars_0_0,
            						"org.xtext.comp.Wh.VARIABLE");
            				

            }


            }

            // InternalWh.g:350:3: (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalWh.g:351:4: otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_7); 

            	    				newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalWh.g:355:4: ( (lv_vars_2_0= RULE_VARIABLE ) )
            	    // InternalWh.g:356:5: (lv_vars_2_0= RULE_VARIABLE )
            	    {
            	    // InternalWh.g:356:5: (lv_vars_2_0= RULE_VARIABLE )
            	    // InternalWh.g:357:6: lv_vars_2_0= RULE_VARIABLE
            	    {
            	    lv_vars_2_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); 

            	    						newLeafNode(lv_vars_2_0, grammarAccess.getOutputAccess().getVarsVARIABLETerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getOutputRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"vars",
            	    							lv_vars_2_0,
            	    							"org.xtext.comp.Wh.VARIABLE");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


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
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleCommands"
    // InternalWh.g:378:1: entryRuleCommands returns [EObject current=null] : iv_ruleCommands= ruleCommands EOF ;
    public final EObject entryRuleCommands() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommands = null;


        try {
            // InternalWh.g:378:49: (iv_ruleCommands= ruleCommands EOF )
            // InternalWh.g:379:2: iv_ruleCommands= ruleCommands EOF
            {
             newCompositeNode(grammarAccess.getCommandsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommands=ruleCommands();

            state._fsp--;

             current =iv_ruleCommands; 
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
    // $ANTLR end "entryRuleCommands"


    // $ANTLR start "ruleCommands"
    // InternalWh.g:385:1: ruleCommands returns [EObject current=null] : ( ( (lv_commands_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )* ) ;
    public final EObject ruleCommands() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_commands_0_0 = null;

        EObject lv_commands_2_0 = null;



        	enterRule();

        try {
            // InternalWh.g:391:2: ( ( ( (lv_commands_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )* ) )
            // InternalWh.g:392:2: ( ( (lv_commands_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )* )
            {
            // InternalWh.g:392:2: ( ( (lv_commands_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )* )
            // InternalWh.g:393:3: ( (lv_commands_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )*
            {
            // InternalWh.g:393:3: ( (lv_commands_0_0= ruleCommand ) )
            // InternalWh.g:394:4: (lv_commands_0_0= ruleCommand )
            {
            // InternalWh.g:394:4: (lv_commands_0_0= ruleCommand )
            // InternalWh.g:395:5: lv_commands_0_0= ruleCommand
            {

            					newCompositeNode(grammarAccess.getCommandsAccess().getCommandsCommandParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_commands_0_0=ruleCommand();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommandsRule());
            					}
            					add(
            						current,
            						"commands",
            						lv_commands_0_0,
            						"org.xtext.comp.Wh.Command");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWh.g:412:3: (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalWh.g:413:4: otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_9); 

            	    				newLeafNode(otherlv_1, grammarAccess.getCommandsAccess().getSemicolonKeyword_1_0());
            	    			
            	    // InternalWh.g:417:4: ( (lv_commands_2_0= ruleCommand ) )
            	    // InternalWh.g:418:5: (lv_commands_2_0= ruleCommand )
            	    {
            	    // InternalWh.g:418:5: (lv_commands_2_0= ruleCommand )
            	    // InternalWh.g:419:6: lv_commands_2_0= ruleCommand
            	    {

            	    						newCompositeNode(grammarAccess.getCommandsAccess().getCommandsCommandParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_commands_2_0=ruleCommand();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCommandsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"commands",
            	    							lv_commands_2_0,
            	    							"org.xtext.comp.Wh.Command");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


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
    // $ANTLR end "ruleCommands"


    // $ANTLR start "entryRuleCommand"
    // InternalWh.g:441:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalWh.g:441:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalWh.g:442:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalWh.g:448:1: ruleCommand returns [EObject current=null] : ( ( (lv_cmd_0_1= ruleNop | lv_cmd_0_2= ruleAffect ) ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject lv_cmd_0_1 = null;

        EObject lv_cmd_0_2 = null;



        	enterRule();

        try {
            // InternalWh.g:454:2: ( ( ( (lv_cmd_0_1= ruleNop | lv_cmd_0_2= ruleAffect ) ) ) )
            // InternalWh.g:455:2: ( ( (lv_cmd_0_1= ruleNop | lv_cmd_0_2= ruleAffect ) ) )
            {
            // InternalWh.g:455:2: ( ( (lv_cmd_0_1= ruleNop | lv_cmd_0_2= ruleAffect ) ) )
            // InternalWh.g:456:3: ( (lv_cmd_0_1= ruleNop | lv_cmd_0_2= ruleAffect ) )
            {
            // InternalWh.g:456:3: ( (lv_cmd_0_1= ruleNop | lv_cmd_0_2= ruleAffect ) )
            // InternalWh.g:457:4: (lv_cmd_0_1= ruleNop | lv_cmd_0_2= ruleAffect )
            {
            // InternalWh.g:457:4: (lv_cmd_0_1= ruleNop | lv_cmd_0_2= ruleAffect )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_VARIABLE) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalWh.g:458:5: lv_cmd_0_1= ruleNop
                    {

                    					newCompositeNode(grammarAccess.getCommandAccess().getCmdNopParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_cmd_0_1=ruleNop();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCommandRule());
                    					}
                    					set(
                    						current,
                    						"cmd",
                    						lv_cmd_0_1,
                    						"org.xtext.comp.Wh.Nop");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalWh.g:474:5: lv_cmd_0_2= ruleAffect
                    {

                    					newCompositeNode(grammarAccess.getCommandAccess().getCmdAffectParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_cmd_0_2=ruleAffect();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCommandRule());
                    					}
                    					set(
                    						current,
                    						"cmd",
                    						lv_cmd_0_2,
                    						"org.xtext.comp.Wh.Affect");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

            }


            }


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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleNop"
    // InternalWh.g:495:1: entryRuleNop returns [EObject current=null] : iv_ruleNop= ruleNop EOF ;
    public final EObject entryRuleNop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNop = null;


        try {
            // InternalWh.g:495:44: (iv_ruleNop= ruleNop EOF )
            // InternalWh.g:496:2: iv_ruleNop= ruleNop EOF
            {
             newCompositeNode(grammarAccess.getNopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNop=ruleNop();

            state._fsp--;

             current =iv_ruleNop; 
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
    // $ANTLR end "entryRuleNop"


    // $ANTLR start "ruleNop"
    // InternalWh.g:502:1: ruleNop returns [EObject current=null] : ( (lv_nop_0_0= 'nop' ) ) ;
    public final EObject ruleNop() throws RecognitionException {
        EObject current = null;

        Token lv_nop_0_0=null;


        	enterRule();

        try {
            // InternalWh.g:508:2: ( ( (lv_nop_0_0= 'nop' ) ) )
            // InternalWh.g:509:2: ( (lv_nop_0_0= 'nop' ) )
            {
            // InternalWh.g:509:2: ( (lv_nop_0_0= 'nop' ) )
            // InternalWh.g:510:3: (lv_nop_0_0= 'nop' )
            {
            // InternalWh.g:510:3: (lv_nop_0_0= 'nop' )
            // InternalWh.g:511:4: lv_nop_0_0= 'nop'
            {
            lv_nop_0_0=(Token)match(input,19,FOLLOW_2); 

            				newLeafNode(lv_nop_0_0, grammarAccess.getNopAccess().getNopNopKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNopRule());
            				}
            				setWithLastConsumed(current, "nop", lv_nop_0_0, "nop");
            			

            }


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
    // $ANTLR end "ruleNop"


    // $ANTLR start "entryRuleAffect"
    // InternalWh.g:526:1: entryRuleAffect returns [EObject current=null] : iv_ruleAffect= ruleAffect EOF ;
    public final EObject entryRuleAffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAffect = null;


        try {
            // InternalWh.g:526:47: (iv_ruleAffect= ruleAffect EOF )
            // InternalWh.g:527:2: iv_ruleAffect= ruleAffect EOF
            {
             newCompositeNode(grammarAccess.getAffectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAffect=ruleAffect();

            state._fsp--;

             current =iv_ruleAffect; 
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
    // $ANTLR end "entryRuleAffect"


    // $ANTLR start "ruleAffect"
    // InternalWh.g:533:1: ruleAffect returns [EObject current=null] : ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* otherlv_3= ':=' ( (lv_exprs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )* ) ;
    public final EObject ruleAffect() throws RecognitionException {
        EObject current = null;

        Token lv_vars_0_0=null;
        Token otherlv_1=null;
        Token lv_vars_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_exprs_4_0 = null;

        AntlrDatatypeRuleToken lv_exprs_6_0 = null;



        	enterRule();

        try {
            // InternalWh.g:539:2: ( ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* otherlv_3= ':=' ( (lv_exprs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )* ) )
            // InternalWh.g:540:2: ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* otherlv_3= ':=' ( (lv_exprs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )* )
            {
            // InternalWh.g:540:2: ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* otherlv_3= ':=' ( (lv_exprs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )* )
            // InternalWh.g:541:3: ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* otherlv_3= ':=' ( (lv_exprs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )*
            {
            // InternalWh.g:541:3: ( (lv_vars_0_0= RULE_VARIABLE ) )
            // InternalWh.g:542:4: (lv_vars_0_0= RULE_VARIABLE )
            {
            // InternalWh.g:542:4: (lv_vars_0_0= RULE_VARIABLE )
            // InternalWh.g:543:5: lv_vars_0_0= RULE_VARIABLE
            {
            lv_vars_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_13); 

            					newLeafNode(lv_vars_0_0, grammarAccess.getAffectAccess().getVarsVARIABLETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAffectRule());
            					}
            					addWithLastConsumed(
            						current,
            						"vars",
            						lv_vars_0_0,
            						"org.xtext.comp.Wh.VARIABLE");
            				

            }


            }

            // InternalWh.g:559:3: (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalWh.g:560:4: otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_7); 

            	    				newLeafNode(otherlv_1, grammarAccess.getAffectAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalWh.g:564:4: ( (lv_vars_2_0= RULE_VARIABLE ) )
            	    // InternalWh.g:565:5: (lv_vars_2_0= RULE_VARIABLE )
            	    {
            	    // InternalWh.g:565:5: (lv_vars_2_0= RULE_VARIABLE )
            	    // InternalWh.g:566:6: lv_vars_2_0= RULE_VARIABLE
            	    {
            	    lv_vars_2_0=(Token)match(input,RULE_VARIABLE,FOLLOW_13); 

            	    						newLeafNode(lv_vars_2_0, grammarAccess.getAffectAccess().getVarsVARIABLETerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getAffectRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"vars",
            	    							lv_vars_2_0,
            	    							"org.xtext.comp.Wh.VARIABLE");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_3=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getAffectAccess().getColonEqualsSignKeyword_2());
            		
            // InternalWh.g:587:3: ( (lv_exprs_4_0= ruleExpr ) )
            // InternalWh.g:588:4: (lv_exprs_4_0= ruleExpr )
            {
            // InternalWh.g:588:4: (lv_exprs_4_0= ruleExpr )
            // InternalWh.g:589:5: lv_exprs_4_0= ruleExpr
            {

            					newCompositeNode(grammarAccess.getAffectAccess().getExprsExprParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_exprs_4_0=ruleExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAffectRule());
            					}
            					add(
            						current,
            						"exprs",
            						lv_exprs_4_0,
            						"org.xtext.comp.Wh.Expr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWh.g:606:3: (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalWh.g:607:4: otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) )
            	    {
            	    otherlv_5=(Token)match(input,17,FOLLOW_14); 

            	    				newLeafNode(otherlv_5, grammarAccess.getAffectAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalWh.g:611:4: ( (lv_exprs_6_0= ruleExpr ) )
            	    // InternalWh.g:612:5: (lv_exprs_6_0= ruleExpr )
            	    {
            	    // InternalWh.g:612:5: (lv_exprs_6_0= ruleExpr )
            	    // InternalWh.g:613:6: lv_exprs_6_0= ruleExpr
            	    {

            	    						newCompositeNode(grammarAccess.getAffectAccess().getExprsExprParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_exprs_6_0=ruleExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAffectRule());
            	    						}
            	    						add(
            	    							current,
            	    							"exprs",
            	    							lv_exprs_6_0,
            	    							"org.xtext.comp.Wh.Expr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


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
    // $ANTLR end "ruleAffect"


    // $ANTLR start "entryRuleExpr"
    // InternalWh.g:635:1: entryRuleExpr returns [String current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final String entryRuleExpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpr = null;


        try {
            // InternalWh.g:635:44: (iv_ruleExpr= ruleExpr EOF )
            // InternalWh.g:636:2: iv_ruleExpr= ruleExpr EOF
            {
             newCompositeNode(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpr=ruleExpr();

            state._fsp--;

             current =iv_ruleExpr.getText(); 
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
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // InternalWh.g:642:1: ruleExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ExprSimple_0= ruleExprSimple ;
    public final AntlrDatatypeRuleToken ruleExpr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ExprSimple_0 = null;



        	enterRule();

        try {
            // InternalWh.g:648:2: (this_ExprSimple_0= ruleExprSimple )
            // InternalWh.g:649:2: this_ExprSimple_0= ruleExprSimple
            {

            		newCompositeNode(grammarAccess.getExprAccess().getExprSimpleParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ExprSimple_0=ruleExprSimple();

            state._fsp--;


            		current.merge(this_ExprSimple_0);
            	

            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleExprSimple"
    // InternalWh.g:662:1: entryRuleExprSimple returns [String current=null] : iv_ruleExprSimple= ruleExprSimple EOF ;
    public final String entryRuleExprSimple() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExprSimple = null;


        try {
            // InternalWh.g:662:50: (iv_ruleExprSimple= ruleExprSimple EOF )
            // InternalWh.g:663:2: iv_ruleExprSimple= ruleExprSimple EOF
            {
             newCompositeNode(grammarAccess.getExprSimpleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExprSimple=ruleExprSimple();

            state._fsp--;

             current =iv_ruleExprSimple.getText(); 
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
    // $ANTLR end "entryRuleExprSimple"


    // $ANTLR start "ruleExprSimple"
    // InternalWh.g:669:1: ruleExprSimple returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'nil' | this_VARIABLE_1= RULE_VARIABLE ) ;
    public final AntlrDatatypeRuleToken ruleExprSimple() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_VARIABLE_1=null;


        	enterRule();

        try {
            // InternalWh.g:675:2: ( (kw= 'nil' | this_VARIABLE_1= RULE_VARIABLE ) )
            // InternalWh.g:676:2: (kw= 'nil' | this_VARIABLE_1= RULE_VARIABLE )
            {
            // InternalWh.g:676:2: (kw= 'nil' | this_VARIABLE_1= RULE_VARIABLE )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_VARIABLE) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalWh.g:677:3: kw= 'nil'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExprSimpleAccess().getNilKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalWh.g:683:3: this_VARIABLE_1= RULE_VARIABLE
                    {
                    this_VARIABLE_1=(Token)match(input,RULE_VARIABLE,FOLLOW_2); 

                    			current.merge(this_VARIABLE_1);
                    		

                    			newLeafNode(this_VARIABLE_1, grammarAccess.getExprSimpleAccess().getVARIABLETerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleExprSimple"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200020L});

}