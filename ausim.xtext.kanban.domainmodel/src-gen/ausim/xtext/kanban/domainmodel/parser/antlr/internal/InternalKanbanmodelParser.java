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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'KSSWorkFlowModel'", "'Organization'", "'end Organization'", "'WorkItems'", "'end WorkItems'", "'end KSSWorkFlowModel'", "'team'", "'group'", "'{'", "'sourceUnits'", "'}'", "'targetUnits'", "'contains'", "'resources'", "'services'", "'service'", "'resource'", "'skills'", "'=>'", "'->'", "'requirement'", "'workItems'", "'workItemNetwork'", "'workItem'", "'subtasks'", "'taskDependencies'", "'servicesRequired'", "'base value'", "'classOfService'", "'TaskModel'", "'end TaskModel'", "'capability'"
    };
    public static final int T__42=42;
    public static final int RULE_ID=4;
    public static final int T__40=40;
    public static final int T__41=41;
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
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:76:1: ruleKanbanSchedulingSystem returns [EObject current=null] : (otherlv_0= 'KSSWorkFlowModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Organization' ( (lv_orgUnits_3_0= ruleTeam ) )+ otherlv_4= 'end Organization' otherlv_5= 'WorkItems' ( (lv_kssTasks_6_0= ruleTask ) )+ otherlv_7= 'end WorkItems' ( (lv_kssWorkFlow_8_0= ruleKanbanTaskModel ) ) otherlv_9= 'end KSSWorkFlowModel' ) ;
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
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:79:28: ( (otherlv_0= 'KSSWorkFlowModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Organization' ( (lv_orgUnits_3_0= ruleTeam ) )+ otherlv_4= 'end Organization' otherlv_5= 'WorkItems' ( (lv_kssTasks_6_0= ruleTask ) )+ otherlv_7= 'end WorkItems' ( (lv_kssWorkFlow_8_0= ruleKanbanTaskModel ) ) otherlv_9= 'end KSSWorkFlowModel' ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:80:1: (otherlv_0= 'KSSWorkFlowModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Organization' ( (lv_orgUnits_3_0= ruleTeam ) )+ otherlv_4= 'end Organization' otherlv_5= 'WorkItems' ( (lv_kssTasks_6_0= ruleTask ) )+ otherlv_7= 'end WorkItems' ( (lv_kssWorkFlow_8_0= ruleKanbanTaskModel ) ) otherlv_9= 'end KSSWorkFlowModel' )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:80:1: (otherlv_0= 'KSSWorkFlowModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Organization' ( (lv_orgUnits_3_0= ruleTeam ) )+ otherlv_4= 'end Organization' otherlv_5= 'WorkItems' ( (lv_kssTasks_6_0= ruleTask ) )+ otherlv_7= 'end WorkItems' ( (lv_kssWorkFlow_8_0= ruleKanbanTaskModel ) ) otherlv_9= 'end KSSWorkFlowModel' )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:80:3: otherlv_0= 'KSSWorkFlowModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Organization' ( (lv_orgUnits_3_0= ruleTeam ) )+ otherlv_4= 'end Organization' otherlv_5= 'WorkItems' ( (lv_kssTasks_6_0= ruleTask ) )+ otherlv_7= 'end WorkItems' ( (lv_kssWorkFlow_8_0= ruleKanbanTaskModel ) ) otherlv_9= 'end KSSWorkFlowModel'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleKanbanSchedulingSystem122); 

                	newLeafNode(otherlv_0, grammarAccess.getKanbanSchedulingSystemAccess().getKSSWorkFlowModelKeyword_0());
                
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

                	newLeafNode(otherlv_2, grammarAccess.getKanbanSchedulingSystemAccess().getOrganizationKeyword_2());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:106:1: ( (lv_orgUnits_3_0= ruleTeam ) )+
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

                	newLeafNode(otherlv_4, grammarAccess.getKanbanSchedulingSystemAccess().getEndOrganizationKeyword_4());
                
            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleKanbanSchedulingSystem202); 

                	newLeafNode(otherlv_5, grammarAccess.getKanbanSchedulingSystemAccess().getWorkItemsKeyword_5());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:132:1: ( (lv_kssTasks_6_0= ruleTask ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==34) ) {
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

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleKanbanSchedulingSystem236); 

                	newLeafNode(otherlv_7, grammarAccess.getKanbanSchedulingSystemAccess().getEndWorkItemsKeyword_7());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:154:1: ( (lv_kssWorkFlow_8_0= ruleKanbanTaskModel ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:155:1: (lv_kssWorkFlow_8_0= ruleKanbanTaskModel )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:155:1: (lv_kssWorkFlow_8_0= ruleKanbanTaskModel )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:156:3: lv_kssWorkFlow_8_0= ruleKanbanTaskModel
            {
             
            	        newCompositeNode(grammarAccess.getKanbanSchedulingSystemAccess().getKssWorkFlowKanbanTaskModelParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleKanbanTaskModel_in_ruleKanbanSchedulingSystem257);
            lv_kssWorkFlow_8_0=ruleKanbanTaskModel();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getKanbanSchedulingSystemRule());
            	        }
                   		set(
                   			current, 
                   			"kssWorkFlow",
                    		lv_kssWorkFlow_8_0, 
                    		"KanbanTaskModel");
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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:184:1: entryRuleTeam returns [EObject current=null] : iv_ruleTeam= ruleTeam EOF ;
    public final EObject entryRuleTeam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeam = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:185:2: (iv_ruleTeam= ruleTeam EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:186:2: iv_ruleTeam= ruleTeam EOF
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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:193:1: ruleTeam returns [EObject current=null] : ( (otherlv_0= 'team' | otherlv_1= 'group' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'sourceUnits' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}' )? (otherlv_8= 'targetUnits' otherlv_9= '{' ( (otherlv_10= RULE_ID ) )+ otherlv_11= '}' )? (otherlv_12= 'contains' otherlv_13= '{' ( (otherlv_14= RULE_ID ) )+ otherlv_15= '}' )? (otherlv_16= 'resources' otherlv_17= '{' ( (lv_resources_18_0= ruleAsset ) )+ otherlv_19= '}' )? (otherlv_20= 'services' otherlv_21= '{' ( (lv_services_22_0= ruleService ) )+ otherlv_23= '}' )? otherlv_24= '}' ) ;
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
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:196:28: ( ( (otherlv_0= 'team' | otherlv_1= 'group' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'sourceUnits' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}' )? (otherlv_8= 'targetUnits' otherlv_9= '{' ( (otherlv_10= RULE_ID ) )+ otherlv_11= '}' )? (otherlv_12= 'contains' otherlv_13= '{' ( (otherlv_14= RULE_ID ) )+ otherlv_15= '}' )? (otherlv_16= 'resources' otherlv_17= '{' ( (lv_resources_18_0= ruleAsset ) )+ otherlv_19= '}' )? (otherlv_20= 'services' otherlv_21= '{' ( (lv_services_22_0= ruleService ) )+ otherlv_23= '}' )? otherlv_24= '}' ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:197:1: ( (otherlv_0= 'team' | otherlv_1= 'group' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'sourceUnits' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}' )? (otherlv_8= 'targetUnits' otherlv_9= '{' ( (otherlv_10= RULE_ID ) )+ otherlv_11= '}' )? (otherlv_12= 'contains' otherlv_13= '{' ( (otherlv_14= RULE_ID ) )+ otherlv_15= '}' )? (otherlv_16= 'resources' otherlv_17= '{' ( (lv_resources_18_0= ruleAsset ) )+ otherlv_19= '}' )? (otherlv_20= 'services' otherlv_21= '{' ( (lv_services_22_0= ruleService ) )+ otherlv_23= '}' )? otherlv_24= '}' )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:197:1: ( (otherlv_0= 'team' | otherlv_1= 'group' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'sourceUnits' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}' )? (otherlv_8= 'targetUnits' otherlv_9= '{' ( (otherlv_10= RULE_ID ) )+ otherlv_11= '}' )? (otherlv_12= 'contains' otherlv_13= '{' ( (otherlv_14= RULE_ID ) )+ otherlv_15= '}' )? (otherlv_16= 'resources' otherlv_17= '{' ( (lv_resources_18_0= ruleAsset ) )+ otherlv_19= '}' )? (otherlv_20= 'services' otherlv_21= '{' ( (lv_services_22_0= ruleService ) )+ otherlv_23= '}' )? otherlv_24= '}' )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:197:2: (otherlv_0= 'team' | otherlv_1= 'group' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'sourceUnits' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}' )? (otherlv_8= 'targetUnits' otherlv_9= '{' ( (otherlv_10= RULE_ID ) )+ otherlv_11= '}' )? (otherlv_12= 'contains' otherlv_13= '{' ( (otherlv_14= RULE_ID ) )+ otherlv_15= '}' )? (otherlv_16= 'resources' otherlv_17= '{' ( (lv_resources_18_0= ruleAsset ) )+ otherlv_19= '}' )? (otherlv_20= 'services' otherlv_21= '{' ( (lv_services_22_0= ruleService ) )+ otherlv_23= '}' )? otherlv_24= '}'
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:197:2: (otherlv_0= 'team' | otherlv_1= 'group' )
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
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:197:4: otherlv_0= 'team'
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleTeam353); 

                        	newLeafNode(otherlv_0, grammarAccess.getTeamAccess().getTeamKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:202:7: otherlv_1= 'group'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleTeam371); 

                        	newLeafNode(otherlv_1, grammarAccess.getTeamAccess().getGroupKeyword_0_1());
                        

                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:206:2: ( (lv_name_2_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:207:1: (lv_name_2_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:207:1: (lv_name_2_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:208:3: lv_name_2_0= RULE_ID
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
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:228:1: (otherlv_4= 'sourceUnits' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:228:3: otherlv_4= 'sourceUnits' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )+ otherlv_7= '}'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleTeam419); 

                        	newLeafNode(otherlv_4, grammarAccess.getTeamAccess().getSourceUnitsKeyword_3_0());
                        
                    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleTeam431); 

                        	newLeafNode(otherlv_5, grammarAccess.getTeamAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:236:1: ( (otherlv_6= RULE_ID ) )+
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
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:237:1: (otherlv_6= RULE_ID )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:237:1: (otherlv_6= RULE_ID )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:238:3: otherlv_6= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTeamRule());
                    	    	        }
                    	            
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTeam451); 

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

                    otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleTeam464); 

                        	newLeafNode(otherlv_7, grammarAccess.getTeamAccess().getRightCurlyBracketKeyword_3_3());
                        

                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:253:3: (otherlv_8= 'targetUnits' otherlv_9= '{' ( (otherlv_10= RULE_ID ) )+ otherlv_11= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:253:5: otherlv_8= 'targetUnits' otherlv_9= '{' ( (otherlv_10= RULE_ID ) )+ otherlv_11= '}'
                    {
                    otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleTeam479); 

                        	newLeafNode(otherlv_8, grammarAccess.getTeamAccess().getTargetUnitsKeyword_4_0());
                        
                    otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleTeam491); 

                        	newLeafNode(otherlv_9, grammarAccess.getTeamAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:261:1: ( (otherlv_10= RULE_ID ) )+
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
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:262:1: (otherlv_10= RULE_ID )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:262:1: (otherlv_10= RULE_ID )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:263:3: otherlv_10= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTeamRule());
                    	    	        }
                    	            
                    	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTeam511); 

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

                    otherlv_11=(Token)match(input,21,FOLLOW_21_in_ruleTeam524); 

                        	newLeafNode(otherlv_11, grammarAccess.getTeamAccess().getRightCurlyBracketKeyword_4_3());
                        

                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:278:3: (otherlv_12= 'contains' otherlv_13= '{' ( (otherlv_14= RULE_ID ) )+ otherlv_15= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:278:5: otherlv_12= 'contains' otherlv_13= '{' ( (otherlv_14= RULE_ID ) )+ otherlv_15= '}'
                    {
                    otherlv_12=(Token)match(input,23,FOLLOW_23_in_ruleTeam539); 

                        	newLeafNode(otherlv_12, grammarAccess.getTeamAccess().getContainsKeyword_5_0());
                        
                    otherlv_13=(Token)match(input,19,FOLLOW_19_in_ruleTeam551); 

                        	newLeafNode(otherlv_13, grammarAccess.getTeamAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:286:1: ( (otherlv_14= RULE_ID ) )+
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
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:287:1: (otherlv_14= RULE_ID )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:287:1: (otherlv_14= RULE_ID )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:288:3: otherlv_14= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTeamRule());
                    	    	        }
                    	            
                    	    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTeam571); 

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

                    otherlv_15=(Token)match(input,21,FOLLOW_21_in_ruleTeam584); 

                        	newLeafNode(otherlv_15, grammarAccess.getTeamAccess().getRightCurlyBracketKeyword_5_3());
                        

                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:303:3: (otherlv_16= 'resources' otherlv_17= '{' ( (lv_resources_18_0= ruleAsset ) )+ otherlv_19= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:303:5: otherlv_16= 'resources' otherlv_17= '{' ( (lv_resources_18_0= ruleAsset ) )+ otherlv_19= '}'
                    {
                    otherlv_16=(Token)match(input,24,FOLLOW_24_in_ruleTeam599); 

                        	newLeafNode(otherlv_16, grammarAccess.getTeamAccess().getResourcesKeyword_6_0());
                        
                    otherlv_17=(Token)match(input,19,FOLLOW_19_in_ruleTeam611); 

                        	newLeafNode(otherlv_17, grammarAccess.getTeamAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:311:1: ( (lv_resources_18_0= ruleAsset ) )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==27) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:312:1: (lv_resources_18_0= ruleAsset )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:312:1: (lv_resources_18_0= ruleAsset )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:313:3: lv_resources_18_0= ruleAsset
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTeamAccess().getResourcesAssetParserRuleCall_6_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAsset_in_ruleTeam632);
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

                    otherlv_19=(Token)match(input,21,FOLLOW_21_in_ruleTeam645); 

                        	newLeafNode(otherlv_19, grammarAccess.getTeamAccess().getRightCurlyBracketKeyword_6_3());
                        

                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:333:3: (otherlv_20= 'services' otherlv_21= '{' ( (lv_services_22_0= ruleService ) )+ otherlv_23= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:333:5: otherlv_20= 'services' otherlv_21= '{' ( (lv_services_22_0= ruleService ) )+ otherlv_23= '}'
                    {
                    otherlv_20=(Token)match(input,25,FOLLOW_25_in_ruleTeam660); 

                        	newLeafNode(otherlv_20, grammarAccess.getTeamAccess().getServicesKeyword_7_0());
                        
                    otherlv_21=(Token)match(input,19,FOLLOW_19_in_ruleTeam672); 

                        	newLeafNode(otherlv_21, grammarAccess.getTeamAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:341:1: ( (lv_services_22_0= ruleService ) )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==26) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:342:1: (lv_services_22_0= ruleService )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:342:1: (lv_services_22_0= ruleService )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:343:3: lv_services_22_0= ruleService
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTeamAccess().getServicesServiceParserRuleCall_7_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleService_in_ruleTeam693);
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

                    otherlv_23=(Token)match(input,21,FOLLOW_21_in_ruleTeam706); 

                        	newLeafNode(otherlv_23, grammarAccess.getTeamAccess().getRightCurlyBracketKeyword_7_3());
                        

                    }
                    break;

            }

            otherlv_24=(Token)match(input,21,FOLLOW_21_in_ruleTeam720); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:375:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:376:2: (iv_ruleService= ruleService EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:377:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService756);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService766); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:384:1: ruleService returns [EObject current=null] : (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:387:28: ( (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:388:1: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:388:1: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:388:3: otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleService803); 

                	newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:392:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:393:1: (lv_name_1_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:393:1: (lv_name_1_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:394:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService820); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:418:1: entryRuleAsset returns [EObject current=null] : iv_ruleAsset= ruleAsset EOF ;
    public final EObject entryRuleAsset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsset = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:419:2: (iv_ruleAsset= ruleAsset EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:420:2: iv_ruleAsset= ruleAsset EOF
            {
             newCompositeNode(grammarAccess.getAssetRule()); 
            pushFollow(FOLLOW_ruleAsset_in_entryRuleAsset861);
            iv_ruleAsset=ruleAsset();

            state._fsp--;

             current =iv_ruleAsset; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAsset871); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:427:1: ruleAsset returns [EObject current=null] : (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' otherlv_3= 'skills' otherlv_4= '{' ( (lv_hasSkills_5_0= ruleSkill ) )+ otherlv_6= '}' otherlv_7= '}' )? ) ;
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
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:430:28: ( (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' otherlv_3= 'skills' otherlv_4= '{' ( (lv_hasSkills_5_0= ruleSkill ) )+ otherlv_6= '}' otherlv_7= '}' )? ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:431:1: (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' otherlv_3= 'skills' otherlv_4= '{' ( (lv_hasSkills_5_0= ruleSkill ) )+ otherlv_6= '}' otherlv_7= '}' )? )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:431:1: (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' otherlv_3= 'skills' otherlv_4= '{' ( (lv_hasSkills_5_0= ruleSkill ) )+ otherlv_6= '}' otherlv_7= '}' )? )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:431:3: otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' otherlv_3= 'skills' otherlv_4= '{' ( (lv_hasSkills_5_0= ruleSkill ) )+ otherlv_6= '}' otherlv_7= '}' )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleAsset908); 

                	newLeafNode(otherlv_0, grammarAccess.getAssetAccess().getResourceKeyword_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:435:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:436:1: (lv_name_1_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:436:1: (lv_name_1_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:437:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAsset925); 

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

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:453:2: (otherlv_2= '{' otherlv_3= 'skills' otherlv_4= '{' ( (lv_hasSkills_5_0= ruleSkill ) )+ otherlv_6= '}' otherlv_7= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:453:4: otherlv_2= '{' otherlv_3= 'skills' otherlv_4= '{' ( (lv_hasSkills_5_0= ruleSkill ) )+ otherlv_6= '}' otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleAsset943); 

                        	newLeafNode(otherlv_2, grammarAccess.getAssetAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleAsset955); 

                        	newLeafNode(otherlv_3, grammarAccess.getAssetAccess().getSkillsKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleAsset967); 

                        	newLeafNode(otherlv_4, grammarAccess.getAssetAccess().getLeftCurlyBracketKeyword_2_2());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:465:1: ( (lv_hasSkills_5_0= ruleSkill ) )+
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
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:466:1: (lv_hasSkills_5_0= ruleSkill )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:466:1: (lv_hasSkills_5_0= ruleSkill )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:467:3: lv_hasSkills_5_0= ruleSkill
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssetAccess().getHasSkillsSkillParserRuleCall_2_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSkill_in_ruleAsset988);
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

                    otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleAsset1001); 

                        	newLeafNode(otherlv_6, grammarAccess.getAssetAccess().getRightCurlyBracketKeyword_2_4());
                        
                    otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleAsset1013); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:499:1: entryRuleSkill returns [EObject current=null] : iv_ruleSkill= ruleSkill EOF ;
    public final EObject entryRuleSkill() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkill = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:500:2: (iv_ruleSkill= ruleSkill EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:501:2: iv_ruleSkill= ruleSkill EOF
            {
             newCompositeNode(grammarAccess.getSkillRule()); 
            pushFollow(FOLLOW_ruleSkill_in_entryRuleSkill1051);
            iv_ruleSkill=ruleSkill();

            state._fsp--;

             current =iv_ruleSkill; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSkill1061); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:508:1: ruleSkill returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleSkill() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:511:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:512:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:512:1: ( (lv_name_0_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:513:1: (lv_name_0_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:513:1: (lv_name_0_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:514:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSkill1102); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:538:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:539:2: (iv_ruleDependency= ruleDependency EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:540:2: iv_ruleDependency= ruleDependency EOF
            {
             newCompositeNode(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_ruleDependency_in_entryRuleDependency1142);
            iv_ruleDependency=ruleDependency();

            state._fsp--;

             current =iv_ruleDependency; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependency1152); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:547:1: ruleDependency returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=>' | otherlv_2= '->' ) ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:550:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=>' | otherlv_2= '->' ) ( (otherlv_3= RULE_ID ) ) ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:551:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=>' | otherlv_2= '->' ) ( (otherlv_3= RULE_ID ) ) )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:551:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=>' | otherlv_2= '->' ) ( (otherlv_3= RULE_ID ) ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:551:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '=>' | otherlv_2= '->' ) ( (otherlv_3= RULE_ID ) )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:551:2: ( (otherlv_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:552:1: (otherlv_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:552:1: (otherlv_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:553:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDependencyRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDependency1197); 

            		newLeafNode(otherlv_0, grammarAccess.getDependencyAccess().getSourceTaskTaskCrossReference_0_0()); 
            	

            }


            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:564:2: (otherlv_1= '=>' | otherlv_2= '->' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            else if ( (LA16_0==30) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:564:4: otherlv_1= '=>'
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleDependency1210); 

                        	newLeafNode(otherlv_1, grammarAccess.getDependencyAccess().getEqualsSignGreaterThanSignKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:569:7: otherlv_2= '->'
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleDependency1228); 

                        	newLeafNode(otherlv_2, grammarAccess.getDependencyAccess().getHyphenMinusGreaterThanSignKeyword_1_1());
                        

                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:573:2: ( (otherlv_3= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:574:1: (otherlv_3= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:574:1: (otherlv_3= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:575:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDependencyRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDependency1249); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:594:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:595:2: (iv_ruleRequirement= ruleRequirement EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:596:2: iv_ruleRequirement= ruleRequirement EOF
            {
             newCompositeNode(grammarAccess.getRequirementRule()); 
            pushFollow(FOLLOW_ruleRequirement_in_entryRuleRequirement1285);
            iv_ruleRequirement=ruleRequirement();

            state._fsp--;

             current =iv_ruleRequirement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequirement1295); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:603:1: ruleRequirement returns [EObject current=null] : (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'workItems' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' ) (otherlv_7= 'workItemNetwork' ( (lv_dependencies_8_0= ruleDependency ) )* )? otherlv_9= '}' ) ;
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
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:606:28: ( (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'workItems' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' ) (otherlv_7= 'workItemNetwork' ( (lv_dependencies_8_0= ruleDependency ) )* )? otherlv_9= '}' ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:607:1: (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'workItems' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' ) (otherlv_7= 'workItemNetwork' ( (lv_dependencies_8_0= ruleDependency ) )* )? otherlv_9= '}' )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:607:1: (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'workItems' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' ) (otherlv_7= 'workItemNetwork' ( (lv_dependencies_8_0= ruleDependency ) )* )? otherlv_9= '}' )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:607:3: otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'workItems' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' ) (otherlv_7= 'workItemNetwork' ( (lv_dependencies_8_0= ruleDependency ) )* )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleRequirement1332); 

                	newLeafNode(otherlv_0, grammarAccess.getRequirementAccess().getRequirementKeyword_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:611:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:612:1: (lv_name_1_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:612:1: (lv_name_1_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:613:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirement1349); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleRequirement1366); 

                	newLeafNode(otherlv_2, grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:633:1: (otherlv_3= 'workItems' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:633:3: otherlv_3= 'workItems' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}'
            {
            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleRequirement1379); 

                	newLeafNode(otherlv_3, grammarAccess.getRequirementAccess().getWorkItemsKeyword_3_0());
                
            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleRequirement1391); 

                	newLeafNode(otherlv_4, grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_3_1());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:641:1: ( (otherlv_5= RULE_ID ) )+
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
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:642:1: (otherlv_5= RULE_ID )
            	    {
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:642:1: (otherlv_5= RULE_ID )
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:643:3: otherlv_5= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	        }
            	            
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirement1411); 

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

            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleRequirement1424); 

                	newLeafNode(otherlv_6, grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_3_3());
                

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:658:2: (otherlv_7= 'workItemNetwork' ( (lv_dependencies_8_0= ruleDependency ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:658:4: otherlv_7= 'workItemNetwork' ( (lv_dependencies_8_0= ruleDependency ) )*
                    {
                    otherlv_7=(Token)match(input,33,FOLLOW_33_in_ruleRequirement1438); 

                        	newLeafNode(otherlv_7, grammarAccess.getRequirementAccess().getWorkItemNetworkKeyword_4_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:662:1: ( (lv_dependencies_8_0= ruleDependency ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_ID) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:663:1: (lv_dependencies_8_0= ruleDependency )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:663:1: (lv_dependencies_8_0= ruleDependency )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:664:3: lv_dependencies_8_0= ruleDependency
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRequirementAccess().getDependenciesDependencyParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDependency_in_ruleRequirement1459);
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

            otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleRequirement1474); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:692:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:693:2: (iv_ruleTask= ruleTask EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:694:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_ruleTask_in_entryRuleTask1510);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTask1520); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:701:1: ruleTask returns [EObject current=null] : (otherlv_0= 'workItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'subtasks' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' )? (otherlv_7= 'taskDependencies' ( (lv_taskDependencies_8_0= ruleDependency ) )* )? (otherlv_9= 'servicesRequired' ( (otherlv_10= RULE_ID ) )+ )? (otherlv_11= 'base value' ( (lv_bvalue_12_0= RULE_INT ) ) )? (otherlv_13= 'classOfService' ( (lv_COS_14_0= RULE_ID ) ) )? otherlv_15= '}' ) ;
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
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:704:28: ( (otherlv_0= 'workItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'subtasks' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' )? (otherlv_7= 'taskDependencies' ( (lv_taskDependencies_8_0= ruleDependency ) )* )? (otherlv_9= 'servicesRequired' ( (otherlv_10= RULE_ID ) )+ )? (otherlv_11= 'base value' ( (lv_bvalue_12_0= RULE_INT ) ) )? (otherlv_13= 'classOfService' ( (lv_COS_14_0= RULE_ID ) ) )? otherlv_15= '}' ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:705:1: (otherlv_0= 'workItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'subtasks' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' )? (otherlv_7= 'taskDependencies' ( (lv_taskDependencies_8_0= ruleDependency ) )* )? (otherlv_9= 'servicesRequired' ( (otherlv_10= RULE_ID ) )+ )? (otherlv_11= 'base value' ( (lv_bvalue_12_0= RULE_INT ) ) )? (otherlv_13= 'classOfService' ( (lv_COS_14_0= RULE_ID ) ) )? otherlv_15= '}' )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:705:1: (otherlv_0= 'workItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'subtasks' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' )? (otherlv_7= 'taskDependencies' ( (lv_taskDependencies_8_0= ruleDependency ) )* )? (otherlv_9= 'servicesRequired' ( (otherlv_10= RULE_ID ) )+ )? (otherlv_11= 'base value' ( (lv_bvalue_12_0= RULE_INT ) ) )? (otherlv_13= 'classOfService' ( (lv_COS_14_0= RULE_ID ) ) )? otherlv_15= '}' )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:705:3: otherlv_0= 'workItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'subtasks' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' )? (otherlv_7= 'taskDependencies' ( (lv_taskDependencies_8_0= ruleDependency ) )* )? (otherlv_9= 'servicesRequired' ( (otherlv_10= RULE_ID ) )+ )? (otherlv_11= 'base value' ( (lv_bvalue_12_0= RULE_INT ) ) )? (otherlv_13= 'classOfService' ( (lv_COS_14_0= RULE_ID ) ) )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleTask1557); 

                	newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getWorkItemKeyword_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:709:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:710:1: (lv_name_1_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:710:1: (lv_name_1_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:711:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTask1574); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleTask1591); 

                	newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:731:1: (otherlv_3= 'subtasks' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:731:3: otherlv_3= 'subtasks' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleTask1604); 

                        	newLeafNode(otherlv_3, grammarAccess.getTaskAccess().getSubtasksKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleTask1616); 

                        	newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:739:1: ( (otherlv_5= RULE_ID ) )+
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
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:740:1: (otherlv_5= RULE_ID )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:740:1: (otherlv_5= RULE_ID )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:741:3: otherlv_5= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTaskRule());
                    	    	        }
                    	            
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTask1636); 

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

                    otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleTask1649); 

                        	newLeafNode(otherlv_6, grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_3_3());
                        

                    }
                    break;

            }

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:756:3: (otherlv_7= 'taskDependencies' ( (lv_taskDependencies_8_0= ruleDependency ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:756:5: otherlv_7= 'taskDependencies' ( (lv_taskDependencies_8_0= ruleDependency ) )*
                    {
                    otherlv_7=(Token)match(input,36,FOLLOW_36_in_ruleTask1664); 

                        	newLeafNode(otherlv_7, grammarAccess.getTaskAccess().getTaskDependenciesKeyword_4_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:760:1: ( (lv_taskDependencies_8_0= ruleDependency ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==RULE_ID) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:761:1: (lv_taskDependencies_8_0= ruleDependency )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:761:1: (lv_taskDependencies_8_0= ruleDependency )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:762:3: lv_taskDependencies_8_0= ruleDependency
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTaskAccess().getTaskDependenciesDependencyParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDependency_in_ruleTask1685);
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

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:778:5: (otherlv_9= 'servicesRequired' ( (otherlv_10= RULE_ID ) )+ )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==37) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:778:7: otherlv_9= 'servicesRequired' ( (otherlv_10= RULE_ID ) )+
                    {
                    otherlv_9=(Token)match(input,37,FOLLOW_37_in_ruleTask1701); 

                        	newLeafNode(otherlv_9, grammarAccess.getTaskAccess().getServicesRequiredKeyword_5_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:782:1: ( (otherlv_10= RULE_ID ) )+
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
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:783:1: (otherlv_10= RULE_ID )
                    	    {
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:783:1: (otherlv_10= RULE_ID )
                    	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:784:3: otherlv_10= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTaskRule());
                    	    	        }
                    	            
                    	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTask1721); 

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

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:795:5: (otherlv_11= 'base value' ( (lv_bvalue_12_0= RULE_INT ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==38) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:795:7: otherlv_11= 'base value' ( (lv_bvalue_12_0= RULE_INT ) )
                    {
                    otherlv_11=(Token)match(input,38,FOLLOW_38_in_ruleTask1737); 

                        	newLeafNode(otherlv_11, grammarAccess.getTaskAccess().getBaseValueKeyword_6_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:799:1: ( (lv_bvalue_12_0= RULE_INT ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:800:1: (lv_bvalue_12_0= RULE_INT )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:800:1: (lv_bvalue_12_0= RULE_INT )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:801:3: lv_bvalue_12_0= RULE_INT
                    {
                    lv_bvalue_12_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTask1754); 

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

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:817:4: (otherlv_13= 'classOfService' ( (lv_COS_14_0= RULE_ID ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==39) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:817:6: otherlv_13= 'classOfService' ( (lv_COS_14_0= RULE_ID ) )
                    {
                    otherlv_13=(Token)match(input,39,FOLLOW_39_in_ruleTask1774); 

                        	newLeafNode(otherlv_13, grammarAccess.getTaskAccess().getClassOfServiceKeyword_7_0());
                        
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:821:1: ( (lv_COS_14_0= RULE_ID ) )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:822:1: (lv_COS_14_0= RULE_ID )
                    {
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:822:1: (lv_COS_14_0= RULE_ID )
                    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:823:3: lv_COS_14_0= RULE_ID
                    {
                    lv_COS_14_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTask1791); 

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

            otherlv_15=(Token)match(input,21,FOLLOW_21_in_ruleTask1810); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:851:1: entryRuleKanbanTaskModel returns [EObject current=null] : iv_ruleKanbanTaskModel= ruleKanbanTaskModel EOF ;
    public final EObject entryRuleKanbanTaskModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKanbanTaskModel = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:852:2: (iv_ruleKanbanTaskModel= ruleKanbanTaskModel EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:853:2: iv_ruleKanbanTaskModel= ruleKanbanTaskModel EOF
            {
             newCompositeNode(grammarAccess.getKanbanTaskModelRule()); 
            pushFollow(FOLLOW_ruleKanbanTaskModel_in_entryRuleKanbanTaskModel1846);
            iv_ruleKanbanTaskModel=ruleKanbanTaskModel();

            state._fsp--;

             current =iv_ruleKanbanTaskModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKanbanTaskModel1856); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:860:1: ruleKanbanTaskModel returns [EObject current=null] : (otherlv_0= 'TaskModel' ( (lv_name_1_0= RULE_ID ) ) ( (lv_caps_2_0= ruleCapability ) )+ otherlv_3= 'end TaskModel' ) ;
    public final EObject ruleKanbanTaskModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_caps_2_0 = null;


         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:863:28: ( (otherlv_0= 'TaskModel' ( (lv_name_1_0= RULE_ID ) ) ( (lv_caps_2_0= ruleCapability ) )+ otherlv_3= 'end TaskModel' ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:864:1: (otherlv_0= 'TaskModel' ( (lv_name_1_0= RULE_ID ) ) ( (lv_caps_2_0= ruleCapability ) )+ otherlv_3= 'end TaskModel' )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:864:1: (otherlv_0= 'TaskModel' ( (lv_name_1_0= RULE_ID ) ) ( (lv_caps_2_0= ruleCapability ) )+ otherlv_3= 'end TaskModel' )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:864:3: otherlv_0= 'TaskModel' ( (lv_name_1_0= RULE_ID ) ) ( (lv_caps_2_0= ruleCapability ) )+ otherlv_3= 'end TaskModel'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleKanbanTaskModel1893); 

                	newLeafNode(otherlv_0, grammarAccess.getKanbanTaskModelAccess().getTaskModelKeyword_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:868:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:869:1: (lv_name_1_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:869:1: (lv_name_1_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:870:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleKanbanTaskModel1910); 

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

            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:886:2: ( (lv_caps_2_0= ruleCapability ) )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==42) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:887:1: (lv_caps_2_0= ruleCapability )
            	    {
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:887:1: (lv_caps_2_0= ruleCapability )
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:888:3: lv_caps_2_0= ruleCapability
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKanbanTaskModelAccess().getCapsCapabilityParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCapability_in_ruleKanbanTaskModel1936);
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

            otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleKanbanTaskModel1949); 

                	newLeafNode(otherlv_3, grammarAccess.getKanbanTaskModelAccess().getEndTaskModelKeyword_3());
                

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:916:1: entryRuleCapability returns [EObject current=null] : iv_ruleCapability= ruleCapability EOF ;
    public final EObject entryRuleCapability() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCapability = null;


        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:917:2: (iv_ruleCapability= ruleCapability EOF )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:918:2: iv_ruleCapability= ruleCapability EOF
            {
             newCompositeNode(grammarAccess.getCapabilityRule()); 
            pushFollow(FOLLOW_ruleCapability_in_entryRuleCapability1985);
            iv_ruleCapability=ruleCapability();

            state._fsp--;

             current =iv_ruleCapability; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCapability1995); 

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
    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:925:1: ruleCapability returns [EObject current=null] : (otherlv_0= 'capability' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_reqs_3_0= ruleRequirement ) )+ otherlv_4= '}' ) ;
    public final EObject ruleCapability() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_reqs_3_0 = null;


         enterRule(); 
            
        try {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:928:28: ( (otherlv_0= 'capability' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_reqs_3_0= ruleRequirement ) )+ otherlv_4= '}' ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:929:1: (otherlv_0= 'capability' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_reqs_3_0= ruleRequirement ) )+ otherlv_4= '}' )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:929:1: (otherlv_0= 'capability' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_reqs_3_0= ruleRequirement ) )+ otherlv_4= '}' )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:929:3: otherlv_0= 'capability' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_reqs_3_0= ruleRequirement ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleCapability2032); 

                	newLeafNode(otherlv_0, grammarAccess.getCapabilityAccess().getCapabilityKeyword_0());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:933:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:934:1: (lv_name_1_0= RULE_ID )
            {
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:934:1: (lv_name_1_0= RULE_ID )
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:935:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCapability2049); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleCapability2066); 

                	newLeafNode(otherlv_2, grammarAccess.getCapabilityAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:955:1: ( (lv_reqs_3_0= ruleRequirement ) )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==31) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:956:1: (lv_reqs_3_0= ruleRequirement )
            	    {
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:956:1: (lv_reqs_3_0= ruleRequirement )
            	    // ../ausim.xtext.kanban.domainmodel/src-gen/ausim/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:957:3: lv_reqs_3_0= ruleRequirement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCapabilityAccess().getReqsRequirementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRequirement_in_ruleCapability2087);
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

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleCapability2100); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleKanbanSchedulingSystem_in_entryRuleKanbanSchedulingSystem75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKanbanSchedulingSystem85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleKanbanSchedulingSystem122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleKanbanSchedulingSystem139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleKanbanSchedulingSystem156 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_ruleTeam_in_ruleKanbanSchedulingSystem177 = new BitSet(new long[]{0x0000000000062000L});
    public static final BitSet FOLLOW_13_in_ruleKanbanSchedulingSystem190 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleKanbanSchedulingSystem202 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ruleTask_in_ruleKanbanSchedulingSystem223 = new BitSet(new long[]{0x0000000400008000L});
    public static final BitSet FOLLOW_15_in_ruleKanbanSchedulingSystem236 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ruleKanbanTaskModel_in_ruleKanbanSchedulingSystem257 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleKanbanSchedulingSystem269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTeam_in_entryRuleTeam305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTeam315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleTeam353 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18_in_ruleTeam371 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTeam389 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTeam406 = new BitSet(new long[]{0x0000000003F00000L});
    public static final BitSet FOLLOW_20_in_ruleTeam419 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTeam431 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTeam451 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_21_in_ruleTeam464 = new BitSet(new long[]{0x0000000003E00000L});
    public static final BitSet FOLLOW_22_in_ruleTeam479 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTeam491 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTeam511 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_21_in_ruleTeam524 = new BitSet(new long[]{0x0000000003A00000L});
    public static final BitSet FOLLOW_23_in_ruleTeam539 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTeam551 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTeam571 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_21_in_ruleTeam584 = new BitSet(new long[]{0x0000000003200000L});
    public static final BitSet FOLLOW_24_in_ruleTeam599 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTeam611 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleAsset_in_ruleTeam632 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_21_in_ruleTeam645 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_25_in_ruleTeam660 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTeam672 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleService_in_ruleTeam693 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_21_in_ruleTeam706 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTeam720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService756 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleService803 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_entryRuleAsset861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAsset871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleAsset908 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAsset925 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleAsset943 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAsset955 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAsset967 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSkill_in_ruleAsset988 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_21_in_ruleAsset1001 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleAsset1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkill_in_entryRuleSkill1051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSkill1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSkill1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency1142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependency1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDependency1197 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_29_in_ruleDependency1210 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_30_in_ruleDependency1228 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDependency1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirement_in_entryRuleRequirement1285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequirement1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleRequirement1332 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirement1349 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRequirement1366 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleRequirement1379 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRequirement1391 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirement1411 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_21_in_ruleRequirement1424 = new BitSet(new long[]{0x0000000200200000L});
    public static final BitSet FOLLOW_33_in_ruleRequirement1438 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_ruleDependency_in_ruleRequirement1459 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_21_in_ruleRequirement1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_entryRuleTask1510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTask1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleTask1557 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTask1574 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTask1591 = new BitSet(new long[]{0x000000F800200000L});
    public static final BitSet FOLLOW_35_in_ruleTask1604 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTask1616 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTask1636 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_21_in_ruleTask1649 = new BitSet(new long[]{0x000000F000200000L});
    public static final BitSet FOLLOW_36_in_ruleTask1664 = new BitSet(new long[]{0x000000E000200010L});
    public static final BitSet FOLLOW_ruleDependency_in_ruleTask1685 = new BitSet(new long[]{0x000000E000200010L});
    public static final BitSet FOLLOW_37_in_ruleTask1701 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTask1721 = new BitSet(new long[]{0x000000C000200010L});
    public static final BitSet FOLLOW_38_in_ruleTask1737 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTask1754 = new BitSet(new long[]{0x0000008000200000L});
    public static final BitSet FOLLOW_39_in_ruleTask1774 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTask1791 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTask1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKanbanTaskModel_in_entryRuleKanbanTaskModel1846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKanbanTaskModel1856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleKanbanTaskModel1893 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleKanbanTaskModel1910 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ruleCapability_in_ruleKanbanTaskModel1936 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_41_in_ruleKanbanTaskModel1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCapability_in_entryRuleCapability1985 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCapability1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleCapability2032 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCapability2049 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCapability2066 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleRequirement_in_ruleCapability2087 = new BitSet(new long[]{0x0000000080200000L});
    public static final BitSet FOLLOW_21_in_ruleCapability2100 = new BitSet(new long[]{0x0000000000000002L});

}