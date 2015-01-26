package ausim.xtext.kanban.domainmodel.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'KSSModel'", "'OrganizationModel'", "'end OrganizationModel'", "'WorkFlowModel'", "'end WorkFlowModel'", "'GovernanceModel'", "'end GovernanceModel'", "'end KSSModel'", "'team'", "'group'", "'{'", "'sourceUnits'", "'}'", "'targetUnits'", "'contains'", "'resources'", "'services'", "'service'", "'resource'", "'skills'", "'=>'", "'->'", "'requirement'", "'workItems'", "'workItemNetwork'", "'workItem'", "'subtasks'", "'taskDependencies'", "'servicesRequired'", "'base value'", "'classOfService'", "'WorkFlow'", "'end WorkFlow'", "'capability'", "'strategy'", "'entity'", "'ServiceDirectory'", "'='", "'['", "']'", "'('", "','", "')'", "'events'", "'end'", "'activities'", "'state'", "'actions'", "'/'"
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
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:67:1: entryRuleKanbanSchedulingSystem returns [EObject current=null] : iv_ruleKanbanSchedulingSystem= ruleKanbanSchedulingSystem EOF ;
    public final EObject entryRuleKanbanSchedulingSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKanbanSchedulingSystem = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:68:2: (iv_ruleKanbanSchedulingSystem= ruleKanbanSchedulingSystem EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:69:2: iv_ruleKanbanSchedulingSystem= ruleKanbanSchedulingSystem EOF
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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:76:1: ruleKanbanSchedulingSystem returns [EObject current=null] : (otherlv_0= 'KSSModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'OrganizationModel' ( (lv_orgUnits_3_0= ruleTeam ) )+ otherlv_4= 'end OrganizationModel' otherlv_5= 'WorkFlowModel' ( (lv_kssTasks_6_0= ruleTask ) )+ ( (lv_kssWorkFlow_7_0= ruleKanbanTaskModel ) ) otherlv_8= 'end WorkFlowModel' otherlv_9= 'GovernanceModel' ( (lv_kssGovModel_10_0= ruleKanbanGovModel ) ) otherlv_11= 'end GovernanceModel' otherlv_12= 'end KSSModel' ) ;
    public final EObject ruleKanbanSchedulingSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_orgUnits_3_0 = null;

        EObject lv_kssTasks_6_0 = null;

        EObject lv_kssWorkFlow_7_0 = null;

        EObject lv_kssGovModel_10_0 = null;


         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:79:28: ( (otherlv_0= 'KSSModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'OrganizationModel' ( (lv_orgUnits_3_0= ruleTeam ) )+ otherlv_4= 'end OrganizationModel' otherlv_5= 'WorkFlowModel' ( (lv_kssTasks_6_0= ruleTask ) )+ ( (lv_kssWorkFlow_7_0= ruleKanbanTaskModel ) ) otherlv_8= 'end WorkFlowModel' otherlv_9= 'GovernanceModel' ( (lv_kssGovModel_10_0= ruleKanbanGovModel ) ) otherlv_11= 'end GovernanceModel' otherlv_12= 'end KSSModel' ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:80:1: (otherlv_0= 'KSSModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'OrganizationModel' ( (lv_orgUnits_3_0= ruleTeam ) )+ otherlv_4= 'end OrganizationModel' otherlv_5= 'WorkFlowModel' ( (lv_kssTasks_6_0= ruleTask ) )+ ( (lv_kssWorkFlow_7_0= ruleKanbanTaskModel ) ) otherlv_8= 'end WorkFlowModel' otherlv_9= 'GovernanceModel' ( (lv_kssGovModel_10_0= ruleKanbanGovModel ) ) otherlv_11= 'end GovernanceModel' otherlv_12= 'end KSSModel' )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:80:1: (otherlv_0= 'KSSModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'OrganizationModel' ( (lv_orgUnits_3_0= ruleTeam ) )+ otherlv_4= 'end OrganizationModel' otherlv_5= 'WorkFlowModel' ( (lv_kssTasks_6_0= ruleTask ) )+ ( (lv_kssWorkFlow_7_0= ruleKanbanTaskModel ) ) otherlv_8= 'end WorkFlowModel' otherlv_9= 'GovernanceModel' ( (lv_kssGovModel_10_0= ruleKanbanGovModel ) ) otherlv_11= 'end GovernanceModel' otherlv_12= 'end KSSModel' )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:80:3: otherlv_0= 'KSSModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'OrganizationModel' ( (lv_orgUnits_3_0= ruleTeam ) )+ otherlv_4= 'end OrganizationModel' otherlv_5= 'WorkFlowModel' ( (lv_kssTasks_6_0= ruleTask ) )+ ( (lv_kssWorkFlow_7_0= ruleKanbanTaskModel ) ) otherlv_8= 'end WorkFlowModel' otherlv_9= 'GovernanceModel' ( (lv_kssGovModel_10_0= ruleKanbanGovModel ) ) otherlv_11= 'end GovernanceModel' otherlv_12= 'end KSSModel'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleKanbanSchedulingSystem122); 

                	newLeafNode(otherlv_0, grammarAccess.getKanbanSchedulingSystemAccess().getKSSModelKeyword_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:85:1: (lv_name_1_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:86:3: lv_name_1_0= RULE_ID
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

                	newLeafNode(otherlv_2, grammarAccess.getKanbanSchedulingSystemAccess().getOrganizationModelKeyword_2());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:106:1: ( (lv_orgUnits_3_0= ruleTeam ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=19 && LA1_0<=20)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:107:1: (lv_orgUnits_3_0= ruleTeam )
            	    {
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:107:1: (lv_orgUnits_3_0= ruleTeam )
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:108:3: lv_orgUnits_3_0= ruleTeam
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

                	newLeafNode(otherlv_4, grammarAccess.getKanbanSchedulingSystemAccess().getEndOrganizationModelKeyword_4());
                
            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleKanbanSchedulingSystem202); 

                	newLeafNode(otherlv_5, grammarAccess.getKanbanSchedulingSystemAccess().getWorkFlowModelKeyword_5());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:132:1: ( (lv_kssTasks_6_0= ruleTask ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==36) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:133:1: (lv_kssTasks_6_0= ruleTask )
            	    {
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:133:1: (lv_kssTasks_6_0= ruleTask )
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:134:3: lv_kssTasks_6_0= ruleTask
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

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:150:3: ( (lv_kssWorkFlow_7_0= ruleKanbanTaskModel ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:151:1: (lv_kssWorkFlow_7_0= ruleKanbanTaskModel )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:151:1: (lv_kssWorkFlow_7_0= ruleKanbanTaskModel )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:152:3: lv_kssWorkFlow_7_0= ruleKanbanTaskModel
            {
             
            	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getKssWorkFlowKanbanTaskModelParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleKanbanTaskModel_in_ruleKanbanSchedulingSystem245);
            lv_kssWorkFlow_7_0=ruleKanbanTaskModel();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
            	        }
                   		set(
                   			current, 
                   			"kssWorkFlow",
                    		lv_kssWorkFlow_7_0, 
                    		"KanbanTaskModel");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleKanbanSchedulingSystem257); 

                	newLeafNode(otherlv_8, grammarAccess.getKanbanSchedulingSystemAccess().getEndWorkFlowModelKeyword_8());
                
            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleKanbanSchedulingSystem269); 

                	newLeafNode(otherlv_9, grammarAccess.getKanbanSchedulingSystemAccess().getGovernanceModelKeyword_9());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:176:1: ( (lv_kssGovModel_10_0= ruleKanbanGovModel ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:177:1: (lv_kssGovModel_10_0= ruleKanbanGovModel )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:177:1: (lv_kssGovModel_10_0= ruleKanbanGovModel )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:178:3: lv_kssGovModel_10_0= ruleKanbanGovModel
            {
             
            	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getKssGovModelKanbanGovModelParserRuleCall_10_0()); 
            	    
            pushFollow(FOLLOW_ruleKanbanGovModel_in_ruleKanbanSchedulingSystem290);
            lv_kssGovModel_10_0=ruleKanbanGovModel();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
            	        }
                   		set(
                   			current, 
                   			"kssGovModel",
                    		lv_kssGovModel_10_0, 
                    		"KanbanGovModel");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleKanbanSchedulingSystem302); 

                	newLeafNode(otherlv_11, grammarAccess.getKanbanSchedulingSystemAccess().getEndGovernanceModelKeyword_11());
                
            otherlv_12=(Token)match(input,18,FOLLOW_18_in_ruleKanbanSchedulingSystem314); 

                	newLeafNode(otherlv_12, grammarAccess.getKanbanSchedulingSystemAccess().getEndKSSModelKeyword_12());
                

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:210:1: entryRuleTeam returns [EObject current=null] : iv_ruleTeam= ruleTeam EOF ;
    public final EObject entryRuleTeam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeam = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:211:2: (iv_ruleTeam= ruleTeam EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:212:2: iv_ruleTeam= ruleTeam EOF
            {
             newCompositeNode(grammarAccess.getTeamRule()); 
            pushFollow(FOLLOW_ruleTeam_in_entryRuleTeam350);
            iv_ruleTeam=ruleTeam();

            state._fsp--;

             current =iv_ruleTeam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTeam360); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:219:1: ruleTeam returns [EObject current=null] : ( (otherlv_0= 'team' | otherlv_1= 'group' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'sourceUnits' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}' )? (otherlv_8= 'targetUnits' otherlv_9= '{' ( (otherlv_10= RULE_ID ) )+ otherlv_11= '}' )? (otherlv_12= 'contains' otherlv_13= '{' ( (otherlv_14= RULE_ID ) )+ otherlv_15= '}' )? (otherlv_16= 'resources' otherlv_17= '{' ( (lv_resources_18_0= ruleAsset ) )+ otherlv_19= '}' )? (otherlv_20= 'services' otherlv_21= '{' ( (lv_services_22_0= ruleService ) )+ otherlv_23= '}' )? otherlv_24= '}' ) ;
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
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        EObject lv_resources_18_0 = null;

        EObject lv_services_22_0 = null;


         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:222:28: ( ( (otherlv_0= 'team' | otherlv_1= 'group' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'sourceUnits' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}' )? (otherlv_8= 'targetUnits' otherlv_9= '{' ( (otherlv_10= RULE_ID ) )+ otherlv_11= '}' )? (otherlv_12= 'contains' otherlv_13= '{' ( (otherlv_14= RULE_ID ) )+ otherlv_15= '}' )? (otherlv_16= 'resources' otherlv_17= '{' ( (lv_resources_18_0= ruleAsset ) )+ otherlv_19= '}' )? (otherlv_20= 'services' otherlv_21= '{' ( (lv_services_22_0= ruleService ) )+ otherlv_23= '}' )? otherlv_24= '}' ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:223:1: ( (otherlv_0= 'team' | otherlv_1= 'group' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'sourceUnits' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}' )? (otherlv_8= 'targetUnits' otherlv_9= '{' ( (otherlv_10= RULE_ID ) )+ otherlv_11= '}' )? (otherlv_12= 'contains' otherlv_13= '{' ( (otherlv_14= RULE_ID ) )+ otherlv_15= '}' )? (otherlv_16= 'resources' otherlv_17= '{' ( (lv_resources_18_0= ruleAsset ) )+ otherlv_19= '}' )? (otherlv_20= 'services' otherlv_21= '{' ( (lv_services_22_0= ruleService ) )+ otherlv_23= '}' )? otherlv_24= '}' )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:223:1: ( (otherlv_0= 'team' | otherlv_1= 'group' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'sourceUnits' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}' )? (otherlv_8= 'targetUnits' otherlv_9= '{' ( (otherlv_10= RULE_ID ) )+ otherlv_11= '}' )? (otherlv_12= 'contains' otherlv_13= '{' ( (otherlv_14= RULE_ID ) )+ otherlv_15= '}' )? (otherlv_16= 'resources' otherlv_17= '{' ( (lv_resources_18_0= ruleAsset ) )+ otherlv_19= '}' )? (otherlv_20= 'services' otherlv_21= '{' ( (lv_services_22_0= ruleService ) )+ otherlv_23= '}' )? otherlv_24= '}' )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:223:2: (otherlv_0= 'team' | otherlv_1= 'group' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'sourceUnits' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}' )? (otherlv_8= 'targetUnits' otherlv_9= '{' ( (otherlv_10= RULE_ID ) )+ otherlv_11= '}' )? (otherlv_12= 'contains' otherlv_13= '{' ( (otherlv_14= RULE_ID ) )+ otherlv_15= '}' )? (otherlv_16= 'resources' otherlv_17= '{' ( (lv_resources_18_0= ruleAsset ) )+ otherlv_19= '}' )? (otherlv_20= 'services' otherlv_21= '{' ( (lv_services_22_0= ruleService ) )+ otherlv_23= '}' )? otherlv_24= '}'
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:223:2: (otherlv_0= 'team' | otherlv_1= 'group' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            else if ( (LA3_0==20) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:223:4: otherlv_0= 'team'
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleTeam398); 

                        	newLeafNode(otherlv_0, grammarAccess.getTeamAccess().getTeamKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:228:7: otherlv_1= 'group'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleTeam416); 

                        	newLeafNode(otherlv_1, grammarAccess.getTeamAccess().getGroupKeyword_0_1());
                        

                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:232:2: ( (lv_name_2_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:233:1: (lv_name_2_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:233:1: (lv_name_2_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:234:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTeam434); 

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

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleTeam451); 

                	newLeafNode(otherlv_3, grammarAccess.getTeamAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:254:1: (otherlv_4= 'sourceUnits' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:254:3: otherlv_4= 'sourceUnits' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}'
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleTeam464); 

                        	newLeafNode(otherlv_4, grammarAccess.getTeamAccess().getSourceUnitsKeyword_3_0());
                        
                    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleTeam476); 

                        	newLeafNode(otherlv_5, grammarAccess.getTeamAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:262:1: ( (otherlv_6= RULE_ID ) )+
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
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:263:1: (otherlv_6= RULE_ID )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:263:1: (otherlv_6= RULE_ID )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:264:3: otherlv_6= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTeamRule());
                    	    	        }
                    	            
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTeam496); 

                    	    		newLeafNode(otherlv_6, grammarAccess.getTeamAccess().getDemandUnitsTeamCrossReference_3_2_0()); 
                    	    	

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

                    otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleTeam509); 

                        	newLeafNode(otherlv_7, grammarAccess.getTeamAccess().getRightCurlyBracketKeyword_3_3());
                        

                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:279:3: (otherlv_8= 'targetUnits' otherlv_9= '{' ( (otherlv_10= RULE_ID ) )+ otherlv_11= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:279:5: otherlv_8= 'targetUnits' otherlv_9= '{' ( (otherlv_10= RULE_ID ) )+ otherlv_11= '}'
                    {
                    otherlv_8=(Token)match(input,24,FOLLOW_24_in_ruleTeam524); 

                        	newLeafNode(otherlv_8, grammarAccess.getTeamAccess().getTargetUnitsKeyword_4_0());
                        
                    otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleTeam536); 

                        	newLeafNode(otherlv_9, grammarAccess.getTeamAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:287:1: ( (otherlv_10= RULE_ID ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:288:1: (otherlv_10= RULE_ID )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:288:1: (otherlv_10= RULE_ID )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:289:3: otherlv_10= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTeamRule());
                    	    	        }
                    	            
                    	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTeam556); 

                    	    		newLeafNode(otherlv_10, grammarAccess.getTeamAccess().getSourcedUnitsTeamCrossReference_4_2_0()); 
                    	    	

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

                    otherlv_11=(Token)match(input,23,FOLLOW_23_in_ruleTeam569); 

                        	newLeafNode(otherlv_11, grammarAccess.getTeamAccess().getRightCurlyBracketKeyword_4_3());
                        

                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:304:3: (otherlv_12= 'contains' otherlv_13= '{' ( (otherlv_14= RULE_ID ) )+ otherlv_15= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:304:5: otherlv_12= 'contains' otherlv_13= '{' ( (otherlv_14= RULE_ID ) )+ otherlv_15= '}'
                    {
                    otherlv_12=(Token)match(input,25,FOLLOW_25_in_ruleTeam584); 

                        	newLeafNode(otherlv_12, grammarAccess.getTeamAccess().getContainsKeyword_5_0());
                        
                    otherlv_13=(Token)match(input,21,FOLLOW_21_in_ruleTeam596); 

                        	newLeafNode(otherlv_13, grammarAccess.getTeamAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:312:1: ( (otherlv_14= RULE_ID ) )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_ID) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:313:1: (otherlv_14= RULE_ID )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:313:1: (otherlv_14= RULE_ID )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:314:3: otherlv_14= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTeamRule());
                    	    	        }
                    	            
                    	    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTeam616); 

                    	    		newLeafNode(otherlv_14, grammarAccess.getTeamAccess().getGroupmembersTeamCrossReference_5_2_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);

                    otherlv_15=(Token)match(input,23,FOLLOW_23_in_ruleTeam629); 

                        	newLeafNode(otherlv_15, grammarAccess.getTeamAccess().getRightCurlyBracketKeyword_5_3());
                        

                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:329:3: (otherlv_16= 'resources' otherlv_17= '{' ( (lv_resources_18_0= ruleAsset ) )+ otherlv_19= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:329:5: otherlv_16= 'resources' otherlv_17= '{' ( (lv_resources_18_0= ruleAsset ) )+ otherlv_19= '}'
                    {
                    otherlv_16=(Token)match(input,26,FOLLOW_26_in_ruleTeam644); 

                        	newLeafNode(otherlv_16, grammarAccess.getTeamAccess().getResourcesKeyword_6_0());
                        
                    otherlv_17=(Token)match(input,21,FOLLOW_21_in_ruleTeam656); 

                        	newLeafNode(otherlv_17, grammarAccess.getTeamAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:337:1: ( (lv_resources_18_0= ruleAsset ) )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==29) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:338:1: (lv_resources_18_0= ruleAsset )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:338:1: (lv_resources_18_0= ruleAsset )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:339:3: lv_resources_18_0= ruleAsset
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTeamAccess().getResourcesAssetParserRuleCall_6_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAsset_in_ruleTeam677);
                    	    lv_resources_18_0=ruleAsset();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTeamRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"resources",
                    	            		lv_resources_18_0, 
                    	            		"Asset");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);

                    otherlv_19=(Token)match(input,23,FOLLOW_23_in_ruleTeam690); 

                        	newLeafNode(otherlv_19, grammarAccess.getTeamAccess().getRightCurlyBracketKeyword_6_3());
                        

                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:359:3: (otherlv_20= 'services' otherlv_21= '{' ( (lv_services_22_0= ruleService ) )+ otherlv_23= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:359:5: otherlv_20= 'services' otherlv_21= '{' ( (lv_services_22_0= ruleService ) )+ otherlv_23= '}'
                    {
                    otherlv_20=(Token)match(input,27,FOLLOW_27_in_ruleTeam705); 

                        	newLeafNode(otherlv_20, grammarAccess.getTeamAccess().getServicesKeyword_7_0());
                        
                    otherlv_21=(Token)match(input,21,FOLLOW_21_in_ruleTeam717); 

                        	newLeafNode(otherlv_21, grammarAccess.getTeamAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:367:1: ( (lv_services_22_0= ruleService ) )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==28) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:368:1: (lv_services_22_0= ruleService )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:368:1: (lv_services_22_0= ruleService )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:369:3: lv_services_22_0= ruleService
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTeamAccess().getServicesServiceParserRuleCall_7_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleService_in_ruleTeam738);
                    	    lv_services_22_0=ruleService();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTeamRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"services",
                    	            		lv_services_22_0, 
                    	            		"Service");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);

                    otherlv_23=(Token)match(input,23,FOLLOW_23_in_ruleTeam751); 

                        	newLeafNode(otherlv_23, grammarAccess.getTeamAccess().getRightCurlyBracketKeyword_7_3());
                        

                    }
                    break;

            }

            otherlv_24=(Token)match(input,23,FOLLOW_23_in_ruleTeam765); 

                	newLeafNode(otherlv_24, grammarAccess.getTeamAccess().getRightCurlyBracketKeyword_8());
                

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:401:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:402:2: (iv_ruleService= ruleService EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:403:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService801);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService811); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:410:1: ruleService returns [EObject current=null] : (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:413:28: ( (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:414:1: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:414:1: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:414:3: otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleService848); 

                	newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:418:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:419:1: (lv_name_1_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:419:1: (lv_name_1_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:420:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService865); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:444:1: entryRuleAsset returns [EObject current=null] : iv_ruleAsset= ruleAsset EOF ;
    public final EObject entryRuleAsset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsset = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:445:2: (iv_ruleAsset= ruleAsset EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:446:2: iv_ruleAsset= ruleAsset EOF
            {
             newCompositeNode(grammarAccess.getAssetRule()); 
            pushFollow(FOLLOW_ruleAsset_in_entryRuleAsset906);
            iv_ruleAsset=ruleAsset();

            state._fsp--;

             current =iv_ruleAsset; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAsset916); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:453:1: ruleAsset returns [EObject current=null] : (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' otherlv_3= 'skills' otherlv_4= '{' ( (lv_hasSkills_5_0= ruleSkill ) )+ otherlv_6= '}' otherlv_7= '}' )? ) ;
    public final EObject ruleAsset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_hasSkills_5_0 = null;


         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:456:28: ( (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' otherlv_3= 'skills' otherlv_4= '{' ( (lv_hasSkills_5_0= ruleSkill ) )+ otherlv_6= '}' otherlv_7= '}' )? ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:457:1: (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' otherlv_3= 'skills' otherlv_4= '{' ( (lv_hasSkills_5_0= ruleSkill ) )+ otherlv_6= '}' otherlv_7= '}' )? )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:457:1: (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' otherlv_3= 'skills' otherlv_4= '{' ( (lv_hasSkills_5_0= ruleSkill ) )+ otherlv_6= '}' otherlv_7= '}' )? )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:457:3: otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' otherlv_3= 'skills' otherlv_4= '{' ( (lv_hasSkills_5_0= ruleSkill ) )+ otherlv_6= '}' otherlv_7= '}' )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleAsset953); 

                	newLeafNode(otherlv_0, grammarAccess.getAssetAccess().getResourceKeyword_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:461:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:462:1: (lv_name_1_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:462:1: (lv_name_1_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:463:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAsset970); 

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

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:479:2: (otherlv_2= '{' otherlv_3= 'skills' otherlv_4= '{' ( (lv_hasSkills_5_0= ruleSkill ) )+ otherlv_6= '}' otherlv_7= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:479:4: otherlv_2= '{' otherlv_3= 'skills' otherlv_4= '{' ( (lv_hasSkills_5_0= ruleSkill ) )+ otherlv_6= '}' otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleAsset988); 

                        	newLeafNode(otherlv_2, grammarAccess.getAssetAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleAsset1000); 

                        	newLeafNode(otherlv_3, grammarAccess.getAssetAccess().getSkillsKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleAsset1012); 

                        	newLeafNode(otherlv_4, grammarAccess.getAssetAccess().getLeftCurlyBracketKeyword_2_2());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:491:1: ( (lv_hasSkills_5_0= ruleSkill ) )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_ID) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:492:1: (lv_hasSkills_5_0= ruleSkill )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:492:1: (lv_hasSkills_5_0= ruleSkill )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:493:3: lv_hasSkills_5_0= ruleSkill
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssetAccess().getHasSkillsSkillParserRuleCall_2_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSkill_in_ruleAsset1033);
                    	    lv_hasSkills_5_0=ruleSkill();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAssetRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"hasSkills",
                    	            		lv_hasSkills_5_0, 
                    	            		"Skill");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);

                    otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleAsset1046); 

                        	newLeafNode(otherlv_6, grammarAccess.getAssetAccess().getRightCurlyBracketKeyword_2_4());
                        
                    otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleAsset1058); 

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


    // $ANTLR start "entryRuleSkill"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:525:1: entryRuleSkill returns [EObject current=null] : iv_ruleSkill= ruleSkill EOF ;
    public final EObject entryRuleSkill() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkill = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:526:2: (iv_ruleSkill= ruleSkill EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:527:2: iv_ruleSkill= ruleSkill EOF
            {
             newCompositeNode(grammarAccess.getSkillRule()); 
            pushFollow(FOLLOW_ruleSkill_in_entryRuleSkill1096);
            iv_ruleSkill=ruleSkill();

            state._fsp--;

             current =iv_ruleSkill; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSkill1106); 

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
    // $ANTLR end "entryRuleSkill"


    // $ANTLR start "ruleSkill"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:534:1: ruleSkill returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleSkill() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:537:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:538:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:538:1: ( (lv_name_0_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:539:1: (lv_name_0_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:539:1: (lv_name_0_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:540:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSkill1147); 

            			newLeafNode(lv_name_0_0, grammarAccess.getSkillAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSkillRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleSkill"


    // $ANTLR start "entryRuleDependency"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:564:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:565:2: (iv_ruleDependency= ruleDependency EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:566:2: iv_ruleDependency= ruleDependency EOF
            {
             newCompositeNode(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_ruleDependency_in_entryRuleDependency1187);
            iv_ruleDependency=ruleDependency();

            state._fsp--;

             current =iv_ruleDependency; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependency1197); 

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
    // $ANTLR end "entryRuleDependency"


    // $ANTLR start "ruleDependency"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:573:1: ruleDependency returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=>' | otherlv_2= '->' ) ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:576:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=>' | otherlv_2= '->' ) ( (otherlv_3= RULE_ID ) ) ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:577:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=>' | otherlv_2= '->' ) ( (otherlv_3= RULE_ID ) ) )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:577:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=>' | otherlv_2= '->' ) ( (otherlv_3= RULE_ID ) ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:577:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=>' | otherlv_2= '->' ) ( (otherlv_3= RULE_ID ) )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:577:2: ( (otherlv_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:578:1: (otherlv_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:578:1: (otherlv_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:579:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDependencyRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDependency1242); 

            		newLeafNode(otherlv_0, grammarAccess.getDependencyAccess().getSourceTaskTaskCrossReference_0_0()); 
            	

            }


            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:590:2: (otherlv_1= '=>' | otherlv_2= '->' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            else if ( (LA16_0==32) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:590:4: otherlv_1= '=>'
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleDependency1255); 

                        	newLeafNode(otherlv_1, grammarAccess.getDependencyAccess().getEqualsSignGreaterThanSignKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:595:7: otherlv_2= '->'
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleDependency1273); 

                        	newLeafNode(otherlv_2, grammarAccess.getDependencyAccess().getHyphenMinusGreaterThanSignKeyword_1_1());
                        

                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:599:2: ( (otherlv_3= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:600:1: (otherlv_3= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:600:1: (otherlv_3= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:601:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDependencyRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDependency1294); 

            		newLeafNode(otherlv_3, grammarAccess.getDependencyAccess().getTargetTaskTaskCrossReference_2_0()); 
            	

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
    // $ANTLR end "ruleDependency"


    // $ANTLR start "entryRuleRequirement"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:620:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:621:2: (iv_ruleRequirement= ruleRequirement EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:622:2: iv_ruleRequirement= ruleRequirement EOF
            {
             newCompositeNode(grammarAccess.getRequirementRule()); 
            pushFollow(FOLLOW_ruleRequirement_in_entryRuleRequirement1330);
            iv_ruleRequirement=ruleRequirement();

            state._fsp--;

             current =iv_ruleRequirement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequirement1340); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:629:1: ruleRequirement returns [EObject current=null] : (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'workItems' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' ) (otherlv_7= 'workItemNetwork' ( (lv_dependencies_8_0= ruleDependency ) )* )? otherlv_9= '}' ) ;
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
        EObject lv_dependencies_8_0 = null;


         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:632:28: ( (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'workItems' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' ) (otherlv_7= 'workItemNetwork' ( (lv_dependencies_8_0= ruleDependency ) )* )? otherlv_9= '}' ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:633:1: (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'workItems' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' ) (otherlv_7= 'workItemNetwork' ( (lv_dependencies_8_0= ruleDependency ) )* )? otherlv_9= '}' )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:633:1: (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'workItems' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' ) (otherlv_7= 'workItemNetwork' ( (lv_dependencies_8_0= ruleDependency ) )* )? otherlv_9= '}' )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:633:3: otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'workItems' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' ) (otherlv_7= 'workItemNetwork' ( (lv_dependencies_8_0= ruleDependency ) )* )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleRequirement1377); 

                	newLeafNode(otherlv_0, grammarAccess.getRequirementAccess().getRequirementKeyword_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:637:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:638:1: (lv_name_1_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:638:1: (lv_name_1_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:639:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirement1394); 

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

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleRequirement1411); 

                	newLeafNode(otherlv_2, grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:659:1: (otherlv_3= 'workItems' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:659:3: otherlv_3= 'workItems' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}'
            {
            otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleRequirement1424); 

                	newLeafNode(otherlv_3, grammarAccess.getRequirementAccess().getWorkItemsKeyword_3_0());
                
            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleRequirement1436); 

                	newLeafNode(otherlv_4, grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_3_1());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:667:1: ( (otherlv_5= RULE_ID ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:668:1: (otherlv_5= RULE_ID )
            	    {
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:668:1: (otherlv_5= RULE_ID )
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:669:3: otherlv_5= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	        }
            	            
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirement1456); 

            	    		newLeafNode(otherlv_5, grammarAccess.getRequirementAccess().getRTasksTaskCrossReference_3_2_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleRequirement1469); 

                	newLeafNode(otherlv_6, grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_3_3());
                

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:684:2: (otherlv_7= 'workItemNetwork' ( (lv_dependencies_8_0= ruleDependency ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:684:4: otherlv_7= 'workItemNetwork' ( (lv_dependencies_8_0= ruleDependency ) )*
                    {
                    otherlv_7=(Token)match(input,35,FOLLOW_35_in_ruleRequirement1483); 

                        	newLeafNode(otherlv_7, grammarAccess.getRequirementAccess().getWorkItemNetworkKeyword_4_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:688:1: ( (lv_dependencies_8_0= ruleDependency ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_ID) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:689:1: (lv_dependencies_8_0= ruleDependency )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:689:1: (lv_dependencies_8_0= ruleDependency )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:690:3: lv_dependencies_8_0= ruleDependency
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRequirementAccess().getDependenciesDependencyParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDependency_in_ruleRequirement1504);
                    	    lv_dependencies_8_0=ruleDependency();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRequirementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"dependencies",
                    	            		lv_dependencies_8_0, 
                    	            		"Dependency");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,23,FOLLOW_23_in_ruleRequirement1519); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:718:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:719:2: (iv_ruleTask= ruleTask EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:720:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_ruleTask_in_entryRuleTask1555);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTask1565); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:727:1: ruleTask returns [EObject current=null] : (otherlv_0= 'workItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'subtasks' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' )? (otherlv_7= 'taskDependencies' ( (lv_taskDependencies_8_0= ruleDependency ) )* )? (otherlv_9= 'servicesRequired' ( (otherlv_10= RULE_ID ) )+ )? (otherlv_11= 'base value' ( (lv_bvalue_12_0= RULE_INT ) ) )? (otherlv_13= 'classOfService' ( (lv_COS_14_0= RULE_ID ) ) )? otherlv_15= '}' ) ;
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
        EObject lv_taskDependencies_8_0 = null;


         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:730:28: ( (otherlv_0= 'workItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'subtasks' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' )? (otherlv_7= 'taskDependencies' ( (lv_taskDependencies_8_0= ruleDependency ) )* )? (otherlv_9= 'servicesRequired' ( (otherlv_10= RULE_ID ) )+ )? (otherlv_11= 'base value' ( (lv_bvalue_12_0= RULE_INT ) ) )? (otherlv_13= 'classOfService' ( (lv_COS_14_0= RULE_ID ) ) )? otherlv_15= '}' ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:731:1: (otherlv_0= 'workItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'subtasks' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' )? (otherlv_7= 'taskDependencies' ( (lv_taskDependencies_8_0= ruleDependency ) )* )? (otherlv_9= 'servicesRequired' ( (otherlv_10= RULE_ID ) )+ )? (otherlv_11= 'base value' ( (lv_bvalue_12_0= RULE_INT ) ) )? (otherlv_13= 'classOfService' ( (lv_COS_14_0= RULE_ID ) ) )? otherlv_15= '}' )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:731:1: (otherlv_0= 'workItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'subtasks' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' )? (otherlv_7= 'taskDependencies' ( (lv_taskDependencies_8_0= ruleDependency ) )* )? (otherlv_9= 'servicesRequired' ( (otherlv_10= RULE_ID ) )+ )? (otherlv_11= 'base value' ( (lv_bvalue_12_0= RULE_INT ) ) )? (otherlv_13= 'classOfService' ( (lv_COS_14_0= RULE_ID ) ) )? otherlv_15= '}' )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:731:3: otherlv_0= 'workItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'subtasks' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' )? (otherlv_7= 'taskDependencies' ( (lv_taskDependencies_8_0= ruleDependency ) )* )? (otherlv_9= 'servicesRequired' ( (otherlv_10= RULE_ID ) )+ )? (otherlv_11= 'base value' ( (lv_bvalue_12_0= RULE_INT ) ) )? (otherlv_13= 'classOfService' ( (lv_COS_14_0= RULE_ID ) ) )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleTask1602); 

                	newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getWorkItemKeyword_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:735:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:736:1: (lv_name_1_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:736:1: (lv_name_1_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:737:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTask1619); 

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

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleTask1636); 

                	newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:757:1: (otherlv_3= 'subtasks' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==37) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:757:3: otherlv_3= 'subtasks' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleTask1649); 

                        	newLeafNode(otherlv_3, grammarAccess.getTaskAccess().getSubtasksKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleTask1661); 

                        	newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:765:1: ( (otherlv_5= RULE_ID ) )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==RULE_ID) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:766:1: (otherlv_5= RULE_ID )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:766:1: (otherlv_5= RULE_ID )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:767:3: otherlv_5= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTaskRule());
                    	    	        }
                    	            
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTask1681); 

                    	    		newLeafNode(otherlv_5, grammarAccess.getTaskAccess().getSTasksTaskCrossReference_3_2_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt20 >= 1 ) break loop20;
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
                    } while (true);

                    otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleTask1694); 

                        	newLeafNode(otherlv_6, grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_3_3());
                        

                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:782:3: (otherlv_7= 'taskDependencies' ( (lv_taskDependencies_8_0= ruleDependency ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==38) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:782:5: otherlv_7= 'taskDependencies' ( (lv_taskDependencies_8_0= ruleDependency ) )*
                    {
                    otherlv_7=(Token)match(input,38,FOLLOW_38_in_ruleTask1709); 

                        	newLeafNode(otherlv_7, grammarAccess.getTaskAccess().getTaskDependenciesKeyword_4_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:786:1: ( (lv_taskDependencies_8_0= ruleDependency ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==RULE_ID) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:787:1: (lv_taskDependencies_8_0= ruleDependency )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:787:1: (lv_taskDependencies_8_0= ruleDependency )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:788:3: lv_taskDependencies_8_0= ruleDependency
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTaskAccess().getTaskDependenciesDependencyParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDependency_in_ruleTask1730);
                    	    lv_taskDependencies_8_0=ruleDependency();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTaskRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"taskDependencies",
                    	            		lv_taskDependencies_8_0, 
                    	            		"Dependency");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:804:5: (otherlv_9= 'servicesRequired' ( (otherlv_10= RULE_ID ) )+ )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==39) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:804:7: otherlv_9= 'servicesRequired' ( (otherlv_10= RULE_ID ) )+
                    {
                    otherlv_9=(Token)match(input,39,FOLLOW_39_in_ruleTask1746); 

                        	newLeafNode(otherlv_9, grammarAccess.getTaskAccess().getServicesRequiredKeyword_5_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:808:1: ( (otherlv_10= RULE_ID ) )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==RULE_ID) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:809:1: (otherlv_10= RULE_ID )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:809:1: (otherlv_10= RULE_ID )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:810:3: otherlv_10= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTaskRule());
                    	    	        }
                    	            
                    	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTask1766); 

                    	    		newLeafNode(otherlv_10, grammarAccess.getTaskAccess().getReqSpecialtiesServiceCrossReference_5_1_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt24 >= 1 ) break loop24;
                                EarlyExitException eee =
                                    new EarlyExitException(24, input);
                                throw eee;
                        }
                        cnt24++;
                    } while (true);


                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:821:5: (otherlv_11= 'base value' ( (lv_bvalue_12_0= RULE_INT ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==40) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:821:7: otherlv_11= 'base value' ( (lv_bvalue_12_0= RULE_INT ) )
                    {
                    otherlv_11=(Token)match(input,40,FOLLOW_40_in_ruleTask1782); 

                        	newLeafNode(otherlv_11, grammarAccess.getTaskAccess().getBaseValueKeyword_6_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:825:1: ( (lv_bvalue_12_0= RULE_INT ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:826:1: (lv_bvalue_12_0= RULE_INT )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:826:1: (lv_bvalue_12_0= RULE_INT )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:827:3: lv_bvalue_12_0= RULE_INT
                    {
                    lv_bvalue_12_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTask1799); 

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

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:843:4: (otherlv_13= 'classOfService' ( (lv_COS_14_0= RULE_ID ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==41) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:843:6: otherlv_13= 'classOfService' ( (lv_COS_14_0= RULE_ID ) )
                    {
                    otherlv_13=(Token)match(input,41,FOLLOW_41_in_ruleTask1819); 

                        	newLeafNode(otherlv_13, grammarAccess.getTaskAccess().getClassOfServiceKeyword_7_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:847:1: ( (lv_COS_14_0= RULE_ID ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:848:1: (lv_COS_14_0= RULE_ID )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:848:1: (lv_COS_14_0= RULE_ID )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:849:3: lv_COS_14_0= RULE_ID
                    {
                    lv_COS_14_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTask1836); 

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

            otherlv_15=(Token)match(input,23,FOLLOW_23_in_ruleTask1855); 

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


    // $ANTLR start "entryRuleKanbanTaskModel"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:877:1: entryRuleKanbanTaskModel returns [EObject current=null] : iv_ruleKanbanTaskModel= ruleKanbanTaskModel EOF ;
    public final EObject entryRuleKanbanTaskModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKanbanTaskModel = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:878:2: (iv_ruleKanbanTaskModel= ruleKanbanTaskModel EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:879:2: iv_ruleKanbanTaskModel= ruleKanbanTaskModel EOF
            {
             newCompositeNode(grammarAccess.getKanbanTaskModelRule()); 
            pushFollow(FOLLOW_ruleKanbanTaskModel_in_entryRuleKanbanTaskModel1891);
            iv_ruleKanbanTaskModel=ruleKanbanTaskModel();

            state._fsp--;

             current =iv_ruleKanbanTaskModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKanbanTaskModel1901); 

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
    // $ANTLR end "entryRuleKanbanTaskModel"


    // $ANTLR start "ruleKanbanTaskModel"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:886:1: ruleKanbanTaskModel returns [EObject current=null] : (otherlv_0= 'WorkFlow' ( (lv_name_1_0= RULE_ID ) ) ( (lv_caps_2_0= ruleCapability ) )+ otherlv_3= 'end WorkFlow' ) ;
    public final EObject ruleKanbanTaskModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_caps_2_0 = null;


         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:889:28: ( (otherlv_0= 'WorkFlow' ( (lv_name_1_0= RULE_ID ) ) ( (lv_caps_2_0= ruleCapability ) )+ otherlv_3= 'end WorkFlow' ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:890:1: (otherlv_0= 'WorkFlow' ( (lv_name_1_0= RULE_ID ) ) ( (lv_caps_2_0= ruleCapability ) )+ otherlv_3= 'end WorkFlow' )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:890:1: (otherlv_0= 'WorkFlow' ( (lv_name_1_0= RULE_ID ) ) ( (lv_caps_2_0= ruleCapability ) )+ otherlv_3= 'end WorkFlow' )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:890:3: otherlv_0= 'WorkFlow' ( (lv_name_1_0= RULE_ID ) ) ( (lv_caps_2_0= ruleCapability ) )+ otherlv_3= 'end WorkFlow'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleKanbanTaskModel1938); 

                	newLeafNode(otherlv_0, grammarAccess.getKanbanTaskModelAccess().getWorkFlowKeyword_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:894:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:895:1: (lv_name_1_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:895:1: (lv_name_1_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:896:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleKanbanTaskModel1955); 

            			newLeafNode(lv_name_1_0, grammarAccess.getKanbanTaskModelAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKanbanTaskModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:912:2: ( (lv_caps_2_0= ruleCapability ) )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==44) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:913:1: (lv_caps_2_0= ruleCapability )
            	    {
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:913:1: (lv_caps_2_0= ruleCapability )
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:914:3: lv_caps_2_0= ruleCapability
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKanbanTaskModelAccess().getCapsCapabilityParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCapability_in_ruleKanbanTaskModel1981);
            	    lv_caps_2_0=ruleCapability();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKanbanTaskModelRule());
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
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
            } while (true);

            otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleKanbanTaskModel1994); 

                	newLeafNode(otherlv_3, grammarAccess.getKanbanTaskModelAccess().getEndWorkFlowKeyword_3());
                

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
    // $ANTLR end "ruleKanbanTaskModel"


    // $ANTLR start "entryRuleCapability"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:942:1: entryRuleCapability returns [EObject current=null] : iv_ruleCapability= ruleCapability EOF ;
    public final EObject entryRuleCapability() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCapability = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:943:2: (iv_ruleCapability= ruleCapability EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:944:2: iv_ruleCapability= ruleCapability EOF
            {
             newCompositeNode(grammarAccess.getCapabilityRule()); 
            pushFollow(FOLLOW_ruleCapability_in_entryRuleCapability2030);
            iv_ruleCapability=ruleCapability();

            state._fsp--;

             current =iv_ruleCapability; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCapability2040); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:951:1: ruleCapability returns [EObject current=null] : (otherlv_0= 'capability' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_reqs_3_0= ruleRequirement ) )+ otherlv_4= '}' ) ;
    public final EObject ruleCapability() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_reqs_3_0 = null;


         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:954:28: ( (otherlv_0= 'capability' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_reqs_3_0= ruleRequirement ) )+ otherlv_4= '}' ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:955:1: (otherlv_0= 'capability' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_reqs_3_0= ruleRequirement ) )+ otherlv_4= '}' )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:955:1: (otherlv_0= 'capability' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_reqs_3_0= ruleRequirement ) )+ otherlv_4= '}' )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:955:3: otherlv_0= 'capability' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_reqs_3_0= ruleRequirement ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleCapability2077); 

                	newLeafNode(otherlv_0, grammarAccess.getCapabilityAccess().getCapabilityKeyword_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:959:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:960:1: (lv_name_1_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:960:1: (lv_name_1_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:961:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCapability2094); 

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

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleCapability2111); 

                	newLeafNode(otherlv_2, grammarAccess.getCapabilityAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:981:1: ( (lv_reqs_3_0= ruleRequirement ) )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==33) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:982:1: (lv_reqs_3_0= ruleRequirement )
            	    {
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:982:1: (lv_reqs_3_0= ruleRequirement )
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:983:3: lv_reqs_3_0= ruleRequirement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCapabilityAccess().getReqsRequirementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRequirement_in_ruleCapability2132);
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
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleCapability2145); 

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


    // $ANTLR start "entryRuleKanbanGovModel"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1011:1: entryRuleKanbanGovModel returns [EObject current=null] : iv_ruleKanbanGovModel= ruleKanbanGovModel EOF ;
    public final EObject entryRuleKanbanGovModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKanbanGovModel = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1012:2: (iv_ruleKanbanGovModel= ruleKanbanGovModel EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1013:2: iv_ruleKanbanGovModel= ruleKanbanGovModel EOF
            {
             newCompositeNode(grammarAccess.getKanbanGovModelRule()); 
            pushFollow(FOLLOW_ruleKanbanGovModel_in_entryRuleKanbanGovModel2181);
            iv_ruleKanbanGovModel=ruleKanbanGovModel();

            state._fsp--;

             current =iv_ruleKanbanGovModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKanbanGovModel2191); 

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
    // $ANTLR end "entryRuleKanbanGovModel"


    // $ANTLR start "ruleKanbanGovModel"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1020:1: ruleKanbanGovModel returns [EObject current=null] : ( (lv_strategy_0_0= ruleStrategy ) ) ;
    public final EObject ruleKanbanGovModel() throws RecognitionException {
        EObject current = null;

        EObject lv_strategy_0_0 = null;


         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1023:28: ( ( (lv_strategy_0_0= ruleStrategy ) ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1024:1: ( (lv_strategy_0_0= ruleStrategy ) )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1024:1: ( (lv_strategy_0_0= ruleStrategy ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1025:1: (lv_strategy_0_0= ruleStrategy )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1025:1: (lv_strategy_0_0= ruleStrategy )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1026:3: lv_strategy_0_0= ruleStrategy
            {
             
            	        newCompositeNode(grammarAccess.getKanbanGovModelAccess().getStrategyStrategyParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleStrategy_in_ruleKanbanGovModel2236);
            lv_strategy_0_0=ruleStrategy();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getKanbanGovModelRule());
            	        }
                   		add(
                   			current, 
                   			"strategy",
                    		lv_strategy_0_0, 
                    		"Strategy");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleKanbanGovModel"


    // $ANTLR start "entryRuleStrategy"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1050:1: entryRuleStrategy returns [EObject current=null] : iv_ruleStrategy= ruleStrategy EOF ;
    public final EObject entryRuleStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrategy = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1051:2: (iv_ruleStrategy= ruleStrategy EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1052:2: iv_ruleStrategy= ruleStrategy EOF
            {
             newCompositeNode(grammarAccess.getStrategyRule()); 
            pushFollow(FOLLOW_ruleStrategy_in_entryRuleStrategy2271);
            iv_ruleStrategy=ruleStrategy();

            state._fsp--;

             current =iv_ruleStrategy; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStrategy2281); 

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
    // $ANTLR end "entryRuleStrategy"


    // $ANTLR start "ruleStrategy"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1059:1: ruleStrategy returns [EObject current=null] : (otherlv_0= 'strategy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= '}' ) ;
    public final EObject ruleStrategy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_entities_3_0 = null;


         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1062:28: ( (otherlv_0= 'strategy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= '}' ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1063:1: (otherlv_0= 'strategy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= '}' )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1063:1: (otherlv_0= 'strategy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= '}' )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1063:3: otherlv_0= 'strategy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleStrategy2318); 

                	newLeafNode(otherlv_0, grammarAccess.getStrategyAccess().getStrategyKeyword_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1067:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1068:1: (lv_name_1_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1068:1: (lv_name_1_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1069:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStrategy2335); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStrategyAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStrategyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleStrategy2352); 

                	newLeafNode(otherlv_2, grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1089:1: ( (lv_entities_3_0= ruleEntity ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==46) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1090:1: (lv_entities_3_0= ruleEntity )
            	    {
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1090:1: (lv_entities_3_0= ruleEntity )
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1091:3: lv_entities_3_0= ruleEntity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStrategyAccess().getEntitiesEntityParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntity_in_ruleStrategy2373);
            	    lv_entities_3_0=ruleEntity();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStrategyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"entities",
            	            		lv_entities_3_0, 
            	            		"Entity");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleStrategy2386); 

                	newLeafNode(otherlv_4, grammarAccess.getStrategyAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleStrategy"


    // $ANTLR start "entryRuleEntity"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1119:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1120:2: (iv_ruleEntity= ruleEntity EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1121:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity2422);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity2432); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1128:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'ServiceDirectory' ( (lv_sdname_4_0= RULE_ID ) ) otherlv_5= '=' otherlv_6= '[' ( (lv_serviceProvisions_7_0= ruleProvision ) )* otherlv_8= ']' )? ( (lv_entityBehavior_9_0= ruleStatemachine ) ) otherlv_10= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_sdname_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_serviceProvisions_7_0 = null;

        EObject lv_entityBehavior_9_0 = null;


         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1131:28: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'ServiceDirectory' ( (lv_sdname_4_0= RULE_ID ) ) otherlv_5= '=' otherlv_6= '[' ( (lv_serviceProvisions_7_0= ruleProvision ) )* otherlv_8= ']' )? ( (lv_entityBehavior_9_0= ruleStatemachine ) ) otherlv_10= '}' ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1132:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'ServiceDirectory' ( (lv_sdname_4_0= RULE_ID ) ) otherlv_5= '=' otherlv_6= '[' ( (lv_serviceProvisions_7_0= ruleProvision ) )* otherlv_8= ']' )? ( (lv_entityBehavior_9_0= ruleStatemachine ) ) otherlv_10= '}' )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1132:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'ServiceDirectory' ( (lv_sdname_4_0= RULE_ID ) ) otherlv_5= '=' otherlv_6= '[' ( (lv_serviceProvisions_7_0= ruleProvision ) )* otherlv_8= ']' )? ( (lv_entityBehavior_9_0= ruleStatemachine ) ) otherlv_10= '}' )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1132:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'ServiceDirectory' ( (lv_sdname_4_0= RULE_ID ) ) otherlv_5= '=' otherlv_6= '[' ( (lv_serviceProvisions_7_0= ruleProvision ) )* otherlv_8= ']' )? ( (lv_entityBehavior_9_0= ruleStatemachine ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleEntity2469); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1136:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1137:1: (lv_name_1_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1137:1: (lv_name_1_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1138:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity2486); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleEntity2503); 

                	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1158:1: (otherlv_3= 'ServiceDirectory' ( (lv_sdname_4_0= RULE_ID ) ) otherlv_5= '=' otherlv_6= '[' ( (lv_serviceProvisions_7_0= ruleProvision ) )* otherlv_8= ']' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==47) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1158:3: otherlv_3= 'ServiceDirectory' ( (lv_sdname_4_0= RULE_ID ) ) otherlv_5= '=' otherlv_6= '[' ( (lv_serviceProvisions_7_0= ruleProvision ) )* otherlv_8= ']'
                    {
                    otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleEntity2516); 

                        	newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getServiceDirectoryKeyword_3_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1162:1: ( (lv_sdname_4_0= RULE_ID ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1163:1: (lv_sdname_4_0= RULE_ID )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1163:1: (lv_sdname_4_0= RULE_ID )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1164:3: lv_sdname_4_0= RULE_ID
                    {
                    lv_sdname_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity2533); 

                    			newLeafNode(lv_sdname_4_0, grammarAccess.getEntityAccess().getSdnameIDTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"sdname",
                            		lv_sdname_4_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,48,FOLLOW_48_in_ruleEntity2550); 

                        	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getEqualsSignKeyword_3_2());
                        
                    otherlv_6=(Token)match(input,49,FOLLOW_49_in_ruleEntity2562); 

                        	newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getLeftSquareBracketKeyword_3_3());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1188:1: ( (lv_serviceProvisions_7_0= ruleProvision ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==51) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1189:1: (lv_serviceProvisions_7_0= ruleProvision )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1189:1: (lv_serviceProvisions_7_0= ruleProvision )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1190:3: lv_serviceProvisions_7_0= ruleProvision
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEntityAccess().getServiceProvisionsProvisionParserRuleCall_3_4_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleProvision_in_ruleEntity2583);
                    	    lv_serviceProvisions_7_0=ruleProvision();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"serviceProvisions",
                    	            		lv_serviceProvisions_7_0, 
                    	            		"Provision");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,50,FOLLOW_50_in_ruleEntity2596); 

                        	newLeafNode(otherlv_8, grammarAccess.getEntityAccess().getRightSquareBracketKeyword_3_5());
                        

                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1210:3: ( (lv_entityBehavior_9_0= ruleStatemachine ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1211:1: (lv_entityBehavior_9_0= ruleStatemachine )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1211:1: (lv_entityBehavior_9_0= ruleStatemachine )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1212:3: lv_entityBehavior_9_0= ruleStatemachine
            {
             
            	        newCompositeNode(grammarAccess.getEntityAccess().getEntityBehaviorStatemachineParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleStatemachine_in_ruleEntity2619);
            lv_entityBehavior_9_0=ruleStatemachine();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	        }
                   		set(
                   			current, 
                   			"entityBehavior",
                    		lv_entityBehavior_9_0, 
                    		"Statemachine");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,23,FOLLOW_23_in_ruleEntity2631); 

                	newLeafNode(otherlv_10, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleProvision"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1240:1: entryRuleProvision returns [EObject current=null] : iv_ruleProvision= ruleProvision EOF ;
    public final EObject entryRuleProvision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvision = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1241:2: (iv_ruleProvision= ruleProvision EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1242:2: iv_ruleProvision= ruleProvision EOF
            {
             newCompositeNode(grammarAccess.getProvisionRule()); 
            pushFollow(FOLLOW_ruleProvision_in_entryRuleProvision2667);
            iv_ruleProvision=ruleProvision();

            state._fsp--;

             current =iv_ruleProvision; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProvision2677); 

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
    // $ANTLR end "entryRuleProvision"


    // $ANTLR start "ruleProvision"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1249:1: ruleProvision returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' otherlv_6= ')' ) ;
    public final EObject ruleProvision() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1252:28: ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' otherlv_6= ')' ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1253:1: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' otherlv_6= ')' )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1253:1: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' otherlv_6= ')' )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1253:3: otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )* otherlv_5= '}' otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleProvision2714); 

                	newLeafNode(otherlv_0, grammarAccess.getProvisionAccess().getLeftParenthesisKeyword_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1257:1: ( (otherlv_1= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1258:1: (otherlv_1= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1258:1: (otherlv_1= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1259:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getProvisionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProvision2734); 

            		newLeafNode(otherlv_1, grammarAccess.getProvisionAccess().getServiceNameServiceCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleProvision2746); 

                	newLeafNode(otherlv_2, grammarAccess.getProvisionAccess().getCommaKeyword_2());
                
            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleProvision2758); 

                	newLeafNode(otherlv_3, grammarAccess.getProvisionAccess().getLeftCurlyBracketKeyword_3());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1278:1: ( (otherlv_4= RULE_ID ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1279:1: (otherlv_4= RULE_ID )
            	    {
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1279:1: (otherlv_4= RULE_ID )
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1280:3: otherlv_4= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getProvisionRule());
            	    	        }
            	            
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProvision2778); 

            	    		newLeafNode(otherlv_4, grammarAccess.getProvisionAccess().getProvidersTeamCrossReference_4_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleProvision2791); 

                	newLeafNode(otherlv_5, grammarAccess.getProvisionAccess().getRightCurlyBracketKeyword_5());
                
            otherlv_6=(Token)match(input,53,FOLLOW_53_in_ruleProvision2803); 

                	newLeafNode(otherlv_6, grammarAccess.getProvisionAccess().getRightParenthesisKeyword_6());
                

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
    // $ANTLR end "ruleProvision"


    // $ANTLR start "entryRuleStatemachine"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1307:1: entryRuleStatemachine returns [EObject current=null] : iv_ruleStatemachine= ruleStatemachine EOF ;
    public final EObject entryRuleStatemachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatemachine = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1308:2: (iv_ruleStatemachine= ruleStatemachine EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1309:2: iv_ruleStatemachine= ruleStatemachine EOF
            {
             newCompositeNode(grammarAccess.getStatemachineRule()); 
            pushFollow(FOLLOW_ruleStatemachine_in_entryRuleStatemachine2839);
            iv_ruleStatemachine=ruleStatemachine();

            state._fsp--;

             current =iv_ruleStatemachine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatemachine2849); 

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
    // $ANTLR end "entryRuleStatemachine"


    // $ANTLR start "ruleStatemachine"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1316:1: ruleStatemachine returns [EObject current=null] : ( () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4= 'activities' ( (lv_commands_5_0= ruleCommand ) )+ otherlv_6= 'end' )? ( (lv_states_7_0= ruleState ) )* ) ;
    public final EObject ruleStatemachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_events_2_0 = null;

        EObject lv_commands_5_0 = null;

        EObject lv_states_7_0 = null;


         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1319:28: ( ( () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4= 'activities' ( (lv_commands_5_0= ruleCommand ) )+ otherlv_6= 'end' )? ( (lv_states_7_0= ruleState ) )* ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1320:1: ( () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4= 'activities' ( (lv_commands_5_0= ruleCommand ) )+ otherlv_6= 'end' )? ( (lv_states_7_0= ruleState ) )* )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1320:1: ( () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4= 'activities' ( (lv_commands_5_0= ruleCommand ) )+ otherlv_6= 'end' )? ( (lv_states_7_0= ruleState ) )* )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1320:2: () (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )? (otherlv_4= 'activities' ( (lv_commands_5_0= ruleCommand ) )+ otherlv_6= 'end' )? ( (lv_states_7_0= ruleState ) )*
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1320:2: ()
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1321:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStatemachineAccess().getStatemachineAction_0(),
                        current);
                

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1326:2: (otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==54) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1326:4: otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )+ otherlv_3= 'end'
                    {
                    otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleStatemachine2896); 

                        	newLeafNode(otherlv_1, grammarAccess.getStatemachineAccess().getEventsKeyword_1_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1330:1: ( (lv_events_2_0= ruleEvent ) )+
                    int cnt34=0;
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==RULE_ID) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1331:1: (lv_events_2_0= ruleEvent )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1331:1: (lv_events_2_0= ruleEvent )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1332:3: lv_events_2_0= ruleEvent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getEventsEventParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEvent_in_ruleStatemachine2917);
                    	    lv_events_2_0=ruleEvent();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStatemachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"events",
                    	            		lv_events_2_0, 
                    	            		"Event");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt34 >= 1 ) break loop34;
                                EarlyExitException eee =
                                    new EarlyExitException(34, input);
                                throw eee;
                        }
                        cnt34++;
                    } while (true);

                    otherlv_3=(Token)match(input,55,FOLLOW_55_in_ruleStatemachine2930); 

                        	newLeafNode(otherlv_3, grammarAccess.getStatemachineAccess().getEndKeyword_1_2());
                        

                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1352:3: (otherlv_4= 'activities' ( (lv_commands_5_0= ruleCommand ) )+ otherlv_6= 'end' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==56) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1352:5: otherlv_4= 'activities' ( (lv_commands_5_0= ruleCommand ) )+ otherlv_6= 'end'
                    {
                    otherlv_4=(Token)match(input,56,FOLLOW_56_in_ruleStatemachine2945); 

                        	newLeafNode(otherlv_4, grammarAccess.getStatemachineAccess().getActivitiesKeyword_2_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1356:1: ( (lv_commands_5_0= ruleCommand ) )+
                    int cnt36=0;
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==RULE_ID) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1357:1: (lv_commands_5_0= ruleCommand )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1357:1: (lv_commands_5_0= ruleCommand )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1358:3: lv_commands_5_0= ruleCommand
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getCommandsCommandParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleCommand_in_ruleStatemachine2966);
                    	    lv_commands_5_0=ruleCommand();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStatemachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"commands",
                    	            		lv_commands_5_0, 
                    	            		"Command");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt36 >= 1 ) break loop36;
                                EarlyExitException eee =
                                    new EarlyExitException(36, input);
                                throw eee;
                        }
                        cnt36++;
                    } while (true);

                    otherlv_6=(Token)match(input,55,FOLLOW_55_in_ruleStatemachine2979); 

                        	newLeafNode(otherlv_6, grammarAccess.getStatemachineAccess().getEndKeyword_2_2());
                        

                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1378:3: ( (lv_states_7_0= ruleState ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==57) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1379:1: (lv_states_7_0= ruleState )
            	    {
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1379:1: (lv_states_7_0= ruleState )
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1380:3: lv_states_7_0= ruleState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getStatesStateParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleState_in_ruleStatemachine3002);
            	    lv_states_7_0=ruleState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStatemachineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"states",
            	            		lv_states_7_0, 
            	            		"State");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // $ANTLR end "ruleStatemachine"


    // $ANTLR start "entryRuleEvent"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1404:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1405:2: (iv_ruleEvent= ruleEvent EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1406:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent3039);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent3049); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1413:1: ruleEvent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_code_1_0=null;

         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1416:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1417:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1417:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1417:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1417:2: ( (lv_name_0_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1418:1: (lv_name_0_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1418:1: (lv_name_0_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1419:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvent3091); 

            			newLeafNode(lv_name_0_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEventRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1435:2: ( (lv_code_1_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1436:1: (lv_code_1_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1436:1: (lv_code_1_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1437:3: lv_code_1_0= RULE_ID
            {
            lv_code_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvent3113); 

            			newLeafNode(lv_code_1_0, grammarAccess.getEventAccess().getCodeIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEventRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"code",
                    		lv_code_1_0, 
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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleCommand"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1461:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1462:2: (iv_ruleCommand= ruleCommand EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1463:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand3154);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand3164); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1470:1: ruleCommand returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_code_1_0=null;

         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1473:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1474:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1474:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1474:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_code_1_0= RULE_ID ) )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1474:2: ( (lv_name_0_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1475:1: (lv_name_0_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1475:1: (lv_name_0_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1476:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand3206); 

            			newLeafNode(lv_name_0_0, grammarAccess.getCommandAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCommandRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1492:2: ( (lv_code_1_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1493:1: (lv_code_1_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1493:1: (lv_code_1_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1494:3: lv_code_1_0= RULE_ID
            {
            lv_code_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand3228); 

            			newLeafNode(lv_code_1_0, grammarAccess.getCommandAccess().getCodeIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCommandRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"code",
                    		lv_code_1_0, 
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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleState"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1518:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1519:2: (iv_ruleState= ruleState EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1520:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState3269);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState3279); 

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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1527:1: ruleState returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= 'end' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_transitions_6_0 = null;


         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1530:28: ( (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= 'end' ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1531:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= 'end' )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1531:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= 'end' )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1531:3: otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transitions_6_0= ruleTransition ) )* otherlv_7= 'end'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_57_in_ruleState3316); 

                	newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1535:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1536:1: (lv_name_1_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1536:1: (lv_name_1_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1537:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState3333); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1553:2: (otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==58) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1553:4: otherlv_2= 'actions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,58,FOLLOW_58_in_ruleState3351); 

                        	newLeafNode(otherlv_2, grammarAccess.getStateAccess().getActionsKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleState3363); 

                        	newLeafNode(otherlv_3, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2_1());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1561:1: ( (otherlv_4= RULE_ID ) )+
                    int cnt39=0;
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==RULE_ID) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1562:1: (otherlv_4= RULE_ID )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1562:1: (otherlv_4= RULE_ID )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1563:3: otherlv_4= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getStateRule());
                    	    	        }
                    	            
                    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState3383); 

                    	    		newLeafNode(otherlv_4, grammarAccess.getStateAccess().getActionsCommandCrossReference_2_2_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt39 >= 1 ) break loop39;
                                EarlyExitException eee =
                                    new EarlyExitException(39, input);
                                throw eee;
                        }
                        cnt39++;
                    } while (true);

                    otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleState3396); 

                        	newLeafNode(otherlv_5, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_2_3());
                        

                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1578:3: ( (lv_transitions_6_0= ruleTransition ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1579:1: (lv_transitions_6_0= ruleTransition )
            	    {
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1579:1: (lv_transitions_6_0= ruleTransition )
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1580:3: lv_transitions_6_0= ruleTransition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTransition_in_ruleState3419);
            	    lv_transitions_6_0=ruleTransition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"transitions",
            	            		lv_transitions_6_0, 
            	            		"Transition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            otherlv_7=(Token)match(input,55,FOLLOW_55_in_ruleState3432); 

                	newLeafNode(otherlv_7, grammarAccess.getStateAccess().getEndKeyword_4());
                

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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1608:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1609:2: (iv_ruleTransition= ruleTransition EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1610:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition3468);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition3478); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1617:1: ruleTransition returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '/' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ']' otherlv_8= '=>' ( (otherlv_9= RULE_ID ) ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;

         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1620:28: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '/' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ']' otherlv_8= '=>' ( (otherlv_9= RULE_ID ) ) ) ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1621:1: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '/' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ']' otherlv_8= '=>' ( (otherlv_9= RULE_ID ) ) ) )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1621:1: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '/' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ']' otherlv_8= '=>' ( (otherlv_9= RULE_ID ) ) ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==31) ) {
                    alt43=1;
                }
                else if ( (LA43_1==59) ) {
                    alt43=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1621:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1621:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1621:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1621:3: ( (otherlv_0= RULE_ID ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1622:1: (otherlv_0= RULE_ID )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1622:1: (otherlv_0= RULE_ID )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1623:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition3524); 

                    		newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getEventEventCrossReference_0_0_0()); 
                    	

                    }


                    }

                    otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleTransition3536); 

                        	newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_0_1());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1638:1: ( (otherlv_2= RULE_ID ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1639:1: (otherlv_2= RULE_ID )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1639:1: (otherlv_2= RULE_ID )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1640:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition3556); 

                    		newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getStateStateCrossReference_0_2_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1652:6: ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '/' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ']' otherlv_8= '=>' ( (otherlv_9= RULE_ID ) ) )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1652:6: ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '/' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ']' otherlv_8= '=>' ( (otherlv_9= RULE_ID ) ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1652:7: ( (otherlv_3= RULE_ID ) ) otherlv_4= '/' otherlv_5= '[' ( (otherlv_6= RULE_ID ) )+ otherlv_7= ']' otherlv_8= '=>' ( (otherlv_9= RULE_ID ) )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1652:7: ( (otherlv_3= RULE_ID ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1653:1: (otherlv_3= RULE_ID )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1653:1: (otherlv_3= RULE_ID )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1654:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition3584); 

                    		newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getEventEventCrossReference_1_0_0()); 
                    	

                    }


                    }

                    otherlv_4=(Token)match(input,59,FOLLOW_59_in_ruleTransition3596); 

                        	newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getSolidusKeyword_1_1());
                        
                    otherlv_5=(Token)match(input,49,FOLLOW_49_in_ruleTransition3608); 

                        	newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getLeftSquareBracketKeyword_1_2());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1673:1: ( (otherlv_6= RULE_ID ) )+
                    int cnt42=0;
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==RULE_ID) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1674:1: (otherlv_6= RULE_ID )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1674:1: (otherlv_6= RULE_ID )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1675:3: otherlv_6= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	    	        }
                    	            
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition3628); 

                    	    		newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getEventactionsCommandCrossReference_1_3_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt42 >= 1 ) break loop42;
                                EarlyExitException eee =
                                    new EarlyExitException(42, input);
                                throw eee;
                        }
                        cnt42++;
                    } while (true);

                    otherlv_7=(Token)match(input,50,FOLLOW_50_in_ruleTransition3641); 

                        	newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getRightSquareBracketKeyword_1_4());
                        
                    otherlv_8=(Token)match(input,31,FOLLOW_31_in_ruleTransition3653); 

                        	newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_1_5());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1694:1: ( (otherlv_9= RULE_ID ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1695:1: (otherlv_9= RULE_ID )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1695:1: (otherlv_9= RULE_ID )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1696:3: otherlv_9= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition3673); 

                    		newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getStateStateCrossReference_1_6_0()); 
                    	

                    }


                    }


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
    // $ANTLR end "ruleTransition"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleKanbanSchedulingSystem_in_entryRuleKanbanSchedulingSystem75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKanbanSchedulingSystem85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleKanbanSchedulingSystem122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleKanbanSchedulingSystem139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleKanbanSchedulingSystem156 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_ruleTeam_in_ruleKanbanSchedulingSystem177 = new BitSet(new long[]{0x0000000000182000L});
    public static final BitSet FOLLOW_13_in_ruleKanbanSchedulingSystem190 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleKanbanSchedulingSystem202 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_ruleTask_in_ruleKanbanSchedulingSystem223 = new BitSet(new long[]{0x0000041000000000L});
    public static final BitSet FOLLOW_ruleKanbanTaskModel_in_ruleKanbanSchedulingSystem245 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleKanbanSchedulingSystem257 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleKanbanSchedulingSystem269 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ruleKanbanGovModel_in_ruleKanbanSchedulingSystem290 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleKanbanSchedulingSystem302 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleKanbanSchedulingSystem314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTeam_in_entryRuleTeam350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTeam360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleTeam398 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_20_in_ruleTeam416 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTeam434 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTeam451 = new BitSet(new long[]{0x000000000FC00000L});
    public static final BitSet FOLLOW_22_in_ruleTeam464 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTeam476 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTeam496 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_23_in_ruleTeam509 = new BitSet(new long[]{0x000000000F800000L});
    public static final BitSet FOLLOW_24_in_ruleTeam524 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTeam536 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTeam556 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_23_in_ruleTeam569 = new BitSet(new long[]{0x000000000E800000L});
    public static final BitSet FOLLOW_25_in_ruleTeam584 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTeam596 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTeam616 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_23_in_ruleTeam629 = new BitSet(new long[]{0x000000000C800000L});
    public static final BitSet FOLLOW_26_in_ruleTeam644 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTeam656 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleAsset_in_ruleTeam677 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_23_in_ruleTeam690 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_27_in_ruleTeam705 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTeam717 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleService_in_ruleTeam738 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_23_in_ruleTeam751 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTeam765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleService848 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_entryRuleAsset906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAsset916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleAsset953 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAsset970 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleAsset988 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleAsset1000 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleAsset1012 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSkill_in_ruleAsset1033 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_23_in_ruleAsset1046 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleAsset1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkill_in_entryRuleSkill1096 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSkill1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSkill1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency1187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependency1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDependency1242 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_31_in_ruleDependency1255 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_32_in_ruleDependency1273 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDependency1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirement_in_entryRuleRequirement1330 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequirement1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleRequirement1377 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirement1394 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRequirement1411 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleRequirement1424 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRequirement1436 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirement1456 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_23_in_ruleRequirement1469 = new BitSet(new long[]{0x0000000800800000L});
    public static final BitSet FOLLOW_35_in_ruleRequirement1483 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_ruleDependency_in_ruleRequirement1504 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_23_in_ruleRequirement1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_entryRuleTask1555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTask1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleTask1602 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTask1619 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTask1636 = new BitSet(new long[]{0x000003E000800000L});
    public static final BitSet FOLLOW_37_in_ruleTask1649 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTask1661 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTask1681 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_23_in_ruleTask1694 = new BitSet(new long[]{0x000003C000800000L});
    public static final BitSet FOLLOW_38_in_ruleTask1709 = new BitSet(new long[]{0x0000038000800010L});
    public static final BitSet FOLLOW_ruleDependency_in_ruleTask1730 = new BitSet(new long[]{0x0000038000800010L});
    public static final BitSet FOLLOW_39_in_ruleTask1746 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTask1766 = new BitSet(new long[]{0x0000030000800010L});
    public static final BitSet FOLLOW_40_in_ruleTask1782 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTask1799 = new BitSet(new long[]{0x0000020000800000L});
    public static final BitSet FOLLOW_41_in_ruleTask1819 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTask1836 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTask1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKanbanTaskModel_in_entryRuleKanbanTaskModel1891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKanbanTaskModel1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleKanbanTaskModel1938 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleKanbanTaskModel1955 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ruleCapability_in_ruleKanbanTaskModel1981 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_43_in_ruleKanbanTaskModel1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCapability_in_entryRuleCapability2030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCapability2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleCapability2077 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCapability2094 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleCapability2111 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ruleRequirement_in_ruleCapability2132 = new BitSet(new long[]{0x0000000200800000L});
    public static final BitSet FOLLOW_23_in_ruleCapability2145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKanbanGovModel_in_entryRuleKanbanGovModel2181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKanbanGovModel2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStrategy_in_ruleKanbanGovModel2236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStrategy_in_entryRuleStrategy2271 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStrategy2281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleStrategy2318 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStrategy2335 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleStrategy2352 = new BitSet(new long[]{0x0000400000800000L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleStrategy2373 = new BitSet(new long[]{0x0000400000800000L});
    public static final BitSet FOLLOW_23_in_ruleStrategy2386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity2422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleEntity2469 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity2486 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleEntity2503 = new BitSet(new long[]{0x0340800000800000L});
    public static final BitSet FOLLOW_47_in_ruleEntity2516 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity2533 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleEntity2550 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleEntity2562 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_ruleProvision_in_ruleEntity2583 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_50_in_ruleEntity2596 = new BitSet(new long[]{0x0340000000800000L});
    public static final BitSet FOLLOW_ruleStatemachine_in_ruleEntity2619 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleEntity2631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvision_in_entryRuleProvision2667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProvision2677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleProvision2714 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProvision2734 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleProvision2746 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleProvision2758 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProvision2778 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_23_in_ruleProvision2791 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleProvision2803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatemachine_in_entryRuleStatemachine2839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatemachine2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleStatemachine2896 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleStatemachine2917 = new BitSet(new long[]{0x0080000000000010L});
    public static final BitSet FOLLOW_55_in_ruleStatemachine2930 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_56_in_ruleStatemachine2945 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleStatemachine2966 = new BitSet(new long[]{0x0080000000000010L});
    public static final BitSet FOLLOW_55_in_ruleStatemachine2979 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_ruleState_in_ruleStatemachine3002 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent3039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent3049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvent3091 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvent3113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand3154 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand3164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand3206 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand3228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState3269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState3279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleState3316 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState3333 = new BitSet(new long[]{0x0480000000000010L});
    public static final BitSet FOLLOW_58_in_ruleState3351 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleState3363 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState3383 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_23_in_ruleState3396 = new BitSet(new long[]{0x0080000000000010L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleState3419 = new BitSet(new long[]{0x0080000000000010L});
    public static final BitSet FOLLOW_55_in_ruleState3432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition3468 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition3478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition3524 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleTransition3536 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition3556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition3584 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleTransition3596 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleTransition3608 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition3628 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_50_in_ruleTransition3641 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleTransition3653 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition3673 = new BitSet(new long[]{0x0000000000000002L});

}