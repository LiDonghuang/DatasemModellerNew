package ausim.xtext.kanban.domainmodel.parser.antlr.internal; 

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
import ausim.xtext.kanban.domainmodel.services.KanbanmodelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKanbanmodelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'KSSWorkFlowModel'", "'Organization'", "'end Organization'", "'WorkItems'", "'end WorkItems'", "'end KSSWorkFlowModel'", "'team'", "'group'", "'{'", "'contains'", "'}'", "'resources'", "'profile'", "'services'", "'service'", "'resource'", "'assigned-to'", "'KanbanBoard'", "'assigned-unit'", "'='", "'source-units'", "'target-units'", "'readyQueue-limit'", "'workInProgress-limit'", "'=>'", "'requirement'", "'tasks'", "'process'", "'workItem'", "'subtasks'", "'services-required'", "'base value'", "'class-of-service'", "'WorkFlow'", "'end WorkFlow'", "'capability'", "'STABILIZER'", "'VISIONARY'", "'COOPERATOR'", "'CATALYST'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalKanbanmodelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKanbanmodelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKanbanmodelParser.tokenNames; }
    public String getGrammarFileName() { return "../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g"; }



     	private KanbanmodelGrammarAccess grammarAccess;
     	
        public InternalKanbanmodelParser(TokenStream input, KanbanmodelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "KanbanSchedulingSystem";	
       	}
       	
       	@Override
       	protected KanbanmodelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleKanbanSchedulingSystem"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:68:1: entryRuleKanbanSchedulingSystem returns [EObject current=null] : iv_ruleKanbanSchedulingSystem= ruleKanbanSchedulingSystem EOF ;
    public final EObject entryRuleKanbanSchedulingSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKanbanSchedulingSystem = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:69:2: (iv_ruleKanbanSchedulingSystem= ruleKanbanSchedulingSystem EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:70:2: iv_ruleKanbanSchedulingSystem= ruleKanbanSchedulingSystem EOF
            {
             newCompositeNode(grammarAccess.getKanbanSchedulingSystemRule()); 
            pushFollow(FOLLOW_ruleKanbanSchedulingSystem_in_entryRuleKanbanSchedulingSystem75);
            iv_ruleKanbanSchedulingSystem=ruleKanbanSchedulingSystem();

            state._fsp--;

             current =iv_ruleKanbanSchedulingSystem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKanbanSchedulingSystem85); 

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
    // $ANTLR end "entryRuleKanbanSchedulingSystem"


    // $ANTLR start "ruleKanbanSchedulingSystem"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:77:1: ruleKanbanSchedulingSystem returns [EObject current=null] : (otherlv_0= 'KSSWorkFlowModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Organization' ( (lv_orgUnits_3_0= ruleTeam ) )+ otherlv_4= 'end Organization' otherlv_5= 'WorkItems' ( (lv_kssTasks_6_0= ruleTask ) )+ otherlv_7= 'end WorkItems' ( (lv_kssWorkFlow_8_0= ruleKanbanWorkFlow ) ) otherlv_9= 'end KSSWorkFlowModel' ) ;
    public final EObject ruleKanbanSchedulingSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_orgUnits_3_0 = null;

        EObject lv_kssTasks_6_0 = null;

        EObject lv_kssWorkFlow_8_0 = null;


         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:80:28: ( (otherlv_0= 'KSSWorkFlowModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Organization' ( (lv_orgUnits_3_0= ruleTeam ) )+ otherlv_4= 'end Organization' otherlv_5= 'WorkItems' ( (lv_kssTasks_6_0= ruleTask ) )+ otherlv_7= 'end WorkItems' ( (lv_kssWorkFlow_8_0= ruleKanbanWorkFlow ) ) otherlv_9= 'end KSSWorkFlowModel' ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:81:1: (otherlv_0= 'KSSWorkFlowModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Organization' ( (lv_orgUnits_3_0= ruleTeam ) )+ otherlv_4= 'end Organization' otherlv_5= 'WorkItems' ( (lv_kssTasks_6_0= ruleTask ) )+ otherlv_7= 'end WorkItems' ( (lv_kssWorkFlow_8_0= ruleKanbanWorkFlow ) ) otherlv_9= 'end KSSWorkFlowModel' )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:81:1: (otherlv_0= 'KSSWorkFlowModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Organization' ( (lv_orgUnits_3_0= ruleTeam ) )+ otherlv_4= 'end Organization' otherlv_5= 'WorkItems' ( (lv_kssTasks_6_0= ruleTask ) )+ otherlv_7= 'end WorkItems' ( (lv_kssWorkFlow_8_0= ruleKanbanWorkFlow ) ) otherlv_9= 'end KSSWorkFlowModel' )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:81:3: otherlv_0= 'KSSWorkFlowModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Organization' ( (lv_orgUnits_3_0= ruleTeam ) )+ otherlv_4= 'end Organization' otherlv_5= 'WorkItems' ( (lv_kssTasks_6_0= ruleTask ) )+ otherlv_7= 'end WorkItems' ( (lv_kssWorkFlow_8_0= ruleKanbanWorkFlow ) ) otherlv_9= 'end KSSWorkFlowModel'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleKanbanSchedulingSystem122); 

                	newLeafNode(otherlv_0, grammarAccess.getKanbanSchedulingSystemAccess().getKSSWorkFlowModelKeyword_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:85:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:86:1: (lv_name_1_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:86:1: (lv_name_1_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:87:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleKanbanSchedulingSystem139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getKanbanSchedulingSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKanbanSchedulingSystemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleKanbanSchedulingSystem156); 

                	newLeafNode(otherlv_2, grammarAccess.getKanbanSchedulingSystemAccess().getOrganizationKeyword_2());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:107:1: ( (lv_orgUnits_3_0= ruleTeam ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=17 && LA1_0<=18)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:108:1: (lv_orgUnits_3_0= ruleTeam )
            	    {
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:108:1: (lv_orgUnits_3_0= ruleTeam )
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:109:3: lv_orgUnits_3_0= ruleTeam
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getOrgUnitsTeamParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTeam_in_ruleKanbanSchedulingSystem177);
            	    lv_orgUnits_3_0=ruleTeam();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"orgUnits",
            	            		lv_orgUnits_3_0, 
            	            		"Team");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleKanbanSchedulingSystem190); 

                	newLeafNode(otherlv_4, grammarAccess.getKanbanSchedulingSystemAccess().getEndOrganizationKeyword_4());
                
            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleKanbanSchedulingSystem202); 

                	newLeafNode(otherlv_5, grammarAccess.getKanbanSchedulingSystemAccess().getWorkItemsKeyword_5());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:133:1: ( (lv_kssTasks_6_0= ruleTask ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==39) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:134:1: (lv_kssTasks_6_0= ruleTask )
            	    {
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:134:1: (lv_kssTasks_6_0= ruleTask )
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:135:3: lv_kssTasks_6_0= ruleTask
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getKssTasksTaskParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTask_in_ruleKanbanSchedulingSystem223);
            	    lv_kssTasks_6_0=ruleTask();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"kssTasks",
            	            		lv_kssTasks_6_0, 
            	            		"Task");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleKanbanSchedulingSystem236); 

                	newLeafNode(otherlv_7, grammarAccess.getKanbanSchedulingSystemAccess().getEndWorkItemsKeyword_7());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:155:1: ( (lv_kssWorkFlow_8_0= ruleKanbanWorkFlow ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:156:1: (lv_kssWorkFlow_8_0= ruleKanbanWorkFlow )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:156:1: (lv_kssWorkFlow_8_0= ruleKanbanWorkFlow )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:157:3: lv_kssWorkFlow_8_0= ruleKanbanWorkFlow
            {
             
            	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getKssWorkFlowKanbanWorkFlowParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleKanbanWorkFlow_in_ruleKanbanSchedulingSystem257);
            lv_kssWorkFlow_8_0=ruleKanbanWorkFlow();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
            	        }
                   		set(
                   			current, 
                   			"kssWorkFlow",
                    		lv_kssWorkFlow_8_0, 
                    		"KanbanWorkFlow");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleKanbanSchedulingSystem269); 

                	newLeafNode(otherlv_9, grammarAccess.getKanbanSchedulingSystemAccess().getEndKSSWorkFlowModelKeyword_9());
                

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
    // $ANTLR end "ruleKanbanSchedulingSystem"


    // $ANTLR start "entryRuleTeam"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:185:1: entryRuleTeam returns [EObject current=null] : iv_ruleTeam= ruleTeam EOF ;
    public final EObject entryRuleTeam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeam = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:186:2: (iv_ruleTeam= ruleTeam EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:187:2: iv_ruleTeam= ruleTeam EOF
            {
             newCompositeNode(grammarAccess.getTeamRule()); 
            pushFollow(FOLLOW_ruleTeam_in_entryRuleTeam305);
            iv_ruleTeam=ruleTeam();

            state._fsp--;

             current =iv_ruleTeam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTeam315); 

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
    // $ANTLR end "entryRuleTeam"


    // $ANTLR start "ruleTeam"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:194:1: ruleTeam returns [EObject current=null] : ( (otherlv_0= 'team' | otherlv_1= 'group' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'contains' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}' )? (otherlv_8= 'resources' otherlv_9= '{' ( (lv_resources_10_0= ruleAsset ) )+ otherlv_11= '}' )? (otherlv_12= 'profile' ( (lv_teamProfile_13_0= ruleProfileType ) ) )? (otherlv_14= 'services' otherlv_15= '{' ( (lv_services_16_0= ruleService ) )+ otherlv_17= '}' )? ( (lv_kssBlock_18_0= ruleKSSBlock ) )? otherlv_19= '}' ) ;
    public final EObject ruleTeam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        EObject lv_resources_10_0 = null;

        Enumerator lv_teamProfile_13_0 = null;

        EObject lv_services_16_0 = null;

        EObject lv_kssBlock_18_0 = null;


         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:197:28: ( ( (otherlv_0= 'team' | otherlv_1= 'group' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'contains' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}' )? (otherlv_8= 'resources' otherlv_9= '{' ( (lv_resources_10_0= ruleAsset ) )+ otherlv_11= '}' )? (otherlv_12= 'profile' ( (lv_teamProfile_13_0= ruleProfileType ) ) )? (otherlv_14= 'services' otherlv_15= '{' ( (lv_services_16_0= ruleService ) )+ otherlv_17= '}' )? ( (lv_kssBlock_18_0= ruleKSSBlock ) )? otherlv_19= '}' ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:198:1: ( (otherlv_0= 'team' | otherlv_1= 'group' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'contains' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}' )? (otherlv_8= 'resources' otherlv_9= '{' ( (lv_resources_10_0= ruleAsset ) )+ otherlv_11= '}' )? (otherlv_12= 'profile' ( (lv_teamProfile_13_0= ruleProfileType ) ) )? (otherlv_14= 'services' otherlv_15= '{' ( (lv_services_16_0= ruleService ) )+ otherlv_17= '}' )? ( (lv_kssBlock_18_0= ruleKSSBlock ) )? otherlv_19= '}' )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:198:1: ( (otherlv_0= 'team' | otherlv_1= 'group' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'contains' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}' )? (otherlv_8= 'resources' otherlv_9= '{' ( (lv_resources_10_0= ruleAsset ) )+ otherlv_11= '}' )? (otherlv_12= 'profile' ( (lv_teamProfile_13_0= ruleProfileType ) ) )? (otherlv_14= 'services' otherlv_15= '{' ( (lv_services_16_0= ruleService ) )+ otherlv_17= '}' )? ( (lv_kssBlock_18_0= ruleKSSBlock ) )? otherlv_19= '}' )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:198:2: (otherlv_0= 'team' | otherlv_1= 'group' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'contains' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}' )? (otherlv_8= 'resources' otherlv_9= '{' ( (lv_resources_10_0= ruleAsset ) )+ otherlv_11= '}' )? (otherlv_12= 'profile' ( (lv_teamProfile_13_0= ruleProfileType ) ) )? (otherlv_14= 'services' otherlv_15= '{' ( (lv_services_16_0= ruleService ) )+ otherlv_17= '}' )? ( (lv_kssBlock_18_0= ruleKSSBlock ) )? otherlv_19= '}'
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:198:2: (otherlv_0= 'team' | otherlv_1= 'group' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:198:4: otherlv_0= 'team'
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleTeam353); 

                        	newLeafNode(otherlv_0, grammarAccess.getTeamAccess().getTeamKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:203:7: otherlv_1= 'group'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleTeam371); 

                        	newLeafNode(otherlv_1, grammarAccess.getTeamAccess().getGroupKeyword_0_1());
                        

                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:207:2: ( (lv_name_2_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:208:1: (lv_name_2_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:208:1: (lv_name_2_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:209:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTeam389); 

            			newLeafNode(lv_name_2_0, grammarAccess.getTeamAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTeamRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleTeam406); 

                	newLeafNode(otherlv_3, grammarAccess.getTeamAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:229:1: (otherlv_4= 'contains' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:229:3: otherlv_4= 'contains' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleTeam419); 

                        	newLeafNode(otherlv_4, grammarAccess.getTeamAccess().getContainsKeyword_3_0());
                        
                    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleTeam431); 

                        	newLeafNode(otherlv_5, grammarAccess.getTeamAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:237:1: ( (otherlv_6= RULE_ID ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:238:1: (otherlv_6= RULE_ID )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:238:1: (otherlv_6= RULE_ID )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:239:3: otherlv_6= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTeamRule());
                    	    	        }
                    	            
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTeam451); 

                    	    		newLeafNode(otherlv_6, grammarAccess.getTeamAccess().getGroupmembersTeamCrossReference_3_2_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);

                    otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleTeam464); 

                        	newLeafNode(otherlv_7, grammarAccess.getTeamAccess().getRightCurlyBracketKeyword_3_3());
                        

                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:254:3: (otherlv_8= 'resources' otherlv_9= '{' ( (lv_resources_10_0= ruleAsset ) )+ otherlv_11= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:254:5: otherlv_8= 'resources' otherlv_9= '{' ( (lv_resources_10_0= ruleAsset ) )+ otherlv_11= '}'
                    {
                    otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleTeam479); 

                        	newLeafNode(otherlv_8, grammarAccess.getTeamAccess().getResourcesKeyword_4_0());
                        
                    otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleTeam491); 

                        	newLeafNode(otherlv_9, grammarAccess.getTeamAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:262:1: ( (lv_resources_10_0= ruleAsset ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==26) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:263:1: (lv_resources_10_0= ruleAsset )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:263:1: (lv_resources_10_0= ruleAsset )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:264:3: lv_resources_10_0= ruleAsset
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTeamAccess().getResourcesAssetParserRuleCall_4_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAsset_in_ruleTeam512);
                    	    lv_resources_10_0=ruleAsset();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTeamRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"resources",
                    	            		lv_resources_10_0, 
                    	            		"Asset");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);

                    otherlv_11=(Token)match(input,21,FOLLOW_21_in_ruleTeam525); 

                        	newLeafNode(otherlv_11, grammarAccess.getTeamAccess().getRightCurlyBracketKeyword_4_3());
                        

                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:284:3: (otherlv_12= 'profile' ( (lv_teamProfile_13_0= ruleProfileType ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:284:5: otherlv_12= 'profile' ( (lv_teamProfile_13_0= ruleProfileType ) )
                    {
                    otherlv_12=(Token)match(input,23,FOLLOW_23_in_ruleTeam540); 

                        	newLeafNode(otherlv_12, grammarAccess.getTeamAccess().getProfileKeyword_5_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:288:1: ( (lv_teamProfile_13_0= ruleProfileType ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:289:1: (lv_teamProfile_13_0= ruleProfileType )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:289:1: (lv_teamProfile_13_0= ruleProfileType )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:290:3: lv_teamProfile_13_0= ruleProfileType
                    {
                     
                    	        newCompositeNode(grammarAccess.getTeamAccess().getTeamProfileProfileTypeEnumRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProfileType_in_ruleTeam561);
                    lv_teamProfile_13_0=ruleProfileType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTeamRule());
                    	        }
                           		set(
                           			current, 
                           			"teamProfile",
                            		lv_teamProfile_13_0, 
                            		"ProfileType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:306:4: (otherlv_14= 'services' otherlv_15= '{' ( (lv_services_16_0= ruleService ) )+ otherlv_17= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:306:6: otherlv_14= 'services' otherlv_15= '{' ( (lv_services_16_0= ruleService ) )+ otherlv_17= '}'
                    {
                    otherlv_14=(Token)match(input,24,FOLLOW_24_in_ruleTeam576); 

                        	newLeafNode(otherlv_14, grammarAccess.getTeamAccess().getServicesKeyword_6_0());
                        
                    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleTeam588); 

                        	newLeafNode(otherlv_15, grammarAccess.getTeamAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:314:1: ( (lv_services_16_0= ruleService ) )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==25) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:315:1: (lv_services_16_0= ruleService )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:315:1: (lv_services_16_0= ruleService )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:316:3: lv_services_16_0= ruleService
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTeamAccess().getServicesServiceParserRuleCall_6_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleService_in_ruleTeam609);
                    	    lv_services_16_0=ruleService();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTeamRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"services",
                    	            		lv_services_16_0, 
                    	            		"Service");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);

                    otherlv_17=(Token)match(input,21,FOLLOW_21_in_ruleTeam622); 

                        	newLeafNode(otherlv_17, grammarAccess.getTeamAccess().getRightCurlyBracketKeyword_6_3());
                        

                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:336:3: ( (lv_kssBlock_18_0= ruleKSSBlock ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:337:1: (lv_kssBlock_18_0= ruleKSSBlock )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:337:1: (lv_kssBlock_18_0= ruleKSSBlock )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:338:3: lv_kssBlock_18_0= ruleKSSBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getTeamAccess().getKssBlockKSSBlockParserRuleCall_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleKSSBlock_in_ruleTeam645);
                    lv_kssBlock_18_0=ruleKSSBlock();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTeamRule());
                    	        }
                           		set(
                           			current, 
                           			"kssBlock",
                            		lv_kssBlock_18_0, 
                            		"KSSBlock");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,21,FOLLOW_21_in_ruleTeam658); 

                	newLeafNode(otherlv_19, grammarAccess.getTeamAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleTeam"


    // $ANTLR start "entryRuleService"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:366:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:367:2: (iv_ruleService= ruleService EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:368:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService694);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService704); 

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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:375:1: ruleService returns [EObject current=null] : (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:378:28: ( (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:379:1: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:379:1: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:379:3: otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleService741); 

                	newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:383:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:384:1: (lv_name_1_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:384:1: (lv_name_1_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:385:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService758); 

            			newLeafNode(lv_name_1_0, grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleAsset"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:409:1: entryRuleAsset returns [EObject current=null] : iv_ruleAsset= ruleAsset EOF ;
    public final EObject entryRuleAsset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsset = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:410:2: (iv_ruleAsset= ruleAsset EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:411:2: iv_ruleAsset= ruleAsset EOF
            {
             newCompositeNode(grammarAccess.getAssetRule()); 
            pushFollow(FOLLOW_ruleAsset_in_entryRuleAsset799);
            iv_ruleAsset=ruleAsset();

            state._fsp--;

             current =iv_ruleAsset; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAsset809); 

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
    // $ANTLR end "entryRuleAsset"


    // $ANTLR start "ruleAsset"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:418:1: ruleAsset returns [EObject current=null] : (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' otherlv_3= 'assigned-to' otherlv_4= '{' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' otherlv_7= '}' )? ) ;
    public final EObject ruleAsset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:421:28: ( (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' otherlv_3= 'assigned-to' otherlv_4= '{' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' otherlv_7= '}' )? ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:422:1: (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' otherlv_3= 'assigned-to' otherlv_4= '{' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' otherlv_7= '}' )? )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:422:1: (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' otherlv_3= 'assigned-to' otherlv_4= '{' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' otherlv_7= '}' )? )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:422:3: otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' otherlv_3= 'assigned-to' otherlv_4= '{' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' otherlv_7= '}' )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleAsset846); 

                	newLeafNode(otherlv_0, grammarAccess.getAssetAccess().getResourceKeyword_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:426:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:427:1: (lv_name_1_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:427:1: (lv_name_1_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:428:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAsset863); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAssetAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAssetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:444:2: (otherlv_2= '{' otherlv_3= 'assigned-to' otherlv_4= '{' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' otherlv_7= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:444:4: otherlv_2= '{' otherlv_3= 'assigned-to' otherlv_4= '{' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleAsset881); 

                        	newLeafNode(otherlv_2, grammarAccess.getAssetAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleAsset893); 

                        	newLeafNode(otherlv_3, grammarAccess.getAssetAccess().getAssignedToKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleAsset905); 

                        	newLeafNode(otherlv_4, grammarAccess.getAssetAccess().getLeftCurlyBracketKeyword_2_2());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:456:1: ( (otherlv_5= RULE_ID ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:457:1: (otherlv_5= RULE_ID )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:457:1: (otherlv_5= RULE_ID )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:458:3: otherlv_5= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssetRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAsset925); 

                    		newLeafNode(otherlv_5, grammarAccess.getAssetAccess().getEmployedAtTeamCrossReference_2_3_0()); 
                    	

                    }


                    }

                    otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleAsset937); 

                        	newLeafNode(otherlv_6, grammarAccess.getAssetAccess().getRightCurlyBracketKeyword_2_4());
                        
                    otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleAsset949); 

                        	newLeafNode(otherlv_7, grammarAccess.getAssetAccess().getRightCurlyBracketKeyword_2_5());
                        

                    }
                    break;

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
    // $ANTLR end "ruleAsset"


    // $ANTLR start "entryRuleKSSBlock"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:485:1: entryRuleKSSBlock returns [EObject current=null] : iv_ruleKSSBlock= ruleKSSBlock EOF ;
    public final EObject entryRuleKSSBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKSSBlock = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:486:2: (iv_ruleKSSBlock= ruleKSSBlock EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:487:2: iv_ruleKSSBlock= ruleKSSBlock EOF
            {
             newCompositeNode(grammarAccess.getKSSBlockRule()); 
            pushFollow(FOLLOW_ruleKSSBlock_in_entryRuleKSSBlock987);
            iv_ruleKSSBlock=ruleKSSBlock();

            state._fsp--;

             current =iv_ruleKSSBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKSSBlock997); 

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
    // $ANTLR end "entryRuleKSSBlock"


    // $ANTLR start "ruleKSSBlock"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:494:1: ruleKSSBlock returns [EObject current=null] : (otherlv_0= 'KanbanBoard' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'assigned-unit' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) ) (otherlv_6= 'source-units' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )? (otherlv_10= 'target-units' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )+ otherlv_13= '}' )? (otherlv_14= 'readyQueue-limit' otherlv_15= '=' ( (lv_rQueueLimit_16_0= RULE_INT ) ) )? (otherlv_17= 'workInProgress-limit' otherlv_18= '=' ( (lv_wipLimit_19_0= RULE_INT ) ) )? otherlv_20= '}' ) ;
    public final EObject ruleKSSBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_rQueueLimit_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_wipLimit_19_0=null;
        Token otherlv_20=null;

         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:497:28: ( (otherlv_0= 'KanbanBoard' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'assigned-unit' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) ) (otherlv_6= 'source-units' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )? (otherlv_10= 'target-units' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )+ otherlv_13= '}' )? (otherlv_14= 'readyQueue-limit' otherlv_15= '=' ( (lv_rQueueLimit_16_0= RULE_INT ) ) )? (otherlv_17= 'workInProgress-limit' otherlv_18= '=' ( (lv_wipLimit_19_0= RULE_INT ) ) )? otherlv_20= '}' ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:498:1: (otherlv_0= 'KanbanBoard' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'assigned-unit' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) ) (otherlv_6= 'source-units' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )? (otherlv_10= 'target-units' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )+ otherlv_13= '}' )? (otherlv_14= 'readyQueue-limit' otherlv_15= '=' ( (lv_rQueueLimit_16_0= RULE_INT ) ) )? (otherlv_17= 'workInProgress-limit' otherlv_18= '=' ( (lv_wipLimit_19_0= RULE_INT ) ) )? otherlv_20= '}' )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:498:1: (otherlv_0= 'KanbanBoard' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'assigned-unit' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) ) (otherlv_6= 'source-units' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )? (otherlv_10= 'target-units' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )+ otherlv_13= '}' )? (otherlv_14= 'readyQueue-limit' otherlv_15= '=' ( (lv_rQueueLimit_16_0= RULE_INT ) ) )? (otherlv_17= 'workInProgress-limit' otherlv_18= '=' ( (lv_wipLimit_19_0= RULE_INT ) ) )? otherlv_20= '}' )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:498:3: otherlv_0= 'KanbanBoard' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'assigned-unit' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) ) (otherlv_6= 'source-units' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )? (otherlv_10= 'target-units' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )+ otherlv_13= '}' )? (otherlv_14= 'readyQueue-limit' otherlv_15= '=' ( (lv_rQueueLimit_16_0= RULE_INT ) ) )? (otherlv_17= 'workInProgress-limit' otherlv_18= '=' ( (lv_wipLimit_19_0= RULE_INT ) ) )? otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleKSSBlock1034); 

                	newLeafNode(otherlv_0, grammarAccess.getKSSBlockAccess().getKanbanBoardKeyword_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:502:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:503:1: (lv_name_1_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:503:1: (lv_name_1_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:504:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleKSSBlock1051); 

            			newLeafNode(lv_name_1_0, grammarAccess.getKSSBlockAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKSSBlockRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleKSSBlock1068); 

                	newLeafNode(otherlv_2, grammarAccess.getKSSBlockAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:524:1: (otherlv_3= 'assigned-unit' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:524:3: otherlv_3= 'assigned-unit' otherlv_4= '=' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleKSSBlock1081); 

                	newLeafNode(otherlv_3, grammarAccess.getKSSBlockAccess().getAssignedUnitKeyword_3_0());
                
            otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleKSSBlock1093); 

                	newLeafNode(otherlv_4, grammarAccess.getKSSBlockAccess().getEqualsSignKeyword_3_1());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:532:1: ( (otherlv_5= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:533:1: (otherlv_5= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:533:1: (otherlv_5= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:534:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getKSSBlockRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleKSSBlock1113); 

            		newLeafNode(otherlv_5, grammarAccess.getKSSBlockAccess().getAssignedUnitTeamCrossReference_3_2_0()); 
            	

            }


            }


            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:545:3: (otherlv_6= 'source-units' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:545:5: otherlv_6= 'source-units' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}'
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleKSSBlock1127); 

                        	newLeafNode(otherlv_6, grammarAccess.getKSSBlockAccess().getSourceUnitsKeyword_4_0());
                        
                    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleKSSBlock1139); 

                        	newLeafNode(otherlv_7, grammarAccess.getKSSBlockAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:553:1: ( (otherlv_8= RULE_ID ) )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_ID) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:554:1: (otherlv_8= RULE_ID )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:554:1: (otherlv_8= RULE_ID )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:555:3: otherlv_8= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getKSSBlockRule());
                    	    	        }
                    	            
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleKSSBlock1159); 

                    	    		newLeafNode(otherlv_8, grammarAccess.getKSSBlockAccess().getDemandUnitsTeamCrossReference_4_2_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);

                    otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleKSSBlock1172); 

                        	newLeafNode(otherlv_9, grammarAccess.getKSSBlockAccess().getRightCurlyBracketKeyword_4_3());
                        

                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:570:3: (otherlv_10= 'target-units' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )+ otherlv_13= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:570:5: otherlv_10= 'target-units' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )+ otherlv_13= '}'
                    {
                    otherlv_10=(Token)match(input,32,FOLLOW_32_in_ruleKSSBlock1187); 

                        	newLeafNode(otherlv_10, grammarAccess.getKSSBlockAccess().getTargetUnitsKeyword_5_0());
                        
                    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleKSSBlock1199); 

                        	newLeafNode(otherlv_11, grammarAccess.getKSSBlockAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:578:1: ( (otherlv_12= RULE_ID ) )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_ID) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:579:1: (otherlv_12= RULE_ID )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:579:1: (otherlv_12= RULE_ID )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:580:3: otherlv_12= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getKSSBlockRule());
                    	    	        }
                    	            
                    	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleKSSBlock1219); 

                    	    		newLeafNode(otherlv_12, grammarAccess.getKSSBlockAccess().getSourcedUnitsTeamCrossReference_5_2_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);

                    otherlv_13=(Token)match(input,21,FOLLOW_21_in_ruleKSSBlock1232); 

                        	newLeafNode(otherlv_13, grammarAccess.getKSSBlockAccess().getRightCurlyBracketKeyword_5_3());
                        

                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:595:3: (otherlv_14= 'readyQueue-limit' otherlv_15= '=' ( (lv_rQueueLimit_16_0= RULE_INT ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:595:5: otherlv_14= 'readyQueue-limit' otherlv_15= '=' ( (lv_rQueueLimit_16_0= RULE_INT ) )
                    {
                    otherlv_14=(Token)match(input,33,FOLLOW_33_in_ruleKSSBlock1247); 

                        	newLeafNode(otherlv_14, grammarAccess.getKSSBlockAccess().getReadyQueueLimitKeyword_6_0());
                        
                    otherlv_15=(Token)match(input,30,FOLLOW_30_in_ruleKSSBlock1259); 

                        	newLeafNode(otherlv_15, grammarAccess.getKSSBlockAccess().getEqualsSignKeyword_6_1());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:603:1: ( (lv_rQueueLimit_16_0= RULE_INT ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:604:1: (lv_rQueueLimit_16_0= RULE_INT )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:604:1: (lv_rQueueLimit_16_0= RULE_INT )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:605:3: lv_rQueueLimit_16_0= RULE_INT
                    {
                    lv_rQueueLimit_16_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleKSSBlock1276); 

                    			newLeafNode(lv_rQueueLimit_16_0, grammarAccess.getKSSBlockAccess().getRQueueLimitINTTerminalRuleCall_6_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getKSSBlockRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rQueueLimit",
                            		lv_rQueueLimit_16_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:621:4: (otherlv_17= 'workInProgress-limit' otherlv_18= '=' ( (lv_wipLimit_19_0= RULE_INT ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:621:6: otherlv_17= 'workInProgress-limit' otherlv_18= '=' ( (lv_wipLimit_19_0= RULE_INT ) )
                    {
                    otherlv_17=(Token)match(input,34,FOLLOW_34_in_ruleKSSBlock1296); 

                        	newLeafNode(otherlv_17, grammarAccess.getKSSBlockAccess().getWorkInProgressLimitKeyword_7_0());
                        
                    otherlv_18=(Token)match(input,30,FOLLOW_30_in_ruleKSSBlock1308); 

                        	newLeafNode(otherlv_18, grammarAccess.getKSSBlockAccess().getEqualsSignKeyword_7_1());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:629:1: ( (lv_wipLimit_19_0= RULE_INT ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:630:1: (lv_wipLimit_19_0= RULE_INT )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:630:1: (lv_wipLimit_19_0= RULE_INT )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:631:3: lv_wipLimit_19_0= RULE_INT
                    {
                    lv_wipLimit_19_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleKSSBlock1325); 

                    			newLeafNode(lv_wipLimit_19_0, grammarAccess.getKSSBlockAccess().getWipLimitINTTerminalRuleCall_7_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getKSSBlockRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"wipLimit",
                            		lv_wipLimit_19_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_20=(Token)match(input,21,FOLLOW_21_in_ruleKSSBlock1344); 

                	newLeafNode(otherlv_20, grammarAccess.getKSSBlockAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleKSSBlock"


    // $ANTLR start "entryRuleMechanism"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:659:1: entryRuleMechanism returns [EObject current=null] : iv_ruleMechanism= ruleMechanism EOF ;
    public final EObject entryRuleMechanism() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMechanism = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:660:2: (iv_ruleMechanism= ruleMechanism EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:661:2: iv_ruleMechanism= ruleMechanism EOF
            {
             newCompositeNode(grammarAccess.getMechanismRule()); 
            pushFollow(FOLLOW_ruleMechanism_in_entryRuleMechanism1380);
            iv_ruleMechanism=ruleMechanism();

            state._fsp--;

             current =iv_ruleMechanism; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMechanism1390); 

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
    // $ANTLR end "entryRuleMechanism"


    // $ANTLR start "ruleMechanism"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:668:1: ruleMechanism returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleMechanism() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:671:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:672:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:672:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:672:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:672:2: ( (otherlv_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:673:1: (otherlv_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:673:1: (otherlv_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:674:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMechanismRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMechanism1435); 

            		newLeafNode(otherlv_0, grammarAccess.getMechanismAccess().getSourceTaskTaskCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleMechanism1447); 

                	newLeafNode(otherlv_1, grammarAccess.getMechanismAccess().getEqualsSignGreaterThanSignKeyword_1());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:689:1: ( (otherlv_2= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:690:1: (otherlv_2= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:690:1: (otherlv_2= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:691:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMechanismRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMechanism1467); 

            		newLeafNode(otherlv_2, grammarAccess.getMechanismAccess().getTargetTaskTaskCrossReference_2_0()); 
            	

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
    // $ANTLR end "ruleMechanism"


    // $ANTLR start "entryRuleRequirement"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:710:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:711:2: (iv_ruleRequirement= ruleRequirement EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:712:2: iv_ruleRequirement= ruleRequirement EOF
            {
             newCompositeNode(grammarAccess.getRequirementRule()); 
            pushFollow(FOLLOW_ruleRequirement_in_entryRuleRequirement1503);
            iv_ruleRequirement=ruleRequirement();

            state._fsp--;

             current =iv_ruleRequirement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequirement1513); 

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
    // $ANTLR end "entryRuleRequirement"


    // $ANTLR start "ruleRequirement"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:719:1: ruleRequirement returns [EObject current=null] : (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'tasks' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' ) (otherlv_7= 'process' ( (lv_mechanisms_8_0= ruleMechanism ) )* )? otherlv_9= '}' ) ;
    public final EObject ruleRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_mechanisms_8_0 = null;


         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:722:28: ( (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'tasks' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' ) (otherlv_7= 'process' ( (lv_mechanisms_8_0= ruleMechanism ) )* )? otherlv_9= '}' ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:723:1: (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'tasks' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' ) (otherlv_7= 'process' ( (lv_mechanisms_8_0= ruleMechanism ) )* )? otherlv_9= '}' )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:723:1: (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'tasks' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' ) (otherlv_7= 'process' ( (lv_mechanisms_8_0= ruleMechanism ) )* )? otherlv_9= '}' )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:723:3: otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'tasks' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' ) (otherlv_7= 'process' ( (lv_mechanisms_8_0= ruleMechanism ) )* )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleRequirement1550); 

                	newLeafNode(otherlv_0, grammarAccess.getRequirementAccess().getRequirementKeyword_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:727:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:728:1: (lv_name_1_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:728:1: (lv_name_1_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:729:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirement1567); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRequirementAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRequirementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleRequirement1584); 

                	newLeafNode(otherlv_2, grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:749:1: (otherlv_3= 'tasks' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:749:3: otherlv_3= 'tasks' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}'
            {
            otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleRequirement1597); 

                	newLeafNode(otherlv_3, grammarAccess.getRequirementAccess().getTasksKeyword_3_0());
                
            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleRequirement1609); 

                	newLeafNode(otherlv_4, grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_3_1());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:757:1: ( (otherlv_5= RULE_ID ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:758:1: (otherlv_5= RULE_ID )
            	    {
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:758:1: (otherlv_5= RULE_ID )
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:759:3: otherlv_5= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	        }
            	            
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirement1629); 

            	    		newLeafNode(otherlv_5, grammarAccess.getRequirementAccess().getRTasksTaskCrossReference_3_2_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);

            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleRequirement1642); 

                	newLeafNode(otherlv_6, grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_3_3());
                

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:774:2: (otherlv_7= 'process' ( (lv_mechanisms_8_0= ruleMechanism ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==38) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:774:4: otherlv_7= 'process' ( (lv_mechanisms_8_0= ruleMechanism ) )*
                    {
                    otherlv_7=(Token)match(input,38,FOLLOW_38_in_ruleRequirement1656); 

                        	newLeafNode(otherlv_7, grammarAccess.getRequirementAccess().getProcessKeyword_4_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:778:1: ( (lv_mechanisms_8_0= ruleMechanism ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==RULE_ID) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:779:1: (lv_mechanisms_8_0= ruleMechanism )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:779:1: (lv_mechanisms_8_0= ruleMechanism )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:780:3: lv_mechanisms_8_0= ruleMechanism
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRequirementAccess().getMechanismsMechanismParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMechanism_in_ruleRequirement1677);
                    	    lv_mechanisms_8_0=ruleMechanism();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRequirementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"mechanisms",
                    	            		lv_mechanisms_8_0, 
                    	            		"Mechanism");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleRequirement1692); 

                	newLeafNode(otherlv_9, grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleRequirement"


    // $ANTLR start "entryRuleTask"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:808:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:809:2: (iv_ruleTask= ruleTask EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:810:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_ruleTask_in_entryRuleTask1728);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTask1738); 

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
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:817:1: ruleTask returns [EObject current=null] : (otherlv_0= 'workItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'subtasks' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' )? (otherlv_7= 'process' ( (lv_taskMechanims_8_0= ruleMechanism ) )* )? (otherlv_9= 'services-required' ( (otherlv_10= RULE_ID ) )+ )? (otherlv_11= 'base value' ( (lv_bvalue_12_0= RULE_INT ) ) )? (otherlv_13= 'class-of-service' ( (lv_COS_14_0= RULE_ID ) ) )? otherlv_15= '}' ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_bvalue_12_0=null;
        Token otherlv_13=null;
        Token lv_COS_14_0=null;
        Token otherlv_15=null;
        EObject lv_taskMechanims_8_0 = null;


         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:820:28: ( (otherlv_0= 'workItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'subtasks' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' )? (otherlv_7= 'process' ( (lv_taskMechanims_8_0= ruleMechanism ) )* )? (otherlv_9= 'services-required' ( (otherlv_10= RULE_ID ) )+ )? (otherlv_11= 'base value' ( (lv_bvalue_12_0= RULE_INT ) ) )? (otherlv_13= 'class-of-service' ( (lv_COS_14_0= RULE_ID ) ) )? otherlv_15= '}' ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:821:1: (otherlv_0= 'workItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'subtasks' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' )? (otherlv_7= 'process' ( (lv_taskMechanims_8_0= ruleMechanism ) )* )? (otherlv_9= 'services-required' ( (otherlv_10= RULE_ID ) )+ )? (otherlv_11= 'base value' ( (lv_bvalue_12_0= RULE_INT ) ) )? (otherlv_13= 'class-of-service' ( (lv_COS_14_0= RULE_ID ) ) )? otherlv_15= '}' )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:821:1: (otherlv_0= 'workItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'subtasks' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' )? (otherlv_7= 'process' ( (lv_taskMechanims_8_0= ruleMechanism ) )* )? (otherlv_9= 'services-required' ( (otherlv_10= RULE_ID ) )+ )? (otherlv_11= 'base value' ( (lv_bvalue_12_0= RULE_INT ) ) )? (otherlv_13= 'class-of-service' ( (lv_COS_14_0= RULE_ID ) ) )? otherlv_15= '}' )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:821:3: otherlv_0= 'workItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'subtasks' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' )? (otherlv_7= 'process' ( (lv_taskMechanims_8_0= ruleMechanism ) )* )? (otherlv_9= 'services-required' ( (otherlv_10= RULE_ID ) )+ )? (otherlv_11= 'base value' ( (lv_bvalue_12_0= RULE_INT ) ) )? (otherlv_13= 'class-of-service' ( (lv_COS_14_0= RULE_ID ) ) )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleTask1775); 

                	newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getWorkItemKeyword_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:825:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:826:1: (lv_name_1_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:826:1: (lv_name_1_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:827:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTask1792); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTaskRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleTask1809); 

                	newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:847:1: (otherlv_3= 'subtasks' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==40) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:847:3: otherlv_3= 'subtasks' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,40,FOLLOW_40_in_ruleTask1822); 

                        	newLeafNode(otherlv_3, grammarAccess.getTaskAccess().getSubtasksKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleTask1834); 

                        	newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:855:1: ( (otherlv_5= RULE_ID ) )+
                    int cnt22=0;
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==RULE_ID) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:856:1: (otherlv_5= RULE_ID )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:856:1: (otherlv_5= RULE_ID )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:857:3: otherlv_5= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTaskRule());
                    	    	        }
                    	            
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTask1854); 

                    	    		newLeafNode(otherlv_5, grammarAccess.getTaskAccess().getSTasksTaskCrossReference_3_2_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt22 >= 1 ) break loop22;
                                EarlyExitException eee =
                                    new EarlyExitException(22, input);
                                throw eee;
                        }
                        cnt22++;
                    } while (true);

                    otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleTask1867); 

                        	newLeafNode(otherlv_6, grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_3_3());
                        

                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:872:3: (otherlv_7= 'process' ( (lv_taskMechanims_8_0= ruleMechanism ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==38) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:872:5: otherlv_7= 'process' ( (lv_taskMechanims_8_0= ruleMechanism ) )*
                    {
                    otherlv_7=(Token)match(input,38,FOLLOW_38_in_ruleTask1882); 

                        	newLeafNode(otherlv_7, grammarAccess.getTaskAccess().getProcessKeyword_4_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:876:1: ( (lv_taskMechanims_8_0= ruleMechanism ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==RULE_ID) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:877:1: (lv_taskMechanims_8_0= ruleMechanism )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:877:1: (lv_taskMechanims_8_0= ruleMechanism )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:878:3: lv_taskMechanims_8_0= ruleMechanism
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTaskAccess().getTaskMechanimsMechanismParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMechanism_in_ruleTask1903);
                    	    lv_taskMechanims_8_0=ruleMechanism();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTaskRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"taskMechanims",
                    	            		lv_taskMechanims_8_0, 
                    	            		"Mechanism");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:894:5: (otherlv_9= 'services-required' ( (otherlv_10= RULE_ID ) )+ )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==41) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:894:7: otherlv_9= 'services-required' ( (otherlv_10= RULE_ID ) )+
                    {
                    otherlv_9=(Token)match(input,41,FOLLOW_41_in_ruleTask1919); 

                        	newLeafNode(otherlv_9, grammarAccess.getTaskAccess().getServicesRequiredKeyword_5_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:898:1: ( (otherlv_10= RULE_ID ) )+
                    int cnt26=0;
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==RULE_ID) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:899:1: (otherlv_10= RULE_ID )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:899:1: (otherlv_10= RULE_ID )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:900:3: otherlv_10= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTaskRule());
                    	    	        }
                    	            
                    	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTask1939); 

                    	    		newLeafNode(otherlv_10, grammarAccess.getTaskAccess().getReqSpecialtiesServiceCrossReference_5_1_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt26 >= 1 ) break loop26;
                                EarlyExitException eee =
                                    new EarlyExitException(26, input);
                                throw eee;
                        }
                        cnt26++;
                    } while (true);


                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:911:5: (otherlv_11= 'base value' ( (lv_bvalue_12_0= RULE_INT ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==42) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:911:7: otherlv_11= 'base value' ( (lv_bvalue_12_0= RULE_INT ) )
                    {
                    otherlv_11=(Token)match(input,42,FOLLOW_42_in_ruleTask1955); 

                        	newLeafNode(otherlv_11, grammarAccess.getTaskAccess().getBaseValueKeyword_6_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:915:1: ( (lv_bvalue_12_0= RULE_INT ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:916:1: (lv_bvalue_12_0= RULE_INT )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:916:1: (lv_bvalue_12_0= RULE_INT )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:917:3: lv_bvalue_12_0= RULE_INT
                    {
                    lv_bvalue_12_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTask1972); 

                    			newLeafNode(lv_bvalue_12_0, grammarAccess.getTaskAccess().getBvalueINTTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTaskRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"bvalue",
                            		lv_bvalue_12_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:933:4: (otherlv_13= 'class-of-service' ( (lv_COS_14_0= RULE_ID ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==43) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:933:6: otherlv_13= 'class-of-service' ( (lv_COS_14_0= RULE_ID ) )
                    {
                    otherlv_13=(Token)match(input,43,FOLLOW_43_in_ruleTask1992); 

                        	newLeafNode(otherlv_13, grammarAccess.getTaskAccess().getClassOfServiceKeyword_7_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:937:1: ( (lv_COS_14_0= RULE_ID ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:938:1: (lv_COS_14_0= RULE_ID )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:938:1: (lv_COS_14_0= RULE_ID )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:939:3: lv_COS_14_0= RULE_ID
                    {
                    lv_COS_14_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTask2009); 

                    			newLeafNode(lv_COS_14_0, grammarAccess.getTaskAccess().getCOSIDTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTaskRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"COS",
                            		lv_COS_14_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,21,FOLLOW_21_in_ruleTask2028); 

                	newLeafNode(otherlv_15, grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleKanbanWorkFlow"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:967:1: entryRuleKanbanWorkFlow returns [EObject current=null] : iv_ruleKanbanWorkFlow= ruleKanbanWorkFlow EOF ;
    public final EObject entryRuleKanbanWorkFlow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKanbanWorkFlow = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:968:2: (iv_ruleKanbanWorkFlow= ruleKanbanWorkFlow EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:969:2: iv_ruleKanbanWorkFlow= ruleKanbanWorkFlow EOF
            {
             newCompositeNode(grammarAccess.getKanbanWorkFlowRule()); 
            pushFollow(FOLLOW_ruleKanbanWorkFlow_in_entryRuleKanbanWorkFlow2064);
            iv_ruleKanbanWorkFlow=ruleKanbanWorkFlow();

            state._fsp--;

             current =iv_ruleKanbanWorkFlow; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKanbanWorkFlow2074); 

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
    // $ANTLR end "entryRuleKanbanWorkFlow"


    // $ANTLR start "ruleKanbanWorkFlow"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:976:1: ruleKanbanWorkFlow returns [EObject current=null] : (otherlv_0= 'WorkFlow' ( (lv_name_1_0= RULE_ID ) ) ( (lv_caps_2_0= ruleCapability ) )+ otherlv_3= 'end WorkFlow' ) ;
    public final EObject ruleKanbanWorkFlow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_caps_2_0 = null;


         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:979:28: ( (otherlv_0= 'WorkFlow' ( (lv_name_1_0= RULE_ID ) ) ( (lv_caps_2_0= ruleCapability ) )+ otherlv_3= 'end WorkFlow' ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:980:1: (otherlv_0= 'WorkFlow' ( (lv_name_1_0= RULE_ID ) ) ( (lv_caps_2_0= ruleCapability ) )+ otherlv_3= 'end WorkFlow' )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:980:1: (otherlv_0= 'WorkFlow' ( (lv_name_1_0= RULE_ID ) ) ( (lv_caps_2_0= ruleCapability ) )+ otherlv_3= 'end WorkFlow' )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:980:3: otherlv_0= 'WorkFlow' ( (lv_name_1_0= RULE_ID ) ) ( (lv_caps_2_0= ruleCapability ) )+ otherlv_3= 'end WorkFlow'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleKanbanWorkFlow2111); 

                	newLeafNode(otherlv_0, grammarAccess.getKanbanWorkFlowAccess().getWorkFlowKeyword_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:984:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:985:1: (lv_name_1_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:985:1: (lv_name_1_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:986:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleKanbanWorkFlow2128); 

            			newLeafNode(lv_name_1_0, grammarAccess.getKanbanWorkFlowAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKanbanWorkFlowRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1002:2: ( (lv_caps_2_0= ruleCapability ) )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==46) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1003:1: (lv_caps_2_0= ruleCapability )
            	    {
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1003:1: (lv_caps_2_0= ruleCapability )
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1004:3: lv_caps_2_0= ruleCapability
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKanbanWorkFlowAccess().getCapsCapabilityParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCapability_in_ruleKanbanWorkFlow2154);
            	    lv_caps_2_0=ruleCapability();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKanbanWorkFlowRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"caps",
            	            		lv_caps_2_0, 
            	            		"Capability");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);

            otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleKanbanWorkFlow2167); 

                	newLeafNode(otherlv_3, grammarAccess.getKanbanWorkFlowAccess().getEndWorkFlowKeyword_3());
                

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
    // $ANTLR end "ruleKanbanWorkFlow"


    // $ANTLR start "entryRuleCapability"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1032:1: entryRuleCapability returns [EObject current=null] : iv_ruleCapability= ruleCapability EOF ;
    public final EObject entryRuleCapability() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCapability = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1033:2: (iv_ruleCapability= ruleCapability EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1034:2: iv_ruleCapability= ruleCapability EOF
            {
             newCompositeNode(grammarAccess.getCapabilityRule()); 
            pushFollow(FOLLOW_ruleCapability_in_entryRuleCapability2203);
            iv_ruleCapability=ruleCapability();

            state._fsp--;

             current =iv_ruleCapability; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCapability2213); 

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
    // $ANTLR end "entryRuleCapability"


    // $ANTLR start "ruleCapability"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1041:1: ruleCapability returns [EObject current=null] : (otherlv_0= 'capability' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_reqs_3_0= ruleRequirement ) )+ otherlv_4= '}' ) ;
    public final EObject ruleCapability() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_reqs_3_0 = null;


         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1044:28: ( (otherlv_0= 'capability' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_reqs_3_0= ruleRequirement ) )+ otherlv_4= '}' ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1045:1: (otherlv_0= 'capability' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_reqs_3_0= ruleRequirement ) )+ otherlv_4= '}' )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1045:1: (otherlv_0= 'capability' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_reqs_3_0= ruleRequirement ) )+ otherlv_4= '}' )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1045:3: otherlv_0= 'capability' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_reqs_3_0= ruleRequirement ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleCapability2250); 

                	newLeafNode(otherlv_0, grammarAccess.getCapabilityAccess().getCapabilityKeyword_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1049:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1050:1: (lv_name_1_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1050:1: (lv_name_1_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1051:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCapability2267); 

            			newLeafNode(lv_name_1_0, grammarAccess.getCapabilityAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCapabilityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleCapability2284); 

                	newLeafNode(otherlv_2, grammarAccess.getCapabilityAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1071:1: ( (lv_reqs_3_0= ruleRequirement ) )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==36) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1072:1: (lv_reqs_3_0= ruleRequirement )
            	    {
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1072:1: (lv_reqs_3_0= ruleRequirement )
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1073:3: lv_reqs_3_0= ruleRequirement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCapabilityAccess().getReqsRequirementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRequirement_in_ruleCapability2305);
            	    lv_reqs_3_0=ruleRequirement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCapabilityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"reqs",
            	            		lv_reqs_3_0, 
            	            		"Requirement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleCapability2318); 

                	newLeafNode(otherlv_4, grammarAccess.getCapabilityAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleCapability"


    // $ANTLR start "ruleProfileType"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1101:1: ruleProfileType returns [Enumerator current=null] : ( (enumLiteral_0= 'STABILIZER' ) | (enumLiteral_1= 'VISIONARY' ) | (enumLiteral_2= 'COOPERATOR' ) | (enumLiteral_3= 'CATALYST' ) ) ;
    public final Enumerator ruleProfileType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1103:28: ( ( (enumLiteral_0= 'STABILIZER' ) | (enumLiteral_1= 'VISIONARY' ) | (enumLiteral_2= 'COOPERATOR' ) | (enumLiteral_3= 'CATALYST' ) ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1104:1: ( (enumLiteral_0= 'STABILIZER' ) | (enumLiteral_1= 'VISIONARY' ) | (enumLiteral_2= 'COOPERATOR' ) | (enumLiteral_3= 'CATALYST' ) )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1104:1: ( (enumLiteral_0= 'STABILIZER' ) | (enumLiteral_1= 'VISIONARY' ) | (enumLiteral_2= 'COOPERATOR' ) | (enumLiteral_3= 'CATALYST' ) )
            int alt32=4;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt32=1;
                }
                break;
            case 48:
                {
                alt32=2;
                }
                break;
            case 49:
                {
                alt32=3;
                }
                break;
            case 50:
                {
                alt32=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1104:2: (enumLiteral_0= 'STABILIZER' )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1104:2: (enumLiteral_0= 'STABILIZER' )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1104:4: enumLiteral_0= 'STABILIZER'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_47_in_ruleProfileType2368); 

                            current = grammarAccess.getProfileTypeAccess().getSTABILIZEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getProfileTypeAccess().getSTABILIZEREnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1110:6: (enumLiteral_1= 'VISIONARY' )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1110:6: (enumLiteral_1= 'VISIONARY' )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1110:8: enumLiteral_1= 'VISIONARY'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_48_in_ruleProfileType2385); 

                            current = grammarAccess.getProfileTypeAccess().getVISIONARYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getProfileTypeAccess().getVISIONARYEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1116:6: (enumLiteral_2= 'COOPERATOR' )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1116:6: (enumLiteral_2= 'COOPERATOR' )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1116:8: enumLiteral_2= 'COOPERATOR'
                    {
                    enumLiteral_2=(Token)match(input,49,FOLLOW_49_in_ruleProfileType2402); 

                            current = grammarAccess.getProfileTypeAccess().getCOOPERATOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getProfileTypeAccess().getCOOPERATOREnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1122:6: (enumLiteral_3= 'CATALYST' )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1122:6: (enumLiteral_3= 'CATALYST' )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1122:8: enumLiteral_3= 'CATALYST'
                    {
                    enumLiteral_3=(Token)match(input,50,FOLLOW_50_in_ruleProfileType2419); 

                            current = grammarAccess.getProfileTypeAccess().getCATALYSTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getProfileTypeAccess().getCATALYSTEnumLiteralDeclaration_3()); 
                        

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
    // $ANTLR end "ruleProfileType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleKanbanSchedulingSystem_in_entryRuleKanbanSchedulingSystem75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKanbanSchedulingSystem85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleKanbanSchedulingSystem122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleKanbanSchedulingSystem139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleKanbanSchedulingSystem156 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_ruleTeam_in_ruleKanbanSchedulingSystem177 = new BitSet(new long[]{0x0000000000062000L});
    public static final BitSet FOLLOW_13_in_ruleKanbanSchedulingSystem190 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleKanbanSchedulingSystem202 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ruleTask_in_ruleKanbanSchedulingSystem223 = new BitSet(new long[]{0x0000008000008000L});
    public static final BitSet FOLLOW_15_in_ruleKanbanSchedulingSystem236 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ruleKanbanWorkFlow_in_ruleKanbanSchedulingSystem257 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleKanbanSchedulingSystem269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTeam_in_entryRuleTeam305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTeam315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleTeam353 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18_in_ruleTeam371 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTeam389 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTeam406 = new BitSet(new long[]{0x0000000011F00000L});
    public static final BitSet FOLLOW_20_in_ruleTeam419 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTeam431 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTeam451 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_21_in_ruleTeam464 = new BitSet(new long[]{0x0000000011E00000L});
    public static final BitSet FOLLOW_22_in_ruleTeam479 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTeam491 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleAsset_in_ruleTeam512 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_21_in_ruleTeam525 = new BitSet(new long[]{0x0000000011A00000L});
    public static final BitSet FOLLOW_23_in_ruleTeam540 = new BitSet(new long[]{0x0007800000000000L});
    public static final BitSet FOLLOW_ruleProfileType_in_ruleTeam561 = new BitSet(new long[]{0x0000000011200000L});
    public static final BitSet FOLLOW_24_in_ruleTeam576 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTeam588 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleService_in_ruleTeam609 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_21_in_ruleTeam622 = new BitSet(new long[]{0x0000000010200000L});
    public static final BitSet FOLLOW_ruleKSSBlock_in_ruleTeam645 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTeam658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService694 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleService741 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_entryRuleAsset799 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAsset809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleAsset846 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAsset863 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleAsset881 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleAsset893 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAsset905 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAsset925 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleAsset937 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleAsset949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKSSBlock_in_entryRuleKSSBlock987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKSSBlock997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleKSSBlock1034 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleKSSBlock1051 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKSSBlock1068 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleKSSBlock1081 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleKSSBlock1093 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleKSSBlock1113 = new BitSet(new long[]{0x0000000780200000L});
    public static final BitSet FOLLOW_31_in_ruleKSSBlock1127 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKSSBlock1139 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleKSSBlock1159 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_21_in_ruleKSSBlock1172 = new BitSet(new long[]{0x0000000700200000L});
    public static final BitSet FOLLOW_32_in_ruleKSSBlock1187 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKSSBlock1199 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleKSSBlock1219 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_21_in_ruleKSSBlock1232 = new BitSet(new long[]{0x0000000600200000L});
    public static final BitSet FOLLOW_33_in_ruleKSSBlock1247 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleKSSBlock1259 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleKSSBlock1276 = new BitSet(new long[]{0x0000000400200000L});
    public static final BitSet FOLLOW_34_in_ruleKSSBlock1296 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleKSSBlock1308 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleKSSBlock1325 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleKSSBlock1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMechanism_in_entryRuleMechanism1380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMechanism1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMechanism1435 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleMechanism1447 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMechanism1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirement_in_entryRuleRequirement1503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequirement1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleRequirement1550 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirement1567 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRequirement1584 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleRequirement1597 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRequirement1609 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirement1629 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_21_in_ruleRequirement1642 = new BitSet(new long[]{0x0000004000200000L});
    public static final BitSet FOLLOW_38_in_ruleRequirement1656 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_ruleMechanism_in_ruleRequirement1677 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_21_in_ruleRequirement1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_entryRuleTask1728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTask1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleTask1775 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTask1792 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTask1809 = new BitSet(new long[]{0x00000F4000200000L});
    public static final BitSet FOLLOW_40_in_ruleTask1822 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTask1834 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTask1854 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_21_in_ruleTask1867 = new BitSet(new long[]{0x00000E4000200000L});
    public static final BitSet FOLLOW_38_in_ruleTask1882 = new BitSet(new long[]{0x00000E0000200010L});
    public static final BitSet FOLLOW_ruleMechanism_in_ruleTask1903 = new BitSet(new long[]{0x00000E0000200010L});
    public static final BitSet FOLLOW_41_in_ruleTask1919 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTask1939 = new BitSet(new long[]{0x00000C0000200010L});
    public static final BitSet FOLLOW_42_in_ruleTask1955 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTask1972 = new BitSet(new long[]{0x0000080000200000L});
    public static final BitSet FOLLOW_43_in_ruleTask1992 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTask2009 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTask2028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKanbanWorkFlow_in_entryRuleKanbanWorkFlow2064 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKanbanWorkFlow2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleKanbanWorkFlow2111 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleKanbanWorkFlow2128 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ruleCapability_in_ruleKanbanWorkFlow2154 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_45_in_ruleKanbanWorkFlow2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCapability_in_entryRuleCapability2203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCapability2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleCapability2250 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCapability2267 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCapability2284 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_ruleRequirement_in_ruleCapability2305 = new BitSet(new long[]{0x0000001000200000L});
    public static final BitSet FOLLOW_21_in_ruleCapability2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleProfileType2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleProfileType2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleProfileType2402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleProfileType2419 = new BitSet(new long[]{0x0000000000000002L});

}