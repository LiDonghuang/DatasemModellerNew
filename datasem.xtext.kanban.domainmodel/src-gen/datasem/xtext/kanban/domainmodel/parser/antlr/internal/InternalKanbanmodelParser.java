package datasem.xtext.kanban.domainmodel.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import datasem.xtext.kanban.domainmodel.services.KanbanmodelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKanbanmodelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_DOUBLE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ModelBuilder'", "'Description'", "'ExperimentModel'", "'Path'", "'OrganizationalModel'", "'ServiceProviders'", "'end ServiceProviders'", "'end OrganizationalModel'", "'WorkItemNetworkModel'", "'WorkSources'", "'end WorkSources'", "'WorkItemNetworks'", "'end WorkItemNetworks'", "'end WorkItemNetworkModel'", "'ExperimentSettings'", "'end ExperimentSettings'", "'end ExperimentModel'", "'SystemLibraries'", "'EventTypes'", "'end EventTypes'", "'ConditionTypes'", "'end ConditionTypes'", "'GovernanceLibrary'", "'WIAcceptanceRuleTypes'", "'{'", "'}'", "'WISelectionRuleTypes'", "'WIAssignmentRuleTypes'", "'ResourceAllocationRuleTypes'", "'ResourceOutsourcingRuleTypes'", "'end GovernanceLibrary'", "'TaskLibrary'", "'ProcessModels'", "'end ProcessModels'", "'ValueFunctions'", "'end ValueFunctions'", "'end TaskLibrary'", "'end SystemLibraries'", "'UserLibraries'", "'WorkItemTypes'", "'end WorkItemTypes'", "'ClassOfServices'", "'end ClassOfServices'", "'Services'", "'end Services'", "'GovernanceStrategies'", "'end GovernanceStrategies'", "'end UserLibraries'", "'.'", "'Random.'", "'Normal'", "'Uniform'", "'Exponential'", "'['", "']'", "'EventType'", "'ConditionType'", "'WINReplicationSetting'", "'WorkItemNetwork'", "'NumReplications'", "'Indicators'", "'GovernanceStrategy'", "'Mechanisms'", "'WIAcceptance'", "'BackLogLimit'", "'WIPLimit'", "'WISelection'", "'WIAssignment'", "'ResourceAllocation'", "'ResourceOutsourcing'", "'RuleType'", "'Mechanism'", "'='", "'Attributes'", "'WorkSource'", "'AssignTo'", "'WorkItems'", "'WorkItem'", "'Type'", "'Predecessors'", "'Subtasks'", "'CausalTriggers'", "'RequiredServices'", "'Efforts'", "'Value'", "'ClassOfService'", "'ArrivalTime'", "'DueDate'", "'=>'", "'->'", "'AtProgress'", "'OnProbability'", "'WorkItemType'", "'ValueFunction'", "'ProcessModel'", "'Disruptive:'", "'TRUE'", "'FALSE'", "'Service'", "'ServiceProvider'", "'Group'", "'OutsourceFrom'", "'TeamService'", "'Resources'", "'Resource'", "'SkillSet'", "'Efficiency'"
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
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=8;
    public static final int RULE_STRING=5;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__118=118;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__103=103;
    public static final int T__59=59;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int RULE_INT=6;
    public static final int T__113=113;
    public static final int T__112=112;
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
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_DOUBLE=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalKanbanmodelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKanbanmodelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKanbanmodelParser.tokenNames; }
    public String getGrammarFileName() { return "../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g"; }



     	private KanbanmodelGrammarAccess grammarAccess;
     	
        public InternalKanbanmodelParser(TokenStream input, KanbanmodelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ModelBuilder";	
       	}
       	
       	@Override
       	protected KanbanmodelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModelBuilder"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:67:1: entryRuleModelBuilder returns [EObject current=null] : iv_ruleModelBuilder= ruleModelBuilder EOF ;
    public final EObject entryRuleModelBuilder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelBuilder = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:68:2: (iv_ruleModelBuilder= ruleModelBuilder EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:69:2: iv_ruleModelBuilder= ruleModelBuilder EOF
            {
             newCompositeNode(grammarAccess.getModelBuilderRule()); 
            pushFollow(FOLLOW_ruleModelBuilder_in_entryRuleModelBuilder75);
            iv_ruleModelBuilder=ruleModelBuilder();

            state._fsp--;

             current =iv_ruleModelBuilder; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelBuilder85); 

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
    // $ANTLR end "entryRuleModelBuilder"


    // $ANTLR start "ruleModelBuilder"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:76:1: ruleModelBuilder returns [EObject current=null] : (otherlv_0= 'ModelBuilder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Description' ( (lv_Description_3_0= RULE_STRING ) ) ( (lv_SystemLibraries_4_0= ruleSystemLibraries ) ) ( (lv_UserLibraries_5_0= ruleUserLibraries ) ) ( (lv_ExperimentModel_6_0= ruleExperimentModel ) ) ) ;
    public final EObject ruleModelBuilder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_Description_3_0=null;
        EObject lv_SystemLibraries_4_0 = null;

        EObject lv_UserLibraries_5_0 = null;

        EObject lv_ExperimentModel_6_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:79:28: ( (otherlv_0= 'ModelBuilder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Description' ( (lv_Description_3_0= RULE_STRING ) ) ( (lv_SystemLibraries_4_0= ruleSystemLibraries ) ) ( (lv_UserLibraries_5_0= ruleUserLibraries ) ) ( (lv_ExperimentModel_6_0= ruleExperimentModel ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:80:1: (otherlv_0= 'ModelBuilder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Description' ( (lv_Description_3_0= RULE_STRING ) ) ( (lv_SystemLibraries_4_0= ruleSystemLibraries ) ) ( (lv_UserLibraries_5_0= ruleUserLibraries ) ) ( (lv_ExperimentModel_6_0= ruleExperimentModel ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:80:1: (otherlv_0= 'ModelBuilder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Description' ( (lv_Description_3_0= RULE_STRING ) ) ( (lv_SystemLibraries_4_0= ruleSystemLibraries ) ) ( (lv_UserLibraries_5_0= ruleUserLibraries ) ) ( (lv_ExperimentModel_6_0= ruleExperimentModel ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:80:3: otherlv_0= 'ModelBuilder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Description' ( (lv_Description_3_0= RULE_STRING ) ) ( (lv_SystemLibraries_4_0= ruleSystemLibraries ) ) ( (lv_UserLibraries_5_0= ruleUserLibraries ) ) ( (lv_ExperimentModel_6_0= ruleExperimentModel ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleModelBuilder122); 

                	newLeafNode(otherlv_0, grammarAccess.getModelBuilderAccess().getModelBuilderKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:85:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModelBuilder139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getModelBuilderAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModelBuilderRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleModelBuilder156); 

                	newLeafNode(otherlv_2, grammarAccess.getModelBuilderAccess().getDescriptionKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:106:1: ( (lv_Description_3_0= RULE_STRING ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:107:1: (lv_Description_3_0= RULE_STRING )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:107:1: (lv_Description_3_0= RULE_STRING )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:108:3: lv_Description_3_0= RULE_STRING
            {
            lv_Description_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleModelBuilder173); 

            			newLeafNode(lv_Description_3_0, grammarAccess.getModelBuilderAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModelBuilderRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"Description",
                    		lv_Description_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:124:2: ( (lv_SystemLibraries_4_0= ruleSystemLibraries ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:125:1: (lv_SystemLibraries_4_0= ruleSystemLibraries )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:125:1: (lv_SystemLibraries_4_0= ruleSystemLibraries )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:126:3: lv_SystemLibraries_4_0= ruleSystemLibraries
            {
             
            	        newCompositeNode(grammarAccess.getModelBuilderAccess().getSystemLibrariesSystemLibrariesParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleSystemLibraries_in_ruleModelBuilder199);
            lv_SystemLibraries_4_0=ruleSystemLibraries();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelBuilderRule());
            	        }
                   		set(
                   			current, 
                   			"SystemLibraries",
                    		lv_SystemLibraries_4_0, 
                    		"SystemLibraries");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:142:2: ( (lv_UserLibraries_5_0= ruleUserLibraries ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:143:1: (lv_UserLibraries_5_0= ruleUserLibraries )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:143:1: (lv_UserLibraries_5_0= ruleUserLibraries )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:144:3: lv_UserLibraries_5_0= ruleUserLibraries
            {
             
            	        newCompositeNode(grammarAccess.getModelBuilderAccess().getUserLibrariesUserLibrariesParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleUserLibraries_in_ruleModelBuilder220);
            lv_UserLibraries_5_0=ruleUserLibraries();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelBuilderRule());
            	        }
                   		set(
                   			current, 
                   			"UserLibraries",
                    		lv_UserLibraries_5_0, 
                    		"UserLibraries");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:160:2: ( (lv_ExperimentModel_6_0= ruleExperimentModel ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:161:1: (lv_ExperimentModel_6_0= ruleExperimentModel )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:161:1: (lv_ExperimentModel_6_0= ruleExperimentModel )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:162:3: lv_ExperimentModel_6_0= ruleExperimentModel
            {
             
            	        newCompositeNode(grammarAccess.getModelBuilderAccess().getExperimentModelExperimentModelParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleExperimentModel_in_ruleModelBuilder241);
            lv_ExperimentModel_6_0=ruleExperimentModel();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelBuilderRule());
            	        }
                   		set(
                   			current, 
                   			"ExperimentModel",
                    		lv_ExperimentModel_6_0, 
                    		"ExperimentModel");
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
    // $ANTLR end "ruleModelBuilder"


    // $ANTLR start "entryRuleExperimentModel"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:186:1: entryRuleExperimentModel returns [EObject current=null] : iv_ruleExperimentModel= ruleExperimentModel EOF ;
    public final EObject entryRuleExperimentModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperimentModel = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:187:2: (iv_ruleExperimentModel= ruleExperimentModel EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:188:2: iv_ruleExperimentModel= ruleExperimentModel EOF
            {
             newCompositeNode(grammarAccess.getExperimentModelRule()); 
            pushFollow(FOLLOW_ruleExperimentModel_in_entryRuleExperimentModel277);
            iv_ruleExperimentModel=ruleExperimentModel();

            state._fsp--;

             current =iv_ruleExperimentModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExperimentModel287); 

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
    // $ANTLR end "entryRuleExperimentModel"


    // $ANTLR start "ruleExperimentModel"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:195:1: ruleExperimentModel returns [EObject current=null] : (otherlv_0= 'ExperimentModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Path' ( (lv_Path_3_0= ruleQualifiedName ) ) )? otherlv_4= 'OrganizationalModel' otherlv_5= 'ServiceProviders' ( (lv_ServiceProviders_6_0= ruleServiceProvider ) )+ otherlv_7= 'end ServiceProviders' otherlv_8= 'end OrganizationalModel' otherlv_9= 'WorkItemNetworkModel' otherlv_10= 'WorkSources' ( (lv_WorkSources_11_0= ruleWorkSource ) )+ otherlv_12= 'end WorkSources' otherlv_13= 'WorkItemNetworks' ( (lv_WorkItemNetworks_14_0= ruleWorkItemNetwork ) )+ otherlv_15= 'end WorkItemNetworks' otherlv_16= 'end WorkItemNetworkModel' otherlv_17= 'ExperimentSettings' ( (lv_WINReplicationSetting_18_0= ruleWINReplicationSetting ) ) ( (lv_Indicators_19_0= ruleIndicators ) ) otherlv_20= 'end ExperimentSettings' otherlv_21= 'end ExperimentModel' ) ;
    public final EObject ruleExperimentModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_Path_3_0 = null;

        EObject lv_ServiceProviders_6_0 = null;

        EObject lv_WorkSources_11_0 = null;

        EObject lv_WorkItemNetworks_14_0 = null;

        EObject lv_WINReplicationSetting_18_0 = null;

        EObject lv_Indicators_19_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:198:28: ( (otherlv_0= 'ExperimentModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Path' ( (lv_Path_3_0= ruleQualifiedName ) ) )? otherlv_4= 'OrganizationalModel' otherlv_5= 'ServiceProviders' ( (lv_ServiceProviders_6_0= ruleServiceProvider ) )+ otherlv_7= 'end ServiceProviders' otherlv_8= 'end OrganizationalModel' otherlv_9= 'WorkItemNetworkModel' otherlv_10= 'WorkSources' ( (lv_WorkSources_11_0= ruleWorkSource ) )+ otherlv_12= 'end WorkSources' otherlv_13= 'WorkItemNetworks' ( (lv_WorkItemNetworks_14_0= ruleWorkItemNetwork ) )+ otherlv_15= 'end WorkItemNetworks' otherlv_16= 'end WorkItemNetworkModel' otherlv_17= 'ExperimentSettings' ( (lv_WINReplicationSetting_18_0= ruleWINReplicationSetting ) ) ( (lv_Indicators_19_0= ruleIndicators ) ) otherlv_20= 'end ExperimentSettings' otherlv_21= 'end ExperimentModel' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:199:1: (otherlv_0= 'ExperimentModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Path' ( (lv_Path_3_0= ruleQualifiedName ) ) )? otherlv_4= 'OrganizationalModel' otherlv_5= 'ServiceProviders' ( (lv_ServiceProviders_6_0= ruleServiceProvider ) )+ otherlv_7= 'end ServiceProviders' otherlv_8= 'end OrganizationalModel' otherlv_9= 'WorkItemNetworkModel' otherlv_10= 'WorkSources' ( (lv_WorkSources_11_0= ruleWorkSource ) )+ otherlv_12= 'end WorkSources' otherlv_13= 'WorkItemNetworks' ( (lv_WorkItemNetworks_14_0= ruleWorkItemNetwork ) )+ otherlv_15= 'end WorkItemNetworks' otherlv_16= 'end WorkItemNetworkModel' otherlv_17= 'ExperimentSettings' ( (lv_WINReplicationSetting_18_0= ruleWINReplicationSetting ) ) ( (lv_Indicators_19_0= ruleIndicators ) ) otherlv_20= 'end ExperimentSettings' otherlv_21= 'end ExperimentModel' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:199:1: (otherlv_0= 'ExperimentModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Path' ( (lv_Path_3_0= ruleQualifiedName ) ) )? otherlv_4= 'OrganizationalModel' otherlv_5= 'ServiceProviders' ( (lv_ServiceProviders_6_0= ruleServiceProvider ) )+ otherlv_7= 'end ServiceProviders' otherlv_8= 'end OrganizationalModel' otherlv_9= 'WorkItemNetworkModel' otherlv_10= 'WorkSources' ( (lv_WorkSources_11_0= ruleWorkSource ) )+ otherlv_12= 'end WorkSources' otherlv_13= 'WorkItemNetworks' ( (lv_WorkItemNetworks_14_0= ruleWorkItemNetwork ) )+ otherlv_15= 'end WorkItemNetworks' otherlv_16= 'end WorkItemNetworkModel' otherlv_17= 'ExperimentSettings' ( (lv_WINReplicationSetting_18_0= ruleWINReplicationSetting ) ) ( (lv_Indicators_19_0= ruleIndicators ) ) otherlv_20= 'end ExperimentSettings' otherlv_21= 'end ExperimentModel' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:199:3: otherlv_0= 'ExperimentModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Path' ( (lv_Path_3_0= ruleQualifiedName ) ) )? otherlv_4= 'OrganizationalModel' otherlv_5= 'ServiceProviders' ( (lv_ServiceProviders_6_0= ruleServiceProvider ) )+ otherlv_7= 'end ServiceProviders' otherlv_8= 'end OrganizationalModel' otherlv_9= 'WorkItemNetworkModel' otherlv_10= 'WorkSources' ( (lv_WorkSources_11_0= ruleWorkSource ) )+ otherlv_12= 'end WorkSources' otherlv_13= 'WorkItemNetworks' ( (lv_WorkItemNetworks_14_0= ruleWorkItemNetwork ) )+ otherlv_15= 'end WorkItemNetworks' otherlv_16= 'end WorkItemNetworkModel' otherlv_17= 'ExperimentSettings' ( (lv_WINReplicationSetting_18_0= ruleWINReplicationSetting ) ) ( (lv_Indicators_19_0= ruleIndicators ) ) otherlv_20= 'end ExperimentSettings' otherlv_21= 'end ExperimentModel'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleExperimentModel324); 

                	newLeafNode(otherlv_0, grammarAccess.getExperimentModelAccess().getExperimentModelKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:203:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:204:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:204:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:205:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExperimentModel341); 

            			newLeafNode(lv_name_1_0, grammarAccess.getExperimentModelAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExperimentModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:221:2: (otherlv_2= 'Path' ( (lv_Path_3_0= ruleQualifiedName ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:221:4: otherlv_2= 'Path' ( (lv_Path_3_0= ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleExperimentModel359); 

                        	newLeafNode(otherlv_2, grammarAccess.getExperimentModelAccess().getPathKeyword_2_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:225:1: ( (lv_Path_3_0= ruleQualifiedName ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:226:1: (lv_Path_3_0= ruleQualifiedName )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:226:1: (lv_Path_3_0= ruleQualifiedName )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:227:3: lv_Path_3_0= ruleQualifiedName
                    {
                     
                    	        newCompositeNode(grammarAccess.getExperimentModelAccess().getPathQualifiedNameParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleExperimentModel380);
                    lv_Path_3_0=ruleQualifiedName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExperimentModelRule());
                    	        }
                           		set(
                           			current, 
                           			"Path",
                            		lv_Path_3_0, 
                            		"QualifiedName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleExperimentModel394); 

                	newLeafNode(otherlv_4, grammarAccess.getExperimentModelAccess().getOrganizationalModelKeyword_3());
                
            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleExperimentModel406); 

                	newLeafNode(otherlv_5, grammarAccess.getExperimentModelAccess().getServiceProvidersKeyword_4());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:251:1: ( (lv_ServiceProviders_6_0= ruleServiceProvider ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_INT||(LA2_0>=111 && LA2_0<=112)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:252:1: (lv_ServiceProviders_6_0= ruleServiceProvider )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:252:1: (lv_ServiceProviders_6_0= ruleServiceProvider )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:253:3: lv_ServiceProviders_6_0= ruleServiceProvider
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentModelAccess().getServiceProvidersServiceProviderParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleServiceProvider_in_ruleExperimentModel427);
            	    lv_ServiceProviders_6_0=ruleServiceProvider();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExperimentModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ServiceProviders",
            	            		lv_ServiceProviders_6_0, 
            	            		"ServiceProvider");
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

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleExperimentModel440); 

                	newLeafNode(otherlv_7, grammarAccess.getExperimentModelAccess().getEndServiceProvidersKeyword_6());
                
            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleExperimentModel452); 

                	newLeafNode(otherlv_8, grammarAccess.getExperimentModelAccess().getEndOrganizationalModelKeyword_7());
                
            otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleExperimentModel464); 

                	newLeafNode(otherlv_9, grammarAccess.getExperimentModelAccess().getWorkItemNetworkModelKeyword_8());
                
            otherlv_10=(Token)match(input,21,FOLLOW_21_in_ruleExperimentModel476); 

                	newLeafNode(otherlv_10, grammarAccess.getExperimentModelAccess().getWorkSourcesKeyword_9());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:285:1: ( (lv_WorkSources_11_0= ruleWorkSource ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_INT||LA3_0==86) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:286:1: (lv_WorkSources_11_0= ruleWorkSource )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:286:1: (lv_WorkSources_11_0= ruleWorkSource )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:287:3: lv_WorkSources_11_0= ruleWorkSource
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentModelAccess().getWorkSourcesWorkSourceParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWorkSource_in_ruleExperimentModel497);
            	    lv_WorkSources_11_0=ruleWorkSource();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExperimentModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"WorkSources",
            	            		lv_WorkSources_11_0, 
            	            		"WorkSource");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_12=(Token)match(input,22,FOLLOW_22_in_ruleExperimentModel510); 

                	newLeafNode(otherlv_12, grammarAccess.getExperimentModelAccess().getEndWorkSourcesKeyword_11());
                
            otherlv_13=(Token)match(input,23,FOLLOW_23_in_ruleExperimentModel522); 

                	newLeafNode(otherlv_13, grammarAccess.getExperimentModelAccess().getWorkItemNetworksKeyword_12());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:311:1: ( (lv_WorkItemNetworks_14_0= ruleWorkItemNetwork ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_INT||LA4_0==70) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:312:1: (lv_WorkItemNetworks_14_0= ruleWorkItemNetwork )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:312:1: (lv_WorkItemNetworks_14_0= ruleWorkItemNetwork )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:313:3: lv_WorkItemNetworks_14_0= ruleWorkItemNetwork
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExperimentModelAccess().getWorkItemNetworksWorkItemNetworkParserRuleCall_13_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWorkItemNetwork_in_ruleExperimentModel543);
            	    lv_WorkItemNetworks_14_0=ruleWorkItemNetwork();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExperimentModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"WorkItemNetworks",
            	            		lv_WorkItemNetworks_14_0, 
            	            		"WorkItemNetwork");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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

            otherlv_15=(Token)match(input,24,FOLLOW_24_in_ruleExperimentModel556); 

                	newLeafNode(otherlv_15, grammarAccess.getExperimentModelAccess().getEndWorkItemNetworksKeyword_14());
                
            otherlv_16=(Token)match(input,25,FOLLOW_25_in_ruleExperimentModel568); 

                	newLeafNode(otherlv_16, grammarAccess.getExperimentModelAccess().getEndWorkItemNetworkModelKeyword_15());
                
            otherlv_17=(Token)match(input,26,FOLLOW_26_in_ruleExperimentModel580); 

                	newLeafNode(otherlv_17, grammarAccess.getExperimentModelAccess().getExperimentSettingsKeyword_16());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:341:1: ( (lv_WINReplicationSetting_18_0= ruleWINReplicationSetting ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:342:1: (lv_WINReplicationSetting_18_0= ruleWINReplicationSetting )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:342:1: (lv_WINReplicationSetting_18_0= ruleWINReplicationSetting )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:343:3: lv_WINReplicationSetting_18_0= ruleWINReplicationSetting
            {
             
            	        newCompositeNode(grammarAccess.getExperimentModelAccess().getWINReplicationSettingWINReplicationSettingParserRuleCall_17_0()); 
            	    
            pushFollow(FOLLOW_ruleWINReplicationSetting_in_ruleExperimentModel601);
            lv_WINReplicationSetting_18_0=ruleWINReplicationSetting();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExperimentModelRule());
            	        }
                   		set(
                   			current, 
                   			"WINReplicationSetting",
                    		lv_WINReplicationSetting_18_0, 
                    		"WINReplicationSetting");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:359:2: ( (lv_Indicators_19_0= ruleIndicators ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:360:1: (lv_Indicators_19_0= ruleIndicators )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:360:1: (lv_Indicators_19_0= ruleIndicators )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:361:3: lv_Indicators_19_0= ruleIndicators
            {
             
            	        newCompositeNode(grammarAccess.getExperimentModelAccess().getIndicatorsIndicatorsParserRuleCall_18_0()); 
            	    
            pushFollow(FOLLOW_ruleIndicators_in_ruleExperimentModel622);
            lv_Indicators_19_0=ruleIndicators();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExperimentModelRule());
            	        }
                   		set(
                   			current, 
                   			"Indicators",
                    		lv_Indicators_19_0, 
                    		"Indicators");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_20=(Token)match(input,27,FOLLOW_27_in_ruleExperimentModel634); 

                	newLeafNode(otherlv_20, grammarAccess.getExperimentModelAccess().getEndExperimentSettingsKeyword_19());
                
            otherlv_21=(Token)match(input,28,FOLLOW_28_in_ruleExperimentModel646); 

                	newLeafNode(otherlv_21, grammarAccess.getExperimentModelAccess().getEndExperimentModelKeyword_20());
                

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
    // $ANTLR end "ruleExperimentModel"


    // $ANTLR start "entryRuleSystemLibraries"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:393:1: entryRuleSystemLibraries returns [EObject current=null] : iv_ruleSystemLibraries= ruleSystemLibraries EOF ;
    public final EObject entryRuleSystemLibraries() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemLibraries = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:394:2: (iv_ruleSystemLibraries= ruleSystemLibraries EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:395:2: iv_ruleSystemLibraries= ruleSystemLibraries EOF
            {
             newCompositeNode(grammarAccess.getSystemLibrariesRule()); 
            pushFollow(FOLLOW_ruleSystemLibraries_in_entryRuleSystemLibraries682);
            iv_ruleSystemLibraries=ruleSystemLibraries();

            state._fsp--;

             current =iv_ruleSystemLibraries; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystemLibraries692); 

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
    // $ANTLR end "entryRuleSystemLibraries"


    // $ANTLR start "ruleSystemLibraries"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:402:1: ruleSystemLibraries returns [EObject current=null] : (otherlv_0= 'SystemLibraries' otherlv_1= 'EventTypes' ( (lv_EventTypes_2_0= ruleEventType ) )+ otherlv_3= 'end EventTypes' otherlv_4= 'ConditionTypes' ( (lv_ConditionTypes_5_0= ruleConditionType ) )+ otherlv_6= 'end ConditionTypes' otherlv_7= 'GovernanceLibrary' otherlv_8= 'WIAcceptanceRuleTypes' otherlv_9= '{' ( (lv_WIAcceptanceRuleTypes_10_0= ruleWIAcceptanceRuleType ) )+ otherlv_11= '}' otherlv_12= 'WISelectionRuleTypes' otherlv_13= '{' ( (lv_WISelectionRuleTypes_14_0= ruleWISelectionRuleType ) )+ otherlv_15= '}' otherlv_16= 'WIAssignmentRuleTypes' otherlv_17= '{' ( (lv_WIAssignmentRuleTypes_18_0= ruleWIAssignmentRuleType ) )+ otherlv_19= '}' otherlv_20= 'ResourceAllocationRuleTypes' otherlv_21= '{' ( (lv_ResourceAllocationRuleTypes_22_0= ruleResourceAllocationRuleType ) )+ otherlv_23= '}' otherlv_24= 'ResourceOutsourcingRuleTypes' otherlv_25= '{' ( (lv_ResourceOutsourcingRuleTypes_26_0= ruleResourceOutsourcingRuleType ) )+ otherlv_27= '}' otherlv_28= 'end GovernanceLibrary' otherlv_29= 'TaskLibrary' otherlv_30= 'ProcessModels' ( (lv_ProcessModels_31_0= ruleProcessModel ) )+ otherlv_32= 'end ProcessModels' otherlv_33= 'ValueFunctions' ( (lv_ValueFunctions_34_0= ruleValueFunction ) )+ otherlv_35= 'end ValueFunctions' otherlv_36= 'end TaskLibrary' otherlv_37= 'end SystemLibraries' ) ;
    public final EObject ruleSystemLibraries() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        EObject lv_EventTypes_2_0 = null;

        EObject lv_ConditionTypes_5_0 = null;

        EObject lv_WIAcceptanceRuleTypes_10_0 = null;

        EObject lv_WISelectionRuleTypes_14_0 = null;

        EObject lv_WIAssignmentRuleTypes_18_0 = null;

        EObject lv_ResourceAllocationRuleTypes_22_0 = null;

        EObject lv_ResourceOutsourcingRuleTypes_26_0 = null;

        EObject lv_ProcessModels_31_0 = null;

        EObject lv_ValueFunctions_34_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:405:28: ( (otherlv_0= 'SystemLibraries' otherlv_1= 'EventTypes' ( (lv_EventTypes_2_0= ruleEventType ) )+ otherlv_3= 'end EventTypes' otherlv_4= 'ConditionTypes' ( (lv_ConditionTypes_5_0= ruleConditionType ) )+ otherlv_6= 'end ConditionTypes' otherlv_7= 'GovernanceLibrary' otherlv_8= 'WIAcceptanceRuleTypes' otherlv_9= '{' ( (lv_WIAcceptanceRuleTypes_10_0= ruleWIAcceptanceRuleType ) )+ otherlv_11= '}' otherlv_12= 'WISelectionRuleTypes' otherlv_13= '{' ( (lv_WISelectionRuleTypes_14_0= ruleWISelectionRuleType ) )+ otherlv_15= '}' otherlv_16= 'WIAssignmentRuleTypes' otherlv_17= '{' ( (lv_WIAssignmentRuleTypes_18_0= ruleWIAssignmentRuleType ) )+ otherlv_19= '}' otherlv_20= 'ResourceAllocationRuleTypes' otherlv_21= '{' ( (lv_ResourceAllocationRuleTypes_22_0= ruleResourceAllocationRuleType ) )+ otherlv_23= '}' otherlv_24= 'ResourceOutsourcingRuleTypes' otherlv_25= '{' ( (lv_ResourceOutsourcingRuleTypes_26_0= ruleResourceOutsourcingRuleType ) )+ otherlv_27= '}' otherlv_28= 'end GovernanceLibrary' otherlv_29= 'TaskLibrary' otherlv_30= 'ProcessModels' ( (lv_ProcessModels_31_0= ruleProcessModel ) )+ otherlv_32= 'end ProcessModels' otherlv_33= 'ValueFunctions' ( (lv_ValueFunctions_34_0= ruleValueFunction ) )+ otherlv_35= 'end ValueFunctions' otherlv_36= 'end TaskLibrary' otherlv_37= 'end SystemLibraries' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:406:1: (otherlv_0= 'SystemLibraries' otherlv_1= 'EventTypes' ( (lv_EventTypes_2_0= ruleEventType ) )+ otherlv_3= 'end EventTypes' otherlv_4= 'ConditionTypes' ( (lv_ConditionTypes_5_0= ruleConditionType ) )+ otherlv_6= 'end ConditionTypes' otherlv_7= 'GovernanceLibrary' otherlv_8= 'WIAcceptanceRuleTypes' otherlv_9= '{' ( (lv_WIAcceptanceRuleTypes_10_0= ruleWIAcceptanceRuleType ) )+ otherlv_11= '}' otherlv_12= 'WISelectionRuleTypes' otherlv_13= '{' ( (lv_WISelectionRuleTypes_14_0= ruleWISelectionRuleType ) )+ otherlv_15= '}' otherlv_16= 'WIAssignmentRuleTypes' otherlv_17= '{' ( (lv_WIAssignmentRuleTypes_18_0= ruleWIAssignmentRuleType ) )+ otherlv_19= '}' otherlv_20= 'ResourceAllocationRuleTypes' otherlv_21= '{' ( (lv_ResourceAllocationRuleTypes_22_0= ruleResourceAllocationRuleType ) )+ otherlv_23= '}' otherlv_24= 'ResourceOutsourcingRuleTypes' otherlv_25= '{' ( (lv_ResourceOutsourcingRuleTypes_26_0= ruleResourceOutsourcingRuleType ) )+ otherlv_27= '}' otherlv_28= 'end GovernanceLibrary' otherlv_29= 'TaskLibrary' otherlv_30= 'ProcessModels' ( (lv_ProcessModels_31_0= ruleProcessModel ) )+ otherlv_32= 'end ProcessModels' otherlv_33= 'ValueFunctions' ( (lv_ValueFunctions_34_0= ruleValueFunction ) )+ otherlv_35= 'end ValueFunctions' otherlv_36= 'end TaskLibrary' otherlv_37= 'end SystemLibraries' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:406:1: (otherlv_0= 'SystemLibraries' otherlv_1= 'EventTypes' ( (lv_EventTypes_2_0= ruleEventType ) )+ otherlv_3= 'end EventTypes' otherlv_4= 'ConditionTypes' ( (lv_ConditionTypes_5_0= ruleConditionType ) )+ otherlv_6= 'end ConditionTypes' otherlv_7= 'GovernanceLibrary' otherlv_8= 'WIAcceptanceRuleTypes' otherlv_9= '{' ( (lv_WIAcceptanceRuleTypes_10_0= ruleWIAcceptanceRuleType ) )+ otherlv_11= '}' otherlv_12= 'WISelectionRuleTypes' otherlv_13= '{' ( (lv_WISelectionRuleTypes_14_0= ruleWISelectionRuleType ) )+ otherlv_15= '}' otherlv_16= 'WIAssignmentRuleTypes' otherlv_17= '{' ( (lv_WIAssignmentRuleTypes_18_0= ruleWIAssignmentRuleType ) )+ otherlv_19= '}' otherlv_20= 'ResourceAllocationRuleTypes' otherlv_21= '{' ( (lv_ResourceAllocationRuleTypes_22_0= ruleResourceAllocationRuleType ) )+ otherlv_23= '}' otherlv_24= 'ResourceOutsourcingRuleTypes' otherlv_25= '{' ( (lv_ResourceOutsourcingRuleTypes_26_0= ruleResourceOutsourcingRuleType ) )+ otherlv_27= '}' otherlv_28= 'end GovernanceLibrary' otherlv_29= 'TaskLibrary' otherlv_30= 'ProcessModels' ( (lv_ProcessModels_31_0= ruleProcessModel ) )+ otherlv_32= 'end ProcessModels' otherlv_33= 'ValueFunctions' ( (lv_ValueFunctions_34_0= ruleValueFunction ) )+ otherlv_35= 'end ValueFunctions' otherlv_36= 'end TaskLibrary' otherlv_37= 'end SystemLibraries' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:406:3: otherlv_0= 'SystemLibraries' otherlv_1= 'EventTypes' ( (lv_EventTypes_2_0= ruleEventType ) )+ otherlv_3= 'end EventTypes' otherlv_4= 'ConditionTypes' ( (lv_ConditionTypes_5_0= ruleConditionType ) )+ otherlv_6= 'end ConditionTypes' otherlv_7= 'GovernanceLibrary' otherlv_8= 'WIAcceptanceRuleTypes' otherlv_9= '{' ( (lv_WIAcceptanceRuleTypes_10_0= ruleWIAcceptanceRuleType ) )+ otherlv_11= '}' otherlv_12= 'WISelectionRuleTypes' otherlv_13= '{' ( (lv_WISelectionRuleTypes_14_0= ruleWISelectionRuleType ) )+ otherlv_15= '}' otherlv_16= 'WIAssignmentRuleTypes' otherlv_17= '{' ( (lv_WIAssignmentRuleTypes_18_0= ruleWIAssignmentRuleType ) )+ otherlv_19= '}' otherlv_20= 'ResourceAllocationRuleTypes' otherlv_21= '{' ( (lv_ResourceAllocationRuleTypes_22_0= ruleResourceAllocationRuleType ) )+ otherlv_23= '}' otherlv_24= 'ResourceOutsourcingRuleTypes' otherlv_25= '{' ( (lv_ResourceOutsourcingRuleTypes_26_0= ruleResourceOutsourcingRuleType ) )+ otherlv_27= '}' otherlv_28= 'end GovernanceLibrary' otherlv_29= 'TaskLibrary' otherlv_30= 'ProcessModels' ( (lv_ProcessModels_31_0= ruleProcessModel ) )+ otherlv_32= 'end ProcessModels' otherlv_33= 'ValueFunctions' ( (lv_ValueFunctions_34_0= ruleValueFunction ) )+ otherlv_35= 'end ValueFunctions' otherlv_36= 'end TaskLibrary' otherlv_37= 'end SystemLibraries'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleSystemLibraries729); 

                	newLeafNode(otherlv_0, grammarAccess.getSystemLibrariesAccess().getSystemLibrariesKeyword_0());
                
            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleSystemLibraries741); 

                	newLeafNode(otherlv_1, grammarAccess.getSystemLibrariesAccess().getEventTypesKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:414:1: ( (lv_EventTypes_2_0= ruleEventType ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==67) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:415:1: (lv_EventTypes_2_0= ruleEventType )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:415:1: (lv_EventTypes_2_0= ruleEventType )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:416:3: lv_EventTypes_2_0= ruleEventType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSystemLibrariesAccess().getEventTypesEventTypeParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEventType_in_ruleSystemLibraries762);
            	    lv_EventTypes_2_0=ruleEventType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSystemLibrariesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"EventTypes",
            	            		lv_EventTypes_2_0, 
            	            		"EventType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleSystemLibraries775); 

                	newLeafNode(otherlv_3, grammarAccess.getSystemLibrariesAccess().getEndEventTypesKeyword_3());
                
            otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleSystemLibraries787); 

                	newLeafNode(otherlv_4, grammarAccess.getSystemLibrariesAccess().getConditionTypesKeyword_4());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:440:1: ( (lv_ConditionTypes_5_0= ruleConditionType ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==68) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:441:1: (lv_ConditionTypes_5_0= ruleConditionType )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:441:1: (lv_ConditionTypes_5_0= ruleConditionType )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:442:3: lv_ConditionTypes_5_0= ruleConditionType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSystemLibrariesAccess().getConditionTypesConditionTypeParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConditionType_in_ruleSystemLibraries808);
            	    lv_ConditionTypes_5_0=ruleConditionType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSystemLibrariesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ConditionTypes",
            	            		lv_ConditionTypes_5_0, 
            	            		"ConditionType");
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

            otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleSystemLibraries821); 

                	newLeafNode(otherlv_6, grammarAccess.getSystemLibrariesAccess().getEndConditionTypesKeyword_6());
                
            otherlv_7=(Token)match(input,34,FOLLOW_34_in_ruleSystemLibraries833); 

                	newLeafNode(otherlv_7, grammarAccess.getSystemLibrariesAccess().getGovernanceLibraryKeyword_7());
                
            otherlv_8=(Token)match(input,35,FOLLOW_35_in_ruleSystemLibraries845); 

                	newLeafNode(otherlv_8, grammarAccess.getSystemLibrariesAccess().getWIAcceptanceRuleTypesKeyword_8());
                
            otherlv_9=(Token)match(input,36,FOLLOW_36_in_ruleSystemLibraries857); 

                	newLeafNode(otherlv_9, grammarAccess.getSystemLibrariesAccess().getLeftCurlyBracketKeyword_9());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:474:1: ( (lv_WIAcceptanceRuleTypes_10_0= ruleWIAcceptanceRuleType ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==82) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:475:1: (lv_WIAcceptanceRuleTypes_10_0= ruleWIAcceptanceRuleType )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:475:1: (lv_WIAcceptanceRuleTypes_10_0= ruleWIAcceptanceRuleType )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:476:3: lv_WIAcceptanceRuleTypes_10_0= ruleWIAcceptanceRuleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSystemLibrariesAccess().getWIAcceptanceRuleTypesWIAcceptanceRuleTypeParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWIAcceptanceRuleType_in_ruleSystemLibraries878);
            	    lv_WIAcceptanceRuleTypes_10_0=ruleWIAcceptanceRuleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSystemLibrariesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"WIAcceptanceRuleTypes",
            	            		lv_WIAcceptanceRuleTypes_10_0, 
            	            		"WIAcceptanceRuleType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_11=(Token)match(input,37,FOLLOW_37_in_ruleSystemLibraries891); 

                	newLeafNode(otherlv_11, grammarAccess.getSystemLibrariesAccess().getRightCurlyBracketKeyword_11());
                
            otherlv_12=(Token)match(input,38,FOLLOW_38_in_ruleSystemLibraries903); 

                	newLeafNode(otherlv_12, grammarAccess.getSystemLibrariesAccess().getWISelectionRuleTypesKeyword_12());
                
            otherlv_13=(Token)match(input,36,FOLLOW_36_in_ruleSystemLibraries915); 

                	newLeafNode(otherlv_13, grammarAccess.getSystemLibrariesAccess().getLeftCurlyBracketKeyword_13());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:504:1: ( (lv_WISelectionRuleTypes_14_0= ruleWISelectionRuleType ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==82) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:505:1: (lv_WISelectionRuleTypes_14_0= ruleWISelectionRuleType )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:505:1: (lv_WISelectionRuleTypes_14_0= ruleWISelectionRuleType )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:506:3: lv_WISelectionRuleTypes_14_0= ruleWISelectionRuleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSystemLibrariesAccess().getWISelectionRuleTypesWISelectionRuleTypeParserRuleCall_14_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWISelectionRuleType_in_ruleSystemLibraries936);
            	    lv_WISelectionRuleTypes_14_0=ruleWISelectionRuleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSystemLibrariesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"WISelectionRuleTypes",
            	            		lv_WISelectionRuleTypes_14_0, 
            	            		"WISelectionRuleType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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

            otherlv_15=(Token)match(input,37,FOLLOW_37_in_ruleSystemLibraries949); 

                	newLeafNode(otherlv_15, grammarAccess.getSystemLibrariesAccess().getRightCurlyBracketKeyword_15());
                
            otherlv_16=(Token)match(input,39,FOLLOW_39_in_ruleSystemLibraries961); 

                	newLeafNode(otherlv_16, grammarAccess.getSystemLibrariesAccess().getWIAssignmentRuleTypesKeyword_16());
                
            otherlv_17=(Token)match(input,36,FOLLOW_36_in_ruleSystemLibraries973); 

                	newLeafNode(otherlv_17, grammarAccess.getSystemLibrariesAccess().getLeftCurlyBracketKeyword_17());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:534:1: ( (lv_WIAssignmentRuleTypes_18_0= ruleWIAssignmentRuleType ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==82) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:535:1: (lv_WIAssignmentRuleTypes_18_0= ruleWIAssignmentRuleType )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:535:1: (lv_WIAssignmentRuleTypes_18_0= ruleWIAssignmentRuleType )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:536:3: lv_WIAssignmentRuleTypes_18_0= ruleWIAssignmentRuleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSystemLibrariesAccess().getWIAssignmentRuleTypesWIAssignmentRuleTypeParserRuleCall_18_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWIAssignmentRuleType_in_ruleSystemLibraries994);
            	    lv_WIAssignmentRuleTypes_18_0=ruleWIAssignmentRuleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSystemLibrariesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"WIAssignmentRuleTypes",
            	            		lv_WIAssignmentRuleTypes_18_0, 
            	            		"WIAssignmentRuleType");
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

            otherlv_19=(Token)match(input,37,FOLLOW_37_in_ruleSystemLibraries1007); 

                	newLeafNode(otherlv_19, grammarAccess.getSystemLibrariesAccess().getRightCurlyBracketKeyword_19());
                
            otherlv_20=(Token)match(input,40,FOLLOW_40_in_ruleSystemLibraries1019); 

                	newLeafNode(otherlv_20, grammarAccess.getSystemLibrariesAccess().getResourceAllocationRuleTypesKeyword_20());
                
            otherlv_21=(Token)match(input,36,FOLLOW_36_in_ruleSystemLibraries1031); 

                	newLeafNode(otherlv_21, grammarAccess.getSystemLibrariesAccess().getLeftCurlyBracketKeyword_21());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:564:1: ( (lv_ResourceAllocationRuleTypes_22_0= ruleResourceAllocationRuleType ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==82) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:565:1: (lv_ResourceAllocationRuleTypes_22_0= ruleResourceAllocationRuleType )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:565:1: (lv_ResourceAllocationRuleTypes_22_0= ruleResourceAllocationRuleType )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:566:3: lv_ResourceAllocationRuleTypes_22_0= ruleResourceAllocationRuleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSystemLibrariesAccess().getResourceAllocationRuleTypesResourceAllocationRuleTypeParserRuleCall_22_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleResourceAllocationRuleType_in_ruleSystemLibraries1052);
            	    lv_ResourceAllocationRuleTypes_22_0=ruleResourceAllocationRuleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSystemLibrariesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ResourceAllocationRuleTypes",
            	            		lv_ResourceAllocationRuleTypes_22_0, 
            	            		"ResourceAllocationRuleType");
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

            otherlv_23=(Token)match(input,37,FOLLOW_37_in_ruleSystemLibraries1065); 

                	newLeafNode(otherlv_23, grammarAccess.getSystemLibrariesAccess().getRightCurlyBracketKeyword_23());
                
            otherlv_24=(Token)match(input,41,FOLLOW_41_in_ruleSystemLibraries1077); 

                	newLeafNode(otherlv_24, grammarAccess.getSystemLibrariesAccess().getResourceOutsourcingRuleTypesKeyword_24());
                
            otherlv_25=(Token)match(input,36,FOLLOW_36_in_ruleSystemLibraries1089); 

                	newLeafNode(otherlv_25, grammarAccess.getSystemLibrariesAccess().getLeftCurlyBracketKeyword_25());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:594:1: ( (lv_ResourceOutsourcingRuleTypes_26_0= ruleResourceOutsourcingRuleType ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==82) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:595:1: (lv_ResourceOutsourcingRuleTypes_26_0= ruleResourceOutsourcingRuleType )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:595:1: (lv_ResourceOutsourcingRuleTypes_26_0= ruleResourceOutsourcingRuleType )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:596:3: lv_ResourceOutsourcingRuleTypes_26_0= ruleResourceOutsourcingRuleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSystemLibrariesAccess().getResourceOutsourcingRuleTypesResourceOutsourcingRuleTypeParserRuleCall_26_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleResourceOutsourcingRuleType_in_ruleSystemLibraries1110);
            	    lv_ResourceOutsourcingRuleTypes_26_0=ruleResourceOutsourcingRuleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSystemLibrariesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ResourceOutsourcingRuleTypes",
            	            		lv_ResourceOutsourcingRuleTypes_26_0, 
            	            		"ResourceOutsourcingRuleType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            otherlv_27=(Token)match(input,37,FOLLOW_37_in_ruleSystemLibraries1123); 

                	newLeafNode(otherlv_27, grammarAccess.getSystemLibrariesAccess().getRightCurlyBracketKeyword_27());
                
            otherlv_28=(Token)match(input,42,FOLLOW_42_in_ruleSystemLibraries1135); 

                	newLeafNode(otherlv_28, grammarAccess.getSystemLibrariesAccess().getEndGovernanceLibraryKeyword_28());
                
            otherlv_29=(Token)match(input,43,FOLLOW_43_in_ruleSystemLibraries1147); 

                	newLeafNode(otherlv_29, grammarAccess.getSystemLibrariesAccess().getTaskLibraryKeyword_29());
                
            otherlv_30=(Token)match(input,44,FOLLOW_44_in_ruleSystemLibraries1159); 

                	newLeafNode(otherlv_30, grammarAccess.getSystemLibrariesAccess().getProcessModelsKeyword_30());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:628:1: ( (lv_ProcessModels_31_0= ruleProcessModel ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==106) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:629:1: (lv_ProcessModels_31_0= ruleProcessModel )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:629:1: (lv_ProcessModels_31_0= ruleProcessModel )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:630:3: lv_ProcessModels_31_0= ruleProcessModel
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSystemLibrariesAccess().getProcessModelsProcessModelParserRuleCall_31_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProcessModel_in_ruleSystemLibraries1180);
            	    lv_ProcessModels_31_0=ruleProcessModel();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSystemLibrariesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ProcessModels",
            	            		lv_ProcessModels_31_0, 
            	            		"ProcessModel");
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

            otherlv_32=(Token)match(input,45,FOLLOW_45_in_ruleSystemLibraries1193); 

                	newLeafNode(otherlv_32, grammarAccess.getSystemLibrariesAccess().getEndProcessModelsKeyword_32());
                
            otherlv_33=(Token)match(input,46,FOLLOW_46_in_ruleSystemLibraries1205); 

                	newLeafNode(otherlv_33, grammarAccess.getSystemLibrariesAccess().getValueFunctionsKeyword_33());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:654:1: ( (lv_ValueFunctions_34_0= ruleValueFunction ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==105) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:655:1: (lv_ValueFunctions_34_0= ruleValueFunction )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:655:1: (lv_ValueFunctions_34_0= ruleValueFunction )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:656:3: lv_ValueFunctions_34_0= ruleValueFunction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSystemLibrariesAccess().getValueFunctionsValueFunctionParserRuleCall_34_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueFunction_in_ruleSystemLibraries1226);
            	    lv_ValueFunctions_34_0=ruleValueFunction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSystemLibrariesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ValueFunctions",
            	            		lv_ValueFunctions_34_0, 
            	            		"ValueFunction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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

            otherlv_35=(Token)match(input,47,FOLLOW_47_in_ruleSystemLibraries1239); 

                	newLeafNode(otherlv_35, grammarAccess.getSystemLibrariesAccess().getEndValueFunctionsKeyword_35());
                
            otherlv_36=(Token)match(input,48,FOLLOW_48_in_ruleSystemLibraries1251); 

                	newLeafNode(otherlv_36, grammarAccess.getSystemLibrariesAccess().getEndTaskLibraryKeyword_36());
                
            otherlv_37=(Token)match(input,49,FOLLOW_49_in_ruleSystemLibraries1263); 

                	newLeafNode(otherlv_37, grammarAccess.getSystemLibrariesAccess().getEndSystemLibrariesKeyword_37());
                

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
    // $ANTLR end "ruleSystemLibraries"


    // $ANTLR start "entryRuleUserLibraries"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:692:1: entryRuleUserLibraries returns [EObject current=null] : iv_ruleUserLibraries= ruleUserLibraries EOF ;
    public final EObject entryRuleUserLibraries() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserLibraries = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:693:2: (iv_ruleUserLibraries= ruleUserLibraries EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:694:2: iv_ruleUserLibraries= ruleUserLibraries EOF
            {
             newCompositeNode(grammarAccess.getUserLibrariesRule()); 
            pushFollow(FOLLOW_ruleUserLibraries_in_entryRuleUserLibraries1299);
            iv_ruleUserLibraries=ruleUserLibraries();

            state._fsp--;

             current =iv_ruleUserLibraries; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserLibraries1309); 

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
    // $ANTLR end "entryRuleUserLibraries"


    // $ANTLR start "ruleUserLibraries"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:701:1: ruleUserLibraries returns [EObject current=null] : (otherlv_0= 'UserLibraries' otherlv_1= 'WorkItemTypes' ( (lv_WorkItemTypes_2_0= ruleWorkItemType ) )+ otherlv_3= 'end WorkItemTypes' otherlv_4= 'ClassOfServices' ( (lv_ClassOfServices_5_0= ruleClassOfService ) )+ otherlv_6= 'end ClassOfServices' otherlv_7= 'Services' ( (lv_Services_8_0= ruleService ) )+ otherlv_9= 'end Services' otherlv_10= 'GovernanceStrategies' ( (lv_GovernanceStrategies_11_0= ruleGovernanceStrategy ) )+ otherlv_12= 'end GovernanceStrategies' otherlv_13= 'end UserLibraries' ) ;
    public final EObject ruleUserLibraries() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_WorkItemTypes_2_0 = null;

        EObject lv_ClassOfServices_5_0 = null;

        EObject lv_Services_8_0 = null;

        EObject lv_GovernanceStrategies_11_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:704:28: ( (otherlv_0= 'UserLibraries' otherlv_1= 'WorkItemTypes' ( (lv_WorkItemTypes_2_0= ruleWorkItemType ) )+ otherlv_3= 'end WorkItemTypes' otherlv_4= 'ClassOfServices' ( (lv_ClassOfServices_5_0= ruleClassOfService ) )+ otherlv_6= 'end ClassOfServices' otherlv_7= 'Services' ( (lv_Services_8_0= ruleService ) )+ otherlv_9= 'end Services' otherlv_10= 'GovernanceStrategies' ( (lv_GovernanceStrategies_11_0= ruleGovernanceStrategy ) )+ otherlv_12= 'end GovernanceStrategies' otherlv_13= 'end UserLibraries' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:705:1: (otherlv_0= 'UserLibraries' otherlv_1= 'WorkItemTypes' ( (lv_WorkItemTypes_2_0= ruleWorkItemType ) )+ otherlv_3= 'end WorkItemTypes' otherlv_4= 'ClassOfServices' ( (lv_ClassOfServices_5_0= ruleClassOfService ) )+ otherlv_6= 'end ClassOfServices' otherlv_7= 'Services' ( (lv_Services_8_0= ruleService ) )+ otherlv_9= 'end Services' otherlv_10= 'GovernanceStrategies' ( (lv_GovernanceStrategies_11_0= ruleGovernanceStrategy ) )+ otherlv_12= 'end GovernanceStrategies' otherlv_13= 'end UserLibraries' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:705:1: (otherlv_0= 'UserLibraries' otherlv_1= 'WorkItemTypes' ( (lv_WorkItemTypes_2_0= ruleWorkItemType ) )+ otherlv_3= 'end WorkItemTypes' otherlv_4= 'ClassOfServices' ( (lv_ClassOfServices_5_0= ruleClassOfService ) )+ otherlv_6= 'end ClassOfServices' otherlv_7= 'Services' ( (lv_Services_8_0= ruleService ) )+ otherlv_9= 'end Services' otherlv_10= 'GovernanceStrategies' ( (lv_GovernanceStrategies_11_0= ruleGovernanceStrategy ) )+ otherlv_12= 'end GovernanceStrategies' otherlv_13= 'end UserLibraries' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:705:3: otherlv_0= 'UserLibraries' otherlv_1= 'WorkItemTypes' ( (lv_WorkItemTypes_2_0= ruleWorkItemType ) )+ otherlv_3= 'end WorkItemTypes' otherlv_4= 'ClassOfServices' ( (lv_ClassOfServices_5_0= ruleClassOfService ) )+ otherlv_6= 'end ClassOfServices' otherlv_7= 'Services' ( (lv_Services_8_0= ruleService ) )+ otherlv_9= 'end Services' otherlv_10= 'GovernanceStrategies' ( (lv_GovernanceStrategies_11_0= ruleGovernanceStrategy ) )+ otherlv_12= 'end GovernanceStrategies' otherlv_13= 'end UserLibraries'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleUserLibraries1346); 

                	newLeafNode(otherlv_0, grammarAccess.getUserLibrariesAccess().getUserLibrariesKeyword_0());
                
            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleUserLibraries1358); 

                	newLeafNode(otherlv_1, grammarAccess.getUserLibrariesAccess().getWorkItemTypesKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:713:1: ( (lv_WorkItemTypes_2_0= ruleWorkItemType ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_INT||LA14_0==104) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:714:1: (lv_WorkItemTypes_2_0= ruleWorkItemType )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:714:1: (lv_WorkItemTypes_2_0= ruleWorkItemType )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:715:3: lv_WorkItemTypes_2_0= ruleWorkItemType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUserLibrariesAccess().getWorkItemTypesWorkItemTypeParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWorkItemType_in_ruleUserLibraries1379);
            	    lv_WorkItemTypes_2_0=ruleWorkItemType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUserLibrariesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"WorkItemTypes",
            	            		lv_WorkItemTypes_2_0, 
            	            		"WorkItemType");
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

            otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleUserLibraries1392); 

                	newLeafNode(otherlv_3, grammarAccess.getUserLibrariesAccess().getEndWorkItemTypesKeyword_3());
                
            otherlv_4=(Token)match(input,53,FOLLOW_53_in_ruleUserLibraries1404); 

                	newLeafNode(otherlv_4, grammarAccess.getUserLibrariesAccess().getClassOfServicesKeyword_4());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:739:1: ( (lv_ClassOfServices_5_0= ruleClassOfService ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_INT||LA15_0==97) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:740:1: (lv_ClassOfServices_5_0= ruleClassOfService )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:740:1: (lv_ClassOfServices_5_0= ruleClassOfService )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:741:3: lv_ClassOfServices_5_0= ruleClassOfService
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUserLibrariesAccess().getClassOfServicesClassOfServiceParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleClassOfService_in_ruleUserLibraries1425);
            	    lv_ClassOfServices_5_0=ruleClassOfService();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUserLibrariesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ClassOfServices",
            	            		lv_ClassOfServices_5_0, 
            	            		"ClassOfService");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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

            otherlv_6=(Token)match(input,54,FOLLOW_54_in_ruleUserLibraries1438); 

                	newLeafNode(otherlv_6, grammarAccess.getUserLibrariesAccess().getEndClassOfServicesKeyword_6());
                
            otherlv_7=(Token)match(input,55,FOLLOW_55_in_ruleUserLibraries1450); 

                	newLeafNode(otherlv_7, grammarAccess.getUserLibrariesAccess().getServicesKeyword_7());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:765:1: ( (lv_Services_8_0= ruleService ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_INT||LA16_0==110) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:766:1: (lv_Services_8_0= ruleService )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:766:1: (lv_Services_8_0= ruleService )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:767:3: lv_Services_8_0= ruleService
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUserLibrariesAccess().getServicesServiceParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleService_in_ruleUserLibraries1471);
            	    lv_Services_8_0=ruleService();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUserLibrariesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"Services",
            	            		lv_Services_8_0, 
            	            		"Service");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            otherlv_9=(Token)match(input,56,FOLLOW_56_in_ruleUserLibraries1484); 

                	newLeafNode(otherlv_9, grammarAccess.getUserLibrariesAccess().getEndServicesKeyword_9());
                
            otherlv_10=(Token)match(input,57,FOLLOW_57_in_ruleUserLibraries1496); 

                	newLeafNode(otherlv_10, grammarAccess.getUserLibrariesAccess().getGovernanceStrategiesKeyword_10());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:791:1: ( (lv_GovernanceStrategies_11_0= ruleGovernanceStrategy ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_INT||LA17_0==73) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:792:1: (lv_GovernanceStrategies_11_0= ruleGovernanceStrategy )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:792:1: (lv_GovernanceStrategies_11_0= ruleGovernanceStrategy )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:793:3: lv_GovernanceStrategies_11_0= ruleGovernanceStrategy
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUserLibrariesAccess().getGovernanceStrategiesGovernanceStrategyParserRuleCall_11_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGovernanceStrategy_in_ruleUserLibraries1517);
            	    lv_GovernanceStrategies_11_0=ruleGovernanceStrategy();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUserLibrariesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"GovernanceStrategies",
            	            		lv_GovernanceStrategies_11_0, 
            	            		"GovernanceStrategy");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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

            otherlv_12=(Token)match(input,58,FOLLOW_58_in_ruleUserLibraries1530); 

                	newLeafNode(otherlv_12, grammarAccess.getUserLibrariesAccess().getEndGovernanceStrategiesKeyword_12());
                
            otherlv_13=(Token)match(input,59,FOLLOW_59_in_ruleUserLibraries1542); 

                	newLeafNode(otherlv_13, grammarAccess.getUserLibrariesAccess().getEndUserLibrariesKeyword_13());
                

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
    // $ANTLR end "ruleUserLibraries"


    // $ANTLR start "entryRuleQualifiedName"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:825:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:826:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:827:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1579);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1590); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:834:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.' this_INT_4= RULE_INT )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_INT_4=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:837:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.' this_INT_4= RULE_INT )* ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:838:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.' this_INT_4= RULE_INT )* )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:838:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.' this_INT_4= RULE_INT )* )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:838:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.' this_INT_4= RULE_INT )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1630); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:845:1: (kw= '.' this_ID_2= RULE_ID )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==60) ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1==RULE_ID) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:846:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,60,FOLLOW_60_in_ruleQualifiedName1649); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1664); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:858:3: (kw= '.' this_INT_4= RULE_INT )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==60) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:859:2: kw= '.' this_INT_4= RULE_INT
            	    {
            	    kw=(Token)match(input,60,FOLLOW_60_in_ruleQualifiedName1685); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_2_0()); 
            	        
            	    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleQualifiedName1700); 

            	    		current.merge(this_INT_4);
            	        
            	     
            	        newLeafNode(this_INT_4, grammarAccess.getQualifiedNameAccess().getINTTerminalRuleCall_2_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleNumExpression"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:879:1: entryRuleNumExpression returns [EObject current=null] : iv_ruleNumExpression= ruleNumExpression EOF ;
    public final EObject entryRuleNumExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumExpression = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:880:2: (iv_ruleNumExpression= ruleNumExpression EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:881:2: iv_ruleNumExpression= ruleNumExpression EOF
            {
             newCompositeNode(grammarAccess.getNumExpressionRule()); 
            pushFollow(FOLLOW_ruleNumExpression_in_entryRuleNumExpression1747);
            iv_ruleNumExpression=ruleNumExpression();

            state._fsp--;

             current =iv_ruleNumExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumExpression1757); 

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
    // $ANTLR end "entryRuleNumExpression"


    // $ANTLR start "ruleNumExpression"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:888:1: ruleNumExpression returns [EObject current=null] : ( ( (lv_numValue_0_0= RULE_DOUBLE ) ) | ( ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) ) ) ;
    public final EObject ruleNumExpression() throws RecognitionException {
        EObject current = null;

        Token lv_numValue_0_0=null;
        Token lv_distribution_1_0=null;
        EObject lv_numDist_2_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:891:28: ( ( ( (lv_numValue_0_0= RULE_DOUBLE ) ) | ( ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:892:1: ( ( (lv_numValue_0_0= RULE_DOUBLE ) ) | ( ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:892:1: ( ( (lv_numValue_0_0= RULE_DOUBLE ) ) | ( ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_DOUBLE) ) {
                alt20=1;
            }
            else if ( (LA20_0==61) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:892:2: ( (lv_numValue_0_0= RULE_DOUBLE ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:892:2: ( (lv_numValue_0_0= RULE_DOUBLE ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:893:1: (lv_numValue_0_0= RULE_DOUBLE )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:893:1: (lv_numValue_0_0= RULE_DOUBLE )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:894:3: lv_numValue_0_0= RULE_DOUBLE
                    {
                    lv_numValue_0_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleNumExpression1799); 

                    			newLeafNode(lv_numValue_0_0, grammarAccess.getNumExpressionAccess().getNumValueDOUBLETerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumExpressionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"numValue",
                            		lv_numValue_0_0, 
                            		"DOUBLE");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:911:6: ( ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:911:6: ( ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:911:7: ( (lv_distribution_1_0= 'Random.' ) ) ( (lv_numDist_2_0= ruleDistribution ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:911:7: ( (lv_distribution_1_0= 'Random.' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:912:1: (lv_distribution_1_0= 'Random.' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:912:1: (lv_distribution_1_0= 'Random.' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:913:3: lv_distribution_1_0= 'Random.'
                    {
                    lv_distribution_1_0=(Token)match(input,61,FOLLOW_61_in_ruleNumExpression1829); 

                            newLeafNode(lv_distribution_1_0, grammarAccess.getNumExpressionAccess().getDistributionRandomKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "distribution", true, "Random.");
                    	    

                    }


                    }

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:926:2: ( (lv_numDist_2_0= ruleDistribution ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:927:1: (lv_numDist_2_0= ruleDistribution )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:927:1: (lv_numDist_2_0= ruleDistribution )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:928:3: lv_numDist_2_0= ruleDistribution
                    {
                     
                    	        newCompositeNode(grammarAccess.getNumExpressionAccess().getNumDistDistributionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDistribution_in_ruleNumExpression1863);
                    lv_numDist_2_0=ruleDistribution();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNumExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"numDist",
                            		lv_numDist_2_0, 
                            		"Distribution");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleNumExpression"


    // $ANTLR start "entryRuleParameter"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:952:1: entryRuleParameter returns [String current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final String entryRuleParameter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameter = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:953:2: (iv_ruleParameter= ruleParameter EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:954:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1901);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter1912); 

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:961:1: ruleParameter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE | this_STRING_2= RULE_STRING | this_ID_3= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleParameter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_DOUBLE_1=null;
        Token this_STRING_2=null;
        Token this_ID_3=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:964:28: ( (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE | this_STRING_2= RULE_STRING | this_ID_3= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:965:1: (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE | this_STRING_2= RULE_STRING | this_ID_3= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:965:1: (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE | this_STRING_2= RULE_STRING | this_ID_3= RULE_ID )
            int alt21=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt21=1;
                }
                break;
            case RULE_DOUBLE:
                {
                alt21=2;
                }
                break;
            case RULE_STRING:
                {
                alt21=3;
                }
                break;
            case RULE_ID:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:965:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleParameter1952); 

                    		current.merge(this_INT_0);
                        
                     
                        newLeafNode(this_INT_0, grammarAccess.getParameterAccess().getINTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:973:10: this_DOUBLE_1= RULE_DOUBLE
                    {
                    this_DOUBLE_1=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleParameter1978); 

                    		current.merge(this_DOUBLE_1);
                        
                     
                        newLeafNode(this_DOUBLE_1, grammarAccess.getParameterAccess().getDOUBLETerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:981:10: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleParameter2004); 

                    		current.merge(this_STRING_2);
                        
                     
                        newLeafNode(this_STRING_2, grammarAccess.getParameterAccess().getSTRINGTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:989:10: this_ID_3= RULE_ID
                    {
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter2030); 

                    		current.merge(this_ID_3);
                        
                     
                        newLeafNode(this_ID_3, grammarAccess.getParameterAccess().getIDTerminalRuleCall_3()); 
                        

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleDistribution"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1004:1: entryRuleDistribution returns [EObject current=null] : iv_ruleDistribution= ruleDistribution EOF ;
    public final EObject entryRuleDistribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistribution = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1005:2: (iv_ruleDistribution= ruleDistribution EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1006:2: iv_ruleDistribution= ruleDistribution EOF
            {
             newCompositeNode(grammarAccess.getDistributionRule()); 
            pushFollow(FOLLOW_ruleDistribution_in_entryRuleDistribution2075);
            iv_ruleDistribution=ruleDistribution();

            state._fsp--;

             current =iv_ruleDistribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDistribution2085); 

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
    // $ANTLR end "entryRuleDistribution"


    // $ANTLR start "ruleDistribution"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1013:1: ruleDistribution returns [EObject current=null] : ( ( ( (lv_isNormal_0_0= 'Normal' ) ) | ( (lv_isUniform_1_0= 'Uniform' ) ) | ( (lv_isExponential_2_0= 'Exponential' ) ) ) otherlv_3= '[' ( (lv_parameters_4_0= ruleParameter ) )* otherlv_5= ']' ) ;
    public final EObject ruleDistribution() throws RecognitionException {
        EObject current = null;

        Token lv_isNormal_0_0=null;
        Token lv_isUniform_1_0=null;
        Token lv_isExponential_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_parameters_4_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1016:28: ( ( ( ( (lv_isNormal_0_0= 'Normal' ) ) | ( (lv_isUniform_1_0= 'Uniform' ) ) | ( (lv_isExponential_2_0= 'Exponential' ) ) ) otherlv_3= '[' ( (lv_parameters_4_0= ruleParameter ) )* otherlv_5= ']' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1017:1: ( ( ( (lv_isNormal_0_0= 'Normal' ) ) | ( (lv_isUniform_1_0= 'Uniform' ) ) | ( (lv_isExponential_2_0= 'Exponential' ) ) ) otherlv_3= '[' ( (lv_parameters_4_0= ruleParameter ) )* otherlv_5= ']' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1017:1: ( ( ( (lv_isNormal_0_0= 'Normal' ) ) | ( (lv_isUniform_1_0= 'Uniform' ) ) | ( (lv_isExponential_2_0= 'Exponential' ) ) ) otherlv_3= '[' ( (lv_parameters_4_0= ruleParameter ) )* otherlv_5= ']' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1017:2: ( ( (lv_isNormal_0_0= 'Normal' ) ) | ( (lv_isUniform_1_0= 'Uniform' ) ) | ( (lv_isExponential_2_0= 'Exponential' ) ) ) otherlv_3= '[' ( (lv_parameters_4_0= ruleParameter ) )* otherlv_5= ']'
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1017:2: ( ( (lv_isNormal_0_0= 'Normal' ) ) | ( (lv_isUniform_1_0= 'Uniform' ) ) | ( (lv_isExponential_2_0= 'Exponential' ) ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt22=1;
                }
                break;
            case 63:
                {
                alt22=2;
                }
                break;
            case 64:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1017:3: ( (lv_isNormal_0_0= 'Normal' ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1017:3: ( (lv_isNormal_0_0= 'Normal' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1018:1: (lv_isNormal_0_0= 'Normal' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1018:1: (lv_isNormal_0_0= 'Normal' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1019:3: lv_isNormal_0_0= 'Normal'
                    {
                    lv_isNormal_0_0=(Token)match(input,62,FOLLOW_62_in_ruleDistribution2129); 

                            newLeafNode(lv_isNormal_0_0, grammarAccess.getDistributionAccess().getIsNormalNormalKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDistributionRule());
                    	        }
                           		setWithLastConsumed(current, "isNormal", true, "Normal");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1033:6: ( (lv_isUniform_1_0= 'Uniform' ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1033:6: ( (lv_isUniform_1_0= 'Uniform' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1034:1: (lv_isUniform_1_0= 'Uniform' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1034:1: (lv_isUniform_1_0= 'Uniform' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1035:3: lv_isUniform_1_0= 'Uniform'
                    {
                    lv_isUniform_1_0=(Token)match(input,63,FOLLOW_63_in_ruleDistribution2166); 

                            newLeafNode(lv_isUniform_1_0, grammarAccess.getDistributionAccess().getIsUniformUniformKeyword_0_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDistributionRule());
                    	        }
                           		setWithLastConsumed(current, "isUniform", true, "Uniform");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1049:6: ( (lv_isExponential_2_0= 'Exponential' ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1049:6: ( (lv_isExponential_2_0= 'Exponential' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1050:1: (lv_isExponential_2_0= 'Exponential' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1050:1: (lv_isExponential_2_0= 'Exponential' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1051:3: lv_isExponential_2_0= 'Exponential'
                    {
                    lv_isExponential_2_0=(Token)match(input,64,FOLLOW_64_in_ruleDistribution2203); 

                            newLeafNode(lv_isExponential_2_0, grammarAccess.getDistributionAccess().getIsExponentialExponentialKeyword_0_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDistributionRule());
                    	        }
                           		setWithLastConsumed(current, "isExponential", true, "Exponential");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,65,FOLLOW_65_in_ruleDistribution2229); 

                	newLeafNode(otherlv_3, grammarAccess.getDistributionAccess().getLeftSquareBracketKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1068:1: ( (lv_parameters_4_0= ruleParameter ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_DOUBLE)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1069:1: (lv_parameters_4_0= ruleParameter )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1069:1: (lv_parameters_4_0= ruleParameter )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1070:3: lv_parameters_4_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDistributionAccess().getParametersParameterParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_ruleDistribution2250);
            	    lv_parameters_4_0=ruleParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDistributionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameters",
            	            		lv_parameters_4_0, 
            	            		"Parameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_5=(Token)match(input,66,FOLLOW_66_in_ruleDistribution2263); 

                	newLeafNode(otherlv_5, grammarAccess.getDistributionAccess().getRightSquareBracketKeyword_3());
                

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
    // $ANTLR end "ruleDistribution"


    // $ANTLR start "entryRuleEventType"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1098:1: entryRuleEventType returns [EObject current=null] : iv_ruleEventType= ruleEventType EOF ;
    public final EObject entryRuleEventType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventType = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1099:2: (iv_ruleEventType= ruleEventType EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1100:2: iv_ruleEventType= ruleEventType EOF
            {
             newCompositeNode(grammarAccess.getEventTypeRule()); 
            pushFollow(FOLLOW_ruleEventType_in_entryRuleEventType2299);
            iv_ruleEventType=ruleEventType();

            state._fsp--;

             current =iv_ruleEventType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventType2309); 

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
    // $ANTLR end "entryRuleEventType"


    // $ANTLR start "ruleEventType"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1107:1: ruleEventType returns [EObject current=null] : (otherlv_0= 'EventType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ) ;
    public final EObject ruleEventType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1110:28: ( (otherlv_0= 'EventType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1111:1: (otherlv_0= 'EventType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1111:1: (otherlv_0= 'EventType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1111:3: otherlv_0= 'EventType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,67,FOLLOW_67_in_ruleEventType2346); 

                	newLeafNode(otherlv_0, grammarAccess.getEventTypeAccess().getEventTypeKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1115:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1116:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1116:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1117:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventType2363); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEventTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEventTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1133:2: ( (lv_description_2_0= RULE_STRING ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_STRING) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1134:1: (lv_description_2_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1134:1: (lv_description_2_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1135:3: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEventType2385); 

                    			newLeafNode(lv_description_2_0, grammarAccess.getEventTypeAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEventTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_2_0, 
                            		"STRING");
                    	    

                    }


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
    // $ANTLR end "ruleEventType"


    // $ANTLR start "entryRuleConditionType"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1159:1: entryRuleConditionType returns [EObject current=null] : iv_ruleConditionType= ruleConditionType EOF ;
    public final EObject entryRuleConditionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionType = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1160:2: (iv_ruleConditionType= ruleConditionType EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1161:2: iv_ruleConditionType= ruleConditionType EOF
            {
             newCompositeNode(grammarAccess.getConditionTypeRule()); 
            pushFollow(FOLLOW_ruleConditionType_in_entryRuleConditionType2427);
            iv_ruleConditionType=ruleConditionType();

            state._fsp--;

             current =iv_ruleConditionType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionType2437); 

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
    // $ANTLR end "entryRuleConditionType"


    // $ANTLR start "ruleConditionType"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1168:1: ruleConditionType returns [EObject current=null] : (otherlv_0= 'ConditionType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ) ;
    public final EObject ruleConditionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1171:28: ( (otherlv_0= 'ConditionType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1172:1: (otherlv_0= 'ConditionType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1172:1: (otherlv_0= 'ConditionType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1172:3: otherlv_0= 'ConditionType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,68,FOLLOW_68_in_ruleConditionType2474); 

                	newLeafNode(otherlv_0, grammarAccess.getConditionTypeAccess().getConditionTypeKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1176:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1177:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1177:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1178:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConditionType2491); 

            			newLeafNode(lv_name_1_0, grammarAccess.getConditionTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConditionTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1194:2: ( (lv_description_2_0= RULE_STRING ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_STRING) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1195:1: (lv_description_2_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1195:1: (lv_description_2_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1196:3: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConditionType2513); 

                    			newLeafNode(lv_description_2_0, grammarAccess.getConditionTypeAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConditionTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_2_0, 
                            		"STRING");
                    	    

                    }


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
    // $ANTLR end "ruleConditionType"


    // $ANTLR start "entryRuleWINReplicationSetting"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1224:1: entryRuleWINReplicationSetting returns [EObject current=null] : iv_ruleWINReplicationSetting= ruleWINReplicationSetting EOF ;
    public final EObject entryRuleWINReplicationSetting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWINReplicationSetting = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1225:2: (iv_ruleWINReplicationSetting= ruleWINReplicationSetting EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1226:2: iv_ruleWINReplicationSetting= ruleWINReplicationSetting EOF
            {
             newCompositeNode(grammarAccess.getWINReplicationSettingRule()); 
            pushFollow(FOLLOW_ruleWINReplicationSetting_in_entryRuleWINReplicationSetting2559);
            iv_ruleWINReplicationSetting=ruleWINReplicationSetting();

            state._fsp--;

             current =iv_ruleWINReplicationSetting; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWINReplicationSetting2569); 

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
    // $ANTLR end "entryRuleWINReplicationSetting"


    // $ANTLR start "ruleWINReplicationSetting"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1233:1: ruleWINReplicationSetting returns [EObject current=null] : (otherlv_0= 'WINReplicationSetting' otherlv_1= '{' ( (lv_WINReplications_2_0= ruleWINReplication ) )+ otherlv_3= '}' ) ;
    public final EObject ruleWINReplicationSetting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_WINReplications_2_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1236:28: ( (otherlv_0= 'WINReplicationSetting' otherlv_1= '{' ( (lv_WINReplications_2_0= ruleWINReplication ) )+ otherlv_3= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1237:1: (otherlv_0= 'WINReplicationSetting' otherlv_1= '{' ( (lv_WINReplications_2_0= ruleWINReplication ) )+ otherlv_3= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1237:1: (otherlv_0= 'WINReplicationSetting' otherlv_1= '{' ( (lv_WINReplications_2_0= ruleWINReplication ) )+ otherlv_3= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1237:3: otherlv_0= 'WINReplicationSetting' otherlv_1= '{' ( (lv_WINReplications_2_0= ruleWINReplication ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_69_in_ruleWINReplicationSetting2606); 

                	newLeafNode(otherlv_0, grammarAccess.getWINReplicationSettingAccess().getWINReplicationSettingKeyword_0());
                
            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleWINReplicationSetting2618); 

                	newLeafNode(otherlv_1, grammarAccess.getWINReplicationSettingAccess().getLeftCurlyBracketKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1245:1: ( (lv_WINReplications_2_0= ruleWINReplication ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==70) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1246:1: (lv_WINReplications_2_0= ruleWINReplication )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1246:1: (lv_WINReplications_2_0= ruleWINReplication )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1247:3: lv_WINReplications_2_0= ruleWINReplication
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWINReplicationSettingAccess().getWINReplicationsWINReplicationParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWINReplication_in_ruleWINReplicationSetting2639);
            	    lv_WINReplications_2_0=ruleWINReplication();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWINReplicationSettingRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"WINReplications",
            	            		lv_WINReplications_2_0, 
            	            		"WINReplication");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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

            otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleWINReplicationSetting2652); 

                	newLeafNode(otherlv_3, grammarAccess.getWINReplicationSettingAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleWINReplicationSetting"


    // $ANTLR start "entryRuleWINReplication"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1275:1: entryRuleWINReplication returns [EObject current=null] : iv_ruleWINReplication= ruleWINReplication EOF ;
    public final EObject entryRuleWINReplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWINReplication = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1276:2: (iv_ruleWINReplication= ruleWINReplication EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1277:2: iv_ruleWINReplication= ruleWINReplication EOF
            {
             newCompositeNode(grammarAccess.getWINReplicationRule()); 
            pushFollow(FOLLOW_ruleWINReplication_in_entryRuleWINReplication2688);
            iv_ruleWINReplication=ruleWINReplication();

            state._fsp--;

             current =iv_ruleWINReplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWINReplication2698); 

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
    // $ANTLR end "entryRuleWINReplication"


    // $ANTLR start "ruleWINReplication"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1284:1: ruleWINReplication returns [EObject current=null] : (otherlv_0= 'WorkItemNetwork' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'NumReplications' ( (lv_numReplications_3_0= RULE_INT ) ) ) ;
    public final EObject ruleWINReplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_numReplications_3_0=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1287:28: ( (otherlv_0= 'WorkItemNetwork' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'NumReplications' ( (lv_numReplications_3_0= RULE_INT ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1288:1: (otherlv_0= 'WorkItemNetwork' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'NumReplications' ( (lv_numReplications_3_0= RULE_INT ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1288:1: (otherlv_0= 'WorkItemNetwork' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'NumReplications' ( (lv_numReplications_3_0= RULE_INT ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1288:3: otherlv_0= 'WorkItemNetwork' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'NumReplications' ( (lv_numReplications_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_ruleWINReplication2735); 

                	newLeafNode(otherlv_0, grammarAccess.getWINReplicationAccess().getWorkItemNetworkKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1292:1: ( (otherlv_1= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1293:1: (otherlv_1= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1293:1: (otherlv_1= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1294:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getWINReplicationRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWINReplication2755); 

            		newLeafNode(otherlv_1, grammarAccess.getWINReplicationAccess().getWorkItemNetworkWorkItemNetworkCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,71,FOLLOW_71_in_ruleWINReplication2767); 

                	newLeafNode(otherlv_2, grammarAccess.getWINReplicationAccess().getNumReplicationsKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1309:1: ( (lv_numReplications_3_0= RULE_INT ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1310:1: (lv_numReplications_3_0= RULE_INT )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1310:1: (lv_numReplications_3_0= RULE_INT )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1311:3: lv_numReplications_3_0= RULE_INT
            {
            lv_numReplications_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWINReplication2784); 

            			newLeafNode(lv_numReplications_3_0, grammarAccess.getWINReplicationAccess().getNumReplicationsINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWINReplicationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"numReplications",
                    		lv_numReplications_3_0, 
                    		"INT");
            	    

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
    // $ANTLR end "ruleWINReplication"


    // $ANTLR start "entryRuleIndicators"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1335:1: entryRuleIndicators returns [EObject current=null] : iv_ruleIndicators= ruleIndicators EOF ;
    public final EObject entryRuleIndicators() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndicators = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1336:2: (iv_ruleIndicators= ruleIndicators EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1337:2: iv_ruleIndicators= ruleIndicators EOF
            {
             newCompositeNode(grammarAccess.getIndicatorsRule()); 
            pushFollow(FOLLOW_ruleIndicators_in_entryRuleIndicators2825);
            iv_ruleIndicators=ruleIndicators();

            state._fsp--;

             current =iv_ruleIndicators; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndicators2835); 

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
    // $ANTLR end "entryRuleIndicators"


    // $ANTLR start "ruleIndicators"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1344:1: ruleIndicators returns [EObject current=null] : (otherlv_0= 'Indicators' otherlv_1= '{' ( (lv_Indicators_2_0= RULE_ID ) )+ otherlv_3= '}' ) ;
    public final EObject ruleIndicators() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_Indicators_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1347:28: ( (otherlv_0= 'Indicators' otherlv_1= '{' ( (lv_Indicators_2_0= RULE_ID ) )+ otherlv_3= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1348:1: (otherlv_0= 'Indicators' otherlv_1= '{' ( (lv_Indicators_2_0= RULE_ID ) )+ otherlv_3= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1348:1: (otherlv_0= 'Indicators' otherlv_1= '{' ( (lv_Indicators_2_0= RULE_ID ) )+ otherlv_3= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1348:3: otherlv_0= 'Indicators' otherlv_1= '{' ( (lv_Indicators_2_0= RULE_ID ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_72_in_ruleIndicators2872); 

                	newLeafNode(otherlv_0, grammarAccess.getIndicatorsAccess().getIndicatorsKeyword_0());
                
            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleIndicators2884); 

                	newLeafNode(otherlv_1, grammarAccess.getIndicatorsAccess().getLeftCurlyBracketKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1356:1: ( (lv_Indicators_2_0= RULE_ID ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1357:1: (lv_Indicators_2_0= RULE_ID )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1357:1: (lv_Indicators_2_0= RULE_ID )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1358:3: lv_Indicators_2_0= RULE_ID
            	    {
            	    lv_Indicators_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndicators2901); 

            	    			newLeafNode(lv_Indicators_2_0, grammarAccess.getIndicatorsAccess().getIndicatorsIDTerminalRuleCall_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getIndicatorsRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"Indicators",
            	            		lv_Indicators_2_0, 
            	            		"ID");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);

            otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleIndicators2919); 

                	newLeafNode(otherlv_3, grammarAccess.getIndicatorsAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleIndicators"


    // $ANTLR start "entryRuleGovernanceStrategy"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1386:1: entryRuleGovernanceStrategy returns [EObject current=null] : iv_ruleGovernanceStrategy= ruleGovernanceStrategy EOF ;
    public final EObject entryRuleGovernanceStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGovernanceStrategy = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1387:2: (iv_ruleGovernanceStrategy= ruleGovernanceStrategy EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1388:2: iv_ruleGovernanceStrategy= ruleGovernanceStrategy EOF
            {
             newCompositeNode(grammarAccess.getGovernanceStrategyRule()); 
            pushFollow(FOLLOW_ruleGovernanceStrategy_in_entryRuleGovernanceStrategy2955);
            iv_ruleGovernanceStrategy=ruleGovernanceStrategy();

            state._fsp--;

             current =iv_ruleGovernanceStrategy; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGovernanceStrategy2965); 

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
    // $ANTLR end "entryRuleGovernanceStrategy"


    // $ANTLR start "ruleGovernanceStrategy"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1395:1: ruleGovernanceStrategy returns [EObject current=null] : ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'GovernanceStrategy' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? ( ( (lv_WIAcceptanceRule_6_0= ruleWIAcceptance ) ) ( (lv_WISelectionRule_7_0= ruleWISelection ) ) ( (lv_WIAssignmentRule_8_0= ruleWIAssignment ) ) ( (lv_ResourceAllocationRule_9_0= ruleResourceAllocation ) ) ( (lv_ResourceOutsourcingRule_10_0= ruleResourceOutsourcing ) ) )? otherlv_11= 'Mechanisms' otherlv_12= '{' ( (lv_Mechanisms_13_0= ruleMechanism ) )+ otherlv_14= '}' otherlv_15= '}' ) ;
    public final EObject ruleGovernanceStrategy() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_WIAcceptanceRule_6_0 = null;

        EObject lv_WISelectionRule_7_0 = null;

        EObject lv_WIAssignmentRule_8_0 = null;

        EObject lv_ResourceAllocationRule_9_0 = null;

        EObject lv_ResourceOutsourcingRule_10_0 = null;

        EObject lv_Mechanisms_13_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1398:28: ( ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'GovernanceStrategy' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? ( ( (lv_WIAcceptanceRule_6_0= ruleWIAcceptance ) ) ( (lv_WISelectionRule_7_0= ruleWISelection ) ) ( (lv_WIAssignmentRule_8_0= ruleWIAssignment ) ) ( (lv_ResourceAllocationRule_9_0= ruleResourceAllocation ) ) ( (lv_ResourceOutsourcingRule_10_0= ruleResourceOutsourcing ) ) )? otherlv_11= 'Mechanisms' otherlv_12= '{' ( (lv_Mechanisms_13_0= ruleMechanism ) )+ otherlv_14= '}' otherlv_15= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1399:1: ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'GovernanceStrategy' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? ( ( (lv_WIAcceptanceRule_6_0= ruleWIAcceptance ) ) ( (lv_WISelectionRule_7_0= ruleWISelection ) ) ( (lv_WIAssignmentRule_8_0= ruleWIAssignment ) ) ( (lv_ResourceAllocationRule_9_0= ruleResourceAllocation ) ) ( (lv_ResourceOutsourcingRule_10_0= ruleResourceOutsourcing ) ) )? otherlv_11= 'Mechanisms' otherlv_12= '{' ( (lv_Mechanisms_13_0= ruleMechanism ) )+ otherlv_14= '}' otherlv_15= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1399:1: ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'GovernanceStrategy' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? ( ( (lv_WIAcceptanceRule_6_0= ruleWIAcceptance ) ) ( (lv_WISelectionRule_7_0= ruleWISelection ) ) ( (lv_WIAssignmentRule_8_0= ruleWIAssignment ) ) ( (lv_ResourceAllocationRule_9_0= ruleResourceAllocation ) ) ( (lv_ResourceOutsourcingRule_10_0= ruleResourceOutsourcing ) ) )? otherlv_11= 'Mechanisms' otherlv_12= '{' ( (lv_Mechanisms_13_0= ruleMechanism ) )+ otherlv_14= '}' otherlv_15= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1399:2: ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'GovernanceStrategy' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? ( ( (lv_WIAcceptanceRule_6_0= ruleWIAcceptance ) ) ( (lv_WISelectionRule_7_0= ruleWISelection ) ) ( (lv_WIAssignmentRule_8_0= ruleWIAssignment ) ) ( (lv_ResourceAllocationRule_9_0= ruleResourceAllocation ) ) ( (lv_ResourceOutsourcingRule_10_0= ruleResourceOutsourcing ) ) )? otherlv_11= 'Mechanisms' otherlv_12= '{' ( (lv_Mechanisms_13_0= ruleMechanism ) )+ otherlv_14= '}' otherlv_15= '}'
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1399:2: ( (lv_id_0_0= RULE_INT ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_INT) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1400:1: (lv_id_0_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1400:1: (lv_id_0_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1401:3: lv_id_0_0= RULE_INT
                    {
                    lv_id_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleGovernanceStrategy3007); 

                    			newLeafNode(lv_id_0_0, grammarAccess.getGovernanceStrategyAccess().getIdINTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGovernanceStrategyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_0_0, 
                            		"INT");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleGovernanceStrategy3025); 

                	newLeafNode(otherlv_1, grammarAccess.getGovernanceStrategyAccess().getGovernanceStrategyKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1421:1: ( (lv_name_2_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1422:1: (lv_name_2_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1422:1: (lv_name_2_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1423:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGovernanceStrategy3042); 

            			newLeafNode(lv_name_2_0, grammarAccess.getGovernanceStrategyAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGovernanceStrategyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleGovernanceStrategy3059); 

                	newLeafNode(otherlv_3, grammarAccess.getGovernanceStrategyAccess().getLeftCurlyBracketKeyword_3());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1443:1: (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==13) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1443:3: otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleGovernanceStrategy3072); 

                        	newLeafNode(otherlv_4, grammarAccess.getGovernanceStrategyAccess().getDescriptionKeyword_4_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1447:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1448:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1448:1: (lv_description_5_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1449:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGovernanceStrategy3089); 

                    			newLeafNode(lv_description_5_0, grammarAccess.getGovernanceStrategyAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGovernanceStrategyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1465:4: ( ( (lv_WIAcceptanceRule_6_0= ruleWIAcceptance ) ) ( (lv_WISelectionRule_7_0= ruleWISelection ) ) ( (lv_WIAssignmentRule_8_0= ruleWIAssignment ) ) ( (lv_ResourceAllocationRule_9_0= ruleResourceAllocation ) ) ( (lv_ResourceOutsourcingRule_10_0= ruleResourceOutsourcing ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==75) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1465:5: ( (lv_WIAcceptanceRule_6_0= ruleWIAcceptance ) ) ( (lv_WISelectionRule_7_0= ruleWISelection ) ) ( (lv_WIAssignmentRule_8_0= ruleWIAssignment ) ) ( (lv_ResourceAllocationRule_9_0= ruleResourceAllocation ) ) ( (lv_ResourceOutsourcingRule_10_0= ruleResourceOutsourcing ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1465:5: ( (lv_WIAcceptanceRule_6_0= ruleWIAcceptance ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1466:1: (lv_WIAcceptanceRule_6_0= ruleWIAcceptance )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1466:1: (lv_WIAcceptanceRule_6_0= ruleWIAcceptance )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1467:3: lv_WIAcceptanceRule_6_0= ruleWIAcceptance
                    {
                     
                    	        newCompositeNode(grammarAccess.getGovernanceStrategyAccess().getWIAcceptanceRuleWIAcceptanceParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWIAcceptance_in_ruleGovernanceStrategy3118);
                    lv_WIAcceptanceRule_6_0=ruleWIAcceptance();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGovernanceStrategyRule());
                    	        }
                           		set(
                           			current, 
                           			"WIAcceptanceRule",
                            		lv_WIAcceptanceRule_6_0, 
                            		"WIAcceptance");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1483:2: ( (lv_WISelectionRule_7_0= ruleWISelection ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1484:1: (lv_WISelectionRule_7_0= ruleWISelection )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1484:1: (lv_WISelectionRule_7_0= ruleWISelection )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1485:3: lv_WISelectionRule_7_0= ruleWISelection
                    {
                     
                    	        newCompositeNode(grammarAccess.getGovernanceStrategyAccess().getWISelectionRuleWISelectionParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWISelection_in_ruleGovernanceStrategy3139);
                    lv_WISelectionRule_7_0=ruleWISelection();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGovernanceStrategyRule());
                    	        }
                           		set(
                           			current, 
                           			"WISelectionRule",
                            		lv_WISelectionRule_7_0, 
                            		"WISelection");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1501:2: ( (lv_WIAssignmentRule_8_0= ruleWIAssignment ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1502:1: (lv_WIAssignmentRule_8_0= ruleWIAssignment )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1502:1: (lv_WIAssignmentRule_8_0= ruleWIAssignment )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1503:3: lv_WIAssignmentRule_8_0= ruleWIAssignment
                    {
                     
                    	        newCompositeNode(grammarAccess.getGovernanceStrategyAccess().getWIAssignmentRuleWIAssignmentParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWIAssignment_in_ruleGovernanceStrategy3160);
                    lv_WIAssignmentRule_8_0=ruleWIAssignment();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGovernanceStrategyRule());
                    	        }
                           		set(
                           			current, 
                           			"WIAssignmentRule",
                            		lv_WIAssignmentRule_8_0, 
                            		"WIAssignment");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1519:2: ( (lv_ResourceAllocationRule_9_0= ruleResourceAllocation ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1520:1: (lv_ResourceAllocationRule_9_0= ruleResourceAllocation )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1520:1: (lv_ResourceAllocationRule_9_0= ruleResourceAllocation )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1521:3: lv_ResourceAllocationRule_9_0= ruleResourceAllocation
                    {
                     
                    	        newCompositeNode(grammarAccess.getGovernanceStrategyAccess().getResourceAllocationRuleResourceAllocationParserRuleCall_5_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleResourceAllocation_in_ruleGovernanceStrategy3181);
                    lv_ResourceAllocationRule_9_0=ruleResourceAllocation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGovernanceStrategyRule());
                    	        }
                           		set(
                           			current, 
                           			"ResourceAllocationRule",
                            		lv_ResourceAllocationRule_9_0, 
                            		"ResourceAllocation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1537:2: ( (lv_ResourceOutsourcingRule_10_0= ruleResourceOutsourcing ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1538:1: (lv_ResourceOutsourcingRule_10_0= ruleResourceOutsourcing )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1538:1: (lv_ResourceOutsourcingRule_10_0= ruleResourceOutsourcing )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1539:3: lv_ResourceOutsourcingRule_10_0= ruleResourceOutsourcing
                    {
                     
                    	        newCompositeNode(grammarAccess.getGovernanceStrategyAccess().getResourceOutsourcingRuleResourceOutsourcingParserRuleCall_5_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleResourceOutsourcing_in_ruleGovernanceStrategy3202);
                    lv_ResourceOutsourcingRule_10_0=ruleResourceOutsourcing();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGovernanceStrategyRule());
                    	        }
                           		set(
                           			current, 
                           			"ResourceOutsourcingRule",
                            		lv_ResourceOutsourcingRule_10_0, 
                            		"ResourceOutsourcing");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,74,FOLLOW_74_in_ruleGovernanceStrategy3216); 

                	newLeafNode(otherlv_11, grammarAccess.getGovernanceStrategyAccess().getMechanismsKeyword_6());
                
            otherlv_12=(Token)match(input,36,FOLLOW_36_in_ruleGovernanceStrategy3228); 

                	newLeafNode(otherlv_12, grammarAccess.getGovernanceStrategyAccess().getLeftCurlyBracketKeyword_7());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1563:1: ( (lv_Mechanisms_13_0= ruleMechanism ) )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==83) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1564:1: (lv_Mechanisms_13_0= ruleMechanism )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1564:1: (lv_Mechanisms_13_0= ruleMechanism )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1565:3: lv_Mechanisms_13_0= ruleMechanism
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGovernanceStrategyAccess().getMechanismsMechanismParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMechanism_in_ruleGovernanceStrategy3249);
            	    lv_Mechanisms_13_0=ruleMechanism();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGovernanceStrategyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"Mechanisms",
            	            		lv_Mechanisms_13_0, 
            	            		"Mechanism");
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

            otherlv_14=(Token)match(input,37,FOLLOW_37_in_ruleGovernanceStrategy3262); 

                	newLeafNode(otherlv_14, grammarAccess.getGovernanceStrategyAccess().getRightCurlyBracketKeyword_9());
                
            otherlv_15=(Token)match(input,37,FOLLOW_37_in_ruleGovernanceStrategy3274); 

                	newLeafNode(otherlv_15, grammarAccess.getGovernanceStrategyAccess().getRightCurlyBracketKeyword_10());
                

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
    // $ANTLR end "ruleGovernanceStrategy"


    // $ANTLR start "entryRuleWIAcceptance"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1597:1: entryRuleWIAcceptance returns [EObject current=null] : iv_ruleWIAcceptance= ruleWIAcceptance EOF ;
    public final EObject entryRuleWIAcceptance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWIAcceptance = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1598:2: (iv_ruleWIAcceptance= ruleWIAcceptance EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1599:2: iv_ruleWIAcceptance= ruleWIAcceptance EOF
            {
             newCompositeNode(grammarAccess.getWIAcceptanceRule()); 
            pushFollow(FOLLOW_ruleWIAcceptance_in_entryRuleWIAcceptance3310);
            iv_ruleWIAcceptance=ruleWIAcceptance();

            state._fsp--;

             current =iv_ruleWIAcceptance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWIAcceptance3320); 

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
    // $ANTLR end "entryRuleWIAcceptance"


    // $ANTLR start "ruleWIAcceptance"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1606:1: ruleWIAcceptance returns [EObject current=null] : (otherlv_0= 'WIAcceptance' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'BackLogLimit' ( (lv_backlogQLimit_6_0= RULE_INT ) ) )? (otherlv_7= 'WIPLimit' ( (lv_readyQLimit_8_0= RULE_INT ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleWIAcceptance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token lv_backlogQLimit_6_0=null;
        Token otherlv_7=null;
        Token lv_readyQLimit_8_0=null;
        Token otherlv_9=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1609:28: ( (otherlv_0= 'WIAcceptance' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'BackLogLimit' ( (lv_backlogQLimit_6_0= RULE_INT ) ) )? (otherlv_7= 'WIPLimit' ( (lv_readyQLimit_8_0= RULE_INT ) ) )? otherlv_9= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1610:1: (otherlv_0= 'WIAcceptance' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'BackLogLimit' ( (lv_backlogQLimit_6_0= RULE_INT ) ) )? (otherlv_7= 'WIPLimit' ( (lv_readyQLimit_8_0= RULE_INT ) ) )? otherlv_9= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1610:1: (otherlv_0= 'WIAcceptance' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'BackLogLimit' ( (lv_backlogQLimit_6_0= RULE_INT ) ) )? (otherlv_7= 'WIPLimit' ( (lv_readyQLimit_8_0= RULE_INT ) ) )? otherlv_9= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1610:3: otherlv_0= 'WIAcceptance' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'BackLogLimit' ( (lv_backlogQLimit_6_0= RULE_INT ) ) )? (otherlv_7= 'WIPLimit' ( (lv_readyQLimit_8_0= RULE_INT ) ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,75,FOLLOW_75_in_ruleWIAcceptance3357); 

                	newLeafNode(otherlv_0, grammarAccess.getWIAcceptanceAccess().getWIAcceptanceKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1614:1: ( (otherlv_1= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1615:1: (otherlv_1= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1615:1: (otherlv_1= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1616:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getWIAcceptanceRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWIAcceptance3377); 

            		newLeafNode(otherlv_1, grammarAccess.getWIAcceptanceAccess().getTypeWIAcceptanceRuleTypeCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleWIAcceptance3389); 

                	newLeafNode(otherlv_2, grammarAccess.getWIAcceptanceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1631:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==13) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1631:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleWIAcceptance3402); 

                        	newLeafNode(otherlv_3, grammarAccess.getWIAcceptanceAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1635:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1636:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1636:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1637:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWIAcceptance3419); 

                    			newLeafNode(lv_description_4_0, grammarAccess.getWIAcceptanceAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWIAcceptanceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1653:4: (otherlv_5= 'BackLogLimit' ( (lv_backlogQLimit_6_0= RULE_INT ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==76) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1653:6: otherlv_5= 'BackLogLimit' ( (lv_backlogQLimit_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,76,FOLLOW_76_in_ruleWIAcceptance3439); 

                        	newLeafNode(otherlv_5, grammarAccess.getWIAcceptanceAccess().getBackLogLimitKeyword_4_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1657:1: ( (lv_backlogQLimit_6_0= RULE_INT ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1658:1: (lv_backlogQLimit_6_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1658:1: (lv_backlogQLimit_6_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1659:3: lv_backlogQLimit_6_0= RULE_INT
                    {
                    lv_backlogQLimit_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWIAcceptance3456); 

                    			newLeafNode(lv_backlogQLimit_6_0, grammarAccess.getWIAcceptanceAccess().getBacklogQLimitINTTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWIAcceptanceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"backlogQLimit",
                            		lv_backlogQLimit_6_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1675:4: (otherlv_7= 'WIPLimit' ( (lv_readyQLimit_8_0= RULE_INT ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==77) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1675:6: otherlv_7= 'WIPLimit' ( (lv_readyQLimit_8_0= RULE_INT ) )
                    {
                    otherlv_7=(Token)match(input,77,FOLLOW_77_in_ruleWIAcceptance3476); 

                        	newLeafNode(otherlv_7, grammarAccess.getWIAcceptanceAccess().getWIPLimitKeyword_5_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1679:1: ( (lv_readyQLimit_8_0= RULE_INT ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1680:1: (lv_readyQLimit_8_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1680:1: (lv_readyQLimit_8_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1681:3: lv_readyQLimit_8_0= RULE_INT
                    {
                    lv_readyQLimit_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWIAcceptance3493); 

                    			newLeafNode(lv_readyQLimit_8_0, grammarAccess.getWIAcceptanceAccess().getReadyQLimitINTTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWIAcceptanceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"readyQLimit",
                            		lv_readyQLimit_8_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,37,FOLLOW_37_in_ruleWIAcceptance3512); 

                	newLeafNode(otherlv_9, grammarAccess.getWIAcceptanceAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleWIAcceptance"


    // $ANTLR start "entryRuleWISelection"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1709:1: entryRuleWISelection returns [EObject current=null] : iv_ruleWISelection= ruleWISelection EOF ;
    public final EObject entryRuleWISelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWISelection = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1710:2: (iv_ruleWISelection= ruleWISelection EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1711:2: iv_ruleWISelection= ruleWISelection EOF
            {
             newCompositeNode(grammarAccess.getWISelectionRule()); 
            pushFollow(FOLLOW_ruleWISelection_in_entryRuleWISelection3548);
            iv_ruleWISelection=ruleWISelection();

            state._fsp--;

             current =iv_ruleWISelection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWISelection3558); 

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
    // $ANTLR end "entryRuleWISelection"


    // $ANTLR start "ruleWISelection"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1718:1: ruleWISelection returns [EObject current=null] : (otherlv_0= 'WISelection' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleWISelection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1721:28: ( (otherlv_0= 'WISelection' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1722:1: (otherlv_0= 'WISelection' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1722:1: (otherlv_0= 'WISelection' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1722:3: otherlv_0= 'WISelection' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleWISelection3595); 

                	newLeafNode(otherlv_0, grammarAccess.getWISelectionAccess().getWISelectionKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1726:1: ( (otherlv_1= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1727:1: (otherlv_1= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1727:1: (otherlv_1= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1728:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getWISelectionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWISelection3615); 

            		newLeafNode(otherlv_1, grammarAccess.getWISelectionAccess().getTypeWISelectionRuleTypeCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleWISelection3627); 

                	newLeafNode(otherlv_2, grammarAccess.getWISelectionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1743:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==13) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1743:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleWISelection3640); 

                        	newLeafNode(otherlv_3, grammarAccess.getWISelectionAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1747:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1748:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1748:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1749:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWISelection3657); 

                    			newLeafNode(lv_description_4_0, grammarAccess.getWISelectionAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWISelectionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleWISelection3676); 

                	newLeafNode(otherlv_5, grammarAccess.getWISelectionAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleWISelection"


    // $ANTLR start "entryRuleWIAssignment"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1777:1: entryRuleWIAssignment returns [EObject current=null] : iv_ruleWIAssignment= ruleWIAssignment EOF ;
    public final EObject entryRuleWIAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWIAssignment = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1778:2: (iv_ruleWIAssignment= ruleWIAssignment EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1779:2: iv_ruleWIAssignment= ruleWIAssignment EOF
            {
             newCompositeNode(grammarAccess.getWIAssignmentRule()); 
            pushFollow(FOLLOW_ruleWIAssignment_in_entryRuleWIAssignment3712);
            iv_ruleWIAssignment=ruleWIAssignment();

            state._fsp--;

             current =iv_ruleWIAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWIAssignment3722); 

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
    // $ANTLR end "entryRuleWIAssignment"


    // $ANTLR start "ruleWIAssignment"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1786:1: ruleWIAssignment returns [EObject current=null] : (otherlv_0= 'WIAssignment' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleWIAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1789:28: ( (otherlv_0= 'WIAssignment' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1790:1: (otherlv_0= 'WIAssignment' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1790:1: (otherlv_0= 'WIAssignment' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1790:3: otherlv_0= 'WIAssignment' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_79_in_ruleWIAssignment3759); 

                	newLeafNode(otherlv_0, grammarAccess.getWIAssignmentAccess().getWIAssignmentKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1794:1: ( (otherlv_1= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1795:1: (otherlv_1= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1795:1: (otherlv_1= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1796:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getWIAssignmentRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWIAssignment3779); 

            		newLeafNode(otherlv_1, grammarAccess.getWIAssignmentAccess().getTypeWIAssignmentRuleTypeCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleWIAssignment3791); 

                	newLeafNode(otherlv_2, grammarAccess.getWIAssignmentAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1811:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==13) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1811:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleWIAssignment3804); 

                        	newLeafNode(otherlv_3, grammarAccess.getWIAssignmentAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1815:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1816:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1816:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1817:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWIAssignment3821); 

                    			newLeafNode(lv_description_4_0, grammarAccess.getWIAssignmentAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWIAssignmentRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleWIAssignment3840); 

                	newLeafNode(otherlv_5, grammarAccess.getWIAssignmentAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleWIAssignment"


    // $ANTLR start "entryRuleResourceAllocation"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1845:1: entryRuleResourceAllocation returns [EObject current=null] : iv_ruleResourceAllocation= ruleResourceAllocation EOF ;
    public final EObject entryRuleResourceAllocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceAllocation = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1846:2: (iv_ruleResourceAllocation= ruleResourceAllocation EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1847:2: iv_ruleResourceAllocation= ruleResourceAllocation EOF
            {
             newCompositeNode(grammarAccess.getResourceAllocationRule()); 
            pushFollow(FOLLOW_ruleResourceAllocation_in_entryRuleResourceAllocation3876);
            iv_ruleResourceAllocation=ruleResourceAllocation();

            state._fsp--;

             current =iv_ruleResourceAllocation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceAllocation3886); 

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
    // $ANTLR end "entryRuleResourceAllocation"


    // $ANTLR start "ruleResourceAllocation"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1854:1: ruleResourceAllocation returns [EObject current=null] : (otherlv_0= 'ResourceAllocation' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleResourceAllocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1857:28: ( (otherlv_0= 'ResourceAllocation' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1858:1: (otherlv_0= 'ResourceAllocation' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1858:1: (otherlv_0= 'ResourceAllocation' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1858:3: otherlv_0= 'ResourceAllocation' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,80,FOLLOW_80_in_ruleResourceAllocation3923); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceAllocationAccess().getResourceAllocationKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1862:1: ( (otherlv_1= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1863:1: (otherlv_1= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1863:1: (otherlv_1= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1864:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceAllocationRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResourceAllocation3943); 

            		newLeafNode(otherlv_1, grammarAccess.getResourceAllocationAccess().getTypeResourceAllocationRuleTypeCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleResourceAllocation3955); 

                	newLeafNode(otherlv_2, grammarAccess.getResourceAllocationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1879:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==13) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1879:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleResourceAllocation3968); 

                        	newLeafNode(otherlv_3, grammarAccess.getResourceAllocationAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1883:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1884:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1884:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1885:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceAllocation3985); 

                    			newLeafNode(lv_description_4_0, grammarAccess.getResourceAllocationAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getResourceAllocationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleResourceAllocation4004); 

                	newLeafNode(otherlv_5, grammarAccess.getResourceAllocationAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleResourceAllocation"


    // $ANTLR start "entryRuleResourceOutsourcing"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1913:1: entryRuleResourceOutsourcing returns [EObject current=null] : iv_ruleResourceOutsourcing= ruleResourceOutsourcing EOF ;
    public final EObject entryRuleResourceOutsourcing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceOutsourcing = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1914:2: (iv_ruleResourceOutsourcing= ruleResourceOutsourcing EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1915:2: iv_ruleResourceOutsourcing= ruleResourceOutsourcing EOF
            {
             newCompositeNode(grammarAccess.getResourceOutsourcingRule()); 
            pushFollow(FOLLOW_ruleResourceOutsourcing_in_entryRuleResourceOutsourcing4040);
            iv_ruleResourceOutsourcing=ruleResourceOutsourcing();

            state._fsp--;

             current =iv_ruleResourceOutsourcing; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceOutsourcing4050); 

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
    // $ANTLR end "entryRuleResourceOutsourcing"


    // $ANTLR start "ruleResourceOutsourcing"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1922:1: ruleResourceOutsourcing returns [EObject current=null] : (otherlv_0= 'ResourceOutsourcing' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleResourceOutsourcing() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1925:28: ( (otherlv_0= 'ResourceOutsourcing' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1926:1: (otherlv_0= 'ResourceOutsourcing' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1926:1: (otherlv_0= 'ResourceOutsourcing' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1926:3: otherlv_0= 'ResourceOutsourcing' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,81,FOLLOW_81_in_ruleResourceOutsourcing4087); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceOutsourcingAccess().getResourceOutsourcingKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1930:1: ( (otherlv_1= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1931:1: (otherlv_1= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1931:1: (otherlv_1= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1932:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceOutsourcingRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResourceOutsourcing4107); 

            		newLeafNode(otherlv_1, grammarAccess.getResourceOutsourcingAccess().getTypeResourceOutsourcingRuleTypeCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleResourceOutsourcing4119); 

                	newLeafNode(otherlv_2, grammarAccess.getResourceOutsourcingAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1947:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==13) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1947:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleResourceOutsourcing4132); 

                        	newLeafNode(otherlv_3, grammarAccess.getResourceOutsourcingAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1951:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1952:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1952:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1953:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceOutsourcing4149); 

                    			newLeafNode(lv_description_4_0, grammarAccess.getResourceOutsourcingAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getResourceOutsourcingRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleResourceOutsourcing4168); 

                	newLeafNode(otherlv_5, grammarAccess.getResourceOutsourcingAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleResourceOutsourcing"


    // $ANTLR start "entryRuleWIAcceptanceRuleType"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1981:1: entryRuleWIAcceptanceRuleType returns [EObject current=null] : iv_ruleWIAcceptanceRuleType= ruleWIAcceptanceRuleType EOF ;
    public final EObject entryRuleWIAcceptanceRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWIAcceptanceRuleType = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1982:2: (iv_ruleWIAcceptanceRuleType= ruleWIAcceptanceRuleType EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1983:2: iv_ruleWIAcceptanceRuleType= ruleWIAcceptanceRuleType EOF
            {
             newCompositeNode(grammarAccess.getWIAcceptanceRuleTypeRule()); 
            pushFollow(FOLLOW_ruleWIAcceptanceRuleType_in_entryRuleWIAcceptanceRuleType4204);
            iv_ruleWIAcceptanceRuleType=ruleWIAcceptanceRuleType();

            state._fsp--;

             current =iv_ruleWIAcceptanceRuleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWIAcceptanceRuleType4214); 

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
    // $ANTLR end "entryRuleWIAcceptanceRuleType"


    // $ANTLR start "ruleWIAcceptanceRuleType"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1990:1: ruleWIAcceptanceRuleType returns [EObject current=null] : (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleWIAcceptanceRuleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1993:28: ( (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1994:1: (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1994:1: (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1994:3: otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,82,FOLLOW_82_in_ruleWIAcceptanceRuleType4251); 

                	newLeafNode(otherlv_0, grammarAccess.getWIAcceptanceRuleTypeAccess().getRuleTypeKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1998:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1999:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:1999:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2000:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWIAcceptanceRuleType4268); 

            			newLeafNode(lv_name_1_0, grammarAccess.getWIAcceptanceRuleTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWIAcceptanceRuleTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleWIAcceptanceRuleType4285); 

                	newLeafNode(otherlv_2, grammarAccess.getWIAcceptanceRuleTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2020:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==13) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2020:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleWIAcceptanceRuleType4298); 

                        	newLeafNode(otherlv_3, grammarAccess.getWIAcceptanceRuleTypeAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2024:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2025:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2025:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2026:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWIAcceptanceRuleType4315); 

                    			newLeafNode(lv_description_4_0, grammarAccess.getWIAcceptanceRuleTypeAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWIAcceptanceRuleTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleWIAcceptanceRuleType4334); 

                	newLeafNode(otherlv_5, grammarAccess.getWIAcceptanceRuleTypeAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleWIAcceptanceRuleType"


    // $ANTLR start "entryRuleWISelectionRuleType"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2054:1: entryRuleWISelectionRuleType returns [EObject current=null] : iv_ruleWISelectionRuleType= ruleWISelectionRuleType EOF ;
    public final EObject entryRuleWISelectionRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWISelectionRuleType = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2055:2: (iv_ruleWISelectionRuleType= ruleWISelectionRuleType EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2056:2: iv_ruleWISelectionRuleType= ruleWISelectionRuleType EOF
            {
             newCompositeNode(grammarAccess.getWISelectionRuleTypeRule()); 
            pushFollow(FOLLOW_ruleWISelectionRuleType_in_entryRuleWISelectionRuleType4370);
            iv_ruleWISelectionRuleType=ruleWISelectionRuleType();

            state._fsp--;

             current =iv_ruleWISelectionRuleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWISelectionRuleType4380); 

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
    // $ANTLR end "entryRuleWISelectionRuleType"


    // $ANTLR start "ruleWISelectionRuleType"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2063:1: ruleWISelectionRuleType returns [EObject current=null] : (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleWISelectionRuleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2066:28: ( (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2067:1: (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2067:1: (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2067:3: otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,82,FOLLOW_82_in_ruleWISelectionRuleType4417); 

                	newLeafNode(otherlv_0, grammarAccess.getWISelectionRuleTypeAccess().getRuleTypeKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2071:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2072:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2072:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2073:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWISelectionRuleType4434); 

            			newLeafNode(lv_name_1_0, grammarAccess.getWISelectionRuleTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWISelectionRuleTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleWISelectionRuleType4451); 

                	newLeafNode(otherlv_2, grammarAccess.getWISelectionRuleTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2093:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==13) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2093:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleWISelectionRuleType4464); 

                        	newLeafNode(otherlv_3, grammarAccess.getWISelectionRuleTypeAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2097:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2098:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2098:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2099:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWISelectionRuleType4481); 

                    			newLeafNode(lv_description_4_0, grammarAccess.getWISelectionRuleTypeAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWISelectionRuleTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleWISelectionRuleType4500); 

                	newLeafNode(otherlv_5, grammarAccess.getWISelectionRuleTypeAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleWISelectionRuleType"


    // $ANTLR start "entryRuleWIAssignmentRuleType"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2127:1: entryRuleWIAssignmentRuleType returns [EObject current=null] : iv_ruleWIAssignmentRuleType= ruleWIAssignmentRuleType EOF ;
    public final EObject entryRuleWIAssignmentRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWIAssignmentRuleType = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2128:2: (iv_ruleWIAssignmentRuleType= ruleWIAssignmentRuleType EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2129:2: iv_ruleWIAssignmentRuleType= ruleWIAssignmentRuleType EOF
            {
             newCompositeNode(grammarAccess.getWIAssignmentRuleTypeRule()); 
            pushFollow(FOLLOW_ruleWIAssignmentRuleType_in_entryRuleWIAssignmentRuleType4536);
            iv_ruleWIAssignmentRuleType=ruleWIAssignmentRuleType();

            state._fsp--;

             current =iv_ruleWIAssignmentRuleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWIAssignmentRuleType4546); 

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
    // $ANTLR end "entryRuleWIAssignmentRuleType"


    // $ANTLR start "ruleWIAssignmentRuleType"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2136:1: ruleWIAssignmentRuleType returns [EObject current=null] : (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleWIAssignmentRuleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2139:28: ( (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2140:1: (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2140:1: (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2140:3: otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,82,FOLLOW_82_in_ruleWIAssignmentRuleType4583); 

                	newLeafNode(otherlv_0, grammarAccess.getWIAssignmentRuleTypeAccess().getRuleTypeKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2144:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2145:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2145:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2146:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWIAssignmentRuleType4600); 

            			newLeafNode(lv_name_1_0, grammarAccess.getWIAssignmentRuleTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWIAssignmentRuleTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleWIAssignmentRuleType4617); 

                	newLeafNode(otherlv_2, grammarAccess.getWIAssignmentRuleTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2166:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==13) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2166:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleWIAssignmentRuleType4630); 

                        	newLeafNode(otherlv_3, grammarAccess.getWIAssignmentRuleTypeAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2170:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2171:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2171:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2172:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWIAssignmentRuleType4647); 

                    			newLeafNode(lv_description_4_0, grammarAccess.getWIAssignmentRuleTypeAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWIAssignmentRuleTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleWIAssignmentRuleType4666); 

                	newLeafNode(otherlv_5, grammarAccess.getWIAssignmentRuleTypeAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleWIAssignmentRuleType"


    // $ANTLR start "entryRuleResourceAllocationRuleType"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2200:1: entryRuleResourceAllocationRuleType returns [EObject current=null] : iv_ruleResourceAllocationRuleType= ruleResourceAllocationRuleType EOF ;
    public final EObject entryRuleResourceAllocationRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceAllocationRuleType = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2201:2: (iv_ruleResourceAllocationRuleType= ruleResourceAllocationRuleType EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2202:2: iv_ruleResourceAllocationRuleType= ruleResourceAllocationRuleType EOF
            {
             newCompositeNode(grammarAccess.getResourceAllocationRuleTypeRule()); 
            pushFollow(FOLLOW_ruleResourceAllocationRuleType_in_entryRuleResourceAllocationRuleType4702);
            iv_ruleResourceAllocationRuleType=ruleResourceAllocationRuleType();

            state._fsp--;

             current =iv_ruleResourceAllocationRuleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceAllocationRuleType4712); 

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
    // $ANTLR end "entryRuleResourceAllocationRuleType"


    // $ANTLR start "ruleResourceAllocationRuleType"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2209:1: ruleResourceAllocationRuleType returns [EObject current=null] : (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleResourceAllocationRuleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2212:28: ( (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2213:1: (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2213:1: (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2213:3: otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,82,FOLLOW_82_in_ruleResourceAllocationRuleType4749); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceAllocationRuleTypeAccess().getRuleTypeKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2217:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2218:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2218:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2219:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResourceAllocationRuleType4766); 

            			newLeafNode(lv_name_1_0, grammarAccess.getResourceAllocationRuleTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceAllocationRuleTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleResourceAllocationRuleType4783); 

                	newLeafNode(otherlv_2, grammarAccess.getResourceAllocationRuleTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2239:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==13) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2239:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleResourceAllocationRuleType4796); 

                        	newLeafNode(otherlv_3, grammarAccess.getResourceAllocationRuleTypeAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2243:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2244:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2244:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2245:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceAllocationRuleType4813); 

                    			newLeafNode(lv_description_4_0, grammarAccess.getResourceAllocationRuleTypeAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getResourceAllocationRuleTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleResourceAllocationRuleType4832); 

                	newLeafNode(otherlv_5, grammarAccess.getResourceAllocationRuleTypeAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleResourceAllocationRuleType"


    // $ANTLR start "entryRuleResourceOutsourcingRuleType"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2273:1: entryRuleResourceOutsourcingRuleType returns [EObject current=null] : iv_ruleResourceOutsourcingRuleType= ruleResourceOutsourcingRuleType EOF ;
    public final EObject entryRuleResourceOutsourcingRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceOutsourcingRuleType = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2274:2: (iv_ruleResourceOutsourcingRuleType= ruleResourceOutsourcingRuleType EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2275:2: iv_ruleResourceOutsourcingRuleType= ruleResourceOutsourcingRuleType EOF
            {
             newCompositeNode(grammarAccess.getResourceOutsourcingRuleTypeRule()); 
            pushFollow(FOLLOW_ruleResourceOutsourcingRuleType_in_entryRuleResourceOutsourcingRuleType4868);
            iv_ruleResourceOutsourcingRuleType=ruleResourceOutsourcingRuleType();

            state._fsp--;

             current =iv_ruleResourceOutsourcingRuleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceOutsourcingRuleType4878); 

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
    // $ANTLR end "entryRuleResourceOutsourcingRuleType"


    // $ANTLR start "ruleResourceOutsourcingRuleType"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2282:1: ruleResourceOutsourcingRuleType returns [EObject current=null] : (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleResourceOutsourcingRuleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2285:28: ( (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2286:1: (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2286:1: (otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2286:3: otherlv_0= 'RuleType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,82,FOLLOW_82_in_ruleResourceOutsourcingRuleType4915); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceOutsourcingRuleTypeAccess().getRuleTypeKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2290:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2291:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2291:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2292:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResourceOutsourcingRuleType4932); 

            			newLeafNode(lv_name_1_0, grammarAccess.getResourceOutsourcingRuleTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceOutsourcingRuleTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleResourceOutsourcingRuleType4949); 

                	newLeafNode(otherlv_2, grammarAccess.getResourceOutsourcingRuleTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2312:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==13) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2312:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleResourceOutsourcingRuleType4962); 

                        	newLeafNode(otherlv_3, grammarAccess.getResourceOutsourcingRuleTypeAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2316:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2317:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2317:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2318:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceOutsourcingRuleType4979); 

                    			newLeafNode(lv_description_4_0, grammarAccess.getResourceOutsourcingRuleTypeAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getResourceOutsourcingRuleTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleResourceOutsourcingRuleType4998); 

                	newLeafNode(otherlv_5, grammarAccess.getResourceOutsourcingRuleTypeAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleResourceOutsourcingRuleType"


    // $ANTLR start "entryRuleMechanism"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2346:1: entryRuleMechanism returns [EObject current=null] : iv_ruleMechanism= ruleMechanism EOF ;
    public final EObject entryRuleMechanism() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMechanism = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2347:2: (iv_ruleMechanism= ruleMechanism EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2348:2: iv_ruleMechanism= ruleMechanism EOF
            {
             newCompositeNode(grammarAccess.getMechanismRule()); 
            pushFollow(FOLLOW_ruleMechanism_in_entryRuleMechanism5034);
            iv_ruleMechanism=ruleMechanism();

            state._fsp--;

             current =iv_ruleMechanism; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMechanism5044); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2355:1: ruleMechanism returns [EObject current=null] : (otherlv_0= 'Mechanism' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleParameter ) ) otherlv_4= '{' (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleMechanismAttribute ) )+ otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleMechanism() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;

        EObject lv_attributes_9_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2358:28: ( (otherlv_0= 'Mechanism' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleParameter ) ) otherlv_4= '{' (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleMechanismAttribute ) )+ otherlv_10= '}' )? otherlv_11= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2359:1: (otherlv_0= 'Mechanism' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleParameter ) ) otherlv_4= '{' (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleMechanismAttribute ) )+ otherlv_10= '}' )? otherlv_11= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2359:1: (otherlv_0= 'Mechanism' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleParameter ) ) otherlv_4= '{' (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleMechanismAttribute ) )+ otherlv_10= '}' )? otherlv_11= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2359:3: otherlv_0= 'Mechanism' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleParameter ) ) otherlv_4= '{' (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleMechanismAttribute ) )+ otherlv_10= '}' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,83,FOLLOW_83_in_ruleMechanism5081); 

                	newLeafNode(otherlv_0, grammarAccess.getMechanismAccess().getMechanismKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2363:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2364:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2364:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2365:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMechanism5098); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMechanismAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMechanismRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,84,FOLLOW_84_in_ruleMechanism5115); 

                	newLeafNode(otherlv_2, grammarAccess.getMechanismAccess().getEqualsSignKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2385:1: ( (lv_value_3_0= ruleParameter ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2386:1: (lv_value_3_0= ruleParameter )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2386:1: (lv_value_3_0= ruleParameter )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2387:3: lv_value_3_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getMechanismAccess().getValueParameterParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleMechanism5136);
            lv_value_3_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMechanismRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"Parameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,36,FOLLOW_36_in_ruleMechanism5148); 

                	newLeafNode(otherlv_4, grammarAccess.getMechanismAccess().getLeftCurlyBracketKeyword_4());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2407:1: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==13) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2407:3: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleMechanism5161); 

                        	newLeafNode(otherlv_5, grammarAccess.getMechanismAccess().getDescriptionKeyword_5_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2411:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2412:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2412:1: (lv_description_6_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2413:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMechanism5178); 

                    			newLeafNode(lv_description_6_0, grammarAccess.getMechanismAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMechanismRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2429:4: (otherlv_7= 'Attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleMechanismAttribute ) )+ otherlv_10= '}' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==85) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2429:6: otherlv_7= 'Attributes' otherlv_8= '{' ( (lv_attributes_9_0= ruleMechanismAttribute ) )+ otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,85,FOLLOW_85_in_ruleMechanism5198); 

                        	newLeafNode(otherlv_7, grammarAccess.getMechanismAccess().getAttributesKeyword_6_0());
                        
                    otherlv_8=(Token)match(input,36,FOLLOW_36_in_ruleMechanism5210); 

                        	newLeafNode(otherlv_8, grammarAccess.getMechanismAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2437:1: ( (lv_attributes_9_0= ruleMechanismAttribute ) )+
                    int cnt45=0;
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==RULE_STRING) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2438:1: (lv_attributes_9_0= ruleMechanismAttribute )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2438:1: (lv_attributes_9_0= ruleMechanismAttribute )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2439:3: lv_attributes_9_0= ruleMechanismAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMechanismAccess().getAttributesMechanismAttributeParserRuleCall_6_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMechanismAttribute_in_ruleMechanism5231);
                    	    lv_attributes_9_0=ruleMechanismAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMechanismRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_9_0, 
                    	            		"MechanismAttribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt45 >= 1 ) break loop45;
                                EarlyExitException eee =
                                    new EarlyExitException(45, input);
                                throw eee;
                        }
                        cnt45++;
                    } while (true);

                    otherlv_10=(Token)match(input,37,FOLLOW_37_in_ruleMechanism5244); 

                        	newLeafNode(otherlv_10, grammarAccess.getMechanismAccess().getRightCurlyBracketKeyword_6_3());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,37,FOLLOW_37_in_ruleMechanism5258); 

                	newLeafNode(otherlv_11, grammarAccess.getMechanismAccess().getRightCurlyBracketKeyword_7());
                

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


    // $ANTLR start "entryRuleMechanismAttribute"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2471:1: entryRuleMechanismAttribute returns [EObject current=null] : iv_ruleMechanismAttribute= ruleMechanismAttribute EOF ;
    public final EObject entryRuleMechanismAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMechanismAttribute = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2472:2: (iv_ruleMechanismAttribute= ruleMechanismAttribute EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2473:2: iv_ruleMechanismAttribute= ruleMechanismAttribute EOF
            {
             newCompositeNode(grammarAccess.getMechanismAttributeRule()); 
            pushFollow(FOLLOW_ruleMechanismAttribute_in_entryRuleMechanismAttribute5294);
            iv_ruleMechanismAttribute=ruleMechanismAttribute();

            state._fsp--;

             current =iv_ruleMechanismAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMechanismAttribute5304); 

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
    // $ANTLR end "entryRuleMechanismAttribute"


    // $ANTLR start "ruleMechanismAttribute"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2480:1: ruleMechanismAttribute returns [EObject current=null] : ( ( (lv_attribute_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) ) ;
    public final EObject ruleMechanismAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_attribute_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2483:28: ( ( ( (lv_attribute_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2484:1: ( ( (lv_attribute_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2484:1: ( ( (lv_attribute_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2484:2: ( (lv_attribute_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2484:2: ( (lv_attribute_0_0= RULE_STRING ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2485:1: (lv_attribute_0_0= RULE_STRING )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2485:1: (lv_attribute_0_0= RULE_STRING )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2486:3: lv_attribute_0_0= RULE_STRING
            {
            lv_attribute_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMechanismAttribute5346); 

            			newLeafNode(lv_attribute_0_0, grammarAccess.getMechanismAttributeAccess().getAttributeSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMechanismAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"attribute",
                    		lv_attribute_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,84,FOLLOW_84_in_ruleMechanismAttribute5363); 

                	newLeafNode(otherlv_1, grammarAccess.getMechanismAttributeAccess().getEqualsSignKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2506:1: ( (lv_value_2_0= ruleParameter ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2507:1: (lv_value_2_0= ruleParameter )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2507:1: (lv_value_2_0= ruleParameter )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2508:3: lv_value_2_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getMechanismAttributeAccess().getValueParameterParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleMechanismAttribute5384);
            lv_value_2_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMechanismAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"Parameter");
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
    // $ANTLR end "ruleMechanismAttribute"


    // $ANTLR start "entryRuleWorkSource"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2532:1: entryRuleWorkSource returns [EObject current=null] : iv_ruleWorkSource= ruleWorkSource EOF ;
    public final EObject entryRuleWorkSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkSource = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2533:2: (iv_ruleWorkSource= ruleWorkSource EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2534:2: iv_ruleWorkSource= ruleWorkSource EOF
            {
             newCompositeNode(grammarAccess.getWorkSourceRule()); 
            pushFollow(FOLLOW_ruleWorkSource_in_entryRuleWorkSource5420);
            iv_ruleWorkSource=ruleWorkSource();

            state._fsp--;

             current =iv_ruleWorkSource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkSource5430); 

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
    // $ANTLR end "entryRuleWorkSource"


    // $ANTLR start "ruleWorkSource"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2541:1: ruleWorkSource returns [EObject current=null] : ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'WorkSource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'AssignTo' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )? ( (lv_assignmentRule_10_0= ruleWIAssignment ) )? otherlv_11= '}' ) ;
    public final EObject ruleWorkSource() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_assignmentRule_10_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2544:28: ( ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'WorkSource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'AssignTo' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )? ( (lv_assignmentRule_10_0= ruleWIAssignment ) )? otherlv_11= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2545:1: ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'WorkSource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'AssignTo' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )? ( (lv_assignmentRule_10_0= ruleWIAssignment ) )? otherlv_11= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2545:1: ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'WorkSource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'AssignTo' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )? ( (lv_assignmentRule_10_0= ruleWIAssignment ) )? otherlv_11= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2545:2: ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'WorkSource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'AssignTo' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )? ( (lv_assignmentRule_10_0= ruleWIAssignment ) )? otherlv_11= '}'
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2545:2: ( (lv_id_0_0= RULE_INT ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_INT) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2546:1: (lv_id_0_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2546:1: (lv_id_0_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2547:3: lv_id_0_0= RULE_INT
                    {
                    lv_id_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWorkSource5472); 

                    			newLeafNode(lv_id_0_0, grammarAccess.getWorkSourceAccess().getIdINTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkSourceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_0_0, 
                            		"INT");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,86,FOLLOW_86_in_ruleWorkSource5490); 

                	newLeafNode(otherlv_1, grammarAccess.getWorkSourceAccess().getWorkSourceKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2567:1: ( (lv_name_2_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2568:1: (lv_name_2_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2568:1: (lv_name_2_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2569:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkSource5507); 

            			newLeafNode(lv_name_2_0, grammarAccess.getWorkSourceAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWorkSourceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleWorkSource5524); 

                	newLeafNode(otherlv_3, grammarAccess.getWorkSourceAccess().getLeftCurlyBracketKeyword_3());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2589:1: (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==13) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2589:3: otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleWorkSource5537); 

                        	newLeafNode(otherlv_4, grammarAccess.getWorkSourceAccess().getDescriptionKeyword_4_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2593:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2594:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2594:1: (lv_description_5_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2595:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWorkSource5554); 

                    			newLeafNode(lv_description_5_0, grammarAccess.getWorkSourceAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkSourceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2611:4: (otherlv_6= 'AssignTo' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==87) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2611:6: otherlv_6= 'AssignTo' otherlv_7= '{' ( (otherlv_8= RULE_ID ) )+ otherlv_9= '}'
                    {
                    otherlv_6=(Token)match(input,87,FOLLOW_87_in_ruleWorkSource5574); 

                        	newLeafNode(otherlv_6, grammarAccess.getWorkSourceAccess().getAssignToKeyword_5_0());
                        
                    otherlv_7=(Token)match(input,36,FOLLOW_36_in_ruleWorkSource5586); 

                        	newLeafNode(otherlv_7, grammarAccess.getWorkSourceAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2619:1: ( (otherlv_8= RULE_ID ) )+
                    int cnt49=0;
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==RULE_ID) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2620:1: (otherlv_8= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2620:1: (otherlv_8= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2621:3: otherlv_8= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getWorkSourceRule());
                    	    	        }
                    	            
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkSource5606); 

                    	    		newLeafNode(otherlv_8, grammarAccess.getWorkSourceAccess().getAssignToServiceProviderCrossReference_5_2_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt49 >= 1 ) break loop49;
                                EarlyExitException eee =
                                    new EarlyExitException(49, input);
                                throw eee;
                        }
                        cnt49++;
                    } while (true);

                    otherlv_9=(Token)match(input,37,FOLLOW_37_in_ruleWorkSource5619); 

                        	newLeafNode(otherlv_9, grammarAccess.getWorkSourceAccess().getRightCurlyBracketKeyword_5_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2636:3: ( (lv_assignmentRule_10_0= ruleWIAssignment ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==79) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2637:1: (lv_assignmentRule_10_0= ruleWIAssignment )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2637:1: (lv_assignmentRule_10_0= ruleWIAssignment )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2638:3: lv_assignmentRule_10_0= ruleWIAssignment
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkSourceAccess().getAssignmentRuleWIAssignmentParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWIAssignment_in_ruleWorkSource5642);
                    lv_assignmentRule_10_0=ruleWIAssignment();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWorkSourceRule());
                    	        }
                           		set(
                           			current, 
                           			"assignmentRule",
                            		lv_assignmentRule_10_0, 
                            		"WIAssignment");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,37,FOLLOW_37_in_ruleWorkSource5655); 

                	newLeafNode(otherlv_11, grammarAccess.getWorkSourceAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleWorkSource"


    // $ANTLR start "entryRuleWorkItemNetwork"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2666:1: entryRuleWorkItemNetwork returns [EObject current=null] : iv_ruleWorkItemNetwork= ruleWorkItemNetwork EOF ;
    public final EObject entryRuleWorkItemNetwork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkItemNetwork = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2667:2: (iv_ruleWorkItemNetwork= ruleWorkItemNetwork EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2668:2: iv_ruleWorkItemNetwork= ruleWorkItemNetwork EOF
            {
             newCompositeNode(grammarAccess.getWorkItemNetworkRule()); 
            pushFollow(FOLLOW_ruleWorkItemNetwork_in_entryRuleWorkItemNetwork5691);
            iv_ruleWorkItemNetwork=ruleWorkItemNetwork();

            state._fsp--;

             current =iv_ruleWorkItemNetwork; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkItemNetwork5701); 

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
    // $ANTLR end "entryRuleWorkItemNetwork"


    // $ANTLR start "ruleWorkItemNetwork"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2675:1: ruleWorkItemNetwork returns [EObject current=null] : ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'WorkItemNetwork' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= 'WorkItems' otherlv_7= '{' ( (lv_workItems_8_0= ruleWorkItem ) )+ otherlv_9= '}' otherlv_10= '}' ) ;
    public final EObject ruleWorkItemNetwork() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_workItems_8_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2678:28: ( ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'WorkItemNetwork' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= 'WorkItems' otherlv_7= '{' ( (lv_workItems_8_0= ruleWorkItem ) )+ otherlv_9= '}' otherlv_10= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2679:1: ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'WorkItemNetwork' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= 'WorkItems' otherlv_7= '{' ( (lv_workItems_8_0= ruleWorkItem ) )+ otherlv_9= '}' otherlv_10= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2679:1: ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'WorkItemNetwork' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= 'WorkItems' otherlv_7= '{' ( (lv_workItems_8_0= ruleWorkItem ) )+ otherlv_9= '}' otherlv_10= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2679:2: ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'WorkItemNetwork' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= 'WorkItems' otherlv_7= '{' ( (lv_workItems_8_0= ruleWorkItem ) )+ otherlv_9= '}' otherlv_10= '}'
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2679:2: ( (lv_id_0_0= RULE_INT ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_INT) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2680:1: (lv_id_0_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2680:1: (lv_id_0_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2681:3: lv_id_0_0= RULE_INT
                    {
                    lv_id_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWorkItemNetwork5743); 

                    			newLeafNode(lv_id_0_0, grammarAccess.getWorkItemNetworkAccess().getIdINTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemNetworkRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_0_0, 
                            		"INT");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleWorkItemNetwork5761); 

                	newLeafNode(otherlv_1, grammarAccess.getWorkItemNetworkAccess().getWorkItemNetworkKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2701:1: ( (lv_name_2_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2702:1: (lv_name_2_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2702:1: (lv_name_2_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2703:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItemNetwork5778); 

            			newLeafNode(lv_name_2_0, grammarAccess.getWorkItemNetworkAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWorkItemNetworkRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleWorkItemNetwork5795); 

                	newLeafNode(otherlv_3, grammarAccess.getWorkItemNetworkAccess().getLeftCurlyBracketKeyword_3());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2723:1: (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==13) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2723:3: otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleWorkItemNetwork5808); 

                        	newLeafNode(otherlv_4, grammarAccess.getWorkItemNetworkAccess().getDescriptionKeyword_4_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2727:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2728:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2728:1: (lv_description_5_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2729:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWorkItemNetwork5825); 

                    			newLeafNode(lv_description_5_0, grammarAccess.getWorkItemNetworkAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemNetworkRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,88,FOLLOW_88_in_ruleWorkItemNetwork5844); 

                	newLeafNode(otherlv_6, grammarAccess.getWorkItemNetworkAccess().getWorkItemsKeyword_5());
                
            otherlv_7=(Token)match(input,36,FOLLOW_36_in_ruleWorkItemNetwork5856); 

                	newLeafNode(otherlv_7, grammarAccess.getWorkItemNetworkAccess().getLeftCurlyBracketKeyword_6());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2753:1: ( (lv_workItems_8_0= ruleWorkItem ) )+
            int cnt54=0;
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==RULE_INT||LA54_0==89) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2754:1: (lv_workItems_8_0= ruleWorkItem )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2754:1: (lv_workItems_8_0= ruleWorkItem )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2755:3: lv_workItems_8_0= ruleWorkItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWorkItemNetworkAccess().getWorkItemsWorkItemParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWorkItem_in_ruleWorkItemNetwork5877);
            	    lv_workItems_8_0=ruleWorkItem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWorkItemNetworkRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"workItems",
            	            		lv_workItems_8_0, 
            	            		"WorkItem");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt54 >= 1 ) break loop54;
                        EarlyExitException eee =
                            new EarlyExitException(54, input);
                        throw eee;
                }
                cnt54++;
            } while (true);

            otherlv_9=(Token)match(input,37,FOLLOW_37_in_ruleWorkItemNetwork5890); 

                	newLeafNode(otherlv_9, grammarAccess.getWorkItemNetworkAccess().getRightCurlyBracketKeyword_8());
                
            otherlv_10=(Token)match(input,37,FOLLOW_37_in_ruleWorkItemNetwork5902); 

                	newLeafNode(otherlv_10, grammarAccess.getWorkItemNetworkAccess().getRightCurlyBracketKeyword_9());
                

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
    // $ANTLR end "ruleWorkItemNetwork"


    // $ANTLR start "entryRuleWorkItem"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2787:1: entryRuleWorkItem returns [EObject current=null] : iv_ruleWorkItem= ruleWorkItem EOF ;
    public final EObject entryRuleWorkItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkItem = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2788:2: (iv_ruleWorkItem= ruleWorkItem EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2789:2: iv_ruleWorkItem= ruleWorkItem EOF
            {
             newCompositeNode(grammarAccess.getWorkItemRule()); 
            pushFollow(FOLLOW_ruleWorkItem_in_entryRuleWorkItem5938);
            iv_ruleWorkItem=ruleWorkItem();

            state._fsp--;

             current =iv_ruleWorkItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkItem5948); 

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
    // $ANTLR end "entryRuleWorkItem"


    // $ANTLR start "ruleWorkItem"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2796:1: ruleWorkItem returns [EObject current=null] : ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'WorkItem' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'Type' ( (otherlv_7= RULE_ID ) ) )? ( ( (lv_hasPredecessors_8_0= 'Predecessors' ) ) otherlv_9= '{' ( (otherlv_10= RULE_ID ) )+ otherlv_11= '}' )? ( ( (lv_isAggregationNode_12_0= 'Subtasks' ) ) otherlv_13= '{' ( (otherlv_14= RULE_ID ) )+ otherlv_15= '}' )? (otherlv_16= 'CausalTriggers' ( (lv_causalTriggers_17_0= ruleCausalTrigger ) )* )? (otherlv_18= 'RequiredServices' otherlv_19= '{' ( (otherlv_20= RULE_ID ) )+ )? otherlv_21= '}' (otherlv_22= 'Efforts' ( (lv_efforts_23_0= ruleNumExpression ) ) )? (otherlv_24= 'Value' ( (lv_value_25_0= ruleNumExpression ) ) )? (otherlv_26= 'ClassOfService' ( (otherlv_27= RULE_ID ) ) )? (otherlv_28= 'WorkSource' ( (otherlv_29= RULE_ID ) ) )? (otherlv_30= 'ArrivalTime' ( (lv_arrivalTime_31_0= RULE_INT ) ) )? (otherlv_32= 'DueDate' ( (lv_dueDate_33_0= RULE_INT ) ) )? otherlv_34= '}' ) ;
    public final EObject ruleWorkItem() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_hasPredecessors_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_isAggregationNode_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token lv_arrivalTime_31_0=null;
        Token otherlv_32=null;
        Token lv_dueDate_33_0=null;
        Token otherlv_34=null;
        EObject lv_causalTriggers_17_0 = null;

        EObject lv_efforts_23_0 = null;

        EObject lv_value_25_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2799:28: ( ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'WorkItem' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'Type' ( (otherlv_7= RULE_ID ) ) )? ( ( (lv_hasPredecessors_8_0= 'Predecessors' ) ) otherlv_9= '{' ( (otherlv_10= RULE_ID ) )+ otherlv_11= '}' )? ( ( (lv_isAggregationNode_12_0= 'Subtasks' ) ) otherlv_13= '{' ( (otherlv_14= RULE_ID ) )+ otherlv_15= '}' )? (otherlv_16= 'CausalTriggers' ( (lv_causalTriggers_17_0= ruleCausalTrigger ) )* )? (otherlv_18= 'RequiredServices' otherlv_19= '{' ( (otherlv_20= RULE_ID ) )+ )? otherlv_21= '}' (otherlv_22= 'Efforts' ( (lv_efforts_23_0= ruleNumExpression ) ) )? (otherlv_24= 'Value' ( (lv_value_25_0= ruleNumExpression ) ) )? (otherlv_26= 'ClassOfService' ( (otherlv_27= RULE_ID ) ) )? (otherlv_28= 'WorkSource' ( (otherlv_29= RULE_ID ) ) )? (otherlv_30= 'ArrivalTime' ( (lv_arrivalTime_31_0= RULE_INT ) ) )? (otherlv_32= 'DueDate' ( (lv_dueDate_33_0= RULE_INT ) ) )? otherlv_34= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2800:1: ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'WorkItem' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'Type' ( (otherlv_7= RULE_ID ) ) )? ( ( (lv_hasPredecessors_8_0= 'Predecessors' ) ) otherlv_9= '{' ( (otherlv_10= RULE_ID ) )+ otherlv_11= '}' )? ( ( (lv_isAggregationNode_12_0= 'Subtasks' ) ) otherlv_13= '{' ( (otherlv_14= RULE_ID ) )+ otherlv_15= '}' )? (otherlv_16= 'CausalTriggers' ( (lv_causalTriggers_17_0= ruleCausalTrigger ) )* )? (otherlv_18= 'RequiredServices' otherlv_19= '{' ( (otherlv_20= RULE_ID ) )+ )? otherlv_21= '}' (otherlv_22= 'Efforts' ( (lv_efforts_23_0= ruleNumExpression ) ) )? (otherlv_24= 'Value' ( (lv_value_25_0= ruleNumExpression ) ) )? (otherlv_26= 'ClassOfService' ( (otherlv_27= RULE_ID ) ) )? (otherlv_28= 'WorkSource' ( (otherlv_29= RULE_ID ) ) )? (otherlv_30= 'ArrivalTime' ( (lv_arrivalTime_31_0= RULE_INT ) ) )? (otherlv_32= 'DueDate' ( (lv_dueDate_33_0= RULE_INT ) ) )? otherlv_34= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2800:1: ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'WorkItem' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'Type' ( (otherlv_7= RULE_ID ) ) )? ( ( (lv_hasPredecessors_8_0= 'Predecessors' ) ) otherlv_9= '{' ( (otherlv_10= RULE_ID ) )+ otherlv_11= '}' )? ( ( (lv_isAggregationNode_12_0= 'Subtasks' ) ) otherlv_13= '{' ( (otherlv_14= RULE_ID ) )+ otherlv_15= '}' )? (otherlv_16= 'CausalTriggers' ( (lv_causalTriggers_17_0= ruleCausalTrigger ) )* )? (otherlv_18= 'RequiredServices' otherlv_19= '{' ( (otherlv_20= RULE_ID ) )+ )? otherlv_21= '}' (otherlv_22= 'Efforts' ( (lv_efforts_23_0= ruleNumExpression ) ) )? (otherlv_24= 'Value' ( (lv_value_25_0= ruleNumExpression ) ) )? (otherlv_26= 'ClassOfService' ( (otherlv_27= RULE_ID ) ) )? (otherlv_28= 'WorkSource' ( (otherlv_29= RULE_ID ) ) )? (otherlv_30= 'ArrivalTime' ( (lv_arrivalTime_31_0= RULE_INT ) ) )? (otherlv_32= 'DueDate' ( (lv_dueDate_33_0= RULE_INT ) ) )? otherlv_34= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2800:2: ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'WorkItem' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'Type' ( (otherlv_7= RULE_ID ) ) )? ( ( (lv_hasPredecessors_8_0= 'Predecessors' ) ) otherlv_9= '{' ( (otherlv_10= RULE_ID ) )+ otherlv_11= '}' )? ( ( (lv_isAggregationNode_12_0= 'Subtasks' ) ) otherlv_13= '{' ( (otherlv_14= RULE_ID ) )+ otherlv_15= '}' )? (otherlv_16= 'CausalTriggers' ( (lv_causalTriggers_17_0= ruleCausalTrigger ) )* )? (otherlv_18= 'RequiredServices' otherlv_19= '{' ( (otherlv_20= RULE_ID ) )+ )? otherlv_21= '}' (otherlv_22= 'Efforts' ( (lv_efforts_23_0= ruleNumExpression ) ) )? (otherlv_24= 'Value' ( (lv_value_25_0= ruleNumExpression ) ) )? (otherlv_26= 'ClassOfService' ( (otherlv_27= RULE_ID ) ) )? (otherlv_28= 'WorkSource' ( (otherlv_29= RULE_ID ) ) )? (otherlv_30= 'ArrivalTime' ( (lv_arrivalTime_31_0= RULE_INT ) ) )? (otherlv_32= 'DueDate' ( (lv_dueDate_33_0= RULE_INT ) ) )? otherlv_34= '}'
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2800:2: ( (lv_id_0_0= RULE_INT ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_INT) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2801:1: (lv_id_0_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2801:1: (lv_id_0_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2802:3: lv_id_0_0= RULE_INT
                    {
                    lv_id_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWorkItem5990); 

                    			newLeafNode(lv_id_0_0, grammarAccess.getWorkItemAccess().getIdINTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_0_0, 
                            		"INT");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,89,FOLLOW_89_in_ruleWorkItem6008); 

                	newLeafNode(otherlv_1, grammarAccess.getWorkItemAccess().getWorkItemKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2822:1: ( (lv_name_2_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2823:1: (lv_name_2_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2823:1: (lv_name_2_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2824:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem6025); 

            			newLeafNode(lv_name_2_0, grammarAccess.getWorkItemAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWorkItemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleWorkItem6042); 

                	newLeafNode(otherlv_3, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_3());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2844:1: (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==13) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2844:3: otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleWorkItem6055); 

                        	newLeafNode(otherlv_4, grammarAccess.getWorkItemAccess().getDescriptionKeyword_4_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2848:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2849:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2849:1: (lv_description_5_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2850:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWorkItem6072); 

                    			newLeafNode(lv_description_5_0, grammarAccess.getWorkItemAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2866:4: (otherlv_6= 'Type' ( (otherlv_7= RULE_ID ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==90) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2866:6: otherlv_6= 'Type' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,90,FOLLOW_90_in_ruleWorkItem6092); 

                        	newLeafNode(otherlv_6, grammarAccess.getWorkItemAccess().getTypeKeyword_5_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2870:1: ( (otherlv_7= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2871:1: (otherlv_7= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2871:1: (otherlv_7= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2872:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem6112); 

                    		newLeafNode(otherlv_7, grammarAccess.getWorkItemAccess().getTypeWorkItemTypeCrossReference_5_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2883:4: ( ( (lv_hasPredecessors_8_0= 'Predecessors' ) ) otherlv_9= '{' ( (otherlv_10= RULE_ID ) )+ otherlv_11= '}' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==91) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2883:5: ( (lv_hasPredecessors_8_0= 'Predecessors' ) ) otherlv_9= '{' ( (otherlv_10= RULE_ID ) )+ otherlv_11= '}'
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2883:5: ( (lv_hasPredecessors_8_0= 'Predecessors' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2884:1: (lv_hasPredecessors_8_0= 'Predecessors' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2884:1: (lv_hasPredecessors_8_0= 'Predecessors' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2885:3: lv_hasPredecessors_8_0= 'Predecessors'
                    {
                    lv_hasPredecessors_8_0=(Token)match(input,91,FOLLOW_91_in_ruleWorkItem6133); 

                            newLeafNode(lv_hasPredecessors_8_0, grammarAccess.getWorkItemAccess().getHasPredecessorsPredecessorsKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(current, "hasPredecessors", true, "Predecessors");
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,36,FOLLOW_36_in_ruleWorkItem6158); 

                        	newLeafNode(otherlv_9, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2902:1: ( (otherlv_10= RULE_ID ) )+
                    int cnt58=0;
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==RULE_ID) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2903:1: (otherlv_10= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2903:1: (otherlv_10= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2904:3: otherlv_10= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	    	        }
                    	            
                    	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem6178); 

                    	    		newLeafNode(otherlv_10, grammarAccess.getWorkItemAccess().getPTasksWorkItemCrossReference_6_2_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt58 >= 1 ) break loop58;
                                EarlyExitException eee =
                                    new EarlyExitException(58, input);
                                throw eee;
                        }
                        cnt58++;
                    } while (true);

                    otherlv_11=(Token)match(input,37,FOLLOW_37_in_ruleWorkItem6191); 

                        	newLeafNode(otherlv_11, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_6_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2919:3: ( ( (lv_isAggregationNode_12_0= 'Subtasks' ) ) otherlv_13= '{' ( (otherlv_14= RULE_ID ) )+ otherlv_15= '}' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==92) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2919:4: ( (lv_isAggregationNode_12_0= 'Subtasks' ) ) otherlv_13= '{' ( (otherlv_14= RULE_ID ) )+ otherlv_15= '}'
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2919:4: ( (lv_isAggregationNode_12_0= 'Subtasks' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2920:1: (lv_isAggregationNode_12_0= 'Subtasks' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2920:1: (lv_isAggregationNode_12_0= 'Subtasks' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2921:3: lv_isAggregationNode_12_0= 'Subtasks'
                    {
                    lv_isAggregationNode_12_0=(Token)match(input,92,FOLLOW_92_in_ruleWorkItem6212); 

                            newLeafNode(lv_isAggregationNode_12_0, grammarAccess.getWorkItemAccess().getIsAggregationNodeSubtasksKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(current, "isAggregationNode", true, "Subtasks");
                    	    

                    }


                    }

                    otherlv_13=(Token)match(input,36,FOLLOW_36_in_ruleWorkItem6237); 

                        	newLeafNode(otherlv_13, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2938:1: ( (otherlv_14= RULE_ID ) )+
                    int cnt60=0;
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==RULE_ID) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2939:1: (otherlv_14= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2939:1: (otherlv_14= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2940:3: otherlv_14= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	    	        }
                    	            
                    	    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem6257); 

                    	    		newLeafNode(otherlv_14, grammarAccess.getWorkItemAccess().getSTasksWorkItemCrossReference_7_2_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt60 >= 1 ) break loop60;
                                EarlyExitException eee =
                                    new EarlyExitException(60, input);
                                throw eee;
                        }
                        cnt60++;
                    } while (true);

                    otherlv_15=(Token)match(input,37,FOLLOW_37_in_ruleWorkItem6270); 

                        	newLeafNode(otherlv_15, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_7_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2955:3: (otherlv_16= 'CausalTriggers' ( (lv_causalTriggers_17_0= ruleCausalTrigger ) )* )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==93) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2955:5: otherlv_16= 'CausalTriggers' ( (lv_causalTriggers_17_0= ruleCausalTrigger ) )*
                    {
                    otherlv_16=(Token)match(input,93,FOLLOW_93_in_ruleWorkItem6285); 

                        	newLeafNode(otherlv_16, grammarAccess.getWorkItemAccess().getCausalTriggersKeyword_8_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2959:1: ( (lv_causalTriggers_17_0= ruleCausalTrigger ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( ((LA62_0>=100 && LA62_0<=101)) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2960:1: (lv_causalTriggers_17_0= ruleCausalTrigger )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2960:1: (lv_causalTriggers_17_0= ruleCausalTrigger )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2961:3: lv_causalTriggers_17_0= ruleCausalTrigger
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWorkItemAccess().getCausalTriggersCausalTriggerParserRuleCall_8_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleCausalTrigger_in_ruleWorkItem6306);
                    	    lv_causalTriggers_17_0=ruleCausalTrigger();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"causalTriggers",
                    	            		lv_causalTriggers_17_0, 
                    	            		"CausalTrigger");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2977:5: (otherlv_18= 'RequiredServices' otherlv_19= '{' ( (otherlv_20= RULE_ID ) )+ )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==94) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2977:7: otherlv_18= 'RequiredServices' otherlv_19= '{' ( (otherlv_20= RULE_ID ) )+
                    {
                    otherlv_18=(Token)match(input,94,FOLLOW_94_in_ruleWorkItem6322); 

                        	newLeafNode(otherlv_18, grammarAccess.getWorkItemAccess().getRequiredServicesKeyword_9_0());
                        
                    otherlv_19=(Token)match(input,36,FOLLOW_36_in_ruleWorkItem6334); 

                        	newLeafNode(otherlv_19, grammarAccess.getWorkItemAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2985:1: ( (otherlv_20= RULE_ID ) )+
                    int cnt64=0;
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==RULE_ID) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2986:1: (otherlv_20= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2986:1: (otherlv_20= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:2987:3: otherlv_20= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	    	        }
                    	            
                    	    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem6354); 

                    	    		newLeafNode(otherlv_20, grammarAccess.getWorkItemAccess().getRequiredServicesServiceCrossReference_9_2_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt64 >= 1 ) break loop64;
                                EarlyExitException eee =
                                    new EarlyExitException(64, input);
                                throw eee;
                        }
                        cnt64++;
                    } while (true);


                    }
                    break;

            }

            otherlv_21=(Token)match(input,37,FOLLOW_37_in_ruleWorkItem6369); 

                	newLeafNode(otherlv_21, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_10());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3002:1: (otherlv_22= 'Efforts' ( (lv_efforts_23_0= ruleNumExpression ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==95) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3002:3: otherlv_22= 'Efforts' ( (lv_efforts_23_0= ruleNumExpression ) )
                    {
                    otherlv_22=(Token)match(input,95,FOLLOW_95_in_ruleWorkItem6382); 

                        	newLeafNode(otherlv_22, grammarAccess.getWorkItemAccess().getEffortsKeyword_11_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3006:1: ( (lv_efforts_23_0= ruleNumExpression ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3007:1: (lv_efforts_23_0= ruleNumExpression )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3007:1: (lv_efforts_23_0= ruleNumExpression )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3008:3: lv_efforts_23_0= ruleNumExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkItemAccess().getEffortsNumExpressionParserRuleCall_11_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNumExpression_in_ruleWorkItem6403);
                    lv_efforts_23_0=ruleNumExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                    	        }
                           		set(
                           			current, 
                           			"efforts",
                            		lv_efforts_23_0, 
                            		"NumExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3024:4: (otherlv_24= 'Value' ( (lv_value_25_0= ruleNumExpression ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==96) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3024:6: otherlv_24= 'Value' ( (lv_value_25_0= ruleNumExpression ) )
                    {
                    otherlv_24=(Token)match(input,96,FOLLOW_96_in_ruleWorkItem6418); 

                        	newLeafNode(otherlv_24, grammarAccess.getWorkItemAccess().getValueKeyword_12_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3028:1: ( (lv_value_25_0= ruleNumExpression ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3029:1: (lv_value_25_0= ruleNumExpression )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3029:1: (lv_value_25_0= ruleNumExpression )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3030:3: lv_value_25_0= ruleNumExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkItemAccess().getValueNumExpressionParserRuleCall_12_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNumExpression_in_ruleWorkItem6439);
                    lv_value_25_0=ruleNumExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWorkItemRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_25_0, 
                            		"NumExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3046:4: (otherlv_26= 'ClassOfService' ( (otherlv_27= RULE_ID ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==97) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3046:6: otherlv_26= 'ClassOfService' ( (otherlv_27= RULE_ID ) )
                    {
                    otherlv_26=(Token)match(input,97,FOLLOW_97_in_ruleWorkItem6454); 

                        	newLeafNode(otherlv_26, grammarAccess.getWorkItemAccess().getClassOfServiceKeyword_13_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3050:1: ( (otherlv_27= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3051:1: (otherlv_27= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3051:1: (otherlv_27= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3052:3: otherlv_27= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                            
                    otherlv_27=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem6474); 

                    		newLeafNode(otherlv_27, grammarAccess.getWorkItemAccess().getClassOfServiceClassOfServiceCrossReference_13_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3063:4: (otherlv_28= 'WorkSource' ( (otherlv_29= RULE_ID ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==86) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3063:6: otherlv_28= 'WorkSource' ( (otherlv_29= RULE_ID ) )
                    {
                    otherlv_28=(Token)match(input,86,FOLLOW_86_in_ruleWorkItem6489); 

                        	newLeafNode(otherlv_28, grammarAccess.getWorkItemAccess().getWorkSourceKeyword_14_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3067:1: ( (otherlv_29= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3068:1: (otherlv_29= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3068:1: (otherlv_29= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3069:3: otherlv_29= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                            
                    otherlv_29=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItem6509); 

                    		newLeafNode(otherlv_29, grammarAccess.getWorkItemAccess().getWorkSourceWorkSourceCrossReference_14_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3080:4: (otherlv_30= 'ArrivalTime' ( (lv_arrivalTime_31_0= RULE_INT ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==98) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3080:6: otherlv_30= 'ArrivalTime' ( (lv_arrivalTime_31_0= RULE_INT ) )
                    {
                    otherlv_30=(Token)match(input,98,FOLLOW_98_in_ruleWorkItem6524); 

                        	newLeafNode(otherlv_30, grammarAccess.getWorkItemAccess().getArrivalTimeKeyword_15_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3084:1: ( (lv_arrivalTime_31_0= RULE_INT ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3085:1: (lv_arrivalTime_31_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3085:1: (lv_arrivalTime_31_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3086:3: lv_arrivalTime_31_0= RULE_INT
                    {
                    lv_arrivalTime_31_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWorkItem6541); 

                    			newLeafNode(lv_arrivalTime_31_0, grammarAccess.getWorkItemAccess().getArrivalTimeINTTerminalRuleCall_15_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"arrivalTime",
                            		lv_arrivalTime_31_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3102:4: (otherlv_32= 'DueDate' ( (lv_dueDate_33_0= RULE_INT ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==99) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3102:6: otherlv_32= 'DueDate' ( (lv_dueDate_33_0= RULE_INT ) )
                    {
                    otherlv_32=(Token)match(input,99,FOLLOW_99_in_ruleWorkItem6561); 

                        	newLeafNode(otherlv_32, grammarAccess.getWorkItemAccess().getDueDateKeyword_16_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3106:1: ( (lv_dueDate_33_0= RULE_INT ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3107:1: (lv_dueDate_33_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3107:1: (lv_dueDate_33_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3108:3: lv_dueDate_33_0= RULE_INT
                    {
                    lv_dueDate_33_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWorkItem6578); 

                    			newLeafNode(lv_dueDate_33_0, grammarAccess.getWorkItemAccess().getDueDateINTTerminalRuleCall_16_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"dueDate",
                            		lv_dueDate_33_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_34=(Token)match(input,37,FOLLOW_37_in_ruleWorkItem6597); 

                	newLeafNode(otherlv_34, grammarAccess.getWorkItemAccess().getRightCurlyBracketKeyword_17());
                

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
    // $ANTLR end "ruleWorkItem"


    // $ANTLR start "entryRuleCausalTrigger"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3136:1: entryRuleCausalTrigger returns [EObject current=null] : iv_ruleCausalTrigger= ruleCausalTrigger EOF ;
    public final EObject entryRuleCausalTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCausalTrigger = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3137:2: (iv_ruleCausalTrigger= ruleCausalTrigger EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3138:2: iv_ruleCausalTrigger= ruleCausalTrigger EOF
            {
             newCompositeNode(grammarAccess.getCausalTriggerRule()); 
            pushFollow(FOLLOW_ruleCausalTrigger_in_entryRuleCausalTrigger6633);
            iv_ruleCausalTrigger=ruleCausalTrigger();

            state._fsp--;

             current =iv_ruleCausalTrigger; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCausalTrigger6643); 

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
    // $ANTLR end "entryRuleCausalTrigger"


    // $ANTLR start "ruleCausalTrigger"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3145:1: ruleCausalTrigger returns [EObject current=null] : ( (otherlv_0= '=>' | otherlv_1= '->' ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' (otherlv_5= 'AtProgress' ( (lv_atProgress_6_0= RULE_DOUBLE ) ) )? (otherlv_7= 'OnProbability' ( (lv_onProbability_8_0= RULE_DOUBLE ) ) )? ) ;
    public final EObject ruleCausalTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_atProgress_6_0=null;
        Token otherlv_7=null;
        Token lv_onProbability_8_0=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3148:28: ( ( (otherlv_0= '=>' | otherlv_1= '->' ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' (otherlv_5= 'AtProgress' ( (lv_atProgress_6_0= RULE_DOUBLE ) ) )? (otherlv_7= 'OnProbability' ( (lv_onProbability_8_0= RULE_DOUBLE ) ) )? ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3149:1: ( (otherlv_0= '=>' | otherlv_1= '->' ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' (otherlv_5= 'AtProgress' ( (lv_atProgress_6_0= RULE_DOUBLE ) ) )? (otherlv_7= 'OnProbability' ( (lv_onProbability_8_0= RULE_DOUBLE ) ) )? )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3149:1: ( (otherlv_0= '=>' | otherlv_1= '->' ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' (otherlv_5= 'AtProgress' ( (lv_atProgress_6_0= RULE_DOUBLE ) ) )? (otherlv_7= 'OnProbability' ( (lv_onProbability_8_0= RULE_DOUBLE ) ) )? )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3149:2: (otherlv_0= '=>' | otherlv_1= '->' ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' (otherlv_5= 'AtProgress' ( (lv_atProgress_6_0= RULE_DOUBLE ) ) )? (otherlv_7= 'OnProbability' ( (lv_onProbability_8_0= RULE_DOUBLE ) ) )?
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3149:2: (otherlv_0= '=>' | otherlv_1= '->' )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==100) ) {
                alt72=1;
            }
            else if ( (LA72_0==101) ) {
                alt72=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3149:4: otherlv_0= '=>'
                    {
                    otherlv_0=(Token)match(input,100,FOLLOW_100_in_ruleCausalTrigger6681); 

                        	newLeafNode(otherlv_0, grammarAccess.getCausalTriggerAccess().getEqualsSignGreaterThanSignKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3154:7: otherlv_1= '->'
                    {
                    otherlv_1=(Token)match(input,101,FOLLOW_101_in_ruleCausalTrigger6699); 

                        	newLeafNode(otherlv_1, grammarAccess.getCausalTriggerAccess().getHyphenMinusGreaterThanSignKeyword_0_1());
                        

                    }
                    break;

            }

            otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleCausalTrigger6712); 

                	newLeafNode(otherlv_2, grammarAccess.getCausalTriggerAccess().getLeftCurlyBracketKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3162:1: ( (otherlv_3= RULE_ID ) )+
            int cnt73=0;
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==RULE_ID) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3163:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3163:1: (otherlv_3= RULE_ID )
            	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3164:3: otherlv_3= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCausalTriggerRule());
            	    	        }
            	            
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCausalTrigger6732); 

            	    		newLeafNode(otherlv_3, grammarAccess.getCausalTriggerAccess().getTriggeredWorkItemCrossReference_2_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt73 >= 1 ) break loop73;
                        EarlyExitException eee =
                            new EarlyExitException(73, input);
                        throw eee;
                }
                cnt73++;
            } while (true);

            otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleCausalTrigger6745); 

                	newLeafNode(otherlv_4, grammarAccess.getCausalTriggerAccess().getRightCurlyBracketKeyword_3());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3179:1: (otherlv_5= 'AtProgress' ( (lv_atProgress_6_0= RULE_DOUBLE ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==102) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3179:3: otherlv_5= 'AtProgress' ( (lv_atProgress_6_0= RULE_DOUBLE ) )
                    {
                    otherlv_5=(Token)match(input,102,FOLLOW_102_in_ruleCausalTrigger6758); 

                        	newLeafNode(otherlv_5, grammarAccess.getCausalTriggerAccess().getAtProgressKeyword_4_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3183:1: ( (lv_atProgress_6_0= RULE_DOUBLE ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3184:1: (lv_atProgress_6_0= RULE_DOUBLE )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3184:1: (lv_atProgress_6_0= RULE_DOUBLE )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3185:3: lv_atProgress_6_0= RULE_DOUBLE
                    {
                    lv_atProgress_6_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleCausalTrigger6775); 

                    			newLeafNode(lv_atProgress_6_0, grammarAccess.getCausalTriggerAccess().getAtProgressDOUBLETerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCausalTriggerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"atProgress",
                            		lv_atProgress_6_0, 
                            		"DOUBLE");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3201:4: (otherlv_7= 'OnProbability' ( (lv_onProbability_8_0= RULE_DOUBLE ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==103) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3201:6: otherlv_7= 'OnProbability' ( (lv_onProbability_8_0= RULE_DOUBLE ) )
                    {
                    otherlv_7=(Token)match(input,103,FOLLOW_103_in_ruleCausalTrigger6795); 

                        	newLeafNode(otherlv_7, grammarAccess.getCausalTriggerAccess().getOnProbabilityKeyword_5_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3205:1: ( (lv_onProbability_8_0= RULE_DOUBLE ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3206:1: (lv_onProbability_8_0= RULE_DOUBLE )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3206:1: (lv_onProbability_8_0= RULE_DOUBLE )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3207:3: lv_onProbability_8_0= RULE_DOUBLE
                    {
                    lv_onProbability_8_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleCausalTrigger6812); 

                    			newLeafNode(lv_onProbability_8_0, grammarAccess.getCausalTriggerAccess().getOnProbabilityDOUBLETerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCausalTriggerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"onProbability",
                            		lv_onProbability_8_0, 
                            		"DOUBLE");
                    	    

                    }


                    }


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
    // $ANTLR end "ruleCausalTrigger"


    // $ANTLR start "entryRuleWorkItemType"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3231:1: entryRuleWorkItemType returns [EObject current=null] : iv_ruleWorkItemType= ruleWorkItemType EOF ;
    public final EObject entryRuleWorkItemType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkItemType = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3232:2: (iv_ruleWorkItemType= ruleWorkItemType EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3233:2: iv_ruleWorkItemType= ruleWorkItemType EOF
            {
             newCompositeNode(grammarAccess.getWorkItemTypeRule()); 
            pushFollow(FOLLOW_ruleWorkItemType_in_entryRuleWorkItemType6855);
            iv_ruleWorkItemType=ruleWorkItemType();

            state._fsp--;

             current =iv_ruleWorkItemType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkItemType6865); 

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
    // $ANTLR end "entryRuleWorkItemType"


    // $ANTLR start "ruleWorkItemType"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3240:1: ruleWorkItemType returns [EObject current=null] : ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'WorkItemType' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleWorkItemType() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3243:28: ( ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'WorkItemType' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3244:1: ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'WorkItemType' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3244:1: ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'WorkItemType' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3244:2: ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'WorkItemType' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= '}'
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3244:2: ( (lv_id_0_0= RULE_INT ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_INT) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3245:1: (lv_id_0_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3245:1: (lv_id_0_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3246:3: lv_id_0_0= RULE_INT
                    {
                    lv_id_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWorkItemType6907); 

                    			newLeafNode(lv_id_0_0, grammarAccess.getWorkItemTypeAccess().getIdINTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_0_0, 
                            		"INT");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,104,FOLLOW_104_in_ruleWorkItemType6925); 

                	newLeafNode(otherlv_1, grammarAccess.getWorkItemTypeAccess().getWorkItemTypeKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3266:1: ( (lv_name_2_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3267:1: (lv_name_2_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3267:1: (lv_name_2_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3268:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkItemType6942); 

            			newLeafNode(lv_name_2_0, grammarAccess.getWorkItemTypeAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWorkItemTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleWorkItemType6959); 

                	newLeafNode(otherlv_3, grammarAccess.getWorkItemTypeAccess().getLeftCurlyBracketKeyword_3());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3288:1: (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==13) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3288:3: otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleWorkItemType6972); 

                        	newLeafNode(otherlv_4, grammarAccess.getWorkItemTypeAccess().getDescriptionKeyword_4_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3292:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3293:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3293:1: (lv_description_5_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3294:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWorkItemType6989); 

                    			newLeafNode(lv_description_5_0, grammarAccess.getWorkItemTypeAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkItemTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,37,FOLLOW_37_in_ruleWorkItemType7008); 

                	newLeafNode(otherlv_6, grammarAccess.getWorkItemTypeAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleWorkItemType"


    // $ANTLR start "entryRuleValueFunction"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3322:1: entryRuleValueFunction returns [EObject current=null] : iv_ruleValueFunction= ruleValueFunction EOF ;
    public final EObject entryRuleValueFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueFunction = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3323:2: (iv_ruleValueFunction= ruleValueFunction EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3324:2: iv_ruleValueFunction= ruleValueFunction EOF
            {
             newCompositeNode(grammarAccess.getValueFunctionRule()); 
            pushFollow(FOLLOW_ruleValueFunction_in_entryRuleValueFunction7044);
            iv_ruleValueFunction=ruleValueFunction();

            state._fsp--;

             current =iv_ruleValueFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueFunction7054); 

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
    // $ANTLR end "entryRuleValueFunction"


    // $ANTLR start "ruleValueFunction"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3331:1: ruleValueFunction returns [EObject current=null] : (otherlv_0= 'ValueFunction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleValueFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3334:28: ( (otherlv_0= 'ValueFunction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3335:1: (otherlv_0= 'ValueFunction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3335:1: (otherlv_0= 'ValueFunction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3335:3: otherlv_0= 'ValueFunction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,105,FOLLOW_105_in_ruleValueFunction7091); 

                	newLeafNode(otherlv_0, grammarAccess.getValueFunctionAccess().getValueFunctionKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3339:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3340:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3340:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3341:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValueFunction7108); 

            			newLeafNode(lv_name_1_0, grammarAccess.getValueFunctionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getValueFunctionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleValueFunction7125); 

                	newLeafNode(otherlv_2, grammarAccess.getValueFunctionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3361:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==13) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3361:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleValueFunction7138); 

                        	newLeafNode(otherlv_3, grammarAccess.getValueFunctionAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3365:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3366:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3366:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3367:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValueFunction7155); 

                    			newLeafNode(lv_description_4_0, grammarAccess.getValueFunctionAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getValueFunctionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleValueFunction7174); 

                	newLeafNode(otherlv_5, grammarAccess.getValueFunctionAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleValueFunction"


    // $ANTLR start "entryRuleProcessModel"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3395:1: entryRuleProcessModel returns [EObject current=null] : iv_ruleProcessModel= ruleProcessModel EOF ;
    public final EObject entryRuleProcessModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessModel = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3396:2: (iv_ruleProcessModel= ruleProcessModel EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3397:2: iv_ruleProcessModel= ruleProcessModel EOF
            {
             newCompositeNode(grammarAccess.getProcessModelRule()); 
            pushFollow(FOLLOW_ruleProcessModel_in_entryRuleProcessModel7210);
            iv_ruleProcessModel=ruleProcessModel();

            state._fsp--;

             current =iv_ruleProcessModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessModel7220); 

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
    // $ANTLR end "entryRuleProcessModel"


    // $ANTLR start "ruleProcessModel"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3404:1: ruleProcessModel returns [EObject current=null] : (otherlv_0= 'ProcessModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleProcessModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3407:28: ( (otherlv_0= 'ProcessModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3408:1: (otherlv_0= 'ProcessModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3408:1: (otherlv_0= 'ProcessModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3408:3: otherlv_0= 'ProcessModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,106,FOLLOW_106_in_ruleProcessModel7257); 

                	newLeafNode(otherlv_0, grammarAccess.getProcessModelAccess().getProcessModelKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3412:1: ( (lv_name_1_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3413:1: (lv_name_1_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3413:1: (lv_name_1_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3414:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcessModel7274); 

            			newLeafNode(lv_name_1_0, grammarAccess.getProcessModelAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProcessModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleProcessModel7291); 

                	newLeafNode(otherlv_2, grammarAccess.getProcessModelAccess().getLeftCurlyBracketKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3434:1: (otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==13) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3434:3: otherlv_3= 'Description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleProcessModel7304); 

                        	newLeafNode(otherlv_3, grammarAccess.getProcessModelAccess().getDescriptionKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3438:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3439:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3439:1: (lv_description_4_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3440:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProcessModel7321); 

                    			newLeafNode(lv_description_4_0, grammarAccess.getProcessModelAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProcessModelRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleProcessModel7340); 

                	newLeafNode(otherlv_5, grammarAccess.getProcessModelAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleProcessModel"


    // $ANTLR start "entryRuleClassOfService"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3468:1: entryRuleClassOfService returns [EObject current=null] : iv_ruleClassOfService= ruleClassOfService EOF ;
    public final EObject entryRuleClassOfService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassOfService = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3469:2: (iv_ruleClassOfService= ruleClassOfService EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3470:2: iv_ruleClassOfService= ruleClassOfService EOF
            {
             newCompositeNode(grammarAccess.getClassOfServiceRule()); 
            pushFollow(FOLLOW_ruleClassOfService_in_entryRuleClassOfService7376);
            iv_ruleClassOfService=ruleClassOfService();

            state._fsp--;

             current =iv_ruleClassOfService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassOfService7386); 

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
    // $ANTLR end "entryRuleClassOfService"


    // $ANTLR start "ruleClassOfService"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3477:1: ruleClassOfService returns [EObject current=null] : ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'ClassOfService' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= 'Disruptive:' ( ( (lv_isDisruptive_7_0= 'TRUE' ) ) | otherlv_8= 'FALSE' ) otherlv_9= '}' ) ;
    public final EObject ruleClassOfService() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token lv_isDisruptive_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3480:28: ( ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'ClassOfService' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= 'Disruptive:' ( ( (lv_isDisruptive_7_0= 'TRUE' ) ) | otherlv_8= 'FALSE' ) otherlv_9= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3481:1: ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'ClassOfService' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= 'Disruptive:' ( ( (lv_isDisruptive_7_0= 'TRUE' ) ) | otherlv_8= 'FALSE' ) otherlv_9= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3481:1: ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'ClassOfService' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= 'Disruptive:' ( ( (lv_isDisruptive_7_0= 'TRUE' ) ) | otherlv_8= 'FALSE' ) otherlv_9= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3481:2: ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'ClassOfService' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= 'Disruptive:' ( ( (lv_isDisruptive_7_0= 'TRUE' ) ) | otherlv_8= 'FALSE' ) otherlv_9= '}'
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3481:2: ( (lv_id_0_0= RULE_INT ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==RULE_INT) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3482:1: (lv_id_0_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3482:1: (lv_id_0_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3483:3: lv_id_0_0= RULE_INT
                    {
                    lv_id_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleClassOfService7428); 

                    			newLeafNode(lv_id_0_0, grammarAccess.getClassOfServiceAccess().getIdINTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getClassOfServiceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_0_0, 
                            		"INT");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,97,FOLLOW_97_in_ruleClassOfService7446); 

                	newLeafNode(otherlv_1, grammarAccess.getClassOfServiceAccess().getClassOfServiceKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3503:1: ( (lv_name_2_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3504:1: (lv_name_2_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3504:1: (lv_name_2_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3505:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassOfService7463); 

            			newLeafNode(lv_name_2_0, grammarAccess.getClassOfServiceAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClassOfServiceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleClassOfService7480); 

                	newLeafNode(otherlv_3, grammarAccess.getClassOfServiceAccess().getLeftCurlyBracketKeyword_3());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3525:1: (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==13) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3525:3: otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleClassOfService7493); 

                        	newLeafNode(otherlv_4, grammarAccess.getClassOfServiceAccess().getDescriptionKeyword_4_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3529:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3530:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3530:1: (lv_description_5_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3531:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassOfService7510); 

                    			newLeafNode(lv_description_5_0, grammarAccess.getClassOfServiceAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getClassOfServiceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,107,FOLLOW_107_in_ruleClassOfService7529); 

                	newLeafNode(otherlv_6, grammarAccess.getClassOfServiceAccess().getDisruptiveKeyword_5());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3551:1: ( ( (lv_isDisruptive_7_0= 'TRUE' ) ) | otherlv_8= 'FALSE' )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==108) ) {
                alt82=1;
            }
            else if ( (LA82_0==109) ) {
                alt82=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3551:2: ( (lv_isDisruptive_7_0= 'TRUE' ) )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3551:2: ( (lv_isDisruptive_7_0= 'TRUE' ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3552:1: (lv_isDisruptive_7_0= 'TRUE' )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3552:1: (lv_isDisruptive_7_0= 'TRUE' )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3553:3: lv_isDisruptive_7_0= 'TRUE'
                    {
                    lv_isDisruptive_7_0=(Token)match(input,108,FOLLOW_108_in_ruleClassOfService7548); 

                            newLeafNode(lv_isDisruptive_7_0, grammarAccess.getClassOfServiceAccess().getIsDisruptiveTRUEKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getClassOfServiceRule());
                    	        }
                           		setWithLastConsumed(current, "isDisruptive", true, "TRUE");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3567:7: otherlv_8= 'FALSE'
                    {
                    otherlv_8=(Token)match(input,109,FOLLOW_109_in_ruleClassOfService7579); 

                        	newLeafNode(otherlv_8, grammarAccess.getClassOfServiceAccess().getFALSEKeyword_6_1());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,37,FOLLOW_37_in_ruleClassOfService7592); 

                	newLeafNode(otherlv_9, grammarAccess.getClassOfServiceAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleClassOfService"


    // $ANTLR start "entryRuleService"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3583:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3584:2: (iv_ruleService= ruleService EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3585:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService7628);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService7638); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3592:1: ruleService returns [EObject current=null] : ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'Service' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= '}' )? ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3595:28: ( ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'Service' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= '}' )? ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3596:1: ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'Service' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= '}' )? )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3596:1: ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'Service' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= '}' )? )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3596:2: ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'Service' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= '}' )?
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3596:2: ( (lv_id_0_0= RULE_INT ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==RULE_INT) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3597:1: (lv_id_0_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3597:1: (lv_id_0_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3598:3: lv_id_0_0= RULE_INT
                    {
                    lv_id_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleService7680); 

                    			newLeafNode(lv_id_0_0, grammarAccess.getServiceAccess().getIdINTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_0_0, 
                            		"INT");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,110,FOLLOW_110_in_ruleService7698); 

                	newLeafNode(otherlv_1, grammarAccess.getServiceAccess().getServiceKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3618:1: ( (lv_name_2_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3619:1: (lv_name_2_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3619:1: (lv_name_2_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3620:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService7715); 

            			newLeafNode(lv_name_2_0, grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3636:2: (otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= '}' )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==36) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3636:4: otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleService7733); 

                        	newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_3_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3640:1: (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==13) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3640:3: otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) )
                            {
                            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleService7746); 

                                	newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getDescriptionKeyword_3_1_0());
                                
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3644:1: ( (lv_description_5_0= RULE_STRING ) )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3645:1: (lv_description_5_0= RULE_STRING )
                            {
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3645:1: (lv_description_5_0= RULE_STRING )
                            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3646:3: lv_description_5_0= RULE_STRING
                            {
                            lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleService7763); 

                            			newLeafNode(lv_description_5_0, grammarAccess.getServiceAccess().getDescriptionSTRINGTerminalRuleCall_3_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getServiceRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"description",
                                    		lv_description_5_0, 
                                    		"STRING");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,37,FOLLOW_37_in_ruleService7782); 

                        	newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_3_2());
                        

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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleServiceProvider"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3674:1: entryRuleServiceProvider returns [EObject current=null] : iv_ruleServiceProvider= ruleServiceProvider EOF ;
    public final EObject entryRuleServiceProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceProvider = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3675:2: (iv_ruleServiceProvider= ruleServiceProvider EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3676:2: iv_ruleServiceProvider= ruleServiceProvider EOF
            {
             newCompositeNode(grammarAccess.getServiceProviderRule()); 
            pushFollow(FOLLOW_ruleServiceProvider_in_entryRuleServiceProvider7820);
            iv_ruleServiceProvider=ruleServiceProvider();

            state._fsp--;

             current =iv_ruleServiceProvider; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceProvider7830); 

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
    // $ANTLR end "entryRuleServiceProvider"


    // $ANTLR start "ruleServiceProvider"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3683:1: ruleServiceProvider returns [EObject current=null] : ( ( (lv_id_0_0= RULE_INT ) )? (otherlv_1= 'ServiceProvider' | otherlv_2= 'Group' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'AssignTo' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )+ otherlv_10= '}' )? (otherlv_11= 'OutsourceFrom' otherlv_12= '{' ( (otherlv_13= RULE_ID ) )+ otherlv_14= '}' )? otherlv_15= 'TeamService' ( (otherlv_16= RULE_ID ) ) (otherlv_17= 'GovernanceStrategy' otherlv_18= '{' ( (otherlv_19= RULE_ID ) ) otherlv_20= '}' )? (otherlv_21= 'Resources' otherlv_22= '{' ( (lv_resources_23_0= ruleAsset ) )+ otherlv_24= '}' )? otherlv_25= '}' ) ;
    public final EObject ruleServiceProvider() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
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
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        EObject lv_resources_23_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3686:28: ( ( ( (lv_id_0_0= RULE_INT ) )? (otherlv_1= 'ServiceProvider' | otherlv_2= 'Group' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'AssignTo' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )+ otherlv_10= '}' )? (otherlv_11= 'OutsourceFrom' otherlv_12= '{' ( (otherlv_13= RULE_ID ) )+ otherlv_14= '}' )? otherlv_15= 'TeamService' ( (otherlv_16= RULE_ID ) ) (otherlv_17= 'GovernanceStrategy' otherlv_18= '{' ( (otherlv_19= RULE_ID ) ) otherlv_20= '}' )? (otherlv_21= 'Resources' otherlv_22= '{' ( (lv_resources_23_0= ruleAsset ) )+ otherlv_24= '}' )? otherlv_25= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3687:1: ( ( (lv_id_0_0= RULE_INT ) )? (otherlv_1= 'ServiceProvider' | otherlv_2= 'Group' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'AssignTo' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )+ otherlv_10= '}' )? (otherlv_11= 'OutsourceFrom' otherlv_12= '{' ( (otherlv_13= RULE_ID ) )+ otherlv_14= '}' )? otherlv_15= 'TeamService' ( (otherlv_16= RULE_ID ) ) (otherlv_17= 'GovernanceStrategy' otherlv_18= '{' ( (otherlv_19= RULE_ID ) ) otherlv_20= '}' )? (otherlv_21= 'Resources' otherlv_22= '{' ( (lv_resources_23_0= ruleAsset ) )+ otherlv_24= '}' )? otherlv_25= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3687:1: ( ( (lv_id_0_0= RULE_INT ) )? (otherlv_1= 'ServiceProvider' | otherlv_2= 'Group' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'AssignTo' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )+ otherlv_10= '}' )? (otherlv_11= 'OutsourceFrom' otherlv_12= '{' ( (otherlv_13= RULE_ID ) )+ otherlv_14= '}' )? otherlv_15= 'TeamService' ( (otherlv_16= RULE_ID ) ) (otherlv_17= 'GovernanceStrategy' otherlv_18= '{' ( (otherlv_19= RULE_ID ) ) otherlv_20= '}' )? (otherlv_21= 'Resources' otherlv_22= '{' ( (lv_resources_23_0= ruleAsset ) )+ otherlv_24= '}' )? otherlv_25= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3687:2: ( (lv_id_0_0= RULE_INT ) )? (otherlv_1= 'ServiceProvider' | otherlv_2= 'Group' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'AssignTo' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )+ otherlv_10= '}' )? (otherlv_11= 'OutsourceFrom' otherlv_12= '{' ( (otherlv_13= RULE_ID ) )+ otherlv_14= '}' )? otherlv_15= 'TeamService' ( (otherlv_16= RULE_ID ) ) (otherlv_17= 'GovernanceStrategy' otherlv_18= '{' ( (otherlv_19= RULE_ID ) ) otherlv_20= '}' )? (otherlv_21= 'Resources' otherlv_22= '{' ( (lv_resources_23_0= ruleAsset ) )+ otherlv_24= '}' )? otherlv_25= '}'
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3687:2: ( (lv_id_0_0= RULE_INT ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==RULE_INT) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3688:1: (lv_id_0_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3688:1: (lv_id_0_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3689:3: lv_id_0_0= RULE_INT
                    {
                    lv_id_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleServiceProvider7872); 

                    			newLeafNode(lv_id_0_0, grammarAccess.getServiceProviderAccess().getIdINTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_0_0, 
                            		"INT");
                    	    

                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3705:3: (otherlv_1= 'ServiceProvider' | otherlv_2= 'Group' )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==111) ) {
                alt87=1;
            }
            else if ( (LA87_0==112) ) {
                alt87=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3705:5: otherlv_1= 'ServiceProvider'
                    {
                    otherlv_1=(Token)match(input,111,FOLLOW_111_in_ruleServiceProvider7891); 

                        	newLeafNode(otherlv_1, grammarAccess.getServiceProviderAccess().getServiceProviderKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3710:7: otherlv_2= 'Group'
                    {
                    otherlv_2=(Token)match(input,112,FOLLOW_112_in_ruleServiceProvider7909); 

                        	newLeafNode(otherlv_2, grammarAccess.getServiceProviderAccess().getGroupKeyword_1_1());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3714:2: ( (lv_name_3_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3715:1: (lv_name_3_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3715:1: (lv_name_3_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3716:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider7927); 

            			newLeafNode(lv_name_3_0, grammarAccess.getServiceProviderAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceProviderRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,36,FOLLOW_36_in_ruleServiceProvider7944); 

                	newLeafNode(otherlv_4, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_3());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3736:1: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==13) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3736:3: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleServiceProvider7957); 

                        	newLeafNode(otherlv_5, grammarAccess.getServiceProviderAccess().getDescriptionKeyword_4_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3740:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3741:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3741:1: (lv_description_6_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3742:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleServiceProvider7974); 

                    			newLeafNode(lv_description_6_0, grammarAccess.getServiceProviderAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3758:4: (otherlv_7= 'AssignTo' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )+ otherlv_10= '}' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==87) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3758:6: otherlv_7= 'AssignTo' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )+ otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,87,FOLLOW_87_in_ruleServiceProvider7994); 

                        	newLeafNode(otherlv_7, grammarAccess.getServiceProviderAccess().getAssignToKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,36,FOLLOW_36_in_ruleServiceProvider8006); 

                        	newLeafNode(otherlv_8, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3766:1: ( (otherlv_9= RULE_ID ) )+
                    int cnt89=0;
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==RULE_ID) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3767:1: (otherlv_9= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3767:1: (otherlv_9= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3768:3: otherlv_9= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	    	        }
                    	            
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider8026); 

                    	    		newLeafNode(otherlv_9, grammarAccess.getServiceProviderAccess().getAssignToServiceProviderCrossReference_5_2_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt89 >= 1 ) break loop89;
                                EarlyExitException eee =
                                    new EarlyExitException(89, input);
                                throw eee;
                        }
                        cnt89++;
                    } while (true);

                    otherlv_10=(Token)match(input,37,FOLLOW_37_in_ruleServiceProvider8039); 

                        	newLeafNode(otherlv_10, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_5_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3783:3: (otherlv_11= 'OutsourceFrom' otherlv_12= '{' ( (otherlv_13= RULE_ID ) )+ otherlv_14= '}' )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==113) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3783:5: otherlv_11= 'OutsourceFrom' otherlv_12= '{' ( (otherlv_13= RULE_ID ) )+ otherlv_14= '}'
                    {
                    otherlv_11=(Token)match(input,113,FOLLOW_113_in_ruleServiceProvider8054); 

                        	newLeafNode(otherlv_11, grammarAccess.getServiceProviderAccess().getOutsourceFromKeyword_6_0());
                        
                    otherlv_12=(Token)match(input,36,FOLLOW_36_in_ruleServiceProvider8066); 

                        	newLeafNode(otherlv_12, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3791:1: ( (otherlv_13= RULE_ID ) )+
                    int cnt91=0;
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( (LA91_0==RULE_ID) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3792:1: (otherlv_13= RULE_ID )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3792:1: (otherlv_13= RULE_ID )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3793:3: otherlv_13= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	    	        }
                    	            
                    	    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider8086); 

                    	    		newLeafNode(otherlv_13, grammarAccess.getServiceProviderAccess().getOutsourceFromServiceProviderCrossReference_6_2_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt91 >= 1 ) break loop91;
                                EarlyExitException eee =
                                    new EarlyExitException(91, input);
                                throw eee;
                        }
                        cnt91++;
                    } while (true);

                    otherlv_14=(Token)match(input,37,FOLLOW_37_in_ruleServiceProvider8099); 

                        	newLeafNode(otherlv_14, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_6_3());
                        

                    }
                    break;

            }

            otherlv_15=(Token)match(input,114,FOLLOW_114_in_ruleServiceProvider8113); 

                	newLeafNode(otherlv_15, grammarAccess.getServiceProviderAccess().getTeamServiceKeyword_7());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3812:1: ( (otherlv_16= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3813:1: (otherlv_16= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3813:1: (otherlv_16= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3814:3: otherlv_16= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceProviderRule());
            	        }
                    
            otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider8133); 

            		newLeafNode(otherlv_16, grammarAccess.getServiceProviderAccess().getTeamServiceServiceCrossReference_8_0()); 
            	

            }


            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3825:2: (otherlv_17= 'GovernanceStrategy' otherlv_18= '{' ( (otherlv_19= RULE_ID ) ) otherlv_20= '}' )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==73) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3825:4: otherlv_17= 'GovernanceStrategy' otherlv_18= '{' ( (otherlv_19= RULE_ID ) ) otherlv_20= '}'
                    {
                    otherlv_17=(Token)match(input,73,FOLLOW_73_in_ruleServiceProvider8146); 

                        	newLeafNode(otherlv_17, grammarAccess.getServiceProviderAccess().getGovernanceStrategyKeyword_9_0());
                        
                    otherlv_18=(Token)match(input,36,FOLLOW_36_in_ruleServiceProvider8158); 

                        	newLeafNode(otherlv_18, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3833:1: ( (otherlv_19= RULE_ID ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3834:1: (otherlv_19= RULE_ID )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3834:1: (otherlv_19= RULE_ID )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3835:3: otherlv_19= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceProviderRule());
                    	        }
                            
                    otherlv_19=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceProvider8178); 

                    		newLeafNode(otherlv_19, grammarAccess.getServiceProviderAccess().getGovernanceStrategyGovernanceStrategyCrossReference_9_2_0()); 
                    	

                    }


                    }

                    otherlv_20=(Token)match(input,37,FOLLOW_37_in_ruleServiceProvider8190); 

                        	newLeafNode(otherlv_20, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_9_3());
                        

                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3850:3: (otherlv_21= 'Resources' otherlv_22= '{' ( (lv_resources_23_0= ruleAsset ) )+ otherlv_24= '}' )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==115) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3850:5: otherlv_21= 'Resources' otherlv_22= '{' ( (lv_resources_23_0= ruleAsset ) )+ otherlv_24= '}'
                    {
                    otherlv_21=(Token)match(input,115,FOLLOW_115_in_ruleServiceProvider8205); 

                        	newLeafNode(otherlv_21, grammarAccess.getServiceProviderAccess().getResourcesKeyword_10_0());
                        
                    otherlv_22=(Token)match(input,36,FOLLOW_36_in_ruleServiceProvider8217); 

                        	newLeafNode(otherlv_22, grammarAccess.getServiceProviderAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3858:1: ( (lv_resources_23_0= ruleAsset ) )+
                    int cnt94=0;
                    loop94:
                    do {
                        int alt94=2;
                        int LA94_0 = input.LA(1);

                        if ( (LA94_0==RULE_INT||LA94_0==116) ) {
                            alt94=1;
                        }


                        switch (alt94) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3859:1: (lv_resources_23_0= ruleAsset )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3859:1: (lv_resources_23_0= ruleAsset )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3860:3: lv_resources_23_0= ruleAsset
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getServiceProviderAccess().getResourcesAssetParserRuleCall_10_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAsset_in_ruleServiceProvider8238);
                    	    lv_resources_23_0=ruleAsset();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getServiceProviderRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"resources",
                    	            		lv_resources_23_0, 
                    	            		"Asset");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt94 >= 1 ) break loop94;
                                EarlyExitException eee =
                                    new EarlyExitException(94, input);
                                throw eee;
                        }
                        cnt94++;
                    } while (true);

                    otherlv_24=(Token)match(input,37,FOLLOW_37_in_ruleServiceProvider8251); 

                        	newLeafNode(otherlv_24, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_10_3());
                        

                    }
                    break;

            }

            otherlv_25=(Token)match(input,37,FOLLOW_37_in_ruleServiceProvider8265); 

                	newLeafNode(otherlv_25, grammarAccess.getServiceProviderAccess().getRightCurlyBracketKeyword_11());
                

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
    // $ANTLR end "ruleServiceProvider"


    // $ANTLR start "entryRuleAsset"
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3892:1: entryRuleAsset returns [EObject current=null] : iv_ruleAsset= ruleAsset EOF ;
    public final EObject entryRuleAsset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsset = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3893:2: (iv_ruleAsset= ruleAsset EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3894:2: iv_ruleAsset= ruleAsset EOF
            {
             newCompositeNode(grammarAccess.getAssetRule()); 
            pushFollow(FOLLOW_ruleAsset_in_entryRuleAsset8301);
            iv_ruleAsset=ruleAsset();

            state._fsp--;

             current =iv_ruleAsset; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAsset8311); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3901:1: ruleAsset returns [EObject current=null] : ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'Resource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'SkillSet' otherlv_7= '{' ( (lv_skillSet_8_0= ruleSkill ) )+ otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleAsset() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_skillSet_8_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3904:28: ( ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'Resource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'SkillSet' otherlv_7= '{' ( (lv_skillSet_8_0= ruleSkill ) )+ otherlv_9= '}' )? otherlv_10= '}' ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3905:1: ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'Resource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'SkillSet' otherlv_7= '{' ( (lv_skillSet_8_0= ruleSkill ) )+ otherlv_9= '}' )? otherlv_10= '}' )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3905:1: ( ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'Resource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'SkillSet' otherlv_7= '{' ( (lv_skillSet_8_0= ruleSkill ) )+ otherlv_9= '}' )? otherlv_10= '}' )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3905:2: ( (lv_id_0_0= RULE_INT ) )? otherlv_1= 'Resource' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'SkillSet' otherlv_7= '{' ( (lv_skillSet_8_0= ruleSkill ) )+ otherlv_9= '}' )? otherlv_10= '}'
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3905:2: ( (lv_id_0_0= RULE_INT ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==RULE_INT) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3906:1: (lv_id_0_0= RULE_INT )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3906:1: (lv_id_0_0= RULE_INT )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3907:3: lv_id_0_0= RULE_INT
                    {
                    lv_id_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAsset8353); 

                    			newLeafNode(lv_id_0_0, grammarAccess.getAssetAccess().getIdINTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssetRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_0_0, 
                            		"INT");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,116,FOLLOW_116_in_ruleAsset8371); 

                	newLeafNode(otherlv_1, grammarAccess.getAssetAccess().getResourceKeyword_1());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3927:1: ( (lv_name_2_0= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3928:1: (lv_name_2_0= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3928:1: (lv_name_2_0= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3929:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAsset8388); 

            			newLeafNode(lv_name_2_0, grammarAccess.getAssetAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAssetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleAsset8405); 

                	newLeafNode(otherlv_3, grammarAccess.getAssetAccess().getLeftCurlyBracketKeyword_3());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3949:1: (otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==13) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3949:3: otherlv_4= 'Description' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleAsset8418); 

                        	newLeafNode(otherlv_4, grammarAccess.getAssetAccess().getDescriptionKeyword_4_0());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3953:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3954:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3954:1: (lv_description_5_0= RULE_STRING )
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3955:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAsset8435); 

                    			newLeafNode(lv_description_5_0, grammarAccess.getAssetAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssetRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3971:4: (otherlv_6= 'SkillSet' otherlv_7= '{' ( (lv_skillSet_8_0= ruleSkill ) )+ otherlv_9= '}' )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==117) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3971:6: otherlv_6= 'SkillSet' otherlv_7= '{' ( (lv_skillSet_8_0= ruleSkill ) )+ otherlv_9= '}'
                    {
                    otherlv_6=(Token)match(input,117,FOLLOW_117_in_ruleAsset8455); 

                        	newLeafNode(otherlv_6, grammarAccess.getAssetAccess().getSkillSetKeyword_5_0());
                        
                    otherlv_7=(Token)match(input,36,FOLLOW_36_in_ruleAsset8467); 

                        	newLeafNode(otherlv_7, grammarAccess.getAssetAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3979:1: ( (lv_skillSet_8_0= ruleSkill ) )+
                    int cnt98=0;
                    loop98:
                    do {
                        int alt98=2;
                        int LA98_0 = input.LA(1);

                        if ( (LA98_0==110) ) {
                            alt98=1;
                        }


                        switch (alt98) {
                    	case 1 :
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3980:1: (lv_skillSet_8_0= ruleSkill )
                    	    {
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3980:1: (lv_skillSet_8_0= ruleSkill )
                    	    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:3981:3: lv_skillSet_8_0= ruleSkill
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssetAccess().getSkillSetSkillParserRuleCall_5_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSkill_in_ruleAsset8488);
                    	    lv_skillSet_8_0=ruleSkill();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAssetRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"skillSet",
                    	            		lv_skillSet_8_0, 
                    	            		"Skill");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt98 >= 1 ) break loop98;
                                EarlyExitException eee =
                                    new EarlyExitException(98, input);
                                throw eee;
                        }
                        cnt98++;
                    } while (true);

                    otherlv_9=(Token)match(input,37,FOLLOW_37_in_ruleAsset8501); 

                        	newLeafNode(otherlv_9, grammarAccess.getAssetAccess().getRightCurlyBracketKeyword_5_3());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,37,FOLLOW_37_in_ruleAsset8515); 

                	newLeafNode(otherlv_10, grammarAccess.getAssetAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4013:1: entryRuleSkill returns [EObject current=null] : iv_ruleSkill= ruleSkill EOF ;
    public final EObject entryRuleSkill() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkill = null;


        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4014:2: (iv_ruleSkill= ruleSkill EOF )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4015:2: iv_ruleSkill= ruleSkill EOF
            {
             newCompositeNode(grammarAccess.getSkillRule()); 
            pushFollow(FOLLOW_ruleSkill_in_entryRuleSkill8551);
            iv_ruleSkill=ruleSkill();

            state._fsp--;

             current =iv_ruleSkill; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSkill8561); 

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
    // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4022:1: ruleSkill returns [EObject current=null] : (otherlv_0= 'Service' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Efficiency' ( (lv_efficiency_3_0= ruleNumExpression ) ) ) ;
    public final EObject ruleSkill() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_efficiency_3_0 = null;


         enterRule(); 
            
        try {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4025:28: ( (otherlv_0= 'Service' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Efficiency' ( (lv_efficiency_3_0= ruleNumExpression ) ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4026:1: (otherlv_0= 'Service' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Efficiency' ( (lv_efficiency_3_0= ruleNumExpression ) ) )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4026:1: (otherlv_0= 'Service' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Efficiency' ( (lv_efficiency_3_0= ruleNumExpression ) ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4026:3: otherlv_0= 'Service' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'Efficiency' ( (lv_efficiency_3_0= ruleNumExpression ) )
            {
            otherlv_0=(Token)match(input,110,FOLLOW_110_in_ruleSkill8598); 

                	newLeafNode(otherlv_0, grammarAccess.getSkillAccess().getServiceKeyword_0());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4030:1: ( (otherlv_1= RULE_ID ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4031:1: (otherlv_1= RULE_ID )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4031:1: (otherlv_1= RULE_ID )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4032:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSkillRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSkill8618); 

            		newLeafNode(otherlv_1, grammarAccess.getSkillAccess().getServiceServiceCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,118,FOLLOW_118_in_ruleSkill8630); 

                	newLeafNode(otherlv_2, grammarAccess.getSkillAccess().getEfficiencyKeyword_2());
                
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4047:1: ( (lv_efficiency_3_0= ruleNumExpression ) )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4048:1: (lv_efficiency_3_0= ruleNumExpression )
            {
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4048:1: (lv_efficiency_3_0= ruleNumExpression )
            // ../datasem.xtext.kanban.domainmodel/src-gen/datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.g:4049:3: lv_efficiency_3_0= ruleNumExpression
            {
             
            	        newCompositeNode(grammarAccess.getSkillAccess().getEfficiencyNumExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleNumExpression_in_ruleSkill8651);
            lv_efficiency_3_0=ruleNumExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSkillRule());
            	        }
                   		set(
                   			current, 
                   			"efficiency",
                    		lv_efficiency_3_0, 
                    		"NumExpression");
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
    // $ANTLR end "ruleSkill"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModelBuilder_in_entryRuleModelBuilder75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelBuilder85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleModelBuilder122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModelBuilder139 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleModelBuilder156 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleModelBuilder173 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleSystemLibraries_in_ruleModelBuilder199 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_ruleUserLibraries_in_ruleModelBuilder220 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleExperimentModel_in_ruleModelBuilder241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExperimentModel_in_entryRuleExperimentModel277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExperimentModel287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleExperimentModel324 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExperimentModel341 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleExperimentModel359 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleExperimentModel380 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleExperimentModel394 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleExperimentModel406 = new BitSet(new long[]{0x0000000000000040L,0x0001800000000000L});
    public static final BitSet FOLLOW_ruleServiceProvider_in_ruleExperimentModel427 = new BitSet(new long[]{0x0000000000040040L,0x0001800000000000L});
    public static final BitSet FOLLOW_18_in_ruleExperimentModel440 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleExperimentModel452 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleExperimentModel464 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleExperimentModel476 = new BitSet(new long[]{0x0000000000000040L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleWorkSource_in_ruleExperimentModel497 = new BitSet(new long[]{0x0000000000400040L,0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleExperimentModel510 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleExperimentModel522 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleWorkItemNetwork_in_ruleExperimentModel543 = new BitSet(new long[]{0x0000000001000040L,0x0000000000000040L});
    public static final BitSet FOLLOW_24_in_ruleExperimentModel556 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleExperimentModel568 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleExperimentModel580 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleWINReplicationSetting_in_ruleExperimentModel601 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleIndicators_in_ruleExperimentModel622 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleExperimentModel634 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleExperimentModel646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemLibraries_in_entryRuleSystemLibraries682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystemLibraries692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleSystemLibraries729 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleSystemLibraries741 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleEventType_in_ruleSystemLibraries762 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_31_in_ruleSystemLibraries775 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleSystemLibraries787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleConditionType_in_ruleSystemLibraries808 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_33_in_ruleSystemLibraries821 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleSystemLibraries833 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleSystemLibraries845 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleSystemLibraries857 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleWIAcceptanceRuleType_in_ruleSystemLibraries878 = new BitSet(new long[]{0x0000002000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_37_in_ruleSystemLibraries891 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleSystemLibraries903 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleSystemLibraries915 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleWISelectionRuleType_in_ruleSystemLibraries936 = new BitSet(new long[]{0x0000002000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_37_in_ruleSystemLibraries949 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleSystemLibraries961 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleSystemLibraries973 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleWIAssignmentRuleType_in_ruleSystemLibraries994 = new BitSet(new long[]{0x0000002000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_37_in_ruleSystemLibraries1007 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleSystemLibraries1019 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleSystemLibraries1031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleResourceAllocationRuleType_in_ruleSystemLibraries1052 = new BitSet(new long[]{0x0000002000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_37_in_ruleSystemLibraries1065 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleSystemLibraries1077 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleSystemLibraries1089 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleResourceOutsourcingRuleType_in_ruleSystemLibraries1110 = new BitSet(new long[]{0x0000002000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_37_in_ruleSystemLibraries1123 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleSystemLibraries1135 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleSystemLibraries1147 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleSystemLibraries1159 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_ruleProcessModel_in_ruleSystemLibraries1180 = new BitSet(new long[]{0x0000200000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_45_in_ruleSystemLibraries1193 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleSystemLibraries1205 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_ruleValueFunction_in_ruleSystemLibraries1226 = new BitSet(new long[]{0x0000800000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_47_in_ruleSystemLibraries1239 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleSystemLibraries1251 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleSystemLibraries1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserLibraries_in_entryRuleUserLibraries1299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserLibraries1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleUserLibraries1346 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleUserLibraries1358 = new BitSet(new long[]{0x0000000000000040L,0x0000010000000000L});
    public static final BitSet FOLLOW_ruleWorkItemType_in_ruleUserLibraries1379 = new BitSet(new long[]{0x0010000000000040L,0x0000010000000000L});
    public static final BitSet FOLLOW_52_in_ruleUserLibraries1392 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleUserLibraries1404 = new BitSet(new long[]{0x0000000000000040L,0x0000000200000000L});
    public static final BitSet FOLLOW_ruleClassOfService_in_ruleUserLibraries1425 = new BitSet(new long[]{0x0040000000000040L,0x0000000200000000L});
    public static final BitSet FOLLOW_54_in_ruleUserLibraries1438 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleUserLibraries1450 = new BitSet(new long[]{0x0000000000000040L,0x0000400000000000L});
    public static final BitSet FOLLOW_ruleService_in_ruleUserLibraries1471 = new BitSet(new long[]{0x0100000000000040L,0x0000400000000000L});
    public static final BitSet FOLLOW_56_in_ruleUserLibraries1484 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleUserLibraries1496 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleGovernanceStrategy_in_ruleUserLibraries1517 = new BitSet(new long[]{0x0400000000000040L,0x0000000000000200L});
    public static final BitSet FOLLOW_58_in_ruleUserLibraries1530 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleUserLibraries1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1630 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleQualifiedName1649 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1664 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleQualifiedName1685 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleQualifiedName1700 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_ruleNumExpression_in_entryRuleNumExpression1747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumExpression1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleNumExpression1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleNumExpression1829 = new BitSet(new long[]{0xC000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleDistribution_in_ruleNumExpression1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleParameter1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleParameter1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleParameter2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter2030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDistribution_in_entryRuleDistribution2075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDistribution2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleDistribution2129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleDistribution2166 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleDistribution2203 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleDistribution2229 = new BitSet(new long[]{0x00000000000000F0L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleDistribution2250 = new BitSet(new long[]{0x00000000000000F0L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleDistribution2263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventType_in_entryRuleEventType2299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventType2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleEventType2346 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventType2363 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEventType2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionType_in_entryRuleConditionType2427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionType2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleConditionType2474 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConditionType2491 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConditionType2513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWINReplicationSetting_in_entryRuleWINReplicationSetting2559 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWINReplicationSetting2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleWINReplicationSetting2606 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleWINReplicationSetting2618 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleWINReplication_in_ruleWINReplicationSetting2639 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_37_in_ruleWINReplicationSetting2652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWINReplication_in_entryRuleWINReplication2688 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWINReplication2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleWINReplication2735 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWINReplication2755 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleWINReplication2767 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWINReplication2784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndicators_in_entryRuleIndicators2825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndicators2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleIndicators2872 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleIndicators2884 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndicators2901 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_37_in_ruleIndicators2919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGovernanceStrategy_in_entryRuleGovernanceStrategy2955 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGovernanceStrategy2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleGovernanceStrategy3007 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ruleGovernanceStrategy3025 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGovernanceStrategy3042 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleGovernanceStrategy3059 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_13_in_ruleGovernanceStrategy3072 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGovernanceStrategy3089 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleWIAcceptance_in_ruleGovernanceStrategy3118 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleWISelection_in_ruleGovernanceStrategy3139 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleWIAssignment_in_ruleGovernanceStrategy3160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleResourceAllocation_in_ruleGovernanceStrategy3181 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleResourceOutsourcing_in_ruleGovernanceStrategy3202 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleGovernanceStrategy3216 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleGovernanceStrategy3228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ruleMechanism_in_ruleGovernanceStrategy3249 = new BitSet(new long[]{0x0000002000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_37_in_ruleGovernanceStrategy3262 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleGovernanceStrategy3274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWIAcceptance_in_entryRuleWIAcceptance3310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWIAcceptance3320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleWIAcceptance3357 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWIAcceptance3377 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleWIAcceptance3389 = new BitSet(new long[]{0x0000002000002000L,0x0000000000003000L});
    public static final BitSet FOLLOW_13_in_ruleWIAcceptance3402 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWIAcceptance3419 = new BitSet(new long[]{0x0000002000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_76_in_ruleWIAcceptance3439 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWIAcceptance3456 = new BitSet(new long[]{0x0000002000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleWIAcceptance3476 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWIAcceptance3493 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleWIAcceptance3512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWISelection_in_entryRuleWISelection3548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWISelection3558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleWISelection3595 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWISelection3615 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleWISelection3627 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_13_in_ruleWISelection3640 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWISelection3657 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleWISelection3676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWIAssignment_in_entryRuleWIAssignment3712 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWIAssignment3722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleWIAssignment3759 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWIAssignment3779 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleWIAssignment3791 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_13_in_ruleWIAssignment3804 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWIAssignment3821 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleWIAssignment3840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceAllocation_in_entryRuleResourceAllocation3876 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceAllocation3886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleResourceAllocation3923 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResourceAllocation3943 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleResourceAllocation3955 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_13_in_ruleResourceAllocation3968 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceAllocation3985 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleResourceAllocation4004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceOutsourcing_in_entryRuleResourceOutsourcing4040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceOutsourcing4050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleResourceOutsourcing4087 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResourceOutsourcing4107 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleResourceOutsourcing4119 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_13_in_ruleResourceOutsourcing4132 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceOutsourcing4149 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleResourceOutsourcing4168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWIAcceptanceRuleType_in_entryRuleWIAcceptanceRuleType4204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWIAcceptanceRuleType4214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleWIAcceptanceRuleType4251 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWIAcceptanceRuleType4268 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleWIAcceptanceRuleType4285 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_13_in_ruleWIAcceptanceRuleType4298 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWIAcceptanceRuleType4315 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleWIAcceptanceRuleType4334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWISelectionRuleType_in_entryRuleWISelectionRuleType4370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWISelectionRuleType4380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleWISelectionRuleType4417 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWISelectionRuleType4434 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleWISelectionRuleType4451 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_13_in_ruleWISelectionRuleType4464 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWISelectionRuleType4481 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleWISelectionRuleType4500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWIAssignmentRuleType_in_entryRuleWIAssignmentRuleType4536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWIAssignmentRuleType4546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleWIAssignmentRuleType4583 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWIAssignmentRuleType4600 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleWIAssignmentRuleType4617 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_13_in_ruleWIAssignmentRuleType4630 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWIAssignmentRuleType4647 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleWIAssignmentRuleType4666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceAllocationRuleType_in_entryRuleResourceAllocationRuleType4702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceAllocationRuleType4712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleResourceAllocationRuleType4749 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResourceAllocationRuleType4766 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleResourceAllocationRuleType4783 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_13_in_ruleResourceAllocationRuleType4796 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceAllocationRuleType4813 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleResourceAllocationRuleType4832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceOutsourcingRuleType_in_entryRuleResourceOutsourcingRuleType4868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceOutsourcingRuleType4878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleResourceOutsourcingRuleType4915 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResourceOutsourcingRuleType4932 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleResourceOutsourcingRuleType4949 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_13_in_ruleResourceOutsourcingRuleType4962 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceOutsourcingRuleType4979 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleResourceOutsourcingRuleType4998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMechanism_in_entryRuleMechanism5034 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMechanism5044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleMechanism5081 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMechanism5098 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_ruleMechanism5115 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleMechanism5136 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleMechanism5148 = new BitSet(new long[]{0x0000002000002000L,0x0000000000200000L});
    public static final BitSet FOLLOW_13_in_ruleMechanism5161 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMechanism5178 = new BitSet(new long[]{0x0000002000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_ruleMechanism5198 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleMechanism5210 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleMechanismAttribute_in_ruleMechanism5231 = new BitSet(new long[]{0x0000002000000020L});
    public static final BitSet FOLLOW_37_in_ruleMechanism5244 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleMechanism5258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMechanismAttribute_in_entryRuleMechanismAttribute5294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMechanismAttribute5304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMechanismAttribute5346 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_ruleMechanismAttribute5363 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleMechanismAttribute5384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkSource_in_entryRuleWorkSource5420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkSource5430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWorkSource5472 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_ruleWorkSource5490 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkSource5507 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleWorkSource5524 = new BitSet(new long[]{0x0000002000002000L,0x0000000000808000L});
    public static final BitSet FOLLOW_13_in_ruleWorkSource5537 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWorkSource5554 = new BitSet(new long[]{0x0000002000000000L,0x0000000000808000L});
    public static final BitSet FOLLOW_87_in_ruleWorkSource5574 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleWorkSource5586 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkSource5606 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_37_in_ruleWorkSource5619 = new BitSet(new long[]{0x0000002000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleWIAssignment_in_ruleWorkSource5642 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleWorkSource5655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkItemNetwork_in_entryRuleWorkItemNetwork5691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkItemNetwork5701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWorkItemNetwork5743 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleWorkItemNetwork5761 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItemNetwork5778 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleWorkItemNetwork5795 = new BitSet(new long[]{0x0000000000002000L,0x0000000001000000L});
    public static final BitSet FOLLOW_13_in_ruleWorkItemNetwork5808 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWorkItemNetwork5825 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_ruleWorkItemNetwork5844 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleWorkItemNetwork5856 = new BitSet(new long[]{0x0000000000000040L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleWorkItem_in_ruleWorkItemNetwork5877 = new BitSet(new long[]{0x0000002000000040L,0x0000000002000000L});
    public static final BitSet FOLLOW_37_in_ruleWorkItemNetwork5890 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleWorkItemNetwork5902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkItem_in_entryRuleWorkItem5938 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkItem5948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWorkItem5990 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_ruleWorkItem6008 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem6025 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleWorkItem6042 = new BitSet(new long[]{0x0000002000002000L,0x000000007C000000L});
    public static final BitSet FOLLOW_13_in_ruleWorkItem6055 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWorkItem6072 = new BitSet(new long[]{0x0000002000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_90_in_ruleWorkItem6092 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem6112 = new BitSet(new long[]{0x0000002000000000L,0x0000000078000000L});
    public static final BitSet FOLLOW_91_in_ruleWorkItem6133 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleWorkItem6158 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem6178 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_37_in_ruleWorkItem6191 = new BitSet(new long[]{0x0000002000000000L,0x0000000070000000L});
    public static final BitSet FOLLOW_92_in_ruleWorkItem6212 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleWorkItem6237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem6257 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_37_in_ruleWorkItem6270 = new BitSet(new long[]{0x0000002000000000L,0x0000000060000000L});
    public static final BitSet FOLLOW_93_in_ruleWorkItem6285 = new BitSet(new long[]{0x0000002000000000L,0x0000003040000000L});
    public static final BitSet FOLLOW_ruleCausalTrigger_in_ruleWorkItem6306 = new BitSet(new long[]{0x0000002000000000L,0x0000003040000000L});
    public static final BitSet FOLLOW_94_in_ruleWorkItem6322 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleWorkItem6334 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem6354 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_37_in_ruleWorkItem6369 = new BitSet(new long[]{0x0000002000000000L,0x0000000F80400000L});
    public static final BitSet FOLLOW_95_in_ruleWorkItem6382 = new BitSet(new long[]{0x2000000000000080L});
    public static final BitSet FOLLOW_ruleNumExpression_in_ruleWorkItem6403 = new BitSet(new long[]{0x0000002000000000L,0x0000000F00400000L});
    public static final BitSet FOLLOW_96_in_ruleWorkItem6418 = new BitSet(new long[]{0x2000000000000080L});
    public static final BitSet FOLLOW_ruleNumExpression_in_ruleWorkItem6439 = new BitSet(new long[]{0x0000002000000000L,0x0000000E00400000L});
    public static final BitSet FOLLOW_97_in_ruleWorkItem6454 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem6474 = new BitSet(new long[]{0x0000002000000000L,0x0000000C00400000L});
    public static final BitSet FOLLOW_86_in_ruleWorkItem6489 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItem6509 = new BitSet(new long[]{0x0000002000000000L,0x0000000C00000000L});
    public static final BitSet FOLLOW_98_in_ruleWorkItem6524 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWorkItem6541 = new BitSet(new long[]{0x0000002000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_ruleWorkItem6561 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWorkItem6578 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleWorkItem6597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCausalTrigger_in_entryRuleCausalTrigger6633 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCausalTrigger6643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleCausalTrigger6681 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_101_in_ruleCausalTrigger6699 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleCausalTrigger6712 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCausalTrigger6732 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_37_in_ruleCausalTrigger6745 = new BitSet(new long[]{0x0000000000000002L,0x000000C000000000L});
    public static final BitSet FOLLOW_102_in_ruleCausalTrigger6758 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleCausalTrigger6775 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_ruleCausalTrigger6795 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleCausalTrigger6812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkItemType_in_entryRuleWorkItemType6855 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkItemType6865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWorkItemType6907 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_ruleWorkItemType6925 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkItemType6942 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleWorkItemType6959 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_13_in_ruleWorkItemType6972 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWorkItemType6989 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleWorkItemType7008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueFunction_in_entryRuleValueFunction7044 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueFunction7054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleValueFunction7091 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValueFunction7108 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleValueFunction7125 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_13_in_ruleValueFunction7138 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValueFunction7155 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleValueFunction7174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessModel_in_entryRuleProcessModel7210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessModel7220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleProcessModel7257 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcessModel7274 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleProcessModel7291 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_13_in_ruleProcessModel7304 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProcessModel7321 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleProcessModel7340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOfService_in_entryRuleClassOfService7376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassOfService7386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleClassOfService7428 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_ruleClassOfService7446 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassOfService7463 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleClassOfService7480 = new BitSet(new long[]{0x0000000000002000L,0x0000080000000000L});
    public static final BitSet FOLLOW_13_in_ruleClassOfService7493 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassOfService7510 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_ruleClassOfService7529 = new BitSet(new long[]{0x0000000000000000L,0x0000300000000000L});
    public static final BitSet FOLLOW_108_in_ruleClassOfService7548 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_109_in_ruleClassOfService7579 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleClassOfService7592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService7628 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService7638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleService7680 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_ruleService7698 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService7715 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleService7733 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_13_in_ruleService7746 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleService7763 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleService7782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceProvider_in_entryRuleServiceProvider7820 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceProvider7830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleServiceProvider7872 = new BitSet(new long[]{0x0000000000000000L,0x0001800000000000L});
    public static final BitSet FOLLOW_111_in_ruleServiceProvider7891 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_112_in_ruleServiceProvider7909 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider7927 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleServiceProvider7944 = new BitSet(new long[]{0x0000000000002000L,0x0006000000800000L});
    public static final BitSet FOLLOW_13_in_ruleServiceProvider7957 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleServiceProvider7974 = new BitSet(new long[]{0x0000000000000000L,0x0006000000800000L});
    public static final BitSet FOLLOW_87_in_ruleServiceProvider7994 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleServiceProvider8006 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider8026 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_37_in_ruleServiceProvider8039 = new BitSet(new long[]{0x0000000000000000L,0x0006000000000000L});
    public static final BitSet FOLLOW_113_in_ruleServiceProvider8054 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleServiceProvider8066 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider8086 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_37_in_ruleServiceProvider8099 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_ruleServiceProvider8113 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider8133 = new BitSet(new long[]{0x0000002000000000L,0x0008000000000200L});
    public static final BitSet FOLLOW_73_in_ruleServiceProvider8146 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleServiceProvider8158 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceProvider8178 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleServiceProvider8190 = new BitSet(new long[]{0x0000002000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_ruleServiceProvider8205 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleServiceProvider8217 = new BitSet(new long[]{0x0000000000000040L,0x0010000000000000L});
    public static final BitSet FOLLOW_ruleAsset_in_ruleServiceProvider8238 = new BitSet(new long[]{0x0000002000000040L,0x0010000000000000L});
    public static final BitSet FOLLOW_37_in_ruleServiceProvider8251 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleServiceProvider8265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_entryRuleAsset8301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAsset8311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAsset8353 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_ruleAsset8371 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAsset8388 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleAsset8405 = new BitSet(new long[]{0x0000002000002000L,0x0020000000000000L});
    public static final BitSet FOLLOW_13_in_ruleAsset8418 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAsset8435 = new BitSet(new long[]{0x0000002000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_ruleAsset8455 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleAsset8467 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_ruleSkill_in_ruleAsset8488 = new BitSet(new long[]{0x0000002000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_37_in_ruleAsset8501 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleAsset8515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkill_in_entryRuleSkill8551 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSkill8561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_ruleSkill8598 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSkill8618 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_ruleSkill8630 = new BitSet(new long[]{0x2000000000000080L});
    public static final BitSet FOLLOW_ruleNumExpression_in_ruleSkill8651 = new BitSet(new long[]{0x0000000000000002L});

}